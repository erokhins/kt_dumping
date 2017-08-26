'KotlinCompilerRunner<JpsCompilerEnvironment>' @ [37:33] ==> public constructor KotlinCompilerRunner<in Env : CompilerEnvironment>() defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner[DeserializedClassConstructorDescriptor]
Inferred types:
    <in Env : CompilerEnvironment> -> JpsCompilerEnvironment

'JpsKotlinLogger' @ [38:38] ==> public constructor JpsKotlinLogger(log: Logger) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinLogger[ClassConstructorDescriptorImpl]

'LOG' @ [38:68] ==> public final val LOG: Logger defined in org.jetbrains.kotlin.jps.build.KotlinBuilder.Companion[PropertyDescriptorImpl]

'compilerSettings' @ [43:19] ==> private final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'compilerSettings' @ [45:13] ==> private final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'settings' @ [45:32] ==> value-parameter settings: CompilerSettings defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.withCompilerSettings[ValueParameterDescriptorImpl]

'invoke' @ [46:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'compilerSettings' @ [49:13] ==> private final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'old' @ [49:32] ==> val old: CompilerSettings? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.withCompilerSettings[LocalVariableDescriptor]

'Volatile' @ [54:9] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'Synchronized' @ [57:9] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'_jpsCompileServiceSession' @ [59:17] ==> @Volatile private final var _jpsCompileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.Companion[PropertyDescriptorImpl]

'_jpsCompileServiceSession' @ [60:17] ==> @Volatile private final var _jpsCompileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.Companion[PropertyDescriptorImpl]

'invoke' @ [60:45] ==> public abstract operator fun invoke(): CompileServiceSession? defined in kotlin.Function0[FunctionInvokeDescriptor]

'_jpsCompileServiceSession' @ [63:20] ==> @Volatile private final var _jpsCompileServiceSession: CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.Companion[PropertyDescriptorImpl]

'mergeBeans' @ [74:25] ==> public fun <From : Any, To : (CommonCompilerArguments..CommonCompilerArguments?)> mergeBeans(from: (CommonCompilerArguments..CommonCompilerArguments?), to: (K2JVMCompilerArguments..K2JVMCompilerArguments?)): (K2JVMCompilerArguments..K2JVMCompilerArguments?) defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)
    <To : From> -> (org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments?)

'commonArguments' @ [74:36] ==> value-parameter commonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JvmCompiler[ValueParameterDescriptorImpl]

'createCopy' @ [74:71] ==> public open fun <T : (Any..Any?)> createCopy(@NotNull p0: K2JVMCompilerArguments): (K2JVMCompilerArguments..K2JVMCompilerArguments?) defined in com.intellij.util.xmlb.XmlSerializerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> K2JVMCompilerArguments

'k2jvmArguments' @ [74:82] ==> value-parameter k2jvmArguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JvmCompiler[ValueParameterDescriptorImpl]

'setupK2JvmArguments' @ [75:9] ==> private final fun setupK2JvmArguments(moduleFile: File, settings: K2JVMCompilerArguments): Unit defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'moduleFile' @ [75:29] ==> value-parameter moduleFile: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JvmCompiler[ValueParameterDescriptorImpl]

'arguments' @ [75:41] ==> val arguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JvmCompiler[LocalVariableDescriptor]

'withCompilerSettings' @ [76:9] ==> private final inline fun withCompilerSettings(settings: CompilerSettings, fn: () -> Unit): Unit defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerSettings' @ [76:30] ==> value-parameter compilerSettings: CompilerSettings defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JvmCompiler[ValueParameterDescriptorImpl]

'runCompiler' @ [77:13] ==> protected final fun runCompiler(compilerClassName: String, compilerArgs: CommonCompilerArguments, environment: JpsCompilerEnvironment): ExitCode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedSimpleFunctionDescriptor]

'K2JVM_COMPILER' @ [77:25] ==> protected final val K2JVM_COMPILER: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedPropertyDescriptor]

'arguments' @ [77:41] ==> val arguments: (K2JVMCompilerArguments..K2JVMCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JvmCompiler[LocalVariableDescriptor]

'environment' @ [77:52] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JvmCompiler[ValueParameterDescriptorImpl]

'log' @ [92:9] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'debug' @ [92:13] ==> public abstract fun debug(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'+' @ [92:19] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'convertArgumentsToStringList' @ [92:62] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'commonArguments' @ [92:91] ==> value-parameter commonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'log' @ [93:9] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'debug' @ [93:13] ==> public abstract fun debug(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'+' @ [93:19] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'convertArgumentsToStringList' @ [93:58] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'k2jsArguments' @ [93:87] ==> value-parameter k2jsArguments: K2JSCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'mergeBeans' @ [95:25] ==> public fun <From : Any, To : (CommonCompilerArguments..CommonCompilerArguments?)> mergeBeans(from: (CommonCompilerArguments..CommonCompilerArguments?), to: (K2JSCompilerArguments..K2JSCompilerArguments?)): (K2JSCompilerArguments..K2JSCompilerArguments?) defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)
    <To : From> -> (org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments?)

'commonArguments' @ [95:36] ==> value-parameter commonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'createCopy' @ [95:71] ==> public open fun <T : (Any..Any?)> createCopy(@NotNull p0: K2JSCompilerArguments): (K2JSCompilerArguments..K2JSCompilerArguments?) defined in com.intellij.util.xmlb.XmlSerializerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> K2JSCompilerArguments

'k2jsArguments' @ [95:82] ==> value-parameter k2jsArguments: K2JSCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'log' @ [96:9] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'debug' @ [96:13] ==> public abstract fun debug(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'+' @ [96:19] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'convertArgumentsToStringList' @ [96:62] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'arguments' @ [96:91] ==> val arguments: (K2JSCompilerArguments..K2JSCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[LocalVariableDescriptor]

'setupK2JsArguments' @ [98:9] ==> private final fun setupK2JsArguments(_outputFile: File, sourceFiles: Collection<File>, _libraries: List<String>, _friendModules: List<String>, settings: K2JSCompilerArguments): Unit defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'outputFile' @ [98:28] ==> value-parameter outputFile: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'sourceFiles' @ [98:40] ==> value-parameter sourceFiles: Collection<File> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'libraries' @ [98:53] ==> value-parameter libraries: List<String> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'friendModules' @ [98:64] ==> value-parameter friendModules: List<String> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'arguments' @ [98:79] ==> val arguments: (K2JSCompilerArguments..K2JSCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[LocalVariableDescriptor]

'arguments' @ [99:13] ==> val arguments: (K2JSCompilerArguments..K2JSCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[LocalVariableDescriptor]

'sourceMap' @ [99:23] ==> @GradleOption @Argument public final var sourceMap: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'arguments' @ [100:13] ==> val arguments: (K2JSCompilerArguments..K2JSCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[LocalVariableDescriptor]

'sourceMapSourceRoots' @ [100:23] ==> @Argument public final var sourceMapSourceRoots: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'sourceRoots' @ [100:46] ==> value-parameter sourceRoots: Collection<File> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'joinToString' @ [100:58] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'pathSeparator' @ [100:76] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'it' @ [100:93] ==> value-parameter it: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [100:96] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'log' @ [103:9] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'debug' @ [103:13] ==> public abstract fun debug(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'+' @ [103:19] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'convertArgumentsToStringList' @ [103:65] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'arguments' @ [103:94] ==> val arguments: (K2JSCompilerArguments..K2JSCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[LocalVariableDescriptor]

'withCompilerSettings' @ [105:9] ==> private final inline fun withCompilerSettings(settings: CompilerSettings, fn: () -> Unit): Unit defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerSettings' @ [105:30] ==> value-parameter compilerSettings: CompilerSettings defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'runCompiler' @ [106:13] ==> protected final fun runCompiler(compilerClassName: String, compilerArgs: CommonCompilerArguments, environment: JpsCompilerEnvironment): ExitCode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedSimpleFunctionDescriptor]

'K2JS_COMPILER' @ [106:25] ==> protected final val K2JS_COMPILER: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedPropertyDescriptor]

'arguments' @ [106:40] ==> val arguments: (K2JSCompilerArguments..K2JSCompilerArguments?) defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[LocalVariableDescriptor]

'environment' @ [106:51] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.runK2JsCompiler[ValueParameterDescriptorImpl]

'log' @ [115:9] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'debug' @ [115:13] ==> public abstract fun debug(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'+' @ [115:19] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'environment' @ [115:44] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'kotlinPaths' @ [115:56] ==> public final val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[PropertyDescriptorImpl]

'homePath' @ [115:68] ==> public final val KotlinPaths.homePath: File[MyPropertyDescriptor]

'if (isDaemonEnabled()) {
            val daemonExitCode = compileWithDaemon(compilerClassName, compilerArgs, environment)
            daemonExitCode ?: fallbackCompileStrategy(compilerArgs, compilerClassName, environment)
        }
        else {
            fallbackCompileStrategy(compilerArgs, compilerClassName, environment)
        }' @ [117:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExitCode, elseBranch: ExitCode): ExitCode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExitCode

'isDaemonEnabled' @ [117:20] ==> public fun isDaemonEnabled(): Boolean defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'compileWithDaemon' @ [118:34] ==> protected open fun compileWithDaemon(compilerClassName: String, compilerArgs: CommonCompilerArguments, environment: JpsCompilerEnvironment): ExitCode? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerClassName' @ [118:52] ==> value-parameter compilerClassName: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'compilerArgs' @ [118:71] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'environment' @ [118:85] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'daemonExitCode' @ [119:13] ==> val daemonExitCode: ExitCode? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[LocalVariableDescriptor]

'fallbackCompileStrategy' @ [119:31] ==> private final fun fallbackCompileStrategy(compilerArgs: CommonCompilerArguments, compilerClassName: String, environment: JpsCompilerEnvironment): ExitCode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerArgs' @ [119:55] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'compilerClassName' @ [119:69] ==> value-parameter compilerClassName: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'environment' @ [119:88] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'fallbackCompileStrategy' @ [122:13] ==> private final fun fallbackCompileStrategy(compilerArgs: CommonCompilerArguments, compilerClassName: String, environment: JpsCompilerEnvironment): ExitCode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerArgs' @ [122:37] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'compilerClassName' @ [122:51] ==> value-parameter compilerClassName: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'environment' @ [122:70] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemonOrFallback[ValueParameterDescriptorImpl]

'when (compilerClassName) {
            K2JVM_COMPILER -> CompileService.TargetPlatform.JVM
            K2JS_COMPILER -> CompileService.TargetPlatform.JS
            K2METADATA_COMPILER -> CompileService.TargetPlatform.METADATA
            else -> throw IllegalArgumentException("Unknown compiler type $compilerClassName")
        }' @ [131:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompileService.TargetPlatform, entry1: CompileService.TargetPlatform, entry2: CompileService.TargetPlatform, entry3: CompileService.TargetPlatform): CompileService.TargetPlatform[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TargetPlatform

'compilerClassName' @ [131:36] ==> value-parameter compilerClassName: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[ValueParameterDescriptorImpl]

'K2JVM_COMPILER' @ [132:13] ==> protected final val K2JVM_COMPILER: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedPropertyDescriptor]

'JVM' @ [132:61] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'K2JS_COMPILER' @ [133:13] ==> protected final val K2JS_COMPILER: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedPropertyDescriptor]

'JS' @ [133:60] ==> enum entry JS defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'K2METADATA_COMPILER' @ [134:13] ==> protected final val K2METADATA_COMPILER: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedPropertyDescriptor]

'METADATA' @ [134:66] ==> enum entry METADATA defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'IllegalArgumentException' @ [135:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'compilerClassName' @ [135:76] ==> value-parameter compilerClassName: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[ValueParameterDescriptorImpl]

'log' @ [138:9] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'debug' @ [138:13] ==> public abstract fun debug(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'getDaemonConnection' @ [139:26] ==> protected open fun getDaemonConnection(environment: JpsCompilerEnvironment): CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'environment' @ [139:46] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[ValueParameterDescriptorImpl]

'connection' @ [140:13] ==> val connection: CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'log' @ [141:13] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'info' @ [141:17] ==> public abstract fun info(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'component1' @ [145:14] ==> public final operator fun component1(): CompileService defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedSimpleFunctionDescriptor]

'component2' @ [145:22] ==> public final operator fun component2(): Int defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[DeserializedSimpleFunctionDescriptor]

'connection' @ [145:35] ==> val connection: CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'JPS_COMPILER' @ [146:41] ==> enum entry JPS_COMPILER defined in org.jetbrains.kotlin.daemon.common.CompilerMode[FakeCallableDescriptorForObject]

'compilerArgs' @ [147:23] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[ValueParameterDescriptorImpl]

'verbose' @ [147:36] ==> @GradleOption @Argument public final var verbose: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'CompilationOptions' @ [148:23] ==> public constructor CompilationOptions(compilerMode: CompilerMode, targetPlatform: CompileService.TargetPlatform, reportCategories: Array<Int>, reportSeverity: Int, requestedCompilationResults: Array<Int>) defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedClassConstructorDescriptor]

'compilerMode' @ [148:42] ==> val compilerMode: CompilerMode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'targetPlatform' @ [148:56] ==> val targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'reportCategories' @ [148:72] ==> private final fun reportCategories(verbose: Boolean): Array<Int> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'verbose' @ [148:89] ==> val verbose: Boolean defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'reportSeverity' @ [148:99] ==> private final fun reportSeverity(verbose: Boolean): Int defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'verbose' @ [148:114] ==> val verbose: Boolean defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'emptyArray' @ [148:154] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'daemon' @ [149:19] ==> val daemon: CompileService defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'compile' @ [149:26] ==> public abstract fun compile(sessionId: Int, compilerArguments: Array<out String>, compilationOptions: CompilationOptions, servicesFacade: CompilerServicesFacadeBase, compilationResults: CompilationResults?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [149:34] ==> val sessionId: Int defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'withAdditionalCompilerArgs' @ [149:45] ==> private final fun withAdditionalCompilerArgs(compilerArgs: CommonCompilerArguments): Array<String> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerArgs' @ [149:72] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[ValueParameterDescriptorImpl]

'options' @ [149:87] ==> val options: CompilationOptions defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'JpsCompilerServicesFacadeImpl' @ [149:96] ==> public constructor JpsCompilerServicesFacadeImpl(env: JpsCompilerEnvironment, port: Int = ...) defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl[ClassConstructorDescriptorImpl]

'environment' @ [149:126] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[ValueParameterDescriptorImpl]

'exitCodeFromProcessExitCode' @ [150:16] ==> protected final fun exitCodeFromProcessExitCode(code: Int): ExitCode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedSimpleFunctionDescriptor]

'res' @ [150:44] ==> val res: CompileService.CallResult<Int> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.compileWithDaemon[LocalVariableDescriptor]

'get' @ [150:48] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'+' @ [154:23] ==> public operator fun <T> Collection<(String..String?)>.plus(elements: Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'convertArgumentsToStringList' @ [154:37] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'compilerArgs' @ [154:66] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.withAdditionalCompilerArgs[ValueParameterDescriptorImpl]

'compilerSettings' @ [155:24] ==> private final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'additionalArgumentsAsList' @ [155:42] ==> public val CompilerSettings.additionalArgumentsAsList: List<String> defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'emptyList' @ [155:71] ==> public fun <T> emptyList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'allArgs' @ [156:16] ==> val allArgs: List<(String..String?)> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.withAdditionalCompilerArgs[LocalVariableDescriptor]

'toTypedArray' @ [156:24] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'if (!verbose) {
                arrayOf(ReportCategory.COMPILER_MESSAGE, ReportCategory.EXCEPTION)
            }
            else {
                ReportCategory.values()
            }' @ [161:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<ReportCategory>, elseBranch: Array<ReportCategory>): Array<ReportCategory>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<ReportCategory>

'!' @ [161:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'verbose' @ [161:18] ==> value-parameter verbose: Boolean defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.reportCategories[ValueParameterDescriptorImpl]

'arrayOf' @ [162:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ReportCategory): Array<ReportCategory> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ReportCategory

'COMPILER_MESSAGE' @ [162:40] ==> enum entry COMPILER_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'EXCEPTION' @ [162:73] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'values' @ [165:32] ==> public final fun values(): Array<ReportCategory> defined in org.jetbrains.kotlin.daemon.common.ReportCategory[SimpleFunctionDescriptorImpl]

'categories' @ [168:16] ==> val categories: Array<ReportCategory> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.reportCategories[LocalVariableDescriptor]

'map' @ [168:27] ==> public inline fun <T, R> Array<out ReportCategory>.map(transform: (ReportCategory) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReportCategory
    <R> -> Int

'it' @ [168:33] ==> value-parameter it: ReportCategory defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.reportCategories.<anonymous>[ValueParameterDescriptorImpl]

'code' @ [168:36] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'toTypedArray' @ [168:43] ==> public inline fun <reified T> Collection<Int>.toTypedArray(): Array<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Int

'if (!verbose) {
                ReportSeverity.INFO.code
            }
            else {
                ReportSeverity.DEBUG.code
            }' @ [173:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'!' @ [173:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'verbose' @ [173:18] ==> value-parameter verbose: Boolean defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.reportSeverity[ValueParameterDescriptorImpl]

'code' @ [174:37] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'code' @ [177:38] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'log' @ [186:9] ==> protected open val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[PropertyDescriptorImpl]

'info' @ [186:13] ==> public abstract fun info(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[DeserializedSimpleFunctionDescriptor]

'ByteArrayOutputStream' @ [188:22] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintStream' @ [189:19] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'stream' @ [189:31] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[LocalVariableDescriptor]

'getProperty' @ [194:20] ==> public open fun getProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_PARALLEL_OPTION' @ [194:46] ==> public const final val COMPILE_PARALLEL_OPTION: String defined in org.jetbrains.jps.api.GlobalOptions[JavaPropertyDescriptor]

'toBoolean' @ [194:80] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'setProperty' @ [195:20] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_COMPILER_ENVIRONMENT_KEEPALIVE_PROPERTY' @ [195:32] ==> public val KOTLIN_COMPILER_ENVIRONMENT_KEEPALIVE_PROPERTY: String defined in org.jetbrains.kotlin.cli.common[DeserializedPropertyDescriptor]

'invokeExecMethod' @ [197:37] ==> @Nullable public open fun invokeExecMethod(@NotNull compilerClassName: String, @NotNull arguments: (Array<(String..String?)>..Array<out (String..String?)>), @NotNull environment: JpsCompilerEnvironment, @NotNull out: PrintStream): Any? defined in org.jetbrains.kotlin.compilerRunner.CompilerRunnerUtil[JavaMethodDescriptor]

'compilerClassName' @ [197:54] ==> value-parameter compilerClassName: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[ValueParameterDescriptorImpl]

'withAdditionalCompilerArgs' @ [197:73] ==> private final fun withAdditionalCompilerArgs(compilerArgs: CommonCompilerArguments): Array<String> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerArgs' @ [197:100] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[ValueParameterDescriptorImpl]

'environment' @ [197:115] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[ValueParameterDescriptorImpl]

'out' @ [197:128] ==> val out: PrintStream defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[LocalVariableDescriptor]

'valueOf' @ [201:33] ==> public final fun valueOf(value: String): ExitCode defined in org.jetbrains.kotlin.cli.common.ExitCode[SimpleFunctionDescriptorImpl]

'getReturnCodeFromObject' @ [201:41] ==> private final fun getReturnCodeFromObject(rc: Any?): String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'rc' @ [201:65] ==> val rc: Any? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[LocalVariableDescriptor]

'processCompilerOutput' @ [202:9] ==> protected final fun processCompilerOutput(environment: JpsCompilerEnvironment, stream: ByteArrayOutputStream, exitCode: ExitCode?): Unit defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedSimpleFunctionDescriptor]

'environment' @ [202:31] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[ValueParameterDescriptorImpl]

'stream' @ [202:44] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[LocalVariableDescriptor]

'exitCode' @ [202:52] ==> val exitCode: ExitCode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[LocalVariableDescriptor]

'exitCode' @ [203:16] ==> val exitCode: ExitCode defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.fallbackCompileStrategy[LocalVariableDescriptor]

'with' @ [207:9] ==> @InlineOnly public inline fun <T, R> with(receiver: K2JVMCompilerArguments, block: K2JVMCompilerArguments.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JVMCompilerArguments
    <R> -> Unit

'settings' @ [207:14] ==> value-parameter settings: K2JVMCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JvmArguments[ValueParameterDescriptorImpl]

'buildFile' @ [208:13] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'moduleFile' @ [208:25] ==> value-parameter moduleFile: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JvmArguments[ValueParameterDescriptorImpl]

'absolutePath' @ [208:36] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'destination' @ [209:13] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'noStdlib' @ [210:13] ==> @GradleOption @Argument public final var noStdlib: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'noReflect' @ [211:13] ==> @GradleOption @Argument public final var noReflect: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'noJdk' @ [212:13] ==> @GradleOption @Argument public final var noJdk: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'with' @ [217:9] ==> @InlineOnly public inline fun <T, R> with(receiver: K2JSCompilerArguments, block: K2JSCompilerArguments.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JSCompilerArguments
    <R> -> Unit

'settings' @ [217:14] ==> value-parameter settings: K2JSCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JsArguments[ValueParameterDescriptorImpl]

'noStdlib' @ [218:13] ==> @GradleOption @Argument public final var noStdlib: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'freeArgs' @ [219:13] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'sourceFiles' @ [219:24] ==> value-parameter sourceFiles: Collection<File> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JsArguments[ValueParameterDescriptorImpl]

'map' @ [219:36] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [219:42] ==> value-parameter it: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JsArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [219:45] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'toMutableList' @ [219:52] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'outputFile' @ [220:13] ==> @GradleOption @Argument public final var outputFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'_outputFile' @ [220:26] ==> value-parameter _outputFile: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JsArguments[ValueParameterDescriptorImpl]

'path' @ [220:38] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'metaInfo' @ [221:13] ==> @GradleOption @Argument public final var metaInfo: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'libraries' @ [222:13] ==> @Argument public final var libraries: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'_libraries' @ [222:25] ==> value-parameter _libraries: List<String> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JsArguments[ValueParameterDescriptorImpl]

'joinToString' @ [222:36] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pathSeparator' @ [222:54] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'friendModules' @ [223:13] ==> @Argument public final var friendModules: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'_friendModules' @ [223:29] ==> value-parameter _friendModules: List<String> defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.setupK2JsArguments[ValueParameterDescriptorImpl]

'joinToString' @ [223:44] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pathSeparator' @ [223:62] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'when {
        rc == null -> INTERNAL_ERROR
        ExitCode::class.java.name == rc::class.java.name -> rc.toString()
        else -> throw IllegalStateException("Unexpected return: " + rc)
    }' @ [227:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'rc' @ [228:9] ==> value-parameter rc: Any? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getReturnCodeFromObject[ValueParameterDescriptorImpl]

'INTERNAL_ERROR' @ [228:23] ==> protected final val INTERNAL_ERROR: String defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedPropertyDescriptor]

'ExitCode' @ [229:9] ==> private constructor ExitCode(p0: Int) defined in org.jetbrains.kotlin.cli.common.ExitCode[JavaClassConstructorDescriptor]

'java' @ [229:25] ==> public val <T> KClass<ExitCode>.java: Class<ExitCode> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ExitCode

'name' @ [229:30] ==> public final val <T : (Any..Any?)> Class<ExitCode>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ExitCode

'rc' @ [229:38] ==> value-parameter rc: Any? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getReturnCodeFromObject[ValueParameterDescriptorImpl]

'java' @ [229:48] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'name' @ [229:53] ==> public final val <T : (Any..Any?)> Class<out Any>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'rc' @ [229:61] ==> value-parameter rc: Any? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getReturnCodeFromObject[ValueParameterDescriptorImpl]

'toString' @ [229:64] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'IllegalStateException' @ [230:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [230:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'rc' @ [230:69] ==> value-parameter rc: Any? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getReturnCodeFromObject[ValueParameterDescriptorImpl]

'getOrCreateDaemonConnection' @ [234:13] ==> @Synchronized private final fun getOrCreateDaemonConnection(newConnection: () -> CompileServiceSession?): CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.Companion[SimpleFunctionDescriptorImpl]

'getLibPath' @ [235:50] ==> @Nullable public open fun getLibPath(@NotNull paths: KotlinPaths, @NotNull messageCollector: MessageCollector): File? defined in org.jetbrains.kotlin.compilerRunner.CompilerRunnerUtil[JavaMethodDescriptor]

'environment' @ [235:61] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection[ValueParameterDescriptorImpl]

'kotlinPaths' @ [235:73] ==> public final val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[PropertyDescriptorImpl]

'environment' @ [235:86] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection[ValueParameterDescriptorImpl]

'messageCollector' @ [235:98] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'File' @ [236:36] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'libPath' @ [236:41] ==> val libPath: File? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'getJdkToolsJar' @ [237:55] ==> @Nullable public/*package*/ open fun getJdkToolsJar(): File? defined in org.jetbrains.kotlin.compilerRunner.CompilerRunnerUtil[JavaMethodDescriptor]

'CompilerId' @ [238:34] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [238:45] ==> @JvmStatic public final fun makeCompilerId(paths: Iterable<File>): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'listOfNotNull' @ [238:60] ==> public fun <T : Any> listOfNotNull(vararg elements: File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> File

'compilerPath' @ [238:74] ==> val compilerPath: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'toolsJarPath' @ [238:88] ==> val toolsJarPath: File? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'configureDaemonOptions' @ [239:37] ==> public fun configureDaemonOptions(): DaemonOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'KotlinCompilerClient' @ [241:38] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'getOrCreateClientFlagFile' @ [241:59] ==> public final fun getOrCreateClientFlagFile(daemonOptions: DaemonOptions): File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'daemonOptions' @ [241:85] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'makeAutodeletingFlagFile' @ [242:39] ==> public fun makeAutodeletingFlagFile(keyword: String = ..., baseDir: File? = ...): File defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'File' @ [242:89] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'daemonOptions' @ [242:94] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'runFilesPathOrDefault' @ [242:108] ==> public val DaemonOptions.runFilesPathOrDefault: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'newDaemonConnection' @ [243:17] ==> protected final fun newDaemonConnection(compilerId: CompilerId, clientAliveFlagFile: File, sessionAliveFlagFile: File, environment: JpsCompilerEnvironment, daemonOptions: DaemonOptions): CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [243:37] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'clientFlagFile' @ [243:49] ==> val clientFlagFile: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'sessionFlagFile' @ [243:65] ==> val sessionFlagFile: File defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

'environment' @ [243:82] ==> value-parameter environment: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection[ValueParameterDescriptorImpl]

'daemonOptions' @ [243:95] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.compilerRunner.JpsKotlinCompilerRunner.getDaemonConnection.<anonymous>[LocalVariableDescriptor]

