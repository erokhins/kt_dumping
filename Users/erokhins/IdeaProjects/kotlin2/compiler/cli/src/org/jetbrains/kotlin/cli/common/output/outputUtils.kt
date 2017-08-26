'asList' @ [28:18] ==> public abstract fun asList(): List<OutputFile> defined in org.jetbrains.kotlin.backend.common.output.OutputFileCollection[DeserializedSimpleFunctionDescriptor]

'file' @ [29:23] ==> val file: OutputFile defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[LocalVariableDescriptor]

'sourceFiles' @ [29:28] ==> public abstract val sourceFiles: List<File> defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'File' @ [30:22] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outputDir' @ [30:27] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[ValueParameterDescriptorImpl]

'file' @ [30:38] ==> val file: OutputFile defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[LocalVariableDescriptor]

'relativePath' @ [30:43] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'report' @ [31:9] ==> value-parameter report: ((file: OutputFile, sources: List<File>, output: File) -> Unit)? defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[ValueParameterDescriptorImpl]

'invoke' @ [31:17] ==> public abstract operator fun invoke(file: @ParameterName OutputFile, sources: @ParameterName List<File>, output: @ParameterName File): Unit defined in kotlin.Function3[FunctionInvokeDescriptor]

'file' @ [31:24] ==> val file: OutputFile defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[LocalVariableDescriptor]

'sources' @ [31:30] ==> val sources: List<File> defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[LocalVariableDescriptor]

'output' @ [31:39] ==> val output: File defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[LocalVariableDescriptor]

'writeToFile' @ [32:18] ==> public open fun writeToFile(@NotNull p0: File, @NotNull p1: ByteArray): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'output' @ [32:30] ==> val output: File defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[LocalVariableDescriptor]

'file' @ [32:38] ==> val file: OutputFile defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[LocalVariableDescriptor]

'asByteArray' @ [32:43] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'writeAll' @ [37:5] ==> public fun OutputFileCollection.writeAll(outputDir: File, report: ((file: OutputFile, sources: List<File>, output: File) -> Unit)?): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils in file outputUtils.kt[SimpleFunctionDescriptorImpl]

'outputDir' @ [37:14] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAllTo[ValueParameterDescriptorImpl]

'if (!reportOutputFiles) writeAllTo(outputDir)
    else writeAll(outputDir) { _, sources, output ->
        messageCollector.report(CompilerMessageSeverity.OUTPUT, OutputMessageUtil.formatOutputMessage(sources, output))
    }' @ [41:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [41:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'reportOutputFiles' @ [41:10] ==> value-parameter reportOutputFiles: Boolean defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[ValueParameterDescriptorImpl]

'writeAllTo' @ [41:29] ==> public fun OutputFileCollection.writeAllTo(outputDir: File): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils in file outputUtils.kt[SimpleFunctionDescriptorImpl]

'outputDir' @ [41:40] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[ValueParameterDescriptorImpl]

'writeAll' @ [42:10] ==> public fun OutputFileCollection.writeAll(outputDir: File, report: ((file: OutputFile, sources: List<File>, output: File) -> Unit)?): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils in file outputUtils.kt[SimpleFunctionDescriptorImpl]

'outputDir' @ [42:19] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[ValueParameterDescriptorImpl]

'messageCollector' @ [43:9] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll[ValueParameterDescriptorImpl]

'report' @ [43:26] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'OUTPUT' @ [43:57] ==> enum entry OUTPUT defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'formatOutputMessage' @ [43:83] ==> @NotNull public open fun formatOutputMessage(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: (File..File?)): String defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'sources' @ [43:103] ==> value-parameter sources: List<File> defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll.<anonymous>[ValueParameterDescriptorImpl]

'output' @ [43:112] ==> value-parameter output: File defined in org.jetbrains.kotlin.cli.common.output.outputUtils.writeAll.<anonymous>[ValueParameterDescriptorImpl]

