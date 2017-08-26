'Sort' @ [38:23] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[DeserializedClassConstructorDescriptor]

'listOf' @ [38:28] ==> public fun <T> listOf(element: Sort.SortColumn): List<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'SortColumn' @ [38:40] ==> public constructor SortColumn(sortAttribute: SortAttribute, direction: Sort.Direction = ...) defined in net.corda.core.node.services.vault.Sort.SortColumn[DeserializedClassConstructorDescriptor]

'Standard' @ [38:65] ==> public constructor Standard(attribute: Sort.Attribute) defined in net.corda.core.node.services.vault.SortAttribute.Standard[DeserializedClassConstructorDescriptor]

'STATE_REF_TXN_ID' @ [38:100] ==> enum entry STATE_REF_TXN_ID defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[FakeCallableDescriptorForObject]

'DESC' @ [38:134] ==> enum entry DESC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'UniqueIdentifier' @ [49:73] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[DeserializedClassConstructorDescriptor]

'DummyContract' @ [50:65] ==> public constructor DummyContract(blank: Any? = ...) defined in net.corda.testing.contracts.DummyContract[DeserializedClassConstructorDescriptor]

'if (!processed) {
                val logicRef = flowLogicRefFactory.create(ScheduledFlow::class.java, thisStateRef)
                return ScheduledActivity(logicRef, creationTime)
            } else {
                return null
            }' @ [52:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [52:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processed' @ [52:18] ==> public final val processed: Boolean defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'flowLogicRefFactory' @ [53:32] ==> value-parameter flowLogicRefFactory: FlowLogicRefFactory defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState.nextScheduledActivity[ValueParameterDescriptorImpl]

'create' @ [53:52] ==> public abstract fun create(flowClass: Class<out FlowLogic<*>>, vararg args: Any?): FlowLogicRef defined in net.corda.core.flows.FlowLogicRefFactory[DeserializedSimpleFunctionDescriptor]

'ScheduledFlow' @ [53:59] ==> public constructor ScheduledFlow(stateRef: StateRef) defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow[ClassConstructorDescriptorImpl]

'java' @ [53:80] ==> public val <T> KClass<ScheduledFlowTests.ScheduledFlow>.java: Class<ScheduledFlowTests.ScheduledFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScheduledFlow

'thisStateRef' @ [53:86] ==> value-parameter thisStateRef: StateRef defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState.nextScheduledActivity[ValueParameterDescriptorImpl]

'ScheduledActivity' @ [54:24] ==> public constructor ScheduledActivity(logicRef: FlowLogicRef, scheduledAt: Instant) defined in net.corda.core.contracts.ScheduledActivity[DeserializedClassConstructorDescriptor]

'logicRef' @ [54:42] ==> val logicRef: FlowLogicRef defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState.nextScheduledActivity[LocalVariableDescriptor]

'creationTime' @ [54:52] ==> public final val creationTime: Instant defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'listOf' @ [60:58] ==> public fun <T> listOf(vararg elements: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'source' @ [60:65] ==> public final val source: Party defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'destination' @ [60:73] ==> public final val destination: Party defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'participants' @ [63:20] ==> public open val participants: List<AbstractParty> defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'any' @ [63:33] ==> public inline fun <T> Iterable<AbstractParty>.any(predicate: (AbstractParty) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [63:39] ==> value-parameter it: AbstractParty defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [63:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'containsAny' @ [63:52] ==> public fun PublicKey.containsAny(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [63:64] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState.isRelevant[ValueParameterDescriptorImpl]

'FlowLogic<Unit>' @ [67:60] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [68:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'ScheduledState' @ [70:34] ==> public constructor ScheduledState(creationTime: Instant, source: Party, destination: Party, processed: Boolean = ..., linearId: UniqueIdentifier = ..., contract: Contract = ...) defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[ClassConstructorDescriptorImpl]

'serviceHub' @ [70:49] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[DeserializedPropertyDescriptor]

'clock' @ [70:60] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [70:66] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'serviceHub' @ [71:21] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[DeserializedPropertyDescriptor]

'myInfo' @ [71:32] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [71:39] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'destination' @ [71:54] ==> public final val destination: Party defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[PropertyDescriptorImpl]

'serviceHub' @ [73:26] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [73:37] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getAnyNotary' @ [73:53] ==> public open fun getAnyNotary(type: ServiceType? = ...): Party? defined in net.corda.core.node.services.NetworkMapCache[DeserializedSimpleFunctionDescriptor]

'TransactionBuilder' @ [74:27] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [74:46] ==> val notary: Party? defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow.call[LocalVariableDescriptor]

'addOutputState' @ [75:22] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'scheduledState' @ [75:37] ==> val scheduledState: ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow.call[LocalVariableDescriptor]

'addCommand' @ [76:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [76:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [76:46] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [76:57] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'serviceHub' @ [77:22] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [77:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [77:56] ==> val builder: TransactionBuilder defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow.call[LocalVariableDescriptor]

'subFlow' @ [78:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [78:21] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'tx' @ [78:34] ==> val tx: SignedTransaction defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow.call[LocalVariableDescriptor]

'setOf' @ [78:38] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'serviceHub' @ [78:44] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[DeserializedPropertyDescriptor]

'myInfo' @ [78:55] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [78:62] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'SchedulableFlow' @ [82:5] ==> public constructor SchedulableFlow() defined in net.corda.core.flows.SchedulableFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [83:51] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [84:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [86:25] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow[DeserializedPropertyDescriptor]

'toStateAndRef' @ [86:36] ==> public open fun <T : ContractState> toStateAndRef(stateRef: StateRef): StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ScheduledState

'stateRef' @ [86:66] ==> public final val stateRef: StateRef defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow[PropertyDescriptorImpl]

'state' @ [87:34] ==> val state: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'state' @ [87:40] ==> public final val state: TransactionState<ScheduledFlowTests.ScheduledState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [87:46] ==> public final val data: ScheduledFlowTests.ScheduledState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'scheduledState' @ [89:17] ==> val scheduledState: ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'source' @ [89:32] ==> public final val source: Party defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'serviceHub' @ [89:42] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow[DeserializedPropertyDescriptor]

'myInfo' @ [89:53] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [89:60] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'require' @ [92:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [92:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'scheduledState' @ [92:22] ==> val scheduledState: ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'processed' @ [92:37] ==> public final val processed: Boolean defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'state' @ [93:26] ==> val state: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'state' @ [93:32] ==> public final val state: TransactionState<ScheduledFlowTests.ScheduledState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [93:38] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'scheduledState' @ [94:34] ==> val scheduledState: ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'copy' @ [94:49] ==> public final fun copy(creationTime: Instant = ..., source: Party = ..., destination: Party = ..., processed: Boolean = ..., linearId: UniqueIdentifier = ..., contract: Contract = ...): ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[SimpleFunctionDescriptorImpl]

'TransactionBuilder' @ [95:27] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [95:46] ==> val notary: Party defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'addInputState' @ [96:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [96:36] ==> val state: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'addOutputState' @ [97:22] ==> public final fun addOutputState(state: ContractState): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'newStateOutput' @ [97:37] ==> val newStateOutput: ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'addCommand' @ [98:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [98:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [98:46] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [98:57] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'serviceHub' @ [99:22] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [99:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [99:56] ==> val builder: TransactionBuilder defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'subFlow' @ [100:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [100:21] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'tx' @ [100:34] ==> val tx: SignedTransaction defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'setOf' @ [100:38] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'scheduledState' @ [100:44] ==> val scheduledState: ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'source' @ [100:59] ==> public final val source: Party defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'scheduledState' @ [100:67] ==> val scheduledState: ScheduledFlowTests.ScheduledState defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledFlow.call[LocalVariableDescriptor]

'destination' @ [100:82] ==> public final val destination: Party defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'Before' @ [104:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [106:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'MockNetwork' @ [106:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'notaryNode' @ [107:9] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'mockNet' @ [107:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'createNode' @ [107:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [108:29] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [108:42] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'arrayOf' @ [109:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [109:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [109:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [109:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'ServiceInfo' @ [109:84] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [109:96] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [109:120] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'nodeA' @ [110:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'mockNet' @ [110:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'createNode' @ [110:25] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [110:36] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'network' @ [110:47] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [110:55] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'nodeB' @ [111:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'mockNet' @ [111:17] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'createNode' @ [111:25] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [111:36] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'network' @ [111:47] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [111:55] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [112:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'startNodes' @ [112:17] ==> public final fun startNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [115:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [117:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [117:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [120:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'nodeA' @ [123:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'smm' @ [123:15] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'track' @ [123:19] ==> public final fun track(): DataFeed<List<FlowStateMachineImpl<*>>, StateMachineManager.Change> defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedSimpleFunctionDescriptor]

'updates' @ [123:27] ==> public final val updates: Observable<StateMachineManager.Change> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'subscribe' @ [123:35] ==> public final fun subscribe(p0: (((StateMachineManager.Change..StateMachineManager.Change?)) -> Unit..(((StateMachineManager.Change..StateMachineManager.Change?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [124:17] ==> value-parameter it: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [125:33] ==> value-parameter it: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [125:36] ==> public abstract val logic: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change[DeserializedPropertyDescriptor]

'stateMachine' @ [125:42] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'flowInitiator' @ [125:55] ==> public abstract val flowInitiator: FlowInitiator defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'initiator' @ [126:21] ==> val initiator: FlowInitiator defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`.<anonymous>[LocalVariableDescriptor]

'countScheduledFlows' @ [127:21] ==> var countScheduledFlows: Int defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`[LocalVariableDescriptor]

'nodeA' @ [130:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'services' @ [130:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [130:24] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'InsertInitialStateFlow' @ [130:34] ==> public constructor InsertInitialStateFlow(destination: Party) defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[ClassConstructorDescriptorImpl]

'nodeB' @ [130:57] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'info' @ [130:63] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [130:68] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [131:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'waitQuiescent' @ [131:17] ==> public final fun waitQuiescent(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [132:26] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'database' @ [132:32] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [132:41] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<ScheduledFlowTests.ScheduledState>): StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'nodeA' @ [133:13] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'services' @ [133:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [133:28] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [133:46] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ScheduledFlowTests.ScheduledState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ScheduledState

'states' @ [133:72] ==> public final val states: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [133:79] ==> public fun <T> List<StateAndRef<ScheduledFlowTests.ScheduledState>>.single(): StateAndRef<ScheduledFlowTests.ScheduledState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'nodeB' @ [135:26] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'database' @ [135:32] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [135:41] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<ScheduledFlowTests.ScheduledState>): StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'nodeB' @ [136:13] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'services' @ [136:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [136:28] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [136:46] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ScheduledFlowTests.ScheduledState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ScheduledState

'states' @ [136:72] ==> public final val states: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [136:79] ==> public fun <T> List<StateAndRef<ScheduledFlowTests.ScheduledState>>.single(): StateAndRef<ScheduledFlowTests.ScheduledState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'assertEquals' @ [138:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'countScheduledFlows' @ [138:25] ==> var countScheduledFlows: Int defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`[LocalVariableDescriptor]

'assertEquals' @ [139:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: StateAndRef<ScheduledFlowTests.ScheduledState>, actual: StateAndRef<ScheduledFlowTests.ScheduledState>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> StateAndRef<ScheduledState>

'stateFromA' @ [139:22] ==> val stateFromA: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`[LocalVariableDescriptor]

'stateFromB' @ [139:34] ==> val stateFromB: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`[LocalVariableDescriptor]

'assertTrue' @ [140:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'stateFromB' @ [140:41] ==> val stateFromB: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`create and run scheduled flow then wait for result`[LocalVariableDescriptor]

'state' @ [140:52] ==> public final val state: TransactionState<ScheduledFlowTests.ScheduledState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [140:58] ==> public final val data: ScheduledFlowTests.ScheduledState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'processed' @ [140:63] ==> public final val processed: Boolean defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'Test' @ [143:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mutableListOf' @ [146:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<CordaFuture<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<*>

'..' @ [147:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'N' @ [147:22] ==> val N: Int defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'futures' @ [148:13] ==> val futures: MutableList<CordaFuture<*>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'add' @ [148:21] ==> public abstract fun add(element: CordaFuture<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [148:25] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'services' @ [148:31] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [148:40] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'InsertInitialStateFlow' @ [148:50] ==> public constructor InsertInitialStateFlow(destination: Party) defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[ClassConstructorDescriptorImpl]

'nodeB' @ [148:73] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'info' @ [148:79] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [148:84] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [148:100] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'futures' @ [149:13] ==> val futures: MutableList<CordaFuture<*>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'add' @ [149:21] ==> public abstract fun add(element: CordaFuture<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [149:25] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'services' @ [149:31] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [149:40] ==> public open fun <T> startFlow(logic: FlowLogic<Unit>): FlowStateMachine<Unit> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'InsertInitialStateFlow' @ [149:50] ==> public constructor InsertInitialStateFlow(destination: Party) defined in net.corda.node.services.events.ScheduledFlowTests.InsertInitialStateFlow[ClassConstructorDescriptorImpl]

'nodeA' @ [149:73] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'info' @ [149:79] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [149:84] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [149:100] ==> public abstract val resultFuture: CordaFuture<Unit> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [151:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'waitQuiescent' @ [151:17] ==> public final fun waitQuiescent(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'futures' @ [154:9] ==> val futures: MutableList<CordaFuture<*>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'forEach' @ [154:17] ==> @HidesMembers public inline fun <T> Iterable<CordaFuture<*>>.forEach(action: (CordaFuture<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<*>

'it' @ [154:27] ==> value-parameter it: CordaFuture<*> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`.<anonymous>[ValueParameterDescriptorImpl]

'getOrThrow' @ [154:30] ==> public fun <V> Future<out Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'nodeA' @ [157:62] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'database' @ [157:68] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [157:77] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> List<StateAndRef<ScheduledFlowTests.ScheduledState>>): List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<StateAndRef<ScheduledState>>

'queryStatesWithPaging' @ [158:13] ==> private final fun queryStatesWithPaging(vaultQueryService: VaultQueryService): List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests[SimpleFunctionDescriptorImpl]

'nodeA' @ [158:35] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'services' @ [158:41] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [158:50] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'nodeB' @ [160:62] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'database' @ [160:68] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [160:77] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> List<StateAndRef<ScheduledFlowTests.ScheduledState>>): List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<StateAndRef<ScheduledState>>

'queryStatesWithPaging' @ [161:13] ==> private final fun queryStatesWithPaging(vaultQueryService: VaultQueryService): List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests[SimpleFunctionDescriptorImpl]

'nodeB' @ [161:35] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.node.services.events.ScheduledFlowTests[PropertyDescriptorImpl]

'services' @ [161:41] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [161:50] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'assertEquals' @ [163:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'*' @ [163:22] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'N' @ [163:26] ==> val N: Int defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'statesFromA' @ [163:29] ==> val statesFromA: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'count' @ [163:41] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<ScheduledFlowTests.ScheduledState>>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'statesFromA' @ [164:9] ==> val statesFromA: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'forEach' @ [164:21] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<ScheduledFlowTests.ScheduledState>>.forEach(action: (StateAndRef<ScheduledFlowTests.ScheduledState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'ref' @ [165:17] ==> value-parameter ref: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`.<anonymous>[ValueParameterDescriptorImpl]

'statesFromB' @ [165:25] ==> val statesFromB: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'IllegalStateException' @ [166:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'ref' @ [166:53] ==> value-parameter ref: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`.<anonymous>[ValueParameterDescriptorImpl]

'statesFromB' @ [169:9] ==> val statesFromB: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'forEach' @ [169:21] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<ScheduledFlowTests.ScheduledState>>.forEach(action: (StateAndRef<ScheduledFlowTests.ScheduledState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'ref' @ [170:17] ==> value-parameter ref: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`.<anonymous>[ValueParameterDescriptorImpl]

'statesFromA' @ [170:25] ==> val statesFromA: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'IllegalStateException' @ [171:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'ref' @ [171:53] ==> value-parameter ref: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [174:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<StateAndRef<ScheduledFlowTests.ScheduledState>>, actual: List<StateAndRef<ScheduledFlowTests.ScheduledState>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<StateAndRef<ScheduledState>>

'statesFromA' @ [174:22] ==> val statesFromA: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'statesFromB' @ [174:35] ==> val statesFromB: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'assertTrue' @ [175:9] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'statesFromB' @ [175:69] ==> val statesFromB: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`[LocalVariableDescriptor]

'all' @ [175:81] ==> public inline fun <T> Iterable<StateAndRef<ScheduledFlowTests.ScheduledState>>.all(predicate: (StateAndRef<ScheduledFlowTests.ScheduledState>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'it' @ [175:87] ==> value-parameter it: StateAndRef<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.`run a whole batch of scheduled flows`.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [175:90] ==> public final val state: TransactionState<ScheduledFlowTests.ScheduledState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [175:96] ==> public final val data: ScheduledFlowTests.ScheduledState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'processed' @ [175:101] ==> public final val processed: Boolean defined in net.corda.node.services.events.ScheduledFlowTests.ScheduledState[PropertyDescriptorImpl]

'DEFAULT_PAGE_NUM' @ [185:26] ==> public const val DEFAULT_PAGE_NUM: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'mutableListOf' @ [186:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

'PageSpecification' @ [188:28] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[DeserializedClassConstructorDescriptor]

'PAGE_SIZE' @ [188:57] ==> public final val PAGE_SIZE: Int defined in net.corda.node.services.events.ScheduledFlowTests.Companion[PropertyDescriptorImpl]

'pageNumber' @ [188:81] ==> var pageNumber: Int defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'vaultQueryService' @ [189:27] ==> value-parameter vaultQueryService: VaultQueryService defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[ValueParameterDescriptorImpl]

'queryBy' @ [189:45] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort): Vault.Page<ScheduledFlowTests.ScheduledState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ScheduledState

'VaultQueryCriteria' @ [189:69] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'pageSpec' @ [189:91] ==> val pageSpec: PageSpecification defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'SORTING' @ [189:101] ==> public final val SORTING: Sort defined in net.corda.node.services.events.ScheduledFlowTests.Companion[PropertyDescriptorImpl]

'states' @ [190:13] ==> val states: MutableList<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'addAll' @ [190:20] ==> public abstract fun addAll(elements: Collection<StateAndRef<ScheduledFlowTests.ScheduledState>>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'results' @ [190:27] ==> val results: Vault.Page<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'states' @ [190:35] ==> public final val states: List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'pageNumber' @ [191:13] ==> var pageNumber: Int defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'<=' @ [192:18] ==> public final operator fun compareTo(other: Long): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'pageSpec' @ [192:19] ==> val pageSpec: PageSpecification defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'pageSize' @ [192:28] ==> public final val pageSize: Int defined in net.corda.core.node.services.vault.PageSpecification[DeserializedPropertyDescriptor]

'pageNumber' @ [192:40] ==> var pageNumber: Int defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'results' @ [192:56] ==> val results: Vault.Page<ScheduledFlowTests.ScheduledState> defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'totalStatesAvailable' @ [192:64] ==> public final val totalStatesAvailable: Long defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'states' @ [193:16] ==> val states: MutableList<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in net.corda.node.services.events.ScheduledFlowTests.queryStatesWithPaging[LocalVariableDescriptor]

'toList' @ [193:23] ==> public fun <T> Iterable<StateAndRef<ScheduledFlowTests.ScheduledState>>.toList(): List<StateAndRef<ScheduledFlowTests.ScheduledState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ScheduledState>

