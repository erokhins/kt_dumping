'invoke' @ [23:36] ==> public abstract fun invoke(): AbstractTypeConstructor.Supertypes defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'supertypesWithoutCycles' @ [23:49] ==> public final var supertypesWithoutCycles: List<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.Supertypes[PropertyDescriptorImpl]

'listOf' @ [31:61] ==> public fun <T> listOf(element: (SimpleType..SimpleType?)): List<(SimpleType..SimpleType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.SimpleType..org.jetbrains.kotlin.types.SimpleType?)

'ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES' @ [31:79] ==> public final val ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.ErrorUtils[JavaPropertyDescriptor]

'storageManager' @ [34:30] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.<init>[ValueParameterDescriptorImpl]

'createLazyValueWithPostCompute' @ [34:45] ==> public abstract fun <T : Any> createLazyValueWithPostCompute(computable: () -> AbstractTypeConstructor.Supertypes, onRecursiveCall: ((Boolean) -> AbstractTypeConstructor.Supertypes)?, postCompute: (AbstractTypeConstructor.Supertypes) -> Unit): NotNullLazyValue<AbstractTypeConstructor.Supertypes> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Supertypes

'Supertypes' @ [35:15] ==> public constructor Supertypes(allSupertypes: Collection<KotlinType>) defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.Supertypes[ClassConstructorDescriptorImpl]

'computeSupertypes' @ [35:26] ==> protected abstract fun computeSupertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor[SimpleFunctionDescriptorImpl]

'Supertypes' @ [36:15] ==> public constructor Supertypes(allSupertypes: Collection<KotlinType>) defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.Supertypes[ClassConstructorDescriptorImpl]

'listOf' @ [36:26] ==> public fun <T> listOf(element: (SimpleType..SimpleType?)): List<(SimpleType..SimpleType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.SimpleType..org.jetbrains.kotlin.types.SimpleType?)

'ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES' @ [36:44] ==> public final val ERROR_TYPE_FOR_LOOP_IN_SUPERTYPES: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.ErrorUtils[JavaPropertyDescriptor]

'supertypeLoopChecker' @ [42:25] ==> protected abstract val supertypeLoopChecker: SupertypeLoopChecker defined in org.jetbrains.kotlin.types.AbstractTypeConstructor[PropertyDescriptorImpl]

'findLoopsInSupertypesAndDisconnect' @ [42:46] ==> public abstract fun findLoopsInSupertypesAndDisconnect(currentTypeConstructor: TypeConstructor, superTypes: Collection<KotlinType>, neighbors: (TypeConstructor) -> Iterable<KotlinType>, reportLoop: (KotlinType) -> Unit): Collection<KotlinType> defined in org.jetbrains.kotlin.descriptors.SupertypeLoopChecker[SimpleFunctionDescriptorImpl]

'this' @ [43:29] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor[LazyClassReceiverParameterDescriptor]

'supertypes' @ [43:35] ==> value-parameter supertypes: AbstractTypeConstructor.Supertypes defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>[ValueParameterDescriptorImpl]

'allSupertypes' @ [43:46] ==> public final val allSupertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.Supertypes[PropertyDescriptorImpl]

'it' @ [44:31] ==> value-parameter it: TypeConstructor defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'computeNeighbours' @ [44:34] ==> private final fun TypeConstructor.computeNeighbours(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor[SimpleFunctionDescriptorImpl]

'reportSupertypeLoopError' @ [45:31] ==> protected open fun reportSupertypeLoopError(type: KotlinType): Unit defined in org.jetbrains.kotlin.types.AbstractTypeConstructor[SimpleFunctionDescriptorImpl]

'it' @ [45:56] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultWithoutCycles' @ [47:21] ==> var resultWithoutCycles: Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [47:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'resultWithoutCycles' @ [48:21] ==> var resultWithoutCycles: Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>[LocalVariableDescriptor]

'defaultSupertypeIfEmpty' @ [48:43] ==> protected open fun defaultSupertypeIfEmpty(): KotlinType? defined in org.jetbrains.kotlin.types.AbstractTypeConstructor[SimpleFunctionDescriptorImpl]

'let' @ [48:70] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> List<KotlinType>): List<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> List<KotlinType>

'listOf' @ [48:76] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [48:83] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'orEmpty' @ [48:89] ==> @InlineOnly public inline fun <T> List<KotlinType>?.orEmpty(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'supertypes' @ [51:17] ==> value-parameter supertypes: AbstractTypeConstructor.Supertypes defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>[ValueParameterDescriptorImpl]

'supertypesWithoutCycles' @ [51:28] ==> public final var supertypesWithoutCycles: List<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.Supertypes[PropertyDescriptorImpl]

'?:' @ [51:54] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<KotlinType>?, right: List<KotlinType>): List<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<KotlinType>

'resultWithoutCycles' @ [51:55] ==> var resultWithoutCycles: Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>[LocalVariableDescriptor]

'resultWithoutCycles' @ [51:100] ==> var resultWithoutCycles: Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.supertypes.<anonymous>[LocalVariableDescriptor]

'toList' @ [51:120] ==> public fun <T> Iterable<KotlinType>.toList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'?:' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Collection<KotlinType>?, right: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Collection<KotlinType>

'this' @ [55:14] ==> <this> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours[ReceiverParameterDescriptorImpl]

'let' @ [55:49] ==> @InlineOnly public inline fun <T, R> AbstractTypeConstructor.let(block: (AbstractTypeConstructor) -> List<KotlinType>): List<KotlinType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractTypeConstructor
    <R> -> List<KotlinType>

'abstractClassifierDescriptor' @ [57:17] ==> value-parameter abstractClassifierDescriptor: AbstractTypeConstructor defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [57:46] ==> public abstract fun invoke(): AbstractTypeConstructor.Supertypes defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'allSupertypes' @ [57:59] ==> public final val allSupertypes: Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.Supertypes[PropertyDescriptorImpl]

'abstractClassifierDescriptor' @ [58:17] ==> value-parameter abstractClassifierDescriptor: AbstractTypeConstructor defined in org.jetbrains.kotlin.types.AbstractTypeConstructor.computeNeighbours.<anonymous>[ValueParameterDescriptorImpl]

'getAdditionalNeighboursInSupertypeGraph' @ [58:46] ==> protected open fun getAdditionalNeighboursInSupertypeGraph(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.AbstractTypeConstructor[SimpleFunctionDescriptorImpl]

'supertypes' @ [59:18] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'emptyList' @ [64:92] ==> public fun <T> emptyList(): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

