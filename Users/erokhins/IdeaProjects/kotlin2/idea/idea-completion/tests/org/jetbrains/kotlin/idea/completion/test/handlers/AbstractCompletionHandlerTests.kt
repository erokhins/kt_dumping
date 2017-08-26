'CompletionHandlerTestBase' @ [31:99] ==> public constructor CompletionHandlerTestBase() defined in org.jetbrains.kotlin.idea.completion.test.handlers.CompletionHandlerTestBase[ClassConstructorDescriptorImpl]

'setUpFixture' @ [40:9] ==> protected open fun setUpFixture(testPath: String): Unit defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[SimpleFunctionDescriptorImpl]

'testPath' @ [40:22] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[ValueParameterDescriptorImpl]

'getInstance' @ [42:55] ==> public open fun getInstance(): (CodeStyleSettingsManager..CodeStyleSettingsManager?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsManager[JavaMethodDescriptor]

'settingManager' @ [43:28] ==> val settingManager: (CodeStyleSettingsManager..CodeStyleSettingsManager?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'currentSettings' @ [43:43] ==> public final val CodeStyleSettingsManager.currentSettings: CodeStyleSettings[MyPropertyDescriptor]

'clone' @ [43:59] ==> public open fun clone(): CodeStyleSettings defined in com.intellij.psi.codeStyle.CodeStyleSettings[JavaMethodDescriptor]

'settingManager' @ [44:9] ==> val settingManager: (CodeStyleSettingsManager..CodeStyleSettingsManager?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'setTemporarySettings' @ [44:24] ==> public open fun setTemporarySettings(@NotNull p0: CodeStyleSettings): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsManager[JavaMethodDescriptor]

'tempSettings' @ [44:45] ==> val tempSettings: CodeStyleSettings defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'loadFile' @ [46:37] ==> @NotNull public open fun loadFile(@NotNull p0: File): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [46:46] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testPath' @ [46:51] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[ValueParameterDescriptorImpl]

'assertTrue' @ [47:13] ==> public open fun assertTrue(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCaseBase[JavaMethodDescriptor]

'testPath' @ [47:59] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[ValueParameterDescriptorImpl]

'fileText' @ [47:72] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'contains' @ [47:81] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'?:' @ [48:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'getPrefixedInt' @ [48:57] ==> @Nullable public open fun getPrefixedInt(p0: (String..String?), p1: (String..String?)): Int? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [48:72] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'INVOCATION_COUNT_PREFIX' @ [48:82] ==> private final val INVOCATION_COUNT_PREFIX: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'findStringWithPrefixes' @ [49:54] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [49:77] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'LOOKUP_STRING_PREFIX' @ [49:87] ==> private final val LOOKUP_STRING_PREFIX: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'findStringWithPrefixes' @ [50:50] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [50:73] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'ELEMENT_TEXT_PREFIX' @ [50:83] ==> private final val ELEMENT_TEXT_PREFIX: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'findStringWithPrefixes' @ [51:50] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [51:73] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'TAIL_TEXT_PREFIX' @ [51:83] ==> private final val TAIL_TEXT_PREFIX: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'findStringWithPrefixes' @ [53:62] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [53:85] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'COMPLETION_CHAR_PREFIX' @ [53:95] ==> private final val COMPLETION_CHAR_PREFIX: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'when(completionCharString) {
                "\\n", null -> '\n'
                "\\t" -> '\t'
                else -> completionCharString.singleOrNull() ?: error("Incorrect completion char: \"$completionCharString\"")
            }' @ [54:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Char, entry1: Char, entry2: Char): Char[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Char

'completionCharString' @ [54:39] ==> val completionCharString: String? defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'completionCharString' @ [57:25] ==> val completionCharString: String? defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'singleOrNull' @ [57:46] ==> public fun CharSequence.singleOrNull(): Char? defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'error' @ [57:64] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'completionCharString' @ [57:101] ==> val completionCharString: String? defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'ExpectedCompletionUtils' @ [60:34] ==> public object ExpectedCompletionUtils defined in org.jetbrains.kotlin.idea.completion.test in file ExpectedCompletionUtils.kt[FakeCallableDescriptorForObject]

'getCompletionType' @ [60:58] ==> public final fun getCompletionType(fileText: String): CompletionType? defined in org.jetbrains.kotlin.idea.completion.test.ExpectedCompletionUtils[SimpleFunctionDescriptorImpl]

'fileText' @ [60:76] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'defaultCompletionType' @ [60:89] ==> private final val defaultCompletionType: CompletionType defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'getInstance' @ [62:63] ==> public open fun getInstance(p0: (Project..Project?)): (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaMethodDescriptor]

'project' @ [62:75] ==> public final val AbstractCompletionHandlerTest.project: Project[MyPropertyDescriptor]

'getSettings' @ [63:64] ==> @NotNull public open fun getSettings(@Nullable p0: Project?): CodeStyleSettings defined in com.intellij.psi.codeStyle.CodeStyleSettingsManager[JavaMethodDescriptor]

'project' @ [63:76] ==> public final val AbstractCompletionHandlerTest.project: Project[MyPropertyDescriptor]

'getCommonSettings' @ [63:85] ==> public open fun getCommonSettings(p0: (Language..Language?)): (CommonCodeStyleSettings..CommonCodeStyleSettings?) defined in com.intellij.psi.codeStyle.CodeStyleSettings[JavaMethodDescriptor]

'INSTANCE' @ [63:118] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'iterator' @ [64:26] ==> public abstract fun iterator(): MutableIterator<(String..String?)> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'findLinesWithPrefixesRemoved' @ [64:48] ==> @NotNull public open fun findLinesWithPrefixesRemoved(p0: (String..String?), vararg p1: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [64:77] ==> val fileText: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'CODE_STYLE_SETTING_PREFIX' @ [64:87] ==> private final val CODE_STYLE_SETTING_PREFIX: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'line' @ [65:29] ==> val line: (String..String?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'indexOfOrNull' @ [65:34] ==> public fun String.indexOfOrNull(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]

'error' @ [65:56] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'line' @ [65:92] ==> val line: (String..String?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'line' @ [66:35] ==> val line: (String..String?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'substring' @ [66:40] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [66:53] ==> val index: Int defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'trim' @ [66:60] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'line' @ [67:36] ==> val line: (String..String?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'substring' @ [67:41] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'index' @ [67:51] ==> val index: Int defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'trim' @ [67:62] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [68:22] ==> public final operator fun component1(): (Field..Field?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [68:29] ==> public final operator fun component2(): (Any..Any?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'kotlinStyleSettings' @ [69:21] ==> val kotlinStyleSettings: (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'java' @ [69:48] ==> public val <T> KClass<out KotlinCodeStyleSettings>.java: Class<out KotlinCodeStyleSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCodeStyleSettings

'getDeclaredField' @ [69:53] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'settingName' @ [69:70] ==> val settingName: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'kotlinStyleSettings' @ [69:86] ==> val kotlinStyleSettings: (KotlinCodeStyleSettings..KotlinCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'commonStyleSettings' @ [72:21] ==> val commonStyleSettings: (CommonCodeStyleSettings..CommonCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'java' @ [72:48] ==> public val <T> KClass<out CommonCodeStyleSettings>.java: Class<out CommonCodeStyleSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CommonCodeStyleSettings

'getDeclaredField' @ [72:53] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'settingName' @ [72:70] ==> val settingName: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'commonStyleSettings' @ [72:86] ==> val commonStyleSettings: (CommonCodeStyleSettings..CommonCodeStyleSettings?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'when (field.type.name) {
                    "boolean" -> field.setBoolean(settings, settingValue.toBoolean())
                    "int" -> field.setInt(settings, settingValue.toInt())
                    else -> error("Unsupported setting type: ${field.type}")
                }' @ [74:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'field' @ [74:23] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'type' @ [74:29] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'name' @ [74:34] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'field' @ [75:34] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'setBoolean' @ [75:40] ==> @CallerSensitive public open fun setBoolean(p0: (Any..Any?), p1: Boolean): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'settings' @ [75:51] ==> val settings: (Any..Any?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'settingValue' @ [75:61] ==> val settingValue: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'toBoolean' @ [75:74] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'field' @ [76:30] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'setInt' @ [76:36] ==> @CallerSensitive public open fun setInt(p0: (Any..Any?), p1: Int): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'settings' @ [76:43] ==> val settings: (Any..Any?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'settingValue' @ [76:53] ==> val settingValue: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'toInt' @ [76:66] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'error' @ [77:29] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'field' @ [77:64] ==> val field: (Field..Field?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'type' @ [77:70] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'doTestWithTextLoaded' @ [81:13] ==> protected final fun doTestWithTextLoaded(completionType: CompletionType, time: Int, lookupString: String?, itemText: String?, tailText: String?, completionChar: Char, afterFilePath: String): Unit defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[SimpleFunctionDescriptorImpl]

'completionType' @ [81:34] ==> val completionType: CompletionType defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'invocationCount' @ [81:50] ==> val invocationCount: Int defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'lookupString' @ [81:67] ==> val lookupString: String? defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'itemText' @ [81:81] ==> val itemText: String? defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'tailText' @ [81:91] ==> val tailText: String? defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'completionChar' @ [81:101] ==> val completionChar: Char defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'testPath' @ [81:117] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[ValueParameterDescriptorImpl]

'settingManager' @ [84:13] ==> val settingManager: (CodeStyleSettingsManager..CodeStyleSettingsManager?) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.doTest[LocalVariableDescriptor]

'dropTemporarySettings' @ [84:28] ==> public open fun dropTemporarySettings(): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsManager[JavaMethodDescriptor]

'tearDownFixture' @ [85:13] ==> protected open fun tearDownFixture(): Unit defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[SimpleFunctionDescriptorImpl]

'fixture' @ [90:9] ==> protected final val fixture: JavaCodeInsightTestFixture defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[PropertyDescriptorImpl]

'configureWithExtraFile' @ [90:17] ==> public fun CodeInsightTestFixture.configureWithExtraFile(path: String, vararg extraNameParts: String = ..., relativePaths: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.completion.test[SimpleFunctionDescriptorImpl]

'testPath' @ [90:40] ==> value-parameter testPath: String defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest.setUpFixture[ValueParameterDescriptorImpl]

'INSTANCE' @ [97:89] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'AbstractCompletionHandlerTest' @ [100:55] ==> public constructor AbstractCompletionHandlerTest(defaultCompletionType: CompletionType) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[ClassConstructorDescriptorImpl]

'BASIC' @ [100:100] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'AbstractCompletionHandlerTest' @ [102:55] ==> public constructor AbstractCompletionHandlerTest(defaultCompletionType: CompletionType) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[ClassConstructorDescriptorImpl]

'SMART' @ [102:100] ==> enum entry SMART defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'AbstractCompletionHandlerTest' @ [104:53] ==> public constructor AbstractCompletionHandlerTest(defaultCompletionType: CompletionType) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[ClassConstructorDescriptorImpl]

'BASIC' @ [104:98] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

'AbstractCompletionHandlerTest' @ [106:57] ==> public constructor AbstractCompletionHandlerTest(defaultCompletionType: CompletionType) defined in org.jetbrains.kotlin.idea.completion.test.handlers.AbstractCompletionHandlerTest[ClassConstructorDescriptorImpl]

'BASIC' @ [106:102] ==> enum entry BASIC defined in com.intellij.codeInsight.completion.CompletionType[FakeCallableDescriptorForObject]

