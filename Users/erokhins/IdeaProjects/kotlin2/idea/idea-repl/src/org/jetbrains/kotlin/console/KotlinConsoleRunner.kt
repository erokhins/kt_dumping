'AbstractConsoleRunnerWithHistory<LanguageConsoleView>' @ [86:5] ==> public constructor AbstractConsoleRunnerWithHistory<T : (LanguageConsoleView..LanguageConsoleView?)>(@NotNull p0: Project, @NotNull p1: String, @Nullable p2: String?) defined in com.intellij.execution.runners.AbstractConsoleRunnerWithHistory[JavaClassConstructorDescriptor]
Inferred types:
    <T : (LanguageConsoleView..LanguageConsoleView?)> -> LanguageConsoleView

'myProject' @ [86:59] ==> value-parameter myProject: Project defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.<init>[ValueParameterDescriptorImpl]

'title' @ [86:70] ==> value-parameter title: String defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.<init>[ValueParameterDescriptorImpl]

'path' @ [86:77] ==> value-parameter path: String? defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.<init>[ValueParameterDescriptorImpl]

'ReplState' @ [88:29] ==> public constructor ReplState() defined in org.jetbrains.kotlin.resolve.repl.ReplState[DeserializedClassConstructorDescriptor]

'CountDownLatch' @ [89:37] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'KotlinConsoleKeeper' @ [92:9] ==> public companion object defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[FakeCallableDescriptorForObject]

'getInstance' @ [92:29] ==> @JvmStatic public final fun getInstance(project: Project): (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.Companion[SimpleFunctionDescriptorImpl]

'project' @ [92:41] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'removeConsole' @ [92:50] ==> public final fun removeConsole(virtualFile: VirtualFile): KotlinConsoleRunner? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[SimpleFunctionDescriptorImpl]

'consoleView' @ [92:64] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'virtualFile' @ [92:76] ==> public final val LanguageConsoleView.virtualFile: VirtualFile[MyPropertyDescriptor]

'!!' @ [93:9] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinScriptDefinitionProvider?): KotlinScriptDefinitionProvider[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinScriptDefinitionProvider

'getInstance' @ [93:40] ==> @JvmStatic public final fun getInstance(project: Project): KotlinScriptDefinitionProvider? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [93:52] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'removeScriptDefinition' @ [93:63] ==> public final fun removeScriptDefinition(scriptDefinition: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'consoleScriptDefinition' @ [93:86] ==> private final val consoleScriptDefinition: <no name provided> defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'getApplication' @ [95:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [95:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'consoleTerminated' @ [96:13] ==> private final val consoleTerminated: CountDownLatch defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'countDown' @ [96:31] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'super' @ [101:9] ==> <this> defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[LazyClassReceiverParameterDescriptor]

'finishConsole' @ [101:15] ==> protected/*protected and package*/ open fun finishConsole(): Unit defined in com.intellij.execution.runners.AbstractConsoleRunnerWithHistory[JavaMethodDescriptor]

'CommandHistory' @ [104:26] ==> public constructor CommandHistory() defined in org.jetbrains.kotlin.console.CommandHistory[ClassConstructorDescriptorImpl]

'if (value)
                changeConsoleEditorIndicator(ReplIcons.EDITOR_READLINE_INDICATOR)
            else
                changeConsoleEditorIndicator(ReplIcons.EDITOR_INDICATOR)' @ [108:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [108:17] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.<set-isReadLineMode>[ValueParameterDescriptorImpl]

'changeConsoleEditorIndicator' @ [109:17] ==> public final fun changeConsoleEditorIndicator(newIconWithTooltip: IconWithTooltip): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'EDITOR_READLINE_INDICATOR' @ [109:56] ==> public final val EDITOR_READLINE_INDICATOR: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'changeConsoleEditorIndicator' @ [111:17] ==> public final fun changeConsoleEditorIndicator(newIconWithTooltip: IconWithTooltip): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'EDITOR_INDICATOR' @ [111:56] ==> public final val EDITOR_INDICATOR: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'field' @ [113:13] ==> var field: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.<set-isReadLineMode>[SyntheticFieldDescriptor]

'value' @ [113:21] ==> value-parameter value: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.<set-isReadLineMode>[ValueParameterDescriptorImpl]

'runWriteCommandAction' @ [116:96] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [116:118] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'consoleEditorHighlighter' @ [117:9] ==> private final var consoleEditorHighlighter: RangeHighlighter defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'gutterIconRenderer' @ [117:34] ==> public final var RangeHighlighter.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'ConsoleIndicatorRenderer' @ [117:55] ==> public constructor ConsoleIndicatorRenderer(iconWithTooltip: IconWithTooltip) defined in org.jetbrains.kotlin.console.gutter.ConsoleIndicatorRenderer[ClassConstructorDescriptorImpl]

'newIconWithTooltip' @ [117:80] ==> value-parameter newIconWithTooltip: IconWithTooltip defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.changeConsoleEditorIndicator[ValueParameterDescriptorImpl]

'Delegates' @ [120:45] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [120:55] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, RangeHighlighter> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> RangeHighlighter

'Delegates' @ [121:41] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [121:51] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, RunContentDescriptor> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> RunContentDescriptor

'CommandExecutor' @ [123:20] ==> public constructor CommandExecutor(runner: KotlinConsoleRunner) defined in org.jetbrains.kotlin.console.CommandExecutor[ClassConstructorDescriptorImpl]

'this' @ [123:36] ==> <this> defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[LazyClassReceiverParameterDescriptor]

'Delegates' @ [124:50] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [124:60] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, ConsoleCompilerHelper> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ConsoleCompilerHelper

'KotlinScriptDefinition' @ [126:52] ==> public constructor KotlinScriptDefinition(template: KClass<out Any>) defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedClassConstructorDescriptor]

'Any' @ [126:75] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'fileName' @ [129:20] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.consoleScriptDefinition.<no name provided>.isScript[ValueParameterDescriptorImpl]

'consoleView' @ [129:32] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'virtualFile' @ [129:44] ==> public final val LanguageConsoleView.virtualFile: VirtualFile[MyPropertyDescriptor]

'name' @ [129:56] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'identifier' @ [131:61] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'cmdLine' @ [134:36] ==> private final val cmdLine: GeneralCommandLine defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'createProcess' @ [134:44] ==> @NotNull public open fun createProcess(): Process defined in com.intellij.execution.configurations.GeneralCommandLine[JavaMethodDescriptor]

'LanguageConsoleBuilder' @ [137:23] ==> public constructor LanguageConsoleBuilder() defined in com.intellij.execution.console.LanguageConsoleBuilder[JavaClassConstructorDescriptor]

'builder' @ [139:27] ==> val builder: LanguageConsoleBuilder defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'gutterContentProvider' @ [139:35] ==> public open fun gutterContentProvider(@Nullable p0: GutterContentProvider?): (LanguageConsoleBuilder..LanguageConsoleBuilder?) defined in com.intellij.execution.console.LanguageConsoleBuilder[JavaMethodDescriptor]

'ConsoleGutterContentProvider' @ [139:57] ==> public constructor ConsoleGutterContentProvider() defined in org.jetbrains.kotlin.console.gutter.ConsoleGutterContentProvider[ClassConstructorDescriptorImpl]

'build' @ [139:89] ==> @NotNull public open fun build(@NotNull p0: Project, @NotNull p1: Language): LanguageConsoleView defined in com.intellij.execution.console.LanguageConsoleBuilder[JavaMethodDescriptor]

'project' @ [139:95] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'INSTANCE' @ [139:119] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'consoleView' @ [140:9] ==> val consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'virtualFile' @ [140:21] ==> public final val LanguageConsoleView.virtualFile: VirtualFile[MyPropertyDescriptor]

'putUserData' @ [140:33] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Boolean..Boolean?)>, @Nullable p1: Boolean?): Unit defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'KOTLIN_CONSOLE_KEY' @ [140:45] ==> public val KOTLIN_CONSOLE_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'consoleView' @ [143:9] ==> val consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'prompt' @ [143:21] ==> public final var LanguageConsoleView.prompt: String?[MyPropertyDescriptor]

'consoleView' @ [145:29] ==> val consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'consoleEditor' @ [145:41] ==> public final val LanguageConsoleView.consoleEditor: EditorEx[MyPropertyDescriptor]

'setupPlaceholder' @ [147:9] ==> private final fun setupPlaceholder(editor: EditorEx): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'consoleEditor' @ [147:26] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'HistoryKeyListener' @ [148:34] ==> public constructor HistoryKeyListener(project: Project, consoleEditor: EditorEx, history: CommandHistory) defined in org.jetbrains.kotlin.console.HistoryKeyListener[ClassConstructorDescriptorImpl]

'module' @ [148:53] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'project' @ [148:60] ==> public final val Module.project: Project[MyPropertyDescriptor]

'consoleEditor' @ [148:69] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'commandHistory' @ [148:84] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'consoleEditor' @ [149:9] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'contentComponent' @ [149:23] ==> public final val EditorEx.contentComponent: JComponent[MyPropertyDescriptor]

'addKeyListener' @ [149:40] ==> public open fun addKeyListener(p0: (KeyListener..KeyListener?)): Unit defined in javax.swing.JComponent[JavaMethodDescriptor]

'historyKeyListener' @ [149:55] ==> val historyKeyListener: HistoryKeyListener defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'commandHistory' @ [150:9] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'listeners' @ [150:24] ==> public final val listeners: ArrayList<HistoryUpdateListener> /* = ArrayList<HistoryUpdateListener> */ defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'add' @ [150:34] ==> public open fun add(element: HistoryUpdateListener): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'historyKeyListener' @ [150:38] ==> val historyKeyListener: HistoryKeyListener defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'KtExecuteCommandAction' @ [152:29] ==> public constructor KtExecuteCommandAction(consoleFile: VirtualFile) defined in org.jetbrains.kotlin.console.actions.KtExecuteCommandAction[ClassConstructorDescriptorImpl]

'consoleView' @ [152:52] ==> val consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'virtualFile' @ [152:64] ==> public final val LanguageConsoleView.virtualFile: VirtualFile[MyPropertyDescriptor]

'executeAction' @ [153:9] ==> val executeAction: KtExecuteCommandAction defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'registerCustomShortcutSet' @ [153:23] ==> public final fun registerCustomShortcutSet(@NotNull p0: ShortcutSet, @Nullable p1: JComponent?): Unit defined in org.jetbrains.kotlin.console.actions.KtExecuteCommandAction[JavaMethodDescriptor]

'CTRL_ENTER' @ [153:65] ==> public final val CTRL_ENTER: (ShortcutSet..ShortcutSet?) defined in com.intellij.openapi.actionSystem.CommonShortcuts[JavaPropertyDescriptor]

'consoleView' @ [153:77] ==> val consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'consoleEditor' @ [153:89] ==> public final val LanguageConsoleView.consoleEditor: EditorEx[MyPropertyDescriptor]

'component' @ [153:103] ==> public final val EditorEx.component: JComponent[MyPropertyDescriptor]

'!!' @ [155:9] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinScriptDefinitionProvider?): KotlinScriptDefinitionProvider[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinScriptDefinitionProvider

'getInstance' @ [155:40] ==> @JvmStatic public final fun getInstance(project: Project): KotlinScriptDefinitionProvider? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [155:52] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'addScriptDefinition' @ [155:63] ==> public final fun addScriptDefinition(scriptDefinition: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'consoleScriptDefinition' @ [155:83] ==> private final val consoleScriptDefinition: <no name provided> defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'enableCompletion' @ [156:9] ==> private final fun enableCompletion(consoleView: LanguageConsoleView): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'consoleView' @ [156:26] ==> val consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'consoleView' @ [158:16] ==> val consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleView[LocalVariableDescriptor]

'?:' @ [162:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFile?, right: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFile

'getInstance' @ [162:40] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [162:52] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'findFile' @ [162:61] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'consoleView' @ [162:70] ==> value-parameter consoleView: LanguageConsoleView defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.enableCompletion[ValueParameterDescriptorImpl]

'virtualFile' @ [162:82] ==> public final val LanguageConsoleView.virtualFile: VirtualFile[MyPropertyDescriptor]

'consoleKtFile' @ [163:9] ==> val consoleKtFile: KtFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.enableCompletion[LocalVariableDescriptor]

'moduleInfo' @ [163:23] ==> public var PsiFile.moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'ModuleTestSourceInfo' @ [163:36] ==> public constructor ModuleTestSourceInfo(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[DeserializedClassConstructorDescriptor]

'module' @ [163:57] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'ReplOutputHandler' @ [167:30] ==> public constructor ReplOutputHandler(runner: KotlinConsoleRunner, process: Process, commandLine: String) defined in org.jetbrains.kotlin.console.ReplOutputHandler[ClassConstructorDescriptorImpl]

'this' @ [168:17] ==> <this> defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[LazyClassReceiverParameterDescriptor]

'process' @ [169:17] ==> value-parameter process: Process defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createProcessHandler[ValueParameterDescriptorImpl]

'cmdLine' @ [170:17] ==> private final val cmdLine: GeneralCommandLine defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'commandLineString' @ [170:25] ==> public final val GeneralCommandLine.commandLineString: String[MyPropertyDescriptor]

'consoleView' @ [172:27] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'virtualFile' @ [172:39] ==> public final val LanguageConsoleView.virtualFile: VirtualFile[MyPropertyDescriptor]

'KotlinConsoleKeeper' @ [173:22] ==> public companion object defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[FakeCallableDescriptorForObject]

'getInstance' @ [173:42] ==> @JvmStatic public final fun getInstance(project: Project): (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.Companion[SimpleFunctionDescriptorImpl]

'project' @ [173:54] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'keeper' @ [175:9] ==> val keeper: (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createProcessHandler[LocalVariableDescriptor]

'putVirtualFileToConsole' @ [175:16] ==> public final fun putVirtualFileToConsole(virtualFile: VirtualFile, console: KotlinConsoleRunner): KotlinConsoleRunner? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[SimpleFunctionDescriptorImpl]

'consoleFile' @ [175:40] ==> val consoleFile: VirtualFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createProcessHandler[LocalVariableDescriptor]

'this' @ [175:53] ==> <this> defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[LazyClassReceiverParameterDescriptor]

'processHandler' @ [177:16] ==> val processHandler: ReplOutputHandler defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createProcessHandler[LocalVariableDescriptor]

'ProcessBackedConsoleExecuteActionHandler' @ [180:58] ==> public constructor ProcessBackedConsoleExecuteActionHandler(p0: (ProcessHandler..ProcessHandler?), p1: Boolean) defined in com.intellij.execution.console.ProcessBackedConsoleExecuteActionHandler[JavaClassConstructorDescriptor]

'processHandler' @ [180:99] ==> public final val KotlinConsoleRunner.processHandler: (ProcessHandler..ProcessHandler?)[MyPropertyDescriptor]

'executor' @ [181:75] ==> public final val executor: CommandExecutor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'executeCommand' @ [181:84] ==> public final fun executeCommand(): Unit defined in org.jetbrains.kotlin.console.CommandExecutor[SimpleFunctionDescriptorImpl]

'disposableDescriptor' @ [188:9] ==> private final var disposableDescriptor: RunContentDescriptor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'contentDescriptor' @ [188:32] ==> value-parameter contentDescriptor: RunContentDescriptor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[ValueParameterDescriptorImpl]

'compilerHelper' @ [189:9] ==> public final var compilerHelper: ConsoleCompilerHelper defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'ConsoleCompilerHelper' @ [189:26] ==> public constructor ConsoleCompilerHelper(project: Project, module: Module, executor: Executor, contentDescriptor: RunContentDescriptor) defined in org.jetbrains.kotlin.console.ConsoleCompilerHelper[ClassConstructorDescriptorImpl]

'project' @ [189:48] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'module' @ [189:57] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'defaultExecutor' @ [189:65] ==> value-parameter defaultExecutor: Executor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[ValueParameterDescriptorImpl]

'contentDescriptor' @ [189:82] ==> value-parameter contentDescriptor: RunContentDescriptor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[ValueParameterDescriptorImpl]

'arrayListOf' @ [191:26] ==> public fun <T> arrayListOf(vararg elements: AnAction): ArrayList<AnAction> /* = ArrayList<AnAction> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnAction

'BuildAndRestartConsoleAction' @ [192:17] ==> public constructor BuildAndRestartConsoleAction(runner: KotlinConsoleRunner) defined in org.jetbrains.kotlin.console.actions.BuildAndRestartConsoleAction[ClassConstructorDescriptorImpl]

'this' @ [192:46] ==> <this> defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[LazyClassReceiverParameterDescriptor]

'createConsoleExecAction' @ [193:17] ==> protected open fun createConsoleExecAction(consoleExecuteActionHandler: ProcessBackedConsoleExecuteActionHandler): ConsoleExecuteAction defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'consoleExecuteActionHandler' @ [193:41] ==> public final val KotlinConsoleRunner.consoleExecuteActionHandler: (ProcessBackedConsoleExecuteActionHandler..ProcessBackedConsoleExecuteActionHandler?)[MyPropertyDescriptor]

'createCloseAction' @ [194:17] ==> protected/*protected and package*/ open fun createCloseAction(p0: (Executor..Executor?), p1: (RunContentDescriptor..RunContentDescriptor?)): (AnAction..AnAction?) defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[JavaMethodDescriptor]

'defaultExecutor' @ [194:35] ==> value-parameter defaultExecutor: Executor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[ValueParameterDescriptorImpl]

'contentDescriptor' @ [194:52] ==> value-parameter contentDescriptor: RunContentDescriptor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[ValueParameterDescriptorImpl]

'toolbarActions' @ [196:9] ==> value-parameter toolbarActions: DefaultActionGroup defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[ValueParameterDescriptorImpl]

'addAll' @ [196:24] ==> public final fun addAll(p0: (MutableCollection<out (AnAction..AnAction?)>..Collection<(AnAction..AnAction?)>?)): Unit defined in com.intellij.openapi.actionSystem.DefaultActionGroup[JavaMethodDescriptor]

'actionList' @ [196:31] ==> val actionList: ArrayList<AnAction> /* = ArrayList<AnAction> */ defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[LocalVariableDescriptor]

'actionList' @ [197:16] ==> val actionList: ArrayList<AnAction> /* = ArrayList<AnAction> */ defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.fillToolBarActions[LocalVariableDescriptor]

'ConsoleExecuteAction' @ [201:15] ==> public constructor ConsoleExecuteAction(@NotNull p0: LanguageConsoleView, @NotNull p1: ConsoleExecuteAction.ConsoleExecuteActionHandler, @NotNull p2: String, @Nullable p3: Condition<(LanguageConsoleView..LanguageConsoleView?)>?) defined in com.intellij.execution.console.ConsoleExecuteAction[JavaClassConstructorDescriptor]

'consoleView' @ [201:36] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'consoleExecuteActionHandler' @ [201:49] ==> value-parameter consoleExecuteActionHandler: ProcessBackedConsoleExecuteActionHandler defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleExecAction[ValueParameterDescriptorImpl]

'KOTLIN_SHELL_EXECUTE_ACTION_ID' @ [201:78] ==> private val KOTLIN_SHELL_EXECUTE_ACTION_ID: String defined in org.jetbrains.kotlin.console in file KotlinConsoleRunner.kt[PropertyDescriptorImpl]

'consoleExecuteActionHandler' @ [201:110] ==> value-parameter consoleExecuteActionHandler: ProcessBackedConsoleExecuteActionHandler defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.createConsoleExecAction[ValueParameterDescriptorImpl]

'title' @ [203:59] ==> value-parameter title: String defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.constructConsoleTitle[ValueParameterDescriptorImpl]

'module' @ [203:78] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'name' @ [203:85] ==> public final val Module.name: String[MyPropertyDescriptor]

'getInstance' @ [206:50] ==> public open fun getInstance(): (ActionManager..ActionManager?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'getAction' @ [206:64] ==> public abstract fun getAction(@NonNls @NotNull p0: String): (AnAction..AnAction?) defined in com.intellij.openapi.actionSystem.ActionManager[JavaMethodDescriptor]

'KOTLIN_SHELL_EXECUTE_ACTION_ID' @ [206:74] ==> private val KOTLIN_SHELL_EXECUTE_ACTION_ID: String defined in org.jetbrains.kotlin.console in file KotlinConsoleRunner.kt[PropertyDescriptorImpl]

'getFirstKeyboardShortcutText' @ [207:59] ==> @NotNull public open fun getFirstKeyboardShortcutText(@NotNull p0: AnAction): String defined in com.intellij.openapi.keymap.KeymapUtil[JavaMethodDescriptor]

'executeCommandAction' @ [207:88] ==> val executeCommandAction: (AnAction..AnAction?) defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[LocalVariableDescriptor]

'editor' @ [209:9] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[ValueParameterDescriptorImpl]

'setPlaceholder' @ [209:16] ==> public abstract fun setPlaceholder(@Nullable p0: CharSequence?): Unit defined in com.intellij.openapi.editor.ex.EditorEx[JavaMethodDescriptor]

'executeCommandActionShortcutText' @ [209:34] ==> val executeCommandActionShortcutText: String defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[LocalVariableDescriptor]

'editor' @ [210:9] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[ValueParameterDescriptorImpl]

'setShowPlaceholderWhenFocused' @ [210:16] ==> public abstract fun setShowPlaceholderWhenFocused(p0: Boolean): Unit defined in com.intellij.openapi.editor.ex.EditorEx[JavaMethodDescriptor]

'TextAttributes' @ [212:32] ==> public constructor TextAttributes() defined in com.intellij.openapi.editor.markup.TextAttributes[JavaClassConstructorDescriptor]

'placeholderAttrs' @ [213:9] ==> val placeholderAttrs: TextAttributes defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[LocalVariableDescriptor]

'foregroundColor' @ [213:26] ==> public final var TextAttributes.foregroundColor: (Color..Color?)[MyPropertyDescriptor]

'ReplColors' @ [213:44] ==> public object ReplColors defined in org.jetbrains.kotlin.console in file ReplColors.kt[FakeCallableDescriptorForObject]

'PLACEHOLDER_COLOR' @ [213:55] ==> public final val PLACEHOLDER_COLOR: JBColor defined in org.jetbrains.kotlin.console.ReplColors[PropertyDescriptorImpl]

'placeholderAttrs' @ [214:9] ==> val placeholderAttrs: TextAttributes defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[LocalVariableDescriptor]

'fontType' @ [214:26] ==> public final var TextAttributes.fontType: Int[MyPropertyDescriptor]

'ITALIC' @ [214:42] ==> public const final val ITALIC: Int defined in java.awt.Font[JavaPropertyDescriptor]

'editor' @ [215:9] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[ValueParameterDescriptorImpl]

'setPlaceholderAttributes' @ [215:16] ==> public abstract fun setPlaceholderAttributes(@Nullable p0: TextAttributes?): Unit defined in com.intellij.openapi.editor.ex.EditorEx[JavaMethodDescriptor]

'placeholderAttrs' @ [215:41] ==> val placeholderAttrs: TextAttributes defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupPlaceholder[LocalVariableDescriptor]

'editor' @ [220:13] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'settings' @ [220:20] ==> public final val EditorEx.settings: EditorSettings[MyPropertyDescriptor]

'isLineMarkerAreaShown' @ [220:29] ==> public final var EditorSettings.isLineMarkerAreaShown: Boolean[MyPropertyDescriptor]

'editor' @ [221:13] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'settings' @ [221:20] ==> public final val EditorEx.settings: EditorSettings[MyPropertyDescriptor]

'isFoldingOutlineShown' @ [221:29] ==> public final var EditorSettings.isFoldingOutlineShown: Boolean[MyPropertyDescriptor]

'editor' @ [222:13] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'gutterComponentEx' @ [222:20] ==> public final val EditorEx.gutterComponentEx: EditorGutterComponentEx[MyPropertyDescriptor]

'setPaintBackground' @ [222:38] ==> public abstract fun setPaintBackground(p0: Boolean): Unit defined in com.intellij.openapi.editor.ex.EditorGutterComponentEx[JavaMethodDescriptor]

'editor' @ [223:37] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'colorsScheme' @ [223:44] ==> public final var EditorEx.colorsScheme: EditorColorsScheme[MyPropertyDescriptor]

'editorColorScheme' @ [224:13] ==> val editorColorScheme: EditorColorsScheme defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[LocalVariableDescriptor]

'setColor' @ [224:31] ==> public abstract fun setColor(p0: (ColorKey..ColorKey?), p1: (Color..Color?)): Unit defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'GUTTER_BACKGROUND' @ [224:53] ==> public final val GUTTER_BACKGROUND: (ColorKey..ColorKey?) defined in com.intellij.openapi.editor.colors.EditorColors[JavaPropertyDescriptor]

'color' @ [224:72] ==> value-parameter color: Color defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'editor' @ [225:13] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'colorsScheme' @ [225:20] ==> public final var EditorEx.colorsScheme: EditorColorsScheme[MyPropertyDescriptor]

'editorColorScheme' @ [225:35] ==> val editorColorScheme: EditorColorsScheme defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[LocalVariableDescriptor]

'addGutterIndicator' @ [227:20] ==> public final fun addGutterIndicator(editor: EditorEx, iconWithTooltip: IconWithTooltip): RangeHighlighter defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'editor' @ [227:39] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'iconWithTooltip' @ [227:47] ==> value-parameter iconWithTooltip: IconWithTooltip defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters.configureEditorGutter[ValueParameterDescriptorImpl]

'consoleView' @ [230:29] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'historyViewer' @ [230:41] ==> public final val LanguageConsoleView.historyViewer: EditorEx[MyPropertyDescriptor]

'consoleView' @ [231:29] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'consoleEditor' @ [231:41] ==> public final val LanguageConsoleView.consoleEditor: EditorEx[MyPropertyDescriptor]

'configureEditorGutter' @ [233:9] ==> local final fun configureEditorGutter(editor: EditorEx, color: Color, iconWithTooltip: IconWithTooltip): RangeHighlighter defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[SimpleFunctionDescriptorImpl]

'historyEditor' @ [233:31] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[LocalVariableDescriptor]

'HISTORY_GUTTER_COLOR' @ [233:57] ==> public final val HISTORY_GUTTER_COLOR: JBColor defined in org.jetbrains.kotlin.console.ReplColors[PropertyDescriptorImpl]

'HISTORY_INDICATOR' @ [233:89] ==> public final val HISTORY_INDICATOR: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'consoleEditorHighlighter' @ [234:9] ==> private final var consoleEditorHighlighter: RangeHighlighter defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'configureEditorGutter' @ [234:36] ==> local final fun configureEditorGutter(editor: EditorEx, color: Color, iconWithTooltip: IconWithTooltip): RangeHighlighter defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[SimpleFunctionDescriptorImpl]

'consoleEditor' @ [234:58] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[LocalVariableDescriptor]

'EDITOR_GUTTER_COLOR' @ [234:84] ==> public final val EDITOR_GUTTER_COLOR: JBColor defined in org.jetbrains.kotlin.console.ReplColors[PropertyDescriptorImpl]

'EDITOR_INDICATOR' @ [234:115] ==> public final val EDITOR_INDICATOR: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'historyEditor' @ [236:9] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[LocalVariableDescriptor]

'settings' @ [236:23] ==> public final val EditorEx.settings: EditorSettings[MyPropertyDescriptor]

'isUseSoftWraps' @ [236:32] ==> public final var EditorSettings.isUseSoftWraps: Boolean[MyPropertyDescriptor]

'historyEditor' @ [237:9] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[LocalVariableDescriptor]

'settings' @ [237:23] ==> public final val EditorEx.settings: EditorSettings[MyPropertyDescriptor]

'additionalLinesCount' @ [237:32] ==> public final var EditorSettings.additionalLinesCount: Int[MyPropertyDescriptor]

'consoleEditor' @ [239:9] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[LocalVariableDescriptor]

'settings' @ [239:23] ==> public final val EditorEx.settings: EditorSettings[MyPropertyDescriptor]

'isCaretRowShown' @ [239:32] ==> public final var EditorSettings.isCaretRowShown: Boolean[MyPropertyDescriptor]

'consoleEditor' @ [240:9] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.setupGutters[LocalVariableDescriptor]

'settings' @ [240:23] ==> public final val EditorEx.settings: EditorSettings[MyPropertyDescriptor]

'additionalLinesCount' @ [240:32] ==> public final var EditorSettings.additionalLinesCount: Int[MyPropertyDescriptor]

'ConsoleIndicatorRenderer' @ [244:25] ==> public constructor ConsoleIndicatorRenderer(iconWithTooltip: IconWithTooltip) defined in org.jetbrains.kotlin.console.gutter.ConsoleIndicatorRenderer[ClassConstructorDescriptorImpl]

'iconWithTooltip' @ [244:50] ==> value-parameter iconWithTooltip: IconWithTooltip defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.addGutterIndicator[ValueParameterDescriptorImpl]

'editor' @ [245:28] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.addGutterIndicator[ValueParameterDescriptorImpl]

'markupModel' @ [245:35] ==> public final val EditorEx.markupModel: MarkupModelEx[MyPropertyDescriptor]

'editorMarkup' @ [246:36] ==> val editorMarkup: MarkupModelEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.addGutterIndicator[LocalVariableDescriptor]

'addRangeHighlighter' @ [246:49] ==> @NotNull public abstract fun addRangeHighlighter(p0: Int, p1: Int, p2: Int, @Nullable p3: TextAttributes?, @NotNull p4: HighlighterTargetArea): RangeHighlighter defined in com.intellij.openapi.editor.ex.MarkupModelEx[JavaMethodDescriptor]

'editor' @ [247:20] ==> value-parameter editor: EditorEx defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.addGutterIndicator[ValueParameterDescriptorImpl]

'document' @ [247:27] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'textLength' @ [247:36] ==> public final val DocumentEx.textLength: Int[MyPropertyDescriptor]

'LAST' @ [247:65] ==> public const final val LAST: Int defined in com.intellij.openapi.editor.markup.HighlighterLayer[JavaPropertyDescriptor]

'LINES_IN_RANGE' @ [247:99] ==> enum entry LINES_IN_RANGE defined in com.intellij.openapi.editor.markup.HighlighterTargetArea[FakeCallableDescriptorForObject]

'indicatorHighlighter' @ [250:16] ==> val indicatorHighlighter: RangeHighlighter defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.addGutterIndicator[LocalVariableDescriptor]

'apply' @ [250:37] ==> @InlineOnly public inline fun <T> RangeHighlighter.apply(block: (RangeHighlighter).() -> Unit): RangeHighlighter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter

'gutterIconRenderer' @ [250:45] ==> public final var RangeHighlighter.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'indicator' @ [250:66] ==> val indicator: ConsoleIndicatorRenderer defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.addGutterIndicator[LocalVariableDescriptor]

'TestOnly' @ [253:5] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'processHandler' @ [254:9] ==> public final val KotlinConsoleRunner.processHandler: (ProcessHandler..ProcessHandler?)[MyPropertyDescriptor]

'destroyProcess' @ [254:24] ==> public open fun destroyProcess(): Unit defined in com.intellij.execution.process.ProcessHandler[JavaMethodDescriptor]

'consoleTerminated' @ [255:9] ==> private final val consoleTerminated: CountDownLatch defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'await' @ [255:27] ==> public open fun await(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'SECONDS' @ [255:45] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'dispose' @ [256:18] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'disposableDescriptor' @ [256:26] ==> private final var disposableDescriptor: RunContentDescriptor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'runReadAction' @ [260:9] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'replState' @ [261:30] ==> private final val replState: ReplState defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'successfulLinesCount' @ [261:40] ==> public final val successfulLinesCount: Int defined in org.jetbrains.kotlin.resolve.repl.ReplState[DeserializedPropertyDescriptor]

'LightVirtualFile' @ [263:21] ==> public constructor LightVirtualFile(@NotNull p0: String, p1: (Language..Language?), @NotNull p2: CharSequence) defined in com.intellij.testFramework.LightVirtualFile[JavaClassConstructorDescriptor]

'lineNumber' @ [263:44] ==> val lineNumber: Int defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'KotlinParserDefinition' @ [263:56] ==> public companion object defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition[FakeCallableDescriptorForObject]

'STD_SCRIPT_EXT' @ [263:79] ==> @field:JvmField public final val STD_SCRIPT_EXT: String defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.Companion[DeserializedPropertyDescriptor]

'INSTANCE' @ [263:112] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'text' @ [263:122] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine[ValueParameterDescriptorImpl]

'apply' @ [263:128] ==> @InlineOnly public inline fun <T> LightVirtualFile.apply(block: LightVirtualFile.() -> Unit): LightVirtualFile defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LightVirtualFile

'charset' @ [264:25] ==> public final var LightVirtualFile.charset: Charset[MyPropertyDescriptor]

'UTF8_CHARSET' @ [264:50] ==> public final val UTF8_CHARSET: (Charset..Charset?) defined in com.intellij.openapi.vfs.CharsetToolkit[JavaPropertyDescriptor]

'isWritable' @ [265:25] ==> public final var LightVirtualFile.isWritable: Boolean[MyPropertyDescriptor]

'?:' @ [267:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFile?, right: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFile

'getInstance' @ [267:43] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'project' @ [267:55] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'trySetupPsiForFile' @ [267:87] ==> @Nullable public open fun trySetupPsiForFile(@NotNull p0: LightVirtualFile, @NotNull p1: Language, p2: Boolean, p3: Boolean): PsiFile? defined in com.intellij.psi.impl.PsiFileFactoryImpl[JavaMethodDescriptor]

'virtualFile' @ [267:106] ==> val virtualFile: LightVirtualFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'INSTANCE' @ [267:134] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'error' @ [268:30] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'text' @ [268:69] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine[ValueParameterDescriptorImpl]

'replState' @ [270:13] ==> private final val replState: ReplState defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'submitLine' @ [270:23] ==> public final fun submitLine(ktFile: KtFile): Unit defined in org.jetbrains.kotlin.resolve.repl.ReplState[DeserializedSimpleFunctionDescriptor]

'psiFile' @ [270:34] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'psiFile' @ [271:13] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'moduleInfo' @ [271:21] ==> public var PsiFile.moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.psi[DeserializedPropertyDescriptor]

'ModuleTestSourceInfo' @ [271:34] ==> public constructor ModuleTestSourceInfo(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[DeserializedClassConstructorDescriptor]

'module' @ [271:55] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'psiFile' @ [272:36] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'script' @ [272:44] ==> public final val KtFile.script: KtScript?[MyPropertyDescriptor]

'resolveToDescriptor' @ [272:53] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'error' @ [272:103] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'text' @ [272:136] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine[ValueParameterDescriptorImpl]

'forceResolveAllContents' @ [273:30] ==> public open fun <T : (Any..Any?)> forceResolveAllContents(@NotNull p0: LazyScriptDescriptor): (LazyScriptDescriptor..LazyScriptDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.ForceResolveUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LazyScriptDescriptor

'scriptDescriptor' @ [273:54] ==> val scriptDescriptor: LazyScriptDescriptor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'replState' @ [274:13] ==> private final val replState: ReplState defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'lineSuccess' @ [274:23] ==> public final fun lineSuccess(ktFile: KtFile, scriptDescriptor: LazyScriptDescriptor): Unit defined in org.jetbrains.kotlin.resolve.repl.ReplState[DeserializedSimpleFunctionDescriptor]

'psiFile' @ [274:35] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'scriptDescriptor' @ [274:44] ==> val scriptDescriptor: LazyScriptDescriptor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.successfulLine.<anonymous>[LocalVariableDescriptor]

'replState' @ [276:13] ==> private final val replState: ReplState defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'submitLine' @ [276:23] ==> public final fun submitLine(ktFile: KtFile): Unit defined in org.jetbrains.kotlin.resolve.repl.ReplState[DeserializedSimpleFunctionDescriptor]

'consoleFile' @ [276:34] ==> public final val consoleFile: KtFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'consoleView' @ [282:31] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'virtualFile' @ [282:43] ==> public final val LanguageConsoleView.virtualFile: VirtualFile[MyPropertyDescriptor]

'getInstance' @ [283:31] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [283:43] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'findFile' @ [283:52] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'consoleFile' @ [283:61] ==> val consoleFile: VirtualFile defined in org.jetbrains.kotlin.console.KotlinConsoleRunner.<get-consoleFile>[LocalVariableDescriptor]

