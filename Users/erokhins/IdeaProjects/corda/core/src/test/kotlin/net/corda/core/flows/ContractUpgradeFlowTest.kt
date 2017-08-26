'Before' @ [43:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [45:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'MockNetwork' @ [45:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [46:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'createSomeNodes' @ [46:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'a' @ [47:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'nodes' @ [47:13] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ContractUpgradeFlowTest.setup[LocalVariableDescriptor]

'partyNodes' @ [47:19] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'b' @ [48:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'nodes' @ [48:13] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ContractUpgradeFlowTest.setup[LocalVariableDescriptor]

'partyNodes' @ [48:19] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'notary' @ [49:9] ==> public final lateinit var notary: Party defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'nodes' @ [49:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ContractUpgradeFlowTest.setup[LocalVariableDescriptor]

'notaryNode' @ [49:24] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'info' @ [49:35] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [49:40] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'nodes' @ [51:28] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ContractUpgradeFlowTest.setup[LocalVariableDescriptor]

'notaryNode' @ [51:34] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'info' @ [51:45] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentitiesAndCerts' @ [51:50] ==> public final val legalIdentitiesAndCerts: NonEmptySet<PartyAndCertificate> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'single' @ [51:74] ==> public inline fun <T> Iterable<PartyAndCertificate>.single(predicate: (PartyAndCertificate) -> Boolean): PartyAndCertificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'it' @ [51:83] ==> value-parameter it: PartyAndCertificate defined in net.corda.core.flows.ContractUpgradeFlowTest.setup.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [51:86] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'nodes' @ [51:95] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ContractUpgradeFlowTest.setup[LocalVariableDescriptor]

'notaryNode' @ [51:101] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'info' @ [51:112] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [51:117] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'a' @ [52:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [52:11] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [52:20] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [52:36] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'nodeIdentity' @ [52:62] ==> val nodeIdentity: PartyAndCertificate defined in net.corda.core.flows.ContractUpgradeFlowTest.setup[LocalVariableDescriptor]

'b' @ [53:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [53:11] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'identityService' @ [53:20] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'verifyAndRegisterIdentity' @ [53:36] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'nodeIdentity' @ [53:62] ==> val nodeIdentity: PartyAndCertificate defined in net.corda.core.flows.ContractUpgradeFlowTest.setup[LocalVariableDescriptor]

'After' @ [56:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [58:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'stopNodes' @ [58:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [61:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DummyContract' @ [64:37] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [64:51] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'notary' @ [64:70] ==> public final lateinit var notary: Party defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'a' @ [64:78] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [64:80] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [64:85] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [64:99] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'b' @ [64:107] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [64:109] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [64:114] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [64:128] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'a' @ [65:25] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [65:27] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [65:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'twoPartyDummyContract' @ [65:59] ==> val twoPartyDummyContract: TransactionBuilder defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'b' @ [66:19] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [66:21] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addSignature' @ [66:30] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'signedByA' @ [66:43] ==> val signedByA: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'a' @ [68:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [68:11] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [68:20] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'FinalityFlow' @ [68:30] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [68:43] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'setOf' @ [68:48] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'a' @ [68:54] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [68:56] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [68:61] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [68:76] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [68:78] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [68:83] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [69:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [69:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'a' @ [71:19] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [71:21] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [71:30] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'a' @ [71:44] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [71:46] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [71:55] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [71:77] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [71:92] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'id' @ [71:96] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'b' @ [72:19] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [72:21] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [72:30] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'b' @ [72:44] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [72:46] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [72:55] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [72:77] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [72:92] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'id' @ [72:96] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'requireNotNull' @ [73:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'atx' @ [73:24] ==> val atx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'requireNotNull' @ [74:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'btx' @ [74:24] ==> val btx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'a' @ [77:30] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [77:32] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [77:41] ==> public open fun <T> startFlow(logic: FlowLogic<StateAndRef<DummyContractV2.State>>): FlowStateMachine<StateAndRef<DummyContractV2.State>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'ContractUpgradeFlow' @ [77:51] ==> public constructor ContractUpgradeFlow<OldState : ContractState, out NewState : ContractState>(originalState: StateAndRef<DummyContract.State>, newContractClass: Class<out UpgradedContract<DummyContract.State, DummyContractV2.State>>) defined in net.corda.core.flows.ContractUpgradeFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <OldState : ContractState> -> State
    <out NewState : ContractState> -> State

'atx' @ [77:71] ==> val atx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'tx' @ [77:77] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [77:80] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'DummyContractV2' @ [77:91] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'java' @ [77:114] ==> public val <T> KClass<DummyContractV2>.java: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContractV2

'resultFuture' @ [77:121] ==> public abstract val resultFuture: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [78:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [78:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [79:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<UnexpectedFlowEndException>, block: () -> Unit): UnexpectedFlowEndException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> UnexpectedFlowEndException

'rejectedFuture' @ [79:62] ==> val rejectedFuture: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'getOrThrow' @ [79:77] ==> public fun <V> Future<StateAndRef<DummyContractV2.State>>.getOrThrow(timeout: Duration? = ...): StateAndRef<DummyContractV2.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> StateAndRef<State>

'b' @ [82:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [82:11] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultService' @ [82:20] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'authoriseContractUpgrade' @ [82:33] ==> public abstract fun authoriseContractUpgrade(stateAndRef: StateAndRef<*>, upgradedContractClass: Class<out UpgradedContract<*, *>>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'btx' @ [82:58] ==> val btx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'tx' @ [82:64] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [82:67] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'DummyContractV2' @ [82:93] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'java' @ [82:116] ==> public val <T> KClass<DummyContractV2>.java: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContractV2

'a' @ [85:28] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [85:30] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [85:39] ==> public open fun <T> startFlow(logic: FlowLogic<StateAndRef<DummyContractV2.State>>): FlowStateMachine<StateAndRef<DummyContractV2.State>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'ContractUpgradeFlow' @ [85:49] ==> public constructor ContractUpgradeFlow<OldState : ContractState, out NewState : ContractState>(originalState: StateAndRef<DummyContract.State>, newContractClass: Class<out UpgradedContract<DummyContract.State, DummyContractV2.State>>) defined in net.corda.core.flows.ContractUpgradeFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <OldState : ContractState> -> State
    <out NewState : ContractState> -> State

'atx' @ [85:69] ==> val atx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'tx' @ [85:73] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [85:76] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'DummyContractV2' @ [85:87] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'java' @ [85:110] ==> public val <T> KClass<DummyContractV2>.java: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContractV2

'resultFuture' @ [85:117] ==> public abstract val resultFuture: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [86:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [86:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'resultFuture' @ [88:22] ==> val resultFuture: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'getOrThrow' @ [88:35] ==> public fun <V> Future<StateAndRef<DummyContractV2.State>>.getOrThrow(timeout: Duration? = ...): StateAndRef<DummyContractV2.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> StateAndRef<State>

'node' @ [91:27] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[ValueParameterDescriptorImpl]

'database' @ [91:32] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [91:41] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'node' @ [92:17] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[ValueParameterDescriptorImpl]

'services' @ [92:22] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [92:31] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [92:53] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'result' @ [92:68] ==> val result: StateAndRef<DummyContractV2.State> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[LocalVariableDescriptor]

'ref' @ [92:75] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [92:79] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'requireNotNull' @ [94:13] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'nodeStx' @ [94:28] ==> val nodeStx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[LocalVariableDescriptor]

'node' @ [97:25] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[ValueParameterDescriptorImpl]

'database' @ [97:30] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [97:39] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'node' @ [98:17] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[ValueParameterDescriptorImpl]

'services' @ [98:22] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [98:31] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [98:53] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'nodeStx' @ [98:68] ==> val nodeStx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[LocalVariableDescriptor]

'tx' @ [98:78] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [98:81] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [98:88] ==> public fun <T> List<StateRef>.single(): StateRef defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'txhash' @ [98:97] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'requireNotNull' @ [100:13] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'input' @ [100:28] ==> val input: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[LocalVariableDescriptor]

'assertTrue' @ [101:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'input' @ [101:24] ==> val input: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[LocalVariableDescriptor]

'tx' @ [101:32] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [101:35] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [101:43] ==> public fun <T> List<TransactionState<ContractState>>.single(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'data' @ [101:52] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertTrue' @ [104:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'nodeStx' @ [104:24] ==> val nodeStx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`.check[LocalVariableDescriptor]

'tx' @ [104:34] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [104:37] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [104:45] ==> public fun <T> List<TransactionState<ContractState>>.single(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'data' @ [104:54] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'check' @ [106:9] ==> local final fun check(node: MockNetwork.MockNode): Unit defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[SimpleFunctionDescriptorImpl]

'a' @ [106:15] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'check' @ [107:9] ==> local final fun check(node: MockNetwork.MockNode): Unit defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade`[SimpleFunctionDescriptorImpl]

'b' @ [107:15] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'startRpcClient' @ [111:16] ==> public inline fun <reified I : RPCOps> RPCDriverExposedDSLInterface.startRpcClient(rpcAddress: NetworkHostAndPort, username: String = ..., password: String = ..., configuration: RPCClientConfiguration = ...): CordaFuture<CordaRPCOps> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified I : RPCOps> -> CordaRPCOps

'startRpcServer' @ [112:30] ==> public abstract fun <I : RPCOps> startRpcServer(serverName: String = ..., rpcUser: User = ..., nodeLegalName: X500Name = ..., maxFileSize: Int = ..., maxBufferedBytesPerClient: Long = ..., configuration: RPCServerConfiguration = ..., customPort: NetworkHostAndPort? = ..., ops: CordaRPCOpsImpl): CordaFuture<RpcServerHandle> defined in net.corda.testing.RPCDriverExposedDSLInterface[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <I : RPCOps> -> CordaRPCOpsImpl

'user' @ [113:35] ==> value-parameter user: User defined in net.corda.core.flows.ContractUpgradeFlowTest.startProxy[ValueParameterDescriptorImpl]

'CordaRPCOpsImpl' @ [114:31] ==> public constructor CordaRPCOpsImpl(services: ServiceHubInternal, smm: StateMachineManager, database: CordaPersistence) defined in net.corda.node.internal.CordaRPCOpsImpl[DeserializedClassConstructorDescriptor]

'node' @ [114:47] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest.startProxy[ValueParameterDescriptorImpl]

'services' @ [114:52] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'node' @ [114:62] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest.startProxy[ValueParameterDescriptorImpl]

'smm' @ [114:67] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'node' @ [114:72] ==> value-parameter node: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest.startProxy[ValueParameterDescriptorImpl]

'database' @ [114:77] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'get' @ [115:19] ==> public abstract fun get(): (RpcServerHandle..RpcServerHandle?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'broker' @ [115:25] ==> public final val broker: RpcBrokerHandle defined in net.corda.testing.RpcServerHandle[DeserializedPropertyDescriptor]

'hostAndPort' @ [115:32] ==> public final val hostAndPort: NetworkHostAndPort? defined in net.corda.testing.RpcBrokerHandle[DeserializedPropertyDescriptor]

'user' @ [116:28] ==> value-parameter user: User defined in net.corda.core.flows.ContractUpgradeFlowTest.startProxy[ValueParameterDescriptorImpl]

'username' @ [116:33] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'user' @ [117:28] ==> value-parameter user: User defined in net.corda.core.flows.ContractUpgradeFlowTest.startProxy[ValueParameterDescriptorImpl]

'password' @ [117:33] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'get' @ [118:11] ==> public abstract fun get(): (CordaRPCOps..CordaRPCOps?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'Test' @ [121:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'rpcDriver' @ [123:9] ==> public fun <A> rpcDriver(isDebug: Boolean = ..., driverDirectory: Path = ..., portAllocation: PortAllocation = ..., debugPortAllocation: PortAllocation = ..., systemProperties: Map<String, String> = ..., useTestClock: Boolean = ..., initialiseSerialization: Boolean = ..., networkMapStartStrategy: NetworkMapStartStrategy = ..., startNodesInProcess: Boolean = ..., dsl: RPCDriverExposedDSLInterface.() -> Unit): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'DummyContract' @ [125:41] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [125:55] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'notary' @ [125:74] ==> public final lateinit var notary: Party defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'a' @ [125:82] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [125:84] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [125:89] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [125:103] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'b' @ [125:111] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [125:113] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [125:118] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [125:132] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'a' @ [126:29] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [126:31] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [126:40] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'twoPartyDummyContract' @ [126:63] ==> val twoPartyDummyContract: TransactionBuilder defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'b' @ [127:23] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [127:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addSignature' @ [127:34] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'signedByA' @ [127:47] ==> val signedByA: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'rpcTestUser' @ [129:24] ==> public val rpcTestUser: User defined in net.corda.testing[DeserializedPropertyDescriptor]

'copy' @ [129:36] ==> public final fun copy(username: String = ..., password: String = ..., permissions: Set<String> = ...): User defined in net.corda.nodeapi.User[DeserializedSimpleFunctionDescriptor]

'setOf' @ [129:55] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'startFlowPermission' @ [130:21] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> FinalityInvoker

'startFlowPermission' @ [131:21] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> ContractUpgradeFlow<*, *>

'startProxy' @ [133:24] ==> private final fun RPCDriverExposedDSLInterface.startProxy(node: MockNetwork.MockNode, user: User): CordaRPCOps defined in net.corda.core.flows.ContractUpgradeFlowTest[SimpleFunctionDescriptorImpl]

'a' @ [133:35] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'user' @ [133:38] ==> val user: User defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'startProxy' @ [134:24] ==> private final fun RPCDriverExposedDSLInterface.startProxy(node: MockNetwork.MockNode, user: User): CordaRPCOps defined in net.corda.core.flows.ContractUpgradeFlowTest[SimpleFunctionDescriptorImpl]

'b' @ [134:35] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'user' @ [134:38] ==> val user: User defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'rpcA' @ [135:26] ==> val rpcA: CordaRPCOps defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [135:31] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<List<SignedTransaction>>> CordaRPCOps.startFlow(flowConstructor: (SignedTransaction, Set<Party>) -> ContractUpgradeFlowTest.FinalityInvoker, arg0: SignedTransaction, arg1: Set<Party>): FlowHandle<List<SignedTransaction>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<SignedTransaction>
    <A> -> SignedTransaction
    <B> -> Set<Party>
    <reified R : FlowLogic<T>> -> FinalityInvoker

'stx' @ [135:60] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'setOf' @ [135:65] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'a' @ [135:71] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [135:73] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [135:78] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [135:93] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [135:95] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [135:100] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [136:13] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [136:21] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'handle' @ [137:13] ==> val handle: FlowHandle<List<SignedTransaction>> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [137:20] ==> public abstract val returnValue: CordaFuture<List<SignedTransaction>> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [137:32] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'a' @ [139:23] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [139:25] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [139:34] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'a' @ [139:48] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [139:50] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [139:59] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [139:81] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [139:96] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'id' @ [139:100] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'b' @ [140:23] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [140:25] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [140:34] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'b' @ [140:48] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [140:50] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [140:59] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [140:81] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [140:96] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'id' @ [140:100] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'requireNotNull' @ [141:13] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'atx' @ [141:28] ==> val atx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'requireNotNull' @ [142:13] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'btx' @ [142:28] ==> val btx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'rpcA' @ [144:34] ==> val rpcA: CordaRPCOps defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [144:39] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<StateAndRef<DummyContractV2.State>>> CordaRPCOps.startFlow(flowConstructor: (StateAndRef<DummyContract.State>, Class<DummyContractV2>) -> ContractUpgradeFlow<DummyContract.State, DummyContractV2.State>, arg0: StateAndRef<DummyContract.State>, arg1: Class<DummyContractV2>): FlowHandle<StateAndRef<DummyContractV2.State>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> StateAndRef<State>
    <A> -> StateAndRef<State>
    <B> -> Class<DummyContractV2>
    <reified R : FlowLogic<T>> -> ContractUpgradeFlow<State, State>

'ContractUpgradeFlow' @ [144:75] ==> public constructor ContractUpgradeFlow<OldState : ContractState, out NewState : ContractState>(originalState: StateAndRef<DummyContract.State>, newContractClass: Class<out UpgradedContract<DummyContract.State, DummyContractV2.State>>) defined in net.corda.core.flows.ContractUpgradeFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <OldState : ContractState> -> State
    <out NewState : ContractState> -> State

'stateAndRef' @ [144:95] ==> value-parameter stateAndRef: StateAndRef<DummyContract.State> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'upgrade' @ [144:108] ==> value-parameter upgrade: Class<DummyContractV2> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'atx' @ [145:21] ==> val atx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'tx' @ [145:27] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [145:30] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'DummyContractV2' @ [146:21] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'java' @ [146:44] ==> public val <T> KClass<DummyContractV2>.java: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContractV2

'returnValue' @ [146:50] ==> public abstract val returnValue: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'mockNet' @ [148:13] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [148:21] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [149:13] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<UnexpectedFlowEndException>, block: () -> Unit): UnexpectedFlowEndException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> UnexpectedFlowEndException

'rejectedFuture' @ [149:66] ==> val rejectedFuture: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [149:81] ==> public fun <V> Future<StateAndRef<DummyContractV2.State>>.getOrThrow(timeout: Duration? = ...): StateAndRef<DummyContractV2.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> StateAndRef<State>

'rpcB' @ [152:13] ==> val rpcB: CordaRPCOps defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'authoriseContractUpgrade' @ [152:18] ==> public abstract fun authoriseContractUpgrade(state: StateAndRef<*>, upgradedContractClass: Class<out UpgradedContract<*, *>>): Unit defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'btx' @ [152:43] ==> val btx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'tx' @ [152:49] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [152:52] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'DummyContractV2' @ [152:78] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'java' @ [152:101] ==> public val <T> KClass<DummyContractV2>.java: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContractV2

'rpcA' @ [155:32] ==> val rpcA: CordaRPCOps defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [155:37] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<StateAndRef<DummyContractV2.State>>> CordaRPCOps.startFlow(flowConstructor: (StateAndRef<DummyContract.State>, Class<DummyContractV2>) -> ContractUpgradeFlow<DummyContract.State, DummyContractV2.State>, arg0: StateAndRef<DummyContract.State>, arg1: Class<DummyContractV2>): FlowHandle<StateAndRef<DummyContractV2.State>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> StateAndRef<State>
    <A> -> StateAndRef<State>
    <B> -> Class<DummyContractV2>
    <reified R : FlowLogic<T>> -> ContractUpgradeFlow<State, State>

'ContractUpgradeFlow' @ [155:73] ==> public constructor ContractUpgradeFlow<OldState : ContractState, out NewState : ContractState>(originalState: StateAndRef<DummyContract.State>, newContractClass: Class<out UpgradedContract<DummyContract.State, DummyContractV2.State>>) defined in net.corda.core.flows.ContractUpgradeFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <OldState : ContractState> -> State
    <out NewState : ContractState> -> State

'stateAndRef' @ [155:93] ==> value-parameter stateAndRef: StateAndRef<DummyContract.State> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'upgrade' @ [155:106] ==> value-parameter upgrade: Class<DummyContractV2> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'atx' @ [156:21] ==> val atx: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'tx' @ [156:25] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [156:28] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'DummyContractV2' @ [157:21] ==> public constructor DummyContractV2() defined in net.corda.testing.contracts.DummyContractV2[DeserializedClassConstructorDescriptor]

'java' @ [157:44] ==> public val <T> KClass<DummyContractV2>.java: Class<DummyContractV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DummyContractV2

'returnValue' @ [157:50] ==> public abstract val returnValue: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'mockNet' @ [159:13] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [159:21] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'resultFuture' @ [160:26] ==> val resultFuture: CordaFuture<StateAndRef<DummyContractV2.State>> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [160:39] ==> public fun <V> Future<StateAndRef<DummyContractV2.State>>.getOrThrow(timeout: Duration? = ...): StateAndRef<DummyContractV2.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> StateAndRef<State>

'listOf' @ [162:13] ==> public fun <T> listOf(vararg elements: MockNetwork.MockNode): List<MockNetwork.MockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'a' @ [162:20] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'b' @ [162:23] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'forEach' @ [162:26] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'a' @ [163:32] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [163:34] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [163:43] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'a' @ [163:57] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [163:59] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [163:68] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [163:90] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'result' @ [163:105] ==> val result: StateAndRef<DummyContractV2.State> defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>[LocalVariableDescriptor]

'ref' @ [163:112] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [163:116] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'requireNotNull' @ [164:17] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'signedTX' @ [164:32] ==> val signedTX: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'a' @ [167:29] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [167:31] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [167:40] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'a' @ [167:54] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [167:56] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [167:65] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [167:87] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'signedTX' @ [167:102] ==> val signedTX: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'tx' @ [167:113] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [167:116] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [167:123] ==> public fun <T> List<StateRef>.single(): StateRef defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'txhash' @ [167:132] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'requireNotNull' @ [168:17] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'input' @ [168:32] ==> val input: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [169:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'input' @ [169:28] ==> val input: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'tx' @ [169:36] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [169:39] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [169:47] ==> public fun <T> List<TransactionState<ContractState>>.single(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'data' @ [169:56] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertTrue' @ [172:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'signedTX' @ [172:28] ==> val signedTX: SignedTransaction? defined in net.corda.core.flows.ContractUpgradeFlowTest.`2 parties contract upgrade using RPC`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'tx' @ [172:39] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [172:42] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'single' @ [172:50] ==> public fun <T> List<TransactionState<ContractState>>.single(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'data' @ [172:59] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'Test' @ [177:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'a' @ [180:22] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [180:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [180:33] ==> public open fun <T> startFlow(logic: FlowLogic<AbstractCashFlow.Result>): FlowStateMachine<AbstractCashFlow.Result> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result

'CashIssueFlow' @ [180:43] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'Amount' @ [180:57] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'USD' @ [180:70] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'OpaqueBytes' @ [180:76] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'of' @ [180:88] ==> @JvmStatic public final fun of(vararg b: Byte): OpaqueBytes defined in net.corda.core.utilities.OpaqueBytes.Companion[DeserializedSimpleFunctionDescriptor]

'notary' @ [180:95] ==> public final lateinit var notary: Party defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'resultFuture' @ [180:104] ==> public abstract val resultFuture: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [181:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [181:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'result' @ [182:19] ==> val result: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'getOrThrow' @ [182:26] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'stx' @ [182:39] ==> public final val stx: SignedTransaction defined in net.corda.finance.flows.AbstractCashFlow.Result[DeserializedPropertyDescriptor]

'stx' @ [183:27] ==> val stx: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'tx' @ [183:31] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [183:34] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<Cash.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'a' @ [184:25] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [184:27] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [184:36] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<ContractState>): StateAndRef<ContractState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'a' @ [184:50] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [184:52] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [184:61] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [184:79] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'states' @ [184:104] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [184:111] ==> public fun <T> List<StateAndRef<ContractState>>.single(): StateAndRef<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'assertTrue' @ [185:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'baseState' @ [185:20] ==> val baseState: StateAndRef<ContractState> defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'state' @ [185:30] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [185:36] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'a' @ [187:29] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [187:31] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [187:40] ==> public open fun <T> startFlow(logic: FlowLogic<StateAndRef<ContractUpgradeFlowTest.CashV2.State>>): FlowStateMachine<StateAndRef<ContractUpgradeFlowTest.CashV2.State>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'ContractUpgradeFlow' @ [187:50] ==> public constructor ContractUpgradeFlow<OldState : ContractState, out NewState : ContractState>(originalState: StateAndRef<Cash.State>, newContractClass: Class<out UpgradedContract<Cash.State, ContractUpgradeFlowTest.CashV2.State>>) defined in net.corda.core.flows.ContractUpgradeFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <OldState : ContractState> -> State
    <out NewState : ContractState> -> State

'stateAndRef' @ [187:70] ==> val stateAndRef: StateAndRef<Cash.State> defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'CashV2' @ [187:83] ==> public constructor CashV2() defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2[ClassConstructorDescriptorImpl]

'java' @ [187:97] ==> public val <T> KClass<ContractUpgradeFlowTest.CashV2>.java: Class<ContractUpgradeFlowTest.CashV2> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CashV2

'resultFuture' @ [187:104] ==> public abstract val resultFuture: CordaFuture<StateAndRef<ContractUpgradeFlowTest.CashV2.State>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [188:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [188:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'upgradeResult' @ [189:9] ==> val upgradeResult: CordaFuture<StateAndRef<ContractUpgradeFlowTest.CashV2.State>> defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'getOrThrow' @ [189:23] ==> public fun <V> Future<StateAndRef<ContractUpgradeFlowTest.CashV2.State>>.getOrThrow(timeout: Duration? = ...): StateAndRef<ContractUpgradeFlowTest.CashV2.State> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> StateAndRef<State>

'a' @ [191:26] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'database' @ [191:28] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [191:37] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> StateAndRef<ContractState>): StateAndRef<ContractState> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'a' @ [191:51] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'services' @ [191:53] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'vaultQueryService' @ [191:62] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'queryBy' @ [191:80] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(): Vault.Page<ContractState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'states' @ [191:105] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [191:112] ==> public fun <T> List<StateAndRef<ContractState>>.single(): StateAndRef<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'assertTrue' @ [192:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'firstState' @ [192:20] ==> val firstState: StateAndRef<ContractState> defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'state' @ [192:31] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [192:37] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'assertEquals' @ [193:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Amount<Issued<Currency>>, actual: Amount<Issued<Currency>>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Amount<Issued<Currency>>

'Amount' @ [193:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'USD' @ [193:38] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'`issued by`' @ [193:43] ==> public infix fun Amount<Currency>.`issued by`(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[DeserializedSimpleFunctionDescriptor]

'a' @ [193:55] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [193:57] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [193:62] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [193:76] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'firstState' @ [193:86] ==> val firstState: StateAndRef<ContractState> defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'state' @ [193:97] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [193:103] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [193:125] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'assertEquals' @ [194:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Collection<AbstractParty>, actual: Collection<AbstractParty>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Collection<AbstractParty>

'listOf' @ [194:49] ==> public fun <T> listOf(element: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'a' @ [194:56] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.flows.ContractUpgradeFlowTest[PropertyDescriptorImpl]

'info' @ [194:58] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [194:63] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'firstState' @ [194:80] ==> val firstState: StateAndRef<ContractState> defined in net.corda.core.flows.ContractUpgradeFlowTest.`upgrade Cash to v2`[LocalVariableDescriptor]

'state' @ [194:91] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [194:97] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owners' @ [194:119] ==> public final val owners: List<AbstractParty> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'Cash' @ [198:39] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'java' @ [198:51] ==> public val <T> KClass<Cash>.java: Class<Cash> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Cash

'owners' @ [201:49] ==> public final val owners: List<AbstractParty> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'first' @ [201:56] ==> public fun <T> List<AbstractParty>.first(): AbstractParty defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'owners' @ [202:38] ==> public final val owners: List<AbstractParty> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'amount' @ [202:47] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'token' @ [202:54] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [202:60] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [202:67] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'map' @ [202:74] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [202:80] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State.exitKeys.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [202:83] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toSet' @ [202:95] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'CashV2' @ [203:37] ==> public constructor CashV2() defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2[ClassConstructorDescriptorImpl]

'owners' @ [204:41] ==> public final val owners: List<AbstractParty> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'copy' @ [206:112] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owners: List<AbstractParty> = ...): ContractUpgradeFlowTest.CashV2.State defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[SimpleFunctionDescriptorImpl]

'amount' @ [206:126] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'copy' @ [206:133] ==> public final fun copy(quantity: Long = ..., displayTokenSize: BigDecimal = ..., token: Issued<Currency> = ...): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'newAmount' @ [206:138] ==> value-parameter newAmount: Amount<Issued<Currency>> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'quantity' @ [206:148] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'listOf' @ [206:168] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'newOwner' @ [206:175] ==> value-parameter newOwner: AbstractParty defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State.withNewOwnerAndAmount[ValueParameterDescriptorImpl]

'Emoji' @ [207:42] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'bagOfCash' @ [207:48] ==> public final val bagOfCash: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'amount' @ [207:68] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'amount' @ [207:80] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'token' @ [207:87] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [207:93] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'owner' @ [207:111] ==> public open val owner: AbstractParty defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[PropertyDescriptorImpl]

'CommandAndState' @ [208:66] ==> public constructor CommandAndState(command: CommandData, ownableState: OwnableState) defined in net.corda.core.contracts.CommandAndState[DeserializedClassConstructorDescriptor]

'Cash' @ [208:82] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'Move' @ [208:96] ==> public constructor Move(contract: Class<out Contract>? = ...) defined in net.corda.finance.contracts.asset.Cash.Commands.Move[DeserializedClassConstructorDescriptor]

'copy' @ [208:104] ==> public final fun copy(amount: Amount<Issued<Currency>> = ..., owners: List<AbstractParty> = ...): ContractUpgradeFlowTest.CashV2.State defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[SimpleFunctionDescriptorImpl]

'listOf' @ [208:118] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'newOwner' @ [208:125] ==> value-parameter newOwner: AbstractParty defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State.withNewOwner[ValueParameterDescriptorImpl]

'State' @ [211:58] ==> public constructor State(amount: Amount<Issued<Currency>>, owners: List<AbstractParty>) defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.State[ClassConstructorDescriptorImpl]

'state' @ [211:64] ==> value-parameter state: Cash.State defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.upgrade[ValueParameterDescriptorImpl]

'amount' @ [211:70] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'times' @ [211:77] ==> public final operator fun times(other: Int): Amount<Issued<Currency>> defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'listOf' @ [211:90] ==> public fun <T> listOf(element: AbstractParty): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'state' @ [211:97] ==> value-parameter state: Cash.State defined in net.corda.core.flows.ContractUpgradeFlowTest.CashV2.upgrade[ValueParameterDescriptorImpl]

'owner' @ [211:103] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'StartableByRPC' @ [216:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<List<SignedTransaction>>' @ [218:62] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> List<SignedTransaction>

'Suspendable' @ [219:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [220:56] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.core.flows.ContractUpgradeFlowTest.FinalityInvoker[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [220:64] ==> public constructor FinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'transaction' @ [220:77] ==> public final val transaction: SignedTransaction defined in net.corda.core.flows.ContractUpgradeFlowTest.FinalityInvoker[PropertyDescriptorImpl]

'extraRecipients' @ [220:90] ==> public final val extraRecipients: Set<Party> defined in net.corda.core.flows.ContractUpgradeFlowTest.FinalityInvoker[PropertyDescriptorImpl]

