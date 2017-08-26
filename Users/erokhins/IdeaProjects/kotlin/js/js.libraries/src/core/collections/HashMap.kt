'AbstractMutableSet<MutableEntry<K, V>>' @ [33:36] ==> protected constructor AbstractMutableSet<E>() defined in kotlin.collections.AbstractMutableSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> MutableEntry<K, V>

'UnsupportedOperationException' @ [35:72] ==> public constructor UnsupportedOperationException(message: String? = ...) defined in kotlin.UnsupportedOperationException[ClassConstructorDescriptorImpl]

'this@HashMap' @ [37:13] ==> <this> defined in kotlin.collections.HashMap[LazyClassReceiverParameterDescriptor]

'clear' @ [37:26] ==> public open fun clear(): Unit defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'containsEntry' @ [40:80] ==> internal final fun containsEntry(entry: Map.Entry<*, *>?): Boolean defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'element' @ [40:94] ==> value-parameter element: MutableMap.MutableEntry<K, V> defined in kotlin.collections.HashMap.EntrySet.contains[ValueParameterDescriptorImpl]

'internalMap' @ [42:81] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'iterator' @ [42:93] ==> public abstract fun iterator(): MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.InternalMap[SimpleFunctionDescriptorImpl]

'contains' @ [45:17] ==> public open fun contains(element: MutableMap.MutableEntry<K, V>): Boolean defined in kotlin.collections.HashMap.EntrySet[SimpleFunctionDescriptorImpl]

'element' @ [45:26] ==> value-parameter element: MutableMap.MutableEntry<K, V> defined in kotlin.collections.HashMap.EntrySet.remove[ValueParameterDescriptorImpl]

'this@HashMap' @ [46:17] ==> <this> defined in kotlin.collections.HashMap[LazyClassReceiverParameterDescriptor]

'remove' @ [46:30] ==> public open fun remove(key: K): V? defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'element' @ [46:37] ==> value-parameter element: MutableMap.MutableEntry<K, V> defined in kotlin.collections.HashMap.EntrySet.remove[ValueParameterDescriptorImpl]

'key' @ [46:45] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'this@HashMap' @ [52:40] ==> <this> defined in kotlin.collections.HashMap[LazyClassReceiverParameterDescriptor]

'size' @ [52:53] ==> public open val size: Int defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'super' @ [63:60] ==> protected constructor AbstractMutableMap<K, V>() defined in kotlin.collections.AbstractMutableMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'this' @ [64:9] ==> <this> defined in kotlin.collections.HashMap[LazyClassReceiverParameterDescriptor]

'internalMap' @ [64:14] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'internalMap' @ [64:28] ==> value-parameter internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap.<init>[ValueParameterDescriptorImpl]

'this' @ [65:9] ==> <this> defined in kotlin.collections.HashMap[LazyClassReceiverParameterDescriptor]

'equality' @ [65:14] ==> private final val equality: EqualityComparator defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'internalMap' @ [65:25] ==> value-parameter internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap.<init>[ValueParameterDescriptorImpl]

'equality' @ [65:37] ==> public abstract val equality: EqualityComparator defined in kotlin.collections.InternalMap[PropertyDescriptorImpl]

'this' @ [71:21] ==> internal constructor HashMap<K, V>(internalMap: InternalMap<K, V>) defined in kotlin.collections.HashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'InternalHashCodeMap' @ [71:26] ==> public constructor InternalHashCodeMap<K, V>(equality: EqualityComparator) defined in kotlin.collections.InternalHashCodeMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'HashCode' @ [71:65] ==> public object HashCode : EqualityComparator defined in kotlin.collections.EqualityComparator[FakeCallableDescriptorForObject]

'this' @ [81:65] ==> public constructor HashMap<K, V>() defined in kotlin.collections.HashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'require' @ [83:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'initialCapacity' @ [83:17] ==> value-parameter initialCapacity: Int defined in kotlin.collections.HashMap.<init>[ValueParameterDescriptorImpl]

'require' @ [84:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'loadFactor' @ [84:17] ==> value-parameter loadFactor: Float = ... defined in kotlin.collections.HashMap.<init>[ValueParameterDescriptorImpl]

'this' @ [90:44] ==> public constructor HashMap<K, V>() defined in kotlin.collections.HashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'this' @ [91:9] ==> <this> defined in kotlin.collections.HashMap[LazyClassReceiverParameterDescriptor]

'putAll' @ [91:14] ==> public open fun putAll(from: Map<out K, V>): Unit defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'original' @ [91:21] ==> value-parameter original: Map<out K, V> defined in kotlin.collections.HashMap.<init>[ValueParameterDescriptorImpl]

'internalMap' @ [95:9] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'clear' @ [95:21] ==> public abstract fun clear(): Unit defined in kotlin.collections.InternalMap[SimpleFunctionDescriptorImpl]

'internalMap' @ [99:49] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'contains' @ [99:61] ==> public abstract operator fun contains(key: K): Boolean defined in kotlin.collections.InternalMap[SimpleFunctionDescriptorImpl]

'key' @ [99:70] ==> value-parameter key: K defined in kotlin.collections.HashMap.containsKey[ValueParameterDescriptorImpl]

'internalMap' @ [101:53] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'any' @ [101:65] ==> public inline fun <T> Iterable<MutableMap.MutableEntry<K, V>>.any(predicate: (MutableMap.MutableEntry<K, V>) -> Boolean): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> MutableEntry<K, V>

'equality' @ [101:71] ==> private final val equality: EqualityComparator defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'equals' @ [101:80] ==> public abstract fun equals(value1: Any?, value2: Any?): Boolean defined in kotlin.collections.EqualityComparator[SimpleFunctionDescriptorImpl]

'it' @ [101:87] ==> value-parameter it: MutableMap.MutableEntry<K, V> defined in kotlin.collections.HashMap.containsValue.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [101:90] ==> public abstract val value: V defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'value' @ [101:97] ==> value-parameter value: V defined in kotlin.collections.HashMap.containsValue[ValueParameterDescriptorImpl]

'_entries' @ [105:13] ==> private final var _entries: MutableSet<MutableMap.MutableEntry<K, V>>? defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'_entries' @ [106:13] ==> private final var _entries: MutableSet<MutableMap.MutableEntry<K, V>>? defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'createEntrySet' @ [106:24] ==> protected open fun createEntrySet(): MutableSet<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'_entries' @ [108:16] ==> private final var _entries: MutableSet<MutableMap.MutableEntry<K, V>>? defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'EntrySet' @ [111:86] ==> public constructor EntrySet() defined in kotlin.collections.HashMap.EntrySet[ClassConstructorDescriptorImpl]

'internalMap' @ [113:45] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'get' @ [113:57] ==> public abstract operator fun get(key: K): V? defined in kotlin.collections.InternalMap[SimpleFunctionDescriptorImpl]

'key' @ [113:61] ==> value-parameter key: K defined in kotlin.collections.HashMap.get[ValueParameterDescriptorImpl]

'internalMap' @ [115:46] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'put' @ [115:58] ==> public abstract fun put(key: K, value: V): V? defined in kotlin.collections.InternalMap[SimpleFunctionDescriptorImpl]

'key' @ [115:62] ==> value-parameter key: K defined in kotlin.collections.HashMap.put[ValueParameterDescriptorImpl]

'value' @ [115:67] ==> value-parameter value: V defined in kotlin.collections.HashMap.put[ValueParameterDescriptorImpl]

'internalMap' @ [117:39] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'remove' @ [117:51] ==> public abstract fun remove(key: K): V? defined in kotlin.collections.InternalMap[SimpleFunctionDescriptorImpl]

'key' @ [117:58] ==> value-parameter key: K defined in kotlin.collections.HashMap.remove[ValueParameterDescriptorImpl]

'internalMap' @ [119:36] ==> private final val internalMap: InternalMap<K, V> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'size' @ [119:48] ==> public abstract val size: Int defined in kotlin.collections.InternalMap[PropertyDescriptorImpl]

'HashMap' @ [128:12] ==> internal constructor HashMap<K, V>(internalMap: InternalMap<String, V>) defined in kotlin.collections.HashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> V

'InternalStringMap' @ [128:31] ==> public constructor InternalStringMap<K, V>(equality: EqualityComparator) defined in kotlin.collections.InternalStringMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> V

'HashCode' @ [128:68] ==> public object HashCode : EqualityComparator defined in kotlin.collections.EqualityComparator[FakeCallableDescriptorForObject]

'apply' @ [128:79] ==> @InlineOnly public inline fun <T> HashMap<String, V>.apply(block: HashMap<String, V>.() -> Unit): HashMap<String, V> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> HashMap<String, V>

'putAll' @ [128:87] ==> public fun <K, V> MutableMap<in String, in V>.putAll(pairs: Array<out Pair<String, V>>): Unit defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> V

'pairs' @ [128:94] ==> value-parameter vararg pairs: Pair<String, V> defined in kotlin.collections.stringMapOf[ValueParameterDescriptorImpl]

