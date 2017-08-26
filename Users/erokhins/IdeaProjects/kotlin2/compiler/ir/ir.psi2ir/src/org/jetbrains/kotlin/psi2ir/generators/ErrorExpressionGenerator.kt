'StatementGeneratorExtension' @ [27:74] ==> public constructor StatementGeneratorExtension(statementGenerator: StatementGenerator) defined in org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension[ClassConstructorDescriptorImpl]

'statementGenerator' @ [27:102] ==> value-parameter statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'context' @ [28:47] ==> public open val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[PropertyDescriptorImpl]

'configuration' @ [28:55] ==> public final val configuration: Psi2IrConfiguration defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorContext[PropertyDescriptorImpl]

'ignoreErrors' @ [28:69] ==> public final val ignoreErrors: Boolean defined in org.jetbrains.kotlin.psi2ir.Psi2IrConfiguration[PropertyDescriptorImpl]

'if (ignoreErrors)
                body()
            else
                throw RuntimeException("${e?.message}: ${ktElement::class.java.simpleName}:\n${ktElement.text}", e)' @ [31:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression, elseBranch: IrExpression): IrExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression

'ignoreErrors' @ [31:17] ==> private final val ignoreErrors: Boolean defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[PropertyDescriptorImpl]

'invoke' @ [32:17] ==> public abstract operator fun invoke(): IrExpression defined in kotlin.Function0[FunctionInvokeDescriptor]

'RuntimeException' @ [34:23] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'e' @ [34:43] ==> value-parameter e: Exception? /* = Exception? */ = ... defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'message' @ [34:46] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'ktElement' @ [34:58] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'java' @ [34:75] ==> public val <T> KClass<out KtElement>.java: Class<out KtElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtElement

'simpleName' @ [34:80] ==> public final val <T : (Any..Any?)> Class<out KtElement>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtElement

'ktElement' @ [34:96] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'text' @ [34:106] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'e' @ [34:114] ==> value-parameter e: Exception? /* = Exception? */ = ... defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'generateErrorExpression' @ [37:13] ==> private final inline fun generateErrorExpression(ktElement: KtElement, e: Exception? /* = Exception? */ = ..., body: () -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktElement' @ [37:37] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'e' @ [37:48] ==> value-parameter e: Exception /* = Exception */ defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'IrErrorExpressionImpl' @ [38:17] ==> public constructor IrErrorExpressionImpl(startOffset: Int, endOffset: Int, type: KotlinType, description: String) defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorExpressionImpl[DeserializedClassConstructorDescriptor]

'ktElement' @ [38:39] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'startOffset' @ [38:49] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktElement' @ [38:62] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'endOffset' @ [38:72] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'if (ktElement is KtExpression) getErrorExpressionType(ktElement) else ErrorUtils.createErrorType("")' @ [39:75] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'ktElement' @ [39:79] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'getErrorExpressionType' @ [39:106] ==> private final fun getErrorExpressionType(ktExpression: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktElement' @ [39:129] ==> value-parameter ktElement: KtElement defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'createErrorType' @ [39:156] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'e' @ [40:75] ==> value-parameter e: Exception /* = Exception */ defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorExpression[ValueParameterDescriptorImpl]

'message' @ [40:77] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'generateErrorExpression' @ [43:69] ==> private final inline fun generateErrorExpression(ktElement: KtElement, e: Exception? /* = Exception? */ = ..., body: () -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktCall' @ [43:93] ==> value-parameter ktCall: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall[ValueParameterDescriptorImpl]

'getErrorExpressionType' @ [44:20] ==> private final fun getErrorExpressionType(ktExpression: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktCall' @ [44:43] ==> value-parameter ktCall: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall[ValueParameterDescriptorImpl]

'IrErrorCallExpressionImpl' @ [46:27] ==> public constructor IrErrorCallExpressionImpl(startOffset: Int, endOffset: Int, type: KotlinType, description: String) defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[DeserializedClassConstructorDescriptor]

'ktCall' @ [46:53] ==> value-parameter ktCall: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall[ValueParameterDescriptorImpl]

'startOffset' @ [46:60] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktCall' @ [46:73] ==> value-parameter ktCall: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall[ValueParameterDescriptorImpl]

'endOffset' @ [46:80] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'type' @ [46:91] ==> val type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>[LocalVariableDescriptor]

'irErrorCall' @ [47:9] ==> val irErrorCall: IrErrorCallExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>[LocalVariableDescriptor]

'explicitReceiver' @ [47:21] ==> public open var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[DeserializedPropertyDescriptor]

'ktCall' @ [47:41] ==> value-parameter ktCall: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall[ValueParameterDescriptorImpl]

'parent' @ [47:48] ==> public final val KtCallExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [47:86] ==> @InlineOnly public inline fun <T, R> KtDotQualifiedExpression.let(block: (KtDotQualifiedExpression) -> IrExpression): IrExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression
    <R> -> IrExpression

'statementGenerator' @ [48:13] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [48:32] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [48:51] ==> value-parameter it: KtDotQualifiedExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [48:54] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'ktCall' @ [51:9] ==> value-parameter ktCall: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall[ValueParameterDescriptorImpl]

'valueArguments' @ [51:16] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'forEach' @ [51:31] ==> @HidesMembers public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.forEach(action: ((KtValueArgument..KtValueArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [52:30] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [52:33] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'ktArgument' @ [53:17] ==> val ktArgument: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'irErrorCall' @ [54:17] ==> val irErrorCall: IrErrorCallExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [54:29] ==> public final fun addArgument(argument: IrExpression): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[DeserializedSimpleFunctionDescriptor]

'statementGenerator' @ [54:41] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [54:60] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktArgument' @ [54:79] ==> val ktArgument: KtExpression? defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ktCall' @ [58:9] ==> value-parameter ktCall: KtCallExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall[ValueParameterDescriptorImpl]

'lambdaArguments' @ [58:16] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'forEach' @ [58:32] ==> @HidesMembers public inline fun <T> Iterable<(KtLambdaArgument..KtLambdaArgument?)>.forEach(action: ((KtLambdaArgument..KtLambdaArgument?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'irErrorCall' @ [59:13] ==> val irErrorCall: IrErrorCallExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>[LocalVariableDescriptor]

'addArgument' @ [59:25] ==> public final fun addArgument(argument: IrExpression): Unit defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[DeserializedSimpleFunctionDescriptor]

'statementGenerator' @ [59:37] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [59:56] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'it' @ [59:75] ==> value-parameter it: (KtLambdaArgument..KtLambdaArgument?) defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [59:78] ==> public open fun getArgumentExpression(): KtExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'irErrorCall' @ [62:9] ==> val irErrorCall: IrErrorCallExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorCall.<anonymous>[LocalVariableDescriptor]

'getInferredTypeWithImplicitCasts' @ [66:13] ==> public fun Generator.getInferredTypeWithImplicitCasts(key: KtExpression): KotlinType? defined in org.jetbrains.kotlin.psi2ir.generators in file Generator.kt[SimpleFunctionDescriptorImpl]

'ktExpression' @ [66:46] ==> value-parameter ktExpression: KtExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.getErrorExpressionType[ValueParameterDescriptorImpl]

'createErrorType' @ [66:74] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'generateErrorExpression' @ [68:81] ==> private final inline fun generateErrorExpression(ktElement: KtElement, e: Exception? /* = Exception? */ = ..., body: () -> IrExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktName' @ [68:105] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName[ValueParameterDescriptorImpl]

'getErrorExpressionType' @ [69:20] ==> private final fun getErrorExpressionType(ktExpression: KtExpression): KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[SimpleFunctionDescriptorImpl]

'ktName' @ [69:43] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName[ValueParameterDescriptorImpl]

'IrErrorCallExpressionImpl' @ [71:27] ==> public constructor IrErrorCallExpressionImpl(startOffset: Int, endOffset: Int, type: KotlinType, description: String) defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[DeserializedClassConstructorDescriptor]

'ktName' @ [71:53] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName[ValueParameterDescriptorImpl]

'startOffset' @ [71:60] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ktName' @ [71:73] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName[ValueParameterDescriptorImpl]

'endOffset' @ [71:80] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'type' @ [71:91] ==> val type: KotlinType defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName.<anonymous>[LocalVariableDescriptor]

'irErrorCall' @ [72:9] ==> val irErrorCall: IrErrorCallExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName.<anonymous>[LocalVariableDescriptor]

'explicitReceiver' @ [72:21] ==> public open var explicitReceiver: IrExpression? defined in org.jetbrains.kotlin.ir.expressions.impl.IrErrorCallExpressionImpl[DeserializedPropertyDescriptor]

'ktName' @ [72:41] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName[ValueParameterDescriptorImpl]

'parent' @ [72:48] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [72:86] ==> @InlineOnly public inline fun <T, R> KtDotQualifiedExpression.let(block: (KtDotQualifiedExpression) -> IrExpression?): IrExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression
    <R> -> IrExpression?

'if (ktParent.receiverExpression == ktName) null
            else statementGenerator.generateExpression(ktParent.receiverExpression)' @ [73:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IrExpression?, elseBranch: IrExpression?): IrExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IrExpression?

'ktParent' @ [73:17] ==> value-parameter ktParent: KtDotQualifiedExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [73:26] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'ktName' @ [73:48] ==> value-parameter ktName: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName[ValueParameterDescriptorImpl]

'statementGenerator' @ [74:18] ==> public final val statementGenerator: StatementGenerator defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator[PropertyDescriptorImpl]

'generateExpression' @ [74:37] ==> public final fun generateExpression(ktExpression: KtExpression): IrExpression defined in org.jetbrains.kotlin.psi2ir.generators.StatementGenerator[SimpleFunctionDescriptorImpl]

'ktParent' @ [74:56] ==> value-parameter ktParent: KtDotQualifiedExpression defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [74:65] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'irErrorCall' @ [77:9] ==> val irErrorCall: IrErrorCallExpressionImpl defined in org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName.<anonymous>[LocalVariableDescriptor]

