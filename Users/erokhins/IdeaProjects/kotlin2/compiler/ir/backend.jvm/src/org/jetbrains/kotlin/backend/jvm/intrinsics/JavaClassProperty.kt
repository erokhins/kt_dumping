'IntrinsicMethod' @ [35:28] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'IrIntrinsicFunction' @ [38:24] ==> public constructor IrIntrinsicFunction(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[ClassConstructorDescriptorImpl]

'expression' @ [38:44] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable[ValueParameterDescriptorImpl]

'signature' @ [38:56] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable[ValueParameterDescriptorImpl]

'context' @ [38:67] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable[ValueParameterDescriptorImpl]

'codegen' @ [41:29] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'gen' @ [41:37] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'expression' @ [41:41] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable[ValueParameterDescriptorImpl]

'extensionReceiver' @ [41:52] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'data' @ [41:73] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'value' @ [42:28] ==> val value: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'type' @ [42:34] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'if (isPrimitive(type)) {
                    AsmUtil.pop(v, type)
                    v.getstatic(boxType(type).internalName, "TYPE", "Ljava/lang/Class;")
                }
                else {
                    v.invokevirtual("java/lang/Object", "getClass", "()Ljava/lang/Class;", false)
                }' @ [43:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isPrimitive' @ [43:21] ==> public open fun isPrimitive(p0: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [43:33] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'pop' @ [44:29] ==> public open fun pop(@NotNull p0: MethodVisitor, @NotNull p1: Type): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [44:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'type' @ [44:36] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'v' @ [45:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'getstatic' @ [45:23] ==> public open fun getstatic(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'boxType' @ [45:33] ==> @NotNull public open fun boxType(@NotNull p0: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'type' @ [45:41] ==> val type: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'internalName' @ [45:47] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'v' @ [48:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'invokevirtual' @ [48:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'with' @ [51:24] ==> @InlineOnly public inline fun <T, R> with(receiver: ExpressionCodegen, block: ExpressionCodegen.() -> StackValue): StackValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpressionCodegen
    <R> -> StackValue

'codegen' @ [51:29] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'expression' @ [52:21] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.JavaClassProperty.toCallable[ValueParameterDescriptorImpl]

'onStack' @ [52:32] ==> public final val IrExpression.onStack: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

