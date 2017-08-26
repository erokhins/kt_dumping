'resolverForModuleDescriptor' @ [56:63] ==> public abstract fun resolverForModuleDescriptor(descriptor: ModuleDescriptor): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProject[SimpleFunctionDescriptorImpl]

'descriptorForModule' @ [56:91] ==> public abstract fun descriptorForModule(moduleInfo: M): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProject[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [56:111] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.ResolverForProject.resolverForModule[ValueParameterDescriptorImpl]

'name' @ [64:31] ==> public abstract val name: String defined in org.jetbrains.kotlin.analyzer.ResolverForProject[PropertyDescriptorImpl]

'ResolverForProject<M>' @ [67:49] ==> public constructor ResolverForProject<M : ModuleInfo>() defined in org.jetbrains.kotlin.analyzer.ResolverForProject[ClassConstructorDescriptorImpl]
Inferred types:
    <M : ModuleInfo> -> M

'IllegalStateException' @ [72:103] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [72:127] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.EmptyResolverForProject.resolverForModuleDescriptor[ValueParameterDescriptorImpl]

'IllegalStateException' @ [73:61] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'moduleInfo' @ [73:110] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.EmptyResolverForProject.descriptorForModule[ValueParameterDescriptorImpl]

'listOf' @ [74:46] ==> @InlineOnly public inline fun <T> listOf(): List<M> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M

'CompilerEnvironment' @ [84:60] ==> public object CompilerEnvironment : TargetEnvironment defined in org.jetbrains.kotlin.resolve in file CompilerEnvironment.kt[FakeCallableDescriptorForObject]

'DefaultBuiltIns' @ [85:48] ==> public companion object defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns[FakeCallableDescriptorForObject]

'Instance' @ [85:64] ==> @JvmStatic public final val Instance: DefaultBuiltIns defined in org.jetbrains.kotlin.builtins.DefaultBuiltIns.Companion[DeserializedPropertyDescriptor]

'EmptyResolverForProject' @ [86:63] ==> public constructor EmptyResolverForProject<M : ModuleInfo>() defined in org.jetbrains.kotlin.analyzer.EmptyResolverForProject[ClassConstructorDescriptorImpl]
Inferred types:
    <M : ModuleInfo> -> M

'Empty' @ [87:123] ==> public object Empty : PackagePartProvider defined in org.jetbrains.kotlin.descriptors.PackagePartProvider[FakeCallableDescriptorForObject]

'OptimisticFactory' @ [90:87] ==> public object OptimisticFactory : PackageOracleFactory defined in org.jetbrains.kotlin.analyzer.PackageOracleFactory[FakeCallableDescriptorForObject]

'Default' @ [91:99] ==> public object Default : LanguageSettingsProvider defined in org.jetbrains.kotlin.analyzer.LanguageSettingsProvider[FakeCallableDescriptorForObject]

'ResolverForProject<M>' @ [93:5] ==> public constructor ResolverForProject<M : ModuleInfo>() defined in org.jetbrains.kotlin.analyzer.ResolverForProject[ClassConstructorDescriptorImpl]
Inferred types:
    <M : ModuleInfo> -> M

'modificationTracker' @ [101:35] ==> public final val modificationTracker: ModificationTracker? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData[PropertyDescriptorImpl]

'modificationCount' @ [101:56] ==> public final val ModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'currentModCount' @ [102:20] ==> val currentModCount: Long? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData.isOutOfDate[LocalVariableDescriptor]

'currentModCount' @ [102:47] ==> val currentModCount: Long? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData.isOutOfDate[LocalVariableDescriptor]

'modificationCount' @ [102:65] ==> public final val modificationCount: Long? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData[PropertyDescriptorImpl]

'mutableMapOf' @ [106:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<M, ResolverForProjectImpl.ModuleData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> M
    <V> -> ModuleData

'mutableMapOf' @ [107:42] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<ModuleDescriptorImpl, M> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ModuleDescriptorImpl
    <V> -> M

'modules' @ [108:19] ==> value-parameter modules: Collection<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.<init>[ValueParameterDescriptorImpl]

'toSet' @ [108:27] ==> public fun <T> Iterable<M>.toSet(): Set<M> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M

'!' @ [111:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCorrectModuleInfo' @ [111:14] ==> private final fun isCorrectModuleInfo(moduleInfo: M): Boolean defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [111:34] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.tryGetResolverForModule[ValueParameterDescriptorImpl]

'resolverForModuleDescriptor' @ [114:16] ==> public open fun resolverForModuleDescriptor(descriptor: ModuleDescriptor): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'doGetDescriptorForModule' @ [114:44] ==> private final fun doGetDescriptorForModule(module: M): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [114:69] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.tryGetResolverForModule[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [118:9] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.setupModuleDescriptor[ValueParameterDescriptorImpl]

'setDependencies' @ [118:26] ==> public final fun setDependencies(dependencies: ModuleDependencies): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'LazyModuleDependencies' @ [118:42] ==> public constructor LazyModuleDependencies<M : ModuleInfo>(storageManager: StorageManager, module: M, modulePlatforms: (M) -> MultiTargetPlatform?, firstDependency: M? = ..., resolverForProject: ResolverForProjectImpl<M>) defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[ClassConstructorDescriptorImpl]
Inferred types:
    <M : ModuleInfo> -> M

'projectContext' @ [119:17] ==> private final val projectContext: ProjectContext defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'storageManager' @ [119:32] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ProjectContext[PropertyDescriptorImpl]

'module' @ [120:17] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.setupModuleDescriptor[ValueParameterDescriptorImpl]

'modulePlatforms' @ [121:17] ==> private final val modulePlatforms: (M) -> MultiTargetPlatform? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'firstDependency' @ [122:17] ==> private final val firstDependency: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'this' @ [123:17] ==> <this> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[LazyClassReceiverParameterDescriptor]

'invoke' @ [125:23] ==> public abstract operator fun invoke(p1: M): ModuleContent defined in kotlin.Function1[FunctionInvokeDescriptor]

'module' @ [125:38] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.setupModuleDescriptor[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [126:9] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.setupModuleDescriptor[ValueParameterDescriptorImpl]

'initialize' @ [126:26] ==> public final fun initialize(providerForModuleContent: PackageFragmentProvider): Unit defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedSimpleFunctionDescriptor]

'DelegatingPackageFragmentProvider' @ [127:17] ==> public constructor DelegatingPackageFragmentProvider<M : ModuleInfo>(resolverForProject: ResolverForProjectImpl<M>, module: ModuleDescriptor, moduleContent: ModuleContent, packageOracle: PackageOracle) defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[ClassConstructorDescriptorImpl]
Inferred types:
    <M : ModuleInfo> -> M

'this' @ [127:51] ==> <this> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[LazyClassReceiverParameterDescriptor]

'moduleDescriptor' @ [127:57] ==> value-parameter moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.setupModuleDescriptor[ValueParameterDescriptorImpl]

'content' @ [127:75] ==> val content: ModuleContent defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.setupModuleDescriptor[LocalVariableDescriptor]

'packageOracleFactory' @ [128:51] ==> private final val packageOracleFactory: PackageOracleFactory defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'createOracle' @ [128:72] ==> public abstract fun createOracle(moduleInfo: ModuleInfo): PackageOracle defined in org.jetbrains.kotlin.analyzer.PackageOracleFactory[SimpleFunctionDescriptorImpl]

'module' @ [128:85] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.setupModuleDescriptor[ValueParameterDescriptorImpl]

'mutableMapOf' @ [131:46] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<ModuleDescriptor, ResolverForModule> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ModuleDescriptor
    <V> -> ResolverForModule

'lazy' @ [133:47] ==> public fun <T> lazy(initializer: () -> Set<M>): Lazy<Set<M>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Set<M>

'this' @ [134:9] ==> <this> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[LazyClassReceiverParameterDescriptor]

'modules' @ [134:14] ==> public final val modules: Set<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'delegateResolver' @ [134:24] ==> private final val delegateResolver: ResolverForProject<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'allModules' @ [134:41] ==> public abstract val allModules: Collection<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProject[PropertyDescriptorImpl]

'debugName' @ [138:33] ==> private final val debugName: String defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'moduleInfo' @ [140:54] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.isCorrectModuleInfo[ValueParameterDescriptorImpl]

'allModules' @ [140:68] ==> public open val allModules: Collection<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'projectContext' @ [143:16] ==> private final val projectContext: ProjectContext defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'storageManager' @ [143:31] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ProjectContext[PropertyDescriptorImpl]

'compute' @ [143:46] ==> public abstract fun <T> compute(computable: () -> ResolverForModule): ResolverForModule defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolverForModule

'moduleInfoByDescriptor' @ [144:26] ==> private final val moduleInfoByDescriptor: MutableMap<ModuleDescriptorImpl, M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'descriptor' @ [144:49] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor[ValueParameterDescriptorImpl]

'module' @ [145:17] ==> val module: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor.<anonymous>[LocalVariableDescriptor]

'delegateResolver' @ [146:21] ==> private final val delegateResolver: ResolverForProject<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'IllegalStateException' @ [147:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [147:51] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor[ValueParameterDescriptorImpl]

'name' @ [147:92] ==> public open val name: String defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'delegateResolver' @ [149:32] ==> private final val delegateResolver: ResolverForProject<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'resolverForModuleDescriptor' @ [149:49] ==> public abstract fun resolverForModuleDescriptor(descriptor: ModuleDescriptor): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProject[SimpleFunctionDescriptorImpl]

'descriptor' @ [149:77] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor[ValueParameterDescriptorImpl]

'resolverByModuleDescriptor' @ [151:13] ==> private final val resolverByModuleDescriptor: MutableMap<ModuleDescriptor, ResolverForModule> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'getOrPut' @ [151:40] ==> public inline fun <K, V> MutableMap<ModuleDescriptor, ResolverForModule>.getOrPut(key: ModuleDescriptor, defaultValue: () -> ResolverForModule): ResolverForModule defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ModuleDescriptor
    <V> -> ResolverForModule

'descriptor' @ [151:49] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor[ValueParameterDescriptorImpl]

'ResolverForModuleComputationTracker' @ [152:17] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ResolverForModuleComputationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [152:53] ==> public final fun getInstance(project: Project): ResolverForModuleComputationTracker? defined in org.jetbrains.kotlin.analyzer.ResolverForModuleComputationTracker.Companion[SimpleFunctionDescriptorImpl]

'projectContext' @ [152:65] ==> private final val projectContext: ProjectContext defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'project' @ [152:80] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ProjectContext[PropertyDescriptorImpl]

'onResolverComputed' @ [152:90] ==> public abstract fun onResolverComputed(moduleInfo: ModuleInfo): Unit defined in org.jetbrains.kotlin.analyzer.ResolverForModuleComputationTracker[SimpleFunctionDescriptorImpl]

'module' @ [152:109] ==> val module: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor.<anonymous>[LocalVariableDescriptor]

'invoke' @ [154:17] ==> public abstract operator fun invoke(p1: M): AnalyzerFacade defined in kotlin.Function1[FunctionInvokeDescriptor]

'module' @ [154:32] ==> val module: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor.<anonymous>[LocalVariableDescriptor]

'createResolverForModule' @ [154:40] ==> public abstract fun <M : ModuleInfo> createResolverForModule(moduleInfo: M, moduleDescriptor: ModuleDescriptorImpl, moduleContext: ModuleContext, moduleContent: ModuleContent, platformParameters: PlatformAnalysisParameters, targetEnvironment: TargetEnvironment, resolverForProject: ResolverForProject<M>, languageSettingsProvider: LanguageSettingsProvider, packagePartProvider: PackagePartProvider): ResolverForModule defined in org.jetbrains.kotlin.analyzer.AnalyzerFacade[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : ModuleInfo> -> M

'module' @ [155:25] ==> val module: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [155:33] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor[ValueParameterDescriptorImpl]

'projectContext' @ [155:69] ==> private final val projectContext: ProjectContext defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'withModule' @ [155:84] ==> public fun ProjectContext.withModule(module: ModuleDescriptor): ModuleContext defined in org.jetbrains.kotlin.context in file context.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [155:95] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor[ValueParameterDescriptorImpl]

'invoke' @ [155:108] ==> public abstract operator fun invoke(p1: M): ModuleContent defined in kotlin.Function1[FunctionInvokeDescriptor]

'module' @ [155:123] ==> val module: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor.<anonymous>[LocalVariableDescriptor]

'platformParameters' @ [156:25] ==> private final val platformParameters: PlatformAnalysisParameters defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'targetEnvironment' @ [156:45] ==> private final val targetEnvironment: TargetEnvironment defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'this@ResolverForProjectImpl' @ [156:64] ==> <this> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[LazyClassReceiverParameterDescriptor]

'languageSettingsProvider' @ [157:25] ==> private final val languageSettingsProvider: LanguageSettingsProvider defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'invoke' @ [158:25] ==> public abstract operator fun invoke(p1: M, p2: ModuleContent): PackagePartProvider defined in kotlin.Function2[FunctionInvokeDescriptor]

'module' @ [158:52] ==> val module: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor.<anonymous>[LocalVariableDescriptor]

'invoke' @ [158:60] ==> public abstract operator fun invoke(p1: M): ModuleContent defined in kotlin.Function1[FunctionInvokeDescriptor]

'module' @ [158:75] ==> val module: M? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.resolverForModuleDescriptor.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [164:13] ==> value-parameter descriptor: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.isResolverForModuleDescriptorComputed[ValueParameterDescriptorImpl]

'resolverByModuleDescriptor' @ [164:27] ==> private final val resolverByModuleDescriptor: MutableMap<ModuleDescriptor, ResolverForModule> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'!' @ [167:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCorrectModuleInfo' @ [167:14] ==> private final fun isCorrectModuleInfo(moduleInfo: M): Boolean defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [167:34] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.descriptorForModule[ValueParameterDescriptorImpl]

'AssertionError' @ [168:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'name' @ [168:36] ==> public open val name: String defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'moduleInfo' @ [168:71] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.descriptorForModule[ValueParameterDescriptorImpl]

'doGetDescriptorForModule' @ [170:16] ==> private final fun doGetDescriptorForModule(module: M): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [170:41] ==> value-parameter moduleInfo: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.descriptorForModule[ValueParameterDescriptorImpl]

'module' @ [174:13] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule[ValueParameterDescriptorImpl]

'modules' @ [174:23] ==> public final val modules: Set<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'projectContext' @ [175:20] ==> private final val projectContext: ProjectContext defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'storageManager' @ [175:35] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ProjectContext[PropertyDescriptorImpl]

'compute' @ [175:50] ==> public abstract fun <T> compute(computable: () -> ModuleDescriptorImpl): ModuleDescriptorImpl defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'descriptorByModule' @ [176:34] ==> private final val descriptorByModule: MutableMap<M, ResolverForProjectImpl.ModuleData> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'getOrPut' @ [176:53] ==> public inline fun <K, V> MutableMap<M, ResolverForProjectImpl.ModuleData>.getOrPut(key: M, defaultValue: () -> ResolverForProjectImpl.ModuleData): ResolverForProjectImpl.ModuleData defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> M
    <V> -> ModuleData

'module' @ [176:62] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule[ValueParameterDescriptorImpl]

'createModuleDescriptor' @ [177:21] ==> private final fun createModuleDescriptor(module: M): ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [177:44] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule[ValueParameterDescriptorImpl]

'moduleData' @ [179:21] ==> var moduleData: ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule.<anonymous>[LocalVariableDescriptor]

'isOutOfDate' @ [179:32] ==> public final fun isOutOfDate(): Boolean defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData[SimpleFunctionDescriptorImpl]

'moduleData' @ [180:21] ==> var moduleData: ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule.<anonymous>[LocalVariableDescriptor]

'recreateModuleDescriptor' @ [180:34] ==> private final fun recreateModuleDescriptor(module: M): ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [180:59] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule[ValueParameterDescriptorImpl]

'moduleData' @ [182:17] ==> var moduleData: ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule.<anonymous>[LocalVariableDescriptor]

'moduleDescriptor' @ [182:28] ==> public final val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData[PropertyDescriptorImpl]

'delegateResolver' @ [186:16] ==> private final val delegateResolver: ResolverForProject<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'descriptorForModule' @ [186:33] ==> public abstract fun descriptorForModule(moduleInfo: M): ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.ResolverForProject[SimpleFunctionDescriptorImpl]

'module' @ [186:53] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.doGetDescriptorForModule[ValueParameterDescriptorImpl]

'descriptorByModule' @ [190:29] ==> private final val descriptorByModule: MutableMap<M, ResolverForProjectImpl.ModuleData> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'module' @ [190:48] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [190:57] ==> public final val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData[PropertyDescriptorImpl]

'oldDescriptor' @ [191:13] ==> val oldDescriptor: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[LocalVariableDescriptor]

'oldDescriptor' @ [192:13] ==> val oldDescriptor: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[LocalVariableDescriptor]

'isValid' @ [192:27] ==> public open var isValid: Boolean defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'moduleInfoByDescriptor' @ [193:13] ==> private final val moduleInfoByDescriptor: MutableMap<ModuleDescriptorImpl, M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'remove' @ [193:36] ==> public abstract fun remove(key: ModuleDescriptorImpl): M? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldDescriptor' @ [193:43] ==> val oldDescriptor: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[LocalVariableDescriptor]

'resolverByModuleDescriptor' @ [194:13] ==> private final val resolverByModuleDescriptor: MutableMap<ModuleDescriptor, ResolverForModule> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'remove' @ [194:40] ==> public abstract fun remove(key: ModuleDescriptor): ResolverForModule? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'oldDescriptor' @ [194:47] ==> val oldDescriptor: ModuleDescriptorImpl? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[LocalVariableDescriptor]

'createModuleDescriptor' @ [197:26] ==> private final fun createModuleDescriptor(module: M): ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [197:49] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[ValueParameterDescriptorImpl]

'descriptorByModule' @ [198:9] ==> private final val descriptorByModule: MutableMap<M, ResolverForProjectImpl.ModuleData> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'module' @ [198:28] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[ValueParameterDescriptorImpl]

'moduleData' @ [198:38] ==> val moduleData: ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[LocalVariableDescriptor]

'moduleData' @ [199:16] ==> val moduleData: ResolverForProjectImpl.ModuleData defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.recreateModuleDescriptor[LocalVariableDescriptor]

'ModuleDescriptorImpl' @ [203:32] ==> @JvmOverloads public constructor ModuleDescriptorImpl(moduleName: Name, storageManager: StorageManager, builtIns: KotlinBuiltIns, multiTargetPlatform: MultiTargetPlatform? = ..., capabilities: Map<ModuleDescriptor.Capability<*>, Any?> = ...) defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedClassConstructorDescriptor]

'module' @ [203:53] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[ValueParameterDescriptorImpl]

'name' @ [203:60] ==> public abstract val name: Name defined in org.jetbrains.kotlin.analyzer.ModuleInfo[PropertyDescriptorImpl]

'projectContext' @ [204:53] ==> private final val projectContext: ProjectContext defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'storageManager' @ [204:68] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.context.ProjectContext[PropertyDescriptorImpl]

'builtIns' @ [204:84] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'invoke' @ [204:94] ==> public abstract operator fun invoke(p1: M): MultiTargetPlatform? defined in kotlin.Function1[FunctionInvokeDescriptor]

'module' @ [204:110] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[ValueParameterDescriptorImpl]

'module' @ [204:119] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[ValueParameterDescriptorImpl]

'capabilities' @ [204:126] ==> public open val capabilities: Map<ModuleDescriptor.Capability<*>, Any?> defined in org.jetbrains.kotlin.analyzer.ModuleInfo[PropertyDescriptorImpl]

'moduleInfoByDescriptor' @ [205:9] ==> private final val moduleInfoByDescriptor: MutableMap<ModuleDescriptorImpl, M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'moduleDescriptor' @ [205:32] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[LocalVariableDescriptor]

'module' @ [205:52] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[ValueParameterDescriptorImpl]

'setupModuleDescriptor' @ [206:9] ==> private final fun setupModuleDescriptor(module: M, moduleDescriptor: ModuleDescriptorImpl): Unit defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [206:31] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[ValueParameterDescriptorImpl]

'moduleDescriptor' @ [206:39] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[LocalVariableDescriptor]

'?:' @ [207:35] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ModificationTracker?, right: ModificationTracker?): ModificationTracker?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ModificationTracker?

'module' @ [207:36] ==> value-parameter module: M defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[ValueParameterDescriptorImpl]

'createModificationTracker' @ [207:69] ==> public abstract fun createModificationTracker(): ModificationTracker defined in org.jetbrains.kotlin.analyzer.TrackableModuleInfo[SimpleFunctionDescriptorImpl]

'getInstance' @ [208:67] ==> public open fun getInstance(p0: (Project..Project?)): (PsiModificationTracker..PsiModificationTracker?) defined in com.intellij.psi.util.PsiModificationTracker.SERVICE[JavaMethodDescriptor]

'projectContext' @ [208:79] ==> private final val projectContext: ProjectContext defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'project' @ [208:94] ==> public abstract val project: Project defined in org.jetbrains.kotlin.context.ProjectContext[PropertyDescriptorImpl]

'outOfCodeBlockModificationTracker' @ [208:103] ==> public final val PsiModificationTracker.outOfCodeBlockModificationTracker: ModificationTracker[MyPropertyDescriptor]

'takeIf' @ [208:137] ==> @InlineOnly @SinceKotlin public inline fun <T> ModificationTracker.takeIf(predicate: (ModificationTracker) -> Boolean): ModificationTracker? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModificationTracker

'invalidateOnOOCB' @ [208:146] ==> private final val invalidateOnOOCB: Boolean defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'ModuleData' @ [209:16] ==> public constructor ModuleData(moduleDescriptor: ModuleDescriptorImpl, modificationTracker: ModificationTracker?, modificationCount: Long?) defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.ModuleData[ClassConstructorDescriptorImpl]

'moduleDescriptor' @ [209:27] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[LocalVariableDescriptor]

'modificationTracker' @ [209:45] ==> val modificationTracker: ModificationTracker? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[LocalVariableDescriptor]

'modificationTracker' @ [209:66] ==> val modificationTracker: ModificationTracker? defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl.createModuleDescriptor[LocalVariableDescriptor]

'modificationCount' @ [209:87] ==> public final val ModificationTracker.modificationCount: Long[MyPropertyDescriptor]

'name' @ [224:39] ==> public abstract val name: Name defined in org.jetbrains.kotlin.analyzer.ModuleInfo[PropertyDescriptorImpl]

'asString' @ [224:44] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'listOf' @ [227:69] ==> @InlineOnly public inline fun <T> listOf(): List<ModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleInfo

'mapOf' @ [229:17] ==> public fun <K, V> mapOf(pair: Pair<ModuleDescriptor.Capability<*>, ModuleInfo>): Map<ModuleDescriptor.Capability<*>, ModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Capability<*>
    <V> -> ModuleInfo

'Capability' @ [229:23] ==> public final val Capability: ModuleDescriptor.Capability<ModuleInfo> defined in org.jetbrains.kotlin.analyzer.ModuleInfo.Companion[PropertyDescriptorImpl]

'this' @ [229:37] ==> <this> defined in org.jetbrains.kotlin.analyzer.ModuleInfo[LazyClassReceiverParameterDescriptor]

'if (platform == TargetPlatform.Default)
                ModuleInfo.DependencyOnBuiltIns.AFTER_SDK
            else
                ModuleInfo.DependencyOnBuiltIns.LAST' @ [237:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ModuleInfo.DependencyOnBuiltIns, elseBranch: ModuleInfo.DependencyOnBuiltIns): ModuleInfo.DependencyOnBuiltIns[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DependencyOnBuiltIns

'platform' @ [237:17] ==> public open val platform: TargetPlatform? defined in org.jetbrains.kotlin.analyzer.ModuleInfo[PropertyDescriptorImpl]

'Default' @ [237:44] ==> public object Default : TargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[FakeCallableDescriptorForObject]

'ModuleInfo' @ [238:17] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ModuleInfo[FakeCallableDescriptorForObject]

'AFTER_SDK' @ [238:49] ==> enum entry AFTER_SDK defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

'ModuleInfo' @ [240:17] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ModuleInfo[FakeCallableDescriptorForObject]

'LAST' @ [240:49] ==> enum entry LAST defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

'Capability' @ [246:43] ==> public constructor Capability<T>(name: String) defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor.Capability[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> ModuleInfo

'storageManager' @ [277:32] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [277:47] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<ModuleDescriptorImpl>): NotNullLazyValue<List<ModuleDescriptorImpl>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<ModuleDescriptorImpl>

'resolverForProject' @ [278:32] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'descriptorForModule' @ [278:51] ==> public open fun descriptorForModule(moduleInfo: M): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [278:71] ==> private final val module: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'buildSequence' @ [279:9] ==> @SinceKotlin public fun <T> buildSequence(builderAction: suspend SequenceBuilder<ModuleDescriptorImpl>.() -> Unit): Sequence<ModuleDescriptorImpl> defined in kotlin.coroutines.experimental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'firstDependency' @ [280:17] ==> value-parameter firstDependency: M? = ... defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.<init>[ValueParameterDescriptorImpl]

'yield' @ [281:17] ==> public abstract suspend fun yield(value: ModuleDescriptorImpl): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

'resolverForProject' @ [281:23] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'descriptorForModule' @ [281:42] ==> public open fun descriptorForModule(moduleInfo: M): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'firstDependency' @ [281:62] ==> value-parameter firstDependency: M? = ... defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.<init>[ValueParameterDescriptorImpl]

'module' @ [283:17] ==> private final val module: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'dependencyOnBuiltIns' @ [283:24] ==> public open fun dependencyOnBuiltIns(): ModuleInfo.DependencyOnBuiltIns defined in org.jetbrains.kotlin.analyzer.ModuleInfo[SimpleFunctionDescriptorImpl]

'ModuleInfo' @ [283:50] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ModuleInfo[FakeCallableDescriptorForObject]

'AFTER_SDK' @ [283:82] ==> enum entry AFTER_SDK defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

'yield' @ [284:17] ==> public abstract suspend fun yield(value: ModuleDescriptorImpl): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [284:23] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.dependencies.<anonymous>[LocalVariableDescriptor]

'builtIns' @ [284:40] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [284:49] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'module' @ [286:32] ==> private final val module: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'dependencies' @ [286:39] ==> public abstract fun dependencies(): List<ModuleInfo> defined in org.jetbrains.kotlin.analyzer.ModuleInfo[SimpleFunctionDescriptorImpl]

'yield' @ [287:17] ==> public abstract suspend fun yield(value: ModuleDescriptorImpl): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

'resolverForProject' @ [287:23] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'descriptorForModule' @ [287:42] ==> public open fun descriptorForModule(moduleInfo: M): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'dependency' @ [287:62] ==> val dependency: ModuleInfo defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.dependencies.<anonymous>.<anonymous>[LocalVariableDescriptor]

'module' @ [289:17] ==> private final val module: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'dependencyOnBuiltIns' @ [289:24] ==> public open fun dependencyOnBuiltIns(): ModuleInfo.DependencyOnBuiltIns defined in org.jetbrains.kotlin.analyzer.ModuleInfo[SimpleFunctionDescriptorImpl]

'ModuleInfo' @ [289:50] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ModuleInfo[FakeCallableDescriptorForObject]

'LAST' @ [289:82] ==> enum entry LAST defined in org.jetbrains.kotlin.analyzer.ModuleInfo.DependencyOnBuiltIns[FakeCallableDescriptorForObject]

'yield' @ [290:17] ==> public abstract suspend fun yield(value: ModuleDescriptorImpl): Unit defined in kotlin.coroutines.experimental.SequenceBuilder[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [290:23] ==> val moduleDescriptor: ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.dependencies.<anonymous>[LocalVariableDescriptor]

'builtIns' @ [290:40] ==> public open val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.impl.ModuleDescriptorImpl[DeserializedPropertyDescriptor]

'builtInsModule' @ [290:49] ==> public final var KotlinBuiltIns.builtInsModule: ModuleDescriptorImpl[MyPropertyDescriptor]

'toList' @ [292:11] ==> public fun <T> Sequence<ModuleDescriptorImpl>.toList(): List<ModuleDescriptorImpl> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'storageManager' @ [295:39] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [295:54] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<M>): NotNullLazyValue<Set<M>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<M>

'if (modulePlatforms(module) != MultiTargetPlatform.Common) emptySet<M>()
        else resolverForProject.modules
                .filterTo(mutableSetOf()) {
                    modulePlatforms(it) != MultiTargetPlatform.Common && module in it.dependencies()
                }' @ [296:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<M>, elseBranch: Set<M>): Set<M>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<M>

'invoke' @ [296:13] ==> public abstract operator fun invoke(p1: M): MultiTargetPlatform? defined in kotlin.Function1[FunctionInvokeDescriptor]

'module' @ [296:29] ==> private final val module: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'MultiTargetPlatform' @ [296:40] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Common' @ [296:60] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'emptySet' @ [296:68] ==> public fun <T> emptySet(): Set<M> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M

'resolverForProject' @ [297:14] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'modules' @ [297:33] ==> public final val modules: Set<M> defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[PropertyDescriptorImpl]

'filterTo' @ [298:18] ==> public inline fun <T, C : MutableCollection<in M>> Iterable<M>.filterTo(destination: MutableSet<M>, predicate: (M) -> Boolean): MutableSet<M> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M
    <C : MutableCollection<in T>> -> MutableSet<M>

'mutableSetOf' @ [298:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<M> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M

'invoke' @ [299:21] ==> public abstract operator fun invoke(p1: M): MultiTargetPlatform? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [299:37] ==> value-parameter it: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.implementingModules.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'MultiTargetPlatform' @ [299:44] ==> public companion object defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'Common' @ [299:64] ==> public object Common : MultiTargetPlatform defined in org.jetbrains.kotlin.resolve.MultiTargetPlatform[FakeCallableDescriptorForObject]

'module' @ [299:74] ==> private final val module: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'it' @ [299:84] ==> value-parameter it: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.implementingModules.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'dependencies' @ [299:87] ==> public abstract fun dependencies(): List<ModuleInfo> defined in org.jetbrains.kotlin.analyzer.ModuleInfo[SimpleFunctionDescriptorImpl]

'invoke' @ [303:70] ==> public abstract fun invoke(): List<ModuleDescriptorImpl> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'module' @ [307:13] ==> private final val module: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'modulesWhoseInternalsAreVisible' @ [307:20] ==> public open fun modulesWhoseInternalsAreVisible(): Collection<ModuleInfo> defined in org.jetbrains.kotlin.analyzer.ModuleInfo[SimpleFunctionDescriptorImpl]

'mapTo' @ [307:54] ==> public inline fun <T, R, C : MutableCollection<in ModuleDescriptorImpl>> Iterable<ModuleInfo>.mapTo(destination: LinkedHashSet<ModuleDescriptorImpl>, transform: (ModuleInfo) -> ModuleDescriptorImpl): LinkedHashSet<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleInfo
    <R> -> ModuleDescriptorImpl
    <C : MutableCollection<in R>> -> LinkedHashSet<ModuleDescriptorImpl>

'LinkedHashSet' @ [307:60] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ModuleDescriptorImpl

'resolverForProject' @ [308:17] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'descriptorForModule' @ [308:36] ==> public open fun descriptorForModule(moduleInfo: M): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'it' @ [308:56] ==> value-parameter it: ModuleInfo defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.<get-modulesWhoseInternalsAreVisible>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [312:17] ==> public abstract fun invoke(): Set<M> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'mapTo' @ [312:39] ==> public inline fun <T, R, C : MutableCollection<in ModuleDescriptorImpl>> Iterable<M>.mapTo(destination: MutableSet<ModuleDescriptorImpl>, transform: (M) -> ModuleDescriptorImpl): MutableSet<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M
    <R> -> ModuleDescriptorImpl
    <C : MutableCollection<in R>> -> MutableSet<ModuleDescriptorImpl>

'mutableSetOf' @ [312:45] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<ModuleDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleDescriptorImpl

'resolverForProject' @ [312:63] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies[PropertyDescriptorImpl]

'descriptorForModule' @ [312:82] ==> public open fun descriptorForModule(moduleInfo: M): ModuleDescriptorImpl defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'it' @ [312:102] ==> value-parameter it: M defined in org.jetbrains.kotlin.analyzer.LazyModuleDependencies.<get-allImplementingModules>.<anonymous>[ValueParameterDescriptorImpl]

'moduleContent' @ [322:41] ==> value-parameter moduleContent: ModuleContent defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.<init>[ValueParameterDescriptorImpl]

'syntheticFiles' @ [322:55] ==> public final val syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.analyzer.ModuleContent[PropertyDescriptorImpl]

'map' @ [322:70] ==> public inline fun <T, R> Iterable<KtFile>.map(transform: (KtFile) -> FqName): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R> -> FqName

'it' @ [322:76] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.syntheticFilePackages.<anonymous>[ValueParameterDescriptorImpl]

'packageFqName' @ [322:79] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'toSet' @ [322:95] ==> public fun <T> Iterable<FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'certainlyDoesNotExist' @ [325:13] ==> private final fun certainlyDoesNotExist(fqName: FqName): Boolean defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [325:35] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.getPackageFragments[ValueParameterDescriptorImpl]

'emptyList' @ [325:51] ==> public fun <T> emptyList(): List<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'resolverForProject' @ [327:16] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'resolverForModuleDescriptor' @ [327:35] ==> public open fun resolverForModuleDescriptor(descriptor: ModuleDescriptor): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [327:63] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'packageFragmentProvider' @ [327:71] ==> public final val packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[PropertyDescriptorImpl]

'getPackageFragments' @ [327:95] ==> public abstract fun getPackageFragments(fqName: FqName): List<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProvider[DeserializedSimpleFunctionDescriptor]

'fqName' @ [327:115] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.getPackageFragments[ValueParameterDescriptorImpl]

'certainlyDoesNotExist' @ [331:13] ==> private final fun certainlyDoesNotExist(fqName: FqName): Boolean defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[SimpleFunctionDescriptorImpl]

'fqName' @ [331:35] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.getSubPackagesOf[ValueParameterDescriptorImpl]

'emptyList' @ [331:51] ==> public fun <T> emptyList(): List<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'resolverForProject' @ [333:16] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'resolverForModuleDescriptor' @ [333:35] ==> public open fun resolverForModuleDescriptor(descriptor: ModuleDescriptor): ResolverForModule defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [333:63] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'packageFragmentProvider' @ [333:71] ==> public final val packageFragmentProvider: PackageFragmentProvider defined in org.jetbrains.kotlin.analyzer.ResolverForModule[PropertyDescriptorImpl]

'getSubPackagesOf' @ [333:95] ==> public abstract fun getSubPackagesOf(fqName: FqName, nameFilter: (Name) -> Boolean): Collection<FqName> defined in org.jetbrains.kotlin.descriptors.PackageFragmentProvider[DeserializedSimpleFunctionDescriptor]

'fqName' @ [333:112] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.getSubPackagesOf[ValueParameterDescriptorImpl]

'nameFilter' @ [333:120] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.getSubPackagesOf[ValueParameterDescriptorImpl]

'resolverForProject' @ [337:13] ==> private final val resolverForProject: ResolverForProjectImpl<M> defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'isResolverForModuleDescriptorComputed' @ [337:32] ==> internal final fun isResolverForModuleDescriptorComputed(descriptor: ModuleDescriptor): Boolean defined in org.jetbrains.kotlin.analyzer.ResolverForProjectImpl[SimpleFunctionDescriptorImpl]

'module' @ [337:70] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'!' @ [339:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageOracle' @ [339:17] ==> private final val packageOracle: PackageOracle defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'packageExists' @ [339:31] ==> public abstract fun packageExists(fqName: FqName): Boolean defined in org.jetbrains.kotlin.analyzer.PackageOracle[SimpleFunctionDescriptorImpl]

'fqName' @ [339:45] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.certainlyDoesNotExist[ValueParameterDescriptorImpl]

'fqName' @ [339:56] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider.certainlyDoesNotExist[ValueParameterDescriptorImpl]

'syntheticFilePackages' @ [339:67] ==> private final val syntheticFilePackages: Set<FqName> defined in org.jetbrains.kotlin.analyzer.DelegatingPackageFragmentProvider[PropertyDescriptorImpl]

'Optimistic' @ [355:75] ==> public object Optimistic : PackageOracle defined in org.jetbrains.kotlin.analyzer.PackageOracle[FakeCallableDescriptorForObject]

'LanguageVersionSettingsImpl' @ [365:93] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[FakeCallableDescriptorForObject]

'DEFAULT' @ [365:121] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'NoVersion' @ [367:111] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'?:' @ [376:83] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ResolverForModuleComputationTracker?, right: ResolverForModuleComputationTracker?): ResolverForModuleComputationTracker?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ResolverForModuleComputationTracker?

'getService' @ [376:98] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ResolverForModuleComputationTracker..ResolverForModuleComputationTracker?)>): (ResolverForModuleComputationTracker..ResolverForModuleComputationTracker?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ResolverForModuleComputationTracker

'project' @ [376:109] ==> value-parameter project: Project defined in org.jetbrains.kotlin.analyzer.ResolverForModuleComputationTracker.Companion.getInstance[ValueParameterDescriptorImpl]

'ResolverForModuleComputationTracker' @ [376:118] ==> public companion object defined in org.jetbrains.kotlin.analyzer.ResolverForModuleComputationTracker[FakeCallableDescriptorForObject]

'java' @ [376:161] ==> public val <T> KClass<ResolverForModuleComputationTracker>.java: Class<ResolverForModuleComputationTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ResolverForModuleComputationTracker

