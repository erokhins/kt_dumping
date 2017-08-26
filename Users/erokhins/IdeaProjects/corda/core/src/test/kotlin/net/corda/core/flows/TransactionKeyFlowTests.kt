'Test' @ [18:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MockNetwork' @ [21:23] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [24:26] ==> val mockNet: MockNetwork defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'createNotaryNode' @ [24:34] ==> public final fun createNotaryNode(networkMapAddress: SingleMessageRecipient? = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., serviceName: X500Name? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [24:57] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [24:70] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mockNet' @ [25:25] ==> val mockNet: MockNetwork defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'createPartyNode' @ [25:33] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [25:49] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'network' @ [25:60] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [25:68] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'ALICE' @ [25:79] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [25:85] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mockNet' @ [26:23] ==> val mockNet: MockNetwork defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'createPartyNode' @ [26:31] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [26:47] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'network' @ [26:58] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [26:66] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'BOB' @ [26:77] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [26:81] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'aliceNode' @ [27:28] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [27:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myInfo' @ [27:47] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'legalIdentity' @ [27:54] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobNode' @ [28:26] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [28:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myInfo' @ [28:43] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'legalIdentity' @ [28:50] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'aliceNode' @ [29:9] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [29:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [29:28] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [29:44] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'bobNode' @ [29:70] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'info' @ [29:78] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [29:83] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'aliceNode' @ [30:9] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [30:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [30:28] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [30:44] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [30:70] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'info' @ [30:81] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [30:86] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobNode' @ [31:9] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [31:17] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [31:26] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [31:42] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'aliceNode' @ [31:68] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'info' @ [31:78] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [31:83] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobNode' @ [32:9] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [32:17] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [32:26] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [32:42] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [32:68] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'info' @ [32:79] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [32:84] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'aliceNode' @ [35:29] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [35:39] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [35:48] ==> public open fun <T> startFlow(logic: FlowLogic<LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */>): FlowStateMachine<LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<Party, AnonymousParty>

'TransactionKeyFlow' @ [35:58] ==> public constructor TransactionKeyFlow(otherSide: Party) defined in net.corda.core.flows.TransactionKeyFlow[DeserializedClassConstructorDescriptor]

'bob' @ [35:77] ==> val bob: Party defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'requesterFlow' @ [38:50] ==> val requesterFlow: FlowStateMachine<LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */> defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'resultFuture' @ [38:64] ==> public abstract val resultFuture: CordaFuture<LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [38:77] ==> public fun <V> Future<LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */>.getOrThrow(timeout: Duration? = ...): LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */ defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> LinkedHashMap<Party, AnonymousParty>

'toMap' @ [38:90] ==> @SinceKotlin public fun <K, V> Map<out Party, AnonymousParty>.toMap(): Map<Party, AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Party
    <V> -> AnonymousParty

'assertEquals' @ [39:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'actual' @ [39:25] ==> val actual: Map<Party, AnonymousParty> defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'size' @ [39:32] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'actual' @ [41:38] ==> val actual: Map<Party, AnonymousParty> defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'alice' @ [41:45] ==> val alice: Party defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'IllegalStateException' @ [41:61] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'actual' @ [42:36] ==> val actual: Map<Party, AnonymousParty> defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'bob' @ [42:43] ==> val bob: Party defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'IllegalStateException' @ [42:57] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'assertNotEquals' @ [43:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: AbstractParty, actual: AbstractParty, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AbstractParty

'alice' @ [43:40] ==> val alice: Party defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'aliceAnonymousIdentity' @ [43:47] ==> val aliceAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'assertNotEquals' @ [44:9] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: AbstractParty, actual: AbstractParty, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> AbstractParty

'bob' @ [44:40] ==> val bob: Party defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'bobAnonymousIdentity' @ [44:45] ==> val bobAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'assertEquals' @ [47:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: X500Name, actual: X500Name, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> X500Name

'alice' @ [47:22] ==> val alice: Party defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'name' @ [47:28] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'aliceNode' @ [47:34] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [47:44] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [47:53] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [47:69] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'aliceAnonymousIdentity' @ [47:88] ==> val aliceAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'name' @ [47:114] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'assertEquals' @ [48:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: X500Name, actual: X500Name, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> X500Name

'bob' @ [48:22] ==> val bob: Party defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'name' @ [48:26] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'bobNode' @ [48:32] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [48:40] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [48:49] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [48:65] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'bobAnonymousIdentity' @ [48:84] ==> val bobAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'name' @ [48:108] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'assertTrue' @ [51:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceAnonymousIdentity' @ [51:22] ==> val aliceAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'owningKey' @ [51:45] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AnonymousParty[DeserializedPropertyDescriptor]

'aliceNode' @ [51:58] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [51:68] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'keyManagementService' @ [51:77] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'keys' @ [51:98] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'assertTrue' @ [52:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'bobAnonymousIdentity' @ [52:22] ==> val bobAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'owningKey' @ [52:43] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AnonymousParty[DeserializedPropertyDescriptor]

'bobNode' @ [52:56] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [52:64] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'keyManagementService' @ [52:73] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'keys' @ [52:94] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'assertFalse' @ [53:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceAnonymousIdentity' @ [53:23] ==> val aliceAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'owningKey' @ [53:46] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AnonymousParty[DeserializedPropertyDescriptor]

'bobNode' @ [53:59] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [53:67] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'keyManagementService' @ [53:76] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'keys' @ [53:97] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'assertFalse' @ [54:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'bobAnonymousIdentity' @ [54:23] ==> val bobAnonymousIdentity: AnonymousParty defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'owningKey' @ [54:44] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AnonymousParty[DeserializedPropertyDescriptor]

'aliceNode' @ [54:57] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'services' @ [54:67] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'keyManagementService' @ [54:76] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'keys' @ [54:97] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'mockNet' @ [56:9] ==> val mockNet: MockNetwork defined in net.corda.core.flows.TransactionKeyFlowTests.`issue key`[LocalVariableDescriptor]

'stopNodes' @ [56:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

