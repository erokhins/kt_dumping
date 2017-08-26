'MockServices' @ [28:20] ==> public constructor MockServices() defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'Before' @ [30:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [32:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'MockNetwork' @ [32:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [33:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'createSomeNodes' @ [33:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'a' @ [34:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'nodes' @ [34:13] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.CollectSignaturesFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [34:19] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'b' @ [35:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'nodes' @ [35:13] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.CollectSignaturesFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [35:19] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'c' @ [36:9] ==> public final lateinit var c: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'nodes' @ [36:13] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.CollectSignaturesFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [36:19] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'notary' @ [37:9] ==> public final lateinit var notary: Party defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'nodes' @ [37:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.CollectSignaturesFlowTests.setup[LocalVariableDescriptor]

'notaryNode' @ [37:24] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'info' @ [37:35] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [37:40] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [38:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [38:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [41:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [43:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [43:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'listOf' @ [47:9] ==> public fun <T> listOf(vararg elements: MockNetwork.MockNode): List<MockNetwork.MockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'a' @ [47:16] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'b' @ [47:19] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'c' @ [47:22] ==> public final lateinit var c: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'forEach' @ [47:25] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'it' @ [48:13] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests.registerFlowOnAllNodes.<anonymous>[ValueParameterDescriptorImpl]

'registerInitiatedFlow' @ [48:16] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<out FlowLogic<*>>): Observable<out FlowLogic<*>> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FlowLogic<*>

'flowClass' @ [48:38] ==> value-parameter flowClass: KClass<out FlowLogic<*>> defined in net.corda.core.flows.CollectSignaturesFlowTests.registerFlowOnAllNodes[ValueParameterDescriptorImpl]

'java' @ [48:48] ==> public val <T> KClass<out FlowLogic<*>>.java: Class<out FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowLogic<*>

'InitiatingFlow' @ [56:9] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [57:92] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [58:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'send' @ [60:17] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [60:22] ==> public final val otherParty: Party defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator[PropertyDescriptorImpl]

'state' @ [60:34] ==> public final val state: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator[PropertyDescriptorImpl]

'SignTransactionFlow' @ [62:37] ==> public constructor SignTransactionFlow(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.SignTransactionFlow[DeserializedClassConstructorDescriptor]

'otherParty' @ [62:57] ==> public final val otherParty: Party defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator[PropertyDescriptorImpl]

'Suspendable' @ [63:21] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'requireThat' @ [63:90] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'stx' @ [64:34] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call.<no name provided>.checkTransaction[ValueParameterDescriptorImpl]

'tx' @ [64:38] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'tx' @ [65:35] ==> val tx: WireTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'toLedgerTransaction' @ [65:38] ==> public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [65:58] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call.<no name provided>[DeserializedPropertyDescriptor]

'using' @ [66:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [66:72] ==> val tx: WireTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'outputs' @ [66:75] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [66:83] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'using' @ [67:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [67:72] ==> val tx: WireTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'inputs' @ [67:75] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [67:82] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ltx' @ [68:48] ==> val ltx: LedgerTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'outputsOfType' @ [68:52] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<DummyContract.MultiOwnerState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> MultiOwnerState

'single' @ [68:99] ==> public fun <T> List<DummyContract.MultiOwnerState>.single(): DummyContract.MultiOwnerState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultiOwnerState

'using' @ [69:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'magicNumberState' @ [69:58] ==> val magicNumberState: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'magicNumber' @ [69:75] ==> public open val magicNumber: Int defined in net.corda.testing.contracts.DummyContract.MultiOwnerState[DeserializedPropertyDescriptor]

'subFlow' @ [73:27] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'flow' @ [73:35] ==> val flow: <no name provided> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call[LocalVariableDescriptor]

'waitForLedgerCommit' @ [74:27] ==> @Suspendable public final fun waitForLedgerCommit(hash: SecureHash): SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator[DeserializedSimpleFunctionDescriptor]

'stx' @ [74:47] ==> val stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call[LocalVariableDescriptor]

'id' @ [74:51] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'ftx' @ [76:24] ==> val ftx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator.call[LocalVariableDescriptor]

'InitiatedBy' @ [80:9] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'TestFlow' @ [80:22] ==> public object TestFlow defined in net.corda.core.flows.CollectSignaturesFlowTests[FakeCallableDescriptorForObject]

'Initiator' @ [80:31] ==> public constructor Initiator(state: DummyContract.MultiOwnerState, otherParty: Party) defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Initiator[ClassConstructorDescriptorImpl]

'FlowLogic<SignedTransaction>' @ [81:94] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [82:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [84:29] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<DummyContract.MultiOwnerState> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> MultiOwnerState

'otherParty' @ [84:68] ==> public final val otherParty: Party defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[PropertyDescriptorImpl]

'unwrap' @ [84:80] ==> public inline fun <T, R> UntrustworthyData<DummyContract.MultiOwnerState>.unwrap(validator: (DummyContract.MultiOwnerState) -> DummyContract.MultiOwnerState): DummyContract.MultiOwnerState defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultiOwnerState
    <R> -> MultiOwnerState

'it' @ [84:89] ==> value-parameter it: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [85:30] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[DeserializedPropertyDescriptor]

'networkMapCache' @ [85:41] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [85:57] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'single' @ [85:69] ==> public fun <T> List<NodeInfo>.single(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'notaryIdentity' @ [85:78] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'state' @ [87:35] ==> val state: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'participants' @ [87:41] ==> public open val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyContract.MultiOwnerState[DeserializedPropertyDescriptor]

'map' @ [87:54] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [87:60] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [87:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'myInputKeys' @ [88:30] ==> val myInputKeys: List<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'identities' @ [88:45] ==> public final val identities: Map<Party, AnonymousParty> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[PropertyDescriptorImpl]

'serviceHub' @ [88:56] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[DeserializedPropertyDescriptor]

'myInfo' @ [88:67] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [88:74] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'serviceHub' @ [88:92] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[DeserializedPropertyDescriptor]

'myInfo' @ [88:103] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [88:110] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [88:125] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'Command' @ [89:31] ==> public constructor Command<T : CommandData>(value: DummyContract.Commands.Create, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Create

'DummyContract' @ [89:39] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [89:62] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'myInputKeys' @ [89:72] ==> val myInputKeys: List<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'TransactionBuilder' @ [90:31] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [90:50] ==> val notary: Party defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'withItems' @ [90:58] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [90:68] ==> val state: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'command' @ [90:75] ==> val command: Command<DummyContract.Commands.Create> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'serviceHub' @ [91:27] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [91:38] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [91:61] ==> val builder: TransactionBuilder defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'subFlow' @ [92:27] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'CollectSignaturesFlow' @ [92:35] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, myOptionalKeys: Iterable<PublicKey>?, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'ptx' @ [92:57] ==> val ptx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'myKeys' @ [92:62] ==> val myKeys: List<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'subFlow' @ [93:27] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [93:35] ==> public constructor FinalityFlow(transaction: SignedTransaction) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [93:48] ==> val stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'single' @ [93:54] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'ftx' @ [95:24] ==> val ftx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlow.Responder.call[LocalVariableDescriptor]

'InitiatingFlow' @ [104:9] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [105:69] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [106:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [108:30] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[DeserializedPropertyDescriptor]

'networkMapCache' @ [108:41] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [108:57] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'single' @ [108:69] ==> public fun <T> List<NodeInfo>.single(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'notaryIdentity' @ [108:78] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'state' @ [109:35] ==> public final val state: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[PropertyDescriptorImpl]

'participants' @ [109:41] ==> public open val participants: List<AbstractParty> defined in net.corda.testing.contracts.DummyContract.MultiOwnerState[DeserializedPropertyDescriptor]

'map' @ [109:54] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [109:60] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [109:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'Command' @ [110:31] ==> public constructor Command<T : CommandData>(value: DummyContract.Commands.Create, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Create

'DummyContract' @ [110:39] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Create' @ [110:62] ==> public constructor Create() defined in net.corda.testing.contracts.DummyContract.Commands.Create[DeserializedClassConstructorDescriptor]

'myInputKeys' @ [110:72] ==> val myInputKeys: List<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'TransactionBuilder' @ [111:31] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [111:50] ==> val notary: Party defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'withItems' @ [111:58] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [111:68] ==> public final val state: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[PropertyDescriptorImpl]

'command' @ [111:75] ==> val command: Command<DummyContract.Commands.Create> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'serviceHub' @ [112:27] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [112:38] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [112:61] ==> val builder: TransactionBuilder defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'subFlow' @ [113:27] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'CollectSignaturesFlow' @ [113:35] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, myOptionalKeys: Iterable<PublicKey>?, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'ptx' @ [113:57] ==> val ptx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'myInputKeys' @ [113:62] ==> val myInputKeys: List<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'subFlow' @ [114:27] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [114:35] ==> public constructor FinalityFlow(transaction: SignedTransaction) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [114:48] ==> val stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'single' @ [114:54] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'ftx' @ [116:24] ==> val ftx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator.call[LocalVariableDescriptor]

'InitiatedBy' @ [120:9] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'TestFlowTwo' @ [120:22] ==> public object TestFlowTwo defined in net.corda.core.flows.CollectSignaturesFlowTests[FakeCallableDescriptorForObject]

'Initiator' @ [120:34] ==> public constructor Initiator(state: DummyContract.MultiOwnerState) defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[ClassConstructorDescriptorImpl]

'FlowLogic<SignedTransaction>' @ [121:50] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'Suspendable' @ [122:13] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'SignTransactionFlow' @ [123:37] ==> public constructor SignTransactionFlow(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.SignTransactionFlow[DeserializedClassConstructorDescriptor]

'otherParty' @ [123:57] ==> public final val otherParty: Party defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder[PropertyDescriptorImpl]

'Suspendable' @ [124:21] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'requireThat' @ [124:90] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'stx' @ [125:34] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call.<no name provided>.checkTransaction[ValueParameterDescriptorImpl]

'tx' @ [125:38] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'tx' @ [126:35] ==> val tx: WireTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'toLedgerTransaction' @ [126:38] ==> public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [126:58] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call.<no name provided>[DeserializedPropertyDescriptor]

'using' @ [127:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [127:72] ==> val tx: WireTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'outputs' @ [127:75] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'size' @ [127:83] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'using' @ [128:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'tx' @ [128:72] ==> val tx: WireTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'inputs' @ [128:75] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'isEmpty' @ [128:82] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ltx' @ [129:48] ==> val ltx: LedgerTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'outputsOfType' @ [129:52] ==> public final inline fun <reified T : ContractState> outputsOfType(): List<DummyContract.MultiOwnerState> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> MultiOwnerState

'single' @ [129:99] ==> public fun <T> List<DummyContract.MultiOwnerState>.single(): DummyContract.MultiOwnerState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MultiOwnerState

'using' @ [130:25] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'magicNumberState' @ [130:58] ==> val magicNumberState: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call.<no name provided>.checkTransaction.<anonymous>[LocalVariableDescriptor]

'magicNumber' @ [130:75] ==> public open val magicNumber: Int defined in net.corda.testing.contracts.DummyContract.MultiOwnerState[DeserializedPropertyDescriptor]

'subFlow' @ [134:27] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'flow' @ [134:35] ==> val flow: <no name provided> defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call[LocalVariableDescriptor]

'waitForLedgerCommit' @ [136:24] ==> @Suspendable public final fun waitForLedgerCommit(hash: SecureHash): SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder[DeserializedSimpleFunctionDescriptor]

'stx' @ [136:44] ==> val stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder.call[LocalVariableDescriptor]

'id' @ [136:48] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Test' @ [141:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'b' @ [143:37] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [143:39] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'keyManagementService' @ [143:48] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'freshKeyAndCert' @ [143:69] ==> @Suspendable public abstract fun freshKeyAndCert(identity: PartyAndCertificate, revocationEnabled: Boolean): PartyAndCertificate defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'b' @ [143:85] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [143:87] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [143:92] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'a' @ [145:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [145:11] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [145:20] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [145:36] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'bConfidentialIdentity' @ [145:62] ==> val bConfidentialIdentity: PartyAndCertificate defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'registerFlowOnAllNodes' @ [146:9] ==> private final fun registerFlowOnAllNodes(flowClass: KClass<out FlowLogic<*>>): Unit defined in net.corda.core.flows.CollectSignaturesFlowTests[SimpleFunctionDescriptorImpl]

'TestFlowTwo' @ [146:32] ==> public object TestFlowTwo defined in net.corda.core.flows.CollectSignaturesFlowTests[FakeCallableDescriptorForObject]

'Responder' @ [146:44] ==> public constructor Responder(otherParty: Party) defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Responder[ClassConstructorDescriptorImpl]

'listOf' @ [148:23] ==> public fun <T> listOf(vararg elements: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'a' @ [148:30] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [148:32] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [148:37] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bConfidentialIdentity' @ [148:52] ==> val bConfidentialIdentity: PartyAndCertificate defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'party' @ [148:74] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'c' @ [148:81] ==> public final lateinit var c: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [148:83] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [148:88] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'DummyContract' @ [149:21] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'MultiOwnerState' @ [149:35] ==> public constructor MultiOwnerState(magicNumber: Int = ..., owners: List<AbstractParty>) defined in net.corda.testing.contracts.DummyContract.MultiOwnerState[DeserializedClassConstructorDescriptor]

'magicNumber' @ [149:51] ==> val magicNumber: Int defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'parties' @ [149:64] ==> val parties: List<Party> defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'a' @ [150:20] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [150:22] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [150:31] ==> public open fun <T> startFlow(logic: FlowLogic<SignedTransaction>): FlowStateMachine<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'TestFlowTwo' @ [150:41] ==> public object TestFlowTwo defined in net.corda.core.flows.CollectSignaturesFlowTests[FakeCallableDescriptorForObject]

'Initiator' @ [150:53] ==> public constructor Initiator(state: DummyContract.MultiOwnerState) defined in net.corda.core.flows.CollectSignaturesFlowTests.TestFlowTwo.Initiator[ClassConstructorDescriptorImpl]

'state' @ [150:63] ==> val state: DummyContract.MultiOwnerState defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'mockNet' @ [151:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [151:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'flow' @ [152:22] ==> val flow: FlowStateMachine<SignedTransaction> defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'resultFuture' @ [152:27] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [152:40] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'result' @ [153:9] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [153:16] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'println' @ [154:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'result' @ [154:17] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'tx' @ [154:24] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'println' @ [155:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'result' @ [155:17] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`successfully collects two signatures`[LocalVariableDescriptor]

'sigs' @ [155:24] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Test' @ [158:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DummyContract' @ [160:37] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [160:51] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'notary' @ [160:73] ==> public final lateinit var notary: Party defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'a' @ [160:81] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [160:83] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [160:88] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [160:102] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'a' @ [161:19] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [161:21] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [161:30] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'onePartyDummyContract' @ [161:53] ==> val onePartyDummyContract: TransactionBuilder defined in net.corda.core.flows.CollectSignaturesFlowTests.`no need to collect any signatures`[LocalVariableDescriptor]

'a' @ [162:20] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [162:22] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [162:31] ==> public open fun <T> startFlow(logic: FlowLogic<SignedTransaction>): FlowStateMachine<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'CollectSignaturesFlow' @ [162:41] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'ptx' @ [162:63] ==> val ptx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`no need to collect any signatures`[LocalVariableDescriptor]

'mockNet' @ [163:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [163:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'flow' @ [164:22] ==> val flow: FlowStateMachine<SignedTransaction> defined in net.corda.core.flows.CollectSignaturesFlowTests.`no need to collect any signatures`[LocalVariableDescriptor]

'resultFuture' @ [164:27] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [164:40] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'result' @ [165:9] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`no need to collect any signatures`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [165:16] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'println' @ [166:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'result' @ [166:17] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`no need to collect any signatures`[LocalVariableDescriptor]

'tx' @ [166:24] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'println' @ [167:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'result' @ [167:17] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`no need to collect any signatures`[LocalVariableDescriptor]

'sigs' @ [167:24] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Test' @ [170:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DummyContract' @ [172:37] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [172:51] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'notary' @ [172:73] ==> public final lateinit var notary: Party defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'a' @ [172:81] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [172:83] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [172:88] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [172:102] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'MockServices' @ [173:32] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MINI_CORP_KEY' @ [173:45] ==> public val MINI_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'miniCorpServices' @ [174:19] ==> val miniCorpServices: MockServices defined in net.corda.core.flows.CollectSignaturesFlowTests.`fails when not signed by initiator`[LocalVariableDescriptor]

'signInitialTransaction' @ [174:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'onePartyDummyContract' @ [174:59] ==> val onePartyDummyContract: TransactionBuilder defined in net.corda.core.flows.CollectSignaturesFlowTests.`fails when not signed by initiator`[LocalVariableDescriptor]

'a' @ [175:20] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [175:22] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [175:31] ==> public open fun <T> startFlow(logic: FlowLogic<SignedTransaction>): FlowStateMachine<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'CollectSignaturesFlow' @ [175:41] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'ptx' @ [175:63] ==> val ptx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`fails when not signed by initiator`[LocalVariableDescriptor]

'mockNet' @ [176:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [176:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [177:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'flow' @ [178:13] ==> val flow: FlowStateMachine<SignedTransaction> defined in net.corda.core.flows.CollectSignaturesFlowTests.`fails when not signed by initiator`[LocalVariableDescriptor]

'resultFuture' @ [178:18] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [178:31] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'Test' @ [182:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DummyContract' @ [184:37] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [184:51] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'notary' @ [184:73] ==> public final lateinit var notary: Party defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'a' @ [185:17] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [185:19] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [185:24] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [185:38] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'b' @ [186:17] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [186:19] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [186:24] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [186:38] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'b' @ [187:17] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'info' @ [187:19] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [187:24] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [187:38] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'a' @ [188:25] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [188:27] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [188:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'twoPartyDummyContract' @ [188:59] ==> val twoPartyDummyContract: TransactionBuilder defined in net.corda.core.flows.CollectSignaturesFlowTests.`passes with multiple initial signatures`[LocalVariableDescriptor]

'b' @ [189:28] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [189:30] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addSignature' @ [189:39] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'signedByA' @ [189:52] ==> val signedByA: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`passes with multiple initial signatures`[LocalVariableDescriptor]

'a' @ [190:20] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'services' @ [190:22] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [190:31] ==> public open fun <T> startFlow(logic: FlowLogic<SignedTransaction>): FlowStateMachine<SignedTransaction> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'CollectSignaturesFlow' @ [190:41] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'signedByBoth' @ [190:63] ==> val signedByBoth: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`passes with multiple initial signatures`[LocalVariableDescriptor]

'mockNet' @ [191:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.CollectSignaturesFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [191:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'flow' @ [192:22] ==> val flow: FlowStateMachine<SignedTransaction> defined in net.corda.core.flows.CollectSignaturesFlowTests.`passes with multiple initial signatures`[LocalVariableDescriptor]

'resultFuture' @ [192:27] ==> public abstract val resultFuture: CordaFuture<SignedTransaction> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [192:40] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'println' @ [193:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'result' @ [193:17] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`passes with multiple initial signatures`[LocalVariableDescriptor]

'tx' @ [193:24] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'println' @ [194:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'result' @ [194:17] ==> val result: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlowTests.`passes with multiple initial signatures`[LocalVariableDescriptor]

'sigs' @ [194:24] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

