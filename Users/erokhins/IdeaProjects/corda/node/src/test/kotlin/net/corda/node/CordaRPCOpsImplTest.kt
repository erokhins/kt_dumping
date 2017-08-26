'Before' @ [63:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [65:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'MockNetwork' @ [65:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [66:26] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'createNode' @ [66:34] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [66:66] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [66:78] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [66:96] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'aliceNode' @ [67:9] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'mockNet' @ [67:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'createNode' @ [67:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'networkMap' @ [67:60] ==> val networkMap: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest.setup[LocalVariableDescriptor]

'network' @ [67:71] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [67:79] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'notaryNode' @ [68:9] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'mockNet' @ [68:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'createNode' @ [68:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [68:62] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [68:74] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [68:94] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'networkMap' @ [68:121] ==> val networkMap: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest.setup[LocalVariableDescriptor]

'network' @ [68:132] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [68:140] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'rpc' @ [69:9] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'CordaRPCOpsImpl' @ [69:15] ==> public constructor CordaRPCOpsImpl(services: ServiceHubInternal, smm: StateMachineManager, database: CordaPersistence) defined in net.corda.node.internal.CordaRPCOpsImpl[DeserializedClassConstructorDescriptor]

'aliceNode' @ [69:31] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'services' @ [69:41] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'aliceNode' @ [69:51] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'smm' @ [69:61] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'aliceNode' @ [69:66] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'database' @ [69:76] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'CURRENT_RPC_CONTEXT' @ [70:9] ==> @field:JvmField internal val CURRENT_RPC_CONTEXT: ThreadLocal<RpcContext> defined in net.corda.node.services.messaging[DeserializedPropertyDescriptor]

'set' @ [70:29] ==> public open fun set(p0: (RpcContext..RpcContext?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'RpcContext' @ [70:33] ==> public constructor RpcContext(currentUser: User) defined in net.corda.node.services.messaging.RpcContext[DeserializedClassConstructorDescriptor]

'User' @ [70:44] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'setOf' @ [70:78] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'startFlowPermission' @ [71:17] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashIssueFlow

'startFlowPermission' @ [72:17] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashPaymentFlow

'aliceNode' @ [75:9] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'database' @ [75:19] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [75:28] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'stateMachineUpdates' @ [76:13] ==> public final lateinit var stateMachineUpdates: Observable<StateMachineUpdate> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'rpc' @ [76:35] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'stateMachinesFeed' @ [76:39] ==> @RPCReturnsObservables public abstract fun stateMachinesFeed(): DataFeed<List<StateMachineInfo>, StateMachineUpdate> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'updates' @ [76:59] ==> public final val updates: Observable<StateMachineUpdate> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'transactions' @ [77:13] ==> public final lateinit var transactions: Observable<SignedTransaction> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'rpc' @ [77:28] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'verifiedTransactionsFeed' @ [77:32] ==> @RPCReturnsObservables public abstract fun verifiedTransactionsFeed(): DataFeed<List<SignedTransaction>, SignedTransaction> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'updates' @ [77:59] ==> public final val updates: Observable<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'vaultTrackCash' @ [78:13] ==> public final lateinit var vaultTrackCash: Observable<Vault.Update<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'rpc' @ [78:30] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'vaultTrackBy' @ [78:34] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultTrackBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): DataFeed<Vault.Page<Cash.State>, Vault.Update<Cash.State>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'updates' @ [78:61] ==> public final val updates: Observable<Vault.Update<Cash.State>> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'After' @ [82:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [84:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'stopNodes' @ [84:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [87:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'OpaqueBytes' @ [90:19] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [90:31] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'aliceNode' @ [93:9] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'database' @ [93:19] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [93:28] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertFalse' @ [94:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceNode' @ [94:25] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'services' @ [94:35] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [94:44] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [94:62] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'totalStatesAvailable' @ [94:87] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'aliceNode' @ [98:25] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [98:35] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [98:40] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'rpc' @ [99:22] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'startFlow' @ [99:26] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party) -> CashIssueFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <reified R : FlowLogic<T>> -> CashIssueFlow

'Amount' @ [99:53] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [99:60] ==> val quantity: Long defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'GBP' @ [99:70] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'ref' @ [99:76] ==> val ref: OpaqueBytes defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'notaryNode' @ [99:81] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [99:92] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [99:97] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [100:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'runNetwork' @ [100:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'stateMachineUpdates' @ [103:9] ==> public final lateinit var stateMachineUpdates: Observable<StateMachineUpdate> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'expectEvents' @ [103:29] ==> public fun <E : Any> Observable<StateMachineUpdate>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<StateMachineUpdate>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> StateMachineUpdate

'sequence' @ [104:13] ==> public fun <E> sequence(vararg expectations: ExpectCompose<StateMachineUpdate>): ExpectCompose<StateMachineUpdate> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E> -> StateMachineUpdate

'expect' @ [106:21] ==> public inline fun <reified E : Any> expect(noinline match: (StateMachineUpdate.Added) -> Boolean = ..., noinline expectClosure: (StateMachineUpdate.Added) -> Unit): ExpectCompose<StateMachineUpdate.Added> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Added

'issueSmId' @ [107:25] ==> var issueSmId: StateMachineRunId? defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'add' @ [107:37] ==> value-parameter add: StateMachineUpdate.Added defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [107:41] ==> public open val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedPropertyDescriptor]

'expect' @ [109:21] ==> public inline fun <reified E : Any> expect(noinline match: (StateMachineUpdate.Removed) -> Boolean = ..., noinline expectClosure: (StateMachineUpdate.Removed) -> Unit): ExpectCompose<StateMachineUpdate.Removed> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Removed

'require' @ [110:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'remove' @ [110:33] ==> value-parameter remove: StateMachineUpdate.Removed defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [110:40] ==> public open val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate.Removed[DeserializedPropertyDescriptor]

'issueSmId' @ [110:46] ==> var issueSmId: StateMachineRunId? defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'result' @ [115:9] ==> val result: FlowHandle<AbstractCashFlow.Result> defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'returnValue' @ [115:16] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [115:28] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'Cash' @ [116:29] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'State' @ [116:34] ==> public constructor State(amount: Amount<Issued<Currency>>, owner: AbstractParty) defined in net.corda.finance.contracts.asset.Cash.State[DeserializedClassConstructorDescriptor]

'Amount' @ [116:40] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'quantity' @ [116:47] ==> val quantity: Long defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'Issued' @ [117:17] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'aliceNode' @ [117:24] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [117:34] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [117:39] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [117:53] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'ref' @ [117:57] ==> val ref: OpaqueBytes defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'GBP' @ [117:63] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'recipient' @ [118:17] ==> val recipient: Party defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'rpc' @ [121:20] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'vaultQueryBy' @ [121:24] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<Cash.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'assertEquals' @ [122:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Cash.State, actual: Cash.State, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> State

'expectedState' @ [122:22] ==> val expectedState: Cash.State defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'cash' @ [122:37] ==> val cash: Vault.Page<Cash.State> defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'states' @ [122:42] ==> public final val states: List<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'first' @ [122:49] ==> public fun <T> List<StateAndRef<Cash.State>>.first(): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'state' @ [122:57] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [122:63] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'vaultTrackCash' @ [124:9] ==> public final lateinit var vaultTrackCash: Observable<Vault.Update<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'expectEvents' @ [124:24] ==> public fun <E : Any> Observable<Vault.Update<Cash.State>>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<Vault.Update<Cash.State>>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> Update<State>

'expect' @ [125:13] ==> public inline fun <reified E : Any> expect(noinline match: (Vault.Update<Cash.State>) -> Boolean = ..., noinline expectClosure: (Vault.Update<Cash.State>) -> Unit): ExpectCompose<Vault.Update<Cash.State>> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Update<State>

'update' @ [126:30] ==> value-parameter update: Vault.Update<Cash.State> defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'produced' @ [126:37] ==> public final val produced: Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'single' @ [126:46] ==> public fun <T> Iterable<StateAndRef<Cash.State>>.single(): StateAndRef<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'state' @ [126:55] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [126:61] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [127:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Cash.State, actual: Cash.State, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> State

'expectedState' @ [127:30] ==> val expectedState: Cash.State defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`[LocalVariableDescriptor]

'actual' @ [127:45] ==> val actual: Cash.State defined in net.corda.node.CordaRPCOpsImplTest.`cash issue accepted`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Test' @ [132:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'rpc' @ [135:22] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'startFlow' @ [135:26] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party) -> CashIssueFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <reified R : FlowLogic<T>> -> CashIssueFlow

'DOLLARS' @ [136:21] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [137:17] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [137:29] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'notaryNode' @ [138:17] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [138:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [138:33] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [141:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'runNetwork' @ [141:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'rpc' @ [143:9] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'startFlow' @ [143:13] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, Party, Boolean) -> CashPaymentFlow, arg0: Amount<Currency>, arg1: Party, arg2: Boolean): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> Party
    <C> -> Boolean
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'DOLLARS' @ [143:46] ==> public val Int.DOLLARS: Amount<Currency> defined in net.corda.finance[DeserializedPropertyDescriptor]

'aliceNode' @ [143:55] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [143:65] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [143:70] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'anonymous' @ [143:85] ==> val anonymous: Boolean defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`[LocalVariableDescriptor]

'mockNet' @ [145:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'runNetwork' @ [145:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'stateMachineUpdates' @ [149:9] ==> public final lateinit var stateMachineUpdates: Observable<StateMachineUpdate> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'expectEvents' @ [149:29] ==> public fun <E : Any> Observable<StateMachineUpdate>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<StateMachineUpdate>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> StateMachineUpdate

'sequence' @ [150:13] ==> public fun <E> sequence(vararg expectations: ExpectCompose<StateMachineUpdate>): ExpectCompose<StateMachineUpdate> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E> -> StateMachineUpdate

'expect' @ [152:21] ==> public inline fun <reified E : Any> expect(noinline match: (StateMachineUpdate.Added) -> Boolean = ..., noinline expectClosure: (StateMachineUpdate.Added) -> Unit): ExpectCompose<StateMachineUpdate.Added> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Added

'issueSmId' @ [153:25] ==> var issueSmId: StateMachineRunId? defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`[LocalVariableDescriptor]

'add' @ [153:37] ==> value-parameter add: StateMachineUpdate.Added defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [153:41] ==> public open val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedPropertyDescriptor]

'expect' @ [155:21] ==> public inline fun <reified E : Any> expect(noinline match: (StateMachineUpdate.Removed) -> Boolean = ..., noinline expectClosure: (StateMachineUpdate.Removed) -> Unit): ExpectCompose<StateMachineUpdate.Removed> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Removed

'require' @ [156:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'remove' @ [156:33] ==> value-parameter remove: StateMachineUpdate.Removed defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [156:40] ==> public open val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate.Removed[DeserializedPropertyDescriptor]

'issueSmId' @ [156:46] ==> var issueSmId: StateMachineRunId? defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`[LocalVariableDescriptor]

'expect' @ [159:21] ==> public inline fun <reified E : Any> expect(noinline match: (StateMachineUpdate.Added) -> Boolean = ..., noinline expectClosure: (StateMachineUpdate.Added) -> Unit): ExpectCompose<StateMachineUpdate.Added> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Added

'moveSmId' @ [160:25] ==> var moveSmId: StateMachineRunId? defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`[LocalVariableDescriptor]

'add' @ [160:36] ==> value-parameter add: StateMachineUpdate.Added defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [160:40] ==> public open val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedPropertyDescriptor]

'expect' @ [162:21] ==> public inline fun <reified E : Any> expect(noinline match: (StateMachineUpdate.Removed) -> Boolean = ..., noinline expectClosure: (StateMachineUpdate.Removed) -> Unit): ExpectCompose<StateMachineUpdate.Removed> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Removed

'require' @ [163:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'remove' @ [163:33] ==> value-parameter remove: StateMachineUpdate.Removed defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [163:40] ==> public open val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineUpdate.Removed[DeserializedPropertyDescriptor]

'moveSmId' @ [163:46] ==> var moveSmId: StateMachineRunId? defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`[LocalVariableDescriptor]

'result' @ [168:9] ==> val result: FlowHandle<AbstractCashFlow.Result> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`[LocalVariableDescriptor]

'returnValue' @ [168:16] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [168:28] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'transactions' @ [169:9] ==> public final lateinit var transactions: Observable<SignedTransaction> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'expectEvents' @ [169:22] ==> public fun <E : Any> Observable<SignedTransaction>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<SignedTransaction>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> SignedTransaction

'sequence' @ [170:13] ==> public fun <E> sequence(vararg expectations: ExpectCompose<SignedTransaction>): ExpectCompose<SignedTransaction> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E> -> SignedTransaction

'expect' @ [172:21] ==> public inline fun <reified E : Any> expect(noinline match: (SignedTransaction) -> Boolean = ..., noinline expectClosure: (SignedTransaction) -> Unit): ExpectCompose<SignedTransaction> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SignedTransaction

'require' @ [173:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'stx' @ [173:33] ==> value-parameter stx: SignedTransaction defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [173:37] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [173:40] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [173:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'require' @ [174:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'stx' @ [174:33] ==> value-parameter stx: SignedTransaction defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [174:37] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [174:40] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [174:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'stx' @ [175:48] ==> value-parameter stx: SignedTransaction defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sigs' @ [175:52] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'map' @ [175:57] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [175:63] ==> value-parameter it: TransactionSignature defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [175:66] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'toSet' @ [175:71] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'aliceNode' @ [177:40] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [177:50] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [177:55] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [177:69] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'require' @ [178:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'signaturePubKeys' @ [178:33] ==> val signaturePubKeys: Set<PublicKey> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [178:50] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'aliceKey' @ [178:58] ==> val aliceKey: PublicKey defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'keys' @ [178:67] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'size' @ [178:72] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'require' @ [179:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'aliceKey' @ [179:33] ==> val aliceKey: PublicKey defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isFulfilledBy' @ [179:42] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signaturePubKeys' @ [179:56] ==> val signaturePubKeys: Set<PublicKey> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'expect' @ [182:21] ==> public inline fun <reified E : Any> expect(noinline match: (SignedTransaction) -> Boolean = ..., noinline expectClosure: (SignedTransaction) -> Unit): ExpectCompose<SignedTransaction> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> SignedTransaction

'require' @ [183:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'stx' @ [183:33] ==> value-parameter stx: SignedTransaction defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [183:37] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [183:40] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [183:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'require' @ [184:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'stx' @ [184:33] ==> value-parameter stx: SignedTransaction defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [184:37] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [184:40] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [184:48] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'stx' @ [185:48] ==> value-parameter stx: SignedTransaction defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sigs' @ [185:52] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'map' @ [185:57] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [185:63] ==> value-parameter it: TransactionSignature defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [185:66] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'toSet' @ [185:71] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'require' @ [187:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'aliceNode' @ [187:33] ==> public final lateinit var aliceNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [187:43] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [187:48] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [187:62] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'isFulfilledBy' @ [187:72] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signaturePubKeys' @ [187:86] ==> val signaturePubKeys: Set<PublicKey> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'require' @ [188:25] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [188:33] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [188:44] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [188:49] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [188:64] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'isFulfilledBy' @ [188:74] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signaturePubKeys' @ [188:88] ==> val signaturePubKeys: Set<PublicKey> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'vaultTrackCash' @ [193:9] ==> public final lateinit var vaultTrackCash: Observable<Vault.Update<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'expectEvents' @ [193:24] ==> public fun <E : Any> Observable<Vault.Update<Cash.State>>.expectEvents(isStrict: Boolean = ..., expectCompose: () -> ExpectCompose<Vault.Update<Cash.State>>): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : Any> -> Update<State>

'sequence' @ [194:13] ==> public fun <E> sequence(vararg expectations: ExpectCompose<Vault.Update<Cash.State>>): ExpectCompose<Vault.Update<Cash.State>> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E> -> Update<State>

'expect' @ [196:21] ==> public inline fun <reified E : Any> expect(noinline match: (Vault.Update<Cash.State>) -> Boolean = ..., noinline expectClosure: (Vault.Update<Cash.State>) -> Unit): ExpectCompose<Vault.Update<Cash.State>> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Update<State>

'component1' @ [196:31] ==> public final operator fun component1(): Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'component2' @ [196:41] ==> public final operator fun component2(): Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'require' @ [197:25] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'consumed' @ [197:33] ==> val consumed: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [197:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'consumed' @ [197:55] ==> val consumed: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [197:64] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'require' @ [198:25] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'produced' @ [198:33] ==> val produced: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [198:42] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'produced' @ [198:55] ==> val produced: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [198:64] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'expect' @ [201:21] ==> public inline fun <reified E : Any> expect(noinline match: (Vault.Update<Cash.State>) -> Boolean = ..., noinline expectClosure: (Vault.Update<Cash.State>) -> Unit): ExpectCompose<Vault.Update<Cash.State>> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified E : Any> -> Update<State>

'component1' @ [201:31] ==> public final operator fun component1(): Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'component2' @ [201:41] ==> public final operator fun component2(): Set<StateAndRef<Cash.State>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'require' @ [202:25] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'consumed' @ [202:33] ==> val consumed: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [202:42] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'consumed' @ [202:55] ==> val consumed: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [202:64] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'require' @ [203:25] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'produced' @ [203:33] ==> val produced: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [203:42] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'produced' @ [203:55] ==> val produced: Set<StateAndRef<Cash.State>> defined in net.corda.node.CordaRPCOpsImplTest.`issue and move`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'size' @ [203:64] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'Test' @ [209:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CURRENT_RPC_CONTEXT' @ [211:9] ==> @field:JvmField internal val CURRENT_RPC_CONTEXT: ThreadLocal<RpcContext> defined in net.corda.node.services.messaging[DeserializedPropertyDescriptor]

'set' @ [211:29] ==> public open fun set(p0: (RpcContext..RpcContext?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'RpcContext' @ [211:33] ==> public constructor RpcContext(currentUser: User) defined in net.corda.node.services.messaging.RpcContext[DeserializedClassConstructorDescriptor]

'User' @ [211:44] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'emptySet' @ [211:78] ==> public fun <T> emptySet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertThatExceptionOfType' @ [212:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (PermissionException..PermissionException?)>..Class<out (PermissionException..PermissionException?)>?)): (ThrowableTypeAssert<(PermissionException..PermissionException?)>..ThrowableTypeAssert<(PermissionException..PermissionException?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> PermissionException

'PermissionException' @ [212:35] ==> public constructor PermissionException(msg: String) defined in net.corda.nodeapi.PermissionException[DeserializedClassConstructorDescriptor]

'java' @ [212:62] ==> public val <T> KClass<PermissionException>.java: Class<PermissionException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PermissionException

'isThrownBy' @ [212:68] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(PermissionException..PermissionException?)>..ThrowableAssertAlternative<(PermissionException..PermissionException?)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'rpc' @ [213:13] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'startFlow' @ [213:17] ==> public inline fun <T : Any, A, B, C, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party) -> CashIssueFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <reified R : FlowLogic<T>> -> CashIssueFlow

'Amount' @ [213:44] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'USD' @ [213:56] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [213:62] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [213:74] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'notaryNode' @ [213:96] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'info' @ [213:107] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [213:112] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'Test' @ [217:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'currentThread' @ [219:31] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [219:47] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'getResourceAsStream' @ [219:66] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'testJar' @ [219:86] ==> public final val testJar: String defined in net.corda.node.CordaRPCOpsImplTest.Companion[PropertyDescriptorImpl]

'rpc' @ [220:26] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'uploadAttachment' @ [220:30] ==> public abstract fun uploadAttachment(jar: InputStream): SecureHash defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'inputJar' @ [220:47] ==> val inputJar: (InputStream..InputStream?) defined in net.corda.node.CordaRPCOpsImplTest.`can upload an attachment`[LocalVariableDescriptor]

'assertTrue' @ [221:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'rpc' @ [221:20] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'attachmentExists' @ [221:24] ==> public abstract fun attachmentExists(id: SecureHash): Boolean defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'secureHash' @ [221:41] ==> val secureHash: SecureHash defined in net.corda.node.CordaRPCOpsImplTest.`can upload an attachment`[LocalVariableDescriptor]

'Test' @ [224:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'currentThread' @ [226:31] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [226:47] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'getResourceAsStream' @ [226:66] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'testJar' @ [226:86] ==> public final val testJar: String defined in net.corda.node.CordaRPCOpsImplTest.Companion[PropertyDescriptorImpl]

'rpc' @ [227:26] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'uploadAttachment' @ [227:30] ==> public abstract fun uploadAttachment(jar: InputStream): SecureHash defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'inputJar' @ [227:47] ==> val inputJar: (InputStream..InputStream?) defined in net.corda.node.CordaRPCOpsImplTest.`can download an uploaded attachment`[LocalVariableDescriptor]

'ByteArrayOutputStream' @ [228:26] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'ByteArrayOutputStream' @ [229:25] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'copy' @ [231:17] ==> public open fun copy(p0: (InputStream..InputStream?), p1: (OutputStream..OutputStream?)): Int defined in org.apache.commons.io.IOUtils[JavaMethodDescriptor]

'currentThread' @ [231:29] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [231:45] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'getResourceAsStream' @ [231:64] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'testJar' @ [231:84] ==> public final val testJar: String defined in net.corda.node.CordaRPCOpsImplTest.Companion[PropertyDescriptorImpl]

'bufferFile' @ [231:94] ==> val bufferFile: ByteArrayOutputStream defined in net.corda.node.CordaRPCOpsImplTest.`can download an uploaded attachment`[LocalVariableDescriptor]

'copy' @ [232:17] ==> public open fun copy(p0: (InputStream..InputStream?), p1: (OutputStream..OutputStream?)): Int defined in org.apache.commons.io.IOUtils[JavaMethodDescriptor]

'rpc' @ [232:22] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'openAttachment' @ [232:26] ==> public abstract fun openAttachment(id: SecureHash): InputStream defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'secureHash' @ [232:41] ==> val secureHash: SecureHash defined in net.corda.node.CordaRPCOpsImplTest.`can download an uploaded attachment`[LocalVariableDescriptor]

'bufferRpc' @ [232:54] ==> val bufferRpc: ByteArrayOutputStream defined in net.corda.node.CordaRPCOpsImplTest.`can download an uploaded attachment`[LocalVariableDescriptor]

'assertArrayEquals' @ [234:9] ==> public open fun assertArrayEquals(p0: (ByteArray..ByteArray?), p1: (ByteArray..ByteArray?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'bufferFile' @ [234:27] ==> val bufferFile: ByteArrayOutputStream defined in net.corda.node.CordaRPCOpsImplTest.`can download an uploaded attachment`[LocalVariableDescriptor]

'toByteArray' @ [234:38] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'bufferRpc' @ [234:53] ==> val bufferRpc: ByteArrayOutputStream defined in net.corda.node.CordaRPCOpsImplTest.`can download an uploaded attachment`[LocalVariableDescriptor]

'toByteArray' @ [234:63] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'Test' @ [237:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CURRENT_RPC_CONTEXT' @ [239:9] ==> @field:JvmField internal val CURRENT_RPC_CONTEXT: ThreadLocal<RpcContext> defined in net.corda.node.services.messaging[DeserializedPropertyDescriptor]

'set' @ [239:29] ==> public open fun set(p0: (RpcContext..RpcContext?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'RpcContext' @ [239:33] ==> public constructor RpcContext(currentUser: User) defined in net.corda.node.services.messaging.RpcContext[DeserializedClassConstructorDescriptor]

'User' @ [239:44] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'setOf' @ [239:78] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'startFlowPermission' @ [240:17] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> NonRPCFlow

'assertThatExceptionOfType' @ [242:9] ==> @CheckReturnValue public open fun <T : (Throwable..Throwable?)> assertThatExceptionOfType(p0: (Class<out (IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>..Class<out (IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>?)): (ThrowableTypeAssert<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>..ThrowableTypeAssert<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Throwable..Throwable?)> -> IllegalArgumentException

'IllegalArgumentException' @ [242:35] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'java' @ [242:67] ==> public val <T> KClass<IllegalArgumentException /* = IllegalArgumentException */>.java: Class<IllegalArgumentException /* = IllegalArgumentException */> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IllegalArgumentException

'isThrownBy' @ [242:73] ==> public final fun isThrownBy(p0: (() -> Unit..(() -> Unit)?)): (ThrowableAssertAlternative<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>..ThrowableAssertAlternative<(IllegalArgumentException /* = IllegalArgumentException */..IllegalArgumentException? /* = IllegalArgumentException? */)>?) defined in org.assertj.core.api.ThrowableTypeAssert[MyFunctionDescriptor]

'rpc' @ [243:13] ==> public final lateinit var rpc: CordaRPCOps defined in net.corda.node.CordaRPCOpsImplTest[PropertyDescriptorImpl]

'startFlow' @ [243:17] ==> public inline fun <T : Any, reified R : FlowLogic<Unit>> CordaRPCOps.startFlow(flowConstructor: () -> CordaRPCOpsImplTest.NonRPCFlow): FlowHandle<Unit> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Unit
    <reified R : FlowLogic<T>> -> NonRPCFlow

'FlowLogic<Unit>' @ [247:24] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [248:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Unit' @ [249:31] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

