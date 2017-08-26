'BasicStringMap<FileSnapshot>' @ [25:44] ==> public constructor BasicStringMap<V>(storageFile: File, keyDescriptor: KeyDescriptor<String>, valueExternalizer: DataExternalizer<FileSnapshot>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> FileSnapshot

'storageFile' @ [25:73] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.<init>[ValueParameterDescriptorImpl]

'PathStringDescriptor' @ [25:86] ==> public object PathStringDescriptor : EnumeratorStringDescriptor defined in org.jetbrains.kotlin.incremental.storage[FakeCallableDescriptorForObject]

'FileSnapshotExternalizer' @ [25:108] ==> public object FileSnapshotExternalizer : DataExternalizer<FileSnapshot> defined in org.jetbrains.kotlin.incremental.snapshots in file FileSnapshotExternalizer.kt[FakeCallableDescriptorForObject]

'value' @ [27:13] ==> value-parameter value: FileSnapshot defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.dumpValue[ValueParameterDescriptorImpl]

'toString' @ [27:19] ==> public open fun toString(): String defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshot[SimpleFunctionDescriptorImpl]

'SimpleFileSnapshotProviderImpl' @ [30:32] ==> public constructor SimpleFileSnapshotProviderImpl() defined in org.jetbrains.kotlin.incremental.snapshots.SimpleFileSnapshotProviderImpl[ClassConstructorDescriptorImpl]

'ArrayList' @ [31:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'ArrayList' @ [32:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'newFiles' @ [34:24] ==> value-parameter newFiles: Iterable<File> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[ValueParameterDescriptorImpl]

'mapTo' @ [34:33] ==> public inline fun <T, R, C : MutableCollection<in (String..String?)>> Iterable<File>.mapTo(destination: HashSet<(String..String?)>, transform: (File) -> (String..String?)): HashSet<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)
    <C : MutableCollection<in R>> -> HashSet<(kotlin.String..kotlin.String?)>

'HashSet' @ [34:39] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'it' @ [34:52] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [34:55] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'storage' @ [35:25] ==> protected final val storage: LazyStorage<String, FileSnapshot> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap[DeserializedPropertyDescriptor]

'keys' @ [35:33] ==> public final val keys: Collection<String> defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[DeserializedPropertyDescriptor]

'oldPath' @ [36:17] ==> val oldPath: String defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'newPaths' @ [36:29] ==> val newPaths: HashSet<(String..String?)> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'storage' @ [37:17] ==> protected final val storage: LazyStorage<String, FileSnapshot> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap[DeserializedPropertyDescriptor]

'remove' @ [37:25] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[DeserializedSimpleFunctionDescriptor]

'oldPath' @ [37:32] ==> val oldPath: String defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'removed' @ [38:17] ==> val removed: ArrayList<File> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'add' @ [38:25] ==> public open fun add(element: File): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'File' @ [38:29] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'oldPath' @ [38:34] ==> val oldPath: String defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'newPaths' @ [42:22] ==> val newPaths: HashSet<(String..String?)> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'File' @ [43:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [43:29] ==> val path: (String..String?) defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'storage' @ [44:31] ==> protected final val storage: LazyStorage<String, FileSnapshot> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap[DeserializedPropertyDescriptor]

'path' @ [44:39] ==> val path: (String..String?) defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'snapshotProvider' @ [45:31] ==> val snapshotProvider: SimpleFileSnapshotProviderImpl defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'file' @ [45:48] ==> val file: File defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'oldSnapshot' @ [47:17] ==> val oldSnapshot: FileSnapshot? defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'oldSnapshot' @ [47:40] ==> val oldSnapshot: FileSnapshot? defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'newSnapshot' @ [47:55] ==> val newSnapshot: FileSnapshot defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'newOrModified' @ [48:17] ==> val newOrModified: ArrayList<File> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'add' @ [48:31] ==> public open fun add(element: File): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'file' @ [48:35] ==> val file: File defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'storage' @ [49:17] ==> protected final val storage: LazyStorage<String, FileSnapshot> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap[DeserializedPropertyDescriptor]

'path' @ [49:25] ==> val path: (String..String?) defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'newSnapshot' @ [49:33] ==> val newSnapshot: FileSnapshot defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'Known' @ [53:29] ==> public constructor Known(modified: List<File>, removed: List<File>) defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[ClassConstructorDescriptorImpl]

'newOrModified' @ [53:35] ==> val newOrModified: ArrayList<File> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

'removed' @ [53:50] ==> val removed: ArrayList<File> defined in org.jetbrains.kotlin.incremental.snapshots.FileSnapshotMap.compareAndUpdate[LocalVariableDescriptor]

