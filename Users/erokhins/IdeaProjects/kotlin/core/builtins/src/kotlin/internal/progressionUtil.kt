'a' @ [21:15] ==> value-parameter a: Int defined in kotlin.internal.mod[ValueParameterDescriptorImpl]

'b' @ [21:19] ==> value-parameter b: Int defined in kotlin.internal.mod[ValueParameterDescriptorImpl]

'if (mod >= 0) mod else mod + b' @ [22:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'mod' @ [22:16] ==> val mod: Int defined in kotlin.internal.mod[LocalVariableDescriptor]

'mod' @ [22:26] ==> val mod: Int defined in kotlin.internal.mod[LocalVariableDescriptor]

'mod' @ [22:35] ==> val mod: Int defined in kotlin.internal.mod[LocalVariableDescriptor]

'b' @ [22:41] ==> value-parameter b: Int defined in kotlin.internal.mod[ValueParameterDescriptorImpl]

'a' @ [26:15] ==> value-parameter a: Long defined in kotlin.internal.mod[ValueParameterDescriptorImpl]

'b' @ [26:19] ==> value-parameter b: Long defined in kotlin.internal.mod[ValueParameterDescriptorImpl]

'if (mod >= 0) mod else mod + b' @ [27:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'mod' @ [27:16] ==> val mod: Long defined in kotlin.internal.mod[LocalVariableDescriptor]

'mod' @ [27:26] ==> val mod: Long defined in kotlin.internal.mod[LocalVariableDescriptor]

'mod' @ [27:35] ==> val mod: Long defined in kotlin.internal.mod[LocalVariableDescriptor]

'b' @ [27:41] ==> value-parameter b: Long defined in kotlin.internal.mod[ValueParameterDescriptorImpl]

'mod' @ [32:12] ==> private fun mod(a: Int, b: Int): Int defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'mod' @ [32:16] ==> private fun mod(a: Int, b: Int): Int defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'a' @ [32:20] ==> value-parameter a: Int defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'c' @ [32:23] ==> value-parameter c: Int defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'mod' @ [32:28] ==> private fun mod(a: Int, b: Int): Int defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'b' @ [32:32] ==> value-parameter b: Int defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'c' @ [32:35] ==> value-parameter c: Int defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'c' @ [32:39] ==> value-parameter c: Int defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'mod' @ [36:12] ==> private fun mod(a: Long, b: Long): Long defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'mod' @ [36:16] ==> private fun mod(a: Long, b: Long): Long defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'a' @ [36:20] ==> value-parameter a: Long defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'c' @ [36:23] ==> value-parameter c: Long defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'mod' @ [36:28] ==> private fun mod(a: Long, b: Long): Long defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'b' @ [36:32] ==> value-parameter b: Long defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'c' @ [36:35] ==> value-parameter c: Long defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'c' @ [36:39] ==> value-parameter c: Long defined in kotlin.internal.differenceModulo[ValueParameterDescriptorImpl]

'if (step > 0) {
        return end - differenceModulo(end, start, step)
    }
    else if (step < 0) {
        return end + differenceModulo(start, end, -step)
    }
    else {
        throw kotlin.IllegalArgumentException("Step is zero.")
    }' @ [53:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'step' @ [53:9] ==> value-parameter step: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'end' @ [54:16] ==> value-parameter end: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'differenceModulo' @ [54:22] ==> private fun differenceModulo(a: Int, b: Int, c: Int): Int defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'end' @ [54:39] ==> value-parameter end: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'start' @ [54:44] ==> value-parameter start: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'step' @ [54:51] ==> value-parameter step: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'if (step < 0) {
        return end + differenceModulo(start, end, -step)
    }
    else {
        throw kotlin.IllegalArgumentException("Step is zero.")
    }' @ [56:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'step' @ [56:14] ==> value-parameter step: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'end' @ [57:16] ==> value-parameter end: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'differenceModulo' @ [57:22] ==> private fun differenceModulo(a: Int, b: Int, c: Int): Int defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'start' @ [57:39] ==> value-parameter start: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'end' @ [57:46] ==> value-parameter end: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'-' @ [57:51] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'step' @ [57:52] ==> value-parameter step: Int defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [60:22] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'if (step > 0) {
        return end - differenceModulo(end, start, step)
    }
    else if (step < 0) {
        return end + differenceModulo(start, end, -step)
    }
    else {
        throw kotlin.IllegalArgumentException("Step is zero.")
    }' @ [78:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'step' @ [78:9] ==> value-parameter step: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'end' @ [79:16] ==> value-parameter end: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'differenceModulo' @ [79:22] ==> private fun differenceModulo(a: Long, b: Long, c: Long): Long defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'end' @ [79:39] ==> value-parameter end: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'start' @ [79:44] ==> value-parameter start: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'step' @ [79:51] ==> value-parameter step: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'if (step < 0) {
        return end + differenceModulo(start, end, -step)
    }
    else {
        throw kotlin.IllegalArgumentException("Step is zero.")
    }' @ [81:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'step' @ [81:14] ==> value-parameter step: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'end' @ [82:16] ==> value-parameter end: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'differenceModulo' @ [82:22] ==> private fun differenceModulo(a: Long, b: Long, c: Long): Long defined in kotlin.internal in file progressionUtil.kt[SimpleFunctionDescriptorImpl]

'start' @ [82:39] ==> value-parameter start: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'end' @ [82:46] ==> value-parameter end: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'-' @ [82:51] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'step' @ [82:52] ==> value-parameter step: Long defined in kotlin.internal.getProgressionLastElement[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [85:22] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

