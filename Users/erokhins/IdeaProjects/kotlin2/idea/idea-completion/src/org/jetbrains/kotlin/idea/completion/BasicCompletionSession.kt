'CompletionSession' @ [80:5] ==> public constructor CompletionSession(configuration: CompletionSessionConfiguration, parameters: CompletionParameters, toFromOriginalFileMapper: ToFromOriginalFileMapper, resultSet: CompletionResultSet) defined in org.jetbrains.kotlin.idea.completion.CompletionSession[ClassConstructorDescriptorImpl]

'configuration' @ [80:23] ==> value-parameter configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'parameters' @ [80:38] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'toFromOriginalFileMapper' @ [80:50] ==> value-parameter toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'resultSet' @ [80:76] ==> value-parameter resultSet: CompletionResultSet defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'sorter' @ [89:53] ==> value-parameter sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.CompletionKind.addWeighers[ValueParameterDescriptorImpl]

'getValue' @ [92:35] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'detectCompletionKind' @ [92:42] ==> private final fun detectCompletionKind(): BasicCompletionSession.CompletionKind defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'completionKind' @ [95:17] ==> private final val completionKind: BasicCompletionSession.CompletionKind defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'descriptorKindFilter' @ [95:32] ==> public abstract val descriptorKindFilter: DescriptorKindFilter? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.CompletionKind[PropertyDescriptorImpl]

'expression' @ [97:35] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'let' @ [97:47] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> SmartCompletion): SmartCompletion defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> SmartCompletion

'SmartCompletion' @ [98:9] ==> public constructor SmartCompletion(expression: KtExpression, resolutionFacade: ResolutionFacade, bindingContext: BindingContext, moduleDescriptor: ModuleDescriptor, visibilityFilter: (DeclarationDescriptor) -> Boolean, indicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, inheritorSearchScope: GlobalSearchScope, toFromOriginalFileMapper: ToFromOriginalFileMapper, callTypeAndReceiver: CallTypeAndReceiver<*, *>, isJvmModule: Boolean, forBasicCompletion: Boolean = ...) defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[ClassConstructorDescriptorImpl]

'it' @ [99:17] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.smartCompletion.<anonymous>[ValueParameterDescriptorImpl]

'resolutionFacade' @ [99:21] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [99:39] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'moduleDescriptor' @ [99:55] ==> protected final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isVisibleFilter' @ [99:73] ==> protected final val isVisibleFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'indicesHelper' @ [99:90] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [99:112] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'EMPTY_SCOPE' @ [100:35] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'toFromOriginalFileMapper' @ [100:48] ==> value-parameter toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [100:74] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isJvmModule' @ [101:17] ==> protected final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'smartCompletion' @ [106:17] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'expectedInfos' @ [106:34] ==> public final val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[PropertyDescriptorImpl]

'emptyList' @ [106:51] ==> public fun <T> emptyList(): List<ExpectedInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'nameExpression' @ [109:13] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'when  {
                (position.parent as? KtNamedDeclaration)?.nameIdentifier == position -> DECLARATION_NAME

                else -> KEYWORDS_ONLY
            }' @ [110:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BasicCompletionSession.CompletionKind, entry1: BasicCompletionSession.CompletionKind): BasicCompletionSession.CompletionKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CompletionKind

'==' @ [111:17] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'position' @ [111:18] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'parent' @ [111:27] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nameIdentifier' @ [111:59] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'position' @ [111:77] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'DECLARATION_NAME' @ [111:89] ==> private final val DECLARATION_NAME: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'KEYWORDS_ONLY' @ [113:25] ==> private final val KEYWORDS_ONLY: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'OPERATOR_NAME' @ [117:13] ==> private final val OPERATOR_NAME: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isApplicable' @ [117:27] ==> public final fun isApplicable(): Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'OPERATOR_NAME' @ [118:20] ==> private final val OPERATOR_NAME: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'NamedArgumentCompletion' @ [120:13] ==> public object NamedArgumentCompletion defined in org.jetbrains.kotlin.idea.completion in file NamedArgumentCompletion.kt[FakeCallableDescriptorForObject]

'isOnlyNamedArgumentExpected' @ [120:37] ==> public final fun isOnlyNamedArgumentExpected(nameExpression: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.idea.completion.NamedArgumentCompletion[SimpleFunctionDescriptorImpl]

'nameExpression' @ [120:65] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'NAMED_ARGUMENTS_ONLY' @ [121:20] ==> private final val NAMED_ARGUMENTS_ONLY: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [124:13] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'getStrictParentOfType' @ [124:28] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtSuperExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperExpression

'SUPER_QUALIFIER' @ [125:20] ==> private final val SUPER_QUALIFIER: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'ALL' @ [128:16] ==> private final val ALL: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'completionKind' @ [132:15] ==> private final val completionKind: BasicCompletionSession.CompletionKind defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'shouldDisableAutoPopup' @ [132:30] ==> public open fun shouldDisableAutoPopup(): Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.CompletionKind[SimpleFunctionDescriptorImpl]

'super' @ [135:15] ==> <this> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[LazyClassReceiverParameterDescriptor]

'shouldCompleteTopLevelCallablesFromIndex' @ [135:21] ==> protected open fun shouldCompleteTopLevelCallablesFromIndex(): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'prefix' @ [135:67] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isNotEmpty' @ [135:74] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assert' @ [138:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameters' @ [138:16] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'completionType' @ [138:27] ==> public final val CompletionParameters.completionType: CompletionType[MyPropertyDescriptor]

'BASIC' @ [138:60] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'parameters' @ [140:13] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isAutoPopup' @ [140:24] ==> public final val CompletionParameters.isAutoPopup: Boolean[MyPropertyDescriptor]

'collector' @ [141:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addLookupElementPostProcessor' @ [141:23] ==> public final fun addLookupElementPostProcessor(processor: (LookupElement) -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [142:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'putUserData' @ [142:31] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Int..Int?)>, @Nullable p1: Int?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'AUTO_POPUP_AT' @ [142:63] ==> public final val AUTO_POPUP_AT: Key<Int> defined in org.jetbrains.kotlin.idea.completion.LookupCancelWatcher.Companion[PropertyDescriptorImpl]

'position' @ [142:78] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'startOffset' @ [142:87] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'lookupElement' @ [143:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'isInFunctionLiteralStart' @ [146:17] ==> private final fun isInFunctionLiteralStart(position: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'position' @ [146:42] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collector' @ [147:17] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addLookupElementPostProcessor' @ [147:27] ==> public final fun addLookupElementPostProcessor(processor: (LookupElement) -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [148:21] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'putUserData' @ [148:35] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING' @ [148:74] ==> public final val SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'Unit' @ [148:118] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lookupElement' @ [149:21] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'completionKind' @ [154:9] ==> private final val completionKind: BasicCompletionSession.CompletionKind defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'doComplete' @ [154:24] ==> public abstract fun doComplete(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.CompletionKind[SimpleFunctionDescriptorImpl]

'position' @ [158:20] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[ValueParameterDescriptorImpl]

'prevLeaf' @ [158:29] ==> public fun PsiElement.prevLeaf(filter: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [158:40] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [158:64] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart.<anonymous>[ValueParameterDescriptorImpl]

'prev' @ [159:13] ==> var prev: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[LocalVariableDescriptor]

'node' @ [159:19] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [159:25] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'LPAR' @ [159:49] ==> public final val LPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'prev' @ [160:13] ==> var prev: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[LocalVariableDescriptor]

'prev' @ [160:20] ==> var prev: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[LocalVariableDescriptor]

'prevLeaf' @ [160:26] ==> public fun PsiElement.prevLeaf(filter: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [160:37] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [160:61] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart.<anonymous>[ValueParameterDescriptorImpl]

'prev' @ [162:13] ==> var prev: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[LocalVariableDescriptor]

'node' @ [162:19] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [162:25] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'LBRACE' @ [162:49] ==> public final val LBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'prev' @ [163:31] ==> var prev: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[LocalVariableDescriptor]

'parent' @ [163:38] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'functionLiteral' @ [164:16] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[LocalVariableDescriptor]

'lBrace' @ [164:32] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'prev' @ [164:42] ==> var prev: PsiElement? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.isInFunctionLiteralStart[LocalVariableDescriptor]

'super' @ [168:22] ==> <this> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[LazyClassReceiverParameterDescriptor]

'createSorter' @ [168:28] ==> protected open fun createSorter(): CompletionSorter defined in org.jetbrains.kotlin.idea.completion.CompletionSession[SimpleFunctionDescriptorImpl]

'smartCompletion' @ [170:13] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'SmartCompletionInBasicWeigher' @ [171:49] ==> public constructor SmartCompletionInBasicWeigher(smartCompletion: SmartCompletion, callTypeAndReceiver: CallTypeAndReceiver<*, *>, resolutionFacade: ResolutionFacade, bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher[ClassConstructorDescriptorImpl]

'smartCompletion' @ [171:79] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [171:96] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [171:117] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [171:135] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'sorter' @ [172:13] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [172:22] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.createSorter[LocalVariableDescriptor]

'weighBefore' @ [172:29] ==> public abstract fun weighBefore(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'toString' @ [172:53] ==> public open fun toString(): String defined in org.jetbrains.kotlin.idea.completion.KindWeigher[JavaMethodDescriptor]

'smartCompletionInBasicWeigher' @ [173:41] ==> val smartCompletionInBasicWeigher: SmartCompletionInBasicWeigher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.createSorter[LocalVariableDescriptor]

'CallableReferenceWeigher' @ [174:41] ==> public constructor CallableReferenceWeigher(callType: CallType<*>) defined in org.jetbrains.kotlin.idea.completion.CallableReferenceWeigher[ClassConstructorDescriptorImpl]

'callTypeAndReceiver' @ [174:66] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callType' @ [174:86] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'sorter' @ [177:9] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.createSorter[LocalVariableDescriptor]

'completionKind' @ [177:18] ==> private final val completionKind: BasicCompletionSession.CompletionKind defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addWeighers' @ [177:33] ==> public open fun addWeighers(sorter: CompletionSorter): CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.CompletionKind[SimpleFunctionDescriptorImpl]

'sorter' @ [177:45] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.createSorter[LocalVariableDescriptor]

'sorter' @ [179:16] ==> var sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.createSorter[LocalVariableDescriptor]

'getValue' @ [183:68] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'callTypeAndReceiver' @ [184:26] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callType' @ [184:46] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'descriptorKindFilter' @ [184:55] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType[DeserializedPropertyDescriptor]

'filter' @ [186:17] ==> var filter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.descriptorKindFilter.<anonymous>[LocalVariableDescriptor]

'kindMask' @ [186:24] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [186:33] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PACKAGES_MASK' @ [186:58] ==> public final val PACKAGES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filter' @ [187:17] ==> var filter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.descriptorKindFilter.<anonymous>[LocalVariableDescriptor]

'filter' @ [187:26] ==> var filter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.descriptorKindFilter.<anonymous>[LocalVariableDescriptor]

'exclude' @ [187:33] ==> public final infix fun exclude(exclude: DescriptorKindExclude): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'TopLevelPackages' @ [187:63] ==> public object TopLevelPackages : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'filter' @ [190:13] ==> var filter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.descriptorKindFilter.<anonymous>[LocalVariableDescriptor]

'isStartOfExtensionReceiverFor' @ [194:31] ==> private final fun isStartOfExtensionReceiverFor(): KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [195:17] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'completeDeclarationNameFromUnresolvedOrOverride' @ [196:17] ==> private final fun completeDeclarationNameFromUnresolvedOrOverride(declaration: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'declaration' @ [196:65] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'parameters' @ [199:21] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'invocationCount' @ [199:32] ==> public final val CompletionParameters.invocationCount: Int[MyPropertyDescriptor]

'when (declaration) {
                        is KtNamedFunction, is KtProperty -> prefixMatcher.prefix.let { it.isEmpty() || it[0].isLowerCase() /* function name usually starts with lower case letter */ }
                        else -> true
                    }' @ [200:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'declaration' @ [200:57] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'prefixMatcher' @ [201:62] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prefix' @ [201:76] ==> public final val CamelHumpMatcher.prefix: String[MyPropertyDescriptor]

'let' @ [201:83] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'it' @ [201:89] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [201:92] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [201:105] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'isLowerCase' @ [201:111] ==> @InlineOnly public inline fun Char.isLowerCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'suppressOtherCompletion' @ [204:25] ==> val suppressOtherCompletion: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'smartCompletion' @ [209:21] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'component1' @ [210:26] ==> public final operator fun component1(): Collection<LookupElement> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [210:43] ==> public final operator fun component2(): InheritanceItemsSearcher? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'smartCompletion' @ [210:95] ==> private final val smartCompletion: SmartCompletion? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'additionalItems' @ [210:111] ==> public final fun additionalItems(lookupElementFactory: LookupElementFactory): Pair<Collection<LookupElement>, InheritanceItemsSearcher?> defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletion[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [210:127] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.completeWithSmartCompletion[ValueParameterDescriptorImpl]

'additionalItems' @ [213:34] ==> val additionalItems: Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.completeWithSmartCompletion[LocalVariableDescriptor]

'item' @ [214:29] ==> val item: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.completeWithSmartCompletion[LocalVariableDescriptor]

'getUserData' @ [214:34] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>): SmartCompletionItemPriority? defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority..org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority?)

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [214:46] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'item' @ [215:29] ==> val item: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.completeWithSmartCompletion[LocalVariableDescriptor]

'putUserData' @ [215:34] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>, @Nullable p1: SmartCompletionItemPriority?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority..org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority?)

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [215:46] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'DEFAULT' @ [215:110] ==> enum entry DEFAULT defined in org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority[FakeCallableDescriptorForObject]

'collector' @ [219:21] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElements' @ [219:31] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'additionalItems' @ [219:43] ==> val additionalItems: Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.completeWithSmartCompletion[LocalVariableDescriptor]

'withCollectRequiredContextVariableTypes' @ [223:58] ==> protected final fun withCollectRequiredContextVariableTypes(action: (LookupElementFactory) -> Unit): Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'completeWithSmartCompletion' @ [223:100] ==> local final fun completeWithSmartCompletion(lookupElementFactory: LookupElementFactory): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[SimpleFunctionDescriptorImpl]

'withCollectRequiredContextVariableTypes' @ [225:60] ==> protected final fun withCollectRequiredContextVariableTypes(action: (LookupElementFactory) -> Unit): Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'when {
                    prefix.isEmpty()
                    || callTypeAndReceiver.receiver != null
                    || CodeInsightSettings.getInstance().COMPLETION_CASE_SENSITIVE == CodeInsightSettings.NONE -> {
                        addReferenceVariantElements(lookupElementFactory, descriptorKindFilter)
                    }

                    prefix[0].isLowerCase() -> {
                        addReferenceVariantElements(lookupElementFactory, USUALLY_START_LOWER_CASE.intersect(descriptorKindFilter))
                        flushToResultSet()
                        addReferenceVariantElements(lookupElementFactory, USUALLY_START_UPPER_CASE.intersect(descriptorKindFilter))
                    }

                    else -> {
                        addReferenceVariantElements(lookupElementFactory, USUALLY_START_UPPER_CASE.intersect(descriptorKindFilter))
                        flushToResultSet()
                        addReferenceVariantElements(lookupElementFactory, USUALLY_START_LOWER_CASE.intersect(descriptorKindFilter))
                    }
                }' @ [226:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'prefix' @ [227:21] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isEmpty' @ [227:28] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [228:24] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'receiver' @ [228:44] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'==' @ [229:24] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [229:44] ==> public open fun getInstance(): (CodeInsightSettings..CodeInsightSettings?) defined in com.intellij.codeInsight.CodeInsightSettings[JavaMethodDescriptor]

'COMPLETION_CASE_SENSITIVE' @ [229:58] ==> public final var COMPLETION_CASE_SENSITIVE: Int defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'NONE' @ [229:107] ==> public const final val NONE: Int defined in com.intellij.codeInsight.CodeInsightSettings[JavaPropertyDescriptor]

'addReferenceVariantElements' @ [230:25] ==> private final fun addReferenceVariantElements(lookupElementFactory: LookupElementFactory, descriptorKindFilter: DescriptorKindFilter): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [230:53] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'descriptorKindFilter' @ [230:75] ==> public open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[PropertyDescriptorImpl]

'prefix' @ [233:21] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isLowerCase' @ [233:31] ==> @InlineOnly public inline fun Char.isLowerCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'addReferenceVariantElements' @ [234:25] ==> private final fun addReferenceVariantElements(lookupElementFactory: LookupElementFactory, descriptorKindFilter: DescriptorKindFilter): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [234:53] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'USUALLY_START_LOWER_CASE' @ [234:75] ==> private val USUALLY_START_LOWER_CASE: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion in file BasicCompletionSession.kt[PropertyDescriptorImpl]

'intersect' @ [234:100] ==> public final fun intersect(other: DescriptorKindFilter): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [234:110] ==> public open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[PropertyDescriptorImpl]

'flushToResultSet' @ [235:25] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'addReferenceVariantElements' @ [236:25] ==> private final fun addReferenceVariantElements(lookupElementFactory: LookupElementFactory, descriptorKindFilter: DescriptorKindFilter): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [236:53] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'USUALLY_START_UPPER_CASE' @ [236:75] ==> private val USUALLY_START_UPPER_CASE: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion in file BasicCompletionSession.kt[PropertyDescriptorImpl]

'intersect' @ [236:100] ==> public final fun intersect(other: DescriptorKindFilter): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [236:110] ==> public open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[PropertyDescriptorImpl]

'addReferenceVariantElements' @ [240:25] ==> private final fun addReferenceVariantElements(lookupElementFactory: LookupElementFactory, descriptorKindFilter: DescriptorKindFilter): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [240:53] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'USUALLY_START_UPPER_CASE' @ [240:75] ==> private val USUALLY_START_UPPER_CASE: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion in file BasicCompletionSession.kt[PropertyDescriptorImpl]

'intersect' @ [240:100] ==> public final fun intersect(other: DescriptorKindFilter): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [240:110] ==> public open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[PropertyDescriptorImpl]

'flushToResultSet' @ [241:25] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'addReferenceVariantElements' @ [242:25] ==> private final fun addReferenceVariantElements(lookupElementFactory: LookupElementFactory, descriptorKindFilter: DescriptorKindFilter): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [242:53] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'USUALLY_START_LOWER_CASE' @ [242:75] ==> private val USUALLY_START_LOWER_CASE: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion in file BasicCompletionSession.kt[PropertyDescriptorImpl]

'intersect' @ [242:100] ==> public final fun intersect(other: DescriptorKindFilter): DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptorKindFilter' @ [242:110] ==> public open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[PropertyDescriptorImpl]

'referenceVariantsCollector' @ [245:17] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collectingFinished' @ [245:46] ==> public final fun collectingFinished(): Unit defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'KEYWORDS_ONLY' @ [248:13] ==> private final val KEYWORDS_ONLY: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'doComplete' @ [248:27] ==> public open fun doComplete(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>[SimpleFunctionDescriptorImpl]

'callTypeAndReceiver' @ [251:17] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'receiver' @ [251:37] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'callTypeAndReceiver' @ [251:57] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callType' @ [251:77] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'descriptorKindFilter' @ [251:86] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType[DeserializedPropertyDescriptor]

'kindMask' @ [251:107] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedPropertyDescriptor]

'and' @ [251:116] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PACKAGES_MASK' @ [251:141] ==> public final val PACKAGES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'PackageIndexUtil' @ [253:36] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex[FakeCallableDescriptorForObject]

'getSubPackageFqNames' @ [253:53] ==> @JvmStatic public final fun getSubPackageFqNames(packageFqName: FqName, scope: GlobalSearchScope, project: Project, nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[DeserializedSimpleFunctionDescriptor]

'ROOT' @ [253:81] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'searchScope' @ [253:87] ==> protected final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'project' @ [253:100] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prefixMatcher' @ [253:109] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'asNameFilter' @ [253:123] ==> public fun PrefixMatcher.asNameFilter(): (Name) -> Boolean defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'toMutableSet' @ [254:26] ==> public fun <T> Iterable<FqName>.toMutableSet(): MutableSet<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'==' @ [256:21] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [256:44] ==> @NotNull public open fun getPlatform(@NotNull p0: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'parameters' @ [256:56] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'originalFile' @ [256:67] ==> public final val CompletionParameters.originalFile: PsiFile[MyPropertyDescriptor]

'JvmPlatform' @ [256:94] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'getInstance' @ [257:35] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [257:47] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'findPackage' @ [257:56] ==> @Nullable public abstract fun findPackage(@NonNls @NotNull p0: String): PsiPackage? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'getSubPackages' @ [257:73] ==> @NotNull public abstract fun getSubPackages(@NotNull p0: GlobalSearchScope): (Array<(PsiPackage..PsiPackage?)>..Array<out (PsiPackage..PsiPackage?)>) defined in com.intellij.psi.PsiPackage[JavaMethodDescriptor]

'searchScope' @ [257:88] ==> protected final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'forEach' @ [257:102] ==> public inline fun <T> Array<out (PsiPackage..PsiPackage?)>.forEach(action: ((PsiPackage..PsiPackage?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiPackage..com.intellij.psi.PsiPackage?)

'psiPackage' @ [258:36] ==> value-parameter psiPackage: (PsiPackage..PsiPackage?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [258:47] ==> public final val PsiPackage.name: String?[MyPropertyDescriptor]

'isValidIdentifier' @ [259:34] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [259:52] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'packageNames' @ [260:29] ==> val packageNames: MutableSet<FqName> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'add' @ [260:42] ==> public abstract fun add(element: FqName): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'FqName' @ [260:46] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'name' @ [260:53] ==> val name: String? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'packageNames' @ [265:17] ==> val packageNames: MutableSet<FqName> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'forEach' @ [265:30] ==> @HidesMembers public inline fun <T> Iterable<FqName>.forEach(action: (FqName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'collector' @ [265:40] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [265:50] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'basicLookupElementFactory' @ [265:61] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'createLookupElementForPackage' @ [265:87] ==> public final fun createLookupElementForPackage(name: FqName): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [265:117] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'flushToResultSet' @ [268:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'NamedArgumentCompletion' @ [270:13] ==> public object NamedArgumentCompletion defined in org.jetbrains.kotlin.idea.completion in file NamedArgumentCompletion.kt[FakeCallableDescriptorForObject]

'complete' @ [270:37] ==> public final fun complete(collector: LookupElementsCollector, expectedInfos: Collection<ExpectedInfo>, callType: CallType<*>): Unit defined in org.jetbrains.kotlin.idea.completion.NamedArgumentCompletion[SimpleFunctionDescriptorImpl]

'collector' @ [270:46] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'expectedInfos' @ [270:57] ==> protected open val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [270:72] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callType' @ [270:92] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'flushToResultSet' @ [271:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'RealContextVariablesProvider' @ [273:44] ==> public constructor RealContextVariablesProvider(referenceVariantsHelper: ReferenceVariantsHelper, contextElement: PsiElement) defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[ClassConstructorDescriptorImpl]

'referenceVariantsHelper' @ [273:73] ==> protected final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'position' @ [273:98] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'withContextVariablesProvider' @ [274:13] ==> protected final fun withContextVariablesProvider(contextVariablesProvider: ContextVariablesProvider, action: (LookupElementFactory) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'contextVariablesProvider' @ [274:42] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'receiverTypes' @ [275:21] ==> protected final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'ExtensionFunctionTypeValueCompletion' @ [276:21] ==> public constructor ExtensionFunctionTypeValueCompletion(receiverTypes: Collection<ReceiverType>, callType: CallType<*>, lookupElementFactory: LookupElementFactory) defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[ClassConstructorDescriptorImpl]

'receiverTypes' @ [276:58] ==> protected final val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [276:73] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callType' @ [276:93] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'lookupElementFactory' @ [276:103] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'processVariables' @ [277:30] ==> public final fun processVariables(variablesProvider: RealContextVariablesProvider): Collection<ExtensionFunctionTypeValueCompletion.Result> defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion[SimpleFunctionDescriptorImpl]

'contextVariablesProvider' @ [277:47] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'forEach' @ [278:30] ==> @HidesMembers public inline fun <T> Iterable<ExtensionFunctionTypeValueCompletion.Result>.forEach(action: (ExtensionFunctionTypeValueCompletion.Result) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'it' @ [279:54] ==> value-parameter it: ExtensionFunctionTypeValueCompletion.Result defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [279:57] ==> public final val factory: AbstractLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.Result[PropertyDescriptorImpl]

'createStandardLookupElementsForDescriptor' @ [279:65] ==> public abstract fun createStandardLookupElementsForDescriptor(descriptor: DeclarationDescriptor, useReceiverTypes: Boolean): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.AbstractLookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [279:107] ==> value-parameter it: ExtensionFunctionTypeValueCompletion.Result defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invokeDescriptor' @ [279:110] ==> public final val invokeDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.completion.ExtensionFunctionTypeValueCompletion.Result[PropertyDescriptorImpl]

'collector' @ [280:33] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElements' @ [280:43] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElements' @ [280:55] ==> val lookupElements: Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>.<anonymous>[LocalVariableDescriptor]

'contextVariableTypesForSmartCompletion' @ [284:21] ==> val contextVariableTypesForSmartCompletion: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'any' @ [284:60] ==> public inline fun <T> Iterable<FuzzyType>.any(predicate: (FuzzyType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'contextVariablesProvider' @ [284:66] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'functionTypeVariables' @ [284:91] ==> public open fun functionTypeVariables(requiredType: FuzzyType): Collection<Pair<VariableDescriptor, TypeSubstitutor>> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[SimpleFunctionDescriptorImpl]

'it' @ [284:113] ==> value-parameter it: FuzzyType defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [284:117] ==> @InlineOnly public inline fun <T> Collection<Pair<VariableDescriptor, TypeSubstitutor>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<VariableDescriptor, TypeSubstitutor>

'completeWithSmartCompletion' @ [285:21] ==> local final fun completeWithSmartCompletion(lookupElementFactory: LookupElementFactory): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [285:49] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'contextVariableTypesForReferenceVariants' @ [288:21] ==> val contextVariableTypesForReferenceVariants: Collection<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'any' @ [288:62] ==> public inline fun <T> Iterable<FuzzyType>.any(predicate: (FuzzyType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FuzzyType

'contextVariablesProvider' @ [288:68] ==> val contextVariablesProvider: RealContextVariablesProvider defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete[LocalVariableDescriptor]

'functionTypeVariables' @ [288:93] ==> public open fun functionTypeVariables(requiredType: FuzzyType): Collection<Pair<VariableDescriptor, TypeSubstitutor>> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[SimpleFunctionDescriptorImpl]

'it' @ [288:115] ==> value-parameter it: FuzzyType defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [288:119] ==> @InlineOnly public inline fun <T> Collection<Pair<VariableDescriptor, TypeSubstitutor>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<VariableDescriptor, TypeSubstitutor>

'component1' @ [289:26] ==> public final operator fun component1(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'component2' @ [289:36] ==> public final operator fun component2(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'referenceVariantsWithSingleFunctionTypeParameter' @ [289:51] ==> protected final fun referenceVariantsWithSingleFunctionTypeParameter(): ReferenceVariants? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'collector' @ [290:21] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [290:31] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'imported' @ [290:53] ==> val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'lookupElementFactory' @ [290:63] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [291:21] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [291:31] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'notImported' @ [291:53] ==> val notImported: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'lookupElementFactory' @ [291:66] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'StaticMembersCompletion' @ [294:47] ==> public constructor StaticMembersCompletion(prefixMatcher: PrefixMatcher, resolutionFacade: ResolutionFacade, lookupElementFactory: LookupElementFactory, alreadyAdded: Collection<DeclarationDescriptor>, isJvmModule: Boolean) defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[ClassConstructorDescriptorImpl]

'prefixMatcher' @ [295:25] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [296:25] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'lookupElementFactory' @ [297:25] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'referenceVariantsCollector' @ [298:25] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'allCollected' @ [298:54] ==> public final val allCollected: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[PropertyDescriptorImpl]

'imported' @ [298:67] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'isJvmModule' @ [299:25] ==> protected final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [300:21] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'staticMembersCompletion' @ [301:21] ==> val staticMembersCompletion: StaticMembersCompletion defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'completeFromImports' @ [301:45] ==> public final fun completeFromImports(file: KtFile, collector: LookupElementsCollector): Unit defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'file' @ [301:65] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collector' @ [301:71] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'completeNonImported' @ [304:17] ==> private final fun completeNonImported(lookupElementFactory: LookupElementFactory): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [304:37] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'flushToResultSet' @ [305:17] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'isDebuggerContext' @ [307:21] ==> protected final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'getRuntimeReceiverTypeReferenceVariants' @ [308:46] ==> protected final fun getRuntimeReceiverTypeReferenceVariants(lookupElementFactory: LookupElementFactory): Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'lookupElementFactory' @ [308:86] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'variantsAndFactory' @ [309:25] ==> val variantsAndFactory: Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'variantsAndFactory' @ [310:40] ==> val variantsAndFactory: Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'first' @ [310:59] ==> public final val first: ReferenceVariants defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Suppress' @ [311:25] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'variantsAndFactory' @ [311:80] ==> val variantsAndFactory: Pair<ReferenceVariants, LookupElementFactory>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'second' @ [311:99] ==> public final val second: LookupElementFactory defined in kotlin.Pair[DeserializedPropertyDescriptor]

'collector' @ [312:25] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [312:35] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'variants' @ [312:57] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'imported' @ [312:66] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'lookupElementFactory' @ [312:76] ==> val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'collector' @ [313:25] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [313:35] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'variants' @ [313:57] ==> val variants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'notImportedExtensions' @ [313:66] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'lookupElementFactory' @ [313:89] ==> val lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'flushToResultSet' @ [314:25] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'configuration' @ [318:21] ==> value-parameter configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'staticMembers' @ [318:35] ==> public final val staticMembers: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [318:52] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prefix' @ [318:106] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isNotEmpty' @ [318:113] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'staticMembersCompletion' @ [319:21] ==> val staticMembersCompletion: StaticMembersCompletion defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'completeFromIndices' @ [319:45] ==> public final fun completeFromIndices(indicesHelper: KotlinIndicesHelper, collector: LookupElementsCollector): Unit defined in org.jetbrains.kotlin.idea.completion.StaticMembersCompletion[SimpleFunctionDescriptorImpl]

'indicesHelper' @ [319:65] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'collector' @ [319:87] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'shouldCompleteTopLevelCallablesFromIndex' @ [325:17] ==> protected open fun shouldCompleteTopLevelCallablesFromIndex(): Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'processTopLevelCallables' @ [326:17] ==> protected final fun processTopLevelCallables(processor: (CallableDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'collector' @ [327:21] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [327:31] ==> public final fun addDescriptorElements(descriptor: DeclarationDescriptor, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'it' @ [327:53] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'lookupElementFactory' @ [327:57] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[ValueParameterDescriptorImpl]

'flushToResultSet' @ [328:21] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'if (callTypeAndReceiver.receiver == null && prefix.isNotEmpty()) {
                val classKindFilter: ((ClassKind) -> Boolean)?
                val includeTypeAliases: Boolean
                includeTypeAliases = when (callTypeAndReceiver) {
                    is CallTypeAndReceiver.ANNOTATION -> {
                        classKindFilter = { it == ClassKind.ANNOTATION_CLASS }
                        true
                    }

                    is CallTypeAndReceiver.DEFAULT, is CallTypeAndReceiver.TYPE -> {
                        classKindFilter = { it != ClassKind.ENUM_ENTRY }
                        true
                    }

                    else -> {
                        classKindFilter = null
                        false
                    }
                }

                if (classKindFilter != null) {
                    val prefixMatcher = if (configuration.useBetterPrefixMatcherForNonImportedClasses)
                        BetterPrefixMatcher(prefixMatcher, collector.bestMatchingDegree)
                    else
                        prefixMatcher
                    addClassesFromIndex(classKindFilter, includeTypeAliases, prefixMatcher)
                }
            }
            else if (callTypeAndReceiver is CallTypeAndReceiver.DOT) {
                val qualifier = bindingContext[BindingContext.QUALIFIER, callTypeAndReceiver.receiver]
                if (qualifier != null) return
                val receiver = callTypeAndReceiver.receiver as? KtSimpleNameExpression ?: return

                val helper = indicesHelper(false)

                val descriptors = mutableListOf<ClassifierDescriptorWithTypeParameters>()

                val fullTextPrefixMatcher = object : PrefixMatcher(receiver.getReferencedName()) {
                    override fun prefixMatches(name: String): Boolean = name == prefix

                    override fun cloneWithPrefix(prefix: String): PrefixMatcher {
                        throw UnsupportedOperationException("Not implemented")
                    }
                }

                AllClassesCompletion(parameters.withPosition(receiver, receiver.startOffset), helper, fullTextPrefixMatcher, resolutionFacade,
                                     { true }, true, configuration.javaClassesNotToBeUsed
                ).collect({ descriptors += it }, { descriptors.addIfNotNull(it.resolveToDescriptor(resolutionFacade)) })

                val foundDescriptors = mutableSetOf<DeclarationDescriptor>()
                descriptors.asSequence()
                        .filter {
                            it.kind == ClassKind.OBJECT ||
                            it.kind == ClassKind.ENUM_CLASS ||
                            it.kind == ClassKind.ENUM_ENTRY ||
                            it.hasCompanionObject ||
                            it is JavaClassDescriptor
                        }
                        .forEach { classifier ->
                            val scope = nameExpression?.getResolutionScope(bindingContext) ?: return

                            val desc = classifier.getImportableDescriptor()
                            val newScope = scope.addImportingScope(ExplicitImportsScope(listOf(desc)))

                            val newContext = (nameExpression.parent as KtExpression).analyzeInContext(newScope)

                            val rvHelper = ReferenceVariantsHelper(newContext,
                                                                   resolutionFacade,
                                                                   moduleDescriptor,
                                                                   isVisibleFilter,
                                                                   NotPropertiesService.getNotProperties(position))
                            val rvCollector = ReferenceVariantsCollector(rvHelper, indicesHelper(true), prefixMatcher,
                                                                         nameExpression, callTypeAndReceiver, resolutionFacade, newContext,
                                                                         importableFqNameClassifier, configuration)

                            val receiverTypes = detectReceiverTypes(newContext, nameExpression, callTypeAndReceiver)

                            val factory = lookupElementFactory.copy(receiverTypes = receiverTypes, standardLookupElementsPostProcessor = {

                                lookupElement ->
                                val lookupDescriptor = (lookupElement.`object` as? DeclarationLookupObject)
                                                               ?.descriptor as? MemberDescriptor ?: return@copy lookupElement

                                if (!desc.isAncestorOf(lookupDescriptor, false)) return@copy lookupElement

                                if (lookupDescriptor is CallableMemberDescriptor &&
                                    lookupDescriptor.isExtension &&
                                    lookupDescriptor.extensionReceiverParameter?.importableFqName != desc.fqNameSafe) {
                                    return@copy lookupElement
                                }

                                val fqNameToImport = lookupDescriptor.containingDeclaration.importableFqName ?: return@copy lookupElement

                                object : LookupElementDecorator<LookupElement>(lookupElement) {
                                    val name = fqNameToImport.shortName()
                                    val packageName = fqNameToImport.parent()

                                    override fun handleInsert(context: InsertionContext) {
                                        super.handleInsert(context)
                                        context.commitDocument()
                                        val file = context.file as? KtFile
                                        if (file != null) {
                                            val receiverInFile = file.findElementAt(receiver.startOffset)?.getParentOfType<KtSimpleNameExpression>(false) ?: return
                                            receiverInFile.mainReference.bindToFqName(fqNameToImport, FORCED_SHORTENING)
                                        }
                                    }

                                    override fun renderElement(presentation: LookupElementPresentation?) {
                                        super.renderElement(presentation)
                                        presentation?.appendTailText(" for $name in $packageName", true)
                                    }
                                }
                            })


                            rvCollector.collectReferenceVariants(descriptorKindFilter) { (imported, notImportedExtensions) ->

                                val unique = imported.asSequence()
                                        .filterNot { it.original in foundDescriptors }
                                        .onEach { foundDescriptors += it.original }

                                val uniqueNotImportedExtensions = notImportedExtensions.asSequence()
                                        .filterNot { it.original in foundDescriptors }
                                        .onEach { foundDescriptors += it.original }

                                collector.addDescriptorElements(unique.toList(), factory)
                                collector.addDescriptorElements(uniqueNotImportedExtensions.toList(), factory, notImported = true)

                                flushToResultSet()
                            }
                        }
            }' @ [332:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'callTypeAndReceiver' @ [332:17] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'receiver' @ [332:37] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'prefix' @ [332:57] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isNotEmpty' @ [332:64] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'includeTypeAliases' @ [335:17] ==> val includeTypeAliases: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'when (callTypeAndReceiver) {
                    is CallTypeAndReceiver.ANNOTATION -> {
                        classKindFilter = { it == ClassKind.ANNOTATION_CLASS }
                        true
                    }

                    is CallTypeAndReceiver.DEFAULT, is CallTypeAndReceiver.TYPE -> {
                        classKindFilter = { it != ClassKind.ENUM_ENTRY }
                        true
                    }

                    else -> {
                        classKindFilter = null
                        false
                    }
                }' @ [335:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'callTypeAndReceiver' @ [335:44] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'classKindFilter' @ [337:25] ==> val classKindFilter: ((ClassKind) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'it' @ [337:45] ==> value-parameter it: ClassKind defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'ANNOTATION_CLASS' @ [337:61] ==> enum entry ANNOTATION_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'classKindFilter' @ [342:25] ==> val classKindFilter: ((ClassKind) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'it' @ [342:45] ==> value-parameter it: ClassKind defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'ENUM_ENTRY' @ [342:61] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'classKindFilter' @ [347:25] ==> val classKindFilter: ((ClassKind) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'classKindFilter' @ [352:21] ==> val classKindFilter: ((ClassKind) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'if (configuration.useBetterPrefixMatcherForNonImportedClasses)
                        BetterPrefixMatcher(prefixMatcher, collector.bestMatchingDegree)
                    else
                        prefixMatcher' @ [353:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PrefixMatcher, elseBranch: PrefixMatcher): PrefixMatcher[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PrefixMatcher

'configuration' @ [353:45] ==> value-parameter configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'useBetterPrefixMatcherForNonImportedClasses' @ [353:59] ==> public final val useBetterPrefixMatcherForNonImportedClasses: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'BetterPrefixMatcher' @ [354:25] ==> public constructor BetterPrefixMatcher(p0: (PrefixMatcher..PrefixMatcher?), p1: Int) defined in com.intellij.codeInsight.completion.impl.BetterPrefixMatcher[JavaClassConstructorDescriptor]

'prefixMatcher' @ [354:45] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collector' @ [354:60] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'bestMatchingDegree' @ [354:70] ==> public final var bestMatchingDegree: Int defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[PropertyDescriptorImpl]

'prefixMatcher' @ [356:25] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addClassesFromIndex' @ [357:21] ==> private final fun addClassesFromIndex(kindFilter: (ClassKind) -> Boolean, includeTypeAliases: Boolean, prefixMatcher: PrefixMatcher): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'classKindFilter' @ [357:41] ==> val classKindFilter: ((ClassKind) -> Boolean)? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'includeTypeAliases' @ [357:58] ==> val includeTypeAliases: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'prefixMatcher' @ [357:78] ==> val prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'callTypeAndReceiver' @ [360:22] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [361:33] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'QUALIFIER' @ [361:63] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callTypeAndReceiver' @ [361:74] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'receiver' @ [361:94] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.DOT[DeserializedPropertyDescriptor]

'qualifier' @ [362:21] ==> val qualifier: Qualifier? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'callTypeAndReceiver' @ [363:32] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'receiver' @ [363:52] ==> public final val receiver: KtExpression defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.DOT[DeserializedPropertyDescriptor]

'indicesHelper' @ [365:30] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'mutableListOf' @ [367:35] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'PrefixMatcher' @ [369:54] ==> protected/*protected and package*/ constructor PrefixMatcher(p0: (String..String?)) defined in com.intellij.codeInsight.completion.PrefixMatcher[JavaClassConstructorDescriptor]

'receiver' @ [369:68] ==> val receiver: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'getReferencedName' @ [369:77] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'name' @ [370:73] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<no name provided>.prefixMatches[ValueParameterDescriptorImpl]

'prefix' @ [370:81] ==> public final val <no name provided>.prefix: String[MyPropertyDescriptor]

'UnsupportedOperationException' @ [373:31] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'AllClassesCompletion' @ [377:17] ==> public constructor AllClassesCompletion(parameters: CompletionParameters, kotlinIndicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, resolutionFacade: ResolutionFacade, kindFilter: (ClassKind) -> Boolean, includeTypeAliases: Boolean, includeJavaClassesNotToBeUsed: Boolean) defined in org.jetbrains.kotlin.idea.completion.AllClassesCompletion[ClassConstructorDescriptorImpl]

'parameters' @ [377:38] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'withPosition' @ [377:49] ==> @NotNull public open fun withPosition(@NotNull p0: PsiElement, p1: Int): CompletionParameters defined in com.intellij.codeInsight.completion.CompletionParameters[JavaMethodDescriptor]

'receiver' @ [377:62] ==> val receiver: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'receiver' @ [377:72] ==> val receiver: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'startOffset' @ [377:81] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'helper' @ [377:95] ==> val helper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'fullTextPrefixMatcher' @ [377:103] ==> val fullTextPrefixMatcher: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'resolutionFacade' @ [377:126] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'configuration' @ [378:54] ==> value-parameter configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'javaClassesNotToBeUsed' @ [378:68] ==> public final val javaClassesNotToBeUsed: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'collect' @ [379:19] ==> public final fun collect(classifierDescriptorCollector: (ClassifierDescriptorWithTypeParameters) -> Unit, javaClassCollector: (PsiClass) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.AllClassesCompletion[SimpleFunctionDescriptorImpl]

'descriptors' @ [379:29] ==> val descriptors: MutableList<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'it' @ [379:44] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'descriptors' @ [379:52] ==> val descriptors: MutableList<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'addIfNotNull' @ [379:64] ==> public fun <T : Any> MutableCollection<ClassifierDescriptorWithTypeParameters>.addIfNotNull(t: ClassifierDescriptorWithTypeParameters?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassifierDescriptorWithTypeParameters

'it' @ [379:77] ==> value-parameter it: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [379:80] ==> public fun PsiClass.resolveToDescriptor(resolutionFacade: ResolutionFacade, declarationTranslator: (KtClassOrObject) -> KtClassOrObject? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [379:100] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'mutableSetOf' @ [381:40] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptors' @ [382:17] ==> val descriptors: MutableList<ClassifierDescriptorWithTypeParameters> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'asSequence' @ [382:29] ==> public fun <T> Iterable<ClassifierDescriptorWithTypeParameters>.asSequence(): Sequence<ClassifierDescriptorWithTypeParameters> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'filter' @ [383:26] ==> public fun <T> Sequence<ClassifierDescriptorWithTypeParameters>.filter(predicate: (ClassifierDescriptorWithTypeParameters) -> Boolean): Sequence<ClassifierDescriptorWithTypeParameters> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'it' @ [384:29] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [384:32] ==> public val ClassifierDescriptorWithTypeParameters.kind: ClassKind? defined in org.jetbrains.kotlin.util[DeserializedPropertyDescriptor]

'OBJECT' @ [384:50] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'it' @ [385:29] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [385:32] ==> public val ClassifierDescriptorWithTypeParameters.kind: ClassKind? defined in org.jetbrains.kotlin.util[DeserializedPropertyDescriptor]

'ENUM_CLASS' @ [385:50] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'it' @ [386:29] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [386:32] ==> public val ClassifierDescriptorWithTypeParameters.kind: ClassKind? defined in org.jetbrains.kotlin.util[DeserializedPropertyDescriptor]

'ENUM_ENTRY' @ [386:50] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'it' @ [387:29] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'hasCompanionObject' @ [387:32] ==> public val ClassifierDescriptorWithTypeParameters.hasCompanionObject: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'it' @ [388:29] ==> value-parameter it: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [390:26] ==> public inline fun <T> Sequence<ClassifierDescriptorWithTypeParameters>.forEach(action: (ClassifierDescriptorWithTypeParameters) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptorWithTypeParameters

'nameExpression' @ [391:41] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'getResolutionScope' @ [391:57] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext): LexicalScope? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [391:76] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'classifier' @ [393:40] ==> value-parameter classifier: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[ValueParameterDescriptorImpl]

'getImportableDescriptor' @ [393:51] ==> public fun DeclarationDescriptor.getImportableDescriptor(): DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'scope' @ [394:44] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'addImportingScope' @ [394:50] ==> public fun LexicalScope.addImportingScope(importScope: ImportingScope): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'ExplicitImportsScope' @ [394:68] ==> public constructor ExplicitImportsScope(descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.resolve.scopes.ExplicitImportsScope[DeserializedClassConstructorDescriptor]

'listOf' @ [394:89] ==> public fun <T> listOf(element: DeclarationDescriptor): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'desc' @ [394:96] ==> val desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'nameExpression' @ [396:47] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'parent' @ [396:62] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'analyzeInContext' @ [396:86] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'newScope' @ [396:103] ==> val newScope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'ReferenceVariantsHelper' @ [398:44] ==> public constructor ReferenceVariantsHelper(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, moduleDescriptor: ModuleDescriptor, visibilityFilter: (DeclarationDescriptor) -> Boolean, notProperties: Set<FqNameUnsafe> = ...) defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedClassConstructorDescriptor]

'newContext' @ [398:68] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'resolutionFacade' @ [399:68] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'moduleDescriptor' @ [400:68] ==> protected final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isVisibleFilter' @ [401:68] ==> protected final val isVisibleFilter: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'getNotProperties' @ [402:89] ==> public final fun getNotProperties(element: PsiElement): Set<FqNameUnsafe> defined in org.jetbrains.kotlin.idea.core.NotPropertiesService.Companion[DeserializedSimpleFunctionDescriptor]

'position' @ [402:106] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'ReferenceVariantsCollector' @ [403:47] ==> public constructor ReferenceVariantsCollector(referenceVariantsHelper: ReferenceVariantsHelper, indicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, nameExpression: KtSimpleNameExpression, callTypeAndReceiver: CallTypeAndReceiver<*, *>, resolutionFacade: ResolutionFacade, bindingContext: BindingContext, importableFqNameClassifier: ImportableFqNameClassifier, configuration: CompletionSessionConfiguration, runtimeReceiver: ExpressionReceiver? = ...) defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[ClassConstructorDescriptorImpl]

'rvHelper' @ [403:74] ==> val rvHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'indicesHelper' @ [403:84] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [403:105] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [404:74] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [404:90] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [404:111] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'newContext' @ [404:129] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'importableFqNameClassifier' @ [405:74] ==> protected final val importableFqNameClassifier: ImportableFqNameClassifier defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'configuration' @ [405:102] ==> value-parameter configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'detectReceiverTypes' @ [407:49] ==> protected final fun detectReceiverTypes(bindingContext: BindingContext, nameExpression: KtSimpleNameExpression, callTypeAndReceiver: CallTypeAndReceiver<*, *>): Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'newContext' @ [407:69] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'nameExpression' @ [407:81] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [407:97] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'lookupElementFactory' @ [409:43] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[ValueParameterDescriptorImpl]

'copy' @ [409:64] ==> public final fun copy(basicFactory: BasicLookupElementFactory = ..., receiverTypes: Collection<ReceiverType>? = ..., callType: CallType<*> = ..., inDescriptor: DeclarationDescriptor = ..., contextVariablesProvider: ContextVariablesProvider = ..., standardLookupElementsPostProcessor: (LookupElement) -> LookupElement = ...): LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.LookupElementFactory[SimpleFunctionDescriptorImpl]

'receiverTypes' @ [409:85] ==> val receiverTypes: Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'?:' @ [412:56] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: MemberDescriptor?, right: MemberDescriptor): MemberDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MemberDescriptor

'lookupElement' @ [412:57] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'`object`' @ [412:71] ==> public final val LookupElement.`object`: Any[MyPropertyDescriptor]

'descriptor' @ [413:66] ==> public abstract val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.completion.DeclarationLookupObject[DeserializedPropertyDescriptor]

'lookupElement' @ [413:113] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [415:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'desc' @ [415:38] ==> val desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'isAncestorOf' @ [415:43] ==> public fun DeclarationDescriptor.isAncestorOf(descriptor: DeclarationDescriptor, strict: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'lookupDescriptor' @ [415:56] ==> val lookupDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lookupElement' @ [415:94] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupDescriptor' @ [417:37] ==> val lookupDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lookupDescriptor' @ [418:37] ==> val lookupDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isExtension' @ [418:54] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'lookupDescriptor' @ [419:37] ==> val lookupDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'extensionReceiverParameter' @ [419:54] ==> public final val CallableMemberDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'importableFqName' @ [419:82] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'desc' @ [419:102] ==> val desc: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'fqNameSafe' @ [419:107] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'lookupElement' @ [420:49] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lookupDescriptor' @ [423:54] ==> val lookupDescriptor: MemberDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [423:71] ==> public final val MemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'importableFqName' @ [423:93] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'lookupElement' @ [423:125] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LookupElementDecorator<LookupElement>' @ [425:42] ==> protected/*protected and package*/ constructor LookupElementDecorator<T : (LookupElement..LookupElement?)>(p0: (LookupElement..LookupElement?)) defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LookupElement..LookupElement?)> -> LookupElement

'lookupElement' @ [425:80] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqNameToImport' @ [426:48] ==> val fqNameToImport: FqName defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'shortName' @ [426:63] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqNameToImport' @ [427:55] ==> val fqNameToImport: FqName defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parent' @ [427:70] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'super' @ [430:41] ==> <this> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'handleInsert' @ [430:47] ==> public open fun handleInsert(p0: (InsertionContext..InsertionContext?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'context' @ [430:60] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'context' @ [431:41] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'commitDocument' @ [431:49] ==> public open fun commitDocument(): Unit defined in com.intellij.codeInsight.completion.InsertionContext[JavaMethodDescriptor]

'context' @ [432:52] ==> value-parameter context: InsertionContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.handleInsert[ValueParameterDescriptorImpl]

'file' @ [432:60] ==> public final val InsertionContext.file: PsiFile[MyPropertyDescriptor]

'file' @ [433:45] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.handleInsert[LocalVariableDescriptor]

'file' @ [434:66] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.handleInsert[LocalVariableDescriptor]

'findElementAt' @ [434:71] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'receiver' @ [434:85] ==> val receiver: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'startOffset' @ [434:94] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getParentOfType' @ [434:108] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'receiverInFile' @ [435:45] ==> val receiverInFile: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.handleInsert[LocalVariableDescriptor]

'mainReference' @ [435:60] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'bindToFqName' @ [435:74] ==> public final fun bindToFqName(fqName: FqName, shorteningMode: KtSimpleNameReference.ShorteningMode = ...): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'fqNameToImport' @ [435:87] ==> val fqNameToImport: FqName defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'FORCED_SHORTENING' @ [435:103] ==> enum entry FORCED_SHORTENING defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference.ShorteningMode[FakeCallableDescriptorForObject]

'super' @ [440:41] ==> <this> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'renderElement' @ [440:47] ==> public open fun renderElement(p0: (LookupElementPresentation..LookupElementPresentation?)): Unit defined in com.intellij.codeInsight.lookup.LookupElementDecorator[JavaMethodDescriptor]

'presentation' @ [440:61] ==> value-parameter presentation: LookupElementPresentation? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'presentation' @ [441:41] ==> value-parameter presentation: LookupElementPresentation? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>.renderElement[ValueParameterDescriptorImpl]

'appendTailText' @ [441:55] ==> public open fun appendTailText(@NotNull p0: String, p1: Boolean): Unit defined in com.intellij.codeInsight.lookup.LookupElementPresentation[JavaMethodDescriptor]

'name' @ [441:77] ==> public final val name: Name defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'packageName' @ [441:86] ==> public final val packageName: FqName defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'rvCollector' @ [447:29] ==> val rvCollector: ReferenceVariantsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'collectReferenceVariants' @ [447:41] ==> public final fun collectReferenceVariants(descriptorKindFilter: DescriptorKindFilter, consumer: (ReferenceVariants) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [447:66] ==> public open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>[PropertyDescriptorImpl]

'component1' @ [447:91] ==> public final operator fun component1(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'component2' @ [447:101] ==> public final operator fun component2(): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[SimpleFunctionDescriptorImpl]

'imported' @ [449:46] ==> val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [449:55] ==> public fun <T> Iterable<DeclarationDescriptor>.asSequence(): Sequence<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'filterNot' @ [450:42] ==> public fun <T> Sequence<DeclarationDescriptor>.filterNot(predicate: (DeclarationDescriptor) -> Boolean): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [450:54] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [450:57] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'foundDescriptors' @ [450:69] ==> val foundDescriptors: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'onEach' @ [451:42] ==> @SinceKotlin public fun <T> Sequence<DeclarationDescriptor>.onEach(action: (DeclarationDescriptor) -> Unit): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'foundDescriptors' @ [451:51] ==> val foundDescriptors: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'it' @ [451:71] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [451:74] ==> public final val DeclarationDescriptor.original: DeclarationDescriptor[MyPropertyDescriptor]

'notImportedExtensions' @ [453:67] ==> val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [453:89] ==> public fun <T> Iterable<CallableDescriptor>.asSequence(): Sequence<CallableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'filterNot' @ [454:42] ==> public fun <T> Sequence<CallableDescriptor>.filterNot(predicate: (CallableDescriptor) -> Boolean): Sequence<CallableDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'it' @ [454:54] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [454:57] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'foundDescriptors' @ [454:69] ==> val foundDescriptors: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'onEach' @ [455:42] ==> @SinceKotlin public fun <T> Sequence<CallableDescriptor>.onEach(action: (CallableDescriptor) -> Unit): Sequence<CallableDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'foundDescriptors' @ [455:51] ==> val foundDescriptors: MutableSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported[LocalVariableDescriptor]

'it' @ [455:71] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [455:74] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'collector' @ [457:33] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [457:43] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'unique' @ [457:65] ==> val unique: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toList' @ [457:72] ==> public fun <T> Sequence<DeclarationDescriptor>.toList(): List<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'factory' @ [457:82] ==> val factory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'collector' @ [458:33] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [458:43] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'uniqueNotImportedExtensions' @ [458:65] ==> val uniqueNotImportedExtensions: Sequence<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toList' @ [458:93] ==> public fun <T> Sequence<CallableDescriptor>.toList(): List<CallableDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'factory' @ [458:103] ==> val factory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.completeNonImported.<anonymous>[LocalVariableDescriptor]

'flushToResultSet' @ [460:33] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'nameExpression' @ [467:28] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'parent' @ [467:45] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'userType' @ [468:17] ==> val userType: KtUserType defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'qualifier' @ [468:26] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'userType' @ [469:27] ==> val userType: KtUserType defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'parent' @ [469:36] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'userType' @ [470:17] ==> val userType: KtUserType defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'typeRef' @ [470:29] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'typeElement' @ [470:37] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'typeRef' @ [471:26] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'parent' @ [471:34] ==> public final val KtTypeReference.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                is KtNamedFunction -> parent.takeIf { typeRef == it.receiverTypeReference }
                is KtProperty -> parent.takeIf { typeRef == it.receiverTypeReference }
                else -> null
            }' @ [472:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallableDeclaration?, entry1: KtCallableDeclaration?, entry2: KtCallableDeclaration?): KtCallableDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallableDeclaration?

'parent' @ [472:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'parent' @ [473:39] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'takeIf' @ [473:46] ==> @InlineOnly @SinceKotlin public inline fun <T> KtNamedFunction.takeIf(predicate: (KtNamedFunction) -> Boolean): KtNamedFunction? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'typeRef' @ [473:55] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'it' @ [473:66] ==> value-parameter it: KtNamedFunction defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [473:69] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'parent' @ [474:34] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'takeIf' @ [474:41] ==> @InlineOnly @SinceKotlin public inline fun <T> KtProperty.takeIf(predicate: (KtProperty) -> Boolean): KtProperty? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'typeRef' @ [474:50] ==> val typeRef: KtTypeReference defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor[LocalVariableDescriptor]

'it' @ [474:61] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.ALL.<no name provided>.isStartOfExtensionReceiverFor.<anonymous>[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [474:64] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'HashSet' @ [485:34] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'keywordsToSkip' @ [489:21] ==> val keywordsToSkip: HashSet<String> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete[LocalVariableDescriptor]

'add' @ [489:36] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'lookupString' @ [489:40] ==> value-parameter lookupString: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume[ValueParameterDescriptorImpl]

'invoke' @ [490:41] ==> public abstract operator fun invoke(): LookupElement defined in kotlin.Function0[FunctionInvokeDescriptor]

'expectedInfos' @ [491:35] ==> protected open val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'any' @ [491:49] ==> public inline fun <T> Iterable<ExpectedInfo>.any(predicate: (ExpectedInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpectedInfo

'invoke' @ [492:37] ==> public abstract operator fun invoke(p1: ExpectedInfo): ExpectedInfoMatch defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [492:57] ==> value-parameter it: ExpectedInfo defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [493:25] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [493:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'match' @ [493:33] ==> val match: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume.<anonymous>[LocalVariableDescriptor]

'makeNotNullable' @ [493:39] ==> public final val makeNotNullable: Boolean defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[PropertyDescriptorImpl]

'match' @ [494:25] ==> val match: ExpectedInfoMatch defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume.<anonymous>[LocalVariableDescriptor]

'isMatch' @ [494:31] ==> public final fun isMatch(): Boolean defined in org.jetbrains.kotlin.idea.completion.smart.ExpectedInfoMatch[SimpleFunctionDescriptorImpl]

'matched' @ [496:25] ==> val matched: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume[LocalVariableDescriptor]

'lookupElement' @ [497:25] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume[LocalVariableDescriptor]

'putUserData' @ [497:39] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'KEYWORD_VALUE_MATCHED_KEY' @ [497:81] ==> public final val KEYWORD_VALUE_MATCHED_KEY: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.SmartCompletionInBasicWeigher.Companion[PropertyDescriptorImpl]

'Unit' @ [497:108] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lookupElement' @ [498:25] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume[LocalVariableDescriptor]

'putUserData' @ [498:39] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(SmartCompletionItemPriority..SmartCompletionItemPriority?)>, @Nullable p1: SmartCompletionItemPriority?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority..org.jetbrains.kotlin.idea.completion.smart.SmartCompletionItemPriority?)

'SMART_COMPLETION_ITEM_PRIORITY_KEY' @ [498:51] ==> public val SMART_COMPLETION_ITEM_PRIORITY_KEY: Key<SmartCompletionItemPriority> defined in org.jetbrains.kotlin.idea.completion.smart in file Utils.kt[PropertyDescriptorImpl]

'priority' @ [498:87] ==> value-parameter priority: SmartCompletionItemPriority defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume[ValueParameterDescriptorImpl]

'collector' @ [500:21] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [500:31] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [500:42] ==> val lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<no name provided>.consume[LocalVariableDescriptor]

'KeywordValues' @ [503:13] ==> public object KeywordValues defined in org.jetbrains.kotlin.idea.completion in file KeywordValues.kt[FakeCallableDescriptorForObject]

'process' @ [503:27] ==> public final fun process(consumer: KeywordValues.Consumer, callTypeAndReceiver: CallTypeAndReceiver<*, *>, bindingContext: BindingContext, resolutionFacade: ResolutionFacade, moduleDescriptor: ModuleDescriptor, isJvmModule: Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordValues[SimpleFunctionDescriptorImpl]

'keywordValueConsumer' @ [503:35] ==> val keywordValueConsumer: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete[LocalVariableDescriptor]

'callTypeAndReceiver' @ [503:57] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [503:78] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [503:94] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'moduleDescriptor' @ [503:112] ==> protected final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isJvmModule' @ [503:130] ==> protected final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prefix' @ [505:34] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'substringBefore' @ [505:41] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'position' @ [506:45] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prevLeaf' @ [506:54] ==> public fun PsiElement.prevLeaf(skipEmptyElements: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'node' @ [506:66] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [506:72] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'AT' @ [506:96] ==> public final val AT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KeywordCompletion' @ [507:13] ==> public object KeywordCompletion defined in org.jetbrains.kotlin.idea.completion in file KeywordCompletion.kt[FakeCallableDescriptorForObject]

'complete' @ [507:31] ==> public final fun complete(position: PsiElement, prefix: String, isJvmModule: Boolean, consumer: (LookupElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.KeywordCompletion[SimpleFunctionDescriptorImpl]

'expression' @ [507:40] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'parameters' @ [507:54] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'position' @ [507:65] ==> public final val CompletionParameters.position: PsiElement[MyPropertyDescriptor]

'keywordsPrefix' @ [507:75] ==> val keywordsPrefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete[LocalVariableDescriptor]

'isJvmModule' @ [507:91] ==> protected final val isJvmModule: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'lookupElement' @ [508:31] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'lookupString' @ [508:45] ==> public final val LookupElement.lookupString: String[MyPropertyDescriptor]

'keyword' @ [509:21] ==> val keyword: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'keywordsToSkip' @ [509:32] ==> val keywordsToSkip: HashSet<String> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete[LocalVariableDescriptor]

'when (keyword) {
                // if "this" is parsed correctly in the current context - insert it and all this@xxx items
                    "this" -> {
                        if (expression != null) {
                            collector.addElements(thisExpressionItems(bindingContext, expression, prefix, resolutionFacade).map { it.createLookupElement() })
                        }
                        else {
                            // for completion in secondary constructor delegation call
                            collector.addElement(lookupElement)
                        }
                    }

                // if "return" is parsed correctly in the current context - insert it and all return@xxx items
                    "return" -> {
                        if (expression != null) {
                            collector.addElements(returnExpressionItems(bindingContext, expression))
                        }
                    }

                    "break", "continue" -> {
                        if (expression != null) {
                            collector.addElements(breakOrContinueExpressionItems(expression, keyword))
                        }
                    }

                    "override" -> {
                        collector.addElement(lookupElement)

                        OverridesCompletion(collector, basicLookupElementFactory).complete(position, declaration = null)
                    }

                    "class" -> {
                        if (callTypeAndReceiver !is CallTypeAndReceiver.CALLABLE_REFERENCE) { // otherwise it should be handled by KeywordValues
                            collector.addElement(lookupElement)
                        }
                    }

                    "get" -> {
                        collector.addElement(lookupElement)

                        if (!isUseSiteAnnotationTarget) {
                            collector.addElement(createKeywordConstructLookupElement(project, keyword, "val v:Int get()=caret"))
                            collector.addElement(createKeywordConstructLookupElement(project, keyword, "val v:Int get(){caret}", trimSpacesAroundCaret = true))
                        }
                    }

                    "set" -> {
                        collector.addElement(lookupElement)

                        if (!isUseSiteAnnotationTarget) {
                            collector.addElement(createKeywordConstructLookupElement(project, keyword, "var v:Int set(value)=caret"))
                            collector.addElement(createKeywordConstructLookupElement(project, keyword, "var v:Int set(value){caret}", trimSpacesAroundCaret = true))
                        }
                    }

                    else -> collector.addElement(lookupElement)
                }' @ [511:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit, entry7: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'keyword' @ [511:23] ==> val keyword: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'if (expression != null) {
                            collector.addElements(thisExpressionItems(bindingContext, expression, prefix, resolutionFacade).map { it.createLookupElement() })
                        }
                        else {
                            // for completion in secondary constructor delegation call
                            collector.addElement(lookupElement)
                        }' @ [514:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [514:29] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collector' @ [515:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElements' @ [515:39] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'thisExpressionItems' @ [515:51] ==> public fun thisExpressionItems(bindingContext: BindingContext, position: KtExpression, prefix: String, resolutionFacade: ResolutionFacade): Collection<ThisItemLookupObject> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [515:71] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'expression' @ [515:87] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prefix' @ [515:99] ==> protected final val prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [515:107] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'map' @ [515:125] ==> public inline fun <T, R> Iterable<ThisItemLookupObject>.map(transform: (ThisItemLookupObject) -> (LookupElementBuilder..LookupElementBuilder?)): List<(LookupElementBuilder..LookupElementBuilder?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ThisItemLookupObject
    <R> -> (com.intellij.codeInsight.lookup.LookupElementBuilder..com.intellij.codeInsight.lookup.LookupElementBuilder?)

'it' @ [515:131] ==> value-parameter it: ThisItemLookupObject defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'createLookupElement' @ [515:134] ==> public fun ThisItemLookupObject.createLookupElement(): (LookupElementBuilder..LookupElementBuilder?) defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'collector' @ [519:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [519:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [519:50] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [525:29] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collector' @ [526:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElements' @ [526:39] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'returnExpressionItems' @ [526:51] ==> public fun returnExpressionItems(bindingContext: BindingContext, position: KtElement): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [526:73] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'expression' @ [526:89] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'expression' @ [531:29] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collector' @ [532:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElements' @ [532:39] ==> public final fun addElements(elements: Iterable<LookupElement>, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'breakOrContinueExpressionItems' @ [532:51] ==> public fun breakOrContinueExpressionItems(position: KtElement, breakOrContinue: String): Collection<LookupElement> defined in org.jetbrains.kotlin.idea.completion in file CompletionUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [532:82] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'keyword' @ [532:94] ==> val keyword: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'collector' @ [537:25] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [537:35] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [537:46] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'OverridesCompletion' @ [539:25] ==> public constructor OverridesCompletion(collector: LookupElementsCollector, lookupElementFactory: BasicLookupElementFactory) defined in org.jetbrains.kotlin.idea.completion.OverridesCompletion[ClassConstructorDescriptorImpl]

'collector' @ [539:45] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'basicLookupElementFactory' @ [539:56] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'complete' @ [539:83] ==> public final fun complete(position: PsiElement, declaration: KtCallableDeclaration?): Unit defined in org.jetbrains.kotlin.idea.completion.OverridesCompletion[SimpleFunctionDescriptorImpl]

'position' @ [539:92] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [543:29] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collector' @ [544:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [544:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [544:50] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [549:25] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [549:35] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [549:46] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [551:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUseSiteAnnotationTarget' @ [551:30] ==> val isUseSiteAnnotationTarget: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete[LocalVariableDescriptor]

'collector' @ [552:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [552:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'createKeywordConstructLookupElement' @ [552:50] ==> public fun createKeywordConstructLookupElement(project: Project, keyword: String, fileTextToReformat: String, trimSpacesAroundCaret: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers in file handlerUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [552:86] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'keyword' @ [552:95] ==> val keyword: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'collector' @ [553:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [553:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'createKeywordConstructLookupElement' @ [553:50] ==> public fun createKeywordConstructLookupElement(project: Project, keyword: String, fileTextToReformat: String, trimSpacesAroundCaret: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers in file handlerUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [553:86] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'keyword' @ [553:95] ==> val keyword: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'collector' @ [558:25] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [558:35] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [558:46] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [560:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUseSiteAnnotationTarget' @ [560:30] ==> val isUseSiteAnnotationTarget: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete[LocalVariableDescriptor]

'collector' @ [561:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [561:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'createKeywordConstructLookupElement' @ [561:50] ==> public fun createKeywordConstructLookupElement(project: Project, keyword: String, fileTextToReformat: String, trimSpacesAroundCaret: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers in file handlerUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [561:86] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'keyword' @ [561:95] ==> val keyword: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'collector' @ [562:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [562:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'createKeywordConstructLookupElement' @ [562:50] ==> public fun createKeywordConstructLookupElement(project: Project, keyword: String, fileTextToReformat: String, trimSpacesAroundCaret: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.handlers in file handlerUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [562:86] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'keyword' @ [562:95] ==> val keyword: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[LocalVariableDescriptor]

'collector' @ [566:29] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [566:39] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [566:50] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'NamedArgumentCompletion' @ [577:13] ==> public object NamedArgumentCompletion defined in org.jetbrains.kotlin.idea.completion in file NamedArgumentCompletion.kt[FakeCallableDescriptorForObject]

'complete' @ [577:37] ==> public final fun complete(collector: LookupElementsCollector, expectedInfos: Collection<ExpectedInfo>, callType: CallType<*>): Unit defined in org.jetbrains.kotlin.idea.completion.NamedArgumentCompletion[SimpleFunctionDescriptorImpl]

'collector' @ [577:46] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'expectedInfos' @ [577:57] ==> protected open val expectedInfos: Collection<ExpectedInfo> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callTypeAndReceiver' @ [577:72] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'callType' @ [577:92] ==> public final val callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'nameExpression' @ [586:17] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'nameExpression' @ [586:43] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'expression' @ [586:61] ==> protected final val expression: KtExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'position' @ [587:24] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'getParentOfType' @ [587:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtNamedFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedFunction

'func' @ [588:38] ==> val func: KtNamedFunction defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable[LocalVariableDescriptor]

'nameIdentifier' @ [588:43] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'nameExpression' @ [589:46] ==> protected final val nameExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'nextLeaf' @ [589:61] ==> public fun PsiElement.nextLeaf(filter: (PsiElement) -> Boolean): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [589:72] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [589:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable.<anonymous>[ValueParameterDescriptorImpl]

'elementType' @ [589:99] ==> public final val LeafPsiElement.elementType: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [589:123] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [590:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'func' @ [590:18] ==> val func: KtNamedFunction defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable[LocalVariableDescriptor]

'hasModifier' @ [590:23] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'OPERATOR_KEYWORD' @ [590:44] ==> public final val OPERATOR_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'identifierInNameExpression' @ [590:65] ==> val identifierInNameExpression: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable[LocalVariableDescriptor]

'funcNameIdentifier' @ [590:95] ==> val funcNameIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable[LocalVariableDescriptor]

'toFromOriginalFileMapper' @ [591:32] ==> value-parameter toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'toOriginalFile' @ [591:57] ==> public final fun <TElement : PsiElement> toOriginalFile(element: KtNamedFunction): KtNamedFunction? defined in org.jetbrains.kotlin.idea.completion.ToFromOriginalFileMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> KtNamedFunction

'func' @ [591:72] ==> val func: KtNamedFunction defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable[LocalVariableDescriptor]

'!' @ [592:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'originalFunc' @ [592:21] ==> val originalFunc: KtNamedFunction defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable[LocalVariableDescriptor]

'isTopLevel' @ [592:34] ==> public final val KtNamedFunction.isTopLevel: Boolean[MyPropertyDescriptor]

'originalFunc' @ [592:49] ==> val originalFunc: KtNamedFunction defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.OPERATOR_NAME.<no name provided>.isApplicable[LocalVariableDescriptor]

'isExtensionDeclaration' @ [592:62] ==> public fun PsiElement.isExtensionDeclaration(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'OperatorNameCompletion' @ [596:13] ==> public object OperatorNameCompletion defined in org.jetbrains.kotlin.idea.completion in file OperatorNameCompletion.kt[FakeCallableDescriptorForObject]

'doComplete' @ [596:36] ==> public final fun doComplete(collector: LookupElementsCollector, descriptorNameFilter: (String) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.OperatorNameCompletion[SimpleFunctionDescriptorImpl]

'collector' @ [596:47] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'descriptorNameFilter' @ [596:58] ==> protected final val descriptorNameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'flushToResultSet' @ [597:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'declaration' @ [606:31] ==> private final fun declaration(): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [607:17] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.doComplete[LocalVariableDescriptor]

'!' @ [607:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldCompleteParameterNameAndType' @ [607:48] ==> private final fun shouldCompleteParameterNameAndType(): Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'collector' @ [609:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addLookupElementPostProcessor' @ [609:23] ==> public final fun addLookupElementPostProcessor(processor: (LookupElement) -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [610:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'putUserData' @ [610:31] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING' @ [610:70] ==> public final val SUPPRESS_ITEM_SELECTION_BY_CHARS_ON_TYPING: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'Unit' @ [610:114] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lookupElement' @ [611:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'KEYWORDS_ONLY' @ [614:13] ==> private final val KEYWORDS_ONLY: <no name provided> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'doComplete' @ [614:27] ==> public open fun doComplete(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.KEYWORDS_ONLY.<no name provided>[SimpleFunctionDescriptorImpl]

'completeDeclarationNameFromUnresolvedOrOverride' @ [616:13] ==> private final fun completeDeclarationNameFromUnresolvedOrOverride(declaration: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'declaration' @ [616:61] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.doComplete[LocalVariableDescriptor]

'when (declaration) {
                is KtParameter ->
                    completeParameterNameAndType()

                is KtClassOrObject -> {
                    if (declaration.isTopLevel()) {
                        completeTopLevelClassName()
                    }
                }
            }' @ [618:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'declaration' @ [618:19] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.doComplete[LocalVariableDescriptor]

'completeParameterNameAndType' @ [620:21] ==> private final fun completeParameterNameAndType(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [623:25] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.doComplete[LocalVariableDescriptor]

'isTopLevel' @ [623:37] ==> public final fun isTopLevel(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'completeTopLevelClassName' @ [624:25] ==> private final fun completeTopLevelClassName(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'!=' @ [631:17] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.codeInsight.template.Template[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [631:33] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [631:45] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'getActiveTemplate' @ [631:54] ==> @Nullable public abstract fun getActiveTemplate(@NotNull p0: Editor): Template? defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'parameters' @ [631:72] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'editor' @ [631:83] ==> public final val CompletionParameters.editor: Editor[MyPropertyDescriptor]

'declaration' @ [633:17] ==> private final fun declaration(): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'LookupCancelWatcher' @ [634:21] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.LookupCancelWatcher[FakeCallableDescriptorForObject]

'getInstance' @ [634:41] ==> public final fun getInstance(project: Project): LookupCancelWatcher defined in org.jetbrains.kotlin.idea.completion.LookupCancelWatcher.Companion[SimpleFunctionDescriptorImpl]

'project' @ [634:53] ==> protected final val project: Project defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'wasAutoPopupRecentlyCancelled' @ [634:62] ==> public final fun wasAutoPopupRecentlyCancelled(editor: Editor, offset: Int): Boolean defined in org.jetbrains.kotlin.idea.completion.LookupCancelWatcher[SimpleFunctionDescriptorImpl]

'parameters' @ [634:92] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'editor' @ [634:103] ==> public final val CompletionParameters.editor: Editor[MyPropertyDescriptor]

'position' @ [634:111] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'startOffset' @ [634:120] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'shouldCompleteParameterNameAndType' @ [643:17] ==> private final fun shouldCompleteParameterNameAndType(): Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'sorter' @ [644:24] ==> value-parameter sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.addWeighers[ValueParameterDescriptorImpl]

'weighBefore' @ [644:31] ==> public abstract fun weighBefore(@NotNull p0: String, vararg p1: (LookupElementWeigher..LookupElementWeigher?)): (CompletionSorter..CompletionSorter?) defined in com.intellij.codeInsight.completion.CompletionSorter[JavaMethodDescriptor]

'Weigher' @ [644:84] ==> public object Weigher : LookupElementWeigher defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[FakeCallableDescriptorForObject]

'sorter' @ [646:20] ==> value-parameter sorter: CompletionSorter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.addWeighers[ValueParameterDescriptorImpl]

'ParameterNameAndTypeCompletion' @ [650:50] ==> public constructor ParameterNameAndTypeCompletion(collector: LookupElementsCollector, lookupElementFactory: BasicLookupElementFactory, prefixMatcher: PrefixMatcher, resolutionFacade: ResolutionFacade) defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[ClassConstructorDescriptorImpl]

'collector' @ [650:81] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'basicLookupElementFactory' @ [650:92] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prefixMatcher' @ [650:119] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [650:134] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'string' @ [653:50] ==> @NotNull public open fun string(): StringPattern defined in com.intellij.patterns.StandardPatterns[JavaMethodDescriptor]

'with' @ [653:59] ==> @NotNull public open fun with(p0: (PatternCondition<in (String..String?)>..PatternCondition<in (String..String?)>?)): StringPattern defined in com.intellij.patterns.StringPattern[JavaMethodDescriptor]

'PatternCondition<String>' @ [653:73] ==> public constructor PatternCondition<T : (Any..Any?)>(@Nullable @NonNls p0: String?) defined in com.intellij.patterns.PatternCondition[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'prefix' @ [654:85] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType.<no name provided>.accepts[ValueParameterDescriptorImpl]

'isNotEmpty' @ [654:92] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefix' @ [654:108] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType.<no name provided>.accepts[ValueParameterDescriptorImpl]

'last' @ [654:115] ==> public fun CharSequence.last(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isUpperCase' @ [654:122] ==> @InlineOnly public inline fun Char.isUpperCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'collector' @ [656:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'restartCompletionOnPrefixChange' @ [656:23] ==> public final fun restartCompletionOnPrefixChange(prefixCondition: ElementPattern<String>): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'prefixPattern' @ [656:55] ==> val prefixPattern: StringPattern defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType[LocalVariableDescriptor]

'collector' @ [658:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addLookupElementPostProcessor' @ [658:23] ==> public final fun addLookupElementPostProcessor(processor: (LookupElement) -> LookupElement): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'lookupElement' @ [659:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType.<anonymous>[ValueParameterDescriptorImpl]

'putUserData' @ [659:31] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Unit..Unit?)>, @Nullable p1: Unit?): Unit defined in com.intellij.codeInsight.lookup.LookupElement[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Unit..kotlin.Unit?)

'HIDE_LOOKUP_ON_COLON' @ [659:70] ==> public final val HIDE_LOOKUP_ON_COLON: Key<Unit> defined in org.jetbrains.kotlin.idea.completion.KotlinCompletionCharFilter.Companion[PropertyDescriptorImpl]

'Unit' @ [659:92] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'lookupElement' @ [660:17] ==> value-parameter lookupElement: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType.<anonymous>[ValueParameterDescriptorImpl]

'parameterNameAndTypeCompletion' @ [663:13] ==> val parameterNameAndTypeCompletion: ParameterNameAndTypeCompletion defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType[LocalVariableDescriptor]

'addFromParametersInFile' @ [663:44] ==> public final fun addFromParametersInFile(position: PsiElement, resolutionFacade: ResolutionFacade, visibilityFilter: (DeclarationDescriptor) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'position' @ [663:68] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolutionFacade' @ [663:78] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isVisibleFilterCheckAlways' @ [663:96] ==> protected final val isVisibleFilterCheckAlways: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'flushToResultSet' @ [664:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'parameterNameAndTypeCompletion' @ [666:13] ==> val parameterNameAndTypeCompletion: ParameterNameAndTypeCompletion defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType[LocalVariableDescriptor]

'addFromImportedClasses' @ [666:44] ==> public final fun addFromImportedClasses(position: PsiElement, bindingContext: BindingContext, visibilityFilter: (DeclarationDescriptor) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'position' @ [666:67] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'bindingContext' @ [666:77] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'isVisibleFilterCheckAlways' @ [666:93] ==> protected final val isVisibleFilterCheckAlways: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'flushToResultSet' @ [667:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'parameterNameAndTypeCompletion' @ [669:13] ==> val parameterNameAndTypeCompletion: ParameterNameAndTypeCompletion defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeParameterNameAndType[LocalVariableDescriptor]

'addFromAllClasses' @ [669:44] ==> public final fun addFromAllClasses(parameters: CompletionParameters, indicesHelper: KotlinIndicesHelper): Unit defined in org.jetbrains.kotlin.idea.completion.ParameterNameAndTypeCompletion[SimpleFunctionDescriptorImpl]

'parameters' @ [669:62] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'indicesHelper' @ [669:74] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'parameters' @ [673:24] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'originalFile' @ [673:35] ==> public final val CompletionParameters.originalFile: PsiFile[MyPropertyDescriptor]

'virtualFile' @ [673:48] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'nameWithoutExtension' @ [673:60] ==> public final val VirtualFile.nameWithoutExtension: String[MyPropertyDescriptor]

'!' @ [674:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidIdentifier' @ [674:24] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [674:42] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName[LocalVariableDescriptor]

'==' @ [674:51] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'identifier' @ [674:56] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [674:67] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName[LocalVariableDescriptor]

'render' @ [674:73] ==> public fun Name.render(): String defined in org.jetbrains.kotlin.renderer[DeserializedSimpleFunctionDescriptor]

'name' @ [674:85] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName[LocalVariableDescriptor]

'name' @ [674:93] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName[LocalVariableDescriptor]

'isUpperCase' @ [674:101] ==> @InlineOnly public inline fun Char.isUpperCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parameters' @ [675:18] ==> value-parameter parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.<init>[ValueParameterDescriptorImpl]

'originalFile' @ [675:29] ==> public final val CompletionParameters.originalFile: PsiFile[MyPropertyDescriptor]

'declarations' @ [675:53] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'any' @ [675:66] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.any(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [675:72] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [675:97] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [675:100] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'name' @ [675:108] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName[LocalVariableDescriptor]

'collector' @ [677:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [677:23] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'create' @ [677:55] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'name' @ [677:62] ==> val name: String defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.completeTopLevelClassName[LocalVariableDescriptor]

'position' @ [680:37] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'parent' @ [680:46] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'declaration' @ [683:29] ==> private final fun declaration(): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>[SimpleFunctionDescriptorImpl]

'parameter' @ [684:24] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.shouldCompleteParameterNameAndType[LocalVariableDescriptor]

'parent' @ [684:34] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'list' @ [685:25] ==> val list: KtParameterList defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.shouldCompleteParameterNameAndType[LocalVariableDescriptor]

'parent' @ [685:30] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (owner) {
                is KtCatchClause, is KtPropertyAccessor, is KtFunctionLiteral -> false
                is KtNamedFunction -> owner.nameIdentifier != null
                is KtPrimaryConstructor -> !owner.getContainingClassOrObject().isAnnotation()
                else -> true
            }' @ [686:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'owner' @ [686:26] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.shouldCompleteParameterNameAndType[LocalVariableDescriptor]

'owner' @ [688:39] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.shouldCompleteParameterNameAndType[LocalVariableDescriptor]

'nameIdentifier' @ [688:45] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'!' @ [689:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'owner' @ [689:45] ==> val owner: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.DECLARATION_NAME.<no name provided>.shouldCompleteParameterNameAndType[LocalVariableDescriptor]

'getContainingClassOrObject' @ [689:51] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'isAnnotation' @ [689:80] ==> public final fun isAnnotation(): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [697:21] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'NON_SINGLETON_CLASSIFIERS' @ [697:42] ==> @field:JvmField public final val NON_SINGLETON_CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'position' @ [700:33] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'parents' @ [700:42] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstIsInstanceOrNull' @ [700:50] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): KtClassOrObject? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtClassOrObject

'resolutionFacade' @ [701:35] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'resolveToDescriptor' @ [701:52] ==> public abstract fun resolveToDescriptor(declaration: KtDeclaration, bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [701:72] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete[LocalVariableDescriptor]

'PARTIAL' @ [701:103] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'classDescriptor' @ [702:32] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete[LocalVariableDescriptor]

'defaultType' @ [702:48] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'constructor' @ [702:60] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'supertypesWithAny' @ [702:72] ==> public fun TypeConstructor.supertypesWithAny(): Collection<KotlinType> defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [703:22] ==> public inline fun <T, R : Any> Iterable<KotlinType>.mapNotNull(transform: (KotlinType) -> ClassDescriptor?): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> ClassDescriptor

'it' @ [703:35] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [703:38] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [703:50] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'callTypeAndReceiver' @ [705:17] ==> protected final val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, *> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'receiver' @ [705:37] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'referenceVariantsCollector' @ [706:44] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'collectReferenceVariants' @ [706:73] ==> public final fun collectReferenceVariants(descriptorKindFilter: DescriptorKindFilter): ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [706:98] ==> public open val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>[PropertyDescriptorImpl]

'imported' @ [706:120] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'toSet' @ [706:129] ==> public fun <T> Iterable<DeclarationDescriptor>.toSet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'superClasses' @ [707:17] ==> var superClasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete[LocalVariableDescriptor]

'superClasses' @ [707:32] ==> var superClasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete[LocalVariableDescriptor]

'filter' @ [707:45] ==> public inline fun <T> Iterable<ClassDescriptor>.filter(predicate: (ClassDescriptor) -> Boolean): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'it' @ [707:54] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'referenceVariantsSet' @ [707:60] ==> val referenceVariantsSet: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete[LocalVariableDescriptor]

'superClasses' @ [710:13] ==> var superClasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete[LocalVariableDescriptor]

'map' @ [711:22] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> LookupElement): List<LookupElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> LookupElement

'basicLookupElementFactory' @ [711:28] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'createLookupElement' @ [711:54] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'it' @ [711:74] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [712:22] ==> @HidesMembers public inline fun <T> Iterable<LookupElement>.forEach(action: (LookupElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupElement

'collector' @ [712:32] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [712:42] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'it' @ [712:53] ==> value-parameter it: LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.SUPER_QUALIFIER.<no name provided>.doComplete.<anonymous>[ValueParameterDescriptorImpl]

'if (declaration is KtCallableDeclaration && declaration.hasModifier(KtTokens.OVERRIDE_KEYWORD)) {
            OverridesCompletion(collector, basicLookupElementFactory).complete(position, declaration)
        }
        else {
            val referenceScope = referenceScope(declaration) ?: return
            val originalScope = toFromOriginalFileMapper.toOriginalFile(referenceScope) ?: return
            val afterOffset = if (referenceScope is KtBlockExpression) parameters.offset else null
            val descriptor = bindingContext[BindingContext.DECLARATION_TO_DESCRIPTOR, declaration]
            FromUnresolvedNamesCompletion(collector, prefixMatcher).addNameSuggestions(originalScope, afterOffset, descriptor)
        }' @ [717:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [717:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[ValueParameterDescriptorImpl]

'declaration' @ [717:53] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[ValueParameterDescriptorImpl]

'hasModifier' @ [717:65] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [717:86] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OverridesCompletion' @ [718:13] ==> public constructor OverridesCompletion(collector: LookupElementsCollector, lookupElementFactory: BasicLookupElementFactory) defined in org.jetbrains.kotlin.idea.completion.OverridesCompletion[ClassConstructorDescriptorImpl]

'collector' @ [718:33] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'basicLookupElementFactory' @ [718:44] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'complete' @ [718:71] ==> public final fun complete(position: PsiElement, declaration: KtCallableDeclaration?): Unit defined in org.jetbrains.kotlin.idea.completion.OverridesCompletion[SimpleFunctionDescriptorImpl]

'position' @ [718:80] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'declaration' @ [718:90] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[ValueParameterDescriptorImpl]

'referenceScope' @ [721:34] ==> private final fun referenceScope(declaration: KtNamedDeclaration): KtElement? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'declaration' @ [721:49] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[ValueParameterDescriptorImpl]

'toFromOriginalFileMapper' @ [722:33] ==> protected final val toFromOriginalFileMapper: ToFromOriginalFileMapper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'toOriginalFile' @ [722:58] ==> public final fun <TElement : PsiElement> toOriginalFile(element: KtElement): KtElement? defined in org.jetbrains.kotlin.idea.completion.ToFromOriginalFileMapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : PsiElement> -> KtElement

'referenceScope' @ [722:73] ==> val referenceScope: KtElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[LocalVariableDescriptor]

'if (referenceScope is KtBlockExpression) parameters.offset else null' @ [723:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'referenceScope' @ [723:35] ==> val referenceScope: KtElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[LocalVariableDescriptor]

'parameters' @ [723:72] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'offset' @ [723:83] ==> public final val CompletionParameters.offset: Int[MyPropertyDescriptor]

'bindingContext' @ [724:30] ==> protected final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [724:60] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [724:87] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[ValueParameterDescriptorImpl]

'FromUnresolvedNamesCompletion' @ [725:13] ==> public constructor FromUnresolvedNamesCompletion(collector: LookupElementsCollector, prefixMatcher: PrefixMatcher) defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion[ClassConstructorDescriptorImpl]

'collector' @ [725:43] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'prefixMatcher' @ [725:54] ==> protected final val prefixMatcher: CamelHumpMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addNameSuggestions' @ [725:69] ==> public final fun addNameSuggestions(scope: KtElement, afterOffset: Int?, sampleDescriptor: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.idea.completion.FromUnresolvedNamesCompletion[SimpleFunctionDescriptorImpl]

'originalScope' @ [725:88] ==> val originalScope: KtElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[LocalVariableDescriptor]

'afterOffset' @ [725:103] ==> val afterOffset: Int? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[LocalVariableDescriptor]

'descriptor' @ [725:116] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.completeDeclarationNameFromUnresolvedOrOverride[LocalVariableDescriptor]

'declaration' @ [730:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[ValueParameterDescriptorImpl]

'parent' @ [730:34] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtParameterList -> parent.parent as KtElement

            is KtClassBody -> {
                val classOrObject = parent.parent as KtClassOrObject
                if (classOrObject is KtObjectDeclaration && classOrObject.isCompanion()) {
                    classOrObject.containingClassOrObject
                }
                else {
                    classOrObject
                }
            }

            is KtFile -> parent

            is KtBlockExpression -> parent

            else -> null
        }' @ [731:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement?, entry1: KtElement?, entry2: KtElement?, entry3: KtElement?, entry4: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement?

'parent' @ [731:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'parent' @ [732:35] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'parent' @ [732:42] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [735:37] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'parent' @ [735:44] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (classOrObject is KtObjectDeclaration && classOrObject.isCompanion()) {
                    classOrObject.containingClassOrObject
                }
                else {
                    classOrObject
                }' @ [736:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClassOrObject?, elseBranch: KtClassOrObject?): KtClassOrObject?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClassOrObject?

'classOrObject' @ [736:21] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'classOrObject' @ [736:61] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'isCompanion' @ [736:75] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [737:21] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'containingClassOrObject' @ [737:35] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'classOrObject' @ [740:21] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'parent' @ [744:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'parent' @ [746:37] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.referenceScope[LocalVariableDescriptor]

'collector' @ [754:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [754:23] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'basicLookupElementFactory' @ [754:34] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'createLookupElement' @ [754:60] ==> public final fun createLookupElement(descriptor: DeclarationDescriptor, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ..., parametersAndTypeGrayed: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [754:80] ==> value-parameter descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addClassesFromIndex.<anonymous>[ValueParameterDescriptorImpl]

'collector' @ [757:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addElement' @ [757:23] ==> public final fun addElement(element: LookupElement, notImported: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'basicLookupElementFactory' @ [757:34] ==> protected final val basicLookupElementFactory: BasicLookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'createLookupElementForJavaClass' @ [757:60] ==> public final fun createLookupElementForJavaClass(psiClass: PsiClass, qualifyNestedClasses: Boolean = ..., includeClassTypeArguments: Boolean = ...): LookupElement defined in org.jetbrains.kotlin.idea.completion.BasicLookupElementFactory[SimpleFunctionDescriptorImpl]

'javaClass' @ [757:92] ==> value-parameter javaClass: PsiClass defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addClassesFromIndex.<anonymous>[ValueParameterDescriptorImpl]

'AllClassesCompletion' @ [759:9] ==> public constructor AllClassesCompletion(parameters: CompletionParameters, kotlinIndicesHelper: KotlinIndicesHelper, prefixMatcher: PrefixMatcher, resolutionFacade: ResolutionFacade, kindFilter: (ClassKind) -> Boolean, includeTypeAliases: Boolean, includeJavaClassesNotToBeUsed: Boolean) defined in org.jetbrains.kotlin.idea.completion.AllClassesCompletion[ClassConstructorDescriptorImpl]

'parameters' @ [759:30] ==> protected final val parameters: CompletionParameters defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'indicesHelper' @ [759:42] ==> protected final fun indicesHelper(mayIncludeInaccessible: Boolean): KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'prefixMatcher' @ [759:63] ==> value-parameter prefixMatcher: PrefixMatcher defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addClassesFromIndex[ValueParameterDescriptorImpl]

'resolutionFacade' @ [759:78] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'kindFilter' @ [760:30] ==> value-parameter kindFilter: (ClassKind) -> Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addClassesFromIndex[ValueParameterDescriptorImpl]

'includeTypeAliases' @ [760:42] ==> value-parameter includeTypeAliases: Boolean defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addClassesFromIndex[ValueParameterDescriptorImpl]

'configuration' @ [760:62] ==> protected final val configuration: CompletionSessionConfiguration defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'javaClassesNotToBeUsed' @ [760:76] ==> public final val javaClassesNotToBeUsed: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionSessionConfiguration[PropertyDescriptorImpl]

'collect' @ [761:11] ==> public final fun collect(classifierDescriptorCollector: (ClassifierDescriptorWithTypeParameters) -> Unit, javaClassCollector: (PsiClass) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.AllClassesCompletion[SimpleFunctionDescriptorImpl]

'classifierDescriptorCollector' @ [761:19] ==> val classifierDescriptorCollector: (ClassifierDescriptorWithTypeParameters) -> Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addClassesFromIndex[LocalVariableDescriptor]

'javaClassCollector' @ [761:50] ==> val javaClassCollector: (PsiClass) -> Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addClassesFromIndex[LocalVariableDescriptor]

'collector' @ [766:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [766:23] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'referenceVariantsHelper' @ [766:45] ==> protected final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'excludeNonInitializedVariable' @ [766:69] ==> public final fun excludeNonInitializedVariable(variants: Collection<DeclarationDescriptor>, contextElement: PsiElement): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedSimpleFunctionDescriptor]

'referenceVariants' @ [766:99] ==> value-parameter referenceVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements.addReferenceVariants[ValueParameterDescriptorImpl]

'imported' @ [766:117] ==> public final val imported: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'position' @ [766:127] ==> protected final val position: PsiElement defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'lookupElementFactory' @ [766:138] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements[ValueParameterDescriptorImpl]

'collector' @ [767:13] ==> protected final val collector: LookupElementsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'addDescriptorElements' @ [767:23] ==> public final fun addDescriptorElements(descriptors: Iterable<DeclarationDescriptor>, lookupElementFactory: LookupElementFactory, notImported: Boolean = ..., withReceiverCast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.LookupElementsCollector[SimpleFunctionDescriptorImpl]

'referenceVariants' @ [767:45] ==> value-parameter referenceVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements.addReferenceVariants[ValueParameterDescriptorImpl]

'notImportedExtensions' @ [767:63] ==> public final val notImportedExtensions: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.completion.ReferenceVariants[PropertyDescriptorImpl]

'lookupElementFactory' @ [767:86] ==> value-parameter lookupElementFactory: LookupElementFactory defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements[ValueParameterDescriptorImpl]

'referenceVariantsCollector' @ [770:42] ==> protected final val referenceVariantsCollector: ReferenceVariantsCollector? defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[PropertyDescriptorImpl]

'referenceVariantsCollector' @ [771:9] ==> val referenceVariantsCollector: ReferenceVariantsCollector defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements[LocalVariableDescriptor]

'collectReferenceVariants' @ [771:36] ==> public final fun collectReferenceVariants(descriptorKindFilter: DescriptorKindFilter, consumer: (ReferenceVariants) -> Unit): Unit defined in org.jetbrains.kotlin.idea.completion.ReferenceVariantsCollector[SimpleFunctionDescriptorImpl]

'descriptorKindFilter' @ [771:61] ==> value-parameter descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements[ValueParameterDescriptorImpl]

'addReferenceVariants' @ [772:13] ==> local final fun addReferenceVariants(referenceVariants: ReferenceVariants): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements[SimpleFunctionDescriptorImpl]

'referenceVariants' @ [772:34] ==> value-parameter referenceVariants: ReferenceVariants defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession.addReferenceVariantElements.<anonymous>[ValueParameterDescriptorImpl]

'flushToResultSet' @ [773:13] ==> protected final fun flushToResultSet(): Unit defined in org.jetbrains.kotlin.idea.completion.BasicCompletionSession[SimpleFunctionDescriptorImpl]

'DescriptorKindFilter' @ [778:40] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [778:61] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CLASSIFIERS_MASK' @ [778:82] ==> public final val CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'FUNCTIONS_MASK' @ [778:123] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'listOf' @ [779:61] ==> public fun <T> listOf(vararg elements: DescriptorKindExclude): List<DescriptorKindExclude> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorKindExclude

'NonSamConstructorFunctionExclude' @ [779:68] ==> private object NonSamConstructorFunctionExclude : DescriptorKindExclude defined in org.jetbrains.kotlin.idea.completion in file BasicCompletionSession.kt[FakeCallableDescriptorForObject]

'Extensions' @ [779:124] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'DescriptorKindFilter' @ [780:40] ==> public constructor DescriptorKindFilter(kindMask: Int, excludes: List<DescriptorKindExclude> = ...) defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedClassConstructorDescriptor]

'DescriptorKindFilter' @ [780:61] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CALLABLES_MASK' @ [780:82] ==> public final val CALLABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'PACKAGES_MASK' @ [780:121] ==> public final val PACKAGES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'listOf' @ [781:61] ==> public fun <T> listOf(element: SamConstructorDescriptorKindExclude): List<SamConstructorDescriptorKindExclude> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SamConstructorDescriptorKindExclude

'SamConstructorDescriptorKindExclude' @ [781:68] ==> public object SamConstructorDescriptorKindExclude : DescriptorKindExclude defined in org.jetbrains.kotlin.load.java.sam[FakeCallableDescriptorForObject]

'DescriptorKindExclude' @ [783:51] ==> public constructor DescriptorKindExclude() defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[DeserializedClassConstructorDescriptor]

'descriptor' @ [784:64] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.NonSamConstructorFunctionExclude.excludes[ValueParameterDescriptorImpl]

'descriptor' @ [784:100] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.NonSamConstructorFunctionExclude.excludes[ValueParameterDescriptorImpl]

