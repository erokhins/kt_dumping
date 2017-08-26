'intersectTypes' @ [24:60] ==> public fun intersectTypes(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.types.checker in file IntersectionType.kt[SimpleFunctionDescriptorImpl]

'types' @ [24:75] ==> value-parameter types: Collection<KotlinType> defined in org.jetbrains.kotlin.types.checker.intersectWrappedTypes[ValueParameterDescriptorImpl]

'map' @ [24:81] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> UnwrappedType

'it' @ [24:87] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.types.checker.intersectWrappedTypes.<anonymous>[ValueParameterDescriptorImpl]

'unwrap' @ [24:90] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[SimpleFunctionDescriptorImpl]

'intersectTypes' @ [27:47] ==> public fun intersectTypes(types: List<UnwrappedType>): UnwrappedType defined in org.jetbrains.kotlin.types.checker in file IntersectionType.kt[SimpleFunctionDescriptorImpl]

'types' @ [27:62] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[ValueParameterDescriptorImpl]

'when (types.size) {
        0 -> error("Expected some types")
        1 -> return types.single()
    }' @ [30:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'types' @ [30:11] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[ValueParameterDescriptorImpl]

'size' @ [30:17] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'error' @ [31:14] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'types' @ [32:21] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[ValueParameterDescriptorImpl]

'single' @ [32:27] ==> public fun <T> List<UnwrappedType>.single(): UnwrappedType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType

'types' @ [36:23] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[ValueParameterDescriptorImpl]

'map' @ [36:29] ==> public inline fun <T, R> Iterable<UnwrappedType>.map(transform: (UnwrappedType) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> SimpleType

'hasErrorType' @ [37:9] ==> var hasErrorType: Boolean defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'hasErrorType' @ [37:24] ==> var hasErrorType: Boolean defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'it' @ [37:40] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.checker.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'isError' @ [37:43] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types in file KotlinType.kt[PropertyDescriptorImpl]

'when (it) {
            is SimpleType -> it
            is FlexibleType -> {
                if (it.isDynamic()) return it

                hasFlexibleTypes = true
                it.lowerBound
            }
        }' @ [38:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleType, entry1: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleType

'it' @ [38:15] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.checker.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [39:30] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.checker.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [41:21] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.checker.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'isDynamic' @ [41:24] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types in file dynamicTypes.kt[SimpleFunctionDescriptorImpl]

'it' @ [41:44] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.checker.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'hasFlexibleTypes' @ [43:17] ==> var hasFlexibleTypes: Boolean defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'it' @ [44:17] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.checker.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'lowerBound' @ [44:20] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'hasErrorType' @ [48:9] ==> var hasErrorType: Boolean defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'createErrorType' @ [49:27] ==> @NotNull public open fun createErrorType(@NotNull debugMessage: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'types' @ [49:74] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[ValueParameterDescriptorImpl]

'!' @ [52:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasFlexibleTypes' @ [52:10] ==> var hasFlexibleTypes: Boolean defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'TypeIntersector' @ [53:16] ==> public object TypeIntersector defined in org.jetbrains.kotlin.types.checker in file IntersectionType.kt[FakeCallableDescriptorForObject]

'intersectTypes' @ [53:32] ==> internal final fun intersectTypes(types: List<SimpleType>): SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector[SimpleFunctionDescriptorImpl]

'lowerBounds' @ [53:47] ==> val lowerBounds: List<SimpleType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'types' @ [56:23] ==> value-parameter types: List<UnwrappedType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[ValueParameterDescriptorImpl]

'map' @ [56:29] ==> public inline fun <T, R> Iterable<UnwrappedType>.map(transform: (UnwrappedType) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnwrappedType
    <R> -> SimpleType

'it' @ [56:35] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.types.checker.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'upperIfFlexible' @ [56:38] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'KotlinTypeFactory' @ [64:12] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types in file KotlinTypeFactory.kt[FakeCallableDescriptorForObject]

'flexibleType' @ [64:30] ==> @JvmStatic public final fun flexibleType(lowerBound: SimpleType, upperBound: SimpleType): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'intersectTypes' @ [64:59] ==> internal final fun intersectTypes(types: List<SimpleType>): SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector[SimpleFunctionDescriptorImpl]

'lowerBounds' @ [64:74] ==> val lowerBounds: List<SimpleType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'intersectTypes' @ [64:104] ==> internal final fun intersectTypes(types: List<SimpleType>): SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector[SimpleFunctionDescriptorImpl]

'upperBounds' @ [64:119] ==> val upperBounds: List<SimpleType> defined in org.jetbrains.kotlin.types.checker.intersectTypes[LocalVariableDescriptor]

'assert' @ [71:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'types' @ [71:16] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[ValueParameterDescriptorImpl]

'size' @ [71:22] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'types' @ [72:53] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[ValueParameterDescriptorImpl]

'size' @ [72:59] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ArrayList' @ [74:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SimpleType

'types' @ [75:22] ==> value-parameter types: List<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[ValueParameterDescriptorImpl]

'if (type.constructor is IntersectionTypeConstructor) {
                inputTypes.addAll(type.constructor.supertypes.map {
                    it.upperIfFlexible().let { if (type.isMarkedNullable) it.makeNullableAsSpecified(true) else it }
                })
            }
            else {
                inputTypes.add(type)
            }' @ [76:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'type' @ [76:17] ==> val type: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'constructor' @ [76:22] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'inputTypes' @ [77:17] ==> val inputTypes: ArrayList<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'addAll' @ [77:28] ==> public open fun addAll(elements: Collection<SimpleType>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'type' @ [77:35] ==> val type: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'constructor' @ [77:40] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'supertypes' @ [77:52] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'map' @ [77:63] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> SimpleType

'it' @ [78:21] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'upperIfFlexible' @ [78:24] ==> public fun KotlinType.upperIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'let' @ [78:42] ==> @InlineOnly public inline fun <T, R> SimpleType.let(block: (SimpleType) -> SimpleType): SimpleType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> SimpleType

'if (type.isMarkedNullable) it.makeNullableAsSpecified(true) else it' @ [78:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'type' @ [78:52] ==> val type: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'isMarkedNullable' @ [78:57] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'it' @ [78:75] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [78:78] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'it' @ [78:113] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'inputTypes' @ [82:17] ==> val inputTypes: ArrayList<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'add' @ [82:28] ==> public open fun add(element: SimpleType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'type' @ [82:32] ==> val type: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'inputTypes' @ [85:33] ==> val inputTypes: ArrayList<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'fold' @ [85:44] ==> public inline fun <T, R> Iterable<SimpleType>.fold(initial: TypeIntersector.ResultNullability, operation: (acc: TypeIntersector.ResultNullability, SimpleType) -> TypeIntersector.ResultNullability): TypeIntersector.ResultNullability defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> ResultNullability

'START' @ [85:67] ==> enum entry START defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[FakeCallableDescriptorForObject]

'ResultNullability' @ [85:74] ==> private constructor ResultNullability() defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[ClassConstructorDescriptorImpl]

'combine' @ [85:93] ==> public abstract fun combine(nextType: UnwrappedType): TypeIntersector.ResultNullability defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[SimpleFunctionDescriptorImpl]

'inputTypes' @ [93:34] ==> val inputTypes: ArrayList<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'mapTo' @ [93:45] ==> public inline fun <T, R, C : MutableCollection<in SimpleType>> Iterable<SimpleType>.mapTo(destination: HashSet<SimpleType> /* = HashSet<SimpleType> */, transform: (SimpleType) -> SimpleType): HashSet<SimpleType> /* = HashSet<SimpleType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> SimpleType
    <C : MutableCollection<in R>> -> HashSet<SimpleType>

'HashSet' @ [93:51] ==> public final fun <E> <init>(): HashSet<SimpleType> /* = HashSet<SimpleType> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> SimpleType

'if (resultNullability == ResultNullability.NOT_NULL) it.makeNullableAsSpecified(false) else it' @ [94:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'resultNullability' @ [94:17] ==> val resultNullability: TypeIntersector.ResultNullability defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'NOT_NULL' @ [94:56] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[FakeCallableDescriptorForObject]

'it' @ [94:66] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'makeNullableAsSpecified' @ [94:69] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'it' @ [94:105] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes.<anonymous>[ValueParameterDescriptorImpl]

'intersectTypesWithoutIntersectionType' @ [97:16] ==> private final fun intersectTypesWithoutIntersectionType(inputTypes: Set<SimpleType>): SimpleType defined in org.jetbrains.kotlin.types.checker.TypeIntersector[SimpleFunctionDescriptorImpl]

'correctNullability' @ [97:54] ==> val correctNullability: HashSet<SimpleType> /* = HashSet<SimpleType> */ defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypes[LocalVariableDescriptor]

'inputTypes' @ [102:13] ==> value-parameter inputTypes: Set<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[ValueParameterDescriptorImpl]

'size' @ [102:24] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'inputTypes' @ [102:42] ==> value-parameter inputTypes: Set<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[ValueParameterDescriptorImpl]

'single' @ [102:53] ==> public fun <T> Iterable<SimpleType>.single(): SimpleType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'ArrayList' @ [106:42] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (SimpleType..SimpleType?)>..Collection<(SimpleType..SimpleType?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.types.SimpleType..org.jetbrains.kotlin.types.SimpleType?)

'inputTypes' @ [106:52] ==> value-parameter inputTypes: Set<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[ValueParameterDescriptorImpl]

'filteredSuperAndEqualTypes' @ [107:24] ==> val filteredSuperAndEqualTypes: ArrayList<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'iterator' @ [107:51] ==> public open fun iterator(): MutableIterator<(SimpleType..SimpleType?)> defined in java.util.ArrayList[JavaMethodDescriptor]

'iterator' @ [108:16] ==> val iterator: MutableIterator<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'hasNext' @ [108:25] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [109:25] ==> val iterator: MutableIterator<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'next' @ [109:34] ==> public abstract fun next(): (SimpleType..SimpleType?) defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'filteredSuperAndEqualTypes' @ [110:45] ==> val filteredSuperAndEqualTypes: ArrayList<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'any' @ [110:72] ==> public inline fun <T> Iterable<(SimpleType..SimpleType?)>.any(predicate: ((SimpleType..SimpleType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.SimpleType..org.jetbrains.kotlin.types.SimpleType?)

'lower' @ [111:17] ==> value-parameter lower: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType.<anonymous>[ValueParameterDescriptorImpl]

'upper' @ [111:27] ==> val upper: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'isStrictSupertype' @ [111:37] ==> private final fun isStrictSupertype(subtype: KotlinType, supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.TypeIntersector[SimpleFunctionDescriptorImpl]

'lower' @ [111:55] ==> value-parameter lower: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType.<anonymous>[ValueParameterDescriptorImpl]

'upper' @ [111:62] ==> val upper: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'NewKotlinTypeChecker' @ [111:72] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker in file NewKotlinTypeChecker.kt[FakeCallableDescriptorForObject]

'equalTypes' @ [111:93] ==> public open fun equalTypes(a: KotlinType, b: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[SimpleFunctionDescriptorImpl]

'lower' @ [111:104] ==> value-parameter lower: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType.<anonymous>[ValueParameterDescriptorImpl]

'upper' @ [111:111] ==> val upper: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'strictSupertypeOrHasEqual' @ [114:17] ==> val strictSupertypeOrHasEqual: Boolean defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'iterator' @ [114:44] ==> val iterator: MutableIterator<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'remove' @ [114:53] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'assert' @ [117:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'filteredSuperAndEqualTypes' @ [117:16] ==> val filteredSuperAndEqualTypes: ArrayList<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'isNotEmpty' @ [117:43] ==> @InlineOnly public inline fun <T> Collection<(SimpleType..SimpleType?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.SimpleType..org.jetbrains.kotlin.types.SimpleType?)

'inputTypes' @ [118:63] ==> value-parameter inputTypes: Set<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[ValueParameterDescriptorImpl]

'joinToString' @ [118:74] ==> public fun <T> Iterable<SimpleType>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((SimpleType) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'filteredSuperAndEqualTypes' @ [121:13] ==> val filteredSuperAndEqualTypes: ArrayList<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'size' @ [121:40] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'filteredSuperAndEqualTypes' @ [121:57] ==> val filteredSuperAndEqualTypes: ArrayList<(SimpleType..SimpleType?)> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'single' @ [121:84] ==> public fun <T> List<(SimpleType..SimpleType?)>.single(): (SimpleType..SimpleType?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.SimpleType..org.jetbrains.kotlin.types.SimpleType?)

'IntersectionTypeConstructor' @ [123:27] ==> public constructor IntersectionTypeConstructor(typesToIntersect: (MutableCollection<(KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>?)) defined in org.jetbrains.kotlin.types.IntersectionTypeConstructor[JavaClassConstructorDescriptor]

'inputTypes' @ [123:55] ==> value-parameter inputTypes: Set<SimpleType> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[ValueParameterDescriptorImpl]

'KotlinTypeFactory' @ [124:16] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types in file KotlinTypeFactory.kt[FakeCallableDescriptorForObject]

'simpleType' @ [124:34] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'EMPTY' @ [124:57] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'constructor' @ [124:64] ==> val constructor: IntersectionTypeConstructor defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'listOf' @ [124:77] ==> @InlineOnly public inline fun <T> listOf(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'constructor' @ [124:94] ==> val constructor: IntersectionTypeConstructor defined in org.jetbrains.kotlin.types.checker.TypeIntersector.intersectTypesWithoutIntersectionType[LocalVariableDescriptor]

'createScopeForKotlinType' @ [124:106] ==> public open fun createScopeForKotlinType(): (MemberScope..MemberScope?) defined in org.jetbrains.kotlin.types.IntersectionTypeConstructor[JavaMethodDescriptor]

'with' @ [128:16] ==> @InlineOnly public inline fun <T, R> with(receiver: NewKotlinTypeChecker, block: NewKotlinTypeChecker.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewKotlinTypeChecker
    <R> -> Boolean

'NewKotlinTypeChecker' @ [128:21] ==> public object NewKotlinTypeChecker : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker in file NewKotlinTypeChecker.kt[FakeCallableDescriptorForObject]

'isSubtypeOf' @ [129:13] ==> public open fun isSubtypeOf(subtype: KotlinType, supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[SimpleFunctionDescriptorImpl]

'subtype' @ [129:25] ==> value-parameter subtype: KotlinType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.isStrictSupertype[ValueParameterDescriptorImpl]

'supertype' @ [129:34] ==> value-parameter supertype: KotlinType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.isStrictSupertype[ValueParameterDescriptorImpl]

'!' @ [129:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSubtypeOf' @ [129:49] ==> public open fun isSubtypeOf(subtype: KotlinType, supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.NewKotlinTypeChecker[SimpleFunctionDescriptorImpl]

'supertype' @ [129:61] ==> value-parameter supertype: KotlinType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.isStrictSupertype[ValueParameterDescriptorImpl]

'subtype' @ [129:72] ==> value-parameter subtype: KotlinType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.isStrictSupertype[ValueParameterDescriptorImpl]

'nextType' @ [138:61] ==> value-parameter nextType: UnwrappedType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.START.combine[ValueParameterDescriptorImpl]

'resultNullability' @ [138:70] ==> protected final val UnwrappedType.resultNullability: TypeIntersector.ResultNullability defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.START[PropertyDescriptorImpl]

'nextType' @ [141:61] ==> value-parameter nextType: UnwrappedType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.ACCEPT_NULL.combine[ValueParameterDescriptorImpl]

'resultNullability' @ [141:70] ==> protected final val UnwrappedType.resultNullability: TypeIntersector.ResultNullability defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.ACCEPT_NULL[PropertyDescriptorImpl]

'nextType' @ [146:21] ==> value-parameter nextType: UnwrappedType defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.UNKNOWN.combine[ValueParameterDescriptorImpl]

'resultNullability' @ [146:30] ==> protected final val UnwrappedType.resultNullability: TypeIntersector.ResultNullability defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.UNKNOWN[PropertyDescriptorImpl]

'let' @ [146:48] ==> @InlineOnly public inline fun <T, R> TypeIntersector.ResultNullability.let(block: (TypeIntersector.ResultNullability) -> TypeIntersector.ResultNullability): TypeIntersector.ResultNullability defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResultNullability
    <R> -> ResultNullability

'if (it == ACCEPT_NULL) this else it' @ [147:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeIntersector.ResultNullability, elseBranch: TypeIntersector.ResultNullability): TypeIntersector.ResultNullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResultNullability

'it' @ [147:29] ==> value-parameter it: TypeIntersector.ResultNullability defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.UNKNOWN.combine.<anonymous>[ValueParameterDescriptorImpl]

'ACCEPT_NULL' @ [147:35] ==> enum entry ACCEPT_NULL defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[FakeCallableDescriptorForObject]

'this' @ [147:48] ==> <this> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.UNKNOWN[LazyClassReceiverParameterDescriptor]

'it' @ [147:58] ==> value-parameter it: TypeIntersector.ResultNullability defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.UNKNOWN.combine.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [151:61] ==> <this> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.NOT_NULL[LazyClassReceiverParameterDescriptor]

'isMarkedNullable' @ [158:21] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.UnwrappedType[PropertyDescriptorImpl]

'ACCEPT_NULL' @ [158:46] ==> enum entry ACCEPT_NULL defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[FakeCallableDescriptorForObject]

'if (NullabilityChecker.isSubtypeOfAny(this)) {
                    return NOT_NULL
                }
                else {
                    return UNKNOWN
                }' @ [160:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'NullabilityChecker' @ [160:21] ==> public object NullabilityChecker defined in org.jetbrains.kotlin.types.checker in file NewKotlinTypeChecker.kt[FakeCallableDescriptorForObject]

'isSubtypeOfAny' @ [160:40] ==> public final fun isSubtypeOfAny(type: UnwrappedType): Boolean defined in org.jetbrains.kotlin.types.checker.NullabilityChecker[SimpleFunctionDescriptorImpl]

'this' @ [160:55] ==> <this> defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability.resultNullability[ReceiverParameterDescriptorImpl]

'NOT_NULL' @ [161:28] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[FakeCallableDescriptorForObject]

'UNKNOWN' @ [164:28] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.types.checker.TypeIntersector.ResultNullability[FakeCallableDescriptorForObject]

