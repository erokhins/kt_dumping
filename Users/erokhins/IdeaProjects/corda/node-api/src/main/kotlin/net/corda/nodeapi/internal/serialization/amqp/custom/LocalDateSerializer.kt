'CustomSerializer.Proxy<LocalDate, LocalDateSerializer.LocalDateProxy>' @ [10:57] ==> public constructor Proxy<T, P>(clazz: Class<LocalDate>, proxyClass: Class<LocalDateSerializer.LocalDateProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> LocalDate
    <P> -> LocalDateProxy

'LocalDate' @ [10:127] ==> private constructor LocalDate(p0: Int, p1: Int, p2: Int) defined in java.time.LocalDate[JavaClassConstructorDescriptor]

'java' @ [10:144] ==> public val <T> KClass<LocalDate>.java: Class<LocalDate> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LocalDate

'LocalDateProxy' @ [10:150] ==> public constructor LocalDateProxy(year: Int, month: Byte, day: Byte) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.LocalDateProxy[ClassConstructorDescriptorImpl]

'java' @ [10:172] ==> public val <T> KClass<LocalDateSerializer.LocalDateProxy>.java: Class<LocalDateSerializer.LocalDateProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LocalDateProxy

'factory' @ [10:178] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.<init>[ValueParameterDescriptorImpl]

'LocalDateProxy' @ [11:60] ==> public constructor LocalDateProxy(year: Int, month: Byte, day: Byte) defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.LocalDateProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:75] ==> value-parameter obj: LocalDate defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.toProxy[ValueParameterDescriptorImpl]

'year' @ [11:79] ==> public final val LocalDate.year: Int[MyPropertyDescriptor]

'obj' @ [11:85] ==> value-parameter obj: LocalDate defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.toProxy[ValueParameterDescriptorImpl]

'monthValue' @ [11:89] ==> public final val LocalDate.monthValue: Int[MyPropertyDescriptor]

'toByte' @ [11:100] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'obj' @ [11:110] ==> value-parameter obj: LocalDate defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.toProxy[ValueParameterDescriptorImpl]

'dayOfMonth' @ [11:114] ==> public final val LocalDate.dayOfMonth: Int[MyPropertyDescriptor]

'toByte' @ [11:125] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'of' @ [13:74] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'proxy' @ [13:77] ==> value-parameter proxy: LocalDateSerializer.LocalDateProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.fromProxy[ValueParameterDescriptorImpl]

'year' @ [13:83] ==> public final val year: Int defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.LocalDateProxy[PropertyDescriptorImpl]

'proxy' @ [13:89] ==> value-parameter proxy: LocalDateSerializer.LocalDateProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.fromProxy[ValueParameterDescriptorImpl]

'month' @ [13:95] ==> public final val month: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.LocalDateProxy[PropertyDescriptorImpl]

'toInt' @ [13:101] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'proxy' @ [13:110] ==> value-parameter proxy: LocalDateSerializer.LocalDateProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.fromProxy[ValueParameterDescriptorImpl]

'day' @ [13:116] ==> public final val day: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.LocalDateSerializer.LocalDateProxy[PropertyDescriptorImpl]

'toInt' @ [13:120] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

