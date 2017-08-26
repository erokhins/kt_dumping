'when {
                value::class.java.isEnumClassOrSpecializedEnumEntryClass() -> ReflectJavaEnumValueAnnotationArgument(name, value as Enum<*>)
                value is Annotation -> ReflectJavaAnnotationAsAnnotationArgument(name, value)
                value is Array<*> -> ReflectJavaArrayAnnotationArgument(name, value)
                value is Class<*> -> ReflectJavaClassObjectAnnotationArgument(name, value)
                else -> ReflectJavaLiteralAnnotationArgument(name, value)
            }' @ [27:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReflectJavaAnnotationArgument, entry1: ReflectJavaAnnotationArgument, entry2: ReflectJavaAnnotationArgument, entry3: ReflectJavaAnnotationArgument, entry4: ReflectJavaAnnotationArgument): ReflectJavaAnnotationArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReflectJavaAnnotationArgument

'value' @ [28:17] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'java' @ [28:30] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'isEnumClassOrSpecializedEnumEntryClass' @ [28:35] ==> public fun Class<*>.isEnumClassOrSpecializedEnumEntryClass(): Boolean defined in org.jetbrains.kotlin.load.java.structure.reflect in file reflectClassUtil.kt[SimpleFunctionDescriptorImpl]

'ReflectJavaEnumValueAnnotationArgument' @ [28:79] ==> public constructor ReflectJavaEnumValueAnnotationArgument(name: Name?, value: Enum<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [28:118] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [28:124] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [29:17] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'ReflectJavaAnnotationAsAnnotationArgument' @ [29:40] ==> public constructor ReflectJavaAnnotationAsAnnotationArgument(name: Name?, annotation: Annotation) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationAsAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [29:82] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [29:88] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [30:17] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'ReflectJavaArrayAnnotationArgument' @ [30:38] ==> public constructor ReflectJavaArrayAnnotationArgument(name: Name?, values: Array<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [30:73] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [30:79] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [31:17] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'ReflectJavaClassObjectAnnotationArgument' @ [31:38] ==> public constructor ReflectJavaClassObjectAnnotationArgument(name: Name?, klass: Class<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassObjectAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [31:79] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [31:85] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'ReflectJavaLiteralAnnotationArgument' @ [32:25] ==> public constructor ReflectJavaLiteralAnnotationArgument(name: Name?, value: Any) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaLiteralAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [32:62] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'value' @ [32:68] ==> value-parameter value: Any defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory.create[ValueParameterDescriptorImpl]

'ReflectJavaAnnotationArgument' @ [41:5] ==> public constructor ReflectJavaAnnotationArgument(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [41:35] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaLiteralAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'ReflectJavaAnnotationArgument' @ [46:5] ==> public constructor ReflectJavaAnnotationArgument(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [46:35] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'values' @ [47:34] ==> private final val values: Array<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayAnnotationArgument[PropertyDescriptorImpl]

'map' @ [47:41] ==> public inline fun <T, R> Array<out Any?>.map(transform: (Any?) -> ReflectJavaAnnotationArgument): List<ReflectJavaAnnotationArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> ReflectJavaAnnotationArgument

'ReflectJavaAnnotationArgument' @ [47:47] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument[FakeCallableDescriptorForObject]

'create' @ [47:77] ==> public final fun create(value: Any, name: Name?): ReflectJavaAnnotationArgument defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument.Factory[SimpleFunctionDescriptorImpl]

'it' @ [47:84] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaArrayAnnotationArgument.getElements.<anonymous>[ValueParameterDescriptorImpl]

'ReflectJavaAnnotationArgument' @ [53:5] ==> public constructor ReflectJavaAnnotationArgument(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [53:35] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'value' @ [55:21] ==> private final val value: Enum<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument[PropertyDescriptorImpl]

'java' @ [55:34] ==> public val <T> KClass<out Enum<*>>.java: Class<out Enum<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Enum<*>)

'if (clazz.isEnum) clazz else clazz.enclosingClass' @ [56:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?), elseBranch: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)): (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.Class<out (kotlin.Any..kotlin.Any?)>..java.lang.Class<out (kotlin.Any..kotlin.Any?)>?)

'clazz' @ [56:29] ==> val clazz: Class<out Enum<*>> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument.resolve[LocalVariableDescriptor]

'isEnum' @ [56:35] ==> public final val <T : (Any..Any?)> Class<out Enum<*>>.isEnum: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Enum<*>)

'clazz' @ [56:43] ==> val clazz: Class<out Enum<*>> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument.resolve[LocalVariableDescriptor]

'clazz' @ [56:54] ==> val clazz: Class<out Enum<*>> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument.resolve[LocalVariableDescriptor]

'enclosingClass' @ [56:60] ==> public final val <T : (Any..Any?)> Class<out Enum<*>>.enclosingClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Enum<*>)

'ReflectJavaField' @ [57:16] ==> public constructor ReflectJavaField(member: Field) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaField[ClassConstructorDescriptorImpl]

'enumClass' @ [57:33] ==> val enumClass: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument.resolve[LocalVariableDescriptor]

'getDeclaredField' @ [57:43] ==> public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'value' @ [57:60] ==> private final val value: Enum<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument[PropertyDescriptorImpl]

'name' @ [57:66] ==> public final val name: String defined in kotlin.Enum[DeserializedPropertyDescriptor]

'identifier' @ [61:22] ==> @NotNull public open fun identifier(@NotNull name: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'value' @ [61:33] ==> private final val value: Enum<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaEnumValueAnnotationArgument[PropertyDescriptorImpl]

'name' @ [61:39] ==> public final val name: String defined in kotlin.Enum[DeserializedPropertyDescriptor]

'ReflectJavaAnnotationArgument' @ [67:5] ==> public constructor ReflectJavaAnnotationArgument(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [67:35] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassObjectAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'ReflectJavaType' @ [68:50] ==> public companion object Factory defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType[FakeCallableDescriptorForObject]

'create' @ [68:66] ==> public final fun create(type: Type): ReflectJavaType defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaType.Factory[SimpleFunctionDescriptorImpl]

'klass' @ [68:73] ==> private final val klass: Class<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaClassObjectAnnotationArgument[PropertyDescriptorImpl]

'ReflectJavaAnnotationArgument' @ [74:5] ==> public constructor ReflectJavaAnnotationArgument(name: Name?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationArgument[ClassConstructorDescriptorImpl]

'name' @ [74:35] ==> value-parameter name: Name? defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationAsAnnotationArgument.<init>[ValueParameterDescriptorImpl]

'ReflectJavaAnnotation' @ [75:52] ==> public constructor ReflectJavaAnnotation(annotation: Annotation) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotation[ClassConstructorDescriptorImpl]

'annotation' @ [75:74] ==> private final val annotation: Annotation defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaAnnotationAsAnnotationArgument[PropertyDescriptorImpl]

