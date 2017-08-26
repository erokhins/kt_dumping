'create' @ [33:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'create' @ [35:83] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'mapOf' @ [40:33] ==> public fun <K, V> mapOf(pair: Pair<String, List<String>>): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'to' @ [40:39] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [40:51] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'CliOption' @ [47:33] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [50:29] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'SUPPORTED_PRESETS' @ [50:75] ==> public final val SUPPORTED_PRESETS: Map<String, List<String>> defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.Companion[PropertyDescriptorImpl]

'keys' @ [50:93] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'joinToString' @ [50:98] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'PLUGIN_ID' @ [56:29] ==> public final val PLUGIN_ID: String defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.Companion[PropertyDescriptorImpl]

'listOf' @ [57:34] ==> public fun <T> listOf(vararg elements: CliOption): List<CliOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOption

'ANNOTATION_OPTION' @ [57:41] ==> public final val ANNOTATION_OPTION: CliOption defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.Companion[PropertyDescriptorImpl]

'PRESET_OPTION' @ [57:60] ==> public final val PRESET_OPTION: CliOption defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.Companion[PropertyDescriptorImpl]

'when (option) {
        ANNOTATION_OPTION -> configuration.appendList(ANNOTATION, value)
        PRESET_OPTION -> configuration.appendList(PRESET, value)
        else -> throw CliOptionProcessingException("Unknown option: ${option.name}")
    }' @ [59:106] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'option' @ [59:112] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'ANNOTATION_OPTION' @ [60:9] ==> public final val ANNOTATION_OPTION: CliOption defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [60:30] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'appendList' @ [60:44] ==> public open fun <T> CompilerConfiguration.appendList(option: CompilerConfigurationKey<List<String>>, value: String): Unit defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ANNOTATION' @ [60:55] ==> public final val ANNOTATION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.allopen.AllOpenConfigurationKeys[PropertyImportedFromObject]

'value' @ [60:67] ==> value-parameter value: String defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'PRESET_OPTION' @ [61:9] ==> public final val PRESET_OPTION: CliOption defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [61:26] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'appendList' @ [61:40] ==> public open fun <T> CompilerConfiguration.appendList(option: CompilerConfigurationKey<List<String>>, value: String): Unit defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'PRESET' @ [61:51] ==> public final val PRESET: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.allopen.AllOpenConfigurationKeys[PropertyImportedFromObject]

'value' @ [61:59] ==> value-parameter value: String defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'CliOptionProcessingException' @ [62:23] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedClassConstructorDescriptor]

'option' @ [62:71] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'name' @ [62:78] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'configuration' @ [68:27] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [68:41] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>): List<String>? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'ANNOTATION' @ [68:45] ==> public final val ANNOTATION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.allopen.AllOpenConfigurationKeys[PropertyImportedFromObject]

'toMutableList' @ [68:58] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mutableListOf' @ [68:77] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [69:9] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [69:23] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>): List<String>? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'PRESET' @ [69:27] ==> public final val PRESET: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.allopen.AllOpenConfigurationKeys[PropertyImportedFromObject]

'forEach' @ [69:36] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SUPPORTED_PRESETS' @ [70:13] ==> public final val SUPPORTED_PRESETS: Map<String, List<String>> defined in org.jetbrains.kotlin.allopen.AllOpenCommandLineProcessor.Companion[PropertyImportedFromObject]

'preset' @ [70:31] ==> value-parameter preset: String defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [70:40] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'annotations' @ [70:46] ==> val annotations: MutableList<String> defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'it' @ [70:61] ==> value-parameter it: List<String> defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [72:13] ==> val annotations: MutableList<String> defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'isEmpty' @ [72:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'DeclarationAttributeAltererExtension' @ [74:9] ==> public companion object : ProjectExtensionDescriptor<DeclarationAttributeAltererExtension> defined in org.jetbrains.kotlin.extensions.DeclarationAttributeAltererExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [74:46] ==> public final fun registerExtension(project: Project, extension: DeclarationAttributeAltererExtension): Unit defined in org.jetbrains.kotlin.extensions.DeclarationAttributeAltererExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [74:64] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'CliAllOpenDeclarationAttributeAltererExtension' @ [74:73] ==> public constructor CliAllOpenDeclarationAttributeAltererExtension(allOpenAnnotationFqNames: List<String>) defined in org.jetbrains.kotlin.allopen.CliAllOpenDeclarationAttributeAltererExtension[ClassConstructorDescriptorImpl]

'annotations' @ [74:120] ==> val annotations: MutableList<String> defined in org.jetbrains.kotlin.allopen.AllOpenComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

