'IntrinsicMethod' @ [26:13] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'IntrinsicCallable' @ [28:22] ==> public constructor IntrinsicCallable(callable: CallableMethod, invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit = ...) defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[ClassConstructorDescriptorImpl]

'method' @ [28:40] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable[ValueParameterDescriptorImpl]

'resolvedCall' @ [34:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [34:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [34:53] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'if (element is KtPrefixExpression) {
                                codegen.gen(element.baseExpression)
                            }
                            else {
                                StackValue.receiver(resolvedCall, receiver, codegen, this)
                            }' @ [36:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StackValue..StackValue?), elseBranch: (StackValue..StackValue?)): (StackValue..StackValue?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.codegen.StackValue..org.jetbrains.kotlin.codegen.StackValue?)

'element' @ [36:33] ==> val element: KtElement defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[LocalVariableDescriptor]

'codegen' @ [37:33] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'gen' @ [37:41] ==> public open fun gen(expr: (KtElement..KtElement?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'element' @ [37:45] ==> val element: KtElement defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[LocalVariableDescriptor]

'baseExpression' @ [37:53] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'receiver' @ [40:44] ==> public open fun receiver(resolvedCall: (ResolvedCall<*>..ResolvedCall<*>?), receiver: (StackValue..StackValue?), codegen: (ExpressionCodegen..ExpressionCodegen?), @Nullable callableMethod: Callable?): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'resolvedCall' @ [40:53] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'receiver' @ [40:67] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'codegen' @ [40:77] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'this' @ [40:86] ==> <this> defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'not' @ [42:39] ==> @NotNull public open fun not(@NotNull stackValue: StackValue): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'stackValue' @ [42:43] ==> val stackValue: (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[LocalVariableDescriptor]

