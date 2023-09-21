/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.aliyun.opensearch.sdk.generated.app;

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
public class Group implements org.apache.thrift.TBase<Group, Group._Fields>, java.io.Serializable, Cloneable, Comparable<Group> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Group");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CURRENT_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("current_version", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VERSIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("versions", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField SWITCH_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("switch_time", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GroupTupleSchemeFactory());
  }

  private String type; // optional
  private String current_version; // optional
  private List<String> versions; // optional
  private int switch_time; // optional
  private String id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TYPE((short)1, "type"),
    CURRENT_VERSION((short)2, "current_version"),
    VERSIONS((short)3, "versions"),
    SWITCH_TIME((short)4, "switch_time"),
    ID((short)5, "id");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * @param fieldId fieldId
     * @return Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TYPE
          return TYPE;
        case 2: // CURRENT_VERSION
          return CURRENT_VERSION;
        case 3: // VERSIONS
          return VERSIONS;
        case 4: // SWITCH_TIME
          return SWITCH_TIME;
        case 5: // ID
          return ID;
        default:
          return null;
      }
    }

    /**
     * @param fieldId fieldId
     * @return Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * @param name name
     * @return Find the _Fields constant that matches name, or null if its not found.
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
  private static final int __SWITCH_TIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.CURRENT_VERSION,_Fields.VERSIONS,_Fields.SWITCH_TIME,_Fields.ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CURRENT_VERSION, new org.apache.thrift.meta_data.FieldMetaData("current_version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSIONS, new org.apache.thrift.meta_data.FieldMetaData("versions", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SWITCH_TIME, new org.apache.thrift.meta_data.FieldMetaData("switch_time", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Group.class, metaDataMap);
  }

  public Group() {
    this.type = "advance";

  }

  public Group(Group other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetCurrent_version()) {
      this.current_version = other.current_version;
    }
    if (other.isSetVersions()) {
      List<String> __this__versions = new ArrayList<String>(other.versions);
      this.versions = __this__versions;
    }
    this.switch_time = other.switch_time;
    if (other.isSetId()) {
      this.id = other.id;
    }
  }

  public Group deepCopy() {
    return new Group(this);
  }

  @Override
  public void clear() {
    this.type = "advance";

    this.current_version = null;
    this.versions = null;
    setSwitch_timeIsSet(false);
    this.switch_time = 0;
    this.id = null;
  }

  public String getType() {
    return this.type;
  }

  public Group setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /**
   * @return Returns true if field type is set (has been assigned a value) and false otherwise
   **/
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getCurrent_version() {
    return this.current_version;
  }

  public Group setCurrent_version(String current_version) {
    this.current_version = current_version;
    return this;
  }

  public void unsetCurrent_version() {
    this.current_version = null;
  }

  /**
   * @return Returns true if field current_version is set (has been assigned a value) and false otherwise
   **/
  public boolean isSetCurrent_version() {
    return this.current_version != null;
  }

  public void setCurrent_versionIsSet(boolean value) {
    if (!value) {
      this.current_version = null;
    }
  }

  public int getVersionsSize() {
    return (this.versions == null) ? 0 : this.versions.size();
  }

  public java.util.Iterator<String> getVersionsIterator() {
    return (this.versions == null) ? null : this.versions.iterator();
  }

  public void addToVersions(String elem) {
    if (this.versions == null) {
      this.versions = new ArrayList<String>();
    }
    this.versions.add(elem);
  }

  public List<String> getVersions() {
    return this.versions;
  }

  public Group setVersions(List<String> versions) {
    this.versions = versions;
    return this;
  }

  public void unsetVersions() {
    this.versions = null;
  }

  /**
   * @return Returns true if field versions is set (has been assigned a value) and false otherwise
   **/
  public boolean isSetVersions() {
    return this.versions != null;
  }

  public void setVersionsIsSet(boolean value) {
    if (!value) {
      this.versions = null;
    }
  }

  public int getSwitch_time() {
    return this.switch_time;
  }

  public Group setSwitch_time(int switch_time) {
    this.switch_time = switch_time;
    setSwitch_timeIsSet(true);
    return this;
  }

  public void unsetSwitch_time() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SWITCH_TIME_ISSET_ID);
  }

  /**
   * @return Returns true if field switch_time is set (has been assigned a value) and false otherwise
   **/
  public boolean isSetSwitch_time() {
    return EncodingUtils.testBit(__isset_bitfield, __SWITCH_TIME_ISSET_ID);
  }

  public void setSwitch_timeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SWITCH_TIME_ISSET_ID, value);
  }

  public String getId() {
    return this.id;
  }

  public Group setId(String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /**
   * @return Returns true if field id is set (has been assigned a value) and false otherwise
   **/
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case CURRENT_VERSION:
      if (value == null) {
        unsetCurrent_version();
      } else {
        setCurrent_version((String)value);
      }
      break;

    case VERSIONS:
      if (value == null) {
        unsetVersions();
      } else {
        setVersions((List<String>)value);
      }
      break;

    case SWITCH_TIME:
      if (value == null) {
        unsetSwitch_time();
      } else {
        setSwitch_time((Integer)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case CURRENT_VERSION:
      return getCurrent_version();

    case VERSIONS:
      return getVersions();

    case SWITCH_TIME:
      return getSwitch_time();

    case ID:
      return getId();

    }
    throw new IllegalStateException();
  }

  /**
   * @param field field
   * @return Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
   **/
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case CURRENT_VERSION:
      return isSetCurrent_version();
    case VERSIONS:
      return isSetVersions();
    case SWITCH_TIME:
      return isSetSwitch_time();
    case ID:
      return isSetId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Group)
      return this.equals((Group)that);
    return false;
  }

  public boolean equals(Group that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_current_version = true && this.isSetCurrent_version();
    boolean that_present_current_version = true && that.isSetCurrent_version();
    if (this_present_current_version || that_present_current_version) {
      if (!(this_present_current_version && that_present_current_version))
        return false;
      if (!this.current_version.equals(that.current_version))
        return false;
    }

    boolean this_present_versions = true && this.isSetVersions();
    boolean that_present_versions = true && that.isSetVersions();
    if (this_present_versions || that_present_versions) {
      if (!(this_present_versions && that_present_versions))
        return false;
      if (!this.versions.equals(that.versions))
        return false;
    }

    boolean this_present_switch_time = true && this.isSetSwitch_time();
    boolean that_present_switch_time = true && that.isSetSwitch_time();
    if (this_present_switch_time || that_present_switch_time) {
      if (!(this_present_switch_time && that_present_switch_time))
        return false;
      if (this.switch_time != that.switch_time)
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_current_version = true && (isSetCurrent_version());
    list.add(present_current_version);
    if (present_current_version)
      list.add(current_version);

    boolean present_versions = true && (isSetVersions());
    list.add(present_versions);
    if (present_versions)
      list.add(versions);

    boolean present_switch_time = true && (isSetSwitch_time());
    list.add(present_switch_time);
    if (present_switch_time)
      list.add(switch_time);

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    return list.hashCode();
  }

  @Override
  public int compareTo(Group other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrent_version()).compareTo(other.isSetCurrent_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrent_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.current_version, other.current_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersions()).compareTo(other.isSetVersions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.versions, other.versions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSwitch_time()).compareTo(other.isSetSwitch_time());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSwitch_time()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.switch_time, other.switch_time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
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
    StringBuilder sb = new StringBuilder("Group(");
    boolean first = true;

    if (isSetType()) {
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetCurrent_version()) {
      if (!first) sb.append(", ");
      sb.append("current_version:");
      if (this.current_version == null) {
        sb.append("null");
      } else {
        sb.append(this.current_version);
      }
      first = false;
    }
    if (isSetVersions()) {
      if (!first) sb.append(", ");
      sb.append("versions:");
      if (this.versions == null) {
        sb.append("null");
      } else {
        sb.append(this.versions);
      }
      first = false;
    }
    if (isSetSwitch_time()) {
      if (!first) sb.append(", ");
      sb.append("switch_time:");
      sb.append(this.switch_time);
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GroupStandardSchemeFactory implements SchemeFactory {
    public GroupStandardScheme getScheme() {
      return new GroupStandardScheme();
    }
  }

  private static class GroupStandardScheme extends StandardScheme<Group> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Group struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CURRENT_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.current_version = iprot.readString();
              struct.setCurrent_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VERSIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list54 = iprot.readListBegin();
                struct.versions = new ArrayList<String>(_list54.size);
                String _elem55;
                for (int _i56 = 0; _i56 < _list54.size; ++_i56)
                {
                  _elem55 = iprot.readString();
                  struct.versions.add(_elem55);
                }
                iprot.readListEnd();
              }
              struct.setVersionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SWITCH_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.switch_time = iprot.readI32();
              struct.setSwitch_timeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Group struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeString(struct.type);
          oprot.writeFieldEnd();
        }
      }
      if (struct.current_version != null) {
        if (struct.isSetCurrent_version()) {
          oprot.writeFieldBegin(CURRENT_VERSION_FIELD_DESC);
          oprot.writeString(struct.current_version);
          oprot.writeFieldEnd();
        }
      }
      if (struct.versions != null) {
        if (struct.isSetVersions()) {
          oprot.writeFieldBegin(VERSIONS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.versions.size()));
            for (String _iter57 : struct.versions)
            {
              oprot.writeString(_iter57);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSwitch_time()) {
        oprot.writeFieldBegin(SWITCH_TIME_FIELD_DESC);
        oprot.writeI32(struct.switch_time);
        oprot.writeFieldEnd();
      }
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GroupTupleSchemeFactory implements SchemeFactory {
    public GroupTupleScheme getScheme() {
      return new GroupTupleScheme();
    }
  }

  private static class GroupTupleScheme extends TupleScheme<Group> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Group struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetCurrent_version()) {
        optionals.set(1);
      }
      if (struct.isSetVersions()) {
        optionals.set(2);
      }
      if (struct.isSetSwitch_time()) {
        optionals.set(3);
      }
      if (struct.isSetId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetCurrent_version()) {
        oprot.writeString(struct.current_version);
      }
      if (struct.isSetVersions()) {
        {
          oprot.writeI32(struct.versions.size());
          for (String _iter58 : struct.versions)
          {
            oprot.writeString(_iter58);
          }
        }
      }
      if (struct.isSetSwitch_time()) {
        oprot.writeI32(struct.switch_time);
      }
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Group struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.current_version = iprot.readString();
        struct.setCurrent_versionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list59 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.versions = new ArrayList<String>(_list59.size);
          String _elem60;
          for (int _i61 = 0; _i61 < _list59.size; ++_i61)
          {
            _elem60 = iprot.readString();
            struct.versions.add(_elem60);
          }
        }
        struct.setVersionsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.switch_time = iprot.readI32();
        struct.setSwitch_timeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
    }
  }

}

