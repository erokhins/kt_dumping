'KotlinJsr223JvmScriptEngineBase' @ [44:5] ==> public constructor KotlinJsr223JvmScriptEngineBase(myFactory: ScriptEngineFactory) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineBase[DeserializedClassConstructorDescriptor]

'factory' @ [44:37] ==> value-parameter factory: ScriptEngineFactory defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.<init>[ValueParameterDescriptorImpl]

'lazy' @ [46:27] ==> public fun <T> lazy(initializer: () -> CompileService): Lazy<CompileService> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileService

'PathUtil' @ [47:20] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForIdeaPlugin' @ [47:29] ==> @JvmStatic public final val kotlinPathsForIdeaPlugin: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'compilerPath' @ [47:54] ==> public final val KotlinPaths.compilerPath: File[MyPropertyDescriptor]

'assert' @ [48:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'path' @ [48:16] ==> val path: File defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>[LocalVariableDescriptor]

'exists' @ [48:21] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'CompilerId' @ [49:26] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompilerId[FakeCallableDescriptorForObject]

'makeCompilerId' @ [49:37] ==> @JvmStatic public final fun makeCompilerId(vararg paths: File): CompilerId defined in org.jetbrains.kotlin.daemon.common.CompilerId.Companion[DeserializedSimpleFunctionDescriptor]

'path' @ [49:52] ==> val path: File defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>[LocalVariableDescriptor]

'configureDaemonOptions' @ [50:29] ==> public fun configureDaemonOptions(): DaemonOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'DaemonJVMOptions' @ [51:32] ==> public constructor DaemonJVMOptions(maxMemory: String = ..., maxPermSize: String = ..., reservedCodeCacheSize: String = ..., jvmParams: MutableCollection<String> = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedClassConstructorDescriptor]

'arrayListOf' @ [53:36] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonReportMessage

'KotlinCompilerClient' @ [55:9] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client[FakeCallableDescriptorForObject]

'connectToCompileService' @ [55:30] ==> public final fun connectToCompileService(compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ..., checkId: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [55:54] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>[LocalVariableDescriptor]

'daemonJVMOptions' @ [55:66] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [55:84] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>[LocalVariableDescriptor]

'DaemonReportingTargets' @ [55:99] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[DeserializedClassConstructorDescriptor]

'daemonReportMessages' @ [55:128] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>[LocalVariableDescriptor]

'ScriptException' @ [56:26] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'+' @ [56:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'daemonReportMessages' @ [56:80] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> /* = ArrayList<DaemonReportMessage> */ defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [56:101] ==> public fun <T> Iterable<DaemonReportMessage>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((DaemonReportMessage) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonReportMessage

'it' @ [56:144] ==> value-parameter it: DaemonReportMessage defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'category' @ [56:147] ==> public final val category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[DeserializedPropertyDescriptor]

'name' @ [56:156] ==> public final val name: String defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[DeserializedPropertyDescriptor]

'it' @ [56:164] ==> value-parameter it: DaemonReportMessage defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.daemon.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [56:167] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[DeserializedPropertyDescriptor]

'MyMessageCollector' @ [59:36] ==> public constructor MyMessageCollector() defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector[ClassConstructorDescriptorImpl]

'lazy' @ [61:48] ==> public fun <T> lazy(initializer: () -> KotlinRemoteReplCompilerClient): Lazy<KotlinRemoteReplCompilerClient> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinRemoteReplCompilerClient

'daemon' @ [62:9] ==> private final val daemon: CompileService defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[PropertyDescriptorImpl]

'let' @ [62:16] ==> @InlineOnly public inline fun <T, R> CompileService.let(block: (CompileService) -> KotlinRemoteReplCompilerClient): KotlinRemoteReplCompilerClient defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileService
    <R> -> KotlinRemoteReplCompilerClient

'KotlinRemoteReplCompilerClient' @ [63:13] ==> public constructor KotlinRemoteReplCompilerClient(compileService: CompileService, clientAliveFlagFile: File?, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, messageCollector: MessageCollector, templateClasspath: List<File>, templateClassName: String, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[DeserializedClassConstructorDescriptor]

'it' @ [63:44] ==> value-parameter it: CompileService defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.replCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'makeAutodeletingFlagFile' @ [64:44] ==> public fun makeAutodeletingFlagFile(keyword: String = ..., baseDir: File? = ...): File defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'CompileService' @ [65:44] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [65:74] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'emptyArray' @ [66:44] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'messageCollector' @ [67:44] ==> private final val messageCollector: KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[PropertyDescriptorImpl]

'templateClasspath' @ [68:44] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.<init>[ValueParameterDescriptorImpl]

'templateClassName' @ [69:44] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.<init>[ValueParameterDescriptorImpl]

'invoke' @ [74:13] ==> public abstract operator fun invoke(p1: ScriptContext, p2: Array<out KClass<out Any>>?): ScriptArgsWithTypes? defined in kotlin.Function2[FunctionInvokeDescriptor]

'getContext' @ [74:27] ==> public open fun getContext(): (ScriptContext..ScriptContext?) defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[JavaMethodDescriptor]

'scriptArgsTypes' @ [74:41] ==> private final val scriptArgsTypes: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[PropertyDescriptorImpl]

'lazy' @ [76:54] ==> public fun <T> lazy(initializer: () -> GenericReplCompilingEvaluator): Lazy<GenericReplCompilingEvaluator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompilingEvaluator

'GenericReplCompilingEvaluator' @ [76:61] ==> public constructor GenericReplCompilingEvaluator(compiler: ReplCompiler, baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedClassConstructorDescriptor]

'replCompiler' @ [76:91] ==> protected open val replCompiler: ReplCompiler defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[PropertyDescriptorImpl]

'templateClasspath' @ [76:105] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.<init>[ValueParameterDescriptorImpl]

'currentThread' @ [76:131] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [76:147] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'localEvaluator' @ [78:59] ==> private final val localEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[PropertyDescriptorImpl]

'replEvaluator' @ [80:82] ==> protected open val replEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[PropertyDescriptorImpl]

'createState' @ [80:96] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplFullEvaluator[DeserializedSimpleFunctionDescriptor]

'lock' @ [80:108] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.createState[ValueParameterDescriptorImpl]

'err' @ [86:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [86:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'message' @ [86:32] ==> value-parameter message: String defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector.report[ValueParameterDescriptorImpl]

'!' @ [87:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasErrors' @ [87:18] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector[PropertyDescriptorImpl]

'hasErrors' @ [88:17] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector[PropertyDescriptorImpl]

'severity' @ [88:29] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector.report[ValueParameterDescriptorImpl]

'EXCEPTION' @ [88:65] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'severity' @ [88:78] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector.report[ValueParameterDescriptorImpl]

'ERROR' @ [88:114] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'hasErrors' @ [94:45] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea.MyMessageCollector[PropertyDescriptorImpl]

