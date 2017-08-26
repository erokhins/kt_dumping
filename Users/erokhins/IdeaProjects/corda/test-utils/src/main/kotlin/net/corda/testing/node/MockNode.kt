'InMemoryMessagingNetwork' @ [61:19] ==> public companion object defined in net.corda.testing.node.InMemoryMessagingNetwork[FakeCallableDescriptorForObject]

'Random' @ [61:74] ==> public constructor Random(random: SplittableRandom = ...) defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.Random[ClassConstructorDescriptorImpl]

'DefaultFactory' @ [62:72] ==> public object DefaultFactory : MockNetwork.Factory<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[FakeCallableDescriptorForObject]

'newFileSystem' @ [66:36] ==> public open fun newFileSystem(p0: (Configuration..Configuration?)): (FileSystem..FileSystem?) defined in com.google.common.jimfs.Jimfs[JavaMethodDescriptor]

'unix' @ [66:50] ==> public open fun unix(): (Configuration..Configuration?) defined in com.google.common.jimfs.Configuration[JavaMethodDescriptor]

'ReusableLatch' @ [67:29] ==> public constructor ReusableLatch() defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaClassConstructorDescriptor]

'InMemoryMessagingNetwork' @ [68:28] ==> public constructor InMemoryMessagingNetwork(sendManuallyPumped: Boolean, servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., messagesInFlight: ReusableLatch = ...) defined in net.corda.testing.node.InMemoryMessagingNetwork[ClassConstructorDescriptorImpl]

'networkSendManuallyPumped' @ [68:53] ==> private final val networkSendManuallyPumped: Boolean defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'servicePeerAllocationStrategy' @ [68:80] ==> value-parameter servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ... defined in net.corda.testing.node.MockNetwork.<init>[ValueParameterDescriptorImpl]

'busyLatch' @ [68:111] ==> private final val busyLatch: ReusableLatch defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'random63BitValue' @ [70:29] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'mutableListOf' @ [71:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'mutableListOf' @ [72:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<MockNetwork.MockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'_nodes' @ [74:39] ==> private final val _nodes: MutableList<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'initialiseSerialization' @ [77:13] ==> private final val initialiseSerialization: Boolean defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'initialiseTestSerialization' @ [77:38] ==> public fun initialiseTestSerialization(): Unit defined in net.corda.testing in file SerializationTestHelpers.kt[SimpleFunctionDescriptorImpl]

'filesystem' @ [78:9] ==> private final val filesystem: (FileSystem..FileSystem?) defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'getPath' @ [78:20] ==> public abstract fun getPath(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.FileSystem[JavaMethodDescriptor]

'createDirectory' @ [78:38] ==> public fun Path.createDirectory(vararg attrs: FileAttribute<*>): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'MockNode' @ [98:20] ==> public constructor MockNode(config: NodeConfiguration, mockNet: MockNetwork, networkMapAddress: SingleMessageRecipient?, advertisedServices: Set<ServiceInfo>, id: Int, overrideServices: Map<ServiceInfo, KeyPair>?, entropyRoot: BigInteger = ...) defined in net.corda.testing.node.MockNetwork.MockNode[ClassConstructorDescriptorImpl]

'config' @ [98:29] ==> value-parameter config: NodeConfiguration defined in net.corda.testing.node.MockNetwork.DefaultFactory.create[ValueParameterDescriptorImpl]

'network' @ [98:37] ==> value-parameter network: MockNetwork defined in net.corda.testing.node.MockNetwork.DefaultFactory.create[ValueParameterDescriptorImpl]

'networkMapAddr' @ [98:46] ==> value-parameter networkMapAddr: SingleMessageRecipient? defined in net.corda.testing.node.MockNetwork.DefaultFactory.create[ValueParameterDescriptorImpl]

'advertisedServices' @ [98:62] ==> value-parameter advertisedServices: Set<ServiceInfo> defined in net.corda.testing.node.MockNetwork.DefaultFactory.create[ValueParameterDescriptorImpl]

'id' @ [98:82] ==> value-parameter id: Int defined in net.corda.testing.node.MockNetwork.DefaultFactory.create[ValueParameterDescriptorImpl]

'overrideServices' @ [98:86] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.testing.node.MockNetwork.DefaultFactory.create[ValueParameterDescriptorImpl]

'entropyRoot' @ [98:104] ==> value-parameter entropyRoot: BigInteger defined in net.corda.testing.node.MockNetwork.DefaultFactory.create[ValueParameterDescriptorImpl]

'AtomicInteger' @ [105:35] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'ServiceAffinityExecutor' @ [106:47] ==> public constructor ServiceAffinityExecutor(threadName: String, numThreads: Int) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedClassConstructorDescriptor]

'sharedUserCount' @ [110:17] ==> private final val sharedUserCount: AtomicInteger defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'decrementAndGet' @ [110:33] ==> public final fun decrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'super' @ [111:17] ==> <this> defined in net.corda.testing.node.MockNetwork.sharedServerThread.<no name provided>[LazyClassReceiverParameterDescriptor]

'shutdown' @ [111:23] ==> public open fun shutdown(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[JavaMethodDescriptor]

'if (!isShutdown) {
                flush()
                return true
            } else {
                return super.awaitTermination(timeout, unit)
            }' @ [116:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [116:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isShutdown' @ [116:18] ==> public final val <no name provided>.isShutdown: Boolean[MyPropertyDescriptor]

'flush' @ [117:17] ==> public open fun flush(): Unit defined in net.corda.testing.node.MockNetwork.sharedServerThread.<no name provided>[DeserializedSimpleFunctionDescriptor]

'super' @ [120:24] ==> <this> defined in net.corda.testing.node.MockNetwork.sharedServerThread.<no name provided>[LazyClassReceiverParameterDescriptor]

'awaitTermination' @ [120:30] ==> public open fun awaitTermination(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[JavaMethodDescriptor]

'timeout' @ [120:47] ==> value-parameter timeout: Long defined in net.corda.testing.node.MockNetwork.sharedServerThread.<no name provided>.awaitTermination[ValueParameterDescriptorImpl]

'unit' @ [120:56] ==> value-parameter unit: TimeUnit defined in net.corda.testing.node.MockNetwork.sharedServerThread.<no name provided>.awaitTermination[ValueParameterDescriptorImpl]

'valueOf' @ [137:66] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'random63BitValue' @ [137:74] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'AbstractNode' @ [138:13] ==> public constructor AbstractNode(configuration: NodeConfiguration, advertisedServices: Set<ServiceInfo>, platformClock: Clock, busyNodeLatch: ReusableLatch = ...) defined in net.corda.node.internal.AbstractNode[DeserializedClassConstructorDescriptor]

'config' @ [138:26] ==> value-parameter config: NodeConfiguration defined in net.corda.testing.node.MockNetwork.MockNode.<init>[ValueParameterDescriptorImpl]

'advertisedServices' @ [138:34] ==> value-parameter advertisedServices: Set<ServiceInfo> defined in net.corda.testing.node.MockNetwork.MockNode.<init>[ValueParameterDescriptorImpl]

'TestClock' @ [138:54] ==> public constructor TestClock(delegateClock: Clock = ...) defined in net.corda.testing.node.TestClock[ClassConstructorDescriptorImpl]

'mockNet' @ [138:67] ==> value-parameter mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode.<init>[ValueParameterDescriptorImpl]

'busyLatch' @ [138:75] ==> private final val busyLatch: ReusableLatch defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'entropyRoot' @ [139:23] ==> public final val entropyRoot: BigInteger defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'loggerFor' @ [140:36] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MockNode

'if (mockNet.threadPerNode)
                    ServiceAffinityExecutor("Mock node $id thread", 1)
                else {
                    mockNet.sharedUserCount.incrementAndGet()
                    mockNet.sharedServerThread
                }' @ [143:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AffinityExecutor, elseBranch: AffinityExecutor): AffinityExecutor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AffinityExecutor

'mockNet' @ [143:21] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'threadPerNode' @ [143:29] ==> private final val threadPerNode: Boolean defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'ServiceAffinityExecutor' @ [144:21] ==> public constructor ServiceAffinityExecutor(threadName: String, numThreads: Int) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedClassConstructorDescriptor]

'id' @ [144:57] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'mockNet' @ [146:21] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'sharedUserCount' @ [146:29] ==> private final val sharedUserCount: AtomicInteger defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'incrementAndGet' @ [146:45] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'mockNet' @ [147:21] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'sharedServerThread' @ [147:29] ==> private final val sharedServerThread: <no name provided> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'require' @ [153:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'id' @ [153:21] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'+' @ [153:32] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'id' @ [153:83] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'mockNet' @ [154:20] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'messagingNetwork' @ [154:28] ==> public final val messagingNetwork: InMemoryMessagingNetwork defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'createNodeWithID' @ [154:45] ==> public final fun createNodeWithID(manuallyPumped: Boolean, id: Int, executor: AffinityExecutor, advertisedServices: List<ServiceEntry>, description: X500Name = ..., database: CordaPersistence): MessagingServiceBuilder<InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'!' @ [155:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [155:22] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'threadPerNode' @ [155:30] ==> private final val threadPerNode: Boolean defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'id' @ [156:21] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'serverThread' @ [157:21] ==> protected open val serverThread: AffinityExecutor defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'makeServiceEntries' @ [158:21] ==> protected open fun makeServiceEntries(): List<ServiceEntry> defined in net.corda.testing.node.MockNetwork.MockNode[SimpleFunctionDescriptorImpl]

'configuration' @ [159:21] ==> public open val configuration: NodeConfiguration defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myLegalName' @ [159:35] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'database' @ [160:21] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'start' @ [161:22] ==> public abstract fun start(): ListenableFuture<out InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.node.services.messaging.MessagingServiceBuilder[DeserializedSimpleFunctionDescriptor]

'getOrThrow' @ [162:22] ==> public fun <V> Future<out (InMemoryMessagingNetwork.InMemoryMessaging..InMemoryMessagingNetwork.InMemoryMessaging?)>.getOrThrow(timeout: Duration? = ...): (InMemoryMessagingNetwork.InMemoryMessaging..InMemoryMessagingNetwork.InMemoryMessaging?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging..net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging?)

'listOf' @ [168:58] ==> public fun <T> listOf(vararg elements: X509Certificate?): List<X509Certificate?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate?

'legalIdentity' @ [168:65] ==> value-parameter legalIdentity: PartyAndCertificate defined in net.corda.testing.node.MockNetwork.MockNode.makeIdentityService[ValueParameterDescriptorImpl]

'certificate' @ [168:79] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'cert' @ [168:91] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'clientCa' @ [168:97] ==> value-parameter clientCa: CertificateAndKeyPair? defined in net.corda.testing.node.MockNetwork.MockNode.makeIdentityService[ValueParameterDescriptorImpl]

'certificate' @ [168:107] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'cert' @ [168:120] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'filterNotNull' @ [169:22] ==> public fun <T : Any> Iterable<X509Certificate?>.filterNotNull(): List<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> X509Certificate

'toTypedArray' @ [170:22] ==> public inline fun <reified T> Collection<X509Certificate>.toTypedArray(): Array<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> X509Certificate

'InMemoryIdentityService' @ [171:20] ==> public constructor InMemoryIdentityService(identities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509Certificate, vararg caCertificates: X509Certificate) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'mockNet' @ [171:45] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'identities' @ [171:53] ==> private final val identities: MutableList<PartyAndCertificate> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'info' @ [171:66] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [171:71] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'toSet' @ [171:93] ==> public fun <T> Iterable<PartyAndCertificate>.toSet(): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'trustRoot' @ [172:33] ==> value-parameter trustRoot: X509Certificate defined in net.corda.testing.node.MockNetwork.MockNode.makeIdentityService[ValueParameterDescriptorImpl]

'caCertificates' @ [172:62] ==> val caCertificates: Array<X509Certificate> defined in net.corda.testing.node.MockNetwork.MockNode.makeIdentityService[LocalVariableDescriptor]

'E2ETestKeyManagementService' @ [176:20] ==> public constructor E2ETestKeyManagementService(identityService: IdentityService, initialKeys: Set<KeyPair>) defined in net.corda.node.services.keys.E2ETestKeyManagementService[DeserializedClassConstructorDescriptor]

'identityService' @ [176:48] ==> value-parameter identityService: IdentityService defined in net.corda.testing.node.MockNetwork.MockNode.makeKeyManagementService[ValueParameterDescriptorImpl]

'partyKeys' @ [176:65] ==> protected final val partyKeys: MutableSet<KeyPair> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'overrideServices' @ [176:78] ==> public final val overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'values' @ [176:96] ==> public abstract val values: Collection<KeyPair> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'emptySet' @ [176:106] ==> public fun <T> emptySet(): Set<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'inNodeNetworkMapService' @ [184:13] ==> public final var inNodeNetworkMapService: NetworkMapService? defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'InMemoryNetworkMapService' @ [184:39] ==> public constructor InMemoryNetworkMapService(services: ServiceHubInternal, minimumPlatformVersion: Int) defined in net.corda.node.services.network.InMemoryNetworkMapService[DeserializedClassConstructorDescriptor]

'services' @ [184:65] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'platformVersion' @ [184:75] ==> protected open val platformVersion: Int defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'super' @ [188:34] ==> <this> defined in net.corda.testing.node.MockNetwork.MockNode[LazyClassReceiverParameterDescriptor]

'makeServiceEntries' @ [188:40] ==> protected open fun makeServiceEntries(): List<ServiceEntry> defined in net.corda.node.internal.AbstractNode[DeserializedSimpleFunctionDescriptor]

'if (overrideServices == null) {
                defaultEntries
            } else {
                defaultEntries.map {
                    val override = overrideServices[it.info]
                    if (override != null) {
                        // TODO: Store the key
                        ServiceEntry(it.info, getTestPartyAndCertificate(it.identity.name, override.public))
                    } else {
                        it
                    }
                }
            }' @ [189:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ServiceEntry>, elseBranch: List<ServiceEntry>): List<ServiceEntry>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ServiceEntry>

'overrideServices' @ [189:24] ==> public final val overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'defaultEntries' @ [190:17] ==> val defaultEntries: List<ServiceEntry> defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries[LocalVariableDescriptor]

'defaultEntries' @ [192:17] ==> val defaultEntries: List<ServiceEntry> defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries[LocalVariableDescriptor]

'map' @ [192:32] ==> public inline fun <T, R> Iterable<ServiceEntry>.map(transform: (ServiceEntry) -> ServiceEntry): List<ServiceEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry
    <R> -> ServiceEntry

'overrideServices' @ [193:36] ==> public final val overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'it' @ [193:53] ==> value-parameter it: ServiceEntry defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [193:56] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'if (override != null) {
                        // TODO: Store the key
                        ServiceEntry(it.info, getTestPartyAndCertificate(it.identity.name, override.public))
                    } else {
                        it
                    }' @ [194:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ServiceEntry, elseBranch: ServiceEntry): ServiceEntry[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ServiceEntry

'override' @ [194:25] ==> val override: KeyPair? defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries.<anonymous>[LocalVariableDescriptor]

'ServiceEntry' @ [196:25] ==> public constructor ServiceEntry(info: ServiceInfo, identity: PartyAndCertificate) defined in net.corda.core.node.ServiceEntry[DeserializedClassConstructorDescriptor]

'it' @ [196:38] ==> value-parameter it: ServiceEntry defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [196:41] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'getTestPartyAndCertificate' @ [196:47] ==> public fun getTestPartyAndCertificate(name: X500Name, publicKey: PublicKey, trustRoot: CertificateAndKeyPair = ...): PartyAndCertificate defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [196:74] ==> value-parameter it: ServiceEntry defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries.<anonymous>[ValueParameterDescriptorImpl]

'identity' @ [196:77] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'name' @ [196:86] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'override' @ [196:92] ==> val override: KeyPair? defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries.<anonymous>[LocalVariableDescriptor]

'public' @ [196:101] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'it' @ [198:25] ==> value-parameter it: ServiceEntry defined in net.corda.testing.node.MockNetwork.MockNode.makeServiceEntries.<anonymous>[ValueParameterDescriptorImpl]

'counter' @ [206:13] ==> public final var counter: BigInteger defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'counter' @ [206:23] ==> public final var counter: BigInteger defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'add' @ [206:31] ==> public open fun add(p0: (BigInteger..BigInteger?)): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'ONE' @ [206:46] ==> public final val ONE: (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaPropertyDescriptor]

'entropyToKeyPair' @ [207:20] ==> public fun entropyToKeyPair(entropy: BigInteger): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'counter' @ [207:37] ==> public final var counter: BigInteger defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'doneFuture' @ [211:49] ==> public fun <V> doneFuture(value: Unit): CordaFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'Unit' @ [211:60] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'InMemoryTransactionVerifierService' @ [216:57] ==> public constructor InMemoryTransactionVerifierService(numberOfWorkers: Int) defined in net.corda.node.services.transactions.InMemoryTransactionVerifierService[DeserializedClassConstructorDescriptor]

'emptyList' @ [218:38] ==> public fun <T> emptyList(): List<NetworkHostAndPort> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort

'super' @ [221:13] ==> <this> defined in net.corda.testing.node.MockNetwork.MockNode[LazyClassReceiverParameterDescriptor]

'start' @ [221:19] ==> public open fun start(): Unit defined in net.corda.node.internal.AbstractNode[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [222:13] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'identities' @ [222:21] ==> private final val identities: MutableList<PartyAndCertificate> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'add' @ [222:32] ==> public abstract fun add(element: PartyAndCertificate): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'info' @ [222:36] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [222:41] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'super' @ [227:36] ==> <this> defined in net.corda.testing.node.MockNetwork.MockNode[LazyClassReceiverParameterDescriptor]

'pluginRegistries' @ [227:42] ==> public open val pluginRegistries: List<CordaPluginRegistry> defined in net.corda.node.internal.AbstractNode[DeserializedPropertyDescriptor]

'toMutableList' @ [227:59] ==> public fun <T> Collection<CordaPluginRegistry>.toMutableList(): MutableList<CordaPluginRegistry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaPluginRegistry

'testPluginRegistries' @ [229:21] ==> public final val testPluginRegistries: MutableList<CordaPluginRegistry> defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'Suppress' @ [233:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'findMyLocation' @ [233:65] ==> public open fun findMyLocation(): WorldMapLocation? defined in net.corda.testing.node.MockNetwork.MockNode[SimpleFunctionDescriptorImpl]

'network' @ [236:21] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'pumpReceive' @ [236:76] ==> public final fun pumpReceive(block: Boolean): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'block' @ [236:88] ==> value-parameter block: Boolean = ... defined in net.corda.testing.node.MockNetwork.MockNode.pumpReceive[ValueParameterDescriptorImpl]

'runOnStop' @ [240:13] ==> protected final val runOnStop: ArrayList<() -> Any?> /* = ArrayList<() -> Any?> */ defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'remove' @ [240:23] ==> @InlineOnly public inline fun <@OnlyInputTypes T> MutableCollection<out (() -> Any?)?>.remove(element: (() -> Any?)?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Function0<Any?>?

'dbCloser' @ [240:30] ==> protected final var dbCloser: (() -> Any?)? defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'dbCloser' @ [244:13] ==> protected final var dbCloser: (() -> Any?)? defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'invoke' @ [244:23] ==> public abstract operator fun invoke(): Any? defined in kotlin.Function0[FunctionInvokeDescriptor]

'dbCloser' @ [245:13] ==> protected final var dbCloser: (() -> Any?)? defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'acceptableLiveFiberCountOnStop' @ [251:62] ==> public final var acceptableLiveFiberCountOnStop: Int defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'type' @ [254:17] ==> value-parameter type: ServiceType defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService[ValueParameterDescriptorImpl]

'BFTNonValidatingNotaryService' @ [254:25] ==> public companion object defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [254:55] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'super' @ [254:68] ==> <this> defined in net.corda.testing.node.MockNetwork.MockNode[LazyClassReceiverParameterDescriptor]

'makeCoreNotaryService' @ [254:74] ==> protected open fun makeCoreNotaryService(type: ServiceType): NotaryService? defined in net.corda.node.internal.AbstractNode[DeserializedSimpleFunctionDescriptor]

'type' @ [254:96] ==> value-parameter type: ServiceType defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService[ValueParameterDescriptorImpl]

'BFTNonValidatingNotaryService' @ [255:20] ==> public constructor BFTNonValidatingNotaryService(services: ServiceHubInternal, cluster: BFTSMaRt.Cluster = ...) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[DeserializedClassConstructorDescriptor]

'services' @ [255:50] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'mockNet' @ [257:40] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[PropertyDescriptorImpl]

'nodes' @ [257:48] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'filter' @ [257:54] ==> public inline fun <T> Iterable<MockNetwork.MockNode>.filter(predicate: (MockNetwork.MockNode) -> Boolean): List<MockNetwork.MockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'services' @ [258:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentityKey' @ [258:34] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'it' @ [258:55] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService.<no name provided>.waitUntilAllReplicasHaveInitialized.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [258:58] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'serviceIdentities' @ [258:63] ==> public final fun serviceIdentities(type: ServiceType): List<Party> defined in net.corda.core.node.NodeInfo[DeserializedSimpleFunctionDescriptor]

'BFTNonValidatingNotaryService' @ [258:81] ==> public companion object defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [258:111] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'map' @ [258:117] ==> public inline fun <T, R> Iterable<Party>.map(transform: (Party) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> PublicKey

'it' @ [258:123] ==> value-parameter it: Party defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService.<no name provided>.waitUntilAllReplicasHaveInitialized.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [258:126] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'clusterNodes' @ [260:25] ==> val clusterNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService.<no name provided>.waitUntilAllReplicasHaveInitialized[LocalVariableDescriptor]

'size' @ [260:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'configuration' @ [260:46] ==> public open val configuration: NodeConfiguration defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryClusterAddresses' @ [260:60] ==> public abstract val notaryClusterAddresses: List<NetworkHostAndPort> defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'size' @ [260:83] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'IllegalStateException' @ [261:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'clusterNodes' @ [263:21] ==> val clusterNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService.<no name provided>.waitUntilAllReplicasHaveInitialized[LocalVariableDescriptor]

'forEach' @ [263:34] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'it' @ [264:45] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService.<no name provided>.waitUntilAllReplicasHaveInitialized.<anonymous>[ValueParameterDescriptorImpl]

'smm' @ [264:48] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'findServices' @ [264:52] ==> public final fun findServices(predicate: (Any) -> Boolean): List<Any> defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedSimpleFunctionDescriptor]

'it' @ [264:67] ==> value-parameter it: Any defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService.<no name provided>.waitUntilAllReplicasHaveInitialized.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'single' @ [264:105] ==> public fun <T> List<Any>.single(): Any defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'notaryService' @ [265:25] ==> val notaryService: BFTNonValidatingNotaryService defined in net.corda.testing.node.MockNetwork.MockNode.makeCoreNotaryService.<no name provided>.waitUntilAllReplicasHaveInitialized.<anonymous>[LocalVariableDescriptor]

'waitUntilReplicaHasInitialized' @ [265:39] ==> public final fun waitUntilReplicaHasInitialized(): Unit defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [282:57] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'random63BitValue' @ [282:65] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'createNode' @ [285:16] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'networkMapAddress' @ [285:27] ==> value-parameter networkMapAddress: SingleMessageRecipient? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'forcedID' @ [285:46] ==> value-parameter forcedID: Int? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'defaultFactory' @ [285:56] ==> private final val defaultFactory: MockNetwork.Factory<*> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'start' @ [285:72] ==> value-parameter start: Boolean = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'legalName' @ [285:79] ==> value-parameter legalName: X500Name? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'overrideServices' @ [285:90] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'entropyRoot' @ [285:108] ==> value-parameter entropyRoot: BigInteger = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'advertisedServices' @ [285:122] ==> value-parameter vararg advertisedServices: ServiceInfo defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'configOverrides' @ [285:160] ==> value-parameter configOverrides: (NodeConfiguration) -> Any? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'valueOf' @ [291:57] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'random63BitValue' @ [291:65] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'forcedID' @ [294:18] ==> value-parameter forcedID: Int? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'nextNodeId' @ [294:30] ==> public final var nextNodeId: Int defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'testNodeConfiguration' @ [295:22] ==> public fun testNodeConfiguration(baseDirectory: Path, myLegalName: X500Name): NodeConfiguration defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'baseDirectory' @ [296:33] ==> public final fun baseDirectory(nodeId: Int): Path defined in net.corda.testing.node.MockNetwork[SimpleFunctionDescriptorImpl]

'id' @ [296:47] ==> val id: Int defined in net.corda.testing.node.MockNetwork.createNode[LocalVariableDescriptor]

'createDirectories' @ [296:51] ==> public fun Path.createDirectories(vararg attrs: FileAttribute<*>): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'legalName' @ [297:31] ==> value-parameter legalName: X500Name? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'getTestX509Name' @ [297:44] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'id' @ [297:75] ==> val id: Int defined in net.corda.testing.node.MockNetwork.createNode[LocalVariableDescriptor]

'also' @ [297:81] ==> @InlineOnly @SinceKotlin public inline fun <T> NodeConfiguration.also(block: (NodeConfiguration) -> Unit): NodeConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConfiguration

'whenever' @ [298:13] ==> public fun <T> whenever(methodCall: Properties): OngoingStubbing<Properties> defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Properties

'it' @ [298:22] ==> value-parameter it: NodeConfiguration defined in net.corda.testing.node.MockNetwork.createNode.<anonymous>[ValueParameterDescriptorImpl]

'dataSourceProperties' @ [298:25] ==> public abstract val dataSourceProperties: Properties defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'thenReturn' @ [298:47] ==> public abstract fun thenReturn(p0: (Properties..Properties?)): (OngoingStubbing<(Properties..Properties?)>..OngoingStubbing<(Properties..Properties?)>?) defined in org.mockito.stubbing.OngoingStubbing[JavaMethodDescriptor]

'makeTestDataSourceProperties' @ [298:58] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node in file MockServices.kt[SimpleFunctionDescriptorImpl]

'id' @ [298:95] ==> val id: Int defined in net.corda.testing.node.MockNetwork.createNode[LocalVariableDescriptor]

'networkId' @ [298:104] ==> private final val networkId: Long defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'invoke' @ [299:13] ==> public abstract operator fun invoke(p1: NodeConfiguration): Any? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [299:29] ==> value-parameter it: NodeConfiguration defined in net.corda.testing.node.MockNetwork.createNode.<anonymous>[ValueParameterDescriptorImpl]

'nodeFactory' @ [301:16] ==> value-parameter nodeFactory: MockNetwork.Factory<N> defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'create' @ [301:28] ==> public abstract fun create(config: NodeConfiguration, network: MockNetwork, networkMapAddr: SingleMessageRecipient?, advertisedServices: Set<ServiceInfo>, id: Int, overrideServices: Map<ServiceInfo, KeyPair>?, entropyRoot: BigInteger): N defined in net.corda.testing.node.MockNetwork.Factory[SimpleFunctionDescriptorImpl]

'config' @ [301:35] ==> val config: NodeConfiguration defined in net.corda.testing.node.MockNetwork.createNode[LocalVariableDescriptor]

'this' @ [301:43] ==> <this> defined in net.corda.testing.node.MockNetwork[LazyClassReceiverParameterDescriptor]

'networkMapAddress' @ [301:49] ==> value-parameter networkMapAddress: SingleMessageRecipient? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'advertisedServices' @ [301:68] ==> value-parameter vararg advertisedServices: ServiceInfo defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'toSet' @ [301:87] ==> public fun <T> Array<out ServiceInfo>.toSet(): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'id' @ [301:96] ==> val id: Int defined in net.corda.testing.node.MockNetwork.createNode[LocalVariableDescriptor]

'overrideServices' @ [301:100] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'entropyRoot' @ [301:118] ==> value-parameter entropyRoot: BigInteger = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'apply' @ [301:131] ==> @InlineOnly public inline fun <T> N.apply(block: N.() -> Unit): N defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> N

'start' @ [302:17] ==> value-parameter start: Boolean = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'start' @ [303:17] ==> public open fun start(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[SimpleFunctionDescriptorImpl]

'threadPerNode' @ [304:21] ==> private final val threadPerNode: Boolean defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'networkMapAddress' @ [304:38] ==> value-parameter networkMapAddress: SingleMessageRecipient? = ... defined in net.corda.testing.node.MockNetwork.createNode[ValueParameterDescriptorImpl]

'networkMapRegistrationFuture' @ [304:65] ==> public final val networkMapRegistrationFuture: CordaFuture<Unit> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'getOrThrow' @ [304:94] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'_nodes' @ [306:13] ==> private final val _nodes: MutableList<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'add' @ [306:20] ==> public abstract fun add(element: MockNetwork.MockNode): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [306:24] ==> <this> defined in net.corda.testing.node.MockNetwork.createNode.<anonymous>[ReceiverParameterDescriptorImpl]

'filesystem' @ [310:44] ==> private final val filesystem: (FileSystem..FileSystem?) defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'getPath' @ [310:55] ==> public abstract fun getPath(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.FileSystem[JavaMethodDescriptor]

'nodeId' @ [310:72] ==> value-parameter nodeId: Int defined in net.corda.testing.node.MockNetwork.baseDirectory[ValueParameterDescriptorImpl]

'JvmOverloads' @ [318:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'-' @ [319:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'check' @ [320:9] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [320:15] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'networkSendManuallyPumped' @ [320:16] ==> private final val networkSendManuallyPumped: Boolean defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'messagingNetwork' @ [321:25] ==> public final val messagingNetwork: InMemoryMessagingNetwork defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'endpoints' @ [321:42] ==> public final val endpoints: List<InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'map' @ [321:52] ==> public inline fun <T, R> Iterable<InMemoryMessagingNetwork.InMemoryMessaging>.map(transform: (InMemoryMessagingNetwork.InMemoryMessaging) -> InMemoryMessagingNetwork.MessageTransfer?): List<InMemoryMessagingNetwork.MessageTransfer?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InMemoryMessaging
    <R> -> MessageTransfer?

'it' @ [321:58] ==> value-parameter it: InMemoryMessagingNetwork.InMemoryMessaging defined in net.corda.testing.node.MockNetwork.runNetwork.pumpAll.<anonymous>[ValueParameterDescriptorImpl]

'pumpReceive' @ [321:61] ==> public final fun pumpReceive(block: Boolean): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'if (rounds == -1) {
            while (pumpAll().any { it != null }) {
            }
        } else {
            repeat(rounds) {
                pumpAll()
            }
        }' @ [323:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'rounds' @ [323:13] ==> value-parameter rounds: Int = ... defined in net.corda.testing.node.MockNetwork.runNetwork[ValueParameterDescriptorImpl]

'-' @ [323:23] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'pumpAll' @ [324:20] ==> local final fun pumpAll(): List<InMemoryMessagingNetwork.MessageTransfer?> defined in net.corda.testing.node.MockNetwork.runNetwork[SimpleFunctionDescriptorImpl]

'any' @ [324:30] ==> public inline fun <T> Iterable<InMemoryMessagingNetwork.MessageTransfer?>.any(predicate: (InMemoryMessagingNetwork.MessageTransfer?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageTransfer?

'it' @ [324:36] ==> value-parameter it: InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.testing.node.MockNetwork.runNetwork.<anonymous>[ValueParameterDescriptorImpl]

'repeat' @ [327:13] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rounds' @ [327:20] ==> value-parameter rounds: Int = ... defined in net.corda.testing.node.MockNetwork.runNetwork[ValueParameterDescriptorImpl]

'pumpAll' @ [328:17] ==> local final fun pumpAll(): List<InMemoryMessagingNetwork.MessageTransfer?> defined in net.corda.testing.node.MockNetwork.runNetwork[SimpleFunctionDescriptorImpl]

'JvmOverloads' @ [343:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'defaultFactory' @ [344:75] ==> private final val defaultFactory: MockNetwork.Factory<*> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'DUMMY_NOTARY_KEY' @ [344:117] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'require' @ [345:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nodes' @ [345:17] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'isEmpty' @ [345:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [346:33] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [346:45] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [346:65] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'if (notaryKeyPair != null)
            mapOf(Pair(notaryServiceInfo, notaryKeyPair))
        else
            null' @ [347:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<ServiceInfo, KeyPair>?, elseBranch: Map<ServiceInfo, KeyPair>?): Map<ServiceInfo, KeyPair>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<ServiceInfo, KeyPair>?

'notaryKeyPair' @ [347:34] ==> value-parameter notaryKeyPair: KeyPair? = ... defined in net.corda.testing.node.MockNetwork.createSomeNodes[ValueParameterDescriptorImpl]

'mapOf' @ [348:13] ==> public fun <K, V> mapOf(pair: Pair<ServiceInfo, KeyPair>): Map<ServiceInfo, KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ServiceInfo
    <V> -> KeyPair

'Pair' @ [348:19] ==> public constructor Pair<out A, out B>(first: ServiceInfo, second: KeyPair) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ServiceInfo
    <out B> -> KeyPair

'notaryServiceInfo' @ [348:24] ==> val notaryServiceInfo: ServiceInfo defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'notaryKeyPair' @ [348:43] ==> value-parameter notaryKeyPair: KeyPair? = ... defined in net.corda.testing.node.MockNetwork.createSomeNodes[ValueParameterDescriptorImpl]

'createNode' @ [351:23] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'nodeFactory' @ [351:48] ==> value-parameter nodeFactory: MockNetwork.Factory<*> = ... defined in net.corda.testing.node.MockNetwork.createSomeNodes[ValueParameterDescriptorImpl]

'ServiceInfo' @ [351:82] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [351:94] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [351:112] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'mapNode' @ [352:26] ==> val mapNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'network' @ [352:34] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [352:42] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'createNode' @ [353:26] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'mapAddress' @ [353:37] ==> val mapAddress: SingleMessageRecipient defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'nodeFactory' @ [353:63] ==> value-parameter nodeFactory: MockNetwork.Factory<*> = ... defined in net.corda.testing.node.MockNetwork.createSomeNodes[ValueParameterDescriptorImpl]

'notaryOverride' @ [353:95] ==> val notaryOverride: Map<ServiceInfo, KeyPair>? defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'notaryServiceInfo' @ [353:132] ==> val notaryServiceInfo: ServiceInfo defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'ArrayList' @ [354:21] ==> public final fun <E> <init>(): ArrayList<MockNetwork.MockNode> /* = ArrayList<MockNetwork.MockNode> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> MockNode

'repeat' @ [355:9] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'numPartyNodes' @ [355:16] ==> value-parameter numPartyNodes: Int = ... defined in net.corda.testing.node.MockNetwork.createSomeNodes[ValueParameterDescriptorImpl]

'nodes' @ [356:13] ==> val nodes: ArrayList<MockNetwork.MockNode> /* = ArrayList<MockNetwork.MockNode> */ defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'createPartyNode' @ [356:22] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[SimpleFunctionDescriptorImpl]

'mapAddress' @ [356:38] ==> val mapAddress: SingleMessageRecipient defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'nodes' @ [358:9] ==> val nodes: ArrayList<MockNetwork.MockNode> /* = ArrayList<MockNetwork.MockNode> */ defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'forEach' @ [358:15] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'nodes' @ [359:13] ==> val nodes: ArrayList<MockNetwork.MockNode> /* = ArrayList<MockNetwork.MockNode> */ defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'map' @ [359:19] ==> public inline fun <T, R> Iterable<MockNetwork.MockNode>.map(transform: (MockNetwork.MockNode) -> PartyAndCertificate): List<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode
    <R> -> PartyAndCertificate

'it' @ [359:25] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.createSomeNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [359:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [359:33] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'map' @ [359:56] ==> public inline fun <T, R> Iterable<PartyAndCertificate>.map(transform: (PartyAndCertificate) -> PartyAndCertificate?): List<PartyAndCertificate?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate
    <R> -> PartyAndCertificate?

'itNode' @ [359:60] ==> value-parameter itNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.createSomeNodes.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [359:67] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [359:76] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'BasketOfNodes' @ [361:16] ==> public constructor BasketOfNodes(partyNodes: List<MockNetwork.MockNode>, notaryNode: MockNetwork.MockNode, mapNode: MockNetwork.MockNode) defined in net.corda.testing.node.MockNetwork.BasketOfNodes[ClassConstructorDescriptorImpl]

'nodes' @ [361:30] ==> val nodes: ArrayList<MockNetwork.MockNode> /* = ArrayList<MockNetwork.MockNode> */ defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'notaryNode' @ [361:37] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'mapNode' @ [361:49] ==> val mapNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.createSomeNodes[LocalVariableDescriptor]

'createNode' @ [368:16] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[SimpleFunctionDescriptorImpl]

'networkMapAddress' @ [368:27] ==> value-parameter networkMapAddress: SingleMessageRecipient? = ... defined in net.corda.testing.node.MockNetwork.createNotaryNode[ValueParameterDescriptorImpl]

'legalName' @ [368:58] ==> value-parameter legalName: X500Name? = ... defined in net.corda.testing.node.MockNetwork.createNotaryNode[ValueParameterDescriptorImpl]

'overrideServices' @ [368:88] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? = ... defined in net.corda.testing.node.MockNetwork.createNotaryNode[ValueParameterDescriptorImpl]

'arrayOf' @ [369:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [369:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [369:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [369:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'ServiceInfo' @ [369:84] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [369:96] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [369:120] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'serviceName' @ [369:126] ==> value-parameter serviceName: X500Name? = ... defined in net.corda.testing.node.MockNetwork.createNotaryNode[ValueParameterDescriptorImpl]

'createNode' @ [375:16] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[SimpleFunctionDescriptorImpl]

'networkMapAddress' @ [375:27] ==> value-parameter networkMapAddress: SingleMessageRecipient defined in net.corda.testing.node.MockNetwork.createPartyNode[ValueParameterDescriptorImpl]

'legalName' @ [375:58] ==> value-parameter legalName: X500Name? = ... defined in net.corda.testing.node.MockNetwork.createPartyNode[ValueParameterDescriptorImpl]

'overrideServices' @ [375:88] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? = ... defined in net.corda.testing.node.MockNetwork.createPartyNode[ValueParameterDescriptorImpl]

'Suppress' @ [378:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (msgRecipient) {
            is SingleMessageRecipient -> nodes.single { it.network.myAddress == msgRecipient }
            is InMemoryMessagingNetwork.ServiceHandle -> {
                nodes.filter { it.advertisedServices.any { it == msgRecipient.service.info } }.firstOrNull()
                        ?: throw IllegalArgumentException("Couldn't find node advertising service with info: ${msgRecipient.service.info} ")
            }
            else -> throw IllegalArgumentException("Method not implemented for different type of message recipients")
        }' @ [380:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MockNetwork.MockNode, entry1: MockNetwork.MockNode, entry2: MockNetwork.MockNode): MockNetwork.MockNode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MockNode

'msgRecipient' @ [380:22] ==> value-parameter msgRecipient: MessageRecipients defined in net.corda.testing.node.MockNetwork.addressToNode[ValueParameterDescriptorImpl]

'nodes' @ [381:42] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'single' @ [381:48] ==> public inline fun <T> Iterable<MockNetwork.MockNode>.single(predicate: (MockNetwork.MockNode) -> Boolean): MockNetwork.MockNode defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'it' @ [381:57] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.addressToNode.<anonymous>[ValueParameterDescriptorImpl]

'network' @ [381:60] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [381:68] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'msgRecipient' @ [381:81] ==> value-parameter msgRecipient: MessageRecipients defined in net.corda.testing.node.MockNetwork.addressToNode[ValueParameterDescriptorImpl]

'nodes' @ [383:17] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'filter' @ [383:23] ==> public inline fun <T> Iterable<MockNetwork.MockNode>.filter(predicate: (MockNetwork.MockNode) -> Boolean): List<MockNetwork.MockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'it' @ [383:32] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.addressToNode.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [383:35] ==> public final val advertisedServices: Set<ServiceInfo> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'any' @ [383:54] ==> public inline fun <T> Iterable<ServiceInfo>.any(predicate: (ServiceInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'it' @ [383:60] ==> value-parameter it: ServiceInfo defined in net.corda.testing.node.MockNetwork.addressToNode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'msgRecipient' @ [383:66] ==> value-parameter msgRecipient: MessageRecipients defined in net.corda.testing.node.MockNetwork.addressToNode[ValueParameterDescriptorImpl]

'service' @ [383:79] ==> public final val service: ServiceEntry defined in net.corda.testing.node.InMemoryMessagingNetwork.ServiceHandle[PropertyDescriptorImpl]

'info' @ [383:87] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'firstOrNull' @ [383:96] ==> public fun <T> List<MockNetwork.MockNode>.firstOrNull(): MockNetwork.MockNode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'IllegalArgumentException' @ [384:34] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'msgRecipient' @ [384:112] ==> value-parameter msgRecipient: MessageRecipients defined in net.corda.testing.node.MockNetwork.addressToNode[ValueParameterDescriptorImpl]

'service' @ [384:125] ==> public final val service: ServiceEntry defined in net.corda.testing.node.InMemoryMessagingNetwork.ServiceHandle[PropertyDescriptorImpl]

'info' @ [384:133] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [386:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'require' @ [391:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nodes' @ [391:17] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'isNotEmpty' @ [391:23] ==> @InlineOnly public inline fun <T> Collection<MockNetwork.MockNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'nodes' @ [392:9] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'forEach' @ [392:15] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'!' @ [392:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [392:30] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.startNodes.<anonymous>[ValueParameterDescriptorImpl]

'started' @ [392:33] ==> public final var started: Boolean defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [392:42] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.startNodes.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [392:45] ==> public open fun start(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[SimpleFunctionDescriptorImpl]

'nodes' @ [396:9] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'forEach' @ [396:15] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'it' @ [396:29] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.stopNodes.<anonymous>[ValueParameterDescriptorImpl]

'started' @ [396:32] ==> public final var started: Boolean defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [396:41] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.stopNodes.<anonymous>[ValueParameterDescriptorImpl]

'stop' @ [396:44] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'initialiseSerialization' @ [397:13] ==> private final val initialiseSerialization: Boolean defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'resetTestSerialization' @ [397:38] ==> public fun resetTestSerialization(): Unit defined in net.corda.testing in file SerializationTestHelpers.kt[SimpleFunctionDescriptorImpl]

'busyLatch' @ [403:9] ==> private final val busyLatch: ReusableLatch defined in net.corda.testing.node.MockNetwork[PropertyDescriptorImpl]

'await' @ [403:19] ==> public open fun await(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

