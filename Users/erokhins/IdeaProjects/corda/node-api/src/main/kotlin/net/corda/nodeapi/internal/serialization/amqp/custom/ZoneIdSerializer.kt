'CustomSerializer.Proxy<ZoneId, ZoneIdSerializer.ZoneIdProxy>' @ [10:54] ==> public constructor Proxy<T, P>(clazz: Class<ZoneId>, proxyClass: Class<ZoneIdSerializer.ZoneIdProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> ZoneId
    <P> -> ZoneIdProxy

'ZoneId' @ [10:115] ==> public/*package*/ constructor ZoneId() defined in java.time.ZoneId[JavaClassConstructorDescriptor]

'java' @ [10:129] ==> public val <T> KClass<ZoneId>.java: Class<ZoneId> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ZoneId

'ZoneIdProxy' @ [10:135] ==> public constructor ZoneIdProxy(id: String) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer.ZoneIdProxy[ClassConstructorDescriptorImpl]

'java' @ [10:154] ==> public val <T> KClass<ZoneIdSerializer.ZoneIdProxy>.java: Class<ZoneIdSerializer.ZoneIdProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ZoneIdProxy

'factory' @ [10:160] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer.<init>[ValueParameterDescriptorImpl]

'ZoneIdProxy' @ [11:54] ==> public constructor ZoneIdProxy(id: String) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer.ZoneIdProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:66] ==> value-parameter obj: ZoneId defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer.toProxy[ValueParameterDescriptorImpl]

'id' @ [11:70] ==> public final val ZoneId.id: (String..String?)[MyPropertyDescriptor]

'of' @ [13:65] ==> public open fun of(p0: (String..String?)): (ZoneId..ZoneId?) defined in java.time.ZoneId[JavaMethodDescriptor]

'proxy' @ [13:68] ==> value-parameter proxy: ZoneIdSerializer.ZoneIdProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer.fromProxy[ValueParameterDescriptorImpl]

'id' @ [13:74] ==> public final val id: String defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer.ZoneIdProxy[PropertyDescriptorImpl]

