'KotlinMetadataVersionIndexBase<KotlinJvmMetadataVersionIndex, JvmMetadataVersion>' @ [31:40] ==> public constructor KotlinMetadataVersionIndexBase<T, V : BinaryVersion>(classOfIndex: Class<KotlinJvmMetadataVersionIndex>, createBinaryVersion: (IntArray) -> JvmMetadataVersion) defined in org.jetbrains.kotlin.idea.versions.KotlinMetadataVersionIndexBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> KotlinJvmMetadataVersionIndex
    <V : BinaryVersion> -> JvmMetadataVersion

'KotlinJvmMetadataVersionIndex' @ [32:9] ==> public object KotlinJvmMetadataVersionIndex : KotlinMetadataVersionIndexBase<KotlinJvmMetadataVersionIndex, JvmMetadataVersion> defined in org.jetbrains.kotlin.idea.versions in file KotlinJvmMetadataVersionIndex.kt[FakeCallableDescriptorForObject]

'java' @ [32:46] ==> public val <T> KClass<KotlinJvmMetadataVersionIndex>.java: Class<KotlinJvmMetadataVersionIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinJvmMetadataVersionIndex

'JvmMetadataVersion' @ [32:54] ==> public constructor JvmMetadataVersion(vararg numbers: Int) defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedClassConstructorDescriptor]

'it' @ [32:74] ==> value-parameter it: IntArray defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.<init>.<anonymous>[ValueParameterDescriptorImpl]

'INDEXER' @ [34:33] ==> private final val INDEXER: DataIndexer<JvmMetadataVersion, Void, FileContent> defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex[PropertyDescriptorImpl]

'InputFilter' @ [36:52] ==> @FunctionalInterface public final fun InputFilter(function: (VirtualFile) -> Boolean): FileBasedIndex.InputFilter defined in com.intellij.util.indexing.FileBasedIndex[SamConstructorDescriptorImpl]

'file' @ [36:74] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.getInputFilter.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [36:79] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'CLASS' @ [36:104] ==> public final val CLASS: (FileType..FileType?) defined in com.intellij.openapi.fileTypes.StdFileTypes[JavaPropertyDescriptor]

'VERSION' @ [38:33] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex[PropertyDescriptorImpl]

'setOf' @ [42:32] ==> public fun <T> setOf(vararg elements: KotlinClassHeader.Kind): Set<KotlinClassHeader.Kind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Kind

'CLASS' @ [43:36] ==> enum entry CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'FILE_FACADE' @ [44:36] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS' @ [45:36] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'DataIndexer' @ [48:27] ==> public fun <Key : (Any..Any?), Value : (Any..Any?), Data : (Any..Any?)> DataIndexer(function: (FileContent) -> (MutableMap<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>..Map<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>)): DataIndexer<JvmMetadataVersion, Void, FileContent> defined in com.intellij.util.indexing[SimpleFunctionDescriptorImpl]
Inferred types:
    <Key : (Any..Any?)> -> JvmMetadataVersion
    <Value : (Any..Any?)> -> Void
    <Data : (Any..Any?)> -> FileContent

'tryBlock' @ [53:9] ==> protected final inline fun tryBlock(inputData: FileContent, body: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex[SimpleFunctionDescriptorImpl]

'inputData' @ [53:18] ==> value-parameter inputData: FileContent defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'ClassReader' @ [54:31] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'inputData' @ [54:43] ==> value-parameter inputData: FileContent defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [54:53] ==> public final val FileContent.content: ByteArray[MyPropertyDescriptor]

'classReader' @ [55:13] ==> val classReader: ClassReader defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>[LocalVariableDescriptor]

'accept' @ [55:25] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [55:41] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM6' @ [55:62] ==> public const final val ASM6: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'desc' @ [57:25] ==> value-parameter desc: String defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'METADATA_DESC' @ [57:33] ==> public const final val METADATA_DESC: (String..String?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'annotationPresent' @ [59:21] ==> var annotationPresent: Boolean defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'AnnotationVisitor' @ [60:37] ==> public constructor AnnotationVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaClassConstructorDescriptor]

'ASM6' @ [60:63] ==> public const final val ASM6: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'when (name) {
                                METADATA_VERSION_FIELD_NAME -> if (value is IntArray) {
                                    version = createBinaryVersion(value)
                                }
                                KIND_FIELD_NAME -> if (value is Int) {
                                    kind = KotlinClassHeader.Kind.getById(value)
                                }
                            }' @ [62:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'name' @ [62:35] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'METADATA_VERSION_FIELD_NAME' @ [63:33] ==> public const final val METADATA_VERSION_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'value' @ [63:68] ==> value-parameter value: Any defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'version' @ [64:37] ==> var version: JvmMetadataVersion? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'invoke' @ [64:47] ==> public abstract operator fun invoke(p1: IntArray): JvmMetadataVersion defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [64:67] ==> value-parameter value: Any defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'KIND_FIELD_NAME' @ [66:33] ==> public const final val KIND_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'value' @ [66:56] ==> value-parameter value: Any defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'kind' @ [67:37] ==> var kind: KotlinClassHeader.Kind? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'getById' @ [67:67] ==> @JvmStatic public final fun getById(id: Int): KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind.Companion[DeserializedSimpleFunctionDescriptor]

'value' @ [67:75] ==> value-parameter value: Any defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'or' @ [73:16] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SKIP_CODE' @ [73:28] ==> public const final val SKIP_CODE: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_DEBUG' @ [73:53] ==> public const final val SKIP_DEBUG: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_FRAMES' @ [73:79] ==> public const final val SKIP_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'if (kind !in kindsToIndex) {
            // Do not index metadata version for synthetic classes
            version = null
        }
        else if (annotationPresent && version == null) {
            // No version at all because the class is too old, or version is set to something weird
            version = JvmMetadataVersion.INVALID_VERSION
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'kind' @ [76:13] ==> var kind: KotlinClassHeader.Kind? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'kindsToIndex' @ [76:22] ==> private final val kindsToIndex: Set<KotlinClassHeader.Kind> defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex[PropertyDescriptorImpl]

'version' @ [78:13] ==> var version: JvmMetadataVersion? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'annotationPresent' @ [80:18] ==> var annotationPresent: Boolean defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'version' @ [80:39] ==> var version: JvmMetadataVersion? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'version' @ [82:13] ==> var version: JvmMetadataVersion? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'JvmMetadataVersion' @ [82:23] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[FakeCallableDescriptorForObject]

'INVALID_VERSION' @ [82:42] ==> @field:JvmField public final val INVALID_VERSION: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion.Companion[DeserializedPropertyDescriptor]

'if (version != null) mapOf(version!! to null) else mapOf()' @ [85:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (MutableMap<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>..Map<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>), elseBranch: (MutableMap<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>..Map<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>)): (MutableMap<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>..Map<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.MutableMap<(org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion..org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion?), (java.lang.Void..java.lang.Void?)>..kotlin.collections.Map<(org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion..org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion?), (java.lang.Void..java.lang.Void?)>)

'version' @ [85:13] ==> var version: JvmMetadataVersion? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'mapOf' @ [85:30] ==> public fun <K, V> mapOf(pair: Pair<(JvmMetadataVersion..JvmMetadataVersion?), Nothing?>): Map<(JvmMetadataVersion..JvmMetadataVersion?), Nothing?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion..org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion?)
    <V> -> Nothing?

'version' @ [85:36] ==> var version: JvmMetadataVersion? defined in org.jetbrains.kotlin.idea.versions.KotlinJvmMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'mapOf' @ [85:60] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<(JvmMetadataVersion..JvmMetadataVersion?), (Void..Void?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion..org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion?)
    <V> -> (java.lang.Void..java.lang.Void?)

