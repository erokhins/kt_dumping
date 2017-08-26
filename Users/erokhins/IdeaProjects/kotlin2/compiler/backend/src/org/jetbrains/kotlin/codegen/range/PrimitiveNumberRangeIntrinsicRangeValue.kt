'CallIntrinsicRangeValue' @ [28:106] ==> public constructor CallIntrinsicRangeValue(rangeCall: ResolvedCall<out CallableDescriptor>) defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue[ClassConstructorDescriptorImpl]

'rangeCall' @ [28:130] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.<init>[ValueParameterDescriptorImpl]

'getAsmRangeElementTypeForPrimitiveRangeOrProgression' @ [29:36] ==> public fun getAsmRangeElementTypeForPrimitiveRangeOrProgression(rangeCallee: CallableDescriptor): Type defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'rangeCall' @ [29:89] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.<init>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [29:99] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'resolvedCallForIn' @ [32:13] ==> value-parameter resolvedCallForIn: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.isIntrinsicInCall[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [32:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'let' @ [32:51] ==> @InlineOnly public inline fun <T, R> CallableDescriptor.let(block: (CallableDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R> -> Boolean

'isPrimitiveRangeContains' @ [33:17] ==> public fun isPrimitiveRangeContains(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [33:42] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.isIntrinsicInCall.<anonymous>[ValueParameterDescriptorImpl]

'isClosedFloatingPointRangeContains' @ [34:17] ==> public fun isClosedFloatingPointRangeContains(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [34:52] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.isIntrinsicInCall.<anonymous>[ValueParameterDescriptorImpl]

'isPrimitiveNumberRangeExtensionContainsPrimitiveNumber' @ [35:17] ==> public fun isPrimitiveNumberRangeExtensionContainsPrimitiveNumber(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.codegen in file RangeCodegenUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [35:72] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.isIntrinsicInCall.<anonymous>[ValueParameterDescriptorImpl]

'getComparisonGeneratorForRangeContainsCall' @ [43:35] ==> public fun getComparisonGeneratorForRangeContainsCall(codegen: ExpressionCodegen, call: ResolvedCall<out CallableDescriptor>): ComparisonGenerator? defined in org.jetbrains.kotlin.codegen.range.comparison in file ComparisonGenerator.kt[SimpleFunctionDescriptorImpl]

'codegen' @ [43:78] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[ValueParameterDescriptorImpl]

'resolvedCall' @ [43:87] ==> value-parameter resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[ValueParameterDescriptorImpl]

'if (comparisonGenerator != null)
            InPrimitiveContinuousRangeExpressionGenerator(operatorReference, getBoundedValue(codegen), comparisonGenerator)
        else
            CallBasedInExpressionGenerator(codegen, operatorReference)' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InExpressionGenerator, elseBranch: InExpressionGenerator): InExpressionGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InExpressionGenerator

'comparisonGenerator' @ [44:20] ==> val comparisonGenerator: ComparisonGenerator? defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[LocalVariableDescriptor]

'InPrimitiveContinuousRangeExpressionGenerator' @ [45:13] ==> public constructor InPrimitiveContinuousRangeExpressionGenerator(operatorReference: KtSimpleNameExpression, boundedValue: BoundedValue, comparisonGenerator: ComparisonGenerator) defined in org.jetbrains.kotlin.codegen.range.inExpression.InPrimitiveContinuousRangeExpressionGenerator[ClassConstructorDescriptorImpl]

'operatorReference' @ [45:59] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[ValueParameterDescriptorImpl]

'getBoundedValue' @ [45:78] ==> protected abstract fun getBoundedValue(codegen: ExpressionCodegen): BoundedValue defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue[SimpleFunctionDescriptorImpl]

'codegen' @ [45:94] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[ValueParameterDescriptorImpl]

'comparisonGenerator' @ [45:104] ==> val comparisonGenerator: ComparisonGenerator? defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[LocalVariableDescriptor]

'CallBasedInExpressionGenerator' @ [47:13] ==> public constructor CallBasedInExpressionGenerator(codegen: ExpressionCodegen, operatorReference: KtSimpleNameExpression) defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [47:44] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[ValueParameterDescriptorImpl]

'operatorReference' @ [47:53] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.PrimitiveNumberRangeIntrinsicRangeValue.createIntrinsicInExpressionGenerator[ValueParameterDescriptorImpl]

