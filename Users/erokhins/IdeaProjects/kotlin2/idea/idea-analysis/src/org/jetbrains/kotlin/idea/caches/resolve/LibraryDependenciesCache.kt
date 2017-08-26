'!!' @ [42:45] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: LibraryDependenciesCache?): LibraryDependenciesCache[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> LibraryDependenciesCache

'getService' @ [42:60] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(LibraryDependenciesCache..LibraryDependenciesCache?)>): (LibraryDependenciesCache..LibraryDependenciesCache?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LibraryDependenciesCache

'project' @ [42:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCache.Companion.getInstance[ValueParameterDescriptorImpl]

'LibraryDependenciesCache' @ [42:80] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCache[FakeCallableDescriptorForObject]

'java' @ [42:112] ==> public val <T> KClass<LibraryDependenciesCache>.java: Class<LibraryDependenciesCache> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LibraryDependenciesCache

'CachedValue' @ [50:18] ==> public fun <T> CachedValue(project: Project, trackValue: Boolean = ..., provider: () -> CachedValueProvider.Result<ConcurrentMap<Library, LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */>>): CachedValue<(ConcurrentMap<Library, LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */>..ConcurrentMap<Library, LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */>?)> defined in org.jetbrains.kotlin.idea.core.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ConcurrentMap<Library, Pair<List<Library>, List<Sdk>>>

'project' @ [50:30] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[PropertyDescriptorImpl]

'Result' @ [51:29] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: ConcurrentMap<Library, LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ConcurrentMap<Library, Pair<List<Library>, List<Sdk>>>

'createConcurrentWeakMap' @ [51:50] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentWeakMap(): ConcurrentMap<(Library..Library?), (LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */..LibrariesAndSdks? /* = Pair<List<Library>, List<Sdk>>? */)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Library
    <V : (Any..Any?)> -> Pair<List<Library>, List<Sdk>>

'getInstance' @ [52:55] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [52:67] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[PropertyDescriptorImpl]

'cache' @ [56:13] ==> public final val cache: (ConcurrentMap<Library, LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */>..ConcurrentMap<Library, LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */>?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[PropertyDescriptorImpl]

'getOrPut' @ [56:19] ==> public inline fun <K, V> ConcurrentMap<Library, LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */>.getOrPut(key: Library, defaultValue: () -> LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */): LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Library
    <V> -> Pair<List<Library>, List<Sdk>>

'library' @ [56:28] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.getLibrariesAndSdksUsedWith[ValueParameterDescriptorImpl]

'computeLibrariesAndSdksUsedWith' @ [56:39] ==> private final fun computeLibrariesAndSdksUsedWith(library: Library): LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */ defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[SimpleFunctionDescriptorImpl]

'library' @ [56:71] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.getLibrariesAndSdksUsedWith[ValueParameterDescriptorImpl]

'HashSet' @ [61:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Module

'Condition' @ [62:25] ==> public fun <T : (Any..Any?)> Condition(function: ((OrderEntry..OrderEntry?)) -> Boolean): Condition<OrderEntry> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> OrderEntry

'if (orderEntry is ModuleOrderEntry) {
                val module = orderEntry.module
                module != null && module !in processedModules
            }
            else {
                true
            }' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'orderEntry' @ [63:17] ==> value-parameter orderEntry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<anonymous>[ValueParameterDescriptorImpl]

'orderEntry' @ [64:30] ==> value-parameter orderEntry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [64:41] ==> public final val ModuleOrderEntry.module: Module?[MyPropertyDescriptor]

'module' @ [65:17] ==> val module: Module? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<anonymous>[LocalVariableDescriptor]

'module' @ [65:35] ==> val module: Module? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<anonymous>[LocalVariableDescriptor]

'processedModules' @ [65:46] ==> val processedModules: HashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'LinkedHashSet' @ [72:25] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Library

'LinkedHashSet' @ [73:20] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Sdk

'getLibraryPlatform' @ [75:24] ==> public fun getLibraryPlatform(library: Library): TargetPlatform defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[SimpleFunctionDescriptorImpl]

'library' @ [75:43] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[ValueParameterDescriptorImpl]

'getLibraryUsageIndex' @ [77:24] ==> private final fun getLibraryUsageIndex(): LibraryDependenciesCacheImpl.LibraryUsageIndex defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[SimpleFunctionDescriptorImpl]

'modulesLibraryIsUsedIn' @ [77:47] ==> public final val modulesLibraryIsUsedIn: MultiMap<Library, Module> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex[PropertyDescriptorImpl]

'library' @ [77:70] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[ValueParameterDescriptorImpl]

'!' @ [78:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processedModules' @ [78:18] ==> val processedModules: HashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'add' @ [78:35] ==> public open fun add(element: Module): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'module' @ [78:39] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'getInstance' @ [80:31] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [80:43] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'orderEntries' @ [80:51] ==> @NotNull public abstract fun orderEntries(): OrderEnumerator defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'recursively' @ [80:66] ==> public abstract fun recursively(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'satisfying' @ [80:80] ==> public abstract fun satisfying(p0: (Condition<(OrderEntry..OrderEntry?)>..Condition<(OrderEntry..OrderEntry?)>?)): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'condition' @ [80:91] ==> val condition: Condition<OrderEntry> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'process' @ [80:102] ==> public abstract fun <R : (Any..Any?)> process(@NotNull p0: RootPolicy<(Unit..Unit?)>, p1: (Unit..Unit?)): (Unit..Unit?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]
Inferred types:
    <R : (Any..Any?)> -> Unit

'RootPolicy<Unit>' @ [80:119] ==> public constructor RootPolicy<R : (Any..Any?)>() defined in com.intellij.openapi.roots.RootPolicy[JavaClassConstructorDescriptor]
Inferred types:
    <R : (Any..Any?)> -> Unit

'processedModules' @ [82:21] ==> val processedModules: HashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'add' @ [82:38] ==> public open fun add(element: Module): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'moduleSourceOrderEntry' @ [82:42] ==> value-parameter moduleSourceOrderEntry: ModuleSourceOrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<no name provided>.visitModuleSourceOrderEntry[ValueParameterDescriptorImpl]

'ownerModule' @ [82:65] ==> public final val ModuleSourceOrderEntry.ownerModule: Module[MyPropertyDescriptor]

'libraryOrderEntry' @ [86:40] ==> value-parameter libraryOrderEntry: LibraryOrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<no name provided>.visitLibraryOrderEntry[ValueParameterDescriptorImpl]

'library' @ [86:58] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'otherLibrary' @ [87:25] ==> val otherLibrary: Library? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<no name provided>.visitLibraryOrderEntry[LocalVariableDescriptor]

'compatiblePlatforms' @ [87:49] ==> private final fun compatiblePlatforms(from: TargetPlatform, to: TargetPlatform): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[SimpleFunctionDescriptorImpl]

'platform' @ [87:69] ==> val platform: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'getLibraryPlatform' @ [87:79] ==> public fun getLibraryPlatform(library: Library): TargetPlatform defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[SimpleFunctionDescriptorImpl]

'otherLibrary' @ [87:98] ==> val otherLibrary: Library? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<no name provided>.visitLibraryOrderEntry[LocalVariableDescriptor]

'libraries' @ [88:25] ==> val libraries: LinkedHashSet<Library> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'add' @ [88:35] ==> public open fun add(element: Library): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'otherLibrary' @ [88:39] ==> val otherLibrary: Library? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<no name provided>.visitLibraryOrderEntry[LocalVariableDescriptor]

'sdks' @ [93:21] ==> val sdks: LinkedHashSet<Sdk> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'addIfNotNull' @ [93:26] ==> public fun <T : Any> MutableCollection<Sdk>.addIfNotNull(t: Sdk?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Sdk

'jdkOrderEntry' @ [93:39] ==> value-parameter jdkOrderEntry: JdkOrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith.<no name provided>.visitJdkOrderEntry[ValueParameterDescriptorImpl]

'jdk' @ [93:53] ==> public final val JdkOrderEntry.jdk: (Sdk..Sdk?)[MyPropertyDescriptor]

'Unit' @ [95:16] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'Pair' @ [98:16] ==> public constructor Pair<out A, out B>(first: List<Library>, second: List<Sdk>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<Library>
    <out B> -> List<Sdk>

'libraries' @ [98:21] ==> val libraries: LinkedHashSet<Library> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'toList' @ [98:31] ==> public fun <T> Iterable<Library>.toList(): List<Library> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library

'sdks' @ [98:41] ==> val sdks: LinkedHashSet<Sdk> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.computeLibrariesAndSdksUsedWith[LocalVariableDescriptor]

'toList' @ [98:46] ==> public fun <T> Iterable<Sdk>.toList(): List<Sdk> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk

'from' @ [105:16] ==> value-parameter from: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.compatiblePlatforms[ValueParameterDescriptorImpl]

'to' @ [105:24] ==> value-parameter to: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.compatiblePlatforms[ValueParameterDescriptorImpl]

'to' @ [105:30] ==> value-parameter to: TargetPlatform defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.compatiblePlatforms[ValueParameterDescriptorImpl]

'Default' @ [105:51] ==> public object Default : TargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[FakeCallableDescriptorForObject]

'!!' @ [109:16] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: LibraryDependenciesCacheImpl.LibraryUsageIndex?): LibraryDependenciesCacheImpl.LibraryUsageIndex[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> LibraryUsageIndex

'getManager' @ [109:36] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [109:47] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[PropertyDescriptorImpl]

'getCachedValue' @ [109:56] ==> public final fun <T : (Any..Any?), D : (UserDataHolder..UserDataHolder?)> getCachedValue(@NotNull p0: Project, @NotNull p1: () -> CachedValueProvider.Result<(LibraryDependenciesCacheImpl.LibraryUsageIndex..LibraryDependenciesCacheImpl.LibraryUsageIndex?)>?): (LibraryDependenciesCacheImpl.LibraryUsageIndex..LibraryDependenciesCacheImpl.LibraryUsageIndex?) defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LibraryUsageIndex
    <D : (UserDataHolder..UserDataHolder?)> -> Project

'project' @ [109:71] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[PropertyDescriptorImpl]

'Result' @ [110:33] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: LibraryDependenciesCacheImpl.LibraryUsageIndex?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LibraryUsageIndex

'LibraryUsageIndex' @ [110:40] ==> public constructor LibraryUsageIndex() defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex[ClassConstructorDescriptorImpl]

'getInstance' @ [110:92] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [110:104] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[PropertyDescriptorImpl]

'createSet' @ [115:74] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> createSet(): MultiMap<(Library..Library?), (Module..Module?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Library
    <V : (Any..Any?)> -> Module

'iterator' @ [118:28] ==> public final operator fun iterator(): Iterator<(Module..Module?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [118:42] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [118:54] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl[PropertyDescriptorImpl]

'modules' @ [118:63] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'iterator' @ [119:31] ==> public final operator fun iterator(): Iterator<(OrderEntry..OrderEntry?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [119:49] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [119:61] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex.<init>[LocalVariableDescriptor]

'orderEntries' @ [119:69] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'entry' @ [120:25] ==> val entry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex.<init>[LocalVariableDescriptor]

'entry' @ [121:39] ==> val entry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex.<init>[LocalVariableDescriptor]

'library' @ [121:45] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'library' @ [122:29] ==> val library: Library? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex.<init>[LocalVariableDescriptor]

'modulesLibraryIsUsedIn' @ [123:29] ==> public final val modulesLibraryIsUsedIn: MultiMap<Library, Module> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex[PropertyDescriptorImpl]

'putValue' @ [123:52] ==> public open fun putValue(@Nullable p0: Library?, p1: (Module..Module?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'library' @ [123:61] ==> val library: Library? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex.<init>[LocalVariableDescriptor]

'module' @ [123:70] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCacheImpl.LibraryUsageIndex.<init>[LocalVariableDescriptor]

