'JvmOverloads' @ [64:29] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'CollectSignaturesFlow' @ [66:104] ==> public companion object defined in net.corda.core.flows.CollectSignaturesFlow[FakeCallableDescriptorForObject]

'tracker' @ [66:126] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.CollectSignaturesFlow.Companion[SimpleFunctionDescriptorImpl]

'FlowLogic<SignedTransaction>' @ [66:139] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> SignedTransaction

'JvmOverloads' @ [67:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'CollectSignaturesFlow' @ [67:104] ==> public companion object defined in net.corda.core.flows.CollectSignaturesFlow[FakeCallableDescriptorForObject]

'tracker' @ [67:126] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.CollectSignaturesFlow.Companion[SimpleFunctionDescriptorImpl]

'this' @ [67:139] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, myOptionalKeys: Iterable<PublicKey>?, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[ClassConstructorDescriptorImpl]

'partiallySignedTx' @ [67:144] ==> value-parameter partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow.<init>[ValueParameterDescriptorImpl]

'progressTracker' @ [67:169] ==> value-parameter progressTracker: ProgressTracker = ... defined in net.corda.core.flows.CollectSignaturesFlow.<init>[ValueParameterDescriptorImpl]

'ProgressTracker.Step' @ [69:29] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker.Step' @ [70:28] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [72:25] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'COLLECTING' @ [72:41] ==> public object COLLECTING : ProgressTracker.Step defined in net.corda.core.flows.CollectSignaturesFlow.Companion[FakeCallableDescriptorForObject]

'VERIFYING' @ [72:53] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.core.flows.CollectSignaturesFlow.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [77:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'myOptionalKeys' @ [80:43] ==> public final val myOptionalKeys: Iterable<PublicKey>? defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'listOf' @ [80:61] ==> public fun <T> listOf(element: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'serviceHub' @ [80:68] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'myInfo' @ [80:79] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentity' @ [80:86] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'owningKey' @ [80:100] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'partiallySignedTx' @ [81:22] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'sigs' @ [81:40] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'map' @ [81:45] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [81:51] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.CollectSignaturesFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [81:54] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'partiallySignedTx' @ [82:25] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'tx' @ [82:43] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'requiredSigningKeys' @ [82:46] ==> public final val requiredSigningKeys: Set<PublicKey> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'signed' @ [82:68] ==> val signed: List<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'require' @ [85:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'partiallySignedTx' @ [85:17] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'sigs' @ [85:35] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'any' @ [85:40] ==> public inline fun <T> Iterable<TransactionSignature>.any(predicate: (TransactionSignature) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'it' @ [85:46] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.CollectSignaturesFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [85:49] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'myKeys' @ [85:55] ==> val myKeys: Iterable<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'partiallySignedTx' @ [90:9] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'verifySignaturesExcept' @ [90:27] ==> @Throws public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'notSigned' @ [90:51] ==> val notSigned: Set<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'toTypedArray' @ [90:61] ==> public inline fun <reified T> Collection<PublicKey>.toTypedArray(): Array<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PublicKey

'partiallySignedTx' @ [91:9] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'tx' @ [91:27] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'toLedgerTransaction' @ [91:30] ==> @Throws public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [91:50] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'verify' @ [91:62] ==> @Throws public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'progressTracker' @ [94:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'currentStep' @ [94:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'COLLECTING' @ [94:39] ==> public object COLLECTING : ProgressTracker.Step defined in net.corda.core.flows.CollectSignaturesFlow.Companion[FakeCallableDescriptorForObject]

'partiallySignedTx' @ [95:25] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'tx' @ [95:43] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'notary' @ [95:46] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'owningKey' @ [95:54] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'if (notaryKey != null) notSigned - notaryKey else notSigned' @ [98:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<PublicKey>, elseBranch: Set<PublicKey>): Set<PublicKey>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<PublicKey>

'notaryKey' @ [98:28] ==> val notaryKey: PublicKey? defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'notSigned' @ [98:47] ==> val notSigned: Set<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'notaryKey' @ [98:59] ==> val notaryKey: PublicKey? defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'notSigned' @ [98:74] ==> val notSigned: Set<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'unsigned' @ [101:13] ==> val unsigned: Set<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'isEmpty' @ [101:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'partiallySignedTx' @ [101:40] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'keysToParties' @ [104:38] ==> @Suspendable private final fun keysToParties(keys: Collection<PublicKey>): List<Pair<Party, PublicKey>> defined in net.corda.core.flows.CollectSignaturesFlow[SimpleFunctionDescriptorImpl]

'unsigned' @ [104:52] ==> val unsigned: Set<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'map' @ [104:62] ==> public inline fun <T, R> Iterable<Pair<Party, PublicKey>>.map(transform: (Pair<Party, PublicKey>) -> TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Party, PublicKey>
    <R> -> TransactionSignature

'collectSignature' @ [104:68] ==> @Suspendable private final fun collectSignature(counterparty: Party, signingKey: PublicKey): TransactionSignature defined in net.corda.core.flows.CollectSignaturesFlow[SimpleFunctionDescriptorImpl]

'it' @ [104:85] ==> value-parameter it: Pair<Party, PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [104:88] ==> public final val first: Party defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [104:95] ==> value-parameter it: Pair<Party, PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [104:98] ==> public final val second: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'partiallySignedTx' @ [105:19] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'counterpartySignatures' @ [105:39] ==> val counterpartySignatures: List<TransactionSignature> defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'progressTracker' @ [108:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'currentStep' @ [108:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'VERIFYING' @ [108:39] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.core.flows.CollectSignaturesFlow.Companion[FakeCallableDescriptorForObject]

'if (notaryKey != null) stx.verifySignaturesExcept(notaryKey) else stx.verifyRequiredSignatures()' @ [109:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'notaryKey' @ [109:13] ==> val notaryKey: PublicKey? defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'stx' @ [109:32] ==> val stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'verifySignaturesExcept' @ [109:36] ==> @Throws public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'notaryKey' @ [109:59] ==> val notaryKey: PublicKey? defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'stx' @ [109:75] ==> val stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [109:79] ==> @Throws public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [111:16] ==> val stx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow.call[LocalVariableDescriptor]

'Suspendable' @ [120:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'keys' @ [120:105] ==> value-parameter keys: Collection<PublicKey> defined in net.corda.core.flows.CollectSignaturesFlow.keysToParties[ValueParameterDescriptorImpl]

'map' @ [120:110] ==> public inline fun <T, R> Iterable<PublicKey>.map(transform: (PublicKey) -> Pair<Party, PublicKey>): List<Pair<Party, PublicKey>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey
    <R> -> Pair<Party, PublicKey>

'serviceHub' @ [121:21] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'identityService' @ [121:32] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'partyFromAnonymous' @ [121:48] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'AnonymousParty' @ [121:67] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[ClassConstructorDescriptorImpl]

'it' @ [121:82] ==> value-parameter it: PublicKey defined in net.corda.core.flows.CollectSignaturesFlow.keysToParties.<anonymous>[ValueParameterDescriptorImpl]

'IllegalStateException' @ [122:26] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'it' @ [122:57] ==> value-parameter it: PublicKey defined in net.corda.core.flows.CollectSignaturesFlow.keysToParties.<anonymous>[ValueParameterDescriptorImpl]

'toBase58String' @ [122:60] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto in file EncodingUtils.kt[SimpleFunctionDescriptorImpl]

'Pair' @ [123:9] ==> public constructor Pair<out A, out B>(first: Party, second: PublicKey) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> PublicKey

'party' @ [123:14] ==> val party: Party defined in net.corda.core.flows.CollectSignaturesFlow.keysToParties.<anonymous>[LocalVariableDescriptor]

'it' @ [123:21] ==> value-parameter it: PublicKey defined in net.corda.core.flows.CollectSignaturesFlow.keysToParties.<anonymous>[ValueParameterDescriptorImpl]

'Suspendable' @ [133:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [135:9] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.core.flows.CollectSignaturesFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Void?

'SendTransactionFlow' @ [135:17] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[ClassConstructorDescriptorImpl]

'counterparty' @ [135:37] ==> value-parameter counterparty: Party defined in net.corda.core.flows.CollectSignaturesFlow.collectSignature[ValueParameterDescriptorImpl]

'partiallySignedTx' @ [135:51] ==> public final val partiallySignedTx: SignedTransaction defined in net.corda.core.flows.CollectSignaturesFlow[PropertyDescriptorImpl]

'send' @ [139:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.flows.CollectSignaturesFlow[SimpleFunctionDescriptorImpl]

'counterparty' @ [139:14] ==> value-parameter counterparty: Party defined in net.corda.core.flows.CollectSignaturesFlow.collectSignature[ValueParameterDescriptorImpl]

'signingKey' @ [139:28] ==> value-parameter signingKey: PublicKey defined in net.corda.core.flows.CollectSignaturesFlow.collectSignature[ValueParameterDescriptorImpl]

'receive' @ [140:16] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<TransactionSignature> defined in net.corda.core.flows.CollectSignaturesFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> TransactionSignature

'counterparty' @ [140:46] ==> value-parameter counterparty: Party defined in net.corda.core.flows.CollectSignaturesFlow.collectSignature[ValueParameterDescriptorImpl]

'unwrap' @ [140:60] ==> @Suppress public inline fun <T, R> UntrustworthyData<TransactionSignature>.unwrap(validator: (TransactionSignature) -> TransactionSignature): TransactionSignature defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TransactionSignature
    <R> -> TransactionSignature

'require' @ [141:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'signingKey' @ [141:21] ==> value-parameter signingKey: PublicKey defined in net.corda.core.flows.CollectSignaturesFlow.collectSignature[ValueParameterDescriptorImpl]

'isFulfilledBy' @ [141:32] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [141:46] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.CollectSignaturesFlow.collectSignature.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [141:49] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'it' @ [142:13] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.CollectSignaturesFlow.collectSignature.<anonymous>[ValueParameterDescriptorImpl]

'SignTransactionFlow' @ [188:84] ==> public companion object defined in net.corda.core.flows.SignTransactionFlow[FakeCallableDescriptorForObject]

'tracker' @ [188:104] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.SignTransactionFlow.Companion[SimpleFunctionDescriptorImpl]

'FlowLogic<SignedTransaction>' @ [188:117] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> SignedTransaction

'ProgressTracker.Step' @ [191:28] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker.Step' @ [192:28] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker.Step' @ [193:26] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [195:25] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'RECEIVING' @ [195:41] ==> public object RECEIVING : ProgressTracker.Step defined in net.corda.core.flows.SignTransactionFlow.Companion[FakeCallableDescriptorForObject]

'VERIFYING' @ [195:52] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.core.flows.SignTransactionFlow.Companion[FakeCallableDescriptorForObject]

'SIGNING' @ [195:63] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.core.flows.SignTransactionFlow.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [198:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [199:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'currentStep' @ [199:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'RECEIVING' @ [199:39] ==> public object RECEIVING : ProgressTracker.Step defined in net.corda.core.flows.SignTransactionFlow.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [201:19] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.core.flows.SignTransactionFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> SignedTransaction

'ReceiveTransactionFlow' @ [201:27] ==> @JvmOverloads public constructor ReceiveTransactionFlow(otherParty: Party, checkSufficientSignatures: Boolean = ...) defined in net.corda.core.flows.ReceiveTransactionFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [201:50] ==> public final val otherParty: Party defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'receive' @ [205:26] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<PublicKey> defined in net.corda.core.flows.SignTransactionFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> PublicKey

'otherParty' @ [205:45] ==> public final val otherParty: Party defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'unwrap' @ [205:57] ==> @Suppress public inline fun <T, R> UntrustworthyData<PublicKey>.unwrap(validator: (PublicKey) -> PublicKey): PublicKey defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PublicKey
    <R> -> PublicKey

'serviceHub' @ [207:13] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'keyManagementService' @ [207:24] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'filterMyKeys' @ [207:45] ==> public abstract fun filterMyKeys(candidateKeys: Iterable<PublicKey>): Iterable<PublicKey> defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'listOf' @ [207:58] ==> public fun <T> listOf(element: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [207:65] ==> value-parameter it: PublicKey defined in net.corda.core.flows.SignTransactionFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'single' @ [207:70] ==> public fun <T> Iterable<PublicKey>.single(): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'progressTracker' @ [209:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'currentStep' @ [209:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'VERIFYING' @ [209:39] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.core.flows.SignTransactionFlow.Companion[FakeCallableDescriptorForObject]

'checkMySignatureRequired' @ [211:9] ==> @Suspendable private final fun checkMySignatureRequired(stx: SignedTransaction, signingKey: PublicKey): Unit defined in net.corda.core.flows.SignTransactionFlow[SimpleFunctionDescriptorImpl]

'stx' @ [211:34] ==> val stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'signingKey' @ [211:39] ==> val signingKey: PublicKey defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'checkSignatures' @ [213:9] ==> @Suspendable private final fun checkSignatures(stx: SignedTransaction): Unit defined in net.corda.core.flows.SignTransactionFlow[SimpleFunctionDescriptorImpl]

'stx' @ [213:25] ==> val stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'stx' @ [214:9] ==> val stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'tx' @ [214:13] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'toLedgerTransaction' @ [214:16] ==> @Throws public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [214:36] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'verify' @ [214:48] ==> @Throws public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'checkTransaction' @ [217:13] ==> @Suspendable protected abstract fun checkTransaction(stx: SignedTransaction): Unit defined in net.corda.core.flows.SignTransactionFlow[SimpleFunctionDescriptorImpl]

'stx' @ [217:30] ==> val stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'if (e is IllegalStateException || e is IllegalArgumentException || e is AssertionError)
                throw FlowException(e)
            else
                throw e' @ [219:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'e' @ [219:17] ==> val e: Exception /* = Exception */ defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'e' @ [219:47] ==> val e: Exception /* = Exception */ defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'e' @ [219:80] ==> val e: Exception /* = Exception */ defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'FlowException' @ [220:23] ==> public constructor FlowException(cause: Throwable?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'e' @ [220:37] ==> val e: Exception /* = Exception */ defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'e' @ [222:23] ==> val e: Exception /* = Exception */ defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'progressTracker' @ [225:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'currentStep' @ [225:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'SIGNING' @ [225:39] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.core.flows.SignTransactionFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [226:27] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'createSignature' @ [226:38] ==> public open fun createSignature(signedTransaction: SignedTransaction, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'stx' @ [226:54] ==> val stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'signingKey' @ [226:59] ==> val signingKey: PublicKey defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'send' @ [227:9] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.flows.SignTransactionFlow[SimpleFunctionDescriptorImpl]

'otherParty' @ [227:14] ==> public final val otherParty: Party defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'mySignature' @ [227:26] ==> val mySignature: TransactionSignature defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'waitForLedgerCommit' @ [230:16] ==> @Suspendable public final fun waitForLedgerCommit(hash: SecureHash): SignedTransaction defined in net.corda.core.flows.SignTransactionFlow[SimpleFunctionDescriptorImpl]

'stx' @ [230:36] ==> val stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.call[LocalVariableDescriptor]

'id' @ [230:40] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'Suspendable' @ [233:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'stx' @ [234:33] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[ValueParameterDescriptorImpl]

'sigs' @ [234:37] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'map' @ [234:42] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'TransactionSignature' @ [234:46] ==> public constructor TransactionSignature(bytes: ByteArray, by: PublicKey, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.TransactionSignature[ClassConstructorDescriptorImpl]

'by' @ [234:68] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'mapNotNull' @ [234:72] ==> public inline fun <T, R : Any> Iterable<PublicKey>.mapNotNull(transform: (PublicKey) -> Party?): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey
    <R : Any> -> Party

'serviceHub' @ [234:83] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'identityService' @ [234:94] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'partyFromKey' @ [234:111] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'signingIdentities' @ [235:42] ==> val signingIdentities: List<Party> defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[LocalVariableDescriptor]

'mapNotNull' @ [235:60] ==> public inline fun <T, R : Any> Iterable<Party>.mapNotNull(transform: (Party) -> Party?): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R : Any> -> Party

'serviceHub' @ [235:71] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'identityService' @ [235:82] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'partyFromAnonymous' @ [235:99] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'require' @ [236:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [236:17] ==> public final val otherParty: Party defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'signingWellKnownIdentities' @ [236:31] ==> val signingWellKnownIdentities: List<Party> defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[LocalVariableDescriptor]

'signingWellKnownIdentities' @ [237:95] ==> val signingWellKnownIdentities: List<Party> defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[LocalVariableDescriptor]

'otherParty' @ [237:135] ==> public final val otherParty: Party defined in net.corda.core.flows.SignTransactionFlow[PropertyDescriptorImpl]

'stx' @ [239:22] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[ValueParameterDescriptorImpl]

'sigs' @ [239:26] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'map' @ [239:31] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [239:37] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.SignTransactionFlow.checkSignatures.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [239:40] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'stx' @ [240:26] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[ValueParameterDescriptorImpl]

'tx' @ [240:30] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'requiredSigningKeys' @ [240:33] ==> public final val requiredSigningKeys: Set<PublicKey> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'allSigners' @ [241:25] ==> val allSigners: Set<PublicKey> defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[LocalVariableDescriptor]

'signed' @ [241:38] ==> val signed: List<PublicKey> defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[LocalVariableDescriptor]

'stx' @ [242:9] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[ValueParameterDescriptorImpl]

'verifySignaturesExcept' @ [242:13] ==> @Throws public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'notSigned' @ [242:37] ==> val notSigned: Set<PublicKey> defined in net.corda.core.flows.SignTransactionFlow.checkSignatures[LocalVariableDescriptor]

'toTypedArray' @ [242:47] ==> public inline fun <reified T> Collection<PublicKey>.toTypedArray(): Array<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PublicKey

'Suspendable' @ [265:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Suspendable' @ [267:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'require' @ [268:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'signingKey' @ [268:17] ==> value-parameter signingKey: PublicKey defined in net.corda.core.flows.SignTransactionFlow.checkMySignatureRequired[ValueParameterDescriptorImpl]

'stx' @ [268:31] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.checkMySignatureRequired[ValueParameterDescriptorImpl]

'tx' @ [268:35] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'requiredSigningKeys' @ [268:38] ==> public final val requiredSigningKeys: Set<PublicKey> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'stx' @ [269:86] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.SignTransactionFlow.checkMySignatureRequired[ValueParameterDescriptorImpl]

'id' @ [269:90] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

