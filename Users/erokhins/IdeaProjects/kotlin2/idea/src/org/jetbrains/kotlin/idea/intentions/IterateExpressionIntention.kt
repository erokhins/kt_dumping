'SelfTargetingIntention<KtExpression>' @ [38:36] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtExpression

'java' @ [38:93] ==> public val <T> KClass<KtExpression>.java: Class<KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'element' @ [40:13] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parent' @ [40:21] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [41:21] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'textRange' @ [41:29] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'caretOffset' @ [42:13] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'range' @ [42:28] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'startOffset' @ [42:34] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'caretOffset' @ [42:49] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'range' @ [42:64] ==> val range: (TextRange..TextRange?) defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'endOffset' @ [42:70] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'data' @ [43:20] ==> private final fun data(expression: KtExpression): IterateExpressionIntention.Data? defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [43:25] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'text' @ [44:9] ==> public final var IterateExpressionIntention.text: String[MyPropertyDescriptor]

'IdeDescriptorRenderers' @ [44:33] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [44:56] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [44:89] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'data' @ [44:100] ==> val data: IterateExpressionIntention.Data defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'collectionType' @ [44:105] ==> public final val collectionType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.Data[PropertyDescriptorImpl]

'expression' @ [51:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [51:43] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [52:30] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'analyze' @ [52:47] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [52:55] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[ValueParameterDescriptorImpl]

'PARTIAL' @ [52:83] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [53:20] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'getType' @ [53:35] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [53:43] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[ValueParameterDescriptorImpl]

'expression' @ [54:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[ValueParameterDescriptorImpl]

'getResolutionScope' @ [54:32] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [54:51] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'resolutionFacade' @ [54:67] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'resolutionFacade' @ [55:24] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'ideService' @ [55:41] ==> public inline fun <reified T : Any> ResolutionFacade.ideService(): IterableTypesDetection defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IterableTypesDetection

'createDetector' @ [55:78] ==> public final fun createDetector(scope: LexicalScope): IterableTypesDetector defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection[DeserializedSimpleFunctionDescriptor]

'scope' @ [55:93] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'detector' @ [56:27] ==> val detector: IterableTypesDetector defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'elementType' @ [56:36] ==> public abstract fun elementType(type: KotlinType): FuzzyType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetector[DeserializedSimpleFunctionDescriptor]

'type' @ [56:48] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'type' @ [56:55] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'Data' @ [57:16] ==> public constructor Data(collectionType: KotlinType, elementType: KotlinType) defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.Data[ClassConstructorDescriptorImpl]

'type' @ [57:21] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'elementType' @ [57:27] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.data[LocalVariableDescriptor]

'editor' @ [63:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [63:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'data' @ [64:27] ==> private final fun data(expression: KtExpression): IterateExpressionIntention.Data? defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [64:32] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'elementType' @ [64:43] ==> public final val elementType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.Data[PropertyDescriptorImpl]

'NewDeclarationNameValidator' @ [65:29] ==> public constructor NewDeclarationNameValidator(visibleDeclarationsContext: KtElement?, checkDeclarationsIn: Sequence<PsiElement>, target: NewDeclarationNameValidator.Target, excludedDeclarations: List<KtDeclaration> = ...) defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator[DeserializedClassConstructorDescriptor]

'element' @ [65:57] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [65:66] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'siblings' @ [65:74] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'VARIABLES' @ [65:121] ==> enum entry VARIABLES defined in org.jetbrains.kotlin.idea.core.NewDeclarationNameValidator.Target[FakeCallableDescriptorForObject]

'element' @ [66:30] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [66:38] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [66:62] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [68:23] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [68:31] ==> public final val KtExpression.project: Project[MyPropertyDescriptor]

'KtPsiFactory' @ [69:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [69:39] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'psiFactory' @ [71:34] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [71:45] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [71:95] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'chooseApplicableComponentFunctions' @ [72:9] ==> internal fun chooseApplicableComponentFunctions(contextExpression: KtExpression, editor: Editor?, type: KotlinType? = ..., receiverExpression: KtExpression? = ..., callback: (List<FunctionDescriptor>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable[SimpleFunctionDescriptorImpl]

'element' @ [72:44] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'editor' @ [72:53] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'elementType' @ [72:61] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [72:74] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'project' @ [73:13] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'executeWriteCommand' @ [73:21] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'text' @ [73:41] ==> public final var IterateExpressionIntention.text: String[MyPropertyDescriptor]

'if (componentFunctions.isNotEmpty()) {
                    val collectingValidator = CollectingNameValidator(filter = nameValidator)
                    componentFunctions.map { suggestNamesForComponent(it, project, collectingValidator) }
                }
                else {
                    listOf(KotlinNameSuggester.suggestIterationVariableNames(element, elementType, bindingContext, nameValidator, "e"))
                }' @ [74:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Collection<String>>, elseBranch: List<Collection<String>>): List<Collection<String>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Collection<String>>

'componentFunctions' @ [74:33] ==> value-parameter componentFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [74:52] ==> @InlineOnly public inline fun <T> Collection<FunctionDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'CollectingNameValidator' @ [75:47] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'nameValidator' @ [75:80] ==> val nameValidator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'componentFunctions' @ [76:21] ==> value-parameter componentFunctions: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [76:40] ==> public inline fun <T, R> Iterable<FunctionDescriptor>.map(transform: (FunctionDescriptor) -> Set<String>): List<Set<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R> -> Set<String>

'suggestNamesForComponent' @ [76:46] ==> internal fun suggestNamesForComponent(descriptor: FunctionDescriptor, project: Project, validator: (String) -> Boolean): Set<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceVariable[SimpleFunctionDescriptorImpl]

'it' @ [76:71] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [76:75] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'collectingValidator' @ [76:84] ==> val collectingValidator: CollectingNameValidator defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'listOf' @ [79:21] ==> public fun <T> listOf(element: Collection<String>): List<Collection<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>

'KotlinNameSuggester' @ [79:28] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestIterationVariableNames' @ [79:48] ==> public final fun suggestIterationVariableNames(collection: KtExpression, elementType: KotlinType, bindingContext: BindingContext?, validator: (String) -> Boolean, defaultName: String?): Collection<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'element' @ [79:78] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'elementType' @ [79:87] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'bindingContext' @ [79:100] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'nameValidator' @ [79:116] ==> val nameValidator: NewDeclarationNameValidator defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'names' @ [82:37] ==> val names: List<Collection<String>> defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'singleOrNull' @ [82:43] ==> public fun <T> List<Collection<String>>.singleOrNull(): Collection<String>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>

'first' @ [82:59] ==> public fun <T> Iterable<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'psiFactory' @ [83:40] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'createDestructuringParameter' @ [83:51] ==> public final fun createDestructuringParameter(text: String): KtParameter defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'names' @ [83:80] ==> val names: List<Collection<String>> defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'indices' @ [83:86] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'joinToString' @ [83:94] ==> public fun <T> Iterable<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [83:141] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'psiFactory' @ [84:37] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [84:48] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'paramPattern' @ [84:99] ==> val paramPattern: Any defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'element' @ [84:113] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'forExpression' @ [85:17] ==> var forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'element' @ [85:33] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'replaced' @ [85:41] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtForExpression): KtForExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtForExpression

'forExpression' @ [85:50] ==> var forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'forcePsiPostprocessAndRestoreElement' @ [87:37] ==> public open fun <T : (PsiElement..PsiElement?)> forcePsiPostprocessAndRestoreElement(@NotNull p0: KtForExpression): (KtForExpression..KtForExpression?) defined in com.intellij.codeInsight.CodeInsightUtilCore[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtForExpression

'forExpression' @ [87:74] ==> var forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [87:90] ==> @InlineOnly public inline fun <T, R> KtForExpression.let(block: (KtForExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtForExpression
    <R> -> Unit

'forExpression' @ [88:44] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [88:58] ==> public final val KtForExpression.body: KtExpression?[MyPropertyDescriptor]

'statements' @ [88:85] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'single' @ [88:96] ==> public fun <T> List<(KtExpression..KtExpression?)>.single(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'forExpression' @ [89:38] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [89:52] ==> public final val KtForExpression.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'entries' @ [89:78] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'listOf' @ [89:89] ==> public fun <T> listOf(element: KtParameter): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'forExpression' @ [89:96] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'loopParameter' @ [89:110] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'TemplateBuilderImpl' @ [91:43] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'forExpression' @ [91:63] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [92:27] ==> public final operator fun component1(): {ASTDelegatePsiElement & KtCallableDeclaration & KtValVarKeywordOwner} defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [92:38] ==> public final operator fun component2(): Collection<String> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'iterator' @ [92:57] ==> public abstract fun iterator(): Iterator<Pair<{ASTDelegatePsiElement & KtCallableDeclaration & KtValVarKeywordOwner}, Collection<String>>> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'parameters' @ [92:58] ==> val parameters: List<({ASTDelegatePsiElement & KtCallableDeclaration & KtValVarKeywordOwner}..{ASTDelegatePsiElement & KtCallableDeclaration & KtValVarKeywordOwner}?)> defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'names' @ [92:73] ==> val names: List<Collection<String>> defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>[LocalVariableDescriptor]

'templateBuilder' @ [93:25] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replaceElement' @ [93:41] ==> public open fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'parameter' @ [93:56] ==> val parameter: {ASTDelegatePsiElement & KtCallableDeclaration & KtValVarKeywordOwner} defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ChooseStringExpression' @ [93:67] ==> public constructor ChooseStringExpression(suggestions: Collection<String>, default: String = ..., advertisementText: String? = ...) defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression[ClassConstructorDescriptorImpl]

'parameterNames' @ [93:90] ==> val parameterNames: Collection<String> defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'templateBuilder' @ [95:21] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replaceElement' @ [95:37] ==> public open fun replaceElement(p0: (PsiElement..PsiElement?), p1: (Expression..Expression?), p2: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'bodyPlaceholder' @ [95:52] ==> val bodyPlaceholder: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ConstantNode' @ [95:69] ==> public constructor ConstantNode(p0: (String..String?)) defined in com.intellij.codeInsight.template.impl.ConstantNode[JavaClassConstructorDescriptor]

'templateBuilder' @ [96:21] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setEndVariableAfter' @ [96:37] ==> public open fun setEndVariableAfter(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'bodyPlaceholder' @ [96:57] ==> val bodyPlaceholder: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'templateBuilder' @ [98:21] ==> val templateBuilder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'run' @ [98:37] ==> public open fun run(@NotNull p0: Editor, p1: Boolean): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'editor' @ [98:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.IterateExpressionIntention.applyTo[ValueParameterDescriptorImpl]

