'ConcurrentHashMap' @ [52:28] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> ModStampedRequest

'ScriptContentLoader' @ [53:33] ==> public constructor ScriptContentLoader(project: Project) defined in org.jetbrains.kotlin.script.ScriptContentLoader[DeserializedClassConstructorDescriptor]

'project' @ [53:53] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'newFixedThreadPool' @ [54:52] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'asCoroutineDispatcher' @ [54:74] ==> public fun Executor.asCoroutineDispatcher(): CoroutineDispatcher defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'newFixedThreadPool' @ [56:23] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'/' @ [57:22] ==> public final operator fun div(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'getRuntime' @ [57:30] ==> public open fun getRuntime(): (Runtime..Runtime?) defined in java.lang.Runtime[JavaMethodDescriptor]

'availableProcessors' @ [57:43] ==> public open fun availableProcessors(): Int defined in java.lang.Runtime[JavaMethodDescriptor]

'coerceAtLeast' @ [57:70] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'asCoroutineDispatcher' @ [58:15] ==> public fun Executor.asCoroutineDispatcher(): CoroutineDispatcher defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'listenToVfsChanges' @ [61:9] ==> private final fun listenToVfsChanges(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'ModStampedRequest' @ [65:49] ==> public constructor ModStampedRequest(modificationStamp: Long, job: ScriptDependenciesUpdater.TimeStampedJob?) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.ModStampedRequest[ClassConstructorDescriptorImpl]

'virtualFile' @ [65:67] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.TimeStampedJob.stampBy[ValueParameterDescriptorImpl]

'modificationStamp' @ [65:79] ==> public final val VirtualFile.modificationStamp: Long[MyPropertyDescriptor]

'this' @ [65:98] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.TimeStampedJob[LazyClassReceiverParameterDescriptor]

'job' @ [72:24] ==> public final val job: ScriptDependenciesUpdater.TimeStampedJob? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.ModStampedRequest[PropertyDescriptorImpl]

'actualJob' @ [72:29] ==> public final val actualJob: Job defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.TimeStampedJob[PropertyDescriptorImpl]

'cancel' @ [72:40] ==> public abstract fun cancel(cause: Throwable? = ...): Boolean defined in kotlinx.coroutines.experimental.Job[DeserializedSimpleFunctionDescriptor]

'cache' @ [76:9] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'file' @ [76:15] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.getCurrentDependencies[ValueParameterDescriptorImpl]

'let' @ [76:22] ==> @InlineOnly public inline fun <T, R> ScriptDependencies.let(block: (ScriptDependencies) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> Nothing

'it' @ [76:35] ==> value-parameter it: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.getCurrentDependencies.<anonymous>[ValueParameterDescriptorImpl]

'tryLoadingFromDisk' @ [78:9] ==> private final fun tryLoadingFromDisk(file: VirtualFile): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [78:28] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.getCurrentDependencies[ValueParameterDescriptorImpl]

'updateCache' @ [80:9] ==> private final fun updateCache(files: Iterable<VirtualFile>): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'listOf' @ [80:21] ==> public fun <T> listOf(element: VirtualFile): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'file' @ [80:28] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.getCurrentDependencies[ValueParameterDescriptorImpl]

'cache' @ [82:16] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'file' @ [82:22] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.getCurrentDependencies[ValueParameterDescriptorImpl]

'ScriptDependencies' @ [82:31] ==> public companion object defined in kotlin.script.experimental.dependencies.ScriptDependencies[FakeCallableDescriptorForObject]

'Empty' @ [82:50] ==> public final val Empty: ScriptDependencies defined in kotlin.script.experimental.dependencies.ScriptDependencies.Companion[DeserializedPropertyDescriptor]

'ScriptDependenciesFileAttribute' @ [86:9] ==> public object ScriptDependenciesFileAttribute defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[FakeCallableDescriptorForObject]

'read' @ [86:41] ==> public final fun read(virtualFile: VirtualFile): ScriptDependencies? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[SimpleFunctionDescriptorImpl]

'file' @ [86:46] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.tryLoadingFromDisk[ValueParameterDescriptorImpl]

'let' @ [86:53] ==> @InlineOnly public inline fun <T, R> ScriptDependencies.let(block: (ScriptDependencies) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> Unit

'cache' @ [87:32] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'hasNotCachedRoots' @ [87:38] ==> public final fun hasNotCachedRoots(scriptDependencies: ScriptDependencies): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'deserialized' @ [87:56] ==> value-parameter deserialized: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.tryLoadingFromDisk.<anonymous>[ValueParameterDescriptorImpl]

'cache' @ [88:13] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'save' @ [88:19] ==> public final fun save(virtualFile: VirtualFile, new: ScriptDependencies): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'file' @ [88:24] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.tryLoadingFromDisk[ValueParameterDescriptorImpl]

'deserialized' @ [88:30] ==> value-parameter deserialized: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.tryLoadingFromDisk.<anonymous>[ValueParameterDescriptorImpl]

'rootsChanged' @ [89:17] ==> val rootsChanged: Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.tryLoadingFromDisk.<anonymous>[LocalVariableDescriptor]

'notifyRootsChanged' @ [90:17] ==> public final fun notifyRootsChanged(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'files' @ [96:13] ==> value-parameter files: Iterable<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateCache[ValueParameterDescriptorImpl]

'map' @ [96:19] ==> public inline fun <T, R> Iterable<VirtualFile>.map(transform: (VirtualFile) -> Boolean): List<Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Boolean

'if (!file.isValid) {
                    return cache.delete(file)
                }
                else {
                    updateForFile(file)
                }' @ [97:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [97:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [97:22] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateCache.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [97:27] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'cache' @ [98:28] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'delete' @ [98:34] ==> public final fun delete(virtualFile: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'file' @ [98:41] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateCache.<anonymous>[ValueParameterDescriptorImpl]

'updateForFile' @ [101:21] ==> private final fun updateForFile(file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [101:35] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateCache.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [103:15] ==> public abstract fun contains(element: Boolean): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'scriptDefinitionProvider' @ [106:25] ==> private final val scriptDefinitionProvider: KotlinScriptDefinitionProvider defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'findScriptDefinition' @ [106:50] ==> public final fun findScriptDefinition(file: VirtualFile): KotlinScriptDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'file' @ [106:71] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateForFile[ValueParameterDescriptorImpl]

'when (scriptDef.dependencyResolver) {
            is AsyncDependenciesResolver, is LegacyResolverWrapper -> {
                updateAsync(file, scriptDef)
                return false
            }
            else -> updateSync(file, scriptDef)
        }' @ [108:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'scriptDef' @ [108:22] ==> val scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateForFile[LocalVariableDescriptor]

'dependencyResolver' @ [108:32] ==> public open val dependencyResolver: DependenciesResolver defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'updateAsync' @ [110:17] ==> private final fun updateAsync(file: VirtualFile, scriptDefinition: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [110:29] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateForFile[ValueParameterDescriptorImpl]

'scriptDef' @ [110:35] ==> val scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateForFile[LocalVariableDescriptor]

'updateSync' @ [113:21] ==> public final fun updateSync(file: VirtualFile, scriptDef: KotlinScriptDefinition): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [113:32] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateForFile[ValueParameterDescriptorImpl]

'scriptDef' @ [113:38] ==> val scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateForFile[LocalVariableDescriptor]

'file' @ [121:20] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[ValueParameterDescriptorImpl]

'path' @ [121:25] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'requests' @ [122:27] ==> private final val requests: ConcurrentHashMap<String, ScriptDependenciesUpdater.ModStampedRequest> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'path' @ [122:36] ==> val path: String defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[LocalVariableDescriptor]

'!' @ [124:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldSendNewRequest' @ [124:14] ==> private final fun shouldSendNewRequest(file: VirtualFile, previousRequest: ScriptDependenciesUpdater.ModStampedRequest?): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [124:35] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[ValueParameterDescriptorImpl]

'lastRequest' @ [124:41] ==> val lastRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[LocalVariableDescriptor]

'lastRequest' @ [128:9] ==> val lastRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[LocalVariableDescriptor]

'cancel' @ [128:22] ==> public final fun cancel(): Boolean? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.ModStampedRequest[SimpleFunctionDescriptorImpl]

'requests' @ [130:9] ==> private final val requests: ConcurrentHashMap<String, ScriptDependenciesUpdater.ModStampedRequest> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'path' @ [130:18] ==> val path: String defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[LocalVariableDescriptor]

'sendRequest' @ [130:26] ==> private final fun sendRequest(file: VirtualFile, scriptDef: KotlinScriptDefinition): ScriptDependenciesUpdater.TimeStampedJob defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [130:38] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[ValueParameterDescriptorImpl]

'scriptDefinition' @ [130:44] ==> value-parameter scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[ValueParameterDescriptorImpl]

'stampBy' @ [130:62] ==> public final fun stampBy(virtualFile: VirtualFile): ScriptDependenciesUpdater.ModStampedRequest defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.TimeStampedJob[SimpleFunctionDescriptorImpl]

'file' @ [130:70] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateAsync[ValueParameterDescriptorImpl]

'previousRequest' @ [135:13] ==> value-parameter previousRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.shouldSendNewRequest[ValueParameterDescriptorImpl]

'file' @ [137:16] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.shouldSendNewRequest[ValueParameterDescriptorImpl]

'modificationStamp' @ [137:21] ==> public final val VirtualFile.modificationStamp: Long[MyPropertyDescriptor]

'previousRequest' @ [137:42] ==> value-parameter previousRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.shouldSendNewRequest[ValueParameterDescriptorImpl]

'modificationStamp' @ [137:58] ==> public final val modificationStamp: Long defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.ModStampedRequest[PropertyDescriptorImpl]

'TimeStamps' @ [144:32] ==> private object TimeStamps defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesUpdater.kt[FakeCallableDescriptorForObject]

'next' @ [144:43] ==> public final fun next(): TimeStamp defined in org.jetbrains.kotlin.idea.core.script.TimeStamps[SimpleFunctionDescriptorImpl]

'scriptDef' @ [146:36] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'dependencyResolver' @ [146:46] ==> public open val dependencyResolver: DependenciesResolver defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'contentLoader' @ [147:30] ==> private final val contentLoader: ScriptContentLoader defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'getScriptContents' @ [147:44] ==> public final fun getScriptContents(scriptDefinition: KotlinScriptDefinition, file: VirtualFile): ScriptContentLoader.BasicScriptContents defined in org.jetbrains.kotlin.script.ScriptContentLoader[DeserializedSimpleFunctionDescriptor]

'scriptDef' @ [147:62] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'file' @ [147:73] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'contentLoader' @ [148:27] ==> private final val contentLoader: ScriptContentLoader defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'getEnvironment' @ [148:41] ==> public final fun getEnvironment(scriptDef: KotlinScriptDefinition): Map<String, Any?> defined in org.jetbrains.kotlin.script.ScriptContentLoader[DeserializedSimpleFunctionDescriptor]

'scriptDef' @ [148:56] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'if (dependenciesResolver is AsyncDependenciesResolver) {
            launchAsyncUpdate(asyncUpdatesDispatcher, file, currentTimeStamp, scriptDef) {
                    dependenciesResolver.resolveAsync(scriptContents, environment)
            }
        }
        else {
            assert(dependenciesResolver is LegacyResolverWrapper)
            launchAsyncUpdate(legacyUpdatesDispatcher, file, currentTimeStamp, scriptDef) {
                dependenciesResolver.resolve(scriptContents, environment)
            }
        }' @ [149:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Job, elseBranch: Job): Job[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Job

'dependenciesResolver' @ [149:26] ==> val dependenciesResolver: DependenciesResolver defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'launchAsyncUpdate' @ [150:13] ==> private final fun launchAsyncUpdate(dispatcher: CoroutineDispatcher, file: VirtualFile, currentTimeStamp: TimeStamp, scriptDef: KotlinScriptDefinition, doResolve: suspend () -> DependenciesResolver.ResolveResult): Job defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'asyncUpdatesDispatcher' @ [150:31] ==> private final val asyncUpdatesDispatcher: CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'file' @ [150:55] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'currentTimeStamp' @ [150:61] ==> val currentTimeStamp: TimeStamp defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'scriptDef' @ [150:79] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'dependenciesResolver' @ [151:21] ==> val dependenciesResolver: DependenciesResolver defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'resolveAsync' @ [151:42] ==> public abstract suspend fun resolveAsync(scriptContents: ScriptContents, environment: Environment /* = Map<String, Any?> */): DependenciesResolver.ResolveResult defined in kotlin.script.experimental.dependencies.AsyncDependenciesResolver[DeserializedSimpleFunctionDescriptor]

'scriptContents' @ [151:55] ==> val scriptContents: ScriptContentLoader.BasicScriptContents defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'environment' @ [151:71] ==> val environment: Map<String, Any?> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'assert' @ [155:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'dependenciesResolver' @ [155:20] ==> val dependenciesResolver: DependenciesResolver defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'launchAsyncUpdate' @ [156:13] ==> private final fun launchAsyncUpdate(dispatcher: CoroutineDispatcher, file: VirtualFile, currentTimeStamp: TimeStamp, scriptDef: KotlinScriptDefinition, doResolve: suspend () -> DependenciesResolver.ResolveResult): Job defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'legacyUpdatesDispatcher' @ [156:31] ==> private final val legacyUpdatesDispatcher: CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'file' @ [156:56] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'currentTimeStamp' @ [156:62] ==> val currentTimeStamp: TimeStamp defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'scriptDef' @ [156:80] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[ValueParameterDescriptorImpl]

'dependenciesResolver' @ [157:17] ==> val dependenciesResolver: DependenciesResolver defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'resolve' @ [157:38] ==> public abstract fun resolve(scriptContents: ScriptContents, environment: Environment /* = Map<String, Any?> */): DependenciesResolver.ResolveResult defined in kotlin.script.experimental.dependencies.DependenciesResolver[DeserializedSimpleFunctionDescriptor]

'scriptContents' @ [157:46] ==> val scriptContents: ScriptContentLoader.BasicScriptContents defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'environment' @ [157:62] ==> val environment: Map<String, Any?> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'TimeStampedJob' @ [160:16] ==> public constructor TimeStampedJob(actualJob: Job, timeStamp: TimeStamp) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.TimeStampedJob[ClassConstructorDescriptorImpl]

'newJob' @ [160:31] ==> val newJob: Job defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'currentTimeStamp' @ [160:39] ==> val currentTimeStamp: TimeStamp defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.sendRequest[LocalVariableDescriptor]

'launch' @ [169:9] ==> public fun launch(context: CoroutineContext, start: Boolean = ..., block: suspend CoroutineScope.() -> Unit): Job defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'dispatcher' @ [169:16] ==> value-parameter dispatcher: CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.launchAsyncUpdate[ValueParameterDescriptorImpl]

'invoke' @ [171:13] ==> public abstract operator suspend fun invoke(): DependenciesResolver.ResolveResult defined in kotlin.SuspendFunction0[FunctionInvokeDescriptor]

't' @ [174:13] ==> val t: Throwable defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.launchAsyncUpdate.<anonymous>[LocalVariableDescriptor]

'asResolveFailure' @ [174:15] ==> public fun Throwable.asResolveFailure(scriptDef: KotlinScriptDefinition): DependenciesResolver.ResolveResult.Failure defined in org.jetbrains.kotlin.script[DeserializedSimpleFunctionDescriptor]

'scriptDef' @ [174:32] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.launchAsyncUpdate[ValueParameterDescriptorImpl]

'processResult' @ [177:9] ==> private final fun processResult(file: VirtualFile, currentTimeStamp: TimeStamp, result: DependenciesResolver.ResolveResult, scriptDef: KotlinScriptDefinition): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [177:23] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.launchAsyncUpdate[ValueParameterDescriptorImpl]

'currentTimeStamp' @ [177:29] ==> value-parameter currentTimeStamp: TimeStamp defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.launchAsyncUpdate[ValueParameterDescriptorImpl]

'result' @ [177:47] ==> val result: DependenciesResolver.ResolveResult defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.launchAsyncUpdate.<anonymous>[LocalVariableDescriptor]

'scriptDef' @ [177:55] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.launchAsyncUpdate[ValueParameterDescriptorImpl]

'requests' @ [186:27] ==> private final val requests: ConcurrentHashMap<String, ScriptDependenciesUpdater.ModStampedRequest> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'file' @ [186:36] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'path' @ [186:41] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'lastRequest' @ [187:29] ==> val lastRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'job' @ [187:42] ==> public final val job: ScriptDependenciesUpdater.TimeStampedJob? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.ModStampedRequest[PropertyDescriptorImpl]

'timeStamp' @ [187:47] ==> public final val timeStamp: TimeStamp defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.TimeStampedJob[PropertyDescriptorImpl]

'lastTimeStamp' @ [188:33] ==> val lastTimeStamp: TimeStamp? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'lastTimeStamp' @ [188:58] ==> val lastTimeStamp: TimeStamp? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'currentTimeStamp' @ [188:75] ==> value-parameter currentTimeStamp: TimeStamp defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'isLastSentRequest' @ [189:13] ==> val isLastSentRequest: Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'lastRequest' @ [190:17] ==> val lastRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'requests' @ [192:17] ==> private final val requests: ConcurrentHashMap<String, ScriptDependenciesUpdater.ModStampedRequest> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'replace' @ [192:26] ==> public open fun replace(p0: String, p1: ScriptDependenciesUpdater.ModStampedRequest, p2: ScriptDependenciesUpdater.ModStampedRequest): Boolean defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'file' @ [192:34] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'path' @ [192:39] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'lastRequest' @ [192:45] ==> val lastRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'ModStampedRequest' @ [192:58] ==> public constructor ModStampedRequest(modificationStamp: Long, job: ScriptDependenciesUpdater.TimeStampedJob?) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.ModStampedRequest[ClassConstructorDescriptorImpl]

'lastRequest' @ [192:76] ==> val lastRequest: ScriptDependenciesUpdater.ModStampedRequest? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'modificationStamp' @ [192:88] ==> public final val modificationStamp: Long defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.ModStampedRequest[PropertyDescriptorImpl]

'getService' @ [194:28] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ScriptReportSink..ScriptReportSink?)>): (ScriptReportSink..ScriptReportSink?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptReportSink

'project' @ [194:39] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'java' @ [194:72] ==> public val <T> KClass<ScriptReportSink>.java: Class<ScriptReportSink> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptReportSink

'attachReports' @ [194:79] ==> public abstract fun attachReports(scriptFile: VirtualFile, reports: List<ScriptReport>): Unit defined in org.jetbrains.kotlin.script.ScriptReportSink[DeserializedSimpleFunctionDescriptor]

'file' @ [194:93] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'result' @ [194:99] ==> value-parameter result: DependenciesResolver.ResolveResult defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'reports' @ [194:106] ==> public abstract val reports: List<ScriptReport> defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult[DeserializedPropertyDescriptor]

'result' @ [195:42] ==> value-parameter result: DependenciesResolver.ResolveResult defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'dependencies' @ [195:49] ==> public abstract val dependencies: ScriptDependencies? defined in kotlin.script.experimental.dependencies.DependenciesResolver.ResolveResult[DeserializedPropertyDescriptor]

'ScriptDependencies' @ [195:65] ==> public companion object defined in kotlin.script.experimental.dependencies.ScriptDependencies[FakeCallableDescriptorForObject]

'Empty' @ [195:84] ==> public final val Empty: ScriptDependencies defined in kotlin.script.experimental.dependencies.ScriptDependencies.Companion[DeserializedPropertyDescriptor]

'adjustByDefinition' @ [195:91] ==> public fun ScriptDependencies.adjustByDefinition(scriptDef: KotlinScriptDefinition): ScriptDependencies defined in org.jetbrains.kotlin.script[DeserializedSimpleFunctionDescriptor]

'scriptDef' @ [195:110] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'saveNewDependencies' @ [196:17] ==> private final fun saveNewDependencies(new: ScriptDependencies, file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'resultingDependencies' @ [196:37] ==> val resultingDependencies: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[LocalVariableDescriptor]

'file' @ [196:60] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.processResult[ValueParameterDescriptorImpl]

'notifyRootsChanged' @ [197:17] ==> public final fun notifyRootsChanged(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'contentLoader' @ [204:23] ==> private final val contentLoader: ScriptContentLoader defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'loadContentsAndResolveDependencies' @ [204:37] ==> public final fun loadContentsAndResolveDependencies(scriptDef: KotlinScriptDefinition, file: VirtualFile): ScriptDependencies? defined in org.jetbrains.kotlin.script.ScriptContentLoader[DeserializedSimpleFunctionDescriptor]

'scriptDef' @ [204:72] ==> value-parameter scriptDef: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateSync[ValueParameterDescriptorImpl]

'file' @ [204:83] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateSync[ValueParameterDescriptorImpl]

'ScriptDependencies' @ [204:92] ==> public companion object defined in kotlin.script.experimental.dependencies.ScriptDependencies[FakeCallableDescriptorForObject]

'Empty' @ [204:111] ==> public final val Empty: ScriptDependencies defined in kotlin.script.experimental.dependencies.ScriptDependencies.Companion[DeserializedPropertyDescriptor]

'saveNewDependencies' @ [205:16] ==> private final fun saveNewDependencies(new: ScriptDependencies, file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'newDeps' @ [205:36] ==> val newDeps: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateSync[LocalVariableDescriptor]

'file' @ [205:45] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.updateSync[ValueParameterDescriptorImpl]

'cache' @ [212:28] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'hasNotCachedRoots' @ [212:34] ==> public final fun hasNotCachedRoots(scriptDependencies: ScriptDependencies): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'new' @ [212:52] ==> value-parameter new: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.saveNewDependencies[ValueParameterDescriptorImpl]

'cache' @ [213:13] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'save' @ [213:19] ==> public final fun save(virtualFile: VirtualFile, new: ScriptDependencies): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'file' @ [213:24] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.saveNewDependencies[ValueParameterDescriptorImpl]

'new' @ [213:30] ==> value-parameter new: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.saveNewDependencies[ValueParameterDescriptorImpl]

'ScriptDependenciesFileAttribute' @ [214:13] ==> public object ScriptDependenciesFileAttribute defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[FakeCallableDescriptorForObject]

'write' @ [214:45] ==> public final fun write(virtualFile: VirtualFile, dependencies: ScriptDependencies): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[SimpleFunctionDescriptorImpl]

'file' @ [214:51] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.saveNewDependencies[ValueParameterDescriptorImpl]

'new' @ [214:57] ==> value-parameter new: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.saveNewDependencies[ValueParameterDescriptorImpl]

'rootsChanged' @ [216:16] ==> val rootsChanged: Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.saveNewDependencies[LocalVariableDescriptor]

'runWriteAction' @ [221:13] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'project' @ [222:21] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'isDisposed' @ [222:29] ==> public final val Project.isDisposed: Boolean[MyPropertyDescriptor]

'getInstanceEx' @ [224:38] ==> public open fun getInstanceEx(p0: (Project..Project?)): (ProjectRootManagerEx..ProjectRootManagerEx?) defined in com.intellij.openapi.roots.ex.ProjectRootManagerEx[JavaMethodDescriptor]

'project' @ [224:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'makeRootsChange' @ [224:62] ==> public abstract fun makeRootsChange(@NotNull p0: Runnable, p1: Boolean, p2: Boolean): Unit defined in com.intellij.openapi.roots.ex.ProjectRootManagerEx[JavaMethodDescriptor]

'getInstance' @ [224:92] ==> public open fun getInstance(): (Runnable..Runnable?) defined in com.intellij.openapi.util.EmptyRunnable[JavaMethodDescriptor]

'ScriptDependenciesModificationTracker' @ [225:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [225:55] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesModificationTracker defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [225:67] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'incModificationCount' @ [225:76] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker[JavaMethodDescriptor]

'getApplication' @ [229:46] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'if (application.isUnitTestMode) {
            rootsChangesRunnable.invoke()
        }
        else {
            application.invokeLater(rootsChangesRunnable, ModalityState.defaultModalityState())
        }' @ [230:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'application' @ [230:13] ==> val application: (Application..Application?) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.notifyRootsChanged[LocalVariableDescriptor]

'isUnitTestMode' @ [230:25] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'rootsChangesRunnable' @ [231:13] ==> val rootsChangesRunnable: () -> Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.notifyRootsChanged[LocalVariableDescriptor]

'invoke' @ [231:34] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'application' @ [234:13] ==> val application: (Application..Application?) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.notifyRootsChanged[LocalVariableDescriptor]

'invokeLater' @ [234:25] ==> public final fun invokeLater(@NotNull p0: () -> Unit, @NotNull p1: ModalityState): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'rootsChangesRunnable' @ [234:37] ==> val rootsChangesRunnable: () -> Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.notifyRootsChanged[LocalVariableDescriptor]

'defaultModalityState' @ [234:73] ==> @NotNull public open fun defaultModalityState(): ModalityState defined in com.intellij.openapi.application.ModalityState[JavaMethodDescriptor]

'project' @ [239:9] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'messageBus' @ [239:17] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [239:28] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'subscribe' @ [239:38] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(BulkFileListener..BulkFileListener?)>, @NotNull p1: BulkFileListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> BulkFileListener

'VFS_CHANGES' @ [239:67] ==> public final val VFS_CHANGES: (Topic<(BulkFileListener..BulkFileListener?)>..Topic<(BulkFileListener..BulkFileListener?)>?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaPropertyDescriptor]

'BulkFileListener.Adapter' @ [239:89] ==> public constructor Adapter() defined in com.intellij.openapi.vfs.newvfs.BulkFileListener.Adapter[JavaClassConstructorDescriptor]

'getInstance' @ [240:55] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [240:67] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'fileIndex' @ [240:76] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'getApplication' @ [241:50] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'application' @ [244:21] ==> public final val application: (Application..Application?) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>[PropertyDescriptorImpl]

'isUnitTestMode' @ [244:33] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'application' @ [244:51] ==> public final val application: (Application..Application?) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>[PropertyDescriptorImpl]

'isScriptDependenciesUpdaterDisabled' @ [244:63] ==> public var Application.isScriptDependenciesUpdaterDisabled: Boolean defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesUpdater.kt[PropertyDescriptorImpl]

'updateCache' @ [248:21] ==> private final fun updateCache(files: Iterable<VirtualFile>): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'events' @ [248:33] ==> value-parameter events: List<VFileEvent> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>.after[ValueParameterDescriptorImpl]

'mapNotNull' @ [248:40] ==> public inline fun <T, R : Any> Iterable<VFileEvent>.mapNotNull(transform: (VFileEvent) -> VirtualFile?): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VFileEvent
    <R : Any> -> VirtualFile

'it' @ [250:21] ==> value-parameter it: VFileEvent defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>.after.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [250:24] ==> public final val VFileEvent.file: VirtualFile?[MyPropertyDescriptor]

'takeIf' @ [250:30] ==> @InlineOnly @SinceKotlin public inline fun <T> VirtualFile.takeIf(predicate: (VirtualFile) -> Boolean): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'application' @ [253:26] ==> public final val application: (Application..Application?) defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>[PropertyDescriptorImpl]

'isUnitTestMode' @ [253:38] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'projectFileIndex' @ [253:56] ==> public final val projectFileIndex: ProjectFileIndex defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>[PropertyDescriptorImpl]

'isInContent' @ [253:73] ==> public abstract fun isInContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'it' @ [253:85] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>.after.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [253:93] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isProjectOrWorkspaceFile' @ [253:94] ==> public fun isProjectOrWorkspaceFile(file: VirtualFile): Boolean defined in com.intellij.openapi.project[DeserializedSimpleFunctionDescriptor]

'it' @ [253:119] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater.listenToVfsChanges.<no name provided>.after.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'notifyRootsChanged' @ [256:21] ==> public final fun notifyRootsChanged(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'cache' @ [263:9] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'clear' @ [263:15] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'requests' @ [264:9] ==> private final val requests: ConcurrentHashMap<String, ScriptDependenciesUpdater.ModStampedRequest> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[PropertyDescriptorImpl]

'clear' @ [264:18] ==> public open fun clear(): Unit defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'this' @ [269:48] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.TimeStamp[LazyClassReceiverParameterDescriptor]

'stamp' @ [269:53] ==> private final val stamp: Long defined in org.jetbrains.kotlin.idea.core.script.TimeStamp[PropertyDescriptorImpl]

'compareTo' @ [269:59] ==> public open fun compareTo(other: Long): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'other' @ [269:69] ==> value-parameter other: TimeStamp defined in org.jetbrains.kotlin.idea.core.script.TimeStamp.compareTo[ValueParameterDescriptorImpl]

'stamp' @ [269:75] ==> private final val stamp: Long defined in org.jetbrains.kotlin.idea.core.script.TimeStamp[PropertyDescriptorImpl]

'TimeStamp' @ [275:18] ==> public constructor TimeStamp(stamp: Long) defined in org.jetbrains.kotlin.idea.core.script.TimeStamp[ClassConstructorDescriptorImpl]

'current' @ [275:28] ==> private final var current: Long defined in org.jetbrains.kotlin.idea.core.script.TimeStamps[PropertyDescriptorImpl]

'NotNullableUserDataProperty' @ [279:56] ==> public constructor NotNullableUserDataProperty<in R : UserDataHolder, T : Any>(key: Key<Boolean>, defaultValue: Boolean) defined in org.jetbrains.kotlin.psi.NotNullableUserDataProperty[DeserializedClassConstructorDescriptor]
Inferred types:
    <in R : UserDataHolder> -> Application
    <T : Any> -> Boolean

'create' @ [279:88] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

