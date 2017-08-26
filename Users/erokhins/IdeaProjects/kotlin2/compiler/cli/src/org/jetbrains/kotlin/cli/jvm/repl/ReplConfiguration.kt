'sinWrapper' @ [41:9] ==> public final val sinWrapper: ReplSystemInWrapper defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[PropertyDescriptorImpl]

'isReplScriptExecuting' @ [41:20] ==> @Volatile public final var isReplScriptExecuting: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplSystemInWrapper[PropertyDescriptorImpl]

'isExecuting' @ [41:44] ==> value-parameter isExecuting: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration.onUserCodeExecuting[ValueParameterDescriptorImpl]

'ReplIdeDiagnosticMessageHolder' @ [44:45] ==> public constructor ReplIdeDiagnosticMessageHolder() defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplIdeDiagnosticMessageHolder[ClassConstructorDescriptorImpl]

'ReplSystemOutWrapperForIde' @ [56:27] ==> public constructor ReplSystemOutWrapperForIde(standardOut: PrintStream) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplSystemOutWrapperForIde[ClassConstructorDescriptorImpl]

'out' @ [56:61] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'setOut' @ [57:16] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'soutWrapper' @ [57:23] ==> val soutWrapper: ReplSystemOutWrapperForIde defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration.<init>[LocalVariableDescriptor]

'sinWrapper' @ [61:9] ==> public final val sinWrapper: ReplSystemInWrapper defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[PropertyDescriptorImpl]

'ReplSystemInWrapper' @ [61:22] ==> public constructor ReplSystemInWrapper(stdin: InputStream, replWriter: ReplWriter) defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplSystemInWrapper[ClassConstructorDescriptorImpl]

'`in`' @ [61:49] ==> public final val `in`: (InputStream..InputStream?) defined in java.lang.System[JavaPropertyDescriptor]

'soutWrapper' @ [61:55] ==> val soutWrapper: ReplSystemOutWrapperForIde defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration.<init>[LocalVariableDescriptor]

'setIn' @ [62:16] ==> public open fun setIn(p0: (InputStream..InputStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'sinWrapper' @ [62:22] ==> public final val sinWrapper: ReplSystemInWrapper defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[PropertyDescriptorImpl]

'writer' @ [64:9] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[PropertyDescriptorImpl]

'soutWrapper' @ [64:18] ==> val soutWrapper: ReplSystemOutWrapperForIde defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration.<init>[LocalVariableDescriptor]

'errorLogger' @ [65:9] ==> public open val errorLogger: ReplErrorLogger defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[PropertyDescriptorImpl]

'IdeReplErrorLogger' @ [65:23] ==> public constructor IdeReplErrorLogger(replWriter: ReplWriter) defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger[ClassConstructorDescriptorImpl]

'writer' @ [65:42] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[PropertyDescriptorImpl]

'commandReader' @ [66:9] ==> public open val commandReader: ReplCommandReader defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[PropertyDescriptorImpl]

'IdeReplCommandReader' @ [66:25] ==> public constructor IdeReplCommandReader() defined in org.jetbrains.kotlin.cli.jvm.repl.reader.IdeReplCommandReader[ClassConstructorDescriptorImpl]

'ReplTerminalDiagnosticMessageHolder' @ [78:45] ==> public constructor ReplTerminalDiagnosticMessageHolder() defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplTerminalDiagnosticMessageHolder[ClassConstructorDescriptorImpl]

'writer' @ [85:9] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ConsoleReplConfiguration[PropertyDescriptorImpl]

'ReplConsoleWriter' @ [85:18] ==> public constructor ReplConsoleWriter() defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplConsoleWriter[ClassConstructorDescriptorImpl]

'errorLogger' @ [86:9] ==> public open val errorLogger: ReplErrorLogger defined in org.jetbrains.kotlin.cli.jvm.repl.ConsoleReplConfiguration[PropertyDescriptorImpl]

'e' @ [88:23] ==> value-parameter e: Throwable defined in org.jetbrains.kotlin.cli.jvm.repl.ConsoleReplConfiguration.<init>.<no name provided>.logException[ValueParameterDescriptorImpl]

'commandReader' @ [92:9] ==> public open val commandReader: ReplCommandReader defined in org.jetbrains.kotlin.cli.jvm.repl.ConsoleReplConfiguration[PropertyDescriptorImpl]

'ConsoleReplCommandReader' @ [92:25] ==> public constructor ConsoleReplCommandReader() defined in org.jetbrains.kotlin.cli.jvm.repl.reader.ConsoleReplCommandReader[ClassConstructorDescriptorImpl]

'StringWriter' @ [102:33] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'PrintWriter' @ [103:32] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'errorStringWriter' @ [103:44] ==> val errorStringWriter: StringWriter defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[LocalVariableDescriptor]

'e' @ [104:9] ==> value-parameter e: Throwable defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[ValueParameterDescriptorImpl]

'printStackTrace' @ [104:11] ==> public open fun printStackTrace(p0: (PrintWriter..PrintWriter?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'errorPrintWriter' @ [104:27] ==> val errorPrintWriter: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[LocalVariableDescriptor]

'errorStringWriter' @ [106:28] ==> val errorStringWriter: StringWriter defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[LocalVariableDescriptor]

'toString' @ [106:46] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

'if (writerString.isEmpty()) "Unknown error" else writerString' @ [107:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'writerString' @ [107:37] ==> val writerString: String defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[LocalVariableDescriptor]

'isEmpty' @ [107:50] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'writerString' @ [107:82] ==> val writerString: String defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[LocalVariableDescriptor]

'replWriter' @ [109:9] ==> private final val replWriter: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger[PropertyDescriptorImpl]

'sendInternalErrorReport' @ [109:20] ==> public abstract fun sendInternalErrorReport(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'internalErrorText' @ [109:44] ==> val internalErrorText: String defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[LocalVariableDescriptor]

'e' @ [110:15] ==> value-parameter e: Throwable defined in org.jetbrains.kotlin.cli.jvm.repl.IdeReplErrorLogger.logException[ValueParameterDescriptorImpl]

