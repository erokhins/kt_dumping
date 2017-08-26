'SelfTargetingRangeIntention<KtObjectLiteralExpression>' @ [41:46] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtObjectLiteralExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtObjectLiteralExpression

'KtObjectLiteralExpression' @ [42:9] ==> public constructor KtObjectLiteralExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtObjectLiteralExpression[JavaClassConstructorDescriptor]

'java' @ [42:42] ==> public val <T> KClass<KtObjectLiteralExpression>.java: Class<KtObjectLiteralExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtObjectLiteralExpression

'element' @ [45:75] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applicabilityRange[ValueParameterDescriptorImpl]

'objectDeclaration' @ [45:83] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'getObjectKeyword' @ [45:101] ==> public final fun getObjectKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'textRange' @ [45:121] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [50:23] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'project' @ [50:31] ==> public final val KtObjectLiteralExpression.project: Project[MyPropertyDescriptor]

'element' @ [52:21] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'getResolutionScope' @ [52:29] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'element' @ [53:23] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'analyze' @ [53:31] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [53:55] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [54:33] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'getType' @ [54:41] ==> public fun KtExpression.getType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [54:49] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'scope' @ [55:48] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'findClassifier' @ [55:54] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [55:74] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [55:85] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [55:107] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'if (objectLiteralType != null) {
            KotlinNameSuggester.suggestNamesByType(objectLiteralType, validator, "O").first()
        }
        else {
            KotlinNameSuggester.suggestNameByName("O", validator)
        }' @ [56:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'objectLiteralType' @ [56:29] ==> val objectLiteralType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'suggestNamesByType' @ [57:33] ==> public final fun suggestNamesByType(type: KotlinType, validator: (String) -> Boolean, defaultName: String? = ...): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'objectLiteralType' @ [57:52] ==> val objectLiteralType: KotlinType? defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'validator' @ [57:71] ==> val validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'first' @ [57:87] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'suggestNameByName' @ [60:33] ==> public final fun suggestNameByName(name: String, validator: (String) -> Boolean): String defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'validator' @ [60:56] ==> val validator: (String) -> Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'KtPsiFactory' @ [63:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [63:39] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'element' @ [65:29] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [65:37] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'first' @ [65:53] ==> public inline fun <T> Sequence<PsiElement>.first(predicate: (PsiElement) -> Boolean): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [65:61] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [65:64] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'targetParent' @ [65:74] ==> value-parameter targetParent: KtElement defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'element' @ [67:33] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'objectDeclaration' @ [67:41] ==> public final val KtObjectLiteralExpression.objectDeclaration: KtObjectDeclaration[MyPropertyDescriptor]

'psiFactory' @ [68:24] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'createClass' @ [68:35] ==> public final fun createClass(text: String): KtClass defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'className' @ [68:55] ==> val className: String defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'objectDeclaration' @ [69:9] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'getSuperTypeList' @ [69:27] ==> public final fun getSuperTypeList(): KtSuperTypeList? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'let' @ [69:47] ==> @InlineOnly public inline fun <T, R> KtSuperTypeList.let(block: (KtSuperTypeList) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeList
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'newClass' @ [70:13] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'add' @ [70:22] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'psiFactory' @ [70:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'createColon' @ [70:37] ==> public final fun createColon(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newClass' @ [71:13] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'add' @ [71:22] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'it' @ [71:26] ==> value-parameter it: KtSuperTypeList defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>[ValueParameterDescriptorImpl]

'objectDeclaration' @ [73:9] ==> val objectDeclaration: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'getBody' @ [73:27] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'let' @ [73:38] ==> @InlineOnly public inline fun <T, R> KtClassBody.let(block: (KtClassBody) -> (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassBody
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'newClass' @ [74:13] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'add' @ [74:22] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'it' @ [74:26] ==> value-parameter it: KtClassBody defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [77:9] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'executeWriteCommand' @ [77:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'text' @ [77:37] ==> public final var ConvertObjectLiteralToClassIntention.text: String[MyPropertyDescriptor]

'ExtractionEngine' @ [78:13] ==> public constructor ExtractionEngine(helper: ExtractionEngineHelper) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[ClassConstructorDescriptorImpl]

'ExtractionEngineHelper' @ [79:30] ==> public constructor ExtractionEngineHelper(operationName: String) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngineHelper[ClassConstructorDescriptorImpl]

'text' @ [79:53] ==> public final var ConvertObjectLiteralToClassIntention.text: String[MyPropertyDescriptor]

'descriptorWithConflicts' @ [86:46] ==> value-parameter descriptorWithConflicts: ExtractableCodeDescriptorWithConflicts defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'descriptor' @ [86:70] ==> public final val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptorWithConflicts[PropertyDescriptorImpl]

'copy' @ [86:81] ==> public final fun copy(extractionData: ExtractionData = ..., originalContext: BindingContext = ..., suggestedNames: List<String> = ..., visibility: String = ..., parameters: List<Parameter> = ..., receiverParameter: Parameter? = ..., typeParameters: List<TypeParameter> = ..., replacementMap: MultiMap<KtSimpleNameExpression, Replacement> = ..., controlFlow: ControlFlow = ..., returnType: KotlinType = ..., modifiers: List<KtKeywordToken> = ...): ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractableCodeDescriptor[SimpleFunctionDescriptorImpl]

'listOf' @ [86:103] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'className' @ [86:110] ==> val className: String defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'doRefactor' @ [87:29] ==> public final fun doRefactor(config: ExtractionGeneratorConfiguration, onFinish: (ExtractionResult) -> Unit): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'ExtractionGeneratorConfiguration' @ [88:37] ==> public constructor ExtractionGeneratorConfiguration(descriptor: ExtractableCodeDescriptor, generatorOptions: ExtractionGeneratorOptions) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorConfiguration[ClassConstructorDescriptorImpl]

'descriptor' @ [88:70] ==> val descriptor: ExtractableCodeDescriptor defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<no name provided>.configureAndRun[LocalVariableDescriptor]

'DEFAULT' @ [88:109] ==> @JvmField public final val DEFAULT: ExtractionGeneratorOptions defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionGeneratorOptions.Companion[PropertyDescriptorImpl]

'onFinish' @ [89:37] ==> value-parameter onFinish: (ExtractionResult) -> Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<no name provided>.configureAndRun[ValueParameterDescriptorImpl]

'run' @ [93:15] ==> public final fun run(editor: Editor, extractionData: ExtractionData, onFinish: (ExtractionResult) -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionEngine[SimpleFunctionDescriptorImpl]

'editor' @ [93:19] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'ExtractionData' @ [93:27] ==> public constructor ExtractionData(originalFile: KtFile, originalRange: KotlinPsiRange, targetSibling: PsiElement, duplicateContainer: PsiElement? = ..., options: ExtractionOptions = ...) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionData[ClassConstructorDescriptorImpl]

'element' @ [93:42] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'containingKtFile' @ [93:50] ==> public final val KtObjectLiteralExpression.containingKtFile: KtFile[MyPropertyDescriptor]

'element' @ [93:68] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[ValueParameterDescriptorImpl]

'toRange' @ [93:76] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'targetSibling' @ [93:87] ==> val targetSibling: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'it' @ [94:43] ==> value-parameter it: ExtractionResult defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [94:46] ==> public final val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.ExtractionResult[PropertyDescriptorImpl]

'functionDeclaration' @ [95:21] ==> val functionDeclaration: KtFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>[LocalVariableDescriptor]

'valueParameters' @ [95:41] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [95:57] ==> @InlineOnly public inline fun <T> Collection<(KtParameter..KtParameter?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'psiFactory' @ [96:38] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'createValKeyword' @ [96:49] ==> public final fun createValKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newClass' @ [97:21] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'createPrimaryConstructorParameterListIfAbsent' @ [98:30] ==> public fun KtClass.createPrimaryConstructorParameterListIfAbsent(): KtParameterList defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'replaced' @ [99:30] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtParameterList): KtParameterList defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtParameterList

'functionDeclaration' @ [99:39] ==> val functionDeclaration: KtFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>[LocalVariableDescriptor]

'valueParameterList' @ [99:59] ==> public final val KtFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'parameters' @ [100:30] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'forEach' @ [101:30] ==> @HidesMembers public inline fun <T> Iterable<(KtParameter..KtParameter?)>.forEach(action: ((KtParameter..KtParameter?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [102:33] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addAfter' @ [102:36] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'valKeyword' @ [102:45] ==> val valKeyword: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [103:33] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addModifier' @ [103:36] ==> public open fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [103:57] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'functionDeclaration' @ [106:17] ==> val functionDeclaration: KtFunction defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replaced' @ [106:37] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtClass): KtClass defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'newClass' @ [106:46] ==> val newClass: KtClass defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'apply' @ [106:56] ==> @InlineOnly public inline fun <T> KtClass.apply(block: KtClass.() -> Unit): KtClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass

'primaryConstructor' @ [107:21] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'let' @ [107:41] ==> @InlineOnly public inline fun <T, R> KtPrimaryConstructor.let(block: (KtPrimaryConstructor) -> PsiElement): PsiElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPrimaryConstructor
    <R> -> PsiElement

'getInstance' @ [107:64] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [107:76] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply[LocalVariableDescriptor]

'reformat' @ [107:85] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'it' @ [107:94] ==> value-parameter it: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.doApply.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'editor' @ [114:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [116:26] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[ValueParameterDescriptorImpl]

'getExtractionContainers' @ [116:34] ==> public fun PsiElement.getExtractionContainers(strict: Boolean = ..., includeAll: Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'getApplication' @ [118:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [118:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'doApply' @ [119:20] ==> private final fun doApply(editor: Editor, element: KtObjectLiteralExpression, targetParent: KtElement): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention[SimpleFunctionDescriptorImpl]

'editor' @ [119:28] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [119:36] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[ValueParameterDescriptorImpl]

'containers' @ [119:45] ==> val containers: List<KtElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[LocalVariableDescriptor]

'last' @ [119:56] ==> public fun <T> List<KtElement>.last(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'chooseContainerElementIfNecessary' @ [122:9] ==> public fun <T> chooseContainerElementIfNecessary(containers: List<KtElement>, editor: Editor, title: String, highlightSelection: Boolean, toPsi: (KtElement) -> PsiElement, onSelect: (KtElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KtElement

'containers' @ [123:17] ==> val containers: List<KtElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[LocalVariableDescriptor]

'editor' @ [124:17] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[ValueParameterDescriptorImpl]

'if (containers.first() is KtFile) "Select target file" else "Select target code block / file"' @ [125:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containers' @ [125:21] ==> val containers: List<KtElement> defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[LocalVariableDescriptor]

'first' @ [125:32] ==> public fun <T> List<KtElement>.first(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [127:19] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'doApply' @ [128:19] ==> private final fun doApply(editor: Editor, element: KtObjectLiteralExpression, targetParent: KtElement): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention[SimpleFunctionDescriptorImpl]

'editor' @ [128:27] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [128:35] ==> value-parameter element: KtObjectLiteralExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo[ValueParameterDescriptorImpl]

'it' @ [128:44] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.intentions.ConvertObjectLiteralToClassIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

