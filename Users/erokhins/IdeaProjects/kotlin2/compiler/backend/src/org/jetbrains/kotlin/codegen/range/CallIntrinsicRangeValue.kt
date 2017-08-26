'operatorReference' @ [34:28] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[ValueParameterDescriptorImpl]

'getResolvedCallWithAssert' @ [34:46] ==> public fun KtElement.getResolvedCallWithAssert(context: BindingContext): ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'codegen' @ [34:72] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[ValueParameterDescriptorImpl]

'bindingContext' @ [34:80] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'if (isIntrinsicInCall(resolvedCall))
            createIntrinsicInExpressionGenerator(codegen, operatorReference, resolvedCall)
        else
            CallBasedInExpressionGenerator(codegen, operatorReference)' @ [35:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InExpressionGenerator, elseBranch: InExpressionGenerator): InExpressionGenerator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InExpressionGenerator

'isIntrinsicInCall' @ [35:20] ==> protected abstract fun isIntrinsicInCall(resolvedCallForIn: ResolvedCall<out CallableDescriptor>): Boolean defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [35:38] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[LocalVariableDescriptor]

'createIntrinsicInExpressionGenerator' @ [36:13] ==> protected abstract fun createIntrinsicInExpressionGenerator(codegen: ExpressionCodegen, operatorReference: KtSimpleNameExpression, resolvedCall: ResolvedCall<out CallableDescriptor>): InExpressionGenerator defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue[SimpleFunctionDescriptorImpl]

'codegen' @ [36:50] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[ValueParameterDescriptorImpl]

'operatorReference' @ [36:59] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[ValueParameterDescriptorImpl]

'resolvedCall' @ [36:78] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[LocalVariableDescriptor]

'CallBasedInExpressionGenerator' @ [38:13] ==> public constructor CallBasedInExpressionGenerator(codegen: ExpressionCodegen, operatorReference: KtSimpleNameExpression) defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[ClassConstructorDescriptorImpl]

'codegen' @ [38:44] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[ValueParameterDescriptorImpl]

'operatorReference' @ [38:53] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.CallIntrinsicRangeValue.createInExpressionGenerator[ValueParameterDescriptorImpl]

