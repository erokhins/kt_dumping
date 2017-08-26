'JvmStatic' @ [29:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'PluginURLClassLoader' @ [31:27] ==> public constructor PluginURLClassLoader(urls: Array<URL>, parent: ClassLoader) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader[ClassConstructorDescriptorImpl]

'arguments' @ [32:17] ==> value-parameter arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[ValueParameterDescriptorImpl]

'pluginClasspaths' @ [32:27] ==> @Argument public final var pluginClasspaths: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'map' @ [33:27] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.net.URL..java.net.URL?)

'File' @ [33:33] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [33:38] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [33:42] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [33:50] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [34:27] ==> public inline fun <reified T> Collection<URL>.toTypedArray(): Array<URL> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> URL

'arrayOf' @ [35:28] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: URL): Array<URL> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> URL

'this' @ [36:17] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser[LazyClassReceiverParameterDescriptor]

'java' @ [36:29] ==> public val <T> KClass<out PluginCliParser>.java: Class<out PluginCliParser> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PluginCliParser

'classLoader' @ [36:34] ==> public final val <T : (Any..Any?)> Class<out PluginCliParser>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PluginCliParser

'load' @ [39:49] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(ComponentRegistrar..ComponentRegistrar?)>..Class<(ComponentRegistrar..ComponentRegistrar?)>?), p1: (ClassLoader..ClassLoader?)): (ServiceLoader<(ComponentRegistrar..ComponentRegistrar?)>..ServiceLoader<(ComponentRegistrar..ComponentRegistrar?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ComponentRegistrar

'ComponentRegistrar' @ [39:54] ==> public companion object defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar[FakeCallableDescriptorForObject]

'java' @ [39:80] ==> public val <T> KClass<ComponentRegistrar>.java: Class<ComponentRegistrar> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ComponentRegistrar

'classLoader' @ [39:86] ==> val classLoader: PluginURLClassLoader defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[LocalVariableDescriptor]

'toMutableList' @ [39:99] ==> public fun <T> Iterable<(ComponentRegistrar..ComponentRegistrar?)>.toMutableList(): MutableList<(ComponentRegistrar..ComponentRegistrar?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar..org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar?)

'componentRegistrars' @ [40:9] ==> val componentRegistrars: MutableList<(ComponentRegistrar..ComponentRegistrar?)> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[LocalVariableDescriptor]

'addAll' @ [40:29] ==> public abstract fun addAll(elements: Collection<(ComponentRegistrar..ComponentRegistrar?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'BundledCompilerPlugins' @ [40:36] ==> public object BundledCompilerPlugins defined in org.jetbrains.kotlin.cli.jvm in file BundledCompilerPlugins.kt[FakeCallableDescriptorForObject]

'componentRegistrars' @ [40:59] ==> public final val componentRegistrars: List<ComponentRegistrar> defined in org.jetbrains.kotlin.cli.jvm.BundledCompilerPlugins[PropertyDescriptorImpl]

'configuration' @ [41:9] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[ValueParameterDescriptorImpl]

'addAll' @ [41:23] ==> public open fun <T : (Any..Any?)> addAll(@NotNull p0: CompilerConfigurationKey<(MutableList<(ComponentRegistrar..ComponentRegistrar?)>..List<(ComponentRegistrar..ComponentRegistrar?)>?)>, @NotNull p1: (MutableCollection<(ComponentRegistrar..ComponentRegistrar?)>..Collection<(ComponentRegistrar..ComponentRegistrar?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ComponentRegistrar

'ComponentRegistrar' @ [41:30] ==> public companion object defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar[FakeCallableDescriptorForObject]

'PLUGIN_COMPONENT_REGISTRARS' @ [41:49] ==> public final val PLUGIN_COMPONENT_REGISTRARS: CompilerConfigurationKey<MutableList<ComponentRegistrar>> defined in org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar.Companion[DeserializedPropertyDescriptor]

'componentRegistrars' @ [41:78] ==> val componentRegistrars: MutableList<(ComponentRegistrar..ComponentRegistrar?)> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[LocalVariableDescriptor]

'processPluginOptions' @ [43:9] ==> private final fun processPluginOptions(arguments: CommonCompilerArguments, configuration: CompilerConfiguration, classLoader: ClassLoader): Unit defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser[SimpleFunctionDescriptorImpl]

'arguments' @ [43:30] ==> value-parameter arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[ValueParameterDescriptorImpl]

'configuration' @ [43:41] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[ValueParameterDescriptorImpl]

'classLoader' @ [43:56] ==> val classLoader: PluginURLClassLoader defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.loadPlugins[LocalVariableDescriptor]

'arguments' @ [51:36] ==> value-parameter arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[ValueParameterDescriptorImpl]

'pluginOptions' @ [51:46] ==> @Argument public final var pluginOptions: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'map' @ [51:61] ==> public inline fun <T, R> Array<out String>.map(transform: (String) -> CliOptionValue?): List<CliOptionValue?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> CliOptionValue?

'groupBy' @ [51:87] ==> public inline fun <T, K> Iterable<CliOptionValue?>.groupBy(keySelector: (CliOptionValue?) -> String): Map<String, List<CliOptionValue?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOptionValue?
    <K> -> String

'it' @ [52:17] ==> value-parameter it: CliOptionValue? defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions.<anonymous>[ValueParameterDescriptorImpl]

'CliOptionProcessingException' @ [52:35] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedClassConstructorDescriptor]

'it' @ [52:94] ==> value-parameter it: CliOptionValue? defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions.<anonymous>[ValueParameterDescriptorImpl]

'CommonCompilerArguments' @ [52:110] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'PLUGIN_OPTION_FORMAT' @ [52:134] ==> public const final val PLUGIN_OPTION_FORMAT: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'it' @ [53:13] ==> value-parameter it: CliOptionValue? defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions.<anonymous>[ValueParameterDescriptorImpl]

'pluginId' @ [53:16] ==> public final val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.CliOptionValue[DeserializedPropertyDescriptor]

'mapOf' @ [54:14] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<String, List<CliOptionValue?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<CliOptionValue?>

'load' @ [56:51] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(CommandLineProcessor..CommandLineProcessor?)>..Class<(CommandLineProcessor..CommandLineProcessor?)>?), p1: (ClassLoader..ClassLoader?)): (ServiceLoader<(CommandLineProcessor..CommandLineProcessor?)>..ServiceLoader<(CommandLineProcessor..CommandLineProcessor?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> CommandLineProcessor

'java' @ [56:84] ==> public val <T> KClass<CommandLineProcessor>.java: Class<CommandLineProcessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CommandLineProcessor

'classLoader' @ [56:90] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[ValueParameterDescriptorImpl]

'toMutableList' @ [56:103] ==> public fun <T> Iterable<(CommandLineProcessor..CommandLineProcessor?)>.toMutableList(): MutableList<(CommandLineProcessor..CommandLineProcessor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor..org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor?)

'commandLineProcessors' @ [57:9] ==> val commandLineProcessors: MutableList<(CommandLineProcessor..CommandLineProcessor?)> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'addAll' @ [57:31] ==> public abstract fun addAll(elements: Collection<(CommandLineProcessor..CommandLineProcessor?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'BundledCompilerPlugins' @ [57:38] ==> public object BundledCompilerPlugins defined in org.jetbrains.kotlin.cli.jvm in file BundledCompilerPlugins.kt[FakeCallableDescriptorForObject]

'commandLineProcessors' @ [57:61] ==> public final val commandLineProcessors: List<CommandLineProcessor> defined in org.jetbrains.kotlin.cli.jvm.BundledCompilerPlugins[PropertyDescriptorImpl]

'commandLineProcessors' @ [59:27] ==> val commandLineProcessors: MutableList<(CommandLineProcessor..CommandLineProcessor?)> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'processor' @ [60:35] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginOptions' @ [60:45] ==> public abstract val pluginOptions: Collection<CliOption> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'associateBy' @ [60:59] ==> public inline fun <T, K> Iterable<CliOption>.associateBy(keySelector: (CliOption) -> String): Map<String, CliOption> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOption
    <K> -> String

'it' @ [60:73] ==> value-parameter it: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [60:76] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'MultiMap' @ [61:35] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> CliOption
    <V : (Any..Any?)> -> CliOptionValue

'optionValuesByPlugin' @ [63:33] ==> val optionValuesByPlugin: Map<String, List<CliOptionValue?>> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'processor' @ [63:54] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginId' @ [63:64] ==> public abstract val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'orEmpty' @ [63:74] ==> @InlineOnly public inline fun <T> List<CliOptionValue?>?.orEmpty(): List<CliOptionValue?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CliOptionValue?

'declaredOptions' @ [64:30] ==> val declaredOptions: Map<String, CliOption> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'optionValue' @ [64:46] ==> val optionValue: CliOptionValue? defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'optionName' @ [64:60] ==> public final val optionName: String defined in org.jetbrains.kotlin.compiler.plugin.CliOptionValue[DeserializedPropertyDescriptor]

'CliOptionProcessingException' @ [65:39] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedClassConstructorDescriptor]

'optionValue' @ [65:97] ==> val optionValue: CliOptionValue? defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'optionsToValues' @ [66:17] ==> val optionsToValues: MultiMap<CliOption, CliOptionValue> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'putValue' @ [66:33] ==> public open fun putValue(@Nullable p0: CliOption?, p1: (CliOptionValue..CliOptionValue?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'option' @ [66:42] ==> val option: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'optionValue' @ [66:50] ==> val optionValue: CliOptionValue? defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'processor' @ [69:28] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginOptions' @ [69:38] ==> public abstract val pluginOptions: Collection<CliOption> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'optionsToValues' @ [70:30] ==> val optionsToValues: MultiMap<CliOption, CliOptionValue> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'option' @ [70:46] ==> val option: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'option' @ [71:21] ==> val option: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'required' @ [71:28] ==> public final val required: Boolean defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'values' @ [71:40] ==> val values: (MutableCollection<(CliOptionValue..CliOptionValue?)>..Collection<(CliOptionValue..CliOptionValue?)>) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'isEmpty' @ [71:47] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'PluginCliOptionProcessingException' @ [72:27] ==> public constructor PluginCliOptionProcessingException(pluginId: String, options: Collection<CliOption>, message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.PluginCliOptionProcessingException[DeserializedClassConstructorDescriptor]

'processor' @ [73:29] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginId' @ [73:39] ==> public abstract val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'processor' @ [74:29] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginOptions' @ [74:39] ==> public abstract val pluginOptions: Collection<CliOption> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'processor' @ [75:68] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginId' @ [75:78] ==> public abstract val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'option' @ [75:90] ==> val option: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'name' @ [75:97] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'!' @ [77:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'option' @ [77:22] ==> val option: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'allowMultipleOccurrences' @ [77:29] ==> public final val allowMultipleOccurrences: Boolean defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'values' @ [77:57] ==> val values: (MutableCollection<(CliOptionValue..CliOptionValue?)>..Collection<(CliOptionValue..CliOptionValue?)>) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'size' @ [77:64] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'PluginCliOptionProcessingException' @ [78:27] ==> public constructor PluginCliOptionProcessingException(pluginId: String, options: Collection<CliOption>, message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.PluginCliOptionProcessingException[DeserializedClassConstructorDescriptor]

'processor' @ [79:29] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginId' @ [79:39] ==> public abstract val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'processor' @ [80:29] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginOptions' @ [80:39] ==> public abstract val pluginOptions: Collection<CliOption> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'processor' @ [81:82] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'pluginId' @ [81:92] ==> public abstract val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedPropertyDescriptor]

'option' @ [81:104] ==> val option: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'name' @ [81:111] ==> public final val name: String defined in org.jetbrains.kotlin.compiler.plugin.CliOption[DeserializedPropertyDescriptor]

'values' @ [84:31] ==> val values: (MutableCollection<(CliOptionValue..CliOptionValue?)>..Collection<(CliOptionValue..CliOptionValue?)>) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'processor' @ [85:21] ==> val processor: (CommandLineProcessor..CommandLineProcessor?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'processOption' @ [85:31] ==> public abstract fun processOption(option: CliOption, value: String, configuration: CompilerConfiguration): Unit defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor[DeserializedSimpleFunctionDescriptor]

'option' @ [85:45] ==> val option: CliOption defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'value' @ [85:53] ==> val value: (CliOptionValue..CliOptionValue?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[LocalVariableDescriptor]

'value' @ [85:59] ==> public final val value: String defined in org.jetbrains.kotlin.compiler.plugin.CliOptionValue[DeserializedPropertyDescriptor]

'configuration' @ [85:66] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser.processPluginOptions[ValueParameterDescriptorImpl]

