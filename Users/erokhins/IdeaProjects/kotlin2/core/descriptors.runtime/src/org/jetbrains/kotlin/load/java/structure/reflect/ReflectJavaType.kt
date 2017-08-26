'when {
                type is Class<*> && type.isPrimitive -> ReflectJavaPrimitiveType(type)
                type is GenericArrayType || type is Class<*> && type.isArray -> ReflectJavaArrayType(type)
                type is WildcardType -> ReflectJavaWildcardType(type)
                else -> ReflectJavaClassifierType(type)
            }' @ [29:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReflectJavaType, entry1: ReflectJavaType, entry2: ReflectJavaType, entry3: ReflectJavaType): ReflectJavaType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReflectJavaType

'type' @ [30:17] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'type' @ [30:37] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'isPrimitive' @ [30:42] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'ReflectJavaPrimitiveType' @ [30:57] ==> public constructor ReflectJavaPrimitiveType(reflectType: Class<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaPrimitiveType[ClassConstructorDescriptorImpl]

'type' @ [30:82] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'type' @ [31:17] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'type' @ [31:45] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'type' @ [31:65] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'isArray' @ [31:70] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isArray: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'ReflectJavaArrayType' @ [31:81] ==> public constructor ReflectJavaArrayType(reflectType: Type) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayType[ClassConstructorDescriptorImpl]

'type' @ [31:102] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'type' @ [32:17] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'ReflectJavaWildcardType' @ [32:41] ==> public constructor ReflectJavaWildcardType(reflectType: WildcardType) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaWildcardType[ClassConstructorDescriptorImpl]

'type' @ [32:65] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'ReflectJavaClassifierType' @ [33:25] ==> public constructor ReflectJavaClassifierType(reflectType: Type) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType[ClassConstructorDescriptorImpl]

'type' @ [33:51] ==> value-parameter type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory.create[ValueParameterDescriptorImpl]

'other' @ [38:40] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.equals[ValueParameterDescriptorImpl]

'reflectType' @ [38:68] ==> protected abstract val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[PropertyDescriptorImpl]

'other' @ [38:83] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.equals[ValueParameterDescriptorImpl]

'reflectType' @ [38:89] ==> protected abstract val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[PropertyDescriptorImpl]

'reflectType' @ [40:31] ==> protected abstract val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[PropertyDescriptorImpl]

'hashCode' @ [40:43] ==> public open fun hashCode(): Int defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'this' @ [42:31] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[LazyClassReceiverParameterDescriptor]

'java' @ [42:43] ==> public val <T> KClass<out ReflectJavaType>.java: Class<out ReflectJavaType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReflectJavaType

'name' @ [42:48] ==> public final val <T : (Any..Any?)> Class<out ReflectJavaType>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ReflectJavaType

'reflectType' @ [42:62] ==> protected abstract val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[PropertyDescriptorImpl]

