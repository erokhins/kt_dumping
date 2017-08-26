'kotlin.jvm.JvmMultifileClass' @ [17:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [18:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'Suppress' @ [19:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [165:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'toByteOrNull' @ [166:43] ==> @SinceKotlin public fun String.toByteOrNull(radix: Int): Byte? defined in kotlin.text in file StringNumberConversions.kt[SimpleFunctionDescriptorImpl]

'SinceKotlin' @ [174:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'this' @ [176:15] ==> <this> defined in kotlin.text.toByteOrNull[ReceiverParameterDescriptorImpl]

'toIntOrNull' @ [176:20] ==> @SinceKotlin public fun String.toIntOrNull(radix: Int): Int? defined in kotlin.text in file StringNumberConversions.kt[SimpleFunctionDescriptorImpl]

'radix' @ [176:32] ==> value-parameter radix: Int defined in kotlin.text.toByteOrNull[ValueParameterDescriptorImpl]

'int' @ [177:9] ==> val int: Int defined in kotlin.text.toByteOrNull[LocalVariableDescriptor]

'Byte' @ [177:15] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [177:20] ==> public const final val MIN_VALUE: Byte defined in kotlin.Byte.Companion[DeserializedPropertyDescriptor]

'int' @ [177:33] ==> val int: Int defined in kotlin.text.toByteOrNull[LocalVariableDescriptor]

'Byte' @ [177:39] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [177:44] ==> public const final val MAX_VALUE: Byte defined in kotlin.Byte.Companion[DeserializedPropertyDescriptor]

'int' @ [178:12] ==> val int: Int defined in kotlin.text.toByteOrNull[LocalVariableDescriptor]

'toByte' @ [178:16] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SinceKotlin' @ [185:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'toShortOrNull' @ [186:45] ==> @SinceKotlin public fun String.toShortOrNull(radix: Int): Short? defined in kotlin.text in file StringNumberConversions.kt[SimpleFunctionDescriptorImpl]

'SinceKotlin' @ [194:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'this' @ [196:15] ==> <this> defined in kotlin.text.toShortOrNull[ReceiverParameterDescriptorImpl]

'toIntOrNull' @ [196:20] ==> @SinceKotlin public fun String.toIntOrNull(radix: Int): Int? defined in kotlin.text in file StringNumberConversions.kt[SimpleFunctionDescriptorImpl]

'radix' @ [196:32] ==> value-parameter radix: Int defined in kotlin.text.toShortOrNull[ValueParameterDescriptorImpl]

'int' @ [197:9] ==> val int: Int defined in kotlin.text.toShortOrNull[LocalVariableDescriptor]

'Short' @ [197:15] ==> public companion object defined in kotlin.Short[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [197:21] ==> public const final val MIN_VALUE: Short defined in kotlin.Short.Companion[DeserializedPropertyDescriptor]

'int' @ [197:34] ==> val int: Int defined in kotlin.text.toShortOrNull[LocalVariableDescriptor]

'Short' @ [197:40] ==> public companion object defined in kotlin.Short[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [197:46] ==> public const final val MAX_VALUE: Short defined in kotlin.Short.Companion[DeserializedPropertyDescriptor]

'int' @ [198:12] ==> val int: Int defined in kotlin.text.toShortOrNull[LocalVariableDescriptor]

'toShort' @ [198:16] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SinceKotlin' @ [205:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'toIntOrNull' @ [206:41] ==> @SinceKotlin public fun String.toIntOrNull(radix: Int): Int? defined in kotlin.text in file StringNumberConversions.kt[SimpleFunctionDescriptorImpl]

'SinceKotlin' @ [214:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'checkRadix' @ [216:5] ==> @PublishedApi internal fun checkRadix(radix: Int): Int defined in kotlin.text in file numberConversions.kt[SimpleFunctionDescriptorImpl]

'radix' @ [216:16] ==> value-parameter radix: Int defined in kotlin.text.toIntOrNull[ValueParameterDescriptorImpl]

'this' @ [218:18] ==> <this> defined in kotlin.text.toIntOrNull[ReceiverParameterDescriptorImpl]

'length' @ [218:23] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'length' @ [219:9] ==> val length: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'this' @ [225:21] ==> <this> defined in kotlin.text.toIntOrNull[ReceiverParameterDescriptorImpl]

'if (firstChar < '0') {  // Possible leading sign
        if (length == 1) return null  // non-digit (possible sign) only, no digits after

        start = 1

        if (firstChar == '-') {
            isNegative = true
            limit = Int.MIN_VALUE
        } else if (firstChar == '+') {
            isNegative = false
            limit = -Int.MAX_VALUE
        } else
            return null
    } else {
        start = 0
        isNegative = false
        limit = -Int.MAX_VALUE
    }' @ [226:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'firstChar' @ [226:9] ==> val firstChar: Char defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'length' @ [227:13] ==> val length: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'start' @ [229:9] ==> val start: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'if (firstChar == '-') {
            isNegative = true
            limit = Int.MIN_VALUE
        } else if (firstChar == '+') {
            isNegative = false
            limit = -Int.MAX_VALUE
        } else
            return null' @ [231:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'firstChar' @ [231:13] ==> val firstChar: Char defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'isNegative' @ [232:13] ==> val isNegative: Boolean defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'limit' @ [233:13] ==> val limit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'Int' @ [233:21] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [233:25] ==> public const final val MIN_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'if (firstChar == '+') {
            isNegative = false
            limit = -Int.MAX_VALUE
        } else
            return null' @ [234:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'firstChar' @ [234:20] ==> val firstChar: Char defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'isNegative' @ [235:13] ==> val isNegative: Boolean defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'limit' @ [236:13] ==> val limit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'-' @ [236:21] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Int' @ [236:22] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [236:26] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'start' @ [240:9] ==> val start: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'isNegative' @ [241:9] ==> val isNegative: Boolean defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'limit' @ [242:9] ==> val limit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'-' @ [242:17] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Int' @ [242:18] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [242:22] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'limit' @ [246:26] ==> val limit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'radix' @ [246:34] ==> value-parameter radix: Int defined in kotlin.text.toIntOrNull[ValueParameterDescriptorImpl]

'start' @ [248:15] ==> val start: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'length' @ [248:23] ==> val length: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'digitOf' @ [249:21] ==> internal fun digitOf(char: Char, radix: Int): Int defined in kotlin.text in file numberConversions.kt[SimpleFunctionDescriptorImpl]

'this' @ [249:29] ==> <this> defined in kotlin.text.toIntOrNull[ReceiverParameterDescriptorImpl]

'i' @ [249:34] ==> val i: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'radix' @ [249:38] ==> value-parameter radix: Int defined in kotlin.text.toIntOrNull[ValueParameterDescriptorImpl]

'digit' @ [251:13] ==> val digit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'result' @ [252:13] ==> var result: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'limitBeforeMul' @ [252:22] ==> val limitBeforeMul: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'result' @ [254:9] ==> var result: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'radix' @ [254:19] ==> value-parameter radix: Int defined in kotlin.text.toIntOrNull[ValueParameterDescriptorImpl]

'result' @ [256:13] ==> var result: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'limit' @ [256:22] ==> val limit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'digit' @ [256:30] ==> val digit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'result' @ [258:9] ==> var result: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'digit' @ [258:19] ==> val digit: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'if (isNegative) result else -result' @ [261:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'isNegative' @ [261:16] ==> val isNegative: Boolean defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'result' @ [261:28] ==> var result: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'-' @ [261:40] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [261:41] ==> var result: Int defined in kotlin.text.toIntOrNull[LocalVariableDescriptor]

'SinceKotlin' @ [268:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'toLongOrNull' @ [269:43] ==> @SinceKotlin public fun String.toLongOrNull(radix: Int): Long? defined in kotlin.text in file StringNumberConversions.kt[SimpleFunctionDescriptorImpl]

'SinceKotlin' @ [277:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'checkRadix' @ [279:5] ==> @PublishedApi internal fun checkRadix(radix: Int): Int defined in kotlin.text in file numberConversions.kt[SimpleFunctionDescriptorImpl]

'radix' @ [279:16] ==> value-parameter radix: Int defined in kotlin.text.toLongOrNull[ValueParameterDescriptorImpl]

'this' @ [281:18] ==> <this> defined in kotlin.text.toLongOrNull[ReceiverParameterDescriptorImpl]

'length' @ [281:23] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'length' @ [282:9] ==> val length: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'this' @ [288:21] ==> <this> defined in kotlin.text.toLongOrNull[ReceiverParameterDescriptorImpl]

'if (firstChar < '0') {  // Possible leading sign
        if (length == 1) return null  // non-digit (possible sign) only, no digits after

        start = 1

        if (firstChar == '-') {
            isNegative = true
            limit = Long.MIN_VALUE
        } else if (firstChar == '+') {
            isNegative = false
            limit = -Long.MAX_VALUE
        } else
            return null
    } else {
        start = 0
        isNegative = false
        limit = -Long.MAX_VALUE
    }' @ [289:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'firstChar' @ [289:9] ==> val firstChar: Char defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'length' @ [290:13] ==> val length: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'start' @ [292:9] ==> val start: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'if (firstChar == '-') {
            isNegative = true
            limit = Long.MIN_VALUE
        } else if (firstChar == '+') {
            isNegative = false
            limit = -Long.MAX_VALUE
        } else
            return null' @ [294:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'firstChar' @ [294:13] ==> val firstChar: Char defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'isNegative' @ [295:13] ==> val isNegative: Boolean defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'limit' @ [296:13] ==> val limit: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'Long' @ [296:21] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MIN_VALUE' @ [296:26] ==> public const final val MIN_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'if (firstChar == '+') {
            isNegative = false
            limit = -Long.MAX_VALUE
        } else
            return null' @ [297:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'firstChar' @ [297:20] ==> val firstChar: Char defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'isNegative' @ [298:13] ==> val isNegative: Boolean defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'limit' @ [299:13] ==> val limit: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'-' @ [299:21] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'Long' @ [299:22] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [299:27] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'start' @ [303:9] ==> val start: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'isNegative' @ [304:9] ==> val isNegative: Boolean defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'limit' @ [305:9] ==> val limit: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'-' @ [305:17] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'Long' @ [305:18] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [305:23] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'limit' @ [309:26] ==> val limit: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'radix' @ [309:34] ==> value-parameter radix: Int defined in kotlin.text.toLongOrNull[ValueParameterDescriptorImpl]

'start' @ [311:15] ==> val start: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'length' @ [311:23] ==> val length: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'digitOf' @ [312:21] ==> internal fun digitOf(char: Char, radix: Int): Int defined in kotlin.text in file numberConversions.kt[SimpleFunctionDescriptorImpl]

'this' @ [312:29] ==> <this> defined in kotlin.text.toLongOrNull[ReceiverParameterDescriptorImpl]

'i' @ [312:34] ==> val i: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'radix' @ [312:38] ==> value-parameter radix: Int defined in kotlin.text.toLongOrNull[ValueParameterDescriptorImpl]

'digit' @ [314:13] ==> val digit: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'result' @ [315:13] ==> var result: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'limitBeforeMul' @ [315:22] ==> val limitBeforeMul: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'result' @ [317:9] ==> var result: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'radix' @ [317:19] ==> value-parameter radix: Int defined in kotlin.text.toLongOrNull[ValueParameterDescriptorImpl]

'result' @ [319:13] ==> var result: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'limit' @ [319:22] ==> val limit: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'digit' @ [319:30] ==> val digit: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'result' @ [321:9] ==> var result: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'digit' @ [321:19] ==> val digit: Int defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'if (isNegative) result else -result' @ [324:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long?, elseBranch: Long?): Long?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long?

'isNegative' @ [324:16] ==> val isNegative: Boolean defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'result' @ [324:28] ==> var result: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

'-' @ [324:40] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'result' @ [324:41] ==> var result: Long defined in kotlin.text.toLongOrNull[LocalVariableDescriptor]

