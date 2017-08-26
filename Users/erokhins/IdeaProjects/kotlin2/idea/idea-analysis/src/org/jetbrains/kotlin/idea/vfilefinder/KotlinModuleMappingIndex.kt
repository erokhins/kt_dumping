'FileBasedIndexExtension<String, PackageParts>' @ [29:35] ==> public constructor FileBasedIndexExtension<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.indexing.FileBasedIndexExtension[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> PackageParts

'create' @ [31:44] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(@NonNls @NotNull p0: String): ID<(String..String?), (PackageParts..PackageParts?)> defined in com.intellij.util.indexing.ID[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.load.kotlin.PackageParts..org.jetbrains.kotlin.load.kotlin.PackageParts?)

'KotlinModuleMappingIndex' @ [31:51] ==> public object KotlinModuleMappingIndex : FileBasedIndexExtension<String, PackageParts> defined in org.jetbrains.kotlin.idea.vfilefinder in file KotlinModuleMappingIndex.kt[FakeCallableDescriptorForObject]

'java' @ [31:83] ==> public val <T> KClass<KotlinModuleMappingIndex>.java: Class<KotlinModuleMappingIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinModuleMappingIndex

'canonicalName' @ [31:88] ==> public final val <T : (Any..Any?)> Class<KotlinModuleMappingIndex>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinModuleMappingIndex

'writeUTF' @ [34:71] ==> public open fun writeUTF(@NotNull p0: DataOutput, @NotNull p1: String): Unit defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'output' @ [34:80] ==> value-parameter output: DataOutput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.KEY_DESCRIPTOR.<no name provided>.save[ValueParameterDescriptorImpl]

'value' @ [34:88] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.KEY_DESCRIPTOR.<no name provided>.save[ValueParameterDescriptorImpl]

'readUTF' @ [36:54] ==> public open fun readUTF(@NotNull p0: DataInput): (String..String?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'input' @ [36:62] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.KEY_DESCRIPTOR.<no name provided>.read[ValueParameterDescriptorImpl]

'value' @ [38:51] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.KEY_DESCRIPTOR.<no name provided>.getHashCode[ValueParameterDescriptorImpl]

'hashCode' @ [38:57] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'val1' @ [40:62] ==> value-parameter val1: String? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.KEY_DESCRIPTOR.<no name provided>.isEqual[ValueParameterDescriptorImpl]

'val2' @ [40:70] ==> value-parameter val2: String? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.KEY_DESCRIPTOR.<no name provided>.isEqual[ValueParameterDescriptorImpl]

'PackageParts' @ [45:17] ==> public constructor PackageParts(packageFqName: String) defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedClassConstructorDescriptor]

'readUTF' @ [45:37] ==> public open fun readUTF(@NotNull p0: DataInput): (String..String?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'input' @ [45:45] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read[ValueParameterDescriptorImpl]

'apply' @ [45:53] ==> @InlineOnly public inline fun <T> PackageParts.apply(block: PackageParts.() -> Unit): PackageParts defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageParts

'readStringList' @ [46:49] ==> public open fun readStringList(p0: (DataInput..DataInput?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'input' @ [46:64] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read[ValueParameterDescriptorImpl]

'readStringList' @ [47:51] ==> public open fun readStringList(p0: (DataInput..DataInput?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'input' @ [47:66] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read[ValueParameterDescriptorImpl]

'component1' @ [48:27] ==> public final operator fun component1(): (String..String?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [48:37] ==> public final operator fun component2(): (String..String?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'shortPartNames' @ [48:52] ==> val shortPartNames: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read.<anonymous>[LocalVariableDescriptor]

'shortFacadeNames' @ [48:71] ==> val shortFacadeNames: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read.<anonymous>[LocalVariableDescriptor]

'addPart' @ [49:25] ==> public final fun addPart(partShortName: String, facadeShortName: String?): Unit defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedSimpleFunctionDescriptor]

'partName' @ [49:33] ==> val partName: (String..String?) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read.<anonymous>[LocalVariableDescriptor]

'if (facadeName.isNotEmpty()) facadeName else null' @ [49:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'facadeName' @ [49:47] ==> val facadeName: (String..String?) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [49:58] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'facadeName' @ [49:72] ==> val facadeName: (String..String?) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read.<anonymous>[LocalVariableDescriptor]

'readStringList' @ [51:28] ==> public open fun readStringList(p0: (DataInput..DataInput?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'input' @ [51:43] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read[ValueParameterDescriptorImpl]

'forEach' @ [51:50] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'this' @ [51:58] ==> <this> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.read.<anonymous>[ReceiverParameterDescriptorImpl]

'addMetadataPart' @ [51:64] ==> public final fun addMetadataPart(shortName: String): Unit defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedSimpleFunctionDescriptor]

'writeUTF' @ [55:20] ==> public open fun writeUTF(@NotNull p0: DataOutput, @NotNull p1: String): Unit defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'out' @ [55:29] ==> value-parameter out: DataOutput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'value' @ [55:34] ==> value-parameter value: PackageParts defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'packageFqName' @ [55:40] ==> public final val packageFqName: String defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'writeStringList' @ [56:20] ==> public open fun writeStringList(p0: (DataOutput..DataOutput?), p1: (MutableCollection<(String..String?)>..Collection<(String..String?)>?)): Unit defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'out' @ [56:36] ==> value-parameter out: DataOutput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'value' @ [56:41] ==> value-parameter value: PackageParts defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'parts' @ [56:47] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'writeStringList' @ [57:20] ==> public open fun writeStringList(p0: (DataOutput..DataOutput?), p1: (MutableCollection<(String..String?)>..Collection<(String..String?)>?)): Unit defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'out' @ [57:36] ==> value-parameter out: DataOutput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'value' @ [57:41] ==> value-parameter value: PackageParts defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'parts' @ [57:47] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'map' @ [57:53] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'value' @ [57:59] ==> value-parameter value: PackageParts defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'getMultifileFacadeName' @ [57:65] ==> public final fun getMultifileFacadeName(partShortName: String): String? defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedSimpleFunctionDescriptor]

'it' @ [57:88] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [57:92] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'writeStringList' @ [58:20] ==> public open fun writeStringList(p0: (DataOutput..DataOutput?), p1: (MutableCollection<(String..String?)>..Collection<(String..String?)>?)): Unit defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'out' @ [58:36] ==> value-parameter out: DataOutput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'value' @ [58:41] ==> value-parameter value: PackageParts defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.VALUE_EXTERNALIZER.<no name provided>.save[ValueParameterDescriptorImpl]

'metadataParts' @ [58:47] ==> public final val metadataParts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'KEY' @ [62:30] ==> public final val KEY: ID<String, PackageParts> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex[PropertyDescriptorImpl]

'KEY_DESCRIPTOR' @ [66:39] ==> private final val KEY_DESCRIPTOR: <no name provided> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex[PropertyDescriptorImpl]

'VALUE_EXTERNALIZER' @ [68:43] ==> private final val VALUE_EXTERNALIZER: <no name provided> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex[PropertyDescriptorImpl]

'InputFilter' @ [71:31] ==> @FunctionalInterface public final fun InputFilter(function: (VirtualFile) -> Boolean): FileBasedIndex.InputFilter defined in com.intellij.util.indexing.FileBasedIndex[SamConstructorDescriptorImpl]

'file' @ [71:53] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getInputFilter.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [71:58] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'MAPPING_FILE_EXT' @ [71:85] ==> @field:JvmField public final val MAPPING_FILE_EXT: String defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedPropertyDescriptor]

'DataIndexer' @ [77:16] ==> public fun <Key : (Any..Any?), Value : (Any..Any?), Data : (Any..Any?)> DataIndexer(function: (FileContent) -> (MutableMap<(String..String?), (PackageParts..PackageParts?)>..Map<(String..String?), (PackageParts..PackageParts?)>)): DataIndexer<String, PackageParts, FileContent> defined in com.intellij.util.indexing[SimpleFunctionDescriptorImpl]
Inferred types:
    <Key : (Any..Any?)> -> String
    <Value : (Any..Any?)> -> PackageParts
    <Data : (Any..Any?)> -> FileContent

'inputData' @ [78:27] ==> value-parameter inputData: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [78:37] ==> public final val FileContent.content: ByteArray[MyPropertyDescriptor]

'inputData' @ [79:24] ==> value-parameter inputData: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [79:34] ==> public final val FileContent.file: VirtualFile[MyPropertyDescriptor]

'ModuleMapping' @ [81:37] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'create' @ [81:51] ==> public final fun create(bytes: ByteArray?, debugName: String, configuration: DeserializationConfiguration): ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedSimpleFunctionDescriptor]

'content' @ [81:58] ==> val content: ByteArray defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[LocalVariableDescriptor]

'file' @ [81:67] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[LocalVariableDescriptor]

'toString' @ [81:72] ==> public open fun toString(): String defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'Default' @ [81:113] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'moduleMapping' @ [82:21] ==> val moduleMapping: ModuleMapping defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[LocalVariableDescriptor]

'ModuleMapping' @ [82:39] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'CORRUPTED' @ [82:53] ==> @field:JvmField public final val CORRUPTED: ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedPropertyDescriptor]

'file' @ [83:21] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[LocalVariableDescriptor]

'refresh' @ [83:26] ==> public open fun refresh(p0: Boolean, p1: Boolean): Unit defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'moduleMapping' @ [85:36] ==> val moduleMapping: ModuleMapping defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[LocalVariableDescriptor]

'packageFqName2Parts' @ [85:50] ==> public final val packageFqName2Parts: Map<String, PackageParts> defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[DeserializedPropertyDescriptor]

'RuntimeException' @ [88:23] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'file' @ [88:60] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[LocalVariableDescriptor]

'e' @ [88:67] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinModuleMappingIndex.getIndexer.<anonymous>[LocalVariableDescriptor]

