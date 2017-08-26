'AnAction' @ [57:52] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'e' @ [59:23] ==> value-parameter e: AnActionEvent? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [59:26] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'CompletionBenchmarkSink' @ [61:29] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[FakeCallableDescriptorForObject]

'enableAndGet' @ [61:53] ==> public final fun enableAndGet(): CompletionBenchmarkSink.Impl defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Companion[DeserializedSimpleFunctionDescriptor]

'createBenchmarkScenario' @ [62:24] ==> internal abstract fun createBenchmarkScenario(project: Project, benchmarkSink: CompletionBenchmarkSink.Impl): AbstractCompletionBenchmarkScenario? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction[SimpleFunctionDescriptorImpl]

'project' @ [62:48] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'benchmarkSink' @ [62:57] ==> val benchmarkSink: CompletionBenchmarkSink.Impl defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'launch' @ [64:9] ==> public fun launch(context: CoroutineContext, start: Boolean = ..., block: suspend CoroutineScope.() -> Unit): Job defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'EDT' @ [64:16] ==> public object EDT : CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.util[FakeCallableDescriptorForObject]

'scenario' @ [65:13] ==> val scenario: AbstractCompletionBenchmarkScenario defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'doBenchmark' @ [65:22] ==> public abstract suspend fun doBenchmark(): Unit defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[SimpleFunctionDescriptorImpl]

'CompletionBenchmarkSink' @ [66:13] ==> public companion object defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink[FakeCallableDescriptorForObject]

'disable' @ [66:37] ==> public final fun disable(): Unit defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Companion[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [74:43] ==> public open fun getInstance(): (WindowManager..WindowManager?) defined in com.intellij.openapi.wm.WindowManager[JavaMethodDescriptor]

'getStatusBar' @ [74:57] ==> public abstract fun getStatusBar(p0: (Project..Project?)): (StatusBar..StatusBar?) defined in com.intellij.openapi.wm.WindowManager[JavaMethodDescriptor]

'project' @ [74:70] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.showPopup[ValueParameterDescriptorImpl]

'getInstance' @ [75:28] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createHtmlTextBalloonBuilder' @ [76:22] ==> @NotNull public abstract fun createHtmlTextBalloonBuilder(@NotNull p0: String, p1: (MessageType..MessageType?), @Nullable p2: HyperlinkListener?): BalloonBuilder defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'text' @ [76:51] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.showPopup[ValueParameterDescriptorImpl]

'ERROR' @ [76:69] ==> public final val ERROR: (MessageType..MessageType?) defined in com.intellij.openapi.ui.MessageType[JavaPropertyDescriptor]

'setFadeoutTime' @ [77:22] ==> @NotNull public abstract fun setFadeoutTime(p0: Long): BalloonBuilder defined in com.intellij.openapi.ui.popup.BalloonBuilder[JavaMethodDescriptor]

'createBalloon' @ [78:22] ==> @NotNull public abstract fun createBalloon(): Balloon defined in com.intellij.openapi.ui.popup.BalloonBuilder[JavaMethodDescriptor]

'showInCenterOf' @ [78:38] ==> public abstract fun showInCenterOf(p0: (JComponent..JComponent?)): Unit defined in com.intellij.openapi.ui.popup.Balloon[JavaMethodDescriptor]

'statusBar' @ [78:53] ==> val statusBar: (StatusBar..StatusBar?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.showPopup[LocalVariableDescriptor]

'component' @ [78:63] ==> public final val StatusBar.component: (JComponent..JComponent?)[MyPropertyDescriptor]

'if (this.isNotEmpty()) this[random.nextInt(this.size)] else null' @ [81:70] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'this' @ [81:74] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ReceiverParameterDescriptorImpl]

'isNotEmpty' @ [81:79] ==> @InlineOnly public inline fun <T> Collection<T>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [81:93] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ReceiverParameterDescriptorImpl]

'random' @ [81:98] ==> value-parameter random: Random defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ValueParameterDescriptorImpl]

'nextInt' @ [81:105] ==> public open fun nextInt(p0: Int): Int defined in java.util.Random[JavaMethodDescriptor]

'this' @ [81:113] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ReceiverParameterDescriptorImpl]

'size' @ [81:118] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (this.isNotEmpty()) this[random.nextInt(this.size)] else null' @ [82:71] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'this' @ [82:75] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ReceiverParameterDescriptorImpl]

'isNotEmpty' @ [82:80] ==> @InlineOnly public inline fun <T> Array<out T>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [82:94] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ReceiverParameterDescriptorImpl]

'random' @ [82:99] ==> value-parameter random: Random defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ValueParameterDescriptorImpl]

'nextInt' @ [82:106] ==> public open fun nextInt(p0: Int): Int defined in java.util.Random[JavaMethodDescriptor]

'this' @ [82:114] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.randomElement[ReceiverParameterDescriptorImpl]

'size' @ [82:119] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'generateSequence' @ [83:88] ==> public fun <T : Any> generateSequence(nextFunction: () -> T?): Sequence<T> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'this' @ [83:107] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.shuffledSequence[ReceiverParameterDescriptorImpl]

'randomElement' @ [83:112] ==> internal final fun <T> List<T>.randomElement(random: Random): T? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'random' @ [83:126] ==> value-parameter random: Random defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.shuffledSequence[ValueParameterDescriptorImpl]

'distinct' @ [83:136] ==> public fun <T> Sequence<T>.distinct(): Sequence<T> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'DelegatingGlobalSearchScope' @ [86:34] ==> public constructor DelegatingGlobalSearchScope(@NotNull p0: GlobalSearchScope) defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaClassConstructorDescriptor]

'allScope' @ [86:80] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [86:89] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles[ValueParameterDescriptorImpl]

'this' @ [91:34] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.isUsableForBenchmark[ReceiverParameterDescriptorImpl]

'getNullableModuleInfo' @ [91:39] ==> public fun PsiElement.getNullableModuleInfo(): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'this' @ [92:21] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.isUsableForBenchmark[ReceiverParameterDescriptorImpl]

'isCompiled' @ [92:26] ==> public final val KtFile.isCompiled: Boolean[MyPropertyDescriptor]

'!' @ [92:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [92:41] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.isUsableForBenchmark[ReceiverParameterDescriptorImpl]

'isWritable' @ [92:46] ==> public final val KtFile.isWritable: Boolean[MyPropertyDescriptor]

'this' @ [92:60] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.isUsableForBenchmark[ReceiverParameterDescriptorImpl]

'isScript' @ [92:65] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'moduleInfo' @ [93:24] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.isUsableForBenchmark[LocalVariableDescriptor]

'moduleOrigin' @ [93:35] ==> public abstract val moduleOrigin: ModuleOrigin defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[DeserializedPropertyDescriptor]

'MODULE' @ [93:64] ==> enum entry MODULE defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'getFiles' @ [96:46] ==> @NotNull public open fun getFiles(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [96:70] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'scope' @ [96:80] ==> val scope: <no name provided> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles[LocalVariableDescriptor]

'kotlinVFiles' @ [98:20] ==> val kotlinVFiles: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles[LocalVariableDescriptor]

'asSequence' @ [99:22] ==> public fun <T> Iterable<(VirtualFile..VirtualFile?)>.asSequence(): Sequence<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'mapNotNull' @ [100:22] ==> public fun <T, R : Any> Sequence<(VirtualFile..VirtualFile?)>.mapNotNull(transform: ((VirtualFile..VirtualFile?)) -> KtFile?): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <R : Any> -> KtFile

'vfile' @ [100:45] ==> value-parameter vfile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'toPsiFile' @ [100:51] ==> public fun VirtualFile.toPsiFile(project: Project): PsiFile? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [100:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles[ValueParameterDescriptorImpl]

'filterTo' @ [101:22] ==> public inline fun <T, C : MutableCollection<in KtFile>> Sequence<KtFile>.filterTo(destination: MutableList<KtFile>, predicate: (KtFile) -> Boolean): MutableList<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <C : MutableCollection<in T>> -> MutableList<KtFile>

'mutableListOf' @ [101:31] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [101:50] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'isUsableForBenchmark' @ [101:53] ==> local final fun KtFile.isUsableForBenchmark(): Boolean defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles[SimpleFunctionDescriptorImpl]

'invoke' @ [101:79] ==> public abstract operator fun invoke(p1: KtFile): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [101:93] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.collectSuitableKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'tooltip' @ [104:78] ==> value-parameter tooltip: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ValueParameterDescriptorImpl]

'this' @ [105:13] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ReceiverParameterDescriptorImpl]

'add' @ [105:18] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'JBLabel' @ [105:22] ==> public constructor JBLabel(@NotNull p0: String) defined in com.intellij.ui.components.JBLabel[JavaClassConstructorDescriptor]

'label' @ [105:30] ==> value-parameter label: String = ... defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ValueParameterDescriptorImpl]

'GridConstraints' @ [105:38] ==> public constructor GridConstraints() defined in com.intellij.uiDesigner.core.GridConstraints[JavaClassConstructorDescriptor]

'apply' @ [105:56] ==> @InlineOnly public inline fun <T> GridConstraints.apply(block: GridConstraints.() -> Unit): GridConstraints defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GridConstraints

'row' @ [105:64] ==> public final var GridConstraints.row: Int[MyPropertyDescriptor]

'i' @ [105:70] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ValueParameterDescriptorImpl]

'column' @ [105:73] ==> public final var GridConstraints.column: Int[MyPropertyDescriptor]

'JBTextField' @ [106:29] ==> public constructor JBTextField() defined in com.intellij.ui.components.JBTextField[JavaClassConstructorDescriptor]

'apply' @ [106:43] ==> @InlineOnly public inline fun <T> JBTextField.apply(block: JBTextField.() -> Unit): JBTextField defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JBTextField

'text' @ [107:17] ==> public final var JBTextField.text: (String..String?)[MyPropertyDescriptor]

'default' @ [107:24] ==> value-parameter default: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ValueParameterDescriptorImpl]

'toolTipText' @ [108:17] ==> public final var JBTextField.toolTipText: (String..String?)[MyPropertyDescriptor]

'tooltip' @ [108:31] ==> value-parameter tooltip: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ValueParameterDescriptorImpl]

'this' @ [110:13] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ReceiverParameterDescriptorImpl]

'add' @ [110:18] ==> public open fun add(p0: (Component..Component?), p1: (Any..Any?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'textField' @ [110:22] ==> val textField: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[LocalVariableDescriptor]

'GridConstraints' @ [110:33] ==> public constructor GridConstraints() defined in com.intellij.uiDesigner.core.GridConstraints[JavaClassConstructorDescriptor]

'apply' @ [110:51] ==> @InlineOnly public inline fun <T> GridConstraints.apply(block: GridConstraints.() -> Unit): GridConstraints defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GridConstraints

'row' @ [110:59] ==> public final var GridConstraints.row: Int[MyPropertyDescriptor]

'i' @ [110:65] ==> value-parameter i: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[ValueParameterDescriptorImpl]

'column' @ [110:68] ==> public final var GridConstraints.column: Int[MyPropertyDescriptor]

'fill' @ [110:80] ==> public final var GridConstraints.fill: Int[MyPropertyDescriptor]

'FILL_HORIZONTAL' @ [110:103] ==> public const final val FILL_HORIZONTAL: Int defined in com.intellij.uiDesigner.core.GridConstraints[JavaPropertyDescriptor]

'textField' @ [111:20] ==> val textField: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion.addBoxWithLabel[LocalVariableDescriptor]

'e' @ [116:9] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.update[ValueParameterDescriptorImpl]

'presentation' @ [116:11] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabledAndVisible' @ [116:24] ==> public final var Presentation.isEnabledAndVisible: Boolean[MyPropertyDescriptor]

'KotlinInternalMode' @ [116:46] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [116:65] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'Random' @ [122:30] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'Result' @ [128:107] ==> private constructor Result() defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result[ClassConstructorDescriptorImpl]

'with' @ [129:70] ==> @InlineOnly public inline fun <T, R> with(receiver: StringBuilder /* = StringBuilder */, block: StringBuilder /* = StringBuilder */.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder
    <R> -> Unit

'stringBuilder' @ [129:75] ==> value-parameter stringBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.SuccessResult.toCSV[ValueParameterDescriptorImpl]

'append' @ [130:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'filePath' @ [130:24] ==> public final val filePath: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.SuccessResult[PropertyDescriptorImpl]

'append' @ [131:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [132:17] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'lines' @ [132:24] ==> public final val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.SuccessResult[PropertyDescriptorImpl]

'append' @ [133:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [134:17] ==> public open fun append(p0: Long): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'first' @ [134:24] ==> public final val first: Long defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.SuccessResult[PropertyDescriptorImpl]

'append' @ [135:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [136:17] ==> public open fun append(p0: Long): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'full' @ [136:24] ==> public final val full: Long defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.SuccessResult[PropertyDescriptorImpl]

'Result' @ [140:51] ==> private constructor Result() defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result[ClassConstructorDescriptorImpl]

'with' @ [141:70] ==> @InlineOnly public inline fun <T, R> with(receiver: StringBuilder /* = StringBuilder */, block: StringBuilder /* = StringBuilder */.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder
    <R> -> Unit

'stringBuilder' @ [141:75] ==> value-parameter stringBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.ErrorResult.toCSV[ValueParameterDescriptorImpl]

'append' @ [142:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'filePath' @ [142:24] ==> public final val filePath: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.ErrorResult[PropertyDescriptorImpl]

'append' @ [143:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [144:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [145:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'openFileWithPsiElement' @ [152:24] ==> public open fun openFileWithPsiElement(p0: (PsiElement..PsiElement?), p1: Boolean, p2: Boolean): Boolean defined in com.intellij.codeInsight.navigation.NavigationUtil[JavaMethodDescriptor]

'file' @ [152:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'navigationElement' @ [152:52] ==> public final val KtFile.navigationElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'?:' @ [154:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Document?, right: Document): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Document

'getInstance' @ [154:43] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [154:55] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'getDocument' @ [154:64] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [154:76] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'ErrorResult' @ [155:38] ==> public constructor ErrorResult(filePath: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.ErrorResult[ClassConstructorDescriptorImpl]

'file' @ [155:53] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'virtualFile' @ [155:58] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [155:70] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'offset' @ [155:78] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'file' @ [157:27] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'virtualFile' @ [157:32] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [157:44] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'document' @ [157:52] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'getLineNumber' @ [157:61] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [157:75] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'?:' @ [159:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Editor?, right: Editor): Editor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Editor

'getInstance' @ [159:36] ==> public open fun getInstance(): (EditorFactory..EditorFactory?) defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'getEditors' @ [159:50] ==> @NotNull public abstract fun getEditors(@NotNull p0: Document, @Nullable p1: Project?): (Array<(Editor..Editor?)>..Array<out (Editor..Editor?)>) defined in com.intellij.openapi.editor.EditorFactory[JavaMethodDescriptor]

'document' @ [159:61] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'project' @ [159:71] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'firstOrNull' @ [159:80] ==> public fun <T> Array<out (Editor..Editor?)>.firstOrNull(): Editor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.Editor..com.intellij.openapi.editor.Editor?)

'ErrorResult' @ [159:111] ==> public constructor ErrorResult(filePath: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.ErrorResult[ClassConstructorDescriptorImpl]

'location' @ [159:123] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'delay' @ [162:9] ==> public suspend fun delay(time: Long, unit: TimeUnit = ...): Unit defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'editor' @ [164:9] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'moveCaret' @ [164:16] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'offset' @ [164:26] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'CENTER' @ [164:58] ==> enum entry CENTER defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'delay' @ [166:9] ==> public suspend fun delay(time: Long, unit: TimeUnit = ...): Unit defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [168:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [168:40] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'project' @ [168:55] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'runWriteAction' @ [169:13] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'document' @ [170:17] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'insertString' @ [170:26] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'editor' @ [170:39] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'caretModel' @ [170:46] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [170:57] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'text' @ [170:69] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'getInstance' @ [171:36] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [171:48] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'commitDocument' @ [171:57] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [171:72] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'editor' @ [173:13] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'moveCaret' @ [173:20] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'editor' @ [173:30] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'caretModel' @ [173:37] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [173:48] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'text' @ [173:57] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'length' @ [173:62] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'getInstance' @ [174:33] ==> public open fun getInstance(p0: (Project..Project?)): (AutoPopupController..AutoPopupController?) defined in com.intellij.codeInsight.AutoPopupController[JavaMethodDescriptor]

'project' @ [174:45] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'scheduleAutoPopup' @ [174:54] ==> public open fun scheduleAutoPopup(p0: (Editor..Editor?), p1: (CompletionType..CompletionType?), @Nullable p2: Condition<(PsiFile..PsiFile?)>?): Unit defined in com.intellij.codeInsight.AutoPopupController[JavaMethodDescriptor]

'editor' @ [174:72] ==> val editor: Editor defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'BASIC' @ [174:95] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'withTimeout' @ [178:13] ==> public suspend fun <T> withTimeout(time: Long, unit: TimeUnit = ..., block: suspend () -> AbstractCompletionBenchmarkScenario.Result): AbstractCompletionBenchmarkScenario.Result defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'timeout' @ [178:25] ==> public final val timeout: Long defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'collectResult' @ [178:36] ==> protected final suspend fun collectResult(file: KtFile, location: String): AbstractCompletionBenchmarkScenario.Result defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[SimpleFunctionDescriptorImpl]

'file' @ [178:50] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'location' @ [178:56] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'ErrorResult' @ [181:20] ==> public constructor ErrorResult(filePath: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.ErrorResult[ClassConstructorDescriptorImpl]

'location' @ [181:32] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'getInstance' @ [184:26] ==> public open fun getInstance(): (CommandProcessor..CommandProcessor?) defined in com.intellij.openapi.command.CommandProcessor[JavaMethodDescriptor]

'executeCommand' @ [184:40] ==> public final fun executeCommand(@Nullable p0: Project?, @NotNull p1: () -> Unit, @Nullable p2: String?, @Nullable p3: Any?): Unit defined in com.intellij.openapi.command.CommandProcessor[MyFunctionDescriptor]

'project' @ [184:55] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'runWriteAction' @ [185:13] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'document' @ [186:17] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'deleteString' @ [186:26] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'offset' @ [186:39] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'offset' @ [186:47] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'text' @ [186:56] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[ValueParameterDescriptorImpl]

'length' @ [186:61] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'getInstance' @ [187:36] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [187:48] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'commitDocument' @ [187:57] ==> public abstract fun commitDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [187:72] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'delay' @ [191:9] ==> public suspend fun delay(time: Long, unit: TimeUnit = ...): Unit defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'result' @ [192:16] ==> val result: AbstractCompletionBenchmarkScenario.Result defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.typeAtOffsetAndGetResult[LocalVariableDescriptor]

'benchmarkSink' @ [196:23] ==> public final val benchmarkSink: CompletionBenchmarkSink.Impl defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

'channel' @ [196:37] ==> public final val channel: ConflatedChannel<CompletionBenchmarkSink.Impl.CompletionBenchmarkResults> defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Impl[DeserializedPropertyDescriptor]

'receive' @ [196:45] ==> public final suspend fun receive(): CompletionBenchmarkSink.Impl.CompletionBenchmarkResults defined in kotlinx.coroutines.experimental.channels.ConflatedChannel[DeserializedSimpleFunctionDescriptor]

'SuccessResult' @ [197:23] ==> public constructor SuccessResult(lines: Int, filePath: String, first: Long, full: Long) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result.SuccessResult[ClassConstructorDescriptorImpl]

'file' @ [197:37] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.collectResult[ValueParameterDescriptorImpl]

'getLineCount' @ [197:42] ==> public fun PsiElement.getLineCount(): Int defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'location' @ [197:58] ==> value-parameter location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.collectResult[ValueParameterDescriptorImpl]

'results' @ [197:68] ==> val results: CompletionBenchmarkSink.Impl.CompletionBenchmarkResults defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.collectResult[LocalVariableDescriptor]

'firstFlush' @ [197:76] ==> public final var firstFlush: Long defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Impl.CompletionBenchmarkResults[DeserializedPropertyDescriptor]

'results' @ [197:88] ==> val results: CompletionBenchmarkSink.Impl.CompletionBenchmarkResults defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.collectResult[LocalVariableDescriptor]

'full' @ [197:96] ==> public final var full: Long defined in org.jetbrains.kotlin.idea.completion.CompletionBenchmarkSink.Impl.CompletionBenchmarkResults[DeserializedPropertyDescriptor]

'JFileChooser' @ [201:19] ==> public constructor JFileChooser() defined in javax.swing.JFileChooser[JavaClassConstructorDescriptor]

'jfc' @ [202:22] ==> val jfc: JFileChooser defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults[LocalVariableDescriptor]

'showSaveDialog' @ [202:26] ==> public open fun showSaveDialog(p0: (Component..Component?)): Int defined in javax.swing.JFileChooser[JavaMethodDescriptor]

'result' @ [203:13] ==> val result: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults[LocalVariableDescriptor]

'APPROVE_OPTION' @ [203:36] ==> public const final val APPROVE_OPTION: Int defined in javax.swing.JFileChooser[JavaPropertyDescriptor]

'jfc' @ [204:24] ==> val jfc: JFileChooser defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults[LocalVariableDescriptor]

'selectedFile' @ [204:28] ==> public final var JFileChooser.selectedFile: (File..File?)[MyPropertyDescriptor]

'file' @ [205:13] ==> val file: (File..File?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults[LocalVariableDescriptor]

'writeText' @ [205:18] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buildString' @ [205:28] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [206:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allResults' @ [208:17] ==> value-parameter allResults: List<AbstractCompletionBenchmarkScenario.Result> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults[ValueParameterDescriptorImpl]

'forEach' @ [208:28] ==> @HidesMembers public inline fun <T> Iterable<AbstractCompletionBenchmarkScenario.Result>.forEach(action: (AbstractCompletionBenchmarkScenario.Result) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'append' @ [209:21] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'i' @ [209:28] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults.<anonymous>[LocalVariableDescriptor]

'append' @ [210:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [211:21] ==> value-parameter it: AbstractCompletionBenchmarkScenario.Result defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toCSV' @ [211:24] ==> public abstract fun toCSV(stringBuilder: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.Result[SimpleFunctionDescriptorImpl]

'this' @ [211:30] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario.saveResults.<anonymous>[ReceiverParameterDescriptorImpl]

'appendln' @ [212:21] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'AbstractCompletionBenchmarkAction' @ [216:9] ==> public companion object defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction[FakeCallableDescriptorForObject]

'showPopup' @ [216:43] ==> public final fun showPopup(project: Project, text: String): Unit defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[SimpleFunctionDescriptorImpl]

'project' @ [216:53] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkScenario[PropertyDescriptorImpl]

