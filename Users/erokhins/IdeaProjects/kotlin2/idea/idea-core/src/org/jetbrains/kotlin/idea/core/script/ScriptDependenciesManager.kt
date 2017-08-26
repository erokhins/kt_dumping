'scriptDependenciesManager' @ [39:16] ==> private final val scriptDependenciesManager: ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.IdeScriptDependenciesProvider[PropertyDescriptorImpl]

'getScriptDependencies' @ [39:42] ==> public final fun getScriptDependencies(file: VirtualFile): ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'file' @ [39:64] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.IdeScriptDependenciesProvider.getScriptDependencies[ValueParameterDescriptorImpl]

'reloadScriptDefinitions' @ [50:9] ==> private final fun reloadScriptDefinitions(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'toVfsRoots' @ [53:68] ==> public final fun toVfsRoots(roots: Iterable<File>): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'cacheUpdater' @ [53:79] ==> private final val cacheUpdater: ScriptDependenciesUpdater defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'getCurrentDependencies' @ [53:92] ==> public final fun getCurrentDependencies(file: VirtualFile): ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [53:115] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.getScriptClasspath[ValueParameterDescriptorImpl]

'classpath' @ [53:121] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'cacheUpdater' @ [54:52] ==> private final val cacheUpdater: ScriptDependenciesUpdater defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'getCurrentDependencies' @ [54:65] ==> public final fun getCurrentDependencies(file: VirtualFile): ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'file' @ [54:88] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.getScriptDependencies[ValueParameterDescriptorImpl]

'makeScriptDefsFromTemplatesProviderExtensions' @ [57:19] ==> public fun makeScriptDefsFromTemplatesProviderExtensions(project: Project, errorsHandler: (ScriptTemplatesProvider, Throwable) -> Unit): List<KotlinScriptDefinition> defined in org.jetbrains.kotlin.script[DeserializedSimpleFunctionDescriptor]

'project' @ [58:17] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'scriptDefinitionProvider' @ [60:9] ==> private final val scriptDefinitionProvider: KotlinScriptDefinitionProvider defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'setScriptDefinitions' @ [60:34] ==> public final fun setScriptDefinitions(newDefinitions: List<KotlinScriptDefinition>): Boolean defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'def' @ [60:55] ==> val def: List<KotlinScriptDefinition> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.reloadScriptDefinitions[LocalVariableDescriptor]

'cache' @ [63:41] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'allScriptsClasspathScope' @ [63:47] ==> public final val allScriptsClasspathScope: ClearableLazyValue<NonClasspathDirectoriesScope> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [63:72] ==> public final fun get(): NonClasspathDirectoriesScope defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'cache' @ [64:39] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'allLibrarySourcesScope' @ [64:45] ==> public final val allLibrarySourcesScope: ClearableLazyValue<NonClasspathDirectoriesScope> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [64:68] ==> public final fun get(): NonClasspathDirectoriesScope defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'cache' @ [65:34] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'allLibrarySourcesCache' @ [65:40] ==> public final val allLibrarySourcesCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [65:63] ==> public final fun get(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'cache' @ [66:36] ==> private final val cache: ScriptDependenciesCache defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'allScriptsClasspathCache' @ [66:42] ==> public final val allScriptsClasspathCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [66:67] ==> public final fun get(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'JvmStatic' @ [69:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getService' @ [71:32] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ScriptDependenciesManager..ScriptDependenciesManager?)>): (ScriptDependenciesManager..ScriptDependenciesManager?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ScriptDependenciesManager

'project' @ [71:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.getInstance[ValueParameterDescriptorImpl]

'ScriptDependenciesManager' @ [71:52] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'java' @ [71:85] ==> public val <T> KClass<ScriptDependenciesManager>.java: Class<ScriptDependenciesManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptDependenciesManager

'roots' @ [74:20] ==> value-parameter roots: Iterable<File> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.toVfsRoots[ValueParameterDescriptorImpl]

'mapNotNull' @ [74:26] ==> public inline fun <T, R : Any> Iterable<File>.mapNotNull(transform: (File) -> VirtualFile?): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R : Any> -> VirtualFile

'it' @ [74:39] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.toVfsRoots.<anonymous>[ValueParameterDescriptorImpl]

'classpathEntryToVfs' @ [74:42] ==> private final fun File.classpathEntryToVfs(): VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'when {
                !exists() -> null
                isDirectory -> StandardFileSystems.local()?.findFileByPath(this.canonicalPath)
                isFile -> StandardFileSystems.jar()?.findFileByPath(this.canonicalPath + URLUtil.JAR_SEPARATOR)
                else -> null
            }' @ [78:23] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VirtualFile?, entry1: VirtualFile?, entry2: VirtualFile?, entry3: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VirtualFile?

'!' @ [79:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exists' @ [79:18] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'isDirectory' @ [80:17] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'local' @ [80:52] ==> public open fun local(): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.StandardFileSystems[JavaMethodDescriptor]

'findFileByPath' @ [80:61] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'this' @ [80:76] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.classpathEntryToVfs[ReceiverParameterDescriptorImpl]

'canonicalPath' @ [80:81] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'isFile' @ [81:17] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'jar' @ [81:47] ==> public open fun jar(): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.StandardFileSystems[JavaMethodDescriptor]

'findFileByPath' @ [81:54] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'this' @ [81:69] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.classpathEntryToVfs[ReceiverParameterDescriptorImpl]

'canonicalPath' @ [81:74] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'JAR_SEPARATOR' @ [81:98] ==> public const final val JAR_SEPARATOR: String defined in com.intellij.util.io.URLUtil[JavaPropertyDescriptor]

'res' @ [85:20] ==> val res: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.classpathEntryToVfs[LocalVariableDescriptor]

'getInstance' @ [88:35] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'ScriptDependenciesManager' @ [88:47] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'java' @ [88:80] ==> public val <T> KClass<ScriptDependenciesManager>.java: Class<ScriptDependenciesManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptDependenciesManager

'TestOnly' @ [90:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'with' @ [92:13] ==> @InlineOnly public inline fun <T, R> with(receiver: ScriptDependenciesManager, block: ScriptDependenciesManager.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependenciesManager
    <R> -> Unit

'getInstance' @ [92:18] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [92:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.updateScriptDependenciesSynchronously[ValueParameterDescriptorImpl]

'KotlinScriptDefinitionProvider' @ [93:40] ==> public companion object defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[FakeCallableDescriptorForObject]

'getInstance' @ [93:71] ==> @JvmStatic public final fun getInstance(project: Project): KotlinScriptDefinitionProvider? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [93:83] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.updateScriptDependenciesSynchronously[ValueParameterDescriptorImpl]

'findScriptDefinition' @ [93:94] ==> public final fun findScriptDefinition(file: VirtualFile): KotlinScriptDefinition? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionProvider[DeserializedSimpleFunctionDescriptor]

'virtualFile' @ [93:115] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.updateScriptDependenciesSynchronously[ValueParameterDescriptorImpl]

'cacheUpdater' @ [94:17] ==> private final val cacheUpdater: ScriptDependenciesUpdater defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'updateSync' @ [94:30] ==> public final fun updateSync(file: VirtualFile, scriptDef: KotlinScriptDefinition): Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'virtualFile' @ [94:41] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.updateScriptDependenciesSynchronously[ValueParameterDescriptorImpl]

'scriptDefinition' @ [94:54] ==> val scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.updateScriptDependenciesSynchronously.<anonymous>[LocalVariableDescriptor]

'cacheUpdater' @ [95:17] ==> private final val cacheUpdater: ScriptDependenciesUpdater defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'notifyRootsChanged' @ [95:30] ==> public final fun notifyRootsChanged(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

'TestOnly' @ [99:9] ==> public constructor TestOnly() defined in org.jetbrains.annotations.TestOnly[JavaClassConstructorDescriptor]

'with' @ [101:13] ==> @InlineOnly public inline fun <T, R> with(receiver: ScriptDependenciesManager, block: ScriptDependenciesManager.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependenciesManager
    <R> -> Unit

'getInstance' @ [101:18] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [101:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion.reloadScriptDefinitions[ValueParameterDescriptorImpl]

'reloadScriptDefinitions' @ [102:17] ==> private final fun reloadScriptDefinitions(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'cacheUpdater' @ [103:17] ==> private final val cacheUpdater: ScriptDependenciesUpdater defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[PropertyDescriptorImpl]

'clear' @ [103:30] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesUpdater[SimpleFunctionDescriptorImpl]

