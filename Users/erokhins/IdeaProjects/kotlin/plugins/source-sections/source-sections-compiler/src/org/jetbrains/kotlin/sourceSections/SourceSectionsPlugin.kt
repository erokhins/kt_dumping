'create' @ [32:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'CliOption' @ [37:31] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'PLUGIN_ID' @ [43:29] ==> public final val PLUGIN_ID: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.Companion[PropertyDescriptorImpl]

'listOf' @ [44:34] ==> public fun <T> listOf(element: CliOption): List<CliOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOption

'SECTIONS_OPTION' @ [44:41] ==> public final val SECTIONS_OPTION: CliOption defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.Companion[PropertyDescriptorImpl]

'when (option) {
        SECTIONS_OPTION -> {
            val paths = configuration.getList(SourceSectionsConfigurationKeys.SECTIONS_OPTION).toMutableList()
            paths.add(value)
            configuration.put(SourceSectionsConfigurationKeys.SECTIONS_OPTION, paths)
        }
        else -> throw CliOptionProcessingException("Unknown option: ${option.name}")
    }' @ [46:106] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'option' @ [46:112] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'SECTIONS_OPTION' @ [47:9] ==> public final val SECTIONS_OPTION: CliOption defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [48:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'getList' @ [48:39] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'SECTIONS_OPTION' @ [48:79] ==> public final val SECTIONS_OPTION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsConfigurationKeys[PropertyDescriptorImpl]

'toMutableList' @ [48:96] ==> public fun <T> Collection<(String..String?)>.toMutableList(): MutableList<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'paths' @ [49:13] ==> val paths: MutableList<(String..String?)> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.processOption[LocalVariableDescriptor]

'add' @ [49:19] ==> public abstract fun add(element: (String..String?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'value' @ [49:23] ==> value-parameter value: String defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'configuration' @ [50:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [50:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>, @NotNull p1: List<String>): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'SECTIONS_OPTION' @ [50:63] ==> public final val SECTIONS_OPTION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsConfigurationKeys[PropertyDescriptorImpl]

'paths' @ [50:80] ==> val paths: MutableList<(String..String?)> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.processOption[LocalVariableDescriptor]

'CliOptionProcessingException' @ [52:23] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedClassConstructorDescriptor]

'option' @ [52:71] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.sourceSections.SourceSectionsCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'name' @ [52:78] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'configuration' @ [58:24] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.sourceSections.SourceSectionsComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [58:38] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>): List<String>? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'SECTIONS_OPTION' @ [58:74] ==> public final val SECTIONS_OPTION: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsConfigurationKeys[PropertyDescriptorImpl]

'registerAllowedSourceSections' @ [59:9] ==> public fun registerAllowedSourceSections(project: Project, sections: List<String>): Unit defined in org.jetbrains.kotlin.sourceSections in file SourceSectionsPlugin.kt[SimpleFunctionDescriptorImpl]

'project' @ [59:39] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.sourceSections.SourceSectionsComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'sections' @ [59:48] ==> val sections: List<String> defined in org.jetbrains.kotlin.sourceSections.SourceSectionsComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'!' @ [64:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sections' @ [64:10] ==> value-parameter sections: List<String> defined in org.jetbrains.kotlin.sourceSections.registerAllowedSourceSections[ValueParameterDescriptorImpl]

'isEmpty' @ [64:19] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'PreprocessedVirtualFileFactoryExtension' @ [65:9] ==> public companion object : ProjectExtensionDescriptor<PreprocessedVirtualFileFactoryExtension> defined in org.jetbrains.kotlin.extensions.PreprocessedVirtualFileFactoryExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [65:49] ==> public final fun registerExtension(project: Project, extension: PreprocessedVirtualFileFactoryExtension): Unit defined in org.jetbrains.kotlin.extensions.PreprocessedVirtualFileFactoryExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [65:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.sourceSections.registerAllowedSourceSections[ValueParameterDescriptorImpl]

'FilteredSectionsVirtualFileExtension' @ [65:76] ==> public constructor FilteredSectionsVirtualFileExtension(allowedSections: Set<String>?) defined in org.jetbrains.kotlin.sourceSections.FilteredSectionsVirtualFileExtension[ClassConstructorDescriptorImpl]

'sections' @ [65:113] ==> value-parameter sections: List<String> defined in org.jetbrains.kotlin.sourceSections.registerAllowedSourceSections[ValueParameterDescriptorImpl]

'toHashSet' @ [65:122] ==> public fun <T> Iterable<String>.toHashSet(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

