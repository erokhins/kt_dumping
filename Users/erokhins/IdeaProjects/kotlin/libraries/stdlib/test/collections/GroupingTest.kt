'Test' @ [8:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'grouping' @ [11:28] ==> value-parameter grouping: Grouping<T, K> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[ValueParameterDescriptorImpl]

'sourceIterator' @ [11:37] ==> public abstract fun sourceIterator(): Iterator<T> defined in kotlin.collections.Grouping[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [11:54] ==> public fun <T> Iterator<T>.asSequence(): Sequence<T> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'toList' @ [11:67] ==> public fun <T> Sequence<T>.toList(): List<T> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'elements' @ [12:24] ==> val elements: List<T> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[LocalVariableDescriptor]

'map' @ [12:33] ==> public inline fun <T, R> Iterable<T>.map(transform: (T) -> K): List<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> K

'grouping' @ [12:39] ==> value-parameter grouping: Grouping<T, K> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[ValueParameterDescriptorImpl]

'keyOf' @ [12:48] ==> public abstract fun keyOf(element: T): K defined in kotlin.collections.Grouping[DeserializedSimpleFunctionDescriptor]

'it' @ [12:54] ==> value-parameter it: T defined in test.collections.GroupingTest.groupingProducers.verifyGrouping.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [14:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<T>, actual: List<T>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<T>

'expectedElements' @ [14:26] ==> value-parameter expectedElements: List<T> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[ValueParameterDescriptorImpl]

'elements' @ [14:44] ==> val elements: List<T> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[LocalVariableDescriptor]

'assertEquals' @ [15:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<K>, actual: List<K>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<K>

'expectedKeys' @ [15:26] ==> value-parameter expectedKeys: List<K> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[ValueParameterDescriptorImpl]

'keys' @ [15:40] ==> val keys: List<K> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[LocalVariableDescriptor]

'listOf' @ [18:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [19:46] ==> value-parameter it: String defined in test.collections.GroupingTest.groupingProducers.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [19:49] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'elements' @ [20:20] ==> val elements: List<String> defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'map' @ [20:29] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'keySelector' @ [20:33] ==> val keySelector: (String) -> Int defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'verifyGrouping' @ [22:63] ==> local final fun <T, K> verifyGrouping(grouping: Grouping<String, Int>, expectedElements: List<String>, expectedKeys: List<Int>): Unit defined in test.collections.GroupingTest.groupingProducers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <K> -> Int

'grouping' @ [22:78] ==> value-parameter grouping: Grouping<String, Int> defined in test.collections.GroupingTest.groupingProducers.verifyGrouping[ValueParameterDescriptorImpl]

'elements' @ [22:88] ==> val elements: List<String> defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'keys' @ [22:98] ==> val keys: List<Int> defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'verifyGrouping' @ [24:9] ==> local final fun verifyGrouping(grouping: Grouping<String, Int>): Unit defined in test.collections.GroupingTest.groupingProducers[SimpleFunctionDescriptorImpl]

'elements' @ [24:24] ==> val elements: List<String> defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'groupingBy' @ [24:33] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Int): Grouping<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int

'it' @ [24:46] ==> value-parameter it: String defined in test.collections.GroupingTest.groupingProducers.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [24:49] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'verifyGrouping' @ [25:9] ==> local final fun verifyGrouping(grouping: Grouping<String, Int>): Unit defined in test.collections.GroupingTest.groupingProducers[SimpleFunctionDescriptorImpl]

'elements' @ [25:24] ==> val elements: List<String> defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'toTypedArray' @ [25:33] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'groupingBy' @ [25:48] ==> @SinceKotlin public inline fun <T, K> Array<out String>.groupingBy(crossinline keySelector: (String) -> Int): Grouping<String, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int

'keySelector' @ [25:59] ==> val keySelector: (String) -> Int defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'verifyGrouping' @ [26:9] ==> local final fun verifyGrouping(grouping: Grouping<String, Int>): Unit defined in test.collections.GroupingTest.groupingProducers[SimpleFunctionDescriptorImpl]

'elements' @ [26:24] ==> val elements: List<String> defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'asSequence' @ [26:33] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'groupingBy' @ [26:46] ==> @SinceKotlin public inline fun <T, K> Sequence<String>.groupingBy(crossinline keySelector: (String) -> Int): Grouping<String, Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Int

'keySelector' @ [26:57] ==> val keySelector: (String) -> Int defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'verifyGrouping' @ [29:9] ==> local final fun <T, K> verifyGrouping(grouping: Grouping<Char, Int>, expectedElements: List<Char>, expectedKeys: List<Int>): Unit defined in test.collections.GroupingTest.groupingProducers[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Char
    <K> -> Int

'charSeq' @ [29:24] ==> val charSeq: String defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'groupingBy' @ [29:32] ==> @SinceKotlin public inline fun <K> CharSequence.groupingBy(crossinline keySelector: (Char) -> Int): Grouping<Char, Int> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int

'it' @ [29:45] ==> value-parameter it: Char defined in test.collections.GroupingTest.groupingProducers.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [29:48] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'charSeq' @ [29:59] ==> val charSeq: String defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'toList' @ [29:67] ==> public fun CharSequence.toList(): List<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charSeq' @ [29:77] ==> val charSeq: String defined in test.collections.GroupingTest.groupingProducers[LocalVariableDescriptor]

'map' @ [29:85] ==> public inline fun <R> CharSequence.map(transform: (Char) -> Int): List<Int> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'it' @ [29:91] ==> value-parameter it: Char defined in test.collections.GroupingTest.groupingProducers.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [29:94] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'Test' @ [35:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [36:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'elements' @ [38:22] ==> val elements: List<String> defined in test.collections.GroupingTest.foldWithConstantInitialValue[LocalVariableDescriptor]

'groupingBy' @ [38:31] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [38:44] ==> value-parameter it: String defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [38:47] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fold' @ [38:57] ==> @SinceKotlin public inline fun <T, K, R> Grouping<String, Char>.fold(initialValue: List<String>, operation: (List<String>, String) -> List<String>): Map<Char, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char
    <R> -> List<String>

'listOf' @ [38:62] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (e.length % 2 == 0) acc + e else acc' @ [38:92] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'e' @ [38:96] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [38:98] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'acc' @ [38:115] ==> value-parameter acc: List<String> defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [38:121] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [38:128] ==> value-parameter acc: List<String> defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [40:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Char, List<String>>, actual: Map<Char, List<String>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Char, List<String>>

'mapOf' @ [40:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<Char, List<String>>): Map<Char, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Char
    <V> -> List<String>

'to' @ [40:28] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'listOf' @ [40:35] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [40:51] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'emptyList' @ [40:58] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [40:71] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'emptyList' @ [40:78] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [40:92] ==> val result: Map<Char, List<String>> defined in test.collections.GroupingTest.foldWithConstantInitialValue[LocalVariableDescriptor]

'listOf' @ [42:28] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'moreElements' @ [43:23] ==> val moreElements: List<String> defined in test.collections.GroupingTest.foldWithConstantInitialValue[LocalVariableDescriptor]

'groupingBy' @ [43:36] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [43:49] ==> value-parameter it: String defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [43:52] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'foldTo' @ [43:62] ==> @SinceKotlin public inline fun <T, K, R, M : MutableMap<in Char, List<String>>> Grouping<String, Char>.foldTo(destination: HashMap<Char, List<String>> /* = HashMap<Char, List<String>> */, initialValue: List<String>, operation: (List<String>, String) -> List<String>): HashMap<Char, List<String>> /* = HashMap<Char, List<String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char
    <R> -> List<String>
    <M : MutableMap<in K, R>> -> HashMap<Char, List<String>>

'HashMap' @ [43:69] ==> public final fun <K, V> <init>(p0: (MutableMap<out (Char..Char?), out (List<String>..List<String>?)>..Map<out (Char..Char?), (List<String>..List<String>?)>?)): HashMap<Char, List<String>> /* = HashMap<Char, List<String>> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Char
    <V> -> List<String>

'result' @ [43:77] ==> val result: Map<Char, List<String>> defined in test.collections.GroupingTest.foldWithConstantInitialValue[LocalVariableDescriptor]

'listOf' @ [43:86] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (e.length % 2 == 0) acc + e else acc' @ [43:108] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'e' @ [43:112] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [43:114] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'acc' @ [43:131] ==> value-parameter acc: List<String> defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [43:137] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [43:144] ==> value-parameter acc: List<String> defined in test.collections.GroupingTest.foldWithConstantInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [45:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Char, List<String>>, actual: Map<Char, List<String>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Char, List<String>>

'mapOf' @ [45:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<Char, List<String>>): Map<Char, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Char
    <V> -> List<String>

'to' @ [45:28] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'listOf' @ [45:35] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [45:59] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'emptyList' @ [45:66] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [45:79] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'listOf' @ [45:86] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [45:102] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'listOf' @ [45:109] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result2' @ [45:130] ==> val result2: HashMap<Char, List<String>> /* = HashMap<Char, List<String>> */ defined in test.collections.GroupingTest.foldWithConstantInitialValue[LocalVariableDescriptor]

'mutableListOf' @ [48:77] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<V> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> V

'Test' @ [50:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'apply' @ [52:68] ==> @InlineOnly public inline fun <T> GroupingTest.Collector<K, String>.apply(block: GroupingTest.Collector<K, String>.() -> Unit): GroupingTest.Collector<K, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collector<K, String>

'e' @ [52:80] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithComputedInitialValue.accumulateIfEven[ValueParameterDescriptorImpl]

'length' @ [52:82] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'values' @ [52:99] ==> public final val values: MutableList<String> defined in test.collections.GroupingTest.Collector[PropertyDescriptorImpl]

'add' @ [52:106] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'e' @ [52:110] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithComputedInitialValue.accumulateIfEven[ValueParameterDescriptorImpl]

'key' @ [53:47] ==> public final val key: K defined in test.collections.GroupingTest.Collector[PropertyDescriptorImpl]

'values' @ [53:54] ==> public final val values: MutableList<V> defined in test.collections.GroupingTest.Collector[PropertyDescriptorImpl]

'listOf' @ [55:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'elements' @ [56:22] ==> val elements: List<String> defined in test.collections.GroupingTest.foldWithComputedInitialValue[LocalVariableDescriptor]

'groupingBy' @ [56:31] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [56:44] ==> value-parameter it: String defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [56:47] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fold' @ [57:18] ==> @SinceKotlin public inline fun <T, K, R> Grouping<String, Char>.fold(initialValueSelector: (Char, String) -> GroupingTest.Collector<Char, String>, operation: (Char, GroupingTest.Collector<Char, String>, String) -> GroupingTest.Collector<Char, String>): Map<Char, GroupingTest.Collector<Char, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char
    <R> -> Collector<Char, String>

'Collector' @ [57:33] ==> public constructor Collector<out K, V>(key: Char, values: MutableList<String> = ...) defined in test.collections.GroupingTest.Collector[ClassConstructorDescriptorImpl]
Inferred types:
    <out K> -> Char
    <V> -> String

'k' @ [57:57] ==> value-parameter k: Char defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [57:77] ==> value-parameter acc: GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'accumulateIfEven' @ [57:81] ==> local final fun <K> GroupingTest.Collector<Char, String>.accumulateIfEven(e: String): GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Char

'e' @ [57:98] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [59:23] ==> val result: Map<Char, GroupingTest.Collector<Char, String>> defined in test.collections.GroupingTest.foldWithComputedInitialValue[LocalVariableDescriptor]

'values' @ [59:30] ==> public abstract val values: Collection<GroupingTest.Collector<Char, String>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sortedBy' @ [59:37] ==> public inline fun <T, R : Comparable<Char>> Iterable<GroupingTest.Collector<Char, String>>.sortedBy(crossinline selector: (GroupingTest.Collector<Char, String>) -> Char?): List<GroupingTest.Collector<Char, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collector<Char, String>
    <R : Comparable<R>> -> Char

'it' @ [59:48] ==> value-parameter it: GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [59:51] ==> public final val key: Char defined in test.collections.GroupingTest.Collector[PropertyDescriptorImpl]

'map' @ [59:57] ==> public inline fun <T, R> Iterable<GroupingTest.Collector<Char, String>>.map(transform: (GroupingTest.Collector<Char, String>) -> Pair<Char, List<String>>): List<Pair<Char, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collector<Char, String>
    <R> -> Pair<Char, List<String>>

'it' @ [59:63] ==> value-parameter it: GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'toPair' @ [59:66] ==> local final fun <K, V> GroupingTest.Collector<Char, String>.toPair(): Pair<Char, List<String>> defined in test.collections.GroupingTest.foldWithComputedInitialValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Char
    <V> -> String

'assertEquals' @ [60:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<Char, List<String>>>, actual: List<Pair<Char, List<String>>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<Char, List<String>>>

'listOf' @ [60:22] ==> public fun <T> listOf(vararg elements: Pair<Char, List<String>>): List<Pair<Char, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Char, List<String>>

'to' @ [60:29] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'emptyList' @ [60:36] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [60:49] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'listOf' @ [60:56] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [60:72] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'emptyList' @ [60:79] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ordered' @ [60:93] ==> val ordered: List<Pair<Char, List<String>>> defined in test.collections.GroupingTest.foldWithComputedInitialValue[LocalVariableDescriptor]

'listOf' @ [62:28] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'moreElements' @ [63:23] ==> val moreElements: List<String> defined in test.collections.GroupingTest.foldWithComputedInitialValue[LocalVariableDescriptor]

'groupingBy' @ [63:36] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [63:49] ==> value-parameter it: String defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [63:52] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'foldTo' @ [64:18] ==> @SinceKotlin public inline fun <T, K, R, M : MutableMap<in Char, GroupingTest.Collector<Char, String>>> Grouping<String, Char>.foldTo(destination: HashMap<Char, GroupingTest.Collector<Char, String>> /* = HashMap<Char, GroupingTest.Collector<Char, String>> */, initialValueSelector: (Char, String) -> GroupingTest.Collector<Char, String>, operation: (Char, GroupingTest.Collector<Char, String>, String) -> GroupingTest.Collector<Char, String>): HashMap<Char, GroupingTest.Collector<Char, String>> /* = HashMap<Char, GroupingTest.Collector<Char, String>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char
    <R> -> Collector<Char, String>
    <M : MutableMap<in K, R>> -> HashMap<Char, Collector<Char, String>>

'HashMap' @ [64:25] ==> public final fun <K, V> <init>(p0: (MutableMap<out (Char..Char?), out (GroupingTest.Collector<Char, String>..GroupingTest.Collector<Char, String>?)>..Map<out (Char..Char?), (GroupingTest.Collector<Char, String>..GroupingTest.Collector<Char, String>?)>?)): HashMap<Char, GroupingTest.Collector<Char, String>> /* = HashMap<Char, GroupingTest.Collector<Char, String>> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Char
    <V> -> Collector<Char, String>

'result' @ [64:33] ==> val result: Map<Char, GroupingTest.Collector<Char, String>> defined in test.collections.GroupingTest.foldWithComputedInitialValue[LocalVariableDescriptor]

'error' @ [65:35] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'k' @ [65:68] ==> value-parameter k: Char defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'acc' @ [66:40] ==> value-parameter acc: GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'accumulateIfEven' @ [66:44] ==> local final fun <K> GroupingTest.Collector<Char, String>.accumulateIfEven(e: String): GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Char

'e' @ [66:61] ==> value-parameter e: String defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'result2' @ [68:24] ==> val result2: HashMap<Char, GroupingTest.Collector<Char, String>> /* = HashMap<Char, GroupingTest.Collector<Char, String>> */ defined in test.collections.GroupingTest.foldWithComputedInitialValue[LocalVariableDescriptor]

'values' @ [68:32] ==> public open val values: MutableCollection<GroupingTest.Collector<Char, String>> defined in java.util.HashMap[JavaPropertyDescriptor]

'sortedBy' @ [68:39] ==> public inline fun <T, R : Comparable<Char>> Iterable<GroupingTest.Collector<Char, String>>.sortedBy(crossinline selector: (GroupingTest.Collector<Char, String>) -> Char?): List<GroupingTest.Collector<Char, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collector<Char, String>
    <R : Comparable<R>> -> Char

'it' @ [68:50] ==> value-parameter it: GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [68:53] ==> public final val key: Char defined in test.collections.GroupingTest.Collector[PropertyDescriptorImpl]

'map' @ [68:59] ==> public inline fun <T, R> Iterable<GroupingTest.Collector<Char, String>>.map(transform: (GroupingTest.Collector<Char, String>) -> Pair<Char, List<String>>): List<Pair<Char, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collector<Char, String>
    <R> -> Pair<Char, List<String>>

'it' @ [68:65] ==> value-parameter it: GroupingTest.Collector<Char, String> defined in test.collections.GroupingTest.foldWithComputedInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'toPair' @ [68:68] ==> local final fun <K, V> GroupingTest.Collector<Char, String>.toPair(): Pair<Char, List<String>> defined in test.collections.GroupingTest.foldWithComputedInitialValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> Char
    <V> -> String

'assertEquals' @ [69:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Pair<Char, List<String>>>, actual: List<Pair<Char, List<String>>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Pair<Char, List<String>>>

'listOf' @ [69:22] ==> public fun <T> listOf(vararg elements: Pair<Char, List<String>>): List<Pair<Char, List<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Char, List<String>>

'to' @ [69:29] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'emptyList' @ [69:36] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [69:49] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'listOf' @ [69:56] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'to' @ [69:80] ==> public infix fun <A, B> Char.to(that: List<String>): Pair<Char, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> List<String>

'listOf' @ [69:87] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ordered2' @ [69:104] ==> val ordered2: List<Pair<Char, List<String>>> defined in test.collections.GroupingTest.foldWithComputedInitialValue[LocalVariableDescriptor]

'if (keySelector(a) >= keySelector(b)) a else b' @ [72:84] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'invoke' @ [72:88] ==> public abstract operator fun invoke(p1: T): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'a' @ [72:100] ==> value-parameter a: T defined in test.collections.GroupingTest.maxOfBy[ValueParameterDescriptorImpl]

'invoke' @ [72:106] ==> public abstract operator fun invoke(p1: T): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'b' @ [72:118] ==> value-parameter b: T defined in test.collections.GroupingTest.maxOfBy[ValueParameterDescriptorImpl]

'a' @ [72:122] ==> value-parameter a: T defined in test.collections.GroupingTest.maxOfBy[ValueParameterDescriptorImpl]

'b' @ [72:129] ==> value-parameter b: T defined in test.collections.GroupingTest.maxOfBy[ValueParameterDescriptorImpl]

'Test' @ [74:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [75:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'this' @ [76:30] ==> <this> defined in test.collections.GroupingTest.reduce.isVowel[ReceiverParameterDescriptorImpl]

'count' @ [77:36] ==> public inline fun CharSequence.count(predicate: (Char) -> Boolean): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Char' @ [77:42] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'elements' @ [78:25] ==> val elements: List<String> defined in test.collections.GroupingTest.reduce[LocalVariableDescriptor]

'groupingBy' @ [78:34] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [78:47] ==> value-parameter it: String defined in test.collections.GroupingTest.reduce.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [78:50] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reduce' @ [78:60] ==> @SinceKotlin public inline fun <S, T : String, K> Grouping<String, Char>.reduce(operation: (Char, String, String) -> String): Map<Char, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> String
    <T : S> -> String
    <K> -> Char

'maxOfBy' @ [78:80] ==> public final inline fun <T, K : Comparable<Int>> maxOfBy(a: String, b: String, keySelector: (String) -> Int): String defined in test.collections.GroupingTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <K : Comparable<K>> -> Int

'a' @ [78:88] ==> value-parameter a: String defined in test.collections.GroupingTest.reduce.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [78:91] ==> value-parameter b: String defined in test.collections.GroupingTest.reduce.<anonymous>[ValueParameterDescriptorImpl]

'String' @ [78:94] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'assertEquals' @ [80:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Char, String>, actual: Map<Char, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Char, String>

'mapOf' @ [80:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<Char, String>): Map<Char, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Char
    <V> -> String

'to' @ [80:28] ==> public infix fun <A, B> Char.to(that: String): Pair<Char, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> String

'to' @ [80:42] ==> public infix fun <A, B> Char.to(that: String): Pair<Char, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> String

'to' @ [80:60] ==> public infix fun <A, B> Char.to(that: String): Pair<Char, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> String

'maxVowels' @ [80:75] ==> val maxVowels: Map<Char, String> defined in test.collections.GroupingTest.reduce[LocalVariableDescriptor]

'listOf' @ [82:25] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'elements2' @ [83:23] ==> val elements2: List<String> defined in test.collections.GroupingTest.reduce[LocalVariableDescriptor]

'groupingBy' @ [83:33] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [83:46] ==> value-parameter it: String defined in test.collections.GroupingTest.reduce.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [83:49] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reduceTo' @ [83:59] ==> @SinceKotlin public inline fun <S, T : String, K, M : MutableMap<in Char, String>> Grouping<String, Char>.reduceTo(destination: HashMap<Char, String> /* = HashMap<Char, String> */, operation: (Char, String, String) -> String): HashMap<Char, String> /* = HashMap<Char, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> String
    <T : S> -> String
    <K> -> Char
    <M : MutableMap<in K, S>> -> HashMap<Char, String>

'HashMap' @ [83:68] ==> public final fun <K, V> <init>(p0: (MutableMap<out (Char..Char?), out (String..String?)>..Map<out (Char..Char?), (String..String?)>?)): HashMap<Char, String> /* = HashMap<Char, String> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Char
    <V> -> String

'maxVowels' @ [83:76] ==> val maxVowels: Map<Char, String> defined in test.collections.GroupingTest.reduce[LocalVariableDescriptor]

'acc' @ [83:103] ==> value-parameter acc: String defined in test.collections.GroupingTest.reduce.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [83:109] ==> value-parameter e: String defined in test.collections.GroupingTest.reduce.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [85:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Char, String>, actual: Map<Char, String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Char, String>

'mapOf' @ [85:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<Char, String>): Map<Char, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Char
    <V> -> String

'to' @ [85:28] ==> public infix fun <A, B> Char.to(that: String): Pair<Char, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> String

'to' @ [85:46] ==> public infix fun <A, B> Char.to(that: String): Pair<Char, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> String

'to' @ [85:67] ==> public infix fun <A, B> Char.to(that: String): Pair<Char, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> String

'concats' @ [85:83] ==> val concats: HashMap<Char, String> /* = HashMap<Char, String> */ defined in test.collections.GroupingTest.reduce[LocalVariableDescriptor]

'Test' @ [88:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [89:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'elements' @ [90:22] ==> val elements: List<String> defined in test.collections.GroupingTest.countEach[LocalVariableDescriptor]

'groupingBy' @ [90:31] ==> @SinceKotlin public inline fun <T, K> Iterable<String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [90:44] ==> value-parameter it: String defined in test.collections.GroupingTest.countEach.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [90:47] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'eachCount' @ [90:57] ==> @SinceKotlin public fun <T, K> Grouping<String, Char>.eachCount(): Map<Char, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'assertEquals' @ [92:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Char, Int>, actual: Map<Char, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Char, Int>

'mapOf' @ [92:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<Char, Int>): Map<Char, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Char
    <V> -> Int

'to' @ [92:28] ==> public infix fun <A, B> Char.to(that: Int): Pair<Char, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> Int

'to' @ [92:38] ==> public infix fun <A, B> Char.to(that: Int): Pair<Char, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> Int

'to' @ [92:48] ==> public infix fun <A, B> Char.to(that: Int): Pair<Char, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> Int

'counts' @ [92:59] ==> val counts: Map<Char, Int> defined in test.collections.GroupingTest.countEach[LocalVariableDescriptor]

'arrayOf' @ [94:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'elements2' @ [95:23] ==> val elements2: Array<String> defined in test.collections.GroupingTest.countEach[LocalVariableDescriptor]

'groupingBy' @ [95:33] ==> @SinceKotlin public inline fun <T, K> Array<out String>.groupingBy(crossinline keySelector: (String) -> Char): Grouping<String, Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char

'it' @ [95:46] ==> value-parameter it: String defined in test.collections.GroupingTest.countEach.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [95:49] ==> public fun CharSequence.last(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'eachCountTo' @ [95:58] ==> @SinceKotlin public fun <T, K, M : MutableMap<in Char, Int>> Grouping<String, Char>.eachCountTo(destination: HashMap<Char, Int> /* = HashMap<Char, Int> */): HashMap<Char, Int> /* = HashMap<Char, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <K> -> Char
    <M : MutableMap<in K, Int>> -> HashMap<Char, Int>

'HashMap' @ [95:70] ==> public final fun <K, V> <init>(p0: (MutableMap<out (Char..Char?), out (Int..Int?)>..Map<out (Char..Char?), (Int..Int?)>?)): HashMap<Char, Int> /* = HashMap<Char, Int> */ defined in kotlin.collections.HashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Char
    <V> -> Int

'counts' @ [95:78] ==> val counts: Map<Char, Int> defined in test.collections.GroupingTest.countEach[LocalVariableDescriptor]

'assertEquals' @ [97:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Map<Char, Int>, actual: Map<Char, Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Map<Char, Int>

'mapOf' @ [97:22] ==> public fun <K, V> mapOf(vararg pairs: Pair<Char, Int>): Map<Char, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Char
    <V> -> Int

'to' @ [97:28] ==> public infix fun <A, B> Char.to(that: Int): Pair<Char, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> Int

'to' @ [97:38] ==> public infix fun <A, B> Char.to(that: Int): Pair<Char, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> Int

'to' @ [97:48] ==> public infix fun <A, B> Char.to(that: Int): Pair<Char, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> Int

'to' @ [97:58] ==> public infix fun <A, B> Char.to(that: Int): Pair<Char, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Char
    <B> -> Int

'counts2' @ [97:69] ==> val counts2: HashMap<Char, Int> /* = HashMap<Char, Int> */ defined in test.collections.GroupingTest.countEach[LocalVariableDescriptor]

