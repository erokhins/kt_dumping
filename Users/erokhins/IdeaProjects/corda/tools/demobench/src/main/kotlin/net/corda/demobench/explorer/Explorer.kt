'loggerFor' @ [19:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Explorer

'newSingleThreadExecutor' @ [22:38] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'Throws' @ [25:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [25:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'config' @ [27:27] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'explorerDir' @ [27:34] ==> public final val explorerDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'toFile' @ [27:46] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'!' @ [29:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'explorerDir' @ [29:14] ==> val explorerDir: (File..File?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'forceDirectory' @ [29:26] ==> public fun File.forceDirectory(): Boolean defined in net.corda.demobench.model in file NodeConfig.kt[SimpleFunctionDescriptorImpl]

'log' @ [30:13] ==> public final val log: Logger defined in net.corda.demobench.explorer.Explorer.Companion[PropertyDescriptorImpl]

'warn' @ [30:17] ==> public abstract fun warn(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'explorerDir' @ [30:65] ==> val explorerDir: (File..File?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'absolutePath' @ [30:77] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'invoke' @ [31:13] ==> public abstract operator fun invoke(p1: NodeConfig): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'config' @ [31:20] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'installApps' @ [36:13] ==> private final fun installApps(config: NodeConfig): Unit defined in net.corda.demobench.explorer.Explorer[SimpleFunctionDescriptorImpl]

'config' @ [36:25] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'config' @ [38:24] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'users' @ [38:31] ==> public final val users: List<User> defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'elementAt' @ [38:37] ==> @InlineOnly public inline fun <T> List<User>.elementAt(index: Int): User defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'explorerController' @ [39:21] ==> private final val explorerController: ExplorerController defined in net.corda.demobench.explorer.Explorer[PropertyDescriptorImpl]

'process' @ [39:40] ==> internal final fun process(vararg args: String): ProcessBuilder defined in net.corda.demobench.explorer.ExplorerController[SimpleFunctionDescriptorImpl]

'config' @ [41:31] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'rpcPort' @ [41:38] ==> public final val rpcPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'user' @ [42:35] ==> val user: User defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'username' @ [42:40] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'user' @ [43:35] ==> val user: User defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'password' @ [43:40] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'directory' @ [44:22] ==> public open fun directory(p0: (File..File?)): (ProcessBuilder..ProcessBuilder?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

'explorerDir' @ [44:32] ==> val explorerDir: (File..File?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'start' @ [45:22] ==> public open fun start(): (Process..Process?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

'process' @ [46:13] ==> private final var process: Process? defined in net.corda.demobench.explorer.Explorer[PropertyDescriptorImpl]

'p' @ [46:23] ==> val p: (Process..Process?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'log' @ [48:13] ==> public final val log: Logger defined in net.corda.demobench.explorer.Explorer.Companion[PropertyDescriptorImpl]

'info' @ [48:17] ==> public abstract fun info(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [48:57] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'legalName' @ [48:64] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'safeClose' @ [51:13] ==> private final fun safeClose(c: AutoCloseable): Unit defined in net.corda.demobench.explorer.Explorer[SimpleFunctionDescriptorImpl]

'p' @ [51:23] ==> val p: (Process..Process?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'outputStream' @ [51:25] ==> public final val Process.outputStream: (OutputStream..OutputStream?)[MyPropertyDescriptor]

'safeClose' @ [52:13] ==> private final fun safeClose(c: AutoCloseable): Unit defined in net.corda.demobench.explorer.Explorer[SimpleFunctionDescriptorImpl]

'p' @ [52:23] ==> val p: (Process..Process?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'inputStream' @ [52:25] ==> public final val Process.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'executor' @ [54:13] ==> private final val executor: (ExecutorService..ExecutorService?) defined in net.corda.demobench.explorer.Explorer[PropertyDescriptorImpl]

'submit' @ [54:22] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'p' @ [55:33] ==> val p: (Process..Process?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'waitFor' @ [55:35] ==> public abstract fun waitFor(): Int defined in java.lang.Process[JavaMethodDescriptor]

'p' @ [56:30] ==> val p: (Process..Process?) defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'readErrorLines' @ [56:32] ==> public fun Process.readErrorLines(): List<String> defined in net.corda.demobench[SimpleFunctionDescriptorImpl]

'process' @ [57:17] ==> private final var process: Process? defined in net.corda.demobench.explorer.Explorer[PropertyDescriptorImpl]

'if (errors.isEmpty()) {
                    log.info("Node Explorer for '{}' has exited (value={})", config.legalName, exitValue)
                } else {
                    log.error("Node Explorer for '{}' has exited (value={}, {})", config.legalName, exitValue, errors)
                }' @ [59:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'errors' @ [59:21] ==> val errors: List<String> defined in net.corda.demobench.explorer.Explorer.open.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [59:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [60:21] ==> public final val log: Logger defined in net.corda.demobench.explorer.Explorer.Companion[PropertyDescriptorImpl]

'info' @ [60:25] ==> public abstract fun info(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [60:78] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'legalName' @ [60:85] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'exitValue' @ [60:96] ==> val exitValue: Int defined in net.corda.demobench.explorer.Explorer.open.<anonymous>[LocalVariableDescriptor]

'log' @ [62:21] ==> public final val log: Logger defined in net.corda.demobench.explorer.Explorer.Companion[PropertyDescriptorImpl]

'error' @ [62:25] ==> public abstract fun error(p0: (String..String?), vararg p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [62:83] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'legalName' @ [62:90] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'exitValue' @ [62:101] ==> val exitValue: Int defined in net.corda.demobench.explorer.Explorer.open.<anonymous>[LocalVariableDescriptor]

'errors' @ [62:112] ==> val errors: List<String> defined in net.corda.demobench.explorer.Explorer.open.<anonymous>[LocalVariableDescriptor]

'invoke' @ [65:17] ==> public abstract operator fun invoke(p1: NodeConfig): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'config' @ [65:24] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'log' @ [68:13] ==> public final val log: Logger defined in net.corda.demobench.explorer.Explorer.Companion[PropertyDescriptorImpl]

'error' @ [68:17] ==> public abstract fun error(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [68:70] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'legalName' @ [68:77] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'e' @ [68:88] ==> val e: IOException defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'message' @ [68:90] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'invoke' @ [69:13] ==> public abstract operator fun invoke(p1: NodeConfig): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'config' @ [69:20] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.open[ValueParameterDescriptorImpl]

'e' @ [70:19] ==> val e: IOException defined in net.corda.demobench.explorer.Explorer.open[LocalVariableDescriptor]

'config' @ [83:26] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.installApps[ValueParameterDescriptorImpl]

'explorerDir' @ [83:33] ==> public final val explorerDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'pluginsDir' @ [84:9] ==> val pluginsDir: Path defined in net.corda.demobench.explorer.Explorer.installApps[LocalVariableDescriptor]

'createDirectories' @ [84:20] ==> public fun Path.createDirectories(vararg attrs: FileAttribute<*>): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'config' @ [85:9] ==> value-parameter config: NodeConfig defined in net.corda.demobench.explorer.Explorer.installApps[ValueParameterDescriptorImpl]

'pluginDir' @ [85:16] ==> public open val pluginDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'list' @ [85:26] ==> public inline fun <R> Path.list(block: (Stream<Path>) -> Unit): Unit defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'it' @ [86:13] ==> value-parameter it: Stream<Path> defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>[ValueParameterDescriptorImpl]

'forEachOrdered' @ [86:16] ==> public final fun forEachOrdered(p0: (((Path..Path?)) -> Unit..(((Path..Path?)) -> Unit)?)): Unit defined in java.util.stream.Stream[MyFunctionDescriptor]

'pluginsDir' @ [87:32] ==> val pluginsDir: Path defined in net.corda.demobench.explorer.Explorer.installApps[LocalVariableDescriptor]

'path' @ [87:45] ==> value-parameter path: (Path..Path?) defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [87:50] ==> public final val Path.fileName: (Path..Path?)[MyPropertyDescriptor]

'toString' @ [87:59] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'createSymbolicLink' @ [90:27] ==> public open fun createSymbolicLink(p0: (Path..Path?), p1: (Path..Path?), vararg p2: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'destPath' @ [90:46] ==> val destPath: Path defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[LocalVariableDescriptor]

'path' @ [90:56] ==> value-parameter path: (Path..Path?) defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'copy' @ [93:27] ==> public open fun copy(p0: (Path..Path?), p1: (Path..Path?), vararg p2: (CopyOption..CopyOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'path' @ [93:32] ==> value-parameter path: (Path..Path?) defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'destPath' @ [93:38] ==> val destPath: Path defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[LocalVariableDescriptor]

'REPLACE_EXISTING' @ [93:48] ==> enum entry REPLACE_EXISTING defined in java.nio.file.StandardCopyOption[FakeCallableDescriptorForObject]

'log' @ [98:21] ==> public final val log: Logger defined in net.corda.demobench.explorer.Explorer.Companion[PropertyDescriptorImpl]

'warn' @ [98:25] ==> public abstract fun warn(p0: (String..String?), vararg p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'destPath' @ [98:76] ==> val destPath: Path defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[LocalVariableDescriptor]

'path' @ [98:86] ==> value-parameter path: (Path..Path?) defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [98:92] ==> val e: IOException defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [98:94] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'copy' @ [99:27] ==> public open fun copy(p0: (Path..Path?), p1: (Path..Path?), vararg p2: (CopyOption..CopyOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'path' @ [99:32] ==> value-parameter path: (Path..Path?) defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'destPath' @ [99:38] ==> val destPath: Path defined in net.corda.demobench.explorer.Explorer.installApps.<anonymous>.<anonymous>[LocalVariableDescriptor]

'REPLACE_EXISTING' @ [99:48] ==> enum entry REPLACE_EXISTING defined in java.nio.file.StandardCopyOption[FakeCallableDescriptorForObject]

'executor' @ [106:9] ==> private final val executor: (ExecutorService..ExecutorService?) defined in net.corda.demobench.explorer.Explorer[PropertyDescriptorImpl]

'shutdown' @ [106:18] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'process' @ [107:9] ==> private final var process: Process? defined in net.corda.demobench.explorer.Explorer[PropertyDescriptorImpl]

'destroy' @ [107:18] ==> public abstract fun destroy(): Unit defined in java.lang.Process[JavaMethodDescriptor]

'c' @ [112:13] ==> value-parameter c: AutoCloseable defined in net.corda.demobench.explorer.Explorer.safeClose[ValueParameterDescriptorImpl]

'close' @ [112:15] ==> public abstract fun close(): Unit defined in java.lang.AutoCloseable[JavaMethodDescriptor]

'log' @ [114:13] ==> public final val log: Logger defined in net.corda.demobench.explorer.Explorer.Companion[PropertyDescriptorImpl]

'error' @ [114:17] ==> public abstract fun error(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [114:55] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.explorer.Explorer.safeClose[LocalVariableDescriptor]

'message' @ [114:57] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'Controller' @ [120:28] ==> public constructor Controller() defined in tornadofx.Controller[DeserializedClassConstructorDescriptor]

'inject' @ [121:24] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, JVMConfig> where T : Injectable defined in net.corda.demobench.explorer.ExplorerController[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> JVMConfig

'jvm' @ [122:32] ==> private final val jvm: JVMConfig defined in net.corda.demobench.explorer.ExplorerController[PropertyDescriptorImpl]

'applicationDir' @ [122:36] ==> public final val applicationDir: Path defined in net.corda.demobench.model.JVMConfig[PropertyDescriptorImpl]

'resolve' @ [122:51] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'resolve' @ [122:71] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'log' @ [125:9] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.explorer.ExplorerController[DeserializedPropertyDescriptor]

'info' @ [125:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'explorerPath' @ [125:34] ==> private final val explorerPath: (Path..Path?) defined in net.corda.demobench.explorer.ExplorerController[PropertyDescriptorImpl]

'jvm' @ [128:49] ==> private final val jvm: JVMConfig defined in net.corda.demobench.explorer.ExplorerController[PropertyDescriptorImpl]

'processFor' @ [128:53] ==> public final fun processFor(jarPath: Path, vararg args: String): ProcessBuilder defined in net.corda.demobench.model.JVMConfig[SimpleFunctionDescriptorImpl]

'explorerPath' @ [128:64] ==> private final val explorerPath: (Path..Path?) defined in net.corda.demobench.explorer.ExplorerController[PropertyDescriptorImpl]

'args' @ [128:79] ==> value-parameter vararg args: String defined in net.corda.demobench.explorer.ExplorerController.process[ValueParameterDescriptorImpl]

'Explorer' @ [130:22] ==> internal constructor Explorer(explorerController: ExplorerController) defined in net.corda.demobench.explorer.Explorer[ClassConstructorDescriptorImpl]

'this' @ [130:31] ==> <this> defined in net.corda.demobench.explorer.ExplorerController[LazyClassReceiverParameterDescriptor]

