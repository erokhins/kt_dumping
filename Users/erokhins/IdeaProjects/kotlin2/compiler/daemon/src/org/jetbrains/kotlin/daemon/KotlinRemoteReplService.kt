'Deprecated' @ [48:9] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'CompilerConfiguration' @ [52:35] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'apply' @ [52:59] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: CompilerConfiguration.() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'addJvmClasspathRoots' @ [53:9] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'getJdkClassesRootsFromCurrentJre' @ [53:39] ==> @JvmStatic public final fun getJdkClassesRootsFromCurrentJre(): List<File> defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'addJvmClasspathRoots' @ [54:9] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'kotlinPathsForCompiler' @ [54:39] ==> @JvmStatic public final val kotlinPathsForCompiler: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'let' @ [54:62] ==> @InlineOnly public inline fun <T, R> KotlinPaths.let(block: (KotlinPaths) -> List<File>): List<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPaths
    <R> -> List<File>

'listOf' @ [54:68] ==> public fun <T> listOf(vararg elements: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [54:75] ==> value-parameter it: KotlinPaths defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.configuration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stdlibPath' @ [54:78] ==> public final val KotlinPaths.stdlibPath: File[MyPropertyDescriptor]

'it' @ [54:90] ==> value-parameter it: KotlinPaths defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.configuration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'reflectPath' @ [54:93] ==> public final val KotlinPaths.reflectPath: File[MyPropertyDescriptor]

'it' @ [54:106] ==> value-parameter it: KotlinPaths defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.configuration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scriptRuntimePath' @ [54:109] ==> public final val KotlinPaths.scriptRuntimePath: File[MyPropertyDescriptor]

'addJvmClasspathRoots' @ [55:9] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'templateClasspath' @ [55:30] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.<init>[ValueParameterDescriptorImpl]

'put' @ [56:9] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'MODULE_NAME' @ [56:37] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'languageVersionSettings' @ [57:9] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'LanguageVersionSettingsImpl' @ [57:35] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'LATEST_STABLE' @ [58:33] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'LATEST_STABLE' @ [58:59] ==> @field:JvmField public final val LATEST_STABLE: ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedPropertyDescriptor]

'mapOf' @ [58:74] ==> public fun <K, V> mapOf(pair: Pair<AnalysisFlag<*>, Boolean>): Map<AnalysisFlag<*>, Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AnalysisFlag<*>
    <V> -> Boolean

'AnalysisFlag' @ [58:80] ==> public companion object Flags defined in org.jetbrains.kotlin.config.AnalysisFlag[FakeCallableDescriptorForObject]

'skipMetadataVersionCheck' @ [58:93] ==> @JvmStatic public final val skipMetadataVersionCheck: AnalysisFlag<Boolean> defined in org.jetbrains.kotlin.config.AnalysisFlag.Flags[DeserializedPropertyDescriptor]

'URLClassLoader' @ [63:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'templateClasspath' @ [63:42] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[ValueParameterDescriptorImpl]

'map' @ [63:60] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [63:66] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [63:69] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [63:77] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [63:87] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'this' @ [63:103] ==> <this> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[LazyClassReceiverParameterDescriptor]

'java' @ [63:115] ==> public val <T> KClass<out KotlinJvmReplService>.java: Class<out KotlinJvmReplService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinJvmReplService)

'classLoader' @ [63:120] ==> public final val <T : (Any..Any?)> Class<out KotlinJvmReplService>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out KotlinJvmReplService)

'classloader' @ [66:23] ==> val classloader: URLClassLoader defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[LocalVariableDescriptor]

'loadClass' @ [66:35] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'templateClassName' @ [66:45] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[ValueParameterDescriptorImpl]

'KotlinScriptDefinitionFromAnnotatedTemplate' @ [67:23] ==> public constructor KotlinScriptDefinitionFromAnnotatedTemplate(template: KClass<out Any>, providedResolver: DependenciesResolver? = ..., providedScriptFilePattern: String? = ..., environment: Map<String, Any?>? = ..., templateClasspath: List<File> = ...) defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedClassConstructorDescriptor]

'cls' @ [67:67] ==> val cls: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[LocalVariableDescriptor]

'kotlin' @ [67:71] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'emptyMap' @ [67:91] ==> public fun <K, V> emptyMap(): Map<String, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any?

'messageCollector' @ [68:13] ==> protected final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'report' @ [68:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'INFO' @ [68:37] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'+' @ [68:43] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'templateClassName' @ [68:67] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[ValueParameterDescriptorImpl]

'def' @ [68:106] ==> val def: KotlinScriptDefinitionFromAnnotatedTemplate defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[LocalVariableDescriptor]

'scriptFilePattern' @ [68:110] ==> public final val scriptFilePattern: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'def' @ [69:57] ==> val def: KotlinScriptDefinitionFromAnnotatedTemplate defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[LocalVariableDescriptor]

'dependencyResolver' @ [69:61] ==> public open val dependencyResolver: DependenciesResolver defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'javaClass' @ [69:80] ==> public val <T : Any> DependenciesResolver.javaClass: Class<DependenciesResolver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> DependenciesResolver

'name' @ [69:90] ==> public final val <T : (Any..Any?)> Class<DependenciesResolver>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DependenciesResolver

'def' @ [70:20] ==> val def: KotlinScriptDefinitionFromAnnotatedTemplate defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[LocalVariableDescriptor]

'messageCollector' @ [73:13] ==> protected final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'report' @ [73:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [73:37] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'templateClassName' @ [73:91] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[ValueParameterDescriptorImpl]

'messageCollector' @ [76:13] ==> protected final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'report' @ [76:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [76:37] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'templateClassName' @ [76:90] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[ValueParameterDescriptorImpl]

'ex' @ [76:111] ==> val ex: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.makeScriptDefinition[LocalVariableDescriptor]

'message' @ [76:114] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'makeScriptDefinition' @ [81:29] ==> protected final fun makeScriptDefinition(templateClasspath: List<File>, templateClassName: String): KotlinScriptDefinition? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'templateClasspath' @ [81:50] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.<init>[ValueParameterDescriptorImpl]

'templateClassName' @ [81:69] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.<init>[ValueParameterDescriptorImpl]

'getValue' @ [83:48] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'if (scriptDef == null) null
        else GenericReplCompiler(disposable, scriptDef, configuration, messageCollector)' @ [84:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GenericReplCompiler?, elseBranch: GenericReplCompiler?): GenericReplCompiler?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GenericReplCompiler?

'scriptDef' @ [84:13] ==> private final val scriptDef: KotlinScriptDefinition? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'GenericReplCompiler' @ [85:14] ==> public constructor GenericReplCompiler(disposable: Disposable, scriptDefinition: KotlinScriptDefinition, compilerConfiguration: CompilerConfiguration, messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedClassConstructorDescriptor]

'disposable' @ [85:34] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.<init>[ValueParameterDescriptorImpl]

'scriptDef' @ [85:46] ==> private final val scriptDef: KotlinScriptDefinition? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'configuration' @ [85:57] ==> protected final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'messageCollector' @ [85:72] ==> protected final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'ReentrantReadWriteLock' @ [88:32] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'WeakHashMap' @ [90:28] ==> public constructor WeakHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.WeakHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> RemoteReplStateFacadeServer
    <V : (Any..Any?)> -> Boolean

'AtomicInteger' @ [91:36] ==> public constructor AtomicInteger() defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'Deprecated' @ [92:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'getValue' @ [93:70] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'createRemoteState' @ [93:77] ==> public final fun createRemoteState(port: Int = ...): RemoteReplStateFacadeServer defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'replCompiler' @ [96:13] ==> private final val replCompiler: ReplCompiler? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'createState' @ [96:27] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[DeserializedSimpleFunctionDescriptor]

'lock' @ [96:39] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.createState[ValueParameterDescriptorImpl]

'IllegalStateException' @ [96:54] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'operationsTracer' @ [99:9] ==> @Deprecated protected final val operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'before' @ [99:27] ==> public abstract fun before(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'replCompiler' @ [101:20] ==> private final val replCompiler: ReplCompiler? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'check' @ [101:34] ==> public abstract fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [101:40] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.check[ValueParameterDescriptorImpl]

'codeLine' @ [101:47] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.check[ValueParameterDescriptorImpl]

'Error' @ [101:76] ==> public constructor Error(message: String, location: CompilerMessageLocation? = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult.Error[DeserializedClassConstructorDescriptor]

'operationsTracer' @ [104:13] ==> @Deprecated protected final val operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'after' @ [104:31] ==> public abstract fun after(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'operationsTracer' @ [109:9] ==> @Deprecated protected final val operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'before' @ [109:27] ==> public abstract fun before(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'replCompiler' @ [111:20] ==> private final val replCompiler: ReplCompiler? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'compile' @ [111:34] ==> public abstract fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [111:42] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.compile[ValueParameterDescriptorImpl]

'codeLine' @ [111:49] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.compile[ValueParameterDescriptorImpl]

'Error' @ [111:80] ==> public constructor Error(message: String, location: CompilerMessageLocation? = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[DeserializedClassConstructorDescriptor]

'operationsTracer' @ [114:13] ==> @Deprecated protected final val operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'after' @ [114:31] ==> public abstract fun after(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'Deprecated' @ [118:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'check' @ [119:58] ==> public open fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'defaultStateFacade' @ [119:64] ==> @Deprecated protected final val defaultStateFacade: RemoteReplStateFacadeServer defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'state' @ [119:83] ==> public final val state: GenericReplCompilerState defined in org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer[PropertyDescriptorImpl]

'codeLine' @ [119:90] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.check[ValueParameterDescriptorImpl]

'Deprecated' @ [121:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'compile' @ [122:98] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'defaultStateFacade' @ [122:106] ==> @Deprecated protected final val defaultStateFacade: RemoteReplStateFacadeServer defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'state' @ [122:125] ==> public final val state: GenericReplCompilerState defined in org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer[PropertyDescriptorImpl]

'codeLine' @ [122:132] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.compile[ValueParameterDescriptorImpl]

'portForServers' @ [124:39] ==> public final val portForServers: Int defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'statesLock' @ [124:86] ==> protected final val statesLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'write' @ [124:97] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> RemoteReplStateFacadeServer): RemoteReplStateFacadeServer defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RemoteReplStateFacadeServer

'getValidId' @ [125:18] ==> internal inline fun getValidId(counter: AtomicInteger, check: (Int) -> Boolean): Int defined in org.jetbrains.kotlin.daemon in file KotlinRemoteReplService.kt[SimpleFunctionDescriptorImpl]

'stateIdCounter' @ [125:29] ==> protected final val stateIdCounter: AtomicInteger defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'states' @ [125:53] ==> protected final val states: WeakHashMap<RemoteReplStateFacadeServer, Boolean> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'none' @ [125:60] ==> public inline fun <K, V> Map<out (RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?), (Boolean..Boolean?)>.none(predicate: (Map.Entry<(RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?), (Boolean..Boolean?)>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer..org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer?)
    <V> -> (kotlin.Boolean..kotlin.Boolean?)

'it' @ [125:67] ==> value-parameter it: Map.Entry<(RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?), (Boolean..Boolean?)> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.createRemoteState.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [125:70] ==> public abstract val key: (RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'getId' @ [125:74] ==> public open fun getId(): Int defined in org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer[SimpleFunctionDescriptorImpl]

'id' @ [125:85] ==> value-parameter id: Int defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.createRemoteState.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'RemoteReplStateFacadeServer' @ [126:27] ==> public constructor RemoteReplStateFacadeServer(_id: Int, state: GenericReplCompilerState, port: Int = ...) defined in org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer[ClassConstructorDescriptorImpl]

'id' @ [126:55] ==> val id: Int defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.createRemoteState.<anonymous>[LocalVariableDescriptor]

'createState' @ [126:59] ==> public open fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'asState' @ [126:73] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out GenericReplCompilerState>): GenericReplCompilerState defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <StateT : IReplStageState<*>> -> GenericReplCompilerState

'GenericReplCompilerState' @ [126:81] ==> public constructor GenericReplCompilerState(environment: KotlinCoreEnvironment, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[DeserializedClassConstructorDescriptor]

'java' @ [126:113] ==> public val <T> KClass<GenericReplCompilerState>.java: Class<GenericReplCompilerState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenericReplCompilerState

'port' @ [126:120] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.createRemoteState[ValueParameterDescriptorImpl]

'states' @ [127:9] ==> protected final val states: WeakHashMap<RemoteReplStateFacadeServer, Boolean> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'put' @ [127:16] ==> public open fun put(key: (RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?), value: (Boolean..Boolean?)): Boolean? defined in java.util.WeakHashMap[JavaMethodDescriptor]

'stateFacade' @ [127:20] ==> val stateFacade: RemoteReplStateFacadeServer defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.createRemoteState.<anonymous>[LocalVariableDescriptor]

'stateFacade' @ [128:9] ==> val stateFacade: RemoteReplStateFacadeServer defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.createRemoteState.<anonymous>[LocalVariableDescriptor]

'statesLock' @ [131:110] ==> protected final val statesLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'read' @ [131:121] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> CompileService.CallResult<R>): CompileService.CallResult<R> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<R>

'states' @ [132:9] ==> protected final val states: WeakHashMap<RemoteReplStateFacadeServer, Boolean> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[PropertyDescriptorImpl]

'keys' @ [132:16] ==> public open val keys: MutableSet<(RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?)> defined in java.util.WeakHashMap[JavaPropertyDescriptor]

'firstOrNull' @ [132:21] ==> public inline fun <T> Iterable<(RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?)>.firstOrNull(predicate: ((RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?)) -> Boolean): RemoteReplStateFacadeServer? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer..org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer?)

'it' @ [132:35] ==> value-parameter it: (RemoteReplStateFacadeServer..RemoteReplStateFacadeServer?) defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.withValidReplState.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getId' @ [132:38] ==> public open fun getId(): Int defined in org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer[SimpleFunctionDescriptorImpl]

'stateId' @ [132:49] ==> value-parameter stateId: Int defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.withValidReplState[ValueParameterDescriptorImpl]

'let' @ [132:60] ==> @InlineOnly public inline fun <T, R> RemoteReplStateFacadeServer.let(block: (RemoteReplStateFacadeServer) -> CompileService.CallResult.Good<R>): CompileService.CallResult.Good<R> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RemoteReplStateFacadeServer
    <R> -> Good<R>

'CompileService' @ [133:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [133:39] ==> public constructor Good<out R>(result: R) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> R

'invoke' @ [133:44] ==> public abstract operator fun invoke(p1: IReplStageState<*>): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [133:49] ==> value-parameter it: RemoteReplStateFacadeServer defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.withValidReplState.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [133:52] ==> public final val state: GenericReplCompilerState defined in org.jetbrains.kotlin.daemon.RemoteReplStateFacadeServer[PropertyDescriptorImpl]

'Error' @ [135:38] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'stateId' @ [135:68] ==> value-parameter stateId: Int defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService.withValidReplState[ValueParameterDescriptorImpl]

'PrintingMessageCollector' @ [141:34] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'compilerMessagesStream' @ [141:59] ==> value-parameter compilerMessagesStream: PrintStream defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector.<init>[ValueParameterDescriptorImpl]

'WITHOUT_PATHS' @ [141:99] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'firstErrorMessage' @ [147:13] ==> internal final var firstErrorMessage: String? defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector[PropertyDescriptorImpl]

'severity' @ [147:42] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector.report[ValueParameterDescriptorImpl]

'isError' @ [147:51] ==> public final val CompilerMessageSeverity.isError: Boolean[MyPropertyDescriptor]

'firstErrorMessage' @ [148:13] ==> internal final var firstErrorMessage: String? defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector[PropertyDescriptorImpl]

'message' @ [148:33] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector.report[ValueParameterDescriptorImpl]

'firstErrorLocation' @ [149:13] ==> internal final var firstErrorLocation: CompilerMessageLocation? defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector[PropertyDescriptorImpl]

'location' @ [149:34] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector.report[ValueParameterDescriptorImpl]

'innerCollector' @ [151:9] ==> private final val innerCollector: PrintingMessageCollector defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector[PropertyDescriptorImpl]

'report' @ [151:24] ==> public open fun report(@NotNull severity: CompilerMessageSeverity, @NotNull message: String, @Nullable location: CompilerMessageLocation?): Unit defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaMethodDescriptor]

'severity' @ [151:31] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector.report[ValueParameterDescriptorImpl]

'message' @ [151:41] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector.report[ValueParameterDescriptorImpl]

'location' @ [151:50] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector.report[ValueParameterDescriptorImpl]

'innerCollector' @ [154:41] ==> private final val innerCollector: PrintingMessageCollector defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector[PropertyDescriptorImpl]

'hasErrors' @ [154:56] ==> public open fun hasErrors(): Boolean defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaMethodDescriptor]

'innerCollector' @ [156:9] ==> private final val innerCollector: PrintingMessageCollector defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector[PropertyDescriptorImpl]

'clear' @ [156:24] ==> public open fun clear(): Unit defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaMethodDescriptor]

'Random' @ [160:28] ==> public constructor Random() defined in java.util.Random[JavaClassConstructorDescriptor]

'counter' @ [164:17] ==> value-parameter counter: AtomicInteger defined in org.jetbrains.kotlin.daemon.getValidId[ValueParameterDescriptorImpl]

'incrementAndGet' @ [164:25] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'!' @ [166:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [166:13] ==> public abstract operator fun invoke(p1: Int): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'newId' @ [166:19] ==> var newId: Int defined in org.jetbrains.kotlin.daemon.getValidId[LocalVariableDescriptor]

'attemptsLeft' @ [167:9] ==> var attemptsLeft: Int defined in org.jetbrains.kotlin.daemon.getValidId[LocalVariableDescriptor]

'attemptsLeft' @ [168:13] ==> var attemptsLeft: Int defined in org.jetbrains.kotlin.daemon.getValidId[LocalVariableDescriptor]

'IllegalStateException' @ [169:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'newId' @ [171:9] ==> var newId: Int defined in org.jetbrains.kotlin.daemon.getValidId[LocalVariableDescriptor]

'counter' @ [171:17] ==> value-parameter counter: AtomicInteger defined in org.jetbrains.kotlin.daemon.getValidId[ValueParameterDescriptorImpl]

'addAndGet' @ [171:25] ==> public final fun addAndGet(p0: Int): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'internalRng' @ [171:35] ==> internal val internalRng: Random defined in org.jetbrains.kotlin.daemon in file KotlinRemoteReplService.kt[PropertyDescriptorImpl]

'nextInt' @ [171:47] ==> public open fun nextInt(): Int defined in java.util.Random[JavaMethodDescriptor]

'newId' @ [173:12] ==> var newId: Int defined in org.jetbrains.kotlin.daemon.getValidId[LocalVariableDescriptor]

