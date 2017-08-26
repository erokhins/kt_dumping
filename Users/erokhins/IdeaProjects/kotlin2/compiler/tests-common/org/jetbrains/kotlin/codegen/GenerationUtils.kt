'JvmStatic' @ [33:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'compileFile' @ [35:13] ==> @JvmStatic public final fun compileFile(ktFile: KtFile, environment: KotlinCoreEnvironment): ClassFileFactory defined in org.jetbrains.kotlin.codegen.GenerationUtils[SimpleFunctionDescriptorImpl]

'ktFile' @ [35:25] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFileTo[ValueParameterDescriptorImpl]

'environment' @ [35:33] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFileTo[ValueParameterDescriptorImpl]

'apply' @ [35:46] ==> @InlineOnly public inline fun <T> ClassFileFactory.apply(block: ClassFileFactory.() -> Unit): ClassFileFactory defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassFileFactory

'writeAllTo' @ [36:17] ==> public fun OutputFileCollection.writeAllTo(outputDir: File): Unit defined in org.jetbrains.kotlin.cli.common.output.outputUtils[DeserializedSimpleFunctionDescriptor]

'output' @ [36:28] ==> value-parameter output: File defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFileTo[ValueParameterDescriptorImpl]

'JvmStatic' @ [39:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'compileFiles' @ [41:13] ==> @JvmStatic @JvmOverloads public final fun compileFiles(files: List<KtFile>, environment: KotlinCoreEnvironment, classBuilderFactory: ClassBuilderFactory = ...): GenerationState defined in org.jetbrains.kotlin.codegen.GenerationUtils[SimpleFunctionDescriptorImpl]

'listOf' @ [41:26] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'ktFile' @ [41:33] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFile[ValueParameterDescriptorImpl]

'environment' @ [41:42] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFile[ValueParameterDescriptorImpl]

'factory' @ [41:55] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'JvmStatic' @ [43:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [44:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'TEST' @ [48:78] ==> public final var TEST: (ClassBuilderFactory..ClassBuilderFactory?) defined in org.jetbrains.kotlin.codegen.ClassBuilderFactories[JavaPropertyDescriptor]

'compileFiles' @ [50:13] ==> @JvmStatic public final fun compileFiles(files: List<KtFile>, configuration: CompilerConfiguration, classBuilderFactory: ClassBuilderFactory, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider): GenerationState defined in org.jetbrains.kotlin.codegen.GenerationUtils[SimpleFunctionDescriptorImpl]

'files' @ [50:26] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'environment' @ [50:33] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'configuration' @ [50:45] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'classBuilderFactory' @ [50:60] ==> value-parameter classBuilderFactory: ClassBuilderFactory = ... defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'environment' @ [50:81] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'JvmStatic' @ [52:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmResolveUtil' @ [59:30] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy in file JvmResolveUtil.kt[FakeCallableDescriptorForObject]

'analyzeAndCheckForErrors' @ [59:45] ==> @JvmStatic public final fun analyzeAndCheckForErrors(project: Project, files: Collection<KtFile>, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'files' @ [59:70] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'first' @ [59:76] ==> public fun <T> List<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'project' @ [59:84] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'files' @ [59:93] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'configuration' @ [59:100] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'packagePartProvider' @ [59:115] ==> value-parameter packagePartProvider: (GlobalSearchScope) -> PackagePartProvider defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'analysisResult' @ [60:9] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[LocalVariableDescriptor]

'throwIfError' @ [60:24] ==> public final fun throwIfError(): Unit defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'GenerationState' @ [62:21] ==> @JvmOverloads public constructor GenerationState(project: Project, builderFactory: ClassBuilderFactory, module: ModuleDescriptor, bindingContext: BindingContext, files: List<KtFile>, configuration: CompilerConfiguration, generateDeclaredClassFilter: GenerationState.GenerateClassFilter = ..., codegenFactory: CodegenFactory = ..., targetId: TargetId? = ..., moduleName: String? = ..., outDirectory: File? = ..., onIndependentPartCompilationEnd: GenerationStateEventCallback = ..., wantsDiagnostics: Boolean = ...) defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedClassConstructorDescriptor]

'files' @ [63:17] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'first' @ [63:23] ==> public fun <T> List<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'project' @ [63:31] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'classBuilderFactory' @ [63:40] ==> value-parameter classBuilderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'analysisResult' @ [63:61] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[LocalVariableDescriptor]

'moduleDescriptor' @ [63:76] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'analysisResult' @ [63:94] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[LocalVariableDescriptor]

'bindingContext' @ [63:109] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'files' @ [64:17] ==> value-parameter files: List<KtFile> defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'configuration' @ [64:24] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'if (configuration.getBoolean(JVMConfigurationKeys.IR)) JvmIrCodegenFactory else DefaultCodegenFactory' @ [65:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodegenFactory, elseBranch: CodegenFactory): CodegenFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodegenFactory

'configuration' @ [65:38] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[ValueParameterDescriptorImpl]

'getBoolean' @ [65:52] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'IR' @ [65:84] ==> public final val IR: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmIrCodegenFactory' @ [65:89] ==> public object JvmIrCodegenFactory : CodegenFactory defined in org.jetbrains.kotlin.backend.jvm[FakeCallableDescriptorForObject]

'DefaultCodegenFactory' @ [65:114] ==> public object DefaultCodegenFactory : CodegenFactory defined in org.jetbrains.kotlin.codegen[FakeCallableDescriptorForObject]

'analysisResult' @ [67:13] ==> val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[LocalVariableDescriptor]

'shouldGenerateCode' @ [67:28] ==> public final val shouldGenerateCode: Boolean defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'compileCorrectFiles' @ [68:33] ==> public open fun compileCorrectFiles(@NotNull p0: GenerationState, @NotNull p1: CompilationErrorHandler): Unit defined in org.jetbrains.kotlin.codegen.KotlinCodegenFacade[JavaMethodDescriptor]

'state' @ [68:53] ==> val state: GenerationState defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[LocalVariableDescriptor]

'THROW_EXCEPTION' @ [68:84] ==> public final val THROW_EXCEPTION: (CompilationErrorHandler..CompilationErrorHandler?) defined in org.jetbrains.kotlin.codegen.CompilationErrorHandler[JavaPropertyDescriptor]

'throwExceptionOnErrors' @ [72:24] ==> public open fun throwExceptionOnErrors(p0: (Diagnostics..Diagnostics?)): Unit defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'state' @ [72:47] ==> val state: GenerationState defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[LocalVariableDescriptor]

'collectedExtraJvmDiagnostics' @ [72:53] ==> public final val collectedExtraJvmDiagnostics: Diagnostics defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'state' @ [73:16] ==> val state: GenerationState defined in org.jetbrains.kotlin.codegen.GenerationUtils.compileFiles[LocalVariableDescriptor]

