'ReflectJavaType' @ [28:74] ==> public constructor ReflectJavaType() defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[ClassConstructorDescriptorImpl]

'run' @ [29:47] ==> @InlineOnly public inline fun <T, R> ReflectJavaClassifierType.run(block: ReflectJavaClassifierType.() -> JavaClassifier): JavaClassifier defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReflectJavaClassifierType
    <R> -> JavaClassifier

'reflectType' @ [30:20] ==> public open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType[PropertyDescriptorImpl]

'when (type) {
            is Class<*> -> ReflectJavaClass(type)
            is TypeVariable<*> -> ReflectJavaTypeParameter(type)
            is ParameterizedType -> ReflectJavaClass(type.rawType as Class<*>)
            else -> throw IllegalStateException("Not a classifier type (${type::class.java}): $type")
        }' @ [31:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JavaClassifier, entry1: JavaClassifier, entry2: JavaClassifier, entry3: JavaClassifier): JavaClassifier[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JavaClassifier

'type' @ [31:48] ==> val type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.classifier.<anonymous>[LocalVariableDescriptor]

'ReflectJavaClass' @ [32:28] ==> public constructor ReflectJavaClass(klass: Class<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClass[ClassConstructorDescriptorImpl]

'type' @ [32:45] ==> val type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.classifier.<anonymous>[LocalVariableDescriptor]

'ReflectJavaTypeParameter' @ [33:35] ==> public constructor ReflectJavaTypeParameter(typeVariable: TypeVariable<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaTypeParameter[ClassConstructorDescriptorImpl]

'type' @ [33:60] ==> val type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.classifier.<anonymous>[LocalVariableDescriptor]

'ReflectJavaClass' @ [34:37] ==> public constructor ReflectJavaClass(klass: Class<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClass[ClassConstructorDescriptorImpl]

'type' @ [34:54] ==> val type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.classifier.<anonymous>[LocalVariableDescriptor]

'rawType' @ [34:59] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'IllegalStateException' @ [35:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'type' @ [35:75] ==> val type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.classifier.<anonymous>[LocalVariableDescriptor]

'java' @ [35:87] ==> public val <T> KClass<out Type>.java: Class<out Type> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Type)

'type' @ [35:96] ==> val type: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.classifier.<anonymous>[LocalVariableDescriptor]

'classifier' @ [37:9] ==> val classifier: JavaClassifier defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.classifier.<anonymous>[LocalVariableDescriptor]

'UnsupportedOperationException' @ [41:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'reflectType' @ [41:71] ==> public open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType[PropertyDescriptorImpl]

'reflectType' @ [44:17] ==> public open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType[PropertyDescriptorImpl]

'toString' @ [44:29] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'with' @ [47:17] ==> @InlineOnly public inline fun <T, R> with(receiver: Type, block: Type.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Boolean

'reflectType' @ [47:22] ==> public open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType[PropertyDescriptorImpl]

'this' @ [47:37] ==> <this> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType.<get-isRaw>.<anonymous>[ReceiverParameterDescriptorImpl]

'getTypeParameters' @ [47:57] ==> public open fun getTypeParameters(): (Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>..Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'isNotEmpty' @ [47:77] ==> @InlineOnly public inline fun <T> Array<out (TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>..TypeVariable<out (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)>?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.TypeVariable<out (java.lang.Class<out (kotlin.Any..kotlin.Any?)>..java.lang.Class<out (kotlin.Any..kotlin.Any?)>?)>..java.lang.reflect.TypeVariable<out (java.lang.Class<out (kotlin.Any..kotlin.Any?)>..java.lang.Class<out (kotlin.Any..kotlin.Any?)>?)>?)

'reflectType' @ [50:17] ==> public open val reflectType: Type defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassifierType[PropertyDescriptorImpl]

'parameterizedTypeArguments' @ [50:29] ==> public val Type.parameterizedTypeArguments: List<Type> defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[PropertyDescriptorImpl]

'map' @ [50:56] ==> public inline fun <T, R> Iterable<Type>.map(transform: (Type) -> ReflectJavaType): List<ReflectJavaType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> ReflectJavaType

'ReflectJavaType' @ [50:60] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[FakeCallableDescriptorForObject]

'Factory' @ [50:76] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[FakeCallableDescriptorForObject]

'create' @ [50:85] ==> public final fun create(type: Type): ReflectJavaType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory[SimpleFunctionDescriptorImpl]

'emptyList' @ [54:20] ==> public fun <T> emptyList(): List<JavaAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

