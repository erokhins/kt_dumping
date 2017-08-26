'DEFAULT' @ [42:35] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [42:43] ==> public abstract fun isSubtypeOf(@NotNull subtype: KotlinType, @NotNull supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'inProjection' @ [42:55] ==> public final val inProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'outProjection' @ [42:69] ==> public final val outProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'assert' @ [46:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isConsistent' @ [46:12] ==> public final val isConsistent: Boolean defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'DescriptorRenderer' @ [47:34] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [47:53] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[SimpleFunctionDescriptorImpl]

'classifierNamePolicy' @ [48:13] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[PropertyDescriptorImpl]

'FULLY_QUALIFIED' @ [48:57] ==> public object FULLY_QUALIFIED : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'+' @ [50:9] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptorRenderer' @ [51:13] ==> val descriptorRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection.<anonymous>[LocalVariableDescriptor]

'render' @ [51:32] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'typeParameter' @ [51:39] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'descriptorRenderer' @ [51:59] ==> val descriptorRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection.<anonymous>[LocalVariableDescriptor]

'renderType' @ [51:78] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'inProjection' @ [51:89] ==> public final val inProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'descriptorRenderer' @ [51:107] ==> val descriptorRenderer: DescriptorRenderer defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection.<anonymous>[LocalVariableDescriptor]

'renderType' @ [51:126] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[SimpleFunctionDescriptorImpl]

'outProjection' @ [51:137] ==> public final val outProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'if (variance == typeParameter.variance) Variance.INVARIANT else variance' @ [54:59] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'variance' @ [54:63] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection.removeProjectionIfRedundant[ValueParameterDescriptorImpl]

'typeParameter' @ [54:75] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'variance' @ [54:89] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [54:108] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'variance' @ [54:123] ==> value-parameter variance: Variance defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection.removeProjectionIfRedundant[ValueParameterDescriptorImpl]

'when {
        inProjection == outProjection -> TypeProjectionImpl(inProjection)
        KotlinBuiltIns.isNothing(inProjection) && typeParameter.variance != Variance.IN_VARIANCE ->
            TypeProjectionImpl(removeProjectionIfRedundant(Variance.OUT_VARIANCE), outProjection)
        KotlinBuiltIns.isNullableAny(outProjection) -> TypeProjectionImpl(removeProjectionIfRedundant(Variance.IN_VARIANCE), inProjection)
        else -> TypeProjectionImpl(removeProjectionIfRedundant(Variance.OUT_VARIANCE), outProjection)
    }' @ [55:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeProjection, entry1: TypeProjection, entry2: TypeProjection, entry3: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeProjection

'inProjection' @ [56:9] ==> public final val inProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'outProjection' @ [56:25] ==> public final val outProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'TypeProjectionImpl' @ [56:42] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'inProjection' @ [56:61] ==> public final val inProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'isNothing' @ [57:24] ==> public open fun isNothing(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'inProjection' @ [57:34] ==> public final val inProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'typeParameter' @ [57:51] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'variance' @ [57:65] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'IN_VARIANCE' @ [57:86] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeProjectionImpl' @ [58:13] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'removeProjectionIfRedundant' @ [58:32] ==> local final fun removeProjectionIfRedundant(variance: Variance): Variance defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection[SimpleFunctionDescriptorImpl]

'OUT_VARIANCE' @ [58:69] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'outProjection' @ [58:84] ==> public final val outProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'isNullableAny' @ [59:24] ==> public open fun isNullableAny(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'outProjection' @ [59:38] ==> public final val outProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'TypeProjectionImpl' @ [59:56] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'removeProjectionIfRedundant' @ [59:75] ==> local final fun removeProjectionIfRedundant(variance: Variance): Variance defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection[SimpleFunctionDescriptorImpl]

'IN_VARIANCE' @ [59:112] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'inProjection' @ [59:126] ==> public final val inProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'TypeProjectionImpl' @ [60:17] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'removeProjectionIfRedundant' @ [60:36] ==> local final fun removeProjectionIfRedundant(variance: Variance): Variance defined in org.jetbrains.kotlin.types.typesApproximation.toTypeProjection[SimpleFunctionDescriptorImpl]

'OUT_VARIANCE' @ [60:73] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'outProjection' @ [60:88] ==> public final val outProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'when (TypeSubstitutor.combine(typeParameter.variance, this)) {
            Variance.INVARIANT -> TypeArgument(typeParameter, type, type)
            Variance.IN_VARIANCE -> TypeArgument(typeParameter, type, typeParameter.builtIns.nullableAnyType)
            Variance.OUT_VARIANCE -> TypeArgument(typeParameter, typeParameter.builtIns.nothingType, type)
        }' @ [65:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeArgument, entry1: TypeArgument, entry2: TypeArgument): TypeArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeArgument

'combine' @ [65:31] ==> @NotNull public open fun combine(@NotNull typeParameterVariance: Variance, @NotNull typeProjection: TypeProjection): Variance defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeParameter' @ [65:39] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.toTypeArgument[ValueParameterDescriptorImpl]

'variance' @ [65:53] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'this' @ [65:63] ==> <this> defined in org.jetbrains.kotlin.types.typesApproximation.toTypeArgument[ReceiverParameterDescriptorImpl]

'INVARIANT' @ [66:22] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeArgument' @ [66:35] ==> public constructor TypeArgument(typeParameter: TypeParameterDescriptor, inProjection: KotlinType, outProjection: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[ClassConstructorDescriptorImpl]

'typeParameter' @ [66:48] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.toTypeArgument[ValueParameterDescriptorImpl]

'type' @ [66:63] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'type' @ [66:69] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'IN_VARIANCE' @ [67:22] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeArgument' @ [67:37] ==> public constructor TypeArgument(typeParameter: TypeParameterDescriptor, inProjection: KotlinType, outProjection: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[ClassConstructorDescriptorImpl]

'typeParameter' @ [67:50] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.toTypeArgument[ValueParameterDescriptorImpl]

'type' @ [67:65] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeParameter' @ [67:71] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.toTypeArgument[ValueParameterDescriptorImpl]

'builtIns' @ [67:85] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'nullableAnyType' @ [67:94] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'OUT_VARIANCE' @ [68:22] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeArgument' @ [68:38] ==> public constructor TypeArgument(typeParameter: TypeParameterDescriptor, inProjection: KotlinType, outProjection: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[ClassConstructorDescriptorImpl]

'typeParameter' @ [68:51] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.toTypeArgument[ValueParameterDescriptorImpl]

'typeParameter' @ [68:66] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.toTypeArgument[ValueParameterDescriptorImpl]

'builtIns' @ [68:80] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'nothingType' @ [68:89] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'type' @ [68:102] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeProjection' @ [72:9] ==> value-parameter typeProjection: TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'typeProjection' @ [73:9] ==> value-parameter typeProjection: TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'isStarProjection' @ [73:24] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'typeProjection' @ [73:49] ==> value-parameter typeProjection: TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'typeProjection' @ [75:16] ==> value-parameter typeProjection: TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'type' @ [75:31] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'!' @ [76:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'contains' @ [76:20] ==> public open fun contains(@Nullable type: KotlinType?, @NotNull isSpecialType: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [76:29] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'it' @ [76:37] ==> value-parameter it: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary.<anonymous>[ValueParameterDescriptorImpl]

'isCaptured' @ [76:40] ==> public fun KotlinType.isCaptured(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'typeProjection' @ [77:16] ==> value-parameter typeProjection: TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'typeProjection' @ [79:29] ==> value-parameter typeProjection: TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'projectionKind' @ [79:44] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'howThisTypeIsUsed' @ [80:9] ==> val howThisTypeIsUsed: Variance defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'OUT_VARIANCE' @ [80:39] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'approximateCapturedTypes' @ [82:29] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'type' @ [82:54] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'TypeProjectionImpl' @ [83:16] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'howThisTypeIsUsed' @ [83:35] ==> val howThisTypeIsUsed: Variance defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'approximation' @ [83:54] ==> val approximation: ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'upper' @ [83:68] ==> public final val upper: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[PropertyDescriptorImpl]

'approximateContravariant' @ [86:9] ==> value-parameter approximateContravariant: Boolean defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'approximateCapturedTypes' @ [88:29] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'type' @ [88:54] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'lower' @ [88:60] ==> public final val lower: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[PropertyDescriptorImpl]

'TypeProjectionImpl' @ [89:16] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'howThisTypeIsUsed' @ [89:35] ==> val howThisTypeIsUsed: Variance defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'approximation' @ [89:54] ==> val approximation: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[LocalVariableDescriptor]

'substituteCapturedTypesWithProjections' @ [92:12] ==> private fun substituteCapturedTypesWithProjections(typeProjection: TypeProjection): TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation in file CapturedTypeApproximation.kt[SimpleFunctionDescriptorImpl]

'typeProjection' @ [92:51] ==> value-parameter typeProjection: TypeProjection? defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypesIfNecessary[ValueParameterDescriptorImpl]

'create' @ [96:43] ==> @NotNull public open fun create(@NotNull substitution: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'TypeConstructorSubstitution' @ [96:59] ==> public constructor TypeConstructorSubstitution() defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[ClassConstructorDescriptorImpl]

'key' @ [98:43] ==> value-parameter key: TypeConstructor defined in org.jetbrains.kotlin.types.typesApproximation.substituteCapturedTypesWithProjections.<no name provided>.get[ValueParameterDescriptorImpl]

'capturedTypeConstructor' @ [99:17] ==> val capturedTypeConstructor: CapturedTypeConstructor defined in org.jetbrains.kotlin.types.typesApproximation.substituteCapturedTypesWithProjections.<no name provided>.get[LocalVariableDescriptor]

'typeProjection' @ [99:41] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'isStarProjection' @ [99:56] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'TypeProjectionImpl' @ [100:24] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'OUT_VARIANCE' @ [100:52] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'capturedTypeConstructor' @ [100:66] ==> val capturedTypeConstructor: CapturedTypeConstructor defined in org.jetbrains.kotlin.types.typesApproximation.substituteCapturedTypesWithProjections.<no name provided>.get[LocalVariableDescriptor]

'typeProjection' @ [100:90] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'type' @ [100:105] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'capturedTypeConstructor' @ [102:20] ==> val capturedTypeConstructor: CapturedTypeConstructor defined in org.jetbrains.kotlin.types.typesApproximation.substituteCapturedTypesWithProjections.<no name provided>.get[LocalVariableDescriptor]

'typeProjection' @ [102:44] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'typeSubstitutor' @ [105:12] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.types.typesApproximation.substituteCapturedTypesWithProjections[LocalVariableDescriptor]

'substituteWithoutApproximation' @ [105:28] ==> @Nullable public open fun substituteWithoutApproximation(@NotNull typeProjection: TypeProjection): TypeProjection? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeProjection' @ [105:59] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.types.typesApproximation.substituteCapturedTypesWithProjections[ValueParameterDescriptorImpl]

'type' @ [110:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'isFlexible' @ [110:14] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'approximateCapturedTypes' @ [111:38] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'type' @ [111:63] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'lowerIfFlexible' @ [111:68] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'approximateCapturedTypes' @ [112:38] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'type' @ [112:63] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'upperIfFlexible' @ [112:68] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'ApproximationBounds' @ [114:16] ==> public constructor ApproximationBounds<out T>(lower: UnwrappedType, upper: UnwrappedType) defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> UnwrappedType

'KotlinTypeFactory' @ [115:17] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types in file KotlinTypeFactory.kt[FakeCallableDescriptorForObject]

'flexibleType' @ [115:35] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'boundsForFlexibleLower' @ [116:25] ==> val boundsForFlexibleLower: ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'lower' @ [116:48] ==> public final val lower: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[PropertyDescriptorImpl]

'lowerIfFlexible' @ [116:54] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'boundsForFlexibleUpper' @ [117:25] ==> val boundsForFlexibleUpper: ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'lower' @ [117:48] ==> public final val lower: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[PropertyDescriptorImpl]

'upperIfFlexible' @ [117:54] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'inheritEnhancement' @ [118:19] ==> public fun UnwrappedType.inheritEnhancement(origin: KotlinType): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'type' @ [118:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'KotlinTypeFactory' @ [119:17] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types in file KotlinTypeFactory.kt[FakeCallableDescriptorForObject]

'flexibleType' @ [119:35] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'boundsForFlexibleLower' @ [120:25] ==> val boundsForFlexibleLower: ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'upper' @ [120:48] ==> public final val upper: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[PropertyDescriptorImpl]

'lowerIfFlexible' @ [120:54] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'boundsForFlexibleUpper' @ [121:24] ==> val boundsForFlexibleUpper: ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'upper' @ [121:47] ==> public final val upper: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[PropertyDescriptorImpl]

'upperIfFlexible' @ [121:53] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'inheritEnhancement' @ [122:19] ==> public fun UnwrappedType.inheritEnhancement(origin: KotlinType): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'type' @ [122:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'type' @ [125:27] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'constructor' @ [125:32] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'type' @ [126:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'isCaptured' @ [126:14] ==> public fun KotlinType.isCaptured(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'typeConstructor' @ [127:31] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'typeProjection' @ [127:75] ==> public final val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor[PropertyDescriptorImpl]

'makeNullableIfNeeded' @ [128:59] ==> @NotNull public open fun makeNullableIfNeeded(@NotNull type: KotlinType, nullable: Boolean): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [128:80] ==> <this> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes.makeNullableIfNeeded[ReceiverParameterDescriptorImpl]

'type' @ [128:86] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [128:91] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'typeProjection' @ [129:21] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'type' @ [129:36] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'makeNullableIfNeeded' @ [129:41] ==> local final fun KotlinType.makeNullableIfNeeded(): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[SimpleFunctionDescriptorImpl]

'when (typeProjection.projectionKind) {
            Variance.IN_VARIANCE -> ApproximationBounds(bound, type.builtIns.nullableAnyType)
            Variance.OUT_VARIANCE -> ApproximationBounds(type.builtIns.nothingType.makeNullableIfNeeded(), bound)
            else -> throw AssertionError("Only nontrivial projections should have been captured, not: $typeProjection")
        }' @ [131:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ApproximationBounds<KotlinType>, entry1: ApproximationBounds<KotlinType>, entry2: ApproximationBounds<KotlinType>): ApproximationBounds<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ApproximationBounds<KotlinType>

'typeProjection' @ [131:22] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'projectionKind' @ [131:37] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'IN_VARIANCE' @ [132:22] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'ApproximationBounds' @ [132:37] ==> public constructor ApproximationBounds<out T>(lower: KotlinType, upper: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> KotlinType

'bound' @ [132:57] ==> val bound: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'type' @ [132:64] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'builtIns' @ [132:69] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[PropertyDescriptorImpl]

'nullableAnyType' @ [132:78] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'OUT_VARIANCE' @ [133:22] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'ApproximationBounds' @ [133:38] ==> public constructor ApproximationBounds<out T>(lower: KotlinType, upper: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> KotlinType

'type' @ [133:58] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'builtIns' @ [133:63] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[PropertyDescriptorImpl]

'nothingType' @ [133:72] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'makeNullableIfNeeded' @ [133:84] ==> local final fun KotlinType.makeNullableIfNeeded(): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[SimpleFunctionDescriptorImpl]

'bound' @ [133:108] ==> val bound: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'AssertionError' @ [134:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'typeProjection' @ [134:104] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'type' @ [137:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'arguments' @ [137:14] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'isEmpty' @ [137:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'type' @ [137:37] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'arguments' @ [137:42] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'size' @ [137:52] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeConstructor' @ [137:60] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'parameters' @ [137:76] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [137:87] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ApproximationBounds' @ [138:16] ==> public constructor ApproximationBounds<out T>(lower: KotlinType, upper: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> KotlinType

'type' @ [138:36] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'type' @ [138:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'ArrayList' @ [140:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeArgument

'ArrayList' @ [141:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeArgument

'component1' @ [142:11] ==> public final operator fun component1(): TypeProjection defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [142:27] ==> public final operator fun component2(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'type' @ [142:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'arguments' @ [142:50] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'zip' @ [142:60] ==> public infix fun <T, R> Iterable<TypeProjection>.zip(other: Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>): List<Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'typeConstructor' @ [142:64] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'parameters' @ [142:80] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'typeProjection' @ [143:28] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'toTypeArgument' @ [143:43] ==> private fun TypeProjection.toTypeArgument(typeParameter: TypeParameterDescriptor): TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'typeParameter' @ [143:58] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'if (typeProjection.isStarProjection) {
            lowerBoundArguments.add(typeArgument)
            upperBoundArguments.add(typeArgument)
        }
        else {
            val (lower, upper) = approximateProjection(typeArgument)
            lowerBoundArguments.add(lower)
            upperBoundArguments.add(upper)
        }' @ [146:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'typeProjection' @ [146:13] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'isStarProjection' @ [146:28] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'lowerBoundArguments' @ [147:13] ==> val lowerBoundArguments: ArrayList<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'add' @ [147:33] ==> public open fun add(element: TypeArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'typeArgument' @ [147:37] ==> val typeArgument: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'upperBoundArguments' @ [148:13] ==> val upperBoundArguments: ArrayList<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'add' @ [148:33] ==> public open fun add(element: TypeArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'typeArgument' @ [148:37] ==> val typeArgument: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'component1' @ [151:18] ==> public final operator fun component1(): TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[SimpleFunctionDescriptorImpl]

'component2' @ [151:25] ==> public final operator fun component2(): TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[SimpleFunctionDescriptorImpl]

'approximateProjection' @ [151:34] ==> private fun approximateProjection(typeArgument: TypeArgument): ApproximationBounds<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'typeArgument' @ [151:56] ==> val typeArgument: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'lowerBoundArguments' @ [152:13] ==> val lowerBoundArguments: ArrayList<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'add' @ [152:33] ==> public open fun add(element: TypeArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'lower' @ [152:37] ==> val lower: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'upperBoundArguments' @ [153:13] ==> val upperBoundArguments: ArrayList<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'add' @ [153:33] ==> public open fun add(element: TypeArgument): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'upper' @ [153:37] ==> val upper: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'lowerBoundArguments' @ [156:31] ==> val lowerBoundArguments: ArrayList<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'any' @ [156:51] ==> public inline fun <T> Iterable<TypeArgument>.any(predicate: (TypeArgument) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeArgument

'!' @ [156:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [156:58] ==> value-parameter it: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes.<anonymous>[ValueParameterDescriptorImpl]

'isConsistent' @ [156:61] ==> public final val isConsistent: Boolean defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'ApproximationBounds' @ [157:12] ==> public constructor ApproximationBounds<out T>(lower: KotlinType, upper: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> KotlinType

'if (lowerBoundIsTrivial) type.builtIns.nothingType else type.replaceTypeArguments(lowerBoundArguments)' @ [158:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'lowerBoundIsTrivial' @ [158:17] ==> val lowerBoundIsTrivial: Boolean defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'type' @ [158:38] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'builtIns' @ [158:43] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[PropertyDescriptorImpl]

'nothingType' @ [158:52] ==> public final val KotlinBuiltIns.nothingType: SimpleType[MyPropertyDescriptor]

'type' @ [158:69] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'replaceTypeArguments' @ [158:74] ==> private fun KotlinType.replaceTypeArguments(newTypeArguments: List<TypeArgument>): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'lowerBoundArguments' @ [158:95] ==> val lowerBoundArguments: ArrayList<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'type' @ [159:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[ValueParameterDescriptorImpl]

'replaceTypeArguments' @ [159:18] ==> private fun KotlinType.replaceTypeArguments(newTypeArguments: List<TypeArgument>): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'upperBoundArguments' @ [159:39] ==> val upperBoundArguments: ArrayList<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.approximateCapturedTypes[LocalVariableDescriptor]

'assert' @ [163:5] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'arguments' @ [163:12] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'size' @ [163:22] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'newTypeArguments' @ [163:30] ==> value-parameter newTypeArguments: List<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.replaceTypeArguments[ValueParameterDescriptorImpl]

'size' @ [163:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'newTypeArguments' @ [163:82] ==> value-parameter newTypeArguments: List<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.replaceTypeArguments[ValueParameterDescriptorImpl]

'replace' @ [164:12] ==> @JvmOverloads public fun KotlinType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.types[SimpleFunctionDescriptorImpl]

'newTypeArguments' @ [164:20] ==> value-parameter newTypeArguments: List<TypeArgument> defined in org.jetbrains.kotlin.types.typesApproximation.replaceTypeArguments[ValueParameterDescriptorImpl]

'map' @ [164:37] ==> public inline fun <T, R> Iterable<TypeArgument>.map(transform: (TypeArgument) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeArgument
    <R> -> TypeProjection

'it' @ [164:43] ==> value-parameter it: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.replaceTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'toTypeProjection' @ [164:46] ==> private fun TypeArgument.toTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typesApproximation in file CapturedTypeApproximation.kt[SimpleFunctionDescriptorImpl]

'component1' @ [168:10] ==> public final operator fun component1(): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[SimpleFunctionDescriptorImpl]

'component2' @ [168:19] ==> public final operator fun component2(): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[SimpleFunctionDescriptorImpl]

'approximateCapturedTypes' @ [168:30] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'typeArgument' @ [168:55] ==> value-parameter typeArgument: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[ValueParameterDescriptorImpl]

'inProjection' @ [168:68] ==> public final val inProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'component1' @ [169:10] ==> public final operator fun component1(): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[SimpleFunctionDescriptorImpl]

'component2' @ [169:20] ==> public final operator fun component2(): KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[SimpleFunctionDescriptorImpl]

'approximateCapturedTypes' @ [169:32] ==> public fun approximateCapturedTypes(type: KotlinType): ApproximationBounds<KotlinType> defined in org.jetbrains.kotlin.types.typesApproximation[SimpleFunctionDescriptorImpl]

'typeArgument' @ [169:57] ==> value-parameter typeArgument: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[ValueParameterDescriptorImpl]

'outProjection' @ [169:70] ==> public final val outProjection: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'ApproximationBounds' @ [170:12] ==> public constructor ApproximationBounds<out T>(lower: TypeArgument, upper: TypeArgument) defined in org.jetbrains.kotlin.types.typesApproximation.ApproximationBounds[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> TypeArgument

'TypeArgument' @ [171:21] ==> public constructor TypeArgument(typeParameter: TypeParameterDescriptor, inProjection: KotlinType, outProjection: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[ClassConstructorDescriptorImpl]

'typeArgument' @ [171:34] ==> value-parameter typeArgument: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[ValueParameterDescriptorImpl]

'typeParameter' @ [171:47] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'inUpper' @ [171:62] ==> val inUpper: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[LocalVariableDescriptor]

'outLower' @ [171:71] ==> val outLower: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[LocalVariableDescriptor]

'TypeArgument' @ [172:21] ==> public constructor TypeArgument(typeParameter: TypeParameterDescriptor, inProjection: KotlinType, outProjection: KotlinType) defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[ClassConstructorDescriptorImpl]

'typeArgument' @ [172:34] ==> value-parameter typeArgument: TypeArgument defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[ValueParameterDescriptorImpl]

'typeParameter' @ [172:47] ==> public final val typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.types.typesApproximation.TypeArgument[PropertyDescriptorImpl]

'inLower' @ [172:62] ==> val inLower: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[LocalVariableDescriptor]

'outUpper' @ [172:71] ==> val outUpper: KotlinType defined in org.jetbrains.kotlin.types.typesApproximation.approximateProjection[LocalVariableDescriptor]

