'run' @ [51:32] ==> @InlineOnly public inline fun <T, R> GenericReplChecker.run(block: GenericReplChecker.() -> KotlinCoreEnvironment): KotlinCoreEnvironment defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplChecker
    <R> -> KotlinCoreEnvironment

'compilerConfiguration' @ [52:9] ==> public final val compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'apply' @ [52:31] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: CompilerConfiguration.() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'add' @ [53:13] ==> public open fun <T : (Any..Any?)> add(@NotNull p0: CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>, @NotNull p1: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinScriptDefinition

'SCRIPT_DEFINITIONS' @ [53:38] ==> public final val SCRIPT_DEFINITIONS: (CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>..CompilerConfigurationKey<(MutableList<(KotlinScriptDefinition..KotlinScriptDefinition?)>..List<(KotlinScriptDefinition..KotlinScriptDefinition?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'scriptDefinition' @ [53:58] ==> public final val scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'put' @ [54:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [54:56] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'messageCollector' @ [54:79] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.<init>[ValueParameterDescriptorImpl]

'put' @ [55:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'RETAIN_OUTPUT_IN_MEMORY' @ [55:38] ==> public final val RETAIN_OUTPUT_IN_MEMORY: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'get' @ [57:17] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(JvmTarget..JvmTarget?)>): JvmTarget? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmTarget

'JVM_TARGET' @ [57:42] ==> public final val JVM_TARGET: (CompilerConfigurationKey<(JvmTarget..JvmTarget?)>..CompilerConfigurationKey<(JvmTarget..JvmTarget?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'put' @ [58:17] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(JvmTarget..JvmTarget?)>, @NotNull p1: JvmTarget): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmTarget

'JVM_TARGET' @ [58:42] ==> public final val JVM_TARGET: (CompilerConfigurationKey<(JvmTarget..JvmTarget?)>..CompilerConfigurationKey<(JvmTarget..JvmTarget?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'?:' @ [59:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JvmTarget?, right: JvmTarget): JvmTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JvmTarget

'getProperty' @ [59:28] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_REPL_JVM_TARGET_PROPERTY' @ [59:40] ==> public const val KOTLIN_REPL_JVM_TARGET_PROPERTY: String defined in org.jetbrains.kotlin.cli.jvm.repl in file GenericReplChecker.kt[PropertyDescriptorImpl]

'let' @ [59:74] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> JvmTarget?): JvmTarget? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> JvmTarget?

'JvmTarget' @ [59:80] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'fromString' @ [59:90] ==> @JvmStatic public final fun fromString(string: String): JvmTarget? defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [59:101] ==> value-parameter it: String defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.environment.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (getJavaVersion() >= 0x10008) JvmTarget.JVM_1_8 else JvmTarget.JVM_1_6' @ [60:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JvmTarget, elseBranch: JvmTarget): JvmTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JvmTarget

'getJavaVersion' @ [60:28] ==> private fun getJavaVersion(): Int defined in org.jetbrains.kotlin.cli.jvm.repl in file GenericReplChecker.kt[SimpleFunctionDescriptorImpl]

'JvmTarget' @ [60:57] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_8' @ [60:67] ==> enum entry JVM_1_8 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JvmTarget' @ [60:80] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_6' @ [60:90] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'KotlinCoreEnvironment' @ [63:9] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForProduction' @ [63:31] ==> @JvmStatic public final fun createForProduction(parentDisposable: Disposable, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[SimpleFunctionDescriptorImpl]

'disposable' @ [63:51] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.<init>[ValueParameterDescriptorImpl]

'compilerConfiguration' @ [63:63] ==> public final val compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'JVM_CONFIG_FILES' @ [63:109] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'getInstance' @ [66:69] ==> public open fun getInstance(p0: (Project..Project?)): (PsiFileFactory..PsiFileFactory?) defined in com.intellij.psi.PsiFileFactory[JavaMethodDescriptor]

'environment' @ [66:81] ==> internal final val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'project' @ [66:93] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'ReplTerminalDiagnosticMessageHolder' @ [68:45] ==> public constructor ReplTerminalDiagnosticMessageHolder() defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplTerminalDiagnosticMessageHolder[ClassConstructorDescriptorImpl]

'state' @ [71:9] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check[ValueParameterDescriptorImpl]

'lock' @ [71:15] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[DeserializedPropertyDescriptor]

'write' @ [71:20] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Nothing): Nothing defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'state' @ [72:32] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check[ValueParameterDescriptorImpl]

'asState' @ [72:38] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out GenericReplCheckerState>): GenericReplCheckerState defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <StateT : IReplStageState<*>> -> GenericReplCheckerState

'GenericReplCheckerState' @ [72:46] ==> public constructor GenericReplCheckerState() defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCheckerState[ClassConstructorDescriptorImpl]

'java' @ [72:77] ==> public val <T> KClass<GenericReplCheckerState>.java: Class<GenericReplCheckerState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenericReplCheckerState

'makeScriptBaseName' @ [73:34] ==> public fun makeScriptBaseName(codeLine: ReplCodeLine): String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedSimpleFunctionDescriptor]

'codeLine' @ [73:53] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check[ValueParameterDescriptorImpl]

'LightVirtualFile' @ [75:21] ==> public constructor LightVirtualFile(@NotNull p0: String, p1: (Language..Language?), @NotNull p2: CharSequence) defined in com.intellij.testFramework.LightVirtualFile[JavaClassConstructorDescriptor]

'scriptFileName' @ [75:40] ==> val scriptFileName: String defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'KotlinParserDefinition' @ [75:56] ==> public companion object defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition[FakeCallableDescriptorForObject]

'STD_SCRIPT_EXT' @ [75:79] ==> @field:JvmField public final val STD_SCRIPT_EXT: String defined in org.jetbrains.kotlin.parsing.KotlinParserDefinition.Companion[DeserializedPropertyDescriptor]

'INSTANCE' @ [75:112] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'convertLineSeparators' @ [75:133] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'codeLine' @ [75:155] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check[ValueParameterDescriptorImpl]

'code' @ [75:164] ==> public final val code: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedPropertyDescriptor]

'apply' @ [75:171] ==> @InlineOnly public inline fun <T> LightVirtualFile.apply(block: LightVirtualFile.() -> Unit): LightVirtualFile defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LightVirtualFile

'charset' @ [76:25] ==> public final var LightVirtualFile.charset: Charset[MyPropertyDescriptor]

'UTF8_CHARSET' @ [76:50] ==> public final val UTF8_CHARSET: (Charset..Charset?) defined in com.intellij.openapi.vfs.CharsetToolkit[JavaPropertyDescriptor]

'psiFileFactory' @ [78:35] ==> private final val psiFileFactory: PsiFileFactoryImpl defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'trySetupPsiForFile' @ [78:50] ==> @Nullable public open fun trySetupPsiForFile(@NotNull p0: LightVirtualFile, @NotNull p1: Language, p2: Boolean, p3: Boolean): PsiFile? defined in com.intellij.psi.impl.PsiFileFactoryImpl[JavaMethodDescriptor]

'virtualFile' @ [78:69] ==> val virtualFile: LightVirtualFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'INSTANCE' @ [78:97] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'error' @ [79:38] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'codeLine' @ [79:80] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check[ValueParameterDescriptorImpl]

'no' @ [79:89] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedPropertyDescriptor]

'codeLine' @ [79:96] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check[ValueParameterDescriptorImpl]

'code' @ [79:105] ==> public final val code: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedPropertyDescriptor]

'createDiagnosticHolder' @ [81:31] ==> internal final fun createDiagnosticHolder(): ReplTerminalDiagnosticMessageHolder defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[SimpleFunctionDescriptorImpl]

'AnalyzerWithCompilerReport' @ [83:37] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[FakeCallableDescriptorForObject]

'reportSyntaxErrors' @ [83:64] ==> public final fun reportSyntaxErrors(file: PsiElement, reporter: DiagnosticMessageReporter): AnalyzerWithCompilerReport.SyntaxErrorReport defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[SimpleFunctionDescriptorImpl]

'psiFile' @ [83:83] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'errorHolder' @ [83:92] ==> val errorHolder: ReplTerminalDiagnosticMessageHolder defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'!' @ [85:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'syntaxErrorReport' @ [85:18] ==> val syntaxErrorReport: AnalyzerWithCompilerReport.SyntaxErrorReport defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'isHasErrors' @ [85:36] ==> public final val isHasErrors: Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.SyntaxErrorReport[PropertyDescriptorImpl]

'checkerState' @ [86:17] ==> val checkerState: GenericReplCheckerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'lastLineState' @ [86:30] ==> public final var lastLineState: GenericReplCheckerState.LineState? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCheckerState[PropertyDescriptorImpl]

'LineState' @ [86:70] ==> public constructor LineState(codeLine: ReplCodeLine, psiFile: KtFile, errorHolder: DiagnosticMessageHolder) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCheckerState.LineState[ClassConstructorDescriptorImpl]

'codeLine' @ [86:80] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check[ValueParameterDescriptorImpl]

'psiFile' @ [86:90] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'errorHolder' @ [86:99] ==> val errorHolder: ReplTerminalDiagnosticMessageHolder defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'when {
                syntaxErrorReport.isHasErrors && syntaxErrorReport.isAllErrorsAtEof -> ReplCheckResult.Incomplete()
                syntaxErrorReport.isHasErrors -> ReplCheckResult.Error(errorHolder.renderedDiagnostics)
                else -> ReplCheckResult.Ok()
            }' @ [89:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReplCheckResult, entry1: ReplCheckResult, entry2: ReplCheckResult): ReplCheckResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReplCheckResult

'syntaxErrorReport' @ [90:17] ==> val syntaxErrorReport: AnalyzerWithCompilerReport.SyntaxErrorReport defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'isHasErrors' @ [90:35] ==> public final val isHasErrors: Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.SyntaxErrorReport[PropertyDescriptorImpl]

'syntaxErrorReport' @ [90:50] ==> val syntaxErrorReport: AnalyzerWithCompilerReport.SyntaxErrorReport defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'isAllErrorsAtEof' @ [90:68] ==> public final val isAllErrorsAtEof: Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.SyntaxErrorReport[PropertyDescriptorImpl]

'ReplCheckResult' @ [90:88] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult[FakeCallableDescriptorForObject]

'Incomplete' @ [90:104] ==> public constructor Incomplete() defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult.Incomplete[DeserializedClassConstructorDescriptor]

'syntaxErrorReport' @ [91:17] ==> val syntaxErrorReport: AnalyzerWithCompilerReport.SyntaxErrorReport defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'isHasErrors' @ [91:35] ==> public final val isHasErrors: Boolean defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.SyntaxErrorReport[PropertyDescriptorImpl]

'ReplCheckResult' @ [91:50] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult[FakeCallableDescriptorForObject]

'Error' @ [91:66] ==> public constructor Error(message: String, location: CompilerMessageLocation? = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult.Error[DeserializedClassConstructorDescriptor]

'errorHolder' @ [91:72] ==> val errorHolder: ReplTerminalDiagnosticMessageHolder defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker.check.<anonymous>[LocalVariableDescriptor]

'renderedDiagnostics' @ [91:84] ==> public open val renderedDiagnostics: String defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplTerminalDiagnosticMessageHolder[PropertyDescriptorImpl]

'ReplCheckResult' @ [92:25] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult[FakeCallableDescriptorForObject]

'Ok' @ [92:41] ==> public constructor Ok() defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult.Ok[DeserializedClassConstructorDescriptor]

'?:' @ [103:19] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getProperty' @ [103:26] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'default' @ [103:78] ==> val default: Int defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

'version' @ [104:22] ==> val version: String defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

'split' @ [104:30] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (components.size) {
            0 -> default
            1 -> components[0].toInt() * 0x10000
            else -> components[0].toInt() * 0x10000 + components[1].toInt()
        }' @ [106:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'components' @ [106:15] ==> val components: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

'size' @ [106:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'default' @ [107:18] ==> val default: Int defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

'components' @ [108:18] ==> val components: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

'toInt' @ [108:32] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'components' @ [109:21] ==> val components: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

'toInt' @ [109:35] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'components' @ [109:55] ==> val components: List<String> defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

'toInt' @ [109:69] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'default' @ [112:9] ==> val default: Int defined in org.jetbrains.kotlin.cli.jvm.repl.getJavaVersion[LocalVariableDescriptor]

