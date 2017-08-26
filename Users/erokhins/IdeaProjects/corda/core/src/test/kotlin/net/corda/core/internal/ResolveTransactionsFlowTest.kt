'MockServices' @ [37:28] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [37:41] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'MockServices' @ [38:26] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[DeserializedClassConstructorDescriptor]

'DUMMY_NOTARY_KEY' @ [38:39] ==> public val DUMMY_NOTARY_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'Before' @ [40:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [42:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'MockNetwork' @ [42:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'mockNet' @ [43:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'createSomeNodes' @ [43:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'a' @ [44:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'nodes' @ [44:13] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.internal.ResolveTransactionsFlowTest.setup[LocalVariableDescriptor]

'partyNodes' @ [44:19] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'b' @ [45:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'nodes' @ [45:13] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.internal.ResolveTransactionsFlowTest.setup[LocalVariableDescriptor]

'partyNodes' @ [45:19] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'a' @ [46:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'registerInitiatedFlow' @ [46:11] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<ResolveTransactionsFlowTest.TestResponseFlow>): Observable<ResolveTransactionsFlowTest.TestResponseFlow> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> TestResponseFlow

'TestResponseFlow' @ [46:33] ==> public constructor TestResponseFlow(otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestResponseFlow[ClassConstructorDescriptorImpl]

'java' @ [46:57] ==> public val <T> KClass<ResolveTransactionsFlowTest.TestResponseFlow>.java: Class<ResolveTransactionsFlowTest.TestResponseFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TestResponseFlow

'b' @ [47:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'registerInitiatedFlow' @ [47:11] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<ResolveTransactionsFlowTest.TestResponseFlow>): Observable<ResolveTransactionsFlowTest.TestResponseFlow> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> TestResponseFlow

'TestResponseFlow' @ [47:33] ==> public constructor TestResponseFlow(otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestResponseFlow[ClassConstructorDescriptorImpl]

'java' @ [47:57] ==> public val <T> KClass<ResolveTransactionsFlowTest.TestResponseFlow>.java: Class<ResolveTransactionsFlowTest.TestResponseFlow> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TestResponseFlow

'notary' @ [48:9] ==> public final lateinit var notary: Party defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'nodes' @ [48:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.internal.ResolveTransactionsFlowTest.setup[LocalVariableDescriptor]

'notaryNode' @ [48:24] ==> public final val notaryNode: MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'info' @ [48:35] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [48:40] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [49:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [49:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [52:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [54:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'stopNodes' @ [54:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [58:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [60:14] ==> public final operator fun component1(): SignedTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [60:20] ==> public final operator fun component2(): SignedTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeTransactions' @ [60:28] ==> private final fun makeTransactions(signFirstTX: Boolean = ..., withAttachment: SecureHash? = ...): Pair<SignedTransaction, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest[SimpleFunctionDescriptorImpl]

'TestFlow' @ [61:17] ==> public constructor TestFlow(txHashes: Set<SecureHash>, otherSide: Party, txCountLimit: Int? = ...) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'setOf' @ [61:26] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'stx2' @ [61:32] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'id' @ [61:37] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'a' @ [61:42] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'info' @ [61:44] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [61:49] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [62:22] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [62:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [62:33] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'p' @ [62:43] ==> val p: ResolveTransactionsFlowTest.TestFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'resultFuture' @ [62:46] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [63:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [63:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [64:23] ==> val future: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'getOrThrow' @ [64:30] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'assertEquals' @ [65:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<SecureHash>, actual: List<SecureHash>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<SecureHash>

'listOf' @ [65:22] ==> public fun <T> listOf(vararg elements: SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'stx1' @ [65:29] ==> val stx1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'id' @ [65:34] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'stx2' @ [65:38] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'id' @ [65:43] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'results' @ [65:48] ==> val results: List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'map' @ [65:56] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> SecureHash

'it' @ [65:62] ==> value-parameter it: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [65:65] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'b' @ [66:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'database' @ [66:11] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [66:20] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [67:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SignedTransaction?, actual: SignedTransaction?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SignedTransaction?

'stx1' @ [67:26] ==> val stx1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'b' @ [67:32] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [67:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [67:43] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [67:65] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx1' @ [67:80] ==> val stx1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'id' @ [67:85] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'assertEquals' @ [68:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SignedTransaction?, actual: SignedTransaction?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SignedTransaction?

'stx2' @ [68:26] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'b' @ [68:32] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [68:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [68:43] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [68:65] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx2' @ [68:80] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from two hashes`[LocalVariableDescriptor]

'id' @ [68:85] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Test' @ [73:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeTransactions' @ [75:19] ==> private final fun makeTransactions(signFirstTX: Boolean = ..., withAttachment: SecureHash? = ...): Pair<SignedTransaction, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest[SimpleFunctionDescriptorImpl]

'second' @ [75:57] ==> public final val second: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'TestFlow' @ [76:17] ==> public constructor TestFlow(txHashes: Set<SecureHash>, otherSide: Party, txCountLimit: Int? = ...) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'setOf' @ [76:26] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'stx' @ [76:32] ==> val stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`dependency with an error`[LocalVariableDescriptor]

'id' @ [76:36] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'a' @ [76:41] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'info' @ [76:43] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [76:48] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [77:22] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [77:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [77:33] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'p' @ [77:43] ==> val p: ResolveTransactionsFlowTest.TestFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.`dependency with an error`[LocalVariableDescriptor]

'resultFuture' @ [77:46] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [78:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [78:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [79:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<SignedTransaction.SignaturesMissingException>, block: () -> Unit): SignedTransaction.SignaturesMissingException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> SignaturesMissingException

'SignaturesMissingException' @ [79:43] ==> public constructor SignaturesMissingException(missing: Set<PublicKey>, descriptions: List<String>, id: SecureHash) defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedClassConstructorDescriptor]

'future' @ [79:80] ==> val future: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`dependency with an error`[LocalVariableDescriptor]

'getOrThrow' @ [79:87] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'Test' @ [82:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [84:14] ==> public final operator fun component1(): SignedTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [84:20] ==> public final operator fun component2(): SignedTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeTransactions' @ [84:28] ==> private final fun makeTransactions(signFirstTX: Boolean = ..., withAttachment: SecureHash? = ...): Pair<SignedTransaction, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest[SimpleFunctionDescriptorImpl]

'TestFlow' @ [85:17] ==> public constructor TestFlow(stx: SignedTransaction, otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'stx2' @ [85:26] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from a signed transaction`[LocalVariableDescriptor]

'a' @ [85:32] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'info' @ [85:34] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [85:39] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [86:22] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [86:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [86:33] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'p' @ [86:43] ==> val p: ResolveTransactionsFlowTest.TestFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from a signed transaction`[LocalVariableDescriptor]

'resultFuture' @ [86:46] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [87:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [87:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [88:9] ==> val future: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from a signed transaction`[LocalVariableDescriptor]

'getOrThrow' @ [88:16] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'b' @ [89:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'database' @ [89:11] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [89:20] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [90:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SignedTransaction?, actual: SignedTransaction?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SignedTransaction?

'stx1' @ [90:26] ==> val stx1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from a signed transaction`[LocalVariableDescriptor]

'b' @ [90:32] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [90:34] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [90:43] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [90:65] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx1' @ [90:80] ==> val stx1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from a signed transaction`[LocalVariableDescriptor]

'id' @ [90:85] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'assertNull' @ [92:13] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'b' @ [92:24] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [92:26] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'validatedTransactions' @ [92:35] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransaction' @ [92:57] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx2' @ [92:72] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`resolve from a signed transaction`[LocalVariableDescriptor]

'id' @ [92:77] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Test' @ [96:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeTransactions' @ [99:20] ==> private final fun makeTransactions(signFirstTX: Boolean = ..., withAttachment: SecureHash? = ...): Pair<SignedTransaction, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest[SimpleFunctionDescriptorImpl]

'second' @ [99:39] ==> public final val second: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'stx2' @ [101:22] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`[LocalVariableDescriptor]

'repeat' @ [102:9] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'count' @ [102:16] ==> val count: Int defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`[LocalVariableDescriptor]

'DummyContract' @ [103:27] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'move' @ [103:41] ==> public final fun move(prior: StateAndRef<DummyContract.SingleOwnerState>, newOwner: AbstractParty): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'cursor' @ [103:46] ==> var cursor: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`[LocalVariableDescriptor]

'tx' @ [103:53] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [103:56] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> SingleOwnerState

'MINI_CORP' @ [103:67] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'megaCorpServices' @ [104:23] ==> public final val megaCorpServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [104:40] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'builder' @ [104:63] ==> val builder: TransactionBuilder defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`.<anonymous>[LocalVariableDescriptor]

'a' @ [105:13] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'database' @ [105:15] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [105:24] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'a' @ [106:17] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [106:19] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'recordTransactions' @ [106:28] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'stx' @ [106:47] ==> val stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`.<anonymous>[LocalVariableDescriptor]

'cursor' @ [108:13] ==> var cursor: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`[LocalVariableDescriptor]

'stx' @ [108:22] ==> val stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`.<anonymous>[LocalVariableDescriptor]

'TestFlow' @ [110:17] ==> public constructor TestFlow(txHashes: Set<SecureHash>, otherSide: Party, txCountLimit: Int? = ...) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'setOf' @ [110:26] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'cursor' @ [110:32] ==> var cursor: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`[LocalVariableDescriptor]

'id' @ [110:39] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'a' @ [110:44] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'info' @ [110:46] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [110:51] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [111:22] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [111:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [111:33] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'p' @ [111:43] ==> val p: ResolveTransactionsFlowTest.TestFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`[LocalVariableDescriptor]

'resultFuture' @ [111:46] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [112:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [112:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [113:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): ResolveTransactionsFlow.ExcessivelyLargeTransactionGraph defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> ExcessivelyLargeTransactionGraph

'future' @ [113:85] ==> val future: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`denial of service check`[LocalVariableDescriptor]

'getOrThrow' @ [113:92] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'Test' @ [116:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeTransactions' @ [118:20] ==> private final fun makeTransactions(signFirstTX: Boolean = ..., withAttachment: SecureHash? = ...): Pair<SignedTransaction, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest[SimpleFunctionDescriptorImpl]

'first' @ [118:39] ==> public final val first: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'DummyContract' @ [120:20] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'move' @ [120:34] ==> public final fun move(prior: StateAndRef<DummyContract.SingleOwnerState>, newOwner: AbstractParty): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'stx1' @ [120:39] ==> val stx1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'tx' @ [120:44] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [120:47] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> SingleOwnerState

'MINI_CORP' @ [120:58] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'run' @ [120:69] ==> @InlineOnly public inline fun <T, R> TransactionBuilder.run(block: TransactionBuilder.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder
    <R> -> SignedTransaction

'megaCorpServices' @ [121:23] ==> public final val megaCorpServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [121:40] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'this' @ [121:63] ==> <this> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`.<anonymous>[ReceiverParameterDescriptorImpl]

'notaryServices' @ [122:13] ==> public final val notaryServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'addSignature' @ [122:28] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [122:41] ==> val ptx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`.<anonymous>[LocalVariableDescriptor]

'DummyContract' @ [125:20] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'move' @ [125:34] ==> public final fun move(priors: List<StateAndRef<DummyContract.SingleOwnerState>>, newOwner: AbstractParty): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'listOf' @ [125:39] ==> public fun <T> listOf(vararg elements: StateAndRef<DummyContract.SingleOwnerState>): List<StateAndRef<DummyContract.SingleOwnerState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<SingleOwnerState>

'stx1' @ [125:46] ==> val stx1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'tx' @ [125:51] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [125:54] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> SingleOwnerState

'stx2' @ [125:65] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'tx' @ [125:70] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [125:73] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> SingleOwnerState

'MINI_CORP' @ [125:85] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'run' @ [125:96] ==> @InlineOnly public inline fun <T, R> TransactionBuilder.run(block: TransactionBuilder.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder
    <R> -> SignedTransaction

'megaCorpServices' @ [126:23] ==> public final val megaCorpServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [126:40] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'this' @ [126:63] ==> <this> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`.<anonymous>[ReceiverParameterDescriptorImpl]

'notaryServices' @ [127:13] ==> public final val notaryServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'addSignature' @ [127:28] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [127:41] ==> val ptx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`.<anonymous>[LocalVariableDescriptor]

'a' @ [130:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'database' @ [130:11] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [130:20] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'a' @ [131:13] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [131:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'recordTransactions' @ [131:24] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'stx2' @ [131:43] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'stx3' @ [131:49] ==> val stx3: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'TestFlow' @ [134:17] ==> public constructor TestFlow(txHashes: Set<SecureHash>, otherSide: Party, txCountLimit: Int? = ...) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'setOf' @ [134:26] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'stx3' @ [134:32] ==> val stx3: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'id' @ [134:37] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'a' @ [134:42] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'info' @ [134:44] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [134:49] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [135:22] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [135:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [135:33] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'p' @ [135:43] ==> val p: ResolveTransactionsFlowTest.TestFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'resultFuture' @ [135:46] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [136:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [136:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [137:9] ==> val future: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlowTest.`triangle of transactions resolves fine`[LocalVariableDescriptor]

'getOrThrow' @ [137:16] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'Test' @ [140:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ByteArrayOutputStream' @ [143:22] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'JarOutputStream' @ [144:23] ==> public constructor JarOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.jar.JarOutputStream[JavaClassConstructorDescriptor]

'bs' @ [144:39] ==> val bs: ByteArrayOutputStream defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment.makeJar[LocalVariableDescriptor]

'jar' @ [145:13] ==> val jar: JarOutputStream defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment.makeJar[LocalVariableDescriptor]

'putNextEntry' @ [145:17] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'JarEntry' @ [145:30] ==> public constructor JarEntry(p0: (String..String?)) defined in java.util.jar.JarEntry[JavaClassConstructorDescriptor]

'jar' @ [146:13] ==> val jar: JarOutputStream defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment.makeJar[LocalVariableDescriptor]

'write' @ [146:17] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'toByteArray' @ [146:40] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'jar' @ [147:13] ==> val jar: JarOutputStream defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment.makeJar[LocalVariableDescriptor]

'closeEntry' @ [147:17] ==> public open fun closeEntry(): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'jar' @ [148:13] ==> val jar: JarOutputStream defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment.makeJar[LocalVariableDescriptor]

'close' @ [148:17] ==> public open fun close(): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'bs' @ [149:20] ==> val bs: ByteArrayOutputStream defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment.makeJar[LocalVariableDescriptor]

'toByteArray' @ [149:23] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'sequence' @ [149:37] ==> public fun ByteArray.sequence(offset: Int = ..., size: Int = ...): ByteSequence defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'open' @ [149:48] ==> public final fun open(): ByteArrayInputStream defined in net.corda.core.utilities.ByteSequence[DeserializedSimpleFunctionDescriptor]

'a' @ [152:18] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'database' @ [152:20] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [152:29] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SecureHash): SecureHash defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'a' @ [153:13] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [153:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'attachments' @ [153:24] ==> public abstract val attachments: AttachmentStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'importAttachment' @ [153:36] ==> public abstract fun importAttachment(jar: InputStream): SecureHash defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'makeJar' @ [153:53] ==> local final fun makeJar(): InputStream defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment[SimpleFunctionDescriptorImpl]

'makeTransactions' @ [155:20] ==> private final fun makeTransactions(signFirstTX: Boolean = ..., withAttachment: SecureHash? = ...): Pair<SignedTransaction, SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest[SimpleFunctionDescriptorImpl]

'id' @ [155:54] ==> val id: SecureHash defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment[LocalVariableDescriptor]

'second' @ [155:58] ==> public final val second: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'TestFlow' @ [156:17] ==> public constructor TestFlow(stx: SignedTransaction, otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'stx2' @ [156:26] ==> val stx2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment[LocalVariableDescriptor]

'a' @ [156:32] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'info' @ [156:34] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [156:39] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'b' @ [157:22] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [157:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [157:33] ==> public open fun <T> startFlow(logic: FlowLogic<List<SignedTransaction>>): FlowStateMachine<List<SignedTransaction>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SignedTransaction>

'p' @ [157:43] ==> val p: ResolveTransactionsFlowTest.TestFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment[LocalVariableDescriptor]

'resultFuture' @ [157:46] ==> public abstract val resultFuture: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [158:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'runNetwork' @ [158:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [159:9] ==> val future: CordaFuture<List<SignedTransaction>> defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment[LocalVariableDescriptor]

'getOrThrow' @ [159:16] ==> public fun <V> Future<List<SignedTransaction>>.getOrThrow(timeout: Duration? = ...): List<SignedTransaction> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<SignedTransaction>

'b' @ [162:9] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'database' @ [162:11] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [162:20] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Attachment): Attachment defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'assertNotNull' @ [163:13] ==> public fun <T : Any> assertNotNull(actual: Attachment?, message: String? = ...): Attachment defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Attachment

'b' @ [163:27] ==> public final lateinit var b: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [163:29] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'attachments' @ [163:38] ==> public abstract val attachments: AttachmentStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'openAttachment' @ [163:50] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'id' @ [163:65] ==> val id: SecureHash defined in net.corda.core.internal.ResolveTransactionsFlowTest.attachment[LocalVariableDescriptor]

'DummyContract' @ [170:41] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [170:55] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'notary' @ [170:74] ==> public final lateinit var notary: Party defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'MEGA_CORP' @ [170:82] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'ref' @ [170:92] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'let' @ [170:100] ==> @InlineOnly public inline fun <T, R> TransactionBuilder.let(block: (TransactionBuilder) -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder
    <R> -> SignedTransaction

'withAttachment' @ [171:17] ==> value-parameter withAttachment: SecureHash? = ... defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[ValueParameterDescriptorImpl]

'it' @ [172:17] ==> value-parameter it: TransactionBuilder defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions.<anonymous>[ValueParameterDescriptorImpl]

'addAttachment' @ [172:20] ==> public final fun addAttachment(attachmentId: SecureHash): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'withAttachment' @ [172:34] ==> value-parameter withAttachment: SecureHash? = ... defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[ValueParameterDescriptorImpl]

'when (signFirstTX) {
                true -> {
                    val ptx = megaCorpServices.signInitialTransaction(it)
                    notaryServices.addSignature(ptx)
                }
                false -> {
                    notaryServices.signInitialTransaction(it)
                }
            }' @ [173:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SignedTransaction, entry1: SignedTransaction): SignedTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SignedTransaction

'signFirstTX' @ [173:19] ==> value-parameter signFirstTX: Boolean = ... defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[ValueParameterDescriptorImpl]

'megaCorpServices' @ [175:31] ==> public final val megaCorpServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [175:48] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'it' @ [175:71] ==> value-parameter it: TransactionBuilder defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions.<anonymous>[ValueParameterDescriptorImpl]

'notaryServices' @ [176:21] ==> public final val notaryServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'addSignature' @ [176:36] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [176:49] ==> val ptx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions.<anonymous>[LocalVariableDescriptor]

'notaryServices' @ [179:21] ==> public final val notaryServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [179:36] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'it' @ [179:59] ==> value-parameter it: TransactionBuilder defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions.<anonymous>[ValueParameterDescriptorImpl]

'DummyContract' @ [183:41] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'move' @ [183:55] ==> public final fun move(prior: StateAndRef<DummyContract.SingleOwnerState>, newOwner: AbstractParty): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'dummy1' @ [183:60] ==> val dummy1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[LocalVariableDescriptor]

'tx' @ [183:67] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [183:70] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<DummyContract.SingleOwnerState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> SingleOwnerState

'MINI_CORP' @ [183:81] ==> public val MINI_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'let' @ [183:92] ==> @InlineOnly public inline fun <T, R> TransactionBuilder.let(block: (TransactionBuilder) -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionBuilder
    <R> -> SignedTransaction

'megaCorpServices' @ [184:23] ==> public final val megaCorpServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'signInitialTransaction' @ [184:40] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'it' @ [184:63] ==> value-parameter it: TransactionBuilder defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions.<anonymous>[ValueParameterDescriptorImpl]

'notaryServices' @ [185:13] ==> public final val notaryServices: MockServices defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'addSignature' @ [185:28] ==> public open fun addSignature(signedTransaction: SignedTransaction): SignedTransaction defined in net.corda.testing.node.MockServices[DeserializedSimpleFunctionDescriptor]

'ptx' @ [185:41] ==> val ptx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions.<anonymous>[LocalVariableDescriptor]

'a' @ [187:9] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'database' @ [187:11] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [187:20] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'a' @ [188:13] ==> public final lateinit var a: MockNetwork.MockNode defined in net.corda.core.internal.ResolveTransactionsFlowTest[PropertyDescriptorImpl]

'services' @ [188:15] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'recordTransactions' @ [188:24] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'dummy1' @ [188:43] ==> val dummy1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[LocalVariableDescriptor]

'dummy2' @ [188:51] ==> val dummy2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[LocalVariableDescriptor]

'Pair' @ [190:16] ==> public constructor Pair<out A, out B>(first: SignedTransaction, second: SignedTransaction) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SignedTransaction
    <out B> -> SignedTransaction

'dummy1' @ [190:21] ==> val dummy1: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[LocalVariableDescriptor]

'dummy2' @ [190:29] ==> val dummy2: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.makeTransactions[LocalVariableDescriptor]

'InitiatingFlow' @ [194:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<List<SignedTransaction>>' @ [195:131] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> List<SignedTransaction>

'this' @ [196:95] ==> public constructor TestFlow(resolveTransactionsFlow: ResolveTransactionsFlow, txCountLimit: Int? = ...) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'ResolveTransactionsFlow' @ [196:100] ==> public constructor ResolveTransactionsFlow(txHashes: Set<SecureHash>, otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlow[DeserializedClassConstructorDescriptor]

'txHashes' @ [196:124] ==> value-parameter txHashes: Set<SecureHash> defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow.<init>[ValueParameterDescriptorImpl]

'otherSide' @ [196:134] ==> value-parameter otherSide: Party defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow.<init>[ValueParameterDescriptorImpl]

'txCountLimit' @ [196:161] ==> value-parameter txCountLimit: Int? = ... defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow.<init>[ValueParameterDescriptorImpl]

'this' @ [197:65] ==> public constructor TestFlow(resolveTransactionsFlow: ResolveTransactionsFlow, txCountLimit: Int? = ...) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'ResolveTransactionsFlow' @ [197:70] ==> public constructor ResolveTransactionsFlow(signedTransaction: SignedTransaction, otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlow[DeserializedClassConstructorDescriptor]

'stx' @ [197:94] ==> value-parameter stx: SignedTransaction defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow.<init>[ValueParameterDescriptorImpl]

'otherSide' @ [197:99] ==> value-parameter otherSide: Party defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [199:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'txCountLimit' @ [201:13] ==> private final val txCountLimit: Int? defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[PropertyDescriptorImpl]

'let' @ [201:27] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Unit

'resolveTransactionsFlow' @ [201:33] ==> private final val resolveTransactionsFlow: ResolveTransactionsFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[PropertyDescriptorImpl]

'transactionCountLimit' @ [201:57] ==> public final var transactionCountLimit: Int defined in net.corda.core.internal.ResolveTransactionsFlow[DeserializedPropertyDescriptor]

'it' @ [201:81] ==> value-parameter it: Int defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'subFlow' @ [202:20] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'resolveTransactionsFlow' @ [202:28] ==> private final val resolveTransactionsFlow: ResolveTransactionsFlow defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[PropertyDescriptorImpl]

'InitiatedBy' @ [206:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'TestFlow' @ [206:18] ==> public constructor TestFlow(stx: SignedTransaction, otherSide: Party) defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestFlow[ClassConstructorDescriptorImpl]

'FlowLogic<Void?>' @ [207:60] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Void?

'Suspendable' @ [208:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [209:31] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestResponseFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'TestDataVendingFlow' @ [209:39] ==> public constructor TestDataVendingFlow(otherSide: Party) defined in net.corda.core.flows.TestDataVendingFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [209:59] ==> public final val otherSide: Party defined in net.corda.core.internal.ResolveTransactionsFlowTest.TestResponseFlow[PropertyDescriptorImpl]

