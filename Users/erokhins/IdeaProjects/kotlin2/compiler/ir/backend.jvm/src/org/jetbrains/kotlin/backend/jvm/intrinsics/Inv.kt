'IntrinsicMethod' @ [25:13] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'signature' @ [28:26] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [28:36] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

'numberFunctionOperandType' @ [29:20] ==> @NotNull public open fun numberFunctionOperandType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'returnType' @ [29:46] ==> val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[LocalVariableDescriptor]

'IrIntrinsicFunction' @ [30:16] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[FakeCallableDescriptorForObject]

'create' @ [30:36] ==> public final fun create(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, type: Type, invokeInstruction: IrIntrinsicFunction.(InstructionAdapter) -> Unit): IrIntrinsicFunction defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [30:43] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[ValueParameterDescriptorImpl]

'signature' @ [30:55] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[ValueParameterDescriptorImpl]

'context' @ [30:66] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[ValueParameterDescriptorImpl]

'type' @ [30:75] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[LocalVariableDescriptor]

'if (returnType == Type.LONG_TYPE) {
                it.lconst(-1)
            }
            else {
                it.iconst(-1)
            }' @ [31:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'returnType' @ [31:17] ==> val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[LocalVariableDescriptor]

'LONG_TYPE' @ [31:36] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'it' @ [32:17] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'lconst' @ [32:20] ==> public open fun lconst(p0: Long): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'-' @ [32:27] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [35:17] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'iconst' @ [35:20] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'-' @ [35:27] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [37:13] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'xor' @ [37:16] ==> public open fun xor(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'returnType' @ [37:20] ==> val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Inv.toCallable[LocalVariableDescriptor]

