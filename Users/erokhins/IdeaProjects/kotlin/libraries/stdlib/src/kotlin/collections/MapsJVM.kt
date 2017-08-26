'kotlin.jvm.JvmMultifileClass' @ [1:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[DeserializedClassConstructorDescriptor]

'kotlin.jvm.JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'kotlin.jvm.JvmVersion' @ [3:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'this' @ [27:12] ==> <this> defined in kotlin.collections.getOrPut[ReceiverParameterDescriptorImpl]

'get' @ [27:17] ==> public abstract fun get(key: (K..K?)): V? defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

'key' @ [27:21] ==> value-parameter key: K defined in kotlin.collections.getOrPut[ValueParameterDescriptorImpl]

'invoke' @ [28:13] ==> public abstract operator fun invoke(): V defined in kotlin.Function0[FunctionInvokeDescriptor]

'let' @ [28:28] ==> @InlineOnly public inline fun <T, R> V.let(block: (V) -> V): V defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V
    <R> -> V

'this' @ [28:45] ==> <this> defined in kotlin.collections.getOrPut[ReceiverParameterDescriptorImpl]

'putIfAbsent' @ [28:50] ==> public abstract fun putIfAbsent(p0: (K..K?), p1: (V..V?)): (V..V?) defined in java.util.concurrent.ConcurrentMap[JavaMethodDescriptor]

'key' @ [28:62] ==> value-parameter key: K defined in kotlin.collections.getOrPut[ValueParameterDescriptorImpl]

'default' @ [28:67] ==> value-parameter default: V defined in kotlin.collections.getOrPut.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [28:79] ==> value-parameter default: V defined in kotlin.collections.getOrPut.<anonymous>[ValueParameterDescriptorImpl]

'TreeMap' @ [38:82] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (K..K?), out (V..V?)>..Map<out (K..K?), (V..V?)>?)) defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (V..V?)

'this' @ [38:90] ==> <this> defined in kotlin.collections.toSortedMap[ReceiverParameterDescriptorImpl]

'TreeMap' @ [47:11] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>(p0: (Comparator<in (K..K?)>..Comparator<in (K..K?)>?)) defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'comparator' @ [47:25] ==> value-parameter comparator: Comparator<in K> defined in kotlin.collections.toSortedMap[ValueParameterDescriptorImpl]

'apply' @ [47:37] ==> @InlineOnly public inline fun <T> TreeMap<K, V>.apply(block: TreeMap<K, V>.() -> Unit): TreeMap<K, V> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TreeMap<K, V>

'putAll' @ [47:45] ==> public open fun putAll(from: Map<out K, V>): Unit defined in java.util.TreeMap[JavaMethodDescriptor]

'this@toSortedMap' @ [47:52] ==> <this> defined in kotlin.collections.toSortedMap[ReceiverParameterDescriptorImpl]

'TreeMap' @ [56:11] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'apply' @ [56:27] ==> @InlineOnly public inline fun <T> TreeMap<K, V>.apply(block: TreeMap<K, V>.() -> Unit): TreeMap<K, V> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TreeMap<K, V>

'putAll' @ [56:35] ==> public fun <K, V> MutableMap<in K, in V>.putAll(pairs: Array<out Pair<K, V>>): Unit defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'pairs' @ [56:42] ==> value-parameter vararg pairs: Pair<K, V> defined in kotlin.collections.sortedMapOf[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [64:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Properties' @ [66:11] ==> public constructor Properties() defined in java.util.Properties[JavaClassConstructorDescriptor]

'apply' @ [66:24] ==> @InlineOnly public inline fun <T> Properties.apply(block: Properties.() -> Unit): Properties defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Properties

'putAll' @ [66:32] ==> public open fun putAll(from: Map<out (Any..Any?), (Any..Any?)>): Unit defined in java.util.Properties[JavaMethodDescriptor]

'this@toProperties' @ [66:39] ==> <this> defined in kotlin.collections.toProperties[ReceiverParameterDescriptorImpl]

