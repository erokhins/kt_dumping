'messageCollector' @ [32:82] ==> public abstract val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorBasedReporter[PropertyDescriptorImpl]

'report' @ [32:99] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'convertSeverity' @ [33:40] ==> public final fun convertSeverity(severity: Severity): CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[SimpleFunctionDescriptorImpl]

'diagnostic' @ [33:56] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorBasedReporter.report[ValueParameterDescriptorImpl]

'severity' @ [33:67] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'render' @ [34:13] ==> value-parameter render: String defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorBasedReporter.report[ValueParameterDescriptorImpl]

'psiFileToMessageLocation' @ [35:25] ==> @Nullable public open fun psiFileToMessageLocation(@NotNull file: PsiFile, @Nullable defaultValue: String?, @NotNull lineAndColumn: DiagnosticUtils.LineAndColumn): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.messages.MessageUtil[JavaMethodDescriptor]

'file' @ [35:50] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorBasedReporter.report[ValueParameterDescriptorImpl]

'file' @ [35:56] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorBasedReporter.report[ValueParameterDescriptorImpl]

'name' @ [35:61] ==> public final var PsiFile.name: String[MyPropertyDescriptor]

'getLineAndColumn' @ [35:83] ==> @NotNull public open fun getLineAndColumn(@NotNull p0: Diagnostic): DiagnosticUtils.LineAndColumn defined in org.jetbrains.kotlin.diagnostics.DiagnosticUtils[JavaMethodDescriptor]

'diagnostic' @ [35:100] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.cli.common.messages.MessageCollectorBasedReporter.report[ValueParameterDescriptorImpl]

