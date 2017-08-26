'JvmStatic' @ [33:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [34:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'emptyList' @ [35:89] ==> public fun <T> emptyList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'TopDownAnalyzerFacadeForJVM' @ [36:13] ==> public object TopDownAnalyzerFacadeForJVM defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'createContainer' @ [36:41] ==> public final fun createContainer(project: Project, files: Collection<KtFile>, trace: BindingTrace, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider, declarationProviderFactory: (StorageManager, Collection<KtFile>) -> DeclarationProviderFactory, sourceModuleSearchScope: GlobalSearchScope = ...): ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[DeserializedSimpleFunctionDescriptor]

'environment' @ [37:21] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.createContainer[ValueParameterDescriptorImpl]

'project' @ [37:33] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'files' @ [37:42] ==> value-parameter files: Collection<KtFile> = ... defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.createContainer[ValueParameterDescriptorImpl]

'NoScopeRecordCliBindingTrace' @ [37:80] ==> public constructor NoScopeRecordCliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.NoScopeRecordCliBindingTrace[DeserializedClassConstructorDescriptor]

'environment' @ [38:21] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.createContainer[ValueParameterDescriptorImpl]

'configuration' @ [38:33] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'Empty' @ [38:70] ==> public object Empty : PackagePartProvider defined in org.jetbrains.kotlin.descriptors.PackagePartProvider[FakeCallableDescriptorForObject]

'FileBasedDeclarationProviderFactory' @ [38:81] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull p0: StorageManager, @NotNull p1: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'JvmStatic' @ [41:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'analyzeAndCheckForErrors' @ [43:13] ==> @JvmStatic public final fun analyzeAndCheckForErrors(files: Collection<KtFile>, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'setOf' @ [43:38] ==> public fun <T> setOf(element: KtFile): Set<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [43:44] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'environment' @ [43:51] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'JvmStatic' @ [45:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'analyzeAndCheckForErrors' @ [47:13] ==> @JvmStatic public final fun analyzeAndCheckForErrors(project: Project, files: Collection<KtFile>, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'environment' @ [47:38] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'project' @ [47:50] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'files' @ [47:59] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'environment' @ [47:66] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'configuration' @ [47:78] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'environment' @ [47:93] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'createPackagePartProvider' @ [47:106] ==> public final fun createPackagePartProvider(scope: GlobalSearchScope): JvmPackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [49:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'files' @ [56:22] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'checkForSyntacticErrors' @ [57:28] ==> public open fun checkForSyntacticErrors(@NotNull p0: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'file' @ [57:52] ==> val file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[LocalVariableDescriptor]

'analyze' @ [60:16] ==> private final fun analyze(project: Project, files: Collection<KtFile>, configuration: CompilerConfiguration, packagePartProviderFactory: (GlobalSearchScope) -> PackagePartProvider): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'project' @ [60:24] ==> value-parameter project: Project defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'files' @ [60:33] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'configuration' @ [60:40] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'packagePartProvider' @ [60:55] ==> value-parameter packagePartProvider: (GlobalSearchScope) -> PackagePartProvider defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyzeAndCheckForErrors[ValueParameterDescriptorImpl]

'apply' @ [60:76] ==> @InlineOnly public inline fun <T> AnalysisResult.apply(block: AnalysisResult.() -> Unit): AnalysisResult defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnalysisResult

'throwExceptionOnErrors' @ [61:28] ==> public open fun throwExceptionOnErrors(p0: (BindingContext..BindingContext?)): Unit defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'bindingContext' @ [61:51] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'JvmStatic' @ [65:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'analyze' @ [67:13] ==> @JvmStatic public final fun analyze(files: Collection<KtFile>, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'emptySet' @ [67:21] ==> public fun <T> emptySet(): Set<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'environment' @ [67:33] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'JvmStatic' @ [69:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'analyze' @ [71:13] ==> @JvmStatic public final fun analyze(files: Collection<KtFile>, environment: KotlinCoreEnvironment): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'setOf' @ [71:21] ==> public fun <T> setOf(element: KtFile): Set<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [71:27] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'environment' @ [71:34] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'JvmStatic' @ [73:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'analyze' @ [75:13] ==> @JvmStatic public final fun analyze(files: Collection<KtFile>, environment: KotlinCoreEnvironment, configuration: CompilerConfiguration): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'files' @ [75:21] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'environment' @ [75:28] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'environment' @ [75:41] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'configuration' @ [75:53] ==> public final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'JvmStatic' @ [77:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'analyze' @ [79:13] ==> private final fun analyze(project: Project, files: Collection<KtFile>, configuration: CompilerConfiguration, packagePartProviderFactory: (GlobalSearchScope) -> PackagePartProvider): AnalysisResult defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[SimpleFunctionDescriptorImpl]

'environment' @ [79:21] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'project' @ [79:33] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'files' @ [79:42] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'configuration' @ [79:49] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'environment' @ [79:64] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'createPackagePartProvider' @ [79:77] ==> public final fun createPackagePartProvider(scope: GlobalSearchScope): JvmPackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'TopDownAnalyzerFacadeForJVM' @ [87:16] ==> public object TopDownAnalyzerFacadeForJVM defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'analyzeFilesWithJavaIntegration' @ [87:44] ==> @JvmStatic @JvmOverloads public final fun analyzeFilesWithJavaIntegration(project: Project, files: Collection<KtFile>, trace: BindingTrace, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider, declarationProviderFactory: (StorageManager, Collection<KtFile>) -> DeclarationProviderFactory = ..., sourceModuleSearchScope: GlobalSearchScope = ...): AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[DeserializedSimpleFunctionDescriptor]

'project' @ [88:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'files' @ [88:26] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'CliBindingTrace' @ [88:64] ==> public constructor CliBindingTrace() defined in org.jetbrains.kotlin.cli.jvm.compiler.CliLightClassGenerationSupport.CliBindingTrace[DeserializedClassConstructorDescriptor]

'configuration' @ [88:83] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

'packagePartProviderFactory' @ [88:98] ==> value-parameter packagePartProviderFactory: (GlobalSearchScope) -> PackagePartProvider defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil.analyze[ValueParameterDescriptorImpl]

