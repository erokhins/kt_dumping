'CustomSerializer.Proxy<ZonedDateTime, ZonedDateTimeSerializer.ZonedDateTimeProxy>' @ [10:61] ==> public constructor Proxy<T, P>(clazz: Class<ZonedDateTime>, proxyClass: Class<ZonedDateTimeSerializer.ZonedDateTimeProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> ZonedDateTime
    <P> -> ZonedDateTimeProxy

'ZonedDateTime' @ [10:143] ==> private constructor ZonedDateTime(p0: (LocalDateTime..LocalDateTime?), p1: (ZoneOffset..ZoneOffset?), p2: (ZoneId..ZoneId?)) defined in java.time.ZonedDateTime[JavaClassConstructorDescriptor]

'java' @ [10:164] ==> public val <T> KClass<ZonedDateTime>.java: Class<ZonedDateTime> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ZonedDateTime

'ZonedDateTimeProxy' @ [10:170] ==> public constructor ZonedDateTimeProxy(dateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.ZonedDateTimeProxy[ClassConstructorDescriptorImpl]

'java' @ [10:196] ==> public val <T> KClass<ZonedDateTimeSerializer.ZonedDateTimeProxy>.java: Class<ZonedDateTimeSerializer.ZonedDateTimeProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ZonedDateTimeProxy

'factory' @ [10:202] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'ZonedDateTime' @ [14:25] ==> private constructor ZonedDateTime(p0: (LocalDateTime..LocalDateTime?), p1: (ZoneOffset..ZoneOffset?), p2: (ZoneId..ZoneId?)) defined in java.time.ZonedDateTime[JavaClassConstructorDescriptor]

'java' @ [14:46] ==> public val <T> KClass<ZonedDateTime>.java: Class<ZonedDateTime> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ZonedDateTime

'getDeclaredMethod' @ [14:51] ==> @CallerSensitive public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'LocalDateTime' @ [14:82] ==> private constructor LocalDateTime(p0: (LocalDate..LocalDate?), p1: (LocalTime..LocalTime?)) defined in java.time.LocalDateTime[JavaClassConstructorDescriptor]

'java' @ [14:103] ==> public val <T> KClass<LocalDateTime>.java: Class<LocalDateTime> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LocalDateTime

'ZoneOffset' @ [14:109] ==> private constructor ZoneOffset(p0: Int) defined in java.time.ZoneOffset[JavaClassConstructorDescriptor]

'java' @ [14:127] ==> public val <T> KClass<ZoneOffset>.java: Class<ZoneOffset> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ZoneOffset

'ZoneId' @ [14:133] ==> public/*package*/ constructor ZoneId() defined in java.time.ZoneId[JavaClassConstructorDescriptor]

'java' @ [14:147] ==> public val <T> KClass<ZoneId>.java: Class<ZoneId> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ZoneId

'ofLenient' @ [16:13] ==> public final val ofLenient: (Method..Method?) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.Companion[PropertyDescriptorImpl]

'isAccessible' @ [16:23] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'listOf' @ [19:79] ==> public fun <T> listOf(vararg elements: CustomSerializer.Proxy<out Serializable, out Any>): List<CustomSerializer.Proxy<out Serializable, out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Proxy<out Serializable, out Any>

'LocalDateTimeSerializer' @ [19:86] ==> public constructor LocalDateTimeSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateTimeSerializer[ClassConstructorDescriptorImpl]

'factory' @ [19:110] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'ZoneIdSerializer' @ [19:120] ==> public constructor ZoneIdSerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZoneIdSerializer[ClassConstructorDescriptorImpl]

'factory' @ [19:137] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.<init>[ValueParameterDescriptorImpl]

'ZonedDateTimeProxy' @ [21:68] ==> public constructor ZonedDateTimeProxy(dateTime: LocalDateTime, offset: ZoneOffset, zone: ZoneId) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.ZonedDateTimeProxy[ClassConstructorDescriptorImpl]

'obj' @ [21:87] ==> value-parameter obj: ZonedDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'toLocalDateTime' @ [21:91] ==> public open fun toLocalDateTime(): (LocalDateTime..LocalDateTime?) defined in java.time.ZonedDateTime[JavaMethodDescriptor]

'obj' @ [21:110] ==> value-parameter obj: ZonedDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'offset' @ [21:114] ==> public final val ZonedDateTime.offset: (ZoneOffset..ZoneOffset?)[MyPropertyDescriptor]

'obj' @ [21:122] ==> value-parameter obj: ZonedDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'zone' @ [21:126] ==> public final val ZonedDateTime.zone: (ZoneId..ZoneId?)[MyPropertyDescriptor]

'ofLenient' @ [23:72] ==> public final val ofLenient: (Method..Method?) defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.Companion[PropertyDescriptorImpl]

'invoke' @ [23:82] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'proxy' @ [23:95] ==> value-parameter proxy: ZonedDateTimeSerializer.ZonedDateTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'dateTime' @ [23:101] ==> public final val dateTime: LocalDateTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.ZonedDateTimeProxy[PropertyDescriptorImpl]

'proxy' @ [23:111] ==> value-parameter proxy: ZonedDateTimeSerializer.ZonedDateTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'offset' @ [23:117] ==> public final val offset: ZoneOffset defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.ZonedDateTimeProxy[PropertyDescriptorImpl]

'proxy' @ [23:125] ==> value-parameter proxy: ZonedDateTimeSerializer.ZonedDateTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'zone' @ [23:131] ==> public final val zone: ZoneId defined in net.corda.nodeapi.internal.serialization.amqp.custom.ZonedDateTimeSerializer.ZonedDateTimeProxy[PropertyDescriptorImpl]

