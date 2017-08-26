'AbstractProtoComparisonTest<LocalFileKotlinClass>' @ [30:49] ==> public constructor AbstractProtoComparisonTest<PROTO_DATA>() defined in org.jetbrains.kotlin.jps.incremental.AbstractProtoComparisonTest[ClassConstructorDescriptorImpl]
Inferred types:
    <PROTO_DATA> -> LocalFileKotlinClass

'MockLibraryUtil' @ [32:9] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileKotlin' @ [32:25] ==> @JvmStatic @JvmOverloads public final fun compileKotlin(sourcesPath: String, outDir: File, extraOptions: List<String> = ..., vararg extraClasspath: String): Unit defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'sourceDir' @ [32:39] ==> value-parameter sourceDir: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses[ValueParameterDescriptorImpl]

'path' @ [32:49] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'outputDir' @ [32:55] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses[ValueParameterDescriptorImpl]

'outputDir' @ [34:26] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses[ValueParameterDescriptorImpl]

'walkMatching' @ [34:36] ==> protected final fun File.walkMatching(predicate: (File) -> Boolean): Sequence<File> defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest[SimpleFunctionDescriptorImpl]

'it' @ [34:51] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [34:54] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [34:59] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classFiles' @ [35:31] ==> val classFiles: Sequence<File> defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'map' @ [35:42] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> LocalFileKotlinClass): Sequence<LocalFileKotlinClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> LocalFileKotlinClass

'LocalFileKotlinClass' @ [35:48] ==> public companion object defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[FakeCallableDescriptorForObject]

'create' @ [35:69] ==> public final fun create(file: File): LocalFileKotlinClass? defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [35:76] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'localClassFiles' @ [36:16] ==> val localClassFiles: Sequence<LocalFileKotlinClass> defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses[LocalVariableDescriptor]

'associateBy' @ [36:32] ==> public inline fun <T, K> Sequence<LocalFileKotlinClass>.associateBy(keySelector: (LocalFileKotlinClass) -> ClassId): Map<ClassId, LocalFileKotlinClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFileKotlinClass
    <K> -> ClassId

'it' @ [36:46] ==> value-parameter it: LocalFileKotlinClass defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.compileAndGetClasses.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [36:49] ==> public open val classId: ClassId defined in org.jetbrains.kotlin.incremental.LocalFileKotlinClass[JavaPropertyDescriptor]

'oldData' @ [40:24] ==> value-parameter oldData: LocalFileKotlinClass defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.difference[ValueParameterDescriptorImpl]

'readProto' @ [40:32] ==> private final fun KotlinJvmBinaryClass.readProto(): ProtoMapValue? defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest[SimpleFunctionDescriptorImpl]

'newData' @ [41:24] ==> value-parameter newData: LocalFileKotlinClass defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.difference[ValueParameterDescriptorImpl]

'readProto' @ [41:32] ==> private final fun KotlinJvmBinaryClass.readProto(): ProtoMapValue? defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest[SimpleFunctionDescriptorImpl]

'difference' @ [42:16] ==> public fun difference(oldValue: ProtoMapValue, newValue: ProtoMapValue): Difference defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'oldProto' @ [42:27] ==> val oldProto: ProtoMapValue defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.difference[LocalVariableDescriptor]

'newProto' @ [42:37] ==> val newProto: ProtoMapValue defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.difference[LocalVariableDescriptor]

'assert' @ [46:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classHeader' @ [46:16] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'metadataVersion' @ [46:28] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'isCompatible' @ [46:44] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedSimpleFunctionDescriptor]

'classHeader' @ [46:84] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'location' @ [46:99] ==> public abstract val location: String defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'lazy' @ [48:22] ==> public fun <T> lazy(initializer: () -> ByteArray): Lazy<ByteArray> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'decodeBytes' @ [48:41] ==> @NotNull public open fun decodeBytes(@NotNull p0: (Array<(String..String?)>..Array<out (String..String?)>)): ByteArray defined in org.jetbrains.kotlin.serialization.jvm.BitEncoding[JavaMethodDescriptor]

'classHeader' @ [48:53] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'data' @ [48:65] ==> public final val data: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'lazy' @ [49:24] ==> public fun <T> lazy(initializer: () -> Array<String>): Lazy<Array<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<String>

'classHeader' @ [49:31] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'strings' @ [49:43] ==> public final val strings: Array<String>? defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'when (classHeader.kind) {
            KotlinClassHeader.Kind.CLASS -> {
                ProtoMapValue(false, bytes, strings)
            }
            KotlinClassHeader.Kind.FILE_FACADE,
            KotlinClassHeader.Kind.MULTIFILE_CLASS_PART -> {
                ProtoMapValue(true, bytes, strings)
            }
            else -> {
                null
            }
        }' @ [51:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProtoMapValue?, entry1: ProtoMapValue?, entry2: ProtoMapValue?): ProtoMapValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ProtoMapValue?

'classHeader' @ [51:22] ==> public abstract val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.KotlinJvmBinaryClass[DeserializedPropertyDescriptor]

'kind' @ [51:34] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'CLASS' @ [52:36] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'ProtoMapValue' @ [53:17] ==> public constructor ProtoMapValue(isPackageFacade: Boolean, bytes: ByteArray, strings: Array<String>) defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[DeserializedClassConstructorDescriptor]

'bytes' @ [53:38] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.readProto[LocalVariableDescriptor]

'strings' @ [53:45] ==> val strings: Array<String> defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.readProto[LocalVariableDescriptor]

'FILE_FACADE' @ [55:36] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS_PART' @ [56:36] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'ProtoMapValue' @ [57:17] ==> public constructor ProtoMapValue(isPackageFacade: Boolean, bytes: ByteArray, strings: Array<String>) defined in org.jetbrains.kotlin.incremental.storage.ProtoMapValue[DeserializedClassConstructorDescriptor]

'bytes' @ [57:37] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.readProto[LocalVariableDescriptor]

'strings' @ [57:44] ==> val strings: Array<String> defined in org.jetbrains.kotlin.jps.incremental.AbstractJvmProtoComparisonTest.readProto[LocalVariableDescriptor]

