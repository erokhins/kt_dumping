'RuntimeException' @ [29:85] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'message' @ [29:102] ==> value-parameter message: String defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException.<init>[ValueParameterDescriptorImpl]

'cause' @ [29:111] ==> value-parameter cause: Throwable? = ... defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException.<init>[ValueParameterDescriptorImpl]

'CliOptionProcessingException' @ [36:4] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[ClassConstructorDescriptorImpl]

'message' @ [36:33] ==> value-parameter message: String defined in org.jetbrains.kotlin.compiler.plugin.PluginCliOptionProcessingException.<init>[ValueParameterDescriptorImpl]

'cause' @ [36:42] ==> value-parameter cause: Throwable? = ... defined in org.jetbrains.kotlin.compiler.plugin.PluginCliOptionProcessingException.<init>[ValueParameterDescriptorImpl]

'options' @ [42:27] ==> value-parameter options: Collection<CliOption> defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[ValueParameterDescriptorImpl]

'map' @ [42:35] ==> public inline fun <T, R> Iterable<CliOption>.map(transform: (CliOption) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOption
    <R> -> String

'it' @ [43:23] ==> value-parameter it: CliOption defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [43:26] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[PropertyDescriptorImpl]

'it' @ [43:34] ==> value-parameter it: CliOption defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[ValueParameterDescriptorImpl]

'valueDescription' @ [43:37] ==> public final val valueDescription: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[PropertyDescriptorImpl]

'if (name.length > MAX_OPTION_WIDTH) {
            "\n" + " ".repeat(MAX_OPTION_WIDTH + LEFT_INDENT + 1)
        } else " ".repeat(1 + MAX_OPTION_WIDTH - name.length)' @ [44:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'name' @ [44:26] ==> val name: String defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[LocalVariableDescriptor]

'length' @ [44:31] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'MAX_OPTION_WIDTH' @ [44:40] ==> val MAX_OPTION_WIDTH: Int defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[LocalVariableDescriptor]

'+' @ [45:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'repeat' @ [45:24] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'MAX_OPTION_WIDTH' @ [45:31] ==> val MAX_OPTION_WIDTH: Int defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[LocalVariableDescriptor]

'LEFT_INDENT' @ [45:50] ==> val LEFT_INDENT: Int defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[LocalVariableDescriptor]

'repeat' @ [46:20] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [46:27] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'MAX_OPTION_WIDTH' @ [46:31] ==> val MAX_OPTION_WIDTH: Int defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[LocalVariableDescriptor]

'name' @ [46:50] ==> val name: String defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[LocalVariableDescriptor]

'length' @ [46:55] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'listOfNotNull' @ [48:25] ==> public fun <T : Any> listOfNotNull(vararg elements: String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'if (it.required) "required" else null' @ [49:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'it' @ [49:21] ==> value-parameter it: CliOption defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[ValueParameterDescriptorImpl]

'required' @ [49:24] ==> public final val required: Boolean defined in org.jetbrains.kotlin.compiler.plugin.CliOption[PropertyDescriptorImpl]

'if (it.allowMultipleOccurrences) "multiple" else null' @ [50:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'it' @ [50:21] ==> value-parameter it: CliOption defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[ValueParameterDescriptorImpl]

'allowMultipleOccurrences' @ [50:24] ==> public final val allowMultipleOccurrences: Boolean defined in org.jetbrains.kotlin.compiler.plugin.CliOption[PropertyDescriptorImpl]

'if (modifiers.isEmpty()) "" else " (${modifiers.joinToString()})"' @ [51:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'modifiers' @ [51:37] ==> val modifiers: List<String> defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [51:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [51:71] ==> val modifiers: List<String> defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [51:81] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'+' @ [53:9] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'repeat' @ [53:13] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LEFT_INDENT' @ [53:20] ==> val LEFT_INDENT: Int defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[LocalVariableDescriptor]

'name' @ [53:35] ==> val name: String defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[LocalVariableDescriptor]

'margin' @ [53:42] ==> val margin: String defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[LocalVariableDescriptor]

'it' @ [53:51] ==> value-parameter it: CliOption defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [53:54] ==> public final val description: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[PropertyDescriptorImpl]

'modifiersEnclosed' @ [53:68] ==> val modifiersEnclosed: String defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString.<anonymous>[LocalVariableDescriptor]

'+' @ [55:12] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'pluginId' @ [55:23] ==> value-parameter pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[ValueParameterDescriptorImpl]

'renderedOptions' @ [55:46] ==> val renderedOptions: List<String> defined in org.jetbrains.kotlin.compiler.plugin.cliPluginUsageString[LocalVariableDescriptor]

'joinToString' @ [55:62] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pluginId' @ [63:33] ==> public final val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.CliOptionValue[PropertyDescriptorImpl]

'optionName' @ [63:43] ==> public final val optionName: String defined in org.jetbrains.kotlin.compiler.plugin.CliOptionValue[PropertyDescriptorImpl]

'value' @ [63:55] ==> public final val value: String defined in org.jetbrains.kotlin.compiler.plugin.CliOptionValue[PropertyDescriptorImpl]

'compile' @ [67:27] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'pattern' @ [68:19] ==> val pattern: (Pattern..Pattern?) defined in org.jetbrains.kotlin.compiler.plugin.parsePluginOption[LocalVariableDescriptor]

'matcher' @ [68:27] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'argumentValue' @ [68:35] ==> value-parameter argumentValue: String defined in org.jetbrains.kotlin.compiler.plugin.parsePluginOption[ValueParameterDescriptorImpl]

'matcher' @ [69:9] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.compiler.plugin.parsePluginOption[LocalVariableDescriptor]

'matches' @ [69:17] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'CliOptionValue' @ [70:16] ==> public constructor CliOptionValue(pluginId: String, optionName: String, value: String) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionValue[ClassConstructorDescriptorImpl]

'matcher' @ [70:31] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.compiler.plugin.parsePluginOption[LocalVariableDescriptor]

'group' @ [70:39] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [70:49] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.compiler.plugin.parsePluginOption[LocalVariableDescriptor]

'group' @ [70:57] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [70:67] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.compiler.plugin.parsePluginOption[LocalVariableDescriptor]

'group' @ [70:75] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'pluginId' @ [77:21] ==> value-parameter pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.getPluginOptionString[ValueParameterDescriptorImpl]

'key' @ [77:31] ==> value-parameter key: String defined in org.jetbrains.kotlin.compiler.plugin.getPluginOptionString[ValueParameterDescriptorImpl]

'value' @ [77:36] ==> value-parameter value: String defined in org.jetbrains.kotlin.compiler.plugin.getPluginOptionString[ValueParameterDescriptorImpl]

