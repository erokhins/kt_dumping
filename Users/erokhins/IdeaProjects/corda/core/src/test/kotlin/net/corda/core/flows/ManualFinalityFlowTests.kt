'MockServices' @ [24:20] ==> public constructor MockServices() defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'Before' @ [26:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [28:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'MockNetwork' @ [28:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [29:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'createSomeNodes' @ [29:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [30:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'nodes' @ [30:17] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ManualFinalityFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [30:23] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodeB' @ [31:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'nodes' @ [31:17] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ManualFinalityFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [31:23] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodeC' @ [32:9] ==> public final lateinit var nodeC: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'nodes' @ [32:17] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ManualFinalityFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [32:23] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'notary' @ [33:9] ==> public final lateinit var notary: Party defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'nodes' @ [33:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.ManualFinalityFlowTests.setup[LocalVariableDescriptor]

'notaryNode' @ [33:24] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'info' @ [33:35] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [33:40] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [34:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [34:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [37:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [39:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [39:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [42:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Amount' @ [44:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [44:35] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'nodeA' @ [44:42] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'info' @ [44:48] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [44:53] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [44:67] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'GBP' @ [44:75] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [45:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [45:42] ==> public final lateinit var notary: Party defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'Cash' @ [46:9] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [46:16] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'builder' @ [46:30] ==> val builder: TransactionBuilder defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'amount' @ [46:39] ==> val amount: Amount<Issued<Currency>> defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'nodeB' @ [46:47] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'info' @ [46:53] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [46:58] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'notary' @ [46:73] ==> public final lateinit var notary: Party defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'nodeA' @ [47:19] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'services' @ [47:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [47:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'builder' @ [47:57] ==> val builder: TransactionBuilder defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'nodeA' @ [48:20] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'services' @ [48:26] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [48:35] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'ManualFinalityFlow' @ [48:45] ==> public constructor ManualFinalityFlow(transaction: SignedTransaction, extraParticipants: Set<Party>) defined in net.corda.core.flows.ManualFinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [48:64] ==> val stx: SignedTransaction defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'setOf' @ [48:69] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'nodeC' @ [48:75] ==> public final lateinit var nodeC: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'info' @ [48:81] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [48:86] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [49:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [49:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'flow' @ [50:22] ==> val flow: FlowStateMachine<List<SignedTransaction>> defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'resultFuture' @ [50:27] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [50:40] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'result' @ [51:27] ==> val result: List<SignedTransaction> defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'single' @ [51:34] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'notarisedTx' @ [52:9] ==> val notarisedTx: SignedTransaction defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [52:21] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [54:34] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'services' @ [54:40] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'database' @ [54:49] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'transaction' @ [54:58] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'nodeB' @ [55:13] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'services' @ [55:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [55:28] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [55:50] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'notarisedTx' @ [55:65] ==> val notarisedTx: SignedTransaction defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'id' @ [55:77] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'assertNull' @ [57:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'transactionSeenByB' @ [57:20] ==> val transactionSeenByB: SignedTransaction? defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'nodeC' @ [58:34] ==> public final lateinit var nodeC: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'services' @ [58:40] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'database' @ [58:49] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'transaction' @ [58:58] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'nodeC' @ [59:13] ==> public final lateinit var nodeC: MockNetwork.MockNode defined in net.corda.core.flows.ManualFinalityFlowTests[PropertyDescriptorImpl]

'services' @ [59:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [59:28] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [59:50] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'notarisedTx' @ [59:65] ==> val notarisedTx: SignedTransaction defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'id' @ [59:77] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [61:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SignedTransaction?, actual: SignedTransaction?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SignedTransaction?

'notarisedTx' @ [61:22] ==> val notarisedTx: SignedTransaction defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'transactionSeenByC' @ [61:35] ==> val transactionSeenByC: SignedTransaction? defined in net.corda.core.flows.ManualFinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

