'targetDescriptor' @ [55:22] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [55:39] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameters' @ [56:9] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'isEmpty' @ [56:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [56:38] ==> public fun <K, V> emptyMap(): Map<ValueArgument, ValueParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueArgument
    <V> -> ValueParameterDescriptor

'HashMap' @ [58:15] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueArgument
    <V : (Any..Any?)> -> ValueParameterDescriptor

'parameters' @ [59:28] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'associateBy' @ [59:39] ==> public inline fun <T, K> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.associateBy(keySelector: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Name): Map<Name, (ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <K> -> Name

'it' @ [59:53] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [59:56] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'valueArguments' @ [63:22] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'if (argument is LambdaArgument) {
            map[argument] = parameters.last()
        }
        else {
            val argumentName = argument.getArgumentName()?.asName

            if (argumentName != null) {
                if (targetDescriptor.hasStableParameterNames()) {
                    val parameter = parametersByName[argumentName]
                    if (parameter != null) {
                        map[argument] = parameter
                    }
                }
                positionalArgumentIndex = null
            }
            else {
                if (positionalArgumentIndex != null && positionalArgumentIndex < parameters.size) {
                    val parameter = parameters[positionalArgumentIndex]
                    map[argument] = parameter

                    if (parameter.varargElementType == null) {
                        positionalArgumentIndex++
                    }
                }
            }
        }' @ [64:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argument' @ [64:13] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'map' @ [65:13] ==> val map: HashMap<ValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'argument' @ [65:17] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'parameters' @ [65:29] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'last' @ [65:40] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.last(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'argument' @ [68:32] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'getArgumentName' @ [68:41] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'asName' @ [68:60] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'if (argumentName != null) {
                if (targetDescriptor.hasStableParameterNames()) {
                    val parameter = parametersByName[argumentName]
                    if (parameter != null) {
                        map[argument] = parameter
                    }
                }
                positionalArgumentIndex = null
            }
            else {
                if (positionalArgumentIndex != null && positionalArgumentIndex < parameters.size) {
                    val parameter = parameters[positionalArgumentIndex]
                    map[argument] = parameter

                    if (parameter.varargElementType == null) {
                        positionalArgumentIndex++
                    }
                }
            }' @ [70:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentName' @ [70:17] ==> val argumentName: Name? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'targetDescriptor' @ [71:21] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[ValueParameterDescriptorImpl]

'hasStableParameterNames' @ [71:38] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'parametersByName' @ [72:37] ==> val parametersByName: Map<Name, (ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'argumentName' @ [72:54] ==> val argumentName: Name? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'parameter' @ [73:25] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'map' @ [74:25] ==> val map: HashMap<ValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'argument' @ [74:29] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'parameter' @ [74:41] ==> val parameter: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'positionalArgumentIndex' @ [77:17] ==> var positionalArgumentIndex: Int? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'positionalArgumentIndex' @ [80:21] ==> var positionalArgumentIndex: Int? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'positionalArgumentIndex' @ [80:56] ==> var positionalArgumentIndex: Int? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'parameters' @ [80:82] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'size' @ [80:93] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters' @ [81:37] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'positionalArgumentIndex' @ [81:48] ==> var positionalArgumentIndex: Int? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'map' @ [82:21] ==> val map: HashMap<ValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'argument' @ [82:25] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'parameter' @ [82:37] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'parameter' @ [84:25] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'varargElementType' @ [84:35] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'positionalArgumentIndex' @ [85:25] ==> var positionalArgumentIndex: Int? defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'map' @ [92:12] ==> val map: HashMap<ValueArgument, ValueParameterDescriptor> defined in org.jetbrains.kotlin.idea.core.mapArgumentsToParameters[LocalVariableDescriptor]

'resolutionScope' @ [96:29] ==> value-parameter resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.core.asExpression[ValueParameterDescriptorImpl]

'getImplicitReceiversWithInstanceToExpression' @ [96:45] ==> public fun LexicalScope.getImplicitReceiversWithInstanceToExpression(): Map<ReceiverParameterDescriptor, ReceiverExpressionFactory?> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'entries' @ [97:38] ==> public abstract val entries: Set<Map.Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'firstOrNull' @ [98:38] ==> public inline fun <T> Iterable<Map.Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?>>.firstOrNull(predicate: (Map.Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?>) -> Boolean): Map.Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?>

'it' @ [98:52] ==> value-parameter it: Map.Entry<ReceiverParameterDescriptor, ReceiverExpressionFactory?> defined in org.jetbrains.kotlin.idea.core.asExpression.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [98:55] ==> public abstract val key: ReceiverParameterDescriptor defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'containingDeclaration' @ [98:59] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'this' @ [98:84] ==> <this> defined in org.jetbrains.kotlin.idea.core.asExpression[ReceiverParameterDescriptorImpl]

'declarationDescriptor' @ [98:89] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'value' @ [99:39] ==> public abstract val value: ReceiverExpressionFactory? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'expressionFactory' @ [100:12] ==> val expressionFactory: ReceiverExpressionFactory defined in org.jetbrains.kotlin.idea.core.asExpression[LocalVariableDescriptor]

'createExpression' @ [100:30] ==> public abstract fun createExpression(psiFactory: KtPsiFactory, shortThis: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.idea.util.ReceiverExpressionFactory[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [100:47] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.core.asExpression[ValueParameterDescriptorImpl]

'this' @ [103:78] ==> <this> defined in org.jetbrains.kotlin.idea.core.targetDescriptors[ReceiverParameterDescriptorImpl]

'getResolutionFacade' @ [103:83] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'this' @ [105:9] ==> <this> defined in org.jetbrains.kotlin.idea.core.targetDescriptors[ReceiverParameterDescriptorImpl]

'containingKtFile' @ [105:14] ==> public final val KtImportDirective.containingKtFile: KtFile[MyPropertyDescriptor]

'doNotAnalyze' @ [105:31] ==> public var KtFile.doNotAnalyze: String? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'emptyList' @ [105:60] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'importedReference' @ [106:26] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'getQualifiedElementSelector' @ [106:45] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [106:112] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'nameExpression' @ [107:12] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.core.targetDescriptors[LocalVariableDescriptor]

'mainReference' @ [107:27] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'resolveToDescriptors' @ [107:41] ==> public open fun resolveToDescriptors(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [107:62] ==> value-parameter resolutionFacade: ResolutionFacade = ... defined in org.jetbrains.kotlin.idea.core.targetDescriptors[ValueParameterDescriptorImpl]

'analyze' @ [107:79] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'nameExpression' @ [107:87] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.core.targetDescriptors[LocalVariableDescriptor]

'expectedType' @ [113:36] ==> private fun expectedType(call: Call, bindingContext: BindingContext): KotlinType defined in org.jetbrains.kotlin.idea.core in file Utils.kt[SimpleFunctionDescriptorImpl]

'this' @ [113:49] ==> <this> defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ReceiverParameterDescriptorImpl]

'bindingContext' @ [113:55] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'callElement' @ [117:27] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'getResolutionScope' @ [117:39] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [117:58] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'resolutionFacade' @ [117:74] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'resolutionScope' @ [118:24] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'ownerDescriptor' @ [118:40] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'bindingContext' @ [120:24] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'getDataFlowInfoBefore' @ [120:39] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'callElement' @ [120:61] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'DelegatingBindingTrace' @ [121:24] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[DeserializedClassConstructorDescriptor]

'bindingContext' @ [121:47] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'create' @ [122:60] ==> @NotNull public open fun create(@NotNull p0: BindingTrace, @NotNull p1: LexicalScope, @NotNull p2: Call, @NotNull p3: KotlinType, @NotNull p4: DataFlowInfo, @NotNull p5: ContextDependency, @NotNull p6: CheckArgumentTypesMode, p7: Boolean): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'bindingTrace' @ [123:13] ==> val bindingTrace: DelegatingBindingTrace defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'resolutionScope' @ [123:27] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'this' @ [123:44] ==> <this> defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ReceiverParameterDescriptorImpl]

'expectedType' @ [123:50] ==> value-parameter expectedType: KotlinType = ... defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [123:64] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'INDEPENDENT' @ [124:31] ==> enum entry INDEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'CHECK_VALUE_ARGUMENTS' @ [124:67] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'replaceCollectAllCandidates' @ [126:7] ==> @NotNull public open fun replaceCollectAllCandidates(p0: Boolean): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'resolutionFacade' @ [127:24] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'frontendService' @ [127:41] ==> public inline fun <reified T : Any> ResolutionFacade.frontendService(): CallResolver defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CallResolver

'callResolver' @ [129:19] ==> val callResolver: CallResolver defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'resolveFunctionCall' @ [129:32] ==> @NotNull public open fun resolveFunctionCall(@NotNull p0: BasicCallResolutionContext): OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'callResolutionContext' @ [129:52] ==> val callResolutionContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'results' @ [131:22] ==> val results: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'allCandidates' @ [131:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>.allCandidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'callElement' @ [133:9] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'inDescriptor' @ [134:9] ==> val inDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'candidates' @ [135:9] ==> var candidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>) defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'candidates' @ [135:22] ==> var candidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>) defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'filter' @ [135:33] ==> public inline fun <T> Iterable<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>.filter(predicate: ((ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)) -> Boolean): List<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'it' @ [135:42] ==> value-parameter it: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.idea.core.resolveCandidates.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [135:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'original' @ [135:65] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'inDescriptor' @ [135:77] ==> val inDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'original' @ [135:90] ==> public final val ConstructorDescriptor.original: ConstructorDescriptor[MyPropertyDescriptor]

'filterOutWrongReceiver' @ [138:9] ==> value-parameter filterOutWrongReceiver: Boolean = ... defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'candidates' @ [139:9] ==> var candidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>) defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'candidates' @ [139:22] ==> var candidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>) defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'filter' @ [139:33] ==> public inline fun <T> Iterable<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>.filter(predicate: ((ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)) -> Boolean): List<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'it' @ [139:42] ==> value-parameter it: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.idea.core.resolveCandidates.<anonymous>[ValueParameterDescriptorImpl]

'status' @ [139:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'RECEIVER_TYPE_ERROR' @ [139:72] ==> enum entry RECEIVER_TYPE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'it' @ [139:95] ==> value-parameter it: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.idea.core.resolveCandidates.<anonymous>[ValueParameterDescriptorImpl]

'status' @ [139:98] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'RECEIVER_PRESENCE_ERROR' @ [139:125] ==> enum entry RECEIVER_PRESENCE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'filterOutByVisibility' @ [142:9] ==> value-parameter filterOutByVisibility: Boolean = ... defined in org.jetbrains.kotlin.idea.core.resolveCandidates[ValueParameterDescriptorImpl]

'candidates' @ [143:9] ==> var candidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>) defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'candidates' @ [143:22] ==> var candidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>) defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'filter' @ [143:33] ==> public inline fun <T> Iterable<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>.filter(predicate: ((ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)) -> Boolean): List<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'isVisible' @ [144:26] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'it' @ [144:36] ==> value-parameter it: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.idea.core.resolveCandidates.<anonymous>[ValueParameterDescriptorImpl]

'getDispatchReceiverWithSmartCast' @ [144:39] ==> public fun ResolvedCall<*>.getDispatchReceiverWithSmartCast(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [144:75] ==> value-parameter it: (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.idea.core.resolveCandidates.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [144:78] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'inDescriptor' @ [144:99] ==> val inDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'candidates' @ [148:12] ==> var candidates: (MutableCollection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>) defined in org.jetbrains.kotlin.idea.core.resolveCandidates[LocalVariableDescriptor]

'?:' @ [152:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType

'call' @ [152:13] ==> value-parameter call: Call defined in org.jetbrains.kotlin.idea.core.expectedType[ValueParameterDescriptorImpl]

'callElement' @ [152:18] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'let' @ [152:49] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'bindingContext' @ [153:9] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.expectedType[ValueParameterDescriptorImpl]

'EXPECTED_EXPRESSION_TYPE' @ [153:39] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [153:65] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.core.expectedType.<anonymous>[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [153:68] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'NO_EXPECTED_TYPE' @ [154:20] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'?:' @ [158:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType

'resolveToDescriptor' @ [158:25] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'returnType' @ [158:72] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'initializerOrBodyExpression' @ [159:26] ==> value-parameter initializerOrBodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[ValueParameterDescriptorImpl]

'analyze' @ [159:54] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'initializerOrBodyExpression' @ [160:17] ==> value-parameter initializerOrBodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[ValueParameterDescriptorImpl]

'getResolutionScope' @ [160:45] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [160:64] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[LocalVariableDescriptor]

'initializerOrBodyExpression' @ [160:80] ==> value-parameter initializerOrBodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [160:108] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'initializerOrBodyExpression' @ [161:26] ==> value-parameter initializerOrBodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[ValueParameterDescriptorImpl]

'computeTypeInContext' @ [161:54] ==> @JvmOverloads public fun KtExpression.computeTypeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ...): KotlinType? defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'scope' @ [161:75] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[LocalVariableDescriptor]

'DEFAULT' @ [162:27] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [162:35] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'expressionType' @ [162:46] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[LocalVariableDescriptor]

'declaredType' @ [162:62] ==> val declaredType: KotlinType defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[LocalVariableDescriptor]

'canChangeTypeToSubtype' @ [163:12] ==> value-parameter canChangeTypeToSubtype: Boolean defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[ValueParameterDescriptorImpl]

'expressionType' @ [163:38] ==> val expressionType: KotlinType defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[LocalVariableDescriptor]

'isSubtypeOf' @ [163:53] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'declaredType' @ [163:65] ==> val declaredType: KotlinType defined in org.jetbrains.kotlin.idea.core.canOmitDeclaredType[LocalVariableDescriptor]

'if (KotlinNameSuggester.isIdentifier(this)) this else "`$this`"' @ [166:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'KotlinNameSuggester' @ [166:42] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core in file KotlinNameSuggester.kt[FakeCallableDescriptorForObject]

'isIdentifier' @ [166:62] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[SimpleFunctionDescriptorImpl]

'this' @ [166:75] ==> <this> defined in org.jetbrains.kotlin.idea.core.quoteIfNeeded[ReceiverParameterDescriptorImpl]

'this' @ [166:82] ==> <this> defined in org.jetbrains.kotlin.idea.core.quoteIfNeeded[ReceiverParameterDescriptorImpl]

'this' @ [166:95] ==> <this> defined in org.jetbrains.kotlin.idea.core.quoteIfNeeded[ReceiverParameterDescriptorImpl]

'unquoteIdentifier' @ [168:42] ==> @NotNull public open fun unquoteIdentifier(@NotNull p0: String): String defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [168:60] ==> <this> defined in org.jetbrains.kotlin.idea.core.unquote[ReceiverParameterDescriptorImpl]

'pathSegments' @ [171:12] ==> @NotNull public open fun pathSegments(): (MutableList<(Name..Name?)>..List<(Name..Name?)>) defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'joinToString' @ [171:27] ==> public fun <T> Iterable<(Name..Name?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((Name..Name?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)

'it' @ [171:47] ==> value-parameter it: (Name..Name?) defined in org.jetbrains.kotlin.idea.core.quoteSegmentsIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [171:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'quoteIfNeeded' @ [171:61] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core in file Utils.kt[SimpleFunctionDescriptorImpl]

'FqName' @ [174:30] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'quoteSegmentsIfNeeded' @ [174:37] ==> public fun FqName.quoteSegmentsIfNeeded(): String defined in org.jetbrains.kotlin.idea.core in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [177:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict[ValueParameterDescriptorImpl]

'element' @ [179:25] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [179:33] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'!' @ [180:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propertyClass' @ [180:10] ==> val propertyClass: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict[LocalVariableDescriptor]

'isCompanion' @ [180:24] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'propertyClass' @ [182:22] ==> val propertyClass: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict[LocalVariableDescriptor]

'containingClassOrObject' @ [182:36] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'!' @ [183:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outerClass' @ [183:10] ==> val outerClass: KtClass defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict[LocalVariableDescriptor]

'isEnum' @ [183:21] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'outerClass' @ [185:12] ==> val outerClass: KtClass defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict[LocalVariableDescriptor]

'declarations' @ [185:23] ==> public final val KtClass.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'any' @ [185:36] ==> public inline fun <T> Iterable<KtDeclaration>.any(predicate: (KtDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'it' @ [185:42] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [185:63] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [185:66] ==> public final val KtEnumEntry.name: String?[MyPropertyDescriptor]

'expectedName' @ [185:74] ==> value-parameter expectedName: String defined in org.jetbrains.kotlin.idea.core.isEnumCompanionPropertyWithEntryConflict[ValueParameterDescriptorImpl]

