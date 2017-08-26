'JvmStatic' @ [74:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [75:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'FileBasedDeclarationProviderFactory' @ [82:112] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull p0: StorageManager, @NotNull p1: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'newModuleSearchScope' @ [83:58] ==> public final fun newModuleSearchScope(project: Project, files: Collection<KtFile>): GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[SimpleFunctionDescriptorImpl]

'project' @ [83:79] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'files' @ [83:88] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'createContainer' @ [85:25] ==> public final fun createContainer(project: Project, files: Collection<KtFile>, trace: BindingTrace, configuration: CompilerConfiguration, packagePartProvider: (GlobalSearchScope) -> PackagePartProvider, declarationProviderFactory: (StorageManager, Collection<KtFile>) -> DeclarationProviderFactory, sourceModuleSearchScope: GlobalSearchScope = ...): ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[SimpleFunctionDescriptorImpl]

'project' @ [86:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'files' @ [86:26] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'trace' @ [86:33] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'configuration' @ [86:40] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'packagePartProvider' @ [86:55] ==> value-parameter packagePartProvider: (GlobalSearchScope) -> PackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'declarationProviderFactory' @ [86:76] ==> value-parameter declarationProviderFactory: (StorageManager, Collection<KtFile>) -> DeclarationProviderFactory = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'sourceModuleSearchScope' @ [86:104] ==> value-parameter sourceModuleSearchScope: GlobalSearchScope = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'container' @ [89:22] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'get' @ [89:32] ==> public inline fun <reified T : Any> ComponentProvider.get(): ModuleDescriptor defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ModuleDescriptor

'container' @ [90:29] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'get' @ [90:39] ==> public inline fun <reified T : Any> ComponentProvider.get(): ModuleContext defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ModuleContext

'AnalysisHandlerExtension' @ [92:41] ==> public companion object : ProjectExtensionDescriptor<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension[FakeCallableDescriptorForObject]

'getInstances' @ [92:66] ==> public final fun getInstances(project: Project): List<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [92:79] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'analysisHandlerExtensions' @ [95:31] ==> val analysisHandlerExtensions: List<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'extension' @ [96:30] ==> val extension: AnalysisHandlerExtension defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration.invokeExtensionsOnAnalysisComplete[LocalVariableDescriptor]

'analysisCompleted' @ [96:40] ==> public open fun analysisCompleted(project: Project, module: ModuleDescriptor, bindingTrace: BindingTrace, files: Collection<KtFile>): AnalysisResult? defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension[DeserializedSimpleFunctionDescriptor]

'project' @ [96:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'module' @ [96:67] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'trace' @ [96:75] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'files' @ [96:82] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'result' @ [97:21] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration.invokeExtensionsOnAnalysisComplete[LocalVariableDescriptor]

'result' @ [97:44] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration.invokeExtensionsOnAnalysisComplete[LocalVariableDescriptor]

'analysisHandlerExtensions' @ [103:27] ==> val analysisHandlerExtensions: List<AnalysisHandlerExtension> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'extension' @ [104:26] ==> val extension: AnalysisHandlerExtension defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'doAnalysis' @ [104:36] ==> public open fun doAnalysis(project: Project, module: ModuleDescriptor, projectContext: ProjectContext, files: Collection<KtFile>, bindingTrace: BindingTrace, componentProvider: ComponentProvider): AnalysisResult? defined in org.jetbrains.kotlin.resolve.jvm.extensions.AnalysisHandlerExtension[DeserializedSimpleFunctionDescriptor]

'project' @ [104:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'module' @ [104:56] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'moduleContext' @ [104:64] ==> val moduleContext: ModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'files' @ [104:79] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'trace' @ [104:86] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'container' @ [104:93] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'result' @ [105:17] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'invokeExtensionsOnAnalysisComplete' @ [106:17] ==> local final fun invokeExtensionsOnAnalysisComplete(): AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[SimpleFunctionDescriptorImpl]

'let' @ [106:55] ==> @InlineOnly public inline fun <T, R> AnalysisResult.let(block: (AnalysisResult) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnalysisResult
    <R> -> Nothing

'it' @ [106:68] ==> value-parameter it: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [107:24] ==> val result: AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'container' @ [111:9] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'get' @ [111:19] ==> public inline fun <reified T : Any> ComponentProvider.get(): LazyTopDownAnalyzer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LazyTopDownAnalyzer

'analyzeDeclarations' @ [111:46] ==> public final fun analyzeDeclarations(topDownAnalysisMode: TopDownAnalysisMode, declarations: Collection<PsiElement>, outerDataFlowInfo: DataFlowInfo = ...): TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[DeserializedSimpleFunctionDescriptor]

'TopLevelDeclarations' @ [111:86] ==> enum entry TopLevelDeclarations defined in org.jetbrains.kotlin.resolve.TopDownAnalysisMode[FakeCallableDescriptorForObject]

'files' @ [111:108] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'invokeExtensionsOnAnalysisComplete' @ [113:9] ==> local final fun invokeExtensionsOnAnalysisComplete(): AnalysisResult? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[SimpleFunctionDescriptorImpl]

'let' @ [113:47] ==> @InlineOnly public inline fun <T, R> AnalysisResult.let(block: (AnalysisResult) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnalysisResult
    <R> -> Nothing

'it' @ [113:60] ==> value-parameter it: AnalysisResult defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration.<anonymous>[ValueParameterDescriptorImpl]

'AnalysisResult' @ [115:16] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'success' @ [115:31] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'trace' @ [115:39] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[ValueParameterDescriptorImpl]

'bindingContext' @ [115:45] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'module' @ [115:61] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration[LocalVariableDescriptor]

'newModuleSearchScope' @ [125:58] ==> public final fun newModuleSearchScope(project: Project, files: Collection<KtFile>): GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[SimpleFunctionDescriptorImpl]

'project' @ [125:79] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'files' @ [125:88] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'configuration' @ [127:40] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'getBoolean' @ [127:54] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'CREATE_BUILT_INS_FROM_MODULE_DEPENDENCIES' @ [127:86] ==> public final val CREATE_BUILT_INS_FROM_MODULE_DEPENDENCIES: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'createModuleContext' @ [128:29] ==> private final fun createModuleContext(project: Project, configuration: CompilerConfiguration, createBuiltInsFromModule: Boolean): MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[SimpleFunctionDescriptorImpl]

'project' @ [128:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'configuration' @ [128:58] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'createBuiltInsFromModule' @ [128:73] ==> val createBuiltInsFromModule: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'moduleContext' @ [130:30] ==> val moduleContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'storageManager' @ [130:44] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'moduleContext' @ [131:22] ==> val moduleContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'module' @ [131:36] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'configuration' @ [133:37] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'get' @ [133:51] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>): IncrementalCompilationComponents? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IncrementalCompilationComponents

'INCREMENTAL_COMPILATION_COMPONENTS' @ [133:76] ==> public final val INCREMENTAL_COMPILATION_COMPONENTS: (CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>..CompilerConfigurationKey<(IncrementalCompilationComponents..IncrementalCompilationComponents?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'configuration' @ [134:29] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'get' @ [134:43] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(LookupTracker..LookupTracker?)>): LookupTracker? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LookupTracker

'CommonConfigurationKeys' @ [134:47] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'LOOKUP_TRACKER' @ [134:71] ==> @field:JvmField public final val LOOKUP_TRACKER: CompilerConfigurationKey<(LookupTracker..LookupTracker?)> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'DO_NOTHING' @ [134:104] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'configuration' @ [135:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'get' @ [135:39] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>): (MutableList<(Module..Module?)>?..List<(Module..Module?)>?) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)>..kotlin.collections.List<(org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)>)

'MODULES' @ [135:64] ==> public final val MODULES: (CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>..CompilerConfigurationKey<(MutableList<(Module..Module?)>..List<(Module..Module?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'map' @ [135:74] ==> public inline fun <T, R> Iterable<(Module..Module?)>.map(transform: ((Module..Module?)) -> TargetId): List<TargetId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)
    <R> -> TargetId

'!' @ [137:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [137:32] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'getBoolean' @ [137:46] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'USE_SINGLE_MODULE' @ [137:78] ==> public final val USE_SINGLE_MODULE: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'if (separateModules) sourceModuleSearchScope else GlobalSearchScope.allScope(project)' @ [139:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GlobalSearchScope, elseBranch: GlobalSearchScope): GlobalSearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GlobalSearchScope

'separateModules' @ [139:31] ==> val separateModules: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'sourceModuleSearchScope' @ [139:48] ==> value-parameter sourceModuleSearchScope: GlobalSearchScope = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'allScope' @ [139:95] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [139:104] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'SourceOrBinaryModuleClassResolver' @ [140:35] ==> public constructor SourceOrBinaryModuleClassResolver(sourceScope: GlobalSearchScope) defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver[ClassConstructorDescriptorImpl]

'sourceScope' @ [140:69] ==> val sourceScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'configuration' @ [142:25] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'get' @ [142:39] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(JvmTarget..JvmTarget?)>): JvmTarget? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmTarget

'JVM_TARGET' @ [142:64] ==> public final val JVM_TARGET: (CompilerConfigurationKey<(JvmTarget..JvmTarget?)>..CompilerConfigurationKey<(JvmTarget..JvmTarget?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmTarget' @ [142:79] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_6' @ [142:89] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'configuration' @ [143:39] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [143:53] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'if (configuration.getBoolean(JVMConfigurationKeys.ADD_BUILT_INS_FROM_COMPILER_TO_DEPENDENCIES)) {
                    if (createBuiltInsFromModule)
                        JvmBuiltIns(storageManager).apply { initialize(module, languageVersionSettings) }.builtInsModule
                    else module.builtIns.builtInsModule
                }
                else null' @ [146:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleDescriptorImpl?, elseBranch: ModuleDescriptorImpl?): ModuleDescriptorImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleDescriptorImpl?

'configuration' @ [146:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'getBoolean' @ [146:35] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'ADD_BUILT_INS_FROM_COMPILER_TO_DEPENDENCIES' @ [146:67] ==> public final val ADD_BUILT_INS_FROM_COMPILER_TO_DEPENDENCIES: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'if (createBuiltInsFromModule)
                        JvmBuiltIns(storageManager).apply { initialize(module, languageVersionSettings) }.builtInsModule
                    else module.builtIns.builtInsModule' @ [147:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleDescriptorImpl, elseBranch: ModuleDescriptorImpl): ModuleDescriptorImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleDescriptorImpl

'createBuiltInsFromModule' @ [147:25] ==> val createBuiltInsFromModule: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'JvmBuiltIns' @ [148:25] ==> @JvmOverloads public constructor JvmBuiltIns(storageManager: StorageManager, loadBuiltInsFromCurrentClassLoader: Boolean = ...) defined in org.jetbrains.kotlin.platform.JvmBuiltIns[DeserializedClassConstructorDescriptor]

'storageManager' @ [148:37] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'apply' @ [148:53] ==> @InlineOnly public inline fun <T> JvmBuiltIns.apply(block: JvmBuiltIns.() -> Unit): JvmBuiltIns defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmBuiltIns

'initialize' @ [148:61] ==> public fun JvmBuiltIns.initialize(module: ModuleDescriptor, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.frontend.java.di[DeserializedSimpleFunctionDescriptor]

'module' @ [148:72] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'languageVersionSettings' @ [148:80] ==> val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'builtInsModule' @ [148:107] ==> public final var JvmBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'module' @ [149:26] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'builtIns' @ [149:33] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [149:42] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'useImpl' @ [154:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavacBasedClassFinder

'useImpl' @ [155:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> StubJavaResolverCache

'useImpl' @ [156:13] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavacBasedSourceElementFactory

'if (configuration.getBoolean(JVMConfigurationKeys.USE_JAVAC)) StorageComponentContainer::useJavac
                else null' @ [160:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KFunction1<StorageComponentContainer, Unit>?, elseBranch: KFunction1<StorageComponentContainer, Unit>?): KFunction1<StorageComponentContainer, Unit>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KFunction1<StorageComponentContainer, Unit>?

'configuration' @ [160:21] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'getBoolean' @ [160:35] ==> public open fun getBoolean(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>): Boolean defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]

'USE_JAVAC' @ [160:67] ==> public final val USE_JAVAC: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'StorageComponentContainer' @ [160:79] ==> public constructor StorageComponentContainer(id: String, parent: StorageComponentContainer? = ...) defined in org.jetbrains.kotlin.container.StorageComponentContainer[DeserializedClassConstructorDescriptor]

'if (separateModules) {
            val dependenciesContext = ContextForNewModule(
                    moduleContext, Name.special("<dependencies of ${configuration.getNotNull(CommonConfigurationKeys.MODULE_NAME)}>"),
                    module.builtIns, null
            )

            // Scope for the dependency module contains everything except files present in the scope for the source module
            val dependencyScope = GlobalSearchScope.notScope(sourceScope)

            val dependenciesContainer = createContainerForTopDownAnalyzerForJvm(
                    dependenciesContext, trace, DeclarationProviderFactory.EMPTY, dependencyScope, lookupTracker,
                    packagePartProvider(dependencyScope), moduleClassResolver, jvmTarget, languageVersionSettings, configureJavaClassFinder
            )

            moduleClassResolver.compiledCodeResolver = dependenciesContainer.get<JavaDescriptorResolver>()

            dependenciesContext.setDependencies(listOfNotNull(dependenciesContext.module, optionalBuiltInsModule))
            dependenciesContext.initializeModuleContents(CompositePackageFragmentProvider(listOf(
                    moduleClassResolver.compiledCodeResolver.packageFragmentProvider,
                    dependenciesContainer.get<JvmBuiltInsPackageFragmentProvider>()
            )))
            dependenciesContext.module
        }
        else null' @ [163:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleDescriptorImpl?, elseBranch: ModuleDescriptorImpl?): ModuleDescriptorImpl?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModuleDescriptorImpl?

'separateModules' @ [163:36] ==> val separateModules: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'ContextForNewModule' @ [164:39] ==> public fun ContextForNewModule(projectContext: ProjectContext, moduleName: Name, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform?): MutableModuleContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'moduleContext' @ [165:21] ==> val moduleContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'special' @ [165:41] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'configuration' @ [165:69] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'getNotNull' @ [165:83] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [165:94] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [165:118] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'module' @ [166:21] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'builtIns' @ [166:28] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'notScope' @ [170:53] ==> @NotNull public open fun notScope(@NotNull p0: GlobalSearchScope): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'sourceScope' @ [170:62] ==> val sourceScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'createContainerForTopDownAnalyzerForJvm' @ [172:41] ==> public fun createContainerForTopDownAnalyzerForJvm(moduleContext: ModuleContext, bindingTrace: BindingTrace, declarationProviderFactory: DeclarationProviderFactory, moduleContentScope: GlobalSearchScope, lookupTracker: LookupTracker, packagePartProvider: PackagePartProvider, moduleClassResolver: ModuleClassResolver, jvmTarget: JvmTarget, languageVersionSettings: LanguageVersionSettings, configureJavaClassFinder: (StorageComponentContainer.() -> Unit)? = ...): ComponentProvider defined in org.jetbrains.kotlin.frontend.java.di[DeserializedSimpleFunctionDescriptor]

'dependenciesContext' @ [173:21] ==> val dependenciesContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'trace' @ [173:42] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'EMPTY' @ [173:76] ==> public final val EMPTY: (DeclarationProviderFactory..DeclarationProviderFactory?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactory[JavaPropertyDescriptor]

'dependencyScope' @ [173:83] ==> val dependencyScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'lookupTracker' @ [173:100] ==> val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'invoke' @ [174:21] ==> public abstract operator fun invoke(p1: GlobalSearchScope): PackagePartProvider defined in kotlin.Function1[FunctionInvokeDescriptor]

'dependencyScope' @ [174:41] ==> val dependencyScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'moduleClassResolver' @ [174:59] ==> val moduleClassResolver: TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'jvmTarget' @ [174:80] ==> val jvmTarget: JvmTarget defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'languageVersionSettings' @ [174:91] ==> val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'configureJavaClassFinder' @ [174:116] ==> val configureJavaClassFinder: KFunction1<StorageComponentContainer, Unit>? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'moduleClassResolver' @ [177:13] ==> val moduleClassResolver: TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'compiledCodeResolver' @ [177:33] ==> public final lateinit var compiledCodeResolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver[PropertyDescriptorImpl]

'dependenciesContainer' @ [177:56] ==> val dependenciesContainer: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'get' @ [177:78] ==> public inline fun <reified T : Any> ComponentProvider.get(): JavaDescriptorResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaDescriptorResolver

'dependenciesContext' @ [179:13] ==> val dependenciesContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'setDependencies' @ [179:33] ==> public open fun setDependencies(dependencies: List<ModuleDescriptorImpl>): Unit defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedSimpleFunctionDescriptor]

'listOfNotNull' @ [179:49] ==> public fun <T : Any> listOfNotNull(vararg elements: ModuleDescriptorImpl?): List<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ModuleDescriptorImpl

'dependenciesContext' @ [179:63] ==> val dependenciesContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'module' @ [179:83] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'optionalBuiltInsModule' @ [179:91] ==> val optionalBuiltInsModule: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'dependenciesContext' @ [180:13] ==> val dependenciesContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'initializeModuleContents' @ [180:33] ==> public open fun initializeModuleContents(packageFragmentProvider: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedSimpleFunctionDescriptor]

'CompositePackageFragmentProvider' @ [180:58] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'listOf' @ [180:91] ==> public fun <T> listOf(vararg elements: PackageFragmentProvider): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'moduleClassResolver' @ [181:21] ==> val moduleClassResolver: TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'compiledCodeResolver' @ [181:41] ==> public final lateinit var compiledCodeResolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver[PropertyDescriptorImpl]

'packageFragmentProvider' @ [181:62] ==> public final val packageFragmentProvider: LazyJavaPackageFragmentProvider defined in org.jetbrains.kotlin.resolve.jvm.JavaDescriptorResolver[DeserializedPropertyDescriptor]

'dependenciesContainer' @ [182:21] ==> val dependenciesContainer: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'get' @ [182:43] ==> public inline fun <reified T : Any> ComponentProvider.get(): JvmBuiltInsPackageFragmentProvider defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JvmBuiltInsPackageFragmentProvider

'dependenciesContext' @ [184:13] ==> val dependenciesContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'module' @ [184:33] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'invoke' @ [188:28] ==> public abstract operator fun invoke(p1: GlobalSearchScope): PackagePartProvider defined in kotlin.Function1[FunctionInvokeDescriptor]

'sourceScope' @ [188:48] ==> val sourceScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'let' @ [188:61] ==> @InlineOnly public inline fun <T, R> PackagePartProvider.let(block: (PackagePartProvider) -> PackagePartProvider): PackagePartProvider defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackagePartProvider
    <R> -> PackagePartProvider

'if (targetIds == null || incrementalComponents == null) fragment
            else IncrementalPackagePartProvider(fragment, targetIds.map(incrementalComponents::getIncrementalCache), storageManager)' @ [189:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PackagePartProvider, elseBranch: PackagePartProvider): PackagePartProvider[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PackagePartProvider

'targetIds' @ [189:17] ==> val targetIds: List<TargetId>? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'incrementalComponents' @ [189:38] ==> val incrementalComponents: IncrementalCompilationComponents? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'fragment' @ [189:69] ==> value-parameter fragment: PackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer.<anonymous>[ValueParameterDescriptorImpl]

'IncrementalPackagePartProvider' @ [190:18] ==> public constructor IncrementalPackagePartProvider(parent: PackagePartProvider, incrementalCaches: List<IncrementalCache>, storageManager: StorageManager) defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider[DeserializedClassConstructorDescriptor]

'fragment' @ [190:49] ==> value-parameter fragment: PackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer.<anonymous>[ValueParameterDescriptorImpl]

'targetIds' @ [190:59] ==> val targetIds: List<TargetId>? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'map' @ [190:69] ==> public inline fun <T, R> Iterable<TargetId>.map(transform: (TargetId) -> IncrementalCache): List<IncrementalCache> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetId
    <R> -> IncrementalCache

'incrementalComponents' @ [190:73] ==> val incrementalComponents: IncrementalCompilationComponents? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'storageManager' @ [190:118] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'createContainerForTopDownAnalyzerForJvm' @ [197:25] ==> public fun createContainerForTopDownAnalyzerForJvm(moduleContext: ModuleContext, bindingTrace: BindingTrace, declarationProviderFactory: DeclarationProviderFactory, moduleContentScope: GlobalSearchScope, lookupTracker: LookupTracker, packagePartProvider: PackagePartProvider, moduleClassResolver: ModuleClassResolver, jvmTarget: JvmTarget, languageVersionSettings: LanguageVersionSettings, configureJavaClassFinder: (StorageComponentContainer.() -> Unit)? = ...): ComponentProvider defined in org.jetbrains.kotlin.frontend.java.di[DeserializedSimpleFunctionDescriptor]

'moduleContext' @ [198:17] ==> val moduleContext: MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'trace' @ [198:32] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'invoke' @ [198:39] ==> public abstract operator fun invoke(p1: StorageManager, p2: Collection<KtFile>): DeclarationProviderFactory defined in kotlin.Function2[FunctionInvokeDescriptor]

'storageManager' @ [198:66] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'files' @ [198:82] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'sourceScope' @ [198:90] ==> val sourceScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'lookupTracker' @ [198:103] ==> val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'partProvider' @ [199:17] ==> val partProvider: PackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'moduleClassResolver' @ [199:31] ==> val moduleClassResolver: TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'jvmTarget' @ [199:52] ==> val jvmTarget: JvmTarget defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'languageVersionSettings' @ [199:63] ==> val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'configureJavaClassFinder' @ [199:88] ==> val configureJavaClassFinder: KFunction1<StorageComponentContainer, Unit>? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'apply' @ [200:11] ==> @InlineOnly public inline fun <T> ComponentProvider.apply(block: ComponentProvider.() -> Unit): ComponentProvider defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComponentProvider

'initJvmBuiltInsForTopDownAnalysis' @ [201:13] ==> public fun ComponentProvider.initJvmBuiltInsForTopDownAnalysis(): Unit defined in org.jetbrains.kotlin.frontend.java.di[DeserializedSimpleFunctionDescriptor]

'partProvider' @ [202:14] ==> val partProvider: PackagePartProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'deserializationConfiguration' @ [202:64] ==> public final lateinit var deserializationConfiguration: DeserializationConfiguration defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackagePartProvider[DeserializedPropertyDescriptor]

'get' @ [202:95] ==> public inline fun <reified T : Any> ComponentProvider.get(): DeserializationConfiguration defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DeserializationConfiguration

'moduleClassResolver' @ [205:9] ==> val moduleClassResolver: TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'sourceCodeResolver' @ [205:29] ==> public final lateinit var sourceCodeResolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver[PropertyDescriptorImpl]

'container' @ [205:50] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'get' @ [205:60] ==> public inline fun <reified T : Any> ComponentProvider.get(): JavaDescriptorResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaDescriptorResolver

'ArrayList' @ [206:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PackageFragmentProvider

'incrementalComponents' @ [208:13] ==> val incrementalComponents: IncrementalCompilationComponents? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'targetIds' @ [209:13] ==> val targetIds: List<TargetId>? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'mapTo' @ [209:24] ==> public inline fun <T, R, C : MutableCollection<in IncrementalPackageFragmentProvider>> Iterable<TargetId>.mapTo(destination: ArrayList<PackageFragmentProvider>, transform: (TargetId) -> IncrementalPackageFragmentProvider): ArrayList<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetId
    <R> -> IncrementalPackageFragmentProvider
    <C : MutableCollection<in R>> -> ArrayList<PackageFragmentProvider>

'additionalProviders' @ [209:30] ==> val additionalProviders: ArrayList<PackageFragmentProvider> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'IncrementalPackageFragmentProvider' @ [210:17] ==> public constructor IncrementalPackageFragmentProvider(sourceFiles: Collection<KtFile>, moduleDescriptor: ModuleDescriptor, storageManager: StorageManager, deserializationComponents: DeserializationComponents, incrementalCache: IncrementalCache, target: TargetId, kotlinClassFinder: KotlinClassFinder) defined in org.jetbrains.kotlin.load.kotlin.incremental.IncrementalPackageFragmentProvider[DeserializedClassConstructorDescriptor]

'files' @ [211:25] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'module' @ [211:32] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'storageManager' @ [211:40] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'container' @ [211:56] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'get' @ [211:66] ==> public inline fun <reified T : Any> ComponentProvider.get(): DeserializationComponentsForJava defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DeserializationComponentsForJava

'components' @ [211:106] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializationComponentsForJava[DeserializedPropertyDescriptor]

'incrementalComponents' @ [212:25] ==> val incrementalComponents: IncrementalCompilationComponents? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'getIncrementalCache' @ [212:47] ==> public abstract fun getIncrementalCache(target: TargetId): IncrementalCache defined in org.jetbrains.kotlin.load.kotlin.incremental.components.IncrementalCompilationComponents[DeserializedSimpleFunctionDescriptor]

'targetId' @ [212:67] ==> value-parameter targetId: TargetId defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer.<anonymous>[ValueParameterDescriptorImpl]

'targetId' @ [212:78] ==> value-parameter targetId: TargetId defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer.<anonymous>[ValueParameterDescriptorImpl]

'container' @ [213:25] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'get' @ [213:35] ==> public inline fun <reified T : Any> ComponentProvider.get(): KotlinClassFinder defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinClassFinder

'additionalProviders' @ [218:9] ==> val additionalProviders: ArrayList<PackageFragmentProvider> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'add' @ [218:29] ==> public open fun add(element: PackageFragmentProvider): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'container' @ [218:33] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'get' @ [218:43] ==> public inline fun <reified T : Any> ComponentProvider.get(): JavaDescriptorResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaDescriptorResolver

'packageFragmentProvider' @ [218:73] ==> public final val packageFragmentProvider: LazyJavaPackageFragmentProvider defined in org.jetbrains.kotlin.resolve.jvm.JavaDescriptorResolver[DeserializedPropertyDescriptor]

'PackageFragmentProviderExtension' @ [221:9] ==> public companion object : ProjectExtensionDescriptor<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[FakeCallableDescriptorForObject]

'getInstances' @ [221:42] ==> public final fun getInstances(project: Project): List<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [221:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [221:64] ==> public inline fun <T, R : Any, C : MutableCollection<in PackageFragmentProvider>> Iterable<PackageFragmentProviderExtension>.mapNotNullTo(destination: ArrayList<PackageFragmentProvider>, transform: (PackageFragmentProviderExtension) -> PackageFragmentProvider?): ArrayList<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProviderExtension
    <R : Any> -> PackageFragmentProvider
    <C : MutableCollection<in R>> -> ArrayList<PackageFragmentProvider>

'additionalProviders' @ [221:77] ==> val additionalProviders: ArrayList<PackageFragmentProvider> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'extension' @ [222:13] ==> value-parameter extension: PackageFragmentProviderExtension defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer.<anonymous>[ValueParameterDescriptorImpl]

'getPackageFragmentProvider' @ [222:23] ==> public abstract fun getPackageFragmentProvider(project: Project, module: ModuleDescriptor, storageManager: StorageManager, trace: BindingTrace, moduleInfo: ModuleInfo?): PackageFragmentProvider? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[DeserializedSimpleFunctionDescriptor]

'project' @ [222:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'module' @ [222:59] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'storageManager' @ [222:67] ==> val storageManager: StorageManager defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'trace' @ [222:83] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[ValueParameterDescriptorImpl]

'module' @ [226:9] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'setDependencies' @ [226:16] ==> public final fun setDependencies(dependencies: ModuleDependencies): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'ModuleDependenciesImpl' @ [226:32] ==> public constructor ModuleDependenciesImpl(allDependencies: List<ModuleDescriptorImpl>, modulesWhoseInternalsAreVisible: Set<ModuleDescriptorImpl>) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDependenciesImpl[DeserializedClassConstructorDescriptor]

'listOfNotNull' @ [227:17] ==> public fun <T : Any> listOfNotNull(vararg elements: ModuleDescriptorImpl?): List<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ModuleDescriptorImpl

'module' @ [227:31] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'dependencyModule' @ [227:39] ==> val dependencyModule: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'optionalBuiltInsModule' @ [227:57] ==> val optionalBuiltInsModule: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'if (dependencyModule != null) setOf(dependencyModule) else emptySet()' @ [228:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<ModuleDescriptorImpl>, elseBranch: Set<ModuleDescriptorImpl>): Set<ModuleDescriptorImpl>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<ModuleDescriptorImpl>

'dependencyModule' @ [228:21] ==> val dependencyModule: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'setOf' @ [228:47] ==> public fun <T> setOf(element: ModuleDescriptorImpl): Set<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'dependencyModule' @ [228:53] ==> val dependencyModule: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'emptySet' @ [228:76] ==> public fun <T> emptySet(): Set<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'module' @ [230:9] ==> val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'initialize' @ [230:16] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'CompositePackageFragmentProvider' @ [230:27] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'listOf' @ [231:17] ==> public fun <T> listOf(element: PackageFragmentProvider): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'container' @ [231:24] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'get' @ [231:34] ==> public inline fun <reified T : Any> ComponentProvider.get(): KotlinCodeAnalyzer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinCodeAnalyzer

'packageFragmentProvider' @ [231:60] ==> public final val KotlinCodeAnalyzer.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'additionalProviders' @ [232:17] ==> val additionalProviders: ArrayList<PackageFragmentProvider> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'container' @ [235:16] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContainer[LocalVariableDescriptor]

'filesScope' @ [242:34] ==> @NotNull public open fun filesScope(@NotNull p0: Project, @NotNull p1: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [242:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.newModuleSearchScope[ValueParameterDescriptorImpl]

'files' @ [242:54] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.newModuleSearchScope[ValueParameterDescriptorImpl]

'map' @ [242:60] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> (VirtualFile..VirtualFile?)): List<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'it' @ [242:66] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.newModuleSearchScope.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [242:69] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'toSet' @ [242:83] ==> public fun <T> Iterable<(VirtualFile..VirtualFile?)>.toSet(): Set<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'uniteWith' @ [242:92] ==> @NotNull public open fun uniteWith(@NotNull p0: GlobalSearchScope): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'AllJavaSourcesInProjectScope' @ [242:102] ==> public constructor AllJavaSourcesInProjectScope(project: Project) defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.AllJavaSourcesInProjectScope[ClassConstructorDescriptorImpl]

'project' @ [242:131] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.newModuleSearchScope[ValueParameterDescriptorImpl]

'DelegatingGlobalSearchScope' @ [246:60] ==> public constructor DelegatingGlobalSearchScope(@NotNull p0: GlobalSearchScope) defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaClassConstructorDescriptor]

'allScope' @ [246:106] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [246:115] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.AllJavaSourcesInProjectScope.<init>[ValueParameterDescriptorImpl]

'file' @ [250:17] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.AllJavaSourcesInProjectScope.contains[ValueParameterDescriptorImpl]

'fileType' @ [250:22] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [250:48] ==> public final val INSTANCE: (JavaFileType..JavaFileType?) defined in com.intellij.ide.highlighter.JavaFileType[JavaPropertyDescriptor]

'!' @ [250:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [250:61] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.AllJavaSourcesInProjectScope.contains[ValueParameterDescriptorImpl]

'isDirectory' @ [250:66] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'if (javaClass is VirtualFileBoundJavaClass && javaClass.isFromSourceCodeInScope(sourceScope))
                sourceCodeResolver
            else
                compiledCodeResolver' @ [260:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaDescriptorResolver, elseBranch: JavaDescriptorResolver): JavaDescriptorResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JavaDescriptorResolver

'javaClass' @ [260:32] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver.resolveClass[ValueParameterDescriptorImpl]

'javaClass' @ [260:74] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver.resolveClass[ValueParameterDescriptorImpl]

'isFromSourceCodeInScope' @ [260:84] ==> public abstract fun isFromSourceCodeInScope(scope: SearchScope): Boolean defined in org.jetbrains.kotlin.load.java.structure.impl.VirtualFileBoundJavaClass[DeserializedSimpleFunctionDescriptor]

'sourceScope' @ [260:108] ==> private final val sourceScope: GlobalSearchScope defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver[PropertyDescriptorImpl]

'sourceCodeResolver' @ [261:17] ==> public final lateinit var sourceCodeResolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver[PropertyDescriptorImpl]

'compiledCodeResolver' @ [263:17] ==> public final lateinit var compiledCodeResolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver[PropertyDescriptorImpl]

'resolver' @ [264:20] ==> val resolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver.resolveClass[LocalVariableDescriptor]

'resolveClass' @ [264:29] ==> public final fun resolveClass(javaClass: JavaClass): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.JavaDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'javaClass' @ [264:42] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.SourceOrBinaryModuleClassResolver.resolveClass[ValueParameterDescriptorImpl]

'createModuleContext' @ [269:13] ==> private final fun createModuleContext(project: Project, configuration: CompilerConfiguration, createBuiltInsFromModule: Boolean): MutableModuleContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM[SimpleFunctionDescriptorImpl]

'project' @ [269:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContextWithSealedModule[ValueParameterDescriptorImpl]

'configuration' @ [269:42] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContextWithSealedModule[ValueParameterDescriptorImpl]

'apply' @ [269:64] ==> @InlineOnly public inline fun <T> MutableModuleContext.apply(block: MutableModuleContext.() -> Unit): MutableModuleContext defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableModuleContext

'setDependencies' @ [270:17] ==> public open fun setDependencies(vararg dependencies: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedSimpleFunctionDescriptor]

'module' @ [270:33] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'module' @ [270:41] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'builtIns' @ [270:48] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [270:57] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'module' @ [271:18] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'builtIns' @ [271:25] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'initialize' @ [271:50] ==> public fun JvmBuiltIns.initialize(module: ModuleDescriptor, languageVersionSettings: LanguageVersionSettings): Unit defined in org.jetbrains.kotlin.frontend.java.di[DeserializedSimpleFunctionDescriptor]

'module' @ [271:61] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'configuration' @ [271:69] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createContextWithSealedModule[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [271:83] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'ProjectContext' @ [279:30] ==> public fun ProjectContext(project: Project): ProjectContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'project' @ [279:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[ValueParameterDescriptorImpl]

'JvmBuiltIns' @ [280:24] ==> @JvmOverloads public constructor JvmBuiltIns(storageManager: StorageManager, loadBuiltInsFromCurrentClassLoader: Boolean = ...) defined in org.jetbrains.kotlin.platform.JvmBuiltIns[DeserializedClassConstructorDescriptor]

'projectContext' @ [280:36] ==> val projectContext: ProjectContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[LocalVariableDescriptor]

'storageManager' @ [280:51] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ProjectContext[DeserializedPropertyDescriptor]

'!' @ [280:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'createBuiltInsFromModule' @ [280:68] ==> value-parameter createBuiltInsFromModule: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[ValueParameterDescriptorImpl]

'ContextForNewModule' @ [281:16] ==> public fun ContextForNewModule(projectContext: ProjectContext, moduleName: Name, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform?): MutableModuleContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'projectContext' @ [282:17] ==> val projectContext: ProjectContext defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[LocalVariableDescriptor]

'special' @ [282:38] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'configuration' @ [282:50] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[ValueParameterDescriptorImpl]

'getNotNull' @ [282:64] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(String..String?)>): String defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'CommonConfigurationKeys' @ [282:75] ==> public object CommonConfigurationKeys defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'MODULE_NAME' @ [282:99] ==> @field:JvmField public final val MODULE_NAME: CompilerConfigurationKey<String> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'builtIns' @ [282:117] ==> val builtIns: JvmBuiltIns defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[LocalVariableDescriptor]

'apply' @ [283:11] ==> @InlineOnly public inline fun <T> MutableModuleContext.apply(block: MutableModuleContext.() -> Unit): MutableModuleContext defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableModuleContext

'createBuiltInsFromModule' @ [284:17] ==> value-parameter createBuiltInsFromModule: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[ValueParameterDescriptorImpl]

'builtIns' @ [285:17] ==> val builtIns: JvmBuiltIns defined in org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.createModuleContext[LocalVariableDescriptor]

'builtInsModule' @ [285:26] ==> public final var JvmBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'module' @ [285:43] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

