'PlatformTestCase' @ [30:30] ==> public constructor PlatformTestCase() defined in com.intellij.testFramework.PlatformTestCase[JavaClassConstructorDescriptor]

'super' @ [35:9] ==> <this> defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [35:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in com.intellij.testFramework.PlatformTestCase[JavaMethodDescriptor]

'consoleRunner' @ [36:9] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'!!' @ [36:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinConsoleRunner?): KotlinConsoleRunner[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinConsoleRunner

'getInstance' @ [36:45] ==> @JvmStatic public final fun getInstance(project: Project): (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [36:57] ==> public final val IdeReplExecutionTest.project: (Project..Project?)[MyPropertyDescriptor]

'run' @ [36:66] ==> public final fun run(module: Module, previousCompilationFailed: Boolean = ...): KotlinConsoleRunner? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[DeserializedSimpleFunctionDescriptor]

'module' @ [36:70] ==> public final val IdeReplExecutionTest.module: (Module..Module?)[MyPropertyDescriptor]

'consoleRunner' @ [40:9] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'dispose' @ [40:23] ==> public final fun dispose(): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[DeserializedSimpleFunctionDescriptor]

'this' @ [41:10] ==> <this> defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[LazyClassReceiverParameterDescriptor]

'consoleRunner' @ [41:16] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'set' @ [41:74] ==> public abstract fun set(value: KotlinConsoleRunner?): Unit defined in kotlin.reflect.KMutableProperty0[DeserializedSimpleFunctionDescriptor]

'super' @ [42:9] ==> <this> defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [42:15] ==> protected/*protected and package*/ open fun tearDown(): Unit defined in com.intellij.testFramework.PlatformTestCase[JavaMethodDescriptor]

'runWriteAction' @ [46:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'consoleRunner' @ [46:26] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'consoleView' @ [46:40] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'editorDocument' @ [46:52] ==> public final val LanguageConsoleView.editorDocument: Document[MyPropertyDescriptor]

'setText' @ [46:67] ==> public abstract fun setText(@NotNull p0: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'command' @ [46:75] ==> value-parameter command: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.sendCommand[ValueParameterDescriptorImpl]

'consoleRunner' @ [47:9] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'executor' @ [47:23] ==> public final val executor: CommandExecutor defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[DeserializedPropertyDescriptor]

'executeCommand' @ [47:32] ==> public final fun executeCommand(): Unit defined in org.jetbrains.kotlin.console.CommandExecutor[DeserializedSimpleFunctionDescriptor]

'commandsSent' @ [48:9] ==> private final var commandsSent: Int defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'getReplOutput' @ [52:22] ==> private final fun getReplOutput(maxIterations: Int = ..., sleepTime: Long = ..., textOnTimeOut: () -> String, predicate: () -> Boolean): String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'consoleRunner' @ [52:62] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'commandHistory' @ [52:76] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[DeserializedPropertyDescriptor]

'processedEntriesCount' @ [52:91] ==> public final var processedEntriesCount: Int defined in org.jetbrains.kotlin.console.CommandHistory[DeserializedPropertyDescriptor]

'consoleRunner' @ [53:13] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'commandHistory' @ [53:27] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[DeserializedPropertyDescriptor]

'processedEntriesCount' @ [53:42] ==> public final var processedEntriesCount: Int defined in org.jetbrains.kotlin.console.CommandHistory[DeserializedPropertyDescriptor]

'commandsSent' @ [53:67] ==> private final var commandsSent: Int defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'assertTrue' @ [55:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'output' @ [55:20] ==> val output: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.checkOutput[LocalVariableDescriptor]

'trim' @ [55:27] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'endsWith' @ [55:34] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedOutput' @ [55:43] ==> value-parameter expectedOutput: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.checkOutput[ValueParameterDescriptorImpl]

'expectedOutput' @ [55:63] ==> value-parameter expectedOutput: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.checkOutput[ValueParameterDescriptorImpl]

'output' @ [55:121] ==> val output: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.checkOutput[LocalVariableDescriptor]

'..' @ [59:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'maxIterations' @ [59:22] ==> value-parameter maxIterations: Int = ... defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.getReplOutput[ValueParameterDescriptorImpl]

'dispatchAllInvocationEvents' @ [60:20] ==> public open fun dispatchAllInvocationEvents(): Unit defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'invoke' @ [61:17] ==> public abstract operator fun invoke(): Boolean defined in kotlin.Function0[FunctionInvokeDescriptor]

'refreshAndGetHistoryEditorText' @ [62:24] ==> private final fun refreshAndGetHistoryEditorText(): String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'sleep' @ [64:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'sleepTime' @ [64:26] ==> value-parameter sleepTime: Long = ... defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.getReplOutput[ValueParameterDescriptorImpl]

'invoke' @ [67:16] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'consoleRunner' @ [71:27] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'consoleView' @ [71:41] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'consoleView' @ [72:9] ==> val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.refreshAndGetHistoryEditorText[LocalVariableDescriptor]

'flushDeferredText' @ [72:21] ==> public open fun flushDeferredText(): Unit defined in com.intellij.execution.console.LanguageConsoleImpl[JavaMethodDescriptor]

'consoleView' @ [74:16] ==> val consoleView: LanguageConsoleImpl defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.refreshAndGetHistoryEditorText[LocalVariableDescriptor]

'historyViewer' @ [74:28] ==> public final val LanguageConsoleImpl.historyViewer: EditorEx[MyPropertyDescriptor]

'document' @ [74:42] ==> public final val EditorEx.document: DocumentEx[MyPropertyDescriptor]

'text' @ [74:51] ==> public final val DocumentEx.text: String[MyPropertyDescriptor]

'sendCommand' @ [78:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'command' @ [78:21] ==> value-parameter command: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testSimpleCommand[ValueParameterDescriptorImpl]

'checkOutput' @ [79:9] ==> private final fun checkOutput(expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'expectedOutput' @ [79:21] ==> value-parameter expectedOutput: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testSimpleCommand[ValueParameterDescriptorImpl]

'Test' @ [82:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'x' @ [83:36] ==> value-parameter x: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [83:38] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'x' @ [84:40] ==> value-parameter x: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [84:42] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'x' @ [84:91] ==> value-parameter x: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [84:93] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'x' @ [84:121] ==> value-parameter x: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [84:123] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getReplOutput' @ [86:22] ==> private final fun getReplOutput(maxIterations: Int = ..., sleepTime: Long = ..., textOnTimeOut: () -> String, predicate: () -> Boolean): String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'refreshAndGetHistoryEditorText' @ [87:30] ==> private final fun refreshAndGetHistoryEditorText(): String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'invoke' @ [88:13] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'editorText' @ [88:23] ==> val editorText: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility.<anonymous>[LocalVariableDescriptor]

'invoke' @ [88:38] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'editorText' @ [88:44] ==> val editorText: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility.<anonymous>[LocalVariableDescriptor]

'assertFalse' @ [91:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'invoke' @ [91:21] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'output' @ [91:31] ==> val output: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility[LocalVariableDescriptor]

'assertTrue' @ [92:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'invoke' @ [92:20] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'output' @ [92:26] ==> val output: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testRunPossibility[LocalVariableDescriptor]

'assertFalse' @ [93:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'consoleRunner' @ [93:21] ==> private final lateinit var consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[PropertyDescriptorImpl]

'processHandler' @ [93:35] ==> public final val KotlinConsoleRunner.processHandler: (ProcessHandler..ProcessHandler?)[MyPropertyDescriptor]

'isProcessTerminated' @ [93:50] ==> public final val ProcessHandler.isProcessTerminated: Boolean[MyPropertyDescriptor]

'Test' @ [96:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testSimpleCommand' @ [96:34] ==> private final fun testSimpleCommand(command: String, expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'Test' @ [97:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'let' @ [97:59] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'testSimpleCommand' @ [97:65] ==> private final fun testSimpleCommand(command: String, expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'it' @ [97:95] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testPrintlnText.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [97:103] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testPrintlnText.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [98:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'testSimpleCommand' @ [98:47] ==> private final fun testSimpleCommand(command: String, expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'Test' @ [100:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sendCommand' @ [103:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'+' @ [103:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'printText' @ [104:37] ==> val printText: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testMultilineSupport[LocalVariableDescriptor]

'sendCommand' @ [106:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'checkOutput' @ [108:9] ==> private final fun checkOutput(expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'printText' @ [108:21] ==> val printText: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testMultilineSupport[LocalVariableDescriptor]

'Test' @ [111:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sendCommand' @ [114:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'sendCommand' @ [115:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'readLineText' @ [115:21] ==> val readLineText: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testReadLineSingle[LocalVariableDescriptor]

'sendCommand' @ [116:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'checkOutput' @ [117:9] ==> private final fun checkOutput(expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'readLineText' @ [117:21] ==> val readLineText: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testReadLineSingle[LocalVariableDescriptor]

'Test' @ [120:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sendCommand' @ [124:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'+' @ [124:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'sendCommand' @ [126:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'readLineTextA' @ [126:21] ==> val readLineTextA: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testReadLineMultiple[LocalVariableDescriptor]

'sendCommand' @ [127:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'readLineTextB' @ [127:21] ==> val readLineTextB: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testReadLineMultiple[LocalVariableDescriptor]

'sendCommand' @ [129:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'checkOutput' @ [130:9] ==> private final fun checkOutput(expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'readLineTextA' @ [130:21] ==> val readLineTextA: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testReadLineMultiple[LocalVariableDescriptor]

'sendCommand' @ [131:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'checkOutput' @ [132:9] ==> private final fun checkOutput(expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'readLineTextB' @ [132:21] ==> val readLineTextB: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testReadLineMultiple[LocalVariableDescriptor]

'Test' @ [135:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sendCommand' @ [137:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'sendCommand' @ [138:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'message' @ [138:33] ==> val message: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testCorrectAfterError[LocalVariableDescriptor]

'checkOutput' @ [139:9] ==> private final fun checkOutput(expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'message' @ [139:21] ==> val message: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testCorrectAfterError[LocalVariableDescriptor]

'Test' @ [142:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'repeat' @ [143:52] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sendCommand' @ [144:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'veryLongTextWithErrors' @ [144:21] ==> val veryLongTextWithErrors: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testMultipleErrorsHandling[LocalVariableDescriptor]

'sendCommand' @ [145:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'veryLongTextWithErrors' @ [145:21] ==> val veryLongTextWithErrors: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testMultipleErrorsHandling[LocalVariableDescriptor]

'sendCommand' @ [146:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'veryLongTextWithErrors' @ [146:21] ==> val veryLongTextWithErrors: String defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest.testMultipleErrorsHandling[LocalVariableDescriptor]

'sendCommand' @ [147:9] ==> private final fun sendCommand(command: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

'checkOutput' @ [148:9] ==> private final fun checkOutput(expectedOutput: String): Unit defined in org.jetbrains.kotlin.idea.repl.IdeReplExecutionTest[SimpleFunctionDescriptorImpl]

