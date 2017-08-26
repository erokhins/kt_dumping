'AbstractJavaToKotlinConverterTest' @ [34:62] ==> public constructor AbstractJavaToKotlinConverterTest() defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterTest[ClassConstructorDescriptorImpl]

'compile' @ [35:37] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'!!' @ [38:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Project?): Project[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Project

'getProject' @ [38:45] ==> public open fun getProject(): (Project..Project?) defined in com.intellij.testFramework.LightPlatformTestCase[JavaMethodDescriptor]

'File' @ [39:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'javaPath' @ [39:29] ==> value-parameter javaPath: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[ValueParameterDescriptorImpl]

'loadFile' @ [40:37] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'javaFile' @ [40:46] ==> val javaFile: File defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'testHeaderPattern' @ [41:23] ==> public final val testHeaderPattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[PropertyDescriptorImpl]

'matcher' @ [41:41] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'fileContents' @ [41:49] ==> val fileContents: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'component1' @ [43:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [43:22] ==> public final operator fun component2(): (String..String?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (matcher.find()) {
            Pair(matcher.group().trim().substring(2), matcher.replaceFirst(""))
        }
        else {
            Pair("file", fileContents)
        }' @ [43:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<String, (String..String?)>, elseBranch: Pair<String, (String..String?)>): Pair<String, (String..String?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<String, (kotlin.String..kotlin.String?)>

'matcher' @ [43:38] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'find' @ [43:46] ==> public open fun find(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'Pair' @ [44:13] ==> public constructor Pair<out A, out B>(first: String, second: (String..String?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> (kotlin.String..kotlin.String?)

'matcher' @ [44:18] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'group' @ [44:26] ==> public open fun group(): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'trim' @ [44:34] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substring' @ [44:41] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'matcher' @ [44:55] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'replaceFirst' @ [44:63] ==> public open fun replaceFirst(p0: (String..String?)): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'Pair' @ [47:13] ==> public constructor Pair<out A, out B>(first: String, second: String) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> String

'fileContents' @ [47:26] ==> val fileContents: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'when (text) {
            "true" -> true
            "false" -> false
            else -> throw IllegalArgumentException("Unknown option value: $text")
        }' @ [50:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'text' @ [50:57] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest.parseBoolean[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [53:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'text' @ [53:76] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest.parseBoolean[ValueParameterDescriptorImpl]

'ConverterSettings' @ [56:24] ==> public companion object defined in org.jetbrains.kotlin.j2k.ConverterSettings[FakeCallableDescriptorForObject]

'defaultSettings' @ [56:42] ==> public final val defaultSettings: ConverterSettings defined in org.jetbrains.kotlin.j2k.ConverterSettings.Companion[DeserializedPropertyDescriptor]

'copy' @ [56:58] ==> public final fun copy(forceNotNullTypes: Boolean = ..., specifyLocalVariableTypeByDefault: Boolean = ..., specifyFieldTypeByDefault: Boolean = ..., openByDefault: Boolean = ...): ConverterSettings defined in org.jetbrains.kotlin.j2k.ConverterSettings[DeserializedSimpleFunctionDescriptor]

'parseDirectives' @ [57:42] ==> @NotNull public open fun parseDirectives(p0: (String..String?)): (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>) defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'javaCode' @ [57:58] ==> val javaCode: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'component1' @ [58:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (String..String?)>.component1(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.String..kotlin.String?)

'component2' @ [58:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (String..String?)>.component2(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.String..kotlin.String?)

'directives' @ [58:31] ==> val directives: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'when (name) {
                "forceNotNullTypes" -> settings.forceNotNullTypes = parseBoolean(value)
                "specifyLocalVariableTypeByDefault" -> settings.specifyLocalVariableTypeByDefault = parseBoolean(value)
                "specifyFieldTypeByDefault" -> settings.specifyFieldTypeByDefault = parseBoolean(value)
                "openByDefault" -> settings.openByDefault = parseBoolean(value)
                else -> throw IllegalArgumentException("Unknown option: $name")
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'name' @ [59:19] ==> val name: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [60:40] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'forceNotNullTypes' @ [60:49] ==> public final var forceNotNullTypes: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[DeserializedPropertyDescriptor]

'parseBoolean' @ [60:69] ==> local final fun parseBoolean(text: String): Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[SimpleFunctionDescriptorImpl]

'value' @ [60:82] ==> val value: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [61:56] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'specifyLocalVariableTypeByDefault' @ [61:65] ==> public final var specifyLocalVariableTypeByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[DeserializedPropertyDescriptor]

'parseBoolean' @ [61:101] ==> local final fun parseBoolean(text: String): Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[SimpleFunctionDescriptorImpl]

'value' @ [61:114] ==> val value: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [62:48] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'specifyFieldTypeByDefault' @ [62:57] ==> public final var specifyFieldTypeByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[DeserializedPropertyDescriptor]

'parseBoolean' @ [62:85] ==> local final fun parseBoolean(text: String): Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[SimpleFunctionDescriptorImpl]

'value' @ [62:98] ==> val value: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [63:36] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'openByDefault' @ [63:45] ==> public final var openByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[DeserializedPropertyDescriptor]

'parseBoolean' @ [63:61] ==> local final fun parseBoolean(text: String): Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[SimpleFunctionDescriptorImpl]

'value' @ [63:74] ==> val value: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'IllegalArgumentException' @ [64:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'name' @ [64:74] ==> val name: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'when (prefix) {
            "expression" -> expressionToKotlin(javaCode, settings, project)
            "statement" -> statementToKotlin(javaCode, settings, project)
            "method" -> methodToKotlin(javaCode, settings, project)
            "class" -> fileToKotlin(javaCode, settings, project)
            "file" -> fileToKotlin(javaCode, settings, project)
            else -> throw IllegalStateException("Specify what is it: file, class, method, statement or expression " +
                                                "using the first line of test data file")
        }' @ [68:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'prefix' @ [68:34] ==> val prefix: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'expressionToKotlin' @ [69:29] ==> private final fun expressionToKotlin(code: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'javaCode' @ [69:48] ==> val javaCode: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [69:58] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'project' @ [69:68] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'statementToKotlin' @ [70:28] ==> private final fun statementToKotlin(text: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'javaCode' @ [70:46] ==> val javaCode: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [70:56] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'project' @ [70:66] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'methodToKotlin' @ [71:25] ==> private final fun methodToKotlin(text: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'javaCode' @ [71:40] ==> val javaCode: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [71:50] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'project' @ [71:60] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'fileToKotlin' @ [72:24] ==> private final fun fileToKotlin(text: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'javaCode' @ [72:37] ==> val javaCode: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [72:47] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'project' @ [72:57] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'fileToKotlin' @ [73:23] ==> private final fun fileToKotlin(text: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'javaCode' @ [73:36] ==> val javaCode: (String..String?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'settings' @ [73:46] ==> var settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'project' @ [73:56] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'IllegalStateException' @ [74:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [74:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'prefix' @ [78:29] ==> val prefix: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'setOf' @ [78:39] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reformat' @ [80:22] ==> private final fun reformat(text: String, project: Project, inFunContext: Boolean): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'rawConverted' @ [80:31] ==> val rawConverted: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'project' @ [80:45] ==> val project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'reformatInFun' @ [80:54] ==> val reformatInFun: Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'prefix' @ [82:13] ==> val prefix: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'actual' @ [83:13] ==> var actual: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'createKotlinFile' @ [83:22] ==> private final fun createKotlinFile(text: String): KtFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'actual' @ [83:39] ==> var actual: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'dumpTextWithErrors' @ [83:47] ==> public fun KtFile.dumpTextWithErrors(): String defined in org.jetbrains.kotlin.idea.test in file testUtils.kt[SimpleFunctionDescriptorImpl]

'javaPath' @ [86:26] ==> value-parameter javaPath: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[ValueParameterDescriptorImpl]

'replace' @ [86:35] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [87:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'kotlinPath' @ [87:33] ==> val kotlinPath: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'assertEqualsToFile' @ [88:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'expectedFile' @ [88:44] ==> val expectedFile: File defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'actual' @ [88:58] ==> var actual: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.doTest[LocalVariableDescriptor]

'text' @ [92:23] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[ValueParameterDescriptorImpl]

'lines' @ [92:28] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [92:36] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [92:85] ==> value-parameter it: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat.<anonymous>[ValueParameterDescriptorImpl]

'if (inFunContext) "fun convertedTemp() {\n$funBody\n}" else text' @ [93:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'inFunContext' @ [93:32] ==> value-parameter inFunContext: Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[ValueParameterDescriptorImpl]

'funBody' @ [93:71] ==> val funBody: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[LocalVariableDescriptor]

'text' @ [93:88] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[ValueParameterDescriptorImpl]

'createFile' @ [95:45] ==> @NotNull public open fun createFile(@NotNull @NonNls p0: String, @NotNull p1: String, @NotNull p2: Project): KtFile defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'textToFormat' @ [95:69] ==> val textToFormat: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[LocalVariableDescriptor]

'project' @ [95:83] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[ValueParameterDescriptorImpl]

'runWriteCommandAction' @ [96:28] ==> public final fun runWriteCommandAction(p0: (Project..Project?), @NotNull p1: () -> Unit): Unit defined in com.intellij.openapi.command.WriteCommandAction[SamAdapterFunctionDescriptor]

'project' @ [96:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[ValueParameterDescriptorImpl]

'!!' @ [97:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: CodeStyleManager?): CodeStyleManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> CodeStyleManager

'getInstance' @ [97:30] ==> public open fun getInstance(@NotNull p0: Project): (CodeStyleManager..CodeStyleManager?) defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'project' @ [97:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[ValueParameterDescriptorImpl]

'reformat' @ [97:53] ==> @NotNull public abstract fun reformat(@NotNull p0: PsiElement): PsiElement defined in com.intellij.psi.codeStyle.CodeStyleManager[JavaMethodDescriptor]

'convertedFile' @ [97:62] ==> val convertedFile: KtFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[LocalVariableDescriptor]

'convertedFile' @ [100:31] ==> val convertedFile: KtFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[LocalVariableDescriptor]

'text' @ [100:45] ==> public final val KtFile.text: (String..String?)[MyPropertyDescriptor]

'if (inFunContext)
            reformattedText.removeFirstLine().removeLastLine().trimIndent()
        else
            reformattedText' @ [102:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'inFunContext' @ [102:20] ==> value-parameter inFunContext: Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[ValueParameterDescriptorImpl]

'reformattedText' @ [103:13] ==> val reformattedText: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[LocalVariableDescriptor]

'removeFirstLine' @ [103:29] ==> private final fun String.removeFirstLine(): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'removeLastLine' @ [103:47] ==> private final fun String.removeLastLine(): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'trimIndent' @ [103:64] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reformattedText' @ [105:13] ==> val reformattedText: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.reformat[LocalVariableDescriptor]

'createJavaFile' @ [109:20] ==> private final fun createJavaFile(text: String): PsiJavaFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'text' @ [109:35] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.fileToKotlin[ValueParameterDescriptorImpl]

'JavaToKotlinConverter' @ [110:25] ==> public constructor JavaToKotlinConverter(project: Project, settings: ConverterSettings, services: JavaToKotlinConverterServices) defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedClassConstructorDescriptor]

'project' @ [110:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.fileToKotlin[ValueParameterDescriptorImpl]

'settings' @ [110:56] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.fileToKotlin[ValueParameterDescriptorImpl]

'IdeaJavaToKotlinServices' @ [110:66] ==> public object IdeaJavaToKotlinServices : JavaToKotlinConverterServices defined in org.jetbrains.kotlin.idea.j2k[FakeCallableDescriptorForObject]

'converter' @ [111:16] ==> val converter: JavaToKotlinConverter defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.fileToKotlin[LocalVariableDescriptor]

'filesToKotlin' @ [111:26] ==> public final fun filesToKotlin(files: List<PsiJavaFile>, postProcessor: PostProcessor, progress: ProgressIndicator = ...): JavaToKotlinConverter.FilesResult defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter[DeserializedSimpleFunctionDescriptor]

'listOf' @ [111:40] ==> public fun <T> listOf(element: PsiJavaFile): List<PsiJavaFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiJavaFile

'file' @ [111:47] ==> val file: PsiJavaFile defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.fileToKotlin[LocalVariableDescriptor]

'J2kPostProcessor' @ [111:54] ==> public constructor J2kPostProcessor(formatCode: Boolean) defined in org.jetbrains.kotlin.idea.j2k.J2kPostProcessor[DeserializedClassConstructorDescriptor]

'results' @ [111:91] ==> public final val results: List<String> defined in org.jetbrains.kotlin.j2k.JavaToKotlinConverter.FilesResult[DeserializedPropertyDescriptor]

'single' @ [111:99] ==> public fun <T> List<String>.single(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fileToKotlin' @ [115:22] ==> private final fun fileToKotlin(text: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'text' @ [115:52] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.methodToKotlin[ValueParameterDescriptorImpl]

'settings' @ [115:60] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.methodToKotlin[ValueParameterDescriptorImpl]

'project' @ [115:70] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.methodToKotlin[ValueParameterDescriptorImpl]

'result' @ [116:16] ==> val result: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.methodToKotlin[LocalVariableDescriptor]

'substringBeforeLast' @ [117:18] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [118:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [119:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [120:18] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [120:31] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [124:23] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.statementToKotlin[ValueParameterDescriptorImpl]

'lines' @ [124:28] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [124:36] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [124:85] ==> value-parameter it: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.statementToKotlin.<anonymous>[ValueParameterDescriptorImpl]

'methodToKotlin' @ [125:22] ==> private final fun methodToKotlin(text: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'funBody' @ [125:54] ==> val funBody: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.statementToKotlin[LocalVariableDescriptor]

'settings' @ [125:67] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.statementToKotlin[ValueParameterDescriptorImpl]

'project' @ [125:77] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.statementToKotlin[ValueParameterDescriptorImpl]

'result' @ [127:16] ==> val result: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.statementToKotlin[LocalVariableDescriptor]

'substringBeforeLast' @ [128:18] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replaceFirst' @ [129:18] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [130:18] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [130:31] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'statementToKotlin' @ [134:22] ==> private final fun statementToKotlin(text: String, settings: ConverterSettings, project: Project): String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[SimpleFunctionDescriptorImpl]

'code' @ [134:58] ==> value-parameter code: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.expressionToKotlin[ValueParameterDescriptorImpl]

'settings' @ [134:66] ==> value-parameter settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.expressionToKotlin[ValueParameterDescriptorImpl]

'project' @ [134:76] ==> value-parameter project: Project defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.expressionToKotlin[ValueParameterDescriptorImpl]

'result' @ [135:16] ==> val result: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.expressionToKotlin[LocalVariableDescriptor]

'replaceFirst' @ [136:18] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replaceFirst' @ [137:18] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replaceFirst' @ [138:18] ==> public fun String.replaceFirst(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [139:18] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [143:61] ==> @NotNull public final val INSTANCE: KotlinWithJdkAndRuntimeLightProjectDescriptor defined in org.jetbrains.kotlin.idea.test.KotlinWithJdkAndRuntimeLightProjectDescriptor[JavaPropertyDescriptor]

'substringAfter' @ [145:44] ==> public fun String.substringAfter(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringBeforeLast' @ [147:43] ==> public fun String.substringBeforeLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'myFixture' @ [150:16] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[JavaPropertyDescriptor]

'configureByText' @ [150:26] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'text' @ [150:68] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.createJavaFile[ValueParameterDescriptorImpl]

'myFixture' @ [154:16] ==> protected/*protected and package*/ final var myFixture: (JavaCodeInsightTestFixture..JavaCodeInsightTestFixture?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest[JavaPropertyDescriptor]

'configureByText' @ [154:26] ==> public abstract fun configureByText(@NotNull p0: String, @NotNull p1: String): (PsiFile..PsiFile?) defined in com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture[JavaMethodDescriptor]

'text' @ [154:66] ==> value-parameter text: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterSingleFileTest.createKotlinFile[ValueParameterDescriptorImpl]

