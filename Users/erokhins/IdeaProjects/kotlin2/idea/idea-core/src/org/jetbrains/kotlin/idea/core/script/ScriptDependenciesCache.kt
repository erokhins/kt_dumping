'ReentrantReadWriteLock' @ [35:29] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'hashMapOf' @ [36:25] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ScriptDependencies

'cacheLock' @ [38:71] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'read' @ [38:81] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> ScriptDependencies?): ScriptDependencies? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies?

'cache' @ [38:88] ==> private final val cache: HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'virtualFile' @ [38:94] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.get[ValueParameterDescriptorImpl]

'path' @ [38:106] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'ClearableLazyValue' @ [40:36] ==> public constructor ClearableLazyValue<out T : Any>(lock: ReentrantReadWriteLock, compute: () -> List<VirtualFile>) defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> List<VirtualFile>

'cacheLock' @ [40:55] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'cache' @ [41:21] ==> private final val cache: HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'values' @ [41:27] ==> public open val values: MutableCollection<ScriptDependencies> defined in java.util.HashMap[JavaPropertyDescriptor]

'flatMap' @ [41:34] ==> public inline fun <T, R> Iterable<ScriptDependencies>.flatMap(transform: (ScriptDependencies) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> File

'it' @ [41:44] ==> value-parameter it: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.allScriptsClasspathCache.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'classpath' @ [41:47] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'distinct' @ [41:59] ==> public fun <T> Iterable<File>.distinct(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'ScriptDependenciesManager' @ [42:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'toVfsRoots' @ [42:35] ==> public final fun toVfsRoots(roots: Iterable<File>): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'files' @ [42:46] ==> val files: List<File> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.allScriptsClasspathCache.<anonymous>[LocalVariableDescriptor]

'ClearableLazyValue' @ [45:36] ==> public constructor ClearableLazyValue<out T : Any>(lock: ReentrantReadWriteLock, compute: () -> NonClasspathDirectoriesScope) defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> NonClasspathDirectoriesScope

'cacheLock' @ [45:55] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'NonClasspathDirectoriesScope' @ [46:9] ==> public constructor NonClasspathDirectoriesScope(@NotNull p0: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)) defined in com.intellij.psi.search.NonClasspathDirectoriesScope[JavaClassConstructorDescriptor]

'allScriptsClasspathCache' @ [46:38] ==> public final val allScriptsClasspathCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [46:63] ==> public final fun get(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'ClearableLazyValue' @ [49:34] ==> public constructor ClearableLazyValue<out T : Any>(lock: ReentrantReadWriteLock, compute: () -> List<VirtualFile>) defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> List<VirtualFile>

'cacheLock' @ [49:53] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'ScriptDependenciesManager' @ [50:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'toVfsRoots' @ [50:35] ==> public final fun toVfsRoots(roots: Iterable<File>): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'cache' @ [50:46] ==> private final val cache: HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'values' @ [50:52] ==> public open val values: MutableCollection<ScriptDependencies> defined in java.util.HashMap[JavaPropertyDescriptor]

'flatMap' @ [50:59] ==> public inline fun <T, R> Iterable<ScriptDependencies>.flatMap(transform: (ScriptDependencies) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> File

'it' @ [50:69] ==> value-parameter it: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.allLibrarySourcesCache.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sources' @ [50:72] ==> public final val sources: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'distinct' @ [50:82] ==> public fun <T> Iterable<File>.distinct(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'ClearableLazyValue' @ [53:34] ==> public constructor ClearableLazyValue<out T : Any>(lock: ReentrantReadWriteLock, compute: () -> NonClasspathDirectoriesScope) defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> NonClasspathDirectoriesScope

'cacheLock' @ [53:53] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'NonClasspathDirectoriesScope' @ [54:9] ==> public constructor NonClasspathDirectoriesScope(@NotNull p0: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)) defined in com.intellij.psi.search.NonClasspathDirectoriesScope[JavaClassConstructorDescriptor]

'allLibrarySourcesCache' @ [54:38] ==> public final val allLibrarySourcesCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [54:61] ==> public final fun get(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'allScriptsClasspathCache' @ [58:9] ==> public final val allScriptsClasspathCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'clear' @ [58:34] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'allScriptsClasspathScope' @ [59:9] ==> public final val allScriptsClasspathScope: ClearableLazyValue<NonClasspathDirectoriesScope> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'clear' @ [59:34] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'allLibrarySourcesCache' @ [60:9] ==> public final val allLibrarySourcesCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'clear' @ [60:32] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'allLibrarySourcesScope' @ [61:9] ==> public final val allLibrarySourcesScope: ClearableLazyValue<NonClasspathDirectoriesScope> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'clear' @ [61:32] ==> public final fun clear(): Unit defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'getArea' @ [64:28] ==> @NotNull public open fun getArea(@Nullable p0: AreaInstance?): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'project' @ [64:36] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'getExtensionPoint' @ [64:45] ==> @NotNull public abstract fun <T : (Any..Any?)> getExtensionPoint(@NotNull p0: ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>): ExtensionPoint<(PsiElementFinder..PsiElementFinder?)> defined in com.intellij.openapi.extensions.ExtensionsArea[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElementFinder

'EP_NAME' @ [64:80] ==> public final val EP_NAME: (ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>..ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>?) defined in com.intellij.psi.PsiElementFinder[JavaPropertyDescriptor]

'extensions' @ [64:89] ==> public final val <T : (Any..Any?)> ExtensionPoint<(PsiElementFinder..PsiElementFinder?)>.extensions: (Array<(PsiElementFinder..PsiElementFinder?)>..Array<out (PsiElementFinder..PsiElementFinder?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiElementFinder..com.intellij.psi.PsiElementFinder?)

'filterIsInstance' @ [65:26] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<KotlinScriptDependenciesClassFinder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KotlinScriptDependenciesClassFinder

'single' @ [66:26] ==> public fun <T> List<KotlinScriptDependenciesClassFinder>.single(): KotlinScriptDependenciesClassFinder defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinScriptDependenciesClassFinder

'kotlinScriptDependenciesClassFinder' @ [68:9] ==> val kotlinScriptDependenciesClassFinder: KotlinScriptDependenciesClassFinder defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.onChange[LocalVariableDescriptor]

'clearCache' @ [68:45] ==> public open fun clearCache(): Unit defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[SimpleFunctionDescriptorImpl]

'updateHighlighting' @ [69:9] ==> private final fun updateHighlighting(file: VirtualFile?): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'file' @ [69:28] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.onChange[ValueParameterDescriptorImpl]

'ScriptDependenciesModificationTracker' @ [73:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker[FakeCallableDescriptorForObject]

'getInstance' @ [73:47] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesModificationTracker defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker.Companion[SimpleFunctionDescriptorImpl]

'project' @ [73:59] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'incModificationCount' @ [73:68] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesModificationTracker[JavaMethodDescriptor]

'launch' @ [75:9] ==> public fun launch(context: CoroutineContext, start: Boolean = ..., block: suspend CoroutineScope.() -> Unit): Job defined in kotlinx.coroutines.experimental[DeserializedSimpleFunctionDescriptor]

'EDT' @ [75:16] ==> public object EDT : CoroutineDispatcher defined in org.jetbrains.kotlin.idea.core.util in file CoroutineUtils.kt[FakeCallableDescriptorForObject]

'if (file != null) {
                file.let { PsiManager.getInstance(project).findFile(it) }?.let { psiFile ->
                    DaemonCodeAnalyzer.getInstance(project).restart(psiFile)
                }
            }
            else {
                assert(ApplicationManager.getApplication().isUnitTestMode)
                DaemonCodeAnalyzer.getInstance(project).restart()
            }' @ [76:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'file' @ [76:17] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.updateHighlighting[ValueParameterDescriptorImpl]

'file' @ [77:17] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.updateHighlighting[ValueParameterDescriptorImpl]

'let' @ [77:22] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> PsiFile?): PsiFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> PsiFile?

'getInstance' @ [77:39] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [77:51] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'findFile' @ [77:60] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'it' @ [77:69] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.updateHighlighting.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [77:76] ==> @InlineOnly public inline fun <T, R> PsiFile.let(block: (PsiFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiFile
    <R> -> Unit

'getInstance' @ [78:40] ==> public open fun getInstance(p0: (Project..Project?)): (DaemonCodeAnalyzer..DaemonCodeAnalyzer?) defined in com.intellij.codeInsight.daemon.DaemonCodeAnalyzer[JavaMethodDescriptor]

'project' @ [78:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'restart' @ [78:61] ==> public abstract fun restart(@NotNull p0: PsiFile): Unit defined in com.intellij.codeInsight.daemon.DaemonCodeAnalyzer[JavaMethodDescriptor]

'psiFile' @ [78:69] ==> value-parameter psiFile: PsiFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.updateHighlighting.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [82:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [82:43] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [82:60] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'getInstance' @ [83:36] ==> public open fun getInstance(p0: (Project..Project?)): (DaemonCodeAnalyzer..DaemonCodeAnalyzer?) defined in com.intellij.codeInsight.daemon.DaemonCodeAnalyzer[JavaMethodDescriptor]

'project' @ [83:48] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'restart' @ [83:57] ==> public abstract fun restart(): Unit defined in com.intellij.codeInsight.daemon.DaemonCodeAnalyzer[JavaMethodDescriptor]

'!' @ [89:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allScriptsClasspathCache' @ [89:17] ==> public final val allScriptsClasspathCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [89:42] ==> public final fun get(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'containsAll' @ [89:48] ==> public abstract fun containsAll(elements: Collection<VirtualFile>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ScriptDependenciesManager' @ [89:60] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'toVfsRoots' @ [89:86] ==> public final fun toVfsRoots(roots: Iterable<File>): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'scriptDependencies' @ [89:97] ==> value-parameter scriptDependencies: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.hasNotCachedRoots[ValueParameterDescriptorImpl]

'classpath' @ [89:116] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'!' @ [90:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allLibrarySourcesCache' @ [90:17] ==> public final val allLibrarySourcesCache: ClearableLazyValue<List<VirtualFile>> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'get' @ [90:40] ==> public final fun get(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[SimpleFunctionDescriptorImpl]

'containsAll' @ [90:46] ==> public abstract fun containsAll(elements: Collection<VirtualFile>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'ScriptDependenciesManager' @ [90:58] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'toVfsRoots' @ [90:84] ==> public final fun toVfsRoots(roots: Iterable<File>): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'scriptDependencies' @ [90:95] ==> value-parameter scriptDependencies: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.hasNotCachedRoots[ValueParameterDescriptorImpl]

'sources' @ [90:114] ==> public final val sources: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'cacheLock' @ [94:9] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'write' @ [94:19] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'cache' @ [94:25] ==> private final val cache: HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'onChange' @ [95:9] ==> private final fun onChange(file: VirtualFile?): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'virtualFile' @ [99:20] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[ValueParameterDescriptorImpl]

'path' @ [99:32] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'cacheLock' @ [100:19] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'write' @ [100:29] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> ScriptDependencies?): ScriptDependencies? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies?

'cache' @ [101:23] ==> private final val cache: HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'path' @ [101:29] ==> val path: String defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[LocalVariableDescriptor]

'cache' @ [102:13] ==> private final val cache: HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'path' @ [102:19] ==> val path: String defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[LocalVariableDescriptor]

'new' @ [102:27] ==> value-parameter new: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[ValueParameterDescriptorImpl]

'old' @ [103:13] ==> val old: ScriptDependencies? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save.<anonymous>[LocalVariableDescriptor]

'new' @ [105:23] ==> value-parameter new: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[ValueParameterDescriptorImpl]

'old' @ [105:30] ==> val old: ScriptDependencies? defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[LocalVariableDescriptor]

'changed' @ [106:13] ==> val changed: Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[LocalVariableDescriptor]

'onChange' @ [107:13] ==> private final fun onChange(file: VirtualFile?): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'virtualFile' @ [107:22] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[ValueParameterDescriptorImpl]

'changed' @ [110:16] ==> val changed: Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.save[LocalVariableDescriptor]

'cacheLock' @ [114:23] ==> private final val cacheLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'write' @ [114:33] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'cache' @ [115:13] ==> private final val cache: HashMap<String, ScriptDependencies> /* = HashMap<String, ScriptDependencies> */ defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[PropertyDescriptorImpl]

'remove' @ [115:19] ==> public open fun remove(key: String): ScriptDependencies? defined in java.util.HashMap[JavaMethodDescriptor]

'virtualFile' @ [115:26] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.delete[ValueParameterDescriptorImpl]

'path' @ [115:38] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'changed' @ [117:13] ==> val changed: Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.delete[LocalVariableDescriptor]

'onChange' @ [118:13] ==> private final fun onChange(file: VirtualFile?): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache[SimpleFunctionDescriptorImpl]

'virtualFile' @ [118:22] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.delete[ValueParameterDescriptorImpl]

'changed' @ [120:16] ==> val changed: Boolean defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesCache.delete[LocalVariableDescriptor]

'lock' @ [128:9] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[PropertyDescriptorImpl]

'read' @ [128:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Nothing): Nothing defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'value' @ [129:17] ==> private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[PropertyDescriptorImpl]

'lock' @ [130:17] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[PropertyDescriptorImpl]

'write' @ [130:22] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'value' @ [131:21] ==> private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[PropertyDescriptorImpl]

'invoke' @ [131:29] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'value' @ [134:20] ==> private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[PropertyDescriptorImpl]

'lock' @ [139:9] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[PropertyDescriptorImpl]

'write' @ [139:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'value' @ [140:13] ==> private/*private to this*/ final var value: T? defined in org.jetbrains.kotlin.idea.core.script.ClearableLazyValue[PropertyDescriptorImpl]

