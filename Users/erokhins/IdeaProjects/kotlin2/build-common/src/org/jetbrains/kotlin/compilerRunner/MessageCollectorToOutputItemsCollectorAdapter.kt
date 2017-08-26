'delegate' @ [27:25] ==> value-parameter delegate: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter.<init>[ValueParameterDescriptorImpl]

'parseOutputMessage' @ [30:27] ==> @Nullable public open fun parseOutputMessage(@NotNull p0: String): OutputMessageUtil.Output? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'message' @ [30:46] ==> value-parameter message: String defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter.report[ValueParameterDescriptorImpl]

'let' @ [30:56] ==> @InlineOnly public inline fun <T, R> OutputMessageUtil.Output.let(block: (OutputMessageUtil.Output) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output
    <R> -> Unit

'outputCollector' @ [31:13] ==> private final val outputCollector: OutputItemsCollector defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter[PropertyDescriptorImpl]

'add' @ [31:29] ==> public abstract fun add(sourceFiles: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), outputFile: (File..File?)): Unit defined in org.jetbrains.kotlin.compilerRunner.OutputItemsCollector[JavaMethodDescriptor]

'it' @ [31:33] ==> value-parameter it: OutputMessageUtil.Output defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter.report.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [31:36] ==> @NotNull public final val sourceFiles: (MutableCollection<(File..File?)>..Collection<(File..File?)>) defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'it' @ [31:49] ==> value-parameter it: OutputMessageUtil.Output defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter.report.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [31:52] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'delegate' @ [33:9] ==> private final val delegate: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter[PropertyDescriptorImpl]

'report' @ [33:18] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'severity' @ [33:25] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter.report[ValueParameterDescriptorImpl]

'message' @ [33:35] ==> value-parameter message: String defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter.report[ValueParameterDescriptorImpl]

'location' @ [33:44] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter.report[ValueParameterDescriptorImpl]

