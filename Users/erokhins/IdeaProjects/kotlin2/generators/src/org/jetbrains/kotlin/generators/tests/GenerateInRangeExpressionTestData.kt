'File' @ [25:33] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [26:33] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'TEST_DATA_DIR' @ [26:38] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[PropertyDescriptorImpl]

'GenerateInRangeExpressionTestData' @ [28:57] ==> public object GenerateInRangeExpressionTestData defined in org.jetbrains.kotlin.generators.tests in file GenerateInRangeExpressionTestData.kt[FakeCallableDescriptorForObject]

'java' @ [28:98] ==> public val <T> KClass<GenerateInRangeExpressionTestData>.java: Class<GenerateInRangeExpressionTestData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenerateInRangeExpressionTestData

'simpleName' @ [28:103] ==> public final val <T : (Any..Any?)> Class<GenerateInRangeExpressionTestData>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> GenerateInRangeExpressionTestData

'PrintWriter' @ [36:9] ==> public constructor PrintWriter(p0: (File..File?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'File' @ [36:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'GENERATED_DIR' @ [36:26] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[PropertyDescriptorImpl]

'fileName' @ [36:41] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateMatrixTestCase[ValueParameterDescriptorImpl]

'use' @ [36:52] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintWriter.use(block: (PrintWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintWriter
    <R> -> Unit

'it' @ [37:13] ==> value-parameter it: PrintWriter defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateMatrixTestCase.<anonymous>[ValueParameterDescriptorImpl]

'generateTestCaseBody' @ [37:16] ==> private final fun PrintWriter.generateTestCaseBody(header: String, rangeExpressions: List<String>, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'header' @ [37:37] ==> value-parameter header: String = ... defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateMatrixTestCase[ValueParameterDescriptorImpl]

'rangeExpressions' @ [37:45] ==> value-parameter rangeExpressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateMatrixTestCase[ValueParameterDescriptorImpl]

'elementExpressions' @ [37:63] ==> value-parameter elementExpressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateMatrixTestCase[ValueParameterDescriptorImpl]

'println' @ [42:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'PREAMBLE_MESSAGE' @ [42:22] ==> private final val PREAMBLE_MESSAGE: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[PropertyDescriptorImpl]

'println' @ [43:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [44:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [45:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'header' @ [45:17] ==> value-parameter header: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[ValueParameterDescriptorImpl]

'println' @ [46:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateGlobalValDefinitions' @ [48:29] ==> private final fun PrintWriter.generateGlobalValDefinitions(expressions: List<String>, prefix: String): List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'rangeExpressions' @ [48:58] ==> value-parameter rangeExpressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[ValueParameterDescriptorImpl]

'generateGlobalValDefinitions' @ [50:31] ==> private final fun PrintWriter.generateGlobalValDefinitions(expressions: List<String>, prefix: String): List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'elementExpressions' @ [50:60] ==> value-parameter elementExpressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[ValueParameterDescriptorImpl]

'StringWriter' @ [52:29] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'PrintWriter' @ [53:35] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'testFunctions' @ [53:47] ==> val testFunctions: StringWriter defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[LocalVariableDescriptor]

'println' @ [55:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'rangeValNames' @ [56:9] ==> val rangeValNames: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[LocalVariableDescriptor]

'zip' @ [56:23] ==> public infix fun <T, R> Iterable<String>.zip(other: Iterable<String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'rangeExpressions' @ [56:27] ==> value-parameter rangeExpressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[ValueParameterDescriptorImpl]

'forEachIndexed' @ [56:45] ==> public inline fun <T> Iterable<Pair<String, String>>.forEachIndexed(action: (index: Int, Pair<String, String>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'component1' @ [56:66] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [56:80] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'elementValNames' @ [57:13] ==> val elementValNames: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[LocalVariableDescriptor]

'zip' @ [57:29] ==> public infix fun <T, R> Iterable<String>.zip(other: Iterable<String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'elementExpressions' @ [57:33] ==> value-parameter elementExpressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[ValueParameterDescriptorImpl]

'forEachIndexed' @ [57:53] ==> public inline fun <T> Iterable<Pair<String, String>>.forEachIndexed(action: (index: Int, Pair<String, String>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'component1' @ [57:74] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [57:90] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'i' @ [58:44] ==> value-parameter i: Int defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>[ValueParameterDescriptorImpl]

'j' @ [58:50] ==> value-parameter j: Int defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [60:17] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'functionName' @ [60:31] ==> val functionName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'testFunctionsWriter' @ [62:17] ==> val testFunctionsWriter: PrintWriter defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[LocalVariableDescriptor]

'generateTestCaseFunction' @ [62:37] ==> private final fun PrintWriter.generateTestCaseFunction(functionName: String, rangeValName: String, rangeExpression: String, elementValName: String, elementExpression: String): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'functionName' @ [62:62] ==> val functionName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rangeValName' @ [62:76] ==> val rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>[LocalVariableDescriptor]

'rangeExpression' @ [62:90] ==> val rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>[LocalVariableDescriptor]

'elementValName' @ [62:107] ==> val elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'elementExpression' @ [62:123] ==> val elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody.<anonymous>.<anonymous>[LocalVariableDescriptor]

'println' @ [65:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [66:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [67:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [68:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'testFunctions' @ [68:17] ==> val testFunctions: StringWriter defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseBody[LocalVariableDescriptor]

'toString' @ [68:31] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

'expressions' @ [72:24] ==> value-parameter expressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions[ValueParameterDescriptorImpl]

'indices' @ [72:36] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'map' @ [72:44] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> String

'prefix' @ [72:52] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions[ValueParameterDescriptorImpl]

'it' @ [72:59] ==> value-parameter it: Int defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'valNames' @ [73:9] ==> val valNames: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions[LocalVariableDescriptor]

'zip' @ [73:18] ==> public infix fun <T, R> Iterable<String>.zip(other: Iterable<String>): List<Pair<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'expressions' @ [73:22] ==> value-parameter expressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions[ValueParameterDescriptorImpl]

'forEach' @ [73:35] ==> @HidesMembers public inline fun <T> Iterable<Pair<String, String>>.forEach(action: (Pair<String, String>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, String>

'component1' @ [73:46] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [73:52] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'println' @ [73:67] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'name' @ [73:81] ==> val name: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions.<anonymous>[LocalVariableDescriptor]

'expression' @ [73:89] ==> val expression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions.<anonymous>[LocalVariableDescriptor]

'println' @ [74:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'valNames' @ [75:16] ==> val valNames: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateGlobalValDefinitions[LocalVariableDescriptor]

'println' @ [85:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'functionName' @ [85:23] ==> value-parameter functionName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [86:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [87:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementExpression' @ [87:27] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [87:49] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [87:69] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementExpression' @ [87:92] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [88:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementExpression' @ [88:27] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [88:50] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [88:71] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementExpression' @ [88:94] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [89:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementExpression' @ [89:29] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [89:51] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [89:73] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementExpression' @ [89:96] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [90:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementExpression' @ [90:29] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [90:52] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [90:73] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementExpression' @ [90:96] ==> value-parameter elementExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [91:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [92:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementValName' @ [92:27] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [92:46] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [92:66] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementValName' @ [92:89] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [93:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementValName' @ [93:27] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [93:47] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [93:68] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementValName' @ [93:91] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [94:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementValName' @ [94:29] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [94:48] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [94:70] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementValName' @ [94:93] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [95:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'elementValName' @ [95:29] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeExpression' @ [95:49] ==> value-parameter rangeExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'rangeValName' @ [95:70] ==> value-parameter rangeValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'elementValName' @ [95:93] ==> value-parameter elementValName: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateTestCaseFunction[ValueParameterDescriptorImpl]

'println' @ [96:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [97:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateMatrixTestCase' @ [107:9] ==> private final fun generateMatrixTestCase(fileName: String, rangeExpressions: List<String>, elementExpressions: List<String>, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'name' @ [108:17] ==> value-parameter name: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'listOf' @ [109:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'aExpression' @ [110:27] ==> value-parameter aExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'op' @ [110:40] ==> value-parameter op: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'bExpression' @ [110:44] ==> value-parameter bExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'bExpression' @ [111:27] ==> value-parameter bExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'op' @ [111:40] ==> value-parameter op: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'aExpression' @ [111:44] ==> value-parameter aExpression: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'elementExpressions' @ [113:17] ==> value-parameter elementExpressions: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.generateRangeOperatorTestCase[ValueParameterDescriptorImpl]

'JvmStatic' @ [117:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'!' @ [119:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'TEST_DATA_DIR' @ [119:14] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[PropertyDescriptorImpl]

'exists' @ [119:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'AssertionError' @ [119:44] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'TEST_DATA_DIR' @ [119:62] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[PropertyDescriptorImpl]

'path' @ [119:76] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'delete' @ [121:18] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'GENERATED_DIR' @ [121:25] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[PropertyDescriptorImpl]

'GENERATED_DIR' @ [122:9] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[PropertyDescriptorImpl]

'mkdirs' @ [122:23] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'listOf' @ [124:28] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [127:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'flatMap' @ [127:57] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'listOf' @ [128:21] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [128:30] ==> value-parameter it: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [128:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [128:61] ==> value-parameter it: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [128:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [128:83] ==> value-parameter it: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [128:100] ==> value-parameter it: String defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main.<anonymous>[ValueParameterDescriptorImpl]

'generateRangeOperatorTestCase' @ [131:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'charLiterals' @ [131:82] ==> val charLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [132:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'charLiterals' @ [132:78] ==> val charLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [133:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'charLiterals' @ [133:80] ==> val charLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [135:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'numericLiterals' @ [135:77] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [136:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'numericLiterals' @ [136:73] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [137:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'listOf' @ [137:75] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'generateRangeOperatorTestCase' @ [139:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'numericLiterals' @ [139:80] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [140:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'numericLiterals' @ [140:76] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [141:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'listOf' @ [141:78] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'generateRangeOperatorTestCase' @ [143:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'numericLiterals' @ [143:85] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateRangeOperatorTestCase' @ [145:9] ==> private final fun generateRangeOperatorTestCase(name: String, aExpression: String, op: String, bExpression: String, elementExpressions: List<String>): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'numericLiterals' @ [145:84] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'generateMatrixTestCase' @ [147:9] ==> private final fun generateMatrixTestCase(fileName: String, rangeExpressions: List<String>, elementExpressions: List<String>, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'listOf' @ [149:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'numericLiterals' @ [150:17] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'trimMargin' @ [155:21] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'generateMatrixTestCase' @ [158:9] ==> private final fun generateMatrixTestCase(fileName: String, rangeExpressions: List<String>, elementExpressions: List<String>, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'listOf' @ [160:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'numericLiterals' @ [161:17] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'trimMargin' @ [164:21] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'generateMatrixTestCase' @ [167:9] ==> private final fun generateMatrixTestCase(fileName: String, rangeExpressions: List<String>, elementExpressions: List<String>, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData[SimpleFunctionDescriptorImpl]

'listOf' @ [169:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'numericLiterals' @ [170:17] ==> val numericLiterals: List<String> defined in org.jetbrains.kotlin.generators.tests.GenerateInRangeExpressionTestData.main[LocalVariableDescriptor]

'trimMargin' @ [173:21] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

