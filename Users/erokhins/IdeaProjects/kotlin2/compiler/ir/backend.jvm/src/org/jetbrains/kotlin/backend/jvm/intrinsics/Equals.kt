'IntrinsicMethod' @ [30:44] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'context' @ [32:24] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'state' @ [32:32] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'typeMapper' @ [32:38] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapType' @ [32:49] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'expression' @ [32:57] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'getValueArgument' @ [32:68] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'type' @ [32:90] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'context' @ [33:25] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'state' @ [33:33] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'typeMapper' @ [33:39] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapType' @ [33:50] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'expression' @ [33:58] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'getValueArgument' @ [33:69] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'type' @ [33:91] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'isPrimitive' @ [35:13] ==> public open fun isPrimitive(p0: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [35:25] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'isPrimitive' @ [35:38] ==> public open fun isPrimitive(p0: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'rightType' @ [35:50] ==> var rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'leftType' @ [36:13] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'boxType' @ [36:24] ==> @NotNull public open fun boxType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [36:32] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'rightType' @ [37:13] ==> var rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'boxType' @ [37:25] ==> @NotNull public open fun boxType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'rightType' @ [37:33] ==> var rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'IrIntrinsicFunction' @ [41:24] ==> public constructor IrIntrinsicFunction(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[ClassConstructorDescriptorImpl]

'expression' @ [41:44] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'signature' @ [41:56] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'context' @ [41:67] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'listOf' @ [41:76] ==> public fun <T> listOf(vararg elements: Type): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'leftType' @ [41:83] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'rightType' @ [41:93] ==> var rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'expression' @ [43:31] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[ValueParameterDescriptorImpl]

'origin' @ [43:42] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'if (opToken === IrStatementOrigin.EQEQEQ || opToken === IrStatementOrigin.EXCLEQEQ) {
                    // TODO: always casting to the type of the left operand in case of primitives looks wrong
                    val operandType = if (isPrimitive(leftType)) leftType else OBJECT_TYPE
                    StackValue.cmp(operator, operandType, StackValue.onStack(leftType), StackValue.onStack(rightType))
                }
                else {
                    genEqualsForExpressionsOnStack(operator, StackValue.onStack(leftType), StackValue.onStack(rightType))
                }' @ [45:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackValue, elseBranch: StackValue): StackValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackValue

'opToken' @ [45:33] ==> val opToken: IrStatementOrigin? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable.<no name provided>.genInvokeInstruction[LocalVariableDescriptor]

'EQEQEQ' @ [45:63] ==> public object EQEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'opToken' @ [45:73] ==> val opToken: IrStatementOrigin? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable.<no name provided>.genInvokeInstruction[LocalVariableDescriptor]

'EXCLEQEQ' @ [45:103] ==> public object EXCLEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'if (isPrimitive(leftType)) leftType else OBJECT_TYPE' @ [47:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'isPrimitive' @ [47:43] ==> public open fun isPrimitive(p0: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [47:55] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'leftType' @ [47:66] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'OBJECT_TYPE' @ [47:80] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'cmp' @ [48:32] ==> @NotNull public open fun cmp(@NotNull p0: IElementType, @NotNull p1: Type, p2: (StackValue..StackValue?), p3: (StackValue..StackValue?)): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operator' @ [48:36] ==> public final val operator: IElementType defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals[PropertyDescriptorImpl]

'operandType' @ [48:46] ==> val operandType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable.<no name provided>.genInvokeInstruction[LocalVariableDescriptor]

'onStack' @ [48:70] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'leftType' @ [48:78] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'onStack' @ [48:100] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'rightType' @ [48:108] ==> var rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'genEqualsForExpressionsOnStack' @ [51:21] ==> @NotNull public open fun genEqualsForExpressionsOnStack(@NotNull p0: IElementType, @NotNull p1: StackValue, @NotNull p2: StackValue): StackValue defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'operator' @ [51:52] ==> public final val operator: IElementType defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals[PropertyDescriptorImpl]

'onStack' @ [51:73] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'leftType' @ [51:81] ==> var leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'onStack' @ [51:103] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'rightType' @ [51:111] ==> var rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable[LocalVariableDescriptor]

'value' @ [53:17] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable.<no name provided>.genInvokeInstruction[LocalVariableDescriptor]

'put' @ [53:23] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [53:32] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [53:46] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Equals.toCallable.<no name provided>.genInvokeInstruction[ValueParameterDescriptorImpl]

