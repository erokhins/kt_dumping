'reports' @ [28:9] ==> value-parameter reports: List<ScriptReport> defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.attachReports[ValueParameterDescriptorImpl]

'forEach' @ [28:17] ==> @HidesMembers public inline fun <T> Iterable<ScriptReport>.forEach(action: (ScriptReport) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptReport

'messageCollector' @ [29:13] ==> private final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink[PropertyDescriptorImpl]

'report' @ [29:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'it' @ [29:37] ==> value-parameter it: ScriptReport defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.attachReports.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [29:40] ==> public final val severity: ScriptReport.Severity defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedPropertyDescriptor]

'convertSeverity' @ [29:49] ==> private final fun ScriptReport.Severity.convertSeverity(): CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink[SimpleFunctionDescriptorImpl]

'it' @ [29:68] ==> value-parameter it: ScriptReport defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.attachReports.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [29:71] ==> public final val message: String defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedPropertyDescriptor]

'location' @ [29:80] ==> private final fun location(scriptFile: VirtualFile, position: ScriptReport.Position?): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink[SimpleFunctionDescriptorImpl]

'scriptFile' @ [29:89] ==> value-parameter scriptFile: VirtualFile defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.attachReports[ValueParameterDescriptorImpl]

'it' @ [29:101] ==> value-parameter it: ScriptReport defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.attachReports.<anonymous>[ValueParameterDescriptorImpl]

'position' @ [29:104] ==> public final val position: ScriptReport.Position? defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedPropertyDescriptor]

'position' @ [34:13] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.location[ValueParameterDescriptorImpl]

'CompilerMessageLocation' @ [34:38] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation[FakeCallableDescriptorForObject]

'create' @ [34:62] ==> @JvmStatic public final fun create(path: String?): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation.Companion[DeserializedSimpleFunctionDescriptor]

'scriptFile' @ [34:69] ==> value-parameter scriptFile: VirtualFile defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.location[ValueParameterDescriptorImpl]

'path' @ [34:80] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'CompilerMessageLocation' @ [36:16] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation[FakeCallableDescriptorForObject]

'create' @ [36:40] ==> @JvmStatic public final fun create(path: String?, line: Int, column: Int, lineContent: String?): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation.Companion[DeserializedSimpleFunctionDescriptor]

'scriptFile' @ [36:47] ==> value-parameter scriptFile: VirtualFile defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.location[ValueParameterDescriptorImpl]

'path' @ [36:58] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'position' @ [36:64] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.location[ValueParameterDescriptorImpl]

'startLine' @ [36:73] ==> public final val startLine: Int defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedPropertyDescriptor]

'position' @ [36:84] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.location[ValueParameterDescriptorImpl]

'startColumn' @ [36:93] ==> public final val startColumn: Int defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedPropertyDescriptor]

'when(this) {
        ScriptReport.Severity.ERROR -> CompilerMessageSeverity.ERROR
        ScriptReport.Severity.WARNING -> CompilerMessageSeverity.WARNING
        ScriptReport.Severity.INFO -> CompilerMessageSeverity.INFO
        ScriptReport.Severity.DEBUG -> CompilerMessageSeverity.LOGGING
    }' @ [39:84] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompilerMessageSeverity, entry1: CompilerMessageSeverity, entry2: CompilerMessageSeverity, entry3: CompilerMessageSeverity): CompilerMessageSeverity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CompilerMessageSeverity

'this' @ [39:89] ==> <this> defined in org.jetbrains.kotlin.cli.common.script.CliScriptReportSink.convertSeverity[ReceiverParameterDescriptorImpl]

'ERROR' @ [40:31] ==> enum entry ERROR defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'ERROR' @ [40:64] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [41:31] ==> enum entry WARNING defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'WARNING' @ [41:66] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'INFO' @ [42:31] ==> enum entry INFO defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'INFO' @ [42:63] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [43:31] ==> enum entry DEBUG defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'LOGGING' @ [43:64] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

