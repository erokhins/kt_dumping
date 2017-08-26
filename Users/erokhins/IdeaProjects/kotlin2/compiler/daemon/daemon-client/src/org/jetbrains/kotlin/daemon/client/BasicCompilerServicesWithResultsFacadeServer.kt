'SOCKET_ANY_FREE_PORT' @ [32:21] ==> public val SOCKET_ANY_FREE_PORT: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'UnicastRemoteObject' @ [34:5] ==> protected/*protected and package*/ constructor UnicastRemoteObject(p0: Int, p1: (RMIClientSocketFactory..RMIClientSocketFactory?), p2: (RMIServerSocketFactory..RMIServerSocketFactory?)) defined in java.rmi.server.UnicastRemoteObject[JavaClassConstructorDescriptor]

'port' @ [34:25] ==> value-parameter port: Int = ... defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer.<init>[ValueParameterDescriptorImpl]

'LoopbackNetworkInterface' @ [34:31] ==> public object LoopbackNetworkInterface defined in org.jetbrains.kotlin.daemon.common[FakeCallableDescriptorForObject]

'clientLoopbackSocketFactory' @ [34:56] ==> public final val clientLoopbackSocketFactory: LoopbackNetworkInterface.ClientLoopbackSocketFactory defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[DeserializedPropertyDescriptor]

'LoopbackNetworkInterface' @ [34:85] ==> public object LoopbackNetworkInterface defined in org.jetbrains.kotlin.daemon.common[FakeCallableDescriptorForObject]

'serverLoopbackSocketFactory' @ [34:110] ==> public final val serverLoopbackSocketFactory: LoopbackNetworkInterface.ServerLoopbackSocketFactory defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[DeserializedPropertyDescriptor]

'messageCollector' @ [37:9] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer[PropertyDescriptorImpl]

'reportFromDaemon' @ [37:26] ==> public fun MessageCollector.reportFromDaemon(outputsCollector: ((File, List<File>) -> Unit)?, category: Int, severity: Int, message: String?, attachment: Serializable?): Unit defined in org.jetbrains.kotlin.daemon.client[SimpleFunctionDescriptorImpl]

'outputsCollector' @ [37:43] ==> public final val outputsCollector: ((File, List<File>) -> Unit)? defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer[PropertyDescriptorImpl]

'category' @ [37:61] ==> value-parameter category: Int defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer.report[ValueParameterDescriptorImpl]

'severity' @ [37:71] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer.report[ValueParameterDescriptorImpl]

'message' @ [37:81] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer.report[ValueParameterDescriptorImpl]

'attachment' @ [37:90] ==> value-parameter attachment: Serializable? defined in org.jetbrains.kotlin.daemon.client.BasicCompilerServicesWithResultsFacadeServer.report[ValueParameterDescriptorImpl]

'ReportCategory' @ [42:26] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'fromCode' @ [42:41] ==> public final fun fromCode(code: Int): ReportCategory? defined in org.jetbrains.kotlin.daemon.common.ReportCategory.Companion[DeserializedSimpleFunctionDescriptor]

'category' @ [42:50] ==> value-parameter category: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'when (reportCategory) {
        ReportCategory.OUTPUT_MESSAGE -> {
            if (outputsCollector != null) {
                OutputMessageUtil.parseOutputMessage(message.orEmpty())?.let { outs ->
                    outs.outputFile?.let {
                        outputsCollector.invoke(it, outs.sourceFiles.toList())
                    }
                }
            }
            else {
                report(CompilerMessageSeverity.OUTPUT, message!!)
            }
        }
        ReportCategory.EXCEPTION -> {
            report(CompilerMessageSeverity.EXCEPTION, message.orEmpty())
        }
        ReportCategory.COMPILER_MESSAGE -> {
            val compilerSeverity = when (ReportSeverity.fromCode(severity)) {
                ReportSeverity.ERROR -> CompilerMessageSeverity.ERROR
                ReportSeverity.WARNING -> CompilerMessageSeverity.WARNING
                ReportSeverity.INFO -> CompilerMessageSeverity.INFO
                ReportSeverity.DEBUG -> CompilerMessageSeverity.LOGGING
                else -> throw IllegalStateException("Unexpected compiler message report severity $severity")
            }
            if (message != null) {
                report(compilerSeverity, message, attachment as? CompilerMessageLocation)
            }
            else {
                reportUnexpected(category, severity, message, attachment)
            }
        }
        ReportCategory.DAEMON_MESSAGE,
        ReportCategory.IC_MESSAGE -> {
            if (message != null) {
                report(CompilerMessageSeverity.LOGGING, message)
            }
            else {
                reportUnexpected(category, severity, message, attachment)
            }
        }
        else -> {
            reportUnexpected(category, severity, message, attachment)
        }
    }' @ [44:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?, entry3: Unit?, entry4: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'reportCategory' @ [44:11] ==> val reportCategory: ReportCategory? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[LocalVariableDescriptor]

'ReportCategory' @ [45:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'OUTPUT_MESSAGE' @ [45:24] ==> enum entry OUTPUT_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'if (outputsCollector != null) {
                OutputMessageUtil.parseOutputMessage(message.orEmpty())?.let { outs ->
                    outs.outputFile?.let {
                        outputsCollector.invoke(it, outs.sourceFiles.toList())
                    }
                }
            }
            else {
                report(CompilerMessageSeverity.OUTPUT, message!!)
            }' @ [46:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'outputsCollector' @ [46:17] ==> value-parameter outputsCollector: ((File, List<File>) -> Unit)? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'parseOutputMessage' @ [47:35] ==> @Nullable public open fun parseOutputMessage(@NotNull p0: String): OutputMessageUtil.Output? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil[JavaMethodDescriptor]

'message' @ [47:54] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'orEmpty' @ [47:62] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [47:74] ==> @InlineOnly public inline fun <T, R> OutputMessageUtil.Output.let(block: (OutputMessageUtil.Output) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Output
    <R> -> Unit?

'outs' @ [48:21] ==> value-parameter outs: OutputMessageUtil.Output defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon.<anonymous>[ValueParameterDescriptorImpl]

'outputFile' @ [48:26] ==> @Nullable public final val outputFile: File? defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'let' @ [48:38] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Unit

'outputsCollector' @ [49:25] ==> value-parameter outputsCollector: ((File, List<File>) -> Unit)? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'invoke' @ [49:42] ==> public abstract operator fun invoke(p1: File, p2: List<File>): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [49:49] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outs' @ [49:53] ==> value-parameter outs: OutputMessageUtil.Output defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon.<anonymous>[ValueParameterDescriptorImpl]

'sourceFiles' @ [49:58] ==> @NotNull public final val sourceFiles: (MutableCollection<(File..File?)>..Collection<(File..File?)>) defined in org.jetbrains.kotlin.cli.common.messages.OutputMessageUtil.Output[JavaPropertyDescriptor]

'toList' @ [49:70] ==> public fun <T> Iterable<(File..File?)>.toList(): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'report' @ [54:17] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'OUTPUT' @ [54:48] ==> enum entry OUTPUT defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [54:56] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'ReportCategory' @ [57:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'EXCEPTION' @ [57:24] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'report' @ [58:13] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'EXCEPTION' @ [58:44] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [58:55] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'orEmpty' @ [58:63] ==> @InlineOnly public inline fun String?.orEmpty(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'ReportCategory' @ [60:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'COMPILER_MESSAGE' @ [60:24] ==> enum entry COMPILER_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'when (ReportSeverity.fromCode(severity)) {
                ReportSeverity.ERROR -> CompilerMessageSeverity.ERROR
                ReportSeverity.WARNING -> CompilerMessageSeverity.WARNING
                ReportSeverity.INFO -> CompilerMessageSeverity.INFO
                ReportSeverity.DEBUG -> CompilerMessageSeverity.LOGGING
                else -> throw IllegalStateException("Unexpected compiler message report severity $severity")
            }' @ [61:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompilerMessageSeverity, entry1: CompilerMessageSeverity, entry2: CompilerMessageSeverity, entry3: CompilerMessageSeverity, entry4: CompilerMessageSeverity): CompilerMessageSeverity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CompilerMessageSeverity

'ReportSeverity' @ [61:42] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'fromCode' @ [61:57] ==> public final fun fromCode(code: Int): ReportSeverity? defined in org.jetbrains.kotlin.daemon.common.ReportSeverity.Companion[DeserializedSimpleFunctionDescriptor]

'severity' @ [61:66] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'ReportSeverity' @ [62:17] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [62:32] ==> enum entry ERROR defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [62:65] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [63:17] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [63:32] ==> enum entry WARNING defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [63:67] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [64:17] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [64:32] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [64:64] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [65:17] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'DEBUG' @ [65:32] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'LOGGING' @ [65:65] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'IllegalStateException' @ [66:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'severity' @ [66:99] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'if (message != null) {
                report(compilerSeverity, message, attachment as? CompilerMessageLocation)
            }
            else {
                reportUnexpected(category, severity, message, attachment)
            }' @ [68:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'message' @ [68:17] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'report' @ [69:17] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'compilerSeverity' @ [69:24] ==> val compilerSeverity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[LocalVariableDescriptor]

'message' @ [69:42] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'attachment' @ [69:51] ==> value-parameter attachment: Serializable? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'reportUnexpected' @ [72:17] ==> private fun MessageCollector.reportUnexpected(category: Int, severity: Int, message: String?, attachment: Serializable?): Unit defined in org.jetbrains.kotlin.daemon.client in file BasicCompilerServicesWithResultsFacadeServer.kt[SimpleFunctionDescriptorImpl]

'category' @ [72:34] ==> value-parameter category: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'severity' @ [72:44] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'message' @ [72:54] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'attachment' @ [72:63] ==> value-parameter attachment: Serializable? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'ReportCategory' @ [75:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'DAEMON_MESSAGE' @ [75:24] ==> enum entry DAEMON_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'ReportCategory' @ [76:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'IC_MESSAGE' @ [76:24] ==> enum entry IC_MESSAGE defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'if (message != null) {
                report(CompilerMessageSeverity.LOGGING, message)
            }
            else {
                reportUnexpected(category, severity, message, attachment)
            }' @ [77:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'message' @ [77:17] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'report' @ [78:17] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'LOGGING' @ [78:48] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'message' @ [78:57] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'reportUnexpected' @ [81:17] ==> private fun MessageCollector.reportUnexpected(category: Int, severity: Int, message: String?, attachment: Serializable?): Unit defined in org.jetbrains.kotlin.daemon.client in file BasicCompilerServicesWithResultsFacadeServer.kt[SimpleFunctionDescriptorImpl]

'category' @ [81:34] ==> value-parameter category: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'severity' @ [81:44] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'message' @ [81:54] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'attachment' @ [81:63] ==> value-parameter attachment: Serializable? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'reportUnexpected' @ [85:13] ==> private fun MessageCollector.reportUnexpected(category: Int, severity: Int, message: String?, attachment: Serializable?): Unit defined in org.jetbrains.kotlin.daemon.client in file BasicCompilerServicesWithResultsFacadeServer.kt[SimpleFunctionDescriptorImpl]

'category' @ [85:30] ==> value-parameter category: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'severity' @ [85:40] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'message' @ [85:50] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'attachment' @ [85:59] ==> value-parameter attachment: Serializable? defined in org.jetbrains.kotlin.daemon.client.reportFromDaemon[ValueParameterDescriptorImpl]

'when (ReportSeverity.fromCode(severity)) {
        ReportSeverity.ERROR -> CompilerMessageSeverity.ERROR
        ReportSeverity.WARNING -> CompilerMessageSeverity.WARNING
        ReportSeverity.INFO -> CompilerMessageSeverity.INFO
        else -> CompilerMessageSeverity.LOGGING
    }' @ [91:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompilerMessageSeverity, entry1: CompilerMessageSeverity, entry2: CompilerMessageSeverity, entry3: CompilerMessageSeverity): CompilerMessageSeverity[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CompilerMessageSeverity

'ReportSeverity' @ [91:41] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'fromCode' @ [91:56] ==> public final fun fromCode(code: Int): ReportSeverity? defined in org.jetbrains.kotlin.daemon.common.ReportSeverity.Companion[DeserializedSimpleFunctionDescriptor]

'severity' @ [91:65] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.reportUnexpected[ValueParameterDescriptorImpl]

'ReportSeverity' @ [92:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [92:24] ==> enum entry ERROR defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'ERROR' @ [92:57] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [93:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [93:24] ==> enum entry WARNING defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [93:59] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'ReportSeverity' @ [94:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [94:24] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'INFO' @ [94:56] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'LOGGING' @ [95:41] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'report' @ [98:5] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'compilerMessageSeverity' @ [98:12] ==> val compilerMessageSeverity: CompilerMessageSeverity defined in org.jetbrains.kotlin.daemon.client.reportUnexpected[LocalVariableDescriptor]

'category' @ [98:68] ==> value-parameter category: Int defined in org.jetbrains.kotlin.daemon.client.reportUnexpected[ValueParameterDescriptorImpl]

'severity' @ [98:88] ==> value-parameter severity: Int defined in org.jetbrains.kotlin.daemon.client.reportUnexpected[ValueParameterDescriptorImpl]

'message' @ [98:108] ==> value-parameter message: String? defined in org.jetbrains.kotlin.daemon.client.reportUnexpected[ValueParameterDescriptorImpl]

'attachment' @ [98:130] ==> value-parameter attachment: Serializable? defined in org.jetbrains.kotlin.daemon.client.reportUnexpected[ValueParameterDescriptorImpl]

