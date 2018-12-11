// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: openadx-ext.proto

package ai.houyi.openssp.rtb.proto;

public final class OpenAdxExt {
  private OpenAdxExt() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registry.add(ai.houyi.openssp.rtb.proto.OpenAdxExt.ext);
  }
  public interface BidExtOrBuilder extends
      // @@protoc_insertion_point(interface_extends:openadx.BidExt)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    com.google.protobuf.ProtocolStringList
        getImpTrackersList();
    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    int getImpTrackersCount();
    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    java.lang.String getImpTrackers(int index);
    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    com.google.protobuf.ByteString
        getImpTrackersBytes(int index);

    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    com.google.protobuf.ProtocolStringList
        getClkTrackersList();
    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    int getClkTrackersCount();
    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    java.lang.String getClkTrackers(int index);
    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    com.google.protobuf.ByteString
        getClkTrackersBytes(int index);
  }
  /**
   * Protobuf type {@code openadx.BidExt}
   */
  public static final class BidExt extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:openadx.BidExt)
      BidExtOrBuilder {
    // Use BidExt.newBuilder() to construct.
    private BidExt(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BidExt(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BidExt defaultInstance;
    public static BidExt getDefaultInstance() {
      return defaultInstance;
    }

    public BidExt getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BidExt(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                impTrackers_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              impTrackers_.add(bs);
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                clkTrackers_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              clkTrackers_.add(bs);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          impTrackers_ = impTrackers_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          clkTrackers_ = clkTrackers_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.houyi.openssp.rtb.proto.OpenAdxExt.internal_static_openadx_BidExt_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.houyi.openssp.rtb.proto.OpenAdxExt.internal_static_openadx_BidExt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.class, ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.Builder.class);
    }

    public static com.google.protobuf.Parser<BidExt> PARSER =
        new com.google.protobuf.AbstractParser<BidExt>() {
      public BidExt parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BidExt(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BidExt> getParserForType() {
      return PARSER;
    }

    public static final int IMP_TRACKERS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList impTrackers_;
    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getImpTrackersList() {
      return impTrackers_;
    }
    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    public int getImpTrackersCount() {
      return impTrackers_.size();
    }
    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    public java.lang.String getImpTrackers(int index) {
      return impTrackers_.get(index);
    }
    /**
     * <code>repeated string imp_trackers = 1;</code>
     *
     * <pre>
     *曝光监测地址，支持宏
     * </pre>
     */
    public com.google.protobuf.ByteString
        getImpTrackersBytes(int index) {
      return impTrackers_.getByteString(index);
    }

    public static final int CLK_TRACKERS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList clkTrackers_;
    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getClkTrackersList() {
      return clkTrackers_;
    }
    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    public int getClkTrackersCount() {
      return clkTrackers_.size();
    }
    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    public java.lang.String getClkTrackers(int index) {
      return clkTrackers_.get(index);
    }
    /**
     * <code>repeated string clk_trackers = 2;</code>
     *
     * <pre>
     *点击监测地址，支持宏
     * </pre>
     */
    public com.google.protobuf.ByteString
        getClkTrackersBytes(int index) {
      return clkTrackers_.getByteString(index);
    }

    private void initFields() {
      impTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      clkTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < impTrackers_.size(); i++) {
        output.writeBytes(1, impTrackers_.getByteString(i));
      }
      for (int i = 0; i < clkTrackers_.size(); i++) {
        output.writeBytes(2, clkTrackers_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < impTrackers_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(impTrackers_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getImpTrackersList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < clkTrackers_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(clkTrackers_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getClkTrackersList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code openadx.BidExt}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:openadx.BidExt)
        ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExtOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ai.houyi.openssp.rtb.proto.OpenAdxExt.internal_static_openadx_BidExt_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ai.houyi.openssp.rtb.proto.OpenAdxExt.internal_static_openadx_BidExt_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.class, ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.Builder.class);
      }

      // Construct using ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        impTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        clkTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ai.houyi.openssp.rtb.proto.OpenAdxExt.internal_static_openadx_BidExt_descriptor;
      }

      public ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt getDefaultInstanceForType() {
        return ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.getDefaultInstance();
      }

      public ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt build() {
        ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt buildPartial() {
        ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt result = new ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          impTrackers_ = impTrackers_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.impTrackers_ = impTrackers_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          clkTrackers_ = clkTrackers_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.clkTrackers_ = clkTrackers_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt) {
          return mergeFrom((ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt other) {
        if (other == ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.getDefaultInstance()) return this;
        if (!other.impTrackers_.isEmpty()) {
          if (impTrackers_.isEmpty()) {
            impTrackers_ = other.impTrackers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureImpTrackersIsMutable();
            impTrackers_.addAll(other.impTrackers_);
          }
          onChanged();
        }
        if (!other.clkTrackers_.isEmpty()) {
          if (clkTrackers_.isEmpty()) {
            clkTrackers_ = other.clkTrackers_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureClkTrackersIsMutable();
            clkTrackers_.addAll(other.clkTrackers_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.LazyStringList impTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureImpTrackersIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          impTrackers_ = new com.google.protobuf.LazyStringArrayList(impTrackers_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public com.google.protobuf.ProtocolStringList
          getImpTrackersList() {
        return impTrackers_.getUnmodifiableView();
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public int getImpTrackersCount() {
        return impTrackers_.size();
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public java.lang.String getImpTrackers(int index) {
        return impTrackers_.get(index);
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public com.google.protobuf.ByteString
          getImpTrackersBytes(int index) {
        return impTrackers_.getByteString(index);
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public Builder setImpTrackers(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureImpTrackersIsMutable();
        impTrackers_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public Builder addImpTrackers(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureImpTrackersIsMutable();
        impTrackers_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public Builder addAllImpTrackers(
          java.lang.Iterable<java.lang.String> values) {
        ensureImpTrackersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, impTrackers_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public Builder clearImpTrackers() {
        impTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string imp_trackers = 1;</code>
       *
       * <pre>
       *曝光监测地址，支持宏
       * </pre>
       */
      public Builder addImpTrackersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureImpTrackersIsMutable();
        impTrackers_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList clkTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureClkTrackersIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          clkTrackers_ = new com.google.protobuf.LazyStringArrayList(clkTrackers_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public com.google.protobuf.ProtocolStringList
          getClkTrackersList() {
        return clkTrackers_.getUnmodifiableView();
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public int getClkTrackersCount() {
        return clkTrackers_.size();
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public java.lang.String getClkTrackers(int index) {
        return clkTrackers_.get(index);
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public com.google.protobuf.ByteString
          getClkTrackersBytes(int index) {
        return clkTrackers_.getByteString(index);
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public Builder setClkTrackers(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureClkTrackersIsMutable();
        clkTrackers_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public Builder addClkTrackers(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureClkTrackersIsMutable();
        clkTrackers_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public Builder addAllClkTrackers(
          java.lang.Iterable<java.lang.String> values) {
        ensureClkTrackersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clkTrackers_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public Builder clearClkTrackers() {
        clkTrackers_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string clk_trackers = 2;</code>
       *
       * <pre>
       *点击监测地址，支持宏
       * </pre>
       */
      public Builder addClkTrackersBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureClkTrackersIsMutable();
        clkTrackers_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:openadx.BidExt)
    }

    static {
      defaultInstance = new BidExt(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:openadx.BidExt)
  }

  public static final int EXT_FIELD_NUMBER = 201;
  /**
   * <code>extend .openrtb.BidResponse.SeatBid.Bid { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      ai.houyi.openssp.rtb.proto.OpenRtb.BidResponse.SeatBid.Bid,
      ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt> ext = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.class,
        ai.houyi.openssp.rtb.proto.OpenAdxExt.BidExt.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_openadx_BidExt_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_openadx_BidExt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021openadx-ext.proto\022\007openadx\032\ropenrtb.pr" +
      "oto\"4\n\006BidExt\022\024\n\014imp_trackers\030\001 \003(\t\022\024\n\014c" +
      "lk_trackers\030\002 \003(\t:?\n\003ext\022 .openrtb.BidRe" +
      "sponse.SeatBid.Bid\030\311\001 \001(\0132\017.openadx.BidE" +
      "xtB(\n\032ai.houyi.openssp.rtb.protoB\nOpenAd" +
      "xExt"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ai.houyi.openssp.rtb.proto.OpenRtb.getDescriptor(),
        }, assigner);
    internal_static_openadx_BidExt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_openadx_BidExt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_openadx_BidExt_descriptor,
        new java.lang.String[] { "ImpTrackers", "ClkTrackers", });
    ext.internalInit(descriptor.getExtensions().get(0));
    ai.houyi.openssp.rtb.proto.OpenRtb.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}