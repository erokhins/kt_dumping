'CustomSerializer.Proxy<LocalDateTime, LocalDateTimeSerializer.LocalDateTimeProxy>' @ [12:61] ==> public constructor Proxy<T, P>(clazz: Class<LocalDateTime>, proxyClass: Class<LocalDateTimeSerializer.LocalDateTimeProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> LocalDateTime
    <P> -> LocalDateTimeProxy

'LocalDateTime' @ [12:143] ==> private constructor LocalDateTime(p0: (LocalDate..LocalDate?), p1: (LocalTime..LocalTime?)) defined in java.time.LocalDateTime[JavaClassConstructorDescriptor]

'java' @ [12:164] ==> public val <T> KClass<LocalDateTime>.java: Class<LocalDateTime> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LocalDateTime

'LocalDateTimeProxy' @ [12:170] ==> public constructor LocalDateTimeProxy(date: LocalDate, time: LocalTime) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.LocalDateTimeProxy[ClassConstructorDescriptorImpl]

'java' @ [12:196] ==> public val <T> KClass<LocalDateTimeSerializer.LocalDateTimeProxy>.java: Class<LocalDateTimeSerializer.LocalDateTimeProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LocalDateTimeProxy

'factory' @ [12:202] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'listOf' @ [13:79] ==> public fun <T> listOf(vararg elements: CustomSerializer.Proxy<out Any, out Any>): List<CustomSerializer.Proxy<out Any, out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Proxy<out Any, out Any>

'LocalDateSerializer' @ [13:86] ==> public constructor LocalDateSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer[ClassConstructorDescriptorImpl]

'factory' @ [13:106] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'LocalTimeSerializer' @ [13:116] ==> public constructor LocalTimeSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer[ClassConstructorDescriptorImpl]

'factory' @ [13:136] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'LocalDateTimeProxy' @ [15:68] ==> public constructor LocalDateTimeProxy(date: LocalDate, time: LocalTime) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.LocalDateTimeProxy[ClassConstructorDescriptorImpl]

'obj' @ [15:87] ==> value-parameter obj: LocalDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'toLocalDate' @ [15:91] ==> public open fun toLocalDate(): (LocalDate..LocalDate?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'obj' @ [15:106] ==> value-parameter obj: LocalDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'toLocalTime' @ [15:110] ==> public open fun toLocalTime(): (LocalTime..LocalTime?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'of' @ [17:86] ==> public open fun of(p0: (LocalDate..LocalDate?), p1: (LocalTime..LocalTime?)): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'proxy' @ [17:89] ==> value-parameter proxy: LocalDateTimeSerializer.LocalDateTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'date' @ [17:95] ==> public final val date: LocalDate defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.LocalDateTimeProxy[PropertyDescriptorImpl]

'proxy' @ [17:101] ==> value-parameter proxy: LocalDateTimeSerializer.LocalDateTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'time' @ [17:107] ==> public final val time: LocalTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer.LocalDateTimeProxy[PropertyDescriptorImpl]

