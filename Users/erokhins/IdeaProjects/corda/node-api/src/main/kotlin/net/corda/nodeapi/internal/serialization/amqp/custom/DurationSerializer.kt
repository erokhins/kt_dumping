'CustomSerializer.Proxy<Duration, DurationSerializer.DurationProxy>' @ [10:56] ==> public constructor Proxy<T, P>(clazz: Class<Duration>, proxyClass: Class<DurationSerializer.DurationProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Duration
    <P> -> DurationProxy

'Duration' @ [10:123] ==> private constructor Duration(p0: Long, p1: Int) defined in java.time.Duration[JavaClassConstructorDescriptor]

'java' @ [10:139] ==> public val <T> KClass<Duration>.java: Class<Duration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Duration

'DurationProxy' @ [10:145] ==> public constructor DurationProxy(seconds: Long, nanos: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.DurationProxy[ClassConstructorDescriptorImpl]

'java' @ [10:166] ==> public val <T> KClass<DurationSerializer.DurationProxy>.java: Class<DurationSerializer.DurationProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DurationProxy

'factory' @ [10:172] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.<init>[ValueParameterDescriptorImpl]

'DurationProxy' @ [11:58] ==> public constructor DurationProxy(seconds: Long, nanos: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.DurationProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:72] ==> value-parameter obj: Duration defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.toProxy[ValueParameterDescriptorImpl]

'seconds' @ [11:76] ==> public final val Duration.seconds: Long[MyPropertyDescriptor]

'obj' @ [11:85] ==> value-parameter obj: Duration defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.toProxy[ValueParameterDescriptorImpl]

'nano' @ [11:89] ==> public final val Duration.nano: Int[MyPropertyDescriptor]

'ofSeconds' @ [13:71] ==> public open fun ofSeconds(p0: Long, p1: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'proxy' @ [13:81] ==> value-parameter proxy: DurationSerializer.DurationProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.fromProxy[ValueParameterDescriptorImpl]

'seconds' @ [13:87] ==> public final val seconds: Long defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.DurationProxy[PropertyDescriptorImpl]

'proxy' @ [13:96] ==> value-parameter proxy: DurationSerializer.DurationProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.fromProxy[ValueParameterDescriptorImpl]

'nanos' @ [13:102] ==> public final val nanos: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.DurationSerializer.DurationProxy[PropertyDescriptorImpl]

'toLong' @ [13:108] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

