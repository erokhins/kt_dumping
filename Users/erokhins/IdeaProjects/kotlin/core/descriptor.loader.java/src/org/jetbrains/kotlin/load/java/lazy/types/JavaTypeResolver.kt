'FqName' @ [38:47] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'when (javaType) {
            is JavaPrimitiveType -> {
                val primitiveType = javaType.type
                if (primitiveType != null) c.module.builtIns.getPrimitiveKotlinType(primitiveType)
                else c.module.builtIns.unitType
            }
            is JavaClassifierType -> transformJavaClassifierType(javaType, attr)
            is JavaArrayType -> transformArrayType(javaType, attr)
            // Top level type can be a wildcard only in case of broken Java code, but we should not fail with exceptions in such cases
            is JavaWildcardType -> javaType.bound?.let { transformJavaType(it, attr) } ?: c.module.builtIns.defaultBound
            else -> throw UnsupportedOperationException("Unsupported type: " + javaType)
        }' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType, entry2: KotlinType, entry3: KotlinType, entry4: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'javaType' @ [46:22] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'javaType' @ [48:37] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'type' @ [48:46] ==> public abstract val type: PrimitiveType? defined in org.jetbrains.kotlin.load.java.structure.JavaPrimitiveType[PropertyDescriptorImpl]

'if (primitiveType != null) c.module.builtIns.getPrimitiveKotlinType(primitiveType)
                else c.module.builtIns.unitType' @ [49:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'primitiveType' @ [49:21] ==> val primitiveType: PrimitiveType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[LocalVariableDescriptor]

'c' @ [49:44] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [49:46] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [49:53] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getPrimitiveKotlinType' @ [49:62] ==> @NotNull public open fun getPrimitiveKotlinType(@NotNull type: PrimitiveType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'primitiveType' @ [49:85] ==> val primitiveType: PrimitiveType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[LocalVariableDescriptor]

'c' @ [50:22] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [50:24] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [50:31] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'unitType' @ [50:40] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'transformJavaClassifierType' @ [52:38] ==> private final fun transformJavaClassifierType(javaType: JavaClassifierType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [52:66] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'attr' @ [52:76] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'transformArrayType' @ [53:33] ==> public final fun transformArrayType(arrayType: JavaArrayType, attr: JavaTypeAttributes, isVararg: Boolean = ...): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [53:52] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'attr' @ [53:62] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'javaType' @ [55:36] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'bound' @ [55:45] ==> public abstract val bound: JavaType? defined in org.jetbrains.kotlin.load.java.structure.JavaWildcardType[PropertyDescriptorImpl]

'let' @ [55:52] ==> @InlineOnly public inline fun <T, R> JavaType.let(block: (JavaType) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType
    <R> -> KotlinType

'transformJavaType' @ [55:58] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'it' @ [55:76] ==> value-parameter it: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType.<anonymous>[ValueParameterDescriptorImpl]

'attr' @ [55:80] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'c' @ [55:91] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [55:93] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [55:100] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'defaultBound' @ [55:109] ==> public final val KotlinBuiltIns.defaultBound: SimpleType[MyPropertyDescriptor]

'UnsupportedOperationException' @ [56:27] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [56:57] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'javaType' @ [56:80] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaType[ValueParameterDescriptorImpl]

'arrayType' @ [61:33] ==> value-parameter arrayType: JavaArrayType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[ValueParameterDescriptorImpl]

'componentType' @ [61:43] ==> public abstract val componentType: JavaType defined in org.jetbrains.kotlin.load.java.structure.JavaArrayType[PropertyDescriptorImpl]

'javaComponentType' @ [62:30] ==> val javaComponentType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'type' @ [62:72] ==> public abstract val type: PrimitiveType? defined in org.jetbrains.kotlin.load.java.structure.JavaPrimitiveType[PropertyDescriptorImpl]

'primitiveType' @ [63:13] ==> val primitiveType: PrimitiveType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'c' @ [64:27] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [64:29] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [64:36] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getPrimitiveArrayKotlinType' @ [64:45] ==> @NotNull public open fun getPrimitiveArrayKotlinType(@NotNull primitiveType: PrimitiveType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'primitiveType' @ [64:73] ==> val primitiveType: PrimitiveType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'if (attr.isForAnnotationParameter)
                jetType
            else KotlinTypeFactory.flexibleType(jetType, jetType.makeNullableAsSpecified(true))' @ [65:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'attr' @ [65:24] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[ValueParameterDescriptorImpl]

'isForAnnotationParameter' @ [65:29] ==> public final val isForAnnotationParameter: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'jetType' @ [66:17] ==> val jetType: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'flexibleType' @ [67:36] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'jetType' @ [67:49] ==> val jetType: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'jetType' @ [67:58] ==> val jetType: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [67:66] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'transformJavaType' @ [70:29] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaComponentType' @ [70:47] ==> val javaComponentType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'toAttributes' @ [71:54] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'attr' @ [71:67] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[ValueParameterDescriptorImpl]

'isForAnnotationParameter' @ [71:72] ==> public final val isForAnnotationParameter: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'attr' @ [73:13] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[ValueParameterDescriptorImpl]

'isForAnnotationParameter' @ [73:18] ==> public final val isForAnnotationParameter: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'if (isVararg) OUT_VARIANCE else INVARIANT' @ [74:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'isVararg' @ [74:38] ==> value-parameter isVararg: Boolean = ... defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[ValueParameterDescriptorImpl]

'OUT_VARIANCE' @ [74:48] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INVARIANT' @ [74:66] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'c' @ [75:20] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [75:22] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [75:29] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getArrayType' @ [75:38] ==> @NotNull public open fun getArrayType(@NotNull projectionType: Variance, @NotNull argument: KotlinType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'projectionKind' @ [75:51] ==> val projectionKind: Variance defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'componentType' @ [75:67] ==> val componentType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'KotlinTypeFactory' @ [78:16] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types in file KotlinTypeFactory.kt[FakeCallableDescriptorForObject]

'flexibleType' @ [78:34] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'c' @ [79:17] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [79:19] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [79:26] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getArrayType' @ [79:35] ==> @NotNull public open fun getArrayType(@NotNull projectionType: Variance, @NotNull argument: KotlinType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'INVARIANT' @ [79:48] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'componentType' @ [79:59] ==> val componentType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'c' @ [80:17] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [80:19] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [80:26] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'getArrayType' @ [80:35] ==> @NotNull public open fun getArrayType(@NotNull projectionType: Variance, @NotNull argument: KotlinType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'OUT_VARIANCE' @ [80:48] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'componentType' @ [80:62] ==> val componentType: KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformArrayType[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [80:77] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'createErrorType' @ [85:38] ==> @NotNull public open fun createErrorType(@NotNull debugMessage: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'javaType' @ [85:79] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'presentableText' @ [85:88] ==> public abstract val presentableText: String defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'!' @ [87:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'attr' @ [87:28] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'isForAnnotationParameter' @ [87:33] ==> public final val isForAnnotationParameter: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'attr' @ [87:61] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'howThisTypeIsUsed' @ [87:66] ==> public final val howThisTypeIsUsed: TypeUsage defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'SUPERTYPE' @ [87:87] ==> enum entry SUPERTYPE defined in org.jetbrains.kotlin.load.java.components.TypeUsage[FakeCallableDescriptorForObject]

'javaType' @ [88:21] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'isRaw' @ [88:30] ==> public abstract val isRaw: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'!' @ [89:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isRaw' @ [89:14] ==> val isRaw: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'!' @ [89:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'useFlexible' @ [89:24] ==> val useFlexible: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'computeSimpleJavaClassifierType' @ [90:20] ==> private final fun computeSimpleJavaClassifierType(javaType: JavaClassifierType, attr: JavaTypeAttributes, lowerResult: SimpleType?): SimpleType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [90:52] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'attr' @ [90:62] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'errorType' @ [90:77] ==> local final fun errorType(): SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[SimpleFunctionDescriptorImpl]

'computeSimpleJavaClassifierType' @ [94:17] ==> private final fun computeSimpleJavaClassifierType(javaType: JavaClassifierType, attr: JavaTypeAttributes, lowerResult: SimpleType?): SimpleType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [94:49] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'attr' @ [94:59] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'withFlexibility' @ [94:64] ==> public final fun withFlexibility(flexibility: JavaTypeFlexibility): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[SimpleFunctionDescriptorImpl]

'FLEXIBLE_LOWER_BOUND' @ [94:80] ==> enum entry FLEXIBLE_LOWER_BOUND defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeFlexibility[FakeCallableDescriptorForObject]

'errorType' @ [95:27] ==> local final fun errorType(): SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[SimpleFunctionDescriptorImpl]

'computeSimpleJavaClassifierType' @ [97:17] ==> private final fun computeSimpleJavaClassifierType(javaType: JavaClassifierType, attr: JavaTypeAttributes, lowerResult: SimpleType?): SimpleType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [97:49] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'attr' @ [97:59] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[ValueParameterDescriptorImpl]

'withFlexibility' @ [97:64] ==> public final fun withFlexibility(flexibility: JavaTypeFlexibility): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[SimpleFunctionDescriptorImpl]

'FLEXIBLE_UPPER_BOUND' @ [97:80] ==> enum entry FLEXIBLE_UPPER_BOUND defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeFlexibility[FakeCallableDescriptorForObject]

'lower' @ [97:117] ==> val lower: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'errorType' @ [98:27] ==> local final fun errorType(): SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[SimpleFunctionDescriptorImpl]

'if (isRaw) {
            RawTypeImpl(lower, upper)
        }
        else {
            KotlinTypeFactory.flexibleType(lower, upper)
        }' @ [100:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'isRaw' @ [100:20] ==> val isRaw: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'RawTypeImpl' @ [101:13] ==> public constructor RawTypeImpl(lowerBound: SimpleType, upperBound: SimpleType) defined in org.jetbrains.kotlin.load.java.lazy.types.RawTypeImpl[ClassConstructorDescriptorImpl]

'lower' @ [101:25] ==> val lower: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'upper' @ [101:32] ==> val upper: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'flexibleType' @ [104:31] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'lower' @ [104:44] ==> val lower: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'upper' @ [104:51] ==> val upper: SimpleType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformJavaClassifierType[LocalVariableDescriptor]

'lowerResult' @ [113:17] ==> value-parameter lowerResult: SimpleType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'annotations' @ [113:30] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'LazyJavaAnnotations' @ [113:45] ==> public constructor LazyJavaAnnotations(c: LazyJavaResolverContext, annotationOwner: JavaAnnotationOwner) defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaAnnotations[ClassConstructorDescriptorImpl]

'c' @ [113:65] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'javaType' @ [113:68] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'computeTypeConstructor' @ [114:27] ==> private final fun computeTypeConstructor(javaType: JavaClassifierType, attr: JavaTypeAttributes): TypeConstructor? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [114:50] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'attr' @ [114:60] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'attr' @ [115:26] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'isNullable' @ [115:31] ==> private final fun JavaTypeAttributes.isNullable(): Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'lowerResult' @ [117:13] ==> value-parameter lowerResult: SimpleType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'constructor' @ [117:26] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'constructor' @ [117:41] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[LocalVariableDescriptor]

'!' @ [117:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'javaType' @ [117:57] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'isRaw' @ [117:66] ==> public abstract val isRaw: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'isNullable' @ [117:75] ==> val isNullable: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[LocalVariableDescriptor]

'lowerResult' @ [118:20] ==> value-parameter lowerResult: SimpleType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [118:32] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'computeArguments' @ [121:25] ==> private final fun computeArguments(javaType: JavaClassifierType, attr: JavaTypeAttributes, constructor: TypeConstructor): List<TypeProjection> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [121:42] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'attr' @ [121:52] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[ValueParameterDescriptorImpl]

'constructor' @ [121:58] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[LocalVariableDescriptor]

'KotlinTypeFactory' @ [123:16] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types in file KotlinTypeFactory.kt[FakeCallableDescriptorForObject]

'simpleType' @ [123:34] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'annotations' @ [123:45] ==> val annotations: Annotations defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[LocalVariableDescriptor]

'constructor' @ [123:58] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[LocalVariableDescriptor]

'arguments' @ [123:71] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[LocalVariableDescriptor]

'isNullable' @ [123:82] ==> val isNullable: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType[LocalVariableDescriptor]

'javaType' @ [127:26] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[ValueParameterDescriptorImpl]

'classifier' @ [127:35] ==> public abstract val classifier: JavaClassifier? defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'createNotFoundClass' @ [127:56] ==> private final fun createNotFoundClass(javaType: JavaClassifierType): TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [127:76] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[ValueParameterDescriptorImpl]

'when (classifier) {
            is JavaClass -> {
                val fqName = classifier.fqName.sure { "Class type should have a FQ name: $classifier" }

                val classData = mapKotlinClass(javaType, attr, fqName) ?: c.components.moduleClassResolver.resolveClass(classifier)
                classData?.typeConstructor ?: createNotFoundClass(javaType)
            }
            is JavaTypeParameter -> {
                typeParameterResolver.resolveTypeParameter(classifier)?.typeConstructor
            }
            else -> throw IllegalStateException("Unknown classifier kind: $classifier")
        }' @ [128:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeConstructor?, entry1: TypeConstructor?, entry2: TypeConstructor?): TypeConstructor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeConstructor?

'classifier' @ [128:22] ==> val classifier: JavaClassifier defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'classifier' @ [130:30] ==> val classifier: JavaClassifier defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'fqName' @ [130:41] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[PropertyDescriptorImpl]

'sure' @ [130:48] ==> public inline fun <T : Any> FqName?.sure(message: () -> String): FqName defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> FqName

'classifier' @ [130:91] ==> val classifier: JavaClassifier defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'mapKotlinClass' @ [132:33] ==> private final fun mapKotlinClass(javaType: JavaClassifierType, attr: JavaTypeAttributes, fqName: FqName): ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [132:48] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[ValueParameterDescriptorImpl]

'attr' @ [132:58] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[ValueParameterDescriptorImpl]

'fqName' @ [132:64] ==> val fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'c' @ [132:75] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'components' @ [132:77] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'moduleClassResolver' @ [132:88] ==> public final val moduleClassResolver: ModuleClassResolver defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'resolveClass' @ [132:108] ==> public abstract fun resolveClass(javaClass: JavaClass): ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.ModuleClassResolver[SimpleFunctionDescriptorImpl]

'classifier' @ [132:121] ==> val classifier: JavaClassifier defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'classData' @ [133:17] ==> val classData: ClassDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'typeConstructor' @ [133:28] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'createNotFoundClass' @ [133:47] ==> private final fun createNotFoundClass(javaType: JavaClassifierType): TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [133:67] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[ValueParameterDescriptorImpl]

'typeParameterResolver' @ [136:17] ==> private final val typeParameterResolver: TypeParameterResolver defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'resolveTypeParameter' @ [136:39] ==> public abstract fun resolveTypeParameter(javaTypeParameter: JavaTypeParameter): TypeParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.TypeParameterResolver[SimpleFunctionDescriptorImpl]

'classifier' @ [136:60] ==> val classifier: JavaClassifier defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'typeConstructor' @ [136:73] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'IllegalStateException' @ [138:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'classifier' @ [138:76] ==> val classifier: JavaClassifier defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor[LocalVariableDescriptor]

'topLevel' @ [147:31] ==> @NotNull public open fun topLevel(@NotNull topLevelFqName: FqName): ClassId defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'FqName' @ [147:40] ==> public constructor FqName(@NotNull fqName: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'javaType' @ [147:47] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.createNotFoundClass[ValueParameterDescriptorImpl]

'classifierQualifiedName' @ [147:56] ==> public abstract val classifierQualifiedName: String defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'c' @ [148:16] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'components' @ [148:18] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'deserializedDescriptorResolver' @ [148:29] ==> public final val deserializedDescriptorResolver: DeserializedDescriptorResolver defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'components' @ [148:60] ==> public final lateinit var components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializedDescriptorResolver[PropertyDescriptorImpl]

'notFoundClasses' @ [148:71] ==> public final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'getClass' @ [148:87] ==> public final fun getClass(classId: ClassId, typeParametersCount: List<Int>): ClassDescriptor defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[SimpleFunctionDescriptorImpl]

'classId' @ [148:96] ==> val classId: ClassId defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.createNotFoundClass[LocalVariableDescriptor]

'listOf' @ [148:105] ==> public fun <T> listOf(element: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'typeConstructor' @ [148:116] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'attr' @ [152:13] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[ValueParameterDescriptorImpl]

'isForAnnotationParameter' @ [152:18] ==> public final val isForAnnotationParameter: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'fqName' @ [152:46] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[ValueParameterDescriptorImpl]

'JAVA_LANG_CLASS_FQ_NAME' @ [152:56] ==> private val JAVA_LANG_CLASS_FQ_NAME: FqName defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[PropertyDescriptorImpl]

'c' @ [153:20] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'components' @ [153:22] ==> public final val components: JavaResolverComponents defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'reflectionTypes' @ [153:33] ==> public final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.load.java.lazy.JavaResolverComponents[PropertyDescriptorImpl]

'kClass' @ [153:49] ==> public final val kClass: ClassDescriptor defined in org.jetbrains.kotlin.builtins.ReflectionTypes[PropertyDescriptorImpl]

'JavaToKotlinClassMap' @ [156:28] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform in file JavaToKotlinClassMap.kt[FakeCallableDescriptorForObject]

'javaToKotlin' @ [158:32] ==> val javaToKotlin: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[LocalVariableDescriptor]

'mapJavaToKotlin' @ [158:45] ==> public final fun mapJavaToKotlin(fqName: FqName, builtIns: KotlinBuiltIns): ClassDescriptor? defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'fqName' @ [158:61] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[ValueParameterDescriptorImpl]

'c' @ [158:69] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'module' @ [158:71] ==> public final val module: ModuleDescriptor defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'builtIns' @ [158:78] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[PropertyDescriptorImpl]

'javaToKotlin' @ [160:13] ==> val javaToKotlin: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[LocalVariableDescriptor]

'isReadOnly' @ [160:26] ==> public final fun isReadOnly(readOnly: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'kotlinDescriptor' @ [160:37] ==> val kotlinDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[LocalVariableDescriptor]

'attr' @ [161:17] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[ValueParameterDescriptorImpl]

'flexibility' @ [161:22] ==> public final val flexibility: JavaTypeFlexibility defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'FLEXIBLE_LOWER_BOUND' @ [161:37] ==> enum entry FLEXIBLE_LOWER_BOUND defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeFlexibility[FakeCallableDescriptorForObject]

'attr' @ [162:17] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[ValueParameterDescriptorImpl]

'howThisTypeIsUsed' @ [162:22] ==> public final val howThisTypeIsUsed: TypeUsage defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'SUPERTYPE' @ [162:43] ==> enum entry SUPERTYPE defined in org.jetbrains.kotlin.load.java.components.TypeUsage[FakeCallableDescriptorForObject]

'javaType' @ [163:17] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[ValueParameterDescriptorImpl]

'argumentsMakeSenseOnlyForMutableContainer' @ [163:26] ==> private final fun JavaClassifierType.argumentsMakeSenseOnlyForMutableContainer(readOnlyContainer: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'kotlinDescriptor' @ [163:88] ==> val kotlinDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[LocalVariableDescriptor]

'javaToKotlin' @ [164:24] ==> val javaToKotlin: JavaToKotlinClassMap defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[LocalVariableDescriptor]

'convertReadOnlyToMutable' @ [164:37] ==> public final fun convertReadOnlyToMutable(readOnly: ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'kotlinDescriptor' @ [164:62] ==> val kotlinDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[LocalVariableDescriptor]

'kotlinDescriptor' @ [168:16] ==> val kotlinDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.mapKotlinClass[LocalVariableDescriptor]

'?:' @ [178:52] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'this' @ [178:53] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.argumentsMakeSenseOnlyForMutableContainer.isSuperWildcard[ReceiverParameterDescriptorImpl]

'let' @ [178:81] ==> @InlineOnly public inline fun <T, R> JavaWildcardType.let(block: (JavaWildcardType) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaWildcardType
    <R> -> Boolean

'it' @ [178:87] ==> value-parameter it: JavaWildcardType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.argumentsMakeSenseOnlyForMutableContainer.isSuperWildcard.<anonymous>[ValueParameterDescriptorImpl]

'bound' @ [178:90] ==> public abstract val bound: JavaType? defined in org.jetbrains.kotlin.load.java.structure.JavaWildcardType[PropertyDescriptorImpl]

'!' @ [178:107] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [178:108] ==> value-parameter it: JavaWildcardType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.argumentsMakeSenseOnlyForMutableContainer.isSuperWildcard.<anonymous>[ValueParameterDescriptorImpl]

'isExtends' @ [178:111] ==> public abstract val isExtends: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaWildcardType[PropertyDescriptorImpl]

'!' @ [180:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeArguments' @ [180:14] ==> public abstract val typeArguments: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'lastOrNull' @ [180:28] ==> public fun <T> List<JavaType>.lastOrNull(): JavaType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'isSuperWildcard' @ [180:41] ==> local final fun JavaType?.isSuperWildcard(): Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.argumentsMakeSenseOnlyForMutableContainer[SimpleFunctionDescriptorImpl]

'?:' @ [181:44] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Variance?, right: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Variance

'convertReadOnlyToMutable' @ [181:65] ==> public final fun convertReadOnlyToMutable(readOnly: ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[SimpleFunctionDescriptorImpl]

'readOnlyContainer' @ [181:90] ==> value-parameter readOnlyContainer: ClassDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.argumentsMakeSenseOnlyForMutableContainer[ValueParameterDescriptorImpl]

'typeConstructor' @ [182:53] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [182:69] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'lastOrNull' @ [182:80] ==> public fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.lastOrNull(): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'variance' @ [182:94] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'mutableLastParameterVariance' @ [184:16] ==> val mutableLastParameterVariance: Variance defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.argumentsMakeSenseOnlyForMutableContainer[LocalVariableDescriptor]

'OUT_VARIANCE' @ [184:48] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'javaType' @ [192:21] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'isRaw' @ [192:30] ==> public abstract val isRaw: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'isRaw' @ [194:17] ==> val isRaw: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'javaType' @ [198:18] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [198:27] ==> public abstract val typeArguments: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'isEmpty' @ [198:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [198:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'constructor' @ [198:55] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'parameters' @ [198:67] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [198:78] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'constructor' @ [200:30] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'parameters' @ [200:42] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'eraseTypeParameters' @ [201:13] ==> val eraseTypeParameters: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'typeParameters' @ [202:20] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'map' @ [202:35] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeProjection

'LazyWrappedType' @ [217:25] ==> public constructor LazyWrappedType(storageManager: StorageManager, computation: () -> KotlinType) defined in org.jetbrains.kotlin.types.LazyWrappedType[ClassConstructorDescriptorImpl]

'c' @ [217:41] ==> private final val c: LazyJavaResolverContext defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[PropertyDescriptorImpl]

'storageManager' @ [217:43] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.load.java.lazy.LazyJavaResolverContext[PropertyDescriptorImpl]

'parameter' @ [218:29] ==> value-parameter parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[ValueParameterDescriptorImpl]

'getErasedUpperBound' @ [218:39] ==> internal fun TypeParameterDescriptor.getErasedUpperBound(potentiallyRecursiveTypeParameter: TypeParameterDescriptor? = ..., defaultValue: () -> KotlinType = ...): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'attr' @ [218:59] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'upperBoundOfTypeParameter' @ [218:64] ==> public final val upperBoundOfTypeParameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'constructor' @ [219:33] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [219:45] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'defaultType' @ [219:69] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'replaceArgumentsWithStarProjections' @ [219:81] ==> public fun KotlinType.replaceArgumentsWithStarProjections(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'RawSubstitution' @ [223:17] ==> internal object RawSubstitution : TypeSubstitution defined in org.jetbrains.kotlin.load.java.lazy.types in file RawType.kt[FakeCallableDescriptorForObject]

'computeProjection' @ [223:33] ==> public final fun computeProjection(parameter: TypeParameterDescriptor, attr: JavaTypeAttributes, erasedUpperBound: KotlinType = ...): TypeProjection defined in org.jetbrains.kotlin.load.java.lazy.types.RawSubstitution[SimpleFunctionDescriptorImpl]

'parameter' @ [224:25] ==> value-parameter parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[ValueParameterDescriptorImpl]

'if (isRaw) attr else attr.withFlexibility(INFLEXIBLE)' @ [226:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaTypeAttributes, elseBranch: JavaTypeAttributes): JavaTypeAttributes[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JavaTypeAttributes

'isRaw' @ [226:29] ==> val isRaw: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'attr' @ [226:36] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'attr' @ [226:46] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'withFlexibility' @ [226:51] ==> public final fun withFlexibility(flexibility: JavaTypeFlexibility): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[SimpleFunctionDescriptorImpl]

'INFLEXIBLE' @ [226:67] ==> enum entry INFLEXIBLE defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeFlexibility[FakeCallableDescriptorForObject]

'erasedUpperBound' @ [227:25] ==> val erasedUpperBound: LazyWrappedType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[LocalVariableDescriptor]

'toList' @ [229:15] ==> public fun <T> Iterable<TypeProjection>.toList(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'typeParameters' @ [232:13] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'size' @ [232:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'javaType' @ [232:36] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [232:45] ==> public abstract val typeArguments: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'size' @ [232:59] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeParameters' @ [234:20] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'map' @ [234:35] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [234:46] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'createErrorType' @ [234:76] ==> @NotNull public open fun createErrorType(@NotNull debugMessage: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'p' @ [234:92] ==> value-parameter p: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [234:94] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [234:99] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'toList' @ [234:114] ==> public fun <T> Iterable<TypeProjectionImpl>.toList(): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjectionImpl

'javaType' @ [236:16] ==> value-parameter javaType: JavaClassifierType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [236:25] ==> public abstract val typeArguments: List<JavaType> defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[PropertyDescriptorImpl]

'withIndex' @ [236:39] ==> public fun <T> Iterable<JavaType>.withIndex(): Iterable<IndexedValue<JavaType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaType

'map' @ [236:51] ==> public inline fun <T, R> Iterable<IndexedValue<JavaType>>.map(transform: (IndexedValue<JavaType>) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<JavaType>
    <R> -> TypeProjection

'component1' @ [238:18] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [238:21] ==> public final operator fun component2(): JavaType defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'indexedArgument' @ [238:41] ==> value-parameter indexedArgument: IndexedValue<JavaType> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [240:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'i' @ [240:20] ==> val i: Int defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[LocalVariableDescriptor]

'typeParameters' @ [240:24] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'size' @ [240:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'i' @ [241:81] ==> val i: Int defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[LocalVariableDescriptor]

'typeParameters' @ [241:87] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'size' @ [241:102] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeParameters' @ [244:29] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments[LocalVariableDescriptor]

'i' @ [244:44] ==> val i: Int defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[LocalVariableDescriptor]

'transformToTypeProjection' @ [245:13] ==> private final fun transformToTypeProjection(javaType: JavaType, attr: JavaTypeAttributes, typeParameter: TypeParameterDescriptor): TypeProjection defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaTypeArgument' @ [245:39] ==> val javaTypeArgument: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[LocalVariableDescriptor]

'toAttributes' @ [245:64] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'parameter' @ [245:80] ==> val parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.computeArguments.<anonymous>[LocalVariableDescriptor]

'toList' @ [246:11] ==> public fun <T> Iterable<TypeProjection>.toList(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'when (javaType) {
            is JavaWildcardType -> {
                val bound = javaType.bound
                val projectionKind = if (javaType.isExtends) OUT_VARIANCE else IN_VARIANCE
                if (bound == null || projectionKind.isConflictingArgumentFor(typeParameter))
                    makeStarProjection(typeParameter, attr)
                else {
                    createProjection(
                            type = transformJavaType(bound, COMMON.toAttributes()),
                            projectionKind = projectionKind,
                            typeParameterDescriptor = typeParameter
                    )
                }
            }
            else -> TypeProjectionImpl(INVARIANT, transformJavaType(javaType, attr))
        }' @ [254:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeProjection, entry1: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeProjection

'javaType' @ [254:22] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'javaType' @ [256:29] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'bound' @ [256:38] ==> public abstract val bound: JavaType? defined in org.jetbrains.kotlin.load.java.structure.JavaWildcardType[PropertyDescriptorImpl]

'if (javaType.isExtends) OUT_VARIANCE else IN_VARIANCE' @ [257:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'javaType' @ [257:42] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'isExtends' @ [257:51] ==> public abstract val isExtends: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaWildcardType[PropertyDescriptorImpl]

'OUT_VARIANCE' @ [257:62] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [257:80] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'if (bound == null || projectionKind.isConflictingArgumentFor(typeParameter))
                    makeStarProjection(typeParameter, attr)
                else {
                    createProjection(
                            type = transformJavaType(bound, COMMON.toAttributes()),
                            projectionKind = projectionKind,
                            typeParameterDescriptor = typeParameter
                    )
                }' @ [258:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'bound' @ [258:21] ==> val bound: JavaType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[LocalVariableDescriptor]

'projectionKind' @ [258:38] ==> val projectionKind: Variance defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[LocalVariableDescriptor]

'isConflictingArgumentFor' @ [258:53] ==> private final fun Variance.isConflictingArgumentFor(typeParameter: TypeParameterDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'typeParameter' @ [258:78] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'makeStarProjection' @ [259:21] ==> internal fun makeStarProjection(typeParameter: TypeParameterDescriptor, attr: JavaTypeAttributes): TypeProjection defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'typeParameter' @ [259:40] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'attr' @ [259:55] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'createProjection' @ [261:21] ==> public fun createProjection(type: KotlinType, projectionKind: Variance, typeParameterDescriptor: TypeParameterDescriptor?): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'transformJavaType' @ [262:36] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'bound' @ [262:54] ==> val bound: JavaType? defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[LocalVariableDescriptor]

'toAttributes' @ [262:68] ==> public fun TypeUsage.toAttributes(isForAnnotationParameter: Boolean = ..., upperBoundForTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types in file JavaTypeResolver.kt[SimpleFunctionDescriptorImpl]

'projectionKind' @ [263:46] ==> val projectionKind: Variance defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[LocalVariableDescriptor]

'typeParameter' @ [264:55] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'TypeProjectionImpl' @ [268:21] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'INVARIANT' @ [268:40] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'transformJavaType' @ [268:51] ==> public final fun transformJavaType(javaType: JavaType, attr: JavaTypeAttributes): KotlinType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver[SimpleFunctionDescriptorImpl]

'javaType' @ [268:69] ==> value-parameter javaType: JavaType defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'attr' @ [268:79] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.transformToTypeProjection[ValueParameterDescriptorImpl]

'typeParameter' @ [273:13] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.isConflictingArgumentFor[ValueParameterDescriptorImpl]

'variance' @ [273:27] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [273:39] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'this' @ [274:16] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.isConflictingArgumentFor[ReceiverParameterDescriptorImpl]

'typeParameter' @ [274:24] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeResolver.isConflictingArgumentFor[ValueParameterDescriptorImpl]

'variance' @ [274:38] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'flexibility' @ [278:13] ==> public final val flexibility: JavaTypeFlexibility defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'FLEXIBLE_LOWER_BOUND' @ [278:28] ==> enum entry FLEXIBLE_LOWER_BOUND defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeFlexibility[FakeCallableDescriptorForObject]

'!' @ [281:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isForAnnotationParameter' @ [281:17] ==> public final val isForAnnotationParameter: Boolean defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'howThisTypeIsUsed' @ [281:45] ==> public final val howThisTypeIsUsed: TypeUsage defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'SUPERTYPE' @ [281:66] ==> enum entry SUPERTYPE defined in org.jetbrains.kotlin.load.java.components.TypeUsage[FakeCallableDescriptorForObject]

'if (attr.howThisTypeIsUsed == SUPERTYPE)
        TypeProjectionImpl(typeParameter.starProjectionType())
    else
        StarProjectionImpl(typeParameter)' @ [289:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'attr' @ [289:16] ==> value-parameter attr: JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.makeStarProjection[ValueParameterDescriptorImpl]

'howThisTypeIsUsed' @ [289:21] ==> public final val howThisTypeIsUsed: TypeUsage defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[PropertyDescriptorImpl]

'SUPERTYPE' @ [289:42] ==> enum entry SUPERTYPE defined in org.jetbrains.kotlin.load.java.components.TypeUsage[FakeCallableDescriptorForObject]

'TypeProjectionImpl' @ [290:9] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'typeParameter' @ [290:28] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.makeStarProjection[ValueParameterDescriptorImpl]

'starProjectionType' @ [290:42] ==> public fun TypeParameterDescriptor.starProjectionType(): KotlinType defined in org.jetbrains.kotlin.types in file StarProjectionImpl.kt[SimpleFunctionDescriptorImpl]

'StarProjectionImpl' @ [292:9] ==> public constructor StarProjectionImpl(typeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.types.StarProjectionImpl[ClassConstructorDescriptorImpl]

'typeParameter' @ [292:28] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.makeStarProjection[ValueParameterDescriptorImpl]

'INFLEXIBLE' @ [297:48] ==> enum entry INFLEXIBLE defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeFlexibility[FakeCallableDescriptorForObject]

'copy' @ [302:61] ==> public final fun copy(howThisTypeIsUsed: TypeUsage = ..., flexibility: JavaTypeFlexibility = ..., isForAnnotationParameter: Boolean = ..., upperBoundOfTypeParameter: TypeParameterDescriptor? = ...): JavaTypeAttributes defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[SimpleFunctionDescriptorImpl]

'flexibility' @ [302:80] ==> value-parameter flexibility: JavaTypeFlexibility defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes.withFlexibility[ValueParameterDescriptorImpl]

'JavaTypeAttributes' @ [314:5] ==> public constructor JavaTypeAttributes(howThisTypeIsUsed: TypeUsage, flexibility: JavaTypeFlexibility = ..., isForAnnotationParameter: Boolean = ..., upperBoundOfTypeParameter: TypeParameterDescriptor? = ...) defined in org.jetbrains.kotlin.load.java.lazy.types.JavaTypeAttributes[ClassConstructorDescriptorImpl]

'this' @ [315:9] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.types.toAttributes[ReceiverParameterDescriptorImpl]

'isForAnnotationParameter' @ [316:36] ==> value-parameter isForAnnotationParameter: Boolean = ... defined in org.jetbrains.kotlin.load.java.lazy.types.toAttributes[ValueParameterDescriptorImpl]

'upperBoundForTypeParameter' @ [317:37] ==> value-parameter upperBoundForTypeParameter: TypeParameterDescriptor? = ... defined in org.jetbrains.kotlin.load.java.lazy.types.toAttributes[ValueParameterDescriptorImpl]

'createErrorType' @ [329:57] ==> @NotNull public open fun createErrorType(@NotNull debugMessage: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'this' @ [329:127] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[ReceiverParameterDescriptorImpl]

'this' @ [331:9] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[ReceiverParameterDescriptorImpl]

'potentiallyRecursiveTypeParameter' @ [331:18] ==> value-parameter potentiallyRecursiveTypeParameter: TypeParameterDescriptor? = ... defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[ValueParameterDescriptorImpl]

'invoke' @ [331:60] ==> public abstract operator fun invoke(): KotlinType defined in kotlin.Function0[FunctionInvokeDescriptor]

'upperBounds' @ [333:27] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'first' @ [333:39] ==> public fun <T> List<(KotlinType..KotlinType?)>.first(): (KotlinType..KotlinType?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'firstUpperBound' @ [335:9] ==> val firstUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'constructor' @ [335:25] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [335:37] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'firstUpperBound' @ [336:16] ==> val firstUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'replaceArgumentsWithStarProjections' @ [336:32] ==> public fun KotlinType.replaceArgumentsWithStarProjections(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'potentiallyRecursiveTypeParameter' @ [339:18] ==> value-parameter potentiallyRecursiveTypeParameter: TypeParameterDescriptor? = ... defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[ValueParameterDescriptorImpl]

'this' @ [339:55] ==> <this> defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[ReceiverParameterDescriptorImpl]

'firstUpperBound' @ [340:19] ==> val firstUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'constructor' @ [340:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [340:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'current' @ [342:12] ==> var current: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'stopAt' @ [342:23] ==> val stopAt: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'current' @ [343:30] ==> var current: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'upperBounds' @ [343:38] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'first' @ [343:50] ==> public fun <T> List<(KotlinType..KotlinType?)>.first(): (KotlinType..KotlinType?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'nextUpperBound' @ [344:13] ==> val nextUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'constructor' @ [344:28] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [344:40] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'nextUpperBound' @ [345:20] ==> val nextUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'replaceArgumentsWithStarProjections' @ [345:35] ==> public fun KotlinType.replaceArgumentsWithStarProjections(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'current' @ [348:9] ==> var current: TypeParameterDescriptor defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'nextUpperBound' @ [348:19] ==> val nextUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.load.java.lazy.types.getErasedUpperBound[LocalVariableDescriptor]

'constructor' @ [348:34] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [348:46] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'invoke' @ [351:12] ==> public abstract operator fun invoke(): KotlinType defined in kotlin.Function0[FunctionInvokeDescriptor]

