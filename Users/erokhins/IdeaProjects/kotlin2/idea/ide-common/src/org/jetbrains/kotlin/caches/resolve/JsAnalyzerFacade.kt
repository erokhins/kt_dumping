'AnalyzerFacade' @ [40:27] ==> public constructor AnalyzerFacade() defined in org.jetbrains.kotlin.analyzer.AnalyzerFacade[DeserializedClassConstructorDescriptor]

'component1' @ [53:14] ==> public final operator fun component1(): Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedSimpleFunctionDescriptor]

'component2' @ [53:30] ==> public final operator fun component2(): GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedSimpleFunctionDescriptor]

'moduleContent' @ [53:52] ==> value-parameter moduleContent: ModuleContent defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'moduleContext' @ [54:23] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'project' @ [54:37] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'DeclarationProviderFactoryService' @ [55:42] ==> public companion object defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService[FakeCallableDescriptorForObject]

'createDeclarationProviderFactory' @ [55:76] ==> @JvmStatic public final fun createDeclarationProviderFactory(project: Project, storageManager: StorageManager, syntheticFiles: Collection<KtFile>, filesScope: GlobalSearchScope, moduleInfo: ModuleInfo): DeclarationProviderFactory defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [56:17] ==> val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleContext' @ [57:17] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'storageManager' @ [57:31] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'syntheticFiles' @ [58:17] ==> val syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'if (moduleInfo.isLibrary) GlobalSearchScope.EMPTY_SCOPE else moduleContentScope' @ [59:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GlobalSearchScope, elseBranch: GlobalSearchScope): GlobalSearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GlobalSearchScope

'moduleInfo' @ [59:21] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'isLibrary' @ [59:32] ==> public open val isLibrary: Boolean defined in org.jetbrains.kotlin.analyzer.ModuleInfo[DeserializedPropertyDescriptor]

'EMPTY_SCOPE' @ [59:61] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'moduleContentScope' @ [59:78] ==> val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleInfo' @ [60:17] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'createContainerForLazyResolve' @ [63:25] ==> public fun createContainerForLazyResolve(moduleContext: ModuleContext, declarationProviderFactory: DeclarationProviderFactory, bindingTrace: BindingTrace, platform: TargetPlatform, targetPlatformVersion: TargetPlatformVersion, targetEnvironment: TargetEnvironment, languageVersionSettings: LanguageVersionSettings): StorageComponentContainer defined in org.jetbrains.kotlin.frontend.di[DeserializedSimpleFunctionDescriptor]

'moduleContext' @ [64:17] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'declarationProviderFactory' @ [65:17] ==> val declarationProviderFactory: DeclarationProviderFactory defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'BindingTraceContext' @ [66:17] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'JsPlatform' @ [67:17] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'NoVersion' @ [68:39] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'targetEnvironment' @ [69:17] ==> value-parameter targetEnvironment: TargetEnvironment defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'languageSettingsProvider' @ [70:17] ==> value-parameter languageSettingsProvider: LanguageSettingsProvider defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'getLanguageVersionSettings' @ [70:42] ==> public abstract fun getLanguageVersionSettings(moduleInfo: ModuleInfo, project: Project): LanguageVersionSettings defined in org.jetbrains.kotlin.analyzer.LanguageSettingsProvider[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [70:69] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'project' @ [70:81] ==> val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'container' @ [72:39] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'get' @ [72:49] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'packageFragmentProvider' @ [72:71] ==> public final val ResolveSession.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'moduleInfo' @ [74:13] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'moduleInfo' @ [74:48] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'platform' @ [74:59] ==> public abstract val platform: TargetPlatform defined in org.jetbrains.kotlin.caches.resolve.LibraryModuleInfo[PropertyDescriptorImpl]

'JsPlatform' @ [74:71] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'moduleInfo' @ [75:29] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'getLibraryRoots' @ [75:40] ==> public abstract fun getLibraryRoots(): Collection<String> defined in org.jetbrains.kotlin.caches.resolve.LibraryModuleInfo[SimpleFunctionDescriptorImpl]

'flatMap' @ [76:22] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<KotlinJavascriptMetadata>): List<KotlinJavascriptMetadata> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> KotlinJavascriptMetadata

'KotlinJavascriptMetadataUtils' @ [76:32] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'loadMetadata' @ [76:62] ==> @JvmStatic public final fun loadMetadata(path: String): List<KotlinJavascriptMetadata> defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [76:75] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [77:22] ==> public inline fun <T> Iterable<KotlinJavascriptMetadata>.filter(predicate: (KotlinJavascriptMetadata) -> Boolean): List<KotlinJavascriptMetadata> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJavascriptMetadata

'it' @ [77:31] ==> value-parameter it: KotlinJavascriptMetadata defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [77:34] ==> public final val version: JsMetadataVersion defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadata[DeserializedPropertyDescriptor]

'isCompatible' @ [77:42] ==> public open fun isCompatible(): Boolean defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [78:22] ==> public inline fun <T, R : Any> Iterable<KotlinJavascriptMetadata>.mapNotNull(transform: (KotlinJavascriptMetadata) -> PackageFragmentProvider?): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJavascriptMetadata
    <R : Any> -> PackageFragmentProvider

'KotlinJavascriptSerializationUtil' @ [79:25] ==> public object KotlinJavascriptSerializationUtil defined in org.jetbrains.kotlin.serialization.js[FakeCallableDescriptorForObject]

'readModule' @ [79:59] ==> @JvmStatic public final fun readModule(metadata: ByteArray, storageManager: StorageManager, module: ModuleDescriptor, configuration: DeserializationConfiguration, lookupTracker: LookupTracker): JsModuleDescriptor<PackageFragmentProvider?> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [80:33] ==> value-parameter it: KotlinJavascriptMetadata defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [80:36] ==> public final val body: ByteArray defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadata[DeserializedPropertyDescriptor]

'moduleContext' @ [80:42] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'storageManager' @ [80:56] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'moduleDescriptor' @ [80:72] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'container' @ [80:90] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'get' @ [80:100] ==> public inline fun <reified T : Any> ComponentProvider.get(): DeserializationConfiguration defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DeserializationConfiguration

'DO_NOTHING' @ [81:47] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'data' @ [82:27] ==> public final val data: PackageFragmentProvider? defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[DeserializedPropertyDescriptor]

'providers' @ [85:17] ==> val providers: List<PackageFragmentProvider> defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'isNotEmpty' @ [85:27] ==> @InlineOnly public inline fun <T> Collection<PackageFragmentProvider>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'packageFragmentProvider' @ [86:17] ==> var packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'CompositePackageFragmentProvider' @ [86:43] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'listOf' @ [86:76] ==> public fun <T> listOf(element: PackageFragmentProvider): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'packageFragmentProvider' @ [86:83] ==> var packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'providers' @ [86:110] ==> val providers: List<PackageFragmentProvider> defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'ResolverForModule' @ [90:16] ==> public constructor ResolverForModule(packageFragmentProvider: PackageFragmentProvider, componentProvider: ComponentProvider) defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedClassConstructorDescriptor]

'packageFragmentProvider' @ [90:34] ==> var packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'container' @ [90:59] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.idea.caches.resolve.JsAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'JsPlatform' @ [94:17] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

