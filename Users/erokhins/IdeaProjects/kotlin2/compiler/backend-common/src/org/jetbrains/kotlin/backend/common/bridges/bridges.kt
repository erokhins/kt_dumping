'from' @ [39:33] ==> public final val from: Signature defined in org.jetbrains.kotlin.backend.common.bridges.Bridge[PropertyDescriptorImpl]

'to' @ [39:42] ==> public final val to: Signature defined in org.jetbrains.kotlin.backend.common.bridges.Bridge[PropertyDescriptorImpl]

'function' @ [49:9] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'isAbstract' @ [49:18] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'setOf' @ [49:37] ==> @InlineOnly public inline fun <T> setOf(): Set<Bridge<Signature>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Bridge<Signature>

'!' @ [51:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [51:17] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'isDeclaration' @ [51:26] ==> public abstract val isDeclaration: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'fake' @ [55:9] ==> val fake: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'function' @ [55:17] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'getOverridden' @ [55:26] ==> public abstract fun getOverridden(): Iterable<FunctionHandle> defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[SimpleFunctionDescriptorImpl]

'none' @ [55:42] ==> public inline fun <T> Iterable<FunctionHandle>.none(predicate: (FunctionHandle) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionHandle

'it' @ [55:49] ==> value-parameter it: FunctionHandle defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [55:52] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'setOf' @ [55:73] ==> @InlineOnly public inline fun <T> setOf(): Set<Bridge<Signature>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Bridge<Signature>

'findConcreteSuperDeclaration' @ [57:26] ==> public fun <Function : FunctionHandle> findConcreteSuperDeclaration(function: Function): Function defined in org.jetbrains.kotlin.backend.common.bridges[SimpleFunctionDescriptorImpl]
Inferred types:
    <Function : FunctionHandle> -> Function

'function' @ [57:55] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'findAllReachableDeclarations' @ [59:29] ==> public fun <Function : FunctionHandle> findAllReachableDeclarations(function: Function): MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges[SimpleFunctionDescriptorImpl]
Inferred types:
    <Function : FunctionHandle> -> Function

'function' @ [59:58] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'mapTo' @ [59:68] ==> public inline fun <T, R, C : MutableCollection<in Signature>> Iterable<Function>.mapTo(destination: HashSet<Signature>, transform: (Function) -> Signature): HashSet<Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function
    <R> -> Signature
    <C : MutableCollection<in R>> -> HashSet<Signature>

'HashSet' @ [59:74] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Signature

'signature' @ [59:96] ==> value-parameter signature: (Function) -> Signature defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'fake' @ [61:9] ==> val fake: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'Suppress' @ [65:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'function' @ [66:28] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'getOverridden' @ [66:37] ==> public abstract fun getOverridden(): Iterable<FunctionHandle> defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[SimpleFunctionDescriptorImpl]

'!' @ [67:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overridden' @ [67:18] ==> val overridden: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'isAbstract' @ [67:29] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'bridgesToGenerate' @ [68:17] ==> val bridgesToGenerate: HashSet<Signature> defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'removeAll' @ [68:35] ==> public open fun removeAll(elements: Collection<Signature>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'findAllReachableDeclarations' @ [68:45] ==> public fun <Function : FunctionHandle> findAllReachableDeclarations(function: Function): MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges[SimpleFunctionDescriptorImpl]
Inferred types:
    <Function : FunctionHandle> -> Function

'overridden' @ [68:74] ==> val overridden: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'map' @ [68:86] ==> public inline fun <T, R> Iterable<Function>.map(transform: (Function) -> Signature): List<Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function
    <R> -> Signature

'signature' @ [68:90] ==> value-parameter signature: (Function) -> Signature defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[ValueParameterDescriptorImpl]

'invoke' @ [73:18] ==> public abstract operator fun invoke(p1: Function): Signature defined in kotlin.Function1[FunctionInvokeDescriptor]

'implementation' @ [73:28] ==> val implementation: Function defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'bridgesToGenerate' @ [74:5] ==> val bridgesToGenerate: HashSet<Signature> defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'remove' @ [74:23] ==> public open fun remove(element: Signature): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'method' @ [74:30] ==> val method: Signature defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'bridgesToGenerate' @ [75:12] ==> val bridgesToGenerate: HashSet<Signature> defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'map' @ [75:30] ==> public inline fun <T, R> Iterable<Signature>.map(transform: (Signature) -> Bridge<Signature>): List<Bridge<Signature>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature
    <R> -> Bridge<Signature>

'Bridge' @ [75:36] ==> public constructor Bridge<out Signature>(from: Signature, to: Signature) defined in org.jetbrains.kotlin.backend.common.bridges.Bridge[ClassConstructorDescriptorImpl]
Inferred types:
    <out Signature> -> Signature

'it' @ [75:43] ==> value-parameter it: Signature defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges.<anonymous>[ValueParameterDescriptorImpl]

'method' @ [75:47] ==> val method: Signature defined in org.jetbrains.kotlin.backend.common.bridges.generateBridges[LocalVariableDescriptor]

'toSet' @ [75:57] ==> public fun <T> Iterable<Bridge<Signature>>.toSet(): Set<Bridge<Signature>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Bridge<Signature>

'DFS.NodeHandlerWithListResult<Function, Function>' @ [79:30] ==> protected/*protected and package*/ constructor NodeHandlerWithListResult<N : (Any..Any?), R : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.NodeHandlerWithListResult[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> Function
    <R : (Any..Any?)> -> Function

'current' @ [81:17] ==> value-parameter current: Function defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'isDeclaration' @ [81:25] ==> public abstract val isDeclaration: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'result' @ [82:17] ==> @NotNull protected/*protected and package*/ final val result: LinkedList<(Function..Function?)> defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations.<no name provided>[JavaPropertyDescriptor]

'add' @ [82:24] ==> public open fun add(element: (Function..Function?)): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'current' @ [82:28] ==> value-parameter current: Function defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations.<no name provided>.afterChildren[ValueParameterDescriptorImpl]

'Suppress' @ [86:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'dfs' @ [87:9] ==> public final fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull p0: (MutableCollection<(Function..Function?)>..Collection<(Function..Function?)>), @NotNull p1: ((Function..Function?)) -> (MutableIterable<(Function..Function?)>..Iterable<(Function..Function?)>), @NotNull p2: DFS.NodeHandler<(Function..Function?), (LinkedList<(Function..Function?)>..LinkedList<(Function..Function?)>?)>): (LinkedList<(Function..Function?)>..LinkedList<(Function..Function?)>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> Function
    <R : (Any..Any?)> -> LinkedList<(Function..Function?)>

'listOf' @ [87:13] ==> public fun <T> listOf(element: Function): List<Function> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function

'function' @ [87:20] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations[ValueParameterDescriptorImpl]

'it' @ [87:33] ==> value-parameter it: (Function..Function?) defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'getOverridden' @ [87:36] ==> public abstract fun getOverridden(): Iterable<FunctionHandle> defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[SimpleFunctionDescriptorImpl]

'collector' @ [87:77] ==> val collector: <no name provided><Function> defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations[LocalVariableDescriptor]

'HashSet' @ [88:12] ==> public constructor HashSet<E : (Any..Any?)>(p0: (MutableCollection<out (Function..Function?)>..Collection<(Function..Function?)>?)) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Function

'collector' @ [88:20] ==> val collector: <no name provided><Function> defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations[LocalVariableDescriptor]

'result' @ [88:30] ==> @NotNull public open fun result(): LinkedList<(Function..Function?)> defined in org.jetbrains.kotlin.backend.common.bridges.findAllReachableDeclarations.<no name provided>[JavaMethodDescriptor]

'require' @ [96:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [96:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [96:14] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[ValueParameterDescriptorImpl]

'isAbstract' @ [96:23] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'function' @ [96:85] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[ValueParameterDescriptorImpl]

'function' @ [98:9] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[ValueParameterDescriptorImpl]

'isDeclaration' @ [98:18] ==> public abstract val isDeclaration: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'function' @ [98:40] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[ValueParameterDescriptorImpl]

'findAllReachableDeclarations' @ [108:18] ==> public fun <Function : FunctionHandle> findAllReachableDeclarations(function: Function): MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges[SimpleFunctionDescriptorImpl]
Inferred types:
    <Function : FunctionHandle> -> Function

'function' @ [108:47] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[ValueParameterDescriptorImpl]

'HashSet' @ [109:20] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Function

'result' @ [110:25] ==> val result: MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'findAllReachableDeclarations' @ [111:25] ==> public fun <Function : FunctionHandle> findAllReachableDeclarations(function: Function): MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges[SimpleFunctionDescriptorImpl]
Inferred types:
    <Function : FunctionHandle> -> Function

'declaration' @ [111:54] ==> val declaration: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'reachable' @ [112:9] ==> val reachable: MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'remove' @ [112:19] ==> public abstract fun remove(element: Function): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'declaration' @ [112:26] ==> val declaration: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'toRemove' @ [113:9] ==> val toRemove: HashSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'addAll' @ [113:18] ==> public open fun addAll(elements: Collection<Function>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'reachable' @ [113:25] ==> val reachable: MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'result' @ [115:5] ==> val result: MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'removeAll' @ [115:12] ==> public abstract fun removeAll(elements: Collection<Function>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'toRemove' @ [115:22] ==> val toRemove: HashSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'result' @ [117:40] ==> val result: MutableSet<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'filter' @ [117:47] ==> public inline fun <T> Iterable<Function>.filter(predicate: (Function) -> Boolean): List<Function> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function

'!' @ [117:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [117:57] ==> value-parameter it: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'isAbstract' @ [117:60] ==> public abstract val isAbstract: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'!' @ [117:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [117:75] ==> value-parameter it: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'isInterfaceDeclaration' @ [117:78] ==> public abstract val isInterfaceDeclaration: Boolean defined in org.jetbrains.kotlin.backend.common.bridges.FunctionHandle[PropertyDescriptorImpl]

'concreteRelevantDeclarations' @ [118:9] ==> val concreteRelevantDeclarations: List<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'size' @ [118:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'error' @ [119:9] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'function' @ [119:40] ==> value-parameter function: Function defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[ValueParameterDescriptorImpl]

'concreteRelevantDeclarations' @ [119:102] ==> val concreteRelevantDeclarations: List<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

'concreteRelevantDeclarations' @ [122:12] ==> val concreteRelevantDeclarations: List<Function> defined in org.jetbrains.kotlin.backend.common.bridges.findConcreteSuperDeclaration[LocalVariableDescriptor]

