'BasicMap<LookupSymbolKey, Collection<Int>>' @ [21:43] ==> public constructor BasicMap<K : Comparable<LookupSymbolKey>, V>(storageFile: File, keyDescriptor: KeyDescriptor<LookupSymbolKey>, valueExternalizer: DataExternalizer<Collection<Int>>) defined in org.jetbrains.kotlin.incremental.storage.BasicMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K : Comparable<K>> -> LookupSymbolKey
    <V> -> Collection<Int>

'storage' @ [21:86] ==> value-parameter storage: File defined in org.jetbrains.kotlin.incremental.storage.LookupMap.<init>[ValueParameterDescriptorImpl]

'LookupSymbolKeyDescriptor' @ [21:95] ==> public object LookupSymbolKeyDescriptor : KeyDescriptor<LookupSymbolKey> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'IntCollectionExternalizer' @ [21:122] ==> public object IntCollectionExternalizer : CollectionExternalizer<Int> defined in org.jetbrains.kotlin.incremental.storage in file externalizers.kt[FakeCallableDescriptorForObject]

'key' @ [22:58] ==> value-parameter key: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.storage.LookupMap.dumpKey[ValueParameterDescriptorImpl]

'toString' @ [22:62] ==> public open fun toString(): String defined in org.jetbrains.kotlin.incremental.storage.LookupSymbolKey[SimpleFunctionDescriptorImpl]

'value' @ [24:62] ==> value-parameter value: Collection<Int> defined in org.jetbrains.kotlin.incremental.storage.LookupMap.dumpValue[ValueParameterDescriptorImpl]

'toString' @ [24:68] ==> public open fun toString(): String defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'storage' @ [27:9] ==> protected final val storage: LazyStorage<LookupSymbolKey, Collection<Int>> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'append' @ [27:17] ==> public final fun append(key: LookupSymbolKey, value: Int): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'LookupSymbolKey' @ [27:24] ==> public constructor LookupSymbolKey(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.storage.LookupSymbolKey[ClassConstructorDescriptorImpl]

'name' @ [27:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.incremental.storage.LookupMap.add[ValueParameterDescriptorImpl]

'scope' @ [27:46] ==> value-parameter scope: String defined in org.jetbrains.kotlin.incremental.storage.LookupMap.add[ValueParameterDescriptorImpl]

'fileId' @ [27:54] ==> value-parameter fileId: Int defined in org.jetbrains.kotlin.incremental.storage.LookupMap.add[ValueParameterDescriptorImpl]

'storage' @ [30:64] ==> protected final val storage: LazyStorage<LookupSymbolKey, Collection<Int>> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'key' @ [30:72] ==> value-parameter key: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.storage.LookupMap.get[ValueParameterDescriptorImpl]

'storage' @ [33:9] ==> protected final val storage: LazyStorage<LookupSymbolKey, Collection<Int>> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'key' @ [33:17] ==> value-parameter key: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.storage.LookupMap.set[ValueParameterDescriptorImpl]

'fileIds' @ [33:24] ==> value-parameter fileIds: Set<Int> defined in org.jetbrains.kotlin.incremental.storage.LookupMap.set[ValueParameterDescriptorImpl]

'storage' @ [37:9] ==> protected final val storage: LazyStorage<LookupSymbolKey, Collection<Int>> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'remove' @ [37:17] ==> public final fun remove(key: LookupSymbolKey): Unit defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[SimpleFunctionDescriptorImpl]

'key' @ [37:24] ==> value-parameter key: LookupSymbolKey defined in org.jetbrains.kotlin.incremental.storage.LookupMap.remove[ValueParameterDescriptorImpl]

'storage' @ [41:17] ==> protected final val storage: LazyStorage<LookupSymbolKey, Collection<Int>> defined in org.jetbrains.kotlin.incremental.storage.LookupMap[PropertyDescriptorImpl]

'keys' @ [41:25] ==> public final val keys: Collection<LookupSymbolKey> defined in org.jetbrains.kotlin.incremental.storage.LazyStorage[PropertyDescriptorImpl]

