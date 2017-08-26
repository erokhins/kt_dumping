'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmMultifileClass' @ [2:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[DeserializedClassConstructorDescriptor]

'kotlin.jvm.JvmName' @ [3:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'Suppress' @ [4:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'kotlin.internal.InlineOnly' @ [16:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [17:76] ==> <this> defined in kotlin.text.nativeIndexOf[ReceiverParameterDescriptorImpl]

'indexOf' @ [17:102] ==> public open fun indexOf(p0: Int, p1: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'ch' @ [17:110] ==> value-parameter ch: Char defined in kotlin.text.nativeIndexOf[ValueParameterDescriptorImpl]

'toInt' @ [17:113] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'fromIndex' @ [17:122] ==> value-parameter fromIndex: Int defined in kotlin.text.nativeIndexOf[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [22:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [23:79] ==> <this> defined in kotlin.text.nativeIndexOf[ReceiverParameterDescriptorImpl]

'indexOf' @ [23:105] ==> public open fun indexOf(p0: (String..String?), p1: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'str' @ [23:113] ==> value-parameter str: String defined in kotlin.text.nativeIndexOf[ValueParameterDescriptorImpl]

'fromIndex' @ [23:118] ==> value-parameter fromIndex: Int defined in kotlin.text.nativeIndexOf[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [28:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [29:80] ==> <this> defined in kotlin.text.nativeLastIndexOf[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [29:106] ==> public open fun lastIndexOf(p0: Int, p1: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'ch' @ [29:118] ==> value-parameter ch: Char defined in kotlin.text.nativeLastIndexOf[ValueParameterDescriptorImpl]

'toInt' @ [29:121] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'fromIndex' @ [29:130] ==> value-parameter fromIndex: Int defined in kotlin.text.nativeLastIndexOf[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [34:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [35:83] ==> <this> defined in kotlin.text.nativeLastIndexOf[ReceiverParameterDescriptorImpl]

'lastIndexOf' @ [35:109] ==> public open fun lastIndexOf(p0: (String..String?), p1: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'str' @ [35:121] ==> value-parameter str: String defined in kotlin.text.nativeLastIndexOf[ValueParameterDescriptorImpl]

'fromIndex' @ [35:126] ==> value-parameter fromIndex: Int defined in kotlin.text.nativeLastIndexOf[ValueParameterDescriptorImpl]

'this' @ [43:9] ==> <this> defined in kotlin.text.equals[ReceiverParameterDescriptorImpl]

'other' @ [44:16] ==> value-parameter other: String? defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        (this as java.lang.String).equals(other)
    else
        (this as java.lang.String).equalsIgnoreCase(other)' @ [45:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [45:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [45:17] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'this' @ [46:10] ==> <this> defined in kotlin.text.equals[ReceiverParameterDescriptorImpl]

'equals' @ [46:36] ==> public open fun equals(other: Any?): Boolean defined in java.lang.String[JavaMethodDescriptor]

'other' @ [46:43] ==> value-parameter other: String? defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'this' @ [48:10] ==> <this> defined in kotlin.text.equals[ReceiverParameterDescriptorImpl]

'equalsIgnoreCase' @ [48:36] ==> public open fun equalsIgnoreCase(p0: (String..String?)): Boolean defined in java.lang.String[JavaMethodDescriptor]

'other' @ [48:53] ==> value-parameter other: String? defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        return (this as java.lang.String).replace(oldChar, newChar)
    else
        return splitToSequence(oldChar, ignoreCase = ignoreCase).joinToString(separator = newChar.toString())' @ [55:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [55:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [55:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'this' @ [56:17] ==> <this> defined in kotlin.text.replace[ReceiverParameterDescriptorImpl]

'replace' @ [56:43] ==> public open fun replace(p0: Char, p1: Char): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'oldChar' @ [56:51] ==> value-parameter oldChar: Char defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'newChar' @ [56:60] ==> value-parameter newChar: Char defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'splitToSequence' @ [58:16] ==> public fun CharSequence.splitToSequence(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): Sequence<String> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'oldChar' @ [58:32] ==> value-parameter oldChar: Char defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'ignoreCase' @ [58:54] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'joinToString' @ [58:66] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'newChar' @ [58:91] ==> value-parameter newChar: Char defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'toString' @ [58:99] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'splitToSequence' @ [66:9] ==> public fun CharSequence.splitToSequence(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): Sequence<String> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'oldValue' @ [66:25] ==> value-parameter oldValue: String defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'ignoreCase' @ [66:48] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'joinToString' @ [66:60] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'newValue' @ [66:85] ==> value-parameter newValue: String defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'indexOf' @ [73:17] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'oldChar' @ [73:25] ==> value-parameter oldChar: Char defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'ignoreCase' @ [73:47] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'if (index < 0) this else this.replaceRange(index, index + 1, newChar.toString())' @ [74:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [74:16] ==> val index: Int defined in kotlin.text.replaceFirst[LocalVariableDescriptor]

'this' @ [74:27] ==> <this> defined in kotlin.text.replaceFirst[ReceiverParameterDescriptorImpl]

'this' @ [74:37] ==> <this> defined in kotlin.text.replaceFirst[ReceiverParameterDescriptorImpl]

'replaceRange' @ [74:42] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [74:55] ==> val index: Int defined in kotlin.text.replaceFirst[LocalVariableDescriptor]

'index' @ [74:62] ==> val index: Int defined in kotlin.text.replaceFirst[LocalVariableDescriptor]

'newChar' @ [74:73] ==> value-parameter newChar: Char defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'toString' @ [74:81] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'indexOf' @ [82:17] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'oldValue' @ [82:25] ==> value-parameter oldValue: String defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'ignoreCase' @ [82:48] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'if (index < 0) this else this.replaceRange(index, index + oldValue.length, newValue)' @ [83:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [83:16] ==> val index: Int defined in kotlin.text.replaceFirst[LocalVariableDescriptor]

'this' @ [83:27] ==> <this> defined in kotlin.text.replaceFirst[ReceiverParameterDescriptorImpl]

'this' @ [83:37] ==> <this> defined in kotlin.text.replaceFirst[ReceiverParameterDescriptorImpl]

'replaceRange' @ [83:42] ==> @InlineOnly public inline fun String.replaceRange(startIndex: Int, endIndex: Int, replacement: CharSequence): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'index' @ [83:55] ==> val index: Int defined in kotlin.text.replaceFirst[LocalVariableDescriptor]

'index' @ [83:62] ==> val index: Int defined in kotlin.text.replaceFirst[LocalVariableDescriptor]

'oldValue' @ [83:70] ==> value-parameter oldValue: String defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'length' @ [83:79] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'newValue' @ [83:87] ==> value-parameter newValue: String defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [89:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [90:51] ==> <this> defined in kotlin.text.toUpperCase[ReceiverParameterDescriptorImpl]

'toUpperCase' @ [90:77] ==> public open fun toUpperCase(): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'kotlin.internal.InlineOnly' @ [95:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [96:51] ==> <this> defined in kotlin.text.toLowerCase[ReceiverParameterDescriptorImpl]

'toLowerCase' @ [96:77] ==> public open fun toLowerCase(): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'kotlin.internal.InlineOnly' @ [101:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [102:54] ==> <this> defined in kotlin.text.toCharArray[ReceiverParameterDescriptorImpl]

'toCharArray' @ [102:80] ==> public open fun toCharArray(): (CharArray..CharArray?) defined in java.lang.String[JavaMethodDescriptor]

'kotlin.internal.InlineOnly' @ [112:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'length' @ [113:127] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'this' @ [114:6] ==> <this> defined in kotlin.text.toCharArray[ReceiverParameterDescriptorImpl]

'getChars' @ [114:32] ==> public open fun getChars(p0: Int, p1: Int, p2: (CharArray..CharArray?), p3: Int): Unit defined in java.lang.String[JavaMethodDescriptor]

'startIndex' @ [114:41] ==> value-parameter startIndex: Int = ... defined in kotlin.text.toCharArray[ValueParameterDescriptorImpl]

'endIndex' @ [114:53] ==> value-parameter endIndex: Int = ... defined in kotlin.text.toCharArray[ValueParameterDescriptorImpl]

'destination' @ [114:63] ==> value-parameter destination: CharArray defined in kotlin.text.toCharArray[ValueParameterDescriptorImpl]

'destinationOffset' @ [114:76] ==> value-parameter destinationOffset: Int = ... defined in kotlin.text.toCharArray[ValueParameterDescriptorImpl]

'destination' @ [115:12] ==> value-parameter destination: CharArray defined in kotlin.text.toCharArray[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [122:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'format' @ [123:79] ==> public open fun format(p0: (String..String?), vararg p1: (Any..Any?)): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'this' @ [123:86] ==> <this> defined in kotlin.text.format[ReceiverParameterDescriptorImpl]

'args' @ [123:93] ==> value-parameter vararg args: Any? defined in kotlin.text.format[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [129:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'format' @ [130:105] ==> public open fun format(p0: (String..String?), vararg p1: (Any..Any?)): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'format' @ [130:112] ==> value-parameter format: String defined in kotlin.text.format[ValueParameterDescriptorImpl]

'args' @ [130:121] ==> value-parameter vararg args: Any? defined in kotlin.text.format[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [136:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'format' @ [137:97] ==> public open fun format(p0: (Locale..Locale?), p1: (String..String?), vararg p2: (Any..Any?)): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'locale' @ [137:104] ==> value-parameter locale: Locale defined in kotlin.text.format[ValueParameterDescriptorImpl]

'this' @ [137:112] ==> <this> defined in kotlin.text.format[ReceiverParameterDescriptorImpl]

'args' @ [137:119] ==> value-parameter vararg args: Any? defined in kotlin.text.format[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [143:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'format' @ [144:121] ==> public open fun format(p0: (Locale..Locale?), p1: (String..String?), vararg p2: (Any..Any?)): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'locale' @ [144:128] ==> value-parameter locale: Locale defined in kotlin.text.format[ValueParameterDescriptorImpl]

'format' @ [144:136] ==> value-parameter format: String defined in kotlin.text.format[ValueParameterDescriptorImpl]

'args' @ [144:145] ==> value-parameter vararg args: Any? defined in kotlin.text.format[ValueParameterDescriptorImpl]

'require' @ [154:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'limit' @ [154:13] ==> value-parameter limit: Int = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'limit' @ [154:65] ==> value-parameter limit: Int = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'regex' @ [155:12] ==> value-parameter regex: Pattern defined in kotlin.text.split[ValueParameterDescriptorImpl]

'split' @ [155:18] ==> public open fun split(p0: (CharSequence..CharSequence?), p1: Int): (Array<(String..String?)>..Array<out (String..String?)>?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'this' @ [155:24] ==> <this> defined in kotlin.text.split[ReceiverParameterDescriptorImpl]

'if (limit == 0) -1 else limit' @ [155:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'limit' @ [155:34] ==> value-parameter limit: Int = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'-' @ [155:46] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'limit' @ [155:54] ==> value-parameter limit: Int = ... defined in kotlin.text.split[ValueParameterDescriptorImpl]

'asList' @ [155:61] ==> public fun <T> Array<out (String..String?)>.asList(): List<(String..String?)> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'kotlin.internal.InlineOnly' @ [161:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [162:64] ==> <this> defined in kotlin.text.substring[ReceiverParameterDescriptorImpl]

'substring' @ [162:90] ==> public open fun substring(p0: Int): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'startIndex' @ [162:100] ==> value-parameter startIndex: Int defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [170:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [171:79] ==> <this> defined in kotlin.text.substring[ReceiverParameterDescriptorImpl]

'substring' @ [171:105] ==> public open fun substring(p0: Int, p1: Int): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'startIndex' @ [171:115] ==> value-parameter startIndex: Int defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'endIndex' @ [171:127] ==> value-parameter endIndex: Int defined in kotlin.text.substring[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        return (this as java.lang.String).startsWith(prefix)
    else
        return regionMatches(0, prefix, 0, prefix.length, ignoreCase)' @ [177:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [177:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [177:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'this' @ [178:17] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'startsWith' @ [178:43] ==> public open fun startsWith(p0: (String..String?)): Boolean defined in java.lang.String[JavaMethodDescriptor]

'prefix' @ [178:54] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'regionMatches' @ [180:16] ==> public fun String.regionMatches(thisOffset: Int, other: String, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [180:33] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [180:44] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'length' @ [180:51] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ignoreCase' @ [180:59] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        return (this as java.lang.String).startsWith(prefix, startIndex)
    else
        return regionMatches(startIndex, prefix, 0, prefix.length, ignoreCase)' @ [187:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [187:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [187:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'this' @ [188:17] ==> <this> defined in kotlin.text.startsWith[ReceiverParameterDescriptorImpl]

'startsWith' @ [188:43] ==> public open fun startsWith(p0: (String..String?), p1: Int): Boolean defined in java.lang.String[JavaMethodDescriptor]

'prefix' @ [188:54] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'startIndex' @ [188:62] ==> value-parameter startIndex: Int defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'regionMatches' @ [190:16] ==> public fun String.regionMatches(thisOffset: Int, other: String, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'startIndex' @ [190:30] ==> value-parameter startIndex: Int defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [190:42] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [190:53] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'length' @ [190:60] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ignoreCase' @ [190:68] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        return (this as java.lang.String).endsWith(suffix)
    else
        return regionMatches(length - suffix.length, suffix, 0, suffix.length, ignoreCase = true)' @ [197:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [197:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [197:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'this' @ [198:17] ==> <this> defined in kotlin.text.endsWith[ReceiverParameterDescriptorImpl]

'endsWith' @ [198:43] ==> public open fun endsWith(p0: (String..String?)): Boolean defined in java.lang.String[JavaMethodDescriptor]

'suffix' @ [198:52] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'regionMatches' @ [200:16] ==> public fun String.regionMatches(thisOffset: Int, other: String, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'length' @ [200:30] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'suffix' @ [200:39] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'length' @ [200:46] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'suffix' @ [200:54] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'suffix' @ [200:65] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'length' @ [200:72] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'kotlin.internal.InlineOnly' @ [214:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [215:108] ==> public constructor String(p0: (ByteArray..ByteArray?), p1: Int, p2: Int, p3: (Charset..Charset?)) defined in java.lang.String[JavaClassConstructorDescriptor]

'bytes' @ [215:115] ==> value-parameter bytes: ByteArray defined in kotlin.text.String[ValueParameterDescriptorImpl]

'offset' @ [215:122] ==> value-parameter offset: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'length' @ [215:130] ==> value-parameter length: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'charset' @ [215:138] ==> value-parameter charset: Charset defined in kotlin.text.String[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [221:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [222:82] ==> public constructor String(p0: (ByteArray..ByteArray?), p1: (Charset..Charset?)) defined in java.lang.String[JavaClassConstructorDescriptor]

'bytes' @ [222:89] ==> value-parameter bytes: ByteArray defined in kotlin.text.String[ValueParameterDescriptorImpl]

'charset' @ [222:96] ==> value-parameter charset: Charset defined in kotlin.text.String[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [232:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [233:90] ==> public constructor String(p0: (ByteArray..ByteArray?), p1: Int, p2: Int, p3: (Charset..Charset?)) defined in java.lang.String[JavaClassConstructorDescriptor]

'bytes' @ [233:97] ==> value-parameter bytes: ByteArray defined in kotlin.text.String[ValueParameterDescriptorImpl]

'offset' @ [233:104] ==> value-parameter offset: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'length' @ [233:112] ==> value-parameter length: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'Charsets' @ [233:120] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [233:129] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'kotlin.internal.InlineOnly' @ [239:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [240:64] ==> public constructor String(p0: (ByteArray..ByteArray?), p1: (Charset..Charset?)) defined in java.lang.String[JavaClassConstructorDescriptor]

'bytes' @ [240:71] ==> value-parameter bytes: ByteArray defined in kotlin.text.String[ValueParameterDescriptorImpl]

'Charsets' @ [240:78] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [240:87] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'kotlin.internal.InlineOnly' @ [245:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [246:64] ==> public constructor String(p0: (CharArray..CharArray?)) defined in java.lang.String[JavaClassConstructorDescriptor]

'chars' @ [246:71] ==> value-parameter chars: CharArray defined in kotlin.text.String[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [251:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [252:90] ==> public constructor String(p0: (CharArray..CharArray?), p1: Int, p2: Int) defined in java.lang.String[JavaClassConstructorDescriptor]

'chars' @ [252:97] ==> value-parameter chars: CharArray defined in kotlin.text.String[ValueParameterDescriptorImpl]

'offset' @ [252:104] ==> value-parameter offset: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'length' @ [252:112] ==> value-parameter length: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [257:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [258:94] ==> public constructor String(p0: (IntArray..IntArray?), p1: Int, p2: Int) defined in java.lang.String[JavaClassConstructorDescriptor]

'codePoints' @ [258:101] ==> value-parameter codePoints: IntArray defined in kotlin.text.String[ValueParameterDescriptorImpl]

'offset' @ [258:113] ==> value-parameter offset: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'length' @ [258:121] ==> value-parameter length: Int defined in kotlin.text.String[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [263:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [264:84] ==> public constructor String(p0: (StringBuffer..StringBuffer?)) defined in java.lang.String[JavaClassConstructorDescriptor]

'stringBuffer' @ [264:91] ==> value-parameter stringBuffer: StringBuffer defined in kotlin.text.String[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [269:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'String' @ [270:86] ==> public constructor String(p0: (StringBuilder..StringBuilder?)) defined in java.lang.String[JavaClassConstructorDescriptor]

'stringBuilder' @ [270:93] ==> value-parameter stringBuilder: StringBuilder defined in kotlin.text.String[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [275:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [276:58] ==> <this> defined in kotlin.text.codePointAt[ReceiverParameterDescriptorImpl]

'codePointAt' @ [276:84] ==> public open fun codePointAt(p0: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'index' @ [276:96] ==> value-parameter index: Int defined in kotlin.text.codePointAt[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [281:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [282:62] ==> <this> defined in kotlin.text.codePointBefore[ReceiverParameterDescriptorImpl]

'codePointBefore' @ [282:88] ==> public open fun codePointBefore(p0: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'index' @ [282:104] ==> value-parameter index: Int defined in kotlin.text.codePointBefore[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [287:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [288:81] ==> <this> defined in kotlin.text.codePointCount[ReceiverParameterDescriptorImpl]

'codePointCount' @ [288:107] ==> public open fun codePointCount(p0: Int, p1: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'beginIndex' @ [288:122] ==> value-parameter beginIndex: Int defined in kotlin.text.codePointCount[ValueParameterDescriptorImpl]

'endIndex' @ [288:134] ==> value-parameter endIndex: Int defined in kotlin.text.codePointCount[ValueParameterDescriptorImpl]

'if (ignoreCase)
        return (this as java.lang.String).compareToIgnoreCase(other)
    else
        return (this as java.lang.String).compareTo(other)' @ [294:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'ignoreCase' @ [294:9] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.compareTo[ValueParameterDescriptorImpl]

'this' @ [295:17] ==> <this> defined in kotlin.text.compareTo[ReceiverParameterDescriptorImpl]

'compareToIgnoreCase' @ [295:43] ==> public open fun compareToIgnoreCase(p0: (String..String?)): Int defined in java.lang.String[JavaMethodDescriptor]

'other' @ [295:63] ==> value-parameter other: String defined in kotlin.text.compareTo[ValueParameterDescriptorImpl]

'this' @ [297:17] ==> <this> defined in kotlin.text.compareTo[ReceiverParameterDescriptorImpl]

'compareTo' @ [297:43] ==> public open fun compareTo(other: (String..String?)): Int defined in java.lang.String[JavaMethodDescriptor]

'other' @ [297:53] ==> value-parameter other: String defined in kotlin.text.compareTo[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [303:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [304:80] ==> <this> defined in kotlin.text.contentEquals[ReceiverParameterDescriptorImpl]

'contentEquals' @ [304:106] ==> public open fun contentEquals(p0: (CharSequence..CharSequence?)): Boolean defined in java.lang.String[JavaMethodDescriptor]

'charSequence' @ [304:120] ==> value-parameter charSequence: CharSequence defined in kotlin.text.contentEquals[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [309:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [310:81] ==> <this> defined in kotlin.text.contentEquals[ReceiverParameterDescriptorImpl]

'contentEquals' @ [310:107] ==> public open fun contentEquals(p0: (StringBuffer..StringBuffer?)): Boolean defined in java.lang.String[JavaMethodDescriptor]

'stringBuilder' @ [310:121] ==> value-parameter stringBuilder: StringBuffer defined in kotlin.text.contentEquals[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [315:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [316:46] ==> <this> defined in kotlin.text.intern[ReceiverParameterDescriptorImpl]

'intern' @ [316:72] ==> public open fun intern(): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'length' @ [321:46] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'indices' @ [321:61] ==> public val CharSequence.indices: IntRange defined in kotlin.text in file Strings.kt[PropertyDescriptorImpl]

'all' @ [321:69] ==> public inline fun <T> Iterable<Int>.all(predicate: (Int) -> Boolean): Boolean defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'this' @ [321:75] ==> <this> defined in kotlin.text.isBlank[ReceiverParameterDescriptorImpl]

'it' @ [321:80] ==> value-parameter it: Int defined in kotlin.text.isBlank.<anonymous>[ValueParameterDescriptorImpl]

'isWhitespace' @ [321:84] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text in file CharJVM.kt[SimpleFunctionDescriptorImpl]

'kotlin.internal.InlineOnly' @ [326:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [327:87] ==> <this> defined in kotlin.text.offsetByCodePoints[ReceiverParameterDescriptorImpl]

'offsetByCodePoints' @ [327:113] ==> public open fun offsetByCodePoints(p0: Int, p1: Int): Int defined in java.lang.String[JavaMethodDescriptor]

'index' @ [327:132] ==> value-parameter index: Int defined in kotlin.text.offsetByCodePoints[ValueParameterDescriptorImpl]

'codePointOffset' @ [327:139] ==> value-parameter codePointOffset: Int defined in kotlin.text.offsetByCodePoints[ValueParameterDescriptorImpl]

'if (this is String && other is String)
        return this.regionMatches(thisOffset, other, otherOffset, length, ignoreCase)
    else
        return regionMatchesImpl(thisOffset, other, otherOffset, length, ignoreCase)' @ [337:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'this' @ [337:9] ==> <this> defined in kotlin.text.regionMatches[ReceiverParameterDescriptorImpl]

'other' @ [337:27] ==> value-parameter other: CharSequence defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'this' @ [338:16] ==> <this> defined in kotlin.text.regionMatches[ReceiverParameterDescriptorImpl]

'regionMatches' @ [338:21] ==> public fun String.regionMatches(thisOffset: Int, other: String, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'thisOffset' @ [338:35] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'other' @ [338:47] ==> value-parameter other: CharSequence defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'otherOffset' @ [338:54] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'length' @ [338:67] ==> value-parameter length: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'ignoreCase' @ [338:75] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'regionMatchesImpl' @ [340:16] ==> internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'thisOffset' @ [340:34] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'other' @ [340:46] ==> value-parameter other: CharSequence defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'otherOffset' @ [340:53] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'length' @ [340:66] ==> value-parameter length: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'ignoreCase' @ [340:74] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'if (!ignoreCase)
            (this as java.lang.String).regionMatches(thisOffset, other, otherOffset, length)
        else
            (this as java.lang.String).regionMatches(ignoreCase, thisOffset, other, otherOffset, length)' @ [351:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [351:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [351:14] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'this' @ [352:14] ==> <this> defined in kotlin.text.regionMatches[ReceiverParameterDescriptorImpl]

'regionMatches' @ [352:40] ==> public open fun regionMatches(p0: Int, p1: (String..String?), p2: Int, p3: Int): Boolean defined in java.lang.String[JavaMethodDescriptor]

'thisOffset' @ [352:54] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'other' @ [352:66] ==> value-parameter other: String defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'otherOffset' @ [352:73] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'length' @ [352:86] ==> value-parameter length: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'this' @ [354:14] ==> <this> defined in kotlin.text.regionMatches[ReceiverParameterDescriptorImpl]

'regionMatches' @ [354:40] ==> public open fun regionMatches(p0: Boolean, p1: Int, p2: (String..String?), p3: Int, p4: Int): Boolean defined in java.lang.String[JavaMethodDescriptor]

'ignoreCase' @ [354:54] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'thisOffset' @ [354:66] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'other' @ [354:78] ==> value-parameter other: String defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'otherOffset' @ [354:85] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'length' @ [354:98] ==> value-parameter length: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [359:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [360:75] ==> <this> defined in kotlin.text.toLowerCase[ReceiverParameterDescriptorImpl]

'toLowerCase' @ [360:101] ==> public open fun toLowerCase(p0: (Locale..Locale?)): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'locale' @ [360:113] ==> value-parameter locale: Locale defined in kotlin.text.toLowerCase[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [365:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'this' @ [366:75] ==> <this> defined in kotlin.text.toUpperCase[ReceiverParameterDescriptorImpl]

'toUpperCase' @ [366:101] ==> public open fun toUpperCase(p0: (Locale..Locale?)): (String..String?) defined in java.lang.String[JavaMethodDescriptor]

'locale' @ [366:113] ==> value-parameter locale: Locale defined in kotlin.text.toUpperCase[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [371:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Charsets' @ [372:57] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [372:66] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'this' @ [372:87] ==> <this> defined in kotlin.text.toByteArray[ReceiverParameterDescriptorImpl]

'getBytes' @ [372:113] ==> public open fun getBytes(p0: (Charset..Charset?)): (ByteArray..ByteArray?) defined in java.lang.String[JavaMethodDescriptor]

'charset' @ [372:122] ==> value-parameter charset: Charset = ... defined in kotlin.text.toByteArray[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [379:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'compile' @ [381:36] ==> public open fun compile(p0: (String..String?), p1: Int): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'this' @ [381:44] ==> <this> defined in kotlin.text.toPattern[ReceiverParameterDescriptorImpl]

'flags' @ [381:50] ==> value-parameter flags: Int = ... defined in kotlin.text.toPattern[ValueParameterDescriptorImpl]

'if (isNotEmpty() && this[0].isLowerCase()) substring(0, 1).toUpperCase() + substring(1) else this' @ [391:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNotEmpty' @ [391:16] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'this' @ [391:32] ==> <this> defined in kotlin.text.capitalize[ReceiverParameterDescriptorImpl]

'isLowerCase' @ [391:40] ==> @InlineOnly public inline fun Char.isLowerCase(): Boolean defined in kotlin.text in file CharJVM.kt[SimpleFunctionDescriptorImpl]

'substring' @ [391:55] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'toUpperCase' @ [391:71] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'substring' @ [391:87] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'this' @ [391:105] ==> <this> defined in kotlin.text.capitalize[ReceiverParameterDescriptorImpl]

'if (isNotEmpty() && this[0].isUpperCase()) substring(0, 1).toLowerCase() + substring(1) else this' @ [401:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNotEmpty' @ [401:16] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'this' @ [401:32] ==> <this> defined in kotlin.text.decapitalize[ReceiverParameterDescriptorImpl]

'isUpperCase' @ [401:40] ==> @InlineOnly public inline fun Char.isUpperCase(): Boolean defined in kotlin.text in file CharJVM.kt[SimpleFunctionDescriptorImpl]

'substring' @ [401:55] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'toLowerCase' @ [401:71] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'substring' @ [401:87] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'this' @ [401:105] ==> <this> defined in kotlin.text.decapitalize[ReceiverParameterDescriptorImpl]

'require' @ [410:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'n' @ [410:14] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'n' @ [410:66] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'when (n) {
        0 -> ""
        1 -> this.toString()
        else -> {
            when (length) {
                0 -> ""
                1 -> this[0].let { char -> String(CharArray(n) { char }) }
                else -> {
                    val sb = StringBuilder(n * length)
                    for (i in 1..n) {
                        sb.append(this)
                    }
                    sb.toString()
                }
            }
        }
    }' @ [412:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'n' @ [412:18] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'this' @ [414:14] ==> <this> defined in kotlin.text.repeat[ReceiverParameterDescriptorImpl]

'toString' @ [414:19] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'when (length) {
                0 -> ""
                1 -> this[0].let { char -> String(CharArray(n) { char }) }
                else -> {
                    val sb = StringBuilder(n * length)
                    for (i in 1..n) {
                        sb.append(this)
                    }
                    sb.toString()
                }
            }' @ [416:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'length' @ [416:19] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'this' @ [418:22] ==> <this> defined in kotlin.text.repeat[ReceiverParameterDescriptorImpl]

'let' @ [418:30] ==> @InlineOnly public inline fun <T, R> Char.let(block: (Char) -> String): String defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Char
    <R> -> String

'String' @ [418:44] ==> @InlineOnly public inline fun String(chars: CharArray): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'CharArray' @ [418:51] ==> public constructor CharArray(size: Int, init: (Int) -> Char) defined in kotlin.CharArray[DeserializedClassConstructorDescriptor]

'n' @ [418:61] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'char' @ [418:66] ==> value-parameter char: Char defined in kotlin.text.repeat.<anonymous>[ValueParameterDescriptorImpl]

'StringBuilder' @ [420:30] ==> public final fun <init>(p0: Int): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'n' @ [420:44] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'length' @ [420:48] ==> public abstract val length: Int defined in kotlin.CharSequence[DeserializedPropertyDescriptor]

'..' @ [421:31] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'n' @ [421:34] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'sb' @ [422:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.repeat[LocalVariableDescriptor]

'append' @ [422:28] ==> public open fun append(p0: (CharSequence..CharSequence?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'this' @ [422:35] ==> <this> defined in kotlin.text.repeat[ReceiverParameterDescriptorImpl]

'sb' @ [424:21] ==> val sb: StringBuilder /* = StringBuilder */ defined in kotlin.text.repeat[LocalVariableDescriptor]

'toString' @ [424:24] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'CASE_INSENSITIVE_ORDER' @ [439:30] ==> public final val CASE_INSENSITIVE_ORDER: (Comparator<(String..String?)>..Comparator<(String..String?)>?) defined in java.lang.String[JavaPropertyDescriptor]

