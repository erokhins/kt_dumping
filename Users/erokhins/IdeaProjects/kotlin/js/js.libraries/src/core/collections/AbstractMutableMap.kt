'AbstractMap<K, V>' @ [31:74] ==> protected constructor AbstractMap<K, out V>() defined in kotlin.collections.AbstractMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <out V> -> V

'this' @ [37:47] ==> public constructor SimpleEntry<K, V>(key: K, value: V) defined in kotlin.collections.AbstractMutableMap.SimpleEntry[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'entry' @ [37:52] ==> value-parameter entry: Map.Entry<K, V> defined in kotlin.collections.AbstractMutableMap.SimpleEntry.<init>[ValueParameterDescriptorImpl]

'key' @ [37:58] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[PropertyDescriptorImpl]

'entry' @ [37:63] ==> value-parameter entry: Map.Entry<K, V> defined in kotlin.collections.AbstractMutableMap.SimpleEntry.<init>[ValueParameterDescriptorImpl]

'value' @ [37:69] ==> public abstract val value: V defined in kotlin.collections.Map.Entry[PropertyDescriptorImpl]

'value' @ [39:30] ==> value-parameter value: V defined in kotlin.collections.AbstractMutableMap.SimpleEntry.<init>[ValueParameterDescriptorImpl]

'_value' @ [41:39] ==> private final var _value: V defined in kotlin.collections.AbstractMutableMap.SimpleEntry[PropertyDescriptorImpl]

'this' @ [44:28] ==> <this> defined in kotlin.collections.AbstractMutableMap.SimpleEntry[LazyClassReceiverParameterDescriptor]

'_value' @ [44:33] ==> private final var _value: V defined in kotlin.collections.AbstractMutableMap.SimpleEntry[PropertyDescriptorImpl]

'this' @ [45:13] ==> <this> defined in kotlin.collections.AbstractMutableMap.SimpleEntry[LazyClassReceiverParameterDescriptor]

'_value' @ [45:18] ==> private final var _value: V defined in kotlin.collections.AbstractMutableMap.SimpleEntry[PropertyDescriptorImpl]

'newValue' @ [45:27] ==> value-parameter newValue: V defined in kotlin.collections.AbstractMutableMap.SimpleEntry.setValue[ValueParameterDescriptorImpl]

'oldValue' @ [46:20] ==> val oldValue: V defined in kotlin.collections.AbstractMutableMap.SimpleEntry.setValue[LocalVariableDescriptor]

'entryHashCode' @ [49:40] ==> internal final fun entryHashCode(e: Map.Entry<*, *>): Int defined in kotlin.collections.AbstractMap.Companion[SimpleFunctionDescriptorImpl]

'this' @ [49:54] ==> <this> defined in kotlin.collections.AbstractMutableMap.SimpleEntry[LazyClassReceiverParameterDescriptor]

'entryToString' @ [50:43] ==> internal final fun entryToString(e: Map.Entry<*, *>): String defined in kotlin.collections.AbstractMap.Companion[SimpleFunctionDescriptorImpl]

'this' @ [50:57] ==> <this> defined in kotlin.collections.AbstractMutableMap.SimpleEntry[LazyClassReceiverParameterDescriptor]

'entryEquals' @ [51:53] ==> internal final fun entryEquals(e: Map.Entry<*, *>, other: Any?): Boolean defined in kotlin.collections.AbstractMap.Companion[SimpleFunctionDescriptorImpl]

'this' @ [51:65] ==> <this> defined in kotlin.collections.AbstractMutableMap.SimpleEntry[LazyClassReceiverParameterDescriptor]

'other' @ [51:71] ==> value-parameter other: Any? defined in kotlin.collections.AbstractMutableMap.SimpleEntry.equals[ValueParameterDescriptorImpl]

'entries' @ [56:9] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'clear' @ [56:17] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[SimpleFunctionDescriptorImpl]

'_keys' @ [61:13] ==> private final var _keys: MutableSet<K>? defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'_keys' @ [62:13] ==> private final var _keys: MutableSet<K>? defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'AbstractMutableSet<K>' @ [62:30] ==> protected constructor AbstractMutableSet<E>() defined in kotlin.collections.AbstractMutableSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> K

'UnsupportedOperationException' @ [63:63] ==> public constructor UnsupportedOperationException(message: String? = ...) defined in kotlin.UnsupportedOperationException[ClassConstructorDescriptorImpl]

'this@AbstractMutableMap' @ [65:21] ==> <this> defined in kotlin.collections.AbstractMutableMap[LazyClassReceiverParameterDescriptor]

'clear' @ [65:45] ==> public open fun clear(): Unit defined in kotlin.collections.AbstractMutableMap[SimpleFunctionDescriptorImpl]

'containsKey' @ [68:71] ==> public open fun containsKey(key: K): Boolean defined in kotlin.collections.AbstractMutableMap[SimpleFunctionDescriptorImpl]

'element' @ [68:83] ==> value-parameter element: K defined in kotlin.collections.AbstractMutableMap.<get-keys>.<no name provided>.contains[ValueParameterDescriptorImpl]

'entries' @ [71:41] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'iterator' @ [71:49] ==> public abstract fun iterator(): MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.MutableSet[SimpleFunctionDescriptorImpl]

'entryIterator' @ [73:59] ==> val entryIterator: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.<get-keys>.<no name provided>.iterator[LocalVariableDescriptor]

'hasNext' @ [73:73] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'entryIterator' @ [74:50] ==> val entryIterator: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.<get-keys>.<no name provided>.iterator[LocalVariableDescriptor]

'next' @ [74:64] ==> public abstract fun next(): MutableMap.MutableEntry<K, V> defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'key' @ [74:71] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'entryIterator' @ [75:49] ==> val entryIterator: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.<get-keys>.<no name provided>.iterator[LocalVariableDescriptor]

'remove' @ [75:63] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'containsKey' @ [80:25] ==> public open fun containsKey(key: K): Boolean defined in kotlin.collections.AbstractMutableMap[SimpleFunctionDescriptorImpl]

'element' @ [80:37] ==> value-parameter element: K defined in kotlin.collections.AbstractMutableMap.<get-keys>.<no name provided>.remove[ValueParameterDescriptorImpl]

'this@AbstractMutableMap' @ [81:25] ==> <this> defined in kotlin.collections.AbstractMutableMap[LazyClassReceiverParameterDescriptor]

'remove' @ [81:49] ==> public open fun remove(key: K): V? defined in kotlin.collections.AbstractMutableMap[SimpleFunctionDescriptorImpl]

'element' @ [81:56] ==> value-parameter element: K defined in kotlin.collections.AbstractMutableMap.<get-keys>.<no name provided>.remove[ValueParameterDescriptorImpl]

'this@AbstractMutableMap' @ [87:48] ==> <this> defined in kotlin.collections.AbstractMutableMap[LazyClassReceiverParameterDescriptor]

'size' @ [87:72] ==> public open val size: Int defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'_keys' @ [90:16] ==> private final var _keys: MutableSet<K>? defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'component1' @ [96:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<K, V>.component1(): K defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'component2' @ [96:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<K, V>.component2(): V defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'from' @ [96:30] ==> value-parameter from: Map<out K, V> defined in kotlin.collections.AbstractMutableMap.putAll[ValueParameterDescriptorImpl]

'put' @ [97:13] ==> public abstract fun put(key: K, value: V): V? defined in kotlin.collections.AbstractMutableMap[SimpleFunctionDescriptorImpl]

'key' @ [97:17] ==> val key: K defined in kotlin.collections.AbstractMutableMap.putAll[LocalVariableDescriptor]

'value' @ [97:22] ==> val value: V defined in kotlin.collections.AbstractMutableMap.putAll[LocalVariableDescriptor]

'_values' @ [103:13] ==> private final var _values: MutableCollection<V>? defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'_values' @ [104:13] ==> private final var _values: MutableCollection<V>? defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'AbstractMutableCollection<V>' @ [104:32] ==> protected constructor AbstractMutableCollection<E>() defined in kotlin.collections.AbstractMutableCollection[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> V

'UnsupportedOperationException' @ [105:63] ==> public constructor UnsupportedOperationException(message: String? = ...) defined in kotlin.UnsupportedOperationException[ClassConstructorDescriptorImpl]

'this@AbstractMutableMap' @ [106:40] ==> <this> defined in kotlin.collections.AbstractMutableMap[LazyClassReceiverParameterDescriptor]

'clear' @ [106:64] ==> public open fun clear(): Unit defined in kotlin.collections.AbstractMutableMap[SimpleFunctionDescriptorImpl]

'containsValue' @ [108:71] ==> public open fun containsValue(value: V): Boolean defined in kotlin.collections.AbstractMutableMap[SimpleFunctionDescriptorImpl]

'element' @ [108:85] ==> value-parameter element: V defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>.contains[ValueParameterDescriptorImpl]

'entries' @ [111:41] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'iterator' @ [111:49] ==> public abstract fun iterator(): MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.MutableSet[SimpleFunctionDescriptorImpl]

'entryIterator' @ [113:59] ==> val entryIterator: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>.iterator[LocalVariableDescriptor]

'hasNext' @ [113:73] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'entryIterator' @ [114:50] ==> val entryIterator: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>.iterator[LocalVariableDescriptor]

'next' @ [114:64] ==> public abstract fun next(): MutableMap.MutableEntry<K, V> defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'value' @ [114:71] ==> public abstract val value: V defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'entryIterator' @ [115:49] ==> val entryIterator: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>.iterator[LocalVariableDescriptor]

'remove' @ [115:63] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'this@AbstractMutableMap' @ [119:48] ==> <this> defined in kotlin.collections.AbstractMutableMap[LazyClassReceiverParameterDescriptor]

'size' @ [119:72] ==> public open val size: Int defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'this' @ [123:25] ==> <this> defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>[LazyClassReceiverParameterDescriptor]

'other' @ [123:34] ==> value-parameter other: Any? defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>.equals[ValueParameterDescriptorImpl]

'other' @ [124:25] ==> value-parameter other: Any? defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>.equals[ValueParameterDescriptorImpl]

'AbstractList' @ [125:28] ==> internal companion object defined in kotlin.collections.AbstractList[FakeCallableDescriptorForObject]

'orderedEquals' @ [125:41] ==> internal final fun orderedEquals(c: Collection<*>, other: Collection<*>): Boolean defined in kotlin.collections.AbstractList.Companion[SimpleFunctionDescriptorImpl]

'this' @ [125:55] ==> <this> defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>[LazyClassReceiverParameterDescriptor]

'other' @ [125:61] ==> value-parameter other: Any? defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>.equals[ValueParameterDescriptorImpl]

'AbstractList' @ [127:48] ==> internal companion object defined in kotlin.collections.AbstractList[FakeCallableDescriptorForObject]

'orderedHashCode' @ [127:61] ==> internal final fun orderedHashCode(c: Collection<*>): Int defined in kotlin.collections.AbstractList.Companion[SimpleFunctionDescriptorImpl]

'this' @ [127:77] ==> <this> defined in kotlin.collections.AbstractMutableMap.<get-values>.<no name provided>[LazyClassReceiverParameterDescriptor]

'_values' @ [130:16] ==> private final var _values: MutableCollection<V>? defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'entries' @ [134:20] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap[PropertyDescriptorImpl]

'iterator' @ [134:28] ==> public abstract fun iterator(): MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.MutableSet[SimpleFunctionDescriptorImpl]

'iter' @ [135:16] ==> val iter: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.remove[LocalVariableDescriptor]

'hasNext' @ [135:21] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'iter' @ [136:25] ==> val iter: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.remove[LocalVariableDescriptor]

'next' @ [136:30] ==> public abstract fun next(): MutableMap.MutableEntry<K, V> defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'entry' @ [137:21] ==> var entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.AbstractMutableMap.remove[LocalVariableDescriptor]

'key' @ [137:27] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'key' @ [138:17] ==> value-parameter key: K defined in kotlin.collections.AbstractMutableMap.remove[ValueParameterDescriptorImpl]

'k' @ [138:24] ==> val k: K defined in kotlin.collections.AbstractMutableMap.remove[LocalVariableDescriptor]

'entry' @ [139:29] ==> var entry: MutableMap.MutableEntry<K, V> defined in kotlin.collections.AbstractMutableMap.remove[LocalVariableDescriptor]

'value' @ [139:35] ==> public abstract val value: V defined in kotlin.collections.MutableMap.MutableEntry[PropertyDescriptorImpl]

'iter' @ [140:17] ==> val iter: MutableIterator<MutableMap.MutableEntry<K, V>> defined in kotlin.collections.AbstractMutableMap.remove[LocalVariableDescriptor]

'remove' @ [140:22] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[SimpleFunctionDescriptorImpl]

'value' @ [141:24] ==> val value: V defined in kotlin.collections.AbstractMutableMap.remove[LocalVariableDescriptor]

