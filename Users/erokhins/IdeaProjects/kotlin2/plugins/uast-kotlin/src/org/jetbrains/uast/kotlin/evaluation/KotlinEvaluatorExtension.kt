'AbstractEvaluatorExtension' @ [13:34] ==> public constructor AbstractEvaluatorExtension(language: Language) defined in org.jetbrains.uast.evaluation.AbstractEvaluatorExtension[DeserializedClassConstructorDescriptor]

'INSTANCE' @ [13:76] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'from' @ [16:37] ==> public final val from: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.Range[PropertyDescriptorImpl]

'to' @ [16:44] ==> public final val to: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.Range[PropertyDescriptorImpl]

'UAbstractConstant' @ [19:110] ==> public constructor UAbstractConstant() defined in org.jetbrains.uast.values.UAbstractConstant[DeserializedClassConstructorDescriptor]

'this' @ [20:75] ==> public constructor UClosedRangeConstant(value: KotlinEvaluatorExtension.Range, source: UBinaryExpression?) defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.UClosedRangeConstant[ClassConstructorDescriptorImpl]

'Range' @ [20:80] ==> public constructor Range(from: UValue, to: UValue) defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.Range[ClassConstructorDescriptorImpl]

'from' @ [20:86] ==> value-parameter from: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.UClosedRangeConstant.<init>[ValueParameterDescriptorImpl]

'to' @ [20:92] ==> value-parameter to: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.UClosedRangeConstant.<init>[ValueParameterDescriptorImpl]

'source' @ [20:97] ==> value-parameter source: UBinaryExpression defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.UClosedRangeConstant.<init>[ValueParameterDescriptorImpl]

'when (operator) {
            KotlinPostfixOperators.EXCLEXCL -> when (operandValue.toConstant()) {
                UNullConstant -> UValue.UNREACHABLE
                is UConstant -> operandValue
                else -> UUndeterminedValue
            } to state
            else -> return super.evaluatePostfix(operator, operandValue, state)
        }' @ [28:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UEvaluationInfo, entry1: UEvaluationInfo): UEvaluationInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UEvaluationInfo

'operator' @ [28:22] ==> value-parameter operator: UastPostfixOperator defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluatePostfix[ValueParameterDescriptorImpl]

'KotlinPostfixOperators' @ [29:13] ==> public object KotlinPostfixOperators defined in org.jetbrains.uast.kotlin in file KotlinPostfixOperators.kt[FakeCallableDescriptorForObject]

'EXCLEXCL' @ [29:36] ==> @JvmField public final val EXCLEXCL: UastPostfixOperator defined in org.jetbrains.uast.kotlin.KotlinPostfixOperators[PropertyDescriptorImpl]

'when (operandValue.toConstant()) {
                UNullConstant -> UValue.UNREACHABLE
                is UConstant -> operandValue
                else -> UUndeterminedValue
            }' @ [29:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UValue, entry1: UValue, entry2: UValue): UValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UValue

'operandValue' @ [29:54] ==> value-parameter operandValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluatePostfix[ValueParameterDescriptorImpl]

'toConstant' @ [29:67] ==> public abstract fun toConstant(): UConstant? defined in org.jetbrains.uast.values.UValue[DeserializedSimpleFunctionDescriptor]

'UNullConstant' @ [30:17] ==> public object UNullConstant : UAbstractConstant defined in org.jetbrains.uast.values[FakeCallableDescriptorForObject]

'UValue' @ [30:34] ==> public companion object defined in org.jetbrains.uast.values.UValue[FakeCallableDescriptorForObject]

'UNREACHABLE' @ [30:41] ==> public final val UNREACHABLE: UValue defined in org.jetbrains.uast.values.UValue.Companion[DeserializedPropertyDescriptor]

'operandValue' @ [31:33] ==> value-parameter operandValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluatePostfix[ValueParameterDescriptorImpl]

'UUndeterminedValue' @ [32:25] ==> public object UUndeterminedValue : UValueBase defined in org.jetbrains.uast.values[FakeCallableDescriptorForObject]

'state' @ [33:18] ==> value-parameter state: UEvaluationState defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluatePostfix[ValueParameterDescriptorImpl]

'super' @ [34:28] ==> <this> defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension[LazyClassReceiverParameterDescriptor]

'evaluatePostfix' @ [34:34] ==> public open fun evaluatePostfix(operator: UastPostfixOperator, operandValue: UValue, state: UEvaluationState): UEvaluationInfo defined in org.jetbrains.uast.evaluation.AbstractEvaluatorExtension[DeserializedSimpleFunctionDescriptor]

'operator' @ [34:50] ==> value-parameter operator: UastPostfixOperator defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluatePostfix[ValueParameterDescriptorImpl]

'operandValue' @ [34:60] ==> value-parameter operandValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluatePostfix[ValueParameterDescriptorImpl]

'state' @ [34:74] ==> value-parameter state: UEvaluationState defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluatePostfix[ValueParameterDescriptorImpl]

'?:' @ [39:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinEvaluatorExtension.Range?, right: KotlinEvaluatorExtension.Range): KotlinEvaluatorExtension.Range[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Range

'this' @ [39:22] ==> <this> defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.contains[ReceiverParameterDescriptorImpl]

'value' @ [39:54] ==> public open val value: KotlinEvaluatorExtension.Range defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.UClosedRangeConstant[PropertyDescriptorImpl]

'UUndeterminedValue' @ [39:70] ==> public object UUndeterminedValue : UValueBase defined in org.jetbrains.uast.values[FakeCallableDescriptorForObject]

'and' @ [40:16] ==> public abstract fun and(other: UValue): UValue defined in org.jetbrains.uast.values.UValue[DeserializedSimpleFunctionDescriptor]

'value' @ [40:17] ==> value-parameter value: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.contains[ValueParameterDescriptorImpl]

'range' @ [40:39] ==> val range: KotlinEvaluatorExtension.Range defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.contains[LocalVariableDescriptor]

'from' @ [40:45] ==> public final val from: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.Range[PropertyDescriptorImpl]

'value' @ [40:56] ==> value-parameter value: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.contains[ValueParameterDescriptorImpl]

'range' @ [40:75] ==> val range: KotlinEvaluatorExtension.Range defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.contains[LocalVariableDescriptor]

'to' @ [40:81] ==> public final val to: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.Range[PropertyDescriptorImpl]

'when (binaryExpression.operator) {
            KotlinBinaryOperators.IN -> rightValue.contains(leftValue)
            KotlinBinaryOperators.NOT_IN -> !rightValue.contains(leftValue)
            KotlinBinaryOperators.RANGE_TO -> UClosedRangeConstant(leftValue, rightValue, binaryExpression)
            else -> UUndeterminedValue
        }' @ [49:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UValue, entry1: UValue, entry2: UValue, entry3: UValue): UValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UValue

'binaryExpression' @ [49:22] ==> value-parameter binaryExpression: UBinaryExpression defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'operator' @ [49:39] ==> public abstract val operator: UastBinaryOperator defined in org.jetbrains.uast.UBinaryExpression[DeserializedPropertyDescriptor]

'KotlinBinaryOperators' @ [50:13] ==> public object KotlinBinaryOperators defined in org.jetbrains.uast.kotlin in file KotlinBinaryOperators.kt[FakeCallableDescriptorForObject]

'IN' @ [50:35] ==> @JvmField public final val IN: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'rightValue' @ [50:41] ==> value-parameter rightValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'contains' @ [50:52] ==> private final fun UValue.contains(value: UValue): UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension[SimpleFunctionDescriptorImpl]

'leftValue' @ [50:61] ==> value-parameter leftValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'KotlinBinaryOperators' @ [51:13] ==> public object KotlinBinaryOperators defined in org.jetbrains.uast.kotlin in file KotlinBinaryOperators.kt[FakeCallableDescriptorForObject]

'NOT_IN' @ [51:35] ==> @JvmField public final val NOT_IN: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'!' @ [51:45] ==> public abstract fun not(): UValue defined in org.jetbrains.uast.values.UValue[DeserializedSimpleFunctionDescriptor]

'rightValue' @ [51:46] ==> value-parameter rightValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'contains' @ [51:57] ==> private final fun UValue.contains(value: UValue): UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension[SimpleFunctionDescriptorImpl]

'leftValue' @ [51:66] ==> value-parameter leftValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'KotlinBinaryOperators' @ [52:13] ==> public object KotlinBinaryOperators defined in org.jetbrains.uast.kotlin in file KotlinBinaryOperators.kt[FakeCallableDescriptorForObject]

'RANGE_TO' @ [52:35] ==> @JvmField public final val RANGE_TO: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'UClosedRangeConstant' @ [52:47] ==> public constructor UClosedRangeConstant(from: UValue, to: UValue, source: UBinaryExpression) defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.UClosedRangeConstant[ClassConstructorDescriptorImpl]

'leftValue' @ [52:68] ==> value-parameter leftValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'rightValue' @ [52:79] ==> value-parameter rightValue: UValue defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'binaryExpression' @ [52:91] ==> value-parameter binaryExpression: UBinaryExpression defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

'UUndeterminedValue' @ [53:21] ==> public object UUndeterminedValue : UValueBase defined in org.jetbrains.uast.values[FakeCallableDescriptorForObject]

'state' @ [54:14] ==> value-parameter state: UEvaluationState defined in org.jetbrains.uast.kotlin.evaluation.KotlinEvaluatorExtension.evaluateBinary[ValueParameterDescriptorImpl]

