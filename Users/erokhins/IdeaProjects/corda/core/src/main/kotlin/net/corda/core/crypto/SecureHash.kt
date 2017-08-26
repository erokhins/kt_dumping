'CordaSerializable' @ [13:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'OpaqueBytes' @ [14:45] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[ClassConstructorDescriptorImpl]

'bytes' @ [14:57] ==> value-parameter bytes: ByteArray defined in net.corda.core.crypto.SecureHash.<init>[ValueParameterDescriptorImpl]

'SecureHash' @ [16:38] ==> private constructor SecureHash(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash[ClassConstructorDescriptorImpl]

'bytes' @ [16:49] ==> value-parameter bytes: ByteArray defined in net.corda.core.crypto.SecureHash.SHA256.<init>[ValueParameterDescriptorImpl]

'require' @ [18:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bytes' @ [18:21] ==> value-parameter bytes: ByteArray defined in net.corda.core.crypto.SecureHash.SHA256.<init>[ValueParameterDescriptorImpl]

'size' @ [18:27] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'bytes' @ [22:39] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[PropertyDescriptorImpl]

'toHexString' @ [22:45] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities in file ByteArrays.kt[SimpleFunctionDescriptorImpl]

'toString' @ [24:43] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[SimpleFunctionDescriptorImpl]

'substring' @ [24:54] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'prefixLen' @ [24:67] ==> value-parameter prefixLen: Int = ... defined in net.corda.core.crypto.SecureHash.prefixChars[ValueParameterDescriptorImpl]

'this' @ [25:42] ==> <this> defined in net.corda.core.crypto.SecureHash[LazyClassReceiverParameterDescriptor]

'bytes' @ [25:47] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[PropertyDescriptorImpl]

'other' @ [25:55] ==> value-parameter other: SecureHash defined in net.corda.core.crypto.SecureHash.hashConcat[ValueParameterDescriptorImpl]

'bytes' @ [25:61] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[PropertyDescriptorImpl]

'sha256' @ [25:68] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto in file SecureHash.kt[SimpleFunctionDescriptorImpl]

'JvmStatic' @ [29:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'str' @ [30:34] ==> value-parameter str: String defined in net.corda.core.crypto.SecureHash.Companion.parse[ValueParameterDescriptorImpl]

'toUpperCase' @ [30:38] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parseAsHex' @ [30:52] ==> public fun String.parseAsHex(): ByteArray defined in net.corda.core.utilities in file ByteArrays.kt[SimpleFunctionDescriptorImpl]

'let' @ [30:65] ==> @InlineOnly public inline fun <T, R> ByteArray.let(block: (ByteArray) -> SecureHash.SHA256): SecureHash.SHA256 defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray
    <R> -> SHA256

'when (it.size) {
                32 -> SHA256(it)
                else -> throw IllegalArgumentException("Provided string is ${it.size} bytes not 32 bytes in hex: $str")
            }' @ [31:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SecureHash.SHA256, entry1: SecureHash.SHA256): SecureHash.SHA256[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SHA256

'it' @ [31:19] ==> value-parameter it: ByteArray defined in net.corda.core.crypto.SecureHash.Companion.parse.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [31:22] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'SHA256' @ [32:23] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[ClassConstructorDescriptorImpl]

'it' @ [32:30] ==> value-parameter it: ByteArray defined in net.corda.core.crypto.SecureHash.Companion.parse.<anonymous>[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [33:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'it' @ [33:78] ==> value-parameter it: ByteArray defined in net.corda.core.crypto.SecureHash.Companion.parse.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [33:81] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'str' @ [33:115] ==> value-parameter str: String defined in net.corda.core.crypto.SecureHash.Companion.parse[ValueParameterDescriptorImpl]

'JvmStatic' @ [37:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'SHA256' @ [37:51] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[ClassConstructorDescriptorImpl]

'getInstance' @ [37:72] ==> public open fun getInstance(p0: (String..String?)): (MessageDigest..MessageDigest?) defined in java.security.MessageDigest[JavaMethodDescriptor]

'digest' @ [37:95] ==> public open fun digest(p0: (ByteArray..ByteArray?)): (ByteArray..ByteArray?) defined in java.security.MessageDigest[JavaMethodDescriptor]

'bytes' @ [37:102] ==> value-parameter bytes: ByteArray defined in net.corda.core.crypto.SecureHash.Companion.sha256[ValueParameterDescriptorImpl]

'JvmStatic' @ [38:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'sha256' @ [38:56] ==> @JvmStatic public final fun sha256(bytes: ByteArray): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'sha256' @ [38:63] ==> @JvmStatic public final fun sha256(bytes: ByteArray): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'bytes' @ [38:70] ==> value-parameter bytes: ByteArray defined in net.corda.core.crypto.SecureHash.Companion.sha256Twice[ValueParameterDescriptorImpl]

'bytes' @ [38:77] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash.SHA256[PropertyDescriptorImpl]

'JvmStatic' @ [39:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'sha256' @ [39:46] ==> @JvmStatic public final fun sha256(bytes: ByteArray): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'str' @ [39:53] ==> value-parameter str: String defined in net.corda.core.crypto.SecureHash.Companion.sha256[ValueParameterDescriptorImpl]

'toByteArray' @ [39:57] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [41:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'sha256' @ [41:41] ==> @JvmStatic public final fun sha256(bytes: ByteArray): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'newSecureRandom' @ [41:48] ==> @Throws public fun newSecureRandom(): SecureRandom defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'generateSeed' @ [41:66] ==> public open fun generateSeed(p0: Int): (ByteArray..ByteArray?) defined in java.security.SecureRandom[JavaMethodDescriptor]

'SecureHash' @ [42:24] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'SHA256' @ [42:35] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[ClassConstructorDescriptorImpl]

'ByteArray' @ [42:42] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'toByte' @ [42:60] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SecureHash' @ [48:45] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'sha256' @ [48:56] ==> @JvmStatic public final fun sha256(bytes: ByteArray): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'this' @ [48:63] ==> <this> defined in net.corda.core.crypto.sha256[ReceiverParameterDescriptorImpl]

'SecureHash' @ [49:47] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'sha256' @ [49:58] ==> @JvmStatic public final fun sha256(bytes: ByteArray): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[SimpleFunctionDescriptorImpl]

'this' @ [49:65] ==> <this> defined in net.corda.core.crypto.sha256[ReceiverParameterDescriptorImpl]

'bytes' @ [49:70] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[PropertyDescriptorImpl]

