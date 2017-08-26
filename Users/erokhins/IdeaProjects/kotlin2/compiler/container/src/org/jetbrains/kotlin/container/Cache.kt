'createConcurrentWeakKeySoftValueMap' @ [24:39] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentWeakKeySoftValueMap(): ConcurrentMap<(Class<*>..Class<*>?), (ClassInfo..ClassInfo?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Class<*>
    <V : (Any..Any?)> -> ClassInfo

'cache' @ [27:25] ==> private final val cache: ConcurrentMap<(Class<*>..Class<*>?), (ClassInfo..ClassInfo?)> defined in org.jetbrains.kotlin.container.ClassTraversalCache[PropertyDescriptorImpl]

'get' @ [27:31] ==> public abstract fun get(key: (Class<*>..Class<*>?)): ClassInfo? defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

'c' @ [27:35] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.ClassTraversalCache.getClassInfo[ValueParameterDescriptorImpl]

'classInfo' @ [28:13] ==> val classInfo: ClassInfo? defined in org.jetbrains.kotlin.container.ClassTraversalCache.getClassInfo[LocalVariableDescriptor]

'traverseClass' @ [29:32] ==> private fun traverseClass(c: Class<*>): ClassInfo defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'c' @ [29:46] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.ClassTraversalCache.getClassInfo[ValueParameterDescriptorImpl]

'cache' @ [30:13] ==> private final val cache: ConcurrentMap<(Class<*>..Class<*>?), (ClassInfo..ClassInfo?)> defined in org.jetbrains.kotlin.container.ClassTraversalCache[PropertyDescriptorImpl]

'put' @ [30:19] ==> public abstract fun put(key: (Class<*>..Class<*>?), value: (ClassInfo..ClassInfo?)): ClassInfo? defined in java.util.concurrent.ConcurrentMap[DeserializedSimpleFunctionDescriptor]

'c' @ [30:23] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.ClassTraversalCache.getClassInfo[ValueParameterDescriptorImpl]

'newClassInfo' @ [30:26] ==> val newClassInfo: ClassInfo defined in org.jetbrains.kotlin.container.ClassTraversalCache.getClassInfo[LocalVariableDescriptor]

'newClassInfo' @ [31:20] ==> val newClassInfo: ClassInfo defined in org.jetbrains.kotlin.container.ClassTraversalCache.getClassInfo[LocalVariableDescriptor]

'classInfo' @ [33:16] ==> val classInfo: ClassInfo? defined in org.jetbrains.kotlin.container.ClassTraversalCache.getClassInfo[LocalVariableDescriptor]

'ClassTraversalCache' @ [38:12] ==> private object ClassTraversalCache defined in org.jetbrains.kotlin.container in file Cache.kt[FakeCallableDescriptorForObject]

'getClassInfo' @ [38:32] ==> public final fun getClassInfo(c: Class<*>): ClassInfo defined in org.jetbrains.kotlin.container.ClassTraversalCache[SimpleFunctionDescriptorImpl]

'this' @ [38:45] ==> <this> defined in org.jetbrains.kotlin.container.getInfo[ReceiverParameterDescriptorImpl]

'ClassInfo' @ [59:12] ==> public constructor ClassInfo(constructorInfo: ConstructorInfo?, setterInfos: List<SetterInfo>, registrations: List<Type>, defaultImplementation: Class<*>?) defined in org.jetbrains.kotlin.container.ClassInfo[ClassConstructorDescriptorImpl]

'getConstructorInfo' @ [59:22] ==> private fun getConstructorInfo(c: Class<*>): ConstructorInfo? defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'c' @ [59:41] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.traverseClass[ValueParameterDescriptorImpl]

'getSetterInfos' @ [59:45] ==> private fun getSetterInfos(c: Class<*>): List<SetterInfo> defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'c' @ [59:60] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.traverseClass[ValueParameterDescriptorImpl]

'getRegistrations' @ [59:64] ==> private fun getRegistrations(klass: Class<*>): List<Type> defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'c' @ [59:81] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.traverseClass[ValueParameterDescriptorImpl]

'getDefaultImplementation' @ [59:85] ==> private fun getDefaultImplementation(klass: Class<*>): Class<*>? defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'c' @ [59:110] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.traverseClass[ValueParameterDescriptorImpl]

'ArrayList' @ [63:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SetterInfo

'c' @ [64:20] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.getSetterInfos[ValueParameterDescriptorImpl]

'methods' @ [64:22] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'method' @ [65:28] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.container.getSetterInfos[LocalVariableDescriptor]

'declaredAnnotations' @ [65:35] ==> public final val Method.declaredAnnotations: (Array<(Annotation..Annotation?)>..Array<out (Annotation..Annotation?)>?)[MyPropertyDescriptor]

'annotation' @ [66:17] ==> val annotation: (Annotation..Annotation?) defined in org.jetbrains.kotlin.container.getSetterInfos[LocalVariableDescriptor]

'annotationClass' @ [66:28] ==> public val <T : Annotation> (Annotation..Annotation?).annotationClass: KClass<out (Annotation..Annotation?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Annotation> -> (kotlin.Annotation..kotlin.Annotation?)

'java' @ [66:44] ==> public val <T> KClass<out (Annotation..Annotation?)>.java: Class<out (Annotation..Annotation?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out (kotlin.Annotation..kotlin.Annotation?))

'name' @ [66:49] ==> public final val <T : (Any..Any?)> Class<out (Annotation..Annotation?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out (kotlin.Annotation..kotlin.Annotation?))

'endsWith' @ [66:54] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'setterInfos' @ [67:17] ==> val setterInfos: ArrayList<SetterInfo> defined in org.jetbrains.kotlin.container.getSetterInfos[LocalVariableDescriptor]

'add' @ [67:29] ==> public open fun add(element: SetterInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'SetterInfo' @ [67:33] ==> public constructor SetterInfo(method: Method, parameters: List<Type>) defined in org.jetbrains.kotlin.container.SetterInfo[ClassConstructorDescriptorImpl]

'method' @ [67:44] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.container.getSetterInfos[LocalVariableDescriptor]

'method' @ [67:52] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.container.getSetterInfos[LocalVariableDescriptor]

'genericParameterTypes' @ [67:59] ==> public final val Method.genericParameterTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'toList' @ [67:81] ==> public fun <T> Array<out (Type..Type?)>.toList(): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'setterInfos' @ [71:12] ==> val setterInfos: ArrayList<SetterInfo> defined in org.jetbrains.kotlin.container.getSetterInfos[LocalVariableDescriptor]

'isAbstract' @ [75:18] ==> public open fun isAbstract(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'c' @ [75:29] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.getConstructorInfo[ValueParameterDescriptorImpl]

'modifiers' @ [75:31] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'c' @ [75:45] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.getConstructorInfo[ValueParameterDescriptorImpl]

'isPrimitive' @ [75:47] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'c' @ [78:24] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.getConstructorInfo[ValueParameterDescriptorImpl]

'constructors' @ [78:26] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.constructors: (Array<(Constructor<*>..Constructor<*>?)>..Array<out (Constructor<*>..Constructor<*>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'constructors' @ [79:38] ==> val constructors: (Array<(Constructor<*>..Constructor<*>?)>..Array<out (Constructor<*>..Constructor<*>?)>?) defined in org.jetbrains.kotlin.container.getConstructorInfo[LocalVariableDescriptor]

'singleOrNull' @ [79:51] ==> public fun <T> Array<out (Constructor<*>..Constructor<*>?)>.singleOrNull(): Constructor<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Constructor<*>..java.lang.reflect.Constructor<*>?)

'let' @ [79:67] ==> @InlineOnly public inline fun <T, R> Constructor<*>.let(block: (Constructor<*>) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Constructor<*>
    <R> -> Boolean

'isPublic' @ [79:82] ==> public open fun isPublic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'it' @ [79:91] ==> value-parameter it: Constructor<*> defined in org.jetbrains.kotlin.container.getConstructorInfo.<anonymous>[ValueParameterDescriptorImpl]

'modifiers' @ [79:94] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'!' @ [80:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasSinglePublicConstructor' @ [80:10] ==> val hasSinglePublicConstructor: Boolean defined in org.jetbrains.kotlin.container.getConstructorInfo[LocalVariableDescriptor]

'constructors' @ [83:23] ==> val constructors: (Array<(Constructor<*>..Constructor<*>?)>..Array<out (Constructor<*>..Constructor<*>?)>?) defined in org.jetbrains.kotlin.container.getConstructorInfo[LocalVariableDescriptor]

'single' @ [83:36] ==> public fun <T> Array<out (Constructor<*>..Constructor<*>?)>.single(): (Constructor<*>..Constructor<*>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Constructor<*>..java.lang.reflect.Constructor<*>?)

'if (c.declaringClass != null && !Modifier.isStatic(c.modifiers))
                listOf(c.declaringClass, *constructor.genericParameterTypes)
            else constructor.genericParameterTypes.toList()' @ [85:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<(Type..Type?)>, elseBranch: List<(Type..Type?)>): List<(Type..Type?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<(java.lang.reflect.Type..java.lang.reflect.Type?)>

'c' @ [85:17] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.getConstructorInfo[ValueParameterDescriptorImpl]

'declaringClass' @ [85:19] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'!' @ [85:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatic' @ [85:55] ==> public open fun isStatic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'c' @ [85:64] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.getConstructorInfo[ValueParameterDescriptorImpl]

'modifiers' @ [85:66] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'listOf' @ [86:17] ==> public fun <T> listOf(vararg elements: (Type..Type?)): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'c' @ [86:24] ==> value-parameter c: Class<*> defined in org.jetbrains.kotlin.container.getConstructorInfo[ValueParameterDescriptorImpl]

'declaringClass' @ [86:26] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'constructor' @ [86:43] ==> val constructor: (Constructor<*>..Constructor<*>?) defined in org.jetbrains.kotlin.container.getConstructorInfo[LocalVariableDescriptor]

'genericParameterTypes' @ [86:55] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.genericParameterTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'constructor' @ [87:18] ==> val constructor: (Constructor<*>..Constructor<*>?) defined in org.jetbrains.kotlin.container.getConstructorInfo[LocalVariableDescriptor]

'genericParameterTypes' @ [87:30] ==> public final val <T : (Any..Any?)> Constructor<out (Any..Any?)>.genericParameterTypes: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'toList' @ [87:52] ==> public fun <T> Array<out (Type..Type?)>.toList(): List<(Type..Type?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'ConstructorInfo' @ [88:12] ==> public constructor ConstructorInfo(constructor: Constructor<*>, parameters: List<Type>) defined in org.jetbrains.kotlin.container.ConstructorInfo[ClassConstructorDescriptorImpl]

'constructor' @ [88:28] ==> val constructor: (Constructor<*>..Constructor<*>?) defined in org.jetbrains.kotlin.container.getConstructorInfo[LocalVariableDescriptor]

'parameterTypes' @ [88:41] ==> val parameterTypes: List<(Type..Type?)> defined in org.jetbrains.kotlin.container.getConstructorInfo[LocalVariableDescriptor]

'when(type) {
        is Class<*> -> type
        is ParameterizedType -> type.rawType as? Class<*>
        else -> null
    }' @ [94:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<*>?, entry1: Class<*>?, entry2: Class<*>?): Class<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<*>?

'type' @ [94:34] ==> value-parameter type: Type defined in org.jetbrains.kotlin.container.collectInterfacesRecursive[ValueParameterDescriptorImpl]

'type' @ [95:24] ==> value-parameter type: Type defined in org.jetbrains.kotlin.container.collectInterfacesRecursive[ValueParameterDescriptorImpl]

'type' @ [96:33] ==> value-parameter type: Type defined in org.jetbrains.kotlin.container.collectInterfacesRecursive[ValueParameterDescriptorImpl]

'rawType' @ [96:38] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'klass' @ [99:5] ==> val klass: Class<*>? defined in org.jetbrains.kotlin.container.collectInterfacesRecursive[LocalVariableDescriptor]

'genericInterfaces' @ [99:12] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.genericInterfaces: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'forEach' @ [99:31] ==> public inline fun <T> Array<out (Type..Type?)>.forEach(action: ((Type..Type?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Type..java.lang.reflect.Type?)

'result' @ [100:13] ==> value-parameter result: MutableSet<Type> defined in org.jetbrains.kotlin.container.collectInterfacesRecursive[ValueParameterDescriptorImpl]

'add' @ [100:20] ==> public abstract fun add(element: Type): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [100:24] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.container.collectInterfacesRecursive.<anonymous>[ValueParameterDescriptorImpl]

'collectInterfacesRecursive' @ [101:13] ==> private fun collectInterfacesRecursive(type: Type, result: MutableSet<Type>): Unit defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'it' @ [101:40] ==> value-parameter it: (Type..Type?) defined in org.jetbrains.kotlin.container.collectInterfacesRecursive.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [101:44] ==> value-parameter result: MutableSet<Type> defined in org.jetbrains.kotlin.container.collectInterfacesRecursive[ValueParameterDescriptorImpl]

'klass' @ [107:12] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.container.getDefaultImplementation[ValueParameterDescriptorImpl]

'getAnnotation' @ [107:18] ==> public open fun <A : (Annotation..Annotation?)> getAnnotation(p0: (Class<(DefaultImplementation..DefaultImplementation?)>..Class<(DefaultImplementation..DefaultImplementation?)>?)): (DefaultImplementation..DefaultImplementation?) defined in java.lang.Class[JavaMethodDescriptor]
Inferred types:
    <A : (Annotation..Annotation?)> -> (org.jetbrains.kotlin.container.DefaultImplementation..org.jetbrains.kotlin.container.DefaultImplementation?)

'DefaultImplementation' @ [107:32] ==> public constructor DefaultImplementation(impl: KClass<*>) defined in org.jetbrains.kotlin.container.DefaultImplementation[DeserializedClassConstructorDescriptor]

'java' @ [107:61] ==> public val <T> KClass<DefaultImplementation>.java: Class<DefaultImplementation> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DefaultImplementation

'impl' @ [107:68] ==> public final val impl: KClass<*> defined in org.jetbrains.kotlin.container.DefaultImplementation[DeserializedPropertyDescriptor]

'java' @ [107:74] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(*)

'ArrayList' @ [111:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'generateSequence' @ [113:24] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: Type?, nextFunction: (Type) -> Type?): Sequence<Type> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Type

'klass' @ [113:47] ==> value-parameter klass: Class<*> defined in org.jetbrains.kotlin.container.getRegistrations[ValueParameterDescriptorImpl]

'when (it) {
            is Class<*> -> it.genericSuperclass
            is ParameterizedType -> (it.rawType as? Class<*>)?.genericSuperclass
            else -> null
        }' @ [114:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type?, entry1: Type?, entry2: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'it' @ [114:15] ==> value-parameter it: Type defined in org.jetbrains.kotlin.container.getRegistrations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [115:28] ==> value-parameter it: Type defined in org.jetbrains.kotlin.container.getRegistrations.<anonymous>[ValueParameterDescriptorImpl]

'genericSuperclass' @ [115:31] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.genericSuperclass: (Type..Type?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'it' @ [116:38] ==> value-parameter it: Type defined in org.jetbrains.kotlin.container.getRegistrations.<anonymous>[ValueParameterDescriptorImpl]

'rawType' @ [116:41] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'genericSuperclass' @ [116:64] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.genericSuperclass: (Type..Type?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'registrations' @ [120:5] ==> val registrations: ArrayList<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

'addAll' @ [120:19] ==> public fun <T> MutableCollection<in Type>.addAll(elements: Sequence<Type>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'superClasses' @ [120:26] ==> val superClasses: Sequence<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

'LinkedHashSet' @ [122:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Type

'superClasses' @ [123:5] ==> val superClasses: Sequence<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

'forEach' @ [123:18] ==> public inline fun <T> Sequence<Type>.forEach(action: (Type) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'collectInterfacesRecursive' @ [123:28] ==> private fun collectInterfacesRecursive(type: Type, result: MutableSet<Type>): Unit defined in org.jetbrains.kotlin.container in file Cache.kt[SimpleFunctionDescriptorImpl]

'it' @ [123:55] ==> value-parameter it: Type defined in org.jetbrains.kotlin.container.getRegistrations.<anonymous>[ValueParameterDescriptorImpl]

'interfaces' @ [123:59] ==> val interfaces: LinkedHashSet<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

'registrations' @ [124:5] ==> val registrations: ArrayList<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

'addAll' @ [124:19] ==> public open fun addAll(elements: Collection<Type>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'interfaces' @ [124:26] ==> val interfaces: LinkedHashSet<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

'registrations' @ [125:5] ==> val registrations: ArrayList<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

'remove' @ [125:19] ==> public open fun remove(element: Type): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'Any' @ [125:26] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [125:37] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'registrations' @ [126:12] ==> val registrations: ArrayList<Type> defined in org.jetbrains.kotlin.container.getRegistrations[LocalVariableDescriptor]

