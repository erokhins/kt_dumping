'AnalyzerFacade' @ [46:28] ==> public constructor AnalyzerFacade() defined in org.jetbrains.kotlin.analyzer.AnalyzerFacade[DeserializedClassConstructorDescriptor]

'component1' @ [58:14] ==> public final operator fun component1(): Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedSimpleFunctionDescriptor]

'component2' @ [58:30] ==> public final operator fun component2(): GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedSimpleFunctionDescriptor]

'moduleContent' @ [58:52] ==> value-parameter moduleContent: ModuleContent defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'moduleContext' @ [59:23] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'project' @ [59:37] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'DeclarationProviderFactoryService' @ [60:42] ==> public companion object defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService[FakeCallableDescriptorForObject]

'createDeclarationProviderFactory' @ [60:76] ==> @JvmStatic public final fun createDeclarationProviderFactory(project: Project, storageManager: StorageManager, syntheticFiles: Collection<KtFile>, filesScope: GlobalSearchScope, moduleInfo: ModuleInfo): DeclarationProviderFactory defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [61:17] ==> val project: Project defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleContext' @ [61:26] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'storageManager' @ [61:40] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'syntheticFiles' @ [61:56] ==> val syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'if (moduleInfo.isLibrary) GlobalSearchScope.EMPTY_SCOPE else moduleContentScope' @ [62:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (GlobalSearchScope..GlobalSearchScope?), elseBranch: (GlobalSearchScope..GlobalSearchScope?)): (GlobalSearchScope..GlobalSearchScope?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.search.GlobalSearchScope..com.intellij.psi.search.GlobalSearchScope?)

'moduleInfo' @ [62:21] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'isLibrary' @ [62:32] ==> public open val isLibrary: Boolean defined in org.jetbrains.kotlin.analyzer.ModuleInfo[DeserializedPropertyDescriptor]

'EMPTY_SCOPE' @ [62:61] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'moduleContentScope' @ [62:78] ==> val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleInfo' @ [63:17] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'ModuleClassResolverImpl' @ [66:35] ==> public constructor ModuleClassResolverImpl(descriptorResolverByJavaClass: (JavaClass) -> JavaDescriptorResolver) defined in org.jetbrains.kotlin.load.java.lazy.ModuleClassResolverImpl[DeserializedClassConstructorDescriptor]

'platformParameters' @ [67:42] ==> value-parameter platformParameters: PlatformAnalysisParameters defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'invoke' @ [67:87] ==> public abstract operator fun invoke(p1: JavaClass): ModuleInfo? defined in kotlin.Function1[FunctionInvokeDescriptor]

'javaClass' @ [67:105] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [72:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'referencedClassModule' @ [73:47] ==> val referencedClassModule: ModuleInfo? defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>[LocalVariableDescriptor]

'let' @ [73:70] ==> @InlineOnly public inline fun <T, R> ModuleInfo.let(block: (ModuleInfo) -> ResolverForModule?): ResolverForModule? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleInfo
    <R> -> ResolverForModule?

'resolverForProject' @ [73:76] ==> value-parameter resolverForProject: ResolverForProject<M> defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'tryGetResolverForModule' @ [73:95] ==> public abstract fun tryGetResolverForModule(moduleInfo: M): ResolverForModule? defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'it' @ [73:119] ==> value-parameter it: ModuleInfo defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolverForReferencedModule' @ [75:37] ==> val resolverForReferencedModule: ResolverForModule? defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>[LocalVariableDescriptor]

'run' @ [75:68] ==> @InlineOnly public inline fun <T, R> JvmAnalyzerFacade.run(block: JvmAnalyzerFacade.() -> ResolverForModule): ResolverForModule defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmAnalyzerFacade
    <R> -> ResolverForModule

'LOG' @ [76:17] ==> private final val LOG: Logger defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade[PropertyDescriptorImpl]

'warn' @ [76:21] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'referencedClassModule' @ [76:44] ==> val referencedClassModule: ModuleInfo? defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>[LocalVariableDescriptor]

'moduleInfo' @ [76:72] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'javaClass' @ [76:107] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>[ValueParameterDescriptorImpl]

'resolverForProject' @ [79:17] ==> value-parameter resolverForProject: ResolverForProject<M> defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'resolverForModule' @ [79:36] ==> public final fun resolverForModule(moduleInfo: M): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [79:54] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'resolverForModule' @ [81:13] ==> val resolverForModule: ResolverForModule defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>[LocalVariableDescriptor]

'componentProvider' @ [81:31] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'get' @ [81:49] ==> public inline fun <reified T : Any> ComponentProvider.get(): JavaDescriptorResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaDescriptorResolver

'languageSettingsProvider' @ [84:25] ==> value-parameter languageSettingsProvider: LanguageSettingsProvider defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'getTargetPlatform' @ [84:50] ==> public abstract fun getTargetPlatform(moduleInfo: ModuleInfo): TargetPlatformVersion defined in org.jetbrains.kotlin.analyzer.LanguageSettingsProvider[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [84:68] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'JVM_1_6' @ [84:107] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'languageSettingsProvider' @ [85:39] ==> value-parameter languageSettingsProvider: LanguageSettingsProvider defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'getLanguageVersionSettings' @ [85:64] ==> public abstract fun getLanguageVersionSettings(moduleInfo: ModuleInfo, project: Project): LanguageVersionSettings defined in org.jetbrains.kotlin.analyzer.LanguageSettingsProvider[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [85:91] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'project' @ [85:103] ==> val project: Project defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'CodeAnalyzerInitializer' @ [87:21] ==> public companion object defined in org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer[FakeCallableDescriptorForObject]

'getInstance' @ [87:45] ==> public final fun getInstance(project: Project): CodeAnalyzerInitializer defined in org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [87:57] ==> val project: Project defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'createTrace' @ [87:66] ==> public abstract fun createTrace(): BindingTrace defined in org.jetbrains.kotlin.resolve.CodeAnalyzerInitializer[DeserializedSimpleFunctionDescriptor]

'createContainerForLazyResolveWithJava' @ [89:25] ==> public fun createContainerForLazyResolveWithJava(moduleContext: ModuleContext, bindingTrace: BindingTrace, declarationProviderFactory: DeclarationProviderFactory, moduleContentScope: GlobalSearchScope, moduleClassResolver: ModuleClassResolver, targetEnvironment: TargetEnvironment, lookupTracker: LookupTracker, packagePartProvider: PackagePartProvider, jvmTarget: JvmTarget, languageVersionSettings: LanguageVersionSettings, useBuiltInsProvider: Boolean, configureJavaClassFinder: (StorageComponentContainer.() -> Unit)? = ...): StorageComponentContainer defined in org.jetbrains.kotlin.frontend.java.di in file injection.kt[SimpleFunctionDescriptorImpl]

'moduleContext' @ [90:17] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'trace' @ [91:17] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'declarationProviderFactory' @ [92:17] ==> val declarationProviderFactory: DeclarationProviderFactory defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleContentScope' @ [93:17] ==> val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleClassResolver' @ [94:17] ==> val moduleClassResolver: ModuleClassResolverImpl defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'targetEnvironment' @ [95:17] ==> value-parameter targetEnvironment: TargetEnvironment defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'DO_NOTHING' @ [96:31] ==> public object DO_NOTHING : LookupTracker defined in org.jetbrains.kotlin.incremental.components.LookupTracker[FakeCallableDescriptorForObject]

'packagePartProvider' @ [97:17] ==> value-parameter packagePartProvider: PackagePartProvider defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'jvmTarget' @ [98:17] ==> val jvmTarget: JvmTarget defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'languageVersionSettings' @ [99:17] ==> val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'container' @ [103:30] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'get' @ [103:40] ==> public inline fun <reified T : Any> ComponentProvider.get(): ResolveSession defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ResolveSession

'container' @ [104:38] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'get' @ [104:48] ==> public inline fun <reified T : Any> ComponentProvider.get(): JavaDescriptorResolver defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> JavaDescriptorResolver

'arrayListOf' @ [106:34] ==> public fun <T> arrayListOf(vararg elements: PackageFragmentProvider): ArrayList<PackageFragmentProvider> /* = ArrayList<PackageFragmentProvider> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProvider

'resolveSession' @ [107:17] ==> val resolveSession: ResolveSession defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'packageFragmentProvider' @ [107:32] ==> public final val ResolveSession.packageFragmentProvider: PackageFragmentProvider[MyPropertyDescriptor]

'javaDescriptorResolver' @ [108:17] ==> val javaDescriptorResolver: JavaDescriptorResolver defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'packageFragmentProvider' @ [108:40] ==> public final val packageFragmentProvider: LazyJavaPackageFragmentProvider defined in org.jetbrains.kotlin.resolve.jvm.JavaDescriptorResolver[DeserializedPropertyDescriptor]

'providersForModule' @ [110:9] ==> val providersForModule: ArrayList<PackageFragmentProvider> /* = ArrayList<PackageFragmentProvider> */ defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'getInstances' @ [110:64] ==> public final fun getInstances(project: Project): List<PackageFragmentProviderExtension> defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [110:77] ==> val project: Project defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'mapNotNull' @ [111:18] ==> public inline fun <T, R : Any> Iterable<PackageFragmentProviderExtension>.mapNotNull(transform: (PackageFragmentProviderExtension) -> PackageFragmentProvider?): List<PackageFragmentProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentProviderExtension
    <R : Any> -> PackageFragmentProvider

'it' @ [111:31] ==> value-parameter it: PackageFragmentProviderExtension defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule.<anonymous>[ValueParameterDescriptorImpl]

'getPackageFragmentProvider' @ [111:34] ==> public abstract fun getPackageFragmentProvider(project: Project, module: ModuleDescriptor, storageManager: StorageManager, trace: BindingTrace, moduleInfo: ModuleInfo?): PackageFragmentProvider? defined in org.jetbrains.kotlin.resolve.jvm.extensions.PackageFragmentProviderExtension[SimpleFunctionDescriptorImpl]

'project' @ [111:61] ==> val project: Project defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleDescriptor' @ [111:70] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'moduleContext' @ [111:88] ==> value-parameter moduleContext: ModuleContext defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'storageManager' @ [111:102] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ModuleContext[DeserializedPropertyDescriptor]

'trace' @ [111:118] ==> val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'moduleInfo' @ [111:125] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[ValueParameterDescriptorImpl]

'ResolverForModule' @ [113:16] ==> public constructor ResolverForModule(packageFragmentProvider: PackageFragmentProvider, componentProvider: ComponentProvider) defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedClassConstructorDescriptor]

'CompositePackageFragmentProvider' @ [113:34] ==> public constructor CompositePackageFragmentProvider(providers: List<PackageFragmentProvider>) defined in org.jetbrains.kotlin.descriptors.impl.CompositePackageFragmentProvider[DeserializedClassConstructorDescriptor]

'providersForModule' @ [113:67] ==> val providersForModule: ArrayList<PackageFragmentProvider> /* = ArrayList<PackageFragmentProvider> */ defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'container' @ [113:88] ==> val container: StorageComponentContainer defined in org.jetbrains.kotlin.resolve.jvm.JvmAnalyzerFacade.createResolverForModule[LocalVariableDescriptor]

'JvmPlatform' @ [117:17] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform in file JvmPlatform.kt[FakeCallableDescriptorForObject]

'getInstance' @ [119:30] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'JvmAnalyzerFacade' @ [119:42] ==> public object JvmAnalyzerFacade : AnalyzerFacade defined in org.jetbrains.kotlin.resolve.jvm in file JvmAnalyzerFacade.kt[FakeCallableDescriptorForObject]

'java' @ [119:67] ==> public val <T> KClass<JvmAnalyzerFacade>.java: Class<JvmAnalyzerFacade> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JvmAnalyzerFacade

