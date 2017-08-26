'createContainer' @ [47:37] ==> public fun createContainer(id: String, platform: TargetPlatform, init: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'JsPlatform' @ [47:77] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve in file JsPlatform.kt[FakeCallableDescriptorForObject]

'configureModule' @ [48:9] ==> public fun StorageComponentContainer.configureModule(moduleContext: ModuleContext, platform: TargetPlatform, platformVersion: TargetPlatformVersion, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.frontend.di[DeserializedSimpleFunctionDescriptor]

'moduleContext' @ [48:25] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs[ValueParameterDescriptorImpl]

'JsPlatform' @ [48:40] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve in file JsPlatform.kt[FakeCallableDescriptorForObject]

'NoVersion' @ [48:74] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'bindingTrace' @ [48:85] ==> value-parameter bindingTrace: BindingTrace defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs[ValueParameterDescriptorImpl]

'useInstance' @ [50:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'declarationProviderFactory' @ [50:21] ==> value-parameter declarationProviderFactory: DeclarationProviderFactory defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs[ValueParameterDescriptorImpl]

'useImpl' @ [51:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> AnnotationResolverImpl

'CompilerEnvironment' @ [53:9] ==> public object CompilerEnvironment : TargetEnvironment defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'configure' @ [53:29] ==> public open fun configure(container: StorageComponentContainer): Unit defined in org.jetbrains.kotlin.resolve.CompilerEnvironment[DeserializedSimpleFunctionDescriptor]

'this' @ [53:39] ==> <this> defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs.<anonymous>[ReceiverParameterDescriptorImpl]

'useInstance' @ [54:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'lookupTracker' @ [54:21] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs[ValueParameterDescriptorImpl]

'useInstance' @ [56:9] ==> public fun StorageComponentContainer.useInstance(instance: Any): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [56:21] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs[ValueParameterDescriptorImpl]

'useImpl' @ [57:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'useImpl' @ [58:9] ==> public inline fun <reified T : Any> StorageComponentContainer.useImpl(): Unit defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LazyTopDownAnalyzer

'apply' @ [59:7] ==> @InlineOnly public inline fun <T> StorageComponentContainer.apply(block: StorageComponentContainer.() -> Unit): StorageComponentContainer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StorageComponentContainer

'mutableListOf' @ [60:36] ==> public fun <T> mutableListOf(vararg elements: PackageFragmentProvider): MutableList<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'get' @ [60:50] ==> public inline fun <reified T : Any> ComponentProvider.get(): KotlinCodeAnalyzer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KotlinCodeAnalyzer

'packageFragmentProvider' @ [60:76] ==> public final val KotlinCodeAnalyzer.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'get' @ [61:32] ==> public inline fun <reified T : Any> ComponentProvider.get(): ModuleDescriptorImpl defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ModuleDescriptorImpl

'fallbackPackage' @ [62:9] ==> value-parameter fallbackPackage: PackageFragmentProvider? defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs[ValueParameterDescriptorImpl]

'let' @ [62:26] ==> @InlineOnly public inline fun <T, R> PackageFragmentProvider.let(block: (PackageFragmentProvider) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider
    <R> -> Unit

'packagePartProviders' @ [62:32] ==> val packagePartProviders: MutableList<PackageFragmentProvider> defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs.<anonymous>[LocalVariableDescriptor]

'it' @ [62:56] ==> value-parameter it: PackageFragmentProvider defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [63:9] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs.<anonymous>[LocalVariableDescriptor]

'initialize' @ [63:26] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'CompositePackageFragmentProvider' @ [63:37] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'packagePartProviders' @ [63:70] ==> val packagePartProviders: MutableList<PackageFragmentProvider> defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs.<anonymous>[LocalVariableDescriptor]

'storageComponentContainer' @ [65:12] ==> val storageComponentContainer: StorageComponentContainer defined in org.jetbrains.kotlin.frontend.js.di.createTopDownAnalyzerForJs[LocalVariableDescriptor]

'get' @ [65:38] ==> public inline fun <reified T : Any> ComponentProvider.get(): LazyTopDownAnalyzer defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LazyTopDownAnalyzer

