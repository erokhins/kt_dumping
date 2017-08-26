'err' @ [47:44] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'KotlinJsr223JvmScriptEngineBase' @ [48:5] ==> public constructor KotlinJsr223JvmScriptEngineBase(myFactory: ScriptEngineFactory) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[DeserializedClassConstructorDescriptor]

'factory' @ [48:37] ==> value-parameter factory: ScriptEngineFactory defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.<init>[ValueParameterDescriptorImpl]

'lazy' @ [50:27] ==> public fun <T> lazy(initializer: () -> CompileService): Lazy<CompileService> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileService

'connectToCompileService' @ [50:34] ==> private final fun connectToCompileService(compilerJar: File): CompileService defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[SimpleFunctionDescriptorImpl]

'compilerJar' @ [50:58] ==> value-parameter compilerJar: File defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.<init>[ValueParameterDescriptorImpl]

'lazy' @ [52:34] ==> public fun <T> lazy(initializer: () -> KotlinRemoteReplCompilerClient): Lazy<KotlinRemoteReplCompilerClient> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinRemoteReplCompilerClient

'daemon' @ [53:9] ==> private final val daemon: CompileService defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[PropertyDescriptorImpl]

'let' @ [53:16] ==> @InlineOnly public inline fun <T, R> CompileService.let(block: (CompileService) -> KotlinRemoteReplCompilerClient): KotlinRemoteReplCompilerClient defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileService
    <R> -> KotlinRemoteReplCompilerClient

'KotlinRemoteReplCompilerClient' @ [54:13] ==> public constructor KotlinRemoteReplCompilerClient(compileService: CompileService, clientAliveFlagFile: File?, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, templateClasspath: List<File>, templateClassName: String, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedClassConstructorDescriptor]

'it' @ [55:21] ==> value-parameter it: CompileService defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.replCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'makeAutodeletingFlagFile' @ [56:21] ==> public fun makeAutodeletingFlagFile(keyword: String = ..., baseDir: File? = ...): File defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'CompileService' @ [57:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [57:51] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'emptyArray' @ [58:21] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'PrintingMessageCollector' @ [59:21] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'PrintStream' @ [59:46] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'compilerOut' @ [59:58] ==> value-parameter compilerOut: OutputStream = ... defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.<init>[ValueParameterDescriptorImpl]

'WITHOUT_PATHS' @ [59:88] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'templateClasspath' @ [60:21] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.<init>[ValueParameterDescriptorImpl]

'templateClassName' @ [61:21] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.<init>[ValueParameterDescriptorImpl]

'lazy' @ [66:27] ==> public fun <T> lazy(initializer: () -> GenericReplCompilingEvaluator): Lazy<GenericReplCompilingEvaluator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompilingEvaluator

'GenericReplCompilingEvaluator' @ [66:34] ==> public constructor GenericReplCompilingEvaluator(compiler: ReplCompiler, baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedClassConstructorDescriptor]

'replCompiler' @ [66:64] ==> protected open val replCompiler: KotlinRemoteReplCompilerClient defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[PropertyDescriptorImpl]

'templateClasspath' @ [66:78] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.<init>[ValueParameterDescriptorImpl]

'currentThread' @ [66:104] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [66:120] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'invoke' @ [66:140] ==> public abstract operator fun invoke(p1: ScriptContext, p2: Array<out KClass<out Any>>?): ScriptArgsWithTypes? defined in kotlin.Function2[FunctionInvokeDescriptor]

'getContext' @ [66:154] ==> public open fun getContext(): (ScriptContext..ScriptContext?) defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[JavaMethodDescriptor]

'scriptArgsTypes' @ [66:168] ==> public final val scriptArgsTypes: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[PropertyDescriptorImpl]

'localEvaluator' @ [68:59] ==> public final val localEvaluator: GenericReplCompilingEvaluator defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[PropertyDescriptorImpl]

'getCurrentState' @ [70:52] ==> protected final fun getCurrentState(context: ScriptContext): IReplStageState<*> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[DeserializedSimpleFunctionDescriptor]

'getContext' @ [70:68] ==> public open fun getContext(): (ScriptContext..ScriptContext?) defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[JavaMethodDescriptor]

'replEvaluator' @ [72:82] ==> protected open val replEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[PropertyDescriptorImpl]

'createState' @ [72:96] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplFullEvaluator[DeserializedSimpleFunctionDescriptor]

'lock' @ [72:108] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.createState[ValueParameterDescriptorImpl]

'invoke' @ [74:85] ==> public abstract operator fun invoke(p1: ScriptContext, p2: Array<out KClass<out Any>>?): ScriptArgsWithTypes? defined in kotlin.Function2[FunctionInvokeDescriptor]

'context' @ [74:99] ==> value-parameter context: ScriptContext defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.overrideScriptArgs[ValueParameterDescriptorImpl]

'scriptArgsTypes' @ [74:108] ==> public final val scriptArgsTypes: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[PropertyDescriptorImpl]

'CompilerId' @ [77:26] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [77:37] ==> @JvmStatic public final fun makeCompilerId(vararg paths: File): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'compilerJar' @ [77:52] ==> value-parameter compilerJar: File defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService[ValueParameterDescriptorImpl]

'configureDaemonOptions' @ [78:29] ==> public fun configureDaemonOptions(): DaemonOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'DaemonJVMOptions' @ [79:32] ==> public constructor DaemonJVMOptions(maxMemory: String = ..., maxPermSize: String = ..., reservedCodeCacheSize: String = ..., jvmParams: MutableCollection<String> = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedClassConstructorDescriptor]

'arrayListOf' @ [81:36] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonReportMessage

'KotlinCompilerClient' @ [83:16] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [83:37] ==> public final fun connectToCompileService(compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ..., checkId: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [83:61] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService[LocalVariableDescriptor]

'daemonJVMOptions' @ [83:73] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService[LocalVariableDescriptor]

'daemonOptions' @ [83:91] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService[LocalVariableDescriptor]

'DaemonReportingTargets' @ [83:106] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'daemonReportMessages' @ [83:135] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService[LocalVariableDescriptor]

'ScriptException' @ [84:25] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'+' @ [84:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'daemonReportMessages' @ [84:79] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService[LocalVariableDescriptor]

'joinToString' @ [84:100] ==> public fun <T> Iterable<DaemonReportMessage>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((DaemonReportMessage) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonReportMessage

'it' @ [84:143] ==> value-parameter it: DaemonReportMessage defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService.<anonymous>[ValueParameterDescriptorImpl]

'category' @ [84:146] ==> public final val category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[DeserializedPropertyDescriptor]

'name' @ [84:155] ==> public final val name: String defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[DeserializedPropertyDescriptor]

'it' @ [84:163] ==> value-parameter it: DaemonReportMessage defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine.connectToCompileService.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [84:166] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[DeserializedPropertyDescriptor]

