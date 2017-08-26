'super' @ [53:17] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[LazyClassReceiverParameterDescriptor]

'capabilities' @ [53:23] ==> public open val capabilities: Map<ModuleDescriptor.Capability<*>, Any?> defined in org.jetbrains.kotlin.analyzer.ModuleInfo[DeserializedPropertyDescriptor]

'mapOf' @ [53:38] ==> public fun <K, V> mapOf(pair: Pair<ModuleDescriptor.Capability<ModuleOrigin>, ModuleOrigin>): Map<ModuleDescriptor.Capability<ModuleOrigin>, ModuleOrigin> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Capability<ModuleOrigin>
    <V> -> ModuleOrigin

'OriginCapability' @ [53:44] ==> public val OriginCapability: ModuleDescriptor.Capability<ModuleOrigin> defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[PropertyDescriptorImpl]

'moduleOrigin' @ [53:64] ==> public abstract val moduleOrigin: ModuleOrigin defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[PropertyDescriptorImpl]

'if (productionOnly) listOf(productionSourceInfo()) else listOf(testSourceInfo(), productionSourceInfo())' @ [59:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ModuleSourceInfo>, elseBranch: List<ModuleSourceInfo>): List<ModuleSourceInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ModuleSourceInfo>

'productionOnly' @ [59:32] ==> value-parameter productionOnly: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'listOf' @ [59:48] ==> public fun <T> listOf(element: ModuleProductionSourceInfo): List<ModuleProductionSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleProductionSourceInfo

'productionSourceInfo' @ [59:55] ==> public fun Module.productionSourceInfo(): ModuleProductionSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [59:84] ==> public fun <T> listOf(vararg elements: ModuleSourceInfo): List<ModuleSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceInfo

'testSourceInfo' @ [59:91] ==> public fun Module.testSourceInfo(): ModuleTestSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'productionSourceInfo' @ [59:109] ==> public fun Module.productionSourceInfo(): ModuleProductionSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'!' @ [61:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'orderEntry' @ [61:10] ==> value-parameter orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'isValid' @ [61:21] ==> public final val OrderEntry.isValid: Boolean[MyPropertyDescriptor]

'emptyList' @ [61:37] ==> public fun <T> emptyList(): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'when (orderEntry) {
        is ModuleSourceOrderEntry -> {
            orderEntry.getOwnerModule().toInfos()
        }
        is ModuleOrderEntry -> {
            orderEntry.module?.toInfos().orEmpty()
        }
        is LibraryOrderEntry -> {
            val library = orderEntry.library ?: return listOf()
            listOfNotNull(LibraryInfo(project, library))
        }
        is JdkOrderEntry -> {
            val sdk = orderEntry.jdk ?: return listOf()
            listOfNotNull(SdkInfo(project, sdk))
        }
        else -> {
            throw IllegalStateException("Unexpected order entry $orderEntry")
        }
    }' @ [63:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<IdeaModuleInfo>, entry1: List<IdeaModuleInfo>, entry2: List<IdeaModuleInfo>, entry3: List<IdeaModuleInfo>, entry4: List<IdeaModuleInfo>): List<IdeaModuleInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<IdeaModuleInfo>

'orderEntry' @ [63:18] ==> value-parameter orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'orderEntry' @ [65:13] ==> value-parameter orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'getOwnerModule' @ [65:24] ==> @NotNull public abstract fun getOwnerModule(): Module defined in com.intellij.openapi.roots.OrderEntry[JavaMethodDescriptor]

'toInfos' @ [65:41] ==> local final fun Module.toInfos(): List<ModuleSourceInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[SimpleFunctionDescriptorImpl]

'orderEntry' @ [68:13] ==> value-parameter orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'module' @ [68:24] ==> public final val ModuleOrderEntry.module: Module?[MyPropertyDescriptor]

'toInfos' @ [68:32] ==> local final fun Module.toInfos(): List<ModuleSourceInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[SimpleFunctionDescriptorImpl]

'orEmpty' @ [68:42] ==> @InlineOnly public inline fun <T> List<ModuleSourceInfo>?.orEmpty(): List<ModuleSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceInfo

'orderEntry' @ [71:27] ==> value-parameter orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'library' @ [71:38] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'listOf' @ [71:56] ==> @InlineOnly public inline fun <T> listOf(): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'listOfNotNull' @ [72:13] ==> public fun <T : Any> listOfNotNull(element: LibraryInfo?): List<LibraryInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LibraryInfo

'LibraryInfo' @ [72:27] ==> public constructor LibraryInfo(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[ClassConstructorDescriptorImpl]

'project' @ [72:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'library' @ [72:48] ==> val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[LocalVariableDescriptor]

'orderEntry' @ [75:23] ==> value-parameter orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'jdk' @ [75:34] ==> public final val JdkOrderEntry.jdk: (Sdk..Sdk?)[MyPropertyDescriptor]

'listOf' @ [75:48] ==> @InlineOnly public inline fun <T> listOf(): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'listOfNotNull' @ [76:13] ==> public fun <T : Any> listOfNotNull(element: SdkInfo?): List<SdkInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SdkInfo

'SdkInfo' @ [76:27] ==> public constructor SdkInfo(project: Project, sdk: Sdk) defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[ClassConstructorDescriptorImpl]

'project' @ [76:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'sdk' @ [76:44] ==> val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[LocalVariableDescriptor]

'IllegalStateException' @ [79:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'orderEntry' @ [79:66] ==> value-parameter orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.caches.resolve.orderEntryToModuleInfo[ValueParameterDescriptorImpl]

'getManager' @ [85:32] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [85:43] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getCachedValue' @ [85:52] ==> public open fun <T : (Any..Any?), D : (UserDataHolder..UserDataHolder?)> getCachedValue(@NotNull p0: Module, @NotNull p1: CachedValueProvider<(T..T?)>): (T..T?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T
    <D : (UserDataHolder..UserDataHolder?)> -> Module

'this' @ [85:67] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.cached[ReceiverParameterDescriptorImpl]

'provider' @ [85:73] ==> value-parameter provider: CachedValueProvider<T> defined in org.jetbrains.kotlin.idea.caches.resolve.cached[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [90:18] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IdeaModuleInfo

'getInstance' @ [91:50] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [91:62] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[ValueParameterDescriptorImpl]

'orderEntries' @ [91:70] ==> @NotNull public abstract fun orderEntries(): OrderEnumerator defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'compileOnly' @ [91:85] ==> public abstract fun compileOnly(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'recursively' @ [91:99] ==> public abstract fun recursively(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'exportedOnly' @ [91:113] ==> public abstract fun exportedOnly(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'productionOnly' @ [92:9] ==> value-parameter productionOnly: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[ValueParameterDescriptorImpl]

'dependencyEnumerator' @ [93:9] ==> val dependencyEnumerator: (OrderEnumerator..OrderEnumerator?) defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[LocalVariableDescriptor]

'productionOnly' @ [93:30] ==> public abstract fun productionOnly(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'dependencyEnumerator' @ [95:5] ==> val dependencyEnumerator: (OrderEnumerator..OrderEnumerator?) defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[LocalVariableDescriptor]

'forEach' @ [95:26] ==> public final fun forEach(@NotNull p0: ((OrderEntry..OrderEntry?)) -> Boolean): Unit defined in com.intellij.openapi.roots.OrderEnumerator[MyFunctionDescriptor]

'result' @ [97:9] ==> val result: LinkedHashSet<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[LocalVariableDescriptor]

'addAll' @ [97:16] ==> public open fun addAll(elements: Collection<IdeaModuleInfo>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'orderEntryToModuleInfo' @ [97:23] ==> private fun orderEntryToModuleInfo(project: Project, orderEntry: OrderEntry, productionOnly: Boolean): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'module' @ [97:46] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[ValueParameterDescriptorImpl]

'project' @ [97:53] ==> public final val Module.project: Project[MyPropertyDescriptor]

'orderEntry' @ [97:62] ==> value-parameter orderEntry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies.<anonymous>[ValueParameterDescriptorImpl]

'productionOnly' @ [97:76] ==> value-parameter productionOnly: Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[ValueParameterDescriptorImpl]

'result' @ [100:12] ==> val result: LinkedHashSet<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ideaModelDependencies[LocalVariableDescriptor]

'toList' @ [100:19] ==> public fun <T> Iterable<IdeaModuleInfo>.toList(): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'module' @ [106:40] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'name' @ [106:47] ==> public final val Module.name: String[MyPropertyDescriptor]

'MODULE' @ [109:30] ==> enum entry MODULE defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'getPlatform' @ [112:40] ==> @NotNull public open fun getPlatform(@NotNull module: Module): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'module' @ [112:52] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'KotlinModuleModificationTracker' @ [115:13] ==> public constructor KotlinModuleModificationTracker(module: Module) defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[ClassConstructorDescriptorImpl]

'module' @ [115:45] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'special' @ [119:30] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'module' @ [119:72] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceInfo[PropertyDescriptorImpl]

'name' @ [119:79] ==> public final val Module.name: String[MyPropertyDescriptor]

'ModuleProductionSourceScope' @ [121:54] ==> public constructor ModuleProductionSourceScope(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[ClassConstructorDescriptorImpl]

'module' @ [121:82] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceInfo[PropertyDescriptorImpl]

'module' @ [123:35] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceInfo[PropertyDescriptorImpl]

'cached' @ [123:42] ==> public fun <T> Module.cached(provider: CachedValueProvider<List<IdeaModuleInfo>>): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<IdeaModuleInfo>

'CachedValueProvider' @ [123:49] ==> @FunctionalInterface public fun <T : (Any..Any?)> CachedValueProvider(function: () -> CachedValueProvider.Result<(List<IdeaModuleInfo>..List<IdeaModuleInfo>?)>?): CachedValueProvider<List<IdeaModuleInfo>> defined in com.intellij.psi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> List<IdeaModuleInfo>

'Result' @ [124:29] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: List<IdeaModuleInfo>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<IdeaModuleInfo>

'ideaModelDependencies' @ [125:17] ==> private fun ideaModelDependencies(module: Module, productionOnly: Boolean): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'module' @ [125:39] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceInfo[PropertyDescriptorImpl]

'getInstance' @ [126:48] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'module' @ [126:60] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceInfo[PropertyDescriptorImpl]

'project' @ [126:67] ==> public final val Module.project: Project[MyPropertyDescriptor]

'special' @ [132:30] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'module' @ [132:66] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'name' @ [132:73] ==> public final val Module.name: String[MyPropertyDescriptor]

'module' @ [134:40] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'name' @ [134:47] ==> public final val Module.name: String[MyPropertyDescriptor]

'ModuleTestSourceScope' @ [136:54] ==> public constructor ModuleTestSourceScope(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope[ClassConstructorDescriptorImpl]

'module' @ [136:76] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'module' @ [138:35] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'cached' @ [138:42] ==> public fun <T> Module.cached(provider: CachedValueProvider<List<IdeaModuleInfo>>): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<IdeaModuleInfo>

'CachedValueProvider' @ [138:49] ==> @FunctionalInterface public fun <T : (Any..Any?)> CachedValueProvider(function: () -> CachedValueProvider.Result<(List<IdeaModuleInfo>..List<IdeaModuleInfo>?)>?): CachedValueProvider<List<IdeaModuleInfo>> defined in com.intellij.psi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> List<IdeaModuleInfo>

'Result' @ [139:29] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: List<IdeaModuleInfo>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<IdeaModuleInfo>

'ideaModelDependencies' @ [140:17] ==> private fun ideaModelDependencies(module: Module, productionOnly: Boolean): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'module' @ [140:39] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'getInstance' @ [141:48] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'module' @ [141:60] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'project' @ [141:67] ==> public final val Module.project: Project[MyPropertyDescriptor]

'module' @ [144:54] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'cached' @ [144:61] ==> public fun <T> Module.cached(provider: CachedValueProvider<SmartList<ModuleInfo>>): SmartList<ModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SmartList<ModuleInfo>

'CachedValueProvider' @ [144:68] ==> @FunctionalInterface public fun <T : (Any..Any?)> CachedValueProvider(function: () -> CachedValueProvider.Result<(SmartList<ModuleInfo>..SmartList<ModuleInfo>?)>?): CachedValueProvider<SmartList<ModuleInfo>> defined in com.intellij.psi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> SmartList<ModuleInfo>

'SmartList' @ [145:20] ==> public constructor SmartList<E : (Any..Any?)>(p0: (ModuleInfo..ModuleInfo?)) defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ModuleInfo

'module' @ [145:42] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'productionSourceInfo' @ [145:49] ==> public fun Module.productionSourceInfo(): ModuleProductionSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'getInstance' @ [147:30] ==> public open fun getInstance(@NotNull p0: Module): (TestModuleProperties..TestModuleProperties?) defined in com.intellij.openapi.roots.TestModuleProperties[JavaMethodDescriptor]

'module' @ [147:42] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'productionModule' @ [147:50] ==> public final val TestModuleProperties.productionModule: Module?[MyPropertyDescriptor]

'let' @ [147:68] ==> @InlineOnly public inline fun <T, R> Module.let(block: (Module) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> Boolean

'list' @ [148:13] ==> val list: SmartList<ModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo.modulesWhoseInternalsAreVisible.<anonymous>[LocalVariableDescriptor]

'add' @ [148:18] ==> public open fun add(element: (ModuleInfo..ModuleInfo?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'it' @ [148:22] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo.modulesWhoseInternalsAreVisible.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'productionSourceInfo' @ [148:25] ==> public fun Module.productionSourceInfo(): ModuleProductionSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'Result' @ [151:29] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: SmartList<ModuleInfo>?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SmartList<ModuleInfo>

'list' @ [151:36] ==> val list: SmartList<ModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo.modulesWhoseInternalsAreVisible.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [151:73] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'module' @ [151:85] ==> public open val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[PropertyDescriptorImpl]

'project' @ [151:92] ==> public final val Module.project: Project[MyPropertyDescriptor]

'this' @ [155:43] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.isTests[ReceiverParameterDescriptorImpl]

'ModuleProductionSourceInfo' @ [157:65] ==> public constructor ModuleProductionSourceInfo(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceInfo[ClassConstructorDescriptorImpl]

'this' @ [157:92] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.productionSourceInfo[ReceiverParameterDescriptorImpl]

'ModuleTestSourceInfo' @ [158:53] ==> public constructor ModuleTestSourceInfo(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceInfo[ClassConstructorDescriptorImpl]

'this' @ [158:74] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.testSourceInfo[ReceiverParameterDescriptorImpl]

'GlobalSearchScope' @ [160:64] ==> protected/*protected and package*/ constructor GlobalSearchScope(@Nullable p0: Project?) defined in com.intellij.psi.search.GlobalSearchScope[JavaClassConstructorDescriptor]

'module' @ [160:82] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceScope.<init>[ValueParameterDescriptorImpl]

'project' @ [160:89] ==> public final val Module.project: Project[MyPropertyDescriptor]

'aModule' @ [162:61] ==> value-parameter aModule: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceScope.isSearchInModuleContent[ValueParameterDescriptorImpl]

'module' @ [162:72] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceScope[PropertyDescriptorImpl]

'ModuleSourceScope' @ [166:61] ==> public constructor ModuleSourceScope(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceScope[ClassConstructorDescriptorImpl]

'module' @ [166:79] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope.<init>[ValueParameterDescriptorImpl]

'getInstance' @ [167:45] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [167:57] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope.<init>[ValueParameterDescriptorImpl]

'fileIndex' @ [167:65] ==> public final val ModuleRootManager.fileIndex: ModuleFileIndex[MyPropertyDescriptor]

'this' @ [170:13] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[LazyClassReceiverParameterDescriptor]

'other' @ [170:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope.equals[ValueParameterDescriptorImpl]

'other' @ [171:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope.equals[ValueParameterDescriptorImpl]

'module' @ [171:57] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[PropertyDescriptorImpl]

'other' @ [171:67] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope.equals[ValueParameterDescriptorImpl]

'module' @ [171:73] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[PropertyDescriptorImpl]

'*' @ [174:36] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'module' @ [174:41] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[PropertyDescriptorImpl]

'hashCode' @ [174:48] ==> public open fun hashCode(): Int defined in com.intellij.openapi.module.Module[DeserializedSimpleFunctionDescriptor]

'moduleFileIndex' @ [176:48] ==> public final val moduleFileIndex: ModuleFileIndex defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[PropertyDescriptorImpl]

'isInSourceContentWithoutInjected' @ [176:64] ==> public fun FileIndex.isInSourceContentWithoutInjected(file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[SimpleFunctionDescriptorImpl]

'file' @ [176:97] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope.contains[ValueParameterDescriptorImpl]

'!' @ [176:106] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleFileIndex' @ [176:107] ==> public final val moduleFileIndex: ModuleFileIndex defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[PropertyDescriptorImpl]

'isInTestSourceContent' @ [176:123] ==> public abstract fun isInTestSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ModuleFileIndex[JavaMethodDescriptor]

'file' @ [176:145] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope.contains[ValueParameterDescriptorImpl]

'module' @ [178:61] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleProductionSourceScope[PropertyDescriptorImpl]

'ModuleSourceScope' @ [181:55] ==> public constructor ModuleSourceScope(module: Module) defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceScope[ClassConstructorDescriptorImpl]

'module' @ [181:73] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope.<init>[ValueParameterDescriptorImpl]

'getInstance' @ [182:45] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [182:57] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope.<init>[ValueParameterDescriptorImpl]

'fileIndex' @ [182:65] ==> public final val ModuleRootManager.fileIndex: ModuleFileIndex[MyPropertyDescriptor]

'this' @ [185:13] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope[LazyClassReceiverParameterDescriptor]

'other' @ [185:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope.equals[ValueParameterDescriptorImpl]

'other' @ [186:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope.equals[ValueParameterDescriptorImpl]

'module' @ [186:51] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope[PropertyDescriptorImpl]

'other' @ [186:61] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope.equals[ValueParameterDescriptorImpl]

'module' @ [186:67] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope[PropertyDescriptorImpl]

'*' @ [189:36] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'module' @ [189:41] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope[PropertyDescriptorImpl]

'hashCode' @ [189:48] ==> public open fun hashCode(): Int defined in com.intellij.openapi.module.Module[DeserializedSimpleFunctionDescriptor]

'moduleFileIndex' @ [191:48] ==> public final val moduleFileIndex: ModuleFileIndex defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope[PropertyDescriptorImpl]

'isInTestSourceContent' @ [191:64] ==> public abstract fun isInTestSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ModuleFileIndex[JavaMethodDescriptor]

'file' @ [191:86] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope.contains[ValueParameterDescriptorImpl]

'module' @ [193:55] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleTestSourceScope[PropertyDescriptorImpl]

'LIBRARY' @ [198:30] ==> enum entry LIBRARY defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'special' @ [200:36] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'library' @ [200:56] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'name' @ [200:64] ==> public final val Library.name: String?[MyPropertyDescriptor]

'LibraryWithoutSourceScope' @ [202:54] ==> public constructor LibraryWithoutSourceScope(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope[ClassConstructorDescriptorImpl]

'project' @ [202:80] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'library' @ [202:89] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'LinkedHashSet' @ [208:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> IdeaModuleInfo

'result' @ [209:9] ==> val result: LinkedHashSet<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies[LocalVariableDescriptor]

'add' @ [209:16] ==> public open fun add(element: IdeaModuleInfo): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'this' @ [209:20] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[LazyClassReceiverParameterDescriptor]

'component1' @ [211:14] ==> public final operator fun component1(): List<Library> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [211:25] ==> public final operator fun component2(): List<Sdk> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'LibraryDependenciesCache' @ [211:33] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCache[FakeCallableDescriptorForObject]

'getInstance' @ [211:58] ==> public final fun getInstance(project: Project): LibraryDependenciesCache defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCache.Companion[SimpleFunctionDescriptorImpl]

'project' @ [211:70] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'getLibrariesAndSdksUsedWith' @ [211:79] ==> public abstract fun getLibrariesAndSdksUsedWith(library: Library): LibrariesAndSdks /* = Pair<List<Library>, List<Sdk>> */ defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryDependenciesCache[SimpleFunctionDescriptorImpl]

'library' @ [211:107] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'sdks' @ [213:9] ==> val sdks: List<Sdk> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies[LocalVariableDescriptor]

'mapTo' @ [213:14] ==> public inline fun <T, R, C : MutableCollection<in SdkInfo>> Iterable<Sdk>.mapTo(destination: LinkedHashSet<IdeaModuleInfo>, transform: (Sdk) -> SdkInfo): LinkedHashSet<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk
    <R> -> SdkInfo
    <C : MutableCollection<in R>> -> LinkedHashSet<IdeaModuleInfo>

'result' @ [213:20] ==> val result: LinkedHashSet<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies[LocalVariableDescriptor]

'SdkInfo' @ [213:30] ==> public constructor SdkInfo(project: Project, sdk: Sdk) defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[ClassConstructorDescriptorImpl]

'project' @ [213:38] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'it' @ [213:47] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies.<anonymous>[ValueParameterDescriptorImpl]

'libraries' @ [214:9] ==> val libraries: List<Library> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies[LocalVariableDescriptor]

'filter' @ [214:19] ==> public inline fun <T> Iterable<Library>.filter(predicate: (Library) -> Boolean): List<Library> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library

'it' @ [214:28] ==> value-parameter it: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [214:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [214:48] ==> value-parameter it: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies.<anonymous>[ValueParameterDescriptorImpl]

'isDisposed' @ [214:51] ==> public final val LibraryEx.isDisposed: Boolean[MyPropertyDescriptor]

'mapTo' @ [214:64] ==> public inline fun <T, R, C : MutableCollection<in LibraryInfo>> Iterable<Library>.mapTo(destination: LinkedHashSet<IdeaModuleInfo>, transform: (Library) -> LibraryInfo): LinkedHashSet<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library
    <R> -> LibraryInfo
    <C : MutableCollection<in R>> -> LinkedHashSet<IdeaModuleInfo>

'result' @ [214:70] ==> val result: LinkedHashSet<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies[LocalVariableDescriptor]

'LibraryInfo' @ [214:80] ==> public constructor LibraryInfo(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[ClassConstructorDescriptorImpl]

'project' @ [214:92] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'it' @ [214:101] ==> value-parameter it: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [216:16] ==> val result: LinkedHashSet<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.dependencies[LocalVariableDescriptor]

'toList' @ [216:23] ==> public fun <T> Iterable<IdeaModuleInfo>.toList(): List<IdeaModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo

'getLibraryPlatform' @ [220:17] ==> public fun getLibraryPlatform(library: Library): TargetPlatform defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[SimpleFunctionDescriptorImpl]

'library' @ [220:36] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'LibrarySourceInfo' @ [223:17] ==> public constructor LibrarySourceInfo(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[ClassConstructorDescriptorImpl]

'project' @ [223:35] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'library' @ [223:44] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'library' @ [226:13] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'getFiles' @ [226:21] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'CLASSES' @ [226:44] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'mapNotNull' @ [226:53] ==> public inline fun <T, R : Any> Array<out (VirtualFile..VirtualFile?)>.mapNotNull(transform: ((VirtualFile..VirtualFile?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <R : Any> -> String

'PathUtil' @ [226:64] ==> private constructor PathUtil() defined in com.intellij.util.PathUtil[JavaClassConstructorDescriptor]

'library' @ [228:58] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'name' @ [228:66] ==> public final val Library.name: String?[MyPropertyDescriptor]

'this' @ [231:13] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[LazyClassReceiverParameterDescriptor]

'other' @ [231:22] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.equals[ValueParameterDescriptorImpl]

'other' @ [232:17] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.equals[ValueParameterDescriptorImpl]

'library' @ [232:41] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'other' @ [232:52] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo.equals[ValueParameterDescriptorImpl]

'library' @ [232:58] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'*' @ [235:36] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'library' @ [235:41] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[PropertyDescriptorImpl]

'hashCode' @ [235:49] ==> public open fun hashCode(): Int defined in com.intellij.openapi.roots.libraries.Library[DeserializedSimpleFunctionDescriptor]

'special' @ [240:36] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'library' @ [240:68] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'name' @ [240:76] ==> public final val Library.name: String?[MyPropertyDescriptor]

'KotlinSourceFilterScope' @ [242:53] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'librarySources' @ [242:77] ==> @JvmStatic public final fun librarySources(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'LibrarySourceScope' @ [242:92] ==> public constructor LibrarySourceScope(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope[ClassConstructorDescriptorImpl]

'project' @ [242:111] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'library' @ [242:120] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'project' @ [242:130] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'listOf' @ [248:16] ==> public fun <T> listOf(element: LibraryInfo): List<LibraryInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryInfo

'LibraryInfo' @ [248:23] ==> public constructor LibraryInfo(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[ClassConstructorDescriptorImpl]

'project' @ [248:35] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'library' @ [248:44] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'LibraryInfo' @ [252:17] ==> public constructor LibraryInfo(project: Project, library: Library) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryInfo[ClassConstructorDescriptorImpl]

'project' @ [252:29] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'library' @ [252:38] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'library' @ [254:64] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceInfo[PropertyDescriptorImpl]

'name' @ [254:72] ==> public final val Library.name: String?[MyPropertyDescriptor]

'LIBRARY' @ [260:30] ==> enum entry LIBRARY defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'special' @ [262:36] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'sdk' @ [262:52] ==> public final val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[PropertyDescriptorImpl]

'name' @ [262:56] ==> public final val Sdk.name: String[MyPropertyDescriptor]

'SdkScope' @ [264:54] ==> public constructor SdkScope(project: Project, sdk: Sdk) defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope[ClassConstructorDescriptorImpl]

'project' @ [264:63] ==> public final val project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[PropertyDescriptorImpl]

'sdk' @ [264:72] ==> public final val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[PropertyDescriptorImpl]

'listOf' @ [266:57] ==> public fun <T> listOf(element: SdkInfo): List<SdkInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SdkInfo

'this' @ [266:64] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.SdkInfo[LazyClassReceiverParameterDescriptor]

'OTHER' @ [271:30] ==> enum entry OTHER defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

'special' @ [273:36] ==> @NotNull public open fun special(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'EMPTY_SCOPE' @ [275:53] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'listOf' @ [278:57] ==> public fun <T> listOf(element: NotUnderContentRootModuleInfo): List<NotUnderContentRootModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotUnderContentRootModuleInfo

'this' @ [278:64] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.NotUnderContentRootModuleInfo[LazyClassReceiverParameterDescriptor]

'LibraryScopeBase' @ [282:9] ==> public constructor LibraryScopeBase(p0: (Project..Project?), p1: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?), p2: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)) defined in com.intellij.openapi.module.impl.scopes.LibraryScopeBase[JavaClassConstructorDescriptor]

'project' @ [282:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope.<init>[ValueParameterDescriptorImpl]

'library' @ [282:35] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope.<init>[ValueParameterDescriptorImpl]

'getFiles' @ [282:43] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'CLASSES' @ [282:66] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'arrayOf' @ [282:76] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: VirtualFile): Array<VirtualFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> VirtualFile

'myIndex' @ [284:65] ==> protected/*protected and package*/ final val myIndex: (ProjectFileIndex..ProjectFileIndex?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope[JavaPropertyDescriptor]

'getClassRootForFile' @ [284:73] ==> @Nullable public abstract fun getClassRootForFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [284:93] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope.getFileRoot[ValueParameterDescriptorImpl]

'other' @ [286:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope.equals[ValueParameterDescriptorImpl]

'library' @ [286:78] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope[PropertyDescriptorImpl]

'other' @ [286:89] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope.equals[ValueParameterDescriptorImpl]

'library' @ [286:95] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope[PropertyDescriptorImpl]

'library' @ [288:31] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope[PropertyDescriptorImpl]

'hashCode' @ [288:39] ==> public open fun hashCode(): Int defined in com.intellij.openapi.roots.libraries.Library[DeserializedSimpleFunctionDescriptor]

'library' @ [290:59] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryWithoutSourceScope[PropertyDescriptorImpl]

'LibraryScopeBase' @ [294:9] ==> public constructor LibraryScopeBase(p0: (Project..Project?), p1: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?), p2: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)) defined in com.intellij.openapi.module.impl.scopes.LibraryScopeBase[JavaClassConstructorDescriptor]

'project' @ [294:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope.<init>[ValueParameterDescriptorImpl]

'arrayOf' @ [294:35] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: VirtualFile): Array<VirtualFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> VirtualFile

'library' @ [294:59] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope.<init>[ValueParameterDescriptorImpl]

'getFiles' @ [294:67] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'SOURCES' @ [294:90] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'myIndex' @ [296:65] ==> protected/*protected and package*/ final val myIndex: (ProjectFileIndex..ProjectFileIndex?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope[JavaPropertyDescriptor]

'getSourceRootForFile' @ [296:73] ==> @Nullable public abstract fun getSourceRootForFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [296:94] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope.getFileRoot[ValueParameterDescriptorImpl]

'other' @ [298:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope.equals[ValueParameterDescriptorImpl]

'library' @ [298:71] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope[PropertyDescriptorImpl]

'other' @ [298:82] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope.equals[ValueParameterDescriptorImpl]

'library' @ [298:88] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope[PropertyDescriptorImpl]

'library' @ [300:31] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope[PropertyDescriptorImpl]

'hashCode' @ [300:39] ==> public open fun hashCode(): Int defined in com.intellij.openapi.roots.libraries.Library[DeserializedSimpleFunctionDescriptor]

'library' @ [302:52] ==> private final val library: Library defined in org.jetbrains.kotlin.idea.caches.resolve.LibrarySourceScope[PropertyDescriptorImpl]

'LibraryScopeBase' @ [307:9] ==> public constructor LibraryScopeBase(p0: (Project..Project?), p1: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?), p2: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)) defined in com.intellij.openapi.module.impl.scopes.LibraryScopeBase[JavaClassConstructorDescriptor]

'project' @ [307:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope.<init>[ValueParameterDescriptorImpl]

'sdk' @ [307:35] ==> value-parameter sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope.<init>[ValueParameterDescriptorImpl]

'rootProvider' @ [307:39] ==> public final val Sdk.rootProvider: RootProvider[MyPropertyDescriptor]

'getFiles' @ [307:52] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.RootProvider[JavaMethodDescriptor]

'CLASSES' @ [307:75] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'arrayOf' @ [307:85] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: VirtualFile): Array<VirtualFile> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> VirtualFile

'other' @ [309:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope.equals[ValueParameterDescriptorImpl]

'sdk' @ [309:61] ==> private final val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope[PropertyDescriptorImpl]

'other' @ [309:68] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope.equals[ValueParameterDescriptorImpl]

'sdk' @ [309:74] ==> private final val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope[PropertyDescriptorImpl]

'sdk' @ [311:31] ==> private final val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope[PropertyDescriptorImpl]

'hashCode' @ [311:35] ==> public open fun hashCode(): Int defined in com.intellij.openapi.projectRoots.Sdk[DeserializedSimpleFunctionDescriptor]

'sdk' @ [313:42] ==> private final val sdk: Sdk defined in org.jetbrains.kotlin.idea.caches.resolve.SdkScope[PropertyDescriptorImpl]

'this' @ [316:50] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.isLibraryClasses[ReceiverParameterDescriptorImpl]

'this' @ [316:69] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.isLibraryClasses[ReceiverParameterDescriptorImpl]

'Capability' @ [318:41] ==> public constructor Capability<T>(name: String) defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor.Capability[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> ModuleOrigin

'contentScope' @ [329:28] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.BinaryModuleInfo[SimpleFunctionDescriptorImpl]

'KotlinSourceFilterScope' @ [330:16] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'libraryClassFiles' @ [330:40] ==> @JvmStatic public final fun libraryClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'contentScope' @ [330:58] ==> val contentScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.BinaryModuleInfo.binariesScope[LocalVariableDescriptor]

'contentScope' @ [330:72] ==> val contentScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.BinaryModuleInfo.binariesScope[LocalVariableDescriptor]

'project' @ [330:85] ==> public final val GlobalSearchScope.project: Project?[MyPropertyDescriptor]

'EMPTY_SCOPE' @ [343:72] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'listOf' @ [345:35] ==> public fun <T> listOf(element: SourceForBinaryModuleInfo): List<SourceForBinaryModuleInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceForBinaryModuleInfo

'this' @ [345:42] ==> <this> defined in org.jetbrains.kotlin.idea.caches.resolve.SourceForBinaryModuleInfo[LazyClassReceiverParameterDescriptor]

'binariesModuleInfo' @ [345:50] ==> public abstract val binariesModuleInfo: BinaryModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.SourceForBinaryModuleInfo[PropertyDescriptorImpl]

'dependencies' @ [345:69] ==> public abstract fun dependencies(): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.BinaryModuleInfo[SimpleFunctionDescriptorImpl]

'OTHER' @ [348:30] ==> enum entry OTHER defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleOrigin[FakeCallableDescriptorForObject]

