'when {
        isNullabilityFlexible() -> TypeNullability.FLEXIBLE
        TypeUtils.isNullableType(this) -> TypeNullability.NULLABLE
        else -> TypeNullability.NOT_NULL
    }' @ [35:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeNullability, entry1: TypeNullability, entry2: TypeNullability): TypeNullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeNullability

'isNullabilityFlexible' @ [36:9] ==> public fun KotlinType.isNullabilityFlexible(): Boolean defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'FLEXIBLE' @ [36:52] ==> enum entry FLEXIBLE defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'isNullableType' @ [37:19] ==> public open fun isNullableType(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [37:34] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.nullability[ReceiverParameterDescriptorImpl]

'NULLABLE' @ [37:59] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'NOT_NULL' @ [38:33] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'constructor' @ [43:13] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'builtIns' @ [43:25] ==> public final val TypeConstructor.builtIns: KotlinBuiltIns[MyPropertyDescriptor]

'makeNullable' @ [45:43] ==> @NotNull public open fun makeNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [45:56] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.makeNullable[ReceiverParameterDescriptorImpl]

'makeNotNullable' @ [46:46] ==> @NotNull public open fun makeNotNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [46:62] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.makeNotNullable[ReceiverParameterDescriptorImpl]

'getImmediateSupertypes' @ [48:74] ==> @NotNull public open fun getImmediateSupertypes(@NotNull type: KotlinType): (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [48:97] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.immediateSupertypes[ReceiverParameterDescriptorImpl]

'getAllSupertypes' @ [49:65] ==> @NotNull public open fun getAllSupertypes(@NotNull type: KotlinType): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [49:82] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.supertypes[ReceiverParameterDescriptorImpl]

'isNothing' @ [51:54] ==> public open fun isNothing(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [51:64] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isNothing[ReceiverParameterDescriptorImpl]

'isNullableNothing' @ [52:62] ==> public open fun isNullableNothing(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [52:80] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isNullableNothing[ReceiverParameterDescriptorImpl]

'isUnit' @ [53:51] ==> public open fun isUnit(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [53:58] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isUnit[ReceiverParameterDescriptorImpl]

'isAnyOrNullableAny' @ [54:63] ==> public open fun isAnyOrNullableAny(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [54:82] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isAnyOrNullableAny[ReceiverParameterDescriptorImpl]

'isNullableAny' @ [55:58] ==> public open fun isNullableAny(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [55:72] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isNullableAny[ReceiverParameterDescriptorImpl]

'isBoolean' @ [56:54] ==> public open fun isBoolean(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [56:64] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isBoolean[ReceiverParameterDescriptorImpl]

'isPrimitiveType' @ [57:66] ==> public open fun isPrimitiveType(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [57:82] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isPrimitiveNumberType[ReceiverParameterDescriptorImpl]

'!' @ [57:91] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBoolean' @ [57:92] ==> public fun KotlinType.isBoolean(): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'isBooleanOrNullableBoolean' @ [58:71] ==> public open fun isBooleanOrNullableBoolean(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [58:98] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isBooleanOrNullableBoolean[ReceiverParameterDescriptorImpl]

'isThrowableOrNullableThrowable' @ [59:63] ==> public open fun isThrowableOrNullableThrowable(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [59:94] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isNotNullThrowable[ReceiverParameterDescriptorImpl]

'!' @ [59:103] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMarkedNullable' @ [59:104] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'isTypeParameter' @ [61:55] ==> public open fun isTypeParameter(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [61:71] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isTypeParameter[ReceiverParameterDescriptorImpl]

'==' @ [63:41] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'constructor' @ [63:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [63:54] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'kind' @ [63:98] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [63:116] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'this' @ [66:9] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isArrayOfNothing[ReceiverParameterDescriptorImpl]

'!' @ [66:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isArray' @ [66:41] ==> public open fun isArray(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [66:49] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isArrayOfNothing[ReceiverParameterDescriptorImpl]

'arguments' @ [68:19] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'firstOrNull' @ [68:29] ==> public fun <T> List<TypeProjection>.firstOrNull(): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [68:44] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeArg' @ [69:12] ==> val typeArg: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.isArrayOfNothing[LocalVariableDescriptor]

'isNothingOrNullableNothing' @ [69:46] ==> public open fun isNothingOrNullableNothing(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'typeArg' @ [69:73] ==> val typeArg: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.isArrayOfNothing[LocalVariableDescriptor]

'DEFAULT' @ [73:80] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [73:88] ==> public abstract fun isSubtypeOf(@NotNull subtype: KotlinType, @NotNull supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'this' @ [73:100] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isSubtypeOf[ReceiverParameterDescriptorImpl]

'superType' @ [73:106] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.isSubtypeOf[ValueParameterDescriptorImpl]

'!' @ [76:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expected' @ [76:10] ==> value-parameter expected: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.isNullabilityMismatch[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [76:19] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'actual' @ [76:39] ==> value-parameter actual: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.isNullabilityMismatch[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [76:46] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'actual' @ [76:66] ==> value-parameter actual: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.isNullabilityMismatch[ValueParameterDescriptorImpl]

'isSubtypeOf' @ [76:73] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'makeNullable' @ [76:95] ==> @NotNull public open fun makeNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expected' @ [76:108] ==> value-parameter expected: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.isNullabilityMismatch[ValueParameterDescriptorImpl]

'isNothingOrNullableNothing' @ [79:24] ==> public open fun isNothingOrNullableNothing(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [79:51] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.cannotBeReified[ReceiverParameterDescriptorImpl]

'this' @ [79:60] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.cannotBeReified[ReceiverParameterDescriptorImpl]

'isDynamic' @ [79:65] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types in file dynamicTypes.kt[SimpleFunctionDescriptorImpl]

'this' @ [79:80] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.cannotBeReified[ReceiverParameterDescriptorImpl]

'isCaptured' @ [79:85] ==> public fun KotlinType.isCaptured(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference in file CapturedTypeConstructor.kt[SimpleFunctionDescriptorImpl]

'if (isStarProjection)
        this
    else TypeProjectionImpl(projectionKind, doSubstitute(type))' @ [82:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'isStarProjection' @ [82:16] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'this' @ [83:9] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.substitute[ReceiverParameterDescriptorImpl]

'TypeProjectionImpl' @ [84:10] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'projectionKind' @ [84:29] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'invoke' @ [84:45] ==> public abstract operator fun invoke(p1: KotlinType): KotlinType defined in kotlin.Function1[FunctionInvokeDescriptor]

'type' @ [84:58] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'annotations' @ [88:9] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'isEmpty' @ [88:21] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'newAnnotations' @ [88:34] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.typeUtil.replaceAnnotations[ValueParameterDescriptorImpl]

'isEmpty' @ [88:49] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'this' @ [88:67] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.replaceAnnotations[ReceiverParameterDescriptorImpl]

'unwrap' @ [89:12] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[SimpleFunctionDescriptorImpl]

'replaceAnnotations' @ [89:21] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[SimpleFunctionDescriptorImpl]

'newAnnotations' @ [89:40] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.typeUtil.replaceAnnotations[ValueParameterDescriptorImpl]

'type1' @ [93:9] ==> value-parameter type1: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.equalTypesOrNulls[ValueParameterDescriptorImpl]

'type2' @ [93:19] ==> value-parameter type2: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.equalTypesOrNulls[ValueParameterDescriptorImpl]

'type1' @ [94:9] ==> value-parameter type1: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.equalTypesOrNulls[ValueParameterDescriptorImpl]

'type2' @ [94:26] ==> value-parameter type2: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.equalTypesOrNulls[ValueParameterDescriptorImpl]

'equalTypes' @ [95:12] ==> public abstract fun equalTypes(@NotNull a: KotlinType, @NotNull b: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'type1' @ [95:23] ==> value-parameter type1: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.equalTypesOrNulls[ValueParameterDescriptorImpl]

'type2' @ [95:30] ==> value-parameter type2: KotlinType? defined in org.jetbrains.kotlin.types.typeUtil.equalTypesOrNulls[ValueParameterDescriptorImpl]

'containsErrorType' @ [98:45] ==> public open fun containsErrorType(@Nullable type: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'this' @ [98:63] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.containsError[ReceiverParameterDescriptorImpl]

'map' @ [100:67] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [100:73] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'isDefaultBound' @ [102:59] ==> public open fun isDefaultBound(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'getSupertypeRepresentative' @ [102:74] ==> public fun KotlinType.getSupertypeRepresentative(): KotlinType defined in org.jetbrains.kotlin.types in file TypeCapabilities.kt[SimpleFunctionDescriptorImpl]

'TypeProjectionImpl' @ [105:9] ==> public constructor TypeProjectionImpl(@NotNull projection: Variance, @NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'if (typeParameterDescriptor?.variance == projectionKind) Variance.INVARIANT else projectionKind' @ [105:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Variance, elseBranch: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Variance

'typeParameterDescriptor' @ [105:32] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor? defined in org.jetbrains.kotlin.types.typeUtil.createProjection[ValueParameterDescriptorImpl]

'variance' @ [105:57] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'projectionKind' @ [105:69] ==> value-parameter projectionKind: Variance defined in org.jetbrains.kotlin.types.typeUtil.createProjection[ValueParameterDescriptorImpl]

'INVARIANT' @ [105:94] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'projectionKind' @ [105:109] ==> value-parameter projectionKind: Variance defined in org.jetbrains.kotlin.types.typeUtil.createProjection[ValueParameterDescriptorImpl]

'type' @ [105:125] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.createProjection[ValueParameterDescriptorImpl]

'size' @ [108:9] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'this' @ [108:27] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.closure[ReceiverParameterDescriptorImpl]

'HashSet' @ [110:18] ==> public constructor HashSet<E : (Any..Any?)>(p0: (MutableCollection<out (KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>?)) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'this' @ [110:26] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.closure[ReceiverParameterDescriptorImpl]

'result' @ [111:27] ==> val result: HashSet<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'result' @ [113:12] ==> val result: HashSet<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'size' @ [113:19] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'oldSize' @ [113:26] ==> var oldSize: Int defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'oldSize' @ [114:9] ==> var oldSize: Int defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'result' @ [114:19] ==> val result: HashSet<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'size' @ [114:26] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'hashSetOf' @ [115:21] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'elementsToCheck' @ [116:9] ==> var elementsToCheck: HashSet<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'forEach' @ [116:25] ==> @HidesMembers public inline fun <T> Iterable<(KotlinType..KotlinType?)>.forEach(action: ((KotlinType..KotlinType?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'toAdd' @ [116:35] ==> val toAdd: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'addAll' @ [116:41] ==> public open fun addAll(elements: Collection<KotlinType>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'invoke' @ [116:48] ==> public abstract operator fun invoke(p1: KotlinType): Collection<KotlinType> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [116:50] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.types.typeUtil.closure.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [117:9] ==> val result: HashSet<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'addAll' @ [117:16] ==> public open fun addAll(elements: Collection<(KotlinType..KotlinType?)>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'toAdd' @ [117:23] ==> val toAdd: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'elementsToCheck' @ [118:9] ==> var elementsToCheck: HashSet<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'toAdd' @ [118:27] ==> val toAdd: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'result' @ [121:12] ==> val result: HashSet<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.closure[LocalVariableDescriptor]

'types' @ [125:9] ==> value-parameter types: Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil.boundClosure[ValueParameterDescriptorImpl]

'closure' @ [125:15] ==> public fun Collection<KotlinType>.closure(f: (KotlinType) -> Collection<KotlinType>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'?:' @ [125:33] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Collection<KotlinType>?, right: Collection<KotlinType>): Collection<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Collection<KotlinType>

'getTypeParameterDescriptorOrNull' @ [125:43] ==> @Nullable public open fun getTypeParameterDescriptorOrNull(@NotNull type: KotlinType): TypeParameterDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [125:76] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.boundClosure.<anonymous>[ValueParameterDescriptorImpl]

'upperBounds' @ [125:83] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'emptySet' @ [125:98] ==> public fun <T> emptySet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'hashSetOf' @ [128:18] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'constituentTypes' @ [129:5] ==> private fun constituentTypes(result: MutableSet<KotlinType>, types: Collection<KotlinType>): Unit defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [129:22] ==> val result: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[LocalVariableDescriptor]

'types' @ [129:30] ==> value-parameter types: Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[ValueParameterDescriptorImpl]

'result' @ [130:12] ==> val result: HashSet<KotlinType> /* = HashSet<KotlinType> */ defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[LocalVariableDescriptor]

'constituentTypes' @ [134:9] ==> public fun constituentTypes(types: Collection<KotlinType>): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [134:26] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'this' @ [134:33] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[ReceiverParameterDescriptorImpl]

'result' @ [137:5] ==> value-parameter result: MutableSet<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[ValueParameterDescriptorImpl]

'addAll' @ [137:12] ==> public abstract fun addAll(elements: Collection<KotlinType>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'types' @ [137:19] ==> value-parameter types: Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[ValueParameterDescriptorImpl]

'types' @ [138:18] ==> value-parameter types: Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[ValueParameterDescriptorImpl]

'if (type.isFlexible()) {
            with (type.asFlexibleType()) { constituentTypes(result, setOf(lowerBound, upperBound)) }
        }
        else {
            constituentTypes(result, type.arguments.mapNotNull { if (!it.isStarProjection) it.type else null })
        }' @ [139:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'type' @ [139:13] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[LocalVariableDescriptor]

'isFlexible' @ [139:18] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'with' @ [140:13] ==> @InlineOnly public inline fun <T, R> with(receiver: FlexibleType, block: FlexibleType.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlexibleType
    <R> -> Unit

'type' @ [140:19] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[LocalVariableDescriptor]

'asFlexibleType' @ [140:24] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'constituentTypes' @ [140:44] ==> private fun constituentTypes(result: MutableSet<KotlinType>, types: Collection<KotlinType>): Unit defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [140:61] ==> value-parameter result: MutableSet<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[ValueParameterDescriptorImpl]

'setOf' @ [140:69] ==> public fun <T> setOf(vararg elements: SimpleType): Set<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'lowerBound' @ [140:75] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'upperBound' @ [140:87] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'constituentTypes' @ [143:13] ==> private fun constituentTypes(result: MutableSet<KotlinType>, types: Collection<KotlinType>): Unit defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [143:30] ==> value-parameter result: MutableSet<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[ValueParameterDescriptorImpl]

'type' @ [143:38] ==> val type: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes[LocalVariableDescriptor]

'arguments' @ [143:43] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'mapNotNull' @ [143:53] ==> public inline fun <T, R : Any> Iterable<TypeProjection>.mapNotNull(transform: (TypeProjection) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R : Any> -> KotlinType

'if (!it.isStarProjection) it.type else null' @ [143:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'!' @ [143:70] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [143:71] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [143:74] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [143:92] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.types.typeUtil.constituentTypes.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [143:95] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [149:24] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'supertypes' @ [149:36] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'filter' @ [149:47] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.filter(predicate: ((KotlinType..KotlinType?)) -> Boolean): List<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'isClassOrEnumClass' @ [150:25] ==> public open fun isClassOrEnumClass(@Nullable descriptor: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [150:44] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.types.typeUtil.getImmediateSuperclassNotAny.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [150:47] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [150:59] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'!' @ [150:85] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAnyOrNullableAny' @ [150:101] ==> public open fun isAnyOrNullableAny(@NotNull type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [150:120] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.types.typeUtil.getImmediateSuperclassNotAny.<anonymous>[ValueParameterDescriptorImpl]

'superclasses' @ [152:12] ==> val superclasses: List<(KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.types.typeUtil.getImmediateSuperclassNotAny[LocalVariableDescriptor]

'singleOrNull' @ [152:25] ==> public fun <T> List<(KotlinType..KotlinType?)>.singleOrNull(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'let' @ [152:41] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType?

'createSubstitutedSupertype' @ [153:19] ==> @Nullable public open fun createSubstitutedSupertype(@NotNull subType: KotlinType, @NotNull superType: KotlinType, @NotNull substitutor: TypeSubstitutor): KotlinType? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [153:46] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.getImmediateSuperclassNotAny[ReceiverParameterDescriptorImpl]

'it' @ [153:52] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.typeUtil.getImmediateSuperclassNotAny.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [153:72] ==> @NotNull public open fun create(@NotNull context: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'this' @ [153:79] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.getImmediateSuperclassNotAny[ReceiverParameterDescriptorImpl]

'TypeProjectionImpl' @ [157:53] ==> public constructor TypeProjectionImpl(@NotNull type: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'this' @ [157:72] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.asTypeProjection[ReceiverParameterDescriptorImpl]

'contains' @ [158:76] ==> public open fun contains(@Nullable type: KotlinType?, @NotNull isSpecialType: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [158:85] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.contains[ReceiverParameterDescriptorImpl]

'predicate' @ [158:91] ==> value-parameter predicate: (UnwrappedType) -> Boolean defined in org.jetbrains.kotlin.types.typeUtil.contains[ValueParameterDescriptorImpl]

'unwrap' @ [161:21] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[SimpleFunctionDescriptorImpl]

'when (unwrapped) {
        is FlexibleType -> KotlinTypeFactory.flexibleType(
                unwrapped.lowerBound.replaceArgumentsWithStarProjections(),
                unwrapped.upperBound.replaceArgumentsWithStarProjections()
        )
        is SimpleType -> unwrapped.replaceArgumentsWithStarProjections()
    }' @ [162:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UnwrappedType, entry1: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UnwrappedType

'unwrapped' @ [162:18] ==> val unwrapped: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.replaceArgumentsWithStarProjections[LocalVariableDescriptor]

'flexibleType' @ [163:46] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'unwrapped' @ [164:17] ==> val unwrapped: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.replaceArgumentsWithStarProjections[LocalVariableDescriptor]

'lowerBound' @ [164:27] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'replaceArgumentsWithStarProjections' @ [164:38] ==> private fun SimpleType.replaceArgumentsWithStarProjections(): SimpleType defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'unwrapped' @ [165:17] ==> val unwrapped: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.replaceArgumentsWithStarProjections[LocalVariableDescriptor]

'upperBound' @ [165:27] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'replaceArgumentsWithStarProjections' @ [165:38] ==> private fun SimpleType.replaceArgumentsWithStarProjections(): SimpleType defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'unwrapped' @ [167:26] ==> val unwrapped: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.replaceArgumentsWithStarProjections[LocalVariableDescriptor]

'replaceArgumentsWithStarProjections' @ [167:36] ==> private fun SimpleType.replaceArgumentsWithStarProjections(): SimpleType defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'inheritEnhancement' @ [168:7] ==> public fun UnwrappedType.inheritEnhancement(origin: KotlinType): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'unwrapped' @ [168:26] ==> val unwrapped: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.replaceArgumentsWithStarProjections[LocalVariableDescriptor]

'constructor' @ [172:9] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'parameters' @ [172:21] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [172:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'constructor' @ [172:45] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'declarationDescriptor' @ [172:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'this' @ [172:95] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.replaceArgumentsWithStarProjections[ReceiverParameterDescriptorImpl]

'constructor' @ [174:24] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'parameters' @ [174:36] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [174:47] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> StarProjectionImpl): List<StarProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> StarProjectionImpl

'StarProjectionImpl' @ [174:53] ==> public constructor StarProjectionImpl(typeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.types.StarProjectionImpl[ClassConstructorDescriptorImpl]

'replace' @ [176:12] ==> @JvmOverloads public fun SimpleType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.types in file TypeSubstitution.kt[SimpleFunctionDescriptorImpl]

'newArguments' @ [176:20] ==> val newArguments: List<StarProjectionImpl> defined in org.jetbrains.kotlin.types.typeUtil.replaceArgumentsWithStarProjections[LocalVariableDescriptor]

'contains' @ [180:9] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [181:13] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.containsTypeAliasParameters.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [181:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[PropertyDescriptorImpl]

'declarationDescriptor' @ [181:28] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'isTypeAliasParameter' @ [181:51] ==> public fun ClassifierDescriptor.isTypeAliasParameter(): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'contains' @ [185:9] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [186:13] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.containsTypeAliases.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [186:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[PropertyDescriptorImpl]

'declarationDescriptor' @ [186:28] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'this' @ [190:9] ==> <this> defined in org.jetbrains.kotlin.types.typeUtil.isTypeAliasParameter[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [190:44] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'contains' @ [193:9] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [194:13] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.typeUtil.requiresTypeAliasExpansion.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [194:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[PropertyDescriptorImpl]

'declarationDescriptor' @ [194:28] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [194:51] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor.let(block: (ClassifierDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> Boolean

'it' @ [195:17] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.types.typeUtil.requiresTypeAliasExpansion.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [195:46] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.types.typeUtil.requiresTypeAliasExpansion.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isError' @ [200:9] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types in file KotlinType.kt[PropertyDescriptorImpl]

'buildPossiblyInnerType' @ [201:29] ==> public fun KotlinType.buildPossiblyInnerType(): PossiblyInnerType? defined in org.jetbrains.kotlin.descriptors in file typeParameterUtils.kt[SimpleFunctionDescriptorImpl]

'possiblyInnerType' @ [202:12] ==> val possiblyInnerType: PossiblyInnerType defined in org.jetbrains.kotlin.types.typeUtil.containsTypeProjectionsInTopLevelArguments[LocalVariableDescriptor]

'arguments' @ [202:30] ==> public final val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.descriptors.PossiblyInnerType[PropertyDescriptorImpl]

'any' @ [202:40] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [202:46] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.types.typeUtil.containsTypeProjectionsInTopLevelArguments.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [202:49] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'it' @ [202:69] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.types.typeUtil.containsTypeProjectionsInTopLevelArguments.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [202:72] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [202:99] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

