'AnAction' @ [51:39] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'selectedKotlinFiles' @ [53:29] ==> private final fun selectedKotlinFiles(e: AnActionEvent): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'e' @ [53:49] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.actionPerformed[ValueParameterDescriptorImpl]

'toList' @ [53:52] ==> public fun <T> Sequence<KtFile>.toList(): List<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'!!' @ [54:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Project?): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Project

'PROJECT' @ [54:38] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [54:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'e' @ [54:54] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.actionPerformed[ValueParameterDescriptorImpl]

'dataContext' @ [54:56] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'getInstance' @ [56:25] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [56:39] ==> public final fun runProcessWithProgressSynchronously(@NotNull p0: () -> Unit, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?): Boolean defined in com.intellij.openapi.progress.ProgressManager[MyFunctionDescriptor]

'runReadAction' @ [58:21] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'checkResolve' @ [58:37] ==> private final fun checkResolve(files: Collection<KtFile>, project: Project): Unit defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'selectedFiles' @ [58:50] ==> val selectedFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.actionPerformed[LocalVariableDescriptor]

'project' @ [58:65] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.actionPerformed[LocalVariableDescriptor]

'project' @ [62:17] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.actionPerformed[LocalVariableDescriptor]

'getInstance' @ [67:49] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'progressIndicator' @ [67:63] ==> public final val ProgressManager.progressIndicator: (ProgressIndicator..ProgressIndicator?)[MyPropertyDescriptor]

'component1' @ [68:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [68:18] ==> public final operator fun component2(): KtFile defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'files' @ [68:27] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'withIndex' @ [68:33] ==> public fun <T> Iterable<KtFile>.withIndex(): Iterable<IndexedValue<KtFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'progressIndicator' @ [69:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'text' @ [69:32] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'i' @ [69:58] ==> val i: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'files' @ [69:65] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'size' @ [69:71] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'progressIndicator' @ [70:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'text2' @ [70:32] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'file' @ [70:40] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'virtualFile' @ [70:45] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [70:57] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'dumpResolve' @ [72:38] ==> private final fun dumpResolve(file: KtFile, resolver: (KtElement, ResolutionFacade) -> BindingContext): String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'file' @ [72:50] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'resolutionFacade' @ [73:17] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [73:34] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'element' @ [73:42] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[ValueParameterDescriptorImpl]

'PARTIAL' @ [73:67] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'dumpResolve' @ [75:28] ==> private final fun dumpResolve(file: KtFile, resolver: (KtElement, ResolutionFacade) -> BindingContext): String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'file' @ [75:40] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'resolutionFacade' @ [76:17] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[ValueParameterDescriptorImpl]

'analyze' @ [76:34] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'element' @ [76:42] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[ValueParameterDescriptorImpl]

'partialResolveDump' @ [78:17] ==> val partialResolveDump: String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'goldDump' @ [78:39] ==> val goldDump: String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'invokeLater' @ [79:32] ==> public final fun invokeLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javax.swing.SwingUtilities[SamAdapterFunctionDescriptor]

'file' @ [80:61] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'virtualFile' @ [80:66] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [80:78] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'SimpleDiffRequest' @ [82:35] ==> public constructor SimpleDiffRequest(p0: (Project..Project?), p1: (String..String?)) defined in com.intellij.openapi.diff.SimpleDiffRequest[JavaClassConstructorDescriptor]

'project' @ [82:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'title' @ [82:62] ==> val title: String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'request' @ [83:21] ==> val request: SimpleDiffRequest defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'setContents' @ [83:29] ==> public open fun setContents(@NotNull p0: DiffContent, @NotNull p1: DiffContent): Unit defined in com.intellij.openapi.diff.SimpleDiffRequest[JavaMethodDescriptor]

'SimpleContent' @ [83:41] ==> public constructor SimpleContent(p0: (String..String?)) defined in com.intellij.openapi.diff.SimpleContent[JavaClassConstructorDescriptor]

'goldDump' @ [83:55] ==> val goldDump: String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'SimpleContent' @ [83:66] ==> public constructor SimpleContent(p0: (String..String?)) defined in com.intellij.openapi.diff.SimpleContent[JavaClassConstructorDescriptor]

'partialResolveDump' @ [83:80] ==> val partialResolveDump: String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'request' @ [84:21] ==> val request: SimpleDiffRequest defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'setContentTitles' @ [84:29] ==> public open fun setContentTitles(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.openapi.diff.SimpleDiffRequest[JavaMethodDescriptor]

'DialogBuilder' @ [85:39] ==> public constructor DialogBuilder(@Nullable p0: Project?) defined in com.intellij.openapi.ui.DialogBuilder[JavaClassConstructorDescriptor]

'project' @ [85:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'getInstance' @ [86:49] ==> public open fun getInstance(): (DiffManager..DiffManager?) defined in com.intellij.openapi.diff.DiffManager[JavaMethodDescriptor]

'createDiffPanel' @ [86:63] ==> public abstract fun createDiffPanel(p0: (Window..Window?), @NotNull p1: Project, @NotNull p2: Disposable, p3: (DiffTool..DiffTool?)): (DiffPanel..DiffPanel?) defined in com.intellij.openapi.diff.DiffManager[JavaMethodDescriptor]

'diffBuilder' @ [86:79] ==> val diffBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'window' @ [86:91] ==> public final val DialogBuilder.window: (Window..Window?)[MyPropertyDescriptor]

'project' @ [86:99] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'diffBuilder' @ [86:108] ==> val diffBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'diffPanel' @ [87:21] ==> val diffPanel: DiffPanelImpl defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'options' @ [87:31] ==> public final val DiffPanelImpl.options: (DiffPanelOptions..DiffPanelOptions?)[MyPropertyDescriptor]

'setShowSourcePolicy' @ [87:39] ==> public open fun setShowSourcePolicy(p0: (DiffPanelOptions.ShowSourcePolicy..DiffPanelOptions.ShowSourcePolicy?)): Unit defined in com.intellij.openapi.diff.ex.DiffPanelOptions[JavaMethodDescriptor]

'DONT_SHOW' @ [87:93] ==> public final val DONT_SHOW: (DiffPanelOptions.ShowSourcePolicy..DiffPanelOptions.ShowSourcePolicy?) defined in com.intellij.openapi.diff.ex.DiffPanelOptions.ShowSourcePolicy[JavaPropertyDescriptor]

'diffBuilder' @ [88:21] ==> val diffBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'setCenterPanel' @ [88:33] ==> public open fun setCenterPanel(p0: (JComponent..JComponent?)): Unit defined in com.intellij.openapi.ui.DialogBuilder[JavaMethodDescriptor]

'diffPanel' @ [88:48] ==> val diffPanel: DiffPanelImpl defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'component' @ [88:58] ==> public final val DiffPanelImpl.component: (JComponent..JComponent?)[MyPropertyDescriptor]

'diffBuilder' @ [89:21] ==> val diffBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'setDimensionServiceKey' @ [89:33] ==> public open fun setDimensionServiceKey(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.ui.DialogBuilder[JavaMethodDescriptor]

'diffPanel' @ [90:21] ==> val diffPanel: DiffPanelImpl defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'setDiffRequest' @ [90:31] ==> public open fun setDiffRequest(p0: (DiffRequest..DiffRequest?)): Unit defined in com.intellij.openapi.diff.impl.DiffPanelImpl[JavaMethodDescriptor]

'request' @ [90:46] ==> val request: SimpleDiffRequest defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'diffBuilder' @ [91:21] ==> val diffBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'addOkAction' @ [91:33] ==> public open fun addOkAction(): (DialogBuilder.CustomizableAction..DialogBuilder.CustomizableAction?) defined in com.intellij.openapi.ui.DialogBuilder[JavaMethodDescriptor]

'setText' @ [91:47] ==> public abstract fun setText(p0: (String..String?)): Unit defined in com.intellij.openapi.ui.DialogBuilder.CustomizableAction[JavaMethodDescriptor]

'diffBuilder' @ [92:21] ==> val diffBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'setTitle' @ [92:33] ==> public open fun setTitle(p0: (String..String?)): Unit defined in com.intellij.openapi.ui.DialogBuilder[JavaMethodDescriptor]

'title' @ [92:42] ==> val title: String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'diffBuilder' @ [93:21] ==> val diffBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve.<anonymous>[LocalVariableDescriptor]

'showNotModal' @ [93:33] ==> public open fun showNotModal(): Unit defined in com.intellij.openapi.ui.DialogBuilder[JavaMethodDescriptor]

'progressIndicator' @ [99:13] ==> val progressIndicator: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'fraction' @ [99:32] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'/' @ [99:43] ==> public final operator fun div(other: Double): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [99:44] ==> val i: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[LocalVariableDescriptor]

'files' @ [99:53] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'size' @ [99:59] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'toDouble' @ [99:64] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invokeLater' @ [102:24] ==> public final fun invokeLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javax.swing.SwingUtilities[SamAdapterFunctionDescriptor]

'showInfoMessage' @ [103:22] ==> public open fun showInfoMessage(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [103:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'files' @ [103:59] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.checkResolve[ValueParameterDescriptorImpl]

'size' @ [103:65] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'StringBuilder' @ [108:23] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'file' @ [109:32] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [109:37] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'!!' @ [110:24] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Document?): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Document

'getInstance' @ [110:44] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'getDocument' @ [110:58] ==> @Nullable public abstract fun getDocument(@NotNull p0: VirtualFile): Document? defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'file' @ [110:70] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[ValueParameterDescriptorImpl]

'virtualFile' @ [110:75] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [111:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[ValueParameterDescriptorImpl]

'acceptChildren' @ [111:14] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'KtVisitorVoid' @ [111:38] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'checkCanceled' @ [113:33] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'element' @ [114:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [114:25] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [114:40] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>[LazyClassReceiverParameterDescriptor]

'super' @ [118:17] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitExpression' @ [118:23] ==> public open fun visitExpression(@NotNull p0: KtExpression): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'expression' @ [118:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'expression' @ [121:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'!' @ [123:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValueNeeded' @ [123:22] ==> private final fun isValueNeeded(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'expression' @ [123:36] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'invoke' @ [125:38] ==> public abstract operator fun invoke(p1: KtElement, p2: ResolutionFacade): BindingContext defined in kotlin.Function2[FunctionInvokeDescriptor]

'expression' @ [125:47] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'resolutionFacade' @ [125:59] ==> val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'expression' @ [127:30] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'textOffset' @ [127:41] ==> public final val KtExpression.textOffset: Int[MyPropertyDescriptor]

'document' @ [128:28] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'getLineNumber' @ [128:37] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [128:51] ==> val offset: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'offset' @ [129:30] ==> val offset: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'document' @ [129:39] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'getLineStartOffset' @ [129:48] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [129:67] ==> val line: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'?:' @ [130:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'expression' @ [130:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'getReferencedName' @ [130:76] ==> public open fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtNameReferenceExpression[DeserializedSimpleFunctionDescriptor]

'expression' @ [130:99] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'java' @ [130:117] ==> public val <T> KClass<out KtExpression>.java: Class<out KtExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtExpression

'simpleName' @ [130:122] ==> public final val <T : (Any..Any?)> Class<out KtExpression>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KtExpression

'builder' @ [131:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'append' @ [131:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'exprName' @ [131:34] ==> val exprName: (String..String?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'line' @ [131:49] ==> val line: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'column' @ [131:61] ==> val column: Int defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'expression' @ [133:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [134:34] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [134:64] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [134:82] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'builder' @ [135:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'append' @ [135:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'target' @ [135:52] ==> val target: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'presentation' @ [135:60] ==> private final fun DeclarationDescriptor.presentation(): String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'bindingContext' @ [138:28] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'getType' @ [138:43] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [138:51] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'type' @ [139:21] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'builder' @ [140:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'append' @ [140:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'type' @ [140:49] ==> val type: KotlinType? defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve.<no name provided>.visitExpression[LocalVariableDescriptor]

'presentation' @ [140:54] ==> private final fun KotlinType.presentation(): String defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'builder' @ [143:17] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'append' @ [143:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'builder' @ [146:16] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.dumpResolve[LocalVariableDescriptor]

'toString' @ [146:24] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DescriptorRenderer' @ [149:56] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [149:75] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [149:93] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [149:100] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.presentation[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [150:45] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [150:64] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [150:82] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [150:93] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.presentation[ReceiverParameterDescriptorImpl]

'if (!KotlinInternalMode.enabled) {
            e.presentation.isVisible = false
            e.presentation.isEnabled = false
        }
        else {
            e.presentation.isVisible = true
            e.presentation.isEnabled = selectedKotlinFiles(e).any()
        }' @ [153:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [153:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinInternalMode' @ [153:14] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [153:33] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'e' @ [154:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.update[ValueParameterDescriptorImpl]

'presentation' @ [154:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [154:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [155:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.update[ValueParameterDescriptorImpl]

'presentation' @ [155:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [155:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'e' @ [158:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.update[ValueParameterDescriptorImpl]

'presentation' @ [158:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isVisible' @ [158:28] ==> public final var Presentation.isVisible: Boolean[MyPropertyDescriptor]

'e' @ [159:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.update[ValueParameterDescriptorImpl]

'presentation' @ [159:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabled' @ [159:28] ==> public final var Presentation.isEnabled: Boolean[MyPropertyDescriptor]

'selectedKotlinFiles' @ [159:40] ==> private final fun selectedKotlinFiles(e: AnActionEvent): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'e' @ [159:60] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.update[ValueParameterDescriptorImpl]

'any' @ [159:63] ==> public fun <T> Sequence<KtFile>.any(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'e' @ [164:28] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.selectedKotlinFiles[ValueParameterDescriptorImpl]

'getData' @ [164:30] ==> @Nullable public open fun <T : (Any..Any?)> getData(@NotNull p0: DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>): (Array<(VirtualFile..VirtualFile?)>?..Array<out (VirtualFile..VirtualFile?)>?) defined in com.intellij.openapi.actionSystem.AnActionEvent[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Array<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>..kotlin.Array<out (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>)

'VIRTUAL_FILE_ARRAY' @ [164:53] ==> public final val VIRTUAL_FILE_ARRAY: (DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>..DataKey<(Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'sequenceOf' @ [164:83] ==> public fun <T> sequenceOf(vararg elements: KtFile): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'?:' @ [165:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Project?, right: Project): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Project

'PROJECT' @ [165:38] ==> public final val PROJECT: (DataKey<(Project..Project?)>..DataKey<(Project..Project?)>?) defined in com.intellij.openapi.actionSystem.CommonDataKeys[JavaPropertyDescriptor]

'getData' @ [165:46] ==> @Nullable public open fun getData(@NotNull p0: DataContext): Project? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'e' @ [165:54] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.selectedKotlinFiles[ValueParameterDescriptorImpl]

'dataContext' @ [165:56] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'sequenceOf' @ [165:79] ==> public fun <T> sequenceOf(vararg elements: KtFile): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'allKotlinFiles' @ [166:16] ==> private final fun allKotlinFiles(filesOrDirs: Array<VirtualFile>, project: Project): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'virtualFiles' @ [166:31] ==> val virtualFiles: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.selectedKotlinFiles[LocalVariableDescriptor]

'project' @ [166:45] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.selectedKotlinFiles[LocalVariableDescriptor]

'getInstance' @ [170:34] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [170:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allKotlinFiles[ValueParameterDescriptorImpl]

'allFiles' @ [171:16] ==> private final fun allFiles(filesOrDirs: Array<VirtualFile>): Collection<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'filesOrDirs' @ [171:25] ==> value-parameter filesOrDirs: Array<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allKotlinFiles[ValueParameterDescriptorImpl]

'asSequence' @ [172:18] ==> public fun <T> Iterable<VirtualFile>.asSequence(): Sequence<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'mapNotNull' @ [173:18] ==> public fun <T, R : Any> Sequence<VirtualFile>.mapNotNull(transform: (VirtualFile) -> KtFile?): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R : Any> -> KtFile

'manager' @ [173:31] ==> val manager: PsiManager defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allKotlinFiles[LocalVariableDescriptor]

'findFile' @ [173:39] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'it' @ [173:48] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [177:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VirtualFile

'filesOrDirs' @ [178:22] ==> value-parameter filesOrDirs: Array<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allFiles[ValueParameterDescriptorImpl]

'visitChildrenRecursively' @ [179:25] ==> @NotNull public open fun visitChildrenRecursively(@NotNull p0: VirtualFile, @NotNull p1: VirtualFileVisitor<*>): VirtualFileVisitor.Result defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'file' @ [179:50] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allFiles[LocalVariableDescriptor]

'VirtualFileVisitor<Unit>' @ [179:65] ==> protected/*protected and package*/ constructor VirtualFileVisitor<T : (Any..Any?)>(@NotNull vararg p0: (VirtualFileVisitor.Option..VirtualFileVisitor.Option?)) defined in com.intellij.openapi.vfs.VirtualFileVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Unit

'result' @ [181:21] ==> val result: ArrayList<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allFiles[LocalVariableDescriptor]

'add' @ [181:28] ==> public open fun add(element: VirtualFile): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'file' @ [181:32] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allFiles.<no name provided>.visitFile[ValueParameterDescriptorImpl]

'result' @ [186:16] ==> val result: ArrayList<VirtualFile> defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.allFiles[LocalVariableDescriptor]

'expression' @ [191:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[ValueParameterDescriptorImpl]

'parent' @ [191:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtBlockExpression -> expression == parent.lastStatement() && isValueNeeded(parent)

            is KtContainerNode -> { //TODO - not quite correct
                val pparent = parent.parent as? KtExpression
                pparent != null && isValueNeeded(pparent)
            }

            is KtDeclarationWithBody -> {
                if (expression == parent.bodyExpression)
                    !parent.hasBlockBody() && !parent.hasDeclaredReturnType()
                else
                    true
            }

            else -> true
        }' @ [192:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [192:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'expression' @ [193:37] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[ValueParameterDescriptorImpl]

'parent' @ [193:51] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'lastStatement' @ [193:58] ==> private final fun KtBlockExpression.lastStatement(): KtExpression? defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'isValueNeeded' @ [193:77] ==> private final fun isValueNeeded(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'parent' @ [193:91] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'parent' @ [196:31] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'parent' @ [196:38] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'pparent' @ [197:17] ==> val pparent: KtExpression? defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'isValueNeeded' @ [197:36] ==> private final fun isValueNeeded(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction[SimpleFunctionDescriptorImpl]

'pparent' @ [197:50] ==> val pparent: KtExpression? defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'if (expression == parent.bodyExpression)
                    !parent.hasBlockBody() && !parent.hasDeclaredReturnType()
                else
                    true' @ [201:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'expression' @ [201:21] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[ValueParameterDescriptorImpl]

'parent' @ [201:35] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'bodyExpression' @ [201:42] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [202:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [202:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'hasBlockBody' @ [202:29] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'!' @ [202:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [202:48] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.actions.internal.CheckPartialBodyResolveAction.isValueNeeded[LocalVariableDescriptor]

'hasDeclaredReturnType' @ [202:55] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'lastChild' @ [212:15] ==> public final val KtBlockExpression.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [212:26] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstIsInstanceOrNull' @ [212:53] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): KtExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtExpression

