'BasicStringMap<Collection<String>>' @ [25:5] ==> public constructor BasicStringMap<V>(storageFile: File, valueExternalizer: DataExternalizer<Collection<String>>) defined in org.jetbrains.kotlin.incremental.storage.BasicStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <V> -> Collection<String>

'storageFile' @ [25:40] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.<init>[ValueParameterDescriptorImpl]

'StringCollectionExternalizer' @ [25:53] ==> public object StringCollectionExternalizer : CollectionExternalizer<String> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'value' @ [26:65] ==> value-parameter value: Collection<String> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.dumpValue[ValueParameterDescriptorImpl]

'dumpCollection' @ [26:71] ==> @TestOnly public fun <T : Comparable<String>> Collection<String>.dumpCollection(): String defined in org.jetbrains.kotlin.incremental[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Comparable<T>> -> String

'storage' @ [29:9] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[PropertyDescriptorImpl]

'append' @ [29:17] ==> public final fun append(key: String, value: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'key' @ [29:24] ==> value-parameter key: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.add[ValueParameterDescriptorImpl]

'asString' @ [29:28] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'value' @ [29:40] ==> value-parameter value: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.add[ValueParameterDescriptorImpl]

'asString' @ [29:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'storage' @ [33:13] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[PropertyDescriptorImpl]

'key' @ [33:21] ==> value-parameter key: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.get[ValueParameterDescriptorImpl]

'asString' @ [33:25] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'map' @ [33:38] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'FqName' @ [33:44] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'setOf' @ [33:55] ==> @InlineOnly public inline fun <T> setOf(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'values' @ [36:13] ==> value-parameter values: Collection<FqName> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.set[ValueParameterDescriptorImpl]

'isEmpty' @ [36:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'remove' @ [37:13] ==> public final fun remove(key: FqName): Unit defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[SimpleFunctionDescriptorImpl]

'key' @ [37:20] ==> value-parameter key: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.set[ValueParameterDescriptorImpl]

'storage' @ [41:9] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[PropertyDescriptorImpl]

'key' @ [41:17] ==> value-parameter key: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.set[ValueParameterDescriptorImpl]

'asString' @ [41:21] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'values' @ [41:35] ==> value-parameter values: Collection<FqName> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.set[ValueParameterDescriptorImpl]

'map' @ [41:42] ==> public inline fun <T, R> Iterable<FqName>.map(transform: (FqName) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> String

'asString' @ [41:54] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'storage' @ [45:9] ==> protected final val storage: LazyStorage<String, Collection<String>> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[PropertyDescriptorImpl]

'remove' @ [45:17] ==> public final fun remove(key: String): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'key' @ [45:24] ==> value-parameter key: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.remove[ValueParameterDescriptorImpl]

'asString' @ [45:28] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'this' @ [49:26] ==> <this> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[LazyClassReceiverParameterDescriptor]

'key' @ [49:31] ==> value-parameter key: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.removeValues[ValueParameterDescriptorImpl]

'filter' @ [49:36] ==> public inline fun <T> Iterable<FqName>.filter(predicate: (FqName) -> Boolean): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'it' @ [49:45] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.removeValues.<anonymous>[ValueParameterDescriptorImpl]

'removed' @ [49:52] ==> value-parameter removed: Set<FqName> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.removeValues[ValueParameterDescriptorImpl]

'this' @ [50:9] ==> <this> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[LazyClassReceiverParameterDescriptor]

'key' @ [50:14] ==> value-parameter key: FqName defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.removeValues[ValueParameterDescriptorImpl]

'notRemoved' @ [50:21] ==> val notRemoved: List<FqName> defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap.removeValues[LocalVariableDescriptor]

'ClassOneToManyMap' @ [54:49] ==> public constructor ClassOneToManyMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[ClassConstructorDescriptorImpl]

'storageFile' @ [54:67] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.storage.SubtypesMap.<init>[ValueParameterDescriptorImpl]

'ClassOneToManyMap' @ [55:51] ==> public constructor ClassOneToManyMap(storageFile: File) defined in org.jetbrains.kotlin.incremental.storage.ClassOneToManyMap[ClassConstructorDescriptorImpl]

'storageFile' @ [55:69] ==> value-parameter storageFile: File defined in org.jetbrains.kotlin.incremental.storage.SupertypesMap.<init>[ValueParameterDescriptorImpl]

