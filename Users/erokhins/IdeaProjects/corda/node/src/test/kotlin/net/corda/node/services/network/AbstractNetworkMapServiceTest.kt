'X500Name' @ [49:35] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'Before' @ [52:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [54:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'MockNetwork' @ [54:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'nodeFactory' @ [54:48] ==> protected abstract val nodeFactory: MockNetwork.Factory<*> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'mapServiceNode' @ [55:9] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'mockNet' @ [55:26] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'createNode' @ [55:34] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'nodeFactory' @ [56:31] ==> protected abstract val nodeFactory: MockNetwork.Factory<*> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'DUMMY_MAP' @ [57:29] ==> public val DUMMY_MAP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [57:39] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'arrayOf' @ [58:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [58:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [58:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [58:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'ServiceInfo' @ [58:84] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [58:96] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [58:116] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'alice' @ [59:9] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'mockNet' @ [59:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'createNode' @ [59:25] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'mapServiceNode' @ [59:36] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [59:51] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [59:59] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeFactory' @ [59:84] ==> protected abstract val nodeFactory: MockNetwork.Factory<*> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'ALICE' @ [59:109] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [59:115] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mockNet' @ [60:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'runNetwork' @ [60:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'lastSerial' @ [61:9] ==> private final var lastSerial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'currentTimeMillis' @ [61:29] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'After' @ [64:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [66:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'stopNodes' @ [66:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [76:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertThat' @ [79:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'alice' @ [79:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'fetchMap' @ [79:26] ==> private final fun MockNetwork.MockNode.fetchMap(subscribe: Boolean = ..., ifChangedSinceVersion: Int? = ...): List<AbstractNetworkMapServiceTest.Changed> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [79:38] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Added' @ [79:51] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'mapServiceNode' @ [79:57] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Added' @ [79:74] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'alice' @ [79:80] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'assertThat' @ [80:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (NodeInfo..NodeInfo?)): (AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>..AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo

'alice' @ [80:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'identityQuery' @ [80:26] ==> private final fun MockNetwork.MockNode.identityQuery(): NodeInfo? defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'isEqualTo' @ [80:43] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'alice' @ [80:53] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'info' @ [80:59] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'assertThat' @ [81:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (NodeInfo..NodeInfo?)): (AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>..AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo

'mapServiceNode' @ [81:20] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'identityQuery' @ [81:35] ==> private final fun MockNetwork.MockNode.identityQuery(): NodeInfo? defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'isEqualTo' @ [81:52] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'mapServiceNode' @ [81:62] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'info' @ [81:77] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [84:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'alice' @ [86:24] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'registration' @ [86:30] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'ADD' @ [86:43] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'swizzle' @ [87:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [88:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'response' @ [88:20] ==> val response: CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`re-register the same node`[LocalVariableDescriptor]

'getOrThrow' @ [88:29] ==> public fun <V> Future<NetworkMapService.RegistrationResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.RegistrationResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> RegistrationResponse

'error' @ [88:42] ==> public final val error: String? defined in net.corda.node.services.network.NetworkMapService.RegistrationResponse[DeserializedPropertyDescriptor]

'isNull' @ [88:49] ==> public open fun isNull(): Unit defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'assertThat' @ [89:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'alice' @ [89:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'fetchMap' @ [89:26] ==> private final fun MockNetwork.MockNode.fetchMap(subscribe: Boolean = ..., ifChangedSinceVersion: Int? = ...): List<AbstractNetworkMapServiceTest.Changed> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [89:38] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Added' @ [89:51] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'mapServiceNode' @ [89:57] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Added' @ [89:74] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'alice' @ [89:80] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Test' @ [92:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'alice' @ [94:24] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'registration' @ [94:30] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'ADD' @ [94:43] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'swizzle' @ [95:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [96:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'response' @ [96:20] ==> val response: CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`re-register with smaller serial value`[LocalVariableDescriptor]

'getOrThrow' @ [96:29] ==> public fun <V> Future<NetworkMapService.RegistrationResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.RegistrationResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> RegistrationResponse

'error' @ [96:42] ==> public final val error: String? defined in net.corda.node.services.network.NetworkMapService.RegistrationResponse[DeserializedPropertyDescriptor]

'isNotNull' @ [96:49] ==> public open fun isNotNull(): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'assertThat' @ [97:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'alice' @ [97:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'fetchMap' @ [97:26] ==> private final fun MockNetwork.MockNode.fetchMap(subscribe: Boolean = ..., ifChangedSinceVersion: Int? = ...): List<AbstractNetworkMapServiceTest.Changed> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [97:38] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Added' @ [97:51] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'mapServiceNode' @ [97:57] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Added' @ [97:74] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'alice' @ [97:80] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Test' @ [100:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'alice' @ [102:24] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'registration' @ [102:30] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'REMOVE' @ [102:43] ==> enum entry REMOVE defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'swizzle' @ [103:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [104:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'response' @ [104:20] ==> val response: CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`de-register node`[LocalVariableDescriptor]

'getOrThrow' @ [104:29] ==> public fun <V> Future<NetworkMapService.RegistrationResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.RegistrationResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> RegistrationResponse

'error' @ [104:42] ==> public final val error: String? defined in net.corda.node.services.network.NetworkMapService.RegistrationResponse[DeserializedPropertyDescriptor]

'isNull' @ [104:49] ==> public open fun isNull(): Unit defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'assertThat' @ [105:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'alice' @ [105:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'fetchMap' @ [105:26] ==> private final fun MockNetwork.MockNode.fetchMap(subscribe: Boolean = ..., ifChangedSinceVersion: Int? = ...): List<AbstractNetworkMapServiceTest.Changed> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [105:38] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Added' @ [105:51] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'mapServiceNode' @ [105:57] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Removed' @ [105:74] ==> public constructor Removed(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Removed[ClassConstructorDescriptorImpl]

'alice' @ [105:82] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'swizzle' @ [106:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [107:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (NodeInfo..NodeInfo?)): (AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>..AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo

'alice' @ [107:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'identityQuery' @ [107:26] ==> private final fun MockNetwork.MockNode.identityQuery(): NodeInfo? defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'isNull' @ [107:43] ==> public open fun isNull(): Unit defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [108:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (NodeInfo..NodeInfo?)): (AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>..AbstractObjectAssert<*, (NodeInfo..NodeInfo?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo

'mapServiceNode' @ [108:20] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'identityQuery' @ [108:35] ==> private final fun MockNetwork.MockNode.identityQuery(): NodeInfo? defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'isEqualTo' @ [108:52] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?), (NodeInfo..NodeInfo?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'mapServiceNode' @ [108:62] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'info' @ [108:77] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [111:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'alice' @ [113:9] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'registration' @ [113:15] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'REMOVE' @ [113:28] ==> enum entry REMOVE defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'alice' @ [114:24] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'registration' @ [114:30] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'REMOVE' @ [114:43] ==> enum entry REMOVE defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'swizzle' @ [115:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [116:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'response' @ [116:20] ==> val response: CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`de-register same node again`[LocalVariableDescriptor]

'getOrThrow' @ [116:29] ==> public fun <V> Future<NetworkMapService.RegistrationResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.RegistrationResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> RegistrationResponse

'error' @ [116:42] ==> public final val error: String? defined in net.corda.node.services.network.NetworkMapService.RegistrationResponse[DeserializedPropertyDescriptor]

'isNotNull' @ [116:49] ==> public open fun isNotNull(): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'assertThat' @ [117:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'alice' @ [117:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'fetchMap' @ [117:26] ==> private final fun MockNetwork.MockNode.fetchMap(subscribe: Boolean = ..., ifChangedSinceVersion: Int? = ...): List<AbstractNetworkMapServiceTest.Changed> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [117:38] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Added' @ [117:51] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'mapServiceNode' @ [117:57] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Removed' @ [117:74] ==> public constructor Removed(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Removed[ClassConstructorDescriptorImpl]

'alice' @ [117:82] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Test' @ [120:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newNodeSeparateFromNetworkMap' @ [122:19] ==> private final fun newNodeSeparateFromNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'BOB' @ [122:49] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [122:53] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'bob' @ [123:24] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`de-register unknown node`[LocalVariableDescriptor]

'registration' @ [123:28] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'REMOVE' @ [123:41] ==> enum entry REMOVE defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'swizzle' @ [124:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [125:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'response' @ [125:20] ==> val response: CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`de-register unknown node`[LocalVariableDescriptor]

'getOrThrow' @ [125:29] ==> public fun <V> Future<NetworkMapService.RegistrationResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.RegistrationResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> RegistrationResponse

'error' @ [125:42] ==> public final val error: String? defined in net.corda.node.services.network.NetworkMapService.RegistrationResponse[DeserializedPropertyDescriptor]

'isNotNull' @ [125:49] ==> public open fun isNotNull(): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'assertThat' @ [126:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'alice' @ [126:20] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'fetchMap' @ [126:26] ==> private final fun MockNetwork.MockNode.fetchMap(subscribe: Boolean = ..., ifChangedSinceVersion: Int? = ...): List<AbstractNetworkMapServiceTest.Changed> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [126:38] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Added' @ [126:51] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'mapServiceNode' @ [126:57] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Added' @ [126:74] ==> public constructor Added(node: MockNetwork.MockNode) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'alice' @ [126:80] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'Test' @ [129:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'alice' @ [131:23] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'subscribe' @ [131:29] ==> private final fun MockNetwork.MockNode.subscribe(): Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'swizzle' @ [132:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'addNewNodeToNetworkMap' @ [133:19] ==> private final fun addNewNodeToNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'BOB' @ [133:42] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [133:46] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'swizzle' @ [134:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'updates' @ [135:22] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while new node registers`[LocalVariableDescriptor]

'single' @ [135:30] ==> public fun <T> Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>.single(): (NetworkMapService.Update..NetworkMapService.Update?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.network.NetworkMapService.Update..net.corda.node.services.network.NetworkMapService.Update?)

'assertThat' @ [136:9] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'update' @ [136:20] ==> val update: (NetworkMapService.Update..NetworkMapService.Update?) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while new node registers`[LocalVariableDescriptor]

'mapVersion' @ [136:27] ==> public final val mapVersion: Int defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'isEqualTo' @ [136:39] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'networkMapService' @ [136:49] ==> protected abstract val networkMapService: S defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'mapVersion' @ [136:67] ==> public final val mapVersion: Int defined in net.corda.node.services.network.AbstractNetworkMapService[DeserializedPropertyDescriptor]

'assertThat' @ [137:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (AbstractObjectAssert<*, (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<*, (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Changed

'update' @ [137:20] ==> val update: (NetworkMapService.Update..NetworkMapService.Update?) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while new node registers`[LocalVariableDescriptor]

'wireReg' @ [137:27] ==> public final val wireReg: WireNodeRegistration defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'verified' @ [137:35] ==> public final fun verified(): NodeRegistration defined in net.corda.node.services.network.WireNodeRegistration[DeserializedSimpleFunctionDescriptor]

'toChanged' @ [137:46] ==> private final fun NodeRegistration.toChanged(): AbstractNetworkMapServiceTest.Changed defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'isEqualTo' @ [137:59] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?), (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'Added' @ [137:69] ==> public constructor Added(node: NodeInfo) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'bob' @ [137:75] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while new node registers`[LocalVariableDescriptor]

'info' @ [137:79] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [140:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'addNewNodeToNetworkMap' @ [142:19] ==> private final fun addNewNodeToNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'BOB' @ [142:42] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [142:46] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'alice' @ [143:23] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'subscribe' @ [143:29] ==> private final fun MockNetwork.MockNode.subscribe(): Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'bob' @ [144:9] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while node de-registers`[LocalVariableDescriptor]

'registration' @ [144:13] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'REMOVE' @ [144:26] ==> enum entry REMOVE defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'swizzle' @ [145:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [146:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'updates' @ [146:20] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while node de-registers`[LocalVariableDescriptor]

'map' @ [146:28] ==> public inline fun <T, R> Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>.map(transform: ((NetworkMapService.Update..NetworkMapService.Update?)) -> AbstractNetworkMapServiceTest.Changed): List<AbstractNetworkMapServiceTest.Changed> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.network.NetworkMapService.Update..net.corda.node.services.network.NetworkMapService.Update?)
    <R> -> Changed

'it' @ [146:34] ==> value-parameter it: (NetworkMapService.Update..NetworkMapService.Update?) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while node de-registers`.<anonymous>[ValueParameterDescriptorImpl]

'wireReg' @ [146:37] ==> public final val wireReg: WireNodeRegistration defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'verified' @ [146:45] ==> public final fun verified(): NodeRegistration defined in net.corda.node.services.network.WireNodeRegistration[DeserializedSimpleFunctionDescriptor]

'toChanged' @ [146:56] ==> private final fun NodeRegistration.toChanged(): AbstractNetworkMapServiceTest.Changed defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [146:71] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Removed' @ [146:84] ==> public constructor Removed(node: NodeInfo) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Removed[ClassConstructorDescriptorImpl]

'bob' @ [146:92] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`subscribed while node de-registers`[LocalVariableDescriptor]

'info' @ [146:96] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [149:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'alice' @ [151:23] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'subscribe' @ [151:29] ==> private final fun MockNetwork.MockNode.subscribe(): Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'addNewNodeToNetworkMap' @ [152:19] ==> private final fun addNewNodeToNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'BOB' @ [152:42] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [152:46] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'alice' @ [153:9] ==> public final lateinit var alice: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'unsubscribe' @ [153:15] ==> private final fun MockNetwork.MockNode.unsubscribe(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'addNewNodeToNetworkMap' @ [154:9] ==> private final fun addNewNodeToNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'CHARLIE' @ [154:32] ==> public val CHARLIE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [154:40] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'swizzle' @ [155:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [156:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..List<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Changed

'updates' @ [156:20] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.unsubscribe[LocalVariableDescriptor]

'map' @ [156:28] ==> public inline fun <T, R> Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>.map(transform: ((NetworkMapService.Update..NetworkMapService.Update?)) -> AbstractNetworkMapServiceTest.Changed): List<AbstractNetworkMapServiceTest.Changed> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.network.NetworkMapService.Update..net.corda.node.services.network.NetworkMapService.Update?)
    <R> -> Changed

'it' @ [156:34] ==> value-parameter it: (NetworkMapService.Update..NetworkMapService.Update?) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.unsubscribe.<anonymous>[ValueParameterDescriptorImpl]

'wireReg' @ [156:37] ==> public final val wireReg: WireNodeRegistration defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'verified' @ [156:45] ==> public final fun verified(): NodeRegistration defined in net.corda.node.services.network.WireNodeRegistration[DeserializedSimpleFunctionDescriptor]

'toChanged' @ [156:56] ==> private final fun NodeRegistration.toChanged(): AbstractNetworkMapServiceTest.Changed defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'containsOnly' @ [156:71] ==> public open fun containsOnly(vararg p0: (AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)): (ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>..ListAssert<(AbstractNetworkMapServiceTest.Changed..AbstractNetworkMapServiceTest.Changed?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Added' @ [156:84] ==> public constructor Added(node: NodeInfo) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'bob' @ [156:90] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.unsubscribe[LocalVariableDescriptor]

'info' @ [156:94] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [159:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newNodeSeparateFromNetworkMap' @ [161:26] ==> private final fun newNodeSeparateFromNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'subscriberLegalName' @ [161:56] ==> public final val subscriberLegalName: X500Name defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Companion[PropertyDescriptorImpl]

'subscriber' @ [162:23] ==> val subscriber: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`surpass unacknowledged update limit`[LocalVariableDescriptor]

'subscribe' @ [162:34] ==> private final fun MockNetwork.MockNode.subscribe(): Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'addNewNodeToNetworkMap' @ [163:19] ==> private final fun addNewNodeToNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'BOB' @ [163:42] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [163:46] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'updates' @ [164:22] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`surpass unacknowledged update limit`[LocalVariableDescriptor]

'first' @ [164:30] ==> public fun <T> Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>.first(): (NetworkMapService.Update..NetworkMapService.Update?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.network.NetworkMapService.Update..net.corda.node.services.network.NetworkMapService.Update?)

'wireReg' @ [164:38] ==> public final val wireReg: WireNodeRegistration defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'verified' @ [164:46] ==> public final fun verified(): NodeRegistration defined in net.corda.node.services.network.WireNodeRegistration[DeserializedSimpleFunctionDescriptor]

'serial' @ [164:57] ==> public final val serial: Long defined in net.corda.node.services.network.NodeRegistration[DeserializedPropertyDescriptor]

'repeat' @ [165:9] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'networkMapService' @ [165:16] ==> protected abstract val networkMapService: S defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'maxUnacknowledgedUpdates' @ [165:34] ==> public final val maxUnacknowledgedUpdates: Int defined in net.corda.node.services.network.AbstractNetworkMapService[DeserializedPropertyDescriptor]

'bob' @ [166:13] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`surpass unacknowledged update limit`[LocalVariableDescriptor]

'registration' @ [166:17] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'ADD' @ [166:30] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'++' @ [166:44] ==> public final operator fun inc(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'serial' @ [166:46] ==> var serial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`surpass unacknowledged update limit`[LocalVariableDescriptor]

'swizzle' @ [167:13] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'assertThat' @ [170:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(NetworkMapService.Update..NetworkMapService.Update?)>..Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>?)): (IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>..IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Update

'updates' @ [170:20] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`surpass unacknowledged update limit`[LocalVariableDescriptor]

'hasSize' @ [170:29] ==> public open fun hasSize(p0: Int): (IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>..IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'networkMapService' @ [170:37] ==> protected abstract val networkMapService: S defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'maxUnacknowledgedUpdates' @ [170:55] ==> public final val maxUnacknowledgedUpdates: Int defined in net.corda.node.services.network.AbstractNetworkMapService[DeserializedPropertyDescriptor]

'Test' @ [173:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newNodeSeparateFromNetworkMap' @ [175:26] ==> private final fun newNodeSeparateFromNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'subscriberLegalName' @ [175:56] ==> public final val subscriberLegalName: X500Name defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Companion[PropertyDescriptorImpl]

'subscriber' @ [176:23] ==> val subscriber: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'subscribe' @ [176:34] ==> private final fun MockNetwork.MockNode.subscribe(): Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'addNewNodeToNetworkMap' @ [177:19] ==> private final fun addNewNodeToNetworkMap(legalName: X500Name): MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'BOB' @ [177:42] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [177:46] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'updates' @ [178:22] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'first' @ [178:30] ==> public fun <T> Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>.first(): (NetworkMapService.Update..NetworkMapService.Update?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.network.NetworkMapService.Update..net.corda.node.services.network.NetworkMapService.Update?)

'wireReg' @ [178:38] ==> public final val wireReg: WireNodeRegistration defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'verified' @ [178:46] ==> public final fun verified(): NodeRegistration defined in net.corda.node.services.network.WireNodeRegistration[DeserializedSimpleFunctionDescriptor]

'serial' @ [178:57] ==> public final val serial: Long defined in net.corda.node.services.network.NodeRegistration[DeserializedPropertyDescriptor]

'repeat' @ [179:9] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'networkMapService' @ [179:16] ==> protected abstract val networkMapService: S defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'maxUnacknowledgedUpdates' @ [179:34] ==> public final val maxUnacknowledgedUpdates: Int defined in net.corda.node.services.network.AbstractNetworkMapService[DeserializedPropertyDescriptor]

'bob' @ [180:13] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'registration' @ [180:17] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'ADD' @ [180:30] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'++' @ [180:44] ==> public final operator fun inc(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'serial' @ [180:46] ==> var serial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'swizzle' @ [181:13] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'subscriber' @ [184:9] ==> val subscriber: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'ackUpdate' @ [184:20] ==> private final fun MockNetwork.MockNode.ackUpdate(mapVersion: Int): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'updates' @ [184:30] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'last' @ [184:38] ==> public fun <T> Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>.last(): (NetworkMapService.Update..NetworkMapService.Update?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.network.NetworkMapService.Update..net.corda.node.services.network.NetworkMapService.Update?)

'mapVersion' @ [184:45] ==> public final val mapVersion: Int defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'swizzle' @ [185:9] ==> protected abstract fun swizzle(): Unit defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'bob' @ [186:9] ==> val bob: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'registration' @ [186:13] ==> private final fun MockNetwork.MockNode.registration(addOrRemove: AddOrRemove, serial: Long? = ...): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'ADD' @ [186:26] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'++' @ [186:40] ==> public final operator fun inc(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'serial' @ [186:42] ==> var serial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'assertThat' @ [187:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableIterable<(NetworkMapService.Update..NetworkMapService.Update?)>..Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>?)): (IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>..IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Update

'updates' @ [187:20] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'hasSize' @ [187:29] ==> public open fun hasSize(p0: Int): (IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>..IterableAssert<(NetworkMapService.Update..NetworkMapService.Update?)>?) defined in org.assertj.core.api.IterableAssert[JavaMethodDescriptor]

'networkMapService' @ [187:37] ==> protected abstract val networkMapService: S defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'maxUnacknowledgedUpdates' @ [187:55] ==> public final val maxUnacknowledgedUpdates: Int defined in net.corda.node.services.network.AbstractNetworkMapService[DeserializedPropertyDescriptor]

'assertThat' @ [188:9] ==> @CheckReturnValue public open fun assertThat(p0: Long): (AbstractLongAssert<*>..AbstractLongAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'updates' @ [188:20] ==> val updates: Queue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'last' @ [188:28] ==> public fun <T> Iterable<(NetworkMapService.Update..NetworkMapService.Update?)>.last(): (NetworkMapService.Update..NetworkMapService.Update?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.network.NetworkMapService.Update..net.corda.node.services.network.NetworkMapService.Update?)

'wireReg' @ [188:35] ==> public final val wireReg: WireNodeRegistration defined in net.corda.node.services.network.NetworkMapService.Update[DeserializedPropertyDescriptor]

'verified' @ [188:43] ==> public final fun verified(): NodeRegistration defined in net.corda.node.services.network.WireNodeRegistration[DeserializedSimpleFunctionDescriptor]

'serial' @ [188:54] ==> public final val serial: Long defined in net.corda.node.services.network.NodeRegistration[DeserializedPropertyDescriptor]

'isEqualTo' @ [188:62] ==> public open fun isEqualTo(p0: Long): (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>..AbstractLongAssert<out (AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>..AbstractLongAssert<out (AbstractLongAssert<out Any?>..AbstractLongAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractLongAssert[JavaMethodDescriptor]

'serial' @ [188:72] ==> var serial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.`delay sending update ack until just before unacknowledged update limit`[LocalVariableDescriptor]

'FetchMapRequest' @ [192:23] ==> public constructor FetchMapRequest(subscribe: Boolean, ifChangedSinceVersion: Int?, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.FetchMapRequest[DeserializedClassConstructorDescriptor]

'subscribe' @ [192:39] ==> value-parameter subscribe: Boolean = ... defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.fetchMap[ValueParameterDescriptorImpl]

'ifChangedSinceVersion' @ [192:50] ==> value-parameter ifChangedSinceVersion: Int? = ... defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.fetchMap[ValueParameterDescriptorImpl]

'network' @ [192:73] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [192:81] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'services' @ [193:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [193:33] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'sendRequest' @ [193:48] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.FetchMapResponse> defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R : Any> -> FetchMapResponse

'FETCH_TOPIC' @ [193:78] ==> public final val FETCH_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyImportedFromObject]

'request' @ [193:91] ==> val request: NetworkMapService.FetchMapRequest defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.fetchMap[LocalVariableDescriptor]

'mapServiceNode' @ [193:100] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [193:115] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [193:123] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [194:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [194:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'response' @ [195:16] ==> val response: CordaFuture<NetworkMapService.FetchMapResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.fetchMap[LocalVariableDescriptor]

'getOrThrow' @ [195:25] ==> public fun <V> Future<NetworkMapService.FetchMapResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.FetchMapResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> FetchMapResponse

'nodes' @ [195:38] ==> public final val nodes: List<NodeRegistration>? defined in net.corda.node.services.network.NetworkMapService.FetchMapResponse[DeserializedPropertyDescriptor]

'map' @ [195:45] ==> public inline fun <T, R> Iterable<NodeRegistration>.map(transform: (NodeRegistration) -> AbstractNetworkMapServiceTest.Changed): List<AbstractNetworkMapServiceTest.Changed> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeRegistration
    <R> -> Changed

'it' @ [195:51] ==> value-parameter it: NodeRegistration defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.fetchMap.<anonymous>[ValueParameterDescriptorImpl]

'toChanged' @ [195:54] ==> private final fun NodeRegistration.toChanged(): AbstractNetworkMapServiceTest.Changed defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[SimpleFunctionDescriptorImpl]

'emptyList' @ [195:71] ==> public fun <T> emptyList(): List<AbstractNetworkMapServiceTest.Changed> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Changed

'when (type) {
        ADD -> Added(node)
        REMOVE -> Removed(node)
    }' @ [198:57] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: AbstractNetworkMapServiceTest.Changed, entry1: AbstractNetworkMapServiceTest.Changed): AbstractNetworkMapServiceTest.Changed[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Changed

'type' @ [198:63] ==> public final val type: AddOrRemove defined in net.corda.node.services.network.NodeRegistration[DeserializedPropertyDescriptor]

'ADD' @ [199:9] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'Added' @ [199:16] ==> public constructor Added(node: NodeInfo) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'node' @ [199:22] ==> public final val node: NodeInfo defined in net.corda.node.services.network.NodeRegistration[DeserializedPropertyDescriptor]

'REMOVE' @ [200:9] ==> enum entry REMOVE defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'Removed' @ [200:19] ==> public constructor Removed(node: NodeInfo) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Removed[ClassConstructorDescriptorImpl]

'node' @ [200:27] ==> public final val node: NodeInfo defined in net.corda.node.services.network.NodeRegistration[DeserializedPropertyDescriptor]

'QueryIdentityRequest' @ [204:23] ==> public constructor QueryIdentityRequest(identity: PartyAndCertificate, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.QueryIdentityRequest[DeserializedClassConstructorDescriptor]

'info' @ [204:44] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [204:49] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'network' @ [204:71] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [204:79] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'services' @ [205:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [205:33] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'sendRequest' @ [205:48] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.QueryIdentityResponse> defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R : Any> -> QueryIdentityResponse

'QUERY_TOPIC' @ [205:83] ==> public final val QUERY_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyImportedFromObject]

'request' @ [205:96] ==> val request: NetworkMapService.QueryIdentityRequest defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.identityQuery[LocalVariableDescriptor]

'mapServiceNode' @ [205:105] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [205:120] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [205:128] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [206:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [206:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'response' @ [207:16] ==> val response: CordaFuture<NetworkMapService.QueryIdentityResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.identityQuery[LocalVariableDescriptor]

'getOrThrow' @ [207:25] ==> public fun <V> Future<NetworkMapService.QueryIdentityResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.QueryIdentityResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> QueryIdentityResponse

'node' @ [207:38] ==> public final val node: NodeInfo? defined in net.corda.node.services.network.NetworkMapService.QueryIdentityResponse[DeserializedPropertyDescriptor]

'Long' @ [210:30] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [210:35] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'if (serial == null) {
            ++lastSerial
        } else {
            lastSerial = serial
            serial
        }' @ [214:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'serial' @ [214:34] ==> value-parameter serial: Long? = ... defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[ValueParameterDescriptorImpl]

'++' @ [215:13] ==> public final operator fun inc(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'lastSerial' @ [215:15] ==> private final var lastSerial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'lastSerial' @ [217:13] ==> private final var lastSerial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'serial' @ [217:26] ==> value-parameter serial: Long? = ... defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[ValueParameterDescriptorImpl]

'serial' @ [218:13] ==> value-parameter serial: Long? = ... defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[ValueParameterDescriptorImpl]

'+' @ [220:23] ==> public open fun plus(p0: (TemporalAmount..TemporalAmount?)): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'now' @ [220:31] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'NetworkMapService' @ [220:39] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'DEFAULT_EXPIRATION_PERIOD' @ [220:57] ==> public final val DEFAULT_EXPIRATION_PERIOD: Period defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'NodeRegistration' @ [221:32] ==> public constructor NodeRegistration(node: NodeInfo, serial: Long, type: AddOrRemove, expires: Instant) defined in net.corda.node.services.network.NodeRegistration[DeserializedClassConstructorDescriptor]

'info' @ [221:49] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'distinctSerial' @ [221:55] ==> val distinctSerial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[LocalVariableDescriptor]

'addOrRemove' @ [221:71] ==> value-parameter addOrRemove: AddOrRemove defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[ValueParameterDescriptorImpl]

'expires' @ [221:84] ==> val expires: (Instant..Instant?) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[LocalVariableDescriptor]

'RegistrationRequest' @ [222:23] ==> public constructor RegistrationRequest(wireReg: WireNodeRegistration, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.RegistrationRequest[DeserializedClassConstructorDescriptor]

'nodeRegistration' @ [222:43] ==> val nodeRegistration: NodeRegistration defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[LocalVariableDescriptor]

'toWire' @ [222:60] ==> public final fun toWire(keyManager: KeyManagementService, publicKey: PublicKey): WireNodeRegistration defined in net.corda.node.services.network.NodeRegistration[DeserializedSimpleFunctionDescriptor]

'services' @ [222:67] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'keyManagementService' @ [222:76] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'services' @ [222:98] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [222:107] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'network' @ [222:126] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [222:134] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'services' @ [223:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [223:33] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'sendRequest' @ [223:48] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R : Any> -> RegistrationResponse

'REGISTER_TOPIC' @ [223:82] ==> public final val REGISTER_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyImportedFromObject]

'request' @ [223:98] ==> val request: NetworkMapService.RegistrationRequest defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[LocalVariableDescriptor]

'mapServiceNode' @ [223:107] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [223:122] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [223:130] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [224:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [224:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'response' @ [225:16] ==> val response: CordaFuture<NetworkMapService.RegistrationResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.registration[LocalVariableDescriptor]

'SubscribeRequest' @ [229:23] ==> public constructor SubscribeRequest(subscribe: Boolean, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.SubscribeRequest[DeserializedClassConstructorDescriptor]

'network' @ [229:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [229:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'LinkedBlockingQueue' @ [230:23] ==> public constructor LinkedBlockingQueue<E : (Any..Any?)>() defined in java.util.concurrent.LinkedBlockingQueue[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Update

'services' @ [231:9] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [231:18] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'addMessageHandler' @ [231:33] ==> public abstract fun addMessageHandler(topic: String = ..., sessionID: Long = ..., callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'PUSH_TOPIC' @ [231:51] ==> public final val PUSH_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyImportedFromObject]

'updates' @ [232:13] ==> val updates: LinkedBlockingQueue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.subscribe[LocalVariableDescriptor]

'message' @ [232:24] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.subscribe.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [232:32] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.ReceivedMessage[DeserializedPropertyDescriptor]

'deserialize' @ [232:37] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): NetworkMapService.Update defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Update

'services' @ [234:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [234:33] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'sendRequest' @ [234:48] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.SubscribeResponse> defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R : Any> -> SubscribeResponse

'SUBSCRIPTION_TOPIC' @ [234:79] ==> public final val SUBSCRIPTION_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyImportedFromObject]

'request' @ [234:99] ==> val request: NetworkMapService.SubscribeRequest defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.subscribe[LocalVariableDescriptor]

'mapServiceNode' @ [234:108] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [234:123] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [234:131] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [235:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [235:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [236:9] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'response' @ [236:20] ==> val response: CordaFuture<NetworkMapService.SubscribeResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.subscribe[LocalVariableDescriptor]

'getOrThrow' @ [236:29] ==> public fun <V> Future<NetworkMapService.SubscribeResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.SubscribeResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SubscribeResponse

'confirmed' @ [236:42] ==> public final val confirmed: Boolean defined in net.corda.node.services.network.NetworkMapService.SubscribeResponse[DeserializedPropertyDescriptor]

'isTrue' @ [236:53] ==> public open fun isTrue(): (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractBooleanAssert[JavaMethodDescriptor]

'updates' @ [237:16] ==> val updates: LinkedBlockingQueue<NetworkMapService.Update> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.subscribe[LocalVariableDescriptor]

'SubscribeRequest' @ [241:23] ==> public constructor SubscribeRequest(subscribe: Boolean, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.SubscribeRequest[DeserializedClassConstructorDescriptor]

'network' @ [241:47] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [241:55] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'services' @ [242:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [242:33] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'sendRequest' @ [242:48] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.SubscribeResponse> defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R : Any> -> SubscribeResponse

'SUBSCRIPTION_TOPIC' @ [242:79] ==> public final val SUBSCRIPTION_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyImportedFromObject]

'request' @ [242:99] ==> val request: NetworkMapService.SubscribeRequest defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.unsubscribe[LocalVariableDescriptor]

'mapServiceNode' @ [242:108] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [242:123] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [242:131] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [243:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [243:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [244:9] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'response' @ [244:20] ==> val response: CordaFuture<NetworkMapService.SubscribeResponse> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.unsubscribe[LocalVariableDescriptor]

'getOrThrow' @ [244:29] ==> public fun <V> Future<NetworkMapService.SubscribeResponse>.getOrThrow(timeout: Duration? = ...): NetworkMapService.SubscribeResponse defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SubscribeResponse

'confirmed' @ [244:42] ==> public final val confirmed: Boolean defined in net.corda.node.services.network.NetworkMapService.SubscribeResponse[DeserializedPropertyDescriptor]

'isTrue' @ [244:53] ==> public open fun isTrue(): (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractBooleanAssert[JavaMethodDescriptor]

'UpdateAcknowledge' @ [248:23] ==> public constructor UpdateAcknowledge(mapVersion: Int, replyTo: MessageRecipients) defined in net.corda.node.services.network.NetworkMapService.UpdateAcknowledge[DeserializedClassConstructorDescriptor]

'mapVersion' @ [248:41] ==> value-parameter mapVersion: Int defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.ackUpdate[ValueParameterDescriptorImpl]

'services' @ [248:53] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [248:62] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'myAddress' @ [248:77] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'services' @ [249:9] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [249:18] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'send' @ [249:33] ==> public fun MessagingService.send(topic: String, sessionID: Long, payload: Any, to: MessageRecipients, uuid: UUID = ...): Unit defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]

'PUSH_ACK_TOPIC' @ [249:38] ==> public final val PUSH_ACK_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyImportedFromObject]

'MessagingService' @ [249:54] ==> public companion object defined in net.corda.node.services.messaging.MessagingService[FakeCallableDescriptorForObject]

'DEFAULT_SESSION_ID' @ [249:71] ==> public final val DEFAULT_SESSION_ID: Long defined in net.corda.node.services.messaging.MessagingService.Companion[DeserializedPropertyDescriptor]

'request' @ [249:91] ==> val request: NetworkMapService.UpdateAcknowledge defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.ackUpdate[LocalVariableDescriptor]

'mapServiceNode' @ [249:100] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [249:115] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [249:123] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [250:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [250:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [254:20] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'createNode' @ [254:28] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'mapServiceNode' @ [254:39] ==> public final lateinit var mapServiceNode: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'network' @ [254:54] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [254:62] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'legalName' @ [254:85] ==> value-parameter legalName: X500Name defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.addNewNodeToNetworkMap[ValueParameterDescriptorImpl]

'mockNet' @ [255:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'runNetwork' @ [255:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'lastSerial' @ [256:9] ==> private final var lastSerial: Long defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'currentTimeMillis' @ [256:29] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'node' @ [257:16] ==> val node: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.addNewNodeToNetworkMap[LocalVariableDescriptor]

'mockNet' @ [261:16] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[PropertyDescriptorImpl]

'createNode' @ [261:24] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'legalName' @ [261:47] ==> value-parameter legalName: X500Name defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.newNodeSeparateFromNetworkMap[ValueParameterDescriptorImpl]

'NoNMSNodeFactory' @ [261:72] ==> private object NoNMSNodeFactory : MockNetwork.Factory<MockNetwork.MockNode> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest[FakeCallableDescriptorForObject]

'Changed' @ [265:48] ==> private constructor Changed() defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed[ClassConstructorDescriptorImpl]

'this' @ [266:43] ==> public constructor Added(node: NodeInfo) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added[ClassConstructorDescriptorImpl]

'node' @ [266:48] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Added.<init>[ValueParameterDescriptorImpl]

'info' @ [266:53] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Changed' @ [269:50] ==> private constructor Changed() defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed[ClassConstructorDescriptorImpl]

'this' @ [270:43] ==> public constructor Removed(node: NodeInfo) defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Removed[ClassConstructorDescriptorImpl]

'node' @ [270:48] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.Changed.Removed.<init>[ValueParameterDescriptorImpl]

'info' @ [270:53] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'MockNode' @ [282:29] ==> public constructor MockNode(config: NodeConfiguration, mockNet: MockNetwork, networkMapAddress: SingleMessageRecipient?, advertisedServices: Set<ServiceInfo>, id: Int, overrideServices: Map<ServiceInfo, KeyPair>?, entropyRoot: BigInteger = ...) defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedClassConstructorDescriptor]

'config' @ [282:38] ==> value-parameter config: NodeConfiguration defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.NoNMSNodeFactory.create[ValueParameterDescriptorImpl]

'network' @ [282:46] ==> value-parameter network: MockNetwork defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.NoNMSNodeFactory.create[ValueParameterDescriptorImpl]

'networkMapAddr' @ [282:55] ==> value-parameter networkMapAddr: SingleMessageRecipient? defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.NoNMSNodeFactory.create[ValueParameterDescriptorImpl]

'advertisedServices' @ [282:71] ==> value-parameter advertisedServices: Set<ServiceInfo> defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.NoNMSNodeFactory.create[ValueParameterDescriptorImpl]

'id' @ [282:91] ==> value-parameter id: Int defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.NoNMSNodeFactory.create[ValueParameterDescriptorImpl]

'overrideServices' @ [282:95] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.NoNMSNodeFactory.create[ValueParameterDescriptorImpl]

'entropyRoot' @ [282:113] ==> value-parameter entropyRoot: BigInteger defined in net.corda.node.services.network.AbstractNetworkMapServiceTest.NoNMSNodeFactory.create[ValueParameterDescriptorImpl]

