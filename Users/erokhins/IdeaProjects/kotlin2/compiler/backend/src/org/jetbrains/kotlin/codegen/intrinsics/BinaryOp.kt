'IntrinsicMethod' @ [28:43] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'opcode' @ [30:13] ==> private final val opcode: Int defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp[PropertyDescriptorImpl]

'ISHL' @ [30:23] ==> public const final val ISHL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [30:31] ==> private final val opcode: Int defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp[PropertyDescriptorImpl]

'ISHR' @ [30:41] ==> public const final val ISHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'opcode' @ [30:49] ==> private final val opcode: Int defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp[PropertyDescriptorImpl]

'IUSHR' @ [30:59] ==> public const final val IUSHR: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'method' @ [33:26] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [33:33] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'assert' @ [34:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'method' @ [34:16] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'getValueParameters' @ [34:23] ==> public final fun getValueParameters(): List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'size' @ [34:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (method.owner != Type.CHAR_TYPE) {
            intermediateResultType = numberFunctionOperandType(returnType)
            arg0Type = intermediateResultType
            arg1Type = if (shift()) Type.INT_TYPE else arg0Type
        }
        else {
            arg0Type = Type.CHAR_TYPE
            arg1Type = method.getValueParameters()[0].asmType
            intermediateResultType = numberFunctionOperandType(returnType)
        }' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'method' @ [40:13] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'owner' @ [40:20] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'CHAR_TYPE' @ [40:34] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'intermediateResultType' @ [41:13] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'numberFunctionOperandType' @ [41:38] ==> @NotNull public open fun numberFunctionOperandType(@NotNull expectedType: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'returnType' @ [41:64] ==> val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'arg0Type' @ [42:13] ==> val arg0Type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'intermediateResultType' @ [42:24] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'arg1Type' @ [43:13] ==> val arg1Type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'if (shift()) Type.INT_TYPE else arg0Type' @ [43:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'shift' @ [43:28] ==> private final fun shift(): Boolean defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp[SimpleFunctionDescriptorImpl]

'INT_TYPE' @ [43:42] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'arg0Type' @ [43:56] ==> val arg0Type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'arg0Type' @ [46:13] ==> val arg0Type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'CHAR_TYPE' @ [46:29] ==> public final val CHAR_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'arg1Type' @ [47:13] ==> val arg1Type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'method' @ [47:24] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[ValueParameterDescriptorImpl]

'getValueParameters' @ [47:31] ==> public final fun getValueParameters(): List<JvmMethodParameterSignature> defined in org.jetbrains.kotlin.codegen.CallableMethod[SimpleFunctionDescriptorImpl]

'asmType' @ [47:55] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'intermediateResultType' @ [48:13] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'numberFunctionOperandType' @ [48:38] ==> @NotNull public open fun numberFunctionOperandType(@NotNull expectedType: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'returnType' @ [48:64] ==> val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'createBinaryIntrinsicCallable' @ [51:16] ==> public fun createBinaryIntrinsicCallable(returnType: Type, valueParameterType: Type, thisType: Type? = ..., receiverType: Type? = ..., lambda: IntrinsicCallable.(v: InstructionAdapter) -> Unit): IntrinsicCallable defined in org.jetbrains.kotlin.codegen.intrinsics in file IntrinsicCallable.kt[SimpleFunctionDescriptorImpl]

'returnType' @ [51:46] ==> val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'arg1Type' @ [51:58] ==> val arg1Type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'arg0Type' @ [51:68] ==> val arg0Type: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'v' @ [52:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'visitInsn' @ [52:15] ==> public open fun visitInsn(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'returnType' @ [52:25] ==> val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'getOpcode' @ [52:36] ==> public open fun getOpcode(p0: Int): Int defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'opcode' @ [52:46] ==> private final val opcode: Int defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp[PropertyDescriptorImpl]

'coerce' @ [53:24] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'intermediateResultType' @ [53:31] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'returnType' @ [53:55] ==> val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable[LocalVariableDescriptor]

'v' @ [53:67] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.BinaryOp.toCallable.<anonymous>[ValueParameterDescriptorImpl]

