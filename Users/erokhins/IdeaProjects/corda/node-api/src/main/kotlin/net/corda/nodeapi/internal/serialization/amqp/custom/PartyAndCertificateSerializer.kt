'CustomSerializer.Proxy<PartyAndCertificate, PartyAndCertificateSerializer.PartyAndCertificateProxy>' @ [15:67] ==> public constructor Proxy<T, P>(clazz: Class<PartyAndCertificate>, proxyClass: Class<PartyAndCertificateSerializer.PartyAndCertificateProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> PartyAndCertificate
    <P> -> PartyAndCertificateProxy

'PartyAndCertificate' @ [15:167] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'java' @ [15:194] ==> public val <T> KClass<PartyAndCertificate>.java: Class<PartyAndCertificate> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'PartyAndCertificateProxy' @ [15:200] ==> public constructor PartyAndCertificateProxy(type: String, encoded: ByteArray) defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.PartyAndCertificateProxy[ClassConstructorDescriptorImpl]

'java' @ [15:232] ==> public val <T> KClass<PartyAndCertificateSerializer.PartyAndCertificateProxy>.java: Class<PartyAndCertificateSerializer.PartyAndCertificateProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PartyAndCertificateProxy

'factory' @ [15:238] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.<init>[ValueParameterDescriptorImpl]

'PartyAndCertificateProxy' @ [16:80] ==> public constructor PartyAndCertificateProxy(type: String, encoded: ByteArray) defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.PartyAndCertificateProxy[ClassConstructorDescriptorImpl]

'obj' @ [16:105] ==> value-parameter obj: PartyAndCertificate defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.toProxy[ValueParameterDescriptorImpl]

'certPath' @ [16:109] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'type' @ [16:118] ==> public final val CertPath.type: (String..String?)[MyPropertyDescriptor]

'obj' @ [16:124] ==> value-parameter obj: PartyAndCertificate defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.toProxy[ValueParameterDescriptorImpl]

'certPath' @ [16:128] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'encoded' @ [16:137] ==> public final val CertPath.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'getInstance' @ [20:41] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'proxy' @ [20:53] ==> value-parameter proxy: PartyAndCertificateSerializer.PartyAndCertificateProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.fromProxy[ValueParameterDescriptorImpl]

'type' @ [20:59] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.PartyAndCertificateProxy[PropertyDescriptorImpl]

'PartyAndCertificate' @ [21:20] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'cf' @ [21:40] ==> val cf: (CertificateFactory..CertificateFactory?) defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.fromProxy[LocalVariableDescriptor]

'generateCertPath' @ [21:43] ==> public final fun generateCertPath(p0: (InputStream..InputStream?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'ByteArrayInputStream' @ [21:60] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'proxy' @ [21:81] ==> value-parameter proxy: PartyAndCertificateSerializer.PartyAndCertificateProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.fromProxy[ValueParameterDescriptorImpl]

'encoded' @ [21:87] ==> public final val encoded: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.PartyAndCertificateProxy[PropertyDescriptorImpl]

'NotSerializableException' @ [23:23] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'+' @ [23:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'type' @ [23:82] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer[PropertyDescriptorImpl]

'nse' @ [24:13] ==> val nse: NotSerializableException defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.fromProxy[LocalVariableDescriptor]

'initCause' @ [24:17] ==> public open fun initCause(p0: (Throwable..Throwable?)): (Throwable..Throwable?) defined in java.io.NotSerializableException[JavaMethodDescriptor]

'ce' @ [24:27] ==> val ce: CertificateException defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.fromProxy[LocalVariableDescriptor]

'nse' @ [25:19] ==> val nse: NotSerializableException defined in net.corda.nodeapi.internal.serialization.amqp.custom.PartyAndCertificateSerializer.fromProxy[LocalVariableDescriptor]

