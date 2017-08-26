'AbstractKotlinInspection' @ [60:38] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'file' @ [68:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[ValueParameterDescriptorImpl]

'!' @ [69:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [69:18] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectSource' @ [69:35] ==> @JvmStatic public final fun isInProjectSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'file' @ [69:53] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[ValueParameterDescriptorImpl]

'file' @ [70:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[ValueParameterDescriptorImpl]

'importDirectives' @ [70:22] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'isEmpty' @ [70:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'KotlinImportOptimizer' @ [72:33] ==> public companion object defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer[FakeCallableDescriptorForObject]

'collectDescriptorsToImport' @ [72:55] ==> public final fun collectDescriptorsToImport(file: KtFile): OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion[SimpleFunctionDescriptorImpl]

'file' @ [72:82] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[ValueParameterDescriptorImpl]

'file' @ [74:30] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[ValueParameterDescriptorImpl]

'importDirectives' @ [74:35] ==> public final val KtFile.importDirectives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>)[MyPropertyDescriptor]

'directives' @ [75:45] ==> val directives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'asSequence' @ [76:22] ==> public fun <T> Iterable<(KtImportDirective..KtImportDirective?)>.asSequence(): Sequence<(KtImportDirective..KtImportDirective?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)

'mapNotNull' @ [77:22] ==> public fun <T, R : Any> Sequence<(KtImportDirective..KtImportDirective?)>.mapNotNull(transform: ((KtImportDirective..KtImportDirective?)) -> ImportPath?): Sequence<ImportPath> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtImportDirective..org.jetbrains.kotlin.psi.KtImportDirective?)
    <R : Any> -> ImportPath

'it' @ [77:35] ==> value-parameter it: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports.<anonymous>[ValueParameterDescriptorImpl]

'importPath' @ [77:38] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'filter' @ [78:22] ==> public fun <T> Sequence<ImportPath>.filter(predicate: (ImportPath) -> Boolean): Sequence<ImportPath> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath

'!' @ [78:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [78:32] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports.<anonymous>[ValueParameterDescriptorImpl]

'isAllUnder' @ [78:35] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'!' @ [78:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [78:50] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports.<anonymous>[ValueParameterDescriptorImpl]

'hasAlias' @ [78:53] ==> public final fun hasAlias(): Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedSimpleFunctionDescriptor]

'map' @ [79:22] ==> public fun <T, R> Sequence<ImportPath>.map(transform: (ImportPath) -> FqName): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImportPath
    <R> -> FqName

'it' @ [79:28] ==> value-parameter it: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [79:31] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'toSet' @ [80:22] ==> public fun <T> Sequence<FqName>.toSet(): Set<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'HashSet' @ [82:27] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'HashSet' @ [83:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'optimizerData' @ [84:32] ==> val optimizerData: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'descriptorsToImport' @ [84:46] ==> public final val descriptorsToImport: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports.OptimizedImportsBuilder.InputData[DeserializedPropertyDescriptor]

'descriptor' @ [85:30] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'importableFqName' @ [85:41] ==> public val DeclarationDescriptor.importableFqName: FqName? defined in org.jetbrains.kotlin.idea.imports[DeserializedPropertyDescriptor]

'fqNames' @ [86:17] ==> val fqNames: HashSet<FqName> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'add' @ [86:25] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fqName' @ [86:29] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'fqName' @ [88:21] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'explicitlyImportedFqNames' @ [88:32] ==> val explicitlyImportedFqNames: Set<FqName> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'fqName' @ [89:40] ==> val fqName: FqName defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'parent' @ [89:47] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'!' @ [90:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parentFqName' @ [90:26] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'isRoot' @ [90:39] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'parentFqNames' @ [91:25] ==> val parentFqNames: HashSet<FqName> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'add' @ [91:39] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'parentFqName' @ [91:43] ==> val parentFqName: FqName defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'HashSet' @ [96:31] ==> public constructor HashSet<E : (Any..Any?)>(p0: Int) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ImportPath

'directives' @ [96:51] ==> val directives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'size' @ [96:62] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'ArrayList' @ [97:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtImportDirective

'directives' @ [99:31] ==> val directives: (MutableList<(KtImportDirective..KtImportDirective?)>..List<(KtImportDirective..KtImportDirective?)>) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'directive' @ [100:34] ==> val directive: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'importPath' @ [100:44] ==> public final val KtImportDirective.importPath: ImportPath?[MyPropertyDescriptor]

'importPath' @ [101:21] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'alias' @ [101:32] ==> public final val alias: Name? defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'when {
                    !importPaths.add(importPath) -> false
                    importPath.isAllUnder -> importPath.fqName in parentFqNames
                    else -> importPath.fqName in fqNames
                }' @ [103:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'!' @ [104:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'importPaths' @ [104:22] ==> val importPaths: HashSet<ImportPath> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'add' @ [104:34] ==> public open fun add(element: ImportPath): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'importPath' @ [104:38] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'importPath' @ [105:21] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'isAllUnder' @ [105:32] ==> public final val isAllUnder: Boolean defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'importPath' @ [105:46] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'fqName' @ [105:57] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'parentFqNames' @ [105:67] ==> val parentFqNames: HashSet<FqName> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'importPath' @ [106:29] ==> val importPath: ImportPath defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'fqName' @ [106:40] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.resolve.ImportPath[DeserializedPropertyDescriptor]

'fqNames' @ [106:50] ==> val fqNames: HashSet<FqName> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'!' @ [109:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUsed' @ [109:22] ==> val isUsed: Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'directive' @ [110:25] ==> val directive: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'targetDescriptors' @ [110:35] ==> public fun KtImportDirective.targetDescriptors(resolutionFacade: ResolutionFacade = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [110:55] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'unusedImports' @ [111:21] ==> val unusedImports: ArrayList<KtImportDirective> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'directive' @ [111:38] ==> val directive: (KtImportDirective..KtImportDirective?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'ImportData' @ [115:20] ==> public constructor ImportData(unusedImports: List<KtImportDirective>, optimizerData: OptimizedImportsBuilder.InputData) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.ImportData[ClassConstructorDescriptorImpl]

'unusedImports' @ [115:31] ==> val unusedImports: ArrayList<KtImportDirective> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'optimizerData' @ [115:46] ==> val optimizerData: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion.analyzeImports[LocalVariableDescriptor]

'file' @ [122:13] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'analyzeImports' @ [123:20] ==> public final fun analyzeImports(file: KtFile): KotlinUnusedImportInspection.ImportData? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.Companion[SimpleFunctionDescriptorImpl]

'file' @ [123:35] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'data' @ [125:24] ==> val data: KotlinUnusedImportInspection.ImportData defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[LocalVariableDescriptor]

'unusedImports' @ [125:29] ==> public final val unusedImports: List<KtImportDirective> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.ImportData[PropertyDescriptorImpl]

'map' @ [125:43] ==> public inline fun <T, R> Iterable<KtImportDirective>.map(transform: (KtImportDirective) -> ProblemDescriptor): List<ProblemDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective
    <R> -> ProblemDescriptor

'arrayListOf' @ [126:25] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<LocalQuickFix> /* = ArrayList<LocalQuickFix> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalQuickFix

'fixes' @ [127:13] ==> val fixes: ArrayList<LocalQuickFix> /* = ArrayList<LocalQuickFix> */ defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'add' @ [127:19] ==> public open fun add(element: LocalQuickFix): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'OptimizeImportsQuickFix' @ [127:23] ==> public constructor OptimizeImportsQuickFix(file: KtFile) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.OptimizeImportsQuickFix[ClassConstructorDescriptorImpl]

'file' @ [127:47] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'!' @ [128:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [128:47] ==> public open fun getInstance(@NotNull p0: Project): (CodeInsightWorkspaceSettings..CodeInsightWorkspaceSettings?) defined in com.intellij.codeInsight.CodeInsightWorkspaceSettings[JavaMethodDescriptor]

'file' @ [128:59] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'project' @ [128:64] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'optimizeImportsOnTheFly' @ [128:73] ==> public final var optimizeImportsOnTheFly: Boolean defined in com.intellij.codeInsight.CodeInsightWorkspaceSettings[JavaPropertyDescriptor]

'fixes' @ [129:17] ==> val fixes: ArrayList<LocalQuickFix> /* = ArrayList<LocalQuickFix> */ defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'add' @ [129:23] ==> public open fun add(element: LocalQuickFix): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'EnableOptimizeImportsOnTheFlyFix' @ [129:27] ==> public constructor EnableOptimizeImportsOnTheFlyFix(file: KtFile) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.EnableOptimizeImportsOnTheFlyFix[ClassConstructorDescriptorImpl]

'file' @ [129:60] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'manager' @ [131:13] ==> value-parameter manager: InspectionManager defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'createProblemDescriptor' @ [131:21] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull @Nls p1: String, p2: Boolean, p3: (Array<(LocalQuickFix..LocalQuickFix?)>..Array<out (LocalQuickFix..LocalQuickFix?)>?), @NotNull p4: ProblemHighlightType): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'it' @ [131:45] ==> value-parameter it: KtImportDirective defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile.<anonymous>[ValueParameterDescriptorImpl]

'isOnTheFly' @ [133:45] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'fixes' @ [134:45] ==> val fixes: ArrayList<LocalQuickFix> /* = ArrayList<LocalQuickFix> */ defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [134:51] ==> public inline fun <reified T> Collection<LocalQuickFix>.toTypedArray(): Array<LocalQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> LocalQuickFix

'LIKE_UNUSED_SYMBOL' @ [135:66] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [138:13] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'scheduleOptimizeImportsOnTheFly' @ [139:13] ==> private final fun scheduleOptimizeImportsOnTheFly(file: KtFile, data: OptimizedImportsBuilder.InputData): Unit defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection[SimpleFunctionDescriptorImpl]

'file' @ [139:45] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[ValueParameterDescriptorImpl]

'data' @ [139:51] ==> val data: KotlinUnusedImportInspection.ImportData defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[LocalVariableDescriptor]

'optimizerData' @ [139:56] ==> public final val optimizerData: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.ImportData[PropertyDescriptorImpl]

'problems' @ [142:16] ==> val problems: List<ProblemDescriptor> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.checkFile[LocalVariableDescriptor]

'toTypedArray' @ [142:25] ==> public inline fun <reified T> Collection<ProblemDescriptor>.toTypedArray(): Array<ProblemDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ProblemDescriptor

'!' @ [146:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [146:43] ==> public open fun getInstance(@NotNull p0: Project): (CodeInsightWorkspaceSettings..CodeInsightWorkspaceSettings?) defined in com.intellij.codeInsight.CodeInsightWorkspaceSettings[JavaMethodDescriptor]

'file' @ [146:55] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'project' @ [146:60] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'optimizeImportsOnTheFly' @ [146:69] ==> public final var optimizeImportsOnTheFly: Boolean defined in com.intellij.codeInsight.CodeInsightWorkspaceSettings[JavaPropertyDescriptor]

'?:' @ [147:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<ImportPath>?, right: List<ImportPath>): List<ImportPath>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<ImportPath>

'prepareOptimizedImports' @ [147:54] ==> public final fun prepareOptimizedImports(file: KtFile, data: OptimizedImportsBuilder.InputData): List<ImportPath>? defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion[SimpleFunctionDescriptorImpl]

'file' @ [147:78] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'data' @ [147:84] ==> value-parameter data: OptimizedImportsBuilder.InputData defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'generateSequence' @ [150:24] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ProgressIndicator?, nextFunction: (ProgressIndicator) -> ProgressIndicator?): Sequence<ProgressIndicator> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ProgressIndicator

'getInstance' @ [150:57] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [150:71] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'it' @ [151:14] ==> value-parameter it: ProgressIndicator defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly.<anonymous>[ValueParameterDescriptorImpl]

'originalProgressIndicator' @ [151:39] ==> public final val ProgressWrapper.originalProgressIndicator: ProgressIndicator[MyPropertyDescriptor]

'last' @ [152:11] ==> public fun <T> Sequence<ProgressIndicator>.last(): ProgressIndicator defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProgressIndicator

'getHighlightingSession' @ [153:59] ==> public open fun getHighlightingSession(@NotNull p0: PsiFile, @NotNull p1: ProgressIndicator): (HighlightingSession..HighlightingSession?) defined in com.intellij.codeInsight.daemon.impl.HighlightingSessionImpl[JavaMethodDescriptor]

'file' @ [153:82] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'progress' @ [153:88] ==> val progress: DaemonProgressIndicator defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'highlightingSession' @ [155:23] ==> val highlightingSession: (HighlightingSession..HighlightingSession?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'project' @ [155:43] ==> public final val HighlightingSession.project: Project[MyPropertyDescriptor]

'findEditor' @ [156:34] ==> @Nullable public open fun findEditor(@NotNull p0: PsiElement): Editor? defined in com.intellij.psi.util.PsiUtilBase[JavaMethodDescriptor]

'file' @ [156:45] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'editor' @ [157:13] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'editor' @ [158:37] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'document' @ [158:44] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'modificationStamp' @ [158:53] ==> public final val Document.modificationStamp: Long[MyPropertyDescriptor]

'Disposable' @ [159:34] ==> public fun Disposable(function: () -> Unit): Disposable defined in com.intellij.openapi[SamConstructorDescriptorImpl]

'getApplication' @ [161:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [161:53] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'timeToOptimizeImportsOnTheFly' @ [162:25] ==> private final fun timeToOptimizeImportsOnTheFly(file: KtFile, editor: Editor, project: Project): Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection[SimpleFunctionDescriptorImpl]

'file' @ [162:55] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'editor' @ [162:61] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'project' @ [162:69] ==> val project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'editor' @ [162:81] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'document' @ [162:88] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'modificationStamp' @ [162:97] ==> public final val Document.modificationStamp: Long[MyPropertyDescriptor]

'modificationStamp' @ [162:118] ==> val modificationStamp: Long defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'optimizeImportsOnTheFly' @ [163:25] ==> private final fun optimizeImportsOnTheFly(file: KtFile, optimizedImports: List<ImportPath>, editor: Editor, project: Project): Unit defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection[SimpleFunctionDescriptorImpl]

'file' @ [163:49] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'optimizedImports' @ [163:55] ==> val optimizedImports: List<ImportPath> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'editor' @ [163:73] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'project' @ [163:81] ==> val project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'register' @ [168:22] ==> public open fun register(@NotNull p0: Disposable, @NotNull p1: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'progress' @ [168:31] ==> val progress: DaemonProgressIndicator defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'invokeFixLater' @ [168:41] ==> val invokeFixLater: Disposable defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'progress' @ [170:17] ==> val progress: DaemonProgressIndicator defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'isCanceled' @ [170:26] ==> public final val DaemonProgressIndicator.isCanceled: Boolean[MyPropertyDescriptor]

'dispose' @ [171:26] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'invokeFixLater' @ [171:34] ==> val invokeFixLater: Disposable defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'dispose' @ [172:26] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'progress' @ [172:34] ==> val progress: DaemonProgressIndicator defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'progress' @ [173:17] ==> val progress: DaemonProgressIndicator defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.scheduleOptimizeImportsOnTheFly[LocalVariableDescriptor]

'checkCanceled' @ [173:26] ==> public final fun checkCanceled(): Unit defined in com.intellij.codeInsight.daemon.impl.DaemonProgressIndicator[JavaMethodDescriptor]

'project' @ [179:13] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'isDisposed' @ [179:21] ==> public final val Project.isDisposed: Boolean[MyPropertyDescriptor]

'!' @ [179:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [179:36] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'isValid' @ [179:41] ==> public final val KtFile.isValid: Boolean[MyPropertyDescriptor]

'editor' @ [179:52] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'isDisposed' @ [179:59] ==> public final val Editor.isDisposed: Boolean[MyPropertyDescriptor]

'!' @ [179:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [179:74] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'isWritable' @ [179:79] ==> public final val KtFile.isWritable: Boolean[MyPropertyDescriptor]

'getInstance' @ [182:39] ==> public open fun getInstance(@NotNull p0: Project): (UndoManager..UndoManager?) defined in com.intellij.openapi.command.undo.UndoManager[JavaMethodDescriptor]

'project' @ [182:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'undoManager' @ [183:13] ==> val undoManager: (UndoManager..UndoManager?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'isUndoInProgress' @ [183:25] ==> public final val UndoManager.isUndoInProgress: Boolean[MyPropertyDescriptor]

'undoManager' @ [183:45] ==> val undoManager: (UndoManager..UndoManager?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'isRedoInProgress' @ [183:57] ==> public final val UndoManager.isRedoInProgress: Boolean[MyPropertyDescriptor]

'file' @ [186:26] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'importList' @ [186:31] ==> public final val KtFile.importList: KtImportList?[MyPropertyDescriptor]

'importList' @ [187:25] ==> val importList: KtImportList defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'siblings' @ [187:36] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [187:82] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'importList' @ [188:26] ==> val importList: KtImportList defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'siblings' @ [188:37] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [188:82] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'leftSpace' @ [189:20] ==> val leftSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'importList' @ [189:33] ==> val importList: KtImportList defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'rightSpace' @ [190:21] ==> val rightSpace: PsiWhiteSpace? defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'importList' @ [190:35] ==> val importList: KtImportList defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'TextRange' @ [191:28] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'left' @ [191:38] ==> val left: PsiElement defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'textRange' @ [191:43] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [191:53] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'right' @ [191:66] ==> val right: PsiElement defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'textRange' @ [191:72] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [191:82] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'importsRange' @ [192:13] ==> val importsRange: TextRange defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'containsOffset' @ [192:26] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'editor' @ [192:41] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'caretModel' @ [192:48] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [192:59] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'getInstanceEx' @ [194:49] ==> public open fun getInstanceEx(p0: (Project..Project?)): (DaemonCodeAnalyzerEx..DaemonCodeAnalyzerEx?) defined in com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerEx[JavaMethodDescriptor]

'project' @ [194:63] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'!' @ [195:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'codeAnalyzer' @ [195:14] ==> val codeAnalyzer: (DaemonCodeAnalyzerEx..DaemonCodeAnalyzerEx?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'isHighlightingAvailable' @ [195:27] ==> public abstract fun isHighlightingAvailable(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerEx[JavaMethodDescriptor]

'file' @ [195:51] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'!' @ [196:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'codeAnalyzer' @ [196:14] ==> val codeAnalyzer: (DaemonCodeAnalyzerEx..DaemonCodeAnalyzerEx?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'isErrorAnalyzingFinished' @ [196:27] ==> public abstract fun isErrorAnalyzingFinished(@NotNull p0: PsiFile): Boolean defined in com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerEx[JavaMethodDescriptor]

'file' @ [196:52] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'editor' @ [198:24] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'document' @ [198:31] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'processHighlights' @ [200:30] ==> public final fun processHighlights(@NotNull p0: Document, @NotNull p1: Project, @Nullable p2: HighlightSeverity?, p3: Int, p4: Int, @NotNull p5: ((HighlightInfo..HighlightInfo?)) -> Boolean): Boolean defined in com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerEx[SamAdapterFunctionDescriptor]

'document' @ [200:48] ==> val document: Document defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'project' @ [200:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'ERROR' @ [200:85] ==> public final val ERROR: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'document' @ [200:95] ==> val document: Document defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'textLength' @ [200:104] ==> public final val Document.textLength: Int[MyPropertyDescriptor]

'if (!importsRange.containsRange(highlightInfo.startOffset, highlightInfo.endOffset)) {
                hasErrors = true
                false
            }
            else {
                true
            }' @ [201:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [201:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'importsRange' @ [201:18] ==> val importsRange: TextRange defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'containsRange' @ [201:31] ==> public open fun containsRange(p0: Int, p1: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'highlightInfo' @ [201:45] ==> value-parameter highlightInfo: (HighlightInfo..HighlightInfo?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [201:59] ==> public final val startOffset: Int defined in com.intellij.codeInsight.daemon.impl.HighlightInfo[JavaPropertyDescriptor]

'highlightInfo' @ [201:72] ==> value-parameter highlightInfo: (HighlightInfo..HighlightInfo?) defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly.<anonymous>[ValueParameterDescriptorImpl]

'endOffset' @ [201:86] ==> public final val endOffset: Int defined in com.intellij.codeInsight.daemon.impl.HighlightInfo[JavaPropertyDescriptor]

'hasErrors' @ [202:17] ==> var hasErrors: Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'hasErrors' @ [209:13] ==> var hasErrors: Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[LocalVariableDescriptor]

'canChangeFileSilently' @ [211:32] ==> public open fun canChangeFileSilently(@NotNull p0: PsiFileSystemItem): Boolean defined in com.intellij.codeInsight.daemon.impl.DaemonListeners[JavaMethodDescriptor]

'file' @ [211:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.timeToOptimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'getInstance' @ [215:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [215:40] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.optimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'project' @ [215:45] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'commitAllDocuments' @ [215:54] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'writeInRunUndoTransparentAction' @ [216:22] ==> public final fun writeInRunUndoTransparentAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.util.DocumentUtil[SamAdapterFunctionDescriptor]

'KotlinImportOptimizer' @ [217:13] ==> public companion object defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer[FakeCallableDescriptorForObject]

'replaceImports' @ [217:35] ==> public final fun replaceImports(file: KtFile, imports: List<ImportPath>): Unit defined in org.jetbrains.kotlin.idea.imports.KotlinImportOptimizer.Companion[SimpleFunctionDescriptorImpl]

'file' @ [217:50] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.optimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'optimizedImports' @ [217:56] ==> value-parameter optimizedImports: List<ImportPath> defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.optimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'getInstance' @ [218:32] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [218:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.optimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'doPostponedOperationsAndUnblockDocument' @ [218:53] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [218:93] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.optimizeImportsOnTheFly[ValueParameterDescriptorImpl]

'document' @ [218:100] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'name' @ [225:40] ==> public final val KotlinUnusedImportInspection.OptimizeImportsQuickFix.name: String[MyPropertyDescriptor]

'OptimizeImportsProcessor' @ [228:13] ==> public constructor OptimizeImportsProcessor(p0: (Project..Project?), p1: (PsiFile..PsiFile?)) defined in com.intellij.codeInsight.actions.OptimizeImportsProcessor[JavaClassConstructorDescriptor]

'project' @ [228:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.OptimizeImportsQuickFix.applyFix[ValueParameterDescriptorImpl]

'file' @ [228:47] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.OptimizeImportsQuickFix[PropertyDescriptorImpl]

'run' @ [228:53] ==> public open fun run(): Unit defined in com.intellij.codeInsight.actions.OptimizeImportsProcessor[JavaMethodDescriptor]

'message' @ [233:49] ==> public open fun message(@NotNull @NonNls @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.daemon.QuickFixBundle[JavaMethodDescriptor]

'name' @ [235:40] ==> public final val KotlinUnusedImportInspection.EnableOptimizeImportsOnTheFlyFix.name: (String..String?)[MyPropertyDescriptor]

'getInstance' @ [238:42] ==> public open fun getInstance(@NotNull p0: Project): (CodeInsightWorkspaceSettings..CodeInsightWorkspaceSettings?) defined in com.intellij.codeInsight.CodeInsightWorkspaceSettings[JavaMethodDescriptor]

'project' @ [238:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.EnableOptimizeImportsOnTheFlyFix.applyFix[ValueParameterDescriptorImpl]

'optimizeImportsOnTheFly' @ [238:63] ==> public final var optimizeImportsOnTheFly: Boolean defined in com.intellij.codeInsight.CodeInsightWorkspaceSettings[JavaPropertyDescriptor]

'OptimizeImportsProcessor' @ [239:13] ==> public constructor OptimizeImportsProcessor(p0: (Project..Project?), p1: (PsiFile..PsiFile?)) defined in com.intellij.codeInsight.actions.OptimizeImportsProcessor[JavaClassConstructorDescriptor]

'project' @ [239:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.EnableOptimizeImportsOnTheFlyFix.applyFix[ValueParameterDescriptorImpl]

'file' @ [239:47] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.inspections.KotlinUnusedImportInspection.EnableOptimizeImportsOnTheFlyFix[PropertyDescriptorImpl]

'run' @ [239:53] ==> public open fun run(): Unit defined in com.intellij.codeInsight.actions.OptimizeImportsProcessor[JavaMethodDescriptor]

