'exec' @ [36:16] ==> protected final fun exec(errStream: PrintStream, services: Services, messageRenderer: MessageRenderer, args: Array<out String>): ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]

'errStream' @ [36:21] ==> value-parameter errStream: PrintStream defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'Services' @ [36:32] ==> public companion object defined in org.jetbrains.kotlin.config.Services[FakeCallableDescriptorForObject]

'EMPTY' @ [36:41] ==> @field:JvmField public final val EMPTY: Services defined in org.jetbrains.kotlin.config.Services.Companion[DeserializedPropertyDescriptor]

'PLAIN_RELATIVE_PATHS' @ [36:64] ==> public final val PLAIN_RELATIVE_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'args' @ [36:86] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'K2JVMCompiler' @ [45:9] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[FakeCallableDescriptorForObject]

'resetInitStartTime' @ [45:23] ==> public final fun resetInitStartTime(): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'createArguments' @ [47:25] ==> public abstract fun createArguments(): A defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]

'parseCommandLineArguments' @ [48:9] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: A): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> A

'args' @ [48:35] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'asList' @ [48:40] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arguments' @ [48:50] ==> val arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'PrintingMessageCollector' @ [49:25] ==> public constructor PrintingMessageCollector(@NotNull errStream: PrintStream, @NotNull messageRenderer: MessageRenderer, verbose: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'errStream' @ [49:50] ==> value-parameter errStream: PrintStream defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'messageRenderer' @ [49:61] ==> value-parameter messageRenderer: MessageRenderer defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'arguments' @ [49:78] ==> val arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'verbose' @ [49:88] ==> @GradleOption @Argument public final var verbose: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'COLOR_ENABLED' @ [52:42] ==> public const final val COLOR_ENABLED: Boolean defined in org.jetbrains.kotlin.cli.common.messages.PlainTextMessageRenderer[JavaPropertyDescriptor]

'systemInstall' @ [53:29] ==> public open fun systemInstall(): Unit defined in org.fusesource.jansi.AnsiConsole[JavaMethodDescriptor]

'errStream' @ [56:13] ==> value-parameter errStream: PrintStream defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'print' @ [56:23] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'messageRenderer' @ [56:29] ==> value-parameter messageRenderer: MessageRenderer defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'renderPreamble' @ [56:45] ==> public abstract fun renderPreamble(): (String..String?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaMethodDescriptor]

'validateArguments' @ [58:32] ==> public fun validateArguments(errors: ArgumentParseErrors): String? defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]

'arguments' @ [58:50] ==> val arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'errors' @ [58:60] ==> public final var errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'errorMessage' @ [59:17] ==> val errorMessage: String? defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'collector' @ [60:17] ==> val collector: PrintingMessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'report' @ [60:27] ==> @Override public open fun report(@NotNull severity: CompilerMessageSeverity, @NotNull message: String, @Nullable location: CompilerMessageLocation?): Unit defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaMethodDescriptor]

'ERROR' @ [60:58] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'errorMessage' @ [60:65] ==> val errorMessage: String? defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'collector' @ [61:17] ==> val collector: PrintingMessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'report' @ [61:27] ==> @Override public open fun report(@NotNull severity: CompilerMessageSeverity, @NotNull message: String, @Nullable location: CompilerMessageLocation?): Unit defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaMethodDescriptor]

'INFO' @ [61:58] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'COMPILATION_ERROR' @ [62:33] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'arguments' @ [65:17] ==> val arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'help' @ [65:27] ==> @Argument public final var help: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'arguments' @ [65:35] ==> val arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'extraHelp' @ [65:45] ==> @Argument public final var extraHelp: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'errStream' @ [66:17] ==> value-parameter errStream: PrintStream defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'print' @ [66:27] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'messageRenderer' @ [66:33] ==> value-parameter messageRenderer: MessageRenderer defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'renderUsage' @ [66:49] ==> public abstract fun renderUsage(@NotNull usage: String): (String..String?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaMethodDescriptor]

'render' @ [66:67] ==> @NotNull public open fun <A : (CommonToolArguments..CommonToolArguments?)> render(@NotNull tool: CLITool<(A..A?)>, @NotNull arguments: A): String defined in org.jetbrains.kotlin.cli.common.Usage[JavaMethodDescriptor]
Inferred types:
    <A : (CommonToolArguments..CommonToolArguments?)> -> A

'this' @ [66:74] ==> <this> defined in org.jetbrains.kotlin.cli.common.CLITool[LazyClassReceiverParameterDescriptor]

'arguments' @ [66:80] ==> val arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'OK' @ [67:33] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'exec' @ [70:20] ==> public final fun exec(messageCollector: MessageCollector, services: Services, arguments: A): ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]

'collector' @ [70:25] ==> val collector: PrintingMessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'services' @ [70:36] ==> value-parameter services: Services defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'arguments' @ [70:46] ==> val arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'errStream' @ [73:13] ==> value-parameter errStream: PrintStream defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'print' @ [73:23] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'messageRenderer' @ [73:29] ==> value-parameter messageRenderer: MessageRenderer defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'renderConclusion' @ [73:45] ==> public abstract fun renderConclusion(): (String..String?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaMethodDescriptor]

'COLOR_ENABLED' @ [75:42] ==> public const final val COLOR_ENABLED: Boolean defined in org.jetbrains.kotlin.cli.common.messages.PlainTextMessageRenderer[JavaPropertyDescriptor]

'systemUninstall' @ [76:29] ==> public open fun systemUninstall(): Unit defined in org.fusesource.jansi.AnsiConsole[JavaMethodDescriptor]

'printVersionIfNeeded' @ [82:9] ==> private final fun <A : CommonToolArguments> printVersionIfNeeded(messageCollector: MessageCollector, arguments: A): Unit defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]
Inferred types:
    <A : CommonToolArguments> -> A

'messageCollector' @ [82:30] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'arguments' @ [82:48] ==> value-parameter arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'if (arguments.suppressWarnings) {
            FilteringMessageCollector(messageCollector, Predicate.isEqual(CompilerMessageSeverity.WARNING))
        }
        else {
            messageCollector
        }' @ [84:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MessageCollector, elseBranch: MessageCollector): MessageCollector[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MessageCollector

'arguments' @ [84:41] ==> value-parameter arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'suppressWarnings' @ [84:51] ==> @GradleOption @Argument public final var suppressWarnings: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'FilteringMessageCollector' @ [85:13] ==> public constructor FilteringMessageCollector(@NotNull p0: MessageCollector, @NotNull p1: Predicate<(CompilerMessageSeverity..CompilerMessageSeverity?)>) defined in org.jetbrains.kotlin.cli.common.messages.FilteringMessageCollector[JavaClassConstructorDescriptor]

'messageCollector' @ [85:39] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'isEqual' @ [85:67] ==> public open fun <T : (Any..Any?)> isEqual(p0: (Any..Any?)): (Predicate<(CompilerMessageSeverity..CompilerMessageSeverity?)>..Predicate<(CompilerMessageSeverity..CompilerMessageSeverity?)>?) defined in java.util.function.Predicate[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompilerMessageSeverity

'WARNING' @ [85:99] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'messageCollector' @ [88:13] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'reportArgumentParseProblems' @ [91:9] ==> private final fun reportArgumentParseProblems(collector: MessageCollector, errors: ArgumentParseErrors): Unit defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]

'fixedMessageCollector' @ [91:37] ==> val fixedMessageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'arguments' @ [91:60] ==> value-parameter arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'errors' @ [91:70] ==> public final var errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'execImpl' @ [92:16] ==> protected abstract fun execImpl(messageCollector: MessageCollector, services: Services, arguments: A): ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]

'fixedMessageCollector' @ [92:25] ==> val fixedMessageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.exec[LocalVariableDescriptor]

'services' @ [92:48] ==> value-parameter services: Services defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'arguments' @ [92:58] ==> value-parameter arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.exec[ValueParameterDescriptorImpl]

'parseCommandLineArguments' @ [102:9] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: A): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> A

'args' @ [102:35] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.cli.common.CLITool.parseArguments[ValueParameterDescriptorImpl]

'asList' @ [102:40] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arguments' @ [102:50] ==> value-parameter arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.parseArguments[ValueParameterDescriptorImpl]

'validateArguments' @ [103:23] ==> public fun validateArguments(errors: ArgumentParseErrors): String? defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]

'arguments' @ [103:41] ==> value-parameter arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.parseArguments[ValueParameterDescriptorImpl]

'errors' @ [103:51] ==> public final var errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'message' @ [104:13] ==> val message: String? defined in org.jetbrains.kotlin.cli.common.CLITool.parseArguments[LocalVariableDescriptor]

'IllegalArgumentException' @ [105:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'message' @ [105:44] ==> val message: String? defined in org.jetbrains.kotlin.cli.common.CLITool.parseArguments[LocalVariableDescriptor]

'errors' @ [110:22] ==> value-parameter errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'unknownExtraFlags' @ [110:29] ==> public final val unknownExtraFlags: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.ArgumentParseErrors[DeserializedPropertyDescriptor]

'collector' @ [111:13] ==> value-parameter collector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'report' @ [111:23] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [111:30] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'flag' @ [111:103] ==> val flag: String defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[LocalVariableDescriptor]

'errors' @ [113:26] ==> value-parameter errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'extraArgumentsPassedInObsoleteForm' @ [113:33] ==> public final val extraArgumentsPassedInObsoleteForm: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.ArgumentParseErrors[DeserializedPropertyDescriptor]

'collector' @ [114:13] ==> value-parameter collector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'report' @ [114:23] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [114:30] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'+' @ [114:46] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'argument' @ [115:70] ==> val argument: String defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[LocalVariableDescriptor]

'component1' @ [117:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'component2' @ [117:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'errors' @ [117:30] ==> value-parameter errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'duplicateArguments' @ [117:37] ==> public final val duplicateArguments: MutableMap<String, String> defined in org.jetbrains.kotlin.cli.common.arguments.ArgumentParseErrors[DeserializedPropertyDescriptor]

'collector' @ [118:13] ==> value-parameter collector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'report' @ [118:23] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [118:30] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'key' @ [118:57] ==> val key: String defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[LocalVariableDescriptor]

'value' @ [118:122] ==> val value: String defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[LocalVariableDescriptor]

'component1' @ [120:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'component2' @ [120:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'errors' @ [120:43] ==> value-parameter errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'deprecatedArguments' @ [120:50] ==> public final val deprecatedArguments: MutableMap<String, String> defined in org.jetbrains.kotlin.cli.common.arguments.ArgumentParseErrors[DeserializedPropertyDescriptor]

'collector' @ [121:13] ==> value-parameter collector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[ValueParameterDescriptorImpl]

'report' @ [121:23] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [121:30] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'deprecatedName' @ [121:57] ==> val deprecatedName: String defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[LocalVariableDescriptor]

'newName' @ [121:99] ==> val newName: String defined in org.jetbrains.kotlin.cli.common.CLITool.reportArgumentParseProblems[LocalVariableDescriptor]

'arguments' @ [126:13] ==> value-parameter arguments: A defined in org.jetbrains.kotlin.cli.common.CLITool.printVersionIfNeeded[ValueParameterDescriptorImpl]

'version' @ [126:23] ==> @Argument public final var version: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonToolArguments[DeserializedPropertyDescriptor]

'getProperty' @ [127:37] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'messageCollector' @ [128:13] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.CLITool.printVersionIfNeeded[ValueParameterDescriptorImpl]

'report' @ [128:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'INFO' @ [128:37] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'executableScriptFileName' @ [128:46] ==> public abstract fun executableScriptFileName(): String defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]

'VERSION' @ [128:98] ==> public const final val VERSION: String defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaPropertyDescriptor]

'jreVersion' @ [128:113] ==> val jreVersion: (String..String?) defined in org.jetbrains.kotlin.cli.common.CLITool.printVersionIfNeeded[LocalVariableDescriptor]

'JvmStatic' @ [138:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'==' @ [142:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [142:24] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'setProperty' @ [143:24] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'==' @ [145:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [145:24] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_COLORS_ENABLED_PROPERTY' @ [145:61] ==> public const final val KOTLIN_COLORS_ENABLED_PROPERTY: String defined in org.jetbrains.kotlin.cli.common.messages.PlainTextMessageRenderer[JavaPropertyDescriptor]

'setProperty' @ [146:24] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_COLORS_ENABLED_PROPERTY' @ [146:61] ==> public const final val KOTLIN_COLORS_ENABLED_PROPERTY: String defined in org.jetbrains.kotlin.cli.common.messages.PlainTextMessageRenderer[JavaPropertyDescriptor]

'doMainNoExit' @ [148:28] ==> @JvmStatic public final fun doMainNoExit(compiler: CLITool<*>, args: Array<String>): ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool.Companion[SimpleFunctionDescriptorImpl]

'compiler' @ [148:41] ==> value-parameter compiler: CLITool<*> defined in org.jetbrains.kotlin.cli.common.CLITool.Companion.doMain[ValueParameterDescriptorImpl]

'args' @ [148:51] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.cli.common.CLITool.Companion.doMain[ValueParameterDescriptorImpl]

'exitCode' @ [149:17] ==> val exitCode: ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool.Companion.doMain[LocalVariableDescriptor]

'OK' @ [149:38] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'exit' @ [150:24] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'exitCode' @ [150:29] ==> val exitCode: ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool.Companion.doMain[LocalVariableDescriptor]

'code' @ [150:38] ==> public final val ExitCode.code: Int[MyPropertyDescriptor]

'JvmStatic' @ [154:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'compiler' @ [157:24] ==> value-parameter compiler: CLITool<*> defined in org.jetbrains.kotlin.cli.common.CLITool.Companion.doMainNoExit[ValueParameterDescriptorImpl]

'exec' @ [157:33] ==> public final fun exec(errStream: PrintStream, vararg args: String): ExitCode defined in org.jetbrains.kotlin.cli.common.CLITool[SimpleFunctionDescriptorImpl]

'err' @ [157:45] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'args' @ [157:51] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.cli.common.CLITool.Companion.doMainNoExit[ValueParameterDescriptorImpl]

'err' @ [160:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [160:28] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'e' @ [160:36] ==> val e: CompileEnvironmentException defined in org.jetbrains.kotlin.cli.common.CLITool.Companion.doMainNoExit[LocalVariableDescriptor]

'message' @ [160:38] ==> public open val message: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.CompileEnvironmentException[DeserializedPropertyDescriptor]

'INTERNAL_ERROR' @ [161:33] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

