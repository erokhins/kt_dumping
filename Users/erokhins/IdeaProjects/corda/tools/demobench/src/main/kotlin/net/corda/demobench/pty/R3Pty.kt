'loggerFor' @ [18:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> R3Pty

'newSingleThreadExecutor' @ [21:38] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'JediTermWidget' @ [23:20] ==> public constructor JediTermWidget(p0: (Dimension..Dimension?), p1: (SettingsProvider..SettingsProvider?)) defined in com.jediterm.terminal.ui.JediTermWidget[JavaClassConstructorDescriptor]

'dimension' @ [23:35] ==> value-parameter dimension: Dimension defined in net.corda.demobench.pty.R3Pty.<init>[ValueParameterDescriptorImpl]

'settings' @ [23:46] ==> value-parameter settings: SettingsProvider defined in net.corda.demobench.pty.R3Pty.<init>[ValueParameterDescriptorImpl]

'terminal' @ [25:38] ==> public final val terminal: JediTermWidget defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'ttyConnector' @ [25:47] ==> public final var JediTermWidget.ttyConnector: (TtyConnector..TtyConnector?)[MyPropertyDescriptor]

'isConnected' @ [25:61] ==> public final val TtyConnector.isConnected: Boolean[MyPropertyDescriptor]

'log' @ [28:9] ==> public final val log: Logger defined in net.corda.demobench.pty.R3Pty.Companion[PropertyDescriptorImpl]

'info' @ [28:13] ==> public abstract fun info(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'name' @ [28:43] ==> public final val name: X500Name defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'executor' @ [29:9] ==> private final val executor: (ExecutorService..ExecutorService?) defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'shutdown' @ [29:18] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'terminal' @ [30:9] ==> public final val terminal: JediTermWidget defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'close' @ [30:18] ==> public open fun close(): Unit defined in com.jediterm.terminal.ui.JediTermWidget[JavaMethodDescriptor]

'exec' @ [34:34] ==> public open fun exec(p0: (Array<(String..String?)>..Array<out (String..String?)>?), p1: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?), p2: (String..String?)): (PtyProcess..PtyProcess?) defined in com.pty4j.PtyProcess[JavaMethodDescriptor]

'command' @ [34:39] ==> value-parameter command: Array<String> defined in net.corda.demobench.pty.R3Pty.createTtyConnector[ValueParameterDescriptorImpl]

'environment' @ [34:48] ==> value-parameter environment: Map<String, String> defined in net.corda.demobench.pty.R3Pty.createTtyConnector[ValueParameterDescriptorImpl]

'workingDir' @ [34:61] ==> value-parameter workingDir: String? defined in net.corda.demobench.pty.R3Pty.createTtyConnector[ValueParameterDescriptorImpl]

'PtyProcessTtyConnector' @ [37:20] ==> public constructor PtyProcessTtyConnector(name: String, process: PtyProcess, charset: Charset) defined in net.corda.demobench.pty.PtyProcessTtyConnector[ClassConstructorDescriptorImpl]

'name' @ [37:43] ==> public final val name: X500Name defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'commonName' @ [37:48] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'process' @ [37:60] ==> val process: (PtyProcess..PtyProcess?) defined in net.corda.demobench.pty.R3Pty.createTtyConnector[LocalVariableDescriptor]

'UTF_8' @ [37:69] ==> public final val UTF_8: (Charset..Charset?) defined in java.nio.charset.StandardCharsets[JavaPropertyDescriptor]

'process' @ [39:13] ==> val process: (PtyProcess..PtyProcess?) defined in net.corda.demobench.pty.R3Pty.createTtyConnector[LocalVariableDescriptor]

'destroyForcibly' @ [39:21] ==> public open fun destroyForcibly(): (Process..Process?) defined in com.pty4j.PtyProcess[JavaMethodDescriptor]

'process' @ [40:13] ==> val process: (PtyProcess..PtyProcess?) defined in net.corda.demobench.pty.R3Pty.createTtyConnector[LocalVariableDescriptor]

'waitFor' @ [40:21] ==> public open fun waitFor(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in com.pty4j.PtyProcess[JavaMethodDescriptor]

'SECONDS' @ [40:33] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'e' @ [41:19] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.pty.R3Pty.createTtyConnector[LocalVariableDescriptor]

'Throws' @ [45:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [45:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'check' @ [47:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [47:15] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'terminal' @ [47:16] ==> public final val terminal: JediTermWidget defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'isSessionRunning' @ [47:25] ==> public final val JediTermWidget.isSessionRunning: Boolean[MyPropertyDescriptor]

'terminal' @ [47:48] ==> public final val terminal: JediTermWidget defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'sessionName' @ [47:57] ==> public final val JediTermWidget.sessionName: (String..String?)[MyPropertyDescriptor]

'envs' @ [49:27] ==> value-parameter envs: Map<String, String> defined in net.corda.demobench.pty.R3Pty.run[ValueParameterDescriptorImpl]

'toMutableMap' @ [49:32] ==> @SinceKotlin public fun <K, V> Map<out String, String>.toMutableMap(): MutableMap<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'!' @ [50:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isWindows' @ [50:21] ==> public const final val isWindows: Boolean defined in com.jediterm.terminal.ui.UIUtil[JavaPropertyDescriptor]

'environment' @ [51:13] ==> val environment: MutableMap<String, String> defined in net.corda.demobench.pty.R3Pty.run[LocalVariableDescriptor]

'environment' @ [53:13] ==> val environment: MutableMap<String, String> defined in net.corda.demobench.pty.R3Pty.run[LocalVariableDescriptor]

'createTtyConnector' @ [56:25] ==> private final fun createTtyConnector(command: Array<String>, environment: Map<String, String>, workingDir: String?): PtyProcessTtyConnector defined in net.corda.demobench.pty.R3Pty[SimpleFunctionDescriptorImpl]

'args' @ [56:44] ==> value-parameter args: Array<String> defined in net.corda.demobench.pty.R3Pty.run[ValueParameterDescriptorImpl]

'environment' @ [56:50] ==> val environment: MutableMap<String, String> defined in net.corda.demobench.pty.R3Pty.run[LocalVariableDescriptor]

'workingDir' @ [56:63] ==> value-parameter workingDir: String? defined in net.corda.demobench.pty.R3Pty.run[ValueParameterDescriptorImpl]

'executor' @ [58:9] ==> private final val executor: (ExecutorService..ExecutorService?) defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'submit' @ [58:18] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'connector' @ [59:29] ==> val connector: PtyProcessTtyConnector defined in net.corda.demobench.pty.R3Pty.run[LocalVariableDescriptor]

'waitFor' @ [59:39] ==> public open fun waitFor(): Int defined in net.corda.demobench.pty.PtyProcessTtyConnector[JavaMethodDescriptor]

'log' @ [60:13] ==> public final val log: Logger defined in net.corda.demobench.pty.R3Pty.Companion[PropertyDescriptorImpl]

'info' @ [60:17] ==> public abstract fun info(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'exitValue' @ [60:56] ==> val exitValue: Int defined in net.corda.demobench.pty.R3Pty.run.<anonymous>[LocalVariableDescriptor]

'invoke' @ [61:13] ==> public abstract operator fun invoke(p1: Int): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'exitValue' @ [61:20] ==> val exitValue: Int defined in net.corda.demobench.pty.R3Pty.run.<anonymous>[LocalVariableDescriptor]

'terminal' @ [64:9] ==> public final val terminal: JediTermWidget defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'createTerminalSession' @ [64:18] ==> public open fun createTerminalSession(p0: (TtyConnector..TtyConnector?)): (TerminalSession..TerminalSession?) defined in com.jediterm.terminal.ui.JediTermWidget[JavaMethodDescriptor]

'connector' @ [64:40] ==> val connector: PtyProcessTtyConnector defined in net.corda.demobench.pty.R3Pty.run[LocalVariableDescriptor]

'apply' @ [64:51] ==> @InlineOnly public inline fun <T> (TerminalSession..TerminalSession?).apply(block: (TerminalSession..TerminalSession?).() -> Unit): (TerminalSession..TerminalSession?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.jediterm.terminal.ui.TerminalSession..com.jediterm.terminal.ui.TerminalSession?)

'start' @ [64:59] ==> public abstract fun start(): Unit defined in com.jediterm.terminal.ui.TerminalSession[JavaMethodDescriptor]

'Suppress' @ [67:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Throws' @ [68:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InterruptedException' @ [68:13] ==> public constructor InterruptedException() defined in java.lang.InterruptedException[JavaClassConstructorDescriptor]

'terminal' @ [69:27] ==> public final val terminal: JediTermWidget defined in net.corda.demobench.pty.R3Pty[PropertyDescriptorImpl]

'ttyConnector' @ [69:36] ==> public final var JediTermWidget.ttyConnector: (TtyConnector..TtyConnector?)[MyPropertyDescriptor]

'waitFor' @ [69:50] ==> public abstract fun waitFor(): Int defined in com.jediterm.terminal.TtyConnector[JavaMethodDescriptor]

