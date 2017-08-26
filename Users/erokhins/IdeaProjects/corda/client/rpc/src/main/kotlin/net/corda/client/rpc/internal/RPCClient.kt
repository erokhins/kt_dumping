'-' @ [63:42] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [64:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'RPCClientConfiguration' @ [65:23] ==> public constructor RPCClientConfiguration(minimumServerProtocolVersion: Int, trackRpcCallSites: Boolean, reapInterval: Duration, observationExecutorPoolSize: Int, producerPoolBound: Int, cacheConcurrencyLevel: Int, connectionRetryInterval: Duration, connectionRetryIntervalMultiplier: Double, connectionMaxRetryInterval: Duration, maxReconnectAttempts: Int, maxFileSize: Int) defined in net.corda.client.rpc.internal.RPCClientConfiguration[ClassConstructorDescriptorImpl]

'seconds' @ [68:34] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'seconds' @ [72:45] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'minutes' @ [74:48] ==> public val Int.minutes: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'unlimitedReconnectAttempts' @ [75:40] ==> public final val unlimitedReconnectAttempts: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration.Companion[PropertyDescriptorImpl]

'RPCClientConfiguration' @ [90:56] ==> public companion object defined in net.corda.client.rpc.internal.RPCClientConfiguration[FakeCallableDescriptorForObject]

'default' @ [90:79] ==> @JvmStatic public final val default: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientConfiguration.Companion[PropertyDescriptorImpl]

'SerializationDefaults' @ [91:58] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'RPC_CLIENT_CONTEXT' @ [91:80] ==> public final var RPC_CLIENT_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'RPCClientConfiguration' @ [96:53] ==> public companion object defined in net.corda.client.rpc.internal.RPCClientConfiguration[FakeCallableDescriptorForObject]

'default' @ [96:76] ==> @JvmStatic public final val default: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientConfiguration.Companion[PropertyDescriptorImpl]

'SerializationDefaults' @ [97:58] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'RPC_CLIENT_CONTEXT' @ [97:80] ==> public final var RPC_CLIENT_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'this' @ [98:9] ==> public constructor RPCClient<I : RPCOps>(transport: TransportConfiguration, rpcConfiguration: RPCClientConfiguration = ..., serializationContext: SerializationContext = ...) defined in net.corda.client.rpc.internal.RPCClient[ClassConstructorDescriptorImpl]
Inferred types:
    <I : RPCOps> -> I

'tcpTransport' @ [98:14] ==> public final fun tcpTransport(direction: ConnectionDirection, hostAndPort: NetworkHostAndPort, config: SSLConfiguration?, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.nodeapi.ArtemisTcpTransport.Companion[FunctionImportedFromObject]

'Outbound' @ [98:47] ==> public constructor Outbound(expectedCommonName: X500Name? = ..., connectorFactoryClassName: String = ...) defined in net.corda.nodeapi.ConnectionDirection.Outbound[DeserializedClassConstructorDescriptor]

'hostAndPort' @ [98:59] ==> value-parameter hostAndPort: NetworkHostAndPort defined in net.corda.client.rpc.internal.RPCClient.<init>[ValueParameterDescriptorImpl]

'sslConfiguration' @ [98:72] ==> value-parameter sslConfiguration: SSLConfiguration? = ... defined in net.corda.client.rpc.internal.RPCClient.<init>[ValueParameterDescriptorImpl]

'configuration' @ [98:91] ==> value-parameter configuration: RPCClientConfiguration = ... defined in net.corda.client.rpc.internal.RPCClient.<init>[ValueParameterDescriptorImpl]

'serializationContext' @ [98:106] ==> value-parameter serializationContext: SerializationContext = ... defined in net.corda.client.rpc.internal.RPCClient.<init>[ValueParameterDescriptorImpl]

'loggerFor' @ [101:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> RPCClient<*>

'log' @ [157:16] ==> private final val log: Logger defined in net.corda.client.rpc.internal.RPCClient.Companion[PropertyDescriptorImpl]

'logElapsedTime' @ [157:20] ==> public fun <T> Logger.logElapsedTime(label: String, body: () -> <no name provided><I>): <no name provided><I> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided><I>

'SimpleString' @ [158:33] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'RPCApi' @ [158:49] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_QUEUE_NAME_PREFIX' @ [158:56] ==> public final val RPC_CLIENT_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'username' @ [158:87] ==> value-parameter username: String defined in net.corda.client.rpc.internal.RPCClient.start[ValueParameterDescriptorImpl]

'random63BitValue' @ [158:98] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'createServerLocatorWithoutHA' @ [160:48] ==> public open fun createServerLocatorWithoutHA(vararg p0: (TransportConfiguration..TransportConfiguration?)): (ServerLocator..ServerLocator?) defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaMethodDescriptor]

'transport' @ [160:77] ==> public final val transport: TransportConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'apply' @ [160:88] ==> @InlineOnly public inline fun <T> (ServerLocator..ServerLocator?).apply(block: (ServerLocator..ServerLocator?).() -> Unit): (ServerLocator..ServerLocator?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.apache.activemq.artemis.api.core.client.ServerLocator..org.apache.activemq.artemis.api.core.client.ServerLocator?)

'retryInterval' @ [161:17] ==> public final var ServerLocator.retryInterval: Long[MyPropertyDescriptor]

'rpcConfiguration' @ [161:33] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'connectionRetryInterval' @ [161:50] ==> public final val connectionRetryInterval: Duration defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'toMillis' @ [161:74] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'retryIntervalMultiplier' @ [162:17] ==> public final var ServerLocator.retryIntervalMultiplier: Double[MyPropertyDescriptor]

'rpcConfiguration' @ [162:43] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'connectionRetryIntervalMultiplier' @ [162:60] ==> public final val connectionRetryIntervalMultiplier: Double defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'maxRetryInterval' @ [163:17] ==> public final var ServerLocator.maxRetryInterval: Long[MyPropertyDescriptor]

'rpcConfiguration' @ [163:36] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'connectionMaxRetryInterval' @ [163:53] ==> public final val connectionMaxRetryInterval: Duration defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'toMillis' @ [163:80] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'reconnectAttempts' @ [164:17] ==> public final var ServerLocator.reconnectAttempts: Int[MyPropertyDescriptor]

'rpcConfiguration' @ [164:37] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'maxReconnectAttempts' @ [164:54] ==> public final val maxReconnectAttempts: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'minLargeMessageSize' @ [165:17] ==> public final var ServerLocator.minLargeMessageSize: Int[MyPropertyDescriptor]

'rpcConfiguration' @ [165:39] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'maxFileSize' @ [165:56] ==> public final val maxFileSize: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'RPCClientProxyHandler' @ [168:32] ==> public constructor RPCClientProxyHandler(rpcConfiguration: RPCClientConfiguration, rpcUsername: String, rpcPassword: String, serverLocator: ServerLocator, clientAddress: SimpleString, rpcOpsClass: Class<out RPCOps>, serializationContext: SerializationContext) defined in net.corda.client.rpc.internal.RPCClientProxyHandler[ClassConstructorDescriptorImpl]

'rpcConfiguration' @ [168:54] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'username' @ [168:72] ==> value-parameter username: String defined in net.corda.client.rpc.internal.RPCClient.start[ValueParameterDescriptorImpl]

'password' @ [168:82] ==> value-parameter password: String defined in net.corda.client.rpc.internal.RPCClient.start[ValueParameterDescriptorImpl]

'serverLocator' @ [168:92] ==> val serverLocator: (ServerLocator..ServerLocator?) defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'clientAddress' @ [168:107] ==> val clientAddress: SimpleString defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'rpcOpsClass' @ [168:122] ==> value-parameter rpcOpsClass: Class<I> defined in net.corda.client.rpc.internal.RPCClient.start[ValueParameterDescriptorImpl]

'serializationContext' @ [168:135] ==> public final val serializationContext: SerializationContext defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'proxyHandler' @ [170:17] ==> val proxyHandler: RPCClientProxyHandler defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'start' @ [170:30] ==> public final fun start(): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'Suppress' @ [172:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'newProxyInstance' @ [173:33] ==> @CallerSensitive public open fun newProxyInstance(p0: (ClassLoader..ClassLoader?), p1: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?), p2: (InvocationHandler..InvocationHandler?)): (Any..Any?) defined in java.lang.reflect.Proxy[JavaMethodDescriptor]

'rpcOpsClass' @ [173:50] ==> value-parameter rpcOpsClass: Class<I> defined in net.corda.client.rpc.internal.RPCClient.start[ValueParameterDescriptorImpl]

'classLoader' @ [173:62] ==> public final val <T : (Any..Any?)> Class<I>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> I

'arrayOf' @ [173:75] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Class<I>): Array<Class<I>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Class<I>

'rpcOpsClass' @ [173:83] ==> value-parameter rpcOpsClass: Class<I> defined in net.corda.client.rpc.internal.RPCClient.start[ValueParameterDescriptorImpl]

'proxyHandler' @ [173:97] ==> val proxyHandler: RPCClientProxyHandler defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'ops' @ [175:45] ==> val ops: I defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'protocolVersion' @ [175:49] ==> public abstract val protocolVersion: Int defined in net.corda.core.messaging.RPCOps[DeserializedPropertyDescriptor]

'serverProtocolVersion' @ [176:21] ==> val serverProtocolVersion: Int defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'rpcConfiguration' @ [176:45] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'minimumServerProtocolVersion' @ [176:62] ==> public final val minimumServerProtocolVersion: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'RPCException' @ [177:27] ==> public constructor RPCException(msg: String) defined in net.corda.nodeapi.RPCException[DeserializedClassConstructorDescriptor]

'+' @ [177:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'rpcConfiguration' @ [177:79] ==> public final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClient[PropertyDescriptorImpl]

'minimumServerProtocolVersion' @ [177:96] ==> public final val minimumServerProtocolVersion: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'serverProtocolVersion' @ [178:78] ==> val serverProtocolVersion: Int defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'proxyHandler' @ [180:17] ==> val proxyHandler: RPCClientProxyHandler defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'setServerProtocolVersion' @ [180:30] ==> internal final fun setServerProtocolVersion(version: Int): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'serverProtocolVersion' @ [180:55] ==> val serverProtocolVersion: Int defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'log' @ [182:17] ==> private final val log: Logger defined in net.corda.client.rpc.internal.RPCClient.Companion[PropertyDescriptorImpl]

'debug' @ [182:21] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'ops' @ [184:42] ==> val ops: I defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'serverProtocolVersion' @ [185:58] ==> val serverProtocolVersion: Int defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'if (notify) {
                            proxyHandler.notifyServerAndClose()
                        } else {
                            proxyHandler.forceClose()
                        }' @ [188:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'notify' @ [188:29] ==> value-parameter notify: Boolean defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>.<no name provided>.close[ValueParameterDescriptorImpl]

'proxyHandler' @ [189:29] ==> val proxyHandler: RPCClientProxyHandler defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'notifyServerAndClose' @ [189:42] ==> public final fun notifyServerAndClose(): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'proxyHandler' @ [191:29] ==> val proxyHandler: RPCClientProxyHandler defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'forceClose' @ [191:42] ==> public final fun forceClose(): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'serverLocator' @ [193:25] ==> val serverLocator: (ServerLocator..ServerLocator?) defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'close' @ [193:39] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'close' @ [197:25] ==> private final fun close(notify: Boolean): Unit defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'close' @ [201:25] ==> private final fun close(notify: Boolean): Unit defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'close' @ [205:25] ==> private final fun close(notify: Boolean): Unit defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'proxyHandler' @ [209:17] ==> val proxyHandler: RPCClientProxyHandler defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'notifyServerAndClose' @ [209:30] ==> public final fun notifyServerAndClose(): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'serverLocator' @ [210:17] ==> val serverLocator: (ServerLocator..ServerLocator?) defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

'close' @ [210:31] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'exception' @ [211:23] ==> val exception: Throwable defined in net.corda.client.rpc.internal.RPCClient.start.<anonymous>[LocalVariableDescriptor]

