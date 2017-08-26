'create' @ [35:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(List<String>..List<String>?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<String>

'create' @ [37:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'create' @ [39:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'create' @ [41:38] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): CompilerConfigurationKey<(String..String?)> defined in org.jetbrains.kotlin.config.CompilerConfigurationKey[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CliOption' @ [49:17] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [52:17] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [55:17] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'CliOption' @ [58:17] ==> public constructor CliOption(name: String, valueDescription: String, description: String, required: Boolean = ..., allowMultipleOccurrences: Boolean = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedClassConstructorDescriptor]

'ANNOTATION_COLLECTOR_COMPILER_PLUGIN_ID' @ [62:37] ==> public final val ANNOTATION_COLLECTOR_COMPILER_PLUGIN_ID: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'listOf' @ [65:13] ==> public fun <T> listOf(vararg elements: CliOption): List<CliOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOption

'ANNOTATION_FILTER_LIST_OPTION' @ [65:20] ==> public final val ANNOTATION_FILTER_LIST_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'OUTPUT_FILENAME_OPTION' @ [65:51] ==> public final val OUTPUT_FILENAME_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'STUBS_PATH_OPTION' @ [65:75] ==> public final val STUBS_PATH_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'INHERITED_ANNOTATIONS_OPTION' @ [65:94] ==> public final val INHERITED_ANNOTATIONS_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'when (option) {
            ANNOTATION_FILTER_LIST_OPTION -> {
                val annotations = value.split(',').filter { !it.isEmpty() }.toList()
                configuration.put(AnnotationCollectorConfigurationKeys.ANNOTATION_FILTER_LIST, annotations)
            }
            OUTPUT_FILENAME_OPTION -> configuration.put(AnnotationCollectorConfigurationKeys.OUTPUT_FILENAME, value)
            STUBS_PATH_OPTION -> configuration.put(AnnotationCollectorConfigurationKeys.STUBS_PATH, value)
            INHERITED_ANNOTATIONS_OPTION -> configuration.put(AnnotationCollectorConfigurationKeys.INHERITED, value)
            else -> throw CliOptionProcessingException("Unknown option: ${option.name}")
        }' @ [68:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'option' @ [68:15] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'ANNOTATION_FILTER_LIST_OPTION' @ [69:13] ==> public final val ANNOTATION_FILTER_LIST_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'value' @ [70:35] ==> value-parameter value: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'split' @ [70:41] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filter' @ [70:52] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!' @ [70:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [70:62] ==> value-parameter it: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [70:65] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toList' @ [70:77] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [71:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [71:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>, @NotNull p1: List<String>): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'ANNOTATION_FILTER_LIST' @ [71:72] ==> public final val ANNOTATION_FILTER_LIST: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'annotations' @ [71:96] ==> val annotations: List<String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[LocalVariableDescriptor]

'OUTPUT_FILENAME_OPTION' @ [73:13] ==> public final val OUTPUT_FILENAME_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [73:39] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [73:53] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'OUTPUT_FILENAME' @ [73:94] ==> public final val OUTPUT_FILENAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'value' @ [73:111] ==> value-parameter value: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'STUBS_PATH_OPTION' @ [74:13] ==> public final val STUBS_PATH_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [74:34] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [74:48] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'STUBS_PATH' @ [74:89] ==> public final val STUBS_PATH: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'value' @ [74:101] ==> value-parameter value: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'INHERITED_ANNOTATIONS_OPTION' @ [75:13] ==> public final val INHERITED_ANNOTATIONS_OPTION: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.Companion[PropertyDescriptorImpl]

'configuration' @ [75:45] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'put' @ [75:59] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'INHERITED' @ [75:100] ==> public final val INHERITED: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'value' @ [75:111] ==> value-parameter value: String defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'CliOptionProcessingException' @ [76:27] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedClassConstructorDescriptor]

'option' @ [76:75] ==> value-parameter option: CliOption defined in org.jetbrains.kotlin.annotation.AnnotationCollectorCommandLineProcessor.processOption[ValueParameterDescriptorImpl]

'name' @ [76:82] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'==' @ [83:43] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'configuration' @ [83:54] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [83:68] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'INHERITED' @ [83:109] ==> public final val INHERITED: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'configuration' @ [85:36] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [85:50] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(List<String>..List<String>?)>): List<String>? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<kotlin.String>?)

'ANNOTATION_FILTER_LIST' @ [85:91] ==> public final val ANNOTATION_FILTER_LIST: CompilerConfigurationKey<List<String>> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'configuration' @ [86:30] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [86:44] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'OUTPUT_FILENAME' @ [86:85] ==> public final val OUTPUT_FILENAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'outputFilename' @ [87:13] ==> val outputFilename: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'AnnotationCollectorExtension' @ [88:38] ==> public constructor AnnotationCollectorExtension(annotationFilterList: List<String>? = ..., outputFilename: String? = ..., supportInheritedAnnotations: Boolean) defined in org.jetbrains.kotlin.annotation.AnnotationCollectorExtension[ClassConstructorDescriptorImpl]

'annotationFilterList' @ [88:67] ==> val annotationFilterList: List<String>? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'outputFilename' @ [88:89] ==> val outputFilename: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'supportInheritedAnnotations' @ [88:105] ==> val supportInheritedAnnotations: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'ClassBuilderInterceptorExtension' @ [89:13] ==> public companion object : ProjectExtensionDescriptor<ClassBuilderInterceptorExtension> defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [89:46] ==> public final fun registerExtension(project: Project, extension: ClassBuilderInterceptorExtension): Unit defined in org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [89:64] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'collectorExtension' @ [89:73] ==> val collectorExtension: AnnotationCollectorExtension defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'configuration' @ [92:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [92:35] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'STUBS_PATH' @ [92:76] ==> public final val STUBS_PATH: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.annotation.AnnotationCollectorConfigurationKeys[PropertyDescriptorImpl]

'stubs' @ [93:13] ==> val stubs: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'configuration' @ [94:36] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'get' @ [94:50] ==> @NotNull public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.cli.common.messages.MessageCollector..org.jetbrains.kotlin.cli.common.messages.MessageCollector?)

'MESSAGE_COLLECTOR_KEY' @ [94:75] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'NONE' @ [94:115] ==> public final val NONE: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion[DeserializedPropertyDescriptor]

'configuration' @ [95:37] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'getBoolean' @ [95:51] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'REPORT_OUTPUT_FILES' @ [95:86] ==> @field:JvmField public final val REPORT_OUTPUT_FILES: CompilerConfigurationKey<Boolean> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'AnalysisHandlerExtension' @ [96:13] ==> public companion object : ProjectExtensionDescriptor<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension[FakeCallableDescriptorForObject]

'registerExtension' @ [96:38] ==> public final fun registerExtension(project: Project, extension: AnalysisHandlerExtension): Unit defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [96:56] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[ValueParameterDescriptorImpl]

'StubProducerExtension' @ [96:65] ==> public constructor StubProducerExtension(stubsOutputDir: File, messageCollector: MessageCollector, reportOutputFiles: Boolean) defined in org.jetbrains.kotlin.annotation.StubProducerExtension[ClassConstructorDescriptorImpl]

'File' @ [96:87] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'stubs' @ [96:92] ==> val stubs: String? defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'messageCollector' @ [96:100] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

'reportOutputFiles' @ [96:118] ==> val reportOutputFiles: Boolean defined in org.jetbrains.kotlin.annotation.AnnotationCollectorComponentRegistrar.registerProjectComponents[LocalVariableDescriptor]

