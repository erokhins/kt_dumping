'CallCheckerContext' @ [58:38] ==> public constructor CallCheckerContext(c: ResolutionContext<*>, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[ClassConstructorDescriptorImpl]

'topLevelCallContext' @ [58:57] ==> private final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'languageVersionSettings' @ [58:78] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.<init>[ValueParameterDescriptorImpl]

'when (resolvedAtom) {
            is ResolvedCollectionLiteralAtom -> completeCollectionLiteralCalls(resolvedAtom)
            is ResolvedCallableReferenceAtom -> completeCallableReference(resolvedAtom)
            is ResolvedLambdaAtom -> completeLambda(resolvedAtom)
            is ResolvedCallAtom -> completeResolvedCall(resolvedAtom)
        }' @ [61:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'resolvedAtom' @ [61:15] ==> value-parameter resolvedAtom: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAndReport[ValueParameterDescriptorImpl]

'completeCollectionLiteralCalls' @ [62:49] ==> private final fun completeCollectionLiteralCalls(collectionLiteralArgument: ResolvedCollectionLiteralAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'resolvedAtom' @ [62:80] ==> value-parameter resolvedAtom: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAndReport[ValueParameterDescriptorImpl]

'completeCallableReference' @ [63:49] ==> private final fun completeCallableReference(resolvedAtom: ResolvedCallableReferenceAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'resolvedAtom' @ [63:75] ==> value-parameter resolvedAtom: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAndReport[ValueParameterDescriptorImpl]

'completeLambda' @ [64:38] ==> private final fun completeLambda(lambda: ResolvedLambdaAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'resolvedAtom' @ [64:53] ==> value-parameter resolvedAtom: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAndReport[ValueParameterDescriptorImpl]

'completeResolvedCall' @ [65:36] ==> public final fun completeResolvedCall(resolvedCallAtom: ResolvedCallAtom): ResolvedCall<*>? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'resolvedAtom' @ [65:57] ==> value-parameter resolvedAtom: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAndReport[ValueParameterDescriptorImpl]

'resolvedAtom' @ [70:32] ==> value-parameter resolvedAtom: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAll[ValueParameterDescriptorImpl]

'subResolvedAtoms' @ [70:45] ==> public final lateinit var subResolvedAtoms: List<ResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedAtom[DeserializedPropertyDescriptor]

'completeAll' @ [71:13] ==> public final fun completeAll(resolvedAtom: ResolvedAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'subKtPrimitive' @ [71:25] ==> val subKtPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAll[LocalVariableDescriptor]

'completeAndReport' @ [73:9] ==> public final fun completeAndReport(resolvedAtom: ResolvedAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'resolvedAtom' @ [73:27] ==> value-parameter resolvedAtom: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeAll[ValueParameterDescriptorImpl]

'resolvedCallAtom' @ [77:13] ==> value-parameter resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[ValueParameterDescriptorImpl]

'atom' @ [77:30] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [77:35] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'kotlinToResolvedCallTransformer' @ [79:28] ==> private final val kotlinToResolvedCallTransformer: KotlinToResolvedCallTransformer defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'transformToResolvedCall' @ [79:60] ==> public final fun <D : CallableDescriptor> transformToResolvedCall(completedCallAtom: ResolvedCallAtom, trace: BindingTrace?, resultSubstitutor: NewTypeSubstitutor? = ...): ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'resolvedCallAtom' @ [79:104] ==> value-parameter resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[ValueParameterDescriptorImpl]

'trace' @ [79:122] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'resultSubstitutor' @ [79:129] ==> private final val resultSubstitutor: NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'kotlinToResolvedCallTransformer' @ [80:9] ==> private final val kotlinToResolvedCallTransformer: KotlinToResolvedCallTransformer defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'bindAndReport' @ [80:41] ==> internal final fun bindAndReport(context: BasicCallResolutionContext, trace: BindingTrace, resolvedCall: ResolvedCall<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'topLevelCallContext' @ [80:55] ==> private final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'trace' @ [80:76] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'resolvedCall' @ [80:83] ==> val resolvedCall: ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[LocalVariableDescriptor]

'kotlinToResolvedCallTransformer' @ [81:9] ==> private final val kotlinToResolvedCallTransformer: KotlinToResolvedCallTransformer defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'runCallCheckers' @ [81:41] ==> public final fun runCallCheckers(resolvedCall: ResolvedCall<*>, callCheckerContext: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [81:57] ==> val resolvedCall: ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[LocalVariableDescriptor]

'callCheckerContext' @ [81:71] ==> private final val callCheckerContext: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'if (resolvedCall is VariableAsFunctionResolvedCall) resolvedCall.functionCall else resolvedCall' @ [83:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolvedCall<out CallableDescriptor>, elseBranch: ResolvedCall<out CallableDescriptor>): ResolvedCall<out CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>

'resolvedCall' @ [83:28] ==> val resolvedCall: ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[LocalVariableDescriptor]

'resolvedCall' @ [83:76] ==> val resolvedCall: ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[LocalVariableDescriptor]

'functionCall' @ [83:89] ==> public abstract val functionCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'resolvedCall' @ [83:107] ==> val resolvedCall: ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[LocalVariableDescriptor]

'kotlinToResolvedCallTransformer' @ [84:9] ==> private final val kotlinToResolvedCallTransformer: KotlinToResolvedCallTransformer defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'runArgumentsChecks' @ [84:41] ==> public final fun runArgumentsChecks(context: BasicCallResolutionContext, trace: BindingTrace, resolvedCall: NewResolvedCallImpl<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'topLevelCallContext' @ [84:60] ==> private final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'trace' @ [84:81] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'lastCall' @ [84:88] ==> val lastCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[LocalVariableDescriptor]

'resolvedCall' @ [86:16] ==> val resolvedCall: ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall[LocalVariableDescriptor]

'resultSubstitutor' @ [90:26] ==> private final val resultSubstitutor: NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'safeSubstitute' @ [90:44] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[DeserializedSimpleFunctionDescriptor]

'lambda' @ [90:59] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[ValueParameterDescriptorImpl]

'returnType' @ [90:66] ==> public final val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[DeserializedPropertyDescriptor]

'updateTraceForLambdaReturnType' @ [92:9] ==> private final fun updateTraceForLambdaReturnType(lambda: ResolvedLambdaAtom, trace: BindingTrace, returnType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'lambda' @ [92:40] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[ValueParameterDescriptorImpl]

'trace' @ [92:48] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'returnType' @ [92:55] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'lambda' @ [94:30] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[ValueParameterDescriptorImpl]

'resultArguments' @ [94:37] ==> public final lateinit var resultArguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[DeserializedPropertyDescriptor]

'lambdaResult' @ [95:39] ==> val lambdaResult: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'topLevelCallContext' @ [97:21] ==> private final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'replaceDataFlowInfo' @ [97:41] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'resultValueArgument' @ [97:61] ==> val resultValueArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'dataFlowInfoAfterThisArgument' @ [97:81] ==> public abstract val dataFlowInfoAfterThisArgument: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallArgument[PropertyDescriptorImpl]

'replaceExpectedType' @ [98:30] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'returnType' @ [98:50] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'replaceBindingTrace' @ [99:30] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'trace' @ [99:50] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'resultValueArgument' @ [101:38] ==> val resultValueArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'valueArgument' @ [101:58] ==> public abstract val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallArgument[PropertyDescriptorImpl]

'getArgumentExpression' @ [101:72] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'kotlinToResolvedCallTransformer' @ [102:13] ==> private final val kotlinToResolvedCallTransformer: KotlinToResolvedCallTransformer defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'updateRecordedType' @ [102:45] ==> public final fun updateRecordedType(expression: KtExpression, context: BasicCallResolutionContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [102:64] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'newContext' @ [102:84] ==> val newContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'completeReturnsInsideInlineFunctions' @ [105:9] ==> private final fun completeReturnsInsideInlineFunctions(lambda: ResolvedLambdaAtom, returnType: UnwrappedType): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'lambda' @ [105:46] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[ValueParameterDescriptorImpl]

'returnType' @ [105:54] ==> val returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeLambda[LocalVariableDescriptor]

'lambda' @ [109:31] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[ValueParameterDescriptorImpl]

'atom' @ [109:38] ==> public open val atom: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[DeserializedPropertyDescriptor]

'psiCallArgument' @ [109:43] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'psiCallArgument' @ [110:21] ==> val psiCallArgument: PSIFunctionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'ktFunction' @ [110:37] ==> public abstract val ktFunction: KtFunction defined in org.jetbrains.kotlin.resolve.calls.tower.PSIFunctionKotlinCallArgument[PropertyDescriptorImpl]

'bodyExpression' @ [110:48] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'safeAs' @ [110:63] ==> public inline fun <reified T : Any> Any?.safeAs(): KtBlockExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtBlockExpression

'trace' @ [111:25] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'NEW_INFERENCE_BLOCK_INFO' @ [111:46] ==> public final val NEW_INFERENCE_BLOCK_INFO: (WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>..WritableSlice<(KtBlockExpression..KtBlockExpression?), (NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo..NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'block' @ [111:72] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'component1' @ [113:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtReturnExpression, ExpressionTypingContext>.component1(): KtReturnExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtReturnExpression
    <V> -> ExpressionTypingContext

'component2' @ [113:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtReturnExpression, ExpressionTypingContext>.component2(): ExpressionTypingContext defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtReturnExpression
    <V> -> ExpressionTypingContext

'blockInfo' @ [113:44] ==> val blockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'returnStatements' @ [113:54] ==> public final val returnStatements: MutableMap<KtReturnExpression, ExpressionTypingContext> defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'returnStatement' @ [114:30] ==> val returnStatement: KtReturnExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'returnedExpression' @ [114:46] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [115:17] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'context' @ [116:34] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'replaceContextDependency' @ [116:42] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'INDEPENDENT' @ [116:85] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'replaceExpectedType' @ [116:98] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'returnType' @ [116:118] ==> value-parameter returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[ValueParameterDescriptorImpl]

'replaceBindingTrace' @ [117:25] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'trace' @ [117:45] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'expressionTypingServices' @ [118:17] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'getTypeInfo' @ [118:42] ==> @NotNull public open fun getTypeInfo(@NotNull expression: KtExpression, @NotNull resolutionContext: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'expression' @ [118:54] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'newContext' @ [118:66] ==> val newContext: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeReturnsInsideInlineFunctions[LocalVariableDescriptor]

'lambda' @ [124:31] ==> value-parameter lambda: ResolvedLambdaAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[ValueParameterDescriptorImpl]

'atom' @ [124:38] ==> public open val atom: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedLambdaAtom[DeserializedPropertyDescriptor]

'psiCallArgument' @ [124:43] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'when (psiCallArgument) {
            is LambdaKotlinCallArgumentImpl -> {
                ktArgumentExpression = psiCallArgument.ktLambdaExpression
                ktFunction = ktArgumentExpression.functionLiteral
            }
            is FunctionExpressionImpl -> {
                ktArgumentExpression = psiCallArgument.ktFunction
                ktFunction = ktArgumentExpression
            }
            else -> throw AssertionError("Unexpected psiCallArgument for resolved lambda argument: $psiCallArgument")
        }' @ [128:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'psiCallArgument' @ [128:15] ==> val psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'ktArgumentExpression' @ [130:17] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'psiCallArgument' @ [130:40] ==> val psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'ktLambdaExpression' @ [130:56] ==> public final val ktLambdaExpression: KtLambdaExpression defined in org.jetbrains.kotlin.resolve.calls.tower.LambdaKotlinCallArgumentImpl[PropertyDescriptorImpl]

'ktFunction' @ [131:17] ==> val ktFunction: KtElement defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'ktArgumentExpression' @ [131:30] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'functionLiteral' @ [131:51] ==> public final val KtLambdaExpression.functionLiteral: KtFunctionLiteral[MyPropertyDescriptor]

'ktArgumentExpression' @ [134:17] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'psiCallArgument' @ [134:40] ==> val psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'ktFunction' @ [134:56] ==> public open val ktFunction: KtNamedFunction defined in org.jetbrains.kotlin.resolve.calls.tower.FunctionExpressionImpl[PropertyDescriptorImpl]

'ktFunction' @ [135:17] ==> val ktFunction: KtElement defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'ktArgumentExpression' @ [135:30] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'AssertionError' @ [137:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'psiCallArgument' @ [137:101] ==> val psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'trace' @ [140:34] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[ValueParameterDescriptorImpl]

'bindingContext' @ [140:40] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [140:55] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?), key: (PsiElement..PsiElement?)): SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)

'FUNCTION' @ [140:74] ==> public final val FUNCTION: (WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktFunction' @ [140:84] ==> val ktFunction: KtElement defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'AssertionError' @ [141:40] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'functionDescriptor' @ [142:9] ==> val functionDescriptor: FunctionDescriptorImpl defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'setReturnType' @ [142:28] ==> public open fun setReturnType(@NotNull p0: KotlinType): Unit defined in org.jetbrains.kotlin.descriptors.impl.FunctionDescriptorImpl[JavaMethodDescriptor]

'returnType' @ [142:42] ==> value-parameter returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[ValueParameterDescriptorImpl]

'trace' @ [144:34] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[ValueParameterDescriptorImpl]

'getType' @ [144:40] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ktArgumentExpression' @ [144:48] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'AssertionError' @ [144:79] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'trace' @ [145:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[ValueParameterDescriptorImpl]

'recordType' @ [145:15] ==> public abstract fun recordType(@NotNull expression: KtExpression, @Nullable type: KotlinType?): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ktArgumentExpression' @ [145:26] ==> val ktArgumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'existingLambdaType' @ [145:48] ==> val existingLambdaType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[LocalVariableDescriptor]

'replaceReturnType' @ [145:67] ==> public fun KotlinType.replaceReturnType(newReturnType: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'returnType' @ [145:85] ==> value-parameter returnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.updateTraceForLambdaReturnType[ValueParameterDescriptorImpl]

'resolvedAtom' @ [151:33] ==> value-parameter resolvedAtom: ResolvedCallableReferenceAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[ValueParameterDescriptorImpl]

'candidate' @ [151:46] ==> public final var candidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallableReferenceAtom[DeserializedPropertyDescriptor]

'callableCandidate' @ [152:13] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'callableCandidate' @ [156:36] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'freshSubstitutor' @ [156:54] ==> public final var freshSubstitutor: FreshVariableNewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'freshVariables' @ [156:73] ==> public final val freshVariables: List<TypeVariableFromCallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[DeserializedPropertyDescriptor]

'map' @ [156:88] ==> public inline fun <T, R> Iterable<TypeVariableFromCallableDescriptor>.map(transform: (TypeVariableFromCallableDescriptor) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariableFromCallableDescriptor
    <R> -> UnwrappedType

'resultSubstitutor' @ [156:94] ==> private final val resultSubstitutor: NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'safeSubstitute' @ [156:112] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[DeserializedSimpleFunctionDescriptor]

'it' @ [156:127] ==> value-parameter it: TypeVariableFromCallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [156:130] ==> public final val defaultType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableFromCallableDescriptor[DeserializedPropertyDescriptor]

'resolvedAtom' @ [159:31] ==> value-parameter resolvedAtom: ResolvedCallableReferenceAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[ValueParameterDescriptorImpl]

'atom' @ [159:44] ==> public open val atom: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallableReferenceAtom[DeserializedPropertyDescriptor]

'psiCallArgument' @ [159:49] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'psiCallArgument' @ [160:43] ==> val psiCallArgument: CallableReferenceKotlinCallArgumentImpl defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'ktCallableReferenceExpression' @ [160:59] ==> public final val ktCallableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.CallableReferenceKotlinCallArgumentImpl[PropertyDescriptorImpl]

'IndexedParametersSubstitution' @ [161:33] ==> public constructor IndexedParametersSubstitution(parameters: List<TypeParameterDescriptor>, argumentsList: List<TypeProjection>) defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[DeserializedClassConstructorDescriptor]

'callableCandidate' @ [161:63] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'candidate' @ [161:81] ==> public final val candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'typeParameters' @ [161:91] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'resultTypeParameters' @ [161:107] ==> val resultTypeParameters: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'map' @ [161:128] ==> public inline fun <T, R> Iterable<UnwrappedType>.map(transform: (UnwrappedType) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> TypeProjection

'it' @ [161:134] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference.<anonymous>[ValueParameterDescriptorImpl]

'asTypeProjection' @ [161:137] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'buildSubstitutor' @ [161:159] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[DeserializedSimpleFunctionDescriptor]

'resultSubstitutor' @ [165:26] ==> val resultSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'safeSubstitute' @ [165:44] ==> @NotNull public open fun safeSubstitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'callableCandidate' @ [165:59] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'reflectionCandidateType' @ [165:77] ==> public final val reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'INVARIANT' @ [165:111] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'argumentTypeResolver' @ [166:9] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'updateResultArgumentTypeIfNotDenotable' @ [166:30] ==> @Nullable public open fun updateResultArgumentTypeIfNotDenotable(@NotNull trace: BindingTrace, @NotNull statementFilter: StatementFilter, @NotNull expectedType: KotlinType, @NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'trace' @ [166:69] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'expressionTypingServices' @ [166:76] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'statementFilter' @ [166:101] ==> public final val ExpressionTypingServices.statementFilter: StatementFilter[MyPropertyDescriptor]

'resultType' @ [167:69] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'callableReferenceExpression' @ [168:69] ==> val callableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'callableReferenceExpression' @ [169:25] ==> val callableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'callableReference' @ [169:53] ==> public final val KtCallableReferenceExpression.callableReference: KtSimpleNameExpression[MyPropertyDescriptor]

'when (callableCandidate.explicitReceiverKind) {
            ExplicitReceiverKind.DISPATCH_RECEIVER -> callableCandidate.dispatchReceiver
            ExplicitReceiverKind.EXTENSION_RECEIVER -> callableCandidate.extensionReceiver
            else -> null
        }' @ [171:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableReceiver?, entry1: CallableReceiver?, entry2: CallableReceiver?): CallableReceiver?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableReceiver?

'callableCandidate' @ [171:46] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'explicitReceiverKind' @ [171:64] ==> public final val explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'DISPATCH_RECEIVER' @ [172:34] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'callableCandidate' @ [172:55] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'dispatchReceiver' @ [172:73] ==> public final val dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'EXTENSION_RECEIVER' @ [173:34] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'callableCandidate' @ [173:56] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'extensionReceiver' @ [173:74] ==> public final val extensionReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'explicitCallableReceiver' @ [177:32] ==> val explicitCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'receiver' @ [177:58] ==> public final val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[DeserializedPropertyDescriptor]

'makeCall' @ [178:33] ==> @NotNull public open fun makeCall(callElement: (KtElement..KtElement?), @Nullable explicitReceiver: Receiver?, @Nullable callOperationNode: ASTNode?, calleeExpression: (KtExpression..KtExpression?), arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>?)): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'reference' @ [178:42] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'explicitReceiver' @ [178:53] ==> val explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'receiverValue' @ [178:71] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'reference' @ [178:92] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'emptyList' @ [178:103] ==> public fun <T> emptyList(): List<(ValueArgument..ValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'create' @ [180:43] ==> @NotNull public open fun create(@NotNull reference: KtReferenceExpression, @NotNull call: Call): TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyImpl[JavaMethodDescriptor]

'reference' @ [180:50] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'psiCall' @ [180:61] ==> val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'create' @ [181:52] ==> @NotNull public open fun create(@NotNull trace: BindingTrace, debugName: (String..String?)): TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'trace' @ [181:59] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'ResolvedCallImpl' @ [183:28] ==> public constructor ResolvedCallImpl<D : (CallableDescriptor..CallableDescriptor?)>(@NotNull call: Call, @NotNull candidateDescriptor: CallableDescriptor, @Nullable dispatchReceiver: ReceiverValue?, @Nullable extensionReceiver: ReceiverValue?, @NotNull explicitReceiverKind: ExplicitReceiverKind, @Nullable knownTypeParametersSubstitutor: TypeSubstitutor?, @NotNull trace: DelegatingBindingTrace, @NotNull tracing: TracingStrategy, @NotNull dataFlowInfoForArguments: MutableDataFlowInfoForArguments) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaClassConstructorDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'psiCall' @ [183:45] ==> val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'callableCandidate' @ [183:54] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'candidate' @ [183:72] ==> public final val candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'callableCandidate' @ [183:83] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'dispatchReceiver' @ [183:101] ==> public final val dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'receiver' @ [183:119] ==> public final val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[DeserializedPropertyDescriptor]

'receiverValue' @ [183:129] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'callableCandidate' @ [184:45] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'extensionReceiver' @ [184:63] ==> public final val extensionReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'receiver' @ [184:82] ==> public final val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[DeserializedPropertyDescriptor]

'receiverValue' @ [184:92] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'callableCandidate' @ [184:107] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'explicitReceiverKind' @ [184:125] ==> public final val explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'temporaryTrace' @ [185:51] ==> val temporaryTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'tracing' @ [185:67] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'WithoutArgumentsCheck' @ [185:108] ==> public constructor WithoutArgumentsCheck(@NotNull dataFlowInfo: DataFlowInfo) defined in org.jetbrains.kotlin.resolve.calls.model.MutableDataFlowInfoForArguments.WithoutArgumentsCheck[JavaClassConstructorDescriptor]

'EMPTY' @ [185:143] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[PropertyDescriptorImpl]

'resolvedCall' @ [186:9] ==> val resolvedCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'setResultingSubstitutor' @ [186:22] ==> @Override public open fun setResultingSubstitutor(@NotNull substitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaMethodDescriptor]

'resultSubstitutor' @ [186:46] ==> val resultSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'tracing' @ [188:9] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'bindCall' @ [188:17] ==> public abstract fun bindCall(@NotNull trace: BindingTrace, @NotNull call: Call): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [188:26] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'psiCall' @ [188:33] ==> val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'tracing' @ [189:9] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'bindReference' @ [189:17] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(CallableDescriptor..CallableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'trace' @ [189:31] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'resolvedCall' @ [189:38] ==> val resolvedCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'tracing' @ [190:9] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'bindResolvedCall' @ [190:17] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindResolvedCall(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(CallableDescriptor..CallableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'trace' @ [190:34] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'resolvedCall' @ [190:41] ==> val resolvedCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'resolvedCall' @ [192:9] ==> val resolvedCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'setStatusToSuccess' @ [192:22] ==> @Override public open fun setStatusToSuccess(): Unit defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaMethodDescriptor]

'resolvedCall' @ [193:9] ==> val resolvedCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'markCallAsCompleted' @ [193:22] ==> @Override public open fun markCallAsCompleted(): Unit defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaMethodDescriptor]

'when (callableCandidate.candidate) {
            is FunctionDescriptor -> doubleColonExpressionResolver.bindFunctionReference(callableReferenceExpression, resultType, topLevelCallContext)
            is PropertyDescriptor -> doubleColonExpressionResolver.bindPropertyReference(callableReferenceExpression, resultType, topLevelCallContext)
        }' @ [195:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'callableCandidate' @ [195:15] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'candidate' @ [195:33] ==> public final val candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'doubleColonExpressionResolver' @ [196:38] ==> private final val doubleColonExpressionResolver: DoubleColonExpressionResolver defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'bindFunctionReference' @ [196:68] ==> internal final fun bindFunctionReference(expression: KtCallableReferenceExpression, type: KotlinType, context: ResolutionContext<*>): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'callableReferenceExpression' @ [196:90] ==> val callableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'resultType' @ [196:119] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'topLevelCallContext' @ [196:131] ==> private final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'doubleColonExpressionResolver' @ [197:38] ==> private final val doubleColonExpressionResolver: DoubleColonExpressionResolver defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'bindPropertyReference' @ [197:68] ==> internal final fun bindPropertyReference(expression: KtCallableReferenceExpression, referenceType: KotlinType, context: ResolutionContext<*>): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'callableReferenceExpression' @ [197:90] ==> val callableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'resultType' @ [197:119] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'topLevelCallContext' @ [197:131] ==> private final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'trace' @ [201:9] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'recordType' @ [201:15] ==> public abstract fun recordType(@NotNull expression: KtExpression, @Nullable type: KotlinType?): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'callableReferenceExpression' @ [201:26] ==> val callableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'resultType' @ [201:55] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'trace' @ [202:9] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'record' @ [202:15] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?), key: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'PROCESSED' @ [202:37] ==> public final val PROCESSED: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callableReferenceExpression' @ [202:48] ==> val callableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'doubleColonExpressionResolver' @ [204:9] ==> private final val doubleColonExpressionResolver: DoubleColonExpressionResolver defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'checkReferenceIsToAllowedMember' @ [204:39] ==> internal final fun checkReferenceIsToAllowedMember(descriptor: CallableDescriptor, trace: BindingTrace, expression: KtCallableReferenceExpression): Unit defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[SimpleFunctionDescriptorImpl]

'callableCandidate' @ [204:71] ==> val callableCandidate: CallableReferenceCandidate? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'candidate' @ [204:89] ==> public final val candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[DeserializedPropertyDescriptor]

'topLevelCallContext' @ [204:100] ==> private final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'trace' @ [204:120] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'callableReferenceExpression' @ [204:127] ==> val callableReferenceExpression: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCallableReference[LocalVariableDescriptor]

'collectionLiteralArgument' @ [208:31] ==> value-parameter collectionLiteralArgument: ResolvedCollectionLiteralAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls[ValueParameterDescriptorImpl]

'atom' @ [208:57] ==> public open val atom: CollectionLiteralKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCollectionLiteralAtom[DeserializedPropertyDescriptor]

'psiCallArgument' @ [208:62] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'psiCallArgument' @ [209:23] ==> val psiCallArgument: CollectionLiteralKotlinCallArgumentImpl defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls[LocalVariableDescriptor]

'outerCallContext' @ [209:39] ==> public final val outerCallContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.CollectionLiteralKotlinCallArgumentImpl[PropertyDescriptorImpl]

'collectionLiteralArgument' @ [211:28] ==> value-parameter collectionLiteralArgument: ResolvedCollectionLiteralAtom defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls[ValueParameterDescriptorImpl]

'expectedType' @ [211:54] ==> public final val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCollectionLiteralAtom[DeserializedPropertyDescriptor]

'let' @ [211:68] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> UnwrappedType): UnwrappedType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> UnwrappedType

'resultSubstitutor' @ [211:74] ==> private final val resultSubstitutor: NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'safeSubstitute' @ [211:92] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[DeserializedSimpleFunctionDescriptor]

'it' @ [211:107] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls.<anonymous>[ValueParameterDescriptorImpl]

'NO_EXPECTED_TYPE' @ [211:126] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'context' @ [213:29] ==> val context: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls[LocalVariableDescriptor]

'replaceBindingTrace' @ [214:18] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): (ResolutionContext<*>..ResolutionContext<*>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'trace' @ [214:38] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'replaceExpectedType' @ [215:18] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): (ResolutionContext<*>..ResolutionContext<*>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'expectedType' @ [215:38] ==> val expectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls[LocalVariableDescriptor]

'replaceContextDependency' @ [216:18] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): (ResolutionContext<*>..ResolutionContext<*>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'INDEPENDENT' @ [216:61] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'expressionTypingServices' @ [218:9] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[PropertyDescriptorImpl]

'getTypeInfo' @ [218:34] ==> @NotNull public open fun getTypeInfo(@NotNull expression: KtExpression, @NotNull resolutionContext: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'psiCallArgument' @ [218:46] ==> val psiCallArgument: CollectionLiteralKotlinCallArgumentImpl defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls[LocalVariableDescriptor]

'collectionLiteralExpression' @ [218:62] ==> public final val collectionLiteralExpression: KtCollectionLiteralExpression defined in org.jetbrains.kotlin.resolve.calls.tower.CollectionLiteralKotlinCallArgumentImpl[PropertyDescriptorImpl]

'actualContext' @ [218:91] ==> val actualContext: (ResolutionContext<*>..ResolutionContext<*>?) defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeCollectionLiteralCalls[LocalVariableDescriptor]

