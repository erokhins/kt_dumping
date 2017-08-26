'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'this' @ [40:13] ==> <this> defined in kotlin.reflect.jvm.javaField[ReceiverParameterDescriptorImpl]

'asKPropertyImpl' @ [40:18] ==> internal fun Any?.asKPropertyImpl(): KPropertyImpl<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'javaField' @ [40:37] ==> public final val javaField: Field? defined in kotlin.reflect.jvm.internal.KPropertyImpl[PropertyDescriptorImpl]

'getter' @ [47:13] ==> public abstract val getter: KProperty.Getter<Any?> defined in kotlin.reflect.KProperty[DeserializedPropertyDescriptor]

'javaMethod' @ [47:20] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'setter' @ [54:13] ==> public abstract val setter: KMutableProperty.Setter<out Any?> defined in kotlin.reflect.KMutableProperty[DeserializedPropertyDescriptor]

'javaMethod' @ [54:20] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'this' @ [62:13] ==> <this> defined in kotlin.reflect.jvm.javaMethod[ReceiverParameterDescriptorImpl]

'asKCallableImpl' @ [62:18] ==> internal fun Any?.asKCallableImpl(): KCallableImpl<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'caller' @ [62:37] ==> public abstract val caller: FunctionCaller<*> defined in kotlin.reflect.jvm.internal.KCallableImpl[PropertyDescriptorImpl]

'member' @ [62:45] ==> internal final val member: Member? defined in kotlin.reflect.jvm.internal.FunctionCaller[PropertyDescriptorImpl]

'Suppress' @ [68:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [69:13] ==> <this> defined in kotlin.reflect.jvm.javaConstructor[ReceiverParameterDescriptorImpl]

'asKCallableImpl' @ [69:18] ==> internal fun Any?.asKCallableImpl(): KCallableImpl<*>? defined in kotlin.reflect.jvm.internal in file util.kt[SimpleFunctionDescriptorImpl]

'caller' @ [69:37] ==> public abstract val caller: FunctionCaller<*> defined in kotlin.reflect.jvm.internal.KCallableImpl[PropertyDescriptorImpl]

'member' @ [69:45] ==> internal final val member: Member? defined in kotlin.reflect.jvm.internal.FunctionCaller[PropertyDescriptorImpl]

'this' @ [78:14] ==> <this> defined in kotlin.reflect.jvm.javaType[ReceiverParameterDescriptorImpl]

'javaType' @ [78:33] ==> internal final val javaType: Type defined in kotlin.reflect.jvm.internal.KTypeImpl[PropertyDescriptorImpl]

'isSynthetic' @ [91:13] ==> public final val Field.isSynthetic: Boolean[MyPropertyDescriptor]

'getKPackage' @ [95:29] ==> private fun Member.getKPackage(): KDeclarationContainer? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[SimpleFunctionDescriptorImpl]

'kotlinPackage' @ [96:13] ==> val kotlinPackage: KDeclarationContainer? defined in kotlin.reflect.jvm.<get-kotlinProperty>[LocalVariableDescriptor]

'kotlinPackage' @ [97:20] ==> val kotlinPackage: KDeclarationContainer? defined in kotlin.reflect.jvm.<get-kotlinProperty>[LocalVariableDescriptor]

'members' @ [97:34] ==> public abstract val members: Collection<KCallable<*>> defined in kotlin.reflect.KDeclarationContainer[DeserializedPropertyDescriptor]

'filterIsInstance' @ [97:42] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KProperty<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KProperty<*>

'firstOrNull' @ [97:75] ==> public inline fun <T> Iterable<KProperty<*>>.firstOrNull(predicate: (KProperty<*>) -> Boolean): KProperty<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty<*>

'it' @ [97:89] ==> value-parameter it: KProperty<*> defined in kotlin.reflect.jvm.<get-kotlinProperty>.<anonymous>[ValueParameterDescriptorImpl]

'javaField' @ [97:92] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'this' @ [97:105] ==> <this> defined in kotlin.reflect.jvm.kotlinProperty[ReceiverParameterDescriptorImpl]

'declaringClass' @ [100:16] ==> public final val Field.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'kotlin' @ [100:31] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'memberProperties' @ [100:38] ==> @SinceKotlin public val <T : Any> KClass<out Any>.memberProperties: Collection<KProperty1<out Any, *>> defined in kotlin.reflect.full[PropertyDescriptorImpl]
Inferred types:
    <T : Any> -> Any

'firstOrNull' @ [100:55] ==> public inline fun <T> Iterable<KProperty1<out Any, *>>.firstOrNull(predicate: (KProperty1<out Any, *>) -> Boolean): KProperty1<out Any, *>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<out Any, *>

'it' @ [100:69] ==> value-parameter it: KProperty1<out Any, *> defined in kotlin.reflect.jvm.<get-kotlinProperty>.<anonymous>[ValueParameterDescriptorImpl]

'javaField' @ [100:72] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'this' @ [100:85] ==> <this> defined in kotlin.reflect.jvm.kotlinProperty[ReceiverParameterDescriptorImpl]

'when (ReflectKotlinClass.create(declaringClass)?.classHeader?.kind) {
            KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART ->
                KPackageImpl(declaringClass)
            else -> null
        }' @ [105:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KDeclarationContainer?, entry1: KDeclarationContainer?): KDeclarationContainer?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KDeclarationContainer?

'ReflectKotlinClass' @ [105:15] ==> public companion object Factory defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[FakeCallableDescriptorForObject]

'create' @ [105:34] ==> public final fun create(klass: Class<*>): ReflectKotlinClass? defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass.Factory[SimpleFunctionDescriptorImpl]

'declaringClass' @ [105:41] ==> public final val Member.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'classHeader' @ [105:58] ==> public open val classHeader: KotlinClassHeader defined in org.jetbrains.kotlin.load.kotlin.reflect.ReflectKotlinClass[PropertyDescriptorImpl]

'kind' @ [105:71] ==> public final val kind: KotlinClassHeader.Kind defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader[PropertyDescriptorImpl]

'FILE_FACADE' @ [106:36] ==> enum entry FILE_FACADE defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS' @ [106:72] ==> enum entry MULTIFILE_CLASS defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'MULTIFILE_CLASS_PART' @ [106:112] ==> enum entry MULTIFILE_CLASS_PART defined in org.jetbrains.kotlin.load.kotlin.header.KotlinClassHeader.Kind[FakeCallableDescriptorForObject]

'KPackageImpl' @ [107:17] ==> public constructor KPackageImpl(jClass: Class<*>, @Suppress usageModuleName: String? = ...) defined in kotlin.reflect.jvm.internal.KPackageImpl[ClassConstructorDescriptorImpl]

'declaringClass' @ [107:30] ==> public final val Member.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'isSynthetic' @ [118:13] ==> public final val Method.isSynthetic: Boolean[MyPropertyDescriptor]

'isStatic' @ [120:22] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'modifiers' @ [120:31] ==> public final val Method.modifiers: Int[MyPropertyDescriptor]

'getKPackage' @ [121:33] ==> private fun Member.getKPackage(): KDeclarationContainer? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[SimpleFunctionDescriptorImpl]

'kotlinPackage' @ [122:17] ==> val kotlinPackage: KDeclarationContainer? defined in kotlin.reflect.jvm.<get-kotlinFunction>[LocalVariableDescriptor]

'kotlinPackage' @ [123:24] ==> val kotlinPackage: KDeclarationContainer? defined in kotlin.reflect.jvm.<get-kotlinFunction>[LocalVariableDescriptor]

'members' @ [123:38] ==> public abstract val members: Collection<KCallable<*>> defined in kotlin.reflect.KDeclarationContainer[DeserializedPropertyDescriptor]

'filterIsInstance' @ [123:46] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KFunction<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KFunction<*>

'firstOrNull' @ [123:79] ==> public inline fun <T> Iterable<KFunction<*>>.firstOrNull(predicate: (KFunction<*>) -> Boolean): KFunction<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'it' @ [123:93] ==> value-parameter it: KFunction<*> defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[ValueParameterDescriptorImpl]

'javaMethod' @ [123:96] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'this' @ [123:110] ==> <this> defined in kotlin.reflect.jvm.kotlinFunction[ReceiverParameterDescriptorImpl]

'declaringClass' @ [127:29] ==> public final val Method.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'kotlin' @ [127:44] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'companionObject' @ [127:51] ==> @SinceKotlin public val KClass<*>.companionObject: KClass<*>? defined in kotlin.reflect.full in file KClasses.kt[PropertyDescriptorImpl]

'companion' @ [128:17] ==> val companion: KClass<*>? defined in kotlin.reflect.jvm.<get-kotlinFunction>[LocalVariableDescriptor]

'companion' @ [129:17] ==> val companion: KClass<*>? defined in kotlin.reflect.jvm.<get-kotlinFunction>[LocalVariableDescriptor]

'functions' @ [129:27] ==> @SinceKotlin public val KClass<*>.functions: Collection<KFunction<*>> defined in kotlin.reflect.full in file KClasses.kt[PropertyDescriptorImpl]

'firstOrNull' @ [129:37] ==> public inline fun <T> Iterable<KFunction<*>>.firstOrNull(predicate: (KFunction<*>) -> Boolean): KFunction<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'it' @ [130:29] ==> value-parameter it: KFunction<*> defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[ValueParameterDescriptorImpl]

'javaMethod' @ [130:32] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'm' @ [131:21] ==> val m: Method? defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[LocalVariableDescriptor]

'm' @ [131:34] ==> val m: Method? defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[LocalVariableDescriptor]

'name' @ [131:36] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'this' @ [131:44] ==> <this> defined in kotlin.reflect.jvm.kotlinFunction[ReceiverParameterDescriptorImpl]

'name' @ [131:49] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'equals' @ [132:28] ==> public open fun equals(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?), p1: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'm' @ [132:35] ==> val m: Method? defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[LocalVariableDescriptor]

'parameterTypes' @ [132:37] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'this' @ [132:53] ==> <this> defined in kotlin.reflect.jvm.kotlinFunction[ReceiverParameterDescriptorImpl]

'parameterTypes' @ [132:58] ==> public final val Method.parameterTypes: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?)[MyPropertyDescriptor]

'm' @ [132:77] ==> val m: Method? defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[LocalVariableDescriptor]

'returnType' @ [132:79] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'this' @ [132:93] ==> <this> defined in kotlin.reflect.jvm.kotlinFunction[ReceiverParameterDescriptorImpl]

'returnType' @ [132:98] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'let' @ [133:20] ==> @InlineOnly public inline fun <T, R> KFunction<Any?>.let(block: (KFunction<Any?>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<Any?>
    <R> -> Nothing

'it' @ [133:33] ==> value-parameter it: KFunction<Any?> defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[ValueParameterDescriptorImpl]

'declaringClass' @ [137:16] ==> public final val Method.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'kotlin' @ [137:31] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'functions' @ [137:38] ==> @SinceKotlin public val KClass<*>.functions: Collection<KFunction<*>> defined in kotlin.reflect.full in file KClasses.kt[PropertyDescriptorImpl]

'firstOrNull' @ [137:48] ==> public inline fun <T> Iterable<KFunction<*>>.firstOrNull(predicate: (KFunction<*>) -> Boolean): KFunction<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'it' @ [137:62] ==> value-parameter it: KFunction<*> defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[ValueParameterDescriptorImpl]

'javaMethod' @ [137:65] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm in file ReflectJvmMapping.kt[PropertyDescriptorImpl]

'this' @ [137:79] ==> <this> defined in kotlin.reflect.jvm.kotlinFunction[ReceiverParameterDescriptorImpl]

'isSynthetic' @ [147:13] ==> public final val <T : (Any..Any?)> Constructor<T>.isSynthetic: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'declaringClass' @ [149:16] ==> public final val <T : (Any..Any?)> Constructor<T>.declaringClass: (Class<(T..T?)>..Class<(T..T?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'kotlin' @ [149:31] ==> public val <T : Any> Class<(T..T?)>.kotlin: KClass<(T..T?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (T..T?)

'constructors' @ [149:38] ==> public abstract val constructors: Collection<KFunction<(T..T?)>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'firstOrNull' @ [149:51] ==> public inline fun <T> Iterable<KFunction<(T..T?)>>.firstOrNull(predicate: (KFunction<(T..T?)>) -> Boolean): KFunction<(T..T?)>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<(T..T?)>

'it' @ [149:65] ==> value-parameter it: KFunction<(T..T?)> defined in kotlin.reflect.jvm.<get-kotlinFunction>.<anonymous>[ValueParameterDescriptorImpl]

'javaConstructor' @ [149:68] ==> @Suppress public val <T> KFunction<(T..T?)>.javaConstructor: Constructor<(T..T?)>? defined in kotlin.reflect.jvm[PropertyDescriptorImpl]
Inferred types:
    <T> -> (T..T?)

'this' @ [149:87] ==> <this> defined in kotlin.reflect.jvm.kotlinFunction[ReceiverParameterDescriptorImpl]

