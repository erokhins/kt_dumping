'JsName' @ [17:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'when (type) {
    null -> {
        val arr: Array<dynamic> = array
        object : Iterator<dynamic> {
            var index = 0
            override fun hasNext() = index < arr.size
            override fun next() = if (index < arr.size) arr[index++] else throw NoSuchElementException("$index")
        }
    }
    "BooleanArray" -> booleanArrayIterator(array)
    "ByteArray" -> byteArrayIterator(array)
    "ShortArray" -> shortArrayIterator(array)
    "CharArray" -> charArrayIterator(array)
    "IntArray" -> intArrayIterator(array)
    "LongArray" -> longArrayIterator(array)
    "FloatArray" -> floatArrayIterator(array)
    "DoubleArray" -> doubleArrayIterator(array)
    else -> throw IllegalStateException("Unsupported type argument for arrayIterator: $type")
}' @ [18:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Iterator<dynamic>, entry1: Iterator<dynamic>, entry2: Iterator<dynamic>, entry3: Iterator<dynamic>, entry4: Iterator<dynamic>, entry5: Iterator<dynamic>, entry6: Iterator<dynamic>, entry7: Iterator<dynamic>, entry8: Iterator<dynamic>, entry9: Iterator<dynamic>): Iterator<dynamic>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Iterator<dynamic>

'type' @ [18:67] ==> value-parameter type: String? defined in arrayIterator[ValueParameterDescriptorImpl]

'array' @ [20:35] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'index' @ [23:38] ==> public final var index: Int defined in arrayIterator.<no name provided>[PropertyDescriptorImpl]

'arr' @ [23:46] ==> val arr: Array<dynamic> defined in arrayIterator[LocalVariableDescriptor]

'size' @ [23:50] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'if (index < arr.size) arr[index++] else throw NoSuchElementException("$index")' @ [24:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'index' @ [24:39] ==> public final var index: Int defined in arrayIterator.<no name provided>[PropertyDescriptorImpl]

'arr' @ [24:47] ==> val arr: Array<dynamic> defined in arrayIterator[LocalVariableDescriptor]

'size' @ [24:51] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'arr' @ [24:57] ==> val arr: Array<dynamic> defined in arrayIterator[LocalVariableDescriptor]

'index' @ [24:61] ==> public final var index: Int defined in arrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [24:81] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [24:106] ==> public final var index: Int defined in arrayIterator.<no name provided>[PropertyDescriptorImpl]

'booleanArrayIterator' @ [27:23] ==> @JsName internal fun booleanArrayIterator(array: BooleanArray): BooleanIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [27:44] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'byteArrayIterator' @ [28:20] ==> @JsName internal fun byteArrayIterator(array: ByteArray): ByteIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [28:38] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'shortArrayIterator' @ [29:21] ==> @JsName internal fun shortArrayIterator(array: ShortArray): ShortIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [29:40] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'charArrayIterator' @ [30:20] ==> @JsName internal fun charArrayIterator(array: CharArray): CharIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [30:38] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'intArrayIterator' @ [31:19] ==> @JsName internal fun intArrayIterator(array: IntArray): IntIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [31:36] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'longArrayIterator' @ [32:20] ==> @JsName internal fun longArrayIterator(array: LongArray): LongIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [32:38] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'floatArrayIterator' @ [33:21] ==> @JsName internal fun floatArrayIterator(array: FloatArray): FloatIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [33:40] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'doubleArrayIterator' @ [34:22] ==> @JsName internal fun doubleArrayIterator(array: DoubleArray): DoubleIterator defined in root package[SimpleFunctionDescriptorImpl]

'array' @ [34:42] ==> value-parameter array: dynamic defined in arrayIterator[ValueParameterDescriptorImpl]

'IllegalStateException' @ [35:19] ==> public constructor IllegalStateException(message: String? = ...) defined in kotlin.IllegalStateException[ClassConstructorDescriptorImpl]

'type' @ [35:88] ==> value-parameter type: String? defined in arrayIterator[ValueParameterDescriptorImpl]

'JsName' @ [38:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'BooleanIterator' @ [39:67] ==> public constructor BooleanIterator() defined in kotlin.collections.BooleanIterator[ClassConstructorDescriptorImpl]

'index' @ [41:30] ==> public final var index: Int defined in booleanArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [41:38] ==> value-parameter array: BooleanArray defined in booleanArrayIterator[ValueParameterDescriptorImpl]

'size' @ [41:44] ==> public final val size: Int defined in kotlin.BooleanArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [42:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'index' @ [42:38] ==> public final var index: Int defined in booleanArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [42:46] ==> value-parameter array: BooleanArray defined in booleanArrayIterator[ValueParameterDescriptorImpl]

'size' @ [42:52] ==> public final val size: Int defined in kotlin.BooleanArray[DeserializedPropertyDescriptor]

'array' @ [42:58] ==> value-parameter array: BooleanArray defined in booleanArrayIterator[ValueParameterDescriptorImpl]

'index' @ [42:64] ==> public final var index: Int defined in booleanArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [42:84] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [42:109] ==> public final var index: Int defined in booleanArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [45:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'ByteIterator' @ [46:61] ==> public constructor ByteIterator() defined in kotlin.collections.ByteIterator[ClassConstructorDescriptorImpl]

'index' @ [48:30] ==> public final var index: Int defined in byteArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [48:38] ==> value-parameter array: ByteArray defined in byteArrayIterator[ValueParameterDescriptorImpl]

'size' @ [48:44] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [49:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Byte, elseBranch: Byte): Byte[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Byte

'index' @ [49:35] ==> public final var index: Int defined in byteArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [49:43] ==> value-parameter array: ByteArray defined in byteArrayIterator[ValueParameterDescriptorImpl]

'size' @ [49:49] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'array' @ [49:55] ==> value-parameter array: ByteArray defined in byteArrayIterator[ValueParameterDescriptorImpl]

'index' @ [49:61] ==> public final var index: Int defined in byteArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [49:81] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [49:106] ==> public final var index: Int defined in byteArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [52:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'ShortIterator' @ [53:63] ==> public constructor ShortIterator() defined in kotlin.collections.ShortIterator[ClassConstructorDescriptorImpl]

'index' @ [55:30] ==> public final var index: Int defined in shortArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [55:38] ==> value-parameter array: ShortArray defined in shortArrayIterator[ValueParameterDescriptorImpl]

'size' @ [55:44] ==> public final val size: Int defined in kotlin.ShortArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [56:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Short, elseBranch: Short): Short[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Short

'index' @ [56:36] ==> public final var index: Int defined in shortArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [56:44] ==> value-parameter array: ShortArray defined in shortArrayIterator[ValueParameterDescriptorImpl]

'size' @ [56:50] ==> public final val size: Int defined in kotlin.ShortArray[DeserializedPropertyDescriptor]

'array' @ [56:56] ==> value-parameter array: ShortArray defined in shortArrayIterator[ValueParameterDescriptorImpl]

'index' @ [56:62] ==> public final var index: Int defined in shortArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [56:82] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [56:107] ==> public final var index: Int defined in shortArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [59:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'CharIterator' @ [60:61] ==> public constructor CharIterator() defined in kotlin.collections.CharIterator[ClassConstructorDescriptorImpl]

'index' @ [62:30] ==> public final var index: Int defined in charArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [62:38] ==> value-parameter array: CharArray defined in charArrayIterator[ValueParameterDescriptorImpl]

'size' @ [62:44] ==> public final val size: Int defined in kotlin.CharArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [63:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'index' @ [63:35] ==> public final var index: Int defined in charArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [63:43] ==> value-parameter array: CharArray defined in charArrayIterator[ValueParameterDescriptorImpl]

'size' @ [63:49] ==> public final val size: Int defined in kotlin.CharArray[DeserializedPropertyDescriptor]

'array' @ [63:55] ==> value-parameter array: CharArray defined in charArrayIterator[ValueParameterDescriptorImpl]

'index' @ [63:61] ==> public final var index: Int defined in charArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [63:81] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [63:106] ==> public final var index: Int defined in charArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [66:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'IntIterator' @ [67:59] ==> public constructor IntIterator() defined in kotlin.collections.IntIterator[ClassConstructorDescriptorImpl]

'index' @ [69:30] ==> public final var index: Int defined in intArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [69:38] ==> value-parameter array: IntArray defined in intArrayIterator[ValueParameterDescriptorImpl]

'size' @ [69:44] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [70:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'index' @ [70:34] ==> public final var index: Int defined in intArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [70:42] ==> value-parameter array: IntArray defined in intArrayIterator[ValueParameterDescriptorImpl]

'size' @ [70:48] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'array' @ [70:54] ==> value-parameter array: IntArray defined in intArrayIterator[ValueParameterDescriptorImpl]

'index' @ [70:60] ==> public final var index: Int defined in intArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [70:80] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [70:105] ==> public final var index: Int defined in intArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [73:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'FloatIterator' @ [74:63] ==> public constructor FloatIterator() defined in kotlin.collections.FloatIterator[ClassConstructorDescriptorImpl]

'index' @ [76:30] ==> public final var index: Int defined in floatArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [76:38] ==> value-parameter array: FloatArray defined in floatArrayIterator[ValueParameterDescriptorImpl]

'size' @ [76:44] ==> public final val size: Int defined in kotlin.FloatArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [77:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Float, elseBranch: Float): Float[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Float

'index' @ [77:36] ==> public final var index: Int defined in floatArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [77:44] ==> value-parameter array: FloatArray defined in floatArrayIterator[ValueParameterDescriptorImpl]

'size' @ [77:50] ==> public final val size: Int defined in kotlin.FloatArray[DeserializedPropertyDescriptor]

'array' @ [77:56] ==> value-parameter array: FloatArray defined in floatArrayIterator[ValueParameterDescriptorImpl]

'index' @ [77:62] ==> public final var index: Int defined in floatArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [77:82] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [77:107] ==> public final var index: Int defined in floatArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [80:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'DoubleIterator' @ [81:65] ==> public constructor DoubleIterator() defined in kotlin.collections.DoubleIterator[ClassConstructorDescriptorImpl]

'index' @ [83:30] ==> public final var index: Int defined in doubleArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [83:38] ==> value-parameter array: DoubleArray defined in doubleArrayIterator[ValueParameterDescriptorImpl]

'size' @ [83:44] ==> public final val size: Int defined in kotlin.DoubleArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [84:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Double, elseBranch: Double): Double[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Double

'index' @ [84:37] ==> public final var index: Int defined in doubleArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [84:45] ==> value-parameter array: DoubleArray defined in doubleArrayIterator[ValueParameterDescriptorImpl]

'size' @ [84:51] ==> public final val size: Int defined in kotlin.DoubleArray[DeserializedPropertyDescriptor]

'array' @ [84:57] ==> value-parameter array: DoubleArray defined in doubleArrayIterator[ValueParameterDescriptorImpl]

'index' @ [84:63] ==> public final var index: Int defined in doubleArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [84:83] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [84:108] ==> public final var index: Int defined in doubleArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [87:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'LongIterator' @ [88:61] ==> public constructor LongIterator() defined in kotlin.collections.LongIterator[ClassConstructorDescriptorImpl]

'index' @ [90:30] ==> public final var index: Int defined in longArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [90:38] ==> value-parameter array: LongArray defined in longArrayIterator[ValueParameterDescriptorImpl]

'size' @ [90:44] ==> public final val size: Int defined in kotlin.LongArray[DeserializedPropertyDescriptor]

'if (index < array.size) array[index++] else throw NoSuchElementException("$index")' @ [91:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'index' @ [91:35] ==> public final var index: Int defined in longArrayIterator.<no name provided>[PropertyDescriptorImpl]

'array' @ [91:43] ==> value-parameter array: LongArray defined in longArrayIterator[ValueParameterDescriptorImpl]

'size' @ [91:49] ==> public final val size: Int defined in kotlin.LongArray[DeserializedPropertyDescriptor]

'array' @ [91:55] ==> value-parameter array: LongArray defined in longArrayIterator[ValueParameterDescriptorImpl]

'index' @ [91:61] ==> public final var index: Int defined in longArrayIterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [91:81] ==> public constructor NoSuchElementException(message: String? = ...) defined in kotlin.NoSuchElementException[ClassConstructorDescriptorImpl]

'index' @ [91:106] ==> public final var index: Int defined in longArrayIterator.<no name provided>[PropertyDescriptorImpl]

'JsName' @ [94:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'JsName' @ [95:33] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'JsName' @ [97:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'NoWhenBranchMatchedException' @ [98:53] ==> public constructor NoWhenBranchMatchedException(message: String? = ...) defined in kotlin.NoWhenBranchMatchedException[ClassConstructorDescriptorImpl]

'JsName' @ [100:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'if (c is String) {
        return c.substring(startIndex, endIndex)
    }
    else {
        return c.asDynamic().`subSequence_vux9f0$`(startIndex, endIndex)
    }' @ [102:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'c' @ [102:9] ==> value-parameter c: CharSequence defined in subSequence[ValueParameterDescriptorImpl]

'c' @ [103:16] ==> value-parameter c: CharSequence defined in subSequence[ValueParameterDescriptorImpl]

'substring' @ [103:18] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'startIndex' @ [103:28] ==> value-parameter startIndex: Int defined in subSequence[ValueParameterDescriptorImpl]

'endIndex' @ [103:40] ==> value-parameter endIndex: Int defined in subSequence[ValueParameterDescriptorImpl]

'c' @ [106:16] ==> value-parameter c: CharSequence defined in subSequence[ValueParameterDescriptorImpl]

'asDynamic' @ [106:18] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'`subSequence_vux9f0$`' @ [106:30] ==> public final fun `subSequence_vux9f0$`(p0: dynamic, p1: dynamic): dynamic defined in subSequence[SimpleFunctionDescriptorImpl]

'startIndex' @ [106:52] ==> value-parameter startIndex: Int defined in subSequence[ValueParameterDescriptorImpl]

'endIndex' @ [106:64] ==> value-parameter endIndex: Int defined in subSequence[ValueParameterDescriptorImpl]

'JsName' @ [110:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'if (js("Error").captureStackTrace) {
        js("Error").captureStackTrace(instance, instance::class.js);
    }
    else {
        instance.asDynamic().stack = js("new Error()").stack;
    }' @ [112:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: dynamic, elseBranch: dynamic): dynamic[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> dynamic

'js' @ [112:9] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'captureStackTrace' @ [112:21] ==> public final var captureStackTrace: dynamic defined in captureStack[PropertyDescriptorImpl]

'js' @ [113:9] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'captureStackTrace' @ [113:21] ==> public final fun captureStackTrace(p0: dynamic, p1: dynamic): dynamic defined in captureStack[SimpleFunctionDescriptorImpl]

'instance' @ [113:39] ==> value-parameter instance: Throwable defined in captureStack[ValueParameterDescriptorImpl]

'instance' @ [113:49] ==> value-parameter instance: Throwable defined in captureStack[ValueParameterDescriptorImpl]

'js' @ [113:65] ==> public val <T : Any> KClass<out Throwable>.js: JsClass<out Throwable> defined in kotlin.js[PropertyDescriptorImpl]
Inferred types:
    <T : Any> -> Throwable

'instance' @ [116:9] ==> value-parameter instance: Throwable defined in captureStack[ValueParameterDescriptorImpl]

'asDynamic' @ [116:18] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'stack' @ [116:30] ==> public final var stack: dynamic defined in captureStack[PropertyDescriptorImpl]

'js' @ [116:38] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'stack' @ [116:56] ==> public final var stack: dynamic defined in captureStack[PropertyDescriptorImpl]

'JsName' @ [120:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'js' @ [122:21] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'throwable' @ [123:5] ==> val throwable: dynamic defined in newThrowable[LocalVariableDescriptor]

'message' @ [123:15] ==> public final var message: dynamic defined in newThrowable[PropertyDescriptorImpl]

'if (jsTypeOf(message) == "undefined") {
        if (cause != null) cause.toString() else null
    }
    else {
        message
    }' @ [123:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'jsTypeOf' @ [123:29] ==> @InlineOnly @Suppress public inline fun jsTypeOf(a: Any?): String defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'message' @ [123:38] ==> value-parameter message: String? defined in newThrowable[ValueParameterDescriptorImpl]

'if (cause != null) cause.toString() else null' @ [124:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'cause' @ [124:13] ==> value-parameter cause: Throwable? defined in newThrowable[ValueParameterDescriptorImpl]

'cause' @ [124:28] ==> value-parameter cause: Throwable? defined in newThrowable[ValueParameterDescriptorImpl]

'toString' @ [124:34] ==> public open fun toString(): String defined in kotlin.Throwable[DeserializedSimpleFunctionDescriptor]

'message' @ [127:9] ==> value-parameter message: String? defined in newThrowable[ValueParameterDescriptorImpl]

'throwable' @ [129:5] ==> val throwable: dynamic defined in newThrowable[LocalVariableDescriptor]

'cause' @ [129:15] ==> public final var cause: dynamic defined in newThrowable[PropertyDescriptorImpl]

'cause' @ [129:23] ==> value-parameter cause: Throwable? defined in newThrowable[ValueParameterDescriptorImpl]

'throwable' @ [130:5] ==> val throwable: dynamic defined in newThrowable[LocalVariableDescriptor]

'name' @ [130:15] ==> public final var name: dynamic defined in newThrowable[PropertyDescriptorImpl]

'throwable' @ [131:12] ==> val throwable: dynamic defined in newThrowable[LocalVariableDescriptor]

'JsName' @ [134:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'other' @ [137:16] ==> value-parameter other: Any? defined in BoxedChar.equals[ValueParameterDescriptorImpl]

'c' @ [137:38] ==> public final val c: Char defined in BoxedChar[PropertyDescriptorImpl]

'other' @ [137:43] ==> value-parameter other: Any? defined in BoxedChar.equals[ValueParameterDescriptorImpl]

'c' @ [137:49] ==> public final val c: Char defined in BoxedChar[PropertyDescriptorImpl]

'c' @ [141:16] ==> public final val c: Char defined in BoxedChar[PropertyDescriptorImpl]

'toInt' @ [141:18] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [145:16] ==> public final val c: Char defined in BoxedChar[PropertyDescriptorImpl]

'toString' @ [145:18] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [149:16] ==> public final val c: Char defined in BoxedChar[PropertyDescriptorImpl]

'other' @ [149:20] ==> value-parameter other: Char defined in BoxedChar.compareTo[ValueParameterDescriptorImpl]

'JsName' @ [152:5] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'js' @ [154:16] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'kotlin.internal.InlineOnly' @ [158:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'js' @ [160:17] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'args' @ [160:29] ==> value-parameter args: Array<T> defined in concat[ValueParameterDescriptorImpl]

'size' @ [160:34] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'..' @ [161:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'args' @ [161:18] ==> value-parameter args: Array<T> defined in concat[ValueParameterDescriptorImpl]

'size' @ [161:23] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'args' @ [162:19] ==> value-parameter args: Array<T> defined in concat[ValueParameterDescriptorImpl]

'i' @ [162:24] ==> val i: Int defined in concat[LocalVariableDescriptor]

'if (arr !is Array<*>) {
            typed[i] = js("[]").slice.call(arr)
        }
        else {
            typed[i] = arr
        }' @ [163:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arr' @ [163:13] ==> val arr: T defined in concat[LocalVariableDescriptor]

'typed' @ [164:13] ==> val typed: dynamic defined in concat[LocalVariableDescriptor]

'i' @ [164:19] ==> val i: Int defined in concat[LocalVariableDescriptor]

'js' @ [164:24] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'slice' @ [164:33] ==> public final var slice: dynamic defined in concat[PropertyDescriptorImpl]

'call' @ [164:39] ==> public final fun call(p0: dynamic): dynamic defined in concat[SimpleFunctionDescriptorImpl]

'arr' @ [164:44] ==> val arr: T defined in concat[LocalVariableDescriptor]

'typed' @ [167:13] ==> val typed: dynamic defined in concat[LocalVariableDescriptor]

'i' @ [167:19] ==> val i: Int defined in concat[LocalVariableDescriptor]

'arr' @ [167:24] ==> val arr: T defined in concat[LocalVariableDescriptor]

'js' @ [170:12] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'concat' @ [170:21] ==> public final var concat: dynamic defined in concat[PropertyDescriptorImpl]

'apply' @ [170:28] ==> public final fun apply(p0: dynamic, p1: dynamic): dynamic defined in concat[SimpleFunctionDescriptorImpl]

'js' @ [170:34] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'typed' @ [170:44] ==> val typed: dynamic defined in concat[LocalVariableDescriptor]

'PublishedApi' @ [175:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'JsName' @ [176:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'Suppress' @ [177:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'concat' @ [179:12] ==> @InlineOnly internal inline fun <T> concat(args: Array<T>): T defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'js' @ [179:19] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'PublishedApi' @ [189:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'JsName' @ [190:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'Suppress' @ [191:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'js' @ [193:26] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'if (a is Array<*> && a.asDynamic().`$type$` === undefined) {
        return concat(args)
    }
    else {
        var size = 0
        for (i in 0..args.size - 1) {
            size += args[i].asDynamic().length as Int
        }
        val result = js("new a.constructor(size)")
        kotlin.copyArrayType(a, result)
        size = 0
        for (i in 0..args.size - 1) {
            val arr = args[i].asDynamic()
            for (j in 0..arr.length - 1) {
                result[size++] = arr[j]
            }
        }
        return result
    }' @ [194:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'a' @ [194:9] ==> value-parameter a: T defined in primitiveArrayConcat[ValueParameterDescriptorImpl]

'a' @ [194:26] ==> value-parameter a: T defined in primitiveArrayConcat[ValueParameterDescriptorImpl]

'asDynamic' @ [194:28] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'`$type$`' @ [194:40] ==> public final var `$type$`: dynamic defined in primitiveArrayConcat[PropertyDescriptorImpl]

'undefined' @ [194:53] ==> public external val undefined: Nothing? defined in kotlin.js in file core.kt[PropertyDescriptorImpl]

'concat' @ [195:16] ==> @InlineOnly internal inline fun <T> concat(args: Array<T>): T defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'args' @ [195:23] ==> val args: Array<T> defined in primitiveArrayConcat[LocalVariableDescriptor]

'..' @ [199:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'args' @ [199:22] ==> val args: Array<T> defined in primitiveArrayConcat[LocalVariableDescriptor]

'size' @ [199:27] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'size' @ [200:13] ==> var size: Int defined in primitiveArrayConcat[LocalVariableDescriptor]

'args' @ [200:21] ==> val args: Array<T> defined in primitiveArrayConcat[LocalVariableDescriptor]

'i' @ [200:26] ==> val i: Int defined in primitiveArrayConcat[LocalVariableDescriptor]

'asDynamic' @ [200:29] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'length' @ [200:41] ==> public final var length: dynamic defined in primitiveArrayConcat[PropertyDescriptorImpl]

'js' @ [202:22] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'copyArrayType' @ [203:16] ==> internal inline fun copyArrayType(from: dynamic, to: dynamic): Unit defined in kotlin in file kotlin.kt[SimpleFunctionDescriptorImpl]

'a' @ [203:30] ==> value-parameter a: T defined in primitiveArrayConcat[ValueParameterDescriptorImpl]

'result' @ [203:33] ==> val result: dynamic defined in primitiveArrayConcat[LocalVariableDescriptor]

'size' @ [204:9] ==> var size: Int defined in primitiveArrayConcat[LocalVariableDescriptor]

'..' @ [205:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'args' @ [205:22] ==> val args: Array<T> defined in primitiveArrayConcat[LocalVariableDescriptor]

'size' @ [205:27] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'args' @ [206:23] ==> val args: Array<T> defined in primitiveArrayConcat[LocalVariableDescriptor]

'i' @ [206:28] ==> val i: Int defined in primitiveArrayConcat[LocalVariableDescriptor]

'asDynamic' @ [206:31] ==> @InlineOnly public inline fun Any?.asDynamic(): dynamic defined in kotlin.js in file dynamic.kt[SimpleFunctionDescriptorImpl]

'..' @ [207:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'arr' @ [207:26] ==> val arr: dynamic defined in primitiveArrayConcat[LocalVariableDescriptor]

'length' @ [207:30] ==> public final var length: dynamic defined in primitiveArrayConcat[PropertyDescriptorImpl]

'result' @ [208:17] ==> val result: dynamic defined in primitiveArrayConcat[LocalVariableDescriptor]

'size' @ [208:24] ==> var size: Int defined in primitiveArrayConcat[LocalVariableDescriptor]

'arr' @ [208:34] ==> val arr: dynamic defined in primitiveArrayConcat[LocalVariableDescriptor]

'j' @ [208:38] ==> val j: Int defined in primitiveArrayConcat[LocalVariableDescriptor]

'result' @ [211:16] ==> val result: dynamic defined in primitiveArrayConcat[LocalVariableDescriptor]

'JsName' @ [215:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'withType' @ [216:33] ==> @JsName @InlineOnly internal inline fun withType(type: String, array: dynamic): dynamic defined in root package in file builtins.kt[SimpleFunctionDescriptorImpl]

'js' @ [216:58] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'JsName' @ [218:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'withType' @ [219:30] ==> @JsName @InlineOnly internal inline fun withType(type: String, array: dynamic): dynamic defined in root package in file builtins.kt[SimpleFunctionDescriptorImpl]

'js' @ [219:52] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'JsName' @ [221:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'withType' @ [222:30] ==> @JsName @InlineOnly internal inline fun withType(type: String, array: dynamic): dynamic defined in root package in file builtins.kt[SimpleFunctionDescriptorImpl]

'js' @ [222:52] ==> public external fun js(code: String): dynamic defined in kotlin.js in file core.kt[SimpleFunctionDescriptorImpl]

'JsName' @ [224:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'kotlin.internal.InlineOnly' @ [225:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'array' @ [227:5] ==> value-parameter array: dynamic defined in withType[ValueParameterDescriptorImpl]

'`$type$`' @ [227:11] ==> public final var `$type$`: dynamic defined in withType[PropertyDescriptorImpl]

'type' @ [227:22] ==> value-parameter type: String defined in withType[ValueParameterDescriptorImpl]

'array' @ [228:12] ==> value-parameter array: dynamic defined in withType[ValueParameterDescriptorImpl]

