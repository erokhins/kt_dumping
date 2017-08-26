'CLITool<K2JSDceArguments>' @ [31:17] ==> public constructor CLITool<A : CommonToolArguments>() defined in org.jetbrains.kotlin.cli.common.CLITool[ClassConstructorDescriptorImpl]
Inferred types:
    <A : CommonToolArguments> -> K2JSDceArguments

'K2JSDceArguments' @ [32:56] ==> public constructor K2JSDceArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments[DeserializedClassConstructorDescriptor]

'File' @ [35:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'arguments' @ [35:28] ==> value-parameter arguments: K2JSDceArguments defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'outputDirectory' @ [35:38] ==> @Argument public final var outputDirectory: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments[DeserializedPropertyDescriptor]

'arguments' @ [36:21] ==> value-parameter arguments: K2JSDceArguments defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'freeArgs' @ [36:31] ==> public final var freeArgs: MutableList<String> defined in org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments[DeserializedPropertyDescriptor]

'map' @ [36:40] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> InputFile): List<InputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> InputFile

'arg' @ [37:25] ==> value-parameter arg: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[ValueParameterDescriptorImpl]

'split' @ [37:29] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparator' @ [37:40] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'parts' @ [38:29] ==> val parts: List<String> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'parts' @ [39:30] ==> val parts: List<String> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'getOrNull' @ [39:36] ==> public fun <T> List<String>.getOrNull(index: Int): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (!moduleName.isEmpty()) moduleName else File(inputName).nameWithoutExtension' @ [40:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [40:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleName' @ [40:43] ==> val moduleName: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [40:54] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'moduleName' @ [40:65] ==> val moduleName: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'File' @ [40:81] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'inputName' @ [40:86] ==> val inputName: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'nameWithoutExtension' @ [40:97] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'InputFile' @ [41:13] ==> public constructor InputFile(path: String, outputPath: String, moduleName: String? = ...) defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedClassConstructorDescriptor]

'inputName' @ [41:23] ==> val inputName: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'File' @ [41:34] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseDir' @ [41:39] ==> val baseDir: File defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'resolvedModuleName' @ [41:48] ==> val resolvedModuleName: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [41:76] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'resolvedModuleName' @ [41:90] ==> val resolvedModuleName: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[LocalVariableDescriptor]

'files' @ [44:13] ==> val files: List<InputFile> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'isEmpty' @ [44:19] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [44:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'arguments' @ [44:33] ==> value-parameter arguments: K2JSDceArguments defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'version' @ [44:43] ==> @Argument public final var version: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments[DeserializedPropertyDescriptor]

'messageCollector' @ [45:13] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'report' @ [45:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [45:61] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'COMPILATION_ERROR' @ [46:29] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkSourceFiles' @ [48:14] ==> private final fun checkSourceFiles(messageCollector: MessageCollector, files: List<InputFile>): Boolean defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce[SimpleFunctionDescriptorImpl]

'messageCollector' @ [48:31] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'files' @ [48:49] ==> val files: List<InputFile> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'COMPILATION_ERROR' @ [49:29] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'arguments' @ [52:36] ==> value-parameter arguments: K2JSDceArguments defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'declarationsToKeep' @ [52:46] ==> @Argument public final var declarationsToKeep: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments[DeserializedPropertyDescriptor]

'orEmpty' @ [52:65] ==> public inline fun <reified T> Array<out String>?.orEmpty(): Array<out String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'toSet' @ [52:75] ==> public fun <T> Array<out String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'DeadCodeElimination' @ [54:25] ==> public companion object defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination[FakeCallableDescriptorForObject]

'run' @ [54:45] ==> public final fun run(inputFiles: Collection<InputFile>, rootReachableNames: Set<String>, logConsumer: (String) -> Unit): DeadCodeEliminationResult defined in org.jetbrains.kotlin.js.dce.DeadCodeElimination.Companion[DeserializedSimpleFunctionDescriptor]

'files' @ [54:49] ==> val files: List<InputFile> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'includedDeclarations' @ [54:56] ==> val includedDeclarations: Set<String> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'messageCollector' @ [55:13] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'report' @ [55:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'LOGGING' @ [55:61] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'it' @ [55:70] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[ValueParameterDescriptorImpl]

'dceResult' @ [57:21] ==> val dceResult: DeadCodeEliminationResult defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'reachableNodes' @ [57:31] ==> public final val reachableNodes: Set<Context.Node> defined in org.jetbrains.kotlin.js.dce.DeadCodeEliminationResult[DeserializedPropertyDescriptor]

'if (arguments.printReachabilityInfo) CompilerMessageSeverity.INFO else CompilerMessageSeverity.LOGGING' @ [59:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompilerMessageSeverity, elseBranch: CompilerMessageSeverity): CompilerMessageSeverity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CompilerMessageSeverity

'arguments' @ [59:40] ==> value-parameter arguments: K2JSDceArguments defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'printReachabilityInfo' @ [59:50] ==> @Argument public final var printReachabilityInfo: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments[DeserializedPropertyDescriptor]

'INFO' @ [59:97] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'LOGGING' @ [59:131] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'messageCollector' @ [60:9] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'report' @ [60:26] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'reachabilitySeverity' @ [60:33] ==> val reachabilitySeverity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'nodes' @ [61:22] ==> val nodes: Set<Context.Node> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'extractRoots' @ [61:28] ==> public fun Set<Context.Node>.extractRoots(): Set<Context.Node> defined in org.jetbrains.kotlin.js.dce[DeserializedSimpleFunctionDescriptor]

'printTree' @ [62:13] ==> public fun printTree(root: Context.Node, consumer: (String) -> Unit, printNestedMembers: Boolean = ..., showLocations: Boolean = ...): Unit defined in org.jetbrains.kotlin.js.dce[DeserializedSimpleFunctionDescriptor]

'node' @ [62:23] ==> val node: Context.Node defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'messageCollector' @ [62:31] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[ValueParameterDescriptorImpl]

'report' @ [62:48] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'reachabilitySeverity' @ [62:55] ==> val reachabilitySeverity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl[LocalVariableDescriptor]

'it' @ [62:77] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.execImpl.<anonymous>[ValueParameterDescriptorImpl]

'OK' @ [66:25] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'files' @ [70:16] ==> value-parameter files: List<InputFile> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles[ValueParameterDescriptorImpl]

'fold' @ [70:22] ==> public inline fun <T, R> Iterable<InputFile>.fold(initial: Boolean, operation: (acc: Boolean, InputFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InputFile
    <R> -> Boolean

'File' @ [71:29] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [71:34] ==> value-parameter file: InputFile defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [71:39] ==> public final val path: String defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedPropertyDescriptor]

'File' @ [72:30] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [72:35] ==> value-parameter file: InputFile defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'outputPath' @ [72:40] ==> public final val outputPath: String defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedPropertyDescriptor]

'when {
                !inputFile.exists() -> {
                    messageCollector.report(CompilerMessageSeverity.ERROR, "source file or directory not found: " + file.path)
                    false
                }
                inputFile.isDirectory -> {
                    messageCollector.report(CompilerMessageSeverity.ERROR, "input file '" + file.path + "' is a directory")
                    false
                }
                else -> true
            }' @ [74:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'!' @ [75:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inputFile' @ [75:18] ==> val inputFile: File defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[LocalVariableDescriptor]

'exists' @ [75:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'messageCollector' @ [76:21] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles[ValueParameterDescriptorImpl]

'report' @ [76:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [76:69] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'+' @ [76:76] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [76:117] ==> value-parameter file: InputFile defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [76:122] ==> public final val path: String defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedPropertyDescriptor]

'inputFile' @ [79:17] ==> val inputFile: File defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[LocalVariableDescriptor]

'isDirectory' @ [79:27] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'messageCollector' @ [80:21] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles[ValueParameterDescriptorImpl]

'report' @ [80:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [80:69] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'+' @ [80:76] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [80:93] ==> value-parameter file: InputFile defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [80:98] ==> public final val path: String defined in org.jetbrains.kotlin.js.dce.InputFile[DeserializedPropertyDescriptor]

'when {
                outputFile.exists() && outputFile.isDirectory -> {
                    messageCollector.report(CompilerMessageSeverity.ERROR, "cannot open output file '${outputFile.path}': is a directory")
                    false
                }
                else -> true
            }' @ [86:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'outputFile' @ [87:17] ==> val outputFile: File defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[LocalVariableDescriptor]

'exists' @ [87:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'outputFile' @ [87:40] ==> val outputFile: File defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[LocalVariableDescriptor]

'isDirectory' @ [87:51] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'messageCollector' @ [88:21] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles[ValueParameterDescriptorImpl]

'report' @ [88:38] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'ERROR' @ [88:69] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'outputFile' @ [88:104] ==> val outputFile: File defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[LocalVariableDescriptor]

'path' @ [88:115] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'ok' @ [94:13] ==> value-parameter ok: Boolean defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[ValueParameterDescriptorImpl]

'inputOk' @ [94:20] ==> val inputOk: Boolean defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[LocalVariableDescriptor]

'outputOk' @ [94:32] ==> val outputOk: Boolean defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.checkSourceFiles.<anonymous>[LocalVariableDescriptor]

'JvmStatic' @ [101:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'CLITool' @ [103:13] ==> public companion object defined in org.jetbrains.kotlin.cli.common.CLITool[FakeCallableDescriptorForObject]

'doMain' @ [103:21] ==> @JvmStatic public final fun doMain(compiler: CLITool<*>, args: Array<String>): Unit defined in org.jetbrains.kotlin.cli.common.CLITool.Companion[SimpleFunctionDescriptorImpl]

'K2JSDce' @ [103:28] ==> public constructor K2JSDce() defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce[ClassConstructorDescriptorImpl]

'args' @ [103:39] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.cli.js.dce.K2JSDce.Companion.main[ValueParameterDescriptorImpl]

