'IncrementalCacheImpl<TargetId>' @ [33:5] ==> public constructor IncrementalCacheImpl<Target>(targetDataRoot: File, targetOutputDir: File?, target: TargetId) defined in org.jetbrains.kotlin.incremental.IncrementalCacheImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <Target> -> TargetId

'targetDataRoot' @ [33:36] ==> value-parameter targetDataRoot: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'targetOutputDir' @ [33:52] ==> value-parameter targetOutputDir: File? defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'target' @ [33:69] ==> value-parameter target: TargetId defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.<init>[ValueParameterDescriptorImpl]

'registerMap' @ [39:38] ==> protected final fun <K, V, M : BasicMap<String, Collection<String>>> registerMap(map: GradleIncrementalCacheImpl.SourceToOutputFilesMap): GradleIncrementalCacheImpl.SourceToOutputFilesMap defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Collection<String>
    <M : BasicMap<K, V>> -> SourceToOutputFilesMap

'SourceToOutputFilesMap' @ [39:50] ==> public constructor SourceToOutputFilesMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap[ClassConstructorDescriptorImpl]

'SOURCE_TO_OUTPUT_FILES' @ [39:73] ==> private final val SOURCE_TO_OUTPUT_FILES: String defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [39:96] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedPropertyDescriptor]

'registerMap' @ [40:38] ==> protected final fun <K, V, M : BasicMap<String, FileSnapshot>> registerMap(map: FileSnapshotMap): FileSnapshotMap defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> FileSnapshot
    <M : BasicMap<K, V>> -> FileSnapshotMap

'FileSnapshotMap' @ [40:50] ==> public constructor FileSnapshotMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap[ClassConstructorDescriptorImpl]

'SOURCE_SNAPSHOTS' @ [40:66] ==> private final val SOURCE_SNAPSHOTS: String defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.Companion[PropertyDescriptorImpl]

'storageFile' @ [40:83] ==> protected final val String.storageFile: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[DeserializedPropertyDescriptor]

'MultiMap' @ [45:30] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> File
    <V : (Any..Any?)> -> File

'generatedFiles' @ [47:31] ==> value-parameter generatedFiles: List<GeneratedFile<*>> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[ValueParameterDescriptorImpl]

'generatedFile' @ [48:28] ==> val generatedFile: GeneratedFile<*> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[LocalVariableDescriptor]

'sourceFiles' @ [48:42] ==> public final val sourceFiles: Collection<File> defined in org.jetbrains.kotlin.build.GeneratedFile[DeserializedPropertyDescriptor]

'sourceToOutput' @ [49:17] ==> val sourceToOutput: MultiMap<File, File> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[LocalVariableDescriptor]

'putValue' @ [49:32] ==> public open fun putValue(@Nullable p0: File?, p1: (File..File?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'source' @ [49:41] ==> val source: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[LocalVariableDescriptor]

'generatedFile' @ [49:49] ==> val generatedFile: GeneratedFile<*> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[LocalVariableDescriptor]

'outputFile' @ [49:63] ==> public final val outputFile: File defined in org.jetbrains.kotlin.build.GeneratedFile[DeserializedPropertyDescriptor]

'component1' @ [53:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(File..File?), (MutableCollection<(File..File?)>..Collection<(File..File?)>?)>.component1(): (File..File?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (java.io.File..java.io.File?)
    <V> -> (kotlin.collections.MutableCollection<(java.io.File..java.io.File?)>..kotlin.collections.Collection<(java.io.File..java.io.File?)>?)

'component2' @ [53:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(File..File?), (MutableCollection<(File..File?)>..Collection<(File..File?)>?)>.component2(): (MutableCollection<(File..File?)>..Collection<(File..File?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (java.io.File..java.io.File?)
    <V> -> (kotlin.collections.MutableCollection<(java.io.File..java.io.File?)>..kotlin.collections.Collection<(java.io.File..java.io.File?)>?)

'sourceToOutput' @ [53:35] ==> val sourceToOutput: MultiMap<File, File> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[LocalVariableDescriptor]

'entrySet' @ [53:50] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(File..File?), (MutableCollection<(File..File?)>..Collection<(File..File?)>?)>..Map.Entry<(File..File?), (MutableCollection<(File..File?)>..Collection<(File..File?)>?)>?)>..Set<(MutableMap.MutableEntry<(File..File?), (MutableCollection<(File..File?)>..Collection<(File..File?)>?)>..Map.Entry<(File..File?), (MutableCollection<(File..File?)>..Collection<(File..File?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'sourceToOutputMap' @ [54:13] ==> internal final val sourceToOutputMap: GradleIncrementalCacheImpl.SourceToOutputFilesMap defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[PropertyDescriptorImpl]

'source' @ [54:31] ==> val source: (File..File?) defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[LocalVariableDescriptor]

'outputs' @ [54:41] ==> val outputs: (MutableCollection<(File..File?)>..Collection<(File..File?)>?) defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.registerOutputForSourceFiles[LocalVariableDescriptor]

'sources' @ [59:9] ==> value-parameter sources: Iterable<File> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.removeOutputForSourceFiles[ValueParameterDescriptorImpl]

'forEach' @ [59:17] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'sourceToOutputMap' @ [59:27] ==> internal final val sourceToOutputMap: GradleIncrementalCacheImpl.SourceToOutputFilesMap defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[PropertyDescriptorImpl]

'remove' @ [59:45] ==> public final fun remove(file: File): Unit defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap[SimpleFunctionDescriptorImpl]

'it' @ [59:52] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.removeOutputForSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'BasicStringMap<Collection<String>>' @ [62:61] ==> public constructor BasicStringMap<V>(storageFile: File, keyDescriptor: KeyDescriptor<String>, valueExternalizer: DataExternalizer<Collection<String>>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Collection<String>

'storageFile' @ [62:96] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.<init>[ValueParameterDescriptorImpl]

'PathStringDescriptor' @ [62:109] ==> public object PathStringDescriptor : EnumeratorStringDescriptor defined in org.jetbrains.kotlin.incremental.storage[FakeCallableDescriptorForObject]

'StringCollectionExternalizer' @ [62:131] ==> public object StringCollectionExternalizer : CollectionExternalizer<String> defined in org.jetbrains.kotlin.incremental.storage[FakeCallableDescriptorForObject]

'storage' @ [64:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap[DeserializedPropertyDescriptor]

'sourceFile' @ [64:21] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.set[ValueParameterDescriptorImpl]

'absolutePath' @ [64:32] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'outputFiles' @ [64:48] ==> value-parameter outputFiles: Collection<File> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.set[ValueParameterDescriptorImpl]

'map' @ [64:60] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [64:66] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.set.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [64:69] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'storage' @ [68:17] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap[DeserializedPropertyDescriptor]

'sourceFile' @ [68:25] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.get[ValueParameterDescriptorImpl]

'absolutePath' @ [68:36] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'orEmpty' @ [68:50] ==> @InlineOnly public inline fun <T> Collection<String>?.orEmpty(): Collection<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [68:60] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'value' @ [70:61] ==> value-parameter value: Collection<String> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.dumpValue[ValueParameterDescriptorImpl]

'dumpCollection' @ [70:67] ==> public fun <T : Comparable<String>> Collection<String>.dumpCollection(): String defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'get' @ [75:13] ==> public final operator fun get(sourceFile: File): Collection<File> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap[SimpleFunctionDescriptorImpl]

'file' @ [75:17] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.remove[ValueParameterDescriptorImpl]

'forEach' @ [75:23] ==> @HidesMembers public inline fun <T> Iterable<File>.forEach(action: (File) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'reporter' @ [76:17] ==> private final val reporter: ICReporter defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl[PropertyDescriptorImpl]

'report' @ [76:26] ==> public abstract fun report(message: () -> String): Unit defined in org.jetbrains.kotlin.incremental.ICReporter[DeserializedSimpleFunctionDescriptor]

'it' @ [76:46] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.remove.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [76:72] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.remove[ValueParameterDescriptorImpl]

'it' @ [77:17] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.remove.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [77:20] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'storage' @ [79:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap[DeserializedPropertyDescriptor]

'remove' @ [79:21] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[DeserializedSimpleFunctionDescriptor]

'file' @ [79:28] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.GradleIncrementalCacheImpl.SourceToOutputFilesMap.remove[ValueParameterDescriptorImpl]

'absolutePath' @ [79:33] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

