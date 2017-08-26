'create' @ [41:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'create' @ [43:83] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'create' @ [45:91] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'mapOf' @ [51:33] ==> public fun <K, V> mapOf(pair: Pair<String, List<String>>): Map<String, List<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<String>

'to' @ [51:39] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [51:48] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'CliOption' @ [53:33] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [56:29] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'SUPPORTED_PRESETS' @ [56:75] ==> public final val SUPPORTED_PRESETS: Map<String, List<String>> defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'keys' @ [56:93] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'joinToString' @ [56:98] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'CliOption' @ [59:42] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'PLUGIN_ID' @ [66:29] ==> public final val PLUGIN_ID: String defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'listOf' @ [67:34] ==> public fun <T> listOf(vararg elements: CliOption): List<CliOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOption

'ANNOTATION_OPTION' @ [67:41] ==> public final val ANNOTATION_OPTION: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'PRESET_OPTION' @ [67:60] ==> public final val PRESET_OPTION: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'INVOKE_INITIALIZERS_OPTION' @ [67:75] ==> public final val INVOKE_INITIALIZERS_OPTION: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'when (option) {
        ANNOTATION_OPTION -> configuration.appendList(ANNOTATION, value)
        PRESET_OPTION -> configuration.appendList(PRESET, value)
        INVOKE_INITIALIZERS_OPTION -> configuration.put(INVOKE_INITIALIZERS, value == "true")
        else -> throw CliOptionProcessingException("Unknown option: ${option.name}")
    }' @ [69:106] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'option' @ [69:112] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'ANNOTATION_OPTION' @ [70:9] ==> public final val ANNOTATION_OPTION: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [70:30] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'appendList' @ [70:44] ==> public open fun <T> CompilerConfiguration.appendList(option: CompilerConfigurationKey<List<String>>, value: String): Unit defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ANNOTATION' @ [70:55] ==> public final val ANNOTATION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.noarg.NoArgConfigurationKeys[PropertyImportedFromObject]

'value' @ [70:67] ==> value-parameter value: String defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'PRESET_OPTION' @ [71:9] ==> public final val PRESET_OPTION: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [71:26] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'appendList' @ [71:40] ==> public open fun <T> CompilerConfiguration.appendList(option: CompilerConfigurationKey<List<String>>, value: String): Unit defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'PRESET' @ [71:51] ==> public final val PRESET: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.noarg.NoArgConfigurationKeys[PropertyImportedFromObject]

'value' @ [71:59] ==> value-parameter value: String defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'INVOKE_INITIALIZERS_OPTION' @ [72:9] ==> public final val INVOKE_INITIALIZERS_OPTION: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [72:39] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [72:53] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'INVOKE_INITIALIZERS' @ [72:57] ==> public final val INVOKE_INITIALIZERS: CompilerConfigurationKey<Boolean> defined in org.jetbrains.kotlin.noarg.NoArgConfigurationKeys[PropertyImportedFromObject]

'value' @ [72:78] ==> value-parameter value: String defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'CliOptionProcessingException' @ [73:23] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedClassConstructorDescriptor]

'option' @ [73:71] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'name' @ [73:78] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'configuration' @ [79:27] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [79:41] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>): List<String>? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'ANNOTATION' @ [79:45] ==> public final val ANNOTATION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.noarg.NoArgConfigurationKeys[PropertyImportedFromObject]

'toMutableList' @ [79:58] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mutableListOf' @ [79:77] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [80:9] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [80:23] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>): List<String>? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'PRESET' @ [80:27] ==> public final val PRESET: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.noarg.NoArgConfigurationKeys[PropertyImportedFromObject]

'forEach' @ [80:36] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'SUPPORTED_PRESETS' @ [81:13] ==> public final val SUPPORTED_PRESETS: Map<String, List<String>> defined in org.jetbrains.kotlin.noarg.NoArgCommandLineProcessor.Companion[PropertyImportedFromObject]

'preset' @ [81:31] ==> value-parameter preset: String defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [81:40] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'annotations' @ [81:46] ==> val annotations: MutableList<String> defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'it' @ [81:61] ==> value-parameter it: List<String> defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [83:13] ==> val annotations: MutableList<String> defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'isEmpty' @ [83:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'StorageComponentContainerContributor' @ [85:9] ==> public companion object : ProjectExtensionDescriptor<StorageComponentContainerContributor> defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor[FakeCallableDescriptorForObject]

'registerExtension' @ [85:46] ==> public final fun registerExtension(project: Project, extension: StorageComponentContainerContributor): Unit defined in org.jetbrains.kotlin.extensions.StorageComponentContainerContributor.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [85:64] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'CliNoArgComponentContainerContributor' @ [85:73] ==> public constructor CliNoArgComponentContainerContributor(annotations: List<String>) defined in org.jetbrains.kotlin.noarg.CliNoArgComponentContainerContributor[ClassConstructorDescriptorImpl]

'annotations' @ [85:111] ==> val annotations: MutableList<String> defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'configuration' @ [87:34] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'INVOKE_INITIALIZERS' @ [87:48] ==> public final val INVOKE_INITIALIZERS: CompilerConfigurationKey<Boolean> defined in org.jetbrains.kotlin.noarg.NoArgConfigurationKeys[PropertyImportedFromObject]

'ExpressionCodegenExtension' @ [88:9] ==> public companion object : ProjectExtensionDescriptor<ExpressionCodegenExtension> defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [88:36] ==> public final fun registerExtension(project: Project, extension: ExpressionCodegenExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [88:54] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'NoArgExpressionCodegenExtension' @ [88:63] ==> public constructor NoArgExpressionCodegenExtension(invokeInitializers: Boolean = ...) defined in org.jetbrains.kotlin.noarg.NoArgExpressionCodegenExtension[ClassConstructorDescriptorImpl]

'invokeInitializers' @ [88:95] ==> val invokeInitializers: Boolean defined in org.jetbrains.kotlin.noarg.NoArgComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'platform' @ [96:13] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.noarg.CliNoArgComponentContainerContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'JvmPlatform' @ [96:25] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'container' @ [98:9] ==> value-parameter container: StorageComponentContainer defined in org.jetbrains.kotlin.noarg.CliNoArgComponentContainerContributor.registerModuleComponents[ValueParameterDescriptorImpl]

'useInstance' @ [98:19] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'CliNoArgDeclarationChecker' @ [98:31] ==> public constructor CliNoArgDeclarationChecker(noArgAnnotationFqNames: List<String>) defined in org.jetbrains.kotlin.noarg.diagnostic.CliNoArgDeclarationChecker[ClassConstructorDescriptorImpl]

'annotations' @ [98:58] ==> public final val annotations: List<String> defined in org.jetbrains.kotlin.noarg.CliNoArgComponentContainerContributor[PropertyDescriptorImpl]

