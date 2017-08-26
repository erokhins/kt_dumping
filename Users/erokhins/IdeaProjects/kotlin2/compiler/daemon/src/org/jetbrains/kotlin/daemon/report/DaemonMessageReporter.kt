'if (ReportCategory.DAEMON_MESSAGE.code in compilationOptions.reportCategories) {
            val mySeverity = ReportSeverity.fromCode(compilationOptions.reportSeverity)!!
            DaemonMessageReporterImpl(servicesFacade, mySeverity)
        }
        else {
            DummyDaemonMessageReporter
        }' @ [30:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DaemonMessageReporter, elseBranch: DaemonMessageReporter): DaemonMessageReporter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DaemonMessageReporter

'ReportCategory' @ [30:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'code' @ [30:43] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'compilationOptions' @ [30:51] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporter[ValueParameterDescriptorImpl]

'reportCategories' @ [30:70] ==> public final val reportCategories: Array<Int> defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedPropertyDescriptor]

'ReportSeverity' @ [31:30] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'fromCode' @ [31:45] ==> public final fun fromCode(code: Int): ReportSeverity? defined in org.jetbrains.kotlin.daemon.common.ReportSeverity.Companion[DeserializedSimpleFunctionDescriptor]

'compilationOptions' @ [31:54] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporter[ValueParameterDescriptorImpl]

'reportSeverity' @ [31:73] ==> public final val reportSeverity: Int defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedPropertyDescriptor]

'DaemonMessageReporterImpl' @ [32:13] ==> public constructor DaemonMessageReporterImpl(servicesFacade: CompilerServicesFacadeBase, mySeverity: ReportSeverity) defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterImpl[ClassConstructorDescriptorImpl]

'servicesFacade' @ [32:39] ==> value-parameter servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporter[ValueParameterDescriptorImpl]

'mySeverity' @ [32:55] ==> val mySeverity: ReportSeverity defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporter[LocalVariableDescriptor]

'DummyDaemonMessageReporter' @ [35:13] ==> private object DummyDaemonMessageReporter : DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.report in file DaemonMessageReporter.kt[FakeCallableDescriptorForObject]

'out' @ [40:9] ==> private final val out: PrintStream defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterPrintStreamAdapter[PropertyDescriptorImpl]

'print' @ [40:13] ==> public open fun print(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'severity' @ [40:45] ==> value-parameter severity: ReportSeverity defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterPrintStreamAdapter.report[ValueParameterDescriptorImpl]

'message' @ [40:56] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterPrintStreamAdapter.report[ValueParameterDescriptorImpl]

'severity' @ [49:13] ==> value-parameter severity: ReportSeverity defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterImpl.report[ValueParameterDescriptorImpl]

'code' @ [49:22] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'mySeverity' @ [49:30] ==> private final val mySeverity: ReportSeverity defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterImpl[PropertyDescriptorImpl]

'code' @ [49:41] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'servicesFacade' @ [50:13] ==> private final val servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterImpl[PropertyDescriptorImpl]

'report' @ [50:28] ==> public abstract fun report(category: Int, severity: Int, message: String?, attachment: Serializable?): Unit defined in org.jetbrains.kotlin.daemon.common.CompilerServicesFacadeBase[DeserializedSimpleFunctionDescriptor]

'ReportCategory' @ [50:35] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'code' @ [50:65] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[DeserializedPropertyDescriptor]

'severity' @ [50:71] ==> value-parameter severity: ReportSeverity defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterImpl.report[ValueParameterDescriptorImpl]

'code' @ [50:80] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[DeserializedPropertyDescriptor]

'message' @ [50:86] ==> value-parameter message: String defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterImpl.report[ValueParameterDescriptorImpl]

