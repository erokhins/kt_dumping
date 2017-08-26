'BasicMapsOwner' @ [32:61] ==> public constructor BasicMapsOwner() defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner[ClassConstructorDescriptorImpl]

'File' @ [39:17] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'targetDataDir' @ [39:22] ==> private final val targetDataDir: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'this' @ [39:37] ==> <this> defined in org.jetbrains.kotlin.incremental.LookupStorage.storageFile[ReceiverParameterDescriptorImpl]

'CACHE_EXTENSION' @ [39:50] ==> public final val CACHE_EXTENSION: String defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner.Companion[PropertyDescriptorImpl]

'storageFile' @ [41:43] ==> private final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'registerMap' @ [42:28] ==> protected final fun <K, V, M : BasicMap<Int, File>> registerMap(map: IdToFileMap): IdToFileMap defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Int
    <V> -> File
    <M : BasicMap<K, V>> -> IdToFileMap

'IdToFileMap' @ [42:40] ==> public constructor IdToFileMap(file: File) defined in org.jetbrains.kotlin.incremental.storage.IdToFileMap[ClassConstructorDescriptorImpl]

'storageFile' @ [42:65] ==> private final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'registerMap' @ [43:28] ==> protected final fun <K, V, M : BasicMap<File, Int>> registerMap(map: FileToIdMap): FileToIdMap defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> File
    <V> -> Int
    <M : BasicMap<K, V>> -> FileToIdMap

'FileToIdMap' @ [43:40] ==> public constructor FileToIdMap(file: File) defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[ClassConstructorDescriptorImpl]

'storageFile' @ [43:65] ==> private final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'registerMap' @ [44:29] ==> protected final fun <K, V, M : BasicMap<LookupSymbolKey, Collection<Int>>> registerMap(map: LookupMap): LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> LookupSymbolKey
    <V> -> Collection<Int>
    <M : BasicMap<K, V>> -> LookupMap

'LookupMap' @ [44:41] ==> public constructor LookupMap(storage: File) defined in org.jetbrains.kotlin.incremental.storage.LookupMap[ClassConstructorDescriptorImpl]

'storageFile' @ [44:61] ==> private final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'Volatile' @ [46:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'Volatile' @ [49:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'countersFile' @ [53:13] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'exists' @ [53:26] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'countersFile' @ [54:25] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'readLines' @ [54:38] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'size' @ [55:13] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'lines' @ [55:20] ==> val lines: List<String> defined in org.jetbrains.kotlin.incremental.LookupStorage.<init>[LocalVariableDescriptor]

'toInt' @ [55:29] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'deletedCount' @ [56:13] ==> @Volatile private final var deletedCount: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'lines' @ [56:28] ==> val lines: List<String> defined in org.jetbrains.kotlin.incremental.LookupStorage.<init>[LocalVariableDescriptor]

'toInt' @ [56:37] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Synchronized' @ [60:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'LookupSymbolKey' @ [62:19] ==> public constructor LookupSymbolKey(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.storage.LookupSymbolKey[ClassConstructorDescriptorImpl]

'lookupSymbol' @ [62:35] ==> value-parameter lookupSymbol: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.get[ValueParameterDescriptorImpl]

'name' @ [62:48] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'lookupSymbol' @ [62:54] ==> value-parameter lookupSymbol: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.get[ValueParameterDescriptorImpl]

'scope' @ [62:67] ==> public final val scope: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'lookupMap' @ [63:23] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'key' @ [63:33] ==> val key: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.get[LocalVariableDescriptor]

'emptySet' @ [63:48] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fileIds' @ [65:16] ==> val fileIds: Collection<Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.get[LocalVariableDescriptor]

'mapNotNull' @ [65:24] ==> public inline fun <T, R : Any> Iterable<Int>.mapNotNull(transform: (Int) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Any> -> String

'idToFile' @ [67:13] ==> private final val idToFile: IdToFileMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'it' @ [67:22] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.get.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [67:27] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'Synchronized' @ [71:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'allPaths' @ [73:24] ==> value-parameter allPaths: Set<String> defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[ValueParameterDescriptorImpl]

'keysToMap' @ [73:33] ==> public fun <K, V> Iterable<String>.keysToMap(value: (String) -> Int): Map<String, Int> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'addFileIfNeeded' @ [73:45] ==> private final fun addFileIfNeeded(file: File): Int defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'File' @ [73:61] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [73:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [75:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<LookupSymbol, Collection<String>>.component1(): LookupSymbol defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LookupSymbol
    <V> -> Collection<String>

'component2' @ [75:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<LookupSymbol, Collection<String>>.component2(): Collection<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LookupSymbol
    <V> -> Collection<String>

'lookups' @ [75:39] ==> value-parameter lookups: Set<Map.Entry<LookupSymbol, Collection<String>>> defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[ValueParameterDescriptorImpl]

'LookupSymbolKey' @ [76:23] ==> public constructor LookupSymbolKey(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.storage.LookupSymbolKey[ClassConstructorDescriptorImpl]

'lookupSymbol' @ [76:39] ==> val lookupSymbol: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'name' @ [76:52] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'lookupSymbol' @ [76:58] ==> val lookupSymbol: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'scope' @ [76:71] ==> public final val scope: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'paths' @ [77:27] ==> val paths: Collection<String> defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'mapTo' @ [77:33] ==> public inline fun <T, R, C : MutableCollection<in Int>> Iterable<String>.mapTo(destination: HashSet<Int>, transform: (String) -> Int): HashSet<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int
    <C : MutableCollection<in R>> -> HashSet<Int>

'HashSet' @ [77:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'pathToId' @ [77:57] ==> val pathToId: Map<String, Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'it' @ [77:66] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll.<anonymous>[ValueParameterDescriptorImpl]

'fileIds' @ [78:13] ==> val fileIds: HashSet<Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'addAll' @ [78:21] ==> public open fun addAll(elements: Collection<Int>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'lookupMap' @ [78:28] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'key' @ [78:38] ==> val key: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'emptySet' @ [78:46] ==> public fun <T> emptySet(): Set<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'lookupMap' @ [79:13] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'key' @ [79:23] ==> val key: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'fileIds' @ [79:30] ==> val fileIds: HashSet<Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.addAll[LocalVariableDescriptor]

'Synchronized' @ [83:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'files' @ [85:22] ==> value-parameter files: Sequence<File> defined in org.jetbrains.kotlin.incremental.LookupStorage.removeLookupsFrom[ValueParameterDescriptorImpl]

'fileToId' @ [86:22] ==> private final val fileToId: FileToIdMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'file' @ [86:31] ==> val file: File defined in org.jetbrains.kotlin.incremental.LookupStorage.removeLookupsFrom[LocalVariableDescriptor]

'idToFile' @ [87:13] ==> private final val idToFile: IdToFileMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'remove' @ [87:22] ==> public final fun remove(id: Int): Unit defined in org.jetbrains.kotlin.incremental.storage.IdToFileMap[SimpleFunctionDescriptorImpl]

'id' @ [87:29] ==> val id: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.removeLookupsFrom[LocalVariableDescriptor]

'fileToId' @ [88:13] ==> private final val fileToId: FileToIdMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'remove' @ [88:22] ==> public final fun remove(file: File): Unit defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[SimpleFunctionDescriptorImpl]

'file' @ [88:29] ==> val file: File defined in org.jetbrains.kotlin.incremental.LookupStorage.removeLookupsFrom[LocalVariableDescriptor]

'deletedCount' @ [89:13] ==> @Volatile private final var deletedCount: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'Synchronized' @ [93:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'countersFile' @ [95:13] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'exists' @ [95:26] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'countersFile' @ [96:13] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'delete' @ [96:26] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'size' @ [99:9] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'deletedCount' @ [100:9] ==> @Volatile private final var deletedCount: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'super' @ [102:9] ==> <this> defined in org.jetbrains.kotlin.incremental.LookupStorage[LazyClassReceiverParameterDescriptor]

'clean' @ [102:15] ==> public open fun clean(): Unit defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner[SimpleFunctionDescriptorImpl]

'Synchronized' @ [105:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'removeGarbageIfNeeded' @ [108:13] ==> private final fun removeGarbageIfNeeded(force: Boolean = ...): Unit defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'size' @ [110:17] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'!' @ [111:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'countersFile' @ [111:22] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'exists' @ [111:35] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'countersFile' @ [112:21] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'parentFile' @ [112:34] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [112:45] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'countersFile' @ [113:21] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'createNewFile' @ [113:34] ==> public open fun createNewFile(): Boolean defined in java.io.File[JavaMethodDescriptor]

'countersFile' @ [116:17] ==> private final val countersFile: File defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'writeText' @ [116:30] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'size' @ [116:42] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'deletedCount' @ [116:49] ==> @Volatile private final var deletedCount: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'super' @ [120:13] ==> <this> defined in org.jetbrains.kotlin.incremental.LookupStorage[LazyClassReceiverParameterDescriptor]

'flush' @ [120:19] ==> public open fun flush(memoryCachesOnly: Boolean): Unit defined in org.jetbrains.kotlin.incremental.storage.BasicMapsOwner[SimpleFunctionDescriptorImpl]

'memoryCachesOnly' @ [120:25] ==> value-parameter memoryCachesOnly: Boolean defined in org.jetbrains.kotlin.incremental.LookupStorage.flush[ValueParameterDescriptorImpl]

'fileToId' @ [125:24] ==> private final val fileToId: FileToIdMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'file' @ [125:33] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[ValueParameterDescriptorImpl]

'existing' @ [126:13] ==> val existing: Int? defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[LocalVariableDescriptor]

'existing' @ [126:38] ==> val existing: Int? defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[LocalVariableDescriptor]

'size' @ [128:18] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'fileToId' @ [129:9] ==> private final val fileToId: FileToIdMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'file' @ [129:18] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[ValueParameterDescriptorImpl]

'id' @ [129:26] ==> val id: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[LocalVariableDescriptor]

'idToFile' @ [130:9] ==> private final val idToFile: IdToFileMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'id' @ [130:18] ==> val id: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[LocalVariableDescriptor]

'file' @ [130:24] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[ValueParameterDescriptorImpl]

'id' @ [131:16] ==> val id: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.addFileIfNeeded[LocalVariableDescriptor]

'force' @ [135:13] ==> value-parameter force: Boolean = ... defined in org.jetbrains.kotlin.incremental.LookupStorage.removeGarbageIfNeeded[ValueParameterDescriptorImpl]

'size' @ [135:23] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'MINIMUM_GARBAGE_COLLECTIBLE_SIZE' @ [135:30] ==> private final val MINIMUM_GARBAGE_COLLECTIBLE_SIZE: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.Companion[PropertyDescriptorImpl]

'deletedCount' @ [135:66] ==> @Volatile private final var deletedCount: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'toDouble' @ [135:79] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [135:92] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'DELETED_TO_SIZE_TRESHOLD' @ [135:99] ==> private final val DELETED_TO_SIZE_TRESHOLD: Double defined in org.jetbrains.kotlin.incremental.LookupStorage.Companion[PropertyDescriptorImpl]

'doRemoveGarbage' @ [136:13] ==> private final fun doRemoveGarbage(): Unit defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'lookupMap' @ [141:22] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'keys' @ [141:32] ==> public final val keys: Collection<LookupSymbolKey> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'lookupMap' @ [142:13] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'hash' @ [142:23] ==> val hash: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'lookupMap' @ [142:31] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'hash' @ [142:41] ==> val hash: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'filter' @ [142:49] ==> public inline fun <T> Iterable<Int>.filter(predicate: (Int) -> Boolean): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [142:58] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage.<anonymous>[ValueParameterDescriptorImpl]

'idToFile' @ [142:64] ==> private final val idToFile: IdToFileMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'toSet' @ [142:75] ==> public fun <T> Iterable<Int>.toSet(): Set<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fileToId' @ [145:27] ==> private final val fileToId: FileToIdMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'toMap' @ [145:36] ==> public final fun toMap(): Map<File, Int> defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[SimpleFunctionDescriptorImpl]

'HashMap' @ [146:28] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: Int) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Int
    <V : (Any..Any?)> -> Int

'oldFileToId' @ [146:46] ==> val oldFileToId: Map<File, Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'size' @ [146:58] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'idToFile' @ [147:9] ==> private final val idToFile: IdToFileMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'clean' @ [147:18] ==> public final fun clean(): Unit defined in org.jetbrains.kotlin.incremental.storage.IdToFileMap[SimpleFunctionDescriptorImpl]

'fileToId' @ [148:9] ==> private final val fileToId: FileToIdMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'clean' @ [148:18] ==> public final fun clean(): Unit defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[SimpleFunctionDescriptorImpl]

'size' @ [149:9] ==> @Volatile private final var size: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'deletedCount' @ [150:9] ==> @Volatile private final var deletedCount: Int defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'component1' @ [152:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<File, Int>.component1(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> Int

'component2' @ [152:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<File, Int>.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> Int

'oldFileToId' @ [152:31] ==> val oldFileToId: Map<File, Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'entries' @ [152:43] ==> public abstract val entries: Set<Map.Entry<File, Int>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'addFileIfNeeded' @ [153:25] ==> private final fun addFileIfNeeded(file: File): Int defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'file' @ [153:41] ==> val file: File defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'oldIdToNewId' @ [154:13] ==> val oldIdToNewId: HashMap<Int, Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'oldId' @ [154:26] ==> val oldId: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'newId' @ [154:35] ==> val newId: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'lookupMap' @ [157:24] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'keys' @ [157:34] ==> public final val keys: Collection<LookupSymbolKey> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'lookupMap' @ [158:27] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'lookup' @ [158:37] ==> val lookup: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'mapNotNull' @ [158:47] ==> public inline fun <T, R : Any> Iterable<Int>.mapNotNull(transform: (Int) -> Int?): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Any> -> Int

'oldIdToNewId' @ [158:60] ==> val oldIdToNewId: HashMap<Int, Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'it' @ [158:73] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [158:79] ==> public fun <T> Iterable<Int>.toSet(): Set<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'if (fileIds.isEmpty()) {
                lookupMap.remove(lookup)
            }
            else {
                lookupMap[lookup] = fileIds
            }' @ [160:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'fileIds' @ [160:17] ==> val fileIds: Set<Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'isEmpty' @ [160:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'lookupMap' @ [161:17] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'remove' @ [161:27] ==> public final fun remove(key: LookupSymbolKey): Unit defined in org.jetbrains.kotlin.incremental.storage.LookupMap[SimpleFunctionDescriptorImpl]

'lookup' @ [161:34] ==> val lookup: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'lookupMap' @ [164:17] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'lookup' @ [164:27] ==> val lookup: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'fileIds' @ [164:37] ==> val fileIds: Set<Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.doRemoveGarbage[LocalVariableDescriptor]

'TestOnly' @ [169:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'removeGarbageIfNeeded' @ [170:9] ==> private final fun removeGarbageIfNeeded(force: Boolean = ...): Unit defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'flush' @ [171:9] ==> @Synchronized public open fun flush(memoryCachesOnly: Boolean): Unit defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'TestOnly' @ [174:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'flush' @ [175:9] ==> @Synchronized public open fun flush(memoryCachesOnly: Boolean): Unit defined in org.jetbrains.kotlin.incremental.LookupStorage[SimpleFunctionDescriptorImpl]

'StringBuilder' @ [177:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'Printer' @ [178:17] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'sb' @ [178:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'lookupSymbols' @ [179:30] ==> value-parameter lookupSymbols: Set<LookupSymbol> defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[ValueParameterDescriptorImpl]

'groupBy' @ [179:44] ==> public inline fun <T, K> Iterable<LookupSymbol>.groupBy(keySelector: (LookupSymbol) -> LookupSymbolKey): Map<LookupSymbolKey, List<LookupSymbol>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupSymbol
    <K> -> LookupSymbolKey

'LookupSymbolKey' @ [179:54] ==> public constructor LookupSymbolKey(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.storage.LookupSymbolKey[ClassConstructorDescriptorImpl]

'it' @ [179:70] ==> value-parameter it: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [179:73] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'it' @ [179:79] ==> value-parameter it: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [179:82] ==> public final val scope: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'lookupMap' @ [181:24] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'keys' @ [181:34] ==> public final val keys: Collection<LookupSymbolKey> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'sorted' @ [181:39] ==> public fun <T : Comparable<LookupSymbolKey>> Iterable<LookupSymbolKey>.sorted(): List<LookupSymbolKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> LookupSymbolKey

'lookupMap' @ [182:27] ==> private final val lookupMap: LookupMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'lookup' @ [182:37] ==> val lookup: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'if (lookup in lookupsStrings) {
                lookupsStrings[lookup]!!.map { "${it.scope}#${it.name}" }.sorted().joinToString(", ")
            }
            else {
                lookup.toString()
            }' @ [184:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lookup' @ [184:27] ==> val lookup: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'lookupsStrings' @ [184:37] ==> val lookupsStrings: Map<LookupSymbolKey, List<LookupSymbol>> defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'lookupsStrings' @ [185:17] ==> val lookupsStrings: Map<LookupSymbolKey, List<LookupSymbol>> defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'lookup' @ [185:32] ==> val lookup: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'map' @ [185:42] ==> public inline fun <T, R> Iterable<LookupSymbol>.map(transform: (LookupSymbol) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupSymbol
    <R> -> String

'it' @ [185:51] ==> value-parameter it: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [185:54] ==> public final val scope: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'it' @ [185:63] ==> value-parameter it: LookupSymbol defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [185:66] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.LookupSymbol[PropertyDescriptorImpl]

'sorted' @ [185:75] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'joinToString' @ [185:84] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lookup' @ [188:17] ==> val lookup: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'toString' @ [188:24] ==> public open fun toString(): String defined in org.jetbrains.kotlin.incremental.storage.LookupSymbolKey[SimpleFunctionDescriptorImpl]

'fileIds' @ [191:25] ==> val fileIds: Collection<Int> defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'map' @ [191:33] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'idToFile' @ [191:39] ==> private final val idToFile: IdToFileMap defined in org.jetbrains.kotlin.incremental.LookupStorage[PropertyDescriptorImpl]

'it' @ [191:48] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [191:53] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> (String..String?)): (String..String?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'if (basePath == null) it.absolutePath else it.toRelativeString(basePath)' @ [191:59] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'basePath' @ [191:63] ==> value-parameter basePath: File? = ... defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[ValueParameterDescriptorImpl]

'it' @ [191:81] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [191:84] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'it' @ [191:102] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toRelativeString' @ [191:105] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'basePath' @ [191:122] ==> value-parameter basePath: File? = ... defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[ValueParameterDescriptorImpl]

'it' @ [191:137] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.LookupStorage.dump.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [191:140] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'sorted' @ [191:153] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'joinToString' @ [191:162] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'p' @ [192:13] ==> val p: Printer defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'println' @ [192:15] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'key' @ [192:25] ==> val key: String defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'value' @ [192:33] ==> val value: String defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'sb' @ [195:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.LookupStorage.dump[LocalVariableDescriptor]

'toString' @ [195:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'createSet' @ [200:28] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> createSet(): MultiMap<(LookupSymbol..LookupSymbol?), (String..String?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> LookupSymbol
    <V : (Any..Any?)> -> String

'StringInterner' @ [201:24] ==> public constructor StringInterner() defined in com.intellij.util.containers.StringInterner[JavaClassConstructorDescriptor]

'StringInterner' @ [202:28] ==> public constructor StringInterner() defined in com.intellij.util.containers.StringInterner[JavaClassConstructorDescriptor]

'delegate' @ [205:17] ==> private final val delegate: LookupTracker defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'requiresPosition' @ [205:26] ==> public abstract val requiresPosition: Boolean defined in org.jetbrains.kotlin.incremental.components.LookupTracker[DeserializedPropertyDescriptor]

'interner' @ [208:35] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'intern' @ [208:44] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'scopeFqName' @ [208:51] ==> value-parameter scopeFqName: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[ValueParameterDescriptorImpl]

'interner' @ [209:28] ==> private final val interner: StringInterner defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'intern' @ [209:37] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'name' @ [209:44] ==> value-parameter name: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[ValueParameterDescriptorImpl]

'pathInterner' @ [210:32] ==> public final val pathInterner: StringInterner defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'intern' @ [210:45] ==> @NotNull public open fun intern(@NotNull p0: String): String defined in com.intellij.util.containers.StringInterner[JavaMethodDescriptor]

'filePath' @ [210:52] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[ValueParameterDescriptorImpl]

'lookups' @ [212:9] ==> public final val lookups: MultiMap<(LookupSymbol..LookupSymbol?), (String..String?)> defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'putValue' @ [212:17] ==> public open fun putValue(@Nullable p0: LookupSymbol?, p1: (String..String?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'LookupSymbol' @ [212:26] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[ClassConstructorDescriptorImpl]

'internedName' @ [212:39] ==> val internedName: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[LocalVariableDescriptor]

'internedScopeFqName' @ [212:53] ==> val internedScopeFqName: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[LocalVariableDescriptor]

'internedFilePath' @ [212:75] ==> val internedFilePath: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[LocalVariableDescriptor]

'delegate' @ [213:9] ==> private final val delegate: LookupTracker defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl[PropertyDescriptorImpl]

'record' @ [213:18] ==> public abstract fun record(filePath: String, position: Position, scopeFqName: String, scopeKind: ScopeKind, name: String): Unit defined in org.jetbrains.kotlin.incremental.components.LookupTracker[DeserializedSimpleFunctionDescriptor]

'internedFilePath' @ [213:25] ==> val internedFilePath: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[LocalVariableDescriptor]

'position' @ [213:43] ==> value-parameter position: Position defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[ValueParameterDescriptorImpl]

'internedScopeFqName' @ [213:53] ==> val internedScopeFqName: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[LocalVariableDescriptor]

'scopeKind' @ [213:74] ==> value-parameter scopeKind: ScopeKind defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[ValueParameterDescriptorImpl]

'internedName' @ [213:85] ==> val internedName: String defined in org.jetbrains.kotlin.incremental.LookupTrackerImpl.record[LocalVariableDescriptor]

