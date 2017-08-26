'getInstance' @ [54:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'CompletionBindingContextProvider' @ [54:42] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[FakeCallableDescriptorForObject]

'java' @ [54:82] ==> public val <T> KClass<CompletionBindingContextProvider>.java: Class<CompletionBindingContextProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompletionBindingContextProvider

'TestOnly' @ [56:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'project' @ [61:19] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.Companion.getInstance[ValueParameterDescriptorImpl]

'getComponent' @ [61:27] ==> public abstract fun <T : (Any..Any?)> getComponent(@NotNull p0: Class<(CompletionBindingContextProvider..CompletionBindingContextProvider?)>): (CompletionBindingContextProvider..CompletionBindingContextProvider?) defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompletionBindingContextProvider

'CompletionBindingContextProvider' @ [61:40] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[FakeCallableDescriptorForObject]

'java' @ [61:80] ==> public val <T> KClass<CompletionBindingContextProvider>.java: Class<CompletionBindingContextProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompletionBindingContextProvider

'reference' @ [83:21] ==> private final var reference: SoftReference<CompletionBindingContextProvider.CompletionData>? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.DataHolder[PropertyDescriptorImpl]

'get' @ [83:32] ==> public open fun get(): CompletionBindingContextProvider.CompletionData? defined in java.lang.ref.SoftReference[JavaMethodDescriptor]

'reference' @ [84:26] ==> private final var reference: SoftReference<CompletionBindingContextProvider.CompletionData>? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.DataHolder[PropertyDescriptorImpl]

'value' @ [84:38] ==> value-parameter value: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.DataHolder.<set-data>[ValueParameterDescriptorImpl]

'let' @ [84:45] ==> @InlineOnly public inline fun <T, R> CompletionBindingContextProvider.CompletionData.let(block: (CompletionBindingContextProvider.CompletionData) -> SoftReference<CompletionBindingContextProvider.CompletionData>): SoftReference<CompletionBindingContextProvider.CompletionData> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompletionData
    <R> -> SoftReference<CompletionData>

'SoftReference' @ [84:51] ==> public constructor SoftReference<T : (Any..Any?)>(p0: (CompletionBindingContextProvider.CompletionData..CompletionBindingContextProvider.CompletionData?)) defined in java.lang.ref.SoftReference[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompletionData

'it' @ [84:65] ==> value-parameter it: CompletionBindingContextProvider.CompletionData defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.DataHolder.<set-data>.<anonymous>[ValueParameterDescriptorImpl]

'getManager' @ [87:88] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [87:99] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.<init>[ValueParameterDescriptorImpl]

'createCachedValue' @ [87:108] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(CompletionBindingContextProvider.DataHolder..CompletionBindingContextProvider.DataHolder?)>?, p1: Boolean): CachedValue<(CompletionBindingContextProvider.DataHolder..CompletionBindingContextProvider.DataHolder?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DataHolder

'create' @ [88:42] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: CompletionBindingContextProvider.DataHolder?, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(CompletionBindingContextProvider.DataHolder..CompletionBindingContextProvider.DataHolder?)>..CachedValueProvider.Result<(CompletionBindingContextProvider.DataHolder..CompletionBindingContextProvider.DataHolder?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DataHolder

'DataHolder' @ [88:49] ==> public constructor DataHolder() defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.DataHolder[ClassConstructorDescriptorImpl]

'OUT_OF_CODE_BLOCK_MODIFICATION_COUNT' @ [88:86] ==> public final val OUT_OF_CODE_BLOCK_MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'if (ENABLED) {
            _getBindingContext(position, resolutionFacade)
        }
        else {
            resolutionFacade.analyze(position.parentsWithSelf.firstIsInstance<KtElement>(), BodyResolveMode.PARTIAL_FOR_COMPLETION)
        }' @ [93:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BindingContext, elseBranch: BindingContext): BindingContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BindingContext

'ENABLED' @ [93:20] ==> public final var ENABLED: Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.Companion[PropertyDescriptorImpl]

'_getBindingContext' @ [94:13] ==> private final fun _getBindingContext(position: PsiElement, resolutionFacade: ResolutionFacade): BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'position' @ [94:32] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.getBindingContext[ValueParameterDescriptorImpl]

'resolutionFacade' @ [94:42] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.getBindingContext[ValueParameterDescriptorImpl]

'resolutionFacade' @ [97:13] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.getBindingContext[ValueParameterDescriptorImpl]

'analyze' @ [97:30] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'position' @ [97:38] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.getBindingContext[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [97:47] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstIsInstance' @ [97:63] ==> public inline fun <reified T> Sequence<*>.firstIsInstance(): KtElement defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtElement

'PARTIAL_FOR_COMPLETION' @ [97:109] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'assert' @ [102:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [102:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'position' @ [102:17] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'isPhysical' @ [102:26] ==> public final val PsiElement.isPhysical: Boolean[MyPropertyDescriptor]

'position' @ [104:27] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'findStatementInBlock' @ [104:36] ==> private final fun PsiElement.findStatementInBlock(): KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'inStatement' @ [105:21] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'parent' @ [105:34] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'inStatement' @ [106:29] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'siblings' @ [106:42] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstIsInstanceOrNull' @ [106:89] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): KtExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtExpression

'inStatement' @ [107:33] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'let' @ [107:46] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtElement?): KtElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtElement?

'KotlinCodeBlockModificationListener' @ [107:52] ==> public companion object defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[FakeCallableDescriptorForObject]

'getInsideCodeBlockModificationScope' @ [107:88] ==> public final fun getInsideCodeBlockModificationScope(element: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [107:124] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext.<anonymous>[ValueParameterDescriptorImpl]

'modificationScope' @ [109:41] ==> val modificationScope: KtElement? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'let' @ [109:60] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> List<CompletionBindingContextProvider.PsiElementData>): List<CompletionBindingContextProvider.PsiElementData> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> List<PsiElementData>

'collectPsiElementsBeforeAndAfter' @ [109:66] ==> private final fun collectPsiElementsBeforeAndAfter(scope: PsiElement, statement: KtExpression): List<CompletionBindingContextProvider.PsiElementData> defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'modificationScope' @ [109:99] ==> val modificationScope: KtElement? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'inStatement' @ [109:118] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevCompletionDataCache' @ [111:34] ==> private final var prevCompletionDataCache: CachedValue<CompletionBindingContextProvider.DataHolder> defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[PropertyDescriptorImpl]

'value' @ [111:58] ==> public final val <T : (Any..Any?)> CachedValue<CompletionBindingContextProvider.DataHolder>.value: (CompletionBindingContextProvider.DataHolder..CompletionBindingContextProvider.DataHolder?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DataHolder

'data' @ [111:64] ==> public final var data: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.DataHolder[PropertyDescriptorImpl]

'when {
            prevCompletionData == null ->
                log("No up-to-date data from previous completion\n")
            block != prevCompletionData.block ->
                log("Not in the same block\n")
            prevStatement != prevCompletionData.prevStatement ->
                log("Previous statement is not the same\n")
            psiElementsBeforeAndAfter != prevCompletionData.psiElementsBeforeAndAfter ->
                log("PSI-tree has changed inside current scope\n")
            prevCompletionData.moduleDescriptor != resolutionFacade.moduleDescriptor ->
                log("ModuleDescriptor has been reset")
            inStatement.isTooComplex() ->
                log("Current statement is too complex to use optimization\n")
            else -> {
                log("Statement position is the same - analyzing only one statement:\n${inStatement.text.prependIndent("    ")}\n")
                LOG.debug("Reusing data from completion of \"${prevCompletionData.debugText}\"")

                //TODO: expected type?
                val statementContext = inStatement.analyzeInContext(scope = prevCompletionData.statementResolutionScope,
                                                                    contextExpression = block,
                                                                    dataFlowInfo = prevCompletionData.statementDataFlowInfo,
                                                                    isStatement = true)
                // we do not update prevCompletionDataCache because the same data should work
                return CompositeBindingContext.create(listOf(statementContext, prevCompletionData.bindingContext))
            }
        }' @ [112:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit, entry6: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'prevCompletionData' @ [113:13] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'log' @ [114:17] ==> private final fun log(message: String): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'block' @ [115:13] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevCompletionData' @ [115:22] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'block' @ [115:41] ==> public final val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'log' @ [116:17] ==> private final fun log(message: String): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'prevStatement' @ [117:13] ==> val prevStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevCompletionData' @ [117:30] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevStatement' @ [117:49] ==> public final val prevStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'log' @ [118:17] ==> private final fun log(message: String): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'psiElementsBeforeAndAfter' @ [119:13] ==> val psiElementsBeforeAndAfter: List<CompletionBindingContextProvider.PsiElementData>? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevCompletionData' @ [119:42] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'psiElementsBeforeAndAfter' @ [119:61] ==> public final val psiElementsBeforeAndAfter: List<CompletionBindingContextProvider.PsiElementData> defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'log' @ [120:17] ==> private final fun log(message: String): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'prevCompletionData' @ [121:13] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'moduleDescriptor' @ [121:32] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'resolutionFacade' @ [121:52] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [121:69] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'log' @ [122:17] ==> private final fun log(message: String): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'inStatement' @ [123:13] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'isTooComplex' @ [123:25] ==> private final fun KtExpression.isTooComplex(): Boolean defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'log' @ [124:17] ==> private final fun log(message: String): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'log' @ [126:17] ==> private final fun log(message: String): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'inStatement' @ [126:88] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'text' @ [126:100] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'prependIndent' @ [126:105] ==> public fun String.prependIndent(indent: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LOG' @ [127:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[PropertyDescriptorImpl]

'debug' @ [127:21] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'prevCompletionData' @ [127:64] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'debugText' @ [127:83] ==> public final val debugText: String defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'inStatement' @ [130:40] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'analyzeInContext' @ [130:52] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'prevCompletionData' @ [130:77] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'statementResolutionScope' @ [130:96] ==> public final val statementResolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'block' @ [131:89] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevCompletionData' @ [132:84] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'statementDataFlowInfo' @ [132:103] ==> public final val statementDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'CompositeBindingContext' @ [135:24] ==> public companion object defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[FakeCallableDescriptorForObject]

'create' @ [135:48] ==> public final fun create(delegates: List<BindingContext>): BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion[DeserializedSimpleFunctionDescriptor]

'listOf' @ [135:55] ==> public fun <T> listOf(vararg elements: BindingContext): List<BindingContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BindingContext

'statementContext' @ [135:62] ==> val statementContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevCompletionData' @ [135:80] ==> val prevCompletionData: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'bindingContext' @ [135:99] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[PropertyDescriptorImpl]

'resolutionFacade' @ [139:30] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'analyze' @ [139:47] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'position' @ [139:55] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [139:64] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'firstIsInstance' @ [139:80] ==> public inline fun <reified T> Sequence<*>.firstIsInstance(): KtElement defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtElement

'PARTIAL_FOR_COMPLETION' @ [139:126] ==> enum entry PARTIAL_FOR_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'prevCompletionDataCache' @ [140:9] ==> private final var prevCompletionDataCache: CachedValue<CompletionBindingContextProvider.DataHolder> defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[PropertyDescriptorImpl]

'value' @ [140:33] ==> public final val <T : (Any..Any?)> CachedValue<CompletionBindingContextProvider.DataHolder>.value: (CompletionBindingContextProvider.DataHolder..CompletionBindingContextProvider.DataHolder?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DataHolder

'data' @ [140:39] ==> public final var data: CompletionBindingContextProvider.CompletionData? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.DataHolder[PropertyDescriptorImpl]

'if (block != null && modificationScope != null) {
            val resolutionScope = inStatement.getResolutionScope(bindingContext, resolutionFacade)
            val dataFlowInfo = bindingContext.getDataFlowInfoBefore(inStatement)
            CompletionData(block, prevStatement, psiElementsBeforeAndAfter!!, bindingContext, resolutionFacade.moduleDescriptor, resolutionScope, dataFlowInfo,
                           debugText = position.text)
        }
        else {
            null
        }' @ [140:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompletionBindingContextProvider.CompletionData?, elseBranch: CompletionBindingContextProvider.CompletionData?): CompletionBindingContextProvider.CompletionData?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CompletionData?

'block' @ [140:50] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'modificationScope' @ [140:67] ==> val modificationScope: KtElement? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'inStatement' @ [141:35] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'getResolutionScope' @ [141:47] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [141:66] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'resolutionFacade' @ [141:82] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'bindingContext' @ [142:32] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'getDataFlowInfoBefore' @ [142:47] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'inStatement' @ [142:69] ==> val inStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'CompletionData' @ [143:13] ==> public constructor CompletionData(block: KtBlockExpression, prevStatement: KtExpression?, psiElementsBeforeAndAfter: List<CompletionBindingContextProvider.PsiElementData>, bindingContext: BindingContext, moduleDescriptor: ModuleDescriptor, statementResolutionScope: LexicalScope, statementDataFlowInfo: DataFlowInfo, debugText: String) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.CompletionData[ClassConstructorDescriptorImpl]

'block' @ [143:28] ==> val block: KtBlockExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'prevStatement' @ [143:35] ==> val prevStatement: KtExpression? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'psiElementsBeforeAndAfter' @ [143:50] ==> val psiElementsBeforeAndAfter: List<CompletionBindingContextProvider.PsiElementData>? defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'bindingContext' @ [143:79] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'resolutionFacade' @ [143:95] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [143:112] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'resolutionScope' @ [143:130] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'dataFlowInfo' @ [143:147] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'position' @ [144:40] ==> value-parameter position: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[ValueParameterDescriptorImpl]

'text' @ [144:49] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'bindingContext' @ [150:16] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider._getBindingContext[LocalVariableDescriptor]

'TEST_LOG' @ [154:9] ==> @TestOnly internal final var TEST_LOG: StringBuilder? /* = StringBuilder? */ defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[PropertyDescriptorImpl]

'append' @ [154:19] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'message' @ [154:26] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.log[ValueParameterDescriptorImpl]

'LOG' @ [155:9] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[PropertyDescriptorImpl]

'debug' @ [155:13] ==> public abstract fun debug(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'message' @ [155:19] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.log[ValueParameterDescriptorImpl]

'ArrayList' @ [159:16] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElementData

'apply' @ [159:44] ==> @InlineOnly public inline fun <T> ArrayList<CompletionBindingContextProvider.PsiElementData>.apply(block: ArrayList<CompletionBindingContextProvider.PsiElementData>.() -> Unit): ArrayList<CompletionBindingContextProvider.PsiElementData> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<PsiElementData>

'addElementsInTree' @ [159:52] ==> private final fun MutableList<CompletionBindingContextProvider.PsiElementData>.addElementsInTree(root: PsiElement, initialLevel: Int, skipSubtree: PsiElement): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'scope' @ [159:70] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.collectPsiElementsBeforeAndAfter[ValueParameterDescriptorImpl]

'statement' @ [159:80] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.collectPsiElementsBeforeAndAfter[ValueParameterDescriptorImpl]

'root' @ [163:13] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[ValueParameterDescriptorImpl]

'skipSubtree' @ [163:21] ==> value-parameter skipSubtree: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[ValueParameterDescriptorImpl]

'add' @ [164:9] ==> public abstract fun add(element: CompletionBindingContextProvider.PsiElementData): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'PsiElementData' @ [164:13] ==> public constructor PsiElementData(element: PsiElement, level: Int) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.PsiElementData[ClassConstructorDescriptorImpl]

'root' @ [164:28] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[ValueParameterDescriptorImpl]

'initialLevel' @ [164:34] ==> value-parameter initialLevel: Int defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[ValueParameterDescriptorImpl]

'root' @ [165:21] ==> value-parameter root: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[ValueParameterDescriptorImpl]

'firstChild' @ [165:26] ==> public final val PsiElement.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [166:16] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[LocalVariableDescriptor]

'child' @ [167:17] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[LocalVariableDescriptor]

'child' @ [167:44] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[LocalVariableDescriptor]

'child' @ [167:68] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[LocalVariableDescriptor]

'addElementsInTree' @ [168:17] ==> private final fun MutableList<CompletionBindingContextProvider.PsiElementData>.addElementsInTree(root: PsiElement, initialLevel: Int, skipSubtree: PsiElement): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider[SimpleFunctionDescriptorImpl]

'child' @ [168:35] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[LocalVariableDescriptor]

'initialLevel' @ [168:42] ==> value-parameter initialLevel: Int defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[ValueParameterDescriptorImpl]

'skipSubtree' @ [168:60] ==> value-parameter skipSubtree: PsiElement defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[ValueParameterDescriptorImpl]

'child' @ [170:13] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[LocalVariableDescriptor]

'child' @ [170:21] ==> var child: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.addElementsInTree[LocalVariableDescriptor]

'nextSibling' @ [170:27] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parents' @ [175:16] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'filterIsInstance' @ [175:24] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtExpression

'firstOrNull' @ [175:57] ==> public inline fun <T> Sequence<KtExpression>.firstOrNull(predicate: (KtExpression) -> Boolean): KtExpression? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [175:71] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.findStatementInBlock.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [175:74] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'anyDescendantOfType' @ [179:16] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtBlockExpression) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBlockExpression

'it' @ [179:57] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.completion.CompletionBindingContextProvider.isTooComplex.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [179:60] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'size' @ [179:71] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

