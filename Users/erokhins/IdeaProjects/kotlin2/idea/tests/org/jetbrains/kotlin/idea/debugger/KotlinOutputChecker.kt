'OutputChecker' @ [33:48] ==> public constructor OutputChecker(p0: (String..String?), p1: (String..String?)) defined in com.intellij.debugger.impl.OutputChecker[JavaClassConstructorDescriptor]

'appPath' @ [33:62] ==> value-parameter appPath: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.<init>[ValueParameterDescriptorImpl]

'outputPath' @ [33:71] ==> value-parameter outputPath: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.<init>[ValueParameterDescriptorImpl]

'JvmStatic' @ [35:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getInstance' @ [36:34] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinOutputChecker' @ [36:46] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[FakeCallableDescriptorForObject]

'java' @ [36:73] ==> public val <T> KClass<KotlinOutputChecker>.java: Class<KotlinOutputChecker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinOutputChecker

'Regex' @ [43:48] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'Regex' @ [45:48] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'!=' @ [50:13] ==> public open fun equals(other: Any?): Boolean defined in java.lang.Exception[DeserializedSimpleFunctionDescriptor]

'ourErrorsOccurred' @ [50:24] ==> public final var ourErrorsOccurred: (Exception..Exception?) defined in com.intellij.idea.IdeaLogger[JavaPropertyDescriptor]

'ourErrorsOccurred' @ [51:30] ==> public final var ourErrorsOccurred: (Exception..Exception?) defined in com.intellij.idea.IdeaLogger[JavaPropertyDescriptor]

'preprocessBuffer' @ [54:22] ==> private final fun preprocessBuffer(buffer: String): String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[SimpleFunctionDescriptorImpl]

'buildOutputString' @ [54:39] ==> private final fun buildOutputString(): String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[SimpleFunctionDescriptorImpl]

'File' @ [56:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDir' @ [56:27] ==> private final val testDir: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[PropertyDescriptorImpl]

'File' @ [57:23] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outDir' @ [57:28] ==> val outDir: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'myTestName' @ [57:36] ==> protected/*protected and package*/ final var myTestName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[JavaPropertyDescriptor]

'!' @ [58:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outFile' @ [58:14] ==> var outFile: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'exists' @ [58:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'if (SystemInfo.isWindows) {
                val winOut = File(outDir, myTestName + ".win.out")
                if (winOut.exists()) {
                    outFile = winOut
                }
            }
            else if (SystemInfo.isUnix) {
                val unixOut = File(outDir, myTestName + ".unx.out")
                if (unixOut.exists()) {
                    outFile = unixOut
                }
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isWindows' @ [59:28] ==> public const final val isWindows: Boolean defined in com.intellij.openapi.util.SystemInfo[JavaPropertyDescriptor]

'File' @ [60:30] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outDir' @ [60:35] ==> val outDir: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'myTestName' @ [60:43] ==> protected/*protected and package*/ final var myTestName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[JavaPropertyDescriptor]

'winOut' @ [61:21] ==> val winOut: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'exists' @ [61:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'outFile' @ [62:21] ==> var outFile: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'winOut' @ [62:31] ==> val winOut: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'isUnix' @ [65:33] ==> public const final val isUnix: Boolean defined in com.intellij.openapi.util.SystemInfo[JavaPropertyDescriptor]

'File' @ [66:31] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outDir' @ [66:36] ==> val outDir: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'myTestName' @ [66:44] ==> protected/*protected and package*/ final var myTestName: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[JavaPropertyDescriptor]

'unixOut' @ [67:21] ==> val unixOut: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'exists' @ [67:29] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'outFile' @ [68:21] ==> var outFile: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'unixOut' @ [68:31] ==> val unixOut: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'if (!outFile.exists()) {
            FileUtil.writeToFile(outFile, actual)
            LOG.error("Test file created ${outFile.path}\n**************** Don't forget to put it into VCS! *******************")
        }
        else {
            val originalText = FileUtilRt.loadFile(outFile, CharsetToolkit.UTF8)
            val expected = StringUtilRt.convertLineSeparators(originalText)
            if (expected != actual) {
                println("expected:")
                println(originalText)
                println("actual:")
                println(actual)

                val len = Math.min(expected.length, actual.length)
                if (expected.length != actual.length) {
                    println("Text sizes differ: expected " + expected.length + " but actual: " + actual.length)
                }
                if (expected.length > len) {
                    println("Rest from expected text is: \"" + expected.substring(len) + "\"")
                }
                else if (actual.length > len) {
                    println("Rest from actual text is: \"" + actual.substring(len) + "\"")
                }

                Assert.assertEquals(originalText, actual)
            }
        }' @ [73:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [73:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outFile' @ [73:14] ==> var outFile: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'exists' @ [73:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'writeToFile' @ [74:22] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outFile' @ [74:34] ==> var outFile: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'actual' @ [74:43] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'LOG' @ [75:13] ==> @JvmStatic private final val LOG: Logger defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'error' @ [75:17] ==> public open fun error(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'outFile' @ [75:44] ==> var outFile: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'path' @ [75:52] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'loadFile' @ [78:43] ==> @NotNull public open fun loadFile(@NotNull p0: File, @Nullable @NonNls p1: String?): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'outFile' @ [78:52] ==> var outFile: File defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'UTF8' @ [78:76] ==> @NonNls public const final val UTF8: String defined in com.intellij.openapi.vfs.CharsetToolkit[JavaPropertyDescriptor]

'convertLineSeparators' @ [79:41] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtilRt[JavaMethodDescriptor]

'originalText' @ [79:63] ==> val originalText: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'expected' @ [80:17] ==> val expected: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'actual' @ [80:29] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'println' @ [81:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [82:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'originalText' @ [82:25] ==> val originalText: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'println' @ [83:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [84:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'actual' @ [84:25] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'min' @ [86:32] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'expected' @ [86:36] ==> val expected: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [86:45] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'actual' @ [86:53] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [86:60] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'expected' @ [87:21] ==> val expected: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [87:30] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'actual' @ [87:40] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [87:47] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'println' @ [88:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [88:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expected' @ [88:62] ==> val expected: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [88:71] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'actual' @ [88:98] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [88:105] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'if (expected.length > len) {
                    println("Rest from expected text is: \"" + expected.substring(len) + "\"")
                }
                else if (actual.length > len) {
                    println("Rest from actual text is: \"" + actual.substring(len) + "\"")
                }' @ [90:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expected' @ [90:21] ==> val expected: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [90:30] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'len' @ [90:39] ==> val len: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'println' @ [91:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [91:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'expected' @ [91:64] ==> val expected: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'substring' @ [91:73] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'len' @ [91:83] ==> val len: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'actual' @ [93:26] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'length' @ [93:33] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'len' @ [93:42] ==> val len: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'println' @ [94:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [94:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'actual' @ [94:62] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'substring' @ [94:69] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'len' @ [94:79] ==> val len: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'assertEquals' @ [97:24] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'originalText' @ [97:37] ==> val originalText: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'actual' @ [97:51] ==> val actual: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.checkValid[LocalVariableDescriptor]

'buffer' @ [103:21] ==> value-parameter buffer: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[ValueParameterDescriptorImpl]

'lines' @ [103:28] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toMutableList' @ [103:36] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'lines' @ [105:30] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'indexOfFirst' @ [105:36] ==> public inline fun <T> List<String>.indexOfFirst(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [105:51] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [105:54] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CONNECT_PREFIX' @ [105:65] ==> private final val CONNECT_PREFIX: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'lines' @ [106:9] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'connectedIndex' @ [106:15] ==> val connectedIndex: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'CONNECT_PREFIX' @ [106:33] ==> private final val CONNECT_PREFIX: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'connectedIndex' @ [108:31] ==> val connectedIndex: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'lines' @ [109:9] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'runCommandIndex' @ [109:15] ==> val runCommandIndex: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'RUN_JAVA' @ [109:34] ==> private final val RUN_JAVA: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'lines' @ [111:33] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'indexOfFirst' @ [111:39] ==> public inline fun <T> List<String>.indexOfFirst(predicate: (String) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [111:54] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [111:57] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'DISCONNECT_PREFIX' @ [111:68] ==> private final val DISCONNECT_PREFIX: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'lines' @ [112:9] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'disconnectedIndex' @ [112:15] ==> val disconnectedIndex: Int defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'DISCONNECT_PREFIX' @ [112:36] ==> private final val DISCONNECT_PREFIX: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'lines' @ [114:16] ==> val lines: MutableList<String> defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer[LocalVariableDescriptor]

'filter' @ [114:22] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!' @ [114:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [114:33] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [114:36] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JDI_BUG_OUTPUT_PATTERN_1' @ [114:44] ==> private final val JDI_BUG_OUTPUT_PATTERN_1: Regex defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'it' @ [114:73] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.preprocessBuffer.<anonymous>[ValueParameterDescriptorImpl]

'matches' @ [114:76] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JDI_BUG_OUTPUT_PATTERN_2' @ [114:84] ==> private final val JDI_BUG_OUTPUT_PATTERN_2: Regex defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.Companion[PropertyDescriptorImpl]

'joinToString' @ [114:113] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'OutputChecker' @ [119:17] ==> public constructor OutputChecker(p0: (String..String?), p1: (String..String?)) defined in com.intellij.debugger.impl.OutputChecker[JavaClassConstructorDescriptor]

'java' @ [119:38] ==> public val <T> KClass<OutputChecker>.java: Class<OutputChecker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> OutputChecker

'getDeclaredMethod' @ [119:43] ==> @CallerSensitive public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'm' @ [120:28] ==> val m: Method defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.buildOutputString[LocalVariableDescriptor]

'isAccessible' @ [120:30] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'm' @ [123:13] ==> val m: Method defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.buildOutputString[LocalVariableDescriptor]

'isAccessible' @ [123:15] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'm' @ [124:20] ==> val m: Method defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.buildOutputString[LocalVariableDescriptor]

'invoke' @ [124:22] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'this' @ [124:29] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker[LazyClassReceiverParameterDescriptor]

'm' @ [127:13] ==> val m: Method defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.buildOutputString[LocalVariableDescriptor]

'isAccessible' @ [127:15] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'isAccessible' @ [127:30] ==> val isAccessible: Boolean defined in org.jetbrains.kotlin.idea.debugger.KotlinOutputChecker.buildOutputString[LocalVariableDescriptor]

