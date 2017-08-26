'ScalarIndexExtension<FqName>' @ [40:65] ==> public constructor ScalarIndexExtension<K : (Any..Any?)>() defined in com.intellij.util.indexing.ScalarIndexExtension[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName

'create' @ [41:36] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(@NonNls @NotNull p0: String): ID<(FqName..FqName?), (Void..Void?)> defined in com.intellij.util.indexing.ID[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V : (Any..Any?)> -> (java.lang.Void..java.lang.Void?)

'classOfIndex' @ [41:43] ==> value-parameter classOfIndex: Class<T> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.<init>[ValueParameterDescriptorImpl]

'canonicalName' @ [41:56] ==> public final val <T : (Any..Any?)> Class<T>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'writeUTF' @ [44:71] ==> public open fun writeUTF(@NotNull p0: DataOutput, @NotNull p1: String): Unit defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'output' @ [44:80] ==> value-parameter output: DataOutput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.KEY_DESCRIPTOR.<no name provided>.save[ValueParameterDescriptorImpl]

'value' @ [44:88] ==> value-parameter value: FqName defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.KEY_DESCRIPTOR.<no name provided>.save[ValueParameterDescriptorImpl]

'asString' @ [44:94] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'FqName' @ [46:47] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'readUTF' @ [46:61] ==> public open fun readUTF(@NotNull p0: DataInput): (String..String?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'input' @ [46:69] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.KEY_DESCRIPTOR.<no name provided>.read[ValueParameterDescriptorImpl]

'value' @ [48:51] ==> value-parameter value: FqName defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.KEY_DESCRIPTOR.<no name provided>.getHashCode[ValueParameterDescriptorImpl]

'asString' @ [48:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'hashCode' @ [48:68] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'val1' @ [50:62] ==> value-parameter val1: FqName? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.KEY_DESCRIPTOR.<no name provided>.isEqual[ValueParameterDescriptorImpl]

'val2' @ [50:70] ==> value-parameter val2: FqName? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.KEY_DESCRIPTOR.<no name provided>.isEqual[ValueParameterDescriptorImpl]

'getInstance' @ [53:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'classOfIndex' @ [53:42] ==> value-parameter classOfIndex: Class<T> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.<init>[ValueParameterDescriptorImpl]

'KEY' @ [55:30] ==> public final val KEY: ID<FqName, Void> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase[PropertyDescriptorImpl]

'KEY_DESCRIPTOR' @ [59:39] ==> private final val KEY_DESCRIPTOR: KeyDescriptor<FqName> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase[PropertyDescriptorImpl]

'DataIndexer' @ [63:13] ==> public fun <Key : (Any..Any?), Value : (Any..Any?), Data : (Any..Any?)> DataIndexer(function: (FileContent) -> (MutableMap<(FqName..FqName?), (Void..Void?)>..Map<(FqName..FqName?), (Void..Void?)>)): DataIndexer<FqName, Void, FileContent> defined in com.intellij.util.indexing[SimpleFunctionDescriptorImpl]
Inferred types:
    <Key : (Any..Any?)> -> FqName
    <Value : (Any..Any?)> -> Void
    <Data : (Any..Any?)> -> FileContent

'invoke' @ [65:34] ==> public abstract operator fun invoke(p1: FileContent): FqName? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [65:36] ==> value-parameter it: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.indexer.<anonymous>[ValueParameterDescriptorImpl]

'if (fqName != null) {
                        Collections.singletonMap<FqName, Void>(fqName, null)
                    }
                    else {
                        emptyMap()
                    }' @ [66:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (MutableMap<(FqName..FqName?), (Void..Void?)>..Map<(FqName..FqName?), (Void..Void?)>), elseBranch: (MutableMap<(FqName..FqName?), (Void..Void?)>..Map<(FqName..FqName?), (Void..Void?)>)): (MutableMap<(FqName..FqName?), (Void..Void?)>..Map<(FqName..FqName?), (Void..Void?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.MutableMap<(org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?), (java.lang.Void..java.lang.Void?)>..kotlin.collections.Map<(org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?), (java.lang.Void..java.lang.Void?)>)

'fqName' @ [66:25] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.indexer.<anonymous>[LocalVariableDescriptor]

'singletonMap' @ [67:37] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> singletonMap(p0: (FqName..FqName?), p1: (Void..Void?)): (MutableMap<(FqName..FqName?), (Void..Void?)>..Map<(FqName..FqName?), (Void..Void?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> Void

'fqName' @ [67:64] ==> val fqName: FqName? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.indexer.<anonymous>[LocalVariableDescriptor]

'emptyMap' @ [70:25] ==> public fun <K, V> emptyMap(): Map<(FqName..FqName?), (Void..Void?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V> -> (java.lang.Void..java.lang.Void?)

'LOG' @ [74:21] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase[PropertyDescriptorImpl]

'warn' @ [74:25] ==> public abstract fun warn(@NonNls p0: (String..String?), @Nullable p1: Throwable?): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'+' @ [74:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [74:61] ==> value-parameter it: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.indexer.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [74:64] ==> public final val FileContent.fileName: String[MyPropertyDescriptor]

'e' @ [74:74] ==> val e: Throwable defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase.indexer.<anonymous>[LocalVariableDescriptor]

'emptyMap' @ [75:21] ==> public fun <K, V> emptyMap(): Map<FqName, Void> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> Void

'!' @ [81:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [81:25] ==> public open fun getInstance(): (FileBasedIndex..FileBasedIndex?) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]

'processValues' @ [81:39] ==> public final fun <K : (Any..Any?), V : (Any..Any?)> processValues(@NotNull p0: ID<(FqName..FqName?), (Void..Void?)>, @NotNull p1: FqName, @Nullable p2: VirtualFile?, @NotNull p3: (VirtualFile, (Void..Void?)) -> Boolean, @NotNull p4: GlobalSearchScope): Boolean defined in com.intellij.util.indexing.FileBasedIndex[MyFunctionDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.name.FqName..org.jetbrains.kotlin.name.FqName?)
    <V : (Any..Any?)> -> (java.lang.Void..java.lang.Void?)

'name' @ [81:53] ==> public final val <T> KotlinFileIndexBase<T>.name: ID<FqName, Void>[MyPropertyDescriptor]
Inferred types:
    <T> -> T

'fqName' @ [81:59] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.vfilefinder.hasSomethingInPackage[ValueParameterDescriptorImpl]

'scope' @ [81:92] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.vfilefinder.hasSomethingInPackage[ValueParameterDescriptorImpl]

'KotlinFileIndexBase<KotlinClassFileIndex>' @ [83:31] ==> public constructor KotlinFileIndexBase<T>(classOfIndex: Class<KotlinClassFileIndex>) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> KotlinClassFileIndex

'KotlinClassFileIndex' @ [83:73] ==> public object KotlinClassFileIndex : KotlinFileIndexBase<KotlinClassFileIndex> defined in org.jetbrains.kotlin.idea.vfilefinder in file fileIndexes.kt[FakeCallableDescriptorForObject]

'java' @ [83:101] ==> public val <T> KClass<KotlinClassFileIndex>.java: Class<KotlinClassFileIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinClassFileIndex

'INDEXER' @ [85:33] ==> private final val INDEXER: DataIndexer<FqName, Void, FileContent> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex[PropertyDescriptorImpl]

'InputFilter' @ [87:52] ==> @FunctionalInterface public final fun InputFilter(function: (VirtualFile) -> Boolean): FileBasedIndex.InputFilter defined in com.intellij.util.indexing.FileBasedIndex[SamConstructorDescriptorImpl]

'file' @ [87:74] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex.getInputFilter.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [87:79] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [87:109] ==> public final val INSTANCE: (JavaClassFileType..JavaClassFileType?) defined in com.intellij.ide.highlighter.JavaClassFileType[JavaPropertyDescriptor]

'VERSION' @ [89:33] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex[PropertyDescriptorImpl]

'indexer' @ [93:27] ==> protected final fun indexer(f: (FileContent) -> FqName?): DataIndexer<FqName, Void, FileContent> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex[SimpleFunctionDescriptorImpl]

'IDEKotlinBinaryClassCache' @ [94:26] ==> public object IDEKotlinBinaryClassCache defined in org.jetbrains.kotlin.idea.caches in file IDEKotlinBinaryClassCache.kt[FakeCallableDescriptorForObject]

'getKotlinBinaryClassHeaderData' @ [94:52] ==> public final fun getKotlinBinaryClassHeaderData(file: VirtualFile, fileContent: ByteArray? = ...): IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache[SimpleFunctionDescriptorImpl]

'fileContent' @ [94:83] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [94:95] ==> public final val FileContent.file: VirtualFile[MyPropertyDescriptor]

'fileContent' @ [94:101] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [94:113] ==> public final val FileContent.content: ByteArray[MyPropertyDescriptor]

'if (headerInfo != null && headerInfo.classHeader.metadataVersion.isCompatible()) headerInfo.classId.asSingleFqName() else null' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'headerInfo' @ [95:13] ==> val headerInfo: IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'headerInfo' @ [95:35] ==> val headerInfo: IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'classHeader' @ [95:46] ==> public final val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache.KotlinBinaryHeaderData[PropertyDescriptorImpl]

'metadataVersion' @ [95:58] ==> public final val metadataVersion: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[DeserializedPropertyDescriptor]

'isCompatible' @ [95:74] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[DeserializedSimpleFunctionDescriptor]

'headerInfo' @ [95:90] ==> val headerInfo: IDEKotlinBinaryClassCache.KotlinBinaryHeaderData? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinClassFileIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'classId' @ [95:101] ==> public final val classId: ClassId defined in org.jetbrains.kotlin.idea.caches.IDEKotlinBinaryClassCache.KotlinBinaryHeaderData[PropertyDescriptorImpl]

'asSingleFqName' @ [95:109] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'KotlinFileIndexBase<KotlinJavaScriptMetaFileIndex>' @ [99:40] ==> public constructor KotlinFileIndexBase<T>(classOfIndex: Class<KotlinJavaScriptMetaFileIndex>) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> KotlinJavaScriptMetaFileIndex

'KotlinJavaScriptMetaFileIndex' @ [99:91] ==> public object KotlinJavaScriptMetaFileIndex : KotlinFileIndexBase<KotlinJavaScriptMetaFileIndex> defined in org.jetbrains.kotlin.idea.vfilefinder in file fileIndexes.kt[FakeCallableDescriptorForObject]

'java' @ [99:128] ==> public val <T> KClass<KotlinJavaScriptMetaFileIndex>.java: Class<KotlinJavaScriptMetaFileIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinJavaScriptMetaFileIndex

'INDEXER' @ [101:33] ==> private final val INDEXER: DataIndexer<FqName, Void, FileContent> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinJavaScriptMetaFileIndex[PropertyDescriptorImpl]

'InputFilter' @ [103:52] ==> @FunctionalInterface public final fun InputFilter(function: (VirtualFile) -> Boolean): FileBasedIndex.InputFilter defined in com.intellij.util.indexing.FileBasedIndex[SamConstructorDescriptorImpl]

'file' @ [103:74] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinJavaScriptMetaFileIndex.getInputFilter.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [103:79] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'KotlinJavaScriptMetaFileType' @ [103:91] ==> public object KotlinJavaScriptMetaFileType : FileType defined in org.jetbrains.kotlin.idea.decompiler.js in file KotlinJavaScriptMetaFileType.kt[FakeCallableDescriptorForObject]

'VERSION' @ [105:33] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinJavaScriptMetaFileIndex[PropertyDescriptorImpl]

'indexer' @ [109:27] ==> protected final fun indexer(f: (FileContent) -> FqName?): DataIndexer<FqName, Void, FileContent> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinJavaScriptMetaFileIndex[SimpleFunctionDescriptorImpl]

'ByteArrayInputStream' @ [110:22] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'fileContent' @ [110:43] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinJavaScriptMetaFileIndex.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [110:55] ==> public final val FileContent.content: ByteArray[MyPropertyDescriptor]

'if (JsMetadataVersion.readFrom(stream).isCompatible()) {
            FqName(JsProtoBuf.Header.parseDelimitedFrom(stream).packageFqName)
        }
        else null' @ [111:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'JsMetadataVersion' @ [111:13] ==> public companion object defined in org.jetbrains.kotlin.utils.JsMetadataVersion[FakeCallableDescriptorForObject]

'readFrom' @ [111:31] ==> public final fun readFrom(stream: InputStream): JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedSimpleFunctionDescriptor]

'stream' @ [111:40] ==> val stream: ByteArrayInputStream defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinJavaScriptMetaFileIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'isCompatible' @ [111:48] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedSimpleFunctionDescriptor]

'FqName' @ [112:13] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'parseDelimitedFrom' @ [112:38] ==> public open fun parseDelimitedFrom(p0: (InputStream..InputStream?)): (JsProtoBuf.Header..JsProtoBuf.Header?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header[JavaMethodDescriptor]

'stream' @ [112:57] ==> val stream: ByteArrayInputStream defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinJavaScriptMetaFileIndex.INDEXER.<anonymous>[LocalVariableDescriptor]

'packageFqName' @ [112:65] ==> public final val JsProtoBuf.Header.packageFqName: (String..String?)[MyPropertyDescriptor]

'KotlinFileIndexBase<T>' @ [118:105] ==> public constructor KotlinFileIndexBase<T>(classOfIndex: Class<T>) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinFileIndexBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'classOfIndex' @ [118:128] ==> value-parameter classOfIndex: Class<T> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.<init>[ValueParameterDescriptorImpl]

'INDEXER' @ [119:33] ==> private final val INDEXER: DataIndexer<FqName, Void, FileContent> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase[PropertyDescriptorImpl]

'InputFilter' @ [121:52] ==> @FunctionalInterface public final fun InputFilter(function: (VirtualFile) -> Boolean): FileBasedIndex.InputFilter defined in com.intellij.util.indexing.FileBasedIndex[SamConstructorDescriptorImpl]

'file' @ [121:74] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.getInputFilter.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [121:79] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'KotlinBuiltInFileType' @ [121:91] ==> public object KotlinBuiltInFileType : FileType defined in org.jetbrains.kotlin.idea.decompiler.builtIns in file KotlinBuiltInFileType.kt[FakeCallableDescriptorForObject]

'VERSION' @ [123:33] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase[PropertyDescriptorImpl]

'indexer' @ [127:27] ==> protected final fun indexer(f: (FileContent) -> FqName?): DataIndexer<FqName, Void, FileContent> defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase[SimpleFunctionDescriptorImpl]

'if (fileContent.fileType == KotlinBuiltInFileType && fileContent.fileName.endsWith(MetadataPackageFragment.DOT_METADATA_FILE_EXTENSION)) {
            val builtins = BuiltInDefinitionFile.read(fileContent.content, fileContent.file.parent)
            (builtins as? BuiltInDefinitionFile)?.let { builtinDefFile ->
                val proto = builtinDefFile.proto
                proto.class_List.singleOrNull()?.let { cls ->
                    indexFunction(builtinDefFile.nameResolver.getClassId(cls.fqName))
                } ?: indexFunction(ClassId(builtinDefFile.packageFqName,
                                           Name.identifier(fileContent.fileName.substringBeforeLast(MetadataPackageFragment.DOT_METADATA_FILE_EXTENSION))))
            }
        } else null' @ [128:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'fileContent' @ [128:13] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [128:25] ==> public final val FileContent.fileType: FileType[MyPropertyDescriptor]

'KotlinBuiltInFileType' @ [128:37] ==> public object KotlinBuiltInFileType : FileType defined in org.jetbrains.kotlin.idea.decompiler.builtIns in file KotlinBuiltInFileType.kt[FakeCallableDescriptorForObject]

'fileContent' @ [128:62] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [128:74] ==> public final val FileContent.fileName: String[MyPropertyDescriptor]

'endsWith' @ [128:83] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DOT_METADATA_FILE_EXTENSION' @ [128:116] ==> public final val DOT_METADATA_FILE_EXTENSION: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.Companion[DeserializedPropertyDescriptor]

'BuiltInDefinitionFile' @ [129:28] ==> public companion object defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[FakeCallableDescriptorForObject]

'read' @ [129:50] ==> public final fun read(contents: ByteArray, file: VirtualFile): FileWithMetadata? defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile.Companion[SimpleFunctionDescriptorImpl]

'fileContent' @ [129:55] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [129:67] ==> public final val FileContent.content: ByteArray[MyPropertyDescriptor]

'fileContent' @ [129:76] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [129:88] ==> public final val FileContent.file: VirtualFile[MyPropertyDescriptor]

'parent' @ [129:93] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'builtins' @ [130:14] ==> val builtins: FileWithMetadata? defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>[LocalVariableDescriptor]

'let' @ [130:51] ==> @InlineOnly public inline fun <T, R> BuiltInDefinitionFile.let(block: (BuiltInDefinitionFile) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BuiltInDefinitionFile
    <R> -> FqName

'builtinDefFile' @ [131:29] ==> value-parameter builtinDefFile: BuiltInDefinitionFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [131:44] ==> public final val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'proto' @ [132:17] ==> val proto: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>.<anonymous>[LocalVariableDescriptor]

'class_List' @ [132:23] ==> public final val ProtoBuf.PackageFragment.class_List: (MutableList<(ProtoBuf.Class..ProtoBuf.Class?)>..List<(ProtoBuf.Class..ProtoBuf.Class?)>?)[MyPropertyDescriptor]

'singleOrNull' @ [132:34] ==> public fun <T> List<(ProtoBuf.Class..ProtoBuf.Class?)>.singleOrNull(): ProtoBuf.Class? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Class..org.jetbrains.kotlin.serialization.ProtoBuf.Class?)

'let' @ [132:50] ==> @InlineOnly public inline fun <T, R> ProtoBuf.Class.let(block: (ProtoBuf.Class) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class
    <R> -> FqName

'invoke' @ [133:21] ==> public abstract operator fun invoke(p1: ClassId): FqName defined in kotlin.Function1[FunctionInvokeDescriptor]

'builtinDefFile' @ [133:35] ==> value-parameter builtinDefFile: BuiltInDefinitionFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [133:50] ==> public final val nameResolver: NameResolverImpl defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'getClassId' @ [133:63] ==> public open fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolverImpl[DeserializedSimpleFunctionDescriptor]

'cls' @ [133:74] ==> value-parameter cls: ProtoBuf.Class defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [133:78] ==> public final val ProtoBuf.Class.fqName: Int[MyPropertyDescriptor]

'invoke' @ [134:22] ==> public abstract operator fun invoke(p1: ClassId): FqName defined in kotlin.Function1[FunctionInvokeDescriptor]

'ClassId' @ [134:36] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'builtinDefFile' @ [134:44] ==> value-parameter builtinDefFile: BuiltInDefinitionFile defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [134:59] ==> public final val packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.builtIns.BuiltInDefinitionFile[PropertyDescriptorImpl]

'identifier' @ [135:49] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'fileContent' @ [135:60] ==> value-parameter fileContent: FileContent defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase.INDEXER.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [135:72] ==> public final val FileContent.fileName: String[MyPropertyDescriptor]

'substringBeforeLast' @ [135:81] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DOT_METADATA_FILE_EXTENSION' @ [135:125] ==> public final val DOT_METADATA_FILE_EXTENSION: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.Companion[DeserializedPropertyDescriptor]

'KotlinMetadataFileIndexBase<KotlinMetadataFileIndex>' @ [141:34] ==> public constructor KotlinMetadataFileIndexBase<T>(classOfIndex: Class<KotlinMetadataFileIndex>, indexFunction: (ClassId) -> FqName) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> KotlinMetadataFileIndex

'KotlinMetadataFileIndex' @ [142:9] ==> public object KotlinMetadataFileIndex : KotlinMetadataFileIndexBase<KotlinMetadataFileIndex> defined in org.jetbrains.kotlin.idea.vfilefinder in file fileIndexes.kt[FakeCallableDescriptorForObject]

'java' @ [142:40] ==> public val <T> KClass<KotlinMetadataFileIndex>.java: Class<KotlinMetadataFileIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinMetadataFileIndex

'asSingleFqName' @ [142:55] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'KotlinMetadataFileIndexBase<KotlinMetadataFilePackageIndex>' @ [144:41] ==> public constructor KotlinMetadataFileIndexBase<T>(classOfIndex: Class<KotlinMetadataFilePackageIndex>, indexFunction: (ClassId) -> FqName) defined in org.jetbrains.kotlin.idea.vfilefinder.KotlinMetadataFileIndexBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> KotlinMetadataFilePackageIndex

'KotlinMetadataFilePackageIndex' @ [145:9] ==> public object KotlinMetadataFilePackageIndex : KotlinMetadataFileIndexBase<KotlinMetadataFilePackageIndex> defined in org.jetbrains.kotlin.idea.vfilefinder in file fileIndexes.kt[FakeCallableDescriptorForObject]

'java' @ [145:47] ==> public val <T> KClass<KotlinMetadataFilePackageIndex>.java: Class<KotlinMetadataFilePackageIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinMetadataFilePackageIndex

'getPackageFqName' @ [145:62] ==> @NotNull public open fun getPackageFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

