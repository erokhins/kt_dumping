'AnAction' @ [48:37] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'e' @ [50:23] ==> value-parameter e: AnActionEvent? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [50:26] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'showSettingsDialog' @ [52:24] ==> private final fun showSettingsDialog(): HighlightingBenchmarkAction.Settings? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction[SimpleFunctionDescriptorImpl]

'Random' @ [54:22] ==> public constructor Random(p0: Long) defined in java.util.Random[JavaClassConstructorDescriptor]

'settings' @ [54:29] ==> val settings: HighlightingBenchmarkAction.Settings defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'seed' @ [54:38] ==> public final val seed: Long defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Settings[PropertyDescriptorImpl]

'collectSuitableKotlinFiles' @ [58:27] ==> internal final fun collectSuitableKotlinFiles(project: Project, filePredicate: (KtFile) -> Boolean): MutableList<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[FunctionImportedFromObject]

'project' @ [58:54] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'it' @ [58:65] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed.collectFiles.<anonymous>[ValueParameterDescriptorImpl]

'getLineCount' @ [58:68] ==> public fun PsiElement.getLineCount(): Int defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'settings' @ [58:86] ==> val settings: HighlightingBenchmarkAction.Settings defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'lines' @ [58:95] ==> public final val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Settings[PropertyDescriptorImpl]

'ktFiles' @ [60:17] ==> val ktFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed.collectFiles[LocalVariableDescriptor]

'size' @ [60:25] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'settings' @ [60:32] ==> val settings: HighlightingBenchmarkAction.Settings defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'files' @ [60:41] ==> public final val files: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Settings[PropertyDescriptorImpl]

'AbstractCompletionBenchmarkAction' @ [61:17] ==> public companion object defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction[FakeCallableDescriptorForObject]

'showPopup' @ [61:51] ==> public final fun showPopup(project: Project, text: String): Unit defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[SimpleFunctionDescriptorImpl]

'project' @ [61:61] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'ktFiles' @ [61:117] ==> val ktFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed.collectFiles[LocalVariableDescriptor]

'size' @ [61:125] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'ktFiles' @ [65:20] ==> val ktFiles: MutableList<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed.collectFiles[LocalVariableDescriptor]

'collectFiles' @ [69:23] ==> local final fun collectFiles(): List<KtFile>? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[SimpleFunctionDescriptorImpl]

'mutableListOf' @ [71:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<HighlightingBenchmarkAction.Result> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'project' @ [73:26] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'messageBus' @ [73:34] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [73:45] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'getInstance' @ [75:23] ==> public open fun getInstance(): (ActionManager..ActionManager?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'getAction' @ [75:37] ==> public abstract fun getAction(@NonNls @NotNull p0: String): (AnAction..AnAction?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'actionPerformed' @ [75:66] ==> public abstract fun actionPerformed(p0: (AnActionEvent..AnActionEvent?)): Unit defined in com.intellij.openapi.actionSystem.AnAction[JavaMethodDescriptor]

'e' @ [75:82] ==> value-parameter e: AnActionEvent? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[ValueParameterDescriptorImpl]

'DaemonFinishListener' @ [77:30] ==> public constructor DaemonFinishListener() defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.DaemonFinishListener[ClassConstructorDescriptorImpl]

'connection' @ [78:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'subscribe' @ [78:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(DaemonCodeAnalyzer.DaemonListener..DaemonCodeAnalyzer.DaemonListener?)>, @NotNull p1: DaemonCodeAnalyzer.DaemonListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.codeInsight.daemon.DaemonCodeAnalyzer.DaemonListener..com.intellij.codeInsight.daemon.DaemonCodeAnalyzer.DaemonListener?)

'DAEMON_EVENT_TOPIC' @ [78:49] ==> public final val DAEMON_EVENT_TOPIC: (Topic<(DaemonCodeAnalyzer.DaemonListener..DaemonCodeAnalyzer.DaemonListener?)>..Topic<(DaemonCodeAnalyzer.DaemonListener..DaemonCodeAnalyzer.DaemonListener?)>?) defined in com.intellij.codeInsight.daemon.DaemonCodeAnalyzer[JavaPropertyDescriptor]

'finishListener' @ [78:69] ==> val finishListener: HighlightingBenchmarkAction.DaemonFinishListener defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'launch' @ [79:9] ==> public fun launch(context: CoroutineContext, start: Boolean = ..., block: suspend CoroutineScope.() -> Unit): Job defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'EDT' @ [79:16] ==> public object EDT : CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.util[FakeCallableDescriptorForObject]

'delay' @ [81:17] ==> public suspend fun delay(time: Long, unit: TimeUnit = ...): Unit defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'ktFiles' @ [82:17] ==> val ktFiles: List<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'shuffledSequence' @ [83:26] ==> internal final fun <T : Any> List<KtFile>.shuffledSequence(random: Random): Sequence<KtFile> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[FunctionImportedFromObject]
Inferred types:
    <T : Any> -> KtFile

'random' @ [83:43] ==> val random: Random defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'take' @ [84:26] ==> public fun <T> Sequence<KtFile>.take(n: Int): Sequence<KtFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'settings' @ [84:31] ==> val settings: HighlightingBenchmarkAction.Settings defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'files' @ [84:40] ==> public final val files: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Settings[PropertyDescriptorImpl]

'forEach' @ [85:26] ==> public inline fun <T> Sequence<KtFile>.forEach(action: (KtFile) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'results' @ [86:29] ==> val results: MutableList<HighlightingBenchmarkAction.Result> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'openFileAndMeasureTimeToHighlight' @ [86:40] ==> private final suspend fun openFileAndMeasureTimeToHighlight(file: KtFile, project: Project, finishListener: HighlightingBenchmarkAction.DaemonFinishListener): HighlightingBenchmarkAction.Result defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction[SimpleFunctionDescriptorImpl]

'file' @ [86:74] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [86:80] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'finishListener' @ [86:89] ==> val finishListener: HighlightingBenchmarkAction.DaemonFinishListener defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'saveResults' @ [89:17] ==> private final fun saveResults(allResults: List<HighlightingBenchmarkAction.Result>, project: Project): Unit defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction[SimpleFunctionDescriptorImpl]

'results' @ [89:29] ==> val results: MutableList<HighlightingBenchmarkAction.Result> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'project' @ [89:38] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'connection' @ [92:17] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'disconnect' @ [92:28] ==> public abstract fun disconnect(): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]

'finishListener' @ [93:17] ==> val finishListener: HighlightingBenchmarkAction.DaemonFinishListener defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.actionPerformed[LocalVariableDescriptor]

'channel' @ [93:32] ==> public final val channel: ConflatedChannel<String> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.DaemonFinishListener[PropertyDescriptorImpl]

'close' @ [93:40] ==> public final fun close(cause: Throwable?): Boolean defined in kotlinx.coroutines.experimental.channels.ConflatedChannel[DeserializedSimpleFunctionDescriptor]

'ConflatedChannel' @ [101:23] ==> public constructor ConflatedChannel<E>() defined in kotlinx.coroutines.experimental.channels.ConflatedChannel[DeserializedClassConstructorDescriptor]
Inferred types:
    <E> -> String

'channel' @ [104:13] ==> public final val channel: ConflatedChannel<String> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.DaemonFinishListener[PropertyDescriptorImpl]

'offer' @ [104:21] ==> public final fun offer(element: String): Boolean defined in kotlinx.coroutines.experimental.channels.ConflatedChannel[DeserializedSimpleFunctionDescriptor]

'SUCCESS' @ [104:27] ==> private const final val SUCCESS: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Companion[PropertyDescriptorImpl]

'channel' @ [108:13] ==> public final val channel: ConflatedChannel<String> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.DaemonFinishListener[PropertyDescriptorImpl]

'offer' @ [108:21] ==> public final fun offer(element: String): Boolean defined in kotlinx.coroutines.experimental.channels.ConflatedChannel[DeserializedSimpleFunctionDescriptor]

'reason' @ [108:27] ==> value-parameter reason: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.DaemonFinishListener.daemonCancelEventOccurred[ValueParameterDescriptorImpl]

'Delegates' @ [117:35] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [117:45] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, JBTextField> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> JBTextField

'Delegates' @ [118:36] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [118:46] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, JBTextField> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> JBTextField

'Delegates' @ [119:36] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [119:46] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, JBTextField> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> JBTextField

'DialogBuilder' @ [120:29] ==> public constructor DialogBuilder() defined in com.intellij.openapi.ui.DialogBuilder[JavaClassConstructorDescriptor]

'JBPanel' @ [123:22] ==> public constructor JBPanel<T : raw (JBPanel<JBPanel<*>>..JBPanel<out JBPanel<*>>?)>(p0: (LayoutManager..LayoutManager?)) defined in com.intellij.ui.components.JBPanel[JavaClassConstructorDescriptor]
Inferred types:
    <T : raw (JBPanel<JBPanel<*>>..JBPanel<out JBPanel<*>>?)> -> JBPanel<*>

'GridLayoutManager' @ [123:42] ==> public constructor GridLayoutManager(p0: Int, p1: Int) defined in com.intellij.uiDesigner.core.GridLayoutManager[JavaClassConstructorDescriptor]

'apply' @ [123:67] ==> @InlineOnly public inline fun <T> JBPanel<JBPanel<*>>.apply(block: JBPanel<JBPanel<*>>.() -> Unit): JBPanel<JBPanel<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JBPanel<JBPanel<*>>

'cSeed' @ [125:13] ==> var cSeed: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'addBoxWithLabel' @ [125:21] ==> internal final fun JPanel.addBoxWithLabel(tooltip: String, label: String = ..., default: String, i: Int): JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[FunctionImportedFromObject]

'i' @ [125:71] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog.<anonymous>[LocalVariableDescriptor]

'cFiles' @ [126:13] ==> var cFiles: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'addBoxWithLabel' @ [126:22] ==> internal final fun JPanel.addBoxWithLabel(tooltip: String, label: String = ..., default: String, i: Int): JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[FunctionImportedFromObject]

'i' @ [126:76] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog.<anonymous>[LocalVariableDescriptor]

'cLines' @ [127:13] ==> var cLines: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'addBoxWithLabel' @ [127:22] ==> internal final fun JPanel.addBoxWithLabel(tooltip: String, label: String = ..., default: String, i: Int): JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[FunctionImportedFromObject]

'i' @ [127:81] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog.<anonymous>[LocalVariableDescriptor]

'dialogBuilder' @ [129:9] ==> val dialogBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'centerPanel' @ [129:23] ==> @NotNull public open fun centerPanel(@NotNull p0: JComponent): DialogBuilder defined in com.intellij.openapi.ui.DialogBuilder[JavaMethodDescriptor]

'jPanel' @ [129:35] ==> val jPanel: JBPanel<JBPanel<*>> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'!' @ [130:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialogBuilder' @ [130:14] ==> val dialogBuilder: DialogBuilder defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'showAndGet' @ [130:28] ==> public open fun showAndGet(): Boolean defined in com.intellij.openapi.ui.DialogBuilder[JavaMethodDescriptor]

'Settings' @ [132:16] ==> public constructor Settings(seed: Long, files: Int, lines: Int) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Settings[ClassConstructorDescriptorImpl]

'cSeed' @ [132:25] ==> var cSeed: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'text' @ [132:31] ==> public final var JBTextField.text: (String..String?)[MyPropertyDescriptor]

'toLong' @ [132:36] ==> @InlineOnly public inline fun String.toLong(): Long defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'cFiles' @ [132:46] ==> var cFiles: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'text' @ [132:53] ==> public final var JBTextField.text: (String..String?)[MyPropertyDescriptor]

'toInt' @ [132:58] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'cLines' @ [132:67] ==> var cLines: JBTextField defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.showSettingsDialog[LocalVariableDescriptor]

'text' @ [132:74] ==> public final var JBTextField.text: (String..String?)[MyPropertyDescriptor]

'toInt' @ [132:79] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Result' @ [138:91] ==> private constructor Result(location: String, lines: Int) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result[ClassConstructorDescriptorImpl]

'location' @ [138:98] ==> value-parameter location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success.<init>[ValueParameterDescriptorImpl]

'lines' @ [138:108] ==> value-parameter lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success.<init>[ValueParameterDescriptorImpl]

'with' @ [139:64] ==> @InlineOnly public inline fun <T, R> with(receiver: StringBuilder /* = StringBuilder */, block: StringBuilder /* = StringBuilder */.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder
    <R> -> Unit

'builder' @ [139:69] ==> value-parameter builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success.toCSV[ValueParameterDescriptorImpl]

'append' @ [140:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'location' @ [140:24] ==> public final val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success[PropertyDescriptorImpl]

'append' @ [141:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [142:17] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'lines' @ [142:24] ==> public final val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success[PropertyDescriptorImpl]

'append' @ [143:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [144:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'status' @ [144:24] ==> public final val status: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success[PropertyDescriptorImpl]

'append' @ [145:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [146:17] ==> public open fun append(p0: Long): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'time' @ [146:24] ==> public final val time: Long defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success[PropertyDescriptorImpl]

'Result' @ [150:77] ==> private constructor Result(location: String, lines: Int) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result[ClassConstructorDescriptorImpl]

'location' @ [150:84] ==> value-parameter location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error.<init>[ValueParameterDescriptorImpl]

'lines' @ [150:94] ==> value-parameter lines: Int = ... defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error.<init>[ValueParameterDescriptorImpl]

'with' @ [151:64] ==> @InlineOnly public inline fun <T, R> with(receiver: StringBuilder /* = StringBuilder */, block: StringBuilder /* = StringBuilder */.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringBuilder
    <R> -> Unit

'builder' @ [151:69] ==> value-parameter builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error.toCSV[ValueParameterDescriptorImpl]

'append' @ [152:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'location' @ [152:24] ==> public final val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error[PropertyDescriptorImpl]

'append' @ [153:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [154:17] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'lines' @ [154:24] ==> public final val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error[PropertyDescriptorImpl]

'append' @ [155:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [156:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'reason' @ [156:24] ==> public final val reason: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error[PropertyDescriptorImpl]

'append' @ [157:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'openFileWithPsiElement' @ [164:24] ==> public open fun openFileWithPsiElement(p0: (PsiElement..PsiElement?), p1: Boolean, p2: Boolean): Boolean defined in com.intellij.codeInsight.navigation.NavigationUtil[JavaMethodDescriptor]

'file' @ [164:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'navigationElement' @ [164:52] ==> public final val KtFile.navigationElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'file' @ [165:24] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'virtualFile' @ [165:29] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'path' @ [165:41] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'file' @ [167:21] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'getLineCount' @ [167:26] ==> public fun PsiElement.getLineCount(): Int defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'?:' @ [169:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Document?, right: Document): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Document

'getInstance' @ [169:43] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [169:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'getDocument' @ [169:64] ==> @Nullable public abstract fun getDocument(@NotNull p0: PsiFile): Document? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [169:76] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'Error' @ [169:99] ==> public constructor Error(location: String, lines: Int = ..., reason: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error[ClassConstructorDescriptorImpl]

'location' @ [169:105] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'lines' @ [169:115] ==> val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'getInstance' @ [171:41] ==> public open fun getInstance(p0: (Project..Project?)): (DaemonCodeAnalyzer..DaemonCodeAnalyzer?) defined in com.intellij.codeInsight.daemon.DaemonCodeAnalyzer[JavaMethodDescriptor]

'project' @ [171:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'!' @ [173:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'daemon' @ [173:14] ==> val daemon: DaemonCodeAnalyzerImpl defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'isHighlightingAvailable' @ [173:21] ==> public open fun isHighlightingAvailable(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.daemon.impl.DaemonCodeAnalyzerImpl[JavaMethodDescriptor]

'file' @ [173:45] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'Error' @ [173:66] ==> public constructor Error(location: String, lines: Int = ..., reason: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error[ClassConstructorDescriptorImpl]

'location' @ [173:72] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'lines' @ [173:82] ==> val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'!' @ [175:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'daemon' @ [175:14] ==> val daemon: DaemonCodeAnalyzerImpl defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'isRunningOrPending' @ [175:21] ==> public final val DaemonCodeAnalyzerImpl.isRunningOrPending: Boolean[MyPropertyDescriptor]

'Error' @ [175:55] ==> public constructor Error(location: String, lines: Int = ..., reason: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error[ClassConstructorDescriptorImpl]

'location' @ [175:61] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'lines' @ [175:71] ==> val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'currentTimeMillis' @ [177:28] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'finishListener' @ [178:23] ==> value-parameter finishListener: HighlightingBenchmarkAction.DaemonFinishListener defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'channel' @ [178:38] ==> public final val channel: ConflatedChannel<String> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.DaemonFinishListener[PropertyDescriptorImpl]

'receive' @ [178:46] ==> public final suspend fun receive(): String defined in kotlinx.coroutines.experimental.channels.ConflatedChannel[DeserializedSimpleFunctionDescriptor]

'outcome' @ [179:13] ==> val outcome: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'SUCCESS' @ [179:24] ==> private const final val SUCCESS: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Companion[PropertyDescriptorImpl]

'Error' @ [180:27] ==> public constructor Error(location: String, lines: Int = ..., reason: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Error[ClassConstructorDescriptorImpl]

'location' @ [180:33] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'lines' @ [180:43] ==> val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'outcome' @ [180:50] ==> val outcome: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'-' @ [183:28] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'currentTimeMillis' @ [183:35] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'start' @ [183:57] ==> val start: Long defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'forDocument' @ [185:41] ==> public open fun forDocument(@NotNull p0: Document, @Nullable p1: Project?, p2: Boolean): (MarkupModel..MarkupModel?) defined in com.intellij.openapi.editor.impl.DocumentMarkupModel[JavaMethodDescriptor]

'document' @ [185:53] ==> val document: Document defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'project' @ [185:63] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'getSeverityRegistrar' @ [187:51] ==> @NotNull public open fun getSeverityRegistrar(@Nullable p0: Project?): SeverityRegistrar defined in com.intellij.codeInsight.daemon.impl.SeverityRegistrar[JavaMethodDescriptor]

'project' @ [187:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[ValueParameterDescriptorImpl]

'model' @ [189:27] ==> val model: (MarkupModel..MarkupModel?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'allHighlighters' @ [189:33] ==> public final val MarkupModel.allHighlighters: (Array<(RangeHighlighter..RangeHighlighter?)>..Array<out (RangeHighlighter..RangeHighlighter?)>)[MyPropertyDescriptor]

'mapNotNull' @ [190:18] ==> public inline fun <T, R : Any> Array<out (RangeHighlighter..RangeHighlighter?)>.mapNotNull(transform: ((RangeHighlighter..RangeHighlighter?)) -> HighlightSeverity?): List<HighlightSeverity> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.markup.RangeHighlighter..com.intellij.openapi.editor.markup.RangeHighlighter?)
    <R : Any> -> HighlightSeverity

'highlighter' @ [191:32] ==> value-parameter highlighter: (RangeHighlighter..RangeHighlighter?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'errorStripeTooltip' @ [191:44] ==> public final var RangeHighlighter.errorStripeTooltip: Any?[MyPropertyDescriptor]

'info' @ [192:21] ==> val info: HighlightInfo defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight.<anonymous>[LocalVariableDescriptor]

'severity' @ [192:26] ==> public final val HighlightInfo.severity: HighlightSeverity[MyPropertyDescriptor]

'maxWith' @ [193:19] ==> public fun <T> Iterable<HighlightSeverity>.maxWith(comparator: Comparator<in HighlightSeverity> /* = Comparator<in HighlightSeverity> */): HighlightSeverity? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HighlightSeverity

'Comparator' @ [193:27] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((HighlightSeverity..HighlightSeverity?), (HighlightSeverity..HighlightSeverity?)) -> Int): Comparator<HighlightSeverity> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> HighlightSeverity

'severityRegistrar' @ [193:50] ==> val severityRegistrar: SeverityRegistrar defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'compare' @ [193:68] ==> public open fun compare(@NotNull p0: HighlightSeverity, @NotNull p1: HighlightSeverity): Int defined in com.intellij.codeInsight.daemon.impl.SeverityRegistrar[JavaMethodDescriptor]

'o1' @ [193:76] ==> value-parameter o1: (HighlightSeverity..HighlightSeverity?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'o2' @ [193:80] ==> value-parameter o2: (HighlightSeverity..HighlightSeverity?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight.<anonymous>[ValueParameterDescriptorImpl]

'Success' @ [194:23] ==> public constructor Success(location: String, lines: Int, time: Long, status: String) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result.Success[ClassConstructorDescriptorImpl]

'location' @ [194:31] ==> val location: String defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'lines' @ [194:41] ==> val lines: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'analysisTime' @ [194:48] ==> val analysisTime: Long defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'maxSeverity' @ [194:62] ==> val maxSeverity: HighlightSeverity? defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.openFileAndMeasureTimeToHighlight[LocalVariableDescriptor]

'myName' @ [194:75] ==> public final val myName: (String..String?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'JFileChooser' @ [199:19] ==> public constructor JFileChooser() defined in javax.swing.JFileChooser[JavaClassConstructorDescriptor]

'jfc' @ [200:22] ==> val jfc: JFileChooser defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults[LocalVariableDescriptor]

'showSaveDialog' @ [200:26] ==> public open fun showSaveDialog(p0: (Component..Component?)): Int defined in javax.swing.JFileChooser[JavaMethodDescriptor]

'result' @ [201:13] ==> val result: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults[LocalVariableDescriptor]

'APPROVE_OPTION' @ [201:36] ==> public const final val APPROVE_OPTION: Int defined in javax.swing.JFileChooser[JavaPropertyDescriptor]

'jfc' @ [202:24] ==> val jfc: JFileChooser defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults[LocalVariableDescriptor]

'selectedFile' @ [202:28] ==> public final var JFileChooser.selectedFile: (File..File?)[MyPropertyDescriptor]

'file' @ [203:13] ==> val file: (File..File?) defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults[LocalVariableDescriptor]

'writeText' @ [203:18] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buildString' @ [203:28] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [204:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allResults' @ [206:17] ==> value-parameter allResults: List<HighlightingBenchmarkAction.Result> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults[ValueParameterDescriptorImpl]

'forEach' @ [206:28] ==> @HidesMembers public inline fun <T> Iterable<HighlightingBenchmarkAction.Result>.forEach(action: (HighlightingBenchmarkAction.Result) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'append' @ [207:21] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'i' @ [207:28] ==> var i: Int defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults.<anonymous>[LocalVariableDescriptor]

'append' @ [208:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [209:21] ==> value-parameter it: HighlightingBenchmarkAction.Result defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toCSV' @ [209:24] ==> public abstract fun toCSV(builder: StringBuilder /* = StringBuilder */): Unit defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.Result[SimpleFunctionDescriptorImpl]

'this' @ [209:30] ==> <this> defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults.<anonymous>[ReceiverParameterDescriptorImpl]

'appendln' @ [210:21] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'AbstractCompletionBenchmarkAction' @ [214:9] ==> public companion object defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction[FakeCallableDescriptorForObject]

'showPopup' @ [214:43] ==> public final fun showPopup(project: Project, text: String): Unit defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.AbstractCompletionBenchmarkAction.Companion[SimpleFunctionDescriptorImpl]

'project' @ [214:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.saveResults[ValueParameterDescriptorImpl]

'e' @ [218:9] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.internal.benchmark.HighlightingBenchmarkAction.update[ValueParameterDescriptorImpl]

'presentation' @ [218:11] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabledAndVisible' @ [218:24] ==> public final var Presentation.isEnabledAndVisible: Boolean[MyPropertyDescriptor]

'KotlinInternalMode' @ [218:46] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [218:65] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

