'CLICompiler<K2JVMCompilerArguments>' @ [58:23] ==> public constructor CLICompiler<A : (CommonCompilerArguments..CommonCompilerArguments?)>() defined in org.jetbrains.kotlin.cli.common.CLICompiler[JavaClassConstructorDescriptor]
Inferred types:
    <A : (CommonCompilerArguments..CommonCompilerArguments?)> -> K2JVMCompilerArguments

'PerformanceCounter' @ [65:9] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'setTimeCounterEnabled' @ [65:28] ==> public final fun setTimeCounterEnabled(enable: Boolean): Unit defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[DeserializedSimpleFunctionDescriptor]

'arguments' @ [65:50] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'reportPerf' @ [65:60] ==> @Argument public final var reportPerf: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [67:32] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'getNotNull' @ [67:46] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [67:78] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'setupJdkClasspathRoots' @ [68:9] ==> private final fun setupJdkClasspathRoots(arguments: K2JVMCompilerArguments, configuration: CompilerConfiguration, messageCollector: MessageCollector): ExitCode defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'arguments' @ [68:32] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [68:43] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'messageCollector' @ [68:58] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'let' @ [68:76] ==> @InlineOnly public inline fun <T, R> ExitCode.let(block: (ExitCode) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExitCode
    <R> -> Unit

'it' @ [69:17] ==> value-parameter it: ExitCode defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute.<anonymous>[ValueParameterDescriptorImpl]

'OK' @ [69:23] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'it' @ [69:34] ==> value-parameter it: ExitCode defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute.<anonymous>[ValueParameterDescriptorImpl]

'PluginCliParser' @ [73:13] ==> public object PluginCliParser defined in org.jetbrains.kotlin.cli.jvm.plugins in file PluginCliParser.kt[FakeCallableDescriptorForObject]

'loadPlugins' @ [73:29] ==> @JvmStatic public final fun loadPlugins(arguments: CommonCompilerArguments, configuration: CompilerConfiguration): Unit defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginCliParser[SimpleFunctionDescriptorImpl]

'arguments' @ [73:41] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [73:52] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'e' @ [76:27] ==> val e: PluginCliOptionProcessingException defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'message' @ [76:29] ==> public open val message: String? defined in org.jetbrains.kotlin.compiler.plugin.PluginCliOptionProcessingException[DeserializedPropertyDescriptor]

'cliPluginUsageString' @ [76:48] ==> public fun cliPluginUsageString(pluginId: String, options: Collection<CliOption>): String defined in org.jetbrains.kotlin.compiler.plugin[DeserializedSimpleFunctionDescriptor]

'e' @ [76:69] ==> val e: PluginCliOptionProcessingException defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'pluginId' @ [76:71] ==> public final val pluginId: String defined in org.jetbrains.kotlin.compiler.plugin.PluginCliOptionProcessingException[DeserializedPropertyDescriptor]

'e' @ [76:81] ==> val e: PluginCliOptionProcessingException defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'options' @ [76:83] ==> public final val options: Collection<CliOption> defined in org.jetbrains.kotlin.compiler.plugin.PluginCliOptionProcessingException[DeserializedPropertyDescriptor]

'messageCollector' @ [77:13] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [77:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [77:37] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [77:44] ==> val message: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'INTERNAL_ERROR' @ [78:20] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'messageCollector' @ [81:13] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [81:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [81:37] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'e' @ [81:44] ==> val e: CliOptionProcessingException defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'message' @ [81:46] ==> public open val message: String? defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[DeserializedPropertyDescriptor]

'INTERNAL_ERROR' @ [82:20] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'reportException' @ [85:34] ==> public open fun reportException(@NotNull p0: MessageCollector, @NotNull p1: Throwable): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorUtil[JavaMethodDescriptor]

'messageCollector' @ [85:50] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

't' @ [85:68] ==> val t: Throwable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'INTERNAL_ERROR' @ [86:20] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'!' @ [89:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arguments' @ [89:14] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'script' @ [89:24] ==> @Argument public final var script: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [89:34] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'buildFile' @ [89:44] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [90:25] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'freeArgs' @ [90:35] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'File' @ [91:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'arg' @ [91:33] ==> val arg: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'if (file.extension == JavaFileType.DEFAULT_EXTENSION) {
                    configuration.addJavaSourceRoot(file)
                }
                else {
                    configuration.addKotlinSourceRoot(arg)
                    if (file.isDirectory) {
                        configuration.addJavaSourceRoot(file)
                    }
                }' @ [92:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'file' @ [92:21] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'extension' @ [92:26] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'DEFAULT_EXTENSION' @ [92:52] ==> @NonNls public const final val DEFAULT_EXTENSION: String defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'configuration' @ [93:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'addJavaSourceRoot' @ [93:35] ==> @JvmOverloads public fun CompilerConfiguration.addJavaSourceRoot(file: File, packagePrefix: String? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[SimpleFunctionDescriptorImpl]

'file' @ [93:53] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'configuration' @ [96:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'addKotlinSourceRoot' @ [96:35] ==> public fun CompilerConfiguration.addKotlinSourceRoot(source: String): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'arg' @ [96:55] ==> val arg: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'file' @ [97:25] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'isDirectory' @ [97:30] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'configuration' @ [98:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'addJavaSourceRoot' @ [98:39] ==> @JvmOverloads public fun CompilerConfiguration.addJavaSourceRoot(file: File, packagePrefix: String? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[SimpleFunctionDescriptorImpl]

'file' @ [98:57] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'configureContentRoots' @ [104:9] ==> private final fun configureContentRoots(paths: KotlinPaths?, arguments: K2JVMCompilerArguments, configuration: CompilerConfiguration): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'paths' @ [104:31] ==> value-parameter paths: KotlinPaths? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'arguments' @ [104:38] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [104:49] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [106:9] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [106:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [106:27] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [106:51] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'arguments' @ [106:64] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'moduleName' @ [106:74] ==> @Argument public final var moduleName: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'DEFAULT_MODULE_NAME' @ [106:95] ==> public const final val DEFAULT_MODULE_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'arguments' @ [108:13] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'buildFile' @ [108:23] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [108:44] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'freeArgs' @ [108:54] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'isEmpty' @ [108:63] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'!' @ [108:76] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arguments' @ [108:77] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'version' @ [108:87] ==> @Argument public final var version: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [109:17] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'script' @ [109:27] ==> @Argument public final var script: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'messageCollector' @ [110:17] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [110:34] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [110:41] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'COMPILATION_ERROR' @ [111:24] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'ReplFromTerminal' @ [113:13] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal[FakeCallableDescriptorForObject]

'run' @ [113:30] ==> public final fun run(disposable: Disposable, configuration: CompilerConfiguration): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplFromTerminal.Companion[SimpleFunctionDescriptorImpl]

'rootDisposable' @ [113:34] ==> value-parameter rootDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [113:50] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'OK' @ [114:29] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'arguments' @ [117:13] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'includeRuntime' @ [117:23] ==> @GradleOption @Argument public final var includeRuntime: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [118:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [118:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'INCLUDE_RUNTIME' @ [118:52] ==> public final val INCLUDE_RUNTIME: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [120:27] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'friendPaths' @ [120:37] ==> public final var friendPaths: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'toList' @ [120:50] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'friendPaths' @ [121:13] ==> val friendPaths: List<String>? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'configuration' @ [122:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [122:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(List<String>..List<(String..String?)>?)>, @NotNull p1: (List<String>..List<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<kotlin.String>..kotlin.collections.List<(kotlin.String..kotlin.String?)>)

'FRIEND_PATHS' @ [122:52] ==> public final val FRIEND_PATHS: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'friendPaths' @ [122:66] ==> val friendPaths: List<String>? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'arguments' @ [125:13] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'jvmTarget' @ [125:23] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'JvmTarget' @ [126:29] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'fromString' @ [126:39] ==> @JvmStatic public final fun fromString(string: String): JvmTarget? defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedSimpleFunctionDescriptor]

'arguments' @ [126:50] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'jvmTarget' @ [126:60] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'if (jvmTarget != null) {
                configuration.put(JVMConfigurationKeys.JVM_TARGET, jvmTarget)
            }
            else {
                messageCollector.report(ERROR, "Unknown JVM target version: ${arguments.jvmTarget}\n" +
                                               "Supported versions: ${JvmTarget.values().joinToString { it.description }}")
            }' @ [127:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'jvmTarget' @ [127:17] ==> val jvmTarget: JvmTarget? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'configuration' @ [128:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [128:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(JvmTarget..JvmTarget?)>, @NotNull p1: JvmTarget): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmTarget

'JVM_TARGET' @ [128:56] ==> public final val JVM_TARGET: (CompilerConfigurationKey<(JvmTarget..JvmTarget?)>..CompilerConfigurationKey<(JvmTarget..JvmTarget?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'jvmTarget' @ [128:68] ==> val jvmTarget: JvmTarget? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'messageCollector' @ [131:17] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [131:34] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [131:41] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'+' @ [131:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arguments' @ [131:79] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'jvmTarget' @ [131:89] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'JvmTarget' @ [132:71] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'values' @ [132:81] ==> public final fun values(): Array<JvmTarget> defined in org.jetbrains.kotlin.config.JvmTarget[SimpleFunctionDescriptorImpl]

'joinToString' @ [132:90] ==> public fun <T> Array<out JvmTarget>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((JvmTarget) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmTarget

'it' @ [132:105] ==> value-parameter it: JvmTarget defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [132:108] ==> public open val description: String defined in org.jetbrains.kotlin.config.JvmTarget[DeserializedPropertyDescriptor]

'configuration' @ [136:9] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [136:23] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'PARAMETERS_METADATA' @ [136:48] ==> public final val PARAMETERS_METADATA: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [136:69] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'javaParameters' @ [136:79] ==> @GradleOption @Argument public final var javaParameters: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'putAdvancedOptions' @ [138:9] ==> private final fun putAdvancedOptions(configuration: CompilerConfiguration, arguments: K2JVMCompilerArguments): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [138:28] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'arguments' @ [138:43] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'messageCollector' @ [140:9] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [140:26] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'LOGGING' @ [140:33] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'arguments' @ [142:31] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'destination' @ [142:41] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'if (arguments.buildFile != null) {
                val sanitizedCollector = FilteringMessageCollector(messageCollector, VERBOSE::contains)
                val moduleScript = CompileEnvironmentUtil.loadModuleDescriptions(arguments.buildFile, sanitizedCollector)

                if (destination != null) {
                    messageCollector.report(
                            STRONG_WARNING,
                            "The '-d' option with a directory destination is ignored because '-Xbuild-file' is specified"
                    )
                }

                val moduleFile = File(arguments.buildFile)
                val directory = moduleFile.absoluteFile.parentFile

                KotlinToJVMBytecodeCompiler.configureSourceRoots(configuration, moduleScript.modules, directory)
                configuration.put(JVMConfigurationKeys.MODULE_XML_FILE, moduleFile)

                val environment = createEnvironmentWithScriptingSupport(rootDisposable, configuration, arguments, messageCollector)
                                  ?: return COMPILATION_ERROR

                registerJavacIfNeeded(environment, arguments).let {
                    if (!it) return COMPILATION_ERROR
                }

                KotlinToJVMBytecodeCompiler.compileModules(environment, directory)
            }
            else if (arguments.script) {
                val sourcePath = arguments.freeArgs.first()
                configuration.addKotlinSourceRoot(sourcePath)

                configuration.put(JVMConfigurationKeys.RETAIN_OUTPUT_IN_MEMORY, true)

                val environment = createEnvironmentWithScriptingSupport(rootDisposable, configuration, arguments, messageCollector)
                                  ?: return COMPILATION_ERROR

                val scriptDefinitionProvider = KotlinScriptDefinitionProvider.getInstance(environment.project)!!
                val scriptFile = File(sourcePath)
                if (scriptFile.isDirectory || !scriptDefinitionProvider.isScript(scriptFile.name)) {
                    val extensionHint =
                            if (configuration.get(JVMConfigurationKeys.SCRIPT_DEFINITIONS) == listOf(StandardScriptDefinition)) " (.kts)"
                            else ""
                    messageCollector.report(ERROR, "Specify path to the script file$extensionHint as the first argument")
                    return COMPILATION_ERROR
                }

                val scriptArgs = arguments.freeArgs.subList(1, arguments.freeArgs.size)
                return KotlinToJVMBytecodeCompiler.compileAndExecuteScript(environment, scriptArgs)
            }
            else {
                if (destination != null) {
                    if (destination.endsWith(".jar")) {
                        configuration.put(JVMConfigurationKeys.OUTPUT_JAR, File(destination))
                    }
                    else {
                        configuration.put(JVMConfigurationKeys.OUTPUT_DIRECTORY, File(destination))
                    }
                }

                val environment = createEnvironmentWithScriptingSupport(rootDisposable, configuration, arguments, messageCollector)
                                  ?: return COMPILATION_ERROR

                registerJavacIfNeeded(environment, arguments).let {
                    if (!it) return COMPILATION_ERROR
                }

                if (environment.getSourceFiles().isEmpty()) {
                    if (arguments.version) {
                        return OK
                    }
                    messageCollector.report(ERROR, "No source files")
                    return COMPILATION_ERROR
                }

                KotlinToJVMBytecodeCompiler.compileBunchOfSources(environment)

                compileJavaFilesIfNeeded(environment, arguments).let {
                    if (!it) return COMPILATION_ERROR
                }
            }' @ [144:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'arguments' @ [144:17] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'buildFile' @ [144:27] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'FilteringMessageCollector' @ [145:42] ==> public constructor FilteringMessageCollector(@NotNull p0: MessageCollector, @NotNull p1: ((CompilerMessageSeverity..CompilerMessageSeverity?)) -> Boolean) defined in org.jetbrains.kotlin.cli.common.messages.FilteringMessageCollector[SamAdapterClassConstructorDescriptor]

'messageCollector' @ [145:68] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'VERBOSE' @ [145:86] ==> public final val VERBOSE: (EnumSet<(CompilerMessageSeverity..CompilerMessageSeverity?)>..EnumSet<(CompilerMessageSeverity..CompilerMessageSeverity?)>?) defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[JavaPropertyDescriptor]

'loadModuleDescriptions' @ [146:59] ==> @NotNull public open fun loadModuleDescriptions(moduleDefinitionFile: (String..String?), messageCollector: (MessageCollector..MessageCollector?)): ModuleScriptData defined in org.jetbrains.kotlin.cli.jvm.compiler.CompileEnvironmentUtil[JavaMethodDescriptor]

'arguments' @ [146:82] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'buildFile' @ [146:92] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'sanitizedCollector' @ [146:103] ==> val sanitizedCollector: FilteringMessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'destination' @ [148:21] ==> val destination: String? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'messageCollector' @ [149:21] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [149:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [150:29] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'File' @ [155:34] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'arguments' @ [155:39] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'buildFile' @ [155:49] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'moduleFile' @ [156:33] ==> val moduleFile: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'absoluteFile' @ [156:44] ==> public final val File.absoluteFile: (File..File?)[MyPropertyDescriptor]

'parentFile' @ [156:57] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'KotlinToJVMBytecodeCompiler' @ [158:17] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler in file KotlinToJVMBytecodeCompiler.kt[FakeCallableDescriptorForObject]

'configureSourceRoots' @ [158:45] ==> public final fun configureSourceRoots(configuration: CompilerConfiguration, chunk: List<Module>, directory: File): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'configuration' @ [158:66] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'moduleScript' @ [158:81] ==> val moduleScript: ModuleScriptData defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'modules' @ [158:94] ==> public final val ModuleScriptData.modules: (MutableList<(Module..Module?)>..List<(Module..Module?)>)[MyPropertyDescriptor]

'directory' @ [158:103] ==> val directory: (File..File?) defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'configuration' @ [159:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [159:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'MODULE_XML_FILE' @ [159:56] ==> public final val MODULE_XML_FILE: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'moduleFile' @ [159:73] ==> val moduleFile: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'createEnvironmentWithScriptingSupport' @ [161:35] ==> private final fun createEnvironmentWithScriptingSupport(rootDisposable: Disposable, configuration: CompilerConfiguration, arguments: K2JVMCompilerArguments, messageCollector: MessageCollector): KotlinCoreEnvironment? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[SimpleFunctionDescriptorImpl]

'rootDisposable' @ [161:73] ==> value-parameter rootDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [161:89] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'arguments' @ [161:104] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'messageCollector' @ [161:115] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'COMPILATION_ERROR' @ [162:45] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'registerJavacIfNeeded' @ [164:17] ==> private final fun registerJavacIfNeeded(environment: KotlinCoreEnvironment, arguments: K2JVMCompilerArguments): Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [164:39] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'arguments' @ [164:52] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'let' @ [164:63] ==> @InlineOnly public inline fun <T, R> Boolean.let(block: (Boolean) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Unit

'!' @ [165:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [165:26] ==> value-parameter it: Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute.<anonymous>[ValueParameterDescriptorImpl]

'COMPILATION_ERROR' @ [165:37] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'KotlinToJVMBytecodeCompiler' @ [168:17] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler in file KotlinToJVMBytecodeCompiler.kt[FakeCallableDescriptorForObject]

'compileModules' @ [168:45] ==> public final fun compileModules(environment: KotlinCoreEnvironment, directory: File): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [168:60] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'directory' @ [168:73] ==> val directory: (File..File?) defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'if (arguments.script) {
                val sourcePath = arguments.freeArgs.first()
                configuration.addKotlinSourceRoot(sourcePath)

                configuration.put(JVMConfigurationKeys.RETAIN_OUTPUT_IN_MEMORY, true)

                val environment = createEnvironmentWithScriptingSupport(rootDisposable, configuration, arguments, messageCollector)
                                  ?: return COMPILATION_ERROR

                val scriptDefinitionProvider = KotlinScriptDefinitionProvider.getInstance(environment.project)!!
                val scriptFile = File(sourcePath)
                if (scriptFile.isDirectory || !scriptDefinitionProvider.isScript(scriptFile.name)) {
                    val extensionHint =
                            if (configuration.get(JVMConfigurationKeys.SCRIPT_DEFINITIONS) == listOf(StandardScriptDefinition)) " (.kts)"
                            else ""
                    messageCollector.report(ERROR, "Specify path to the script file$extensionHint as the first argument")
                    return COMPILATION_ERROR
                }

                val scriptArgs = arguments.freeArgs.subList(1, arguments.freeArgs.size)
                return KotlinToJVMBytecodeCompiler.compileAndExecuteScript(environment, scriptArgs)
            }
            else {
                if (destination != null) {
                    if (destination.endsWith(".jar")) {
                        configuration.put(JVMConfigurationKeys.OUTPUT_JAR, File(destination))
                    }
                    else {
                        configuration.put(JVMConfigurationKeys.OUTPUT_DIRECTORY, File(destination))
                    }
                }

                val environment = createEnvironmentWithScriptingSupport(rootDisposable, configuration, arguments, messageCollector)
                                  ?: return COMPILATION_ERROR

                registerJavacIfNeeded(environment, arguments).let {
                    if (!it) return COMPILATION_ERROR
                }

                if (environment.getSourceFiles().isEmpty()) {
                    if (arguments.version) {
                        return OK
                    }
                    messageCollector.report(ERROR, "No source files")
                    return COMPILATION_ERROR
                }

                KotlinToJVMBytecodeCompiler.compileBunchOfSources(environment)

                compileJavaFilesIfNeeded(environment, arguments).let {
                    if (!it) return COMPILATION_ERROR
                }
            }' @ [170:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'arguments' @ [170:22] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'script' @ [170:32] ==> @Argument public final var script: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [171:34] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'freeArgs' @ [171:44] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'first' @ [171:53] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [172:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'addKotlinSourceRoot' @ [172:31] ==> public fun CompilerConfiguration.addKotlinSourceRoot(source: String): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'sourcePath' @ [172:51] ==> val sourcePath: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'configuration' @ [174:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [174:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'RETAIN_OUTPUT_IN_MEMORY' @ [174:56] ==> public final val RETAIN_OUTPUT_IN_MEMORY: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'createEnvironmentWithScriptingSupport' @ [176:35] ==> private final fun createEnvironmentWithScriptingSupport(rootDisposable: Disposable, configuration: CompilerConfiguration, arguments: K2JVMCompilerArguments, messageCollector: MessageCollector): KotlinCoreEnvironment? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[SimpleFunctionDescriptorImpl]

'rootDisposable' @ [176:73] ==> value-parameter rootDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [176:89] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'arguments' @ [176:104] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'messageCollector' @ [176:115] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'COMPILATION_ERROR' @ [177:45] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'KotlinScriptDefinitionProvider' @ [179:48] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[FakeCallableDescriptorForObject]

'getInstance' @ [179:79] ==> @JvmStatic public final fun getInstance(project: Project): KotlinScriptDefinitionProvider? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion[DeserializedSimpleFunctionDescriptor]

'environment' @ [179:91] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'project' @ [179:103] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'File' @ [180:34] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'sourcePath' @ [180:39] ==> val sourcePath: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'scriptFile' @ [181:21] ==> val scriptFile: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'isDirectory' @ [181:32] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'!' @ [181:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'scriptDefinitionProvider' @ [181:48] ==> val scriptDefinitionProvider: KotlinScriptDefinitionProvider defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'isScript' @ [181:73] ==> public final fun isScript(fileName: String): Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'scriptFile' @ [181:82] ==> val scriptFile: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'name' @ [181:93] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'if (configuration.get(JVMConfigurationKeys.SCRIPT_DEFINITIONS) == listOf(StandardScriptDefinition)) " (.kts)"
                            else ""' @ [183:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'configuration' @ [183:33] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'get' @ [183:47] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>): (MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>?..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.script.KotlinScriptDefinition..org.jetbrains.kotlin.script.KotlinScriptDefinition?)>..kotlin.collections.List<(org.jetbrains.kotlin.script.KotlinScriptDefinition..org.jetbrains.kotlin.script.KotlinScriptDefinition?)>)

'SCRIPT_DEFINITIONS' @ [183:72] ==> public final val SCRIPT_DEFINITIONS: (CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>..CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'listOf' @ [183:95] ==> public fun <T> listOf(element: StandardScriptDefinition): List<StandardScriptDefinition> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StandardScriptDefinition

'StandardScriptDefinition' @ [183:102] ==> public object StandardScriptDefinition : KotlinScriptDefinition defined in org.jetbrains.kotlin.script[FakeCallableDescriptorForObject]

'messageCollector' @ [185:21] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [185:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [185:45] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'extensionHint' @ [185:85] ==> val extensionHint: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'COMPILATION_ERROR' @ [186:28] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'arguments' @ [189:34] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'freeArgs' @ [189:44] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'subList' @ [189:53] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): MutableList<String> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'arguments' @ [189:64] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'freeArgs' @ [189:74] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'size' @ [189:83] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'KotlinToJVMBytecodeCompiler' @ [190:24] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler in file KotlinToJVMBytecodeCompiler.kt[FakeCallableDescriptorForObject]

'compileAndExecuteScript' @ [190:52] ==> internal final fun compileAndExecuteScript(environment: KotlinCoreEnvironment, scriptArgs: List<String>): ExitCode defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [190:76] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'scriptArgs' @ [190:89] ==> val scriptArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'destination' @ [193:21] ==> val destination: String? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'if (destination.endsWith(".jar")) {
                        configuration.put(JVMConfigurationKeys.OUTPUT_JAR, File(destination))
                    }
                    else {
                        configuration.put(JVMConfigurationKeys.OUTPUT_DIRECTORY, File(destination))
                    }' @ [194:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'destination' @ [194:25] ==> val destination: String? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'endsWith' @ [194:37] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'configuration' @ [195:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [195:39] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'OUTPUT_JAR' @ [195:64] ==> public final val OUTPUT_JAR: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'File' @ [195:76] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destination' @ [195:81] ==> val destination: String? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'configuration' @ [198:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'put' @ [198:39] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'OUTPUT_DIRECTORY' @ [198:64] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'File' @ [198:82] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'destination' @ [198:87] ==> val destination: String? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'createEnvironmentWithScriptingSupport' @ [202:35] ==> private final fun createEnvironmentWithScriptingSupport(rootDisposable: Disposable, configuration: CompilerConfiguration, arguments: K2JVMCompilerArguments, messageCollector: MessageCollector): KotlinCoreEnvironment? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[SimpleFunctionDescriptorImpl]

'rootDisposable' @ [202:73] ==> value-parameter rootDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'configuration' @ [202:89] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'arguments' @ [202:104] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'messageCollector' @ [202:115] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'COMPILATION_ERROR' @ [203:45] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'registerJavacIfNeeded' @ [205:17] ==> private final fun registerJavacIfNeeded(environment: KotlinCoreEnvironment, arguments: K2JVMCompilerArguments): Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [205:39] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'arguments' @ [205:52] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'let' @ [205:63] ==> @InlineOnly public inline fun <T, R> Boolean.let(block: (Boolean) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Unit

'!' @ [206:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [206:26] ==> value-parameter it: Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute.<anonymous>[ValueParameterDescriptorImpl]

'COMPILATION_ERROR' @ [206:37] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'environment' @ [209:21] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'getSourceFiles' @ [209:33] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'isEmpty' @ [209:50] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'arguments' @ [210:25] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'version' @ [210:35] ==> @Argument public final var version: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'OK' @ [211:32] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'messageCollector' @ [213:21] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [213:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [213:45] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'COMPILATION_ERROR' @ [214:28] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'KotlinToJVMBytecodeCompiler' @ [217:17] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler in file KotlinToJVMBytecodeCompiler.kt[FakeCallableDescriptorForObject]

'compileBunchOfSources' @ [217:45] ==> public final fun compileBunchOfSources(environment: KotlinCoreEnvironment): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [217:67] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'compileJavaFilesIfNeeded' @ [219:17] ==> private final fun compileJavaFilesIfNeeded(environment: KotlinCoreEnvironment, arguments: K2JVMCompilerArguments): Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [219:42] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'arguments' @ [219:55] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'let' @ [219:66] ==> @InlineOnly public inline fun <T, R> Boolean.let(block: (Boolean) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Unit

'!' @ [220:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [220:26] ==> value-parameter it: Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute.<anonymous>[ValueParameterDescriptorImpl]

'COMPILATION_ERROR' @ [220:37] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'arguments' @ [224:17] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'reportPerf' @ [224:27] ==> @Argument public final var reportPerf: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'reportGCTime' @ [225:17] ==> public final fun reportGCTime(configuration: CompilerConfiguration): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [225:30] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'reportCompilationTime' @ [226:17] ==> public final fun reportCompilationTime(configuration: CompilerConfiguration): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [226:39] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

'PerformanceCounter' @ [227:17] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'report' @ [227:36] ==> public final fun report(consumer: (String) -> Unit): Unit defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[DeserializedSimpleFunctionDescriptor]

'reportPerf' @ [227:50] ==> public final fun reportPerf(configuration: CompilerConfiguration, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [227:61] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[ValueParameterDescriptorImpl]

's' @ [227:76] ==> value-parameter s: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute.<anonymous>[ValueParameterDescriptorImpl]

'OK' @ [229:20] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'messageCollector' @ [232:13] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'report' @ [232:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'EXCEPTION' @ [233:21] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'renderException' @ [234:39] ==> @NotNull public open fun renderException(@NotNull p0: Throwable): String defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'e' @ [234:55] ==> val e: CompilationException defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'psiElementToMessageLocation' @ [235:33] ==> @Nullable public open fun psiElementToMessageLocation(@Nullable element: PsiElement?): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.messages.MessageUtil[JavaMethodDescriptor]

'e' @ [235:61] ==> val e: CompilationException defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute[LocalVariableDescriptor]

'element' @ [235:63] ==> public final val CompilationException.element: PsiElement?[MyPropertyDescriptor]

'INTERNAL_ERROR' @ [237:20] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'arguments' @ [243:13] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.registerJavacIfNeeded[ValueParameterDescriptorImpl]

'useJavac' @ [243:23] ==> @Argument public final var useJavac: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'environment' @ [244:13] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.registerJavacIfNeeded[ValueParameterDescriptorImpl]

'configuration' @ [244:25] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'put' @ [244:39] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_JAVAC' @ [244:64] ==> public final val USE_JAVAC: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'environment' @ [245:20] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.registerJavacIfNeeded[ValueParameterDescriptorImpl]

'registerJavac' @ [245:32] ==> public final fun registerJavac(javaFiles: List<File> = ..., kotlinFiles: List<KtFile> = ..., arguments: Array<String>? = ...): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'arguments' @ [245:58] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.registerJavacIfNeeded[ValueParameterDescriptorImpl]

'javacArguments' @ [245:68] ==> @Argument public final var javacArguments: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [253:13] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.compileJavaFilesIfNeeded[ValueParameterDescriptorImpl]

'useJavac' @ [253:23] ==> @Argument public final var useJavac: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'JavacWrapper' @ [254:20] ==> public companion object defined in org.jetbrains.kotlin.javac.JavacWrapper[FakeCallableDescriptorForObject]

'getInstance' @ [254:33] ==> public final fun getInstance(project: Project): JavacWrapper defined in org.jetbrains.kotlin.javac.JavacWrapper.Companion[DeserializedSimpleFunctionDescriptor]

'environment' @ [254:45] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.compileJavaFilesIfNeeded[ValueParameterDescriptorImpl]

'project' @ [254:57] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'use' @ [254:66] ==> @InlineOnly public inline fun <T : Closeable?, R> JavacWrapper.use(block: (JavacWrapper) -> Boolean): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JavacWrapper
    <R> -> Boolean

'it' @ [254:72] ==> value-parameter it: JavacWrapper defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.compileJavaFilesIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'compile' @ [254:75] ==> public final fun compile(outDir: File? = ...): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[DeserializedSimpleFunctionDescriptor]

'createScriptResolverEnvironment' @ [265:33] ==> public final fun createScriptResolverEnvironment(arguments: K2JVMCompilerArguments, messageCollector: MessageCollector): HashMap<String, Any?>? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'arguments' @ [265:65] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'messageCollector' @ [265:76] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'configureScriptDefinitions' @ [266:9] ==> public final fun configureScriptDefinitions(scriptTemplates: Array<String>?, configuration: CompilerConfiguration, messageCollector: MessageCollector, scriptResolverEnv: HashMap<String, Any?>): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'arguments' @ [266:36] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'scriptTemplates' @ [266:46] ==> @Argument public final var scriptTemplates: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [266:63] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'messageCollector' @ [266:78] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'scriptResolverEnv' @ [266:96] ==> val scriptResolverEnv: HashMap<String, Any?> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[LocalVariableDescriptor]

'!' @ [267:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [267:14] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'hasErrors' @ [267:31] ==> public abstract fun hasErrors(): Boolean defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'createCoreEnvironment' @ [268:31] ==> private final fun createCoreEnvironment(rootDisposable: Disposable, configuration: CompilerConfiguration): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[SimpleFunctionDescriptorImpl]

'rootDisposable' @ [268:53] ==> value-parameter rootDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'configuration' @ [268:69] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'!' @ [269:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [269:18] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[ValueParameterDescriptorImpl]

'hasErrors' @ [269:35] ==> public abstract fun hasErrors(): Boolean defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'scriptResolverEnv' @ [270:17] ==> val scriptResolverEnv: HashMap<String, Any?> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[LocalVariableDescriptor]

'put' @ [270:35] ==> public open fun put(key: String, value: Any?): Any? defined in java.util.HashMap[JavaMethodDescriptor]

'environment' @ [270:54] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[LocalVariableDescriptor]

'project' @ [270:66] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'run' @ [270:74] ==> @InlineOnly public inline fun <T, R> Project.run(block: Project.() -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Project
    <R> -> String?

'basePath' @ [270:80] ==> public final val Project.basePath: String?[MyPropertyDescriptor]

'baseDir' @ [270:92] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'canonicalPath' @ [270:101] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

'let' @ [270:118] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'environment' @ [271:24] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createEnvironmentWithScriptingSupport[LocalVariableDescriptor]

'KotlinCoreEnvironment' @ [278:22] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForProduction' @ [278:44] ==> @JvmStatic public final fun createForProduction(parentDisposable: Disposable, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'rootDisposable' @ [278:64] ==> value-parameter rootDisposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createCoreEnvironment[ValueParameterDescriptorImpl]

'configuration' @ [278:80] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createCoreEnvironment[ValueParameterDescriptorImpl]

'JVM_CONFIG_FILES' @ [278:118] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'initStartNanos' @ [280:13] ==> private final var initStartNanos: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'-' @ [281:29] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'nanoTime' @ [281:36] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'initStartNanos' @ [281:49] ==> private final var initStartNanos: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'reportPerf' @ [282:13] ==> public final fun reportPerf(configuration: CompilerConfiguration, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [282:24] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createCoreEnvironment[ValueParameterDescriptorImpl]

'+' @ [282:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'toMillis' @ [282:95] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'initNanos' @ [282:104] ==> val initNanos: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createCoreEnvironment[LocalVariableDescriptor]

'initStartNanos' @ [283:13] ==> private final var initStartNanos: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'result' @ [285:16] ==> val result: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.createCoreEnvironment[LocalVariableDescriptor]

'isEnabled' @ [291:36] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'services' @ [292:13] ==> value-parameter services: Services defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices[ValueParameterDescriptorImpl]

'get' @ [292:22] ==> public final fun <T> get(interfaceClass: Class<LookupTracker>): LookupTracker? defined in org.jetbrains.kotlin.config.Services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupTracker

'java' @ [292:47] ==> public val <T> KClass<LookupTracker>.java: Class<LookupTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LookupTracker

'let' @ [292:54] ==> @InlineOnly public inline fun <T, R> LookupTracker.let(block: (LookupTracker) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupTracker
    <R> -> Unit

'configuration' @ [293:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices[ValueParameterDescriptorImpl]

'put' @ [293:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(LookupTracker..LookupTracker?)>, @NotNull p1: LookupTracker): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LookupTracker

'CommonConfigurationKeys' @ [293:35] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'LOOKUP_TRACKER' @ [293:59] ==> @field:JvmField public final val LOOKUP_TRACKER: CompilerConfigurationKey<(LookupTracker..LookupTracker?)> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'it' @ [293:75] ==> value-parameter it: LookupTracker defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [296:13] ==> value-parameter services: Services defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices[ValueParameterDescriptorImpl]

'get' @ [296:22] ==> public final fun <T> get(interfaceClass: Class<IncrementalCompilationComponents>): IncrementalCompilationComponents? defined in org.jetbrains.kotlin.config.Services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCompilationComponents

'java' @ [296:66] ==> public val <T> KClass<IncrementalCompilationComponents>.java: Class<IncrementalCompilationComponents> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalCompilationComponents

'let' @ [296:73] ==> @InlineOnly public inline fun <T, R> IncrementalCompilationComponents.let(block: (IncrementalCompilationComponents) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCompilationComponents
    <R> -> Unit

'configuration' @ [297:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices[ValueParameterDescriptorImpl]

'put' @ [297:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>, @NotNull p1: IncrementalCompilationComponents): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IncrementalCompilationComponents

'INCREMENTAL_COMPILATION_COMPONENTS' @ [297:56] ==> public final val INCREMENTAL_COMPILATION_COMPONENTS: (CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>..CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'it' @ [297:92] ==> value-parameter it: IncrementalCompilationComponents defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [301:9] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices[ValueParameterDescriptorImpl]

'additionalJavaModules' @ [301:19] ==> @Argument public final var additionalJavaModules: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'let' @ [301:42] ==> @InlineOnly public inline fun <T, R> Array<String>.let(block: (Array<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Array<String>
    <R> -> Unit

'configuration' @ [302:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices[ValueParameterDescriptorImpl]

'addAll' @ [302:27] ==> public open fun <T : (Any..Any?)> addAll(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: (MutableCollection<(String..String?)>..Collection<(String..String?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'ADDITIONAL_JAVA_MODULES' @ [302:55] ==> public final val ADDITIONAL_JAVA_MODULES: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'additionalJavaModules' @ [302:80] ==> value-parameter additionalJavaModules: Array<String> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.setupPlatformSpecificArgumentsAndServices.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [302:102] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'K2JVMCompilerArguments' @ [306:62] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'apply' @ [306:87] ==> @InlineOnly public inline fun <T> K2JVMCompilerArguments.apply(block: K2JVMCompilerArguments.() -> Unit): K2JVMCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JVMCompilerArguments

'!=' @ [307:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getenv' @ [307:20] ==> public open fun getenv(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'reportPerf' @ [308:13] ==> @Argument public final var reportPerf: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'nanoTime' @ [315:45] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'hashMapOf' @ [317:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Long> /* = HashMap<String, Long> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Long

'initStartNanos' @ [321:17] ==> private final var initStartNanos: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'initStartNanos' @ [322:17] ==> private final var initStartNanos: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'nanoTime' @ [322:41] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'JvmStatic' @ [326:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'CLITool' @ [327:13] ==> public companion object defined in org.jetbrains.kotlin.cli.common.CLITool[FakeCallableDescriptorForObject]

'doMain' @ [327:21] ==> @JvmStatic public final fun doMain(compiler: CLITool<*>, args: Array<String>): Unit defined in org.jetbrains.kotlin.cli.common.CLITool.Companion[SimpleFunctionDescriptorImpl]

'K2JVMCompiler' @ [327:28] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[ClassConstructorDescriptorImpl]

'args' @ [327:45] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.main[ValueParameterDescriptorImpl]

'!' @ [331:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [331:18] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportPerf[ValueParameterDescriptorImpl]

'getBoolean' @ [331:32] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'REPORT_PERF' @ [331:64] ==> public final val REPORT_PERF: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [333:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportPerf[ValueParameterDescriptorImpl]

'getNotNull' @ [333:27] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [333:59] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'report' @ [333:82] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'INFO' @ [333:89] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [333:103] ==> value-parameter message: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportPerf[ValueParameterDescriptorImpl]

'getGarbageCollectorMXBeans' @ [337:31] ==> public open fun getGarbageCollectorMXBeans(): (MutableList<(GarbageCollectorMXBean..GarbageCollectorMXBean?)>..List<(GarbageCollectorMXBean..GarbageCollectorMXBean?)>?) defined in java.lang.management.ManagementFactory[JavaMethodDescriptor]

'forEach' @ [337:60] ==> @HidesMembers public inline fun <T> Iterable<(GarbageCollectorMXBean..GarbageCollectorMXBean?)>.forEach(action: ((GarbageCollectorMXBean..GarbageCollectorMXBean?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.management.GarbageCollectorMXBean..java.lang.management.GarbageCollectorMXBean?)

'it' @ [338:35] ==> value-parameter it: (GarbageCollectorMXBean..GarbageCollectorMXBean?) defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[ValueParameterDescriptorImpl]

'collectionTime' @ [338:38] ==> public final val GarbageCollectorMXBean.collectionTime: Long[MyPropertyDescriptor]

'elapsedGCTime' @ [339:35] ==> private final val elapsedGCTime: HashMap<String, Long> /* = HashMap<String, Long> */ defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'getOrElse' @ [339:49] ==> @InlineOnly public inline fun <K, V> Map<String, Long>.getOrElse(key: String, defaultValue: () -> Long): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Long

'it' @ [339:59] ==> value-parameter it: (GarbageCollectorMXBean..GarbageCollectorMXBean?) defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [339:62] ==> public final val GarbageCollectorMXBean.name: (String..String?)[MyPropertyDescriptor]

'currentTime' @ [340:28] ==> val currentTime: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[LocalVariableDescriptor]

'elapsedTime' @ [340:42] ==> val elapsedTime: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[LocalVariableDescriptor]

'reportPerf' @ [341:17] ==> public final fun reportPerf(configuration: CompilerConfiguration, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [341:28] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime[ValueParameterDescriptorImpl]

'it' @ [341:58] ==> value-parameter it: (GarbageCollectorMXBean..GarbageCollectorMXBean?) defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [341:61] ==> public final val GarbageCollectorMXBean.name: (String..String?)[MyPropertyDescriptor]

'time' @ [341:71] ==> val time: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[LocalVariableDescriptor]

'elapsedGCTime' @ [342:17] ==> private final val elapsedGCTime: HashMap<String, Long> /* = HashMap<String, Long> */ defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'it' @ [342:31] ==> value-parameter it: (GarbageCollectorMXBean..GarbageCollectorMXBean?) defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [342:34] ==> public final val GarbageCollectorMXBean.name: (String..String?)[MyPropertyDescriptor]

'currentTime' @ [342:42] ==> val currentTime: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportGCTime.<anonymous>[LocalVariableDescriptor]

'?:' @ [347:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CompilationMXBean?, right: CompilationMXBean): CompilationMXBean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CompilationMXBean

'getCompilationMXBean' @ [347:42] ==> public open fun getCompilationMXBean(): (CompilationMXBean..CompilationMXBean?) defined in java.lang.management.ManagementFactory[JavaMethodDescriptor]

'bean' @ [348:31] ==> val bean: CompilationMXBean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportCompilationTime[LocalVariableDescriptor]

'totalCompilationTime' @ [348:36] ==> public final val CompilationMXBean.totalCompilationTime: Long[MyPropertyDescriptor]

'reportPerf' @ [349:13] ==> public final fun reportPerf(configuration: CompilerConfiguration, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'configuration' @ [349:24] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportCompilationTime[ValueParameterDescriptorImpl]

'currentTime' @ [349:54] ==> val currentTime: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportCompilationTime[LocalVariableDescriptor]

'elapsedJITTime' @ [349:68] ==> private final var elapsedJITTime: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'elapsedJITTime' @ [350:13] ==> private final var elapsedJITTime: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[PropertyDescriptorImpl]

'currentTime' @ [350:30] ==> val currentTime: Long defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.reportCompilationTime[LocalVariableDescriptor]

'configuration' @ [354:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [354:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'DISABLE_CALL_ASSERTIONS' @ [354:52] ==> public final val DISABLE_CALL_ASSERTIONS: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [354:77] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'noCallAssertions' @ [354:87] ==> @Argument public final var noCallAssertions: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [355:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [355:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'DISABLE_PARAM_ASSERTIONS' @ [355:52] ==> public final val DISABLE_PARAM_ASSERTIONS: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [355:78] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'noParamAssertions' @ [355:88] ==> @Argument public final var noParamAssertions: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [356:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [356:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'DISABLE_OPTIMIZATION' @ [356:52] ==> public final val DISABLE_OPTIMIZATION: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [356:74] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'noOptimize' @ [356:84] ==> @Argument public final var noOptimize: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [357:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [357:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'INHERIT_MULTIFILE_PARTS' @ [357:52] ==> public final val INHERIT_MULTIFILE_PARTS: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [357:77] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'inheritMultifileParts' @ [357:87] ==> @Argument public final var inheritMultifileParts: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [358:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [358:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'SKIP_RUNTIME_VERSION_CHECK' @ [358:52] ==> public final val SKIP_RUNTIME_VERSION_CHECK: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [358:80] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'skipRuntimeVersionCheck' @ [358:90] ==> @Argument public final var skipRuntimeVersionCheck: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [359:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [359:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_FAST_CLASS_FILES_READING' @ [359:52] ==> public final val USE_FAST_CLASS_FILES_READING: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'!' @ [359:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arguments' @ [359:83] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'useOldClassFilesReading' @ [359:93] ==> @Argument public final var useOldClassFilesReading: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [361:17] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'useOldClassFilesReading' @ [361:27] ==> @Argument public final var useOldClassFilesReading: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [362:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'getNotNull' @ [362:31] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [362:63] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'report' @ [363:31] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'INFO' @ [363:38] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'configuration' @ [366:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [366:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'ALLOW_KOTLIN_PACKAGE' @ [366:52] ==> public final val ALLOW_KOTLIN_PACKAGE: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [366:74] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'allowKotlinPackage' @ [366:84] ==> @Argument public final var allowKotlinPackage: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [367:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [367:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'REPORT_PERF' @ [367:52] ==> public final val REPORT_PERF: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [367:65] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'reportPerf' @ [367:75] ==> @Argument public final var reportPerf: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [368:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [368:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_SINGLE_MODULE' @ [368:52] ==> public final val USE_SINGLE_MODULE: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [368:71] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'singleModule' @ [368:81] ==> @Argument public final var singleModule: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [369:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [369:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'ADD_BUILT_INS_FROM_COMPILER_TO_DEPENDENCIES' @ [369:52] ==> public final val ADD_BUILT_INS_FROM_COMPILER_TO_DEPENDENCIES: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [369:97] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'addCompilerBuiltIns' @ [369:107] ==> @Argument public final var addCompilerBuiltIns: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [370:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [370:27] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'CREATE_BUILT_INS_FROM_MODULE_DEPENDENCIES' @ [370:52] ==> public final val CREATE_BUILT_INS_FROM_MODULE_DEPENDENCIES: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [370:95] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'loadBuiltInsFromDependencies' @ [370:105] ==> @Argument public final var loadBuiltInsFromDependencies: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [372:13] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'declarationsOutputPath' @ [372:23] ==> @Argument public final var declarationsOutputPath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'let' @ [372:47] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'configuration' @ [372:53] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions[ValueParameterDescriptorImpl]

'put' @ [372:67] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'DECLARATIONS_JSON_PATH' @ [372:92] ==> public final val DECLARATIONS_JSON_PATH: (CompilerConfigurationKey<(String..String?)>..CompilerConfigurationKey<(String..String?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'it' @ [372:116] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.putAdvancedOptions.<anonymous>[ValueParameterDescriptorImpl]

'configuration' @ [376:36] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'getNotNull' @ [376:50] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [376:82] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'arguments' @ [377:26] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'classpath' @ [377:36] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'split' @ [377:47] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparatorChar' @ [377:58] ==> public const final val pathSeparatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'orEmpty' @ [377:77] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [378:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'add' @ [378:31] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [378:56] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmClasspathRoot' @ [378:71] ==> public constructor JvmClasspathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[ClassConstructorDescriptorImpl]

'File' @ [378:88] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [378:93] ==> val path: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[LocalVariableDescriptor]

'arguments' @ [381:33] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'javaModulePath' @ [381:43] ==> @Argument public final var javaModulePath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'split' @ [381:59] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparatorChar' @ [381:70] ==> public const final val pathSeparatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'orEmpty' @ [381:89] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [382:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'add' @ [382:31] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [382:56] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmModulePathRoot' @ [382:71] ==> public constructor JvmModulePathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmModulePathRoot[ClassConstructorDescriptorImpl]

'File' @ [382:89] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'modularRoot' @ [382:94] ==> val modularRoot: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[LocalVariableDescriptor]

'configuration' @ [385:33] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'get' @ [385:47] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(File..File?)>): File? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'JDK_HOME' @ [385:72] ==> public final val JDK_HOME: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'let' @ [385:82] ==> @InlineOnly public inline fun <T, R> File?.let(block: (File?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?
    <R> -> Boolean

'it' @ [385:88] ==> value-parameter it: File? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.<anonymous>[ValueParameterDescriptorImpl]

'CoreJrtFileSystem' @ [385:102] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem[FakeCallableDescriptorForObject]

'isModularJdk' @ [385:120] ==> public final fun isModularJdk(jdkHome: File): Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.Companion[SimpleFunctionDescriptorImpl]

'it' @ [385:133] ==> value-parameter it: File? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.<anonymous>[ValueParameterDescriptorImpl]

'getLibraryFromHome' @ [387:28] ==> @Nullable public open fun getLibraryFromHome(@Nullable paths: KotlinPaths?, @NotNull getLibrary: ((KotlinPaths..KotlinPaths?)) -> (File..File?), @NotNull libraryName: String, @NotNull messageCollector: MessageCollector, @NotNull noLibraryArgument: String): File? defined in org.jetbrains.kotlin.cli.common.CLICompiler[JavaMethodDescriptor]

'paths' @ [387:47] ==> value-parameter paths: KotlinPaths? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'getLibrary' @ [387:54] ==> value-parameter getLibrary: (KotlinPaths) -> File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.addRoot[ValueParameterDescriptorImpl]

'libraryName' @ [387:66] ==> value-parameter libraryName: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.addRoot[ValueParameterDescriptorImpl]

'messageCollector' @ [387:79] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[LocalVariableDescriptor]

'noLibraryArgument' @ [387:97] ==> value-parameter noLibraryArgument: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.addRoot[ValueParameterDescriptorImpl]

'if (isModularJava) {
                    configuration.add(JVMConfigurationKeys.CONTENT_ROOTS, JvmModulePathRoot(file))
                    configuration.add(JVMConfigurationKeys.ADDITIONAL_JAVA_MODULES, moduleName)
                }
                else {
                    configuration.add(JVMConfigurationKeys.CONTENT_ROOTS, JvmClasspathRoot(file))
                }' @ [388:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isModularJava' @ [388:21] ==> val isModularJava: Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[LocalVariableDescriptor]

'configuration' @ [389:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'add' @ [389:35] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [389:60] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmModulePathRoot' @ [389:75] ==> public constructor JvmModulePathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmModulePathRoot[ClassConstructorDescriptorImpl]

'file' @ [389:93] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.addRoot[LocalVariableDescriptor]

'configuration' @ [390:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'add' @ [390:35] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'ADDITIONAL_JAVA_MODULES' @ [390:60] ==> public final val ADDITIONAL_JAVA_MODULES: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'moduleName' @ [390:85] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.addRoot[ValueParameterDescriptorImpl]

'configuration' @ [393:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'add' @ [393:35] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [393:60] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmClasspathRoot' @ [393:75] ==> public constructor JvmClasspathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[ClassConstructorDescriptorImpl]

'file' @ [393:92] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots.addRoot[LocalVariableDescriptor]

'!' @ [397:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arguments' @ [397:18] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'noStdlib' @ [397:28] ==> @GradleOption @Argument public final var noStdlib: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'addRoot' @ [398:17] ==> local final fun addRoot(moduleName: String, libraryName: String, getLibrary: (KotlinPaths) -> File, noLibraryArgument: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[SimpleFunctionDescriptorImpl]

'PathUtil' @ [398:42] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_STDLIB_JAR' @ [398:51] ==> public const final val KOTLIN_JAVA_STDLIB_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'addRoot' @ [399:17] ==> local final fun addRoot(moduleName: String, libraryName: String, getLibrary: (KotlinPaths) -> File, noLibraryArgument: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[SimpleFunctionDescriptorImpl]

'PathUtil' @ [399:50] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_SCRIPT_RUNTIME_JAR' @ [399:59] ==> public const final val KOTLIN_JAVA_SCRIPT_RUNTIME_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'!' @ [403:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arguments' @ [403:18] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'noReflect' @ [403:28] ==> @GradleOption @Argument public final var noReflect: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'!' @ [403:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arguments' @ [403:42] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[ValueParameterDescriptorImpl]

'noStdlib' @ [403:52] ==> @GradleOption @Argument public final var noStdlib: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'addRoot' @ [404:17] ==> local final fun addRoot(moduleName: String, libraryName: String, getLibrary: (KotlinPaths) -> File, noLibraryArgument: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureContentRoots[SimpleFunctionDescriptorImpl]

'PathUtil' @ [404:43] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_REFLECT_JAR' @ [404:52] ==> public const final val KOTLIN_JAVA_REFLECT_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'arguments' @ [410:21] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'noJdk' @ [410:31] ==> @GradleOption @Argument public final var noJdk: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [411:25] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'jdkHome' @ [411:35] ==> @GradleOption @Argument public final var jdkHome: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'messageCollector' @ [412:25] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'report' @ [412:42] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [412:49] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'OK' @ [414:28] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'component1' @ [417:22] ==> public final operator fun component1(): File defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [417:31] ==> public final operator fun component2(): List<File> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (arguments.jdkHome != null) {
                    val jdkHome = File(arguments.jdkHome)
                    if (!jdkHome.exists()) {
                        messageCollector.report(ERROR, "JDK home directory does not exist: $jdkHome")
                        return COMPILATION_ERROR
                    }
                    messageCollector.report(LOGGING, "Using JDK home directory $jdkHome")
                    jdkHome to PathUtil.getJdkClassesRoots(jdkHome)
                }
                else {
                    File(System.getProperty("java.home")) to PathUtil.getJdkClassesRootsFromCurrentJre()
                }' @ [417:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<File, List<File>>, elseBranch: Pair<File, List<File>>): Pair<File, List<File>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<File, List<File>>

'arguments' @ [417:51] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'jdkHome' @ [417:61] ==> @GradleOption @Argument public final var jdkHome: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'File' @ [418:35] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'arguments' @ [418:40] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'jdkHome' @ [418:50] ==> @GradleOption @Argument public final var jdkHome: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'!' @ [419:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jdkHome' @ [419:26] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'exists' @ [419:34] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'messageCollector' @ [420:25] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'report' @ [420:42] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [420:49] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'jdkHome' @ [420:93] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'COMPILATION_ERROR' @ [421:32] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'messageCollector' @ [423:21] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'report' @ [423:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'LOGGING' @ [423:45] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'jdkHome' @ [423:81] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'jdkHome' @ [424:21] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'PathUtil' @ [424:32] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getJdkClassesRoots' @ [424:41] ==> @JvmStatic public final fun getJdkClassesRoots(jdkHome: File): List<File> defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'jdkHome' @ [424:60] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'File' @ [427:21] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getProperty' @ [427:33] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'PathUtil' @ [427:62] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getJdkClassesRootsFromCurrentJre' @ [427:71] ==> @JvmStatic public final fun getJdkClassesRootsFromCurrentJre(): List<File> defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'configuration' @ [430:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'put' @ [430:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'JDK_HOME' @ [430:56] ==> public final val JDK_HOME: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'jdkHome' @ [430:66] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'!' @ [432:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'CoreJrtFileSystem' @ [432:22] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem[FakeCallableDescriptorForObject]

'isModularJdk' @ [432:40] ==> public final fun isModularJdk(jdkHome: File): Boolean defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.Companion[SimpleFunctionDescriptorImpl]

'jdkHome' @ [432:53] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'configuration' @ [433:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'addJvmClasspathRoots' @ [433:35] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[SimpleFunctionDescriptorImpl]

'classesRoots' @ [433:56] ==> val classesRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'classesRoots' @ [434:25] ==> val classesRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'isEmpty' @ [434:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [435:25] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

'report' @ [435:42] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [435:49] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'jdkHome' @ [435:100] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'COMPILATION_ERROR' @ [436:32] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'reportException' @ [441:38] ==> public open fun reportException(@NotNull p0: MessageCollector, @NotNull p1: Throwable): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorUtil[JavaMethodDescriptor]

'messageCollector' @ [441:54] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[ValueParameterDescriptorImpl]

't' @ [441:72] ==> val t: Throwable defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.setupJdkClasspathRoots[LocalVariableDescriptor]

'INTERNAL_ERROR' @ [442:24] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'OK' @ [444:20] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'configuration' @ [451:29] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'jvmClasspathRoots' @ [451:43] ==> public val CompilerConfiguration.jvmClasspathRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[PropertyDescriptorImpl]

'scriptTemplates' @ [453:17] ==> value-parameter scriptTemplates: Array<String>? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'scriptTemplates' @ [453:44] ==> value-parameter scriptTemplates: Array<String>? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'isNotEmpty' @ [453:60] ==> @InlineOnly public inline fun <T> Array<out String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'URLClassLoader' @ [454:35] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'classpath' @ [454:50] ==> val classpath: List<File> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'map' @ [454:60] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [454:66] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [454:69] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [454:77] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [454:87] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'currentThread' @ [454:110] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [454:126] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'scriptTemplates' @ [456:34] ==> value-parameter scriptTemplates: Array<String>? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'classloader' @ [458:35] ==> val classloader: URLClassLoader defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'loadClass' @ [458:47] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'template' @ [458:57] ==> val template: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'KotlinScriptDefinitionFromAnnotatedTemplate' @ [459:35] ==> public constructor KotlinScriptDefinitionFromAnnotatedTemplate(template: KClass<out Any>, providedResolver: DependenciesResolver? = ..., providedScriptFilePattern: String? = ..., environment: Map<String, Any?>? = ..., templateClasspath: List<File> = ...) defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedClassConstructorDescriptor]

'cls' @ [459:79] ==> val cls: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'kotlin' @ [459:83] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'scriptResolverEnv' @ [459:103] ==> value-parameter scriptResolverEnv: HashMap<String, Any?> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'configuration' @ [460:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'add' @ [460:39] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>, @NotNull p1: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinScriptDefinition

'SCRIPT_DEFINITIONS' @ [460:64] ==> public final val SCRIPT_DEFINITIONS: (CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>..CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'def' @ [460:84] ==> val def: KotlinScriptDefinitionFromAnnotatedTemplate defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'messageCollector' @ [461:25] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'report' @ [461:42] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'INFO' @ [462:33] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'+' @ [463:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'template' @ [463:59] ==> val template: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'def' @ [463:106] ==> val def: KotlinScriptDefinitionFromAnnotatedTemplate defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'scriptFilePattern' @ [463:110] ==> public final val scriptFilePattern: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'def' @ [464:47] ==> val def: KotlinScriptDefinitionFromAnnotatedTemplate defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'dependencyResolver' @ [464:51] ==> public open val dependencyResolver: DependenciesResolver defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'javaClass' @ [464:70] ==> public val <T : Any> DependenciesResolver.javaClass: Class<DependenciesResolver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> DependenciesResolver

'name' @ [464:80] ==> public final val <T : (Any..Any?)> Class<DependenciesResolver>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DependenciesResolver

'messageCollector' @ [468:25] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'report' @ [468:42] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [468:49] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'template' @ [468:103] ==> val template: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'hasErrors' @ [469:25] ==> var hasErrors: Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'messageCollector' @ [472:25] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'report' @ [472:42] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [472:49] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'template' @ [472:102] ==> val template: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'ex' @ [472:114] ==> val ex: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'message' @ [472:117] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'hasErrors' @ [473:25] ==> var hasErrors: Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'hasErrors' @ [477:21] ==> var hasErrors: Boolean defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'messageCollector' @ [478:21] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'report' @ [478:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'LOGGING' @ [478:45] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'classpath' @ [478:95] ==> val classpath: List<File> defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[LocalVariableDescriptor]

'configuration' @ [482:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.configureScriptDefinitions[ValueParameterDescriptorImpl]

'add' @ [482:27] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>, @NotNull p1: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinScriptDefinition

'SCRIPT_DEFINITIONS' @ [482:52] ==> public final val SCRIPT_DEFINITIONS: (CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>..CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'StandardScriptDefinition' @ [482:72] ==> public object StandardScriptDefinition : KotlinScriptDefinition defined in org.jetbrains.kotlin.script[FakeCallableDescriptorForObject]

'hashMapOf' @ [486:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Any?> /* = HashMap<String, Any?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any?

'toRegex' @ [491:80] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [492:46] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arguments' @ [493:17] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[ValueParameterDescriptorImpl]

'scriptResolverEnvironment' @ [493:27] ==> @Argument public final var scriptResolverEnvironment: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [494:34] ==> value-parameter arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[ValueParameterDescriptorImpl]

'scriptResolverEnvironment' @ [494:44] ==> @Argument public final var scriptResolverEnvironment: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'envParseRe' @ [495:33] ==> val envParseRe: Regex defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'matchEntire' @ [495:44] ==> public final fun matchEntire(input: CharSequence): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'envParam' @ [495:56] ==> val envParam: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'match' @ [496:25] ==> val match: MatchResult? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'match' @ [496:42] ==> val match: MatchResult? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'groupValues' @ [496:48] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'size' @ [496:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'match' @ [496:72] ==> val match: MatchResult? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'groupValues' @ [496:78] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'isBlank' @ [496:93] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [497:25] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[ValueParameterDescriptorImpl]

'report' @ [497:42] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [497:49] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'envParam' @ [497:111] ==> val envParam: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'scriptResolverEnv' @ [500:21] ==> val scriptResolverEnv: HashMap<String, Any?> /* = HashMap<String, Any?> */ defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'put' @ [500:39] ==> public open fun put(key: String, value: Any?): Any? defined in java.util.HashMap[JavaMethodDescriptor]

'match' @ [500:43] ==> val match: MatchResult? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'groupValues' @ [500:49] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'match' @ [500:65] ==> val match: MatchResult? defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'groupValues' @ [500:71] ==> public abstract val groupValues: List<String> defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'drop' @ [500:83] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'firstOrNull' @ [500:91] ==> public inline fun <T> Iterable<String>.firstOrNull(predicate: (String) -> Boolean): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [500:105] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [500:108] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [500:124] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'unescapeRe' @ [500:130] ==> val unescapeRe: Regex defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'replace' @ [500:141] ==> public final fun replace(input: CharSequence, replacement: String): String defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'it' @ [500:149] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment.<anonymous>[ValueParameterDescriptorImpl]

'scriptResolverEnv' @ [503:20] ==> val scriptResolverEnv: HashMap<String, Any?> /* = HashMap<String, Any?> */ defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion.createScriptResolverEnvironment[LocalVariableDescriptor]

'K2JVMCompiler' @ [508:33] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[FakeCallableDescriptorForObject]

'main' @ [508:47] ==> @JvmStatic public final fun main(args: Array<String>): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'args' @ [508:52] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.cli.jvm.main[ValueParameterDescriptorImpl]

