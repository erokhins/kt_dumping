'getValue' @ [49:64] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'load' @ [50:23] ==> public open fun <S : (Any..Any?)> load(p0: (Class<(CordaPluginRegistry..CordaPluginRegistry?)>..Class<(CordaPluginRegistry..CordaPluginRegistry?)>?), p1: (ClassLoader..ClassLoader?)): (ServiceLoader<(CordaPluginRegistry..CordaPluginRegistry?)>..ServiceLoader<(CordaPluginRegistry..CordaPluginRegistry?)>?) defined in java.util.ServiceLoader[JavaMethodDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (net.corda.core.node.CordaPluginRegistry..net.corda.core.node.CordaPluginRegistry?)

'CordaPluginRegistry' @ [50:28] ==> public constructor CordaPluginRegistry() defined in net.corda.core.node.CordaPluginRegistry[DeserializedClassConstructorDescriptor]

'java' @ [50:55] ==> public val <T> KClass<CordaPluginRegistry>.java: Class<CordaPluginRegistry> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaPluginRegistry

'this' @ [50:61] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer[LazyClassReceiverParameterDescriptor]

'javaClass' @ [50:66] ==> public val <T : Any> DefaultKryoCustomizer.javaClass: Class<DefaultKryoCustomizer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> DefaultKryoCustomizer

'classLoader' @ [50:76] ==> public final val <T : (Any..Any?)> Class<DefaultKryoCustomizer>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DefaultKryoCustomizer

'toList' @ [50:89] ==> public fun <T> Iterable<(CordaPluginRegistry..CordaPluginRegistry?)>.toList(): List<(CordaPluginRegistry..CordaPluginRegistry?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.CordaPluginRegistry..net.corda.core.node.CordaPluginRegistry?)

'kryo' @ [54:16] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize[ValueParameterDescriptorImpl]

'apply' @ [54:21] ==> @InlineOnly public inline fun <T> Kryo.apply(block: Kryo.() -> Unit): Kryo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Kryo

'setDefaultSerializer' @ [57:13] ==> public open fun setDefaultSerializer(p0: (Class<out raw (Serializer<(Any..Any?)>..Serializer<*>?)>..Class<out raw (Serializer<(Any..Any?)>..Serializer<*>?)>?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'CompatibleFieldSerializer' @ [57:34] ==> public constructor CompatibleFieldSerializer<T : (Any..Any?)>(p0: (Kryo..Kryo?), p1: raw (Class<(Any..Any?)>..Class<*>?)) defined in com.esotericsoftware.kryo.serializers.CompatibleFieldSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@15fb65a5

'java' @ [57:67] ==> public val <T> KClass<CompatibleFieldSerializer<*>>.java: Class<CompatibleFieldSerializer<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompatibleFieldSerializer<*>

'fieldSerializerConfig' @ [59:13] ==> public final val Kryo.fieldSerializerConfig: (FieldSerializerConfig..FieldSerializerConfig?)[MyPropertyDescriptor]

'cachedFieldNameStrategy' @ [59:35] ==> public final var FieldSerializerConfig.cachedFieldNameStrategy: (FieldSerializer.CachedFieldNameStrategy..FieldSerializer.CachedFieldNameStrategy?)[MyPropertyDescriptor]

'EXTENDED' @ [59:101] ==> public final val EXTENDED: (FieldSerializer.CachedFieldNameStrategy..FieldSerializer.CachedFieldNameStrategy?) defined in com.esotericsoftware.kryo.serializers.FieldSerializer.CachedFieldNameStrategy[JavaPropertyDescriptor]

'instantiatorStrategy' @ [61:13] ==> public final var Kryo.instantiatorStrategy: (InstantiatorStrategy..InstantiatorStrategy?)[MyPropertyDescriptor]

'CustomInstantiatorStrategy' @ [61:36] ==> public constructor CustomInstantiatorStrategy() defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy[ClassConstructorDescriptorImpl]

'addDefaultSerializer' @ [65:13] ==> public open fun addDefaultSerializer(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'InputStream' @ [65:34] ==> public constructor InputStream() defined in java.io.InputStream[JavaClassConstructorDescriptor]

'java' @ [65:53] ==> public val <T> KClass<InputStream>.java: Class<InputStream> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InputStream

'InputStreamSerializer' @ [65:59] ==> public object InputStreamSerializer : Serializer<InputStream> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'addDefaultSerializer' @ [66:13] ==> public open fun addDefaultSerializer(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [66:58] ==> public val <T> KClass<SerializeAsToken>.java: Class<SerializeAsToken> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SerializeAsToken

'SerializeAsTokenSerializer' @ [66:64] ==> public constructor SerializeAsTokenSerializer<T : SerializeAsToken>() defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer[ClassConstructorDescriptorImpl]
Inferred types:
    <T : SerializeAsToken> -> SerializeAsToken

'addDefaultSerializer' @ [67:13] ==> public open fun addDefaultSerializer(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [67:48] ==> public val <T> KClass<Logger>.java: Class<Logger> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Logger

'LoggerSerializer' @ [67:54] ==> @ThreadSafe public object LoggerSerializer : Serializer<Logger> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [74:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'asList' @ [74:29] ==> @SafeVarargs public open fun <T : (Any..Any?)> asList(vararg p0: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'javaClass' @ [74:40] ==> public val <T : Any> (MutableList<(String..String?)>..List<(String..String?)>?).javaClass: Class<(MutableList<(String..String?)>..List<(String..String?)>?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (kotlin.collections.MutableList<(kotlin.String..kotlin.String?)>..kotlin.collections.List<(kotlin.String..kotlin.String?)>?)

'ArraysAsListSerializer' @ [74:51] ==> public constructor ArraysAsListSerializer() defined in de.javakaffee.kryoserializers.ArraysAsListSerializer[JavaClassConstructorDescriptor]

'register' @ [75:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [75:47] ==> public val <T> KClass<SignedTransaction>.java: Class<SignedTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SignedTransaction

'SignedTransactionSerializer' @ [75:53] ==> @ThreadSafe public object SignedTransactionSerializer : Serializer<SignedTransaction> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [76:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'WireTransaction' @ [76:22] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'java' @ [76:45] ==> public val <T> KClass<WireTransaction>.java: Class<WireTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> WireTransaction

'WireTransactionSerializer' @ [76:51] ==> @ThreadSafe public object WireTransactionSerializer : Serializer<WireTransaction> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [77:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'SerializedBytes' @ [77:22] ==> public constructor SerializedBytes<T : Any>(bytes: ByteArray) defined in net.corda.core.serialization.SerializedBytes[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@2cacc942

'java' @ [77:45] ==> public val <T> KClass<SerializedBytes<*>>.java: Class<SerializedBytes<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SerializedBytes<*>

'SerializedBytesSerializer' @ [77:51] ==> public object SerializedBytesSerializer : Serializer<SerializedBytes<Any>> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'registerSerializers' @ [78:47] ==> public open fun registerSerializers(p0: (Kryo..Kryo?)): Unit defined in de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer[JavaMethodDescriptor]

'this' @ [78:67] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[ReceiverParameterDescriptorImpl]

'registerSerializers' @ [79:37] ==> public open fun registerSerializers(p0: (Kryo..Kryo?)): Unit defined in de.javakaffee.kryoserializers.guava.ImmutableListSerializer[JavaMethodDescriptor]

'this' @ [79:57] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[ReceiverParameterDescriptorImpl]

'registerSerializers' @ [80:36] ==> public open fun registerSerializers(p0: (Kryo..Kryo?)): Unit defined in de.javakaffee.kryoserializers.guava.ImmutableSetSerializer[JavaMethodDescriptor]

'this' @ [80:56] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[ReceiverParameterDescriptorImpl]

'registerSerializers' @ [81:42] ==> public open fun registerSerializers(p0: (Kryo..Kryo?)): Unit defined in de.javakaffee.kryoserializers.guava.ImmutableSortedSetSerializer[JavaMethodDescriptor]

'this' @ [81:62] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[ReceiverParameterDescriptorImpl]

'registerSerializers' @ [82:36] ==> public open fun registerSerializers(p0: (Kryo..Kryo?)): Unit defined in de.javakaffee.kryoserializers.guava.ImmutableMapSerializer[JavaMethodDescriptor]

'this' @ [82:56] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[ReceiverParameterDescriptorImpl]

'registerSerializers' @ [83:41] ==> public open fun registerSerializers(p0: (Kryo..Kryo?)): Unit defined in de.javakaffee.kryoserializers.guava.ImmutableMultimapSerializer[JavaMethodDescriptor]

'this' @ [83:61] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[ReceiverParameterDescriptorImpl]

'register' @ [85:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [85:49] ==> public val <T> KClass<BufferedInputStream>.java: Class<BufferedInputStream> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BufferedInputStream

'InputStreamSerializer' @ [85:55] ==> public object InputStreamSerializer : Serializer<InputStream> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [86:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'forName' @ [86:28] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'InputStreamSerializer' @ [86:101] ==> public object InputStreamSerializer : Serializer<InputStream> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'noReferencesWithin' @ [87:13] ==> public inline fun <reified T : Any> Kryo.noReferencesWithin(): Unit defined in net.corda.nodeapi.internal.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> WireTransaction

'register' @ [88:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [88:45] ==> public val <T> KClass<ECPublicKeyImpl>.java: Class<ECPublicKeyImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ECPublicKeyImpl

'ECPublicKeyImplSerializer' @ [88:51] ==> @ThreadSafe public object ECPublicKeyImplSerializer : Serializer<ECPublicKeyImpl> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [89:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [89:44] ==> public val <T> KClass<EdDSAPublicKey>.java: Class<EdDSAPublicKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> EdDSAPublicKey

'Ed25519PublicKeySerializer' @ [89:50] ==> @ThreadSafe public object Ed25519PublicKeySerializer : Serializer<EdDSAPublicKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [90:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [90:45] ==> public val <T> KClass<EdDSAPrivateKey>.java: Class<EdDSAPrivateKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> EdDSAPrivateKey

'Ed25519PrivateKeySerializer' @ [90:51] ==> @ThreadSafe public object Ed25519PrivateKeySerializer : Serializer<EdDSAPrivateKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [91:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'CompositeKey' @ [91:22] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'java' @ [91:42] ==> public val <T> KClass<CompositeKey>.java: Class<CompositeKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompositeKey

'CompositeKeySerializer' @ [91:48] ==> @ThreadSafe public object CompositeKeySerializer : Serializer<CompositeKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [93:13] ==> public inline fun <T : Any> Kryo.register(type: KClass<Array<StackTraceElement>>, crossinline read: (Kryo, Input) -> Array<StackTraceElement>, crossinline write: (Kryo, Output, Array<StackTraceElement>) -> Unit): Registration defined in net.corda.nodeapi.internal.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Array<StackTraceElement>

'Array' @ [93:22] ==> public constructor Array<T>(size: Int, init: (Int) -> ???) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@4d0b8357

'emptyArray' @ [93:72] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<StackTraceElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> StackTraceElement

'register' @ [95:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'NonEmptySet' @ [95:22] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'java' @ [95:41] ==> public val <T> KClass<NonEmptySet<*>>.java: Class<NonEmptySet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NonEmptySet<*>

'NonEmptySetSerializer' @ [95:47] ==> private object NonEmptySetSerializer : Serializer<NonEmptySet<Any>> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer[FakeCallableDescriptorForObject]

'register' @ [96:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'BitSet' @ [96:22] ==> public constructor BitSet() defined in java.util.BitSet[JavaClassConstructorDescriptor]

'java' @ [96:36] ==> public val <T> KClass<BitSet>.java: Class<BitSet> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BitSet

'BitSetSerializer' @ [96:42] ==> public constructor BitSetSerializer() defined in de.javakaffee.kryoserializers.BitSetSerializer[JavaClassConstructorDescriptor]

'register' @ [97:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'Class' @ [97:22] ==> private constructor Class<T : (Any..Any?)>(p0: (ClassLoader..ClassLoader?)) defined in java.lang.Class[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@393111e

'java' @ [97:35] ==> public val <T> KClass<Class<*>>.java: Class<Class<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Class<*>

'ClassSerializer' @ [97:41] ==> public object ClassSerializer : Serializer<Class<*>> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [98:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [98:45] ==> public val <T> KClass<FileInputStream>.java: Class<FileInputStream> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileInputStream

'InputStreamSerializer' @ [98:51] ==> public object InputStreamSerializer : Serializer<InputStream> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [99:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'CertPath' @ [99:22] ==> protected/*protected and package*/ constructor CertPath(p0: (String..String?)) defined in java.security.cert.CertPath[JavaClassConstructorDescriptor]

'java' @ [99:38] ==> public val <T> KClass<CertPath>.java: Class<CertPath> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CertPath

'CertPathSerializer' @ [99:44] ==> @ThreadSafe public object CertPathSerializer : Serializer<CertPath> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [100:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [100:42] ==> public val <T> KClass<X509CertPath>.java: Class<X509CertPath> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> X509CertPath

'CertPathSerializer' @ [100:48] ==> @ThreadSafe public object CertPathSerializer : Serializer<CertPath> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [101:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [101:38] ==> public val <T> KClass<X500Name>.java: Class<X500Name> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> X500Name

'X500NameSerializer' @ [101:44] ==> @ThreadSafe public object X500NameSerializer : Serializer<X500Name> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [102:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [102:51] ==> public val <T> KClass<X509CertificateHolder>.java: Class<X509CertificateHolder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> X509CertificateHolder

'X509CertificateSerializer' @ [102:57] ==> @ThreadSafe public object X509CertificateSerializer : Serializer<X509CertificateHolder> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [103:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'BCECPrivateKey' @ [103:22] ==> protected/*protected and package*/ constructor BCECPrivateKey() defined in org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey[JavaClassConstructorDescriptor]

'java' @ [103:44] ==> public val <T> KClass<BCECPrivateKey>.java: Class<BCECPrivateKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BCECPrivateKey

'PrivateKeySerializer' @ [103:50] ==> @ThreadSafe public object PrivateKeySerializer : Serializer<PrivateKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [104:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [104:43] ==> public val <T> KClass<BCECPublicKey>.java: Class<BCECPublicKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BCECPublicKey

'PublicKeySerializer' @ [104:49] ==> @ThreadSafe public object PublicKeySerializer : Serializer<PublicKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [105:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [105:48] ==> public val <T> KClass<BCRSAPrivateCrtKey>.java: Class<BCRSAPrivateCrtKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BCRSAPrivateCrtKey

'PrivateKeySerializer' @ [105:54] ==> @ThreadSafe public object PrivateKeySerializer : Serializer<PrivateKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [106:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [106:44] ==> public val <T> KClass<BCRSAPublicKey>.java: Class<BCRSAPublicKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BCRSAPublicKey

'PublicKeySerializer' @ [106:50] ==> @ThreadSafe public object PublicKeySerializer : Serializer<PublicKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [107:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [107:52] ==> public val <T> KClass<BCSphincs256PrivateKey>.java: Class<BCSphincs256PrivateKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BCSphincs256PrivateKey

'PrivateKeySerializer' @ [107:58] ==> @ThreadSafe public object PrivateKeySerializer : Serializer<PrivateKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [108:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [108:51] ==> public val <T> KClass<BCSphincs256PublicKey>.java: Class<BCSphincs256PublicKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BCSphincs256PublicKey

'PublicKeySerializer' @ [108:57] ==> @ThreadSafe public object PublicKeySerializer : Serializer<PublicKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [109:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [109:61] ==> public val <T> KClass<ECPublicKeyImpl>.java: Class<ECPublicKeyImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ECPublicKeyImpl

'PublicKeySerializer' @ [109:67] ==> @ThreadSafe public object PublicKeySerializer : Serializer<PublicKey> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [110:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'NotaryChangeWireTransaction' @ [110:22] ==> public constructor NotaryChangeWireTransaction(inputs: List<StateRef>, notary: Party, newNotary: Party) defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedClassConstructorDescriptor]

'java' @ [110:57] ==> public val <T> KClass<NotaryChangeWireTransaction>.java: Class<NotaryChangeWireTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'NotaryChangeWireTransactionSerializer' @ [110:63] ==> @ThreadSafe public object NotaryChangeWireTransactionSerializer : Serializer<NotaryChangeWireTransaction> defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[FakeCallableDescriptorForObject]

'register' @ [111:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'PartyAndCertificate' @ [111:22] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'java' @ [111:49] ==> public val <T> KClass<PartyAndCertificate>.java: Class<PartyAndCertificate> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'PartyAndCertificateSerializer' @ [111:55] ==> private object PartyAndCertificateSerializer : Serializer<PartyAndCertificate> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer[FakeCallableDescriptorForObject]

'register' @ [114:13] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'PrivacySalt' @ [114:22] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[DeserializedClassConstructorDescriptor]

'java' @ [114:41] ==> public val <T> KClass<PrivacySalt>.java: Class<PrivacySalt> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PrivacySalt

'PrivacySaltSerializer' @ [114:47] ==> private object PrivacySaltSerializer : Serializer<PrivacySalt> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer[FakeCallableDescriptorForObject]

'KryoSerializationCustomization' @ [116:33] ==> public constructor KryoSerializationCustomization(kryo: Kryo) defined in net.corda.nodeapi.internal.serialization.KryoSerializationCustomization[ClassConstructorDescriptorImpl]

'this' @ [116:64] ==> <this> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[ReceiverParameterDescriptorImpl]

'pluginRegistries' @ [117:13] ==> private final val pluginRegistries: List<CordaPluginRegistry> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer[PropertyDescriptorImpl]

'forEach' @ [117:30] ==> @HidesMembers public inline fun <T> Iterable<CordaPluginRegistry>.forEach(action: (CordaPluginRegistry) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaPluginRegistry

'it' @ [117:40] ==> value-parameter it: CordaPluginRegistry defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'customizeSerialization' @ [117:43] ==> public open fun customizeSerialization(custom: SerializationCustomization): Boolean defined in net.corda.core.node.CordaPluginRegistry[DeserializedSimpleFunctionDescriptor]

'customization' @ [117:66] ==> val customization: KryoSerializationCustomization defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.customize.<anonymous>[LocalVariableDescriptor]

'StdInstantiatorStrategy' @ [122:40] ==> public constructor StdInstantiatorStrategy() defined in org.objenesis.strategy.StdInstantiatorStrategy[JavaClassConstructorDescriptor]

'DefaultInstantiatorStrategy' @ [125:44] ==> public constructor DefaultInstantiatorStrategy(p0: (InstantiatorStrategy..InstantiatorStrategy?)) defined in com.esotericsoftware.kryo.Kryo.DefaultInstantiatorStrategy[JavaClassConstructorDescriptor]

'fallbackStrategy' @ [125:72] ==> private final val fallbackStrategy: StdInstantiatorStrategy defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy[PropertyDescriptorImpl]

'if (type.name.startsWith("java.") && !isPublic(type.modifiers)) fallbackStrategy else defaultStrategy' @ [128:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InstantiatorStrategy, elseBranch: InstantiatorStrategy): InstantiatorStrategy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InstantiatorStrategy

'type' @ [128:29] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy.newInstantiatorOf[ValueParameterDescriptorImpl]

'name' @ [128:34] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'startsWith' @ [128:39] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'!' @ [128:62] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isPublic' @ [128:63] ==> public open fun isPublic(p0: Int): Boolean defined in java.lang.reflect.Modifier[JavaMethodDescriptor]

'type' @ [128:72] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy.newInstantiatorOf[ValueParameterDescriptorImpl]

'modifiers' @ [128:77] ==> public final val <T : (Any..Any?)> Class<T>.modifiers: Int[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'fallbackStrategy' @ [128:89] ==> private final val fallbackStrategy: StdInstantiatorStrategy defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy[PropertyDescriptorImpl]

'defaultStrategy' @ [128:111] ==> private final val defaultStrategy: Kryo.DefaultInstantiatorStrategy defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy[PropertyDescriptorImpl]

'strat' @ [129:20] ==> val strat: InstantiatorStrategy defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy.newInstantiatorOf[LocalVariableDescriptor]

'newInstantiatorOf' @ [129:26] ==> public abstract fun <T : (Any..Any?)> newInstantiatorOf(p0: (Class<(T..T?)>..Class<(T..T?)>?)): (ObjectInstantiator<(T..T?)>..ObjectInstantiator<(T..T?)>?) defined in org.objenesis.strategy.InstantiatorStrategy[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'type' @ [129:44] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.CustomInstantiatorStrategy.newInstantiatorOf[ValueParameterDescriptorImpl]

'Serializer<PartyAndCertificate>' @ [133:52] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PartyAndCertificate

'kryo' @ [135:13] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PartyAndCertificateSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [135:18] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [135:38] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PartyAndCertificateSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [135:46] ==> value-parameter obj: PartyAndCertificate defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PartyAndCertificateSerializer.write[ValueParameterDescriptorImpl]

'certPath' @ [135:50] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'PartyAndCertificate' @ [138:20] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'kryo' @ [138:40] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PartyAndCertificateSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [138:45] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [138:64] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PartyAndCertificateSerializer.read[ValueParameterDescriptorImpl]

'Serializer<NonEmptySet<Any>>' @ [142:44] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NonEmptySet<Any>

'output' @ [145:13] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.write[ValueParameterDescriptorImpl]

'writeInt' @ [145:20] ==> public open fun writeInt(p0: Int, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [145:29] ==> value-parameter obj: NonEmptySet<Any> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.write[ValueParameterDescriptorImpl]

'size' @ [145:33] ==> public open val size: Int defined in net.corda.core.utilities.NonEmptySet[DeserializedPropertyDescriptor]

'obj' @ [146:13] ==> value-parameter obj: NonEmptySet<Any> defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.write[ValueParameterDescriptorImpl]

'forEach' @ [146:17] ==> @HidesMembers public inline fun <T> Iterable<Any>.forEach(action: (Any) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'kryo' @ [146:27] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [146:32] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [146:52] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.write[ValueParameterDescriptorImpl]

'it' @ [146:60] ==> value-parameter it: Any defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.write.<anonymous>[ValueParameterDescriptorImpl]

'input' @ [150:24] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[ValueParameterDescriptorImpl]

'readInt' @ [150:30] ==> public open fun readInt(p0: Boolean): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'require' @ [151:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'size' @ [151:21] ==> val size: Int defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[LocalVariableDescriptor]

'size' @ [151:68] ==> val size: Int defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[LocalVariableDescriptor]

'ArrayList' @ [152:24] ==> public final fun <E> <init>(p0: Int): ArrayList<Any> /* = ArrayList<Any> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Any

'size' @ [152:39] ==> val size: Int defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[LocalVariableDescriptor]

'repeat' @ [153:13] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'size' @ [153:20] ==> val size: Int defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[LocalVariableDescriptor]

'list' @ [154:17] ==> val list: ArrayList<Any> /* = ArrayList<Any> */ defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[LocalVariableDescriptor]

'kryo' @ [154:25] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [154:30] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [154:49] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[ValueParameterDescriptorImpl]

'list' @ [156:20] ==> val list: ArrayList<Any> /* = ArrayList<Any> */ defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.NonEmptySetSerializer.read[LocalVariableDescriptor]

'toNonEmptySet' @ [156:25] ==> public fun <T> Collection<Any>.toNonEmptySet(): NonEmptySet<Any> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'Serializer<PrivacySalt>' @ [164:44] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PrivacySalt

'output' @ [166:13] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PrivacySaltSerializer.write[ValueParameterDescriptorImpl]

'writeBytesWithLength' @ [166:20] ==> public fun Output.writeBytesWithLength(byteArray: ByteArray): Unit defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'obj' @ [166:41] ==> value-parameter obj: PrivacySalt defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PrivacySaltSerializer.write[ValueParameterDescriptorImpl]

'bytes' @ [166:45] ==> public open val bytes: ByteArray defined in net.corda.core.contracts.PrivacySalt[DeserializedPropertyDescriptor]

'PrivacySalt' @ [170:20] ==> public constructor PrivacySalt(bytes: ByteArray) defined in net.corda.core.contracts.PrivacySalt[DeserializedClassConstructorDescriptor]

'input' @ [170:32] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.DefaultKryoCustomizer.PrivacySaltSerializer.read[ValueParameterDescriptorImpl]

'readBytesWithLength' @ [170:38] ==> public fun Input.readBytesWithLength(): ByteArray defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

