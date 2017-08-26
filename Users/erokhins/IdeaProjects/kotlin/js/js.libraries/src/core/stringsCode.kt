'kotlin.internal.InlineOnly' @ [5:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'nativeIndexOf' @ [6:75] ==> @InlineOnly internal inline fun String.nativeIndexOf(str: String, fromIndex: Int): Int defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'ch' @ [6:89] ==> value-parameter ch: Char defined in kotlin.text.nativeIndexOf[ValueParameterDescriptorImpl]

'toString' @ [6:92] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'fromIndex' @ [6:104] ==> value-parameter fromIndex: Int defined in kotlin.text.nativeIndexOf[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [7:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'nativeLastIndexOf' @ [8:79] ==> @InlineOnly internal inline fun String.nativeLastIndexOf(str: String, fromIndex: Int): Int defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'ch' @ [8:97] ==> value-parameter ch: Char defined in kotlin.text.nativeLastIndexOf[ValueParameterDescriptorImpl]

'toString' @ [8:100] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'fromIndex' @ [8:112] ==> value-parameter fromIndex: Int defined in kotlin.text.nativeLastIndexOf[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        return nativeStartsWith(prefix, 0)
    else
        return regionMatches(0, prefix, 0, prefix.length, ignoreCase)' @ [14:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [14:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [14:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'nativeStartsWith' @ [15:16] ==> @InlineOnly internal inline fun String.nativeStartsWith(s: String, position: Int): Boolean defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [15:33] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'regionMatches' @ [17:16] ==> public fun CharSequence.regionMatches(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file stringsCode.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [17:33] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [17:44] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'length' @ [17:51] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ignoreCase' @ [17:59] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        return nativeStartsWith(prefix, startIndex)
    else
        return regionMatches(startIndex, prefix, 0, prefix.length, ignoreCase)' @ [24:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [24:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [24:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'nativeStartsWith' @ [25:16] ==> @InlineOnly internal inline fun String.nativeStartsWith(s: String, position: Int): Boolean defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'prefix' @ [25:33] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'startIndex' @ [25:41] ==> value-parameter startIndex: Int defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'regionMatches' @ [27:16] ==> public fun CharSequence.regionMatches(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file stringsCode.kt[SimpleFunctionDescriptorImpl]

'startIndex' @ [27:30] ==> value-parameter startIndex: Int defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [27:42] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'prefix' @ [27:53] ==> value-parameter prefix: String defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'length' @ [27:60] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ignoreCase' @ [27:68] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.startsWith[ValueParameterDescriptorImpl]

'if (!ignoreCase)
        return nativeEndsWith(suffix)
    else
        return regionMatches(length - suffix.length, suffix, 0, suffix.length, ignoreCase)' @ [34:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [34:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [34:10] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'nativeEndsWith' @ [35:16] ==> @InlineOnly internal inline fun String.nativeEndsWith(s: String): Boolean defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'suffix' @ [35:31] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'regionMatches' @ [37:16] ==> public fun CharSequence.regionMatches(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file stringsCode.kt[SimpleFunctionDescriptorImpl]

'length' @ [37:30] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'suffix' @ [37:39] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'length' @ [37:46] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'suffix' @ [37:54] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'suffix' @ [37:65] ==> value-parameter suffix: String defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'length' @ [37:72] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'ignoreCase' @ [37:80] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.endsWith[ValueParameterDescriptorImpl]

'this' @ [43:18] ==> <this> defined in kotlin.text.matches[ReceiverParameterDescriptorImpl]

'match' @ [43:23] ==> @InlineOnly public inline fun String.match(regex: String): Array<String>? defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'regex' @ [43:29] ==> value-parameter regex: String defined in kotlin.text.matches[ValueParameterDescriptorImpl]

'result' @ [44:12] ==> val result: Array<String>? defined in kotlin.text.matches[LocalVariableDescriptor]

'result' @ [44:30] ==> val result: Array<String>? defined in kotlin.text.matches[LocalVariableDescriptor]

'size' @ [44:37] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'length' @ [47:46] ==> public abstract val length: Int defined in kotlin.CharSequence[PropertyDescriptorImpl]

'if (this is String) this else this.toString()' @ [47:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [47:66] ==> <this> defined in kotlin.text.isBlank[ReceiverParameterDescriptorImpl]

'this' @ [47:82] ==> <this> defined in kotlin.text.isBlank[ReceiverParameterDescriptorImpl]

'this' @ [47:92] ==> <this> defined in kotlin.text.isBlank[ReceiverParameterDescriptorImpl]

'toString' @ [47:97] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'matches' @ [47:109] ==> public fun String.matches(regex: String): Boolean defined in kotlin.text in file stringsCode.kt[SimpleFunctionDescriptorImpl]

'if (this == null)
            other == null
        else if (!ignoreCase)
            this == other
        else
            other != null && this.toLowerCase() == other.toLowerCase()' @ [50:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [50:13] ==> <this> defined in kotlin.text.equals[ReceiverParameterDescriptorImpl]

'other' @ [51:13] ==> value-parameter other: String? defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'if (!ignoreCase)
            this == other
        else
            other != null && this.toLowerCase() == other.toLowerCase()' @ [52:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [52:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ignoreCase' @ [52:19] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'this' @ [53:13] ==> <this> defined in kotlin.text.equals[ReceiverParameterDescriptorImpl]

'other' @ [53:21] ==> value-parameter other: String? defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'other' @ [55:13] ==> value-parameter other: String? defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'this' @ [55:30] ==> <this> defined in kotlin.text.equals[ReceiverParameterDescriptorImpl]

'toLowerCase' @ [55:35] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'other' @ [55:52] ==> value-parameter other: String? defined in kotlin.text.equals[ValueParameterDescriptorImpl]

'toLowerCase' @ [55:58] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'regionMatchesImpl' @ [59:11] ==> internal fun CharSequence.regionMatchesImpl(thisOffset: Int, other: CharSequence, otherOffset: Int, length: Int, ignoreCase: Boolean): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'thisOffset' @ [59:29] ==> value-parameter thisOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'other' @ [59:41] ==> value-parameter other: CharSequence defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'otherOffset' @ [59:48] ==> value-parameter otherOffset: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'length' @ [59:61] ==> value-parameter length: Int defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'ignoreCase' @ [59:69] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.regionMatches[ValueParameterDescriptorImpl]

'if (isNotEmpty()) substring(0, 1).toUpperCase() + substring(1) else this' @ [68:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNotEmpty' @ [68:16] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'substring' @ [68:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'toUpperCase' @ [68:46] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'substring' @ [68:62] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'this' @ [68:80] ==> <this> defined in kotlin.text.capitalize[ReceiverParameterDescriptorImpl]

'if (isNotEmpty()) substring(0, 1).toLowerCase() + substring(1) else this' @ [77:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isNotEmpty' @ [77:16] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'substring' @ [77:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'toLowerCase' @ [77:46] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'substring' @ [77:62] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'this' @ [77:80] ==> <this> defined in kotlin.text.decapitalize[ReceiverParameterDescriptorImpl]

'require' @ [85:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin in file Preconditions.kt[SimpleFunctionDescriptorImpl]

'n' @ [85:13] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'n' @ [85:65] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'when (n) {
        0 -> ""
        1 -> this.toString()
        else -> {
            var result = ""
            if (!isEmpty()) {
                var s = this.toString()
                var count = n
                while (true) {
                    if ((count and 1) == 1) {
                        result += s
                    }
                    count = count ushr 1
                    if (count == 0) {
                        break
                    }
                    s += s
                }
            }
            return result
        }
    }' @ [86:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'n' @ [86:18] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'this' @ [88:14] ==> <this> defined in kotlin.text.repeat[ReceiverParameterDescriptorImpl]

'toString' @ [88:19] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'!' @ [91:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [91:18] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'this' @ [92:25] ==> <this> defined in kotlin.text.repeat[ReceiverParameterDescriptorImpl]

'toString' @ [92:30] ==> public open fun toString(): String defined in kotlin.CharSequence[DeserializedSimpleFunctionDescriptor]

'n' @ [93:29] ==> value-parameter n: Int defined in kotlin.text.repeat[ValueParameterDescriptorImpl]

'==' @ [95:25] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'count' @ [95:26] ==> var count: Int defined in kotlin.text.repeat[LocalVariableDescriptor]

'result' @ [96:25] ==> var result: String defined in kotlin.text.repeat[LocalVariableDescriptor]

's' @ [96:35] ==> var s: String defined in kotlin.text.repeat[LocalVariableDescriptor]

'count' @ [98:21] ==> var count: Int defined in kotlin.text.repeat[LocalVariableDescriptor]

'count' @ [98:29] ==> var count: Int defined in kotlin.text.repeat[LocalVariableDescriptor]

'count' @ [99:25] ==> var count: Int defined in kotlin.text.repeat[LocalVariableDescriptor]

's' @ [102:21] ==> var s: String defined in kotlin.text.repeat[LocalVariableDescriptor]

's' @ [102:26] ==> var s: String defined in kotlin.text.repeat[LocalVariableDescriptor]

'result' @ [105:20] ==> var result: String defined in kotlin.text.repeat[LocalVariableDescriptor]

'nativeReplace' @ [111:9] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'RegExp' @ [111:23] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'escape' @ [111:36] ==> public final fun escape(literal: String): String defined in kotlin.text.Regex.Companion[SimpleFunctionDescriptorImpl]

'oldValue' @ [111:43] ==> value-parameter oldValue: String defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'if (ignoreCase) "gi" else "g"' @ [111:54] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'ignoreCase' @ [111:58] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'escapeReplacement' @ [111:92] ==> public final fun escapeReplacement(literal: String): String defined in kotlin.text.Regex.Companion[SimpleFunctionDescriptorImpl]

'newValue' @ [111:110] ==> value-parameter newValue: String defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'nativeReplace' @ [114:9] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'RegExp' @ [114:23] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'escape' @ [114:36] ==> public final fun escape(literal: String): String defined in kotlin.text.Regex.Companion[SimpleFunctionDescriptorImpl]

'oldChar' @ [114:43] ==> value-parameter oldChar: Char defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'toString' @ [114:51] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'if (ignoreCase) "gi" else "g"' @ [114:64] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'ignoreCase' @ [114:68] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'newChar' @ [114:96] ==> value-parameter newChar: Char defined in kotlin.text.replace[ValueParameterDescriptorImpl]

'toString' @ [114:104] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'nativeReplace' @ [117:9] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'RegExp' @ [117:23] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'escape' @ [117:36] ==> public final fun escape(literal: String): String defined in kotlin.text.Regex.Companion[SimpleFunctionDescriptorImpl]

'oldValue' @ [117:43] ==> value-parameter oldValue: String defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'if (ignoreCase) "i" else ""' @ [117:54] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'ignoreCase' @ [117:58] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'escapeReplacement' @ [117:90] ==> public final fun escapeReplacement(literal: String): String defined in kotlin.text.Regex.Companion[SimpleFunctionDescriptorImpl]

'newValue' @ [117:108] ==> value-parameter newValue: String defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'nativeReplace' @ [120:9] ==> @InlineOnly internal inline fun String.nativeReplace(pattern: RegExp, replacement: String): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'RegExp' @ [120:23] ==> public constructor RegExp(pattern: String, flags: String? = ...) defined in kotlin.js.RegExp[ClassConstructorDescriptorImpl]

'escape' @ [120:36] ==> public final fun escape(literal: String): String defined in kotlin.text.Regex.Companion[SimpleFunctionDescriptorImpl]

'oldChar' @ [120:43] ==> value-parameter oldChar: Char defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'toString' @ [120:51] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'if (ignoreCase) "i" else ""' @ [120:64] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'ignoreCase' @ [120:68] ==> value-parameter ignoreCase: Boolean = ... defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'newChar' @ [120:94] ==> value-parameter newChar: Char defined in kotlin.text.replaceFirst[ValueParameterDescriptorImpl]

'toString' @ [120:102] ==> public open fun toString(): String defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

