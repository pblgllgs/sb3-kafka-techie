/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pblgllgs.dto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Student extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3280788270931924396L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Student\",\"namespace\":\"com.pblgllgs.dto\",\"fields\":[{\"name\":\"studentFirstName\",\"type\":\"string\"},{\"name\":\"studentLastName\",\"type\":\"string\"},{\"name\":\"studentId\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\",\"default\":0},{\"name\":\"job\",\"type\":\"string\",\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Student> ENCODER =
      new BinaryMessageEncoder<Student>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Student> DECODER =
      new BinaryMessageDecoder<Student>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Student> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Student> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Student>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Student to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Student from a ByteBuffer. */
  public static Student fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence studentFirstName;
  @Deprecated public java.lang.CharSequence studentLastName;
  @Deprecated public java.lang.CharSequence studentId;
  @Deprecated public int age;
  @Deprecated public java.lang.CharSequence job;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Student() {}

  /**
   * All-args constructor.
   * @param studentFirstName The new value for studentFirstName
   * @param studentLastName The new value for studentLastName
   * @param studentId The new value for studentId
   * @param age The new value for age
   * @param job The new value for job
   */
  public Student(java.lang.CharSequence studentFirstName, java.lang.CharSequence studentLastName, java.lang.CharSequence studentId, java.lang.Integer age, java.lang.CharSequence job) {
    this.studentFirstName = studentFirstName;
    this.studentLastName = studentLastName;
    this.studentId = studentId;
    this.age = age;
    this.job = job;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return studentFirstName;
    case 1: return studentLastName;
    case 2: return studentId;
    case 3: return age;
    case 4: return job;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: studentFirstName = (java.lang.CharSequence)value$; break;
    case 1: studentLastName = (java.lang.CharSequence)value$; break;
    case 2: studentId = (java.lang.CharSequence)value$; break;
    case 3: age = (java.lang.Integer)value$; break;
    case 4: job = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'studentFirstName' field.
   * @return The value of the 'studentFirstName' field.
   */
  public java.lang.CharSequence getStudentFirstName() {
    return studentFirstName;
  }

  /**
   * Sets the value of the 'studentFirstName' field.
   * @param value the value to set.
   */
  public void setStudentFirstName(java.lang.CharSequence value) {
    this.studentFirstName = value;
  }

  /**
   * Gets the value of the 'studentLastName' field.
   * @return The value of the 'studentLastName' field.
   */
  public java.lang.CharSequence getStudentLastName() {
    return studentLastName;
  }

  /**
   * Sets the value of the 'studentLastName' field.
   * @param value the value to set.
   */
  public void setStudentLastName(java.lang.CharSequence value) {
    this.studentLastName = value;
  }

  /**
   * Gets the value of the 'studentId' field.
   * @return The value of the 'studentId' field.
   */
  public java.lang.CharSequence getStudentId() {
    return studentId;
  }

  /**
   * Sets the value of the 'studentId' field.
   * @param value the value to set.
   */
  public void setStudentId(java.lang.CharSequence value) {
    this.studentId = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'job' field.
   * @return The value of the 'job' field.
   */
  public java.lang.CharSequence getJob() {
    return job;
  }

  /**
   * Sets the value of the 'job' field.
   * @param value the value to set.
   */
  public void setJob(java.lang.CharSequence value) {
    this.job = value;
  }

  /**
   * Creates a new Student RecordBuilder.
   * @return A new Student RecordBuilder
   */
  public static com.pblgllgs.dto.Student.Builder newBuilder() {
    return new com.pblgllgs.dto.Student.Builder();
  }

  /**
   * Creates a new Student RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Student RecordBuilder
   */
  public static com.pblgllgs.dto.Student.Builder newBuilder(com.pblgllgs.dto.Student.Builder other) {
    return new com.pblgllgs.dto.Student.Builder(other);
  }

  /**
   * Creates a new Student RecordBuilder by copying an existing Student instance.
   * @param other The existing instance to copy.
   * @return A new Student RecordBuilder
   */
  public static com.pblgllgs.dto.Student.Builder newBuilder(com.pblgllgs.dto.Student other) {
    return new com.pblgllgs.dto.Student.Builder(other);
  }

  /**
   * RecordBuilder for Student instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Student>
    implements org.apache.avro.data.RecordBuilder<Student> {

    private java.lang.CharSequence studentFirstName;
    private java.lang.CharSequence studentLastName;
    private java.lang.CharSequence studentId;
    private int age;
    private java.lang.CharSequence job;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pblgllgs.dto.Student.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.studentFirstName)) {
        this.studentFirstName = data().deepCopy(fields()[0].schema(), other.studentFirstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.studentLastName)) {
        this.studentLastName = data().deepCopy(fields()[1].schema(), other.studentLastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.studentId)) {
        this.studentId = data().deepCopy(fields()[2].schema(), other.studentId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.job)) {
        this.job = data().deepCopy(fields()[4].schema(), other.job);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Student instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pblgllgs.dto.Student other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.studentFirstName)) {
        this.studentFirstName = data().deepCopy(fields()[0].schema(), other.studentFirstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.studentLastName)) {
        this.studentLastName = data().deepCopy(fields()[1].schema(), other.studentLastName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.studentId)) {
        this.studentId = data().deepCopy(fields()[2].schema(), other.studentId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.job)) {
        this.job = data().deepCopy(fields()[4].schema(), other.job);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'studentFirstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getStudentFirstName() {
      return studentFirstName;
    }

    /**
      * Sets the value of the 'studentFirstName' field.
      * @param value The value of 'studentFirstName'.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder setStudentFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.studentFirstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'studentFirstName' field has been set.
      * @return True if the 'studentFirstName' field has been set, false otherwise.
      */
    public boolean hasStudentFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'studentFirstName' field.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder clearStudentFirstName() {
      studentFirstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'studentLastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getStudentLastName() {
      return studentLastName;
    }

    /**
      * Sets the value of the 'studentLastName' field.
      * @param value The value of 'studentLastName'.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder setStudentLastName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.studentLastName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'studentLastName' field has been set.
      * @return True if the 'studentLastName' field has been set, false otherwise.
      */
    public boolean hasStudentLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'studentLastName' field.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder clearStudentLastName() {
      studentLastName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'studentId' field.
      * @return The value.
      */
    public java.lang.CharSequence getStudentId() {
      return studentId;
    }

    /**
      * Sets the value of the 'studentId' field.
      * @param value The value of 'studentId'.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder setStudentId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.studentId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'studentId' field has been set.
      * @return True if the 'studentId' field has been set, false otherwise.
      */
    public boolean hasStudentId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'studentId' field.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder clearStudentId() {
      studentId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder setAge(int value) {
      validate(fields()[3], value);
      this.age = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder clearAge() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'job' field.
      * @return The value.
      */
    public java.lang.CharSequence getJob() {
      return job;
    }

    /**
      * Sets the value of the 'job' field.
      * @param value The value of 'job'.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder setJob(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.job = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'job' field has been set.
      * @return True if the 'job' field has been set, false otherwise.
      */
    public boolean hasJob() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'job' field.
      * @return This builder.
      */
    public com.pblgllgs.dto.Student.Builder clearJob() {
      job = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Student build() {
      try {
        Student record = new Student();
        record.studentFirstName = fieldSetFlags()[0] ? this.studentFirstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.studentLastName = fieldSetFlags()[1] ? this.studentLastName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.studentId = fieldSetFlags()[2] ? this.studentId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.age = fieldSetFlags()[3] ? this.age : (java.lang.Integer) defaultValue(fields()[3]);
        record.job = fieldSetFlags()[4] ? this.job : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Student>
    WRITER$ = (org.apache.avro.io.DatumWriter<Student>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Student>
    READER$ = (org.apache.avro.io.DatumReader<Student>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
