'ThreadSafe' @ [16:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'systemUTC' @ [17:58] ==> public open fun systemUTC(): (Clock..Clock?) defined in java.time.Clock[JavaMethodDescriptor]

'MutableClock' @ [17:73] ==> public constructor MutableClock() defined in net.corda.node.utilities.MutableClock[ClassConstructorDescriptorImpl]

'singletonSerializationToken' @ [19:25] ==> public final fun <T : SerializeAsToken> singletonSerializationToken(toBeTokenized: Class<TestClock>): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken.Companion[FunctionImportedFromObject]
Inferred types:
    <T : SerializeAsToken> -> TestClock

'javaClass' @ [19:53] ==> public val <T : Any> TestClock.javaClass: Class<TestClock> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> TestClock

'token' @ [21:62] ==> private final val token: SingletonSerializationToken defined in net.corda.node.utilities.TestClock[PropertyDescriptorImpl]

'registerWithContext' @ [21:68] ==> public final fun registerWithContext(context: SerializeAsTokenContext, toBeTokenized: SerializeAsToken): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken[DeserializedSimpleFunctionDescriptor]

'context' @ [21:88] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.node.utilities.TestClock.toToken[ValueParameterDescriptorImpl]

'this' @ [21:97] ==> <this> defined in net.corda.node.utilities.TestClock[LazyClassReceiverParameterDescriptor]

'Synchronized' @ [23:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'now' @ [24:37] ==> public open fun now(p0: (Clock..Clock?)): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'this' @ [24:41] ==> <this> defined in net.corda.node.utilities.TestClock[LazyClassReceiverParameterDescriptor]

'currentDate' @ [25:13] ==> val currentDate: (LocalDate..LocalDate?) defined in net.corda.node.utilities.TestClock.updateDate[LocalVariableDescriptor]

'isBefore' @ [25:25] ==> public open fun isBefore(p0: (ChronoLocalDate..ChronoLocalDate?)): Boolean defined in java.time.LocalDate[JavaMethodDescriptor]

'date' @ [25:34] ==> value-parameter date: LocalDate defined in net.corda.node.utilities.TestClock.updateDate[ValueParameterDescriptorImpl]

'delegateClock' @ [27:13] ==> private final var delegateClock: Clock defined in net.corda.node.utilities.TestClock[PropertyDescriptorImpl]

'offset' @ [27:35] ==> public open fun offset(p0: (Clock..Clock?), p1: (Duration..Duration?)): (Clock..Clock?) defined in java.time.Clock[JavaMethodDescriptor]

'delegateClock' @ [27:42] ==> private final var delegateClock: Clock defined in net.corda.node.utilities.TestClock[PropertyDescriptorImpl]

'currentDate' @ [27:57] ==> val currentDate: (LocalDate..LocalDate?) defined in net.corda.node.utilities.TestClock.updateDate[LocalVariableDescriptor]

'atStartOfDay' @ [27:69] ==> public open fun atStartOfDay(): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDate[JavaMethodDescriptor]

'date' @ [27:90] ==> value-parameter date: LocalDate defined in net.corda.node.utilities.TestClock.updateDate[ValueParameterDescriptorImpl]

'atStartOfDay' @ [27:95] ==> public open fun atStartOfDay(): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDate[JavaMethodDescriptor]

'notifyMutationObservers' @ [28:13] ==> protected final fun notifyMutationObservers(): Unit defined in net.corda.node.utilities.TestClock[SimpleFunctionDescriptorImpl]

'Synchronized' @ [34:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'delegateClock' @ [35:16] ==> private final var delegateClock: Clock defined in net.corda.node.utilities.TestClock[PropertyDescriptorImpl]

'instant' @ [35:30] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'UnsupportedOperationException' @ [40:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'Synchronized' @ [43:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'delegateClock' @ [44:16] ==> private final var delegateClock: Clock defined in net.corda.node.utilities.TestClock[PropertyDescriptorImpl]

'zone' @ [44:30] ==> public final val Clock.zone: (ZoneId..ZoneId?)[MyPropertyDescriptor]

