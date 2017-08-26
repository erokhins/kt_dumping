'compilationOptions' @ [30:30] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.<init>[ValueParameterDescriptorImpl]

'reportSeverity' @ [30:49] ==> public final val reportSeverity: Int defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedPropertyDescriptor]

'hasErrors' @ [34:9] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

'log' @ [38:9] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyImportedFromObject]

'info' @ [38:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'+' @ [38:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'WITHOUT_PATHS' @ [38:48] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'render' @ [38:62] ==> public abstract fun render(@NotNull p0: CompilerMessageSeverity, @NotNull p1: String, @Nullable p2: CompilerMessageLocation?): (String..String?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaMethodDescriptor]

'severity' @ [38:69] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'message' @ [38:79] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'location' @ [38:88] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'when (severity) {
            CompilerMessageSeverity.OUTPUT -> {
                servicesFacade.report(ReportCategory.OUTPUT_MESSAGE, ReportSeverity.ERROR, message)
            }
            CompilerMessageSeverity.EXCEPTION -> {
                servicesFacade.report(ReportCategory.EXCEPTION, ReportSeverity.ERROR, message)
            }
            else -> {
                val reportSeverity = when (severity) {
                    CompilerMessageSeverity.ERROR -> ReportSeverity.ERROR
                    CompilerMessageSeverity.WARNING, CompilerMessageSeverity.STRONG_WARNING -> ReportSeverity.WARNING
                    CompilerMessageSeverity.INFO -> ReportSeverity.INFO
                    else -> ReportSeverity.DEBUG
                }

                if (reportSeverity.code <= mySeverity) {
                    servicesFacade.report(ReportCategory.COMPILER_MESSAGE, reportSeverity, message, location)
                }
            }
        }' @ [39:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'severity' @ [39:15] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'OUTPUT' @ [40:37] ==> enum entry OUTPUT defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'servicesFacade' @ [41:17] ==> private final val servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

'report' @ [41:32] ==> public fun CompilerServicesFacadeBase.report(category: ReportCategory, severity: ReportSeverity, message: String? = ..., attachment: Serializable? = ...): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'ReportCategory' @ [41:39] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'OUTPUT_MESSAGE' @ [41:54] ==> enum entry OUTPUT_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'ReportSeverity' @ [41:70] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [41:85] ==> enum entry ERROR defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'message' @ [41:92] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'EXCEPTION' @ [43:37] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'servicesFacade' @ [44:17] ==> private final val servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

'report' @ [44:32] ==> public fun CompilerServicesFacadeBase.report(category: ReportCategory, severity: ReportSeverity, message: String? = ..., attachment: Serializable? = ...): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'ReportCategory' @ [44:39] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'EXCEPTION' @ [44:54] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'ReportSeverity' @ [44:65] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [44:80] ==> enum entry ERROR defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'message' @ [44:87] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'when (severity) {
                    CompilerMessageSeverity.ERROR -> ReportSeverity.ERROR
                    CompilerMessageSeverity.WARNING, CompilerMessageSeverity.STRONG_WARNING -> ReportSeverity.WARNING
                    CompilerMessageSeverity.INFO -> ReportSeverity.INFO
                    else -> ReportSeverity.DEBUG
                }' @ [47:38] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReportSeverity, entry1: ReportSeverity, entry2: ReportSeverity, entry3: ReportSeverity): ReportSeverity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReportSeverity

'severity' @ [47:44] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'ERROR' @ [48:45] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [48:54] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [48:69] ==> enum entry ERROR defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [49:45] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'STRONG_WARNING' @ [49:78] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [49:96] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [49:111] ==> enum entry WARNING defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [50:45] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [50:53] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [50:68] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [51:29] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [51:44] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'reportSeverity' @ [54:21] ==> val reportSeverity: ReportSeverity defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[LocalVariableDescriptor]

'code' @ [54:36] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'mySeverity' @ [54:44] ==> private final val mySeverity: Int defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

'servicesFacade' @ [55:21] ==> private final val servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

'report' @ [55:36] ==> public fun CompilerServicesFacadeBase.report(category: ReportCategory, severity: ReportSeverity, message: String? = ..., attachment: Serializable? = ...): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'ReportCategory' @ [55:43] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'COMPILER_MESSAGE' @ [55:58] ==> enum entry COMPILER_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'reportSeverity' @ [55:76] ==> val reportSeverity: ReportSeverity defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[LocalVariableDescriptor]

'message' @ [55:92] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'location' @ [55:101] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'hasErrors' @ [60:9] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

'hasErrors' @ [60:21] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

'severity' @ [60:34] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector.report[ValueParameterDescriptorImpl]

'isError' @ [60:43] ==> public final val CompilerMessageSeverity.isError: Boolean[MyPropertyDescriptor]

'hasErrors' @ [63:41] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[PropertyDescriptorImpl]

