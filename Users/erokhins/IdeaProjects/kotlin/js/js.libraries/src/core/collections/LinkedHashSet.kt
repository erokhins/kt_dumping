'super' @ [30:56] ==> internal constructor HashSet<E>(map: HashMap<E, Any>) defined in kotlin.collections.HashSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'map' @ [30:62] ==> value-parameter map: LinkedHashMap<E, Any> defined in kotlin.collections.LinkedHashSet.<init>[ValueParameterDescriptorImpl]

'super' @ [35:21] ==> internal constructor HashSet<E>(map: HashMap<E, Any>) defined in kotlin.collections.HashSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'LinkedHashMap' @ [35:27] ==> public constructor LinkedHashMap<K, V>() defined in kotlin.collections.LinkedHashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> E
    <V> -> Any

'super' @ [40:44] ==> internal constructor HashSet<E>(map: HashMap<E, Any>) defined in kotlin.collections.HashSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'LinkedHashMap' @ [40:50] ==> public constructor LinkedHashMap<K, V>() defined in kotlin.collections.LinkedHashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> E
    <V> -> Any

'addAll' @ [41:9] ==> public open fun addAll(elements: Collection<E>): Boolean defined in kotlin.collections.LinkedHashSet[SimpleFunctionDescriptorImpl]

'elements' @ [41:16] ==> value-parameter elements: Collection<E> defined in kotlin.collections.LinkedHashSet.<init>[ValueParameterDescriptorImpl]

'super' @ [51:67] ==> internal constructor HashSet<E>(map: HashMap<E, Any>) defined in kotlin.collections.HashSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> E

'LinkedHashMap' @ [51:73] ==> public constructor LinkedHashMap<K, V>(initialCapacity: Int, loadFactor: Float = ...) defined in kotlin.collections.LinkedHashMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> E
    <V> -> Any

'initialCapacity' @ [51:95] ==> value-parameter initialCapacity: Int defined in kotlin.collections.LinkedHashSet.<init>[ValueParameterDescriptorImpl]

'loadFactor' @ [51:112] ==> value-parameter loadFactor: Float = ... defined in kotlin.collections.LinkedHashSet.<init>[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [64:12] ==> internal constructor LinkedHashSet<E>(map: LinkedHashMap<String, Any>) defined in kotlin.collections.LinkedHashSet[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> String

'linkedStringMapOf' @ [64:26] ==> public fun <V> linkedStringMapOf(vararg pairs: Pair<String, Any>): LinkedHashMap<String, Any> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> Any

'apply' @ [64:52] ==> @InlineOnly public inline fun <T> LinkedHashSet<String>.apply(block: LinkedHashSet<String>.() -> Unit): LinkedHashSet<String> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> LinkedHashSet<String>

'addAll' @ [64:60] ==> public fun <T> MutableCollection<in String>.addAll(elements: Array<out String>): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'elements' @ [64:67] ==> value-parameter vararg elements: String defined in kotlin.collections.linkedStringSetOf[ValueParameterDescriptorImpl]

