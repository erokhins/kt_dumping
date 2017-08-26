'ConcurrentHashMap' @ [40:76] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> VirtualFile
    <V : (Any..Any?)> -> KotlinConsoleRunner

'consoleMap' @ [42:61] ==> private final val consoleMap: MutableMap<VirtualFile, KotlinConsoleRunner> defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[PropertyDescriptorImpl]

'virtualFile' @ [42:72] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.getConsoleByVirtualFile[ValueParameterDescriptorImpl]

'consoleMap' @ [43:91] ==> private final val consoleMap: MutableMap<VirtualFile, KotlinConsoleRunner> defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[PropertyDescriptorImpl]

'put' @ [43:102] ==> public abstract fun put(key: VirtualFile, value: KotlinConsoleRunner): KotlinConsoleRunner? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'virtualFile' @ [43:106] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.putVirtualFileToConsole[ValueParameterDescriptorImpl]

'console' @ [43:119] ==> value-parameter console: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.putVirtualFileToConsole[ValueParameterDescriptorImpl]

'consoleMap' @ [44:51] ==> private final val consoleMap: MutableMap<VirtualFile, KotlinConsoleRunner> defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[PropertyDescriptorImpl]

'remove' @ [44:62] ==> public abstract fun remove(key: VirtualFile): KotlinConsoleRunner? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'virtualFile' @ [44:69] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.removeConsole[ValueParameterDescriptorImpl]

'module' @ [47:20] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[ValueParameterDescriptorImpl]

'moduleFilePath' @ [47:27] ==> public final val Module.moduleFilePath: String[MyPropertyDescriptor]

'createCommandLine' @ [48:23] ==> private final fun createCommandLine(module: Module): GeneralCommandLine? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[SimpleFunctionDescriptorImpl]

'module' @ [48:41] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[ValueParameterDescriptorImpl]

'run' @ [48:59] ==> @InlineOnly public inline fun <T, R> KotlinConsoleKeeper.run(block: KotlinConsoleKeeper.() -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinConsoleKeeper
    <R> -> Nothing?

'errorNotification' @ [48:65] ==> public fun errorNotification(project: Project?, message: String): Unit defined in org.jetbrains.kotlin.console.actions in file RunExecuteActions.kt[SimpleFunctionDescriptorImpl]

'project' @ [48:83] ==> public final val project: Project defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[PropertyDescriptorImpl]

'KotlinConsoleRunner' @ [50:29] ==> public constructor KotlinConsoleRunner(module: Module, cmdLine: GeneralCommandLine, previousCompilationFailed: Boolean, myProject: Project, title: String, path: String?) defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[ClassConstructorDescriptorImpl]

'module' @ [50:49] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[ValueParameterDescriptorImpl]

'cmdLine' @ [50:57] ==> val cmdLine: GeneralCommandLine defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[LocalVariableDescriptor]

'previousCompilationFailed' @ [50:66] ==> value-parameter previousCompilationFailed: Boolean = ... defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[ValueParameterDescriptorImpl]

'project' @ [50:93] ==> public final val project: Project defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[PropertyDescriptorImpl]

'REPL_TITLE' @ [50:102] ==> private val REPL_TITLE: String defined in org.jetbrains.kotlin.console in file KotlinConsoleKeeper.kt[PropertyDescriptorImpl]

'path' @ [50:114] ==> val path: String defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[LocalVariableDescriptor]

'consoleRunner' @ [51:9] ==> val consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[LocalVariableDescriptor]

'initAndRun' @ [51:23] ==> public open fun initAndRun(): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[JavaMethodDescriptor]

'consoleRunner' @ [52:9] ==> val consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[LocalVariableDescriptor]

'setupGutters' @ [52:23] ==> public final fun setupGutters(): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleRunner[SimpleFunctionDescriptorImpl]

'consoleRunner' @ [54:16] ==> val consoleRunner: KotlinConsoleRunner defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.run[LocalVariableDescriptor]

'createJavaParametersWithSdk' @ [58:30] ==> private final fun createJavaParametersWithSdk(module: Module): JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[SimpleFunctionDescriptorImpl]

'module' @ [58:58] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[ValueParameterDescriptorImpl]

'javaParameters' @ [60:9] ==> val javaParameters: JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'mainClass' @ [60:24] ==> public final var JavaParameters.mainClass: (String..String?)[MyPropertyDescriptor]

'javaParameters' @ [62:27] ==> val javaParameters: JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'toCommandLine' @ [62:42] ==> @NotNull public open fun toCommandLine(): GeneralCommandLine defined in com.intellij.execution.configurations.JavaParameters[JavaMethodDescriptor]

'commandLine' @ [64:25] ==> val commandLine: GeneralCommandLine defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'parametersList' @ [64:37] ==> public final val GeneralCommandLine.parametersList: ParametersList[MyPropertyDescriptor]

'paramList' @ [65:9] ==> val paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'clearAll' @ [65:19] ==> public open fun clearAll(): Unit defined in com.intellij.execution.configurations.ParametersList[JavaMethodDescriptor]

'PathUtil' @ [70:27] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForIdeaPlugin' @ [70:36] ==> @JvmStatic public final val kotlinPathsForIdeaPlugin: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'listOf' @ [71:29] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'kotlinPaths' @ [71:36] ==> val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'compilerPath' @ [71:48] ==> public final val KotlinPaths.compilerPath: File[MyPropertyDescriptor]

'kotlinPaths' @ [71:62] ==> val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'reflectPath' @ [71:74] ==> public final val KotlinPaths.reflectPath: File[MyPropertyDescriptor]

'kotlinPaths' @ [71:87] ==> val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'stdlibPath' @ [71:99] ==> public final val KotlinPaths.stdlibPath: File[MyPropertyDescriptor]

'kotlinPaths' @ [71:111] ==> val kotlinPaths: KotlinPaths defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'scriptRuntimePath' @ [71:123] ==> public final val KotlinPaths.scriptRuntimePath: File[MyPropertyDescriptor]

'joinToString' @ [72:18] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'pathSeparator' @ [72:36] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'it' @ [72:53] ==> value-parameter it: File defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [72:56] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'paramList' @ [74:9] ==> val paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'add' @ [74:19] ==> public open fun add(@NonNls p0: (String..String?)): Unit defined in com.intellij.execution.configurations.ParametersList[JavaMethodDescriptor]

'paramList' @ [75:9] ==> val paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'add' @ [75:19] ==> public open fun add(@NonNls p0: (String..String?)): Unit defined in com.intellij.execution.configurations.ParametersList[JavaMethodDescriptor]

'replClassPath' @ [75:23] ==> val replClassPath: String defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'paramList' @ [77:9] ==> val paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'add' @ [77:19] ==> public open fun add(@NonNls p0: (String..String?)): Unit defined in com.intellij.execution.configurations.ParametersList[JavaMethodDescriptor]

'paramList' @ [79:9] ==> val paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'add' @ [79:19] ==> public open fun add(@NonNls p0: (String..String?)): Unit defined in com.intellij.execution.configurations.ParametersList[JavaMethodDescriptor]

'addPathToCompiledOutput' @ [81:9] ==> private final fun addPathToCompiledOutput(paramList: ParametersList, module: Module): Unit defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[SimpleFunctionDescriptorImpl]

'paramList' @ [81:33] ==> val paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'module' @ [81:44] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[ValueParameterDescriptorImpl]

'commandLine' @ [83:16] ==> val commandLine: GeneralCommandLine defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createCommandLine[LocalVariableDescriptor]

'JavaParameters' @ [87:22] ==> public constructor JavaParameters() defined in com.intellij.execution.configurations.JavaParameters[JavaClassConstructorDescriptor]

'params' @ [88:9] ==> val params: JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'charset' @ [88:16] ==> public final var JavaParameters.charset: Charset?[MyPropertyDescriptor]

'getInstance' @ [90:37] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [90:49] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[ValueParameterDescriptorImpl]

'sdk' @ [90:57] ==> public final val ModuleRootManager.sdk: Sdk?[MyPropertyDescriptor]

'sdk' @ [91:13] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'sdk' @ [91:28] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'sdkType' @ [91:32] ==> public final val Sdk.sdkType: SdkTypeId[MyPropertyDescriptor]

'File' @ [91:58] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'sdk' @ [91:63] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'homePath' @ [91:67] ==> public final val Sdk.homePath: String?[MyPropertyDescriptor]

'exists' @ [91:77] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'params' @ [92:13] ==> val params: JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'jdk' @ [92:20] ==> public final var JavaParameters.jdk: Sdk?[MyPropertyDescriptor]

'sdk' @ [92:26] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'params' @ [95:13] ==> val params: JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'jdk' @ [95:20] ==> public final var JavaParameters.jdk: Sdk?[MyPropertyDescriptor]

'params' @ [96:13] ==> val params: JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'jdk' @ [96:20] ==> public final var JavaParameters.jdk: Sdk?[MyPropertyDescriptor]

'SimpleJavaSdkType' @ [96:26] ==> public constructor SimpleJavaSdkType() defined in com.intellij.openapi.projectRoots.SimpleJavaSdkType[JavaClassConstructorDescriptor]

'createJdk' @ [96:46] ==> public open fun createJdk(@NotNull p0: String, @NotNull p1: String): (Sdk..Sdk?) defined in com.intellij.openapi.projectRoots.SimpleJavaSdkType[JavaMethodDescriptor]

'getJavaHome' @ [96:80] ==> public open fun getJavaHome(): (String..String?) defined in com.intellij.util.SystemProperties[JavaMethodDescriptor]

'params' @ [99:16] ==> val params: JavaParameters defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.createJavaParametersWithSdk[LocalVariableDescriptor]

'getOutputPaths' @ [103:50] ==> @NotNull public open fun getOutputPaths(@NotNull p0: (Array<(Module..Module?)>..Array<out (Module..Module?)>)): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.openapi.compiler.ex.CompilerPathsEx[JavaMethodDescriptor]

'arrayOf' @ [103:65] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Module): Array<Module> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Module

'module' @ [103:73] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.addPathToCompiledOutput[ValueParameterDescriptorImpl]

'joinToString' @ [103:82] ==> public fun <T> Array<out (String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'pathSeparator' @ [103:100] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'orderEntries' @ [104:50] ==> @NotNull public open fun orderEntries(@NotNull p0: Module): OrderEnumerator defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'module' @ [104:63] ==> value-parameter module: Module defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.addPathToCompiledOutput[ValueParameterDescriptorImpl]

'recursively' @ [104:71] ==> public abstract fun recursively(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'pathsList' @ [104:85] ==> public final val OrderEnumerator.pathsList: (PathsList..PathsList?)[MyPropertyDescriptor]

'pathsString' @ [104:95] ==> public final val PathsList.pathsString: String[MyPropertyDescriptor]

'compiledModulePath' @ [105:41] ==> val compiledModulePath: String defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.addPathToCompiledOutput[LocalVariableDescriptor]

'pathSeparator' @ [105:66] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'moduleDependencies' @ [105:81] ==> val moduleDependencies: String defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.addPathToCompiledOutput[LocalVariableDescriptor]

'paramList' @ [107:9] ==> value-parameter paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.addPathToCompiledOutput[ValueParameterDescriptorImpl]

'add' @ [107:19] ==> public open fun add(@NonNls p0: (String..String?)): Unit defined in com.intellij.execution.configurations.ParametersList[JavaMethodDescriptor]

'paramList' @ [108:9] ==> value-parameter paramList: ParametersList defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.addPathToCompiledOutput[ValueParameterDescriptorImpl]

'add' @ [108:19] ==> public open fun add(@NonNls p0: (String..String?)): Unit defined in com.intellij.execution.configurations.ParametersList[JavaMethodDescriptor]

'compiledOutputClasspath' @ [108:23] ==> val compiledOutputClasspath: String defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.addPathToCompiledOutput[LocalVariableDescriptor]

'JvmStatic' @ [112:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getService' @ [112:71] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinConsoleKeeper..KotlinConsoleKeeper?)>): (KotlinConsoleKeeper..KotlinConsoleKeeper?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.console.KotlinConsoleKeeper..org.jetbrains.kotlin.console.KotlinConsoleKeeper?)

'project' @ [112:82] ==> value-parameter project: Project defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper.Companion.getInstance[ValueParameterDescriptorImpl]

'KotlinConsoleKeeper' @ [112:91] ==> public companion object defined in org.jetbrains.kotlin.console.KotlinConsoleKeeper[FakeCallableDescriptorForObject]

'java' @ [112:118] ==> public val <T> KClass<KotlinConsoleKeeper>.java: Class<KotlinConsoleKeeper> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinConsoleKeeper

