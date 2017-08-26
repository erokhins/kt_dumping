'element' @ [26:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.RenderFirstLineOfElementText.render[ValueParameterDescriptorImpl]

'text' @ [26:28] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'text' @ [27:21] ==> val text: (String..String?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.RenderFirstLineOfElementText.render[LocalVariableDescriptor]

'indexOf' @ [27:26] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (index == -1) text else text.substring(0, index) + "..."' @ [28:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'index' @ [28:20] ==> val index: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.RenderFirstLineOfElementText.render[LocalVariableDescriptor]

'-' @ [28:29] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'text' @ [28:33] ==> val text: (String..String?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.RenderFirstLineOfElementText.render[LocalVariableDescriptor]

'text' @ [28:43] ==> val text: (String..String?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.RenderFirstLineOfElementText.render[LocalVariableDescriptor]

'substring' @ [28:48] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [28:61] ==> val index: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.RenderFirstLineOfElementText.render[LocalVariableDescriptor]

'when (data) {
                is JsCallDataWithCode -> format(data)
                else -> data.message
            }' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'data' @ [36:19] ==> value-parameter data: JsCallData defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataRenderer.render[ValueParameterDescriptorImpl]

'format' @ [37:42] ==> protected abstract fun format(data: JsCallDataWithCode): String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataRenderer[SimpleFunctionDescriptorImpl]

'data' @ [37:49] ==> value-parameter data: JsCallData defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataRenderer.render[ValueParameterDescriptorImpl]

'data' @ [38:25] ==> value-parameter data: JsCallData defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataRenderer.render[ValueParameterDescriptorImpl]

'message' @ [38:30] ==> public final val message: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallData[PropertyDescriptorImpl]

'JsCallDataRenderer' @ [42:33] ==> public constructor JsCallDataRenderer() defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataRenderer[ClassConstructorDescriptorImpl]

'data' @ [44:25] ==> value-parameter data: JsCallDataWithCode defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataTextRenderer.format[ValueParameterDescriptorImpl]

'codeRange' @ [44:30] ==> public final val codeRange: TextRange defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataWithCode[PropertyDescriptorImpl]

'data' @ [45:20] ==> value-parameter data: JsCallDataWithCode defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataTextRenderer.format[ValueParameterDescriptorImpl]

'code' @ [45:25] ==> public final val code: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataWithCode[PropertyDescriptorImpl]

'underlineAsText' @ [45:30] ==> public fun String.underlineAsText(from: Int, to: Int): String defined in org.jetbrains.kotlin.js.resolve.diagnostics in file jsRenderers.kt[SimpleFunctionDescriptorImpl]

'codeRange' @ [45:46] ==> val codeRange: TextRange defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataTextRenderer.format[LocalVariableDescriptor]

'startOffset' @ [45:56] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'codeRange' @ [45:69] ==> val codeRange: TextRange defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataTextRenderer.format[LocalVariableDescriptor]

'endOffset' @ [45:79] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'data' @ [46:19] ==> value-parameter data: JsCallDataWithCode defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataTextRenderer.format[ValueParameterDescriptorImpl]

'message' @ [46:24] ==> public final val message: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataWithCode[PropertyDescriptorImpl]

'code' @ [46:44] ==> val code: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataTextRenderer.format[LocalVariableDescriptor]

'JsCallDataRenderer' @ [50:33] ==> public constructor JsCallDataRenderer() defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataRenderer[ClassConstructorDescriptorImpl]

'data' @ [52:25] ==> value-parameter data: JsCallDataWithCode defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataHtmlRenderer.format[ValueParameterDescriptorImpl]

'codeRange' @ [52:30] ==> public final val codeRange: TextRange defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataWithCode[PropertyDescriptorImpl]

'data' @ [53:20] ==> value-parameter data: JsCallDataWithCode defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataHtmlRenderer.format[ValueParameterDescriptorImpl]

'code' @ [53:25] ==> public final val code: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataWithCode[PropertyDescriptorImpl]

'underlineAsHtml' @ [53:30] ==> public fun String.underlineAsHtml(from: Int, to: Int): String defined in org.jetbrains.kotlin.js.resolve.diagnostics in file jsRenderers.kt[SimpleFunctionDescriptorImpl]

'codeRange' @ [53:46] ==> val codeRange: TextRange defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataHtmlRenderer.format[LocalVariableDescriptor]

'startOffset' @ [53:56] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'codeRange' @ [53:69] ==> val codeRange: TextRange defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataHtmlRenderer.format[LocalVariableDescriptor]

'endOffset' @ [53:79] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'data' @ [54:19] ==> value-parameter data: JsCallDataWithCode defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataHtmlRenderer.format[ValueParameterDescriptorImpl]

'message' @ [54:24] ==> public final val message: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataWithCode[PropertyDescriptorImpl]

'code' @ [54:51] ==> val code: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsCallDataHtmlRenderer.format[LocalVariableDescriptor]

'StringBuilder' @ [66:17] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'StringBuilder' @ [67:17] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'indices' @ [70:15] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'this' @ [71:17] ==> <this> defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[ReceiverParameterDescriptorImpl]

'i' @ [71:22] ==> val i: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'mark' @ [74:9] ==> val mark: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'when (i) {
            in from..to -> '^'
            else -> ' '
        }' @ [74:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Char, entry1: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Char

'i' @ [74:22] ==> val i: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'in' @ [75:13] ==> public open fun contains(value: Int): Boolean defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'from' @ [75:16] ==> value-parameter from: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[ValueParameterDescriptorImpl]

'to' @ [75:22] ==> value-parameter to: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[ValueParameterDescriptorImpl]

'lines' @ [79:9] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'append' @ [79:15] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'c' @ [79:22] ==> val c: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'marks' @ [80:9] ==> var marks: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'append' @ [80:15] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'mark' @ [80:22] ==> val mark: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'lineWasMarked' @ [81:9] ==> var lineWasMarked: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'lineWasMarked' @ [81:25] ==> var lineWasMarked: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'mark' @ [81:42] ==> val mark: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'isEndOfLine' @ [83:13] ==> public open fun isEndOfLine(p0: Int): Boolean defined in com.google.gwt.dev.js.rhino.Utils[JavaMethodDescriptor]

'c' @ [83:25] ==> val c: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'toInt' @ [83:27] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'lineWasMarked' @ [84:17] ==> var lineWasMarked: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'lines' @ [85:17] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'appendln' @ [85:23] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'marks' @ [85:32] ==> var marks: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'toString' @ [85:38] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'trimEnd' @ [85:49] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineWasMarked' @ [86:17] ==> var lineWasMarked: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'marks' @ [89:13] ==> var marks: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'StringBuilder' @ [89:21] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'lineWasMarked' @ [93:9] ==> var lineWasMarked: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'lines' @ [94:9] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'appendln' @ [94:15] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lines' @ [95:9] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'append' @ [95:15] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'marks' @ [95:22] ==> var marks: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'toString' @ [95:28] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'lines' @ [98:12] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsText[LocalVariableDescriptor]

'toString' @ [98:18] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'StringBuilder' @ [102:17] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'indices' @ [107:15] ==> public val CharSequence.indices: IntRange defined in kotlin.text[DeserializedPropertyDescriptor]

'this' @ [108:17] ==> <this> defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[ReceiverParameterDescriptorImpl]

'i' @ [108:22] ==> val i: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'when (i) {
            from -> {
                openMarker = true
                underlineStart
            }
            to -> {
                openMarker = false
                underlineEnd
            }
            else -> ""
        }' @ [110:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'i' @ [110:26] ==> val i: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'from' @ [111:13] ==> value-parameter from: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[ValueParameterDescriptorImpl]

'openMarker' @ [112:17] ==> var openMarker: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'underlineStart' @ [113:17] ==> val underlineStart: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'to' @ [115:13] ==> value-parameter to: Int defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[ValueParameterDescriptorImpl]

'openMarker' @ [116:17] ==> var openMarker: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'underlineEnd' @ [117:17] ==> val underlineEnd: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'lines' @ [122:9] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'append' @ [122:15] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'mark' @ [122:22] ==> val mark: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'if (isEndOfLine(c.toInt()) && openMarker) {
            lines.append(underlineEnd + c + underlineStart)
        } else {
            lines.append(c)
        }' @ [124:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'isEndOfLine' @ [124:13] ==> public open fun isEndOfLine(p0: Int): Boolean defined in com.google.gwt.dev.js.rhino.Utils[JavaMethodDescriptor]

'c' @ [124:25] ==> val c: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'toInt' @ [124:27] ==> public final fun toInt(): Int defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'openMarker' @ [124:39] ==> var openMarker: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'lines' @ [125:13] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'append' @ [125:19] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'underlineEnd' @ [125:26] ==> val underlineEnd: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'c' @ [125:41] ==> val c: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'underlineStart' @ [125:45] ==> val underlineStart: String defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'lines' @ [127:13] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'append' @ [127:19] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'c' @ [127:26] ==> val c: Char defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'lines' @ [131:12] ==> val lines: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.js.resolve.diagnostics.underlineAsHtml[LocalVariableDescriptor]

'toString' @ [131:18] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

