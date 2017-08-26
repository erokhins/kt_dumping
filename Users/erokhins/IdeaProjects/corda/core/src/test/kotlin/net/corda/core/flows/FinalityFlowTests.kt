'MockServices' @ [22:20] ==> public constructor MockServices() defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'Before' @ [24:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [26:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'MockNetwork' @ [26:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [27:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'createSomeNodes' @ [27:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [28:9] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'nodes' @ [28:17] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.FinalityFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [28:23] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodeB' @ [29:9] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'nodes' @ [29:17] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.FinalityFlowTests.setup[LocalVariableDescriptor]

'partyNodes' @ [29:23] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'notary' @ [30:9] ==> public final lateinit var notary: Party defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'nodes' @ [30:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.FinalityFlowTests.setup[LocalVariableDescriptor]

'notaryNode' @ [30:24] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'info' @ [30:35] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [30:40] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [31:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [31:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [34:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [36:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'stopNodes' @ [36:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [39:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Amount' @ [41:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [41:35] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'nodeA' @ [41:42] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'info' @ [41:48] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [41:53] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [41:67] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'GBP' @ [41:75] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [42:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [42:42] ==> public final lateinit var notary: Party defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'Cash' @ [43:9] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [43:16] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'builder' @ [43:30] ==> val builder: TransactionBuilder defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'amount' @ [43:39] ==> val amount: Amount<Issued<Currency>> defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'nodeB' @ [43:47] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'info' @ [43:53] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [43:58] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'notary' @ [43:73] ==> public final lateinit var notary: Party defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'nodeA' @ [44:19] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'services' @ [44:25] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [44:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'builder' @ [44:57] ==> val builder: TransactionBuilder defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'nodeA' @ [45:20] ==> public final lateinit var nodeA: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'services' @ [45:26] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [45:35] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'FinalityFlow' @ [45:45] ==> public constructor FinalityFlow(transaction: SignedTransaction) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [45:58] ==> val stx: SignedTransaction defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'mockNet' @ [46:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'runNetwork' @ [46:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'flow' @ [47:22] ==> val flow: FlowStateMachine<List<SignedTransaction>> defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'resultFuture' @ [47:27] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [47:40] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'result' @ [48:27] ==> val result: List<SignedTransaction> defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'single' @ [48:34] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'notarisedTx' @ [49:9] ==> val notarisedTx: SignedTransaction defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [49:21] ==> public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [50:34] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'services' @ [50:40] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'database' @ [50:49] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'transaction' @ [50:58] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction?

'nodeB' @ [51:13] ==> public final lateinit var nodeB: MockNetwork.MockNode defined in net.corda.core.flows.FinalityFlowTests[PropertyDescriptorImpl]

'services' @ [51:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [51:28] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [51:50] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'notarisedTx' @ [51:65] ==> val notarisedTx: SignedTransaction defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'id' @ [51:77] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [53:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SignedTransaction?, actual: SignedTransaction?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SignedTransaction?

'notarisedTx' @ [53:22] ==> val notarisedTx: SignedTransaction defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

'transactionSeenByB' @ [53:35] ==> val transactionSeenByB: SignedTransaction? defined in net.corda.core.flows.FinalityFlowTests.`finalise a simple transaction`[LocalVariableDescriptor]

