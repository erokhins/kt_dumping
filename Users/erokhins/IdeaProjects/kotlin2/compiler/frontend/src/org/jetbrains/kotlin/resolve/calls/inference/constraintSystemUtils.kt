'type' @ [28:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedTypeVariables[ValueParameterDescriptorImpl]

'getNestedTypeParameters' @ [28:37] ==> internal fun KotlinType.getNestedTypeParameters(): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'toSet' @ [28:63] ==> public fun <T> Iterable<TypeParameterDescriptor>.toSet(): Set<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'typeVariables' @ [29:12] ==> public abstract val typeVariables: Set<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'filter' @ [29:26] ==> public inline fun <T> Iterable<TypeVariable>.filter(predicate: (TypeVariable) -> Boolean): List<TypeVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'it' @ [29:35] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'originalTypeParameter' @ [29:38] ==> public final val originalTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'nestedTypeParameters' @ [29:63] ==> val nestedTypeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedTypeVariables[LocalVariableDescriptor]

'toBuilder' @ [33:12] ==> public abstract fun toBuilder(filterConstraintPosition: (ConstraintPosition) -> Boolean = ...): ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'!' @ [33:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [33:25] ==> value-parameter it: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.filterConstraintsOut.<anonymous>[ValueParameterDescriptorImpl]

'derivedFrom' @ [33:28] ==> public fun ConstraintPosition.derivedFrom(kind: ConstraintPositionKind): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition in file ConstraintPosition.kt[SimpleFunctionDescriptorImpl]

'excludePositionKind' @ [33:40] ==> value-parameter excludePositionKind: ConstraintPositionKind defined in org.jetbrains.kotlin.resolve.calls.inference.filterConstraintsOut[ValueParameterDescriptorImpl]

'build' @ [33:63] ==> public abstract fun build(): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'typeVariables' @ [37:12] ==> public abstract val typeVariables: Set<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'firstOrNull' @ [37:26] ==> public inline fun <T> Iterable<TypeVariable>.firstOrNull(predicate: (TypeVariable) -> Boolean): TypeVariable? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'it' @ [38:9] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.descriptorToVariable.<anonymous>[ValueParameterDescriptorImpl]

'call' @ [38:12] ==> public final val call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'call' @ [38:20] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.descriptorToVariable[ValueParameterDescriptorImpl]

'it' @ [38:28] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.descriptorToVariable.<anonymous>[ValueParameterDescriptorImpl]

'originalTypeParameter' @ [38:31] ==> public final val originalTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'descriptor' @ [38:56] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.descriptorToVariable[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [39:16] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [39:63] ==> value-parameter descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.descriptorToVariable[ValueParameterDescriptorImpl]

'call' @ [39:82] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.descriptorToVariable[ValueParameterDescriptorImpl]

'ArrayList' @ [43:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeProjection

'ArrayDeque' @ [45:17] ==> public constructor ArrayDeque<E : (Any..Any?)>() defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeProjection

'stack' @ [46:5] ==> val stack: ArrayDeque<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'push' @ [46:11] ==> public open fun push(p0: (TypeProjection..TypeProjection?)): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'TypeProjectionImpl' @ [46:16] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'this' @ [46:35] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[ReceiverParameterDescriptorImpl]

'!' @ [48:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stack' @ [48:13] ==> val stack: ArrayDeque<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'isEmpty' @ [48:19] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'stack' @ [49:30] ==> val stack: ArrayDeque<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'pop' @ [49:36] ==> public open fun pop(): (TypeProjection..TypeProjection?) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'typeProjection' @ [50:13] ==> val typeProjection: (TypeProjection..TypeProjection?) defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'isStarProjection' @ [50:28] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'result' @ [52:9] ==> val result: ArrayList<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'add' @ [52:16] ==> public open fun add(element: TypeProjection): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'typeProjection' @ [52:20] ==> val typeProjection: (TypeProjection..TypeProjection?) defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'typeProjection' @ [54:9] ==> val typeProjection: (TypeProjection..TypeProjection?) defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'type' @ [54:24] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'arguments' @ [54:29] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'forEach' @ [54:39] ==> @HidesMembers public inline fun <T> Iterable<TypeProjection>.forEach(action: (TypeProjection) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'stack' @ [54:49] ==> val stack: ArrayDeque<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'add' @ [54:55] ==> public open fun add(element: (TypeProjection..TypeProjection?)): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'it' @ [54:59] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [56:12] ==> val result: ArrayList<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedArguments[LocalVariableDescriptor]

'getNestedArguments' @ [60:12] ==> internal fun KotlinType.getNestedArguments(): List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'mapNotNull' @ [60:33] ==> public inline fun <T, R : Any> Iterable<TypeProjection>.mapNotNull(transform: (TypeProjection) -> TypeParameterDescriptor?): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R : Any> -> TypeParameterDescriptor

'typeProjection' @ [61:9] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.getNestedTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [61:24] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [61:29] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [61:41] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

