'arrayOf' @ [32:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'arrayOf' @ [33:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'OSProcessHandler' @ [41:5] ==> public constructor OSProcessHandler(@NotNull p0: Process, p1: (String..String?)) defined in com.intellij.execution.process.OSProcessHandler[JavaClassConstructorDescriptor]

'process' @ [41:22] ==> value-parameter process: Process defined in org.jetbrains.kotlin.console.ReplOutputHandler.<init>[ValueParameterDescriptorImpl]

'commandLine' @ [41:31] ==> value-parameter commandLine: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.<init>[ValueParameterDescriptorImpl]

'newInstance' @ [44:50] ==> public open fun newInstance(): (DocumentBuilderFactory..DocumentBuilderFactory?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'ReplOutputProcessor' @ [45:35] ==> public constructor ReplOutputProcessor(runner: KotlinConsoleRunner) defined in org.jetbrains.kotlin.console.ReplOutputProcessor[ClassConstructorDescriptorImpl]

'runner' @ [45:55] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'StringBuilder' @ [46:31] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'text' @ [52:13] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.notifyTextAvailable[ValueParameterDescriptorImpl]

'startsWith' @ [52:18] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (key == ProcessOutputTypes.STDOUT) {
            inputBuffer.append(text)
            val resultingText = inputBuffer.toString()
            if (resultingText.endsWith("\n")) {
                handleReplMessage(resultingText)
                inputBuffer.setLength(0)
            }
        }
        else {
            super.notifyTextAvailable(text, key)
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'key' @ [54:13] ==> value-parameter key: Key<*>? defined in org.jetbrains.kotlin.console.ReplOutputHandler.notifyTextAvailable[ValueParameterDescriptorImpl]

'STDOUT' @ [54:39] ==> public final val STDOUT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.execution.process.ProcessOutputTypes[JavaPropertyDescriptor]

'inputBuffer' @ [55:13] ==> private final val inputBuffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'append' @ [55:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'text' @ [55:32] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.notifyTextAvailable[ValueParameterDescriptorImpl]

'inputBuffer' @ [56:33] ==> private final val inputBuffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'toString' @ [56:45] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'resultingText' @ [57:17] ==> val resultingText: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.notifyTextAvailable[LocalVariableDescriptor]

'endsWith' @ [57:31] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'handleReplMessage' @ [58:17] ==> private final fun handleReplMessage(text: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputHandler[SimpleFunctionDescriptorImpl]

'resultingText' @ [58:35] ==> val resultingText: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.notifyTextAvailable[LocalVariableDescriptor]

'inputBuffer' @ [59:17] ==> private final val inputBuffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'setLength' @ [59:29] ==> public open fun setLength(p0: Int): Unit defined in java.lang.StringBuilder[JavaMethodDescriptor]

'super' @ [63:13] ==> <this> defined in org.jetbrains.kotlin.console.ReplOutputHandler[LazyClassReceiverParameterDescriptor]

'notifyTextAvailable' @ [63:19] ==> public open fun notifyTextAvailable(p0: (String..String?), p1: raw (Key<(Any..Any?)>..Key<*>?)): Unit defined in com.intellij.execution.process.OSProcessHandler[JavaMethodDescriptor]

'text' @ [63:39] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.notifyTextAvailable[ValueParameterDescriptorImpl]

'key' @ [63:45] ==> value-parameter key: Key<*>? defined in org.jetbrains.kotlin.console.ReplOutputHandler.notifyTextAvailable[ValueParameterDescriptorImpl]

'text' @ [68:13] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[ValueParameterDescriptorImpl]

'isBlank' @ [68:18] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'factory' @ [70:13] ==> private final val factory: (DocumentBuilderFactory..DocumentBuilderFactory?) defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'newDocumentBuilder' @ [70:21] ==> public abstract fun newDocumentBuilder(): (DocumentBuilder..DocumentBuilder?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'parse' @ [70:42] ==> public abstract fun parse(p0: (InputSource..InputSource?)): (Document..Document?) defined in javax.xml.parsers.DocumentBuilder[JavaMethodDescriptor]

'strToSource' @ [70:48] ==> private final fun strToSource(s: String, encoding: Charset = ...): InputSource defined in org.jetbrains.kotlin.console.ReplOutputHandler[SimpleFunctionDescriptorImpl]

'text' @ [70:60] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[ValueParameterDescriptorImpl]

'logError' @ [73:13] ==> public fun logError(cl: Class<*>, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'ReplOutputHandler' @ [73:22] ==> public constructor ReplOutputHandler(runner: KotlinConsoleRunner, process: Process, commandLine: String) defined in org.jetbrains.kotlin.console.ReplOutputHandler[ClassConstructorDescriptorImpl]

'java' @ [73:47] ==> public val <T> KClass<ReplOutputHandler>.java: Class<ReplOutputHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReplOutputHandler

'text' @ [73:83] ==> value-parameter text: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[ValueParameterDescriptorImpl]

'output' @ [77:20] ==> val output: (Document..Document?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'firstChild' @ [77:27] ==> public final val Document.firstChild: (Node..Node?)[MyPropertyDescriptor]

'root' @ [78:26] ==> val root: Element defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'getAttribute' @ [78:31] ==> public abstract fun getAttribute(p0: (String..String?)): (String..String?) defined in org.w3c.dom.Element[JavaMethodDescriptor]

'replace' @ [79:34] ==> @NotNull @Contract public open fun replace(@NotNull p0: String, @NotNull p1: (Array<(String..String?)>..Array<out (String..String?)>), @NotNull p2: (Array<(String..String?)>..Array<out (String..String?)>)): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'root' @ [79:42] ==> val root: Element defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'textContent' @ [79:47] ==> public final var Element.textContent: (String..String?)[MyPropertyDescriptor]

'XML_REPLACEMENTS' @ [79:60] ==> public val XML_REPLACEMENTS: Array<String> defined in org.jetbrains.kotlin.console in file ReplOutputHandler.kt[PropertyDescriptorImpl]

'SOURCE_CHARS' @ [79:78] ==> public val SOURCE_CHARS: Array<String> defined in org.jetbrains.kotlin.console in file ReplOutputHandler.kt[PropertyDescriptorImpl]

'when (outputType) {
            "INITIAL_PROMPT"  -> buildWarningIfNeededBeforeInit(content)
            "HELP_PROMPT"     -> outputProcessor.printHelp(content)
            "USER_OUTPUT"     -> outputProcessor.printUserOutput(content)
            "REPL_RESULT"     -> outputProcessor.printResultWithGutterIcon(content)
            "READLINE_START"  -> runner.isReadLineMode = true
            "READLINE_END"    -> runner.isReadLineMode = false
            "REPL_INCOMPLETE",
            "COMPILE_ERROR"   -> outputProcessor.highlightCompilerErrors(createCompilerMessages(content))
            "RUNTIME_ERROR"   -> outputProcessor.printRuntimeError("${content.trim()}\n")
            "INTERNAL_ERROR"  -> outputProcessor.printInternalErrorMessage(content)
            "SUCCESS"         -> runner.commandHistory.lastUnprocessedEntry()?.entryText?.let { runner.successfulLine(it) }
            else -> logError(ReplOutputHandler::class.java, "Unexpected output type:\n$outputType")
        }' @ [81:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?, entry3: Unit?, entry4: Unit?, entry5: Unit?, entry6: Unit?, entry7: Unit?, entry8: Unit?, entry9: Unit?, entry10: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'outputType' @ [81:15] ==> val outputType: (String..String?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'buildWarningIfNeededBeforeInit' @ [82:34] ==> private final fun buildWarningIfNeededBeforeInit(content: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputHandler[SimpleFunctionDescriptorImpl]

'content' @ [82:65] ==> val content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'outputProcessor' @ [83:34] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'printHelp' @ [83:50] ==> public final fun printHelp(help: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'content' @ [83:60] ==> val content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'outputProcessor' @ [84:34] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'printUserOutput' @ [84:50] ==> public final fun printUserOutput(command: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'content' @ [84:66] ==> val content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'outputProcessor' @ [85:34] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'printResultWithGutterIcon' @ [85:50] ==> public final fun printResultWithGutterIcon(result: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'content' @ [85:76] ==> val content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'runner' @ [86:34] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'isReadLineMode' @ [86:41] ==> public final var isReadLineMode: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'runner' @ [87:34] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'isReadLineMode' @ [87:41] ==> public final var isReadLineMode: Boolean defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'outputProcessor' @ [89:34] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'highlightCompilerErrors' @ [89:50] ==> public final fun highlightCompilerErrors(compilerMessages: List<SeverityDetails>): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'createCompilerMessages' @ [89:74] ==> private final fun createCompilerMessages(runtimeErrorsReport: String): List<SeverityDetails> defined in org.jetbrains.kotlin.console.ReplOutputHandler[SimpleFunctionDescriptorImpl]

'content' @ [89:97] ==> val content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'outputProcessor' @ [90:34] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'printRuntimeError' @ [90:50] ==> public final fun printRuntimeError(errorText: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'content' @ [90:71] ==> val content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'trim' @ [90:79] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'outputProcessor' @ [91:34] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'printInternalErrorMessage' @ [91:50] ==> public final fun printInternalErrorMessage(internalErrorText: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'content' @ [91:76] ==> val content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'runner' @ [92:34] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'commandHistory' @ [92:41] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'lastUnprocessedEntry' @ [92:56] ==> public final fun lastUnprocessedEntry(): CommandHistory.Entry? defined in org.jetbrains.kotlin.console.CommandHistory[SimpleFunctionDescriptorImpl]

'entryText' @ [92:80] ==> public final val entryText: String defined in org.jetbrains.kotlin.console.CommandHistory.Entry[PropertyDescriptorImpl]

'let' @ [92:91] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'runner' @ [92:97] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'successfulLine' @ [92:104] ==> public final fun successfulLine(text: String): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'it' @ [92:119] ==> value-parameter it: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage.<anonymous>[ValueParameterDescriptorImpl]

'logError' @ [93:21] ==> public fun logError(cl: Class<*>, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'ReplOutputHandler' @ [93:30] ==> public constructor ReplOutputHandler(runner: KotlinConsoleRunner, process: Process, commandLine: String) defined in org.jetbrains.kotlin.console.ReplOutputHandler[ClassConstructorDescriptorImpl]

'java' @ [93:55] ==> public val <T> KClass<ReplOutputHandler>.java: Class<ReplOutputHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReplOutputHandler

'outputType' @ [93:88] ==> val outputType: (String..String?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'outputType' @ [96:13] ==> val outputType: (String..String?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.handleReplMessage[LocalVariableDescriptor]

'setOf' @ [96:27] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'runner' @ [97:13] ==> private final val runner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'commandHistory' @ [97:20] ==> public final val commandHistory: CommandHistory defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[PropertyDescriptorImpl]

'entryProcessed' @ [97:35] ==> public final fun entryProcessed(): Unit defined in org.jetbrains.kotlin.console.CommandHistory[SimpleFunctionDescriptorImpl]

'!' @ [102:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBuildInfoChecked' @ [102:14] ==> private final var isBuildInfoChecked: Boolean defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'outputProcessor' @ [103:13] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'printBuildInfoWarningIfNeeded' @ [103:29] ==> public final fun printBuildInfoWarningIfNeeded(): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'isBuildInfoChecked' @ [104:13] ==> private final var isBuildInfoChecked: Boolean defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'outputProcessor' @ [106:9] ==> private final val outputProcessor: ReplOutputProcessor defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'printInitialPrompt' @ [106:25] ==> public final fun printInitialPrompt(command: String): Unit defined in org.jetbrains.kotlin.console.ReplOutputProcessor[SimpleFunctionDescriptorImpl]

'content' @ [106:44] ==> value-parameter content: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.buildWarningIfNeededBeforeInit[ValueParameterDescriptorImpl]

'Charsets' @ [109:60] ==> public object Charsets defined in kotlin.text[FakeCallableDescriptorForObject]

'UTF_8' @ [109:69] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'InputSource' @ [109:78] ==> public constructor InputSource(p0: (InputStream..InputStream?)) defined in org.xml.sax.InputSource[JavaClassConstructorDescriptor]

'ByteArrayInputStream' @ [109:90] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

's' @ [109:111] ==> value-parameter s: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.strToSource[ValueParameterDescriptorImpl]

'toByteArray' @ [109:113] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'encoding' @ [109:125] ==> value-parameter encoding: Charset = ... defined in org.jetbrains.kotlin.console.ReplOutputHandler.strToSource[ValueParameterDescriptorImpl]

'arrayListOf' @ [112:32] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<SeverityDetails> /* = ArrayList<SeverityDetails> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SeverityDetails

'factory' @ [114:22] ==> private final val factory: (DocumentBuilderFactory..DocumentBuilderFactory?) defined in org.jetbrains.kotlin.console.ReplOutputHandler[PropertyDescriptorImpl]

'newDocumentBuilder' @ [114:30] ==> public abstract fun newDocumentBuilder(): (DocumentBuilder..DocumentBuilder?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'parse' @ [114:51] ==> public abstract fun parse(p0: (InputSource..InputSource?)): (Document..Document?) defined in javax.xml.parsers.DocumentBuilder[JavaMethodDescriptor]

'strToSource' @ [114:57] ==> private final fun strToSource(s: String, encoding: Charset = ...): InputSource defined in org.jetbrains.kotlin.console.ReplOutputHandler[SimpleFunctionDescriptorImpl]

'runtimeErrorsReport' @ [114:69] ==> value-parameter runtimeErrorsReport: String defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[ValueParameterDescriptorImpl]

'UTF_16' @ [114:99] ==> @field:JvmField public final val UTF_16: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'report' @ [115:23] ==> val report: (Document..Document?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'getElementsByTagName' @ [115:30] ==> public abstract fun getElementsByTagName(p0: (String..String?)): (NodeList..NodeList?) defined in org.w3c.dom.Document[JavaMethodDescriptor]

'..' @ [116:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'entries' @ [116:22] ==> val entries: (NodeList..NodeList?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'length' @ [116:30] ==> public final val NodeList.length: Int[MyPropertyDescriptor]

'entries' @ [117:31] ==> val entries: (NodeList..NodeList?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'item' @ [117:39] ==> public abstract fun item(p0: Int): (Node..Node?) defined in org.w3c.dom.NodeList[JavaMethodDescriptor]

'i' @ [117:44] ==> val i: Int defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'reportEntry' @ [119:33] ==> val reportEntry: Element defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'getAttribute' @ [119:45] ==> public abstract fun getAttribute(p0: (String..String?)): (String..String?) defined in org.w3c.dom.Element[JavaMethodDescriptor]

'toSeverity' @ [119:70] ==> private final fun String.toSeverity(): Severity defined in org.jetbrains.kotlin.console.ReplOutputHandler[SimpleFunctionDescriptorImpl]

'reportEntry' @ [120:30] ==> val reportEntry: Element defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'getAttribute' @ [120:42] ==> public abstract fun getAttribute(p0: (String..String?)): (String..String?) defined in org.w3c.dom.Element[JavaMethodDescriptor]

'toInt' @ [120:69] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reportEntry' @ [121:28] ==> val reportEntry: Element defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'getAttribute' @ [121:40] ==> public abstract fun getAttribute(p0: (String..String?)): (String..String?) defined in org.w3c.dom.Element[JavaMethodDescriptor]

'toInt' @ [121:65] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reportEntry' @ [122:31] ==> val reportEntry: Element defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'textContent' @ [122:43] ==> public final var Element.textContent: (String..String?)[MyPropertyDescriptor]

'compilerMessages' @ [124:13] ==> val compilerMessages: ArrayList<SeverityDetails> /* = ArrayList<SeverityDetails> */ defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'add' @ [124:30] ==> public open fun add(element: SeverityDetails): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'SeverityDetails' @ [124:34] ==> public constructor SeverityDetails(severity: Severity, description: String, range: TextRange) defined in org.jetbrains.kotlin.console.SeverityDetails[ClassConstructorDescriptorImpl]

'severityLevel' @ [124:50] ==> val severityLevel: Severity defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'description' @ [124:65] ==> val description: (String..String?) defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'TextRange' @ [124:78] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'rangeStart' @ [124:88] ==> val rangeStart: Int defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'rangeEnd' @ [124:100] ==> val rangeEnd: Int defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'compilerMessages' @ [127:16] ==> val compilerMessages: ArrayList<SeverityDetails> /* = ArrayList<SeverityDetails> */ defined in org.jetbrains.kotlin.console.ReplOutputHandler.createCompilerMessages[LocalVariableDescriptor]

'when (this) {
        "ERROR"   -> Severity.ERROR
        "WARNING" -> Severity.WARNING
        "INFO"    -> Severity.INFO
        else      -> throw IllegalArgumentException("Unsupported Severity: '$this'") // this case shouldn't occur
    }' @ [130:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Severity, entry1: Severity, entry2: Severity, entry3: Severity): Severity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Severity

'this' @ [130:45] ==> <this> defined in org.jetbrains.kotlin.console.ReplOutputHandler.toSeverity[ReceiverParameterDescriptorImpl]

'ERROR' @ [131:31] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'WARNING' @ [132:31] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'INFO' @ [133:31] ==> enum entry INFO defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'IllegalArgumentException' @ [134:28] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [134:78] ==> <this> defined in org.jetbrains.kotlin.console.ReplOutputHandler.toSeverity[ReceiverParameterDescriptorImpl]

