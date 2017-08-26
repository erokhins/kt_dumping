'TypeSubstitution' @ [26:75] ==> public constructor TypeSubstitution() defined in org.jetbrains.kotlin.types.TypeSubstitution[DeserializedClassConstructorDescriptor]

'AnnotationsImpl' @ [27:45] ==> public constructor AnnotationsImpl(annotations: List<AnnotationDescriptor>) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationsImpl[DeserializedClassConstructorDescriptor]

'listOf' @ [27:61] ==> public fun <T> listOf(element: BuiltInAnnotationDescriptor): List<BuiltInAnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BuiltInAnnotationDescriptor

'BuiltInAnnotationDescriptor' @ [28:13] ==> public constructor BuiltInAnnotationDescriptor(builtIns: KotlinBuiltIns, fqName: FqName, allValueArguments: Map<Name, ConstantValue<*>>) defined in org.jetbrains.kotlin.descriptors.annotations.BuiltInAnnotationDescriptor[DeserializedClassConstructorDescriptor]

'builtIns' @ [28:41] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.<init>[ValueParameterDescriptorImpl]

'FQ_NAMES' @ [28:66] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'unsafeVariance' @ [28:75] ==> public final val unsafeVariance: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'emptyMap' @ [28:91] ==> public fun <K, V> emptyMap(): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'mutableListOf' @ [34:35] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<List<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Int>

'IndexedTypeHolder' @ [35:9] ==> public constructor IndexedTypeHolder(type: KotlinType, argumentIndices: List<Int> = ...) defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[ClassConstructorDescriptorImpl]

'topLevelType' @ [35:27] ==> value-parameter topLevelType: KotlinType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.prepareTopLevelType[ValueParameterDescriptorImpl]

'checkTypePosition' @ [35:41] ==> public fun <D : TypeHolder<UnsafeVarianceTypeSubstitution.IndexedTypeHolder>> UnsafeVarianceTypeSubstitution.IndexedTypeHolder.checkTypePosition(position: Variance, reportError: (TypeParameterDescriptor, UnsafeVarianceTypeSubstitution.IndexedTypeHolder, Variance) -> Unit = ..., customVariance: (TypeParameterDescriptor) -> Variance? = ...): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : TypeHolder<D>> -> IndexedTypeHolder

'position' @ [36:17] ==> value-parameter position: Variance defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.prepareTopLevelType[ValueParameterDescriptorImpl]

'unsafeVariancePaths' @ [38:21] ==> val unsafeVariancePaths: MutableList<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.prepareTopLevelType[LocalVariableDescriptor]

'add' @ [38:41] ==> public abstract fun add(element: List<Int>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'indexedTypeHolder' @ [38:45] ==> value-parameter indexedTypeHolder: UnsafeVarianceTypeSubstitution.IndexedTypeHolder defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.prepareTopLevelType.<anonymous>[ValueParameterDescriptorImpl]

'argumentIndices' @ [38:63] ==> public final val argumentIndices: List<Int> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'topLevelType' @ [42:16] ==> value-parameter topLevelType: KotlinType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.prepareTopLevelType[ValueParameterDescriptorImpl]

'unwrap' @ [42:29] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'annotatePartsWithUnsafeVariance' @ [42:38] ==> private final fun UnwrappedType.annotatePartsWithUnsafeVariance(unsafeVariancePaths: Collection<List<Int>>): UnwrappedType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'unsafeVariancePaths' @ [42:70] ==> val unsafeVariancePaths: MutableList<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.prepareTopLevelType[LocalVariableDescriptor]

'unsafeVariancePaths' @ [45:13] ==> value-parameter unsafeVariancePaths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ValueParameterDescriptorImpl]

'isEmpty' @ [45:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'this' @ [45:51] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ReceiverParameterDescriptorImpl]

'when (this) {
            is FlexibleType ->
                KotlinTypeFactory.flexibleType(
                        lowerBound.annotatePartsWithUnsafeVariance(subPathsWithIndex(unsafeVariancePaths, 0)),
                        upperBound.annotatePartsWithUnsafeVariance(subPathsWithIndex(unsafeVariancePaths, 1))
                    ).inheritEnhancement(this)
            is SimpleType -> annotatePartsWithUnsafeVariance(unsafeVariancePaths)
        }' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UnwrappedType, entry1: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UnwrappedType

'this' @ [46:22] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ReceiverParameterDescriptorImpl]

'KotlinTypeFactory' @ [48:17] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'flexibleType' @ [48:35] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [49:25] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'annotatePartsWithUnsafeVariance' @ [49:36] ==> private final fun SimpleType.annotatePartsWithUnsafeVariance(unsafeVariancePaths: Collection<List<Int>>): SimpleType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'subPathsWithIndex' @ [49:68] ==> private final fun subPathsWithIndex(paths: Collection<List<Int>>, index: Int): List<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'unsafeVariancePaths' @ [49:86] ==> value-parameter unsafeVariancePaths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ValueParameterDescriptorImpl]

'upperBound' @ [50:25] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'annotatePartsWithUnsafeVariance' @ [50:36] ==> private final fun SimpleType.annotatePartsWithUnsafeVariance(unsafeVariancePaths: Collection<List<Int>>): SimpleType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'subPathsWithIndex' @ [50:68] ==> private final fun subPathsWithIndex(paths: Collection<List<Int>>, index: Int): List<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'unsafeVariancePaths' @ [50:86] ==> value-parameter unsafeVariancePaths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ValueParameterDescriptorImpl]

'inheritEnhancement' @ [51:23] ==> public fun UnwrappedType.inheritEnhancement(origin: KotlinType): UnwrappedType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'this' @ [51:42] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ReceiverParameterDescriptorImpl]

'annotatePartsWithUnsafeVariance' @ [52:30] ==> private final fun SimpleType.annotatePartsWithUnsafeVariance(unsafeVariancePaths: Collection<List<Int>>): SimpleType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'unsafeVariancePaths' @ [52:62] ==> value-parameter unsafeVariancePaths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ValueParameterDescriptorImpl]

'unsafeVariancePaths' @ [57:13] ==> value-parameter unsafeVariancePaths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ValueParameterDescriptorImpl]

'isEmpty' @ [57:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'this' @ [57:51] ==> <this> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ReceiverParameterDescriptorImpl]

'emptyList' @ [60:13] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'unsafeVariancePaths' @ [60:33] ==> value-parameter unsafeVariancePaths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ValueParameterDescriptorImpl]

'replaceAnnotations' @ [61:20] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'composeAnnotations' @ [61:39] ==> public fun composeAnnotations(first: Annotations, second: Annotations): Annotations defined in org.jetbrains.kotlin.descriptors.annotations[DeserializedSimpleFunctionDescriptor]

'annotations' @ [61:58] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'unsafeVarianceAnnotations' @ [61:71] ==> private final val unsafeVarianceAnnotations: AnnotationsImpl defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[PropertyDescriptorImpl]

'replace' @ [64:16] ==> @JvmOverloads public fun SimpleType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'arguments' @ [64:39] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'withIndex' @ [64:49] ==> public fun <T> Iterable<TypeProjection>.withIndex(): Iterable<IndexedValue<TypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'map' @ [64:61] ==> public inline fun <T, R> Iterable<IndexedValue<TypeProjection>>.map(transform: (IndexedValue<TypeProjection>) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<TypeProjection>
    <R> -> TypeProjection

'component1' @ [65:26] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [65:33] ==> public final operator fun component2(): TypeProjection defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'it' @ [65:45] ==> value-parameter it: IndexedValue<TypeProjection> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [66:25] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance.<anonymous>[LocalVariableDescriptor]

'isStarProjection' @ [66:34] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'argument' @ [66:63] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance.<anonymous>[LocalVariableDescriptor]

'TypeProjectionImpl' @ [67:13] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'argument' @ [68:21] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance.<anonymous>[LocalVariableDescriptor]

'projectionKind' @ [68:30] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'argument' @ [69:21] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance.<anonymous>[LocalVariableDescriptor]

'type' @ [69:30] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [69:35] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'annotatePartsWithUnsafeVariance' @ [69:44] ==> private final fun UnwrappedType.annotatePartsWithUnsafeVariance(unsafeVariancePaths: Collection<List<Int>>): UnwrappedType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'subPathsWithIndex' @ [69:76] ==> private final fun subPathsWithIndex(paths: Collection<List<Int>>, index: Int): List<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution[SimpleFunctionDescriptorImpl]

'unsafeVariancePaths' @ [69:94] ==> value-parameter unsafeVariancePaths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance[ValueParameterDescriptorImpl]

'index' @ [69:115] ==> val index: Int defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.annotatePartsWithUnsafeVariance.<anonymous>[LocalVariableDescriptor]

'paths' @ [73:79] ==> value-parameter paths: Collection<List<Int>> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.subPathsWithIndex[ValueParameterDescriptorImpl]

'filter' @ [73:85] ==> public inline fun <T> Iterable<List<Int>>.filter(predicate: (List<Int>) -> Boolean): List<List<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Int>

'it' @ [73:94] ==> value-parameter it: List<Int> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.subPathsWithIndex.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [73:103] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.subPathsWithIndex[ValueParameterDescriptorImpl]

'map' @ [73:111] ==> public inline fun <T, R> Iterable<List<Int>>.map(transform: (List<Int>) -> List<Int>): List<List<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Int>
    <R> -> List<Int>

'it' @ [73:117] ==> value-parameter it: List<Int> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.subPathsWithIndex.<anonymous>[ValueParameterDescriptorImpl]

'subList' @ [73:120] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<Int> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [73:131] ==> value-parameter it: List<Int> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.subPathsWithIndex.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [73:134] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'emptyList' @ [77:46] ==> public fun <T> emptyList(): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'if (type.isFlexible())
                Pair(
                        IndexedTypeHolder(type.lowerIfFlexible(), argumentIndices + 0),
                        IndexedTypeHolder(type.upperIfFlexible(), argumentIndices + 1))
            else null' @ [80:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<UnsafeVarianceTypeSubstitution.IndexedTypeHolder, UnsafeVarianceTypeSubstitution.IndexedTypeHolder>?, elseBranch: Pair<UnsafeVarianceTypeSubstitution.IndexedTypeHolder, UnsafeVarianceTypeSubstitution.IndexedTypeHolder>?): Pair<UnsafeVarianceTypeSubstitution.IndexedTypeHolder, UnsafeVarianceTypeSubstitution.IndexedTypeHolder>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<IndexedTypeHolder, IndexedTypeHolder>?

'type' @ [80:17] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'isFlexible' @ [80:22] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'Pair' @ [81:17] ==> public constructor Pair<out A, out B>(first: UnsafeVarianceTypeSubstitution.IndexedTypeHolder, second: UnsafeVarianceTypeSubstitution.IndexedTypeHolder) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> IndexedTypeHolder
    <out B> -> IndexedTypeHolder

'IndexedTypeHolder' @ [82:25] ==> public constructor IndexedTypeHolder(type: KotlinType, argumentIndices: List<Int> = ...) defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[ClassConstructorDescriptorImpl]

'type' @ [82:43] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'lowerIfFlexible' @ [82:48] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'argumentIndices' @ [82:67] ==> public final val argumentIndices: List<Int> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'IndexedTypeHolder' @ [83:25] ==> public constructor IndexedTypeHolder(type: KotlinType, argumentIndices: List<Int> = ...) defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[ClassConstructorDescriptorImpl]

'type' @ [83:43] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'upperIfFlexible' @ [83:48] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'argumentIndices' @ [83:67] ==> public final val argumentIndices: List<Int> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'type' @ [87:21] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'arguments' @ [87:26] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'withIndex' @ [87:36] ==> public fun <T> Iterable<TypeProjection>.withIndex(): Iterable<IndexedValue<TypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'map' @ [87:48] ==> public inline fun <T, R> Iterable<IndexedValue<TypeProjection>>.map(transform: (IndexedValue<TypeProjection>) -> <no name provided>): List<<no name provided>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<TypeProjection>
    <R> -> <no name provided>

'component1' @ [89:22] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [89:29] ==> public final operator fun component2(): TypeProjection defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'projectionWithIndex' @ [89:43] ==> value-parameter projectionWithIndex: IndexedValue<TypeProjection> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder.<get-arguments>.<anonymous>[ValueParameterDescriptorImpl]

'projection' @ [92:33] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'type' @ [94:33] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'constructor' @ [94:38] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [94:50] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'index' @ [94:61] ==> val index: Int defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'IndexedTypeHolder' @ [96:33] ==> public constructor IndexedTypeHolder(type: KotlinType, argumentIndices: List<Int> = ...) defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[ClassConstructorDescriptorImpl]

'projection' @ [96:51] ==> val projection: TypeProjection defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'type' @ [96:62] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'argumentIndices' @ [96:68] ==> public final val argumentIndices: List<Int> defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder[PropertyDescriptorImpl]

'index' @ [96:86] ==> val index: Int defined in org.jetbrains.kotlin.load.kotlin.UnsafeVarianceTypeSubstitution.IndexedTypeHolder.<get-arguments>.<anonymous>[LocalVariableDescriptor]

