'IntrinsicMethod' @ [27:43] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'opcode' @ [29:13] ==> private final val opcode: Int defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp[PropertyDescriptorImpl]

'ISHL' @ [29:23] ==> public const final val ISHL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [29:31] ==> private final val opcode: Int defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp[PropertyDescriptorImpl]

'ISHR' @ [29:41] ==> public const final val ISHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [29:49] ==> private final val opcode: Int defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp[PropertyDescriptorImpl]

'IUSHR' @ [29:59] ==> public const final val IUSHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'context' @ [32:21] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'state' @ [32:29] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'typeMapper' @ [32:35] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapOwner' @ [32:46] ==> @NotNull public open fun mapOwner(@NotNull p0: DeclarationDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'expression' @ [32:55] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'descriptor' @ [32:66] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'signature' @ [33:26] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [33:36] ==> public final val JvmMethodSignature.returnType: Type[MyPropertyDescriptor]

'numberFunctionOperandType' @ [34:44] ==> @NotNull public open fun numberFunctionOperandType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'returnType' @ [34:70] ==> val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'if (owner != Type.CHAR_TYPE) {
            listOf(intermediateResultType, if (shift()) Type.INT_TYPE else intermediateResultType)
        }
        else {
            listOf(Type.CHAR_TYPE, signature.valueParameters[0].asmType)
        }' @ [35:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Type>, elseBranch: List<Type>): List<Type>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Type>

'owner' @ [35:28] ==> val owner: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'CHAR_TYPE' @ [35:42] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'listOf' @ [36:13] ==> public fun <T> listOf(vararg elements: (Type..Type?)): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'intermediateResultType' @ [36:20] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'if (shift()) Type.INT_TYPE else intermediateResultType' @ [36:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Type..Type?), elseBranch: (Type..Type?)): (Type..Type?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'shift' @ [36:48] ==> private final fun shift(): Boolean defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp[SimpleFunctionDescriptorImpl]

'INT_TYPE' @ [36:62] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'intermediateResultType' @ [36:76] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'listOf' @ [39:13] ==> public fun <T> listOf(vararg elements: (Type..Type?)): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'CHAR_TYPE' @ [39:25] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'signature' @ [39:36] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'valueParameters' @ [39:46] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'asmType' @ [39:65] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'IrIntrinsicFunction' @ [42:16] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[FakeCallableDescriptorForObject]

'create' @ [42:36] ==> public final fun create(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ..., invokeInstuction: IrIntrinsicFunction.(InstructionAdapter) -> Unit): IrIntrinsicFunction defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [42:43] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'signature' @ [42:55] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'context' @ [42:66] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'argTypes' @ [42:75] ==> val argTypes: List<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'it' @ [43:13] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'visitInsn' @ [43:16] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'returnType' @ [43:26] ==> val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'getOpcode' @ [43:37] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'opcode' @ [43:47] ==> private final val opcode: Int defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp[PropertyDescriptorImpl]

'coerce' @ [44:24] ==> public open fun coerce(@NotNull p0: Type, @NotNull p1: Type, @NotNull p2: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'intermediateResultType' @ [44:31] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'returnType' @ [44:55] ==> val returnType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'it' @ [44:67] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.BinaryOp.toCallable.<anonymous>[ValueParameterDescriptorImpl]

