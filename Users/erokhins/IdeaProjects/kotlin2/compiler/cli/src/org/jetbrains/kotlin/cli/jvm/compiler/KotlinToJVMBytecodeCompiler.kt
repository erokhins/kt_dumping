'module' @ [71:16] ==> value-parameter module: Module defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.getAbsolutePaths[ValueParameterDescriptorImpl]

'getSourceFiles' @ [71:23] ==> public abstract fun getSourceFiles(): List<String> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'map' @ [71:40] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'File' @ [72:26] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'sourceFile' @ [72:31] ==> value-parameter sourceFile: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.getAbsolutePaths.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [73:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'source' @ [73:18] ==> var source: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.getAbsolutePaths.<anonymous>[LocalVariableDescriptor]

'isAbsolute' @ [73:25] ==> public final val File.isAbsolute: Boolean[MyPropertyDescriptor]

'source' @ [74:17] ==> var source: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.getAbsolutePaths.<anonymous>[LocalVariableDescriptor]

'File' @ [74:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'directory' @ [74:31] ==> value-parameter directory: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.getAbsolutePaths[ValueParameterDescriptorImpl]

'sourceFile' @ [74:42] ==> value-parameter sourceFile: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.getAbsolutePaths.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [76:13] ==> var source: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.getAbsolutePaths.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [76:20] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'configuration' @ [85:33] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'getBoolean' @ [85:47] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'REPORT_OUTPUT_FILES' @ [85:82] ==> @field:JvmField public final val REPORT_OUTPUT_FILES: CompilerConfigurationKey<Boolean> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'configuration' @ [86:23] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'get' @ [86:37] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(File..File?)>): File? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.File..java.io.File?)

'OUTPUT_JAR' @ [86:62] ==> public final val OUTPUT_JAR: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [87:32] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'get' @ [87:46] ==> @NotNull public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.cli.common.messages.MessageCollector..org.jetbrains.kotlin.cli.common.messages.MessageCollector?)

'MESSAGE_COLLECTOR_KEY' @ [87:71] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'NONE' @ [87:111] ==> public final val NONE: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector.Companion[DeserializedPropertyDescriptor]

'jarPath' @ [88:13] ==> val jarPath: File? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'configuration' @ [89:34] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'get' @ [89:48] ==> @NotNull public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'INCLUDE_RUNTIME' @ [89:73] ==> public final val INCLUDE_RUNTIME: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'writeToJar' @ [90:36] ==> public open fun writeToJar(jarPath: (File..File?), jarRuntime: Boolean, mainClass: (FqName..FqName?), outputFiles: (OutputFileCollection..OutputFileCollection?)): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.CompileEnvironmentUtil[JavaMethodDescriptor]

'jarPath' @ [90:47] ==> val jarPath: File? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'includeRuntime' @ [90:56] ==> val includeRuntime: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'mainClass' @ [90:72] ==> value-parameter mainClass: FqName? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'outputFiles' @ [90:83] ==> value-parameter outputFiles: OutputFileCollection defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'reportOutputFiles' @ [91:17] ==> val reportOutputFiles: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'formatOutputMessage' @ [92:49] ==> @NotNull public open fun formatOutputMessage(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: (File..File?)): String defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'outputFiles' @ [92:69] ==> value-parameter outputFiles: OutputFileCollection defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'asList' @ [92:81] ==> public abstract fun asList(): List<OutputFile> defined in org.jetbrains.kotlin.backend.common.output.OutputFileCollection[DeserializedSimpleFunctionDescriptor]

'flatMap' @ [92:90] ==> public inline fun <T, R> Iterable<OutputFile>.flatMap(transform: (OutputFile) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R> -> File

'it' @ [92:100] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [92:103] ==> public abstract val sourceFiles: List<File> defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'distinct' @ [92:117] ==> public fun <T> Iterable<File>.distinct(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'jarPath' @ [92:129] ==> val jarPath: File? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'messageCollector' @ [93:17] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'report' @ [93:34] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'OUTPUT' @ [93:41] ==> enum entry OUTPUT defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [93:49] ==> val message: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'configuration' @ [98:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'get' @ [98:39] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(File..File?)>): File? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.File..java.io.File?)

'OUTPUT_DIRECTORY' @ [98:64] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'File' @ [98:85] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputFiles' @ [99:9] ==> value-parameter outputFiles: OutputFileCollection defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[ValueParameterDescriptorImpl]

'writeAll' @ [99:21] ==> public fun OutputFileCollection.writeAll(outputDir: File, messageCollector: MessageCollector, reportOutputFiles: Boolean): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils in file outputUtils.kt[SimpleFunctionDescriptorImpl]

'outputDir' @ [99:30] ==> val outputDir: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'messageCollector' @ [99:41] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'reportOutputFiles' @ [99:59] ==> val reportOutputFiles: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.writeOutput[LocalVariableDescriptor]

'configuration' @ [103:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.createOutputFilesFlushingCallbackIfPossible[ValueParameterDescriptorImpl]

'get' @ [103:27] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(File..File?)>): File? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.File..java.io.File?)

'OUTPUT_DIRECTORY' @ [103:52] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'GenerationStateEventCallback' @ [104:20] ==> public companion object defined in org.jetbrains.kotlin.codegen.state.GenerationStateEventCallback[FakeCallableDescriptorForObject]

'DO_NOTHING' @ [104:49] ==> public final val DO_NOTHING: GenerationStateEventCallback defined in org.jetbrains.kotlin.codegen.state.GenerationStateEventCallback.Companion[DeserializedPropertyDescriptor]

'GenerationStateEventCallback' @ [106:16] ==> public fun GenerationStateEventCallback(block: (GenerationState) -> Unit): GenerationStateEventCallback defined in org.jetbrains.kotlin.codegen.state[DeserializedSimpleFunctionDescriptor]

'SimpleOutputFileCollection' @ [107:33] ==> public constructor SimpleOutputFileCollection(outputFiles: List<OutputFile>) defined in org.jetbrains.kotlin.backend.common.output.SimpleOutputFileCollection[DeserializedClassConstructorDescriptor]

'state' @ [107:60] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.createOutputFilesFlushingCallbackIfPossible.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [107:66] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'currentOutput' @ [107:74] ==> public final val ClassFileFactory.currentOutput: (MutableList<(OutputFile..OutputFile?)>..List<(OutputFile..OutputFile?)>)[MyPropertyDescriptor]

'writeOutput' @ [108:13] ==> private final fun writeOutput(configuration: CompilerConfiguration, outputFiles: OutputFileCollection, mainClass: FqName?): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'configuration' @ [108:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.createOutputFilesFlushingCallbackIfPossible[ValueParameterDescriptorImpl]

'currentOutput' @ [108:40] ==> val currentOutput: SimpleOutputFileCollection defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.createOutputFilesFlushingCallbackIfPossible.<anonymous>[LocalVariableDescriptor]

'!' @ [109:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [109:18] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.createOutputFilesFlushingCallbackIfPossible[ValueParameterDescriptorImpl]

'get' @ [109:32] ==> @NotNull public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'RETAIN_OUTPUT_IN_MEMORY' @ [109:57] ==> public final val RETAIN_OUTPUT_IN_MEMORY: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'state' @ [110:17] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.createOutputFilesFlushingCallbackIfPossible.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [110:23] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'releaseGeneratedOutput' @ [110:31] ==> public open fun releaseGeneratedOutput(): Unit defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'ProgressIndicatorAndCompilationCanceledStatus' @ [116:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [116:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [118:71] ==> @JvmStatic public final fun getInstance(project: Project): ModuleVisibilityManager defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager.SERVICE[DeserializedSimpleFunctionDescriptor]

'environment' @ [118:83] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'project' @ [118:95] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'environment' @ [120:36] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'configuration' @ [120:48] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'projectConfiguration' @ [121:21] ==> val projectConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'getNotNull' @ [121:42] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>): (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)>..kotlin.collections.List<(org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)>?)

'MODULES' @ [121:74] ==> public final val MODULES: (CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>..CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'chunk' @ [122:24] ==> val chunk: (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'moduleVisibilityManager' @ [123:13] ==> val moduleVisibilityManager: ModuleVisibilityManager defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'addModule' @ [123:37] ==> public abstract fun addModule(module: Module): Unit defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager[DeserializedSimpleFunctionDescriptor]

'module' @ [123:47] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'environment' @ [126:27] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'configuration' @ [126:39] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getList' @ [126:53] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'FRIEND_PATHS' @ [126:82] ==> public final val FRIEND_PATHS: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'friendPaths' @ [127:22] ==> val friendPaths: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'moduleVisibilityManager' @ [128:13] ==> val moduleVisibilityManager: ModuleVisibilityManager defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'addFriendPath' @ [128:37] ==> public abstract fun addFriendPath(path: String): Unit defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager[DeserializedSimpleFunctionDescriptor]

'path' @ [128:51] ==> val path: (String..String?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'+' @ [131:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'chunk' @ [131:50] ==> val chunk: (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'joinToString' @ [131:56] ==> public fun <T> Iterable<(Module..Module?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((Module..Module?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)

'input' @ [131:80] ==> value-parameter input: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules.<anonymous>[ValueParameterDescriptorImpl]

'getModuleName' @ [131:86] ==> public abstract fun getModuleName(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'input' @ [131:110] ==> value-parameter input: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules.<anonymous>[ValueParameterDescriptorImpl]

'getModuleType' @ [131:116] ==> public abstract fun getModuleType(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'repeatAnalysisIfNeeded' @ [133:22] ==> private final fun repeatAnalysisIfNeeded(result: AnalysisResult?, environment: KotlinCoreEnvironment, targetDescription: String?): AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'analyze' @ [133:45] ==> private final fun analyze(environment: KotlinCoreEnvironment, targetDescription: String?): AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [133:53] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'targetDescription' @ [133:66] ==> val targetDescription: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'environment' @ [133:86] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'targetDescription' @ [133:99] ==> val targetDescription: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'result' @ [134:13] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'!' @ [134:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [134:32] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'shouldGenerateCode' @ [134:39] ==> public final val shouldGenerateCode: Boolean defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'ProgressIndicatorAndCompilationCanceledStatus' @ [136:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [136:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'result' @ [138:9] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'throwIfError' @ [138:16] ==> public final fun throwIfError(): Unit defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'newLinkedHashMapWithExpectedSize' @ [140:23] ==> public fun <K, V> newLinkedHashMapWithExpectedSize(expectedSize: Int): LinkedHashMap<Module, GenerationState> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Module
    <V> -> GenerationState

'chunk' @ [140:81] ==> val chunk: (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'size' @ [140:87] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'chunk' @ [142:24] ==> val chunk: (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'ProgressIndicatorAndCompilationCanceledStatus' @ [143:13] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [143:59] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'getKtFiles' @ [144:50] ==> @NotNull public open fun getKtFiles(@NotNull project: Project, @NotNull sourceRoots: (MutableCollection<(String..String?)>..Collection<(String..String?)>), @NotNull configuration: CompilerConfiguration, @NotNull reportError: ((String..String?)) -> (Unit..Unit?)): (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.CompileEnvironmentUtil[JavaMethodDescriptor]

'environment' @ [145:21] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'project' @ [145:33] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getAbsolutePaths' @ [145:42] ==> private final fun getAbsolutePaths(directory: File, module: Module): List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'directory' @ [145:59] ==> value-parameter directory: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'module' @ [145:70] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'projectConfiguration' @ [145:79] ==> val projectConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'IllegalStateException' @ [146:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'path' @ [146:88] ==> value-parameter path: (String..String?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [147:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkKotlinPackageUsage' @ [147:18] ==> public fun checkKotlinPackageUsage(environment: KotlinCoreEnvironment, files: Collection<KtFile>): Boolean defined in org.jetbrains.kotlin.cli.common in file utils.kt[SimpleFunctionDescriptorImpl]

'environment' @ [147:42] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'ktFiles' @ [147:55] ==> val ktFiles: (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'projectConfiguration' @ [149:39] ==> val projectConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'copy' @ [149:60] ==> public open fun copy(): (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'apply' @ [149:67] ==> @InlineOnly public inline fun <T> (CompilerConfiguration..CompilerConfiguration?).apply(block: (CompilerConfiguration..CompilerConfiguration?).() -> Unit): (CompilerConfiguration..CompilerConfiguration?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.config.CompilerConfiguration..org.jetbrains.kotlin.config.CompilerConfiguration?)

'put' @ [150:17] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.File..java.io.File?)

'OUTPUT_DIRECTORY' @ [150:42] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'File' @ [150:60] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'module' @ [150:65] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'getOutputDirectory' @ [150:72] ==> public abstract fun getOutputDirectory(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'outputs' @ [153:13] ==> val outputs: LinkedHashMap<Module, GenerationState> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'module' @ [153:21] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'generate' @ [153:31] ==> private final fun generate(environment: KotlinCoreEnvironment, configuration: CompilerConfiguration, result: AnalysisResult, sourceFiles: List<KtFile>, module: Module?): GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [153:40] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'moduleConfiguration' @ [153:53] ==> val moduleConfiguration: (CompilerConfiguration..CompilerConfiguration?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'result' @ [153:74] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'ktFiles' @ [153:82] ==> val ktFiles: (MutableList<(KtFile..KtFile?)>..List<(KtFile..KtFile?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'module' @ [153:91] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'component1' @ [157:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Module, GenerationState>.component1(): Module defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Module
    <V> -> GenerationState

'component2' @ [157:22] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Module, GenerationState>.component2(): GenerationState defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Module
    <V> -> GenerationState

'outputs' @ [157:32] ==> val outputs: LinkedHashMap<Module, GenerationState> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'ProgressIndicatorAndCompilationCanceledStatus' @ [158:17] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [158:63] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'writeOutput' @ [159:17] ==> private final fun writeOutput(configuration: CompilerConfiguration, outputFiles: OutputFileCollection, mainClass: FqName?): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'state' @ [159:29] ==> val state: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'configuration' @ [159:35] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'state' @ [159:50] ==> val state: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'factory' @ [159:56] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'projectConfiguration' @ [162:17] ==> val projectConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'getBoolean' @ [162:38] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'USE_JAVAC' @ [162:70] ==> public final val USE_JAVAC: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'chunk' @ [163:36] ==> val chunk: (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'singleOrNull' @ [163:42] ==> public fun <T> List<(Module..Module?)>.singleOrNull(): Module? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)

'if (singleModule != null) {
                    return JavacWrapper.getInstance(environment.project).use {
                        it.compile(File(singleModule.getOutputDirectory()))
                    }
                }
                else {
                    projectConfiguration.getNotNull(CLIConfigurationKeys.MESSAGE_COLLECTOR_KEY).let {
                        it.report(WARNING, "A chunk contains multiple modules (${chunk.joinToString { it.getModuleName() }}). -Xuse-javac option couldn't be used to compile java files")
                    }
                    JavacWrapper.getInstance(environment.project).close()
                }' @ [164:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'singleModule' @ [164:21] ==> val singleModule: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'JavacWrapper' @ [165:28] ==> public companion object defined in org.jetbrains.kotlin.javac.JavacWrapper[FakeCallableDescriptorForObject]

'getInstance' @ [165:41] ==> public final fun getInstance(project: Project): JavacWrapper defined in org.jetbrains.kotlin.javac.JavacWrapper.Companion[DeserializedSimpleFunctionDescriptor]

'environment' @ [165:53] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'project' @ [165:65] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'use' @ [165:74] ==> @InlineOnly public inline fun <T : Closeable?, R> JavacWrapper.use(block: (JavacWrapper) -> Boolean): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JavacWrapper
    <R> -> Boolean

'it' @ [166:25] ==> value-parameter it: JavacWrapper defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules.<anonymous>[ValueParameterDescriptorImpl]

'compile' @ [166:28] ==> public final fun compile(outDir: File? = ...): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[DeserializedSimpleFunctionDescriptor]

'File' @ [166:36] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'singleModule' @ [166:41] ==> val singleModule: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'getOutputDirectory' @ [166:54] ==> public abstract fun getOutputDirectory(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'projectConfiguration' @ [170:21] ==> val projectConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'getNotNull' @ [170:42] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.cli.common.messages.MessageCollector..org.jetbrains.kotlin.cli.common.messages.MessageCollector?)

'MESSAGE_COLLECTOR_KEY' @ [170:74] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'let' @ [170:97] ==> @InlineOnly public inline fun <T, R> MessageCollector.let(block: (MessageCollector) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageCollector
    <R> -> Unit

'it' @ [171:25] ==> value-parameter it: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [171:28] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'WARNING' @ [171:35] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'chunk' @ [171:82] ==> val chunk: (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'joinToString' @ [171:88] ==> public fun <T> Iterable<(Module..Module?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((Module..Module?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)

'it' @ [171:103] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getModuleName' @ [171:106] ==> public abstract fun getModuleName(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [173:34] ==> public final fun getInstance(project: Project): JavacWrapper defined in org.jetbrains.kotlin.javac.JavacWrapper.Companion[DeserializedSimpleFunctionDescriptor]

'environment' @ [173:46] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[ValueParameterDescriptorImpl]

'project' @ [173:58] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'close' @ [173:67] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.javac.JavacWrapper[DeserializedSimpleFunctionDescriptor]

'outputs' @ [180:13] ==> val outputs: LinkedHashMap<Module, GenerationState> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules[LocalVariableDescriptor]

'values' @ [180:21] ==> public open val values: MutableCollection<GenerationState> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'forEach' @ [180:28] ==> @HidesMembers public inline fun <T> Iterable<GenerationState>.forEach(action: (GenerationState) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenerationState

'GenerationState' @ [180:36] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'destroy' @ [180:53] ==> public final fun destroy(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'chunk' @ [185:24] ==> value-parameter chunk: List<Module> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'configuration' @ [186:13] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'addKotlinSourceRoots' @ [186:27] ==> public fun CompilerConfiguration.addKotlinSourceRoots(sources: List<String>): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'getAbsolutePaths' @ [186:48] ==> private final fun getAbsolutePaths(directory: File, module: Module): List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'directory' @ [186:65] ==> value-parameter directory: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'module' @ [186:76] ==> val module: Module defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'chunk' @ [189:24] ==> value-parameter chunk: List<Module> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'component1' @ [190:19] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.modules.JavaRootPath[DeserializedSimpleFunctionDescriptor]

'component2' @ [190:25] ==> public final operator fun component2(): String? defined in org.jetbrains.kotlin.modules.JavaRootPath[DeserializedSimpleFunctionDescriptor]

'module' @ [190:43] ==> val module: Module defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'getJavaSourceRoots' @ [190:50] ==> public abstract fun getJavaSourceRoots(): List<JavaRootPath> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'configuration' @ [191:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'addJavaSourceRoot' @ [191:31] ==> @JvmOverloads public fun CompilerConfiguration.addJavaSourceRoot(file: File, packagePrefix: String? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[SimpleFunctionDescriptorImpl]

'File' @ [191:49] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [191:54] ==> val path: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'packagePrefix' @ [191:61] ==> val packagePrefix: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'chunk' @ [195:29] ==> value-parameter chunk: List<Module> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'any' @ [195:35] ==> public inline fun <T> Iterable<Module>.any(predicate: (Module) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'module' @ [196:13] ==> value-parameter module: Module defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots.<anonymous>[ValueParameterDescriptorImpl]

'getJavaSourceRoots' @ [196:20] ==> public abstract fun getJavaSourceRoots(): List<JavaRootPath> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'any' @ [196:41] ==> public inline fun <T> Iterable<JavaRootPath>.any(predicate: (JavaRootPath) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRootPath

'component1' @ [196:48] ==> public final operator fun component1(): String defined in org.jetbrains.kotlin.modules.JavaRootPath[DeserializedSimpleFunctionDescriptor]

'component2' @ [196:54] ==> public final operator fun component2(): String? defined in org.jetbrains.kotlin.modules.JavaRootPath[DeserializedSimpleFunctionDescriptor]

'File' @ [197:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [197:33] ==> val path: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots.<anonymous>.<anonymous>[LocalVariableDescriptor]

'packagePrefix' @ [198:17] ==> val packagePrefix: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots.<anonymous>.<anonymous>[LocalVariableDescriptor]

'file' @ [199:18] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [199:23] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'MODULE_INFO_FILE' @ [199:45] ==> public const final val MODULE_INFO_FILE: String defined in com.intellij.psi.PsiJavaModule[JavaPropertyDescriptor]

'file' @ [200:19] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isDirectory' @ [200:24] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [200:39] ==> val file: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots.<anonymous>.<anonymous>[LocalVariableDescriptor]

'listFiles' @ [200:44] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'any' @ [200:56] ==> public inline fun <T> Array<out (File..File?)>.any(predicate: ((File..File?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'it' @ [200:62] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [200:65] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'MODULE_INFO_FILE' @ [200:87] ==> public const final val MODULE_INFO_FILE: String defined in com.intellij.psi.PsiJavaModule[JavaPropertyDescriptor]

'chunk' @ [204:24] ==> value-parameter chunk: List<Module> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'module' @ [205:35] ==> val module: Module defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'getClasspathRoots' @ [205:42] ==> public abstract fun getClasspathRoots(): List<String> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'configuration' @ [206:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'add' @ [206:31] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>, @NotNull p1: ContentRoot): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.config.ContentRoot..org.jetbrains.kotlin.config.ContentRoot?)

'CONTENT_ROOTS' @ [207:46] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'if (isJava9Module) JvmModulePathRoot(File(classpathRoot)) else JvmClasspathRoot(File(classpathRoot))' @ [208:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmContentRoot, elseBranch: JvmContentRoot): JvmContentRoot[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmContentRoot

'isJava9Module' @ [208:29] ==> val isJava9Module: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'JvmModulePathRoot' @ [208:44] ==> public constructor JvmModulePathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmModulePathRoot[ClassConstructorDescriptorImpl]

'File' @ [208:62] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'classpathRoot' @ [208:67] ==> val classpathRoot: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'JvmClasspathRoot' @ [208:88] ==> public constructor JvmClasspathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[ClassConstructorDescriptorImpl]

'File' @ [208:105] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'classpathRoot' @ [208:110] ==> val classpathRoot: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'chunk' @ [213:24] ==> value-parameter chunk: List<Module> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'module' @ [214:34] ==> val module: Module defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'modularJdkRoot' @ [214:41] ==> public abstract val modularJdkRoot: String? defined in org.jetbrains.kotlin.modules.Module[DeserializedPropertyDescriptor]

'modularJdkRoot' @ [215:17] ==> val modularJdkRoot: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'configuration' @ [218:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'put' @ [218:31] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.File..java.io.File?)

'JDK_HOME' @ [218:56] ==> public final val JDK_HOME: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'File' @ [218:66] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'modularJdkRoot' @ [218:71] ==> val modularJdkRoot: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[LocalVariableDescriptor]

'configuration' @ [223:9] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'addAll' @ [223:23] ==> public open fun <T : (Any..Any?)> addAll(@NotNull p0: CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>, @NotNull p1: (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>)): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)

'MODULES' @ [223:51] ==> public final val MODULES: (CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>..CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'chunk' @ [223:60] ==> value-parameter chunk: List<Module> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.configureSourceRoots[ValueParameterDescriptorImpl]

'MainFunctionDetector' @ [227:36] ==> public constructor MainFunctionDetector(bindingContext: BindingContext) defined in org.jetbrains.kotlin.idea.MainFunctionDetector[DeserializedClassConstructorDescriptor]

'generationState' @ [227:57] ==> value-parameter generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.findMainClass[ValueParameterDescriptorImpl]

'bindingContext' @ [227:73] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'files' @ [228:16] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.findMainClass[ValueParameterDescriptorImpl]

'asSequence' @ [228:22] ==> public fun <T> Iterable<KtFile>.asSequence(): Sequence<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'map' @ [229:18] ==> public fun <T, R> Sequence<KtFile>.map(transform: (KtFile) -> FqName?): Sequence<FqName?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> FqName?

'if (mainFunctionDetector.hasMain(file.declarations))
                        JvmFileClassUtil.getFileClassInfoNoResolve(file).facadeClassFqName
                    else
                        null' @ [230:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'mainFunctionDetector' @ [230:25] ==> val mainFunctionDetector: MainFunctionDetector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.findMainClass[LocalVariableDescriptor]

'hasMain' @ [230:46] ==> public final fun hasMain(declarations: List<KtDeclaration>): Boolean defined in org.jetbrains.kotlin.idea.MainFunctionDetector[DeserializedSimpleFunctionDescriptor]

'file' @ [230:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.findMainClass.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [230:59] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'getFileClassInfoNoResolve' @ [231:42] ==> @JvmStatic public final fun getFileClassInfoNoResolve(file: KtFile): JvmFileClassInfo defined in org.jetbrains.kotlin.fileClasses.JvmFileClassUtil[DeserializedSimpleFunctionDescriptor]

'file' @ [231:68] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.findMainClass.<anonymous>[ValueParameterDescriptorImpl]

'facadeClassFqName' @ [231:74] ==> public abstract val facadeClassFqName: FqName defined in org.jetbrains.kotlin.fileClasses.JvmFileClassInfo[DeserializedPropertyDescriptor]

'singleOrNull' @ [235:18] ==> public inline fun <T> Sequence<FqName?>.singleOrNull(predicate: (FqName?) -> Boolean): FqName? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName?

'it' @ [235:33] ==> value-parameter it: FqName? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.findMainClass.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [239:71] ==> @JvmStatic public final fun getInstance(project: Project): ModuleVisibilityManager defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager.SERVICE[DeserializedSimpleFunctionDescriptor]

'environment' @ [239:83] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[ValueParameterDescriptorImpl]

'project' @ [239:95] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'environment' @ [241:27] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[ValueParameterDescriptorImpl]

'configuration' @ [241:39] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getList' @ [241:53] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'FRIEND_PATHS' @ [241:82] ==> public final val FRIEND_PATHS: (CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>..CompilerConfigurationKey<(MutableList<(String..String?)>..List<(String..String?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'friendPaths' @ [242:22] ==> val friendPaths: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[LocalVariableDescriptor]

'moduleVisibilityManager' @ [243:13] ==> val moduleVisibilityManager: ModuleVisibilityManager defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[LocalVariableDescriptor]

'addFriendPath' @ [243:37] ==> public abstract fun addFriendPath(path: String): Unit defined in org.jetbrains.kotlin.load.kotlin.ModuleVisibilityManager[DeserializedSimpleFunctionDescriptor]

'path' @ [243:51] ==> val path: (String..String?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[LocalVariableDescriptor]

'!' @ [246:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkKotlinPackageUsage' @ [246:14] ==> public fun checkKotlinPackageUsage(environment: KotlinCoreEnvironment, files: Collection<KtFile>): Boolean defined in org.jetbrains.kotlin.cli.common in file utils.kt[SimpleFunctionDescriptorImpl]

'environment' @ [246:38] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[ValueParameterDescriptorImpl]

'environment' @ [246:51] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[ValueParameterDescriptorImpl]

'getSourceFiles' @ [246:63] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'analyzeAndGenerate' @ [248:31] ==> public final fun analyzeAndGenerate(environment: KotlinCoreEnvironment): GenerationState? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [248:50] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[ValueParameterDescriptorImpl]

'findMainClass' @ [250:25] ==> private final fun findMainClass(generationState: GenerationState, files: List<KtFile>): FqName? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'generationState' @ [250:39] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[LocalVariableDescriptor]

'environment' @ [250:56] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[ValueParameterDescriptorImpl]

'getSourceFiles' @ [250:68] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'writeOutput' @ [253:13] ==> private final fun writeOutput(configuration: CompilerConfiguration, outputFiles: OutputFileCollection, mainClass: FqName?): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [253:25] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[ValueParameterDescriptorImpl]

'configuration' @ [253:37] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'generationState' @ [253:52] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[LocalVariableDescriptor]

'factory' @ [253:68] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mainClass' @ [253:77] ==> val mainClass: FqName? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[LocalVariableDescriptor]

'generationState' @ [257:13] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileBunchOfSources[LocalVariableDescriptor]

'destroy' @ [257:29] ==> public final fun destroy(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'compileScript' @ [262:27] ==> public final fun compileScript(environment: KotlinCoreEnvironment, parentClassLoader: ClassLoader? = ...): Class<*>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [262:41] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileAndExecuteScript[ValueParameterDescriptorImpl]

'COMPILATION_ERROR' @ [262:73] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'tryConstructClassFromStringArgs' @ [266:17] ==> public fun tryConstructClassFromStringArgs(clazz: Class<*>, args: List<String>): Any? defined in org.jetbrains.kotlin.script[DeserializedSimpleFunctionDescriptor]

'scriptClass' @ [266:49] ==> val scriptClass: Class<*> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileAndExecuteScript[LocalVariableDescriptor]

'scriptArgs' @ [266:62] ==> value-parameter scriptArgs: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileAndExecuteScript[ValueParameterDescriptorImpl]

'RuntimeException' @ [267:26] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'scriptClass' @ [267:95] ==> val scriptClass: Class<*> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileAndExecuteScript[LocalVariableDescriptor]

'name' @ [267:107] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'scriptArgs' @ [267:134] ==> value-parameter scriptArgs: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileAndExecuteScript[ValueParameterDescriptorImpl]

'out' @ [271:24] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [271:28] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'err' @ [272:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [272:28] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'reportExceptionFromScript' @ [276:13] ==> private final fun reportExceptionFromScript(exception: Throwable): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'e' @ [276:39] ==> val e: Throwable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileAndExecuteScript[LocalVariableDescriptor]

'SCRIPT_EXECUTION_ERROR' @ [277:29] ==> enum entry SCRIPT_EXECUTION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'OK' @ [280:25] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'result' @ [288:13] ==> value-parameter result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'environment' @ [289:33] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'configuration' @ [289:45] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'configuration' @ [291:36] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[LocalVariableDescriptor]

'isReadOnly' @ [291:50] ==> public final var CompilerConfiguration.isReadOnly: Boolean[MyPropertyDescriptor]

'configuration' @ [292:13] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[LocalVariableDescriptor]

'isReadOnly' @ [292:27] ==> public final var CompilerConfiguration.isReadOnly: Boolean[MyPropertyDescriptor]

'configuration' @ [293:13] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[LocalVariableDescriptor]

'addJavaSourceRoots' @ [293:27] ==> @JvmOverloads public fun CompilerConfiguration.addJavaSourceRoots(files: List<File>, packagePrefix: String? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[SimpleFunctionDescriptorImpl]

'result' @ [293:46] ==> value-parameter result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'additionalJavaRoots' @ [293:53] ==> public final val additionalJavaRoots: List<File> defined in org.jetbrains.kotlin.analyzer.AnalysisResult.RetryWithAdditionalJavaRoots[DeserializedPropertyDescriptor]

'configuration' @ [294:13] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[LocalVariableDescriptor]

'isReadOnly' @ [294:27] ==> public final var CompilerConfiguration.isReadOnly: Boolean[MyPropertyDescriptor]

'oldReadOnlyValue' @ [294:40] ==> val oldReadOnlyValue: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[LocalVariableDescriptor]

'result' @ [296:17] ==> value-parameter result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'addToEnvironment' @ [296:24] ==> public final val addToEnvironment: Boolean defined in org.jetbrains.kotlin.analyzer.AnalysisResult.RetryWithAdditionalJavaRoots[DeserializedPropertyDescriptor]

'environment' @ [297:17] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'updateClasspath' @ [297:29] ==> public final fun updateClasspath(contentRoots: List<ContentRoot>): List<File>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'result' @ [297:45] ==> value-parameter result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'additionalJavaRoots' @ [297:52] ==> public final val additionalJavaRoots: List<File> defined in org.jetbrains.kotlin.analyzer.AnalysisResult.RetryWithAdditionalJavaRoots[DeserializedPropertyDescriptor]

'map' @ [297:72] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> JavaSourceRoot): List<JavaSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> JavaSourceRoot

'JavaSourceRoot' @ [297:78] ==> public constructor JavaSourceRoot(file: File, packagePrefix: String?) defined in org.jetbrains.kotlin.cli.jvm.config.JavaSourceRoot[ClassConstructorDescriptorImpl]

'it' @ [297:93] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'getApplication' @ [301:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [301:49] ==> public final fun runWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'getInstance' @ [302:29] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'environment' @ [302:41] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'project' @ [302:53] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'modificationTracker' @ [302:62] ==> public final val PsiManager.modificationTracker: PsiModificationTracker[MyPropertyDescriptor]

'incCounter' @ [302:115] ==> public open fun incCounter(): Unit defined in com.intellij.psi.impl.PsiModificationTrackerImpl[JavaMethodDescriptor]

'configuration' @ [306:13] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[LocalVariableDescriptor]

'MESSAGE_COLLECTOR_KEY' @ [306:48] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'clear' @ [306:72] ==> public abstract fun clear(): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'analyze' @ [309:20] ==> private final fun analyze(environment: KotlinCoreEnvironment, targetDescription: String?): AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [309:28] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'targetDescription' @ [309:41] ==> value-parameter targetDescription: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'result' @ [312:16] ==> value-parameter result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.repeatAnalysisIfNeeded[ValueParameterDescriptorImpl]

'err' @ [317:29] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'exception' @ [318:21] ==> value-parameter exception: Throwable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[ValueParameterDescriptorImpl]

'cause' @ [318:31] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'exception' @ [319:13] ==> value-parameter exception: Throwable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[ValueParameterDescriptorImpl]

'cause' @ [319:56] ==> val cause: Throwable? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'exception' @ [320:13] ==> value-parameter exception: Throwable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[ValueParameterDescriptorImpl]

'printStackTrace' @ [320:23] ==> public open fun printStackTrace(p0: (PrintStream..PrintStream?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'stream' @ [320:39] ==> val stream: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'stream' @ [323:9] ==> val stream: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'println' @ [323:16] ==> public open fun println(p0: (Any..Any?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'cause' @ [323:24] ==> val cause: Throwable? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'cause' @ [324:25] ==> val cause: Throwable? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'stackTrace' @ [324:31] ==> public final var Throwable.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'until' @ [325:19] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'fullTrace' @ [325:27] ==> val fullTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'size' @ [325:37] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'exception' @ [325:44] ==> value-parameter exception: Throwable defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[ValueParameterDescriptorImpl]

'stackTrace' @ [325:54] ==> public final var InvocationTargetException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'size' @ [325:65] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'stream' @ [326:13] ==> val stream: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'println' @ [326:20] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'+' @ [326:28] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fullTrace' @ [326:38] ==> val fullTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'i' @ [326:48] ==> val i: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.reportExceptionFromScript[LocalVariableDescriptor]

'analyzeAndGenerate' @ [331:21] ==> public final fun analyzeAndGenerate(environment: KotlinCoreEnvironment): GenerationState? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [331:40] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[ValueParameterDescriptorImpl]

'environment' @ [334:24] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[ValueParameterDescriptorImpl]

'configuration' @ [334:36] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getList' @ [334:50] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>): (MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.config.ContentRoot..org.jetbrains.kotlin.config.ContentRoot?)

'CONTENT_ROOTS' @ [334:79] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'mapNotNull' @ [334:94] ==> public inline fun <T, R : Any> Iterable<(ContentRoot..ContentRoot?)>.mapNotNull(transform: ((ContentRoot..ContentRoot?)) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.config.ContentRoot..org.jetbrains.kotlin.config.ContentRoot?)
    <R : Any> -> File

'when (root) {
                    is JvmModulePathRoot -> root.file // TODO: only add required modules
                    is JvmClasspathRoot -> root.file
                    else -> null
                }' @ [335:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: File?, entry1: File?, entry2: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> File?

'root' @ [335:23] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [336:45] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [336:50] ==> public open val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmModulePathRoot[PropertyDescriptorImpl]

'root' @ [337:44] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [337:49] ==> public open val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[PropertyDescriptorImpl]

'map' @ [340:15] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [340:21] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [340:24] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [340:32] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'GeneratedClassLoader' @ [342:31] ==> public constructor GeneratedClassLoader(@NotNull p0: ClassFileFactory, p1: (ClassLoader..ClassLoader?), vararg p2: (URL..URL?)) defined in org.jetbrains.kotlin.codegen.GeneratedClassLoader[JavaClassConstructorDescriptor]

'state' @ [342:52] ==> val state: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[LocalVariableDescriptor]

'factory' @ [342:58] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'parentClassLoader' @ [342:67] ==> value-parameter parentClassLoader: ClassLoader? = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[ValueParameterDescriptorImpl]

'URLClassLoader' @ [342:88] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'urls' @ [342:103] ==> val urls: List<(URL..URL?)> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[LocalVariableDescriptor]

'toTypedArray' @ [342:108] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'environment' @ [344:26] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[ValueParameterDescriptorImpl]

'getSourceFiles' @ [344:38] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'script' @ [344:58] ==> public final val KtFile.script: KtScript?[MyPropertyDescriptor]

'error' @ [344:68] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classLoader' @ [345:20] ==> val classLoader: GeneratedClassLoader defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[LocalVariableDescriptor]

'loadClass' @ [345:32] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.codegen.GeneratedClassLoader[JavaMethodDescriptor]

'script' @ [345:42] ==> val script: KtScript defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[LocalVariableDescriptor]

'fqName' @ [345:49] ==> public final val KtScript.fqName: FqName[MyPropertyDescriptor]

'asString' @ [345:56] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'RuntimeException' @ [348:19] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'+' @ [348:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [348:68] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[LocalVariableDescriptor]

'e' @ [348:71] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileScript[LocalVariableDescriptor]

'repeatAnalysisIfNeeded' @ [353:22] ==> private final fun repeatAnalysisIfNeeded(result: AnalysisResult?, environment: KotlinCoreEnvironment, targetDescription: String?): AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'analyze' @ [353:45] ==> private final fun analyze(environment: KotlinCoreEnvironment, targetDescription: String?): AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [353:53] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[ValueParameterDescriptorImpl]

'environment' @ [353:73] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[ValueParameterDescriptorImpl]

'!' @ [355:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [355:14] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[LocalVariableDescriptor]

'shouldGenerateCode' @ [355:21] ==> public final val shouldGenerateCode: Boolean defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'result' @ [357:9] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[LocalVariableDescriptor]

'throwIfError' @ [357:16] ==> public final fun throwIfError(): Unit defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'generate' @ [359:16] ==> private final fun generate(environment: KotlinCoreEnvironment, configuration: CompilerConfiguration, result: AnalysisResult, sourceFiles: List<KtFile>, module: Module?): GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'environment' @ [359:25] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[ValueParameterDescriptorImpl]

'environment' @ [359:38] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[ValueParameterDescriptorImpl]

'configuration' @ [359:50] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'result' @ [359:65] ==> val result: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[LocalVariableDescriptor]

'environment' @ [359:73] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyzeAndGenerate[ValueParameterDescriptorImpl]

'getSourceFiles' @ [359:85] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'environment' @ [363:27] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'getSourceFiles' @ [363:39] ==> public final fun getSourceFiles(): List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'environment' @ [364:25] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'messageCollector' @ [364:37] ==> private final val KotlinCoreEnvironment.messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[PropertyDescriptorImpl]

'PerformanceCounter' @ [366:29] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [366:48] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[DeserializedSimpleFunctionDescriptor]

'AnalyzerWithCompilerReport' @ [367:42] ==> public constructor AnalyzerWithCompilerReport(messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[ClassConstructorDescriptorImpl]

'collector' @ [367:69] ==> val collector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'analyzerWithCompilerReport' @ [368:9] ==> val analyzerWithCompilerReport: AnalyzerWithCompilerReport defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'analyzeAndReport' @ [368:36] ==> public final fun analyzeAndReport(files: Collection<KtFile>, analyze: () -> AnalysisResult): Unit defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[SimpleFunctionDescriptorImpl]

'sourceFiles' @ [368:53] ==> val sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'environment' @ [369:27] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'project' @ [369:39] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'environment' @ [370:33] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'configuration' @ [370:45] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'get' @ [370:59] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>): (MutableList<(Module..Module?)>?..List<(Module..Module?)>?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)>..kotlin.collections.List<(org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)>?)

'MODULES' @ [370:84] ==> public final val MODULES: (CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>..CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'mapNotNull' @ [370:94] ==> public inline fun <T, R : Any> Iterable<(Module..Module?)>.mapNotNull(transform: ((Module..Module?)) -> VirtualFile?): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)
    <R : Any> -> VirtualFile

'environment' @ [371:17] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'findLocalFile' @ [371:29] ==> internal final fun findLocalFile(path: String): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'module' @ [371:43] ==> value-parameter module: (Module..Module?) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getOutputDirectory' @ [371:50] ==> public abstract fun getOutputDirectory(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'orEmpty' @ [372:15] ==> @InlineOnly public inline fun <T> List<VirtualFile>?.orEmpty(): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'TopDownAnalyzerFacadeForJVM' @ [373:31] ==> public object TopDownAnalyzerFacadeForJVM defined in org.jetbrains.kotlin.cli.jvm.compiler in file TopDownAnalyzerFacadeForJVM.kt[FakeCallableDescriptorForObject]

'newModuleSearchScope' @ [373:59] ==> public final fun newModuleSearchScope(project: Project, files: Collection<KtFile>): GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[SimpleFunctionDescriptorImpl]

'project' @ [373:80] ==> val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'sourceFiles' @ [373:89] ==> val sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'if (moduleOutputs.isEmpty()) sourcesOnly else sourcesOnly.uniteWith(DirectoriesScope(project, moduleOutputs))' @ [376:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GlobalSearchScope, elseBranch: GlobalSearchScope): GlobalSearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GlobalSearchScope

'moduleOutputs' @ [376:29] ==> val moduleOutputs: List<VirtualFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [376:43] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'sourcesOnly' @ [376:54] ==> val sourcesOnly: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'sourcesOnly' @ [376:71] ==> val sourcesOnly: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'uniteWith' @ [376:83] ==> @NotNull public open fun uniteWith(@NotNull p0: GlobalSearchScope): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'DirectoriesScope' @ [376:93] ==> public constructor DirectoriesScope(project: Project, directories: List<VirtualFile>) defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.DirectoriesScope[ClassConstructorDescriptorImpl]

'project' @ [376:110] ==> val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'moduleOutputs' @ [376:119] ==> val moduleOutputs: List<VirtualFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'TopDownAnalyzerFacadeForJVM' @ [377:13] ==> public object TopDownAnalyzerFacadeForJVM defined in org.jetbrains.kotlin.cli.jvm.compiler in file TopDownAnalyzerFacadeForJVM.kt[FakeCallableDescriptorForObject]

'analyzeFilesWithJavaIntegration' @ [377:41] ==> @JvmStatic @JvmOverloads public final fun analyzeFilesWithJavaIntegration(project: Project, files: Collection<KtFile>, trace: BindingTrace, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider, declarationProviderFactory: (StorageManager, Collection<KtFile>) -> DeclarationProviderFactory = ..., sourceModuleSearchScope: GlobalSearchScope = ...): AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[SimpleFunctionDescriptorImpl]

'project' @ [378:21] ==> val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'sourceFiles' @ [379:21] ==> val sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'NoScopeRecordCliBindingTrace' @ [380:52] ==> public constructor NoScopeRecordCliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace[ClassConstructorDescriptorImpl]

'environment' @ [381:21] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'configuration' @ [381:33] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'environment' @ [382:21] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'createPackagePartProvider' @ [382:34] ==> public final fun createPackagePartProvider(scope: GlobalSearchScope): JvmPackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'scope' @ [383:47] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze.<anonymous>[LocalVariableDescriptor]

'PerformanceCounter' @ [387:29] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [387:48] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[DeserializedSimpleFunctionDescriptor]

'analysisStart' @ [387:64] ==> val analysisStart: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'environment' @ [389:33] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'countLinesOfCode' @ [389:45] ==> internal final fun countLinesOfCode(sourceFiles: List<KtFile>): Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'sourceFiles' @ [389:62] ==> val sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'toMillis' @ [390:41] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'analysisNanos' @ [390:50] ==> val analysisNanos: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'sourceLinesOfCode' @ [391:21] ==> val sourceLinesOfCode: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'toFloat' @ [391:39] ==> public open fun toFloat(): Float defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'time' @ [391:58] ==> val time: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'+' @ [393:23] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'sourceFiles' @ [393:35] ==> val sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'size' @ [393:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'sourceLinesOfCode' @ [393:61] ==> val sourceLinesOfCode: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'targetDescription' @ [393:88] ==> value-parameter targetDescription: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'time' @ [394:28] ==> val time: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'format' @ [394:47] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'speed' @ [394:54] ==> val speed: Float defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'K2JVMCompiler' @ [396:9] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[FakeCallableDescriptorForObject]

'reportPerf' @ [396:23] ==> public final fun reportPerf(configuration: CompilerConfiguration, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'environment' @ [396:34] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[ValueParameterDescriptorImpl]

'configuration' @ [396:46] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'message' @ [396:61] ==> val message: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'analyzerWithCompilerReport' @ [398:30] ==> val analyzerWithCompilerReport: AnalyzerWithCompilerReport defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'analysisResult' @ [398:57] ==> public final lateinit var analysisResult: AnalysisResult defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[PropertyDescriptorImpl]

'if (!analyzerWithCompilerReport.hasErrors() || analysisResult is AnalysisResult.RetryWithAdditionalJavaRoots)
            analysisResult
        else
            null' @ [400:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnalysisResult?, elseBranch: AnalysisResult?): AnalysisResult?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnalysisResult?

'!' @ [400:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'analyzerWithCompilerReport' @ [400:21] ==> val analyzerWithCompilerReport: AnalyzerWithCompilerReport defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'hasErrors' @ [400:48] ==> public final fun hasErrors(): Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[SimpleFunctionDescriptorImpl]

'analysisResult' @ [400:63] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'analysisResult' @ [401:13] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze[LocalVariableDescriptor]

'DelegatingGlobalSearchScope' @ [408:9] ==> public constructor DelegatingGlobalSearchScope(@NotNull p0: GlobalSearchScope) defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaClassConstructorDescriptor]

'allScope' @ [408:55] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [408:64] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.DirectoriesScope.<init>[ValueParameterDescriptorImpl]

'directories' @ [411:17] ==> private final val directories: List<VirtualFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.DirectoriesScope[PropertyDescriptorImpl]

'any' @ [411:29] ==> public inline fun <T> Iterable<VirtualFile>.any(predicate: (VirtualFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'isAncestor' @ [411:60] ==> public open fun isAncestor(@NotNull p0: VirtualFile, @NotNull p1: VirtualFile, p2: Boolean): Boolean defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'directory' @ [411:71] ==> value-parameter directory: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.DirectoriesScope.contains.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [411:82] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.DirectoriesScope.contains[ValueParameterDescriptorImpl]

'directories' @ [413:54] ==> private final val directories: List<VirtualFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.DirectoriesScope[PropertyDescriptorImpl]

'environment' @ [423:30] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'project' @ [423:42] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getUserData' @ [423:50] ==> @Nullable public abstract fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Boolean..Boolean?)>): Boolean? defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'IS_KAPT2_ENABLED_KEY' @ [423:62] ==> public val IS_KAPT2_ENABLED_KEY: Key<Boolean> defined in org.jetbrains.kotlin.cli.jvm.config in file Kapt2EnabledKey.kt[PropertyDescriptorImpl]

'GenerationState' @ [424:31] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'environment' @ [425:17] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'project' @ [425:29] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'binaries' @ [426:39] ==> @NotNull public open fun binaries(p0: Boolean): ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.ClassBuilderFactories[JavaMethodDescriptor]

'isKapt2Enabled' @ [426:48] ==> val isKapt2Enabled: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'result' @ [427:17] ==> value-parameter result: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [427:24] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'result' @ [428:17] ==> value-parameter result: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'bindingContext' @ [428:24] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'sourceFiles' @ [429:17] ==> value-parameter sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'configuration' @ [430:17] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'GENERATE_ALL' @ [431:53] ==> @field:JvmField public final val GENERATE_ALL: GenerationState.GenerateClassFilter defined in org.jetbrains.kotlin.codegen.state.GenerationState.GenerateClassFilter.Companion[DeserializedPropertyDescriptor]

'if (configuration.getBoolean(JVMConfigurationKeys.IR)) JvmIrCodegenFactory else DefaultCodegenFactory' @ [432:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodegenFactory, elseBranch: CodegenFactory): CodegenFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodegenFactory

'configuration' @ [432:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'getBoolean' @ [432:35] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'IR' @ [432:67] ==> public final val IR: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmIrCodegenFactory' @ [432:72] ==> public object JvmIrCodegenFactory : CodegenFactory defined in org.jetbrains.kotlin.backend.jvm[FakeCallableDescriptorForObject]

'DefaultCodegenFactory' @ [432:97] ==> public object DefaultCodegenFactory : CodegenFactory defined in org.jetbrains.kotlin.codegen[FakeCallableDescriptorForObject]

'module' @ [433:17] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'let' @ [433:25] ==> @InlineOnly public inline fun <T, R> Module.let(block: (Module) -> TargetId): TargetId defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> TargetId

'TargetId' @ [433:31] ==> public fun TargetId(module: Module): TargetId defined in org.jetbrains.kotlin.modules[DeserializedSimpleFunctionDescriptor]

'module' @ [434:17] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'let' @ [434:25] ==> @InlineOnly public inline fun <T, R> Module.let(block: (Module) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> String

'getModuleName' @ [434:37] ==> public abstract fun getModuleName(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'module' @ [435:17] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'let' @ [435:25] ==> @InlineOnly public inline fun <T, R> Module.let(block: (Module) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> File

'File' @ [435:31] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [435:36] ==> value-parameter it: Module defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate.<anonymous>[ValueParameterDescriptorImpl]

'getOutputDirectory' @ [435:39] ==> public abstract fun getOutputDirectory(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'createOutputFilesFlushingCallbackIfPossible' @ [436:17] ==> private final fun createOutputFilesFlushingCallbackIfPossible(configuration: CompilerConfiguration): GenerationStateEventCallback defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[SimpleFunctionDescriptorImpl]

'configuration' @ [436:61] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'ProgressIndicatorAndCompilationCanceledStatus' @ [438:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [438:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'PerformanceCounter' @ [440:31] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [440:50] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[DeserializedSimpleFunctionDescriptor]

'compileCorrectFiles' @ [442:29] ==> public open fun compileCorrectFiles(@NotNull p0: GenerationState, @NotNull p1: CompilationErrorHandler): Unit defined in org.jetbrains.kotlin.codegen.KotlinCodegenFacade[JavaMethodDescriptor]

'generationState' @ [442:49] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'THROW_EXCEPTION' @ [442:90] ==> public final val THROW_EXCEPTION: (CompilationErrorHandler..CompilationErrorHandler?) defined in org.jetbrains.kotlin.codegen.CompilationErrorHandler[JavaPropertyDescriptor]

'PerformanceCounter' @ [444:31] ==> public companion object defined in org.jetbrains.kotlin.util.PerformanceCounter[FakeCallableDescriptorForObject]

'currentTime' @ [444:50] ==> public final fun currentTime(): Long defined in org.jetbrains.kotlin.util.PerformanceCounter.Companion[DeserializedSimpleFunctionDescriptor]

'generationStart' @ [444:66] ==> val generationStart: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'if (module != null) "target " + module.getModuleName() + "-" + module.getModuleType() + " " else ""' @ [445:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'module' @ [445:24] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'+' @ [445:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'module' @ [445:52] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'getModuleName' @ [445:59] ==> public abstract fun getModuleName(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'module' @ [445:83] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'getModuleType' @ [445:90] ==> public abstract fun getModuleType(): String defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'sourceFiles' @ [446:35] ==> value-parameter sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'size' @ [446:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'environment' @ [447:29] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'countLinesOfCode' @ [447:41] ==> internal final fun countLinesOfCode(sourceFiles: List<KtFile>): Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'sourceFiles' @ [447:58] ==> value-parameter sourceFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'toMillis' @ [448:41] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'generationNanos' @ [448:50] ==> val generationNanos: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'numberOfLines' @ [449:21] ==> val numberOfLines: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'toFloat' @ [449:35] ==> public open fun toFloat(): Float defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'time' @ [449:54] ==> val time: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'numberOfSourceFiles' @ [450:35] ==> val numberOfSourceFiles: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'numberOfLines' @ [450:63] ==> val numberOfLines: Int defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'desc' @ [450:86] ==> val desc: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'time' @ [450:95] ==> val time: Long defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'format' @ [450:114] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'speed' @ [450:121] ==> val speed: Float defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'K2JVMCompiler' @ [452:9] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[FakeCallableDescriptorForObject]

'reportPerf' @ [452:23] ==> public final fun reportPerf(configuration: CompilerConfiguration, message: String): Unit defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.Companion[SimpleFunctionDescriptorImpl]

'environment' @ [452:34] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'configuration' @ [452:46] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'message' @ [452:61] ==> val message: String defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'ProgressIndicatorAndCompilationCanceledStatus' @ [453:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [453:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'AnalyzerWithCompilerReport' @ [455:9] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[FakeCallableDescriptorForObject]

'reportDiagnostics' @ [455:36] ==> public final fun reportDiagnostics(diagnostics: Diagnostics, messageCollector: MessageCollector): Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[SimpleFunctionDescriptorImpl]

'FilteredJvmDiagnostics' @ [456:17] ==> public constructor FilteredJvmDiagnostics(jvmDiagnostics: Diagnostics, otherDiagnostics: Diagnostics) defined in org.jetbrains.kotlin.asJava.FilteredJvmDiagnostics[DeserializedClassConstructorDescriptor]

'generationState' @ [457:25] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'collectedExtraJvmDiagnostics' @ [457:41] ==> public final val collectedExtraJvmDiagnostics: Diagnostics defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'result' @ [458:25] ==> value-parameter result: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'bindingContext' @ [458:32] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'diagnostics' @ [458:47] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'environment' @ [460:17] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'messageCollector' @ [460:29] ==> private final val KotlinCoreEnvironment.messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[PropertyDescriptorImpl]

'AnalyzerWithCompilerReport' @ [463:9] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[FakeCallableDescriptorForObject]

'reportBytecodeVersionErrors' @ [463:36] ==> public final fun reportBytecodeVersionErrors(bindingContext: BindingContext, messageCollector: MessageCollector): Unit defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[SimpleFunctionDescriptorImpl]

'generationState' @ [464:17] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'extraJvmDiagnosticsTrace' @ [464:33] ==> public final val extraJvmDiagnosticsTrace: BindingTrace defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'bindingContext' @ [464:58] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'environment' @ [464:74] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[ValueParameterDescriptorImpl]

'messageCollector' @ [464:86] ==> private final val KotlinCoreEnvironment.messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[PropertyDescriptorImpl]

'ProgressIndicatorAndCompilationCanceledStatus' @ [467:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [467:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'generationState' @ [468:16] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate[LocalVariableDescriptor]

'configuration' @ [472:17] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getNotNull' @ [472:31] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.cli.common.messages.MessageCollector..org.jetbrains.kotlin.cli.common.messages.MessageCollector?)

'MESSAGE_COLLECTOR_KEY' @ [472:63] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

