'runner' @ [42:27] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'project' @ [42:34] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'runner' @ [43:31] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'consoleView' @ [43:38] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'consoleView' @ [44:33] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'historyViewer' @ [44:45] ==> public final val LanguageConsoleImpl.historyViewer: EditorEx[MyPropertyDescriptor]

'historyEditor' @ [45:35] ==> private final val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'document' @ [45:49] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'historyEditor' @ [46:33] ==> private final val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'markupModel' @ [46:47] ==> public final val EditorEx.markupModel: MarkupModelEx[MyPropertyDescriptor]

'consoleView' @ [49:9] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'flushDeferredText' @ [49:21] ==> public open fun flushDeferredText(): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'historyDocument' @ [50:22] ==> private final val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'textLength' @ [50:38] ==> public final val DocumentEx.textLength: Int[MyPropertyDescriptor]

'oldLen' @ [51:22] ==> val oldLen: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.textOffsets[LocalVariableDescriptor]

'text' @ [51:31] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.textOffsets[ValueParameterDescriptorImpl]

'length' @ [51:36] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'Pair' @ [53:16] ==> public constructor Pair<out A, out B>(first: Int, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> Int

'oldLen' @ [53:21] ==> val oldLen: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.textOffsets[LocalVariableDescriptor]

'newLen' @ [53:29] ==> val newLen: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.textOffsets[LocalVariableDescriptor]

'component1' @ [57:14] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [57:27] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'textOffsets' @ [57:40] ==> private final fun textOffsets(text: String): Pair<Int, Int> defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'output' @ [57:52] ==> value-parameter output: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printOutput[ValueParameterDescriptorImpl]

'consoleView' @ [59:9] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'print' @ [59:21] ==> public open fun print(@NotNull p0: String, @NotNull p1: ConsoleViewContentType): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'output' @ [59:27] ==> value-parameter output: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printOutput[ValueParameterDescriptorImpl]

'contentType' @ [59:35] ==> value-parameter contentType: ConsoleViewContentType defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printOutput[ValueParameterDescriptorImpl]

'consoleView' @ [60:9] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'flushDeferredText' @ [60:21] ==> public open fun flushDeferredText(): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'iconWithTooltip' @ [62:13] ==> value-parameter iconWithTooltip: IconWithTooltip? = ... defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printOutput[ValueParameterDescriptorImpl]

'historyMarkup' @ [64:9] ==> private final val historyMarkup: MarkupModelEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'addRangeHighlighter' @ [64:23] ==> @NotNull public abstract fun addRangeHighlighter(p0: Int, p1: Int, p2: Int, @Nullable p3: TextAttributes?, @NotNull p4: HighlighterTargetArea): RangeHighlighter defined in com.intellij.openapi.editor.ex.MarkupModelEx[JavaMethodDescriptor]

'startOffset' @ [65:17] ==> val startOffset: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printOutput[LocalVariableDescriptor]

'endOffset' @ [65:30] ==> val endOffset: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printOutput[LocalVariableDescriptor]

'LAST' @ [65:58] ==> public const final val LAST: Int defined in com.intellij.openapi.editor.markup.HighlighterLayer[JavaPropertyDescriptor]

'EXACT_RANGE' @ [65:92] ==> enum entry EXACT_RANGE defined in com.intellij.openapi.editor.markup.HighlighterTargetArea[FakeCallableDescriptorForObject]

'apply' @ [66:11] ==> @InlineOnly public inline fun <T> RangeHighlighter.apply(block: (RangeHighlighter).() -> Unit): RangeHighlighter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter

'gutterIconRenderer' @ [66:19] ==> public final var RangeHighlighter.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'ConsoleIndicatorRenderer' @ [66:40] ==> public constructor ConsoleIndicatorRenderer(iconWithTooltip: IconWithTooltip) defined in org.jetbrains.kotlin.console.gutter.ConsoleIndicatorRenderer[ClassConstructorDescriptorImpl]

'iconWithTooltip' @ [66:65] ==> value-parameter iconWithTooltip: IconWithTooltip? = ... defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printOutput[ValueParameterDescriptorImpl]

'runWriteCommandAction' @ [69:100] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [69:122] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'printOutput' @ [70:9] ==> private final fun printOutput(output: String, contentType: ConsoleViewContentType, iconWithTooltip: IconWithTooltip? = ...): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'NORMAL_OUTPUT' @ [70:50] ==> public final val NORMAL_OUTPUT: (ConsoleViewContentType..ConsoleViewContentType?) defined in com.intellij.execution.ui.ConsoleViewContentType[JavaPropertyDescriptor]

'printOutput' @ [72:9] ==> private final fun printOutput(output: String, contentType: ConsoleViewContentType, iconWithTooltip: IconWithTooltip? = ...): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'message' @ [72:21] ==> value-parameter message: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printWarningMessage[ValueParameterDescriptorImpl]

'WARNING_INFO_CONTENT_TYPE' @ [72:41] ==> public final val WARNING_INFO_CONTENT_TYPE: ConsoleViewContentType defined in org.jetbrains.kotlin.console.ReplColors[PropertyDescriptorImpl]

'BUILD_WARNING_INDICATOR' @ [72:78] ==> public final val BUILD_WARNING_INDICATOR: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'isAddHyperlink' @ [74:13] ==> value-parameter isAddHyperlink: Boolean defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printWarningMessage[ValueParameterDescriptorImpl]

'consoleView' @ [75:13] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'printHyperlink' @ [75:25] ==> public final fun printHyperlink(@NotNull p0: String, @Nullable p1: (((Project..Project?)) -> Unit)?): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[MyFunctionDescriptor]

'runner' @ [75:57] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'module' @ [75:64] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'name' @ [75:71] ==> public final val Module.name: String[MyPropertyDescriptor]

'runner' @ [76:17] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'compilerHelper' @ [76:24] ==> public final var compilerHelper: ConsoleCompilerHelper defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'compileModule' @ [76:39] ==> public final fun compileModule(): Unit defined in org.jetbrains.kotlin.console.ConsoleCompilerHelper[SimpleFunctionDescriptorImpl]

'printOutput' @ [80:9] ==> private final fun printOutput(output: String, contentType: ConsoleViewContentType, iconWithTooltip: IconWithTooltip? = ...): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'NORMAL_OUTPUT' @ [80:52] ==> public final val NORMAL_OUTPUT: (ConsoleViewContentType..ConsoleViewContentType?) defined in com.intellij.execution.ui.ConsoleViewContentType[JavaPropertyDescriptor]

'getApplication' @ [84:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [84:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'runner' @ [85:13] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'previousCompilationFailed' @ [85:20] ==> internal final val previousCompilationFailed: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'printWarningMessage' @ [85:54] ==> private final fun printWarningMessage(message: String, isAddHyperlink: Boolean): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'runner' @ [85:117] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'module' @ [85:124] ==> public final val module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'name' @ [85:131] ==> public final val Module.name: String[MyPropertyDescriptor]

'runner' @ [86:13] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'compilerHelper' @ [86:20] ==> public final var compilerHelper: ConsoleCompilerHelper defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'moduleIsUpToDate' @ [86:35] ==> public final fun moduleIsUpToDate(): Boolean defined in org.jetbrains.kotlin.console.ConsoleCompilerHelper[SimpleFunctionDescriptorImpl]

'printWarningMessage' @ [89:9] ==> private final fun printWarningMessage(message: String, isAddHyperlink: Boolean): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'compilerWarningMessage' @ [89:29] ==> val compilerWarningMessage: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printBuildInfoWarningIfNeeded[LocalVariableDescriptor]

'consoleView' @ [92:47] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'print' @ [92:59] ==> public open fun print(@NotNull p0: String, @NotNull p1: ConsoleViewContentType): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'command' @ [92:65] ==> value-parameter command: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printInitialPrompt[ValueParameterDescriptorImpl]

'INITIAL_PROMPT_CONTENT_TYPE' @ [92:85] ==> public final val INITIAL_PROMPT_CONTENT_TYPE: ConsoleViewContentType defined in org.jetbrains.kotlin.console.ReplColors[PropertyDescriptorImpl]

'runWriteCommandAction' @ [94:54] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [94:76] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'printOutput' @ [95:9] ==> private final fun printOutput(output: String, contentType: ConsoleViewContentType, iconWithTooltip: IconWithTooltip? = ...): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'help' @ [95:21] ==> value-parameter help: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printHelp[ValueParameterDescriptorImpl]

'SYSTEM_OUTPUT' @ [95:50] ==> public final val SYSTEM_OUTPUT: (ConsoleViewContentType..ConsoleViewContentType?) defined in com.intellij.execution.ui.ConsoleViewContentType[JavaPropertyDescriptor]

'SYSTEM_HELP' @ [95:75] ==> public final val SYSTEM_HELP: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'runWriteCommandAction' @ [98:63] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [98:85] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'consoleView' @ [99:9] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'print' @ [99:21] ==> public open fun print(@NotNull p0: String, @NotNull p1: ConsoleViewContentType): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'command' @ [99:27] ==> value-parameter command: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printUserOutput[ValueParameterDescriptorImpl]

'USER_OUTPUT_CONTENT_TYPE' @ [99:47] ==> public final val USER_OUTPUT_CONTENT_TYPE: ConsoleViewContentType defined in org.jetbrains.kotlin.console.ReplColors[PropertyDescriptorImpl]

'runWriteCommandAction' @ [102:72] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [102:94] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'printOutput' @ [103:9] ==> private final fun printOutput(output: String, contentType: ConsoleViewContentType, iconWithTooltip: IconWithTooltip? = ...): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'result' @ [103:21] ==> value-parameter result: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printResultWithGutterIcon[ValueParameterDescriptorImpl]

'NORMAL_OUTPUT' @ [103:52] ==> public final val NORMAL_OUTPUT: (ConsoleViewContentType..ConsoleViewContentType?) defined in com.intellij.execution.ui.ConsoleViewContentType[JavaPropertyDescriptor]

'RESULT' @ [103:77] ==> public final val RESULT: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'runWriteCommandAction' @ [106:95] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [106:117] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'runner' @ [107:30] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'commandHistory' @ [107:37] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'commandHistory' @ [108:43] ==> val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'lastUnprocessedEntry' @ [108:58] ==> public final fun lastUnprocessedEntry(): CommandHistory.Entry? defined in org.jetbrains.kotlin.console.CommandHistory[SimpleFunctionDescriptorImpl]

'logError' @ [108:113] ==> public fun logError(cl: Class<*>, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'ReplOutputProcessor' @ [109:17] ==> public constructor ReplOutputProcessor(runner: KotlinConsoleRunner) defined in org.jetbrains.kotlin.console.ReplOutputProcessor[ClassConstructorDescriptorImpl]

'java' @ [109:44] ==> public val <T> KClass<ReplOutputProcessor>.java: Class<ReplOutputProcessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReplOutputProcessor

'commandHistory' @ [110:75] ==> val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'size' @ [110:90] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'commandHistory' @ [110:110] ==> val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'processedEntriesCount' @ [110:125] ==> public final var processedEntriesCount: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'lastUnprocessedHistoryEntry' @ [112:38] ==> val lastUnprocessedHistoryEntry: CommandHistory.Entry defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'rangeInHistoryDocument' @ [112:66] ==> public final val rangeInHistoryDocument: TextRange defined in org.jetbrains.kotlin.console.CommandHistory.Entry[PropertyDescriptorImpl]

'startOffset' @ [112:89] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'historyDocument' @ [113:36] ==> private final val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'getLineNumber' @ [113:52] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'lastCommandStartOffset' @ [113:66] ==> val lastCommandStartOffset: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'historyMarkup' @ [114:42] ==> private final val historyMarkup: MarkupModelEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'allHighlighters' @ [114:56] ==> public final val MarkupModelEx.allHighlighters: (Array<(RangeHighlighter..RangeHighlighter?)>..Array<out (RangeHighlighter..RangeHighlighter?)>)[MyPropertyDescriptor]

'first' @ [114:72] ==> public inline fun <T> Array<out (RangeHighlighter..RangeHighlighter?)>.first(predicate: ((RangeHighlighter..RangeHighlighter?)) -> Boolean): (RangeHighlighter..RangeHighlighter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.markup.RangeHighlighter..com.intellij.openapi.editor.markup.RangeHighlighter?)

'historyDocument' @ [115:13] ==> private final val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'getLineNumber' @ [115:29] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'it' @ [115:43] ==> value-parameter it: (RangeHighlighter..RangeHighlighter?) defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startOffset' @ [115:46] ==> public final val RangeHighlighter.startOffset: Int[MyPropertyDescriptor]

'lastCommandStartLine' @ [115:62] ==> val lastCommandStartLine: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'it' @ [115:86] ==> value-parameter it: (RangeHighlighter..RangeHighlighter?) defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'gutterIconRenderer' @ [115:89] ==> public final var RangeHighlighter.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'compilerMessages' @ [118:44] ==> value-parameter compilerMessages: List<SeverityDetails> defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors[ValueParameterDescriptorImpl]

'filter' @ [118:61] ==> public inline fun <T> Iterable<SeverityDetails>.filter(predicate: (SeverityDetails) -> Boolean): List<SeverityDetails> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SeverityDetails

'it' @ [119:13] ==> value-parameter it: SeverityDetails defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [119:16] ==> public final val severity: Severity defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'ERROR' @ [119:37] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'it' @ [119:46] ==> value-parameter it: SeverityDetails defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [119:49] ==> public final val severity: Severity defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'WARNING' @ [119:70] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'groupBy' @ [120:11] ==> public inline fun <T, K> Iterable<SeverityDetails>.groupBy(keySelector: (SeverityDetails) -> Int): Map<Int, List<SeverityDetails>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SeverityDetails
    <K> -> Int

'lastCommandStartOffset' @ [121:28] ==> val lastCommandStartOffset: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'message' @ [121:53] ==> value-parameter message: SeverityDetails defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [121:61] ==> public final val range: TextRange defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'startOffset' @ [121:67] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'historyEditor' @ [122:13] ==> private final val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'document' @ [122:27] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'getLineNumber' @ [122:36] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'cmdStart' @ [122:50] ==> val cmdStart: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[LocalVariableDescriptor]

'values' @ [123:11] ==> public abstract val values: Collection<List<SeverityDetails>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [123:18] ==> public inline fun <T, R> Iterable<List<SeverityDetails>>.map(transform: (List<SeverityDetails>) -> Pair<RangeHighlighter, List<SeverityDetails>>): List<Pair<RangeHighlighter, List<SeverityDetails>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SeverityDetails>
    <R> -> Pair<RangeHighlighter, List<SeverityDetails>>

'messages' @ [124:32] ==> value-parameter messages: List<SeverityDetails> defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [124:41] ==> public inline fun <T, R> Iterable<SeverityDetails>.map(transform: (SeverityDetails) -> RangeHighlighter): List<RangeHighlighter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SeverityDetails
    <R> -> RangeHighlighter

'lastCommandStartOffset' @ [125:32] ==> val lastCommandStartOffset: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'message' @ [125:57] ==> value-parameter message: SeverityDetails defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [125:65] ==> public final val range: TextRange defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'startOffset' @ [125:71] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'lastCommandStartOffset' @ [126:30] ==> val lastCommandStartOffset: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'max' @ [126:60] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'message' @ [126:64] ==> value-parameter message: SeverityDetails defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [126:72] ==> public final val range: TextRange defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'endOffset' @ [126:78] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'message' @ [126:89] ==> value-parameter message: SeverityDetails defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'range' @ [126:97] ==> public final val range: TextRange defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'startOffset' @ [126:103] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'getAttributesForSeverity' @ [128:38] ==> private final fun getAttributesForSeverity(start: Int, end: Int, severity: Severity): TextAttributes defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'cmdStart' @ [128:63] ==> val cmdStart: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'cmdEnd' @ [128:73] ==> val cmdEnd: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [128:81] ==> value-parameter message: SeverityDetails defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [128:89] ==> public final val severity: Severity defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'historyMarkup' @ [129:17] ==> private final val historyMarkup: MarkupModelEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'addRangeHighlighter' @ [129:31] ==> @NotNull public abstract fun addRangeHighlighter(p0: Int, p1: Int, p2: Int, @Nullable p3: TextAttributes?, @NotNull p4: HighlighterTargetArea): RangeHighlighter defined in com.intellij.openapi.editor.ex.MarkupModelEx[JavaMethodDescriptor]

'cmdStart' @ [130:25] ==> val cmdStart: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'cmdEnd' @ [130:35] ==> val cmdEnd: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'LAST' @ [130:60] ==> public const final val LAST: Int defined in com.intellij.openapi.editor.markup.HighlighterLayer[JavaPropertyDescriptor]

'textAttributes' @ [130:66] ==> val textAttributes: TextAttributes defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'EXACT_RANGE' @ [130:104] ==> enum entry EXACT_RANGE defined in com.intellij.openapi.editor.markup.HighlighterTargetArea[FakeCallableDescriptorForObject]

'Pair' @ [133:13] ==> public constructor Pair<out A, out B>(first: RangeHighlighter, second: List<SeverityDetails>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> RangeHighlighter
    <out B> -> List<SeverityDetails>

'highlighters' @ [133:18] ==> val highlighters: List<RangeHighlighter> defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[LocalVariableDescriptor]

'first' @ [133:31] ==> public fun <T> List<RangeHighlighter>.first(): RangeHighlighter defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter

'messages' @ [133:40] ==> value-parameter messages: List<SeverityDetails> defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [136:15] ==> public final operator fun component1(): RangeHighlighter defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [136:28] ==> public final operator fun component2(): List<SeverityDetails> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'highlighterAndMessagesByLine' @ [136:41] ==> val highlighterAndMessagesByLine: List<Pair<RangeHighlighter, List<SeverityDetails>>> defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'if (historyDocument.getLineNumber(highlighter.startOffset) == lastCommandStartLine)
                historyCommandRunIndicator.gutterIconRenderer = ConsoleErrorRenderer(messages)
            else
                highlighter.gutterIconRenderer = ConsoleErrorRenderer(messages)' @ [137:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'historyDocument' @ [137:17] ==> private final val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'getLineNumber' @ [137:33] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'highlighter' @ [137:47] ==> val highlighter: RangeHighlighter defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [137:59] ==> public final val RangeHighlighter.startOffset: Int[MyPropertyDescriptor]

'lastCommandStartLine' @ [137:75] ==> val lastCommandStartLine: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'historyCommandRunIndicator' @ [138:17] ==> val historyCommandRunIndicator: (RangeHighlighter..RangeHighlighter?) defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'gutterIconRenderer' @ [138:44] ==> public final var RangeHighlighter.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'ConsoleErrorRenderer' @ [138:65] ==> public constructor ConsoleErrorRenderer(messages: List<SeverityDetails>) defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer[ClassConstructorDescriptorImpl]

'messages' @ [138:86] ==> val messages: List<SeverityDetails> defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'highlighter' @ [140:17] ==> val highlighter: RangeHighlighter defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'gutterIconRenderer' @ [140:29] ==> public final var RangeHighlighter.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'ConsoleErrorRenderer' @ [140:50] ==> public constructor ConsoleErrorRenderer(messages: List<SeverityDetails>) defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer[ClassConstructorDescriptorImpl]

'messages' @ [140:71] ==> val messages: List<SeverityDetails> defined in org.jetbrains.kotlin.console.ReplOutputProcessor.highlightCompilerErrors.<anonymous>[LocalVariableDescriptor]

'runWriteCommandAction' @ [144:67] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [144:89] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'printOutput' @ [145:9] ==> private final fun printOutput(output: String, contentType: ConsoleViewContentType, iconWithTooltip: IconWithTooltip? = ...): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'errorText' @ [145:21] ==> value-parameter errorText: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printRuntimeError[ValueParameterDescriptorImpl]

'ERROR_OUTPUT' @ [145:55] ==> public final val ERROR_OUTPUT: (ConsoleViewContentType..ConsoleViewContentType?) defined in com.intellij.execution.ui.ConsoleViewContentType[JavaPropertyDescriptor]

'RUNTIME_EXCEPTION' @ [145:79] ==> public final val RUNTIME_EXCEPTION: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'runWriteCommandAction' @ [148:83] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [148:105] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'printOutput' @ [150:9] ==> private final fun printOutput(output: String, contentType: ConsoleViewContentType, iconWithTooltip: IconWithTooltip? = ...): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'promptText' @ [150:21] ==> val promptText: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printInternalErrorMessage.<anonymous>[LocalVariableDescriptor]

'ERROR_OUTPUT' @ [150:56] ==> public final val ERROR_OUTPUT: (ConsoleViewContentType..ConsoleViewContentType?) defined in com.intellij.execution.ui.ConsoleViewContentType[JavaPropertyDescriptor]

'RUNTIME_EXCEPTION' @ [150:80] ==> public final val RUNTIME_EXCEPTION: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'logError' @ [151:9] ==> public fun logError(cl: Class<*>, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'this' @ [151:18] ==> <this> defined in org.jetbrains.kotlin.console.ReplOutputProcessor[LazyClassReceiverParameterDescriptor]

'java' @ [151:30] ==> public val <T> KClass<out ReplOutputProcessor>.java: Class<out ReplOutputProcessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out ReplOutputProcessor)

'internalErrorText' @ [151:36] ==> value-parameter internalErrorText: String defined in org.jetbrains.kotlin.console.ReplOutputProcessor.printInternalErrorMessage[ValueParameterDescriptorImpl]

'when (severity) {
        Severity.ERROR   ->
            getAttributesForSeverity(HighlightInfoType.ERROR, HighlightSeverity.ERROR, CodeInsightColors.ERRORS_ATTRIBUTES, start, end)
        Severity.WARNING ->
            getAttributesForSeverity(HighlightInfoType.WARNING, HighlightSeverity.WARNING, CodeInsightColors.WARNINGS_ATTRIBUTES, start, end)
        Severity.INFO    ->
            getAttributesForSeverity(HighlightInfoType.WEAK_WARNING, HighlightSeverity.WEAK_WARNING, CodeInsightColors.WEAK_WARNING_ATTRIBUTES, start, end)
    }' @ [154:102] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TextAttributes, entry1: TextAttributes, entry2: TextAttributes): TextAttributes[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TextAttributes

'severity' @ [154:108] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'ERROR' @ [155:18] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'getAttributesForSeverity' @ [156:13] ==> private final fun getAttributesForSeverity(infoType: HighlightInfoType, severity: HighlightSeverity, insightColors: TextAttributesKey, start: Int, end: Int): TextAttributes defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'ERROR' @ [156:56] ==> public final val ERROR: (HighlightInfoType..HighlightInfoType?) defined in com.intellij.codeInsight.daemon.impl.HighlightInfoType[JavaPropertyDescriptor]

'ERROR' @ [156:81] ==> public final val ERROR: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'ERRORS_ATTRIBUTES' @ [156:106] ==> public final val ERRORS_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.CodeInsightColors[JavaPropertyDescriptor]

'start' @ [156:125] ==> value-parameter start: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'end' @ [156:132] ==> value-parameter end: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'WARNING' @ [157:18] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'getAttributesForSeverity' @ [158:13] ==> private final fun getAttributesForSeverity(infoType: HighlightInfoType, severity: HighlightSeverity, insightColors: TextAttributesKey, start: Int, end: Int): TextAttributes defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'WARNING' @ [158:56] ==> public final val WARNING: (HighlightInfoType..HighlightInfoType?) defined in com.intellij.codeInsight.daemon.impl.HighlightInfoType[JavaPropertyDescriptor]

'WARNING' @ [158:83] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'WARNINGS_ATTRIBUTES' @ [158:110] ==> public final val WARNINGS_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.CodeInsightColors[JavaPropertyDescriptor]

'start' @ [158:131] ==> value-parameter start: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'end' @ [158:138] ==> value-parameter end: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'INFO' @ [159:18] ==> enum entry INFO defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'getAttributesForSeverity' @ [160:13] ==> private final fun getAttributesForSeverity(infoType: HighlightInfoType, severity: HighlightSeverity, insightColors: TextAttributesKey, start: Int, end: Int): TextAttributes defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'WEAK_WARNING' @ [160:56] ==> public final val WEAK_WARNING: (HighlightInfoType..HighlightInfoType?) defined in com.intellij.codeInsight.daemon.impl.HighlightInfoType[JavaPropertyDescriptor]

'WEAK_WARNING' @ [160:88] ==> public final val WEAK_WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'WEAK_WARNING_ATTRIBUTES' @ [160:120] ==> public final val WEAK_WARNING_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.CodeInsightColors[JavaPropertyDescriptor]

'start' @ [160:145] ==> value-parameter start: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'end' @ [160:152] ==> value-parameter end: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'newHighlightInfo' @ [170:43] ==> @NotNull public open fun newHighlightInfo(@NotNull p0: HighlightInfoType): HighlightInfo.Builder defined in com.intellij.codeInsight.daemon.impl.HighlightInfo[JavaMethodDescriptor]

'infoType' @ [170:60] ==> value-parameter infoType: HighlightInfoType defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'range' @ [170:70] ==> @NotNull public abstract fun range(p0: Int, p1: Int): HighlightInfo.Builder defined in com.intellij.codeInsight.daemon.impl.HighlightInfo.Builder[JavaMethodDescriptor]

'start' @ [170:76] ==> value-parameter start: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'end' @ [170:83] ==> value-parameter end: Int defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'severity' @ [170:88] ==> @NotNull public abstract fun severity(@NotNull p0: HighlightSeverity): HighlightInfo.Builder defined in com.intellij.codeInsight.daemon.impl.HighlightInfo.Builder[JavaMethodDescriptor]

'severity' @ [170:97] ==> value-parameter severity: HighlightSeverity defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'textAttributes' @ [170:107] ==> @NotNull public abstract fun textAttributes(@NotNull p0: TextAttributesKey): HighlightInfo.Builder defined in com.intellij.codeInsight.daemon.impl.HighlightInfo.Builder[JavaMethodDescriptor]

'insightColors' @ [170:122] ==> value-parameter insightColors: TextAttributesKey defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[ValueParameterDescriptorImpl]

'create' @ [170:137] ==> @Nullable public abstract fun create(): HighlightInfo? defined in com.intellij.codeInsight.daemon.impl.HighlightInfo.Builder[JavaMethodDescriptor]

'getInstance' @ [172:42] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [172:54] ==> private final val project: Project defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'getPsiFile' @ [172:63] ==> @Nullable public abstract fun getPsiFile(@NotNull p0: Document): PsiFile? defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'consoleView' @ [172:74] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'consoleEditor' @ [172:86] ==> public final val LanguageConsoleImpl.consoleEditor: EditorEx[MyPropertyDescriptor]

'document' @ [172:100] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'consoleView' @ [173:27] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.ReplOutputProcessor[PropertyDescriptorImpl]

'consoleEditor' @ [173:39] ==> public final val LanguageConsoleImpl.consoleEditor: EditorEx[MyPropertyDescriptor]

'colorsScheme' @ [173:53] ==> public final var EditorEx.colorsScheme: EditorColorsScheme[MyPropertyDescriptor]

'highlightInfo' @ [175:16] ==> val highlightInfo: HighlightInfo? defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[LocalVariableDescriptor]

'getTextAttributes' @ [175:31] ==> @Nullable public open fun getTextAttributes(@Nullable p0: PsiElement?, @Nullable p1: EditorColorsScheme?): TextAttributes? defined in com.intellij.codeInsight.daemon.impl.HighlightInfo[JavaMethodDescriptor]

'psiFile' @ [175:49] ==> val psiFile: PsiFile? defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[LocalVariableDescriptor]

'colorScheme' @ [175:58] ==> val colorScheme: EditorColorsScheme defined in org.jetbrains.kotlin.console.ReplOutputProcessor.getAttributesForSeverity[LocalVariableDescriptor]

'TextAttributes' @ [175:74] ==> public constructor TextAttributes() defined in com.intellij.openapi.editor.markup.TextAttributes[JavaClassConstructorDescriptor]

