'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [14:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'ByteArrayInputStream' @ [29:18] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?), p1: Int, p2: Int) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'bytes' @ [29:39] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'offset' @ [29:46] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'size' @ [29:54] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'require' @ [38:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'offset' @ [38:17] ==> value-parameter offset: Int defined in net.corda.core.utilities.ByteSequence.subSequence[ValueParameterDescriptorImpl]

'require' @ [39:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'offset' @ [39:17] ==> value-parameter offset: Int defined in net.corda.core.utilities.ByteSequence.subSequence[ValueParameterDescriptorImpl]

'size' @ [39:26] ==> value-parameter size: Int defined in net.corda.core.utilities.ByteSequence.subSequence[ValueParameterDescriptorImpl]

'this' @ [39:34] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'size' @ [39:39] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'if (offset == 0 && size == this.size) this else of(bytes, this.offset + offset, size)' @ [40:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ByteSequence, elseBranch: ByteSequence): ByteSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ByteSequence

'offset' @ [40:20] ==> value-parameter offset: Int defined in net.corda.core.utilities.ByteSequence.subSequence[ValueParameterDescriptorImpl]

'size' @ [40:35] ==> value-parameter size: Int defined in net.corda.core.utilities.ByteSequence.subSequence[ValueParameterDescriptorImpl]

'this' @ [40:43] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'size' @ [40:48] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'this' @ [40:54] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'of' @ [40:64] ==> @JvmStatic @JvmOverloads public final fun of(bytes: ByteArray, offset: Int = ..., size: Int = ...): ByteSequence defined in net.corda.core.utilities.ByteSequence.Companion[SimpleFunctionDescriptorImpl]

'bytes' @ [40:67] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'this' @ [40:74] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'offset' @ [40:79] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'offset' @ [40:88] ==> value-parameter offset: Int defined in net.corda.core.utilities.ByteSequence.subSequence[ValueParameterDescriptorImpl]

'size' @ [40:96] ==> value-parameter size: Int defined in net.corda.core.utilities.ByteSequence.subSequence[ValueParameterDescriptorImpl]

'JvmStatic' @ [48:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [49:9] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'bytes' @ [50:63] ==> value-parameter bytes: ByteArray defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'size' @ [50:69] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'if (offset == 0 && size == bytes.size && size != 0) OpaqueBytes(bytes) else OpaqueBytesSubSequence(bytes, offset, size)' @ [51:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ByteSequence, elseBranch: ByteSequence): ByteSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ByteSequence

'offset' @ [51:24] ==> value-parameter offset: Int = ... defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'size' @ [51:39] ==> value-parameter size: Int = ... defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'bytes' @ [51:47] ==> value-parameter bytes: ByteArray defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'size' @ [51:53] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'size' @ [51:61] ==> value-parameter size: Int = ... defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'OpaqueBytes' @ [51:72] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[ClassConstructorDescriptorImpl]

'bytes' @ [51:84] ==> value-parameter bytes: ByteArray defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'OpaqueBytesSubSequence' @ [51:96] ==> public constructor OpaqueBytesSubSequence(bytes: ByteArray, offset: Int, size: Int) defined in net.corda.core.utilities.OpaqueBytesSubSequence[ClassConstructorDescriptorImpl]

'bytes' @ [51:119] ==> value-parameter bytes: ByteArray defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'offset' @ [51:126] ==> value-parameter offset: Int = ... defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'size' @ [51:134] ==> value-parameter size: Int = ... defined in net.corda.core.utilities.ByteSequence.Companion.of[ValueParameterDescriptorImpl]

'require' @ [59:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'size' @ [59:17] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'n' @ [59:25] ==> value-parameter n: Int defined in net.corda.core.utilities.ByteSequence.take[ValueParameterDescriptorImpl]

'subSequence' @ [60:16] ==> public final fun subSequence(offset: Int, size: Int): ByteSequence defined in net.corda.core.utilities.ByteSequence[SimpleFunctionDescriptorImpl]

'n' @ [60:31] ==> value-parameter n: Int defined in net.corda.core.utilities.ByteSequence.take[ValueParameterDescriptorImpl]

'of' @ [67:32] ==> @JvmStatic @JvmOverloads public final fun of(bytes: ByteArray, offset: Int = ..., size: Int = ...): ByteSequence defined in net.corda.core.utilities.ByteSequence.Companion[SimpleFunctionDescriptorImpl]

'bytes' @ [67:35] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'copyOfRange' @ [67:41] ==> @InlineOnly public inline fun ByteArray.copyOfRange(fromIndex: Int, toIndex: Int): ByteArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'offset' @ [67:53] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'offset' @ [67:61] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'size' @ [67:70] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'minOf' @ [74:19] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Int, b: Int): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'this' @ [74:25] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'size' @ [74:30] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'other' @ [74:36] ==> value-parameter other: ByteSequence defined in net.corda.core.utilities.ByteSequence.compareTo[ValueParameterDescriptorImpl]

'size' @ [74:42] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'until' @ [76:23] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'min' @ [76:31] ==> val min: Int defined in net.corda.core.utilities.ByteSequence.compareTo[LocalVariableDescriptor]

'toUnsignedInt' @ [77:47] ==> public open fun toUnsignedInt(p0: Byte): Int defined in java.lang.Byte[JavaMethodDescriptor]

'this' @ [77:61] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'bytes' @ [77:66] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'this' @ [77:72] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'offset' @ [77:77] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'index' @ [77:86] ==> val index: Int defined in net.corda.core.utilities.ByteSequence.compareTo[LocalVariableDescriptor]

'toUnsignedInt' @ [78:48] ==> public open fun toUnsignedInt(p0: Byte): Int defined in java.lang.Byte[JavaMethodDescriptor]

'other' @ [78:62] ==> value-parameter other: ByteSequence defined in net.corda.core.utilities.ByteSequence.compareTo[ValueParameterDescriptorImpl]

'bytes' @ [78:68] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'other' @ [78:74] ==> value-parameter other: ByteSequence defined in net.corda.core.utilities.ByteSequence.compareTo[ValueParameterDescriptorImpl]

'offset' @ [78:80] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'index' @ [78:89] ==> val index: Int defined in net.corda.core.utilities.ByteSequence.compareTo[LocalVariableDescriptor]

'unsignedThis' @ [79:17] ==> val unsignedThis: Int defined in net.corda.core.utilities.ByteSequence.compareTo[LocalVariableDescriptor]

'unsignedOther' @ [79:33] ==> val unsignedOther: Int defined in net.corda.core.utilities.ByteSequence.compareTo[LocalVariableDescriptor]

'signum' @ [80:32] ==> public open fun signum(p0: Int): Int defined in java.lang.Integer[JavaMethodDescriptor]

'unsignedThis' @ [80:39] ==> val unsignedThis: Int defined in net.corda.core.utilities.ByteSequence.compareTo[LocalVariableDescriptor]

'unsignedOther' @ [80:54] ==> val unsignedOther: Int defined in net.corda.core.utilities.ByteSequence.compareTo[LocalVariableDescriptor]

'signum' @ [84:24] ==> public open fun signum(p0: Int): Int defined in java.lang.Integer[JavaMethodDescriptor]

'this' @ [84:31] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'size' @ [84:36] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'other' @ [84:43] ==> value-parameter other: ByteSequence defined in net.corda.core.utilities.ByteSequence.compareTo[ValueParameterDescriptorImpl]

'size' @ [84:49] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'this' @ [88:13] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'other' @ [88:22] ==> value-parameter other: Any? defined in net.corda.core.utilities.ByteSequence.equals[ValueParameterDescriptorImpl]

'other' @ [89:13] ==> value-parameter other: Any? defined in net.corda.core.utilities.ByteSequence.equals[ValueParameterDescriptorImpl]

'this' @ [90:13] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'size' @ [90:18] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'other' @ [90:26] ==> value-parameter other: Any? defined in net.corda.core.utilities.ByteSequence.equals[ValueParameterDescriptorImpl]

'size' @ [90:32] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'subArraysEqual' @ [91:16] ==> private final fun subArraysEqual(a: ByteArray, aOffset: Int, length: Int, b: ByteArray, bOffset: Int): Boolean defined in net.corda.core.utilities.ByteSequence[SimpleFunctionDescriptorImpl]

'this' @ [91:31] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'bytes' @ [91:36] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'this' @ [91:43] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'offset' @ [91:48] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'this' @ [91:56] ==> <this> defined in net.corda.core.utilities.ByteSequence[LazyClassReceiverParameterDescriptor]

'size' @ [91:61] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'other' @ [91:67] ==> value-parameter other: Any? defined in net.corda.core.utilities.ByteSequence.equals[ValueParameterDescriptorImpl]

'bytes' @ [91:73] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'other' @ [91:80] ==> value-parameter other: Any? defined in net.corda.core.utilities.ByteSequence.equals[ValueParameterDescriptorImpl]

'offset' @ [91:86] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'length' @ [95:30] ==> value-parameter length: Int defined in net.corda.core.utilities.ByteSequence.subArraysEqual[ValueParameterDescriptorImpl]

'aOffset' @ [96:20] ==> value-parameter aOffset: Int defined in net.corda.core.utilities.ByteSequence.subArraysEqual[ValueParameterDescriptorImpl]

'bOffset' @ [97:20] ==> value-parameter bOffset: Int defined in net.corda.core.utilities.ByteSequence.subArraysEqual[ValueParameterDescriptorImpl]

'bytesRemaining' @ [98:16] ==> var bytesRemaining: Int defined in net.corda.core.utilities.ByteSequence.subArraysEqual[LocalVariableDescriptor]

'a' @ [99:17] ==> value-parameter a: ByteArray defined in net.corda.core.utilities.ByteSequence.subArraysEqual[ValueParameterDescriptorImpl]

'aPos' @ [99:19] ==> var aPos: Int defined in net.corda.core.utilities.ByteSequence.subArraysEqual[LocalVariableDescriptor]

'b' @ [99:30] ==> value-parameter b: ByteArray defined in net.corda.core.utilities.ByteSequence.subArraysEqual[ValueParameterDescriptorImpl]

'bPos' @ [99:32] ==> var bPos: Int defined in net.corda.core.utilities.ByteSequence.subArraysEqual[LocalVariableDescriptor]

'offset' @ [106:23] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'offset' @ [106:37] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'size' @ [106:46] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'result' @ [107:13] ==> var result: Int defined in net.corda.core.utilities.ByteSequence.hashCode[LocalVariableDescriptor]

'*' @ [107:22] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [107:27] ==> var result: Int defined in net.corda.core.utilities.ByteSequence.hashCode[LocalVariableDescriptor]

'bytes' @ [107:36] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'index' @ [107:42] ==> val index: Int defined in net.corda.core.utilities.ByteSequence.hashCode[LocalVariableDescriptor]

'result' @ [109:16] ==> var result: Int defined in net.corda.core.utilities.ByteSequence.hashCode[LocalVariableDescriptor]

'bytes' @ [112:43] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'copyOfRange' @ [112:49] ==> @InlineOnly public inline fun ByteArray.copyOfRange(fromIndex: Int, toIndex: Int): ByteArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'offset' @ [112:61] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'offset' @ [112:69] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'size' @ [112:78] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[PropertyDescriptorImpl]

'toHexString' @ [112:84] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities in file ByteArrays.kt[SimpleFunctionDescriptorImpl]

'ByteSequence' @ [120:57] ==> private constructor ByteSequence() defined in net.corda.core.utilities.ByteSequence[ClassConstructorDescriptorImpl]

'JvmStatic' @ [122:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'OpaqueBytes' @ [123:34] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[ClassConstructorDescriptorImpl]

'byteArrayOf' @ [123:46] ==> public fun byteArrayOf(vararg elements: Byte): ByteArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'b' @ [123:59] ==> value-parameter vararg b: Byte defined in net.corda.core.utilities.OpaqueBytes.Companion.of[ValueParameterDescriptorImpl]

'require' @ [127:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'bytes' @ [127:17] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[PropertyDescriptorImpl]

'isNotEmpty' @ [127:23] ==> @InlineOnly public inline fun ByteArray.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'bytes' @ [130:36] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[PropertyDescriptorImpl]

'size' @ [130:42] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'Deprecated' @ [134:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'OpaqueBytes' @ [135:39] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[ClassConstructorDescriptorImpl]

'this' @ [135:51] ==> <this> defined in net.corda.core.utilities.opaque[ReceiverParameterDescriptorImpl]

'this' @ [137:53] ==> <this> defined in net.corda.core.utilities.sequence[ReceiverParameterDescriptorImpl]

'size' @ [137:58] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'ByteSequence' @ [137:66] ==> public companion object defined in net.corda.core.utilities.ByteSequence[FakeCallableDescriptorForObject]

'of' @ [137:79] ==> @JvmStatic @JvmOverloads public final fun of(bytes: ByteArray, offset: Int = ..., size: Int = ...): ByteSequence defined in net.corda.core.utilities.ByteSequence.Companion[SimpleFunctionDescriptorImpl]

'this' @ [137:82] ==> <this> defined in net.corda.core.utilities.sequence[ReceiverParameterDescriptorImpl]

'offset' @ [137:88] ==> value-parameter offset: Int = ... defined in net.corda.core.utilities.sequence[ValueParameterDescriptorImpl]

'size' @ [137:96] ==> value-parameter size: Int = ... defined in net.corda.core.utilities.sequence[ValueParameterDescriptorImpl]

'printHexBinary' @ [139:57] ==> public open fun printHexBinary(p0: (ByteArray..ByteArray?)): (String..String?) defined in javax.xml.bind.DatatypeConverter[JavaMethodDescriptor]

'this' @ [139:72] ==> <this> defined in net.corda.core.utilities.toHexString[ReceiverParameterDescriptorImpl]

'parseHexBinary' @ [140:56] ==> public open fun parseHexBinary(p0: (String..String?)): (ByteArray..ByteArray?) defined in javax.xml.bind.DatatypeConverter[JavaMethodDescriptor]

'this' @ [140:71] ==> <this> defined in net.corda.core.utilities.parseAsHex[ReceiverParameterDescriptorImpl]

'ByteSequence' @ [145:113] ==> private constructor ByteSequence() defined in net.corda.core.utilities.ByteSequence[ClassConstructorDescriptorImpl]

'require' @ [147:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'offset' @ [147:17] ==> public open val offset: Int defined in net.corda.core.utilities.OpaqueBytesSubSequence[PropertyDescriptorImpl]

'offset' @ [147:32] ==> public open val offset: Int defined in net.corda.core.utilities.OpaqueBytesSubSequence[PropertyDescriptorImpl]

'bytes' @ [147:41] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytesSubSequence[PropertyDescriptorImpl]

'size' @ [147:47] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'require' @ [148:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'size' @ [148:17] ==> public open val size: Int defined in net.corda.core.utilities.OpaqueBytesSubSequence[PropertyDescriptorImpl]

'size' @ [148:30] ==> public open val size: Int defined in net.corda.core.utilities.OpaqueBytesSubSequence[PropertyDescriptorImpl]

'bytes' @ [148:38] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytesSubSequence[PropertyDescriptorImpl]

'size' @ [148:44] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

