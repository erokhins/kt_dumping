'SOCKET_ANY_FREE_PORT' @ [35:21] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'BasicCompilerServicesWithResultsFacadeServer' @ [37:20] ==> public constructor BasicCompilerServicesWithResultsFacadeServer(messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer[ClassConstructorDescriptorImpl]

'messageCollector' @ [37:65] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.<init>[ValueParameterDescriptorImpl]

'port' @ [37:89] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.<init>[ValueParameterDescriptorImpl]

'compileService' @ [39:21] ==> protected final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'leaseReplSession' @ [39:36] ==> public abstract fun leaseReplSession(aliveFlagPath: String?, compilerArguments: Array<out String>, compilationOptions: CompilationOptions, servicesFacade: CompilerServicesFacadeBase, templateClasspath: List<File>, templateClassName: String): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'clientAliveFlagFile' @ [40:13] ==> value-parameter clientAliveFlagFile: File? defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.<init>[ValueParameterDescriptorImpl]

'absolutePath' @ [40:34] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'args' @ [41:13] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.<init>[ValueParameterDescriptorImpl]

'CompilationOptions' @ [42:13] ==> public constructor CompilationOptions(compilerMode: CompilerMode, targetPlatform: CompileService.TargetPlatform, reportCategories: Array<Int>, reportSeverity: Int, requestedCompilationResults: Array<Int>) defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedClassConstructorDescriptor]

'NON_INCREMENTAL_COMPILER' @ [43:34] ==> enum entry NON_INCREMENTAL_COMPILER defined in org.jetbrains.kotlin.daemon.common.CompilerMode[FakeCallableDescriptorForObject]

'targetPlatform' @ [44:21] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.<init>[ValueParameterDescriptorImpl]

'arrayOf' @ [45:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Int): Array<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'ReportCategory' @ [45:29] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'code' @ [45:61] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'ReportCategory' @ [45:67] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'code' @ [45:97] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'ReportCategory' @ [45:103] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'code' @ [45:128] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'ReportCategory' @ [45:134] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'code' @ [45:164] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'ReportSeverity' @ [46:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'code' @ [46:41] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'emptyArray' @ [47:21] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'services' @ [48:13] ==> public final val services: BasicCompilerServicesWithResultsFacadeServer defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'templateClasspath' @ [49:13] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.<init>[ValueParameterDescriptorImpl]

'templateClassName' @ [50:13] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.<init>[ValueParameterDescriptorImpl]

'get' @ [51:7] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'compileService' @ [56:13] ==> protected final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'releaseReplSession' @ [56:28] ==> public abstract fun releaseReplSession(sessionId: Int): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [56:47] ==> public final val sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'RemoteReplCompilerState' @ [64:13] ==> public constructor RemoteReplCompilerState(replStateFacade: ReplStateFacade, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[ClassConstructorDescriptorImpl]

'compileService' @ [64:37] ==> protected final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'replCreateState' @ [64:52] ==> public abstract fun replCreateState(sessionId: Int): CompileService.CallResult<ReplStateFacade> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [64:68] ==> public final val sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'get' @ [64:79] ==> public abstract fun get(): ReplStateFacade defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'lock' @ [64:86] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.createState[ValueParameterDescriptorImpl]

'compileService' @ [67:13] ==> protected final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'replCheck' @ [67:28] ==> public abstract fun replCheck(sessionId: Int, replStateId: Int, codeLine: ReplCodeLine): CompileService.CallResult<ReplCheckResult> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [67:38] ==> public final val sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'state' @ [67:49] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.check[ValueParameterDescriptorImpl]

'asState' @ [67:55] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out RemoteReplCompilerState>): RemoteReplCompilerState defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <StateT : IReplStageState<*>> -> RemoteReplCompilerState

'RemoteReplCompilerState' @ [67:63] ==> public constructor RemoteReplCompilerState(replStateFacade: ReplStateFacade, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[ClassConstructorDescriptorImpl]

'java' @ [67:94] ==> public val <T> KClass<RemoteReplCompilerState>.java: Class<RemoteReplCompilerState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RemoteReplCompilerState

'replStateFacade' @ [67:100] ==> internal final val replStateFacade: ReplStateFacade defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'getId' @ [67:116] ==> public abstract fun getId(): Int defined in org.jetbrains.kotlin.daemon.common.ReplStateFacade[DeserializedSimpleFunctionDescriptor]

'codeLine' @ [67:125] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.check[ValueParameterDescriptorImpl]

'get' @ [67:135] ==> public abstract fun get(): ReplCheckResult defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'compileService' @ [70:13] ==> protected final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'replCompile' @ [70:28] ==> public abstract fun replCompile(sessionId: Int, replStateId: Int, codeLine: ReplCodeLine): CompileService.CallResult<ReplCompileResult> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [70:40] ==> public final val sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient[PropertyDescriptorImpl]

'state' @ [70:51] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.compile[ValueParameterDescriptorImpl]

'asState' @ [70:57] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out RemoteReplCompilerState>): RemoteReplCompilerState defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <StateT : IReplStageState<*>> -> RemoteReplCompilerState

'RemoteReplCompilerState' @ [70:65] ==> public constructor RemoteReplCompilerState(replStateFacade: ReplStateFacade, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[ClassConstructorDescriptorImpl]

'java' @ [70:96] ==> public val <T> KClass<RemoteReplCompilerState>.java: Class<RemoteReplCompilerState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RemoteReplCompilerState

'replStateFacade' @ [70:102] ==> internal final val replStateFacade: ReplStateFacade defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'getId' @ [70:118] ==> public abstract fun getId(): Int defined in org.jetbrains.kotlin.daemon.common.ReplStateFacade[DeserializedSimpleFunctionDescriptor]

'codeLine' @ [70:127] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.client.KotlinRemoteReplCompilerClient.compile[ValueParameterDescriptorImpl]

'get' @ [70:137] ==> public abstract fun get(): ReplCompileResult defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

