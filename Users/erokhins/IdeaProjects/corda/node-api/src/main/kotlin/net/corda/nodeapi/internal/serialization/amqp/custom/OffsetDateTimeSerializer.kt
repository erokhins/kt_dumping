'CustomSerializer.Proxy<OffsetDateTime, OffsetDateTimeSerializer.OffsetDateTimeProxy>' @ [10:62] ==> public constructor Proxy<T, P>(clazz: Class<OffsetDateTime>, proxyClass: Class<OffsetDateTimeSerializer.OffsetDateTimeProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> OffsetDateTime
    <P> -> OffsetDateTimeProxy

'OffsetDateTime' @ [10:147] ==> private constructor OffsetDateTime(p0: (LocalDateTime..LocalDateTime?), p1: (ZoneOffset..ZoneOffset?)) defined in java.time.OffsetDateTime[JavaClassConstructorDescriptor]

'java' @ [10:169] ==> public val <T> KClass<OffsetDateTime>.java: Class<OffsetDateTime> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> OffsetDateTime

'OffsetDateTimeProxy' @ [10:175] ==> public constructor OffsetDateTimeProxy(dateTime: LocalDateTime, offset: ZoneOffset) defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.OffsetDateTimeProxy[ClassConstructorDescriptorImpl]

'java' @ [10:202] ==> public val <T> KClass<OffsetDateTimeSerializer.OffsetDateTimeProxy>.java: Class<OffsetDateTimeSerializer.OffsetDateTimeProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> OffsetDateTimeProxy

'factory' @ [10:208] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'listOf' @ [11:79] ==> public fun <T> listOf(vararg elements: CustomSerializer.Proxy<out Serializable, out Any>): List<CustomSerializer.Proxy<out Serializable, out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Proxy<out Serializable, out Any>

'LocalDateTimeSerializer' @ [11:86] ==> public constructor LocalDateTimeSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer[ClassConstructorDescriptorImpl]

'factory' @ [11:110] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'ZoneIdSerializer' @ [11:120] ==> public constructor ZoneIdSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer[ClassConstructorDescriptorImpl]

'factory' @ [11:137] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'OffsetDateTimeProxy' @ [13:70] ==> public constructor OffsetDateTimeProxy(dateTime: LocalDateTime, offset: ZoneOffset) defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.OffsetDateTimeProxy[ClassConstructorDescriptorImpl]

'obj' @ [13:90] ==> value-parameter obj: OffsetDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'toLocalDateTime' @ [13:94] ==> public open fun toLocalDateTime(): (LocalDateTime..LocalDateTime?) defined in java.time.OffsetDateTime[JavaMethodDescriptor]

'obj' @ [13:113] ==> value-parameter obj: OffsetDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'offset' @ [13:117] ==> public final val OffsetDateTime.offset: (ZoneOffset..ZoneOffset?)[MyPropertyDescriptor]

'of' @ [15:89] ==> public open fun of(p0: (LocalDateTime..LocalDateTime?), p1: (ZoneOffset..ZoneOffset?)): (OffsetDateTime..OffsetDateTime?) defined in java.time.OffsetDateTime[JavaMethodDescriptor]

'proxy' @ [15:92] ==> value-parameter proxy: OffsetDateTimeSerializer.OffsetDateTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'dateTime' @ [15:98] ==> public final val dateTime: LocalDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.OffsetDateTimeProxy[PropertyDescriptorImpl]

'proxy' @ [15:108] ==> value-parameter proxy: OffsetDateTimeSerializer.OffsetDateTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'offset' @ [15:114] ==> public final val offset: ZoneOffset defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetDateTimeSerializer.OffsetDateTimeProxy[PropertyDescriptorImpl]

