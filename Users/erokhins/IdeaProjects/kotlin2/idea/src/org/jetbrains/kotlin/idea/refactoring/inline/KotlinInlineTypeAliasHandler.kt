'InlineActionHandler' @ [51:38] ==> public constructor InlineActionHandler() defined in com.intellij.lang.refactoring.InlineActionHandler[JavaClassConstructorDescriptor]

'showErrorHint' @ [57:31] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [57:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.showErrorHint[ValueParameterDescriptorImpl]

'editor' @ [57:54] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.showErrorHint[ValueParameterDescriptorImpl]

'message' @ [57:62] ==> value-parameter message: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.showErrorHint[ValueParameterDescriptorImpl]

'REFACTORING_NAME' @ [57:71] ==> public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.Companion[PropertyDescriptorImpl]

'l' @ [60:55] ==> value-parameter l: Language? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.isEnabledForLanguage[ValueParameterDescriptorImpl]

'INSTANCE' @ [60:75] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'element' @ [62:59] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.canInlineElement[ValueParameterDescriptorImpl]

'element' @ [65:25] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'typeAlias' @ [66:20] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'name' @ [66:30] ==> public final val KtTypeAlias.name: String?[MyPropertyDescriptor]

'typeAlias' @ [67:25] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'getTypeReference' @ [67:35] ==> @IfNotParsed public final fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtTypeAlias[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [68:20] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'containingKtFile' @ [68:30] ==> public final val KtTypeAlias.containingKtFile: KtFile[MyPropertyDescriptor]

'typeAlias' @ [70:35] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'resolveToDescriptor' @ [70:45] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'typeAliasDescriptor' @ [71:28] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'expandedType' @ [71:48] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'typeAliasDescriptor' @ [72:40] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'typeConstructor' @ [72:60] ==> public final val TypeAliasDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [72:76] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [72:87] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeConstructor): List<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeConstructor

'it' @ [72:93] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[ValueParameterDescriptorImpl]

'typeConstructor' @ [72:96] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'search' @ [74:39] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'typeAlias' @ [74:46] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'mapNotNull' @ [74:57] ==> public inline fun <T, R : Any> Iterable<(PsiReference..PsiReference?)>.mapNotNull(transform: ((PsiReference..PsiReference?)) -> KtElement?): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> KtElement

'it' @ [75:30] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [75:33] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'refElement' @ [76:13] ==> val refElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[LocalVariableDescriptor]

'getParentOfTypeAndBranch' @ [76:24] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtUserType.() -> PsiElement?): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'referenceExpression' @ [76:63] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'refElement' @ [77:20] ==> val refElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [77:31] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'usages' @ [80:13] ==> val usages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'isEmpty' @ [80:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'showErrorHint' @ [80:38] ==> private final fun showErrorHint(project: Project, editor: Editor?, message: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler[SimpleFunctionDescriptorImpl]

'project' @ [80:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'editor' @ [80:61] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'name' @ [80:83] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'usages' @ [82:36] ==> val usages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'filter' @ [82:43] ==> public inline fun <T> Iterable<KtElement>.filter(predicate: (KtElement) -> Boolean): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'it' @ [82:52] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [82:55] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'file' @ [82:73] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'usagesInOriginalFile' @ [83:30] ==> val usagesInOriginalFile: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'isNotEmpty' @ [83:51] ==> @InlineOnly public inline fun <T> Collection<KtElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'highlightElements' @ [84:9] ==> public fun highlightElements(project: Project, editor: Editor?, elements: List<PsiElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.inline[SimpleFunctionDescriptorImpl]

'project' @ [84:27] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'editor' @ [84:36] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'usagesInOriginalFile' @ [84:44] ==> val usagesInOriginalFile: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'usagesInOriginalFile' @ [86:13] ==> val usagesInOriginalFile: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'size' @ [86:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'usages' @ [86:42] ==> val usages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'size' @ [86:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'preProcessInternalUsages' @ [87:13] ==> internal fun preProcessInternalUsages(element: KtElement, usages: Collection<KtElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.inline[SimpleFunctionDescriptorImpl]

'aliasBody' @ [87:38] ==> val aliasBody: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'usages' @ [87:49] ==> val usages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'!' @ [90:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'showDialog' @ [90:14] ==> public fun showDialog(project: Project, name: String, title: String, declaration: KtNamedDeclaration, usages: List<KtElement>, helpTopic: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline[SimpleFunctionDescriptorImpl]

'project' @ [90:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'name' @ [91:25] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'REFACTORING_NAME' @ [92:25] ==> public final val REFACTORING_NAME: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.Companion[PropertyDescriptorImpl]

'typeAlias' @ [93:25] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'usages' @ [94:25] ==> val usages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'INLINE_VARIABLE' @ [95:32] ==> public const final val INLINE_VARIABLE: String defined in com.intellij.refactoring.HelpID[JavaPropertyDescriptor]

'isHighlighting' @ [96:17] ==> val isHighlighting: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'getInstance' @ [97:47] ==> public open fun getInstance(): (WindowManager..WindowManager?) defined in com.intellij.openapi.wm.WindowManager[JavaMethodDescriptor]

'getStatusBar' @ [97:61] ==> public abstract fun getStatusBar(p0: (Project..Project?)): (StatusBar..StatusBar?) defined in com.intellij.openapi.wm.WindowManager[JavaMethodDescriptor]

'project' @ [97:74] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'statusBar' @ [98:17] ==> val statusBar: (StatusBar..StatusBar?) defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'info' @ [98:28] ==> public final var StatusBar.info: (String..String?)[MyPropertyDescriptor]

'message' @ [98:53] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'KtPsiFactory' @ [103:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [103:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'usage' @ [106:27] ==> value-parameter usage: KtUserType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[ValueParameterDescriptorImpl]

'analyze' @ [106:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [106:57] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'usage' @ [108:33] ==> value-parameter usage: KtUserType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[ValueParameterDescriptorImpl]

'typeArguments' @ [109:22] ==> public final val KtUserType.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'filterNotNull' @ [110:22] ==> public fun <T : Any> Iterable<KtTypeProjection?>.filterNotNull(): List<KtTypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtTypeProjection

'mapNotNull' @ [111:22] ==> public inline fun <T, R : Any> Iterable<KtTypeProjection>.mapNotNull(transform: (KtTypeProjection) -> TypeProjectionImpl?): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeProjection
    <R : Any> -> TypeProjectionImpl

'context' @ [112:36] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'ABBREVIATED_TYPE' @ [112:59] ==> public final val ABBREVIATED_TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [112:77] ==> value-parameter it: KtTypeProjection defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [112:80] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'context' @ [113:36] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'TYPE' @ [113:59] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [113:65] ==> value-parameter it: KtTypeProjection defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [113:68] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'if (type != null) TypeProjectionImpl(type) else null' @ [114:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjectionImpl?, elseBranch: TypeProjectionImpl?): TypeProjectionImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjectionImpl?

'type' @ [114:29] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[LocalVariableDescriptor]

'TypeProjectionImpl' @ [114:43] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'type' @ [114:62] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[LocalVariableDescriptor]

'argumentTypes' @ [116:17] ==> val argumentTypes: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'size' @ [116:31] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeConstructorsToInline' @ [116:39] ==> val typeConstructorsToInline: List<TypeConstructor> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'size' @ [116:64] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeConstructorsToInline' @ [117:33] ==> val typeConstructorsToInline: List<TypeConstructor> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'argumentTypes' @ [117:62] ==> val argumentTypes: List<TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'toMap' @ [117:77] ==> public fun <K, V> Iterable<Pair<TypeConstructor, TypeProjectionImpl>>.toMap(): Map<TypeConstructor, TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeConstructor
    <V> -> TypeProjectionImpl

'create' @ [118:47] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'substitution' @ [118:54] ==> val substitution: Map<TypeConstructor, TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'substitutor' @ [119:32] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'substitute' @ [119:44] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeToInline' @ [119:55] ==> val typeToInline: SimpleType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'INVARIANT' @ [119:78] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IdeDescriptorRenderers' @ [120:36] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [120:59] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [120:71] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'expandedType' @ [120:82] ==> val expandedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'expandedType' @ [122:22] ==> val expandedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'isFunctionType' @ [122:35] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'usage' @ [122:53] ==> value-parameter usage: KtUserType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[ValueParameterDescriptorImpl]

'parent' @ [122:59] ==> public final val KtUserType.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expandedType' @ [123:22] ==> val expandedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'isExtensionFunctionType' @ [123:35] ==> public val KotlinType.isExtensionFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'usage' @ [123:62] ==> value-parameter usage: KtUserType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [123:68] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtFunctionType.() -> PsiElement?): KtFunctionType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunctionType

'receiverTypeReference' @ [123:111] ==> public final val KtFunctionType.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'psiFactory' @ [124:41] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'createType' @ [124:52] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expandedTypeText' @ [124:63] ==> val expandedTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'usage' @ [125:20] ==> value-parameter usage: KtUserType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[ValueParameterDescriptorImpl]

'replaced' @ [125:26] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtTypeElement): KtTypeElement defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeElement

'expandedTypeReference' @ [125:35] ==> val expandedTypeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'typeElement' @ [125:57] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'apply' @ [125:72] ==> @InlineOnly public inline fun <T> KtTypeElement.apply(block: KtTypeElement.() -> Unit): KtTypeElement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeElement

'needParentheses' @ [126:21] ==> val needParentheses: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType[LocalVariableDescriptor]

'psiFactory' @ [127:34] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'createParameterList' @ [127:45] ==> public final fun createParameterList(text: String): KtParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'parent' @ [128:21] ==> public final val KtTypeElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [128:28] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'sample' @ [128:38] ==> val sample: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[LocalVariableDescriptor]

'firstChild' @ [128:45] ==> public final val KtParameterList.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [128:57] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[ReceiverParameterDescriptorImpl]

'parent' @ [129:21] ==> public final val KtTypeElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [129:28] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'sample' @ [129:37] ==> val sample: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[LocalVariableDescriptor]

'lastChild' @ [129:44] ==> public final val KtParameterList.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [129:55] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoType.<anonymous>[ReceiverParameterDescriptorImpl]

'usage' @ [135:27] ==> value-parameter usage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[ValueParameterDescriptorImpl]

'analyze' @ [135:33] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [135:57] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'usage' @ [137:35] ==> value-parameter usage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [137:41] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'importDirective' @ [138:17] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'usage' @ [139:33] ==> value-parameter usage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[ValueParameterDescriptorImpl]

'getQualifiedElementSelector' @ [139:39] ==> public fun KtElement.getQualifiedElementSelector(): KtElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'mainReference' @ [139:70] ==> public val KtElement.mainReference: KtReference? defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'reference' @ [140:21] ==> val reference: KtReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'reference' @ [140:42] ==> val reference: KtReference? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'multiResolve' @ [140:52] ==> @NotNull public abstract fun multiResolve(p0: Boolean): (Array<(ResolveResult..ResolveResult?)>..Array<out (ResolveResult..ResolveResult?)>) defined in org.jetbrains.kotlin.idea.references.KtReference[JavaMethodDescriptor]

'size' @ [140:72] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'importDirective' @ [141:21] ==> val importDirective: KtImportDirective? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'delete' @ [141:37] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtImportDirective[JavaMethodDescriptor]

'usage' @ [147:32] ==> value-parameter usage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[ValueParameterDescriptorImpl]

'getResolvedCall' @ [147:38] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [147:54] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'resolvedCall' @ [148:31] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'call' @ [148:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'callElement' @ [148:49] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'resolvedCall' @ [149:32] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'typeArguments' @ [149:45] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'mapKeys' @ [150:22] ==> public inline fun <K, V, R> Map<out (TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>.mapKeys(transform: (Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) -> TypeConstructor): Map<TypeConstructor, (KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> TypeConstructor

'it' @ [150:32] ==> value-parameter it: Map.Entry<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [150:35] ==> public abstract val key: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'typeConstructor' @ [150:39] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'mapValues' @ [151:22] ==> public inline fun <K, V, R> Map<out TypeConstructor, (KotlinType..KotlinType?)>.mapValues(transform: (Map.Entry<TypeConstructor, (KotlinType..KotlinType?)>) -> TypeProjectionImpl): Map<TypeConstructor, TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeConstructor
    <V> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [151:34] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'it' @ [151:53] ==> value-parameter it: Map.Entry<TypeConstructor, (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [151:56] ==> public abstract val value: (KotlinType..KotlinType?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'substitution' @ [152:17] ==> val substitution: Map<TypeConstructor, TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'size' @ [152:30] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'typeConstructorsToInline' @ [152:38] ==> val typeConstructorsToInline: List<TypeConstructor> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'size' @ [152:63] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'create' @ [153:47] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'substitution' @ [153:54] ==> val substitution: Map<TypeConstructor, TypeProjectionImpl> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'substitutor' @ [154:32] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'substitute' @ [154:44] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeToInline' @ [154:55] ==> val typeToInline: SimpleType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'INVARIANT' @ [154:78] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'expandedType' @ [155:38] ==> val expandedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'constructor' @ [155:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [155:63] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'importableFqName' @ [155:86] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'expandedType' @ [157:17] ==> val expandedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'arguments' @ [157:30] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isNotEmpty' @ [157:40] ==> @InlineOnly public inline fun <T> Collection<TypeProjection>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'psiFactory' @ [158:48] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'createTypeArguments' @ [158:59] ==> public final fun createTypeArguments(text: String): KtTypeArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expandedType' @ [159:25] ==> val expandedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'arguments' @ [159:38] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'joinToString' @ [159:48] ==> public fun <T> Iterable<TypeProjection>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TypeProjection) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'IdeDescriptorRenderers' @ [160:78] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [160:101] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [160:113] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [160:124] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [160:127] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'callElement' @ [163:48] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'typeArgumentList' @ [163:60] ==> public final val KtCallElement.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'if (originalTypeArgumentList != null) {
                    originalTypeArgumentList.replaced(expandedTypeArgumentList)
                }
                else {
                    callElement.addAfter(expandedTypeArgumentList, callElement.calleeExpression)
                }' @ [164:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'originalTypeArgumentList' @ [164:21] ==> val originalTypeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'originalTypeArgumentList' @ [165:21] ==> val originalTypeArgumentList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'replaced' @ [165:46] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtTypeArgumentList): KtTypeArgumentList defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeArgumentList

'expandedTypeArgumentList' @ [165:55] ==> val expandedTypeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'callElement' @ [168:21] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'addAfter' @ [168:33] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallElement[JavaMethodDescriptor]

'expandedTypeArgumentList' @ [168:42] ==> val expandedTypeArgumentList: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'callElement' @ [168:68] ==> val callElement: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'calleeExpression' @ [168:80] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'usage' @ [172:36] ==> value-parameter usage: KtReferenceExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[ValueParameterDescriptorImpl]

'mainReference' @ [172:42] ==> public val KtReferenceExpression.mainReference: KtReference defined in org.jetbrains.kotlin.idea.references[DeserializedPropertyDescriptor]

'bindToFqName' @ [172:82] ==> public final fun bindToFqName(fqName: FqName, shorteningMode: KtSimpleNameReference.ShorteningMode = ...): PsiElement defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedSimpleFunctionDescriptor]

'expandedTypeFqName' @ [173:21] ==> val expandedTypeFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'NO_SHORTENING' @ [174:58] ==> enum entry NO_SHORTENING defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference.ShorteningMode[FakeCallableDescriptorForObject]

'getNonStrictParentOfType' @ [175:32] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtCallElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallElement

'newCallElement' @ [176:20] ==> val newCallElement: KtCallElement? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'getQualifiedExpressionForSelector' @ [176:36] ==> public fun KtElement.getQualifiedExpressionForSelector(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'newCallElement' @ [176:75] ==> val newCallElement: KtCallElement? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.inlineIntoCall[LocalVariableDescriptor]

'project' @ [179:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [179:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'message' @ [179:55] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'name' @ [179:81] ==> val name: String defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'usages' @ [180:35] ==> val usages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'mapNotNull' @ [180:42] ==> public inline fun <T, R : Any> Iterable<KtElement>.mapNotNull(transform: (KtElement) -> KtElement?): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R : Any> -> KtElement

'when (it) {
                                         is KtUserType -> inlineIntoType(it)
                                         is KtReferenceExpression -> inlineIntoCall(it)
                                         else -> null
                                     }' @ [181:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement?, entry1: KtElement?, entry2: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement?

'it' @ [181:44] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'inlineIntoType' @ [182:59] ==> local final fun inlineIntoType(usage: KtUserType): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[SimpleFunctionDescriptorImpl]

'it' @ [182:74] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'inlineIntoCall' @ [183:70] ==> local final fun inlineIntoCall(usage: KtReferenceExpression): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[SimpleFunctionDescriptorImpl]

'it' @ [183:85] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'postProcessInternalReferences' @ [187:17] ==> internal fun <E : KtElement> postProcessInternalReferences(inlinedElement: KtElement): KtElement? defined in org.jetbrains.kotlin.idea.refactoring.inline[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : KtElement> -> KtElement

'inlinedElement' @ [187:47] ==> val inlinedElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>.<anonymous>[LocalVariableDescriptor]

'inlinedElements' @ [190:17] ==> val inlinedElements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [190:33] ==> @InlineOnly public inline fun <T> Collection<KtElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'isHighlighting' @ [190:49] ==> val isHighlighting: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'highlightElements' @ [191:17] ==> public fun highlightElements(project: Project, editor: Editor?, elements: List<PsiElement>): Unit defined in org.jetbrains.kotlin.idea.refactoring.inline[SimpleFunctionDescriptorImpl]

'project' @ [191:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'editor' @ [191:44] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[ValueParameterDescriptorImpl]

'inlinedElements' @ [191:52] ==> val inlinedElements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[LocalVariableDescriptor]

'typeAlias' @ [194:13] ==> val typeAlias: KtTypeAlias defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement[LocalVariableDescriptor]

'delete' @ [194:23] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtTypeAlias[JavaMethodDescriptor]

'ShortenReferences' @ [196:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [196:31] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [196:39] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'inlinedElements' @ [196:47] ==> val inlinedElements: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineTypeAliasHandler.inlineElement.<anonymous>[LocalVariableDescriptor]

