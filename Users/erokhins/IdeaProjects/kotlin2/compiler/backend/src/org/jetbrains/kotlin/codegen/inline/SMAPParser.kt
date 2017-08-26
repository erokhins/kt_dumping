'JvmStatic' @ [21:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'mappingInfo' @ [23:13] ==> value-parameter mappingInfo: String? defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'mappingInfo' @ [23:36] ==> value-parameter mappingInfo: String? defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'isNotEmpty' @ [23:48] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parse' @ [24:20] ==> @JvmStatic public final fun parse(mappingInfo: String): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[SimpleFunctionDescriptorImpl]

'mappingInfo' @ [24:26] ==> value-parameter mappingInfo: String? defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'if (source == null || source.isEmpty() || methodStartLine > methodEndLine)
                    FileMapping.SKIP
                else
                    FileMapping(source, path).apply {
                        if (methodStartLine <= methodEndLine) {
                            //one to one
                            addRangeMapping(RangeMapping(methodStartLine, methodStartLine, methodEndLine - methodStartLine + 1))
                        }
                    }' @ [28:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FileMapping, elseBranch: FileMapping): FileMapping[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FileMapping

'source' @ [28:21] ==> value-parameter source: String? defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'source' @ [28:39] ==> value-parameter source: String? defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'isEmpty' @ [28:46] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'methodStartLine' @ [28:59] ==> value-parameter methodStartLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'methodEndLine' @ [28:77] ==> value-parameter methodEndLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'SKIP' @ [29:33] ==> public object SKIP : FileMapping defined in org.jetbrains.kotlin.codegen.inline.FileMapping[FakeCallableDescriptorForObject]

'FileMapping' @ [31:21] ==> public constructor FileMapping(name: String, path: String) defined in org.jetbrains.kotlin.codegen.inline.FileMapping[ClassConstructorDescriptorImpl]

'source' @ [31:33] ==> value-parameter source: String? defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'path' @ [31:41] ==> value-parameter path: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'apply' @ [31:47] ==> @InlineOnly public inline fun <T> FileMapping.apply(block: FileMapping.() -> Unit): FileMapping defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'methodStartLine' @ [32:29] ==> value-parameter methodStartLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'methodEndLine' @ [32:48] ==> value-parameter methodEndLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'addRangeMapping' @ [34:29] ==> public final fun addRangeMapping(lineMapping: RangeMapping): Unit defined in org.jetbrains.kotlin.codegen.inline.FileMapping[SimpleFunctionDescriptorImpl]

'RangeMapping' @ [34:45] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'methodStartLine' @ [34:58] ==> value-parameter methodStartLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'methodStartLine' @ [34:75] ==> value-parameter methodStartLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'methodEndLine' @ [34:92] ==> value-parameter methodEndLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'methodStartLine' @ [34:108] ==> value-parameter methodStartLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[ValueParameterDescriptorImpl]

'SMAP' @ [38:16] ==> public constructor SMAP(fileMappings: List<FileMapping>) defined in org.jetbrains.kotlin.codegen.inline.SMAP[ClassConstructorDescriptorImpl]

'listOf' @ [38:21] ==> public fun <T> listOf(element: FileMapping): List<FileMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

'mapping' @ [38:28] ==> val mapping: FileMapping defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parseOrCreateDefault[LocalVariableDescriptor]

'JvmStatic' @ [41:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'linkedMapOf' @ [43:28] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<Int, FileMapping> /* = LinkedHashMap<Int, FileMapping> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> FileMapping

'mappingInfo' @ [45:32] ==> value-parameter mappingInfo: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[ValueParameterDescriptorImpl]

'indexOf' @ [45:44] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'FILE_SECTION' @ [45:57] ==> public const final val FILE_SECTION: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[PropertyDescriptorImpl]

'FILE_SECTION' @ [45:78] ==> public const final val FILE_SECTION: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[PropertyDescriptorImpl]

'length' @ [45:91] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'mappingInfo' @ [46:33] ==> value-parameter mappingInfo: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[ValueParameterDescriptorImpl]

'indexOf' @ [46:45] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LINE_SECTION' @ [46:58] ==> public const final val LINE_SECTION: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[PropertyDescriptorImpl]

'mappingInfo' @ [47:21] ==> value-parameter mappingInfo: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[ValueParameterDescriptorImpl]

'substring' @ [47:33] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileSectionStart' @ [47:43] ==> val fileSectionStart: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'lineSectionAnchor' @ [47:61] ==> val lineSectionAnchor: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'files' @ [49:27] ==> val files: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'trim' @ [49:33] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [49:40] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileEntries' @ [51:33] ==> val fileEntries: List<String> defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'fileDeclaration' @ [52:17] ==> val fileDeclaration: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'fileDeclaration' @ [53:36] ==> val fileDeclaration: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'trim' @ [53:52] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileInternalName' @ [55:28] ==> val fileInternalName: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'indexOf' @ [55:45] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileInternalName' @ [56:29] ==> val fileInternalName: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [56:46] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indexEnd' @ [56:59] ==> val indexEnd: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'toInt' @ [56:69] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileInternalName' @ [57:27] ==> val fileInternalName: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'indexOf' @ [57:44] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileInternalName' @ [58:28] ==> val fileInternalName: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [58:45] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indexEnd' @ [58:55] ==> val indexEnd: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'newLine' @ [58:69] ==> val newLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'fileMappings' @ [59:13] ==> val fileMappings: LinkedHashMap<Int, FileMapping> /* = LinkedHashMap<Int, FileMapping> */ defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'fileIndex' @ [59:26] ==> val fileIndex: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'FileMapping' @ [59:39] ==> public constructor FileMapping(name: String, path: String) defined in org.jetbrains.kotlin.codegen.inline.FileMapping[ClassConstructorDescriptorImpl]

'fileName' @ [59:51] ==> val fileName: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'fileInternalName' @ [59:61] ==> val fileInternalName: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [59:78] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'newLine' @ [59:88] ==> val newLine: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'trim' @ [59:101] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mappingInfo' @ [62:21] ==> value-parameter mappingInfo: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[ValueParameterDescriptorImpl]

'substring' @ [62:33] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineSectionAnchor' @ [62:43] ==> val lineSectionAnchor: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'LINE_SECTION' @ [62:68] ==> public const final val LINE_SECTION: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[PropertyDescriptorImpl]

'length' @ [62:81] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'mappingInfo' @ [62:89] ==> value-parameter mappingInfo: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[ValueParameterDescriptorImpl]

'indexOf' @ [62:101] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'END' @ [62:114] ==> public const final val END: String defined in org.jetbrains.kotlin.codegen.inline.SMAP.Companion[PropertyDescriptorImpl]

'trim' @ [62:120] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [62:127] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lines' @ [63:29] ==> val lines: List<String> defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'lineMapping' @ [65:31] ==> val lineMapping: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'indexOf' @ [65:43] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineMapping' @ [66:32] ==> val lineMapping: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [66:44] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'targetSplit' @ [66:57] ==> val targetSplit: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'originalPart' @ [67:34] ==> val originalPart: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'indexOf' @ [67:47] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [67:60] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'if (it < 0) targetSplit else it' @ [67:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'it' @ [67:70] ==> value-parameter it: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'targetSplit' @ [67:78] ==> val targetSplit: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'it' @ [67:95] ==> value-parameter it: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse.<anonymous>[ValueParameterDescriptorImpl]

'lineMapping' @ [69:33] ==> val lineMapping: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'indexOf' @ [69:45] ==> public fun CharSequence.indexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'originalPart' @ [70:33] ==> val originalPart: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [70:46] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileSeparator' @ [70:59] ==> val fileSeparator: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'toInt' @ [70:74] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (rangeSeparator == targetSplit) 1 else originalPart.substring(rangeSeparator + 1, targetSplit).toInt()' @ [71:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'rangeSeparator' @ [71:29] ==> val rangeSeparator: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'targetSplit' @ [71:47] ==> val targetSplit: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'originalPart' @ [71:67] ==> val originalPart: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [71:80] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'rangeSeparator' @ [71:90] ==> val rangeSeparator: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'targetSplit' @ [71:110] ==> val targetSplit: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'toInt' @ [71:123] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineMapping' @ [73:29] ==> val lineMapping: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [73:41] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileSeparator' @ [73:51] ==> val fileSeparator: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'rangeSeparator' @ [73:70] ==> val rangeSeparator: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'toInt' @ [73:86] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lineMapping' @ [74:31] ==> val lineMapping: String defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'substring' @ [74:43] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'targetSplit' @ [74:53] ==> val targetSplit: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'toInt' @ [74:70] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fileMappings' @ [75:13] ==> val fileMappings: LinkedHashMap<Int, FileMapping> /* = LinkedHashMap<Int, FileMapping> */ defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'fileIndex' @ [75:26] ==> val fileIndex: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'addRangeMapping' @ [75:39] ==> public final fun addRangeMapping(lineMapping: RangeMapping): Unit defined in org.jetbrains.kotlin.codegen.inline.FileMapping[SimpleFunctionDescriptorImpl]

'RangeMapping' @ [75:55] ==> public constructor RangeMapping(source: Int, dest: Int, range: Int = ..., callSiteMarker: CallSiteMarker? = ...) defined in org.jetbrains.kotlin.codegen.inline.RangeMapping[ClassConstructorDescriptorImpl]

'originalIndex' @ [75:68] ==> val originalIndex: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'targetIndex' @ [75:83] ==> val targetIndex: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'range' @ [75:96] ==> val range: Int defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'SMAP' @ [78:16] ==> public constructor SMAP(fileMappings: List<FileMapping>) defined in org.jetbrains.kotlin.codegen.inline.SMAP[ClassConstructorDescriptorImpl]

'fileMappings' @ [78:21] ==> val fileMappings: LinkedHashMap<Int, FileMapping> /* = LinkedHashMap<Int, FileMapping> */ defined in org.jetbrains.kotlin.codegen.inline.SMAPParser.parse[LocalVariableDescriptor]

'values' @ [78:34] ==> public open val values: MutableCollection<FileMapping> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'toList' @ [78:41] ==> public fun <T> Iterable<FileMapping>.toList(): List<FileMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping

