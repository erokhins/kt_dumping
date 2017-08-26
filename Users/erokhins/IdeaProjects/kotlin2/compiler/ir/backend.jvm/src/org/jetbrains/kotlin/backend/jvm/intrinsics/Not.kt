'IntrinsicMethod' @ [28:13] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'IrIntrinsicFunction' @ [30:16] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[FakeCallableDescriptorForObject]

'create' @ [30:36] ==> public final fun create(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ..., invokeInstuction: IrIntrinsicFunction.(InstructionAdapter) -> Unit): IrIntrinsicFunction defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [30:43] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable[ValueParameterDescriptorImpl]

'signature' @ [30:55] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable[ValueParameterDescriptorImpl]

'context' @ [30:66] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable[ValueParameterDescriptorImpl]

'not' @ [31:24] ==> @NotNull public open fun not(@NotNull p0: StackValue): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'onStack' @ [31:39] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [31:52] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'put' @ [31:67] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [31:76] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'it' @ [31:90] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'IntrinsicCallable' @ [36:22] ==> public constructor IntrinsicCallable(callable: CallableMethod, invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicCallable[ClassConstructorDescriptorImpl]

'method' @ [36:40] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable[ValueParameterDescriptorImpl]

'resolvedCall' @ [42:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'call' @ [42:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [42:53] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'if (element is KtPrefixExpression) {
                                codegen.gen(element.baseExpression)
                            }
                            else {
                                StackValue.receiver(resolvedCall, receiver, codegen, this)
                            }' @ [44:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StackValue..StackValue?), elseBranch: (StackValue..StackValue?)): (StackValue..StackValue?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.codegen.StackValue..org.jetbrains.kotlin.codegen.StackValue?)

'element' @ [44:33] ==> val element: KtElement defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[LocalVariableDescriptor]

'codegen' @ [45:33] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'gen' @ [45:41] ==> public open fun gen(p0: (KtElement..KtElement?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'element' @ [45:45] ==> val element: KtElement defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[LocalVariableDescriptor]

'baseExpression' @ [45:53] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'receiver' @ [48:44] ==> public open fun receiver(p0: (ResolvedCall<*>..ResolvedCall<*>?), p1: (StackValue..StackValue?), p2: (ExpressionCodegen..ExpressionCodegen?), @Nullable p3: Callable?): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'resolvedCall' @ [48:53] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'receiver' @ [48:67] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'codegen' @ [48:77] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[ValueParameterDescriptorImpl]

'this' @ [48:86] ==> <this> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>[LazyClassReceiverParameterDescriptor]

'not' @ [50:39] ==> @NotNull public open fun not(@NotNull p0: StackValue): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'stackValue' @ [50:43] ==> val stackValue: (StackValue..StackValue?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Not.toCallable.<no name provided>.invokeMethodWithArguments[LocalVariableDescriptor]

