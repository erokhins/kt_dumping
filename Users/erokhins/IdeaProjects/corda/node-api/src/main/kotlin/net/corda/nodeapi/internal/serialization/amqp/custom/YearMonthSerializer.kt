'CustomSerializer.Proxy<YearMonth, YearMonthSerializer.YearMonthProxy>' @ [10:57] ==> public constructor Proxy<T, P>(clazz: Class<YearMonth>, proxyClass: Class<YearMonthSerializer.YearMonthProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> YearMonth
    <P> -> YearMonthProxy

'YearMonth' @ [10:127] ==> private constructor YearMonth(p0: Int, p1: Int) defined in java.time.YearMonth[JavaClassConstructorDescriptor]

'java' @ [10:144] ==> public val <T> KClass<YearMonth>.java: Class<YearMonth> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> YearMonth

'YearMonthProxy' @ [10:150] ==> public constructor YearMonthProxy(year: Int, month: Byte) defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.YearMonthProxy[ClassConstructorDescriptorImpl]

'java' @ [10:172] ==> public val <T> KClass<YearMonthSerializer.YearMonthProxy>.java: Class<YearMonthSerializer.YearMonthProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> YearMonthProxy

'factory' @ [10:178] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.<init>[ValueParameterDescriptorImpl]

'YearMonthProxy' @ [11:60] ==> public constructor YearMonthProxy(year: Int, month: Byte) defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.YearMonthProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:75] ==> value-parameter obj: YearMonth defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.toProxy[ValueParameterDescriptorImpl]

'year' @ [11:79] ==> public final val YearMonth.year: Int[MyPropertyDescriptor]

'obj' @ [11:85] ==> value-parameter obj: YearMonth defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.toProxy[ValueParameterDescriptorImpl]

'monthValue' @ [11:89] ==> public final val YearMonth.monthValue: Int[MyPropertyDescriptor]

'toByte' @ [11:100] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'of' @ [13:74] ==> public open fun of(p0: Int, p1: Int): (YearMonth..YearMonth?) defined in java.time.YearMonth[JavaMethodDescriptor]

'proxy' @ [13:77] ==> value-parameter proxy: YearMonthSerializer.YearMonthProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.fromProxy[ValueParameterDescriptorImpl]

'year' @ [13:83] ==> public final val year: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.YearMonthProxy[PropertyDescriptorImpl]

'proxy' @ [13:89] ==> value-parameter proxy: YearMonthSerializer.YearMonthProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.fromProxy[ValueParameterDescriptorImpl]

'month' @ [13:95] ==> public final val month: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.YearMonthSerializer.YearMonthProxy[PropertyDescriptorImpl]

'toInt' @ [13:101] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

