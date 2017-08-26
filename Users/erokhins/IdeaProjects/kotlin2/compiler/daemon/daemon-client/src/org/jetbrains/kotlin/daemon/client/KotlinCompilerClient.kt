'!=' @ [50:28] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [50:35] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY' @ [50:47] ==> public val COMPILE_DAEMON_VERBOSE_REPORT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'?:' @ [54:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: File?, right: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> File

'getProperty' @ [54:20] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_CLIENT_ALIVE_PATH_PROPERTY' @ [54:32] ==> public val COMPILE_DAEMON_CLIENT_ALIVE_PATH_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'let' @ [55:19] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'String' @ [55:23] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'trimQuotes' @ [55:31] ==> public fun String.trimQuotes(): String defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'takeUnless' @ [56:19] ==> @InlineOnly @SinceKotlin public inline fun <T> String.takeUnless(predicate: (String) -> Boolean): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [56:30] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'isBlank' @ [56:38] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [57:19] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [57:25] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'takeIf' @ [58:19] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'exists' @ [58:32] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'makeAutodeletingFlagFile' @ [59:20] ==> public fun makeAutodeletingFlagFile(keyword: String = ..., baseDir: File? = ...): File defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'File' @ [59:55] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'daemonOptions' @ [59:60] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.getOrCreateClientFlagFile[ValueParameterDescriptorImpl]

'runFilesPathOrDefault' @ [59:74] ==> public val DaemonOptions.runFilesPathOrDefault: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'getOrCreateClientFlagFile' @ [68:24] ==> public final fun getOrCreateClientFlagFile(daemonOptions: DaemonOptions): File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'daemonOptions' @ [68:50] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'connectToCompileService' @ [69:16] ==> public final fun connectToCompileService(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'compilerId' @ [69:40] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'flagFile' @ [69:52] ==> val flagFile: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[LocalVariableDescriptor]

'daemonJVMOptions' @ [69:62] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'daemonOptions' @ [69:80] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'reportingTargets' @ [69:95] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'autostart' @ [69:113] ==> value-parameter autostart: Boolean = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'connectAndLease' @ [79:13] ==> public final fun connectAndLease(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean, leaseSession: Boolean, sessionAliveFlagFile: File? = ...): CompileServiceSession? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'compilerId' @ [79:29] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'clientAliveFlagFile' @ [80:29] ==> value-parameter clientAliveFlagFile: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [81:29] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'daemonOptions' @ [82:29] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'reportingTargets' @ [83:29] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'autostart' @ [84:29] ==> value-parameter autostart: Boolean = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectToCompileService[ValueParameterDescriptorImpl]

'compileService' @ [86:59] ==> public final val compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[PropertyDescriptorImpl]

'connectLoop' @ [97:33] ==> @Synchronized private final inline fun <R> connectLoop(reportingTargets: DaemonReportingTargets, autostart: Boolean, body: (Boolean) -> CompileServiceSession?): CompileServiceSession? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> CompileServiceSession

'reportingTargets' @ [97:45] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'autostart' @ [97:63] ==> value-parameter autostart: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'registerClient' @ [101:13] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'clientAliveFlagFile' @ [101:28] ==> value-parameter clientAliveFlagFile: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'absolutePath' @ [101:48] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'reportingTargets' @ [102:13] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'report' @ [102:30] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [102:58] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'!' @ [104:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'leaseSession' @ [104:18] ==> value-parameter leaseSession: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'CompileServiceSession' @ [104:39] ==> public constructor CompileServiceSession(compileService: CompileService, sessionId: Int) defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[ClassConstructorDescriptorImpl]

'this' @ [104:61] ==> <this> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>.leaseImpl[ReceiverParameterDescriptorImpl]

'NO_SESSION' @ [104:82] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'leaseCompileSession' @ [106:20] ==> public abstract fun leaseCompileSession(aliveFlagPath: String?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionAliveFlagFile' @ [106:40] ==> value-parameter sessionAliveFlagFile: File? = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'absolutePath' @ [106:62] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'takeUnless' @ [106:76] ==> @InlineOnly @SinceKotlin public inline fun <T> CompileService.CallResult<Int>.takeUnless(predicate: (CompileService.CallResult<Int>) -> Boolean): CompileService.CallResult<Int>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<Int>

'it' @ [106:89] ==> value-parameter it: CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>.leaseImpl.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [106:130] ==> @InlineOnly public inline fun <T, R> CompileService.CallResult<Int>.let(block: (CompileService.CallResult<Int>) -> CompileServiceSession): CompileServiceSession defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<Int>
    <R> -> CompileServiceSession

'CompileServiceSession' @ [107:17] ==> public constructor CompileServiceSession(compileService: CompileService, sessionId: Int) defined in org.jetbrains.kotlin.daemon.client.CompileServiceSession[ClassConstructorDescriptorImpl]

'this' @ [107:39] ==> <this> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>.leaseImpl[ReceiverParameterDescriptorImpl]

'it' @ [107:45] ==> value-parameter it: CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>.leaseImpl.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [107:48] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'ensureServerHostnameIsSetUp' @ [111:9] ==> public fun ensureServerHostnameIsSetUp(): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'component1' @ [112:14] ==> public final operator fun component1(): CompileService? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [112:23] ==> public final operator fun component2(): DaemonJVMOptions defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'tryFindSuitableDaemonOrNewOpts' @ [112:40] ==> private final fun tryFindSuitableDaemonOrNewOpts(registryDir: File, compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, report: (DaemonReportCategory, String) -> Unit): Pair<CompileService?, DaemonJVMOptions> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'File' @ [112:71] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'daemonOptions' @ [112:76] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'runFilesPath' @ [112:90] ==> public final var runFilesPath: String defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'compilerId' @ [112:105] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [112:117] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'reportingTargets' @ [112:149] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'report' @ [112:166] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'cat' @ [112:173] ==> value-parameter cat: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'msg' @ [112:178] ==> value-parameter msg: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (service != null) {
            service.leaseImpl()
        }
        else {
            if (!isLastAttempt && autostart) {
                startDaemon(compilerId, newJVMOptions, daemonOptions, reportingTargets)
                reportingTargets.report(DaemonReportCategory.DEBUG, "new daemon started, trying to find it")
            }
            null
        }' @ [114:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompileServiceSession?, elseBranch: CompileServiceSession?): CompileServiceSession?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CompileServiceSession?

'service' @ [114:13] ==> val service: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>[LocalVariableDescriptor]

'service' @ [115:13] ==> val service: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>[LocalVariableDescriptor]

'leaseImpl' @ [115:21] ==> local final fun CompileService.leaseImpl(): CompileServiceSession? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>[SimpleFunctionDescriptorImpl]

'!' @ [118:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLastAttempt' @ [118:18] ==> value-parameter isLastAttempt: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>[ValueParameterDescriptorImpl]

'autostart' @ [118:35] ==> value-parameter autostart: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'startDaemon' @ [119:17] ==> private final fun startDaemon(compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'compilerId' @ [119:29] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'newJVMOptions' @ [119:41] ==> val newJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease.<anonymous>[LocalVariableDescriptor]

'daemonOptions' @ [119:56] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'reportingTargets' @ [119:71] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'reportingTargets' @ [120:17] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectAndLease[ValueParameterDescriptorImpl]

'report' @ [120:34] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [120:62] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'connectToCompileService' @ [127:9] ==> public final fun connectToCompileService(compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ..., checkId: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'compilerId' @ [127:33] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.shutdownCompileService[ValueParameterDescriptorImpl]

'DaemonJVMOptions' @ [127:45] ==> public constructor DaemonJVMOptions(maxMemory: String = ..., maxPermSize: String = ..., reservedCodeCacheSize: String = ..., jvmParams: MutableCollection<String> = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedClassConstructorDescriptor]

'daemonOptions' @ [127:65] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.shutdownCompileService[ValueParameterDescriptorImpl]

'DaemonReportingTargets' @ [127:80] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[ClassConstructorDescriptorImpl]

'out' @ [127:116] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'shutdown' @ [128:19] ==> public abstract fun shutdown(): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'shutdownCompileService' @ [133:9] ==> public final fun shutdownCompileService(compilerId: CompilerId, daemonOptions: DaemonOptions): Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'compilerId' @ [133:32] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.shutdownCompileService[ValueParameterDescriptorImpl]

'DaemonOptions' @ [133:44] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'compilerService' @ [138:13] ==> value-parameter compilerService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.leaseCompileSession[ValueParameterDescriptorImpl]

'leaseCompileSession' @ [138:29] ==> public abstract fun leaseCompileSession(aliveFlagPath: String?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'aliveFlagPath' @ [138:49] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.leaseCompileSession[ValueParameterDescriptorImpl]

'get' @ [138:64] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'compilerService' @ [141:9] ==> value-parameter compilerService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.releaseCompileSession[ValueParameterDescriptorImpl]

'releaseCompileSession' @ [141:25] ==> public abstract fun releaseCompileSession(sessionId: Int): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [141:47] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.releaseCompileSession[ValueParameterDescriptorImpl]

'Deprecated' @ [144:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ReplaceWith' @ [144:45] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'SOCKET_ANY_FREE_PORT' @ [150:29] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'RemoteOutputStreamServer' @ [153:23] ==> public constructor RemoteOutputStreamServer(out: OutputStream, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteOutputStreamServer[ClassConstructorDescriptorImpl]

'out' @ [153:48] ==> value-parameter out: OutputStream defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'port' @ [153:60] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'compilerService' @ [154:16] ==> value-parameter compilerService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'remoteCompile' @ [154:32] ==> @Deprecated public abstract fun remoteCompile(sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, servicesFacade: CompilerCallbackServicesFacade, compilerOutputStream: RemoteOutputStream, outputFormat: CompileService.OutputFormat, serviceOutputStream: RemoteOutputStream, operationsTracer: RemoteOperationsTracer?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [154:46] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'targetPlatform' @ [154:57] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'args' @ [154:73] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'CompilerCallbackServicesFacadeServer' @ [154:79] ==> public constructor CompilerCallbackServicesFacadeServer(incrementalCompilationComponents: IncrementalCompilationComponents? = ..., lookupTracker: LookupTracker? = ..., compilationCanceledStatus: CompilationCanceledStatus? = ..., port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.CompilerCallbackServicesFacadeServer[ClassConstructorDescriptorImpl]

'port' @ [154:123] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'outStrm' @ [154:130] ==> val outStrm: RemoteOutputStreamServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[LocalVariableDescriptor]

'PLAIN' @ [154:167] ==> enum entry PLAIN defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'outStrm' @ [154:174] ==> val outStrm: RemoteOutputStreamServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[LocalVariableDescriptor]

'operationsTracer' @ [154:183] ==> value-parameter operationsTracer: RemoteOperationsTracer? = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'get' @ [154:201] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'Deprecated' @ [158:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ReplaceWith' @ [158:54] ==> public constructor ReplaceWith(expression: String, vararg imports: String) defined in kotlin.ReplaceWith[DeserializedClassConstructorDescriptor]

'SOCKET_ANY_FREE_PORT' @ [166:40] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'DummyProfiler' @ [167:49] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'profiler' @ [169:14] ==> value-parameter profiler: Profiler = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'withMeasure' @ [169:23] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> Int): Int defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'this' @ [169:35] ==> <this> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[LazyClassReceiverParameterDescriptor]

'compileService' @ [170:13] ==> value-parameter compileService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'remoteIncrementalCompile' @ [170:28] ==> @Deprecated public abstract fun remoteIncrementalCompile(sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, servicesFacade: CompilerCallbackServicesFacade, compilerOutputStream: RemoteOutputStream, compilerOutputFormat: CompileService.OutputFormat, serviceOutputStream: RemoteOutputStream, operationsTracer: RemoteOperationsTracer?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [171:21] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'targetPlatform' @ [172:21] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'args' @ [173:21] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'CompilerCallbackServicesFacadeServer' @ [174:21] ==> public constructor CompilerCallbackServicesFacadeServer(incrementalCompilationComponents: IncrementalCompilationComponents? = ..., lookupTracker: LookupTracker? = ..., compilationCanceledStatus: CompilationCanceledStatus? = ..., port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.CompilerCallbackServicesFacadeServer[ClassConstructorDescriptorImpl]

'callbackServices' @ [174:93] ==> value-parameter callbackServices: CompilationServices defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'incrementalCompilationComponents' @ [174:110] ==> public final val incrementalCompilationComponents: IncrementalCompilationComponents? defined in org.jetbrains.kotlin.daemon.client.CompilationServices[PropertyDescriptorImpl]

'callbackServices' @ [175:74] ==> value-parameter callbackServices: CompilationServices defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'lookupTracker' @ [175:91] ==> public final val lookupTracker: LookupTracker? defined in org.jetbrains.kotlin.daemon.client.CompilationServices[PropertyDescriptorImpl]

'callbackServices' @ [176:86] ==> value-parameter callbackServices: CompilationServices defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'compilationCanceledStatus' @ [176:103] ==> public final val compilationCanceledStatus: CompilationCanceledStatus? defined in org.jetbrains.kotlin.daemon.client.CompilationServices[PropertyDescriptorImpl]

'port' @ [177:65] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'RemoteOutputStreamServer' @ [178:21] ==> public constructor RemoteOutputStreamServer(out: OutputStream, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteOutputStreamServer[ClassConstructorDescriptorImpl]

'compilerOut' @ [178:46] ==> value-parameter compilerOut: OutputStream defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'port' @ [178:59] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'XML' @ [179:49] ==> enum entry XML defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'RemoteOutputStreamServer' @ [180:21] ==> public constructor RemoteOutputStreamServer(out: OutputStream, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteOutputStreamServer[ClassConstructorDescriptorImpl]

'daemonOut' @ [180:46] ==> value-parameter daemonOut: OutputStream defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'port' @ [180:57] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'operationsTracer' @ [181:21] ==> value-parameter operationsTracer: RemoteOperationsTracer? = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.incrementalCompile[ValueParameterDescriptorImpl]

'get' @ [181:39] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'NON_INCREMENTAL_COMPILER' @ [190:59] ==> enum entry NON_INCREMENTAL_COMPILER defined in org.jetbrains.kotlin.daemon.common.CompilerMode[FakeCallableDescriptorForObject]

'ReportSeverity' @ [191:50] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [191:65] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'SOCKET_ANY_FREE_PORT' @ [192:29] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'DummyProfiler' @ [193:38] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'profiler' @ [194:14] ==> value-parameter profiler: Profiler = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'withMeasure' @ [194:23] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> Int): Int defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Int

'this' @ [194:35] ==> <this> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[LazyClassReceiverParameterDescriptor]

'BasicCompilerServicesWithResultsFacadeServer' @ [195:24] ==> public constructor BasicCompilerServicesWithResultsFacadeServer(messageCollector: MessageCollector, outputsCollector: ((File, List<File>) -> Unit)? = ..., port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer[ClassConstructorDescriptorImpl]

'messageCollector' @ [195:69] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'outputsCollector' @ [195:87] ==> value-parameter outputsCollector: ((File, List<File>) -> Unit)? = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'port' @ [195:105] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'compilerService' @ [196:9] ==> value-parameter compilerService: CompileService defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'compile' @ [196:25] ==> public abstract fun compile(sessionId: Int, compilerArguments: Array<out String>, compilationOptions: CompilationOptions, servicesFacade: CompilerServicesFacadeBase, compilationResults: CompilationResults?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [197:17] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'args' @ [198:17] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'CompilationOptions' @ [199:17] ==> public constructor CompilationOptions(compilerMode: CompilerMode, targetPlatform: CompileService.TargetPlatform, reportCategories: Array<Int>, reportSeverity: Int, requestedCompilationResults: Array<Int>) defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedClassConstructorDescriptor]

'compilerMode' @ [200:25] ==> value-parameter compilerMode: CompilerMode = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'targetPlatform' @ [201:25] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'arrayOf' @ [202:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Int): Array<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'code' @ [202:65] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'code' @ [202:101] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'code' @ [202:132] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'code' @ [202:168] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'reportSeverity' @ [203:25] ==> value-parameter reportSeverity: ReportSeverity = ... defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile[ValueParameterDescriptorImpl]

'code' @ [203:40] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'emptyArray' @ [204:25] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'services' @ [205:17] ==> val services: BasicCompilerServicesWithResultsFacadeServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.compile.<anonymous>[LocalVariableDescriptor]

'get' @ [207:11] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'listOf' @ [215:21] ==> public fun <T> listOf(element: BoolPropMapper<KotlinCompilerClient.ClientOptions, KMutableProperty1<KotlinCompilerClient.ClientOptions, Boolean>>): List<BoolPropMapper<KotlinCompilerClient.ClientOptions, KMutableProperty1<KotlinCompilerClient.ClientOptions, Boolean>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BoolPropMapper<ClientOptions, KMutableProperty1<ClientOptions, Boolean>>

'BoolPropMapper' @ [215:28] ==> public constructor BoolPropMapper<C, out P : KMutableProperty1<KotlinCompilerClient.ClientOptions, Boolean>>(dest: KotlinCompilerClient.ClientOptions, prop: KMutableProperty1<KotlinCompilerClient.ClientOptions, Boolean>, names: List<String> = ...) defined in org.jetbrains.kotlin.daemon.common.BoolPropMapper[DeserializedClassConstructorDescriptor]
Inferred types:
    <C> -> ClientOptions
    <out P : KMutableProperty1<C, Boolean>> -> KMutableProperty1<ClientOptions, Boolean>

'this' @ [215:43] ==> <this> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[LazyClassReceiverParameterDescriptor]

'ClientOptions' @ [215:49] ==> public constructor ClientOptions(stop: Boolean = ...) defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[ClassConstructorDescriptorImpl]

'stop' @ [215:64] ==> public final var stop: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'getProperty' @ [219:16] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_CLIENT_OPTIONS_PROPERTY' @ [219:28] ==> public final val COMPILE_DAEMON_CLIENT_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[PropertyDescriptorImpl]

'let' @ [219:69] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'it' @ [220:32] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.configureClientOptions.<anonymous>[ValueParameterDescriptorImpl]

'trimQuotes' @ [220:35] ==> public fun String.trimQuotes(): String defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'split' @ [220:48] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filterExtractProps' @ [220:59] ==> public fun Iterable<String>.filterExtractProps(propMappers: List<PropMapper<*, *, *>>, prefix: String, restParser: RestPropMapper<*, *>? = ...): Iterable<String> defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'opts' @ [220:78] ==> value-parameter opts: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.configureClientOptions[ValueParameterDescriptorImpl]

'mappers' @ [220:83] ==> public open val mappers: List<PropMapper<*, *, *>> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'unrecognized' @ [221:17] ==> val unrecognized: Iterable<String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.configureClientOptions.<anonymous>[LocalVariableDescriptor]

'any' @ [221:30] ==> public fun <T> Iterable<String>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'IllegalArgumentException' @ [222:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [223:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_OPTIONS_PROPERTY' @ [223:75] ==> public val COMPILE_DAEMON_OPTIONS_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'unrecognized' @ [223:112] ==> val unrecognized: Iterable<String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.configureClientOptions.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [223:125] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'opts' @ [224:51] ==> value-parameter opts: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.configureClientOptions[ValueParameterDescriptorImpl]

'mappers' @ [224:56] ==> public open val mappers: List<PropMapper<*, *, *>> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'joinToString' @ [224:64] ==> public fun <T> Iterable<PropMapper<*, *, *>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PropMapper<*, *, *>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropMapper<*, *, *>

'it' @ [224:97] ==> value-parameter it: PropMapper<*, *, *> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.configureClientOptions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'names' @ [224:100] ==> public final val names: List<String> defined in org.jetbrains.kotlin.daemon.common.PropMapper[DeserializedPropertyDescriptor]

'first' @ [224:106] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'opts' @ [226:16] ==> value-parameter opts: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.configureClientOptions[ValueParameterDescriptorImpl]

'configureClientOptions' @ [229:59] ==> private final fun configureClientOptions(opts: KotlinCompilerClient.ClientOptions): KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'ClientOptions' @ [229:82] ==> public constructor ClientOptions(stop: Boolean = ...) defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[ClassConstructorDescriptorImpl]

'JvmStatic' @ [232:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'CompilerId' @ [234:26] ==> public constructor CompilerId(compilerClasspath: List<String> = ..., compilerVersion: String = ...) defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedClassConstructorDescriptor]

'configureDaemonOptions' @ [235:29] ==> public fun configureDaemonOptions(): DaemonOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'configureDaemonJVMOptions' @ [236:38] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'configureClientOptions' @ [237:29] ==> private final fun configureClientOptions(): KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'args' @ [238:28] ==> value-parameter vararg args: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[ValueParameterDescriptorImpl]

'asIterable' @ [238:33] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'filterExtractProps' @ [238:46] ==> public fun Iterable<String>.filterExtractProps(vararg groups: OptionsGroup, prefix: String): Iterable<String> defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [238:65] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'daemonOptions' @ [238:77] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'daemonLaunchingOptions' @ [238:92] ==> val daemonLaunchingOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'clientOptions' @ [238:116] ==> val clientOptions: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX' @ [238:140] ==> public val COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'!' @ [240:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'clientOptions' @ [240:14] ==> val clientOptions: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'stop' @ [240:28] ==> public final var stop: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'compilerId' @ [241:17] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'compilerClasspath' @ [241:28] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'none' @ [241:46] ==> public fun <T> Iterable<String>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'err' @ [243:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [243:28] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'detectCompilerClasspath' @ [244:17] ==> public final fun detectCompilerClasspath(): List<String>? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'let' @ [245:27] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'compilerId' @ [245:33] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'compilerClasspath' @ [245:44] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'it' @ [245:64] ==> value-parameter it: List<String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main.<anonymous>[ValueParameterDescriptorImpl]

'if (compilerId.compilerClasspath.none())
                throw IllegalArgumentException("Cannot find compiler jar")
            else
                println("desired compiler classpath: " + compilerId.compilerClasspath.joinToString(File.pathSeparator))' @ [247:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'compilerId' @ [247:17] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'compilerClasspath' @ [247:28] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'none' @ [247:46] ==> public fun <T> Iterable<String>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'IllegalArgumentException' @ [248:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'println' @ [250:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [250:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [250:58] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'compilerClasspath' @ [250:69] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'joinToString' @ [250:87] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pathSeparator' @ [250:105] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'connectToCompileService' @ [253:22] ==> public final fun connectToCompileService(compilerId: CompilerId, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean = ..., checkId: Boolean = ...): CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'compilerId' @ [253:46] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'daemonLaunchingOptions' @ [253:58] ==> val daemonLaunchingOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'daemonOptions' @ [253:82] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'DaemonReportingTargets' @ [253:97] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[ClassConstructorDescriptorImpl]

'out' @ [253:133] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'!' @ [253:151] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'clientOptions' @ [253:152] ==> val clientOptions: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'stop' @ [253:166] ==> public final var stop: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'!' @ [253:182] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'clientOptions' @ [253:183] ==> val clientOptions: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'stop' @ [253:197] ==> public final var stop: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'if (daemon == null) {
            if (clientOptions.stop) {
                System.err.println("No daemon found to shut down")
            }
            else throw Exception("Unable to connect to daemon")
        }
        else when {
            clientOptions.stop -> {
                println("Shutdown the daemon")
                daemon.shutdown()
                println("Daemon shut down successfully")
            }
            filteredArgs.none() -> {
                // so far used only in tests
                println("Warning: empty arguments list, only daemon check is performed: checkCompilerId() returns ${daemon.checkCompilerId(compilerId)}")
            }
            else -> {
                println("Executing daemon compilation with args: " + filteredArgs.joinToString(" "))
                val outStrm = RemoteOutputStreamServer(System.out)
                val servicesFacade = CompilerCallbackServicesFacadeServer()
                try {
                    val memBefore = daemon.getUsedMemory().get() / 1024
                    val startTime = System.nanoTime()

                    val res = daemon.remoteCompile(CompileService.NO_SESSION, CompileService.TargetPlatform.JVM, filteredArgs.toList().toTypedArray(), servicesFacade, outStrm, CompileService.OutputFormat.PLAIN, outStrm, null)

                    val endTime = System.nanoTime()
                    println("Compilation ${if (res.isGood) "succeeded" else "failed"}, result code: ${res.get()}")
                    val memAfter = daemon.getUsedMemory().get() / 1024
                    println("Compilation time: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms")
                    println("Used memory $memAfter (${"%+d".format(memAfter - memBefore)} kb)")
                }
                finally {
                    // forcing RMI to unregister all objects and stop
                    UnicastRemoteObject.unexportObject(servicesFacade, true)
                    UnicastRemoteObject.unexportObject(outStrm, true)
                }
            }
        }' @ [255:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'daemon' @ [255:13] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'if (clientOptions.stop) {
                System.err.println("No daemon found to shut down")
            }
            else throw Exception("Unable to connect to daemon")' @ [256:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'clientOptions' @ [256:17] ==> val clientOptions: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'stop' @ [256:31] ==> public final var stop: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'err' @ [257:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [257:28] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'Exception' @ [259:24] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'when {
            clientOptions.stop -> {
                println("Shutdown the daemon")
                daemon.shutdown()
                println("Daemon shut down successfully")
            }
            filteredArgs.none() -> {
                // so far used only in tests
                println("Warning: empty arguments list, only daemon check is performed: checkCompilerId() returns ${daemon.checkCompilerId(compilerId)}")
            }
            else -> {
                println("Executing daemon compilation with args: " + filteredArgs.joinToString(" "))
                val outStrm = RemoteOutputStreamServer(System.out)
                val servicesFacade = CompilerCallbackServicesFacadeServer()
                try {
                    val memBefore = daemon.getUsedMemory().get() / 1024
                    val startTime = System.nanoTime()

                    val res = daemon.remoteCompile(CompileService.NO_SESSION, CompileService.TargetPlatform.JVM, filteredArgs.toList().toTypedArray(), servicesFacade, outStrm, CompileService.OutputFormat.PLAIN, outStrm, null)

                    val endTime = System.nanoTime()
                    println("Compilation ${if (res.isGood) "succeeded" else "failed"}, result code: ${res.get()}")
                    val memAfter = daemon.getUsedMemory().get() / 1024
                    println("Compilation time: " + TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + " ms")
                    println("Used memory $memAfter (${"%+d".format(memAfter - memBefore)} kb)")
                }
                finally {
                    // forcing RMI to unregister all objects and stop
                    UnicastRemoteObject.unexportObject(servicesFacade, true)
                    UnicastRemoteObject.unexportObject(outStrm, true)
                }
            }
        }' @ [261:14] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'clientOptions' @ [262:13] ==> val clientOptions: KotlinCompilerClient.ClientOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'stop' @ [262:27] ==> public final var stop: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.ClientOptions[PropertyDescriptorImpl]

'println' @ [263:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'daemon' @ [264:17] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'shutdown' @ [264:24] ==> public abstract fun shutdown(): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'println' @ [265:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filteredArgs' @ [267:13] ==> val filteredArgs: Iterable<String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'none' @ [267:26] ==> public fun <T> Iterable<String>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'println' @ [269:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'daemon' @ [269:117] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'checkCompilerId' @ [269:124] ==> public abstract fun checkCompilerId(expectedCompilerId: CompilerId): Boolean defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [269:140] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'println' @ [272:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [272:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'filteredArgs' @ [272:70] ==> val filteredArgs: Iterable<String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'joinToString' @ [272:83] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'RemoteOutputStreamServer' @ [273:31] ==> public constructor RemoteOutputStreamServer(out: OutputStream, port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.RemoteOutputStreamServer[ClassConstructorDescriptorImpl]

'out' @ [273:63] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'CompilerCallbackServicesFacadeServer' @ [274:38] ==> public constructor CompilerCallbackServicesFacadeServer(incrementalCompilationComponents: IncrementalCompilationComponents? = ..., lookupTracker: LookupTracker? = ..., compilationCanceledStatus: CompilationCanceledStatus? = ..., port: Int = ...) defined in org.jetbrains.kotlin.daemon.client.CompilerCallbackServicesFacadeServer[ClassConstructorDescriptorImpl]

'daemon' @ [276:37] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'getUsedMemory' @ [276:44] ==> public abstract fun getUsedMemory(): CompileService.CallResult<Long> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'get' @ [276:60] ==> public abstract fun get(): Long defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'nanoTime' @ [277:44] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'daemon' @ [279:31] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'remoteCompile' @ [279:38] ==> @Deprecated public abstract fun remoteCompile(sessionId: Int, targetPlatform: CompileService.TargetPlatform, args: Array<out String>, servicesFacade: CompilerCallbackServicesFacade, compilerOutputStream: RemoteOutputStream, outputFormat: CompileService.OutputFormat, serviceOutputStream: RemoteOutputStream, operationsTracer: RemoteOperationsTracer?): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'NO_SESSION' @ [279:67] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'JVM' @ [279:109] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'filteredArgs' @ [279:114] ==> val filteredArgs: Iterable<String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'toList' @ [279:127] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'toTypedArray' @ [279:136] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'servicesFacade' @ [279:152] ==> val servicesFacade: CompilerCallbackServicesFacadeServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'outStrm' @ [279:168] ==> val outStrm: RemoteOutputStreamServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'PLAIN' @ [279:205] ==> enum entry PLAIN defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'outStrm' @ [279:212] ==> val outStrm: RemoteOutputStreamServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'nanoTime' @ [281:42] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'println' @ [282:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'if (res.isGood) "succeeded" else "failed"' @ [282:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'res' @ [282:48] ==> val res: CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'isGood' @ [282:52] ==> public final val isGood: Boolean defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedPropertyDescriptor]

'res' @ [282:103] ==> val res: CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'get' @ [282:107] ==> public abstract fun get(): Int defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'daemon' @ [283:36] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'getUsedMemory' @ [283:43] ==> public abstract fun getUsedMemory(): CompileService.CallResult<Long> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'get' @ [283:59] ==> public abstract fun get(): Long defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'println' @ [284:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [284:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'toMillis' @ [284:73] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'endTime' @ [284:82] ==> val endTime: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'startTime' @ [284:92] ==> val startTime: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'println' @ [285:21] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'memAfter' @ [285:43] ==> val memAfter: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'format' @ [285:61] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'memAfter' @ [285:68] ==> val memAfter: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'memBefore' @ [285:79] ==> val memBefore: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'unexportObject' @ [289:41] ==> public open fun unexportObject(p0: (Remote..Remote?), p1: Boolean): Boolean defined in java.rmi.server.UnicastRemoteObject[JavaMethodDescriptor]

'servicesFacade' @ [289:56] ==> val servicesFacade: CompilerCallbackServicesFacadeServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'unexportObject' @ [290:41] ==> public open fun unexportObject(p0: (Remote..Remote?), p1: Boolean): Boolean defined in java.rmi.server.UnicastRemoteObject[JavaMethodDescriptor]

'outStrm' @ [290:56] ==> val outStrm: RemoteOutputStreamServer defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.main[LocalVariableDescriptor]

'getProperty' @ [297:20] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'split' @ [298:15] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparator' @ [298:26] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'map' @ [299:15] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (File..File?)): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.io.File..java.io.File?)

'File' @ [299:21] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [299:26] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.detectCompilerClasspath.<anonymous>[ValueParameterDescriptorImpl]

'parentFile' @ [299:30] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'distinct' @ [300:15] ==> public fun <T> Iterable<(File..File?)>.distinct(): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'mapNotNull' @ [301:15] ==> public inline fun <T, R : Any> Iterable<(File..File?)>.mapNotNull(transform: ((File..File?)) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)
    <R : Any> -> File

'it' @ [302:17] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.detectCompilerClasspath.<anonymous>[ValueParameterDescriptorImpl]

'walk' @ [302:21] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [303:27] ==> public inline fun <T> Sequence<File>.firstOrNull(predicate: (File) -> Boolean): File? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [303:41] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.detectCompilerClasspath.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [303:44] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'equals' @ [303:49] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'COMPILER_JAR_NAME' @ [303:56] ==> public val COMPILER_JAR_NAME: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'firstOrNull' @ [305:15] ==> public fun <T> List<File>.firstOrNull(): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'let' @ [306:15] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> List<(String..String?)>): List<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> List<(kotlin.String..kotlin.String?)>

'listOf' @ [306:21] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [306:28] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.detectCompilerClasspath.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [306:31] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'Synchronized' @ [310:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'component1' @ [315:22] ==> public final operator fun component1(): R? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [315:27] ==> public final operator fun component2(): IOException? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'invoke' @ [316:21] ==> public abstract operator fun invoke(p1: Boolean): R? defined in kotlin.Function1[FunctionInvokeDescriptor]

'attempts' @ [316:26] ==> var attempts: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'DAEMON_CONNECT_CYCLE_ATTEMPTS' @ [316:38] ==> public final val DAEMON_CONNECT_CYCLE_ATTEMPTS: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[PropertyDescriptorImpl]

'to' @ [318:46] ==> public infix fun <A, B> Nothing?.to(that: SocketException): Pair<Nothing?, SocketException> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Nothing?
    <B> -> SocketException

'e' @ [318:54] ==> val e: SocketException defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'to' @ [319:47] ==> public infix fun <A, B> Nothing?.to(that: ConnectException): Pair<Nothing?, ConnectException> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Nothing?
    <B> -> ConnectException

'e' @ [319:55] ==> val e: ConnectException defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'to' @ [320:49] ==> public infix fun <A, B> Nothing?.to(that: ConnectIOException): Pair<Nothing?, ConnectIOException> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Nothing?
    <B> -> ConnectIOException

'e' @ [320:57] ==> val e: ConnectIOException defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'to' @ [321:49] ==> public infix fun <A, B> Nothing?.to(that: UnmarshalException): Pair<Nothing?, UnmarshalException> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Nothing?
    <B> -> UnmarshalException

'e' @ [321:57] ==> val e: UnmarshalException defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'res' @ [323:21] ==> val res: R? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'res' @ [323:41] ==> val res: R? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'err' @ [325:21] ==> val err: IOException? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'reportingTargets' @ [326:21] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[ValueParameterDescriptorImpl]

'report' @ [326:38] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'INFO' @ [326:66] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'+' @ [327:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (attempts >= DAEMON_CONNECT_CYCLE_ATTEMPTS || !autostart) "no more retries on: " else "retrying($attempts) on: "' @ [327:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'attempts' @ [327:50] ==> var attempts: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'DAEMON_CONNECT_CYCLE_ATTEMPTS' @ [327:62] ==> public final val DAEMON_CONNECT_CYCLE_ATTEMPTS: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[PropertyDescriptorImpl]

'!' @ [327:95] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'autostart' @ [327:96] ==> value-parameter autostart: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[ValueParameterDescriptorImpl]

'attempts' @ [327:146] ==> var attempts: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'err' @ [328:47] ==> val err: IOException? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'toString' @ [328:51] ==> public open fun toString(): String defined in java.io.IOException[DeserializedSimpleFunctionDescriptor]

'attempts' @ [331:21] ==> var attempts: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'DAEMON_CONNECT_CYCLE_ATTEMPTS' @ [331:34] ==> public final val DAEMON_CONNECT_CYCLE_ATTEMPTS: Int defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[PropertyDescriptorImpl]

'!' @ [331:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'autostart' @ [331:68] ==> value-parameter autostart: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[ValueParameterDescriptorImpl]

'reportingTargets' @ [337:13] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[ValueParameterDescriptorImpl]

'report' @ [337:30] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'EXCEPTION' @ [337:58] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'e' @ [337:69] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.connectLoop[LocalVariableDescriptor]

'toString' @ [337:71] ==> public open fun toString(): String defined in kotlin.Throwable[DeserializedSimpleFunctionDescriptor]

'registryDir' @ [343:9] ==> value-parameter registryDir: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[ValueParameterDescriptorImpl]

'mkdirs' @ [343:21] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'createTempFile' @ [344:31] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'registryDir' @ [344:91] ==> value-parameter registryDir: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[ValueParameterDescriptorImpl]

'walkDaemons' @ [346:13] ==> public fun walkDaemons(registryDir: File, compilerId: CompilerId, fileToCompareTimestamp: File, filter: (File, Int) -> Boolean = ..., report: (DaemonReportCategory, String) -> Unit = ...): Sequence<DaemonWithMetadata> defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'registryDir' @ [346:25] ==> value-parameter registryDir: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[ValueParameterDescriptorImpl]

'compilerId' @ [346:38] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[ValueParameterDescriptorImpl]

'timestampMarker' @ [346:50] ==> val timestampMarker: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[LocalVariableDescriptor]

'report' @ [346:76] ==> value-parameter report: (DaemonReportCategory, String) -> Unit defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[ValueParameterDescriptorImpl]

'toList' @ [346:84] ==> public fun <T> Sequence<DaemonWithMetadata>.toList(): List<DaemonWithMetadata> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata

'timestampMarker' @ [349:13] ==> val timestampMarker: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[LocalVariableDescriptor]

'delete' @ [349:29] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'compareBy' @ [351:26] ==> @InlineOnly public inline fun <T, K> compareBy(comparator: Comparator<in DaemonJVMOptions> /* = Comparator<in DaemonJVMOptions> */, crossinline selector: (DaemonWithMetadata) -> DaemonJVMOptions): Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata
    <K> -> DaemonJVMOptions

'DaemonJVMOptionsMemoryComparator' @ [351:74] ==> public constructor DaemonJVMOptionsMemoryComparator() defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptionsMemoryComparator[DeserializedClassConstructorDescriptor]

'it' @ [351:112] ==> value-parameter it: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts.<anonymous>[ValueParameterDescriptorImpl]

'jvmOptions' @ [351:115] ==> public final val jvmOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'thenBy' @ [352:18] ==> @InlineOnly public inline fun <T, K> Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */.thenBy(comparator: Comparator<in File> /* = Comparator<in File> */, crossinline selector: (DaemonWithMetadata) -> File): Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata
    <K> -> File

'FileAgeComparator' @ [352:25] ==> public constructor FileAgeComparator() defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator[DeserializedClassConstructorDescriptor]

'it' @ [352:48] ==> value-parameter it: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [352:51] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'daemonJVMOptions' @ [353:24] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[ValueParameterDescriptorImpl]

'copy' @ [353:41] ==> public final fun copy(maxMemory: String = ..., maxPermSize: String = ..., reservedCodeCacheSize: String = ..., jvmParams: MutableCollection<String> = ...): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedSimpleFunctionDescriptor]

'aliveWithMetadata' @ [355:16] ==> val aliveWithMetadata: List<DaemonWithMetadata> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[LocalVariableDescriptor]

'maxWith' @ [355:34] ==> public fun <T> Iterable<DaemonWithMetadata>.maxWith(comparator: Comparator<in DaemonWithMetadata> /* = Comparator<in DaemonWithMetadata> */): DaemonWithMetadata? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata

'comparator' @ [355:42] ==> val comparator: Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */ defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[LocalVariableDescriptor]

'takeIf' @ [355:55] ==> @InlineOnly @SinceKotlin public inline fun <T> DaemonWithMetadata.takeIf(predicate: (DaemonWithMetadata) -> Boolean): DaemonWithMetadata? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata

'daemonJVMOptions' @ [355:64] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[ValueParameterDescriptorImpl]

'it' @ [355:100] ==> value-parameter it: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts.<anonymous>[ValueParameterDescriptorImpl]

'jvmOptions' @ [355:103] ==> public final val jvmOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'let' @ [355:117] ==> @InlineOnly public inline fun <T, R> DaemonWithMetadata.let(block: (DaemonWithMetadata) -> Pair<CompileService, DaemonJVMOptions>): Pair<CompileService, DaemonJVMOptions> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata
    <R> -> Pair<CompileService, DaemonJVMOptions>

'Pair' @ [356:17] ==> public constructor Pair<out A, out B>(first: CompileService, second: DaemonJVMOptions) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> CompileService
    <out B> -> DaemonJVMOptions

'it' @ [356:22] ==> value-parameter it: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts.<anonymous>[ValueParameterDescriptorImpl]

'daemon' @ [356:25] ==> public final val daemon: CompileService defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'optsCopy' @ [356:33] ==> val optsCopy: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[LocalVariableDescriptor]

'updateMemoryUpperBounds' @ [356:42] ==> public fun DaemonJVMOptions.updateMemoryUpperBounds(other: DaemonJVMOptions): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'it' @ [356:66] ==> value-parameter it: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts.<anonymous>[ValueParameterDescriptorImpl]

'jvmOptions' @ [356:69] ==> public final val jvmOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'Pair' @ [359:16] ==> public constructor Pair<out A, out B>(first: Nothing?, second: DaemonJVMOptions) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Nothing?
    <out B> -> DaemonJVMOptions

'aliveWithMetadata' @ [359:27] ==> val aliveWithMetadata: List<DaemonWithMetadata> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[LocalVariableDescriptor]

'fold' @ [359:45] ==> public inline fun <T, R> Iterable<DaemonWithMetadata>.fold(initial: DaemonJVMOptions, operation: (acc: DaemonJVMOptions, DaemonWithMetadata) -> DaemonJVMOptions): DaemonJVMOptions defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata
    <R> -> DaemonJVMOptions

'optsCopy' @ [359:50] ==> val optsCopy: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts[LocalVariableDescriptor]

'opts' @ [359:73] ==> value-parameter opts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts.<anonymous>[ValueParameterDescriptorImpl]

'updateMemoryUpperBounds' @ [359:78] ==> public fun DaemonJVMOptions.updateMemoryUpperBounds(other: DaemonJVMOptions): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'd' @ [359:102] ==> value-parameter d: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.tryFindSuitableDaemonOrNewOpts.<anonymous>[ValueParameterDescriptorImpl]

'jvmOptions' @ [359:104] ==> public final val jvmOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'File' @ [364:30] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [364:35] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getProperty' @ [364:47] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'?:' @ [365:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getProperty' @ [365:37] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'JAVA_RMI_SERVER_HOSTNAME' @ [365:49] ==> public val JAVA_RMI_SERVER_HOSTNAME: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'error' @ [365:78] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'JAVA_RMI_SERVER_HOSTNAME' @ [365:86] ==> public val JAVA_RMI_SERVER_HOSTNAME: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'listOf' @ [366:39] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'JAVA_RMI_SERVER_HOSTNAME' @ [369:21] ==> public val JAVA_RMI_SERVER_HOSTNAME: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'serverHostname' @ [369:47] ==> val serverHostname: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'listOf' @ [370:20] ==> public fun <T> listOf(vararg elements: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'javaExecutable' @ [371:20] ==> val javaExecutable: File defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'absolutePath' @ [371:35] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'compilerId' @ [371:56] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'compilerClasspath' @ [371:67] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'joinToString' @ [371:85] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pathSeparator' @ [371:103] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'platformSpecificOptions' @ [372:20] ==> val platformSpecificOptions: List<String> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'daemonJVMOptions' @ [373:20] ==> value-parameter daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'mappers' @ [373:37] ==> public open val mappers: List<PropMapper<*, *, *>> defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptions[DeserializedPropertyDescriptor]

'flatMap' @ [373:45] ==> public inline fun <T, R> Iterable<PropMapper<*, *, *>>.flatMap(transform: (PropMapper<*, *, *>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropMapper<*, *, *>
    <R> -> String

'it' @ [373:55] ==> value-parameter it: PropMapper<*, *, *> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon.<anonymous>[ValueParameterDescriptorImpl]

'toArgs' @ [373:58] ==> public open fun toArgs(prefix: String = ...): List<String> defined in org.jetbrains.kotlin.daemon.common.PropMapper[DeserializedSimpleFunctionDescriptor]

'COMPILER_DAEMON_CLASS_FQN' @ [374:20] ==> public val COMPILER_DAEMON_CLASS_FQN: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'daemonOptions' @ [375:20] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'mappers' @ [375:34] ==> public open val mappers: List<PropMapper<*, *, *>> defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'flatMap' @ [375:42] ==> public inline fun <T, R> Iterable<PropMapper<*, *, *>>.flatMap(transform: (PropMapper<*, *, *>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropMapper<*, *, *>
    <R> -> String

'it' @ [375:52] ==> value-parameter it: PropMapper<*, *, *> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon.<anonymous>[ValueParameterDescriptorImpl]

'toArgs' @ [375:55] ==> public open fun toArgs(prefix: String = ...): List<String> defined in org.jetbrains.kotlin.daemon.common.PropMapper[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX' @ [375:62] ==> public val COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'compilerId' @ [376:20] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'mappers' @ [376:31] ==> public open val mappers: List<PropMapper<*, *, *>> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'flatMap' @ [376:39] ==> public inline fun <T, R> Iterable<PropMapper<*, *, *>>.flatMap(transform: (PropMapper<*, *, *>) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropMapper<*, *, *>
    <R> -> String

'it' @ [376:49] ==> value-parameter it: PropMapper<*, *, *> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon.<anonymous>[ValueParameterDescriptorImpl]

'toArgs' @ [376:52] ==> public open fun toArgs(prefix: String = ...): List<String> defined in org.jetbrains.kotlin.daemon.common.PropMapper[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX' @ [376:59] ==> public val COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'reportingTargets' @ [377:9] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'report' @ [377:26] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [377:54] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'+' @ [377:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'args' @ [377:90] ==> val args: List<(String..String?)> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'joinToString' @ [377:95] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'ProcessBuilder' @ [378:30] ==> public constructor ProcessBuilder(p0: (MutableList<(String..String?)>..List<(String..String?)>?)) defined in java.lang.ProcessBuilder[JavaClassConstructorDescriptor]

'args' @ [378:45] ==> val args: List<(String..String?)> defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'processBuilder' @ [379:9] ==> val processBuilder: ProcessBuilder defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'redirectErrorStream' @ [379:24] ==> public open fun redirectErrorStream(p0: Boolean): (ProcessBuilder..ProcessBuilder?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

'launchProcessWithFallback' @ [381:22] ==> public fun launchProcessWithFallback(processBuilder: ProcessBuilder, reportingTargets: DaemonReportingTargets, reportingSource: String = ...): Process defined in org.jetbrains.kotlin.daemon.client in file NativePlatformUtil.kt[SimpleFunctionDescriptorImpl]

'processBuilder' @ [381:48] ==> val processBuilder: ProcessBuilder defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'reportingTargets' @ [381:64] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'Semaphore' @ [383:26] ==> public constructor Semaphore(p0: Int) defined in java.util.concurrent.Semaphore[JavaClassConstructorDescriptor]

'isEchoRead' @ [384:9] ==> val isEchoRead: Semaphore defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'acquire' @ [384:20] ==> public open fun acquire(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'thread' @ [387:17] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'daemon' @ [389:25] ==> val daemon: Process defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'inputStream' @ [389:32] ==> public final val Process.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'reader' @ [390:34] ==> @InlineOnly public inline fun InputStream.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'forEachLine' @ [391:34] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'if (it == COMPILE_DAEMON_IS_READY_MESSAGE) {
                                        reportingTargets.report(DaemonReportCategory.DEBUG, "Received the message signalling that the daemon is ready")
                                        isEchoRead.release()
                                        return@forEachLine
                                    }
                                    else {
                                        reportingTargets.report(DaemonReportCategory.INFO, it, "daemon")
                                    }' @ [392:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'it' @ [392:41] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'COMPILE_DAEMON_IS_READY_MESSAGE' @ [392:47] ==> public val COMPILE_DAEMON_IS_READY_MESSAGE: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'reportingTargets' @ [393:41] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'report' @ [393:58] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [393:86] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'isEchoRead' @ [394:41] ==> val isEchoRead: Semaphore defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'release' @ [394:52] ==> public open fun release(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'reportingTargets' @ [398:41] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'report' @ [398:58] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'INFO' @ [398:86] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'it' @ [398:92] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'daemon' @ [403:25] ==> val daemon: Process defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'inputStream' @ [403:32] ==> public final val Process.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'close' @ [403:44] ==> public open fun close(): Unit defined in java.io.InputStream[JavaMethodDescriptor]

'daemon' @ [404:25] ==> val daemon: Process defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'outputStream' @ [404:32] ==> public final val Process.outputStream: (OutputStream..OutputStream?)[MyPropertyDescriptor]

'close' @ [404:45] ==> public open fun close(): Unit defined in java.io.OutputStream[JavaMethodDescriptor]

'daemon' @ [405:25] ==> val daemon: Process defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'errorStream' @ [405:32] ==> public final val Process.errorStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'close' @ [405:44] ==> public open fun close(): Unit defined in java.io.InputStream[JavaMethodDescriptor]

'isEchoRead' @ [406:25] ==> val isEchoRead: Semaphore defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'release' @ [406:36] ==> public open fun release(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'?:' @ [411:40] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Long?, right: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Long

'getProperty' @ [411:47] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY' @ [411:59] ==> public val COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'let' @ [411:101] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Long?): Long? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Long?

'it' @ [413:21] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon.<anonymous>[ValueParameterDescriptorImpl]

'toLong' @ [413:24] ==> @InlineOnly public inline fun String.toLong(): Long defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'reportingTargets' @ [416:21] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'report' @ [416:38] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'INFO' @ [416:66] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY' @ [416:94] ==> public val COMPILE_DAEMON_STARTUP_TIMEOUT_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'it' @ [416:146] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon.<anonymous>[ValueParameterDescriptorImpl]

'DAEMON_DEFAULT_STARTUP_TIMEOUT_MS' @ [416:175] ==> public final val DAEMON_DEFAULT_STARTUP_TIMEOUT_MS: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[PropertyDescriptorImpl]

'DAEMON_DEFAULT_STARTUP_TIMEOUT_MS' @ [419:18] ==> public final val DAEMON_DEFAULT_STARTUP_TIMEOUT_MS: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[PropertyDescriptorImpl]

'if (daemonOptions.runFilesPath.isNotEmpty()) {
                val succeeded = isEchoRead.tryAcquire(daemonStartupTimeout, TimeUnit.MILLISECONDS)
                if (!isProcessAlive(daemon))
                    throw Exception("Daemon terminated unexpectedly with error code: ${daemon.exitValue()}")
                if (!succeeded)
                    throw Exception("Unable to get response from daemon in $daemonStartupTimeout ms")
            }
            else
            // without startEcho defined waiting for max timeout
                Thread.sleep(daemonStartupTimeout)' @ [420:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'daemonOptions' @ [420:17] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'runFilesPath' @ [420:31] ==> public final var runFilesPath: String defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'isNotEmpty' @ [420:44] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isEchoRead' @ [421:33] ==> val isEchoRead: Semaphore defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'tryAcquire' @ [421:44] ==> public open fun tryAcquire(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'daemonStartupTimeout' @ [421:55] ==> val daemonStartupTimeout: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'MILLISECONDS' @ [421:86] ==> enum entry MILLISECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'!' @ [422:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isProcessAlive' @ [422:22] ==> internal fun isProcessAlive(process: Process): Boolean defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'daemon' @ [422:37] ==> val daemon: Process defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'Exception' @ [423:27] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'daemon' @ [423:88] ==> val daemon: Process defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'exitValue' @ [423:95] ==> public abstract fun exitValue(): Int defined in java.lang.Process[JavaMethodDescriptor]

'!' @ [424:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'succeeded' @ [424:22] ==> val succeeded: Boolean defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'Exception' @ [425:27] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'daemonStartupTimeout' @ [425:77] ==> val daemonStartupTimeout: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'sleep' @ [429:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'daemonStartupTimeout' @ [429:30] ==> val daemonStartupTimeout: Long defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'stdoutThread' @ [433:17] ==> val stdoutThread: Thread defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'isAlive' @ [433:30] ==> public final val Thread.isAlive: Boolean[MyPropertyDescriptor]

'stdoutThread' @ [435:17] ==> val stdoutThread: Thread defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[LocalVariableDescriptor]

'stop' @ [435:30] ==> @Deprecated public final fun stop(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'reportingTargets' @ [437:13] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient.startDaemon[ValueParameterDescriptorImpl]

'out' @ [437:30] ==> public final val out: PrintStream? defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[PropertyDescriptorImpl]

'flush' @ [437:35] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'getValue' @ [451:34] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'source' @ [451:41] ==> value-parameter source: String? = ... defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'let' @ [451:49] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [451:58] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.client.report.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [451:63] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'message' @ [451:77] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'out' @ [452:5] ==> public final val out: PrintStream? defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[PropertyDescriptorImpl]

'println' @ [452:10] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'category' @ [452:21] ==> value-parameter category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'name' @ [452:30] ==> public final val name: String defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[DeserializedPropertyDescriptor]

'sourceMessage' @ [452:38] ==> val sourceMessage: String defined in org.jetbrains.kotlin.daemon.client.report[LocalVariableDescriptor]

'messages' @ [453:5] ==> public final val messages: MutableCollection<DaemonReportMessage>? defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[PropertyDescriptorImpl]

'add' @ [453:15] ==> public abstract fun add(element: DaemonReportMessage): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'DaemonReportMessage' @ [453:19] ==> public constructor DaemonReportMessage(category: DaemonReportCategory, message: String) defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[ClassConstructorDescriptorImpl]

'category' @ [453:39] ==> value-parameter category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'sourceMessage' @ [453:49] ==> val sourceMessage: String defined in org.jetbrains.kotlin.daemon.client.report[LocalVariableDescriptor]

'messageCollector' @ [454:5] ==> public final val messageCollector: MessageCollector? defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[PropertyDescriptorImpl]

'let' @ [454:23] ==> @InlineOnly public inline fun <T, R> MessageCollector.let(block: (MessageCollector) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageCollector
    <R> -> Unit

'when (category) {
            DaemonReportCategory.DEBUG -> it.report(CompilerMessageSeverity.LOGGING, sourceMessage)
            DaemonReportCategory.INFO -> it.report(CompilerMessageSeverity.INFO, sourceMessage)
            DaemonReportCategory.EXCEPTION -> it.report(CompilerMessageSeverity.EXCEPTION, sourceMessage)
        }' @ [455:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'category' @ [455:15] ==> value-parameter category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'DEBUG' @ [456:34] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'it' @ [456:43] ==> value-parameter it: MessageCollector defined in org.jetbrains.kotlin.daemon.client.report.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [456:46] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'LOGGING' @ [456:77] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'sourceMessage' @ [456:86] ==> val sourceMessage: String defined in org.jetbrains.kotlin.daemon.client.report[LocalVariableDescriptor]

'INFO' @ [457:34] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'it' @ [457:42] ==> value-parameter it: MessageCollector defined in org.jetbrains.kotlin.daemon.client.report.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [457:45] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'INFO' @ [457:76] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'sourceMessage' @ [457:82] ==> val sourceMessage: String defined in org.jetbrains.kotlin.daemon.client.report[LocalVariableDescriptor]

'EXCEPTION' @ [458:34] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'it' @ [458:47] ==> value-parameter it: MessageCollector defined in org.jetbrains.kotlin.daemon.client.report.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [458:50] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'EXCEPTION' @ [458:81] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'sourceMessage' @ [458:92] ==> val sourceMessage: String defined in org.jetbrains.kotlin.daemon.client.report[LocalVariableDescriptor]

'compilerServices' @ [461:5] ==> public final val compilerServices: CompilerServicesFacadeBase? defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[PropertyDescriptorImpl]

'let' @ [461:23] ==> @InlineOnly public inline fun <T, R> CompilerServicesFacadeBase.let(block: (CompilerServicesFacadeBase) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerServicesFacadeBase
    <R> -> Unit

'when (category) {
            DaemonReportCategory.DEBUG -> it.report(ReportCategory.DAEMON_MESSAGE, ReportSeverity.DEBUG, message, source)
            DaemonReportCategory.INFO -> it.report(ReportCategory.DAEMON_MESSAGE, ReportSeverity.INFO, message, source)
            DaemonReportCategory.EXCEPTION -> it.report(ReportCategory.EXCEPTION, ReportSeverity.ERROR, message, source)
        }' @ [462:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'category' @ [462:15] ==> value-parameter category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'DEBUG' @ [463:34] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'it' @ [463:43] ==> value-parameter it: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.client.report.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [463:46] ==> public fun CompilerServicesFacadeBase.report(category: ReportCategory, severity: ReportSeverity, message: String? = ..., attachment: Serializable? = ...): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'DAEMON_MESSAGE' @ [463:68] ==> enum entry DAEMON_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'DEBUG' @ [463:99] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'message' @ [463:106] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'source' @ [463:115] ==> value-parameter source: String? = ... defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'INFO' @ [464:34] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'it' @ [464:42] ==> value-parameter it: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.client.report.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [464:45] ==> public fun CompilerServicesFacadeBase.report(category: ReportCategory, severity: ReportSeverity, message: String? = ..., attachment: Serializable? = ...): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'DAEMON_MESSAGE' @ [464:67] ==> enum entry DAEMON_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'INFO' @ [464:98] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'message' @ [464:104] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'source' @ [464:113] ==> value-parameter source: String? = ... defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'EXCEPTION' @ [465:34] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'it' @ [465:47] ==> value-parameter it: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.client.report.<anonymous>[ValueParameterDescriptorImpl]

'report' @ [465:50] ==> public fun CompilerServicesFacadeBase.report(category: ReportCategory, severity: ReportSeverity, message: String? = ..., attachment: Serializable? = ...): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'EXCEPTION' @ [465:72] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'ERROR' @ [465:98] ==> enum entry ERROR defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'message' @ [465:105] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'source' @ [465:114] ==> value-parameter source: String? = ... defined in org.jetbrains.kotlin.daemon.client.report[ValueParameterDescriptorImpl]

'process' @ [472:13] ==> value-parameter process: Process defined in org.jetbrains.kotlin.daemon.client.isProcessAlive[ValueParameterDescriptorImpl]

'exitValue' @ [472:21] ==> public abstract fun exitValue(): Int defined in java.lang.Process[JavaMethodDescriptor]

