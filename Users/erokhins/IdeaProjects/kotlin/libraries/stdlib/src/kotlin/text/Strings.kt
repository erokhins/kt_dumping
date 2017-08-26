'kotlin.jvm.JvmMultifileClass' @ [17:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[DeserializedClassConstructorDescriptor]

'kotlin.jvm.JvmName' @ [18:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'length' @ [31:20] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'startIndex' @ [34:12] ==> var startIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'endIndex' @ [34:26] ==> var endIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'if (!startFound) startIndex else endIndex' @ [35:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'!' @ [35:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'startFound' @ [35:26] ==> var startFound: Boolean defined in kotlin.text.trim[LocalVariableDescriptor]

'startIndex' @ [35:38] ==> var startIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'endIndex' @ [35:54] ==> var endIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'invoke' @ [36:21] ==> public abstract operator fun invoke(p1: Char): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [36:31] ==> <this> defined in kotlin.text.trim[ReceiverParameterDescriptorImpl]

'index' @ [36:36] ==> val index: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'if (!startFound) {
            if (!match)
                startFound = true
            else
                startIndex += 1
        }
        else {
            if (!match)
                break
            else
                endIndex -= 1
        }' @ [38:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [38:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'startFound' @ [38:14] ==> var startFound: Boolean defined in kotlin.text.trim[LocalVariableDescriptor]

'if (!match)
                startFound = true
            else
                startIndex += 1' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [39:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'match' @ [39:18] ==> val match: Boolean defined in kotlin.text.trim[LocalVariableDescriptor]

'startFound' @ [40:17] ==> var startFound: Boolean defined in kotlin.text.trim[LocalVariableDescriptor]

'startIndex' @ [42:17] ==> var startIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'if (!match)
                break
            else
                endIndex -= 1' @ [45:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [45:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'match' @ [45:18] ==> val match: Boolean defined in kotlin.text.trim[LocalVariableDescriptor]

'endIndex' @ [48:17] ==> var endIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'subSequence' @ [52:12] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [52:24] ==> var startIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'endIndex' @ [52:36] ==> var endIndex: Int defined in kotlin.text.trim[LocalVariableDescriptor]

'this' @ [59:12] ==> <this> defined in kotlin.text.trim[ReceiverParameterDescriptorImpl]

'trim' @ [59:34] ==> public inline fun CharSequence.trim(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'predicate' @ [59:39] ==> value-parameter predicate: (Char) -> Boolean defined in kotlin.text.trim[ValueParameterDescriptorImpl]

'toString' @ [59:50] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'this' @ [65:19] ==> <this> defined in kotlin.text.trimStart[ReceiverParameterDescriptorImpl]

'indices' @ [65:24] ==> public val CharSequence.indices: IntRange defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'!' @ [66:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [66:14] ==> public abstract operator fun invoke(p1: Char): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [66:24] ==> <this> defined in kotlin.text.trimStart[ReceiverParameterDescriptorImpl]

'index' @ [66:29] ==> val index: Int defined in kotlin.text.trimStart[LocalVariableDescriptor]

'subSequence' @ [67:20] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'index' @ [67:32] ==> val index: Int defined in kotlin.text.trimStart[LocalVariableDescriptor]

'length' @ [67:39] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [76:12] ==> <this> defined in kotlin.text.trimStart[ReceiverParameterDescriptorImpl]

'trimStart' @ [76:34] ==> public inline fun CharSequence.trimStart(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'predicate' @ [76:44] ==> value-parameter predicate: (Char) -> Boolean defined in kotlin.text.trimStart[ValueParameterDescriptorImpl]

'toString' @ [76:55] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'this' @ [82:19] ==> <this> defined in kotlin.text.trimEnd[ReceiverParameterDescriptorImpl]

'indices' @ [82:24] ==> public val CharSequence.indices: IntRange defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'reversed' @ [82:32] ==> public fun IntProgression.reversed(): IntProgression defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'!' @ [83:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [83:14] ==> public abstract operator fun invoke(p1: Char): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [83:24] ==> <this> defined in kotlin.text.trimEnd[ReceiverParameterDescriptorImpl]

'index' @ [83:29] ==> val index: Int defined in kotlin.text.trimEnd[LocalVariableDescriptor]

'substring' @ [84:20] ==> @InlineOnly public inline fun CharSequence.substring(startIndex: Int, endIndex: Int = ...): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [84:33] ==> val index: Int defined in kotlin.text.trimEnd[LocalVariableDescriptor]

'this' @ [93:12] ==> <this> defined in kotlin.text.trimEnd[ReceiverParameterDescriptorImpl]

'trimEnd' @ [93:34] ==> public inline fun CharSequence.trimEnd(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'predicate' @ [93:42] ==> value-parameter predicate: (Char) -> Boolean defined in kotlin.text.trimEnd[ValueParameterDescriptorImpl]

'toString' @ [93:53] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'trim' @ [98:66] ==> public inline fun CharSequence.trim(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'it' @ [98:73] ==> value-parameter it: Char defined in kotlin.text.trim.<anonymous>[ValueParameterDescriptorImpl]

'chars' @ [98:79] ==> value-parameter vararg chars: Char defined in kotlin.text.trim[ValueParameterDescriptorImpl]

'trim' @ [103:54] ==> public inline fun String.trim(predicate: (Char) -> Boolean): String defined in kotlin.text[SimpleFunctionDescriptorImpl]

'it' @ [103:61] ==> value-parameter it: Char defined in kotlin.text.trim.<anonymous>[ValueParameterDescriptorImpl]

'chars' @ [103:67] ==> value-parameter vararg chars: Char defined in kotlin.text.trim[ValueParameterDescriptorImpl]

'trimStart' @ [108:71] ==> public inline fun CharSequence.trimStart(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'it' @ [108:83] ==> value-parameter it: Char defined in kotlin.text.trimStart.<anonymous>[ValueParameterDescriptorImpl]

'chars' @ [108:89] ==> value-parameter vararg chars: Char defined in kotlin.text.trimStart[ValueParameterDescriptorImpl]

'trimStart' @ [113:59] ==> public inline fun String.trimStart(predicate: (Char) -> Boolean): String defined in kotlin.text[SimpleFunctionDescriptorImpl]

'it' @ [113:71] ==> value-parameter it: Char defined in kotlin.text.trimStart.<anonymous>[ValueParameterDescriptorImpl]

'chars' @ [113:77] ==> value-parameter vararg chars: Char defined in kotlin.text.trimStart[ValueParameterDescriptorImpl]

'trimEnd' @ [118:69] ==> public inline fun CharSequence.trimEnd(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'it' @ [118:79] ==> value-parameter it: Char defined in kotlin.text.trimEnd.<anonymous>[ValueParameterDescriptorImpl]

'chars' @ [118:85] ==> value-parameter vararg chars: Char defined in kotlin.text.trimEnd[ValueParameterDescriptorImpl]

'trimEnd' @ [123:57] ==> public inline fun String.trimEnd(predicate: (Char) -> Boolean): String defined in kotlin.text[SimpleFunctionDescriptorImpl]

'it' @ [123:67] ==> value-parameter it: Char defined in kotlin.text.trimEnd.<anonymous>[ValueParameterDescriptorImpl]

'chars' @ [123:73] ==> value-parameter vararg chars: Char defined in kotlin.text.trimEnd[ValueParameterDescriptorImpl]

'trim' @ [128:48] ==> public inline fun CharSequence.trim(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'Char' @ [128:53] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'kotlin.internal.InlineOnly' @ [133:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [134:44] ==> <this> defined in kotlin.text.trim[ReceiverParameterDescriptorImpl]

'trim' @ [134:66] ==> public fun CharSequence.trim(): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'toString' @ [134:73] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'trimStart' @ [139:53] ==> public inline fun CharSequence.trimStart(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'Char' @ [139:63] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'kotlin.internal.InlineOnly' @ [144:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [145:49] ==> <this> defined in kotlin.text.trimStart[ReceiverParameterDescriptorImpl]

'trimStart' @ [145:71] ==> public fun CharSequence.trimStart(): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'toString' @ [145:83] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'trimEnd' @ [150:51] ==> public inline fun CharSequence.trimEnd(predicate: (Char) -> Boolean): CharSequence defined in kotlin.text[SimpleFunctionDescriptorImpl]

'Char' @ [150:59] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'kotlin.internal.InlineOnly' @ [155:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [156:47] ==> <this> defined in kotlin.text.trimEnd[ReceiverParameterDescriptorImpl]

'trimEnd' @ [156:69] ==> public fun CharSequence.trimEnd(): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'toString' @ [156:79] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'length' @ [168:9] ==> value-parameter length: Int defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [169:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'length' @ [169:57] ==> value-parameter length: Int defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'length' @ [170:9] ==> value-parameter length: Int defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'this' @ [170:19] ==> <this> defined in kotlin.text.padStart[ReceiverParameterDescriptorImpl]

'length' @ [170:24] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [171:16] ==> <this> defined in kotlin.text.padStart[ReceiverParameterDescriptorImpl]

'subSequence' @ [171:21] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'this' @ [171:36] ==> <this> defined in kotlin.text.padStart[ReceiverParameterDescriptorImpl]

'length' @ [171:41] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'StringBuilder' @ [173:14] ==> public final fun <init>(p0: Int): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'length' @ [173:28] ==> value-parameter length: Int defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'..' @ [174:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'length' @ [174:19] ==> value-parameter length: Int defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'this' @ [174:28] ==> <this> defined in kotlin.text.padStart[ReceiverParameterDescriptorImpl]

'length' @ [174:33] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'sb' @ [175:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.padStart[LocalVariableDescriptor]

'append' @ [175:12] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'padChar' @ [175:19] ==> value-parameter padChar: Char = ... defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'sb' @ [176:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.padStart[LocalVariableDescriptor]

'append' @ [176:8] ==> public open fun append(p0: (CharSequence..CharSequence?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [176:15] ==> <this> defined in kotlin.text.padStart[ReceiverParameterDescriptorImpl]

'sb' @ [177:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.padStart[LocalVariableDescriptor]

'this' @ [189:12] ==> <this> defined in kotlin.text.padStart[ReceiverParameterDescriptorImpl]

'padStart' @ [189:34] ==> public fun CharSequence.padStart(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'length' @ [189:43] ==> value-parameter length: Int defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'padChar' @ [189:51] ==> value-parameter padChar: Char = ... defined in kotlin.text.padStart[ValueParameterDescriptorImpl]

'toString' @ [189:60] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'length' @ [201:9] ==> value-parameter length: Int defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [202:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'length' @ [202:57] ==> value-parameter length: Int defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'length' @ [203:9] ==> value-parameter length: Int defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'this' @ [203:19] ==> <this> defined in kotlin.text.padEnd[ReceiverParameterDescriptorImpl]

'length' @ [203:24] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [204:16] ==> <this> defined in kotlin.text.padEnd[ReceiverParameterDescriptorImpl]

'subSequence' @ [204:21] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'this' @ [204:36] ==> <this> defined in kotlin.text.padEnd[ReceiverParameterDescriptorImpl]

'length' @ [204:41] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'StringBuilder' @ [206:14] ==> public final fun <init>(p0: Int): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'length' @ [206:28] ==> value-parameter length: Int defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'sb' @ [207:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.padEnd[LocalVariableDescriptor]

'append' @ [207:8] ==> public open fun append(p0: (CharSequence..CharSequence?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [207:15] ==> <this> defined in kotlin.text.padEnd[ReceiverParameterDescriptorImpl]

'..' @ [208:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'length' @ [208:19] ==> value-parameter length: Int defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'this' @ [208:28] ==> <this> defined in kotlin.text.padEnd[ReceiverParameterDescriptorImpl]

'length' @ [208:33] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'sb' @ [209:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.padEnd[LocalVariableDescriptor]

'append' @ [209:12] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'padChar' @ [209:19] ==> value-parameter padChar: Char = ... defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'sb' @ [210:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.padEnd[LocalVariableDescriptor]

'this' @ [222:12] ==> <this> defined in kotlin.text.padEnd[ReceiverParameterDescriptorImpl]

'padEnd' @ [222:34] ==> public fun CharSequence.padEnd(length: Int, padChar: Char = ...): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'length' @ [222:41] ==> value-parameter length: Int defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'padChar' @ [222:49] ==> value-parameter padChar: Char = ... defined in kotlin.text.padEnd[ValueParameterDescriptorImpl]

'toString' @ [222:58] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'kotlin.internal.InlineOnly' @ [227:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [228:60] ==> <this> defined in kotlin.text.isNullOrEmpty[ReceiverParameterDescriptorImpl]

'this' @ [228:76] ==> <this> defined in kotlin.text.isNullOrEmpty[ReceiverParameterDescriptorImpl]

'length' @ [228:81] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'kotlin.internal.InlineOnly' @ [233:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'length' @ [234:53] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'kotlin.internal.InlineOnly' @ [239:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'length' @ [240:56] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'kotlin.internal.InlineOnly' @ [249:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'!' @ [250:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBlank' @ [250:57] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'kotlin.internal.InlineOnly' @ [255:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [256:60] ==> <this> defined in kotlin.text.isNullOrBlank[ReceiverParameterDescriptorImpl]

'this' @ [256:76] ==> <this> defined in kotlin.text.isNullOrBlank[ReceiverParameterDescriptorImpl]

'isBlank' @ [256:81] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'CharIterator' @ [261:70] ==> public constructor CharIterator() defined in kotlin.collections.CharIterator[DeserializedClassConstructorDescriptor]

'get' @ [264:44] ==> public abstract operator fun get(index: Int): Char defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'index' @ [264:48] ==> private final var index: Int defined in kotlin.text.iterator.<no name provided>[PropertyDescriptorImpl]

'index' @ [266:46] ==> private final var index: Int defined in kotlin.text.iterator.<no name provided>[PropertyDescriptorImpl]

'length' @ [266:54] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'kotlin.internal.InlineOnly' @ [270:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [271:47] ==> <this> defined in kotlin.text.orEmpty[ReceiverParameterDescriptorImpl]

'..' @ [277:13] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'length' @ [277:16] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [283:13] ==> <this> defined in kotlin.text.lastIndex[ReceiverParameterDescriptorImpl]

'length' @ [283:18] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'index' @ [289:12] ==> value-parameter index: Int defined in kotlin.text.hasSurrogatePairAt[ValueParameterDescriptorImpl]

'..' @ [289:21] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'length' @ [289:24] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [290:16] ==> <this> defined in kotlin.text.hasSurrogatePairAt[ReceiverParameterDescriptorImpl]

'index' @ [290:21] ==> value-parameter index: Int defined in kotlin.text.hasSurrogatePairAt[ValueParameterDescriptorImpl]

'isHighSurrogate' @ [290:28] ==> @InlineOnly public inline fun Char.isHighSurrogate(): Boolean defined in kotlin.text in file CharJVM.kt[SimpleFunctionDescriptorImpl]

'this' @ [291:16] ==> <this> defined in kotlin.text.hasSurrogatePairAt[ReceiverParameterDescriptorImpl]

'index' @ [291:21] ==> value-parameter index: Int defined in kotlin.text.hasSurrogatePairAt[ValueParameterDescriptorImpl]

'isLowSurrogate' @ [291:32] ==> @InlineOnly public inline fun Char.isLowSurrogate(): Boolean defined in kotlin.text in file CharJVM.kt[SimpleFunctionDescriptorImpl]

'substring' @ [297:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'range' @ [297:66] ==> value-parameter range: IntRange defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'start' @ [297:72] ==> public open val start: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'range' @ [297:79] ==> value-parameter range: IntRange defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'endInclusive' @ [297:85] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'subSequence' @ [302:70] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'range' @ [302:82] ==> value-parameter range: IntRange defined in kotlin.text.subSequence[ValueParameterDescriptorImpl]

'start' @ [302:88] ==> public open val start: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'range' @ [302:95] ==> value-parameter range: IntRange defined in kotlin.text.subSequence[ValueParameterDescriptorImpl]

'endInclusive' @ [302:101] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'kotlin.internal.InlineOnly' @ [310:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Suppress' @ [311:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Deprecated' @ [312:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ReplaceWith' @ [312:62] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'subSequence' @ [313:76] ==> public open fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'start' @ [313:88] ==> value-parameter start: Int defined in kotlin.text.subSequence[ValueParameterDescriptorImpl]

'end' @ [313:95] ==> value-parameter end: Int defined in kotlin.text.subSequence[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [321:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'length' @ [322:75] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'subSequence' @ [322:93] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [322:105] ==> value-parameter startIndex: Int defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'endIndex' @ [322:117] ==> value-parameter endIndex: Int = ... defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'toString' @ [322:127] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'subSequence' @ [327:62] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'range' @ [327:74] ==> value-parameter range: IntRange defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'start' @ [327:80] ==> public open val start: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'range' @ [327:87] ==> value-parameter range: IntRange defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'endInclusive' @ [327:93] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'toString' @ [327:111] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'this' @ [333:84] ==> <this> defined in kotlin.text.substringBefore[ReceiverParameterDescriptorImpl]

'indexOf' @ [334:17] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [334:25] ==> value-parameter delimiter: Char defined in kotlin.text.substringBefore[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(0, index)' @ [335:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [335:16] ==> val index: Int defined in kotlin.text.substringBefore[LocalVariableDescriptor]

'-' @ [335:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [335:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringBefore[ValueParameterDescriptorImpl]

'substring' @ [335:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [335:69] ==> val index: Int defined in kotlin.text.substringBefore[LocalVariableDescriptor]

'this' @ [342:86] ==> <this> defined in kotlin.text.substringBefore[ReceiverParameterDescriptorImpl]

'indexOf' @ [343:17] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [343:25] ==> value-parameter delimiter: String defined in kotlin.text.substringBefore[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(0, index)' @ [344:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [344:16] ==> val index: Int defined in kotlin.text.substringBefore[LocalVariableDescriptor]

'-' @ [344:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [344:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringBefore[ValueParameterDescriptorImpl]

'substring' @ [344:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [344:69] ==> val index: Int defined in kotlin.text.substringBefore[LocalVariableDescriptor]

'this' @ [351:83] ==> <this> defined in kotlin.text.substringAfter[ReceiverParameterDescriptorImpl]

'indexOf' @ [352:17] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [352:25] ==> value-parameter delimiter: Char defined in kotlin.text.substringAfter[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(index + 1, length)' @ [353:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [353:16] ==> val index: Int defined in kotlin.text.substringAfter[LocalVariableDescriptor]

'-' @ [353:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [353:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringAfter[ValueParameterDescriptorImpl]

'substring' @ [353:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [353:66] ==> val index: Int defined in kotlin.text.substringAfter[LocalVariableDescriptor]

'length' @ [353:77] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'this' @ [360:85] ==> <this> defined in kotlin.text.substringAfter[ReceiverParameterDescriptorImpl]

'indexOf' @ [361:17] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [361:25] ==> value-parameter delimiter: String defined in kotlin.text.substringAfter[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(index + delimiter.length, length)' @ [362:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [362:16] ==> val index: Int defined in kotlin.text.substringAfter[LocalVariableDescriptor]

'-' @ [362:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [362:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringAfter[ValueParameterDescriptorImpl]

'substring' @ [362:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [362:66] ==> val index: Int defined in kotlin.text.substringAfter[LocalVariableDescriptor]

'delimiter' @ [362:74] ==> value-parameter delimiter: String defined in kotlin.text.substringAfter[ValueParameterDescriptorImpl]

'length' @ [362:84] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'length' @ [362:92] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'this' @ [369:88] ==> <this> defined in kotlin.text.substringBeforeLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [370:17] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [370:29] ==> value-parameter delimiter: Char defined in kotlin.text.substringBeforeLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(0, index)' @ [371:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [371:16] ==> val index: Int defined in kotlin.text.substringBeforeLast[LocalVariableDescriptor]

'-' @ [371:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [371:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringBeforeLast[ValueParameterDescriptorImpl]

'substring' @ [371:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [371:69] ==> val index: Int defined in kotlin.text.substringBeforeLast[LocalVariableDescriptor]

'this' @ [378:90] ==> <this> defined in kotlin.text.substringBeforeLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [379:17] ==> public fun CharSequence.lastIndexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [379:29] ==> value-parameter delimiter: String defined in kotlin.text.substringBeforeLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(0, index)' @ [380:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [380:16] ==> val index: Int defined in kotlin.text.substringBeforeLast[LocalVariableDescriptor]

'-' @ [380:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [380:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringBeforeLast[ValueParameterDescriptorImpl]

'substring' @ [380:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [380:69] ==> val index: Int defined in kotlin.text.substringBeforeLast[LocalVariableDescriptor]

'this' @ [387:87] ==> <this> defined in kotlin.text.substringAfterLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [388:17] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [388:29] ==> value-parameter delimiter: Char defined in kotlin.text.substringAfterLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(index + 1, length)' @ [389:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [389:16] ==> val index: Int defined in kotlin.text.substringAfterLast[LocalVariableDescriptor]

'-' @ [389:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [389:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringAfterLast[ValueParameterDescriptorImpl]

'substring' @ [389:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [389:66] ==> val index: Int defined in kotlin.text.substringAfterLast[LocalVariableDescriptor]

'length' @ [389:77] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'this' @ [396:89] ==> <this> defined in kotlin.text.substringAfterLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [397:17] ==> public fun CharSequence.lastIndexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [397:29] ==> value-parameter delimiter: String defined in kotlin.text.substringAfterLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else substring(index + delimiter.length, length)' @ [398:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [398:16] ==> val index: Int defined in kotlin.text.substringAfterLast[LocalVariableDescriptor]

'-' @ [398:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [398:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.substringAfterLast[ValueParameterDescriptorImpl]

'substring' @ [398:56] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'index' @ [398:66] ==> val index: Int defined in kotlin.text.substringAfterLast[LocalVariableDescriptor]

'delimiter' @ [398:74] ==> value-parameter delimiter: String defined in kotlin.text.substringAfterLast[ValueParameterDescriptorImpl]

'length' @ [398:84] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'length' @ [398:92] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'endIndex' @ [408:9] ==> value-parameter endIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'startIndex' @ [408:20] ==> value-parameter startIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'IndexOutOfBoundsException' @ [409:15] ==> public final fun <init>(p0: (String..String?)): IndexOutOfBoundsException /* = IndexOutOfBoundsException */ defined in kotlin.IndexOutOfBoundsException[TypeAliasConstructorDescriptorImpl]

'endIndex' @ [409:54] ==> value-parameter endIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'startIndex' @ [409:91] ==> value-parameter startIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'StringBuilder' @ [410:14] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [411:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.replaceRange[LocalVariableDescriptor]

'append' @ [411:8] ==> public open fun append(p0: (CharSequence..CharSequence?), p1: Int, p2: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [411:15] ==> <this> defined in kotlin.text.replaceRange[ReceiverParameterDescriptorImpl]

'startIndex' @ [411:24] ==> value-parameter startIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'sb' @ [412:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.replaceRange[LocalVariableDescriptor]

'append' @ [412:8] ==> public open fun append(p0: (CharSequence..CharSequence?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'replacement' @ [412:15] ==> value-parameter replacement: CharSequence defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'sb' @ [413:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.replaceRange[LocalVariableDescriptor]

'append' @ [413:8] ==> public open fun append(p0: (CharSequence..CharSequence?), p1: Int, p2: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [413:15] ==> <this> defined in kotlin.text.replaceRange[ReceiverParameterDescriptorImpl]

'endIndex' @ [413:21] ==> value-parameter endIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'length' @ [413:31] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'sb' @ [414:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.replaceRange[LocalVariableDescriptor]

'kotlin.internal.InlineOnly' @ [422:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [424:12] ==> <this> defined in kotlin.text.replaceRange[ReceiverParameterDescriptorImpl]

'replaceRange' @ [424:34] ==> public fun CharSequence.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'startIndex' @ [424:47] ==> value-parameter startIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'endIndex' @ [424:59] ==> value-parameter endIndex: Int defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'replacement' @ [424:69] ==> value-parameter replacement: CharSequence defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'toString' @ [424:82] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'replaceRange' @ [433:11] ==> public fun CharSequence.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'range' @ [433:24] ==> value-parameter range: IntRange defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'start' @ [433:30] ==> public open val start: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'range' @ [433:37] ==> value-parameter range: IntRange defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'endInclusive' @ [433:43] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'replacement' @ [433:61] ==> value-parameter replacement: CharSequence defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [440:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [442:12] ==> <this> defined in kotlin.text.replaceRange[ReceiverParameterDescriptorImpl]

'replaceRange' @ [442:34] ==> public fun CharSequence.replaceRange(range: IntRange, replacement: CharSequence): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'range' @ [442:47] ==> value-parameter range: IntRange defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'replacement' @ [442:54] ==> value-parameter replacement: CharSequence defined in kotlin.text.replaceRange[ValueParameterDescriptorImpl]

'toString' @ [442:67] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'endIndex' @ [453:9] ==> value-parameter endIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'startIndex' @ [453:20] ==> value-parameter startIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'IndexOutOfBoundsException' @ [454:15] ==> public final fun <init>(p0: (String..String?)): IndexOutOfBoundsException /* = IndexOutOfBoundsException */ defined in kotlin.IndexOutOfBoundsException[TypeAliasConstructorDescriptorImpl]

'endIndex' @ [454:54] ==> value-parameter endIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'startIndex' @ [454:91] ==> value-parameter startIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'endIndex' @ [456:9] ==> value-parameter endIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'startIndex' @ [456:21] ==> value-parameter startIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'this' @ [457:16] ==> <this> defined in kotlin.text.removeRange[ReceiverParameterDescriptorImpl]

'subSequence' @ [457:21] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'length' @ [457:36] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'StringBuilder' @ [459:14] ==> public final fun <init>(p0: Int): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'length' @ [459:28] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'endIndex' @ [459:38] ==> value-parameter endIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'startIndex' @ [459:49] ==> value-parameter startIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'sb' @ [460:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.removeRange[LocalVariableDescriptor]

'append' @ [460:8] ==> public open fun append(p0: (CharSequence..CharSequence?), p1: Int, p2: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [460:15] ==> <this> defined in kotlin.text.removeRange[ReceiverParameterDescriptorImpl]

'startIndex' @ [460:24] ==> value-parameter startIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'sb' @ [461:5] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.removeRange[LocalVariableDescriptor]

'append' @ [461:8] ==> public open fun append(p0: (CharSequence..CharSequence?), p1: Int, p2: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [461:15] ==> <this> defined in kotlin.text.removeRange[ReceiverParameterDescriptorImpl]

'endIndex' @ [461:21] ==> value-parameter endIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'length' @ [461:31] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'sb' @ [462:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.removeRange[LocalVariableDescriptor]

'kotlin.internal.InlineOnly' @ [472:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [474:12] ==> <this> defined in kotlin.text.removeRange[ReceiverParameterDescriptorImpl]

'removeRange' @ [474:34] ==> public fun CharSequence.removeRange(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'startIndex' @ [474:46] ==> value-parameter startIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'endIndex' @ [474:58] ==> value-parameter endIndex: Int defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'toString' @ [474:68] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'removeRange' @ [481:70] ==> public fun CharSequence.removeRange(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'range' @ [481:82] ==> value-parameter range: IntRange defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'start' @ [481:88] ==> public open val start: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'range' @ [481:95] ==> value-parameter range: IntRange defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'endInclusive' @ [481:101] ==> public open val endInclusive: Int defined in kotlin.ranges.IntRange[DeserializedPropertyDescriptor]

'kotlin.internal.InlineOnly' @ [488:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [490:12] ==> <this> defined in kotlin.text.removeRange[ReceiverParameterDescriptorImpl]

'removeRange' @ [490:34] ==> public fun CharSequence.removeRange(range: IntRange): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'range' @ [490:46] ==> value-parameter range: IntRange defined in kotlin.text.removeRange[ValueParameterDescriptorImpl]

'toString' @ [490:53] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'startsWith' @ [497:9] ==> public fun CharSequence.startsWith(prefix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [497:20] ==> value-parameter prefix: CharSequence defined in kotlin.text.removePrefix[ValueParameterDescriptorImpl]

'subSequence' @ [498:16] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'prefix' @ [498:28] ==> value-parameter prefix: CharSequence defined in kotlin.text.removePrefix[ValueParameterDescriptorImpl]

'length' @ [498:35] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'length' @ [498:43] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'subSequence' @ [500:12] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'length' @ [500:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'startsWith' @ [508:9] ==> public fun CharSequence.startsWith(prefix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [508:20] ==> value-parameter prefix: CharSequence defined in kotlin.text.removePrefix[ValueParameterDescriptorImpl]

'substring' @ [509:16] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [509:26] ==> value-parameter prefix: CharSequence defined in kotlin.text.removePrefix[ValueParameterDescriptorImpl]

'length' @ [509:33] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [511:12] ==> <this> defined in kotlin.text.removePrefix[ReceiverParameterDescriptorImpl]

'endsWith' @ [519:9] ==> public fun CharSequence.endsWith(suffix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'suffix' @ [519:18] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSuffix[ValueParameterDescriptorImpl]

'subSequence' @ [520:16] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'length' @ [520:31] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'suffix' @ [520:40] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSuffix[ValueParameterDescriptorImpl]

'length' @ [520:47] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'subSequence' @ [522:12] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'length' @ [522:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'endsWith' @ [530:9] ==> public fun CharSequence.endsWith(suffix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'suffix' @ [530:18] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSuffix[ValueParameterDescriptorImpl]

'substring' @ [531:16] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'length' @ [531:29] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'suffix' @ [531:38] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSuffix[ValueParameterDescriptorImpl]

'length' @ [531:45] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [533:12] ==> <this> defined in kotlin.text.removeSuffix[ReceiverParameterDescriptorImpl]

'length' @ [542:10] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'prefix' @ [542:20] ==> value-parameter prefix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [542:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'suffix' @ [542:36] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [542:43] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'startsWith' @ [542:54] ==> public fun CharSequence.startsWith(prefix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [542:65] ==> value-parameter prefix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'endsWith' @ [542:76] ==> public fun CharSequence.endsWith(suffix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'suffix' @ [542:85] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'subSequence' @ [543:16] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'prefix' @ [543:28] ==> value-parameter prefix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [543:35] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'length' @ [543:43] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'suffix' @ [543:52] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [543:59] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'subSequence' @ [545:12] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'length' @ [545:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'length' @ [554:10] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'prefix' @ [554:20] ==> value-parameter prefix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [554:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'suffix' @ [554:36] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [554:43] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'startsWith' @ [554:54] ==> public fun CharSequence.startsWith(prefix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [554:65] ==> value-parameter prefix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'endsWith' @ [554:76] ==> public fun CharSequence.endsWith(suffix: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'suffix' @ [554:85] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'substring' @ [555:16] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [555:26] ==> value-parameter prefix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [555:33] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'length' @ [555:41] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'suffix' @ [555:50] ==> value-parameter suffix: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'length' @ [555:57] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [557:12] ==> <this> defined in kotlin.text.removeSurrounding[ReceiverParameterDescriptorImpl]

'removeSurrounding' @ [565:84] ==> public fun CharSequence.removeSurrounding(prefix: CharSequence, suffix: CharSequence): CharSequence defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [565:102] ==> value-parameter delimiter: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'delimiter' @ [565:113] ==> value-parameter delimiter: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'removeSurrounding' @ [572:72] ==> public fun String.removeSurrounding(prefix: CharSequence, suffix: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [572:90] ==> value-parameter delimiter: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'delimiter' @ [572:101] ==> value-parameter delimiter: CharSequence defined in kotlin.text.removeSurrounding[ValueParameterDescriptorImpl]

'this' @ [578:103] ==> <this> defined in kotlin.text.replaceBefore[ReceiverParameterDescriptorImpl]

'indexOf' @ [579:17] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [579:25] ==> value-parameter delimiter: Char defined in kotlin.text.replaceBefore[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)' @ [580:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [580:16] ==> val index: Int defined in kotlin.text.replaceBefore[LocalVariableDescriptor]

'-' @ [580:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [580:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceBefore[ValueParameterDescriptorImpl]

'replaceRange' @ [580:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [580:72] ==> val index: Int defined in kotlin.text.replaceBefore[LocalVariableDescriptor]

'replacement' @ [580:79] ==> value-parameter replacement: String defined in kotlin.text.replaceBefore[ValueParameterDescriptorImpl]

'this' @ [587:105] ==> <this> defined in kotlin.text.replaceBefore[ReceiverParameterDescriptorImpl]

'indexOf' @ [588:17] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [588:25] ==> value-parameter delimiter: String defined in kotlin.text.replaceBefore[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)' @ [589:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [589:16] ==> val index: Int defined in kotlin.text.replaceBefore[LocalVariableDescriptor]

'-' @ [589:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [589:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceBefore[ValueParameterDescriptorImpl]

'replaceRange' @ [589:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [589:72] ==> val index: Int defined in kotlin.text.replaceBefore[LocalVariableDescriptor]

'replacement' @ [589:79] ==> value-parameter replacement: String defined in kotlin.text.replaceBefore[ValueParameterDescriptorImpl]

'this' @ [596:102] ==> <this> defined in kotlin.text.replaceAfter[ReceiverParameterDescriptorImpl]

'indexOf' @ [597:17] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [597:25] ==> value-parameter delimiter: Char defined in kotlin.text.replaceAfter[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(index + 1, length, replacement)' @ [598:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [598:16] ==> val index: Int defined in kotlin.text.replaceAfter[LocalVariableDescriptor]

'-' @ [598:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [598:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceAfter[ValueParameterDescriptorImpl]

'replaceRange' @ [598:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [598:69] ==> val index: Int defined in kotlin.text.replaceAfter[LocalVariableDescriptor]

'length' @ [598:80] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'replacement' @ [598:88] ==> value-parameter replacement: String defined in kotlin.text.replaceAfter[ValueParameterDescriptorImpl]

'this' @ [605:104] ==> <this> defined in kotlin.text.replaceAfter[ReceiverParameterDescriptorImpl]

'indexOf' @ [606:17] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [606:25] ==> value-parameter delimiter: String defined in kotlin.text.replaceAfter[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(index + delimiter.length, length, replacement)' @ [607:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [607:16] ==> val index: Int defined in kotlin.text.replaceAfter[LocalVariableDescriptor]

'-' @ [607:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [607:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceAfter[ValueParameterDescriptorImpl]

'replaceRange' @ [607:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [607:69] ==> val index: Int defined in kotlin.text.replaceAfter[LocalVariableDescriptor]

'delimiter' @ [607:77] ==> value-parameter delimiter: String defined in kotlin.text.replaceAfter[ValueParameterDescriptorImpl]

'length' @ [607:87] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'length' @ [607:95] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'replacement' @ [607:103] ==> value-parameter replacement: String defined in kotlin.text.replaceAfter[ValueParameterDescriptorImpl]

'this' @ [614:108] ==> <this> defined in kotlin.text.replaceAfterLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [615:17] ==> public fun CharSequence.lastIndexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [615:29] ==> value-parameter delimiter: String defined in kotlin.text.replaceAfterLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(index + delimiter.length, length, replacement)' @ [616:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [616:16] ==> val index: Int defined in kotlin.text.replaceAfterLast[LocalVariableDescriptor]

'-' @ [616:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [616:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceAfterLast[ValueParameterDescriptorImpl]

'replaceRange' @ [616:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [616:69] ==> val index: Int defined in kotlin.text.replaceAfterLast[LocalVariableDescriptor]

'delimiter' @ [616:77] ==> value-parameter delimiter: String defined in kotlin.text.replaceAfterLast[ValueParameterDescriptorImpl]

'length' @ [616:87] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'length' @ [616:95] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'replacement' @ [616:103] ==> value-parameter replacement: String defined in kotlin.text.replaceAfterLast[ValueParameterDescriptorImpl]

'this' @ [623:106] ==> <this> defined in kotlin.text.replaceAfterLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [624:17] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [624:29] ==> value-parameter delimiter: Char defined in kotlin.text.replaceAfterLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(index + 1, length, replacement)' @ [625:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [625:16] ==> val index: Int defined in kotlin.text.replaceAfterLast[LocalVariableDescriptor]

'-' @ [625:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [625:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceAfterLast[ValueParameterDescriptorImpl]

'replaceRange' @ [625:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [625:69] ==> val index: Int defined in kotlin.text.replaceAfterLast[LocalVariableDescriptor]

'length' @ [625:80] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'replacement' @ [625:88] ==> value-parameter replacement: String defined in kotlin.text.replaceAfterLast[ValueParameterDescriptorImpl]

'this' @ [632:107] ==> <this> defined in kotlin.text.replaceBeforeLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [633:17] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [633:29] ==> value-parameter delimiter: Char defined in kotlin.text.replaceBeforeLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)' @ [634:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [634:16] ==> val index: Int defined in kotlin.text.replaceBeforeLast[LocalVariableDescriptor]

'-' @ [634:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [634:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceBeforeLast[ValueParameterDescriptorImpl]

'replaceRange' @ [634:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [634:72] ==> val index: Int defined in kotlin.text.replaceBeforeLast[LocalVariableDescriptor]

'replacement' @ [634:79] ==> value-parameter replacement: String defined in kotlin.text.replaceBeforeLast[ValueParameterDescriptorImpl]

'this' @ [641:109] ==> <this> defined in kotlin.text.replaceBeforeLast[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [642:17] ==> public fun CharSequence.lastIndexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'delimiter' @ [642:29] ==> value-parameter delimiter: String defined in kotlin.text.replaceBeforeLast[ValueParameterDescriptorImpl]

'if (index == -1) missingDelimiterValue else replaceRange(0, index, replacement)' @ [643:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [643:16] ==> val index: Int defined in kotlin.text.replaceBeforeLast[LocalVariableDescriptor]

'-' @ [643:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'missingDelimiterValue' @ [643:29] ==> value-parameter missingDelimiterValue: String = ... defined in kotlin.text.replaceBeforeLast[ValueParameterDescriptorImpl]

'replaceRange' @ [643:56] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [643:72] ==> val index: Int defined in kotlin.text.replaceBeforeLast[LocalVariableDescriptor]

'replacement' @ [643:79] ==> value-parameter replacement: String defined in kotlin.text.replaceBeforeLast[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [657:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'regex' @ [658:85] ==> value-parameter regex: Regex defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'replace' @ [658:91] ==> public final fun replace(input: CharSequence, replacement: String): String defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'this' @ [658:99] ==> <this> defined in kotlin.text.replace[ReceiverParameterDescriptorImpl]

'replacement' @ [658:105] ==> value-parameter replacement: String defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [665:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'regex' @ [666:115] ==> value-parameter regex: Regex defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'replace' @ [666:121] ==> public final fun replace(input: CharSequence, transform: (MatchResult) -> CharSequence): String defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'this' @ [666:129] ==> <this> defined in kotlin.text.replace[ReceiverParameterDescriptorImpl]

'transform' @ [666:135] ==> value-parameter noinline transform: (MatchResult) -> CharSequence defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [673:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'regex' @ [674:90] ==> value-parameter regex: Regex defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'replaceFirst' @ [674:96] ==> public final fun replaceFirst(input: CharSequence, replacement: String): String defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'this' @ [674:109] ==> <this> defined in kotlin.text.replaceFirst[ReceiverParameterDescriptorImpl]

'replacement' @ [674:115] ==> value-parameter replacement: String defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [680:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'regex' @ [681:71] ==> value-parameter regex: Regex defined in kotlin.text.matches[ValueParameterDescriptorImpl]

'matches' @ [681:77] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'this' @ [681:85] ==> <this> defined in kotlin.text.matches[ReceiverParameterDescriptorImpl]

'otherOffset' @ [688:10] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'thisOffset' @ [688:31] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'thisOffset' @ [688:51] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'this' @ [688:64] ==> <this> defined in kotlin.text.regionMatchesImpl[ReceiverParameterDescriptorImpl]

'length' @ [688:69] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'length' @ [688:78] ==> value-parameter length: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'otherOffset' @ [689:17] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'other' @ [689:31] ==> value-parameter other: CharSequence defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'length' @ [689:37] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'length' @ [689:46] ==> value-parameter length: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'..' @ [693:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'length' @ [693:22] ==> value-parameter length: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'!' @ [694:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [694:14] ==> <this> defined in kotlin.text.regionMatchesImpl[ReceiverParameterDescriptorImpl]

'thisOffset' @ [694:19] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'index' @ [694:32] ==> val index: Int defined in kotlin.text.regionMatchesImpl[LocalVariableDescriptor]

'equals' @ [694:39] ==> public fun Char.equals(other: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Char.kt[SimpleFunctionDescriptorImpl]

'other' @ [694:46] ==> value-parameter other: CharSequence defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'otherOffset' @ [694:52] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'index' @ [694:66] ==> val index: Int defined in kotlin.text.regionMatchesImpl[LocalVariableDescriptor]

'ignoreCase' @ [694:74] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.regionMatchesImpl[ValueParameterDescriptorImpl]

'this' @ [704:9] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'length' @ [704:14] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [704:28] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'equals' @ [704:36] ==> public fun Char.equals(other: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Char.kt[SimpleFunctionDescriptorImpl]

'char' @ [704:43] ==> value-parameter char: Char defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'ignoreCase' @ [704:49] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'this' @ [710:9] ==> <this> defined in kotlin.text.endsWith[ReceiverParameterDescriptorImpl]

'length' @ [710:14] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [710:28] ==> <this> defined in kotlin.text.endsWith[ReceiverParameterDescriptorImpl]

'lastIndex' @ [710:33] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'equals' @ [710:44] ==> public fun Char.equals(other: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Char.kt[SimpleFunctionDescriptorImpl]

'char' @ [710:51] ==> value-parameter char: Char defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'ignoreCase' @ [710:57] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'if (!ignoreCase && this is String && prefix is String)
        return this.startsWith(prefix)
    else
        return regionMatchesImpl(0, prefix, 0, prefix.length, ignoreCase)' @ [716:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [716:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [716:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'this' @ [716:24] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'prefix' @ [716:42] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'this' @ [717:16] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'startsWith' @ [717:21] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [717:32] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'regionMatchesImpl' @ [719:16] ==> internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [719:37] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [719:48] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'length' @ [719:55] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'ignoreCase' @ [719:63] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'if (!ignoreCase && this is String && prefix is String)
        return this.startsWith(prefix, startIndex)
    else
        return regionMatchesImpl(startIndex, prefix, 0, prefix.length, ignoreCase)' @ [726:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [726:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [726:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'this' @ [726:24] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'prefix' @ [726:42] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'this' @ [727:16] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'startsWith' @ [727:21] ==> public fun String.startsWith(prefix: String, startIndex: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [727:32] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'startIndex' @ [727:40] ==> value-parameter startIndex: Int defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'regionMatchesImpl' @ [729:16] ==> internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'startIndex' @ [729:34] ==> value-parameter startIndex: Int defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [729:46] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [729:57] ==> value-parameter prefix: CharSequence defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'length' @ [729:64] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'ignoreCase' @ [729:72] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'if (!ignoreCase && this is String && suffix is String)
        return this.endsWith(suffix)
    else
        return regionMatchesImpl(length - suffix.length, suffix, 0, suffix.length, ignoreCase)' @ [736:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [736:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [736:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'this' @ [736:24] ==> <this> defined in kotlin.text.endsWith[ReceiverParameterDescriptorImpl]

'suffix' @ [736:42] ==> value-parameter suffix: CharSequence defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'this' @ [737:16] ==> <this> defined in kotlin.text.endsWith[ReceiverParameterDescriptorImpl]

'endsWith' @ [737:21] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'suffix' @ [737:30] ==> value-parameter suffix: CharSequence defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'regionMatchesImpl' @ [739:16] ==> internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'length' @ [739:34] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'suffix' @ [739:43] ==> value-parameter suffix: CharSequence defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'length' @ [739:50] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'suffix' @ [739:58] ==> value-parameter suffix: CharSequence defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'suffix' @ [739:69] ==> value-parameter suffix: CharSequence defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'length' @ [739:76] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'ignoreCase' @ [739:84] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'minOf' @ [753:26] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Int, b: Int): Int defined in kotlin.comparisons in file _Comparisons.kt[SimpleFunctionDescriptorImpl]

'this' @ [753:32] ==> <this> defined in kotlin.text.commonPrefixWith[ReceiverParameterDescriptorImpl]

'length' @ [753:37] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'other' @ [753:45] ==> value-parameter other: CharSequence defined in kotlin.text.commonPrefixWith[ValueParameterDescriptorImpl]

'length' @ [753:51] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'i' @ [756:12] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'shortestLength' @ [756:16] ==> val shortestLength: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'this' @ [756:34] ==> <this> defined in kotlin.text.commonPrefixWith[ReceiverParameterDescriptorImpl]

'i' @ [756:39] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'equals' @ [756:42] ==> public fun Char.equals(other: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Char.kt[SimpleFunctionDescriptorImpl]

'other' @ [756:49] ==> value-parameter other: CharSequence defined in kotlin.text.commonPrefixWith[ValueParameterDescriptorImpl]

'i' @ [756:55] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'ignoreCase' @ [756:72] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.commonPrefixWith[ValueParameterDescriptorImpl]

'i' @ [757:9] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'this' @ [759:9] ==> <this> defined in kotlin.text.commonPrefixWith[ReceiverParameterDescriptorImpl]

'hasSurrogatePairAt' @ [759:14] ==> public fun CharSequence.hasSurrogatePairAt(index: Int): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'i' @ [759:33] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'other' @ [759:43] ==> value-parameter other: CharSequence defined in kotlin.text.commonPrefixWith[ValueParameterDescriptorImpl]

'hasSurrogatePairAt' @ [759:49] ==> public fun CharSequence.hasSurrogatePairAt(index: Int): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'i' @ [759:68] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'i' @ [760:9] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'subSequence' @ [762:12] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'i' @ [762:27] ==> var i: Int defined in kotlin.text.commonPrefixWith[LocalVariableDescriptor]

'toString' @ [762:30] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'this' @ [773:22] ==> <this> defined in kotlin.text.commonSuffixWith[ReceiverParameterDescriptorImpl]

'length' @ [773:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'other' @ [774:23] ==> value-parameter other: CharSequence defined in kotlin.text.commonSuffixWith[ValueParameterDescriptorImpl]

'length' @ [774:29] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'minOf' @ [775:26] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Int, b: Int): Int defined in kotlin.comparisons in file _Comparisons.kt[SimpleFunctionDescriptorImpl]

'thisLength' @ [775:32] ==> val thisLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'otherLength' @ [775:44] ==> val otherLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'i' @ [778:12] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'shortestLength' @ [778:16] ==> val shortestLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'this' @ [778:34] ==> <this> defined in kotlin.text.commonSuffixWith[ReceiverParameterDescriptorImpl]

'thisLength' @ [778:39] ==> val thisLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'i' @ [778:52] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'equals' @ [778:59] ==> public fun Char.equals(other: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Char.kt[SimpleFunctionDescriptorImpl]

'other' @ [778:66] ==> value-parameter other: CharSequence defined in kotlin.text.commonSuffixWith[ValueParameterDescriptorImpl]

'otherLength' @ [778:72] ==> val otherLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'i' @ [778:86] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'ignoreCase' @ [778:107] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.commonSuffixWith[ValueParameterDescriptorImpl]

'i' @ [779:9] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'this' @ [781:9] ==> <this> defined in kotlin.text.commonSuffixWith[ReceiverParameterDescriptorImpl]

'hasSurrogatePairAt' @ [781:14] ==> public fun CharSequence.hasSurrogatePairAt(index: Int): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'thisLength' @ [781:33] ==> val thisLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'i' @ [781:46] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'other' @ [781:56] ==> value-parameter other: CharSequence defined in kotlin.text.commonSuffixWith[ValueParameterDescriptorImpl]

'hasSurrogatePairAt' @ [781:62] ==> public fun CharSequence.hasSurrogatePairAt(index: Int): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'otherLength' @ [781:81] ==> val otherLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'i' @ [781:95] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'i' @ [782:9] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'subSequence' @ [784:12] ==> public abstract fun subSequence(startIndex: Int, endIndex: Int): CharSequence defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'thisLength' @ [784:24] ==> val thisLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'i' @ [784:37] ==> var i: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'thisLength' @ [784:40] ==> val thisLength: Int defined in kotlin.text.commonSuffixWith[LocalVariableDescriptor]

'toString' @ [784:52] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'!' @ [791:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [791:10] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'chars' @ [791:24] ==> value-parameter chars: CharArray defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'size' @ [791:30] ==> public final val size: Int defined in kotlin.CharArray[DeserializedPropertyDescriptor]

'this' @ [791:43] ==> <this> defined in kotlin.text.findAnyOf[ReceiverParameterDescriptorImpl]

'chars' @ [792:20] ==> value-parameter chars: CharArray defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'single' @ [792:26] ==> public fun CharArray.single(): Char defined in kotlin.collections in file _Arrays.kt[SimpleFunctionDescriptorImpl]

'if (!last) nativeIndexOf(char, startIndex) else nativeLastIndexOf(char, startIndex)' @ [793:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'!' @ [793:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'last' @ [793:26] ==> value-parameter last: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'nativeIndexOf' @ [793:32] ==> @InlineOnly internal inline fun String.nativeIndexOf(ch: Char, fromIndex: Int): Int defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'char' @ [793:46] ==> val char: Char defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'startIndex' @ [793:52] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'nativeLastIndexOf' @ [793:69] ==> @InlineOnly internal inline fun String.nativeLastIndexOf(ch: Char, fromIndex: Int): Int defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'char' @ [793:87] ==> val char: Char defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'startIndex' @ [793:93] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'if (index < 0) null else index to char' @ [794:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Int, Char>?, elseBranch: Pair<Int, Char>?): Pair<Int, Char>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Int, Char>?

'index' @ [794:20] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'index' @ [794:41] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'char' @ [794:50] ==> val char: Char defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'if (!last) startIndex.coerceAtLeast(0)..lastIndex else startIndex.coerceAtMost(lastIndex) downTo 0' @ [797:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntProgression, elseBranch: IntProgression): IntProgression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntProgression

'!' @ [797:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'last' @ [797:24] ==> value-parameter last: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'startIndex' @ [797:30] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'coerceAtLeast' @ [797:41] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'lastIndex' @ [797:59] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'startIndex' @ [797:74] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'coerceAtMost' @ [797:85] ==> public fun Int.coerceAtMost(maximumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'lastIndex' @ [797:98] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'indices' @ [798:19] ==> val indices: IntProgression defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'get' @ [799:27] ==> public abstract operator fun get(index: Int): Char defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'index' @ [799:31] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'chars' @ [800:33] ==> value-parameter chars: CharArray defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'indexOfFirst' @ [800:39] ==> public inline fun CharArray.indexOfFirst(predicate: (Char) -> Boolean): Int defined in kotlin.collections[SimpleFunctionDescriptorImpl]

'it' @ [800:54] ==> value-parameter it: Char defined in kotlin.text.findAnyOf.<anonymous>[ValueParameterDescriptorImpl]

'equals' @ [800:57] ==> public fun Char.equals(other: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Char.kt[SimpleFunctionDescriptorImpl]

'charAtIndex' @ [800:64] ==> val charAtIndex: Char defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'ignoreCase' @ [800:77] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'matchingCharIndex' @ [801:13] ==> val matchingCharIndex: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'index' @ [802:20] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'chars' @ [802:29] ==> value-parameter chars: CharArray defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'matchingCharIndex' @ [802:35] ==> val matchingCharIndex: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'findAnyOf' @ [817:5] ==> private fun CharSequence.findAnyOf(chars: CharArray, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, Char>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'chars' @ [817:15] ==> value-parameter chars: CharArray defined in kotlin.text.indexOfAny[ValueParameterDescriptorImpl]

'startIndex' @ [817:22] ==> value-parameter startIndex: Int = ... defined in kotlin.text.indexOfAny[ValueParameterDescriptorImpl]

'ignoreCase' @ [817:34] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.indexOfAny[ValueParameterDescriptorImpl]

'first' @ [817:61] ==> public final val first: Int defined in kotlin.Pair[PropertyDescriptorImpl]

'-' @ [817:70] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [828:76] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'findAnyOf' @ [829:5] ==> private fun CharSequence.findAnyOf(chars: CharArray, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, Char>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'chars' @ [829:15] ==> value-parameter chars: CharArray defined in kotlin.text.lastIndexOfAny[ValueParameterDescriptorImpl]

'startIndex' @ [829:22] ==> value-parameter startIndex: Int = ... defined in kotlin.text.lastIndexOfAny[ValueParameterDescriptorImpl]

'ignoreCase' @ [829:34] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.lastIndexOfAny[ValueParameterDescriptorImpl]

'first' @ [829:60] ==> public final val first: Int defined in kotlin.Pair[PropertyDescriptorImpl]

'-' @ [829:69] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (!last)
        startIndex.coerceAtLeast(0)..endIndex.coerceAtMost(length)
    else
        startIndex.coerceAtMost(lastIndex) downTo endIndex.coerceAtLeast(0)' @ [833:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntProgression, elseBranch: IntProgression): IntProgression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntProgression

'!' @ [833:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'last' @ [833:24] ==> value-parameter last: Boolean = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'startIndex' @ [834:9] ==> value-parameter startIndex: Int defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'coerceAtLeast' @ [834:20] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'endIndex' @ [834:38] ==> value-parameter endIndex: Int defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'coerceAtMost' @ [834:47] ==> public fun Int.coerceAtMost(maximumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'length' @ [834:60] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'startIndex' @ [836:9] ==> value-parameter startIndex: Int defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'coerceAtMost' @ [836:20] ==> public fun Int.coerceAtMost(maximumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'lastIndex' @ [836:33] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'endIndex' @ [836:51] ==> value-parameter endIndex: Int defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'coerceAtLeast' @ [836:60] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'if (this is String && other is String) { // smart cast
        for (index in indices) {
            if (other.regionMatches(0, this, index, other.length, ignoreCase))
                return index
        }
    } else {
        for (index in indices) {
            if (other.regionMatchesImpl(0, this, index, other.length, ignoreCase))
                return index
        }
    }' @ [838:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'this' @ [838:9] ==> <this> defined in kotlin.text.indexOf[ReceiverParameterDescriptorImpl]

'other' @ [838:27] ==> value-parameter other: CharSequence defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'indices' @ [839:23] ==> val indices: IntProgression defined in kotlin.text.indexOf[LocalVariableDescriptor]

'other' @ [840:17] ==> value-parameter other: CharSequence defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'regionMatches' @ [840:23] ==> public fun String.regionMatches(thisOffset: Int, other: String, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'this' @ [840:40] ==> <this> defined in kotlin.text.indexOf[ReceiverParameterDescriptorImpl]

'index' @ [840:46] ==> val index: Int defined in kotlin.text.indexOf[LocalVariableDescriptor]

'other' @ [840:53] ==> value-parameter other: CharSequence defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'length' @ [840:59] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'ignoreCase' @ [840:67] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'index' @ [841:24] ==> val index: Int defined in kotlin.text.indexOf[LocalVariableDescriptor]

'indices' @ [844:23] ==> val indices: IntProgression defined in kotlin.text.indexOf[LocalVariableDescriptor]

'other' @ [845:17] ==> value-parameter other: CharSequence defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'regionMatchesImpl' @ [845:23] ==> internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'this' @ [845:44] ==> <this> defined in kotlin.text.indexOf[ReceiverParameterDescriptorImpl]

'index' @ [845:50] ==> val index: Int defined in kotlin.text.indexOf[LocalVariableDescriptor]

'other' @ [845:57] ==> value-parameter other: CharSequence defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'length' @ [845:63] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'ignoreCase' @ [845:71] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'index' @ [846:24] ==> val index: Int defined in kotlin.text.indexOf[LocalVariableDescriptor]

'-' @ [849:12] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'!' @ [853:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [853:10] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'strings' @ [853:24] ==> value-parameter strings: Collection<String> defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'size' @ [853:32] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'strings' @ [854:22] ==> value-parameter strings: Collection<String> defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'single' @ [854:30] ==> public fun <T> Iterable<String>.single(): String defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'if (!last) indexOf(string, startIndex) else lastIndexOf(string, startIndex)' @ [855:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'!' @ [855:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'last' @ [855:26] ==> value-parameter last: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'indexOf' @ [855:32] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'string' @ [855:40] ==> val string: String defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'startIndex' @ [855:48] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'lastIndexOf' @ [855:65] ==> public fun CharSequence.lastIndexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'string' @ [855:77] ==> val string: String defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'startIndex' @ [855:85] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'if (index < 0) null else index to string' @ [856:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Int, String>?, elseBranch: Pair<Int, String>?): Pair<Int, String>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Int, String>?

'index' @ [856:20] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'index' @ [856:41] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'string' @ [856:50] ==> val string: String defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'if (!last) startIndex.coerceAtLeast(0)..length else startIndex.coerceAtMost(lastIndex) downTo 0' @ [859:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntProgression, elseBranch: IntProgression): IntProgression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntProgression

'!' @ [859:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'last' @ [859:24] ==> value-parameter last: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'startIndex' @ [859:30] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'coerceAtLeast' @ [859:41] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'length' @ [859:59] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'startIndex' @ [859:71] ==> value-parameter startIndex: Int defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'coerceAtMost' @ [859:82] ==> public fun Int.coerceAtMost(maximumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'lastIndex' @ [859:95] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'if (this is String) {
        for (index in indices) {
            val matchingString = strings.firstOrNull { it.regionMatches(0, this, index, it.length, ignoreCase) }
            if (matchingString != null)
                return index to matchingString
        }
    } else {
        for (index in indices) {
            val matchingString = strings.firstOrNull { it.regionMatchesImpl(0, this, index, it.length, ignoreCase) }
            if (matchingString != null)
                return index to matchingString
        }
    }' @ [861:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'this' @ [861:9] ==> <this> defined in kotlin.text.findAnyOf[ReceiverParameterDescriptorImpl]

'indices' @ [862:23] ==> val indices: IntProgression defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'strings' @ [863:34] ==> value-parameter strings: Collection<String> defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'firstOrNull' @ [863:42] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'it' @ [863:56] ==> value-parameter it: String defined in kotlin.text.findAnyOf.<anonymous>[ValueParameterDescriptorImpl]

'regionMatches' @ [863:59] ==> public fun String.regionMatches(thisOffset: Int, other: String, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'this' @ [863:76] ==> <this> defined in kotlin.text.findAnyOf[ReceiverParameterDescriptorImpl]

'index' @ [863:82] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'it' @ [863:89] ==> value-parameter it: String defined in kotlin.text.findAnyOf.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [863:92] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ignoreCase' @ [863:100] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'matchingString' @ [864:17] ==> val matchingString: String? defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'index' @ [865:24] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'matchingString' @ [865:33] ==> val matchingString: String? defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'indices' @ [868:23] ==> val indices: IntProgression defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'strings' @ [869:34] ==> value-parameter strings: Collection<String> defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'firstOrNull' @ [869:42] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'it' @ [869:56] ==> value-parameter it: String defined in kotlin.text.findAnyOf.<anonymous>[ValueParameterDescriptorImpl]

'regionMatchesImpl' @ [869:59] ==> internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'this' @ [869:80] ==> <this> defined in kotlin.text.findAnyOf[ReceiverParameterDescriptorImpl]

'index' @ [869:86] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'it' @ [869:93] ==> value-parameter it: String defined in kotlin.text.findAnyOf.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [869:96] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ignoreCase' @ [869:104] ==> value-parameter ignoreCase: Boolean defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'matchingString' @ [870:17] ==> val matchingString: String? defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'index' @ [871:24] ==> val index: Int defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'matchingString' @ [871:33] ==> val matchingString: String? defined in kotlin.text.findAnyOf[LocalVariableDescriptor]

'findAnyOf' @ [891:5] ==> private fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, String>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'strings' @ [891:15] ==> value-parameter strings: Collection<String> defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'startIndex' @ [891:24] ==> value-parameter startIndex: Int = ... defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'ignoreCase' @ [891:36] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.findAnyOf[ValueParameterDescriptorImpl]

'lastIndex' @ [905:86] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'findAnyOf' @ [906:5] ==> private fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, String>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'strings' @ [906:15] ==> value-parameter strings: Collection<String> defined in kotlin.text.findLastAnyOf[ValueParameterDescriptorImpl]

'startIndex' @ [906:24] ==> value-parameter startIndex: Int = ... defined in kotlin.text.findLastAnyOf[ValueParameterDescriptorImpl]

'ignoreCase' @ [906:36] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.findLastAnyOf[ValueParameterDescriptorImpl]

'findAnyOf' @ [920:5] ==> private fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, String>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'strings' @ [920:15] ==> value-parameter strings: Collection<String> defined in kotlin.text.indexOfAny[ValueParameterDescriptorImpl]

'startIndex' @ [920:24] ==> value-parameter startIndex: Int = ... defined in kotlin.text.indexOfAny[ValueParameterDescriptorImpl]

'ignoreCase' @ [920:36] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.indexOfAny[ValueParameterDescriptorImpl]

'first' @ [920:63] ==> public final val first: Int defined in kotlin.Pair[PropertyDescriptorImpl]

'-' @ [920:72] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [934:87] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'findAnyOf' @ [935:5] ==> private fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, String>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'strings' @ [935:15] ==> value-parameter strings: Collection<String> defined in kotlin.text.lastIndexOfAny[ValueParameterDescriptorImpl]

'startIndex' @ [935:24] ==> value-parameter startIndex: Int = ... defined in kotlin.text.lastIndexOfAny[ValueParameterDescriptorImpl]

'ignoreCase' @ [935:36] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.lastIndexOfAny[ValueParameterDescriptorImpl]

'first' @ [935:62] ==> public final val first: Int defined in kotlin.Pair[PropertyDescriptorImpl]

'-' @ [935:71] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (ignoreCase || this !is String)
        indexOfAny(charArrayOf(char), startIndex, ignoreCase)
    else
        nativeIndexOf(char, startIndex)' @ [947:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'ignoreCase' @ [947:16] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'this' @ [947:30] ==> <this> defined in kotlin.text.indexOf[ReceiverParameterDescriptorImpl]

'indexOfAny' @ [948:9] ==> public fun CharSequence.indexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'charArrayOf' @ [948:20] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'char' @ [948:32] ==> value-parameter char: Char defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'startIndex' @ [948:39] ==> value-parameter startIndex: Int = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'ignoreCase' @ [948:51] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'nativeIndexOf' @ [950:9] ==> @InlineOnly internal inline fun String.nativeIndexOf(ch: Char, fromIndex: Int): Int defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'char' @ [950:23] ==> value-parameter char: Char defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'startIndex' @ [950:29] ==> value-parameter startIndex: Int = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'if (ignoreCase || this !is String)
        indexOf(string, startIndex, length, ignoreCase)
    else
        nativeIndexOf(string, startIndex)' @ [961:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'ignoreCase' @ [961:16] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'this' @ [961:30] ==> <this> defined in kotlin.text.indexOf[ReceiverParameterDescriptorImpl]

'indexOf' @ [962:9] ==> private fun CharSequence.indexOf(other: CharSequence, startIndex: Int, endIndex: Int, ignoreCase: Boolean, last: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'string' @ [962:17] ==> value-parameter string: String defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'startIndex' @ [962:25] ==> value-parameter startIndex: Int = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'length' @ [962:37] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'ignoreCase' @ [962:45] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'nativeIndexOf' @ [964:9] ==> @InlineOnly internal inline fun String.nativeIndexOf(str: String, fromIndex: Int): Int defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'string' @ [964:23] ==> value-parameter string: String defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'startIndex' @ [964:31] ==> value-parameter startIndex: Int = ... defined in kotlin.text.indexOf[ValueParameterDescriptorImpl]

'lastIndex' @ [975:67] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'if (ignoreCase || this !is String)
        lastIndexOfAny(charArrayOf(char), startIndex, ignoreCase)
    else
        nativeLastIndexOf(char, startIndex)' @ [976:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'ignoreCase' @ [976:16] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'this' @ [976:30] ==> <this> defined in kotlin.text.lastIndexOf[ReceiverParameterDescriptorImpl]

'lastIndexOfAny' @ [977:9] ==> public fun CharSequence.lastIndexOfAny(chars: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'charArrayOf' @ [977:24] ==> public fun charArrayOf(vararg elements: Char): CharArray defined in kotlin[DeserializedSimpleFunctionDescriptor]

'char' @ [977:36] ==> value-parameter char: Char defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'startIndex' @ [977:43] ==> value-parameter startIndex: Int = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'ignoreCase' @ [977:55] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'nativeLastIndexOf' @ [979:9] ==> @InlineOnly internal inline fun String.nativeLastIndexOf(ch: Char, fromIndex: Int): Int defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'char' @ [979:27] ==> value-parameter char: Char defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'startIndex' @ [979:33] ==> value-parameter startIndex: Int = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'lastIndex' @ [990:71] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'if (ignoreCase || this !is String)
        indexOf(string, startIndex, 0, ignoreCase, last = true)
    else
        nativeLastIndexOf(string, startIndex)' @ [991:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'ignoreCase' @ [991:16] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'this' @ [991:30] ==> <this> defined in kotlin.text.lastIndexOf[ReceiverParameterDescriptorImpl]

'indexOf' @ [992:9] ==> private fun CharSequence.indexOf(other: CharSequence, startIndex: Int, endIndex: Int, ignoreCase: Boolean, last: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'string' @ [992:17] ==> value-parameter string: String defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'startIndex' @ [992:25] ==> value-parameter startIndex: Int = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'ignoreCase' @ [992:40] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'nativeLastIndexOf' @ [994:9] ==> @InlineOnly internal inline fun String.nativeLastIndexOf(str: String, fromIndex: Int): Int defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'string' @ [994:27] ==> value-parameter string: String defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'startIndex' @ [994:35] ==> value-parameter startIndex: Int = ... defined in kotlin.text.lastIndexOf[ValueParameterDescriptorImpl]

'Suppress' @ [1002:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (other is String)
        indexOf(other, ignoreCase = ignoreCase) >= 0
    else
        indexOf(other, 0, length, ignoreCase) >= 0' @ [1004:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'other' @ [1004:9] ==> value-parameter other: CharSequence defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'indexOf' @ [1005:9] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'other' @ [1005:17] ==> value-parameter other: CharSequence defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'ignoreCase' @ [1005:37] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'indexOf' @ [1007:9] ==> private fun CharSequence.indexOf(other: CharSequence, startIndex: Int, endIndex: Int, ignoreCase: Boolean, last: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'other' @ [1007:17] ==> value-parameter other: CharSequence defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'length' @ [1007:27] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'ignoreCase' @ [1007:35] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'Suppress' @ [1016:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'indexOf' @ [1018:9] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'char' @ [1018:17] ==> value-parameter char: Char defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'ignoreCase' @ [1018:36] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [1023:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'regex' @ [1024:75] ==> value-parameter regex: Regex defined in kotlin.text.contains[ValueParameterDescriptorImpl]

'containsMatchIn' @ [1024:81] ==> public final fun containsMatchIn(input: CharSequence): Boolean defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'this' @ [1024:97] ==> <this> defined in kotlin.text.contains[ReceiverParameterDescriptorImpl]

'-' @ [1033:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [1034:38] ==> private final val startIndex: Int defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'coerceIn' @ [1034:49] ==> public fun Int.coerceIn(minimumValue: Int, maximumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'input' @ [1034:61] ==> private final val input: CharSequence defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'length' @ [1034:67] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'currentStartIndex' @ [1035:36] ==> public final var currentStartIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (nextSearchIndex < 0) {
                nextState = 0
                nextItem = null
            }
            else {
                if (limit > 0 && ++counter >= limit || nextSearchIndex > input.length) {
                    nextItem = currentStartIndex..input.lastIndex
                    nextSearchIndex = -1
                }
                else {
                    val match = input.getNextMatch(nextSearchIndex)
                    if (match == null) {
                        nextItem = currentStartIndex..input.lastIndex
                        nextSearchIndex = -1
                    }
                    else {
                        val (index,length) = match
                        nextItem = currentStartIndex..index-1
                        currentStartIndex = index + length
                        nextSearchIndex = currentStartIndex + if (length == 0) 1 else 0
                    }
                }
                nextState = 1
            }' @ [1040:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'nextSearchIndex' @ [1040:17] ==> public final var nextSearchIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [1041:17] ==> public final var nextState: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextItem' @ [1042:17] ==> public final var nextItem: IntRange? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (limit > 0 && ++counter >= limit || nextSearchIndex > input.length) {
                    nextItem = currentStartIndex..input.lastIndex
                    nextSearchIndex = -1
                }
                else {
                    val match = input.getNextMatch(nextSearchIndex)
                    if (match == null) {
                        nextItem = currentStartIndex..input.lastIndex
                        nextSearchIndex = -1
                    }
                    else {
                        val (index,length) = match
                        nextItem = currentStartIndex..index-1
                        currentStartIndex = index + length
                        nextSearchIndex = currentStartIndex + if (length == 0) 1 else 0
                    }
                }' @ [1045:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'limit' @ [1045:21] ==> private final val limit: Int defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'++' @ [1045:34] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'counter' @ [1045:36] ==> public final var counter: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'limit' @ [1045:47] ==> private final val limit: Int defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'nextSearchIndex' @ [1045:56] ==> public final var nextSearchIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'input' @ [1045:74] ==> private final val input: CharSequence defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'length' @ [1045:80] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'nextItem' @ [1046:21] ==> public final var nextItem: IntRange? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'currentStartIndex' @ [1046:32] ==> public final var currentStartIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'input' @ [1046:51] ==> private final val input: CharSequence defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'lastIndex' @ [1046:57] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'nextSearchIndex' @ [1047:21] ==> public final var nextSearchIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [1047:39] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'input' @ [1050:33] ==> private final val input: CharSequence defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'invoke' @ [1050:39] ==> public abstract operator fun CharSequence.invoke(p2: Int): Pair<Int, Int>? defined in kotlin.Function2[FunctionInvokeDescriptor]

'nextSearchIndex' @ [1050:52] ==> public final var nextSearchIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (match == null) {
                        nextItem = currentStartIndex..input.lastIndex
                        nextSearchIndex = -1
                    }
                    else {
                        val (index,length) = match
                        nextItem = currentStartIndex..index-1
                        currentStartIndex = index + length
                        nextSearchIndex = currentStartIndex + if (length == 0) 1 else 0
                    }' @ [1051:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'match' @ [1051:25] ==> val match: Pair<Int, Int>? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'nextItem' @ [1052:25] ==> public final var nextItem: IntRange? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'currentStartIndex' @ [1052:36] ==> public final var currentStartIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'input' @ [1052:55] ==> private final val input: CharSequence defined in kotlin.text.DelimitedRangesSequence[PropertyDescriptorImpl]

'lastIndex' @ [1052:61] ==> public val CharSequence.lastIndex: Int defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'nextSearchIndex' @ [1053:25] ==> public final var nextSearchIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [1053:43] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'component1' @ [1056:30] ==> public final operator fun component1(): Int defined in kotlin.Pair[SimpleFunctionDescriptorImpl]

'component2' @ [1056:36] ==> public final operator fun component2(): Int defined in kotlin.Pair[SimpleFunctionDescriptorImpl]

'match' @ [1056:46] ==> val match: Pair<Int, Int>? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'nextItem' @ [1057:25] ==> public final var nextItem: IntRange? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'currentStartIndex' @ [1057:36] ==> public final var currentStartIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'index' @ [1057:55] ==> val index: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'currentStartIndex' @ [1058:25] ==> public final var currentStartIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'index' @ [1058:45] ==> val index: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'length' @ [1058:53] ==> val length: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'nextSearchIndex' @ [1059:25] ==> public final var nextSearchIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'currentStartIndex' @ [1059:43] ==> public final var currentStartIndex: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'if (length == 0) 1 else 0' @ [1059:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'length' @ [1059:67] ==> val length: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>.calcNext[LocalVariableDescriptor]

'nextState' @ [1062:17] ==> public final var nextState: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [1067:17] ==> public final var nextState: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [1067:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calcNext' @ [1068:17] ==> private final fun calcNext(): Unit defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [1069:17] ==> public final var nextState: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'NoSuchElementException' @ [1070:23] ==> public final fun <init>(): NoSuchElementException /* = NoSuchElementException */ defined in kotlin.NoSuchElementException[TypeAliasConstructorDescriptorImpl]

'nextItem' @ [1071:26] ==> public final var nextItem: IntRange? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextItem' @ [1073:13] ==> public final var nextItem: IntRange? defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextState' @ [1074:13] ==> public final var nextState: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [1074:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [1075:20] ==> val result: IntRange defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>.next[LocalVariableDescriptor]

'nextState' @ [1079:17] ==> public final var nextState: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'-' @ [1079:30] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'calcNext' @ [1080:17] ==> private final fun calcNext(): Unit defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'nextState' @ [1081:20] ==> public final var nextState: Int defined in kotlin.text.DelimitedRangesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'require' @ [1097:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'limit' @ [1097:13] ==> value-parameter limit: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'limit' @ [1097:65] ==> value-parameter limit: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'DelimitedRangesSequence' @ [1099:12] ==> public constructor DelimitedRangesSequence(input: CharSequence, startIndex: Int, limit: Int, getNextMatch: CharSequence.(Int) -> Pair<Int, Int>?) defined in kotlin.text.DelimitedRangesSequence[ClassConstructorDescriptorImpl]

'this' @ [1099:36] ==> <this> defined in kotlin.text.rangesDelimitedBy[ReceiverParameterDescriptorImpl]

'startIndex' @ [1099:42] ==> value-parameter startIndex: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'limit' @ [1099:54] ==> value-parameter limit: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'findAnyOf' @ [1099:77] ==> private fun CharSequence.findAnyOf(chars: CharArray, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, Char>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'delimiters' @ [1099:87] ==> value-parameter delimiters: CharArray defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'startIndex' @ [1099:99] ==> value-parameter startIndex: Int defined in kotlin.text.rangesDelimitedBy.<anonymous>[ValueParameterDescriptorImpl]

'ignoreCase' @ [1099:124] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'let' @ [1099:151] ==> @InlineOnly public inline fun <T, R> Pair<Int, Char>.let(block: (Pair<Int, Char>) -> Pair<Int, Int>): Pair<Int, Int> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<Int, Char>
    <R> -> Pair<Int, Int>

'it' @ [1099:157] ==> value-parameter it: Pair<Int, Char> defined in kotlin.text.rangesDelimitedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [1099:160] ==> public final val first: Int defined in kotlin.Pair[PropertyDescriptorImpl]

'require' @ [1118:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'limit' @ [1118:13] ==> value-parameter limit: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'limit' @ [1118:65] ==> value-parameter limit: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'delimiters' @ [1119:26] ==> value-parameter delimiters: Array<out String> defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'asList' @ [1119:37] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'DelimitedRangesSequence' @ [1121:12] ==> public constructor DelimitedRangesSequence(input: CharSequence, startIndex: Int, limit: Int, getNextMatch: CharSequence.(Int) -> Pair<Int, Int>?) defined in kotlin.text.DelimitedRangesSequence[ClassConstructorDescriptorImpl]

'this' @ [1121:36] ==> <this> defined in kotlin.text.rangesDelimitedBy[ReceiverParameterDescriptorImpl]

'startIndex' @ [1121:42] ==> value-parameter startIndex: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'limit' @ [1121:54] ==> value-parameter limit: Int = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'findAnyOf' @ [1121:77] ==> private fun CharSequence.findAnyOf(strings: Collection<String>, startIndex: Int, ignoreCase: Boolean, last: Boolean): Pair<Int, String>? defined in kotlin.text[SimpleFunctionDescriptorImpl]

'delimitersList' @ [1121:87] ==> val delimitersList: List<String> defined in kotlin.text.rangesDelimitedBy[LocalVariableDescriptor]

'startIndex' @ [1121:103] ==> value-parameter startIndex: Int defined in kotlin.text.rangesDelimitedBy.<anonymous>[ValueParameterDescriptorImpl]

'ignoreCase' @ [1121:128] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.rangesDelimitedBy[ValueParameterDescriptorImpl]

'let' @ [1121:155] ==> @InlineOnly public inline fun <T, R> Pair<Int, String>.let(block: (Pair<Int, String>) -> Pair<Int, Int>): Pair<Int, Int> defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<Int, String>
    <R> -> Pair<Int, Int>

'it' @ [1121:161] ==> value-parameter it: Pair<Int, String> defined in kotlin.text.rangesDelimitedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [1121:164] ==> public final val first: Int defined in kotlin.Pair[PropertyDescriptorImpl]

'it' @ [1121:173] ==> value-parameter it: Pair<Int, String> defined in kotlin.text.rangesDelimitedBy.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [1121:176] ==> public final val second: String defined in kotlin.Pair[PropertyDescriptorImpl]

'length' @ [1121:183] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'rangesDelimitedBy' @ [1140:9] ==> private fun CharSequence.rangesDelimitedBy(delimiters: Array<out String>, startIndex: Int = ..., ignoreCase: Boolean = ..., limit: Int = ...): Sequence<IntRange> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'delimiters' @ [1140:27] ==> value-parameter vararg delimiters: String defined in kotlin.text.splitToSequence[ValueParameterDescriptorImpl]

'ignoreCase' @ [1140:52] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.splitToSequence[ValueParameterDescriptorImpl]

'limit' @ [1140:72] ==> value-parameter limit: Int = ... defined in kotlin.text.splitToSequence[ValueParameterDescriptorImpl]

'map' @ [1140:79] ==> public fun <T, R> Sequence<IntRange>.map(transform: (IntRange) -> String): Sequence<String> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IntRange
    <R> -> String

'substring' @ [1140:85] ==> public fun CharSequence.substring(range: IntRange): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'it' @ [1140:95] ==> value-parameter it: IntRange defined in kotlin.text.splitToSequence.<anonymous>[ValueParameterDescriptorImpl]

'rangesDelimitedBy' @ [1154:9] ==> private fun CharSequence.rangesDelimitedBy(delimiters: Array<out String>, startIndex: Int = ..., ignoreCase: Boolean = ..., limit: Int = ...): Sequence<IntRange> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'delimiters' @ [1154:27] ==> value-parameter vararg delimiters: String defined in kotlin.text.split[ValueParameterDescriptorImpl]

'ignoreCase' @ [1154:52] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'limit' @ [1154:72] ==> value-parameter limit: Int = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'asIterable' @ [1154:79] ==> public fun <T> Sequence<IntRange>.asIterable(): Iterable<IntRange> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IntRange

'map' @ [1154:92] ==> public inline fun <T, R> Iterable<IntRange>.map(transform: (IntRange) -> String): List<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IntRange
    <R> -> String

'substring' @ [1154:98] ==> public fun CharSequence.substring(range: IntRange): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'it' @ [1154:108] ==> value-parameter it: IntRange defined in kotlin.text.split.<anonymous>[ValueParameterDescriptorImpl]

'rangesDelimitedBy' @ [1164:9] ==> private fun CharSequence.rangesDelimitedBy(delimiters: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ..., limit: Int = ...): Sequence<IntRange> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'delimiters' @ [1164:27] ==> value-parameter vararg delimiters: Char defined in kotlin.text.splitToSequence[ValueParameterDescriptorImpl]

'ignoreCase' @ [1164:52] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.splitToSequence[ValueParameterDescriptorImpl]

'limit' @ [1164:72] ==> value-parameter limit: Int = ... defined in kotlin.text.splitToSequence[ValueParameterDescriptorImpl]

'map' @ [1164:79] ==> public fun <T, R> Sequence<IntRange>.map(transform: (IntRange) -> String): Sequence<String> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IntRange
    <R> -> String

'substring' @ [1164:85] ==> public fun CharSequence.substring(range: IntRange): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'it' @ [1164:95] ==> value-parameter it: IntRange defined in kotlin.text.splitToSequence.<anonymous>[ValueParameterDescriptorImpl]

'rangesDelimitedBy' @ [1174:9] ==> private fun CharSequence.rangesDelimitedBy(delimiters: CharArray, startIndex: Int = ..., ignoreCase: Boolean = ..., limit: Int = ...): Sequence<IntRange> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'delimiters' @ [1174:27] ==> value-parameter vararg delimiters: Char defined in kotlin.text.split[ValueParameterDescriptorImpl]

'ignoreCase' @ [1174:52] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'limit' @ [1174:72] ==> value-parameter limit: Int = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'asIterable' @ [1174:79] ==> public fun <T> Sequence<IntRange>.asIterable(): Iterable<IntRange> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IntRange

'map' @ [1174:92] ==> public inline fun <T, R> Iterable<IntRange>.map(transform: (IntRange) -> String): List<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> IntRange
    <R> -> String

'substring' @ [1174:98] ==> public fun CharSequence.substring(range: IntRange): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'it' @ [1174:108] ==> value-parameter it: IntRange defined in kotlin.text.split.<anonymous>[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [1182:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'regex' @ [1183:84] ==> value-parameter regex: Regex defined in kotlin.text.split[ValueParameterDescriptorImpl]

'split' @ [1183:90] ==> public final fun split(input: CharSequence, limit: Int = ...): List<String> defined in kotlin.text.Regex[SimpleFunctionDescriptorImpl]

'this' @ [1183:96] ==> <this> defined in kotlin.text.split[ReceiverParameterDescriptorImpl]

'limit' @ [1183:102] ==> value-parameter limit: Int = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'splitToSequence' @ [1188:60] ==> public fun CharSequence.splitToSequence(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): Sequence<String> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'lineSequence' @ [1193:49] ==> public fun CharSequence.lineSequence(): Sequence<String> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'toList' @ [1193:64] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

