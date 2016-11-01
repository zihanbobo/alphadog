package com.moseeker.thrift.gen.thirdpart.service;

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.moseeker.thrift.gen.thirdpart.struct.ThirdPartParamer;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-11-01")
public class BindThirdPartService {

  public interface Iface {

    public com.moseeker.thrift.gen.common.struct.Response sendParamForChaos(ThirdPartParamer param) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void sendParamForChaos(ThirdPartParamer param, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public com.moseeker.thrift.gen.common.struct.Response sendParamForChaos(ThirdPartParamer param) throws org.apache.thrift.TException
    {
      send_sendParamForChaos(param);
      return recv_sendParamForChaos();
    }

    public void send_sendParamForChaos(ThirdPartParamer param) throws org.apache.thrift.TException
    {
      sendParamForChaos_args args = new sendParamForChaos_args();
      args.setParam(param);
      sendBase("sendParamForChaos", args);
    }

    public com.moseeker.thrift.gen.common.struct.Response recv_sendParamForChaos() throws org.apache.thrift.TException
    {
      sendParamForChaos_result result = new sendParamForChaos_result();
      receiveBase(result, "sendParamForChaos");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "sendParamForChaos failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void sendParamForChaos(ThirdPartParamer param, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      sendParamForChaos_call method_call = new sendParamForChaos_call(param, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class sendParamForChaos_call extends org.apache.thrift.async.TAsyncMethodCall {
      private ThirdPartParamer param;
      public sendParamForChaos_call(ThirdPartParamer param, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.param = param;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("sendParamForChaos", org.apache.thrift.protocol.TMessageType.CALL, 0));
        sendParamForChaos_args args = new sendParamForChaos_args();
        args.setParam(param);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public com.moseeker.thrift.gen.common.struct.Response getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_sendParamForChaos();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("sendParamForChaos", new sendParamForChaos());
      return processMap;
    }

    public static class sendParamForChaos<I extends Iface> extends org.apache.thrift.ProcessFunction<I, sendParamForChaos_args> {
      public sendParamForChaos() {
        super("sendParamForChaos");
      }

      public sendParamForChaos_args getEmptyArgsInstance() {
        return new sendParamForChaos_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public sendParamForChaos_result getResult(I iface, sendParamForChaos_args args) throws org.apache.thrift.TException {
        sendParamForChaos_result result = new sendParamForChaos_result();
        result.success = iface.sendParamForChaos(args.param);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("sendParamForChaos", new sendParamForChaos());
      return processMap;
    }

    public static class sendParamForChaos<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, sendParamForChaos_args, com.moseeker.thrift.gen.common.struct.Response> {
      public sendParamForChaos() {
        super("sendParamForChaos");
      }

      public sendParamForChaos_args getEmptyArgsInstance() {
        return new sendParamForChaos_args();
      }

      public AsyncMethodCallback<com.moseeker.thrift.gen.common.struct.Response> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<com.moseeker.thrift.gen.common.struct.Response>() { 
          public void onComplete(com.moseeker.thrift.gen.common.struct.Response o) {
            sendParamForChaos_result result = new sendParamForChaos_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            sendParamForChaos_result result = new sendParamForChaos_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, sendParamForChaos_args args, org.apache.thrift.async.AsyncMethodCallback<com.moseeker.thrift.gen.common.struct.Response> resultHandler) throws TException {
        iface.sendParamForChaos(args.param,resultHandler);
      }
    }

  }

  public static class sendParamForChaos_args implements org.apache.thrift.TBase<sendParamForChaos_args, sendParamForChaos_args._Fields>, java.io.Serializable, Cloneable, Comparable<sendParamForChaos_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("sendParamForChaos_args");

    private static final org.apache.thrift.protocol.TField PARAM_FIELD_DESC = new org.apache.thrift.protocol.TField("param", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new sendParamForChaos_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new sendParamForChaos_argsTupleSchemeFactory());
    }

    public ThirdPartParamer param; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      PARAM((short)1, "param");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // PARAM
            return PARAM;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.PARAM, new org.apache.thrift.meta_data.FieldMetaData("param", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThirdPartParamer.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(sendParamForChaos_args.class, metaDataMap);
    }

    public sendParamForChaos_args() {
    }

    public sendParamForChaos_args(
      ThirdPartParamer param)
    {
      this();
      this.param = param;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public sendParamForChaos_args(sendParamForChaos_args other) {
      if (other.isSetParam()) {
        this.param = new ThirdPartParamer(other.param);
      }
    }

    public sendParamForChaos_args deepCopy() {
      return new sendParamForChaos_args(this);
    }

    @Override
    public void clear() {
      this.param = null;
    }

    public ThirdPartParamer getParam() {
      return this.param;
    }

    public sendParamForChaos_args setParam(ThirdPartParamer param) {
      this.param = param;
      return this;
    }

    public void unsetParam() {
      this.param = null;
    }

    /** Returns true if field param is set (has been assigned a value) and false otherwise */
    public boolean isSetParam() {
      return this.param != null;
    }

    public void setParamIsSet(boolean value) {
      if (!value) {
        this.param = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case PARAM:
        if (value == null) {
          unsetParam();
        } else {
          setParam((ThirdPartParamer)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case PARAM:
        return getParam();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case PARAM:
        return isSetParam();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof sendParamForChaos_args)
        return this.equals((sendParamForChaos_args)that);
      return false;
    }

    public boolean equals(sendParamForChaos_args that) {
      if (that == null)
        return false;

      boolean this_present_param = true && this.isSetParam();
      boolean that_present_param = true && that.isSetParam();
      if (this_present_param || that_present_param) {
        if (!(this_present_param && that_present_param))
          return false;
        if (!this.param.equals(that.param))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_param = true && (isSetParam());
      list.add(present_param);
      if (present_param)
        list.add(param);

      return list.hashCode();
    }

    @Override
    public int compareTo(sendParamForChaos_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetParam()).compareTo(other.isSetParam());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetParam()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.param, other.param);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("sendParamForChaos_args(");
      boolean first = true;

      sb.append("param:");
      if (this.param == null) {
        sb.append("null");
      } else {
        sb.append(this.param);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (param != null) {
        param.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class sendParamForChaos_argsStandardSchemeFactory implements SchemeFactory {
      public sendParamForChaos_argsStandardScheme getScheme() {
        return new sendParamForChaos_argsStandardScheme();
      }
    }

    private static class sendParamForChaos_argsStandardScheme extends StandardScheme<sendParamForChaos_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, sendParamForChaos_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // PARAM
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.param = new ThirdPartParamer();
                struct.param.read(iprot);
                struct.setParamIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, sendParamForChaos_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.param != null) {
          oprot.writeFieldBegin(PARAM_FIELD_DESC);
          struct.param.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class sendParamForChaos_argsTupleSchemeFactory implements SchemeFactory {
      public sendParamForChaos_argsTupleScheme getScheme() {
        return new sendParamForChaos_argsTupleScheme();
      }
    }

    private static class sendParamForChaos_argsTupleScheme extends TupleScheme<sendParamForChaos_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, sendParamForChaos_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetParam()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetParam()) {
          struct.param.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, sendParamForChaos_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.param = new ThirdPartParamer();
          struct.param.read(iprot);
          struct.setParamIsSet(true);
        }
      }
    }

  }

  public static class sendParamForChaos_result implements org.apache.thrift.TBase<sendParamForChaos_result, sendParamForChaos_result._Fields>, java.io.Serializable, Cloneable, Comparable<sendParamForChaos_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("sendParamForChaos_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new sendParamForChaos_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new sendParamForChaos_resultTupleSchemeFactory());
    }

    public com.moseeker.thrift.gen.common.struct.Response success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.moseeker.thrift.gen.common.struct.Response.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(sendParamForChaos_result.class, metaDataMap);
    }

    public sendParamForChaos_result() {
    }

    public sendParamForChaos_result(
      com.moseeker.thrift.gen.common.struct.Response success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public sendParamForChaos_result(sendParamForChaos_result other) {
      if (other.isSetSuccess()) {
        this.success = new com.moseeker.thrift.gen.common.struct.Response(other.success);
      }
    }

    public sendParamForChaos_result deepCopy() {
      return new sendParamForChaos_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public com.moseeker.thrift.gen.common.struct.Response getSuccess() {
      return this.success;
    }

    public sendParamForChaos_result setSuccess(com.moseeker.thrift.gen.common.struct.Response success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((com.moseeker.thrift.gen.common.struct.Response)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof sendParamForChaos_result)
        return this.equals((sendParamForChaos_result)that);
      return false;
    }

    public boolean equals(sendParamForChaos_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success);

      return list.hashCode();
    }

    @Override
    public int compareTo(sendParamForChaos_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("sendParamForChaos_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class sendParamForChaos_resultStandardSchemeFactory implements SchemeFactory {
      public sendParamForChaos_resultStandardScheme getScheme() {
        return new sendParamForChaos_resultStandardScheme();
      }
    }

    private static class sendParamForChaos_resultStandardScheme extends StandardScheme<sendParamForChaos_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, sendParamForChaos_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new com.moseeker.thrift.gen.common.struct.Response();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, sendParamForChaos_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class sendParamForChaos_resultTupleSchemeFactory implements SchemeFactory {
      public sendParamForChaos_resultTupleScheme getScheme() {
        return new sendParamForChaos_resultTupleScheme();
      }
    }

    private static class sendParamForChaos_resultTupleScheme extends TupleScheme<sendParamForChaos_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, sendParamForChaos_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, sendParamForChaos_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new com.moseeker.thrift.gen.common.struct.Response();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
