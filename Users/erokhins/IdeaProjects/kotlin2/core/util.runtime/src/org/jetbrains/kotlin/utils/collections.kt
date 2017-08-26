'associateBy' @ [23:12] ==> public inline fun <T, K, V> Iterable<K>.associateBy(keySelector: (K) -> K, valueTransform: (K) -> V): Map<K, V> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K
    <K> -> K
    <V> -> V

'it' @ [23:26] ==> value-parameter it: K defined in org.jetbrains.kotlin.utils.keysToMap.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [23:32] ==> value-parameter value: (K) -> V defined in org.jetbrains.kotlin.utils.keysToMap[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [27:15] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'this' @ [28:15] ==> <this> defined in org.jetbrains.kotlin.utils.keysToMapExceptNulls[ReceiverParameterDescriptorImpl]

'invoke' @ [29:17] ==> public abstract operator fun invoke(p1: K): V? defined in kotlin.Function1[FunctionInvokeDescriptor]

'k' @ [29:23] ==> val k: K defined in org.jetbrains.kotlin.utils.keysToMapExceptNulls[LocalVariableDescriptor]

'v' @ [30:13] ==> val v: V? defined in org.jetbrains.kotlin.utils.keysToMapExceptNulls[LocalVariableDescriptor]

'map' @ [31:13] ==> val map: LinkedHashMap<K, V> defined in org.jetbrains.kotlin.utils.keysToMapExceptNulls[LocalVariableDescriptor]

'k' @ [31:17] ==> val k: K defined in org.jetbrains.kotlin.utils.keysToMapExceptNulls[LocalVariableDescriptor]

'v' @ [31:22] ==> val v: V? defined in org.jetbrains.kotlin.utils.keysToMapExceptNulls[LocalVariableDescriptor]

'map' @ [34:12] ==> val map: LinkedHashMap<K, V> defined in org.jetbrains.kotlin.utils.keysToMapExceptNulls[LocalVariableDescriptor]

'LinkedHashMap' @ [38:15] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> Int

'component1' @ [39:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [39:18] ==> public final operator fun component2(): K defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'this' @ [39:24] ==> <this> defined in org.jetbrains.kotlin.utils.mapToIndex[ReceiverParameterDescriptorImpl]

'withIndex' @ [39:29] ==> public fun <T> Iterable<K>.withIndex(): Iterable<IndexedValue<K>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'map' @ [40:9] ==> val map: LinkedHashMap<K, Int> defined in org.jetbrains.kotlin.utils.mapToIndex[LocalVariableDescriptor]

'k' @ [40:13] ==> val k: K defined in org.jetbrains.kotlin.utils.mapToIndex[LocalVariableDescriptor]

'index' @ [40:18] ==> val index: Int defined in org.jetbrains.kotlin.utils.mapToIndex[LocalVariableDescriptor]

'map' @ [42:12] ==> val map: LinkedHashMap<K, Int> defined in org.jetbrains.kotlin.utils.mapToIndex[LocalVariableDescriptor]

'if (!containsKey(key)) {
        val answer = defaultValue()
        put(key, answer)
        answer
    }
    else {
        get(key) as V
    }' @ [46:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: V, elseBranch: V): V[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> V

'!' @ [46:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsKey' @ [46:17] ==> public abstract fun containsKey(key: K): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [46:29] ==> value-parameter key: K defined in org.jetbrains.kotlin.utils.getOrPutNullable[ValueParameterDescriptorImpl]

'invoke' @ [47:22] ==> public abstract operator fun invoke(): V defined in kotlin.Function0[FunctionInvokeDescriptor]

'put' @ [48:9] ==> public abstract fun put(key: K, value: V): V? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [48:13] ==> value-parameter key: K defined in org.jetbrains.kotlin.utils.getOrPutNullable[ValueParameterDescriptorImpl]

'answer' @ [48:18] ==> val answer: V defined in org.jetbrains.kotlin.utils.getOrPutNullable[LocalVariableDescriptor]

'answer' @ [49:9] ==> val answer: V defined in org.jetbrains.kotlin.utils.getOrPutNullable[LocalVariableDescriptor]

'get' @ [52:9] ==> public abstract fun get(key: K): V? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [52:13] ==> value-parameter key: K defined in org.jetbrains.kotlin.utils.getOrPutNullable[ValueParameterDescriptorImpl]

'if (isEmpty()) body() else this' @ [56:64] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: C, elseBranch: C): C[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> C

'isEmpty' @ [56:68] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'invoke' @ [56:79] ==> public abstract operator fun invoke(): C defined in kotlin.Function0[FunctionInvokeDescriptor]

'this' @ [56:91] ==> <this> defined in org.jetbrains.kotlin.utils.ifEmpty[ReceiverParameterDescriptorImpl]

'if (isEmpty()) body() else this' @ [58:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: M, elseBranch: M): M[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> M

'isEmpty' @ [58:67] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'invoke' @ [58:78] ==> public abstract operator fun invoke(): M defined in kotlin.Function0[FunctionInvokeDescriptor]

'this' @ [58:90] ==> <this> defined in org.jetbrains.kotlin.utils.ifEmpty[ReceiverParameterDescriptorImpl]

'if (isEmpty()) body() else this' @ [60:79] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<out T>, elseBranch: Array<out T>): Array<out T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<out T>

'isEmpty' @ [60:83] ==> @InlineOnly public inline fun <T> Array<out T>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'invoke' @ [60:94] ==> public abstract operator fun invoke(): Array<out T> defined in kotlin.Function0[FunctionInvokeDescriptor]

'this' @ [60:106] ==> <this> defined in org.jetbrains.kotlin.utils.ifEmpty[ReceiverParameterDescriptorImpl]

't' @ [63:9] ==> value-parameter t: T? defined in org.jetbrains.kotlin.utils.addIfNotNull[ValueParameterDescriptorImpl]

'add' @ [63:20] ==> public abstract fun add(element: T): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

't' @ [63:24] ==> value-parameter t: T? defined in org.jetbrains.kotlin.utils.addIfNotNull[ValueParameterDescriptorImpl]

'if (t != null) yield(t) else Unit' @ [66:65] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

't' @ [66:69] ==> value-parameter t: T? defined in org.jetbrains.kotlin.utils.yieldIfNotNull[ValueParameterDescriptorImpl]

'yield' @ [66:80] ==> public abstract suspend fun yield(value: T): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

't' @ [66:86] ==> value-parameter t: T? defined in org.jetbrains.kotlin.utils.yieldIfNotNull[ValueParameterDescriptorImpl]

'Unit' @ [66:94] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'HashMap' @ [69:9] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: Int) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'capacity' @ [69:17] ==> private fun capacity(expectedSize: Int): Int defined in org.jetbrains.kotlin.utils in file collections.kt[SimpleFunctionDescriptorImpl]

'expectedSize' @ [69:26] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.utils.newHashMapWithExpectedSize[ValueParameterDescriptorImpl]

'HashSet' @ [72:9] ==> public constructor HashSet<E : (Any..Any?)>(p0: Int) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> E

'capacity' @ [72:17] ==> private fun capacity(expectedSize: Int): Int defined in org.jetbrains.kotlin.utils in file collections.kt[SimpleFunctionDescriptorImpl]

'expectedSize' @ [72:26] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.utils.newHashSetWithExpectedSize[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [75:9] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>(p0: Int) defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'capacity' @ [75:23] ==> private fun capacity(expectedSize: Int): Int defined in org.jetbrains.kotlin.utils in file collections.kt[SimpleFunctionDescriptorImpl]

'expectedSize' @ [75:32] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.utils.newLinkedHashMapWithExpectedSize[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [78:9] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: Int) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> E

'capacity' @ [78:23] ==> private fun capacity(expectedSize: Int): Int defined in org.jetbrains.kotlin.utils in file collections.kt[SimpleFunctionDescriptorImpl]

'expectedSize' @ [78:32] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.utils.newLinkedHashSetWithExpectedSize[ValueParameterDescriptorImpl]

'if (expectedSize < 3) 3 else expectedSize + expectedSize / 3 + 1' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'expectedSize' @ [81:13] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.utils.capacity[ValueParameterDescriptorImpl]

'expectedSize' @ [81:38] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.utils.capacity[ValueParameterDescriptorImpl]

'expectedSize' @ [81:53] ==> value-parameter expectedSize: Int defined in org.jetbrains.kotlin.utils.capacity[ValueParameterDescriptorImpl]

'when (size) {
            0 -> emptyList()
            1 -> listOf(first())
            else -> apply { trimToSize() }
        }' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<T>, entry1: List<T>, entry2: List<T>): List<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<T>

'size' @ [84:15] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'emptyList' @ [85:18] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'listOf' @ [86:18] ==> public fun <T> listOf(element: T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'first' @ [86:25] ==> public fun <T> List<T>.first(): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'apply' @ [87:21] ==> @InlineOnly public inline fun <T> ArrayList<T>.apply(block: ArrayList<T>.() -> Unit): ArrayList<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<T>

'trimToSize' @ [87:29] ==> public open fun trimToSize(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'startFrom' @ [91:19] ==> value-parameter startFrom: Int defined in org.jetbrains.kotlin.utils.indexOfFirst[ValueParameterDescriptorImpl]

'lastIndex' @ [91:30] ==> public val <T> List<T>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'invoke' @ [92:13] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [92:23] ==> <this> defined in org.jetbrains.kotlin.utils.indexOfFirst[ReceiverParameterDescriptorImpl]

'index' @ [92:28] ==> val index: Int defined in org.jetbrains.kotlin.utils.indexOfFirst[LocalVariableDescriptor]

'index' @ [92:44] ==> val index: Int defined in org.jetbrains.kotlin.utils.indexOfFirst[LocalVariableDescriptor]

'-' @ [94:12] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

