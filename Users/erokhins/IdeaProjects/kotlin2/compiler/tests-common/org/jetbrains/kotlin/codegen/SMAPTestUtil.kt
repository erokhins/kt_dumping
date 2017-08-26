'outputFiles' @ [36:16] ==> value-parameter outputFiles: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSMAPFromClasses[ValueParameterDescriptorImpl]

'mapNotNull' @ [36:28] ==> public inline fun <T, R : Any> Iterable<OutputFile>.mapNotNull(transform: (OutputFile) -> SMAPTestUtil.SMAPAndFile?): List<SMAPTestUtil.SMAPAndFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R : Any> -> SMAPAndFile

'ClassReader' @ [38:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'outputFile' @ [38:25] ==> value-parameter outputFile: OutputFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSMAPFromClasses.<anonymous>[ValueParameterDescriptorImpl]

'asByteArray' @ [38:36] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'accept' @ [38:51] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [38:67] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [38:88] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'debugInfo' @ [40:21] ==> var debugInfo: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSMAPFromClasses.<anonymous>[LocalVariableDescriptor]

'debug' @ [40:33] ==> value-parameter debug: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSMAPFromClasses.<anonymous>.<no name provided>.visitSource[ValueParameterDescriptorImpl]

'SMAPAndFile' @ [44:13] ==> public companion object defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[FakeCallableDescriptorForObject]

'SMAPAndFile' @ [44:25] ==> public final fun SMAPAndFile(smap: String?, sourceFile: File, outputFile: String): SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion[SimpleFunctionDescriptorImpl]

'debugInfo' @ [44:37] ==> var debugInfo: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSMAPFromClasses.<anonymous>[LocalVariableDescriptor]

'outputFile' @ [44:48] ==> value-parameter outputFile: OutputFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSMAPFromClasses.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [44:59] ==> public abstract val sourceFiles: List<File> defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'single' @ [44:71] ==> public fun <T> List<File>.single(): File defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'outputFile' @ [44:81] ==> value-parameter outputFile: OutputFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSMAPFromClasses.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [44:92] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'!' @ [49:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [49:14] ==> value-parameter file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSmapFromTestDataFile[ValueParameterDescriptorImpl]

'name' @ [49:19] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'endsWith' @ [49:24] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'buildString' @ [51:23] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'StringReader' @ [52:13] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'file' @ [52:26] ==> value-parameter file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSmapFromTestDataFile[ValueParameterDescriptorImpl]

'content' @ [52:31] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'forEachLine' @ [52:40] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'!' @ [54:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'line' @ [54:22] ==> value-parameter line: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSmapFromTestDataFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [54:27] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [55:21] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'line' @ [55:30] ==> value-parameter line: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSmapFromTestDataFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [55:35] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [58:11] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'SMAPAndFile' @ [60:16] ==> public constructor SMAPAndFile(smap: String?, sourceFile: String, outputFile: String) defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[ClassConstructorDescriptorImpl]

'if (content.isNotEmpty()) content else null' @ [60:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'content' @ [60:32] ==> val content: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSmapFromTestDataFile[LocalVariableDescriptor]

'isNotEmpty' @ [60:40] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'content' @ [60:54] ==> val content: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSmapFromTestDataFile[LocalVariableDescriptor]

'SMAPAndFile' @ [60:73] ==> public companion object defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[FakeCallableDescriptorForObject]

'getPath' @ [60:85] ==> public final fun getPath(canonicalPath: String): String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion[SimpleFunctionDescriptorImpl]

'file' @ [60:93] ==> value-parameter file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.extractSmapFromTestDataFile[ValueParameterDescriptorImpl]

'name' @ [60:98] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'!' @ [64:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'GENERATE_SMAP' @ [64:14] ==> public const val GENERATE_SMAP: Boolean defined in org.jetbrains.kotlin.codegen.inline[DeserializedPropertyDescriptor]

'inputFiles' @ [66:26] ==> value-parameter inputFiles: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[ValueParameterDescriptorImpl]

'mapNotNull' @ [66:37] ==> public inline fun <T, R : Any> Iterable<CodegenTestCase.TestFile>.mapNotNull(transform: (CodegenTestCase.TestFile) -> SMAPTestUtil.SMAPAndFile?): List<SMAPTestUtil.SMAPAndFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestFile
    <R : Any> -> SMAPAndFile

'extractSmapFromTestDataFile' @ [66:50] ==> private final fun extractSmapFromTestDataFile(file: CodegenTestCase.TestFile): SMAPTestUtil.SMAPAndFile? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil[SimpleFunctionDescriptorImpl]

'it' @ [66:78] ==> value-parameter it: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>[ValueParameterDescriptorImpl]

'extractSMAPFromClasses' @ [67:29] ==> private final fun extractSMAPFromClasses(outputFiles: Iterable<OutputFile>): List<SMAPTestUtil.SMAPAndFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil[SimpleFunctionDescriptorImpl]

'outputFiles' @ [67:52] ==> value-parameter outputFiles: Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[ValueParameterDescriptorImpl]

'compiledSmaps' @ [68:28] ==> val compiledSmaps: List<SMAPTestUtil.SMAPAndFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'groupBy' @ [68:42] ==> public inline fun <T, K> Iterable<SMAPTestUtil.SMAPAndFile>.groupBy(keySelector: (SMAPTestUtil.SMAPAndFile) -> String): Map<String, List<SMAPTestUtil.SMAPAndFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SMAPAndFile
    <K> -> String

'it' @ [69:13] ==> value-parameter it: SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [69:16] ==> public final val sourceFile: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'map' @ [70:11] ==> public inline fun <K, V, R> Map<out String, List<SMAPTestUtil.SMAPAndFile>>.map(transform: (Map.Entry<String, List<SMAPTestUtil.SMAPAndFile>>) -> SMAPTestUtil.SMAPAndFile): List<SMAPTestUtil.SMAPAndFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<SMAPAndFile>
    <R> -> SMAPAndFile

'it' @ [71:24] ==> value-parameter it: Map.Entry<String, List<SMAPTestUtil.SMAPAndFile>> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [71:27] ==> public abstract val value: List<SMAPTestUtil.SMAPAndFile> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'sortedByDescending' @ [71:33] ==> public inline fun <T, R : Comparable<String>> Iterable<SMAPTestUtil.SMAPAndFile>.sortedByDescending(crossinline selector: (SMAPTestUtil.SMAPAndFile) -> String?): List<SMAPTestUtil.SMAPAndFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SMAPAndFile
    <R : Comparable<R>> -> String

'it' @ [71:54] ==> value-parameter it: SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [71:57] ==> public final val outputFile: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'mapNotNull' @ [71:70] ==> public inline fun <T, R : Any> Iterable<SMAPTestUtil.SMAPAndFile>.mapNotNull(transform: (SMAPTestUtil.SMAPAndFile) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SMAPAndFile
    <R : Any> -> String

'it' @ [71:83] ==> value-parameter it: SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'smap' @ [71:86] ==> public final val smap: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'joinToString' @ [71:93] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SMAPAndFile' @ [72:13] ==> public constructor SMAPAndFile(smap: String?, sourceFile: String, outputFile: String) defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[ClassConstructorDescriptorImpl]

'if (smap.isNotEmpty()) smap else null' @ [72:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'smap' @ [72:29] ==> val smap: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [72:34] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'smap' @ [72:48] ==> val smap: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>[LocalVariableDescriptor]

'it' @ [72:64] ==> value-parameter it: Map.Entry<String, List<SMAPTestUtil.SMAPAndFile>> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [72:67] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'associateBy' @ [73:11] ==> public inline fun <T, K> Iterable<SMAPTestUtil.SMAPAndFile>.associateBy(keySelector: (SMAPTestUtil.SMAPAndFile) -> String): Map<String, SMAPTestUtil.SMAPAndFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SMAPAndFile
    <K> -> String

'it' @ [73:25] ==> value-parameter it: SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [73:28] ==> public final val sourceFile: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'sourceData' @ [75:24] ==> val sourceData: List<SMAPTestUtil.SMAPAndFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'+' @ [76:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'source' @ [76:36] ==> val source: SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'sourceFile' @ [76:43] ==> public final val sourceFile: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'replace' @ [76:54] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compiledData' @ [77:24] ==> val compiledData: Map<String, SMAPTestUtil.SMAPAndFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'ktFileName' @ [77:37] ==> val ktFileName: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'assertEquals' @ [78:20] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'ktFileName' @ [78:57] ==> val ktFileName: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'normalize' @ [78:70] ==> private final fun normalize(text: String?): String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil[SimpleFunctionDescriptorImpl]

'source' @ [78:80] ==> val source: SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'smap' @ [78:87] ==> public final val smap: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'normalize' @ [78:94] ==> private final fun normalize(text: String?): String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil[SimpleFunctionDescriptorImpl]

'data' @ [78:104] ==> val data: SMAPTestUtil.SMAPAndFile? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'smap' @ [78:110] ==> public final val smap: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'checkNoConflictMappings' @ [81:9] ==> private final fun checkNoConflictMappings(compiledSmap: List<SMAPTestUtil.SMAPAndFile>?): Unit defined in org.jetbrains.kotlin.codegen.SMAPTestUtil[SimpleFunctionDescriptorImpl]

'compiledSmaps' @ [81:33] ==> val compiledSmaps: List<SMAPTestUtil.SMAPAndFile> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkSMAP[LocalVariableDescriptor]

'compiledSmap' @ [85:13] ==> value-parameter compiledSmap: List<SMAPTestUtil.SMAPAndFile>? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings[ValueParameterDescriptorImpl]

'compiledSmap' @ [87:9] ==> value-parameter compiledSmap: List<SMAPTestUtil.SMAPAndFile>? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings[ValueParameterDescriptorImpl]

'mapNotNull' @ [87:22] ==> public inline fun <T, R : Any> Iterable<SMAPTestUtil.SMAPAndFile>.mapNotNull(transform: (SMAPTestUtil.SMAPAndFile) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SMAPAndFile
    <R : Any> -> String

'it' @ [87:35] ==> value-parameter it: SMAPTestUtil.SMAPAndFile defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>[ValueParameterDescriptorImpl]

'smap' @ [87:38] ==> public final val smap: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[PropertyDescriptorImpl]

'forEach' @ [87:45] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SMAPParser' @ [88:24] ==> public object SMAPParser defined in org.jetbrains.kotlin.codegen.inline[FakeCallableDescriptorForObject]

'parse' @ [88:35] ==> @JvmStatic public final fun parse(mappingInfo: String): SMAP defined in org.jetbrains.kotlin.codegen.inline.SMAPParser[DeserializedSimpleFunctionDescriptor]

'it' @ [88:41] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>[ValueParameterDescriptorImpl]

'smap' @ [89:36] ==> val smap: SMAP defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>[LocalVariableDescriptor]

'fileMappings' @ [89:41] ==> public final val fileMappings: List<FileMapping> defined in org.jetbrains.kotlin.codegen.inline.SMAP[DeserializedPropertyDescriptor]

'flatMap' @ [89:54] ==> public inline fun <T, R> Iterable<FileMapping>.flatMap(transform: (FileMapping) -> Iterable<Map.Entry<Int, RangeMapping>>): List<Map.Entry<Int, RangeMapping>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileMapping
    <R> -> Entry<Int, RangeMapping>

'fileMapping' @ [91:17] ==> value-parameter fileMapping: FileMapping defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lineMappings' @ [91:29] ==> public final val lineMappings: ArrayList<RangeMapping> /* = ArrayList<RangeMapping> */ defined in org.jetbrains.kotlin.codegen.inline.FileMapping[DeserializedPropertyDescriptor]

'flatMap' @ [91:42] ==> public inline fun <T, R> Iterable<RangeMapping>.flatMap(transform: (RangeMapping) -> Iterable<Map.Entry<Int, RangeMapping>>): List<Map.Entry<Int, RangeMapping>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeMapping
    <R> -> Entry<Int, RangeMapping>

'lineMapping' @ [93:21] ==> value-parameter lineMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toRange' @ [93:33] ==> public val RangeMapping.toRange: IntRange defined in org.jetbrains.kotlin.codegen.inline[DeserializedPropertyDescriptor]

'keysToMap' @ [93:41] ==> public fun <K, V> Iterable<Int>.keysToMap(value: (Int) -> RangeMapping): Map<Int, RangeMapping> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> RangeMapping

'lineMapping' @ [93:53] ==> value-parameter lineMapping: RangeMapping defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'entries' @ [93:67] ==> public abstract val entries: Set<Map.Entry<Int, RangeMapping>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'groupBy' @ [95:15] ==> public inline fun <T, K> Iterable<Map.Entry<Int, RangeMapping>>.groupBy(keySelector: (Map.Entry<Int, RangeMapping>) -> Int): Map<Int, List<Map.Entry<Int, RangeMapping>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<Int, RangeMapping>
    <K> -> Int

'it' @ [95:25] ==> value-parameter it: Map.Entry<Int, RangeMapping> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [95:28] ==> public abstract val key: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'entries' @ [95:34] ==> public abstract val entries: Set<Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'filter' @ [95:42] ==> public inline fun <T> Iterable<Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>>.filter(predicate: (Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>) -> Boolean): List<Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<Int, List<Entry<Int, RangeMapping>>>

'it' @ [95:51] ==> value-parameter it: Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [95:54] ==> public abstract val value: List<Map.Entry<Int, RangeMapping>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'size' @ [95:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertTrue' @ [98:20] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'conflictingLines' @ [99:21] ==> val conflictingLines: List<Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [99:38] ==> public fun <T> Iterable<Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<Int, List<Entry<Int, RangeMapping>>>

'it' @ [100:57] ==> value-parameter it: Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [100:60] ==> public abstract val key: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [100:70] ==> value-parameter it: Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [100:73] ==> public abstract val value: List<Map.Entry<Int, RangeMapping>> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'joinToString' @ [100:79] ==> public fun <T> Iterable<Map.Entry<Int, RangeMapping>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Map.Entry<Int, RangeMapping>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<Int, RangeMapping>

'it' @ [100:94] ==> value-parameter it: Map.Entry<Int, RangeMapping> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [100:97] ==> public open fun toString(): String defined in kotlin.collections.Map.Entry[DeserializedSimpleFunctionDescriptor]

'conflictingLines' @ [102:21] ==> val conflictingLines: List<Map.Entry<Int, List<Map.Entry<Int, RangeMapping>>>> defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.checkNoConflictMappings.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [102:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'text' @ [108:13] ==> value-parameter text: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.normalize[ValueParameterDescriptorImpl]

'let' @ [108:19] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'convertLineSeparators' @ [108:36] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'it' @ [108:58] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.normalize.<anonymous>[ValueParameterDescriptorImpl]

'trim' @ [108:61] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'SMAPAndFile' @ [113:21] ==> public constructor SMAPAndFile(smap: String?, sourceFile: String, outputFile: String) defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile[ClassConstructorDescriptorImpl]

'smap' @ [113:33] ==> value-parameter smap: String? defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion.SMAPAndFile[ValueParameterDescriptorImpl]

'getPath' @ [113:39] ==> public final fun getPath(file: File): String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion[SimpleFunctionDescriptorImpl]

'sourceFile' @ [113:47] ==> value-parameter sourceFile: File defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion.SMAPAndFile[ValueParameterDescriptorImpl]

'outputFile' @ [113:60] ==> value-parameter outputFile: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion.SMAPAndFile[ValueParameterDescriptorImpl]

'getPath' @ [116:24] ==> public final fun getPath(canonicalPath: String): String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion[SimpleFunctionDescriptorImpl]

'file' @ [116:32] ==> value-parameter file: File defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion.getPath[ValueParameterDescriptorImpl]

'canonicalPath' @ [116:37] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'toSystemIndependentName' @ [121:33] ==> @NotNull public open fun toSystemIndependentName(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'canonicalPath' @ [121:57] ==> value-parameter canonicalPath: String defined in org.jetbrains.kotlin.codegen.SMAPTestUtil.SMAPAndFile.Companion.getPath[ValueParameterDescriptorImpl]

'substringAfter' @ [121:72] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

