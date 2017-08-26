'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'Neighbors' @ [33:25] ==> public final fun <N : (Any..Any?)> Neighbors(function: ((TypeConstructor..TypeConstructor?)) -> (MutableIterable<(TypeConstructor..TypeConstructor?)>..Iterable<(TypeConstructor..TypeConstructor?)>)): DFS.Neighbors<TypeConstructor> defined in org.jetbrains.kotlin.utils.DFS[SimpleFunctionDescriptorImpl]
Inferred types:
    <N : (Any..Any?)> -> TypeConstructor

'invoke' @ [33:62] ==> public abstract operator fun invoke(p1: TypeConstructor): Iterable<KotlinType> defined in kotlin.Function1[FunctionInvokeDescriptor]

'node' @ [33:72] ==> value-parameter node: (TypeConstructor..TypeConstructor?) defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [33:78] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> TypeConstructor): List<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeConstructor

'it' @ [33:84] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [33:87] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'SmartList' @ [35:34] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'superTypes' @ [37:27] ==> value-parameter superTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[ValueParameterDescriptorImpl]

'isReachable' @ [38:17] ==> private fun isReachable(from: TypeConstructor, to: TypeConstructor, neighbors: DFS.Neighbors<TypeConstructor>): Boolean defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'superType' @ [38:29] ==> val superType: KotlinType defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[LocalVariableDescriptor]

'constructor' @ [38:39] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'currentTypeConstructor' @ [38:52] ==> value-parameter currentTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[ValueParameterDescriptorImpl]

'graph' @ [38:76] ==> val graph: DFS.Neighbors<TypeConstructor> defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[LocalVariableDescriptor]

'superTypesToRemove' @ [39:17] ==> val superTypesToRemove: SmartList<KotlinType> defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[LocalVariableDescriptor]

'add' @ [39:36] ==> public open fun add(element: (KotlinType..KotlinType?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'superType' @ [39:40] ==> val superType: KotlinType defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[LocalVariableDescriptor]

'invoke' @ [40:17] ==> public abstract operator fun invoke(p1: KotlinType): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'superType' @ [40:28] ==> val superType: KotlinType defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[LocalVariableDescriptor]

'if (superTypesToRemove.isEmpty()) superTypes else superTypes - superTypesToRemove' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<KotlinType>, elseBranch: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<KotlinType>

'superTypesToRemove' @ [44:20] ==> val superTypesToRemove: SmartList<KotlinType> defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[LocalVariableDescriptor]

'isEmpty' @ [44:39] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'superTypes' @ [44:50] ==> value-parameter superTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[ValueParameterDescriptorImpl]

'superTypes' @ [44:66] ==> value-parameter superTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[ValueParameterDescriptorImpl]

'superTypesToRemove' @ [44:79] ==> val superTypesToRemove: SmartList<KotlinType> defined in org.jetbrains.kotlin.resolve.SupertypeLoopCheckerImpl.findLoopsInSupertypesAndDisconnect[LocalVariableDescriptor]

'dfs' @ [53:9] ==> public open fun <N : (Any..Any?), R : (Any..Any?)> dfs(@NotNull p0: (MutableCollection<(TypeConstructor..TypeConstructor?)>..Collection<(TypeConstructor..TypeConstructor?)>), @NotNull p1: DFS.Neighbors<(TypeConstructor..TypeConstructor?)>, @NotNull p2: DFS.Visited<(TypeConstructor..TypeConstructor?)>, @NotNull p3: DFS.NodeHandler<(TypeConstructor..TypeConstructor?), (Unit..Unit?)>): (Unit..Unit?) defined in org.jetbrains.kotlin.utils.DFS[JavaMethodDescriptor]
Inferred types:
    <N : (Any..Any?)> -> TypeConstructor
    <R : (Any..Any?)> -> Unit

'listOf' @ [53:13] ==> public fun <T> listOf(element: TypeConstructor): List<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'from' @ [53:20] ==> value-parameter from: TypeConstructor defined in org.jetbrains.kotlin.resolve.isReachable[ValueParameterDescriptorImpl]

'neighbors' @ [53:27] ==> value-parameter neighbors: DFS.Neighbors<TypeConstructor> defined in org.jetbrains.kotlin.resolve.isReachable[ValueParameterDescriptorImpl]

'VisitedWithSet' @ [53:42] ==> public constructor VisitedWithSet<N : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.VisitedWithSet[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> TypeConstructor

'DFS.AbstractNodeHandler<TypeConstructor, Unit>' @ [53:69] ==> public constructor AbstractNodeHandler<N : (Any..Any?), R : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.DFS.AbstractNodeHandler[JavaClassConstructorDescriptor]
Inferred types:
    <N : (Any..Any?)> -> TypeConstructor
    <R : (Any..Any?)> -> Unit

'current' @ [55:17] ==> value-parameter current: TypeConstructor defined in org.jetbrains.kotlin.resolve.isReachable.<no name provided>.beforeChildren[ValueParameterDescriptorImpl]

'to' @ [55:28] ==> value-parameter to: TypeConstructor defined in org.jetbrains.kotlin.resolve.isReachable[ValueParameterDescriptorImpl]

'result' @ [56:17] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.isReachable[LocalVariableDescriptor]

'Unit' @ [62:33] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'result' @ [65:12] ==> var result: Boolean defined in org.jetbrains.kotlin.resolve.isReachable[LocalVariableDescriptor]

