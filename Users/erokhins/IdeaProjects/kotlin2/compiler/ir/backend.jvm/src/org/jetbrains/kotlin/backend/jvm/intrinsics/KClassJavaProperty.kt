'IntrinsicMethod' @ [29:28] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'IrIntrinsicFunction' @ [31:24] ==> public constructor IrIntrinsicFunction(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[ClassConstructorDescriptorImpl]

'expression' @ [31:44] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable[ValueParameterDescriptorImpl]

'signature' @ [31:56] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable[ValueParameterDescriptorImpl]

'context' @ [31:67] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable[ValueParameterDescriptorImpl]

'expression' @ [33:41] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable[ValueParameterDescriptorImpl]

'extensionReceiver' @ [33:52] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'if (extensionReceiver is IrClassReference || extensionReceiver is IrGetClass) {
                    codegen.generateClassLiteralReference(extensionReceiver, false, data)
                }
                else {
                    codegen.gen(extensionReceiver!!, data)
                    val mapToCallableMethod = context.state.typeMapper.mapToCallableMethod(expression.descriptor as FunctionDescriptor, false)
                    mapToCallableMethod.genInvokeInstruction(codegen.mv)
                }' @ [34:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'extensionReceiver' @ [34:21] ==> val extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'extensionReceiver' @ [34:62] ==> val extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'codegen' @ [35:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'generateClassLiteralReference' @ [35:29] ==> public final fun generateClassLiteralReference(receiverExpression: IrExpression, wrapIntoKClass: Boolean, data: BlockInfo): Unit defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'extensionReceiver' @ [35:59] ==> val extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'data' @ [35:85] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'codegen' @ [38:21] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'gen' @ [38:29] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'extensionReceiver' @ [38:33] ==> val extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'data' @ [38:54] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'context' @ [39:47] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable[ValueParameterDescriptorImpl]

'state' @ [39:55] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'typeMapper' @ [39:61] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapToCallableMethod' @ [39:72] ==> @NotNull public open fun mapToCallableMethod(@NotNull p0: FunctionDescriptor, p1: Boolean): CallableMethod defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'expression' @ [39:92] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable[ValueParameterDescriptorImpl]

'descriptor' @ [39:103] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'mapToCallableMethod' @ [40:21] ==> val mapToCallableMethod: CallableMethod defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'genInvokeInstruction' @ [40:41] ==> public open fun genInvokeInstruction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.CallableMethod[DeserializedSimpleFunctionDescriptor]

'codegen' @ [40:62] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'mv' @ [40:70] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'onStack' @ [42:35] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'signature' @ [42:43] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.KClassJavaProperty.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [42:53] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

