'SOCKET_ANY_FREE_PORT' @ [30:21] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'CompilerCallbackServicesFacadeServer' @ [31:5] ==> public constructor CompilerCallbackServicesFacadeServer(incrementalCompilationComponents: IncrementalCompilationComponents? = ..., lookupTracker: LookupTracker? = ..., compilationCanceledStatus: CompilationCanceledStatus? = ..., port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.CompilerCallbackServicesFacadeServer[DeserializedClassConstructorDescriptor]

'env' @ [31:42] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.<init>[ValueParameterDescriptorImpl]

'services' @ [31:46] ==> public final val services: Services defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'get' @ [31:55] ==> public final fun <T> get(interfaceClass: Class<IncrementalCompilationComponents>): IncrementalCompilationComponents? defined in org.jetbrains.kotlin.config.Services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalCompilationComponents

'java' @ [31:99] ==> public val <T> KClass<IncrementalCompilationComponents>.java: Class<IncrementalCompilationComponents> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalCompilationComponents

'env' @ [32:42] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.<init>[ValueParameterDescriptorImpl]

'services' @ [32:46] ==> public final val services: Services defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'get' @ [32:55] ==> public final fun <T> get(interfaceClass: Class<LookupTracker>): LookupTracker? defined in org.jetbrains.kotlin.config.Services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupTracker

'java' @ [32:80] ==> public val <T> KClass<LookupTracker>.java: Class<LookupTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LookupTracker

'env' @ [33:42] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.<init>[ValueParameterDescriptorImpl]

'services' @ [33:46] ==> public final val services: Services defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'get' @ [33:55] ==> public final fun <T> get(interfaceClass: Class<CompilationCanceledStatus>): CompilationCanceledStatus? defined in org.jetbrains.kotlin.config.Services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilationCanceledStatus

'java' @ [33:92] ==> public val <T> KClass<CompilationCanceledStatus>.java: Class<CompilationCanceledStatus> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompilationCanceledStatus

'port' @ [34:42] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.<init>[ValueParameterDescriptorImpl]

'env' @ [38:9] ==> private final val env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl[PropertyDescriptorImpl]

'messageCollector' @ [38:13] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'reportFromDaemon' @ [38:30] ==> public fun MessageCollector.reportFromDaemon(outputsCollector: ((File, List<File>) -> Unit)?, category: Int, severity: Int, message: String?, attachment: Serializable?): Unit defined in org.jetbrains.kotlin.daemon.client[DeserializedSimpleFunctionDescriptor]

'env' @ [39:40] ==> private final val env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl[PropertyDescriptorImpl]

'outputItemsCollector' @ [39:44] ==> public open val outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[PropertyDescriptorImpl]

'add' @ [39:65] ==> public open fun add(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: (File..File?)): Unit defined in org.jetbrains.kotlin.compilerRunner.OutputItemsCollectorImpl[JavaMethodDescriptor]

'srcFiles' @ [39:69] ==> value-parameter srcFiles: List<File> defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.report.<anonymous>[ValueParameterDescriptorImpl]

'outFile' @ [39:79] ==> value-parameter outFile: File defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.report.<anonymous>[ValueParameterDescriptorImpl]

'category' @ [40:17] ==> value-parameter category: Int defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.report[ValueParameterDescriptorImpl]

'severity' @ [40:27] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.report[ValueParameterDescriptorImpl]

'message' @ [40:37] ==> value-parameter message: String? defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.report[ValueParameterDescriptorImpl]

'attachment' @ [40:46] ==> value-parameter attachment: Serializable? defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerServicesFacadeImpl.report[ValueParameterDescriptorImpl]

