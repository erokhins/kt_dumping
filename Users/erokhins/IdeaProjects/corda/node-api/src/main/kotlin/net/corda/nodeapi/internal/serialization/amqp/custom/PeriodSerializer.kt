'CustomSerializer.Proxy<Period, PeriodSerializer.PeriodProxy>' @ [10:54] ==> public constructor Proxy<T, P>(clazz: Class<Period>, proxyClass: Class<PeriodSerializer.PeriodProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Period
    <P> -> PeriodProxy

'Period' @ [10:115] ==> private constructor Period(p0: Int, p1: Int, p2: Int) defined in java.time.Period[JavaClassConstructorDescriptor]

'java' @ [10:129] ==> public val <T> KClass<Period>.java: Class<Period> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Period

'PeriodProxy' @ [10:135] ==> public constructor PeriodProxy(years: Int, months: Int, days: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.PeriodProxy[ClassConstructorDescriptorImpl]

'java' @ [10:154] ==> public val <T> KClass<PeriodSerializer.PeriodProxy>.java: Class<PeriodSerializer.PeriodProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PeriodProxy

'factory' @ [10:160] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.<init>[ValueParameterDescriptorImpl]

'PeriodProxy' @ [11:54] ==> public constructor PeriodProxy(years: Int, months: Int, days: Int) defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.PeriodProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:66] ==> value-parameter obj: Period defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.toProxy[ValueParameterDescriptorImpl]

'years' @ [11:70] ==> public final val Period.years: Int[MyPropertyDescriptor]

'obj' @ [11:77] ==> value-parameter obj: Period defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.toProxy[ValueParameterDescriptorImpl]

'months' @ [11:81] ==> public final val Period.months: Int[MyPropertyDescriptor]

'obj' @ [11:89] ==> value-parameter obj: Period defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.toProxy[ValueParameterDescriptorImpl]

'days' @ [11:93] ==> public final val Period.days: Int[MyPropertyDescriptor]

'of' @ [13:65] ==> public open fun of(p0: Int, p1: Int, p2: Int): (Period..Period?) defined in java.time.Period[JavaMethodDescriptor]

'proxy' @ [13:68] ==> value-parameter proxy: PeriodSerializer.PeriodProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.fromProxy[ValueParameterDescriptorImpl]

'years' @ [13:74] ==> public final val years: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.PeriodProxy[PropertyDescriptorImpl]

'proxy' @ [13:81] ==> value-parameter proxy: PeriodSerializer.PeriodProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.fromProxy[ValueParameterDescriptorImpl]

'months' @ [13:87] ==> public final val months: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.PeriodProxy[PropertyDescriptorImpl]

'proxy' @ [13:95] ==> value-parameter proxy: PeriodSerializer.PeriodProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.fromProxy[ValueParameterDescriptorImpl]

'days' @ [13:101] ==> public final val days: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.PeriodSerializer.PeriodProxy[PropertyDescriptorImpl]

