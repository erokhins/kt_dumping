'delegate' @ [43:24] ==> value-parameter delegate: MoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.<init>[ValueParameterDescriptorImpl]

'delegate' @ [49:9] ==> private final val delegate: MoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination[PropertyDescriptorImpl]

'analyzeModuleConflicts' @ [49:18] ==> public abstract fun analyzeModuleConflicts(p0: (MutableCollection<(PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>?), p1: (MultiMap<(PsiElement..PsiElement?), (String..String?)>..MultiMap<(PsiElement..PsiElement?), (String..String?)>?), p2: (Array<(UsageInfo..UsageInfo?)>..Array<out (UsageInfo..UsageInfo?)>?)): Unit defined in com.intellij.refactoring.MoveDestination[JavaMethodDescriptor]

'elements' @ [49:41] ==> value-parameter elements: MutableCollection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[ValueParameterDescriptorImpl]

'conflicts' @ [49:51] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[ValueParameterDescriptorImpl]

'usages' @ [49:62] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[ValueParameterDescriptorImpl]

'targetPackage' @ [51:13] ==> private final val targetPackage: PsiPackage? defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination[PropertyDescriptorImpl]

'targetDirectory' @ [51:38] ==> private final val targetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination[PropertyDescriptorImpl]

'targetDirectory' @ [53:23] ==> private final val targetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination[PropertyDescriptorImpl]

'project' @ [53:39] ==> public final val PsiDirectory.project: Project[MyPropertyDescriptor]

'KotlinDirectoryMoveTarget' @ [54:26] ==> public constructor KotlinDirectoryMoveTarget(targetContainerFqName: FqName, directory: PsiDirectory) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.KotlinDirectoryMoveTarget[ClassConstructorDescriptorImpl]

'FqName' @ [54:52] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'targetPackage' @ [54:59] ==> private final val targetPackage: PsiPackage? defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination[PropertyDescriptorImpl]

'qualifiedName' @ [54:73] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'targetDirectory' @ [54:89] ==> private final val targetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination[PropertyDescriptorImpl]

'getInstance' @ [55:54] ==> @NotNull public open fun getInstance(): KotlinExactPackagesIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinExactPackagesIndex[JavaMethodDescriptor]

'elements' @ [56:33] ==> value-parameter elements: MutableCollection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[ValueParameterDescriptorImpl]

'flatMapTo' @ [56:42] ==> public inline fun <T, R, C : MutableCollection<in (PsiDirectory..PsiDirectory?)>> Iterable<PsiElement>.flatMapTo(destination: LinkedHashSet<PsiDirectory> /* = LinkedHashSet<PsiDirectory> */, transform: (PsiElement) -> Iterable<(PsiDirectory..PsiDirectory?)>): LinkedHashSet<PsiDirectory> /* = LinkedHashSet<PsiDirectory> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)
    <C : MutableCollection<in R>> -> LinkedHashSet<PsiDirectory>

'LinkedHashSet' @ [56:52] ==> public final fun <E> <init>(): LinkedHashSet<PsiDirectory> /* = LinkedHashSet<PsiDirectory> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> PsiDirectory

'?:' @ [57:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<(PsiDirectory..PsiDirectory?)>?, right: List<(PsiDirectory..PsiDirectory?)>): List<(PsiDirectory..PsiDirectory?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<(com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)>

'it' @ [57:14] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<anonymous>[ValueParameterDescriptorImpl]

'directories' @ [57:34] ==> public final val PsiPackage.directories: (Array<(PsiDirectory..PsiDirectory?)>..Array<out (PsiDirectory..PsiDirectory?)>)[MyPropertyDescriptor]

'toList' @ [57:47] ==> public fun <T> Array<out (PsiDirectory..PsiDirectory?)>.toList(): List<(PsiDirectory..PsiDirectory?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'emptyList' @ [57:59] ==> public fun <T> emptyList(): List<PsiDirectory> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiDirectory

'project' @ [59:28] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'projectScope' @ [59:36] ==> public fun Project.projectScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'elements' @ [60:30] ==> value-parameter elements: MutableCollection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[ValueParameterDescriptorImpl]

'flatMapTo' @ [60:39] ==> public inline fun <T, R, C : MutableCollection<in (KtFile..KtFile?)>> Iterable<PsiElement>.flatMapTo(destination: LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */, transform: (PsiElement) -> Iterable<(KtFile..KtFile?)>): LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)
    <C : MutableCollection<in R>> -> LinkedHashSet<KtFile>

'LinkedHashSet' @ [60:49] ==> public final fun <E> <init>(): LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KtFile

'if (it is PsiPackage) packagesIndex[it.qualifiedName, project, projectScope] else emptyList()' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<(KtFile..KtFile?)>, elseBranch: Collection<(KtFile..KtFile?)>): Collection<(KtFile..KtFile?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)>

'it' @ [61:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<anonymous>[ValueParameterDescriptorImpl]

'packagesIndex' @ [61:35] ==> val packagesIndex: KotlinExactPackagesIndex defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'it' @ [61:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedName' @ [61:52] ==> public final val PsiPackage.qualifiedName: String[MyPropertyDescriptor]

'project' @ [61:67] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'projectScope' @ [61:76] ==> val projectScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'emptyList' @ [61:95] ==> public fun <T> emptyList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'LinkedHashSet' @ [64:47] ==> public final fun <E> <init>(): LinkedHashSet<PsiElement> /* = LinkedHashSet<PsiElement> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> PsiElement

'PsiRecursiveElementWalkingVisitor' @ [65:46] ==> protected/*protected and package*/ constructor PsiRecursiveElementWalkingVisitor() defined in com.intellij.psi.PsiRecursiveElementWalkingVisitor[JavaClassConstructorDescriptor]

'element' @ [67:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'element' @ [67:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'hasModifier' @ [67:62] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INTERNAL_KEYWORD' @ [67:83] ==> public final val INTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [68:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [68:29] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'lastOrNull' @ [68:45] ==> public inline fun <T> Sequence<PsiElement>.lastOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [68:58] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [68:86] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'extraElementsForReferenceSearch' @ [68:92] ==> val extraElementsForReferenceSearch: LinkedHashSet<PsiElement> /* = LinkedHashSet<PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'it' @ [68:127] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>.visitElement.<anonymous>[ValueParameterDescriptorImpl]

'stopWalking' @ [69:21] ==> public open fun stopWalking(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>[JavaMethodDescriptor]

'super' @ [71:17] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [71:23] ==> public open fun visitElement(p0: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiRecursiveElementWalkingVisitor[JavaMethodDescriptor]

'element' @ [71:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'filesToProcess' @ [74:9] ==> val filesToProcess: LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'flatMap' @ [74:24] ==> public inline fun <T, R> Iterable<KtFile>.flatMap(transform: (KtFile) -> Iterable<(KtDeclaration..KtDeclaration?)>): List<(KtDeclaration..KtDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [74:33] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [74:36] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'forEach' @ [74:50] ==> @HidesMembers public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.forEach(action: ((KtDeclaration..KtDeclaration?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [74:60] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [74:63] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'extraElementCollector' @ [74:70] ==> val extraElementCollector: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'getInstance' @ [76:49] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [76:63] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'progressIndicator' @ [77:9] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'pushState' @ [77:28] ==> public abstract fun pushState(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'ArrayList' @ [79:27] ==> public final fun <E> <init>(): ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> UsageInfo

'progressIndicator' @ [81:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'text' @ [81:31] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'component1' @ [82:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [82:26] ==> public final operator fun component2(): PsiElement defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'extraElementsForReferenceSearch' @ [82:38] ==> val extraElementsForReferenceSearch: LinkedHashSet<PsiElement> /* = LinkedHashSet<PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'withIndex' @ [82:70] ==> public fun <T> Iterable<PsiElement>.withIndex(): Iterable<IndexedValue<PsiElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'progressIndicator' @ [83:17] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'fraction' @ [83:35] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'/' @ [83:46] ==> public final operator fun div(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'index' @ [83:47] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'extraElementsForReferenceSearch' @ [83:58] ==> val extraElementsForReferenceSearch: LinkedHashSet<PsiElement> /* = LinkedHashSet<PsiElement> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'size' @ [83:90] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'toDouble' @ [83:95] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'search' @ [84:34] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [84:41] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'projectScope' @ [84:50] ==> val projectScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'mapNotNullTo' @ [84:64] ==> public inline fun <T, R : Any, C : MutableCollection<in UsageInfo>> Iterable<(PsiReference..PsiReference?)>.mapNotNullTo(destination: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */, transform: ((PsiReference..PsiReference?)) -> UsageInfo?): ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)
    <R : Any> -> UsageInfo
    <C : MutableCollection<in R>> -> ArrayList<UsageInfo>

'extraUsages' @ [84:77] ==> val extraUsages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'createMoveUsageInfoIfPossible' @ [85:21] ==> public fun createMoveUsageInfoIfPossible(reference: PsiReference, referencedElement: PsiElement, addImportToOriginalFile: Boolean, isInternal: Boolean): UsageInfo? defined in org.jetbrains.kotlin.idea.refactoring.move in file moveUtils.kt[SimpleFunctionDescriptorImpl]

'ref' @ [85:51] ==> value-parameter ref: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [85:56] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'progressIndicator' @ [90:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'popState' @ [90:32] ==> public abstract fun popState(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'filesToProcess' @ [93:9] ==> val filesToProcess: LinkedHashSet<KtFile> /* = LinkedHashSet<KtFile> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'forEach' @ [93:24] ==> @HidesMembers public inline fun <T> Iterable<KtFile>.forEach(action: (KtFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'analyzeConflictsInFile' @ [94:13] ==> public fun analyzeConflictsInFile(file: KtFile, usages: Collection<UsageInfo>, moveTarget: KotlinMoveTarget, allElementsToMove: Collection<PsiElement>, conflicts: MultiMap<PsiElement, String>, onUsageUpdate: (List<UsageInfo>) -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations[SimpleFunctionDescriptorImpl]

'it' @ [94:36] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts.<anonymous>[ValueParameterDescriptorImpl]

'extraUsages' @ [94:40] ==> val extraUsages: ArrayList<UsageInfo> /* = ArrayList<UsageInfo> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'moveTarget' @ [94:53] ==> val moveTarget: KotlinDirectoryMoveTarget defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'directoriesToMove' @ [94:65] ==> val directoriesToMove: LinkedHashSet<PsiDirectory> /* = LinkedHashSet<PsiDirectory> */ defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[LocalVariableDescriptor]

'conflicts' @ [94:84] ==> value-parameter conflicts: MultiMap<PsiElement, String> defined in org.jetbrains.kotlin.idea.refactoring.move.moveClassesOrPackages.KotlinAwareDelegatingMoveDestination.analyzeModuleConflicts[ValueParameterDescriptorImpl]

