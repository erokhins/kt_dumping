'loggerFor' @ [15:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeRPC

'SECONDS' @ [16:25] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'toMillis' @ [16:33] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'CordaRPCClient' @ [19:29] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'NetworkHostAndPort' @ [19:44] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'config' @ [19:76] ==> value-parameter config: NodeConfig defined in net.corda.demobench.rpc.NodeRPC.<init>[ValueParameterDescriptorImpl]

'rpcPort' @ [19:83] ==> public final val rpcPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'Timer' @ [21:25] ==> public constructor Timer() defined in java.util.Timer[JavaClassConstructorDescriptor]

'TimerTask' @ [24:34] ==> protected/*protected and package*/ constructor TimerTask() defined in java.util.TimerTask[JavaClassConstructorDescriptor]

'config' @ [27:32] ==> value-parameter config: NodeConfig defined in net.corda.demobench.rpc.NodeRPC.<init>[ValueParameterDescriptorImpl]

'users' @ [27:39] ==> public final val users: List<User> defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'elementAt' @ [27:45] ==> @InlineOnly public inline fun <T> List<User>.elementAt(index: Int): User defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'rpcClient' @ [28:38] ==> private final val rpcClient: CordaRPCClient defined in net.corda.demobench.rpc.NodeRPC[PropertyDescriptorImpl]

'start' @ [28:48] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'user' @ [28:54] ==> val user: User defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>.run[LocalVariableDescriptor]

'username' @ [28:59] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'user' @ [28:69] ==> val user: User defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>.run[LocalVariableDescriptor]

'password' @ [28:74] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'rpcConnection' @ [29:21] ==> private final var rpcConnection: CordaRPCConnection? defined in net.corda.demobench.rpc.NodeRPC[PropertyDescriptorImpl]

'connection' @ [29:37] ==> val connection: CordaRPCConnection defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>.run[LocalVariableDescriptor]

'connection' @ [30:31] ==> val connection: CordaRPCConnection defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>.run[LocalVariableDescriptor]

'proxy' @ [30:42] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'this' @ [33:21] ==> <this> defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'cancel' @ [33:26] ==> public open fun cancel(): Boolean defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>[JavaMethodDescriptor]

'invoke' @ [36:21] ==> public abstract operator fun invoke(p1: NodeConfig, p2: CordaRPCOps): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'config' @ [36:27] ==> value-parameter config: NodeConfig defined in net.corda.demobench.rpc.NodeRPC.<init>[ValueParameterDescriptorImpl]

'ops' @ [36:35] ==> val ops: CordaRPCOps defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>.run[LocalVariableDescriptor]

'timer' @ [39:21] ==> private final val timer: Timer defined in net.corda.demobench.rpc.NodeRPC[PropertyDescriptorImpl]

'schedule' @ [39:27] ==> public open fun schedule(p0: (TimerTask..TimerTask?), p1: Long, p2: Long): Unit defined in java.util.Timer[JavaMethodDescriptor]

'TimerTask' @ [39:45] ==> protected/*protected and package*/ constructor TimerTask() defined in java.util.TimerTask[JavaClassConstructorDescriptor]

'invoke' @ [41:29] ==> public abstract operator fun invoke(p1: CordaRPCOps): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'ops' @ [41:36] ==> val ops: CordaRPCOps defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>.run[LocalVariableDescriptor]

'oneSecond' @ [43:27] ==> public final val oneSecond: Long defined in net.corda.demobench.rpc.NodeRPC.Companion[PropertyDescriptorImpl]

'log' @ [45:21] ==> public final val log: Logger defined in net.corda.demobench.rpc.NodeRPC.Companion[PropertyDescriptorImpl]

'warn' @ [45:25] ==> public abstract fun warn(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'config' @ [45:69] ==> value-parameter config: NodeConfig defined in net.corda.demobench.rpc.NodeRPC.<init>[ValueParameterDescriptorImpl]

'legalName' @ [45:76] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'e' @ [45:87] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.rpc.NodeRPC.<init>.<no name provided>.run[LocalVariableDescriptor]

'message' @ [45:89] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'timer' @ [51:9] ==> private final val timer: Timer defined in net.corda.demobench.rpc.NodeRPC[PropertyDescriptorImpl]

'schedule' @ [51:15] ==> public open fun schedule(p0: (TimerTask..TimerTask?), p1: Long, p2: Long): Unit defined in java.util.Timer[JavaMethodDescriptor]

'setupTask' @ [51:24] ==> val setupTask: <no name provided> defined in net.corda.demobench.rpc.NodeRPC.<init>[LocalVariableDescriptor]

'*' @ [51:35] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'oneSecond' @ [51:39] ==> public final val oneSecond: Long defined in net.corda.demobench.rpc.NodeRPC.Companion[PropertyDescriptorImpl]

'oneSecond' @ [51:50] ==> public final val oneSecond: Long defined in net.corda.demobench.rpc.NodeRPC.Companion[PropertyDescriptorImpl]

'timer' @ [55:9] ==> private final val timer: Timer defined in net.corda.demobench.rpc.NodeRPC[PropertyDescriptorImpl]

'cancel' @ [55:15] ==> public open fun cancel(): Unit defined in java.util.Timer[JavaMethodDescriptor]

'rpcConnection' @ [57:13] ==> private final var rpcConnection: CordaRPCConnection? defined in net.corda.demobench.rpc.NodeRPC[PropertyDescriptorImpl]

'forceClose' @ [57:28] ==> public open fun forceClose(): Unit defined in net.corda.client.rpc.CordaRPCConnection[DeserializedSimpleFunctionDescriptor]

'log' @ [59:13] ==> public final val log: Logger defined in net.corda.demobench.rpc.NodeRPC.Companion[PropertyDescriptorImpl]

'error' @ [59:17] ==> public abstract fun error(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [59:69] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.rpc.NodeRPC.close[LocalVariableDescriptor]

'message' @ [59:71] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

