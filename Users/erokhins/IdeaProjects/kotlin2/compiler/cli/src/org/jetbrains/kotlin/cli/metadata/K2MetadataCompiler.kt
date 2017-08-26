'CLICompiler<K2MetadataCompilerArguments>' @ [39:28] ==> public constructor CLICompiler<A : (CommonCompilerArguments..CommonCompilerArguments?)>() defined in org.jetbrains.kotlin.cli.common.CLICompiler[JavaClassConstructorDescriptor]
Inferred types:
    <A : (CommonCompilerArguments..CommonCompilerArguments?)> -> K2MetadataCompilerArguments

'K2MetadataCompilerArguments' @ [40:38] ==> public constructor K2MetadataCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedClassConstructorDescriptor]

'configuration' @ [54:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'getNotNull' @ [54:39] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [54:71] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [56:21] ==> value-parameter arguments: K2MetadataCompilerArguments defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'freeArgs' @ [56:31] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [57:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'addKotlinSourceRoot' @ [57:27] ==> public fun CompilerConfiguration.addKotlinSourceRoot(source: String): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'arg' @ [57:47] ==> val arg: String defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'arguments' @ [59:13] ==> value-parameter arguments: K2MetadataCompilerArguments defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'classpath' @ [59:23] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [60:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'addJvmClasspathRoots' @ [60:27] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[SimpleFunctionDescriptorImpl]

'arguments' @ [60:48] ==> value-parameter arguments: K2MetadataCompilerArguments defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'classpath' @ [60:58] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedPropertyDescriptor]

'split' @ [60:70] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparatorChar' @ [60:81] ==> public const final val pathSeparatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'map' @ [60:100] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'configuration' @ [63:9] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [63:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [63:27] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [63:51] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'DEFAULT_MODULE_NAME' @ [63:71] ==> public const final val DEFAULT_MODULE_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'arguments' @ [65:27] ==> value-parameter arguments: K2MetadataCompilerArguments defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'destination' @ [65:37] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedPropertyDescriptor]

'destination' @ [66:13] ==> val destination: String? defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'destination' @ [67:17] ==> val destination: String? defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'endsWith' @ [67:29] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'collector' @ [69:17] ==> val collector: MessageCollector defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'report' @ [69:27] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [69:34] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'configuration' @ [71:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [71:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'METADATA_DESTINATION_DIRECTORY' @ [71:52] ==> public final val METADATA_DESTINATION_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'File' @ [71:84] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destination' @ [71:89] ==> val destination: String? defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'KotlinCoreEnvironment' @ [74:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForProduction' @ [74:49] ==> @JvmStatic public final fun createForProduction(parentDisposable: Disposable, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'rootDisposable' @ [74:69] ==> value-parameter rootDisposable: Disposable defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [74:85] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'JVM_CONFIG_FILES' @ [74:123] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'environment' @ [76:13] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'getSourceFiles' @ [76:25] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'isEmpty' @ [76:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'arguments' @ [77:17] ==> value-parameter arguments: K2MetadataCompilerArguments defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[ValueParameterDescriptorImpl]

'version' @ [77:27] ==> @Argument public final var version: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedPropertyDescriptor]

'OK' @ [78:33] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'collector' @ [80:13] ==> val collector: MessageCollector defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'report' @ [80:23] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [80:30] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'COMPILATION_ERROR' @ [81:29] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'MetadataSerializer' @ [85:13] ==> public constructor MetadataSerializer(dependOnOldBuiltIns: Boolean) defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[ClassConstructorDescriptorImpl]

'serialize' @ [85:38] ==> public final fun serialize(environment: KotlinCoreEnvironment): Unit defined in org.jetbrains.kotlin.cli.metadata.MetadataSerializer[SimpleFunctionDescriptorImpl]

'environment' @ [85:48] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'collector' @ [88:13] ==> val collector: MessageCollector defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'report' @ [88:23] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'EXCEPTION' @ [88:30] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'renderException' @ [88:59] ==> @NotNull public open fun renderException(@NotNull p0: Throwable): String defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'e' @ [88:75] ==> val e: CompilationException defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'psiElementToMessageLocation' @ [88:91] ==> @Nullable public open fun psiElementToMessageLocation(@Nullable element: PsiElement?): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.messages.MessageUtil[JavaMethodDescriptor]

'e' @ [88:119] ==> val e: CompilationException defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.doExecute[LocalVariableDescriptor]

'element' @ [88:121] ==> public final val CompilationException.element: PsiElement?[MyPropertyDescriptor]

'INTERNAL_ERROR' @ [89:29] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'OK' @ [92:25] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'JvmStatic' @ [99:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'doMain' @ [101:13] ==> @JvmStatic public final fun doMain(compiler: CLITool<*>, args: Array<String>): Unit defined in org.jetbrains.kotlin.cli.common.CLITool.Companion[SimpleFunctionDescriptorImpl]

'K2MetadataCompiler' @ [101:20] ==> public constructor K2MetadataCompiler() defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler[ClassConstructorDescriptorImpl]

'args' @ [101:42] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler.Companion.main[ValueParameterDescriptorImpl]

