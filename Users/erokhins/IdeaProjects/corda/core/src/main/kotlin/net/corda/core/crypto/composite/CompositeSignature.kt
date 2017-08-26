'Signature' @ [12:28] ==> protected/*protected and package*/ constructor Signature(p0: (String..String?)) defined in java.security.Signature[JavaClassConstructorDescriptor]

'SIGNATURE_ALGORITHM' @ [12:38] ==> public const final val SIGNATURE_ALGORITHM: String defined in net.corda.core.crypto.composite.CompositeSignature.Companion[PropertyDescriptorImpl]

'Service' @ [15:55] ==> public constructor Service(p0: (Provider..Provider?), p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (MutableList<(String..String?)>..List<(String..String?)>?), p5: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)) defined in java.security.Provider.Service[JavaClassConstructorDescriptor]

'provider' @ [15:63] ==> value-parameter provider: Provider defined in net.corda.core.crypto.composite.CompositeSignature.Companion.getService[ValueParameterDescriptorImpl]

'SIGNATURE_ALGORITHM' @ [15:86] ==> public const final val SIGNATURE_ALGORITHM: String defined in net.corda.core.crypto.composite.CompositeSignature.Companion[PropertyDescriptorImpl]

'CompositeSignature' @ [15:107] ==> public companion object defined in net.corda.core.crypto.composite.CompositeSignature[FakeCallableDescriptorForObject]

'java' @ [15:133] ==> public val <T> KClass<CompositeSignature>.java: Class<CompositeSignature> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompositeSignature

'name' @ [15:138] ==> public final val <T : (Any..Any?)> Class<CompositeSignature>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompositeSignature

'emptyList' @ [15:144] ==> public fun <T> emptyList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'emptyMap' @ [15:157] ==> public fun <K, V> emptyMap(): Map<(String..String?), (String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.String..kotlin.String?)

'Throws' @ [23:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [23:13] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'signatureState' @ [25:13] ==> private final var signatureState: CompositeSignature.State? defined in net.corda.core.crypto.composite.CompositeSignature[PropertyDescriptorImpl]

'SignatureException' @ [26:19] ==> public constructor SignatureException(p0: (String..String?)) defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'signatureState' @ [27:16] ==> private final var signatureState: CompositeSignature.State? defined in net.corda.core.crypto.composite.CompositeSignature[PropertyDescriptorImpl]

'Throws' @ [30:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidAlgorithmParameterException' @ [30:13] ==> public constructor InvalidAlgorithmParameterException() defined in java.security.InvalidAlgorithmParameterException[JavaClassConstructorDescriptor]

'InvalidAlgorithmParameterException' @ [32:15] ==> public constructor InvalidAlgorithmParameterException(p0: (String..String?)) defined in java.security.InvalidAlgorithmParameterException[JavaClassConstructorDescriptor]

'Throws' @ [35:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeyException' @ [35:13] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'InvalidKeyException' @ [37:15] ==> public constructor InvalidKeyException(p0: (String..String?)) defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'Throws' @ [40:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeyException' @ [40:13] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'if (publicKey is CompositeKey) {
            signatureState = State(ByteArrayOutputStream(1024), publicKey)
        } else {
            throw InvalidKeyException("Key to verify must be a composite key")
        }' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'publicKey' @ [42:13] ==> value-parameter publicKey: PublicKey? defined in net.corda.core.crypto.composite.CompositeSignature.engineInitVerify[ValueParameterDescriptorImpl]

'signatureState' @ [43:13] ==> private final var signatureState: CompositeSignature.State? defined in net.corda.core.crypto.composite.CompositeSignature[PropertyDescriptorImpl]

'State' @ [43:30] ==> public constructor State(buffer: ByteArrayOutputStream, verifyKey: CompositeKey) defined in net.corda.core.crypto.composite.CompositeSignature.State[ClassConstructorDescriptorImpl]

'ByteArrayOutputStream' @ [43:36] ==> public constructor ByteArrayOutputStream(p0: Int) defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'publicKey' @ [43:65] ==> value-parameter publicKey: PublicKey? defined in net.corda.core.crypto.composite.CompositeSignature.engineInitVerify[ValueParameterDescriptorImpl]

'InvalidKeyException' @ [45:19] ==> public constructor InvalidKeyException(p0: (String..String?)) defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'Throws' @ [49:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidAlgorithmParameterException' @ [49:13] ==> public constructor InvalidAlgorithmParameterException() defined in java.security.InvalidAlgorithmParameterException[JavaClassConstructorDescriptor]

'InvalidAlgorithmParameterException' @ [51:15] ==> public constructor InvalidAlgorithmParameterException(p0: (String..String?)) defined in java.security.InvalidAlgorithmParameterException[JavaClassConstructorDescriptor]

'Throws' @ [54:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidAlgorithmParameterException' @ [54:13] ==> public constructor InvalidAlgorithmParameterException() defined in java.security.InvalidAlgorithmParameterException[JavaClassConstructorDescriptor]

'InvalidAlgorithmParameterException' @ [56:15] ==> public constructor InvalidAlgorithmParameterException(p0: (String..String?)) defined in java.security.InvalidAlgorithmParameterException[JavaClassConstructorDescriptor]

'Throws' @ [59:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [59:13] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'SignatureException' @ [61:15] ==> public constructor SignatureException(p0: (String..String?)) defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'assertInitialised' @ [65:9] ==> @Throws private final fun assertInitialised(): CompositeSignature.State defined in net.corda.core.crypto.composite.CompositeSignature[SimpleFunctionDescriptorImpl]

'buffer' @ [65:29] ==> public final val buffer: ByteArrayOutputStream defined in net.corda.core.crypto.composite.CompositeSignature.State[PropertyDescriptorImpl]

'write' @ [65:36] ==> public open fun write(p0: Int): Unit defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'b' @ [65:42] ==> value-parameter b: Byte defined in net.corda.core.crypto.composite.CompositeSignature.engineUpdate[ValueParameterDescriptorImpl]

'toInt' @ [65:44] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'assertInitialised' @ [69:9] ==> @Throws private final fun assertInitialised(): CompositeSignature.State defined in net.corda.core.crypto.composite.CompositeSignature[SimpleFunctionDescriptorImpl]

'buffer' @ [69:29] ==> public final val buffer: ByteArrayOutputStream defined in net.corda.core.crypto.composite.CompositeSignature.State[PropertyDescriptorImpl]

'write' @ [69:36] ==> public open fun write(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): Unit defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'b' @ [69:42] ==> value-parameter b: ByteArray defined in net.corda.core.crypto.composite.CompositeSignature.engineUpdate[ValueParameterDescriptorImpl]

'off' @ [69:45] ==> value-parameter off: Int defined in net.corda.core.crypto.composite.CompositeSignature.engineUpdate[ValueParameterDescriptorImpl]

'len' @ [69:50] ==> value-parameter len: Int defined in net.corda.core.crypto.composite.CompositeSignature.engineUpdate[ValueParameterDescriptorImpl]

'Throws' @ [72:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [72:13] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'assertInitialised' @ [73:63] ==> @Throws private final fun assertInitialised(): CompositeSignature.State defined in net.corda.core.crypto.composite.CompositeSignature[SimpleFunctionDescriptorImpl]

'engineVerify' @ [73:83] ==> public final fun engineVerify(sigBytes: ByteArray): Boolean defined in net.corda.core.crypto.composite.CompositeSignature.State[SimpleFunctionDescriptorImpl]

'sigBytes' @ [73:96] ==> value-parameter sigBytes: ByteArray defined in net.corda.core.crypto.composite.CompositeSignature.engineVerify[ValueParameterDescriptorImpl]

'sigBytes' @ [77:23] ==> value-parameter sigBytes: ByteArray defined in net.corda.core.crypto.composite.CompositeSignature.State.engineVerify[ValueParameterDescriptorImpl]

'deserialize' @ [77:32] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): CompositeSignaturesWithKeys defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> CompositeSignaturesWithKeys

'if (verifyKey.isFulfilledBy(sig.sigs.map { it.by })) {
                val clearData = SecureHash.SHA256(buffer.toByteArray())
                sig.sigs.all { it.isValid(clearData) }
            } else {
                false
            }' @ [78:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'verifyKey' @ [78:24] ==> public final val verifyKey: CompositeKey defined in net.corda.core.crypto.composite.CompositeSignature.State[PropertyDescriptorImpl]

'isFulfilledBy' @ [78:34] ==> public final fun isFulfilledBy(keysToCheck: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto.composite.CompositeKey[SimpleFunctionDescriptorImpl]

'sig' @ [78:48] ==> val sig: CompositeSignaturesWithKeys defined in net.corda.core.crypto.composite.CompositeSignature.State.engineVerify[LocalVariableDescriptor]

'sigs' @ [78:52] ==> public final val sigs: List<TransactionSignature> defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[PropertyDescriptorImpl]

'map' @ [78:57] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [78:63] ==> value-parameter it: TransactionSignature defined in net.corda.core.crypto.composite.CompositeSignature.State.engineVerify.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [78:66] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'SecureHash' @ [79:33] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'SHA256' @ [79:44] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[ClassConstructorDescriptorImpl]

'buffer' @ [79:51] ==> public final val buffer: ByteArrayOutputStream defined in net.corda.core.crypto.composite.CompositeSignature.State[PropertyDescriptorImpl]

'toByteArray' @ [79:58] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'sig' @ [80:17] ==> val sig: CompositeSignaturesWithKeys defined in net.corda.core.crypto.composite.CompositeSignature.State.engineVerify[LocalVariableDescriptor]

'sigs' @ [80:21] ==> public final val sigs: List<TransactionSignature> defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[PropertyDescriptorImpl]

'all' @ [80:26] ==> public inline fun <T> Iterable<TransactionSignature>.all(predicate: (TransactionSignature) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'it' @ [80:32] ==> value-parameter it: TransactionSignature defined in net.corda.core.crypto.composite.CompositeSignature.State.engineVerify.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [80:35] ==> @Throws public final fun isValid(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[SimpleFunctionDescriptorImpl]

'clearData' @ [80:43] ==> val clearData: SecureHash.SHA256 defined in net.corda.core.crypto.composite.CompositeSignature.State.engineVerify[LocalVariableDescriptor]

