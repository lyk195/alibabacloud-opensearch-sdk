/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.aliyun.opensearch.sdk.generated.search;

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

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-08-17")
public class Suggest implements org.apache.thrift.TBase<Suggest, Suggest._Fields>, java.io.Serializable, Cloneable, Comparable<Suggest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Suggest");

  private static final org.apache.thrift.protocol.TField SUGGEST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("suggestName", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SuggestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SuggestTupleSchemeFactory());
  }

  private String suggestName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUGGEST_NAME((short)1, "suggestName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUGGEST_NAME
          return SUGGEST_NAME;
        default:
          return null;
      }
    }

    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

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
    tmpMap.put(_Fields.SUGGEST_NAME, new org.apache.thrift.meta_data.FieldMetaData("suggestName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Suggest.class, metaDataMap);
  }

  public Suggest() {
  }

  public Suggest(
    String suggestName)
  {
    this();
    this.suggestName = suggestName;
  }

  public Suggest(Suggest other) {
    if (other.isSetSuggestName()) {
      this.suggestName = other.suggestName;
    }
  }

  public Suggest deepCopy() {
    return new Suggest(this);
  }

  @Override
  public void clear() {
    this.suggestName = null;
  }

  public String getSuggestName() {
    return this.suggestName;
  }

  public Suggest setSuggestName(String suggestName) {
    this.suggestName = suggestName;
    return this;
  }

  public void unsetSuggestName() {
    this.suggestName = null;
  }

  public boolean isSetSuggestName() {
    return this.suggestName != null;
  }

  public void setSuggestNameIsSet(boolean value) {
    if (!value) {
      this.suggestName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SUGGEST_NAME:
      if (value == null) {
        unsetSuggestName();
      } else {
        setSuggestName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SUGGEST_NAME:
      return getSuggestName();

    }
    throw new IllegalStateException();
  }

  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SUGGEST_NAME:
      return isSetSuggestName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Suggest)
      return this.equals((Suggest)that);
    return false;
  }

  public boolean equals(Suggest that) {
    if (that == null)
      return false;

    boolean this_present_suggestName = true && this.isSetSuggestName();
    boolean that_present_suggestName = true && that.isSetSuggestName();
    if (this_present_suggestName || that_present_suggestName) {
      if (!(this_present_suggestName && that_present_suggestName))
        return false;
      if (!this.suggestName.equals(that.suggestName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_suggestName = true && (isSetSuggestName());
    list.add(present_suggestName);
    if (present_suggestName)
      list.add(suggestName);

    return list.hashCode();
  }

  @Override
  public int compareTo(Suggest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSuggestName()).compareTo(other.isSetSuggestName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuggestName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.suggestName, other.suggestName);
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
    StringBuilder sb = new StringBuilder("Suggest(");
    boolean first = true;

    sb.append("suggestName:");
    if (this.suggestName == null) {
      sb.append("null");
    } else {
      sb.append(this.suggestName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (suggestName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'suggestName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class SuggestStandardSchemeFactory implements SchemeFactory {
    public SuggestStandardScheme getScheme() {
      return new SuggestStandardScheme();
    }
  }

  private static class SuggestStandardScheme extends StandardScheme<Suggest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Suggest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUGGEST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.suggestName = iprot.readString();
              struct.setSuggestNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Suggest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.suggestName != null) {
        oprot.writeFieldBegin(SUGGEST_NAME_FIELD_DESC);
        oprot.writeString(struct.suggestName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SuggestTupleSchemeFactory implements SchemeFactory {
    public SuggestTupleScheme getScheme() {
      return new SuggestTupleScheme();
    }
  }

  private static class SuggestTupleScheme extends TupleScheme<Suggest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Suggest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.suggestName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Suggest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.suggestName = iprot.readString();
      struct.setSuggestNameIsSet(true);
    }
  }

}

