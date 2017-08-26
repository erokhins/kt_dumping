'types' @ [28:24] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'maxBy' @ [28:30] ==> public inline fun <T, R : Comparable<Int>> Iterable<UnwrappedType>.maxBy(selector: (UnwrappedType) -> Int): UnwrappedType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R : Comparable<R>> -> Int

'it' @ [28:38] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'typeDepth' @ [28:41] ==> internal fun UnwrappedType.typeDepth(): Int defined in org.jetbrains.kotlin.types[SimpleFunctionDescriptorImpl]

'typeDepth' @ [28:56] ==> internal fun UnwrappedType.typeDepth(): Int defined in org.jetbrains.kotlin.types[SimpleFunctionDescriptorImpl]

'commonSuperType' @ [29:16] ==> private final fun commonSuperType(types: List<UnwrappedType>, depth: Int): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'types' @ [29:32] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'-' @ [29:39] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'maxDepth' @ [29:40] ==> val maxDepth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[LocalVariableDescriptor]

'types' @ [33:13] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'isEmpty' @ [33:19] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'IllegalStateException' @ [33:36] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'types' @ [35:9] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'singleOrNull' @ [35:15] ==> public fun <T> List<UnwrappedType>.singleOrNull(): UnwrappedType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'let' @ [35:31] ==> @InlineOnly public inline fun <T, R> UnwrappedType.let(block: (UnwrappedType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> Nothing

'it' @ [35:44] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'types' @ [39:22] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'map' @ [39:28] ==> public inline fun <T, R> Iterable<UnwrappedType>.map(transform: (UnwrappedType) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> SimpleType

'when (it) {
                is SimpleType -> it
                is FlexibleType -> {
                    if (it is DynamicType) return it
                    // raw types are allowed here and will be transformed to FlexibleTypes

                    thereIsFlexibleTypes = true
                    it.lowerBound
                }
            }' @ [40:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleType, entry1: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleType

'it' @ [40:19] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [41:34] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [43:25] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [43:51] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'thereIsFlexibleTypes' @ [46:21] ==> var thereIsFlexibleTypes: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[LocalVariableDescriptor]

'it' @ [47:21] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'lowerBound' @ [47:24] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'commonSuperTypeForSimpleTypes' @ [52:30] ==> private final fun commonSuperTypeForSimpleTypes(types: List<SimpleType>, depth: Int): SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'lowers' @ [52:60] ==> val lowers: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[LocalVariableDescriptor]

'depth' @ [52:68] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'!' @ [53:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thereIsFlexibleTypes' @ [53:14] ==> var thereIsFlexibleTypes: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[LocalVariableDescriptor]

'lowerSuperType' @ [53:43] ==> val lowerSuperType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[LocalVariableDescriptor]

'commonSuperTypeForSimpleTypes' @ [55:30] ==> private final fun commonSuperTypeForSimpleTypes(types: List<SimpleType>, depth: Int): SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'types' @ [55:60] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'map' @ [55:66] ==> public inline fun <T, R> Iterable<UnwrappedType>.map(transform: (UnwrappedType) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> SimpleType

'it' @ [55:72] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType.<anonymous>[ValueParameterDescriptorImpl]

'upperIfFlexible' @ [55:75] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'depth' @ [55:96] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[ValueParameterDescriptorImpl]

'KotlinTypeFactory' @ [56:16] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'flexibleType' @ [56:34] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'lowerSuperType' @ [56:47] ==> val lowerSuperType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[LocalVariableDescriptor]

'upperSuperType' @ [56:63] ==> val upperSuperType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperType[LocalVariableDescriptor]

'types' @ [61:29] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[ValueParameterDescriptorImpl]

'any' @ [61:35] ==> public inline fun <T> Iterable<SimpleType>.any(predicate: (SimpleType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'!' @ [61:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'NullabilityChecker' @ [61:42] ==> public object NullabilityChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'isSubtypeOfAny' @ [61:61] ==> public final fun isSubtypeOfAny(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.types.checker.NullabilityChecker[DeserializedSimpleFunctionDescriptor]

'it' @ [61:76] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes.<anonymous>[ValueParameterDescriptorImpl]

'if (notAllNotNull) types.map { it.makeNullableAsSpecified(false) } else types' @ [62:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<SimpleType>, elseBranch: List<SimpleType>): List<SimpleType>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<SimpleType>

'notAllNotNull' @ [62:32] ==> val notAllNotNull: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[LocalVariableDescriptor]

'types' @ [62:47] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[ValueParameterDescriptorImpl]

'map' @ [62:53] ==> public inline fun <T, R> Iterable<SimpleType>.map(transform: (SimpleType) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> SimpleType

'it' @ [62:59] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes.<anonymous>[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [62:62] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'types' @ [62:100] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[ValueParameterDescriptorImpl]

'commonSuperTypeForNotNullTypes' @ [64:32] ==> private final fun commonSuperTypeForNotNullTypes(types: List<SimpleType>, depth: Int): SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'notNullTypes' @ [64:63] ==> val notNullTypes: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[LocalVariableDescriptor]

'depth' @ [64:77] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[ValueParameterDescriptorImpl]

'if (notAllNotNull) commonSuperTypes.makeNullableAsSpecified(true) else commonSuperTypes' @ [66:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'notAllNotNull' @ [66:20] ==> val notAllNotNull: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[LocalVariableDescriptor]

'commonSuperTypes' @ [66:35] ==> val commonSuperTypes: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [66:52] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'commonSuperTypes' @ [66:87] ==> val commonSuperTypes: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForSimpleTypes[LocalVariableDescriptor]

'ArrayList' @ [70:22] ==> public final fun <E> <init>(): ArrayList<SimpleType> /* = ArrayList<SimpleType> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> SimpleType

'this' @ [71:22] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.uniquify[ReceiverParameterDescriptorImpl]

'!' @ [72:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'result' @ [72:18] ==> val result: ArrayList<SimpleType> /* = ArrayList<SimpleType> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.uniquify[LocalVariableDescriptor]

'any' @ [72:25] ==> public inline fun <T> Iterable<SimpleType>.any(predicate: (SimpleType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'NewKotlinTypeChecker' @ [72:31] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'equalTypes' @ [72:52] ==> public open fun equalTypes(a: KotlinType, b: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[DeserializedSimpleFunctionDescriptor]

'it' @ [72:63] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.uniquify.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [72:67] ==> val type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.uniquify[LocalVariableDescriptor]

'result' @ [73:17] ==> val result: ArrayList<SimpleType> /* = ArrayList<SimpleType> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.uniquify[LocalVariableDescriptor]

'add' @ [73:24] ==> public open fun add(element: SimpleType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'type' @ [73:28] ==> val type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.uniquify[LocalVariableDescriptor]

'result' @ [76:16] ==> val result: ArrayList<SimpleType> /* = ArrayList<SimpleType> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.uniquify[LocalVariableDescriptor]

'types' @ [80:27] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[ValueParameterDescriptorImpl]

'uniquify' @ [80:33] ==> private final fun List<SimpleType>.uniquify(): List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'uniqueTypes' @ [81:28] ==> val uniqueTypes: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[LocalVariableDescriptor]

'filterNot' @ [81:40] ==> public inline fun <T> Iterable<SimpleType>.filterNot(predicate: (SimpleType) -> Boolean): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'uniqueTypes' @ [82:13] ==> val uniqueTypes: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[LocalVariableDescriptor]

'any' @ [82:25] ==> public inline fun <T> Iterable<SimpleType>.any(predicate: (SimpleType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'type' @ [82:40] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes.<anonymous>[ValueParameterDescriptorImpl]

'other' @ [82:48] ==> value-parameter other: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'NewKotlinTypeChecker' @ [82:57] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'isSubtypeOf' @ [82:78] ==> public open fun isSubtypeOf(subtype: KotlinType, supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[DeserializedSimpleFunctionDescriptor]

'type' @ [82:90] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes.<anonymous>[ValueParameterDescriptorImpl]

'other' @ [82:96] ==> value-parameter other: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filteredType' @ [85:13] ==> val filteredType: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[LocalVariableDescriptor]

'isEmpty' @ [85:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'uniqueTypes' @ [85:44] ==> val uniqueTypes: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[LocalVariableDescriptor]

'first' @ [85:56] ==> public fun <T> List<SimpleType>.first(): SimpleType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'filteredType' @ [87:9] ==> val filteredType: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[LocalVariableDescriptor]

'singleOrNull' @ [87:22] ==> public fun <T> List<SimpleType>.singleOrNull(): SimpleType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'let' @ [87:38] ==> @InlineOnly public inline fun <T, R> SimpleType.let(block: (SimpleType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> Nothing

'it' @ [87:51] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes.<anonymous>[ValueParameterDescriptorImpl]

'findSuperTypeConstructorsAndIntersectResult' @ [89:16] ==> private final fun findSuperTypeConstructorsAndIntersectResult(types: List<SimpleType>, depth: Int): SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'filteredType' @ [89:60] ==> val filteredType: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[LocalVariableDescriptor]

'depth' @ [89:74] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.commonSuperTypeForNotNullTypes[ValueParameterDescriptorImpl]

'intersectTypes' @ [93:16] ==> public fun intersectTypes(types: List<SimpleType>): SimpleType defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'allCommonSuperTypeConstructors' @ [93:31] ==> private final fun allCommonSuperTypeConstructors(types: List<SimpleType>): List<TypeConstructor> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'types' @ [93:62] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.findSuperTypeConstructorsAndIntersectResult[ValueParameterDescriptorImpl]

'map' @ [93:69] ==> public inline fun <T, R> Iterable<TypeConstructor>.map(transform: (TypeConstructor) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor
    <R> -> SimpleType

'superTypeWithGivenConstructor' @ [93:75] ==> private final fun superTypeWithGivenConstructor(types: List<SimpleType>, constructor: TypeConstructor, depth: Int): SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'types' @ [93:105] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.findSuperTypeConstructorsAndIntersectResult[ValueParameterDescriptorImpl]

'it' @ [93:112] ==> value-parameter it: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.findSuperTypeConstructorsAndIntersectResult.<anonymous>[ValueParameterDescriptorImpl]

'depth' @ [93:116] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.findSuperTypeConstructorsAndIntersectResult[ValueParameterDescriptorImpl]

'collectAllSupertypes' @ [100:22] ==> private final fun collectAllSupertypes(type: SimpleType): LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'types' @ [100:43] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[ValueParameterDescriptorImpl]

'first' @ [100:49] ==> public fun <T> List<SimpleType>.first(): SimpleType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'types' @ [101:22] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[ValueParameterDescriptorImpl]

'type' @ [102:17] ==> val type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[LocalVariableDescriptor]

'types' @ [102:26] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[ValueParameterDescriptorImpl]

'first' @ [102:32] ==> public fun <T> List<SimpleType>.first(): SimpleType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'result' @ [104:13] ==> val result: LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[LocalVariableDescriptor]

'retainAll' @ [104:20] ==> public open fun retainAll(elements: Collection<TypeConstructor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'collectAllSupertypes' @ [104:30] ==> private final fun collectAllSupertypes(type: SimpleType): LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'type' @ [104:51] ==> val type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[LocalVariableDescriptor]

'result' @ [106:16] ==> val result: LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[LocalVariableDescriptor]

'filterNot' @ [106:23] ==> public inline fun <T> Iterable<TypeConstructor>.filterNot(predicate: (TypeConstructor) -> Boolean): List<TypeConstructor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'result' @ [107:13] ==> val result: LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors[LocalVariableDescriptor]

'any' @ [107:20] ==> public inline fun <T> Iterable<TypeConstructor>.any(predicate: (TypeConstructor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeConstructor

'other' @ [108:17] ==> value-parameter other: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [108:26] ==> value-parameter target: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors.<anonymous>[ValueParameterDescriptorImpl]

'other' @ [108:36] ==> value-parameter other: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'supertypes' @ [108:42] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'any' @ [108:53] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.any(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [108:59] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [108:62] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'target' @ [108:77] ==> value-parameter target: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.allCommonSuperTypeConstructors.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [113:58] ==> public final fun <E> <init>(): LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> TypeConstructor

'apply' @ [113:91] ==> @InlineOnly public inline fun <T> LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */.apply(block: LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */.() -> Unit): LinkedHashSet<TypeConstructor> /* = LinkedHashSet<TypeConstructor> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashSet<TypeConstructor>

'type' @ [114:9] ==> value-parameter type: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.collectAllSupertypes[ValueParameterDescriptorImpl]

'anySuperTypeConstructor' @ [114:14] ==> public fun UnwrappedType.anySuperTypeConstructor(predicate: (TypeConstructor) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'add' @ [114:40] ==> public open fun add(element: TypeConstructor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'it' @ [114:44] ==> value-parameter it: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.collectAllSupertypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [122:13] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'parameters' @ [122:25] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [122:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'KotlinTypeFactory' @ [122:54] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [122:72] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [122:83] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [122:95] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'constructor' @ [122:102] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'emptyList' @ [122:115] ==> public fun <T> emptyList(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'TypeCheckerContext' @ [124:34] ==> public constructor TypeCheckerContext(errorTypeEqualsToAnything: Boolean, allowedTypeVariable: Boolean = ...) defined in org.jetbrains.kotlin.types.checker.TypeCheckerContext[DeserializedClassConstructorDescriptor]

'types' @ [132:39] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'flatMap' @ [132:45] ==> public inline fun <T, R> Iterable<SimpleType>.flatMap(transform: (SimpleType) -> Iterable<SimpleType>): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> SimpleType

'with' @ [133:13] ==> @InlineOnly public inline fun <T, R> with(receiver: NewKotlinTypeChecker, block: NewKotlinTypeChecker.() -> List<SimpleType>): List<SimpleType> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewKotlinTypeChecker
    <R> -> List<SimpleType>

'NewKotlinTypeChecker' @ [133:18] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'typeCheckerContext' @ [134:17] ==> val typeCheckerContext: TypeCheckerContext defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'findCorrespondingSupertypes' @ [134:36] ==> public final fun TypeCheckerContext.findCorrespondingSupertypes(baseType: SimpleType, constructor: TypeConstructor): List<SimpleType> defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[DeserializedSimpleFunctionDescriptor]

'it' @ [134:64] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [134:68] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'ArrayList' @ [138:25] ==> public final fun <E> <init>(p0: Int): ArrayList<TypeProjection> /* = ArrayList<TypeProjection> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> TypeProjection

'constructor' @ [138:51] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'parameters' @ [138:63] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [138:74] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [139:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [139:22] ==> public final operator fun component2(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'constructor' @ [139:36] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'parameters' @ [139:48] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'withIndex' @ [139:59] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.withIndex(): Iterable<IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'correspondingSuperTypes' @ [141:35] ==> val correspondingSuperTypes: List<SimpleType> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'mapNotNull' @ [141:59] ==> public inline fun <T, R : Any> Iterable<SimpleType>.mapNotNull(transform: (SimpleType) -> TypeProjection?): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R : Any> -> TypeProjection

'it' @ [142:17] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [142:20] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getOrNull' @ [142:30] ==> public fun <T> List<TypeProjection>.getOrNull(index: Int): TypeProjection? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'index' @ [142:40] ==> val index: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'let' @ [142:48] ==> @InlineOnly public inline fun <T, R> TypeProjection.let(block: (TypeProjection) -> TypeProjection?): TypeProjection? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjection?

'if (it.isStarProjection) {
                        thereIsStar = true
                        null
                    } else it' @ [143:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection?, elseBranch: TypeProjection?): TypeProjection?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection?

'it' @ [143:25] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isStarProjection' @ [143:28] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'thereIsStar' @ [144:25] ==> var thereIsStar: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'it' @ [146:28] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (thereIsStar || typeProjections.isEmpty()) {
                        StarProjectionImpl(parameter)
                    }
                    else {
                        calculateArgument(parameter, typeProjections, depth)
                    }' @ [151:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'thereIsStar' @ [151:25] ==> var thereIsStar: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'typeProjections' @ [151:40] ==> val typeProjections: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'isEmpty' @ [151:56] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'StarProjectionImpl' @ [152:25] ==> public constructor StarProjectionImpl(typeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.types.StarProjectionImpl[DeserializedClassConstructorDescriptor]

'parameter' @ [152:44] ==> val parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'calculateArgument' @ [155:25] ==> private final fun calculateArgument(parameter: TypeParameterDescriptor, arguments: List<TypeProjection>, depth: Int): TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'parameter' @ [155:43] ==> val parameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'typeProjections' @ [155:54] ==> val typeProjections: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'depth' @ [155:71] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'arguments' @ [158:13] ==> val arguments: ArrayList<TypeProjection> /* = ArrayList<TypeProjection> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'add' @ [158:23] ==> public open fun add(element: TypeProjection): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'argument' @ [158:27] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'KotlinTypeFactory' @ [160:16] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [160:34] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [160:45] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [160:57] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'constructor' @ [160:64] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[ValueParameterDescriptorImpl]

'arguments' @ [160:77] ==> val arguments: ArrayList<TypeProjection> /* = ArrayList<TypeProjection> */ defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.superTypeWithGivenConstructor[LocalVariableDescriptor]

'depth' @ [165:13] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'StarProjectionImpl' @ [166:20] ==> public constructor StarProjectionImpl(typeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.types.StarProjectionImpl[DeserializedClassConstructorDescriptor]

'parameter' @ [166:39] ==> value-parameter parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'parameter' @ [170:13] ==> value-parameter parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'variance' @ [170:23] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [170:44] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'arguments' @ [170:57] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'all' @ [170:67] ==> public inline fun <T> Iterable<TypeProjection>.all(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [170:73] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [170:76] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'INVARIANT' @ [170:103] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'arguments' @ [171:25] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'first' @ [171:35] ==> public fun <T> List<TypeProjection>.first(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'arguments' @ [172:17] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'all' @ [172:27] ==> public inline fun <T> Iterable<TypeProjection>.all(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [172:33] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [172:36] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'first' @ [172:44] ==> val first: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'type' @ [172:50] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'first' @ [172:65] ==> val first: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'if (parameter.variance != Variance.INVARIANT) {
            asOut = parameter.variance == Variance.OUT_VARIANCE
        }
        else {
            val thereIsOut = arguments.any { it.projectionKind == Variance.OUT_VARIANCE }
            val thereIsIn = arguments.any { it.projectionKind == Variance.IN_VARIANCE }
            if (thereIsOut) {
                if (thereIsIn) {
                    // CS(Inv<out X>, Inv<in Y>) = Inv<*>
                    return StarProjectionImpl(parameter)
                }
                else {
                    asOut = true
                }
            }
            else {
                asOut = !thereIsIn
            }
        }' @ [176:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameter' @ [176:13] ==> value-parameter parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'variance' @ [176:23] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [176:44] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'asOut' @ [177:13] ==> val asOut: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'parameter' @ [177:21] ==> value-parameter parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'variance' @ [177:31] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'OUT_VARIANCE' @ [177:52] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'arguments' @ [180:30] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'any' @ [180:40] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [180:46] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [180:49] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'OUT_VARIANCE' @ [180:76] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'arguments' @ [181:29] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'any' @ [181:39] ==> public inline fun <T> Iterable<TypeProjection>.any(predicate: (TypeProjection) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [181:45] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument.<anonymous>[ValueParameterDescriptorImpl]

'projectionKind' @ [181:48] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'IN_VARIANCE' @ [181:75] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'if (thereIsOut) {
                if (thereIsIn) {
                    // CS(Inv<out X>, Inv<in Y>) = Inv<*>
                    return StarProjectionImpl(parameter)
                }
                else {
                    asOut = true
                }
            }
            else {
                asOut = !thereIsIn
            }' @ [182:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'thereIsOut' @ [182:17] ==> val thereIsOut: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'if (thereIsIn) {
                    // CS(Inv<out X>, Inv<in Y>) = Inv<*>
                    return StarProjectionImpl(parameter)
                }
                else {
                    asOut = true
                }' @ [183:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'thereIsIn' @ [183:21] ==> val thereIsIn: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'StarProjectionImpl' @ [185:28] ==> public constructor StarProjectionImpl(typeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.types.StarProjectionImpl[DeserializedClassConstructorDescriptor]

'parameter' @ [185:47] ==> value-parameter parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'asOut' @ [188:21] ==> val asOut: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'asOut' @ [192:17] ==> val asOut: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'!' @ [192:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thereIsIn' @ [192:26] ==> val thereIsIn: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'if (asOut) {
            val type = commonSuperType(arguments.map { it.type.unwrap() }, depth + 1)
            return if (parameter.variance != Variance.INVARIANT) return type.asTypeProjection() else TypeProjectionImpl(Variance.OUT_VARIANCE, type)
        }
        else {
            val type = intersectTypes(arguments.map { it.type.unwrap() })
            return if (parameter.variance != Variance.INVARIANT) return type.asTypeProjection() else TypeProjectionImpl(Variance.IN_VARIANCE, type)
        }' @ [198:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'asOut' @ [198:13] ==> val asOut: Boolean defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'commonSuperType' @ [199:24] ==> private final fun commonSuperType(types: List<UnwrappedType>, depth: Int): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator[SimpleFunctionDescriptorImpl]

'arguments' @ [199:40] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'map' @ [199:50] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> UnwrappedType

'it' @ [199:56] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [199:59] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [199:64] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'depth' @ [199:76] ==> value-parameter depth: Int defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'if (parameter.variance != Variance.INVARIANT) return type.asTypeProjection() else TypeProjectionImpl(Variance.OUT_VARIANCE, type)' @ [200:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'parameter' @ [200:24] ==> value-parameter parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'variance' @ [200:34] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [200:55] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'type' @ [200:73] ==> val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'asTypeProjection' @ [200:78] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'TypeProjectionImpl' @ [200:102] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'OUT_VARIANCE' @ [200:130] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'type' @ [200:144] ==> val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'intersectTypes' @ [203:24] ==> public fun intersectTypes(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'arguments' @ [203:39] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'map' @ [203:49] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> UnwrappedType

'it' @ [203:55] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [203:58] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [203:63] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'if (parameter.variance != Variance.INVARIANT) return type.asTypeProjection() else TypeProjectionImpl(Variance.IN_VARIANCE, type)' @ [204:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'parameter' @ [204:24] ==> value-parameter parameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[ValueParameterDescriptorImpl]

'variance' @ [204:34] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'INVARIANT' @ [204:55] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'type' @ [204:73] ==> val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

'asTypeProjection' @ [204:78] ==> public fun KotlinType.asTypeProjection(): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'TypeProjectionImpl' @ [204:102] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'IN_VARIANCE' @ [204:130] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'type' @ [204:143] ==> val type: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.NewCommonSuperTypeCalculator.calculateArgument[LocalVariableDescriptor]

