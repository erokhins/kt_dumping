'PublishedApi' @ [19:1] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'JsName' @ [22:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'fillArrayVal' @ [23:45] ==> private fun <T> fillArrayVal(array: Array<T>, initValue: T): Array<T> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'Array' @ [23:58] ==> @PublishedApi internal external fun <T> Array(size: Int): Array<T> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'size' @ [23:67] ==> value-parameter size: Int defined in newArray[ValueParameterDescriptorImpl]

'initValue' @ [23:74] ==> value-parameter initValue: T defined in newArray[ValueParameterDescriptorImpl]

'JsName' @ [25:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'fillArrayFun' @ [26:60] ==> @JsName public inline fun <T> fillArrayFun(array: Array<T>, init: (Int) -> T): Array<T> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'Array' @ [26:73] ==> @PublishedApi internal external fun <T> Array(size: Int): Array<T> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'size' @ [26:82] ==> value-parameter size: Int defined in arrayWithFun[ValueParameterDescriptorImpl]

'init' @ [26:89] ==> value-parameter init: (Int) -> T defined in arrayWithFun[ValueParameterDescriptorImpl]

'JsName' @ [28:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'..' @ [30:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'array' @ [30:18] ==> value-parameter array: Array<T> defined in fillArrayFun[ValueParameterDescriptorImpl]

'size' @ [30:24] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'array' @ [31:9] ==> value-parameter array: Array<T> defined in fillArrayFun[ValueParameterDescriptorImpl]

'i' @ [31:15] ==> val i: Int defined in fillArrayFun[LocalVariableDescriptor]

'invoke' @ [31:20] ==> public abstract operator fun invoke(p1: Int): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'i' @ [31:25] ==> val i: Int defined in fillArrayFun[LocalVariableDescriptor]

'array' @ [33:12] ==> value-parameter array: Array<T> defined in fillArrayFun[ValueParameterDescriptorImpl]

'JsName' @ [36:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'Array' @ [38:27] ==> @PublishedApi internal external fun <T> Array(size: Int): Array<Boolean> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'size' @ [38:42] ==> value-parameter size: Int defined in booleanArray[ValueParameterDescriptorImpl]

'result' @ [39:5] ==> val result: dynamic defined in booleanArray[LocalVariableDescriptor]

'`$type$`' @ [39:12] ==> public final var `$type$`: dynamic defined in booleanArray[PropertyDescriptorImpl]

'when (init) {
        null, true -> fillArrayVal(result, false)
        false -> result
        else -> fillArrayFun<Boolean>(result, init)
    }' @ [40:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<Boolean>, entry1: Array<Boolean>, entry2: Array<Boolean>): Array<Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<Boolean>

'init' @ [40:18] ==> value-parameter init: dynamic defined in booleanArray[ValueParameterDescriptorImpl]

'fillArrayVal' @ [41:23] ==> private fun <T> fillArrayVal(array: Array<Boolean>, initValue: Boolean): Array<Boolean> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'result' @ [41:36] ==> val result: dynamic defined in booleanArray[LocalVariableDescriptor]

'result' @ [42:18] ==> val result: dynamic defined in booleanArray[LocalVariableDescriptor]

'fillArrayFun' @ [43:17] ==> @JsName public inline fun <T> fillArrayFun(array: Array<Boolean>, init: (Int) -> Boolean): Array<Boolean> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'result' @ [43:39] ==> val result: dynamic defined in booleanArray[LocalVariableDescriptor]

'init' @ [43:47] ==> value-parameter init: dynamic defined in booleanArray[ValueParameterDescriptorImpl]

'JsName' @ [47:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'fillArrayFun' @ [48:85] ==> @JsName public inline fun <T> fillArrayFun(array: Array<Boolean>, init: (Int) -> Boolean): Array<Boolean> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'booleanArray' @ [48:98] ==> @JsName public fun booleanArray(size: Int, init: dynamic): Array<Boolean> defined in root package in file arrayUtils.kt[SimpleFunctionDescriptorImpl]

'size' @ [48:111] ==> value-parameter size: Int defined in booleanArrayWithFun[ValueParameterDescriptorImpl]

'init' @ [48:125] ==> value-parameter init: (Int) -> Boolean defined in booleanArrayWithFun[ValueParameterDescriptorImpl]

'JsName' @ [50:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'Suppress' @ [51:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'js' @ [53:18] ==> internal external fun js(code: String): dynamic defined in kotlin.js in file hacks.kt[SimpleFunctionDescriptorImpl]

'result' @ [54:5] ==> val result: dynamic defined in charArray[LocalVariableDescriptor]

'`$type$`' @ [54:12] ==> public final var `$type$`: dynamic defined in charArray[PropertyDescriptorImpl]

'when (init) {
        null, true, false -> result // For consistency
        else -> fillArrayFun<Char>(result, init)
    }' @ [55:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<Char>, entry1: Array<Char>): Array<Char>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<Char>

'init' @ [55:18] ==> value-parameter init: dynamic defined in charArray[ValueParameterDescriptorImpl]

'result' @ [56:30] ==> val result: dynamic defined in charArray[LocalVariableDescriptor]

'fillArrayFun' @ [57:17] ==> @JsName public inline fun <T> fillArrayFun(array: Array<Char>, init: (Int) -> Char): Array<Char> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Char

'result' @ [57:36] ==> val result: dynamic defined in charArray[LocalVariableDescriptor]

'init' @ [57:44] ==> value-parameter init: dynamic defined in charArray[ValueParameterDescriptorImpl]

'JsName' @ [61:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'fillArrayFun' @ [62:76] ==> @JsName public inline fun <T> fillArrayFun(array: Array<Char>, init: (Int) -> Char): Array<Char> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Char

'charArray' @ [62:89] ==> @JsName @Suppress public fun charArray(size: Int, init: dynamic): Array<Char> defined in root package in file arrayUtils.kt[SimpleFunctionDescriptorImpl]

'size' @ [62:99] ==> value-parameter size: Int defined in charArrayWithFun[ValueParameterDescriptorImpl]

'init' @ [62:112] ==> value-parameter init: (Int) -> Char defined in charArrayWithFun[ValueParameterDescriptorImpl]

'JsName' @ [64:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'Array' @ [66:27] ==> @PublishedApi internal external fun <T> Array(size: Int): Array<Long> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Long

'size' @ [66:39] ==> value-parameter size: Int defined in longArray[ValueParameterDescriptorImpl]

'result' @ [67:5] ==> val result: dynamic defined in longArray[LocalVariableDescriptor]

'`$type$`' @ [67:12] ==> public final var `$type$`: dynamic defined in longArray[PropertyDescriptorImpl]

'when (init) {
        null, true -> fillArrayVal(result, 0L)
        false -> result
        else -> fillArrayFun<Long>(result, init)
    }' @ [68:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<Long>, entry1: Array<Long>, entry2: Array<Long>): Array<Long>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<Long>

'init' @ [68:18] ==> value-parameter init: dynamic defined in longArray[ValueParameterDescriptorImpl]

'fillArrayVal' @ [69:23] ==> private fun <T> fillArrayVal(array: Array<Long>, initValue: Long): Array<Long> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Long

'result' @ [69:36] ==> val result: dynamic defined in longArray[LocalVariableDescriptor]

'result' @ [70:18] ==> val result: dynamic defined in longArray[LocalVariableDescriptor]

'fillArrayFun' @ [71:17] ==> @JsName public inline fun <T> fillArrayFun(array: Array<Long>, init: (Int) -> Long): Array<Long> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Long

'result' @ [71:36] ==> val result: dynamic defined in longArray[LocalVariableDescriptor]

'init' @ [71:44] ==> value-parameter init: dynamic defined in longArray[ValueParameterDescriptorImpl]

'JsName' @ [75:1] ==> public constructor JsName(name: String) defined in kotlin.js.JsName[ClassConstructorDescriptorImpl]

'fillArrayFun' @ [76:76] ==> @JsName public inline fun <T> fillArrayFun(array: Array<Long>, init: (Int) -> Long): Array<Long> defined in root package[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Long

'longArray' @ [76:89] ==> @JsName public fun longArray(size: Int, init: dynamic): Array<Long> defined in root package in file arrayUtils.kt[SimpleFunctionDescriptorImpl]

'size' @ [76:99] ==> value-parameter size: Int defined in longArrayWithFun[ValueParameterDescriptorImpl]

'init' @ [76:113] ==> value-parameter init: (Int) -> Long defined in longArrayWithFun[ValueParameterDescriptorImpl]

'..' @ [79:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'array' @ [79:18] ==> value-parameter array: Array<T> defined in fillArrayVal[ValueParameterDescriptorImpl]

'size' @ [79:24] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'array' @ [80:9] ==> value-parameter array: Array<T> defined in fillArrayVal[ValueParameterDescriptorImpl]

'i' @ [80:15] ==> val i: Int defined in fillArrayVal[LocalVariableDescriptor]

'initValue' @ [80:20] ==> value-parameter initValue: T defined in fillArrayVal[ValueParameterDescriptorImpl]

'array' @ [82:12] ==> value-parameter array: Array<T> defined in fillArrayVal[ValueParameterDescriptorImpl]

