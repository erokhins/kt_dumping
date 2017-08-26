'toString' @ [49:60] ==> public open fun toString(): String defined in org.jetbrains.kotlin.cli.common.ExitCode[DeserializedSimpleFunctionDescriptor]

'Synchronized' @ [55:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'configureDaemonOptions' @ [61:44] ==> public fun configureDaemonOptions(): DaemonOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'configureDaemonJVMOptions' @ [63:32] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [65:36] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DaemonReportMessage

'DaemonReportingTargets' @ [66:38] ==> public constructor DaemonReportingTargets(out: PrintStream? = ..., messages: MutableCollection<DaemonReportMessage>? = ..., messageCollector: MessageCollector? = ..., compilerServices: CompilerServicesFacadeBase? = ...) defined in org.jetbrains.kotlin.daemon.client.DaemonReportingTargets[ClassConstructorDescriptorImpl]

'daemonReportMessages' @ [66:72] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'if (daemonOptions.reportPerf) WallAndThreadAndMemoryTotalProfiler(withGC = false) else DummyProfiler()' @ [68:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Profiler, elseBranch: Profiler): Profiler[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Profiler

'daemonOptions' @ [68:28] ==> value-parameter daemonOptions: DaemonOptions = ... defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'reportPerf' @ [68:42] ==> public final var reportPerf: Boolean defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'WallAndThreadAndMemoryTotalProfiler' @ [68:54] ==> public constructor WallAndThreadAndMemoryTotalProfiler(withGC: Boolean) defined in org.jetbrains.kotlin.daemon.common.WallAndThreadAndMemoryTotalProfiler[DeserializedClassConstructorDescriptor]

'DummyProfiler' @ [68:111] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'profiler' @ [70:26] ==> val profiler: Profiler defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'withMeasure' @ [70:35] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> CompileServiceSession?): CompileServiceSession? defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> CompileServiceSession?

'KotlinCompilerClient' @ [71:13] ==> public object KotlinCompilerClient defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[FakeCallableDescriptorForObject]

'connectAndLease' @ [71:34] ==> public final fun connectAndLease(compilerId: CompilerId, clientAliveFlagFile: File, daemonJVMOptions: DaemonJVMOptions, daemonOptions: DaemonOptions, reportingTargets: DaemonReportingTargets, autostart: Boolean, leaseSession: Boolean, sessionAliveFlagFile: File? = ...): CompileServiceSession? defined in org.jetbrains.kotlin.daemon.client.KotlinCompilerClient[SimpleFunctionDescriptorImpl]

'compilerId' @ [71:50] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'clientAliveFlagFile' @ [72:50] ==> value-parameter clientAliveFlagFile: File defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'daemonJVMOptions' @ [73:50] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'daemonOptions' @ [74:50] ==> value-parameter daemonOptions: DaemonOptions = ... defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'daemonReportingTargets' @ [75:50] ==> val daemonReportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'sessionAliveFlagFile' @ [78:73] ==> value-parameter sessionAliveFlagFile: File defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'connection' @ [81:13] ==> val connection: CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'log' @ [81:35] ==> protected abstract val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner[PropertyDescriptorImpl]

'isDebugEnabled' @ [81:39] ==> public abstract val isDebugEnabled: Boolean defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[PropertyDescriptorImpl]

'daemonReportMessages' @ [82:29] ==> val daemonReportMessages: ArrayList<DaemonReportMessage> defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'when(message.category) {
                    DaemonReportCategory.DEBUG -> CompilerMessageSeverity.INFO
                    DaemonReportCategory.INFO -> CompilerMessageSeverity.INFO
                    DaemonReportCategory.EXCEPTION -> CompilerMessageSeverity.EXCEPTION
                }' @ [83:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompilerMessageSeverity, entry1: CompilerMessageSeverity, entry2: CompilerMessageSeverity): CompilerMessageSeverity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CompilerMessageSeverity

'message' @ [83:37] ==> val message: DaemonReportMessage defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'category' @ [83:45] ==> public final val category: DaemonReportCategory defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[PropertyDescriptorImpl]

'DEBUG' @ [84:42] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'INFO' @ [84:75] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'INFO' @ [85:42] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'INFO' @ [85:74] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'EXCEPTION' @ [86:42] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'EXCEPTION' @ [86:79] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'environment' @ [88:17] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'messageCollector' @ [88:29] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.CompilerEnvironment[PropertyDescriptorImpl]

'report' @ [88:46] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'severity' @ [88:53] ==> val severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'message' @ [88:63] ==> val message: DaemonReportMessage defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'message' @ [88:71] ==> public final val message: String defined in org.jetbrains.kotlin.daemon.client.DaemonReportMessage[PropertyDescriptorImpl]

'daemonOptions' @ [93:17] ==> value-parameter daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[ValueParameterDescriptorImpl]

'reportPerf' @ [93:31] ==> public final var reportPerf: Boolean defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'toMillis' @ [94:54] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'this' @ [94:63] ==> <this> defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf.ms[ReceiverParameterDescriptorImpl]

'profiler' @ [95:32] ==> value-parameter profiler: Profiler defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[ValueParameterDescriptorImpl]

'getTotalCounters' @ [95:41] ==> public abstract fun getTotalCounters(): PerfCounters defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [96:17] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[ValueParameterDescriptorImpl]

'report' @ [96:34] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'INFO' @ [96:65] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [96:79] ==> value-parameter message: String defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[ValueParameterDescriptorImpl]

'counters' @ [96:89] ==> val counters: PerfCounters defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[LocalVariableDescriptor]

'time' @ [96:98] ==> public abstract val time: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [96:103] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[SimpleFunctionDescriptorImpl]

'counters' @ [96:122] ==> val counters: PerfCounters defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[LocalVariableDescriptor]

'threadTime' @ [96:131] ==> public abstract val threadTime: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [96:142] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection.reportTotalAndThreadPerf[SimpleFunctionDescriptorImpl]

'reportTotalAndThreadPerf' @ [100:9] ==> local final fun reportTotalAndThreadPerf(message: String, daemonOptions: DaemonOptions, messageCollector: MessageCollector, profiler: Profiler): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[SimpleFunctionDescriptorImpl]

'daemonOptions' @ [100:52] ==> value-parameter daemonOptions: DaemonOptions = ... defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'environment' @ [100:67] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[ValueParameterDescriptorImpl]

'messageCollector' @ [100:79] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.CompilerEnvironment[PropertyDescriptorImpl]

'profiler' @ [100:97] ==> val profiler: Profiler defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'connection' @ [101:16] ==> val connection: CompileServiceSession? defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.newDaemonConnection[LocalVariableDescriptor]

'BufferedReader' @ [109:22] ==> public constructor BufferedReader(p0: (Reader..Reader?)) defined in java.io.BufferedReader[JavaClassConstructorDescriptor]

'StringReader' @ [109:37] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'stream' @ [109:50] ==> value-parameter stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.processCompilerOutput[ValueParameterDescriptorImpl]

'toString' @ [109:57] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'CompilerOutputParser' @ [110:9] ==> public object CompilerOutputParser defined in org.jetbrains.kotlin.compilerRunner in file CompilerOutputParser.kt[FakeCallableDescriptorForObject]

'parseCompilerMessagesFromReader' @ [110:30] ==> public final fun parseCompilerMessagesFromReader(messageCollector: MessageCollector, reader: Reader, collector: OutputItemsCollector): Unit defined in org.jetbrains.kotlin.compilerRunner.CompilerOutputParser[SimpleFunctionDescriptorImpl]

'environment' @ [110:62] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.processCompilerOutput[ValueParameterDescriptorImpl]

'messageCollector' @ [110:74] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.CompilerEnvironment[PropertyDescriptorImpl]

'reader' @ [110:92] ==> val reader: BufferedReader defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.processCompilerOutput[LocalVariableDescriptor]

'environment' @ [110:100] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.processCompilerOutput[ValueParameterDescriptorImpl]

'outputItemsCollector' @ [110:112] ==> public open val outputItemsCollector: OutputItemsCollector defined in org.jetbrains.kotlin.compilerRunner.CompilerEnvironment[PropertyDescriptorImpl]

'==' @ [112:13] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.cli.common.ExitCode[DeserializedSimpleFunctionDescriptor]

'INTERNAL_ERROR' @ [112:22] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'exitCode' @ [112:40] ==> value-parameter exitCode: ExitCode? defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.processCompilerOutput[ValueParameterDescriptorImpl]

'reportInternalCompilerError' @ [113:13] ==> protected final fun reportInternalCompilerError(messageCollector: MessageCollector): ExitCode defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'environment' @ [113:41] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.processCompilerOutput[ValueParameterDescriptorImpl]

'messageCollector' @ [113:53] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.CompilerEnvironment[PropertyDescriptorImpl]

'messageCollector' @ [118:9] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.reportInternalCompilerError[ValueParameterDescriptorImpl]

'report' @ [118:26] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [118:57] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'INTERNAL_ERROR' @ [119:25] ==> enum entry INTERNAL_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'compileWithDaemonOrFallback' @ [127:13] ==> protected abstract fun compileWithDaemonOrFallback(compilerClassName: String, compilerArgs: CommonCompilerArguments, environment: Env): ExitCode defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'compilerClassName' @ [127:41] ==> value-parameter compilerClassName: String defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.runCompiler[ValueParameterDescriptorImpl]

'compilerArgs' @ [127:60] ==> value-parameter compilerArgs: CommonCompilerArguments defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.runCompiler[ValueParameterDescriptorImpl]

'environment' @ [127:74] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.runCompiler[ValueParameterDescriptorImpl]

'reportException' @ [130:34] ==> public open fun reportException(@NotNull p0: MessageCollector, @NotNull p1: Throwable): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorUtil[JavaMethodDescriptor]

'environment' @ [130:50] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.runCompiler[ValueParameterDescriptorImpl]

'messageCollector' @ [130:62] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.CompilerEnvironment[PropertyDescriptorImpl]

'e' @ [130:80] ==> val e: Throwable defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.runCompiler[LocalVariableDescriptor]

'reportInternalCompilerError' @ [131:13] ==> protected final fun reportInternalCompilerError(messageCollector: MessageCollector): ExitCode defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner[SimpleFunctionDescriptorImpl]

'environment' @ [131:41] ==> value-parameter environment: Env defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.runCompiler[ValueParameterDescriptorImpl]

'messageCollector' @ [131:53] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.CompilerEnvironment[PropertyDescriptorImpl]

'Companion' @ [150:70] ==> public companion object defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner[FakeCallableDescriptorForObject]

'exitCodeFromProcessExitCode' @ [150:80] ==> public final fun exitCodeFromProcessExitCode(log: KotlinLogger, code: Int): ExitCode defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion[SimpleFunctionDescriptorImpl]

'log' @ [150:108] ==> protected abstract val log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner[PropertyDescriptorImpl]

'code' @ [150:113] ==> value-parameter code: Int defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.exitCodeFromProcessExitCode[ValueParameterDescriptorImpl]

'values' @ [154:37] ==> public final fun values(): Array<ExitCode> defined in org.jetbrains.kotlin.cli.common.ExitCode[SimpleFunctionDescriptorImpl]

'find' @ [154:46] ==> @InlineOnly public inline fun <T> Array<out ExitCode>.find(predicate: (ExitCode) -> Boolean): ExitCode? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExitCode

'it' @ [154:53] ==> value-parameter it: ExitCode defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion.exitCodeFromProcessExitCode.<anonymous>[ValueParameterDescriptorImpl]

'code' @ [154:56] ==> public final val ExitCode.code: Int[MyPropertyDescriptor]

'code' @ [154:64] ==> value-parameter code: Int defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion.exitCodeFromProcessExitCode[ValueParameterDescriptorImpl]

'exitCode' @ [155:17] ==> val exitCode: ExitCode? defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion.exitCodeFromProcessExitCode[LocalVariableDescriptor]

'exitCode' @ [155:42] ==> val exitCode: ExitCode? defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion.exitCodeFromProcessExitCode[LocalVariableDescriptor]

'log' @ [157:13] ==> value-parameter log: KotlinLogger defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion.exitCodeFromProcessExitCode[ValueParameterDescriptorImpl]

'debug' @ [157:17] ==> public abstract fun debug(msg: String): Unit defined in org.jetbrains.kotlin.compilerRunner.KotlinLogger[SimpleFunctionDescriptorImpl]

'code' @ [157:60] ==> value-parameter code: Int defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion.exitCodeFromProcessExitCode[ValueParameterDescriptorImpl]

'if (code == 0) ExitCode.OK else ExitCode.COMPILATION_ERROR' @ [158:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExitCode, elseBranch: ExitCode): ExitCode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExitCode

'code' @ [158:24] ==> value-parameter code: Int defined in org.jetbrains.kotlin.compilerRunner.KotlinCompilerRunner.Companion.exitCodeFromProcessExitCode[ValueParameterDescriptorImpl]

'OK' @ [158:44] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'COMPILATION_ERROR' @ [158:61] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

