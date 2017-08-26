'Before' @ [25:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [28:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.IdentitySyncFlowTests[PropertyDescriptorImpl]

'MockNetwork' @ [28:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'After' @ [31:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [33:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.IdentitySyncFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [33:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [36:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [39:26] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.IdentitySyncFlowTests[PropertyDescriptorImpl]

'createNotaryNode' @ [39:34] ==> public final fun createNotaryNode(networkMapAddress: SingleMessageRecipient? = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., serviceName: X500Name? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [39:57] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [39:70] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mockNet' @ [40:25] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.IdentitySyncFlowTests[PropertyDescriptorImpl]

'createPartyNode' @ [40:33] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [40:49] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'network' @ [40:60] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [40:68] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'ALICE' @ [40:79] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [40:85] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mockNet' @ [41:23] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.IdentitySyncFlowTests[PropertyDescriptorImpl]

'createPartyNode' @ [41:31] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [41:47] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'network' @ [41:58] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [41:66] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'BOB' @ [41:77] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [41:81] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'aliceNode' @ [42:28] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [42:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myInfo' @ [42:47] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'legalIdentity' @ [42:54] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobNode' @ [43:26] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [43:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myInfo' @ [43:43] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'legalIdentity' @ [43:50] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'aliceNode' @ [44:9] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [44:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [44:28] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [44:44] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'bobNode' @ [44:70] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'info' @ [44:78] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [44:83] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'aliceNode' @ [45:9] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [45:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [45:28] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [45:44] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [45:70] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'info' @ [45:81] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [45:86] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobNode' @ [46:9] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [46:17] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [46:26] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [46:42] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'aliceNode' @ [46:68] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'info' @ [46:78] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [46:83] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobNode' @ [47:9] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [47:17] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [47:26] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [47:42] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [47:68] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'info' @ [47:79] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [47:84] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobNode' @ [48:9] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'registerInitiatedFlow' @ [48:17] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<IdentitySyncFlowTests.Receive>): Observable<IdentitySyncFlowTests.Receive> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> Receive

'Receive' @ [48:39] ==> public constructor Receive(otherSide: Party) defined in net.corda.core.flows.IdentitySyncFlowTests.Receive[ClassConstructorDescriptorImpl]

'java' @ [48:54] ==> public val <T> KClass<IdentitySyncFlowTests.Receive>.java: Class<IdentitySyncFlowTests.Receive> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Receive

'OpaqueBytes' @ [52:19] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [52:31] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'aliceNode' @ [53:25] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [53:35] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [53:44] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueAndPaymentFlow' @ [53:54] ==> public constructor CashIssueAndPaymentFlow(amount: Amount<Currency>, issueRef: OpaqueBytes, recipient: Party, anonymous: Boolean, notary: Party) defined in net.corda.finance.flows.CashIssueAndPaymentFlow[DeserializedClassConstructorDescriptor]

'DOLLARS' @ [53:83] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'ref' @ [53:92] ==> val ref: OpaqueBytes defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'alice' @ [53:97] ==> val alice: Party defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'anonymous' @ [53:104] ==> val anonymous: Boolean defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'notaryNode' @ [53:115] ==> val notaryNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [53:126] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myInfo' @ [53:135] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'notaryIdentity' @ [53:142] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'issueFlow' @ [54:23] ==> val issueFlow: FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'resultFuture' @ [54:33] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [54:46] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'stx' @ [54:59] ==> public final val stx: SignedTransaction defined in net.corda.finance.flows.AbstractCashFlow.Result[DeserializedPropertyDescriptor]

'issueTx' @ [55:36] ==> val issueTx: SignedTransaction defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'tx' @ [55:44] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [55:47] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'map' @ [55:55] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> ContractState

'it' @ [55:61] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [55:64] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'filterIsInstance' @ [55:71] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> State

'single' @ [55:102] ==> public fun <T> List<Cash.State>.single(): Cash.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'owner' @ [55:111] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'assertNull' @ [56:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'bobNode' @ [56:20] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [56:28] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [56:37] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [56:53] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'confidentialIdentity' @ [56:72] ==> val confidentialIdentity: AbstractParty defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'aliceNode' @ [59:9] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [59:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [59:28] ==> public open fun <T> startFlow(logic: FlowLogic<Boolean>): FlowStateMachine<Boolean> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'Initiator' @ [59:38] ==> public constructor Initiator(otherSide: Party, tx: WireTransaction) defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator[ClassConstructorDescriptorImpl]

'bob' @ [59:48] ==> val bob: Party defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'issueTx' @ [59:53] ==> val issueTx: SignedTransaction defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'tx' @ [59:61] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'resultFuture' @ [59:66] ==> public abstract val resultFuture: CordaFuture<Boolean> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [59:79] ==> public fun <V> Future<Boolean>.getOrThrow(timeout: Duration? = ...): Boolean defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Boolean

'aliceNode' @ [60:24] ==> val aliceNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [60:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [60:43] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [60:59] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'confidentialIdentity' @ [60:78] ==> val confidentialIdentity: AbstractParty defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'bobNode' @ [61:22] ==> val bobNode: MockNetwork.MockNode defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'services' @ [61:30] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [61:39] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [61:55] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'confidentialIdentity' @ [61:74] ==> val confidentialIdentity: AbstractParty defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'assertEquals' @ [62:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party?, actual: Party?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party?

'expected' @ [62:22] ==> val expected: Party? defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'actual' @ [62:32] ==> val actual: Party? defined in net.corda.core.flows.IdentitySyncFlowTests.`sync confidential identities`[LocalVariableDescriptor]

'InitiatingFlow' @ [68:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Boolean>' @ [69:69] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Boolean

'Suspendable' @ [70:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [72:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Unit>): Unit defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'IdentitySyncFlow' @ [72:21] ==> public object IdentitySyncFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Send' @ [72:38] ==> public constructor Send(otherSide: Party, tx: WireTransaction) defined in net.corda.core.flows.IdentitySyncFlow.Send[DeserializedClassConstructorDescriptor]

'otherSide' @ [72:43] ==> public final val otherSide: Party defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator[PropertyDescriptorImpl]

'tx' @ [72:54] ==> public final val tx: WireTransaction defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator[PropertyDescriptorImpl]

'receive' @ [74:20] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Boolean> defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Boolean

'otherSide' @ [74:37] ==> public final val otherSide: Party defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator[PropertyDescriptorImpl]

'unwrap' @ [74:48] ==> public inline fun <T, R> UntrustworthyData<Boolean>.unwrap(validator: (Boolean) -> Boolean): Boolean defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Boolean

'it' @ [74:57] ==> value-parameter it: Boolean defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator.call.<anonymous>[ValueParameterDescriptorImpl]

'InitiatedBy' @ [78:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'Initiator' @ [78:40] ==> public constructor Initiator(otherSide: Party, tx: WireTransaction) defined in net.corda.core.flows.IdentitySyncFlowTests.Initiator[ClassConstructorDescriptorImpl]

'FlowLogic<Unit>' @ [79:42] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [80:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [82:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Unit>): Unit defined in net.corda.core.flows.IdentitySyncFlowTests.Receive[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'IdentitySyncFlow' @ [82:21] ==> public object IdentitySyncFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Receive' @ [82:38] ==> public constructor Receive(otherSide: Party) defined in net.corda.core.flows.IdentitySyncFlow.Receive[DeserializedClassConstructorDescriptor]

'otherSide' @ [82:46] ==> public final val otherSide: Party defined in net.corda.core.flows.IdentitySyncFlowTests.Receive[PropertyDescriptorImpl]

'send' @ [84:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.flows.IdentitySyncFlowTests.Receive[DeserializedSimpleFunctionDescriptor]

'otherSide' @ [84:18] ==> public final val otherSide: Party defined in net.corda.core.flows.IdentitySyncFlowTests.Receive[PropertyDescriptorImpl]

