'when (descriptor) {
            is ClassDescriptor -> descriptor.defaultType
            is CallableDescriptor -> descriptor.returnType
            else -> null
        }' @ [36:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'descriptor' @ [36:31] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.getNonAnonymousType[ValueParameterDescriptorImpl]

'descriptor' @ [37:35] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.getNonAnonymousType[ValueParameterDescriptorImpl]

'defaultType' @ [37:46] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'descriptor' @ [38:38] ==> value-parameter descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.getNonAnonymousType[ValueParameterDescriptorImpl]

'returnType' @ [38:49] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'invoke' @ [40:21] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'getNonAnonymousType' @ [42:16] ==> public final fun <T : JCTree.JCExpression?> getNonAnonymousType(type: KotlinType, f: () -> T): T defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : JCTree.JCExpression?> -> T

'classType' @ [42:36] ==> val classType: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.getNonAnonymousType[LocalVariableDescriptor]

'f' @ [42:47] ==> value-parameter f: () -> T defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.getNonAnonymousType[ValueParameterDescriptorImpl]

'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkIfAnonymousRecursively' @ [46:14] ==> private final fun checkIfAnonymousRecursively(type: KotlinType): Boolean defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]

'type' @ [46:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.getNonAnonymousType[ValueParameterDescriptorImpl]

'invoke' @ [46:56] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'Suppress' @ [48:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'convertKotlinType' @ [49:16] ==> private final fun convertKotlinType(type: KotlinType): JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]

'convertPossiblyAnonymousType' @ [49:34] ==> private final fun convertPossiblyAnonymousType(type: KotlinType): KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]

'type' @ [49:63] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.getNonAnonymousType[ValueParameterDescriptorImpl]

'type' @ [53:27] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.checkIfAnonymousRecursively[ValueParameterDescriptorImpl]

'constructor' @ [53:32] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [53:44] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'isAnonymousObject' @ [54:13] ==> public open fun isAnonymousObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'declaration' @ [54:31] ==> val declaration: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.checkIfAnonymousRecursively[LocalVariableDescriptor]

'type' @ [55:16] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.checkIfAnonymousRecursively[ValueParameterDescriptorImpl]

'arguments' @ [55:21] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'any' @ [55:31] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [56:17] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.checkIfAnonymousRecursively.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [56:20] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'checkIfAnonymousRecursively' @ [57:13] ==> private final fun checkIfAnonymousRecursively(type: KotlinType): Boolean defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]

'it' @ [57:41] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.checkIfAnonymousRecursively.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [57:44] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'type' @ [62:27] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[ValueParameterDescriptorImpl]

'constructor' @ [62:32] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [62:44] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'type' @ [62:96] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[ValueParameterDescriptorImpl]

'when {
            isAnonymousObject(declaration) -> findMostSuitableParentForAnonymousType(declaration)
            else -> declaration.defaultType
        }' @ [64:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType, entry1: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType

'isAnonymousObject' @ [65:13] ==> public open fun isAnonymousObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'declaration' @ [65:31] ==> val declaration: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[LocalVariableDescriptor]

'findMostSuitableParentForAnonymousType' @ [65:47] ==> private final fun findMostSuitableParentForAnonymousType(descriptor: ClassDescriptor): KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]

'declaration' @ [65:86] ==> val declaration: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[LocalVariableDescriptor]

'declaration' @ [66:21] ==> val declaration: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[LocalVariableDescriptor]

'defaultType' @ [66:33] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'type' @ [69:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[ValueParameterDescriptorImpl]

'arguments' @ [69:18] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isEmpty' @ [69:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'actualType' @ [69:46] ==> val actualType: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[LocalVariableDescriptor]

'type' @ [71:25] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[ValueParameterDescriptorImpl]

'arguments' @ [71:30] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'map' @ [71:40] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjection

'typeArg' @ [72:17] ==> value-parameter typeArg: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [72:25] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'typeArg' @ [72:54] ==> value-parameter typeArg: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType.<anonymous>[ValueParameterDescriptorImpl]

'TypeProjectionImpl' @ [73:13] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'typeArg' @ [73:32] ==> value-parameter typeArg: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [73:40] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'convertPossiblyAnonymousType' @ [73:56] ==> private final fun convertPossiblyAnonymousType(type: KotlinType): KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]

'typeArg' @ [73:85] ==> value-parameter typeArg: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [73:93] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'actualType' @ [76:16] ==> val actualType: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[LocalVariableDescriptor]

'replace' @ [76:27] ==> @JvmOverloads public fun KotlinType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'arguments' @ [76:35] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertPossiblyAnonymousType[LocalVariableDescriptor]

'descriptor' @ [80:9] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType[ValueParameterDescriptorImpl]

'getSuperClassNotAny' @ [80:20] ==> public fun ClassDescriptor.getSuperClassNotAny(): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [80:43] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Nothing

'it' @ [80:56] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [80:59] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'descriptor' @ [82:32] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType[ValueParameterDescriptorImpl]

'typeConstructor' @ [82:43] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [82:59] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'sortedBy' @ [83:18] ==> public inline fun <T, R : Comparable<String>> Iterable<(KotlinType..KotlinType?)>.sortedBy(crossinline selector: ((KotlinType..KotlinType?)) -> String?): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R : Comparable<R>> -> String

'it' @ [83:29] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [83:32] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [83:44] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'name' @ [83:67] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [83:73] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'sortedSuperTypes' @ [85:27] ==> val sortedSuperTypes: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType[LocalVariableDescriptor]

'!' @ [86:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'candidate' @ [86:18] ==> val candidate: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType[LocalVariableDescriptor]

'isAnyOrNullableAny' @ [86:28] ==> public fun KotlinType.isAnyOrNullableAny(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'candidate' @ [86:57] ==> val candidate: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType[LocalVariableDescriptor]

'descriptor' @ [89:16] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.findMostSuitableParentForAnonymousType[ValueParameterDescriptorImpl]

'builtIns' @ [89:27] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'anyType' @ [89:36] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'converter' @ [93:26] ==> private final val converter: ClassFileToSourceStubConverter defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[PropertyDescriptorImpl]

'kaptContext' @ [93:36] ==> public final val kaptContext: KaptContext<GenerationState> defined in org.jetbrains.kotlin.kapt3.stubs.ClassFileToSourceStubConverter[PropertyDescriptorImpl]

'generationState' @ [93:48] ==> public final val generationState: GenerationState defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'typeMapper' @ [93:64] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'converter' @ [95:25] ==> private final val converter: ClassFileToSourceStubConverter defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[PropertyDescriptorImpl]

'treeMaker' @ [95:35] ==> public final val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.ClassFileToSourceStubConverter[PropertyDescriptorImpl]

'treeMaker' @ [96:24] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'Type' @ [96:34] ==> public final fun Type(type: Type): JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[SimpleFunctionDescriptorImpl]

'typeMapper' @ [96:39] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'mapType' @ [96:50] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'type' @ [96:58] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[ValueParameterDescriptorImpl]

'type' @ [97:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[ValueParameterDescriptorImpl]

'arguments' @ [97:18] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isEmpty' @ [97:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'selfType' @ [97:46] ==> val selfType: JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'treeMaker' @ [99:16] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'TypeApply' @ [99:26] ==> public open fun TypeApply(p0: (JCTree.JCExpression..JCTree.JCExpression?), p1: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?)): (JCTree.JCTypeApply..JCTree.JCTypeApply?) defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[JavaMethodDescriptor]

'selfType' @ [99:36] ==> val selfType: JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'mapJList' @ [99:46] ==> internal inline fun <T, R> mapJList(values: Iterable<TypeProjection>?, f: (TypeProjection) -> JCTree.JCExpression?): List<(JCTree.JCExpression..JCTree.JCExpression?)> defined in org.jetbrains.kotlin.kapt3[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TypeProjection
    <R> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)

'type' @ [99:55] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[ValueParameterDescriptorImpl]

'arguments' @ [99:60] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'projection' @ [100:17] ==> value-parameter projection: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [100:28] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'treeMaker' @ [100:62] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'Wildcard' @ [100:72] ==> public open fun Wildcard(p0: (JCTree.TypeBoundKind..JCTree.TypeBoundKind?), p1: (JCTree..JCTree?)): (JCTree.JCWildcard..JCTree.JCWildcard?) defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[JavaMethodDescriptor]

'treeMaker' @ [100:81] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'TypeBoundKind' @ [100:91] ==> public open fun TypeBoundKind(p0: (BoundKind..BoundKind?)): (JCTree.TypeBoundKind..JCTree.TypeBoundKind?) defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[JavaMethodDescriptor]

'UNBOUND' @ [100:115] ==> enum entry UNBOUND defined in com.sun.tools.javac.code.BoundKind[FakeCallableDescriptorForObject]

'convertKotlinType' @ [102:31] ==> private final fun convertKotlinType(type: KotlinType): JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler[SimpleFunctionDescriptorImpl]

'projection' @ [102:49] ==> value-parameter projection: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [102:60] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'when (projection.projectionKind) {
                Variance.INVARIANT -> renderedArg
                Variance.OUT_VARIANCE -> treeMaker.Wildcard(treeMaker.TypeBoundKind(BoundKind.EXTENDS), renderedArg)
                Variance.IN_VARIANCE -> treeMaker.Wildcard(treeMaker.TypeBoundKind(BoundKind.SUPER), renderedArg)
            }' @ [103:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (JCTree.JCExpression..JCTree.JCExpression?), entry1: (JCTree.JCExpression..JCTree.JCExpression?), entry2: (JCTree.JCExpression..JCTree.JCExpression?)): (JCTree.JCExpression..JCTree.JCExpression?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)

'projection' @ [103:19] ==> value-parameter projection: TypeProjection defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [103:30] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [104:26] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'renderedArg' @ [104:39] ==> val renderedArg: JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType.<anonymous>[LocalVariableDescriptor]

'OUT_VARIANCE' @ [105:26] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'treeMaker' @ [105:42] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'Wildcard' @ [105:52] ==> public open fun Wildcard(p0: (JCTree.TypeBoundKind..JCTree.TypeBoundKind?), p1: (JCTree..JCTree?)): (JCTree.JCWildcard..JCTree.JCWildcard?) defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[JavaMethodDescriptor]

'treeMaker' @ [105:61] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'TypeBoundKind' @ [105:71] ==> public open fun TypeBoundKind(p0: (BoundKind..BoundKind?)): (JCTree.TypeBoundKind..JCTree.TypeBoundKind?) defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[JavaMethodDescriptor]

'EXTENDS' @ [105:95] ==> enum entry EXTENDS defined in com.sun.tools.javac.code.BoundKind[FakeCallableDescriptorForObject]

'renderedArg' @ [105:105] ==> val renderedArg: JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType.<anonymous>[LocalVariableDescriptor]

'IN_VARIANCE' @ [106:26] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'treeMaker' @ [106:41] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'Wildcard' @ [106:51] ==> public open fun Wildcard(p0: (JCTree.TypeBoundKind..JCTree.TypeBoundKind?), p1: (JCTree..JCTree?)): (JCTree.JCWildcard..JCTree.JCWildcard?) defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[JavaMethodDescriptor]

'treeMaker' @ [106:60] ==> val treeMaker: KaptTreeMaker defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType[LocalVariableDescriptor]

'TypeBoundKind' @ [106:70] ==> public open fun TypeBoundKind(p0: (BoundKind..BoundKind?)): (JCTree.TypeBoundKind..JCTree.TypeBoundKind?) defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[JavaMethodDescriptor]

'SUPER' @ [106:94] ==> enum entry SUPER defined in com.sun.tools.javac.code.BoundKind[FakeCallableDescriptorForObject]

'renderedArg' @ [106:102] ==> val renderedArg: JCTree.JCExpression defined in org.jetbrains.kotlin.kapt3.stubs.AnonymousTypeHandler.convertKotlinType.<anonymous>[LocalVariableDescriptor]

