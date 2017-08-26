'hashSetOf' @ [27:55] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'hashSetOf' @ [28:53] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'arrayListOf' @ [29:50] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'compileErrors' @ [32:17] ==> public final val compileErrors: MutableList<String> defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'isEmpty' @ [32:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'mutableListOf' @ [37:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<MutableList<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<String>

'lines' @ [39:22] ==> value-parameter lines: List<String> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.splitSteps[ValueParameterDescriptorImpl]

'when {
                line.matches("=+ Step #\\d+ =+".toRegex()) -> {
                    stepsLines.add(mutableListOf())
                }
                else -> {
                    stepsLines.lastOrNull()?.add(line)
                }
            }' @ [40:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean?, entry1: Boolean?): Boolean?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean?

'line' @ [41:17] ==> val line: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.splitSteps[LocalVariableDescriptor]

'matches' @ [41:22] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [41:49] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'stepsLines' @ [42:21] ==> val stepsLines: MutableList<MutableList<String>> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.splitSteps[LocalVariableDescriptor]

'add' @ [42:32] ==> public abstract fun add(element: MutableList<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'mutableListOf' @ [42:36] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stepsLines' @ [45:21] ==> val stepsLines: MutableList<MutableList<String>> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.splitSteps[LocalVariableDescriptor]

'lastOrNull' @ [45:32] ==> public fun <T> List<MutableList<String>>.lastOrNull(): MutableList<String>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<String>

'add' @ [45:46] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'line' @ [45:50] ==> val line: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.splitSteps[LocalVariableDescriptor]

'stepsLines' @ [50:16] ==> val stepsLines: MutableList<MutableList<String>> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.splitSteps[LocalVariableDescriptor]

'stepLines' @ [56:22] ==> value-parameter stepLines: List<String> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[ValueParameterDescriptorImpl]

'line' @ [57:17] ==> val line: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'startsWith' @ [57:22] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BEGIN_COMPILED_FILES' @ [57:33] ==> private const val BEGIN_COMPILED_FILES: String defined in org.jetbrains.kotlin.incremental in file testLogsParsingUtil.kt[PropertyDescriptorImpl]

'readFiles' @ [58:17] ==> var readFiles: Boolean defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'readFiles' @ [62:17] ==> var readFiles: Boolean defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'line' @ [62:30] ==> val line: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'startsWith' @ [62:35] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'END_COMPILED_FILES' @ [62:46] ==> private const val END_COMPILED_FILES: String defined in org.jetbrains.kotlin.incremental in file testLogsParsingUtil.kt[PropertyDescriptorImpl]

'readFiles' @ [63:17] ==> var readFiles: Boolean defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'readFiles' @ [67:17] ==> var readFiles: Boolean defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'normalize' @ [68:37] ==> @NotNull public open fun normalize(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'line' @ [68:47] ==> val line: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'trim' @ [68:52] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (path.endsWith(".kt")) {
                    compiledKotlinFiles.add(path)
                }
                else if (path.endsWith(".java")) {
                    compiledJavaFiles.add(path)
                }
                else {
                    throw IllegalStateException("Expected .kt or .java file, got: $path")
                }' @ [70:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'path' @ [70:21] ==> val path: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'endsWith' @ [70:26] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compiledKotlinFiles' @ [71:21] ==> public final val compiledKotlinFiles: MutableSet<String> defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'add' @ [71:41] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'path' @ [71:45] ==> val path: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'if (path.endsWith(".java")) {
                    compiledJavaFiles.add(path)
                }
                else {
                    throw IllegalStateException("Expected .kt or .java file, got: $path")
                }' @ [73:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'path' @ [73:26] ==> val path: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'endsWith' @ [73:31] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compiledJavaFiles' @ [74:21] ==> public final val compiledJavaFiles: MutableSet<String> defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'add' @ [74:39] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'path' @ [74:43] ==> val path: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'IllegalStateException' @ [77:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'path' @ [77:84] ==> val path: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseStepCompiledFiles[LocalVariableDescriptor]

'stepLines' @ [84:26] ==> value-parameter stepLines: List<String> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseErrors[ValueParameterDescriptorImpl]

'indexOfLast' @ [84:36] ==> public inline fun <T> List<String>.indexOfLast(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [84:50] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseErrors.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [84:53] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BEGIN_ERRORS' @ [84:64] ==> private const val BEGIN_ERRORS: String defined in org.jetbrains.kotlin.incremental in file testLogsParsingUtil.kt[PropertyDescriptorImpl]

'startIndex' @ [86:13] ==> val startIndex: Int defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseErrors[LocalVariableDescriptor]

'compileErrors' @ [87:13] ==> public final val compileErrors: MutableList<String> defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'addAll' @ [87:27] ==> public abstract fun addAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'stepLines' @ [87:34] ==> value-parameter stepLines: List<String> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseErrors[ValueParameterDescriptorImpl]

'subList' @ [87:44] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<String> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'startIndex' @ [87:52] ==> val startIndex: Int defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseErrors[LocalVariableDescriptor]

'stepLines' @ [87:68] ==> value-parameter stepLines: List<String> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.parseErrors[ValueParameterDescriptorImpl]

'size' @ [87:78] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'splitSteps' @ [91:22] ==> local final fun splitSteps(lines: List<String>): List<List<String>> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog[SimpleFunctionDescriptorImpl]

'file' @ [91:33] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.parseTestBuildLog[ValueParameterDescriptorImpl]

'readLines' @ [91:38] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'stepsLines' @ [94:12] ==> val stepsLines: List<List<String>> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog[LocalVariableDescriptor]

'map' @ [94:23] ==> public inline fun <T, R> Iterable<List<String>>.map(transform: (List<String>) -> BuildStep): List<BuildStep> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> BuildStep

'BuildStep' @ [95:25] ==> public constructor BuildStep(compiledKotlinFiles: MutableSet<String> = ..., compiledJavaFiles: MutableSet<String> = ..., compileErrors: MutableList<String> = ...) defined in org.jetbrains.kotlin.incremental.BuildStep[ClassConstructorDescriptorImpl]

'buildStep' @ [96:9] ==> val buildStep: BuildStep defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.<anonymous>[LocalVariableDescriptor]

'parseStepCompiledFiles' @ [96:19] ==> local final fun BuildStep.parseStepCompiledFiles(stepLines: List<String>): Unit defined in org.jetbrains.kotlin.incremental.parseTestBuildLog[SimpleFunctionDescriptorImpl]

'stepLines' @ [96:42] ==> value-parameter stepLines: List<String> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.<anonymous>[ValueParameterDescriptorImpl]

'buildStep' @ [97:9] ==> val buildStep: BuildStep defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.<anonymous>[LocalVariableDescriptor]

'parseErrors' @ [97:19] ==> local final fun BuildStep.parseErrors(stepLines: List<String>): Unit defined in org.jetbrains.kotlin.incremental.parseTestBuildLog[SimpleFunctionDescriptorImpl]

'stepLines' @ [97:31] ==> value-parameter stepLines: List<String> defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.<anonymous>[ValueParameterDescriptorImpl]

'buildStep' @ [98:9] ==> val buildStep: BuildStep defined in org.jetbrains.kotlin.incremental.parseTestBuildLog.<anonymous>[LocalVariableDescriptor]

'Suppress' @ [103:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'StringBuilder' @ [105:14] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'component1' @ [107:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [107:14] ==> public final operator fun component2(): BuildStep defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'buildSteps' @ [107:23] ==> value-parameter buildSteps: Iterable<BuildStep> defined in org.jetbrains.kotlin.incremental.dumpBuildLog[ValueParameterDescriptorImpl]

'withIndex' @ [107:34] ==> public fun <T> Iterable<BuildStep>.withIndex(): Iterable<IndexedValue<BuildStep>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BuildStep

'i' @ [108:13] ==> val i: Int defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'sb' @ [109:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [109:16] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sb' @ [112:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [112:12] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [112:47] ==> val i: Int defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'sb' @ [113:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [113:12] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sb' @ [114:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [114:12] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BEGIN_COMPILED_FILES' @ [114:21] ==> private const val BEGIN_COMPILED_FILES: String defined in org.jetbrains.kotlin.incremental in file testLogsParsingUtil.kt[PropertyDescriptorImpl]

'step' @ [115:9] ==> val step: BuildStep defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'compiledKotlinFiles' @ [115:14] ==> public final val compiledKotlinFiles: MutableSet<String> defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'sorted' @ [115:34] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'forEach' @ [115:43] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sb' @ [115:53] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [115:56] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [115:65] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.dumpBuildLog.<anonymous>[ValueParameterDescriptorImpl]

'step' @ [116:9] ==> val step: BuildStep defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'compiledJavaFiles' @ [116:14] ==> public final val compiledJavaFiles: MutableSet<String> defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'sorted' @ [116:32] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'forEach' @ [116:41] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sb' @ [116:51] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [116:54] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [116:63] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.dumpBuildLog.<anonymous>[ValueParameterDescriptorImpl]

'sb' @ [117:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [117:12] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'END_COMPILED_FILES' @ [117:21] ==> private const val END_COMPILED_FILES: String defined in org.jetbrains.kotlin.incremental in file testLogsParsingUtil.kt[PropertyDescriptorImpl]

'sb' @ [118:9] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [118:12] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [120:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'step' @ [120:14] ==> val step: BuildStep defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'compileSucceeded' @ [120:19] ==> public final val compileSucceeded: Boolean defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'sb' @ [121:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [121:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BEGIN_ERRORS' @ [121:25] ==> private const val BEGIN_ERRORS: String defined in org.jetbrains.kotlin.incremental in file testLogsParsingUtil.kt[PropertyDescriptorImpl]

'step' @ [122:13] ==> val step: BuildStep defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'compileErrors' @ [122:18] ==> public final val compileErrors: MutableList<String> defined in org.jetbrains.kotlin.incremental.BuildStep[PropertyDescriptorImpl]

'forEach' @ [122:32] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sb' @ [122:42] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'appendln' @ [122:45] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [122:54] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.dumpBuildLog.<anonymous>[ValueParameterDescriptorImpl]

'sb' @ [126:12] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.incremental.dumpBuildLog[LocalVariableDescriptor]

'toString' @ [126:15] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

