'freeLocalHostAndPort' @ [32:83] ==> public fun freeLocalHostAndPort(): NetworkHostAndPort defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'freeLocalHostAndPort' @ [33:51] ==> public fun freeLocalHostAndPort(): NetworkHostAndPort defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'RPCUserServiceImpl' @ [36:23] ==> public constructor RPCUserServiceImpl(users: List<User>) defined in net.corda.node.services.RPCUserServiceImpl[DeserializedClassConstructorDescriptor]

'config' @ [36:42] ==> public final val config: NodeConfiguration defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'rpcUsers' @ [36:49] ==> public abstract val rpcUsers: List<User> defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'MonitoringService' @ [37:29] ==> public constructor MonitoringService(metrics: MetricRegistry) defined in net.corda.node.services.api.MonitoringService[DeserializedClassConstructorDescriptor]

'MetricRegistry' @ [37:47] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'generateKeyPair' @ [38:29] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'InMemoryIdentityService' @ [39:44] ==> public constructor InMemoryIdentityService(identities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509Certificate, vararg caCertificates: X509Certificate) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'trustRoot' @ [39:80] ==> value-parameter trustRoot: X509Certificate defined in net.corda.testing.node.SimpleNode.<init>[ValueParameterDescriptorImpl]

'configureDatabase' @ [40:38] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'config' @ [40:56] ==> public final val config: NodeConfiguration defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'dataSourceProperties' @ [40:63] ==> public abstract val dataSourceProperties: Properties defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [40:85] ==> public final val config: NodeConfiguration defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'database' @ [40:92] ==> public abstract val database: Properties? defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'NodeSchemaService' @ [40:104] ==> public constructor NodeSchemaService(customSchemas: Set<MappedSchema> = ...) defined in net.corda.node.services.schema.NodeSchemaService[DeserializedClassConstructorDescriptor]

'InMemoryIdentityService' @ [40:129] ==> public constructor InMemoryIdentityService(identities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509Certificate, vararg caCertificates: X509Certificate) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'trustRoot' @ [40:165] ==> value-parameter trustRoot: X509Certificate defined in net.corda.testing.node.SimpleNode.<init>[ValueParameterDescriptorImpl]

'E2ETestKeyManagementService' @ [41:44] ==> public constructor E2ETestKeyManagementService(identityService: IdentityService, initialKeys: Set<KeyPair>) defined in net.corda.node.services.keys.E2ETestKeyManagementService[DeserializedClassConstructorDescriptor]

'identityService' @ [41:72] ==> public final val identityService: IdentityService defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'setOf' @ [41:89] ==> public fun <T> setOf(element: KeyPair): Set<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'identity' @ [41:95] ==> public final val identity: KeyPair defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'ServiceAffinityExecutor' @ [42:20] ==> public constructor ServiceAffinityExecutor(threadName: String, numThreads: Int) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedClassConstructorDescriptor]

'config' @ [42:44] ==> public final val config: NodeConfiguration defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'myLegalName' @ [42:51] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'commonName' @ [42:63] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'ArtemisMessagingServer' @ [44:18] ==> public constructor ArtemisMessagingServer(config: NodeConfiguration, p2pPort: Int, rpcPort: Int?, networkMapCache: NetworkMapCache, userService: RPCUserService) defined in net.corda.node.services.messaging.ArtemisMessagingServer[DeserializedClassConstructorDescriptor]

'config' @ [44:41] ==> public final val config: NodeConfiguration defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'address' @ [44:49] ==> public final val address: NetworkHostAndPort defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'port' @ [44:57] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'rpcAddress' @ [44:63] ==> value-parameter rpcAddress: NetworkHostAndPort = ... defined in net.corda.testing.node.SimpleNode.<init>[ValueParameterDescriptorImpl]

'port' @ [44:74] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'InMemoryNetworkMapCache' @ [44:80] ==> public constructor InMemoryNetworkMapCache(serviceHub: ServiceHub?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[DeserializedClassConstructorDescriptor]

'userService' @ [44:124] ==> public final val userService: RPCUserServiceImpl defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'openFuture' @ [45:40] ==> public fun <V> openFuture(): OpenFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'database' @ [46:19] ==> public final val database: CordaPersistence defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'transaction' @ [46:28] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> NodeMessagingClient): NodeMessagingClient defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeMessagingClient

'NodeMessagingClient' @ [47:9] ==> public constructor NodeMessagingClient(config: NodeConfiguration, versionInfo: VersionInfo, serverAddress: NetworkHostAndPort, myIdentity: PublicKey?, nodeExecutor: AffinityExecutor.ServiceAffinityExecutor, database: CordaPersistence, networkMapRegistrationFuture: CordaFuture<Unit>, monitoringService: MonitoringService, advertisedAddress: NetworkHostAndPort = ...) defined in net.corda.node.services.messaging.NodeMessagingClient[DeserializedClassConstructorDescriptor]

'config' @ [48:17] ==> public final val config: NodeConfiguration defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'MOCK_VERSION_INFO' @ [49:17] ==> public val MOCK_VERSION_INFO: VersionInfo defined in net.corda.testing.node in file MockServices.kt[PropertyDescriptorImpl]

'address' @ [50:17] ==> public final val address: NetworkHostAndPort defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'identity' @ [51:17] ==> public final val identity: KeyPair defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'public' @ [51:26] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'executor' @ [52:17] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'database' @ [53:17] ==> public final val database: CordaPersistence defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'networkMapRegistrationFuture' @ [54:17] ==> public final val networkMapRegistrationFuture: OpenFuture<Unit> defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'monitoringService' @ [55:17] ==> public final val monitoringService: MonitoringService defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'broker' @ [59:9] ==> public final val broker: ArtemisMessagingServer defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'start' @ [59:16] ==> public final fun start(): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[DeserializedSimpleFunctionDescriptor]

'network' @ [60:9] ==> public final val network: NodeMessagingClient defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'start' @ [60:17] ==> public final fun start(rpcOps: RPCOps, userService: RPCUserService): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[DeserializedSimpleFunctionDescriptor]

'userService' @ [64:17] ==> public final val userService: RPCUserServiceImpl defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'thread' @ [65:9] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'config' @ [65:23] ==> public final val config: NodeConfiguration defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'myLegalName' @ [65:30] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'commonName' @ [65:42] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'network' @ [66:13] ==> public final val network: NodeMessagingClient defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'run' @ [66:21] ==> public final fun run(serverControl: ActiveMQServerControl): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[DeserializedSimpleFunctionDescriptor]

'broker' @ [66:25] ==> public final val broker: ArtemisMessagingServer defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'serverControl' @ [66:32] ==> public final val serverControl: ActiveMQServerControl defined in net.corda.node.services.messaging.ArtemisMessagingServer[DeserializedPropertyDescriptor]

'network' @ [71:9] ==> public final val network: NodeMessagingClient defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'stop' @ [71:17] ==> public open fun stop(): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[DeserializedSimpleFunctionDescriptor]

'broker' @ [72:9] ==> public final val broker: ArtemisMessagingServer defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'stop' @ [72:16] ==> public final fun stop(): Unit defined in net.corda.node.services.messaging.ArtemisMessagingServer[DeserializedSimpleFunctionDescriptor]

'database' @ [73:9] ==> public final val database: CordaPersistence defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'close' @ [73:18] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'executor' @ [74:9] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.testing.node.SimpleNode[PropertyDescriptorImpl]

'shutdownNow' @ [74:18] ==> public open fun shutdownNow(): (MutableList<(Runnable..Runnable?)>..List<(Runnable..Runnable?)>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[JavaMethodDescriptor]

