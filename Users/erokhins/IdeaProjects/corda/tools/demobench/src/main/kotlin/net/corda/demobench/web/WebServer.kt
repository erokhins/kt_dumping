'loggerFor' @ [21:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> WebServer

'newSingleThreadExecutor' @ [24:38] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'Throws' @ [27:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [27:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'config' @ [29:23] ==> value-parameter config: NodeConfig defined in net.corda.demobench.web.WebServer.open[ValueParameterDescriptorImpl]

'nodeDir' @ [29:30] ==> public final val nodeDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'toFile' @ [29:38] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'!' @ [31:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nodeDir' @ [31:14] ==> val nodeDir: (File..File?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'isDirectory' @ [31:22] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'log' @ [32:13] ==> public final val log: Logger defined in net.corda.demobench.web.WebServer.Companion[PropertyDescriptorImpl]

'warn' @ [32:17] ==> public abstract fun warn(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'nodeDir' @ [32:64] ==> val nodeDir: (File..File?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'absolutePath' @ [32:72] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'openFuture' @ [33:20] ==> public fun <V> openFuture(): OpenFuture<URI> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> URI

'webServerController' @ [37:21] ==> private final val webServerController: WebServerController defined in net.corda.demobench.web.WebServer[PropertyDescriptorImpl]

'process' @ [37:41] ==> internal final fun process(): ProcessBuilder defined in net.corda.demobench.web.WebServerController[SimpleFunctionDescriptorImpl]

'directory' @ [38:22] ==> public open fun directory(p0: (File..File?)): (ProcessBuilder..ProcessBuilder?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

'nodeDir' @ [38:32] ==> val nodeDir: (File..File?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'start' @ [39:22] ==> public open fun start(): (Process..Process?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

'process' @ [40:13] ==> private final var process: Process? defined in net.corda.demobench.web.WebServer[PropertyDescriptorImpl]

'p' @ [40:23] ==> val p: (Process..Process?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'log' @ [42:13] ==> public final val log: Logger defined in net.corda.demobench.web.WebServer.Companion[PropertyDescriptorImpl]

'info' @ [42:17] ==> public abstract fun info(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [42:54] ==> value-parameter config: NodeConfig defined in net.corda.demobench.web.WebServer.open[ValueParameterDescriptorImpl]

'legalName' @ [42:61] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'safeClose' @ [45:13] ==> private final fun safeClose(c: AutoCloseable): Unit defined in net.corda.demobench.web.WebServer[SimpleFunctionDescriptorImpl]

'p' @ [45:23] ==> val p: (Process..Process?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'outputStream' @ [45:25] ==> public final val Process.outputStream: (OutputStream..OutputStream?)[MyPropertyDescriptor]

'safeClose' @ [46:13] ==> private final fun safeClose(c: AutoCloseable): Unit defined in net.corda.demobench.web.WebServer[SimpleFunctionDescriptorImpl]

'p' @ [46:23] ==> val p: (Process..Process?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'inputStream' @ [46:25] ==> public final val Process.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'executor' @ [48:13] ==> private final val executor: (ExecutorService..ExecutorService?) defined in net.corda.demobench.web.WebServer[PropertyDescriptorImpl]

'submit' @ [48:22] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'p' @ [49:33] ==> val p: (Process..Process?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'waitFor' @ [49:35] ==> public abstract fun waitFor(): Int defined in java.lang.Process[JavaMethodDescriptor]

'p' @ [50:30] ==> val p: (Process..Process?) defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'readErrorLines' @ [50:32] ==> public fun Process.readErrorLines(): List<String> defined in net.corda.demobench[SimpleFunctionDescriptorImpl]

'process' @ [51:17] ==> private final var process: Process? defined in net.corda.demobench.web.WebServer[PropertyDescriptorImpl]

'if (errors.isEmpty()) {
                    log.info("Web Server for '{}' has exited (value={})", config.legalName, exitValue)
                } else {
                    log.error("Web Server for '{}' has exited (value={}, {})", config.legalName, exitValue, errors)
                }' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'errors' @ [53:21] ==> val errors: List<String> defined in net.corda.demobench.web.WebServer.open.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [53:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [54:21] ==> public final val log: Logger defined in net.corda.demobench.web.WebServer.Companion[PropertyDescriptorImpl]

'info' @ [54:25] ==> public abstract fun info(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [54:75] ==> value-parameter config: NodeConfig defined in net.corda.demobench.web.WebServer.open[ValueParameterDescriptorImpl]

'legalName' @ [54:82] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'exitValue' @ [54:93] ==> val exitValue: Int defined in net.corda.demobench.web.WebServer.open.<anonymous>[LocalVariableDescriptor]

'log' @ [56:21] ==> public final val log: Logger defined in net.corda.demobench.web.WebServer.Companion[PropertyDescriptorImpl]

'error' @ [56:25] ==> public abstract fun error(p0: (String..String?), vararg p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [56:80] ==> value-parameter config: NodeConfig defined in net.corda.demobench.web.WebServer.open[ValueParameterDescriptorImpl]

'legalName' @ [56:87] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'exitValue' @ [56:98] ==> val exitValue: Int defined in net.corda.demobench.web.WebServer.open.<anonymous>[LocalVariableDescriptor]

'errors' @ [56:109] ==> val errors: List<String> defined in net.corda.demobench.web.WebServer.open.<anonymous>[LocalVariableDescriptor]

'openFuture' @ [60:26] ==> public fun <V> openFuture(): OpenFuture<URI> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> URI

'thread' @ [61:13] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'future' @ [62:17] ==> val future: OpenFuture<URI> defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'capture' @ [62:24] ==> public open fun capture(block: () -> URI): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'log' @ [63:21] ==> public final val log: Logger defined in net.corda.demobench.web.WebServer.Companion[PropertyDescriptorImpl]

'info' @ [63:25] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [63:60] ==> value-parameter config: NodeConfig defined in net.corda.demobench.web.WebServer.open[ValueParameterDescriptorImpl]

'legalName' @ [63:67] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'waitForStart' @ [64:21] ==> private final fun waitForStart(port: Int): URI defined in net.corda.demobench.web.WebServer[SimpleFunctionDescriptorImpl]

'config' @ [64:34] ==> value-parameter config: NodeConfig defined in net.corda.demobench.web.WebServer.open[ValueParameterDescriptorImpl]

'webPort' @ [64:41] ==> public final val webPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'future' @ [67:20] ==> val future: OpenFuture<URI> defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'log' @ [69:13] ==> public final val log: Logger defined in net.corda.demobench.web.WebServer.Companion[PropertyDescriptorImpl]

'error' @ [69:17] ==> public abstract fun error(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [69:67] ==> value-parameter config: NodeConfig defined in net.corda.demobench.web.WebServer.open[ValueParameterDescriptorImpl]

'legalName' @ [69:74] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'e' @ [69:85] ==> val e: IOException defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'message' @ [69:87] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'e' @ [70:19] ==> val e: IOException defined in net.corda.demobench.web.WebServer.open[LocalVariableDescriptor]

'executor' @ [75:9] ==> private final val executor: (ExecutorService..ExecutorService?) defined in net.corda.demobench.web.WebServer[PropertyDescriptorImpl]

'shutdown' @ [75:18] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'process' @ [76:9] ==> private final var process: Process? defined in net.corda.demobench.web.WebServer[PropertyDescriptorImpl]

'destroy' @ [76:18] ==> public abstract fun destroy(): Unit defined in java.lang.Process[JavaMethodDescriptor]

'c' @ [81:13] ==> value-parameter c: AutoCloseable defined in net.corda.demobench.web.WebServer.safeClose[ValueParameterDescriptorImpl]

'close' @ [81:15] ==> public abstract fun close(): Unit defined in java.lang.AutoCloseable[JavaMethodDescriptor]

'log' @ [83:13] ==> public final val log: Logger defined in net.corda.demobench.web.WebServer.Companion[PropertyDescriptorImpl]

'error' @ [83:17] ==> public abstract fun error(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [83:55] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.web.WebServer.safeClose[LocalVariableDescriptor]

'message' @ [83:57] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'URI' @ [88:19] ==> public constructor URI(p0: (String..String?)) defined in java.net.URI[JavaClassConstructorDescriptor]

'port' @ [88:42] ==> value-parameter port: Int defined in net.corda.demobench.web.WebServer.waitForStart[ValueParameterDescriptorImpl]

'create' @ [89:39] ==> public open fun create(p0: Double): (RateLimiter..RateLimiter?) defined in com.google.common.util.concurrent.RateLimiter[JavaMethodDescriptor]

'now' @ [90:29] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'minutes' @ [91:25] ==> public val Int.minutes: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'<' @ [92:16] ==> public open fun compareTo(other: (Duration..Duration?)): Int defined in java.time.Duration[JavaMethodDescriptor]

'start' @ [92:17] ==> val start: (Instant..Instant?) defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'now' @ [92:37] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'timeout' @ [92:46] ==> val timeout: Duration defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'rateLimiter' @ [94:17] ==> val rateLimiter: (RateLimiter..RateLimiter?) defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'acquire' @ [94:29] ==> @CanIgnoreReturnValue public open fun acquire(): Double defined in com.google.common.util.concurrent.RateLimiter[JavaMethodDescriptor]

'url' @ [95:28] ==> val url: URI defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'toURL' @ [95:32] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'openConnection' @ [95:40] ==> public open fun openConnection(): (URLConnection..URLConnection?) defined in java.net.URL[JavaMethodDescriptor]

'conn' @ [96:17] ==> val conn: HttpURLConnection defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'connectTimeout' @ [96:22] ==> public final var HttpURLConnection.connectTimeout: Int[MyPropertyDescriptor]

'conn' @ [97:17] ==> val conn: HttpURLConnection defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'requestMethod' @ [97:22] ==> public final var HttpURLConnection.requestMethod: (String..String?)[MyPropertyDescriptor]

'conn' @ [98:17] ==> val conn: HttpURLConnection defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'connect' @ [98:22] ==> public abstract fun connect(): Unit defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'conn' @ [99:17] ==> val conn: HttpURLConnection defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'disconnect' @ [99:22] ==> public abstract fun disconnect(): Unit defined in java.net.HttpURLConnection[JavaMethodDescriptor]

'url' @ [100:24] ==> val url: URI defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'TimeoutException' @ [104:15] ==> public constructor TimeoutException(p0: (String..String?)) defined in java.util.concurrent.TimeoutException[JavaClassConstructorDescriptor]

'timeout' @ [104:67] ==> val timeout: Duration defined in net.corda.demobench.web.WebServer.waitForStart[LocalVariableDescriptor]

'seconds' @ [104:75] ==> public final val Duration.seconds: Long[MyPropertyDescriptor]

