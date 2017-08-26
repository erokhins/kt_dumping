'TestDependencyInjectionBase' @ [23:27] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'Rule' @ [24:5] ==> public constructor Rule() defined in org.junit.Rule[JavaClassConstructorDescriptor]

'JvmField' @ [25:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'TemporaryFolder' @ [26:39] ==> public constructor TemporaryFolder() defined in org.junit.rules.TemporaryFolder[JavaClassConstructorDescriptor]

'generateKeyPair' @ [28:28] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'generateKeyPair' @ [29:26] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'generateKeyPair' @ [30:30] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'aliceKey' @ [32:45] ==> private final val aliceKey: KeyPair defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'public' @ [32:54] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'bobKey' @ [33:43] ==> private final val bobKey: KeyPair defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'public' @ [33:50] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'charlieKey' @ [34:47] ==> private final val charlieKey: KeyPair defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'public' @ [34:58] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'OpaqueBytes' @ [36:27] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'toByteArray' @ [36:53] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'message' @ [37:30] ==> private final val message: OpaqueBytes defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'sha256' @ [37:38] ==> public fun OpaqueBytes.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'lazy' @ [40:27] ==> public fun <T> lazy(initializer: () -> TransactionSignature): Lazy<TransactionSignature> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceKey' @ [40:34] ==> private final val aliceKey: KeyPair defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'sign' @ [40:43] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [40:48] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [40:61] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [40:73] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [40:94] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [40:101] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [40:121] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'schemeNumberID' @ [40:137] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'lazy' @ [41:25] ==> public fun <T> lazy(initializer: () -> TransactionSignature): Lazy<TransactionSignature> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'bobKey' @ [41:32] ==> private final val bobKey: KeyPair defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'sign' @ [41:39] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [41:44] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [41:57] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [41:69] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [41:90] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [41:97] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'bobPublicKey' @ [41:117] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'schemeNumberID' @ [41:131] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'lazy' @ [42:29] ==> public fun <T> lazy(initializer: () -> TransactionSignature): Lazy<TransactionSignature> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'charlieKey' @ [42:36] ==> private final val charlieKey: KeyPair defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'sign' @ [42:47] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [42:52] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [42:65] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [42:77] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [42:98] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [42:105] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'charliePublicKey' @ [42:125] ==> private final val charliePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'schemeNumberID' @ [42:143] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [46:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [46:22] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'isFulfilledBy' @ [46:37] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'aliceSignature' @ [46:51] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [46:66] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'assertFalse' @ [47:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [47:23] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'isFulfilledBy' @ [47:38] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'charlieSignature' @ [47:52] ==> public final val charlieSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [47:69] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'Test' @ [50:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [52:26] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [52:39] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [52:49] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [52:57] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [52:73] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [52:87] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [53:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceOrBob' @ [53:22] ==> val aliceOrBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice or Bob) fulfilled by either signature`[LocalVariableDescriptor]

'isFulfilledBy' @ [53:33] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'aliceSignature' @ [53:47] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [53:62] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'assertTrue' @ [54:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceOrBob' @ [54:22] ==> val aliceOrBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice or Bob) fulfilled by either signature`[LocalVariableDescriptor]

'isFulfilledBy' @ [54:33] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'bobSignature' @ [54:47] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [54:60] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'assertTrue' @ [55:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceOrBob' @ [55:22] ==> val aliceOrBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice or Bob) fulfilled by either signature`[LocalVariableDescriptor]

'isFulfilledBy' @ [55:33] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'listOf' @ [55:47] ==> public fun <T> listOf(vararg elements: PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'aliceSignature' @ [55:54] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [55:69] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'bobSignature' @ [55:73] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [55:86] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'assertFalse' @ [56:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceOrBob' @ [56:23] ==> val aliceOrBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice or Bob) fulfilled by either signature`[LocalVariableDescriptor]

'isFulfilledBy' @ [56:34] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'charlieSignature' @ [56:48] ==> public final val charlieSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [56:65] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'Test' @ [59:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [61:27] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [61:40] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [61:50] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [61:58] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [61:74] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [61:88] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'listOf' @ [62:26] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [62:33] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobSignature' @ [62:49] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'assertTrue' @ [63:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [63:22] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice and Bob) fulfilled by Alice, Bob signatures`[LocalVariableDescriptor]

'isFulfilledBy' @ [63:34] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signatures' @ [63:48] ==> val signatures: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`(Alice and Bob) fulfilled by Alice, Bob signatures`[LocalVariableDescriptor]

'byKeys' @ [63:59] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Test' @ [66:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [68:27] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [68:40] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [68:50] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [68:58] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [68:74] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [68:88] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [69:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [69:23] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice and Bob) requires both signatures to fulfil`[LocalVariableDescriptor]

'isFulfilledBy' @ [69:35] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'listOf' @ [69:49] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [69:56] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'byKeys' @ [69:72] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [70:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [70:23] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice and Bob) requires both signatures to fulfil`[LocalVariableDescriptor]

'isFulfilledBy' @ [70:35] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'listOf' @ [70:49] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'bobSignature' @ [70:56] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'byKeys' @ [70:70] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [71:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [71:22] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`(Alice and Bob) requires both signatures to fulfil`[LocalVariableDescriptor]

'isFulfilledBy' @ [71:34] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'listOf' @ [71:48] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [71:55] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobSignature' @ [71:71] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'byKeys' @ [71:85] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Test' @ [74:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [77:27] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [77:40] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [77:50] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [77:58] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [77:74] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [77:88] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [78:36] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [78:49] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [78:59] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [78:67] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`((Alice and Bob) or Charlie) signature verifies`[LocalVariableDescriptor]

'charliePublicKey' @ [78:80] ==> private final val charliePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [78:98] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'listOf' @ [80:26] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [80:33] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobSignature' @ [80:49] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'assertTrue' @ [82:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'aliceAndBobOrCharlie' @ [82:22] ==> val aliceAndBobOrCharlie: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`((Alice and Bob) or Charlie) signature verifies`[LocalVariableDescriptor]

'isFulfilledBy' @ [82:43] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signatures' @ [82:57] ==> val signatures: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`((Alice and Bob) or Charlie) signature verifies`[LocalVariableDescriptor]

'byKeys' @ [82:68] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Test' @ [85:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [87:27] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [87:40] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [87:50] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [87:58] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [87:74] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [87:88] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [88:36] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [88:49] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [88:59] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [88:67] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`encoded tree decodes correctly`[LocalVariableDescriptor]

'charliePublicKey' @ [88:80] ==> private final val charliePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [88:98] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'aliceAndBobOrCharlie' @ [90:23] ==> val aliceAndBobOrCharlie: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`encoded tree decodes correctly`[LocalVariableDescriptor]

'toBase58String' @ [90:44] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'parsePublicKeyBase58' @ [91:23] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'encoded' @ [91:44] ==> val encoded: String defined in net.corda.core.crypto.CompositeKeyTests.`encoded tree decodes correctly`[LocalVariableDescriptor]

'assertEquals' @ [93:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'decoded' @ [93:22] ==> val decoded: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`encoded tree decodes correctly`[LocalVariableDescriptor]

'aliceAndBobOrCharlie' @ [93:31] ==> val aliceAndBobOrCharlie: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`encoded tree decodes correctly`[LocalVariableDescriptor]

'Test' @ [96:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [98:27] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [98:40] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [98:50] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [98:58] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [98:74] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [98:88] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [99:36] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [99:49] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [99:59] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [99:67] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly`[LocalVariableDescriptor]

'charliePublicKey' @ [99:80] ==> private final val charliePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [99:98] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'aliceAndBobOrCharlie' @ [101:23] ==> val aliceAndBobOrCharlie: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly`[LocalVariableDescriptor]

'encoded' @ [101:44] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'CompositeKey' @ [102:23] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'getInstance' @ [102:36] ==> public final fun getInstance(encoded: ByteArray): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Companion[DeserializedSimpleFunctionDescriptor]

'encoded' @ [102:48] ==> val encoded: (ByteArray..ByteArray?) defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly`[LocalVariableDescriptor]

'assertEquals' @ [104:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'decoded' @ [104:22] ==> val decoded: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly`[LocalVariableDescriptor]

'aliceAndBobOrCharlie' @ [104:31] ==> val aliceAndBobOrCharlie: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly`[LocalVariableDescriptor]

'Test' @ [107:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [109:27] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [109:40] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [110:18] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [110:25] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'addKey' @ [111:18] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'bobPublicKey' @ [111:25] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [112:18] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [114:36] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [114:49] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [115:18] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'aliceAndBob' @ [115:25] ==> val aliceAndBob: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly with weighting`[LocalVariableDescriptor]

'addKey' @ [116:18] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'charliePublicKey' @ [116:25] ==> private final val charliePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [117:18] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'aliceAndBobOrCharlie' @ [119:23] ==> val aliceAndBobOrCharlie: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly with weighting`[LocalVariableDescriptor]

'encoded' @ [119:44] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'CompositeKey' @ [120:23] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'getInstance' @ [120:36] ==> public final fun getInstance(encoded: ByteArray): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Companion[DeserializedSimpleFunctionDescriptor]

'encoded' @ [120:48] ==> val encoded: (ByteArray..ByteArray?) defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly with weighting`[LocalVariableDescriptor]

'assertEquals' @ [122:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'decoded' @ [122:22] ==> val decoded: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly with weighting`[LocalVariableDescriptor]

'aliceAndBobOrCharlie' @ [122:31] ==> val aliceAndBobOrCharlie: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`der encoded tree decodes correctly with weighting`[LocalVariableDescriptor]

'Test' @ [125:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [127:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'CompositeKey' @ [127:22] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [127:35] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [127:45] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [127:53] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [127:69] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [127:78] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'CompositeKey' @ [128:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [128:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [128:44] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [128:52] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [128:68] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [128:82] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [129:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [129:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [129:44] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [129:52] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [129:68] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [129:82] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [130:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'node2' @ [130:21] ==> val node2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'isFulfilledBy' @ [130:27] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [130:41] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'CompositeKey' @ [132:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [132:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [132:44] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node1' @ [132:51] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'addKey' @ [132:62] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node2' @ [132:69] ==> val node2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'build' @ [132:80] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [133:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [133:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [133:44] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node2' @ [133:51] ==> val node2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'addKey' @ [133:62] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node1' @ [133:69] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'build' @ [133:80] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [134:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'tree1' @ [134:22] ==> val tree1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'tree2' @ [134:29] ==> val tree2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'assertEquals' @ [135:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'tree1' @ [135:22] ==> val tree1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'hashCode' @ [135:28] ==> public open fun hashCode(): Int defined in java.security.PublicKey[DeserializedSimpleFunctionDescriptor]

'tree2' @ [135:40] ==> val tree2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'hashCode' @ [135:46] ==> public open fun hashCode(): Int defined in java.security.PublicKey[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [138:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [138:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [138:44] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node1' @ [138:52] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'node2' @ [138:59] ==> val node2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'build' @ [138:66] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [139:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [139:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [139:44] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node2' @ [139:52] ==> val node2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'node1' @ [139:59] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'build' @ [139:66] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [140:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'tree3' @ [140:22] ==> val tree3: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'tree4' @ [140:29] ==> val tree4: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'assertEquals' @ [141:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'tree3' @ [141:22] ==> val tree3: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'hashCode' @ [141:28] ==> public open fun hashCode(): Int defined in java.security.PublicKey[DeserializedSimpleFunctionDescriptor]

'tree4' @ [141:40] ==> val tree4: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'hashCode' @ [141:46] ==> public open fun hashCode(): Int defined in java.security.PublicKey[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [144:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [144:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [144:44] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node1' @ [144:51] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'addKey' @ [144:61] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node1' @ [144:68] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'build' @ [144:79] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [145:21] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [145:34] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [145:44] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node1' @ [145:51] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'addKey' @ [145:62] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'node1' @ [145:69] ==> val node1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'build' @ [145:79] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [146:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'tree5' @ [146:22] ==> val tree5: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'tree6' @ [146:29] ==> val tree6: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'assertEquals' @ [149:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'CompositeKey' @ [149:22] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [149:35] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [149:45] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'tree1' @ [149:53] ==> val tree1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'build' @ [149:60] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'tree1' @ [149:69] ==> val tree1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`tree canonical form`[LocalVariableDescriptor]

'Test' @ [155:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [157:26] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [157:39] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [157:49] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [157:57] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [157:73] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'charliePublicKey' @ [157:87] ==> private final val charliePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [157:105] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeSignature' @ [159:22] ==> public constructor CompositeSignature() defined in net.corda.core.crypto.composite.CompositeSignature[DeserializedClassConstructorDescriptor]

'engine' @ [160:9] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'initVerify' @ [160:16] ==> public final fun initVerify(p0: (PublicKey..PublicKey?)): Unit defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'twoOfThree' @ [160:27] ==> val twoOfThree: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'engine' @ [161:9] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'update' @ [161:16] ==> public final fun update(p0: (ByteArray..ByteArray?)): Unit defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'secureHash' @ [161:23] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bytes' @ [161:34] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedPropertyDescriptor]

'assertFalse' @ [163:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [163:23] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [163:30] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [163:37] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [163:65] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [163:72] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'serialize' @ [163:89] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [163:101] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'assertFalse' @ [164:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [164:23] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [164:30] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [164:37] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [164:65] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'bobSignature' @ [164:72] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'serialize' @ [164:87] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [164:99] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'assertFalse' @ [165:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [165:23] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [165:30] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [165:37] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [165:65] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'charlieSignature' @ [165:72] ==> public final val charlieSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'serialize' @ [165:91] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [165:103] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'assertTrue' @ [166:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [166:22] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [166:29] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [166:36] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [166:64] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [166:71] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobSignature' @ [166:87] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'serialize' @ [166:102] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [166:114] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'assertTrue' @ [167:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [167:22] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [167:29] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [167:36] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [167:64] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [167:71] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'charlieSignature' @ [167:87] ==> public final val charlieSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'serialize' @ [167:106] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [167:118] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'assertTrue' @ [168:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [168:22] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [168:29] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [168:36] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [168:64] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'bobSignature' @ [168:71] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'charlieSignature' @ [168:85] ==> public final val charlieSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'serialize' @ [168:104] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [168:116] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'assertTrue' @ [169:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [169:22] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [169:29] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [169:36] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [169:64] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [169:71] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobSignature' @ [169:87] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'charlieSignature' @ [169:101] ==> public final val charlieSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'serialize' @ [169:120] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [169:132] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'TransactionSignature' @ [172:34] ==> public constructor TransactionSignature(bytes: ByteArray, by: PublicKey, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.TransactionSignature[DeserializedClassConstructorDescriptor]

'aliceSignature' @ [172:55] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bytes' @ [172:70] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'bobSignature' @ [172:77] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [172:90] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'SignatureMetadata' @ [172:94] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [172:115] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [172:122] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'bobSignature' @ [172:142] ==> public final val bobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'by' @ [172:155] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'schemeNumberID' @ [172:159] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'assertFalse' @ [173:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'engine' @ [173:23] ==> val engine: CompositeSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'verify' @ [173:30] ==> public final fun verify(p0: (ByteArray..ByteArray?)): Boolean defined in net.corda.core.crypto.composite.CompositeSignature[JavaMethodDescriptor]

'CompositeSignaturesWithKeys' @ [173:37] ==> public constructor CompositeSignaturesWithKeys(sigs: List<TransactionSignature>) defined in net.corda.core.crypto.composite.CompositeSignaturesWithKeys[DeserializedClassConstructorDescriptor]

'listOf' @ [173:65] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'aliceSignature' @ [173:72] ==> public final val aliceSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'brokenBobSignature' @ [173:88] ==> val brokenBobSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`composite TransactionSignature verification `[LocalVariableDescriptor]

'serialize' @ [173:109] ==> public fun <T : Any> CompositeSignaturesWithKeys.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<CompositeSignaturesWithKeys> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompositeSignaturesWithKeys

'bytes' @ [173:121] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'Test' @ [176:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertFailsWith' @ [179:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [179:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [180:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [180:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [180:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [180:43] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'assertFailsWith' @ [183:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [183:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [184:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [184:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [184:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [184:43] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'-' @ [184:59] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [187:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [187:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [188:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [188:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [188:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [188:43] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [188:59] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [191:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [191:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [192:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [192:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [192:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [192:43] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [192:59] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'-' @ [192:65] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [195:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [195:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [196:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [196:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [196:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [196:43] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'addKey' @ [196:62] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'bobPublicKey' @ [196:69] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [196:86] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [199:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [199:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [200:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [200:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [200:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [200:43] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [200:62] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [203:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [203:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [204:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [204:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKey' @ [204:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [204:43] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'Int' @ [204:59] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [204:63] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'addKey' @ [204:74] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'bobPublicKey' @ [204:81] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'Int' @ [204:95] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [204:99] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'build' @ [204:110] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [207:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [207:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [208:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [208:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [208:36] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [208:44] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [208:60] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'alicePublicKey' @ [208:74] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [208:90] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [211:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [211:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'CompositeKey' @ [212:33] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [212:46] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [212:56] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [212:64] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [212:80] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [212:94] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [213:33] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [213:46] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [213:56] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'bobPublicKey' @ [213:64] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'alicePublicKey' @ [213:78] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [213:94] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [214:13] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [214:26] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [214:36] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'compositeKey1' @ [214:44] ==> val compositeKey1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key constraints`.<anonymous>[LocalVariableDescriptor]

'compositeKey2' @ [214:59] ==> val compositeKey2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key constraints`.<anonymous>[LocalVariableDescriptor]

'build' @ [214:74] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'Test' @ [218:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CompositeKey' @ [220:20] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [220:33] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [220:43] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [220:51] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'bobPublicKey' @ [220:67] ==> private final val bobPublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'build' @ [220:81] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [221:20] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [221:33] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [221:43] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [221:51] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'key1' @ [221:67] ==> val key1: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'build' @ [221:73] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [222:20] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [222:33] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [222:43] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [222:51] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'key2' @ [222:67] ==> val key2: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'build' @ [222:73] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [223:20] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [223:33] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [223:43] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [223:51] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'key3' @ [223:67] ==> val key3: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'build' @ [223:73] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [224:20] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [224:33] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [224:43] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [224:51] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'key4' @ [224:67] ==> val key4: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'build' @ [224:73] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [225:20] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [225:33] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [225:43] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'alicePublicKey' @ [225:51] ==> private final val alicePublicKey: PublicKey defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'key5' @ [225:67] ==> val key5: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'key2' @ [225:73] ==> val key2: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'build' @ [225:79] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'key1' @ [228:9] ==> val key1: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [228:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key2' @ [229:9] ==> val key2: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [229:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key3' @ [230:9] ==> val key3: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [230:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key4' @ [231:9] ==> val key4: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [231:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key5' @ [232:9] ==> val key5: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [232:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key6' @ [235:9] ==> val key6: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [235:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key3' @ [240:9] ==> val key3: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'declaredField' @ [240:14] ==> public fun <T> Any.declaredField(name: String): DeclaredField<List<CompositeKey.NodeAndWeight>> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<NodeAndWeight>

'value' @ [240:61] ==> public final var value: List<CompositeKey.NodeAndWeight> defined in net.corda.core.internal.DeclaredField[DeserializedPropertyDescriptor]

'key3' @ [240:69] ==> val key3: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'children' @ [240:74] ==> public final val children: List<CompositeKey.NodeAndWeight> defined in net.corda.core.crypto.composite.CompositeKey[DeserializedPropertyDescriptor]

'NodeAndWeight' @ [240:85] ==> public constructor NodeAndWeight(node: PublicKey, weight: Int) defined in net.corda.core.crypto.composite.CompositeKey.NodeAndWeight[DeserializedClassConstructorDescriptor]

'key5' @ [240:99] ==> val key5: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'assertFailsWith' @ [259:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [259:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'key3' @ [260:13] ==> val key3: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [260:18] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [264:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [264:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'key4' @ [265:13] ==> val key4: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [265:18] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [269:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [269:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'key5' @ [270:13] ==> val key5: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [270:18] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [275:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<IllegalArgumentException /* = IllegalArgumentException */>, block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> IllegalArgumentException

'IllegalArgumentException' @ [275:25] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'key6' @ [276:13] ==> val key6: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [276:18] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key2' @ [280:9] ==> val key2: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [280:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'key1' @ [281:9] ==> val key1: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`composite key validation with graph cycle detection`[LocalVariableDescriptor]

'checkValidity' @ [281:14] ==> public final fun checkValidity(): Unit defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'Test' @ [284:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Crypto' @ [286:26] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [286:33] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [286:49] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'RSA_SHA256' @ [286:56] ==> @field:JvmField public final val RSA_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [287:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [287:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [287:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256K1_SHA256' @ [287:55] ==> @field:JvmField public final val ECDSA_SECP256K1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [288:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [288:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [288:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256R1_SHA256' @ [288:55] ==> @field:JvmField public final val ECDSA_SECP256R1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [289:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [289:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [289:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [289:55] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [290:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [290:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [290:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'SPHINCS256_SHA256' @ [290:55] ==> @field:JvmField public final val SPHINCS256_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'keyPairRSA' @ [292:28] ==> val keyPairRSA: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'sign' @ [292:39] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [292:44] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [292:57] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [292:69] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [292:90] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [292:97] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairRSA' @ [292:117] ==> val keyPairRSA: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [292:128] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [292:136] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairK1' @ [293:27] ==> val keyPairK1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'sign' @ [293:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [293:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [293:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [293:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [293:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [293:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairK1' @ [293:115] ==> val keyPairK1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [293:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [293:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairR1' @ [294:27] ==> val keyPairR1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'sign' @ [294:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [294:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [294:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [294:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [294:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [294:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairR1' @ [294:115] ==> val keyPairR1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [294:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [294:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairEd' @ [295:27] ==> val keyPairEd: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'sign' @ [295:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [295:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [295:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [295:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [295:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [295:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairEd' @ [295:115] ==> val keyPairEd: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [295:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [295:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairSP' @ [296:27] ==> val keyPairSP: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'sign' @ [296:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [296:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [296:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [296:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [296:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [296:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairSP' @ [296:115] ==> val keyPairSP: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [296:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [296:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'CompositeKey' @ [298:28] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [298:41] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [298:51] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'keyPairRSA' @ [298:59] ==> val keyPairRSA: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [298:70] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairK1' @ [298:78] ==> val keyPairK1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [298:88] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairR1' @ [298:96] ==> val keyPairR1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [298:106] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairEd' @ [298:114] ==> val keyPairEd: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [298:124] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairSP' @ [298:132] ==> val keyPairSP: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'public' @ [298:142] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'build' @ [298:150] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'listOf' @ [300:26] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'RSASignature' @ [300:33] ==> val RSASignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'K1Signature' @ [300:47] ==> val K1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'R1Signature' @ [300:60] ==> val R1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'EdSignature' @ [300:73] ==> val EdSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'SPSignature' @ [300:86] ==> val SPSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'assertTrue' @ [301:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'compositeKey' @ [301:22] ==> val compositeKey: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'isFulfilledBy' @ [301:35] ==> public final fun isFulfilledBy(keysToCheck: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'signatures' @ [301:49] ==> val signatures: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'byKeys' @ [301:60] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'listOf' @ [304:36] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'K1Signature' @ [304:43] ==> val K1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'R1Signature' @ [304:56] ==> val R1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'EdSignature' @ [304:69] ==> val EdSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'SPSignature' @ [304:82] ==> val SPSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'assertFalse' @ [305:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'compositeKey' @ [305:23] ==> val compositeKey: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'isFulfilledBy' @ [305:36] ==> public final fun isFulfilledBy(keysToCheck: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'signaturesWithoutRSA' @ [305:50] ==> val signaturesWithoutRSA: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey from multiple signature schemes and signature verification`[LocalVariableDescriptor]

'byKeys' @ [305:71] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Test' @ [308:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Crypto' @ [311:26] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [311:33] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [311:49] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'RSA_SHA256' @ [311:56] ==> @field:JvmField public final val RSA_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [312:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [312:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [312:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256K1_SHA256' @ [312:55] ==> @field:JvmField public final val ECDSA_SECP256K1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [313:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [313:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [313:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256R1_SHA256' @ [313:55] ==> @field:JvmField public final val ECDSA_SECP256R1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [314:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [314:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [314:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [314:55] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [315:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [315:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [315:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'SPHINCS256_SHA256' @ [315:55] ==> @field:JvmField public final val SPHINCS256_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'keyPairRSA' @ [317:28] ==> val keyPairRSA: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'sign' @ [317:39] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [317:44] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [317:57] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [317:69] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [317:90] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [317:97] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairRSA' @ [317:117] ==> val keyPairRSA: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [317:128] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [317:136] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairK1' @ [318:27] ==> val keyPairK1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'sign' @ [318:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [318:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [318:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [318:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [318:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [318:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairK1' @ [318:115] ==> val keyPairK1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [318:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [318:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairR1' @ [319:27] ==> val keyPairR1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'sign' @ [319:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [319:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [319:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [319:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [319:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [319:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairR1' @ [319:115] ==> val keyPairR1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [319:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [319:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairEd' @ [320:27] ==> val keyPairEd: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'sign' @ [320:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [320:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [320:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [320:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [320:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [320:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairEd' @ [320:115] ==> val keyPairEd: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [320:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [320:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'keyPairSP' @ [321:27] ==> val keyPairSP: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'sign' @ [321:37] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'SignableData' @ [321:42] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'secureHash' @ [321:55] ==> private final val secureHash: SecureHash.SHA256 defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'SignatureMetadata' @ [321:67] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'Crypto' @ [321:88] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [321:95] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'keyPairSP' @ [321:115] ==> val keyPairSP: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [321:125] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'schemeNumberID' @ [321:133] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'CompositeKey' @ [323:28] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [323:41] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [323:51] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'keyPairRSA' @ [323:59] ==> val keyPairRSA: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [323:70] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairK1' @ [323:78] ==> val keyPairK1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [323:88] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairR1' @ [323:96] ==> val keyPairR1: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [323:106] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairEd' @ [323:114] ==> val keyPairEd: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [323:124] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPairSP' @ [323:132] ==> val keyPairSP: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'public' @ [323:142] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'build' @ [323:150] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'listOf' @ [325:26] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'RSASignature' @ [325:33] ==> val RSASignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'K1Signature' @ [325:47] ==> val K1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'R1Signature' @ [325:60] ==> val R1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'EdSignature' @ [325:73] ==> val EdSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'SPSignature' @ [325:86] ==> val SPSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'assertTrue' @ [326:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'compositeKey' @ [326:22] ==> val compositeKey: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'isFulfilledBy' @ [326:35] ==> public final fun isFulfilledBy(keysToCheck: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'signatures' @ [326:49] ==> val signatures: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'byKeys' @ [326:60] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'listOf' @ [328:36] ==> public fun <T> listOf(vararg elements: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'K1Signature' @ [328:43] ==> val K1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'R1Signature' @ [328:56] ==> val R1Signature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'EdSignature' @ [328:69] ==> val EdSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'SPSignature' @ [328:82] ==> val SPSignature: TransactionSignature defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'assertFalse' @ [329:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'compositeKey' @ [329:23] ==> val compositeKey: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'isFulfilledBy' @ [329:36] ==> public final fun isFulfilledBy(keysToCheck: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto.composite.CompositeKey[DeserializedSimpleFunctionDescriptor]

'signaturesWithoutRSA' @ [329:50] ==> val signaturesWithoutRSA: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'byKeys' @ [329:71] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [332:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [332:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [333:18] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [333:32] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [333:62] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'caKeyPair' @ [333:86] ==> val caKeyPair: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'X509Utilities' @ [336:32] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [336:46] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'IDENTITY' @ [336:80] ==> enum entry IDENTITY defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'ca' @ [336:90] ==> val ca: X509CertificateHolder defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'caKeyPair' @ [336:94] ==> val caKeyPair: KeyPair defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'X500Name' @ [336:105] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'compositeKey' @ [336:134] ==> val compositeKey: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'tempFolder' @ [339:28] ==> @Rule @JvmField public final val tempFolder: TemporaryFolder defined in net.corda.core.crypto.CompositeKeyTests[PropertyDescriptorImpl]

'root' @ [339:39] ==> public final val TemporaryFolder.root: (File..File?)[MyPropertyDescriptor]

'toPath' @ [339:44] ==> public open fun toPath(): (Path..Path?) defined in java.io.File[JavaMethodDescriptor]

'loadOrCreateKeyStore' @ [340:24] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'keystorePath' @ [340:45] ==> val keystorePath: Path defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'keystore' @ [341:9] ==> val keystore: KeyStore defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'setCertificateEntry' @ [341:18] ==> public final fun setCertificateEntry(p0: (String..String?), p1: (Certificate..Certificate?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'compositeKeyCert' @ [341:54] ==> val compositeKeyCert: X509CertificateHolder defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'cert' @ [341:71] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'keystore' @ [342:9] ==> val keystore: KeyStore defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'save' @ [342:18] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'keystorePath' @ [342:23] ==> val keystorePath: Path defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'loadKeyStore' @ [345:25] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'keystorePath' @ [345:38] ==> val keystorePath: Path defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'assertTrue' @ [346:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'keystore2' @ [346:22] ==> val keystore2: KeyStore defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'containsAlias' @ [346:32] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'keystore2' @ [348:19] ==> val keystore2: KeyStore defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'getCertificate' @ [348:29] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'publicKey' @ [348:60] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Crypto' @ [350:29] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'toSupportedPublicKey' @ [350:36] ==> @JvmStatic public final fun toSupportedPublicKey(key: PublicKey): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'key' @ [350:57] ==> val key: (PublicKey..PublicKey?) defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'assertTrue' @ [351:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'compositeKey2' @ [351:22] ==> val compositeKey2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'assertTrue' @ [354:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'compositeKey2' @ [354:22] ==> val compositeKey2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'isFulfilledBy' @ [354:36] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signatures' @ [354:50] ==> val signatures: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'byKeys' @ [354:61] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [355:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'compositeKey2' @ [355:23] ==> val compositeKey2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'isFulfilledBy' @ [355:37] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signaturesWithoutRSA' @ [355:51] ==> val signaturesWithoutRSA: List<TransactionSignature> defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'byKeys' @ [355:72] ==> public fun Iterable<TransactionSignature>.byKeys(): Set<PublicKey> defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [358:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PublicKey, actual: PublicKey, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PublicKey

'compositeKey' @ [358:22] ==> val compositeKey: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'compositeKey2' @ [358:36] ==> val compositeKey2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`Test save to keystore`[LocalVariableDescriptor]

'Test' @ [361:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'component1' @ [363:14] ==> public operator fun KeyPair.component1(): PrivateKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'component2' @ [363:17] ==> public operator fun KeyPair.component2(): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [363:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [363:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [363:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [363:55] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'component1' @ [364:14] ==> public operator fun KeyPair.component1(): PrivateKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'component2' @ [364:17] ==> public operator fun KeyPair.component2(): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [364:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [364:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [364:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256K1_SHA256' @ [364:55] ==> @field:JvmField public final val ECDSA_SECP256K1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'component1' @ [365:14] ==> public operator fun KeyPair.component1(): PrivateKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'component2' @ [365:17] ==> public operator fun KeyPair.component2(): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [365:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [365:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [365:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'RSA_SHA256' @ [365:55] ==> @field:JvmField public final val RSA_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'component1' @ [366:14] ==> public operator fun KeyPair.component1(): PrivateKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'component2' @ [366:17] ==> public operator fun KeyPair.component2(): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [366:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [366:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [366:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [366:55] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'component1' @ [367:14] ==> public operator fun KeyPair.component1(): PrivateKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'component2' @ [367:17] ==> public operator fun KeyPair.component2(): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [367:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [367:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [367:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256R1_SHA256' @ [367:55] ==> @field:JvmField public final val ECDSA_SECP256R1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'component1' @ [368:14] ==> public operator fun KeyPair.component1(): PrivateKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'component2' @ [368:17] ==> public operator fun KeyPair.component2(): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [368:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [368:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [368:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'SPHINCS256_SHA256' @ [368:55] ==> @field:JvmField public final val SPHINCS256_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'component1' @ [369:14] ==> public operator fun KeyPair.component1(): PrivateKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'component2' @ [369:17] ==> public operator fun KeyPair.component2(): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [369:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [369:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [369:48] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256K1_SHA256' @ [369:55] ==> @field:JvmField public final val ECDSA_SECP256K1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'CompositeKey' @ [372:26] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [372:39] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [372:49] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'pub1' @ [372:57] ==> val pub1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub2' @ [372:63] ==> val pub2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub3' @ [372:69] ==> val pub3: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub4' @ [372:75] ==> val pub4: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub5' @ [372:81] ==> val pub5: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub6' @ [372:87] ==> val pub6: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub7' @ [372:93] ==> val pub7: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'build' @ [372:99] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'CompositeKey' @ [374:26] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [374:39] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'addKeys' @ [374:49] ==> public final fun addKeys(vararg keys: PublicKey): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'pub7' @ [374:57] ==> val pub7: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub6' @ [374:63] ==> val pub6: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub5' @ [374:69] ==> val pub5: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub4' @ [374:75] ==> val pub4: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub3' @ [374:81] ==> val pub3: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub2' @ [374:87] ==> val pub2: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'pub1' @ [374:93] ==> val pub1: PublicKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'build' @ [374:99] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [376:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<CompositeKey.NodeAndWeight>, actual: List<CompositeKey.NodeAndWeight>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<NodeAndWeight>

'composite1' @ [376:22] ==> val composite1: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'children' @ [376:33] ==> public final val children: List<CompositeKey.NodeAndWeight> defined in net.corda.core.crypto.composite.CompositeKey[DeserializedPropertyDescriptor]

'composite2' @ [376:43] ==> val composite2: CompositeKey defined in net.corda.core.crypto.CompositeKeyTests.`CompositeKey deterministic children sorting`[LocalVariableDescriptor]

'children' @ [376:54] ==> public final val children: List<CompositeKey.NodeAndWeight> defined in net.corda.core.crypto.composite.CompositeKey[DeserializedPropertyDescriptor]

