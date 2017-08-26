'KotlinJsr223JvmScriptEngineBase' @ [44:5] ==> public constructor KotlinJsr223JvmScriptEngineBase(myFactory: ScriptEngineFactory) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[DeserializedClassConstructorDescriptor]

'factory' @ [44:37] ==> value-parameter factory: ScriptEngineFactory defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.<init>[ValueParameterDescriptorImpl]

'lazy' @ [46:48] ==> public fun <T> lazy(initializer: () -> GenericReplCompiler): Lazy<GenericReplCompiler> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompiler

'GenericReplCompiler' @ [47:8] ==> public constructor GenericReplCompiler(disposable: Disposable, scriptDefinition: KotlinScriptDefinition, compilerConfiguration: CompilerConfiguration, messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedClassConstructorDescriptor]

'disposable' @ [48:16] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.<init>[ValueParameterDescriptorImpl]

'makeScriptDefinition' @ [49:16] ==> private final fun makeScriptDefinition(templateClasspath: List<File>, templateClassName: String): KotlinScriptDefinition defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[SimpleFunctionDescriptorImpl]

'templateClasspath' @ [49:37] ==> public final val templateClasspath: List<File> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'templateClassName' @ [49:56] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.<init>[ValueParameterDescriptorImpl]

'makeCompilerConfiguration' @ [50:16] ==> private final fun makeCompilerConfiguration(): CompilerConfiguration defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[SimpleFunctionDescriptorImpl]

'PrintingMessageCollector' @ [51:16] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'out' @ [51:48] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'WITHOUT_PATHS' @ [51:69] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'lazy' @ [54:35] ==> public fun <T> lazy(initializer: () -> GenericReplCompilingEvaluator): Lazy<GenericReplCompilingEvaluator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompilingEvaluator

'GenericReplCompilingEvaluator' @ [54:42] ==> public constructor GenericReplCompilingEvaluator(compiler: ReplCompiler, baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedClassConstructorDescriptor]

'replCompiler' @ [54:72] ==> protected open val replCompiler: ReplCompiler defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'templateClasspath' @ [54:86] ==> public final val templateClasspath: List<File> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'currentThread' @ [54:112] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [54:128] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'invoke' @ [54:148] ==> public abstract operator fun invoke(p1: ScriptContext, p2: Array<out KClass<out Any>>?): ScriptArgsWithTypes? defined in kotlin.Function2[FunctionInvokeDescriptor]

'getContext' @ [54:162] ==> public open fun getContext(): (ScriptContext..ScriptContext?) defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[JavaMethodDescriptor]

'scriptArgsTypes' @ [54:176] ==> public final val scriptArgsTypes: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'localEvaluator' @ [56:59] ==> private final val localEvaluator: GenericReplCompilingEvaluator defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'getCurrentState' @ [58:52] ==> protected final fun getCurrentState(context: ScriptContext): IReplStageState<*> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[DeserializedSimpleFunctionDescriptor]

'getContext' @ [58:68] ==> public open fun getContext(): (ScriptContext..ScriptContext?) defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[JavaMethodDescriptor]

'replEvaluator' @ [60:82] ==> protected open val replEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'createState' @ [60:96] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplFullEvaluator[DeserializedSimpleFunctionDescriptor]

'lock' @ [60:108] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.createState[ValueParameterDescriptorImpl]

'invoke' @ [62:85] ==> public abstract operator fun invoke(p1: ScriptContext, p2: Array<out KClass<out Any>>?): ScriptArgsWithTypes? defined in kotlin.Function2[FunctionInvokeDescriptor]

'context' @ [62:99] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.overrideScriptArgs[ValueParameterDescriptorImpl]

'scriptArgsTypes' @ [62:108] ==> public final val scriptArgsTypes: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'URLClassLoader' @ [65:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'templateClasspath' @ [65:42] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.makeScriptDefinition[ValueParameterDescriptorImpl]

'map' @ [65:60] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [65:66] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.makeScriptDefinition.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [65:69] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [65:77] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [65:87] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'this' @ [65:103] ==> <this> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[LazyClassReceiverParameterDescriptor]

'javaClass' @ [65:108] ==> public val <T : Any> KotlinJsr223JvmLocalScriptEngine.javaClass: Class<KotlinJsr223JvmLocalScriptEngine> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KotlinJsr223JvmLocalScriptEngine

'classLoader' @ [65:118] ==> public final val <T : (Any..Any?)> Class<KotlinJsr223JvmLocalScriptEngine>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinJsr223JvmLocalScriptEngine

'classloader' @ [66:19] ==> val classloader: URLClassLoader defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.makeScriptDefinition[LocalVariableDescriptor]

'loadClass' @ [66:31] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'templateClassName' @ [66:41] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.makeScriptDefinition[ValueParameterDescriptorImpl]

'KotlinScriptDefinitionFromAnnotatedTemplate' @ [67:16] ==> public constructor KotlinScriptDefinitionFromAnnotatedTemplate(template: KClass<out Any>, providedResolver: DependenciesResolver? = ..., providedScriptFilePattern: String? = ..., environment: Map<String, Any?>? = ..., templateClasspath: List<File> = ...) defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedClassConstructorDescriptor]

'cls' @ [67:60] ==> val cls: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine.makeScriptDefinition[LocalVariableDescriptor]

'kotlin' @ [67:64] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'emptyMap' @ [67:84] ==> public fun <K, V> emptyMap(): Map<String, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any?

'CompilerConfiguration' @ [70:47] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'apply' @ [70:71] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: CompilerConfiguration.() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'addJvmClasspathRoots' @ [71:9] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'PathUtil' @ [71:30] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getJdkClassesRootsFromCurrentJre' @ [71:39] ==> @JvmStatic public final fun getJdkClassesRootsFromCurrentJre(): List<File> defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'addJvmClasspathRoots' @ [72:9] ==> public fun CompilerConfiguration.addJvmClasspathRoots(files: List<File>): Unit defined in org.jetbrains.kotlin.cli.jvm.config[DeserializedSimpleFunctionDescriptor]

'templateClasspath' @ [72:30] ==> public final val templateClasspath: List<File> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[PropertyDescriptorImpl]

'put' @ [73:9] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(String..String?)>, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [73:13] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [73:37] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'languageVersionSettings' @ [74:9] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'LanguageVersionSettingsImpl' @ [74:35] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'LanguageVersion' @ [75:17] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [75:33] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'ApiVersion' @ [75:48] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [75:59] ==> @field:JvmField public final val LATEST_STABLE: ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedPropertyDescriptor]

'mapOf' @ [75:74] ==> public fun <K, V> mapOf(pair: Pair<AnalysisFlag<*>, Boolean>): Map<AnalysisFlag<*>, Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AnalysisFlag<*>
    <V> -> Boolean

'AnalysisFlag' @ [75:80] ==> public companion object Flags defined in org.jetbrains.kotlin.config.AnalysisFlag[FakeCallableDescriptorForObject]

'skipMetadataVersionCheck' @ [75:93] ==> @JvmStatic public final val skipMetadataVersionCheck: AnalysisFlag<Boolean> defined in org.jetbrains.kotlin.config.AnalysisFlag.Flags[DeserializedPropertyDescriptor]

