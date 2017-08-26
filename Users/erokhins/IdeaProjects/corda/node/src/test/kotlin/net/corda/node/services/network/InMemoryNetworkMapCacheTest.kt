'Before' @ [18:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [20:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'MockNetwork' @ [20:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'After' @ [23:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [25:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'stopNodes' @ [25:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [28:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [30:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'createSomeNodes' @ [30:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodes' @ [31:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.registerWithNetwork[LocalVariableDescriptor]

'mapNode' @ [31:24] ==> public final val mapNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodes' @ [32:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.registerWithNetwork[LocalVariableDescriptor]

'partyNodes' @ [32:24] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'n1' @ [33:22] ==> val n1: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.registerWithNetwork[LocalVariableDescriptor]

'services' @ [33:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [33:34] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'addMapService' @ [33:50] ==> public abstract fun addMapService(network: MessagingService, networkMapAddress: SingleMessageRecipient, subscribe: Boolean, ifChangedSinceVer: Int? = ...): CordaFuture<Unit> defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'n1' @ [33:64] ==> val n1: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.registerWithNetwork[LocalVariableDescriptor]

'network' @ [33:67] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'n0' @ [33:76] ==> val n0: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.registerWithNetwork[LocalVariableDescriptor]

'network' @ [33:79] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [33:87] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [34:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'runNetwork' @ [34:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [35:9] ==> val future: CordaFuture<Unit> defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.registerWithNetwork[LocalVariableDescriptor]

'getOrThrow' @ [35:16] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'Test' @ [38:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'valueOf' @ [40:34] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'mockNet' @ [41:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'createNode' @ [41:29] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'DefaultFactory' @ [41:66] ==> public object DefaultFactory : MockNetwork.Factory<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[FakeCallableDescriptorForObject]

'ALICE' @ [41:94] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [41:100] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'entropy' @ [41:120] ==> val entropy: (BigInteger..BigInteger?) defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'ServiceInfo' @ [41:150] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [41:162] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [41:180] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'mockNet' @ [42:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'createNode' @ [42:29] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'DefaultFactory' @ [42:66] ==> public object DefaultFactory : MockNetwork.Factory<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[FakeCallableDescriptorForObject]

'BOB' @ [42:94] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [42:98] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'entropy' @ [42:118] ==> val entropy: (BigInteger..BigInteger?) defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'ServiceInfo' @ [42:148] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [42:160] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [42:178] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'assertEquals' @ [43:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party, actual: Party, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party

'nodeA' @ [43:22] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'info' @ [43:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [43:33] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'nodeB' @ [43:48] ==> val nodeB: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'info' @ [43:54] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [43:59] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [45:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'runNetwork' @ [45:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [48:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: NodeInfo?, actual: NodeInfo?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> NodeInfo?

'nodeA' @ [48:22] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'services' @ [48:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [48:37] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getNodeByLegalIdentityKey' @ [48:53] ==> public abstract fun getNodeByLegalIdentityKey(identityKey: PublicKey): NodeInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [48:79] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'info' @ [48:85] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [48:90] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [48:104] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'nodeA' @ [48:116] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'info' @ [48:122] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'nodeA' @ [50:9] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'database' @ [50:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [50:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'nodeA' @ [51:13] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'services' @ [51:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [51:28] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'addNode' @ [51:44] ==> public abstract fun addNode(node: NodeInfo): Unit defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [51:52] ==> val nodeB: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'info' @ [51:58] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'assertEquals' @ [54:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: NodeInfo?, actual: NodeInfo?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> NodeInfo?

'nodeA' @ [54:22] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'services' @ [54:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [54:37] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getNodeByLegalIdentityKey' @ [54:53] ==> public abstract fun getNodeByLegalIdentityKey(identityKey: PublicKey): NodeInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [54:79] ==> val nodeA: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'info' @ [54:85] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [54:90] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [54:104] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'nodeB' @ [54:116] ==> val nodeB: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.`key collision`[LocalVariableDescriptor]

'info' @ [54:122] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [57:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [59:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'createSomeNodes' @ [59:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodes' @ [60:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

'mapNode' @ [60:24] ==> public final val mapNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodes' @ [61:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

'partyNodes' @ [61:24] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'n0' @ [62:43] ==> val n0: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

'services' @ [62:46] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [62:55] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'n1' @ [63:24] ==> val n1: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

'info' @ [63:27] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'mockNet' @ [65:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest[PropertyDescriptorImpl]

'runNetwork' @ [65:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node0Cache' @ [66:22] ==> val node0Cache: NetworkMapCache defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

'getNodeByLegalIdentity' @ [66:33] ==> public abstract fun getNodeByLegalIdentity(party: AbstractParty): NodeInfo? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'n1' @ [66:56] ==> val n1: MockNetwork.MockNode defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

'info' @ [66:59] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [66:64] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'assertEquals' @ [67:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: NodeInfo?, actual: NodeInfo?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> NodeInfo?

'expected' @ [67:22] ==> val expected: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

'actual' @ [67:32] ==> val actual: NodeInfo? defined in net.corda.node.services.network.InMemoryNetworkMapCacheTest.getNodeByLegalIdentity[LocalVariableDescriptor]

