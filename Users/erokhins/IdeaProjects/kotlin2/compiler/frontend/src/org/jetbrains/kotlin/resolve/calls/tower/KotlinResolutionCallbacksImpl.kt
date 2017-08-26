'topLevelCallContext' @ [55:31] ==> public final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'trace' @ [55:51] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'lambdaArgument' @ [64:31] ==> value-parameter lambdaArgument: LambdaKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[ValueParameterDescriptorImpl]

'psiCallArgument' @ [64:46] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'psiCallArgument' @ [65:32] ==> val psiCallArgument: PSIFunctionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'outerCallContext' @ [65:48] ==> public final val outerCallContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.PSIFunctionKotlinCallArgument[PropertyDescriptorImpl]

'psiCallArgument' @ [67:25] ==> val psiCallArgument: PSIFunctionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'ktFunction' @ [67:41] ==> public abstract val ktFunction: KtFunction defined in org.jetbrains.kotlin.resolve.calls.tower.PSIFunctionKotlinCallArgument[PropertyDescriptorImpl]

'bodyExpression' @ [67:52] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'safeAs' @ [67:67] ==> public inline fun <reified T : Any> Any?.safeAs(): KtBlockExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtBlockExpression

'let' @ [67:96] ==> @InlineOnly public inline fun <T, R> KtBlockExpression.let(block: (KtBlockExpression) -> NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo): NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBlockExpression
    <R> -> AdditionalBlockInfo

'initializeBlockInfo' @ [68:13] ==> public fun initializeBlockInfo(blockExpression: KtBlockExpression, trace: BindingTrace): NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'it' @ [68:33] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [68:37] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'AdditionalBlockInfo' @ [69:14] ==> public constructor AdditionalBlockInfo() defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[ClassConstructorDescriptorImpl]

'expectedReturnType' @ [71:40] ==> value-parameter expectedReturnType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[ValueParameterDescriptorImpl]

'NO_EXPECTED_TYPE' @ [71:72] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'if (expectedReturnType == null) ContextDependency.DEPENDENT else ContextDependency.INDEPENDENT' @ [72:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ContextDependency, elseBranch: ContextDependency): ContextDependency[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ContextDependency

'expectedReturnType' @ [72:37] ==> value-parameter expectedReturnType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[ValueParameterDescriptorImpl]

'DEPENDENT' @ [72:83] ==> enum entry DEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'INDEPENDENT' @ [72:116] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'context' @ [75:30] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments.createCallArgument[ValueParameterDescriptorImpl]

'replaceContextDependency' @ [75:38] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'contextDependency' @ [75:63] ==> val contextDependency: ContextDependency defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'replaceExpectedType' @ [75:82] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'actualExpectedReturnType' @ [75:102] ==> val actualExpectedReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'replaceBindingTrace' @ [75:128] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'trace' @ [75:148] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'psiCallResolver' @ [77:33] ==> public final val psiCallResolver: PSICallResolver defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'createValueArgument' @ [77:49] ==> public final fun createValueArgument(callContext: ResolutionContext<*>, valueArgument: ValueArgument, callForScopeTower: Call): PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.PSICallResolver[SimpleFunctionDescriptorImpl]

'newContext' @ [77:69] ==> val newContext: (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments.createCallArgument[LocalVariableDescriptor]

'makeExternalValueArgument' @ [77:91] ==> @NotNull public open fun makeExternalValueArgument(@NotNull expression: KtExpression): ValueArgument defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'expression' @ [77:117] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments.createCallArgument[ValueParameterDescriptorImpl]

'topLevelCallContext' @ [78:69] ==> public final val topLevelCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'call' @ [78:89] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'valueArgument' @ [79:13] ==> val valueArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments.createCallArgument[LocalVariableDescriptor]

'setResultDataFlowInfoIfRelevant' @ [79:27] ==> internal fun KotlinCallArgument.setResultDataFlowInfoIfRelevant(resultDataFlowInfo: DataFlowInfo): Unit defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[SimpleFunctionDescriptorImpl]

'newContext' @ [79:59] ==> val newContext: (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments.createCallArgument[LocalVariableDescriptor]

'dataFlowInfo' @ [79:70] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'valueArgument' @ [80:20] ==> val valueArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments.createCallArgument[LocalVariableDescriptor]

'outerCallContext' @ [83:24] ==> val outerCallContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'scope' @ [83:41] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [83:47] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'builtIns' @ [83:63] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'createFunctionType' @ [84:28] ==> @JvmOverloads public fun createFunctionType(builtIns: KotlinBuiltIns, annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, suspendFunction: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'builtIns' @ [84:47] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'Annotations' @ [84:57] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [84:69] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'receiverType' @ [84:76] ==> value-parameter receiverType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[ValueParameterDescriptorImpl]

'parameters' @ [84:90] ==> value-parameter parameters: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[ValueParameterDescriptorImpl]

'actualExpectedReturnType' @ [85:47] ==> val actualExpectedReturnType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'isSuspend' @ [85:73] ==> value-parameter isSuspend: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[ValueParameterDescriptorImpl]

'typeApproximator' @ [87:40] ==> public final val typeApproximator: TypeApproximator defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'approximateToSubType' @ [87:57] ==> public final fun approximateToSubType(type: UnwrappedType, conf: TypeApproximatorConfiguration): UnwrappedType? defined in org.jetbrains.kotlin.types.TypeApproximator[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [87:78] ==> val expectedType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'LocalDeclaration' @ [87:122] ==> public object LocalDeclaration : TypeApproximatorConfiguration.AllFlexibleSameValue defined in org.jetbrains.kotlin.types.TypeApproximatorConfiguration[FakeCallableDescriptorForObject]

'expectedType' @ [87:143] ==> val expectedType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'outerCallContext' @ [89:29] ==> val outerCallContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'replaceBindingTrace' @ [90:18] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'trace' @ [90:38] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'replaceContextDependency' @ [91:18] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'contextDependency' @ [91:43] ==> val contextDependency: ContextDependency defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'replaceExpectedType' @ [92:18] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'approximatesExpectedType' @ [92:38] ==> val approximatesExpectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'replaceDataFlowInfo' @ [93:18] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'psiCallArgument' @ [93:38] ==> val psiCallArgument: PSIFunctionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'lambdaInitialDataFlowInfo' @ [93:54] ==> public final lateinit var lambdaInitialDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.tower.PSIFunctionKotlinCallArgument[PropertyDescriptorImpl]

'expressionTypingServices' @ [96:9] ==> public final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'getTypeInfo' @ [96:34] ==> @NotNull public open fun getTypeInfo(@NotNull expression: KtExpression, @NotNull resolutionContext: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingServices[JavaMethodDescriptor]

'psiCallArgument' @ [96:46] ==> val psiCallArgument: PSIFunctionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'expression' @ [96:62] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.PSIFunctionKotlinCallArgument[PropertyDescriptorImpl]

'actualContext' @ [96:74] ==> val actualContext: (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>..ResolutionContext<out (ResolutionContext<out Any?>..ResolutionContext<out Any?>?)>?)>?)>?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'ArrayList' @ [99:31] ==> public final fun <E> <init>(): ArrayList<KotlinCallArgument> /* = ArrayList<KotlinCallArgument> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KotlinCallArgument

'component1' @ [101:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtReturnExpression, ExpressionTypingContext>.component1(): KtReturnExpression defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtReturnExpression
    <V> -> ExpressionTypingContext

'component2' @ [101:32] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtReturnExpression, ExpressionTypingContext>.component2(): ExpressionTypingContext defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtReturnExpression
    <V> -> ExpressionTypingContext

'blockInfo' @ [101:44] ==> val blockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'returnStatements' @ [101:54] ==> public final val returnStatements: MutableMap<KtReturnExpression, ExpressionTypingContext> defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'returnStatement' @ [102:38] ==> val returnStatement: KtReturnExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'returnedExpression' @ [102:54] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'if (returnedExpression != null) {
                returnArguments.add(createCallArgument(context, returnedExpression))
            }
            else {
                hasReturnWithoutExpression = true
                returnArguments.add(EmptyLabeledReturn(returnStatement, builtIns))
            }' @ [103:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'returnedExpression' @ [103:17] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'returnArguments' @ [104:17] ==> val returnArguments: ArrayList<KotlinCallArgument> /* = ArrayList<KotlinCallArgument> */ defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'add' @ [104:33] ==> public open fun add(element: KotlinCallArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createCallArgument' @ [104:37] ==> local final fun createCallArgument(context: ResolutionContext<*>, expression: KtExpression): KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[SimpleFunctionDescriptorImpl]

'context' @ [104:56] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'returnedExpression' @ [104:65] ==> val returnedExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'hasReturnWithoutExpression' @ [107:17] ==> var hasReturnWithoutExpression: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'returnArguments' @ [108:17] ==> val returnArguments: ArrayList<KotlinCallArgument> /* = ArrayList<KotlinCallArgument> */ defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'add' @ [108:33] ==> public open fun add(element: KotlinCallArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'EmptyLabeledReturn' @ [108:37] ==> public constructor EmptyLabeledReturn(returnExpression: KtReturnExpression, builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.calls.tower.EmptyLabeledReturn[ClassConstructorDescriptorImpl]

'returnStatement' @ [108:56] ==> val returnStatement: KtReturnExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'builtIns' @ [108:73] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'blockInfo' @ [112:30] ==> val blockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'lastExpression' @ [112:40] ==> public final var lastExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'psiCallArgument' @ [112:58] ==> val psiCallArgument: PSIFunctionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'ktFunction' @ [112:74] ==> public abstract val ktFunction: KtFunction defined in org.jetbrains.kotlin.resolve.calls.tower.PSIFunctionKotlinCallArgument[PropertyDescriptorImpl]

'bodyExpression' @ [112:85] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'blockInfo' @ [113:37] ==> val blockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'lastExpressionContext' @ [113:47] ==> public final var lastExpressionContext: ExpressionTypingContext? defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'outerCallContext' @ [113:72] ==> val outerCallContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'!' @ [115:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasReturnWithoutExpression' @ [115:14] ==> var hasReturnWithoutExpression: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'expectedReturnType' @ [115:44] ==> value-parameter expectedReturnType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[ValueParameterDescriptorImpl]

'isUnit' @ [115:64] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'lastExpression' @ [115:84] ==> val lastExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'returnArguments' @ [116:13] ==> val returnArguments: ArrayList<KotlinCallArgument> /* = ArrayList<KotlinCallArgument> */ defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'add' @ [116:29] ==> public open fun add(element: KotlinCallArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createCallArgument' @ [116:33] ==> local final fun createCallArgument(context: ResolutionContext<*>, expression: KtExpression): KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[SimpleFunctionDescriptorImpl]

'lastExpressionContext' @ [116:52] ==> val lastExpressionContext: ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>..ResolutionContext<out (ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>?)>?)>?)>?)>?)> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'lastExpression' @ [116:75] ==> val lastExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'blockInfo' @ [119:9] ==> val blockInfo: NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'returnStatements' @ [119:19] ==> public final val returnStatements: MutableMap<KtReturnExpression, ExpressionTypingContext> defined in org.jetbrains.kotlin.resolve.calls.tower.NewInferenceLastBlockExpressionHelper.AdditionalBlockInfo[PropertyDescriptorImpl]

'clear' @ [119:36] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'returnArguments' @ [121:16] ==> val returnArguments: ArrayList<KotlinCallArgument> /* = ArrayList<KotlinCallArgument> */ defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaResultArguments[LocalVariableDescriptor]

'kotlinToResolvedCallTransformer' @ [125:9] ==> public final val kotlinToResolvedCallTransformer: KotlinToResolvedCallTransformer defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

'createStubResolvedCallAndWriteItToTrace' @ [125:41] ==> public final fun <D : CallableDescriptor> createStubResolvedCallAndWriteItToTrace(candidate: ResolvedCallAtom, trace: BindingTrace): ResolvedCall<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'candidate' @ [125:101] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.bindStubResolvedCallForCandidate[ValueParameterDescriptorImpl]

'trace' @ [125:112] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl[PropertyDescriptorImpl]

