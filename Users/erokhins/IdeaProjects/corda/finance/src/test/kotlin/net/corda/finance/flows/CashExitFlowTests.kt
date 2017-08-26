'MockNetwork' @ [19:27] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'RoundRobin' @ [19:71] ==> public constructor RoundRobin() defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin[DeserializedClassConstructorDescriptor]

'DOLLARS' @ [20:39] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [21:23] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [21:35] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'Before' @ [27:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [29:21] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'createSomeNodes' @ [29:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [30:9] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'nodes' @ [30:22] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.finance.flows.CashExitFlowTests.start[LocalVariableDescriptor]

'notaryNode' @ [30:28] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [31:9] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'nodes' @ [31:27] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.finance.flows.CashExitFlowTests.start[LocalVariableDescriptor]

'partyNodes' @ [31:33] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'notary' @ [32:9] ==> private final lateinit var notary: Party defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'notaryNode' @ [32:18] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'info' @ [32:29] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [32:34] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bankOfCorda' @ [33:9] ==> private final lateinit var bankOfCorda: Party defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'bankOfCordaNode' @ [33:23] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'info' @ [33:39] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [33:44] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [35:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [35:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'bankOfCordaNode' @ [36:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'services' @ [36:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [36:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [36:57] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'initialBalance' @ [36:71] ==> private final val initialBalance: Amount<Currency> defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'ref' @ [36:87] ==> private final val ref: OpaqueBytes defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'notary' @ [36:92] ==> private final lateinit var notary: Party defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'resultFuture' @ [36:101] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [37:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [37:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [38:9] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashExitFlowTests.start[LocalVariableDescriptor]

'getOrThrow' @ [38:16] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'After' @ [41:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [43:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [43:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [46:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DOLLARS' @ [48:30] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [49:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'services' @ [49:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [49:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashExitFlow' @ [49:57] ==> public constructor CashExitFlow(amount: Amount<Currency>, issueRef: OpaqueBytes) defined in net.corda.finance.flows.CashExitFlow[DeserializedClassConstructorDescriptor]

'exitAmount' @ [49:70] ==> val exitAmount: Amount<Currency> defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'ref' @ [49:82] ==> private final val ref: OpaqueBytes defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'resultFuture' @ [49:88] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [50:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [50:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [51:22] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'getOrThrow' @ [51:29] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'stx' @ [51:42] ==> public final val stx: SignedTransaction defined in net.corda.finance.flows.AbstractCashFlow.Result[DeserializedPropertyDescriptor]

'tx' @ [51:46] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'initialBalance' @ [52:25] ==> private final val initialBalance: Amount<Currency> defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'exitAmount' @ [52:42] ==> val exitAmount: Amount<Currency> defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'`issued by`' @ [52:54] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'bankOfCorda' @ [52:66] ==> private final lateinit var bankOfCorda: Party defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'ref' @ [52:78] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'ref' @ [52:82] ==> private final val ref: OpaqueBytes defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'assertEquals' @ [53:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'exitTx' @ [53:25] ==> val exitTx: WireTransaction defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'inputs' @ [53:32] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [53:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [54:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'exitTx' @ [54:25] ==> val exitTx: WireTransaction defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'outputs' @ [54:32] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [54:40] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'exitTx' @ [55:22] ==> val exitTx: WireTransaction defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'outputsOfType' @ [55:29] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<Cash.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'single' @ [55:57] ==> public fun <T> List<Cash.State>.single(): Cash.State defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'assertEquals' @ [56:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'expected' @ [56:22] ==> val expected: Amount<Issued<Currency>> defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'output' @ [56:32] ==> val output: Cash.State defined in net.corda.finance.flows.CashExitFlowTests.`exit some cash`[LocalVariableDescriptor]

'amount' @ [56:39] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'Test' @ [59:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DOLLARS' @ [61:26] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [62:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'services' @ [62:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [62:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashExitFlow' @ [62:57] ==> public constructor CashExitFlow(amount: Amount<Currency>, issueRef: OpaqueBytes) defined in net.corda.finance.flows.CashExitFlow[DeserializedClassConstructorDescriptor]

'expected' @ [62:70] ==> val expected: Amount<Currency> defined in net.corda.finance.flows.CashExitFlowTests.`exit zero cash`[LocalVariableDescriptor]

'ref' @ [62:80] ==> private final val ref: OpaqueBytes defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'resultFuture' @ [62:86] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [63:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashExitFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [63:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [64:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): CashException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> CashException

'future' @ [65:13] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashExitFlowTests.`exit zero cash`[LocalVariableDescriptor]

'getOrThrow' @ [65:20] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

