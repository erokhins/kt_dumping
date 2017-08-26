'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'Throws' @ [18:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IllegalArgumentException' @ [18:9] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'InvalidKeyException' @ [18:42] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'SignatureException' @ [18:70] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'DigitalSignature' @ [20:12] ==> public constructor DigitalSignature(bytes: ByteArray) defined in net.corda.core.crypto.DigitalSignature[ClassConstructorDescriptorImpl]

'Crypto' @ [20:29] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'doSign' @ [20:36] ==> @JvmStatic @Throws public final fun doSign(privateKey: PrivateKey, clearData: ByteArray): ByteArray defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'this' @ [20:43] ==> <this> defined in net.corda.core.crypto.sign[ReceiverParameterDescriptorImpl]

'bytesToSign' @ [20:49] ==> value-parameter bytesToSign: ByteArray defined in net.corda.core.crypto.sign[ValueParameterDescriptorImpl]

'WithKey' @ [24:29] ==> public constructor WithKey(by: PublicKey, bytes: ByteArray) defined in net.corda.core.crypto.DigitalSignature.WithKey[ClassConstructorDescriptorImpl]

'publicKey' @ [24:37] ==> value-parameter publicKey: PublicKey defined in net.corda.core.crypto.sign[ValueParameterDescriptorImpl]

'this' @ [24:48] ==> <this> defined in net.corda.core.crypto.sign[ReceiverParameterDescriptorImpl]

'sign' @ [24:53] ==> @Throws public fun PrivateKey.sign(bytesToSign: ByteArray): DigitalSignature defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'bytesToSign' @ [24:58] ==> value-parameter bytesToSign: ByteArray defined in net.corda.core.crypto.sign[ValueParameterDescriptorImpl]

'bytes' @ [24:71] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.DigitalSignature[PropertyDescriptorImpl]

'Throws' @ [35:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IllegalArgumentException' @ [35:9] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'InvalidKeyException' @ [35:42] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'SignatureException' @ [35:70] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'private' @ [36:44] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'sign' @ [36:52] ==> public fun PrivateKey.sign(bytesToSign: ByteArray, publicKey: PublicKey): DigitalSignature.WithKey defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'bytesToSign' @ [36:57] ==> value-parameter bytesToSign: ByteArray defined in net.corda.core.crypto.sign[ValueParameterDescriptorImpl]

'public' @ [36:70] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'sign' @ [37:46] ==> @Throws public fun KeyPair.sign(bytesToSign: ByteArray): DigitalSignature.WithKey defined in net.corda.core.crypto[SimpleFunctionDescriptorImpl]

'bytesToSign' @ [37:51] ==> value-parameter bytesToSign: OpaqueBytes defined in net.corda.core.crypto.sign[ValueParameterDescriptorImpl]

'bytes' @ [37:63] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[PropertyDescriptorImpl]

'Throws' @ [46:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeyException' @ [46:9] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'SignatureException' @ [46:37] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'Crypto' @ [47:70] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'doSign' @ [47:77] ==> @JvmStatic @Throws public final fun doSign(keyPair: KeyPair, signableData: SignableData): TransactionSignature defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'this' @ [47:84] ==> <this> defined in net.corda.core.crypto.sign[ReceiverParameterDescriptorImpl]

'signableData' @ [47:90] ==> value-parameter signableData: SignableData defined in net.corda.core.crypto.sign[ValueParameterDescriptorImpl]

'Throws' @ [58:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'SignatureException' @ [58:9] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'IllegalArgumentException' @ [58:36] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'InvalidKeyException' @ [58:69] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'Crypto' @ [59:73] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'doVerify' @ [59:80] ==> @JvmStatic @Throws public final fun doVerify(publicKey: PublicKey, signatureData: ByteArray, clearData: ByteArray): Boolean defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'this' @ [59:89] ==> <this> defined in net.corda.core.crypto.verify[ReceiverParameterDescriptorImpl]

'signature' @ [59:95] ==> value-parameter signature: DigitalSignature defined in net.corda.core.crypto.verify[ValueParameterDescriptorImpl]

'bytes' @ [59:105] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.DigitalSignature[PropertyDescriptorImpl]

'content' @ [59:112] ==> value-parameter content: ByteArray defined in net.corda.core.crypto.verify[ValueParameterDescriptorImpl]

'Throws' @ [73:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IllegalStateException' @ [73:9] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'SignatureException' @ [73:39] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'IllegalArgumentException' @ [73:66] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [75:9] ==> <this> defined in net.corda.core.crypto.isValid[ReceiverParameterDescriptorImpl]

'IllegalStateException' @ [76:15] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'Crypto' @ [77:12] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'isValid' @ [77:19] ==> @JvmStatic @Throws public final fun isValid(publicKey: PublicKey, signatureData: ByteArray, clearData: ByteArray): Boolean defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'this' @ [77:27] ==> <this> defined in net.corda.core.crypto.isValid[ReceiverParameterDescriptorImpl]

'signature' @ [77:33] ==> value-parameter signature: DigitalSignature defined in net.corda.core.crypto.isValid[ValueParameterDescriptorImpl]

'bytes' @ [77:43] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.DigitalSignature[PropertyDescriptorImpl]

'content' @ [77:50] ==> value-parameter content: ByteArray defined in net.corda.core.crypto.isValid[ValueParameterDescriptorImpl]

'+' @ [81:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [81:49] ==> <this> defined in net.corda.core.crypto.toStringShort[ReceiverParameterDescriptorImpl]

'toSHA256Bytes' @ [81:54] ==> public fun PublicKey.toSHA256Bytes(): ByteArray defined in net.corda.core.crypto in file EncodingUtils.kt[SimpleFunctionDescriptorImpl]

'toBase58' @ [81:70] ==> public fun ByteArray.toBase58(): String defined in net.corda.core.crypto in file EncodingUtils.kt[SimpleFunctionDescriptorImpl]

'if (this is CompositeKey) this.leafKeys
    else setOf(this)' @ [84:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<PublicKey>, elseBranch: Set<PublicKey>): Set<PublicKey>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<PublicKey>

'this' @ [84:16] ==> <this> defined in net.corda.core.crypto.keys[ReceiverParameterDescriptorImpl]

'this' @ [84:38] ==> <this> defined in net.corda.core.crypto.keys[ReceiverParameterDescriptorImpl]

'leafKeys' @ [84:43] ==> public final val leafKeys: Set<PublicKey> defined in net.corda.core.crypto.composite.CompositeKey[PropertyDescriptorImpl]

'setOf' @ [85:10] ==> public fun <T> setOf(element: PublicKey): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'this' @ [85:16] ==> <this> defined in net.corda.core.crypto.keys[ReceiverParameterDescriptorImpl]

'isFulfilledBy' @ [88:62] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[SimpleFunctionDescriptorImpl]

'setOf' @ [88:76] ==> public fun <T> setOf(element: PublicKey): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'otherKey' @ [88:82] ==> value-parameter otherKey: PublicKey defined in net.corda.core.crypto.isFulfilledBy[ValueParameterDescriptorImpl]

'if (this is CompositeKey) this.isFulfilledBy(otherKeys)
    else this in otherKeys' @ [90:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [90:16] ==> <this> defined in net.corda.core.crypto.isFulfilledBy[ReceiverParameterDescriptorImpl]

'this' @ [90:38] ==> <this> defined in net.corda.core.crypto.isFulfilledBy[ReceiverParameterDescriptorImpl]

'isFulfilledBy' @ [90:43] ==> public final fun isFulfilledBy(keysToCheck: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto.composite.CompositeKey[SimpleFunctionDescriptorImpl]

'otherKeys' @ [90:57] ==> value-parameter otherKeys: Iterable<PublicKey> defined in net.corda.core.crypto.isFulfilledBy[ValueParameterDescriptorImpl]

'this' @ [91:10] ==> <this> defined in net.corda.core.crypto.isFulfilledBy[ReceiverParameterDescriptorImpl]

'otherKeys' @ [91:18] ==> value-parameter otherKeys: Iterable<PublicKey> defined in net.corda.core.crypto.isFulfilledBy[ValueParameterDescriptorImpl]

'if (this is CompositeKey) keys.intersect(otherKeys).isNotEmpty()
    else this in otherKeys' @ [96:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [96:16] ==> <this> defined in net.corda.core.crypto.containsAny[ReceiverParameterDescriptorImpl]

'keys' @ [96:38] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto in file CryptoUtils.kt[PropertyDescriptorImpl]

'intersect' @ [96:43] ==> public infix fun <T> Iterable<PublicKey>.intersect(other: Iterable<PublicKey>): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'otherKeys' @ [96:53] ==> value-parameter otherKeys: Iterable<PublicKey> defined in net.corda.core.crypto.containsAny[ValueParameterDescriptorImpl]

'isNotEmpty' @ [96:64] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'this' @ [97:10] ==> <this> defined in net.corda.core.crypto.containsAny[ReceiverParameterDescriptorImpl]

'otherKeys' @ [97:18] ==> value-parameter otherKeys: Iterable<PublicKey> defined in net.corda.core.crypto.containsAny[ValueParameterDescriptorImpl]

'map' @ [101:47] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [101:53] ==> value-parameter it: TransactionSignature defined in net.corda.core.crypto.byKeys.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [101:56] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'toSet' @ [101:61] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'this' @ [104:49] ==> <this> defined in net.corda.core.crypto.component1[ReceiverParameterDescriptorImpl]

'private' @ [104:54] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'this' @ [106:48] ==> <this> defined in net.corda.core.crypto.component2[ReceiverParameterDescriptorImpl]

'public' @ [106:53] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Crypto' @ [109:34] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'generateKeyPair' @ [109:41] ==> @JvmOverloads @JvmStatic public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'Crypto' @ [116:54] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'deriveKeyPairFromEntropy' @ [116:61] ==> @JvmStatic public final fun deriveKeyPairFromEntropy(entropy: BigInteger): KeyPair defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'entropy' @ [116:86] ==> value-parameter entropy: BigInteger defined in net.corda.core.crypto.entropyToKeyPair[ValueParameterDescriptorImpl]

'Throws' @ [128:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeyException' @ [128:9] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'SignatureException' @ [128:37] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'IllegalArgumentException' @ [128:64] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'Crypto' @ [129:81] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'doVerify' @ [129:88] ==> @JvmStatic @Throws public final fun doVerify(publicKey: PublicKey, signatureData: ByteArray, clearData: ByteArray): Boolean defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'this' @ [129:97] ==> <this> defined in net.corda.core.crypto.verify[ReceiverParameterDescriptorImpl]

'signatureData' @ [129:103] ==> value-parameter signatureData: ByteArray defined in net.corda.core.crypto.verify[ValueParameterDescriptorImpl]

'clearData' @ [129:118] ==> value-parameter clearData: ByteArray defined in net.corda.core.crypto.verify[ValueParameterDescriptorImpl]

'Throws' @ [141:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'InvalidKeyException' @ [141:9] ==> public constructor InvalidKeyException() defined in java.security.InvalidKeyException[JavaClassConstructorDescriptor]

'SignatureException' @ [141:37] ==> public constructor SignatureException() defined in java.security.SignatureException[JavaClassConstructorDescriptor]

'IllegalArgumentException' @ [141:64] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'Crypto' @ [142:79] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'doVerify' @ [142:86] ==> @JvmStatic @Throws public final fun doVerify(publicKey: PublicKey, signatureData: ByteArray, clearData: ByteArray): Boolean defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'this' @ [142:95] ==> <this> defined in net.corda.core.crypto.verify[ReceiverParameterDescriptorImpl]

'public' @ [142:100] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'signatureData' @ [142:108] ==> value-parameter signatureData: ByteArray defined in net.corda.core.crypto.verify[ValueParameterDescriptorImpl]

'clearData' @ [142:123] ==> value-parameter clearData: ByteArray defined in net.corda.core.crypto.verify[ValueParameterDescriptorImpl]

'Throws' @ [152:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NoSuchAlgorithmException' @ [152:9] ==> public constructor NoSuchAlgorithmException() defined in java.security.NoSuchAlgorithmException[JavaClassConstructorDescriptor]

'newSecureRandom' @ [154:12] ==> @Throws public fun newSecureRandom(): SecureRandom defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'generateSeed' @ [154:30] ==> public open fun generateSeed(p0: Int): (ByteArray..ByteArray?) defined in java.security.SecureRandom[JavaMethodDescriptor]

'numOfBytes' @ [154:43] ==> value-parameter numOfBytes: Int defined in net.corda.core.crypto.secureRandomBytes[ValueParameterDescriptorImpl]

'Throws' @ [175:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NoSuchAlgorithmException' @ [175:9] ==> public constructor NoSuchAlgorithmException() defined in java.security.NoSuchAlgorithmException[JavaClassConstructorDescriptor]

'if (System.getProperty("os.name") == "Linux") {
        SecureRandom.getInstance("NativePRNGNonBlocking")
    } else {
        SecureRandom.getInstanceStrong()
    }' @ [177:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SecureRandom, elseBranch: SecureRandom): SecureRandom[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SecureRandom

'==' @ [177:16] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [177:23] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'getInstance' @ [178:22] ==> public open fun getInstance(p0: (String..String?)): (SecureRandom..SecureRandom?) defined in java.security.SecureRandom[JavaMethodDescriptor]

'getInstanceStrong' @ [180:22] ==> public open fun getInstanceStrong(): (SecureRandom..SecureRandom?) defined in java.security.SecureRandom[JavaMethodDescriptor]

'abs' @ [190:30] ==> public open fun abs(p0: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'newSecureRandom' @ [190:34] ==> @Throws public fun newSecureRandom(): SecureRandom defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'nextLong' @ [190:52] ==> public open fun nextLong(): Long defined in java.security.SecureRandom[JavaMethodDescriptor]

'candidate' @ [192:13] ==> val candidate: Long defined in net.corda.core.crypto.random63BitValue[LocalVariableDescriptor]

'candidate' @ [192:32] ==> val candidate: Long defined in net.corda.core.crypto.random63BitValue[LocalVariableDescriptor]

'Long' @ [192:45] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [192:50] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'candidate' @ [193:20] ==> val candidate: Long defined in net.corda.core.crypto.random63BitValue[LocalVariableDescriptor]

