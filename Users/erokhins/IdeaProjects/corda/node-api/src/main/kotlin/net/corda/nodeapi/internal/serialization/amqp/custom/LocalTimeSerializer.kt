'CustomSerializer.Proxy<LocalTime, LocalTimeSerializer.LocalTimeProxy>' @ [10:57] ==> public constructor Proxy<T, P>(clazz: Class<LocalTime>, proxyClass: Class<LocalTimeSerializer.LocalTimeProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> LocalTime
    <P> -> LocalTimeProxy

'LocalTime' @ [10:127] ==> private constructor LocalTime(p0: Int, p1: Int, p2: Int, p3: Int) defined in java.time.LocalTime[JavaClassConstructorDescriptor]

'java' @ [10:144] ==> public val <T> KClass<LocalTime>.java: Class<LocalTime> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LocalTime

'LocalTimeProxy' @ [10:150] ==> public constructor LocalTimeProxy(hour: Byte, minute: Byte, second: Byte, nano: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.LocalTimeProxy[ClassConstructorDescriptorImpl]

'java' @ [10:172] ==> public val <T> KClass<LocalTimeSerializer.LocalTimeProxy>.java: Class<LocalTimeSerializer.LocalTimeProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LocalTimeProxy

'factory' @ [10:178] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.<init>[ValueParameterDescriptorImpl]

'LocalTimeProxy' @ [11:60] ==> public constructor LocalTimeProxy(hour: Byte, minute: Byte, second: Byte, nano: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.LocalTimeProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:75] ==> value-parameter obj: LocalTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'hour' @ [11:79] ==> public final val LocalTime.hour: Int[MyPropertyDescriptor]

'toByte' @ [11:84] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'obj' @ [11:94] ==> value-parameter obj: LocalTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'minute' @ [11:98] ==> public final val LocalTime.minute: Int[MyPropertyDescriptor]

'toByte' @ [11:105] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'obj' @ [11:115] ==> value-parameter obj: LocalTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'second' @ [11:119] ==> public final val LocalTime.second: Int[MyPropertyDescriptor]

'toByte' @ [11:126] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'obj' @ [11:136] ==> value-parameter obj: LocalTime defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.toProxy[ValueParameterDescriptorImpl]

'nano' @ [11:140] ==> public final val LocalTime.nano: Int[MyPropertyDescriptor]

'of' @ [13:74] ==> public open fun of(p0: Int, p1: Int, p2: Int, p3: Int): (LocalTime..LocalTime?) defined in java.time.LocalTime[JavaMethodDescriptor]

'proxy' @ [13:77] ==> value-parameter proxy: LocalTimeSerializer.LocalTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'hour' @ [13:83] ==> public final val hour: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.LocalTimeProxy[PropertyDescriptorImpl]

'toInt' @ [13:88] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'proxy' @ [13:97] ==> value-parameter proxy: LocalTimeSerializer.LocalTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'minute' @ [13:103] ==> public final val minute: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.LocalTimeProxy[PropertyDescriptorImpl]

'toInt' @ [13:110] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'proxy' @ [13:119] ==> value-parameter proxy: LocalTimeSerializer.LocalTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'second' @ [13:125] ==> public final val second: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.LocalTimeProxy[PropertyDescriptorImpl]

'toInt' @ [13:132] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'proxy' @ [13:141] ==> value-parameter proxy: LocalTimeSerializer.LocalTimeProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.fromProxy[ValueParameterDescriptorImpl]

'nano' @ [13:147] ==> public final val nano: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalTimeSerializer.LocalTimeProxy[PropertyDescriptorImpl]

