'File' @ [24:33] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [25:33] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'TEST_DATA_DIR' @ [25:38] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'this' @ [27:57] ==> <this> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[LazyClassReceiverParameterDescriptor]

'java' @ [27:69] ==> public val <T> KClass<out GeneratePrimitiveVsObjectEqualityTestData>.java: Class<out GeneratePrimitiveVsObjectEqualityTestData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out GeneratePrimitiveVsObjectEqualityTestData)

'simpleName' @ [27:74] ==> public final val <T : (Any..Any?)> Class<out GeneratePrimitiveVsObjectEqualityTestData>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out GeneratePrimitiveVsObjectEqualityTestData)

'PrintWriter' @ [30:9] ==> public constructor PrintWriter(p0: (File..File?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'File' @ [30:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'GENERATED_DIR' @ [30:26] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'type' @ [30:59] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTest[ValueParameterDescriptorImpl]

'use' @ [30:70] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintWriter.use(block: (PrintWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintWriter
    <R> -> Unit

'it' @ [31:13] ==> value-parameter it: PrintWriter defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTest.<anonymous>[ValueParameterDescriptorImpl]

'generateBoxedVsPrimitiveTestBody' @ [31:16] ==> private final fun PrintWriter.generateBoxedVsPrimitiveTestBody(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [31:49] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTest[ValueParameterDescriptorImpl]

'x' @ [31:55] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTest[ValueParameterDescriptorImpl]

'y' @ [31:58] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTest[ValueParameterDescriptorImpl]

'println' @ [36:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'PREAMBLE_MESSAGE' @ [36:22] ==> private final val PREAMBLE_MESSAGE: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'println' @ [37:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateGlobalVals' @ [38:9] ==> private final fun PrintWriter.generateGlobalVals(type: String, x: String, y: String, boxedType: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [38:28] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'x' @ [38:34] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'y' @ [38:37] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'println' @ [39:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [40:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateLocalVals' @ [41:9] ==> private final fun PrintWriter.generateLocalVals(type: String, x: String, y: String, boxedType: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [41:27] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'x' @ [41:33] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'y' @ [41:36] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'println' @ [42:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [44:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateFailureClauses' @ [46:9] ==> private final fun PrintWriter.generateFailureClauses(vararg failures: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalLeft' @ [47:18] ==> private final fun failuresForEqualAndUnequalLeft(lhs: String, equalRhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [47:55] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'y' @ [47:58] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'failuresForEqualAndUnequalLeft' @ [48:18] ==> private final fun failuresForEqualAndUnequalLeft(lhs: String, equalRhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalLeft' @ [49:18] ==> private final fun failuresForUnequalLeft(lhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [49:47] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'failuresForUnequalLeft' @ [50:18] ==> private final fun failuresForUnequalLeft(lhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalLeft' @ [51:18] ==> private final fun failuresForEqualAndUnequalLeft(lhs: String, equalRhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [51:55] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'y' @ [51:58] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'failuresForEqualAndUnequalLeft' @ [52:18] ==> private final fun failuresForEqualAndUnequalLeft(lhs: String, equalRhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalLeft' @ [53:18] ==> private final fun failuresForEqualAndUnequalLeft(lhs: String, equalRhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalLeft' @ [54:18] ==> private final fun failuresForUnequalLeft(lhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [54:47] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateBoxedVsPrimitiveTestBody[ValueParameterDescriptorImpl]

'failuresForUnequalLeft' @ [55:18] ==> private final fun failuresForUnequalLeft(lhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalLeft' @ [56:18] ==> private final fun failuresForUnequalLeft(lhs: String, unequalRhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'println' @ [59:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [60:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [61:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'arrayOf' @ [65:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'lhs' @ [66:23] ==> value-parameter lhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'equalRhs' @ [66:31] ==> value-parameter equalRhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'lhs' @ [67:23] ==> value-parameter lhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'unequalRhs' @ [67:31] ==> value-parameter unequalRhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'lhs' @ [68:25] ==> value-parameter lhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'equalRhs' @ [68:33] ==> value-parameter equalRhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'lhs' @ [69:25] ==> value-parameter lhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'unequalRhs' @ [69:33] ==> value-parameter unequalRhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalLeft[ValueParameterDescriptorImpl]

'arrayOf' @ [73:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'lhs' @ [74:23] ==> value-parameter lhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalLeft[ValueParameterDescriptorImpl]

'unequalRhs' @ [74:31] ==> value-parameter unequalRhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalLeft[ValueParameterDescriptorImpl]

'lhs' @ [75:25] ==> value-parameter lhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalLeft[ValueParameterDescriptorImpl]

'unequalRhs' @ [75:33] ==> value-parameter unequalRhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalLeft[ValueParameterDescriptorImpl]

'type' @ [78:105] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'println' @ [79:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'boxedType' @ [79:31] ==> value-parameter boxedType: String = ... defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'x' @ [79:44] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'println' @ [80:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'boxedType' @ [80:31] ==> value-parameter boxedType: String = ... defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'println' @ [81:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'type' @ [81:31] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'x' @ [81:39] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'println' @ [82:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'type' @ [82:31] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'y' @ [82:39] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateLocalVals[ValueParameterDescriptorImpl]

'type' @ [85:106] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'println' @ [86:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'boxedType' @ [86:27] ==> value-parameter boxedType: String = ... defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'x' @ [86:40] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'println' @ [87:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'boxedType' @ [87:27] ==> value-parameter boxedType: String = ... defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'println' @ [88:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'type' @ [88:26] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'x' @ [88:34] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'println' @ [89:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'type' @ [89:26] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'y' @ [89:34] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateGlobalVals[ValueParameterDescriptorImpl]

'failures' @ [93:9] ==> value-parameter vararg failures: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateFailureClauses[ValueParameterDescriptorImpl]

'forEachIndexed' @ [93:18] ==> public inline fun <T> Array<out String>.forEachIndexed(action: (index: Int, String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'println' @ [94:13] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'condition' @ [94:31] ==> value-parameter condition: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateFailureClauses.<anonymous>[ValueParameterDescriptorImpl]

'i' @ [94:52] ==> value-parameter i: Int defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generateFailureClauses.<anonymous>[ValueParameterDescriptorImpl]

'PrintWriter' @ [99:9] ==> public constructor PrintWriter(p0: (File..File?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'File' @ [99:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'GENERATED_DIR' @ [99:26] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'type' @ [99:59] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTest[ValueParameterDescriptorImpl]

'use' @ [99:70] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintWriter.use(block: (PrintWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintWriter
    <R> -> Unit

'it' @ [100:13] ==> value-parameter it: PrintWriter defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTest.<anonymous>[ValueParameterDescriptorImpl]

'generatePrimitiveVsBoxedTestBody' @ [100:16] ==> private final fun PrintWriter.generatePrimitiveVsBoxedTestBody(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [100:49] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTest[ValueParameterDescriptorImpl]

'x' @ [100:55] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTest[ValueParameterDescriptorImpl]

'y' @ [100:58] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTest[ValueParameterDescriptorImpl]

'println' @ [105:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'PREAMBLE_MESSAGE' @ [105:22] ==> private final val PREAMBLE_MESSAGE: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'println' @ [106:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateGlobalVals' @ [108:9] ==> private final fun PrintWriter.generateGlobalVals(type: String, x: String, y: String, boxedType: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [108:28] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'x' @ [108:34] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'y' @ [108:37] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'println' @ [109:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [110:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateLocalVals' @ [111:9] ==> private final fun PrintWriter.generateLocalVals(type: String, x: String, y: String, boxedType: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [111:27] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'x' @ [111:33] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'y' @ [111:36] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'println' @ [112:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [114:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateFailureClauses' @ [116:9] ==> private final fun PrintWriter.generateFailureClauses(vararg failures: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [117:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [117:50] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'y' @ [117:53] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [118:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalRight' @ [119:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [119:42] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'failuresForUnequalRight' @ [120:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [121:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [121:50] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'y' @ [121:53] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [122:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [123:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalRight' @ [124:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [124:42] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsBoxedTestBody[ValueParameterDescriptorImpl]

'failuresForUnequalRight' @ [125:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalRight' @ [126:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'println' @ [129:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [130:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [131:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'PrintWriter' @ [135:9] ==> public constructor PrintWriter(p0: (File..File?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'File' @ [135:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'GENERATED_DIR' @ [135:26] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'type' @ [135:60] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest[ValueParameterDescriptorImpl]

'use' @ [135:71] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintWriter.use(block: (PrintWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintWriter
    <R> -> Unit

'header' @ [136:17] ==> value-parameter header: String = ... defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest[ValueParameterDescriptorImpl]

'isNotBlank' @ [136:24] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [136:38] ==> value-parameter it: PrintWriter defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest.<anonymous>[ValueParameterDescriptorImpl]

'println' @ [136:41] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'header' @ [136:49] ==> value-parameter header: String = ... defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest[ValueParameterDescriptorImpl]

'it' @ [137:13] ==> value-parameter it: PrintWriter defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest.<anonymous>[ValueParameterDescriptorImpl]

'generatePrimitiveVsObjectTestBody' @ [137:16] ==> private final fun PrintWriter.generatePrimitiveVsObjectTestBody(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [137:50] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest[ValueParameterDescriptorImpl]

'x' @ [137:56] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest[ValueParameterDescriptorImpl]

'y' @ [137:59] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTest[ValueParameterDescriptorImpl]

'println' @ [142:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'PREAMBLE_MESSAGE' @ [142:22] ==> private final val PREAMBLE_MESSAGE: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'println' @ [143:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateGlobalVals' @ [145:9] ==> private final fun PrintWriter.generateGlobalVals(type: String, x: String, y: String, boxedType: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [145:28] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'x' @ [145:34] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'y' @ [145:37] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'println' @ [146:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [147:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateLocalVals' @ [148:9] ==> private final fun PrintWriter.generateLocalVals(type: String, x: String, y: String, boxedType: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'type' @ [148:27] ==> value-parameter type: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'x' @ [148:33] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'y' @ [148:36] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'println' @ [149:9] ==> public open fun println(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [151:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'generateFailureClauses' @ [153:9] ==> private final fun PrintWriter.generateFailureClauses(vararg failures: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [154:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [154:50] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'y' @ [154:53] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [155:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalRight' @ [156:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [156:42] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'failuresForUnequalRight' @ [157:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [158:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [158:50] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'y' @ [158:53] ==> value-parameter y: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [159:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForEqualAndUnequalRight' @ [160:18] ==> private final fun failuresForEqualAndUnequalRight(equalLhs: String, unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalRight' @ [161:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'x' @ [161:42] ==> value-parameter x: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.generatePrimitiveVsObjectTestBody[ValueParameterDescriptorImpl]

'failuresForUnequalRight' @ [162:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'failuresForUnequalRight' @ [163:18] ==> private final fun failuresForUnequalRight(unequalLhs: String, rhs: String): Array<String> defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'println' @ [166:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [167:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'println' @ [168:9] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'arrayOf' @ [172:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'equalLhs' @ [173:23] ==> value-parameter equalLhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'rhs' @ [173:36] ==> value-parameter rhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'unequalLhs' @ [174:23] ==> value-parameter unequalLhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'rhs' @ [174:38] ==> value-parameter rhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'equalLhs' @ [175:25] ==> value-parameter equalLhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'rhs' @ [175:38] ==> value-parameter rhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'unequalLhs' @ [176:25] ==> value-parameter unequalLhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'rhs' @ [176:40] ==> value-parameter rhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForEqualAndUnequalRight[ValueParameterDescriptorImpl]

'arrayOf' @ [180:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'unequalLhs' @ [181:23] ==> value-parameter unequalLhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalRight[ValueParameterDescriptorImpl]

'rhs' @ [181:38] ==> value-parameter rhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalRight[ValueParameterDescriptorImpl]

'unequalLhs' @ [182:25] ==> value-parameter unequalLhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalRight[ValueParameterDescriptorImpl]

'rhs' @ [182:40] ==> value-parameter rhs: String defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData.failuresForUnequalRight[ValueParameterDescriptorImpl]

'JvmStatic' @ [186:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'!' @ [188:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'TEST_DATA_DIR' @ [188:14] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'exists' @ [188:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'AssertionError' @ [188:44] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'TEST_DATA_DIR' @ [188:62] ==> private final val TEST_DATA_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'path' @ [188:76] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'delete' @ [190:18] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'GENERATED_DIR' @ [190:25] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'GENERATED_DIR' @ [191:9] ==> private final val GENERATED_DIR: File defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[PropertyDescriptorImpl]

'mkdirs' @ [191:23] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'generateBoxedVsPrimitiveTest' @ [193:9] ==> private final fun generateBoxedVsPrimitiveTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generateBoxedVsPrimitiveTest' @ [194:9] ==> private final fun generateBoxedVsPrimitiveTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generateBoxedVsPrimitiveTest' @ [195:9] ==> private final fun generateBoxedVsPrimitiveTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generateBoxedVsPrimitiveTest' @ [196:9] ==> private final fun generateBoxedVsPrimitiveTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generateBoxedVsPrimitiveTest' @ [197:9] ==> private final fun generateBoxedVsPrimitiveTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generateBoxedVsPrimitiveTest' @ [198:9] ==> private final fun generateBoxedVsPrimitiveTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsBoxedTest' @ [200:9] ==> private final fun generatePrimitiveVsBoxedTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsBoxedTest' @ [201:9] ==> private final fun generatePrimitiveVsBoxedTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsBoxedTest' @ [202:9] ==> private final fun generatePrimitiveVsBoxedTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsBoxedTest' @ [203:9] ==> private final fun generatePrimitiveVsBoxedTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsBoxedTest' @ [204:9] ==> private final fun generatePrimitiveVsBoxedTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsBoxedTest' @ [205:9] ==> private final fun generatePrimitiveVsBoxedTest(type: String, x: String, y: String): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsObjectTest' @ [207:9] ==> private final fun generatePrimitiveVsObjectTest(type: String, x: String, y: String, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsObjectTest' @ [208:9] ==> private final fun generatePrimitiveVsObjectTest(type: String, x: String, y: String, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsObjectTest' @ [209:9] ==> private final fun generatePrimitiveVsObjectTest(type: String, x: String, y: String, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsObjectTest' @ [210:9] ==> private final fun generatePrimitiveVsObjectTest(type: String, x: String, y: String, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsObjectTest' @ [211:9] ==> private final fun generatePrimitiveVsObjectTest(type: String, x: String, y: String, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

'generatePrimitiveVsObjectTest' @ [212:9] ==> private final fun generatePrimitiveVsObjectTest(type: String, x: String, y: String, header: String = ...): Unit defined in org.jetbrains.kotlin.generators.tests.GeneratePrimitiveVsObjectEqualityTestData[SimpleFunctionDescriptorImpl]

