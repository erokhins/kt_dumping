'GenericReplChecker' @ [49:27] ==> public constructor GenericReplChecker(disposable: Disposable, scriptDefinition: KotlinScriptDefinition, compilerConfiguration: CompilerConfiguration, messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[ClassConstructorDescriptorImpl]

'disposable' @ [49:46] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.<init>[ValueParameterDescriptorImpl]

'scriptDefinition' @ [49:58] ==> protected final val scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'compilerConfiguration' @ [49:76] ==> protected final val compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'messageCollector' @ [49:99] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.<init>[ValueParameterDescriptorImpl]

'GenericReplCompilerState' @ [51:82] ==> public constructor GenericReplCompilerState(environment: KotlinCoreEnvironment, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[ClassConstructorDescriptorImpl]

'checker' @ [51:107] ==> private final val checker: GenericReplChecker defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'environment' @ [51:115] ==> internal final val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'lock' @ [51:128] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.createState[ValueParameterDescriptorImpl]

'checker' @ [53:94] ==> private final val checker: GenericReplChecker defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'check' @ [53:102] ==> public open fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[SimpleFunctionDescriptorImpl]

'state' @ [53:108] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.check[ValueParameterDescriptorImpl]

'codeLine' @ [53:115] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.check[ValueParameterDescriptorImpl]

'state' @ [56:9] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'lock' @ [56:15] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[DeserializedPropertyDescriptor]

'write' @ [56:20] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Nothing): Nothing defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'state' @ [57:33] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'asState' @ [57:39] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out GenericReplCompilerState>): GenericReplCompilerState defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <StateT : IReplStageState<*>> -> GenericReplCompilerState

'GenericReplCompilerState' @ [57:47] ==> public constructor GenericReplCompilerState(environment: KotlinCoreEnvironment, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[ClassConstructorDescriptorImpl]

'java' @ [57:79] ==> public val <T> KClass<GenericReplCompilerState>.java: Class<GenericReplCompilerState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenericReplCompilerState

'component1' @ [59:18] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [59:27] ==> public final operator fun component2(): DiagnosticMessageHolder defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'run' @ [59:42] ==> @InlineOnly public inline fun <T, R> GenericReplCompiler.run(block: GenericReplCompiler.() -> Pair<KtFile, DiagnosticMessageHolder>): Pair<KtFile, DiagnosticMessageHolder> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompiler
    <R> -> Pair<KtFile, DiagnosticMessageHolder>

'compilerState' @ [60:21] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'lastLineState' @ [60:35] ==> public final var lastLineState: GenericReplCheckerState.LineState? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'compilerState' @ [60:60] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'lastLineState' @ [60:74] ==> public final var lastLineState: GenericReplCheckerState.LineState? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'codeLine' @ [60:90] ==> public final val codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCheckerState.LineState[PropertyDescriptorImpl]

'codeLine' @ [60:102] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'checker' @ [61:31] ==> private final val checker: GenericReplChecker defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'check' @ [61:39] ==> public open fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[SimpleFunctionDescriptorImpl]

'state' @ [61:45] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'codeLine' @ [61:52] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'when (res) {
                        is ReplCheckResult.Incomplete -> return@compile ReplCompileResult.Incomplete()
                        is ReplCheckResult.Error -> return@compile ReplCompileResult.Error(res.message, res.location)
                        is ReplCheckResult.Ok -> {} // continue
                    }' @ [62:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'res' @ [62:27] ==> val res: ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ReplCompileResult' @ [63:73] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult[FakeCallableDescriptorForObject]

'Incomplete' @ [63:91] ==> public constructor Incomplete() defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Incomplete[DeserializedClassConstructorDescriptor]

'ReplCompileResult' @ [64:68] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult[FakeCallableDescriptorForObject]

'Error' @ [64:86] ==> public constructor Error(message: String, location: CompilerMessageLocation? = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[DeserializedClassConstructorDescriptor]

'res' @ [64:92] ==> val res: ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [64:96] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult.Error[DeserializedPropertyDescriptor]

'res' @ [64:105] ==> val res: ReplCheckResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'location' @ [64:109] ==> public final val location: CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.repl.ReplCheckResult.Error[DeserializedPropertyDescriptor]

'Pair' @ [68:17] ==> public constructor Pair<out A, out B>(first: KtFile, second: DiagnosticMessageHolder) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KtFile
    <out B> -> DiagnosticMessageHolder

'compilerState' @ [68:22] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'lastLineState' @ [68:36] ==> public final var lastLineState: GenericReplCheckerState.LineState? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'psiFile' @ [68:52] ==> public final val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCheckerState.LineState[PropertyDescriptorImpl]

'compilerState' @ [68:61] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'lastLineState' @ [68:75] ==> public final var lastLineState: GenericReplCheckerState.LineState? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'errorHolder' @ [68:91] ==> public final val errorHolder: DiagnosticMessageHolder defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCheckerState.LineState[PropertyDescriptorImpl]

'ScriptDependenciesProvider' @ [71:35] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[FakeCallableDescriptorForObject]

'getInstance' @ [71:62] ==> public final fun getInstance(project: Project): ScriptDependenciesProvider defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider.Companion[DeserializedSimpleFunctionDescriptor]

'checker' @ [71:74] ==> private final val checker: GenericReplChecker defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'environment' @ [71:82] ==> internal final val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'project' @ [71:94] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[PropertyDescriptorImpl]

'getScriptDependencies' @ [71:103] ==> public open fun getScriptDependencies(file: PsiFile): ScriptDependencies? defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[DeserializedSimpleFunctionDescriptor]

'psiFile' @ [71:125] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'compilerState' @ [73:17] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'lastDependencies' @ [73:31] ==> public final var lastDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'newDependencies' @ [73:51] ==> val newDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'compilerState' @ [74:17] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'lastDependencies' @ [74:31] ==> public final var lastDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'newDependencies' @ [74:50] ==> val newDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'classpathAddendum' @ [75:17] ==> var classpathAddendum: List<File>? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'newDependencies' @ [75:37] ==> val newDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'let' @ [75:54] ==> @InlineOnly public inline fun <T, R> ScriptDependencies.let(block: (ScriptDependencies) -> List<File>?): List<File>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> List<File>?

'checker' @ [75:60] ==> private final val checker: GenericReplChecker defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'environment' @ [75:68] ==> internal final val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplChecker[PropertyDescriptorImpl]

'updateClasspath' @ [75:80] ==> public final fun updateClasspath(contentRoots: List<ContentRoot>): List<File>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[SimpleFunctionDescriptorImpl]

'it' @ [75:96] ==> value-parameter it: ScriptDependencies defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'classpath' @ [75:99] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'map' @ [75:109] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> JvmClasspathRoot): List<JvmClasspathRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> JvmClasspathRoot

'compilerState' @ [78:34] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'analyzerEngine' @ [78:48] ==> public final val analyzerEngine: ReplCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'analyzeReplLine' @ [78:63] ==> public final fun analyzeReplLine(psiFile: KtFile, codeLine: ReplCodeLine): ReplCodeAnalyzer.ReplLineAnalysisResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer[SimpleFunctionDescriptorImpl]

'psiFile' @ [78:79] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'codeLine' @ [78:88] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'AnalyzerWithCompilerReport' @ [79:13] ==> public companion object defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport[FakeCallableDescriptorForObject]

'reportDiagnostics' @ [79:40] ==> public final fun reportDiagnostics(unsortedDiagnostics: Diagnostics, reporter: DiagnosticMessageReporter): AnalyzerWithCompilerReport.Companion.ReportDiagnosticsResult defined in org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.Companion[SimpleFunctionDescriptorImpl]

'analysisResult' @ [79:58] ==> val analysisResult: ReplCodeAnalyzer.ReplLineAnalysisResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'diagnostics' @ [79:73] ==> public abstract val diagnostics: Diagnostics defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer.ReplLineAnalysisResult[PropertyDescriptorImpl]

'errorHolder' @ [79:86] ==> val errorHolder: DiagnosticMessageHolder defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'when (analysisResult) {
                is ReplCodeAnalyzer.ReplLineAnalysisResult.WithErrors -> return ReplCompileResult.Error(errorHolder.renderedDiagnostics)
                is ReplCodeAnalyzer.ReplLineAnalysisResult.Successful -> analysisResult.scriptDescriptor
                else -> error("Unexpected result ${analysisResult::class.java}")
            }' @ [80:36] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ScriptDescriptor, entry1: ScriptDescriptor, entry2: ScriptDescriptor): ScriptDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ScriptDescriptor

'analysisResult' @ [80:42] ==> val analysisResult: ReplCodeAnalyzer.ReplLineAnalysisResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'ReplCompileResult' @ [81:81] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult[FakeCallableDescriptorForObject]

'Error' @ [81:99] ==> public constructor Error(message: String, location: CompilerMessageLocation? = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[DeserializedClassConstructorDescriptor]

'errorHolder' @ [81:105] ==> val errorHolder: DiagnosticMessageHolder defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'renderedDiagnostics' @ [81:117] ==> public abstract val renderedDiagnostics: String defined in org.jetbrains.kotlin.cli.jvm.repl.messages.DiagnosticMessageHolder[PropertyDescriptorImpl]

'analysisResult' @ [82:74] ==> val analysisResult: ReplCodeAnalyzer.ReplLineAnalysisResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'scriptDescriptor' @ [82:89] ==> public open val scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer.ReplLineAnalysisResult.Successful[PropertyDescriptorImpl]

'error' @ [83:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'analysisResult' @ [83:52] ==> val analysisResult: ReplCodeAnalyzer.ReplLineAnalysisResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'java' @ [83:74] ==> public val <T> KClass<out ReplCodeAnalyzer.ReplLineAnalysisResult>.java: Class<out ReplCodeAnalyzer.ReplLineAnalysisResult> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReplLineAnalysisResult

'GenerationState' @ [86:35] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'psiFile' @ [87:21] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'project' @ [87:29] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'binaries' @ [88:43] ==> @NotNull public open fun binaries(p0: Boolean): ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.ClassBuilderFactories[JavaMethodDescriptor]

'compilerState' @ [89:21] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'analyzerEngine' @ [89:35] ==> public final val analyzerEngine: ReplCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'module' @ [89:50] ==> public final val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer[PropertyDescriptorImpl]

'compilerState' @ [90:21] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'analyzerEngine' @ [90:35] ==> public final val analyzerEngine: ReplCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'trace' @ [90:50] ==> public final val trace: BindingTraceContext defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer[PropertyDescriptorImpl]

'bindingContext' @ [90:56] ==> public final val BindingTraceContext.bindingContext: BindingContext[MyPropertyDescriptor]

'listOf' @ [91:21] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'psiFile' @ [91:28] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'compilerConfiguration' @ [92:21] ==> protected final val compilerConfiguration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[PropertyDescriptorImpl]

'generationState' @ [94:13] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'replSpecific' @ [94:29] ==> public final val replSpecific: GenerationState.ForRepl defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'scriptResultFieldName' @ [94:42] ==> public final var scriptResultFieldName: String? defined in org.jetbrains.kotlin.codegen.state.GenerationState.ForRepl[DeserializedPropertyDescriptor]

'SCRIPT_RESULT_FIELD_NAME' @ [94:66] ==> private final val SCRIPT_RESULT_FIELD_NAME: String defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.Companion[PropertyDescriptorImpl]

'generationState' @ [95:13] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'replSpecific' @ [95:29] ==> public final val replSpecific: GenerationState.ForRepl defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'earlierScriptsForReplInterpreter' @ [95:42] ==> public final var earlierScriptsForReplInterpreter: List<ScriptDescriptor>? defined in org.jetbrains.kotlin.codegen.state.GenerationState.ForRepl[DeserializedPropertyDescriptor]

'compilerState' @ [95:77] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'history' @ [95:91] ==> public open val history: ReplCompilerStageHistory defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'map' @ [95:99] ==> public inline fun <T, R> Iterable<ReplHistoryRecord<ScriptDescriptor>>.map(transform: (ReplHistoryRecord<ScriptDescriptor>) -> ScriptDescriptor): List<ScriptDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<ScriptDescriptor>
    <R> -> ScriptDescriptor

'it' @ [95:105] ==> value-parameter it: ReplHistoryRecord<ScriptDescriptor> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [95:108] ==> public final val item: ScriptDescriptor defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[DeserializedPropertyDescriptor]

'generationState' @ [96:13] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'beforeCompile' @ [96:29] ==> public final fun beforeCompile(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

'generatePackage' @ [97:33] ==> public open fun generatePackage(@NotNull p0: GenerationState, @NotNull p1: FqName, @NotNull p2: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>), @NotNull p3: CompilationErrorHandler): Unit defined in org.jetbrains.kotlin.codegen.KotlinCodegenFacade[JavaMethodDescriptor]

'generationState' @ [98:21] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'psiFile' @ [99:21] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'script' @ [99:29] ==> public final val KtFile.script: KtScript?[MyPropertyDescriptor]

'containingKtFile' @ [99:38] ==> public final val KtScript.containingKtFile: KtFile[MyPropertyDescriptor]

'packageFqName' @ [99:55] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'setOf' @ [100:21] ==> public fun <T> setOf(element: KtFile): Set<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'psiFile' @ [100:27] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'script' @ [100:35] ==> public final val KtFile.script: KtScript?[MyPropertyDescriptor]

'containingKtFile' @ [100:44] ==> public final val KtScript.containingKtFile: KtFile[MyPropertyDescriptor]

'THROW_EXCEPTION' @ [101:74] ==> public final val THROW_EXCEPTION: (CompilationErrorHandler..CompilationErrorHandler?) defined in org.jetbrains.kotlin.codegen.CompilationErrorHandler[JavaPropertyDescriptor]

'makeScriptBaseName' @ [103:38] ==> public fun makeScriptBaseName(codeLine: ReplCodeLine): String defined in org.jetbrains.kotlin.cli.common.repl[DeserializedSimpleFunctionDescriptor]

'codeLine' @ [103:57] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'compilerState' @ [104:13] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'history' @ [104:27] ==> public open val history: ReplCompilerStageHistory defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'push' @ [104:35] ==> public open fun push(id: ILineId, item: ScriptDescriptor): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[DeserializedSimpleFunctionDescriptor]

'LineId' @ [104:40] ==> public constructor LineId(codeLine: ReplCodeLine) defined in org.jetbrains.kotlin.cli.common.repl.LineId[DeserializedClassConstructorDescriptor]

'codeLine' @ [104:47] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'scriptDescriptor' @ [104:58] ==> val scriptDescriptor: ScriptDescriptor defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'psiFile' @ [106:30] ==> val psiFile: KtFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'getChildOfType' @ [106:38] ==> public inline fun <reified T : PsiElement> PsiElement.getChildOfType(): KtScript? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtScript

'getChildOfType' @ [107:21] ==> public inline fun <reified T : PsiElement> PsiElement.getChildOfType(): KtBlockExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBlockExpression

'getChildOfType' @ [108:21] ==> public inline fun <reified T : PsiElement> PsiElement.getChildOfType(): KtScriptInitializer? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtScriptInitializer

'getChildOfType' @ [109:21] ==> public inline fun <reified T : PsiElement> PsiElement.getChildOfType(): KtExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expression' @ [111:24] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'let' @ [111:36] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'compilerState' @ [112:17] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'analyzerEngine' @ [112:31] ==> public final val analyzerEngine: ReplCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'trace' @ [112:46] ==> public final val trace: BindingTraceContext defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer[PropertyDescriptorImpl]

'bindingContext' @ [112:52] ==> public final val BindingTraceContext.bindingContext: BindingContext[MyPropertyDescriptor]

'getType' @ [112:67] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [112:75] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [113:16] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> String

'DescriptorRenderer' @ [114:17] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [114:36] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [114:54] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [114:65] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ReplCompileResult' @ [117:20] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult[FakeCallableDescriptorForObject]

'CompiledClasses' @ [117:38] ==> public constructor CompiledClasses(lineId: LineId, previousLines: List<ILineId>, mainClassName: String, classes: List<CompiledClassData>, hasResult: Boolean, classpathAddendum: List<File>, type: String?) defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[DeserializedClassConstructorDescriptor]

'LineId' @ [117:54] ==> public constructor LineId(codeLine: ReplCodeLine) defined in org.jetbrains.kotlin.cli.common.repl.LineId[DeserializedClassConstructorDescriptor]

'codeLine' @ [117:61] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile[ValueParameterDescriptorImpl]

'compilerState' @ [118:54] ==> val compilerState: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'history' @ [118:68] ==> public open val history: ReplCompilerStageHistory defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'map' @ [118:76] ==> public inline fun <T, R> Iterable<ReplHistoryRecord<ScriptDescriptor>>.map(transform: (ReplHistoryRecord<ScriptDescriptor>) -> ILineId): List<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<ScriptDescriptor>
    <R> -> ILineId

'it' @ [118:82] ==> value-parameter it: ReplHistoryRecord<ScriptDescriptor> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [118:85] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[DeserializedPropertyDescriptor]

'generatedClassname' @ [119:54] ==> val generatedClassname: String defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'generationState' @ [120:54] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'factory' @ [120:70] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'asList' @ [120:78] ==> @NotNull public open fun asList(): List<OutputFile> defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'map' @ [120:87] ==> public inline fun <T, R> Iterable<OutputFile>.map(transform: (OutputFile) -> CompiledClassData): List<CompiledClassData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R> -> CompiledClassData

'CompiledClassData' @ [120:93] ==> public constructor CompiledClassData(path: String, bytes: ByteArray) defined in org.jetbrains.kotlin.cli.common.repl.CompiledClassData[DeserializedClassConstructorDescriptor]

'it' @ [120:111] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [120:114] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'it' @ [120:128] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asByteArray' @ [120:131] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'generationState' @ [121:54] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'replSpecific' @ [121:70] ==> public final val replSpecific: GenerationState.ForRepl defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'hasResult' @ [121:83] ==> public final var hasResult: Boolean defined in org.jetbrains.kotlin.codegen.state.GenerationState.ForRepl[DeserializedPropertyDescriptor]

'classpathAddendum' @ [122:54] ==> var classpathAddendum: List<File>? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [122:75] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'type' @ [123:54] ==> val type: String? defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler.compile.<anonymous>[LocalVariableDescriptor]

