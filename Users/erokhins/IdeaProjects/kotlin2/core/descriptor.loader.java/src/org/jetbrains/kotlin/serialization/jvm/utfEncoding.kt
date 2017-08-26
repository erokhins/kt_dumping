'toChar' @ [24:32] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [27:18] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'StringBuilder' @ [28:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'buffer' @ [31:5] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'append' @ [31:12] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'UTF8_MODE_MARKER' @ [31:19] ==> public const val UTF8_MODE_MARKER: Char defined in org.jetbrains.kotlin.serialization.jvm in file utfEncoding.kt[PropertyDescriptorImpl]

'bytesInBuffer' @ [33:5] ==> var bytesInBuffer: Int defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'bytes' @ [35:15] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[ValueParameterDescriptorImpl]

'b' @ [36:17] ==> val b: Byte defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'toInt' @ [36:19] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'buffer' @ [37:9] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'append' @ [37:16] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'c' @ [37:23] ==> val c: Int defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'toChar' @ [37:25] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (0 < b && b <= 127) {
            bytesInBuffer++
        }
        else {
            bytesInBuffer += 2
        }' @ [38:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'<' @ [38:13] ==> public final operator fun compareTo(other: Byte): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'b' @ [38:17] ==> val b: Byte defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'b' @ [38:22] ==> val b: Byte defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'bytesInBuffer' @ [39:13] ==> var bytesInBuffer: Int defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'bytesInBuffer' @ [42:13] ==> var bytesInBuffer: Int defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'bytesInBuffer' @ [45:13] ==> var bytesInBuffer: Int defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'MAX_UTF8_INFO_LENGTH' @ [45:30] ==> public const val MAX_UTF8_INFO_LENGTH: Int defined in org.jetbrains.kotlin.serialization.jvm in file utfEncoding.kt[PropertyDescriptorImpl]

'result' @ [46:13] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'add' @ [46:20] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'buffer' @ [46:24] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'toString' @ [46:31] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'buffer' @ [47:13] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'setLength' @ [47:20] ==> public open fun setLength(p0: Int): Unit defined in java.lang.StringBuilder[JavaMethodDescriptor]

'bytesInBuffer' @ [48:13] ==> var bytesInBuffer: Int defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'!' @ [52:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'buffer' @ [52:10] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'isEmpty' @ [52:17] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'result' @ [53:9] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'add' @ [53:16] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'buffer' @ [53:20] ==> val buffer: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'toString' @ [53:27] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'result' @ [56:12] ==> val result: ArrayList<String> defined in org.jetbrains.kotlin.serialization.jvm.bytesToStrings[LocalVariableDescriptor]

'toTypedArray' @ [56:19] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'strings' @ [60:24] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[ValueParameterDescriptorImpl]

'sumBy' @ [60:32] ==> public inline fun <T> Array<out String>.sumBy(selector: (String) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [60:40] ==> value-parameter it: String defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [60:43] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ByteArray' @ [61:18] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'resultLength' @ [61:28] ==> val resultLength: Int defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

'strings' @ [64:15] ==> value-parameter strings: Array<String> defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[ValueParameterDescriptorImpl]

'..' @ [65:20] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

's' @ [65:23] ==> val s: String defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

'length' @ [65:25] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'result' @ [66:13] ==> val result: ByteArray defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

'i' @ [66:20] ==> var i: Int defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

's' @ [66:27] ==> val s: String defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

'si' @ [66:29] ==> val si: Int defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

'toByte' @ [66:33] ==> public final fun toByte(): Byte defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'assert' @ [70:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'i' @ [70:12] ==> var i: Int defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

'result' @ [70:17] ==> val result: ByteArray defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

'size' @ [70:24] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'result' @ [72:12] ==> val result: ByteArray defined in org.jetbrains.kotlin.serialization.jvm.stringsToBytes[LocalVariableDescriptor]

