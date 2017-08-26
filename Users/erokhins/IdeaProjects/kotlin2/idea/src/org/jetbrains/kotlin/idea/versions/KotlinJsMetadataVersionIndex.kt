'KotlinMetadataVersionIndexBase<KotlinJsMetadataVersionIndex, JsMetadataVersion>' @ [28:39] ==> public constructor KotlinMetadataVersionIndexBase<T, V : BinaryVersion>(classOfIndex: Class<KotlinJsMetadataVersionIndex>, createBinaryVersion: (IntArray) -> JsMetadataVersion) defined in org.jetbrains.kotlin.idea.versions.KotlinMetadataVersionIndexBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> KotlinJsMetadataVersionIndex
    <V : BinaryVersion> -> JsMetadataVersion

'KotlinJsMetadataVersionIndex' @ [29:9] ==> public object KotlinJsMetadataVersionIndex : KotlinMetadataVersionIndexBase<KotlinJsMetadataVersionIndex, JsMetadataVersion> defined in org.jetbrains.kotlin.idea.versions in file KotlinJsMetadataVersionIndex.kt[FakeCallableDescriptorForObject]

'java' @ [29:45] ==> public val <T> KClass<KotlinJsMetadataVersionIndex>.java: Class<KotlinJsMetadataVersionIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinJsMetadataVersionIndex

'JsMetadataVersion' @ [29:53] ==> public constructor JsMetadataVersion(vararg numbers: Int) defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedClassConstructorDescriptor]

'it' @ [29:72] ==> value-parameter it: IntArray defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.<init>.<anonymous>[ValueParameterDescriptorImpl]

'INDEXER' @ [31:33] ==> private final val INDEXER: DataIndexer<JsMetadataVersion, Void, FileContent> defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex[PropertyDescriptorImpl]

'InputFilter' @ [33:52] ==> @FunctionalInterface public final fun InputFilter(function: (VirtualFile) -> Boolean): FileBasedIndex.InputFilter defined in com.intellij.util.indexing.FileBasedIndex[SimpleFunctionDescriptorImpl]

'JavaScript' @ [33:74] ==> public object JavaScript defined in org.jetbrains.kotlin.js[FakeCallableDescriptorForObject]

'EXTENSION' @ [33:85] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.js.JavaScript[DeserializedPropertyDescriptor]

'file' @ [33:98] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.getInputFilter.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [33:103] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'VERSION' @ [35:33] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex[PropertyDescriptorImpl]

'DataIndexer' @ [39:27] ==> public fun <Key : (Any..Any?), Value : (Any..Any?), Data : (Any..Any?)> DataIndexer(function: (FileContent) -> (MutableMap<(JsMetadataVersion..JsMetadataVersion?), (Void..Void?)>..Map<(JsMetadataVersion..JsMetadataVersion?), (Void..Void?)>)): DataIndexer<JsMetadataVersion, Void, FileContent> defined in com.intellij.util.indexing[SimpleFunctionDescriptorImpl]
Inferred types:
    <Key : (Any..Any?)> -> JsMetadataVersion
    <Value : (Any..Any?)> -> Void
    <Data : (Any..Any?)> -> FileContent

'HashMap' @ [40:22] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> JsMetadataVersion
    <V : (Any..Any?)> -> Void?

'tryBlock' @ [42:9] ==> protected final inline fun tryBlock(inputData: FileContent, body: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex[SimpleFunctionDescriptorImpl]

'inputData' @ [42:18] ==> value-parameter inputData: FileContent defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [43:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinJavascriptMetadata

'KotlinJavascriptMetadataUtils' @ [44:13] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'parseMetadata' @ [44:43] ==> @JvmStatic public final fun parseMetadata(text: CharSequence, metadataList: MutableList<KotlinJavascriptMetadata>): Unit defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedSimpleFunctionDescriptor]

'inputData' @ [44:57] ==> value-parameter inputData: FileContent defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'contentAsText' @ [44:67] ==> public final val FileContent.contentAsText: CharSequence[MyPropertyDescriptor]

'metadataList' @ [44:82] ==> val metadataList: ArrayList<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>[LocalVariableDescriptor]

'metadataList' @ [45:30] ==> val metadataList: ArrayList<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>[LocalVariableDescriptor]

'metadata' @ [46:31] ==> val metadata: KotlinJavascriptMetadata defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>[LocalVariableDescriptor]

'version' @ [46:40] ==> public final val version: JsMetadataVersion defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadata[DeserializedPropertyDescriptor]

'takeIf' @ [46:48] ==> @InlineOnly @SinceKotlin public inline fun <T> JsMetadataVersion.takeIf(predicate: (JsMetadataVersion) -> Boolean): JsMetadataVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsMetadataVersion

'it' @ [46:57] ==> value-parameter it: JsMetadataVersion defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isCompatible' @ [46:60] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedSimpleFunctionDescriptor]

'JsMetadataVersion' @ [48:34] ==> public companion object defined in org.jetbrains.kotlin.utils.JsMetadataVersion[FakeCallableDescriptorForObject]

'INVALID_VERSION' @ [48:52] ==> @field:JvmField public final val INVALID_VERSION: JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedPropertyDescriptor]

'result' @ [49:17] ==> val result: HashMap<JsMetadataVersion, Void?> defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'version' @ [49:24] ==> val version: JsMetadataVersion defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>.<anonymous>[LocalVariableDescriptor]

'result' @ [53:9] ==> val result: HashMap<JsMetadataVersion, Void?> defined in org.jetbrains.kotlin.idea.versions.KotlinJsMetadataVersionIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

