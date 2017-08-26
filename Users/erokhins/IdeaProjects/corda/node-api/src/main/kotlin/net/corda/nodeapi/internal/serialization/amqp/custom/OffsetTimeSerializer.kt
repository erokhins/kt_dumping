'CustomSerializer.Proxy<OffsetTime, OffsetTimeSerializer.OffsetTimeProxy>' @ [10:58] ==> public constructor Proxy<T, P>(clazz: Class<OffsetTime>, proxyClass: Class<OffsetTimeSerializer.OffsetTimeProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> OffsetTime
    <P> -> OffsetTimeProxy

'OffsetTime' @ [10:131] ==> private constructor OffsetTime(p0: (LocalTime..LocalTime?), p1: (ZoneOffset..ZoneOffset?)) defined in java.time.OffsetTime[JavaClassConstructorDescriptor]

'java' @ [10:149] ==> public val <T> KClass<OffsetTime>.java: Class<OffsetTime> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> OffsetTime

'OffsetTimeProxy' @ [10:155] ==> public constructor OffsetTimeProxy(time: LocalTime, offset: ZoneOffset) defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.OffsetTimeProxy[ClassConstructorDescriptorImpl]

'java' @ [10:178] ==> public val <T> KClass<OffsetTimeSerializer.OffsetTimeProxy>.java: Class<OffsetTimeSerializer.OffsetTimeProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> OffsetTimeProxy

'factory' @ [10:184] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.<init>[ValueParameterDescriptorImpl]

'listOf' @ [11:79] ==> public fun <T> listOf(vararg elements: CustomSerializer.Proxy<out Serializable, out Any>): List<CustomSerializer.Proxy<out Serializable, out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Proxy<out Serializable, out Any>

'LocalTimeSerializer' @ [11:86] ==> public constructor LocalTimeSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer[ClassConstructorDescriptorImpl]

'factory' @ [11:106] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.<init>[ValueParameterDescriptorImpl]

'ZoneIdSerializer' @ [11:116] ==> public constructor ZoneIdSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer[ClassConstructorDescriptorImpl]

'factory' @ [11:133] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.<init>[ValueParameterDescriptorImpl]

'OffsetTimeProxy' @ [13:62] ==> public constructor OffsetTimeProxy(time: LocalTime, offset: ZoneOffset) defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.OffsetTimeProxy[ClassConstructorDescriptorImpl]

'obj' @ [13:78] ==> value-parameter obj: OffsetTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'toLocalTime' @ [13:82] ==> public open fun toLocalTime(): (LocalTime..LocalTime?) defined in java.time.OffsetTime[JavaMethodDescriptor]

'obj' @ [13:97] ==> value-parameter obj: OffsetTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'offset' @ [13:101] ==> public final val OffsetTime.offset: (ZoneOffset..ZoneOffset?)[MyPropertyDescriptor]

'of' @ [15:77] ==> public open fun of(p0: (LocalTime..LocalTime?), p1: (ZoneOffset..ZoneOffset?)): (OffsetTime..OffsetTime?) defined in java.time.OffsetTime[JavaMethodDescriptor]

'proxy' @ [15:80] ==> value-parameter proxy: OffsetTimeSerializer.OffsetTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'time' @ [15:86] ==> public final val time: LocalTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.OffsetTimeProxy[PropertyDescriptorImpl]

'proxy' @ [15:92] ==> value-parameter proxy: OffsetTimeSerializer.OffsetTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'offset' @ [15:98] ==> public final val offset: ZoneOffset defined in net.corda.nodeapi.internal.serialization.amqp.custom.OffsetTimeSerializer.OffsetTimeProxy[PropertyDescriptorImpl]

