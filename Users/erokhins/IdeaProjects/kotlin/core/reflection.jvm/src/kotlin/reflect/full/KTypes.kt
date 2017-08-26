'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'SinceKotlin' @ [29:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'isMarkedNullable' @ [31:9] ==> public abstract val isMarkedNullable: Boolean defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'if (nullable) this else KTypeImpl(TypeUtils.makeNotNullable((this as KTypeImpl).type)) { javaType }' @ [32:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KType, elseBranch: KType): KType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KType

'nullable' @ [32:20] ==> value-parameter nullable: Boolean defined in kotlin.reflect.full.withNullability[ValueParameterDescriptorImpl]

'this' @ [32:30] ==> <this> defined in kotlin.reflect.full.withNullability[ReceiverParameterDescriptorImpl]

'KTypeImpl' @ [32:40] ==> public constructor KTypeImpl(type: KotlinType, computeJavaType: () -> Type) defined in kotlin.reflect.jvm.internal.KTypeImpl[ClassConstructorDescriptorImpl]

'makeNotNullable' @ [32:60] ==> @NotNull public open fun makeNotNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [32:77] ==> <this> defined in kotlin.reflect.full.withNullability[ReceiverParameterDescriptorImpl]

'type' @ [32:96] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'javaType' @ [32:105] ==> internal final val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'this' @ [36:23] ==> <this> defined in kotlin.reflect.full.withNullability[ReceiverParameterDescriptorImpl]

'type' @ [36:42] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'kotlinType' @ [37:9] ==> val kotlinType: KotlinType defined in kotlin.reflect.full.withNullability[LocalVariableDescriptor]

'isFlexible' @ [37:20] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types in file flexibleTypes.kt[SimpleFunctionDescriptorImpl]

'KTypeImpl' @ [37:41] ==> public constructor KTypeImpl(type: KotlinType, computeJavaType: () -> Type) defined in kotlin.reflect.jvm.internal.KTypeImpl[ClassConstructorDescriptorImpl]

'makeNullableAsSpecified' @ [37:61] ==> @NotNull public open fun makeNullableAsSpecified(@NotNull type: KotlinType, nullable: Boolean): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'kotlinType' @ [37:85] ==> val kotlinType: KotlinType defined in kotlin.reflect.full.withNullability[LocalVariableDescriptor]

'nullable' @ [37:97] ==> value-parameter nullable: Boolean defined in kotlin.reflect.full.withNullability[ValueParameterDescriptorImpl]

'javaType' @ [37:110] ==> internal final val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'if (!nullable) this else KTypeImpl(TypeUtils.makeNullable(kotlinType)) { javaType }' @ [39:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KType, elseBranch: KType): KType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KType

'!' @ [39:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullable' @ [39:17] ==> value-parameter nullable: Boolean defined in kotlin.reflect.full.withNullability[ValueParameterDescriptorImpl]

'this' @ [39:27] ==> <this> defined in kotlin.reflect.full.withNullability[ReceiverParameterDescriptorImpl]

'KTypeImpl' @ [39:37] ==> public constructor KTypeImpl(type: KotlinType, computeJavaType: () -> Type) defined in kotlin.reflect.jvm.internal.KTypeImpl[ClassConstructorDescriptorImpl]

'makeNullable' @ [39:57] ==> @NotNull public open fun makeNullable(@NotNull type: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'kotlinType' @ [39:70] ==> val kotlinType: KotlinType defined in kotlin.reflect.full.withNullability[LocalVariableDescriptor]

'javaType' @ [39:85] ==> internal final val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'SinceKotlin' @ [46:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'this' @ [48:13] ==> <this> defined in kotlin.reflect.full.isSubtypeOf[ReceiverParameterDescriptorImpl]

'type' @ [48:32] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'isSubtypeOf' @ [48:37] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'other' @ [48:50] ==> value-parameter other: KType defined in kotlin.reflect.full.isSubtypeOf[ValueParameterDescriptorImpl]

'type' @ [48:70] ==> public final val type: KotlinType defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'SinceKotlin' @ [54:1] ==> public constructor SinceKotlin(version: String) defined in kotlin.SinceKotlin[DeserializedClassConstructorDescriptor]

'other' @ [56:12] ==> value-parameter other: KType defined in kotlin.reflect.full.isSupertypeOf[ValueParameterDescriptorImpl]

'isSubtypeOf' @ [56:18] ==> @SinceKotlin public fun KType.isSubtypeOf(other: KType): Boolean defined in kotlin.reflect.full in file KTypes.kt[SimpleFunctionDescriptorImpl]

'this' @ [56:30] ==> <this> defined in kotlin.reflect.full.isSupertypeOf[ReceiverParameterDescriptorImpl]

