'this' @ [36:75] ==> public constructor SignedTransaction(txBits: SerializedBytes<CoreTransaction>, sigs: List<TransactionSignature>) defined in net.corda.core.transactions.SignedTransaction[ClassConstructorDescriptorImpl]

'ctx' @ [36:80] ==> value-parameter ctx: CoreTransaction defined in net.corda.core.transactions.SignedTransaction.<init>[ValueParameterDescriptorImpl]

'serialize' @ [36:84] ==> public fun <T : Any> CoreTransaction.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CoreTransaction> defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> CoreTransaction

'sigs' @ [36:97] ==> value-parameter sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction.<init>[ValueParameterDescriptorImpl]

'cachedTransaction' @ [37:9] ==> @Volatile @Transient private final var cachedTransaction: CoreTransaction? defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'ctx' @ [37:29] ==> value-parameter ctx: CoreTransaction defined in net.corda.core.transactions.SignedTransaction.<init>[ValueParameterDescriptorImpl]

'require' @ [41:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sigs' @ [41:17] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'isNotEmpty' @ [41:22] ==> @InlineOnly public inline fun <T> Collection<TransactionSignature>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'java' @ [41:89] ==> public val <T> KClass<SignedTransaction>.java: Class<SignedTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SignedTransaction

'simpleName' @ [41:94] ==> public final val <T : (Any..Any?)> Class<SignedTransaction>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'Volatile' @ [45:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'Transient' @ [45:15] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'cachedTransaction' @ [48:54] ==> @Volatile @Transient private final var cachedTransaction: CoreTransaction? defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'txBits' @ [48:75] ==> public final val txBits: SerializedBytes<CoreTransaction> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'deserialize' @ [48:82] ==> public inline fun <reified T : Any> SerializedBytes<CoreTransaction>.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): CoreTransaction defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> CoreTransaction

'apply' @ [48:96] ==> @InlineOnly public inline fun <T> CoreTransaction.apply(block: CoreTransaction.() -> Unit): CoreTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoreTransaction

'cachedTransaction' @ [48:104] ==> @Volatile @Transient private final var cachedTransaction: CoreTransaction? defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'this' @ [48:124] ==> <this> defined in net.corda.core.transactions.SignedTransaction.<get-transaction>.<anonymous>[ReceiverParameterDescriptorImpl]

'transaction' @ [51:41] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'id' @ [51:53] ==> public abstract val id: SecureHash defined in net.corda.core.transactions.CoreTransaction[PropertyDescriptorImpl]

'transaction' @ [54:37] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'transaction' @ [57:61] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'transaction' @ [60:40] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'inputs' @ [60:52] ==> public abstract val inputs: List<StateRef> defined in net.corda.core.transactions.CoreTransaction[PropertyDescriptorImpl]

'transaction' @ [62:32] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'notary' @ [62:44] ==> public abstract val notary: Party? defined in net.corda.core.transactions.CoreTransaction[PropertyDescriptorImpl]

'tx' @ [64:62] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'requiredSigningKeys' @ [64:65] ==> public final val requiredSigningKeys: Set<PublicKey> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'ArrayList' @ [68:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'this' @ [69:9] ==> <this> defined in net.corda.core.transactions.SignedTransaction[LazyClassReceiverParameterDescriptor]

'tx' @ [69:14] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'commands' @ [69:17] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'forEach' @ [69:26] ==> @HidesMembers public inline fun <T> Iterable<Command<*>>.forEach(action: (Command<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'command' @ [70:17] ==> value-parameter command: Command<*> defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [70:25] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'any' @ [70:33] ==> public inline fun <T> Iterable<PublicKey>.any(predicate: (PublicKey) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [70:39] ==> value-parameter it: PublicKey defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'keys' @ [70:45] ==> value-parameter keys: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions[ValueParameterDescriptorImpl]

'descriptions' @ [71:17] ==> val descriptions: ArrayList<String> defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions[LocalVariableDescriptor]

'add' @ [71:30] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'command' @ [71:34] ==> value-parameter command: Command<*> defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [71:42] ==> public open fun toString(): String defined in net.corda.core.contracts.Command[SimpleFunctionDescriptorImpl]

'this' @ [73:13] ==> <this> defined in net.corda.core.transactions.SignedTransaction[LazyClassReceiverParameterDescriptor]

'tx' @ [73:18] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'notary' @ [73:21] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'owningKey' @ [73:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'keys' @ [73:42] ==> value-parameter keys: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions[ValueParameterDescriptorImpl]

'descriptions' @ [74:13] ==> val descriptions: ArrayList<String> defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions[LocalVariableDescriptor]

'add' @ [74:26] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'descriptions' @ [75:16] ==> val descriptions: ArrayList<String> defined in net.corda.core.transactions.SignedTransaction.getKeyDescriptions[LocalVariableDescriptor]

'VisibleForTesting' @ [78:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[ClassConstructorDescriptorImpl]

'SignableData' @ [80:28] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[ClassConstructorDescriptorImpl]

'tx' @ [80:41] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'id' @ [80:44] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'signatureMetadata' @ [80:48] ==> value-parameter signatureMetadata: SignatureMetadata defined in net.corda.core.transactions.SignedTransaction.withAdditionalSignature[ValueParameterDescriptorImpl]

'withAdditionalSignature' @ [81:16] ==> public final fun withAdditionalSignature(sig: TransactionSignature): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'keyPair' @ [81:40] ==> value-parameter keyPair: KeyPair defined in net.corda.core.transactions.SignedTransaction.withAdditionalSignature[ValueParameterDescriptorImpl]

'sign' @ [81:48] ==> @Throws public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'signableData' @ [81:53] ==> val signableData: SignableData defined in net.corda.core.transactions.SignedTransaction.withAdditionalSignature[LocalVariableDescriptor]

'copyWithCache' @ [85:62] ==> private final fun copyWithCache(sigList: Iterable<TransactionSignature>): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'listOf' @ [85:76] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'sig' @ [85:83] ==> value-parameter sig: TransactionSignature defined in net.corda.core.transactions.SignedTransaction.withAdditionalSignature[ValueParameterDescriptorImpl]

'copyWithCache' @ [88:77] ==> private final fun copyWithCache(sigList: Iterable<TransactionSignature>): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'sigList' @ [88:91] ==> value-parameter sigList: Iterable<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction.withAdditionalSignatures[ValueParameterDescriptorImpl]

'cachedTransaction' @ [95:22] ==> @Volatile @Transient private final var cachedTransaction: CoreTransaction? defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'copy' @ [96:16] ==> public final fun copy(txBits: SerializedBytes<CoreTransaction> = ..., sigs: List<TransactionSignature> = ...): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'sigs' @ [96:28] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'sigList' @ [96:35] ==> value-parameter sigList: Iterable<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction.copyWithCache[ValueParameterDescriptorImpl]

'apply' @ [96:44] ==> @InlineOnly public inline fun <T> SignedTransaction.apply(block: SignedTransaction.() -> Unit): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'cachedTransaction' @ [97:13] ==> @Volatile @Transient private final var cachedTransaction: CoreTransaction? defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'cached' @ [97:33] ==> val cached: CoreTransaction? defined in net.corda.core.transactions.SignedTransaction.copyWithCache[LocalVariableDescriptor]

'withAdditionalSignature' @ [102:52] ==> public final fun withAdditionalSignature(sig: TransactionSignature): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'sig' @ [102:76] ==> value-parameter sig: TransactionSignature defined in net.corda.core.transactions.SignedTransaction.plus[ValueParameterDescriptorImpl]

'withAdditionalSignatures' @ [105:68] ==> public final fun withAdditionalSignatures(sigList: Iterable<TransactionSignature>): SignedTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'sigList' @ [105:93] ==> value-parameter sigList: Collection<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction.plus[ValueParameterDescriptorImpl]

'JvmOverloads' @ [122:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'Throws' @ [123:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [123:13] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'AttachmentResolutionException' @ [123:40] ==> public constructor AttachmentResolutionException(hash: SecureHash) defined in net.corda.core.contracts.AttachmentResolutionException[ClassConstructorDescriptorImpl]

'TransactionResolutionException' @ [123:78] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'checkSignaturesAreValid' @ [125:9] ==> @Throws public open fun checkSignaturesAreValid(): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'checkSufficientSignatures' @ [126:13] ==> value-parameter checkSufficientSignatures: Boolean = ... defined in net.corda.core.transactions.SignedTransaction.toLedgerTransaction[ValueParameterDescriptorImpl]

'verifyRequiredSignatures' @ [126:40] ==> @Throws public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'tx' @ [127:16] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'toLedgerTransaction' @ [127:19] ==> @Throws public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'services' @ [127:39] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.SignedTransaction.toLedgerTransaction[ValueParameterDescriptorImpl]

'JvmOverloads' @ [140:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'Throws' @ [141:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [141:13] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'AttachmentResolutionException' @ [141:40] ==> public constructor AttachmentResolutionException(hash: SecureHash) defined in net.corda.core.contracts.AttachmentResolutionException[ClassConstructorDescriptorImpl]

'TransactionResolutionException' @ [141:78] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'TransactionVerificationException' @ [141:117] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'if (isNotaryChangeTransaction()) {
            verifyNotaryChangeTransaction(checkSufficientSignatures, services)
        } else {
            verifyRegularTransaction(checkSufficientSignatures, services)
        }' @ [143:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isNotaryChangeTransaction' @ [143:13] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'verifyNotaryChangeTransaction' @ [144:13] ==> private final fun verifyNotaryChangeTransaction(checkSufficientSignatures: Boolean, services: ServiceHub): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'checkSufficientSignatures' @ [144:43] ==> value-parameter checkSufficientSignatures: Boolean = ... defined in net.corda.core.transactions.SignedTransaction.verify[ValueParameterDescriptorImpl]

'services' @ [144:70] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.SignedTransaction.verify[ValueParameterDescriptorImpl]

'verifyRegularTransaction' @ [146:13] ==> private final fun verifyRegularTransaction(checkSufficientSignatures: Boolean, services: ServiceHub): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'checkSufficientSignatures' @ [146:38] ==> value-parameter checkSufficientSignatures: Boolean = ... defined in net.corda.core.transactions.SignedTransaction.verify[ValueParameterDescriptorImpl]

'services' @ [146:65] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.SignedTransaction.verify[ValueParameterDescriptorImpl]

'checkSignaturesAreValid' @ [151:9] ==> @Throws public open fun checkSignaturesAreValid(): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'checkSufficientSignatures' @ [152:13] ==> value-parameter checkSufficientSignatures: Boolean defined in net.corda.core.transactions.SignedTransaction.verifyRegularTransaction[ValueParameterDescriptorImpl]

'verifyRequiredSignatures' @ [152:40] ==> @Throws public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'tx' @ [153:19] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'toLedgerTransaction' @ [153:22] ==> @Throws public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'services' @ [153:42] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.SignedTransaction.verifyRegularTransaction[ValueParameterDescriptorImpl]

'services' @ [155:9] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.SignedTransaction.verifyRegularTransaction[ValueParameterDescriptorImpl]

'transactionVerifierService' @ [155:18] ==> public abstract val transactionVerifierService: TransactionVerifierService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'verify' @ [155:45] ==> public abstract fun verify(transaction: LedgerTransaction): CordaFuture<*> defined in net.corda.core.node.services.TransactionVerifierService[SimpleFunctionDescriptorImpl]

'ltx' @ [155:52] ==> val ltx: LedgerTransaction defined in net.corda.core.transactions.SignedTransaction.verifyRegularTransaction[LocalVariableDescriptor]

'getOrThrow' @ [155:57] ==> public fun <V> Future<out Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> Any?

'resolveNotaryChangeTransaction' @ [159:19] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'services' @ [159:50] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.SignedTransaction.verifyNotaryChangeTransaction[ValueParameterDescriptorImpl]

'checkSufficientSignatures' @ [160:13] ==> value-parameter checkSufficientSignatures: Boolean defined in net.corda.core.transactions.SignedTransaction.verifyNotaryChangeTransaction[ValueParameterDescriptorImpl]

'ntx' @ [160:40] ==> val ntx: NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction.verifyNotaryChangeTransaction[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [160:44] ==> @Throws public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[SimpleFunctionDescriptorImpl]

'transaction' @ [163:39] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'transaction' @ [170:19] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'IllegalStateException' @ [171:26] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'NotaryChangeWireTransaction' @ [171:62] ==> public constructor NotaryChangeWireTransaction(inputs: List<StateRef>, notary: Party, newNotary: Party) defined in net.corda.core.transactions.NotaryChangeWireTransaction[ClassConstructorDescriptorImpl]

'simpleName' @ [171:97] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'transaction' @ [171:121] ==> private final val transaction: CoreTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'simpleName' @ [171:140] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'ntx' @ [172:16] ==> val ntx: NotaryChangeWireTransaction defined in net.corda.core.transactions.SignedTransaction.resolveNotaryChangeTransaction[LocalVariableDescriptor]

'resolve' @ [172:20] ==> public final fun resolve(services: ServiceHub, sigs: List<TransactionSignature>): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.NotaryChangeWireTransaction[SimpleFunctionDescriptorImpl]

'services' @ [172:28] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.SignedTransaction.resolveNotaryChangeTransaction[ValueParameterDescriptorImpl]

'sigs' @ [172:38] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'javaClass' @ [175:42] ==> public val <T : Any> SignedTransaction.javaClass: Class<SignedTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'simpleName' @ [175:52] ==> public final val <T : (Any..Any?)> Class<SignedTransaction>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'id' @ [175:68] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'CordaSerializable' @ [177:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'SignatureException' @ [179:24] ==> public constructor SignatureException(p0: (String..String?)) defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'descriptions' @ [179:68] ==> value-parameter descriptions: List<String> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException.<init>[ValueParameterDescriptorImpl]

'id' @ [179:98] ==> value-parameter id: SecureHash defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException.<init>[ValueParameterDescriptorImpl]

'prefixChars' @ [179:101] ==> public final fun prefixChars(prefixLen: Int = ...): String defined in net.corda.core.crypto.SecureHash[SimpleFunctionDescriptorImpl]

'missing' @ [179:122] ==> value-parameter missing: Set<PublicKey> defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException.<init>[ValueParameterDescriptorImpl]

'joinToString' @ [179:130] ==> public fun <T> Iterable<PublicKey>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PublicKey) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

