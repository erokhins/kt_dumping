'assert' @ [36:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'typeProjection' @ [36:16] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'projectionKind' @ [36:31] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [36:58] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'typeProjection' @ [37:65] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'listOf' @ [41:67] ==> @InlineOnly public inline fun <T> listOf(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'if (typeProjection.projectionKind == Variance.OUT_VARIANCE)
            typeProjection.type
        else
            builtIns.nullableAnyType' @ [44:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'typeProjection' @ [44:29] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'projectionKind' @ [44:44] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'OUT_VARIANCE' @ [44:71] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'typeProjection' @ [45:13] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'type' @ [45:28] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'builtIns' @ [47:13] ==> public final val CapturedTypeConstructor.builtIns: KotlinBuiltIns[MyPropertyDescriptor]

'nullableAnyType' @ [47:22] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'listOf' @ [48:16] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'superType' @ [48:23] ==> val superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor.getSupertypes[LocalVariableDescriptor]

'typeProjection' @ [57:57] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'typeProjection' @ [59:50] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'type' @ [59:65] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [59:70] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'builtIns' @ [59:82] ==> public final val TypeConstructor.builtIns: KotlinBuiltIns[MyPropertyDescriptor]

'CapturedTypeConstructor' @ [64:61] ==> public constructor CapturedTypeConstructor(typeProjection: TypeProjection) defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[ClassConstructorDescriptorImpl]

'typeProjection' @ [64:85] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType.<init>[ValueParameterDescriptorImpl]

'Annotations' @ [66:49] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [66:61] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'SimpleType' @ [67:4] ==> public constructor SimpleType() defined in org.jetbrains.kotlin.types.SimpleType[ClassConstructorDescriptorImpl]

'listOf' @ [69:17] ==> @InlineOnly public inline fun <T> listOf(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'createErrorScope' @ [72:28] ==> @NotNull public open fun createErrorScope(@NotNull debugMessage: String, throwExceptions: Boolean): MemberScope defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'representative' @ [76:17] ==> private final fun representative(variance: Variance, default: KotlinType): KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[SimpleFunctionDescriptorImpl]

'OUT_VARIANCE' @ [76:32] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'builtIns' @ [76:46] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[PropertyDescriptorImpl]

'nullableAnyType' @ [76:55] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'representative' @ [79:17] ==> private final fun representative(variance: Variance, default: KotlinType): KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[SimpleFunctionDescriptorImpl]

'IN_VARIANCE' @ [79:32] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'builtIns' @ [79:45] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[PropertyDescriptorImpl]

'nothingType' @ [79:54] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'if (typeProjection.projectionKind == variance) typeProjection.type else default' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'typeProjection' @ [82:13] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'projectionKind' @ [82:28] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'variance' @ [82:46] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType.representative[ValueParameterDescriptorImpl]

'typeProjection' @ [82:56] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'type' @ [82:71] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'default' @ [82:81] ==> value-parameter default: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType.representative[ValueParameterDescriptorImpl]

'constructor' @ [84:58] ==> public open val constructor: CapturedTypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'type' @ [84:74] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType.sameTypeConstructor[ValueParameterDescriptorImpl]

'constructor' @ [84:79] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'+' @ [86:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeProjection' @ [86:42] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'if (isMarkedNullable) "?" else ""' @ [86:61] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isMarkedNullable' @ [86:65] ==> public open val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'newNullability' @ [89:13] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [89:31] ==> public open val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'this' @ [89:56] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[LazyClassReceiverParameterDescriptor]

'CapturedType' @ [90:16] ==> public constructor CapturedType(typeProjection: TypeProjection, constructor: CapturedTypeConstructor = ..., isMarkedNullable: Boolean = ..., annotations: Annotations = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[ClassConstructorDescriptorImpl]

'typeProjection' @ [90:29] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'constructor' @ [90:45] ==> public open val constructor: CapturedTypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'newNullability' @ [90:58] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'annotations' @ [90:74] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'CapturedType' @ [93:82] ==> public constructor CapturedType(typeProjection: TypeProjection, constructor: CapturedTypeConstructor = ..., isMarkedNullable: Boolean = ..., annotations: Annotations = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[ClassConstructorDescriptorImpl]

'typeProjection' @ [93:95] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'constructor' @ [93:111] ==> public open val constructor: CapturedTypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'isMarkedNullable' @ [93:124] ==> public open val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[PropertyDescriptorImpl]

'newAnnotations' @ [93:142] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType.replaceAnnotations[ValueParameterDescriptorImpl]

'CapturedType' @ [97:11] ==> public constructor CapturedType(typeProjection: TypeProjection, constructor: CapturedTypeConstructor = ..., isMarkedNullable: Boolean = ..., annotations: Annotations = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedType[ClassConstructorDescriptorImpl]

'typeProjection' @ [97:24] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.createCapturedType[ValueParameterDescriptorImpl]

'constructor' @ [99:40] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'if (this is IndexedParametersSubstitution)
        IndexedParametersSubstitution(
                this.parameters,
                this.arguments.zip(this.parameters).map {
                    it.first.createCapturedIfNeeded(it.second)
                }.toTypedArray(),
                approximateCapturedTypes = needApproximation)
    else
        object : DelegatedTypeSubstitution(this@wrapWithCapturingSubstitution) {
            override fun approximateContravariantCapturedTypes() = needApproximation
            override fun get(key: KotlinType) = super.get(key)?.createCapturedIfNeeded(key.constructor.declarationDescriptor as? TypeParameterDescriptor)
        }' @ [102:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeSubstitution, elseBranch: TypeSubstitution): TypeSubstitution[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeSubstitution

'this' @ [102:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution[ReceiverParameterDescriptorImpl]

'IndexedParametersSubstitution' @ [103:9] ==> public constructor IndexedParametersSubstitution(parameters: Array<TypeParameterDescriptor>, arguments: Array<TypeProjection>, approximateCapturedTypes: Boolean = ...) defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[ClassConstructorDescriptorImpl]

'this' @ [104:17] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution[ReceiverParameterDescriptorImpl]

'parameters' @ [104:22] ==> public final val parameters: Array<TypeParameterDescriptor> defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[PropertyDescriptorImpl]

'this' @ [105:17] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution[ReceiverParameterDescriptorImpl]

'arguments' @ [105:22] ==> public final val arguments: Array<TypeProjection> defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[PropertyDescriptorImpl]

'zip' @ [105:32] ==> public infix fun <T, R> Array<out TypeProjection>.zip(other: Array<out TypeParameterDescriptor>): List<Pair<TypeProjection, TypeParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeParameterDescriptor

'this' @ [105:36] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution[ReceiverParameterDescriptorImpl]

'parameters' @ [105:41] ==> public final val parameters: Array<TypeParameterDescriptor> defined in org.jetbrains.kotlin.types.IndexedParametersSubstitution[PropertyDescriptorImpl]

'map' @ [105:53] ==> public inline fun <T, R> Iterable<Pair<TypeProjection, TypeParameterDescriptor>>.map(transform: (Pair<TypeProjection, TypeParameterDescriptor>) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TypeProjection, TypeParameterDescriptor>
    <R> -> TypeProjection

'it' @ [106:21] ==> value-parameter it: Pair<TypeProjection, TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [106:24] ==> public final val first: TypeProjection defined in kotlin.Pair[DeserializedPropertyDescriptor]

'createCapturedIfNeeded' @ [106:30] ==> private fun TypeProjection.createCapturedIfNeeded(typeParameterDescriptor: TypeParameterDescriptor?): TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'it' @ [106:53] ==> value-parameter it: Pair<TypeProjection, TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [106:56] ==> public final val second: TypeParameterDescriptor defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toTypedArray' @ [107:19] ==> public inline fun <reified T> Collection<TypeProjection>.toTypedArray(): Array<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> TypeProjection

'needApproximation' @ [108:44] ==> value-parameter needApproximation: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution[ValueParameterDescriptorImpl]

'DelegatedTypeSubstitution' @ [110:18] ==> public constructor DelegatedTypeSubstitution(substitution: TypeSubstitution) defined in org.jetbrains.kotlin.types.DelegatedTypeSubstitution[ClassConstructorDescriptorImpl]

'this@wrapWithCapturingSubstitution' @ [110:44] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution[ReceiverParameterDescriptorImpl]

'needApproximation' @ [111:68] ==> value-parameter needApproximation: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution[ValueParameterDescriptorImpl]

'super' @ [112:49] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution.<no name provided>[LazyClassReceiverParameterDescriptor]

'get' @ [112:55] ==> public open fun get(key: KotlinType): TypeProjection? defined in org.jetbrains.kotlin.types.DelegatedTypeSubstitution[SimpleFunctionDescriptorImpl]

'key' @ [112:59] ==> value-parameter key: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution.<no name provided>.get[ValueParameterDescriptorImpl]

'createCapturedIfNeeded' @ [112:65] ==> private fun TypeProjection.createCapturedIfNeeded(typeParameterDescriptor: TypeParameterDescriptor?): TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'key' @ [112:88] ==> value-parameter key: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.wrapWithCapturingSubstitution.<no name provided>.get[ValueParameterDescriptorImpl]

'constructor' @ [112:92] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [112:104] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'typeParameterDescriptor' @ [116:9] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.inference.createCapturedIfNeeded[ValueParameterDescriptorImpl]

'projectionKind' @ [116:44] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [116:71] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'this' @ [116:89] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.createCapturedIfNeeded[ReceiverParameterDescriptorImpl]

'typeParameterDescriptor' @ [119:9] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.inference.createCapturedIfNeeded[ValueParameterDescriptorImpl]

'variance' @ [119:33] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'projectionKind' @ [119:45] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'if (isStarProjection)
            TypeProjectionImpl(LazyWrappedType(LockBasedStorageManager.NO_LOCKS) {
                this@createCapturedIfNeeded.type
            })
        else
            TypeProjectionImpl(this@createCapturedIfNeeded.type)' @ [121:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'isStarProjection' @ [121:20] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'TypeProjectionImpl' @ [122:13] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'LazyWrappedType' @ [122:32] ==> public constructor LazyWrappedType(storageManager: StorageManager, computation: () -> KotlinType) defined in org.jetbrains.kotlin.types.LazyWrappedType[ClassConstructorDescriptorImpl]

'NO_LOCKS' @ [122:72] ==> public final val NO_LOCKS: (StorageManager..StorageManager?) defined in org.jetbrains.kotlin.storage.LockBasedStorageManager[JavaPropertyDescriptor]

'this@createCapturedIfNeeded' @ [123:17] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.createCapturedIfNeeded[ReceiverParameterDescriptorImpl]

'type' @ [123:45] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'TypeProjectionImpl' @ [126:13] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'this@createCapturedIfNeeded' @ [126:32] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.createCapturedIfNeeded[ReceiverParameterDescriptorImpl]

'type' @ [126:60] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'TypeProjectionImpl' @ [129:12] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'createCapturedType' @ [129:31] ==> public fun createCapturedType(typeProjection: TypeProjection): KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'this' @ [129:50] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.createCapturedIfNeeded[ReceiverParameterDescriptorImpl]

