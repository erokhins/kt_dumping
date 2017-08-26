'if (type.nullable) "$this?" else this' @ [10:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'type' @ [10:62] ==> value-parameter type: Type defined in org.jetbrains.idl2k.appendNullabilitySuffix[ValueParameterDescriptorImpl]

'nullable' @ [10:67] ==> public abstract val nullable: Boolean defined in org.jetbrains.idl2k.Type[PropertyDescriptorImpl]

'this' @ [10:79] ==> <this> defined in org.jetbrains.idl2k.appendNullabilitySuffix[ReceiverParameterDescriptorImpl]

'this' @ [10:91] ==> <this> defined in org.jetbrains.idl2k.appendNullabilitySuffix[ReceiverParameterDescriptorImpl]

'Type' @ [12:19] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'Type' @ [18:22] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'Type' @ [24:61] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'appendNullabilitySuffix' @ [25:35] ==> private fun String.appendNullabilitySuffix(type: Type): String defined in org.jetbrains.idl2k in file types.kt[SimpleFunctionDescriptorImpl]

'this' @ [25:59] ==> <this> defined in org.jetbrains.idl2k.AnyType[LazyClassReceiverParameterDescriptor]

'Type' @ [27:75] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'type' @ [28:29] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'appendNullabilitySuffix' @ [28:34] ==> private fun String.appendNullabilitySuffix(type: Type): String defined in org.jetbrains.idl2k in file types.kt[SimpleFunctionDescriptorImpl]

'this' @ [28:58] ==> <this> defined in org.jetbrains.idl2k.SimpleType[LazyClassReceiverParameterDescriptor]

'Type' @ [30:120] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'if (nullable) "(${renderImpl()})?" else renderImpl()' @ [31:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'nullable' @ [31:33] ==> public open val nullable: Boolean defined in org.jetbrains.idl2k.FunctionType[PropertyDescriptorImpl]

'renderImpl' @ [31:47] ==> private final fun renderImpl(): String defined in org.jetbrains.idl2k.FunctionType[SimpleFunctionDescriptorImpl]

'renderImpl' @ [31:69] ==> private final fun renderImpl(): String defined in org.jetbrains.idl2k.FunctionType[SimpleFunctionDescriptorImpl]

'parameterTypes' @ [32:36] ==> public final val parameterTypes: List<Attribute> defined in org.jetbrains.idl2k.FunctionType[PropertyDescriptorImpl]

'joinToString' @ [32:51] ==> public fun <T> Iterable<Attribute>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Attribute) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attribute

'it' @ [32:72] ==> value-parameter it: Attribute defined in org.jetbrains.idl2k.FunctionType.renderImpl.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [32:75] ==> public final val type: Type defined in org.jetbrains.idl2k.Attribute[PropertyDescriptorImpl]

'render' @ [32:80] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'returnType' @ [32:98] ==> public final val returnType: Type defined in org.jetbrains.idl2k.FunctionType[PropertyDescriptorImpl]

'render' @ [32:109] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'Type' @ [34:79] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'valueType' @ [35:40] ==> public final val valueType: Type defined in org.jetbrains.idl2k.PromiseType[PropertyDescriptorImpl]

'render' @ [35:50] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'appendNullabilitySuffix' @ [35:62] ==> private fun String.appendNullabilitySuffix(type: Type): String defined in org.jetbrains.idl2k in file types.kt[SimpleFunctionDescriptorImpl]

'this' @ [35:86] ==> <this> defined in org.jetbrains.idl2k.PromiseType[LazyClassReceiverParameterDescriptor]

'parameterTypes' @ [39:13] ==> public final val parameterTypes: List<Attribute> defined in org.jetbrains.idl2k.FunctionType[PropertyDescriptorImpl]

'size' @ [39:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'Type' @ [41:99] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'LinkedHashSet' @ [42:34] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (Type..Type?)>..Collection<(Type..Type?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.idl2k.Type..org.jetbrains.idl2k.Type?)

'types' @ [42:48] ==> value-parameter types: Collection<Type> defined in org.jetbrains.idl2k.UnionType.<init>[ValueParameterDescriptorImpl]

'sortedBy' @ [42:54] ==> public inline fun <T, R : Comparable<String>> Iterable<Type>.sortedBy(crossinline selector: (Type) -> String?): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R : Comparable<R>> -> String

'it' @ [42:65] ==> value-parameter it: Type defined in org.jetbrains.idl2k.UnionType.memberTypes.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [42:68] ==> public open fun toString(): String defined in org.jetbrains.idl2k.Type[DeserializedSimpleFunctionDescriptor]

'this' @ [43:24] ==> <this> defined in org.jetbrains.idl2k.UnionType[LazyClassReceiverParameterDescriptor]

'memberTypes' @ [43:29] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'map' @ [43:41] ==> public inline fun <T, R> Iterable<Type>.map(transform: (Type) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> String

'it' @ [43:47] ==> value-parameter it: Type defined in org.jetbrains.idl2k.UnionType.name.<anonymous>[ValueParameterDescriptorImpl]

'render' @ [43:50] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'joinToString' @ [43:61] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'type' @ [45:41] ==> value-parameter type: Type defined in org.jetbrains.idl2k.UnionType.contains[ValueParameterDescriptorImpl]

'memberTypes' @ [45:49] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'other' @ [46:49] ==> value-parameter other: Any? defined in org.jetbrains.idl2k.UnionType.equals[ValueParameterDescriptorImpl]

'memberTypes' @ [46:71] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'other' @ [46:86] ==> value-parameter other: Any? defined in org.jetbrains.idl2k.UnionType.equals[ValueParameterDescriptorImpl]

'memberTypes' @ [46:92] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'memberTypes' @ [47:36] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'hashCode' @ [47:48] ==> public open fun hashCode(): Int defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'memberTypes' @ [48:39] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'joinToString' @ [48:51] ==> public fun <T> Iterable<Type>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Type) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'name' @ [50:37] ==> public final val name: String defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'appendNullabilitySuffix' @ [50:42] ==> private fun String.appendNullabilitySuffix(type: Type): String defined in org.jetbrains.idl2k in file types.kt[SimpleFunctionDescriptorImpl]

'this' @ [50:66] ==> <this> defined in org.jetbrains.idl2k.UnionType[LazyClassReceiverParameterDescriptor]

'this' @ [52:34] ==> <this> defined in org.jetbrains.idl2k.UnionType[LazyClassReceiverParameterDescriptor]

'namespace' @ [52:39] ==> public final val namespace: String defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'this' @ [52:76] ==> <this> defined in org.jetbrains.idl2k.UnionType[LazyClassReceiverParameterDescriptor]

'memberTypes' @ [52:81] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'this' @ [52:114] ==> <this> defined in org.jetbrains.idl2k.UnionType[LazyClassReceiverParameterDescriptor]

'nullable' @ [52:119] ==> public open val nullable: Boolean defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'UnionType' @ [53:13] ==> public constructor UnionType(namespace: String, types: Collection<Type>, nullable: Boolean) defined in org.jetbrains.idl2k.UnionType[ClassConstructorDescriptorImpl]

'namespace' @ [53:23] ==> value-parameter namespace: String = ... defined in org.jetbrains.idl2k.UnionType.copy[ValueParameterDescriptorImpl]

'types' @ [53:34] ==> value-parameter types: Collection<Type> = ... defined in org.jetbrains.idl2k.UnionType.copy[ValueParameterDescriptorImpl]

'nullable' @ [53:41] ==> value-parameter nullable: Boolean = ... defined in org.jetbrains.idl2k.UnionType.copy[ValueParameterDescriptorImpl]

'if (this.memberTypes.size == 1) this.memberTypes.single().withNullability(nullable) else this' @ [56:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'this' @ [56:46] ==> <this> defined in org.jetbrains.idl2k.toSingleTypeIfPossible[ReceiverParameterDescriptorImpl]

'memberTypes' @ [56:51] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'size' @ [56:63] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'this' @ [56:74] ==> <this> defined in org.jetbrains.idl2k.toSingleTypeIfPossible[ReceiverParameterDescriptorImpl]

'memberTypes' @ [56:79] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'single' @ [56:91] ==> public fun <T> Iterable<Type>.single(): Type defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'withNullability' @ [56:100] ==> public fun <T : Type> Type.withNullability(nullable: Boolean): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'nullable' @ [56:116] ==> public open val nullable: Boolean defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'this' @ [56:131] ==> <this> defined in org.jetbrains.idl2k.toSingleTypeIfPossible[ReceiverParameterDescriptorImpl]

'Type' @ [58:100] ==> private constructor Type() defined in org.jetbrains.idl2k.Type[ClassConstructorDescriptorImpl]

'if (mutable) "" else "out "' @ [59:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'mutable' @ [59:50] ==> public final val mutable: Boolean defined in org.jetbrains.idl2k.ArrayType[PropertyDescriptorImpl]

'memberType' @ [59:76] ==> public final val memberType: Type defined in org.jetbrains.idl2k.ArrayType[PropertyDescriptorImpl]

'render' @ [59:87] ==> public abstract fun render(): String defined in org.jetbrains.idl2k.Type[SimpleFunctionDescriptorImpl]

'appendNullabilitySuffix' @ [59:99] ==> private fun String.appendNullabilitySuffix(type: Type): String defined in org.jetbrains.idl2k in file types.kt[SimpleFunctionDescriptorImpl]

'this' @ [59:123] ==> <this> defined in org.jetbrains.idl2k.ArrayType[LazyClassReceiverParameterDescriptor]

'Suppress' @ [62:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (this) {
    is UnitType -> UnitType
    is DynamicType -> this

    is AnyType -> this.copy(nullable = nullable)
    is SimpleType -> this.copy(nullable = nullable)
    is FunctionType -> this.copy(nullable = nullable)
    is UnionType -> this.copy(types = this.memberTypes, nullable = nullable)
    is ArrayType -> this.copy(nullable = nullable)
    is PromiseType -> this.copy(nullable = nullable)
    else -> throw UnsupportedOperationException()
}' @ [63:69] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type, entry3: Type, entry4: Type, entry5: Type, entry6: Type, entry7: Type, entry8: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'this' @ [63:75] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'UnitType' @ [64:20] ==> public object UnitType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'this' @ [65:23] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'this' @ [67:19] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'copy' @ [67:24] ==> public final fun copy(nullable: Boolean = ...): AnyType defined in org.jetbrains.idl2k.AnyType[SimpleFunctionDescriptorImpl]

'nullable' @ [67:40] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.copyWithNullability[ValueParameterDescriptorImpl]

'this' @ [68:22] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'copy' @ [68:27] ==> public final fun copy(type: String = ..., nullable: Boolean = ...): SimpleType defined in org.jetbrains.idl2k.SimpleType[SimpleFunctionDescriptorImpl]

'nullable' @ [68:43] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.copyWithNullability[ValueParameterDescriptorImpl]

'this' @ [69:24] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'copy' @ [69:29] ==> public final fun copy(parameterTypes: List<Attribute> = ..., returnType: Type = ..., nullable: Boolean = ...): FunctionType defined in org.jetbrains.idl2k.FunctionType[SimpleFunctionDescriptorImpl]

'nullable' @ [69:45] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.copyWithNullability[ValueParameterDescriptorImpl]

'this' @ [70:21] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'copy' @ [70:26] ==> public final fun copy(namespace: String = ..., types: Collection<Type> = ..., nullable: Boolean = ...): UnionType defined in org.jetbrains.idl2k.UnionType[SimpleFunctionDescriptorImpl]

'this' @ [70:39] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'memberTypes' @ [70:44] ==> public final val memberTypes: Set<Type> defined in org.jetbrains.idl2k.UnionType[PropertyDescriptorImpl]

'nullable' @ [70:68] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.copyWithNullability[ValueParameterDescriptorImpl]

'this' @ [71:21] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'copy' @ [71:26] ==> public final fun copy(memberType: Type = ..., mutable: Boolean = ..., nullable: Boolean = ...): ArrayType defined in org.jetbrains.idl2k.ArrayType[SimpleFunctionDescriptorImpl]

'nullable' @ [71:42] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.copyWithNullability[ValueParameterDescriptorImpl]

'this' @ [72:23] ==> <this> defined in org.jetbrains.idl2k.copyWithNullability[ReceiverParameterDescriptorImpl]

'copy' @ [72:28] ==> public final fun copy(valueType: Type = ..., nullable: Boolean = ...): PromiseType defined in org.jetbrains.idl2k.PromiseType[SimpleFunctionDescriptorImpl]

'nullable' @ [72:44] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.copyWithNullability[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [73:19] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'if (this.nullable == nullable) this else copyWithNullability(nullable)' @ [77:69] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'this' @ [77:73] ==> <this> defined in org.jetbrains.idl2k.withNullabilityImpl[ReceiverParameterDescriptorImpl]

'nullable' @ [77:78] ==> public abstract val nullable: Boolean defined in org.jetbrains.idl2k.Type[PropertyDescriptorImpl]

'nullable' @ [77:90] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.withNullabilityImpl[ValueParameterDescriptorImpl]

'this' @ [77:100] ==> <this> defined in org.jetbrains.idl2k.withNullabilityImpl[ReceiverParameterDescriptorImpl]

'copyWithNullability' @ [77:110] ==> @Suppress private fun <T : Type> T.copyWithNullability(nullable: Boolean): T defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> T

'nullable' @ [77:130] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.withNullabilityImpl[ValueParameterDescriptorImpl]

'withNullabilityImpl' @ [78:57] ==> private fun <T : Type> T.withNullabilityImpl(nullable: Boolean): T defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> T

'this' @ [78:77] ==> <this> defined in org.jetbrains.idl2k.withNullability[ReceiverParameterDescriptorImpl]

'nullable' @ [78:82] ==> public abstract val nullable: Boolean defined in org.jetbrains.idl2k.Type[PropertyDescriptorImpl]

'nullable' @ [78:94] ==> value-parameter nullable: Boolean defined in org.jetbrains.idl2k.withNullability[ValueParameterDescriptorImpl]

'withNullabilityImpl' @ [79:35] ==> private fun <T : Type> T.withNullabilityImpl(nullable: Boolean): T defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> T

'withNullabilityImpl' @ [80:37] ==> private fun <T : Type> T.withNullabilityImpl(nullable: Boolean): T defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> T

'Suppress' @ [82:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (this) {
    is UnitType -> UnitType
    is DynamicType -> DynamicType

    is SimpleType -> when (this.type) {
        "Int", "Short", "Byte", "Float", "Double", "Boolean", "Long" -> this
        else -> this.toNullable()
    }
    else -> this.toNullable()
}' @ [83:49] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type, entry2: Type, entry3: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'this' @ [83:55] ==> <this> defined in org.jetbrains.idl2k.toNullableIfNonPrimitive[ReceiverParameterDescriptorImpl]

'UnitType' @ [84:20] ==> public object UnitType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'DynamicType' @ [85:23] ==> public object DynamicType : Type defined in org.jetbrains.idl2k in file types.kt[FakeCallableDescriptorForObject]

'when (this.type) {
        "Int", "Short", "Byte", "Float", "Double", "Boolean", "Long" -> this
        else -> this.toNullable()
    }' @ [87:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type, entry1: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type

'this' @ [87:28] ==> <this> defined in org.jetbrains.idl2k.toNullableIfNonPrimitive[ReceiverParameterDescriptorImpl]

'type' @ [87:33] ==> public final val type: String defined in org.jetbrains.idl2k.SimpleType[PropertyDescriptorImpl]

'this' @ [88:73] ==> <this> defined in org.jetbrains.idl2k.toNullableIfNonPrimitive[ReceiverParameterDescriptorImpl]

'this' @ [89:17] ==> <this> defined in org.jetbrains.idl2k.toNullableIfNonPrimitive[ReceiverParameterDescriptorImpl]

'toNullable' @ [89:22] ==> public fun <T : Type> Type.toNullable(): Type defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> Type

'this' @ [91:13] ==> <this> defined in org.jetbrains.idl2k.toNullableIfNonPrimitive[ReceiverParameterDescriptorImpl]

'toNullable' @ [91:18] ==> public fun <T : Type> T.toNullable(): T defined in org.jetbrains.idl2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Type> -> T

