'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'OldConfig' @ [19:9] ==> public constructor OldConfig(value: String) defined in net.corda.nodeapi.config.OldConfig[ClassConstructorDescriptorImpl]

'javaClass' @ [23:42] ==> public val <T : Any> User.javaClass: Class<User> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> User

'simpleName' @ [23:52] ==> public final val <T : (Any..Any?)> Class<User>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> User

'username' @ [23:65] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[PropertyDescriptorImpl]

'permissions' @ [23:88] ==> public final val permissions: Set<String> defined in net.corda.nodeapi.User[PropertyDescriptorImpl]

'mapOf' @ [24:19] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [25:13] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'username' @ [25:27] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[PropertyDescriptorImpl]

'to' @ [26:13] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'password' @ [26:27] ==> public final val password: String defined in net.corda.nodeapi.User[PropertyDescriptorImpl]

'to' @ [27:13] ==> public infix fun <A, B> String.to(that: Set<String>): Pair<String, Set<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Set<String>

'permissions' @ [27:30] ==> public final val permissions: Set<String> defined in net.corda.nodeapi.User[PropertyDescriptorImpl]

'Target' @ [32:1] ==> public constructor Target(vararg allowedTargets: AnnotationTarget) defined in kotlin.annotation.Target[DeserializedClassConstructorDescriptor]

'FUNCTION' @ [32:26] ==> enum entry FUNCTION defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'MustBeDocumented' @ [33:1] ==> public constructor MustBeDocumented() defined in kotlin.annotation.MustBeDocumented[DeserializedClassConstructorDescriptor]

'CordaRuntimeException' @ [40:64] ==> public constructor CordaRuntimeException(message: String?, cause: Throwable?) defined in net.corda.core.CordaRuntimeException[DeserializedClassConstructorDescriptor]

'message' @ [40:86] ==> value-parameter message: String? defined in net.corda.nodeapi.RPCException.<init>[ValueParameterDescriptorImpl]

'cause' @ [40:95] ==> value-parameter cause: Throwable? defined in net.corda.nodeapi.RPCException.<init>[ValueParameterDescriptorImpl]

'this' @ [41:32] ==> public constructor RPCException(message: String?, cause: Throwable?) defined in net.corda.nodeapi.RPCException[ClassConstructorDescriptorImpl]

'msg' @ [41:37] ==> value-parameter msg: String defined in net.corda.nodeapi.RPCException.<init>[ValueParameterDescriptorImpl]

'CordaSerializable' @ [44:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'RuntimeException' @ [45:42] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'msg' @ [45:59] ==> value-parameter msg: String defined in net.corda.nodeapi.PermissionException.<init>[ValueParameterDescriptorImpl]

'CordaKryo' @ [50:110] ==> public constructor CordaKryo(classResolver: ClassResolver) defined in net.corda.nodeapi.internal.serialization.CordaKryo[ClassConstructorDescriptorImpl]

'CordaClassResolver' @ [50:120] ==> public constructor CordaClassResolver(serializationContext: SerializationContext) defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[ClassConstructorDescriptorImpl]

'serializationContext' @ [50:139] ==> value-parameter serializationContext: SerializationContext defined in net.corda.nodeapi.RPCKryo.<init>[ValueParameterDescriptorImpl]

'DefaultKryoCustomizer' @ [52:9] ==> public object DefaultKryoCustomizer defined in net.corda.nodeapi.internal.serialization in file DefaultKryoCustomizer.kt[FakeCallableDescriptorForObject]

'customize' @ [52:31] ==> public final fun customize(kryo: Kryo): Kryo defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer[SimpleFunctionDescriptorImpl]

'this' @ [52:41] ==> <this> defined in net.corda.nodeapi.RPCKryo[LazyClassReceiverParameterDescriptor]

'register' @ [55:9] ==> public open fun register(type: Class<*>?, serializer: Serializer<*>?): Registration defined in net.corda.nodeapi.RPCKryo[SimpleFunctionDescriptorImpl]

'InputStream' @ [55:18] ==> public constructor InputStream() defined in java.io.InputStream[JavaClassConstructorDescriptor]

'java' @ [55:37] ==> public val <T> KClass<InputStream>.java: Class<InputStream> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InputStream

'InputStreamSerializer' @ [55:43] ==> public object InputStreamSerializer : Serializer<InputStream> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [56:9] ==> public open fun register(type: Class<*>?, serializer: Serializer<*>?): Registration defined in net.corda.nodeapi.RPCKryo[SimpleFunctionDescriptorImpl]

'java' @ [56:36] ==> public val <T> KClass<Observable<*>>.java: Class<Observable<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Observable<*>

'observableSerializer' @ [56:42] ==> value-parameter observableSerializer: Serializer<Observable<*>> defined in net.corda.nodeapi.RPCKryo.<init>[ValueParameterDescriptorImpl]

'register' @ [57:9] ==> public inline fun <T : Any> Kryo.register(type: KClass<CordaFuture<*>>, crossinline read: (Kryo, Input) -> CordaFuture<*>, crossinline write: (Kryo, Output, CordaFuture<*>) -> Unit): Registration defined in net.corda.nodeapi.internal.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> CordaFuture<*>

'observableSerializer' @ [58:41] ==> value-parameter observableSerializer: Serializer<Observable<*>> defined in net.corda.nodeapi.RPCKryo.<init>[ValueParameterDescriptorImpl]

'read' @ [58:62] ==> public abstract fun read(p0: (Kryo..Kryo?), p1: (Input..Input?), p2: (Class<(Observable<*>..Observable<*>?)>..Class<(Observable<*>..Observable<*>?)>?)): (Observable<*>..Observable<*>?) defined in com.esotericsoftware.kryo.Serializer[JavaMethodDescriptor]

'kryo' @ [58:67] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.RPCKryo.<init>.<anonymous>[ValueParameterDescriptorImpl]

'input' @ [58:73] ==> value-parameter input: Input defined in net.corda.nodeapi.RPCKryo.<init>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [58:98] ==> public val <T> KClass<Observable<*>>.java: Class<Observable<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Observable<*>

'toFuture' @ [58:104] ==> public fun <T> Observable<out (Any..Any?)>.toFuture(): CordaFuture<out (Any..Any?)> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Captured(*)

'observableSerializer' @ [59:48] ==> value-parameter observableSerializer: Serializer<Observable<*>> defined in net.corda.nodeapi.RPCKryo.<init>[ValueParameterDescriptorImpl]

'write' @ [59:69] ==> public abstract fun write(p0: (Kryo..Kryo?), p1: (Output..Output?), p2: (Observable<*>..Observable<*>?)): Unit defined in com.esotericsoftware.kryo.Serializer[JavaMethodDescriptor]

'kryo' @ [59:75] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.RPCKryo.<init>.<anonymous>[ValueParameterDescriptorImpl]

'output' @ [59:81] ==> value-parameter output: Output defined in net.corda.nodeapi.RPCKryo.<init>.<anonymous>[ValueParameterDescriptorImpl]

'obj' @ [59:89] ==> value-parameter obj: CordaFuture<*> defined in net.corda.nodeapi.RPCKryo.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toObservable' @ [59:93] ==> public fun <A> CordaFuture<out Any?>.toObservable(): Observable<Any?> defined in net.corda.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Any?

'!=' @ [64:13] ==> public open fun equals(other: Any?): Boolean defined in java.lang.Class[DeserializedSimpleFunctionDescriptor]

'java' @ [64:31] ==> public val <T> KClass<Observable<*>>.java: Class<Observable<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Observable<*>

'type' @ [64:39] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'java' @ [64:65] ==> public val <T> KClass<Observable<*>>.java: Class<Observable<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Observable<*>

'isAssignableFrom' @ [64:70] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [64:87] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'super' @ [65:20] ==> <this> defined in net.corda.nodeapi.RPCKryo[LazyClassReceiverParameterDescriptor]

'getRegistration' @ [65:26] ==> public open fun getRegistration(p0: raw (Class<(Any..Any?)>..Class<*>?)): (Registration..Registration?) defined in net.corda.nodeapi.internal.serialization.CordaKryo[JavaMethodDescriptor]

'java' @ [65:60] ==> public val <T> KClass<Observable<*>>.java: Class<Observable<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Observable<*>

'InputStream' @ [67:13] ==> public constructor InputStream() defined in java.io.InputStream[JavaClassConstructorDescriptor]

'java' @ [67:32] ==> public val <T> KClass<InputStream>.java: Class<InputStream> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InputStream

'type' @ [67:40] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'InputStream' @ [67:48] ==> public constructor InputStream() defined in java.io.InputStream[JavaClassConstructorDescriptor]

'java' @ [67:67] ==> public val <T> KClass<InputStream>.java: Class<InputStream> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InputStream

'isAssignableFrom' @ [67:72] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [67:89] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'super' @ [68:20] ==> <this> defined in net.corda.nodeapi.RPCKryo[LazyClassReceiverParameterDescriptor]

'getRegistration' @ [68:26] ==> public open fun getRegistration(p0: raw (Class<(Any..Any?)>..Class<*>?)): (Registration..Registration?) defined in net.corda.nodeapi.internal.serialization.CordaKryo[JavaMethodDescriptor]

'InputStream' @ [68:42] ==> public constructor InputStream() defined in java.io.InputStream[JavaClassConstructorDescriptor]

'java' @ [68:61] ==> public val <T> KClass<InputStream>.java: Class<InputStream> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InputStream

'!=' @ [70:13] ==> public open fun equals(other: Any?): Boolean defined in java.lang.Class[DeserializedSimpleFunctionDescriptor]

'java' @ [70:32] ==> public val <T> KClass<CordaFuture<*>>.java: Class<CordaFuture<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaFuture<*>

'type' @ [70:40] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'java' @ [70:67] ==> public val <T> KClass<CordaFuture<*>>.java: Class<CordaFuture<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaFuture<*>

'isAssignableFrom' @ [70:72] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'type' @ [70:89] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'super' @ [71:20] ==> <this> defined in net.corda.nodeapi.RPCKryo[LazyClassReceiverParameterDescriptor]

'getRegistration' @ [71:26] ==> public open fun getRegistration(p0: raw (Class<(Any..Any?)>..Class<*>?)): (Registration..Registration?) defined in net.corda.nodeapi.internal.serialization.CordaKryo[JavaMethodDescriptor]

'java' @ [71:61] ==> public val <T> KClass<CordaFuture<*>>.java: Class<CordaFuture<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaFuture<*>

'type' @ [73:9] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'requireExternal' @ [73:14] ==> private final fun Class<*>.requireExternal(msg: String): Unit defined in net.corda.nodeapi.RPCKryo[SimpleFunctionDescriptorImpl]

'super' @ [74:16] ==> <this> defined in net.corda.nodeapi.RPCKryo[LazyClassReceiverParameterDescriptor]

'getRegistration' @ [74:22] ==> public open fun getRegistration(p0: raw (Class<(Any..Any?)>..Class<*>?)): (Registration..Registration?) defined in net.corda.nodeapi.internal.serialization.CordaKryo[JavaMethodDescriptor]

'type' @ [74:38] ==> value-parameter type: Class<*> defined in net.corda.nodeapi.RPCKryo.getRegistration[ValueParameterDescriptorImpl]

'require' @ [78:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [78:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [78:18] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'startsWith' @ [78:23] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [78:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [78:57] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'contains' @ [78:62] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'msg' @ [78:90] ==> value-parameter msg: String defined in net.corda.nodeapi.RPCKryo.requireExternal[ValueParameterDescriptorImpl]

'name' @ [78:96] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

