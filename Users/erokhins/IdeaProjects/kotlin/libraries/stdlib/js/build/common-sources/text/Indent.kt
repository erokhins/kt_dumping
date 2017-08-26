'kotlin.jvm.JvmMultifileClass' @ [1:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[ClassConstructorDescriptorImpl]

'kotlin.jvm.JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[ClassConstructorDescriptorImpl]

'replaceIndentByMargin' @ [21:5] ==> public fun String.replaceIndentByMargin(newIndent: String = ..., marginPrefix: String = ...): String defined in kotlin.text in file Indent.kt[SimpleFunctionDescriptorImpl]

'marginPrefix' @ [21:31] ==> value-parameter marginPrefix: String = ... defined in kotlin.text.trimMargin[ValueParameterDescriptorImpl]

'require' @ [29:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[SimpleFunctionDescriptorImpl]

'marginPrefix' @ [29:13] ==> value-parameter marginPrefix: String = ... defined in kotlin.text.replaceIndentByMargin[ValueParameterDescriptorImpl]

'isNotBlank' @ [29:26] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'lines' @ [30:17] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'lines' @ [32:12] ==> val lines: List<String> defined in kotlin.text.replaceIndentByMargin[LocalVariableDescriptor]

'reindent' @ [32:18] ==> private inline fun List<String>.reindent(resultSizeEstimate: Int, indentAddFunction: (String) -> String, indentCutFunction: (String) -> String?): String defined in kotlin.text[SimpleFunctionDescriptorImpl]

'length' @ [32:27] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'newIndent' @ [32:36] ==> value-parameter newIndent: String = ... defined in kotlin.text.replaceIndentByMargin[ValueParameterDescriptorImpl]

'length' @ [32:46] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'lines' @ [32:55] ==> val lines: List<String> defined in kotlin.text.replaceIndentByMargin[LocalVariableDescriptor]

'size' @ [32:61] ==> public abstract val size: Int defined in kotlin.collections.List[PropertyDescriptorImpl]

'getIndentFunction' @ [32:67] ==> private fun getIndentFunction(indent: String): (String) -> String defined in kotlin.text[SimpleFunctionDescriptorImpl]

'newIndent' @ [32:85] ==> value-parameter newIndent: String = ... defined in kotlin.text.replaceIndentByMargin[ValueParameterDescriptorImpl]

'line' @ [33:39] ==> value-parameter line: String defined in kotlin.text.replaceIndentByMargin.<anonymous>[ValueParameterDescriptorImpl]

'indexOfFirst' @ [33:44] ==> public inline fun CharSequence.indexOfFirst(predicate: (Char) -> Boolean): Int defined in kotlin.text[SimpleFunctionDescriptorImpl]

'!' @ [33:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [33:60] ==> value-parameter it: Char defined in kotlin.text.replaceIndentByMargin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isWhitespace' @ [33:63] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text in file char.kt[SimpleFunctionDescriptorImpl]

'when {
            firstNonWhitespaceIndex == -1 -> null
            line.startsWith(marginPrefix, firstNonWhitespaceIndex) -> line.substring(firstNonWhitespaceIndex + marginPrefix.length)
            else -> null
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'firstNonWhitespaceIndex' @ [36:13] ==> val firstNonWhitespaceIndex: Int defined in kotlin.text.replaceIndentByMargin.<anonymous>[LocalVariableDescriptor]

'-' @ [36:40] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'line' @ [37:13] ==> value-parameter line: String defined in kotlin.text.replaceIndentByMargin.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [37:18] ==> public fun String.startsWith(prefix: String, startIndex: Int, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file stringsCode.kt[SimpleFunctionDescriptorImpl]

'marginPrefix' @ [37:29] ==> value-parameter marginPrefix: String = ... defined in kotlin.text.replaceIndentByMargin[ValueParameterDescriptorImpl]

'firstNonWhitespaceIndex' @ [37:43] ==> val firstNonWhitespaceIndex: Int defined in kotlin.text.replaceIndentByMargin.<anonymous>[LocalVariableDescriptor]

'line' @ [37:71] ==> value-parameter line: String defined in kotlin.text.replaceIndentByMargin.<anonymous>[ValueParameterDescriptorImpl]

'substring' @ [37:76] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text in file string.kt[SimpleFunctionDescriptorImpl]

'firstNonWhitespaceIndex' @ [37:86] ==> val firstNonWhitespaceIndex: Int defined in kotlin.text.replaceIndentByMargin.<anonymous>[LocalVariableDescriptor]

'marginPrefix' @ [37:112] ==> value-parameter marginPrefix: String = ... defined in kotlin.text.replaceIndentByMargin[ValueParameterDescriptorImpl]

'length' @ [37:125] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'replaceIndent' @ [58:42] ==> public fun String.replaceIndent(newIndent: String = ...): String defined in kotlin.text in file Indent.kt[SimpleFunctionDescriptorImpl]

'lines' @ [64:17] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'lines' @ [66:27] ==> val lines: List<String> defined in kotlin.text.replaceIndent[LocalVariableDescriptor]

'filter' @ [67:14] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'String' @ [67:21] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'map' @ [68:14] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <R> -> Int

'String' @ [68:18] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'min' @ [69:14] ==> public fun <T : Comparable<Int>> Iterable<Int>.min(): Int? defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Comparable<T>> -> Int

'lines' @ [71:12] ==> val lines: List<String> defined in kotlin.text.replaceIndent[LocalVariableDescriptor]

'reindent' @ [71:18] ==> private inline fun List<String>.reindent(resultSizeEstimate: Int, indentAddFunction: (String) -> String, indentCutFunction: (String) -> String?): String defined in kotlin.text[SimpleFunctionDescriptorImpl]

'length' @ [71:27] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'newIndent' @ [71:36] ==> value-parameter newIndent: String = ... defined in kotlin.text.replaceIndent[ValueParameterDescriptorImpl]

'length' @ [71:46] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'lines' @ [71:55] ==> val lines: List<String> defined in kotlin.text.replaceIndent[LocalVariableDescriptor]

'size' @ [71:61] ==> public abstract val size: Int defined in kotlin.collections.List[PropertyDescriptorImpl]

'getIndentFunction' @ [71:67] ==> private fun getIndentFunction(indent: String): (String) -> String defined in kotlin.text[SimpleFunctionDescriptorImpl]

'newIndent' @ [71:85] ==> value-parameter newIndent: String = ... defined in kotlin.text.replaceIndent[ValueParameterDescriptorImpl]

'line' @ [71:107] ==> value-parameter line: String defined in kotlin.text.replaceIndent.<anonymous>[ValueParameterDescriptorImpl]

'drop' @ [71:112] ==> public fun String.drop(n: Int): String defined in kotlin.text in file _StringsJs.kt[SimpleFunctionDescriptorImpl]

'minCommonIndent' @ [71:117] ==> val minCommonIndent: Int defined in kotlin.text.replaceIndent[LocalVariableDescriptor]

'lineSequence' @ [80:5] ==> public fun CharSequence.lineSequence(): Sequence<String> defined in kotlin.text[SimpleFunctionDescriptorImpl]

'map' @ [81:6] ==> public fun <T, R> Sequence<String>.map(transform: (String) -> String): Sequence<String> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <R> -> String

'when {
            it.isBlank() -> {
                when {
                    it.length < indent.length -> indent
                    else -> it
                }
            }
            else -> indent + it
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [83:13] ==> value-parameter it: String defined in kotlin.text.prependIndent.<anonymous>[ValueParameterDescriptorImpl]

'isBlank' @ [83:16] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text in file stringsCode.kt[SimpleFunctionDescriptorImpl]

'when {
                    it.length < indent.length -> indent
                    else -> it
                }' @ [84:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [85:21] ==> value-parameter it: String defined in kotlin.text.prependIndent.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [85:24] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'indent' @ [85:33] ==> value-parameter indent: String = ... defined in kotlin.text.prependIndent[ValueParameterDescriptorImpl]

'length' @ [85:40] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'indent' @ [85:50] ==> value-parameter indent: String = ... defined in kotlin.text.prependIndent[ValueParameterDescriptorImpl]

'it' @ [86:29] ==> value-parameter it: String defined in kotlin.text.prependIndent.<anonymous>[ValueParameterDescriptorImpl]

'indent' @ [89:21] ==> value-parameter indent: String = ... defined in kotlin.text.prependIndent[ValueParameterDescriptorImpl]

'it' @ [89:30] ==> value-parameter it: String defined in kotlin.text.prependIndent.<anonymous>[ValueParameterDescriptorImpl]

'joinToString' @ [92:6] ==> public fun <T> Sequence<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'indexOfFirst' @ [94:41] ==> public inline fun CharSequence.indexOfFirst(predicate: (Char) -> Boolean): Int defined in kotlin.text[SimpleFunctionDescriptorImpl]

'!' @ [94:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [94:57] ==> value-parameter it: Char defined in kotlin.text.indentWidth.<anonymous>[ValueParameterDescriptorImpl]

'isWhitespace' @ [94:60] ==> public fun Char.isWhitespace(): Boolean defined in kotlin.text in file char.kt[SimpleFunctionDescriptorImpl]

'let' @ [94:77] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Int): Int defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int
    <R> -> Int

'if (it == -1) length else it' @ [94:83] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'it' @ [94:87] ==> value-parameter it: Int defined in kotlin.text.indentWidth.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [94:93] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'length' @ [94:97] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'it' @ [94:109] ==> value-parameter it: Int defined in kotlin.text.indentWidth.<anonymous>[ValueParameterDescriptorImpl]

'when {
    indent.isEmpty() -> { line: String -> line }
    else -> { line: String -> indent + line }
}' @ [96:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String) -> String, entry1: (String) -> String): (String) -> String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Function1<String, String>

'indent' @ [97:5] ==> value-parameter indent: String defined in kotlin.text.getIndentFunction[ValueParameterDescriptorImpl]

'isEmpty' @ [97:12] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'line' @ [97:43] ==> value-parameter line: String defined in kotlin.text.getIndentFunction.<anonymous>[ValueParameterDescriptorImpl]

'indent' @ [98:31] ==> value-parameter indent: String defined in kotlin.text.getIndentFunction[ValueParameterDescriptorImpl]

'line' @ [98:40] ==> value-parameter line: String defined in kotlin.text.getIndentFunction.<anonymous>[ValueParameterDescriptorImpl]

'lastIndex' @ [102:21] ==> public val <T> List<String>.lastIndex: Int defined in kotlin.collections[PropertyDescriptorImpl]
Inferred types:
    <T> -> String

'mapIndexedNotNull' @ [103:12] ==> public inline fun <T, R : Any> Iterable<String>.mapIndexedNotNull(transform: (index: Int, String) -> String?): List<String> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <R : Any> -> String

'if ((index == 0 || index == lastIndex) && value.isBlank())
                null
            else
                indentCutFunction(value)?.let(indentAddFunction) ?: value' @ [104:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'index' @ [104:18] ==> value-parameter index: Int defined in kotlin.text.reindent.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [104:32] ==> value-parameter index: Int defined in kotlin.text.reindent.<anonymous>[ValueParameterDescriptorImpl]

'lastIndex' @ [104:41] ==> val lastIndex: Int defined in kotlin.text.reindent[LocalVariableDescriptor]

'value' @ [104:55] ==> value-parameter value: String defined in kotlin.text.reindent.<anonymous>[ValueParameterDescriptorImpl]

'isBlank' @ [104:61] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text in file stringsCode.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [107:17] ==> public abstract operator fun invoke(p1: String): String? defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [107:35] ==> value-parameter value: String defined in kotlin.text.reindent.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [107:43] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <R> -> String

'indentAddFunction' @ [107:47] ==> value-parameter indentAddFunction: (String) -> String defined in kotlin.text.reindent[ValueParameterDescriptorImpl]

'value' @ [107:69] ==> value-parameter value: String defined in kotlin.text.reindent.<anonymous>[ValueParameterDescriptorImpl]

'joinTo' @ [109:10] ==> public fun <T, A : Appendable> Iterable<String>.joinTo(buffer: StringBuilder, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): StringBuilder defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <A : Appendable> -> StringBuilder

'StringBuilder' @ [109:17] ==> public constructor StringBuilder(@Suppress capacity: Int) defined in kotlin.text.StringBuilder[ClassConstructorDescriptorImpl]

'resultSizeEstimate' @ [109:31] ==> value-parameter resultSizeEstimate: Int defined in kotlin.text.reindent[ValueParameterDescriptorImpl]

'toString' @ [110:10] ==> public open fun toString(): String defined in kotlin.text.StringBuilder[SimpleFunctionDescriptorImpl]

