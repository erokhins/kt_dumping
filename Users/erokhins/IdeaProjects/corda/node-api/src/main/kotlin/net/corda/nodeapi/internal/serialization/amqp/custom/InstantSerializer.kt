'CustomSerializer.Proxy<Instant, InstantSerializer.InstantProxy>' @ [10:55] ==> public constructor Proxy<T, P>(clazz: Class<Instant>, proxyClass: Class<InstantSerializer.InstantProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Instant
    <P> -> InstantProxy

'Instant' @ [10:119] ==> private constructor Instant(p0: Long, p1: Int) defined in java.time.Instant[JavaClassConstructorDescriptor]

'java' @ [10:134] ==> public val <T> KClass<Instant>.java: Class<Instant> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Instant

'InstantProxy' @ [10:140] ==> public constructor InstantProxy(epochSeconds: Long, nanos: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.InstantProxy[ClassConstructorDescriptorImpl]

'java' @ [10:160] ==> public val <T> KClass<InstantSerializer.InstantProxy>.java: Class<InstantSerializer.InstantProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InstantProxy

'factory' @ [10:166] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.<init>[ValueParameterDescriptorImpl]

'InstantProxy' @ [11:56] ==> public constructor InstantProxy(epochSeconds: Long, nanos: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.InstantProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:69] ==> value-parameter obj: Instant defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.toProxy[ValueParameterDescriptorImpl]

'epochSecond' @ [11:73] ==> public final val Instant.epochSecond: Long[MyPropertyDescriptor]

'obj' @ [11:86] ==> value-parameter obj: Instant defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.toProxy[ValueParameterDescriptorImpl]

'nano' @ [11:90] ==> public final val Instant.nano: Int[MyPropertyDescriptor]

'ofEpochSecond' @ [13:68] ==> public open fun ofEpochSecond(p0: Long, p1: Long): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'proxy' @ [13:82] ==> value-parameter proxy: InstantSerializer.InstantProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.fromProxy[ValueParameterDescriptorImpl]

'epochSeconds' @ [13:88] ==> public final val epochSeconds: Long defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.InstantProxy[PropertyDescriptorImpl]

'proxy' @ [13:102] ==> value-parameter proxy: InstantSerializer.InstantProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.fromProxy[ValueParameterDescriptorImpl]

'nanos' @ [13:108] ==> public final val nanos: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.InstantSerializer.InstantProxy[PropertyDescriptorImpl]

'toLong' @ [13:114] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

