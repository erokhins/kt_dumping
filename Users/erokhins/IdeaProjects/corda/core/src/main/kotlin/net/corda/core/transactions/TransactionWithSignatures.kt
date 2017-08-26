'Throws' @ [26:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [26:13] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'verifySignaturesExcept' @ [27:38] ==> @Throws public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.TransactionWithSignatures[SimpleFunctionDescriptorImpl]

'Throws' @ [41:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [41:13] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'checkSignaturesAreValid' @ [43:9] ==> @Throws public open fun checkSignaturesAreValid(): Unit defined in net.corda.core.transactions.TransactionWithSignatures[SimpleFunctionDescriptorImpl]

'getMissingSignatures' @ [45:22] ==> private final fun getMissingSignatures(): Set<PublicKey> defined in net.corda.core.transactions.TransactionWithSignatures[SimpleFunctionDescriptorImpl]

'allowedToBeMissing' @ [45:47] ==> value-parameter vararg allowedToBeMissing: PublicKey defined in net.corda.core.transactions.TransactionWithSignatures.verifySignaturesExcept[ValueParameterDescriptorImpl]

'needed' @ [46:13] ==> val needed: Set<PublicKey> defined in net.corda.core.transactions.TransactionWithSignatures.verifySignaturesExcept[LocalVariableDescriptor]

'isNotEmpty' @ [46:20] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'SignaturesMissingException' @ [47:19] ==> public constructor SignaturesMissingException(missing: Set<PublicKey>, descriptions: List<String>, id: SecureHash) defined in net.corda.core.transactions.SignedTransaction.SignaturesMissingException[ClassConstructorDescriptorImpl]

'needed' @ [47:46] ==> val needed: Set<PublicKey> defined in net.corda.core.transactions.TransactionWithSignatures.verifySignaturesExcept[LocalVariableDescriptor]

'toNonEmptySet' @ [47:53] ==> public fun <T> Collection<PublicKey>.toNonEmptySet(): NonEmptySet<PublicKey> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PublicKey

'getKeyDescriptions' @ [47:70] ==> public abstract fun getKeyDescriptions(keys: Set<PublicKey>): List<String> defined in net.corda.core.transactions.TransactionWithSignatures[SimpleFunctionDescriptorImpl]

'needed' @ [47:89] ==> val needed: Set<PublicKey> defined in net.corda.core.transactions.TransactionWithSignatures.verifySignaturesExcept[LocalVariableDescriptor]

'id' @ [47:98] ==> public abstract val id: SecureHash defined in net.corda.core.transactions.TransactionWithSignatures[PropertyDescriptorImpl]

'Throws' @ [59:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeyException' @ [59:13] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'SignatureException' @ [59:41] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'sigs' @ [61:21] ==> public abstract val sigs: List<TransactionSignature> defined in net.corda.core.transactions.TransactionWithSignatures[PropertyDescriptorImpl]

'sig' @ [62:13] ==> val sig: TransactionSignature defined in net.corda.core.transactions.TransactionWithSignatures.checkSignaturesAreValid[LocalVariableDescriptor]

'verify' @ [62:17] ==> @Throws public final fun verify(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[SimpleFunctionDescriptorImpl]

'id' @ [62:24] ==> public abstract val id: SecureHash defined in net.corda.core.transactions.TransactionWithSignatures[PropertyDescriptorImpl]

'sigs' @ [75:23] ==> public abstract val sigs: List<TransactionSignature> defined in net.corda.core.transactions.TransactionWithSignatures[PropertyDescriptorImpl]

'map' @ [75:28] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [75:34] ==> value-parameter it: TransactionSignature defined in net.corda.core.transactions.TransactionWithSignatures.getMissingSignatures.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [75:37] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'toSet' @ [75:42] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'requiredSigningKeys' @ [78:23] ==> public abstract val requiredSigningKeys: Set<PublicKey> defined in net.corda.core.transactions.TransactionWithSignatures[PropertyDescriptorImpl]

'filter' @ [78:43] ==> public inline fun <T> Iterable<PublicKey>.filter(predicate: (PublicKey) -> Boolean): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'!' @ [78:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [78:53] ==> value-parameter it: PublicKey defined in net.corda.core.transactions.TransactionWithSignatures.getMissingSignatures.<anonymous>[ValueParameterDescriptorImpl]

'isFulfilledBy' @ [78:56] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[SimpleFunctionDescriptorImpl]

'sigKeys' @ [78:70] ==> val sigKeys: Set<PublicKey> defined in net.corda.core.transactions.TransactionWithSignatures.getMissingSignatures[LocalVariableDescriptor]

'toSet' @ [78:81] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'missing' @ [79:16] ==> val missing: Set<PublicKey> defined in net.corda.core.transactions.TransactionWithSignatures.getMissingSignatures[LocalVariableDescriptor]

