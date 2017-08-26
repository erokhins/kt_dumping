'unwrap' @ [44:67] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'enhancePossiblyFlexible' @ [44:76] ==> private fun UnwrappedType.enhancePossiblyFlexible(qualifiers: (Int) -> JavaTypeQualifiers, index: Int): Result defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'qualifiers' @ [44:100] ==> value-parameter qualifiers: (Int) -> JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhance[ValueParameterDescriptorImpl]

'typeIfChanged' @ [44:115] ==> public final val typeIfChanged: KotlinType? defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[PropertyDescriptorImpl]

'annotations' @ [47:11] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'findAnnotation' @ [47:23] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'ENHANCED_NULLABILITY_ANNOTATION' @ [47:57] ==> public final val ENHANCED_NULLABILITY_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'type' @ [56:44] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[PropertyDescriptorImpl]

'takeIf' @ [56:49] ==> @InlineOnly @SinceKotlin public inline fun <T> KotlinType.takeIf(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'wereChanges' @ [56:58] ==> public final val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[PropertyDescriptorImpl]

'Result' @ [59:100] ==> public constructor Result(type: KotlinType, subtreeSize: Int, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[ClassConstructorDescriptorImpl]

'type' @ [59:107] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult.<init>[ValueParameterDescriptorImpl]

'subtreeSize' @ [59:113] ==> value-parameter subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult.<init>[ValueParameterDescriptorImpl]

'wereChanges' @ [59:126] ==> value-parameter wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult.<init>[ValueParameterDescriptorImpl]

'isError' @ [62:9] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'Result' @ [62:25] ==> public constructor Result(type: KotlinType, subtreeSize: Int, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[ClassConstructorDescriptorImpl]

'this' @ [62:32] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ReceiverParameterDescriptorImpl]

'when(this) {
        is FlexibleType -> {
            val lowerResult = lowerBound.enhanceInflexible(qualifiers, index, TypeComponentPosition.FLEXIBLE_LOWER)
            val upperResult = upperBound.enhanceInflexible(qualifiers, index, TypeComponentPosition.FLEXIBLE_UPPER)
            assert(lowerResult.subtreeSize == upperResult.subtreeSize) {
                "Different tree sizes of bounds: " +
                "lower = ($lowerBound, ${lowerResult.subtreeSize}), " +
                "upper = ($upperBound, ${upperResult.subtreeSize})"
            }

            val wereChanges = lowerResult.wereChanges || upperResult.wereChanges
            val enhancement = lowerResult.type.getEnhancement() ?: upperResult.type.getEnhancement()
            val type = if (!wereChanges) this@enhancePossiblyFlexible
                else when {
                    this is RawTypeImpl -> RawTypeImpl(lowerResult.type, upperResult.type)
                    else -> KotlinTypeFactory.flexibleType(lowerResult.type, upperResult.type)
                }.wrapEnhancement(enhancement)

            Result(
                type,
                lowerResult.subtreeSize,
                wereChanges
            )
        }
        is SimpleType -> enhanceInflexible(qualifiers, index, TypeComponentPosition.INFLEXIBLE)
    }' @ [63:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Result, entry1: Result): Result[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Result

'this' @ [63:17] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ReceiverParameterDescriptorImpl]

'lowerBound' @ [65:31] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'enhanceInflexible' @ [65:42] ==> private fun SimpleType.enhanceInflexible(qualifiers: (Int) -> JavaTypeQualifiers, index: Int, position: TypeComponentPosition): SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'qualifiers' @ [65:60] ==> value-parameter qualifiers: (Int) -> JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ValueParameterDescriptorImpl]

'index' @ [65:72] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ValueParameterDescriptorImpl]

'FLEXIBLE_LOWER' @ [65:101] ==> enum entry FLEXIBLE_LOWER defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeComponentPosition[FakeCallableDescriptorForObject]

'upperBound' @ [66:31] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'enhanceInflexible' @ [66:42] ==> private fun SimpleType.enhanceInflexible(qualifiers: (Int) -> JavaTypeQualifiers, index: Int, position: TypeComponentPosition): SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'qualifiers' @ [66:60] ==> value-parameter qualifiers: (Int) -> JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ValueParameterDescriptorImpl]

'index' @ [66:72] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ValueParameterDescriptorImpl]

'FLEXIBLE_UPPER' @ [66:101] ==> enum entry FLEXIBLE_UPPER defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeComponentPosition[FakeCallableDescriptorForObject]

'assert' @ [67:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lowerResult' @ [67:20] ==> val lowerResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'subtreeSize' @ [67:32] ==> public final val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'upperResult' @ [67:47] ==> val upperResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'subtreeSize' @ [67:59] ==> public final val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'+' @ [68:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'lowerBound' @ [69:28] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'lowerResult' @ [69:42] ==> val lowerResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'subtreeSize' @ [69:54] ==> public final val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'upperBound' @ [70:28] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'upperResult' @ [70:42] ==> val upperResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'subtreeSize' @ [70:54] ==> public final val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'lowerResult' @ [73:31] ==> val lowerResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'wereChanges' @ [73:43] ==> public final val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'upperResult' @ [73:58] ==> val upperResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'wereChanges' @ [73:70] ==> public final val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'lowerResult' @ [74:31] ==> val lowerResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'type' @ [74:43] ==> public open val type: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'getEnhancement' @ [74:48] ==> public fun KotlinType.getEnhancement(): KotlinType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'upperResult' @ [74:68] ==> val upperResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'type' @ [74:80] ==> public open val type: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'getEnhancement' @ [74:85] ==> public fun KotlinType.getEnhancement(): KotlinType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'if (!wereChanges) this@enhancePossiblyFlexible
                else when {
                    this is RawTypeImpl -> RawTypeImpl(lowerResult.type, upperResult.type)
                    else -> KotlinTypeFactory.flexibleType(lowerResult.type, upperResult.type)
                }.wrapEnhancement(enhancement)' @ [75:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType, elseBranch: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType

'!' @ [75:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'wereChanges' @ [75:29] ==> val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'this@enhancePossiblyFlexible' @ [75:42] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ReceiverParameterDescriptorImpl]

'when {
                    this is RawTypeImpl -> RawTypeImpl(lowerResult.type, upperResult.type)
                    else -> KotlinTypeFactory.flexibleType(lowerResult.type, upperResult.type)
                }' @ [76:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UnwrappedType, entry1: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UnwrappedType

'this' @ [77:21] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ReceiverParameterDescriptorImpl]

'RawTypeImpl' @ [77:44] ==> public constructor RawTypeImpl(lowerBound: SimpleType, upperBound: SimpleType) defined in org.jetbrains.kotlin.load.java.lazy.types.RawTypeImpl[ClassConstructorDescriptorImpl]

'lowerResult' @ [77:56] ==> val lowerResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'type' @ [77:68] ==> public open val type: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'upperResult' @ [77:74] ==> val upperResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'type' @ [77:86] ==> public open val type: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'flexibleType' @ [78:47] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'lowerResult' @ [78:60] ==> val lowerResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'type' @ [78:72] ==> public open val type: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'upperResult' @ [78:78] ==> val upperResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'type' @ [78:90] ==> public open val type: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'wrapEnhancement' @ [79:19] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'enhancement' @ [79:35] ==> val enhancement: KotlinType? defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'Result' @ [81:13] ==> public constructor Result(type: KotlinType, subtreeSize: Int, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[ClassConstructorDescriptorImpl]

'type' @ [82:17] ==> val type: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'lowerResult' @ [83:17] ==> val lowerResult: SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'subtreeSize' @ [83:29] ==> public final val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[PropertyDescriptorImpl]

'wereChanges' @ [84:17] ==> val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[LocalVariableDescriptor]

'enhanceInflexible' @ [87:26] ==> private fun SimpleType.enhanceInflexible(qualifiers: (Int) -> JavaTypeQualifiers, index: Int, position: TypeComponentPosition): SimpleResult defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'qualifiers' @ [87:44] ==> value-parameter qualifiers: (Int) -> JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ValueParameterDescriptorImpl]

'index' @ [87:56] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancePossiblyFlexible[ValueParameterDescriptorImpl]

'INFLEXIBLE' @ [87:85] ==> enum entry INFLEXIBLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeComponentPosition[FakeCallableDescriptorForObject]

'position' @ [92:25] ==> value-parameter position: TypeComponentPosition defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ValueParameterDescriptorImpl]

'shouldEnhance' @ [92:34] ==> private fun TypeComponentPosition.shouldEnhance(): Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'!' @ [93:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldEnhance' @ [93:10] ==> val shouldEnhance: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'arguments' @ [93:27] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'isEmpty' @ [93:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'SimpleResult' @ [93:55] ==> public constructor SimpleResult(type: SimpleType, subtreeSize: Int, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[ClassConstructorDescriptorImpl]

'this' @ [93:68] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ReceiverParameterDescriptorImpl]

'constructor' @ [95:25] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [95:37] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'SimpleResult' @ [96:35] ==> public constructor SimpleResult(type: SimpleType, subtreeSize: Int, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[ClassConstructorDescriptorImpl]

'this' @ [96:48] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ReceiverParameterDescriptorImpl]

'invoke' @ [98:31] ==> public abstract operator fun invoke(p1: Int): JavaTypeQualifiers defined in kotlin.Function1[FunctionInvokeDescriptor]

'index' @ [98:42] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ValueParameterDescriptorImpl]

'component1' @ [99:10] ==> public final operator fun component1(): ClassifierDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancementResult[SimpleFunctionDescriptorImpl]

'component2' @ [99:30] ==> public final operator fun component2(): Annotations? defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancementResult[SimpleFunctionDescriptorImpl]

'originalClass' @ [99:63] ==> val originalClass: ClassifierDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhanceMutability' @ [99:77] ==> private fun ClassifierDescriptor.enhanceMutability(qualifiers: JavaTypeQualifiers, position: TypeComponentPosition): EnhancementResult<ClassifierDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'effectiveQualifiers' @ [99:95] ==> val effectiveQualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'position' @ [99:116] ==> value-parameter position: TypeComponentPosition defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ValueParameterDescriptorImpl]

'enhancedClassifier' @ [101:27] ==> val enhancedClassifier: ClassifierDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'typeConstructor' @ [101:46] ==> public final val ClassifierDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'index' @ [103:26] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ValueParameterDescriptorImpl]

'enhancedMutabilityAnnotations' @ [104:23] ==> val enhancedMutabilityAnnotations: Annotations? defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'arguments' @ [105:29] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'mapIndexed' @ [105:39] ==> public inline fun <T, R> Iterable<TypeProjection>.mapIndexed(transform: (index: Int, TypeProjection) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjection

'if (arg.isStarProjection) {
            globalArgIndex++
            TypeUtils.makeStarProjection(enhancedClassifier.typeConstructor.parameters[localArgIndex])
        }
        else {
            val enhanced = arg.type.unwrap().enhancePossiblyFlexible(qualifiers, globalArgIndex)
            wereChanges = wereChanges || enhanced.wereChanges
            globalArgIndex += enhanced.subtreeSize
            createProjection(enhanced.type, arg.projectionKind, typeParameterDescriptor = typeConstructor.parameters[localArgIndex])
        }' @ [107:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'arg' @ [107:13] ==> value-parameter arg: TypeProjection defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [107:17] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'globalArgIndex' @ [108:13] ==> var globalArgIndex: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'makeStarProjection' @ [109:23] ==> @NotNull public open fun makeStarProjection(@NotNull p0: TypeParameterDescriptor): TypeProjection defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'enhancedClassifier' @ [109:42] ==> val enhancedClassifier: ClassifierDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'typeConstructor' @ [109:61] ==> public final val ClassifierDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [109:77] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'localArgIndex' @ [109:88] ==> value-parameter localArgIndex: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[ValueParameterDescriptorImpl]

'arg' @ [112:28] ==> value-parameter arg: TypeProjection defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [112:32] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [112:37] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'enhancePossiblyFlexible' @ [112:46] ==> private fun UnwrappedType.enhancePossiblyFlexible(qualifiers: (Int) -> JavaTypeQualifiers, index: Int): Result defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'qualifiers' @ [112:70] ==> value-parameter qualifiers: (Int) -> JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ValueParameterDescriptorImpl]

'globalArgIndex' @ [112:82] ==> var globalArgIndex: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'wereChanges' @ [113:13] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'wereChanges' @ [113:27] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhanced' @ [113:42] ==> val enhanced: Result defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[LocalVariableDescriptor]

'wereChanges' @ [113:51] ==> public final val wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[PropertyDescriptorImpl]

'globalArgIndex' @ [114:13] ==> var globalArgIndex: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhanced' @ [114:31] ==> val enhanced: Result defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[LocalVariableDescriptor]

'subtreeSize' @ [114:40] ==> public final val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[PropertyDescriptorImpl]

'createProjection' @ [115:13] ==> public fun createProjection(type: KotlinType, projectionKind: Variance, typeParameterDescriptor: TypeParameterDescriptor?): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'enhanced' @ [115:30] ==> val enhanced: Result defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[LocalVariableDescriptor]

'type' @ [115:39] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.Result[PropertyDescriptorImpl]

'arg' @ [115:45] ==> value-parameter arg: TypeProjection defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [115:49] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'typeConstructor' @ [115:91] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'parameters' @ [115:107] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'localArgIndex' @ [115:118] ==> value-parameter localArgIndex: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [119:10] ==> public final operator fun component1(): Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancementResult[SimpleFunctionDescriptorImpl]

'component2' @ [119:31] ==> public final operator fun component2(): Annotations? defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancementResult[SimpleFunctionDescriptorImpl]

'this' @ [119:65] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ReceiverParameterDescriptorImpl]

'getEnhancedNullability' @ [119:70] ==> private fun KotlinType.getEnhancedNullability(qualifiers: JavaTypeQualifiers, position: TypeComponentPosition): EnhancementResult<Boolean> defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'effectiveQualifiers' @ [119:93] ==> val effectiveQualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'position' @ [119:114] ==> value-parameter position: TypeComponentPosition defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ValueParameterDescriptorImpl]

'wereChanges' @ [120:5] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'wereChanges' @ [120:19] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhancedNullabilityAnnotations' @ [120:34] ==> val enhancedNullabilityAnnotations: Annotations? defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'globalArgIndex' @ [122:23] ==> var globalArgIndex: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'index' @ [122:40] ==> value-parameter index: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ValueParameterDescriptorImpl]

'!' @ [123:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'wereChanges' @ [123:10] ==> var wereChanges: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'SimpleResult' @ [123:30] ==> public constructor SimpleResult(type: SimpleType, subtreeSize: Int, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[ClassConstructorDescriptorImpl]

'this' @ [123:43] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[ReceiverParameterDescriptorImpl]

'subtreeSize' @ [123:49] ==> val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'listOf' @ [125:26] ==> public fun <T> listOf(vararg elements: Annotations?): List<Annotations?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations?

'annotations' @ [126:13] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'enhancedMutabilityAnnotations' @ [127:13] ==> val enhancedMutabilityAnnotations: Annotations? defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhancedNullabilityAnnotations' @ [128:13] ==> val enhancedNullabilityAnnotations: Annotations? defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'filterNotNull' @ [129:7] ==> public fun <T : Any> Iterable<Annotations?>.filterNotNull(): List<Annotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Annotations

'compositeAnnotationsOrSingle' @ [129:23] ==> private fun List<Annotations>.compositeAnnotationsOrSingle(): Annotations defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'KotlinTypeFactory' @ [131:24] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [131:42] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'newAnnotations' @ [132:13] ==> val newAnnotations: Annotations defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'typeConstructor' @ [133:13] ==> val typeConstructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhancedArguments' @ [134:13] ==> val enhancedArguments: List<TypeProjection> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhancedNullability' @ [135:13] ==> val enhancedNullability: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'if (effectiveQualifiers.isNotNullTypeParameter) NotNullTypeParameter(enhancedType) else enhancedType' @ [138:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'effectiveQualifiers' @ [138:27] ==> val effectiveQualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'isNotNullTypeParameter' @ [138:47] ==> internal final val isNotNullTypeParameter: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'NotNullTypeParameter' @ [138:71] ==> public constructor NotNullTypeParameter(delegate: SimpleType) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[ClassConstructorDescriptorImpl]

'enhancedType' @ [138:92] ==> val enhancedType: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhancedType' @ [138:111] ==> val enhancedType: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhancedNullabilityAnnotations' @ [139:33] ==> val enhancedNullabilityAnnotations: Annotations? defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'effectiveQualifiers' @ [139:75] ==> val effectiveQualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'isNullabilityQualifierForWarning' @ [139:95] ==> internal final val isNullabilityQualifierForWarning: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'if (nullabilityForWarning) wrapEnhancement(enhancement) else enhancement' @ [140:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType, elseBranch: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType

'nullabilityForWarning' @ [140:22] ==> val nullabilityForWarning: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'wrapEnhancement' @ [140:45] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'enhancement' @ [140:61] ==> val enhancement: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'enhancement' @ [140:79] ==> val enhancement: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'SimpleResult' @ [142:12] ==> public constructor SimpleResult(type: SimpleType, subtreeSize: Int, wereChanges: Boolean) defined in org.jetbrains.kotlin.load.java.typeEnhancement.SimpleResult[ClassConstructorDescriptorImpl]

'result' @ [142:25] ==> val result: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'subtreeSize' @ [142:47] ==> val subtreeSize: Int defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceInflexible[LocalVariableDescriptor]

'when (size) {
    0 -> error("At least one Annotations object expected")
    1 -> single()
    else -> CompositeAnnotations(this.toList())
}' @ [145:64] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Annotations, entry1: Annotations, entry2: Annotations): Annotations[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Annotations

'size' @ [145:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'error' @ [146:10] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'single' @ [147:10] ==> public fun <T> List<Annotations>.single(): Annotations defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'CompositeAnnotations' @ [148:13] ==> public constructor CompositeAnnotations(delegates: List<Annotations>) defined in org.jetbrains.kotlin.descriptors.annotations.CompositeAnnotations[DeserializedClassConstructorDescriptor]

'this' @ [148:34] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.compositeAnnotationsOrSingle[ReceiverParameterDescriptorImpl]

'toList' @ [148:39] ==> public fun <T> Iterable<Annotations>.toList(): List<Annotations> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations

'this' @ [151:53] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.shouldEnhance[ReceiverParameterDescriptorImpl]

'INFLEXIBLE' @ [151:83] ==> enum entry INFLEXIBLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeComponentPosition[FakeCallableDescriptorForObject]

'EnhancementResult' @ [154:32] ==> public constructor EnhancementResult<out T>(result: T, enhancementAnnotations: Annotations?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancementResult[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'this' @ [154:50] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.noChange[ReceiverParameterDescriptorImpl]

'EnhancementResult' @ [155:43] ==> public constructor EnhancementResult<out T>(result: T, enhancementAnnotations: Annotations?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancementResult[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'this' @ [155:61] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancedNullability[ReceiverParameterDescriptorImpl]

'ENHANCED_NULLABILITY_ANNOTATIONS' @ [155:67] ==> private val ENHANCED_NULLABILITY_ANNOTATIONS: EnhancedTypeAnnotations defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[PropertyDescriptorImpl]

'EnhancementResult' @ [156:42] ==> public constructor EnhancementResult<out T>(result: T, enhancementAnnotations: Annotations?) defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancementResult[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'this' @ [156:60] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhancedMutability[ReceiverParameterDescriptorImpl]

'ENHANCED_MUTABILITY_ANNOTATIONS' @ [156:66] ==> private val ENHANCED_MUTABILITY_ANNOTATIONS: EnhancedTypeAnnotations defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[PropertyDescriptorImpl]

'!' @ [159:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'position' @ [159:10] ==> value-parameter position: TypeComponentPosition defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ValueParameterDescriptorImpl]

'shouldEnhance' @ [159:19] ==> private fun TypeComponentPosition.shouldEnhance(): Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'this' @ [159:43] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'noChange' @ [159:48] ==> private fun <T> ClassifierDescriptor.noChange(): EnhancementResult<ClassifierDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassifierDescriptor

'this' @ [160:9] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'this' @ [160:42] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'noChange' @ [160:47] ==> private fun <T> ClassifierDescriptor.noChange(): EnhancementResult<ClassifierDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassifierDescriptor

'JavaToKotlinClassMap' @ [162:19] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform in file JavaToKotlinClassMap.kt[FakeCallableDescriptorForObject]

'when (qualifiers.mutability) {
        READ_ONLY -> {
            if (position == TypeComponentPosition.FLEXIBLE_LOWER && mapping.isMutable(this)) {
                return mapping.convertMutableToReadOnly(this).enhancedMutability()
            }
        }
        MUTABLE -> {
            if (position == TypeComponentPosition.FLEXIBLE_UPPER && mapping.isReadOnly(this) ) {
                return mapping.convertReadOnlyToMutable(this).enhancedMutability()
            }
        }
    }' @ [164:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'qualifiers' @ [164:11] ==> value-parameter qualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ValueParameterDescriptorImpl]

'mutability' @ [164:22] ==> public final val mutability: MutabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'READ_ONLY' @ [165:9] ==> enum entry READ_ONLY defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'position' @ [166:17] ==> value-parameter position: TypeComponentPosition defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ValueParameterDescriptorImpl]

'FLEXIBLE_LOWER' @ [166:51] ==> enum entry FLEXIBLE_LOWER defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeComponentPosition[FakeCallableDescriptorForObject]

'mapping' @ [166:69] ==> val mapping: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[LocalVariableDescriptor]

'isMutable' @ [166:77] ==> public final fun isMutable(mutable: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'this' @ [166:87] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'mapping' @ [167:24] ==> val mapping: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[LocalVariableDescriptor]

'convertMutableToReadOnly' @ [167:32] ==> public final fun convertMutableToReadOnly(mutable: ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'this' @ [167:57] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'enhancedMutability' @ [167:63] ==> private fun <T> ClassDescriptor.enhancedMutability(): EnhancementResult<ClassDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassDescriptor

'MUTABLE' @ [170:9] ==> enum entry MUTABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.MutabilityQualifier[FakeCallableDescriptorForObject]

'position' @ [171:17] ==> value-parameter position: TypeComponentPosition defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ValueParameterDescriptorImpl]

'FLEXIBLE_UPPER' @ [171:51] ==> enum entry FLEXIBLE_UPPER defined in org.jetbrains.kotlin.load.java.typeEnhancement.TypeComponentPosition[FakeCallableDescriptorForObject]

'mapping' @ [171:69] ==> val mapping: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[LocalVariableDescriptor]

'isReadOnly' @ [171:77] ==> public final fun isReadOnly(readOnly: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'this' @ [171:88] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'mapping' @ [172:24] ==> val mapping: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[LocalVariableDescriptor]

'convertReadOnlyToMutable' @ [172:32] ==> public final fun convertReadOnlyToMutable(readOnly: ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'this' @ [172:57] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'enhancedMutability' @ [172:63] ==> private fun <T> ClassDescriptor.enhancedMutability(): EnhancementResult<ClassDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassDescriptor

'this' @ [177:12] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.enhanceMutability[ReceiverParameterDescriptorImpl]

'noChange' @ [177:17] ==> private fun <T> ClassDescriptor.noChange(): EnhancementResult<ClassDescriptor> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClassDescriptor

'!' @ [181:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'position' @ [181:10] ==> value-parameter position: TypeComponentPosition defined in org.jetbrains.kotlin.load.java.typeEnhancement.getEnhancedNullability[ValueParameterDescriptorImpl]

'shouldEnhance' @ [181:19] ==> private fun TypeComponentPosition.shouldEnhance(): Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[SimpleFunctionDescriptorImpl]

'this' @ [181:43] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.getEnhancedNullability[ReceiverParameterDescriptorImpl]

'isMarkedNullable' @ [181:48] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'noChange' @ [181:65] ==> private fun <T> Boolean.noChange(): EnhancementResult<Boolean> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'when (qualifiers.nullability) {
        NULLABLE -> true.enhancedNullability()
        NOT_NULL -> false.enhancedNullability()
        else -> this.isMarkedNullable.noChange()
    }' @ [183:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EnhancementResult<Boolean>, entry1: EnhancementResult<Boolean>, entry2: EnhancementResult<Boolean>): EnhancementResult<Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EnhancementResult<Boolean>

'qualifiers' @ [183:18] ==> value-parameter qualifiers: JavaTypeQualifiers defined in org.jetbrains.kotlin.load.java.typeEnhancement.getEnhancedNullability[ValueParameterDescriptorImpl]

'nullability' @ [183:29] ==> public final val nullability: NullabilityQualifier? defined in org.jetbrains.kotlin.load.java.typeEnhancement.JavaTypeQualifiers[PropertyDescriptorImpl]

'NULLABLE' @ [184:9] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'enhancedNullability' @ [184:26] ==> private fun <T> Boolean.enhancedNullability(): EnhancementResult<Boolean> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'NOT_NULL' @ [185:9] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.load.java.typeEnhancement.NullabilityQualifier[FakeCallableDescriptorForObject]

'enhancedNullability' @ [185:27] ==> private fun <T> Boolean.enhancedNullability(): EnhancementResult<Boolean> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'this' @ [186:17] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.getEnhancedNullability[ReceiverParameterDescriptorImpl]

'isMarkedNullable' @ [186:22] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'noChange' @ [186:39] ==> private fun <T> Boolean.noChange(): EnhancementResult<Boolean> defined in org.jetbrains.kotlin.load.java.typeEnhancement[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'EnhancedTypeAnnotations' @ [190:48] ==> public constructor EnhancedTypeAnnotations(fqNameToMatch: FqName) defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotations[ClassConstructorDescriptorImpl]

'ENHANCED_NULLABILITY_ANNOTATION' @ [190:91] ==> public final val ENHANCED_NULLABILITY_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'EnhancedTypeAnnotations' @ [191:47] ==> public constructor EnhancedTypeAnnotations(fqNameToMatch: FqName) defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotations[ClassConstructorDescriptorImpl]

'ENHANCED_MUTABILITY_ANNOTATION' @ [191:90] ==> public final val ENHANCED_MUTABILITY_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'when (fqName) {
        fqNameToMatch -> EnhancedTypeAnnotationDescriptor
        else -> null
    }' @ [196:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EnhancedTypeAnnotationDescriptor?, entry1: EnhancedTypeAnnotationDescriptor?): EnhancedTypeAnnotationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EnhancedTypeAnnotationDescriptor?

'fqName' @ [196:57] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotations.findAnnotation[ValueParameterDescriptorImpl]

'fqNameToMatch' @ [197:9] ==> private final val fqNameToMatch: FqName defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotations[PropertyDescriptorImpl]

'EnhancedTypeAnnotationDescriptor' @ [197:26] ==> private object EnhancedTypeAnnotationDescriptor : AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement in file typeEnhancement.kt[FakeCallableDescriptorForObject]

'this' @ [201:40] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotations[LazyClassReceiverParameterDescriptor]

'map' @ [201:45] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [201:51] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'it' @ [201:72] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotations.getAllAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [203:52] ==> public fun <T> emptyList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'emptyList' @ [207:63] ==> public fun <T> emptyList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'iterator' @ [207:97] ==> public abstract fun iterator(): Iterator<AnnotationDescriptor> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'error' @ [211:41] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'throwError' @ [212:43] ==> private final fun throwError(): Nothing defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotationDescriptor[SimpleFunctionDescriptorImpl]

'throwError' @ [213:73] ==> private final fun throwError(): Nothing defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotationDescriptor[SimpleFunctionDescriptorImpl]

'throwError' @ [214:48] ==> private final fun throwError(): Nothing defined in org.jetbrains.kotlin.load.java.typeEnhancement.EnhancedTypeAnnotationDescriptor[SimpleFunctionDescriptorImpl]

'DelegatingSimpleType' @ [218:94] ==> public constructor DelegatingSimpleType() defined in org.jetbrains.kotlin.types.DelegatingSimpleType[DeserializedClassConstructorDescriptor]

'replacement' @ [224:29] ==> value-parameter replacement: KotlinType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[ValueParameterDescriptorImpl]

'unwrap' @ [224:41] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'!' @ [225:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [225:24] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'unwrappedType' @ [225:39] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'!' @ [225:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'unwrappedType' @ [225:58] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'isTypeParameter' @ [225:72] ==> public fun KotlinType.isTypeParameter(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'unwrappedType' @ [225:98] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'when (unwrappedType) {
            is SimpleType -> unwrappedType.prepareReplacement()
            is FlexibleType -> KotlinTypeFactory.flexibleType(
                    unwrappedType.lowerBound.prepareReplacement(),
                    unwrappedType.upperBound.prepareReplacement()
            ).wrapEnhancement(unwrappedType.getEnhancement())
            else -> error("Incorrect type: $unwrappedType")
        }' @ [227:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType, entry2: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'unwrappedType' @ [227:22] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'unwrappedType' @ [228:30] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'prepareReplacement' @ [228:44] ==> private final fun SimpleType.prepareReplacement(): SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[SimpleFunctionDescriptorImpl]

'flexibleType' @ [229:50] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'unwrappedType' @ [230:21] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'lowerBound' @ [230:35] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'prepareReplacement' @ [230:46] ==> private final fun SimpleType.prepareReplacement(): SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[SimpleFunctionDescriptorImpl]

'unwrappedType' @ [231:21] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'upperBound' @ [231:35] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'prepareReplacement' @ [231:46] ==> private final fun SimpleType.prepareReplacement(): SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[SimpleFunctionDescriptorImpl]

'wrapEnhancement' @ [232:15] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'unwrappedType' @ [232:31] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'getEnhancement' @ [232:45] ==> public fun KotlinType.getEnhancement(): KotlinType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'error' @ [233:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'unwrappedType' @ [233:45] ==> val unwrappedType: UnwrappedType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.substitutionResult[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [241:22] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'!' @ [242:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [242:14] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.prepareReplacement[ReceiverParameterDescriptorImpl]

'isTypeParameter' @ [242:19] ==> public fun KotlinType.isTypeParameter(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'result' @ [242:45] ==> val result: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.prepareReplacement[LocalVariableDescriptor]

'NotNullTypeParameter' @ [244:16] ==> public constructor NotNullTypeParameter(delegate: SimpleType) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[ClassConstructorDescriptorImpl]

'result' @ [244:37] ==> val result: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.prepareReplacement[LocalVariableDescriptor]

'NotNullTypeParameter' @ [247:68] ==> public constructor NotNullTypeParameter(delegate: SimpleType) defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[ClassConstructorDescriptorImpl]

'delegate' @ [247:89] ==> protected open val delegate: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[PropertyDescriptorImpl]

'replaceAnnotations' @ [247:98] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'newAnnotations' @ [247:117] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.replaceAnnotations[ValueParameterDescriptorImpl]

'if (newNullability) delegate.makeNullableAsSpecified(true) else this' @ [249:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'newNullability' @ [249:13] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'delegate' @ [249:29] ==> protected open val delegate: SimpleType defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[PropertyDescriptorImpl]

'makeNullableAsSpecified' @ [249:38] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'this' @ [249:73] ==> <this> defined in org.jetbrains.kotlin.load.java.typeEnhancement.NotNullTypeParameter[LazyClassReceiverParameterDescriptor]

