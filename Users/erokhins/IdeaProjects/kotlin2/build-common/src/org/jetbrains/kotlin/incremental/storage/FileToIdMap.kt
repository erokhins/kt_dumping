'BasicMap<File, Int>' @ [22:42] ==> public constructor BasicMap<K : Comparable<File>, V>(storageFile: File, keyDescriptor: KeyDescriptor<File>, valueExternalizer: DataExternalizer<Int>) defined in org.jetbrains.kotlin.incremental.storage.BasicMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K : Comparable<K>> -> File
    <V> -> Int

'file' @ [22:62] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.<init>[ValueParameterDescriptorImpl]

'FileKeyDescriptor' @ [22:68] ==> public object FileKeyDescriptor : KeyDescriptor<File> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'IntExternalizer' @ [22:87] ==> public object IntExternalizer : DataExternalizer<Int> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'key' @ [23:47] ==> value-parameter key: File defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.dumpKey[ValueParameterDescriptorImpl]

'toString' @ [23:51] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'value' @ [25:50] ==> value-parameter value: Int defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.dumpValue[ValueParameterDescriptorImpl]

'toString' @ [25:56] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'storage' @ [27:42] ==> protected final val storage: LazyStorage<File, Int> defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[PropertyDescriptorImpl]

'file' @ [27:50] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.get[ValueParameterDescriptorImpl]

'storage' @ [30:9] ==> protected final val storage: LazyStorage<File, Int> defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[PropertyDescriptorImpl]

'file' @ [30:17] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.set[ValueParameterDescriptorImpl]

'id' @ [30:25] ==> value-parameter id: Int defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.set[ValueParameterDescriptorImpl]

'storage' @ [34:9] ==> protected final val storage: LazyStorage<File, Int> defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[PropertyDescriptorImpl]

'remove' @ [34:17] ==> public final fun remove(key: File): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'file' @ [34:24] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.remove[ValueParameterDescriptorImpl]

'storage' @ [37:35] ==> protected final val storage: LazyStorage<File, Int> defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[PropertyDescriptorImpl]

'keys' @ [37:43] ==> public final val keys: Collection<File> defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[PropertyDescriptorImpl]

'keysToMap' @ [37:48] ==> public fun <K, V> Iterable<File>.keysToMap(value: (File) -> Int): Map<File, Int> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> Int

'storage' @ [37:60] ==> protected final val storage: LazyStorage<File, Int> defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap[PropertyDescriptorImpl]

'it' @ [37:68] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.storage.FileToIdMap.toMap.<anonymous>[ValueParameterDescriptorImpl]

