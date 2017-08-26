'KotlinQuickFixAction<T>' @ [86:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: T) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> T

'expression' @ [86:29] ==> value-parameter expression: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.<init>[ValueParameterDescriptorImpl]

'expression' @ [87:27] ==> value-parameter expression: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.<init>[ValueParameterDescriptorImpl]

'project' @ [87:38] ==> public final val KtExpression.project: Project[MyPropertyDescriptor]

'getInstance' @ [89:76] ==> public open fun getInstance(p0: (Project..Project?)): (PsiModificationTracker..PsiModificationTracker?) defined in com.intellij.psi.util.PsiModificationTracker.SERVICE[JavaMethodDescriptor]

'project' @ [89:88] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'modificationCount' @ [89:97] ==> public final val PsiModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'suggestions' @ [94:9] ==> protected final lateinit var suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'collectSuggestions' @ [94:23] ==> public final fun collectSuggestions(): Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'factory' @ [97:47] ==> private final val factory: ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'supportedErrors' @ [97:55] ==> public final val supportedErrors: Collection<DiagnosticFactory<*>> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[PropertyDescriptorImpl]

'element' @ [103:23] ==> protected final val element: T? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'!' @ [105:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [105:14] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.showHint[LocalVariableDescriptor]

'isValid' @ [105:22] ==> public final val KtExpression.isValid: Boolean[MyPropertyDescriptor]

'isOutdated' @ [105:33] ==> private final fun isOutdated(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'getApplication' @ [107:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [107:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'getInstance' @ [107:79] ==> public open fun getInstance(): (HintManager..HintManager?) defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'hasShownHintsThatWillHideByOtherHint' @ [107:93] ==> public abstract fun hasShownHintsThatWillHideByOtherHint(p0: Boolean): Boolean defined in com.intellij.codeInsight.hint.HintManager[JavaMethodDescriptor]

'suggestions' @ [109:13] ==> protected final lateinit var suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'isEmpty' @ [109:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'createAction' @ [111:16] ==> protected open fun createAction(project: Project, editor: Editor, element: KtExpression): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'project' @ [111:29] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'editor' @ [111:38] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.showHint[ValueParameterDescriptorImpl]

'element' @ [111:46] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.showHint[LocalVariableDescriptor]

'showHint' @ [111:55] ==> public final fun showHint(): Boolean defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[SimpleFunctionDescriptorImpl]

'message' @ [114:43] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'message' @ [116:49] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'element' @ [119:15] ==> protected final val element: T? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'super' @ [119:34] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [119:40] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [119:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [119:61] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.isAvailable[ValueParameterDescriptorImpl]

'file' @ [119:69] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.isAvailable[ValueParameterDescriptorImpl]

'suggestions' @ [119:78] ==> protected final lateinit var suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'isNotEmpty' @ [119:90] ==> @InlineOnly public inline fun <T> Collection<FqName>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'element' @ [122:23] ==> protected final val element: T? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'getInstance' @ [123:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'runUndoTransparentAction' @ [123:40] ==> public final fun runUndoTransparentAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'createAction' @ [124:13] ==> protected open fun createAction(project: Project, editor: Editor, element: KtExpression): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'project' @ [124:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.invoke[ValueParameterDescriptorImpl]

'editor' @ [124:35] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.invoke[ValueParameterDescriptorImpl]

'element' @ [124:45] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.invoke[LocalVariableDescriptor]

'execute' @ [124:54] ==> public open fun execute(): Boolean defined in org.jetbrains.kotlin.idea.actions.KotlinAddImportAction[SimpleFunctionDescriptorImpl]

'modificationCountOnCreate' @ [130:32] ==> private final val modificationCountOnCreate: Long defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'getInstance' @ [130:92] ==> public open fun getInstance(p0: (Project..Project?)): (PsiModificationTracker..PsiModificationTracker?) defined in com.intellij.psi.util.PsiModificationTracker.SERVICE[JavaMethodDescriptor]

'project' @ [130:104] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'modificationCount' @ [130:113] ==> public final val PsiModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'createSingleImportAction' @ [133:16] ==> internal fun createSingleImportAction(project: Project, editor: Editor, element: KtElement, fqNames: Collection<FqName>): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.actions[SimpleFunctionDescriptorImpl]

'project' @ [133:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.createAction[ValueParameterDescriptorImpl]

'editor' @ [133:50] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.createAction[ValueParameterDescriptorImpl]

'element' @ [133:58] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.createAction[ValueParameterDescriptorImpl]

'suggestions' @ [133:67] ==> protected final lateinit var suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'element' @ [137:23] ==> protected final val element: T? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'emptyList' @ [137:41] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'!' @ [138:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [138:14] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestions[LocalVariableDescriptor]

'isValid' @ [138:22] ==> public final val KtExpression.isValid: Boolean[MyPropertyDescriptor]

'emptyList' @ [138:38] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'element' @ [139:13] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestions[LocalVariableDescriptor]

'containingFile' @ [139:21] ==> public final val KtExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'emptyList' @ [139:55] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'getCallTypeAndReceiver' @ [141:35] ==> protected abstract fun getCallTypeAndReceiver(): CallTypeAndReceiver<*, *>? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'emptyList' @ [141:70] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'callTypeAndReceiver' @ [143:13] ==> val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestions[LocalVariableDescriptor]

'emptyList' @ [143:72] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'importNames' @ [145:13] ==> protected abstract val importNames: Collection<Name> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'isEmpty' @ [145:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [145:43] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'importNames' @ [147:16] ==> protected abstract val importNames: Collection<Name> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'flatMap' @ [148:18] ==> public inline fun <T, R> Iterable<Name>.flatMap(transform: (Name) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> DeclarationDescriptor

'collectSuggestionsForName' @ [148:28] ==> private final fun collectSuggestionsForName(name: Name, callTypeAndReceiver: CallTypeAndReceiver<*, *>): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'it' @ [148:54] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [148:58] ==> val callTypeAndReceiver: CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestions[LocalVariableDescriptor]

'distinct' @ [149:18] ==> public fun <T> Iterable<DeclarationDescriptor>.distinct(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'map' @ [150:18] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> FqName

'it' @ [150:24] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestions.<anonymous>[ValueParameterDescriptorImpl]

'fqNameSafe' @ [150:27] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'distinct' @ [151:18] ==> public fun <T> Iterable<FqName>.distinct(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'element' @ [155:23] ==> protected final val element: T? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'emptyList' @ [155:41] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'name' @ [156:23] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[ValueParameterDescriptorImpl]

'asString' @ [156:28] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'nameStr' @ [157:13] ==> val nameStr: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'isEmpty' @ [157:21] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [157:39] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'element' @ [159:20] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'containingKtFile' @ [159:28] ==> public final val KtExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'element' @ [161:30] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'analyze' @ [161:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [161:62] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'!' @ [162:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkErrorStillPresent' @ [162:14] ==> private final fun checkErrorStillPresent(bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'bindingContext' @ [162:37] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'emptyList' @ [162:61] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'getResolveScope' @ [164:27] ==> public fun getResolveScope(file: KtFile): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'file' @ [164:43] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'file' @ [166:32] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'getResolutionFacade' @ [166:37] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [169:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName.isVisible[ValueParameterDescriptorImpl]

'descriptor' @ [170:24] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName.isVisible[ValueParameterDescriptorImpl]

'isVisible' @ [170:35] ==> public fun DeclarationDescriptorWithVisibility.isVisible(context: PsiElement, receiverExpression: KtExpression?, bindingContext: BindingContext, resolutionFacade: ResolutionFacade): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [170:45] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'callTypeAndReceiver' @ [170:54] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[ValueParameterDescriptorImpl]

'receiver' @ [170:74] ==> public final val receiver: KtElement? defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'bindingContext' @ [170:101] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'resolutionFacade' @ [170:117] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'KotlinIndicesHelper' @ [176:29] ==> public constructor KotlinIndicesHelper(resolutionFacade: ResolutionFacade, scope: GlobalSearchScope, visibilityFilter: (DeclarationDescriptor) -> Boolean, declarationTranslator: (KtDeclaration) -> KtDeclaration? = ..., applyExcludeSettings: Boolean = ..., filterOutPrivate: Boolean = ..., file: KtFile? = ...) defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedClassConstructorDescriptor]

'resolutionFacade' @ [176:49] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'searchScope' @ [176:67] ==> val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'file' @ [176:100] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'fillCandidates' @ [178:22] ==> public abstract fun fillCandidates(name: String, callTypeAndReceiver: CallTypeAndReceiver<*, *>, bindingContext: BindingContext, indicesHelper: KotlinIndicesHelper): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'nameStr' @ [178:37] ==> val nameStr: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'callTypeAndReceiver' @ [178:46] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[ValueParameterDescriptorImpl]

'bindingContext' @ [178:67] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'indicesHelper' @ [178:83] ==> val indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'callTypeAndReceiver' @ [181:13] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[ValueParameterDescriptorImpl]

'element' @ [182:26] ==> val element: T defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'parent' @ [182:34] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [183:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCall' @ [183:18] ==> val isCall: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'result' @ [184:17] ==> var result: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'result' @ [184:26] ==> var result: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'filter' @ [184:33] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [184:42] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [188:9] ==> var result: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'result' @ [188:18] ==> var result: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'filter' @ [188:25] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'shouldImport' @ [188:47] ==> public open fun shouldImport(@NotNull p0: PsiFile, @NotNull p1: String): Boolean defined in com.intellij.codeInsight.ImportFilter[JavaMethodDescriptor]

'file' @ [188:60] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'it' @ [188:66] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName.<anonymous>[ValueParameterDescriptorImpl]

'fqNameSafe' @ [188:69] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [188:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'if (result.size > 1)
            reduceCandidatesBasedOnDependencyRuleViolation(result, file)
        else
            result' @ [190:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<DeclarationDescriptor>, elseBranch: Collection<DeclarationDescriptor>): Collection<DeclarationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<DeclarationDescriptor>

'result' @ [190:20] ==> var result: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'size' @ [190:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'reduceCandidatesBasedOnDependencyRuleViolation' @ [191:13] ==> private final fun reduceCandidatesBasedOnDependencyRuleViolation(candidates: Collection<DeclarationDescriptor>, file: PsiFile): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'result' @ [191:60] ==> var result: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'file' @ [191:68] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'result' @ [193:13] ==> var result: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.collectSuggestionsForName[LocalVariableDescriptor]

'elementsToCheckDiagnostics' @ [197:16] ==> protected open fun elementsToCheckDiagnostics(): Collection<PsiElement> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'flatMap' @ [198:18] ==> public inline fun <T, R> Iterable<PsiElement>.flatMap(transform: (PsiElement) -> Iterable<Diagnostic>): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Diagnostic

'bindingContext' @ [198:28] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.checkErrorStillPresent[ValueParameterDescriptorImpl]

'diagnostics' @ [198:43] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [198:55] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[DeserializedSimpleFunctionDescriptor]

'it' @ [198:66] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.checkErrorStillPresent.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [199:18] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'diagnostic' @ [199:38] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.checkErrorStillPresent.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [199:49] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'getSupportedErrors' @ [199:60] ==> protected open fun getSupportedErrors(): Collection<DiagnosticFactory<*>> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'listOfNotNull' @ [202:79] ==> public fun <T : Any> listOfNotNull(element: T?): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'element' @ [202:93] ==> protected final val element: T? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[PropertyDescriptorImpl]

'file' @ [213:23] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation[ValueParameterDescriptorImpl]

'project' @ [213:28] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'getInstance' @ [214:61] ==> public open fun getInstance(@NotNull p0: Project): (DependencyValidationManager..DependencyValidationManager?) defined in com.intellij.packageDependencies.DependencyValidationManager[JavaMethodDescriptor]

'project' @ [214:73] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation[LocalVariableDescriptor]

'candidates' @ [215:16] ==> value-parameter candidates: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation[ValueParameterDescriptorImpl]

'filter' @ [215:27] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filter(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DescriptorToSourceUtilsIde' @ [216:30] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [216:57] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [216:75] ==> val project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation[LocalVariableDescriptor]

'it' @ [216:84] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [216:89] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'validationManager' @ [217:13] ==> val validationManager: (DependencyValidationManager..DependencyValidationManager?) defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation[LocalVariableDescriptor]

'getViolatorDependencyRules' @ [217:31] ==> @NotNull public abstract fun getViolatorDependencyRules(@NotNull p0: PsiFile, @NotNull p1: PsiFile): (Array<(DependencyRule..DependencyRule?)>..Array<out (DependencyRule..DependencyRule?)>) defined in com.intellij.packageDependencies.DependencyValidationManager[JavaMethodDescriptor]

'file' @ [217:58] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation[ValueParameterDescriptorImpl]

'targetFile' @ [217:64] ==> val targetFile: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.reduceCandidatesBasedOnDependencyRuleViolation.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [217:76] ==> @InlineOnly public inline fun <T> Array<out (DependencyRule..DependencyRule?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.packageDependencies.DependencyRule..com.intellij.packageDependencies.DependencyRule?)

'KotlinSingleIntentionActionFactory' @ [221:30] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'lazy' @ [222:66] ==> public fun <T> lazy(initializer: () -> Collection<DiagnosticFactory<*>>): Lazy<Collection<DiagnosticFactory<*>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<DiagnosticFactory<*>>

'QuickFixes' @ [222:73] ==> public companion object defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[FakeCallableDescriptorForObject]

'getInstance' @ [222:84] ==> public final fun getInstance(): QuickFixes defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes.Companion[DeserializedSimpleFunctionDescriptor]

'getDiagnostics' @ [222:98] ==> public final fun getDiagnostics(factory: KotlinIntentionActionsFactory): Collection<DiagnosticFactory<*>> defined in org.jetbrains.kotlin.idea.quickfix.QuickFixes[DeserializedSimpleFunctionDescriptor]

'this' @ [222:113] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[LazyClassReceiverParameterDescriptor]

'emptyList' @ [228:123] ==> public fun <T> emptyList(): List<ImportFixBase<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportFixBase<*>

'createImportAction' @ [231:20] ==> public abstract fun createImportAction(diagnostic: Diagnostic): ImportFixBase<*>? defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[SimpleFunctionDescriptorImpl]

'diagnostic' @ [231:39] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory.createAction[ValueParameterDescriptorImpl]

'apply' @ [231:52] ==> @InlineOnly public inline fun <T> ImportFixBase<out KtExpression>.apply(block: ImportFixBase<out KtExpression>.() -> Unit): ImportFixBase<out KtExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportFixBase<out KtExpression>

'computeSuggestions' @ [231:60] ==> public final fun computeSuggestions(): Unit defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'createImportActionsForAllProblems' @ [235:20] ==> public open fun createImportActionsForAllProblems(sameTypeDiagnostics: Collection<Diagnostic>): List<ImportFixBase<*>> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[SimpleFunctionDescriptorImpl]

'sameTypeDiagnostics' @ [235:54] ==> value-parameter sameTypeDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory.doCreateActionsForAllProblems[ValueParameterDescriptorImpl]

'onEach' @ [235:75] ==> @SinceKotlin public inline fun <T, C : Iterable<ImportFixBase<*>>> List<ImportFixBase<*>>.onEach(action: (ImportFixBase<*>) -> Unit): List<ImportFixBase<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportFixBase<*>
    <C : Iterable<T>> -> List<ImportFixBase<*>>

'it' @ [235:84] ==> value-parameter it: ImportFixBase<*> defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory.doCreateActionsForAllProblems.<anonymous>[ValueParameterDescriptorImpl]

'computeSuggestions' @ [235:87] ==> public final fun computeSuggestions(): Unit defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[SimpleFunctionDescriptorImpl]

'ImportFixBase<T>' @ [241:100] ==> protected constructor ImportFixBase<T : KtExpression>(expression: T, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> T

'expression' @ [241:117] ==> value-parameter expression: T defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.<init>[ValueParameterDescriptorImpl]

'factory' @ [241:129] ==> value-parameter factory: ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.<init>[ValueParameterDescriptorImpl]

'element' @ [248:26] ==> protected final val element: T? defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[PropertyDescriptorImpl]

'emptyList' @ [248:44] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'ArrayList' @ [250:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'expression' @ [252:13] ==> val expression: T defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'!' @ [253:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [253:18] ==> val expression: T defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'isImportDirectiveExpression' @ [253:29] ==> public fun KtSimpleNameExpression.isImportDirectiveExpression(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [253:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSelectorInQualified' @ [253:63] ==> public open fun isSelectorInQualified(@NotNull p0: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [253:85] ==> val expression: T defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'callTypeAndReceiver' @ [254:40] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'toFilter' @ [254:60] ==> private fun CallTypeAndReceiver<*, *>.toFilter(): (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix[SimpleFunctionDescriptorImpl]

'indicesHelper' @ [256:17] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'getClassesByName' @ [256:31] ==> private fun KotlinIndicesHelper.getClassesByName(expressionForPlatform: KtExpression, name: String): Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix[SimpleFunctionDescriptorImpl]

'expression' @ [256:48] ==> val expression: T defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'name' @ [256:60] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'filterTo' @ [256:66] ==> public inline fun <T, C : MutableCollection<in ClassDescriptor>> Iterable<ClassDescriptor>.filterTo(destination: ArrayList<DeclarationDescriptor>, predicate: (ClassDescriptor) -> Boolean): ArrayList<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <C : MutableCollection<in T>> -> ArrayList<DeclarationDescriptor>

'result' @ [256:75] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'filterByCallType' @ [256:83] ==> val filterByCallType: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'indicesHelper' @ [258:17] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'getTopLevelTypeAliases' @ [258:31] ==> public final fun getTopLevelTypeAliases(nameFilter: (String) -> Boolean): Collection<TypeAliasDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'it' @ [258:56] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [258:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'filterTo' @ [258:69] ==> public inline fun <T, C : MutableCollection<in TypeAliasDescriptor>> Iterable<TypeAliasDescriptor>.filterTo(destination: ArrayList<DeclarationDescriptor>, predicate: (TypeAliasDescriptor) -> Boolean): ArrayList<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAliasDescriptor
    <C : MutableCollection<in T>> -> ArrayList<DeclarationDescriptor>

'result' @ [258:78] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'filterByCallType' @ [258:86] ==> val filterByCallType: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'indicesHelper' @ [260:17] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'getTopLevelCallablesByName' @ [260:31] ==> public final fun getTopLevelCallablesByName(name: String): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'name' @ [260:58] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'filterTo' @ [260:64] ==> public inline fun <T, C : MutableCollection<in CallableDescriptor>> Iterable<CallableDescriptor>.filterTo(destination: ArrayList<DeclarationDescriptor>, predicate: (CallableDescriptor) -> Boolean): ArrayList<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <C : MutableCollection<in T>> -> ArrayList<DeclarationDescriptor>

'result' @ [260:73] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'filterByCallType' @ [260:81] ==> val filterByCallType: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'result' @ [264:9] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'addAll' @ [264:16] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'indicesHelper' @ [264:23] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'getCallableTopLevelExtensions' @ [264:37] ==> public final fun getCallableTopLevelExtensions(callTypeAndReceiver: CallTypeAndReceiver<*, *>, position: KtExpression, bindingContext: BindingContext, nameFilter: (String) -> Boolean): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [264:67] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'expression' @ [264:88] ==> val expression: T defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'bindingContext' @ [264:100] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'it' @ [264:118] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [264:124] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[ValueParameterDescriptorImpl]

'result' @ [265:16] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase.fillCandidates[LocalVariableDescriptor]

'OrdinaryImportFixBase<KtSimpleNameExpression>' @ [269:64] ==> public constructor OrdinaryImportFixBase<T : KtExpression>(expression: KtSimpleNameExpression, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> KtSimpleNameExpression

'expression' @ [269:110] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.<init>[ValueParameterDescriptorImpl]

'MyFactory' @ [269:122] ==> public companion object MyFactory : ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[FakeCallableDescriptorForObject]

'element' @ [270:45] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[PropertyDescriptorImpl]

'let' @ [270:54] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>>): CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>>

'CallTypeAndReceiver' @ [270:60] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'detect' @ [270:80] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [270:87] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.getCallTypeAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [273:23] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[PropertyDescriptorImpl]

'emptyList' @ [273:41] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [275:13] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.importNamesForMembers[LocalVariableDescriptor]

'getIdentifier' @ [275:21] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [276:24] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.importNamesForMembers[LocalVariableDescriptor]

'getReferencedName' @ [276:32] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'isValidIdentifier' @ [277:22] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [277:40] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.importNamesForMembers[LocalVariableDescriptor]

'listOf' @ [278:24] ==> public fun <T> listOf(element: Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'identifier' @ [278:36] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [278:47] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.importNamesForMembers[LocalVariableDescriptor]

'emptyList' @ [282:16] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'+' @ [285:51] ==> public operator fun <T> Collection<Name>.plus(elements: Iterable<Name>): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [285:52] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[PropertyDescriptorImpl]

'mainReference' @ [285:61] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolvesByNames' @ [285:76] ==> public open val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'emptyList' @ [285:95] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'importNamesForMembers' @ [285:110] ==> private final fun importNamesForMembers(): Collection<Name> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[SimpleFunctionDescriptorImpl]

'distinct' @ [285:135] ==> public fun <T> Iterable<Name>.distinct(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [294:23] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[PropertyDescriptorImpl]

'emptyList' @ [294:41] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'element' @ [295:13] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'isImportDirectiveExpression' @ [295:21] ==> public fun KtSimpleNameExpression.isImportDirectiveExpression(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'isSelectorInQualified' @ [295:54] ==> public open fun isSelectorInQualified(@NotNull p0: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [295:76] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'emptyList' @ [295:93] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'ArrayList' @ [297:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'callTypeAndReceiver' @ [299:32] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'toFilter' @ [299:52] ==> private fun CallTypeAndReceiver<*, *>.toFilter(): (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix[SimpleFunctionDescriptorImpl]

'indicesHelper' @ [301:9] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'getKotlinEnumsByName' @ [301:23] ==> public final fun getKotlinEnumsByName(name: String): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'name' @ [301:44] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'filterTo' @ [301:50] ==> public inline fun <T, C : MutableCollection<in DeclarationDescriptor>> Iterable<DeclarationDescriptor>.filterTo(destination: ArrayList<DeclarationDescriptor>, predicate: (DeclarationDescriptor) -> Boolean): ArrayList<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <C : MutableCollection<in T>> -> ArrayList<DeclarationDescriptor>

'result' @ [301:59] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'filterByCallType' @ [301:67] ==> val filterByCallType: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'element' @ [303:32] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'getResolutionFacade' @ [303:40] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [304:35] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'receiverTypesWithIndex' @ [305:18] ==> public fun CallTypeAndReceiver<*, *>.receiverTypesWithIndex(bindingContext: BindingContext, contextElement: PsiElement, moduleDescriptor: ModuleDescriptor, resolutionFacade: ResolutionFacade, stableSmartCastsOnly: Boolean, withImplicitReceiversWhenExplicitPresent: Boolean = ...): Collection<ReceiverType>? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [305:41] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'element' @ [305:57] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'resolutionFacade' @ [306:41] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'moduleDescriptor' @ [306:58] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'resolutionFacade' @ [306:76] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'orEmpty' @ [308:90] ==> @InlineOnly public inline fun <T> Collection<ReceiverType>?.orEmpty(): Collection<ReceiverType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType

'element' @ [310:13] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'languageVersionSettings' @ [310:21] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [310:45] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [310:61] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DslMarkersSupport' @ [310:77] ==> enum entry DslMarkersSupport defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'actualReceiverTypes' @ [311:13] ==> var actualReceiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'actualReceiverTypes' @ [311:36] ==> var actualReceiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'shadowedByDslMarkers' @ [311:56] ==> public fun Collection<ReceiverType>.shadowedByDslMarkers(): Set<ReceiverType> defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'actualReceiverTypes' @ [314:37] ==> var actualReceiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'filterNot' @ [314:57] ==> public inline fun <T> Iterable<ReceiverType>.filterNot(predicate: (ReceiverType) -> Boolean): List<ReceiverType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType

'it' @ [314:69] ==> value-parameter it: ReceiverType defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'implicit' @ [314:72] ==> public final val implicit: Boolean defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'when(callTypeAndReceiver) {
            is CallTypeAndReceiver.OPERATOR, is CallTypeAndReceiver.INFIX -> true
            else -> false
        }' @ [316:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'callTypeAndReceiver' @ [316:42] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'descriptor' @ [322:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'canBeReferencedViaImport' @ [322:28] ==> public fun DeclarationDescriptor.canBeReferencedViaImport(): Boolean defined in org.jetbrains.kotlin.idea.imports[DeserializedSimpleFunctionDescriptor]

'invoke' @ [322:58] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptor' @ [322:75] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [323:20] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'isValidByReceiversFor' @ [323:31] ==> private final fun CallableDescriptor.isValidByReceiversFor(explicitReceiverTypes: Collection<ReceiverType>, allReceiverTypes: Collection<ReceiverType>, checkDispatchReceiver: Boolean): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[SimpleFunctionDescriptorImpl]

'explicitReceiverTypes' @ [323:53] ==> val explicitReceiverTypes: List<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'actualReceiverTypes' @ [323:76] ==> var actualReceiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'checkDispatchReceiver' @ [323:97] ==> val checkDispatchReceiver: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'result' @ [324:17] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'add' @ [324:24] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptor' @ [324:28] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'indicesHelper' @ [328:9] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'processKotlinCallablesByName' @ [328:23] ==> public final fun processKotlinCallablesByName(name: String, filter: (KtNamedDeclaration) -> Boolean, processor: (CallableDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'name' @ [329:17] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'declaration' @ [330:44] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [330:56] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [330:81] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'processor' @ [331:29] ==> val processor: (CallableDescriptor) -> Unit defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'==' @ [334:13] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [334:36] ==> @NotNull public open fun getPlatform(@NotNull p0: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'element' @ [334:48] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'containingKtFile' @ [334:56] ==> public final val KtSimpleNameExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'JvmPlatform' @ [334:77] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'indicesHelper' @ [335:13] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'processJvmCallablesByName' @ [335:27] ==> public final fun processJvmCallablesByName(name: String, filter: (PsiMember) -> Boolean, processor: (CallableDescriptor) -> Unit): Unit defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'name' @ [336:21] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[ValueParameterDescriptorImpl]

'it' @ [337:32] ==> value-parameter it: PsiMember defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates.<anonymous>[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [337:35] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMember[JavaMethodDescriptor]

'STATIC' @ [337:67] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'processor' @ [338:33] ==> val processor: (CallableDescriptor) -> Unit defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'result' @ [341:16] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.collectMemberCandidates[LocalVariableDescriptor]

'listOfNotNull' @ [348:29] ==> public fun <T : Any> listOfNotNull(vararg elements: ReceiverParameterDescriptor?): List<ReceiverParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReceiverParameterDescriptor

'extensionReceiverParameter' @ [348:43] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiverParameter' @ [348:71] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'takeIf' @ [348:97] ==> @InlineOnly @SinceKotlin public inline fun <T> ReceiverParameterDescriptor?.takeIf(predicate: (ReceiverParameterDescriptor?) -> Boolean): ReceiverParameterDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor?

'checkDispatchReceiver' @ [348:106] ==> value-parameter checkDispatchReceiver: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor[ValueParameterDescriptorImpl]

'generateSequence' @ [350:40] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Collection<ReceiverType>?, nextFunction: (Collection<ReceiverType>) -> Collection<ReceiverType>?): Sequence<Collection<ReceiverType>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Collection<ReceiverType>

'explicitReceiverTypes' @ [350:57] ==> value-parameter explicitReceiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor[ValueParameterDescriptorImpl]

'ifEmpty' @ [350:79] ==> public inline fun <T, C : Collection<ReceiverType>> Collection<ReceiverType>.ifEmpty(body: () -> Collection<ReceiverType>): Collection<ReceiverType> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType
    <C : Collection<T>> -> Collection<ReceiverType>

'allReceiverTypes' @ [350:89] ==> value-parameter allReceiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor[ValueParameterDescriptorImpl]

'allReceiverTypes' @ [350:111] ==> value-parameter allReceiverTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor[ValueParameterDescriptorImpl]

'bothReceivers' @ [352:16] ==> val bothReceivers: List<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor[LocalVariableDescriptor]

'zip' @ [353:18] ==> public infix fun <T, R> Iterable<ReceiverParameterDescriptor>.zip(other: Iterable<Collection<ReceiverType>>): List<Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Collection<ReceiverType>

'receiverTypesPerReceiver' @ [353:22] ==> val receiverTypesPerReceiver: Sequence<Collection<ReceiverType>> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor[LocalVariableDescriptor]

'asIterable' @ [353:47] ==> public fun <T> Sequence<Collection<ReceiverType>>.asIterable(): Iterable<Collection<ReceiverType>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<ReceiverType>

'all' @ [354:18] ==> public inline fun <T> Iterable<Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>>.all(predicate: (Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReceiverParameterDescriptor, Collection<ReceiverType>>

'component1' @ [354:25] ==> public final operator fun component1(): ReceiverParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [354:35] ==> public final operator fun component2(): Collection<ReceiverType> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'possibleTypes' @ [354:53] ==> val possibleTypes: Collection<ReceiverType> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor.<anonymous>[LocalVariableDescriptor]

'any' @ [354:67] ==> public inline fun <T> Iterable<ReceiverType>.any(predicate: (ReceiverType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverType

'it' @ [354:73] ==> value-parameter it: ReceiverType defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [354:76] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.ReceiverType[DeserializedPropertyDescriptor]

'isSubtypeOf' @ [354:81] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'receiver' @ [354:93] ==> val receiver: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.isValidByReceiversFor.<anonymous>[LocalVariableDescriptor]

'type' @ [354:102] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'super' @ [363:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[LazyClassReceiverParameterDescriptor]

'fillCandidates' @ [363:22] ==> public open fun fillCandidates(name: String, callTypeAndReceiver: CallTypeAndReceiver<*, *>, bindingContext: BindingContext, indicesHelper: KotlinIndicesHelper): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[SimpleFunctionDescriptorImpl]

'name' @ [363:37] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [363:43] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'bindingContext' @ [363:64] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'indicesHelper' @ [363:80] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'collectMemberCandidates' @ [363:97] ==> private final fun collectMemberCandidates(name: String, callTypeAndReceiver: CallTypeAndReceiver<*, *>, bindingContext: BindingContext, indicesHelper: KotlinIndicesHelper): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix[SimpleFunctionDescriptorImpl]

'name' @ [363:121] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'callTypeAndReceiver' @ [363:127] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'bindingContext' @ [363:148] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'indicesHelper' @ [363:164] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.fillCandidates[ValueParameterDescriptorImpl]

'Factory' @ [366:34] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'diagnostic' @ [368:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [368:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'let' @ [368:69] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> ImportFix): ImportFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> ImportFix

'ImportFixBase<KtSimpleNameExpression>' @ [372:84] ==> protected constructor ImportFixBase<T : KtExpression>(expression: KtSimpleNameExpression, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> KtSimpleNameExpression

'expression' @ [372:122] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.<init>[ValueParameterDescriptorImpl]

'MyFactory' @ [372:134] ==> public companion object MyFactory : ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix[FakeCallableDescriptorForObject]

'element' @ [373:45] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix[PropertyDescriptorImpl]

'let' @ [373:54] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> CallTypeAndReceiver.CALLABLE_REFERENCE?): CallTypeAndReceiver.CALLABLE_REFERENCE? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> CALLABLE_REFERENCE?

'CallTypeAndReceiver' @ [374:9] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'detect' @ [374:29] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [374:36] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.getCallTypeAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [378:26] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix[PropertyDescriptorImpl]

'emptyList' @ [378:44] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'callTypeAndReceiver' @ [380:32] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.fillCandidates[ValueParameterDescriptorImpl]

'toFilter' @ [380:52] ==> private fun CallTypeAndReceiver<*, *>.toFilter(): (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix[SimpleFunctionDescriptorImpl]

'indicesHelper' @ [382:16] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.fillCandidates[ValueParameterDescriptorImpl]

'getClassesByName' @ [382:30] ==> private fun KotlinIndicesHelper.getClassesByName(expressionForPlatform: KtExpression, name: String): Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.quickfix[SimpleFunctionDescriptorImpl]

'expression' @ [382:47] ==> val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.fillCandidates[LocalVariableDescriptor]

'name' @ [382:59] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.fillCandidates[ValueParameterDescriptorImpl]

'asSequence' @ [383:18] ==> public fun <T> Iterable<ClassDescriptor>.asSequence(): Sequence<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'map' @ [384:18] ==> public fun <T, R> Sequence<ClassDescriptor>.map(transform: (ClassDescriptor) -> Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>): Sequence<Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Collection<(org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)>

'it' @ [384:24] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.fillCandidates.<anonymous>[ValueParameterDescriptorImpl]

'constructors' @ [384:27] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'flatten' @ [384:42] ==> @JvmName public fun <T> Sequence<Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>>.flatten(): Sequence<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'filter' @ [385:18] ==> public fun <T> Sequence<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): Sequence<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'it' @ [385:27] ==> value-parameter it: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.fillCandidates.<anonymous>[ValueParameterDescriptorImpl]

'importableFqName' @ [385:30] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'filter' @ [386:18] ==> public fun <T> Sequence<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.filter(predicate: ((ClassConstructorDescriptor..ClassConstructorDescriptor?)) -> Boolean): Sequence<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'filterByCallType' @ [386:25] ==> val filterByCallType: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.fillCandidates[LocalVariableDescriptor]

'toList' @ [387:18] ==> public fun <T> Sequence<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.toList(): List<(ClassConstructorDescriptor..ClassConstructorDescriptor?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'createSingleImportActionForConstructor' @ [391:16] ==> internal fun createSingleImportActionForConstructor(project: Project, editor: Editor, element: KtElement, fqNames: Collection<FqName>): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.actions[SimpleFunctionDescriptorImpl]

'project' @ [391:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.createAction[ValueParameterDescriptorImpl]

'editor' @ [391:64] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.createAction[ValueParameterDescriptorImpl]

'element' @ [391:72] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.createAction[ValueParameterDescriptorImpl]

'suggestions' @ [391:81] ==> protected final lateinit var suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix[PropertyDescriptorImpl]

'element' @ [394:32] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix[PropertyDescriptorImpl]

'mainReference' @ [394:41] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolvesByNames' @ [394:56] ==> public open val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'emptyList' @ [394:75] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'Factory' @ [396:34] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'diagnostic' @ [398:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportConstructorReferenceFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [398:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'let' @ [398:69] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> ImportConstructorReferenceFix): ImportConstructorReferenceFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> ImportConstructorReferenceFix

'OrdinaryImportFixBase<KtExpression>' @ [402:60] ==> public constructor OrdinaryImportFixBase<T : KtExpression>(expression: KtExpression, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> KtExpression

'expression' @ [402:96] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.InvokeImportFix.<init>[ValueParameterDescriptorImpl]

'MyFactory' @ [402:108] ==> public companion object MyFactory : ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.InvokeImportFix[FakeCallableDescriptorForObject]

'listOf' @ [403:32] ==> public fun <T> listOf(element: Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'OperatorNameConventions' @ [403:39] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [403:63] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [405:45] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.InvokeImportFix[PropertyDescriptorImpl]

'let' @ [405:54] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> CallTypeAndReceiver.OPERATOR): CallTypeAndReceiver.OPERATOR defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> OPERATOR

'CallTypeAndReceiver' @ [405:60] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'OPERATOR' @ [405:80] ==> public constructor OPERATOR(receiver: KtExpression) defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.OPERATOR[DeserializedClassConstructorDescriptor]

'it' @ [405:89] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.InvokeImportFix.getCallTypeAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'Factory' @ [407:34] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'diagnostic' @ [409:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.InvokeImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [409:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'let' @ [409:59] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> InvokeImportFix): InvokeImportFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> InvokeImportFix

'OrdinaryImportFixBase<KtArrayAccessExpression>' @ [417:5] ==> public constructor OrdinaryImportFixBase<T : KtExpression>(expression: KtArrayAccessExpression, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> KtArrayAccessExpression

'element' @ [417:52] ==> value-parameter element: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.<init>[ValueParameterDescriptorImpl]

'MyFactory' @ [417:61] ==> public companion object MyFactory : ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix[FakeCallableDescriptorForObject]

'element' @ [419:45] ==> protected final val element: KtArrayAccessExpression? defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix[PropertyDescriptorImpl]

'let' @ [419:54] ==> @InlineOnly public inline fun <T, R> KtArrayAccessExpression.let(block: (KtArrayAccessExpression) -> CallTypeAndReceiver.OPERATOR): CallTypeAndReceiver.OPERATOR defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtArrayAccessExpression
    <R> -> OPERATOR

'CallTypeAndReceiver' @ [419:60] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'OPERATOR' @ [419:80] ==> public constructor OPERATOR(receiver: KtExpression) defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.OPERATOR[DeserializedClassConstructorDescriptor]

'it' @ [419:89] ==> value-parameter it: KtArrayAccessExpression defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.getCallTypeAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'arrayExpression' @ [419:92] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'showHint' @ [421:45] ==> private final val showHint: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix[PropertyDescriptorImpl]

'super' @ [421:57] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix[LazyClassReceiverParameterDescriptor]

'showHint' @ [421:63] ==> public open fun showHint(editor: Editor): Boolean defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[SimpleFunctionDescriptorImpl]

'editor' @ [421:72] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.showHint[ValueParameterDescriptorImpl]

'Factory' @ [423:34] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'when (diagnostic.factory) {
                Errors.NO_GET_METHOD -> OperatorNameConventions.GET
                Errors.NO_SET_METHOD -> OperatorNameConventions.SET
                else -> throw IllegalStateException("Shouldn't be called for other diagnostics")
            }' @ [425:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Name, entry1: Name, entry2: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Name

'diagnostic' @ [425:26] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.importName[ValueParameterDescriptorImpl]

'factory' @ [425:37] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'NO_GET_METHOD' @ [426:24] ==> public final val NO_GET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'OperatorNameConventions' @ [426:41] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET' @ [426:65] ==> @field:JvmField public final val GET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'NO_SET_METHOD' @ [427:24] ==> public final val NO_SET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'OperatorNameConventions' @ [427:41] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [427:65] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'IllegalStateException' @ [428:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'diagnostic' @ [433:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'factory' @ [433:38] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'assert' @ [434:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'factory' @ [434:20] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[LocalVariableDescriptor]

'NO_GET_METHOD' @ [434:38] ==> public final val NO_GET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'factory' @ [434:55] ==> val factory: DiagnosticFactory<*> defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[LocalVariableDescriptor]

'NO_SET_METHOD' @ [434:73] ==> public final val NO_SET_METHOD: (DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>..DiagnosticFactory0<(KtArrayAccessExpression..KtArrayAccessExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnostic' @ [436:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [436:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [437:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[LocalVariableDescriptor]

'element' @ [437:55] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[LocalVariableDescriptor]

'arrayExpression' @ [437:63] ==> public final val KtArrayAccessExpression.arrayExpression: KtExpression?[MyPropertyDescriptor]

'ArrayAccessorImportFix' @ [438:24] ==> public constructor ArrayAccessorImportFix(element: KtArrayAccessExpression, importNames: Collection<Name>, showHint: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix[ClassConstructorDescriptorImpl]

'element' @ [438:47] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[LocalVariableDescriptor]

'listOf' @ [438:56] ==> public fun <T> listOf(element: Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'importName' @ [438:63] ==> private final fun importName(diagnostic: Diagnostic): Name defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory[SimpleFunctionDescriptorImpl]

'diagnostic' @ [438:74] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'OrdinaryImportFixBase<KtExpression>' @ [450:5] ==> public constructor OrdinaryImportFixBase<T : KtExpression>(expression: KtExpression, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> KtExpression

'element' @ [450:41] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.<init>[ValueParameterDescriptorImpl]

'MyFactory' @ [450:50] ==> public companion object MyFactory : ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix[FakeCallableDescriptorForObject]

'CallTypeAndReceiver' @ [452:45] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'DELEGATE' @ [452:65] ==> public constructor DELEGATE(receiver: KtExpression?) defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.DELEGATE[DeserializedClassConstructorDescriptor]

'element' @ [452:74] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix[PropertyDescriptorImpl]

'solveSeveralProblems' @ [455:13] ==> private final val solveSeveralProblems: Boolean defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix[PropertyDescriptorImpl]

'createGroupedImportsAction' @ [456:20] ==> internal fun createGroupedImportsAction(project: Project, editor: Editor, element: KtElement, autoImportDescription: String, fqNames: Collection<FqName>): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.actions[SimpleFunctionDescriptorImpl]

'project' @ [456:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.createAction[ValueParameterDescriptorImpl]

'editor' @ [456:56] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.createAction[ValueParameterDescriptorImpl]

'element' @ [456:64] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.createAction[ValueParameterDescriptorImpl]

'suggestions' @ [456:95] ==> protected final lateinit var suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix[PropertyDescriptorImpl]

'super' @ [459:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix[LazyClassReceiverParameterDescriptor]

'createAction' @ [459:22] ==> protected open fun createAction(project: Project, editor: Editor, element: KtExpression): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[SimpleFunctionDescriptorImpl]

'project' @ [459:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.createAction[ValueParameterDescriptorImpl]

'editor' @ [459:44] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.createAction[ValueParameterDescriptorImpl]

'element' @ [459:52] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.createAction[ValueParameterDescriptorImpl]

'Factory' @ [462:34] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'diagnostics' @ [464:20] ==> value-parameter diagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.importNames[ValueParameterDescriptorImpl]

'map' @ [464:32] ==> public inline fun <T, R> Iterable<Diagnostic>.map(transform: (Diagnostic) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Name

'DELEGATE_SPECIAL_FUNCTION_MISSING' @ [465:53] ==> public final val DELEGATE_SPECIAL_FUNCTION_MISSING: (DiagnosticFactory2<(KtExpression..KtExpression?), (String..String?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (String..String?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [465:87] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtExpression..KtExpression?), (String..String?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'it' @ [465:92] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.importNames.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [465:96] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (String..String?), (KotlinType..KotlinType?)>.a: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'if (missingMethodSignature.startsWith(OperatorNameConventions.GET_VALUE.identifier))
                    OperatorNameConventions.GET_VALUE
                else
                    OperatorNameConventions.SET_VALUE' @ [466:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name, elseBranch: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name

'missingMethodSignature' @ [466:21] ==> val missingMethodSignature: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.importNames.<anonymous>[LocalVariableDescriptor]

'startsWith' @ [466:44] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'OperatorNameConventions' @ [466:55] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET_VALUE' @ [466:79] ==> @field:JvmField public final val GET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'identifier' @ [466:89] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'OperatorNameConventions' @ [467:21] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET_VALUE' @ [467:45] ==> @field:JvmField public final val GET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'OperatorNameConventions' @ [469:21] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET_VALUE' @ [469:45] ==> @field:JvmField public final val SET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'distinct' @ [470:15] ==> public fun <T> Iterable<Name>.distinct(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'diagnostic' @ [474:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [474:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'let' @ [474:59] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> DelegateAccessorsImportFix): DelegateAccessorsImportFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> DelegateAccessorsImportFix

'DelegateAccessorsImportFix' @ [475:21] ==> public constructor DelegateAccessorsImportFix(element: KtExpression, importNames: Collection<Name>, solveSeveralProblems: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix[ClassConstructorDescriptorImpl]

'it' @ [475:48] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportAction.<anonymous>[ValueParameterDescriptorImpl]

'importNames' @ [475:52] ==> private final fun importNames(diagnostics: Collection<Diagnostic>): Collection<Name> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory[SimpleFunctionDescriptorImpl]

'listOf' @ [475:64] ==> public fun <T> listOf(element: Diagnostic): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'diagnostic' @ [475:71] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'sameTypeDiagnostics' @ [480:27] ==> value-parameter sameTypeDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportActionsForAllProblems[ValueParameterDescriptorImpl]

'first' @ [480:47] ==> public fun <T> Iterable<Diagnostic>.first(): Diagnostic defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'psiElement' @ [480:55] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'importNames' @ [481:25] ==> private final fun importNames(diagnostics: Collection<Diagnostic>): Collection<Name> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory[SimpleFunctionDescriptorImpl]

'sameTypeDiagnostics' @ [481:37] ==> value-parameter sameTypeDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportActionsForAllProblems[ValueParameterDescriptorImpl]

'listOfNotNull' @ [482:20] ==> public fun <T : Any> listOfNotNull(element: DelegateAccessorsImportFix?): List<DelegateAccessorsImportFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DelegateAccessorsImportFix

'element' @ [482:35] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportActionsForAllProblems[LocalVariableDescriptor]

'let' @ [482:62] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> DelegateAccessorsImportFix): DelegateAccessorsImportFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> DelegateAccessorsImportFix

'DelegateAccessorsImportFix' @ [482:68] ==> public constructor DelegateAccessorsImportFix(element: KtExpression, importNames: Collection<Name>, solveSeveralProblems: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix[ClassConstructorDescriptorImpl]

'it' @ [482:95] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportActionsForAllProblems.<anonymous>[ValueParameterDescriptorImpl]

'names' @ [482:99] ==> val names: Collection<Name> defined in org.jetbrains.kotlin.idea.quickfix.DelegateAccessorsImportFix.MyFactory.createImportActionsForAllProblems[LocalVariableDescriptor]

'OrdinaryImportFixBase<KtExpression>' @ [491:5] ==> public constructor OrdinaryImportFixBase<T : KtExpression>(expression: KtExpression, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> KtExpression

'element' @ [491:41] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.<init>[ValueParameterDescriptorImpl]

'MyFactory' @ [491:50] ==> public companion object MyFactory : ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix[FakeCallableDescriptorForObject]

'element' @ [493:45] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix[PropertyDescriptorImpl]

'let' @ [493:54] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> CallTypeAndReceiver.OPERATOR): CallTypeAndReceiver.OPERATOR defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> OPERATOR

'CallTypeAndReceiver' @ [493:60] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'OPERATOR' @ [493:80] ==> public constructor OPERATOR(receiver: KtExpression) defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.OPERATOR[DeserializedClassConstructorDescriptor]

'it' @ [493:89] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.getCallTypeAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'solveSeveralProblems' @ [496:13] ==> private final val solveSeveralProblems: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix[PropertyDescriptorImpl]

'createGroupedImportsAction' @ [497:20] ==> internal fun createGroupedImportsAction(project: Project, editor: Editor, element: KtElement, autoImportDescription: String, fqNames: Collection<FqName>): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.actions[SimpleFunctionDescriptorImpl]

'project' @ [497:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.createAction[ValueParameterDescriptorImpl]

'editor' @ [497:56] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.createAction[ValueParameterDescriptorImpl]

'element' @ [497:64] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.createAction[ValueParameterDescriptorImpl]

'suggestions' @ [497:96] ==> protected final lateinit var suggestions: Collection<FqName> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix[PropertyDescriptorImpl]

'super' @ [500:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix[LazyClassReceiverParameterDescriptor]

'createAction' @ [500:22] ==> protected open fun createAction(project: Project, editor: Editor, element: KtExpression): KotlinAddImportAction defined in org.jetbrains.kotlin.idea.quickfix.OrdinaryImportFixBase[SimpleFunctionDescriptorImpl]

'project' @ [500:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.createAction[ValueParameterDescriptorImpl]

'editor' @ [500:44] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.createAction[ValueParameterDescriptorImpl]

'element' @ [500:52] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.createAction[ValueParameterDescriptorImpl]

'Factory' @ [503:34] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'diagnostics' @ [505:17] ==> value-parameter diagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.importNames[ValueParameterDescriptorImpl]

'map' @ [505:29] ==> public inline fun <T, R> Iterable<Diagnostic>.map(transform: (Diagnostic) -> Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Name

'identifier' @ [505:40] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'COMPONENT_FUNCTION_MISSING' @ [505:58] ==> public final val COMPONENT_FUNCTION_MISSING: (DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [505:85] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'it' @ [505:90] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.importNames.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [505:94] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?)>.a: (Name..Name?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.name.Name..org.jetbrains.kotlin.name.Name?)
    <B : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'identifier' @ [505:96] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'diagnostic' @ [508:18] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [508:29] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'let' @ [508:59] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> ComponentsImportFix): ComponentsImportFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> ComponentsImportFix

'ComponentsImportFix' @ [509:21] ==> public constructor ComponentsImportFix(element: KtExpression, importNames: Collection<Name>, solveSeveralProblems: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix[ClassConstructorDescriptorImpl]

'it' @ [509:41] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportAction.<anonymous>[ValueParameterDescriptorImpl]

'importNames' @ [509:45] ==> private final fun importNames(diagnostics: Collection<Diagnostic>): List<Name> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory[SimpleFunctionDescriptorImpl]

'listOf' @ [509:57] ==> public fun <T> listOf(element: Diagnostic): List<Diagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'diagnostic' @ [509:64] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'sameTypeDiagnostics' @ [513:27] ==> value-parameter sameTypeDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportActionsForAllProblems[ValueParameterDescriptorImpl]

'first' @ [513:47] ==> public fun <T> Iterable<Diagnostic>.first(): Diagnostic defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'psiElement' @ [513:55] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'importNames' @ [514:25] ==> private final fun importNames(diagnostics: Collection<Diagnostic>): List<Name> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory[SimpleFunctionDescriptorImpl]

'sameTypeDiagnostics' @ [514:37] ==> value-parameter sameTypeDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportActionsForAllProblems[ValueParameterDescriptorImpl]

'sameTypeDiagnostics' @ [515:40] ==> value-parameter sameTypeDiagnostics: Collection<Diagnostic> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportActionsForAllProblems[ValueParameterDescriptorImpl]

'size' @ [515:60] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'listOfNotNull' @ [516:20] ==> public fun <T : Any> listOfNotNull(element: ComponentsImportFix?): List<ComponentsImportFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ComponentsImportFix

'element' @ [516:35] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportActionsForAllProblems[LocalVariableDescriptor]

'let' @ [516:62] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> ComponentsImportFix): ComponentsImportFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> ComponentsImportFix

'ComponentsImportFix' @ [516:68] ==> public constructor ComponentsImportFix(element: KtExpression, importNames: Collection<Name>, solveSeveralProblems: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix[ClassConstructorDescriptorImpl]

'it' @ [516:88] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportActionsForAllProblems.<anonymous>[ValueParameterDescriptorImpl]

'names' @ [516:92] ==> val names: List<Name> defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportActionsForAllProblems[LocalVariableDescriptor]

'solveSeveralProblems' @ [516:99] ==> val solveSeveralProblems: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ComponentsImportFix.MyFactory.createImportActionsForAllProblems[LocalVariableDescriptor]

'ImportFixBase<KtSimpleNameExpression>' @ [523:5] ==> protected constructor ImportFixBase<T : KtExpression>(expression: KtSimpleNameExpression, factory: ImportFixBase.Factory) defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtExpression> -> KtSimpleNameExpression

'expression' @ [523:43] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.<init>[ValueParameterDescriptorImpl]

'MyFactory' @ [523:55] ==> public companion object MyFactory : ImportFixBase.Factory defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix[FakeCallableDescriptorForObject]

'element' @ [524:45] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix[PropertyDescriptorImpl]

'let' @ [524:54] ==> @InlineOnly public inline fun <T, R> KtSimpleNameExpression.let(block: (KtSimpleNameExpression) -> CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>>): CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R> -> CallTypeAndReceiver<out KtElement?, CallType<out KtElement?>>

'CallTypeAndReceiver' @ [524:60] ==> public companion object defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'detect' @ [524:80] ==> public final fun detect(expression: KtSimpleNameExpression): CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [524:87] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.getCallTypeAndReceiver.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [526:32] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix[PropertyDescriptorImpl]

'mainReference' @ [526:41] ==> public val KtSimpleNameExpression.mainReference: KtSimpleNameReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'resolvesByNames' @ [526:56] ==> public open val resolvesByNames: Collection<Name> defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'emptyList' @ [526:75] ==> public fun <T> emptyList(): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'element' @ [529:23] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix[PropertyDescriptorImpl]

'emptyList' @ [529:41] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'element' @ [530:30] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics[LocalVariableDescriptor]

'parent' @ [530:38] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'emptyList' @ [530:76] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'callExpression' @ [531:16] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics[LocalVariableDescriptor]

'valueArguments' @ [531:31] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'callExpression' @ [532:16] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics[LocalVariableDescriptor]

'valueArguments' @ [532:31] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'mapNotNull' @ [532:46] ==> public inline fun <T, R : Any> Iterable<(KtValueArgument..KtValueArgument?)>.mapNotNull(transform: ((KtValueArgument..KtValueArgument?)) -> KtExpression?): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R : Any> -> KtExpression

'it' @ [532:59] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [532:62] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'callExpression' @ [533:16] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics[LocalVariableDescriptor]

'valueArguments' @ [533:31] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'mapNotNull' @ [533:46] ==> public inline fun <T, R : Any> Iterable<(KtValueArgument..KtValueArgument?)>.mapNotNull(transform: ((KtValueArgument..KtValueArgument?)) -> KtSimpleNameExpression?): List<KtSimpleNameExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R : Any> -> KtSimpleNameExpression

'it' @ [533:59] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [533:62] ==> @Nullable public open fun getArgumentName(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'referenceExpression' @ [533:81] ==> public open val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtValueArgumentName[JavaPropertyDescriptor]

'listOfNotNull' @ [534:16] ==> public fun <T : Any> listOfNotNull(vararg elements: KtElement?): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtElement

'callExpression' @ [534:30] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics[LocalVariableDescriptor]

'valueArgumentList' @ [534:45] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'callExpression' @ [535:30] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.elementsToCheckDiagnostics[LocalVariableDescriptor]

'referenceExpression' @ [535:45] ==> public fun KtExpression.referenceExpression(): KtReferenceExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [544:23] ==> protected final val element: KtSimpleNameExpression? defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix[PropertyDescriptorImpl]

'emptyList' @ [544:41] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'!' @ [546:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidIdentifier' @ [546:19] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [546:37] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'emptyList' @ [546:51] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'identifier' @ [547:31] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [547:42] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'element' @ [549:20] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'getParentCall' @ [549:28] ==> public fun KtElement.getParentCall(context: BindingContext, strict: Boolean = ...): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [549:42] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'emptyList' @ [549:68] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'call' @ [550:27] ==> val call: Call defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'callElement' @ [550:32] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'emptyList' @ [550:71] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'callElement' @ [551:13] ==> val callElement: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'anyDescendantOfType' @ [551:25] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (PsiErrorElement) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> PsiErrorElement

'emptyList' @ [551:72] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'callElement' @ [552:32] ==> val callElement: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'getQualifiedExpressionForSelectorOrThis' @ [552:44] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [554:20] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'containingKtFile' @ [554:28] ==> public final val KtSimpleNameExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'file' @ [555:32] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'getResolutionFacade' @ [555:37] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'elementToAnalyze' @ [556:31] ==> val elementToAnalyze: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'getResolutionScope' @ [556:48] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [556:67] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'resolutionFacade' @ [556:83] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'resolutionScope' @ [558:24] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'collectFunctions' @ [558:40] ==> public fun HierarchicalScope.collectFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [558:57] ==> val identifier: Name defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'FROM_IDE' @ [558:86] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'!' @ [561:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [561:18] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'callType' @ [561:38] ==> public final val callType: CallType<out KtElement?> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'descriptorKindFilter' @ [561:47] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType[DeserializedPropertyDescriptor]

'accepts' @ [561:68] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [561:76] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.filterFunction[ValueParameterDescriptorImpl]

'descriptor' @ [563:17] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.filterFunction[ValueParameterDescriptorImpl]

'original' @ [563:28] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'imported' @ [563:40] ==> val imported: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'resolutionScope' @ [566:50] ==> val resolutionScope: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'addImportingScope' @ [566:66] ==> public fun LexicalScope.addImportingScope(importScope: ImportingScope): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'ExplicitImportsScope' @ [566:84] ==> public constructor ExplicitImportsScope(descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.resolve.scopes.ExplicitImportsScope[DeserializedClassConstructorDescriptor]

'listOf' @ [566:105] ==> public fun <T> listOf(element: FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'descriptor' @ [566:112] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.filterFunction[ValueParameterDescriptorImpl]

'bindingContext' @ [567:32] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'getDataFlowInfoBefore' @ [567:47] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'elementToAnalyze' @ [567:69] ==> val elementToAnalyze: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'elementToAnalyze' @ [568:37] ==> val elementToAnalyze: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'analyzeInContext' @ [568:54] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'resolutionScopeWithAddedImport' @ [569:21] ==> val resolutionScopeWithAddedImport: LexicalScope defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.filterFunction[LocalVariableDescriptor]

'dataFlowInfo' @ [570:36] ==> val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.filterFunction[LocalVariableDescriptor]

'DEPENDENT' @ [571:59] ==> enum entry DEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'newBindingContext' @ [573:20] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.filterFunction[LocalVariableDescriptor]

'diagnostics' @ [573:38] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'none' @ [573:50] ==> public inline fun <T> Iterable<Diagnostic>.none(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [573:57] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.filterFunction.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [573:60] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'ERROR' @ [573:81] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'ArrayList' @ [576:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'descriptor' @ [579:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.processDescriptor[ValueParameterDescriptorImpl]

'filterFunction' @ [579:53] ==> local final fun filterFunction(descriptor: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[SimpleFunctionDescriptorImpl]

'descriptor' @ [579:68] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.processDescriptor[ValueParameterDescriptorImpl]

'result' @ [580:17] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'add' @ [580:24] ==> public open fun add(element: FunctionDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptor' @ [580:28] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.processDescriptor[ValueParameterDescriptorImpl]

'indicesHelper' @ [584:9] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'getCallableTopLevelExtensions' @ [585:18] ==> public final fun getCallableTopLevelExtensions(callTypeAndReceiver: CallTypeAndReceiver<*, *>, position: KtExpression, bindingContext: BindingContext, nameFilter: (String) -> Boolean): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'callTypeAndReceiver' @ [585:48] ==> value-parameter callTypeAndReceiver: CallTypeAndReceiver<*, *> defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'element' @ [585:69] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'bindingContext' @ [585:78] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'it' @ [585:96] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [585:102] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'forEach' @ [586:18] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'!' @ [588:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSelectorInQualified' @ [588:14] ==> public open fun isSelectorInQualified(@NotNull p0: KtSimpleNameExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [588:36] ==> val element: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'indicesHelper' @ [589:13] ==> value-parameter indicesHelper: KotlinIndicesHelper defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'getTopLevelCallablesByName' @ [590:22] ==> public final fun getTopLevelCallablesByName(name: String): Collection<CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'name' @ [590:49] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[ValueParameterDescriptorImpl]

'forEach' @ [591:22] ==> @HidesMembers public inline fun <T> Iterable<CallableDescriptor>.forEach(action: (CallableDescriptor) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'result' @ [594:16] ==> val result: ArrayList<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.fillCandidates[LocalVariableDescriptor]

'Factory' @ [597:34] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'diagnostic' @ [600:34] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.MyFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [600:45] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getStrictParentOfType' @ [600:56] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'callExpression' @ [601:34] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.MyFactory.createImportAction[LocalVariableDescriptor]

'calleeExpression' @ [601:49] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'ImportForMismatchingArgumentsFix' @ [602:20] ==> public constructor ImportForMismatchingArgumentsFix(expression: KtSimpleNameExpression) defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix[ClassConstructorDescriptorImpl]

'nameExpression' @ [602:53] ==> val nameExpression: KtNameReferenceExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMismatchingArgumentsFix.MyFactory.createImportAction[LocalVariableDescriptor]

'ImportFixBase.Factory' @ [607:51] ==> public constructor Factory() defined in org.jetbrains.kotlin.idea.quickfix.ImportFixBase.Factory[ClassConstructorDescriptorImpl]

'diagnostic' @ [609:23] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportForMissingOperatorFactory.createImportAction[ValueParameterDescriptorImpl]

'psiElement' @ [609:34] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'OPERATOR_MODIFIER_REQUIRED' @ [610:41] ==> public final val OPERATOR_MODIFIER_REQUIRED: (DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [610:68] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [610:73] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ImportForMissingOperatorFactory.createImportAction[ValueParameterDescriptorImpl]

'a' @ [610:85] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>.a: (FunctionDescriptor..FunctionDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)
    <B : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'operatorDescriptor' @ [611:20] ==> val operatorDescriptor: (FunctionDescriptor..FunctionDescriptor?) defined in org.jetbrains.kotlin.idea.quickfix.ImportForMissingOperatorFactory.createImportAction[LocalVariableDescriptor]

'name' @ [611:39] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'when (name) {
            OperatorNameConventions.GET, OperatorNameConventions.SET -> {
                if (element is KtArrayAccessExpression) {
                    return object : ArrayAccessorImportFix(element, listOf(name), false) {
                        override fun getSupportedErrors() = listOf(Errors.OPERATOR_MODIFIER_REQUIRED)
                    }
                }
            }
        }' @ [612:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'name' @ [612:15] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.ImportForMissingOperatorFactory.createImportAction[LocalVariableDescriptor]

'OperatorNameConventions' @ [613:13] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET' @ [613:37] ==> @field:JvmField public final val GET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'OperatorNameConventions' @ [613:42] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [613:66] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'element' @ [614:21] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMissingOperatorFactory.createImportAction[LocalVariableDescriptor]

'ArrayAccessorImportFix' @ [615:37] ==> public constructor ArrayAccessorImportFix(element: KtArrayAccessExpression, importNames: Collection<Name>, showHint: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ArrayAccessorImportFix[ClassConstructorDescriptorImpl]

'element' @ [615:60] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.ImportForMissingOperatorFactory.createImportAction[LocalVariableDescriptor]

'listOf' @ [615:69] ==> public fun <T> listOf(element: Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'name' @ [615:76] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.ImportForMissingOperatorFactory.createImportAction[LocalVariableDescriptor]

'listOf' @ [616:61] ==> public fun <T> listOf(element: (DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>?)): List<(DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory2<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?), (kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory2<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?), (kotlin.String..kotlin.String?)>?)

'OPERATOR_MODIFIER_REQUIRED' @ [616:75] ==> public final val OPERATOR_MODIFIER_REQUIRED: (DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (FunctionDescriptor..FunctionDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'when (TargetPlatformDetector.getPlatform(expressionForPlatform.containingKtFile)) {
            JsPlatform -> getKotlinClasses({ it == name },
                    // Enum entries should be contributes with members import fix
                                           psiFilter = { ktDeclaration -> ktDeclaration !is KtEnumEntry },
                                           kindFilter = { kind -> kind != ClassKind.ENUM_ENTRY })
            JvmPlatform -> getJvmClassesByName(name)
            else -> emptyList()
        }' @ [628:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<ClassDescriptor>, entry1: Collection<ClassDescriptor>, entry2: Collection<ClassDescriptor>): Collection<ClassDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<ClassDescriptor>

'getPlatform' @ [628:38] ==> @NotNull public open fun getPlatform(@NotNull p0: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'expressionForPlatform' @ [628:50] ==> value-parameter expressionForPlatform: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.getClassesByName[ValueParameterDescriptorImpl]

'containingKtFile' @ [628:72] ==> public final val KtExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'JsPlatform' @ [629:13] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'getKotlinClasses' @ [629:27] ==> public final fun getKotlinClasses(nameFilter: (String) -> Boolean, psiFilter: (KtDeclaration) -> Boolean = ..., kindFilter: (ClassKind) -> Boolean = ...): Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'it' @ [629:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.getClassesByName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [629:52] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.getClassesByName[ValueParameterDescriptorImpl]

'ktDeclaration' @ [631:75] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.getClassesByName.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [632:67] ==> value-parameter kind: ClassKind defined in org.jetbrains.kotlin.idea.quickfix.getClassesByName.<anonymous>[ValueParameterDescriptorImpl]

'ENUM_ENTRY' @ [632:85] ==> enum entry ENUM_ENTRY defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'JvmPlatform' @ [633:13] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'getJvmClassesByName' @ [633:28] ==> public final fun getJvmClassesByName(name: String): Collection<ClassDescriptor> defined in org.jetbrains.kotlin.idea.core.KotlinIndicesHelper[DeserializedSimpleFunctionDescriptor]

'name' @ [633:48] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.quickfix.getClassesByName[ValueParameterDescriptorImpl]

'emptyList' @ [634:21] ==> public fun <T> emptyList(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'this' @ [637:91] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.toFilter[ReceiverParameterDescriptorImpl]

'callType' @ [637:96] ==> public final val callType: CallType<out KtElement?> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[DeserializedPropertyDescriptor]

'descriptorKindFilter' @ [637:105] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType[DeserializedPropertyDescriptor]

'accepts' @ [637:126] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [637:134] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.toFilter.<anonymous>[ValueParameterDescriptorImpl]

