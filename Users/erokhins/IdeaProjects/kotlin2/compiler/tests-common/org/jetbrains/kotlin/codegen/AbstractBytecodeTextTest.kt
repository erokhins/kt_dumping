'CodegenTestCase' @ [30:43] ==> public constructor CodegenTestCase() defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaClassConstructorDescriptor]

'Throws' @ [32:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [32:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'createEnvironmentWithMockJdkAndIdeaAnnotations' @ [34:9] ==> protected/*protected and package*/ final fun createEnvironmentWithMockJdkAndIdeaAnnotations(@NotNull configurationKind: ConfigurationKind, @NotNull testFilesWithConfigurationDirectives: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>), @Nullable vararg javaSourceRoots: (File..File?)): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest[JavaMethodDescriptor]

'ALL' @ [34:74] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'files' @ [34:79] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[ValueParameterDescriptorImpl]

'javaFilesDir' @ [34:86] ==> value-parameter javaFilesDir: File? defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[ValueParameterDescriptorImpl]

'loadMultiFiles' @ [35:9] ==> protected/*protected and package*/ open fun loadMultiFiles(@NotNull files: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>)): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest[JavaMethodDescriptor]

'files' @ [35:24] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[ValueParameterDescriptorImpl]

'if (isMultiFileTest(files) && !InTextDirectivesUtils.isDirectiveDefined(wholeFile.readText(), "TREAT_AS_ONE_FILE")) {
            doTestMultiFile(files)
        }
        else {
            val expected = readExpectedOccurrences(wholeFile.path)
            val actual = generateToText()
            checkGeneratedTextAgainstExpectedOccurrences(actual, expected)
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isMultiFileTest' @ [37:13] ==> private final fun isMultiFileTest(files: List<CodegenTestCase.TestFile>): Boolean defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[SimpleFunctionDescriptorImpl]

'files' @ [37:29] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[ValueParameterDescriptorImpl]

'!' @ [37:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDirectiveDefined' @ [37:62] ==> public open fun isDirectiveDefined(fileText: (String..String?), directive: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'wholeFile' @ [37:81] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[ValueParameterDescriptorImpl]

'readText' @ [37:91] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'doTestMultiFile' @ [38:13] ==> @Throws private final fun doTestMultiFile(files: List<CodegenTestCase.TestFile>): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest[SimpleFunctionDescriptorImpl]

'files' @ [38:29] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[ValueParameterDescriptorImpl]

'readExpectedOccurrences' @ [41:28] ==> @Throws protected final fun readExpectedOccurrences(filename: String): List<AbstractBytecodeTextTest.OccurrenceInfo> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest[SimpleFunctionDescriptorImpl]

'wholeFile' @ [41:52] ==> value-parameter wholeFile: File defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[ValueParameterDescriptorImpl]

'path' @ [41:62] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'generateToText' @ [42:26] ==> @NotNull protected/*protected and package*/ open fun generateToText(): String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest[JavaMethodDescriptor]

'checkGeneratedTextAgainstExpectedOccurrences' @ [43:13] ==> public final fun checkGeneratedTextAgainstExpectedOccurrences(text: String, expectedOccurrences: List<AbstractBytecodeTextTest.OccurrenceInfo>): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[SimpleFunctionDescriptorImpl]

'actual' @ [43:58] ==> val actual: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[LocalVariableDescriptor]

'expected' @ [43:66] ==> val expected: List<AbstractBytecodeTextTest.OccurrenceInfo> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doMultiFileTest[LocalVariableDescriptor]

'Throws' @ [47:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [47:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'LinkedHashMap' @ [49:47] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> List<OccurrenceInfo>

'files' @ [50:22] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[ValueParameterDescriptorImpl]

'readExpectedOccurrencesForMultiFileTest' @ [51:13] ==> private final fun readExpectedOccurrencesForMultiFileTest(file: CodegenTestCase.TestFile, occurrenceMap: MutableMap<String, List<AbstractBytecodeTextTest.OccurrenceInfo>>): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[SimpleFunctionDescriptorImpl]

'file' @ [51:53] ==> val file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'expectedOccurrencesByOutputFile' @ [51:59] ==> val expectedOccurrencesByOutputFile: LinkedHashMap<String, List<AbstractBytecodeTextTest.OccurrenceInfo>> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'generateEachFileToText' @ [54:25] ==> @NotNull protected/*protected and package*/ open fun generateEachFileToText(): (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest[JavaMethodDescriptor]

'expectedOccurrencesByOutputFile' @ [55:36] ==> val expectedOccurrencesByOutputFile: LinkedHashMap<String, List<AbstractBytecodeTextTest.OccurrenceInfo>> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'keys' @ [55:68] ==> public open val keys: MutableSet<String> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'assertTextWasGenerated' @ [56:13] ==> private final fun assertTextWasGenerated(expectedOutputFile: String, generated: Map<String, String>): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[SimpleFunctionDescriptorImpl]

'expectedOutputFile' @ [56:36] ==> val expectedOutputFile: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'generated' @ [56:56] ==> val generated: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'generated' @ [57:33] ==> val generated: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'expectedOutputFile' @ [57:43] ==> val expectedOutputFile: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'expectedOccurrencesByOutputFile' @ [58:39] ==> val expectedOccurrencesByOutputFile: LinkedHashMap<String, List<AbstractBytecodeTextTest.OccurrenceInfo>> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'expectedOutputFile' @ [58:71] ==> val expectedOutputFile: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'checkGeneratedTextAgainstExpectedOccurrences' @ [59:13] ==> public final fun checkGeneratedTextAgainstExpectedOccurrences(text: String, expectedOccurrences: List<AbstractBytecodeTextTest.OccurrenceInfo>): Unit defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[SimpleFunctionDescriptorImpl]

'generatedText' @ [59:58] ==> val generatedText: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'expectedOccurrences' @ [59:73] ==> val expectedOccurrences: List<AbstractBytecodeTextTest.OccurrenceInfo> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.doTestMultiFile[LocalVariableDescriptor]

'Throws' @ [63:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'Exception' @ [63:13] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'ArrayList' @ [65:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> OccurrenceInfo

'loadFile' @ [66:30] ==> @NotNull public open fun loadFile(@NotNull p0: File, @Nullable p1: String?, p2: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [66:39] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filename' @ [66:44] ==> value-parameter filename: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences[ValueParameterDescriptorImpl]

'Charsets' @ [66:55] ==> public object Charsets defined in kotlin.text[FakeCallableDescriptorForObject]

'UTF_8' @ [66:64] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'name' @ [66:70] ==> public final fun name(): (String..String?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'split' @ [66:84] ==> @InlineOnly public inline fun CharSequence.split(regex: Regex, limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [66:95] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dropLastWhile' @ [66:106] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [66:122] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [66:125] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toTypedArray' @ [66:137] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'lines' @ [68:22] ==> val lines: Array<String> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences[LocalVariableDescriptor]

'EXPECTED_OCCURRENCES_PATTERN' @ [69:27] ==> private final val EXPECTED_OCCURRENCES_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[PropertyDescriptorImpl]

'matcher' @ [69:56] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'line' @ [69:64] ==> val line: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences[LocalVariableDescriptor]

'matcher' @ [70:17] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences[LocalVariableDescriptor]

'matches' @ [70:25] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'result' @ [71:17] ==> val result: ArrayList<AbstractBytecodeTextTest.OccurrenceInfo> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences[LocalVariableDescriptor]

'add' @ [71:24] ==> public open fun add(element: AbstractBytecodeTextTest.OccurrenceInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'parseOccurrenceInfo' @ [71:28] ==> private final fun parseOccurrenceInfo(matcher: Matcher): AbstractBytecodeTextTest.OccurrenceInfo defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[SimpleFunctionDescriptorImpl]

'matcher' @ [71:48] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences[LocalVariableDescriptor]

'result' @ [75:16] ==> val result: ArrayList<AbstractBytecodeTextTest.OccurrenceInfo> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.readExpectedOccurrences[LocalVariableDescriptor]

'findMatches' @ [80:42] ==> @NotNull @Contract public open fun findMatches(@NotNull p0: String, @NotNull p1: Pattern): (MutableList<(String..String?)>..List<(String..String?)>) defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [80:54] ==> value-parameter text: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo.getActualOccurrence[ValueParameterDescriptorImpl]

'compile' @ [80:68] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'needle' @ [80:79] ==> private final val needle: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo[PropertyDescriptorImpl]

'size' @ [80:90] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'actualCount' @ [81:22] ==> val actualCount: Int defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo.getActualOccurrence[LocalVariableDescriptor]

'needle' @ [81:35] ==> private final val needle: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo[PropertyDescriptorImpl]

'numberOfOccurrences' @ [85:22] ==> private final val numberOfOccurrences: Int defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo[PropertyDescriptorImpl]

'needle' @ [85:43] ==> private final val needle: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo[PropertyDescriptorImpl]

'compile' @ [90:54] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'compile' @ [91:60] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'files' @ [95:26] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.isMultiFileTest[ValueParameterDescriptorImpl]

'file' @ [96:21] ==> val file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.isMultiFileTest[LocalVariableDescriptor]

'name' @ [96:26] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'endsWith' @ [96:31] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'kotlinFiles' @ [97:21] ==> var kotlinFiles: Int defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.isMultiFileTest[LocalVariableDescriptor]

'kotlinFiles' @ [100:20] ==> var kotlinFiles: Int defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.isMultiFileTest[LocalVariableDescriptor]

'StringBuilder' @ [105:28] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'StringBuilder' @ [106:26] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'expectedOccurrences' @ [108:26] ==> value-parameter expectedOccurrences: List<AbstractBytecodeTextTest.OccurrenceInfo> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[ValueParameterDescriptorImpl]

'expected' @ [109:17] ==> val expected: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[LocalVariableDescriptor]

'append' @ [109:26] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'info' @ [109:33] ==> val info: AbstractBytecodeTextTest.OccurrenceInfo defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[LocalVariableDescriptor]

'append' @ [109:39] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'actual' @ [110:17] ==> val actual: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[LocalVariableDescriptor]

'append' @ [110:24] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'info' @ [110:31] ==> val info: AbstractBytecodeTextTest.OccurrenceInfo defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[LocalVariableDescriptor]

'getActualOccurrence' @ [110:36] ==> public final fun getActualOccurrence(text: String): String? defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo[SimpleFunctionDescriptorImpl]

'text' @ [110:56] ==> value-parameter text: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[ValueParameterDescriptorImpl]

'append' @ [110:63] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'assertEquals' @ [114:24] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'text' @ [114:37] ==> value-parameter text: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[ValueParameterDescriptorImpl]

'expected' @ [114:43] ==> val expected: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[LocalVariableDescriptor]

'toString' @ [114:52] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'actual' @ [114:64] ==> val actual: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[LocalVariableDescriptor]

'toString' @ [114:71] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'println' @ [117:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'text' @ [117:25] ==> value-parameter text: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[ValueParameterDescriptorImpl]

'rethrow' @ [118:23] ==> public fun rethrow(e: Throwable): RuntimeException /* = RuntimeException */ defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]

'e' @ [118:31] ==> val e: Throwable defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.checkGeneratedTextAgainstExpectedOccurrences[LocalVariableDescriptor]

'!' @ [124:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'generated' @ [124:18] ==> value-parameter generated: Map<String, String> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[ValueParameterDescriptorImpl]

'containsKey' @ [124:28] ==> public abstract fun containsKey(key: String): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'expectedOutputFile' @ [124:40] ==> value-parameter expectedOutputFile: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[ValueParameterDescriptorImpl]

'StringBuilder' @ [125:35] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'failMessage' @ [126:17] ==> val failMessage: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[LocalVariableDescriptor]

'append' @ [126:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [126:60] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'expectedOutputFile' @ [126:67] ==> value-parameter expectedOutputFile: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[ValueParameterDescriptorImpl]

'append' @ [126:87] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [126:104] ==> public open fun append(p0: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'generated' @ [126:111] ==> value-parameter generated: Map<String, String> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[ValueParameterDescriptorImpl]

'size' @ [126:121] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'append' @ [126:127] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'generated' @ [127:39] ==> value-parameter generated: Map<String, String> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[ValueParameterDescriptorImpl]

'keys' @ [127:49] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'failMessage' @ [128:21] ==> val failMessage: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[LocalVariableDescriptor]

'append' @ [128:33] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'generatedFile' @ [128:40] ==> val generatedFile: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[LocalVariableDescriptor]

'append' @ [128:55] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'fail' @ [130:24] ==> public open fun fail(p0: (String..String?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'failMessage' @ [130:29] ==> val failMessage: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.assertTextWasGenerated[LocalVariableDescriptor]

'toString' @ [130:41] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'file' @ [138:26] ==> value-parameter file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[ValueParameterDescriptorImpl]

'content' @ [138:31] ==> public final val content: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'split' @ [138:39] ==> @InlineOnly public inline fun CharSequence.split(regex: Regex, limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [138:50] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dropLastWhile' @ [138:61] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [138:77] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [138:80] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toTypedArray' @ [138:92] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'AT_OUTPUT_FILE_PATTERN' @ [139:43] ==> private final val AT_OUTPUT_FILE_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[PropertyDescriptorImpl]

'matcher' @ [139:66] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'line' @ [139:74] ==> val line: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'atOutputFileMatcher' @ [140:21] ==> val atOutputFileMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'matches' @ [140:41] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'atOutputFileMatcher' @ [141:42] ==> val atOutputFileMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'group' @ [141:62] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'occurrenceMap' @ [142:25] ==> value-parameter occurrenceMap: MutableMap<String, List<AbstractBytecodeTextTest.OccurrenceInfo>> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[ValueParameterDescriptorImpl]

'containsKey' @ [142:39] ==> public abstract fun containsKey(key: String): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'outputFileName' @ [142:51] ==> val outputFileName: (String..String?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'AssertionError' @ [143:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'file' @ [144:33] ==> value-parameter file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[ValueParameterDescriptorImpl]

'name' @ [144:38] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'outputFileName' @ [144:89] ==> val outputFileName: (String..String?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'currentOccurrenceInfos' @ [146:21] ==> var currentOccurrenceInfos: MutableList<AbstractBytecodeTextTest.OccurrenceInfo>? defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'ArrayList' @ [146:46] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> OccurrenceInfo

'occurrenceMap' @ [147:21] ==> value-parameter occurrenceMap: MutableMap<String, List<AbstractBytecodeTextTest.OccurrenceInfo>> defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[ValueParameterDescriptorImpl]

'put' @ [147:35] ==> public abstract fun put(key: String, value: List<AbstractBytecodeTextTest.OccurrenceInfo>): List<AbstractBytecodeTextTest.OccurrenceInfo>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'outputFileName' @ [147:39] ==> val outputFileName: (String..String?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'currentOccurrenceInfos' @ [147:55] ==> var currentOccurrenceInfos: MutableList<AbstractBytecodeTextTest.OccurrenceInfo>? defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'EXPECTED_OCCURRENCES_PATTERN' @ [150:50] ==> private final val EXPECTED_OCCURRENCES_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[PropertyDescriptorImpl]

'matcher' @ [150:79] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'line' @ [150:87] ==> val line: String defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'expectedOccurrencesMatcher' @ [151:21] ==> val expectedOccurrencesMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'matches' @ [151:48] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'currentOccurrenceInfos' @ [152:25] ==> var currentOccurrenceInfos: MutableList<AbstractBytecodeTextTest.OccurrenceInfo>? defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'AssertionError' @ [153:31] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'file' @ [154:33] ==> value-parameter file: CodegenTestCase.TestFile defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[ValueParameterDescriptorImpl]

'name' @ [154:38] ==> public final val name: (String..String?) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaPropertyDescriptor]

'parseOccurrenceInfo' @ [156:42] ==> private final fun parseOccurrenceInfo(matcher: Matcher): AbstractBytecodeTextTest.OccurrenceInfo defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion[SimpleFunctionDescriptorImpl]

'expectedOccurrencesMatcher' @ [156:62] ==> val expectedOccurrencesMatcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'currentOccurrenceInfos' @ [157:21] ==> var currentOccurrenceInfos: MutableList<AbstractBytecodeTextTest.OccurrenceInfo>? defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'add' @ [157:44] ==> public abstract fun add(element: AbstractBytecodeTextTest.OccurrenceInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'occurrenceInfo' @ [157:48] ==> val occurrenceInfo: AbstractBytecodeTextTest.OccurrenceInfo defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.readExpectedOccurrencesForMultiFileTest[LocalVariableDescriptor]

'parseInt' @ [163:47] ==> public open fun parseInt(p0: (String..String?)): Int defined in java.lang.Integer[JavaMethodDescriptor]

'matcher' @ [163:56] ==> value-parameter matcher: Matcher defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.parseOccurrenceInfo[ValueParameterDescriptorImpl]

'group' @ [163:64] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [164:26] ==> value-parameter matcher: Matcher defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.parseOccurrenceInfo[ValueParameterDescriptorImpl]

'group' @ [164:34] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'OccurrenceInfo' @ [165:20] ==> public constructor OccurrenceInfo(numberOfOccurrences: Int, needle: String) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.OccurrenceInfo[ClassConstructorDescriptorImpl]

'numberOfOccurrences' @ [165:35] ==> val numberOfOccurrences: Int defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.parseOccurrenceInfo[LocalVariableDescriptor]

'needle' @ [165:56] ==> val needle: (String..String?) defined in org.jetbrains.kotlin.codegen.AbstractBytecodeTextTest.Companion.parseOccurrenceInfo[LocalVariableDescriptor]

