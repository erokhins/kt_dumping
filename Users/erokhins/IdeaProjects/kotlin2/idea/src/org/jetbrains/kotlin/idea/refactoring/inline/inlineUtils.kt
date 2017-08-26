'editor' @ [53:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.highlightElements[ValueParameterDescriptorImpl]

'getApplication' @ [53:46] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [53:63] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'getInstance' @ [55:51] ==> public open fun getInstance(): (EditorColorsManager..EditorColorsManager?) defined in com.intellij.openapi.editor.colors.EditorColorsManager[JavaMethodDescriptor]

'editorColorsManager' @ [56:35] ==> val editorColorsManager: (EditorColorsManager..EditorColorsManager?) defined in org.jetbrains.kotlin.idea.refactoring.inline.highlightElements[LocalVariableDescriptor]

'globalScheme' @ [56:55] ==> public final var EditorColorsManager.globalScheme: EditorColorsScheme[MyPropertyDescriptor]

'getAttributes' @ [56:68] ==> public abstract fun getAttributes(p0: (TextAttributesKey..TextAttributesKey?)): (TextAttributes..TextAttributes?) defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'SEARCH_RESULT_ATTRIBUTES' @ [56:95] ==> public final val SEARCH_RESULT_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.EditorColors[JavaPropertyDescriptor]

'getInstance' @ [57:45] ==> public open fun getInstance(p0: (Project..Project?)): (HighlightManager..HighlightManager?) defined in com.intellij.codeInsight.highlighting.HighlightManager[JavaMethodDescriptor]

'project' @ [57:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.highlightElements[ValueParameterDescriptorImpl]

'highlightManager' @ [58:5] ==> val highlightManager: (HighlightManager..HighlightManager?) defined in org.jetbrains.kotlin.idea.refactoring.inline.highlightElements[LocalVariableDescriptor]

'addOccurrenceHighlights' @ [58:22] ==> public abstract fun addOccurrenceHighlights(@NotNull p0: Editor, @NotNull p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>), @NotNull p2: TextAttributes, p3: Boolean, @Nullable p4: (MutableCollection<(RangeHighlighter..RangeHighlighter?)>?..Collection<(RangeHighlighter..RangeHighlighter?)>?)): Unit defined in com.intellij.codeInsight.highlighting.HighlightManager[JavaMethodDescriptor]

'editor' @ [58:46] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.highlightElements[ValueParameterDescriptorImpl]

'elements' @ [58:54] ==> value-parameter elements: List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.highlightElements[ValueParameterDescriptorImpl]

'toTypedArray' @ [58:63] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'searchResultsAttributes' @ [58:79] ==> val searchResultsAttributes: (TextAttributes..TextAttributes?) defined in org.jetbrains.kotlin.idea.refactoring.inline.highlightElements[LocalVariableDescriptor]

'getApplication' @ [69:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [69:45] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'when (declaration) {
        is KtProperty -> if (declaration.isLocal) "local variable" else "property"
        is KtTypeAlias -> "type alias"
        else -> return false
    }' @ [71:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'declaration' @ [71:22] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[ValueParameterDescriptorImpl]

'if (declaration.isLocal) "local variable" else "property"' @ [72:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'declaration' @ [72:30] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[ValueParameterDescriptorImpl]

'isLocal' @ [72:42] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'RefactoringMessageDialog' @ [76:18] ==> public constructor RefactoringMessageDialog(p0: (String..String?), p1: (String..String?), p2: (String..String?), @NonNls p3: (String..String?), p4: Boolean, p5: (Project..Project?)) defined in com.intellij.refactoring.util.RefactoringMessageDialog[JavaClassConstructorDescriptor]

'title' @ [77:13] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[ValueParameterDescriptorImpl]

'+' @ [78:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'kind' @ [78:25] ==> val kind: String defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[LocalVariableDescriptor]

'name' @ [78:39] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[ValueParameterDescriptorImpl]

'message' @ [78:72] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'usages' @ [78:101] ==> value-parameter usages: List<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[ValueParameterDescriptorImpl]

'size' @ [78:108] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'helpTopic' @ [79:13] ==> value-parameter helpTopic: String? = ... defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[ValueParameterDescriptorImpl]

'project' @ [82:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[ValueParameterDescriptorImpl]

'dialog' @ [84:5] ==> val dialog: RefactoringMessageDialog defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[LocalVariableDescriptor]

'show' @ [84:12] ==> public open fun show(): Unit defined in com.intellij.refactoring.util.RefactoringMessageDialog[JavaMethodDescriptor]

'dialog' @ [85:12] ==> val dialog: RefactoringMessageDialog defined in org.jetbrains.kotlin.idea.refactoring.inline.showDialog[LocalVariableDescriptor]

'isOK' @ [85:19] ==> public final val RefactoringMessageDialog.isOK: Boolean[MyPropertyDescriptor]

'getValue' @ [89:12] ==> public final operator fun getValue(thisRef: R, property: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.CopyableUserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [89:41] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>..MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableMap<org.jetbrains.kotlin.name.FqName, (org.jetbrains.kotlin.psi.KtSimpleNameExpression) -> com.intellij.usageView.UsageInfo?>..kotlin.collections.MutableMap<org.jetbrains.kotlin.name.FqName, (org.jetbrains.kotlin.psi.KtSimpleNameExpression) -> com.intellij.usageView.UsageInfo?>?)

'element' @ [92:20] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[ValueParameterDescriptorImpl]

'containingKtFile' @ [92:28] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'usages' @ [93:26] ==> value-parameter usages: Collection<KtElement> defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[ValueParameterDescriptorImpl]

'mapTo' @ [93:33] ==> public inline fun <T, R, C : MutableCollection<in FqName>> Iterable<KtElement>.mapTo(destination: LinkedHashSet<FqName>, transform: (KtElement) -> FqName): LinkedHashSet<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> FqName
    <C : MutableCollection<in R>> -> LinkedHashSet<FqName>

'LinkedHashSet' @ [93:39] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'it' @ [93:58] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'containingKtFile' @ [93:61] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'packageFqName' @ [93:78] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'targetPackages' @ [94:27] ==> val targetPackages: LinkedHashSet<FqName> defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[LocalVariableDescriptor]

'targetPackage' @ [95:13] ==> val targetPackage: FqName defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[LocalVariableDescriptor]

'mainFile' @ [95:30] ==> val mainFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[LocalVariableDescriptor]

'packageFqName' @ [95:39] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'ContainerChangeInfo' @ [96:31] ==> public constructor ContainerChangeInfo(oldContainer: ContainerInfo, newContainer: ContainerInfo) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerChangeInfo[ClassConstructorDescriptorImpl]

'Package' @ [96:65] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'mainFile' @ [96:73] ==> val mainFile: KtFile defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[LocalVariableDescriptor]

'packageFqName' @ [96:82] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'Package' @ [96:112] ==> public constructor Package(fqName: FqName) defined in org.jetbrains.kotlin.idea.refactoring.move.ContainerInfo.Package[ClassConstructorDescriptorImpl]

'targetPackage' @ [96:120] ==> val targetPackage: FqName defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[LocalVariableDescriptor]

'element' @ [97:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[ValueParameterDescriptorImpl]

'processInternalReferencesToUpdateOnPackageNameChange' @ [97:17] ==> public fun KtElement.processInternalReferencesToUpdateOnPackageNameChange(containerChangeInfo: ContainerChangeInfo, body: (originalRefExpr: KtSimpleNameExpression, usageFactory: UsageInfoFactory /* = (KtSimpleNameExpression) -> UsageInfo? */) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'packageNameInfo' @ [97:70] ==> val packageNameInfo: ContainerChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[LocalVariableDescriptor]

'expr' @ [99:21] ==> value-parameter expr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'internalUsageInfos' @ [99:26] ==> internal var KtSimpleNameExpression.internalUsageInfos: MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>? defined in org.jetbrains.kotlin.idea.refactoring.inline in file inlineUtils.kt[PropertyDescriptorImpl]

'LinkedHashMap' @ [100:24] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> Function1<KtSimpleNameExpression, UsageInfo?>

'apply' @ [100:88] ==> @InlineOnly public inline fun <T> LinkedHashMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>.apply(block: LinkedHashMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>.() -> Unit): LinkedHashMap<FqName, (KtSimpleNameExpression) -> UsageInfo?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<FqName, Function1<KtSimpleNameExpression, UsageInfo?>>

'expr' @ [100:96] ==> value-parameter expr: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'internalUsageInfos' @ [100:101] ==> internal var KtSimpleNameExpression.internalUsageInfos: MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>? defined in org.jetbrains.kotlin.idea.refactoring.inline in file inlineUtils.kt[PropertyDescriptorImpl]

'this' @ [100:122] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'infos' @ [101:13] ==> val infos: MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?> defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages.<anonymous>[LocalVariableDescriptor]

'targetPackage' @ [101:19] ==> val targetPackage: FqName defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages[LocalVariableDescriptor]

'factory' @ [101:36] ==> value-parameter factory: UsageInfoFactory /* = (KtSimpleNameExpression) -> UsageInfo? */ defined in org.jetbrains.kotlin.idea.refactoring.inline.preProcessInternalUsages.<anonymous>[ValueParameterDescriptorImpl]

'inlinedElement' @ [107:19] ==> value-parameter inlinedElement: E defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[ValueParameterDescriptorImpl]

'createSmartPointer' @ [107:34] ==> public fun <E : PsiElement> E.createSmartPointer(): SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> E

'inlinedElement' @ [108:25] ==> value-parameter inlinedElement: E defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[ValueParameterDescriptorImpl]

'containingKtFile' @ [108:40] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'packageFqName' @ [108:57] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'inlinedElement' @ [109:32] ==> value-parameter inlinedElement: E defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[ValueParameterDescriptorImpl]

'collectDescendantsOfType' @ [109:47] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtSimpleNameExpression) -> Boolean = ...): List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [109:98] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences.<anonymous>[ValueParameterDescriptorImpl]

'internalUsageInfos' @ [109:101] ==> internal var KtSimpleNameExpression.internalUsageInfos: MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>? defined in org.jetbrains.kotlin.idea.refactoring.inline in file inlineUtils.kt[PropertyDescriptorImpl]

'expressionsToProcess' @ [110:26] ==> val expressionsToProcess: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[LocalVariableDescriptor]

'mapNotNull' @ [110:47] ==> public inline fun <T, R : Any> Iterable<KtSimpleNameExpression>.mapNotNull(transform: (KtSimpleNameExpression) -> UsageInfo?): List<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression
    <R : Any> -> UsageInfo

'it' @ [110:60] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences.<anonymous>[ValueParameterDescriptorImpl]

'internalUsageInfos' @ [110:63] ==> internal var KtSimpleNameExpression.internalUsageInfos: MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>? defined in org.jetbrains.kotlin.idea.refactoring.inline in file inlineUtils.kt[PropertyDescriptorImpl]

'targetPackage' @ [110:84] ==> val targetPackage: FqName defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[LocalVariableDescriptor]

'invoke' @ [110:100] ==> public abstract operator fun invoke(p1: KtSimpleNameExpression): UsageInfo? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [110:107] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences.<anonymous>[ValueParameterDescriptorImpl]

'expressionsToProcess' @ [111:5] ==> val expressionsToProcess: List<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[LocalVariableDescriptor]

'forEach' @ [111:26] ==> @HidesMembers public inline fun <T> Iterable<KtSimpleNameExpression>.forEach(action: (KtSimpleNameExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSimpleNameExpression

'it' @ [111:36] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences.<anonymous>[ValueParameterDescriptorImpl]

'internalUsageInfos' @ [111:39] ==> internal var KtSimpleNameExpression.internalUsageInfos: MutableMap<FqName, (KtSimpleNameExpression) -> UsageInfo?>? defined in org.jetbrains.kotlin.idea.refactoring.inline in file inlineUtils.kt[PropertyDescriptorImpl]

'postProcessMoveUsages' @ [112:5] ==> public fun postProcessMoveUsages(usages: Collection<UsageInfo>, oldToNewElementsMapping: Map<PsiElement, PsiElement> = ..., shorteningMode: KtSimpleNameReference.ShorteningMode = ...): List<NonCodeUsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'internalUsages' @ [112:27] ==> val internalUsages: List<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[LocalVariableDescriptor]

'pointer' @ [113:12] ==> val pointer: SmartPsiElementPointer<E> defined in org.jetbrains.kotlin.idea.refactoring.inline.postProcessInternalReferences[LocalVariableDescriptor]

'element' @ [113:20] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<E>.element: E?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> E

'bodyOrInitializer' @ [124:20] ==> value-parameter bodyOrInitializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'copied' @ [124:38] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'if (!isBlockBody && isReturnTypeExplicit)
        returnType ?: TypeUtils.NO_EXPECTED_TYPE
    else
        TypeUtils.NO_EXPECTED_TYPE' @ [126:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'!' @ [126:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBlockBody' @ [126:29] ==> value-parameter isBlockBody: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'isReturnTypeExplicit' @ [126:44] ==> value-parameter isReturnTypeExplicit: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'returnType' @ [127:9] ==> value-parameter returnType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'NO_EXPECTED_TYPE' @ [127:33] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'NO_EXPECTED_TYPE' @ [129:19] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'bodyCopy' @ [132:16] ==> val bodyCopy: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'analyzeInContext' @ [132:25] ==> @JvmOverloads public fun KtExpression.analyzeInContext(scope: LexicalScope, contextExpression: KtExpression = ..., trace: BindingTrace = ..., dataFlowInfo: DataFlowInfo = ..., expectedType: KotlinType = ..., isStatement: Boolean = ..., contextDependency: ContextDependency = ..., expressionTypingServices: ExpressionTypingServices = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'bodyOrInitializer' @ [132:42] ==> value-parameter bodyOrInitializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'getResolutionScope' @ [132:60] ==> public fun KtElement.getResolutionScope(): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bodyOrInitializer' @ [133:62] ==> value-parameter bodyOrInitializer: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'expectedType' @ [134:57] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'declaration' @ [137:22] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [137:34] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'CodeToInlineBuilder' @ [138:19] ==> public constructor CodeToInlineBuilder(targetCallable: CallableDescriptor, resolutionFacade: ResolutionFacade) defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[ClassConstructorDescriptorImpl]

'descriptor' @ [138:39] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'declaration' @ [138:73] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [138:85] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'if (isBlockBody) {
        bodyCopy as KtBlockExpression
        val statements = bodyCopy.statements

        val returnStatements = bodyCopy.collectDescendantsOfType<KtReturnExpression> {
            it.getLabelName().let { it == null || it == declaration.name }
        }

        val lastReturn = statements.lastOrNull() as? KtReturnExpression
        if (returnStatements.any { it != lastReturn }) {
            val message = RefactoringBundle.getCannotRefactorMessage(
                    if (returnStatements.size > 1)
                        "Inline Function is not supported for functions with multiple return statements."
                    else
                        "Inline Function is not supported for functions with return statements not at the end of the body."
            )
            CommonRefactoringUtil.showErrorHint(declaration.project, editor, message, "Inline Function", null)
            return null
        }

        return builder.prepareCodeToInline(lastReturn?.returnedExpression,
                                           statements.dropLast(returnStatements.size), ::analyzeBodyCopy)
    }
    else {
        return builder.prepareCodeToInline(bodyCopy, emptyList(), ::analyzeBodyCopy)
    }' @ [139:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'isBlockBody' @ [139:9] ==> value-parameter isBlockBody: Boolean defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'bodyCopy' @ [140:9] ==> val bodyCopy: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'bodyCopy' @ [141:26] ==> val bodyCopy: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'statements' @ [141:35] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'bodyCopy' @ [143:32] ==> val bodyCopy: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'collectDescendantsOfType' @ [143:41] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtReturnExpression) -> Boolean = ...): List<KtReturnExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtReturnExpression

'it' @ [144:13] ==> value-parameter it: KtReturnExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline.<anonymous>[ValueParameterDescriptorImpl]

'getLabelName' @ [144:16] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'let' @ [144:31] ==> @InlineOnly public inline fun <T, R> String?.let(block: (String?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?
    <R> -> Boolean

'it' @ [144:37] ==> value-parameter it: String? defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [144:51] ==> value-parameter it: String? defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [144:57] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'name' @ [144:69] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'statements' @ [147:26] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'lastOrNull' @ [147:37] ==> public fun <T> List<(KtExpression..KtExpression?)>.lastOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'returnStatements' @ [148:13] ==> val returnStatements: List<KtReturnExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'any' @ [148:30] ==> public inline fun <T> Iterable<KtReturnExpression>.any(predicate: (KtReturnExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReturnExpression

'it' @ [148:36] ==> value-parameter it: KtReturnExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline.<anonymous>[ValueParameterDescriptorImpl]

'lastReturn' @ [148:42] ==> val lastReturn: KtReturnExpression? defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'getCannotRefactorMessage' @ [149:45] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'if (returnStatements.size > 1)
                        "Inline Function is not supported for functions with multiple return statements."
                    else
                        "Inline Function is not supported for functions with return statements not at the end of the body."' @ [150:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'returnStatements' @ [150:25] ==> val returnStatements: List<KtReturnExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'size' @ [150:42] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'showErrorHint' @ [155:35] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'declaration' @ [155:49] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'project' @ [155:61] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'editor' @ [155:70] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[ValueParameterDescriptorImpl]

'message' @ [155:78] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'builder' @ [159:16] ==> val builder: CodeToInlineBuilder defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'prepareCodeToInline' @ [159:24] ==> public final fun prepareCodeToInline(mainExpression: KtExpression?, statementsBefore: List<KtExpression>, analyze: () -> BindingContext): CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'lastReturn' @ [159:44] ==> val lastReturn: KtReturnExpression? defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'returnedExpression' @ [159:56] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'statements' @ [160:44] ==> val statements: List<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'dropLast' @ [160:55] ==> public fun <T> List<(KtExpression..KtExpression?)>.dropLast(n: Int): List<(KtExpression..KtExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'returnStatements' @ [160:64] ==> val returnStatements: List<KtReturnExpression> defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'size' @ [160:81] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'analyzeBodyCopy' @ [160:90] ==> local final fun analyzeBodyCopy(): BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[SimpleFunctionDescriptorImpl]

'builder' @ [163:16] ==> val builder: CodeToInlineBuilder defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'prepareCodeToInline' @ [163:24] ==> public final fun prepareCodeToInline(mainExpression: KtExpression?, statementsBefore: List<KtExpression>, analyze: () -> BindingContext): CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CodeToInlineBuilder[SimpleFunctionDescriptorImpl]

'bodyCopy' @ [163:44] ==> val bodyCopy: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[LocalVariableDescriptor]

'emptyList' @ [163:54] ==> public fun <T> emptyList(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'analyzeBodyCopy' @ [163:69] ==> local final fun analyzeBodyCopy(): BindingContext defined in org.jetbrains.kotlin.idea.refactoring.inline.buildCodeToInline[SimpleFunctionDescriptorImpl]

