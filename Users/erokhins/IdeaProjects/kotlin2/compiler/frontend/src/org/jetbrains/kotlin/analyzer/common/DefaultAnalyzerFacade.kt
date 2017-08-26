'AnalyzerFacade' @ [51:32] ==> public constructor AnalyzerFacade() defined in org.jetbrains.kotlin.analyzer.AnalyzerFacade[ClassConstructorDescriptorImpl]

'listOf' @ [57:39] ==> public fun <T> listOf(element: DefaultAnalyzerFacade.SourceModuleInfo): List<DefaultAnalyzerFacade.SourceModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceModuleInfo

'this' @ [57:46] ==> <this> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.SourceModuleInfo[LazyClassReceiverParameterDescriptor]

'if (dependOnOldBuiltIns) ModuleInfo.DependencyOnBuiltIns.LAST else ModuleInfo.DependencyOnBuiltIns.NONE' @ [60:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleInfo.DependencyOnBuiltIns, elseBranch: ModuleInfo.DependencyOnBuiltIns): ModuleInfo.DependencyOnBuiltIns[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DependencyOnBuiltIns

'dependOnOldBuiltIns' @ [60:21] ==> private final val dependOnOldBuiltIns: Boolean defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.SourceModuleInfo[PropertyDescriptorImpl]

'LAST' @ [60:74] ==> enum entry LAST defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

'NONE' @ [60:116] ==> enum entry NONE defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

'mapOf' @ [65:71] ==> public fun <K, V> mapOf(pair: Pair<ModuleDescriptor.Capability<*>, MultiTargetPlatform.Common>): Map<ModuleDescriptor.Capability<*>, MultiTargetPlatform.Common> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Capability<*>
    <V> -> Common

'MultiTargetPlatform' @ [65:77] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'CAPABILITY' @ [65:97] ==> @field:JvmField public final val CAPABILITY: ModuleDescriptor.Capability<MultiTargetPlatform> defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform.Companion[DeserializedPropertyDescriptor]

'Common' @ [65:131] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'SourceModuleInfo' @ [68:26] ==> public constructor SourceModuleInfo(name: Name, capabilities: Map<ModuleDescriptor.Capability<*>, Any?>, dependOnOldBuiltIns: Boolean) defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.SourceModuleInfo[ClassConstructorDescriptorImpl]

'moduleName' @ [68:43] ==> value-parameter moduleName: Name defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'capabilities' @ [68:55] ==> value-parameter capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ... defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'dependOnBuiltIns' @ [68:69] ==> value-parameter dependOnBuiltIns: Boolean defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'files' @ [69:23] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'firstOrNull' @ [69:29] ==> public fun <T> Iterable<KtFile>.firstOrNull(): KtFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'project' @ [69:44] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'AssertionError' @ [69:61] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'languageVersionSettings' @ [71:81] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'if (feature == LanguageFeature.MultiPlatformProjects) LanguageFeature.State.ENABLED
                    else languageVersionSettings.getFeatureSupport(feature)' @ [73:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LanguageFeature.State, elseBranch: LanguageFeature.State): LanguageFeature.State[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> State

'feature' @ [73:25] ==> value-parameter feature: LanguageFeature defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles.<no name provided>.getFeatureSupport[ValueParameterDescriptorImpl]

'MultiPlatformProjects' @ [73:52] ==> enum entry MultiPlatformProjects defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [73:97] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'languageVersionSettings' @ [74:26] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'getFeatureSupport' @ [74:50] ==> public abstract fun getFeatureSupport(feature: LanguageFeature): LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'feature' @ [74:68] ==> value-parameter feature: LanguageFeature defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles.<no name provided>.getFeatureSupport[ValueParameterDescriptorImpl]

'Suppress' @ [77:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'ResolverForProjectImpl' @ [78:24] ==> public constructor ResolverForProjectImpl<M : ModuleInfo>(debugName: String, projectContext: ProjectContext, modules: Collection<DefaultAnalyzerFacade.SourceModuleInfo>, analyzerFacade: (DefaultAnalyzerFacade.SourceModuleInfo) -> AnalyzerFacade, modulesContent: (DefaultAnalyzerFacade.SourceModuleInfo) -> ModuleContent, platformParameters: PlatformAnalysisParameters, targetEnvironment: TargetEnvironment = ..., builtIns: KotlinBuiltIns = ..., delegateResolver: ResolverForProject<DefaultAnalyzerFacade.SourceModuleInfo> = ..., packagePartProviderFactory: (DefaultAnalyzerFacade.SourceModuleInfo, ModuleContent) -> PackagePartProvider = ..., firstDependency: DefaultAnalyzerFacade.SourceModuleInfo? = ..., modulePlatforms: (DefaultAnalyzerFacade.SourceModuleInfo) -> MultiTargetPlatform?, packageOracleFactory: PackageOracleFactory = ..., languageSettingsProvider: LanguageSettingsProvider = ..., invalidateOnOOCB: Boolean = ...) defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <M : ModuleInfo> -> SourceModuleInfo

'ProjectContext' @ [80:17] ==> public fun ProjectContext(project: Project): ProjectContext defined in org.jetbrains.kotlin.context in file context.kt[SimpleFunctionDescriptorImpl]

'project' @ [80:32] ==> val project: Project defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'listOf' @ [80:42] ==> public fun <T> listOf(element: DefaultAnalyzerFacade.SourceModuleInfo): List<DefaultAnalyzerFacade.SourceModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceModuleInfo

'moduleInfo' @ [80:49] ==> val moduleInfo: DefaultAnalyzerFacade.SourceModuleInfo defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'DefaultAnalyzerFacade' @ [80:64] ==> public object DefaultAnalyzerFacade : AnalyzerFacade defined in org.jetbrains.kotlin.analyzer.common in file DefaultAnalyzerFacade.kt[FakeCallableDescriptorForObject]

'ModuleContent' @ [81:19] ==> public constructor ModuleContent(syntheticFiles: Collection<KtFile>, moduleContentScope: GlobalSearchScope) defined in org.jetbrains.kotlin.analyzer.ModuleContent[ClassConstructorDescriptorImpl]

'files' @ [81:33] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'allScope' @ [81:58] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [81:67] ==> val project: Project defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'multiplatformLanguageSettings' @ [84:105] ==> val multiplatformLanguageSettings: <no name provided> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'NoVersion' @ [85:100] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'packagePartProviderFactory' @ [87:46] ==> value-parameter packagePartProviderFactory: (ModuleInfo, ModuleContent) -> PackagePartProvider defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'MultiTargetPlatform' @ [88:37] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Common' @ [88:57] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'resolver' @ [91:32] ==> val resolver: ResolverForProjectImpl<DefaultAnalyzerFacade.SourceModuleInfo> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'descriptorForModule' @ [91:41] ==> public open fun descriptorForModule(moduleInfo: DefaultAnalyzerFacade.SourceModuleInfo): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [91:61] ==> val moduleInfo: DefaultAnalyzerFacade.SourceModuleInfo defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'resolver' @ [92:25] ==> val resolver: ResolverForProjectImpl<DefaultAnalyzerFacade.SourceModuleInfo> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'resolverForModule' @ [92:34] ==> public final fun resolverForModule(moduleInfo: DefaultAnalyzerFacade.SourceModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [92:52] ==> val moduleInfo: DefaultAnalyzerFacade.SourceModuleInfo defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'componentProvider' @ [92:64] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[PropertyDescriptorImpl]

'container' @ [94:9] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'get' @ [94:19] ==> public inline fun <reified T : Any> ComponentProvider.get(): LazyTopDownAnalyzer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LazyTopDownAnalyzer

'analyzeDeclarations' @ [94:46] ==> public final fun analyzeDeclarations(topDownAnalysisMode: TopDownAnalysisMode, declarations: Collection<PsiElement>, outerDataFlowInfo: DataFlowInfo = ...): TopDownAnalysisContext defined in org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer[SimpleFunctionDescriptorImpl]

'TopLevelDeclarations' @ [94:86] ==> enum entry TopLevelDeclarations defined in org.jetbrains.kotlin.resolve.TopDownAnalysisMode[FakeCallableDescriptorForObject]

'files' @ [94:108] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[ValueParameterDescriptorImpl]

'AnalysisResult' @ [96:16] ==> public companion object defined in org.jetbrains.kotlin.analyzer.AnalysisResult[FakeCallableDescriptorForObject]

'success' @ [96:31] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[SimpleFunctionDescriptorImpl]

'container' @ [96:39] ==> val container: ComponentProvider defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'get' @ [96:49] ==> public inline fun <reified T : Any> ComponentProvider.get(): BindingTrace defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> BindingTrace

'bindingContext' @ [96:69] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'moduleDescriptor' @ [96:85] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.analyzeFiles[LocalVariableDescriptor]

'component1' @ [110:14] ==> public final operator fun component1(): Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.ModuleContent[SimpleFunctionDescriptorImpl]

'component2' @ [110:30] ==> public final operator fun component2(): GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.ModuleContent[SimpleFunctionDescriptorImpl]

'moduleContent' @ [110:52] ==> value-parameter moduleContent: ModuleContent defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'moduleContext' @ [111:23] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'project' @ [111:37] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ModuleContext[PropertyDescriptorImpl]

'DeclarationProviderFactoryService' @ [112:42] ==> public companion object defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService[FakeCallableDescriptorForObject]

'createDeclarationProviderFactory' @ [112:76] ==> @JvmStatic public final fun createDeclarationProviderFactory(project: Project, storageManager: StorageManager, syntheticFiles: Collection<KtFile>, filesScope: GlobalSearchScope, moduleInfo: ModuleInfo): DeclarationProviderFactory defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion[SimpleFunctionDescriptorImpl]

'project' @ [113:17] ==> val project: Project defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleContext' @ [113:26] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'storageManager' @ [113:40] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[PropertyDescriptorImpl]

'syntheticFiles' @ [113:56] ==> val syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'if (moduleInfo.isLibrary) GlobalSearchScope.EMPTY_SCOPE else moduleContentScope' @ [114:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (GlobalSearchScope..GlobalSearchScope?), elseBranch: (GlobalSearchScope..GlobalSearchScope?)): (GlobalSearchScope..GlobalSearchScope?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.search.GlobalSearchScope..com.intellij.psi.search.GlobalSearchScope?)

'moduleInfo' @ [114:21] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'isLibrary' @ [114:32] ==> public open val isLibrary: Boolean defined in org.jetbrains.kotlin.analyzer.ModuleInfo[PropertyDescriptorImpl]

'EMPTY_SCOPE' @ [114:61] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'moduleContentScope' @ [114:78] ==> val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleInfo' @ [115:17] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'CodeAnalyzerInitializer' @ [118:21] ==> public companion object defined in org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer[FakeCallableDescriptorForObject]

'getInstance' @ [118:45] ==> public final fun getInstance(project: Project): CodeAnalyzerInitializer defined in org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer.Companion[SimpleFunctionDescriptorImpl]

'project' @ [118:57] ==> val project: Project defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'createTrace' @ [118:66] ==> public abstract fun createTrace(): BindingTrace defined in org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer[SimpleFunctionDescriptorImpl]

'createContainerToResolveCommonCode' @ [119:25] ==> private final fun createContainerToResolveCommonCode(moduleContext: ModuleContext, bindingTrace: BindingTrace, declarationProviderFactory: DeclarationProviderFactory, moduleContentScope: GlobalSearchScope, targetEnvironment: TargetEnvironment, packagePartProvider: PackagePartProvider, languageVersionSettings: LanguageVersionSettings): StorageComponentContainer defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade[SimpleFunctionDescriptorImpl]

'moduleContext' @ [120:17] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'trace' @ [120:32] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'declarationProviderFactory' @ [120:39] ==> val declarationProviderFactory: DeclarationProviderFactory defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleContentScope' @ [120:67] ==> val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'targetEnvironment' @ [120:87] ==> value-parameter targetEnvironment: TargetEnvironment defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'packagePartProvider' @ [120:106] ==> value-parameter packagePartProvider: PackagePartProvider defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'languageSettingsProvider' @ [121:17] ==> value-parameter languageSettingsProvider: LanguageSettingsProvider defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'getLanguageVersionSettings' @ [121:42] ==> public abstract fun getLanguageVersionSettings(moduleInfo: ModuleInfo, project: Project): LanguageVersionSettings defined in org.jetbrains.kotlin.analyzer.LanguageSettingsProvider[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [121:69] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'project' @ [121:81] ==> val project: Project defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'listOf' @ [124:40] ==> public fun <T> listOf(vararg elements: PackageFragmentProvider): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'container' @ [125:17] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'get' @ [125:27] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'packageFragmentProvider' @ [125:49] ==> public final val ResolveSession.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'container' @ [126:17] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'get' @ [126:27] ==> public inline fun <reified T : Any> ComponentProvider.get(): MetadataPackageFragmentProvider defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MetadataPackageFragmentProvider

'ResolverForModule' @ [129:16] ==> public constructor ResolverForModule(packageFragmentProvider: PackageFragmentProvider, componentProvider: ComponentProvider) defined in org.jetbrains.kotlin.analyzer.ResolverForModule[ClassConstructorDescriptorImpl]

'CompositePackageFragmentProvider' @ [129:34] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'packageFragmentProviders' @ [129:67] ==> val packageFragmentProviders: List<PackageFragmentProvider> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'container' @ [129:94] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'createContainer' @ [140:36] ==> public fun createContainer(id: String, platform: TargetPlatform, init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.resolve in file TargetPlatform.kt[SimpleFunctionDescriptorImpl]

'targetPlatform' @ [140:73] ==> public open val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade[PropertyDescriptorImpl]

'configureModule' @ [141:9] ==> public fun StorageComponentContainer.configureModule(moduleContext: ModuleContext, platform: TargetPlatform, platformVersion: TargetPlatformVersion, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.frontend.di in file injection.kt[SimpleFunctionDescriptorImpl]

'moduleContext' @ [141:25] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'targetPlatform' @ [141:40] ==> public open val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade[PropertyDescriptorImpl]

'NoVersion' @ [141:78] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'bindingTrace' @ [141:89] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'useInstance' @ [143:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'moduleContentScope' @ [143:21] ==> value-parameter moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'useInstance' @ [144:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'DO_NOTHING' @ [144:35] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'useImpl' @ [145:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'useImpl' @ [146:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LazyTopDownAnalyzer

'useInstance' @ [147:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [147:21] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'useImpl' @ [148:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> AnnotationResolverImpl

'useImpl' @ [149:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CompilerDeserializationConfiguration

'useInstance' @ [150:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'packagePartProvider' @ [150:21] ==> value-parameter packagePartProvider: PackagePartProvider defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'useInstance' @ [151:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'declarationProviderFactory' @ [151:21] ==> value-parameter declarationProviderFactory: DeclarationProviderFactory defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'useImpl' @ [152:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MetadataPackageFragmentProvider

'?:' @ [154:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: MetadataFinderFactory?, right: MetadataFinderFactory): MetadataFinderFactory[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MetadataFinderFactory

'getService' @ [154:52] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(MetadataFinderFactory..MetadataFinderFactory?)>): (MetadataFinderFactory..MetadataFinderFactory?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.load.kotlin.MetadataFinderFactory..org.jetbrains.kotlin.load.kotlin.MetadataFinderFactory?)

'moduleContext' @ [154:63] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'project' @ [154:77] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ModuleContext[PropertyDescriptorImpl]

'java' @ [154:115] ==> public val <T> KClass<MetadataFinderFactory>.java: Class<MetadataFinderFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MetadataFinderFactory

'error' @ [155:40] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'useInstance' @ [156:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'metadataFinderFactory' @ [156:21] ==> val metadataFinderFactory: MetadataFinderFactory defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode.<anonymous>[LocalVariableDescriptor]

'create' @ [156:43] ==> public abstract fun create(scope: GlobalSearchScope): KotlinMetadataFinder defined in org.jetbrains.kotlin.load.kotlin.MetadataFinderFactory[SimpleFunctionDescriptorImpl]

'moduleContentScope' @ [156:50] ==> value-parameter moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'targetEnvironment' @ [158:9] ==> value-parameter targetEnvironment: TargetEnvironment defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode[ValueParameterDescriptorImpl]

'configure' @ [158:27] ==> public abstract fun configure(container: StorageComponentContainer): Unit defined in org.jetbrains.kotlin.resolve.TargetEnvironment[SimpleFunctionDescriptorImpl]

'this' @ [158:37] ==> <this> defined in org.jetbrains.kotlin.analyzer.common.DefaultAnalyzerFacade.createContainerToResolveCommonCode.<anonymous>[ReceiverParameterDescriptorImpl]

'Default' @ [162:32] ==> public object Default : TargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[FakeCallableDescriptorForObject]

