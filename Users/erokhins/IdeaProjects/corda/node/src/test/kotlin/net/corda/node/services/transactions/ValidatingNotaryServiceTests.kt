'Before' @ [36:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [38:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'MockNetwork' @ [38:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'notaryNode' @ [39:9] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'mockNet' @ [39:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'createNode' @ [39:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [40:29] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [40:42] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'arrayOf' @ [41:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [41:47] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [41:59] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [41:77] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'ServiceInfo' @ [41:84] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'ValidatingNotaryService' @ [41:96] ==> public companion object defined in net.corda.node.services.transactions.ValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [41:120] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.ValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'clientNode' @ [43:9] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'mockNet' @ [43:22] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'createNode' @ [43:30] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'notaryNode' @ [43:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'network' @ [43:52] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [43:60] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [44:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [44:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [47:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [49:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'stopNodes' @ [49:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'Test' @ [52:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'run' @ [54:19] ==> @InlineOnly public inline fun <T, R> ValidatingNotaryServiceTests.run(block: ValidatingNotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValidatingNotaryServiceTests
    <R> -> SignedTransaction

'issueInvalidState' @ [55:30] ==> public fun issueInvalidState(node: AbstractNode, notary: Party): StateAndRef<*> defined in net.corda.node.services in file NotaryChangeTests.kt[SimpleFunctionDescriptorImpl]

'clientNode' @ [55:48] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'notaryNode' @ [55:60] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'info' @ [55:71] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [55:76] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [56:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [56:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'info' @ [56:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [56:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'addInputState' @ [57:22] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [57:36] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for invalid transaction dependency`.<anonymous>[LocalVariableDescriptor]

'addCommand' @ [58:22] ==> public final fun addCommand(arg: Command<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'dummyCommand' @ [58:33] ==> public fun dummyCommand(vararg signers: PublicKey = ...): Command<TypeOnlyCommandData> defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clientNode' @ [58:46] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'services' @ [58:57] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [58:66] ==> public open val legalIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'clientNode' @ [59:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'services' @ [59:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [59:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [59:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for invalid transaction dependency`.<anonymous>[LocalVariableDescriptor]

'runClient' @ [62:22] ==> private final fun runClient(stx: SignedTransaction): CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[SimpleFunctionDescriptorImpl]

'stx' @ [62:32] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for invalid transaction dependency`[LocalVariableDescriptor]

'assertFailsWith' @ [64:18] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<NotaryException>, block: () -> Unit): NotaryException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> NotaryException

'NotaryException' @ [64:34] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'future' @ [64:60] ==> val future: CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for invalid transaction dependency`[LocalVariableDescriptor]

'getOrThrow' @ [64:67] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'ex' @ [65:27] ==> val ex: NotaryException defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for invalid transaction dependency`[LocalVariableDescriptor]

'error' @ [65:30] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[DeserializedPropertyDescriptor]

'assertThat' @ [66:9] ==> @CheckReturnValue public open fun assertThat(p0: (Throwable..Throwable?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'notaryError' @ [66:20] ==> val notaryError: NotaryError.TransactionInvalid defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for invalid transaction dependency`[LocalVariableDescriptor]

'cause' @ [66:32] ==> public final val cause: Throwable defined in net.corda.core.flows.NotaryError.TransactionInvalid[DeserializedPropertyDescriptor]

'isInstanceOf' @ [66:39] ==> public open fun isInstanceOf(p0: (Class<*>..Class<*>?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'SignaturesMissingException' @ [66:70] ==> public constructor SignaturesMissingException(missing: Set<PublicKey>, descriptions: List<String>, id: SecureHash) defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedClassConstructorDescriptor]

'java' @ [66:104] ==> public val <T> KClass<SignedTransaction.SignaturesMissingException>.java: Class<SignedTransaction.SignaturesMissingException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SignaturesMissingException

'Test' @ [69:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'MEGA_CORP_KEY' @ [71:34] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'public' @ [71:48] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'run' @ [72:19] ==> @InlineOnly public inline fun <T, R> ValidatingNotaryServiceTests.run(block: ValidatingNotaryServiceTests.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValidatingNotaryServiceTests
    <R> -> SignedTransaction

'issueState' @ [73:30] ==> public final fun issueState(node: AbstractNode): StateAndRef<*> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[SimpleFunctionDescriptorImpl]

'clientNode' @ [73:41] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'Command' @ [75:27] ==> public constructor Command<T : CommandData>(data: DummyContract.Commands.Move, key: PublicKey) defined in net.corda.core.contracts.Command[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : CommandData> -> Move

'DummyContract' @ [75:35] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'Move' @ [75:58] ==> public constructor Move() defined in net.corda.testing.contracts.DummyContract.Commands.Move[DeserializedClassConstructorDescriptor]

'expectedMissingKey' @ [75:66] ==> val expectedMissingKey: (PublicKey..PublicKey?) defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`[LocalVariableDescriptor]

'TransactionBuilder' @ [76:22] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notaryNode' @ [76:41] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'info' @ [76:52] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [76:57] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'withItems' @ [76:73] ==> public final fun withItems(vararg items: Any): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'inputState' @ [76:83] ==> val inputState: StateAndRef<*> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`.<anonymous>[LocalVariableDescriptor]

'command' @ [76:95] ==> val command: Command<DummyContract.Commands.Move> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`.<anonymous>[LocalVariableDescriptor]

'clientNode' @ [77:13] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'services' @ [77:24] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [77:33] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [77:56] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`.<anonymous>[LocalVariableDescriptor]

'assertFailsWith' @ [80:18] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<NotaryException>, block: () -> Unit): NotaryException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> NotaryException

'NotaryException' @ [80:34] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'runClient' @ [81:26] ==> private final fun runClient(stx: SignedTransaction): CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[SimpleFunctionDescriptorImpl]

'stx' @ [81:36] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`[LocalVariableDescriptor]

'future' @ [82:13] ==> val future: CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [82:20] ==> public fun <V> Future<List<TransactionSignature>>.getOrThrow(timeout: Duration? = ...): List<TransactionSignature> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<TransactionSignature>

'ex' @ [84:27] ==> val ex: NotaryException defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`[LocalVariableDescriptor]

'error' @ [84:30] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[DeserializedPropertyDescriptor]

'assertThat' @ [85:9] ==> @CheckReturnValue public open fun assertThat(p0: (Throwable..Throwable?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[JavaMethodDescriptor]

'notaryError' @ [85:20] ==> val notaryError: NotaryError.TransactionInvalid defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`[LocalVariableDescriptor]

'cause' @ [85:32] ==> public final val cause: Throwable defined in net.corda.core.flows.NotaryError.TransactionInvalid[DeserializedPropertyDescriptor]

'isInstanceOf' @ [85:39] ==> public open fun isInstanceOf(p0: (Class<*>..Class<*>?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'SignaturesMissingException' @ [85:70] ==> public constructor SignaturesMissingException(missing: Set<PublicKey>, descriptions: List<String>, id: SecureHash) defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedClassConstructorDescriptor]

'java' @ [85:104] ==> public val <T> KClass<SignedTransaction.SignaturesMissingException>.java: Class<SignedTransaction.SignaturesMissingException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SignaturesMissingException

'notaryError' @ [87:28] ==> val notaryError: NotaryError.TransactionInvalid defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`[LocalVariableDescriptor]

'cause' @ [87:40] ==> public final val cause: Throwable defined in net.corda.core.flows.NotaryError.TransactionInvalid[DeserializedPropertyDescriptor]

'missing' @ [87:95] ==> public final val missing: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[DeserializedPropertyDescriptor]

'assertEquals' @ [88:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<(PublicKey..PublicKey?)>, actual: Set<(PublicKey..PublicKey?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<(java.security.PublicKey..java.security.PublicKey?)>

'setOf' @ [88:22] ==> public fun <T> setOf(element: (PublicKey..PublicKey?)): Set<(PublicKey..PublicKey?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.PublicKey..java.security.PublicKey?)

'expectedMissingKey' @ [88:28] ==> val expectedMissingKey: (PublicKey..PublicKey?) defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`[LocalVariableDescriptor]

'missingKeys' @ [88:49] ==> val missingKeys: Set<PublicKey> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.`should report error for missing signatures`[LocalVariableDescriptor]

'NotaryFlow' @ [92:20] ==> public object NotaryFlow defined in net.corda.core.flows[FakeCallableDescriptorForObject]

'Client' @ [92:31] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[DeserializedClassConstructorDescriptor]

'stx' @ [92:38] ==> value-parameter stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.runClient[ValueParameterDescriptorImpl]

'clientNode' @ [93:22] ==> public final lateinit var clientNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'services' @ [93:33] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [93:42] ==> public open fun <T> startFlow(logic: FlowLogic<List<TransactionSignature>>): FlowStateMachine<List<TransactionSignature>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TransactionSignature>

'flow' @ [93:52] ==> val flow: NotaryFlow.Client defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.runClient[LocalVariableDescriptor]

'resultFuture' @ [93:58] ==> public abstract val resultFuture: CordaFuture<List<TransactionSignature>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'mockNet' @ [94:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'runNetwork' @ [94:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'future' @ [95:16] ==> val future: CordaFuture<List<TransactionSignature>> defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.runClient[LocalVariableDescriptor]

'DummyContract' @ [99:18] ==> public companion object defined in net.corda.testing.contracts.DummyContract[FakeCallableDescriptorForObject]

'generateInitial' @ [99:32] ==> @JvmStatic public final fun generateInitial(magicNumber: Int, notary: Party, owner: PartyAndReference, vararg otherOwners: PartyAndReference): TransactionBuilder defined in net.corda.testing.contracts.DummyContract.Companion[DeserializedSimpleFunctionDescriptor]

'Random' @ [99:48] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'nextInt' @ [99:57] ==> public open fun nextInt(): Int defined in java.util.Random[JavaMethodDescriptor]

'notaryNode' @ [99:68] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'info' @ [99:79] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentity' @ [99:84] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'node' @ [99:100] ==> value-parameter node: AbstractNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[ValueParameterDescriptorImpl]

'info' @ [99:105] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.AbstractNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [99:110] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [99:124] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'node' @ [100:28] ==> value-parameter node: AbstractNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[ValueParameterDescriptorImpl]

'services' @ [100:33] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [100:42] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'tx' @ [100:65] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[LocalVariableDescriptor]

'notaryNode' @ [101:19] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'services' @ [101:30] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addSignature' @ [101:39] ==> public open fun addSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): SignedTransaction defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'signedByNode' @ [101:52] ==> val signedByNode: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[LocalVariableDescriptor]

'notaryNode' @ [101:66] ==> public final lateinit var notaryNode: MockNetwork.MockNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests[PropertyDescriptorImpl]

'services' @ [101:77] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'notaryIdentityKey' @ [101:86] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'node' @ [102:9] ==> value-parameter node: AbstractNode defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[ValueParameterDescriptorImpl]

'services' @ [102:14] ==> public final val services: ServiceHubInternal defined in net.corda.node.internal.AbstractNode[DeserializedPropertyDescriptor]

'recordTransactions' @ [102:23] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]

'stx' @ [102:42] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[LocalVariableDescriptor]

'StateAndRef' @ [103:16] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'tx' @ [103:28] ==> val tx: TransactionBuilder defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[LocalVariableDescriptor]

'outputStates' @ [103:31] ==> public final fun outputStates(): List<TransactionState<*>> defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'first' @ [103:46] ==> public fun <T> List<TransactionState<*>>.first(): TransactionState<*> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<*>

'StateRef' @ [103:55] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'stx' @ [103:64] ==> val stx: SignedTransaction defined in net.corda.node.services.transactions.ValidatingNotaryServiceTests.issueState[LocalVariableDescriptor]

'id' @ [103:68] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

