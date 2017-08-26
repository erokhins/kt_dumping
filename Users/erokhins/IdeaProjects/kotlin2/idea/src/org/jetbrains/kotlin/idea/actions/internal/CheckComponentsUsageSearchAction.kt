'AnAction' @ [38:42] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'selectedKotlinFiles' @ [40:29] ==> private final fun selectedKotlinFiles(e: AnActionEvent): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction[SimpleFunctionDescriptorImpl]

'e' @ [40:49] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.actionPerformed[ValueParameterDescriptorImpl]

'toList' @ [40:52] ==> public fun <T> Sequence<KtFile>.toList(): List<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'!!' @ [41:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Project?): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Project

'PROJECT' @ [41:38] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [41:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'e' @ [41:54] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.actionPerformed[ValueParameterDescriptorImpl]

'dataContext' @ [41:56] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'getInstance' @ [43:25] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [43:39] ==> public final fun runProcessWithProgressSynchronously(@NotNull p0: () -> Unit, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?): Boolean defined in com.intellij.openapi.progress.ProgressManager[MyFunctionDescriptor]

'runReadAction' @ [45:21] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'process' @ [45:37] ==> private final fun process(files: Collection<KtFile>, project: Project): Unit defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction[SimpleFunctionDescriptorImpl]

'selectedFiles' @ [45:45] ==> val selectedFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.actionPerformed[LocalVariableDescriptor]

'project' @ [45:60] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.actionPerformed[LocalVariableDescriptor]

'project' @ [49:17] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.actionPerformed[LocalVariableDescriptor]

'files' @ [53:27] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[ValueParameterDescriptorImpl]

'asSequence' @ [53:33] ==> public fun <T> Iterable<KtFile>.asSequence(): Sequence<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'flatMap' @ [54:18] ==> public fun <T, R> Sequence<KtFile>.flatMap(transform: (KtFile) -> Sequence<(KtDeclaration..KtDeclaration?)>): Sequence<(KtDeclaration..KtDeclaration?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [54:28] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [54:31] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'asSequence' @ [54:44] ==> public fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.asSequence(): Sequence<(KtDeclaration..KtDeclaration?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'filterIsInstance' @ [55:18] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClass

'filter' @ [56:18] ==> public fun <T> Sequence<KtClass>.filter(predicate: (KtClass) -> Boolean): Sequence<KtClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass

'it' @ [56:27] ==> value-parameter it: KtClass defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process.<anonymous>[ValueParameterDescriptorImpl]

'isData' @ [56:30] ==> public final fun isData(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'toList' @ [57:18] ==> public fun <T> Sequence<KtClass>.toList(): List<KtClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass

'getInstance' @ [59:49] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [59:63] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'component1' @ [60:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [60:18] ==> public final operator fun component2(): KtClass defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'dataClasses' @ [60:32] ==> val dataClasses: List<KtClass> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'withIndex' @ [60:44] ==> public fun <T> Iterable<KtClass>.withIndex(): Iterable<IndexedValue<KtClass>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass

'progressIndicator' @ [61:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'text' @ [61:32] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'i' @ [61:62] ==> val i: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'dataClasses' @ [61:74] ==> val dataClasses: List<KtClass> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'size' @ [61:86] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'progressIndicator' @ [62:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'text2' @ [62:32] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'dataClass' @ [62:40] ==> val dataClass: KtClass defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'fqName' @ [62:50] ==> public final val KtClass.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [62:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'dataClass' @ [64:29] ==> val dataClass: KtClass defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'primaryConstructor' @ [64:39] ==> public final val KtClass.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'valueParameters' @ [64:59] ==> public final val KtPrimaryConstructor.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [64:76] ==> public fun <T> List<(KtParameter..KtParameter?)>.firstOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'parameter' @ [65:17] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'getInstance' @ [69:37] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcess' @ [69:51] ==> public final fun runProcess(@NotNull p0: () -> Unit, p1: (ProgressIndicator..ProgressIndicator?)): Unit defined in com.intellij.openapi.progress.ProgressManager[MyFunctionDescriptor]

'ExpressionsOfTypeProcessor' @ [70:25] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [70:52] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [70:59] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_SMART' @ [70:91] ==> enum entry ALWAYS_SMART defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'smartRefsCount' @ [72:25] ==> var smartRefsCount: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'search' @ [72:59] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'parameter' @ [72:66] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'findAll' @ [72:77] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'size' @ [72:87] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [74:25] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [74:52] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [74:59] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'ALWAYS_PLAIN' @ [74:91] ==> enum entry ALWAYS_PLAIN defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'goldRefsCount' @ [76:25] ==> var goldRefsCount: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'search' @ [76:58] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'parameter' @ [76:65] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'findAll' @ [76:76] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'size' @ [76:86] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'EmptyProgressIndicator' @ [77:24] ==> public constructor EmptyProgressIndicator() defined in com.intellij.openapi.progress.EmptyProgressIndicator[JavaClassConstructorDescriptor]

'smartRefsCount' @ [79:25] ==> var smartRefsCount: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'goldRefsCount' @ [79:43] ==> var goldRefsCount: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'invokeLater' @ [80:40] ==> public final fun invokeLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javax.swing.SwingUtilities[SamAdapterFunctionDescriptor]

'showInfoMessage' @ [81:38] ==> public open fun showInfoMessage(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [81:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[ValueParameterDescriptorImpl]

'dataClass' @ [81:98] ==> val dataClass: KtClass defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'fqName' @ [81:108] ==> public final val KtClass.fqName: FqName?[MyPropertyDescriptor]

'asString' @ [81:116] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'smartRefsCount' @ [81:136] ==> var smartRefsCount: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'goldRefsCount' @ [81:165] ==> var goldRefsCount: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'ExpressionsOfTypeProcessor' @ [87:21] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'mode' @ [87:48] ==> public final var mode: ExpressionsOfTypeProcessor.Mode defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[DeserializedPropertyDescriptor]

'ExpressionsOfTypeProcessor' @ [87:55] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[FakeCallableDescriptorForObject]

'PLAIN_WHEN_NEEDED' @ [87:87] ==> enum entry PLAIN_WHEN_NEEDED defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Mode[FakeCallableDescriptorForObject]

'progressIndicator' @ [91:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'fraction' @ [91:32] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'/' @ [91:43] ==> public final operator fun div(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [91:44] ==> val i: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'dataClasses' @ [91:53] ==> val dataClasses: List<KtClass> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'size' @ [91:65] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'toDouble' @ [91:70] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invokeLater' @ [94:24] ==> public final fun invokeLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javax.swing.SwingUtilities[SamAdapterFunctionDescriptor]

'showInfoMessage' @ [95:22] ==> public open fun showInfoMessage(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [95:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[ValueParameterDescriptorImpl]

'dataClasses' @ [95:59] ==> val dataClasses: List<KtClass> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.process[LocalVariableDescriptor]

'size' @ [95:71] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (!KotlinInternalMode.enabled) {
            e.presentation.isVisible = false
            e.presentation.isEnabled = false
        }
        else {
            e.presentation.isVisible = true
            e.presentation.isEnabled = selectedKotlinFiles(e).any()
        }' @ [100:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [100:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinInternalMode' @ [100:14] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [100:33] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'e' @ [101:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.update[ValueParameterDescriptorImpl]

'presentation' @ [101:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [101:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [102:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.update[ValueParameterDescriptorImpl]

'presentation' @ [102:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [102:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'e' @ [105:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.update[ValueParameterDescriptorImpl]

'presentation' @ [105:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [105:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [106:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.update[ValueParameterDescriptorImpl]

'presentation' @ [106:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [106:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'selectedKotlinFiles' @ [106:40] ==> private final fun selectedKotlinFiles(e: AnActionEvent): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction[SimpleFunctionDescriptorImpl]

'e' @ [106:60] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.update[ValueParameterDescriptorImpl]

'any' @ [106:63] ==> public fun <T> Sequence<KtFile>.any(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'e' @ [111:28] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.selectedKotlinFiles[ValueParameterDescriptorImpl]

'getData' @ [111:30] ==> @Nullable public open fun <T : (Any..Any?)> getData(@NotNull p0: DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>): (Array<(VirtualFile..VirtualFile?)>?..Array<out (VirtualFile..VirtualFile?)>?) defined in com.intellij.openapi.actionSystem.AnActionEvent[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Array<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>..kotlin.Array<out (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>?)

'VIRTUAL_FILE_ARRAY' @ [111:53] ==> public final val VIRTUAL_FILE_ARRAY: (DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>..DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'sequenceOf' @ [111:83] ==> public fun <T> sequenceOf(vararg elements: KtFile): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'?:' @ [112:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Project?, right: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Project

'PROJECT' @ [112:38] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [112:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'e' @ [112:54] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.selectedKotlinFiles[ValueParameterDescriptorImpl]

'dataContext' @ [112:56] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'sequenceOf' @ [112:79] ==> public fun <T> sequenceOf(vararg elements: KtFile): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'allKotlinFiles' @ [113:16] ==> private final fun allKotlinFiles(filesOrDirs: Array<VirtualFile>, project: Project): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction[SimpleFunctionDescriptorImpl]

'virtualFiles' @ [113:31] ==> val virtualFiles: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.selectedKotlinFiles[LocalVariableDescriptor]

'project' @ [113:45] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.selectedKotlinFiles[LocalVariableDescriptor]

'getInstance' @ [117:34] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [117:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allKotlinFiles[ValueParameterDescriptorImpl]

'allFiles' @ [118:16] ==> private final fun allFiles(filesOrDirs: Array<VirtualFile>): Collection<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction[SimpleFunctionDescriptorImpl]

'filesOrDirs' @ [118:25] ==> value-parameter filesOrDirs: Array<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allKotlinFiles[ValueParameterDescriptorImpl]

'asSequence' @ [119:18] ==> public fun <T> Iterable<VirtualFile>.asSequence(): Sequence<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'mapNotNull' @ [120:18] ==> public fun <T, R : Any> Sequence<VirtualFile>.mapNotNull(transform: (VirtualFile) -> KtFile?): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R : Any> -> KtFile

'manager' @ [120:31] ==> val manager: PsiManager defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allKotlinFiles[LocalVariableDescriptor]

'findFile' @ [120:39] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'it' @ [120:48] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [124:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VirtualFile

'filesOrDirs' @ [125:22] ==> value-parameter filesOrDirs: Array<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allFiles[ValueParameterDescriptorImpl]

'visitChildrenRecursively' @ [126:25] ==> @NotNull public open fun visitChildrenRecursively(@NotNull p0: VirtualFile, @NotNull p1: VirtualFileVisitor<*>): VirtualFileVisitor.Result defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'file' @ [126:50] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allFiles[LocalVariableDescriptor]

'VirtualFileVisitor<Unit>' @ [126:65] ==> protected/*protected and package*/ constructor VirtualFileVisitor<T : (Any..Any?)>(@NotNull vararg p0: (VirtualFileVisitor.Option..VirtualFileVisitor.Option?)) defined in com.intellij.openapi.vfs.VirtualFileVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'result' @ [128:21] ==> val result: ArrayList<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allFiles[LocalVariableDescriptor]

'add' @ [128:28] ==> public open fun add(element: VirtualFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'file' @ [128:32] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allFiles.<no name provided>.visitFile[ValueParameterDescriptorImpl]

'result' @ [133:16] ==> val result: ArrayList<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckComponentsUsageSearchAction.allFiles[LocalVariableDescriptor]

