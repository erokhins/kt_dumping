'builder' @ [28:48] ==> public open fun builder(): (LineReaderBuilder..LineReaderBuilder?) defined in org.jline.reader.LineReaderBuilder[JavaMethodDescriptor]

'appName' @ [29:14] ==> public open fun appName(p0: (String..String?)): (LineReaderBuilder..LineReaderBuilder?) defined in org.jline.reader.LineReaderBuilder[JavaMethodDescriptor]

'terminal' @ [30:14] ==> public open fun terminal(p0: (Terminal..Terminal?)): (LineReaderBuilder..LineReaderBuilder?) defined in org.jline.reader.LineReaderBuilder[JavaMethodDescriptor]

'terminal' @ [30:39] ==> public open fun terminal(): (Terminal..Terminal?) defined in org.jline.terminal.TerminalBuilder[JavaMethodDescriptor]

'variable' @ [31:14] ==> public open fun variable(p0: (String..String?), p1: (Any..Any?)): (LineReaderBuilder..LineReaderBuilder?) defined in org.jline.reader.LineReaderBuilder[JavaMethodDescriptor]

'HISTORY_FILE' @ [31:34] ==> public const final val HISTORY_FILE: String defined in org.jline.reader.LineReader[JavaPropertyDescriptor]

'File' @ [31:48] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [31:53] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getProperty' @ [31:65] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'absolutePath' @ [31:112] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'build' @ [32:14] ==> public open fun build(): (LineReader..LineReader?) defined in org.jline.reader.LineReaderBuilder[JavaMethodDescriptor]

'apply' @ [33:14] ==> @InlineOnly public inline fun <T> (LineReader..LineReader?).apply(block: (LineReader..LineReader?).() -> Unit): (LineReader..LineReader?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jline.reader.LineReader..org.jline.reader.LineReader?)

'setOpt' @ [34:17] ==> public abstract fun setOpt(p0: (LineReader.Option..LineReader.Option?)): Unit defined in org.jline.reader.LineReader[JavaMethodDescriptor]

'DISABLE_EVENT_EXPANSION' @ [34:42] ==> enum entry DISABLE_EVENT_EXPANSION defined in org.jline.reader.LineReader.Option[FakeCallableDescriptorForObject]

'if (next == ReplFromTerminal.WhatNextAfterOneLine.INCOMPLETE) "... " else ">>> "' @ [38:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'next' @ [38:26] ==> value-parameter next: ReplFromTerminal.WhatNextAfterOneLine defined in org.jetbrains.kotlin.cli.jvm.repl.reader.ConsoleReplCommandReader.readLine[ValueParameterDescriptorImpl]

'INCOMPLETE' @ [38:72] ==> enum entry INCOMPLETE defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.WhatNextAfterOneLine[FakeCallableDescriptorForObject]

'lineReader' @ [40:20] ==> private final val lineReader: (LineReader..LineReader?) defined in org.jetbrains.kotlin.cli.jvm.repl.reader.ConsoleReplCommandReader[PropertyDescriptorImpl]

'readLine' @ [40:31] ==> public abstract fun readLine(p0: (String..String?)): (String..String?) defined in org.jline.reader.LineReader[JavaMethodDescriptor]

'prompt' @ [40:40] ==> val prompt: String defined in org.jetbrains.kotlin.cli.jvm.repl.reader.ConsoleReplCommandReader.readLine[LocalVariableDescriptor]

'println' @ [43:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'out' @ [44:20] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [44:24] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'lineReader' @ [52:35] ==> private final val lineReader: (LineReader..LineReader?) defined in org.jetbrains.kotlin.cli.jvm.repl.reader.ConsoleReplCommandReader[PropertyDescriptorImpl]

'history' @ [52:46] ==> public final val LineReader.history: (History..History?)[MyPropertyDescriptor]

'save' @ [52:54] ==> public abstract fun save(): Unit defined in org.jline.reader.History[JavaMethodDescriptor]

