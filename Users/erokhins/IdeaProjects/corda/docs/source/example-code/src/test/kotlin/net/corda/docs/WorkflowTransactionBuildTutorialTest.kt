'vaultQueryService' @ [30:27] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [30:45] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<T> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> T

'LinearStateQueryCriteria' @ [30:70] ==> @JvmOverloads public constructor LinearStateQueryCriteria(participants: List<AbstractParty>? = ..., uuid: List<UUID>? = ..., externalId: List<String>? = ..., status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedClassConstructorDescriptor]

'listOf' @ [30:102] ==> public fun <T> listOf(element: UUID): List<UUID> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID

'ref' @ [30:109] ==> value-parameter ref: UniqueIdentifier defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.latest[ValueParameterDescriptorImpl]

'id' @ [30:113] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'linearHeads' @ [31:16] ==> val linearHeads: Vault.Page<T> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.latest[LocalVariableDescriptor]

'states' @ [31:28] ==> public final val states: List<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [31:35] ==> public fun <T> List<StateAndRef<T>>.single(): StateAndRef<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'Before' @ [34:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [36:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'MockNetwork' @ [36:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'ServiceInfo' @ [37:29] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [37:41] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [37:65] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'notaryNode' @ [38:9] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'mockNet' @ [38:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'createNode' @ [38:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [39:29] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [39:42] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mapOf' @ [40:36] ==> public fun <K, V> mapOf(pair: Pair<ServiceInfo, KeyPair>): Map<ServiceInfo, KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ServiceInfo
    <V> -> KeyPair

'Pair' @ [40:42] ==> public constructor Pair<out A, out B>(first: ServiceInfo, second: KeyPair) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ServiceInfo
    <out B> -> KeyPair

'notaryService' @ [40:47] ==> val notaryService: ServiceInfo defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.setup[LocalVariableDescriptor]

'DUMMY_NOTARY_KEY' @ [40:62] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'arrayOf' @ [41:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [41:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [41:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [41:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'notaryService' @ [41:84] ==> val notaryService: ServiceInfo defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.setup[LocalVariableDescriptor]

'nodeA' @ [42:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'mockNet' @ [42:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'createPartyNode' @ [42:25] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [42:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'network' @ [42:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [42:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeB' @ [43:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'mockNet' @ [43:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'createPartyNode' @ [43:25] ==> public final fun createPartyNode(networkMapAddress: SingleMessageRecipient, legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [43:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'network' @ [43:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [43:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeA' @ [44:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'registerInitiatedFlow' @ [44:15] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<RecordCompletionFlow>): Observable<RecordCompletionFlow> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> RecordCompletionFlow

'RecordCompletionFlow' @ [44:37] ==> public constructor RecordCompletionFlow(source: Party) defined in net.corda.docs.RecordCompletionFlow[DeserializedClassConstructorDescriptor]

'java' @ [44:65] ==> public val <T> KClass<RecordCompletionFlow>.java: Class<RecordCompletionFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RecordCompletionFlow

'After' @ [47:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [49:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'stopNodes' @ [49:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'nodeB' @ [55:32] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [55:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultService' @ [55:47] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'updates' @ [55:60] ==> public abstract val updates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'toFuture' @ [55:68] ==> public fun <T> Observable<Vault.Update<ContractState>>.toFuture(): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'nodeA' @ [57:21] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [57:27] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [57:36] ==> public open fun <T> startFlow(logic: FlowLogic<StateAndRef<TradeApprovalContract.State>>): FlowStateMachine<StateAndRef<TradeApprovalContract.State>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'SubmitTradeApprovalFlow' @ [57:46] ==> public constructor SubmitTradeApprovalFlow(tradeId: String, counterparty: Party) defined in net.corda.docs.SubmitTradeApprovalFlow[DeserializedClassConstructorDescriptor]

'nodeB' @ [57:78] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [57:84] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [57:89] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'flow1' @ [59:27] ==> val flow1: FlowStateMachine<StateAndRef<TradeApprovalContract.State>> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'resultFuture' @ [59:33] ==> public abstract val resultFuture: CordaFuture<StateAndRef<TradeApprovalContract.State>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [59:46] ==> public fun <V> Future<StateAndRef<TradeApprovalContract.State>>.getOrThrow(timeout: Duration? = ...): StateAndRef<TradeApprovalContract.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> StateAndRef<State>

'proposalRef' @ [60:32] ==> val proposalRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [60:44] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [60:50] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'linearId' @ [60:55] ==> public open val linearId: UniqueIdentifier defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'nodeBVaultUpdate' @ [62:9] ==> val nodeBVaultUpdate: CordaFuture<Vault.Update<ContractState>> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'get' @ [62:26] ==> public abstract fun get(): (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'nodeA' @ [64:27] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [64:33] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [64:42] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<TradeApprovalContract.State>): StateAndRef<TradeApprovalContract.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'nodeA' @ [65:13] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [65:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'latest' @ [65:28] ==> private final inline fun <reified T : LinearState> ServiceHub.latest(ref: UniqueIdentifier): StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : LinearState> -> State

'proposalLinearId' @ [65:64] ==> val proposalLinearId: UniqueIdentifier defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'nodeB' @ [67:27] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [67:33] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [67:42] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<TradeApprovalContract.State>): StateAndRef<TradeApprovalContract.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'nodeB' @ [68:13] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [68:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'latest' @ [68:28] ==> private final inline fun <reified T : LinearState> ServiceHub.latest(ref: UniqueIdentifier): StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : LinearState> -> State

'proposalLinearId' @ [68:64] ==> val proposalLinearId: UniqueIdentifier defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'assertEquals' @ [71:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: WorkflowState, actual: WorkflowState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> WorkflowState

'NEW' @ [71:36] ==> enum entry NEW defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'proposalRef' @ [71:41] ==> val proposalRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [71:53] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [71:59] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [71:64] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [72:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'proposalRef' @ [72:30] ==> val proposalRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [72:42] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [72:48] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'tradeId' @ [72:53] ==> public final val tradeId: String defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [73:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party, actual: Party, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party

'nodeA' @ [73:22] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [73:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [73:33] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'proposalRef' @ [73:48] ==> val proposalRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [73:60] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [73:66] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'source' @ [73:71] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [74:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party, actual: Party, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party

'nodeB' @ [74:22] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [74:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [74:33] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'proposalRef' @ [74:48] ==> val proposalRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [74:60] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [74:66] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'counterparty' @ [74:71] ==> public final val counterparty: Party defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [75:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<TradeApprovalContract.State>, actual: StateAndRef<TradeApprovalContract.State>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<State>

'proposalRef' @ [75:22] ==> val proposalRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'latestFromA' @ [75:35] ==> val latestFromA: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'assertEquals' @ [76:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<TradeApprovalContract.State>, actual: StateAndRef<TradeApprovalContract.State>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<State>

'proposalRef' @ [76:22] ==> val proposalRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'latestFromB' @ [76:35] ==> val latestFromB: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'nodeA' @ [78:32] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [78:38] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultService' @ [78:47] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'updates' @ [78:60] ==> public abstract val updates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'toFuture' @ [78:68] ==> public fun <T> Observable<Vault.Update<ContractState>>.toFuture(): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'nodeB' @ [79:38] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [79:44] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultService' @ [79:53] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'updates' @ [79:66] ==> public abstract val updates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'toFuture' @ [79:74] ==> public fun <T> Observable<Vault.Update<ContractState>>.toFuture(): CordaFuture<Vault.Update<ContractState>> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update<ContractState>

'nodeB' @ [81:21] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [81:27] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [81:36] ==> public open fun <T> startFlow(logic: FlowLogic<StateAndRef<TradeApprovalContract.State>>): FlowStateMachine<StateAndRef<TradeApprovalContract.State>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'SubmitCompletionFlow' @ [81:46] ==> public constructor SubmitCompletionFlow(ref: StateRef, verdict: WorkflowState) defined in net.corda.docs.SubmitCompletionFlow[DeserializedClassConstructorDescriptor]

'latestFromB' @ [81:67] ==> val latestFromB: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'ref' @ [81:79] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'APPROVED' @ [81:98] ==> enum entry APPROVED defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'flow2' @ [83:28] ==> val flow2: FlowStateMachine<StateAndRef<TradeApprovalContract.State>> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'resultFuture' @ [83:34] ==> public abstract val resultFuture: CordaFuture<StateAndRef<TradeApprovalContract.State>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [83:47] ==> public fun <V> Future<StateAndRef<TradeApprovalContract.State>>.getOrThrow(timeout: Duration? = ...): StateAndRef<TradeApprovalContract.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> StateAndRef<State>

'nodeAVaultUpdate' @ [85:9] ==> val nodeAVaultUpdate: CordaFuture<Vault.Update<ContractState>> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'get' @ [85:26] ==> public abstract fun get(): (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'secondNodeBVaultUpdate' @ [86:9] ==> val secondNodeBVaultUpdate: CordaFuture<Vault.Update<ContractState>> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'get' @ [86:32] ==> public abstract fun get(): (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'nodeA' @ [88:26] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [88:32] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [88:41] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<TradeApprovalContract.State>): StateAndRef<TradeApprovalContract.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'nodeA' @ [89:13] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [89:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'latest' @ [89:28] ==> private final inline fun <reified T : LinearState> ServiceHub.latest(ref: UniqueIdentifier): StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : LinearState> -> State

'proposalLinearId' @ [89:64] ==> val proposalLinearId: UniqueIdentifier defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'nodeB' @ [91:26] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'database' @ [91:32] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [91:41] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<TradeApprovalContract.State>): StateAndRef<TradeApprovalContract.State> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'nodeB' @ [92:13] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'services' @ [92:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'latest' @ [92:28] ==> private final inline fun <reified T : LinearState> ServiceHub.latest(ref: UniqueIdentifier): StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : LinearState> -> State

'proposalLinearId' @ [92:64] ==> val proposalLinearId: UniqueIdentifier defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'assertEquals' @ [95:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: WorkflowState, actual: WorkflowState, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> WorkflowState

'APPROVED' @ [95:36] ==> enum entry APPROVED defined in net.corda.docs.WorkflowState[FakeCallableDescriptorForObject]

'completedRef' @ [95:46] ==> val completedRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [95:59] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [95:65] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [95:70] ==> public final val state: WorkflowState defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [96:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'completedRef' @ [96:30] ==> val completedRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [96:43] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [96:49] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'tradeId' @ [96:54] ==> public final val tradeId: String defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [97:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party, actual: Party, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party

'nodeA' @ [97:22] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [97:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [97:33] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'completedRef' @ [97:48] ==> val completedRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [97:61] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [97:67] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'source' @ [97:72] ==> public final val source: Party defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [98:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party, actual: Party, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party

'nodeB' @ [98:22] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.docs.WorkflowTransactionBuildTutorialTest[PropertyDescriptorImpl]

'info' @ [98:28] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [98:33] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'completedRef' @ [98:48] ==> val completedRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'state' @ [98:61] ==> public final val state: TransactionState<TradeApprovalContract.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [98:67] ==> public final val data: TradeApprovalContract.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'counterparty' @ [98:72] ==> public final val counterparty: Party defined in net.corda.docs.TradeApprovalContract.State[DeserializedPropertyDescriptor]

'assertEquals' @ [99:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<TradeApprovalContract.State>, actual: StateAndRef<TradeApprovalContract.State>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<State>

'completedRef' @ [99:22] ==> val completedRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'finalFromA' @ [99:36] ==> val finalFromA: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'assertEquals' @ [100:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<TradeApprovalContract.State>, actual: StateAndRef<TradeApprovalContract.State>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<State>

'completedRef' @ [100:22] ==> val completedRef: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

'finalFromB' @ [100:36] ==> val finalFromB: StateAndRef<TradeApprovalContract.State> defined in net.corda.docs.WorkflowTransactionBuildTutorialTest.`Run workflow to completion`[LocalVariableDescriptor]

