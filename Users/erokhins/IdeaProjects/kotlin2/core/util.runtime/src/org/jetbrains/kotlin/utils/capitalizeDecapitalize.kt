'this' @ [26:17] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[ReceiverParameterDescriptorImpl]

'index' @ [26:22] ==> value-parameter index: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart.isUpperCaseCharAt[ValueParameterDescriptorImpl]

'if (asciiOnly) c in 'A'..'Z' else c.isUpperCase()' @ [27:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'asciiOnly' @ [27:20] ==> value-parameter asciiOnly: Boolean = ... defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[ValueParameterDescriptorImpl]

'c' @ [27:31] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart.isUpperCaseCharAt[LocalVariableDescriptor]

'..' @ [27:36] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [27:50] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart.isUpperCaseCharAt[LocalVariableDescriptor]

'isUpperCase' @ [27:52] ==> @InlineOnly public inline fun Char.isUpperCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isEmpty' @ [30:9] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [30:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUpperCaseCharAt' @ [30:23] ==> local final fun isUpperCaseCharAt(index: Int): Boolean defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[SimpleFunctionDescriptorImpl]

'this' @ [30:52] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[ReceiverParameterDescriptorImpl]

'length' @ [32:9] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'!' @ [32:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUpperCaseCharAt' @ [32:25] ==> local final fun isUpperCaseCharAt(index: Int): Boolean defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[SimpleFunctionDescriptorImpl]

'if (asciiOnly) decapitalizeAsciiOnly() else decapitalize()' @ [33:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'asciiOnly' @ [33:20] ==> value-parameter asciiOnly: Boolean = ... defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[ValueParameterDescriptorImpl]

'decapitalizeAsciiOnly' @ [33:31] ==> public fun String.decapitalizeAsciiOnly(): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize in file capitalizeDecapitalize.kt[SimpleFunctionDescriptorImpl]

'decapitalize' @ [33:60] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (asciiOnly) string.toLowerCaseAsciiOnly() else string.toLowerCase()' @ [36:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'asciiOnly' @ [36:43] ==> value-parameter asciiOnly: Boolean = ... defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[ValueParameterDescriptorImpl]

'string' @ [36:54] ==> value-parameter string: String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart.toLowerCase[ValueParameterDescriptorImpl]

'toLowerCaseAsciiOnly' @ [36:61] ==> public fun String.toLowerCaseAsciiOnly(): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize in file capitalizeDecapitalize.kt[SimpleFunctionDescriptorImpl]

'string' @ [36:89] ==> value-parameter string: String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart.toLowerCase[ValueParameterDescriptorImpl]

'toLowerCase' @ [36:96] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'-' @ [38:27] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'indices' @ [38:28] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'firstOrNull' @ [38:36] ==> public inline fun <T> Iterable<Int>.firstOrNull(predicate: (Int) -> Boolean): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'!' @ [38:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUpperCaseCharAt' @ [38:51] ==> local final fun isUpperCaseCharAt(index: Int): Boolean defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[SimpleFunctionDescriptorImpl]

'it' @ [38:69] ==> value-parameter it: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart.<anonymous>[ValueParameterDescriptorImpl]

'toLowerCase' @ [39:38] ==> local final fun toLowerCase(string: String): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[SimpleFunctionDescriptorImpl]

'this' @ [39:50] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[ReceiverParameterDescriptorImpl]

'toLowerCase' @ [40:12] ==> local final fun toLowerCase(string: String): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[SimpleFunctionDescriptorImpl]

'substring' @ [40:24] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'secondWordStart' @ [40:37] ==> val secondWordStart: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[LocalVariableDescriptor]

'substring' @ [40:57] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'secondWordStart' @ [40:67] ==> val secondWordStart: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeSmart[LocalVariableDescriptor]

'if (asciiOnly) string.toUpperCaseAsciiOnly() else string.toUpperCase()' @ [49:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'asciiOnly' @ [49:43] ==> value-parameter asciiOnly: Boolean = ... defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[ValueParameterDescriptorImpl]

'string' @ [49:54] ==> value-parameter string: String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord.toUpperCase[ValueParameterDescriptorImpl]

'toUpperCaseAsciiOnly' @ [49:61] ==> public fun String.toUpperCaseAsciiOnly(): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize in file capitalizeDecapitalize.kt[SimpleFunctionDescriptorImpl]

'string' @ [49:89] ==> value-parameter string: String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord.toUpperCase[ValueParameterDescriptorImpl]

'toUpperCase' @ [49:96] ==> @InlineOnly public inline fun String.toUpperCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [52:17] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[ReceiverParameterDescriptorImpl]

'index' @ [52:22] ==> value-parameter index: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord.isLowerCaseCharAt[ValueParameterDescriptorImpl]

'if (asciiOnly) c in 'a'..'z' else c.isLowerCase()' @ [53:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'asciiOnly' @ [53:20] ==> value-parameter asciiOnly: Boolean = ... defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[ValueParameterDescriptorImpl]

'c' @ [53:31] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord.isLowerCaseCharAt[LocalVariableDescriptor]

'..' @ [53:36] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [53:50] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord.isLowerCaseCharAt[LocalVariableDescriptor]

'isLowerCase' @ [53:52] ==> @InlineOnly public inline fun Char.isLowerCase(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indices' @ [56:27] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'drop' @ [56:35] ==> public fun <T> Iterable<Int>.drop(n: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'firstOrNull' @ [56:43] ==> public inline fun <T> Iterable<Int>.firstOrNull(predicate: (Int) -> Boolean): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'!' @ [56:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLowerCaseCharAt' @ [56:58] ==> local final fun isLowerCaseCharAt(index: Int): Boolean defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[SimpleFunctionDescriptorImpl]

'it' @ [56:76] ==> value-parameter it: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord.<anonymous>[ValueParameterDescriptorImpl]

'toUpperCase' @ [57:37] ==> local final fun toUpperCase(string: String): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[SimpleFunctionDescriptorImpl]

'this' @ [57:49] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[ReceiverParameterDescriptorImpl]

'toUpperCase' @ [58:12] ==> local final fun toUpperCase(string: String): String defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[SimpleFunctionDescriptorImpl]

'substring' @ [58:24] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'secondWordStart' @ [58:37] ==> val secondWordStart: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[LocalVariableDescriptor]

'substring' @ [58:57] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'secondWordStart' @ [58:67] ==> val secondWordStart: Int defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeFirstWord[LocalVariableDescriptor]

'isEmpty' @ [62:9] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [62:27] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly[ReceiverParameterDescriptorImpl]

'this' @ [63:13] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly[ReceiverParameterDescriptorImpl]

'if (c in 'a'..'z')
        c.toUpperCase() + substring(1)
    else
        this' @ [64:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'c' @ [64:16] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly[LocalVariableDescriptor]

'..' @ [64:21] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [65:9] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly[LocalVariableDescriptor]

'toUpperCase' @ [65:11] ==> @InlineOnly public inline fun Char.toUpperCase(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substring' @ [65:27] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [67:9] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.capitalizeAsciiOnly[ReceiverParameterDescriptorImpl]

'isEmpty' @ [71:9] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [71:27] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeAsciiOnly[ReceiverParameterDescriptorImpl]

'this' @ [72:13] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeAsciiOnly[ReceiverParameterDescriptorImpl]

'if (c in 'A'..'Z')
        c.toLowerCase() + substring(1)
    else
        this' @ [73:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'c' @ [73:16] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeAsciiOnly[LocalVariableDescriptor]

'..' @ [73:21] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [74:9] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeAsciiOnly[LocalVariableDescriptor]

'toLowerCase' @ [74:11] ==> @InlineOnly public inline fun Char.toLowerCase(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substring' @ [74:27] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'this' @ [76:9] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.decapitalizeAsciiOnly[ReceiverParameterDescriptorImpl]

'StringBuilder' @ [80:19] ==> public final fun <init>(p0: Int): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'length' @ [80:33] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'this' @ [81:15] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly[ReceiverParameterDescriptorImpl]

'builder' @ [82:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly[LocalVariableDescriptor]

'append' @ [82:17] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (c in 'A'..'Z') c.toLowerCase() else c' @ [82:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'c' @ [82:28] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly[LocalVariableDescriptor]

'..' @ [82:33] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [82:43] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly[LocalVariableDescriptor]

'toLowerCase' @ [82:45] ==> @InlineOnly public inline fun Char.toLowerCase(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'c' @ [82:64] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly[LocalVariableDescriptor]

'builder' @ [84:12] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toLowerCaseAsciiOnly[LocalVariableDescriptor]

'toString' @ [84:20] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'StringBuilder' @ [88:19] ==> public final fun <init>(p0: Int): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'length' @ [88:33] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'this' @ [89:15] ==> <this> defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly[ReceiverParameterDescriptorImpl]

'builder' @ [90:9] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly[LocalVariableDescriptor]

'append' @ [90:17] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'if (c in 'a'..'z') c.toUpperCase() else c' @ [90:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char, elseBranch: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char

'c' @ [90:28] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly[LocalVariableDescriptor]

'..' @ [90:33] ==> public final operator fun rangeTo(other: Char): CharRange defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'c' @ [90:43] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly[LocalVariableDescriptor]

'toUpperCase' @ [90:45] ==> @InlineOnly public inline fun Char.toUpperCase(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'c' @ [90:64] ==> val c: Char defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly[LocalVariableDescriptor]

'builder' @ [92:12] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.util.capitalizeDecapitalize.toUpperCaseAsciiOnly[LocalVariableDescriptor]

'toString' @ [92:20] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

