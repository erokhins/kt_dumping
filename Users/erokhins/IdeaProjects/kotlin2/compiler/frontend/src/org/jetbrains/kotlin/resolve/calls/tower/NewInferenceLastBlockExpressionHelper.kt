'hashMapOf' @ [37:89] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtReturnExpression, ExpressionTypingContext> /* = HashMap<KtReturnExpression, ExpressionTypingContext> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtReturnExpression
    <V> -> ExpressionTypingContext

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'USE_NEW_INFERENCE' @ [48:14] ==> public val USE_NEW_INFERENCE: Boolean defined in org.jetbrains.kotlin.resolve.calls[DeserializedPropertyDescriptor]

'getAdditionalBlockInfo' @ [50:35] ==> private final fun getAdditionalBlockInfo(context: ExpressionTypingContext, statementExpression: KtExpression): NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper[SimpleFunctionDescriptorImpl]

'context' @ [50:58] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'statementExpression' @ [50:67] ==> value-parameter statementExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'extractArgumentExpression' @ [51:34] ==> public fun extractArgumentExpression(outerCallContext: ResolutionContext<*>, expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower in file NewInferenceLastBlockExpressionHelper.kt[SimpleFunctionDescriptorImpl]

'context' @ [51:60] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'statementExpression' @ [51:69] ==> value-parameter statementExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'additionalBlockInfo' @ [53:9] ==> val additionalBlockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[LocalVariableDescriptor]

'lastExpression' @ [53:29] ==> public final var lastExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'argumentExpression' @ [53:46] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[LocalVariableDescriptor]

'additionalBlockInfo' @ [54:9] ==> val additionalBlockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[LocalVariableDescriptor]

'lastExpressionContext' @ [54:29] ==> public final var lastExpressionContext: ExpressionTypingContext? defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'context' @ [54:53] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'when (argumentExpression) {
            is KtLambdaExpression,
            is KtNamedFunction,
            is KtCollectionLiteralExpression -> return noTypeInfo(context)
            is KtCallableReferenceExpression -> {
                val lhsResult = doubleColonExpressionResolver.resolveDoubleColonLHS(argumentExpression, context)
                val newDataFlowInfo = lhsResult.safeAs<DoubleColonLHS.Expression>()?.dataFlowInfo ?: context.dataFlowInfo
                return noTypeInfo(newDataFlowInfo)
            }
            else -> return null
        }' @ [56:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'argumentExpression' @ [56:15] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[LocalVariableDescriptor]

'noTypeInfo' @ [59:56] ==> public fun noTypeInfo(context: ResolutionContext<*>): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'context' @ [59:67] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'doubleColonExpressionResolver' @ [61:33] ==> private final val doubleColonExpressionResolver: DoubleColonExpressionResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper[PropertyDescriptorImpl]

'resolveDoubleColonLHS' @ [61:63] ==> internal final fun resolveDoubleColonLHS(doubleColonExpression: KtDoubleColonExpression, c: ExpressionTypingContext): DoubleColonLHS? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [61:85] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[LocalVariableDescriptor]

'context' @ [61:105] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'lhsResult' @ [62:39] ==> val lhsResult: DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[LocalVariableDescriptor]

'safeAs' @ [62:49] ==> public inline fun <reified T : Any> Any?.safeAs(): DoubleColonLHS.Expression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Expression

'dataFlowInfo' @ [62:86] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.DoubleColonLHS.Expression[PropertyDescriptorImpl]

'context' @ [62:102] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [62:110] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'noTypeInfo' @ [63:24] ==> public fun noTypeInfo(dataFlowInfo: DataFlowInfo): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.typeInfoFactory in file TypeInfoFactory.kt[SimpleFunctionDescriptorImpl]

'newDataFlowInfo' @ [63:35] ==> val newDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processLastExpressionInBlock[LocalVariableDescriptor]

'labelTargetElement' @ [75:31] ==> value-parameter labelTargetElement: KtElement? defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processReturnExpression[ValueParameterDescriptorImpl]

'safeAs' @ [75:50] ==> public inline fun <reified T : Any> Any?.safeAs(): KtFunction? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtFunction

'bodyExpression' @ [75:72] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'safeAs' @ [75:87] ==> public inline fun <reified T : Any> Any?.safeAs(): KtBlockExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtBlockExpression

'context' @ [76:25] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processReturnExpression[ValueParameterDescriptorImpl]

'trace' @ [76:33] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'NEW_INFERENCE_BLOCK_INFO' @ [76:54] ==> public final val NEW_INFERENCE_BLOCK_INFO: (WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>..WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'blockExpression' @ [76:80] ==> val blockExpression: KtBlockExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processReturnExpression[LocalVariableDescriptor]

'blockInfo' @ [79:9] ==> val blockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processReturnExpression[LocalVariableDescriptor]

'returnStatements' @ [79:19] ==> public final val returnStatements: MutableMap<KtReturnExpression, ExpressionTypingContext> defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'put' @ [79:36] ==> public abstract fun put(key: KtReturnExpression, value: ExpressionTypingContext): ExpressionTypingContext? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'returnExpression' @ [79:40] ==> value-parameter returnExpression: KtReturnExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processReturnExpression[ValueParameterDescriptorImpl]

'context' @ [79:58] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.processReturnExpression[ValueParameterDescriptorImpl]

'statementExpression' @ [87:31] ==> value-parameter statementExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.getAdditionalBlockInfo[ValueParameterDescriptorImpl]

'parent' @ [87:51] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'safeAs' @ [87:58] ==> public inline fun <reified T : Any> Any?.safeAs(): KtBlockExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtBlockExpression

'context' @ [88:16] ==> value-parameter context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.getAdditionalBlockInfo[ValueParameterDescriptorImpl]

'trace' @ [88:24] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'get' @ [88:30] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>..ReadOnlySlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>?), key: (KtBlockExpression..KtBlockExpression?)): NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtBlockExpression
    <V : (Any..Any?)> -> AdditionalBlockInfo

'NEW_INFERENCE_BLOCK_INFO' @ [88:49] ==> public final val NEW_INFERENCE_BLOCK_INFO: (WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>..WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'blockExpression' @ [88:75] ==> val blockExpression: KtBlockExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.getAdditionalBlockInfo[LocalVariableDescriptor]

'AdditionalBlockInfo' @ [92:122] ==> public constructor AdditionalBlockInfo() defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[ClassConstructorDescriptorImpl]

'also' @ [92:144] ==> @InlineOnly @SinceKotlin public inline fun <T> NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo.also(block: (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo) -> Unit): NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalBlockInfo

'trace' @ [93:5] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.initializeBlockInfo[ValueParameterDescriptorImpl]

'record' @ [93:11] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>..WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>?), key: (KtBlockExpression..KtBlockExpression?), value: (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtBlockExpression
    <V : (Any..Any?)> -> AdditionalBlockInfo

'NEW_INFERENCE_BLOCK_INFO' @ [93:33] ==> public final val NEW_INFERENCE_BLOCK_INFO: (WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>..WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'blockExpression' @ [93:59] ==> value-parameter blockExpression: KtBlockExpression defined in org.jetbrains.kotlin.resolve.calls.tower.initializeBlockInfo[ValueParameterDescriptorImpl]

'it' @ [93:76] ==> value-parameter it: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.initializeBlockInfo.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [97:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'USE_NEW_INFERENCE' @ [97:10] ==> public val USE_NEW_INFERENCE: Boolean defined in org.jetbrains.kotlin.resolve.calls[DeserializedPropertyDescriptor]

'functionLiteral' @ [98:19] ==> value-parameter functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.resolve.calls.tower.isLambdaUnderNewInferenceResolution[ValueParameterDescriptorImpl]

'bodyExpression' @ [98:35] ==> public final val KtFunctionLiteral.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'context' @ [99:12] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.calls.tower.isLambdaUnderNewInferenceResolution[ValueParameterDescriptorImpl]

'NEW_INFERENCE_BLOCK_INFO' @ [99:35] ==> public final val NEW_INFERENCE_BLOCK_INFO: (WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>..WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktBlock' @ [99:61] ==> val ktBlock: KtBlockExpression defined in org.jetbrains.kotlin.resolve.calls.tower.isLambdaUnderNewInferenceResolution[LocalVariableDescriptor]

'expression' @ [103:9] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[ValueParameterDescriptorImpl]

'?:' @ [105:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression?

'getFunctionLiteralArgumentIfAny' @ [105:45] ==> @Nullable public open fun getFunctionLiteralArgumentIfAny(@NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KtFunction? defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'expression' @ [105:77] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[ValueParameterDescriptorImpl]

'outerCallContext' @ [105:89] ==> value-parameter outerCallContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[ValueParameterDescriptorImpl]

'getCallableReferenceExpressionIfAny' @ [106:45] ==> @Nullable public open fun getCallableReferenceExpressionIfAny(@NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'expression' @ [106:81] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[ValueParameterDescriptorImpl]

'outerCallContext' @ [106:93] ==> value-parameter outerCallContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[ValueParameterDescriptorImpl]

'deparenthesize' @ [107:34] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [107:49] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[ValueParameterDescriptorImpl]

'when (ktExpression) {
        is KtFunctionLiteral -> ktExpression.getParentOfType<KtLambdaExpression>(true)
        else -> ktExpression
    }' @ [109:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'ktExpression' @ [109:18] ==> val ktExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[LocalVariableDescriptor]

'ktExpression' @ [110:33] ==> val ktExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[LocalVariableDescriptor]

'getParentOfType' @ [110:46] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtLambdaExpression? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtLambdaExpression

'ktExpression' @ [111:17] ==> val ktExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.extractArgumentExpression[LocalVariableDescriptor]

