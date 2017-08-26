'Before' @ [35:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [37:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'MockNetwork' @ [37:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'notaryNode' @ [38:9] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'mockNet' @ [38:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'createNode' @ [38:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [39:29] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [39:42] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'arrayOf' @ [40:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [40:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [40:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [40:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'ServiceInfo' @ [40:84] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [40:96] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [40:116] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'clientNode' @ [41:9] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'mockNet' @ [41:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'createNode' @ [41:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [41:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'network' @ [41:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [41:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [42:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [42:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [45:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [47:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'stopNodes' @ [47:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [50:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'run' @ [52:19] ==> @InlineOnly public inline fun <T, R> NotaryServiceTests.run(block: NotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryServiceTests
    <R> -> SignedTransaction

'issueState' @ [53:30] ==> public final fun issueState(node: AbstractNode): StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'clientNode' @ [53:41] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'TransactionBuilder' @ [54:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [54:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'info' @ [54:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [54:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addInputState' @ [55:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [55:36] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction with a valid time-window`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [56:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [56:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clientNode' @ [56:46] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [56:57] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [56:66] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'setTimeWindow' @ [57:22] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'now' @ [57:44] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'seconds' @ [57:54] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'clientNode' @ [58:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [58:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [58:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [58:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction with a valid time-window`.<anonymous>[LocalVariableDescriptor]

'runNotaryClient' @ [61:22] ==> private final fun runNotaryClient(stx: SignedTransaction): CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'stx' @ [61:38] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction with a valid time-window`[LocalVariableDescriptor]

'future' @ [62:26] ==> val future: CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction with a valid time-window`[LocalVariableDescriptor]

'getOrThrow' @ [62:33] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'signatures' @ [63:9] ==> val signatures: List<TransactionSignature> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction with a valid time-window`[LocalVariableDescriptor]

'forEach' @ [63:20] ==> @HidesMembers public inline fun <T> Iterable<TransactionSignature>.forEach(action: (TransactionSignature) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'it' @ [63:30] ==> value-parameter it: TransactionSignature defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction with a valid time-window`.<anonymous>[ValueParameterDescriptorImpl]

'verify' @ [63:33] ==> public final fun verify(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[DeserializedSimpleFunctionDescriptor]

'stx' @ [63:40] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction with a valid time-window`[LocalVariableDescriptor]

'id' @ [63:44] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Test' @ [66:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'run' @ [68:19] ==> @InlineOnly public inline fun <T, R> NotaryServiceTests.run(block: NotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryServiceTests
    <R> -> SignedTransaction

'issueState' @ [69:30] ==> public final fun issueState(node: AbstractNode): StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'clientNode' @ [69:41] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'TransactionBuilder' @ [70:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [70:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'info' @ [70:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [70:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addInputState' @ [71:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [71:36] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction without a time-window`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [72:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [72:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clientNode' @ [72:46] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [72:57] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [72:66] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'clientNode' @ [73:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [73:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [73:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [73:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction without a time-window`.<anonymous>[LocalVariableDescriptor]

'runNotaryClient' @ [76:22] ==> private final fun runNotaryClient(stx: SignedTransaction): CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'stx' @ [76:38] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction without a time-window`[LocalVariableDescriptor]

'future' @ [77:26] ==> val future: CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction without a time-window`[LocalVariableDescriptor]

'getOrThrow' @ [77:33] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'signatures' @ [78:9] ==> val signatures: List<TransactionSignature> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction without a time-window`[LocalVariableDescriptor]

'forEach' @ [78:20] ==> @HidesMembers public inline fun <T> Iterable<TransactionSignature>.forEach(action: (TransactionSignature) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'it' @ [78:30] ==> value-parameter it: TransactionSignature defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction without a time-window`.<anonymous>[ValueParameterDescriptorImpl]

'verify' @ [78:33] ==> public final fun verify(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[DeserializedSimpleFunctionDescriptor]

'stx' @ [78:40] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign a unique transaction without a time-window`[LocalVariableDescriptor]

'id' @ [78:44] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Test' @ [81:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'run' @ [83:19] ==> @InlineOnly public inline fun <T, R> NotaryServiceTests.run(block: NotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryServiceTests
    <R> -> SignedTransaction

'issueState' @ [84:30] ==> public final fun issueState(node: AbstractNode): StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'clientNode' @ [84:41] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'TransactionBuilder' @ [85:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [85:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'info' @ [85:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [85:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addInputState' @ [86:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [86:36] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests.`should report error for transaction with an invalid time-window`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [87:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [87:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clientNode' @ [87:46] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [87:57] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [87:66] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'setTimeWindow' @ [88:22] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'now' @ [88:44] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'plusSeconds' @ [88:50] ==> public open fun plusSeconds(p0: Long): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'seconds' @ [88:72] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'clientNode' @ [89:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [89:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [89:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [89:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.`should report error for transaction with an invalid time-window`.<anonymous>[LocalVariableDescriptor]

'runNotaryClient' @ [92:22] ==> private final fun runNotaryClient(stx: SignedTransaction): CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'stx' @ [92:38] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should report error for transaction with an invalid time-window`[LocalVariableDescriptor]

'assertFailsWith' @ [94:18] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<NotaryException>, block: () -> Unit): NotaryException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> NotaryException

'NotaryException' @ [94:34] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'future' @ [94:60] ==> val future: CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests.`should report error for transaction with an invalid time-window`[LocalVariableDescriptor]

'getOrThrow' @ [94:67] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'assertThat' @ [95:9] ==> @CheckReturnValue public open fun <T : (Any..Any?)> assertThat(p0: (NotaryError..NotaryError?)): (AbstractObjectAssert<*, (NotaryError..NotaryError?)>..AbstractObjectAssert<*, (NotaryError..NotaryError?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NotaryError

'ex' @ [95:20] ==> val ex: NotaryException defined in net.corda.node.services.transactions.NotaryServiceTests.`should report error for transaction with an invalid time-window`[LocalVariableDescriptor]

'error' @ [95:23] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[DeserializedPropertyDescriptor]

'isInstanceOf' @ [95:30] ==> public open fun isInstanceOf(p0: (Class<*>..Class<*>?)): (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>..AbstractObjectAssert<out (AbstractObjectAssert<out Any?, out Any?>..AbstractObjectAssert<out Any?, out Any?>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>?), (NotaryError..NotaryError?)>?) defined in org.assertj.core.api.AbstractObjectAssert[JavaMethodDescriptor]

'TimeWindowInvalid' @ [95:55] ==> public object TimeWindowInvalid : NotaryError defined in net.corda.core.flows.NotaryError[FakeCallableDescriptorForObject]

'java' @ [95:80] ==> public val <T> KClass<NotaryError.TimeWindowInvalid>.java: Class<NotaryError.TimeWindowInvalid> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TimeWindowInvalid

'Test' @ [98:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'run' @ [100:19] ==> @InlineOnly public inline fun <T, R> NotaryServiceTests.run(block: NotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryServiceTests
    <R> -> SignedTransaction

'issueState' @ [101:30] ==> public final fun issueState(node: AbstractNode): StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'clientNode' @ [101:41] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'TransactionBuilder' @ [102:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [102:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'info' @ [102:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [102:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addInputState' @ [103:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [103:36] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [104:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [104:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clientNode' @ [104:46] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [104:57] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [104:66] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'clientNode' @ [105:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [105:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [105:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [105:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`.<anonymous>[LocalVariableDescriptor]

'NotaryFlow' @ [108:28] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [108:39] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[DeserializedClassConstructorDescriptor]

'stx' @ [108:46] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`[LocalVariableDescriptor]

'NotaryFlow' @ [109:29] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [109:40] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[DeserializedClassConstructorDescriptor]

'stx' @ [109:47] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`[LocalVariableDescriptor]

'clientNode' @ [110:18] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [110:29] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [110:38] ==> public open fun <T> startFlow(logic: FlowLogic<List<TransactionSignature>>): FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TransactionSignature>

'firstAttempt' @ [110:48] ==> val firstAttempt: NotaryFlow.Client defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`[LocalVariableDescriptor]

'clientNode' @ [111:18] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [111:29] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [111:38] ==> public open fun <T> startFlow(logic: FlowLogic<List<TransactionSignature>>): FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TransactionSignature>

'secondAttempt' @ [111:48] ==> val secondAttempt: NotaryFlow.Client defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`[LocalVariableDescriptor]

'mockNet' @ [113:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [113:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [115:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<TransactionSignature>, actual: List<TransactionSignature>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<TransactionSignature>

'f1' @ [115:22] ==> val f1: FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`[LocalVariableDescriptor]

'resultFuture' @ [115:25] ==> public abstract val resultFuture: CordaFuture<List<TransactionSignature>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [115:38] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'f2' @ [115:52] ==> val f2: FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests.`should sign identical transaction multiple times (signing is idempotent)`[LocalVariableDescriptor]

'resultFuture' @ [115:55] ==> public abstract val resultFuture: CordaFuture<List<TransactionSignature>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [115:68] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'Test' @ [118:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'issueState' @ [120:26] ==> public final fun issueState(node: AbstractNode): StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'clientNode' @ [120:37] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'run' @ [121:19] ==> @InlineOnly public inline fun <T, R> NotaryServiceTests.run(block: NotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryServiceTests
    <R> -> SignedTransaction

'TransactionBuilder' @ [122:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [122:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'info' @ [122:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [122:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addInputState' @ [123:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [123:36] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'addCommand' @ [124:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [124:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clientNode' @ [124:46] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [124:57] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [124:66] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'clientNode' @ [125:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [125:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [125:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [125:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`.<anonymous>[LocalVariableDescriptor]

'run' @ [127:20] ==> @InlineOnly public inline fun <T, R> NotaryServiceTests.run(block: NotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryServiceTests
    <R> -> SignedTransaction

'TransactionBuilder' @ [128:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [128:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'info' @ [128:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [128:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addInputState' @ [129:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [129:36] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'addInputState' @ [130:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'issueState' @ [130:36] ==> public final fun issueState(node: AbstractNode): StateAndRef<*> defined in net.corda.node.services.transactions.NotaryServiceTests[SimpleFunctionDescriptorImpl]

'clientNode' @ [130:47] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'addCommand' @ [131:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [131:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clientNode' @ [131:46] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [131:57] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [131:66] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'clientNode' @ [132:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [132:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [132:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [132:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`.<anonymous>[LocalVariableDescriptor]

'NotaryFlow' @ [135:26] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [135:37] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[DeserializedClassConstructorDescriptor]

'stx' @ [135:44] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'NotaryFlow' @ [136:27] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [136:38] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[DeserializedClassConstructorDescriptor]

'stx2' @ [136:45] ==> val stx2: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'clientNode' @ [137:9] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [137:20] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [137:29] ==> public open fun <T> startFlow(logic: FlowLogic<List<TransactionSignature>>): FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TransactionSignature>

'firstSpend' @ [137:39] ==> val firstSpend: NotaryFlow.Client defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'clientNode' @ [138:22] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [138:33] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [138:42] ==> public open fun <T> startFlow(logic: FlowLogic<List<TransactionSignature>>): FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TransactionSignature>

'secondSpend' @ [138:52] ==> val secondSpend: NotaryFlow.Client defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'mockNet' @ [140:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [140:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [142:18] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<NotaryException>, block: () -> Unit): NotaryException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> NotaryException

'NotaryException' @ [142:34] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'future' @ [142:60] ==> val future: FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'resultFuture' @ [142:67] ==> public abstract val resultFuture: CordaFuture<List<TransactionSignature>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [142:80] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'ex' @ [143:27] ==> val ex: NotaryException defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'error' @ [143:30] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[DeserializedPropertyDescriptor]

'assertEquals' @ [144:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'notaryError' @ [144:22] ==> val notaryError: NotaryError.Conflict defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'txId' @ [144:34] ==> public final val txId: SecureHash defined in net.corda.core.flows.NotaryError.Conflict[DeserializedPropertyDescriptor]

'stx2' @ [144:40] ==> val stx2: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'id' @ [144:45] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'notaryError' @ [145:9] ==> val notaryError: NotaryError.Conflict defined in net.corda.node.services.transactions.NotaryServiceTests.`should report conflict when inputs are reused across transactions`[LocalVariableDescriptor]

'conflict' @ [145:21] ==> public final val conflict: SignedData<UniquenessProvider.Conflict> defined in net.corda.core.flows.NotaryError.Conflict[DeserializedPropertyDescriptor]

'verified' @ [145:30] ==> public final fun verified(): UniquenessProvider.Conflict defined in net.corda.core.crypto.SignedData[DeserializedSimpleFunctionDescriptor]

'NotaryFlow' @ [149:20] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [149:31] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[DeserializedClassConstructorDescriptor]

'stx' @ [149:38] ==> value-parameter stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.runNotaryClient[ValueParameterDescriptorImpl]

'clientNode' @ [150:22] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [150:33] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [150:42] ==> public open fun <T> startFlow(logic: FlowLogic<List<TransactionSignature>>): FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TransactionSignature>

'flow' @ [150:52] ==> val flow: NotaryFlow.Client defined in net.corda.node.services.transactions.NotaryServiceTests.runNotaryClient[LocalVariableDescriptor]

'resultFuture' @ [150:58] ==> public abstract val resultFuture: CordaFuture<List<TransactionSignature>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [151:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [151:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [152:16] ==> val future: CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.NotaryServiceTests.runNotaryClient[LocalVariableDescriptor]

'DummyContract' @ [156:18] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [156:32] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'Random' @ [156:48] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'nextInt' @ [156:57] ==> public open fun nextInt(): Int defined in java.util.Random[JavaMethodDescriptor]

'notaryNode' @ [156:68] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'info' @ [156:79] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [156:84] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node' @ [156:100] ==> value-parameter node: AbstractNode defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[ValueParameterDescriptorImpl]

'info' @ [156:105] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [156:110] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [156:124] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'node' @ [157:28] ==> value-parameter node: AbstractNode defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[ValueParameterDescriptorImpl]

'services' @ [157:33] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [157:42] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [157:65] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[LocalVariableDescriptor]

'notaryNode' @ [158:19] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [158:30] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addSignature' @ [158:39] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'signedByNode' @ [158:52] ==> val signedByNode: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[LocalVariableDescriptor]

'notaryNode' @ [158:66] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.NotaryServiceTests[PropertyDescriptorImpl]

'services' @ [158:77] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentityKey' @ [158:86] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'node' @ [159:9] ==> value-parameter node: AbstractNode defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[ValueParameterDescriptorImpl]

'services' @ [159:14] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[DeserializedPropertyDescriptor]

'recordTransactions' @ [159:23] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'stx' @ [159:42] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[LocalVariableDescriptor]

'StateAndRef' @ [160:16] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'tx' @ [160:28] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[LocalVariableDescriptor]

'outputStates' @ [160:31] ==> public final fun outputStates(): List<TransactionState<*>> defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'first' @ [160:46] ==> public fun <T> List<TransactionState<*>>.first(): TransactionState<*> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<*>

'StateRef' @ [160:55] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'stx' @ [160:64] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.NotaryServiceTests.issueState[LocalVariableDescriptor]

'id' @ [160:68] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

