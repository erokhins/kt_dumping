'JvmStatic' @ [40:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ContextForNewModule' @ [42:23] ==> public fun ContextForNewModule(projectContext: ProjectContext, moduleName: Name, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform?): MutableModuleContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'ProjectContext' @ [43:17] ==> public fun ProjectContext(project: Project): ProjectContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'config' @ [43:32] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'project' @ [43:39] ==> public final val JsConfig.project: Project[MyPropertyDescriptor]

'special' @ [43:54] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'config' @ [43:66] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'moduleId' @ [43:73] ==> public final val JsConfig.moduleId: String[MyPropertyDescriptor]

'builtIns' @ [43:98] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.js.resolve.JsPlatform[PropertyDescriptorImpl]

'config' @ [47:29] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'configuration' @ [47:36] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'get' @ [47:50] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(LookupTracker..LookupTracker?)>): LookupTracker? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.incremental.components.LookupTracker..org.jetbrains.kotlin.incremental.components.LookupTracker?)

'LOOKUP_TRACKER' @ [47:78] ==> @field:JvmField public final val LOOKUP_TRACKER: CompilerConfigurationKey<(LookupTracker..LookupTracker?)> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'config' @ [48:9] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'configuration' @ [48:16] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'put' @ [48:30] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(LookupTracker..LookupTracker?)>, @NotNull p1: LookupTracker): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.incremental.components.LookupTracker..org.jetbrains.kotlin.incremental.components.LookupTracker?)

'LOOKUP_TRACKER' @ [48:58] ==> @field:JvmField public final val LOOKUP_TRACKER: CompilerConfigurationKey<(LookupTracker..LookupTracker?)> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'DO_NOTHING' @ [48:88] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'context' @ [49:9] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[LocalVariableDescriptor]

'module' @ [49:17] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'setDependencies' @ [49:24] ==> public final fun setDependencies(descriptors: List<ModuleDescriptorImpl>, friends: Set<ModuleDescriptorImpl>): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'listOf' @ [50:17] ==> public fun <T> listOf(element: ModuleDescriptorImpl): List<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'context' @ [50:24] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[LocalVariableDescriptor]

'module' @ [50:32] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'config' @ [51:17] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'moduleDescriptors' @ [51:24] ==> public final val JsConfig.moduleDescriptors: (MutableList<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>..List<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>)[MyPropertyDescriptor]

'map' @ [51:42] ==> public inline fun <T, R> Iterable<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>.map(transform: ((JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)) -> (ModuleDescriptorImpl..ModuleDescriptorImpl?)): List<(ModuleDescriptorImpl..ModuleDescriptorImpl?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.JsModuleDescriptor<(org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)>..org.jetbrains.kotlin.serialization.js.JsModuleDescriptor<(org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)>?)
    <R> -> (org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)

'it' @ [51:48] ==> value-parameter it: (JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?) defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [51:51] ==> public final val data: (ModuleDescriptorImpl..ModuleDescriptorImpl?) defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedPropertyDescriptor]

'listOf' @ [52:17] ==> public fun <T> listOf(element: ModuleDescriptorImpl): List<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'builtIns' @ [52:35] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.js.resolve.JsPlatform[PropertyDescriptorImpl]

'builtInsModule' @ [52:44] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'config' @ [53:17] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'friendModuleDescriptors' @ [53:24] ==> public final val JsConfig.friendModuleDescriptors: (MutableList<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>..List<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>)[MyPropertyDescriptor]

'map' @ [53:48] ==> public inline fun <T, R> Iterable<(JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)>.map(transform: ((JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?)) -> (ModuleDescriptorImpl..ModuleDescriptorImpl?)): List<(ModuleDescriptorImpl..ModuleDescriptorImpl?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.js.JsModuleDescriptor<(org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)>..org.jetbrains.kotlin.serialization.js.JsModuleDescriptor<(org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)>?)
    <R> -> (org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)

'it' @ [53:54] ==> value-parameter it: (JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>..JsModuleDescriptor<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>?) defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [53:57] ==> public final val data: (ModuleDescriptorImpl..ModuleDescriptorImpl?) defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedPropertyDescriptor]

'toSet' @ [53:64] ==> public fun <T> Iterable<(ModuleDescriptorImpl..ModuleDescriptorImpl?)>.toSet(): Set<(ModuleDescriptorImpl..ModuleDescriptorImpl?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl..org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl?)

'lookupTracker' @ [55:9] ==> val lookupTracker: LookupTracker? defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[LocalVariableDescriptor]

'let' @ [55:24] ==> @InlineOnly public inline fun <T, R> LookupTracker.let(block: (LookupTracker) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupTracker
    <R> -> Unit

'config' @ [55:30] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'configuration' @ [55:37] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'put' @ [55:51] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(LookupTracker..LookupTracker?)>, @NotNull p1: LookupTracker): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.incremental.components.LookupTracker..org.jetbrains.kotlin.incremental.components.LookupTracker?)

'LOOKUP_TRACKER' @ [55:79] ==> @field:JvmField public final val LOOKUP_TRACKER: CompilerConfigurationKey<(LookupTracker..LookupTracker?)> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'it' @ [55:95] ==> value-parameter it: LookupTracker defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles.<anonymous>[ValueParameterDescriptorImpl]

'BindingTraceContext' @ [57:21] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'trace' @ [58:9] ==> val trace: BindingTraceContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[LocalVariableDescriptor]

'record' @ [58:15] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> record(p0: (WritableSlice<(ModuleDescriptor..ModuleDescriptor?), (ModuleKind..ModuleKind?)>..WritableSlice<(ModuleDescriptor..ModuleDescriptor?), (ModuleKind..ModuleKind?)>?), p1: (ModuleDescriptor..ModuleDescriptor?), p2: (ModuleKind..ModuleKind?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ModuleDescriptor..org.jetbrains.kotlin.descriptors.ModuleDescriptor?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.js.ModuleKind..org.jetbrains.kotlin.serialization.js.ModuleKind?)

'MODULE_KIND' @ [58:22] ==> @JvmField public val MODULE_KIND: BasicWritableSlice<ModuleDescriptor, ModuleKind> defined in org.jetbrains.kotlin.js.resolve in file bindingContextSlicesJs.kt[PropertyDescriptorImpl]

'context' @ [58:35] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[LocalVariableDescriptor]

'module' @ [58:43] ==> public abstract val module: ModuleDescriptorImpl defined in org.jetbrains.kotlin.context.MutableModuleContext[DeserializedPropertyDescriptor]

'config' @ [58:51] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'moduleKind' @ [58:58] ==> public final val JsConfig.moduleKind: ModuleKind[MyPropertyDescriptor]

'analyzeFilesWithGivenTrace' @ [59:16] ==> @JvmStatic public final fun analyzeFilesWithGivenTrace(files: Collection<KtFile>, trace: BindingTrace, moduleContext: ModuleContext, config: JsConfig): JsAnalysisResult defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS[SimpleFunctionDescriptorImpl]

'files' @ [59:43] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'trace' @ [59:50] ==> val trace: BindingTraceContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[LocalVariableDescriptor]

'context' @ [59:57] ==> val context: MutableModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[LocalVariableDescriptor]

'config' @ [59:66] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFiles[ValueParameterDescriptorImpl]

'JvmStatic' @ [62:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'config' @ [69:29] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'configuration' @ [69:36] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'get' @ [69:50] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(LookupTracker..LookupTracker?)>): LookupTracker? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.incremental.components.LookupTracker..org.jetbrains.kotlin.incremental.components.LookupTracker?)

'LOOKUP_TRACKER' @ [69:78] ==> @field:JvmField public final val LOOKUP_TRACKER: CompilerConfigurationKey<(LookupTracker..LookupTracker?)> defined in org.jetbrains.kotlin.config.CommonConfigurationKeys[DeserializedPropertyDescriptor]

'DO_NOTHING' @ [69:111] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'config' @ [70:31] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'configuration' @ [70:38] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'INCREMENTAL_DATA_PROVIDER' @ [70:72] ==> public final val INCREMENTAL_DATA_PROVIDER: (CompilerConfigurationKey<(IncrementalDataProvider..IncrementalDataProvider?)>..CompilerConfigurationKey<(IncrementalDataProvider..IncrementalDataProvider?)>?) defined in org.jetbrains.kotlin.js.config.JSConfigurationKeys[JavaPropertyDescriptor]

'let' @ [70:100] ==> @InlineOnly public inline fun <T, R> IncrementalDataProvider.let(block: (IncrementalDataProvider) -> PackageFragmentProvider): PackageFragmentProvider defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IncrementalDataProvider
    <R> -> PackageFragmentProvider

'PackagesWithHeaderMetadata' @ [71:28] ==> public constructor PackagesWithHeaderMetadata(header: ByteArray, packages: List<ByteArray>) defined in org.jetbrains.kotlin.serialization.js.PackagesWithHeaderMetadata[DeserializedClassConstructorDescriptor]

'it' @ [71:55] ==> value-parameter it: IncrementalDataProvider defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace.<anonymous>[ValueParameterDescriptorImpl]

'headerMetadata' @ [71:58] ==> public abstract val headerMetadata: ByteArray defined in org.jetbrains.kotlin.incremental.js.IncrementalDataProvider[PropertyDescriptorImpl]

'it' @ [71:74] ==> value-parameter it: IncrementalDataProvider defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace.<anonymous>[ValueParameterDescriptorImpl]

'packagePartsMetadata' @ [71:77] ==> public abstract val packagePartsMetadata: List<ByteArray> defined in org.jetbrains.kotlin.incremental.js.IncrementalDataProvider[PropertyDescriptorImpl]

'KotlinJavascriptSerializationUtil' @ [72:13] ==> public object KotlinJavascriptSerializationUtil defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'readDescriptors' @ [72:47] ==> public final fun readDescriptors(metadata: PackagesWithHeaderMetadata, storageManager: StorageManager, module: ModuleDescriptor, configuration: DeserializationConfiguration, lookupTracker: LookupTracker): PackageFragmentProvider defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'metadata' @ [72:63] ==> val metadata: PackagesWithHeaderMetadata defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace.<anonymous>[LocalVariableDescriptor]

'moduleContext' @ [73:63] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'storageManager' @ [73:77] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'moduleContext' @ [74:63] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'module' @ [74:77] ==> public abstract val module: ModuleDescriptor defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'Default' @ [75:92] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'lookupTracker' @ [76:63] ==> val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[LocalVariableDescriptor]

'createTopDownAnalyzerForJs' @ [78:29] ==> public fun createTopDownAnalyzerForJs(moduleContext: ModuleContext, bindingTrace: BindingTrace, declarationProviderFactory: DeclarationProviderFactory, languageVersionSettings: LanguageVersionSettings, lookupTracker: LookupTracker, fallbackPackage: PackageFragmentProvider?): LazyTopDownAnalyzer defined in org.jetbrains.kotlin.frontend.js.di in file injection.kt[SimpleFunctionDescriptorImpl]

'moduleContext' @ [79:17] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'trace' @ [79:32] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'FileBasedDeclarationProviderFactory' @ [80:17] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull p0: StorageManager, @NotNull p1: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'moduleContext' @ [80:53] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'storageManager' @ [80:67] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'files' @ [80:83] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'config' @ [81:17] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'configuration' @ [81:24] ==> public final val JsConfig.configuration: CompilerConfiguration[MyPropertyDescriptor]

'languageVersionSettings' @ [81:38] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'lookupTracker' @ [82:17] ==> val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[LocalVariableDescriptor]

'packageFragment' @ [83:17] ==> val packageFragment: PackageFragmentProvider? defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[LocalVariableDescriptor]

'analyzerForJs' @ [85:9] ==> val analyzerForJs: LazyTopDownAnalyzer defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[LocalVariableDescriptor]

'analyzeDeclarations' @ [85:23] ==> public final fun analyzeDeclarations(topDownAnalysisMode: TopDownAnalysisMode, declarations: Collection<PsiElement>, outerDataFlowInfo: DataFlowInfo = ...): TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[DeserializedSimpleFunctionDescriptor]

'TopLevelDeclarations' @ [85:63] ==> enum entry TopLevelDeclarations defined in org.jetbrains.kotlin.resolve.TopDownAnalysisMode[FakeCallableDescriptorForObject]

'files' @ [85:85] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'JsAnalysisResult' @ [86:16] ==> public companion object defined in org.jetbrains.kotlin.js.analyzer.JsAnalysisResult[FakeCallableDescriptorForObject]

'success' @ [86:33] ==> @JvmStatic public final fun success(trace: BindingTrace, module: ModuleDescriptor): JsAnalysisResult defined in org.jetbrains.kotlin.js.analyzer.JsAnalysisResult.Companion[SimpleFunctionDescriptorImpl]

'trace' @ [86:41] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'moduleContext' @ [86:48] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace[ValueParameterDescriptorImpl]

'module' @ [86:62] ==> public abstract val module: ModuleDescriptor defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'JvmStatic' @ [89:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'throwExceptionOnErrors' @ [91:24] ==> public open fun throwExceptionOnErrors(p0: (BindingContext..BindingContext?)): Unit defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'bindingContext' @ [91:47] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.checkForErrors[ValueParameterDescriptorImpl]

'allFiles' @ [92:22] ==> value-parameter allFiles: Collection<KtFile> defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.checkForErrors[ValueParameterDescriptorImpl]

'checkForSyntacticErrors' @ [93:28] ==> public open fun checkForSyntacticErrors(@NotNull p0: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.AnalyzingUtils[JavaMethodDescriptor]

'file' @ [93:52] ==> val file: KtFile defined in org.jetbrains.kotlin.js.analyze.TopDownAnalyzerFacadeForJS.checkForErrors[LocalVariableDescriptor]

