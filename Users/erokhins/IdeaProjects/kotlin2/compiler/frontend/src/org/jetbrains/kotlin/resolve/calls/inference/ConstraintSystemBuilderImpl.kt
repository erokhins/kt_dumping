'ConstraintSystemBuilderImpl' @ [46:65] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[FakeCallableDescriptorForObject]

'INFERENCE' @ [46:98] ==> enum entry INFERENCE defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Mode[FakeCallableDescriptorForObject]

'' @ [57:17] ==> private constructor ConstraintKind(bound: TypeBounds.BoundKind) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[ClassConstructorDescriptorImpl]

'UPPER_BOUND' @ [57:18] ==> enum entry UPPER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'' @ [58:14] ==> private constructor ConstraintKind(bound: TypeBounds.BoundKind) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[ClassConstructorDescriptorImpl]

'EXACT_BOUND' @ [58:15] ==> enum entry EXACT_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'LinkedHashMap' @ [61:43] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeVariable
    <V : (Any..Any?)> -> TypeBoundsImpl

'HashMap' @ [62:33] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> TypeVariable
    <V : (Any..Any?)> -> MutableList<Bound>

'ArrayList' @ [63:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ConstraintError

'ArrayList' @ [64:39] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Constraint

'LinkedHashMap' @ [66:45] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> CallHandle
    <V : (Any..Any?)> -> TypeSubstitutor

'typeVariableSubstitutors' @ [69:13] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'containsKey' @ [69:38] ==> public open fun containsKey(key: CallHandle): Boolean defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'call' @ [69:50] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeSubstitutor[ValueParameterDescriptorImpl]

'IllegalStateException' @ [70:19] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'call' @ [70:105] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeSubstitutor[ValueParameterDescriptorImpl]

'typeVariableSubstitutors' @ [72:9] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'call' @ [72:34] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeSubstitutor[ValueParameterDescriptorImpl]

'substitutor' @ [72:42] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeSubstitutor[ValueParameterDescriptorImpl]

'substitutor' @ [73:16] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeSubstitutor[ValueParameterDescriptorImpl]

'typeParameters' @ [79:13] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'isEmpty' @ [79:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'storeSubstitutor' @ [79:46] ==> private final fun storeSubstitutor(call: CallHandle, substitutor: TypeSubstitutor): TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'call' @ [79:63] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'EMPTY' @ [79:85] ==> public final val EMPTY: (TypeSubstitutor..TypeSubstitutor?) defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaPropertyDescriptor]

'if (external) {
            typeParameters.map {
                TypeVariable(call, it, it, true)
            }
        }
        else {
            val freshTypeParameters = ArrayList<TypeParameterDescriptor>(typeParameters.size)
            DescriptorSubstitutor.substituteTypeParameters(
                    typeParameters.toList(), TypeSubstitution.EMPTY, typeParameters.first().containingDeclaration, freshTypeParameters
            )
            freshTypeParameters.zip(typeParameters).map {
                val (fresh, original) = it
                TypeVariable(call, fresh, original, external)
            }
        }' @ [81:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TypeVariable>, elseBranch: List<TypeVariable>): List<TypeVariable>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TypeVariable>

'external' @ [81:33] ==> value-parameter external: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'typeParameters' @ [82:13] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'map' @ [82:28] ==> public inline fun <T, R> Iterable<TypeParameterDescriptor>.map(transform: (TypeParameterDescriptor) -> TypeVariable): List<TypeVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> TypeVariable

'TypeVariable' @ [83:17] ==> public constructor TypeVariable(call: CallHandle, freshTypeParameter: TypeParameterDescriptor, originalTypeParameter: TypeParameterDescriptor, isExternal: Boolean) defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[ClassConstructorDescriptorImpl]

'call' @ [83:30] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'it' @ [83:36] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [83:40] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [87:39] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterDescriptor

'typeParameters' @ [87:74] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'size' @ [87:89] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'substituteTypeParameters' @ [88:35] ==> @NotNull public open fun substituteTypeParameters(@ReadOnly @NotNull p0: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @NotNull p1: TypeSubstitution, @NotNull p2: DeclarationDescriptor, @NotNull @Mutable p3: MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>): TypeSubstitutor defined in org.jetbrains.kotlin.types.DescriptorSubstitutor[JavaMethodDescriptor]

'typeParameters' @ [89:21] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'toList' @ [89:36] ==> public fun <T> Iterable<TypeParameterDescriptor>.toList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'TypeSubstitution' @ [89:46] ==> public companion object defined in org.jetbrains.kotlin.types.TypeSubstitution[FakeCallableDescriptorForObject]

'EMPTY' @ [89:63] ==> @field:JvmField public final val EMPTY: TypeSubstitution defined in org.jetbrains.kotlin.types.TypeSubstitution.Companion[DeserializedPropertyDescriptor]

'typeParameters' @ [89:70] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'first' @ [89:85] ==> public fun <T> Iterable<TypeParameterDescriptor>.first(): TypeParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'containingDeclaration' @ [89:93] ==> public final val TypeParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'freshTypeParameters' @ [89:116] ==> val freshTypeParameters: ArrayList<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'freshTypeParameters' @ [91:13] ==> val freshTypeParameters: ArrayList<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'zip' @ [91:33] ==> public infix fun <T, R> Iterable<TypeParameterDescriptor>.zip(other: Iterable<TypeParameterDescriptor>): List<Pair<TypeParameterDescriptor, TypeParameterDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> TypeParameterDescriptor

'typeParameters' @ [91:37] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'map' @ [91:53] ==> public inline fun <T, R> Iterable<Pair<TypeParameterDescriptor, TypeParameterDescriptor>>.map(transform: (Pair<TypeParameterDescriptor, TypeParameterDescriptor>) -> TypeVariable): List<TypeVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TypeParameterDescriptor, TypeParameterDescriptor>
    <R> -> TypeVariable

'component1' @ [92:22] ==> public final operator fun component1(): TypeParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [92:29] ==> public final operator fun component2(): TypeParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [92:41] ==> value-parameter it: Pair<TypeParameterDescriptor, TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'TypeVariable' @ [93:17] ==> public constructor TypeVariable(call: CallHandle, freshTypeParameter: TypeParameterDescriptor, originalTypeParameter: TypeParameterDescriptor, isExternal: Boolean) defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[ClassConstructorDescriptorImpl]

'call' @ [93:30] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'fresh' @ [93:36] ==> val fresh: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables.<anonymous>[LocalVariableDescriptor]

'original' @ [93:43] ==> val original: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables.<anonymous>[LocalVariableDescriptor]

'external' @ [93:53] ==> value-parameter external: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'component1' @ [97:15] ==> public final operator fun component1(): TypeParameterDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [97:18] ==> public final operator fun component2(): TypeVariable defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [97:35] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'zip' @ [97:50] ==> public infix fun <T, R> Iterable<TypeParameterDescriptor>.zip(other: Iterable<TypeVariable>): List<Pair<TypeParameterDescriptor, TypeVariable>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> TypeVariable

'typeVariables' @ [97:54] ==> val typeVariables: List<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'allTypeParameterBounds' @ [98:13] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'put' @ [98:36] ==> public open fun put(key: TypeVariable, value: TypeBoundsImpl): TypeBoundsImpl? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'typeVariable' @ [98:40] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'TypeBoundsImpl' @ [98:54] ==> public constructor TypeBoundsImpl(typeVariable: TypeVariable) defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBoundsImpl[ClassConstructorDescriptorImpl]

'typeVariable' @ [98:69] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'component1' @ [101:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<TypeVariable, TypeBoundsImpl>.component1(): TypeVariable defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeVariable
    <V> -> TypeBoundsImpl

'component2' @ [101:29] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<TypeVariable, TypeBoundsImpl>.component2(): TypeBoundsImpl defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeVariable
    <V> -> TypeBoundsImpl

'allTypeParameterBounds' @ [101:35] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'typeVariable' @ [102:40] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'freshTypeParameter' @ [102:53] ==> internal final val freshTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'upperBounds' @ [102:72] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'declaredUpperBound' @ [103:21] ==> val declaredUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'isDefaultBound' @ [103:40] ==> public fun KotlinType.isDefaultBound(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'ConstraintContext' @ [104:31] ==> public constructor ConstraintContext(position: ConstraintPosition, derivedFrom: Set<TypeVariable>? = ..., initial: Boolean = ..., initialReduction: Boolean = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[ClassConstructorDescriptorImpl]

'TYPE_BOUND_POSITION' @ [104:49] ==> enum entry TYPE_BOUND_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'position' @ [104:69] ==> public final fun position(index: Int): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'typeVariable' @ [104:78] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'originalTypeParameter' @ [104:91] ==> public final val originalTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'index' @ [104:113] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'addBound' @ [105:17] ==> internal final fun addBound(typeVariable: TypeVariable, constrainingType: KotlinType, kind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [105:26] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'declaredUpperBound' @ [105:40] ==> val declaredUpperBound: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'UPPER_BOUND' @ [105:60] ==> enum entry UPPER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'context' @ [105:73] ==> val context: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'storeSubstitutor' @ [109:16] ==> private final fun storeSubstitutor(call: CallHandle, substitutor: TypeSubstitutor): TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'call' @ [109:33] ==> value-parameter call: CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'create' @ [109:55] ==> @NotNull public open fun create(@NotNull p0: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'TypeConstructorSubstitution' @ [109:62] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'createByParametersMap' @ [109:90] ==> @JvmStatic public final fun createByParametersMap(map: Map<TypeParameterDescriptor, TypeProjection>): TypeConstructorSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [110:17] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[ValueParameterDescriptorImpl]

'zip' @ [110:32] ==> public infix fun <T, R> Iterable<TypeParameterDescriptor>.zip(other: Iterable<TypeProjection>): List<Pair<TypeParameterDescriptor, TypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> TypeProjection

'typeVariables' @ [110:36] ==> val typeVariables: List<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables[LocalVariableDescriptor]

'map' @ [110:50] ==> public inline fun <T, R> Iterable<TypeVariable>.map(transform: (TypeVariable) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable
    <R> -> KotlinType

'it' @ [110:56] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.registerTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [110:59] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'defaultProjections' @ [110:66] ==> public fun List<KotlinType>.defaultProjections(): List<TypeProjection> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'toMap' @ [110:88] ==> public fun <K, V> Iterable<Pair<TypeParameterDescriptor, TypeProjection>>.toMap(): Map<TypeParameterDescriptor, TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> TypeProjection

'!' @ [114:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'contains' @ [114:52] ==> public open fun contains(@Nullable p0: KotlinType?, @NotNull p1: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [114:61] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isProper[ReceiverParameterDescriptorImpl]

'type' @ [115:17] ==> value-parameter type: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isProper.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [115:22] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [115:34] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [115:56] ==> @InlineOnly public inline fun <T, R> ClassifierDescriptor?.let(block: (ClassifierDescriptor?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor?
    <R> -> Boolean

'it' @ [115:62] ==> value-parameter it: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isProper.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isMyTypeVariable' @ [115:95] ==> private final fun isMyTypeVariable(typeParameter: TypeParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [115:112] ==> value-parameter it: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isProper.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [119:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.getNestedTypeVariables[ValueParameterDescriptorImpl]

'getNestedTypeParameters' @ [119:18] ==> internal fun KotlinType.getNestedTypeParameters(): List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'mapNotNull' @ [119:44] ==> public inline fun <T, R : Any> Iterable<TypeParameterDescriptor>.mapNotNull(transform: (TypeParameterDescriptor) -> TypeVariable?): List<TypeVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R : Any> -> TypeVariable

'getMyTypeVariable' @ [119:57] ==> private final fun getMyTypeVariable(typeParameter: TypeParameterDescriptor): TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [119:75] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.getNestedTypeVariables.<anonymous>[ValueParameterDescriptorImpl]

'addConstraint' @ [122:9] ==> public final fun addConstraint(constraintKind: ConstraintSystemBuilderImpl.ConstraintKind, subType: KotlinType?, superType: KotlinType?, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'SUB_TYPE' @ [122:23] ==> enum entry SUB_TYPE defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[FakeCallableDescriptorForObject]

'constrainingType' @ [122:33] ==> value-parameter constrainingType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addSubtypeConstraint[ValueParameterDescriptorImpl]

'subjectType' @ [122:51] ==> value-parameter subjectType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addSubtypeConstraint[ValueParameterDescriptorImpl]

'ConstraintContext' @ [122:64] ==> public constructor ConstraintContext(position: ConstraintPosition, derivedFrom: Set<TypeVariable>? = ..., initial: Boolean = ..., initialReduction: Boolean = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[ClassConstructorDescriptorImpl]

'constraintPosition' @ [122:82] ==> value-parameter constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addSubtypeConstraint[ValueParameterDescriptorImpl]

'constraintContext' @ [131:34] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[ValueParameterDescriptorImpl]

'position' @ [131:52] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'ConstraintContext' @ [134:36] ==> public constructor ConstraintContext(position: ConstraintPosition, derivedFrom: Set<TypeVariable>? = ..., initial: Boolean = ..., initialReduction: Boolean = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[ClassConstructorDescriptorImpl]

'constraintContext' @ [134:54] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[ValueParameterDescriptorImpl]

'position' @ [134:72] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'constraintContext' @ [135:73] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[ValueParameterDescriptorImpl]

'initialReduction' @ [135:91] ==> public final val initialReduction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'TypeCheckingProcedure' @ [136:37] ==> public constructor TypeCheckingProcedure(p0: (TypeCheckingProcedureCallbacks..TypeCheckingProcedureCallbacks?)) defined in org.jetbrains.kotlin.types.checker.TypeCheckingProcedure[JavaClassConstructorDescriptor]

'depth' @ [140:17] ==> private final var depth: Int defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>[PropertyDescriptorImpl]

'doAddConstraint' @ [141:17] ==> private final fun doAddConstraint(constraintKind: ConstraintSystemBuilderImpl.ConstraintKind, subType: KotlinType?, superType: KotlinType?, constraintContext: ConstraintContext, typeCheckingProcedure: TypeCheckingProcedure): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'EQUAL' @ [141:33] ==> enum entry EQUAL defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[FakeCallableDescriptorForObject]

'a' @ [141:40] ==> value-parameter a: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertEqualTypes[ValueParameterDescriptorImpl]

'b' @ [141:43] ==> value-parameter b: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertEqualTypes[ValueParameterDescriptorImpl]

'newConstraintContext' @ [141:46] ==> val newConstraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[LocalVariableDescriptor]

'typeCheckingProcedure' @ [141:68] ==> value-parameter typeCheckingProcedure: TypeCheckingProcedure defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertEqualTypes[ValueParameterDescriptorImpl]

'depth' @ [142:17] ==> private final var depth: Int defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>[PropertyDescriptorImpl]

'a' @ [148:24] ==> value-parameter a: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertEqualTypeConstructors[ValueParameterDescriptorImpl]

'b' @ [148:29] ==> value-parameter b: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertEqualTypeConstructors[ValueParameterDescriptorImpl]

'depth' @ [152:17] ==> private final var depth: Int defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>[PropertyDescriptorImpl]

'doAddConstraint' @ [153:17] ==> private final fun doAddConstraint(constraintKind: ConstraintSystemBuilderImpl.ConstraintKind, subType: KotlinType?, superType: KotlinType?, constraintContext: ConstraintContext, typeCheckingProcedure: TypeCheckingProcedure): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'SUB_TYPE' @ [153:33] ==> enum entry SUB_TYPE defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[FakeCallableDescriptorForObject]

'subtype' @ [153:43] ==> value-parameter subtype: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertSubtype[ValueParameterDescriptorImpl]

'supertype' @ [153:52] ==> value-parameter supertype: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertSubtype[ValueParameterDescriptorImpl]

'newConstraintContext' @ [153:63] ==> val newConstraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[LocalVariableDescriptor]

'typeCheckingProcedure' @ [153:85] ==> value-parameter typeCheckingProcedure: TypeCheckingProcedure defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.assertSubtype[ValueParameterDescriptorImpl]

'depth' @ [154:17] ==> private final var depth: Int defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>[PropertyDescriptorImpl]

'isMyTypeVariable' @ [159:21] ==> internal final fun isMyTypeVariable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeProjection' @ [159:38] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.capture[ValueParameterDescriptorImpl]

'type' @ [159:53] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'depth' @ [159:62] ==> private final var depth: Int defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>[PropertyDescriptorImpl]

'getMyTypeVariable' @ [160:38] ==> internal final fun getMyTypeVariable(type: KotlinType): TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'type' @ [160:56] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.capture[ValueParameterDescriptorImpl]

'myTypeVariable' @ [162:21] ==> val myTypeVariable: TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.capture[LocalVariableDescriptor]

'constraintPosition' @ [162:47] ==> val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[LocalVariableDescriptor]

'isParameter' @ [162:66] ==> public open fun isParameter(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPosition[SimpleFunctionDescriptorImpl]

'generateTypeParameterCaptureConstraint' @ [163:21] ==> private final fun generateTypeParameterCaptureConstraint(typeVariable: TypeVariable, constrainingTypeProjection: TypeProjection, constraintContext: ConstraintContext, isTypeMarkedNullable: Boolean): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'myTypeVariable' @ [163:60] ==> val myTypeVariable: TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.capture[LocalVariableDescriptor]

'typeProjection' @ [163:76] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.capture[ValueParameterDescriptorImpl]

'newConstraintContext' @ [163:92] ==> val newConstraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[LocalVariableDescriptor]

'type' @ [163:114] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint.<no name provided>.capture[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [163:119] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'errors' @ [170:17] ==> internal final val errors: ArrayList<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'add' @ [170:24] ==> public open fun add(element: ConstraintError): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'newTypeInferenceOrParameterConstraintError' @ [170:28] ==> public fun newTypeInferenceOrParameterConstraintError(constraintPosition: ConstraintPosition): ConstraintError defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'constraintPosition' @ [170:71] ==> val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[LocalVariableDescriptor]

'doAddConstraint' @ [174:9] ==> private final fun doAddConstraint(constraintKind: ConstraintSystemBuilderImpl.ConstraintKind, subType: KotlinType?, superType: KotlinType?, constraintContext: ConstraintContext, typeCheckingProcedure: TypeCheckingProcedure): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'constraintKind' @ [174:25] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[ValueParameterDescriptorImpl]

'subType' @ [174:41] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[ValueParameterDescriptorImpl]

'superType' @ [174:50] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[ValueParameterDescriptorImpl]

'constraintContext' @ [174:61] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[ValueParameterDescriptorImpl]

'typeCheckingProcedure' @ [174:80] ==> val typeCheckingProcedure: TypeCheckingProcedure defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addConstraint[LocalVariableDescriptor]

'isDontCarePlaceholder' @ [178:23] ==> public open fun isDontCarePlaceholder(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [178:45] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isErrorOrSpecialType[ValueParameterDescriptorImpl]

'isUninferredParameter' @ [178:65] ==> public open fun isUninferredParameter(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'type' @ [178:87] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isErrorOrSpecialType[ValueParameterDescriptorImpl]

'type' @ [182:13] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isErrorOrSpecialType[ValueParameterDescriptorImpl]

'type' @ [182:30] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isErrorOrSpecialType[ValueParameterDescriptorImpl]

'isError' @ [182:35] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'!' @ [182:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [182:47] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isErrorOrSpecialType[ValueParameterDescriptorImpl]

'isFunctionPlaceholder' @ [182:52] ==> public val KotlinType?.isFunctionPlaceholder: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'errors' @ [183:13] ==> internal final val errors: ArrayList<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'add' @ [183:20] ==> public open fun add(element: ConstraintError): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ErrorInConstrainingType' @ [183:24] ==> public constructor ErrorInConstrainingType(constraintPosition: ConstraintPosition) defined in org.jetbrains.kotlin.resolve.calls.inference.ErrorInConstrainingType[ClassConstructorDescriptorImpl]

'constraintPosition' @ [183:48] ==> value-parameter constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isErrorOrSpecialType[ValueParameterDescriptorImpl]

'constraintContext' @ [196:34] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'position' @ [196:52] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'isErrorOrSpecialType' @ [197:13] ==> private final fun isErrorOrSpecialType(type: KotlinType?, constraintPosition: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'subType' @ [197:34] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'constraintPosition' @ [197:43] ==> val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[LocalVariableDescriptor]

'isErrorOrSpecialType' @ [197:66] ==> private final fun isErrorOrSpecialType(type: KotlinType?, constraintPosition: ConstraintPosition): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'superType' @ [197:87] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'constraintPosition' @ [197:98] ==> val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[LocalVariableDescriptor]

'subType' @ [198:13] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'superType' @ [198:32] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'constraintContext' @ [200:13] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'initialReduction' @ [200:31] ==> public final val initialReduction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'subType' @ [200:52] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'hasExactAnnotation' @ [200:60] ==> public fun KotlinType.hasExactAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'superType' @ [200:84] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'hasExactAnnotation' @ [200:94] ==> public fun KotlinType.hasExactAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'constraintKind' @ [200:120] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'EQUAL' @ [200:138] ==> enum entry EQUAL defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[FakeCallableDescriptorForObject]

'doAddConstraint' @ [201:20] ==> private final fun doAddConstraint(constraintKind: ConstraintSystemBuilderImpl.ConstraintKind, subType: KotlinType?, superType: KotlinType?, constraintContext: ConstraintContext, typeCheckingProcedure: TypeCheckingProcedure): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'EQUAL' @ [201:36] ==> enum entry EQUAL defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[FakeCallableDescriptorForObject]

'subType' @ [201:43] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'superType' @ [201:52] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'constraintContext' @ [201:63] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'typeCheckingProcedure' @ [201:82] ==> value-parameter typeCheckingProcedure: TypeCheckingProcedure defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'assert' @ [204:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [204:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'superType' @ [204:17] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'isFunctionPlaceholder' @ [204:27] ==> public val KotlinType?.isFunctionPlaceholder: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'constraintPosition' @ [204:67] ==> val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[LocalVariableDescriptor]

'if (constraintKind == SUB_TYPE && subType.isFunctionPlaceholder) {
            if (isMyTypeVariable(superType)) {
                // the constraint binds type parameter and a function type,
                // we don't add it without knowing whether it's a function type or an extension function type
                return
            }
            createTypeForFunctionPlaceholder(subType, superType)
        }
        else {
            subType
        }' @ [208:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'constraintKind' @ [208:30] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'SUB_TYPE' @ [208:48] ==> enum entry SUB_TYPE defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[FakeCallableDescriptorForObject]

'subType' @ [208:60] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'isFunctionPlaceholder' @ [208:68] ==> public val KotlinType?.isFunctionPlaceholder: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'isMyTypeVariable' @ [209:17] ==> internal final fun isMyTypeVariable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'superType' @ [209:34] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'createTypeForFunctionPlaceholder' @ [214:13] ==> internal fun createTypeForFunctionPlaceholder(functionPlaceholder: KotlinType, expectedType: KotlinType): KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference in file ConstraintSystemBuilderImpl.kt[SimpleFunctionDescriptorImpl]

'subType' @ [214:46] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'superType' @ [214:55] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'subType' @ [217:13] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'isMyTypeVariable' @ [221:17] ==> internal final fun isMyTypeVariable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'subType' @ [221:34] ==> value-parameter subType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'generateTypeParameterBound' @ [222:17] ==> private final fun generateTypeParameterBound(parameterType: KotlinType, constrainingType: KotlinType, boundKind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'subType' @ [222:44] ==> value-parameter subType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'superType' @ [222:53] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'constraintKind' @ [222:64] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'bound' @ [222:79] ==> public final val bound: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[PropertyDescriptorImpl]

'constraintContext' @ [222:86] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'isMyTypeVariable' @ [225:17] ==> internal final fun isMyTypeVariable(type: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'superType' @ [225:34] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'generateTypeParameterBound' @ [226:17] ==> private final fun generateTypeParameterBound(parameterType: KotlinType, constrainingType: KotlinType, boundKind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'superType' @ [226:44] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'subType' @ [226:55] ==> value-parameter subType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'constraintKind' @ [226:64] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'bound' @ [226:79] ==> public final val bound: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[PropertyDescriptorImpl]

'reverse' @ [226:85] ==> public fun TypeBounds.BoundKind.reverse(): TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'constraintContext' @ [226:96] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'simplifyType' @ [229:28] ==> private final fun simplifyType(type: KotlinType, isInitialConstraint: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'subType' @ [229:41] ==> value-parameter subType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'constraintContext' @ [229:50] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'initial' @ [229:68] ==> public final val initial: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'simplifyType' @ [230:30] ==> private final fun simplifyType(type: KotlinType, isInitialConstraint: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'superType' @ [230:43] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'constraintContext' @ [230:54] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'initial' @ [230:72] ==> public final val initial: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'if (constraintKind == EQUAL) {
                typeCheckingProcedure.equalTypes(subType2, superType2)
            }
            else {
                typeCheckingProcedure.isSubtypeOf(subType2, superType)
            }' @ [231:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'constraintKind' @ [231:30] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'EQUAL' @ [231:48] ==> enum entry EQUAL defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.ConstraintKind[FakeCallableDescriptorForObject]

'typeCheckingProcedure' @ [232:17] ==> value-parameter typeCheckingProcedure: TypeCheckingProcedure defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'equalTypes' @ [232:39] ==> public open fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.TypeCheckingProcedure[JavaMethodDescriptor]

'subType2' @ [232:50] ==> val subType2: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[LocalVariableDescriptor]

'superType2' @ [232:60] ==> val superType2: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[LocalVariableDescriptor]

'typeCheckingProcedure' @ [235:17] ==> value-parameter typeCheckingProcedure: TypeCheckingProcedure defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'isSubtypeOf' @ [235:39] ==> public open fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.TypeCheckingProcedure[JavaMethodDescriptor]

'subType2' @ [235:51] ==> val subType2: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[LocalVariableDescriptor]

'superType' @ [235:61] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[ValueParameterDescriptorImpl]

'!' @ [237:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [237:18] ==> val result: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint.simplifyConstraint[LocalVariableDescriptor]

'errors' @ [237:26] ==> internal final val errors: ArrayList<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'add' @ [237:33] ==> public open fun add(element: ConstraintError): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'newTypeInferenceOrParameterConstraintError' @ [237:37] ==> public fun newTypeInferenceOrParameterConstraintError(constraintPosition: ConstraintPosition): ConstraintError defined in org.jetbrains.kotlin.resolve.calls.inference[SimpleFunctionDescriptorImpl]

'constraintPosition' @ [237:80] ==> val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[LocalVariableDescriptor]

'constraintContext' @ [239:13] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'initial' @ [239:31] ==> public final val initial: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'storeInitialConstraint' @ [240:13] ==> private final fun storeInitialConstraint(constraintKind: ConstraintSystemBuilderImpl.ConstraintKind, subType: KotlinType, superType: KotlinType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'constraintKind' @ [240:36] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'subType' @ [240:52] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'superType' @ [240:61] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'constraintPosition' @ [240:72] ==> val constraintPosition: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[LocalVariableDescriptor]

'subType' @ [242:13] ==> value-parameter subType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'hasNoInferAnnotation' @ [242:21] ==> public fun KotlinType.hasNoInferAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'superType' @ [242:47] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'hasNoInferAnnotation' @ [242:57] ==> public fun KotlinType.hasNoInferAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'simplifyConstraint' @ [244:9] ==> local final fun simplifyConstraint(subType: KotlinType, superType: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[SimpleFunctionDescriptorImpl]

'newSubType' @ [244:28] ==> val newSubType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[LocalVariableDescriptor]

'superType' @ [244:40] ==> value-parameter superType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.doAddConstraint[ValueParameterDescriptorImpl]

'if (mode == Mode.SPECIFICITY || !isInitialConstraint)
                type
            else {
                // if subType is nullable and superType is not nullable, unsafe call or type mismatch error will be generated later,
                // but constraint system should be solved anyway
                TypeUtils.makeNotNullable(type)
            }' @ [248:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'mode' @ [248:17] ==> private final val mode: ConstraintSystemBuilderImpl.Mode defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'SPECIFICITY' @ [248:30] ==> enum entry SPECIFICITY defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Mode[FakeCallableDescriptorForObject]

'!' @ [248:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInitialConstraint' @ [248:46] ==> value-parameter isInitialConstraint: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.simplifyType[ValueParameterDescriptorImpl]

'type' @ [249:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.simplifyType[ValueParameterDescriptorImpl]

'makeNotNullable' @ [253:27] ==> @NotNull public open fun makeNotNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [253:43] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.simplifyType[ValueParameterDescriptorImpl]

'Bound' @ [262:21] ==> public constructor Bound(typeVariable: TypeVariable, constrainingType: KotlinType, kind: TypeBounds.BoundKind, position: ConstraintPosition, isProper: Boolean, derivedFrom: Set<TypeVariable>) defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[ClassConstructorDescriptorImpl]

'typeVariable' @ [262:27] ==> value-parameter typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[ValueParameterDescriptorImpl]

'constrainingType' @ [262:41] ==> value-parameter constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[ValueParameterDescriptorImpl]

'kind' @ [262:59] ==> value-parameter kind: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[ValueParameterDescriptorImpl]

'constraintContext' @ [262:65] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[ValueParameterDescriptorImpl]

'position' @ [262:83] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'constrainingType' @ [263:27] ==> value-parameter constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[ValueParameterDescriptorImpl]

'isProper' @ [263:44] ==> private final fun KotlinType.isProper(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'constraintContext' @ [263:56] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[ValueParameterDescriptorImpl]

'derivedFrom' @ [263:74] ==> public final val derivedFrom: Set<TypeVariable>? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'emptySet' @ [263:89] ==> public fun <T> emptySet(): Set<TypeVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'getTypeBounds' @ [264:26] ==> internal final fun getTypeBounds(variable: TypeVariable): TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [264:40] ==> value-parameter typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[ValueParameterDescriptorImpl]

'typeBounds' @ [265:13] ==> val typeBounds: TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'bounds' @ [265:24] ==> public open val bounds: ArrayList<TypeBounds.Bound> defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBoundsImpl[PropertyDescriptorImpl]

'contains' @ [265:31] ==> public open fun contains(element: TypeBounds.Bound): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bound' @ [265:40] ==> val bound: TypeBounds.Bound defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'typeBounds' @ [267:9] ==> val typeBounds: TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'addBound' @ [267:20] ==> public final fun addBound(bound: TypeBounds.Bound): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBoundsImpl[SimpleFunctionDescriptorImpl]

'bound' @ [267:29] ==> val bound: TypeBounds.Bound defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'!' @ [269:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'bound' @ [269:14] ==> val bound: TypeBounds.Bound defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'isProper' @ [269:20] ==> public final val isProper: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'getNestedTypeVariables' @ [270:43] ==> internal final fun getNestedTypeVariables(type: KotlinType): List<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'bound' @ [270:66] ==> val bound: TypeBounds.Bound defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'constrainingType' @ [270:72] ==> public final val constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'usedInBounds' @ [271:39] ==> internal final val usedInBounds: HashMap<TypeVariable, MutableList<TypeBounds.Bound>> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'getOrPut' @ [271:52] ==> public inline fun <K, V> MutableMap<TypeVariable, MutableList<TypeBounds.Bound>>.getOrPut(key: TypeVariable, defaultValue: () -> MutableList<TypeBounds.Bound>): MutableList<TypeBounds.Bound> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeVariable
    <V> -> MutableList<Bound>

'dependentTypeVariable' @ [271:61] ==> val dependentTypeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'arrayListOf' @ [271:86] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<TypeBounds.Bound> /* = ArrayList<TypeBounds.Bound> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Bound

'dependentBounds' @ [272:17] ==> val dependentBounds: MutableList<TypeBounds.Bound> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'add' @ [272:33] ==> public abstract fun add(element: TypeBounds.Bound): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'bound' @ [272:37] ==> val bound: TypeBounds.Bound defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'incorporateBound' @ [276:9] ==> public fun ConstraintSystemBuilderImpl.incorporateBound(newBound: TypeBounds.Bound): Unit defined in org.jetbrains.kotlin.resolve.calls.inference in file constraintIncorporation.kt[SimpleFunctionDescriptorImpl]

'bound' @ [276:26] ==> val bound: TypeBounds.Bound defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.addBound[LocalVariableDescriptor]

'getMyTypeVariable' @ [285:28] ==> internal final fun getMyTypeVariable(type: KotlinType): TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'parameterType' @ [285:46] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'constrainingType' @ [287:35] ==> value-parameter constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'parameterType' @ [297:13] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'isFlexible' @ [297:27] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [298:38] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'getCustomTypeVariable' @ [298:52] ==> public fun KotlinType.getCustomTypeVariable(): CustomTypeVariable? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'customTypeVariable' @ [299:17] ==> val customTypeVariable: CustomTypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'newConstrainingType' @ [300:17] ==> var newConstrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'customTypeVariable' @ [300:39] ==> val customTypeVariable: CustomTypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'substitutionResult' @ [300:58] ==> public abstract fun substitutionResult(replacement: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.CustomTypeVariable[DeserializedSimpleFunctionDescriptor]

'constrainingType' @ [300:77] ==> value-parameter constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'!' @ [304:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [304:14] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [304:28] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'!' @ [304:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [304:59] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'newConstrainingType' @ [304:74] ==> var newConstrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'addBound' @ [305:13] ==> internal final fun addBound(typeVariable: TypeVariable, constrainingType: KotlinType, kind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [305:22] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'newConstrainingType' @ [305:36] ==> var newConstrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'boundKind' @ [305:57] ==> value-parameter boundKind: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'constraintContext' @ [305:68] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'makeNotNullable' @ [313:49] ==> @NotNull public open fun makeNotNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'newConstrainingType' @ [313:65] ==> var newConstrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'boundKind' @ [314:13] ==> value-parameter boundKind: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'EXACT_BOUND' @ [314:26] ==> enum entry EXACT_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'boundKind' @ [314:41] ==> value-parameter boundKind: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'LOWER_BOUND' @ [314:54] ==> enum entry LOWER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'addBound' @ [315:13] ==> internal final fun addBound(typeVariable: TypeVariable, constrainingType: KotlinType, kind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [315:22] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'notNullConstrainingType' @ [315:36] ==> val notNullConstrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'LOWER_BOUND' @ [315:61] ==> enum entry LOWER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'constraintContext' @ [315:74] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'boundKind' @ [318:13] ==> value-parameter boundKind: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'EXACT_BOUND' @ [318:26] ==> enum entry EXACT_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'boundKind' @ [318:41] ==> value-parameter boundKind: TypeBounds.BoundKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'UPPER_BOUND' @ [318:54] ==> enum entry UPPER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'addBound' @ [319:13] ==> internal final fun addBound(typeVariable: TypeVariable, constrainingType: KotlinType, kind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [319:22] ==> val typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'newConstrainingType' @ [319:36] ==> var newConstrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[LocalVariableDescriptor]

'UPPER_BOUND' @ [319:57] ==> enum entry UPPER_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'constraintContext' @ [319:70] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterBound[ValueParameterDescriptorImpl]

'!' @ [329:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeVariable' @ [329:14] ==> value-parameter typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'originalTypeParameter' @ [329:27] ==> public final val originalTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'upperBounds' @ [329:49] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'let' @ [329:61] ==> @InlineOnly public inline fun <T, R> (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>).let(block: ((MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>..kotlin.collections.List<(org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)>)
    <R> -> Boolean

'it' @ [329:67] ==> value-parameter it: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [329:70] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'it' @ [329:83] ==> value-parameter it: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint.<anonymous>[ValueParameterDescriptorImpl]

'single' @ [329:86] ==> public fun <T> List<(KotlinType..KotlinType?)>.single(): (KotlinType..KotlinType?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'isDefaultBound' @ [329:95] ==> public fun KotlinType.isDefaultBound(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'constrainingTypeProjection' @ [330:13] ==> value-parameter constrainingTypeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'projectionKind' @ [330:40] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'IN_VARIANCE' @ [330:67] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'errors' @ [331:13] ==> internal final val errors: ArrayList<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'add' @ [331:20] ==> public open fun add(element: ConstraintError): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'CannotCapture' @ [331:24] ==> public constructor CannotCapture(constraintPosition: ConstraintPosition, typeVariable: TypeVariable) defined in org.jetbrains.kotlin.resolve.calls.inference.CannotCapture[ClassConstructorDescriptorImpl]

'constraintContext' @ [331:38] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'position' @ [331:56] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[PropertyDescriptorImpl]

'typeVariable' @ [331:66] ==> value-parameter typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'if (isTypeMarkedNullable) {
            TypeProjectionImpl(constrainingTypeProjection.projectionKind, TypeUtils.makeNotNullable(constrainingTypeProjection.type))
        }
        else {
            constrainingTypeProjection
        }' @ [333:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'isTypeMarkedNullable' @ [333:34] ==> value-parameter isTypeMarkedNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'TypeProjectionImpl' @ [334:13] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'constrainingTypeProjection' @ [334:32] ==> value-parameter constrainingTypeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'projectionKind' @ [334:59] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'makeNotNullable' @ [334:85] ==> @NotNull public open fun makeNotNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'constrainingTypeProjection' @ [334:101] ==> value-parameter constrainingTypeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'type' @ [334:128] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constrainingTypeProjection' @ [337:13] ==> value-parameter constrainingTypeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'createCapturedType' @ [339:28] ==> public fun createCapturedType(typeProjection: TypeProjection): KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'typeProjection' @ [339:47] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[LocalVariableDescriptor]

'addBound' @ [340:9] ==> internal final fun addBound(typeVariable: TypeVariable, constrainingType: KotlinType, kind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [340:18] ==> value-parameter typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'capturedType' @ [340:32] ==> val capturedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[LocalVariableDescriptor]

'EXACT_BOUND' @ [340:46] ==> enum entry EXACT_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'constraintContext' @ [340:59] ==> value-parameter constraintContext: ConstraintContext defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.generateTypeParameterCaptureConstraint[ValueParameterDescriptorImpl]

'allTypeParameterBounds' @ [344:16] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'variable' @ [344:39] ==> value-parameter variable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.getTypeBounds[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [345:22] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'variable' @ [345:119] ==> value-parameter variable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.getTypeBounds[ValueParameterDescriptorImpl]

'getMyTypeVariable' @ [349:13] ==> private final fun getMyTypeVariable(typeParameter: TypeParameterDescriptor): TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeParameter' @ [349:31] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isMyTypeVariable[ValueParameterDescriptorImpl]

'getMyTypeVariable' @ [352:13] ==> internal final fun getMyTypeVariable(type: KotlinType): TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'type' @ [352:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.isMyTypeVariable[ValueParameterDescriptorImpl]

'getMyTypeVariable' @ [355:16] ==> private final fun getMyTypeVariable(typeParameter: TypeParameterDescriptor): TypeVariable? defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'type' @ [355:34] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.getMyTypeVariable[ValueParameterDescriptorImpl]

'constructor' @ [355:39] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [355:51] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'allTypeParameterBounds' @ [359:13] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [359:36] ==> public open val keys: MutableSet<TypeVariable> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'find' @ [359:41] ==> @InlineOnly public inline fun <T> Iterable<TypeVariable>.find(predicate: (TypeVariable) -> Boolean): TypeVariable? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'it' @ [359:48] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.getMyTypeVariable.<anonymous>[ValueParameterDescriptorImpl]

'freshTypeParameter' @ [359:51] ==> internal final val freshTypeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'typeParameter' @ [359:73] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.getMyTypeVariable[ValueParameterDescriptorImpl]

'initialConstraints' @ [362:9] ==> internal final val initialConstraints: ArrayList<ConstraintSystemBuilderImpl.Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'add' @ [362:28] ==> public open fun add(element: ConstraintSystemBuilderImpl.Constraint): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Constraint' @ [362:32] ==> public constructor Constraint(kind: ConstraintSystemBuilderImpl.ConstraintKind, subtype: KotlinType, superType: KotlinType, position: ConstraintPosition) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Constraint[ClassConstructorDescriptorImpl]

'constraintKind' @ [362:43] ==> value-parameter constraintKind: ConstraintSystemBuilderImpl.ConstraintKind defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeInitialConstraint[ValueParameterDescriptorImpl]

'subType' @ [362:59] ==> value-parameter subType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeInitialConstraint[ValueParameterDescriptorImpl]

'superType' @ [362:68] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeInitialConstraint[ValueParameterDescriptorImpl]

'position' @ [362:79] ==> value-parameter position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.storeInitialConstraint[ValueParameterDescriptorImpl]

'getTypeBounds' @ [366:26] ==> internal final fun getTypeBounds(variable: TypeVariable): TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [366:40] ==> value-parameter typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[ValueParameterDescriptorImpl]

'typeBounds' @ [367:13] ==> val typeBounds: TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[LocalVariableDescriptor]

'isFixed' @ [367:24] ==> public final var isFixed: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBoundsImpl[PropertyDescriptorImpl]

'typeBounds' @ [368:9] ==> val typeBounds: TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[LocalVariableDescriptor]

'setFixed' @ [368:20] ==> public final fun setFixed(): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBoundsImpl[SimpleFunctionDescriptorImpl]

'typeBounds' @ [370:35] ==> val typeBounds: TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[LocalVariableDescriptor]

'bounds' @ [370:46] ==> public open val bounds: ArrayList<TypeBounds.Bound> defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBoundsImpl[PropertyDescriptorImpl]

'flatMap' @ [370:53] ==> public inline fun <T, R> Iterable<TypeBounds.Bound>.flatMap(transform: (TypeBounds.Bound) -> Iterable<TypeVariable>): List<TypeVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Bound
    <R> -> TypeVariable

'getNestedTypeVariables' @ [370:63] ==> internal final fun getNestedTypeVariables(type: KotlinType): List<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [370:86] ==> value-parameter it: TypeBounds.Bound defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable.<anonymous>[ValueParameterDescriptorImpl]

'constrainingType' @ [370:89] ==> public final val constrainingType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.Bound[PropertyDescriptorImpl]

'nestedTypeVariables' @ [371:9] ==> val nestedTypeVariables: List<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[LocalVariableDescriptor]

'forEach' @ [371:29] ==> @HidesMembers public inline fun <T> Iterable<TypeVariable>.forEach(action: (TypeVariable) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'fixVariable' @ [371:39] ==> private final fun fixVariable(typeVariable: TypeVariable): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [371:51] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable.<anonymous>[ValueParameterDescriptorImpl]

'typeBounds' @ [373:21] ==> val typeBounds: TypeBoundsImpl defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[LocalVariableDescriptor]

'value' @ [373:32] ==> public open val value: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBoundsImpl[PropertyDescriptorImpl]

'addBound' @ [375:9] ==> internal final fun addBound(typeVariable: TypeVariable, constrainingType: KotlinType, kind: TypeBounds.BoundKind, constraintContext: ConstraintContext): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'typeVariable' @ [375:18] ==> value-parameter typeVariable: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[ValueParameterDescriptorImpl]

'value' @ [375:32] ==> val value: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariable[LocalVariableDescriptor]

'EXACT_BOUND' @ [375:60] ==> enum entry EXACT_BOUND defined in org.jetbrains.kotlin.resolve.calls.inference.TypeBounds.BoundKind[FakeCallableDescriptorForObject]

'ConstraintContext' @ [375:73] ==> public constructor ConstraintContext(position: ConstraintPosition, derivedFrom: Set<TypeVariable>? = ..., initial: Boolean = ..., initialReduction: Boolean = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintContext[ClassConstructorDescriptorImpl]

'position' @ [375:129] ==> public final fun position(): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'other' @ [379:13] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [380:19] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'other' @ [380:96] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'!' @ [382:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'disjoint' @ [382:26] ==> public open fun disjoint(p0: (MutableCollection<*>..Collection<*>?), p1: (MutableCollection<*>..Collection<*>?)): Boolean defined in java.util.Collections[JavaMethodDescriptor]

'typeVariableSubstitutors' @ [382:35] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [382:60] ==> public open val keys: MutableSet<CallHandle> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'other' @ [382:66] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'typeVariableSubstitutors' @ [382:72] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [382:97] ==> public open val keys: MutableSet<CallHandle> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'IllegalArgumentException' @ [383:19] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'+' @ [384:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'typeVariableSubstitutors' @ [385:51] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [385:76] ==> public open val keys: MutableSet<CallHandle> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'other' @ [385:93] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'typeVariableSubstitutors' @ [385:99] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [385:124] ==> public open val keys: MutableSet<CallHandle> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'!' @ [388:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'disjoint' @ [388:26] ==> public open fun disjoint(p0: (MutableCollection<*>..Collection<*>?), p1: (MutableCollection<*>..Collection<*>?)): Boolean defined in java.util.Collections[JavaMethodDescriptor]

'other' @ [388:35] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'allTypeParameterBounds' @ [388:41] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [388:64] ==> public open val keys: MutableSet<TypeVariable> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'allTypeParameterBounds' @ [388:70] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [388:93] ==> public open val keys: MutableSet<TypeVariable> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'IllegalArgumentException' @ [389:19] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'+' @ [390:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'allTypeParameterBounds' @ [391:48] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [391:71] ==> public open val keys: MutableSet<TypeVariable> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'other' @ [391:88] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'allTypeParameterBounds' @ [391:94] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [391:117] ==> public open val keys: MutableSet<TypeVariable> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'allTypeParameterBounds' @ [395:9] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'putAll' @ [395:32] ==> public open fun putAll(from: Map<out TypeVariable, TypeBoundsImpl>): Unit defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'other' @ [395:39] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'allTypeParameterBounds' @ [395:45] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'usedInBounds' @ [396:9] ==> internal final val usedInBounds: HashMap<TypeVariable, MutableList<TypeBounds.Bound>> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'putAll' @ [396:22] ==> public open fun putAll(from: Map<out TypeVariable, MutableList<TypeBounds.Bound>>): Unit defined in java.util.HashMap[JavaMethodDescriptor]

'other' @ [396:29] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'usedInBounds' @ [396:35] ==> internal final val usedInBounds: HashMap<TypeVariable, MutableList<TypeBounds.Bound>> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'errors' @ [397:9] ==> internal final val errors: ArrayList<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'addAll' @ [397:16] ==> public open fun addAll(elements: Collection<ConstraintError>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'other' @ [397:23] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'errors' @ [397:29] ==> internal final val errors: ArrayList<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'initialConstraints' @ [398:9] ==> internal final val initialConstraints: ArrayList<ConstraintSystemBuilderImpl.Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'addAll' @ [398:28] ==> public open fun addAll(elements: Collection<ConstraintSystemBuilderImpl.Constraint>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'other' @ [398:35] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'initialConstraints' @ [398:41] ==> internal final val initialConstraints: ArrayList<ConstraintSystemBuilderImpl.Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'typeVariableSubstitutors' @ [399:9] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'putAll' @ [399:34] ==> public open fun putAll(from: Map<out CallHandle, TypeSubstitutor>): Unit defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'other' @ [399:41] ==> value-parameter other: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.add[ValueParameterDescriptorImpl]

'typeVariableSubstitutors' @ [399:47] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'component1' @ [404:14] ==> public final operator fun component1(): List<TypeVariable> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [404:24] ==> public final operator fun component2(): List<TypeVariable> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'allTypeParameterBounds' @ [404:50] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'keys' @ [404:73] ==> public open val keys: MutableSet<TypeVariable> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'partition' @ [404:78] ==> public inline fun <T> Iterable<TypeVariable>.partition(predicate: (TypeVariable) -> Boolean): Pair<List<TypeVariable>, List<TypeVariable>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'it' @ [404:90] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariables.<anonymous>[ValueParameterDescriptorImpl]

'isExternal' @ [404:93] ==> public final val isExternal: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.TypeVariable[PropertyDescriptorImpl]

'external' @ [405:9] ==> val external: List<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariables[LocalVariableDescriptor]

'forEach' @ [405:18] ==> @HidesMembers public inline fun <T> Iterable<TypeVariable>.forEach(action: (TypeVariable) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'fixVariable' @ [405:28] ==> private final fun fixVariable(typeVariable: TypeVariable): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [405:40] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariables.<anonymous>[ValueParameterDescriptorImpl]

'functionTypeParameters' @ [406:9] ==> val functionTypeParameters: List<TypeVariable> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariables[LocalVariableDescriptor]

'forEach' @ [406:32] ==> @HidesMembers public inline fun <T> Iterable<TypeVariable>.forEach(action: (TypeVariable) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariable

'fixVariable' @ [406:42] ==> private final fun fixVariable(typeVariable: TypeVariable): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[SimpleFunctionDescriptorImpl]

'it' @ [406:54] ==> value-parameter it: TypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.fixVariables.<anonymous>[ValueParameterDescriptorImpl]

'ConstraintSystemImpl' @ [410:16] ==> public constructor ConstraintSystemImpl(allTypeParameterBounds: Map<TypeVariable, TypeBoundsImpl>, usedInBounds: Map<TypeVariable, MutableList<TypeBounds.Bound>>, errors: List<ConstraintError>, initialConstraints: List<ConstraintSystemBuilderImpl.Constraint>, typeVariableSubstitutors: Map<CallHandle, TypeSubstitutor>) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemImpl[ClassConstructorDescriptorImpl]

'allTypeParameterBounds' @ [410:37] ==> internal final val allTypeParameterBounds: LinkedHashMap<TypeVariable, TypeBoundsImpl> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'usedInBounds' @ [410:61] ==> internal final val usedInBounds: HashMap<TypeVariable, MutableList<TypeBounds.Bound>> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'errors' @ [410:75] ==> internal final val errors: ArrayList<ConstraintError> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'initialConstraints' @ [410:83] ==> internal final val initialConstraints: ArrayList<ConstraintSystemBuilderImpl.Constraint> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'typeVariableSubstitutors' @ [410:103] ==> public open val typeVariableSubstitutors: LinkedHashMap<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[PropertyDescriptorImpl]

'ConstraintSystemBuilderImpl' @ [414:65] ==> public constructor ConstraintSystemBuilderImpl(mode: ConstraintSystemBuilderImpl.Mode = ...) defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[ClassConstructorDescriptorImpl]

'SPECIFICITY' @ [414:98] ==> enum entry SPECIFICITY defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Mode[FakeCallableDescriptorForObject]

'registerTypeVariables' @ [418:21] ==> public open fun registerTypeVariables(call: CallHandle, typeParameters: Collection<TypeParameterDescriptor>, external: Boolean): TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>[SimpleFunctionDescriptorImpl]

'NONE' @ [418:54] ==> public object NONE : CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference.CallHandle[FakeCallableDescriptorForObject]

'typeParameters' @ [418:60] ==> value-parameter typeParameters: Collection<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>.registerTypeVariables[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [421:21] ==> public open fun addSubtypeConstraint(constrainingType: KotlinType?, subjectType: KotlinType?, constraintPosition: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>[SimpleFunctionDescriptorImpl]

'subType' @ [421:42] ==> value-parameter subType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>.addSubtypeConstraint[ValueParameterDescriptorImpl]

'superType' @ [421:51] ==> value-parameter superType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>.addSubtypeConstraint[ValueParameterDescriptorImpl]

'position' @ [421:110] ==> public final fun position(index: Int): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'counter' @ [421:119] ==> public final var counter: Int defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>[PropertyDescriptorImpl]

'fixVariables' @ [424:17] ==> public open fun fixVariables(): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>[SimpleFunctionDescriptorImpl]

'build' @ [425:24] ==> public open fun build(): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl.Companion.forSpecificity.<no name provided>[SimpleFunctionDescriptorImpl]

'status' @ [425:32] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'hasContradiction' @ [425:39] ==> public abstract fun hasContradiction(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[SimpleFunctionDescriptorImpl]

'!' @ [435:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionPlaceholder' @ [435:10] ==> value-parameter functionPlaceholder: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[ValueParameterDescriptorImpl]

'isFunctionPlaceholder' @ [435:30] ==> public val KotlinType?.isFunctionPlaceholder: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'functionPlaceholder' @ [435:60] ==> value-parameter functionPlaceholder: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[ValueParameterDescriptorImpl]

'functionPlaceholder' @ [437:46] ==> value-parameter functionPlaceholder: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[ValueParameterDescriptorImpl]

'constructor' @ [437:66] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'expectedType' @ [439:23] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[ValueParameterDescriptorImpl]

'isBuiltinExtensionFunctionalType' @ [439:36] ==> public val KotlinType.isBuiltinExtensionFunctionalType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'if (!functionPlaceholderTypeConstructor.hasDeclaredArguments) {
        val typeParamSize = expectedType.constructor.parameters.size
        // the first parameter is receiver (if present), the last one is return type,
        // the remaining are function arguments
        val functionArgumentsSize = if (isExtension) typeParamSize - 2 else typeParamSize - 1
        val result = arrayListOf<KotlinType>()
        (1..functionArgumentsSize).forEach { result.add(DONT_CARE) }
        result
    }
    else {
        functionPlaceholderTypeConstructor.argumentTypes
    }' @ [440:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KotlinType>, elseBranch: List<KotlinType>): List<KotlinType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KotlinType>

'!' @ [440:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionPlaceholderTypeConstructor' @ [440:33] ==> val functionPlaceholderTypeConstructor: FunctionPlaceholderTypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'hasDeclaredArguments' @ [440:68] ==> public final val hasDeclaredArguments: Boolean defined in org.jetbrains.kotlin.types.FunctionPlaceholderTypeConstructor[DeserializedPropertyDescriptor]

'expectedType' @ [441:29] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[ValueParameterDescriptorImpl]

'constructor' @ [441:42] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [441:54] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [441:65] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (isExtension) typeParamSize - 2 else typeParamSize - 1' @ [444:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'isExtension' @ [444:41] ==> val isExtension: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'typeParamSize' @ [444:54] ==> val typeParamSize: Int defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'typeParamSize' @ [444:77] ==> val typeParamSize: Int defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'arrayListOf' @ [445:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'..' @ [446:10] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'functionArgumentsSize' @ [446:13] ==> val functionArgumentsSize: Int defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'forEach' @ [446:36] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'result' @ [446:46] ==> val result: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'add' @ [446:53] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'DONT_CARE' @ [446:57] ==> public final val DONT_CARE: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'result' @ [447:9] ==> val result: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'functionPlaceholderTypeConstructor' @ [450:9] ==> val functionPlaceholderTypeConstructor: FunctionPlaceholderTypeConstructor defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'argumentTypes' @ [450:44] ==> public final val argumentTypes: List<KotlinType> defined in org.jetbrains.kotlin.types.FunctionPlaceholderTypeConstructor[DeserializedPropertyDescriptor]

'if (isExtension) DONT_CARE else null' @ [452:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType?, elseBranch: SimpleType?): SimpleType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType?

'isExtension' @ [452:28] ==> val isExtension: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'DONT_CARE' @ [452:41] ==> public final val DONT_CARE: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'createFunctionType' @ [453:12] ==> @JvmOverloads public fun createFunctionType(builtIns: KotlinBuiltIns, annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, suspendFunction: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'functionPlaceholder' @ [453:31] ==> value-parameter functionPlaceholder: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[ValueParameterDescriptorImpl]

'builtIns' @ [453:51] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'Annotations' @ [453:61] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [453:73] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'receiverType' @ [453:80] ==> val receiverType: SimpleType? defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'newArgumentTypes' @ [453:94] ==> val newArgumentTypes: List<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[LocalVariableDescriptor]

'DONT_CARE' @ [453:118] ==> public final val DONT_CARE: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'expectedType' @ [454:49] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.inference.createTypeForFunctionPlaceholder[ValueParameterDescriptorImpl]

'isSuspendFunctionType' @ [454:62] ==> public val KotlinType.isSuspendFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

