'providedBuiltIns' @ [56:20] ==> value-parameter providedBuiltIns: KotlinBuiltIns? defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'createBuiltIns' @ [56:40] ==> private fun createBuiltIns(settings: PlatformAnalysisSettings, sdkContext: GlobalContextImpl): KotlinBuiltIns defined in org.jetbrains.kotlin.idea.caches.resolve in file ModuleDependencyMapper.kt[SimpleFunctionDescriptorImpl]

'analysisSettings' @ [56:55] ==> value-parameter analysisSettings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'globalContext' @ [56:73] ==> value-parameter globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'allModules' @ [58:27] ==> value-parameter allModules: Collection<IdeaModuleInfo>? defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'collectAllModuleInfosFromIdeaModel' @ [58:41] ==> public fun collectAllModuleInfosFromIdeaModel(project: Project): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'project' @ [58:76] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'toHashSet' @ [58:86] ==> public fun <T> Iterable<IdeaModuleInfo>.toHashSet(): HashSet<IdeaModuleInfo> /* = HashSet<IdeaModuleInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'syntheticFiles' @ [60:34] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'groupBy' @ [60:49] ==> public inline fun <T, K> Iterable<KtFile>.groupBy(keySelector: (KtFile) -> IdeaModuleInfo): Map<IdeaModuleInfo, List<KtFile>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <K> -> IdeaModuleInfo

'KtFile' @ [60:57] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'syntheticFilesByModule' @ [61:33] ==> val syntheticFilesByModule: Map<IdeaModuleInfo, List<KtFile>> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'keys' @ [61:56] ==> public abstract val keys: Set<IdeaModuleInfo> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'allModuleInfos' @ [62:5] ==> val allModuleInfos: HashSet<IdeaModuleInfo> /* = HashSet<IdeaModuleInfo> */ defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'addAll' @ [62:20] ==> public open fun addAll(elements: Collection<IdeaModuleInfo>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'syntheticFilesModules' @ [62:27] ==> val syntheticFilesModules: Set<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'allModuleInfos' @ [64:39] ==> val allModuleInfos: HashSet<IdeaModuleInfo> /* = HashSet<IdeaModuleInfo> */ defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'filter' @ [64:54] ==> public inline fun <T> Iterable<IdeaModuleInfo>.filter(predicate: (IdeaModuleInfo) -> Boolean): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'moduleFilter' @ [64:61] ==> value-parameter moduleFilter: (IdeaModuleInfo) -> Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'ModuleContent' @ [67:9] ==> public constructor ModuleContent(syntheticFiles: Collection<KtFile>, moduleContentScope: GlobalSearchScope) defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedClassConstructorDescriptor]

'syntheticFilesByModule' @ [67:23] ==> val syntheticFilesByModule: Map<IdeaModuleInfo, List<KtFile>> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'module' @ [67:46] ==> value-parameter module: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [67:57] ==> @InlineOnly public inline fun <T> listOf(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'module' @ [67:67] ==> value-parameter module: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'contentScope' @ [67:74] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'JvmPlatformParameters' @ [70:33] ==> public constructor JvmPlatformParameters(moduleByJavaClass: (JavaClass) -> ModuleInfo?) defined in org.jetbrains.kotlin.resolve.jvm.JvmPlatformParameters[DeserializedClassConstructorDescriptor]

'javaClass' @ [71:25] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [71:53] ==> public final val JavaClassImpl.psi: PsiClass[MyPropertyDescriptor]

'psiClass' @ [72:9] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[LocalVariableDescriptor]

'getNullableModuleInfo' @ [72:18] ==> public fun PsiElement.getNullableModuleInfo(): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'ResolverForProjectImpl' @ [75:30] ==> public constructor ResolverForProjectImpl<M : ModuleInfo>(debugName: String, projectContext: ProjectContext, modules: Collection<IdeaModuleInfo>, analyzerFacade: (IdeaModuleInfo) -> AnalyzerFacade, modulesContent: (IdeaModuleInfo) -> ModuleContent, platformParameters: PlatformAnalysisParameters, targetEnvironment: TargetEnvironment = ..., builtIns: KotlinBuiltIns = ..., delegateResolver: ResolverForProject<IdeaModuleInfo> = ..., packagePartProviderFactory: (IdeaModuleInfo, ModuleContent) -> PackagePartProvider = ..., firstDependency: IdeaModuleInfo? = ..., modulePlatforms: (IdeaModuleInfo) -> MultiTargetPlatform?, packageOracleFactory: PackageOracleFactory = ..., languageSettingsProvider: LanguageSettingsProvider = ..., invalidateOnOOCB: Boolean = ...) defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <M : ModuleInfo> -> IdeaModuleInfo

'debugName' @ [76:13] ==> value-parameter debugName: String defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'globalContext' @ [76:24] ==> value-parameter globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'withProject' @ [76:38] ==> public fun GlobalContext.withProject(project: Project): ProjectContext defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'project' @ [76:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'modulesToCreateResolversFor' @ [76:60] ==> val modulesToCreateResolversFor: List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'module' @ [78:32] ==> value-parameter module: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'platform' @ [78:39] ==> public open val platform: TargetPlatform? defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[DeserializedPropertyDescriptor]

'analysisSettings' @ [78:51] ==> value-parameter analysisSettings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'platform' @ [78:68] ==> public final val platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'IdePlatformSupport' @ [79:17] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.IdePlatformSupport[FakeCallableDescriptorForObject]

'facades' @ [79:36] ==> public final val facades: Map<TargetPlatform, AnalyzerFacade> defined in org.jetbrains.kotlin.caches.resolve.IdePlatformSupport.Companion[PropertyDescriptorImpl]

'platform' @ [79:44] ==> val platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[LocalVariableDescriptor]

'UnsupportedOperationException' @ [79:63] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'platform' @ [79:116] ==> val platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[LocalVariableDescriptor]

'modulesContent' @ [81:13] ==> val modulesContent: (IdeaModuleInfo) -> ModuleContent defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'jvmPlatformParameters' @ [81:29] ==> val jvmPlatformParameters: JvmPlatformParameters defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'IdeaEnvironment' @ [82:13] ==> public object IdeaEnvironment : TargetEnvironment defined in org.jetbrains.kotlin.idea.project in file IdeaEnvironment.kt[FakeCallableDescriptorForObject]

'builtIns' @ [82:30] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'delegateResolver' @ [83:13] ==> value-parameter delegateResolver: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'IDEPackagePartProvider' @ [83:41] ==> public constructor IDEPackagePartProvider(scope: GlobalSearchScope) defined in org.jetbrains.kotlin.idea.caches.resolve.IDEPackagePartProvider[ClassConstructorDescriptorImpl]

'c' @ [83:64] ==> value-parameter c: ModuleContent defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'moduleContentScope' @ [83:66] ==> public final val moduleContentScope: GlobalSearchScope defined in org.jetbrains.kotlin.analyzer.ModuleContent[DeserializedPropertyDescriptor]

'analysisSettings' @ [84:13] ==> value-parameter analysisSettings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'sdk' @ [84:30] ==> public final val sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'let' @ [84:35] ==> @InlineOnly public inline fun <T, R> Sdk.let(block: (Sdk) -> SdkInfo): SdkInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk
    <R> -> SdkInfo

'SdkInfo' @ [84:41] ==> public constructor SdkInfo(project: Project, sdk: Sdk) defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[ClassConstructorDescriptorImpl]

'project' @ [84:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'it' @ [84:58] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [85:43] ==> value-parameter module: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'platform' @ [85:50] ==> public open val platform: TargetPlatform? defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[DeserializedPropertyDescriptor]

'multiTargetPlatform' @ [85:60] ==> public abstract val multiTargetPlatform: MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedPropertyDescriptor]

'project' @ [86:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'service' @ [86:44] ==> public inline fun <reified T : Any> Project.service(): IdePackageOracleFactory defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> IdePackageOracleFactory

'IDELanguageSettingsProvider' @ [87:41] ==> public object IDELanguageSettingsProvider : LanguageSettingsProvider defined in org.jetbrains.kotlin.idea.compiler in file IDELanguageSettingsProvider.kt[FakeCallableDescriptorForObject]

'invalidateOnOOCB' @ [88:32] ==> value-parameter invalidateOnOOCB: Boolean = ... defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'providedBuiltIns' @ [91:9] ==> value-parameter providedBuiltIns: KotlinBuiltIns? defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'builtIns' @ [91:37] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'analysisSettings' @ [92:35] ==> value-parameter analysisSettings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'sdk' @ [92:52] ==> public final val sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'let' @ [92:58] ==> @InlineOnly public inline fun <T, R> Sdk.let(block: (Sdk) -> ModuleDescriptorImpl): ModuleDescriptorImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk
    <R> -> ModuleDescriptorImpl

'resolverForProject' @ [92:64] ==> val resolverForProject: ResolverForProjectImpl<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'descriptorForModule' @ [92:83] ==> public open fun descriptorForModule(moduleInfo: IdeaModuleInfo): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[DeserializedSimpleFunctionDescriptor]

'SdkInfo' @ [92:103] ==> public constructor SdkInfo(project: Project, sdk: Sdk) defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[ClassConstructorDescriptorImpl]

'project' @ [92:111] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'it' @ [92:120] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider.<anonymous>[ValueParameterDescriptorImpl]

'builtIns' @ [93:9] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'initialize' @ [93:18] ==> public final fun initialize(moduleDescriptor: ModuleDescriptor, isAdditionalBuiltInsFeatureSupported: Boolean): Unit defined in org.jetbrains.kotlin.platform.JvmBuiltIns[DeserializedSimpleFunctionDescriptor]

'sdkModuleDescriptor' @ [93:29] ==> val sdkModuleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'analysisSettings' @ [93:50] ==> value-parameter analysisSettings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'isAdditionalBuiltInFeaturesSupported' @ [93:67] ==> public final val isAdditionalBuiltInFeaturesSupported: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'ModuleResolverProvider' @ [96:12] ==> public constructor ModuleResolverProvider(resolverForProject: ResolverForProject<IdeaModuleInfo>, builtIns: KotlinBuiltIns, cacheDependencies: Collection<Any>) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[ClassConstructorDescriptorImpl]

'resolverForProject' @ [97:13] ==> val resolverForProject: ResolverForProjectImpl<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'builtIns' @ [98:13] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[LocalVariableDescriptor]

'dependencies' @ [99:13] ==> value-parameter dependencies: Collection<Any> defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'listOf' @ [99:28] ==> public fun <T> listOf(element: ExceptionTracker): List<ExceptionTracker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExceptionTracker

'globalContext' @ [99:35] ==> value-parameter globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.createModuleResolverProvider[ValueParameterDescriptorImpl]

'exceptionTracker' @ [99:49] ==> public open val exceptionTracker: ExceptionTracker defined in org.jetbrains.kotlin.context.GlobalContextImpl[DeserializedPropertyDescriptor]

'getInstance' @ [104:37] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [104:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[ValueParameterDescriptorImpl]

'modules' @ [104:58] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'toList' @ [104:66] ==> public fun <T> Array<out (Module..Module?)>.toList(): List<(Module..Module?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'ideaModules' @ [105:31] ==> val ideaModules: List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'flatMap' @ [105:43] ==> public inline fun <T, R> Iterable<(Module..Module?)>.flatMap(transform: ((Module..Module?)) -> Iterable<ModuleSourceInfo>): List<ModuleSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <R> -> ModuleSourceInfo

'listOf' @ [105:53] ==> public fun <T> listOf(vararg elements: ModuleSourceInfo): List<ModuleSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceInfo

'it' @ [105:60] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>[ValueParameterDescriptorImpl]

'productionSourceInfo' @ [105:63] ==> public fun Module.productionSourceInfo(): ModuleProductionSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'it' @ [105:87] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>[ValueParameterDescriptorImpl]

'testSourceInfo' @ [105:90] ==> public fun Module.testSourceInfo(): ModuleTestSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'ideaModules' @ [108:25] ==> val ideaModules: List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'flatMap' @ [108:37] ==> public inline fun <T, R> Iterable<(Module..Module?)>.flatMap(transform: ((Module..Module?)) -> Iterable<Library?>): List<Library?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <R> -> Library?

'getInstance' @ [109:27] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'it' @ [109:39] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>[ValueParameterDescriptorImpl]

'orderEntries' @ [109:43] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [109:56] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<LibraryOrderEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> LibraryOrderEntry

'map' @ [109:94] ==> public inline fun <T, R> Iterable<LibraryOrderEntry>.map(transform: (LibraryOrderEntry) -> Library?): List<Library?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryOrderEntry
    <R> -> Library?

'it' @ [110:13] ==> value-parameter it: LibraryOrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'library' @ [110:16] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'filterNotNull' @ [112:7] ==> public fun <T : Any> Iterable<Library?>.filterNotNull(): List<Library> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Library

'toSet' @ [112:23] ==> public fun <T> Iterable<Library>.toSet(): Set<Library> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library

'ideaLibraries' @ [114:26] ==> val ideaLibraries: Set<Library> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'map' @ [114:40] ==> public inline fun <T, R> Iterable<Library>.map(transform: (Library) -> LibraryInfo): List<LibraryInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library
    <R> -> LibraryInfo

'LibraryInfo' @ [114:46] ==> public constructor LibraryInfo(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[ClassConstructorDescriptorImpl]

'project' @ [114:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[ValueParameterDescriptorImpl]

'it' @ [114:67] ==> value-parameter it: Library defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>[ValueParameterDescriptorImpl]

'ideaModules' @ [116:39] ==> val ideaModules: List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'flatMap' @ [116:51] ==> public inline fun <T, R> Iterable<(Module..Module?)>.flatMap(transform: ((Module..Module?)) -> Iterable<(Sdk..Sdk?)>): List<(Sdk..Sdk?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <R> -> (com.intellij.openapi.projectRoots.Sdk..com.intellij.openapi.projectRoots.Sdk?)

'getInstance' @ [117:27] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'it' @ [117:39] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>[ValueParameterDescriptorImpl]

'orderEntries' @ [117:43] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [117:56] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<JdkOrderEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> JdkOrderEntry

'map' @ [117:90] ==> public inline fun <T, R> Iterable<JdkOrderEntry>.map(transform: (JdkOrderEntry) -> (Sdk..Sdk?)): List<(Sdk..Sdk?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JdkOrderEntry
    <R> -> (com.intellij.openapi.projectRoots.Sdk..com.intellij.openapi.projectRoots.Sdk?)

'it' @ [118:13] ==> value-parameter it: JdkOrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'jdk' @ [118:16] ==> public final val JdkOrderEntry.jdk: (Sdk..Sdk?)[MyPropertyDescriptor]

'sdksFromModulesDependencies' @ [122:22] ==> val sdksFromModulesDependencies: List<(Sdk..Sdk?)> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'getAllProjectSdks' @ [122:52] ==> public fun getAllProjectSdks(): Collection<Sdk> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'filterNotNull' @ [122:73] ==> public fun <T : Any> Iterable<Sdk?>.filterNotNull(): List<Sdk> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Sdk

'toSet' @ [122:89] ==> public fun <T> Iterable<Sdk>.toSet(): Set<Sdk> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk

'map' @ [122:97] ==> public inline fun <T, R> Iterable<Sdk>.map(transform: (Sdk) -> SdkInfo): List<SdkInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk
    <R> -> SdkInfo

'SdkInfo' @ [122:103] ==> public constructor SdkInfo(project: Project, sdk: Sdk) defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[ClassConstructorDescriptorImpl]

'project' @ [122:111] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[ValueParameterDescriptorImpl]

'it' @ [122:120] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel.<anonymous>[ValueParameterDescriptorImpl]

'modulesSourcesInfos' @ [124:12] ==> val modulesSourcesInfos: List<ModuleSourceInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'librariesInfos' @ [124:34] ==> val librariesInfos: List<LibraryInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'sdksInfos' @ [124:51] ==> val sdksInfos: List<SdkInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.collectAllModuleInfosFromIdeaModel[LocalVariableDescriptor]

'IdePlatformSupport' @ [128:27] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.IdePlatformSupport[FakeCallableDescriptorForObject]

'platformSupport' @ [128:46] ==> public final val platformSupport: Map<TargetPlatform, (IdePlatformSupport..IdePlatformSupport?)> defined in org.jetbrains.kotlin.caches.resolve.IdePlatformSupport.Companion[PropertyDescriptorImpl]

'settings' @ [128:62] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.createBuiltIns[ValueParameterDescriptorImpl]

'platform' @ [128:71] ==> public final val platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'DefaultBuiltIns' @ [128:91] ==> public companion object defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns[FakeCallableDescriptorForObject]

'Instance' @ [128:107] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'supportInstance' @ [129:12] ==> val supportInstance: IdePlatformSupport defined in org.jetbrains.kotlin.idea.caches.resolve.createBuiltIns[LocalVariableDescriptor]

'createBuiltIns' @ [129:28] ==> public abstract fun createBuiltIns(settings: PlatformAnalysisSettings, sdkContext: GlobalContextImpl): KotlinBuiltIns defined in org.jetbrains.kotlin.caches.resolve.IdePlatformSupport[SimpleFunctionDescriptorImpl]

'settings' @ [129:43] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.createBuiltIns[ValueParameterDescriptorImpl]

'sdkContext' @ [129:53] ==> value-parameter sdkContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.createBuiltIns[ValueParameterDescriptorImpl]

'getInstance' @ [133:28] ==> public open fun getInstance(): (ProjectJdkTable..ProjectJdkTable?) defined in com.intellij.openapi.projectRoots.ProjectJdkTable[JavaMethodDescriptor]

'allJdks' @ [133:42] ==> public final val ProjectJdkTable.allJdks: (Array<(Sdk..Sdk?)>..Array<out (Sdk..Sdk?)>)[MyPropertyDescriptor]

'toList' @ [133:50] ==> public fun <T> Array<out (Sdk..Sdk?)>.toList(): List<(Sdk..Sdk?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.projectRoots.Sdk..com.intellij.openapi.projectRoots.Sdk?)

