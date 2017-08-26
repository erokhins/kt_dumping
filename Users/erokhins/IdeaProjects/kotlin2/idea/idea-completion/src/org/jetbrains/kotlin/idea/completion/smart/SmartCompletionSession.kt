'CompletionSession' @ [44:5] ==> public constructor CompletionSession(configuration: CompletionSessionConfiguration, parameters: CompletionParameters, toFromOriginalFileMapper: ToFromOriginalFileMapper, resultSet: CompletionResultSet) defined in org.jetbrains.kotlin.idea.completion.CompletionSession[ClassConstructorDescriptorImpl]

'configuration' @ [44:23] ==> value-parameter configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.<init>[ValueParameterDescriptorImpl]

'parameters' @ [44:38] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.<init>[ValueParameterDescriptorImpl]

'toFromOriginalFileMapper' @ [44:50] ==> value-parameter toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.<init>[ValueParameterDescriptorImpl]

'resultSet' @ [44:76] ==> value-parameter resultSet: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.<init>[ValueParameterDescriptorImpl]

'lazy' @ [46:64] ==> public fun <T> lazy(initializer: () -> DescriptorKindFilter): Lazy<DescriptorKindFilter> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorKindFilter

'DescriptorKindFilter' @ [48:22] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'VALUES' @ [48:43] ==> @field:JvmField public final val VALUES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'SamConstructorDescriptorKindExclude' @ [48:58] ==> public object SamConstructorDescriptorKindExclude : DescriptorKindExclude defined in org.jetbrains.kotlin.load.java.sam[FakeCallableDescriptorForObject]

'smartCompletion' @ [50:13] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'expectedInfos' @ [50:30] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'filterFunctionExpected' @ [50:45] ==> public fun Collection<ExpectedInfo>.filterFunctionExpected(): List<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart[SimpleFunctionDescriptorImpl]

'isNotEmpty' @ [50:71] ==> @InlineOnly public inline fun <T> Collection<ExpectedInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'filter' @ [52:13] ==> var filter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.descriptorKindFilter.<anonymous>[LocalVariableDescriptor]

'filter' @ [52:22] ==> var filter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.descriptorKindFilter.<anonymous>[LocalVariableDescriptor]

'withKinds' @ [52:29] ==> public final fun withKinds(kinds: Int): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [52:39] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'NON_SINGLETON_CLASSIFIERS_MASK' @ [52:60] ==> public final val NON_SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filter' @ [55:9] ==> var filter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.descriptorKindFilter.<anonymous>[LocalVariableDescriptor]

'lazy' @ [58:36] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> SmartCompletion?): Lazy<SmartCompletion?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCompletion?

'NONE' @ [58:62] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'expression' @ [59:9] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'let' @ [59:21] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> SmartCompletion): SmartCompletion defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> SmartCompletion

'SmartCompletion' @ [60:13] ==> public constructor SmartCompletion(expression: KtExpression, resolutionFacade: ResolutionFacade, bindingContext: BindingContext, moduleDescriptor: ModuleDescriptor, visibilityFilter: (DeclarationDescriptor) -> Boolean, indicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, inheritorSearchScope: GlobalSearchScope, toFromOriginalFileMapper: ToFromOriginalFileMapper, callTypeAndReceiver: CallTypeAndReceiver<*, *>, isJvmModule: Boolean, forBasicCompletion: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[ClassConstructorDescriptorImpl]

'it' @ [60:29] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.smartCompletion.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolutionFacade' @ [60:33] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [60:51] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'moduleDescriptor' @ [60:67] ==> protected final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'isVisibleFilter' @ [60:85] ==> protected final val isVisibleFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'indicesHelper' @ [60:102] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [61:29] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'searchScope' @ [61:44] ==> protected final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'toFromOriginalFileMapper' @ [61:57] ==> value-parameter toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.<init>[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [62:29] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'isJvmModule' @ [62:50] ==> protected final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'smartCompletion' @ [67:17] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'expectedInfos' @ [67:34] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'emptyList' @ [67:51] ==> public fun <T> emptyList(): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'nameExpression' @ [70:13] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'NamedArgumentCompletion' @ [70:39] ==> public object NamedArgumentCompletion defined in org.jetbrains.kotlin.idea.completion in file NamedArgumentCompletion.kt[FakeCallableDescriptorForObject]

'isOnlyNamedArgumentExpected' @ [70:63] ==> public final fun isOnlyNamedArgumentExpected(nameExpression: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.idea.completion.NamedArgumentCompletion[SimpleFunctionDescriptorImpl]

'nameExpression' @ [70:91] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'NamedArgumentCompletion' @ [71:13] ==> public object NamedArgumentCompletion defined in org.jetbrains.kotlin.idea.completion in file NamedArgumentCompletion.kt[FakeCallableDescriptorForObject]

'complete' @ [71:37] ==> public final fun complete(collector: LookupElementsCollector, expectedInfos: Collection<ExpectedInfo>, callType: CallType<*>): Unit defined in org.jetbrains.kotlin.idea.completion.NamedArgumentCompletion[SimpleFunctionDescriptorImpl]

'collector' @ [71:46] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'expectedInfos' @ [71:57] ==> protected open val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [71:72] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'callType' @ [71:92] ==> public final val callType: CallType<out KtElement?> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'expression' @ [75:13] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addFunctionLiteralArgumentCompletions' @ [77:9] ==> private final fun addFunctionLiteralArgumentCompletions(): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'withCollectRequiredContextVariableTypes' @ [80:54] ==> protected final fun withCollectRequiredContextVariableTypes(action: (LookupElementFactory) -> Unit): Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'smartCompletion' @ [81:24] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'additionalItems' @ [81:42] ==> public final fun additionalItems(lookupElementFactory: LookupElementFactory): Pair<Collection<LookupElement>, InheritanceItemsSearcher?> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [81:58] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [82:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [82:23] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'pair' @ [82:35] ==> val pair: Pair<Collection<LookupElement>, InheritanceItemsSearcher?> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'first' @ [82:40] ==> public final val first: Collection<LookupElement> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'inheritanceSearcher' @ [83:13] ==> var inheritanceSearcher: InheritanceItemsSearcher? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'pair' @ [83:35] ==> val pair: Pair<Collection<LookupElement>, InheritanceItemsSearcher?> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'second' @ [83:40] ==> public final val second: InheritanceItemsSearcher? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'smartCompletion' @ [86:22] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'descriptorFilter' @ [86:40] ==> public final val descriptorFilter: ((DeclarationDescriptor, AbstractLookupElementFactory) -> Collection<LookupElement>)? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'filter' @ [87:56] ==> val filter: ((DeclarationDescriptor, AbstractLookupElementFactory) -> Collection<LookupElement>)? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'let' @ [87:64] ==> @InlineOnly public inline fun <T, R> ((DeclarationDescriptor, AbstractLookupElementFactory) -> Collection<LookupElement>).let(block: ((DeclarationDescriptor, AbstractLookupElementFactory) -> Collection<LookupElement>) -> Collection<FuzzyType>): Collection<FuzzyType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function2<DeclarationDescriptor, AbstractLookupElementFactory, Collection<LookupElement>>
    <R> -> Collection<FuzzyType>

'withCollectRequiredContextVariableTypes' @ [88:13] ==> protected final fun withCollectRequiredContextVariableTypes(action: (LookupElementFactory) -> Unit): Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'referenceVariantsCollector' @ [89:21] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'component1' @ [90:26] ==> public final operator fun component1(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'component2' @ [90:36] ==> public final operator fun component2(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'referenceVariantsCollector' @ [90:51] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'collectReferenceVariants' @ [90:78] ==> public final fun collectReferenceVariants(descriptorKindFilter: DescriptorKindFilter): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [90:103] ==> protected open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'excludeNonInitializedVariable' @ [90:125] ==> protected final fun ReferenceVariants.excludeNonInitializedVariable(): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'imported' @ [91:21] ==> val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [91:30] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'collector' @ [91:40] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [91:50] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [91:62] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [91:69] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [91:73] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'notImported' @ [92:21] ==> val notImported: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [92:33] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'collector' @ [92:43] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [92:53] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [92:65] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [92:72] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [92:76] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'referenceVariantsCollector' @ [93:21] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'collectingFinished' @ [93:48] ==> public final fun collectingFinished(): Unit defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'flushToResultSet' @ [98:9] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'RealContextVariablesProvider' @ [100:40] ==> public constructor RealContextVariablesProvider(referenceVariantsHelper: ReferenceVariantsHelper, contextElement: PsiElement) defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[ClassConstructorDescriptorImpl]

'referenceVariantsHelper' @ [100:69] ==> protected final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'position' @ [100:94] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'withContextVariablesProvider' @ [101:9] ==> protected final fun withContextVariablesProvider(contextVariablesProvider: ContextVariablesProvider, action: (LookupElementFactory) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'contextVariablesProvider' @ [101:38] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'filter' @ [102:17] ==> val filter: ((DeclarationDescriptor, AbstractLookupElementFactory) -> Collection<LookupElement>)? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'receiverTypes' @ [102:35] ==> protected final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'ExtensionFunctionTypeValueCompletion' @ [103:31] ==> public constructor ExtensionFunctionTypeValueCompletion(receiverTypes: Collection<ReceiverType>, callType: CallType<*>, lookupElementFactory: LookupElementFactory) defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[ClassConstructorDescriptorImpl]

'receiverTypes' @ [103:68] ==> protected final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [103:83] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'callType' @ [103:103] ==> public final val callType: CallType<out KtElement?> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'lookupElementFactory' @ [103:113] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'processVariables' @ [104:26] ==> public final fun processVariables(variablesProvider: RealContextVariablesProvider): Collection<ExtensionFunctionTypeValueCompletion.Result> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[SimpleFunctionDescriptorImpl]

'contextVariablesProvider' @ [104:43] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'component1' @ [105:23] ==> public final operator fun component1(): FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.Result[SimpleFunctionDescriptorImpl]

'component2' @ [105:41] ==> public final operator fun component2(): AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.Result[SimpleFunctionDescriptorImpl]

'results' @ [105:53] ==> val results: Collection<ExtensionFunctionTypeValueCompletion.Result> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'collector' @ [106:21] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [106:31] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [106:43] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'invokeDescriptor' @ [106:50] ==> val invokeDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'factory' @ [106:68] ==> val factory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'contextVariableTypesForAdditionalItems' @ [110:17] ==> val contextVariableTypesForAdditionalItems: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'any' @ [110:56] ==> public inline fun <T> Iterable<FuzzyType>.any(predicate: (FuzzyType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'contextVariablesProvider' @ [110:62] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'functionTypeVariables' @ [110:87] ==> public open fun functionTypeVariables(requiredType: FuzzyType): Collection<Pair<VariableDescriptor, TypeSubstitutor>> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[SimpleFunctionDescriptorImpl]

'it' @ [110:109] ==> value-parameter it: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [110:113] ==> @InlineOnly public inline fun <T> Collection<Pair<VariableDescriptor, TypeSubstitutor>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<VariableDescriptor, TypeSubstitutor>

'smartCompletion' @ [111:39] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'additionalItems' @ [111:57] ==> public final fun additionalItems(lookupElementFactory: LookupElementFactory): Pair<Collection<LookupElement>, InheritanceItemsSearcher?> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [111:73] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [111:95] ==> public final val first: Collection<LookupElement> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'collector' @ [112:17] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [112:27] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'additionalItems' @ [112:39] ==> val additionalItems: Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'filter' @ [115:17] ==> val filter: ((DeclarationDescriptor, AbstractLookupElementFactory) -> Collection<LookupElement>)? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'contextVariableTypesForReferenceVariants' @ [115:35] ==> val contextVariableTypesForReferenceVariants: Collection<FuzzyType>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'any' @ [115:78] ==> public inline fun <T> Iterable<FuzzyType>.any(predicate: (FuzzyType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'contextVariablesProvider' @ [115:84] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'functionTypeVariables' @ [115:109] ==> public open fun functionTypeVariables(requiredType: FuzzyType): Collection<Pair<VariableDescriptor, TypeSubstitutor>> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[SimpleFunctionDescriptorImpl]

'it' @ [115:131] ==> value-parameter it: FuzzyType defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [115:135] ==> @InlineOnly public inline fun <T> Collection<Pair<VariableDescriptor, TypeSubstitutor>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<VariableDescriptor, TypeSubstitutor>

'component1' @ [116:22] ==> public final operator fun component1(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'component2' @ [116:32] ==> public final operator fun component2(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'referenceVariantsWithSingleFunctionTypeParameter' @ [116:47] ==> protected final fun referenceVariantsWithSingleFunctionTypeParameter(): ReferenceVariants? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'imported' @ [117:17] ==> val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'forEach' @ [117:26] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'collector' @ [117:36] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [117:46] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [117:58] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [117:65] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [117:69] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'notImported' @ [118:17] ==> val notImported: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'forEach' @ [118:29] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'collector' @ [118:39] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [118:49] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [118:61] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [118:68] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [118:72] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'flushToResultSet' @ [121:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'filter' @ [123:17] ==> val filter: ((DeclarationDescriptor, AbstractLookupElementFactory) -> Collection<LookupElement>)? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'if (callTypeAndReceiver is CallTypeAndReceiver.DEFAULT) {
                    val alreadyCollected = referenceVariantsCollector!!.allCollected.imported
                    staticMembersCompletion = StaticMembersCompletion(prefixMatcher, resolutionFacade, lookupElementFactory, alreadyCollected, isJvmModule)
                    val decoratedFactory = staticMembersCompletion.decoratedLookupElementFactory(ItemPriority.STATIC_MEMBER_FROM_IMPORTS)
                    staticMembersCompletion.membersFromImports(file)
                            .flatMap { filter(it, decoratedFactory) }
                            .forEach { collector.addElement(it) }
                }
                else {
                    staticMembersCompletion = null
                }' @ [125:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'callTypeAndReceiver' @ [125:21] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'referenceVariantsCollector' @ [126:44] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'allCollected' @ [126:73] ==> public final val allCollected: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'imported' @ [126:86] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'staticMembersCompletion' @ [127:21] ==> val staticMembersCompletion: StaticMembersCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'StaticMembersCompletion' @ [127:47] ==> public constructor StaticMembersCompletion(prefixMatcher: PrefixMatcher, resolutionFacade: ResolutionFacade, lookupElementFactory: LookupElementFactory, alreadyAdded: Collection<DeclarationDescriptor>, isJvmModule: Boolean) defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[ClassConstructorDescriptorImpl]

'prefixMatcher' @ [127:71] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [127:86] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'lookupElementFactory' @ [127:104] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'alreadyCollected' @ [127:126] ==> val alreadyCollected: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'isJvmModule' @ [127:144] ==> protected final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'staticMembersCompletion' @ [128:44] ==> val staticMembersCompletion: StaticMembersCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'decoratedLookupElementFactory' @ [128:68] ==> public final fun decoratedLookupElementFactory(itemPriority: ItemPriority): AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'STATIC_MEMBER_FROM_IMPORTS' @ [128:111] ==> enum entry STATIC_MEMBER_FROM_IMPORTS defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'staticMembersCompletion' @ [129:21] ==> val staticMembersCompletion: StaticMembersCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'membersFromImports' @ [129:45] ==> public final fun membersFromImports(file: KtFile): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'file' @ [129:64] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'flatMap' @ [130:30] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.flatMap(transform: (DeclarationDescriptor) -> Iterable<LookupElement>): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> LookupElement

'invoke' @ [130:40] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [130:47] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'decoratedFactory' @ [130:51] ==> val decoratedFactory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'forEach' @ [131:30] ==> @HidesMembers public inline fun <T> Iterable<LookupElement>.forEach(action: (LookupElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'collector' @ [131:40] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElement' @ [131:50] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'it' @ [131:61] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'staticMembersCompletion' @ [134:21] ==> val staticMembersCompletion: StaticMembersCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'shouldCompleteTopLevelCallablesFromIndex' @ [137:21] ==> protected open fun shouldCompleteTopLevelCallablesFromIndex(): Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'processTopLevelCallables' @ [138:21] ==> protected final fun processTopLevelCallables(processor: (CallableDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'collector' @ [139:25] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [139:35] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [139:47] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [139:54] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [139:58] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'flushToResultSet' @ [140:25] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'isDebuggerContext' @ [144:21] ==> protected final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'getRuntimeReceiverTypeReferenceVariants' @ [145:46] ==> protected final fun getRuntimeReceiverTypeReferenceVariants(lookupElementFactory: LookupElementFactory): Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [145:86] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'variantsAndFactory' @ [146:25] ==> val variantsAndFactory: Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'variantsAndFactory' @ [147:40] ==> val variantsAndFactory: Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'first' @ [147:59] ==> public final val first: ReferenceVariants defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Suppress' @ [148:25] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'variantsAndFactory' @ [148:80] ==> val variantsAndFactory: Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'second' @ [148:99] ==> public final val second: LookupElementFactory defined in kotlin.Pair[DeserializedPropertyDescriptor]

'variants' @ [149:25] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'imported' @ [149:34] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'forEach' @ [149:43] ==> @HidesMembers public inline fun <T> Iterable<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'collector' @ [149:53] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [149:63] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [149:75] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [149:82] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [149:86] ==> val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'map' @ [149:108] ==> public inline fun <T, R> Iterable<LookupElement>.map(transform: (LookupElement) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement

'it' @ [149:114] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withReceiverCast' @ [149:117] ==> public fun LookupElement.withReceiverCast(): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'variants' @ [150:25] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'notImportedExtensions' @ [150:34] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'forEach' @ [150:56] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'collector' @ [150:66] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [150:76] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'invoke' @ [150:88] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [150:95] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [150:99] ==> val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'map' @ [150:121] ==> public inline fun <T, R> Iterable<LookupElement>.map(transform: (LookupElement) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement
    <R> -> LookupElement

'it' @ [150:127] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withReceiverCast' @ [150:130] ==> public fun LookupElement.withReceiverCast(): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'flushToResultSet' @ [151:25] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'staticMembersCompletion' @ [155:21] ==> val staticMembersCompletion: StaticMembersCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'configuration' @ [155:56] ==> protected final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'staticMembers' @ [155:70] ==> public final val staticMembers: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'staticMembersCompletion' @ [156:44] ==> val staticMembersCompletion: StaticMembersCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'decoratedLookupElementFactory' @ [156:68] ==> public final fun decoratedLookupElementFactory(itemPriority: ItemPriority): AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'STATIC_MEMBER' @ [156:111] ==> enum entry STATIC_MEMBER defined in org.jetbrains.kotlin.idea.completion.ItemPriority[FakeCallableDescriptorForObject]

'staticMembersCompletion' @ [157:21] ==> val staticMembersCompletion: StaticMembersCompletion? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'processMembersFromIndices' @ [157:45] ==> public final fun processMembersFromIndices(indicesHelper: KotlinIndicesHelper, processor: (DeclarationDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'indicesHelper' @ [157:71] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'invoke' @ [158:25] ==> public abstract operator fun invoke(p1: DeclarationDescriptor, p2: AbstractLookupElementFactory): Collection<LookupElement> defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [158:32] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'decoratedFactory' @ [158:36] ==> val decoratedFactory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[LocalVariableDescriptor]

'forEach' @ [158:54] ==> @HidesMembers public inline fun <T> Iterable<LookupElement>.forEach(action: (LookupElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'collector' @ [159:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElement' @ [159:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'it' @ [159:50] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flushToResultSet' @ [160:29] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'inheritanceSearcher' @ [169:9] ==> var inheritanceSearcher: InheritanceItemsSearcher? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete[LocalVariableDescriptor]

'search' @ [169:30] ==> public abstract fun search(nameFilter: (String) -> Boolean, consumer: (LookupElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.smart.InheritanceItemsSearcher[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [169:39] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'prefixMatches' @ [169:53] ==> public open fun prefixMatches(@NotNull p0: String): Boolean defined in com.intellij.codeInsight.completion.impl.CamelHumpMatcher[JavaMethodDescriptor]

'it' @ [169:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [170:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElement' @ [170:23] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'it' @ [170:34] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'flushToResultSet' @ [171:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'nameExpression' @ [177:13] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'CallTypeAndReceiver' @ [178:39] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'detect' @ [178:59] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'nameExpression' @ [178:66] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [179:24] ==> val callTypeAndReceiver: CallTypeAndReceiver.INFIX defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'receiver' @ [179:44] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.INFIX[DeserializedPropertyDescriptor]

'getCall' @ [179:53] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [179:61] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'call' @ [180:17] ==> val call: Call? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'call' @ [180:33] ==> val call: Call? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'functionLiteralArguments' @ [180:38] ==> public final val Call.functionLiteralArguments: List<(LambdaArgument..LambdaArgument?)>[MyPropertyDescriptor]

'isEmpty' @ [180:63] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'UnsupportedOperationException' @ [182:64] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [183:66] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [186:54] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'call' @ [190:38] ==> val call: Call? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'valueArguments' @ [190:43] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'listOf' @ [190:60] ==> public fun <T> listOf(element: <no name provided>): List<<no name provided>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'dummyArgument' @ [190:67] ==> val dummyArgument: <no name provided> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'DelegatingCall' @ [191:42] ==> public constructor DelegatingCall(@NotNull p0: Call) defined in org.jetbrains.kotlin.resolve.calls.util.DelegatingCall[JavaClassConstructorDescriptor]

'call' @ [191:57] ==> val call: Call? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'dummyArguments' @ [192:56] ==> val dummyArguments: List<(ValueArgument..ValueArgument?)> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'listOf' @ [193:66] ==> public fun <T> listOf(element: <no name provided>): List<<no name provided>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'dummyArgument' @ [193:73] ==> val dummyArgument: <no name provided> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'UnsupportedOperationException' @ [194:65] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'ExpectedInfos' @ [197:37] ==> public constructor ExpectedInfos(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, indicesHelper: KotlinIndicesHelper?, useHeuristicSignatures: Boolean = ..., useOuterCallsExpectedTypeCount: Int = ...) defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedClassConstructorDescriptor]

'bindingContext' @ [197:51] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [197:67] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'indicesHelper' @ [197:85] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'calculateForArgument' @ [198:26] ==> public final fun calculateForArgument(call: Call, argument: ValueArgument): Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.core.ExpectedInfos[DeserializedSimpleFunctionDescriptor]

'dummyCall' @ [198:47] ==> val dummyCall: <no name provided> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'dummyArgument' @ [198:58] ==> val dummyArgument: <no name provided> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'collector' @ [199:17] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'addElements' @ [199:27] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'LambdaItems' @ [199:39] ==> public object LambdaItems defined in org.jetbrains.kotlin.idea.completion.smart in file LambdaItems.kt[FakeCallableDescriptorForObject]

'collect' @ [199:51] ==> public final fun collect(functionExpectedInfos: Collection<ExpectedInfo>): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.smart.LambdaItems[SimpleFunctionDescriptorImpl]

'expectedInfos' @ [199:59] ==> val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.addFunctionLiteralArgumentCompletions[LocalVariableDescriptor]

'super' @ [205:16] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[LazyClassReceiverParameterDescriptor]

'createSorter' @ [205:22] ==> protected open fun createSorter(): CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'weighBefore' @ [206:18] ==> public abstract fun weighBefore(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'KindWeigher' @ [206:30] ==> public object KindWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'toString' @ [206:42] ==> public open fun toString(): String defined in org.jetbrains.kotlin.idea.completion.KindWeigher[JavaMethodDescriptor]

'NameSimilarityWeigher' @ [206:54] ==> public object NameSimilarityWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion.smart in file NameSimilarity.kt[FakeCallableDescriptorForObject]

'SmartCompletionPriorityWeigher' @ [206:77] ==> public object SmartCompletionPriorityWeigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion in file Weighers.kt[FakeCallableDescriptorForObject]

'CallableReferenceWeigher' @ [206:109] ==> public constructor CallableReferenceWeigher(callType: CallType<*>) defined in org.jetbrains.kotlin.idea.completion.CallableReferenceWeigher[ClassConstructorDescriptorImpl]

'callTypeAndReceiver' @ [206:134] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'callType' @ [206:154] ==> public final val callType: CallType<out KtElement?> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'super' @ [210:16] ==> <this> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[LazyClassReceiverParameterDescriptor]

'createLookupElementFactory' @ [210:22] ==> protected open fun createLookupElementFactory(contextVariablesProvider: ContextVariablesProvider): LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'contextVariablesProvider' @ [210:49] ==> value-parameter contextVariablesProvider: ContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.createLookupElementFactory[ValueParameterDescriptorImpl]

'copy' @ [210:75] ==> public final fun copy(basicFactory: BasicLookupElementFactory = ..., receiverTypes: Collection<ReceiverType>? = ..., callType: CallType<*> = ..., inDescriptor: DeclarationDescriptor = ..., contextVariablesProvider: ContextVariablesProvider = ..., standardLookupElementsPostProcessor: (LookupElement) -> LookupElement = ...): LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'wrapStandardLookupElement' @ [211:57] ==> private final fun wrapStandardLookupElement(lookupElement: LookupElement): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[SimpleFunctionDescriptorImpl]

'it' @ [211:83] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.createLookupElementFactory.<anonymous>[ValueParameterDescriptorImpl]

'lookupElement' @ [216:27] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[ValueParameterDescriptorImpl]

'`object`' @ [216:41] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'descriptor' @ [216:78] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'lookupElement' @ [217:23] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[ValueParameterDescriptorImpl]

'descriptor' @ [219:13] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'descriptor' @ [219:49] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'valueParameters' @ [219:60] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [219:76] ==> @InlineOnly public inline fun <T> Collection<(ValueParameterDescriptor..ValueParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'element' @ [220:13] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'element' @ [220:23] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'keepOldArgumentListOnTab' @ [220:31] ==> public fun LookupElement.keepOldArgumentListOnTab(): LookupElement defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [223:13] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'bindingContext' @ [223:55] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession[PropertyDescriptorImpl]

'AUTO_CREATED_IT' @ [223:85] ==> public final val AUTO_CREATED_IT: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [223:102] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'element' @ [224:13] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'element' @ [224:23] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

'assignSmartCompletionPriority' @ [224:31] ==> public fun LookupElement.assignSmartCompletionPriority(priority: SmartCompletionItemPriority): LookupElement defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[SimpleFunctionDescriptorImpl]

'IT' @ [224:89] ==> enum entry IT defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'element' @ [227:16] ==> var element: LookupElement defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionSession.wrapStandardLookupElement[LocalVariableDescriptor]

