'when (sequence) {
            is IntProgression -> {
                first = sequence.first
                last = sequence.last
                increment = sequence.step
            }
            is LongProgression -> {
                first = sequence.first
                last = sequence.last
                increment = sequence.step
            }
            is CharProgression -> {
                first = sequence.first
                last = sequence.last
                increment = sequence.step
            }
            else -> throw IllegalArgumentException("Unsupported sequence type: $sequence")
        }' @ [19:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'sequence' @ [19:15] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'first' @ [21:17] ==> val first: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [21:25] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'first' @ [21:34] ==> public final val first: Int defined in kotlin.ranges.IntProgression[DeserializedPropertyDescriptor]

'last' @ [22:17] ==> val last: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [22:24] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'last' @ [22:33] ==> public final val last: Int defined in kotlin.ranges.IntProgression[DeserializedPropertyDescriptor]

'increment' @ [23:17] ==> val increment: Number defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [23:29] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'step' @ [23:38] ==> public final val step: Int defined in kotlin.ranges.IntProgression[DeserializedPropertyDescriptor]

'first' @ [26:17] ==> val first: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [26:25] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'first' @ [26:34] ==> public final val first: Long defined in kotlin.ranges.LongProgression[DeserializedPropertyDescriptor]

'last' @ [27:17] ==> val last: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [27:24] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'last' @ [27:33] ==> public final val last: Long defined in kotlin.ranges.LongProgression[DeserializedPropertyDescriptor]

'increment' @ [28:17] ==> val increment: Number defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [28:29] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'step' @ [28:38] ==> public final val step: Long defined in kotlin.ranges.LongProgression[DeserializedPropertyDescriptor]

'first' @ [31:17] ==> val first: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [31:25] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'first' @ [31:34] ==> public final val first: Char defined in kotlin.ranges.CharProgression[DeserializedPropertyDescriptor]

'last' @ [32:17] ==> val last: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [32:24] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'last' @ [32:33] ==> public final val last: Char defined in kotlin.ranges.CharProgression[DeserializedPropertyDescriptor]

'increment' @ [33:17] ==> val increment: Number defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'sequence' @ [33:29] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'step' @ [33:38] ==> public final val step: Int defined in kotlin.ranges.CharProgression[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [35:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'sequence' @ [35:81] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'assertEquals' @ [38:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Any, actual: Any, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Any

'expectedFirst' @ [38:22] ==> value-parameter expectedFirst: N defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'first' @ [38:37] ==> val first: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'assertEquals' @ [39:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Any, actual: Any, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Any

'expectedLast' @ [39:22] ==> value-parameter expectedLast: N defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'last' @ [39:36] ==> val last: Any defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'assertEquals' @ [40:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Number, actual: Number, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Number

'expectedIncrement' @ [40:22] ==> value-parameter expectedIncrement: Number defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'increment' @ [40:41] ==> val increment: Number defined in test.ranges.RangeIterationTestBase.doTest[LocalVariableDescriptor]

'if (expectedElements.isEmpty())
            assertTrue(sequence.none())
        else
            assertEquals(expectedElements, sequence.toList())' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expectedElements' @ [42:13] ==> value-parameter expectedElements: List<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'isEmpty' @ [42:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [43:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sequence' @ [43:24] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'none' @ [43:33] ==> public fun <T> Iterable<N>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> N

'assertEquals' @ [45:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<N>, actual: List<N>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<N>

'expectedElements' @ [45:26] ==> value-parameter expectedElements: List<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'sequence' @ [45:44] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'toList' @ [45:53] ==> public fun <T> Iterable<N>.toList(): List<N> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> N

'compare' @ [47:9] ==> public fun <T> compare(expected: Iterator<N>, actual: Iterator<N>, block: CompareContext<Iterator<N>>.() -> Unit): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Iterator<N>

'expectedElements' @ [47:17] ==> value-parameter expectedElements: List<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'iterator' @ [47:34] ==> public abstract fun iterator(): Iterator<N> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'sequence' @ [47:46] ==> value-parameter sequence: Iterable<N> defined in test.ranges.RangeIterationTestBase.doTest[ValueParameterDescriptorImpl]

'iterator' @ [47:55] ==> public abstract operator fun iterator(): Iterator<N> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'iteratorBehavior' @ [48:13] ==> public fun <T> CompareContext<Iterator<N>>.iteratorBehavior(): Unit defined in test.collections.behaviors[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> N

'RangeIterationTestBase' @ [55:35] ==> public constructor RangeIterationTestBase() defined in test.ranges.RangeIterationTestBase[ClassConstructorDescriptorImpl]

'Test' @ [57:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [58:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'IntRange' @ [58:16] ==> public companion object defined in kotlin.ranges.IntRange[FakeCallableDescriptorForObject]

'EMPTY' @ [58:25] ==> public final val EMPTY: IntRange defined in kotlin.ranges.IntRange.Companion[DeserializedPropertyDescriptor]

'listOf' @ [58:41] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [59:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'LongRange' @ [59:16] ==> public companion object defined in kotlin.ranges.LongRange[FakeCallableDescriptorForObject]

'EMPTY' @ [59:26] ==> public final val EMPTY: LongRange defined in kotlin.ranges.LongRange.Companion[DeserializedPropertyDescriptor]

'toLong' @ [59:35] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [59:47] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [59:59] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [59:69] ==> @InlineOnly public inline fun <T> listOf(): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [61:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'CharRange' @ [61:16] ==> public companion object defined in kotlin.ranges.CharRange[FakeCallableDescriptorForObject]

'EMPTY' @ [61:26] ==> public final val EMPTY: CharRange defined in kotlin.ranges.CharRange.Companion[DeserializedPropertyDescriptor]

'toChar' @ [61:35] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toChar' @ [61:47] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [61:60] ==> @InlineOnly public inline fun <T> listOf(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [64:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [65:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [65:16] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [65:33] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [66:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [66:16] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [66:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [66:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [66:34] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [66:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [66:57] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [67:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [67:16] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [67:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [67:31] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [67:35] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [67:51] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [67:59] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [68:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [68:16] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [68:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [68:29] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [68:32] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [68:45] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [68:55] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [68:58] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [68:70] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [68:80] ==> @InlineOnly public inline fun <T> listOf(): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [70:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [70:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'listOf' @ [70:39] ==> @InlineOnly public inline fun <T> listOf(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [73:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [74:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [74:16] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [74:31] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [75:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [75:16] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [75:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [75:30] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [75:49] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [76:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [76:16] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [76:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [76:31] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [76:51] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [77:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [77:16] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [77:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [77:30] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [77:42] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [77:54] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [77:66] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [77:76] ==> public fun <T> listOf(element: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'toLong' @ [77:85] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'doTest' @ [79:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [79:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'listOf' @ [79:39] ==> public fun <T> listOf(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [82:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [83:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [83:16] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [83:31] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [84:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [84:16] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [84:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [84:30] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [84:49] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [85:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [85:16] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [85:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [85:31] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [85:51] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [86:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [86:16] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [86:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [86:30] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [86:42] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [86:54] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [86:66] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [86:76] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [88:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [88:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'listOf' @ [88:39] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [92:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [93:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [93:16] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'+' @ [93:17] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [93:26] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [93:44] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [94:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [94:16] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'+' @ [94:17] ==> public final operator fun plus(other: Byte): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [94:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [94:32] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [94:42] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [94:53] ==> public final operator fun minus(other: Byte): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [94:56] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [94:69] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [94:79] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [94:98] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [95:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [95:16] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'+' @ [95:17] ==> public final operator fun plus(other: Short): Int defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [95:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [95:33] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [95:44] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [95:56] ==> public final operator fun minus(other: Short): Int defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [95:59] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [95:73] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [95:84] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [95:104] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [96:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [96:16] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'+' @ [96:17] ==> public final operator fun plus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [96:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [96:32] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [96:44] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [96:47] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [96:60] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [96:73] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [96:85] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [96:97] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [96:107] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [98:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [98:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'"ace"[1]' @ [98:17] ==> public open fun get(index: Int): Char defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'"age"[1]' @ [98:29] ==> public open fun get(index: Int): Char defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'listOf' @ [98:53] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [101:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [102:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'until' @ [102:16] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [102:36] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [103:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'until' @ [103:16] ==> public infix fun Byte.until(to: Byte): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [103:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [103:35] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [103:54] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [104:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'until' @ [104:16] ==> public infix fun Short.until(to: Short): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [104:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [104:36] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [104:56] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [105:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'until' @ [105:16] ==> public infix fun Long.until(to: Long): LongRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [105:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [105:35] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [105:57] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [106:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'until' @ [106:16] ==> public infix fun Char.until(to: Char): CharRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [106:44] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [110:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [111:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [111:16] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [111:36] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [111:40] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [112:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [112:16] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [112:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [112:37] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [112:54] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [112:58] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [113:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [113:16] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [113:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [113:38] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [113:56] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [113:60] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [114:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [114:16] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [114:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [114:37] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [114:49] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [114:62] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [114:72] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [114:75] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [114:85] ==> @InlineOnly public inline fun <T> listOf(): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [116:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [116:16] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [116:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [116:46] ==> @InlineOnly public inline fun <T> listOf(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [119:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [120:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [120:16] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [120:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [120:38] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [121:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [121:16] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [121:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [121:36] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [121:52] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [121:56] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [122:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [122:16] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [122:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [122:37] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [122:54] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [122:58] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [123:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [123:16] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [123:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [123:36] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [123:48] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [123:60] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [123:70] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [123:73] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [123:83] ==> public fun <T> listOf(element: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'toLong' @ [123:92] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'doTest' @ [125:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [125:16] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [125:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [125:46] ==> public fun <T> listOf(element: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [128:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [129:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [129:16] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [129:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [129:38] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [130:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [130:16] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [130:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [130:36] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [130:52] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [130:56] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [131:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [131:16] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [131:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [131:37] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [131:54] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [131:58] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [132:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [132:16] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [132:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [132:36] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [132:48] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [132:60] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [132:70] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [132:73] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [132:83] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [134:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [134:16] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [134:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [134:46] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [138:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [139:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [139:16] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [139:38] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [140:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [140:16] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [140:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [140:30] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [140:56] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [141:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [141:16] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [141:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [141:31] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [141:58] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [142:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [142:16] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [142:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [142:30] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [142:46] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [142:58] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [142:70] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [142:82] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [142:92] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [144:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [144:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'listOf' @ [144:46] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [147:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [148:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [148:16] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [148:41] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [148:45] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [149:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [149:16] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [149:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [149:36] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [149:59] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [149:63] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [150:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [150:16] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [150:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [150:37] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [150:61] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [150:65] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [151:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [151:16] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [151:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [151:36] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [151:52] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [151:64] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [151:76] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [151:86] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [151:89] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [151:99] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [153:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [153:16] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [153:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [153:53] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [158:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [159:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [159:16] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [159:38] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [160:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [160:16] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [160:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [160:30] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [160:56] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [161:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [161:16] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [161:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [161:31] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [161:58] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [162:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [162:16] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [162:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [162:30] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [162:46] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [162:58] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [162:70] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [162:82] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [162:92] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [164:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [164:16] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'listOf' @ [164:46] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [168:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [169:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [169:16] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [169:41] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [169:45] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [170:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [170:16] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [170:18] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [170:36] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [170:59] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [170:63] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [171:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [171:16] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [171:18] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [171:37] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [171:61] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [171:65] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [172:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [172:16] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [172:18] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [172:36] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [172:52] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [172:64] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [172:76] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [172:86] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [172:89] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [172:99] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [174:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [174:16] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [174:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [174:53] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [178:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [179:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [179:17] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [179:23] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [179:41] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [179:45] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [180:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [180:17] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [180:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [180:31] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [180:41] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [180:59] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [180:63] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [181:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [181:17] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [181:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [181:32] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [181:43] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [181:61] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [181:65] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [182:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [182:17] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [182:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [182:31] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [182:41] ==> public fun LongProgression.reversed(): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [182:55] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [182:67] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [182:77] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [182:80] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [182:90] ==> @InlineOnly public inline fun <T> listOf(): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [184:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [184:17] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'reversed' @ [184:27] ==> public fun CharProgression.reversed(): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [184:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [184:53] ==> @InlineOnly public inline fun <T> listOf(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [187:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [188:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [188:17] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'reversed' @ [188:29] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [188:50] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [189:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [189:17] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [189:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [189:37] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [189:47] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [189:68] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [190:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [190:17] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [190:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [190:38] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [190:49] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [190:70] ==> @InlineOnly public inline fun <T> listOf(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [191:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [191:17] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [191:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [191:37] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [191:47] ==> public fun LongProgression.reversed(): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [191:61] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [191:73] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [191:85] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [191:95] ==> @InlineOnly public inline fun <T> listOf(): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [193:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [193:17] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'reversed' @ [193:33] ==> public fun CharProgression.reversed(): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [193:58] ==> @InlineOnly public inline fun <T> listOf(): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [196:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [197:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [197:17] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [197:23] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [197:41] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [197:45] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [198:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [198:17] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [198:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [198:31] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [198:41] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [198:58] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [198:62] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [199:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [199:17] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [199:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [199:32] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [199:43] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [199:61] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [199:65] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [200:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [200:17] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [200:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [200:31] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [200:41] ==> public fun LongProgression.reversed(): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [200:55] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [200:67] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [200:77] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [200:80] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [200:90] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [202:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [202:17] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'reversed' @ [202:27] ==> public fun CharProgression.reversed(): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [202:49] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [202:53] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [205:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [206:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [206:17] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'reversed' @ [206:29] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [206:50] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [207:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [207:17] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [207:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [207:37] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [207:47] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [207:68] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [208:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [208:17] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [208:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [208:38] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [208:49] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [208:70] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [209:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [209:17] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [209:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [209:37] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [209:47] ==> public fun LongProgression.reversed(): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [209:61] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [209:73] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [209:85] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [209:95] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [211:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [211:17] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'reversed' @ [211:33] ==> public fun CharProgression.reversed(): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [211:58] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [215:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [216:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [216:17] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [216:30] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [216:48] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [216:52] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [217:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [217:17] ==> public final operator fun rangeTo(other: Byte): IntRange defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'toByte' @ [217:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [217:31] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [217:48] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [217:66] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [217:70] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [218:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'..' @ [218:17] ==> public final operator fun rangeTo(other: Short): IntRange defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'toShort' @ [218:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [218:32] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [218:50] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [218:68] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [218:72] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [219:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'..' @ [219:17] ==> public final operator fun rangeTo(other: Long): LongRange defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [219:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [219:31] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [219:47] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [219:57] ==> public fun LongProgression.reversed(): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [219:71] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [219:83] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [219:93] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'toLong' @ [219:96] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [219:106] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [221:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'..' @ [221:17] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'reversed' @ [221:34] ==> public fun CharProgression.reversed(): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'-' @ [221:56] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [221:60] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

'Test' @ [226:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [227:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [227:17] ==> public infix fun Int.downTo(to: Int): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'reversed' @ [227:36] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [227:57] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [228:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [228:17] ==> public infix fun Byte.downTo(to: Byte): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toByte' @ [228:19] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByte' @ [228:37] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [228:54] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [228:75] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [229:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Int>, expectedFirst: Int, expectedLast: Int, expectedIncrement: Number, expectedElements: List<Int>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Int

'downTo' @ [229:17] ==> public infix fun Short.downTo(to: Short): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toShort' @ [229:19] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toShort' @ [229:38] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [229:56] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [229:77] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'doTest' @ [230:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Long>, expectedFirst: Long, expectedLast: Long, expectedIncrement: Number, expectedElements: List<Long>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Long

'downTo' @ [230:17] ==> public infix fun Long.downTo(to: Long): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [230:19] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [230:37] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [230:53] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'reversed' @ [230:63] ==> public fun LongProgression.reversed(): LongProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'toLong' @ [230:77] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [230:89] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toLong' @ [230:101] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [230:111] ==> public fun <T> listOf(vararg elements: Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long

'doTest' @ [232:9] ==> public final fun <N : Any> doTest(sequence: Iterable<Char>, expectedFirst: Char, expectedLast: Char, expectedIncrement: Number, expectedElements: List<Char>): Unit defined in test.ranges.RangeIterationTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : Any> -> Char

'downTo' @ [232:17] ==> public infix fun Char.downTo(to: Char): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'reversed' @ [232:40] ==> public fun CharProgression.reversed(): CharProgression defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'listOf' @ [232:65] ==> public fun <T> listOf(vararg elements: Char): List<Char> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Char

