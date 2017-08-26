'if (isEmpty()) 0 else fold(1) { acc, e -> acc * e.size }' @ [5:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isEmpty' @ [5:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'fold' @ [5:60] ==> public inline fun <T, R> Iterable<List<*>>.fold(initial: Int, operation: (Int, List<*>) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<*>
    <R> -> Int

'acc' @ [5:80] ==> value-parameter acc: Int defined in org.jetbrains.idl2k.util.mutationsCount.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [5:86] ==> value-parameter e: List<*> defined in org.jetbrains.idl2k.util.mutationsCount.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [5:88] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'IntArray' @ [8:19] ==> public constructor IntArray(size: Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'size' @ [8:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'map' @ [9:17] ==> public inline fun <T, R> Iterable<List<T>>.map(transform: (List<T>) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<T>
    <R> -> Int

'it' @ [9:23] ==> value-parameter it: List<T> defined in org.jetbrains.idl2k.util.mutations.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [9:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'size' @ [14:21] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'indices' @ [15:25] ==> val indices: IntArray defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'pos' @ [15:33] ==> val pos: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'sizes' @ [16:24] ==> val sizes: List<Int> defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'pos' @ [16:30] ==> val pos: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'index' @ [18:13] ==> var index: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'carry' @ [18:22] ==> var carry: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'carry' @ [19:13] ==> var carry: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'index' @ [19:22] ==> var index: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'size' @ [19:30] ==> val size: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'coerceAtLeast' @ [19:40] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'if (index >= size) {
                indices[pos] = index - size
            } else {
                indices[pos] = index
                return true
            }' @ [21:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'index' @ [21:17] ==> var index: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'size' @ [21:26] ==> val size: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'indices' @ [22:17] ==> val indices: IntArray defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'pos' @ [22:25] ==> val pos: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'index' @ [22:32] ==> var index: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'size' @ [22:40] ==> val size: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'indices' @ [24:17] ==> val indices: IntArray defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'pos' @ [24:25] ==> val pos: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'index' @ [24:32] ==> var index: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'carry' @ [29:16] ==> var carry: Int defined in org.jetbrains.idl2k.util.mutations.next[LocalVariableDescriptor]

'mutationsCount' @ [32:17] ==> public fun List<List<*>>.mutationsCount(): Int defined in org.jetbrains.idl2k.util[SimpleFunctionDescriptorImpl]

'count' @ [33:9] ==> val count: Int defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'emptyList' @ [34:16] ==> public fun <T> emptyList(): List<List<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<T>

'ArrayList' @ [37:18] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> List<T>

'count' @ [37:37] ==> val count: Int defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'result' @ [39:9] ==> val result: ArrayList<List<T>> defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'add' @ [39:16] ==> public open fun add(element: List<T>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'indices' @ [39:20] ==> val indices: IntArray defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'mapIndexed' @ [39:28] ==> public inline fun <R> IntArray.mapIndexed(transform: (index: Int, Int) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> T

'this' @ [39:55] ==> <this> defined in org.jetbrains.idl2k.util.mutations[ReceiverParameterDescriptorImpl]

'pos' @ [39:60] ==> value-parameter pos: Int defined in org.jetbrains.idl2k.util.mutations.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [39:65] ==> value-parameter index: Int defined in org.jetbrains.idl2k.util.mutations.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [40:14] ==> local final fun next(): Boolean defined in org.jetbrains.idl2k.util.mutations[SimpleFunctionDescriptorImpl]

'result' @ [42:12] ==> val result: ArrayList<List<T>> defined in org.jetbrains.idl2k.util.mutations[LocalVariableDescriptor]

'if (entry.isEmpty()) "EMPTY" else entry.toUpperCase().replace("-", "_")' @ [45:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'entry' @ [45:42] ==> value-parameter entry: String defined in org.jetbrains.idl2k.util.mapEnumConstant[ValueParameterDescriptorImpl]

'isEmpty' @ [45:48] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'entry' @ [45:72] ==> value-parameter entry: String defined in org.jetbrains.idl2k.util.mapEnumConstant[ValueParameterDescriptorImpl]

'toUpperCase' @ [45:78] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [45:92] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

