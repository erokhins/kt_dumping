'replConfiguration' @ [39:26] ==> value-parameter replConfiguration: ReplConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.<init>[ValueParameterDescriptorImpl]

'newSingleThreadExecutor' @ [40:70] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'submit' @ [40:96] ==> public abstract fun <T : (Any..Any?)> submit(p0: (Callable<(ReplInterpreter..ReplInterpreter?)>..Callable<(ReplInterpreter..ReplInterpreter?)>?)): (Future<(ReplInterpreter..ReplInterpreter?)>..Future<(ReplInterpreter..ReplInterpreter?)>?) defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ReplInterpreter

'Callable' @ [40:103] ==> @FunctionalInterface public fun <V : (Any..Any?)> Callable(function: () -> (ReplInterpreter..ReplInterpreter?)): Callable<ReplInterpreter> defined in java.util.concurrent[SimpleFunctionDescriptorImpl]
Inferred types:
    <V : (Any..Any?)> -> ReplInterpreter

'ReplInterpreter' @ [41:9] ==> public constructor ReplInterpreter(disposable: Disposable, configuration: CompilerConfiguration, replConfiguration: ReplConfiguration) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[ClassConstructorDescriptorImpl]

'disposable' @ [41:25] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.<init>[ValueParameterDescriptorImpl]

'compilerConfiguration' @ [41:37] ==> value-parameter compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.<init>[ValueParameterDescriptorImpl]

'replConfiguration' @ [41:60] ==> value-parameter replConfiguration: ReplConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.<init>[ValueParameterDescriptorImpl]

'replInitializer' @ [45:17] ==> private final val replInitializer: Future<ReplInterpreter> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'get' @ [45:33] ==> public abstract fun get(): (ReplInterpreter..ReplInterpreter?) defined in java.util.concurrent.Future[JavaMethodDescriptor]

'compilerConfiguration' @ [47:54] ==> value-parameter compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.<init>[ValueParameterDescriptorImpl]

'getNotNull' @ [47:76] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [47:108] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'writer' @ [51:13] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'printlnWelcomeMessage' @ [51:20] ==> public abstract fun printlnWelcomeMessage(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'+' @ [51:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'VERSION' @ [51:93] ==> public const final val VERSION: String defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaPropertyDescriptor]

'getProperty' @ [52:57] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'writer' @ [53:13] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'printlnWelcomeMessage' @ [53:20] ==> public abstract fun printlnWelcomeMessage(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'messageCollector' @ [56:29] ==> private final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'hasErrors' @ [56:46] ==> public abstract fun hasErrors(): Boolean defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [57:14] ==> private final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'flush' @ [57:62] ==> public open fun flush(): Unit defined in org.jetbrains.kotlin.cli.common.messages.GroupingMessageCollector[JavaMethodDescriptor]

'hasErrors' @ [58:17] ==> val hasErrors: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.doRun[LocalVariableDescriptor]

'READ_LINE' @ [60:45] ==> enum entry READ_LINE defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'next' @ [62:17] ==> var next: ReplFromTerminal.WhatNextAfterOneLine defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.doRun[LocalVariableDescriptor]

'one' @ [62:24] ==> private final fun one(next: ReplFromTerminal.WhatNextAfterOneLine): ReplFromTerminal.WhatNextAfterOneLine defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[SimpleFunctionDescriptorImpl]

'next' @ [62:28] ==> var next: ReplFromTerminal.WhatNextAfterOneLine defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.doRun[LocalVariableDescriptor]

'next' @ [63:21] ==> var next: ReplFromTerminal.WhatNextAfterOneLine defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.doRun[LocalVariableDescriptor]

'QUIT' @ [63:50] ==> enum entry QUIT defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'errorLogger' @ [69:13] ==> public open val errorLogger: ReplErrorLogger defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'logException' @ [69:25] ==> public abstract fun logException(e: Throwable): Nothing defined in org.jetbrains.kotlin.cli.jvm.repl.ReplErrorLogger[SimpleFunctionDescriptorImpl]

'e' @ [69:38] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.doRun[LocalVariableDescriptor]

'commandReader' @ [73:17] ==> public open val commandReader: ReplCommandReader defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'flushHistory' @ [73:31] ==> public abstract fun flushHistory(): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.reader.ReplCommandReader[SimpleFunctionDescriptorImpl]

'errorLogger' @ [76:17] ==> public open val errorLogger: ReplErrorLogger defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'logException' @ [76:29] ==> public abstract fun logException(e: Throwable): Nothing defined in org.jetbrains.kotlin.cli.jvm.repl.ReplErrorLogger[SimpleFunctionDescriptorImpl]

'e' @ [76:42] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.doRun[LocalVariableDescriptor]

'commandReader' @ [89:20] ==> public open val commandReader: ReplCommandReader defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'readLine' @ [89:34] ==> public abstract fun readLine(next: ReplFromTerminal.WhatNextAfterOneLine): String? defined in org.jetbrains.kotlin.cli.jvm.repl.reader.ReplCommandReader[SimpleFunctionDescriptorImpl]

'next' @ [89:43] ==> value-parameter next: ReplFromTerminal.WhatNextAfterOneLine defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[ValueParameterDescriptorImpl]

'QUIT' @ [89:80] ==> enum entry QUIT defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'line' @ [91:9] ==> var line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'unescapeLineBreaks' @ [91:16] ==> public fun unescapeLineBreaks(s: String): String defined in org.jetbrains.kotlin.cli.jvm.repl.messages[SimpleFunctionDescriptorImpl]

'line' @ [91:35] ==> var line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'line' @ [93:13] ==> var line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'startsWith' @ [93:18] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'line' @ [93:38] ==> var line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'length' @ [93:43] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'line' @ [93:58] ==> var line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'get' @ [93:63] ==> public open fun get(index: Int): Char defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'oneCommand' @ [94:27] ==> @Throws private final fun oneCommand(command: String): Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[SimpleFunctionDescriptorImpl]

'line' @ [94:38] ==> var line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'substring' @ [94:43] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (notQuit) WhatNextAfterOneLine.READ_LINE else WhatNextAfterOneLine.QUIT' @ [95:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReplFromTerminal.WhatNextAfterOneLine, elseBranch: ReplFromTerminal.WhatNextAfterOneLine): ReplFromTerminal.WhatNextAfterOneLine[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> WhatNextAfterOneLine

'notQuit' @ [95:24] ==> val notQuit: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'READ_LINE' @ [95:54] ==> enum entry READ_LINE defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'QUIT' @ [95:90] ==> enum entry QUIT defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'eval' @ [98:26] ==> private final fun eval(line: String): ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[SimpleFunctionDescriptorImpl]

'line' @ [98:31] ==> var line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'if (lineResult is ReplEvalResult.Incomplete) {
            WhatNextAfterOneLine.INCOMPLETE
        }
        else {
            WhatNextAfterOneLine.READ_LINE
        }' @ [99:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReplFromTerminal.WhatNextAfterOneLine, elseBranch: ReplFromTerminal.WhatNextAfterOneLine): ReplFromTerminal.WhatNextAfterOneLine[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> WhatNextAfterOneLine

'lineResult' @ [99:20] ==> val lineResult: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.one[LocalVariableDescriptor]

'INCOMPLETE' @ [100:34] ==> enum entry INCOMPLETE defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'READ_LINE' @ [103:34] ==> enum entry READ_LINE defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'replInterpreter' @ [108:26] ==> private final val replInterpreter: ReplInterpreter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'eval' @ [108:42] ==> public final fun eval(line: String): ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[SimpleFunctionDescriptorImpl]

'line' @ [108:47] ==> value-parameter line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.eval[ValueParameterDescriptorImpl]

'when (evalResult) {
            is ReplEvalResult.ValueResult, is ReplEvalResult.UnitResult -> {
                writer.notifyCommandSuccess()
                if (evalResult is ReplEvalResult.ValueResult) {
                    writer.outputCommandResult(evalResult.value.toString())
                }
            }
            is ReplEvalResult.Error.Runtime -> writer.outputRuntimeError(evalResult.message)
            is ReplEvalResult.Error.CompileTime -> writer.outputRuntimeError(evalResult.message)
            is ReplEvalResult.Incomplete -> writer.notifyIncomplete()
        }' @ [109:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'evalResult' @ [109:15] ==> val evalResult: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.eval[LocalVariableDescriptor]

'writer' @ [111:17] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'notifyCommandSuccess' @ [111:24] ==> public abstract fun notifyCommandSuccess(): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'evalResult' @ [112:21] ==> val evalResult: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.eval[LocalVariableDescriptor]

'writer' @ [113:21] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'outputCommandResult' @ [113:28] ==> public abstract fun outputCommandResult(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'evalResult' @ [113:48] ==> val evalResult: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.eval[LocalVariableDescriptor]

'value' @ [113:59] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'toString' @ [113:65] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'writer' @ [116:48] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'outputRuntimeError' @ [116:55] ==> public abstract fun outputRuntimeError(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'evalResult' @ [116:74] ==> val evalResult: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.eval[LocalVariableDescriptor]

'message' @ [116:85] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error.Runtime[DeserializedPropertyDescriptor]

'writer' @ [117:52] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'outputRuntimeError' @ [117:59] ==> public abstract fun outputRuntimeError(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'evalResult' @ [117:78] ==> val evalResult: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.eval[LocalVariableDescriptor]

'message' @ [117:89] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error.CompileTime[DeserializedPropertyDescriptor]

'writer' @ [118:45] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'notifyIncomplete' @ [118:52] ==> public abstract fun notifyIncomplete(): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'evalResult' @ [120:16] ==> val evalResult: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.eval[LocalVariableDescriptor]

'Throws' @ [123:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [123:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'splitCommand' @ [125:21] ==> private final fun splitCommand(command: String): List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion[SimpleFunctionDescriptorImpl]

'command' @ [125:34] ==> value-parameter command: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[ValueParameterDescriptorImpl]

'if (split.size >= 1 && command == "help") {
            writer.printlnHelpMessage("Available commands:\n" +
                                      ":help                   show this help\n" +
                                      ":quit                   exit the interpreter\n" +
                                      ":dump bytecode          dump classes to terminal\n" +
                                      ":load <file>            load script from specified file")
            return true
        }
        else if (split.size >= 2 && split[0] == "dump" && split[1] == "bytecode") {
            replInterpreter.dumpClasses(PrintWriter(System.out))
            return true
        }
        else if (split.size >= 1 && split[0] == "quit") {
            return false
        }
        else if (split.size >= 2 && split[0] == "load") {
            val fileName = split[1]
            val scriptText = FileUtil.loadFile(File(fileName))
            eval(scriptText)
            return true
        }
        else {
            writer.printlnHelpMessage("Unknown command\n" + "Type :help for help")
            return true
        }' @ [126:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'split' @ [126:13] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'size' @ [126:19] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'command' @ [126:32] ==> value-parameter command: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[ValueParameterDescriptorImpl]

'writer' @ [127:13] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'printlnHelpMessage' @ [127:20] ==> public abstract fun printlnHelpMessage(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'+' @ [127:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (split.size >= 2 && split[0] == "dump" && split[1] == "bytecode") {
            replInterpreter.dumpClasses(PrintWriter(System.out))
            return true
        }
        else if (split.size >= 1 && split[0] == "quit") {
            return false
        }
        else if (split.size >= 2 && split[0] == "load") {
            val fileName = split[1]
            val scriptText = FileUtil.loadFile(File(fileName))
            eval(scriptText)
            return true
        }
        else {
            writer.printlnHelpMessage("Unknown command\n" + "Type :help for help")
            return true
        }' @ [134:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'split' @ [134:18] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'size' @ [134:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'split' @ [134:37] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'split' @ [134:59] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'replInterpreter' @ [135:13] ==> private final val replInterpreter: ReplInterpreter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'dumpClasses' @ [135:29] ==> public final fun dumpClasses(out: PrintWriter): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[SimpleFunctionDescriptorImpl]

'PrintWriter' @ [135:41] ==> public constructor PrintWriter(p0: (OutputStream..OutputStream?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'out' @ [135:60] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'if (split.size >= 1 && split[0] == "quit") {
            return false
        }
        else if (split.size >= 2 && split[0] == "load") {
            val fileName = split[1]
            val scriptText = FileUtil.loadFile(File(fileName))
            eval(scriptText)
            return true
        }
        else {
            writer.printlnHelpMessage("Unknown command\n" + "Type :help for help")
            return true
        }' @ [138:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'split' @ [138:18] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'size' @ [138:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'split' @ [138:37] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'if (split.size >= 2 && split[0] == "load") {
            val fileName = split[1]
            val scriptText = FileUtil.loadFile(File(fileName))
            eval(scriptText)
            return true
        }
        else {
            writer.printlnHelpMessage("Unknown command\n" + "Type :help for help")
            return true
        }' @ [141:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'split' @ [141:18] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'size' @ [141:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'split' @ [141:37] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'split' @ [142:28] ==> val split: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'loadFile' @ [143:39] ==> @NotNull public open fun loadFile(@NotNull p0: File): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [143:48] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'fileName' @ [143:53] ==> val fileName: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'eval' @ [144:13] ==> private final fun eval(line: String): ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[SimpleFunctionDescriptorImpl]

'scriptText' @ [144:18] ==> val scriptText: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.oneCommand[LocalVariableDescriptor]

'writer' @ [148:13] ==> public open val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[PropertyDescriptorImpl]

'printlnHelpMessage' @ [148:20] ==> public abstract fun printlnHelpMessage(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'+' @ [148:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'asList' @ [155:27] ==> @SafeVarargs public open fun <T : (Any..Any?)> asList(vararg p0: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'command' @ [155:35] ==> value-parameter command: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion.splitCommand[ValueParameterDescriptorImpl]

'split' @ [155:43] ==> @InlineOnly public inline fun CharSequence.split(regex: Regex, limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [155:53] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dropLastWhile' @ [155:64] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [155:78] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'toTypedArray' @ [155:95] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'==' @ [159:31] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [159:38] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'if (replIdeMode) ReplForIdeConfiguration() else ConsoleReplConfiguration()' @ [160:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReplConfiguration, elseBranch: ReplConfiguration): ReplConfiguration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReplConfiguration

'replIdeMode' @ [160:41] ==> val replIdeMode: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion.run[LocalVariableDescriptor]

'ReplForIdeConfiguration' @ [160:54] ==> public constructor ReplForIdeConfiguration() defined in org.jetbrains.kotlin.cli.jvm.repl.ReplForIdeConfiguration[ClassConstructorDescriptorImpl]

'ConsoleReplConfiguration' @ [160:85] ==> public constructor ConsoleReplConfiguration() defined in org.jetbrains.kotlin.cli.jvm.repl.ConsoleReplConfiguration[ClassConstructorDescriptorImpl]

'ReplFromTerminal' @ [162:17] ==> public constructor ReplFromTerminal(disposable: Disposable, compilerConfiguration: CompilerConfiguration, replConfiguration: ReplConfiguration) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[ClassConstructorDescriptorImpl]

'disposable' @ [162:34] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion.run[ValueParameterDescriptorImpl]

'configuration' @ [162:46] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion.run[ValueParameterDescriptorImpl]

'replConfiguration' @ [162:61] ==> val replConfiguration: ReplConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion.run[LocalVariableDescriptor]

'doRun' @ [162:80] ==> private final fun doRun(): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[SimpleFunctionDescriptorImpl]

'replConfiguration' @ [165:17] ==> val replConfiguration: ReplConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion.run[LocalVariableDescriptor]

'errorLogger' @ [165:35] ==> public abstract val errorLogger: ReplErrorLogger defined in org.jetbrains.kotlin.cli.jvm.repl.ReplConfiguration[PropertyDescriptorImpl]

'logException' @ [165:47] ==> public abstract fun logException(e: Throwable): Nothing defined in org.jetbrains.kotlin.cli.jvm.repl.ReplErrorLogger[SimpleFunctionDescriptorImpl]

'e' @ [165:60] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion.run[LocalVariableDescriptor]

