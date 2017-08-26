'InitiatingFlow' @ [33:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[ClassConstructorDescriptorImpl]

'FlowLogic<List<TransactionSignature>>' @ [35:72] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> List<TransactionSignature>

'this' @ [36:47] ==> public constructor Client(stx: SignedTransaction, progressTracker: ProgressTracker) defined in net.corda.core.flows.NotaryFlow.Client[ClassConstructorDescriptorImpl]

'stx' @ [36:52] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client.<init>[ValueParameterDescriptorImpl]

'tracker' @ [36:57] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.NotaryFlow.Client.Companion[SimpleFunctionDescriptorImpl]

'ProgressTracker.Step' @ [39:33] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker.Step' @ [40:33] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [42:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'REQUESTING' @ [42:45] ==> public object REQUESTING : ProgressTracker.Step defined in net.corda.core.flows.NotaryFlow.Client.Companion[FakeCallableDescriptorForObject]

'VALIDATING' @ [42:57] ==> public object VALIDATING : ProgressTracker.Step defined in net.corda.core.flows.NotaryFlow.Client.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [47:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [48:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotaryException' @ [48:17] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[ClassConstructorDescriptorImpl]

'progressTracker' @ [50:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'currentStep' @ [50:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'REQUESTING' @ [50:43] ==> public object REQUESTING : ProgressTracker.Step defined in net.corda.core.flows.NotaryFlow.Client.Companion[FakeCallableDescriptorForObject]

'notaryParty' @ [52:13] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'stx' @ [52:27] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'notary' @ [52:31] ==> public final val notary: Party? defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'IllegalStateException' @ [52:47] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'check' @ [53:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'stx' @ [53:19] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'inputs' @ [53:23] ==> public final val inputs: List<StateRef> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'all' @ [53:30] ==> public inline fun <T> Iterable<StateRef>.all(predicate: (StateRef) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'serviceHub' @ [53:48] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'loadState' @ [53:59] ==> @Throws public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'stateRef' @ [53:69] ==> value-parameter stateRef: StateRef defined in net.corda.core.flows.NotaryFlow.Client.call.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [53:79] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'notaryParty' @ [53:89] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'if (stx.isNotaryChangeTransaction()) {
                    stx.resolveNotaryChangeTransaction(serviceHub).verifySignaturesExcept(notaryParty.owningKey)
                } else {
                    stx.verifySignaturesExcept(notaryParty.owningKey)
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'stx' @ [58:21] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'isNotaryChangeTransaction' @ [58:25] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [59:21] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'resolveNotaryChangeTransaction' @ [59:25] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [59:56] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'verifySignaturesExcept' @ [59:68] ==> @Throws public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[SimpleFunctionDescriptorImpl]

'notaryParty' @ [59:91] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'owningKey' @ [59:103] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'stx' @ [61:21] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'verifySignaturesExcept' @ [61:25] ==> @Throws public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'notaryParty' @ [61:48] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'owningKey' @ [61:60] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'NotaryException' @ [64:23] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[ClassConstructorDescriptorImpl]

'TransactionInvalid' @ [64:51] ==> public constructor TransactionInvalid(cause: Throwable) defined in net.corda.core.flows.NotaryError.TransactionInvalid[ClassConstructorDescriptorImpl]

'ex' @ [64:70] ==> val ex: SignatureException defined in net.corda.core.flows.NotaryFlow.Client.call[LocalVariableDescriptor]

'if (serviceHub.networkMapCache.isValidatingNotary(notaryParty)) {
                    subFlow(SendTransactionWithRetry(notaryParty, stx))
                    receive<List<TransactionSignature>>(notaryParty)
                } else {
                    val tx: Any = if (stx.isNotaryChangeTransaction()) {
                        stx.notaryChangeTx
                    } else {
                        stx.tx.buildFilteredTransaction(Predicate { it is StateRef || it is TimeWindow })
                    }
                    sendAndReceiveWithRetry(notaryParty, tx)
                }' @ [68:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UntrustworthyData<List<TransactionSignature>>, elseBranch: UntrustworthyData<List<TransactionSignature>>): UntrustworthyData<List<TransactionSignature>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UntrustworthyData<List<TransactionSignature>>

'serviceHub' @ [68:21] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'networkMapCache' @ [68:32] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'isValidatingNotary' @ [68:48] ==> public open fun isValidatingNotary(party: Party): Boolean defined in net.corda.core.node.services.NetworkMapCache[SimpleFunctionDescriptorImpl]

'notaryParty' @ [68:67] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'subFlow' @ [69:21] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.core.flows.NotaryFlow.Client[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Void?

'SendTransactionWithRetry' @ [69:29] ==> public constructor SendTransactionWithRetry(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionWithRetry[ClassConstructorDescriptorImpl]

'notaryParty' @ [69:54] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'stx' @ [69:67] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'receive' @ [70:21] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<List<TransactionSignature>> defined in net.corda.core.flows.NotaryFlow.Client[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> List<TransactionSignature>

'notaryParty' @ [70:57] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'if (stx.isNotaryChangeTransaction()) {
                        stx.notaryChangeTx
                    } else {
                        stx.tx.buildFilteredTransaction(Predicate { it is StateRef || it is TimeWindow })
                    }' @ [72:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'stx' @ [72:39] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'isNotaryChangeTransaction' @ [72:43] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [73:25] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'notaryChangeTx' @ [73:29] ==> public final val notaryChangeTx: NotaryChangeWireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'stx' @ [75:25] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'tx' @ [75:29] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'buildFilteredTransaction' @ [75:32] ==> public final fun buildFilteredTransaction(filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'Predicate' @ [75:57] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (Any) -> Boolean): Predicate<Any> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Any

'it' @ [75:69] ==> value-parameter it: Any defined in net.corda.core.flows.NotaryFlow.Client.call.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [75:87] ==> value-parameter it: Any defined in net.corda.core.flows.NotaryFlow.Client.call.<anonymous>[ValueParameterDescriptorImpl]

'sendAndReceiveWithRetry' @ [77:21] ==> internal final inline fun <reified R : Any> sendAndReceiveWithRetry(otherParty: Party, payload: Any): UntrustworthyData<List<TransactionSignature>> defined in net.corda.core.flows.NotaryFlow.Client[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> List<TransactionSignature>

'notaryParty' @ [77:45] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'tx' @ [77:58] ==> val tx: Any defined in net.corda.core.flows.NotaryFlow.Client.call[LocalVariableDescriptor]

'e' @ [80:21] ==> val e: NotaryException defined in net.corda.core.flows.NotaryFlow.Client.call[LocalVariableDescriptor]

'error' @ [80:23] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[PropertyDescriptorImpl]

'e' @ [81:21] ==> val e: NotaryException defined in net.corda.core.flows.NotaryFlow.Client.call[LocalVariableDescriptor]

'error' @ [81:23] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[PropertyDescriptorImpl]

'conflict' @ [81:29] ==> public final val conflict: SignedData<UniquenessProvider.Conflict> defined in net.corda.core.flows.NotaryError.Conflict[PropertyDescriptorImpl]

'verified' @ [81:38] ==> @Throws public final fun verified(): UniquenessProvider.Conflict defined in net.corda.core.crypto.SignedData[SimpleFunctionDescriptorImpl]

'e' @ [83:23] ==> val e: NotaryException defined in net.corda.core.flows.NotaryFlow.Client.call[LocalVariableDescriptor]

'response' @ [86:20] ==> val response: UntrustworthyData<List<TransactionSignature>> defined in net.corda.core.flows.NotaryFlow.Client.call[LocalVariableDescriptor]

'unwrap' @ [86:29] ==> @Suppress public inline fun <T, R> UntrustworthyData<List<TransactionSignature>>.unwrap(validator: (List<TransactionSignature>) -> List<TransactionSignature>): List<TransactionSignature> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<TransactionSignature>
    <R> -> List<TransactionSignature>

'signatures' @ [87:17] ==> value-parameter signatures: List<TransactionSignature> defined in net.corda.core.flows.NotaryFlow.Client.call.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [87:28] ==> @HidesMembers public inline fun <T> Iterable<TransactionSignature>.forEach(action: (TransactionSignature) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'validateSignature' @ [87:38] ==> private final fun validateSignature(sig: TransactionSignature, txId: SecureHash): Unit defined in net.corda.core.flows.NotaryFlow.Client[SimpleFunctionDescriptorImpl]

'it' @ [87:56] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.NotaryFlow.Client.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stx' @ [87:60] ==> private final val stx: SignedTransaction defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'id' @ [87:64] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'signatures' @ [88:17] ==> value-parameter signatures: List<TransactionSignature> defined in net.corda.core.flows.NotaryFlow.Client.call.<anonymous>[ValueParameterDescriptorImpl]

'check' @ [93:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sig' @ [93:19] ==> value-parameter sig: TransactionSignature defined in net.corda.core.flows.NotaryFlow.Client.validateSignature[ValueParameterDescriptorImpl]

'by' @ [93:23] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'notaryParty' @ [93:29] ==> public final lateinit var notaryParty: Party defined in net.corda.core.flows.NotaryFlow.Client[PropertyDescriptorImpl]

'owningKey' @ [93:41] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'keys' @ [93:51] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto in file CryptoUtils.kt[PropertyDescriptorImpl]

'sig' @ [94:13] ==> value-parameter sig: TransactionSignature defined in net.corda.core.flows.NotaryFlow.Client.validateSignature[ValueParameterDescriptorImpl]

'verify' @ [94:17] ==> @Throws public final fun verify(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[SimpleFunctionDescriptorImpl]

'txId' @ [94:24] ==> value-parameter txId: SecureHash defined in net.corda.core.flows.NotaryFlow.Client.validateSignature[ValueParameterDescriptorImpl]

'FlowLogic<Void?>' @ [107:96] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Void?

'Suspendable' @ [109:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'component1' @ [111:18] ==> public final operator fun component1(): SecureHash defined in net.corda.core.flows.TransactionParts[SimpleFunctionDescriptorImpl]

'component2' @ [111:22] ==> public final operator fun component2(): List<StateRef> defined in net.corda.core.flows.TransactionParts[SimpleFunctionDescriptorImpl]

'component3' @ [111:30] ==> public final operator fun component3(): TimeWindow? defined in net.corda.core.flows.TransactionParts[SimpleFunctionDescriptorImpl]

'receiveAndVerifyTx' @ [111:44] ==> @Suspendable public abstract fun receiveAndVerifyTx(): TransactionParts defined in net.corda.core.flows.NotaryFlow.Service[SimpleFunctionDescriptorImpl]

'service' @ [112:13] ==> public final val service: TrustedAuthorityNotaryService defined in net.corda.core.flows.NotaryFlow.Service[PropertyDescriptorImpl]

'validateTimeWindow' @ [112:21] ==> public final fun validateTimeWindow(t: TimeWindow?): Unit defined in net.corda.core.node.services.TrustedAuthorityNotaryService[SimpleFunctionDescriptorImpl]

'timeWindow' @ [112:40] ==> val timeWindow: TimeWindow? defined in net.corda.core.flows.NotaryFlow.Service.call[LocalVariableDescriptor]

'service' @ [113:13] ==> public final val service: TrustedAuthorityNotaryService defined in net.corda.core.flows.NotaryFlow.Service[PropertyDescriptorImpl]

'commitInputStates' @ [113:21] ==> public final fun commitInputStates(inputs: List<StateRef>, txId: SecureHash, caller: Party): Unit defined in net.corda.core.node.services.TrustedAuthorityNotaryService[SimpleFunctionDescriptorImpl]

'inputs' @ [113:39] ==> val inputs: List<StateRef> defined in net.corda.core.flows.NotaryFlow.Service.call[LocalVariableDescriptor]

'id' @ [113:47] ==> val id: SecureHash defined in net.corda.core.flows.NotaryFlow.Service.call[LocalVariableDescriptor]

'otherSide' @ [113:51] ==> public final val otherSide: Party defined in net.corda.core.flows.NotaryFlow.Service[PropertyDescriptorImpl]

'signAndSendResponse' @ [114:13] ==> @Suspendable private final fun signAndSendResponse(txId: SecureHash): Unit defined in net.corda.core.flows.NotaryFlow.Service[SimpleFunctionDescriptorImpl]

'id' @ [114:33] ==> val id: SecureHash defined in net.corda.core.flows.NotaryFlow.Service.call[LocalVariableDescriptor]

'Suspendable' @ [122:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Suspendable' @ [125:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'service' @ [127:29] ==> public final val service: TrustedAuthorityNotaryService defined in net.corda.core.flows.NotaryFlow.Service[PropertyDescriptorImpl]

'sign' @ [127:37] ==> public final fun sign(txId: SecureHash): TransactionSignature defined in net.corda.core.node.services.TrustedAuthorityNotaryService[SimpleFunctionDescriptorImpl]

'txId' @ [127:42] ==> value-parameter txId: SecureHash defined in net.corda.core.flows.NotaryFlow.Service.signAndSendResponse[ValueParameterDescriptorImpl]

'send' @ [128:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.flows.NotaryFlow.Service[SimpleFunctionDescriptorImpl]

'otherSide' @ [128:18] ==> public final val otherSide: Party defined in net.corda.core.flows.NotaryFlow.Service[PropertyDescriptorImpl]

'listOf' @ [128:29] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'signature' @ [128:36] ==> val signature: TransactionSignature defined in net.corda.core.flows.NotaryFlow.Service.signAndSendResponse[LocalVariableDescriptor]

'FlowException' @ [139:49] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'error' @ [139:94] ==> value-parameter error: NotaryError defined in net.corda.core.flows.NotaryException.<init>[ValueParameterDescriptorImpl]

'CordaSerializable' @ [141:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'NotaryError' @ [143:104] ==> private constructor NotaryError() defined in net.corda.core.flows.NotaryError[ClassConstructorDescriptorImpl]

'txId' @ [144:78] ==> public final val txId: SecureHash defined in net.corda.core.flows.NotaryError.Conflict[PropertyDescriptorImpl]

'NotaryError' @ [148:32] ==> private constructor NotaryError() defined in net.corda.core.flows.NotaryError[ClassConstructorDescriptorImpl]

'NotaryError' @ [150:59] ==> private constructor NotaryError() defined in net.corda.core.flows.NotaryError[ClassConstructorDescriptorImpl]

'cause' @ [151:35] ==> public final val cause: Throwable defined in net.corda.core.flows.NotaryError.TransactionInvalid[PropertyDescriptorImpl]

'toString' @ [151:41] ==> public open fun toString(): String defined in kotlin.Throwable[DeserializedSimpleFunctionDescriptor]

'SendTransactionFlow' @ [159:84] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [159:104] ==> value-parameter otherSide: Party defined in net.corda.core.flows.SendTransactionWithRetry.<init>[ValueParameterDescriptorImpl]

'stx' @ [159:115] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SendTransactionWithRetry.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [160:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'sendAndReceiveWithRetry' @ [161:85] ==> internal final inline fun <reified R : Any> sendAndReceiveWithRetry(otherParty: Party, payload: Any): UntrustworthyData<FetchDataFlow.Request> defined in net.corda.core.flows.SendTransactionWithRetry[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> Request

'otherSide' @ [161:132] ==> value-parameter otherSide: Party defined in net.corda.core.flows.SendTransactionWithRetry.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

'payload' @ [161:143] ==> value-parameter payload: Any defined in net.corda.core.flows.SendTransactionWithRetry.sendPayloadAndReceiveDataRequest[ValueParameterDescriptorImpl]

