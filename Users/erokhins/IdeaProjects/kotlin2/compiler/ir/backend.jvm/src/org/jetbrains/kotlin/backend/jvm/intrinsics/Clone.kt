'IntrinsicMethod' @ [26:15] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'IrIntrinsicFunction' @ [29:16] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[FakeCallableDescriptorForObject]

'create' @ [29:36] ==> public final fun create(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ..., invokeInstuction: IrIntrinsicFunction.(InstructionAdapter) -> Unit): IrIntrinsicFunction defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [29:43] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Clone.toCallable[ValueParameterDescriptorImpl]

'signature' @ [29:55] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Clone.toCallable[ValueParameterDescriptorImpl]

'newReturnType' @ [29:65] ==> public final fun JvmMethodSignature.newReturnType(type: Type): JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod.Companion[SimpleFunctionDescriptorImpl]

'OBJECT_TYPE' @ [29:88] ==> public final val OBJECT_TYPE: (Type..Type?) defined in org.jetbrains.kotlin.resolve.jvm.AsmTypes[JavaPropertyDescriptor]

'context' @ [29:102] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Clone.toCallable[ValueParameterDescriptorImpl]

'if (expression is IrCall && expression.superQualifier != null) Opcodes.INVOKESPECIAL else Opcodes.INVOKEVIRTUAL' @ [30:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'expression' @ [30:30] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Clone.toCallable[ValueParameterDescriptorImpl]

'expression' @ [30:54] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Clone.toCallable[ValueParameterDescriptorImpl]

'superQualifier' @ [30:65] ==> public abstract val superQualifier: ClassDescriptor? defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'INVOKESPECIAL' @ [30:97] ==> public const final val INVOKESPECIAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'INVOKEVIRTUAL' @ [30:124] ==> public const final val INVOKEVIRTUAL: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'it' @ [31:13] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Clone.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'visitMethodInsn' @ [31:16] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'opcode' @ [31:32] ==> val opcode: Int defined in org.jetbrains.kotlin.backend.jvm.intrinsics.Clone.toCallable.<anonymous>[LocalVariableDescriptor]

