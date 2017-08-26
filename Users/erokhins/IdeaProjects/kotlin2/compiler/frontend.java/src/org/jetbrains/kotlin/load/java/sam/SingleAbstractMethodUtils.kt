'samType' @ [34:9] ==> value-parameter samType: SimpleType defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[ValueParameterDescriptorImpl]

'arguments' @ [34:17] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'none' @ [34:27] ==> public inline fun <T> Iterable<TypeProjection>.none(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [34:34] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [34:37] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [34:64] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'samType' @ [34:84] ==> value-parameter samType: SimpleType defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[ValueParameterDescriptorImpl]

'samType' @ [35:22] ==> value-parameter samType: SimpleType defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[ValueParameterDescriptorImpl]

'constructor' @ [35:30] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'parameters' @ [35:42] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'parameters' @ [36:25] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[LocalVariableDescriptor]

'toSet' @ [36:36] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.toSet(): Set<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'samType' @ [38:12] ==> value-parameter samType: SimpleType defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[ValueParameterDescriptorImpl]

'replace' @ [38:20] ==> @JvmOverloads public fun SimpleType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'samType' @ [39:28] ==> value-parameter samType: SimpleType defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[ValueParameterDescriptorImpl]

'arguments' @ [39:36] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'zip' @ [39:46] ==> public infix fun <T, R> Iterable<TypeProjection>.zip(other: Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>): List<Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'parameters' @ [39:50] ==> val parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[LocalVariableDescriptor]

'map' @ [39:62] ==> public inline fun <T, R> Iterable<Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>>.map(transform: (Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TypeProjection, (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>
    <R> -> TypeProjection

'component1' @ [40:22] ==> public final operator fun component1(): TypeProjection defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [40:34] ==> public final operator fun component2(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [40:47] ==> value-parameter it: Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>[ValueParameterDescriptorImpl]

'when {
                    projection.projectionKind == Variance.INVARIANT -> projection

                    projection.isStarProjection ->
                        parameter.upperBounds.first().takeUnless {
                            t -> t.contains { it.constructor.declarationDescriptor in parametersSet }
                        }?.asTypeProjection() ?: return@nonProjectionParametrization null

                    else -> projection.type.asTypeProjection()
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeProjection, entry1: TypeProjection, entry2: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeProjection

'projection' @ [42:21] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>[LocalVariableDescriptor]

'projectionKind' @ [42:32] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [42:59] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'projection' @ [42:72] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>[LocalVariableDescriptor]

'projection' @ [44:21] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>[LocalVariableDescriptor]

'isStarProjection' @ [44:32] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'parameter' @ [45:25] ==> val parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>[LocalVariableDescriptor]

'upperBounds' @ [45:35] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'first' @ [45:47] ==> public fun <T> List<(KotlinType..KotlinType?)>.first(): (KotlinType..KotlinType?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'takeUnless' @ [45:55] ==> @InlineOnly @SinceKotlin public inline fun <T> (KotlinType..KotlinType?).takeUnless(predicate: ((KotlinType..KotlinType?)) -> Boolean): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

't' @ [46:34] ==> value-parameter t: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [46:36] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [46:47] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [46:50] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [46:62] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'parametersSet' @ [46:87] ==> val parametersSet: Set<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization[LocalVariableDescriptor]

'asTypeProjection' @ [47:28] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'projection' @ [49:29] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.load.java.sam.nonProjectionParametrization.<anonymous>[LocalVariableDescriptor]

'type' @ [49:40] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'asTypeProjection' @ [49:45] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

