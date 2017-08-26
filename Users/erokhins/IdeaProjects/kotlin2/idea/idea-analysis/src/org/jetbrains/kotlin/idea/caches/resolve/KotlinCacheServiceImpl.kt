'getInstance' @ [59:27] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinCacheService' @ [59:39] ==> public companion object defined in org.jetbrains.kotlin.caches.resolve.KotlinCacheService[FakeCallableDescriptorForObject]

'java' @ [59:65] ==> public val <T> KClass<KotlinCacheService>.java: Class<KotlinCacheService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCacheService

'getFacadeToAnalyzeFiles' @ [68:16] ==> private final fun getFacadeToAnalyzeFiles(files: Collection<KtFile>): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'elements' @ [68:40] ==> value-parameter elements: List<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacade[ValueParameterDescriptorImpl]

'map' @ [68:49] ==> public inline fun <T, R> Iterable<KtElement>.map(transform: (KtElement) -> KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> KtFile

'it' @ [68:55] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacade.<anonymous>[ValueParameterDescriptorImpl]

'containingKtFile' @ [68:58] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'kotlinSuppressCache' @ [71:63] ==> private final val kotlinSuppressCache: CachedValue<KotlinSuppressCache> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'value' @ [71:83] ==> public final val <T : (Any..Any?)> CachedValue<KotlinSuppressCache>.value: (KotlinSuppressCache..KotlinSuppressCache?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinSuppressCache

'SLRUCache<PlatformAnalysisSettings, GlobalFacade>' @ [74:22] ==> protected/*protected and package*/ constructor SLRUCache<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUCache[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PlatformAnalysisSettings
    <V : (Any..Any?)> -> GlobalFacade

'*' @ [74:72] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'*' @ [74:83] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'GlobalFacade' @ [76:28] ==> public constructor GlobalFacade(settings: PlatformAnalysisSettings) defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[ClassConstructorDescriptorImpl]

'settings' @ [76:41] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.globalFacadesPerPlatformAndSdk.<no name provided>.createValue[ValueParameterDescriptorImpl]

'SLRUCache<ScriptModuleInfo, ProjectResolutionFacade>' @ [82:22] ==> protected/*protected and package*/ constructor SLRUCache<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUCache[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ScriptModuleInfo
    <V : (Any..Any?)> -> ProjectResolutionFacade

'createFacadeForScriptDependencies' @ [84:28] ==> private final fun createFacadeForScriptDependencies(dependenciesModuleInfo: ScriptDependenciesModuleInfo, syntheticFiles: Collection<KtFile> = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'ScriptDependenciesModuleInfo' @ [84:62] ==> public constructor ScriptDependenciesModuleInfo(project: Project, scriptModuleInfo: ScriptModuleInfo?) defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[ClassConstructorDescriptorImpl]

'project' @ [84:91] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'scriptModuleInfo' @ [84:100] ==> value-parameter scriptModuleInfo: ScriptModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.facadesForScriptDependencies.<no name provided>.createValue[ValueParameterDescriptorImpl]

'synchronized' @ [88:86] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> ProjectResolutionFacade): ProjectResolutionFacade defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> ProjectResolutionFacade

'facadesForScriptDependencies' @ [88:99] ==> private final val facadesForScriptDependencies: SLRUCache<ScriptModuleInfo, ProjectResolutionFacade> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'facadesForScriptDependencies' @ [89:9] ==> private final val facadesForScriptDependencies: SLRUCache<ScriptModuleInfo, ProjectResolutionFacade> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'get' @ [89:38] ==> @NotNull public open fun get(p0: (ScriptModuleInfo..ScriptModuleInfo?)): ProjectResolutionFacade defined in com.intellij.util.containers.SLRUCache[JavaMethodDescriptor]

'scriptModuleInfo' @ [89:42] ==> value-parameter scriptModuleInfo: ScriptModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeForScriptDependencies[ValueParameterDescriptorImpl]

'listOf' @ [94:50] ==> @InlineOnly public inline fun <T> listOf(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'findJdk' @ [96:19] ==> public fun findJdk(dependencies: ScriptDependencies?, project: Project): Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve in file ScriptModuleInfos.kt[SimpleFunctionDescriptorImpl]

'dependenciesModuleInfo' @ [96:27] ==> value-parameter dependenciesModuleInfo: ScriptDependenciesModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[ValueParameterDescriptorImpl]

'scriptModuleInfo' @ [96:50] ==> public final val scriptModuleInfo: ScriptModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'externalDependencies' @ [96:68] ==> public final val externalDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'project' @ [96:90] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'JvmPlatform' @ [97:24] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'PlatformAnalysisSettings' @ [98:25] ==> public constructor PlatformAnalysisSettings(platform: TargetPlatform, sdk: Sdk?, isAdditionalBuiltInFeaturesSupported: Boolean) defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[ClassConstructorDescriptorImpl]

'platform' @ [98:50] ==> val platform: JvmPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[LocalVariableDescriptor]

'sdk' @ [98:60] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[LocalVariableDescriptor]

'GlobalFacade' @ [99:25] ==> public constructor GlobalFacade(settings: PlatformAnalysisSettings) defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[ClassConstructorDescriptorImpl]

'facadeKey' @ [99:38] ==> val facadeKey: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[LocalVariableDescriptor]

'facadeForSdk' @ [99:49] ==> public final val facadeForSdk: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'sdkFacade' @ [100:29] ==> val sdkFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[LocalVariableDescriptor]

'globalContext' @ [100:39] ==> public final val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'contextWithNewLockAndCompositeExceptionTracker' @ [100:53] ==> internal fun GlobalContextImpl.contextWithNewLockAndCompositeExceptionTracker(): GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve in file globalContextUtils.kt[SimpleFunctionDescriptorImpl]

'ProjectResolutionFacade' @ [101:16] ==> public constructor ProjectResolutionFacade(debugString: String, resolverDebugName: String, project: Project, globalContext: GlobalContextImpl, settings: PlatformAnalysisSettings, reuseDataFrom: ProjectResolutionFacade?, moduleFilter: (IdeaModuleInfo) -> Boolean, dependencies: List<Any>, invalidateOnOOCB: Boolean = ..., syntheticFiles: Collection<KtFile> = ..., allModules: Collection<IdeaModuleInfo>? = ...) defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[ClassConstructorDescriptorImpl]

'project' @ [103:17] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'globalContext' @ [103:26] ==> val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[LocalVariableDescriptor]

'facadeKey' @ [103:41] ==> val facadeKey: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[LocalVariableDescriptor]

'sdkFacade' @ [104:33] ==> val sdkFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[LocalVariableDescriptor]

'dependenciesModuleInfo' @ [105:30] ==> value-parameter dependenciesModuleInfo: ScriptDependenciesModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[ValueParameterDescriptorImpl]

'dependencies' @ [105:53] ==> public open fun dependencies(): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[SimpleFunctionDescriptorImpl]

'listOf' @ [107:32] ==> public fun <T> listOf(vararg elements: (ModificationTracker..ModificationTracker?)): List<(ModificationTracker..ModificationTracker?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.ModificationTracker..com.intellij.openapi.util.ModificationTracker?)

'LibraryModificationTracker' @ [108:25] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [108:52] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [108:64] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'getInstance' @ [109:56] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [109:68] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'ScriptDependenciesModificationTracker' @ [110:25] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [110:63] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesModificationTracker defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [110:75] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'it' @ [112:34] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies.<anonymous>[ValueParameterDescriptorImpl]

'dependenciesModuleInfo' @ [112:40] ==> value-parameter dependenciesModuleInfo: ScriptDependenciesModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[ValueParameterDescriptorImpl]

'syntheticFiles' @ [113:34] ==> value-parameter syntheticFiles: Collection<KtFile> = ... defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForScriptDependencies[ValueParameterDescriptorImpl]

'GlobalContext' @ [119:34] ==> public fun GlobalContext(): GlobalContextImpl defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'ProjectResolutionFacade' @ [120:28] ==> public constructor ProjectResolutionFacade(debugString: String, resolverDebugName: String, project: Project, globalContext: GlobalContextImpl, settings: PlatformAnalysisSettings, reuseDataFrom: ProjectResolutionFacade?, moduleFilter: (IdeaModuleInfo) -> Boolean, dependencies: List<Any>, invalidateOnOOCB: Boolean = ..., syntheticFiles: Collection<KtFile> = ..., allModules: Collection<IdeaModuleInfo>? = ...) defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[ClassConstructorDescriptorImpl]

'settings' @ [121:40] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.<init>[ValueParameterDescriptorImpl]

'sdk' @ [121:49] ==> public final val sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'project' @ [122:17] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'sdkContext' @ [122:26] ==> private final val sdkContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'settings' @ [122:38] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.<init>[ValueParameterDescriptorImpl]

'it' @ [123:34] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.facadeForSdk.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [124:32] ==> public fun <T> listOf(vararg elements: (ModificationTracker..ModificationTracker?)): List<(ModificationTracker..ModificationTracker?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.ModificationTracker..com.intellij.openapi.util.ModificationTracker?)

'LibraryModificationTracker' @ [125:24] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [125:51] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [125:63] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'getInstance' @ [126:55] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [126:67] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'sdkContext' @ [132:40] ==> private final val sdkContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'contextWithNewLockAndCompositeExceptionTracker' @ [132:51] ==> internal fun GlobalContextImpl.contextWithNewLockAndCompositeExceptionTracker(): GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve in file globalContextUtils.kt[SimpleFunctionDescriptorImpl]

'ProjectResolutionFacade' @ [133:34] ==> public constructor ProjectResolutionFacade(debugString: String, resolverDebugName: String, project: Project, globalContext: GlobalContextImpl, settings: PlatformAnalysisSettings, reuseDataFrom: ProjectResolutionFacade?, moduleFilter: (IdeaModuleInfo) -> Boolean, dependencies: List<Any>, invalidateOnOOCB: Boolean = ..., syntheticFiles: Collection<KtFile> = ..., allModules: Collection<IdeaModuleInfo>? = ...) defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[ClassConstructorDescriptorImpl]

'settings' @ [134:73] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.<init>[ValueParameterDescriptorImpl]

'sdk' @ [134:82] ==> public final val sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'project' @ [135:17] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'librariesContext' @ [135:26] ==> private final val librariesContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'settings' @ [135:44] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.<init>[ValueParameterDescriptorImpl]

'facadeForSdk' @ [136:33] ==> public final val facadeForSdk: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'it' @ [137:34] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.facadeForLibraries.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [139:32] ==> public fun <T> listOf(vararg elements: (ModificationTracker..ModificationTracker?)): List<(ModificationTracker..ModificationTracker?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.ModificationTracker..com.intellij.openapi.util.ModificationTracker?)

'LibraryModificationTracker' @ [140:25] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [140:52] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [140:64] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'getInstance' @ [141:56] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [141:68] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'librariesContext' @ [145:38] ==> private final val librariesContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'contextWithNewLockAndCompositeExceptionTracker' @ [145:55] ==> internal fun GlobalContextImpl.contextWithNewLockAndCompositeExceptionTracker(): GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve in file globalContextUtils.kt[SimpleFunctionDescriptorImpl]

'ProjectResolutionFacade' @ [146:32] ==> public constructor ProjectResolutionFacade(debugString: String, resolverDebugName: String, project: Project, globalContext: GlobalContextImpl, settings: PlatformAnalysisSettings, reuseDataFrom: ProjectResolutionFacade?, moduleFilter: (IdeaModuleInfo) -> Boolean, dependencies: List<Any>, invalidateOnOOCB: Boolean = ..., syntheticFiles: Collection<KtFile> = ..., allModules: Collection<IdeaModuleInfo>? = ...) defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[ClassConstructorDescriptorImpl]

'settings' @ [147:88] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.<init>[ValueParameterDescriptorImpl]

'platform' @ [147:97] ==> public final val platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[PropertyDescriptorImpl]

'project' @ [148:17] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'modulesContext' @ [148:26] ==> private final val modulesContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'settings' @ [148:42] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.<init>[ValueParameterDescriptorImpl]

'facadeForLibraries' @ [149:33] ==> public final val facadeForLibraries: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'!' @ [150:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [150:35] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade.facadeForModules.<anonymous>[ValueParameterDescriptorImpl]

'isLibraryClasses' @ [150:38] ==> internal fun IdeaModuleInfo.isLibraryClasses(): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'listOf' @ [151:32] ==> public fun <T> listOf(vararg elements: (ModificationTracker..ModificationTracker?)): List<(ModificationTracker..ModificationTracker?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.ModificationTracker..com.intellij.openapi.util.ModificationTracker?)

'LibraryModificationTracker' @ [152:25] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [152:52] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [152:64] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'getInstance' @ [153:56] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [153:68] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'Deprecated' @ [158:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'PlatformAnalysisSettings' @ [160:24] ==> public constructor PlatformAnalysisSettings(platform: TargetPlatform, sdk: Sdk?, isAdditionalBuiltInFeaturesSupported: Boolean) defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[ClassConstructorDescriptorImpl]

'platform' @ [160:49] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getProjectService[ValueParameterDescriptorImpl]

'ideaModuleInfo' @ [160:59] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getProjectService[ValueParameterDescriptorImpl]

'sdk' @ [160:74] ==> private final val IdeaModuleInfo.sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'ideaModuleInfo' @ [160:79] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getProjectService[ValueParameterDescriptorImpl]

'supportsAdditionalBuiltInsMembers' @ [160:94] ==> private final fun IdeaModuleInfo.supportsAdditionalBuiltInsMembers(): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'globalFacade' @ [161:16] ==> private final fun globalFacade(settings: PlatformAnalysisSettings): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'settings' @ [161:29] ==> val settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getProjectService[LocalVariableDescriptor]

'resolverForModuleInfo' @ [161:39] ==> public final fun resolverForModuleInfo(moduleInfo: IdeaModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'ideaModuleInfo' @ [161:61] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getProjectService[ValueParameterDescriptorImpl]

'componentProvider' @ [161:77] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'getService' @ [161:95] ==> public fun <T : Any> ComponentProvider.getService(request: Class<T>): T defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'serviceClass' @ [161:106] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getProjectService[ValueParameterDescriptorImpl]

'IDELanguageSettingsProvider' @ [165:16] ==> public object IDELanguageSettingsProvider : LanguageSettingsProvider defined in org.jetbrains.kotlin.idea.compiler in file IDELanguageSettingsProvider.kt[FakeCallableDescriptorForObject]

'getLanguageVersionSettings' @ [166:18] ==> public open fun getLanguageVersionSettings(moduleInfo: ModuleInfo, project: Project): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider[SimpleFunctionDescriptorImpl]

'this' @ [166:45] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.supportsAdditionalBuiltInsMembers[ReceiverParameterDescriptorImpl]

'project' @ [166:51] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'supportsFeature' @ [167:18] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [167:34] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'AdditionalBuiltInsMembers' @ [167:50] ==> enum entry AdditionalBuiltInsMembers defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'PlatformAnalysisSettings' @ [171:24] ==> public constructor PlatformAnalysisSettings(platform: TargetPlatform, sdk: Sdk?, isAdditionalBuiltInFeaturesSupported: Boolean) defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[ClassConstructorDescriptorImpl]

'platform' @ [171:49] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.tryGetProjectService[ValueParameterDescriptorImpl]

'ideaModuleInfo' @ [171:59] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.tryGetProjectService[ValueParameterDescriptorImpl]

'sdk' @ [171:74] ==> private final val IdeaModuleInfo.sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'ideaModuleInfo' @ [171:79] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.tryGetProjectService[ValueParameterDescriptorImpl]

'supportsAdditionalBuiltInsMembers' @ [171:94] ==> private final fun IdeaModuleInfo.supportsAdditionalBuiltInsMembers(): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'globalFacade' @ [172:16] ==> private final fun globalFacade(settings: PlatformAnalysisSettings): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'settings' @ [172:29] ==> val settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.tryGetProjectService[LocalVariableDescriptor]

'tryGetResolverForModuleInfo' @ [172:39] ==> public final fun tryGetResolverForModuleInfo(moduleInfo: IdeaModuleInfo): ResolverForModule? defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'ideaModuleInfo' @ [172:67] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.tryGetProjectService[ValueParameterDescriptorImpl]

'componentProvider' @ [172:84] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'tryGetService' @ [172:103] ==> public fun <T : Any> ComponentProvider.tryGetService(request: Class<T>): T? defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'serviceClass' @ [172:117] ==> value-parameter serviceClass: Class<T> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.tryGetProjectService[ValueParameterDescriptorImpl]

'getOrBuildGlobalFacade' @ [176:13] ==> @Synchronized private final fun getOrBuildGlobalFacade(settings: PlatformAnalysisSettings): KotlinCacheServiceImpl.GlobalFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'settings' @ [176:36] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.globalFacade[ValueParameterDescriptorImpl]

'facadeForModules' @ [176:46] ==> public final val facadeForModules: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'getOrBuildGlobalFacade' @ [178:71] ==> @Synchronized private final fun getOrBuildGlobalFacade(settings: PlatformAnalysisSettings): KotlinCacheServiceImpl.GlobalFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'settings' @ [178:94] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.librariesFacade[ValueParameterDescriptorImpl]

'facadeForLibraries' @ [178:104] ==> public final val facadeForLibraries: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.GlobalFacade[PropertyDescriptorImpl]

'Synchronized' @ [180:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'globalFacadesPerPlatformAndSdk' @ [181:78] ==> private final val globalFacadesPerPlatformAndSdk: SLRUCache<PlatformAnalysisSettings, KotlinCacheServiceImpl.GlobalFacade> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'settings' @ [181:109] ==> value-parameter settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getOrBuildGlobalFacade[ValueParameterDescriptorImpl]

'dependencies' @ [183:50] ==> public abstract fun dependencies(): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'firstIsInstanceOrNull' @ [183:65] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): SdkInfo? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SdkInfo

'sdk' @ [183:99] ==> public final val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[PropertyDescriptorImpl]

'files' @ [187:30] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'map' @ [187:36] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> TargetPlatform): List<TargetPlatform> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> TargetPlatform

'getPlatform' @ [187:65] ==> @NotNull public open fun getPlatform(@NotNull file: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'it' @ [187:77] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [187:83] ==> public fun <T> Iterable<TargetPlatform>.toSet(): Set<TargetPlatform> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatform

'single' @ [187:91] ==> public fun <T> Iterable<TargetPlatform>.single(): TargetPlatform defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatform

'files' @ [188:35] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'map' @ [188:41] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> IdeaModuleInfo): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> IdeaModuleInfo

'KtFile' @ [188:45] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'toSet' @ [188:68] ==> public fun <T> Iterable<IdeaModuleInfo>.toSet(): Set<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'single' @ [188:76] ==> public fun <T> Iterable<IdeaModuleInfo>.single(): IdeaModuleInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'syntheticFileModule' @ [189:19] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'sdk' @ [189:39] ==> private final val IdeaModuleInfo.sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'PlatformAnalysisSettings' @ [190:24] ==> public constructor PlatformAnalysisSettings(platform: TargetPlatform, sdk: Sdk?, isAdditionalBuiltInFeaturesSupported: Boolean) defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[ClassConstructorDescriptorImpl]

'targetPlatform' @ [190:49] ==> val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'sdk' @ [190:65] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [190:70] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'supportsAdditionalBuiltInsMembers' @ [190:90] ==> private final fun IdeaModuleInfo.supportsAdditionalBuiltInsMembers(): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'if (files.all { it.originalFile != it }) {
            ModificationTracker {
                files.sumByLong { it.outOfBlockModificationCount }
            }
        }
        else {
            ModificationTracker {
                files.sumByLong { it.outOfBlockModificationCount + it.modificationStamp }
            }
        }' @ [193:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModificationTracker, elseBranch: ModificationTracker): ModificationTracker[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ModificationTracker

'files' @ [193:44] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'all' @ [193:50] ==> public inline fun <T> Iterable<KtFile>.all(predicate: (KtFile) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [193:56] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'originalFile' @ [193:59] ==> public final var KtFile.originalFile: PsiFile[MyPropertyDescriptor]

'it' @ [193:75] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'ModificationTracker' @ [194:13] ==> public fun ModificationTracker(function: () -> Long): ModificationTracker defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]

'files' @ [195:17] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'sumByLong' @ [195:23] ==> public inline fun <T> Iterable<KtFile>.sumByLong(selector: (KtFile) -> Long): Long defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [195:35] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outOfBlockModificationCount' @ [195:38] ==> public val KtFile.outOfBlockModificationCount: Long defined in org.jetbrains.kotlin.idea.project in file KotlinCodeBlockModificationListener.kt[PropertyDescriptorImpl]

'ModificationTracker' @ [199:13] ==> public fun ModificationTracker(function: () -> Long): ModificationTracker defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]

'files' @ [200:17] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'sumByLong' @ [200:23] ==> public inline fun <T> Iterable<KtFile>.sumByLong(selector: (KtFile) -> Long): Long defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [200:35] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'outOfBlockModificationCount' @ [200:38] ==> public val KtFile.outOfBlockModificationCount: Long defined in org.jetbrains.kotlin.idea.project in file KotlinCodeBlockModificationListener.kt[PropertyDescriptorImpl]

'it' @ [200:68] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'modificationStamp' @ [200:71] ==> public final val KtFile.modificationStamp: Long[MyPropertyDescriptor]

'listOf' @ [203:49] ==> public fun <T> listOf(vararg elements: (Any..Any?)): List<(Any..Any?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'OUT_OF_CODE_BLOCK_MODIFICATION_COUNT' @ [203:79] ==> public final val OUT_OF_CODE_BLOCK_MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'filesModificationTracker' @ [203:117] ==> val filesModificationTracker: ModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [204:62] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'files' @ [204:94] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'joinToString' @ [204:100] ==> public fun <T> Iterable<KtFile>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KtFile) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [204:115] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [204:118] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'targetPlatform' @ [204:140] ==> val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'ProjectResolutionFacade' @ [212:20] ==> public constructor ProjectResolutionFacade(debugString: String, resolverDebugName: String, project: Project, globalContext: GlobalContextImpl, settings: PlatformAnalysisSettings, reuseDataFrom: ProjectResolutionFacade?, moduleFilter: (IdeaModuleInfo) -> Boolean, dependencies: List<Any>, invalidateOnOOCB: Boolean = ..., syntheticFiles: Collection<KtFile> = ..., allModules: Collection<IdeaModuleInfo>? = ...) defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[ClassConstructorDescriptorImpl]

'debugName' @ [213:21] ==> value-parameter debugName: String defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.makeProjectResolutionFacade[ValueParameterDescriptorImpl]

'resolverDebugName' @ [214:21] ==> val resolverDebugName: String defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'project' @ [215:21] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'globalContext' @ [216:21] ==> value-parameter globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.makeProjectResolutionFacade[ValueParameterDescriptorImpl]

'settings' @ [217:21] ==> val settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'files' @ [218:38] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'reuseDataFrom' @ [219:37] ==> value-parameter reuseDataFrom: ProjectResolutionFacade? = ... defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.makeProjectResolutionFacade[ValueParameterDescriptorImpl]

'moduleFilter' @ [220:36] ==> value-parameter moduleFilter: (IdeaModuleInfo) -> Boolean = ... defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.makeProjectResolutionFacade[ValueParameterDescriptorImpl]

'dependenciesForSyntheticFileCache' @ [221:36] ==> val dependenciesForSyntheticFileCache: List<(Any..Any?)> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'allModules' @ [222:34] ==> value-parameter allModules: Collection<IdeaModuleInfo>? = ... defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.makeProjectResolutionFacade[ValueParameterDescriptorImpl]

'when {
            syntheticFileModule is ModuleSourceInfo -> {
                val dependentModules = syntheticFileModule.getDependentModules()
                val modulesFacade = globalFacade(settings)
                val globalContext = modulesFacade.globalContext.contextWithNewLockAndCompositeExceptionTracker()
                makeProjectResolutionFacade(
                        "facadeForSynthetic in ModuleSourceInfo",
                        globalContext,
                        reuseDataFrom = modulesFacade,
                        moduleFilter = { it in dependentModules }
                )
            }

            syntheticFileModule is ScriptModuleInfo -> {
                val facadeForScriptDependencies = getFacadeForScriptDependencies(syntheticFileModule)
                val globalContext = facadeForScriptDependencies.globalContext.contextWithNewLockAndCompositeExceptionTracker()
                makeProjectResolutionFacade(
                        "facadeForSynthetic in ScriptModuleInfo",
                        globalContext,
                        reuseDataFrom = facadeForScriptDependencies,
                        allModules = syntheticFileModule.dependencies(),
                        moduleFilter = { it == syntheticFileModule }
                )
            }
            syntheticFileModule is ScriptDependenciesModuleInfo -> {
                createFacadeForScriptDependencies(syntheticFileModule, files)
            }
            syntheticFileModule is ScriptDependenciesSourceModuleInfo -> {
                // TODO: can be optimized by caching facadeForScriptDependencies
                val facadeForScriptDependencies = createFacadeForScriptDependencies(syntheticFileModule.binariesModuleInfo, files)
                val globalContext = facadeForScriptDependencies.globalContext.contextWithNewLockAndCompositeExceptionTracker()
                makeProjectResolutionFacade(
                        "facadeForSynthetic in ScriptDependenciesSourceModuleInfo",
                        globalContext,
                        reuseDataFrom = facadeForScriptDependencies,
                        allModules = syntheticFileModule.dependencies(),
                        moduleFilter = { it == syntheticFileModule }
                )
            }

            syntheticFileModule is LibrarySourceInfo || syntheticFileModule is NotUnderContentRootModuleInfo -> {
                val librariesFacade = librariesFacade(settings)
                val globalContext = librariesFacade.globalContext.contextWithNewLockAndCompositeExceptionTracker()
                makeProjectResolutionFacade(
                        "facadeForSynthetic in LibrarySourceInfo or NotUnderContentRootModuleInfo",
                        globalContext,
                        reuseDataFrom = librariesFacade,
                        moduleFilter = { it == syntheticFileModule }
                )
            }

            syntheticFileModule.isLibraryClasses() -> {
                //NOTE: this code should not be called for sdk or library classes
                // currently the only known scenario is when we cannot determine that file is a library source
                // (file under both classes and sources root)
                LOG.warn("Creating cache with synthetic files ($files) in classes of library $syntheticFileModule")
                val globalContext = GlobalContext()
                makeProjectResolutionFacade(
                        "facadeForSynthetic for file under both classes and root",
                        globalContext
                )
            }

            else -> throw IllegalStateException("Unknown IdeaModuleInfo ${syntheticFileModule::class.java}")
        }' @ [226:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProjectResolutionFacade, entry1: ProjectResolutionFacade, entry2: ProjectResolutionFacade, entry3: ProjectResolutionFacade, entry4: ProjectResolutionFacade, entry5: ProjectResolutionFacade, entry6: ProjectResolutionFacade): ProjectResolutionFacade[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ProjectResolutionFacade

'syntheticFileModule' @ [227:13] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [228:40] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'getDependentModules' @ [228:60] ==> public fun ModuleSourceInfo.getDependentModules(): Set<ModuleSourceInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'globalFacade' @ [229:37] ==> private final fun globalFacade(settings: PlatformAnalysisSettings): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'settings' @ [229:50] ==> val settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'modulesFacade' @ [230:37] ==> val modulesFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'globalContext' @ [230:51] ==> public final val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'contextWithNewLockAndCompositeExceptionTracker' @ [230:65] ==> internal fun GlobalContextImpl.contextWithNewLockAndCompositeExceptionTracker(): GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve in file globalContextUtils.kt[SimpleFunctionDescriptorImpl]

'makeProjectResolutionFacade' @ [231:17] ==> local final fun makeProjectResolutionFacade(debugName: String, globalContext: GlobalContextImpl, reuseDataFrom: ProjectResolutionFacade? = ..., moduleFilter: (IdeaModuleInfo) -> Boolean = ..., allModules: Collection<IdeaModuleInfo>? = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[SimpleFunctionDescriptorImpl]

'globalContext' @ [233:25] ==> val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'modulesFacade' @ [234:41] ==> val modulesFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'it' @ [235:42] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'dependentModules' @ [235:48] ==> val dependentModules: Set<ModuleSourceInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [239:13] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'getFacadeForScriptDependencies' @ [240:51] ==> private final fun getFacadeForScriptDependencies(scriptModuleInfo: ScriptModuleInfo): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'syntheticFileModule' @ [240:82] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'facadeForScriptDependencies' @ [241:37] ==> val facadeForScriptDependencies: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'globalContext' @ [241:65] ==> public final val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'contextWithNewLockAndCompositeExceptionTracker' @ [241:79] ==> internal fun GlobalContextImpl.contextWithNewLockAndCompositeExceptionTracker(): GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve in file globalContextUtils.kt[SimpleFunctionDescriptorImpl]

'makeProjectResolutionFacade' @ [242:17] ==> local final fun makeProjectResolutionFacade(debugName: String, globalContext: GlobalContextImpl, reuseDataFrom: ProjectResolutionFacade? = ..., moduleFilter: (IdeaModuleInfo) -> Boolean = ..., allModules: Collection<IdeaModuleInfo>? = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[SimpleFunctionDescriptorImpl]

'globalContext' @ [244:25] ==> val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'facadeForScriptDependencies' @ [245:41] ==> val facadeForScriptDependencies: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [246:38] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'dependencies' @ [246:58] ==> public abstract fun dependencies(): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'it' @ [247:42] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'syntheticFileModule' @ [247:48] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [250:13] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'createFacadeForScriptDependencies' @ [251:17] ==> private final fun createFacadeForScriptDependencies(dependenciesModuleInfo: ScriptDependenciesModuleInfo, syntheticFiles: Collection<KtFile> = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'syntheticFileModule' @ [251:51] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'files' @ [251:72] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'syntheticFileModule' @ [253:13] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'createFacadeForScriptDependencies' @ [255:51] ==> private final fun createFacadeForScriptDependencies(dependenciesModuleInfo: ScriptDependenciesModuleInfo, syntheticFiles: Collection<KtFile> = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'syntheticFileModule' @ [255:85] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'binariesModuleInfo' @ [255:105] ==> public open val binariesModuleInfo: ScriptDependenciesModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesSourceModuleInfo[PropertyDescriptorImpl]

'files' @ [255:125] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'facadeForScriptDependencies' @ [256:37] ==> val facadeForScriptDependencies: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'globalContext' @ [256:65] ==> public final val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'contextWithNewLockAndCompositeExceptionTracker' @ [256:79] ==> internal fun GlobalContextImpl.contextWithNewLockAndCompositeExceptionTracker(): GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve in file globalContextUtils.kt[SimpleFunctionDescriptorImpl]

'makeProjectResolutionFacade' @ [257:17] ==> local final fun makeProjectResolutionFacade(debugName: String, globalContext: GlobalContextImpl, reuseDataFrom: ProjectResolutionFacade? = ..., moduleFilter: (IdeaModuleInfo) -> Boolean = ..., allModules: Collection<IdeaModuleInfo>? = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[SimpleFunctionDescriptorImpl]

'globalContext' @ [259:25] ==> val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'facadeForScriptDependencies' @ [260:41] ==> val facadeForScriptDependencies: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [261:38] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'dependencies' @ [261:58] ==> public abstract fun dependencies(): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'it' @ [262:42] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'syntheticFileModule' @ [262:48] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [266:13] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [266:57] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'librariesFacade' @ [267:39] ==> private final fun librariesFacade(settings: PlatformAnalysisSettings): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'settings' @ [267:55] ==> val settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'librariesFacade' @ [268:37] ==> val librariesFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'globalContext' @ [268:53] ==> public final val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'contextWithNewLockAndCompositeExceptionTracker' @ [268:67] ==> internal fun GlobalContextImpl.contextWithNewLockAndCompositeExceptionTracker(): GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve in file globalContextUtils.kt[SimpleFunctionDescriptorImpl]

'makeProjectResolutionFacade' @ [269:17] ==> local final fun makeProjectResolutionFacade(debugName: String, globalContext: GlobalContextImpl, reuseDataFrom: ProjectResolutionFacade? = ..., moduleFilter: (IdeaModuleInfo) -> Boolean = ..., allModules: Collection<IdeaModuleInfo>? = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[SimpleFunctionDescriptorImpl]

'globalContext' @ [271:25] ==> val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'librariesFacade' @ [272:41] ==> val librariesFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'it' @ [273:42] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles.<anonymous>[ValueParameterDescriptorImpl]

'syntheticFileModule' @ [273:48] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'syntheticFileModule' @ [277:13] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'isLibraryClasses' @ [277:33] ==> internal fun IdeaModuleInfo.isLibraryClasses(): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'LOG' @ [281:17] ==> internal val LOG: Logger defined in org.jetbrains.kotlin.idea.caches.resolve in file KotlinCacheServiceImpl.kt[PropertyDescriptorImpl]

'warn' @ [281:21] ==> public open fun warn(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'files' @ [281:65] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'syntheticFileModule' @ [281:95] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'GlobalContext' @ [282:37] ==> public fun GlobalContext(): GlobalContextImpl defined in org.jetbrains.kotlin.context[DeserializedSimpleFunctionDescriptor]

'makeProjectResolutionFacade' @ [283:17] ==> local final fun makeProjectResolutionFacade(debugName: String, globalContext: GlobalContextImpl, reuseDataFrom: ProjectResolutionFacade? = ..., moduleFilter: (IdeaModuleInfo) -> Boolean = ..., allModules: Collection<IdeaModuleInfo>? = ...): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[SimpleFunctionDescriptorImpl]

'globalContext' @ [285:25] ==> val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'IllegalStateException' @ [289:27] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'syntheticFileModule' @ [289:75] ==> val syntheticFileModule: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.createFacadeForSyntheticFiles[LocalVariableDescriptor]

'java' @ [289:102] ==> public val <T> KClass<out IdeaModuleInfo>.java: Class<out IdeaModuleInfo> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'FQ_NAMES' @ [293:62] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'suppress' @ [293:71] ==> public final val suppress: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'shortName' @ [293:80] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'identifier' @ [293:92] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'getManager' @ [294:93] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [294:104] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'createCachedValue' @ [294:113] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(KotlinSuppressCache..KotlinSuppressCache?)>?, p1: Boolean): CachedValue<(KotlinSuppressCache..KotlinSuppressCache?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinSuppressCache

'Result' @ [295:29] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: KotlinSuppressCache?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinSuppressCache

'KotlinSuppressCache' @ [295:66] ==> public constructor KotlinSuppressCache() defined in org.jetbrains.kotlin.resolve.diagnostics.KotlinSuppressCache[DeserializedClassConstructorDescriptor]

'annotated' @ [297:21] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'annotationEntries' @ [297:31] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'none' @ [297:49] ==> public inline fun <T> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.none(predicate: ((KtAnnotationEntry..KtAnnotationEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'it' @ [298:25] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'calleeExpression' @ [298:28] ==> public final val KtAnnotationEntry.calleeExpression: KtConstructorCalleeExpression?[MyPropertyDescriptor]

'text' @ [298:46] ==> public final val KtConstructorCalleeExpression.text: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [298:52] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'suppressAnnotationShortName' @ [298:61] ==> private final val suppressAnnotationShortName: String defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'emptyList' @ [301:28] ==> public fun <T> emptyList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'when (annotated) {
                    is KtFile -> annotated.fileAnnotationList?.analyze(BodyResolveMode.PARTIAL) ?: return emptyList()
                    is KtModifierListOwner -> annotated.modifierList?.analyze(BodyResolveMode.PARTIAL) ?: return emptyList()
                    else -> annotated.analyze(BodyResolveMode.PARTIAL)
                }' @ [304:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: BindingContext, entry1: BindingContext, entry2: BindingContext): BindingContext[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BindingContext

'annotated' @ [304:37] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'annotated' @ [305:34] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'fileAnnotationList' @ [305:44] ==> public final val KtFile.fileAnnotationList: KtFileAnnotationList?[MyPropertyDescriptor]

'analyze' @ [305:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [305:88] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'emptyList' @ [305:107] ==> public fun <T> emptyList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'annotated' @ [306:47] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'modifierList' @ [306:57] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'analyze' @ [306:71] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [306:95] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'emptyList' @ [306:114] ==> public fun <T> emptyList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'annotated' @ [307:29] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'analyze' @ [307:39] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [307:63] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'context' @ [310:43] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[LocalVariableDescriptor]

'get' @ [310:51] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> DeclarationDescriptor

'DECLARATION_TO_DESCRIPTOR' @ [310:70] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'annotated' @ [310:97] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'if (annotatedDescriptor != null) {
                    annotatedDescriptor.annotations.toList()
                }
                else {
                    annotated.annotationEntries.mapNotNull { context.get(BindingContext.ANNOTATION, it) }
                }' @ [312:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<AnnotationDescriptor>, elseBranch: List<AnnotationDescriptor>): List<AnnotationDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<AnnotationDescriptor>

'annotatedDescriptor' @ [312:28] ==> val annotatedDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[LocalVariableDescriptor]

'annotatedDescriptor' @ [313:21] ==> val annotatedDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[LocalVariableDescriptor]

'annotations' @ [313:41] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'toList' @ [313:53] ==> public fun <T> Iterable<AnnotationDescriptor>.toList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'annotated' @ [316:21] ==> value-parameter annotated: KtAnnotated defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[ValueParameterDescriptorImpl]

'annotationEntries' @ [316:31] ==> public final val KtAnnotated.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'mapNotNull' @ [316:49] ==> public inline fun <T, R : Any> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.mapNotNull(transform: ((KtAnnotationEntry..KtAnnotationEntry?)) -> AnnotationDescriptor?): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)
    <R : Any> -> AnnotationDescriptor

'context' @ [316:62] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations[LocalVariableDescriptor]

'get' @ [316:70] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..ReadOnlySlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?), p1: (KtAnnotationEntry..KtAnnotationEntry?)): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtAnnotationEntry
    <V : (Any..Any?)> -> AnnotationDescriptor

'ANNOTATION' @ [316:89] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [316:101] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.kotlinSuppressCache.<anonymous>.<no name provided>.getSuppressionAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'LibraryModificationTracker' @ [319:12] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [319:39] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [319:51] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'MODIFICATION_COUNT' @ [319:84] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'Any' @ [322:43] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'CachedValueProvider' @ [324:47] ==> @FunctionalInterface public fun <T : (Any..Any?)> CachedValueProvider(function: () -> CachedValueProvider.Result<(<no name provided>..<no name provided>?)>?): CachedValueProvider<<no name provided>> defined in com.intellij.psi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> <no name provided>

'Result' @ [325:29] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: <no name provided>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> <no name provided>

'SLRUCache<Set<KtFile>, ProjectResolutionFacade>' @ [325:45] ==> protected/*protected and package*/ constructor SLRUCache<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUCache[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Set<KtFile>
    <V : (Any..Any?)> -> ProjectResolutionFacade

'createFacadeForSyntheticFiles' @ [326:60] ==> private final fun createFacadeForSyntheticFiles(files: Set<KtFile>): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'files' @ [326:90] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.syntheticFilesCacheProvider.<anonymous>.<no name provided>.createValue[ValueParameterDescriptorImpl]

'LibraryModificationTracker' @ [327:12] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [327:39] ==> @JvmStatic public final fun getInstance(project: Project): LibraryModificationTracker defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [327:51] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'getInstance' @ [327:92] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [327:104] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'synchronized' @ [331:27] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> <no name provided>): <no name provided> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> <no name provided>

'syntheticFileCachesLock' @ [331:40] ==> private final val syntheticFileCachesLock: Any defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'getManager' @ [334:33] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [334:44] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'getCachedValue' @ [334:53] ==> public open fun <T : (Any..Any?), D : (UserDataHolder..UserDataHolder?)> getCachedValue(@NotNull p0: Project, @NotNull p1: CachedValueProvider<(<no name provided>..<no name provided>?)>): (<no name provided>..<no name provided>?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> <no name provided>
    <D : (UserDataHolder..UserDataHolder?)> -> Project

'project' @ [334:68] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'syntheticFilesCacheProvider' @ [334:77] ==> private final val syntheticFilesCacheProvider: CachedValueProvider<<no name provided>> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'synchronized' @ [338:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Nothing

'cachedValue' @ [338:22] ==> val cachedValue: <no name provided> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeForSyntheticFiles[LocalVariableDescriptor]

'cachedValue' @ [339:20] ==> val cachedValue: <no name provided> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeForSyntheticFiles[LocalVariableDescriptor]

'get' @ [339:32] ==> @NotNull public open fun get(p0: (Set<KtFile>..Set<KtFile>?)): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.syntheticFilesCacheProvider.<anonymous>.<no name provided>[JavaMethodDescriptor]

'files' @ [339:36] ==> value-parameter files: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeForSyntheticFiles[ValueParameterDescriptorImpl]

'files' @ [344:20] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[ValueParameterDescriptorImpl]

'first' @ [344:26] ==> public fun <T> Iterable<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [345:26] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'getModuleInfo' @ [345:31] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'files' @ [346:32] ==> value-parameter files: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[ValueParameterDescriptorImpl]

'filterNotInProjectSource' @ [346:38] ==> private final fun Collection<KtFile>.filterNotInProjectSource(moduleInfo: IdeaModuleInfo): Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [346:63] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'if (notInSourceFiles.isNotEmpty()) {
            val projectFacade = getFacadeForSyntheticFiles(notInSourceFiles)
            ResolutionFacadeImpl(projectFacade, moduleInfo)
        }
        else {
            val platform = TargetPlatformDetector.getPlatform(file)
            getResolutionFacadeByModuleInfo(moduleInfo, platform)
        }' @ [347:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionFacade, elseBranch: ResolutionFacade): ResolutionFacade[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionFacade

'notInSourceFiles' @ [347:20] ==> val notInSourceFiles: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'isNotEmpty' @ [347:37] ==> @InlineOnly public inline fun <T> Collection<KtFile>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'getFacadeForSyntheticFiles' @ [348:33] ==> private final fun getFacadeForSyntheticFiles(files: Set<KtFile>): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'notInSourceFiles' @ [348:60] ==> val notInSourceFiles: Set<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'ResolutionFacadeImpl' @ [349:13] ==> public constructor ResolutionFacadeImpl(projectFacade: ProjectResolutionFacade, moduleInfo: IdeaModuleInfo) defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[ClassConstructorDescriptorImpl]

'projectFacade' @ [349:34] ==> val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'moduleInfo' @ [349:49] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'getPlatform' @ [352:51] ==> @NotNull public open fun getPlatform(@NotNull file: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'file' @ [352:63] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'getResolutionFacadeByModuleInfo' @ [353:13] ==> private final fun getResolutionFacadeByModuleInfo(moduleInfo: IdeaModuleInfo, platform: TargetPlatform): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [353:45] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'platform' @ [353:57] ==> val platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getFacadeToAnalyzeFiles[LocalVariableDescriptor]

'assert' @ [358:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'file' @ [358:16] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByFile[ValueParameterDescriptorImpl]

'assert' @ [359:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [359:16] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isInProjectOrLibraryContent' @ [359:33] ==> @JvmStatic public final fun isInProjectOrLibraryContent(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'file' @ [359:61] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByFile[ValueParameterDescriptorImpl]

'file' @ [360:26] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByFile[ValueParameterDescriptorImpl]

'getModuleInfo' @ [360:31] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'getResolutionFacadeByModuleInfo' @ [361:16] ==> private final fun getResolutionFacadeByModuleInfo(moduleInfo: IdeaModuleInfo, platform: TargetPlatform): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [361:48] ==> val moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByFile[LocalVariableDescriptor]

'platform' @ [361:60] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByFile[ValueParameterDescriptorImpl]

'PlatformAnalysisSettings' @ [365:24] ==> public constructor PlatformAnalysisSettings(platform: TargetPlatform, sdk: Sdk?, isAdditionalBuiltInFeaturesSupported: Boolean) defined in org.jetbrains.kotlin.idea.caches.resolve.PlatformAnalysisSettings[ClassConstructorDescriptorImpl]

'platform' @ [365:49] ==> value-parameter platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByModuleInfo[ValueParameterDescriptorImpl]

'moduleInfo' @ [365:59] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByModuleInfo[ValueParameterDescriptorImpl]

'sdk' @ [365:70] ==> private final val IdeaModuleInfo.sdk: Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[PropertyDescriptorImpl]

'moduleInfo' @ [365:75] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByModuleInfo[ValueParameterDescriptorImpl]

'supportsAdditionalBuiltInsMembers' @ [365:86] ==> private final fun IdeaModuleInfo.supportsAdditionalBuiltInsMembers(): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'globalFacade' @ [366:29] ==> private final fun globalFacade(settings: PlatformAnalysisSettings): ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'settings' @ [366:42] ==> val settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByModuleInfo[LocalVariableDescriptor]

'ResolutionFacadeImpl' @ [367:16] ==> public constructor ResolutionFacadeImpl(projectFacade: ProjectResolutionFacade, moduleInfo: IdeaModuleInfo) defined in org.jetbrains.kotlin.idea.caches.resolve.ResolutionFacadeImpl[ClassConstructorDescriptorImpl]

'projectFacade' @ [367:37] ==> val projectFacade: ProjectResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByModuleInfo[LocalVariableDescriptor]

'moduleInfo' @ [367:52] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getResolutionFacadeByModuleInfo[ValueParameterDescriptorImpl]

'mapNotNull' @ [370:91] ==> public inline fun <T, R : Any> Iterable<KtFile>.mapNotNull(transform: (KtFile) -> KtFile?): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R : Any> -> KtFile

'if (it is KtCodeFragment) it.getContextFile() else it' @ [371:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile?, elseBranch: KtFile?): KtFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile?

'it' @ [371:13] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.filterNotInProjectSource.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [371:35] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.filterNotInProjectSource.<anonymous>[ValueParameterDescriptorImpl]

'getContextFile' @ [371:38] ==> private final fun KtCodeFragment.getContextFile(): KtFile? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'it' @ [371:60] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.filterNotInProjectSource.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [372:7] ==> public inline fun <T> Iterable<KtFile>.filter(predicate: (KtFile) -> Boolean): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'!' @ [373:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [373:10] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[FakeCallableDescriptorForObject]

'isInProjectSource' @ [373:27] ==> @JvmStatic public final fun isInProjectSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'it' @ [373:45] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.filterNotInProjectSource.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [373:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [373:53] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.filterNotInProjectSource[ValueParameterDescriptorImpl]

'contentScope' @ [373:64] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'contains' @ [373:79] ==> public operator fun SearchScope.contains(element: PsiElement): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [373:88] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.filterNotInProjectSource.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [374:7] ==> public fun <T> Iterable<KtFile>.toSet(): Set<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'context' @ [377:30] ==> public final val KtCodeFragment.context: PsiElement?[MyPropertyDescriptor]

'?:' @ [378:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFile?, right: KtFile): KtFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFile

'contextElement' @ [378:28] ==> val contextElement: PsiElement defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getContextFile[LocalVariableDescriptor]

'containingKtFile' @ [378:59] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'AssertionError' @ [379:36] ==> public constructor AssertionError(p0: (Any..Any?)) defined in java.lang.AssertionError[JavaClassConstructorDescriptor]

'this' @ [379:93] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getContextFile[ReceiverParameterDescriptorImpl]

'java' @ [379:105] ==> public val <T> KClass<out KtCodeFragment>.java: Class<out KtCodeFragment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCodeFragment

'contextElement' @ [379:139] ==> val contextElement: PsiElement defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getContextFile[LocalVariableDescriptor]

'java' @ [379:161] ==> public val <T> KClass<out PsiElement>.java: Class<out PsiElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiElement

'if (contextFile is KtCodeFragment) contextFile.getContextFile() else contextFile' @ [380:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtFile?, elseBranch: KtFile?): KtFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtFile?

'contextFile' @ [380:20] ==> val contextFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getContextFile[LocalVariableDescriptor]

'contextFile' @ [380:51] ==> val contextFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getContextFile[LocalVariableDescriptor]

'getContextFile' @ [380:63] ==> private final fun KtCodeFragment.getContextFile(): KtFile? defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl[SimpleFunctionDescriptorImpl]

'contextFile' @ [380:85] ==> val contextFile: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.KotlinCacheServiceImpl.getContextFile[LocalVariableDescriptor]

