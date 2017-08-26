'ThreadSafe' @ [91:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'ArtemisMessagingComponent' @ [96:65] ==> public constructor ArtemisMessagingComponent() defined in net.corda.nodeapi.ArtemisMessagingComponent[DeserializedClassConstructorDescriptor]

'loggerFor' @ [98:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ArtemisMessagingServer

'JvmStatic' @ [100:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ThreadBox' @ [110:25] ==> public constructor ThreadBox<out T>(content: ArtemisMessagingServer.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [110:35] ==> public constructor InnerState() defined in net.corda.node.services.messaging.ArtemisMessagingServer.InnerState[ClassConstructorDescriptorImpl]

'activeMQServer' @ [112:54] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'activeMQServerControl' @ [112:69] ==> public final val ActiveMQServer.activeMQServerControl: (ActiveMQServerControlImpl..ActiveMQServerControlImpl?)[MyPropertyDescriptor]

'config' @ [113:47] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'networkMapService' @ [113:54] ==> public abstract val networkMapService: NetworkMapInfo? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'let' @ [113:73] ==> @InlineOnly public inline fun <T, R> NetworkMapInfo.let(block: (NetworkMapInfo) -> OpenFuture<Unit>): OpenFuture<Unit> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkMapInfo
    <R> -> OpenFuture<Unit>

'openFuture' @ [113:79] ==> public fun <V> openFuture(): OpenFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'_networkMapConnectionFuture' @ [118:64] ==> private final val _networkMapConnectionFuture: OpenFuture<Unit>? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'config' @ [120:45] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'networkMapService' @ [120:52] ==> public abstract val networkMapService: NetworkMapInfo? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'config' @ [123:9] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'baseDirectory' @ [123:16] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'expectedOnDefaultFileSystem' @ [123:30] ==> public fun Path.expectedOnDefaultFileSystem(): Unit defined in net.corda.nodeapi[DeserializedSimpleFunctionDescriptor]

'Throws' @ [130:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [130:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'KeyStoreException' @ [130:33] ==> public constructor KeyStoreException() defined in java.security.KeyStoreException[JavaClassConstructorDescriptor]

'mutex' @ [131:19] ==> private final val mutex: ThreadBox<ArtemisMessagingServer.InnerState> defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'locked' @ [131:25] ==> public final inline fun <R> locked(body: ArtemisMessagingServer.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'!' @ [132:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'running' @ [132:14] ==> public final var running: Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer.InnerState[PropertyDescriptorImpl]

'configureAndStartServer' @ [133:13] ==> @Throws private final fun configureAndStartServer(): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'config' @ [135:13] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'networkMapService' @ [135:20] ==> public abstract val networkMapService: NetworkMapInfo? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'let' @ [135:39] ==> @InlineOnly public inline fun <T, R> NetworkMapInfo.let(block: (NetworkMapInfo) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkMapInfo
    <R> -> Unit

'deployBridge' @ [135:45] ==> private final fun deployBridge(address: ArtemisMessagingComponent.ArtemisPeerAddress, legalName: X500Name): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'NetworkMapAddress' @ [135:58] ==> public constructor NetworkMapAddress(hostAndPort: NetworkHostAndPort) defined in net.corda.nodeapi.ArtemisMessagingComponent.NetworkMapAddress[DeserializedClassConstructorDescriptor]

'it' @ [135:76] ==> value-parameter it: NetworkMapInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'address' @ [135:79] ==> public final val address: NetworkHostAndPort defined in net.corda.node.internal.NetworkMapInfo[PropertyDescriptorImpl]

'it' @ [135:89] ==> value-parameter it: NetworkMapInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'legalName' @ [135:92] ==> public final val legalName: X500Name defined in net.corda.node.internal.NetworkMapInfo[PropertyDescriptorImpl]

'networkChangeHandle' @ [136:13] ==> private final var networkChangeHandle: Subscription? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'networkMapCache' @ [136:35] ==> public final val networkMapCache: NetworkMapCache defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'changed' @ [136:51] ==> public abstract val changed: Observable<NetworkMapCache.MapChange> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'subscribe' @ [136:59] ==> public final fun subscribe(p0: (((NetworkMapCache.MapChange..NetworkMapCache.MapChange?)) -> Unit..(((NetworkMapCache.MapChange..NetworkMapCache.MapChange?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'updateBridgesOnNetworkChange' @ [136:71] ==> private final fun updateBridgesOnNetworkChange(change: NetworkMapCache.MapChange): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'it' @ [136:100] ==> value-parameter it: (NetworkMapCache.MapChange..NetworkMapCache.MapChange?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'running' @ [137:13] ==> public final var running: Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer.InnerState[PropertyDescriptorImpl]

'mutex' @ [141:18] ==> private final val mutex: ThreadBox<ArtemisMessagingServer.InnerState> defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'locked' @ [141:24] ==> public final inline fun <R> locked(body: ArtemisMessagingServer.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'networkChangeHandle' @ [142:9] ==> private final var networkChangeHandle: Subscription? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'unsubscribe' @ [142:30] ==> public abstract fun unsubscribe(): Unit defined in rx.Subscription[JavaMethodDescriptor]

'networkChangeHandle' @ [143:9] ==> private final var networkChangeHandle: Subscription? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'activeMQServer' @ [144:9] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'stop' @ [144:24] ==> public abstract fun stop(): Unit defined in org.apache.activemq.artemis.core.server.ActiveMQServer[JavaMethodDescriptor]

'running' @ [145:9] ==> public final var running: Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer.InnerState[PropertyDescriptorImpl]

'Throws' @ [150:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [150:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'KeyStoreException' @ [150:33] ==> public constructor KeyStoreException() defined in java.security.KeyStoreException[JavaClassConstructorDescriptor]

'createArtemisConfig' @ [152:29] ==> private final fun createArtemisConfig(): Configuration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'createArtemisSecurityManager' @ [153:31] ==> @Throws private final fun createArtemisSecurityManager(): ActiveMQJAASSecurityManager defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'activeMQServer' @ [154:9] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'ActiveMQServerImpl' @ [154:26] ==> public constructor ActiveMQServerImpl(p0: (Configuration..Configuration?), p1: (ActiveMQSecurityManager..ActiveMQSecurityManager?)) defined in org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl[JavaClassConstructorDescriptor]

'artemisConfig' @ [154:45] ==> val artemisConfig: Configuration defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAndStartServer[LocalVariableDescriptor]

'securityManager' @ [154:60] ==> val securityManager: ActiveMQJAASSecurityManager defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAndStartServer[LocalVariableDescriptor]

'apply' @ [154:77] ==> @InlineOnly public inline fun <T> ActiveMQServerImpl.apply(block: ActiveMQServerImpl.() -> Unit): ActiveMQServerImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ActiveMQServerImpl

'registerActivationFailureListener' @ [156:13] ==> public final fun registerActivationFailureListener(p0: (((Exception..Exception?)) -> Unit..(((Exception..Exception?)) -> Unit)?)): Unit defined in org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl[MyFunctionDescriptor]

'exception' @ [156:68] ==> value-parameter exception: (Exception..Exception?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAndStartServer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'registerPostQueueCreationCallback' @ [159:13] ==> public final fun registerPostQueueCreationCallback(p0: (((SimpleString..SimpleString?)) -> Unit..(((SimpleString..SimpleString?)) -> Unit)?)): Unit defined in org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl[MyFunctionDescriptor]

'deployBridgesFromNewQueue' @ [159:49] ==> private final fun deployBridgesFromNewQueue(queueName: String): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'it' @ [159:75] ==> value-parameter it: (SimpleString..SimpleString?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAndStartServer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [159:78] ==> public open fun toString(): String defined in org.apache.activemq.artemis.api.core.SimpleString[JavaMethodDescriptor]

'nodeRunsNetworkMapService' @ [160:17] ==> private final val nodeRunsNetworkMapService: Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'registerPostQueueCreationCallback' @ [160:44] ==> public final fun registerPostQueueCreationCallback(p0: (((SimpleString..SimpleString?)) -> Unit..(((SimpleString..SimpleString?)) -> Unit)?)): Unit defined in org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl[MyFunctionDescriptor]

'handleIpDetectionRequest' @ [160:80] ==> private final fun handleIpDetectionRequest(queueName: String): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'it' @ [160:105] ==> value-parameter it: (SimpleString..SimpleString?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAndStartServer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [160:108] ==> public open fun toString(): String defined in org.apache.activemq.artemis.api.core.SimpleString[JavaMethodDescriptor]

'registerPostQueueDeletionCallback' @ [161:13] ==> public final fun registerPostQueueDeletionCallback(p0: (((SimpleString..SimpleString?), (SimpleString..SimpleString?)) -> Unit..(((SimpleString..SimpleString?), (SimpleString..SimpleString?)) -> Unit)?)): Unit defined in org.apache.activemq.artemis.core.server.impl.ActiveMQServerImpl[MyFunctionDescriptor]

'log' @ [161:67] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'debug' @ [161:71] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'qName' @ [161:96] ==> value-parameter qName: (SimpleString..SimpleString?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAndStartServer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'address' @ [161:107] ==> value-parameter address: (SimpleString..SimpleString?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAndStartServer.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'activeMQServer' @ [163:9] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'start' @ [163:24] ==> public abstract fun start(): Unit defined in org.apache.activemq.artemis.core.server.ActiveMQServer[JavaMethodDescriptor]

'Node' @ [164:9] ==> public companion object defined in net.corda.node.internal.Node[FakeCallableDescriptorForObject]

'printBasicNodeInfo' @ [164:14] ==> public final fun printBasicNodeInfo(description: String, info: String? = ...): Unit defined in net.corda.node.internal.Node.Companion[SimpleFunctionDescriptorImpl]

'p2pPort' @ [164:54] ==> public final val p2pPort: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'toString' @ [164:62] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'rpcPort' @ [165:13] ==> public final val rpcPort: Int? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'Node' @ [166:13] ==> public companion object defined in net.corda.node.internal.Node[FakeCallableDescriptorForObject]

'printBasicNodeInfo' @ [166:18] ==> public final fun printBasicNodeInfo(description: String, info: String? = ...): Unit defined in net.corda.node.internal.Node.Companion[SimpleFunctionDescriptorImpl]

'rpcPort' @ [166:70] ==> public final val rpcPort: Int? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'toString' @ [166:78] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ConfigurationImpl' @ [170:56] ==> public constructor ConfigurationImpl() defined in org.apache.activemq.artemis.core.config.impl.ConfigurationImpl[JavaClassConstructorDescriptor]

'apply' @ [170:76] ==> @InlineOnly public inline fun <T> ConfigurationImpl.apply(block: ConfigurationImpl.() -> Unit): ConfigurationImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConfigurationImpl

'config' @ [171:26] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'baseDirectory' @ [171:33] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'bindingsDirectory' @ [172:9] ==> public final var ConfigurationImpl.bindingsDirectory: (String..String?)[MyPropertyDescriptor]

'artemisDir' @ [172:30] ==> val artemisDir: Path defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisConfig.<anonymous>[LocalVariableDescriptor]

'toString' @ [172:55] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'journalDirectory' @ [173:9] ==> public final var ConfigurationImpl.journalDirectory: (String..String?)[MyPropertyDescriptor]

'artemisDir' @ [173:29] ==> val artemisDir: Path defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisConfig.<anonymous>[LocalVariableDescriptor]

'toString' @ [173:53] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'largeMessagesDirectory' @ [174:9] ==> public final var ConfigurationImpl.largeMessagesDirectory: (String..String?)[MyPropertyDescriptor]

'artemisDir' @ [174:35] ==> val artemisDir: Path defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisConfig.<anonymous>[LocalVariableDescriptor]

'toString' @ [174:66] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'Inbound' @ [175:55] ==> public constructor Inbound(acceptorFactoryClassName: String) defined in net.corda.nodeapi.ConnectionDirection.Inbound[DeserializedClassConstructorDescriptor]

'NettyAcceptorFactory' @ [176:44] ==> public constructor NettyAcceptorFactory() defined in org.apache.activemq.artemis.core.remoting.impl.netty.NettyAcceptorFactory[JavaClassConstructorDescriptor]

'java' @ [176:72] ==> public val <T> KClass<NettyAcceptorFactory>.java: Class<NettyAcceptorFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NettyAcceptorFactory

'name' @ [176:77] ==> public final val <T : (Any..Any?)> Class<NettyAcceptorFactory>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NettyAcceptorFactory

'mutableSetOf' @ [178:25] ==> public fun <T> mutableSetOf(vararg elements: TransportConfiguration): MutableSet<TransportConfiguration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransportConfiguration

'createTcpTransport' @ [178:38] ==> private final fun createTcpTransport(connectionDirection: ConnectionDirection, host: String, port: Int, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'connectionDirection' @ [178:57] ==> val connectionDirection: ConnectionDirection.Inbound defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisConfig.<anonymous>[LocalVariableDescriptor]

'p2pPort' @ [178:89] ==> public final val p2pPort: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'rpcPort' @ [179:13] ==> public final val rpcPort: Int? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'acceptors' @ [180:13] ==> val acceptors: MutableSet<TransportConfiguration> defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisConfig.<anonymous>[LocalVariableDescriptor]

'add' @ [180:23] ==> public abstract fun add(element: TransportConfiguration): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'createTcpTransport' @ [180:27] ==> private final fun createTcpTransport(connectionDirection: ConnectionDirection, host: String, port: Int, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'connectionDirection' @ [180:46] ==> val connectionDirection: ConnectionDirection.Inbound defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisConfig.<anonymous>[LocalVariableDescriptor]

'rpcPort' @ [180:78] ==> public final val rpcPort: Int? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'acceptorConfigurations' @ [182:9] ==> public final var ConfigurationImpl.acceptorConfigurations: (MutableSet<(TransportConfiguration..TransportConfiguration?)>..Set<(TransportConfiguration..TransportConfiguration?)>?)[MyPropertyDescriptor]

'acceptors' @ [182:34] ==> val acceptors: MutableSet<TransportConfiguration> defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisConfig.<anonymous>[LocalVariableDescriptor]

'idCacheSize' @ [185:9] ==> public final var ConfigurationImpl.idCacheSize: Int[MyPropertyDescriptor]

'isPersistIDCache' @ [186:9] ==> public final var ConfigurationImpl.isPersistIDCache: Boolean[MyPropertyDescriptor]

'isPopulateValidatedUser' @ [187:9] ==> public final var ConfigurationImpl.isPopulateValidatedUser: Boolean[MyPropertyDescriptor]

'journalBufferSize_NIO' @ [188:9] ==> public final var ConfigurationImpl.journalBufferSize_NIO: Int[MyPropertyDescriptor]

'MAX_FILE_SIZE' @ [188:33] ==> @JvmStatic public final val MAX_FILE_SIZE: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'journalBufferSize_AIO' @ [189:9] ==> public final var ConfigurationImpl.journalBufferSize_AIO: Int[MyPropertyDescriptor]

'MAX_FILE_SIZE' @ [189:33] ==> @JvmStatic public final val MAX_FILE_SIZE: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'journalFileSize' @ [190:9] ==> public final var ConfigurationImpl.journalFileSize: Int[MyPropertyDescriptor]

'MAX_FILE_SIZE' @ [190:27] ==> @JvmStatic public final val MAX_FILE_SIZE: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'managementNotificationAddress' @ [191:9] ==> public final var ConfigurationImpl.managementNotificationAddress: (SimpleString..SimpleString?)[MyPropertyDescriptor]

'SimpleString' @ [191:41] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'NOTIFICATIONS_ADDRESS' @ [191:54] ==> public const final val NOTIFICATIONS_ADDRESS: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'clusterPassword' @ [196:9] ==> public final var ConfigurationImpl.clusterPassword: (String..String?)[MyPropertyDescriptor]

'BigInteger' @ [196:27] ==> public constructor BigInteger(p0: Int, p1: (Random..Random?)) defined in java.math.BigInteger[JavaClassConstructorDescriptor]

'newSecureRandom' @ [196:43] ==> public fun newSecureRandom(): SecureRandom defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'toString' @ [196:62] ==> public open fun toString(p0: Int): (String..String?) defined in java.math.BigInteger[JavaMethodDescriptor]

'queueConfigurations' @ [197:9] ==> public final var ConfigurationImpl.queueConfigurations: (MutableList<(CoreQueueConfiguration..CoreQueueConfiguration?)>..List<(CoreQueueConfiguration..CoreQueueConfiguration?)>?)[MyPropertyDescriptor]

'listOf' @ [197:31] ==> public fun <T> listOf(vararg elements: CoreQueueConfiguration): List<CoreQueueConfiguration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoreQueueConfiguration

'queueConfig' @ [198:17] ==> private final fun queueConfig(name: String, address: String = ..., filter: String? = ..., durable: Boolean): CoreQueueConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'NETWORK_MAP_QUEUE' @ [198:29] ==> public const final val NETWORK_MAP_QUEUE: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'queueConfig' @ [199:17] ==> private final fun queueConfig(name: String, address: String = ..., filter: String? = ..., durable: Boolean): CoreQueueConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'P2P_QUEUE' @ [199:29] ==> public const final val P2P_QUEUE: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'queueConfig' @ [203:17] ==> private final fun queueConfig(name: String, address: String = ..., filter: String? = ..., durable: Boolean): CoreQueueConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'RPC_SERVER_QUEUE_NAME' @ [203:36] ==> public final val RPC_SERVER_QUEUE_NAME: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'queueConfig' @ [204:17] ==> private final fun queueConfig(name: String, address: String = ..., filter: String? = ..., durable: Boolean): CoreQueueConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'RPC_CLIENT_BINDING_REMOVALS' @ [205:39] ==> public final val RPC_CLIENT_BINDING_REMOVALS: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'NOTIFICATIONS_ADDRESS' @ [206:35] ==> public const final val NOTIFICATIONS_ADDRESS: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'RPC_CLIENT_BINDING_REMOVAL_FILTER_EXPRESSION' @ [207:41] ==> public final val RPC_CLIENT_BINDING_REMOVAL_FILTER_EXPRESSION: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'queueConfig' @ [210:17] ==> private final fun queueConfig(name: String, address: String = ..., filter: String? = ..., durable: Boolean): CoreQueueConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'RPC_CLIENT_BINDING_ADDITIONS' @ [211:39] ==> public final val RPC_CLIENT_BINDING_ADDITIONS: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'NOTIFICATIONS_ADDRESS' @ [212:35] ==> public const final val NOTIFICATIONS_ADDRESS: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'RPC_CLIENT_BINDING_ADDITION_FILTER_EXPRESSION' @ [213:41] ==> public final val RPC_CLIENT_BINDING_ADDITION_FILTER_EXPRESSION: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'addressesSettings' @ [217:9] ==> public final var ConfigurationImpl.addressesSettings: (MutableMap<(String..String?), (AddressSettings..AddressSettings?)>..Map<(String..String?), (AddressSettings..AddressSettings?)>?)[MyPropertyDescriptor]

'mapOf' @ [217:29] ==> public fun <K, V> mapOf(pair: Pair<(String..String?), AddressSettings>): Map<(String..String?), AddressSettings> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> AddressSettings

'to' @ [218:17] ==> public infix fun <A, B> String.to(that: AddressSettings): Pair<String, AddressSettings> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> AddressSettings

'RPCApi' @ [218:20] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_QUEUE_NAME_PREFIX' @ [218:27] ==> public final val RPC_CLIENT_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'AddressSettings' @ [218:63] ==> public constructor AddressSettings() defined in org.apache.activemq.artemis.core.settings.impl.AddressSettings[JavaClassConstructorDescriptor]

'apply' @ [218:81] ==> @InlineOnly public inline fun <T> AddressSettings.apply(block: AddressSettings.() -> Unit): AddressSettings defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AddressSettings

'maxSizeBytes' @ [219:21] ==> public final var AddressSettings.maxSizeBytes: Long[MyPropertyDescriptor]

'*' @ [219:36] ==> public final operator fun times(other: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'MAX_FILE_SIZE' @ [219:42] ==> @JvmStatic public final val MAX_FILE_SIZE: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'addressFullMessagePolicy' @ [220:21] ==> public final var AddressSettings.addressFullMessagePolicy: (AddressFullMessagePolicy..AddressFullMessagePolicy?)[MyPropertyDescriptor]

'FAIL' @ [220:73] ==> enum entry FAIL defined in org.apache.activemq.artemis.core.settings.impl.AddressFullMessagePolicy[FakeCallableDescriptorForObject]

'configureAddressSecurity' @ [223:9] ==> private final fun ConfigurationImpl.configureAddressSecurity(): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'name' @ [226:61] ==> value-parameter name: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueConfig[ValueParameterDescriptorImpl]

'CoreQueueConfiguration' @ [227:16] ==> public constructor CoreQueueConfiguration() defined in org.apache.activemq.artemis.core.config.CoreQueueConfiguration[JavaClassConstructorDescriptor]

'apply' @ [227:41] ==> @InlineOnly public inline fun <T> CoreQueueConfiguration.apply(block: CoreQueueConfiguration.() -> Unit): CoreQueueConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoreQueueConfiguration

'this' @ [228:13] ==> <this> defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueConfig.<anonymous>[ReceiverParameterDescriptorImpl]

'name' @ [228:18] ==> public final var CoreQueueConfiguration.name: (String..String?)[MyPropertyDescriptor]

'name' @ [228:25] ==> value-parameter name: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueConfig[ValueParameterDescriptorImpl]

'this' @ [229:13] ==> <this> defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueConfig.<anonymous>[ReceiverParameterDescriptorImpl]

'address' @ [229:18] ==> public final var CoreQueueConfiguration.address: (String..String?)[MyPropertyDescriptor]

'address' @ [229:28] ==> value-parameter address: String = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueConfig[ValueParameterDescriptorImpl]

'filterString' @ [230:13] ==> public final var CoreQueueConfiguration.filterString: (String..String?)[MyPropertyDescriptor]

'filter' @ [230:28] ==> value-parameter filter: String? = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueConfig[ValueParameterDescriptorImpl]

'isDurable' @ [231:13] ==> public final var CoreQueueConfiguration.isDurable: Boolean[MyPropertyDescriptor]

'durable' @ [231:25] ==> value-parameter durable: Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueConfig[ValueParameterDescriptorImpl]

'Role' @ [243:32] ==> public constructor Role(p0: (String..String?), p1: Boolean, p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean) defined in org.apache.activemq.artemis.core.security.Role[JavaClassConstructorDescriptor]

'NODE_ROLE' @ [243:37] ==> public const final val NODE_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'securityRoles' @ [244:9] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'INTERNAL_PREFIX' @ [244:25] ==> public const final val INTERNAL_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'setOf' @ [244:46] ==> public fun <T> setOf(element: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [244:52] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'securityRoles' @ [245:9] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'P2P_QUEUE' @ [245:23] ==> public const final val P2P_QUEUE: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'setOf' @ [245:36] ==> public fun <T> setOf(vararg elements: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [245:42] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'restrictedRole' @ [245:60] ==> private final fun restrictedRole(name: String, send: Boolean = ..., consume: Boolean = ..., createDurableQueue: Boolean = ..., deleteDurableQueue: Boolean = ..., createNonDurableQueue: Boolean = ..., deleteNonDurableQueue: Boolean = ..., manage: Boolean = ..., browse: Boolean = ...): Role defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'PEER_ROLE' @ [245:75] ==> public const final val PEER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'securityRoles' @ [246:9] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'RPC_SERVER_QUEUE_NAME' @ [246:30] ==> public final val RPC_SERVER_QUEUE_NAME: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'setOf' @ [246:55] ==> public fun <T> setOf(vararg elements: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [246:61] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'restrictedRole' @ [246:79] ==> private final fun restrictedRole(name: String, send: Boolean = ..., consume: Boolean = ..., createDurableQueue: Boolean = ..., deleteDurableQueue: Boolean = ..., createNonDurableQueue: Boolean = ..., deleteNonDurableQueue: Boolean = ..., manage: Boolean = ..., browse: Boolean = ...): Role defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'RPC_ROLE' @ [246:94] ==> public const final val RPC_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'securityRoles' @ [248:9] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'RPCApi' @ [248:26] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_QUEUE_NAME_PREFIX' @ [248:33] ==> public final val RPC_CLIENT_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'NODE_USER' @ [248:64] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'setOf' @ [248:80] ==> public fun <T> setOf(element: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [248:86] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'nodeRunsNetworkMapService' @ [249:13] ==> private final val nodeRunsNetworkMapService: Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'securityRoles' @ [250:13] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'IP_REQUEST_PREFIX' @ [250:29] ==> public const final val IP_REQUEST_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'setOf' @ [250:52] ==> public fun <T> setOf(vararg elements: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [251:21] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'restrictedRole' @ [252:21] ==> private final fun restrictedRole(name: String, send: Boolean = ..., consume: Boolean = ..., createDurableQueue: Boolean = ..., deleteDurableQueue: Boolean = ..., createNonDurableQueue: Boolean = ..., deleteNonDurableQueue: Boolean = ..., manage: Boolean = ..., browse: Boolean = ...): Role defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'PEER_ROLE' @ [252:36] ==> public const final val PEER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'component1' @ [255:15] ==> public final operator fun component1(): String defined in net.corda.nodeapi.User[DeserializedSimpleFunctionDescriptor]

'userService' @ [255:28] ==> public final val userService: RPCUserService defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'users' @ [255:40] ==> public abstract val users: List<User> defined in net.corda.node.services.RPCUserService[PropertyDescriptorImpl]

'securityRoles' @ [256:13] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'RPCApi' @ [256:30] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_QUEUE_NAME_PREFIX' @ [256:37] ==> public final val RPC_CLIENT_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'username' @ [256:68] ==> val username: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'setOf' @ [256:83] ==> public fun <T> setOf(vararg elements: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [257:21] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'restrictedRole' @ [258:21] ==> private final fun restrictedRole(name: String, send: Boolean = ..., consume: Boolean = ..., createDurableQueue: Boolean = ..., deleteDurableQueue: Boolean = ..., createNonDurableQueue: Boolean = ..., deleteNonDurableQueue: Boolean = ..., manage: Boolean = ..., browse: Boolean = ...): Role defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'RPCApi' @ [258:39] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_QUEUE_NAME_PREFIX' @ [258:46] ==> public final val RPC_CLIENT_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'username' @ [258:77] ==> val username: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'securityRoles' @ [260:9] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'VERIFICATION_REQUESTS_QUEUE_NAME' @ [260:35] ==> public final val VERIFICATION_REQUESTS_QUEUE_NAME: String defined in net.corda.nodeapi.VerifierApi[DeserializedPropertyDescriptor]

'setOf' @ [260:71] ==> public fun <T> setOf(vararg elements: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [260:77] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'restrictedRole' @ [260:95] ==> private final fun restrictedRole(name: String, send: Boolean = ..., consume: Boolean = ..., createDurableQueue: Boolean = ..., deleteDurableQueue: Boolean = ..., createNonDurableQueue: Boolean = ..., deleteNonDurableQueue: Boolean = ..., manage: Boolean = ..., browse: Boolean = ...): Role defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'VERIFIER_ROLE' @ [260:110] ==> public const final val VERIFIER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'securityRoles' @ [261:9] ==> public final var ConfigurationImpl.securityRoles: (MutableMap<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>..Map<(String..String?), (MutableSet<(Role..Role?)>..Set<(Role..Role?)>?)>?)[MyPropertyDescriptor]

'VerifierApi' @ [261:26] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'VERIFICATION_RESPONSES_QUEUE_NAME_PREFIX' @ [261:38] ==> public final val VERIFICATION_RESPONSES_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.VerifierApi[DeserializedPropertyDescriptor]

'setOf' @ [261:86] ==> public fun <T> setOf(vararg elements: Role): Set<Role> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Role

'nodeInternalRole' @ [261:92] ==> val nodeInternalRole: Role defined in net.corda.node.services.messaging.ArtemisMessagingServer.configureAddressSecurity[LocalVariableDescriptor]

'restrictedRole' @ [261:110] ==> private final fun restrictedRole(name: String, send: Boolean = ..., consume: Boolean = ..., createDurableQueue: Boolean = ..., deleteDurableQueue: Boolean = ..., createNonDurableQueue: Boolean = ..., deleteNonDurableQueue: Boolean = ..., manage: Boolean = ..., browse: Boolean = ...): Role defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'VERIFIER_ROLE' @ [261:125] ==> public const final val VERIFIER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'Role' @ [267:16] ==> public constructor Role(p0: (String..String?), p1: Boolean, p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Boolean, p7: Boolean, p8: Boolean) defined in org.apache.activemq.artemis.core.security.Role[JavaClassConstructorDescriptor]

'name' @ [267:21] ==> value-parameter name: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'send' @ [267:27] ==> value-parameter send: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'consume' @ [267:33] ==> value-parameter consume: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'createDurableQueue' @ [267:42] ==> value-parameter createDurableQueue: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'deleteDurableQueue' @ [267:62] ==> value-parameter deleteDurableQueue: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'createNonDurableQueue' @ [267:82] ==> value-parameter createNonDurableQueue: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'deleteNonDurableQueue' @ [268:17] ==> value-parameter deleteNonDurableQueue: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'manage' @ [268:40] ==> value-parameter manage: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'browse' @ [268:48] ==> value-parameter browse: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.restrictedRole[ValueParameterDescriptorImpl]

'Throws' @ [271:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [271:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'KeyStoreException' @ [271:33] ==> public constructor KeyStoreException() defined in java.security.KeyStoreException[JavaClassConstructorDescriptor]

'loadKeyStore' @ [273:24] ==> @Throws public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'config' @ [273:37] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'sslKeystore' @ [273:44] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [273:57] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'keyStorePassword' @ [273:64] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'loadKeyStore' @ [274:26] ==> @Throws public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'config' @ [274:39] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'trustStoreFile' @ [274:46] ==> public open val trustStoreFile: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [274:62] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'trustStorePassword' @ [274:69] ==> public abstract val trustStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'mapOf' @ [276:35] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, CertificateChainCheckPolicy>): Map<String, CertificateChainCheckPolicy> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> CertificateChainCheckPolicy

'PEER_ROLE' @ [277:17] ==> public const final val PEER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'RootMustMatch' @ [277:58] ==> public object RootMustMatch : CertificateChainCheckPolicy defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[FakeCallableDescriptorForObject]

'NODE_ROLE' @ [278:17] ==> public const final val NODE_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'LeafMustMatch' @ [278:58] ==> public object LeafMustMatch : CertificateChainCheckPolicy defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[FakeCallableDescriptorForObject]

'VERIFIER_ROLE' @ [279:17] ==> public const final val VERIFIER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyImportedFromObject]

'RootMustMatch' @ [279:62] ==> public object RootMustMatch : CertificateChainCheckPolicy defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[FakeCallableDescriptorForObject]

'defaultCertPolicies' @ [281:26] ==> val defaultCertPolicies: Map<String, CertificateChainCheckPolicy> defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager[LocalVariableDescriptor]

'mapValues' @ [281:46] ==> public inline fun <K, V, R> Map<out String, CertificateChainCheckPolicy>.mapValues(transform: (Map.Entry<String, CertificateChainCheckPolicy>) -> CertificateChainCheckPolicy.Check): Map<String, CertificateChainCheckPolicy.Check> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> CertificateChainCheckPolicy
    <R> -> Check

'component1' @ [281:59] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, CertificateChainCheckPolicy>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> CertificateChainCheckPolicy

'component2' @ [281:65] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, CertificateChainCheckPolicy>.component2(): CertificateChainCheckPolicy defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> CertificateChainCheckPolicy

'config' @ [282:32] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'certificateChainCheckPolicies' @ [282:39] ==> public abstract val certificateChainCheckPolicies: List<CertChainPolicyConfig> defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'noneOrSingle' @ [282:69] ==> public inline fun <T> Iterable<CertChainPolicyConfig>.noneOrSingle(predicate: (CertChainPolicyConfig) -> Boolean): CertChainPolicyConfig? defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CertChainPolicyConfig

'it' @ [282:84] ==> value-parameter it: CertChainPolicyConfig defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'role' @ [282:87] ==> public final val role: String defined in net.corda.node.services.config.CertChainPolicyConfig[PropertyDescriptorImpl]

'role' @ [282:95] ==> val role: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager.<anonymous>[LocalVariableDescriptor]

'certificateChainCheckPolicy' @ [282:103] ==> public final val certificateChainCheckPolicy: CertificateChainCheckPolicy defined in net.corda.node.services.config.CertChainPolicyConfig[PropertyDescriptorImpl]

'configPolicy' @ [283:14] ==> val configPolicy: CertificateChainCheckPolicy? defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager.<anonymous>[LocalVariableDescriptor]

'defaultPolicy' @ [283:30] ==> val defaultPolicy: CertificateChainCheckPolicy defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager.<anonymous>[LocalVariableDescriptor]

'createCheck' @ [283:45] ==> public abstract fun createCheck(keyStore: KeyStore, trustStore: KeyStore): CertificateChainCheckPolicy.Check defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[SimpleFunctionDescriptorImpl]

'keyStore' @ [283:57] ==> val keyStore: KeyStore defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager[LocalVariableDescriptor]

'trustStore' @ [283:67] ==> val trustStore: KeyStore defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager[LocalVariableDescriptor]

'SecurityConfiguration' @ [285:39] ==> public constructor SecurityConfiguration() defined in org.apache.activemq.artemis.core.config.impl.SecurityConfiguration[JavaClassConstructorDescriptor]

'mapOf' @ [288:31] ==> public fun <K, V> mapOf(vararg pairs: Pair<(String..String?), Any>): Map<(String..String?), Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> Any

'to' @ [289:25] ==> public infix fun <A, B> (String..String?).to(that: RPCUserService): Pair<(String..String?), RPCUserService> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.String..kotlin.String?)
    <B> -> RPCUserService

'java' @ [289:47] ==> public val <T> KClass<RPCUserService>.java: Class<RPCUserService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RPCUserService

'name' @ [289:52] ==> public final val <T : (Any..Any?)> Class<RPCUserService>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> RPCUserService

'userService' @ [289:60] ==> public final val userService: RPCUserService defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'NodeLoginModule' @ [290:25] ==> public companion object defined in net.corda.node.services.messaging.NodeLoginModule[FakeCallableDescriptorForObject]

'CERT_CHAIN_CHECKS_OPTION_NAME' @ [290:41] ==> public const final val CERT_CHAIN_CHECKS_OPTION_NAME: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'certChecks' @ [290:74] ==> val certChecks: Map<String, CertificateChainCheckPolicy.Check> defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager[LocalVariableDescriptor]

'arrayOf' @ [291:24] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: AppConfigurationEntry): Array<AppConfigurationEntry> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> AppConfigurationEntry

'AppConfigurationEntry' @ [291:32] ==> public constructor AppConfigurationEntry(p0: (String..String?), p1: (AppConfigurationEntry.LoginModuleControlFlag..AppConfigurationEntry.LoginModuleControlFlag?), p2: (MutableMap<(String..String?), *>..Map<(String..String?), *>?)) defined in javax.security.auth.login.AppConfigurationEntry[JavaClassConstructorDescriptor]

'name' @ [291:54] ==> value-parameter name: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager.<no name provided>.getAppConfigurationEntry[ValueParameterDescriptorImpl]

'REQUIRED' @ [291:60] ==> public final val REQUIRED: (AppConfigurationEntry.LoginModuleControlFlag..AppConfigurationEntry.LoginModuleControlFlag?) defined in javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag[JavaPropertyDescriptor]

'options' @ [291:70] ==> val options: Map<(String..String?), Any> defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager.<no name provided>.getAppConfigurationEntry[LocalVariableDescriptor]

'ActiveMQJAASSecurityManager' @ [294:16] ==> public constructor ActiveMQJAASSecurityManager(p0: (String..String?), p1: (SecurityConfiguration..SecurityConfiguration?)) defined in org.apache.activemq.artemis.spi.core.security.ActiveMQJAASSecurityManager[JavaClassConstructorDescriptor]

'NodeLoginModule' @ [294:44] ==> public companion object defined in net.corda.node.services.messaging.NodeLoginModule[FakeCallableDescriptorForObject]

'java' @ [294:67] ==> public val <T> KClass<NodeLoginModule>.java: Class<NodeLoginModule> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NodeLoginModule

'name' @ [294:72] ==> public final val <T : (Any..Any?)> Class<NodeLoginModule>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeLoginModule

'securityConfig' @ [294:78] ==> val securityConfig: <no name provided> defined in net.corda.node.services.messaging.ArtemisMessagingServer.createArtemisSecurityManager[LocalVariableDescriptor]

'log' @ [298:9] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'debug' @ [298:13] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'queueName' @ [298:38] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'log' @ [301:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'debug' @ [301:17] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'queueName' @ [301:46] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'nodeInfo' @ [301:60] ==> value-parameter nodeInfo: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue.deployBridgeToPeer[ValueParameterDescriptorImpl]

'nodeInfo' @ [302:27] ==> value-parameter nodeInfo: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue.deployBridgeToPeer[ValueParameterDescriptorImpl]

'addresses' @ [302:36] ==> public final val addresses: List<NetworkHostAndPort> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'first' @ [302:46] ==> public fun <T> List<NetworkHostAndPort>.first(): NetworkHostAndPort defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort

'deployBridge' @ [303:13] ==> private final fun deployBridge(queueName: String, target: NetworkHostAndPort, legalName: X500Name): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'queueName' @ [303:26] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'address' @ [303:37] ==> val address: NetworkHostAndPort defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue.deployBridgeToPeer[LocalVariableDescriptor]

'nodeInfo' @ [303:46] ==> value-parameter nodeInfo: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue.deployBridgeToPeer[ValueParameterDescriptorImpl]

'legalIdentity' @ [303:55] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [303:69] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'when {
            queueName.startsWith(PEERS_PREFIX) -> try {
                val identity = parsePublicKeyBase58(queueName.substring(PEERS_PREFIX.length))
                val nodeInfo = networkMapCache.getNodeByLegalIdentityKey(identity)
                if (nodeInfo != null) {
                    deployBridgeToPeer(nodeInfo)
                } else {
                    log.error("Queue created for a peer that we don't know from the network map: $queueName")
                }
            } catch (e: AddressFormatException) {
                log.error("Flow violation: Could not parse peer queue name as Base 58: $queueName")
            }

            queueName.startsWith(SERVICES_PREFIX) -> try {
                val identity = parsePublicKeyBase58(queueName.substring(SERVICES_PREFIX.length))
                val nodeInfos = networkMapCache.getNodesByAdvertisedServiceIdentityKey(identity)
                // Create a bridge for each node advertising the service.
                for (nodeInfo in nodeInfos) {
                    deployBridgeToPeer(nodeInfo)
                }
            } catch (e: AddressFormatException) {
                log.error("Flow violation: Could not parse service queue name as Base 58: $queueName")
            }
        }' @ [306:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'queueName' @ [307:13] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'startsWith' @ [307:23] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'PEERS_PREFIX' @ [307:34] ==> public const final val PEERS_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'parsePublicKeyBase58' @ [308:32] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'queueName' @ [308:53] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'substring' @ [308:63] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'PEERS_PREFIX' @ [308:73] ==> public const final val PEERS_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'length' @ [308:86] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'networkMapCache' @ [309:32] ==> public final val networkMapCache: NetworkMapCache defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'getNodeByLegalIdentityKey' @ [309:48] ==> public abstract fun getNodeByLegalIdentityKey(identityKey: PublicKey): NodeInfo? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'identity' @ [309:74] ==> val identity: PublicKey defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[LocalVariableDescriptor]

'if (nodeInfo != null) {
                    deployBridgeToPeer(nodeInfo)
                } else {
                    log.error("Queue created for a peer that we don't know from the network map: $queueName")
                }' @ [310:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'nodeInfo' @ [310:21] ==> val nodeInfo: NodeInfo? defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[LocalVariableDescriptor]

'deployBridgeToPeer' @ [311:21] ==> local final fun deployBridgeToPeer(nodeInfo: NodeInfo): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[SimpleFunctionDescriptorImpl]

'nodeInfo' @ [311:40] ==> val nodeInfo: NodeInfo? defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[LocalVariableDescriptor]

'log' @ [313:21] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'error' @ [313:25] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'queueName' @ [313:99] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'log' @ [316:17] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'error' @ [316:21] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'queueName' @ [316:89] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'queueName' @ [319:13] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'startsWith' @ [319:23] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'SERVICES_PREFIX' @ [319:34] ==> public const final val SERVICES_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'parsePublicKeyBase58' @ [320:32] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'queueName' @ [320:53] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'substring' @ [320:63] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'SERVICES_PREFIX' @ [320:73] ==> public const final val SERVICES_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'length' @ [320:89] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'networkMapCache' @ [321:33] ==> public final val networkMapCache: NetworkMapCache defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'getNodesByAdvertisedServiceIdentityKey' @ [321:49] ==> public open fun getNodesByAdvertisedServiceIdentityKey(publicKey: PublicKey): List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'identity' @ [321:88] ==> val identity: PublicKey defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[LocalVariableDescriptor]

'nodeInfos' @ [323:34] ==> val nodeInfos: List<NodeInfo> defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[LocalVariableDescriptor]

'deployBridgeToPeer' @ [324:21] ==> local final fun deployBridgeToPeer(nodeInfo: NodeInfo): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[SimpleFunctionDescriptorImpl]

'nodeInfo' @ [324:40] ==> val nodeInfo: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[LocalVariableDescriptor]

'log' @ [327:17] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'error' @ [327:21] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'queueName' @ [327:92] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridgesFromNewQueue[ValueParameterDescriptorImpl]

'getArtemisPeerAddress' @ [342:31] ==> public final fun getArtemisPeerAddress(nodeInfo: NodeInfo): ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer[DeserializedSimpleFunctionDescriptor]

'node' @ [342:53] ==> value-parameter node: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.gatherAddresses[ValueParameterDescriptorImpl]

'mutableListOf' @ [343:29] ==> public fun <T> mutableListOf(vararg elements: ArtemisMessagingComponent.ArtemisPeerAddress): MutableList<ArtemisMessagingComponent.ArtemisPeerAddress> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisPeerAddress

'peerAddress' @ [343:43] ==> val peerAddress: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.gatherAddresses[LocalVariableDescriptor]

'node' @ [344:13] ==> value-parameter node: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.gatherAddresses[ValueParameterDescriptorImpl]

'advertisedServices' @ [344:18] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mapTo' @ [344:37] ==> public inline fun <T, R, C : MutableCollection<in ArtemisMessagingComponent.NodeAddress>> Iterable<ServiceEntry>.mapTo(destination: MutableList<ArtemisMessagingComponent.ArtemisPeerAddress>, transform: (ServiceEntry) -> ArtemisMessagingComponent.NodeAddress): MutableList<ArtemisMessagingComponent.ArtemisPeerAddress> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry
    <R> -> NodeAddress
    <C : MutableCollection<in R>> -> MutableList<ArtemisPeerAddress>

'addresses' @ [344:43] ==> val addresses: MutableList<ArtemisMessagingComponent.ArtemisPeerAddress> defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.gatherAddresses[LocalVariableDescriptor]

'NodeAddress' @ [344:56] ==> public companion object defined in net.corda.nodeapi.ArtemisMessagingComponent.NodeAddress[FakeCallableDescriptorForObject]

'asService' @ [344:68] ==> public final fun asService(serviceIdentity: PublicKey, hostAndPort: NetworkHostAndPort): ArtemisMessagingComponent.NodeAddress defined in net.corda.nodeapi.ArtemisMessagingComponent.NodeAddress.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [344:78] ==> value-parameter it: ServiceEntry defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.gatherAddresses.<anonymous>[ValueParameterDescriptorImpl]

'identity' @ [344:81] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'owningKey' @ [344:90] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'peerAddress' @ [344:101] ==> val peerAddress: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.gatherAddresses[LocalVariableDescriptor]

'hostAndPort' @ [344:113] ==> public abstract val hostAndPort: NetworkHostAndPort defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisPeerAddress[DeserializedPropertyDescriptor]

'addresses' @ [345:20] ==> val addresses: MutableList<ArtemisMessagingComponent.ArtemisPeerAddress> defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.gatherAddresses[LocalVariableDescriptor]

'asSequence' @ [345:30] ==> public fun <T> Iterable<ArtemisMessagingComponent.ArtemisPeerAddress>.asSequence(): Sequence<ArtemisMessagingComponent.ArtemisPeerAddress> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisPeerAddress

'gatherAddresses' @ [349:13] ==> local final fun gatherAddresses(node: NodeInfo): Sequence<ArtemisMessagingComponent.ArtemisPeerAddress> defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[SimpleFunctionDescriptorImpl]

'node' @ [349:29] ==> value-parameter node: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.deployBridges[ValueParameterDescriptorImpl]

'filter' @ [350:22] ==> public fun <T> Sequence<ArtemisMessagingComponent.ArtemisPeerAddress>.filter(predicate: (ArtemisMessagingComponent.ArtemisPeerAddress) -> Boolean): Sequence<ArtemisMessagingComponent.ArtemisPeerAddress> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisPeerAddress

'queueExists' @ [350:31] ==> private final fun queueExists(queueName: String): Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'it' @ [350:43] ==> value-parameter it: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.deployBridges.<anonymous>[ValueParameterDescriptorImpl]

'queueName' @ [350:46] ==> public abstract val queueName: String defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisPeerAddress[DeserializedPropertyDescriptor]

'!' @ [350:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bridgeExists' @ [350:61] ==> private final fun bridgeExists(bridgeName: String): Boolean defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'it' @ [350:74] ==> value-parameter it: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.deployBridges.<anonymous>[ValueParameterDescriptorImpl]

'bridgeName' @ [350:77] ==> private final val ArtemisMessagingComponent.ArtemisPeerAddress.bridgeName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'forEach' @ [351:22] ==> public inline fun <T> Sequence<ArtemisMessagingComponent.ArtemisPeerAddress>.forEach(action: (ArtemisMessagingComponent.ArtemisPeerAddress) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisPeerAddress

'deployBridge' @ [351:32] ==> private final fun deployBridge(address: ArtemisMessagingComponent.ArtemisPeerAddress, legalName: X500Name): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'it' @ [351:45] ==> value-parameter it: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.deployBridges.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [351:49] ==> value-parameter node: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.deployBridges[ValueParameterDescriptorImpl]

'legalIdentity' @ [351:54] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [351:68] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'gatherAddresses' @ [355:13] ==> local final fun gatherAddresses(node: NodeInfo): Sequence<ArtemisMessagingComponent.ArtemisPeerAddress> defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[SimpleFunctionDescriptorImpl]

'node' @ [355:29] ==> value-parameter node: NodeInfo defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.destroyBridges[ValueParameterDescriptorImpl]

'forEach' @ [355:35] ==> public inline fun <T> Sequence<ArtemisMessagingComponent.ArtemisPeerAddress>.forEach(action: (ArtemisMessagingComponent.ArtemisPeerAddress) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisPeerAddress

'activeMQServer' @ [356:17] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'destroyBridge' @ [356:32] ==> public abstract fun destroyBridge(p0: (String..String?)): Unit defined in org.apache.activemq.artemis.core.server.ActiveMQServer[JavaMethodDescriptor]

'it' @ [356:46] ==> value-parameter it: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange.destroyBridges.<anonymous>[ValueParameterDescriptorImpl]

'bridgeName' @ [356:49] ==> private final val ArtemisMessagingComponent.ArtemisPeerAddress.bridgeName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'when (change) {
            is MapChange.Added -> {
                deployBridges(change.node)
            }
            is MapChange.Removed -> {
                destroyBridges(change.node)
            }
            is MapChange.Modified -> {
                // TODO Figure out what has actually changed and only destroy those bridges that need to be.
                destroyBridges(change.previousNode)
                deployBridges(change.node)
            }
        }' @ [360:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'change' @ [360:15] ==> value-parameter change: NetworkMapCache.MapChange defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[ValueParameterDescriptorImpl]

'deployBridges' @ [362:17] ==> local final fun deployBridges(node: NodeInfo): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[SimpleFunctionDescriptorImpl]

'change' @ [362:31] ==> value-parameter change: NetworkMapCache.MapChange defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[ValueParameterDescriptorImpl]

'node' @ [362:38] ==> public abstract val node: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange[DeserializedPropertyDescriptor]

'destroyBridges' @ [365:17] ==> local final fun destroyBridges(node: NodeInfo): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[SimpleFunctionDescriptorImpl]

'change' @ [365:32] ==> value-parameter change: NetworkMapCache.MapChange defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[ValueParameterDescriptorImpl]

'node' @ [365:39] ==> public abstract val node: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange[DeserializedPropertyDescriptor]

'destroyBridges' @ [369:17] ==> local final fun destroyBridges(node: NodeInfo): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[SimpleFunctionDescriptorImpl]

'change' @ [369:32] ==> value-parameter change: NetworkMapCache.MapChange defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[ValueParameterDescriptorImpl]

'previousNode' @ [369:39] ==> public final val previousNode: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange.Modified[DeserializedPropertyDescriptor]

'deployBridges' @ [370:17] ==> local final fun deployBridges(node: NodeInfo): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[SimpleFunctionDescriptorImpl]

'change' @ [370:31] ==> value-parameter change: NetworkMapCache.MapChange defined in net.corda.node.services.messaging.ArtemisMessagingServer.updateBridgesOnNetworkChange[ValueParameterDescriptorImpl]

'node' @ [370:38] ==> public abstract val node: NodeInfo defined in net.corda.core.node.services.NetworkMapCache.MapChange[DeserializedPropertyDescriptor]

'deployBridge' @ [376:9] ==> private final fun deployBridge(queueName: String, target: NetworkHostAndPort, legalName: X500Name): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'address' @ [376:22] ==> value-parameter address: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'queueName' @ [376:30] ==> public abstract val queueName: String defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisPeerAddress[DeserializedPropertyDescriptor]

'address' @ [376:41] ==> value-parameter address: ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'hostAndPort' @ [376:49] ==> public abstract val hostAndPort: NetworkHostAndPort defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisPeerAddress[DeserializedPropertyDescriptor]

'legalName' @ [376:62] ==> value-parameter legalName: X500Name defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'ArtemisTcpTransport' @ [380:13] ==> public companion object defined in net.corda.nodeapi.ArtemisTcpTransport[FakeCallableDescriptorForObject]

'tcpTransport' @ [380:33] ==> public final fun tcpTransport(direction: ConnectionDirection, hostAndPort: NetworkHostAndPort, config: SSLConfiguration?, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.nodeapi.ArtemisTcpTransport.Companion[DeserializedSimpleFunctionDescriptor]

'connectionDirection' @ [380:46] ==> value-parameter connectionDirection: ConnectionDirection defined in net.corda.node.services.messaging.ArtemisMessagingServer.createTcpTransport[ValueParameterDescriptorImpl]

'NetworkHostAndPort' @ [380:67] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'host' @ [380:86] ==> value-parameter host: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.createTcpTransport[ValueParameterDescriptorImpl]

'port' @ [380:92] ==> value-parameter port: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer.createTcpTransport[ValueParameterDescriptorImpl]

'config' @ [380:99] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'enableSSL' @ [380:119] ==> value-parameter enableSSL: Boolean = ... defined in net.corda.node.services.messaging.ArtemisMessagingServer.createTcpTransport[ValueParameterDescriptorImpl]

'Outbound' @ [389:55] ==> public constructor Outbound(expectedCommonName: X500Name? = ..., connectorFactoryClassName: String = ...) defined in net.corda.nodeapi.ConnectionDirection.Outbound[DeserializedClassConstructorDescriptor]

'VerifyingNettyConnectorFactory' @ [390:45] ==> public constructor VerifyingNettyConnectorFactory() defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory[ClassConstructorDescriptorImpl]

'java' @ [390:83] ==> public val <T> KClass<VerifyingNettyConnectorFactory>.java: Class<VerifyingNettyConnectorFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VerifyingNettyConnectorFactory

'name' @ [390:88] ==> public final val <T : (Any..Any?)> Class<VerifyingNettyConnectorFactory>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VerifyingNettyConnectorFactory

'legalName' @ [391:38] ==> value-parameter legalName: X500Name defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'createTcpTransport' @ [393:28] ==> private final fun createTcpTransport(connectionDirection: ConnectionDirection, host: String, port: Int, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'connectionDirection' @ [393:47] ==> val connectionDirection: ConnectionDirection.Outbound defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[LocalVariableDescriptor]

'target' @ [393:68] ==> value-parameter target: NetworkHostAndPort defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'host' @ [393:75] ==> public final val host: String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'target' @ [393:81] ==> value-parameter target: NetworkHostAndPort defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'port' @ [393:88] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'tcpTransport' @ [394:9] ==> val tcpTransport: TransportConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[LocalVariableDescriptor]

'params' @ [394:22] ==> public final val TransportConfiguration.params: (MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?)[MyPropertyDescriptor]

'ArtemisMessagingServer' @ [394:29] ==> public companion object defined in net.corda.node.services.messaging.ArtemisMessagingServer[FakeCallableDescriptorForObject]

'java' @ [394:59] ==> public val <T> KClass<ArtemisMessagingServer>.java: Class<ArtemisMessagingServer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ArtemisMessagingServer

'name' @ [394:64] ==> public final val <T : (Any..Any?)> Class<ArtemisMessagingServer>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ArtemisMessagingServer

'this' @ [394:72] ==> <this> defined in net.corda.node.services.messaging.ArtemisMessagingServer[LazyClassReceiverParameterDescriptor]

'activeMQServer' @ [396:9] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'configuration' @ [396:24] ==> public final val ActiveMQServer.configuration: (Configuration..Configuration?)[MyPropertyDescriptor]

'addConnectorConfiguration' @ [396:38] ==> public abstract fun addConnectorConfiguration(p0: (String..String?), p1: (TransportConfiguration..TransportConfiguration?)): (Configuration..Configuration?) defined in org.apache.activemq.artemis.core.config.Configuration[JavaMethodDescriptor]

'target' @ [396:64] ==> value-parameter target: NetworkHostAndPort defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'toString' @ [396:71] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

'tcpTransport' @ [396:83] ==> val tcpTransport: TransportConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[LocalVariableDescriptor]

'activeMQServer' @ [398:9] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'deployBridge' @ [398:24] ==> public abstract fun deployBridge(p0: (BridgeConfiguration..BridgeConfiguration?)): Unit defined in org.apache.activemq.artemis.core.server.ActiveMQServer[JavaMethodDescriptor]

'BridgeConfiguration' @ [398:37] ==> public constructor BridgeConfiguration() defined in org.apache.activemq.artemis.core.config.BridgeConfiguration[JavaClassConstructorDescriptor]

'apply' @ [398:59] ==> @InlineOnly public inline fun <T> BridgeConfiguration.apply(block: BridgeConfiguration.() -> Unit): BridgeConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BridgeConfiguration

'name' @ [399:13] ==> public final var BridgeConfiguration.name: (String..String?)[MyPropertyDescriptor]

'getBridgeName' @ [399:20] ==> private final fun getBridgeName(queueName: String, hostAndPort: NetworkHostAndPort): String defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'queueName' @ [399:34] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'target' @ [399:45] ==> value-parameter target: NetworkHostAndPort defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'this' @ [400:13] ==> <this> defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge.<anonymous>[ReceiverParameterDescriptorImpl]

'queueName' @ [400:18] ==> public final var BridgeConfiguration.queueName: (String..String?)[MyPropertyDescriptor]

'queueName' @ [400:30] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'forwardingAddress' @ [401:13] ==> public final var BridgeConfiguration.forwardingAddress: (String..String?)[MyPropertyDescriptor]

'P2P_QUEUE' @ [401:33] ==> public const final val P2P_QUEUE: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'staticConnectors' @ [402:13] ==> public final var BridgeConfiguration.staticConnectors: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'listOf' @ [402:32] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'target' @ [402:39] ==> value-parameter target: NetworkHostAndPort defined in net.corda.node.services.messaging.ArtemisMessagingServer.deployBridge[ValueParameterDescriptorImpl]

'toString' @ [402:46] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

'confirmationWindowSize' @ [403:13] ==> public final var BridgeConfiguration.confirmationWindowSize: Int[MyPropertyDescriptor]

'isUseDuplicateDetection' @ [404:13] ==> public final var BridgeConfiguration.isUseDuplicateDetection: Boolean[MyPropertyDescriptor]

'retryInterval' @ [408:13] ==> public final var BridgeConfiguration.retryInterval: Long[MyPropertyDescriptor]

'seconds' @ [408:31] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'toMillis' @ [408:39] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'retryIntervalMultiplier' @ [409:13] ==> public final var BridgeConfiguration.retryIntervalMultiplier: Double[MyPropertyDescriptor]

'maxRetryInterval' @ [410:13] ==> public final var BridgeConfiguration.maxRetryInterval: Long[MyPropertyDescriptor]

'minutes' @ [410:34] ==> public val Int.minutes: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'toMillis' @ [410:42] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'user' @ [413:13] ==> public final var BridgeConfiguration.user: (String..String?)[MyPropertyDescriptor]

'PEER_USER' @ [413:20] ==> public const final val PEER_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'password' @ [414:13] ==> public final var BridgeConfiguration.password: (String..String?)[MyPropertyDescriptor]

'PEER_USER' @ [414:24] ==> public const final val PEER_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'activeMQServer' @ [418:59] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'queueQuery' @ [418:74] ==> public abstract fun queueQuery(p0: (SimpleString..SimpleString?)): (QueueQueryResult..QueueQueryResult?) defined in org.apache.activemq.artemis.core.server.ActiveMQServer[JavaMethodDescriptor]

'SimpleString' @ [418:85] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'queueName' @ [418:98] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.queueExists[ValueParameterDescriptorImpl]

'isExists' @ [418:110] ==> public final val QueueQueryResult.isExists: Boolean[MyPropertyDescriptor]

'activeMQServer' @ [420:61] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'clusterManager' @ [420:76] ==> public final val ActiveMQServer.clusterManager: (ClusterManager..ClusterManager?)[MyPropertyDescriptor]

'bridges' @ [420:91] ==> public final val ClusterManager.bridges: (MutableMap<(String..String?), (Bridge..Bridge?)>..Map<(String..String?), (Bridge..Bridge?)>?)[MyPropertyDescriptor]

'containsKey' @ [420:99] ==> public abstract fun containsKey(key: (String..String?)): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'bridgeName' @ [420:111] ==> value-parameter bridgeName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.bridgeExists[ValueParameterDescriptorImpl]

'getBridgeName' @ [422:63] ==> private final fun getBridgeName(queueName: String, hostAndPort: NetworkHostAndPort): String defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'queueName' @ [422:77] ==> public abstract val queueName: String defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisPeerAddress[DeserializedPropertyDescriptor]

'hostAndPort' @ [422:88] ==> public abstract val hostAndPort: NetworkHostAndPort defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisPeerAddress[DeserializedPropertyDescriptor]

'queueName' @ [424:95] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.getBridgeName[ValueParameterDescriptorImpl]

'hostAndPort' @ [424:109] ==> value-parameter hostAndPort: NetworkHostAndPort defined in net.corda.node.services.messaging.ArtemisMessagingServer.getBridgeName[ValueParameterDescriptorImpl]

'log' @ [428:9] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'error' @ [428:13] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'errorMsg' @ [428:19] ==> value-parameter errorMsg: String? defined in net.corda.node.services.messaging.ArtemisMessagingServer.hostVerificationFail[ValueParameterDescriptorImpl]

'expectedLegalName' @ [429:13] ==> value-parameter expectedLegalName: X500Name defined in net.corda.node.services.messaging.ArtemisMessagingServer.hostVerificationFail[ValueParameterDescriptorImpl]

'config' @ [429:34] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'networkMapService' @ [429:41] ==> public abstract val networkMapService: NetworkMapInfo? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'legalName' @ [429:60] ==> public final val legalName: X500Name defined in net.corda.node.internal.NetworkMapInfo[PropertyDescriptorImpl]

'_networkMapConnectionFuture' @ [431:13] ==> private final val _networkMapConnectionFuture: OpenFuture<Unit>? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'setException' @ [431:43] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'IOException' @ [431:56] ==> public constructor IOException(p0: (String..String?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'config' @ [431:71] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'networkMapService' @ [431:78] ==> public abstract val networkMapService: NetworkMapInfo? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'peerLegalName' @ [437:13] ==> value-parameter peerLegalName: X500Name defined in net.corda.node.services.messaging.ArtemisMessagingServer.onTcpConnection[ValueParameterDescriptorImpl]

'config' @ [437:30] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'networkMapService' @ [437:37] ==> public abstract val networkMapService: NetworkMapInfo? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'legalName' @ [437:56] ==> public final val legalName: X500Name defined in net.corda.node.internal.NetworkMapInfo[PropertyDescriptorImpl]

'_networkMapConnectionFuture' @ [438:13] ==> private final val _networkMapConnectionFuture: OpenFuture<Unit>? defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'set' @ [438:43] ==> public abstract fun set(value: Unit): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'Unit' @ [438:47] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'activeMQServer' @ [444:27] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'sessions' @ [444:42] ==> public final val ActiveMQServer.sessions: (MutableSet<(ServerSession..ServerSession?)>..Set<(ServerSession..ServerSession?)>?)[MyPropertyDescriptor]

'first' @ [444:51] ==> public inline fun <T> Iterable<(ServerSession..ServerSession?)>.first(predicate: ((ServerSession..ServerSession?)) -> Boolean): (ServerSession..ServerSession?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.apache.activemq.artemis.core.server.ServerSession..org.apache.activemq.artemis.core.server.ServerSession?)

'it' @ [445:17] ==> value-parameter it: (ServerSession..ServerSession?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.getRemoteAddress.<anonymous>[ValueParameterDescriptorImpl]

'getMetaData' @ [445:20] ==> public abstract fun getMetaData(p0: (String..String?)): (String..String?) defined in org.apache.activemq.artemis.core.server.ServerSession[JavaMethodDescriptor]

'ipDetectRequestProperty' @ [445:32] ==> public final val ipDetectRequestProperty: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'requestId' @ [445:60] ==> value-parameter requestId: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.getRemoteAddress[ValueParameterDescriptorImpl]

'session' @ [447:20] ==> val session: (ServerSession..ServerSession?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.getRemoteAddress[LocalVariableDescriptor]

'remotingConnection' @ [447:28] ==> public final val ServerSession.remotingConnection: (RemotingConnection..RemotingConnection?)[MyPropertyDescriptor]

'remoteAddress' @ [447:47] ==> public final val RemotingConnection.remoteAddress: (String..String?)[MyPropertyDescriptor]

'CoreMessage' @ [451:35] ==> public constructor CoreMessage(p0: Long, p1: Int) defined in org.apache.activemq.artemis.core.message.impl.CoreMessage[JavaClassConstructorDescriptor]

'random63BitValue' @ [451:47] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'apply' @ [451:70] ==> @InlineOnly public inline fun <T> CoreMessage.apply(block: CoreMessage.() -> Unit): CoreMessage defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoreMessage

'putStringProperty' @ [452:17] ==> public open fun putStringProperty(p0: (String..String?), p1: (String..String?)): (CoreMessage..CoreMessage?) defined in org.apache.activemq.artemis.core.message.impl.CoreMessage[JavaMethodDescriptor]

'ipDetectResponseProperty' @ [452:35] ==> public final val ipDetectResponseProperty: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'remoteAddress' @ [452:61] ==> value-parameter remoteAddress: String? defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.sendResponse[ValueParameterDescriptorImpl]

'RoutingContextImpl' @ [454:34] ==> public constructor RoutingContextImpl(p0: (Transaction..Transaction?)) defined in org.apache.activemq.artemis.core.server.impl.RoutingContextImpl[JavaClassConstructorDescriptor]

'activeMQServer' @ [455:25] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'locateQueue' @ [455:40] ==> public abstract fun locateQueue(p0: (SimpleString..SimpleString?)): (Queue..Queue?) defined in org.apache.activemq.artemis.core.server.ActiveMQServer[JavaMethodDescriptor]

'SimpleString' @ [455:52] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'queueName' @ [455:65] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[ValueParameterDescriptorImpl]

'queue' @ [456:13] ==> val queue: (Queue..Queue?) defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.sendResponse[LocalVariableDescriptor]

'route' @ [456:19] ==> public abstract fun route(p0: (Message..Message?), p1: (RoutingContext..RoutingContext?)): Unit defined in org.apache.activemq.artemis.core.server.Queue[JavaMethodDescriptor]

'responseMessage' @ [456:25] ==> val responseMessage: CoreMessage defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.sendResponse[LocalVariableDescriptor]

'routingContext' @ [456:42] ==> val routingContext: RoutingContextImpl defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.sendResponse[LocalVariableDescriptor]

'activeMQServer' @ [457:13] ==> private final lateinit var activeMQServer: ActiveMQServer defined in net.corda.node.services.messaging.ArtemisMessagingServer[PropertyDescriptorImpl]

'postOffice' @ [457:28] ==> public final val ActiveMQServer.postOffice: (PostOffice..PostOffice?)[MyPropertyDescriptor]

'processRoute' @ [457:39] ==> public abstract fun processRoute(p0: (Message..Message?), p1: (RoutingContext..RoutingContext?), p2: Boolean): Unit defined in org.apache.activemq.artemis.core.postoffice.PostOffice[JavaMethodDescriptor]

'responseMessage' @ [457:52] ==> val responseMessage: CoreMessage defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.sendResponse[LocalVariableDescriptor]

'routingContext' @ [457:69] ==> val routingContext: RoutingContextImpl defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest.sendResponse[LocalVariableDescriptor]

'!' @ [460:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'queueName' @ [460:14] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[ValueParameterDescriptorImpl]

'startsWith' @ [460:24] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'IP_REQUEST_PREFIX' @ [460:35] ==> public const final val IP_REQUEST_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'queueName' @ [461:25] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[ValueParameterDescriptorImpl]

'substringAfter' @ [461:35] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'IP_REQUEST_PREFIX' @ [461:50] ==> public const final val IP_REQUEST_PREFIX: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'getRemoteAddress' @ [462:29] ==> local final fun getRemoteAddress(requestId: String): String? defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[SimpleFunctionDescriptorImpl]

'requestId' @ [462:46] ==> val requestId: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[LocalVariableDescriptor]

'log' @ [463:9] ==> private final val log: Logger defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'debug' @ [463:13] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'remoteAddress' @ [463:47] ==> val remoteAddress: String? defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[LocalVariableDescriptor]

'requestId' @ [463:74] ==> val requestId: String defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[LocalVariableDescriptor]

'sendResponse' @ [464:9] ==> local final fun sendResponse(remoteAddress: String?): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[SimpleFunctionDescriptorImpl]

'remoteAddress' @ [464:22] ==> val remoteAddress: String? defined in net.corda.node.services.messaging.ArtemisMessagingServer.handleIpDetectionRequest[LocalVariableDescriptor]

'NettyConnectorFactory' @ [468:40] ==> public constructor NettyConnectorFactory() defined in org.apache.activemq.artemis.core.remoting.impl.netty.NettyConnectorFactory[JavaClassConstructorDescriptor]

'VerifyingNettyConnector' @ [476:16] ==> public constructor VerifyingNettyConnector(configuration: MutableMap<String, Any>, handler: BufferHandler?, listener: ClientConnectionLifeCycleListener?, closeExecutor: Executor?, threadPool: Executor?, scheduledThreadPool: ScheduledExecutorService?, protocolManager: ClientProtocolManager?) defined in net.corda.node.services.messaging.VerifyingNettyConnector[ClassConstructorDescriptorImpl]

'configuration' @ [476:40] ==> value-parameter configuration: MutableMap<String, Any> defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory.createConnector[ValueParameterDescriptorImpl]

'handler' @ [476:55] ==> value-parameter handler: BufferHandler? defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory.createConnector[ValueParameterDescriptorImpl]

'listener' @ [476:64] ==> value-parameter listener: ClientConnectionLifeCycleListener? defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory.createConnector[ValueParameterDescriptorImpl]

'closeExecutor' @ [476:74] ==> value-parameter closeExecutor: Executor? defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory.createConnector[ValueParameterDescriptorImpl]

'threadPool' @ [476:89] ==> value-parameter threadPool: Executor? defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory.createConnector[ValueParameterDescriptorImpl]

'scheduledThreadPool' @ [476:101] ==> value-parameter scheduledThreadPool: ScheduledExecutorService? defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory.createConnector[ValueParameterDescriptorImpl]

'protocolManager' @ [477:17] ==> value-parameter protocolManager: ClientProtocolManager? defined in net.corda.node.services.messaging.VerifyingNettyConnectorFactory.createConnector[ValueParameterDescriptorImpl]

'NettyConnector' @ [488:9] ==> public constructor NettyConnector(p0: (MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?), p1: (BufferHandler..BufferHandler?), p2: (BaseConnectionLifeCycleListener<*>..BaseConnectionLifeCycleListener<*>?), p3: (Executor..Executor?), p4: (Executor..Executor?), p5: (ScheduledExecutorService..ScheduledExecutorService?), p6: (ClientProtocolManager..ClientProtocolManager?)) defined in org.apache.activemq.artemis.core.remoting.impl.netty.NettyConnector[JavaClassConstructorDescriptor]

'configuration' @ [488:24] ==> value-parameter configuration: MutableMap<String, Any> defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'handler' @ [488:39] ==> value-parameter handler: BufferHandler? defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'listener' @ [488:48] ==> value-parameter listener: ClientConnectionLifeCycleListener? defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'closeExecutor' @ [488:58] ==> value-parameter closeExecutor: Executor? defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'threadPool' @ [488:73] ==> value-parameter threadPool: Executor? defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'scheduledThreadPool' @ [488:85] ==> value-parameter scheduledThreadPool: ScheduledExecutorService? defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'protocolManager' @ [488:106] ==> value-parameter protocolManager: ClientProtocolManager? defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'configuration' @ [489:26] ==> value-parameter configuration: MutableMap<String, Any> defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'ArtemisMessagingServer' @ [489:40] ==> public companion object defined in net.corda.node.services.messaging.ArtemisMessagingServer[FakeCallableDescriptorForObject]

'java' @ [489:70] ==> public val <T> KClass<ArtemisMessagingServer>.java: Class<ArtemisMessagingServer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ArtemisMessagingServer

'name' @ [489:75] ==> public final val <T : (Any..Any?)> Class<ArtemisMessagingServer>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ArtemisMessagingServer

'getBooleanProperty' @ [490:50] ==> public open fun getBooleanProperty(p0: (String..String?), p1: Boolean, p2: (MutableMap<(String..String?), *>..Map<(String..String?), *>?)): Boolean defined in org.apache.activemq.artemis.utils.ConfigurationHelper[JavaMethodDescriptor]

'SSL_ENABLED_PROP_NAME' @ [490:88] ==> public const final val SSL_ENABLED_PROP_NAME: String defined in org.apache.activemq.artemis.core.remoting.impl.netty.TransportConstants[JavaPropertyDescriptor]

'DEFAULT_SSL_ENABLED' @ [490:130] ==> public const final val DEFAULT_SSL_ENABLED: Boolean defined in org.apache.activemq.artemis.core.remoting.impl.netty.TransportConstants[JavaPropertyDescriptor]

'configuration' @ [490:151] ==> value-parameter configuration: MutableMap<String, Any> defined in net.corda.node.services.messaging.VerifyingNettyConnector.<init>[ValueParameterDescriptorImpl]

'super' @ [493:26] ==> <this> defined in net.corda.node.services.messaging.VerifyingNettyConnector[LazyClassReceiverParameterDescriptor]

'createConnection' @ [493:32] ==> public open fun createConnection(): (Connection..Connection?) defined in org.apache.activemq.artemis.core.remoting.impl.netty.NettyConnector[JavaMethodDescriptor]

'sslEnabled' @ [494:13] ==> private final val sslEnabled: Boolean defined in net.corda.node.services.messaging.VerifyingNettyConnector[PropertyDescriptorImpl]

'connection' @ [494:27] ==> val connection: NettyConnection? defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'configuration' @ [495:37] ==> protected/*protected and package*/ final val configuration: (MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?) defined in net.corda.node.services.messaging.VerifyingNettyConnector[JavaPropertyDescriptor]

'VERIFY_PEER_LEGAL_NAME' @ [495:71] ==> public const final val VERIFY_PEER_LEGAL_NAME: String defined in net.corda.nodeapi.ArtemisTcpTransport.Companion[DeserializedPropertyDescriptor]

'connection' @ [497:31] ==> val connection: NettyConnection? defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'channel' @ [497:42] ==> public final val NettyConnection.channel: (Channel..Channel?)[MyPropertyDescriptor]

'pipeline' @ [498:26] ==> public abstract fun pipeline(): (ChannelPipeline..ChannelPipeline?) defined in io.netty.channel.Channel[JavaMethodDescriptor]

'get' @ [499:26] ==> public abstract operator fun <T : (ChannelHandler..ChannelHandler?)> get(p0: (Class<(SslHandler..SslHandler?)>..Class<(SslHandler..SslHandler?)>?)): (SslHandler..SslHandler?) defined in io.netty.channel.ChannelPipeline[JavaMethodDescriptor]
Inferred types:
    <T : (ChannelHandler..ChannelHandler?)> -> (io.netty.handler.ssl.SslHandler..io.netty.handler.ssl.SslHandler?)

'java' @ [499:48] ==> public val <T> KClass<SslHandler>.java: Class<SslHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SslHandler

'engine' @ [500:26] ==> public open fun engine(): (SSLEngine..SSLEngine?) defined in io.netty.handler.ssl.SslHandler[JavaMethodDescriptor]

'session' @ [501:26] ==> public final val SSLEngine.session: (SSLSession..SSLSession?)[MyPropertyDescriptor]

'session' @ [503:37] ==> val session: (SSLSession..SSLSession?) defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'peerPrincipal' @ [503:45] ==> public final val SSLSession.peerPrincipal: (Principal..Principal?)[MyPropertyDescriptor]

'name' @ [503:59] ==> public final val Principal.name: (String..String?)[MyPropertyDescriptor]

'let' @ [503:64] ==> @InlineOnly public inline fun <T, R> (String..String?).let(block: ((String..String?)) -> X500Name): X500Name defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> X500Name

'X500Name' @ [503:70] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'require' @ [504:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'peerLegalName' @ [504:25] ==> val peerLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'expectedLegalName' @ [504:42] ==> val expectedLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'+' @ [505:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expectedLegalName' @ [505:52] ==> val expectedLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'peerLegalName' @ [505:79] ==> val peerLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'session' @ [509:39] ==> val session: (SSLSession..SSLSession?) defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'peerCertificateChain' @ [509:47] ==> public final val SSLSession.peerCertificateChain: (Array<(X509Certificate..X509Certificate?)>..Array<out (X509Certificate..X509Certificate?)>?)[MyPropertyDescriptor]

'toX509CertHolder' @ [509:71] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'require' @ [510:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'peerCertificate' @ [510:25] ==> val peerCertificate: X509CertificateHolder defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'subject' @ [510:41] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'expectedLegalName' @ [510:52] ==> val expectedLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'+' @ [511:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expectedLegalName' @ [511:81] ==> val expectedLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'peerCertificate' @ [511:109] ==> val peerCertificate: X509CertificateHolder defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'subject' @ [511:125] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'X509Utilities' @ [514:17] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'validateCertificateChain' @ [514:31] ==> public final fun validateCertificateChain(trustedRoot: X509CertificateHolder, vararg certificates: Certificate): Unit defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'session' @ [514:56] ==> val session: (SSLSession..SSLSession?) defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'localCertificates' @ [514:64] ==> public final val SSLSession.localCertificates: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)[MyPropertyDescriptor]

'last' @ [514:82] ==> public fun <T> Array<out (Certificate..Certificate?)>.last(): (Certificate..Certificate?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'toX509CertHolder' @ [514:89] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'session' @ [514:110] ==> val session: (SSLSession..SSLSession?) defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'peerCertificates' @ [514:118] ==> public final val SSLSession.peerCertificates: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)[MyPropertyDescriptor]

'server' @ [515:17] ==> private final val server: ArtemisMessagingServer defined in net.corda.node.services.messaging.VerifyingNettyConnector[PropertyDescriptorImpl]

'onTcpConnection' @ [515:24] ==> internal final fun onTcpConnection(peerLegalName: X500Name): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'peerLegalName' @ [515:40] ==> val peerLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'connection' @ [517:17] ==> val connection: NettyConnection? defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'close' @ [517:28] ==> public final fun close(): Unit defined in org.apache.activemq.artemis.core.remoting.impl.netty.NettyConnection[JavaMethodDescriptor]

'server' @ [518:17] ==> private final val server: ArtemisMessagingServer defined in net.corda.node.services.messaging.VerifyingNettyConnector[PropertyDescriptorImpl]

'hostVerificationFail' @ [518:24] ==> internal final fun hostVerificationFail(expectedLegalName: X500Name, errorMsg: String?): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[SimpleFunctionDescriptorImpl]

'expectedLegalName' @ [518:45] ==> val expectedLegalName: X500Name defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'e' @ [518:64] ==> val e: IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'message' @ [518:66] ==> public open val message: String? defined in java.lang.IllegalArgumentException[DeserializedPropertyDescriptor]

'connection' @ [522:16] ==> val connection: NettyConnection? defined in net.corda.node.services.messaging.VerifyingNettyConnector.createConnection[LocalVariableDescriptor]

'FunctionalInterface' @ [528:5] ==> public constructor FunctionalInterface() defined in java.lang.FunctionalInterface[JavaClassConstructorDescriptor]

'CertificateChainCheckPolicy' @ [535:18] ==> private constructor CertificateChainCheckPolicy() defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[ClassConstructorDescriptorImpl]

'CertificateChainCheckPolicy' @ [544:28] ==> private constructor CertificateChainCheckPolicy() defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[ClassConstructorDescriptorImpl]

'trustStore' @ [546:33] ==> value-parameter trustStore: KeyStore defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.RootMustMatch.createCheck[ValueParameterDescriptorImpl]

'getCertificate' @ [546:44] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'CORDA_ROOT_CA' @ [546:59] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyImportedFromObject]

'publicKey' @ [546:74] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'theirChain' @ [549:37] ==> value-parameter theirChain: Array<X509Certificate> defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.RootMustMatch.createCheck.<no name provided>.checkCertificateChain[ValueParameterDescriptorImpl]

'last' @ [549:48] ==> public fun <T> Array<out X509Certificate>.last(): X509Certificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'publicKey' @ [549:55] ==> public final val X509Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'rootPublicKey' @ [550:25] ==> val rootPublicKey: (PublicKey..PublicKey?) defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.RootMustMatch.createCheck[LocalVariableDescriptor]

'theirRoot' @ [550:42] ==> val theirRoot: (PublicKey..PublicKey?) defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.RootMustMatch.createCheck.<no name provided>.checkCertificateChain[LocalVariableDescriptor]

'CertificateException' @ [551:31] ==> public constructor CertificateException(p0: (String..String?)) defined in javax.security.cert.CertificateException[JavaClassConstructorDescriptor]

'theirRoot' @ [551:94] ==> val theirRoot: (PublicKey..PublicKey?) defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.RootMustMatch.createCheck.<no name provided>.checkCertificateChain[LocalVariableDescriptor]

'CertificateChainCheckPolicy' @ [558:28] ==> private constructor CertificateChainCheckPolicy() defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[ClassConstructorDescriptorImpl]

'keyStore' @ [560:32] ==> value-parameter keyStore: KeyStore defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.LeafMustMatch.createCheck[ValueParameterDescriptorImpl]

'getCertificate' @ [560:41] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'CORDA_CLIENT_TLS' @ [560:56] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[PropertyImportedFromObject]

'publicKey' @ [560:74] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'theirChain' @ [563:37] ==> value-parameter theirChain: Array<X509Certificate> defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.LeafMustMatch.createCheck.<no name provided>.checkCertificateChain[ValueParameterDescriptorImpl]

'first' @ [563:48] ==> public fun <T> Array<out X509Certificate>.first(): X509Certificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'publicKey' @ [563:56] ==> public final val X509Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'ourPublicKey' @ [564:25] ==> val ourPublicKey: (PublicKey..PublicKey?) defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.LeafMustMatch.createCheck[LocalVariableDescriptor]

'theirLeaf' @ [564:41] ==> val theirLeaf: (PublicKey..PublicKey?) defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.LeafMustMatch.createCheck.<no name provided>.checkCertificateChain[LocalVariableDescriptor]

'CertificateException' @ [565:31] ==> public constructor CertificateException(p0: (String..String?)) defined in javax.security.cert.CertificateException[JavaClassConstructorDescriptor]

'theirLeaf' @ [565:94] ==> val theirLeaf: (PublicKey..PublicKey?) defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.LeafMustMatch.createCheck.<no name provided>.checkCertificateChain[LocalVariableDescriptor]

'CertificateChainCheckPolicy' @ [572:68] ==> private constructor CertificateChainCheckPolicy() defined in net.corda.node.services.messaging.CertificateChainCheckPolicy[ClassConstructorDescriptorImpl]

'trustedAliases' @ [574:37] ==> public final val trustedAliases: Set<String> defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.MustContainOneOf[PropertyDescriptorImpl]

'map' @ [574:52] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (PublicKey..PublicKey?)): List<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.security.PublicKey..java.security.PublicKey?)

'trustStore' @ [574:58] ==> value-parameter trustStore: KeyStore defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.MustContainOneOf.createCheck[ValueParameterDescriptorImpl]

'getCertificate' @ [574:69] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'it' @ [574:84] ==> value-parameter it: String defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.MustContainOneOf.createCheck.<anonymous>[ValueParameterDescriptorImpl]

'publicKey' @ [574:88] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'toSet' @ [574:100] ==> public fun <T> Iterable<(PublicKey..PublicKey?)>.toSet(): Set<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.PublicKey..java.security.PublicKey?)

'!' @ [577:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'theirChain' @ [577:26] ==> value-parameter theirChain: Array<X509Certificate> defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.MustContainOneOf.createCheck.<no name provided>.checkCertificateChain[ValueParameterDescriptorImpl]

'any' @ [577:37] ==> public inline fun <T> Array<out X509Certificate>.any(predicate: (X509Certificate) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'it' @ [577:43] ==> value-parameter it: X509Certificate defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.MustContainOneOf.createCheck.<no name provided>.checkCertificateChain.<anonymous>[ValueParameterDescriptorImpl]

'publicKey' @ [577:46] ==> public final val X509Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'trustedPublicKeys' @ [577:59] ==> val trustedPublicKeys: Set<(PublicKey..PublicKey?)> defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.MustContainOneOf.createCheck[LocalVariableDescriptor]

'CertificateException' @ [578:31] ==> public constructor CertificateException(p0: (String..String?)) defined in javax.security.cert.CertificateException[JavaClassConstructorDescriptor]

'loggerFor' @ [607:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeLoginModule

'ArrayList' @ [617:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Principal

'Suppress' @ [619:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [621:9] ==> <this> defined in net.corda.node.services.messaging.NodeLoginModule[LazyClassReceiverParameterDescriptor]

'subject' @ [621:14] ==> private final lateinit var subject: Subject defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'subject' @ [621:24] ==> value-parameter subject: Subject defined in net.corda.node.services.messaging.NodeLoginModule.initialize[ValueParameterDescriptorImpl]

'this' @ [622:9] ==> <this> defined in net.corda.node.services.messaging.NodeLoginModule[LazyClassReceiverParameterDescriptor]

'callbackHandler' @ [622:14] ==> private final lateinit var callbackHandler: CallbackHandler defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'callbackHandler' @ [622:32] ==> value-parameter callbackHandler: CallbackHandler defined in net.corda.node.services.messaging.NodeLoginModule.initialize[ValueParameterDescriptorImpl]

'userService' @ [623:9] ==> private final lateinit var userService: RPCUserService defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'options' @ [623:23] ==> value-parameter options: Map<String, *> defined in net.corda.node.services.messaging.NodeLoginModule.initialize[ValueParameterDescriptorImpl]

'java' @ [623:53] ==> public val <T> KClass<RPCUserService>.java: Class<RPCUserService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RPCUserService

'name' @ [623:58] ==> public final val <T : (Any..Any?)> Class<RPCUserService>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> RPCUserService

'options' @ [624:31] ==> value-parameter options: Map<String, *> defined in net.corda.node.services.messaging.NodeLoginModule.initialize[ValueParameterDescriptorImpl]

'CERT_CHAIN_CHECKS_OPTION_NAME' @ [624:39] ==> public const final val CERT_CHAIN_CHECKS_OPTION_NAME: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'peerCertCheck' @ [625:9] ==> private final lateinit var peerCertCheck: CertificateChainCheckPolicy.Check defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'certChainChecks' @ [625:25] ==> val certChainChecks: Map<String, CertificateChainCheckPolicy.Check> defined in net.corda.node.services.messaging.NodeLoginModule.initialize[LocalVariableDescriptor]

'PEER_ROLE' @ [625:41] ==> public const final val PEER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'nodeCertCheck' @ [626:9] ==> private final lateinit var nodeCertCheck: CertificateChainCheckPolicy.Check defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'certChainChecks' @ [626:25] ==> val certChainChecks: Map<String, CertificateChainCheckPolicy.Check> defined in net.corda.node.services.messaging.NodeLoginModule.initialize[LocalVariableDescriptor]

'NODE_ROLE' @ [626:41] ==> public const final val NODE_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'verifierCertCheck' @ [627:9] ==> private final lateinit var verifierCertCheck: CertificateChainCheckPolicy.Check defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'certChainChecks' @ [627:29] ==> val certChainChecks: Map<String, CertificateChainCheckPolicy.Check> defined in net.corda.node.services.messaging.NodeLoginModule.initialize[LocalVariableDescriptor]

'VERIFIER_ROLE' @ [627:45] ==> public const final val VERIFIER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'NameCallback' @ [631:28] ==> public constructor NameCallback(p0: (String..String?)) defined in javax.security.auth.callback.NameCallback[JavaClassConstructorDescriptor]

'PasswordCallback' @ [632:32] ==> public constructor PasswordCallback(p0: (String..String?), p1: Boolean) defined in javax.security.auth.callback.PasswordCallback[JavaClassConstructorDescriptor]

'CertificateCallback' @ [633:35] ==> public constructor CertificateCallback() defined in org.apache.activemq.artemis.spi.core.security.jaas.CertificateCallback[JavaClassConstructorDescriptor]

'callbackHandler' @ [635:13] ==> private final lateinit var callbackHandler: CallbackHandler defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'handle' @ [635:29] ==> public abstract fun handle(p0: (Array<(Callback..Callback?)>..Array<out (Callback..Callback?)>?)): Unit defined in javax.security.auth.callback.CallbackHandler[JavaMethodDescriptor]

'arrayOf' @ [635:36] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Callback): Array<Callback> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Callback

'nameCallback' @ [635:44] ==> val nameCallback: NameCallback defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'passwordCallback' @ [635:58] ==> val passwordCallback: PasswordCallback defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'certificateCallback' @ [635:76] ==> val certificateCallback: CertificateCallback defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'LoginException' @ [637:19] ==> public constructor LoginException(p0: (String..String?)) defined in javax.security.auth.login.LoginException[JavaClassConstructorDescriptor]

'e' @ [637:34] ==> val e: IOException defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'message' @ [637:36] ==> public open val message: String? defined in java.io.IOException[DeserializedPropertyDescriptor]

'LoginException' @ [639:19] ==> public constructor LoginException(p0: (String..String?)) defined in javax.security.auth.login.LoginException[JavaClassConstructorDescriptor]

'e' @ [639:37] ==> val e: UnsupportedCallbackException defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'message' @ [639:39] ==> public open val message: String? defined in javax.security.auth.callback.UnsupportedCallbackException[DeserializedPropertyDescriptor]

'nameCallback' @ [642:24] ==> val nameCallback: NameCallback defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'name' @ [642:37] ==> public final var NameCallback.name: (String..String?)[MyPropertyDescriptor]

'FailedLoginException' @ [642:51] ==> public constructor FailedLoginException(p0: (String..String?)) defined in javax.security.auth.login.FailedLoginException[JavaClassConstructorDescriptor]

'String' @ [643:24] ==> @InlineOnly public inline fun String(chars: CharArray): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'passwordCallback' @ [643:31] ==> val passwordCallback: PasswordCallback defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'password' @ [643:48] ==> public final var PasswordCallback.password: (CharArray..CharArray?)[MyPropertyDescriptor]

'FailedLoginException' @ [643:66] ==> public constructor FailedLoginException(p0: (String..String?)) defined in javax.security.auth.login.FailedLoginException[JavaClassConstructorDescriptor]

'certificateCallback' @ [644:28] ==> val certificateCallback: CertificateCallback defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'certificates' @ [644:48] ==> public final var CertificateCallback.certificates: (Array<(X509Certificate..X509Certificate?)>..Array<out (X509Certificate..X509Certificate?)>?)[MyPropertyDescriptor]

'log' @ [646:9] ==> public final val log: Logger defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'debug' @ [646:13] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'username' @ [646:44] ==> val username: String defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'when (determineUserRole(certificates, username)) {
                PEER_ROLE -> authenticatePeer(certificates)
                NODE_ROLE -> authenticateNode(certificates)
                VERIFIER_ROLE -> authenticateVerifier(certificates)
                RPC_ROLE -> authenticateRpcUser(password, username)
                else -> throw FailedLoginException("Peer does not belong on our network")
            }' @ [649:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'determineUserRole' @ [649:39] ==> private final fun determineUserRole(certificates: Array<X509Certificate>?, username: String): String? defined in net.corda.node.services.messaging.NodeLoginModule[SimpleFunctionDescriptorImpl]

'certificates' @ [649:57] ==> val certificates: (Array<(X509Certificate..X509Certificate?)>..Array<out (X509Certificate..X509Certificate?)>?) defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'username' @ [649:71] ==> val username: String defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'PEER_ROLE' @ [650:17] ==> public const final val PEER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'authenticatePeer' @ [650:30] ==> private final fun authenticatePeer(certificates: Array<X509Certificate>): String defined in net.corda.node.services.messaging.NodeLoginModule[SimpleFunctionDescriptorImpl]

'certificates' @ [650:47] ==> val certificates: (Array<(X509Certificate..X509Certificate?)>..Array<out (X509Certificate..X509Certificate?)>?) defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'NODE_ROLE' @ [651:17] ==> public const final val NODE_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'authenticateNode' @ [651:30] ==> private final fun authenticateNode(certificates: Array<X509Certificate>): String defined in net.corda.node.services.messaging.NodeLoginModule[SimpleFunctionDescriptorImpl]

'certificates' @ [651:47] ==> val certificates: (Array<(X509Certificate..X509Certificate?)>..Array<out (X509Certificate..X509Certificate?)>?) defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'VERIFIER_ROLE' @ [652:17] ==> public const final val VERIFIER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'authenticateVerifier' @ [652:34] ==> private final fun authenticateVerifier(certificates: Array<X509Certificate>): String defined in net.corda.node.services.messaging.NodeLoginModule[SimpleFunctionDescriptorImpl]

'certificates' @ [652:55] ==> val certificates: (Array<(X509Certificate..X509Certificate?)>..Array<out (X509Certificate..X509Certificate?)>?) defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'RPC_ROLE' @ [653:17] ==> public const final val RPC_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'authenticateRpcUser' @ [653:29] ==> private final fun authenticateRpcUser(password: String, username: String): String defined in net.corda.node.services.messaging.NodeLoginModule[SimpleFunctionDescriptorImpl]

'password' @ [653:49] ==> val password: String defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'username' @ [653:59] ==> val username: String defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'FailedLoginException' @ [654:31] ==> public constructor FailedLoginException(p0: (String..String?)) defined in javax.security.auth.login.FailedLoginException[JavaClassConstructorDescriptor]

'principals' @ [656:13] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'UserPrincipal' @ [656:27] ==> public constructor UserPrincipal(p0: (String..String?)) defined in org.apache.activemq.artemis.spi.core.security.jaas.UserPrincipal[JavaClassConstructorDescriptor]

'validatedUser' @ [656:41] ==> val validatedUser: String defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'loginSucceeded' @ [658:13] ==> private final var loginSucceeded: Boolean defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'loginSucceeded' @ [659:20] ==> private final var loginSucceeded: Boolean defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'log' @ [661:13] ==> public final val log: Logger defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'warn' @ [661:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'exception' @ [661:24] ==> val exception: FailedLoginException defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'exception' @ [662:19] ==> val exception: FailedLoginException defined in net.corda.node.services.messaging.NodeLoginModule.login[LocalVariableDescriptor]

'nodeCertCheck' @ [667:9] ==> private final lateinit var nodeCertCheck: CertificateChainCheckPolicy.Check defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'checkCertificateChain' @ [667:23] ==> public abstract fun checkCertificateChain(theirChain: Array<X509Certificate>): Unit defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.Check[SimpleFunctionDescriptorImpl]

'certificates' @ [667:45] ==> value-parameter certificates: Array<X509Certificate> defined in net.corda.node.services.messaging.NodeLoginModule.authenticateNode[ValueParameterDescriptorImpl]

'principals' @ [668:9] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'RolePrincipal' @ [668:23] ==> public constructor RolePrincipal(p0: (String..String?)) defined in org.apache.activemq.artemis.spi.core.security.jaas.RolePrincipal[JavaClassConstructorDescriptor]

'NODE_ROLE' @ [668:37] ==> public const final val NODE_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'certificates' @ [669:16] ==> value-parameter certificates: Array<X509Certificate> defined in net.corda.node.services.messaging.NodeLoginModule.authenticateNode[ValueParameterDescriptorImpl]

'first' @ [669:29] ==> public fun <T> Array<out X509Certificate>.first(): X509Certificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'subjectDN' @ [669:37] ==> public final val X509Certificate.subjectDN: (Principal..Principal?)[MyPropertyDescriptor]

'name' @ [669:47] ==> public final val Principal.name: (String..String?)[MyPropertyDescriptor]

'verifierCertCheck' @ [673:9] ==> private final lateinit var verifierCertCheck: CertificateChainCheckPolicy.Check defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'checkCertificateChain' @ [673:27] ==> public abstract fun checkCertificateChain(theirChain: Array<X509Certificate>): Unit defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.Check[SimpleFunctionDescriptorImpl]

'certificates' @ [673:49] ==> value-parameter certificates: Array<X509Certificate> defined in net.corda.node.services.messaging.NodeLoginModule.authenticateVerifier[ValueParameterDescriptorImpl]

'principals' @ [674:9] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'RolePrincipal' @ [674:23] ==> public constructor RolePrincipal(p0: (String..String?)) defined in org.apache.activemq.artemis.spi.core.security.jaas.RolePrincipal[JavaClassConstructorDescriptor]

'VERIFIER_ROLE' @ [674:37] ==> public const final val VERIFIER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'certificates' @ [675:16] ==> value-parameter certificates: Array<X509Certificate> defined in net.corda.node.services.messaging.NodeLoginModule.authenticateVerifier[ValueParameterDescriptorImpl]

'first' @ [675:29] ==> public fun <T> Array<out X509Certificate>.first(): X509Certificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'subjectDN' @ [675:37] ==> public final val X509Certificate.subjectDN: (Principal..Principal?)[MyPropertyDescriptor]

'name' @ [675:47] ==> public final val Principal.name: (String..String?)[MyPropertyDescriptor]

'peerCertCheck' @ [679:9] ==> private final lateinit var peerCertCheck: CertificateChainCheckPolicy.Check defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'checkCertificateChain' @ [679:23] ==> public abstract fun checkCertificateChain(theirChain: Array<X509Certificate>): Unit defined in net.corda.node.services.messaging.CertificateChainCheckPolicy.Check[SimpleFunctionDescriptorImpl]

'certificates' @ [679:45] ==> value-parameter certificates: Array<X509Certificate> defined in net.corda.node.services.messaging.NodeLoginModule.authenticatePeer[ValueParameterDescriptorImpl]

'principals' @ [680:9] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'RolePrincipal' @ [680:23] ==> public constructor RolePrincipal(p0: (String..String?)) defined in org.apache.activemq.artemis.spi.core.security.jaas.RolePrincipal[JavaClassConstructorDescriptor]

'PEER_ROLE' @ [680:37] ==> public const final val PEER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'certificates' @ [681:16] ==> value-parameter certificates: Array<X509Certificate> defined in net.corda.node.services.messaging.NodeLoginModule.authenticatePeer[ValueParameterDescriptorImpl]

'first' @ [681:29] ==> public fun <T> Array<out X509Certificate>.first(): X509Certificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'subjectDN' @ [681:37] ==> public final val X509Certificate.subjectDN: (Principal..Principal?)[MyPropertyDescriptor]

'name' @ [681:47] ==> public final val Principal.name: (String..String?)[MyPropertyDescriptor]

'userService' @ [685:23] ==> private final lateinit var userService: RPCUserService defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'getUser' @ [685:35] ==> public abstract fun getUser(username: String): User? defined in net.corda.node.services.RPCUserService[SimpleFunctionDescriptorImpl]

'username' @ [685:43] ==> value-parameter username: String defined in net.corda.node.services.messaging.NodeLoginModule.authenticateRpcUser[ValueParameterDescriptorImpl]

'FailedLoginException' @ [685:62] ==> public constructor FailedLoginException(p0: (String..String?)) defined in javax.security.auth.login.FailedLoginException[JavaClassConstructorDescriptor]

'password' @ [686:13] ==> value-parameter password: String defined in net.corda.node.services.messaging.NodeLoginModule.authenticateRpcUser[ValueParameterDescriptorImpl]

'rpcUser' @ [686:25] ==> val rpcUser: User defined in net.corda.node.services.messaging.NodeLoginModule.authenticateRpcUser[LocalVariableDescriptor]

'password' @ [686:33] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'FailedLoginException' @ [689:19] ==> public constructor FailedLoginException(p0: (String..String?)) defined in javax.security.auth.login.FailedLoginException[JavaClassConstructorDescriptor]

'username' @ [689:60] ==> value-parameter username: String defined in net.corda.node.services.messaging.NodeLoginModule.authenticateRpcUser[ValueParameterDescriptorImpl]

'principals' @ [691:9] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'RolePrincipal' @ [691:23] ==> public constructor RolePrincipal(p0: (String..String?)) defined in org.apache.activemq.artemis.spi.core.security.jaas.RolePrincipal[JavaClassConstructorDescriptor]

'RPC_ROLE' @ [691:37] ==> public const final val RPC_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'principals' @ [692:9] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'RolePrincipal' @ [692:23] ==> public constructor RolePrincipal(p0: (String..String?)) defined in org.apache.activemq.artemis.spi.core.security.jaas.RolePrincipal[JavaClassConstructorDescriptor]

'RPCApi' @ [692:40] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_QUEUE_NAME_PREFIX' @ [692:47] ==> public final val RPC_CLIENT_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'username' @ [692:78] ==> value-parameter username: String defined in net.corda.node.services.messaging.NodeLoginModule.authenticateRpcUser[ValueParameterDescriptorImpl]

'username' @ [693:16] ==> value-parameter username: String defined in net.corda.node.services.messaging.NodeLoginModule.authenticateRpcUser[ValueParameterDescriptorImpl]

'require' @ [697:28] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'certificates' @ [697:36] ==> value-parameter certificates: Array<X509Certificate>? defined in net.corda.node.services.messaging.NodeLoginModule.determineUserRole[ValueParameterDescriptorImpl]

'when (username) {
            PEER_USER -> {
                requireTls()
                PEER_ROLE
            }
            NODE_USER -> {
                requireTls()
                NODE_ROLE
            }
            VerifierApi.VERIFIER_USERNAME -> {
                requireTls()
                VERIFIER_ROLE
            }
            else -> {
                // Assume they're an RPC user if its from a non-ssl connection
                if (certificates == null) {
                    RPC_ROLE
                } else {
                    null
                }
            }
        }' @ [698:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?, entry3: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'username' @ [698:22] ==> value-parameter username: String defined in net.corda.node.services.messaging.NodeLoginModule.determineUserRole[ValueParameterDescriptorImpl]

'PEER_USER' @ [699:13] ==> public const final val PEER_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[PropertyImportedFromObject]

'requireTls' @ [700:17] ==> local final fun requireTls(): Unit defined in net.corda.node.services.messaging.NodeLoginModule.determineUserRole[SimpleFunctionDescriptorImpl]

'PEER_ROLE' @ [701:17] ==> public const final val PEER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'NODE_USER' @ [703:13] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[PropertyImportedFromObject]

'requireTls' @ [704:17] ==> local final fun requireTls(): Unit defined in net.corda.node.services.messaging.NodeLoginModule.determineUserRole[SimpleFunctionDescriptorImpl]

'NODE_ROLE' @ [705:17] ==> public const final val NODE_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'VerifierApi' @ [707:13] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'VERIFIER_USERNAME' @ [707:25] ==> public final val VERIFIER_USERNAME: String defined in net.corda.nodeapi.VerifierApi[DeserializedPropertyDescriptor]

'requireTls' @ [708:17] ==> local final fun requireTls(): Unit defined in net.corda.node.services.messaging.NodeLoginModule.determineUserRole[SimpleFunctionDescriptorImpl]

'VERIFIER_ROLE' @ [709:17] ==> public const final val VERIFIER_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'if (certificates == null) {
                    RPC_ROLE
                } else {
                    null
                }' @ [713:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'certificates' @ [713:21] ==> value-parameter certificates: Array<X509Certificate>? defined in net.corda.node.services.messaging.NodeLoginModule.determineUserRole[ValueParameterDescriptorImpl]

'RPC_ROLE' @ [714:21] ==> public const final val RPC_ROLE: String defined in net.corda.node.services.messaging.NodeLoginModule.Companion[PropertyDescriptorImpl]

'loginSucceeded' @ [723:22] ==> private final var loginSucceeded: Boolean defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'result' @ [724:13] ==> val result: Boolean defined in net.corda.node.services.messaging.NodeLoginModule.commit[LocalVariableDescriptor]

'subject' @ [725:13] ==> private final lateinit var subject: Subject defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'principals' @ [725:21] ==> public final val Subject.principals: (MutableSet<(Principal..Principal?)>..Set<(Principal..Principal?)>?)[MyPropertyDescriptor]

'addAll' @ [725:32] ==> public abstract fun addAll(elements: Collection<(Principal..Principal?)>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'principals' @ [725:39] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'clear' @ [727:9] ==> private final fun clear(): Unit defined in net.corda.node.services.messaging.NodeLoginModule[SimpleFunctionDescriptorImpl]

'result' @ [728:16] ==> val result: Boolean defined in net.corda.node.services.messaging.NodeLoginModule.commit[LocalVariableDescriptor]

'clear' @ [732:9] ==> private final fun clear(): Unit defined in net.corda.node.services.messaging.NodeLoginModule[SimpleFunctionDescriptorImpl]

'subject' @ [737:9] ==> private final lateinit var subject: Subject defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'principals' @ [737:17] ==> public final val Subject.principals: (MutableSet<(Principal..Principal?)>..Set<(Principal..Principal?)>?)[MyPropertyDescriptor]

'removeAll' @ [737:28] ==> public abstract fun removeAll(elements: Collection<(Principal..Principal?)>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'principals' @ [737:38] ==> private final val principals: ArrayList<Principal> defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

'loginSucceeded' @ [742:9] ==> private final var loginSucceeded: Boolean defined in net.corda.node.services.messaging.NodeLoginModule[PropertyDescriptorImpl]

