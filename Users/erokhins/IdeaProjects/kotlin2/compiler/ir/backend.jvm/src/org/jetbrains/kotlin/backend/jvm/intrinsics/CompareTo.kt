'IntrinsicMethod' @ [37:19] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'when (type) {
            Type.INT_TYPE -> v.invokestatic(IntrinsicMethods.INTRINSICS_CLASS_NAME, "compare", "(II)I", false)
            Type.LONG_TYPE -> v.invokestatic(IntrinsicMethods.INTRINSICS_CLASS_NAME, "compare", "(JJ)I", false)
            Type.FLOAT_TYPE -> v.invokestatic("java/lang/Float", "compare", "(FF)I", false)
            Type.DOUBLE_TYPE -> v.invokestatic("java/lang/Double", "compare", "(DD)I", false)
            else -> throw UnsupportedOperationException()
        }' @ [39:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'type' @ [39:15] ==> value-parameter type: Type? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'INT_TYPE' @ [40:18] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [40:30] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [40:32] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INTRINSICS_CLASS_NAME' @ [40:62] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'LONG_TYPE' @ [41:18] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [41:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [41:33] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INTRINSICS_CLASS_NAME' @ [41:63] ==> public const final val INTRINSICS_CLASS_NAME: String defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethods[JavaPropertyDescriptor]

'FLOAT_TYPE' @ [42:18] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [42:32] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [42:34] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'DOUBLE_TYPE' @ [43:18] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [43:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.genInvoke[ValueParameterDescriptorImpl]

'invokestatic' @ [43:35] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'UnsupportedOperationException' @ [44:27] ==> public constructor UnsupportedOperationException() defined in java.lang.UnsupportedOperationException[JavaClassConstructorDescriptor]

'comparisonOperandType' @ [49:29] ==> public open fun comparisonOperandType(p0: (Type..Type?), p1: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'expressionType' @ [50:17] ==> public final fun expressionType(expression: IrExpression, context: JvmBackendContext): Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [50:32] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [50:43] ==> public abstract var dispatchReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'expression' @ [50:63] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'extensionReceiver' @ [50:74] ==> public abstract var extensionReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'context' @ [50:95] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'signature' @ [51:17] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'valueParameters' @ [51:27] ==> public final val JvmMethodSignature.valueParameters: (MutableList<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>..List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>)[MyPropertyDescriptor]

'single' @ [51:43] ==> public fun <T> List<(JvmMethodParameterSignature..JvmMethodParameterSignature?)>.single(): (JvmMethodParameterSignature..JvmMethodParameterSignature?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature..org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodParameterSignature?)

'asmType' @ [51:52] ==> public final val JvmMethodParameterSignature.asmType: Type[MyPropertyDescriptor]

'IrIntrinsicFunction' @ [53:16] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[FakeCallableDescriptorForObject]

'create' @ [53:36] ==> public final fun create(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ..., invokeInstuction: IrIntrinsicFunction.(InstructionAdapter) -> Unit): IrIntrinsicFunction defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [53:43] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'signature' @ [53:55] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'context' @ [53:66] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[ValueParameterDescriptorImpl]

'listOf' @ [53:75] ==> public fun <T> listOf(vararg elements: (Type..Type?)): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'parameterType' @ [53:82] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[LocalVariableDescriptor]

'parameterType' @ [53:97] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[LocalVariableDescriptor]

'genInvoke' @ [54:13] ==> private final fun genInvoke(type: Type?, v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo[SimpleFunctionDescriptorImpl]

'parameterType' @ [54:23] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable[LocalVariableDescriptor]

'it' @ [54:38] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.CompareTo.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'IntrinsicMethod' @ [60:21] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'assert' @ [62:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expression' @ [62:16] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[ValueParameterDescriptorImpl]

'expression' @ [63:27] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[ValueParameterDescriptorImpl]

'getValueArgument' @ [63:38] ==> public abstract fun getValueArgument(index: Int): IrExpression? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedSimpleFunctionDescriptor]

'compareCall' @ [64:20] ==> val compareCall: IrCall defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'receiverAndArgs' @ [64:32] ==> public fun IrMemberAccessExpression.receiverAndArgs(): List<IrExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics[SimpleFunctionDescriptorImpl]

'args' @ [65:24] ==> val args: List<IrExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'asmTypes' @ [65:29] ==> public fun List<IrExpression>.asmTypes(context: JvmBackendContext): List<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics[SimpleFunctionDescriptorImpl]

'context' @ [65:38] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[ValueParameterDescriptorImpl]

'argTypes' @ [66:24] ==> val argTypes: List<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'argTypes' @ [67:25] ==> val argTypes: List<Type> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'comparisonOperandType' @ [68:29] ==> public open fun comparisonOperandType(p0: (Type..Type?), p1: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [68:51] ==> val leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'rightType' @ [68:61] ==> val rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'context' @ [70:28] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[ValueParameterDescriptorImpl]

'state' @ [70:36] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'typeMapper' @ [70:42] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapSignatureSkipGeneric' @ [70:53] ==> @NotNull public open fun mapSignatureSkipGeneric(@NotNull p0: FunctionDescriptor, @NotNull p1: OwnerKind): JvmMethodSignature defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'compareCall' @ [70:77] ==> val compareCall: IrCall defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'descriptor' @ [70:89] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'OwnerKind' @ [70:101] ==> public companion object defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'IMPLEMENTATION' @ [70:111] ==> enum entry IMPLEMENTATION defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'IrIntrinsicFunction' @ [71:25] ==> public constructor IrIntrinsicFunction(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, argsTypes: List<Type> = ...) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[ClassConstructorDescriptorImpl]

'compareCall' @ [71:45] ==> val compareCall: IrCall defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'newSignature' @ [71:58] ==> val newSignature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'context' @ [71:72] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[ValueParameterDescriptorImpl]

'listOf' @ [71:81] ==> public fun <T> listOf(vararg elements: (Type..Type?)): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.Type..org.jetbrains.org.objectweb.asm.Type?)

'parameterType' @ [71:88] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'parameterType' @ [71:103] ==> val parameterType: (Type..Type?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'codegen' @ [73:44] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'intrinsics' @ [73:52] ==> public final val intrinsics: IrIntrinsicMethods defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'intrinsics' @ [73:63] ==> public final val intrinsics: IntrinsicMethods defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicMethods[PropertyDescriptorImpl]

'getIntrinsic' @ [73:74] ==> @Nullable public open fun getIntrinsic(@NotNull descriptor: CallableMemberDescriptor): IntrinsicMethod? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethods[JavaMethodDescriptor]

'compareCall' @ [73:87] ==> val compareCall: IrCall defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'descriptor' @ [73:99] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrCall[DeserializedPropertyDescriptor]

'if (isPrimitive(leftType) && isPrimitive(rightType) && isPrimitiveIntrinsic) {
                    operationType = comparisonOperandType(leftType, rightType)
                    leftValue = codegen.gen(args[0], operationType, data)
                    rightValue = codegen.gen(args[1], operationType,data)
                }
                else {
                    operationType = Type.INT_TYPE
                    leftValue = codegen.gen(compareCall, data)
                    rightValue = StackValue.constant(0, operationType)
                }' @ [77:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isPrimitive' @ [77:21] ==> public open fun isPrimitive(p0: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [77:33] ==> val leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'isPrimitive' @ [77:46] ==> public open fun isPrimitive(p0: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'rightType' @ [77:58] ==> val rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'isPrimitiveIntrinsic' @ [77:72] ==> val isPrimitiveIntrinsic: Boolean defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'operationType' @ [78:21] ==> val operationType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'comparisonOperandType' @ [78:37] ==> public open fun comparisonOperandType(p0: (Type..Type?), p1: (Type..Type?)): (Type..Type?) defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'leftType' @ [78:59] ==> val leftType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'rightType' @ [78:69] ==> val rightType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'leftValue' @ [79:21] ==> val leftValue: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'codegen' @ [79:33] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'gen' @ [79:41] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'args' @ [79:45] ==> val args: List<IrExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'operationType' @ [79:54] ==> val operationType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'data' @ [79:69] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'rightValue' @ [80:21] ==> val rightValue: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'codegen' @ [80:34] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'gen' @ [80:42] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'args' @ [80:46] ==> val args: List<IrExpression> defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'operationType' @ [80:55] ==> val operationType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'data' @ [80:69] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'operationType' @ [83:21] ==> val operationType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'INT_TYPE' @ [83:42] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'leftValue' @ [84:21] ==> val leftValue: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'codegen' @ [84:33] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'gen' @ [84:41] ==> public final fun gen(expression: IrElement, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'compareCall' @ [84:45] ==> val compareCall: IrCall defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[LocalVariableDescriptor]

'data' @ [84:58] ==> value-parameter data: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'rightValue' @ [85:21] ==> val rightValue: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'constant' @ [85:45] ==> @NotNull public open fun constant(@Nullable p0: Any?, @NotNull p1: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'operationType' @ [85:57] ==> val operationType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'expression' @ [87:30] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable[ValueParameterDescriptorImpl]

'origin' @ [87:41] ==> public abstract val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'when (origin) {
                    IrStatementOrigin.GT -> KtTokens.GT
                    IrStatementOrigin.GTEQ -> KtTokens.GTEQ
                    IrStatementOrigin.LT -> KtTokens.LT
                    IrStatementOrigin.LTEQ -> KtTokens.LTEQ
                    else -> TODO()
                }' @ [88:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (KtSingleValueToken..KtSingleValueToken?), entry1: (KtSingleValueToken..KtSingleValueToken?), entry2: (KtSingleValueToken..KtSingleValueToken?), entry3: (KtSingleValueToken..KtSingleValueToken?), entry4: (KtSingleValueToken..KtSingleValueToken?)): (KtSingleValueToken..KtSingleValueToken?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'origin' @ [88:35] ==> val origin: IrStatementOrigin? defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'GT' @ [89:39] ==> public object GT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'GT' @ [89:54] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [90:39] ==> public object GTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'GTEQ' @ [90:56] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [91:39] ==> public object LT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'LT' @ [91:54] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [92:39] ==> public object LTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'LTEQ' @ [92:56] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'TODO' @ [93:29] ==> @InlineOnly public inline fun TODO(): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'cmp' @ [95:28] ==> @NotNull public open fun cmp(@NotNull p0: IElementType, @NotNull p1: Type, p2: (StackValue..StackValue?), p3: (StackValue..StackValue?)): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'token' @ [95:32] ==> val token: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'operationType' @ [95:39] ==> val operationType: Type defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'leftValue' @ [95:54] ==> val leftValue: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'rightValue' @ [95:65] ==> val rightValue: StackValue defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[LocalVariableDescriptor]

'put' @ [95:77] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [95:86] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'v' @ [95:100] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrCompareTo.toCallable.<no name provided>.invoke[ValueParameterDescriptorImpl]

'onStack' @ [96:35] ==> @NotNull public open fun onStack(@NotNull p0: Type): StackValue defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'BOOLEAN_TYPE' @ [96:48] ==> public final val BOOLEAN_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

