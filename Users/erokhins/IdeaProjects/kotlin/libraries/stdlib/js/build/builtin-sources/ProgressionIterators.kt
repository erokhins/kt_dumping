'CharIterator' @ [25:82] ==> public constructor CharIterator() defined in kotlin.collections.CharIterator[ClassConstructorDescriptorImpl]

'last' @ [26:32] ==> value-parameter last: Char defined in kotlin.ranges.CharProgressionIterator.<init>[ValueParameterDescriptorImpl]

'toInt' @ [26:37] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'if (step > 0) first <= last else first >= last' @ [27:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'step' @ [27:40] ==> public final val step: Int defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'first' @ [27:50] ==> value-parameter first: Char defined in kotlin.ranges.CharProgressionIterator.<init>[ValueParameterDescriptorImpl]

'last' @ [27:59] ==> value-parameter last: Char defined in kotlin.ranges.CharProgressionIterator.<init>[ValueParameterDescriptorImpl]

'first' @ [27:69] ==> value-parameter first: Char defined in kotlin.ranges.CharProgressionIterator.<init>[ValueParameterDescriptorImpl]

'last' @ [27:78] ==> value-parameter last: Char defined in kotlin.ranges.CharProgressionIterator.<init>[ValueParameterDescriptorImpl]

'if (hasNext) first.toInt() else finalElement' @ [28:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'hasNext' @ [28:28] ==> private final var hasNext: Boolean defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'first' @ [28:37] ==> value-parameter first: Char defined in kotlin.ranges.CharProgressionIterator.<init>[ValueParameterDescriptorImpl]

'toInt' @ [28:43] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'finalElement' @ [28:56] ==> private final val finalElement: Int defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'hasNext' @ [30:39] ==> private final var hasNext: Boolean defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'next' @ [33:21] ==> private final var next: Int defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'if (value == finalElement) {
            if (!hasNext) throw kotlin.NoSuchElementException()
            hasNext = false
        }
        else {
            next += step
        }' @ [34:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [34:13] ==> val value: Int defined in kotlin.ranges.CharProgressionIterator.nextChar[LocalVariableDescriptor]

'finalElement' @ [34:22] ==> private final val finalElement: Int defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'!' @ [35:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [35:18] ==> private final var hasNext: Boolean defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'NoSuchElementException' @ [35:40] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'hasNext' @ [36:13] ==> private final var hasNext: Boolean defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'next' @ [39:13] ==> private final var next: Int defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'step' @ [39:21] ==> public final val step: Int defined in kotlin.ranges.CharProgressionIterator[PropertyDescriptorImpl]

'value' @ [41:16] ==> val value: Int defined in kotlin.ranges.CharProgressionIterator.nextChar[LocalVariableDescriptor]

'toChar' @ [41:22] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'IntIterator' @ [49:79] ==> public constructor IntIterator() defined in kotlin.collections.IntIterator[ClassConstructorDescriptorImpl]

'last' @ [50:32] ==> value-parameter last: Int defined in kotlin.ranges.IntProgressionIterator.<init>[ValueParameterDescriptorImpl]

'if (step > 0) first <= last else first >= last' @ [51:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'step' @ [51:40] ==> public final val step: Int defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'first' @ [51:50] ==> value-parameter first: Int defined in kotlin.ranges.IntProgressionIterator.<init>[ValueParameterDescriptorImpl]

'last' @ [51:59] ==> value-parameter last: Int defined in kotlin.ranges.IntProgressionIterator.<init>[ValueParameterDescriptorImpl]

'first' @ [51:69] ==> value-parameter first: Int defined in kotlin.ranges.IntProgressionIterator.<init>[ValueParameterDescriptorImpl]

'last' @ [51:78] ==> value-parameter last: Int defined in kotlin.ranges.IntProgressionIterator.<init>[ValueParameterDescriptorImpl]

'if (hasNext) first else finalElement' @ [52:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'hasNext' @ [52:28] ==> private final var hasNext: Boolean defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'first' @ [52:37] ==> value-parameter first: Int defined in kotlin.ranges.IntProgressionIterator.<init>[ValueParameterDescriptorImpl]

'finalElement' @ [52:48] ==> private final val finalElement: Int defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'hasNext' @ [54:39] ==> private final var hasNext: Boolean defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'next' @ [57:21] ==> private final var next: Int defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'if (value == finalElement) {
            if (!hasNext) throw kotlin.NoSuchElementException()
            hasNext = false
        }
        else {
            next += step
        }' @ [58:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [58:13] ==> val value: Int defined in kotlin.ranges.IntProgressionIterator.nextInt[LocalVariableDescriptor]

'finalElement' @ [58:22] ==> private final val finalElement: Int defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'!' @ [59:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [59:18] ==> private final var hasNext: Boolean defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'NoSuchElementException' @ [59:40] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'hasNext' @ [60:13] ==> private final var hasNext: Boolean defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'next' @ [63:13] ==> private final var next: Int defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'step' @ [63:21] ==> public final val step: Int defined in kotlin.ranges.IntProgressionIterator[PropertyDescriptorImpl]

'value' @ [65:16] ==> val value: Int defined in kotlin.ranges.IntProgressionIterator.nextInt[LocalVariableDescriptor]

'LongIterator' @ [73:83] ==> public constructor LongIterator() defined in kotlin.collections.LongIterator[ClassConstructorDescriptorImpl]

'last' @ [74:32] ==> value-parameter last: Long defined in kotlin.ranges.LongProgressionIterator.<init>[ValueParameterDescriptorImpl]

'if (step > 0) first <= last else first >= last' @ [75:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'step' @ [75:40] ==> public final val step: Long defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'first' @ [75:50] ==> value-parameter first: Long defined in kotlin.ranges.LongProgressionIterator.<init>[ValueParameterDescriptorImpl]

'last' @ [75:59] ==> value-parameter last: Long defined in kotlin.ranges.LongProgressionIterator.<init>[ValueParameterDescriptorImpl]

'first' @ [75:69] ==> value-parameter first: Long defined in kotlin.ranges.LongProgressionIterator.<init>[ValueParameterDescriptorImpl]

'last' @ [75:78] ==> value-parameter last: Long defined in kotlin.ranges.LongProgressionIterator.<init>[ValueParameterDescriptorImpl]

'if (hasNext) first else finalElement' @ [76:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'hasNext' @ [76:28] ==> private final var hasNext: Boolean defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'first' @ [76:37] ==> value-parameter first: Long defined in kotlin.ranges.LongProgressionIterator.<init>[ValueParameterDescriptorImpl]

'finalElement' @ [76:48] ==> private final val finalElement: Long defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'hasNext' @ [78:39] ==> private final var hasNext: Boolean defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'next' @ [81:21] ==> private final var next: Long defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'if (value == finalElement) {
            if (!hasNext) throw kotlin.NoSuchElementException()
            hasNext = false
        }
        else {
            next += step
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [82:13] ==> val value: Long defined in kotlin.ranges.LongProgressionIterator.nextLong[LocalVariableDescriptor]

'finalElement' @ [82:22] ==> private final val finalElement: Long defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'!' @ [83:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [83:18] ==> private final var hasNext: Boolean defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'NoSuchElementException' @ [83:40] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'hasNext' @ [84:13] ==> private final var hasNext: Boolean defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'next' @ [87:13] ==> private final var next: Long defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'step' @ [87:21] ==> public final val step: Long defined in kotlin.ranges.LongProgressionIterator[PropertyDescriptorImpl]

'value' @ [89:16] ==> val value: Long defined in kotlin.ranges.LongProgressionIterator.nextLong[LocalVariableDescriptor]

