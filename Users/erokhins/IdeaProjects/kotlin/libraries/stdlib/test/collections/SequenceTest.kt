'generateSequence' @ [10:12] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Pair<Int, Int>?, nextFunction: (Pair<Int, Int>) -> Pair<Int, Int>?): Sequence<Pair<Int, Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Pair<Int, Int>

'Pair' @ [10:29] ==> public constructor Pair<out A, out B>(first: Int, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> Int

'Pair' @ [10:65] ==> public constructor Pair<out A, out B>(first: Int, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> Int

'it' @ [10:70] ==> value-parameter it: Pair<Int, Int> defined in test.collections.fibonacci.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [10:73] ==> public final val second: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [10:81] ==> value-parameter it: Pair<Int, Int> defined in test.collections.fibonacci.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [10:84] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [10:92] ==> value-parameter it: Pair<Int, Int> defined in test.collections.fibonacci.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [10:95] ==> public final val second: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'map' @ [10:106] ==> public fun <T, R> Sequence<Pair<Int, Int>>.map(transform: (Pair<Int, Int>) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Int>
    <R> -> Int

'it' @ [10:112] ==> value-parameter it: Pair<Int, Int> defined in test.collections.fibonacci.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [10:115] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Test' @ [15:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [16:26] ==> public fun <T> listOf(vararg elements: Sequence<String>): List<Sequence<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence<String>

'emptySequence' @ [16:33] ==> public fun <T> emptySequence(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sequenceOf' @ [16:58] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [17:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'sequence' @ [17:29] ==> val sequence: Sequence<String> defined in test.collections.SequenceTest.filterEmptySequence[LocalVariableDescriptor]

'filter' @ [17:38] ==> public fun <T> Sequence<String>.filter(predicate: (String) -> Boolean): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'count' @ [17:55] ==> public fun <T> Sequence<String>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [18:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'sequence' @ [18:29] ==> val sequence: Sequence<String> defined in test.collections.SequenceTest.filterEmptySequence[LocalVariableDescriptor]

'filter' @ [18:38] ==> public fun <T> Sequence<String>.filter(predicate: (String) -> Boolean): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'count' @ [18:54] ==> public fun <T> Sequence<String>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [22:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [23:26] ==> public fun <T> listOf(vararg elements: Sequence<String>): List<Sequence<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence<String>

'emptySequence' @ [23:33] ==> public fun <T> emptySequence(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sequenceOf' @ [23:58] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [24:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'sequence' @ [24:29] ==> val sequence: Sequence<String> defined in test.collections.SequenceTest.mapEmptySequence[LocalVariableDescriptor]

'map' @ [24:38] ==> public fun <T, R> Sequence<String>.map(transform: (String) -> Boolean): Sequence<Boolean> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'count' @ [24:51] ==> public fun <T> Sequence<Boolean>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'Test' @ [28:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [29:24] ==> public fun <T> sequenceOf(vararg elements: String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'sequence' @ [30:23] ==> val sequence: Sequence<String?> defined in test.collections.SequenceTest.requireNoNulls[LocalVariableDescriptor]

'requireNoNulls' @ [30:32] ==> public fun <T : Any> Sequence<String?>.requireNoNulls(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'assertEquals' @ [31:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [31:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'notNull' @ [31:44] ==> val notNull: Sequence<String> defined in test.collections.SequenceTest.requireNoNulls[LocalVariableDescriptor]

'toList' @ [31:52] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sequenceOf' @ [33:33] ==> public fun <T> sequenceOf(vararg elements: String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'sequenceWithNulls' @ [34:24] ==> val sequenceWithNulls: Sequence<String?> defined in test.collections.SequenceTest.requireNoNulls[LocalVariableDescriptor]

'requireNoNulls' @ [34:42] ==> public fun <T : Any> Sequence<String?>.requireNoNulls(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'assertFails' @ [35:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'notNull2' @ [37:13] ==> val notNull2: Sequence<String> defined in test.collections.SequenceTest.requireNoNulls[LocalVariableDescriptor]

'toList' @ [37:22] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [41:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [42:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [42:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [42:47] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'filterIndexed' @ [42:59] ==> public fun <T> Sequence<Int>.filterIndexed(predicate: (index: Int, Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'index' @ [42:87] ==> value-parameter index: Int defined in test.collections.SequenceTest.filterIndexed.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [42:104] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [42:112] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [45:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [46:20] ==> public fun <T> sequenceOf(vararg elements: String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'data' @ [47:24] ==> val data: Sequence<String?> defined in test.collections.SequenceTest.filterNullable[LocalVariableDescriptor]

'filter' @ [47:29] ==> public fun <T> Sequence<String?>.filter(predicate: (String?) -> Boolean): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'it' @ [47:38] ==> value-parameter it: String? defined in test.collections.SequenceTest.filterNullable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [47:52] ==> value-parameter it: String? defined in test.collections.SequenceTest.filterNullable.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [48:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String?>, actual: List<String?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String?>

'listOf' @ [48:22] ==> public fun <T> listOf(vararg elements: String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'filtered' @ [48:49] ==> val filtered: Sequence<String?> defined in test.collections.SequenceTest.filterNullable[LocalVariableDescriptor]

'toList' @ [48:58] ==> public fun <T> Sequence<String?>.toList(): List<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'Test' @ [51:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [52:20] ==> public fun <T> sequenceOf(vararg elements: String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'data' @ [53:24] ==> val data: Sequence<String?> defined in test.collections.SequenceTest.filterNot[LocalVariableDescriptor]

'filterNot' @ [53:29] ==> public fun <T> Sequence<String?>.filterNot(predicate: (String?) -> Boolean): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'it' @ [53:41] ==> value-parameter it: String? defined in test.collections.SequenceTest.filterNot.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [54:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String?>, actual: List<String?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String?>

'listOf' @ [54:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'filtered' @ [54:44] ==> val filtered: Sequence<String?> defined in test.collections.SequenceTest.filterNot[LocalVariableDescriptor]

'toList' @ [54:53] ==> public fun <T> Sequence<String?>.toList(): List<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'Test' @ [57:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [58:20] ==> public fun <T> sequenceOf(vararg elements: String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'data' @ [59:24] ==> val data: Sequence<String?> defined in test.collections.SequenceTest.filterNotNull[LocalVariableDescriptor]

'filterNotNull' @ [59:29] ==> public fun <T : Any> Sequence<String?>.filterNotNull(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'assertEquals' @ [60:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [60:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'filtered' @ [60:44] ==> val filtered: Sequence<String> defined in test.collections.SequenceTest.filterNotNull[LocalVariableDescriptor]

'toList' @ [60:53] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [63:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [64:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [64:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [64:46] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'mapIndexed' @ [64:58] ==> public fun <T, R> Sequence<Int>.mapIndexed(transform: (index: Int, Int) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'index' @ [64:87] ==> value-parameter index: Int defined in test.collections.SequenceTest.mapIndexed.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [64:95] ==> value-parameter value: Int defined in test.collections.SequenceTest.mapIndexed.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [64:103] ==> public fun <T> Sequence<Int>.takeWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'i' @ [64:125] ==> value-parameter i: Int defined in test.collections.SequenceTest.mapIndexed.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [64:134] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [67:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [68:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [68:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [68:48] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'mapNotNull' @ [68:60] ==> public fun <T, R : Any> Sequence<Int>.mapNotNull(transform: (Int) -> Int?): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Any> -> Int

'if (it % 5 == 0) it * 2 else null' @ [68:73] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'it' @ [68:77] ==> value-parameter it: Int defined in test.collections.SequenceTest.mapNotNull.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [68:90] ==> value-parameter it: Int defined in test.collections.SequenceTest.mapNotNull.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [68:109] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [68:117] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [71:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [73:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [73:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fibonacci' @ [74:17] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'mapIndexedNotNull' @ [74:29] ==> public fun <T, R : Any> Sequence<Int>.mapIndexedNotNull(transform: (index: Int, Int) -> String?): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R : Any> -> String

'if (index > 0 && (value % index) == 0) "$value/$index" else null' @ [75:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'index' @ [75:25] ==> value-parameter index: Int defined in test.collections.SequenceTest.mapIndexedNotNull.<anonymous>[ValueParameterDescriptorImpl]

'==' @ [75:38] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'value' @ [75:39] ==> value-parameter value: Int defined in test.collections.SequenceTest.mapIndexedNotNull.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [75:47] ==> value-parameter index: Int defined in test.collections.SequenceTest.mapIndexedNotNull.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [75:62] ==> value-parameter value: Int defined in test.collections.SequenceTest.mapIndexedNotNull.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [75:69] ==> value-parameter index: Int defined in test.collections.SequenceTest.mapIndexedNotNull.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [76:19] ==> public fun <T> Sequence<String>.take(n: Int): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'toList' @ [76:27] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [80:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [81:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [81:33] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'withIndex' @ [81:45] ==> public fun <T> Sequence<Int>.withIndex(): Sequence<IndexedValue<Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'filter' @ [81:57] ==> public fun <T> Sequence<IndexedValue<Int>>.filter(predicate: (IndexedValue<Int>) -> Boolean): Sequence<IndexedValue<Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<Int>

'it' @ [81:66] ==> value-parameter it: IndexedValue<Int> defined in test.collections.SequenceTest.mapAndJoinToString.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [81:69] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'take' @ [81:81] ==> public fun <T> Sequence<IndexedValue<Int>>.take(n: Int): Sequence<IndexedValue<Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<Int>

'joinToString' @ [81:89] ==> public fun <T> Sequence<IndexedValue<Int>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((IndexedValue<Int>) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<Int>

'it' @ [81:104] ==> value-parameter it: IndexedValue<Int> defined in test.collections.SequenceTest.mapAndJoinToString.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [81:107] ==> public final val value: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'toString' @ [81:113] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [84:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [85:20] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [86:23] ==> val data: Sequence<String> defined in test.collections.SequenceTest.withIndex[LocalVariableDescriptor]

'withIndex' @ [86:28] ==> public fun <T> Sequence<String>.withIndex(): Sequence<IndexedValue<String>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [86:40] ==> public fun <T, R> Sequence<IndexedValue<String>>.map(transform: (IndexedValue<String>) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<String>
    <R> -> String

'it' @ [86:46] ==> value-parameter it: IndexedValue<String> defined in test.collections.SequenceTest.withIndex.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [86:49] ==> public final val value: String defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'substring' @ [86:55] ==> public fun String.substring(range: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [86:65] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [86:68] ==> value-parameter it: IndexedValue<String> defined in test.collections.SequenceTest.withIndex.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [86:71] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'toList' @ [86:80] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [87:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [87:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'indexed' @ [87:41] ==> val indexed: List<String> defined in test.collections.SequenceTest.withIndex[LocalVariableDescriptor]

'Test' @ [90:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [93:20] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [94:23] ==> val data: Sequence<String> defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'onEach' @ [94:28] ==> @SinceKotlin public fun <T> Sequence<String>.onEach(action: (String) -> Unit): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'count' @ [94:37] ==> var count: Int defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'it' @ [94:46] ==> value-parameter it: String defined in test.collections.SequenceTest.onEach.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [94:49] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertFalse' @ [95:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'data' @ [95:21] ==> val data: Sequence<String> defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'newData' @ [95:30] ==> val newData: Sequence<String> defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'assertEquals' @ [96:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'count' @ [96:25] ==> var count: Int defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'data' @ [98:9] ==> val data: Sequence<String> defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'forEach' @ [98:14] ==> public inline fun <T> Sequence<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [99:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'count' @ [99:25] ==> var count: Int defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'newData' @ [101:19] ==> val newData: Sequence<String> defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'sumBy' @ [101:27] ==> public inline fun <T> Sequence<String>.sumBy(selector: (String) -> Int): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [101:35] ==> value-parameter it: String defined in test.collections.SequenceTest.onEach.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [101:38] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'assertEquals' @ [102:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'sum' @ [102:22] ==> val sum: Int defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'count' @ [102:27] ==> var count: Int defined in test.collections.SequenceTest.onEach[LocalVariableDescriptor]

'Test' @ [106:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [107:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [107:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [107:55] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'filter' @ [107:67] ==> public fun <T> Sequence<Int>.filter(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [107:76] ==> value-parameter it: Int defined in test.collections.SequenceTest.filterAndTakeWhileExtractTheElementsWithinRange.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [107:87] ==> public fun <T> Sequence<Int>.takeWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [107:99] ==> value-parameter it: Int defined in test.collections.SequenceTest.filterAndTakeWhileExtractTheElementsWithinRange.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [107:111] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [110:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'a' @ [111:39] ==> value-parameter a: Int defined in test.collections.SequenceTest.foldReducesTheFirstNElements.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [111:43] ==> value-parameter b: Int defined in test.collections.SequenceTest.foldReducesTheFirstNElements.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [112:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'listOf' @ [112:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fold' @ [112:49] ==> public inline fun <T, R> Iterable<Int>.fold(initial: Int, operation: (Int, Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'sum' @ [112:57] ==> val sum: (Int, Int) -> Int defined in test.collections.SequenceTest.foldReducesTheFirstNElements[LocalVariableDescriptor]

'fibonacci' @ [112:63] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'filter' @ [112:75] ==> public fun <T> Sequence<Int>.filter(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [112:84] ==> value-parameter it: Int defined in test.collections.SequenceTest.foldReducesTheFirstNElements.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [112:94] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fold' @ [112:102] ==> public inline fun <T, R> Sequence<Int>.fold(initial: Int, operation: (Int, Int) -> Int): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'sum' @ [112:110] ==> val sum: (Int, Int) -> Int defined in test.collections.SequenceTest.foldReducesTheFirstNElements[LocalVariableDescriptor]

'Test' @ [115:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [116:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [116:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [116:63] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [116:75] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [116:84] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [119:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [120:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [120:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [120:49] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'map' @ [120:61] ==> public fun <T, R> Sequence<Int>.map(transform: (Int) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'it' @ [120:67] ==> value-parameter it: Int defined in test.collections.SequenceTest.mapAndTakeWhileExtractTheTransformedElements.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [120:76] ==> public fun <T> Sequence<Int>.takeWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'i' @ [120:98] ==> value-parameter i: Int defined in test.collections.SequenceTest.mapAndTakeWhileExtractTheTransformedElements.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [120:107] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [123:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [124:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [124:49] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'filter' @ [124:61] ==> public fun <T> Sequence<Int>.filter(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [124:70] ==> value-parameter it: Int defined in test.collections.SequenceTest.joinConcatenatesTheFirstNElementsAboveAThreshold.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [124:80] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [127:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [128:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'emptyList' @ [128:22] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'emptySequence' @ [128:35] ==> public fun <T> emptySequence(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'drop' @ [128:56] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [128:64] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'listOf' @ [129:9] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'let' @ [129:28] ==> @InlineOnly public inline fun <T, R> List<Int>.let(block: (List<Int>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Int>
    <R> -> Unit

'assertEquals' @ [129:34] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'it' @ [129:47] ==> value-parameter it: List<Int> defined in test.collections.SequenceTest.drop.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [129:51] ==> value-parameter it: List<Int> defined in test.collections.SequenceTest.drop.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [129:54] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'drop' @ [129:67] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [129:75] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [130:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [130:74] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'drop' @ [130:86] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'joinToString' @ [130:94] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [131:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [131:74] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'drop' @ [131:86] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'drop' @ [131:94] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'joinToString' @ [131:102] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertFailsWith' @ [132:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'fibonacci' @ [132:53] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'drop' @ [132:65] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'-' @ [132:70] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [135:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [136:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'emptyList' @ [136:22] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'emptySequence' @ [136:35] ==> public fun <T> emptySequence(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [136:56] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [136:64] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [137:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'emptyList' @ [137:22] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [137:35] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [137:47] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [137:55] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [139:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [139:45] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [139:57] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'joinToString' @ [139:65] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [140:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [140:36] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [140:48] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [140:56] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'joinToString' @ [140:64] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [141:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [141:36] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [141:48] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [141:56] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'joinToString' @ [141:64] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [143:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'emptyList' @ [143:22] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [143:35] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [143:47] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'drop' @ [143:55] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [143:63] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [144:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'emptyList' @ [144:22] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [144:35] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [144:47] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'drop' @ [144:55] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [144:63] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertFailsWith' @ [146:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'fibonacci' @ [146:53] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [146:65] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'-' @ [146:70] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Test' @ [149:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [150:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [150:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [150:42] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'drop' @ [150:54] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [150:62] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [150:70] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [151:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [151:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [151:42] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'take' @ [151:54] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'drop' @ [151:62] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [151:70] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'fibonacci' @ [153:19] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'drop' @ [153:31] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'take' @ [153:39] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [155:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [155:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'seq' @ [155:42] ==> val seq: Sequence<Int> defined in test.collections.SequenceTest.subSequence[LocalVariableDescriptor]

'take' @ [155:46] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [155:54] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [156:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [156:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'seq' @ [156:39] ==> val seq: Sequence<Int> defined in test.collections.SequenceTest.subSequence[LocalVariableDescriptor]

'take' @ [156:43] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [156:51] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [158:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'emptyList' @ [158:22] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'seq' @ [158:35] ==> val seq: Sequence<Int> defined in test.collections.SequenceTest.subSequence[LocalVariableDescriptor]

'drop' @ [158:39] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [158:47] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [159:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [159:22] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'seq' @ [159:33] ==> val seq: Sequence<Int> defined in test.collections.SequenceTest.subSequence[LocalVariableDescriptor]

'drop' @ [159:37] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [159:45] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [163:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [164:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [164:39] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'dropWhile' @ [164:51] ==> public fun <T> Sequence<Int>.dropWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [164:63] ==> value-parameter it: Int defined in test.collections.SequenceTest.dropWhile.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [164:74] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'joinToString' @ [164:82] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [165:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'sequenceOf' @ [165:26] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'dropWhile' @ [165:40] ==> public fun <T> Sequence<Int>.dropWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [165:52] ==> value-parameter it: Int defined in test.collections.SequenceTest.dropWhile.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [165:63] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [168:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'expect' @ [169:9] ==> public fun <@OnlyInputTypes T> expect(expected: List<String>, block: () -> List<String>): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [169:16] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sequenceOf' @ [170:13] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'zip' @ [170:39] ==> public fun <T, R, V> Sequence<String>.zip(other: Sequence<String>, transform: (String, String) -> String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String
    <V> -> String

'sequenceOf' @ [170:43] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'a' @ [170:80] ==> value-parameter a: String defined in test.collections.SequenceTest.zip.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [170:84] ==> value-parameter b: String defined in test.collections.SequenceTest.zip.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [170:88] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [174:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'fibonacci' @ [175:24] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'fibonacci' @ [175:40] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'map' @ [175:52] ==> public fun <T, R> Sequence<Int>.map(transform: (Int) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'i' @ [175:63] ==> value-parameter i: Int defined in test.collections.SequenceTest.zipPairs.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [175:70] ==> public fun <T> Sequence<Pair<Int, Int>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Pair<Int, Int>) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Int>

'assertEquals' @ [176:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'pairStr' @ [176:117] ==> val pairStr: String defined in test.collections.SequenceTest.zipPairs[LocalVariableDescriptor]

'Test' @ [179:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [180:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [180:62] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'joinToString' @ [180:74] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [181:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [181:74] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'filter' @ [181:86] ==> public fun <T> Sequence<Int>.filter(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [181:95] ==> value-parameter it: Int defined in test.collections.SequenceTest.toStringJoinsNoMoreThanTheFirstTenElements.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [181:105] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [182:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'fibonacci' @ [182:49] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'filter' @ [182:61] ==> public fun <T> Sequence<Int>.filter(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [182:70] ==> value-parameter it: Int defined in test.collections.SequenceTest.toStringJoinsNoMoreThanTheFirstTenElements.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [182:81] ==> public fun <T> Sequence<Int>.takeWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [182:93] ==> value-parameter it: Int defined in test.collections.SequenceTest.toStringJoinsNoMoreThanTheFirstTenElements.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [182:105] ==> public fun <T> Sequence<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequenceOf' @ [187:19] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [188:38] ==> public abstract operator fun invoke(p1: Sequence<String>): Sequence<String> defined in kotlin.Function1[FunctionInvokeDescriptor]

'seq' @ [188:45] ==> val seq: Sequence<String> defined in test.collections.SequenceTest.testPlus[LocalVariableDescriptor]

'assertEquals' @ [189:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [189:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'seq' @ [189:44] ==> val seq: Sequence<String> defined in test.collections.SequenceTest.testPlus[LocalVariableDescriptor]

'toList' @ [189:48] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [190:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [190:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'seq2' @ [190:62] ==> val seq2: Sequence<String> defined in test.collections.SequenceTest.testPlus[LocalVariableDescriptor]

'toList' @ [190:67] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [194:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [194:31] ==> public final fun testPlus(doPlus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'it' @ [194:42] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.plusElement.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [195:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [195:34] ==> public final fun testPlus(doPlus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'it' @ [195:45] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.plusCollection.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [195:50] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [196:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [196:29] ==> public final fun testPlus(doPlus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'it' @ [196:40] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.plusArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [196:45] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'Test' @ [197:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testPlus' @ [197:32] ==> public final fun testPlus(doPlus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'it' @ [197:43] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.plusSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [197:48] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [199:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [201:19] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'seq' @ [202:9] ==> var seq: Sequence<String> defined in test.collections.SequenceTest.plusAssign[LocalVariableDescriptor]

'seq' @ [203:9] ==> var seq: Sequence<String> defined in test.collections.SequenceTest.plusAssign[LocalVariableDescriptor]

'listOf' @ [203:16] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'seq' @ [204:9] ==> var seq: Sequence<String> defined in test.collections.SequenceTest.plusAssign[LocalVariableDescriptor]

'arrayOf' @ [204:16] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'seq' @ [205:9] ==> var seq: Sequence<String> defined in test.collections.SequenceTest.plusAssign[LocalVariableDescriptor]

'sequenceOf' @ [205:16] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [206:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [206:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'seq' @ [206:82] ==> var seq: Sequence<String> defined in test.collections.SequenceTest.plusAssign[LocalVariableDescriptor]

'toList' @ [206:86] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sequenceOf' @ [210:17] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [211:35] ==> public abstract operator fun invoke(p1: Sequence<String>): Sequence<String> defined in kotlin.Function1[FunctionInvokeDescriptor]

'a' @ [211:43] ==> val a: Sequence<String> defined in test.collections.SequenceTest.testMinus[LocalVariableDescriptor]

'expected' @ [212:25] ==> value-parameter expected: List<String>? = ... defined in test.collections.SequenceTest.testMinus[ValueParameterDescriptorImpl]

'listOf' @ [212:37] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [213:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'expected_' @ [213:22] ==> val expected_: List<String> defined in test.collections.SequenceTest.testMinus[LocalVariableDescriptor]

'b' @ [213:33] ==> val b: Sequence<String> defined in test.collections.SequenceTest.testMinus[LocalVariableDescriptor]

'toList' @ [213:35] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [216:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [216:32] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'listOf' @ [216:53] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [216:77] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.minusElement.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [217:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [217:35] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'it' @ [217:47] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.minusCollection.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [217:52] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [218:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [218:30] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'it' @ [218:42] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.minusArray.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [218:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'Test' @ [219:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testMinus' @ [219:33] ==> private final fun testMinus(expected: List<String>? = ..., doMinus: (Sequence<String>) -> Sequence<String>): Unit defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]

'it' @ [219:45] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.minusSequence.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [219:50] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [221:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [222:19] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arrayListOf' @ [223:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'seq' @ [224:22] ==> val seq: Sequence<String> defined in test.collections.SequenceTest.minusIsLazyIterated[LocalVariableDescriptor]

'list' @ [224:28] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.SequenceTest.minusIsLazyIterated[LocalVariableDescriptor]

'list' @ [226:9] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.SequenceTest.minusIsLazyIterated[LocalVariableDescriptor]

'assertEquals' @ [227:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [227:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [227:37] ==> val result: Sequence<String> defined in test.collections.SequenceTest.minusIsLazyIterated[LocalVariableDescriptor]

'toList' @ [227:44] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [228:9] ==> val list: ArrayList<String> /* = ArrayList<String> */ defined in test.collections.SequenceTest.minusIsLazyIterated[LocalVariableDescriptor]

'assertEquals' @ [229:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [229:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'result' @ [229:43] ==> val result: Sequence<String> defined in test.collections.SequenceTest.minusIsLazyIterated[LocalVariableDescriptor]

'toList' @ [229:50] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [232:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [234:20] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'data' @ [235:17] ==> val data: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'l' @ [236:9] ==> var l: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'assertEquals' @ [237:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [237:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [237:63] ==> var l: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'toList' @ [237:65] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [238:9] ==> var l: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'data' @ [238:13] ==> val data: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'l' @ [239:9] ==> var l: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'listOf' @ [239:14] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [240:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [240:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [240:45] ==> var l: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'toList' @ [240:47] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [241:9] ==> var l: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'arrayOf' @ [241:14] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'assertEquals' @ [242:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [242:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'l' @ [242:37] ==> var l: Sequence<String> defined in test.collections.SequenceTest.minusAssign[LocalVariableDescriptor]

'toList' @ [242:39] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Test' @ [247:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [249:19] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

's' @ [250:13] ==> var s: String defined in test.collections.SequenceTest.iterationOverSequence[LocalVariableDescriptor]

'i' @ [250:18] ==> val i: Int defined in test.collections.SequenceTest.iterationOverSequence[LocalVariableDescriptor]

'toString' @ [250:20] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [252:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

's' @ [252:32] ==> var s: String defined in test.collections.SequenceTest.iterationOverSequence[LocalVariableDescriptor]

'Test' @ [255:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateSequence' @ [258:24] ==> public fun <T : Any> generateSequence(nextFunction: () -> Int?): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Int

'count' @ [259:13] ==> var count: Int defined in test.collections.SequenceTest.sequenceFromFunction[LocalVariableDescriptor]

'if (count >= 0) count else null' @ [260:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'count' @ [260:17] ==> var count: Int defined in test.collections.SequenceTest.sequenceFromFunction[LocalVariableDescriptor]

'count' @ [260:29] ==> var count: Int defined in test.collections.SequenceTest.sequenceFromFunction[LocalVariableDescriptor]

'sequence' @ [263:20] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunction[LocalVariableDescriptor]

'toList' @ [263:29] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [264:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [264:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'list' @ [264:39] ==> val list: List<Int> defined in test.collections.SequenceTest.sequenceFromFunction[LocalVariableDescriptor]

'assertFails' @ [266:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sequence' @ [267:13] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunction[LocalVariableDescriptor]

'toList' @ [267:22] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [271:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateSequence' @ [272:22] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Int?, nextFunction: (Int) -> Int?): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Int

'if (n > 0) n - 1 else null' @ [272:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'n' @ [272:53] ==> value-parameter n: Int defined in test.collections.SequenceTest.sequenceFromFunctionWithInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'n' @ [272:60] ==> value-parameter n: Int defined in test.collections.SequenceTest.sequenceFromFunctionWithInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [273:24] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [274:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [274:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithInitialValue[LocalVariableDescriptor]

'values' @ [274:32] ==> val values: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithInitialValue[LocalVariableDescriptor]

'toList' @ [274:39] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [275:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [275:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithInitialValue[LocalVariableDescriptor]

'values' @ [275:32] ==> val values: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithInitialValue[LocalVariableDescriptor]

'toList' @ [275:39] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [278:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateSequence' @ [280:22] ==> public fun <T : Any> generateSequence(seedFunction: () -> Int?, nextFunction: (Int) -> Int?): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Int

'start' @ [280:41] ==> var start: Int defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'if (n > 0) n - 1 else null' @ [280:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'n' @ [280:61] ==> value-parameter n: Int defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'n' @ [280:68] ==> value-parameter n: Int defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [281:24] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [282:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [282:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'values' @ [282:32] ==> val values: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'toList' @ [282:39] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [283:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [283:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'values' @ [283:32] ==> val values: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'toList' @ [283:39] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'start' @ [285:9] ==> var start: Int defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'assertEquals' @ [286:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [286:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'drop' @ [286:31] ==> public fun <T> Iterable<Int>.drop(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'values' @ [286:40] ==> val values: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'toList' @ [286:47] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'generateSequence' @ [289:27] ==> public fun <T : Any> generateSequence(seedFunction: () -> Int?, nextFunction: (Int) -> Int?): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Int

'IllegalStateException' @ [289:58] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'errorValues' @ [291:24] ==> val errorValues: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'iterator' @ [291:36] ==> public abstract operator fun iterator(): Iterator<Int> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [293:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'iterator' @ [293:23] ==> val iterator: Iterator<Int> defined in test.collections.SequenceTest.sequenceFromFunctionWithLazyInitialValue[LocalVariableDescriptor]

'next' @ [293:32] ==> public abstract operator fun next(): Int defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'Test' @ [297:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [298:20] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'list' @ [299:24] ==> val list: List<Int> defined in test.collections.SequenceTest.sequenceFromIterator[LocalVariableDescriptor]

'iterator' @ [299:29] ==> public abstract fun iterator(): Iterator<Int> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'iterator' @ [300:24] ==> val iterator: Iterator<Int> defined in test.collections.SequenceTest.sequenceFromIterator[LocalVariableDescriptor]

'asSequence' @ [300:33] ==> public fun <T> Iterator<Int>.asSequence(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [301:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'list' @ [301:22] ==> val list: List<Int> defined in test.collections.SequenceTest.sequenceFromIterator[LocalVariableDescriptor]

'sequence' @ [301:28] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromIterator[LocalVariableDescriptor]

'toList' @ [301:37] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertFails' @ [302:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sequence' @ [303:13] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.sequenceFromIterator[LocalVariableDescriptor]

'toList' @ [303:22] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [307:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [308:24] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequence' @ [309:9] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.makeSequenceOneTimeConstrained[LocalVariableDescriptor]

'toList' @ [309:18] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequence' @ [310:9] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.makeSequenceOneTimeConstrained[LocalVariableDescriptor]

'toList' @ [310:18] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequence' @ [312:23] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.makeSequenceOneTimeConstrained[LocalVariableDescriptor]

'constrainOnce' @ [312:32] ==> public fun <T> Sequence<Int>.constrainOnce(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'oneTime' @ [313:9] ==> val oneTime: Sequence<Int> defined in test.collections.SequenceTest.makeSequenceOneTimeConstrained[LocalVariableDescriptor]

'toList' @ [313:17] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertTrue' @ [314:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [315:13] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'oneTime' @ [316:17] ==> val oneTime: Sequence<Int> defined in test.collections.SequenceTest.makeSequenceOneTimeConstrained[LocalVariableDescriptor]

'toList' @ [316:25] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'this' @ [323:25] ==> <this> defined in test.collections.SequenceTest.takeWhileTo[ReceiverParameterDescriptorImpl]

'if (predicate(element)) result.add(element) else break' @ [323:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'invoke' @ [323:35] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [323:45] ==> val element: T defined in test.collections.SequenceTest.takeWhileTo[LocalVariableDescriptor]

'result' @ [323:55] ==> value-parameter result: C defined in test.collections.SequenceTest.takeWhileTo[ValueParameterDescriptorImpl]

'add' @ [323:62] ==> public abstract fun add(element: T): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'element' @ [323:66] ==> val element: T defined in test.collections.SequenceTest.takeWhileTo[LocalVariableDescriptor]

'result' @ [324:16] ==> value-parameter result: C defined in test.collections.SequenceTest.takeWhileTo[ValueParameterDescriptorImpl]

'Test' @ [327:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ArrayList' @ [328:17] ==> public final fun <E> <init>(): ArrayList<Int> /* = ArrayList<Int> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Int

'sequenceOf' @ [329:9] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'takeWhileTo' @ [329:38] ==> private final fun <T, C : MutableCollection<in Int>> Sequence<Int>.takeWhileTo(result: ArrayList<Int> /* = ArrayList<Int> */, predicate: (Int) -> Boolean): ArrayList<Int> /* = ArrayList<Int> */ defined in test.collections.SequenceTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int
    <C : MutableCollection<in T>> -> ArrayList<Int>

'd' @ [329:50] ==> val d: ArrayList<Int> /* = ArrayList<Int> */ defined in test.collections.SequenceTest.sequenceExtensions[LocalVariableDescriptor]

'i' @ [329:60] ==> value-parameter i: Int defined in test.collections.SequenceTest.sequenceExtensions.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [330:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'd' @ [330:25] ==> val d: ArrayList<Int> /* = ArrayList<Int> */ defined in test.collections.SequenceTest.sequenceExtensions[LocalVariableDescriptor]

'size' @ [330:27] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'Test' @ [333:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [334:24] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'assertEquals' @ [344:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'expected' @ [344:22] ==> val expected: List<Char> defined in test.collections.SequenceTest.flatMapAndTakeExtractTheTransformedElements[LocalVariableDescriptor]

'fibonacci' @ [344:32] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'drop' @ [344:44] ==> public fun <T> Sequence<Int>.drop(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'flatMap' @ [344:52] ==> public fun <T, R> Sequence<Int>.flatMap(transform: (Int) -> Sequence<Char>): Sequence<Char> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Char

'it' @ [344:62] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatMapAndTakeExtractTheTransformedElements.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [344:65] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [344:76] ==> public fun CharSequence.asSequence(): Sequence<Char> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'take' @ [344:91] ==> public fun <T> Sequence<Char>.take(n: Int): Sequence<Char> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'toList' @ [344:100] ==> public fun <T> Sequence<Char>.toList(): List<Char> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [347:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [348:22] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'flatMap' @ [348:39] ==> public fun <T, R> Sequence<Int>.flatMap(transform: (Int) -> Sequence<Int>): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'..' @ [348:50] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [348:53] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatMap.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [348:57] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [349:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [349:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'result' @ [349:45] ==> val result: Sequence<Int> defined in test.collections.SequenceTest.flatMap[LocalVariableDescriptor]

'toList' @ [349:52] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [352:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [353:22] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'flatMap' @ [353:40] ==> public fun <T, R> Sequence<Int>.flatMap(transform: (Int) -> Sequence<Int>): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'..' @ [353:51] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [353:54] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatMapOnEmpty.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [353:58] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertTrue' @ [354:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'result' @ [354:20] ==> val result: Sequence<Int> defined in test.collections.SequenceTest.flatMapOnEmpty[LocalVariableDescriptor]

'none' @ [354:27] ==> public fun <T> Sequence<Int>.none(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [357:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [358:22] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'flatMap' @ [358:42] ==> public fun <T, R> Sequence<Int>.flatMap(transform: (Int) -> Sequence<Int>): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'if (it == 2) sequenceOf<Int>() else (it - 1..it).asSequence()' @ [358:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Sequence<Int>, elseBranch: Sequence<Int>): Sequence<Int>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Sequence<Int>

'it' @ [358:56] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatMapWithEmptyItems.<anonymous>[ValueParameterDescriptorImpl]

'sequenceOf' @ [358:65] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [358:89] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatMapWithEmptyItems.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [358:97] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatMapWithEmptyItems.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [358:101] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [359:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [359:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'result' @ [359:42] ==> val result: Sequence<Int> defined in test.collections.SequenceTest.flatMapWithEmptyItems[LocalVariableDescriptor]

'toList' @ [359:49] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [362:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [363:24] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequenceOf' @ [365:19] ==> public fun <T> sequenceOf(vararg elements: Sequence<Int>): Sequence<Sequence<Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence<Int>

'..' @ [365:31] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [365:37] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'..' @ [365:52] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [365:58] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'flatten' @ [365:72] ==> public fun <T> Sequence<Sequence<Int>>.flatten(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [366:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [366:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'seq' @ [366:32] ==> val seq: Sequence<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'toList' @ [366:36] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequenceOf' @ [368:28] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'map' @ [368:45] ==> public fun <T, R> Sequence<Int>.map(transform: (Int) -> Sequence<Int>): Sequence<Sequence<Int>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Sequence<Int>

'..' @ [368:52] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [368:55] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatten.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [368:59] ==> public fun <T> Iterable<Int>.asSequence(): Sequence<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'flatten' @ [368:74] ==> public fun <T> Sequence<Sequence<Int>>.flatten(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [369:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [369:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'seqMappedSeq' @ [369:32] ==> val seqMappedSeq: Sequence<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'toList' @ [369:45] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequenceOf' @ [371:29] ==> public fun <T> sequenceOf(vararg elements: IntRange): Sequence<IntRange> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntRange

'..' @ [371:40] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'..' @ [371:46] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'flatten' @ [371:52] ==> @JvmName public fun <T> Sequence<Iterable<Int>>.flatten(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [372:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [372:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'seqOfIterable' @ [372:32] ==> val seqOfIterable: Sequence<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'toList' @ [372:46] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequenceOf' @ [374:33] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'map' @ [374:50] ==> public fun <T, R> Sequence<Int>.map(transform: (Int) -> IntRange): Sequence<IntRange> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> IntRange

'..' @ [374:56] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [374:59] ==> value-parameter it: Int defined in test.collections.SequenceTest.flatten.<anonymous>[ValueParameterDescriptorImpl]

'flatten' @ [374:64] ==> @JvmName public fun <T> Sequence<Iterable<Int>>.flatten(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [375:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'expected' @ [375:22] ==> val expected: List<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'seqMappedIterable' @ [375:32] ==> val seqMappedIterable: Sequence<Int> defined in test.collections.SequenceTest.flatten[LocalVariableDescriptor]

'toList' @ [375:50] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [378:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'fibonacci' @ [379:24] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'dropWhile' @ [379:36] ==> public fun <T> Sequence<Int>.dropWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [379:48] ==> value-parameter it: Int defined in test.collections.SequenceTest.distinct.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [379:58] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [380:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [380:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequence' @ [380:42] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.distinct[LocalVariableDescriptor]

'map' @ [380:51] ==> public fun <T, R> Sequence<Int>.map(transform: (Int) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'it' @ [380:57] ==> value-parameter it: Int defined in test.collections.SequenceTest.distinct.<anonymous>[ValueParameterDescriptorImpl]

'distinct' @ [380:66] ==> public fun <T> Sequence<Int>.distinct(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'toList' @ [380:77] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [383:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'fibonacci' @ [384:24] ==> public fun fibonacci(): Sequence<Int> defined in test.collections[SimpleFunctionDescriptorImpl]

'dropWhile' @ [384:36] ==> public fun <T> Sequence<Int>.dropWhile(predicate: (Int) -> Boolean): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [384:48] ==> value-parameter it: Int defined in test.collections.SequenceTest.distinctBy.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [384:58] ==> public fun <T> Sequence<Int>.take(n: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [385:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [385:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'sequence' @ [385:47] ==> val sequence: Sequence<Int> defined in test.collections.SequenceTest.distinctBy[LocalVariableDescriptor]

'distinctBy' @ [385:56] ==> public fun <T, K> Sequence<Int>.distinctBy(selector: (Int) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <K> -> Int

'it' @ [385:69] ==> value-parameter it: Int defined in test.collections.SequenceTest.distinctBy.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [385:78] ==> public fun <T> Sequence<Int>.toList(): List<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'Test' @ [388:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [389:19] ==> public fun <T> sequenceOf(vararg elements: Pair<Int, Char>): Sequence<Pair<Int, Char>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Char>

'to' @ [389:30] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'to' @ [389:40] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'to' @ [389:50] ==> public infix fun <A, B> Int.to(that: Char): Pair<Int, Char> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Int
    <B> -> Char

'component1' @ [390:14] ==> public final operator fun component1(): List<Int> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [390:20] ==> public final operator fun component2(): List<Char> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'seq' @ [390:29] ==> val seq: Sequence<Pair<Int, Char>> defined in test.collections.SequenceTest.unzip[LocalVariableDescriptor]

'unzip' @ [390:33] ==> public fun <T, R> Sequence<Pair<Int, Char>>.unzip(): Pair<List<Int>, List<Char>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Char

'assertEquals' @ [391:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [391:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'ints' @ [391:39] ==> val ints: List<Int> defined in test.collections.SequenceTest.unzip[LocalVariableDescriptor]

'assertEquals' @ [392:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Char>, actual: List<Char>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Char>

'listOf' @ [392:22] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'chars' @ [392:45] ==> val chars: List<Char> defined in test.collections.SequenceTest.unzip[LocalVariableDescriptor]

'Test' @ [395:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [396:9] ==> public fun <T> sequenceOf(vararg elements: Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'let' @ [396:29] ==> @InlineOnly public inline fun <T, R> Sequence<Int>.let(block: (Sequence<Int>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence<Int>
    <R> -> Unit

'it' @ [397:13] ==> value-parameter it: Sequence<Int> defined in test.collections.SequenceTest.sorted.<anonymous>[ValueParameterDescriptorImpl]

'sorted' @ [397:16] ==> public fun <T : Comparable<Int>> Sequence<Int>.sorted(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'iterator' @ [397:25] ==> public abstract operator fun iterator(): Iterator<Int> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'assertSorted' @ [397:36] ==> public fun <T> Iterator<Int>.assertSorted(isInOrder: (Int, Int) -> Boolean): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'a' @ [397:59] ==> value-parameter a: Int defined in test.collections.SequenceTest.sorted.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [397:64] ==> value-parameter b: Int defined in test.collections.SequenceTest.sorted.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [398:13] ==> value-parameter it: Sequence<Int> defined in test.collections.SequenceTest.sorted.<anonymous>[ValueParameterDescriptorImpl]

'sortedDescending' @ [398:16] ==> public fun <T : Comparable<Int>> Sequence<Int>.sortedDescending(): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'iterator' @ [398:35] ==> public abstract operator fun iterator(): Iterator<Int> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'assertSorted' @ [398:46] ==> public fun <T> Iterator<Int>.assertSorted(isInOrder: (Int, Int) -> Boolean): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'a' @ [398:69] ==> value-parameter a: Int defined in test.collections.SequenceTest.sorted.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [398:74] ==> value-parameter b: Int defined in test.collections.SequenceTest.sorted.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [402:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sequenceOf' @ [403:9] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [403:45] ==> @InlineOnly public inline fun <T, R> Sequence<String>.let(block: (Sequence<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence<String>
    <R> -> Unit

'it' @ [404:13] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.sortedBy.<anonymous>[ValueParameterDescriptorImpl]

'sortedBy' @ [404:16] ==> public inline fun <T, R : Comparable<Int>> Sequence<String>.sortedBy(crossinline selector: (String) -> Int?): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Int

'it' @ [404:27] ==> value-parameter it: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [404:30] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'iterator' @ [404:39] ==> public abstract operator fun iterator(): Iterator<String> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'assertSorted' @ [404:50] ==> public fun <T> Iterator<String>.assertSorted(isInOrder: (String, String) -> Boolean): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'compareValuesBy' @ [404:73] ==> @InlineOnly public inline fun <T> compareValuesBy(a: String, b: String, selector: (String) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'a' @ [404:89] ==> value-parameter a: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [404:92] ==> value-parameter b: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [404:97] ==> value-parameter it: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [404:100] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'it' @ [405:13] ==> value-parameter it: Sequence<String> defined in test.collections.SequenceTest.sortedBy.<anonymous>[ValueParameterDescriptorImpl]

'sortedByDescending' @ [405:16] ==> public inline fun <T, R : Comparable<Int>> Sequence<String>.sortedByDescending(crossinline selector: (String) -> Int?): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> Int

'it' @ [405:37] ==> value-parameter it: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [405:40] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'iterator' @ [405:49] ==> public abstract operator fun iterator(): Iterator<String> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'assertSorted' @ [405:60] ==> public fun <T> Iterator<String>.assertSorted(isInOrder: (String, String) -> Boolean): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'compareValuesBy' @ [405:83] ==> @InlineOnly public inline fun <T> compareValuesBy(a: String, b: String, selector: (String) -> Comparable<*>?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'a' @ [405:99] ==> value-parameter a: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [405:102] ==> value-parameter b: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [405:107] ==> value-parameter it: String defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [405:110] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'sequenceOf' @ [408:9] ==> public fun <T> sequenceOf(vararg elements: Char?): Sequence<Char?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char?

'let' @ [408:41] ==> @InlineOnly public inline fun <T, R> Sequence<Char?>.let(block: (Sequence<Char?>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sequence<Char?>
    <R> -> Unit

'it' @ [409:13] ==> value-parameter it: Sequence<Char?> defined in test.collections.SequenceTest.sortedBy.<anonymous>[ValueParameterDescriptorImpl]

'sortedBy' @ [409:16] ==> public inline fun <T, R : Comparable<Char>> Sequence<Char?>.sortedBy(crossinline selector: (Char?) -> Char?): Sequence<Char?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char?
    <R : Comparable<R>> -> Char

'it' @ [409:26] ==> value-parameter it: Char? defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [409:30] ==> public abstract operator fun iterator(): Iterator<Char?> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'assertSorted' @ [409:41] ==> public fun <T> Iterator<Char?>.assertSorted(isInOrder: (Char?, Char?) -> Boolean): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Char?

'compareValues' @ [409:64] ==> public fun <T : Comparable<*>> compareValues(a: Char?, b: Char?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Char

'a' @ [409:78] ==> value-parameter a: Char? defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [409:81] ==> value-parameter b: Char? defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [410:13] ==> value-parameter it: Sequence<Char?> defined in test.collections.SequenceTest.sortedBy.<anonymous>[ValueParameterDescriptorImpl]

'sortedByDescending' @ [410:16] ==> public inline fun <T, R : Comparable<Char>> Sequence<Char?>.sortedByDescending(crossinline selector: (Char?) -> Char?): Sequence<Char?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char?
    <R : Comparable<R>> -> Char

'it' @ [410:36] ==> value-parameter it: Char? defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'iterator' @ [410:40] ==> public abstract operator fun iterator(): Iterator<Char?> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'assertSorted' @ [410:51] ==> public fun <T> Iterator<Char?>.assertSorted(isInOrder: (Char?, Char?) -> Boolean): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Char?

'compareValues' @ [410:75] ==> public fun <T : Comparable<*>> compareValues(a: Char?, b: Char?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Char

'a' @ [410:89] ==> value-parameter a: Char? defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [410:92] ==> value-parameter b: Char? defined in test.collections.SequenceTest.sortedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [414:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'compareBy' @ [415:26] ==> @InlineOnly public inline fun <T> compareBy(crossinline selector: (String) -> Comparable<*>?): Comparator<String> /* = Comparator<String> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

's' @ [415:51] ==> value-parameter s: String defined in test.collections.SequenceTest.sortedWith.<anonymous>[ValueParameterDescriptorImpl]

'reversed' @ [415:53] ==> @InlineOnly public inline fun String.reversed(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [416:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [416:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sequenceOf' @ [416:53] ==> public fun <T> sequenceOf(vararg elements: String): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sortedWith' @ [416:87] ==> public fun <T> Sequence<String>.sortedWith(comparator: Comparator<in String> /* = Comparator<in String> */): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'comparator' @ [416:98] ==> val comparator: Comparator<String> /* = Comparator<String> */ defined in test.collections.SequenceTest.sortedWith[LocalVariableDescriptor]

'toList' @ [416:110] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

