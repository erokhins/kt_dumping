'RenamePsiElementProcessor' @ [45:43] ==> public constructor RenamePsiElementProcessor() defined in com.intellij.refactoring.rename.RenamePsiElementProcessor[JavaClassConstructorDescriptor]

'element' @ [46:68] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.canProcessElement[ValueParameterDescriptorImpl]

'KotlinReferencesSearchParameters' @ [49:32] ==> public constructor KotlinReferencesSearchParameters(elementToSearch: PsiElement, scope: SearchScope = ..., ignoreAccessScope: Boolean = ..., optimizer: SearchRequestCollector? = ..., kotlinOptions: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters[DeserializedClassConstructorDescriptor]

'element' @ [50:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'element' @ [51:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'project' @ [51:25] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'projectScope' @ [51:33] ==> public fun Project.projectScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'KotlinReferencesSearchOptions' @ [52:33] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[DeserializedClassConstructorDescriptor]

'search' @ [54:43] ==> @NotNull public open fun search(@NotNull p0: ReferencesSearch.SearchParameters): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'searchParameters' @ [54:50] ==> val searchParameters: KotlinReferencesSearchParameters defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[LocalVariableDescriptor]

'toMutableList' @ [54:68] ==> public fun <T> Iterable<(PsiReference..PsiReference?)>.toMutableList(): MutableList<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'element' @ [55:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'element' @ [56:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'!' @ [56:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [56:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'isLocal' @ [56:51] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'element' @ [57:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'element' @ [57:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'hasValOrVar' @ [57:51] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'element' @ [58:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[ValueParameterDescriptorImpl]

'toLightMethods' @ [58:21] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'flatMapTo' @ [58:38] ==> public inline fun <T, R, C : MutableCollection<in (PsiReference..PsiReference?)>> Iterable<PsiMethod>.flatMapTo(destination: MutableList<(PsiReference..PsiReference?)>, transform: (PsiMethod) -> Iterable<(PsiReference..PsiReference?)>): MutableList<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <C : MutableCollection<in R>> -> MutableList<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>

'references' @ [58:48] ==> val references: MutableList<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[LocalVariableDescriptor]

'search' @ [58:85] ==> public open fun search(p0: (PsiMethod..PsiMethod?)): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'it' @ [58:92] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences.<anonymous>[ValueParameterDescriptorImpl]

'references' @ [60:16] ==> val references: MutableList<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.findReferences[LocalVariableDescriptor]

'newName' @ [64:13] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'newName' @ [66:27] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [66:35] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'!' @ [68:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinNameSuggester' @ [68:14] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [68:34] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'newName' @ [68:47] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'allRenames' @ [69:13] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'element' @ [69:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'safeNewName' @ [69:35] ==> val safeNewName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[LocalVariableDescriptor]

'element' @ [72:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [72:35] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'declaration' @ [73:13] ==> val declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[LocalVariableDescriptor]

'declaration' @ [74:13] ==> val declaration: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[LocalVariableDescriptor]

'liftToHeader' @ [74:25] ==> internal fun KtDeclaration.liftToHeader(): KtDeclaration? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'let' @ [74:41] ==> @InlineOnly public inline fun <T, R> KtDeclaration.let(block: (KtDeclaration) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> Unit

'allRenames' @ [75:17] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'headerDeclaration' @ [75:28] ==> value-parameter headerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming.<anonymous>[ValueParameterDescriptorImpl]

'safeNewName' @ [75:49] ==> val safeNewName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[LocalVariableDescriptor]

'headerDeclaration' @ [76:17] ==> value-parameter headerDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming.<anonymous>[ValueParameterDescriptorImpl]

'headerImplementations' @ [76:35] ==> internal fun KtDeclaration.headerImplementations(): Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers[SimpleFunctionDescriptorImpl]

'forEach' @ [76:59] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'allRenames' @ [76:69] ==> value-parameter allRenames: MutableMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[ValueParameterDescriptorImpl]

'it' @ [76:80] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'safeNewName' @ [76:86] ==> val safeNewName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.prepareRenaming[LocalVariableDescriptor]

'UserDataProperty' @ [81:73] ==> public constructor UserDataProperty<in R : UserDataHolder, T : Any>(key: Key<List<UsageInfo>>) defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedClassConstructorDescriptor]
Inferred types:
    <in R : UserDataHolder> -> PsiElement
    <T : Any> -> List<UsageInfo>

'create' @ [81:94] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(List<UsageInfo>..List<UsageInfo>?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<UsageInfo>

'reference' @ [84:19] ==> public final val UsageInfo.reference: PsiReference?[MyPropertyDescriptor]

'ref' @ [85:26] ==> val ref: PsiPolyVariantReference defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.isAmbiguousImportUsage[LocalVariableDescriptor]

'element' @ [85:30] ==> public final val PsiPolyVariantReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'refElement' @ [86:16] ==> val refElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.isAmbiguousImportUsage[LocalVariableDescriptor]

'parents' @ [86:27] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [86:35] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [86:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.isAmbiguousImportUsage.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [86:69] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [86:70] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.isAmbiguousImportUsage.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [86:73] ==> public final val KtImportDirective.isAllUnder: Boolean[MyPropertyDescriptor]

'it' @ [86:89] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.isAmbiguousImportUsage.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [86:123] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [86:124] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.isAmbiguousImportUsage.<anonymous>[ValueParameterDescriptorImpl]

'isOnDemand' @ [86:127] ==> public final val PsiImportStaticStatement.isOnDemand: Boolean[MyPropertyDescriptor]

'ref' @ [87:19] ==> val ref: PsiPolyVariantReference defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.isAmbiguousImportUsage[LocalVariableDescriptor]

'multiResolve' @ [87:23] ==> @NotNull public abstract fun multiResolve(p0: Boolean): (Array<(ResolveResult..ResolveResult?)>..Array<out (ResolveResult..ResolveResult?)>) defined in com.intellij.psi.PsiPolyVariantReference[JavaMethodDescriptor]

'size' @ [87:43] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'newName' @ [91:13] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback[ValueParameterDescriptorImpl]

'Runnable' @ [93:16] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SimpleFunctionDescriptorImpl]

'element' @ [94:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback[ValueParameterDescriptorImpl]

'ambiguousImportUsages' @ [94:21] ==> protected final var PsiElement.ambiguousImportUsages: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor[PropertyDescriptorImpl]

'forEach' @ [94:44] ==> @HidesMembers public inline fun <T> Iterable<UsageInfo>.forEach(action: (UsageInfo) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo

'it' @ [95:27] ==> value-parameter it: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'reference' @ [95:30] ==> public final val UsageInfo.reference: PsiReference?[MyPropertyDescriptor]

'if (ref.multiResolve(false).isEmpty()) {
                    ref.handleElementRename(newName)
                }
                else {
                    ref.element?.getStrictParentOfType<KtImportDirective>()?.let { importDirective ->
                        val fqName = importDirective.importedFqName!!
                        val newFqName = fqName.parent().child(Name.identifier(newName))
                        val importList = importDirective.parent as KtImportList
                        if (importList.imports.none { it.importedFqName == newFqName }) {
                            val newImportDirective = KtPsiFactory(element).createImportDirective(ImportPath(newFqName, false))
                            importDirective.parent.addAfter(newImportDirective, importDirective)
                        }
                    }
                }' @ [96:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'ref' @ [96:21] ==> val ref: PsiPolyVariantReference defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>[LocalVariableDescriptor]

'multiResolve' @ [96:25] ==> @NotNull public abstract fun multiResolve(p0: Boolean): (Array<(ResolveResult..ResolveResult?)>..Array<out (ResolveResult..ResolveResult?)>) defined in com.intellij.psi.PsiPolyVariantReference[JavaMethodDescriptor]

'isEmpty' @ [96:45] ==> @InlineOnly public inline fun <T> Array<out (ResolveResult..ResolveResult?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.ResolveResult..com.intellij.psi.ResolveResult?)

'ref' @ [97:21] ==> val ref: PsiPolyVariantReference defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>[LocalVariableDescriptor]

'handleElementRename' @ [97:25] ==> public abstract fun handleElementRename(p0: (String..String?)): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiPolyVariantReference[JavaMethodDescriptor]

'newName' @ [97:45] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback[ValueParameterDescriptorImpl]

'ref' @ [100:21] ==> val ref: PsiPolyVariantReference defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>[LocalVariableDescriptor]

'element' @ [100:25] ==> public final val PsiPolyVariantReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getStrictParentOfType' @ [100:34] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'let' @ [100:78] ==> @InlineOnly public inline fun <T, R> KtImportDirective.let(block: (KtImportDirective) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective
    <R> -> Unit

'importDirective' @ [101:38] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [101:54] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'fqName' @ [102:41] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'parent' @ [102:48] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'child' @ [102:57] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [102:68] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'newName' @ [102:79] ==> value-parameter newName: String? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback[ValueParameterDescriptorImpl]

'importDirective' @ [103:42] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [103:58] ==> public final val KtImportDirective.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'importList' @ [104:29] ==> val importList: KtImportList defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'imports' @ [104:40] ==> public final val KtImportList.imports: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'none' @ [104:48] ==> public inline fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.none(predicate: ((KtImportDirective..KtImportDirective?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'it' @ [104:55] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'importedFqName' @ [104:58] ==> public final val KtImportDirective.importedFqName: FqName?[MyPropertyDescriptor]

'newFqName' @ [104:76] ==> val newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KtPsiFactory' @ [105:54] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [105:67] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback[ValueParameterDescriptorImpl]

'createImportDirective' @ [105:76] ==> public final fun createImportDirective(importPath: ImportPath): KtImportDirective defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'ImportPath' @ [105:98] ==> @JvmOverloads public constructor ImportPath(fqName: FqName, isAllUnder: Boolean, alias: Name? = ...) defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedClassConstructorDescriptor]

'newFqName' @ [105:109] ==> val newFqName: FqName defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'importDirective' @ [106:29] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [106:45] ==> public final val KtImportDirective.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [106:52] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newImportDirective' @ [106:61] ==> val newImportDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'importDirective' @ [106:81] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [111:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor.getPostRenameCallback[ValueParameterDescriptorImpl]

'ambiguousImportUsages' @ [111:21] ==> protected final var PsiElement.ambiguousImportUsages: List<UsageInfo>? defined in org.jetbrains.kotlin.idea.refactoring.rename.RenameKotlinPsiProcessor[PropertyDescriptorImpl]

