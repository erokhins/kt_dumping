'MockNetwork' @ [19:27] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'RoundRobin' @ [19:71] ==> public constructor RoundRobin() defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin[DeserializedClassConstructorDescriptor]

'Before' @ [25:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [27:21] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'createSomeNodes' @ [27:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [28:9] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'nodes' @ [28:22] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.finance.flows.CashIssueFlowTests.start[LocalVariableDescriptor]

'notaryNode' @ [28:28] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [29:9] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'nodes' @ [29:27] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.finance.flows.CashIssueFlowTests.start[LocalVariableDescriptor]

'partyNodes' @ [29:33] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'notary' @ [30:9] ==> private final lateinit var notary: Party defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'notaryNode' @ [30:18] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'info' @ [30:29] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [30:34] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bankOfCorda' @ [31:9] ==> private final lateinit var bankOfCorda: Party defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'bankOfCordaNode' @ [31:23] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'info' @ [31:39] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [31:44] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [33:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [33:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [36:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [38:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [38:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [41:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DOLLARS' @ [43:28] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [44:19] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [44:31] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'bankOfCordaNode' @ [45:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'services' @ [45:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [45:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [45:57] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'expected' @ [45:71] ==> val expected: Amount<Currency> defined in net.corda.finance.flows.CashIssueFlowTests.`issue some cash`[LocalVariableDescriptor]

'ref' @ [45:81] ==> val ref: OpaqueBytes defined in net.corda.finance.flows.CashIssueFlowTests.`issue some cash`[LocalVariableDescriptor]

'notary' @ [45:86] ==> private final lateinit var notary: Party defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'resultFuture' @ [45:95] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [46:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [46:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [47:23] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashIssueFlowTests.`issue some cash`[LocalVariableDescriptor]

'getOrThrow' @ [47:30] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'stx' @ [47:43] ==> public final val stx: SignedTransaction defined in net.corda.finance.flows.AbstractCashFlow.Result[DeserializedPropertyDescriptor]

'issueTx' @ [48:22] ==> val issueTx: SignedTransaction defined in net.corda.finance.flows.CashIssueFlowTests.`issue some cash`[LocalVariableDescriptor]

'tx' @ [48:30] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputsOfType' @ [48:33] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<Cash.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [48:61] ==> public fun <T> List<Cash.State>.single(): Cash.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'assertEquals' @ [49:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'expected' @ [49:22] ==> val expected: Amount<Currency> defined in net.corda.finance.flows.CashIssueFlowTests.`issue some cash`[LocalVariableDescriptor]

'`issued by`' @ [49:31] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'bankOfCorda' @ [49:43] ==> private final lateinit var bankOfCorda: Party defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'ref' @ [49:55] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'ref' @ [49:59] ==> val ref: OpaqueBytes defined in net.corda.finance.flows.CashIssueFlowTests.`issue some cash`[LocalVariableDescriptor]

'output' @ [49:66] ==> val output: Cash.State defined in net.corda.finance.flows.CashIssueFlowTests.`issue some cash`[LocalVariableDescriptor]

'amount' @ [49:73] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DOLLARS' @ [54:26] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [55:19] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [55:31] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'bankOfCordaNode' @ [56:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'services' @ [56:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [56:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [56:57] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'expected' @ [56:71] ==> val expected: Amount<Currency> defined in net.corda.finance.flows.CashIssueFlowTests.`issue zero cash`[LocalVariableDescriptor]

'ref' @ [56:81] ==> val ref: OpaqueBytes defined in net.corda.finance.flows.CashIssueFlowTests.`issue zero cash`[LocalVariableDescriptor]

'notary' @ [56:86] ==> private final lateinit var notary: Party defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'resultFuture' @ [56:95] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [57:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashIssueFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [57:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [58:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'future' @ [59:13] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashIssueFlowTests.`issue zero cash`[LocalVariableDescriptor]

'getOrThrow' @ [59:20] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

