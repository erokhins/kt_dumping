'KotlinIntegrationTestBase' @ [38:25] ==> public constructor KotlinIntegrationTestBase() defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaClassConstructorDescriptor]

'getCompilerLib' @ [40:34] ==> public open fun getCompilerLib(): (File..File?) defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'listOf' @ [42:29] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [43:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'compilerLibDir' @ [43:18] ==> private final val compilerLibDir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'listOf' @ [44:34] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [45:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'compilerLibDir' @ [45:18] ==> private final val compilerLibDir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'File' @ [46:13] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'compilerLibDir' @ [46:18] ==> private final val compilerLibDir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'lazy' @ [47:23] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> CompilerId): Lazy<CompilerId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerId

'NONE' @ [47:49] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'CompilerId' @ [47:57] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [47:68] ==> @JvmStatic public final fun makeCompilerId(paths: Iterable<File>): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'compilerClassPath' @ [47:83] ==> public final val compilerClassPath: List<File> defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'getApplication' @ [50:46] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'K2JVMCompiler' @ [52:24] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'exec' @ [52:40] ==> public final fun exec(messageCollector: MessageCollector, services: Services, arguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?)): ExitCode defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [52:45] ==> value-parameter messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally[ValueParameterDescriptorImpl]

'Services' @ [53:45] ==> public companion object defined in org.jetbrains.kotlin.config.Services[FakeCallableDescriptorForObject]

'EMPTY' @ [53:54] ==> @field:JvmField public final val EMPTY: Services defined in org.jetbrains.kotlin.config.Services.Companion[DeserializedPropertyDescriptor]

'K2JVMCompilerArguments' @ [54:45] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'apply' @ [54:70] ==> @InlineOnly public inline fun <T> K2JVMCompilerArguments.apply(block: K2JVMCompilerArguments.() -> Unit): K2JVMCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JVMCompilerArguments

'K2JVMCompiler' @ [54:78] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'parseArguments' @ [54:94] ==> public final fun parseArguments(args: Array<out String>, arguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?)): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedSimpleFunctionDescriptor]

'args' @ [54:109] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally[ValueParameterDescriptorImpl]

'this' @ [54:115] ==> <this> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally.<anonymous>[ReceiverParameterDescriptorImpl]

'code' @ [54:124] ==> public final val ExitCode.code: Int[MyPropertyDescriptor]

'messageCollector' @ [55:27] ==> value-parameter messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally[ValueParameterDescriptorImpl]

'messages' @ [55:44] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.daemon.TestMessageCollector[PropertyDescriptorImpl]

'filter' @ [55:53] ==> public inline fun <T> Iterable<TestMessageCollector.Message>.filter(predicate: (TestMessageCollector.Message) -> Boolean): List<TestMessageCollector.Message> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'it' @ [55:62] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [55:65] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

'OUTPUT' @ [55:101] ==> enum entry OUTPUT defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'mapNotNull' @ [55:110] ==> public inline fun <T, R : Any> Iterable<TestMessageCollector.Message>.mapNotNull(transform: (TestMessageCollector.Message) -> OutputMessageUtil.Output?): List<OutputMessageUtil.Output> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message
    <R : Any> -> Output

'parseOutputMessage' @ [56:35] ==> @Nullable public open fun parseOutputMessage(@NotNull p0: String): OutputMessageUtil.Output? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'it' @ [56:54] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [56:57] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

'let' @ [56:67] ==> @InlineOnly public inline fun <T, R> OutputMessageUtil.Output.let(block: (OutputMessageUtil.Output) -> OutputMessageUtil.Output?): OutputMessageUtil.Output? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output
    <R> -> Output?

'outs' @ [57:21] ==> value-parameter outs: OutputMessageUtil.Output defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [57:26] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'let' @ [57:38] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> OutputMessageUtil.Output): OutputMessageUtil.Output defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Output

'Output' @ [57:62] ==> public constructor Output(@NotNull p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>), @Nullable p1: File?) defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaClassConstructorDescriptor]

'outs' @ [57:69] ==> value-parameter outs: OutputMessageUtil.Output defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [57:74] ==> @NotNull public final val sourceFiles: (MutableCollection<(File..File?)>..Collection<(File..File?)>) defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'it' @ [57:87] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'code' @ [60:20] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally[LocalVariableDescriptor]

'outputs' @ [60:28] ==> val outputs: List<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally[LocalVariableDescriptor]

'resetApplicationToNull' @ [63:30] ==> public open fun resetApplicationToNull(p0: (Application..Application?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'application' @ [63:53] ==> val application: (Application..Application?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileLocally[LocalVariableDescriptor]

'KotlinCompilerClient' @ [69:22] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [69:43] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [69:67] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'clientAliveFile' @ [69:79] ==> value-parameter clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [69:96] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'daemonOptions' @ [69:114] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'DaemonReportingTargets' @ [70:67] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'messageCollector' @ [70:109] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'assertNotNull' @ [71:9] ==> public open fun assertNotNull(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'daemon' @ [71:51] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[LocalVariableDescriptor]

'daemon' @ [73:9] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[LocalVariableDescriptor]

'registerClient' @ [73:17] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'clientAliveFile' @ [73:32] ==> value-parameter clientAliveFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'absolutePath' @ [73:48] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'arrayListOf' @ [75:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<OutputMessageUtil.Output> /* = ArrayList<OutputMessageUtil.Output> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'KotlinCompilerClient' @ [77:20] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'compile' @ [77:41] ==> public final fun compile(compilerService: CompileService, sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., compilerMode: CompilerMode = ..., reportSeverity: ReportSeverity = ..., port: Int = ..., profiler: Profiler = ...): Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'daemon' @ [77:49] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[LocalVariableDescriptor]

'CompileService' @ [77:59] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'NO_SESSION' @ [77:74] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'CompileService' @ [77:86] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [77:116] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'args' @ [77:121] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'messageCollector' @ [77:127] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[ValueParameterDescriptorImpl]

'outputs' @ [78:72] ==> val outputs: ArrayList<OutputMessageUtil.Output> /* = ArrayList<OutputMessageUtil.Output> */ defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[LocalVariableDescriptor]

'add' @ [78:80] ==> public open fun add(element: OutputMessageUtil.Output): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Output' @ [78:102] ==> public constructor Output(@NotNull p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>), @Nullable p1: File?) defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaClassConstructorDescriptor]

'srcFiles' @ [78:109] ==> value-parameter srcFiles: List<File> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon.<anonymous>[ValueParameterDescriptorImpl]

'outFile' @ [78:119] ==> value-parameter outFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon.<anonymous>[ValueParameterDescriptorImpl]

'ReportSeverity' @ [79:66] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [79:81] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'code' @ [80:16] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[LocalVariableDescriptor]

'outputs' @ [80:24] ==> val outputs: ArrayList<OutputMessageUtil.Output> /* = ArrayList<OutputMessageUtil.Output> */ defined in org.jetbrains.kotlin.daemon.CompilerApiTest.compileOnDaemon[LocalVariableDescriptor]

'+' @ [83:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [83:64] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'+' @ [84:52] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [84:68] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'runJava' @ [86:83] ==> protected/*protected and package*/ open fun runJava(@NotNull p0: String, @Nullable p1: String?, @NotNull vararg p2: (String..String?)): Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaMethodDescriptor]

'baseDir' @ [86:91] ==> value-parameter baseDir: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.run[ValueParameterDescriptorImpl]

'logName' @ [86:100] ==> value-parameter logName: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.run[ValueParameterDescriptorImpl]

'args' @ [86:110] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.run[ValueParameterDescriptorImpl]

'URLClassLoader' @ [90:18] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'classpath' @ [90:33] ==> value-parameter classpath: List<File> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[ValueParameterDescriptorImpl]

'map' @ [90:43] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [90:49] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [90:52] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [90:60] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [90:70] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'cl' @ [91:27] ==> val cl: URLClassLoader defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[LocalVariableDescriptor]

'loadClass' @ [91:30] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'scriptClassName' @ [91:40] ==> value-parameter scriptClassName: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[ValueParameterDescriptorImpl]

'captureOut' @ [93:25] ==> internal fun captureOut(body: () -> Unit): String defined in org.jetbrains.kotlin.scripts[SimpleFunctionDescriptorImpl]

'scriptClass' @ [93:38] ==> val scriptClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[LocalVariableDescriptor]

'constructors' @ [93:50] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.constructors: (Array<(Constructor<*>..Constructor<*>?)>..Array<out (Constructor<*>..Constructor<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'first' @ [93:63] ==> public fun <T> Array<out (Constructor<*>..Constructor<*>?)>.first(): (Constructor<*>..Constructor<*>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Constructor<*>..java.lang.reflect.Constructor<*>?)

'newInstance' @ [93:71] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'arguments' @ [93:83] ==> value-parameter vararg arguments: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[ValueParameterDescriptorImpl]

'logName' @ [95:13] ==> value-parameter logName: String? defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[ValueParameterDescriptorImpl]

'File' @ [96:32] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataDir' @ [96:37] ==> value-parameter testDataDir: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[ValueParameterDescriptorImpl]

'logName' @ [96:50] ==> value-parameter logName: String? defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[ValueParameterDescriptorImpl]

'normalizeOutput' @ [97:37] ==> @NotNull protected/*protected and package*/ open fun normalizeOutput(@NotNull p0: File, @NotNull p1: String): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaMethodDescriptor]

'File' @ [97:53] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataDir' @ [97:58] ==> value-parameter testDataDir: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[ValueParameterDescriptorImpl]

'scriptOut' @ [97:80] ==> val scriptOut: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[LocalVariableDescriptor]

'assertEqualsToFile' @ [99:29] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedFile' @ [99:48] ==> val expectedFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[LocalVariableDescriptor]

'normalizedContent' @ [99:62] ==> val normalizedContent: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.runScriptWithArgs[LocalVariableDescriptor]

'K2JVMCompilerArguments' @ [106:17] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'apply' @ [106:42] ==> @InlineOnly public inline fun <T> K2JVMCompilerArguments.apply(block: K2JVMCompilerArguments.() -> Unit): K2JVMCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JVMCompilerArguments

'body' @ [106:48] ==> value-parameter body: K2JVMCompilerArguments.() -> Unit defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testScriptResolverEnvironmentArgsParsing.args[ValueParameterDescriptorImpl]

'..' @ [108:24] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [108:32] ==> public fun <T> Iterable<Int>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Int) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [108:54] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testScriptResolverEnvironmentArgsParsing.<anonymous>[ValueParameterDescriptorImpl]

'toRegex' @ [109:42] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'TestMessageCollector' @ [110:32] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'assertEquals' @ [111:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'hashMapOf' @ [111:29] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, String>): HashMap<String, String> /* = HashMap<String, String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [111:39] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [111:55] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [111:78] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'unescapeRe' @ [111:88] ==> val unescapeRe: Regex defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testScriptResolverEnvironmentArgsParsing[LocalVariableDescriptor]

'replace' @ [111:99] ==> public final fun replace(input: CharSequence, replacement: String): String defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'longStr' @ [111:107] ==> val longStr: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testScriptResolverEnvironmentArgsParsing[LocalVariableDescriptor]

'K2JVMCompiler' @ [112:29] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[FakeCallableDescriptorForObject]

'createScriptResolverEnvironment' @ [112:43] ==> public final fun createScriptResolverEnvironment(arguments: K2JVMCompilerArguments, messageCollector: MessageCollector): HashMap<String, Any?>? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[DeserializedSimpleFunctionDescriptor]

'args' @ [113:33] ==> local final fun args(body: K2JVMCompilerArguments.() -> Unit): K2JVMCompilerArguments defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testScriptResolverEnvironmentArgsParsing[SimpleFunctionDescriptorImpl]

'scriptResolverEnvironment' @ [113:40] ==> @Argument public final var scriptResolverEnvironment: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arrayOf' @ [113:68] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'longStr' @ [113:120] ==> val longStr: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testScriptResolverEnvironmentArgsParsing[LocalVariableDescriptor]

'messageCollector' @ [114:33] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testScriptResolverEnvironmentArgsParsing[LocalVariableDescriptor]

'TestMessageCollector' @ [118:32] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'tmpdir' @ [119:19] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'absolutePath' @ [119:26] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [119:46] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'component1' @ [120:14] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [120:20] ==> public final operator fun component2(): Collection<OutputMessageUtil.Output> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'compileLocally' @ [120:31] ==> private final fun compileLocally(messageCollector: TestMessageCollector, vararg args: String): Pair<Int, Collection<OutputMessageUtil.Output>> defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'messageCollector' @ [120:46] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloAppLocal[LocalVariableDescriptor]

'File' @ [120:84] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [120:89] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [120:123] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [121:52] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloAppLocal[LocalVariableDescriptor]

'assertEquals' @ [122:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'code' @ [122:32] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloAppLocal[LocalVariableDescriptor]

'assertTrue' @ [123:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'outputs' @ [123:27] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloAppLocal[LocalVariableDescriptor]

'isNotEmpty' @ [123:35] ==> @InlineOnly public inline fun <T> Collection<OutputMessageUtil.Output>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'assertEquals' @ [124:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'jar' @ [124:29] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloAppLocal[LocalVariableDescriptor]

'outputs' @ [124:34] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloAppLocal[LocalVariableDescriptor]

'first' @ [124:42] ==> public fun <T> Iterable<OutputMessageUtil.Output>.first(): OutputMessageUtil.Output defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'outputFile' @ [124:50] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'absolutePath' @ [124:62] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'run' @ [125:9] ==> private final fun run(baseDir: String, logName: String, vararg args: String): Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'getHelloAppBaseDir' @ [125:13] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'jar' @ [125:55] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloAppLocal[LocalVariableDescriptor]

'withFlagFile' @ [129:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [129:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaMethodDescriptor]

'DaemonOptions' @ [130:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [130:62] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [130:67] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'getTestName' @ [130:75] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaMethodDescriptor]

'absolutePath' @ [130:94] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'createTempFile' @ [134:27] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'configureDaemonJVMOptions' @ [136:36] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_LOG_PATH_PROPERTY' @ [136:65] ==> public val COMPILE_DAEMON_LOG_PATH_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'logFile' @ [136:102] ==> val logFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'loggerCompatiblePath' @ [136:110] ==> internal val File.loggerCompatiblePath: String defined in org.jetbrains.kotlin.daemon in file CompilerDaemonTest.kt[PropertyDescriptorImpl]

'tmpdir' @ [138:23] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'absolutePath' @ [138:30] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'separator' @ [138:50] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'component1' @ [141:22] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [141:28] ==> public final operator fun component2(): Collection<OutputMessageUtil.Output> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'compileOnDaemon' @ [141:39] ==> private final fun compileOnDaemon(clientAliveFile: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, messageCollector: MessageCollector, vararg args: String): Pair<Int, Collection<OutputMessageUtil.Output>> defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'flagFile' @ [142:25] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[ValueParameterDescriptorImpl]

'compilerId' @ [142:35] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'daemonJVMOptions' @ [142:47] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [142:65] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'TestMessageCollector' @ [142:80] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'File' @ [143:25] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getHelloAppBaseDir' @ [143:30] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [143:64] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'jar' @ [143:84] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [145:24] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'code' @ [145:40] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [146:24] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'outputs' @ [146:35] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [146:43] ==> @InlineOnly public inline fun <T> Collection<OutputMessageUtil.Output>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'assertEquals' @ [147:24] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'jar' @ [147:37] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'outputs' @ [147:42] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'first' @ [147:50] ==> public fun <T> Iterable<OutputMessageUtil.Output>.first(): OutputMessageUtil.Output defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'outputFile' @ [147:58] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'absolutePath' @ [147:70] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'run' @ [148:17] ==> private final fun run(baseDir: String, logName: String, vararg args: String): Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'getHelloAppBaseDir' @ [148:21] ==> private final fun getHelloAppBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'jar' @ [148:63] ==> val jar: String defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'KotlinCompilerClient' @ [151:17] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'shutdownCompileService' @ [151:38] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [151:61] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'daemonOptions' @ [151:73] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'logFile' @ [152:17] ==> val logFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testHelloApp.<anonymous>[LocalVariableDescriptor]

'delete' @ [152:25] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'TestMessageCollector' @ [158:32] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'component1' @ [159:14] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [159:20] ==> public final operator fun component2(): Collection<OutputMessageUtil.Output> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'compileLocally' @ [159:31] ==> private final fun compileLocally(messageCollector: TestMessageCollector, vararg args: String): Pair<Int, Collection<OutputMessageUtil.Output>> defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'messageCollector' @ [159:46] ==> val messageCollector: TestMessageCollector defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScriptLocal[LocalVariableDescriptor]

'File' @ [159:64] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getSimpleScriptBaseDir' @ [159:69] ==> private final fun getSimpleScriptBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [159:109] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [160:52] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'absolutePath' @ [160:59] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [161:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'code' @ [161:32] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScriptLocal[LocalVariableDescriptor]

'assertTrue' @ [162:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'outputs' @ [162:27] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScriptLocal[LocalVariableDescriptor]

'isNotEmpty' @ [162:35] ==> @InlineOnly public inline fun <T> Collection<OutputMessageUtil.Output>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'assertEquals' @ [163:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'File' @ [163:29] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [163:34] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'absolutePath' @ [163:58] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'outputs' @ [163:72] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScriptLocal[LocalVariableDescriptor]

'first' @ [163:80] ==> public fun <T> Iterable<OutputMessageUtil.Output>.first(): OutputMessageUtil.Output defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'outputFile' @ [163:88] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'absolutePath' @ [163:100] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'runScriptWithArgs' @ [164:9] ==> private final fun runScriptWithArgs(testDataDir: String, logName: String?, scriptClassName: String, classpath: List<File>, vararg arguments: String): Unit defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'getSimpleScriptBaseDir' @ [164:27] ==> private final fun getSimpleScriptBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'scriptRuntimeClassPath' @ [164:73] ==> public final val scriptRuntimeClassPath: List<File> defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'tmpdir' @ [164:98] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'withFlagFile' @ [168:9] ==> internal inline fun withFlagFile(prefix: String, suffix: String? = ..., body: (File) -> Unit): Unit defined in org.jetbrains.kotlin.daemon[SimpleFunctionDescriptorImpl]

'getTestName' @ [168:22] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaMethodDescriptor]

'DaemonOptions' @ [169:33] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'File' @ [169:62] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [169:67] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'getTestName' @ [169:75] ==> protected/*protected and package*/ open fun getTestName(p0: Boolean): (String..String?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaMethodDescriptor]

'absolutePath' @ [169:94] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'createTempFile' @ [173:27] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'configureDaemonJVMOptions' @ [175:36] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_LOG_PATH_PROPERTY' @ [175:65] ==> public val COMPILE_DAEMON_LOG_PATH_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'logFile' @ [175:102] ==> val logFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'loggerCompatiblePath' @ [175:110] ==> internal val File.loggerCompatiblePath: String defined in org.jetbrains.kotlin.daemon in file CompilerDaemonTest.kt[PropertyDescriptorImpl]

'component1' @ [178:22] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [178:28] ==> public final operator fun component2(): Collection<OutputMessageUtil.Output> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'compileOnDaemon' @ [178:39] ==> private final fun compileOnDaemon(clientAliveFile: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, messageCollector: MessageCollector, vararg args: String): Pair<Int, Collection<OutputMessageUtil.Output>> defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'flagFile' @ [179:25] ==> value-parameter flagFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[ValueParameterDescriptorImpl]

'compilerId' @ [179:35] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'daemonJVMOptions' @ [179:47] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [179:65] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'TestMessageCollector' @ [179:80] ==> public constructor TestMessageCollector() defined in org.jetbrains.kotlin.daemon.TestMessageCollector[ClassConstructorDescriptorImpl]

'File' @ [180:25] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getSimpleScriptBaseDir' @ [180:30] ==> private final fun getSimpleScriptBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'absolutePath' @ [180:70] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [180:115] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'absolutePath' @ [180:122] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [182:24] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'code' @ [182:40] ==> val code: Int defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [183:24] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'outputs' @ [183:35] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [183:43] ==> @InlineOnly public inline fun <T> Collection<OutputMessageUtil.Output>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'assertEquals' @ [184:24] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'File' @ [184:37] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [184:42] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'absolutePath' @ [184:66] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'outputs' @ [184:80] ==> val outputs: Collection<OutputMessageUtil.Output> defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'first' @ [184:88] ==> public fun <T> Iterable<OutputMessageUtil.Output>.first(): OutputMessageUtil.Output defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output

'outputFile' @ [184:96] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'absolutePath' @ [184:108] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'runScriptWithArgs' @ [185:17] ==> private final fun runScriptWithArgs(testDataDir: String, logName: String?, scriptClassName: String, classpath: List<File>, vararg arguments: String): Unit defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'getSimpleScriptBaseDir' @ [185:35] ==> private final fun getSimpleScriptBaseDir(): String defined in org.jetbrains.kotlin.daemon.CompilerApiTest[SimpleFunctionDescriptorImpl]

'scriptRuntimeClassPath' @ [185:81] ==> public final val scriptRuntimeClassPath: List<File> defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'tmpdir' @ [185:106] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.daemon.CompilerApiTest[JavaPropertyDescriptor]

'KotlinCompilerClient' @ [188:17] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'shutdownCompileService' @ [188:38] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [188:61] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompilerApiTest[PropertyDescriptorImpl]

'daemonOptions' @ [188:73] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'logFile' @ [189:17] ==> val logFile: File defined in org.jetbrains.kotlin.daemon.CompilerApiTest.testSimpleScript.<anonymous>[LocalVariableDescriptor]

'delete' @ [189:25] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'arrayListOf' @ [198:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'messages' @ [201:9] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.daemon.TestMessageCollector[PropertyDescriptorImpl]

'clear' @ [201:18] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'messages' @ [205:9] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.daemon.TestMessageCollector[PropertyDescriptorImpl]

'add' @ [205:18] ==> public open fun add(element: TestMessageCollector.Message): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Message' @ [205:22] ==> public constructor Message(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation?) defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[ClassConstructorDescriptorImpl]

'severity' @ [205:30] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.TestMessageCollector.report[ValueParameterDescriptorImpl]

'message' @ [205:40] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.TestMessageCollector.report[ValueParameterDescriptorImpl]

'location' @ [205:49] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.daemon.TestMessageCollector.report[ValueParameterDescriptorImpl]

'messages' @ [208:41] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.daemon.TestMessageCollector[PropertyDescriptorImpl]

'any' @ [208:50] ==> public inline fun <T> Iterable<TestMessageCollector.Message>.any(predicate: (TestMessageCollector.Message) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'it' @ [208:56] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.TestMessageCollector.hasErrors.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [208:59] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

'EXCEPTION' @ [208:95] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'it' @ [208:108] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.TestMessageCollector.hasErrors.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [208:111] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

'ERROR' @ [208:147] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'assert' @ [212:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'messages' @ [212:12] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.daemon.TestMessageCollector[PropertyDescriptorImpl]

'any' @ [212:21] ==> public inline fun <T> Iterable<TestMessageCollector.Message>.any(predicate: (TestMessageCollector.Message) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'it' @ [212:27] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.assertHasMessage.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [212:30] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

'contains' @ [212:38] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'msg' @ [212:47] ==> value-parameter msg: String defined in org.jetbrains.kotlin.daemon.assertHasMessage[ValueParameterDescriptorImpl]

'desiredSeverity' @ [212:56] ==> value-parameter desiredSeverity: CompilerMessageSeverity? = ... defined in org.jetbrains.kotlin.daemon.assertHasMessage[ValueParameterDescriptorImpl]

'it' @ [212:83] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.assertHasMessage.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [212:86] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

'desiredSeverity' @ [212:98] ==> value-parameter desiredSeverity: CompilerMessageSeverity? = ... defined in org.jetbrains.kotlin.daemon.assertHasMessage[ValueParameterDescriptorImpl]

'+' @ [213:9] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'msg' @ [213:31] ==> value-parameter msg: String defined in org.jetbrains.kotlin.daemon.assertHasMessage[ValueParameterDescriptorImpl]

'desiredSeverity' @ [213:53] ==> value-parameter desiredSeverity: CompilerMessageSeverity? = ... defined in org.jetbrains.kotlin.daemon.assertHasMessage[ValueParameterDescriptorImpl]

'toString' @ [213:70] ==> public open fun toString(): String defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[DeserializedSimpleFunctionDescriptor]

'messages' @ [214:9] ==> public final val messages: ArrayList<TestMessageCollector.Message> /* = ArrayList<TestMessageCollector.Message> */ defined in org.jetbrains.kotlin.daemon.TestMessageCollector[PropertyDescriptorImpl]

'joinToString' @ [214:18] ==> public fun <T> Iterable<TestMessageCollector.Message>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TestMessageCollector.Message) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Message

'it' @ [214:39] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.assertHasMessage.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [214:42] ==> public final val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

'toString' @ [214:51] ==> public open fun toString(): String defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[DeserializedSimpleFunctionDescriptor]

'it' @ [214:71] ==> value-parameter it: TestMessageCollector.Message defined in org.jetbrains.kotlin.daemon.assertHasMessage.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [214:74] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.TestMessageCollector.Message[PropertyDescriptorImpl]

