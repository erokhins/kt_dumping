'KotlinMetadataDecompiler<BuiltInsBinaryVersion>' @ [34:33] ==> public constructor KotlinMetadataDecompiler<out V : BinaryVersion>(fileType: FileType, targetPlatform: TargetPlatform, serializerProtocol: SerializerExtensionProtocol, flexibleTypeDeserializer: FlexibleTypeDeserializer, expectedBinaryVersion: BuiltInsBinaryVersion, invalidBinaryVersion: BuiltInsBinaryVersion, stubVersion: Int) defined in org.jetbrains.kotlin.idea.decompiler.common.KotlinMetadataDecompiler[ClassConstructorDescriptorImpl]
Inferred types:
    <out V : BinaryVersion> -> BuiltInsBinaryVersion

'KotlinBuiltInFileType' @ [35:9] ==> public object KotlinBuiltInFileType : FileType defined in org.jetbrains.kotlin.idea.decompiler.builtIns in file KotlinBuiltInFileType.kt[FakeCallableDescriptorForObject]

'Default' @ [35:47] ==> public object Default : TargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[FakeCallableDescriptorForObject]

'BuiltInSerializerProtocol' @ [35:56] ==> public object BuiltInSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.builtins[FakeCallableDescriptorForObject]

'ThrowException' @ [36:34] ==> public object ThrowException : FlexibleTypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.FlexibleTypeDeserializer[FakeCallableDescriptorForObject]

'INSTANCE' @ [36:72] ==> @field:JvmField public final val INSTANCE: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion.Companion[DeserializedPropertyDescriptor]

'INVALID_VERSION' @ [36:104] ==> @field:JvmField public final val INVALID_VERSION: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion.Companion[DeserializedPropertyDescriptor]

'BUILTIN_STUB_VERSION' @ [37:28] ==> public const final val BUILTIN_STUB_VERSION: Int defined in org.jetbrains.kotlin.psi.stubs.KotlinStubVersions[DeserializedPropertyDescriptor]

'BuiltInDefinitionFile' @ [40:16] ==> public companion object defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[FakeCallableDescriptorForObject]

'read' @ [40:38] ==> public final fun read(contents: ByteArray, file: VirtualFile): FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion[SimpleFunctionDescriptorImpl]

'bytes' @ [40:43] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.idea.decompiler.builtIns.KotlinBuiltInDecompiler.readFile[ValueParameterDescriptorImpl]

'file' @ [40:50] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.builtIns.KotlinBuiltInDecompiler.readFile[ValueParameterDescriptorImpl]

'FileWithMetadata.Compatible' @ [48:5] ==> public constructor Compatible(proto: ProtoBuf.PackageFragment, serializerProtocol: SerializerExtensionProtocol) defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[ClassConstructorDescriptorImpl]

'proto' @ [48:33] ==> value-parameter proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.<init>[ValueParameterDescriptorImpl]

'BuiltInSerializerProtocol' @ [48:40] ==> public object BuiltInSerializerProtocol : SerializerExtensionProtocol defined in org.jetbrains.kotlin.builtins[FakeCallableDescriptorForObject]

'super' @ [50:17] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[LazyClassReceiverParameterDescriptor]

'classesToDecompile' @ [50:23] ==> public open val classesToDecompile: List<ProtoBuf.Class> defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Compatible[PropertyDescriptorImpl]

'let' @ [50:42] ==> @InlineOnly public inline fun <T, R> List<ProtoBuf.Class>.let(block: (List<ProtoBuf.Class>) -> List<ProtoBuf.Class>): List<ProtoBuf.Class> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Class>
    <R> -> List<Class>

'if (isMetadata || !FILTER_OUT_CLASSES_EXISTING_AS_JVM_CLASS_FILES) classes
            else classes.filter { classProto ->
                shouldDecompileBuiltInClass(nameResolver.getClassId(classProto.fqName))
            }' @ [51:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ProtoBuf.Class>, elseBranch: List<ProtoBuf.Class>): List<ProtoBuf.Class>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Class>

'isMetadata' @ [51:17] ==> public final val isMetadata: Boolean defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'!' @ [51:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'FILTER_OUT_CLASSES_EXISTING_AS_JVM_CLASS_FILES' @ [51:32] ==> public final var FILTER_OUT_CLASSES_EXISTING_AS_JVM_CLASS_FILES: Boolean defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion[PropertyDescriptorImpl]

'classes' @ [51:80] ==> value-parameter classes: List<ProtoBuf.Class> defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.<get-classesToDecompile>.<anonymous>[ValueParameterDescriptorImpl]

'classes' @ [52:18] ==> value-parameter classes: List<ProtoBuf.Class> defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.<get-classesToDecompile>.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [52:26] ==> public inline fun <T> Iterable<ProtoBuf.Class>.filter(predicate: (ProtoBuf.Class) -> Boolean): List<ProtoBuf.Class> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class

'shouldDecompileBuiltInClass' @ [53:17] ==> private final fun shouldDecompileBuiltInClass(classId: ClassId): Boolean defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[SimpleFunctionDescriptorImpl]

'nameResolver' @ [53:45] ==> public final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'getClassId' @ [53:58] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'classProto' @ [53:69] ==> value-parameter classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.<get-classesToDecompile>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [53:80] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'classId' @ [58:36] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.shouldDecompileBuiltInClass[ValueParameterDescriptorImpl]

'shortClassName' @ [58:44] ==> public final val ClassId.shortClassName: Name[MyPropertyDescriptor]

'asString' @ [58:59] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'INSTANCE' @ [58:96] ==> public final val INSTANCE: (JavaClassFileType..JavaClassFileType?) defined in com.intellij.ide.highlighter.JavaClassFileType[JavaPropertyDescriptor]

'defaultExtension' @ [58:105] ==> public final val JavaClassFileType.defaultExtension: String[MyPropertyDescriptor]

'packageDirectory' @ [59:16] ==> public final val packageDirectory: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'findChild' @ [59:33] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'realJvmClassFileName' @ [59:43] ==> val realJvmClassFileName: String defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.shouldDecompileBuiltInClass[LocalVariableDescriptor]

'TestOnly' @ [64:13] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'ByteArrayInputStream' @ [67:26] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'contents' @ [67:47] ==> value-parameter contents: ByteArray defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[ValueParameterDescriptorImpl]

'BuiltInsBinaryVersion' @ [69:27] ==> public companion object defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion[FakeCallableDescriptorForObject]

'readFrom' @ [69:49] ==> public final fun readFrom(stream: InputStream): BuiltInsBinaryVersion defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion.Companion[DeserializedSimpleFunctionDescriptor]

'stream' @ [69:58] ==> val stream: ByteArrayInputStream defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'!' @ [70:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'version' @ [70:18] ==> val version: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'isCompatible' @ [70:26] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.builtins.BuiltInsBinaryVersion[DeserializedSimpleFunctionDescriptor]

'Incompatible' @ [71:41] ==> public constructor Incompatible(version: BinaryVersion) defined in org.jetbrains.kotlin.idea.decompiler.common.FileWithMetadata.Incompatible[ClassConstructorDescriptorImpl]

'version' @ [71:54] ==> val version: BuiltInsBinaryVersion defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'parseFrom' @ [74:50] ==> public open fun parseFrom(p0: (InputStream..InputStream?), p1: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'stream' @ [74:60] ==> val stream: ByteArrayInputStream defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'extensionRegistry' @ [74:94] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.builtins.BuiltInSerializerProtocol[DeserializedPropertyDescriptor]

'BuiltInDefinitionFile' @ [75:26] ==> public constructor BuiltInDefinitionFile(proto: ProtoBuf.PackageFragment, packageDirectory: VirtualFile, isMetadata: Boolean) defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[ClassConstructorDescriptorImpl]

'proto' @ [75:48] ==> val proto: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'file' @ [75:55] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[ValueParameterDescriptorImpl]

'parent' @ [75:60] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [75:68] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[ValueParameterDescriptorImpl]

'extension' @ [75:73] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'METADATA_FILE_EXTENSION' @ [75:110] ==> public final val METADATA_FILE_EXTENSION: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.Companion[DeserializedPropertyDescriptor]

'result' @ [76:32] ==> val result: BuiltInDefinitionFile defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'proto' @ [76:39] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'`package`' @ [76:45] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'result' @ [77:17] ==> val result: BuiltInDefinitionFile defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'classesToDecompile' @ [77:24] ==> public open val classesToDecompile: List<ProtoBuf.Class> defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'isEmpty' @ [77:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'packageProto' @ [78:17] ==> val packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'typeAliasCount' @ [78:30] ==> public final val ProtoBuf.Package.typeAliasCount: Int[MyPropertyDescriptor]

'packageProto' @ [78:53] ==> val packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'functionCount' @ [78:66] ==> public final val ProtoBuf.Package.functionCount: Int[MyPropertyDescriptor]

'packageProto' @ [78:88] ==> val packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

'propertyCount' @ [78:101] ==> public final val ProtoBuf.Package.propertyCount: Int[MyPropertyDescriptor]

'result' @ [83:20] ==> val result: BuiltInDefinitionFile defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion.read[LocalVariableDescriptor]

