'lazy' @ [28:53] ==> public fun <T> lazy(initializer: () -> LanguageConsoleImpl): Lazy<LanguageConsoleImpl> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LanguageConsoleImpl

'runner' @ [28:60] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'consoleView' @ [28:67] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'consoleView' @ [31:29] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'historyViewer' @ [31:41] ==> public final val LanguageConsoleImpl.historyViewer: EditorEx[MyPropertyDescriptor]

'addLineBreakIfNeeded' @ [32:9] ==> private final fun addLineBreakIfNeeded(historyEditor: EditorEx): Unit defined in org.jetbrains.kotlin.console.HistoryUpdater[SimpleFunctionDescriptorImpl]

'historyEditor' @ [32:30] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'historyEditor' @ [33:27] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'document' @ [33:41] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'textLength' @ [33:50] ==> public final val DocumentEx.textLength: Int[MyPropertyDescriptor]

'startOffset' @ [34:25] ==> val startOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'trimmedCommandText' @ [34:39] ==> value-parameter trimmedCommandText: String defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[ValueParameterDescriptorImpl]

'length' @ [34:58] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'addCommandTextToHistoryEditor' @ [36:9] ==> private final fun addCommandTextToHistoryEditor(trimmedCommandText: String): Unit defined in org.jetbrains.kotlin.console.HistoryUpdater[SimpleFunctionDescriptorImpl]

'trimmedCommandText' @ [36:39] ==> value-parameter trimmedCommandText: String defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[ValueParameterDescriptorImpl]

'addFoldingRegion' @ [37:9] ==> private final fun addFoldingRegion(historyEditor: EditorEx, startOffset: Int, endOffset: Int, command: String): Unit defined in org.jetbrains.kotlin.console.HistoryUpdater[SimpleFunctionDescriptorImpl]

'historyEditor' @ [37:26] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'startOffset' @ [37:41] ==> val startOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'endOffset' @ [37:54] ==> val endOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'trimmedCommandText' @ [37:65] ==> value-parameter trimmedCommandText: String defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[ValueParameterDescriptorImpl]

'historyEditor' @ [39:9] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'markupModel' @ [39:23] ==> public final val EditorEx.markupModel: MarkupModelEx[MyPropertyDescriptor]

'addRangeHighlighter' @ [39:35] ==> @NotNull public abstract fun addRangeHighlighter(p0: Int, p1: Int, p2: Int, @Nullable p3: TextAttributes?, @NotNull p4: HighlighterTargetArea): RangeHighlighter defined in com.intellij.openapi.editor.ex.MarkupModelEx[JavaMethodDescriptor]

'startOffset' @ [40:17] ==> val startOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'endOffset' @ [40:30] ==> val endOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'LAST' @ [40:58] ==> public const final val LAST: Int defined in com.intellij.openapi.editor.markup.HighlighterLayer[JavaPropertyDescriptor]

'EXACT_RANGE' @ [40:92] ==> enum entry EXACT_RANGE defined in com.intellij.openapi.editor.markup.HighlighterTargetArea[FakeCallableDescriptorForObject]

'apply' @ [41:11] ==> @InlineOnly public inline fun <T> RangeHighlighter.apply(block: (RangeHighlighter).() -> Unit): RangeHighlighter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter

'if (runner.isReadLineMode) ReplIcons.READLINE_MARKER else ReplIcons.COMMAND_MARKER' @ [42:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IconWithTooltip, elseBranch: IconWithTooltip): IconWithTooltip[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IconWithTooltip

'runner' @ [42:37] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'isReadLineMode' @ [42:44] ==> public final var isReadLineMode: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'ReplIcons' @ [42:60] ==> public object ReplIcons defined in org.jetbrains.kotlin.console.gutter in file ReplIcons.kt[FakeCallableDescriptorForObject]

'READLINE_MARKER' @ [42:70] ==> public final val READLINE_MARKER: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'ReplIcons' @ [42:91] ==> public object ReplIcons defined in org.jetbrains.kotlin.console.gutter in file ReplIcons.kt[FakeCallableDescriptorForObject]

'COMMAND_MARKER' @ [42:101] ==> public final val COMMAND_MARKER: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'gutterIconRenderer' @ [43:13] ==> public final var RangeHighlighter.gutterIconRenderer: GutterIconRenderer?[MyPropertyDescriptor]

'ConsoleIndicatorRenderer' @ [43:34] ==> public constructor ConsoleIndicatorRenderer(iconWithTooltip: IconWithTooltip) defined in org.jetbrains.kotlin.console.gutter.ConsoleIndicatorRenderer[ClassConstructorDescriptorImpl]

'historyMarker' @ [43:59] ==> val historyMarker: IconWithTooltip defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory.<anonymous>[LocalVariableDescriptor]

'historyEditor' @ [46:9] ==> val historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'scrollingModel' @ [46:23] ==> public final val EditorEx.scrollingModel: ScrollingModelEx[MyPropertyDescriptor]

'scrollVertically' @ [46:38] ==> public abstract fun scrollVertically(p0: Int): Unit defined in com.intellij.openapi.editor.ex.ScrollingModelEx[JavaMethodDescriptor]

'endOffset' @ [46:55] ==> val endOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'TextRange' @ [48:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'startOffset' @ [48:26] ==> val startOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'endOffset' @ [48:39] ==> val endOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.printNewCommandInHistory[LocalVariableDescriptor]

'consoleView' @ [52:29] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'consoleEditor' @ [52:41] ==> public final val LanguageConsoleImpl.consoleEditor: EditorEx[MyPropertyDescriptor]

'consoleEditor' @ [53:31] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addCommandTextToHistoryEditor[LocalVariableDescriptor]

'document' @ [53:45] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'consoleDocument' @ [54:9] ==> val consoleDocument: DocumentEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addCommandTextToHistoryEditor[LocalVariableDescriptor]

'setText' @ [54:25] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'trimmedCommandText' @ [54:33] ==> value-parameter trimmedCommandText: String defined in org.jetbrains.kotlin.console.HistoryUpdater.addCommandTextToHistoryEditor[ValueParameterDescriptorImpl]

'printWithHighlighting' @ [55:29] ==> public open fun printWithHighlighting(@NotNull p0: LanguageConsoleView, @NotNull p1: Editor, @NotNull p2: TextRange): (String..String?) defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'consoleView' @ [55:51] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'consoleEditor' @ [55:64] ==> val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addCommandTextToHistoryEditor[LocalVariableDescriptor]

'TextRange' @ [55:79] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'consoleDocument' @ [55:92] ==> val consoleDocument: DocumentEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addCommandTextToHistoryEditor[LocalVariableDescriptor]

'textLength' @ [55:108] ==> public final val DocumentEx.textLength: Int[MyPropertyDescriptor]

'consoleView' @ [56:9] ==> private final val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'flushDeferredText' @ [56:21] ==> public open fun flushDeferredText(): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'consoleDocument' @ [57:9] ==> val consoleDocument: DocumentEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addCommandTextToHistoryEditor[LocalVariableDescriptor]

'setText' @ [57:25] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'runner' @ [61:13] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'isReadLineMode' @ [61:20] ==> public final var isReadLineMode: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'historyEditor' @ [63:31] ==> value-parameter historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[ValueParameterDescriptorImpl]

'document' @ [63:45] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'historyDocument' @ [64:27] ==> val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'text' @ [64:43] ==> public final val DocumentEx.text: String[MyPropertyDescriptor]

'historyText' @ [65:26] ==> val historyText: String defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'length' @ [65:38] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'if (!historyText.endsWith('\n')) {
            historyDocument.insertString(textLength, "\n")

            if (textLength == 0) // this will work first time after 'Clear all' action
                runner.addGutterIndicator(historyEditor, ReplIcons.HISTORY_INDICATOR)
            else
                historyDocument.insertString(textLength + 1, "\n")

        } else if (!historyText.endsWith("\n\n")) {
            historyDocument.insertString(textLength, "\n")
        }' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [67:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'historyText' @ [67:14] ==> val historyText: String defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'endsWith' @ [67:26] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'historyDocument' @ [68:13] ==> val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'insertString' @ [68:29] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'textLength' @ [68:42] ==> val textLength: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'if (textLength == 0) // this will work first time after 'Clear all' action
                runner.addGutterIndicator(historyEditor, ReplIcons.HISTORY_INDICATOR)
            else
                historyDocument.insertString(textLength + 1, "\n")' @ [70:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'textLength' @ [70:17] ==> val textLength: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'runner' @ [71:17] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.HistoryUpdater[PropertyDescriptorImpl]

'addGutterIndicator' @ [71:24] ==> public final fun addGutterIndicator(editor: EditorEx, iconWithTooltip: IconWithTooltip): RangeHighlighter defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'historyEditor' @ [71:43] ==> value-parameter historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[ValueParameterDescriptorImpl]

'ReplIcons' @ [71:58] ==> public object ReplIcons defined in org.jetbrains.kotlin.console.gutter in file ReplIcons.kt[FakeCallableDescriptorForObject]

'HISTORY_INDICATOR' @ [71:68] ==> public final val HISTORY_INDICATOR: IconWithTooltip defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'historyDocument' @ [73:17] ==> val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'insertString' @ [73:33] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'textLength' @ [73:46] ==> val textLength: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'!' @ [75:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'historyText' @ [75:21] ==> val historyText: String defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'endsWith' @ [75:33] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'historyDocument' @ [76:13] ==> val historyDocument: DocumentEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'insertString' @ [76:29] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'textLength' @ [76:42] ==> val textLength: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.addLineBreakIfNeeded[LocalVariableDescriptor]

'command' @ [81:24] ==> value-parameter command: String defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[ValueParameterDescriptorImpl]

'lines' @ [81:32] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'cmdLines' @ [82:26] ==> val cmdLines: List<String> defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[LocalVariableDescriptor]

'size' @ [82:35] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'linesCount' @ [83:13] ==> val linesCount: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[LocalVariableDescriptor]

'historyEditor' @ [85:29] ==> value-parameter historyEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[ValueParameterDescriptorImpl]

'foldingModel' @ [85:43] ==> public final val EditorEx.foldingModel: FoldingModelEx[MyPropertyDescriptor]

'foldingModel' @ [86:9] ==> val foldingModel: FoldingModelEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[LocalVariableDescriptor]

'runBatchFoldingOperation' @ [86:22] ==> public final fun runBatchFoldingOperation(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.editor.ex.FoldingModelEx[MyFunctionDescriptor]

'foldingModel' @ [87:13] ==> val foldingModel: FoldingModelEx defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[LocalVariableDescriptor]

'addFoldRegion' @ [87:26] ==> @Nullable public abstract fun addFoldRegion(p0: Int, p1: Int, @NotNull p2: String): FoldRegion? defined in com.intellij.openapi.editor.ex.FoldingModelEx[JavaMethodDescriptor]

'startOffset' @ [87:40] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[ValueParameterDescriptorImpl]

'endOffset' @ [87:53] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[ValueParameterDescriptorImpl]

'cmdLines' @ [87:67] ==> val cmdLines: List<String> defined in org.jetbrains.kotlin.console.HistoryUpdater.addFoldingRegion[LocalVariableDescriptor]

