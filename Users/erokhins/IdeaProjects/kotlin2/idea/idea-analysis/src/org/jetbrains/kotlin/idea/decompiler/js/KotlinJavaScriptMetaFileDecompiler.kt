'KotlinMetadataDecompiler<JsMetadataVersion>' @ [31:44] ==> public constructor KotlinMetadataDecompiler<out V : BinaryVersion>(fileType: FileType, targetPlatform: TargetPlatform, serializerProtocol: SerializerExtensionProtocol, flexibleTypeDeserializer: FlexibleTypeDeserializer, expectedBinaryVersion: JsMetadataVersion, invalidBinaryVersion: JsMetadataVersion, stubVersion: Int) defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[ClassConstructorDescriptorImpl]
Inferred types:
    <out V : BinaryVersion> -> JsMetadataVersion

'KotlinJavaScriptMetaFileType' @ [32:9] ==> public object KotlinJavaScriptMetaFileType : FileType defined in org.jetbrains.kotlin.idea.decompiler.js in file KotlinJavaScriptMetaFileType.kt[FakeCallableDescriptorForObject]

'JsPlatform' @ [32:39] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'JsSerializerProtocol' @ [32:51] ==> public object JsSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'DynamicTypeDeserializer' @ [32:73] ==> public object DynamicTypeDeserializer : FlexibleTypeDeserializer defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'INSTANCE' @ [33:27] ==> @field:JvmField public final val INSTANCE: JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedPropertyDescriptor]

'INVALID_VERSION' @ [33:55] ==> @field:JvmField public final val INVALID_VERSION: JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedPropertyDescriptor]

'JS_STUB_VERSION' @ [33:91] ==> public const final val JS_STUB_VERSION: Int defined in org.jetbrains.kotlin.psi.stubs.KotlinStubVersions[DeserializedPropertyDescriptor]

'ByteArrayInputStream' @ [36:22] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'bytes' @ [36:43] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.decompiler.js.KotlinJavaScriptMetaFileDecompiler.readFile[ValueParameterDescriptorImpl]

'JsMetadataVersion' @ [38:23] ==> public companion object defined in org.jetbrains.kotlin.utils.JsMetadataVersion[FakeCallableDescriptorForObject]

'readFrom' @ [38:41] ==> public final fun readFrom(stream: InputStream): JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedSimpleFunctionDescriptor]

'stream' @ [38:50] ==> val stream: ByteArrayInputStream defined in org.jetbrains.kotlin.idea.decompiler.js.KotlinJavaScriptMetaFileDecompiler.readFile[LocalVariableDescriptor]

'!' @ [39:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'version' @ [39:14] ==> val version: JsMetadataVersion defined in org.jetbrains.kotlin.idea.decompiler.js.KotlinJavaScriptMetaFileDecompiler.readFile[LocalVariableDescriptor]

'isCompatible' @ [39:22] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedSimpleFunctionDescriptor]

'Incompatible' @ [40:37] ==> public constructor Incompatible(version: BinaryVersion) defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Incompatible[ClassConstructorDescriptorImpl]

'version' @ [40:50] ==> val version: JsMetadataVersion defined in org.jetbrains.kotlin.idea.decompiler.js.KotlinJavaScriptMetaFileDecompiler.readFile[LocalVariableDescriptor]

'parseDelimitedFrom' @ [43:27] ==> public open fun parseDelimitedFrom(p0: (InputStream..InputStream?)): (JsProtoBuf.Header..JsProtoBuf.Header?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header[JavaMethodDescriptor]

'stream' @ [43:46] ==> val stream: ByteArrayInputStream defined in org.jetbrains.kotlin.idea.decompiler.js.KotlinJavaScriptMetaFileDecompiler.readFile[LocalVariableDescriptor]

'parseFrom' @ [45:46] ==> public open fun parseFrom(p0: (InputStream..InputStream?), p1: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'stream' @ [45:56] ==> val stream: ByteArrayInputStream defined in org.jetbrains.kotlin.idea.decompiler.js.KotlinJavaScriptMetaFileDecompiler.readFile[LocalVariableDescriptor]

'extensionRegistry' @ [45:85] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.js.JsSerializerProtocol[DeserializedPropertyDescriptor]

'Compatible' @ [46:33] ==> public constructor Compatible(proto: ProtoBuf.PackageFragment, serializerProtocol: SerializerExtensionProtocol) defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[ClassConstructorDescriptorImpl]

'proto' @ [46:44] ==> val proto: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.idea.decompiler.js.KotlinJavaScriptMetaFileDecompiler.readFile[LocalVariableDescriptor]

'JsSerializerProtocol' @ [46:51] ==> public object JsSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

