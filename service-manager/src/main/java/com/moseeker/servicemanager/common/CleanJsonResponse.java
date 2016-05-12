/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.servicemanager.common;

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

import com.moseeker.thrift.gen.common.struct.Response;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked", "unused" })
public class CleanJsonResponse {
	public int status; // required
	public String message; // required
	public String data; // optional

	private CleanJsonResponse(int status, String message, String data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	
	public static CleanJsonResponse convertFrom(Response resp){
		if (resp != null){
			return new CleanJsonResponse(resp.getStatus(),resp.getMessage(),resp.getData());
		}
		return null;
	}

}