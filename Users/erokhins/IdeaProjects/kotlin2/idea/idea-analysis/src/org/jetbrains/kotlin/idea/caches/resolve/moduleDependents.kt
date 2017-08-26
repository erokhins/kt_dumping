'getDependents' @ [34:22] ==> private fun getDependents(module: Module): Set<Module> defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'module' @ [34:36] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'if (isTests()) {
        dependents.mapTo(HashSet<ModuleSourceInfo>(), Module::testSourceInfo)
    }
    else {
        dependents.flatMapTo(HashSet<ModuleSourceInfo>()) { listOf(it.productionSourceInfo(), it.testSourceInfo()) }
    }' @ [35:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<ModuleSourceInfo>, elseBranch: Set<ModuleSourceInfo>): Set<ModuleSourceInfo>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<ModuleSourceInfo>

'isTests' @ [35:16] ==> internal fun ModuleSourceInfo.isTests(): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]

'dependents' @ [36:9] ==> val dependents: Set<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependentModules[LocalVariableDescriptor]

'mapTo' @ [36:20] ==> public inline fun <T, R, C : MutableCollection<in ModuleTestSourceInfo>> Iterable<Module>.mapTo(destination: HashSet<ModuleSourceInfo>, transform: (Module) -> ModuleTestSourceInfo): HashSet<ModuleSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> ModuleTestSourceInfo
    <C : MutableCollection<in R>> -> HashSet<ModuleSourceInfo>

'HashSet' @ [36:26] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ModuleSourceInfo

'dependents' @ [39:9] ==> val dependents: Set<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependentModules[LocalVariableDescriptor]

'flatMapTo' @ [39:20] ==> public inline fun <T, R, C : MutableCollection<in ModuleSourceInfo>> Iterable<Module>.flatMapTo(destination: HashSet<ModuleSourceInfo>, transform: (Module) -> Iterable<ModuleSourceInfo>): HashSet<ModuleSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> ModuleSourceInfo
    <C : MutableCollection<in R>> -> HashSet<ModuleSourceInfo>

'HashSet' @ [39:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ModuleSourceInfo

'listOf' @ [39:61] ==> public fun <T> listOf(vararg elements: ModuleSourceInfo): List<ModuleSourceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceInfo

'it' @ [39:68] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.caches.resolve.getDependentModules.<anonymous>[ValueParameterDescriptorImpl]

'productionSourceInfo' @ [39:71] ==> public fun Module.productionSourceInfo(): ModuleProductionSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'it' @ [39:95] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.caches.resolve.getDependentModules.<anonymous>[ValueParameterDescriptorImpl]

'testSourceInfo' @ [39:98] ==> public fun Module.testSourceInfo(): ModuleTestSourceInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file IdeaModuleInfos.kt[SimpleFunctionDescriptorImpl]

'THashSet' @ [45:18] ==> public constructor THashSet<E : (Any..Any?)>() defined in gnu.trove.THashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Module

'result' @ [46:5] ==> val result: THashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'add' @ [46:12] ==> public open fun add(element: (Module..Module?)): Boolean defined in gnu.trove.THashSet[JavaMethodDescriptor]

'module' @ [46:16] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[ValueParameterDescriptorImpl]

'THashSet' @ [48:30] ==> public constructor THashSet<E : (Any..Any?)>() defined in gnu.trove.THashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Module

'getModuleIndex' @ [50:17] ==> private fun getModuleIndex(project: Project): ModuleIndex defined in org.jetbrains.kotlin.idea.caches.resolve in file moduleDependents.kt[SimpleFunctionDescriptorImpl]

'module' @ [50:32] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[ValueParameterDescriptorImpl]

'project' @ [50:39] ==> public final val Module.project: Project[MyPropertyDescriptor]

'Queue' @ [52:24] ==> public constructor Queue<T : (Any..Any?)>(p0: Int) defined in com.intellij.util.containers.Queue[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Module

'walkingQueue' @ [53:5] ==> val walkingQueue: Queue<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'addLast' @ [53:18] ==> public open fun addLast(p0: (Module..Module?)): Unit defined in com.intellij.util.containers.Queue[JavaMethodDescriptor]

'module' @ [53:26] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[ValueParameterDescriptorImpl]

'!' @ [55:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'walkingQueue' @ [55:13] ==> val walkingQueue: Queue<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'isEmpty' @ [55:26] ==> public final val <T : (Any..Any?)> Queue<Module>.isEmpty: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Module

'walkingQueue' @ [56:23] ==> val walkingQueue: Queue<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'pullFirst' @ [56:36] ==> public open fun pullFirst(): (Module..Module?) defined in com.intellij.util.containers.Queue[JavaMethodDescriptor]

'processedExporting' @ [57:9] ==> val processedExporting: THashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'add' @ [57:28] ==> public open fun add(element: (Module..Module?)): Boolean defined in gnu.trove.THashSet[JavaMethodDescriptor]

'current' @ [57:32] ==> val current: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'result' @ [58:9] ==> val result: THashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'addAll' @ [58:16] ==> public open fun addAll(elements: Collection<(Module..Module?)>): Boolean defined in gnu.trove.THashSet[JavaMethodDescriptor]

'index' @ [58:23] ==> val index: ModuleIndex defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'plainUsages' @ [58:29] ==> public final val plainUsages: MultiMap<(Module..Module?), (Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleIndex[PropertyDescriptorImpl]

'current' @ [58:41] ==> val current: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'index' @ [59:27] ==> val index: ModuleIndex defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'exportingUsages' @ [59:33] ==> public final val exportingUsages: MultiMap<(Module..Module?), (Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleIndex[PropertyDescriptorImpl]

'current' @ [59:49] ==> val current: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'result' @ [60:13] ==> val result: THashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'add' @ [60:20] ==> public open fun add(element: (Module..Module?)): Boolean defined in gnu.trove.THashSet[JavaMethodDescriptor]

'dependent' @ [60:24] ==> val dependent: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'processedExporting' @ [61:17] ==> val processedExporting: THashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'add' @ [61:36] ==> public open fun add(element: (Module..Module?)): Boolean defined in gnu.trove.THashSet[JavaMethodDescriptor]

'dependent' @ [61:40] ==> val dependent: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'walkingQueue' @ [62:17] ==> val walkingQueue: Queue<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'addLast' @ [62:30] ==> public open fun addLast(p0: (Module..Module?)): Unit defined in com.intellij.util.containers.Queue[JavaMethodDescriptor]

'dependent' @ [62:38] ==> val dependent: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'result' @ [66:12] ==> val result: THashSet<Module> defined in org.jetbrains.kotlin.idea.caches.resolve.getDependents[LocalVariableDescriptor]

'create' @ [70:32] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(Module..Module?), (Module..Module?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Module
    <V : (Any..Any?)> -> Module

'create' @ [71:36] ==> @NotNull public open fun <K : (Any..Any?), V : (Any..Any?)> create(): MultiMap<(Module..Module?), (Module..Module?)> defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Module
    <V : (Any..Any?)> -> Module

'!!' @ [75:12] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: ModuleIndex?): ModuleIndex[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> ModuleIndex

'getManager' @ [75:32] ==> public open fun getManager(@NotNull p0: Project): (CachedValuesManager..CachedValuesManager?) defined in com.intellij.psi.util.CachedValuesManager[JavaMethodDescriptor]

'project' @ [75:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex[ValueParameterDescriptorImpl]

'getCachedValue' @ [75:52] ==> public final fun <T : (Any..Any?), D : (UserDataHolder..UserDataHolder?)> getCachedValue(@NotNull p0: Project, @NotNull p1: () -> CachedValueProvider.Result<(ModuleIndex..ModuleIndex?)>?): (ModuleIndex..ModuleIndex?) defined in com.intellij.psi.util.CachedValuesManager[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleIndex
    <D : (UserDataHolder..UserDataHolder?)> -> Project

'project' @ [75:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex[ValueParameterDescriptorImpl]

'ModuleIndex' @ [76:21] ==> public constructor ModuleIndex() defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleIndex[ClassConstructorDescriptorImpl]

'iterator' @ [77:24] ==> public final operator fun iterator(): Iterator<(Module..Module?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [77:38] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [77:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex[ValueParameterDescriptorImpl]

'modules' @ [77:59] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'iterator' @ [78:32] ==> public final operator fun iterator(): Iterator<(OrderEntry..OrderEntry?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [78:50] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [78:62] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'orderEntries' @ [78:70] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'orderEntry' @ [79:21] ==> val orderEntry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'orderEntry' @ [80:38] ==> val orderEntry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'module' @ [80:49] ==> public final val ModuleOrderEntry.module: Module?[MyPropertyDescriptor]

'referenced' @ [81:25] ==> val referenced: Module? defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'if (orderEntry.isExported) index.exportingUsages else index.plainUsages' @ [82:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MultiMap<(Module..Module?), (Module..Module?)>, elseBranch: MultiMap<(Module..Module?), (Module..Module?)>): MultiMap<(Module..Module?), (Module..Module?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MultiMap<(com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?), (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)>

'orderEntry' @ [82:39] ==> val orderEntry: (OrderEntry..OrderEntry?) defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'isExported' @ [82:50] ==> public final var ModuleOrderEntry.isExported: Boolean[MyPropertyDescriptor]

'index' @ [82:62] ==> val index: ModuleIndex defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'exportingUsages' @ [82:68] ==> public final val exportingUsages: MultiMap<(Module..Module?), (Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleIndex[PropertyDescriptorImpl]

'index' @ [82:89] ==> val index: ModuleIndex defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'plainUsages' @ [82:95] ==> public final val plainUsages: MultiMap<(Module..Module?), (Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleIndex[PropertyDescriptorImpl]

'map' @ [83:25] ==> val map: MultiMap<(Module..Module?), (Module..Module?)> defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'putValue' @ [83:29] ==> public open fun putValue(@Nullable p0: Module?, p1: (Module..Module?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'referenced' @ [83:38] ==> val referenced: Module? defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'module' @ [83:50] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'Result' @ [88:29] ==> public constructor Result<T : (Any..Any?)>(@Nullable p0: ModuleIndex?, @NotNull vararg p1: (Any..Any?)) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleIndex

'index' @ [88:36] ==> val index: ModuleIndex defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [88:74] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'project' @ [88:86] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.getModuleIndex[ValueParameterDescriptorImpl]

