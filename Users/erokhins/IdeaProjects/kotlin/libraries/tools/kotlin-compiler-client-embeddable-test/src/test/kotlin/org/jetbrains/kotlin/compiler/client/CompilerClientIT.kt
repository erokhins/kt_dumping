'JvmField' @ [36:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Rule' @ [37:5] ==> public constructor Rule() defined in org.junit.Rule[JavaClassConstructorDescriptor]

'TemporaryFolder' @ [38:22] ==> public constructor TemporaryFolder() defined in org.junit.rules.TemporaryFolder[JavaClassConstructorDescriptor]

'lazy' @ [40:50] ==> public fun <T> lazy(initializer: () -> List<File>): Lazy<List<File>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File>

'listOf' @ [41:9] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'fileFromProp' @ [41:16] ==> private final fun fileFromProp(propName: String, defaultPath: String): File defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[SimpleFunctionDescriptorImpl]

'lazy' @ [44:53] ==> public fun <T> lazy(initializer: () -> List<File>): Lazy<List<File>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File>

'listOf' @ [45:9] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'fileFromProp' @ [45:16] ==> private final fun fileFromProp(propName: String, defaultPath: String): File defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[SimpleFunctionDescriptorImpl]

'fileFromProp' @ [46:16] ==> private final fun fileFromProp(propName: String, defaultPath: String): File defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[SimpleFunctionDescriptorImpl]

'lazy' @ [49:36] ==> public fun <T> lazy(initializer: () -> File): Lazy<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'createTempFile' @ [50:9] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'apply' @ [50:44] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'deleteOnExit' @ [51:13] ==> public open fun deleteOnExit(): Unit defined in java.io.File[JavaMethodDescriptor]

'File' @ [56:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'?:' @ [56:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getProperty' @ [56:26] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'propName' @ [56:38] ==> value-parameter propName: String defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.fileFromProp[ValueParameterDescriptorImpl]

'defaultPath' @ [56:51] ==> value-parameter defaultPath: String defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.fileFromProp[ValueParameterDescriptorImpl]

'apply' @ [56:65] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'!' @ [57:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exists' @ [57:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'FileNotFoundException' @ [58:27] ==> public constructor FileNotFoundException(p0: (String..String?)) defined in java.io.FileNotFoundException[JavaClassConstructorDescriptor]

'defaultPath' @ [58:63] ==> value-parameter defaultPath: String defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.fileFromProp[ValueParameterDescriptorImpl]

'this' @ [58:77] ==> <this> defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.fileFromProp.<anonymous>[ReceiverParameterDescriptorImpl]

'lazy' @ [61:52] ==> public fun <T> lazy(initializer: () -> CompileService): Lazy<CompileService> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileService

'CompilerId' @ [62:26] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [62:37] ==> @JvmStatic public final fun makeCompilerId(paths: Iterable<File>): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'compilerClasspath' @ [62:52] ==> private final val compilerClasspath: List<File> defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'DaemonOptions' @ [63:29] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [63:58] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workingDir' @ [63:63] ==> @JvmField @Rule public final val workingDir: TemporaryFolder defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'root' @ [63:74] ==> public final val TemporaryFolder.root: (File..File?)[MyPropertyDescriptor]

'absolutePath' @ [63:97] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'DaemonJVMOptions' @ [64:67] ==> public constructor DaemonJVMOptions(maxMemory: String = ..., maxPermSize: String = ..., reservedCodeCacheSize: String = ..., jvmParams: MutableCollection<String> = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedClassConstructorDescriptor]

'arrayListOf' @ [65:36] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonReportMessage

'KotlinCompilerClient' @ [67:9] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [67:30] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [67:54] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.compilerService.<anonymous>[LocalVariableDescriptor]

'clientAliveFile' @ [67:66] ==> private final val clientAliveFile: File defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'daemonJVMOptions' @ [67:83] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.compilerService.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [67:101] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.compilerService.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [68:17] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'daemonReportMessages' @ [68:51] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.compilerService.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [69:26] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [69:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'daemonReportMessages' @ [69:90] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.compilerService.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [69:111] ==> public fun <T> Iterable<DaemonReportMessage>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((DaemonReportMessage) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonReportMessage

'it' @ [69:154] ==> value-parameter it: DaemonReportMessage defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.compilerService.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'category' @ [69:157] ==> public final val category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[DeserializedPropertyDescriptor]

'name' @ [69:166] ==> public final val name: String defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[DeserializedPropertyDescriptor]

'it' @ [69:174] ==> value-parameter it: DaemonReportMessage defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.compilerService.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [69:177] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[DeserializedPropertyDescriptor]

'TestMessageCollector' @ [72:38] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector[ClassConstructorDescriptorImpl]

'Test' @ [74:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [76:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [76:19] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'runCompiler' @ [76:27] ==> private final fun runCompiler(vararg args: String): Pair<String, Int> defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[SimpleFunctionDescriptorImpl]

'compilationClasspath' @ [77:24] ==> private final val compilationClasspath: List<File> defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'joinToString' @ [77:45] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'pathSeparator' @ [77:63] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'it' @ [77:80] ==> value-parameter it: File defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.testSimpleScript.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [77:83] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'File' @ [78:17] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'canonicalPath' @ [78:76] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [79:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'code' @ [79:25] ==> val code: Int defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.testSimpleScript[LocalVariableDescriptor]

'+' @ [79:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'out' @ [79:57] ==> val out: String defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.testSimpleScript[LocalVariableDescriptor]

'-' @ [84:20] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'myMessageCollector' @ [85:9] ==> private final val myMessageCollector: TestMessageCollector defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'clear' @ [85:28] ==> public open fun clear(): Unit defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector[SimpleFunctionDescriptorImpl]

'captureOutAndErr' @ [86:19] ==> internal fun captureOutAndErr(body: () -> Unit): String defined in org.jetbrains.kotlin.compiler.client[SimpleFunctionDescriptorImpl]

'code' @ [87:13] ==> var code: Int defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.runCompiler[LocalVariableDescriptor]

'KotlinCompilerClient' @ [87:20] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'compile' @ [87:41] ==> public final fun compile(compilerService: CompileService, sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., compilerMode: CompilerMode = ..., reportSeverity: ReportSeverity = ..., port: Int = ..., profiler: Profiler = ...): Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerService' @ [87:49] ==> private final val compilerService: CompileService defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'CompileService' @ [87:66] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'NO_SESSION' @ [87:81] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'CompileService' @ [87:93] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [87:123] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'args' @ [87:128] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.runCompiler[ValueParameterDescriptorImpl]

'myMessageCollector' @ [87:134] ==> private final val myMessageCollector: TestMessageCollector defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'ReportSeverity' @ [88:38] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [88:53] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'myMessageCollector' @ [90:16] ==> private final val myMessageCollector: TestMessageCollector defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT[PropertyDescriptorImpl]

'messages' @ [90:35] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector[PropertyDescriptorImpl]

'joinToString' @ [90:44] ==> public fun <T> Iterable<TestMessageCollector.Message>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TestMessageCollector.Message) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'it' @ [90:65] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.runCompiler.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [90:68] ==> public final val message: String defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.Message[PropertyDescriptorImpl]

'out' @ [90:87] ==> val out: String defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.runCompiler[LocalVariableDescriptor]

'code' @ [90:94] ==> var code: Int defined in org.jetbrains.kotlin.compiler.client.CompilerClientIT.runCompiler[LocalVariableDescriptor]

'ByteArrayOutputStream' @ [95:21] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'out' @ [96:26] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'err' @ [97:26] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'setOut' @ [98:12] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'PrintStream' @ [98:19] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStream' @ [98:31] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.compiler.client.captureOutAndErr[LocalVariableDescriptor]

'setErr' @ [99:12] ==> public open fun setErr(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'PrintStream' @ [99:19] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStream' @ [99:31] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.compiler.client.captureOutAndErr[LocalVariableDescriptor]

'invoke' @ [101:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'out' @ [104:16] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [104:20] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'setOut' @ [105:16] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'prevOut' @ [105:23] ==> val prevOut: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.compiler.client.captureOutAndErr[LocalVariableDescriptor]

'err' @ [106:16] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [106:20] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'setErr' @ [107:16] ==> public open fun setErr(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'prevErr' @ [107:23] ==> val prevErr: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.compiler.client.captureOutAndErr[LocalVariableDescriptor]

'outStream' @ [109:12] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.compiler.client.captureOutAndErr[LocalVariableDescriptor]

'toString' @ [109:22] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'arrayListOf' @ [116:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'messages' @ [119:9] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector[PropertyDescriptorImpl]

'clear' @ [119:18] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'messages' @ [123:9] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector[PropertyDescriptorImpl]

'add' @ [123:18] ==> public open fun add(element: TestMessageCollector.Message): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Message' @ [123:22] ==> public constructor Message(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation?) defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.Message[ClassConstructorDescriptorImpl]

'severity' @ [123:30] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.report[ValueParameterDescriptorImpl]

'message' @ [123:40] ==> value-parameter message: String defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.report[ValueParameterDescriptorImpl]

'location' @ [123:49] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.report[ValueParameterDescriptorImpl]

'messages' @ [126:41] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector[PropertyDescriptorImpl]

'any' @ [126:50] ==> public inline fun <T> Iterable<TestMessageCollector.Message>.any(predicate: (TestMessageCollector.Message) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'it' @ [126:56] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.hasErrors.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [126:59] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.Message[PropertyDescriptorImpl]

'EXCEPTION' @ [126:95] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'it' @ [126:108] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.hasErrors.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [126:111] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.compiler.client.TestMessageCollector.Message[PropertyDescriptorImpl]

'ERROR' @ [126:147] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

