'LanguageCodeStyleSettingsProvider' @ [27:49] ==> public constructor LanguageCodeStyleSettingsProvider() defined in com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider[JavaClassConstructorDescriptor]

'INSTANCE' @ [28:49] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'when (settingsType) {
        LanguageCodeStyleSettingsProvider.SettingsType.WRAPPING_AND_BRACES_SETTINGS ->
            """
               @Deprecated("Foo") public class ThisIsASampleClass : Comparable<*>, Appendable {
                   val test =
                       12

                   @Deprecated("Foo") fun foo1(i1: Int, i2: Int, i3: Int) : Int {
                       when (i1) {
                           is Number -> 0
                           else -> 1
                       }
                       return 0
                   }
                   private fun foo2():Int {
               // todo: something
                       try {            return foo1(12, 13, 14)
                       }        catch (e: Exception) {            return 0        }        finally {           if (true) {               return 1           }           else {               return 2           }        }    }
                   private val f = {(a: Int)->a*2}

                   fun longMethod(@Named("param1") param1: Int,
                    param2: String) {
                       @Deprecated val foo = 1
                   }
               }

               @Deprecated val bar = 1

               enum class Enumeration {
                   A, B
               }
            """.trimIndent()

        LanguageCodeStyleSettingsProvider.SettingsType.BLANK_LINES_SETTINGS ->
            """
                class Foo {
                   private var field1: Int = 1
                   private val field2: String? = null


                   init {
                       field1 = 2;
                   }

                   fun foo1() {
                       run {



                           field1
                       }

                       when(field1) {
                           1 -> println("1")
                           2 -> println("2")
                           3 ->
                                println("3" +
                                     "4")
                       }

                       when(field2) {
                           1 -> {
                               println("1")
                           }

                           2 -> {
                               println("2")
                           }
                       }
                   }


                   class InnerClass {
                   }
               }



               class AnotherClass {
               }

               interface TestInterface {
               }
               fun run(f: () -> Unit) {
                   f()
               }""".trimIndent()

        else -> """open class Some {
                       private val f: (Int)->Int = { (a: Int) -> a * 2 }
                       fun foo(): Int {
                           val test: Int = 12
                           for (i in 10..42) {
                               println (when {
                                   i < test -> -1
                                   i > test -> 1
                                   else -> 0
                               })
                           }
                           if (true) { }
                           while (true) { break }
                           try {
                               when (test) {
                                   12 -> println("foo")
                                   else -> println("bar")
                               }
                           } catch (e: Exception) {
                           } finally {
                           }
                           return test
                       }
                       private fun <T>foo2(): Int where T : List<T> {
                           return 0
                       }

                       fun multilineMethod(
                           foo: String,
                           bar: String
                       ) {
                           foo
                               .length
                       }

                       fun expressionBodyMethod() =
                               "abc"
                   }
                   class AnotherClass<T : Any> : Some()
                   """.trimIndent()
    }' @ [30:104] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'settingsType' @ [30:110] ==> value-parameter settingsType: LanguageCodeStyleSettingsProvider.SettingsType defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.getCodeSample[ValueParameterDescriptorImpl]

'WRAPPING_AND_BRACES_SETTINGS' @ [31:56] ==> enum entry WRAPPING_AND_BRACES_SETTINGS defined in com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider.SettingsType[FakeCallableDescriptorForObject]

'trimIndent' @ [61:17] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'BLANK_LINES_SETTINGS' @ [63:56] ==> enum entry BLANK_LINES_SETTINGS defined in com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider.SettingsType[FakeCallableDescriptorForObject]

'trimIndent' @ [115:21] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trimIndent' @ [156:24] ==> public fun String.trimIndent(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'NAME' @ [159:61] ==> public const final val NAME: String defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'consumer' @ [163:13] ==> value-parameter consumer: CodeStyleSettingsCustomizable defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'showCustomOption' @ [163:22] ==> public open fun showCustomOption(p0: (Class<out (CustomCodeStyleSettings..CustomCodeStyleSettings?)>..Class<out (CustomCodeStyleSettings..CustomCodeStyleSettings?)>?), p1: (String..String?), p2: (String..String?), @Nullable p3: String?, vararg p4: (Any..Any?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaMethodDescriptor]

'KotlinCodeStyleSettings' @ [163:39] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'java' @ [163:70] ==> public val <T> KClass<KotlinCodeStyleSettings>.java: Class<KotlinCodeStyleSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCodeStyleSettings

'field' @ [163:76] ==> value-parameter field: KProperty<*> defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings.showCustomOption[ValueParameterDescriptorImpl]

'name' @ [163:82] ==> public abstract val name: String defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'title' @ [163:88] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings.showCustomOption[ValueParameterDescriptorImpl]

'groupName' @ [163:95] ==> value-parameter groupName: String? = ... defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings.showCustomOption[ValueParameterDescriptorImpl]

'when (settingsType) {
            LanguageCodeStyleSettingsProvider.SettingsType.SPACING_SETTINGS -> {
                consumer.showStandardOptions(
                        "SPACE_AROUND_ASSIGNMENT_OPERATORS",
                        "SPACE_AROUND_LOGICAL_OPERATORS",
                        "SPACE_AROUND_EQUALITY_OPERATORS",
                        "SPACE_AROUND_RELATIONAL_OPERATORS",
                        "SPACE_AROUND_ADDITIVE_OPERATORS",
                        "SPACE_AROUND_MULTIPLICATIVE_OPERATORS",
                        "SPACE_AROUND_UNARY_OPERATOR",
                        "SPACE_AFTER_COMMA",
                        "SPACE_BEFORE_COMMA",
                        "SPACE_BEFORE_IF_PARENTHESES",
                        "SPACE_BEFORE_WHILE_PARENTHESES",
                        "SPACE_BEFORE_FOR_PARENTHESES",
                        "SPACE_BEFORE_CATCH_PARENTHESES"
                );

                showCustomOption(KotlinCodeStyleSettings::SPACE_AROUND_RANGE,
                                 "Range operator (..)",
                                 CodeStyleSettingsCustomizable.SPACES_AROUND_OPERATORS)

                showCustomOption(KotlinCodeStyleSettings::SPACE_BEFORE_TYPE_COLON,
                                 "Before colon, after declaration name",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::SPACE_AFTER_TYPE_COLON,
                                 "After colon, before declaration type",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::SPACE_BEFORE_EXTEND_COLON,
                                 "Before colon in new type definition",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::SPACE_AFTER_EXTEND_COLON,
                                "After colon in new type definition",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::INSERT_WHITESPACES_IN_SIMPLE_ONE_LINE_METHOD,
                                 "In simple one line methods",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::SPACE_AROUND_FUNCTION_TYPE_ARROW,
                                 "Around arrow in function types",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::SPACE_AROUND_WHEN_ARROW,
                                "Around arrow in \"when\" clause",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::SPACE_BEFORE_LAMBDA_ARROW,
                                "Before lambda arrow",
                                 CodeStyleSettingsCustomizable.SPACES_OTHER)

                showCustomOption(KotlinCodeStyleSettings::SPACE_BEFORE_WHEN_PARENTHESES,
                                 "'when' parentheses",
                                 CodeStyleSettingsCustomizable.SPACES_BEFORE_PARENTHESES)
            }
                LanguageCodeStyleSettingsProvider.SettingsType.WRAPPING_AND_BRACES_SETTINGS -> {
                    consumer.showStandardOptions(
                        // "ALIGN_MULTILINE_CHAINED_METHODS",
                        "KEEP_FIRST_COLUMN_COMMENT",
                        "KEEP_LINE_BREAKS",
                        "ALIGN_MULTILINE_EXTENDS_LIST",
                        "ALIGN_MULTILINE_PARAMETERS",
                        "ALIGN_MULTILINE_PARAMETERS_IN_CALLS",
                        "ALIGN_MULTILINE_METHOD_BRACKETS",
                        "ALIGN_MULTILINE_BINARY_OPERATION",
                        "ELSE_ON_NEW_LINE",
                        "WHILE_ON_NEW_LINE",
                        "CATCH_ON_NEW_LINE",
                        "FINALLY_ON_NEW_LINE",
                        "CALL_PARAMETERS_WRAP",
                        "METHOD_PARAMETERS_WRAP",
                        "EXTENDS_LIST_WRAP",
                        "METHOD_ANNOTATION_WRAP",
                        "CLASS_ANNOTATION_WRAP",
                        "PARAMETER_ANNOTATION_WRAP",
                        "VARIABLE_ANNOTATION_WRAP",
                        "FIELD_ANNOTATION_WRAP",
                        "METHOD_PARAMETERS_LPAREN_ON_NEXT_LINE",
                        "METHOD_PARAMETERS_RPAREN_ON_NEXT_LINE",
                        "CALL_PARAMETERS_LPAREN_ON_NEXT_LINE",
                        "CALL_PARAMETERS_RPAREN_ON_NEXT_LINE",
                        "ENUM_CONSTANTS_WRAP"
                )
                consumer.renameStandardOption(CodeStyleSettingsCustomizable.WRAPPING_SWITCH_STATEMENT, "'when' statements")
                consumer.renameStandardOption("FIELD_ANNOTATION_WRAP", "Property annotations")
                showCustomOption(KotlinCodeStyleSettings::ALIGN_IN_COLUMNS_CASE_BRANCH,
                                 "Align 'when' branches in columns",
                                 CodeStyleSettingsCustomizable.WRAPPING_SWITCH_STATEMENT)

                showCustomOption(KotlinCodeStyleSettings::LBRACE_ON_NEXT_LINE,
                                "Put left brace on new line",
                                 CodeStyleSettingsCustomizable.WRAPPING_BRACES)
            }
            LanguageCodeStyleSettingsProvider.SettingsType.BLANK_LINES_SETTINGS -> {
                consumer.showStandardOptions(
                        "KEEP_BLANK_LINES_IN_CODE",
                        "KEEP_BLANK_LINES_IN_DECLARATIONS",
                        "KEEP_BLANK_LINES_BEFORE_RBRACE",
                        "BLANK_LINES_AFTER_CLASS_HEADER"
                )
                showCustomOption(KotlinCodeStyleSettings::BLANK_LINES_AROUND_BLOCK_WHEN_BRANCHES,
                                 "Around 'when' branches with {}",
                                 CodeStyleSettingsCustomizable.BLANK_LINES)
            }
            else -> consumer.showStandardOptions()
        }' @ [166:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'settingsType' @ [166:15] ==> value-parameter settingsType: LanguageCodeStyleSettingsProvider.SettingsType defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'SPACING_SETTINGS' @ [167:60] ==> enum entry SPACING_SETTINGS defined in com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider.SettingsType[FakeCallableDescriptorForObject]

'consumer' @ [168:17] ==> value-parameter consumer: CodeStyleSettingsCustomizable defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'showStandardOptions' @ [168:26] ==> public abstract fun showStandardOptions(vararg p0: (String..String?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaMethodDescriptor]

'showCustomOption' @ [184:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [184:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_AROUND_RANGE' @ [184:59] ==> public final var SPACE_AROUND_RANGE: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_AROUND_OPERATORS' @ [186:64] ==> public const final val SPACES_AROUND_OPERATORS: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [188:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [188:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_BEFORE_TYPE_COLON' @ [188:59] ==> public final var SPACE_BEFORE_TYPE_COLON: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [190:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [192:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [192:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_AFTER_TYPE_COLON' @ [192:59] ==> public final var SPACE_AFTER_TYPE_COLON: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [194:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [196:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [196:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_BEFORE_EXTEND_COLON' @ [196:59] ==> public final var SPACE_BEFORE_EXTEND_COLON: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [198:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [200:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [200:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_AFTER_EXTEND_COLON' @ [200:59] ==> public final var SPACE_AFTER_EXTEND_COLON: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [202:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [204:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [204:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'INSERT_WHITESPACES_IN_SIMPLE_ONE_LINE_METHOD' @ [204:59] ==> public final var INSERT_WHITESPACES_IN_SIMPLE_ONE_LINE_METHOD: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [206:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [208:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [208:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_AROUND_FUNCTION_TYPE_ARROW' @ [208:59] ==> public final var SPACE_AROUND_FUNCTION_TYPE_ARROW: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [210:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [212:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [212:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_AROUND_WHEN_ARROW' @ [212:59] ==> public final var SPACE_AROUND_WHEN_ARROW: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [214:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [216:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [216:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_BEFORE_LAMBDA_ARROW' @ [216:59] ==> public final var SPACE_BEFORE_LAMBDA_ARROW: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_OTHER' @ [218:64] ==> public const final val SPACES_OTHER: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [220:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [220:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'SPACE_BEFORE_WHEN_PARENTHESES' @ [220:59] ==> public final var SPACE_BEFORE_WHEN_PARENTHESES: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'SPACES_BEFORE_PARENTHESES' @ [222:64] ==> public const final val SPACES_BEFORE_PARENTHESES: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'WRAPPING_AND_BRACES_SETTINGS' @ [224:64] ==> enum entry WRAPPING_AND_BRACES_SETTINGS defined in com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider.SettingsType[FakeCallableDescriptorForObject]

'consumer' @ [225:21] ==> value-parameter consumer: CodeStyleSettingsCustomizable defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'showStandardOptions' @ [225:30] ==> public abstract fun showStandardOptions(vararg p0: (String..String?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaMethodDescriptor]

'consumer' @ [252:17] ==> value-parameter consumer: CodeStyleSettingsCustomizable defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'renameStandardOption' @ [252:26] ==> public open fun renameStandardOption(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaMethodDescriptor]

'WRAPPING_SWITCH_STATEMENT' @ [252:77] ==> public const final val WRAPPING_SWITCH_STATEMENT: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'consumer' @ [253:17] ==> value-parameter consumer: CodeStyleSettingsCustomizable defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'renameStandardOption' @ [253:26] ==> public open fun renameStandardOption(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaMethodDescriptor]

'showCustomOption' @ [254:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [254:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'ALIGN_IN_COLUMNS_CASE_BRANCH' @ [254:59] ==> public final var ALIGN_IN_COLUMNS_CASE_BRANCH: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'WRAPPING_SWITCH_STATEMENT' @ [256:64] ==> public const final val WRAPPING_SWITCH_STATEMENT: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'showCustomOption' @ [258:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [258:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'LBRACE_ON_NEXT_LINE' @ [258:59] ==> public final var LBRACE_ON_NEXT_LINE: Boolean defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'WRAPPING_BRACES' @ [260:64] ==> public const final val WRAPPING_BRACES: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'BLANK_LINES_SETTINGS' @ [262:60] ==> enum entry BLANK_LINES_SETTINGS defined in com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider.SettingsType[FakeCallableDescriptorForObject]

'consumer' @ [263:17] ==> value-parameter consumer: CodeStyleSettingsCustomizable defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'showStandardOptions' @ [263:26] ==> public abstract fun showStandardOptions(vararg p0: (String..String?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaMethodDescriptor]

'showCustomOption' @ [269:17] ==> local final fun showCustomOption(field: KProperty<*>, title: String, groupName: String? = ...): Unit defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[SimpleFunctionDescriptorImpl]

'KotlinCodeStyleSettings' @ [269:34] ==> public constructor KotlinCodeStyleSettings(p0: (CodeStyleSettings..CodeStyleSettings?)) defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaClassConstructorDescriptor]

'BLANK_LINES_AROUND_BLOCK_WHEN_BRANCHES' @ [269:59] ==> public final var BLANK_LINES_AROUND_BLOCK_WHEN_BRANCHES: Int defined in org.jetbrains.kotlin.idea.core.formatter.KotlinCodeStyleSettings[JavaPropertyDescriptor]

'BLANK_LINES' @ [271:64] ==> public const final val BLANK_LINES: (String..String?) defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaPropertyDescriptor]

'consumer' @ [273:21] ==> value-parameter consumer: CodeStyleSettingsCustomizable defined in org.jetbrains.kotlin.idea.formatter.KotlinLanguageCodeStyleSettingsProvider.customizeSettings[ValueParameterDescriptorImpl]

'showStandardOptions' @ [273:30] ==> public abstract fun showStandardOptions(vararg p0: (String..String?)): Unit defined in com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable[JavaMethodDescriptor]

'KotlinIndentOptionsEditor' @ [277:66] ==> public constructor KotlinIndentOptionsEditor() defined in org.jetbrains.kotlin.idea.formatter.KotlinIndentOptionsEditor[ClassConstructorDescriptorImpl]

'CommonCodeStyleSettings' @ [280:9] ==> public constructor CommonCodeStyleSettings(p0: (Language..Language?)) defined in com.intellij.psi.codeStyle.CommonCodeStyleSettings[JavaClassConstructorDescriptor]

'language' @ [280:33] ==> public final val KotlinLanguageCodeStyleSettingsProvider.language: KotlinLanguage[MyPropertyDescriptor]

'apply' @ [280:43] ==> @InlineOnly public inline fun <T> CommonCodeStyleSettings.apply(block: CommonCodeStyleSettings.() -> Unit): CommonCodeStyleSettings defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommonCodeStyleSettings

'initIndentOptions' @ [281:13] ==> @NotNull public open fun initIndentOptions(): CommonCodeStyleSettings.IndentOptions defined in com.intellij.psi.codeStyle.CommonCodeStyleSettings[JavaMethodDescriptor]

