'KotlinMacro' @ [40:34] ==> public constructor KotlinMacro() defined in org.jetbrains.kotlin.idea.liveTemplates.macro.KotlinMacro[DeserializedClassConstructorDescriptor]

'suggestNames' @ [45:16] ==> private final fun suggestNames(context: ExpressionContext): Collection<String> defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro[SimpleFunctionDescriptorImpl]

'context' @ [45:29] ==> value-parameter context: ExpressionContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.calculateResult[ValueParameterDescriptorImpl]

'firstOrNull' @ [45:38] ==> public fun <T> Iterable<String>.firstOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [45:53] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> TextResult): TextResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> TextResult

'TextResult' @ [45:59] ==> public constructor TextResult(@NotNull p0: String) defined in com.intellij.codeInsight.template.TextResult[JavaClassConstructorDescriptor]

'suggestNames' @ [49:27] ==> private final fun suggestNames(context: ExpressionContext): Collection<String> defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro[SimpleFunctionDescriptorImpl]

'context' @ [49:40] ==> value-parameter context: ExpressionContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.calculateLookupItems[ValueParameterDescriptorImpl]

'suggestions' @ [50:13] ==> val suggestions: Collection<String> defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.calculateLookupItems[LocalVariableDescriptor]

'size' @ [50:25] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'suggestions' @ [51:16] ==> val suggestions: Collection<String> defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.calculateLookupItems[LocalVariableDescriptor]

'map' @ [51:28] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> LookupElementBuilder): List<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LookupElementBuilder

'create' @ [51:55] ==> @NotNull public open fun create(@NotNull p0: String): LookupElementBuilder defined in com.intellij.codeInsight.lookup.LookupElementBuilder[JavaMethodDescriptor]

'it' @ [51:62] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.calculateLookupItems.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [51:68] ==> public inline fun <reified T> Collection<LookupElementBuilder>.toTypedArray(): Array<LookupElementBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LookupElementBuilder

'context' @ [55:23] ==> value-parameter context: ExpressionContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[ValueParameterDescriptorImpl]

'project' @ [55:31] ==> public final val ExpressionContext.project: (Project..Project?)[MyPropertyDescriptor]

'getInstance' @ [56:53] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [56:65] ==> val project: (Project..Project?) defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'psiDocumentManager' @ [57:9] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'commitAllDocuments' @ [57:28] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'psiDocumentManager' @ [59:23] ==> val psiDocumentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'getPsiFile' @ [59:42] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'context' @ [59:53] ==> value-parameter context: ExpressionContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[ValueParameterDescriptorImpl]

'editor' @ [59:61] ==> public final val ExpressionContext.editor: Editor?[MyPropertyDescriptor]

'document' @ [59:70] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'emptyList' @ [59:101] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'psiFile' @ [60:21] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'findElementAt' @ [60:29] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'context' @ [60:43] ==> value-parameter context: ExpressionContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[ValueParameterDescriptorImpl]

'startOffset' @ [60:51] ==> public final val ExpressionContext.startOffset: Int[MyPropertyDescriptor]

'emptyList' @ [60:74] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'token' @ [61:27] ==> val token: PsiElement defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'parent' @ [61:33] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'emptyList' @ [61:76] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'token' @ [62:13] ==> val token: PsiElement defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'declaration' @ [62:22] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'nameIdentifier' @ [62:34] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'emptyList' @ [62:57] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'declaration' @ [66:28] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'initializer' @ [66:75] ==> public final val KtDeclarationWithInitializer.initializer: KtExpression?[MyPropertyDescriptor]

'initializer' @ [67:13] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'initializer' @ [68:34] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'analyze' @ [68:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [68:70] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'KotlinNameSuggester' @ [69:20] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByExpressionAndType' @ [69:40] ==> public final fun suggestNamesByExpressionAndType(expression: KtExpression, type: KotlinType?, bindingContext: BindingContext?, validator: (String) -> Boolean, defaultName: String?): Collection<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'initializer' @ [69:72] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'bindingContext' @ [69:91] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'nameValidator' @ [69:107] ==> val nameValidator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'declaration' @ [72:22] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'parent' @ [72:34] ==> public final val KtCallableDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [73:13] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'declaration' @ [73:42] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'parent' @ [73:57] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'loopParameter' @ [73:64] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'suggestIterationVariableName' @ [74:13] ==> private final fun suggestIterationVariableName(forExpression: KtForExpression, nameValidator: (String) -> Boolean): Collection<String>? defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro[SimpleFunctionDescriptorImpl]

'parent' @ [74:42] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'nameValidator' @ [74:50] ==> val nameValidator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'let' @ [74:66] ==> @InlineOnly public inline fun <T, R> Collection<String>.let(block: (Collection<String>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>
    <R> -> Nothing

'it' @ [74:79] ==> value-parameter it: Collection<String> defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [77:26] ==> val declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'resolveToDescriptor' @ [77:38] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [77:74] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'emptyList' @ [77:116] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'KotlinNameSuggester' @ [78:16] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesByType' @ [78:36] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [78:55] ==> val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'type' @ [78:66] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'nameValidator' @ [78:72] ==> val nameValidator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestNames[LocalVariableDescriptor]

'forExpression' @ [82:25] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[ValueParameterDescriptorImpl]

'loopRange' @ [82:39] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'forExpression' @ [83:32] ==> value-parameter forExpression: KtForExpression defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [83:46] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolutionFacade' @ [84:30] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'analyze' @ [84:47] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'loopRange' @ [84:55] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'PARTIAL' @ [84:82] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [85:20] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'getType' @ [85:35] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'loopRange' @ [85:43] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'loopRange' @ [86:21] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'getResolutionScope' @ [86:31] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [86:50] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'resolutionFacade' @ [86:66] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'resolutionFacade' @ [87:24] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'ideService' @ [87:41] ==> public inline fun <reified T : Any> ResolutionFacade.ideService(): IterableTypesDetection defined in org.jetbrains.kotlin.idea.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IterableTypesDetection

'createDetector' @ [87:78] ==> public final fun createDetector(scope: LexicalScope): IterableTypesDetector defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection[DeserializedSimpleFunctionDescriptor]

'scope' @ [87:93] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'detector' @ [88:27] ==> val detector: IterableTypesDetector defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'elementType' @ [88:36] ==> public abstract fun elementType(type: KotlinType): FuzzyType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetector[DeserializedSimpleFunctionDescriptor]

'type' @ [88:48] ==> val type: KotlinType defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'type' @ [88:55] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'KotlinNameSuggester' @ [89:16] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestIterationVariableNames' @ [89:36] ==> public final fun suggestIterationVariableNames(collection: KtExpression, elementType: KotlinType, bindingContext: BindingContext?, validator: (String) -> Boolean, defaultName: String?): Collection<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'loopRange' @ [89:66] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'elementType' @ [89:77] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'bindingContext' @ [89:90] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[LocalVariableDescriptor]

'nameValidator' @ [89:106] ==> value-parameter nameValidator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.liveTemplates.macro.SuggestVariableNameMacro.suggestIterationVariableName[ValueParameterDescriptorImpl]

