'Log' @ [32:5] ==> protected/*protected and package*/ constructor Log(p0: (Context..Context?), p1: (PrintWriter..PrintWriter?), p2: (PrintWriter..PrintWriter?), p3: (PrintWriter..PrintWriter?)) defined in com.sun.tools.javac.util.Log[JavaClassConstructorDescriptor]

'context' @ [32:9] ==> value-parameter context: Context defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.<init>[ValueParameterDescriptorImpl]

'errorWriter' @ [32:18] ==> value-parameter errorWriter: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.<init>[ValueParameterDescriptorImpl]

'warningWriter' @ [32:31] ==> value-parameter warningWriter: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.<init>[ValueParameterDescriptorImpl]

'infoWriter' @ [32:46] ==> value-parameter infoWriter: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.<init>[ValueParameterDescriptorImpl]

'context' @ [34:9] ==> value-parameter context: Context defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.<init>[ValueParameterDescriptorImpl]

'put' @ [34:17] ==> public open fun <T : (Any..Any?)> put(p0: (Context.Key<(PrintWriter..PrintWriter?)>..Context.Key<(PrintWriter..PrintWriter?)>?), p1: (PrintWriter..PrintWriter?)): Unit defined in com.sun.tools.javac.util.Context[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.PrintWriter..java.io.PrintWriter?)

'outKey' @ [34:25] ==> public final val outKey: (Context.Key<(PrintWriter..PrintWriter?)>..Context.Key<(PrintWriter..PrintWriter?)>?) defined in com.sun.tools.javac.util.Log[JavaPropertyDescriptor]

'infoWriter' @ [34:33] ==> value-parameter infoWriter: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.<init>[ValueParameterDescriptorImpl]

'context' @ [41:13] ==> value-parameter context: Context defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.Companion.preRegister[ValueParameterDescriptorImpl]

'put' @ [41:21] ==> public open fun <T : (Any..Any?)> put(p0: (Context.Key<(Log..Log?)>..Context.Key<(Log..Log?)>?), p1: (Context.Factory<(Log..Log?)>..Context.Factory<(Log..Log?)>?)): Unit defined in com.sun.tools.javac.util.Context[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.sun.tools.javac.util.Log..com.sun.tools.javac.util.Log?)

'logKey' @ [41:29] ==> public final val logKey: (Context.Key<(Log..Log?)>..Context.Key<(Log..Log?)>?) defined in com.sun.tools.javac.util.Log[JavaPropertyDescriptor]

'Factory' @ [41:45] ==> public final fun <T : (Any..Any?)> Factory(function: ((Context..Context?)) -> (Log..Log?)): Context.Factory<Log> defined in com.sun.tools.javac.util.Context[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Log

'JavacLogger' @ [42:17] ==> public constructor JavacLogger(context: Context, errorWriter: PrintWriter, warningWriter: PrintWriter, infoWriter: PrintWriter) defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger[ClassConstructorDescriptorImpl]

'it' @ [42:29] ==> value-parameter it: (Context..Context?) defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.Companion.preRegister.<anonymous>[ValueParameterDescriptorImpl]

'PrintWriter' @ [43:29] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'MessageCollectorAdapter' @ [43:41] ==> public constructor MessageCollectorAdapter(messageCollector: MessageCollector, severity: CompilerMessageSeverity) defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter[ClassConstructorDescriptorImpl]

'messageCollector' @ [43:65] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.Companion.preRegister[ValueParameterDescriptorImpl]

'ERROR' @ [43:107] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'PrintWriter' @ [44:29] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'MessageCollectorAdapter' @ [44:41] ==> public constructor MessageCollectorAdapter(messageCollector: MessageCollector, severity: CompilerMessageSeverity) defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter[ClassConstructorDescriptorImpl]

'messageCollector' @ [44:65] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.Companion.preRegister[ValueParameterDescriptorImpl]

'WARNING' @ [44:107] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'PrintWriter' @ [45:29] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'MessageCollectorAdapter' @ [45:41] ==> public constructor MessageCollectorAdapter(messageCollector: MessageCollector, severity: CompilerMessageSeverity) defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter[ClassConstructorDescriptorImpl]

'messageCollector' @ [45:65] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.Companion.preRegister[ValueParameterDescriptorImpl]

'INFO' @ [45:107] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'Writer' @ [54:5] ==> protected/*protected and package*/ constructor Writer() defined in java.io.Writer[JavaClassConstructorDescriptor]

'length' @ [56:13] ==> value-parameter length: Int defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter.write[ValueParameterDescriptorImpl]

'buffer' @ [56:28] ==> value-parameter buffer: CharArray defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter.write[ValueParameterDescriptorImpl]

'messageCollector' @ [58:9] ==> private final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter[PropertyDescriptorImpl]

'report' @ [58:26] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'severity' @ [58:33] ==> private final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter[PropertyDescriptorImpl]

'String' @ [58:43] ==> @InlineOnly public inline fun String(chars: CharArray, offset: Int, length: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'buffer' @ [58:50] ==> value-parameter buffer: CharArray defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter.write[ValueParameterDescriptorImpl]

'offset' @ [58:58] ==> value-parameter offset: Int defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter.write[ValueParameterDescriptorImpl]

'length' @ [58:66] ==> value-parameter length: Int defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter.write[ValueParameterDescriptorImpl]

'messageCollector' @ [62:10] ==> private final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter[PropertyDescriptorImpl]

'flush' @ [62:58] ==> public open fun flush(): Unit defined in org.jetbrains.kotlin.cli.common.messages.GroupingMessageCollector[JavaMethodDescriptor]

'flush' @ [65:28] ==> public open fun flush(): Unit defined in org.jetbrains.kotlin.cli.jvm.javac.MessageCollectorAdapter[SimpleFunctionDescriptorImpl]

