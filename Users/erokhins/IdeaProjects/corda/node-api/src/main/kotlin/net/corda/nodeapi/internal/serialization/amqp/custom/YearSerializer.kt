'CustomSerializer.Proxy<Year, YearSerializer.YearProxy>' @ [10:52] ==> public constructor Proxy<T, P>(clazz: Class<Year>, proxyClass: Class<YearSerializer.YearProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Year
    <P> -> YearProxy

'Year' @ [10:107] ==> private constructor Year(p0: Int) defined in java.time.Year[JavaClassConstructorDescriptor]

'java' @ [10:119] ==> public val <T> KClass<Year>.java: Class<Year> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Year

'YearProxy' @ [10:125] ==> public constructor YearProxy(year: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearSerializer.YearProxy[ClassConstructorDescriptorImpl]

'java' @ [10:142] ==> public val <T> KClass<YearSerializer.YearProxy>.java: Class<YearSerializer.YearProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> YearProxy

'factory' @ [10:148] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearSerializer.<init>[ValueParameterDescriptorImpl]

'YearProxy' @ [11:50] ==> public constructor YearProxy(year: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearSerializer.YearProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:60] ==> value-parameter obj: Year defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearSerializer.toProxy[ValueParameterDescriptorImpl]

'value' @ [11:64] ==> public final val Year.value: Int[MyPropertyDescriptor]

'of' @ [13:59] ==> public open fun of(p0: Int): (Year..Year?) defined in java.time.Year[JavaMethodDescriptor]

'proxy' @ [13:62] ==> value-parameter proxy: YearSerializer.YearProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearSerializer.fromProxy[ValueParameterDescriptorImpl]

'year' @ [13:68] ==> public final val year: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearSerializer.YearProxy[PropertyDescriptorImpl]

