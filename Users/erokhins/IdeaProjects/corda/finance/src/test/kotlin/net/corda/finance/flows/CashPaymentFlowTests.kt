'MockNetwork' @ [24:27] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'RoundRobin' @ [24:71] ==> public constructor RoundRobin() defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin[DeserializedClassConstructorDescriptor]

'DOLLARS' @ [25:39] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [26:23] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [26:35] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'Before' @ [32:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [34:21] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'createSomeNodes' @ [34:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [35:9] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'nodes' @ [35:22] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.finance.flows.CashPaymentFlowTests.start[LocalVariableDescriptor]

'notaryNode' @ [35:28] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [36:9] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'nodes' @ [36:27] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.finance.flows.CashPaymentFlowTests.start[LocalVariableDescriptor]

'partyNodes' @ [36:33] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'notary' @ [37:9] ==> private final lateinit var notary: Party defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'notaryNode' @ [37:18] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'info' @ [37:29] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [37:34] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bankOfCorda' @ [38:9] ==> private final lateinit var bankOfCorda: Party defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'bankOfCordaNode' @ [38:23] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'info' @ [38:39] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [38:44] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [40:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'services' @ [40:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [40:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [40:57] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'initialBalance' @ [40:71] ==> private final val initialBalance: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'ref' @ [40:87] ==> private final val ref: OpaqueBytes defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'notary' @ [40:92] ==> private final lateinit var notary: Party defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'resultFuture' @ [40:101] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [41:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [41:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [42:9] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashPaymentFlowTests.start[LocalVariableDescriptor]

'getOrThrow' @ [42:16] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'After' @ [45:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [47:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [47:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [50:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'notaryNode' @ [52:21] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'info' @ [52:32] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [52:37] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'DOLLARS' @ [53:35] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'DOLLARS' @ [54:35] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [56:9] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'database' @ [56:25] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [56:34] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'VaultQueryCriteria' @ [58:42] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'Vault' @ [58:70] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'ALL' @ [58:88] ==> enum entry ALL defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'component1' @ [59:18] ==> public final operator fun component1(): Vault.Page<Cash.State> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [59:21] ==> public final operator fun component2(): Observable<Vault.Update<Cash.State>> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'bankOfCordaNode' @ [59:40] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'services' @ [59:56] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [59:65] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'trackBy' @ [59:83] ==> public inline fun <reified T : ContractState> VaultQueryService.trackBy(criteria: QueryCriteria): DataFeed<Vault.Page<Cash.State>, Vault.Update<Cash.State>> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteria' @ [59:103] ==> val criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>[LocalVariableDescriptor]

'component1' @ [60:18] ==> public final operator fun component1(): Vault.Page<Cash.State> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [60:21] ==> public final operator fun component2(): Observable<Vault.Update<Cash.State>> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [60:47] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'services' @ [60:58] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [60:67] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'trackBy' @ [60:85] ==> public inline fun <reified T : ContractState> VaultQueryService.trackBy(criteria: QueryCriteria): DataFeed<Vault.Page<Cash.State>, Vault.Update<Cash.State>> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'criteria' @ [60:105] ==> val criteria: QueryCriteria.VaultQueryCriteria defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>[LocalVariableDescriptor]

'bankOfCordaNode' @ [62:26] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'services' @ [62:42] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [62:51] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashPaymentFlow' @ [62:61] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'expectedPayment' @ [62:77] ==> val expectedPayment: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`[LocalVariableDescriptor]

'payTo' @ [63:21] ==> val payTo: Party defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`[LocalVariableDescriptor]

'resultFuture' @ [63:29] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [64:13] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [64:21] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [65:13] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [65:20] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'vaultUpdatesBoc' @ [69:13] ==> val vaultUpdatesBoc: Observable<Vault.Update<Cash.State>> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>[LocalVariableDescriptor]

'expectEvents' @ [69:29] ==> public fun <E : Any> Observable<Vault.Update<Cash.State>>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<Vault.Update<Cash.State>>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> Update<State>

'expect' @ [70:17] ==> public inline fun <reified E : Any> expect(noinline match: (Vault.Update<Cash.State>) -> Boolean = ..., noinline expectClosure: (Vault.Update<Cash.State>) -> Unit): ExpectCompose<Vault.Update<Cash.State>> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Update<State>

'require' @ [71:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'update' @ [71:29] ==> value-parameter update: Vault.Update<Cash.State> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'consumed' @ [71:36] ==> public final val consumed: Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'size' @ [71:45] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'update' @ [71:96] ==> value-parameter update: Vault.Update<Cash.State> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [72:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'update' @ [72:29] ==> value-parameter update: Vault.Update<Cash.State> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'produced' @ [72:36] ==> public final val produced: Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'size' @ [72:45] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'update' @ [72:96] ==> value-parameter update: Vault.Update<Cash.State> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'update' @ [73:39] ==> value-parameter update: Vault.Update<Cash.State> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'produced' @ [73:46] ==> public final val produced: Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'single' @ [73:55] ==> public fun <T> Iterable<StateAndRef<Cash.State>>.single(): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'state' @ [73:64] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [73:70] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [74:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'expectedChange' @ [74:34] ==> val expectedChange: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`[LocalVariableDescriptor]

'`issued by`' @ [74:49] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'bankOfCorda' @ [74:61] ==> private final lateinit var bankOfCorda: Party defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'ref' @ [74:73] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'ref' @ [74:77] ==> private final val ref: OpaqueBytes defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'changeState' @ [74:84] ==> val changeState: Cash.State defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [74:96] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'vaultUpdatesBankClient' @ [79:13] ==> val vaultUpdatesBankClient: Observable<Vault.Update<Cash.State>> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>[LocalVariableDescriptor]

'expectEvents' @ [79:36] ==> public fun <E : Any> Observable<Vault.Update<Cash.State>>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<Vault.Update<Cash.State>>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> Update<State>

'expect' @ [80:17] ==> public inline fun <reified E : Any> expect(noinline match: (Vault.Update<Cash.State>) -> Boolean = ..., noinline expectClosure: (Vault.Update<Cash.State>) -> Unit): ExpectCompose<Vault.Update<Cash.State>> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Update<State>

'component1' @ [80:27] ==> public final operator fun component1(): Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'component2' @ [80:37] ==> public final operator fun component2(): Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'require' @ [81:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'consumed' @ [81:29] ==> val consumed: Set<StateAndRef<Cash.State>> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [81:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'consumed' @ [81:51] ==> val consumed: Set<StateAndRef<Cash.State>> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [81:60] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'require' @ [82:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'produced' @ [82:29] ==> val produced: Set<StateAndRef<Cash.State>> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [82:38] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'produced' @ [82:51] ==> val produced: Set<StateAndRef<Cash.State>> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [82:60] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'produced' @ [83:40] ==> val produced: Set<StateAndRef<Cash.State>> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'single' @ [83:49] ==> public fun <T> Iterable<StateAndRef<Cash.State>>.single(): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'state' @ [83:58] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [83:64] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [84:21] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'expectedPayment' @ [84:34] ==> val expectedPayment: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`[LocalVariableDescriptor]

'`issued by`' @ [84:50] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'bankOfCorda' @ [84:62] ==> private final lateinit var bankOfCorda: Party defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'ref' @ [84:74] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'ref' @ [84:78] ==> private final val ref: OpaqueBytes defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'paymentState' @ [84:85] ==> val paymentState: Cash.State defined in net.corda.finance.flows.CashPaymentFlowTests.`pay some cash`.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [84:98] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'Test' @ [90:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'notaryNode' @ [92:21] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'info' @ [92:32] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [92:37] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'DOLLARS' @ [93:29] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [94:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'services' @ [94:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [94:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashPaymentFlow' @ [94:57] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'expected' @ [94:73] ==> val expected: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay more than we have`[LocalVariableDescriptor]

'payTo' @ [95:17] ==> val payTo: Party defined in net.corda.finance.flows.CashPaymentFlowTests.`pay more than we have`[LocalVariableDescriptor]

'resultFuture' @ [95:25] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [96:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [96:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [97:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): CashException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> CashException

'future' @ [98:13] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay more than we have`[LocalVariableDescriptor]

'getOrThrow' @ [98:20] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'Test' @ [102:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'notaryNode' @ [104:21] ==> private final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'info' @ [104:32] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [104:37] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'DOLLARS' @ [105:26] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'bankOfCordaNode' @ [106:22] ==> private final lateinit var bankOfCordaNode: MockNetwork.MockNode defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'services' @ [106:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [106:47] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashPaymentFlow' @ [106:57] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'expected' @ [106:73] ==> val expected: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay zero cash`[LocalVariableDescriptor]

'payTo' @ [107:17] ==> val payTo: Party defined in net.corda.finance.flows.CashPaymentFlowTests.`pay zero cash`[LocalVariableDescriptor]

'resultFuture' @ [107:25] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [108:9] ==> private final val mockNet: MockNetwork defined in net.corda.finance.flows.CashPaymentFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [108:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [109:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'future' @ [110:13] ==> val future: CordaFuture<AbstractCashFlow.Result> defined in net.corda.finance.flows.CashPaymentFlowTests.`pay zero cash`[LocalVariableDescriptor]

'getOrThrow' @ [110:20] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

