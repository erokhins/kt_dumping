'NonClasspathClassFinder' @ [34:5] ==> public constructor NonClasspathClassFinder(@NotNull p0: Project, @NotNull vararg p1: (String..String?)) defined in com.intellij.psi.NonClasspathClassFinder[JavaClassConstructorDescriptor]

'project' @ [34:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.<init>[ValueParameterDescriptorImpl]

'getValue' @ [36:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'ConcurrentFactoryMap<VirtualFile, PackageDirectoryCache>' @ [37:18] ==> public constructor ConcurrentFactoryMap<T : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.ConcurrentFactoryMap[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VirtualFile
    <V : (Any..Any?)> -> PackageDirectoryCache

'scriptDependenciesManager' @ [39:39] ==> private final val scriptDependenciesManager: ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[PropertyDescriptorImpl]

'getScriptClasspath' @ [39:65] ==> public final fun getScriptClasspath(file: VirtualFile): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'file' @ [39:84] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.myCaches.<anonymous>.<no name provided>.create[ValueParameterDescriptorImpl]

'createCache' @ [40:24] ==> @NotNull protected/*protected static*/ open fun createCache(@NotNull p0: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>)): PackageDirectoryCache defined in com.intellij.psi.NonClasspathClassFinder[JavaMethodDescriptor]

'scriptClasspath' @ [40:36] ==> val scriptClasspath: List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.myCaches.<anonymous>.<no name provided>.create[LocalVariableDescriptor]

'scriptDependenciesManager' @ [45:56] ==> private final val scriptDependenciesManager: ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[PropertyDescriptorImpl]

'getAllScriptsClasspath' @ [45:82] ==> public final fun getAllScriptsClasspath(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'toList' @ [45:107] ==> public fun <T> Iterable<VirtualFile>.toList(): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'?:' @ [48:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PackageDirectoryCache?, right: PackageDirectoryCache): PackageDirectoryCache[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PackageDirectoryCache

'scope' @ [48:14] ==> value-parameter scope: GlobalSearchScope? defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.getCache[ValueParameterDescriptorImpl]

'scope' @ [49:15] ==> value-parameter scope: GlobalSearchScope? defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.getCache[ValueParameterDescriptorImpl]

'base' @ [49:83] ==> public final val base: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.AbstractJavaClassFinder.FilterOutKotlinSourceFilesScope[DeserializedPropertyDescriptor]

'let' @ [50:16] ==> @InlineOnly public inline fun <T, R> ScriptModuleSearchScope.let(block: (ScriptModuleSearchScope) -> PackageDirectoryCache?): PackageDirectoryCache? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptModuleSearchScope
    <R> -> PackageDirectoryCache?

'myCaches' @ [51:17] ==> private final val myCaches: <no name provided> defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[PropertyDescriptorImpl]

'it' @ [51:26] ==> value-parameter it: ScriptModuleSearchScope defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.getCache.<anonymous>[ValueParameterDescriptorImpl]

'scriptFile' @ [51:29] ==> public final val scriptFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope[PropertyDescriptorImpl]

'super' @ [52:18] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[LazyClassReceiverParameterDescriptor]

'getCache' @ [52:24] ==> @NotNull protected/*protected and package*/ open fun getCache(@Nullable p0: GlobalSearchScope?): PackageDirectoryCache defined in com.intellij.psi.NonClasspathClassFinder[JavaMethodDescriptor]

'scope' @ [52:33] ==> value-parameter scope: GlobalSearchScope? defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.getCache[ValueParameterDescriptorImpl]

'super' @ [55:9] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[LazyClassReceiverParameterDescriptor]

'clearCache' @ [55:15] ==> public open fun clearCache(): Unit defined in com.intellij.psi.NonClasspathClassFinder[JavaMethodDescriptor]

'myCaches' @ [56:9] ==> private final val myCaches: <no name provided> defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[PropertyDescriptorImpl]

'clear' @ [56:18] ==> public open fun clear(): Unit defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.myCaches.<anonymous>.<no name provided>[JavaMethodDescriptor]

'super' @ [60:9] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[LazyClassReceiverParameterDescriptor]

'findClass' @ [60:15] ==> public open fun findClass(@NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.NonClasspathClassFinder[JavaMethodDescriptor]

'qualifiedName' @ [60:25] ==> value-parameter qualifiedName: String defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass[ValueParameterDescriptorImpl]

'scope' @ [60:40] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass[ValueParameterDescriptorImpl]

'let' @ [60:48] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> PsiClass?): PsiClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> PsiClass?

'when {
                scope is ScriptModuleSearchScope ||
                (scope as? AbstractJavaClassFinder.FilterOutKotlinSourceFilesScope)?.base is ScriptModuleSearchScope ||
                scope is EverythingGlobalScope ||
                aClass.containingFile?.virtualFile.let { file ->
                    file != null &&
                    with (ProjectFileIndex.SERVICE.getInstance(myProject)) {
                        !isInContent(file) &&
                        !isInLibraryClasses(file) &&
                        !isInLibrarySource(file)
                    }
                } -> aClass
                else -> null
            }' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass?, entry1: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass?

'scope' @ [62:17] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass[ValueParameterDescriptorImpl]

'scope' @ [63:18] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass[ValueParameterDescriptorImpl]

'base' @ [63:86] ==> public final val base: GlobalSearchScope defined in org.jetbrains.kotlin.load.java.AbstractJavaClassFinder.FilterOutKotlinSourceFilesScope[DeserializedPropertyDescriptor]

'scope' @ [64:17] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass[ValueParameterDescriptorImpl]

'aClass' @ [65:17] ==> value-parameter aClass: PsiClass defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [65:24] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [65:40] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'let' @ [65:52] ==> @InlineOnly public inline fun <T, R> VirtualFile?.let(block: (VirtualFile?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile?
    <R> -> Boolean

'file' @ [66:21] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'with' @ [67:21] ==> @InlineOnly public inline fun <T, R> with(receiver: (ProjectFileIndex..ProjectFileIndex?), block: (ProjectFileIndex..ProjectFileIndex?).() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.ProjectFileIndex..com.intellij.openapi.roots.ProjectFileIndex?)
    <R> -> Boolean

'getInstance' @ [67:52] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectFileIndex..ProjectFileIndex?) defined in com.intellij.openapi.roots.ProjectFileIndex.SERVICE[JavaMethodDescriptor]

'myProject' @ [67:64] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder[JavaPropertyDescriptor]

'!' @ [68:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInContent' @ [68:26] ==> public abstract fun isInContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [68:38] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [69:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInLibraryClasses' @ [69:26] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [69:45] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [70:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInLibrarySource' @ [70:26] ==> public abstract fun isInLibrarySource(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [70:44] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'aClass' @ [72:22] ==> value-parameter aClass: PsiClass defined in org.jetbrains.kotlin.idea.core.script.KotlinScriptDependenciesClassFinder.findClass.<anonymous>[ValueParameterDescriptorImpl]

