'listOf' @ [42:50] ==> @InlineOnly public inline fun <T> listOf(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'getManager' @ [45:51] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [45:62] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'createCachedValue' @ [45:71] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(ModuleResolverProvider..ModuleResolverProvider?)>?, p1: Boolean): CachedValue<(ModuleResolverProvider..ModuleResolverProvider?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider..org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider?)

'computeModuleResolverProvider' @ [47:40] ==> private final fun computeModuleResolverProvider(): ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'create' @ [48:44] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: ModuleResolverProvider?, @NotNull p1: (MutableCollection<*>..Collection<*>)): (CachedValueProvider.Result<(ModuleResolverProvider..ModuleResolverProvider?)>..CachedValueProvider.Result<(ModuleResolverProvider..ModuleResolverProvider?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleResolverProvider

'resolverProvider' @ [48:51] ==> val resolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.cachedValue.<anonymous>[LocalVariableDescriptor]

'resolverProvider' @ [48:69] ==> val resolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.cachedValue.<anonymous>[LocalVariableDescriptor]

'cacheDependencies' @ [48:86] ==> public final val cacheDependencies: Collection<Any> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'reuseDataFrom' @ [54:40] ==> public final val reuseDataFrom: ProjectResolutionFacade? defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'moduleResolverProvider' @ [54:55] ==> private final val moduleResolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'delegateResolverProvider' @ [55:42] ==> val delegateResolverProvider: ModuleResolverProvider? defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.computeModuleResolverProvider[LocalVariableDescriptor]

'resolverForProject' @ [55:68] ==> public final val resolverForProject: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'EmptyResolverForProject' @ [55:90] ==> public constructor EmptyResolverForProject<M : ModuleInfo>() defined in org.jetbrains.kotlin.analyzer.EmptyResolverForProject[DeserializedClassConstructorDescriptor]
Inferred types:
    <M : ModuleInfo> -> IdeaModuleInfo

'createModuleResolverProvider' @ [56:16] ==> public fun createModuleResolverProvider(debugName: String, project: Project, globalContext: GlobalContextImpl, analysisSettings: PlatformAnalysisSettings, syntheticFiles: Collection<KtFile>, delegateResolver: ResolverForProject<IdeaModuleInfo>, moduleFilter: (IdeaModuleInfo) -> Boolean, allModules: Collection<IdeaModuleInfo>?, providedBuiltIns: KotlinBuiltIns?, dependencies: Collection<Any>, invalidateOnOOCB: Boolean = ...): ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve in file ModuleDependencyMapper.kt[SimpleFunctionDescriptorImpl]

'resolverDebugName' @ [57:17] ==> private final val resolverDebugName: String defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'project' @ [58:17] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'globalContext' @ [59:17] ==> public final val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'settings' @ [60:17] ==> public final val settings: PlatformAnalysisSettings defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'syntheticFiles' @ [61:34] ==> public final val syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'delegateResolverForProject' @ [62:36] ==> val delegateResolverForProject: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.computeModuleResolverProvider[LocalVariableDescriptor]

'moduleFilter' @ [62:79] ==> public final val moduleFilter: (IdeaModuleInfo) -> Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'allModules' @ [63:30] ==> public final val allModules: Collection<IdeaModuleInfo>? defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'delegateResolverProvider' @ [64:36] ==> val delegateResolverProvider: ModuleResolverProvider? defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.computeModuleResolverProvider[LocalVariableDescriptor]

'builtIns' @ [64:62] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'dependencies' @ [65:32] ==> public final val dependencies: List<Any> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'invalidateOnOOCB' @ [66:36] ==> private final val invalidateOnOOCB: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'globalContext' @ [71:17] ==> public final val globalContext: GlobalContextImpl defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'storageManager' @ [71:31] ==> public open val storageManager: LockBasedStorageManager defined in org.jetbrains.kotlin.context.GlobalContextImpl[DeserializedPropertyDescriptor]

'compute' @ [71:46] ==> public open fun <T : (Any..Any?)> compute(@NotNull computable: () -> (ModuleResolverProvider..ModuleResolverProvider?)): (ModuleResolverProvider..ModuleResolverProvider?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider..org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider?)

'cachedValue' @ [71:56] ==> private final val cachedValue: CachedValue<(ModuleResolverProvider..ModuleResolverProvider?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'value' @ [71:68] ==> public final val <T : (Any..Any?)> CachedValue<(ModuleResolverProvider..ModuleResolverProvider?)>.value: (ModuleResolverProvider..ModuleResolverProvider?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider..org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider?)

'moduleResolverProvider' @ [73:61] ==> private final val moduleResolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'resolverForProject' @ [73:84] ==> public final val resolverForProject: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'resolverForModule' @ [73:103] ==> public final fun resolverForModule(moduleInfo: IdeaModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [73:121] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.resolverForModuleInfo[ValueParameterDescriptorImpl]

'moduleResolverProvider' @ [74:67] ==> private final val moduleResolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'resolverForProject' @ [74:90] ==> public final val resolverForProject: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'tryGetResolverForModule' @ [74:109] ==> public abstract fun tryGetResolverForModule(moduleInfo: IdeaModuleInfo): ResolverForModule? defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [74:133] ==> value-parameter moduleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.tryGetResolverForModuleInfo[ValueParameterDescriptorImpl]

'moduleResolverProvider' @ [75:69] ==> private final val moduleResolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'resolverForProject' @ [75:92] ==> public final val resolverForProject: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'resolverForModuleDescriptor' @ [75:111] ==> public abstract fun resolverForModuleDescriptor(descriptor: ModuleDescriptor): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [75:139] ==> value-parameter moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.resolverForDescriptor[ValueParameterDescriptorImpl]

'moduleResolverProvider' @ [78:16] ==> private final val moduleResolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'resolverForProject' @ [78:39] ==> public final val resolverForProject: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'descriptorForModule' @ [78:58] ==> public abstract fun descriptorForModule(moduleInfo: IdeaModuleInfo): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'ideaModuleInfo' @ [78:78] ==> value-parameter ideaModuleInfo: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.findModuleDescriptor[ValueParameterDescriptorImpl]

'getManager' @ [81:55] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [81:66] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'createCachedValue' @ [81:75] ==> @NotNull public final fun <T : (Any..Any?)> createCachedValue(@NotNull p0: () -> CachedValueProvider.Result<(<no name provided>..<no name provided>?)>?, p1: Boolean): CachedValue<(<no name provided>..<no name provided>?)> defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>.<no name provided>..org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>.<no name provided>?)

'moduleResolverProvider' @ [83:40] ==> private final val moduleResolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'SLRUCache<KtFile, PerFileAnalysisCache>' @ [84:40] ==> protected/*protected and package*/ constructor SLRUCache<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUCache[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtFile
    <V : (Any..Any?)> -> PerFileAnalysisCache

'PerFileAnalysisCache' @ [86:32] ==> public constructor PerFileAnalysisCache(file: KtFile, componentProvider: ComponentProvider) defined in org.jetbrains.kotlin.idea.caches.resolve.PerFileAnalysisCache[ClassConstructorDescriptorImpl]

'file' @ [86:53] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>.<no name provided>.createValue[ValueParameterDescriptorImpl]

'resolverProvider' @ [86:59] ==> val resolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>[LocalVariableDescriptor]

'resolverForProject' @ [86:76] ==> public final val resolverForProject: ResolverForProject<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'resolverForModule' @ [86:95] ==> public final fun resolverForModule(moduleInfo: IdeaModuleInfo): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProject[DeserializedSimpleFunctionDescriptor]

'file' @ [86:113] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>.<no name provided>.createValue[ValueParameterDescriptorImpl]

'getModuleInfo' @ [86:118] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'componentProvider' @ [86:135] ==> public final val componentProvider: ComponentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[DeserializedPropertyDescriptor]

'resolverProvider' @ [90:39] ==> val resolverProvider: ModuleResolverProvider defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>[LocalVariableDescriptor]

'cacheDependencies' @ [90:56] ==> public final val cacheDependencies: Collection<Any> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleResolverProvider[PropertyDescriptorImpl]

'listOf' @ [90:76] ==> public fun <T> listOf(element: raw (Key<(Any..Any?)>..Key<*>?)): List<raw (Key<(Any..Any?)>..Key<*>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> raw (com.intellij.openapi.util.Key<(kotlin.Any..kotlin.Any?)>..com.intellij.openapi.util.Key<*>?)

'MODIFICATION_COUNT' @ [90:106] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'create' @ [91:44] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: <no name provided>?, @NotNull p1: (MutableCollection<*>..Collection<*>)): (CachedValueProvider.Result<(<no name provided>..<no name provided>?)>..CachedValueProvider.Result<(<no name provided>..<no name provided>?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> <no name provided>

'results' @ [91:51] ==> val results: <no name provided> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>[LocalVariableDescriptor]

'allDependencies' @ [91:60] ==> val allDependencies: List<(Any..Any?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>[LocalVariableDescriptor]

'assert' @ [95:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'elements' @ [95:16] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[ValueParameterDescriptorImpl]

'isNotEmpty' @ [95:25] ==> @InlineOnly public inline fun <T> Collection<KtElement>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'synchronized' @ [96:25] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> <no name provided>): <no name provided> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> <no name provided>

'analysisResults' @ [96:38] ==> private final val analysisResults: CachedValue<(<no name provided>..<no name provided>?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'analysisResults' @ [97:13] ==> private final val analysisResults: CachedValue<(<no name provided>..<no name provided>?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'value' @ [97:29] ==> public final val <T : (Any..Any?)> CachedValue<(<no name provided>..<no name provided>?)>.value: (<no name provided>..<no name provided>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>.<no name provided>..org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.analysisResults.<anonymous>.<no name provided>?)

'elements' @ [99:23] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[ValueParameterDescriptorImpl]

'map' @ [99:32] ==> public inline fun <T, R> Iterable<KtElement>.map(transform: (KtElement) -> AnalysisResult): List<AnalysisResult> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> AnalysisResult

'synchronized' @ [100:32] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> PerFileAnalysisCache): PerFileAnalysisCache defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> PerFileAnalysisCache

'slruCache' @ [100:45] ==> val slruCache: <no name provided> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'slruCache' @ [101:17] ==> val slruCache: <no name provided> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'it' @ [101:27] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements.<anonymous>[ValueParameterDescriptorImpl]

'containingKtFile' @ [101:30] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'perFileCache' @ [103:13] ==> val perFileCache: PerFileAnalysisCache defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements.<anonymous>[LocalVariableDescriptor]

'getAnalysisResults' @ [103:26] ==> public final fun getAnalysisResults(element: KtElement): AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve.PerFileAnalysisCache[SimpleFunctionDescriptorImpl]

'it' @ [103:45] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements.<anonymous>[ValueParameterDescriptorImpl]

'results' @ [105:25] ==> val results: List<AnalysisResult> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'firstOrNull' @ [105:33] ==> public inline fun <T> Iterable<AnalysisResult>.firstOrNull(predicate: (AnalysisResult) -> Boolean): AnalysisResult? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnalysisResult

'it' @ [105:47] ==> value-parameter it: AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements.<anonymous>[ValueParameterDescriptorImpl]

'isError' @ [105:50] ==> public final fun isError(): Boolean defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedSimpleFunctionDescriptor]

'CompositeBindingContext' @ [106:30] ==> public companion object defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[FakeCallableDescriptorForObject]

'create' @ [106:54] ==> public final fun create(delegates: List<BindingContext>): BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion[DeserializedSimpleFunctionDescriptor]

'results' @ [106:61] ==> val results: List<AnalysisResult> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'map' @ [106:69] ==> public inline fun <T, R> Iterable<AnalysisResult>.map(transform: (AnalysisResult) -> BindingContext): List<BindingContext> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnalysisResult
    <R> -> BindingContext

'it' @ [106:75] ==> value-parameter it: AnalysisResult defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements.<anonymous>[ValueParameterDescriptorImpl]

'bindingContext' @ [106:78] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'if (withError != null)
            AnalysisResult.error(bindingContext, withError.error)
        else
        //TODO: (module refactoring) several elements are passed here in debugger
            AnalysisResult.success(bindingContext, findModuleDescriptor(elements.first().getModuleInfo()))' @ [107:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AnalysisResult, elseBranch: AnalysisResult): AnalysisResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnalysisResult

'withError' @ [107:20] ==> val withError: AnalysisResult? defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'error' @ [108:28] ==> @JvmStatic public final fun error(bindingContext: BindingContext, error: Throwable): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [108:34] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'withError' @ [108:50] ==> val withError: AnalysisResult? defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'error' @ [108:60] ==> public final val error: Throwable defined in org.jetbrains.kotlin.analyzer.AnalysisResult[DeserializedPropertyDescriptor]

'success' @ [111:28] ==> @JvmStatic public final fun success(bindingContext: BindingContext, module: ModuleDescriptor): AnalysisResult defined in org.jetbrains.kotlin.analyzer.AnalysisResult.Companion[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [111:36] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[LocalVariableDescriptor]

'findModuleDescriptor' @ [111:52] ==> public final fun findModuleDescriptor(ideaModuleInfo: IdeaModuleInfo): ModuleDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[SimpleFunctionDescriptorImpl]

'elements' @ [111:73] ==> value-parameter elements: Collection<KtElement> defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade.getAnalysisResultsForElements[ValueParameterDescriptorImpl]

'first' @ [111:82] ==> public fun <T> Iterable<KtElement>.first(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'getModuleInfo' @ [111:90] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'debugString' @ [115:18] ==> private final val debugString: String defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[PropertyDescriptorImpl]

'toHexString' @ [115:40] ==> public open fun toHexString(p0: Int): (String..String?) defined in java.lang.Integer[JavaMethodDescriptor]

'hashCode' @ [115:52] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.idea.caches.resolve.ProjectResolutionFacade[DeserializedSimpleFunctionDescriptor]

