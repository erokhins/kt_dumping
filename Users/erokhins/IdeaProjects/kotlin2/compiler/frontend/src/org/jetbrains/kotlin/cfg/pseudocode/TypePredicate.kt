'DEFAULT' @ [31:79] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [31:87] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'typeToCheck' @ [31:98] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.SingleType.invoke[ValueParameterDescriptorImpl]

'targetType' @ [31:111] ==> public final val targetType: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.SingleType[PropertyDescriptorImpl]

'targetType' @ [32:39] ==> public final val targetType: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.SingleType[PropertyDescriptorImpl]

'render' @ [32:50] ==> private fun KotlinType.render(): String defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'DEFAULT' @ [36:79] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [36:87] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'typeToCheck' @ [36:99] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.AllSubtypes.invoke[ValueParameterDescriptorImpl]

'upperBound' @ [36:112] ==> public final val upperBound: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.AllSubtypes[PropertyDescriptorImpl]

'upperBound' @ [38:46] ==> public final val upperBound: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.AllSubtypes[PropertyDescriptorImpl]

'render' @ [38:57] ==> private fun KotlinType.render(): String defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'typeSets' @ [42:61] ==> public final val typeSets: List<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.ForAllTypes[PropertyDescriptorImpl]

'all' @ [42:70] ==> public inline fun <T> Iterable<TypePredicate>.all(predicate: (TypePredicate) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'invoke' @ [42:76] ==> public abstract fun invoke(typeToCheck: KotlinType): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.TypePredicate[SimpleFunctionDescriptorImpl]

'typeToCheck' @ [42:79] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.ForAllTypes.invoke[ValueParameterDescriptorImpl]

'typeSets' @ [44:46] ==> public final val typeSets: List<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.ForAllTypes[PropertyDescriptorImpl]

'joinToString' @ [44:55] ==> public fun <T> Iterable<TypePredicate>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TypePredicate) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'typeSets' @ [48:61] ==> public final val typeSets: List<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.ForSomeType[PropertyDescriptorImpl]

'any' @ [48:70] ==> public inline fun <T> Iterable<TypePredicate>.any(predicate: (TypePredicate) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'invoke' @ [48:76] ==> public abstract fun invoke(typeToCheck: KotlinType): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.TypePredicate[SimpleFunctionDescriptorImpl]

'typeToCheck' @ [48:79] ==> value-parameter typeToCheck: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.ForSomeType.invoke[ValueParameterDescriptorImpl]

'typeSets' @ [50:45] ==> public final val typeSets: List<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.ForSomeType[PropertyDescriptorImpl]

'joinToString' @ [50:54] ==> public fun <T> Iterable<TypePredicate>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((TypePredicate) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'when (predicates.size) {
            0 -> AllTypes
            1 -> predicates.first()
            else -> ForAllTypes(predicates.toList())
        }' @ [61:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypePredicate, entry1: TypePredicate, entry2: TypePredicate): TypePredicate[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypePredicate

'predicates' @ [61:15] ==> value-parameter predicates: Collection<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.and[ValueParameterDescriptorImpl]

'size' @ [61:26] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'AllTypes' @ [62:18] ==> public object AllTypes : TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[FakeCallableDescriptorForObject]

'predicates' @ [63:18] ==> value-parameter predicates: Collection<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.and[ValueParameterDescriptorImpl]

'first' @ [63:29] ==> public fun <T> Iterable<TypePredicate>.first(): TypePredicate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'ForAllTypes' @ [64:21] ==> public constructor ForAllTypes(typeSets: List<TypePredicate>) defined in org.jetbrains.kotlin.cfg.pseudocode.ForAllTypes[ClassConstructorDescriptorImpl]

'predicates' @ [64:33] ==> value-parameter predicates: Collection<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.and[ValueParameterDescriptorImpl]

'toList' @ [64:44] ==> public fun <T> Iterable<TypePredicate>.toList(): List<TypePredicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'when (predicates.size) {
            0 -> null
            1 -> predicates.first()
            else -> ForSomeType(predicates.toList())
        }' @ [68:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypePredicate?, entry1: TypePredicate?, entry2: TypePredicate?): TypePredicate?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypePredicate?

'predicates' @ [68:15] ==> value-parameter predicates: Collection<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.or[ValueParameterDescriptorImpl]

'size' @ [68:26] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'predicates' @ [70:18] ==> value-parameter predicates: Collection<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.or[ValueParameterDescriptorImpl]

'first' @ [70:29] ==> public fun <T> Iterable<TypePredicate>.first(): TypePredicate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'ForSomeType' @ [71:21] ==> public constructor ForSomeType(typeSets: List<TypePredicate>) defined in org.jetbrains.kotlin.cfg.pseudocode.ForSomeType[ClassConstructorDescriptorImpl]

'predicates' @ [71:33] ==> value-parameter predicates: Collection<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.or[ValueParameterDescriptorImpl]

'toList' @ [71:44] ==> public fun <T> Iterable<TypePredicate>.toList(): List<TypePredicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypePredicate

'when {
    KotlinBuiltIns.isAnyOrNullableAny(this) && isMarkedNullable -> AllTypes
    TypeUtils.canHaveSubtypes(KotlinTypeChecker.DEFAULT, this) -> AllSubtypes(this)
    else -> SingleType(this)
}' @ [74:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypePredicate, entry1: TypePredicate, entry2: TypePredicate): TypePredicate[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypePredicate

'isAnyOrNullableAny' @ [75:20] ==> public open fun isAnyOrNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'this' @ [75:39] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getSubtypesPredicate[ReceiverParameterDescriptorImpl]

'isMarkedNullable' @ [75:48] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'AllTypes' @ [75:68] ==> public object AllTypes : TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[FakeCallableDescriptorForObject]

'canHaveSubtypes' @ [76:15] ==> public open fun canHaveSubtypes(p0: (KotlinTypeChecker..KotlinTypeChecker?), @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'DEFAULT' @ [76:49] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'this' @ [76:58] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getSubtypesPredicate[ReceiverParameterDescriptorImpl]

'AllSubtypes' @ [76:67] ==> public constructor AllSubtypes(upperBound: KotlinType) defined in org.jetbrains.kotlin.cfg.pseudocode.AllSubtypes[ClassConstructorDescriptorImpl]

'this' @ [76:79] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getSubtypesPredicate[ReceiverParameterDescriptorImpl]

'SingleType' @ [77:13] ==> public constructor SingleType(targetType: KotlinType) defined in org.jetbrains.kotlin.cfg.pseudocode.SingleType[ClassConstructorDescriptorImpl]

'this' @ [77:24] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getSubtypesPredicate[ReceiverParameterDescriptorImpl]

'DescriptorRenderer' @ [81:43] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'SHORT_NAMES_IN_TYPES' @ [81:62] ==> @field:JvmField public final val SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [81:83] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [81:94] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.render[ReceiverParameterDescriptorImpl]

'keys' @ [84:9] ==> value-parameter keys: Iterable<T> defined in org.jetbrains.kotlin.cfg.pseudocode.expectedTypeFor[ValueParameterDescriptorImpl]

'fold' @ [84:14] ==> public inline fun <T, R> Iterable<T>.fold(initial: (SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>..SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>?), operation: (acc: (SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>..SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>?), T) -> (SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>..SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>?)): (SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>..SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> (com.intellij.util.SmartFMap<(T..T?), (org.jetbrains.kotlin.cfg.pseudocode.TypePredicate..org.jetbrains.kotlin.cfg.pseudocode.TypePredicate?)>..com.intellij.util.SmartFMap<(T..T?), (org.jetbrains.kotlin.cfg.pseudocode.TypePredicate..org.jetbrains.kotlin.cfg.pseudocode.TypePredicate?)>?)

'emptyMap' @ [84:29] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> emptyMap(): (SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>..SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> T
    <V : (Any..Any?)> -> TypePredicate

'map' @ [84:73] ==> value-parameter map: (SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>..SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>?) defined in org.jetbrains.kotlin.cfg.pseudocode.expectedTypeFor.<anonymous>[ValueParameterDescriptorImpl]

'plus' @ [84:77] ==> public open fun plus(@NotNull p0: T, p1: (TypePredicate..TypePredicate?)): (SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>..SmartFMap<(T..T?), (TypePredicate..TypePredicate?)>?) defined in com.intellij.util.SmartFMap[JavaMethodDescriptor]

'key' @ [84:82] ==> value-parameter key: T defined in org.jetbrains.kotlin.cfg.pseudocode.expectedTypeFor.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [84:87] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.expectedTypeFor[ReceiverParameterDescriptorImpl]

