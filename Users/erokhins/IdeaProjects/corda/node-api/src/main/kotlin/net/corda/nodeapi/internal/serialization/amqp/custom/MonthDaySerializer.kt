'CustomSerializer.Proxy<MonthDay, MonthDaySerializer.MonthDayProxy>' @ [10:56] ==> public constructor Proxy<T, P>(clazz: Class<MonthDay>, proxyClass: Class<MonthDaySerializer.MonthDayProxy>, factory: SerializerFactory, withInheritance: Boolean = ...) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> MonthDay
    <P> -> MonthDayProxy

'MonthDay' @ [10:123] ==> private constructor MonthDay(p0: Int, p1: Int) defined in java.time.MonthDay[JavaClassConstructorDescriptor]

'java' @ [10:139] ==> public val <T> KClass<MonthDay>.java: Class<MonthDay> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MonthDay

'MonthDayProxy' @ [10:145] ==> public constructor MonthDayProxy(month: Byte, day: Byte) defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.MonthDayProxy[ClassConstructorDescriptorImpl]

'java' @ [10:166] ==> public val <T> KClass<MonthDaySerializer.MonthDayProxy>.java: Class<MonthDaySerializer.MonthDayProxy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MonthDayProxy

'factory' @ [10:172] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.<init>[ValueParameterDescriptorImpl]

'MonthDayProxy' @ [11:58] ==> public constructor MonthDayProxy(month: Byte, day: Byte) defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.MonthDayProxy[ClassConstructorDescriptorImpl]

'obj' @ [11:72] ==> value-parameter obj: MonthDay defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.toProxy[ValueParameterDescriptorImpl]

'monthValue' @ [11:76] ==> public final val MonthDay.monthValue: Int[MyPropertyDescriptor]

'toByte' @ [11:87] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'obj' @ [11:97] ==> value-parameter obj: MonthDay defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.toProxy[ValueParameterDescriptorImpl]

'dayOfMonth' @ [11:101] ==> public final val MonthDay.dayOfMonth: Int[MyPropertyDescriptor]

'toByte' @ [11:112] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'of' @ [13:71] ==> public open fun of(p0: Int, p1: Int): (MonthDay..MonthDay?) defined in java.time.MonthDay[JavaMethodDescriptor]

'proxy' @ [13:74] ==> value-parameter proxy: MonthDaySerializer.MonthDayProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.fromProxy[ValueParameterDescriptorImpl]

'month' @ [13:80] ==> public final val month: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.MonthDayProxy[PropertyDescriptorImpl]

'toInt' @ [13:86] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'proxy' @ [13:95] ==> value-parameter proxy: MonthDaySerializer.MonthDayProxy defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.fromProxy[ValueParameterDescriptorImpl]

'day' @ [13:101] ==> public final val day: Byte defined in net.corda.nodeapi.internal.serialization.amqp.custom.MonthDaySerializer.MonthDayProxy[PropertyDescriptorImpl]

'toInt' @ [13:105] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

