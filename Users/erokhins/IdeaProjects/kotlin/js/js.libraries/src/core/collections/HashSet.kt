'' @ [33:18] ==> protected constructor AbstractMutableSet<E>() defined in kotlin.collections.AbstractMutableSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'map' @ [34:9] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'HashMap' @ [34:15] ==> public constructor HashMap<K, V>() defined in kotlin.collections.HashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> E
    <V> -> Any

'' @ [40:41] ==> protected constructor AbstractMutableSet<E>() defined in kotlin.collections.AbstractMutableSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'map' @ [41:9] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'HashMap' @ [41:15] ==> public constructor HashMap<K, V>(initialCapacity: Int, loadFactor: Float = ...) defined in kotlin.collections.HashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> E
    <V> -> Any

'elements' @ [41:31] ==> value-parameter elements: Collection<E> defined in kotlin.collections.HashSet.<init>[ValueParameterDescriptorImpl]

'size' @ [41:40] ==> public abstract val size: Int defined in kotlin.collections.Collection[PropertyDescriptorImpl]

'addAll' @ [42:9] ==> public open fun addAll(elements: Collection<E>): Boolean defined in kotlin.collections.HashSet[SimpleFunctionDescriptorImpl]

'elements' @ [42:16] ==> value-parameter elements: Collection<E> defined in kotlin.collections.HashSet.<init>[ValueParameterDescriptorImpl]

'' @ [53:64] ==> protected constructor AbstractMutableSet<E>() defined in kotlin.collections.AbstractMutableSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'map' @ [54:9] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'HashMap' @ [54:15] ==> public constructor HashMap<K, V>(initialCapacity: Int, loadFactor: Float = ...) defined in kotlin.collections.HashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> E
    <V> -> Any

'initialCapacity' @ [54:31] ==> value-parameter initialCapacity: Int defined in kotlin.collections.HashSet.<init>[ValueParameterDescriptorImpl]

'loadFactor' @ [54:48] ==> value-parameter loadFactor: Float = ... defined in kotlin.collections.HashSet.<init>[ValueParameterDescriptorImpl]

'' @ [63:47] ==> protected constructor AbstractMutableSet<E>() defined in kotlin.collections.AbstractMutableSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'this' @ [64:9] ==> <this> defined in kotlin.collections.HashSet[LazyClassReceiverParameterDescriptor]

'map' @ [64:14] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'map' @ [64:20] ==> value-parameter map: HashMap<E, Any> defined in kotlin.collections.HashSet.<init>[ValueParameterDescriptorImpl]

'map' @ [68:19] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'put' @ [68:23] ==> public open fun put(key: E, value: Any): Any? defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'element' @ [68:27] ==> value-parameter element: E defined in kotlin.collections.HashSet.add[ValueParameterDescriptorImpl]

'this' @ [68:36] ==> <this> defined in kotlin.collections.HashSet[LazyClassReceiverParameterDescriptor]

'old' @ [69:16] ==> val old: Any? defined in kotlin.collections.HashSet.add[LocalVariableDescriptor]

'map' @ [73:9] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'clear' @ [73:13] ==> public open fun clear(): Unit defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'map' @ [80:59] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'containsKey' @ [80:63] ==> public open fun containsKey(key: E): Boolean defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'element' @ [80:75] ==> value-parameter element: E defined in kotlin.collections.HashSet.contains[ValueParameterDescriptorImpl]

'map' @ [82:39] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'isEmpty' @ [82:43] ==> public open fun isEmpty(): Boolean defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'map' @ [84:51] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'keys' @ [84:55] ==> public open val keys: MutableSet<E> defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'iterator' @ [84:60] ==> public abstract fun iterator(): MutableIterator<E> defined in kotlin.collections.MutableSet[SimpleFunctionDescriptorImpl]

'map' @ [86:48] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'remove' @ [86:52] ==> public open fun remove(key: E): Any? defined in kotlin.collections.HashMap[SimpleFunctionDescriptorImpl]

'element' @ [86:59] ==> value-parameter element: E defined in kotlin.collections.HashSet.remove[ValueParameterDescriptorImpl]

'map' @ [88:36] ==> private final val map: HashMap<E, Any> defined in kotlin.collections.HashSet[PropertyDescriptorImpl]

'size' @ [88:40] ==> public open val size: Int defined in kotlin.collections.HashMap[PropertyDescriptorImpl]

'HashSet' @ [97:12] ==> internal constructor HashSet<E>(map: HashMap<String, Any>) defined in kotlin.collections.HashSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'stringMapOf' @ [97:20] ==> public fun <V> stringMapOf(vararg pairs: Pair<String, Any>): HashMap<String, Any> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> Any

'apply' @ [97:40] ==> @InlineOnly public inline fun <T> HashSet<String>.apply(block: HashSet<String>.() -> Unit): HashSet<String> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> HashSet<String>

'addAll' @ [97:48] ==> public fun <T> MutableCollection<in String>.addAll(elements: Array<out String>): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'elements' @ [97:55] ==> value-parameter vararg elements: String defined in kotlin.collections.stringSetOf[ValueParameterDescriptorImpl]

