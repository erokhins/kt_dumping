'LogHelper' @ [61:13] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [61:23] ==> public final fun setLevel(vararg loggerNames: String): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'MockNetwork' @ [65:27] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'RoundRobin' @ [65:71] ==> public constructor RoundRobin() defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin[DeserializedClassConstructorDescriptor]

'ArrayList' @ [66:43] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SessionTransfer

'Before' @ [72:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'node1' @ [74:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'mockNet' @ [74:17] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [74:25] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [74:57] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [74:69] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [74:87] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'node2' @ [75:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'mockNet' @ [75:17] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [75:25] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [75:56] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [75:62] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [75:70] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'generateKeyPair' @ [77:29] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [78:29] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [78:41] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [78:65] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'getTestX509Name' @ [78:71] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [79:32] ==> public fun <K, V> mapOf(pair: Pair<ServiceInfo, KeyPair>): Map<ServiceInfo, KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ServiceInfo
    <V> -> KeyPair

'Pair' @ [79:38] ==> public constructor Pair<out A, out B>(first: ServiceInfo, second: KeyPair) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ServiceInfo
    <out B> -> KeyPair

'notaryService' @ [79:43] ==> val notaryService: ServiceInfo defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'notaryKeyPair' @ [79:58] ==> val notaryKeyPair: KeyPair defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'notary1' @ [82:9] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'mockNet' @ [82:19] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNotaryNode' @ [82:27] ==> public final fun createNotaryNode(networkMapAddress: SingleMessageRecipient? = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., serviceName: X500Name? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [82:64] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [82:70] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [82:78] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'overrideServices' @ [82:108] ==> val overrideServices: Map<ServiceInfo, KeyPair> defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'notaryService' @ [82:140] ==> val notaryService: ServiceInfo defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'name' @ [82:154] ==> public final val name: X500Name? defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'notary2' @ [83:9] ==> private final lateinit var notary2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'mockNet' @ [83:19] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNotaryNode' @ [83:27] ==> public final fun createNotaryNode(networkMapAddress: SingleMessageRecipient? = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., serviceName: X500Name? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [83:64] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [83:70] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [83:78] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'overrideServices' @ [83:108] ==> val overrideServices: Map<ServiceInfo, KeyPair> defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'notaryService' @ [83:140] ==> val notaryService: ServiceInfo defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'name' @ [83:154] ==> public final val name: X500Name? defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'receivedSessionMessagesObservable' @ [85:9] ==> private final fun receivedSessionMessagesObservable(): Observable<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'forEach' @ [85:45] ==> public final fun forEach(p0: (((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> Unit..(((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> Unit)?)): Unit defined in rx.Observable[MyFunctionDescriptor]

'receivedSessionMessages' @ [85:55] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'it' @ [85:82] ==> value-parameter it: (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.start.<anonymous>[ValueParameterDescriptorImpl]

'mockNet' @ [86:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [86:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'listOf' @ [89:21] ==> public fun <T> listOf(vararg elements: MockNetwork.MockNode): List<MockNetwork.MockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'node1' @ [89:28] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [89:35] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'notary1' @ [89:42] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'notary2' @ [89:51] ==> private final lateinit var notary2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'nodes' @ [90:9] ==> val nodes: List<MockNetwork.MockNode> defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'forEach' @ [90:15] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'nodes' @ [91:13] ==> val nodes: List<MockNetwork.MockNode> defined in net.corda.node.services.statemachine.FlowFrameworkTests.start[LocalVariableDescriptor]

'map' @ [91:19] ==> public inline fun <T, R> Iterable<MockNetwork.MockNode>.map(transform: (MockNetwork.MockNode) -> PartyAndCertificate): List<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode
    <R> -> PartyAndCertificate

'it' @ [91:25] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [91:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myInfo' @ [91:37] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [91:44] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'forEach' @ [91:67] ==> @HidesMembers public inline fun <T> Iterable<PartyAndCertificate>.forEach(action: (PartyAndCertificate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'node' @ [92:17] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.start.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [92:22] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [92:31] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [92:47] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'identity' @ [92:73] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.statemachine.FlowFrameworkTests.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'After' @ [97:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [99:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'stopNodes' @ [99:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'receivedSessionMessages' @ [100:9] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'clear' @ [100:33] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'Test' @ [103:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node1' @ [105:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [105:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [105:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'NoOpFlow' @ [105:34] ==> public constructor NoOpFlow(nonTerminating: Boolean = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[ClassConstructorDescriptorImpl]

'node1' @ [106:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'acceptableLiveFiberCountOnStop' @ [106:15] ==> public final var acceptableLiveFiberCountOnStop: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'node1' @ [107:28] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'restartAndGetRestoredFlow' @ [107:34] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.restartAndGetRestoredFlow(networkMapNode: MockNetwork.MockNode? = ...): FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> NoOpFlow

'assertThat' @ [108:9] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'restoredFlow' @ [108:20] ==> val restoredFlow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`newly added flow is preserved on restart`[LocalVariableDescriptor]

'flowStarted' @ [108:33] ==> @Transient public final var flowStarted: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'isTrue' @ [108:46] ==> public open fun isTrue(): (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractBooleanAssert[JavaMethodDescriptor]

'Test' @ [111:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'LazyServiceHubAccessFlow' @ [113:20] ==> public constructor LazyServiceHubAccessFlow() defined in net.corda.node.services.statemachine.FlowFrameworkTests.LazyServiceHubAccessFlow[ClassConstructorDescriptorImpl]

'node1' @ [114:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [114:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [114:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'flow' @ [114:34] ==> val flow: FlowFrameworkTests.LazyServiceHubAccessFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow can lazily use the serviceHub in its constructor`[LocalVariableDescriptor]

'assertThat' @ [115:9] ==> @CheckReturnValue public open fun <T : (Comparable<(Instant..Instant?)>..Comparable<(Instant..Instant?)>?)> assertThat(p0: (Instant..Instant?)): (AbstractComparableAssert<*, (Instant..Instant?)>..AbstractComparableAssert<*, (Instant..Instant?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> Instant

'flow' @ [115:20] ==> val flow: FlowFrameworkTests.LazyServiceHubAccessFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow can lazily use the serviceHub in its constructor`[LocalVariableDescriptor]

'lazyTime' @ [115:25] ==> public final val lazyTime: Instant defined in net.corda.node.services.statemachine.FlowFrameworkTests.LazyServiceHubAccessFlow[PropertyDescriptorImpl]

'isNotNull' @ [115:35] ==> public open fun isNotNull(): (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>?), (Instant..Instant?)>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>..AbstractComparableAssert<out (AbstractComparableAssert<out Any?, out Any?>..AbstractComparableAssert<out Any?, out Any?>?), (Instant..Instant?)>?), (Instant..Instant?)>?), (Instant..Instant?)>?), (Instant..Instant?)>?) defined in org.assertj.core.api.AbstractComparableAssert[JavaMethodDescriptor]

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [120:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [120:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SendFlow): CordaFuture<FlowFrameworkTests.SendFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SendFlow

'ReceiveFlow' @ [120:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'SendFlow' @ [120:57] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'it' @ [120:75] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`exception while fiber suspended`.<anonymous>[ValueParameterDescriptorImpl]

'ReceiveFlow' @ [121:20] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [121:32] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [121:38] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [121:43] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node1' @ [122:21] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [122:27] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [122:36] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'flow' @ [122:46] ==> val flow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`exception while fiber suspended`[LocalVariableDescriptor]

'Exception' @ [124:38] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'fiber' @ [125:9] ==> val fiber: FlowStateMachineImpl<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`exception while fiber suspended`[LocalVariableDescriptor]

'actionOnSuspend' @ [125:15] ==> internal final lateinit var actionOnSuspend: (FlowIORequest) -> Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[DeserializedPropertyDescriptor]

'exceptionDuringSuspend' @ [126:19] ==> val exceptionDuringSuspend: Exception /* = Exception */ defined in net.corda.node.services.statemachine.FlowFrameworkTests.`exception while fiber suspended`[LocalVariableDescriptor]

'mockNet' @ [128:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [128:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatThrownBy' @ [129:9] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'fiber' @ [130:13] ==> val fiber: FlowStateMachineImpl<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`exception while fiber suspended`[LocalVariableDescriptor]

'resultFuture' @ [130:19] ==> public open val resultFuture: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[DeserializedPropertyDescriptor]

'getOrThrow' @ [130:32] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'isSameAs' @ [131:11] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'exceptionDuringSuspend' @ [131:20] ==> val exceptionDuringSuspend: Exception /* = Exception */ defined in net.corda.node.services.statemachine.FlowFrameworkTests.`exception while fiber suspended`[LocalVariableDescriptor]

'assertThat' @ [132:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (FlowLogic<*>..FlowLogic<*>?)>..List<(FlowLogic<*>..FlowLogic<*>?)>?)): (ListAssert<(FlowLogic<*>..FlowLogic<*>?)>..ListAssert<(FlowLogic<*>..FlowLogic<*>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> FlowLogic<*>

'node1' @ [132:20] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'smm' @ [132:26] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'allStateMachines' @ [132:30] ==> public final val allStateMachines: List<FlowLogic<*>> defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedPropertyDescriptor]

'isEmpty' @ [132:48] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [134:9] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'fiber' @ [134:20] ==> val fiber: FlowStateMachineImpl<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`exception while fiber suspended`[LocalVariableDescriptor]

'isTerminated' @ [134:26] ==> public final val <R> FlowStateMachineImpl<Unit>.isTerminated: Boolean[MyPropertyDescriptor]
Inferred types:
    <R> -> Unit

'isTrue' @ [134:40] ==> public open fun isTrue(): (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractBooleanAssert[JavaMethodDescriptor]

'Test' @ [137:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [139:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [139:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ReceiveFlow): CordaFuture<FlowFrameworkTests.ReceiveFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'SendFlow' @ [139:35] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'ReceiveFlow' @ [139:54] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'it' @ [139:66] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow restarted just after receiving payload`.<anonymous>[ValueParameterDescriptorImpl]

'nonTerminating' @ [139:70] ==> public final fun nonTerminating(): FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[SimpleFunctionDescriptorImpl]

'node1' @ [140:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [140:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [140:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'SendFlow' @ [140:34] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'node2' @ [140:52] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [140:58] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [140:63] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node2' @ [143:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'pumpReceive' @ [143:15] ==> public final fun pumpReceive(block: Boolean = ...): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node2' @ [144:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'disableDBCloseOnStop' @ [144:15] ==> public final fun disableDBCloseOnStop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node2' @ [145:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'acceptableLiveFiberCountOnStop' @ [145:15] ==> public final var acceptableLiveFiberCountOnStop: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'node2' @ [146:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'stop' @ [146:15] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [147:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [147:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node2' @ [148:28] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'restartAndGetRestoredFlow' @ [148:34] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.restartAndGetRestoredFlow(networkMapNode: MockNetwork.MockNode? = ...): FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'node1' @ [148:73] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'assertThat' @ [149:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'restoredFlow' @ [149:20] ==> val restoredFlow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow restarted just after receiving payload`[LocalVariableDescriptor]

'receivedPayloads' @ [149:33] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'isEqualTo' @ [149:54] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'Test' @ [152:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [154:21] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [154:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [154:40] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [154:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [154:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'NoOpFlow' @ [155:20] ==> public constructor NoOpFlow(nonTerminating: Boolean = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[ClassConstructorDescriptorImpl]

'node3' @ [156:9] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map does run after init`[LocalVariableDescriptor]

'services' @ [156:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [156:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'flow' @ [156:34] ==> val flow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map does run after init`[LocalVariableDescriptor]

'assertEquals' @ [157:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'flow' @ [157:29] ==> val flow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map does run after init`[LocalVariableDescriptor]

'flowStarted' @ [157:34] ==> @Transient public final var flowStarted: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'mockNet' @ [158:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [158:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [159:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'flow' @ [159:28] ==> val flow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map does run after init`[LocalVariableDescriptor]

'flowStarted' @ [159:33] ==> @Transient public final var flowStarted: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'Test' @ [162:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [164:21] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [164:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [164:40] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [164:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [164:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'NoOpFlow' @ [165:20] ==> public constructor NoOpFlow(nonTerminating: Boolean = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[ClassConstructorDescriptorImpl]

'node3' @ [166:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'services' @ [166:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [166:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'flow' @ [166:34] ==> val flow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'assertEquals' @ [167:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'flow' @ [167:29] ==> val flow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'flowStarted' @ [167:34] ==> @Transient public final var flowStarted: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'node3' @ [168:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'disableDBCloseOnStop' @ [168:15] ==> public final fun disableDBCloseOnStop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node3' @ [169:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'stop' @ [169:15] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node3' @ [171:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'mockNet' @ [171:17] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [171:25] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [171:36] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [171:42] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [171:50] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'node3' @ [171:61] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'id' @ [171:67] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'node3' @ [172:28] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'getSingleFlow' @ [172:34] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.getSingleFlow(): Pair<FlowFrameworkTests.NoOpFlow, CordaFuture<*>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> NoOpFlow

'first' @ [172:60] ==> public final val first: FlowFrameworkTests.NoOpFlow defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertEquals' @ [173:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'restoredFlow' @ [173:29] ==> val restoredFlow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'flowStarted' @ [173:42] ==> @Transient public final var flowStarted: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'mockNet' @ [174:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [174:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node3' @ [175:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'smm' @ [175:15] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'executor' @ [175:19] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedPropertyDescriptor]

'flush' @ [175:28] ==> public abstract fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [176:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'restoredFlow' @ [176:28] ==> val restoredFlow: FlowFrameworkTests.NoOpFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'flowStarted' @ [176:41] ==> @Transient public final var flowStarted: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'node3' @ [177:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'disableDBCloseOnStop' @ [177:15] ==> public final fun disableDBCloseOnStop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node3' @ [178:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'stop' @ [178:15] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node3' @ [181:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'mockNet' @ [181:17] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [181:25] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [181:36] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [181:42] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [181:50] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'node3' @ [181:61] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'id' @ [181:67] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'mockNet' @ [182:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [182:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node3' @ [183:9] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'smm' @ [183:15] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'executor' @ [183:19] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedPropertyDescriptor]

'flush' @ [183:28] ==> public abstract fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [184:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'node3' @ [184:20] ==> var node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow added before network map will be init checkpointed`[LocalVariableDescriptor]

'smm' @ [184:26] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'findStateMachines' @ [184:30] ==> public final fun <P : FlowLogic<Unit>, T> findStateMachines(flowClass: Class<FlowFrameworkTests.NoOpFlow>): List<Pair<FlowFrameworkTests.NoOpFlow, CordaFuture<Unit>>> defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : FlowLogic<T>> -> NoOpFlow
    <T> -> Unit

'NoOpFlow' @ [184:48] ==> public constructor NoOpFlow(nonTerminating: Boolean = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[ClassConstructorDescriptorImpl]

'java' @ [184:64] ==> public val <T> KClass<FlowFrameworkTests.NoOpFlow>.java: Class<FlowFrameworkTests.NoOpFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NoOpFlow

'isEmpty' @ [184:70] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Test' @ [187:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node1' @ [189:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [189:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SendFlow): CordaFuture<FlowFrameworkTests.SendFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SendFlow

'ReceiveFlow' @ [189:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'SendFlow' @ [189:57] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'it' @ [189:75] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow loaded from checkpoint will respond to messages from before start`.<anonymous>[ValueParameterDescriptorImpl]

'node2' @ [190:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [190:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [190:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ReceiveFlow' @ [190:34] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node1' @ [190:46] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [190:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [190:57] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'nonTerminating' @ [190:72] ==> public final fun nonTerminating(): FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[SimpleFunctionDescriptorImpl]

'node2' @ [192:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'smm' @ [192:15] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'executor' @ [192:19] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedPropertyDescriptor]

'flush' @ [192:28] ==> public abstract fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor[DeserializedSimpleFunctionDescriptor]

'node2' @ [193:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'disableDBCloseOnStop' @ [193:15] ==> public final fun disableDBCloseOnStop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node2' @ [194:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'stop' @ [194:15] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node2' @ [195:28] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'restartAndGetRestoredFlow' @ [195:34] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.restartAndGetRestoredFlow(networkMapNode: MockNetwork.MockNode? = ...): FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'node1' @ [195:73] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'assertThat' @ [196:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'restoredFlow' @ [196:20] ==> val restoredFlow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow loaded from checkpoint will respond to messages from before start`[LocalVariableDescriptor]

'receivedPayloads' @ [196:33] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'isEqualTo' @ [196:54] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'Test' @ [199:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'random63BitValue' @ [201:23] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'random63BitValue' @ [202:24] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [205:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'messagingNetwork' @ [205:17] ==> public final val messagingNetwork: InMemoryMessagingNetwork defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'sentMessages' @ [205:34] ==> public final val sentMessages: Observable<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[DeserializedPropertyDescriptor]

'toSessionTransfers' @ [205:47] ==> private final fun Observable<InMemoryMessagingNetwork.MessageTransfer>.toSessionTransfers(): Observable<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'filter' @ [205:68] ==> public final fun filter(p0: (((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> (Boolean..Boolean?)..(((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> (Boolean..Boolean?))?)): (Observable<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..Observable<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [205:77] ==> value-parameter it: (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`.<anonymous>[ValueParameterDescriptorImpl]

'isPayloadTransfer' @ [205:80] ==> public final val isPayloadTransfer: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'forEach' @ [205:100] ==> public final fun forEach(p0: (((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> Unit..(((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> Unit)?)): Unit defined in rx.Observable[MyFunctionDescriptor]

'sentCount' @ [205:110] ==> var sentCount: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'mockNet' @ [207:21] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [207:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [207:40] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [207:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [207:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'node3' @ [208:26] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'registerFlowFactory' @ [208:32] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.PingPongFlow): CordaFuture<FlowFrameworkTests.PingPongFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> PingPongFlow

'PingPongFlow' @ [208:52] ==> public constructor PingPongFlow(otherParty: Party, payload: Long) defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[ClassConstructorDescriptorImpl]

'PingPongFlow' @ [208:75] ==> public constructor PingPongFlow(otherParty: Party, payload: Long) defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[ClassConstructorDescriptorImpl]

'it' @ [208:88] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`.<anonymous>[ValueParameterDescriptorImpl]

'payload2' @ [208:92] ==> val payload2: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'mockNet' @ [209:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [209:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node2' @ [212:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [212:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [212:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'PingPongFlow' @ [212:34] ==> public constructor PingPongFlow(otherParty: Party, payload: Long) defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[ClassConstructorDescriptorImpl]

'node3' @ [212:47] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'info' @ [212:53] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [212:58] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'payload' @ [212:73] ==> val payload: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'node2' @ [213:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'database' @ [213:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [213:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [214:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'node2' @ [214:29] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'checkpointStorage' @ [214:35] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'checkpoints' @ [214:53] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'size' @ [214:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'node2' @ [217:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'smm' @ [217:15] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'executor' @ [217:19] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedPropertyDescriptor]

'flush' @ [217:28] ==> public abstract fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor[DeserializedSimpleFunctionDescriptor]

'node2' @ [218:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'disableDBCloseOnStop' @ [218:15] ==> public final fun disableDBCloseOnStop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node2' @ [220:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'stop' @ [220:15] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'node2' @ [221:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'database' @ [221:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [221:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [222:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'node2' @ [222:29] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'checkpointStorage' @ [222:35] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'checkpoints' @ [222:53] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'size' @ [222:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'mockNet' @ [224:22] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [224:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [224:41] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [224:47] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [224:55] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'node2' @ [224:66] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'id' @ [224:72] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'node2' @ [224:98] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'advertisedServices' @ [224:104] ==> public final val advertisedServices: Set<ServiceInfo> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'toTypedArray' @ [224:123] ==> public inline fun <reified T> Collection<ServiceInfo>.toTypedArray(): Array<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ServiceInfo

'node2' @ [225:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'manuallyCloseDB' @ [225:15] ==> public final fun manuallyCloseDB(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'component1' @ [226:14] ==> public final operator fun component1(): FlowFrameworkTests.PingPongFlow defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [226:26] ==> public final operator fun component2(): CordaFuture<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'node2b' @ [226:34] ==> val node2b: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'getSingleFlow' @ [226:41] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.getSingleFlow(): Pair<FlowFrameworkTests.PingPongFlow, CordaFuture<*>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> PingPongFlow

'mockNet' @ [228:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [228:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node2b' @ [229:9] ==> val node2b: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'smm' @ [229:16] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'executor' @ [229:20] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedPropertyDescriptor]

'flush' @ [229:29] ==> public abstract fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor[DeserializedSimpleFunctionDescriptor]

'fut1' @ [230:9] ==> val fut1: CordaFuture<*> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'getOrThrow' @ [230:14] ==> public fun <V> Future<out Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'receivedSessionMessages' @ [232:29] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'count' @ [232:53] ==> public inline fun <T> Iterable<FlowFrameworkTests.SessionTransfer>.count(predicate: (FlowFrameworkTests.SessionTransfer) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SessionTransfer

'it' @ [232:61] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`.<anonymous>[ValueParameterDescriptorImpl]

'isPayloadTransfer' @ [232:64] ==> public final val isPayloadTransfer: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [234:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'receivedCount' @ [234:25] ==> val receivedCount: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'assertTrue' @ [236:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sentCount' @ [236:20] ==> var sentCount: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'receivedCount' @ [236:32] ==> val receivedCount: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'node2b' @ [237:9] ==> val node2b: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'database' @ [237:16] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [237:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [238:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'node2b' @ [238:29] ==> val node2b: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'checkpointStorage' @ [238:36] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'checkpoints' @ [238:54] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'size' @ [238:68] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'node3' @ [240:9] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'database' @ [240:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [240:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [241:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'node3' @ [241:29] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'checkpointStorage' @ [241:35] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'checkpoints' @ [241:53] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'size' @ [241:67] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [243:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long?, actual: Long?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long?

'payload2' @ [243:22] ==> val payload2: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'firstAgain' @ [243:32] ==> val firstAgain: FlowFrameworkTests.PingPongFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'receivedPayload' @ [243:43] ==> @Transient public final var receivedPayload: Long? defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'assertEquals' @ [244:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long?, actual: Long?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long?

'payload2' @ [244:22] ==> val payload2: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'firstAgain' @ [244:36] ==> val firstAgain: FlowFrameworkTests.PingPongFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'receivedPayload2' @ [244:47] ==> @Transient public final var receivedPayload2: Long? defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'assertEquals' @ [245:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long?, actual: Long?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long?

'payload' @ [245:22] ==> val payload: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'secondFlow' @ [245:31] ==> val secondFlow: CordaFuture<FlowFrameworkTests.PingPongFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'getOrThrow' @ [245:42] ==> public fun <V> Future<FlowFrameworkTests.PingPongFlow>.getOrThrow(timeout: Duration? = ...): FlowFrameworkTests.PingPongFlow defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> PingPongFlow

'receivedPayload' @ [245:55] ==> @Transient public final var receivedPayload: Long? defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'assertEquals' @ [246:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Long?, actual: Long?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Long?

'payload' @ [246:22] ==> val payload: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'secondFlow' @ [246:35] ==> val secondFlow: CordaFuture<FlowFrameworkTests.PingPongFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`flow with send will resend on interrupted restart`[LocalVariableDescriptor]

'getOrThrow' @ [246:46] ==> public fun <V> Future<FlowFrameworkTests.PingPongFlow>.getOrThrow(timeout: Duration? = ...): FlowFrameworkTests.PingPongFlow defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> PingPongFlow

'receivedPayload2' @ [246:59] ==> @Transient public final var receivedPayload2: Long? defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'Test' @ [249:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [251:21] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [251:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [251:40] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [251:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [251:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [252:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [252:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node2' @ [253:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [253:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ReceiveFlow): CordaFuture<FlowFrameworkTests.ReceiveFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'SendFlow' @ [253:35] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'ReceiveFlow' @ [253:54] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'it' @ [253:66] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`.<anonymous>[ValueParameterDescriptorImpl]

'nonTerminating' @ [253:70] ==> public final fun nonTerminating(): FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[SimpleFunctionDescriptorImpl]

'node3' @ [254:9] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'registerFlowFactory' @ [254:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ReceiveFlow): CordaFuture<FlowFrameworkTests.ReceiveFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'SendFlow' @ [254:35] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'ReceiveFlow' @ [254:54] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'it' @ [254:66] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`.<anonymous>[ValueParameterDescriptorImpl]

'nonTerminating' @ [254:70] ==> public final fun nonTerminating(): FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[SimpleFunctionDescriptorImpl]

'node1' @ [256:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [256:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [256:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'SendFlow' @ [256:34] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'payload' @ [256:43] ==> val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'node2' @ [256:52] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [256:58] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [256:63] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node3' @ [256:78] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'info' @ [256:84] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [256:89] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [257:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [257:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node2' @ [258:25] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'getSingleFlow' @ [258:31] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.getSingleFlow(): Pair<FlowFrameworkTests.ReceiveFlow, CordaFuture<*>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'first' @ [258:60] ==> public final val first: FlowFrameworkTests.ReceiveFlow defined in kotlin.Pair[DeserializedPropertyDescriptor]

'node3' @ [259:25] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'getSingleFlow' @ [259:31] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.getSingleFlow(): Pair<FlowFrameworkTests.ReceiveFlow, CordaFuture<*>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'first' @ [259:60] ==> public final val first: FlowFrameworkTests.ReceiveFlow defined in kotlin.Pair[DeserializedPropertyDescriptor]

'assertThat' @ [260:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'node2Flow' @ [260:20] ==> val node2Flow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'receivedPayloads' @ [260:30] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'isEqualTo' @ [260:51] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'payload' @ [260:61] ==> val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'assertThat' @ [261:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'node3Flow' @ [261:20] ==> val node3Flow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'receivedPayloads' @ [261:30] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'isEqualTo' @ [261:51] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'payload' @ [261:61] ==> val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'assertSessionTransfers' @ [263:9] ==> private final fun assertSessionTransfers(node: MockNetwork.MockNode, vararg expected: FlowFrameworkTests.SessionTransfer): List<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node2' @ [263:32] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [264:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [264:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'SendFlow' @ [264:40] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'payload' @ [264:67] ==> val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'node2' @ [264:79] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [265:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [265:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [265:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [266:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'normalEnd' @ [266:28] ==> private final val normalEnd: NormalSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [266:41] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'assertSessionTransfers' @ [270:9] ==> private final fun assertSessionTransfers(node: MockNetwork.MockNode, vararg expected: FlowFrameworkTests.SessionTransfer): List<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node3' @ [270:32] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'node1' @ [271:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [271:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'SendFlow' @ [271:40] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'payload' @ [271:67] ==> val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'node3' @ [271:79] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'node3' @ [272:17] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'sessionConfirm' @ [272:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [272:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [273:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'normalEnd' @ [273:28] ==> private final val normalEnd: NormalSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node3' @ [273:41] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'node2' @ [277:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'acceptableLiveFiberCountOnStop' @ [277:15] ==> public final var acceptableLiveFiberCountOnStop: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'node3' @ [278:9] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`sending to multiple parties`[LocalVariableDescriptor]

'acceptableLiveFiberCountOnStop' @ [278:15] ==> public final var acceptableLiveFiberCountOnStop: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [281:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [283:21] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [283:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [283:40] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [283:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [283:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [284:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [284:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node2' @ [287:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [287:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SendFlow): CordaFuture<FlowFrameworkTests.SendFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SendFlow

'ReceiveFlow' @ [287:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'SendFlow' @ [287:57] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'node2Payload' @ [287:66] ==> val node2Payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'it' @ [287:80] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`.<anonymous>[ValueParameterDescriptorImpl]

'node3' @ [288:9] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'registerFlowFactory' @ [288:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SendFlow): CordaFuture<FlowFrameworkTests.SendFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SendFlow

'ReceiveFlow' @ [288:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'SendFlow' @ [288:57] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'node3Payload' @ [288:66] ==> val node3Payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'it' @ [288:80] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`.<anonymous>[ValueParameterDescriptorImpl]

'ReceiveFlow' @ [289:32] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [289:44] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [289:50] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [289:55] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node3' @ [289:70] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'info' @ [289:76] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [289:81] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'nonTerminating' @ [289:96] ==> public final fun nonTerminating(): FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[SimpleFunctionDescriptorImpl]

'node1' @ [290:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [290:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [290:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'multiReceiveFlow' @ [290:34] ==> val multiReceiveFlow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'node1' @ [291:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'acceptableLiveFiberCountOnStop' @ [291:15] ==> public final var acceptableLiveFiberCountOnStop: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'mockNet' @ [292:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [292:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [293:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'multiReceiveFlow' @ [293:20] ==> val multiReceiveFlow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'receivedPayloads' @ [293:37] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'isEqualTo' @ [293:58] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'node2Payload' @ [293:68] ==> val node2Payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'assertThat' @ [294:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'multiReceiveFlow' @ [294:20] ==> val multiReceiveFlow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'receivedPayloads' @ [294:37] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'isEqualTo' @ [294:58] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'node3Payload' @ [294:68] ==> val node3Payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'assertSessionTransfers' @ [296:9] ==> private final fun assertSessionTransfers(node: MockNetwork.MockNode, vararg expected: FlowFrameworkTests.SessionTransfer): List<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node2' @ [296:32] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [297:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [297:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'ReceiveFlow' @ [297:40] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [297:63] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [298:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [298:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [298:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [299:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionData' @ [299:28] ==> private final fun sessionData(payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node2Payload' @ [299:40] ==> val node2Payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'node1' @ [299:57] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [300:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'normalEnd' @ [300:28] ==> private final val normalEnd: NormalSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [300:41] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'assertSessionTransfers' @ [303:9] ==> private final fun assertSessionTransfers(node: MockNetwork.MockNode, vararg expected: FlowFrameworkTests.SessionTransfer): List<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node3' @ [303:32] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'node1' @ [304:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [304:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'ReceiveFlow' @ [304:40] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node3' @ [304:63] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'node3' @ [305:17] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'sessionConfirm' @ [305:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [305:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node3' @ [306:17] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'sessionData' @ [306:28] ==> private final fun sessionData(payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node3Payload' @ [306:40] ==> val node3Payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'node1' @ [306:57] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node3' @ [307:17] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving from multiple parties`[LocalVariableDescriptor]

'normalEnd' @ [307:28] ==> private final val normalEnd: NormalSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [307:41] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'Test' @ [311:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [313:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [313:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.PingPongFlow): CordaFuture<FlowFrameworkTests.PingPongFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> PingPongFlow

'PingPongFlow' @ [313:35] ==> public constructor PingPongFlow(otherParty: Party, payload: Long) defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[ClassConstructorDescriptorImpl]

'PingPongFlow' @ [313:58] ==> public constructor PingPongFlow(otherParty: Party, payload: Long) defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[ClassConstructorDescriptorImpl]

'it' @ [313:71] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`both sides do a send as their first IO request`.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [314:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [314:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [314:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'PingPongFlow' @ [314:34] ==> public constructor PingPongFlow(otherParty: Party, payload: Long) defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[ClassConstructorDescriptorImpl]

'node2' @ [314:47] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [314:53] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [314:58] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [315:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [315:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertSessionTransfers' @ [317:9] ==> private final fun assertSessionTransfers(vararg expected: FlowFrameworkTests.SessionTransfer): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [318:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [318:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'PingPongFlow' @ [318:40] ==> public constructor PingPongFlow(otherParty: Party, payload: Long) defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[ClassConstructorDescriptorImpl]

'node2' @ [318:79] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [319:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [319:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [319:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [320:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionData' @ [320:28] ==> private final fun sessionData(payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [320:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [321:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionData' @ [321:28] ==> private final fun sessionData(payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node2' @ [321:48] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [322:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionData' @ [322:28] ==> private final fun sessionData(payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [322:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [323:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'normalEnd' @ [323:28] ==> private final val normalEnd: NormalSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [323:41] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [324:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'normalEnd' @ [324:28] ==> private final val normalEnd: NormalSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [324:41] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'Test' @ [328:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [330:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party, actual: Party, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party

'notary1' @ [330:22] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [330:30] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [330:35] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'notary2' @ [330:51] ==> private final lateinit var notary2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [330:59] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [330:64] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node1' @ [331:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [331:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [331:24] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [331:34] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'DOLLARS' @ [332:22] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [333:17] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [333:29] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'notary1' @ [334:17] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [334:25] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [334:30] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'..' @ [336:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'node1' @ [337:24] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [337:30] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [337:39] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashPaymentFlow' @ [337:49] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party, anonymous: Boolean) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'DOLLARS' @ [337:69] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'node2' @ [337:78] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [337:84] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [337:89] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [338:13] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [338:21] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'flow' @ [339:13] ==> val flow: FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'resultFuture' @ [339:18] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [339:31] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'mockNet' @ [341:24] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'messagingNetwork' @ [341:32] ==> public final val messagingNetwork: InMemoryMessagingNetwork defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'endpoint' @ [341:49] ==> public final fun endpoint(peer: InMemoryMessagingNetwork.PeerHandle): InMemoryMessagingNetwork.InMemoryMessaging? defined in net.corda.testing.node.InMemoryMessagingNetwork[DeserializedSimpleFunctionDescriptor]

'notary1' @ [341:58] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [341:66] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [341:74] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'notary1' @ [342:26] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [342:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [342:43] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getPartyInfo' @ [342:59] ==> public abstract fun getPartyInfo(party: Party): PartyInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'notary1' @ [342:72] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [342:80] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [342:85] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'assertTrue' @ [343:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'party1Info' @ [343:20] ==> val party1Info: PartyInfo defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'endpoint' @ [344:49] ==> val endpoint: InMemoryMessagingNetwork.InMemoryMessaging defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'getAddressOfParty' @ [344:58] ==> public open fun getAddressOfParty(partyInfo: PartyInfo): MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[DeserializedSimpleFunctionDescriptor]

'notary1' @ [344:76] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [344:84] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [344:93] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getPartyInfo' @ [344:109] ==> public abstract fun getPartyInfo(party: Party): PartyInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'notary1' @ [344:122] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [344:130] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [344:135] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'assertThat' @ [345:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (MessageRecipients..MessageRecipients?)): (AbstractObjectAssert<*, (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<*, (MessageRecipients..MessageRecipients?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageRecipients

'notary1Address' @ [345:20] ==> val notary1Address: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'isInstanceOf' @ [345:36] ==> public open fun isInstanceOf(p0: (Class<*>..Class<*>?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>?), (MessageRecipients..MessageRecipients?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'InMemoryMessagingNetwork' @ [345:49] ==> public companion object defined in net.corda.testing.node.InMemoryMessagingNetwork[FakeCallableDescriptorForObject]

'ServiceHandle' @ [345:74] ==> public constructor ServiceHandle(service: ServiceEntry) defined in net.corda.testing.node.InMemoryMessagingNetwork.ServiceHandle[DeserializedClassConstructorDescriptor]

'java' @ [345:95] ==> public val <T> KClass<InMemoryMessagingNetwork.ServiceHandle>.java: Class<InMemoryMessagingNetwork.ServiceHandle> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ServiceHandle

'assertEquals' @ [346:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: MessageRecipients, actual: MessageRecipients, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> MessageRecipients

'notary1Address' @ [346:22] ==> val notary1Address: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'endpoint' @ [346:38] ==> val endpoint: InMemoryMessagingNetwork.InMemoryMessaging defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'getAddressOfParty' @ [346:47] ==> public open fun getAddressOfParty(partyInfo: PartyInfo): MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[DeserializedSimpleFunctionDescriptor]

'notary2' @ [346:65] ==> private final lateinit var notary2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [346:73] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkMapCache' @ [346:82] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getPartyInfo' @ [346:98] ==> public abstract fun getPartyInfo(party: Party): PartyInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'notary2' @ [346:111] ==> private final lateinit var notary2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [346:119] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [346:124] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'receivedSessionMessages' @ [347:9] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'expectEvents' @ [347:33] ==> public fun <E : Any> Iterable<FlowFrameworkTests.SessionTransfer>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<FlowFrameworkTests.SessionTransfer>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> SessionTransfer

'sequence' @ [348:13] ==> public fun <E> sequence(vararg expectations: ExpectCompose<FlowFrameworkTests.SessionTransfer>): ExpectCompose<FlowFrameworkTests.SessionTransfer> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E> -> SessionTransfer

'expect' @ [350:21] ==> public inline fun <reified E : Any> expect(noinline match: (FlowFrameworkTests.SessionTransfer) -> Boolean = ..., noinline expectClosure: (FlowFrameworkTests.SessionTransfer) -> Unit): ExpectCompose<FlowFrameworkTests.SessionTransfer> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SessionTransfer

'it' @ [350:38] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [350:41] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'it' @ [350:67] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [350:70] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'initiatingFlowClass' @ [350:78] ==> public final val initiatingFlowClass: String defined in net.corda.node.services.statemachine.SessionInit[DeserializedPropertyDescriptor]

'NotaryFlow' @ [350:101] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [350:112] ==> public companion object defined in net.corda.core.flows.NotaryFlow.Client[FakeCallableDescriptorForObject]

'java' @ [350:126] ==> public val <T> KClass<NotaryFlow.Client>.java: Class<NotaryFlow.Client> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Client

'name' @ [350:131] ==> public final val <T : (Any..Any?)> Class<NotaryFlow.Client>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Client

'it' @ [351:25] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [351:28] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [352:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'node1' @ [352:38] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'id' @ [352:44] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [352:48] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [352:51] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [353:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: MessageRecipients, actual: MessageRecipients, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> MessageRecipients

'notary1Address' @ [353:38] ==> val notary1Address: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'it' @ [353:54] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [353:57] ==> public final val to: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'expect' @ [355:21] ==> public inline fun <reified E : Any> expect(noinline match: (FlowFrameworkTests.SessionTransfer) -> Boolean = ..., noinline expectClosure: (FlowFrameworkTests.SessionTransfer) -> Unit): ExpectCompose<FlowFrameworkTests.SessionTransfer> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SessionTransfer

'it' @ [355:38] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [355:41] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'it' @ [356:25] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [356:28] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [357:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'notary1' @ [357:38] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'id' @ [357:46] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [357:50] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [357:53] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'expect' @ [360:21] ==> public inline fun <reified E : Any> expect(noinline match: (FlowFrameworkTests.SessionTransfer) -> Boolean = ..., noinline expectClosure: (FlowFrameworkTests.SessionTransfer) -> Unit): ExpectCompose<FlowFrameworkTests.SessionTransfer> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SessionTransfer

'it' @ [360:38] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [360:41] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'it' @ [360:67] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [360:70] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'initiatingFlowClass' @ [360:78] ==> public final val initiatingFlowClass: String defined in net.corda.node.services.statemachine.SessionInit[DeserializedPropertyDescriptor]

'NotaryFlow' @ [360:101] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [360:112] ==> public companion object defined in net.corda.core.flows.NotaryFlow.Client[FakeCallableDescriptorForObject]

'java' @ [360:126] ==> public val <T> KClass<NotaryFlow.Client>.java: Class<NotaryFlow.Client> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Client

'name' @ [360:131] ==> public final val <T : (Any..Any?)> Class<NotaryFlow.Client>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Client

'it' @ [361:25] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [361:28] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [362:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'node1' @ [362:38] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'id' @ [362:44] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [362:48] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [362:51] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [363:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: MessageRecipients, actual: MessageRecipients, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> MessageRecipients

'notary1Address' @ [363:38] ==> val notary1Address: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'it' @ [363:54] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [363:57] ==> public final val to: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'expect' @ [365:21] ==> public inline fun <reified E : Any> expect(noinline match: (FlowFrameworkTests.SessionTransfer) -> Boolean = ..., noinline expectClosure: (FlowFrameworkTests.SessionTransfer) -> Unit): ExpectCompose<FlowFrameworkTests.SessionTransfer> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SessionTransfer

'it' @ [365:38] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [365:41] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'it' @ [366:25] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [366:28] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [367:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'notary2' @ [367:38] ==> private final lateinit var notary2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'id' @ [367:46] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [367:50] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [367:53] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'expect' @ [370:21] ==> public inline fun <reified E : Any> expect(noinline match: (FlowFrameworkTests.SessionTransfer) -> Boolean = ..., noinline expectClosure: (FlowFrameworkTests.SessionTransfer) -> Unit): ExpectCompose<FlowFrameworkTests.SessionTransfer> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SessionTransfer

'it' @ [370:38] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [370:41] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'it' @ [370:67] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [370:70] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'initiatingFlowClass' @ [370:78] ==> public final val initiatingFlowClass: String defined in net.corda.node.services.statemachine.SessionInit[DeserializedPropertyDescriptor]

'NotaryFlow' @ [370:101] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [370:112] ==> public companion object defined in net.corda.core.flows.NotaryFlow.Client[FakeCallableDescriptorForObject]

'java' @ [370:126] ==> public val <T> KClass<NotaryFlow.Client>.java: Class<NotaryFlow.Client> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Client

'name' @ [370:131] ==> public final val <T : (Any..Any?)> Class<NotaryFlow.Client>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Client

'it' @ [371:25] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [371:28] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [372:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'node1' @ [372:38] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'id' @ [372:44] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [372:48] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [372:51] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [373:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: MessageRecipients, actual: MessageRecipients, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> MessageRecipients

'notary1Address' @ [373:38] ==> val notary1Address: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`[LocalVariableDescriptor]

'it' @ [373:54] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [373:57] ==> public final val to: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'expect' @ [375:21] ==> public inline fun <reified E : Any> expect(noinline match: (FlowFrameworkTests.SessionTransfer) -> Boolean = ..., noinline expectClosure: (FlowFrameworkTests.SessionTransfer) -> Unit): ExpectCompose<FlowFrameworkTests.SessionTransfer> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SessionTransfer

'it' @ [375:38] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [375:41] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'it' @ [376:25] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [376:28] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertEquals' @ [377:25] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'it' @ [377:38] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`different notaries are picked when addressing shared notary identity`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [377:41] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'notary1' @ [377:47] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'id' @ [377:55] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'Test' @ [383:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [385:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [385:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.NoOpFlow): CordaFuture<FlowFrameworkTests.NoOpFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> NoOpFlow

'ReceiveFlow' @ [385:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'NoOpFlow' @ [385:57] ==> public constructor NoOpFlow(nonTerminating: Boolean = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[ClassConstructorDescriptorImpl]

'node1' @ [386:28] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [386:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [386:43] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ReceiveFlow' @ [386:53] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [386:65] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [386:71] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [386:76] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [386:92] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [387:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [387:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [388:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>..Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>?)): (ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> UnexpectedFlowEndException

'java' @ [388:69] ==> public val <T> KClass<UnexpectedFlowEndException>.java: Class<UnexpectedFlowEndException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnexpectedFlowEndException

'isThrownBy' @ [388:75] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'resultFuture' @ [389:13] ==> val resultFuture: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`other side ends before doing expected send`[LocalVariableDescriptor]

'getOrThrow' @ [389:26] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'withMessageContaining' @ [390:11] ==> public open fun withMessageContaining(p0: (String..String?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'String' @ [390:33] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [390:47] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'name' @ [390:52] ==> public final val <T : (Any..Any?)> Class<String>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'Test' @ [393:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [395:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [395:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.NoOpFlow): CordaFuture<FlowFrameworkTests.NoOpFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> NoOpFlow

'WaitForOtherSideEndBeforeSendAndReceive' @ [395:35] ==> public constructor WaitForOtherSideEndBeforeSendAndReceive(otherParty: Party, receivedOtherFlowEnd: Semaphore) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitForOtherSideEndBeforeSendAndReceive[ClassConstructorDescriptorImpl]

'NoOpFlow' @ [395:85] ==> public constructor NoOpFlow(nonTerminating: Boolean = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[ClassConstructorDescriptorImpl]

'Semaphore' @ [396:34] ==> public constructor Semaphore(p0: Int) defined in co.paralleluniverse.strands.concurrent.Semaphore[JavaClassConstructorDescriptor]

'receivedSessionMessagesObservable' @ [397:9] ==> private final fun receivedSessionMessagesObservable(): Observable<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'filter' @ [397:45] ==> public final fun filter(p0: (((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> (Boolean..Boolean?)..(((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> (Boolean..Boolean?))?)): (Observable<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..Observable<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [397:54] ==> value-parameter it: (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving unexpected session end before entering sendAndReceive`.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [397:57] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'subscribe' @ [397:81] ==> public final fun subscribe(p0: (((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> Unit..(((FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'sessionEndReceived' @ [397:93] ==> val sessionEndReceived: Semaphore defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving unexpected session end before entering sendAndReceive`[LocalVariableDescriptor]

'release' @ [397:112] ==> public open fun release(): Unit defined in co.paralleluniverse.strands.concurrent.Semaphore[JavaMethodDescriptor]

'node1' @ [398:28] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [398:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [398:43] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'WaitForOtherSideEndBeforeSendAndReceive' @ [399:17] ==> public constructor WaitForOtherSideEndBeforeSendAndReceive(otherParty: Party, receivedOtherFlowEnd: Semaphore) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitForOtherSideEndBeforeSendAndReceive[ClassConstructorDescriptorImpl]

'node2' @ [399:57] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [399:63] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [399:68] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'sessionEndReceived' @ [399:83] ==> val sessionEndReceived: Semaphore defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving unexpected session end before entering sendAndReceive`[LocalVariableDescriptor]

'resultFuture' @ [399:104] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [400:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [400:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [401:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>..Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>?)): (ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> UnexpectedFlowEndException

'java' @ [401:69] ==> public val <T> KClass<UnexpectedFlowEndException>.java: Class<UnexpectedFlowEndException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnexpectedFlowEndException

'isThrownBy' @ [401:75] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'resultFuture' @ [402:13] ==> val resultFuture: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`receiving unexpected session end before entering sendAndReceive`[LocalVariableDescriptor]

'getOrThrow' @ [402:26] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'InitiatingFlow' @ [406:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'Transient' @ [408:59] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [408:109] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [409:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'send' @ [412:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitForOtherSideEndBeforeSendAndReceive[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [412:18] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitForOtherSideEndBeforeSendAndReceive[PropertyDescriptorImpl]

'receivedOtherFlowEnd' @ [414:13] ==> @Transient public final val receivedOtherFlowEnd: Semaphore defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitForOtherSideEndBeforeSendAndReceive[PropertyDescriptorImpl]

'acquire' @ [414:34] ==> @Suspendable @Instrumented public open fun acquire(): Unit defined in co.paralleluniverse.strands.concurrent.Semaphore[JavaMethodDescriptor]

'sendAndReceive' @ [415:13] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<Int> defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitForOtherSideEndBeforeSendAndReceive[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Int

'otherParty' @ [415:33] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitForOtherSideEndBeforeSendAndReceive[PropertyDescriptorImpl]

'Test' @ [419:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [421:34] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [421:40] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>): CordaFuture<FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ExceptionFlow<Exception>

'ReceiveFlow' @ [421:60] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'ExceptionFlow' @ [422:13] ==> public constructor ExceptionFlow<E : Exception /* = Exception */>(exception: () -> Exception /* = Exception */) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Exception /* = Exception */> -> Exception

'Exception' @ [422:29] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'erroringFlowFuture' @ [424:33] ==> val erroringFlowFuture: CordaFuture<FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'flatMap' @ [424:52] ==> public fun <V, W> CordaFuture<out FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>>.flatMap(transform: (FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>) -> CordaFuture<out List<Notification<ProgressTracker.Step>>>): CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> ExceptionFlow<Exception>
    <W> -> List<Notification<Step>>

'it' @ [424:62] ==> value-parameter it: FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`.<anonymous>[ValueParameterDescriptorImpl]

'progressSteps' @ [424:65] ==> private final val FlowLogic<*>.progressSteps: CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'ReceiveFlow' @ [426:27] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [426:39] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [426:45] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [426:50] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'receiveFlow' @ [427:32] ==> val receiveFlow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'progressSteps' @ [427:44] ==> private final val FlowLogic<*>.progressSteps: CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [428:33] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [428:39] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [428:48] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'receiveFlow' @ [428:58] ==> val receiveFlow: FlowFrameworkTests.ReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'resultFuture' @ [428:71] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [430:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [430:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [432:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..List<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?)): (ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Notification<Step>

'erroringFlowSteps' @ [432:20] ==> val erroringFlowSteps: CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'get' @ [432:38] ==> public abstract fun get(): (List<Notification<ProgressTracker.Step>>..List<Notification<ProgressTracker.Step>>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'containsExactly' @ [432:45] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)): (ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'createOnNext' @ [433:30] ==> public open fun <T : (Any..Any?)> createOnNext(p0: (ProgressTracker.Step..ProgressTracker.Step?)): (Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?) defined in rx.Notification[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Step

'START_STEP' @ [433:57] ==> public object START_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[FakeCallableDescriptorForObject]

'createOnError' @ [434:30] ==> public open fun <T : (Any..Any?)> createOnError(p0: (Throwable..Throwable?)): (Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?) defined in rx.Notification[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Step

'erroringFlowFuture' @ [434:44] ==> val erroringFlowFuture: CordaFuture<FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'get' @ [434:63] ==> public abstract fun get(): (FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>..FlowFrameworkTests.ExceptionFlow<Exception /* = Exception */>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'exceptionThrown' @ [434:69] ==> public final lateinit var exceptionThrown: Exception /* = Exception */ defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[PropertyDescriptorImpl]

'assertFailsWith' @ [437:36] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<UnexpectedFlowEndException>, block: () -> Unit): UnexpectedFlowEndException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> UnexpectedFlowEndException

'receiveFlowResult' @ [438:13] ==> val receiveFlowResult: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'getOrThrow' @ [438:31] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'assertThat' @ [440:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'receiveFlowException' @ [440:20] ==> val receiveFlowException: UnexpectedFlowEndException defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'message' @ [440:41] ==> public open val message: String? defined in net.corda.core.flows.UnexpectedFlowEndException[DeserializedPropertyDescriptor]

'doesNotContain' @ [440:50] ==> public open fun doesNotContain(p0: (CharSequence..CharSequence?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'assertThat' @ [441:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..List<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?)): (ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Notification<Step>

'receiveFlowSteps' @ [441:20] ==> val receiveFlowSteps: CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'get' @ [441:37] ==> public abstract fun get(): (List<Notification<ProgressTracker.Step>>..List<Notification<ProgressTracker.Step>>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'containsExactly' @ [441:44] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)): (ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'createOnNext' @ [442:30] ==> public open fun <T : (Any..Any?)> createOnNext(p0: (ProgressTracker.Step..ProgressTracker.Step?)): (Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?) defined in rx.Notification[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Step

'START_STEP' @ [442:55] ==> public object START_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[FakeCallableDescriptorForObject]

'createOnError' @ [443:30] ==> public open fun <T : (Any..Any?)> createOnError(p0: (Throwable..Throwable?)): (Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?) defined in rx.Notification[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Step

'receiveFlowException' @ [443:44] ==> val receiveFlowException: UnexpectedFlowEndException defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-FlowException thrown on other side`[LocalVariableDescriptor]

'assertSessionTransfers' @ [446:9] ==> private final fun assertSessionTransfers(vararg expected: FlowFrameworkTests.SessionTransfer): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [447:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [447:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'ReceiveFlow' @ [447:40] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [447:63] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [448:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [448:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [448:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [449:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'erroredEnd' @ [449:28] ==> private final fun erroredEnd(errorResponse: FlowException? = ...): ErrorSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [449:44] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'Test' @ [453:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [455:28] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [455:34] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>): CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ExceptionFlow<MyFlowException>

'ReceiveFlow' @ [455:54] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'ExceptionFlow' @ [456:13] ==> public constructor ExceptionFlow<E : Exception /* = Exception */>(exception: () -> FlowFrameworkTests.MyFlowException) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Exception /* = Exception */> -> MyFlowException

'MyFlowException' @ [456:29] ==> public constructor MyFlowException(message: String) defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[ClassConstructorDescriptorImpl]

'erroringFlow' @ [458:33] ==> val erroringFlow: CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`[LocalVariableDescriptor]

'flatMap' @ [458:46] ==> public fun <V, W> CordaFuture<out FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>>.flatMap(transform: (FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>) -> CordaFuture<out List<Notification<ProgressTracker.Step>>>): CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> ExceptionFlow<MyFlowException>
    <W> -> List<Notification<Step>>

'it' @ [458:56] ==> value-parameter it: FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`.<anonymous>[ValueParameterDescriptorImpl]

'progressSteps' @ [458:59] ==> private final val FlowLogic<*>.progressSteps: CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [460:30] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [460:36] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [460:45] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ReceiveFlow' @ [460:55] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [460:67] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [460:73] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [460:78] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [462:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [462:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [464:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..Class<out (FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?)): (ThrowableTypeAssert<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableTypeAssert<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> MyFlowException

'MyFlowException' @ [464:35] ==> public constructor MyFlowException(message: String) defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[ClassConstructorDescriptorImpl]

'java' @ [464:58] ==> public val <T> KClass<FlowFrameworkTests.MyFlowException>.java: Class<FlowFrameworkTests.MyFlowException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MyFlowException

'isThrownBy' @ [465:18] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'receivingFiber' @ [465:31] ==> val receivingFiber: FlowStateMachineImpl<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`[LocalVariableDescriptor]

'resultFuture' @ [465:46] ==> public open val resultFuture: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[DeserializedPropertyDescriptor]

'getOrThrow' @ [465:59] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'withMessage' @ [466:18] ==> public open fun withMessage(p0: (String..String?)): (ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'withStackTraceContaining' @ [467:18] ==> public open fun withStackTraceContaining(p0: (String..String?)): (ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'ReceiveFlow' @ [467:43] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'java' @ [467:62] ==> public val <T> KClass<FlowFrameworkTests.ReceiveFlow>.java: Class<FlowFrameworkTests.ReceiveFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReceiveFlow

'name' @ [467:67] ==> public final val <T : (Any..Any?)> Class<FlowFrameworkTests.ReceiveFlow>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ReceiveFlow

'node2' @ [468:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'database' @ [468:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [468:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertThat' @ [469:13] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Checkpoint..Checkpoint?)>..List<(Checkpoint..Checkpoint?)>?)): (ListAssert<(Checkpoint..Checkpoint?)>..ListAssert<(Checkpoint..Checkpoint?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Checkpoint

'node2' @ [469:24] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'checkpointStorage' @ [469:30] ==> public final lateinit var checkpointStorage: CheckpointStorage defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'checkpoints' @ [469:48] ==> internal fun CheckpointStorage.checkpoints(): List<Checkpoint> defined in net.corda.node.services.persistence[SimpleFunctionDescriptorImpl]

'isEmpty' @ [469:63] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'assertThat' @ [472:9] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'receivingFiber' @ [472:20] ==> val receivingFiber: FlowStateMachineImpl<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`[LocalVariableDescriptor]

'isTerminated' @ [472:35] ==> public final val <R> FlowStateMachineImpl<Unit>.isTerminated: Boolean[MyPropertyDescriptor]
Inferred types:
    <R> -> Unit

'isTrue' @ [472:49] ==> public open fun isTrue(): (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractBooleanAssert[JavaMethodDescriptor]

'assertThat' @ [473:9] ==> @CheckReturnValue public open fun assertThat(p0: Boolean): (AbstractBooleanAssert<*>..AbstractBooleanAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'erroringFlow' @ [473:21] ==> val erroringFlow: CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`[LocalVariableDescriptor]

'get' @ [473:34] ==> public abstract fun get(): (FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>..FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'stateMachine' @ [473:40] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[DeserializedPropertyDescriptor]

'isTerminated' @ [473:78] ==> public final val <R> FlowStateMachineImpl<out Any?>.isTerminated: Boolean[MyPropertyDescriptor]
Inferred types:
    <R> -> Any?

'isTrue' @ [473:92] ==> public open fun isTrue(): (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>..AbstractBooleanAssert<out (AbstractBooleanAssert<out Any?>..AbstractBooleanAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractBooleanAssert[JavaMethodDescriptor]

'assertThat' @ [474:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..List<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?)): (ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> Notification<Step>

'erroringFlowSteps' @ [474:20] ==> val erroringFlowSteps: CordaFuture<List<Notification<ProgressTracker.Step>>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`[LocalVariableDescriptor]

'get' @ [474:38] ==> public abstract fun get(): (List<Notification<ProgressTracker.Step>>..List<Notification<ProgressTracker.Step>>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'containsExactly' @ [474:45] ==> @SafeVarargs public final fun containsExactly(vararg p0: (Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)): (ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>..ListAssert<(Notification<ProgressTracker.Step>..Notification<ProgressTracker.Step>?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'createOnNext' @ [475:30] ==> public open fun <T : (Any..Any?)> createOnNext(p0: (ProgressTracker.Step..ProgressTracker.Step?)): (Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?) defined in rx.Notification[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Step

'START_STEP' @ [475:57] ==> public object START_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[FakeCallableDescriptorForObject]

'createOnError' @ [476:30] ==> public open fun <T : (Any..Any?)> createOnError(p0: (Throwable..Throwable?)): (Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?) defined in rx.Notification[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Step

'erroringFlow' @ [476:44] ==> val erroringFlow: CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`[LocalVariableDescriptor]

'get' @ [476:57] ==> public abstract fun get(): (FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>..FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'exceptionThrown' @ [476:63] ==> public final lateinit var exceptionThrown: FlowFrameworkTests.MyFlowException defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[PropertyDescriptorImpl]

'assertSessionTransfers' @ [479:9] ==> private final fun assertSessionTransfers(vararg expected: FlowFrameworkTests.SessionTransfer): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [480:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [480:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'ReceiveFlow' @ [480:40] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [480:63] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [481:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [481:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [481:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [482:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'erroredEnd' @ [482:28] ==> private final fun erroredEnd(errorResponse: FlowException? = ...): ErrorSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'erroringFlow' @ [482:39] ==> val erroringFlow: CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown on other side`[LocalVariableDescriptor]

'get' @ [482:52] ==> public abstract fun get(): (FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>..FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'exceptionThrown' @ [482:58] ==> public final lateinit var exceptionThrown: FlowFrameworkTests.MyFlowException defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[PropertyDescriptorImpl]

'node1' @ [482:78] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'assertThat' @ [485:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)): (AbstractObjectArrayAssert<*, (StackTraceElement..StackTraceElement?)>..AbstractObjectArrayAssert<*, (StackTraceElement..StackTraceElement?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StackTraceElement

'!!' @ [485:20] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: FlowException?): FlowException[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> FlowException

'receivedSessionMessages' @ [485:21] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'last' @ [485:45] ==> public fun <T> List<FlowFrameworkTests.SessionTransfer>.last(): FlowFrameworkTests.SessionTransfer defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SessionTransfer

'message' @ [485:52] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'errorResponse' @ [485:80] ==> public final val errorResponse: FlowException? defined in net.corda.node.services.statemachine.ErrorSessionEnd[DeserializedPropertyDescriptor]

'stackTrace' @ [485:96] ==> public final var FlowException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'isEmpty' @ [485:108] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.AbstractObjectArrayAssert[JavaMethodDescriptor]

'Test' @ [488:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [490:21] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [490:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [490:40] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [490:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [490:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [491:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [491:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node3' @ [493:9] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException propagated in invocation chain`[LocalVariableDescriptor]

'registerFlowFactory' @ [493:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>): CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ExceptionFlow<MyFlowException>

'ReceiveFlow' @ [493:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'ExceptionFlow' @ [493:57] ==> public constructor ExceptionFlow<E : Exception /* = Exception */>(exception: () -> FlowFrameworkTests.MyFlowException) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Exception /* = Exception */> -> MyFlowException

'MyFlowException' @ [493:73] ==> public constructor MyFlowException(message: String) defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[ClassConstructorDescriptorImpl]

'node2' @ [494:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [494:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ReceiveFlow): CordaFuture<FlowFrameworkTests.ReceiveFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'ReceiveFlow' @ [494:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'ReceiveFlow' @ [494:57] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node3' @ [494:69] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException propagated in invocation chain`[LocalVariableDescriptor]

'info' @ [494:75] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [494:80] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node1' @ [495:30] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [495:36] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [495:45] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ReceiveFlow' @ [495:55] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [495:67] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [495:73] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [495:78] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [496:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [496:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [497:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..Class<out (FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?)): (ThrowableTypeAssert<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableTypeAssert<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> MyFlowException

'MyFlowException' @ [497:35] ==> public constructor MyFlowException(message: String) defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[ClassConstructorDescriptorImpl]

'java' @ [497:58] ==> public val <T> KClass<FlowFrameworkTests.MyFlowException>.java: Class<FlowFrameworkTests.MyFlowException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MyFlowException

'isThrownBy' @ [498:18] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'receivingFiber' @ [498:31] ==> val receivingFiber: FlowStateMachine<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException propagated in invocation chain`[LocalVariableDescriptor]

'resultFuture' @ [498:46] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [498:59] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'withMessage' @ [499:18] ==> public open fun withMessage(p0: (String..String?)): (ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'Test' @ [502:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [504:21] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'createNode' @ [504:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [504:40] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'network' @ [504:46] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [504:54] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [505:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [505:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node2' @ [509:26] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [510:18] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SendAndReceiveFlow): CordaFuture<FlowFrameworkTests.SendAndReceiveFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SendAndReceiveFlow

'ReceiveFlow' @ [510:38] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'SendAndReceiveFlow' @ [510:60] ==> public constructor SendAndReceiveFlow(otherParty: Party, payload: Any) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[ClassConstructorDescriptorImpl]

'it' @ [510:79] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown and there is a 3rd unrelated party flow`.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [511:18] ==> public fun <V, W> CordaFuture<out FlowFrameworkTests.SendAndReceiveFlow>.map(transform: (FlowFrameworkTests.SendAndReceiveFlow) -> FlowStateMachine<out Any?>): CordaFuture<FlowStateMachine<out Any?>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SendAndReceiveFlow
    <W> -> FlowStateMachine<out Any?>

'it' @ [511:24] ==> value-parameter it: FlowFrameworkTests.SendAndReceiveFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown and there is a 3rd unrelated party flow`.<anonymous>[ValueParameterDescriptorImpl]

'stateMachine' @ [511:27] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[DeserializedPropertyDescriptor]

'node3' @ [512:9] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown and there is a 3rd unrelated party flow`[LocalVariableDescriptor]

'registerFlowFactory' @ [512:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>): CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.MyFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ExceptionFlow<MyFlowException>

'ReceiveFlow' @ [512:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'ExceptionFlow' @ [512:57] ==> public constructor ExceptionFlow<E : Exception /* = Exception */>(exception: () -> FlowFrameworkTests.MyFlowException) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Exception /* = Exception */> -> MyFlowException

'MyFlowException' @ [512:73] ==> public constructor MyFlowException(message: String) defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[ClassConstructorDescriptorImpl]

'node1' @ [514:26] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [514:32] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [514:41] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ReceiveFlow' @ [514:51] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [514:63] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [514:69] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [514:74] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node3' @ [514:89] ==> val node3: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown and there is a 3rd unrelated party flow`[LocalVariableDescriptor]

'info' @ [514:95] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [514:100] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [515:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [515:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [519:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..Class<out (FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?)): (ThrowableTypeAssert<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableTypeAssert<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> MyFlowException

'MyFlowException' @ [519:35] ==> public constructor MyFlowException(message: String) defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[ClassConstructorDescriptorImpl]

'java' @ [519:58] ==> public val <T> KClass<FlowFrameworkTests.MyFlowException>.java: Class<FlowFrameworkTests.MyFlowException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MyFlowException

'isThrownBy' @ [519:64] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>..ThrowableAssertAlternative<(FlowFrameworkTests.MyFlowException..FlowFrameworkTests.MyFlowException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'node1Fiber' @ [520:13] ==> val node1Fiber: FlowStateMachineImpl<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown and there is a 3rd unrelated party flow`[LocalVariableDescriptor]

'resultFuture' @ [520:24] ==> public open val resultFuture: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[DeserializedPropertyDescriptor]

'getOrThrow' @ [520:37] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'node2Fiber' @ [522:33] ==> val node2Fiber: CordaFuture<FlowStateMachine<out Any?>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown and there is a 3rd unrelated party flow`[LocalVariableDescriptor]

'getOrThrow' @ [522:44] ==> public fun <V> Future<FlowStateMachine<out Any?>>.getOrThrow(timeout: Duration? = ...): FlowStateMachine<out Any?> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> FlowStateMachine<out Any?>

'resultFuture' @ [522:57] ==> public abstract val resultFuture: CordaFuture<out Any?> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'assertThatExceptionOfType' @ [523:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>..Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>?)): (ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> UnexpectedFlowEndException

'java' @ [523:69] ==> public val <T> KClass<UnexpectedFlowEndException>.java: Class<UnexpectedFlowEndException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnexpectedFlowEndException

'isThrownBy' @ [523:75] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'node2ResultFuture' @ [524:13] ==> val node2ResultFuture: CordaFuture<out Any?> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException thrown and there is a 3rd unrelated party flow`[LocalVariableDescriptor]

'getOrThrow' @ [524:31] ==> public fun <V> Future<out Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'assertSessionTransfers' @ [527:9] ==> private final fun assertSessionTransfers(node: MockNetwork.MockNode, vararg expected: FlowFrameworkTests.SessionTransfer): List<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node2' @ [527:32] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [528:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [528:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'ReceiveFlow' @ [528:40] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [528:63] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [529:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [529:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [529:48] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [530:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionData' @ [530:28] ==> private final fun sessionData(payload: Any): SessionData defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [530:52] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node1' @ [531:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'erroredEnd' @ [531:28] ==> private final fun erroredEnd(errorResponse: FlowException? = ...): ErrorSessionEnd defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node2' @ [531:44] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'FlowLogic<Unit>' @ [535:91] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [536:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [538:34] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Boolean> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Boolean

'otherParty' @ [538:51] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow[PropertyDescriptorImpl]

'unwrap' @ [538:63] ==> public inline fun <T, R> UntrustworthyData<Boolean>.unwrap(validator: (Boolean) -> Boolean): Boolean defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Boolean

'it' @ [538:72] ==> value-parameter it: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'throwException' @ [539:17] ==> val throwException: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow.call[LocalVariableDescriptor]

'MyFlowException' @ [540:23] ==> public constructor MyFlowException(message: String) defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[ClassConstructorDescriptorImpl]

'send' @ [542:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [542:18] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow[PropertyDescriptorImpl]

'sendPayload' @ [542:30] ==> public final val sendPayload: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow[PropertyDescriptorImpl]

'Test' @ [546:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InitiatingFlow' @ [548:9] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<String>' @ [549:89] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> String

'Suspendable' @ [550:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'sendAndReceive' @ [551:43] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.AskForExceptionFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> String

'otherParty' @ [551:66] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.AskForExceptionFlow[PropertyDescriptorImpl]

'throwException' @ [551:78] ==> public final val throwException: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.AskForExceptionFlow[PropertyDescriptorImpl]

'unwrap' @ [551:94] ==> public inline fun <T, R> UntrustworthyData<String>.unwrap(validator: (String) -> String): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [551:103] ==> value-parameter it: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.AskForExceptionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'FlowLogic<String>' @ [554:61] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> String

'Suspendable' @ [555:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [558:21] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<String>): String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.RetryOnExceptionFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> String

'AskForExceptionFlow' @ [558:29] ==> public constructor AskForExceptionFlow(otherParty: Party, throwException: Boolean) defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.AskForExceptionFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [558:49] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.RetryOnExceptionFlow[PropertyDescriptorImpl]

'subFlow' @ [560:21] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<String>): String defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.RetryOnExceptionFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> String

'AskForExceptionFlow' @ [560:29] ==> public constructor AskForExceptionFlow(otherParty: Party, throwException: Boolean) defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.AskForExceptionFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [560:49] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.RetryOnExceptionFlow[PropertyDescriptorImpl]

'node2' @ [565:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [565:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ConditionalExceptionFlow): CordaFuture<FlowFrameworkTests.ConditionalExceptionFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ConditionalExceptionFlow

'AskForExceptionFlow' @ [565:35] ==> public constructor AskForExceptionFlow(otherParty: Party, throwException: Boolean) defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.AskForExceptionFlow[ClassConstructorDescriptorImpl]

'ConditionalExceptionFlow' @ [565:65] ==> public constructor ConditionalExceptionFlow(otherParty: Party, sendPayload: Any) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ConditionalExceptionFlow[ClassConstructorDescriptorImpl]

'it' @ [565:90] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [566:28] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [566:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [566:43] ==> public open fun <T> startFlow(logic: FlowLogic<String>): FlowStateMachine<String> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'RetryOnExceptionFlow' @ [566:53] ==> public constructor RetryOnExceptionFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`.RetryOnExceptionFlow[ClassConstructorDescriptorImpl]

'node2' @ [566:74] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [566:80] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [566:85] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [566:101] ==> public abstract val resultFuture: CordaFuture<String> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [567:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [567:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [568:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'resultFuture' @ [568:20] ==> val resultFuture: CordaFuture<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`retry subFlow due to receiving FlowException`[LocalVariableDescriptor]

'getOrThrow' @ [568:33] ==> public fun <V> Future<String>.getOrThrow(timeout: Duration? = ...): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> String

'isEqualTo' @ [568:47] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'Test' @ [571:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [573:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [573:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SendFlow): CordaFuture<FlowFrameworkTests.SendFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SendFlow

'ReceiveFlow' @ [573:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'SendFlow' @ [573:57] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'NonSerialisableData' @ [573:66] ==> public constructor NonSerialisableData(a: Int) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NonSerialisableData[ClassConstructorDescriptorImpl]

'it' @ [573:90] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`serialisation issue in counterparty`.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [574:22] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [574:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [574:37] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ReceiveFlow' @ [574:47] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [574:59] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [574:65] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [574:70] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [574:86] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [575:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [575:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [576:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>..Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>?)): (ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> UnexpectedFlowEndException

'java' @ [576:69] ==> public val <T> KClass<UnexpectedFlowEndException>.java: Class<UnexpectedFlowEndException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnexpectedFlowEndException

'isThrownBy' @ [576:75] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'result' @ [577:13] ==> val result: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`serialisation issue in counterparty`[LocalVariableDescriptor]

'getOrThrow' @ [577:20] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'Test' @ [581:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [583:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [583:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.NonSerialisableFlowException>): CordaFuture<FlowFrameworkTests.ExceptionFlow<FlowFrameworkTests.NonSerialisableFlowException>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ExceptionFlow<NonSerialisableFlowException>

'ReceiveFlow' @ [583:35] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'ExceptionFlow' @ [584:13] ==> public constructor ExceptionFlow<E : Exception /* = Exception */>(exception: () -> FlowFrameworkTests.NonSerialisableFlowException) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <E : Exception /* = Exception */> -> NonSerialisableFlowException

'NonSerialisableFlowException' @ [584:29] ==> public constructor NonSerialisableFlowException(@Suppress data: FlowFrameworkTests.NonSerialisableData) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NonSerialisableFlowException[ClassConstructorDescriptorImpl]

'NonSerialisableData' @ [584:58] ==> public constructor NonSerialisableData(a: Int) defined in net.corda.node.services.statemachine.FlowFrameworkTests.NonSerialisableData[ClassConstructorDescriptorImpl]

'node1' @ [586:22] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [586:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [586:37] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ReceiveFlow' @ [586:47] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [586:59] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [586:65] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [586:70] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [586:86] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [587:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [587:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [588:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (FlowException..FlowException?)>..Class<out (FlowException..FlowException?)>?)): (ThrowableTypeAssert<(FlowException..FlowException?)>..ThrowableTypeAssert<(FlowException..FlowException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> FlowException

'FlowException' @ [588:35] ==> public constructor FlowException() defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'java' @ [588:56] ==> public val <T> KClass<FlowException>.java: Class<FlowException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowException

'isThrownBy' @ [588:62] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(FlowException..FlowException?)>..ThrowableAssertAlternative<(FlowException..FlowException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'result' @ [589:13] ==> val result: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`FlowException has non-serialisable object`[LocalVariableDescriptor]

'getOrThrow' @ [589:20] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'Test' @ [593:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TransactionBuilder' @ [595:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary1' @ [595:47] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [595:55] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [595:60] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addOutputState' @ [596:18] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'DummyState' @ [596:33] ==> public constructor DummyState(magicNumber: Int = ...) defined in net.corda.testing.contracts.DummyState[DeserializedClassConstructorDescriptor]

'addCommand' @ [597:18] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [597:29] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'node1' @ [597:42] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [597:48] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [597:57] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'node1' @ [598:19] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [598:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [598:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'ptx' @ [598:57] ==> val ptx: TransactionBuilder defined in net.corda.node.services.statemachine.FlowFrameworkTests.`wait for transaction`[LocalVariableDescriptor]

'node1' @ [600:30] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [600:36] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.WaitingFlows.Committer): CordaFuture<FlowFrameworkTests.WaitingFlows.Committer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> Committer

'WaitingFlows' @ [600:56] ==> private object WaitingFlows defined in net.corda.node.services.statemachine.FlowFrameworkTests[FakeCallableDescriptorForObject]

'Waiter' @ [600:69] ==> public constructor Waiter(stx: SignedTransaction, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[ClassConstructorDescriptorImpl]

'WaitingFlows' @ [601:13] ==> private object WaitingFlows defined in net.corda.node.services.statemachine.FlowFrameworkTests[FakeCallableDescriptorForObject]

'Committer' @ [601:26] ==> public constructor Committer(otherParty: Party, throwException: (() -> Exception /* = Exception */)? = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[ClassConstructorDescriptorImpl]

'it' @ [601:36] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`wait for transaction`.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [602:11] ==> public fun <V, W> CordaFuture<out FlowFrameworkTests.WaitingFlows.Committer>.map(transform: (FlowFrameworkTests.WaitingFlows.Committer) -> FlowStateMachine<out Any?>): CordaFuture<FlowStateMachine<out Any?>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Committer
    <W> -> FlowStateMachine<out Any?>

'it' @ [602:17] ==> value-parameter it: FlowFrameworkTests.WaitingFlows.Committer defined in net.corda.node.services.statemachine.FlowFrameworkTests.`wait for transaction`.<anonymous>[ValueParameterDescriptorImpl]

'stateMachine' @ [602:20] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[DeserializedPropertyDescriptor]

'node2' @ [603:25] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [603:31] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [603:40] ==> public open fun <T> startFlow(logic: FlowLogic<SignedTransaction>): FlowStateMachine<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'WaitingFlows' @ [603:50] ==> private object WaitingFlows defined in net.corda.node.services.statemachine.FlowFrameworkTests[FakeCallableDescriptorForObject]

'Waiter' @ [603:63] ==> public constructor Waiter(stx: SignedTransaction, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[ClassConstructorDescriptorImpl]

'stx' @ [603:70] ==> val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.`wait for transaction`[LocalVariableDescriptor]

'node1' @ [603:75] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [603:81] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [603:86] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [603:102] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [604:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [604:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [605:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (SignedTransaction..SignedTransaction?)): (AbstractObjectAssert<*, (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<*, (SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'waiterStx' @ [605:20] ==> val waiterStx: CordaFuture<SignedTransaction> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`wait for transaction`[LocalVariableDescriptor]

'getOrThrow' @ [605:30] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'isEqualTo' @ [605:44] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?), (SignedTransaction..SignedTransaction?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'committerFiber' @ [605:54] ==> val committerFiber: CordaFuture<FlowStateMachine<out Any?>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`wait for transaction`[LocalVariableDescriptor]

'getOrThrow' @ [605:69] ==> public fun <V> Future<FlowStateMachine<out Any?>>.getOrThrow(timeout: Duration? = ...): FlowStateMachine<out Any?> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> FlowStateMachine<out Any?>

'resultFuture' @ [605:82] ==> public abstract val resultFuture: CordaFuture<out Any?> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [605:95] ==> public fun <V> Future<out Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'Test' @ [608:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TransactionBuilder' @ [610:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary1' @ [610:47] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [610:55] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [610:60] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addOutputState' @ [611:18] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'DummyState' @ [611:33] ==> public constructor DummyState(magicNumber: Int = ...) defined in net.corda.testing.contracts.DummyState[DeserializedClassConstructorDescriptor]

'addCommand' @ [612:18] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [612:29] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'node1' @ [613:19] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [613:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [613:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'ptx' @ [613:57] ==> val ptx: TransactionBuilder defined in net.corda.node.services.statemachine.FlowFrameworkTests.`committer throws exception before calling the finality flow`[LocalVariableDescriptor]

'node1' @ [615:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [615:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.WaitingFlows.Committer): CordaFuture<FlowFrameworkTests.WaitingFlows.Committer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> Committer

'WaitingFlows' @ [615:35] ==> private object WaitingFlows defined in net.corda.node.services.statemachine.FlowFrameworkTests[FakeCallableDescriptorForObject]

'Waiter' @ [615:48] ==> public constructor Waiter(stx: SignedTransaction, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[ClassConstructorDescriptorImpl]

'WaitingFlows' @ [616:13] ==> private object WaitingFlows defined in net.corda.node.services.statemachine.FlowFrameworkTests[FakeCallableDescriptorForObject]

'Committer' @ [616:26] ==> public constructor Committer(otherParty: Party, throwException: (() -> Exception /* = Exception */)? = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[ClassConstructorDescriptorImpl]

'it' @ [616:36] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`committer throws exception before calling the finality flow`.<anonymous>[ValueParameterDescriptorImpl]

'Exception' @ [616:48] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'node2' @ [618:22] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [618:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [618:37] ==> public open fun <T> startFlow(logic: FlowLogic<SignedTransaction>): FlowStateMachine<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'WaitingFlows' @ [618:47] ==> private object WaitingFlows defined in net.corda.node.services.statemachine.FlowFrameworkTests[FakeCallableDescriptorForObject]

'Waiter' @ [618:60] ==> public constructor Waiter(stx: SignedTransaction, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[ClassConstructorDescriptorImpl]

'stx' @ [618:67] ==> val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.`committer throws exception before calling the finality flow`[LocalVariableDescriptor]

'node1' @ [618:72] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [618:78] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [618:83] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [618:99] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [619:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [619:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [620:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>..Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>?)): (ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> UnexpectedFlowEndException

'java' @ [620:69] ==> public val <T> KClass<UnexpectedFlowEndException>.java: Class<UnexpectedFlowEndException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnexpectedFlowEndException

'isThrownBy' @ [620:75] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'waiter' @ [621:13] ==> val waiter: CordaFuture<SignedTransaction> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`committer throws exception before calling the finality flow`[LocalVariableDescriptor]

'getOrThrow' @ [621:20] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'Test' @ [625:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TransactionBuilder' @ [627:19] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary1' @ [627:47] ==> private final lateinit var notary1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [627:55] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [627:60] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addOutputState' @ [628:18] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'DummyState' @ [628:33] ==> public constructor DummyState(magicNumber: Int = ...) defined in net.corda.testing.contracts.DummyState[DeserializedClassConstructorDescriptor]

'addCommand' @ [629:18] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [629:29] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'node1' @ [629:42] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [629:48] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [629:57] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'node1' @ [630:19] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [630:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [630:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'ptx' @ [630:57] ==> val ptx: TransactionBuilder defined in net.corda.node.services.statemachine.FlowFrameworkTests.`verify vault query service is tokenizable by force checkpointing within a flow`[LocalVariableDescriptor]

'node1' @ [632:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [632:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.WaitingFlows.Committer): CordaFuture<FlowFrameworkTests.WaitingFlows.Committer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> Committer

'VaultQueryFlow' @ [632:35] ==> public constructor VaultQueryFlow(stx: SignedTransaction, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[ClassConstructorDescriptorImpl]

'WaitingFlows' @ [633:13] ==> private object WaitingFlows defined in net.corda.node.services.statemachine.FlowFrameworkTests[FakeCallableDescriptorForObject]

'Committer' @ [633:26] ==> public constructor Committer(otherParty: Party, throwException: (() -> Exception /* = Exception */)? = ...) defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[ClassConstructorDescriptorImpl]

'it' @ [633:36] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`verify vault query service is tokenizable by force checkpointing within a flow`.<anonymous>[ValueParameterDescriptorImpl]

'node2' @ [635:22] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [635:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [635:37] ==> public open fun <T> startFlow(logic: FlowLogic<List<StateAndRef<ContractState>>>): FlowStateMachine<List<StateAndRef<ContractState>>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<StateAndRef<ContractState>>

'VaultQueryFlow' @ [635:47] ==> public constructor VaultQueryFlow(stx: SignedTransaction, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[ClassConstructorDescriptorImpl]

'stx' @ [635:62] ==> val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.`verify vault query service is tokenizable by force checkpointing within a flow`[LocalVariableDescriptor]

'node1' @ [635:67] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [635:73] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [635:78] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [635:94] ==> public abstract val resultFuture: CordaFuture<List<StateAndRef<ContractState>>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [637:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [637:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [638:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (StateAndRef<ContractState>..StateAndRef<ContractState>?)>..List<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>?)): (ListAssert<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>..ListAssert<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> StateAndRef<ContractState>

'result' @ [638:20] ==> val result: CordaFuture<List<StateAndRef<ContractState>>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`verify vault query service is tokenizable by force checkpointing within a flow`[LocalVariableDescriptor]

'getOrThrow' @ [638:27] ==> public fun <V> Future<List<StateAndRef<ContractState>>>.getOrThrow(timeout: Duration? = ...): List<StateAndRef<ContractState>> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<StateAndRef<ContractState>>

'isEmpty' @ [638:41] ==> public open fun isEmpty(): Unit defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [641:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [643:33] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [643:39] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.ReceiveFlow): CordaFuture<FlowFrameworkTests.ReceiveFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> ReceiveFlow

'SendFlow' @ [643:59] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'ReceiveFlow' @ [643:78] ==> public constructor ReceiveFlow(vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[ClassConstructorDescriptorImpl]

'it' @ [643:90] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`customised client flow`.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [644:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [644:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [644:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'CustomSendFlow' @ [644:34] ==> public constructor CustomSendFlow(payload: String, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.CustomSendFlow[ClassConstructorDescriptorImpl]

'node2' @ [644:58] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [644:64] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [644:69] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [644:85] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [645:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [645:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [646:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (String..String?)>..List<(String..String?)>?)): (ListAssert<(String..String?)>..ListAssert<(String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> String

'receiveFlowFuture' @ [646:20] ==> val receiveFlowFuture: CordaFuture<FlowFrameworkTests.ReceiveFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`customised client flow`[LocalVariableDescriptor]

'getOrThrow' @ [646:38] ==> public fun <V> Future<FlowFrameworkTests.ReceiveFlow>.getOrThrow(timeout: Duration? = ...): FlowFrameworkTests.ReceiveFlow defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> ReceiveFlow

'receivedPayloads' @ [646:51] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'containsOnly' @ [646:69] ==> public open fun containsOnly(vararg p0: (String..String?)): (ListAssert<(String..String?)>..ListAssert<(String..String?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'Test' @ [649:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node1' @ [651:22] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [651:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [651:37] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'IncorrectCustomSendFlow' @ [651:47] ==> public constructor IncorrectCustomSendFlow(payload: String, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.IncorrectCustomSendFlow[ClassConstructorDescriptorImpl]

'node2' @ [651:80] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [651:86] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [651:91] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [651:107] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [652:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [652:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [653:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>..Class<out (IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>?)): (ThrowableTypeAssert<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>..ThrowableTypeAssert<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> IllegalArgumentException

'IllegalArgumentException' @ [653:35] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'java' @ [653:67] ==> public val <T> KClass<IllegalArgumentException /* = IllegalArgumentException */>.java: Class<IllegalArgumentException /* = IllegalArgumentException */> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IllegalArgumentException

'isThrownBy' @ [653:73] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>..ThrowableAssertAlternative<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'result' @ [654:13] ==> val result: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`customised client flow which has annotated @InitiatingFlow again`[LocalVariableDescriptor]

'getOrThrow' @ [654:20] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'withMessageContaining' @ [655:11] ==> public open fun withMessageContaining(p0: (String..String?)): (ThrowableAssertAlternative<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>..ThrowableAssertAlternative<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'InitiatingFlow' @ [655:33] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'java' @ [655:55] ==> public val <T> KClass<InitiatingFlow>.java: Class<InitiatingFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InitiatingFlow

'simpleName' @ [655:60] ==> public final val <T : (Any..Any?)> Class<InitiatingFlow>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InitiatingFlow

'Test' @ [658:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [660:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [660:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SendFlow): CordaFuture<FlowFrameworkTests.SendFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SendFlow

'UpgradedFlow' @ [660:35] ==> public constructor UpgradedFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[ClassConstructorDescriptorImpl]

'SendFlow' @ [660:84] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'it' @ [660:110] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`upgraded initiating flow`.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [661:22] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [661:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [661:37] ==> public open fun <T> startFlow(logic: FlowLogic<Pair<Any, Int>>): FlowStateMachine<Pair<Any, Int>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Any, Int>

'UpgradedFlow' @ [661:47] ==> public constructor UpgradedFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[ClassConstructorDescriptorImpl]

'node2' @ [661:60] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [661:66] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [661:71] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [661:87] ==> public abstract val resultFuture: CordaFuture<Pair<Any, Int>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [662:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [662:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [663:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..List<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SessionTransfer

'receivedSessionMessages' @ [663:20] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'startsWith' @ [663:45] ==> @SafeVarargs public final fun startsWith(vararg p0: (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'node1' @ [664:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [664:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'UpgradedFlow' @ [664:40] ==> public constructor UpgradedFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[ClassConstructorDescriptorImpl]

'node2' @ [664:81] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [665:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [665:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [665:63] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'component1' @ [667:14] ==> public final operator fun component1(): Any defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [667:31] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'result' @ [667:51] ==> val result: CordaFuture<Pair<Any, Int>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`upgraded initiating flow`[LocalVariableDescriptor]

'getOrThrow' @ [667:58] ==> public fun <V> Future<Pair<Any, Int>>.getOrThrow(timeout: Duration? = ...): Pair<Any, Int> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Pair<Any, Int>

'assertThat' @ [668:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'receivedPayload' @ [668:20] ==> val receivedPayload: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.`upgraded initiating flow`[LocalVariableDescriptor]

'isEqualTo' @ [668:37] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'assertThat' @ [669:9] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'node2FlowVersion' @ [669:20] ==> val node2FlowVersion: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.`upgraded initiating flow`[LocalVariableDescriptor]

'isEqualTo' @ [669:38] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'Test' @ [672:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [674:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [674:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.UpgradedFlow): CordaFuture<FlowFrameworkTests.UpgradedFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> UpgradedFlow

'SendFlow' @ [674:35] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'UpgradedFlow' @ [674:80] ==> public constructor UpgradedFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[ClassConstructorDescriptorImpl]

'it' @ [674:93] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`upgraded initiated flow`.<anonymous>[ValueParameterDescriptorImpl]

'SendFlow' @ [675:30] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'node2' @ [675:57] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [675:63] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [675:68] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node1' @ [676:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [676:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [676:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'initiatingFlow' @ [676:34] ==> val initiatingFlow: FlowFrameworkTests.SendFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`upgraded initiated flow`[LocalVariableDescriptor]

'mockNet' @ [677:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [677:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [678:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..List<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SessionTransfer

'receivedSessionMessages' @ [678:20] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'startsWith' @ [678:45] ==> @SafeVarargs public final fun startsWith(vararg p0: (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'node1' @ [679:17] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionInit' @ [679:28] ==> private final fun sessionInit(clientFlowClass: KClass<out FlowLogic<*>>, flowVersion: Int = ..., payload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'SendFlow' @ [679:40] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'node2' @ [679:105] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'node2' @ [680:17] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sessionConfirm' @ [680:28] ==> private final fun sessionConfirm(flowVersion: Int = ...): SessionConfirm defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'node1' @ [680:63] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'assertThat' @ [682:9] ==> @CheckReturnValue public open fun assertThat(p0: Int): (AbstractIntegerAssert<*>..AbstractIntegerAssert<*>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'initiatingFlow' @ [682:20] ==> val initiatingFlow: FlowFrameworkTests.SendFlow defined in net.corda.node.services.statemachine.FlowFrameworkTests.`upgraded initiated flow`[LocalVariableDescriptor]

'getFlowContext' @ [682:35] ==> @Suspendable public final fun getFlowContext(otherParty: Party): FlowContext defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[DeserializedSimpleFunctionDescriptor]

'node2' @ [682:50] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [682:56] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [682:61] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'flowVersion' @ [682:76] ==> public final val flowVersion: Int defined in net.corda.core.flows.FlowContext[DeserializedPropertyDescriptor]

'isEqualTo' @ [682:89] ==> public open fun isEqualTo(p0: Int): (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>..AbstractIntegerAssert<out (AbstractIntegerAssert<out Any?>..AbstractIntegerAssert<out Any?>?)>?)>?)>?)>?) defined in org.assertj.core.api.AbstractIntegerAssert[JavaMethodDescriptor]

'Test' @ [685:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node1' @ [687:22] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [687:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [687:37] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'SendFlow' @ [687:47] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'node2' @ [687:65] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [687:71] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [687:76] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [687:92] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [688:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [688:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThatExceptionOfType' @ [689:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>..Class<out (UnexpectedFlowEndException..UnexpectedFlowEndException?)>?)): (ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableTypeAssert<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.AssertionsForClassTypes[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> UnexpectedFlowEndException

'java' @ [689:69] ==> public val <T> KClass<UnexpectedFlowEndException>.java: Class<UnexpectedFlowEndException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnexpectedFlowEndException

'isThrownBy' @ [690:18] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'future' @ [690:31] ==> val future: CordaFuture<Unit> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`unregistered flow`[LocalVariableDescriptor]

'getOrThrow' @ [690:38] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'withMessageEndingWith' @ [691:18] ==> public open fun withMessageEndingWith(p0: (String..String?)): (ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>..ThrowableAssertAlternative<(UnexpectedFlowEndException..UnexpectedFlowEndException?)>?) defined in org.assertj.core.api.ThrowableAssertAlternative[JavaMethodDescriptor]

'SendFlow' @ [691:43] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'java' @ [691:59] ==> public val <T> KClass<FlowFrameworkTests.SendFlow>.java: Class<FlowFrameworkTests.SendFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SendFlow

'name' @ [691:64] ==> public final val <T : (Any..Any?)> Class<FlowFrameworkTests.SendFlow>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SendFlow

'Test' @ [694:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node1' @ [696:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sendSessionMessage' @ [696:15] ==> private final fun MockNetwork.MockNode.sendSessionMessage(message: SessionMessage, destination: MockNetwork.MockNode): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'SessionInit' @ [696:34] ==> public constructor SessionInit(initiatorSessionId: Long, initiatingFlowClass: String, flowVersion: Int, appName: String, firstPayload: Any?) defined in net.corda.node.services.statemachine.SessionInit[DeserializedClassConstructorDescriptor]

'random63BitValue' @ [696:46] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'node2' @ [696:107] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'mockNet' @ [697:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [697:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [698:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..List<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SessionTransfer

'receivedSessionMessages' @ [698:20] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'hasSize' @ [698:45] ==> public open fun hasSize(p0: Int): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'receivedSessionMessages' @ [699:22] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'last' @ [699:46] ==> public fun <T> List<FlowFrameworkTests.SessionTransfer>.last(): FlowFrameworkTests.SessionTransfer defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SessionTransfer

'message' @ [699:53] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertThat' @ [700:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'reject' @ [700:20] ==> val reject: SessionReject defined in net.corda.node.services.statemachine.FlowFrameworkTests.`unknown class in session init`[LocalVariableDescriptor]

'errorMessage' @ [700:27] ==> public final val errorMessage: String defined in net.corda.node.services.statemachine.SessionReject[DeserializedPropertyDescriptor]

'isEqualTo' @ [700:41] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'Test' @ [703:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node1' @ [705:9] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'sendSessionMessage' @ [705:15] ==> private final fun MockNetwork.MockNode.sendSessionMessage(message: SessionMessage, destination: MockNetwork.MockNode): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'SessionInit' @ [705:34] ==> public constructor SessionInit(initiatorSessionId: Long, initiatingFlowClass: String, flowVersion: Int, appName: String, firstPayload: Any?) defined in net.corda.node.services.statemachine.SessionInit[DeserializedClassConstructorDescriptor]

'random63BitValue' @ [705:46] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'String' @ [705:66] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [705:80] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'name' @ [705:85] ==> public final val <T : (Any..Any?)> Class<String>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'node2' @ [705:112] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'mockNet' @ [706:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [706:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [707:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..List<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SessionTransfer

'receivedSessionMessages' @ [707:20] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'hasSize' @ [707:45] ==> public open fun hasSize(p0: Int): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'receivedSessionMessages' @ [708:22] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'last' @ [708:46] ==> public fun <T> List<FlowFrameworkTests.SessionTransfer>.last(): FlowFrameworkTests.SessionTransfer defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SessionTransfer

'message' @ [708:53] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'assertThat' @ [709:9] ==> @CheckReturnValue public open fun assertThat(p0: (String..String?)): (AbstractCharSequenceAssert<*, (String..String?)>..AbstractCharSequenceAssert<*, (String..String?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'reject' @ [709:20] ==> val reject: SessionReject defined in net.corda.node.services.statemachine.FlowFrameworkTests.`non-flow class in session init`[LocalVariableDescriptor]

'errorMessage' @ [709:27] ==> public final val errorMessage: String defined in net.corda.node.services.statemachine.SessionReject[DeserializedPropertyDescriptor]

'isEqualTo' @ [709:41] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>..AbstractCharSequenceAssert<out (AbstractCharSequenceAssert<out Any?, out Any?>..AbstractCharSequenceAssert<out Any?, out Any?>?), (String..String?)>?), (String..String?)>?), (String..String?)>?), (String..String?)>?) defined in org.assertj.core.api.AbstractCharSequenceAssert[JavaMethodDescriptor]

'String' @ [709:54] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [709:68] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'name' @ [709:73] ==> public final val <T : (Any..Any?)> Class<String>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'Test' @ [712:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [714:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [714:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.SingleInlinedSubFlow): CordaFuture<FlowFrameworkTests.SingleInlinedSubFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> SingleInlinedSubFlow

'SendAndReceiveFlow' @ [714:35] ==> public constructor SendAndReceiveFlow(otherParty: Party, payload: Any) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[ClassConstructorDescriptorImpl]

'SingleInlinedSubFlow' @ [714:64] ==> public constructor SingleInlinedSubFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow[ClassConstructorDescriptorImpl]

'it' @ [714:85] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`single inlined sub-flow`.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [715:22] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [715:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [715:37] ==> public open fun <T> startFlow(logic: FlowLogic<Any>): FlowStateMachine<Any> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'SendAndReceiveFlow' @ [715:47] ==> public constructor SendAndReceiveFlow(otherParty: Party, payload: Any) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [715:66] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [715:72] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [715:77] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [715:102] ==> public abstract val resultFuture: CordaFuture<Any> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [716:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [716:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [717:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'result' @ [717:20] ==> val result: CordaFuture<Any> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`single inlined sub-flow`[LocalVariableDescriptor]

'getOrThrow' @ [717:27] ==> public fun <V> Future<Any>.getOrThrow(timeout: Duration? = ...): Any defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any

'isEqualTo' @ [717:41] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'Test' @ [720:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'node2' @ [722:9] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'registerFlowFactory' @ [722:15] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.registerFlowFactory(initiatingFlowClass: KClass<out FlowLogic<*>>, initiatedFlowVersion: Int = ..., noinline flowFactory: (Party) -> FlowFrameworkTests.DoubleInlinedSubFlow): CordaFuture<FlowFrameworkTests.DoubleInlinedSubFlow> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> DoubleInlinedSubFlow

'SendAndReceiveFlow' @ [722:35] ==> public constructor SendAndReceiveFlow(otherParty: Party, payload: Any) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[ClassConstructorDescriptorImpl]

'DoubleInlinedSubFlow' @ [722:64] ==> public constructor DoubleInlinedSubFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.DoubleInlinedSubFlow[ClassConstructorDescriptorImpl]

'it' @ [722:85] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.`double inlined sub-flow`.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [723:22] ==> private final lateinit var node1: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'services' @ [723:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [723:37] ==> public open fun <T> startFlow(logic: FlowLogic<Any>): FlowStateMachine<Any> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'SendAndReceiveFlow' @ [723:47] ==> public constructor SendAndReceiveFlow(otherParty: Party, payload: Any) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[ClassConstructorDescriptorImpl]

'node2' @ [723:66] ==> private final lateinit var node2: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'info' @ [723:72] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [723:77] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [723:102] ==> public abstract val resultFuture: CordaFuture<Any> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [724:9] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'runNetwork' @ [724:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertThat' @ [725:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (Any..Any?)): (AbstractObjectAssert<*, (Any..Any?)>..AbstractObjectAssert<*, (Any..Any?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'result' @ [725:20] ==> val result: CordaFuture<Any> defined in net.corda.node.services.statemachine.FlowFrameworkTests.`double inlined sub-flow`[LocalVariableDescriptor]

'getOrThrow' @ [725:27] ==> public fun <V> Future<Any>.getOrThrow(timeout: Duration? = ...): Any defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any

'isEqualTo' @ [725:41] ==> public open fun isEqualTo(p0: (Any..Any?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?), (Any..Any?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'disableDBCloseOnStop' @ [733:9] ==> public final fun disableDBCloseOnStop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'stop' @ [734:9] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [735:23] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'createNode' @ [735:31] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'networkMapNode' @ [735:42] ==> value-parameter networkMapNode: MockNetwork.MockNode? = ... defined in net.corda.node.services.statemachine.FlowFrameworkTests.restartAndGetRestoredFlow[ValueParameterDescriptorImpl]

'network' @ [735:58] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [735:67] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'id' @ [735:78] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'advertisedServices' @ [735:104] ==> public final val advertisedServices: Set<ServiceInfo> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'toTypedArray' @ [735:123] ==> public inline fun <reified T> Collection<ServiceInfo>.toTypedArray(): Array<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ServiceInfo

'newNode' @ [736:9] ==> val newNode: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.restartAndGetRestoredFlow[LocalVariableDescriptor]

'acceptableLiveFiberCountOnStop' @ [736:17] ==> public final var acceptableLiveFiberCountOnStop: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'manuallyCloseDB' @ [737:9] ==> public final fun manuallyCloseDB(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [738:9] ==> public final val mockNet: MockNetwork defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'runNetwork' @ [738:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'newNode' @ [739:16] ==> val newNode: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.restartAndGetRestoredFlow[LocalVariableDescriptor]

'getSingleFlow' @ [739:24] ==> private final inline fun <reified P : FlowLogic<*>> MockNetwork.MockNode.getSingleFlow(): Pair<P, CordaFuture<*>> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified P : FlowLogic<*>> -> P

'first' @ [739:43] ==> public final val first: P defined in kotlin.Pair[DeserializedPropertyDescriptor]

'smm' @ [743:16] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'findStateMachines' @ [743:20] ==> public final fun <P : FlowLogic<Any?>, T> findStateMachines(flowClass: Class<P>): List<Pair<P, CordaFuture<Any?>>> defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <P : FlowLogic<T>> -> P
    <T> -> Any?

'java' @ [743:47] ==> public val <T> KClass<P>.java: Class<P> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> P

'single' @ [743:53] ==> public fun <T> List<Pair<P, CordaFuture<Any?>>>.single(): Pair<P, CordaFuture<Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<P, CordaFuture<Any?>>

'internalRegisterFlowFactory' @ [751:26] ==> public final fun <F : FlowLogic<*>> internalRegisterFlowFactory(initiatingFlowClass: Class<out FlowLogic<*>>, flowFactory: InitiatedFlowFactory<P>, initiatedFlowClass: Class<P>, track: Boolean): Observable<P> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <F : FlowLogic<*>> -> P

'initiatingFlowClass' @ [752:17] ==> value-parameter initiatingFlowClass: KClass<out FlowLogic<*>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.registerFlowFactory[ValueParameterDescriptorImpl]

'java' @ [752:37] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowLogic<*>

'CorDapp' @ [753:38] ==> public constructor CorDapp<out F : FlowLogic<*>>(flowVersion: Int, appName: String, factory: (Party) -> P) defined in net.corda.node.internal.InitiatedFlowFactory.CorDapp[DeserializedClassConstructorDescriptor]
Inferred types:
    <out F : FlowLogic<*>> -> P

'initiatedFlowVersion' @ [753:46] ==> value-parameter initiatedFlowVersion: Int = ... defined in net.corda.node.services.statemachine.FlowFrameworkTests.registerFlowFactory[ValueParameterDescriptorImpl]

'flowFactory' @ [753:72] ==> value-parameter noinline flowFactory: (Party) -> P defined in net.corda.node.services.statemachine.FlowFrameworkTests.registerFlowFactory[ValueParameterDescriptorImpl]

'java' @ [754:26] ==> public val <T> KClass<P>.java: Class<P> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> P

'observable' @ [756:16] ==> val observable: Observable<P> defined in net.corda.node.services.statemachine.FlowFrameworkTests.registerFlowFactory[LocalVariableDescriptor]

'toFuture' @ [756:27] ==> public fun <T> Observable<P>.toFuture(): CordaFuture<P> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> P

'SessionInit' @ [760:16] ==> public constructor SessionInit(initiatorSessionId: Long, initiatingFlowClass: String, flowVersion: Int, appName: String, firstPayload: Any?) defined in net.corda.node.services.statemachine.SessionInit[DeserializedClassConstructorDescriptor]

'clientFlowClass' @ [760:31] ==> value-parameter clientFlowClass: KClass<out FlowLogic<*>> defined in net.corda.node.services.statemachine.FlowFrameworkTests.sessionInit[ValueParameterDescriptorImpl]

'java' @ [760:47] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowLogic<*>

'name' @ [760:52] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FlowLogic<*>

'flowVersion' @ [760:58] ==> value-parameter flowVersion: Int = ... defined in net.corda.node.services.statemachine.FlowFrameworkTests.sessionInit[ValueParameterDescriptorImpl]

'payload' @ [760:75] ==> value-parameter payload: Any? = ... defined in net.corda.node.services.statemachine.FlowFrameworkTests.sessionInit[ValueParameterDescriptorImpl]

'SessionConfirm' @ [762:56] ==> public constructor SessionConfirm(initiatorSessionId: Long, initiatedSessionId: Long, flowVersion: Int, appName: String) defined in net.corda.node.services.statemachine.SessionConfirm[DeserializedClassConstructorDescriptor]

'flowVersion' @ [762:77] ==> value-parameter flowVersion: Int = ... defined in net.corda.node.services.statemachine.FlowFrameworkTests.sessionConfirm[ValueParameterDescriptorImpl]

'SessionData' @ [763:45] ==> public constructor SessionData(recipientSessionId: Long, payload: Any) defined in net.corda.node.services.statemachine.SessionData[DeserializedClassConstructorDescriptor]

'payload' @ [763:60] ==> value-parameter payload: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.sessionData[ValueParameterDescriptorImpl]

'NormalSessionEnd' @ [764:29] ==> public constructor NormalSessionEnd(recipientSessionId: Long) defined in net.corda.node.services.statemachine.NormalSessionEnd[DeserializedClassConstructorDescriptor]

'ErrorSessionEnd' @ [765:68] ==> public constructor ErrorSessionEnd(recipientSessionId: Long, errorResponse: FlowException?) defined in net.corda.node.services.statemachine.ErrorSessionEnd[DeserializedClassConstructorDescriptor]

'errorResponse' @ [765:87] ==> value-parameter errorResponse: FlowException? = ... defined in net.corda.node.services.statemachine.FlowFrameworkTests.erroredEnd[ValueParameterDescriptorImpl]

'services' @ [768:9] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'networkService' @ [768:18] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'apply' @ [768:33] ==> @InlineOnly public inline fun <T> MessagingService.apply(block: MessagingService.() -> Unit): MessagingService defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessagingService

'getAddressOfParty' @ [769:27] ==> public abstract fun getAddressOfParty(partyInfo: PartyInfo): MessageRecipients defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'Node' @ [769:55] ==> public constructor Node(node: NodeInfo) defined in net.corda.core.node.services.PartyInfo.Node[DeserializedClassConstructorDescriptor]

'destination' @ [769:60] ==> value-parameter destination: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.sendSessionMessage[ValueParameterDescriptorImpl]

'info' @ [769:72] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [770:13] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'createMessage' @ [770:18] ==> public abstract fun createMessage(topicSession: TopicSession, data: ByteArray, uuid: UUID = ...): Message defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'StateMachineManager' @ [770:32] ==> public companion object defined in net.corda.node.services.statemachine.StateMachineManager[FakeCallableDescriptorForObject]

'sessionTopic' @ [770:52] ==> internal final val sessionTopic: TopicSession defined in net.corda.node.services.statemachine.StateMachineManager.Companion[DeserializedPropertyDescriptor]

'message' @ [770:66] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sendSessionMessage[ValueParameterDescriptorImpl]

'serialize' @ [770:74] ==> public fun <T : Any> SessionMessage.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<SessionMessage> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SessionMessage

'bytes' @ [770:86] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'address' @ [770:94] ==> val address: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.sendSessionMessage.<anonymous>[LocalVariableDescriptor]

'assertThat' @ [775:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..List<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SessionTransfer

'receivedSessionMessages' @ [775:20] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'containsExactly' @ [775:45] ==> @SafeVarargs public final fun containsExactly(vararg p0: (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'expected' @ [775:62] ==> value-parameter vararg expected: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers[ValueParameterDescriptorImpl]

'receivedSessionMessages' @ [779:29] ==> private final val receivedSessionMessages: ArrayList<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'filter' @ [779:53] ==> public inline fun <T> Iterable<FlowFrameworkTests.SessionTransfer>.filter(predicate: (FlowFrameworkTests.SessionTransfer) -> Boolean): List<FlowFrameworkTests.SessionTransfer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SessionTransfer

'it' @ [779:62] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [779:65] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'node' @ [779:73] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers[ValueParameterDescriptorImpl]

'id' @ [779:78] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'it' @ [779:84] ==> value-parameter it: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [779:87] ==> public final val to: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'node' @ [779:93] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers[ValueParameterDescriptorImpl]

'network' @ [779:98] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [779:106] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'assertThat' @ [780:9] ==> @CheckReturnValue public open fun <ELEMENT : (Any..Any?)> assertThat(p0: (MutableList<out (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..List<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <ELEMENT : (Any..Any?)> -> SessionTransfer

'actualForNode' @ [780:20] ==> val actualForNode: List<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers[LocalVariableDescriptor]

'containsExactly' @ [780:35] ==> @SafeVarargs public final fun containsExactly(vararg p0: (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)): (ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..ListAssert<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in org.assertj.core.api.ListAssert[JavaMethodDescriptor]

'expected' @ [780:52] ==> value-parameter vararg expected: FlowFrameworkTests.SessionTransfer defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers[ValueParameterDescriptorImpl]

'actualForNode' @ [781:16] ==> val actualForNode: List<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests.assertSessionTransfers[LocalVariableDescriptor]

'message' @ [785:48] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'message' @ [785:74] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'message' @ [785:100] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'firstPayload' @ [785:108] ==> public final val firstPayload: Any? defined in net.corda.node.services.statemachine.SessionInit[DeserializedPropertyDescriptor]

'from' @ [786:45] ==> public final val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'message' @ [786:56] ==> public final val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'to' @ [786:68] ==> public final val to: MessageRecipients defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[PropertyDescriptorImpl]

'mockNet' @ [790:16] ==> private final val mockNet: MockNetwork defined in net.corda.node.services.statemachine.FlowFrameworkTests[PropertyDescriptorImpl]

'messagingNetwork' @ [790:24] ==> public final val messagingNetwork: InMemoryMessagingNetwork defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'receivedMessages' @ [790:41] ==> public final val receivedMessages: Observable<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[DeserializedPropertyDescriptor]

'toSessionTransfers' @ [790:58] ==> private final fun Observable<InMemoryMessagingNetwork.MessageTransfer>.toSessionTransfers(): Observable<FlowFrameworkTests.SessionTransfer> defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'filter' @ [794:16] ==> public final fun filter(p0: (((InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)) -> (Boolean..Boolean?)..(((InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)) -> (Boolean..Boolean?))?)): (Observable<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..Observable<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [794:25] ==> value-parameter it: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.toSessionTransfers.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [794:28] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'topicSession' @ [794:36] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'StateMachineManager' @ [794:52] ==> public companion object defined in net.corda.node.services.statemachine.StateMachineManager[FakeCallableDescriptorForObject]

'sessionTopic' @ [794:72] ==> internal final val sessionTopic: TopicSession defined in net.corda.node.services.statemachine.StateMachineManager.Companion[DeserializedPropertyDescriptor]

'map' @ [794:87] ==> public final fun <R : (Any..Any?)> map(p0: (((InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)) -> (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)..(((InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)) -> (FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?))?)): (Observable<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>..Observable<(FlowFrameworkTests.SessionTransfer..FlowFrameworkTests.SessionTransfer?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> SessionTransfer

'it' @ [795:24] ==> value-parameter it: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.toSessionTransfers.<anonymous>[ValueParameterDescriptorImpl]

'sender' @ [795:27] ==> public final val sender: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'id' @ [795:34] ==> public final val id: Int defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[DeserializedPropertyDescriptor]

'it' @ [796:27] ==> value-parameter it: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.toSessionTransfers.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [796:30] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'data' @ [796:38] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'deserialize' @ [796:43] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SessionMessage defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SessionMessage

'SessionTransfer' @ [797:13] ==> public constructor SessionTransfer(from: Int, message: SessionMessage, to: MessageRecipients) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[ClassConstructorDescriptorImpl]

'from' @ [797:29] ==> val from: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.toSessionTransfers.<anonymous>[LocalVariableDescriptor]

'sanitise' @ [797:35] ==> private final fun sanitise(message: SessionMessage): SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests[SimpleFunctionDescriptorImpl]

'message' @ [797:44] ==> val message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.toSessionTransfers.<anonymous>[LocalVariableDescriptor]

'it' @ [797:54] ==> value-parameter it: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.toSessionTransfers.<anonymous>[ValueParameterDescriptorImpl]

'recipients' @ [797:57] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[DeserializedPropertyDescriptor]

'when (message) {
        is SessionData -> message.copy(recipientSessionId = 0)
        is SessionInit -> message.copy(initiatorSessionId = 0, appName = "")
        is SessionConfirm -> message.copy(initiatorSessionId = 0, initiatedSessionId = 0, appName = "")
        is NormalSessionEnd -> message.copy(recipientSessionId = 0)
        is ErrorSessionEnd -> message.copy(recipientSessionId = 0)
        else -> message
    }' @ [801:53] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SessionMessage, entry1: SessionMessage, entry2: SessionMessage, entry3: SessionMessage, entry4: SessionMessage, entry5: SessionMessage): SessionMessage[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SessionMessage

'message' @ [801:59] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sanitise[ValueParameterDescriptorImpl]

'message' @ [802:27] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sanitise[ValueParameterDescriptorImpl]

'copy' @ [802:35] ==> public final fun copy(recipientSessionId: Long = ..., payload: Any = ...): SessionData defined in net.corda.node.services.statemachine.SessionData[DeserializedSimpleFunctionDescriptor]

'message' @ [803:27] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sanitise[ValueParameterDescriptorImpl]

'copy' @ [803:35] ==> public final fun copy(initiatorSessionId: Long = ..., initiatingFlowClass: String = ..., flowVersion: Int = ..., appName: String = ..., firstPayload: Any? = ...): SessionInit defined in net.corda.node.services.statemachine.SessionInit[DeserializedSimpleFunctionDescriptor]

'message' @ [804:30] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sanitise[ValueParameterDescriptorImpl]

'copy' @ [804:38] ==> public final fun copy(initiatorSessionId: Long = ..., initiatedSessionId: Long = ..., flowVersion: Int = ..., appName: String = ...): SessionConfirm defined in net.corda.node.services.statemachine.SessionConfirm[DeserializedSimpleFunctionDescriptor]

'message' @ [805:32] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sanitise[ValueParameterDescriptorImpl]

'copy' @ [805:40] ==> public final fun copy(recipientSessionId: Long = ...): NormalSessionEnd defined in net.corda.node.services.statemachine.NormalSessionEnd[DeserializedSimpleFunctionDescriptor]

'message' @ [806:31] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sanitise[ValueParameterDescriptorImpl]

'copy' @ [806:39] ==> public final fun copy(recipientSessionId: Long = ..., errorResponse: FlowException? = ...): ErrorSessionEnd defined in net.corda.node.services.statemachine.ErrorSessionEnd[DeserializedSimpleFunctionDescriptor]

'message' @ [807:17] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sanitise[ValueParameterDescriptorImpl]

'Pair' @ [810:91] ==> public constructor Pair<out A, out B>(first: Int, second: SessionMessage) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> SessionMessage

'id' @ [810:96] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'message' @ [810:100] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.FlowFrameworkTests.sent[ValueParameterDescriptorImpl]

'SessionTransfer' @ [811:87] ==> public constructor SessionTransfer(from: Int, message: SessionMessage, to: MessageRecipients) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SessionTransfer[ClassConstructorDescriptorImpl]

'first' @ [811:103] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'second' @ [811:110] ==> public final val second: SessionMessage defined in kotlin.Pair[DeserializedPropertyDescriptor]

'node' @ [811:118] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.node.services.statemachine.FlowFrameworkTests.to[ValueParameterDescriptorImpl]

'network' @ [811:123] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [811:131] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'progressTracker' @ [814:16] ==> public open val progressTracker: ProgressTracker? defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'changes' @ [814:34] ==> public final val changes: Observable<ProgressTracker.Change> defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'ofType' @ [815:18] ==> public final fun <R : (Any..Any?)> ofType(p0: (Class<(ProgressTracker.Change.Position..ProgressTracker.Change.Position?)>..Class<(ProgressTracker.Change.Position..ProgressTracker.Change.Position?)>?)): (Observable<(ProgressTracker.Change.Position..ProgressTracker.Change.Position?)>..Observable<(ProgressTracker.Change.Position..ProgressTracker.Change.Position?)>?) defined in rx.Observable[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> Position

'Position' @ [815:32] ==> public constructor Position(tracker: ProgressTracker, newStep: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedClassConstructorDescriptor]

'java' @ [815:48] ==> public val <T> KClass<ProgressTracker.Change.Position>.java: Class<ProgressTracker.Change.Position> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Position

'map' @ [816:18] ==> public final fun <R : (Any..Any?)> map(p0: (((ProgressTracker.Change.Position..ProgressTracker.Change.Position?)) -> (ProgressTracker.Step..ProgressTracker.Step?)..(((ProgressTracker.Change.Position..ProgressTracker.Change.Position?)) -> (ProgressTracker.Step..ProgressTracker.Step?))?)): (Observable<(ProgressTracker.Step..ProgressTracker.Step?)>..Observable<(ProgressTracker.Step..ProgressTracker.Step?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> Step

'it' @ [816:24] ==> value-parameter it: (ProgressTracker.Change.Position..ProgressTracker.Change.Position?) defined in net.corda.node.services.statemachine.FlowFrameworkTests.<get-progressSteps>.<anonymous>[ValueParameterDescriptorImpl]

'newStep' @ [816:27] ==> public final val newStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker.Change.Position[DeserializedPropertyDescriptor]

'materialize' @ [817:18] ==> public final fun materialize(): (Observable<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>..Observable<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'toList' @ [818:18] ==> public final fun toList(): (Observable<(MutableList<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>..List<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>?)>..Observable<(MutableList<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>..List<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'toFuture' @ [819:18] ==> public fun <T> Observable<(MutableList<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>..List<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>?)>.toFuture(): CordaFuture<(MutableList<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>..List<(Notification<(ProgressTracker.Step..ProgressTracker.Step?)>..Notification<(ProgressTracker.Step..ProgressTracker.Step?)>?)>?)> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(rx.Notification<(net.corda.core.utilities.ProgressTracker.Step..net.corda.core.utilities.ProgressTracker.Step?)>..rx.Notification<(net.corda.core.utilities.ProgressTracker.Step..net.corda.core.utilities.ProgressTracker.Step?)>?)>..kotlin.collections.List<(rx.Notification<(net.corda.core.utilities.ProgressTracker.Step..net.corda.core.utilities.ProgressTracker.Step?)>..rx.Notification<(net.corda.core.utilities.ProgressTracker.Step..net.corda.core.utilities.ProgressTracker.Step?)>?)>?)

'FlowLogic<Unit>' @ [822:46] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'lazy' @ [823:34] ==> public fun <T> lazy(initializer: () -> (Instant..Instant?)): Lazy<(Instant..Instant?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.time.Instant..java.time.Instant?)

'serviceHub' @ [823:41] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.statemachine.FlowFrameworkTests.LazyServiceHubAccessFlow[DeserializedPropertyDescriptor]

'clock' @ [823:52] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [823:58] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'Suspendable' @ [824:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Unit' @ [825:31] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'FlowLogic<Unit>' @ [828:67] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Transient' @ [829:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Suspendable' @ [831:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'flowStarted' @ [833:13] ==> @Transient public final var flowStarted: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'nonTerminating' @ [834:17] ==> public final val nonTerminating: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.NoOpFlow[PropertyDescriptorImpl]

'park' @ [835:23] ==> public open fun park(): Unit defined in co.paralleluniverse.fibers.Fiber[JavaMethodDescriptor]

'InitiatingFlow' @ [840:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [841:85] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'require' @ [843:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'otherParties' @ [843:21] ==> public final val otherParties: Array<out Party> defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[PropertyDescriptorImpl]

'isNotEmpty' @ [843:34] ==> @InlineOnly public inline fun <T> Array<out Party>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'Suspendable' @ [846:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'otherParties' @ [847:31] ==> public final val otherParties: Array<out Party> defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[PropertyDescriptorImpl]

'forEach' @ [847:44] ==> public inline fun <T> Array<out Party>.forEach(action: (Party) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'send' @ [847:54] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[DeserializedSimpleFunctionDescriptor]

'it' @ [847:59] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'payload' @ [847:63] ==> public final val payload: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[PropertyDescriptorImpl]

'SendFlow' @ [852:89] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'payload' @ [852:98] ==> value-parameter payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.CustomSendFlow.<init>[ValueParameterDescriptorImpl]

'otherParty' @ [852:107] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.CustomSendFlow.<init>[ValueParameterDescriptorImpl]

'InitiatingFlow' @ [854:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'SendFlow' @ [855:98] ==> public constructor SendFlow(payload: Any, vararg otherParties: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendFlow[ClassConstructorDescriptorImpl]

'payload' @ [855:107] ==> value-parameter payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.IncorrectCustomSendFlow.<init>[ValueParameterDescriptorImpl]

'otherParty' @ [855:116] ==> value-parameter otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.IncorrectCustomSendFlow.<init>[ValueParameterDescriptorImpl]

'InitiatingFlow' @ [857:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [858:65] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'ProgressTracker.Step' @ [859:29] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [860:32] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'require' @ [863:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'otherParties' @ [863:21] ==> public final val otherParties: Array<out Party> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'isNotEmpty' @ [863:34] ==> @InlineOnly public inline fun <T> Array<out Party>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'ProgressTracker' @ [866:57] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'START_STEP' @ [866:73] ==> public object START_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[FakeCallableDescriptorForObject]

'RECEIVED_STEP' @ [866:85] ==> public object RECEIVED_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[FakeCallableDescriptorForObject]

'Transient' @ [868:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'emptyList' @ [868:57] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Suspendable' @ [870:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [872:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'currentStep' @ [872:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'START_STEP' @ [872:43] ==> public object START_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[FakeCallableDescriptorForObject]

'receivedPayloads' @ [873:13] ==> @Transient public final var receivedPayloads: List<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'otherParties' @ [873:32] ==> public final val otherParties: Array<out Party> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'map' @ [873:45] ==> public inline fun <T, R> Array<out Party>.map(transform: (Party) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> String

'receive' @ [873:51] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> String

'it' @ [873:67] ==> value-parameter it: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [873:71] ==> public inline fun <T, R> UntrustworthyData<String>.unwrap(validator: (String) -> String): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [873:80] ==> value-parameter it: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'progressTracker' @ [874:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'currentStep' @ [874:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'RECEIVED_STEP' @ [874:43] ==> public object RECEIVED_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[FakeCallableDescriptorForObject]

'nonTerminating' @ [875:17] ==> private final var nonTerminating: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'park' @ [876:23] ==> public open fun park(): Unit defined in co.paralleluniverse.fibers.Fiber[JavaMethodDescriptor]

'nonTerminating' @ [881:13] ==> private final var nonTerminating: Boolean defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[PropertyDescriptorImpl]

'this' @ [882:20] ==> <this> defined in net.corda.node.services.statemachine.FlowFrameworkTests.ReceiveFlow[LazyClassReceiverParameterDescriptor]

'InitiatingFlow' @ [886:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Any>' @ [887:81] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Any

'Suspendable' @ [888:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'sendAndReceive' @ [889:36] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<Any> defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Any

'otherParty' @ [889:56] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[PropertyDescriptorImpl]

'payload' @ [889:68] ==> public final val payload: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow[PropertyDescriptorImpl]

'unwrap' @ [889:77] ==> public inline fun <T, R> UntrustworthyData<Any>.unwrap(validator: (Any) -> Any): Any defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> Any

'it' @ [889:86] ==> value-parameter it: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.SendAndReceiveFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'FlowLogic<Unit>' @ [892:81] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [893:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'send' @ [894:31] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.InlinedSendFlow[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [894:36] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.InlinedSendFlow[PropertyDescriptorImpl]

'payload' @ [894:48] ==> public final val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.InlinedSendFlow[PropertyDescriptorImpl]

'InitiatingFlow' @ [897:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [898:76] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Transient' @ [899:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [900:9] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Suspendable' @ [902:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receivedPayload' @ [904:13] ==> @Transient public final var receivedPayload: Long? defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'sendAndReceive' @ [904:31] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<Long> defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Long

'otherParty' @ [904:52] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'payload' @ [904:64] ==> public final val payload: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'unwrap' @ [904:73] ==> public inline fun <T, R> UntrustworthyData<Long>.unwrap(validator: (Long) -> Long): Long defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long
    <R> -> Long

'it' @ [904:82] ==> value-parameter it: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'receivedPayload2' @ [905:13] ==> @Transient public final var receivedPayload2: Long? defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'sendAndReceive' @ [905:32] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<Long> defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Long

'otherParty' @ [905:53] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'payload' @ [905:65] ==> public final val payload: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow[PropertyDescriptorImpl]

'unwrap' @ [905:78] ==> public inline fun <T, R> UntrustworthyData<Long>.unwrap(validator: (Long) -> Long): Long defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long
    <R> -> Long

'it' @ [905:87] ==> value-parameter it: Long defined in net.corda.node.services.statemachine.FlowFrameworkTests.PingPongFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'FlowLogic<Nothing>' @ [909:74] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Nothing

'ProgressTracker.Step' @ [910:29] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [912:57] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'START_STEP' @ [912:73] ==> public object START_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[FakeCallableDescriptorForObject]

'progressTracker' @ [916:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[PropertyDescriptorImpl]

'currentStep' @ [916:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'START_STEP' @ [916:43] ==> public object START_STEP : ProgressTracker.Step defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[FakeCallableDescriptorForObject]

'exceptionThrown' @ [917:13] ==> public final lateinit var exceptionThrown: E defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[PropertyDescriptorImpl]

'invoke' @ [917:31] ==> public abstract operator fun invoke(): E defined in kotlin.Function0[FunctionInvokeDescriptor]

'exceptionThrown' @ [918:19] ==> public final lateinit var exceptionThrown: E defined in net.corda.node.services.statemachine.FlowFrameworkTests.ExceptionFlow[PropertyDescriptorImpl]

'FlowException' @ [922:67] ==> public constructor FlowException() defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'other' @ [923:53] ==> value-parameter other: Any? defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException.equals[ValueParameterDescriptorImpl]

'other' @ [923:81] ==> value-parameter other: Any? defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException.equals[ValueParameterDescriptorImpl]

'message' @ [923:87] ==> public open val message: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[PropertyDescriptorImpl]

'this' @ [923:98] ==> <this> defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[LazyClassReceiverParameterDescriptor]

'message' @ [923:103] ==> public open val message: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[PropertyDescriptorImpl]

'message' @ [924:40] ==> public open val message: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.MyFlowException[PropertyDescriptorImpl]

'hashCode' @ [924:48] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'InitiatingFlow' @ [928:9] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [929:75] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [930:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'send' @ [932:17] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [932:22] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[PropertyDescriptorImpl]

'stx' @ [932:34] ==> public final val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[PropertyDescriptorImpl]

'waitForLedgerCommit' @ [933:24] ==> @Suspendable public final fun waitForLedgerCommit(hash: SecureHash): SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[DeserializedSimpleFunctionDescriptor]

'stx' @ [933:44] ==> public final val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Waiter[PropertyDescriptorImpl]

'id' @ [933:48] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'FlowLogic<SignedTransaction>' @ [937:97] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [938:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [940:27] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<SignedTransaction> defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> SignedTransaction

'otherParty' @ [940:54] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[PropertyDescriptorImpl]

'unwrap' @ [940:66] ==> public inline fun <T, R> UntrustworthyData<SignedTransaction>.unwrap(validator: (SignedTransaction) -> SignedTransaction): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> SignedTransaction

'it' @ [940:75] ==> value-parameter it: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer.call.<anonymous>[ValueParameterDescriptorImpl]

'throwException' @ [941:21] ==> public final val throwException: (() -> Exception /* = Exception */)? defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[PropertyDescriptorImpl]

'throwException' @ [941:51] ==> public final val throwException: (() -> Exception /* = Exception */)? defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[PropertyDescriptorImpl]

'invoke' @ [941:66] ==> public abstract operator fun invoke(): Exception /* = Exception */ defined in kotlin.Function0[FunctionInvokeDescriptor]

'subFlow' @ [942:24] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [942:32] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [942:45] ==> val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer.call[LocalVariableDescriptor]

'setOf' @ [942:50] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'otherParty' @ [942:56] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.WaitingFlows.Committer[PropertyDescriptorImpl]

'single' @ [942:70] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'InitiatingFlow' @ [947:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<List<StateAndRef<ContractState>>>' @ [948:87] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> List<StateAndRef<ContractState>>

'Suspendable' @ [949:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'send' @ [951:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [951:18] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[PropertyDescriptorImpl]

'stx' @ [951:30] ==> public final val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[PropertyDescriptorImpl]

'serviceHub' @ [954:33] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[DeserializedPropertyDescriptor]

'vaultQueryService' @ [954:44] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'waitForLedgerCommit' @ [955:13] ==> @Suspendable public final fun waitForLedgerCommit(hash: SecureHash): SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[DeserializedSimpleFunctionDescriptor]

'stx' @ [955:33] ==> public final val stx: SignedTransaction defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow[PropertyDescriptorImpl]

'id' @ [955:37] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'vaultQuerySvc' @ [956:20] ==> val vaultQuerySvc: VaultQueryService defined in net.corda.node.services.statemachine.FlowFrameworkTests.VaultQueryFlow.call[LocalVariableDescriptor]

'queryBy' @ [956:34] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'states' @ [956:59] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'InitiatingFlow' @ [960:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Pair<Any, Int>>' @ [961:57] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Pair<Any, Int>

'Suspendable' @ [962:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [964:28] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Any> defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Any

'otherParty' @ [964:41] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[PropertyDescriptorImpl]

'unwrap' @ [964:53] ==> public inline fun <T, R> UntrustworthyData<Any>.unwrap(validator: (Any) -> Any): Any defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any
    <R> -> Any

'it' @ [964:62] ==> value-parameter it: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'getFlowContext' @ [965:36] ==> @Suspendable public final fun getFlowContext(otherParty: Party): FlowContext defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [965:51] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow[PropertyDescriptorImpl]

'flowVersion' @ [965:63] ==> public final val flowVersion: Int defined in net.corda.core.flows.FlowContext[DeserializedPropertyDescriptor]

'Pair' @ [966:20] ==> public constructor Pair<out A, out B>(first: Any, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Any
    <out B> -> Int

'received' @ [966:25] ==> val received: Any defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow.call[LocalVariableDescriptor]

'otherFlowVersion' @ [966:35] ==> val otherFlowVersion: Int defined in net.corda.node.services.statemachine.FlowFrameworkTests.UpgradedFlow.call[LocalVariableDescriptor]

'FlowLogic<Unit>' @ [970:65] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [971:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [973:27] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<String> defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> String

'otherParty' @ [973:43] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow[PropertyDescriptorImpl]

'unwrap' @ [973:55] ==> public inline fun <T, R> UntrustworthyData<String>.unwrap(validator: (String) -> String): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [973:64] ==> value-parameter it: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'subFlow' @ [974:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Unit>): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'InlinedSendFlow' @ [974:21] ==> public constructor InlinedSendFlow(payload: String, otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.InlinedSendFlow[ClassConstructorDescriptorImpl]

'payload' @ [974:37] ==> val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow.call[LocalVariableDescriptor]

'payload' @ [974:47] ==> val payload: String defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow.call[LocalVariableDescriptor]

'otherParty' @ [974:56] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow[PropertyDescriptorImpl]

'FlowLogic<Unit>' @ [978:65] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [979:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [981:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Unit>): Unit defined in net.corda.node.services.statemachine.FlowFrameworkTests.DoubleInlinedSubFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'SingleInlinedSubFlow' @ [981:21] ==> public constructor SingleInlinedSubFlow(otherParty: Party) defined in net.corda.node.services.statemachine.FlowFrameworkTests.SingleInlinedSubFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [981:42] ==> public final val otherParty: Party defined in net.corda.node.services.statemachine.FlowFrameworkTests.DoubleInlinedSubFlow[PropertyDescriptorImpl]

'Suppress' @ [986:48] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'FlowException' @ [986:101] ==> public constructor FlowException() defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

