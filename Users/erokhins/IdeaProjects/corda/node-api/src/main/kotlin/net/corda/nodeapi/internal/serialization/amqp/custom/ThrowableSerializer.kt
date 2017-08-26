'CustomSerializer.Proxy<Throwable, ThrowableSerializer.ThrowableProxy>' @ [11:57] ==> public constructor Proxy<T, P>(clazz: Class<Throwable>, proxyClass: Class<ThrowableSerializer.ThrowableProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Throwable
    <P> -> ThrowableProxy

'Throwable' @ [11:127] ==> public constructor Throwable() defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'java' @ [11:144] ==> public val <T> KClass<Throwable>.java: Class<Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Throwable

'ThrowableProxy' @ [11:150] ==> public constructor ThrowableProxy(exceptionClass: String, message: String?, stackTrace: Array<StackTraceElement>, cause: Throwable?, suppressed: Array<Throwable>, additionalProperties: Map<String, Any?>) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[ClassConstructorDescriptorImpl]

'java' @ [11:172] ==> public val <T> KClass<ThrowableSerializer.ThrowableProxy>.java: Class<ThrowableSerializer.ThrowableProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ThrowableProxy

'factory' @ [11:178] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.<init>[ValueParameterDescriptorImpl]

'listOf' @ [12:79] ==> public fun <T> listOf(element: StackTraceElementSerializer): List<StackTraceElementSerializer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackTraceElementSerializer

'StackTraceElementSerializer' @ [12:86] ==> public constructor StackTraceElementSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer[ClassConstructorDescriptorImpl]

'factory' @ [12:114] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.<init>[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [15:57] ==> public final fun <K, V> <init>(): LinkedHashMap<String, Any?> /* = LinkedHashMap<String, Any?> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Any?

'if (obj is CordaThrowable) {
            // Try and find a constructor
            try {
                val constructor = constructorForDeserialization(obj.javaClass)
                val props = propertiesForSerialization(constructor, obj.javaClass, factory)
                for (prop in props) {
                    extraProperties[prop.name] = prop.readMethod!!.invoke(obj)
                }
            } catch(e: NotSerializableException) {
            }
            obj.originalMessage
        } else {
            obj.message
        }' @ [16:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'obj' @ [16:27] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'constructorForDeserialization' @ [19:35] ==> internal fun constructorForDeserialization(type: Type): KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'obj' @ [19:65] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'javaClass' @ [19:69] ==> public val <T : Any> {Throwable & CordaThrowable}.javaClass: Class<{Throwable & CordaThrowable}> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> {Throwable & CordaThrowable}

'propertiesForSerialization' @ [20:29] ==> internal fun <T : Any> propertiesForSerialization(kotlinConstructor: KFunction<Any>?, type: Type, factory: SerializerFactory): Collection<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Any

'constructor' @ [20:56] ==> val constructor: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[LocalVariableDescriptor]

'obj' @ [20:69] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'javaClass' @ [20:73] ==> public val <T : Any> {Throwable & CordaThrowable}.javaClass: Class<{Throwable & CordaThrowable}> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> {Throwable & CordaThrowable}

'factory' @ [20:84] ==> protected final val factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer[PropertyDescriptorImpl]

'props' @ [21:30] ==> val props: Collection<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[LocalVariableDescriptor]

'extraProperties' @ [22:21] ==> val extraProperties: MutableMap<String, Any?> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[LocalVariableDescriptor]

'prop' @ [22:37] ==> val prop: PropertySerializer defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[LocalVariableDescriptor]

'name' @ [22:42] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'prop' @ [22:50] ==> val prop: PropertySerializer defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[LocalVariableDescriptor]

'readMethod' @ [22:55] ==> public final val readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'invoke' @ [22:68] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'obj' @ [22:75] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'obj' @ [26:13] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'originalMessage' @ [26:17] ==> public abstract val originalMessage: String? defined in net.corda.core.CordaThrowable[DeserializedPropertyDescriptor]

'obj' @ [28:13] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'message' @ [28:17] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'ThrowableProxy' @ [30:16] ==> public constructor ThrowableProxy(exceptionClass: String, message: String?, stackTrace: Array<StackTraceElement>, cause: Throwable?, suppressed: Array<Throwable>, additionalProperties: Map<String, Any?>) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[ClassConstructorDescriptorImpl]

'obj' @ [30:31] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'javaClass' @ [30:35] ==> public val <T : Any> Throwable.javaClass: Class<Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Throwable

'name' @ [30:45] ==> public final val <T : (Any..Any?)> Class<Throwable>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Throwable

'message' @ [30:51] ==> val message: String? defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[LocalVariableDescriptor]

'obj' @ [30:60] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'stackTrace' @ [30:64] ==> public final var Throwable.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'obj' @ [30:76] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'cause' @ [30:80] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'obj' @ [30:87] ==> value-parameter obj: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[ValueParameterDescriptorImpl]

'suppressed' @ [30:91] ==> public final val Throwable.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'extraProperties' @ [30:103] ==> val extraProperties: MutableMap<String, Any?> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.toProxy[LocalVariableDescriptor]

'forName' @ [36:31] ==> @CallerSensitive public open fun forName(p0: (String..String?), p1: Boolean, p2: (ClassLoader..ClassLoader?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'proxy' @ [36:39] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'exceptionClass' @ [36:45] ==> public final val exceptionClass: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [36:68] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer[LazyClassReceiverParameterDescriptor]

'javaClass' @ [36:73] ==> public val <T : Any> ThrowableSerializer.javaClass: Class<ThrowableSerializer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ThrowableSerializer

'classLoader' @ [36:83] ==> public final val <T : (Any..Any?)> Class<ThrowableSerializer>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ThrowableSerializer

'java' @ [39:39] ==> public val <T> KClass<CordaThrowable>.java: Class<CordaThrowable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaThrowable

'isAssignableFrom' @ [39:44] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'clazz' @ [39:61] ==> val clazz: (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[LocalVariableDescriptor]

'Throwable' @ [39:71] ==> public constructor Throwable() defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'java' @ [39:88] ==> public val <T> KClass<Throwable>.java: Class<Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Throwable

'isAssignableFrom' @ [39:93] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'clazz' @ [39:110] ==> val clazz: (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[LocalVariableDescriptor]

'constructorForDeserialization' @ [40:35] ==> internal fun constructorForDeserialization(type: Type): KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'clazz' @ [40:65] ==> val clazz: (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[LocalVariableDescriptor]

'constructor' @ [41:33] ==> val constructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[LocalVariableDescriptor]

'callBy' @ [41:45] ==> public abstract fun callBy(args: Map<KParameter, Any?>): Any defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'constructor' @ [41:52] ==> val constructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[LocalVariableDescriptor]

'parameters' @ [41:64] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'map' @ [41:75] ==> public inline fun <T, R> Iterable<KParameter>.map(transform: (KParameter) -> Pair<KParameter, Any?>): List<Pair<KParameter, Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> Pair<KParameter, Any?>

'it' @ [41:81] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ValueParameterDescriptorImpl]

'proxy' @ [41:87] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'additionalProperties' @ [41:93] ==> public final val additionalProperties: Map<String, Any?> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'it' @ [41:114] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [41:117] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'toMap' @ [41:125] ==> public fun <K, V> Iterable<Pair<KParameter, Any?>>.toMap(): Map<KParameter, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KParameter
    <V> -> Any?

'throwable' @ [42:18] ==> val throwable: Any defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[LocalVariableDescriptor]

'apply' @ [42:47] ==> @InlineOnly public inline fun <T> CordaThrowable.apply(block: CordaThrowable.() -> Unit): CordaThrowable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaThrowable

'this' @ [43:25] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'javaClass' @ [43:30] ==> public val <T : Any> CordaThrowable.javaClass: Class<CordaThrowable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> CordaThrowable

'name' @ [43:40] ==> public final val <T : (Any..Any?)> Class<CordaThrowable>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CordaThrowable

'proxy' @ [43:48] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'exceptionClass' @ [43:54] ==> public final val exceptionClass: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [43:70] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'originalExceptionClassName' @ [43:75] ==> public abstract var originalExceptionClassName: String? defined in net.corda.core.CordaThrowable[DeserializedPropertyDescriptor]

'proxy' @ [43:104] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'exceptionClass' @ [43:110] ==> public final val exceptionClass: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [44:21] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'setMessage' @ [44:26] ==> public abstract fun setMessage(message: String?): Unit defined in net.corda.core.CordaThrowable[DeserializedSimpleFunctionDescriptor]

'proxy' @ [44:37] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'message' @ [44:43] ==> public final val message: String? defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [45:21] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'setCause' @ [45:26] ==> public abstract fun setCause(cause: Throwable?): Unit defined in net.corda.core.CordaThrowable[DeserializedSimpleFunctionDescriptor]

'proxy' @ [45:35] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'cause' @ [45:41] ==> public final val cause: Throwable? defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [46:21] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'addSuppressed' @ [46:26] ==> public abstract fun addSuppressed(suppressed: Array<Throwable>): Unit defined in net.corda.core.CordaThrowable[DeserializedSimpleFunctionDescriptor]

'proxy' @ [46:40] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'suppressed' @ [46:46] ==> public final val suppressed: Array<Throwable> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'throwable' @ [48:25] ==> val throwable: Any defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[LocalVariableDescriptor]

'apply' @ [48:49] ==> @InlineOnly public inline fun <T> Throwable.apply(block: Throwable.() -> Unit): Throwable defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Throwable

'this' @ [49:21] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'stackTrace' @ [49:26] ==> public final var Throwable.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'proxy' @ [49:39] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'stackTrace' @ [49:45] ==> public final val stackTrace: Array<StackTraceElement> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'CordaRuntimeException' @ [56:16] ==> public constructor CordaRuntimeException(originalExceptionClassName: String?, _message: String? = ..., _cause: Throwable? = ...) defined in net.corda.core.CordaRuntimeException[DeserializedClassConstructorDescriptor]

'proxy' @ [56:38] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'exceptionClass' @ [56:44] ==> public final val exceptionClass: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'apply' @ [56:60] ==> @InlineOnly public inline fun <T> CordaRuntimeException.apply(block: CordaRuntimeException.() -> Unit): CordaRuntimeException defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaRuntimeException

'this' @ [57:13] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'setMessage' @ [57:18] ==> public open fun setMessage(message: String?): Unit defined in net.corda.core.CordaRuntimeException[DeserializedSimpleFunctionDescriptor]

'proxy' @ [57:29] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'message' @ [57:35] ==> public final val message: String? defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [58:13] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'setCause' @ [58:18] ==> public open fun setCause(cause: Throwable?): Unit defined in net.corda.core.CordaRuntimeException[DeserializedSimpleFunctionDescriptor]

'proxy' @ [58:27] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'cause' @ [58:33] ==> public final val cause: Throwable? defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [59:13] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'stackTrace' @ [59:18] ==> public final var CordaRuntimeException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'proxy' @ [59:31] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'stackTrace' @ [59:37] ==> public final val stackTrace: Array<StackTraceElement> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'this' @ [60:13] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy.<anonymous>[ReceiverParameterDescriptorImpl]

'addSuppressed' @ [60:18] ==> public open fun addSuppressed(suppressed: Array<Throwable>): Unit defined in net.corda.core.CordaRuntimeException[DeserializedSimpleFunctionDescriptor]

'proxy' @ [60:32] ==> value-parameter proxy: ThrowableSerializer.ThrowableProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.fromProxy[ValueParameterDescriptorImpl]

'suppressed' @ [60:38] ==> public final val suppressed: Array<Throwable> defined in net.corda.nodeapi.internal.serialization.amqp.custom.ThrowableSerializer.ThrowableProxy[PropertyDescriptorImpl]

'CustomSerializer.Proxy<StackTraceElement, StackTraceElementSerializer.StackTraceElementProxy>' @ [73:65] ==> public constructor Proxy<T, P>(clazz: Class<StackTraceElement>, proxyClass: Class<StackTraceElementSerializer.StackTraceElementProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> StackTraceElement
    <P> -> StackTraceElementProxy

'StackTraceElement' @ [73:159] ==> public constructor StackTraceElement(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Int) defined in java.lang.StackTraceElement[JavaClassConstructorDescriptor]

'java' @ [73:184] ==> public val <T> KClass<StackTraceElement>.java: Class<StackTraceElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> StackTraceElement

'StackTraceElementProxy' @ [73:190] ==> public constructor StackTraceElementProxy(declaringClass: String, methodName: String, fileName: String?, lineNumber: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.StackTraceElementProxy[ClassConstructorDescriptorImpl]

'java' @ [73:220] ==> public val <T> KClass<StackTraceElementSerializer.StackTraceElementProxy>.java: Class<StackTraceElementSerializer.StackTraceElementProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> StackTraceElementProxy

'factory' @ [73:226] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.<init>[ValueParameterDescriptorImpl]

'StackTraceElementProxy' @ [74:76] ==> public constructor StackTraceElementProxy(declaringClass: String, methodName: String, fileName: String?, lineNumber: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.StackTraceElementProxy[ClassConstructorDescriptorImpl]

'obj' @ [74:99] ==> value-parameter obj: StackTraceElement defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.toProxy[ValueParameterDescriptorImpl]

'className' @ [74:103] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'obj' @ [74:114] ==> value-parameter obj: StackTraceElement defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.toProxy[ValueParameterDescriptorImpl]

'methodName' @ [74:118] ==> public final val StackTraceElement.methodName: (String..String?)[MyPropertyDescriptor]

'obj' @ [74:130] ==> value-parameter obj: StackTraceElement defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.toProxy[ValueParameterDescriptorImpl]

'fileName' @ [74:134] ==> public final val StackTraceElement.fileName: (String..String?)[MyPropertyDescriptor]

'obj' @ [74:144] ==> value-parameter obj: StackTraceElement defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.toProxy[ValueParameterDescriptorImpl]

'lineNumber' @ [74:148] ==> public final val StackTraceElement.lineNumber: Int[MyPropertyDescriptor]

'StackTraceElement' @ [76:80] ==> public constructor StackTraceElement(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Int) defined in java.lang.StackTraceElement[JavaClassConstructorDescriptor]

'proxy' @ [76:98] ==> value-parameter proxy: StackTraceElementSerializer.StackTraceElementProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.fromProxy[ValueParameterDescriptorImpl]

'declaringClass' @ [76:104] ==> public final val declaringClass: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.StackTraceElementProxy[PropertyDescriptorImpl]

'proxy' @ [76:120] ==> value-parameter proxy: StackTraceElementSerializer.StackTraceElementProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.fromProxy[ValueParameterDescriptorImpl]

'methodName' @ [76:126] ==> public final val methodName: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.StackTraceElementProxy[PropertyDescriptorImpl]

'proxy' @ [76:138] ==> value-parameter proxy: StackTraceElementSerializer.StackTraceElementProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.fromProxy[ValueParameterDescriptorImpl]

'fileName' @ [76:144] ==> public final val fileName: String? defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.StackTraceElementProxy[PropertyDescriptorImpl]

'proxy' @ [76:154] ==> value-parameter proxy: StackTraceElementSerializer.StackTraceElementProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.fromProxy[ValueParameterDescriptorImpl]

'lineNumber' @ [76:160] ==> public final val lineNumber: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.StackTraceElementSerializer.StackTraceElementProxy[PropertyDescriptorImpl]

