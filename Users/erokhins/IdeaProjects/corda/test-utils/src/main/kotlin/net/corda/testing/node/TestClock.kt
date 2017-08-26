'ThreadSafe' @ [19:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'systemUTC' @ [20:58] ==> public open fun systemUTC(): (Clock..Clock?) defined in java.time.Clock[JavaMethodDescriptor]

'MutableClock' @ [20:73] ==> public constructor MutableClock() defined in net.corda.node.utilities.MutableClock[DeserializedClassConstructorDescriptor]

'singletonSerializationToken' @ [22:25] ==> public final fun <T : SerializeAsToken> singletonSerializationToken(toBeTokenized: Class<TestClock>): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken.Companion[FunctionImportedFromObject]
Inferred types:
    <T : SerializeAsToken> -> TestClock

'javaClass' @ [22:53] ==> public val <T : Any> TestClock.javaClass: Class<TestClock> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> TestClock

'token' @ [24:62] ==> private final val token: SingletonSerializationToken defined in net.corda.testing.node.TestClock[PropertyDescriptorImpl]

'registerWithContext' @ [24:68] ==> public final fun registerWithContext(context: SerializeAsTokenContext, toBeTokenized: SerializeAsToken): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken[DeserializedSimpleFunctionDescriptor]

'context' @ [24:88] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.testing.node.TestClock.toToken[ValueParameterDescriptorImpl]

'this' @ [24:97] ==> <this> defined in net.corda.testing.node.TestClock[LazyClassReceiverParameterDescriptor]

'Synchronized' @ [29:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'delegateClock' @ [30:9] ==> private final var delegateClock: Clock defined in net.corda.testing.node.TestClock[PropertyDescriptorImpl]

'offset' @ [30:25] ==> public open fun offset(p0: (Clock..Clock?), p1: (Duration..Duration?)): (Clock..Clock?) defined in java.time.Clock[JavaMethodDescriptor]

'delegateClock' @ [30:32] ==> private final var delegateClock: Clock defined in net.corda.testing.node.TestClock[PropertyDescriptorImpl]

'duration' @ [30:47] ==> value-parameter duration: Duration defined in net.corda.testing.node.TestClock.advanceBy[ValueParameterDescriptorImpl]

'notifyMutationObservers' @ [31:9] ==> protected final fun notifyMutationObservers(): Unit defined in net.corda.testing.node.TestClock[DeserializedSimpleFunctionDescriptor]

'Synchronized' @ [39:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'advanceBy' @ [39:52] ==> @Synchronized public final fun advanceBy(duration: Duration): Unit defined in net.corda.testing.node.TestClock[SimpleFunctionDescriptorImpl]

'instant' @ [39:62] ==> @Synchronized public open fun instant(): Instant defined in net.corda.testing.node.TestClock[SimpleFunctionDescriptorImpl]

'newInstant' @ [39:78] ==> value-parameter newInstant: Instant defined in net.corda.testing.node.TestClock.setTo[ValueParameterDescriptorImpl]

'Synchronized' @ [41:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'delegateClock' @ [42:16] ==> private final var delegateClock: Clock defined in net.corda.testing.node.TestClock[PropertyDescriptorImpl]

'instant' @ [42:30] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'Deprecated' @ [45:5] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ERROR' @ [45:105] ==> enum entry ERROR defined in kotlin.DeprecationLevel[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [47:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'Synchronized' @ [50:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'delegateClock' @ [51:16] ==> private final var delegateClock: Clock defined in net.corda.testing.node.TestClock[PropertyDescriptorImpl]

'zone' @ [51:30] ==> public final val Clock.zone: (ZoneId..ZoneId?)[MyPropertyDescriptor]

'this' @ [59:51] ==> <this> defined in net.corda.testing.node.setTo[ReceiverParameterDescriptorImpl]

'forEach' @ [59:56] ==> @HidesMembers public inline fun <T> Iterable<TestClock>.forEach(action: (TestClock) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TestClock

'it' @ [59:66] ==> value-parameter it: TestClock defined in net.corda.testing.node.setTo.<anonymous>[ValueParameterDescriptorImpl]

'setTo' @ [59:69] ==> @Synchronized public final fun setTo(newInstant: Instant): Unit defined in net.corda.testing.node.TestClock[SimpleFunctionDescriptorImpl]

'instant' @ [59:75] ==> value-parameter instant: Instant defined in net.corda.testing.node.setTo[ValueParameterDescriptorImpl]

