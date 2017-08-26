'FunctionIntrinsic' @ [34:83] ==> public constructor FunctionIntrinsic() defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.basic.FunctionIntrinsic[ClassConstructorDescriptorImpl]

'callInfo' @ [36:28] ==> value-parameter callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [36:37] ==> public abstract val dispatchReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'callInfo' @ [36:57] ==> value-parameter callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'extensionReceiver' @ [36:66] ==> public abstract val extensionReceiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'context' @ [37:29] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'bindingContext' @ [37:37] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getType' @ [37:54] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'callInfo' @ [37:62] ==> value-parameter callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'resolvedCall' @ [37:71] ==> public abstract val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'call' @ [37:84] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'valueArguments' @ [37:89] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'getArgumentExpression' @ [37:107] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'callInfo' @ [38:32] ==> value-parameter callInfo: CallInfo defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'resolvedCall' @ [38:41] ==> public abstract val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.js.translate.callTranslator.CallInfo[PropertyDescriptorImpl]

'resultingDescriptor' @ [38:54] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'valueParameters' @ [38:74] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'type' @ [38:93] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'isNullableType' @ [39:47] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'rightType' @ [39:62] ==> val rightType: KotlinType defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[LocalVariableDescriptor]

'!' @ [40:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'leftTypeNullable' @ [40:34] ==> private final val leftTypeNullable: Boolean defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic[PropertyDescriptorImpl]

'!' @ [40:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'rightTypeNullable' @ [40:55] ==> val rightTypeNullable: Boolean defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[LocalVariableDescriptor]

'when {
                KotlinBuiltIns.isChar(rightType) -> {
                    JsAstUtils.charToString(arguments[0])
                }
                KotlinBuiltIns.isStringOrNullableString(rightType) && hasNonNullArg -> {
                    arguments[0]
                }
                else -> {
                    TopLevelFIF.TO_STRING.apply(arguments[0], listOf(), context)
                }
            }' @ [41:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'isChar' @ [42:32] ==> public open fun isChar(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'rightType' @ [42:39] ==> val rightType: KotlinType defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[LocalVariableDescriptor]

'charToString' @ [43:32] ==> @NotNull public open fun charToString(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'arguments' @ [43:45] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'isStringOrNullableString' @ [45:32] ==> public open fun isStringOrNullableString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'rightType' @ [45:57] ==> val rightType: KotlinType defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[LocalVariableDescriptor]

'hasNonNullArg' @ [45:71] ==> val hasNonNullArg: Boolean defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[LocalVariableDescriptor]

'arguments' @ [46:21] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'TO_STRING' @ [49:33] ==> @NotNull public final val TO_STRING: KotlinFunctionIntrinsic defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.TopLevelFIF[JavaPropertyDescriptor]

'apply' @ [49:43] ==> @NotNull @Override public open fun apply(@Nullable receiver: JsExpression?, @NotNull arguments: List<JsExpression>, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.KotlinFunctionIntrinsic[JavaMethodDescriptor]

'arguments' @ [49:49] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'listOf' @ [49:63] ==> @InlineOnly public inline fun <T> listOf(): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'context' @ [49:73] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[ValueParameterDescriptorImpl]

'JsBinaryOperation' @ [53:20] ==> public constructor JsBinaryOperation(@NotNull p0: JsBinaryOperator, @Nullable p1: JsExpression?, @Nullable p2: JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaClassConstructorDescriptor]

'ADD' @ [53:55] ==> enum entry ADD defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'receiver' @ [53:60] ==> val receiver: JsExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[LocalVariableDescriptor]

'rightExpr' @ [53:70] ==> val rightExpr: JsExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic.apply[LocalVariableDescriptor]

'descriptor' @ [58:22] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.getIntrinsic[ValueParameterDescriptorImpl]

'fqNameUnsafe' @ [58:33] ==> public val DeclarationDescriptor.fqNameUnsafe: FqNameUnsafe defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [58:46] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'fqName' @ [59:13] ==> val fqName: String defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.getIntrinsic[LocalVariableDescriptor]

'fqName' @ [59:47] ==> val fqName: String defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.getIntrinsic[LocalVariableDescriptor]

'descriptor' @ [61:25] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.getIntrinsic[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [61:36] ==> public final val FunctionDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'descriptor' @ [61:65] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.getIntrinsic[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [61:76] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [61:119] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'if (KotlinBuiltIns.isStringOrNullableString(leftType)) {
            StringPlusAnyIntrinsic(TypeUtils.isNullableType(leftType))
        }
        else {
            null
        }' @ [63:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionIntrinsic?, elseBranch: FunctionIntrinsic?): FunctionIntrinsic?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionIntrinsic?

'isStringOrNullableString' @ [63:35] ==> public open fun isStringOrNullableString(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'leftType' @ [63:60] ==> val leftType: KotlinType defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.getIntrinsic[LocalVariableDescriptor]

'StringPlusAnyIntrinsic' @ [64:13] ==> public constructor StringPlusAnyIntrinsic(leftTypeNullable: Boolean) defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.StringPlusAnyIntrinsic[ClassConstructorDescriptorImpl]

'isNullableType' @ [64:46] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'leftType' @ [64:61] ==> val leftType: KotlinType defined in org.jetbrains.kotlin.js.translate.intrinsic.operation.StringPlusCharFIF.getIntrinsic[LocalVariableDescriptor]

