package com.moseeker.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.TSerializer;
import org.apache.thrift.protocol.TSimpleJSONProtocol;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;

/**
 * 
 * 利用反射的方式，对于get,set方法去除"get"和"set"剔除后相同,并且数据类型相同，
 * 进行值传递。比如被复制的方法存在getId返回int，存在复制对象存在setId(int id)，
 * 则调用被复制对象的的getId()拿到值作为参数，调用复制对象的setId(int id)。 利用这种方式进行类复制。
 * <p>
 * Company: MoSeeker
 * </P>
 * <p>
 * date: Apr 21, 2016
 * </p>
 * <p>
 * Email: wjf2255@gmail.com
 * </p>
 * 
 * @author wjf
 * @version
 */
public class BeanUtils {

	private static Logger logger = LoggerFactory.getLogger(BeanUtils.class);

	@SuppressWarnings("rawtypes")
	public static <T extends TBase, R extends UpdatableRecordImpl> UpdatableRecordImpl structToDB(T t, Class<R> origClazz,
			Map<String, String> equalRules) {
		UpdatableRecordImpl orig = null;
		try {
			orig = origClazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("error", e);
		}
		structToDB(t, orig, equalRules);
		return orig;
	}
	
	@SuppressWarnings("rawtypes")
	public static <T extends TBase, R extends UpdatableRecordImpl> R structToDB(T t, Class<R> origClazz) {
		R orig = null;
		try {
			orig = origClazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("error", e);
		}
		structToDB(t, orig, null);
		return orig;
	}

	/**
	 * struct 类和JOOQ类的属性和方法固定，可以预先加载成静态的属性和方法
	 * 
	 * @param dest
	 * @param orig
	 */
	@SuppressWarnings("rawtypes")
	public static <T extends TBase, R extends UpdatableRecordImpl> void structToDB(T dest, R orig, Map<String, String> equalRules) {
		if (dest == null || orig == null) {
			return;
		}
		Field[] descFields = dest.getClass().getFields();
		Method[] destMethods = dest.getClass().getMethods();

		Method[] origMethods = orig.getClass().getMethods();

		int i = 0, j = 0, k = 0;
		if (descFields != null && descFields.length > 0 && destMethods != null && destMethods.length > 0) {
			for (i = 0; i < descFields.length; i++) {
				if (!descFields[i].getName().trim().equals("metaDataMap")) {
					Field field = descFields[i];
					String upperFirst = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
					String getMethodName = "get" + upperFirst;
					for (j = 0; j < destMethods.length; j++) {
						try {
							if (destMethods[j].getName().equals(getMethodName)) {
								/*if (defaultValue(field, destMethods[j], dest)) {
									continue;
								}*/
								Method isSetMethod = dest.getClass().getMethod("isSet" + upperFirst, new Class[] {});
								if ((Boolean) isSetMethod.invoke(dest, new Object[] {})) {
									String origMethodName = buiderRecordMethodName(field.getName(), MethodType.SET,
											equalRules);
									for (k = 0; k < origMethods.length; k++) {
										if (origMethods[k].getName().trim().equals(origMethodName)) {
											Object object = convertTo(destMethods[j].invoke(dest, new Object[] {}),
													origMethods[k].getParameterTypes()[0]);
											origMethods[k].invoke(orig, object);
											break;
										}
									}
								}
								break;
							}
						} catch (NoSuchMethodException | SecurityException | IllegalAccessException
								| IllegalArgumentException | InvocationTargetException e) {
							logger.error("error", e);
						} finally {
							// do nothing
						}
					}
				}
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public static <T extends TBase, R extends UpdatableRecordImpl> TBase DBToStruct(Class<T> destClazz, R orig,
			Map<String, String> equalRules) {
		TBase base = null;
		try {
			base = destClazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("error", e);
		}
		DBToStruct(base, orig, equalRules);
		return base;
	}

	@SuppressWarnings("rawtypes")
	public static <T extends TBase, R extends UpdatableRecordImpl> T DBToStruct(Class<T> destClazz, R orig) {
		T base = null;
		try {
			base = destClazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("error", e);
		}
		DBToStruct(base, orig, null);
		return base;
	}
	
	@SuppressWarnings("rawtypes")
	public static <T extends TBase, R extends UpdatableRecordImpl> List<T> DBToStruct(Class<T> destClazz, List<R> origs) {
		List<T> list = new ArrayList<>();
		
		if(origs != null && origs.size() > 0) {
			list = origs.stream().filter(orig -> orig != null).map(orig -> {
				T t = (T)DBToStruct(destClazz, orig);
				return t;
			}).collect(Collectors.toList());
		}
		
		return list;
	}

	@SuppressWarnings("rawtypes")
	public static <T extends TBase, R extends UpdatableRecordImpl> void DBToStruct(T dest,R orig, Map<String, String> equalRules) {
		if (dest == null || orig == null) {
			return;
		}
		Field[] descFields = dest.getClass().getFields();
		Method[] destMethods = dest.getClass().getMethods();

		Method[] origMethods = orig.getClass().getMethods();

		int i = 0, j = 0, k = 0;
		if (descFields != null && descFields.length > 0 && destMethods != null && destMethods.length > 0) {
			for (i = 0; i < descFields.length; i++) {
				if (!descFields[i].getName().trim().equals("metaDataMap")) {
					Field field = descFields[i];
					String upperFirst = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
					String setMethodName = "set" + upperFirst;
					for (j = 0; j < destMethods.length; j++) {
						try {
							if (destMethods[j].getName().equals(setMethodName)) {
								String origMethodName = buiderRecordMethodName(field.getName(), MethodType.GET,
										equalRules);
								for (k = 0; k < origMethods.length; k++) {
									if (origMethods[k].getName().trim().equals(origMethodName)) {
										Object object = convertTo(origMethods[k].invoke(orig, new Object[] {}),
												destMethods[j].getParameterTypes()[0]);
										destMethods[j].invoke(dest, object);
										break;
									}
								}
								break;
							}
						} catch (SecurityException | IllegalAccessException | IllegalArgumentException
								| InvocationTargetException e) {
							logger.error("error", e);
						} finally {
							// do nothing
						}
					}
				}
			}
		}
	}
	
	public static <R, T> List<T> copies(List<R> dests, Class<T> orig) {
		List<T> list = new ArrayList<>();
		
		if(dests != null && dests.size() > 0) {
			list = dests.stream().map(dest -> {
				T t = null;
				try {
					t = orig.newInstance();
					org.apache.commons.beanutils.BeanUtils.copyProperties(dests, t);
				} catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
					e.printStackTrace();
					logger.error(e.getMessage(), e);
				}
				return t;
			}).filter(t -> t != null).collect(Collectors.toList());
		}
		
		return list;
	}

	public static <T> T MapToRecord(Map<String, Object> map, Class<T> clazz) {
		T t = null;
		Method[] methods = clazz.getMethods();
		if (map != null && methods != null && methods.length > 0 && map.size() > 0) {
			try {
				t = clazz.newInstance();
				for (Entry<String, Object> entry : map.entrySet()) {
					String origMethodName = buiderRecordMethodName(entry.getKey(), MethodType.SET, null);
					for (int i = 0; i < methods.length; i++) {
						if (methods[i].getName().equals(origMethodName)) {
							Object obj = convertTo(entry.getValue(), methods[i].getParameterTypes()[0]);
							if (obj != null) {
								methods[i].invoke(t, obj);
								break;
							}
						}
					}
				}
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				logger.error(e.getMessage(), e);
			} finally {
				// do nothing
			}
		}
		return t;
	}

	private enum MethodType {
		GET, SET;

		@Override
		public String toString() {
			return this.name().toLowerCase();
		}
	}

	private static String buiderRecordMethodName(String name, MethodType methodType, Map<String, String> equalRules) {
		if (name != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(methodType);
			if (equalRules != null && equalRules.containsKey(name)) {
				sb.append(equalRules.get(name).substring(0, 1).toUpperCase());
				sb.append(equalRules.get(name).substring(1));
			} else {
				String[] splitArray = name.split("_");
				if (splitArray.length > 1) {
					for (int i = 0; i < splitArray.length; i++) {
						if(StringUtils.isNullOrEmpty(splitArray[i])) {
							sb.append("_");
						} else {
							sb.append(splitArray[i].substring(0, 1).toUpperCase());
							sb.append(splitArray[i].substring(1));
						}
					}
				} else {
					sb.append(name.substring(0, 1).toUpperCase());
					sb.append(name.substring(1));
				}
			}
			return sb.toString();
		} else {
			return null;
		}
	}

	/**
	 * 
	 * @param value
	 * @param clazzType
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T StringConvertTo(String value, Class<T> clazzType) {
		if (clazzType.isAssignableFrom(String.class)) {
			return (T) value.toString();
		} else if (clazzType.isAssignableFrom(Long.class)) {
			return (T) new Long(value.toString());
		} else if (clazzType.isAssignableFrom(Byte.class)) {
			return (T) new Byte(value.toString());
		} else if (clazzType.isAssignableFrom(Integer.class)) {
			return (T) new Integer(value.toString());
		} else if (clazzType.isAssignableFrom(Float.class)) {
			return (T) new Float(value.toString());
		} else if (clazzType.isAssignableFrom(Float.class)) {
			return (T) new Double(value.toString());
		} else if (clazzType.isAssignableFrom(Boolean.class)) {
			return (T) new Boolean(value.toString());
		} else {
			return (T) value.toString();
		}
	}

	/**
	 * 
	 * @param value
	 * @param clazzType
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T convertTo(Object value, Class<?> clazzType) {
		if (value == null || clazzType == null) {
			return null;
		}
		if (clazzType.isAssignableFrom(String.class)) {
			return (T) converToString(value);
		} else if (clazzType.isAssignableFrom(Long.class) || clazzType.isAssignableFrom(long.class)) {
			return (T) converToLong(value);
		} else if (clazzType.isAssignableFrom(Byte.class) || clazzType.isAssignableFrom(byte.class)) {
			return (T) converToByte(value);
		} else if (clazzType.isAssignableFrom(Integer.class) || clazzType.isAssignableFrom(int.class)) {
			return (T) converToInteger(value);
		} else if (clazzType.isAssignableFrom(Float.class) || clazzType.isAssignableFrom(float.class)) {
			return (T) converToFloat(value);
		} else if (clazzType.isAssignableFrom(Double.class) || clazzType.isAssignableFrom(double.class)) {
			return (T) converToDouble(value);
		} else if (clazzType.isAssignableFrom(Boolean.class) || clazzType.isAssignableFrom(boolean.class)) {
			return (T) convertToBoolean(value);
		} else if (clazzType.isAssignableFrom(java.sql.Date.class)) {
			return (T) convertToSQLDate(value);
		} else if (clazzType.isAssignableFrom(java.sql.Timestamp.class)) {
			return (T) convertToSQLTimestamp(value);
		} else if (clazzType.isAssignableFrom(UInteger.class)) {
			return (T) convertToUInteger(value);
		} else if (clazzType.isAssignableFrom(Short.class) || clazzType.isAssignableFrom(short.class)) {
			return (T) convertToShort(value);
		} else if (clazzType.isAssignableFrom(UByte.class)) {
			return (T) converToUByte(value);
		} else if (clazzType.isAssignableFrom(UShort.class)) {
			return (T) converToUShort(value);
		} else if (clazzType.isAssignableFrom(ULong.class)) {
			return (T) converToULong(value);
		} else if (clazzType.isAssignableFrom(Map.class)) {
			// Map对象, 暂时不做转换, 有需求的时候再添加转换方法
			return (T) value;
		} else if(clazzType.isAssignableFrom(List.class)) {
			return (T) converToList(value);
		} else {
			return null;
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static List<Object> converToList(Object value) {
		List<Object> result = new ArrayList<>();
		if(value instanceof JSONArray) {
			Collections.addAll(result, ((JSONArray)value).toArray());
		} else if(value instanceof ArrayList) {
			return (List)value;
		} else {
			Object[] params = (Object[])value;
			Collections.addAll(result, params);
		}
		return result;
	}

	public static ULong converToULong(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return ULong.valueOf((String) value);
			} catch (NumberFormatException e) {
				return ULong.valueOf(0);
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return ULong.valueOf(1);
			} else {
				return ULong.valueOf(0);
			}
		} else if (value instanceof Integer) {
			return ULong.valueOf((Integer) value);
		} else if (value instanceof Byte) {
			return ULong.valueOf((Byte) value);
		} else if (value instanceof Float) {
			return ULong.valueOf(((Float) value).intValue());
		} else if (value instanceof Long) {
			return ULong.valueOf(((Long) value).shortValue());
		} else if (value instanceof Double) {
			return ULong.valueOf(((Double) value).shortValue());
		} else if (value instanceof UInteger) {
			return ULong.valueOf(((UInteger) value).intValue());
		} else if (value instanceof Date) {
			return ULong.valueOf((short) ((Date) value).getTime());
		} else if (value instanceof UShort) {
			return ULong.valueOf(((UShort) value).longValue());
		} else if (value instanceof UByte) {
			return ULong.valueOf(((UByte) value).shortValue());
		} else if (value instanceof ULong) {
			return (ULong) value;
		} else {
			return null;
		}
	}

	public static UShort converToUShort(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return UShort.valueOf((String) value);
			} catch (NumberFormatException e) {
				return UShort.valueOf(0);
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return UShort.valueOf(1);
			} else {
				return UShort.valueOf(0);
			}
		} else if (value instanceof Integer) {
			return UShort.valueOf((Integer) value);
		} else if (value instanceof Byte) {
			return UShort.valueOf((Byte) value);
		} else if (value instanceof Float) {
			return UShort.valueOf(((Float) value).intValue());
		} else if (value instanceof Long) {
			return UShort.valueOf(((Long) value).shortValue());
		} else if (value instanceof ULong) {
			return UShort.valueOf(((ULong) value).shortValue());
		} else if (value instanceof Double) {
			return UShort.valueOf(((Double) value).shortValue());
		} else if (value instanceof UInteger) {
			return UShort.valueOf(((UInteger) value).intValue());
		} else if (value instanceof Date) {
			return UShort.valueOf((short) ((Date) value).getTime());
		} else if (value instanceof UShort) {
			return (UShort) value;
		} else if (value instanceof UByte) {
			return UShort.valueOf(((UByte) value).shortValue());
		} else {
			return null;
		}
	}

	public static UByte converToUByte(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return UByte.valueOf((String) value);
			} catch (NumberFormatException e) {
				return UByte.valueOf(0);
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return UByte.valueOf(1);
			} else {
				return UByte.valueOf(0);
			}
		} else if (value instanceof Integer) {
			return UByte.valueOf((Integer) value);
		} else if (value instanceof Byte) {
			return UByte.valueOf((Byte) value);
		} else if (value instanceof Float) {
			return UByte.valueOf(((Float) value).intValue());
		} else if (value instanceof Long) {
			return UByte.valueOf((Long) value);
		} else if (value instanceof ULong) {
			return UByte.valueOf(((ULong) value).shortValue());
		} else if (value instanceof Double) {
			return UByte.valueOf(((Double) value).longValue());
		} else if (value instanceof UInteger) {
			return UByte.valueOf(((UInteger) value).intValue());
		} else if (value instanceof Date) {
			return UByte.valueOf(((Date) value).getTime());
		} else if (value instanceof UByte) {
			return (UByte) value;
		} else if (value instanceof UShort) {
			return UByte.valueOf(((UShort) value).shortValue());
		} else if (value instanceof Short) {
			return UByte.valueOf(((Short) value).shortValue());
		} else {
			return null;
		}
	}

	public static Short convertToShort(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return Short.valueOf((String) value);
			} catch (NumberFormatException e) {
				return 0;
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return 1;
			} else {
				return 0;
			}
		} else if (value instanceof Integer) {
			return ((Integer) value).shortValue();
		} else if (value instanceof Byte) {
			return ((Byte) value).shortValue();
		} else if (value instanceof Float) {
			return ((Float) value).shortValue();
		} else if (value instanceof Long) {
			return ((Long) value).shortValue();
		} else if (value instanceof ULong) {
			return ((ULong) value).shortValue();
		} else if (value instanceof Double) {
			return ((Double) value).shortValue();
		} else if (value instanceof UInteger) {
			return ((UInteger) value).shortValue();
		} else if (value instanceof Date) {
			return Long.valueOf(((Date) value).getTime()).shortValue();
		} else if (value instanceof UByte) {
			return ((UByte) value).shortValue();
		} else if (value instanceof UShort) {
			return ((UShort) value).shortValue();
		} else {
			return null;
		}
	}

	public static UInteger convertToUInteger(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return UInteger.valueOf((String) value);
			} catch (NumberFormatException e) {
				return UInteger.valueOf(0);
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return UInteger.valueOf(1);
			} else {
				return UInteger.valueOf(0);
			}
		} else if (value instanceof Short) {
			return UInteger.valueOf((Short) value);
		} else if (value instanceof Integer) {
			return UInteger.valueOf((Integer) value);
		} else if (value instanceof Byte) {
			return UInteger.valueOf((Byte) value);
		} else if (value instanceof Float) {
			return UInteger.valueOf(((Float) value).longValue());
		} else if (value instanceof Long) {
			return UInteger.valueOf((Long) value);
		} else if (value instanceof ULong) {
			return UInteger.valueOf(((ULong) value).intValue());
		} else if (value instanceof Double) {
			return UInteger.valueOf(((Double) value).longValue());
		} else if (value instanceof UInteger) {
			return (UInteger) value;
		} else if (value instanceof java.sql.Timestamp) {
			return UInteger.valueOf(((java.sql.Timestamp) value).getTime());
		} else if (value instanceof java.sql.Date) {
			return UInteger.valueOf(((java.sql.Date) value).getTime());
		} else if (value instanceof Date) {
			return UInteger.valueOf(((Date) value).getTime());
		} else if (value instanceof UByte) {
			return UInteger.valueOf(((UByte) value).intValue());
		} else if (value instanceof UShort) {
			return UInteger.valueOf(((UShort) value).intValue());
		} else {
			return null;
		}
	}

	public static java.sql.Timestamp convertToSQLTimestamp(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				if(((String)value).length() == 10) {
					return new java.sql.Timestamp(DateUtils.shortDateToDate((String) value).getTime());
				} else if(((String)value).length() == 19) {
					return new java.sql.Timestamp(DateUtils.shortTimeToDate((String) value).getTime());
				} else {
					return new java.sql.Timestamp(DateUtils.shortTimeToDate((String) value).getTime());
				}
			} catch (ParseException e) {
				return null;
			}
		} else if (value instanceof Boolean) {
			return null;
		} else if (value instanceof UShort) {
			return new java.sql.Timestamp(((UShort) value).intValue());
		} else if (value instanceof Short) {
			return new java.sql.Timestamp((Short) value);
		} else if (value instanceof Integer) {
			return new java.sql.Timestamp((Integer) value);
		} else if (value instanceof Byte) {
			return new java.sql.Timestamp((Byte) value);
		} else if (value instanceof Float) {
			return new java.sql.Timestamp(((Float) value).longValue());
		} else if (value instanceof Long) {
			return new java.sql.Timestamp((Long) value);
		} else if (value instanceof ULong) {
			return new java.sql.Timestamp(((ULong) value).longValue());
		} else if (value instanceof Double) {
			return new java.sql.Timestamp(((Double) value).longValue());
		} else if (value instanceof UInteger) {
			return new java.sql.Timestamp(((UInteger) value).longValue());
		} else if (value instanceof java.sql.Timestamp) {
			return (java.sql.Timestamp) value;
		} else if (value instanceof java.sql.Date) {
			return new java.sql.Timestamp(((java.sql.Date) value).getTime());
		} else if (value instanceof Date) {
			return new java.sql.Timestamp(((Date) value).getTime());
		} else if (value instanceof UByte) {
			return new java.sql.Timestamp(((UByte) value).intValue());
		} else {
			return null;
		}
	}

	public static java.sql.Date convertToSQLDate(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return new java.sql.Date(DateUtils.nomalDateToDate((String) value).getTime());
			} catch (ParseException e) {
				return null;
			}
		} else if (value instanceof Boolean) {
			return null;
		} else if (value instanceof UShort) {
			return new java.sql.Date(((UShort) value).intValue());
		} else if (value instanceof Short) {
			return new java.sql.Date((Short) value);
		} else if (value instanceof Integer) {
			return new java.sql.Date((Integer) value);
		} else if (value instanceof Byte) {
			return new java.sql.Date((Byte) value);
		} else if (value instanceof Float) {
			return new java.sql.Date(((Float) value).longValue());
		} else if (value instanceof Long) {
			return new java.sql.Date((Long) value);
		} else if (value instanceof Double) {
			return new java.sql.Date(((Double) value).longValue());
		} else if (value instanceof UInteger) {
			return new java.sql.Date(((UInteger) value).longValue());
		} else if (value instanceof java.sql.Date) {
			return (java.sql.Date) value;
		} else if (value instanceof java.sql.Timestamp) {
			return new java.sql.Date(((java.sql.Timestamp) value).getTime());
		} else if (value instanceof Date) {
			return new java.sql.Date(((Date) value).getTime());
		} else if (value instanceof UByte) {
			return new java.sql.Date(((UByte) value).intValue());
		} else if (value instanceof ULong) {
			return new java.sql.Date(((ULong) value).longValue());
		} else {
			return null;
		}
	}

	public static Boolean convertToBoolean(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return Boolean.valueOf((String) value);
			} catch (Exception e) {
				return Boolean.FALSE;
			}
		} else if (value instanceof Boolean) {
			return (Boolean) value;
		} else if (value instanceof Short) {
			if ((Short) value > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof UShort) {
			if (((UShort) value).shortValue() > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof Integer) {
			if ((Integer) value > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof Byte) {
			if ((Byte) value > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof Float) {
			if ((Float) value > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof Long) {
			if ((Long) value > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof Double) {
			if ((Double) value > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof UInteger) {
			if (((UInteger) value).intValue() > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof UByte) {
			if (((UByte) value).byteValue() > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else if (value instanceof ULong) {
			if (((ULong) value).longValue() > 0) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		} else {
			// sql.date sql.timestamp date timestamp
			if (value != null) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}
		}
	}

	public static Double converToDouble(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return Double.valueOf((String) value);
			} catch (NumberFormatException e) {
				return Double.valueOf(0);
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return Double.valueOf(1);
			} else {
				return Double.valueOf(0);
			}
		} else if (value instanceof Short) {
			return Double.valueOf((Short) value);
		} else if (value instanceof UShort) {
			return ((UShort) value).doubleValue();
		} else if (value instanceof Integer) {
			return Double.valueOf((Integer) value);
		} else if (value instanceof Byte) {
			return Double.valueOf((Byte) value);
		} else if (value instanceof Float) {
			return Double.valueOf((Float) value);
		} else if (value instanceof Long) {
			return Double.valueOf((Long) value);
		} else if (value instanceof Double) {
			return (Double) value;
		} else if (value instanceof UInteger) {
			return ((UInteger) value).doubleValue();
		} else if (value instanceof Date) {
			return Double.valueOf(((Date) value).getTime());
		} else if (value instanceof UByte) {
			return ((UByte) value).doubleValue();
		} else if (value instanceof ULong) {
			return ((ULong) value).doubleValue();
		} else {
			return null;
		}
	}

	public static Float converToFloat(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return Float.valueOf((String) value);
			} catch (NumberFormatException e) {
				return Float.valueOf(0f);
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return Float.valueOf(1);
			} else {
				return Float.valueOf(0);
			}
		} else if (value instanceof Short) {
			return (Float) ((Short) value).floatValue();
		} else if (value instanceof UShort) {
			return ((UShort) value).floatValue();
		} else if (value instanceof Integer) {
			return (Float) ((Integer) value).floatValue();
		} else if (value instanceof Byte) {
			return (Float) ((Byte) value).floatValue();
		} else if (value instanceof Float) {
			return (Float) value;
		} else if (value instanceof Long) {
			return (Float) ((Long) value).floatValue();
		} else if (value instanceof Double) {
			return (Float) ((Double) value).floatValue();
		} else if (value instanceof UInteger) {
			return (Float) ((UInteger) value).floatValue();
		} else if (value instanceof Date) {
			return (Float) Float.valueOf(((Date) value).getTime());
		} else if (value instanceof UByte) {
			return ((UByte) value).floatValue();
		} else if (value instanceof ULong) {
			return ((ULong) value).floatValue();
		} else {
			return null;
		}
	}

	public static Integer converToInteger(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			try {
				return Long.valueOf((String) value).intValue();
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return Integer.valueOf(0);
			}
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return Integer.valueOf(1);
			} else {
				return Integer.valueOf(0);
			}
		} else if (value instanceof Short) {
			return (Integer) ((Short) value).intValue();
		} else if (value instanceof UShort) {
			return ((UShort) value).intValue();
		} else if (value instanceof Integer) {
			return (Integer) value;
		} else if (value instanceof Byte) {
			return (Integer) ((Byte) value).intValue();
		} else if (value instanceof Float) {
			return (Integer) ((Float) value).intValue();
		} else if (value instanceof Long) {
			return (Integer) ((Long) value).intValue();
		} else if (value instanceof Double) {
			return (Integer) ((Double) value).intValue();
		} else if (value instanceof UInteger) {
			return ((UInteger) value).intValue();
		} else if (value instanceof Date) {
			return (int) ((Date) value).getTime();
		} else if (value instanceof UByte) {
			return ((UByte) value).intValue();
		} else if (value instanceof ULong) {
			return ((ULong) value).intValue();
		} else {
			return null;
		}
	}

	public static Byte converToByte(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			return Byte.valueOf((String) value);
		} else if (value instanceof Byte) {
			return (Byte) value;
		} else if (value instanceof Boolean) {
			// todo 需要考虑一个类似l表示long基本数据类型 存在一个b表示该数值是byte的方式
			byte b = 1;
			if ((Boolean) value) {
				return Byte.valueOf(b);
			} else {
				b = 0;
				return Byte.valueOf(b);
			}
		} else if (value instanceof Short) {
			return (Byte) ((Short) value).byteValue();
		} else if (value instanceof UShort) {
			return ((UShort) value).byteValue();
		} else if (value instanceof Integer) {
			return (Byte) ((Integer) value).byteValue();
		} else if (value instanceof Float) {
			return (Byte) ((Float) value).byteValue();
		} else if (value instanceof Long) {
			return (Byte) ((Long) value).byteValue();
		} else if (value instanceof Double) {
			return (Byte) ((Double) value).byteValue();
		} else if (value instanceof UInteger) {
			return (Byte) ((UInteger) value).byteValue();
		} else if (value instanceof Date) {
			return (byte) ((Date) value).getTime();
		} else if (value instanceof UByte) {
			return ((UByte) value).byteValue();
		} else if (value instanceof ULong) {
			return ((ULong) value).byteValue();
		} else {
			return null;
		}
	}

	public static Long converToLong(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String && !((String) value).trim().equals("")) {
			return Long.valueOf((String) value);
		} else if (value instanceof Byte) {
			return Long.valueOf((Byte) value);
		} else if (value instanceof Boolean) {
			if ((Boolean) value) {
				return Long.valueOf(1);
			} else {
				return Long.valueOf(0);
			}
		} else if (value instanceof Short) {
			return (Long) ((Short) value).longValue();
		} else if (value instanceof UShort) {
			return ((UShort) value).longValue();
		} else if (value instanceof Integer) {
			return Long.valueOf((Integer) value);
		} else if (value instanceof Float) {
			return Long.valueOf(((Float) value).longValue());
		} else if (value instanceof Long) {
			return (Long) value;
		} else if (value instanceof Double) {
			return (Long) ((Double) value).longValue();
		} else if (value instanceof UInteger) {
			return ((UInteger) value).longValue();
		} else if (value instanceof Date) {
			return ((Date) value).getTime();
		} else if (value instanceof UByte) {
			return ((UByte) value).longValue();
		} else if (value instanceof ULong) {
			return ((ULong) value).longValue();
		} else {
			return null;
		}
	}

	public static String converToString(Object value) {
		if(value instanceof String[]) {
			value = ((String[])value)[0];
		}
		if (value instanceof String) {
			return (String) value;
		} else if (value instanceof java.sql.Timestamp) {
			return DateUtils.dateToShortTime(((java.sql.Timestamp) value));
		} else if (value instanceof Date) {
			return DateUtils.dateToNormalDate(((Date) value));
		} else if (value != null) {
			return value.toString();
		} else {
			return null;
		}
	}
	
	/**
     * 获取外部内的类名
     * <p>
     *
     * @return 类名
     */
    public static String findOutClassName(Class<?> clazz) {
    	String iface = clazz.getName();
        if (iface.contains("$")) {
            return iface.substring(0, iface.indexOf("$"));
        }
        return iface;
    }

	/**
	 * Convert the generic TBase<?, ?> entity to JSON object.
	 *
	 * @param tobj
	 * @author Allex Wang
	 * @return
	 */
	public static String convertStructToJSON(final TBase<?, ?> tobj) throws TException{
		TSerializer serializer = new TSerializer(new TSimpleJSONProtocol.Factory());
		return serializer.toString(tobj, "utf8");
	}

	public static String convertStructToJSON(final List<? extends TBase<?, ?>> tobj) throws TException{
		StringBuilder builder = new StringBuilder();
		for(TBase t : tobj){
			builder.append(',').append(convertStructToJSON(t));
		}
		builder.delete(0,1);
		builder.insert(0,'[').append(']');
		return builder.toString();
	}

	static PropertyFilter profilter = new PropertyFilter(){

		@Override
		public boolean apply(Object object, String name, Object value) {
			if(name.startsWith("set")){
				return false;
			}
			return true;
		}

	};

	public static String convertStructToJSON(Object object) throws TException{
		return JSON.toJSONString(object,profilter);
	}


	public static Map<String, Object> object2Map(Object object){
		JSONObject jsonObject = (JSONObject) JSONObject.toJSON(object);
		Set<Entry<String,Object>> entrySet = jsonObject.entrySet();
		Map<String, Object> map=new HashMap<String,Object>();
		for (Entry<String, Object> entry : entrySet) {
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}
}
