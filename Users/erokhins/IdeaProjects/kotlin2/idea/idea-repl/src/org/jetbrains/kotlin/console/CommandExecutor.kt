'runner' @ [27:34] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.CommandExecutor[PropertyDescriptorImpl]

'commandHistory' @ [27:41] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'HistoryUpdater' @ [28:34] ==> public constructor HistoryUpdater(runner: KotlinConsoleRunner) defined in org.jetbrains.kotlin.console.HistoryUpdater[ClassConstructorDescriptorImpl]

'runner' @ [28:49] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.CommandExecutor[PropertyDescriptorImpl]

'runWriteCommandAction' @ [30:47] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'runner' @ [30:69] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.CommandExecutor[PropertyDescriptorImpl]

'project' @ [30:76] ==> public final val KotlinConsoleRunner.project: Project[MyPropertyDescriptor]

'getTrimmedCommandText' @ [31:27] ==> private final fun getTrimmedCommandText(): String defined in org.jetbrains.kotlin.console.CommandExecutor[SimpleFunctionDescriptorImpl]

'commandText' @ [33:13] ==> val commandText: String defined in org.jetbrains.kotlin.console.CommandExecutor.executeCommand.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [33:25] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'historyUpdater' @ [37:36] ==> private final val historyUpdater: HistoryUpdater defined in org.jetbrains.kotlin.console.CommandExecutor[PropertyDescriptorImpl]

'printNewCommandInHistory' @ [37:51] ==> public final fun printNewCommandInHistory(trimmedCommandText: String): TextRange defined in org.jetbrains.kotlin.console.HistoryUpdater[SimpleFunctionDescriptorImpl]

'commandText' @ [37:76] ==> val commandText: String defined in org.jetbrains.kotlin.console.CommandExecutor.executeCommand.<anonymous>[LocalVariableDescriptor]

'commandHistory' @ [38:9] ==> private final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.CommandExecutor[PropertyDescriptorImpl]

'addEntry' @ [38:24] ==> public final fun addEntry(entry: CommandHistory.Entry): Unit defined in org.jetbrains.kotlin.console.CommandHistory[SimpleFunctionDescriptorImpl]

'Entry' @ [38:48] ==> public constructor Entry(entryText: String, rangeInHistoryDocument: TextRange) defined in org.jetbrains.kotlin.console.CommandHistory.Entry[ClassConstructorDescriptorImpl]

'commandText' @ [38:54] ==> val commandText: String defined in org.jetbrains.kotlin.console.CommandExecutor.executeCommand.<anonymous>[LocalVariableDescriptor]

'historyDocumentRange' @ [38:67] ==> val historyDocumentRange: TextRange defined in org.jetbrains.kotlin.console.CommandExecutor.executeCommand.<anonymous>[LocalVariableDescriptor]

'sendCommandToProcess' @ [39:9] ==> private final fun sendCommandToProcess(command: String): Unit defined in org.jetbrains.kotlin.console.CommandExecutor[SimpleFunctionDescriptorImpl]

'commandText' @ [39:30] ==> val commandText: String defined in org.jetbrains.kotlin.console.CommandExecutor.executeCommand.<anonymous>[LocalVariableDescriptor]

'runner' @ [43:27] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.CommandExecutor[PropertyDescriptorImpl]

'consoleView' @ [43:34] ==> public final val KotlinConsoleRunner.consoleView: (LanguageConsoleView..LanguageConsoleView?)[MyPropertyDescriptor]

'consoleView' @ [44:24] ==> val consoleView: (LanguageConsoleView..LanguageConsoleView?) defined in org.jetbrains.kotlin.console.CommandExecutor.getTrimmedCommandText[LocalVariableDescriptor]

'editorDocument' @ [44:36] ==> public final val LanguageConsoleView.editorDocument: Document[MyPropertyDescriptor]

'document' @ [45:16] ==> val document: Document defined in org.jetbrains.kotlin.console.CommandExecutor.getTrimmedCommandText[LocalVariableDescriptor]

'text' @ [45:25] ==> public final val Document.text: String[MyPropertyDescriptor]

'trim' @ [45:30] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'runner' @ [49:30] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.CommandExecutor[PropertyDescriptorImpl]

'processHandler' @ [49:37] ==> public final val KotlinConsoleRunner.processHandler: (ProcessHandler..ProcessHandler?)[MyPropertyDescriptor]

'processHandler' @ [50:30] ==> val processHandler: (ProcessHandler..ProcessHandler?) defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[LocalVariableDescriptor]

'processInput' @ [50:45] ==> public final val ProcessHandler.processInput: OutputStream?[MyPropertyDescriptor]

'logError' @ [50:68] ==> public fun logError(cl: Class<*>, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'this' @ [50:77] ==> <this> defined in org.jetbrains.kotlin.console.CommandExecutor[LazyClassReceiverParameterDescriptor]

'java' @ [50:89] ==> public val <T> KClass<out CommandExecutor>.java: Class<out CommandExecutor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out CommandExecutor)

'?:' @ [51:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Charset?, right: Charset): Charset[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Charset

'processHandler' @ [51:24] ==> val processHandler: (ProcessHandler..ProcessHandler?) defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[LocalVariableDescriptor]

'charset' @ [51:66] ==> public final val BaseOSProcessHandler.charset: Charset?[MyPropertyDescriptor]

'UTF_8' @ [51:86] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'XML_PREAMBLE' @ [53:22] ==> private val XML_PREAMBLE: String defined in org.jetbrains.kotlin.console in file CommandExecutor.kt[PropertyDescriptorImpl]

'escapeXml' @ [55:33] ==> @Contract public open fun escapeXml(@Nullable p0: String?): (String..String?) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'replace' @ [56:41] ==> @NotNull @Contract public open fun replace(@NotNull p0: String, @NotNull p1: (Array<(String..String?)>..Array<out (String..String?)>), @NotNull p2: (Array<(String..String?)>..Array<out (String..String?)>)): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'command' @ [56:49] ==> value-parameter command: String defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[ValueParameterDescriptorImpl]

'SOURCE_CHARS' @ [56:58] ==> public val SOURCE_CHARS: Array<String> defined in org.jetbrains.kotlin.console in file ReplOutputHandler.kt[PropertyDescriptorImpl]

'XML_REPLACEMENTS' @ [56:72] ==> public val XML_REPLACEMENTS: Array<String> defined in org.jetbrains.kotlin.console in file ReplOutputHandler.kt[PropertyDescriptorImpl]

'xmlRes' @ [60:24] ==> val xmlRes: String defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[LocalVariableDescriptor]

'toByteArray' @ [60:35] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'charset' @ [60:47] ==> val charset: Charset defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[LocalVariableDescriptor]

'processInputOS' @ [61:9] ==> val processInputOS: OutputStream defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[LocalVariableDescriptor]

'write' @ [61:24] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.io.OutputStream[JavaMethodDescriptor]

'bytes' @ [61:30] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[LocalVariableDescriptor]

'processInputOS' @ [62:9] ==> val processInputOS: OutputStream defined in org.jetbrains.kotlin.console.CommandExecutor.sendCommandToProcess[LocalVariableDescriptor]

'flush' @ [62:24] ==> public open fun flush(): Unit defined in java.io.OutputStream[JavaMethodDescriptor]

