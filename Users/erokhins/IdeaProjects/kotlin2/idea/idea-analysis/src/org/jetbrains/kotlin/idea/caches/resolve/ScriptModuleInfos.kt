'DelegatingGlobalSearchScope' @ [34:92] ==> public constructor DelegatingGlobalSearchScope(@NotNull p0: GlobalSearchScope) defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaClassConstructorDescriptor]

'baseScope' @ [34:120] ==> value-parameter baseScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope.<init>[ValueParameterDescriptorImpl]

'other' @ [35:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope.equals[ValueParameterDescriptorImpl]

'scriptFile' @ [35:76] ==> public final val scriptFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope[PropertyDescriptorImpl]

'other' @ [35:90] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope.equals[ValueParameterDescriptorImpl]

'scriptFile' @ [35:96] ==> public final val scriptFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope[PropertyDescriptorImpl]

'super' @ [35:110] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope[LazyClassReceiverParameterDescriptor]

'equals' @ [35:116] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaMethodDescriptor]

'other' @ [35:123] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope.equals[ValueParameterDescriptorImpl]

'scriptFile' @ [37:31] ==> public final val scriptFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope[PropertyDescriptorImpl]

'hashCode' @ [37:42] ==> public open fun hashCode(): Int defined in com.intellij.openapi.vfs.VirtualFile[DeserializedSimpleFunctionDescriptor]

'super' @ [37:60] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleSearchScope[LazyClassReceiverParameterDescriptor]

'hashCode' @ [37:66] ==> public open fun hashCode(): Int defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaMethodDescriptor]

'OTHER' @ [46:30] ==> enum entry OTHER defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'ScriptDependenciesManager' @ [49:17] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'getInstance' @ [49:43] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [49:55] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'getScriptDependencies' @ [49:64] ==> public final fun getScriptDependencies(file: VirtualFile): ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'scriptFile' @ [49:86] ==> public final val scriptFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'special' @ [51:36] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'scriptFile' @ [51:55] ==> public final val scriptFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'name' @ [51:66] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'scriptDefinition' @ [51:74] ==> public final val scriptDefinition: KotlinScriptDefinition defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'name' @ [51:91] ==> public open val name: String defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'fileScope' @ [53:53] ==> @NotNull public open fun fileScope(@NotNull p0: Project, p1: (VirtualFile..VirtualFile?)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [53:63] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'scriptFile' @ [53:72] ==> public final val scriptFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'listOf' @ [56:16] ==> public fun <T> listOf(vararg elements: IdeaModuleInfo): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'this' @ [57:17] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[LazyClassReceiverParameterDescriptor]

'ScriptDependenciesModuleInfo' @ [57:23] ==> public constructor ScriptDependenciesModuleInfo(project: Project, scriptModuleInfo: ScriptModuleInfo?) defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[ClassConstructorDescriptorImpl]

'project' @ [57:52] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'this' @ [57:61] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[LazyClassReceiverParameterDescriptor]

'sdkDependencies' @ [58:13] ==> private fun sdkDependencies(scriptDependencies: ScriptDependencies?, project: Project): List<SdkInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'externalDependencies' @ [58:29] ==> public final val externalDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'project' @ [58:51] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'listOfNotNull' @ [63:11] ==> public fun <T : Any> listOfNotNull(element: SdkInfo?): List<SdkInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SdkInfo

'findJdk' @ [63:25] ==> public fun findJdk(dependencies: ScriptDependencies?, project: Project): Sdk? defined in org.jetbrains.kotlin.idea.caches.resolve in file ScriptModuleInfos.kt[SimpleFunctionDescriptorImpl]

'scriptDependencies' @ [63:33] ==> value-parameter scriptDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.resolve.sdkDependencies[ValueParameterDescriptorImpl]

'project' @ [63:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.sdkDependencies[ValueParameterDescriptorImpl]

'let' @ [63:63] ==> @InlineOnly public inline fun <T, R> Sdk.let(block: (Sdk) -> SdkInfo): SdkInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk
    <R> -> SdkInfo

'SdkInfo' @ [63:69] ==> public constructor SdkInfo(project: Project, sdk: Sdk) defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[ClassConstructorDescriptorImpl]

'project' @ [63:77] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.sdkDependencies[ValueParameterDescriptorImpl]

'it' @ [63:86] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.sdkDependencies.<anonymous>[ValueParameterDescriptorImpl]

'getAllProjectSdks' @ [66:19] ==> public fun getAllProjectSdks(): Collection<Sdk> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'dependencies' @ [68:26] ==> value-parameter dependencies: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.resolve.findJdk[ValueParameterDescriptorImpl]

'javaHome' @ [68:40] ==> public final val javaHome: File? defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'canonicalPath' @ [68:50] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'allJdks' @ [70:12] ==> val allJdks: Collection<Sdk> defined in org.jetbrains.kotlin.idea.caches.resolve.findJdk[LocalVariableDescriptor]

'find' @ [70:20] ==> @InlineOnly public inline fun <T> Iterable<Sdk>.find(predicate: (Sdk) -> Boolean): Sdk? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk

'javaHome' @ [70:27] ==> val javaHome: String? defined in org.jetbrains.kotlin.idea.caches.resolve.findJdk[LocalVariableDescriptor]

'it' @ [70:47] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.findJdk.<anonymous>[ValueParameterDescriptorImpl]

'homePath' @ [70:50] ==> public final val Sdk.homePath: String?[MyPropertyDescriptor]

'javaHome' @ [70:62] ==> val javaHome: String? defined in org.jetbrains.kotlin.idea.caches.resolve.findJdk[LocalVariableDescriptor]

'getInstance' @ [71:31] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [71:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.findJdk[ValueParameterDescriptorImpl]

'projectSdk' @ [71:52] ==> public final var ProjectRootManager.projectSdk: Sdk?[MyPropertyDescriptor]

'allJdks' @ [72:12] ==> val allJdks: Collection<Sdk> defined in org.jetbrains.kotlin.idea.caches.resolve.findJdk[LocalVariableDescriptor]

'firstOrNull' @ [72:20] ==> public fun <T> Iterable<Sdk>.firstOrNull(): Sdk? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk

'listOf' @ [79:36] ==> public fun <T> listOf(element: ScriptDependenciesModuleInfo): List<ScriptDependenciesModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependenciesModuleInfo

'this' @ [79:43] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[LazyClassReceiverParameterDescriptor]

'sdkDependencies' @ [79:51] ==> private fun sdkDependencies(scriptDependencies: ScriptDependencies?, project: Project): List<SdkInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'scriptModuleInfo' @ [79:67] ==> public final val scriptModuleInfo: ScriptModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'externalDependencies' @ [79:85] ==> public final val externalDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'project' @ [79:107] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'special' @ [81:30] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'scriptModuleInfo' @ [84:13] ==> public final val scriptModuleInfo: ScriptModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'KotlinSourceFilterScope' @ [86:20] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'libraryClassFiles' @ [86:44] ==> @JvmStatic public final fun libraryClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'ScriptDependenciesManager' @ [87:21] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'getInstance' @ [87:47] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [87:59] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'getAllScriptsClasspathScope' @ [87:68] ==> public final fun getAllScriptsClasspathScope(): NonClasspathDirectoriesScope defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'project' @ [87:99] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'project' @ [90:16] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'service' @ [90:24] ==> public inline fun <reified T : Any> Project.service(): ScriptBinariesScopeCache defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ScriptBinariesScopeCache

'get' @ [90:60] ==> @NotNull public open fun get(p0: (ScriptDependencies..ScriptDependencies?)): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptBinariesScopeCache[JavaMethodDescriptor]

'scriptModuleInfo' @ [90:64] ==> public final val scriptModuleInfo: ScriptModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'externalDependencies' @ [90:81] ==> public final val externalDependencies: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptModuleInfo[PropertyDescriptorImpl]

'project' @ [95:31] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'hashCode' @ [95:39] ==> public open fun hashCode(): Int defined in com.intellij.openapi.project.Project[DeserializedSimpleFunctionDescriptor]

'other' @ [96:49] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo.equals[ValueParameterDescriptorImpl]

'this' @ [96:90] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[LazyClassReceiverParameterDescriptor]

'project' @ [96:95] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'other' @ [96:106] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo.equals[ValueParameterDescriptorImpl]

'project' @ [96:112] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'LIBRARY' @ [99:30] ==> enum entry LIBRARY defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'ScriptDependenciesSourceModuleInfo' @ [102:17] ==> public constructor ScriptDependenciesSourceModuleInfo(project: Project) defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesSourceModuleInfo[ClassConstructorDescriptorImpl]

'project' @ [102:52] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[PropertyDescriptorImpl]

'special' @ [108:30] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ScriptDependenciesModuleInfo' @ [111:17] ==> public constructor ScriptDependenciesModuleInfo(project: Project, scriptModuleInfo: ScriptModuleInfo?) defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesModuleInfo[ClassConstructorDescriptorImpl]

'project' @ [111:46] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesSourceModuleInfo[PropertyDescriptorImpl]

'KotlinSourceFilterScope' @ [113:53] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'librarySources' @ [113:77] ==> @JvmStatic public final fun librarySources(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'ScriptDependenciesManager' @ [114:13] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'getInstance' @ [114:39] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [114:51] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesSourceModuleInfo[PropertyDescriptorImpl]

'getAllLibrarySourcesScope' @ [114:60] ==> public final fun getAllLibrarySourcesScope(): NonClasspathDirectoriesScope defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'project' @ [114:89] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptDependenciesSourceModuleInfo[PropertyDescriptorImpl]

'SLRUCache<ScriptDependencies, GlobalSearchScope>' @ [119:72] ==> protected/*protected and package*/ constructor SLRUCache<K : (Any..Any?), V : (Any..Any?)>(p0: Int, p1: Int) defined in com.intellij.util.containers.SLRUCache[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ScriptDependencies
    <V : (Any..Any?)> -> GlobalSearchScope

'key' @ [121:21] ==> value-parameter key: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptBinariesScopeCache.createValue[ValueParameterDescriptorImpl]

'classpath' @ [121:26] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'emptyList' @ [121:39] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'ScriptDependenciesManager' @ [122:25] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'toVfsRoots' @ [122:51] ==> public final fun toVfsRoots(roots: Iterable<File>): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'roots' @ [122:62] ==> val roots: List<File> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptBinariesScopeCache.createValue[LocalVariableDescriptor]

'KotlinSourceFilterScope' @ [124:16] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'libraryClassFiles' @ [124:40] ==> @JvmStatic public final fun libraryClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'NonClasspathDirectoriesScope' @ [124:58] ==> public constructor NonClasspathDirectoriesScope(@NotNull p0: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)) defined in com.intellij.psi.search.NonClasspathDirectoriesScope[JavaClassConstructorDescriptor]

'classpath' @ [124:87] ==> val classpath: List<VirtualFile> defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptBinariesScopeCache.createValue[LocalVariableDescriptor]

'project' @ [124:99] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.ScriptBinariesScopeCache[PropertyDescriptorImpl]

