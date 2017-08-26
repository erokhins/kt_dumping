'JvmField' @ [67:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'selectElementsWithTargetParent' @ [71:9] ==> public fun selectElementsWithTargetParent(operationName: String, editor: Editor, file: KtFile, title: String, elementKinds: Collection<CodeInsightUtils.ElementKind>, getContainers: (elements: List<PsiElement>, commonParent: PsiElement) -> List<PsiElement>, continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce[SimpleFunctionDescriptorImpl]

'REFACTORING_NAME' @ [72:17] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[PropertyDescriptorImpl]

'editor' @ [73:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.selectElements[ValueParameterDescriptorImpl]

'file' @ [74:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.selectElements[ValueParameterDescriptorImpl]

'listOf' @ [76:17] ==> public fun <T> listOf(element: CodeInsightUtils.ElementKind): List<CodeInsightUtils.ElementKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementKind

'TYPE_ELEMENT' @ [76:53] ==> enum entry TYPE_ELEMENT defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils.ElementKind[FakeCallableDescriptorForObject]

'getPossibleTypeParameterContainers' @ [77:32] ==> public fun getPossibleTypeParameterContainers(startFrom: PsiElement): List<KtTypeParameterListOwner> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter[SimpleFunctionDescriptorImpl]

'parent' @ [77:67] ==> value-parameter parent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.selectElements.<anonymous>[ValueParameterDescriptorImpl]

'continuation' @ [78:17] ==> value-parameter continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.selectElements[ValueParameterDescriptorImpl]

'targetParent' @ [83:27] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'elements' @ [84:36] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'singleOrNull' @ [84:45] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'showErrorHint' @ [85:39] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [85:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [85:62] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'REFACTORING_NAME' @ [85:93] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[PropertyDescriptorImpl]

'typeElementToExtract' @ [87:43] ==> val typeElementToExtract: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'createSmartPointer' @ [87:64] ==> public fun <E : PsiElement> KtTypeElement.createSmartPointer(): SmartPsiElementPointer<KtTypeElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtTypeElement

'targetOwner' @ [89:21] ==> val targetOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'getResolutionScope' @ [89:33] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [90:30] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'suggestNamesForTypeParameters' @ [90:50] ==> public final fun suggestNamesForTypeParameters(count: Int, validator: (String) -> Boolean): List<String> defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'CollectingNameValidator' @ [92:17] ==> @JvmOverloads public constructor CollectingNameValidator(existingNames: Collection<String> = ..., filter: (String) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.core.CollectingNameValidator[DeserializedClassConstructorDescriptor]

'targetOwner' @ [92:41] ==> val targetOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'typeParameters' @ [92:53] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'mapNotNull' @ [92:68] ==> public inline fun <T, R : Any> Iterable<(KtTypeParameter..KtTypeParameter?)>.mapNotNull(transform: ((KtTypeParameter..KtTypeParameter?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeParameter..org.jetbrains.kotlin.psi.KtTypeParameter?)
    <R : Any> -> String

'it' @ [92:81] ==> value-parameter it: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [92:84] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'scope' @ [93:21] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'findClassifier' @ [93:27] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'identifier' @ [93:47] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [93:58] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'FROM_IDE' @ [93:80] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'suggestedNames' @ [96:27] ==> val suggestedNames: List<String> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'single' @ [96:42] ==> public fun <T> List<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'typeElementToExtract' @ [98:23] ==> val typeElementToExtract: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'analyze' @ [98:44] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [98:68] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'typeElementToExtract' @ [99:28] ==> val typeElementToExtract: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'getAbbreviatedTypeOrType' @ [99:49] ==> public fun KtTypeElement.getAbbreviatedTypeOrType(context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [99:74] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'CreateTypeParameterByUnresolvedRefActionFactory' @ [102:17] ==> public object CreateTypeParameterByUnresolvedRefActionFactory : KotlinIntentionActionFactoryWithDelegate<KtUserType, CreateTypeParameterData> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter in file CreateTypeParameterByUnresolvedRefActionFactory.kt[FakeCallableDescriptorForObject]

'extractFixData' @ [102:65] ==> public final fun extractFixData(element: KtTypeElement, newName: String): CreateTypeParameterData? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterByUnresolvedRefActionFactory[SimpleFunctionDescriptorImpl]

'typeElementToExtract' @ [102:80] ==> val typeElementToExtract: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'defaultName' @ [102:102] ==> val defaultName: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'let' @ [102:116] ==> @InlineOnly public inline fun <T, R> CreateTypeParameterData.let(block: (CreateTypeParameterData) -> CreateTypeParameterData): CreateTypeParameterData defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CreateTypeParameterData
    <R> -> CreateTypeParameterData

'it' @ [103:21] ==> value-parameter it: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [103:24] ==> public final fun copy(declaration: KtTypeParameterListOwner = ..., typeParameters: List<TypeParameterInfo> = ...): CreateTypeParameterData defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[SimpleFunctionDescriptorImpl]

'listOf' @ [103:46] ==> public fun <T> listOf(element: TypeParameterInfo): List<TypeParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterInfo

'it' @ [103:53] ==> value-parameter it: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[ValueParameterDescriptorImpl]

'typeParameters' @ [103:56] ==> public final val typeParameters: List<TypeParameterInfo> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterData[PropertyDescriptorImpl]

'single' @ [103:71] ==> public fun <T> List<TypeParameterInfo>.single(): TypeParameterInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterInfo

'copy' @ [103:80] ==> public final fun copy(name: String = ..., upperBoundType: KotlinType? = ..., fakeTypeParameter: TypeParameterDescriptor = ...): TypeParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.TypeParameterInfo[SimpleFunctionDescriptorImpl]

'originalType' @ [103:102] ==> val originalType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'targetOwner' @ [103:132] ==> val targetOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'showErrorHint' @ [104:29] ==> public fun showErrorHint(project: Project, editor: Editor, message: String, title: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [104:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [104:52] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'REFACTORING_NAME' @ [104:116] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[PropertyDescriptorImpl]

'project' @ [106:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'executeCommand' @ [106:17] ==> public fun <T> Project.executeCommand(name: String, groupId: Any? = ..., command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'REFACTORING_NAME' @ [106:32] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[PropertyDescriptorImpl]

'CreateTypeParameterFromUsageFix' @ [107:36] ==> public constructor CreateTypeParameterFromUsageFix(originalElement: KtElement, data: CreateTypeParameterData, presentTypeParameterNames: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[ClassConstructorDescriptorImpl]

'typeElementToExtract' @ [107:68] ==> val typeElementToExtract: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'createTypeParameterData' @ [107:90] ==> val createTypeParameterData: CreateTypeParameterData defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'doInvoke' @ [107:122] ==> public final fun doInvoke(): List<KtTypeParameter> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createTypeParameter.CreateTypeParameterFromUsageFix[SimpleFunctionDescriptorImpl]

'singleOrNull' @ [107:133] ==> public fun <T> List<KtTypeParameter>.singleOrNull(): KtTypeParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameter

'newTypeParameter' @ [109:43] ==> val newTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'createSmartPointer' @ [109:60] ==> public fun <E : PsiElement> KtTypeParameter.createSmartPointer(): SmartPsiElementPointer<KtTypeParameter> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtTypeParameter

'newTypeParameterPointer' @ [112:45] ==> val newTypeParameterPointer: SmartPsiElementPointer<KtTypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'element' @ [112:69] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtTypeParameter>.element: KtTypeParameter?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtTypeParameter

'restoredTypeParameter' @ [113:37] ==> val restoredTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getStrictParentOfType' @ [113:59] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeParameterListOwner? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameterListOwner

'typeElementToExtractPointer' @ [114:51] ==> val typeElementToExtractPointer: SmartPsiElementPointer<KtTypeElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[LocalVariableDescriptor]

'element' @ [114:79] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtTypeElement>.element: KtTypeElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtTypeElement

'runWriteAction' @ [116:17] ==> public fun <T> runWriteAction(action: () -> Unit?): Unit? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit?

'KtPsiFactory' @ [117:47] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [117:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'createType' @ [117:69] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'restoredTypeParameter' @ [117:80] ==> val restoredTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [117:102] ==> public final val KtTypeParameter.name: String?[MyPropertyDescriptor]

'typeElement' @ [117:115] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'restoredOriginalTypeElement' @ [119:43] ==> val restoredOriginalTypeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toRange' @ [120:30] ==> public fun PsiElement?.toRange(): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'match' @ [121:30] ==> public open fun match(scope: PsiElement, unifier: KotlinPsiUnifier): List<UnificationResult.Matched> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'restoredOwner' @ [121:36] ==> val restoredOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinPsiUnifier' @ [121:51] ==> public companion object defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier[FakeCallableDescriptorForObject]

'DEFAULT' @ [121:68] ==> public final val DEFAULT: KotlinPsiUnifier defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiUnifier.Companion[DeserializedPropertyDescriptor]

'filterNot' @ [122:30] ==> public inline fun <T> Iterable<UnificationResult.Matched>.filterNot(predicate: (UnificationResult.Matched) -> Boolean): List<UnificationResult.Matched> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched

'it' @ [123:49] ==> value-parameter it: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [123:52] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'getTextRange' @ [123:58] ==> public abstract fun getTextRange(): TextRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'restoredOriginalTypeElement' @ [124:33] ==> val restoredOriginalTypeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'textRange' @ [124:61] ==> public final val KtTypeElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'intersects' @ [124:71] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'textRange' @ [124:82] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'restoredOwner' @ [125:36] ==> val restoredOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'typeParameterList' @ [125:50] ==> public final val KtTypeParameterListOwner.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'textRange' @ [125:69] ==> public final val KtTypeParameterList.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'intersects' @ [125:80] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'textRange' @ [125:91] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [127:30] ==> public inline fun <T, R> Iterable<UnificationResult.Matched>.map(transform: (UnificationResult.Matched) -> KotlinPsiRange): List<KotlinPsiRange> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Matched
    <R> -> KotlinPsiRange

'it' @ [127:36] ==> value-parameter it: UnificationResult.Matched defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [127:39] ==> public abstract val range: KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.UnificationResult.Matched[DeserializedPropertyDescriptor]

'elements' @ [127:45] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'toRange' @ [127:54] ==> public fun List<PsiElement>.toRange(significantOnly: Boolean = ...): KotlinPsiRange defined in org.jetbrains.kotlin.idea.util.psi.patternMatching[DeserializedSimpleFunctionDescriptor]

'restoredOriginalTypeElement' @ [129:21] ==> val restoredOriginalTypeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replace' @ [129:49] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeElement[JavaMethodDescriptor]

'parameterRefElement' @ [129:57] ==> val parameterRefElement: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'processDuplicates' @ [131:21] ==> public fun processDuplicates(duplicateReplacers: Map<KotlinPsiRange, () -> Unit>, project: Project, editor: Editor, scopeDescription: String = ..., usageDescription: String = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine[SimpleFunctionDescriptorImpl]

'duplicateRanges' @ [132:29] ==> val duplicateRanges: List<KotlinPsiRange> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'keysToMap' @ [132:45] ==> public fun <K, V> Iterable<KotlinPsiRange>.keysToMap(value: (KotlinPsiRange) -> () -> Unit): Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinPsiRange
    <V> -> Function0<Unit>

'it' @ [134:37] ==> value-parameter it: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [134:40] ==> public abstract val elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedPropertyDescriptor]

'singleOrNull' @ [134:49] ==> public fun <T> List<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'replace' @ [134:65] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'parameterRefElement' @ [134:73] ==> val parameterRefElement: KtTypeElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Unit' @ [135:37] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'project' @ [138:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'editor' @ [139:29] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'+' @ [140:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getElementDescription' @ [140:52] ==> @NotNull public open fun getElementDescription(@NotNull p0: PsiElement, @NotNull p1: ElementDescriptionLocation): String defined in com.intellij.psi.ElementDescriptionUtil[JavaMethodDescriptor]

'restoredOwner' @ [140:74] ==> val restoredOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'INSTANCE' @ [140:111] ==> public final val INSTANCE: (UsageViewTypeLocation..UsageViewTypeLocation?) defined in com.intellij.usageView.UsageViewTypeLocation[JavaPropertyDescriptor]

'restoredOwner' @ [140:128] ==> val restoredOwner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [140:142] ==> public final val KtTypeParameterListOwner.name: String?[MyPropertyDescriptor]

'restoredTypeParameter' @ [144:21] ==> val restoredTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'extendsBound' @ [144:43] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'let' @ [144:57] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> Unit

'editor' @ [145:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'selectionModel' @ [145:32] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'setSelection' @ [145:47] ==> public abstract fun setSelection(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'it' @ [145:60] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [145:63] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'it' @ [145:76] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'endOffset' @ [145:79] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'editor' @ [146:25] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'caretModel' @ [146:32] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [146:43] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'it' @ [146:56] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [146:59] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'!' @ [151:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [151:37] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [151:54] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'getSimpleContext' @ [152:53] ==> public open fun getSimpleContext(p0: (String..String?), p1: (Any..Any?), p2: (DataContext..DataContext?)): (DataContext..DataContext?) defined in com.intellij.openapi.actionSystem.impl.SimpleDataContext[JavaMethodDescriptor]

'PSI_ELEMENT' @ [152:85] ==> public final val PSI_ELEMENT: (DataKey<(PsiElement..PsiElement?)>..DataKey<(PsiElement..PsiElement?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'name' @ [152:97] ==> public final val <T : (Any..Any?)> DataKey<(PsiElement..PsiElement?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'newTypeParameter' @ [152:103] ==> val newTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'editor' @ [153:71] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'dataContext' @ [153:93] ==> public final val EditorEx.dataContext: DataContext[MyPropertyDescriptor]

'editor' @ [154:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'selectionModel' @ [154:24] ==> public final val Editor.selectionModel: SelectionModel[MyPropertyDescriptor]

'removeSelection' @ [154:39] ==> public abstract fun removeSelection(): Unit defined in com.intellij.openapi.editor.SelectionModel[JavaMethodDescriptor]

'editor' @ [155:17] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'caretModel' @ [155:24] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [155:35] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'newTypeParameter' @ [155:48] ==> val newTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [155:65] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'VariableInplaceRenameHandlerWithFinishHook' @ [156:17] ==> public constructor VariableInplaceRenameHandlerWithFinishHook(onFinish: () -> Unit) defined in org.jetbrains.kotlin.idea.refactoring.rename.VariableInplaceRenameHandlerWithFinishHook[ClassConstructorDescriptorImpl]

'postRename' @ [156:60] ==> val postRename: () -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'doRename' @ [156:72] ==> @Nullable public open fun doRename(@NotNull p0: PsiElement, p1: (Editor..Editor?), p2: (DataContext..DataContext?)): InplaceRefactoring? defined in org.jetbrains.kotlin.idea.refactoring.rename.VariableInplaceRenameHandlerWithFinishHook[JavaMethodDescriptor]

'newTypeParameter' @ [156:81] ==> val newTypeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'editor' @ [156:99] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke[ValueParameterDescriptorImpl]

'dataContext' @ [156:107] ==> val dataContext: (DataContext..DataContext?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.doInvoke.<anonymous>[LocalVariableDescriptor]

'invoke' @ [159:17] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'file' @ [165:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.invoke[ValueParameterDescriptorImpl]

'selectElements' @ [166:9] ==> public final fun selectElements(editor: Editor, file: KtFile, continuation: (elements: List<PsiElement>, targetParent: PsiElement) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[SimpleFunctionDescriptorImpl]

'editor' @ [166:24] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.invoke[ValueParameterDescriptorImpl]

'file' @ [166:32] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.invoke[ValueParameterDescriptorImpl]

'doInvoke' @ [166:66] ==> public final fun doInvoke(project: Project, editor: Editor, elements: List<PsiElement>, targetParent: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler[SimpleFunctionDescriptorImpl]

'project' @ [166:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.invoke[ValueParameterDescriptorImpl]

'editor' @ [166:84] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.invoke[ValueParameterDescriptorImpl]

'elements' @ [166:92] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'targetParent' @ [166:102] ==> value-parameter targetParent: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter.KotlinIntroduceTypeParameterHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [170:15] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'KotlinIntroduceTypeAliasHandler' @ [170:33] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler[FakeCallableDescriptorForObject]

'REFACTORING_NAME' @ [170:65] ==> @JvmField public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.KotlinIntroduceTypeAliasHandler.Companion[PropertyDescriptorImpl]

'AbstractIntroduceAction' @ [174:38] ==> public constructor AbstractIntroduceAction() defined in org.jetbrains.kotlin.idea.refactoring.introduce.AbstractIntroduceAction[ClassConstructorDescriptorImpl]

'KotlinIntroduceTypeParameterHandler' @ [175:80] ==> public object KotlinIntroduceTypeParameterHandler : RefactoringActionHandler defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeParameter in file KotlinIntroduceTypeParameterHandler.kt[FakeCallableDescriptorForObject]

