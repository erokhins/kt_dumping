'KeyAdapter' @ [29:5] ==> public constructor KeyAdapter() defined in java.awt.event.KeyAdapter[JavaClassConstructorDescriptor]

'-' @ [31:35] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'historyPos' @ [36:9] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'history' @ [36:22] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'size' @ [36:30] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'prevCaretOffset' @ [37:9] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'-' @ [37:27] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'unfinishedCommand' @ [38:9] ==> private final var unfinishedCommand: String defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'when (e.keyCode) {
            KeyEvent.VK_UP -> moveHistoryCursor(HistoryMove.UP)
            KeyEvent.VK_DOWN -> moveHistoryCursor(HistoryMove.DOWN)
            KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT -> prevCaretOffset = consoleEditor.caretModel.offset
        }' @ [46:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'e' @ [46:15] ==> value-parameter e: KeyEvent defined in org.jetbrains.kotlin.console.HistoryKeyListener.keyReleased[ValueParameterDescriptorImpl]

'keyCode' @ [46:17] ==> public final var KeyEvent.keyCode: Int[MyPropertyDescriptor]

'VK_UP' @ [47:22] ==> public const final val VK_UP: Int defined in java.awt.event.KeyEvent[JavaPropertyDescriptor]

'moveHistoryCursor' @ [47:31] ==> private final fun moveHistoryCursor(move: HistoryKeyListener.HistoryMove): Unit defined in org.jetbrains.kotlin.console.HistoryKeyListener[SimpleFunctionDescriptorImpl]

'UP' @ [47:61] ==> enum entry UP defined in org.jetbrains.kotlin.console.HistoryKeyListener.HistoryMove[FakeCallableDescriptorForObject]

'VK_DOWN' @ [48:22] ==> public const final val VK_DOWN: Int defined in java.awt.event.KeyEvent[JavaPropertyDescriptor]

'moveHistoryCursor' @ [48:33] ==> private final fun moveHistoryCursor(move: HistoryKeyListener.HistoryMove): Unit defined in org.jetbrains.kotlin.console.HistoryKeyListener[SimpleFunctionDescriptorImpl]

'DOWN' @ [48:63] ==> enum entry DOWN defined in org.jetbrains.kotlin.console.HistoryKeyListener.HistoryMove[FakeCallableDescriptorForObject]

'VK_LEFT' @ [49:22] ==> public const final val VK_LEFT: Int defined in java.awt.event.KeyEvent[JavaPropertyDescriptor]

'VK_RIGHT' @ [49:40] ==> public const final val VK_RIGHT: Int defined in java.awt.event.KeyEvent[JavaPropertyDescriptor]

'prevCaretOffset' @ [49:52] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'consoleEditor' @ [49:70] ==> private final val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'caretModel' @ [49:84] ==> public final val EditorEx.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [49:95] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'history' @ [54:13] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'size' @ [54:21] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'!=' @ [55:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.codeInsight.lookup.LookupEx[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [55:27] ==> public open fun getInstance(@NotNull p0: Project): (LookupManager..LookupManager?) defined in com.intellij.codeInsight.lookup.LookupManager[JavaMethodDescriptor]

'project' @ [55:39] ==> private final val project: Project defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'activeLookup' @ [55:48] ==> public final val LookupManager.activeLookup: LookupEx?[MyPropertyDescriptor]

'consoleEditor' @ [57:21] ==> private final val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'caretModel' @ [57:35] ==> public final val EditorEx.caretModel: CaretModel[MyPropertyDescriptor]

'consoleEditor' @ [58:24] ==> private final val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'document' @ [58:38] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'caret' @ [60:25] ==> val caret: CaretModel defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'offset' @ [60:31] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'document' @ [61:23] ==> val document: DocumentEx defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'getLineNumber' @ [61:32] ==> @Contract public abstract fun getLineNumber(p0: Int): Int defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'curOffset' @ [61:46] ==> val curOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'document' @ [62:26] ==> val document: DocumentEx defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'lineCount' @ [62:35] ==> public final val DocumentEx.lineCount: Int[MyPropertyDescriptor]

'totalLines' @ [63:27] ==> val totalLines: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'when (move) {
            HistoryMove.UP -> {
                if (curLine != 0 || (isMultiline && prevCaretOffset != 0)) {
                    prevCaretOffset = curOffset
                    return
                }

                if (historyPos == history.size) {
                    unfinishedCommand = document.text
                }

                historyPos = Math.max(historyPos - 1, 0)
                WriteCommandAction.runWriteCommandAction(project) {
                    document.setText(history[historyPos].entryText)
                    EditorUtil.scrollToTheEnd(consoleEditor)
                    prevCaretOffset = 0
                    caret.moveToOffset(0)
                }
            }
            HistoryMove.DOWN -> {
                if (historyPos == history.size) return

                if (curLine != totalLines - 1 || (isMultiline && prevCaretOffset != document.textLength)) {
                    prevCaretOffset = curOffset
                    return
                }

                historyPos = Math.min(historyPos + 1, history.size)
                WriteCommandAction.runWriteCommandAction(project) {
                    document.setText(if (historyPos == history.size) unfinishedCommand else history[historyPos].entryText)
                    prevCaretOffset = document.textLength
                    EditorUtil.scrollToTheEnd(consoleEditor)
                }
            }
        }' @ [65:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'move' @ [65:15] ==> value-parameter move: HistoryKeyListener.HistoryMove defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[ValueParameterDescriptorImpl]

'UP' @ [66:25] ==> enum entry UP defined in org.jetbrains.kotlin.console.HistoryKeyListener.HistoryMove[FakeCallableDescriptorForObject]

'curLine' @ [67:21] ==> val curLine: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'isMultiline' @ [67:38] ==> val isMultiline: Boolean defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'prevCaretOffset' @ [67:53] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'prevCaretOffset' @ [68:21] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'curOffset' @ [68:39] ==> val curOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'historyPos' @ [72:21] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'history' @ [72:35] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'size' @ [72:43] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'unfinishedCommand' @ [73:21] ==> private final var unfinishedCommand: String defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'document' @ [73:41] ==> val document: DocumentEx defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'text' @ [73:50] ==> public final val DocumentEx.text: String[MyPropertyDescriptor]

'historyPos' @ [76:17] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'max' @ [76:35] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'historyPos' @ [76:39] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'runWriteCommandAction' @ [77:36] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [77:58] ==> private final val project: Project defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'document' @ [78:21] ==> val document: DocumentEx defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'setText' @ [78:30] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'history' @ [78:38] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'historyPos' @ [78:46] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'entryText' @ [78:58] ==> public final val entryText: String defined in org.jetbrains.kotlin.console.CommandHistory.Entry[PropertyDescriptorImpl]

'scrollToTheEnd' @ [79:32] ==> public open fun scrollToTheEnd(@NotNull p0: Editor): Unit defined in com.intellij.openapi.editor.ex.util.EditorUtil[JavaMethodDescriptor]

'consoleEditor' @ [79:47] ==> private final val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'prevCaretOffset' @ [80:21] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'caret' @ [81:21] ==> val caret: CaretModel defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'moveToOffset' @ [81:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'DOWN' @ [84:25] ==> enum entry DOWN defined in org.jetbrains.kotlin.console.HistoryKeyListener.HistoryMove[FakeCallableDescriptorForObject]

'historyPos' @ [85:21] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'history' @ [85:35] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'size' @ [85:43] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'curLine' @ [87:21] ==> val curLine: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'totalLines' @ [87:32] ==> val totalLines: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'isMultiline' @ [87:51] ==> val isMultiline: Boolean defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'prevCaretOffset' @ [87:66] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'document' @ [87:85] ==> val document: DocumentEx defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'textLength' @ [87:94] ==> public final val DocumentEx.textLength: Int[MyPropertyDescriptor]

'prevCaretOffset' @ [88:21] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'curOffset' @ [88:39] ==> val curOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'historyPos' @ [92:17] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'min' @ [92:35] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'historyPos' @ [92:39] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'history' @ [92:55] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'size' @ [92:63] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'runWriteCommandAction' @ [93:36] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [93:58] ==> private final val project: Project defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'document' @ [94:21] ==> val document: DocumentEx defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'setText' @ [94:30] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.ex.DocumentEx[JavaMethodDescriptor]

'if (historyPos == history.size) unfinishedCommand else history[historyPos].entryText' @ [94:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'historyPos' @ [94:42] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'history' @ [94:56] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'size' @ [94:64] ==> public final val size: Int defined in org.jetbrains.kotlin.console.CommandHistory[PropertyDescriptorImpl]

'unfinishedCommand' @ [94:70] ==> private final var unfinishedCommand: String defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'history' @ [94:93] ==> private final val history: CommandHistory defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'historyPos' @ [94:101] ==> private final var historyPos: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'entryText' @ [94:113] ==> public final val entryText: String defined in org.jetbrains.kotlin.console.CommandHistory.Entry[PropertyDescriptorImpl]

'prevCaretOffset' @ [95:21] ==> private final var prevCaretOffset: Int defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

'document' @ [95:39] ==> val document: DocumentEx defined in org.jetbrains.kotlin.console.HistoryKeyListener.moveHistoryCursor[LocalVariableDescriptor]

'textLength' @ [95:48] ==> public final val DocumentEx.textLength: Int[MyPropertyDescriptor]

'scrollToTheEnd' @ [96:32] ==> public open fun scrollToTheEnd(@NotNull p0: Editor): Unit defined in com.intellij.openapi.editor.ex.util.EditorUtil[JavaMethodDescriptor]

'consoleEditor' @ [96:47] ==> private final val consoleEditor: EditorEx defined in org.jetbrains.kotlin.console.HistoryKeyListener[PropertyDescriptorImpl]

