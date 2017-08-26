'getLogger' @ [20:33] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'LoadTest' @ [24:29] ==> public constructor LoadTest<T, S>(testName: String, generate: Nodes.(Unit, Int) -> Generator<List<NotariseCommand>>, interpret: (Unit, NotariseCommand) -> Unit, execute: Nodes.(NotariseCommand) -> Unit, gatherRemoteState: Nodes.(Unit?) -> Unit, isConsistent: (Unit) -> Boolean = ...) defined in net.corda.loadtest.LoadTest[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> NotariseCommand
    <S> -> Unit

'MockServices' @ [27:34] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_CASH_ISSUER_KEY' @ [27:47] ==> public val DUMMY_CASH_ISSUER_KEY: KeyPair defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'Generator' @ [28:30] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'pickOne' @ [28:40] ==> public fun <A> Generator.Companion.pickOne(list: List<NodeConnection>): Generator<NodeConnection> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeConnection

'simpleNodes' @ [28:48] ==> public final val simpleNodes: List<NodeConnection> defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'flatMap' @ [28:61] ==> public final fun <B> flatMap(function: (NodeConnection) -> Generator<NotariseCommand>): Generator<NotariseCommand> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> NotariseCommand

'Generator' @ [29:17] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'int' @ [29:27] ==> public fun Generator.Companion.int(): Generator<Int> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]

'map' @ [29:33] ==> public final fun <B> map(function: (Int) -> NotariseCommand): Generator<NotariseCommand> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> NotariseCommand

'DummyContract' @ [30:40] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [30:54] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [30:70] ==> value-parameter it: Int defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [30:74] ==> public final val notary: NodeConnection defined in net.corda.loadtest.Nodes[PropertyDescriptorImpl]

'info' @ [30:81] ==> public final val info: NodeInfo defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'notaryIdentity' @ [30:86] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'DUMMY_CASH_ISSUER' @ [30:102] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'issuerServices' @ [31:35] ==> val issuerServices: MockServices defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'signInitialTransaction' @ [31:50] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'issueBuilder' @ [31:73] ==> val issueBuilder: TransactionBuilder defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'issueTx' @ [32:33] ==> val issueTx: SignedTransaction defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'tx' @ [32:41] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [32:44] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> SingleOwnerState

'DummyContract' @ [33:39] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'move' @ [33:53] ==> public final fun move(prior: StateAndRef<DummyContract.SingleOwnerState>, newOwner: AbstractParty): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'asset' @ [33:58] ==> val asset: StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'DUMMY_CASH_ISSUER' @ [33:65] ==> public val DUMMY_CASH_ISSUER: PartyAndReference defined in net.corda.finance.contracts.asset[DeserializedPropertyDescriptor]

'party' @ [33:83] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'issuerServices' @ [34:34] ==> val issuerServices: MockServices defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'signInitialTransaction' @ [34:49] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'moveBuilder' @ [34:72] ==> val moveBuilder: TransactionBuilder defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'NotariseCommand' @ [35:21] ==> public constructor NotariseCommand(issueTx: SignedTransaction, moveTx: SignedTransaction, node: NodeConnection) defined in net.corda.loadtest.tests.NotariseCommand[ClassConstructorDescriptorImpl]

'issueTx' @ [35:37] ==> val issueTx: SignedTransaction defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'moveTx' @ [35:46] ==> val moveTx: SignedTransaction defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'node' @ [35:54] ==> value-parameter node: NodeConnection defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Generator' @ [38:13] ==> public companion object defined in net.corda.client.mock.Generator[FakeCallableDescriptorForObject]

'replicate' @ [38:23] ==> public fun <A> Generator.Companion.replicate(number: Int, generator: Generator<NotariseCommand>): Generator<List<NotariseCommand>> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NotariseCommand

'generateTx' @ [38:37] ==> val generateTx: Generator<NotariseCommand> defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'component1' @ [41:22] ==> public final operator fun component1(): SignedTransaction defined in net.corda.loadtest.tests.NotariseCommand[SimpleFunctionDescriptorImpl]

'component2' @ [41:31] ==> public final operator fun component2(): SignedTransaction defined in net.corda.loadtest.tests.NotariseCommand[SimpleFunctionDescriptorImpl]

'component3' @ [41:39] ==> public final operator fun component3(): NodeConnection defined in net.corda.loadtest.tests.NotariseCommand[SimpleFunctionDescriptorImpl]

'node' @ [43:29] ==> val node: NodeConnection defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'proxy' @ [43:34] ==> public final val proxy: CordaRPCOps defined in net.corda.loadtest.NodeConnection[PropertyDescriptorImpl]

'proxy' @ [44:33] ==> val proxy: CordaRPCOps defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [44:39] ==> public inline fun <T : Any, A, reified R : FlowLogic<List<SignedTransaction>>> CordaRPCOps.startFlow(flowConstructor: (SignedTransaction) -> FinalityFlow, arg0: SignedTransaction): FlowHandle<List<SignedTransaction>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<SignedTransaction>
    <A> -> SignedTransaction
    <reified R : FlowLogic<T>> -> FinalityFlow

'issueTx' @ [44:65] ==> val issueTx: SignedTransaction defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'issueFlow' @ [45:17] ==> val issueFlow: FlowHandle<List<SignedTransaction>> defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [45:27] ==> public abstract val returnValue: CordaFuture<List<SignedTransaction>> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'thenMatch' @ [45:39] ==> public fun <V, W, X> CordaFuture<out List<SignedTransaction>>.thenMatch(success: (List<SignedTransaction>) -> FlowHandle<List<SignedTransaction>>, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>
    <W> -> FlowHandle<List<SignedTransaction>>
    <X> -> Unit

'proxy' @ [46:21] ==> val proxy: CordaRPCOps defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [46:27] ==> public inline fun <T : Any, A, reified R : FlowLogic<List<SignedTransaction>>> CordaRPCOps.startFlow(flowConstructor: (SignedTransaction) -> FinalityFlow, arg0: SignedTransaction): FlowHandle<List<SignedTransaction>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<SignedTransaction>
    <A> -> SignedTransaction
    <reified R : FlowLogic<T>> -> FinalityFlow

'moveTx' @ [46:53] ==> val moveTx: SignedTransaction defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

'log' @ [49:17] ==> private val log: (Logger..Logger?) defined in net.corda.loadtest.tests in file NotaryTest.kt[PropertyDescriptorImpl]

'error' @ [49:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [49:38] ==> val e: FlowException defined in net.corda.loadtest.tests.dummyNotarisationTest.<anonymous>[LocalVariableDescriptor]

