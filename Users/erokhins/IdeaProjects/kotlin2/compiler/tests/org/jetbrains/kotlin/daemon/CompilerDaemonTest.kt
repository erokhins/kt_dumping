'KotlinIntegrationTestBase' @ [49:28] ==> public constructor KotlinIntegrationTestBase() defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaClassConstructorDescriptor]

'listOf' @ [53:29] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [54:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getCompilerLib' @ [54:44] ==> public open fun getCompilerLib(): (File..File?) defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'listOf' @ [55:33] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [55:41] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getCompilerLib' @ [55:72] ==> public open fun getCompilerLib(): (File..File?) defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'File' @ [56:41] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getCompilerLib' @ [56:72] ==> public open fun getCompilerLib(): (File..File?) defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'lazy' @ [57:23] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> CompilerId): Lazy<CompilerId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerId

'NONE' @ [57:49] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'CompilerId' @ [57:57] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [57:68] ==> @JvmStatic public final fun makeCompilerId(paths: Iterable<File>): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'compilerClassPath' @ [57:83] ==> public final val compilerClassPath: List<File> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'KotlinCompilerClient' @ [60:22] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [60:43] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [60:67] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[ValueParameterDescriptorImpl]

'clientAliveFile' @ [60:79] ==> value-parameter clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [60:96] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[ValueParameterDescriptorImpl]

'daemonOptions' @ [60:114] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[ValueParameterDescriptorImpl]

'DaemonReportingTargets' @ [60:129] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [60:165] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [61:9] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [61:51] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[LocalVariableDescriptor]

'daemon' @ [62:9] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[LocalVariableDescriptor]

'registerClient' @ [62:17] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'clientAliveFile' @ [62:32] ==> value-parameter clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[ValueParameterDescriptorImpl]

'absolutePath' @ [62:48] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'ByteArrayOutputStream' @ [63:20] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'KotlinCompilerClient' @ [64:20] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'compile' @ [64:41] ==> public final fun compile(compilerService: CompileService, sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., compilerMode: CompilerMode = ..., reportSeverity: ReportSeverity = ..., port: Int = ..., profiler: Profiler = ...): Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'daemon' @ [64:49] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[LocalVariableDescriptor]

'CompileService' @ [64:59] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'NO_SESSION' @ [64:74] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'CompileService' @ [64:86] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [64:116] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'args' @ [65:49] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[ValueParameterDescriptorImpl]

'PrintingMessageCollector' @ [65:55] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'PrintStream' @ [65:80] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'strm' @ [65:92] ==> val strm: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[LocalVariableDescriptor]

'WITHOUT_PATHS' @ [65:115] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'ReportSeverity' @ [66:66] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [66:81] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'CompilerResults' @ [67:16] ==> public constructor CompilerResults(resultCode: Int, out: String) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[ClassConstructorDescriptorImpl]

'code' @ [67:32] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[LocalVariableDescriptor]

'strm' @ [67:38] ==> val strm: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.compileOnDaemon[LocalVariableDescriptor]

'toString' @ [67:43] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'compileOnDaemon' @ [71:24] ==> private final fun compileOnDaemon(clientAliveFile: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, vararg args: String): CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'clientAliveFile' @ [71:40] ==> value-parameter clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'compilerId' @ [71:57] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [71:69] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'daemonOptions' @ [71:87] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'args' @ [71:103] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'assertEquals' @ [72:13] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'res1' @ [72:56] ==> val res1: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[LocalVariableDescriptor]

'out' @ [72:61] ==> public final val out: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'res1' @ [72:71] ==> val res1: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[LocalVariableDescriptor]

'resultCode' @ [72:76] ==> public final val resultCode: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'compileOnDaemon' @ [73:24] ==> private final fun compileOnDaemon(clientAliveFile: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, vararg args: String): CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'clientAliveFile' @ [73:40] ==> value-parameter clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'compilerId' @ [73:57] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [73:69] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'daemonOptions' @ [73:87] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'args' @ [73:103] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[ValueParameterDescriptorImpl]

'assertEquals' @ [74:13] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'res2' @ [74:57] ==> val res2: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[LocalVariableDescriptor]

'out' @ [74:62] ==> public final val out: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'res2' @ [74:72] ==> val res2: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[LocalVariableDescriptor]

'resultCode' @ [74:77] ==> public final val resultCode: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'assertEquals' @ [75:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'removePerfOutput' @ [75:66] ==> public open fun removePerfOutput(output: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.cli.AbstractCliTest[JavaMethodDescriptor]

'res1' @ [75:83] ==> val res1: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[LocalVariableDescriptor]

'out' @ [75:88] ==> public final val out: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'removePerfOutput' @ [75:110] ==> public open fun removePerfOutput(output: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.cli.AbstractCliTest[JavaMethodDescriptor]

'res2' @ [75:127] ==> val res2: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.runDaemonCompilerTwice[LocalVariableDescriptor]

'out' @ [75:132] ==> public final val out: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'+' @ [78:44] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [78:60] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'getTestName' @ [78:108] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'+' @ [79:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [79:64] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'runJava' @ [81:66] ==> protected/*protected and package*/ open fun runJava(@NotNull p0: String, @Nullable p1: String?, @NotNull vararg p2: (String..String?)): Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'getTestBaseDir' @ [81:74] ==> private final fun getTestBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logName' @ [81:92] ==> value-parameter logName: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.run[ValueParameterDescriptorImpl]

'args' @ [81:102] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.run[ValueParameterDescriptorImpl]

'DaemonOptions' @ [84:13] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [84:42] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [84:47] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'testName' @ [84:55] ==> value-parameter testName: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonOptions[ValueParameterDescriptorImpl]

'absolutePath' @ [84:65] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'shutdownDelay' @ [85:67] ==> value-parameter shutdownDelay: Int = ... defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonOptions[ValueParameterDescriptorImpl]

'toLong' @ [85:81] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [89:98] ==> @InlineOnly public inline fun <T> listOf(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arrayListOf' @ [90:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'logFile' @ [91:13] ==> value-parameter logFile: File? = ... defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[ValueParameterDescriptorImpl]

'additionalArgs' @ [92:13] ==> val additionalArgs: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[LocalVariableDescriptor]

'add' @ [92:28] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'COMPILE_DAEMON_LOG_PATH_PROPERTY' @ [92:35] ==> public val COMPILE_DAEMON_LOG_PATH_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'logFile' @ [92:72] ==> value-parameter logFile: File? = ... defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[ValueParameterDescriptorImpl]

'loggerCompatiblePath' @ [92:80] ==> internal val File.loggerCompatiblePath: String defined in org.jetbrains.kotlin.daemon in file CompilerDaemonTest.kt[PropertyDescriptorImpl]

'args' @ [94:9] ==> value-parameter args: Iterable<String> = ... defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[ValueParameterDescriptorImpl]

'forEach' @ [94:14] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'additionalArgs' @ [94:24] ==> val additionalArgs: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[LocalVariableDescriptor]

'add' @ [94:39] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [94:43] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions.<anonymous>[ValueParameterDescriptorImpl]

'if (xmx > 0) DaemonJVMOptions(maxMemory = "${xmx}m") else DaemonJVMOptions()' @ [95:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DaemonJVMOptions, elseBranch: DaemonJVMOptions): DaemonJVMOptions[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DaemonJVMOptions

'xmx' @ [95:28] ==> value-parameter xmx: Int = ... defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[ValueParameterDescriptorImpl]

'DaemonJVMOptions' @ [95:37] ==> public constructor DaemonJVMOptions(maxMemory: String = ..., maxPermSize: String = ..., reservedCodeCacheSize: String = ..., jvmParams: MutableCollection<String> = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedClassConstructorDescriptor]

'xmx' @ [95:69] ==> value-parameter xmx: Int = ... defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[ValueParameterDescriptorImpl]

'DaemonJVMOptions' @ [95:82] ==> public constructor DaemonJVMOptions(maxMemory: String = ..., maxPermSize: String = ..., reservedCodeCacheSize: String = ..., jvmParams: MutableCollection<String> = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedClassConstructorDescriptor]

'configureDaemonJVMOptions' @ [96:16] ==> public fun configureDaemonJVMOptions(opts: DaemonJVMOptions, vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'baseOpts' @ [97:17] ==> val baseOpts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[LocalVariableDescriptor]

'additionalArgs' @ [98:18] ==> val additionalArgs: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[LocalVariableDescriptor]

'toTypedArray' @ [98:33] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'xmx' @ [99:39] ==> value-parameter xmx: Int = ... defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.makeTestDaemonJvmOptions[ValueParameterDescriptorImpl]

'withFlagFile' @ [105:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [105:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'makeTestDaemonOptions' @ [106:33] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [106:55] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'withLogFile' @ [108:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [109:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [109:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tmpdir' @ [113:31] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [113:38] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [113:58] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'runDaemonCompilerTwice' @ [114:21] ==> private final fun runDaemonCompilerTwice(clientAliveFile: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, vararg args: String): Unit defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'flagFile' @ [114:44] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>[ValueParameterDescriptorImpl]

'compilerId' @ [114:54] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'daemonJVMOptions' @ [114:66] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [114:84] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'File' @ [115:64] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getTestBaseDir' @ [115:69] ==> private final fun getTestBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [115:99] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [115:119] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinCompilerClient' @ [117:21] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'shutdownCompileService' @ [117:42] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [117:65] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'daemonOptions' @ [117:77] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'sleep' @ [118:28] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'daemonShotDown' @ [119:21] ==> var daemonShotDown: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'logFile' @ [122:21] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [122:29] ==> internal fun File.assertLogContainsSequence(vararg patterns: LinePattern): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'LinePattern' @ [123:29] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'LinePattern' @ [124:29] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'LinePattern' @ [125:29] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'it' @ [125:75] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'groups' @ [125:78] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'value' @ [125:89] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'toLong' @ [125:96] ==> @InlineOnly public inline fun String.toLong(): Long defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [125:106] ==> @InlineOnly public inline fun <T, R> Long.let(block: (Long) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long
    <R> -> Unit

'compileTime1' @ [125:112] ==> var compileTime1: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [125:127] ==> value-parameter it: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LinePattern' @ [126:29] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'LinePattern' @ [127:29] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'it' @ [127:75] ==> value-parameter it: MatchResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'groups' @ [127:78] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'value' @ [127:89] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'toLong' @ [127:96] ==> @InlineOnly public inline fun String.toLong(): Long defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [127:106] ==> @InlineOnly public inline fun <T, R> Long.let(block: (Long) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long
    <R> -> Unit

'compileTime2' @ [127:112] ==> var compileTime2: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [127:127] ==> value-parameter it: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LinePattern' @ [128:29] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [129:21] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'compileTime1' @ [129:64] ==> var compileTime1: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compileTime2' @ [129:131] ==> var compileTime2: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compileTime1' @ [130:32] ==> var compileTime1: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compileTime2' @ [130:47] ==> var compileTime2: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'logFile' @ [131:21] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [131:29] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'run' @ [132:21] ==> private final fun run(logName: String, vararg args: String): Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'jar' @ [132:45] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'!' @ [135:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'daemonShotDown' @ [135:26] ==> var daemonShotDown: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinCompilerClient' @ [136:25] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'shutdownCompileService' @ [136:46] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [136:69] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'daemonOptions' @ [136:81] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'getProperty' @ [143:39] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_JVM_OPTIONS_PROPERTY' @ [143:51] ==> public val COMPILE_DAEMON_JVM_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'setProperty' @ [145:20] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_JVM_OPTIONS_PROPERTY' @ [145:32] ==> public val COMPILE_DAEMON_JVM_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'configureDaemonJVMOptions' @ [146:24] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [147:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'opts' @ [147:34] ==> val opts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'maxMemory' @ [147:39] ==> public final var maxMemory: String defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'assertEquals' @ [148:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'opts' @ [148:33] ==> val opts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'maxPermSize' @ [148:38] ==> public final var maxPermSize: String defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'assertEquals' @ [149:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'opts' @ [149:33] ==> val opts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'reservedCodeCacheSize' @ [149:38] ==> public final var reservedCodeCacheSize: String defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'assertEquals' @ [150:13] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'arrayListOf' @ [150:26] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'opts' @ [150:75] ==> val opts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'jvmParams' @ [150:80] ==> public final var jvmParams: MutableCollection<String> defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'setProperty' @ [152:20] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_JVM_OPTIONS_PROPERTY' @ [152:32] ==> public val COMPILE_DAEMON_JVM_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'configureDaemonJVMOptions' @ [153:25] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [154:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'opts2' @ [154:34] ==> val opts2: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'maxMemory' @ [154:40] ==> public final var maxMemory: String defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'assertEquals' @ [155:13] ==> public open fun assertEquals(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'-' @ [155:27] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'DaemonJVMOptionsMemoryComparator' @ [155:31] ==> public constructor DaemonJVMOptionsMemoryComparator() defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptionsMemoryComparator[DeserializedClassConstructorDescriptor]

'compare' @ [155:66] ==> public open fun compare(left: DaemonJVMOptions, right: DaemonJVMOptions): Int defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptionsMemoryComparator[DeserializedSimpleFunctionDescriptor]

'opts' @ [155:74] ==> val opts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'opts2' @ [155:80] ==> val opts2: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'assertEquals' @ [156:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'listOf' @ [156:34] ==> public fun <T> listOf(vararg elements: DaemonJVMOptions): List<DaemonJVMOptions> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonJVMOptions

'opts' @ [156:41] ==> val opts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'opts2' @ [156:47] ==> val opts2: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'maxWith' @ [156:54] ==> public fun <T> Iterable<DaemonJVMOptions>.maxWith(comparator: Comparator<in DaemonJVMOptions> /* = Comparator<in DaemonJVMOptions> */): DaemonJVMOptions? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonJVMOptions

'DaemonJVMOptionsMemoryComparator' @ [156:62] ==> public constructor DaemonJVMOptionsMemoryComparator() defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptionsMemoryComparator[DeserializedClassConstructorDescriptor]

'maxMemory' @ [156:99] ==> public final var maxMemory: String defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'getRuntimeMXBean' @ [158:48] ==> public open fun getRuntimeMXBean(): (RuntimeMXBean..RuntimeMXBean?) defined in java.lang.management.ManagementFactory[JavaMethodDescriptor]

'inputArguments' @ [158:67] ==> public final val RuntimeMXBean.inputArguments: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'first' @ [158:82] ==> public inline fun <T> Iterable<(String..String?)>.first(predicate: ((String..String?)) -> Boolean): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [158:90] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [158:93] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertNotNull' @ [159:22] ==> public open fun assertNotNull(p0: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'myXmxParam' @ [159:36] ==> val myXmxParam: (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'myXmxParam' @ [160:28] ==> val myXmxParam: (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'substring' @ [160:39] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'clearProperty' @ [161:20] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_JVM_OPTIONS_PROPERTY' @ [161:34] ==> public val COMPILE_DAEMON_JVM_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'configureDaemonJVMOptions' @ [162:25] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [165:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'myXmxVal' @ [165:26] ==> val myXmxVal: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'opts3' @ [165:36] ==> val opts3: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'maxMemory' @ [165:42] ==> public final var maxMemory: String defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'restoreSystemProperty' @ [168:13] ==> public fun restoreSystemProperty(propertyName: String, backupValue: String?): Unit defined in org.jetbrains.kotlin.daemon in file CompilerDaemonTest.kt[SimpleFunctionDescriptorImpl]

'COMPILE_DAEMON_JVM_OPTIONS_PROPERTY' @ [168:35] ==> public val COMPILE_DAEMON_JVM_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'backupJvmOptions' @ [168:72] ==> val backupJvmOptions: (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonJvmOptionsParsing[LocalVariableDescriptor]

'getProperty' @ [173:36] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_OPTIONS_PROPERTY' @ [173:48] ==> public val COMPILE_DAEMON_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'setProperty' @ [175:20] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_OPTIONS_PROPERTY' @ [175:32] ==> public val COMPILE_DAEMON_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'configureDaemonOptions' @ [176:24] ==> public fun configureDaemonOptions(opts: DaemonOptions): DaemonOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'DaemonOptions' @ [176:47] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'assertEquals' @ [177:13] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'opts' @ [177:34] ==> val opts: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonOptionsParsing[LocalVariableDescriptor]

'runFilesPath' @ [177:39] ==> public final var runFilesPath: String defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'assertEquals' @ [178:13] ==> public open fun assertEquals(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'opts' @ [178:32] ==> val opts: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonOptionsParsing[LocalVariableDescriptor]

'autoshutdownIdleSeconds' @ [178:37] ==> public final var autoshutdownIdleSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'restoreSystemProperty' @ [181:13] ==> public fun restoreSystemProperty(propertyName: String, backupValue: String?): Unit defined in org.jetbrains.kotlin.daemon in file CompilerDaemonTest.kt[SimpleFunctionDescriptorImpl]

'COMPILE_DAEMON_OPTIONS_PROPERTY' @ [181:35] ==> public val COMPILE_DAEMON_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'backupOptions' @ [181:68] ==> val backupOptions: (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonOptionsParsing[LocalVariableDescriptor]

'withFlagFile' @ [186:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [186:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'makeTestDaemonOptions' @ [187:33] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [187:55] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'CompilerId' @ [188:31] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [188:42] ==> @JvmStatic public final fun makeCompilerId(paths: Iterable<File>): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'compilerClassPath' @ [188:57] ==> public final val compilerClassPath: List<File> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'File' @ [189:57] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getCompilerLib' @ [189:88] ==> public open fun getCompilerLib(): (File..File?) defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'withLogFile' @ [191:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'withLogFile' @ [192:17] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [193:45] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile1' @ [193:70] ==> value-parameter logFile1: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'makeTestDaemonJvmOptions' @ [194:45] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile2' @ [194:70] ==> value-parameter logFile2: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertTrue' @ [196:21] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'logFile1' @ [196:32] ==> value-parameter logFile1: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [196:41] ==> public open fun length(): Long defined in java.io.File[JavaMethodDescriptor]

'logFile2' @ [196:59] ==> value-parameter logFile2: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [196:68] ==> public open fun length(): Long defined in java.io.File[JavaMethodDescriptor]

'tmpdir' @ [198:32] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [198:39] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [198:59] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'compileOnDaemon' @ [199:32] ==> private final fun compileOnDaemon(clientAliveFile: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, vararg args: String): CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'flagFile' @ [199:48] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[ValueParameterDescriptorImpl]

'compilerId' @ [199:58] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'daemonJVMOptions1' @ [199:70] ==> val daemonJVMOptions1: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [199:89] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[LocalVariableDescriptor]

'File' @ [199:124] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [199:129] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [199:163] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar1' @ [199:183] ==> val jar1: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [200:21] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'res1' @ [200:64] ==> val res1: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'out' @ [200:69] ==> public final val out: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'res1' @ [200:79] ==> val res1: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resultCode' @ [200:84] ==> public final val resultCode: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'logFile1' @ [202:21] ==> value-parameter logFile1: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [202:30] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'assertEquals' @ [203:21] ==> public open fun assertEquals(p0: (String..String?), p1: Long, p2: Long): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'logFile2' @ [203:48] ==> value-parameter logFile2: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [203:57] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'logFile2' @ [203:90] ==> value-parameter logFile2: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [203:99] ==> public open fun length(): Long defined in java.io.File[JavaMethodDescriptor]

'tmpdir' @ [205:32] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [205:39] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [205:59] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'compileOnDaemon' @ [206:32] ==> private final fun compileOnDaemon(clientAliveFile: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, vararg args: String): CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'flagFile' @ [206:48] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[ValueParameterDescriptorImpl]

'compilerId2' @ [206:58] ==> val compilerId2: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[LocalVariableDescriptor]

'daemonJVMOptions2' @ [206:71] ==> val daemonJVMOptions2: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [206:90] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[LocalVariableDescriptor]

'File' @ [206:125] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [206:130] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [206:164] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar2' @ [206:184] ==> val jar2: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [207:21] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'res2' @ [207:65] ==> val res2: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'out' @ [207:70] ==> public final val out: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'res1' @ [207:80] ==> val res1: CompilerDaemonTest.CompilerResults defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resultCode' @ [207:85] ==> public final val resultCode: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.CompilerResults[PropertyDescriptorImpl]

'logFile2' @ [209:21] ==> value-parameter logFile2: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [209:30] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'KotlinCompilerClient' @ [211:21] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'shutdownCompileService' @ [211:42] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [211:65] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'daemonOptions' @ [211:77] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[LocalVariableDescriptor]

'KotlinCompilerClient' @ [212:21] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'shutdownCompileService' @ [212:42] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId2' @ [212:65] ==> val compilerId2: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [212:78] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>[LocalVariableDescriptor]

'sleep' @ [214:28] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile1' @ [216:21] ==> value-parameter logFile1: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [216:30] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'logFile2' @ [217:21] ==> value-parameter logFile2: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonInstancesSimple.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [217:30] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'withFlagFile' @ [224:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [224:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'DaemonOptions' @ [225:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [225:109] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [225:114] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [225:122] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [225:141] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'configureDaemonJVMOptions' @ [227:36] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'TestMessageCollector' @ [229:36] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'KotlinCompilerClient' @ [231:26] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [231:47] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [231:71] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [231:83] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonRunError.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [231:93] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonRunError.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [231:111] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonRunError.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [232:71] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'messageCollector' @ [232:113] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonRunError.<anonymous>[LocalVariableDescriptor]

'assertNull' @ [234:13] ==> public open fun assertNull(p0: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [234:24] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonRunError.<anonymous>[LocalVariableDescriptor]

'messageCollector' @ [236:13] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonRunError.<anonymous>[LocalVariableDescriptor]

'assertHasMessage' @ [236:30] ==> public fun TestMessageCollector.assertHasMessage(msg: String, desiredSeverity: CompilerMessageSeverity? = ...): Unit defined in org.jetbrains.kotlin.daemon in file CompilerApiTest.kt[SimpleFunctionDescriptorImpl]

'withFlagFile' @ [242:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [242:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'DaemonOptions' @ [243:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [243:109] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [243:114] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [243:122] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [243:141] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'configureDaemonJVMOptions' @ [245:36] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'TestMessageCollector' @ [247:36] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'KotlinCompilerClient' @ [249:26] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [249:47] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [249:71] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [249:83] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [249:93] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [249:111] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [250:71] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'messageCollector' @ [250:113] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[LocalVariableDescriptor]

'assertNull' @ [252:13] ==> public open fun assertNull(p0: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [252:24] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[LocalVariableDescriptor]

'messageCollector' @ [254:13] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[LocalVariableDescriptor]

'assertHasMessage' @ [254:30] ==> public fun TestMessageCollector.assertHasMessage(msg: String, desiredSeverity: CompilerMessageSeverity? = ...): Unit defined in org.jetbrains.kotlin.daemon in file CompilerApiTest.kt[SimpleFunctionDescriptorImpl]

'messageCollector' @ [255:13] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[LocalVariableDescriptor]

'assertHasMessage' @ [255:30] ==> public fun TestMessageCollector.assertHasMessage(msg: String, desiredSeverity: CompilerMessageSeverity? = ...): Unit defined in org.jetbrains.kotlin.daemon in file CompilerApiTest.kt[SimpleFunctionDescriptorImpl]

'messageCollector' @ [257:13] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.ignore_testDaemonStartRetry.<anonymous>[LocalVariableDescriptor]

'assertHasMessage' @ [257:30] ==> public fun TestMessageCollector.assertHasMessage(msg: String, desiredSeverity: CompilerMessageSeverity? = ...): Unit defined in org.jetbrains.kotlin.daemon in file CompilerApiTest.kt[SimpleFunctionDescriptorImpl]

'withFlagFile' @ [262:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [262:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'DaemonOptions' @ [263:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [263:124] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [263:129] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [263:137] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [263:156] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'withLogFile' @ [265:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [266:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [266:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [268:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [268:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [268:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [268:87] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [268:97] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [268:115] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [268:130] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [268:166] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [269:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [269:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemon' @ [270:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>.<anonymous>[LocalVariableDescriptor]

'registerClient' @ [270:25] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'flagFile' @ [270:40] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [270:49] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'..' @ [273:34] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'logFile' @ [274:25] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isLogContainsSequence' @ [274:33] ==> internal fun File.isLogContainsSequence(vararg patterns: String): Boolean defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'sleep' @ [275:28] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'sleep' @ [277:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile' @ [279:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnUnused.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [279:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'withFlagFile' @ [286:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [286:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'DaemonOptions' @ [287:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [287:122] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [287:127] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [287:135] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [287:154] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'withLogFile' @ [289:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [290:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [290:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [292:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [292:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [292:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [292:87] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [292:97] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [292:115] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [292:130] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [292:166] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [293:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [293:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemon' @ [294:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'registerClient' @ [294:25] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'flagFile' @ [294:40] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [294:49] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [295:27] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [295:34] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [295:54] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'ByteArrayOutputStream' @ [296:28] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'KotlinCompilerClient' @ [297:28] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'compile' @ [297:49] ==> public final fun compile(compilerService: CompileService, sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., compilerMode: CompilerMode = ..., reportSeverity: ReportSeverity = ..., port: Int = ..., profiler: Profiler = ...): Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'daemon' @ [297:57] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'CompileService' @ [297:67] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'NO_SESSION' @ [297:82] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'CompileService' @ [297:94] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [297:124] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'arrayOf' @ [298:57] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'File' @ [298:85] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [298:90] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [298:124] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [298:144] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'PrintingMessageCollector' @ [299:57] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'PrintStream' @ [299:82] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'strm' @ [299:94] ==> val strm: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'WITHOUT_PATHS' @ [299:117] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'ReportSeverity' @ [300:74] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [300:89] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'assertEquals' @ [301:17] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'strm' @ [301:53] ==> val strm: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'code' @ [301:63] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'logFile' @ [303:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [303:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'..' @ [306:34] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'logFile' @ [307:25] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isLogContainsSequence' @ [307:33] ==> internal fun File.isLogContainsSequence(vararg patterns: String): Boolean defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'sleep' @ [308:28] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'sleep' @ [310:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile' @ [311:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonAutoshutdownOnIdle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [311:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'withFlagFile' @ [318:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [318:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'DaemonOptions' @ [319:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [319:164] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [319:169] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [319:177] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [319:196] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'withLogFile' @ [321:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [322:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [322:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [324:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [324:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [324:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [324:87] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [324:97] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [324:115] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [324:130] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [324:166] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [325:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [325:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemon' @ [326:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'registerClient' @ [326:25] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'flagFile' @ [326:40] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [326:49] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'daemon' @ [327:33] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'leaseCompileSession' @ [327:41] ==> public abstract fun leaseCompileSession(aliveFlagPath: String?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'daemon' @ [329:43] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'scheduleShutdown' @ [329:51] ==> public abstract fun scheduleShutdown(graceful: Boolean): CompileService.CallResult<Boolean> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [331:17] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'scheduleShutdownRes' @ [331:59] ==> val scheduleShutdownRes: CompileService.CallResult<Boolean>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'scheduleShutdownRes' @ [331:82] ==> val scheduleShutdownRes: CompileService.CallResult<Boolean>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [331:103] ==> @InlineOnly public inline fun <T, R> CompileService.CallResult<Boolean>.let(block: (CompileService.CallResult<Boolean>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<Boolean>
    <R> -> Boolean

'it' @ [331:109] ==> value-parameter it: CompileService.CallResult<Boolean> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isGood' @ [331:112] ==> public final val isGood: Boolean defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedPropertyDescriptor]

'it' @ [331:122] ==> value-parameter it: CompileService.CallResult<Boolean> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [331:125] ==> public abstract fun get(): Boolean defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'sleep' @ [333:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile' @ [335:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [335:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'daemon' @ [337:27] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'leaseCompileSession' @ [337:35] ==> public abstract fun leaseCompileSession(aliveFlagPath: String?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [339:17] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'CompileService' @ [339:47] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Dying' @ [339:73] ==> public constructor Dying() defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Dying[DeserializedClassConstructorDescriptor]

'res' @ [339:82] ==> val res: CompileService.CallResult<Int>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemon' @ [341:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'releaseCompileSession' @ [341:25] ==> public abstract fun releaseCompileSession(sessionId: Int): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [341:47] ==> val sessionId: CompileService.CallResult<Int>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[LocalVariableDescriptor]

'get' @ [341:59] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'sleep' @ [343:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile' @ [345:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonGracefulShutdown.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [345:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'DaemonOptions' @ [352:29] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [352:121] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [352:126] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [352:134] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [352:153] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'createTempFile' @ [353:26] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getTestName' @ [353:41] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'createTempFile' @ [354:27] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getTestName' @ [354:42] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'withLogFile' @ [356:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [357:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [357:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [358:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [358:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [358:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'clientFlag' @ [358:87] ==> val clientFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions[LocalVariableDescriptor]

'daemonJVMOptions' @ [358:99] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [358:117] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions[LocalVariableDescriptor]

'DaemonReportingTargets' @ [358:132] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [358:168] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [359:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [359:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions.<anonymous>[LocalVariableDescriptor]

'daemon' @ [360:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions.<anonymous>[LocalVariableDescriptor]

'leaseCompileSession' @ [360:25] ==> public abstract fun leaseCompileSession(aliveFlagPath: String?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionFlag' @ [360:45] ==> val sessionFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions[LocalVariableDescriptor]

'canonicalPath' @ [360:57] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'clientFlag' @ [362:17] ==> val clientFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions[LocalVariableDescriptor]

'delete' @ [362:28] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'sleep' @ [364:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile' @ [367:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [367:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'sessionFlag' @ [372:13] ==> val sessionFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions[LocalVariableDescriptor]

'delete' @ [372:25] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'clientFlag' @ [373:13] ==> val clientFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithActiveSessions[LocalVariableDescriptor]

'delete' @ [373:24] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'DaemonOptions' @ [378:29] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [378:121] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [378:126] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [378:134] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [378:153] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'createTempFile' @ [379:26] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getTestName' @ [379:41] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'createTempFile' @ [380:27] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'getTestName' @ [380:42] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'withLogFile' @ [382:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [383:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [383:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [384:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [384:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [384:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'clientFlag' @ [384:87] ==> val clientFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased[LocalVariableDescriptor]

'daemonJVMOptions' @ [384:99] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [384:117] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased[LocalVariableDescriptor]

'DaemonReportingTargets' @ [384:132] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [384:168] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [385:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [385:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased.<anonymous>[LocalVariableDescriptor]

'daemon' @ [386:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased.<anonymous>[LocalVariableDescriptor]

'leaseCompileSession' @ [386:25] ==> public abstract fun leaseCompileSession(aliveFlagPath: String?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionFlag' @ [386:45] ==> val sessionFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased[LocalVariableDescriptor]

'canonicalPath' @ [386:57] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'sessionFlag' @ [388:17] ==> val sessionFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased[LocalVariableDescriptor]

'delete' @ [388:29] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'sleep' @ [390:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'clientFlag' @ [392:17] ==> val clientFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased[LocalVariableDescriptor]

'delete' @ [392:28] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'sleep' @ [394:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile' @ [396:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [396:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'sessionFlag' @ [401:13] ==> val sessionFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased[LocalVariableDescriptor]

'delete' @ [401:25] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'clientFlag' @ [402:13] ==> val clientFlag: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExitsOnClientFlagDeletedWithAllSessionsReleased[LocalVariableDescriptor]

'delete' @ [402:24] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'createTempFile' @ [417:31] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'makeTestDaemonOptions' @ [418:29] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [418:51] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'tmpdir' @ [419:19] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [419:26] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [419:46] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'listOf' @ [420:20] ==> public fun <T> listOf(vararg elements: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'File' @ [421:17] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [421:22] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getProperty' @ [421:34] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'absolutePath' @ [421:76] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY' @ [423:21] ==> public val COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'daemonClientClassPath' @ [425:17] ==> public final val daemonClientClassPath: List<File> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'joinToString' @ [425:39] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'pathSeparator' @ [425:57] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'it' @ [425:74] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [425:77] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'KotlinCompilerClient' @ [426:17] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'qualifiedName' @ [426:45] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'daemonOptions' @ [427:20] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'mappers' @ [427:34] ==> public open val mappers: List<PropMapper<*, *, *>> defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'flatMap' @ [427:42] ==> public inline fun <T, R> Iterable<PropMapper<*, *, *>>.flatMap(transform: (PropMapper<*, *, *>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropMapper<*, *, *>
    <R> -> String

'it' @ [427:52] ==> value-parameter it: PropMapper<*, *, *> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess.<anonymous>[ValueParameterDescriptorImpl]

'toArgs' @ [427:55] ==> public open fun toArgs(prefix: String = ...): List<String> defined in org.jetbrains.kotlin.daemon.common.PropMapper[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX' @ [427:62] ==> public val COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'compilerId' @ [428:20] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'mappers' @ [428:31] ==> public open val mappers: List<PropMapper<*, *, *>> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'flatMap' @ [428:39] ==> public inline fun <T, R> Iterable<PropMapper<*, *, *>>.flatMap(transform: (PropMapper<*, *, *>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropMapper<*, *, *>
    <R> -> String

'it' @ [428:49] ==> value-parameter it: PropMapper<*, *, *> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess.<anonymous>[ValueParameterDescriptorImpl]

'toArgs' @ [428:52] ==> public open fun toArgs(prefix: String = ...): List<String> defined in org.jetbrains.kotlin.daemon.common.PropMapper[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX' @ [428:59] ==> public val COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'File' @ [429:20] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [429:25] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [429:59] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [430:27] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'ProcessBuilder' @ [435:33] ==> public constructor ProcessBuilder(p0: (MutableList<(String..String?)>..List<(String..String?)>?)) defined in java.lang.ProcessBuilder[JavaClassConstructorDescriptor]

'args' @ [435:48] ==> val args: List<(String..String?)> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'redirectErrorStream' @ [435:54] ==> public open fun redirectErrorStream(p0: Boolean): (ProcessBuilder..ProcessBuilder?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

'start' @ [435:80] ==> public open fun start(): (Process..Process?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

'thread' @ [436:13] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'resOutput' @ [437:17] ==> var resOutput: String? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'runnerProcess' @ [437:29] ==> val runnerProcess: (Process..Process?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'inputStream' @ [437:43] ==> public final val Process.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'reader' @ [437:55] ==> @InlineOnly public inline fun InputStream.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'readText' @ [437:64] ==> public fun Reader.readText(): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'thread' @ [439:30] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'resCode' @ [440:17] ==> var resCode: Int? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'runnerProcess' @ [440:27] ==> val runnerProcess: (Process..Process?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'waitFor' @ [440:41] ==> public abstract fun waitFor(): Int defined in java.lang.Process[JavaMethodDescriptor]

'waitThread' @ [442:13] ==> val waitThread: Thread defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'join' @ [442:24] ==> public final fun join(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'TIMEOUT_DAEMON_RUNNER_EXIT_MS' @ [442:29] ==> public val TIMEOUT_DAEMON_RUNNER_EXIT_MS: Long defined in org.jetbrains.kotlin.daemon in file CompilerDaemonTest.kt[PropertyDescriptorImpl]

'assertFalse' @ [444:13] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'resOutput' @ [444:53] ==> var resOutput: String? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'waitThread' @ [444:65] ==> val waitThread: Thread defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'isAlive' @ [444:76] ==> public final val Thread.isAlive: Boolean[MyPropertyDescriptor]

'assertEquals' @ [445:13] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'resOutput' @ [445:49] ==> var resOutput: String? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'resCode' @ [445:64] ==> var resCode: Int? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'clientAliveFile' @ [448:17] ==> val clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'exists' @ [448:33] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'clientAliveFile' @ [449:17] ==> val clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonExecutionViaIntermediateProcess[LocalVariableDescriptor]

'delete' @ [449:33] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertTrue' @ [458:9] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'PARALLEL_THREADS_TO_COMPILE' @ [458:20] ==> private final val PARALLEL_THREADS_TO_COMPILE: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'LoopbackNetworkInterface' @ [458:51] ==> public object LoopbackNetworkInterface defined in org.jetbrains.kotlin.daemon.common[FakeCallableDescriptorForObject]

'SERVER_SOCKET_BACKLOG_SIZE' @ [458:76] ==> public final val SERVER_SOCKET_BACKLOG_SIZE: Int defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[DeserializedPropertyDescriptor]

'withFlagFile' @ [460:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [460:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'makeTestDaemonOptions' @ [461:33] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [461:55] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'withLogFile' @ [463:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [464:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [464:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [464:80] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'KotlinCompilerClient' @ [466:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [466:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [466:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [466:87] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [466:97] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [466:115] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [466:130] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [466:166] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [467:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [467:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'component1' @ [469:22] ==> public final operator fun component1(): Registry defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [469:25] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'findPortAndCreateRegistry' @ [469:33] ==> public fun findPortAndCreateRegistry(attempts: Int, portRangeStart: Int, portRangeEnd: Int): Pair<Registry, Int> defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'arrayOfNulls' @ [470:35] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<Int?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'PARALLEL_THREADS_TO_COMPILE' @ [470:53] ==> private final val PARALLEL_THREADS_TO_COMPILE: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'CountDownLatch' @ [471:38] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'PARALLEL_THREADS_TO_COMPILE' @ [471:53] ==> private final val PARALLEL_THREADS_TO_COMPILE: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'Array' @ [472:34] ==> public constructor Array<T>(size: Int, init: (Int) -> ByteArrayOutputStream) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> ByteArrayOutputStream

'PARALLEL_THREADS_TO_COMPILE' @ [472:40] ==> private final val PARALLEL_THREADS_TO_COMPILE: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'ByteArrayOutputStream' @ [472:71] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'thread' @ [475:25] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'tmpdir' @ [476:39] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [476:46] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [476:66] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'threadNo' @ [476:86] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.runCompile[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [477:39] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'compile' @ [477:60] ==> public final fun compile(compilerService: CompileService, sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., compilerMode: CompilerMode = ..., reportSeverity: ReportSeverity = ..., port: Int = ..., profiler: Profiler = ...): Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'daemon' @ [478:37] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'CompileService' @ [479:37] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'NO_SESSION' @ [479:52] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'CompileService' @ [480:37] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [480:67] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'arrayOf' @ [481:37] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'File' @ [481:65] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [481:70] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [481:104] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [481:124] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.runCompile.<anonymous>[LocalVariableDescriptor]

'PrintingMessageCollector' @ [482:37] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'PrintStream' @ [482:62] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStreams' @ [482:74] ==> val outStreams: Array<ByteArrayOutputStream> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'threadNo' @ [482:85] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.runCompile[ValueParameterDescriptorImpl]

'WITHOUT_PATHS' @ [482:113] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'port' @ [483:44] ==> val port: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'synchronized' @ [484:29] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'resultCodes' @ [484:42] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resultCodes' @ [485:33] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'threadNo' @ [485:45] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.runCompile[ValueParameterDescriptorImpl]

'res' @ [485:57] ==> val res: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.runCompile.<anonymous>[LocalVariableDescriptor]

'localEndSignal' @ [487:29] ==> val localEndSignal: CountDownLatch defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'countDown' @ [487:44] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'..' @ [490:18] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PARALLEL_THREADS_TO_COMPILE' @ [490:21] ==> private final val PARALLEL_THREADS_TO_COMPILE: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'forEach' @ [490:50] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'runCompile' @ [490:60] ==> local final fun runCompile(threadNo: Int): Thread defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'it' @ [490:71] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'localEndSignal' @ [492:33] ==> val localEndSignal: CountDownLatch defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'await' @ [492:48] ==> public open fun await(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'PARALLEL_WAIT_TIMEOUT_S' @ [492:54] ==> private final val PARALLEL_WAIT_TIMEOUT_S: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'SECONDS' @ [492:88] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'assertTrue' @ [493:17] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'PARALLEL_WAIT_TIMEOUT_S' @ [493:73] ==> private final val PARALLEL_WAIT_TIMEOUT_S: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'localEndSignal' @ [493:102] ==> val localEndSignal: CountDownLatch defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'count' @ [493:117] ==> public final val CountDownLatch.count: Long[MyPropertyDescriptor]

'succeeded' @ [493:145] ==> val succeeded: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'..' @ [495:18] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PARALLEL_THREADS_TO_COMPILE' @ [495:21] ==> private final val PARALLEL_THREADS_TO_COMPILE: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'forEach' @ [495:50] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertEquals' @ [496:21] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'it' @ [496:58] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outStreams' @ [496:72] ==> val outStreams: Array<ByteArrayOutputStream> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [496:83] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultCodes' @ [496:97] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [496:109] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelCompilationOnDaemon.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'CountDownLatch' @ [506:25] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'PARALLEL_THREADS_TO_START' @ [506:40] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'arrayOfNulls' @ [508:27] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<Int?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'PARALLEL_THREADS_TO_START' @ [508:45] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'Array' @ [509:26] ==> public constructor Array<T>(size: Int, init: (Int) -> ByteArrayOutputStream) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> ByteArrayOutputStream

'PARALLEL_THREADS_TO_START' @ [509:32] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'ByteArrayOutputStream' @ [509:61] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'arrayOfNulls' @ [510:24] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> File

'PARALLEL_THREADS_TO_START' @ [510:43] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'arrayOfNulls' @ [511:27] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<Pair<CompileService.CallResult<String>?, Int?>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<CallResult<String>?, Int?>

'PARALLEL_THREADS_TO_START' @ [511:88] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'makeTestDaemonOptions' @ [513:29] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [513:51] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'thread' @ [515:44] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'threadNo' @ [515:73] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'withFlagFile' @ [517:17] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [517:30] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'withLogFile' @ [518:21] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'logFiles' @ [519:25] ==> val logFiles: Array<File?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'threadNo' @ [519:34] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'logFile' @ [519:46] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'makeTestDaemonJvmOptions' @ [520:48] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [520:73] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [522:33] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectAndLease' @ [522:54] ==> public final fun connectAndLease(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean, leaseSession: Boolean, sessionAliveFlagFile: File? = ...): CompileServiceSession? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [522:70] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [522:82] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [522:92] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [522:110] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'DaemonReportingTargets' @ [523:70] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'PrintStream' @ [523:99] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStreams' @ [523:111] ==> val outStreams: Array<ByteArrayOutputStream> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'threadNo' @ [523:122] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'assertNotNull' @ [525:25] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'compileServiceSession' @ [525:67] ==> val compileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compileService' @ [525:90] ==> public final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'daemonInfos' @ [526:25] ==> val daemonInfos: Array<Pair<CompileService.CallResult<String>?, Int?>?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'threadNo' @ [526:37] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'compileServiceSession' @ [526:49] ==> val compileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compileService' @ [526:72] ==> public final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'getDaemonInfo' @ [526:88] ==> public abstract fun getDaemonInfo(): CompileService.CallResult<String> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'compileServiceSession' @ [526:107] ==> val compileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'sessionId' @ [526:130] ==> public final val sessionId: Int defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'tmpdir' @ [527:35] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [527:42] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [527:62] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'threadNo' @ [527:82] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [528:35] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'compile' @ [528:56] ==> public final fun compile(compilerService: CompileService, sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., compilerMode: CompilerMode = ..., reportSeverity: ReportSeverity = ..., port: Int = ..., profiler: Profiler = ...): Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compileServiceSession' @ [529:33] ==> val compileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compileService' @ [529:57] ==> public final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'compileServiceSession' @ [530:33] ==> val compileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'sessionId' @ [530:55] ==> public final val sessionId: Int defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedPropertyDescriptor]

'CompileService' @ [531:33] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [531:63] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'arrayOf' @ [532:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'File' @ [532:41] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [532:46] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [532:80] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [532:100] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'PrintingMessageCollector' @ [533:33] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'PrintStream' @ [533:58] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStreams' @ [533:70] ==> val outStreams: Array<ByteArrayOutputStream> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'threadNo' @ [533:81] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'WITHOUT_PATHS' @ [533:109] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'resultCodes' @ [534:25] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'threadNo' @ [534:37] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'res' @ [534:49] ==> val res: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [535:25] ==> public open fun assertEquals(p0: (String..String?), p1: Int, p2: Int): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'threadNo' @ [535:62] ==> value-parameter threadNo: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread[ValueParameterDescriptorImpl]

'res' @ [535:83] ==> val res: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.connectThread.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'doneLatch' @ [540:17] ==> val doneLatch: CountDownLatch defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'countDown' @ [540:27] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'setProperty' @ [544:16] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY' @ [544:28] ==> public val COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'setProperty' @ [545:16] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY' @ [545:28] ==> public val COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'..' @ [548:14] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PARALLEL_THREADS_TO_START' @ [548:17] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'forEach' @ [548:44] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'connectThread' @ [548:54] ==> local final fun connectThread(threadNo: Int): Thread defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[SimpleFunctionDescriptorImpl]

'it' @ [548:68] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[ValueParameterDescriptorImpl]

'doneLatch' @ [549:13] ==> val doneLatch: CountDownLatch defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'await' @ [549:23] ==> public open fun await(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'PARALLEL_WAIT_TIMEOUT_S' @ [549:29] ==> private final val PARALLEL_WAIT_TIMEOUT_S: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'SECONDS' @ [549:63] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'clearProperty' @ [552:20] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY' @ [552:34] ==> public val COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'clearProperty' @ [553:20] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY' @ [553:34] ==> public val COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'assertTrue' @ [556:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'PARALLEL_WAIT_TIMEOUT_S' @ [556:67] ==> private final val PARALLEL_WAIT_TIMEOUT_S: Long defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'doneLatch' @ [556:96] ==> val doneLatch: CountDownLatch defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'count' @ [556:106] ==> public final val CountDownLatch.count: Long[MyPropertyDescriptor]

'succeeded' @ [556:134] ==> val succeeded: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'sleep' @ [558:16] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'arrayOfNulls' @ [560:28] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'PARALLEL_THREADS_TO_START' @ [560:49] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'arrayOfNulls' @ [561:25] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<Pair<Int?, File?>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Pair<Int?, File?>

'PARALLEL_THREADS_TO_START' @ [561:57] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'..' @ [563:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PARALLEL_THREADS_TO_START' @ [563:23] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'logFiles' @ [564:31] ==> val logFiles: Array<File?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [564:40] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'readLines' @ [564:44] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'port2logs' @ [565:13] ==> val port2logs: Array<Pair<Int?, File?>?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [565:23] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'logContents' @ [565:28] ==> val logContents: List<String>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'find' @ [565:41] ==> @InlineOnly public inline fun <T> Iterable<String>.find(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [565:48] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [565:51] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [565:94] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'last' @ [565:106] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'toIntOrNull' @ [565:114] ==> @SinceKotlin public fun String.toIntOrNull(): Int? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'logFiles' @ [565:131] ==> val logFiles: Array<File?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [565:140] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'electionLogs' @ [566:13] ==> val electionLogs: Array<String?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [566:26] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'logContents' @ [566:31] ==> val logContents: List<String>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'find' @ [566:44] ==> @InlineOnly public inline fun <T> Iterable<String>.find(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [566:51] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [566:54] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE' @ [566:63] ==> public const val LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'electionLogs' @ [569:32] ==> val electionLogs: Array<String?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'any' @ [569:45] ==> public inline fun <T> Array<out String?>.any(predicate: (String?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'it' @ [569:51] ==> value-parameter it: String? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [569:66] ==> value-parameter it: String? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [569:69] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [569:95] ==> value-parameter it: String? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [569:98] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resultCodes' @ [570:30] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'all' @ [570:42] ==> public inline fun <T> Array<out Int?>.all(predicate: (Int?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int?

'it' @ [570:48] ==> value-parameter it: Int? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [572:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'electionsSuccess' @ [572:14] ==> val electionsSuccess: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'!' @ [572:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resultsSuccess' @ [572:35] ==> val resultsSuccess: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'buildString' @ [573:23] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [574:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PARALLEL_THREADS_TO_START' @ [574:30] ==> private final val PARALLEL_THREADS_TO_START: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'daemonInfos' @ [575:41] ==> val daemonInfos: Array<Pair<CompileService.CallResult<String>?, Int?>?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [575:53] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'first' @ [575:57] ==> public final val first: CompileService.CallResult<String>? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'when (daemonInfoRes) {
                        is CompileService.CallResult.Good -> daemonInfoRes.get()
                        is CompileService.CallResult.Dying -> "<dying>"
                        is CompileService.CallResult.Error -> "<error: ${daemonInfoRes.message}>"
                        else -> "?"
                    }' @ [576:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'daemonInfoRes' @ [576:44] ==> val daemonInfoRes: CompileService.CallResult<String>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'daemonInfoRes' @ [577:62] ==> val daemonInfoRes: CompileService.CallResult<String>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'get' @ [577:76] ==> public abstract fun get(): String defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'daemonInfoRes' @ [579:74] ==> val daemonInfoRes: CompileService.CallResult<String>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'message' @ [579:88] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedPropertyDescriptor]

'daemonInfo' @ [582:46] ==> val daemonInfo: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'trim' @ [582:57] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [582:64] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'last' @ [582:75] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'toIntOrNull' @ [582:82] ==> @SinceKotlin public fun String.toIntOrNull(): Int? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [583:21] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [583:33] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'daemonInfo' @ [583:49] ==> val daemonInfo: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'daemonInfos' @ [583:71] ==> val daemonInfos: Array<Pair<CompileService.CallResult<String>?, Int?>?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [583:83] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'second' @ [583:87] ==> public final val second: Int? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'resultCodes' @ [583:105] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [583:117] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'port2logs' @ [583:147] ==> val port2logs: Array<Pair<Int?, File?>?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [583:157] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'first' @ [583:161] ==> public final val first: Int? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'logFiles' @ [583:176] ==> val logFiles: Array<File?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [583:185] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'canonicalPath' @ [583:189] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'resultCodes' @ [584:25] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [584:37] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'electionLogs' @ [584:48] ==> val electionLogs: Array<String?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [584:61] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'appendln' @ [585:25] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [585:44] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'resultCodes' @ [585:56] ==> val resultCodes: Array<Int?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [585:68] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'outStreams' @ [585:76] ==> val outStreams: Array<ByteArrayOutputStream> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'i' @ [585:87] ==> val i: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'toByteArray' @ [585:90] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'toString' @ [585:104] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'defaultCharset' @ [585:121] ==> public open fun defaultCharset(): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'compiledPort' @ [586:25] ==> val compiledPort: Int? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'let' @ [586:39] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Pair<Int?, File?>?): Pair<Int?, File?>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Pair<Int?, File?>?

'port2logs' @ [586:53] ==> val port2logs: Array<Pair<Int?, File?>?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'find' @ [586:63] ==> @InlineOnly public inline fun <T> Array<out Pair<Int?, File?>?>.find(predicate: (Pair<Int?, File?>?) -> Boolean): Pair<Int?, File?>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int?, File?>?

'it' @ [586:70] ==> value-parameter it: Pair<Int?, File?>? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [586:74] ==> public final val first: Int? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'port' @ [586:83] ==> value-parameter port: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [586:93] ==> public final val second: File? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'let' @ [586:101] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> StringBuilder /* = StringBuilder */): StringBuilder /* = StringBuilder */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> StringBuilder

'appendln' @ [587:29] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'logFile' @ [587:54] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [587:62] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'logFile' @ [587:72] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'readText' @ [587:80] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'appendln' @ [589:28] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compiledPort' @ [589:64] ==> val compiledPort: Int? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [593:13] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'msg' @ [593:48] ==> val msg: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'electionLogs' @ [593:71] ==> val electionLogs: Array<String?> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'joinToString' @ [593:84] ==> public fun <T> Array<out String?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'electionsSuccess' @ [593:111] ==> val electionsSuccess: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'assertTrue' @ [594:13] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'resultsSuccess' @ [594:60] ==> val resultsSuccess: Boolean defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testParallelDaemonStart[LocalVariableDescriptor]

'withFlagFile' @ [599:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [599:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'makeTestDaemonOptions' @ [600:33] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [600:55] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'makeTestDaemonJvmOptions' @ [601:36] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'KotlinCompilerClient' @ [602:26] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [602:47] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [602:71] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [602:83] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [602:93] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [602:111] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [602:126] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [602:162] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [603:13] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [603:55] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'daemon' @ [604:13] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'registerClient' @ [604:21] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'flagFile' @ [604:36] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [604:45] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'KotlinCompilerClient' @ [606:13] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'shutdownCompileService' @ [606:34] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [606:57] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'daemonOptions' @ [606:69] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'sleep' @ [607:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'daemon' @ [611:25] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'getUsedMemory' @ [611:34] ==> public abstract fun getUsedMemory(): CompileService.CallResult<Long> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'e' @ [615:25] ==> val e: ConnectException defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'e' @ [618:25] ==> val e: UnmarshalException defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'e' @ [621:25] ==> val e: ConnectIOException defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [623:13] ==> public open fun assertNotNull(p0: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'exception' @ [623:27] ==> val exception: Exception? /* = Exception? */ defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonConnectionProblems.<anonymous>[LocalVariableDescriptor]

'withFlagFile' @ [628:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [628:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'makeTestDaemonOptions' @ [629:33] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [629:55] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'withLogFile' @ [631:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [632:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [632:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [634:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [634:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [634:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [634:87] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [634:97] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [634:115] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [634:130] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [634:166] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [635:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [635:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemon' @ [636:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'registerClient' @ [636:25] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'flagFile' @ [636:40] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [636:49] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'File' @ [638:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [638:33] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'file' @ [639:17] ==> val file: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'writeText' @ [639:22] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'generateLargeKotlinFile' @ [639:32] ==> internal fun generateLargeKotlinFile(size: Int): String defined in org.jetbrains.kotlin.daemon in file CompilerDaemonTest.kt[SimpleFunctionDescriptorImpl]

'File' @ [640:27] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [640:32] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'absolutePath' @ [640:63] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'callbackServices' @ [643:17] ==> var callbackServices: CompilerCallbackServicesFacadeServer? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'CompilerCallbackServicesFacadeServer' @ [643:36] ==> public constructor CompilerCallbackServicesFacadeServer(incrementalCompilationComponents: IncrementalCompilationComponents? = ..., lookupTracker: LookupTracker? = ..., compilationCanceledStatus: CompilationCanceledStatus? = ..., port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.CompilerCallbackServicesFacadeServer[DeserializedClassConstructorDescriptor]

'thread' @ [645:25] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'sleep' @ [646:36] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'unexportObject' @ [647:49] ==> public open fun unexportObject(p0: (Remote..Remote?), p1: Boolean): Boolean defined in java.rmi.server.UnicastRemoteObject[JavaMethodDescriptor]

'callbackServices' @ [647:64] ==> var callbackServices: CompilerCallbackServicesFacadeServer? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'SOCKET_ANY_FREE_PORT' @ [650:27] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'ByteArrayOutputStream' @ [651:28] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'daemon' @ [652:28] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'remoteCompile' @ [652:37] ==> @Deprecated public abstract fun remoteCompile(sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, servicesFacade: CompilerCallbackServicesFacade, compilerOutputStream: RemoteOutputStream, outputFormat: CompileService.OutputFormat, serviceOutputStream: RemoteOutputStream, operationsTracer: RemoteOperationsTracer?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'CompileService' @ [652:51] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'NO_SESSION' @ [652:66] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'CompileService' @ [653:51] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [653:81] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'arrayOf' @ [654:51] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'file' @ [654:79] ==> val file: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [654:84] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [654:104] ==> val jar: (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'callbackServices' @ [655:51] ==> var callbackServices: CompilerCallbackServicesFacadeServer? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'RemoteOutputStreamServer' @ [656:51] ==> public constructor RemoteOutputStreamServer(out: OutputStream, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteOutputStreamServer[DeserializedClassConstructorDescriptor]

'strm' @ [656:76] ==> val strm: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'SOCKET_ANY_FREE_PORT' @ [656:82] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'CompileService' @ [657:51] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'XML' @ [657:79] ==> enum entry XML defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'RemoteOutputStreamServer' @ [658:51] ==> public constructor RemoteOutputStreamServer(out: OutputStream, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteOutputStreamServer[DeserializedClassConstructorDescriptor]

'strm' @ [658:76] ==> val strm: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'SOCKET_ANY_FREE_PORT' @ [658:82] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'get' @ [659:57] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [661:26] ==> public open fun assertEquals(p0: Int, p1: Int): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'code' @ [661:42] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'strm' @ [663:38] ==> val strm: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toString' @ [663:43] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'assertTrue' @ [664:17] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'compilerOutput' @ [664:66] ==> val compilerOutput: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compilerOutput' @ [664:83] ==> val compilerOutput: String defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[LocalVariableDescriptor]

'contains' @ [664:98] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'logFile' @ [665:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonCallbackConnectionProblems.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [665:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'withDaemon' @ [672:9] ==> internal final fun withDaemon(body: (CompileService) -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'KotlinRemoteReplCompilerClient' @ [673:24] ==> public constructor KotlinRemoteReplCompilerClient(compileService: CompileService, clientAliveFlagFile: File?, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, templateClasspath: List<File>, templateClassName: String, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedClassConstructorDescriptor]

'daemon' @ [673:55] ==> value-parameter daemon: CompileService defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalNoParams.<anonymous>[ValueParameterDescriptorImpl]

'CompileService' @ [673:69] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [673:99] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'emptyArray' @ [674:55] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'TestMessageCollector' @ [675:55] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'classpathFromClassloader' @ [676:55] ==> internal fun classpathFromClassloader(): List<File> defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'ScriptWithNoParam' @ [677:55] ==> public constructor ScriptWithNoParam() defined in org.jetbrains.kotlin.daemon.ScriptWithNoParam[ClassConstructorDescriptorImpl]

'qualifiedName' @ [677:80] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'GenericReplEvaluator' @ [679:34] ==> public constructor GenericReplEvaluator(baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[DeserializedClassConstructorDescriptor]

'emptyList' @ [679:55] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'currentThread' @ [679:75] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [679:91] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'doReplTestWithLocalEval' @ [681:13] ==> private final fun doReplTestWithLocalEval(replCompiler: KotlinRemoteReplCompilerClient, localEvaluator: ReplEvaluator): Unit defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'repl' @ [681:37] ==> val repl: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalNoParams.<anonymous>[LocalVariableDescriptor]

'localEvaluator' @ [681:43] ==> val localEvaluator: GenericReplEvaluator defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalNoParams.<anonymous>[LocalVariableDescriptor]

'repl' @ [682:13] ==> val repl: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalNoParams.<anonymous>[LocalVariableDescriptor]

'dispose' @ [682:18] ==> public open fun dispose(): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'withDaemon' @ [687:9] ==> internal final fun withDaemon(body: (CompileService) -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'KotlinRemoteReplCompilerClient' @ [688:24] ==> public constructor KotlinRemoteReplCompilerClient(compileService: CompileService, clientAliveFlagFile: File?, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, templateClasspath: List<File>, templateClassName: String, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedClassConstructorDescriptor]

'daemon' @ [688:55] ==> value-parameter daemon: CompileService defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalStandardTemplate.<anonymous>[ValueParameterDescriptorImpl]

'CompileService' @ [688:69] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [688:99] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'emptyArray' @ [688:104] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'TestMessageCollector' @ [689:55] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'classpathFromClassloader' @ [690:55] ==> internal fun classpathFromClassloader(): List<File> defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'GenericReplEvaluator' @ [693:34] ==> public constructor GenericReplEvaluator(baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[DeserializedClassConstructorDescriptor]

'emptyList' @ [693:55] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'currentThread' @ [693:75] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [693:91] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'ScriptArgsWithTypes' @ [694:55] ==> public constructor ScriptArgsWithTypes(scriptArgs: Array<out Any?>, scriptArgsTypes: Array<out KClass<out Any>>) defined in org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes[DeserializedClassConstructorDescriptor]

'arrayOf' @ [694:75] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Array<String>): Array<Array<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Array<String>

'emptyArray' @ [694:83] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'arrayOf' @ [694:106] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KClass<Array<String>>): Array<KClass<Array<String>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<Array<String>>

'Array' @ [694:114] ==> public constructor Array<T>(size: Int, init: (Int) -> Any?) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> Any?

'doReplTestWithLocalEval' @ [696:13] ==> private final fun doReplTestWithLocalEval(replCompiler: KotlinRemoteReplCompilerClient, localEvaluator: ReplEvaluator): Unit defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'repl' @ [696:37] ==> val repl: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalStandardTemplate.<anonymous>[LocalVariableDescriptor]

'localEvaluator' @ [696:43] ==> val localEvaluator: GenericReplEvaluator defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalStandardTemplate.<anonymous>[LocalVariableDescriptor]

'repl' @ [697:13] ==> val repl: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplLocalEvalStandardTemplate.<anonymous>[LocalVariableDescriptor]

'dispose' @ [697:18] ==> public open fun dispose(): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'replCompiler' @ [703:29] ==> value-parameter replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[ValueParameterDescriptorImpl]

'createState' @ [703:42] ==> public open fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'localEvaluator' @ [704:30] ==> value-parameter localEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[ValueParameterDescriptorImpl]

'createState' @ [704:45] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'replCompiler' @ [706:20] ==> value-parameter replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[ValueParameterDescriptorImpl]

'check' @ [706:33] ==> public open fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerState' @ [706:39] ==> val compilerState: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'ReplCodeLine' @ [706:54] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'assertTrue' @ [707:18] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res0' @ [707:57] ==> val res0: ReplCheckResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res0' @ [707:64] ==> val res0: ReplCheckResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'ReplCodeLine' @ [709:25] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'replCompiler' @ [710:20] ==> value-parameter replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[ValueParameterDescriptorImpl]

'compile' @ [710:33] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerState' @ [710:41] ==> val compilerState: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'codeLine1' @ [710:56] ==> val codeLine1: ReplCodeLine defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res1' @ [711:21] ==> val res1: ReplCompileResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'assertNotNull' @ [712:18] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res1' @ [712:61] ==> val res1: ReplCompileResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res1c' @ [712:68] ==> val res1c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'localEvaluator' @ [714:21] ==> value-parameter localEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[ValueParameterDescriptorImpl]

'eval' @ [714:36] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'evaluatorState' @ [714:41] ==> val evaluatorState: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res1c' @ [714:57] ==> val res1c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res11' @ [715:22] ==> val res11: ReplEvalResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'assertNotNull' @ [716:18] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res11' @ [716:58] ==> val res11: ReplEvalResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res11e' @ [716:66] ==> val res11e: ReplEvalResult.UnitResult? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'ReplCodeLine' @ [718:25] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'replCompiler' @ [719:20] ==> value-parameter replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[ValueParameterDescriptorImpl]

'compile' @ [719:33] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerState' @ [719:41] ==> val compilerState: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'codeLine2' @ [719:56] ==> val codeLine2: ReplCodeLine defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res2' @ [720:21] ==> val res2: ReplCompileResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'assertNotNull' @ [721:18] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res2' @ [721:61] ==> val res2: ReplCompileResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res2c' @ [721:68] ==> val res2c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'localEvaluator' @ [723:21] ==> value-parameter localEvaluator: ReplEvaluator defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[ValueParameterDescriptorImpl]

'eval' @ [723:36] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[DeserializedSimpleFunctionDescriptor]

'evaluatorState' @ [723:41] ==> val evaluatorState: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res2c' @ [723:57] ==> val res2c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res21' @ [724:22] ==> val res21: ReplEvalResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'assertNotNull' @ [725:18] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res21' @ [725:58] ==> val res21: ReplEvalResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'res21e' @ [725:66] ==> val res21e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'assertEquals' @ [726:18] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res21e' @ [726:34] ==> val res21e: ReplEvalResult.ValueResult? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.doReplTestWithLocalEval[LocalVariableDescriptor]

'value' @ [726:43] ==> public final val value: Any? defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[DeserializedPropertyDescriptor]

'withFlagFile' @ [730:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [730:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'DaemonOptions' @ [731:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [731:153] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [731:158] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaPropertyDescriptor]

'getTestName' @ [731:166] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'absolutePath' @ [731:185] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'withLogFile' @ [733:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [734:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [734:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [736:30] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [736:51] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [736:75] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [736:87] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [736:97] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [736:115] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [736:130] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [736:166] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [737:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [737:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'KotlinRemoteReplCompilerClient' @ [739:36] ==> public constructor KotlinRemoteReplCompilerClient(compileService: CompileService, clientAliveFlagFile: File?, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, templateClasspath: List<File>, templateClassName: String, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedClassConstructorDescriptor]

'daemon' @ [739:67] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'CompileService' @ [739:83] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [739:113] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'emptyArray' @ [740:67] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'TestMessageCollector' @ [741:67] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'classpathFromClassloader' @ [742:67] ==> internal fun classpathFromClassloader(): List<File> defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'ScriptWithNoParam' @ [743:67] ==> public constructor ScriptWithNoParam() defined in org.jetbrains.kotlin.daemon.ScriptWithNoParam[ClassConstructorDescriptorImpl]

'qualifiedName' @ [743:92] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'replCompiler' @ [745:37] ==> val replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'createState' @ [745:50] ==> public open fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'..' @ [748:34] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ReplCodeLine' @ [749:37] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'attempts' @ [749:50] ==> val attempts: Int defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replCompiler' @ [750:32] ==> val replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'compile' @ [750:45] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerState' @ [750:53] ==> val compilerState: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'codeLine1' @ [750:68] ==> val codeLine1: ReplCodeLine defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'res1' @ [751:33] ==> val res1: ReplCompileResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertNotNull' @ [752:30] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'res1' @ [752:73] ==> val res1: ReplCompileResult defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'res1c' @ [752:80] ==> val res1c: ReplCompileResult.CompiledClasses? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'sleep' @ [753:28] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'..' @ [757:34] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'logFile' @ [758:25] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isLogContainsSequence' @ [758:33] ==> internal fun File.isLogContainsSequence(vararg patterns: String): Boolean defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'sleep' @ [759:28] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'replCompiler' @ [761:17] ==> val replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[LocalVariableDescriptor]

'dispose' @ [761:30] ==> public open fun dispose(): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedSimpleFunctionDescriptor]

'sleep' @ [763:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'logFile' @ [764:17] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.testDaemonReplAutoshutdownOnIdle.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [764:25] ==> internal fun File.assertLogContainsSequence(vararg patterns: String): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'withFlagFile' @ [771:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [771:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'makeTestDaemonOptions' @ [772:33] ==> public final fun makeTestDaemonOptions(testName: String, shutdownDelay: Int = ...): DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'getTestName' @ [772:55] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[JavaMethodDescriptor]

'withLogFile' @ [773:13] ==> internal inline fun withLogFile(prefix: String, suffix: String = ..., printLogOnException: Boolean = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'makeTestDaemonJvmOptions' @ [774:40] ==> public final fun makeTestDaemonJvmOptions(logFile: File? = ..., xmx: Int = ..., args: Iterable<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[SimpleFunctionDescriptorImpl]

'logFile' @ [774:65] ==> value-parameter logFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.withDaemon.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCompilerClient' @ [775:47] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [775:68] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [775:92] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest[PropertyDescriptorImpl]

'flagFile' @ [775:104] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.withDaemon.<anonymous>[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [775:114] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.withDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [775:132] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.withDaemon.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [775:147] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'err' @ [775:183] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'assertNotNull' @ [776:17] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [776:59] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.withDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [778:17] ==> public abstract operator fun invoke(p1: CompileService): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'daemon' @ [778:22] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerDaemonTest.withDaemon.<anonymous>.<anonymous>[LocalVariableDescriptor]

'buildString' @ [787:12] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [788:9] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'..' @ [789:10] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [789:13] ==> value-parameter size: Int defined in org.jetbrains.kotlin.daemon.generateLargeKotlinFile[ValueParameterDescriptorImpl]

'forEach' @ [789:19] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'appendln' @ [790:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [790:35] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.generateLargeKotlinFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [791:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [792:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [792:44] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.generateLargeKotlinFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'appendln' @ [793:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [794:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'repeat' @ [795:13] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'appendln' @ [796:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [799:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [800:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [801:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'size' @ [801:57] ==> value-parameter size: Int defined in org.jetbrains.kotlin.daemon.generateLargeKotlinFile[ValueParameterDescriptorImpl]

'appendln' @ [802:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [803:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reader' @ [810:5] ==> @InlineOnly public inline fun File.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'useLines' @ [810:14] ==> public inline fun <T> Reader.useLines(block: (Sequence<String>) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'it' @ [811:9] ==> value-parameter it: Sequence<String> defined in org.jetbrains.kotlin.daemon.ifLogNotContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [811:12] ==> @InlineOnly public inline fun <T> Sequence<String>.asSequence(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ifNotContainsSequence' @ [811:25] ==> public fun Sequence<String>.ifNotContainsSequence(patterns: List<LinePattern>, body: (LinePattern, Int) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'patterns' @ [811:47] ==> value-parameter vararg patterns: String defined in org.jetbrains.kotlin.daemon.ifLogNotContainsSequence[ValueParameterDescriptorImpl]

'map' @ [811:56] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> LinePattern): List<LinePattern> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LinePattern

'LinePattern' @ [811:62] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'it' @ [811:74] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.ifLogNotContainsSequence.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [811:81] ==> value-parameter body: (LinePattern, Int) -> Unit defined in org.jetbrains.kotlin.daemon.ifLogNotContainsSequence[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [815:72] ==> internal fun File.assertLogContainsSequence(patterns: Iterable<LinePattern>): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'patterns' @ [815:98] ==> value-parameter vararg patterns: String defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence[ValueParameterDescriptorImpl]

'map' @ [815:107] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> LinePattern): List<LinePattern> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LinePattern

'LinePattern' @ [815:113] ==> public fun LinePattern(regex: String, matchCheck: (MatchResult) -> Boolean = ...): LinePattern defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'it' @ [815:125] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'assertLogContainsSequence' @ [817:77] ==> internal fun File.assertLogContainsSequence(patterns: Iterable<LinePattern>): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'patterns' @ [817:103] ==> value-parameter vararg patterns: LinePattern defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence[ValueParameterDescriptorImpl]

'asIterable' @ [817:112] ==> public fun <T> Array<out LinePattern>.asIterable(): Iterable<LinePattern> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinePattern

'reader' @ [820:17] ==> @InlineOnly public inline fun File.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'readLines' @ [820:26] ==> public fun Reader.readLines(): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'lines' @ [821:5] ==> val lines: List<String> defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence[LocalVariableDescriptor]

'asSequence' @ [821:11] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ifNotContainsSequence' @ [821:24] ==> public fun Sequence<String>.ifNotContainsSequence(patternsIter: Iterator<LinePattern>, body: (LinePattern, Int) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[DeserializedSimpleFunctionDescriptor]

'patterns' @ [821:46] ==> value-parameter patterns: Iterable<LinePattern> defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence[ValueParameterDescriptorImpl]

'iterator' @ [821:55] ==> public abstract operator fun iterator(): Iterator<LinePattern> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'fail' @ [823:9] ==> public fun fail(message: String? = ...): Nothing defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'unmatchedPattern' @ [823:49] ==> value-parameter unmatchedPattern: LinePattern defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'regex' @ [823:66] ==> public final val regex: Regex defined in org.jetbrains.kotlin.daemon.LinePattern[DeserializedPropertyDescriptor]

'absolutePath' @ [823:107] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'lineNo' @ [823:132] ==> value-parameter lineNo: Int defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'lines' @ [823:145] ==> val lines: List<String> defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence[LocalVariableDescriptor]

'asSequence' @ [823:151] ==> public fun <T> Iterable<String>.asSequence(): Sequence<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'drop' @ [823:164] ==> public fun <T> Sequence<String>.drop(n: Int): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lineNo' @ [823:169] ==> value-parameter lineNo: Int defined in org.jetbrains.kotlin.daemon.assertLogContainsSequence.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [823:177] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ifLogNotContainsSequence' @ [829:5] ==> internal fun File.ifLogNotContainsSequence(vararg patterns: String, body: (LinePattern, Int) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'patterns' @ [829:31] ==> value-parameter vararg patterns: String defined in org.jetbrains.kotlin.daemon.isLogContainsSequence[ValueParameterDescriptorImpl]

'res' @ [829:51] ==> var res: Boolean defined in org.jetbrains.kotlin.daemon.isLogContainsSequence[LocalVariableDescriptor]

'res' @ [830:12] ==> var res: Boolean defined in org.jetbrains.kotlin.daemon.isLogContainsSequence[LocalVariableDescriptor]

'if (backupValue == null) {
        System.clearProperty(propertyName)
    }
    else {
        System.setProperty(propertyName, backupValue)
    }' @ [834:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'backupValue' @ [834:9] ==> value-parameter backupValue: String? defined in org.jetbrains.kotlin.daemon.restoreSystemProperty[ValueParameterDescriptorImpl]

'clearProperty' @ [835:16] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'propertyName' @ [835:30] ==> value-parameter propertyName: String defined in org.jetbrains.kotlin.daemon.restoreSystemProperty[ValueParameterDescriptorImpl]

'setProperty' @ [838:16] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'propertyName' @ [838:28] ==> value-parameter propertyName: String defined in org.jetbrains.kotlin.daemon.restoreSystemProperty[ValueParameterDescriptorImpl]

'backupValue' @ [838:42] ==> value-parameter backupValue: String? defined in org.jetbrains.kotlin.daemon.restoreSystemProperty[ValueParameterDescriptorImpl]

'createTempFile' @ [843:16] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'prefix' @ [843:31] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.daemon.withFlagFile[ValueParameterDescriptorImpl]

'suffix' @ [843:39] ==> value-parameter suffix: String? = ... defined in org.jetbrains.kotlin.daemon.withFlagFile[ValueParameterDescriptorImpl]

'invoke' @ [845:9] ==> public abstract operator fun invoke(p1: File): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'file' @ [845:14] ==> val file: File defined in org.jetbrains.kotlin.daemon.withFlagFile[LocalVariableDescriptor]

'file' @ [848:9] ==> val file: File defined in org.jetbrains.kotlin.daemon.withFlagFile[LocalVariableDescriptor]

'delete' @ [848:14] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'createTempFile' @ [853:19] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'prefix' @ [853:34] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.daemon.withLogFile[ValueParameterDescriptorImpl]

'suffix' @ [853:42] ==> value-parameter suffix: String = ... defined in org.jetbrains.kotlin.daemon.withLogFile[ValueParameterDescriptorImpl]

'invoke' @ [855:9] ==> public abstract operator fun invoke(p1: File): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'logFile' @ [855:14] ==> val logFile: File defined in org.jetbrains.kotlin.daemon.withLogFile[LocalVariableDescriptor]

'printLogOnException' @ [858:13] ==> value-parameter printLogOnException: Boolean = ... defined in org.jetbrains.kotlin.daemon.withLogFile[ValueParameterDescriptorImpl]

'sleep' @ [859:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'err' @ [860:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [860:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'logFile' @ [860:48] ==> val logFile: File defined in org.jetbrains.kotlin.daemon.withLogFile[LocalVariableDescriptor]

'name' @ [860:56] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'logFile' @ [860:66] ==> val logFile: File defined in org.jetbrains.kotlin.daemon.withLogFile[LocalVariableDescriptor]

'readText' @ [860:74] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'e' @ [862:15] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.withLogFile[LocalVariableDescriptor]

'if (OSKind.current == OSKind.Windows) absolutePath.replace('\\', '/')
        else absolutePath' @ [871:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'OSKind' @ [871:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'current' @ [871:20] ==> public final val current: OSKind defined in org.jetbrains.kotlin.daemon.common.OSKind.Companion[DeserializedPropertyDescriptor]

'OSKind' @ [871:31] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'Windows' @ [871:38] ==> enum entry Windows defined in org.jetbrains.kotlin.daemon.common.OSKind[FakeCallableDescriptorForObject]

'absolutePath' @ [871:47] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'replace' @ [871:60] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'absolutePath' @ [872:14] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'ScriptDependencies' @ [877:16] ==> public constructor ScriptDependencies(javaHome: File? = ..., classpath: List<File> = ..., imports: List<String> = ..., sources: List<File> = ..., scripts: List<File> = ...) defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedClassConstructorDescriptor]

'classpathFromClassloader' @ [878:25] ==> internal fun classpathFromClassloader(): List<File> defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'listOf' @ [879:23] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'asSuccess' @ [880:11] ==> public fun ScriptDependencies.asSuccess(): DependenciesResolver.ResolveResult.Success defined in kotlin.script.experimental.dependencies[DeserializedSimpleFunctionDescriptor]

'ScriptTemplateDefinition' @ [884:1] ==> public constructor ScriptTemplateDefinition(resolver: KClass<out ScriptDependenciesResolver> = ..., scriptFilePattern: String = ...) defined in kotlin.script.templates.ScriptTemplateDefinition[DeserializedClassConstructorDescriptor]

'TestKotlinScriptDummyDependenciesResolver' @ [884:38] ==> public constructor TestKotlinScriptDummyDependenciesResolver() defined in org.jetbrains.kotlin.daemon.TestKotlinScriptDummyDependenciesResolver[ClassConstructorDescriptorImpl]

'?:' @ [888:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<File>?, right: List<File>): List<File>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<File>

'TestKotlinScriptDummyDependenciesResolver' @ [888:10] ==> public constructor TestKotlinScriptDummyDependenciesResolver() defined in org.jetbrains.kotlin.daemon.TestKotlinScriptDummyDependenciesResolver[ClassConstructorDescriptorImpl]

'java' @ [888:59] ==> public val <T> KClass<TestKotlinScriptDummyDependenciesResolver>.java: Class<TestKotlinScriptDummyDependenciesResolver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TestKotlinScriptDummyDependenciesResolver

'classLoader' @ [888:64] ==> public final val <T : (Any..Any?)> Class<TestKotlinScriptDummyDependenciesResolver>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TestKotlinScriptDummyDependenciesResolver

'urLs' @ [888:97] ==> public final val URLClassLoader.urLs: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [889:19] ==> public inline fun <T, R : Any> Array<out (URL..URL?)>.mapNotNull(transform: ((URL..URL?)) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)
    <R : Any> -> File

'filter' @ [890:19] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [890:28] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.classpathFromClassloader.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [890:31] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'contains' @ [890:36] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [890:55] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.classpathFromClassloader.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [890:58] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'contains' @ [890:63] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [891:12] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [895:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'toURI' @ [895:18] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'schemeSpecificPart' @ [895:26] ==> public final val URI.schemeSpecificPart: (String..String?)[MyPropertyDescriptor]

'if (protocol != "file") null
            else File(file)' @ [898:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File?, elseBranch: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File?

'protocol' @ [898:17] ==> public final val URL.protocol: (String..String?)[MyPropertyDescriptor]

'File' @ [899:18] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [899:23] ==> public final val URL.file: (String..String?)[MyPropertyDescriptor]

