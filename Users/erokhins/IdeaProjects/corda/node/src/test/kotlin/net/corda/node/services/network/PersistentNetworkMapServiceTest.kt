'AbstractNetworkMapServiceTest<PersistentNetworkMapService>' @ [16:41] ==> public constructor AbstractNetworkMapServiceTest<out S : AbstractNetworkMapService>() defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[ClassConstructorDescriptorImpl]
Inferred types:
    <out S : AbstractNetworkMapService> -> PersistentNetworkMapService

'NodeFactory' @ [18:62] ==> private object NodeFactory : MockNetwork.Factory<MockNetwork.MockNode> defined in net.corda.node.services.network.PersistentNetworkMapServiceTest[FakeCallableDescriptorForObject]

'mapServiceNode' @ [21:18] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.PersistentNetworkMapServiceTest[PropertyDescriptorImpl]

'inNodeNetworkMapService' @ [21:33] ==> public final var inNodeNetworkMapService: NetworkMapService? defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'delegate' @ [21:86] ==> public final var delegate: PersistentNetworkMapService defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.SwizzleNetworkMapService[PropertyDescriptorImpl]

'mapServiceNode' @ [24:9] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.PersistentNetworkMapServiceTest[PropertyDescriptorImpl]

'database' @ [24:24] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [24:33] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'mapServiceNode' @ [25:14] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.PersistentNetworkMapServiceTest[PropertyDescriptorImpl]

'inNodeNetworkMapService' @ [25:29] ==> public final var inNodeNetworkMapService: NetworkMapService? defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'swizzle' @ [25:82] ==> public final fun swizzle(): Unit defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.SwizzleNetworkMapService[SimpleFunctionDescriptorImpl]

'MockNode' @ [37:29] ==> public constructor MockNode(config: NodeConfiguration, mockNet: MockNetwork, networkMapAddress: SingleMessageRecipient?, advertisedServices: Set<ServiceInfo>, id: Int, overrideServices: Map<ServiceInfo, KeyPair>?, entropyRoot: BigInteger = ...) defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedClassConstructorDescriptor]

'config' @ [37:38] ==> value-parameter config: NodeConfiguration defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create[ValueParameterDescriptorImpl]

'network' @ [37:46] ==> value-parameter network: MockNetwork defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create[ValueParameterDescriptorImpl]

'networkMapAddr' @ [37:55] ==> value-parameter networkMapAddr: SingleMessageRecipient? defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create[ValueParameterDescriptorImpl]

'advertisedServices' @ [37:71] ==> value-parameter advertisedServices: Set<ServiceInfo> defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create[ValueParameterDescriptorImpl]

'id' @ [37:91] ==> value-parameter id: Int defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create[ValueParameterDescriptorImpl]

'overrideServices' @ [37:95] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create[ValueParameterDescriptorImpl]

'entropyRoot' @ [37:113] ==> value-parameter entropyRoot: BigInteger defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create[ValueParameterDescriptorImpl]

'inNodeNetworkMapService' @ [39:21] ==> public final var inNodeNetworkMapService: NetworkMapService? defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create.<no name provided>[DeserializedPropertyDescriptor]

'SwizzleNetworkMapService' @ [39:47] ==> public constructor SwizzleNetworkMapService(services: ServiceHubInternal) defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.SwizzleNetworkMapService[ClassConstructorDescriptorImpl]

'services' @ [39:72] ==> public final val services: ServiceHubInternal defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.NodeFactory.create.<no name provided>[DeserializedPropertyDescriptor]

'PersistentNetworkMapService' @ [50:53] ==> public constructor PersistentNetworkMapService(services: ServiceHubInternal, minimumPlatformVersion: Int) defined in net.corda.node.services.network.PersistentNetworkMapService[DeserializedClassConstructorDescriptor]

'services' @ [50:81] ==> public final val services: ServiceHubInternal defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.SwizzleNetworkMapService[PropertyDescriptorImpl]

'delegate' @ [53:13] ==> public final var delegate: PersistentNetworkMapService defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.SwizzleNetworkMapService[PropertyDescriptorImpl]

'unregisterNetworkHandlers' @ [53:22] ==> public final fun unregisterNetworkHandlers(): Unit defined in net.corda.node.services.network.PersistentNetworkMapService[DeserializedSimpleFunctionDescriptor]

'delegate' @ [54:13] ==> public final var delegate: PersistentNetworkMapService defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.SwizzleNetworkMapService[PropertyDescriptorImpl]

'PersistentNetworkMapService' @ [54:24] ==> public constructor PersistentNetworkMapService(services: ServiceHubInternal, minimumPlatformVersion: Int) defined in net.corda.node.services.network.PersistentNetworkMapService[DeserializedClassConstructorDescriptor]

'services' @ [54:52] ==> public final val services: ServiceHubInternal defined in net.corda.node.services.network.PersistentNetworkMapServiceTest.SwizzleNetworkMapService[PropertyDescriptorImpl]

