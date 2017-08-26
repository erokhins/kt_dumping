'ReflectJavaMember' @ [24:69] ==> public constructor ReflectJavaMember() defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaMember[ClassConstructorDescriptorImpl]

'member' @ [28:25] ==> public open val member: Constructor<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor[PropertyDescriptorImpl]

'genericParameterTypes' @ [28:32] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.genericParameterTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'types' @ [29:17] ==> val types: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'isEmpty' @ [29:23] ==> @InlineOnly public inline fun <T> Array<out (Type..Type?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'emptyList' @ [29:41] ==> public fun <T> emptyList(): List<JavaValueParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaValueParameter

'member' @ [31:25] ==> public open val member: Constructor<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor[PropertyDescriptorImpl]

'declaringClass' @ [31:32] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.declaringClass: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'when {
                klass.declaringClass != null && !Modifier.isStatic(klass.modifiers) -> types.copyOfRange(1, types.size)
                else -> types
            }' @ [33:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Array<(Type..Type?)>..Array<out (Type..Type?)>?), entry1: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)): (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Array<(java.lang.reflect.Type..java.lang.reflect.Type?)>..kotlin.Array<out (java.lang.reflect.Type..java.lang.reflect.Type?)>?)

'klass' @ [34:17] ==> val klass: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'declaringClass' @ [34:23] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out (kotlin.Any..kotlin.Any?))

'!' @ [34:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [34:59] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'klass' @ [34:68] ==> val klass: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'modifiers' @ [34:74] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out (kotlin.Any..kotlin.Any?))

'types' @ [34:88] ==> val types: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'copyOfRange' @ [34:94] ==> @InlineOnly public inline fun <T> Array<(Type..Type?)>.copyOfRange(fromIndex: Int, toIndex: Int): Array<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'types' @ [34:109] ==> val types: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [34:115] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'types' @ [35:25] ==> val types: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'member' @ [38:31] ==> public open val member: Constructor<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor[PropertyDescriptorImpl]

'parameterAnnotations' @ [38:38] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.parameterAnnotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'when {
                annotations.size < realTypes.size -> throw IllegalStateException("Illegal generic signature: $member")
                annotations.size > realTypes.size -> annotations.copyOfRange(annotations.size - realTypes.size, annotations.size)
                else -> annotations
            }' @ [39:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?), entry1: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?), entry2: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?)): (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Array<(kotlin.Array<(kotlin.Annotation..kotlin.Annotation?)>..kotlin.Array<out (kotlin.Annotation..kotlin.Annotation?)>?)>..kotlin.Array<out (kotlin.Array<(kotlin.Annotation..kotlin.Annotation?)>..kotlin.Array<out (kotlin.Annotation..kotlin.Annotation?)>?)>?)

'annotations' @ [40:17] ==> val annotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [40:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'realTypes' @ [40:36] ==> val realTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [40:46] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'IllegalStateException' @ [40:60] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'member' @ [40:111] ==> public open val member: Constructor<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor[PropertyDescriptorImpl]

'annotations' @ [41:17] ==> val annotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [41:29] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'realTypes' @ [41:36] ==> val realTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [41:46] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'annotations' @ [41:54] ==> val annotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'copyOfRange' @ [41:66] ==> @InlineOnly public inline fun <T> Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>.copyOfRange(fromIndex: Int, toIndex: Int): Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Array<(kotlin.Annotation..kotlin.Annotation?)>..kotlin.Array<out (kotlin.Annotation..kotlin.Annotation?)>?)

'annotations' @ [41:78] ==> val annotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [41:90] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'realTypes' @ [41:97] ==> val realTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [41:107] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'annotations' @ [41:113] ==> val annotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'size' @ [41:125] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'annotations' @ [42:25] ==> val annotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'getValueParameters' @ [45:20] ==> protected final fun getValueParameters(parameterTypes: Array<Type>, parameterAnnotations: Array<Array<Annotation>>, isVararg: Boolean): List<JavaValueParameter> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor[SimpleFunctionDescriptorImpl]

'realTypes' @ [45:39] ==> val realTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'realAnnotations' @ [45:50] ==> val realAnnotations: (Array<(Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>..Array<out (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)>?) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor.<get-valueParameters>[LocalVariableDescriptor]

'member' @ [45:67] ==> public open val member: Constructor<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor[PropertyDescriptorImpl]

'isVarArgs' @ [45:74] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.isVarArgs: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'member' @ [49:17] ==> public open val member: Constructor<*> defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaConstructor[PropertyDescriptorImpl]

'typeParameters' @ [49:24] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.typeParameters: (Array<out (TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>..TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>?)>..Array<out (TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>..TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'map' @ [49:39] ==> public inline fun <T, R> Array<out (TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>..TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>?)>.map(transform: ((TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>..TypeVariable<out (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?)>?)) -> ReflectJavaTypeParameter): List<ReflectJavaTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.TypeVariable<out (java.lang.reflect.Constructor<out (kotlin.Any..kotlin.Any?)>..java.lang.reflect.Constructor<out (kotlin.Any..kotlin.Any?)>?)>..java.lang.reflect.TypeVariable<out (java.lang.reflect.Constructor<out (kotlin.Any..kotlin.Any?)>..java.lang.reflect.Constructor<out (kotlin.Any..kotlin.Any?)>?)>?)
    <R> -> ReflectJavaTypeParameter

'ReflectJavaTypeParameter' @ [49:45] ==> public constructor ReflectJavaTypeParameter(typeVariable: TypeVariable<*>) defined in org.jetbrains.kotlin.load.java.structure.reflect.ReflectJavaTypeParameter[ClassConstructorDescriptorImpl]

