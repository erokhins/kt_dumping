'ReflectJavaType' @ [23:62] ==> public constructor ReflectJavaType() defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[ClassConstructorDescriptorImpl]

'with' @ [24:51] ==> @InlineOnly public inline fun <T, R> with(receiver: Type, block: Type.() -> ReflectJavaType): ReflectJavaType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> ReflectJavaType

'reflectType' @ [24:57] ==> protected open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayType[PropertyDescriptorImpl]

'when {
            this is GenericArrayType -> ReflectJavaType.create(genericComponentType)
            this is Class<*> && isArray() -> ReflectJavaType.create(getComponentType())
            else -> throw IllegalArgumentException("Not an array type (${reflectType::class.java}): $reflectType")
        }' @ [25:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReflectJavaType, entry1: ReflectJavaType, entry2: ReflectJavaType): ReflectJavaType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReflectJavaType

'this' @ [26:13] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayType.componentType.<anonymous>[ReceiverParameterDescriptorImpl]

'create' @ [26:57] ==> public final fun create(type: Type): ReflectJavaType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory[SimpleFunctionDescriptorImpl]

'genericComponentType' @ [26:64] ==> public final val GenericArrayType.genericComponentType: (Type..Type?)[MyPropertyDescriptor]

'this' @ [27:13] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayType.componentType.<anonymous>[ReceiverParameterDescriptorImpl]

'isArray' @ [27:33] ==> public open fun isArray(): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'create' @ [27:62] ==> public final fun create(type: Type): ReflectJavaType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory[SimpleFunctionDescriptorImpl]

'getComponentType' @ [27:69] ==> public open fun getComponentType(): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'IllegalArgumentException' @ [28:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'reflectType' @ [28:74] ==> protected open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayType[PropertyDescriptorImpl]

'java' @ [28:93] ==> public val <T> KClass<out Type>.java: Class<out Type> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Type)

'reflectType' @ [28:102] ==> protected open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayType[PropertyDescriptorImpl]

