'addExact' @ [20:44] ==> public open fun addExact(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'this' @ [20:53] ==> <this> defined in net.corda.core.utilities.exactAdd[ReceiverParameterDescriptorImpl]

'b' @ [20:59] ==> value-parameter b: Int defined in net.corda.core.utilities.exactAdd[ValueParameterDescriptorImpl]

'addExact' @ [23:47] ==> public open fun addExact(p0: Long, p1: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'this' @ [23:56] ==> <this> defined in net.corda.core.utilities.exactAdd[ReceiverParameterDescriptorImpl]

'b' @ [23:62] ==> value-parameter b: Long defined in net.corda.core.utilities.exactAdd[ValueParameterDescriptorImpl]

'getLogger' @ [30:66] ==> public open fun getLogger(p0: (Class<*>..Class<*>?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'java' @ [30:85] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'isTraceEnabled' @ [34:9] ==> public final val Logger.isTraceEnabled: Boolean[MyPropertyDescriptor]

'trace' @ [34:25] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'invoke' @ [34:31] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'isDebugEnabled' @ [39:9] ==> public final val Logger.isDebugEnabled: Boolean[MyPropertyDescriptor]

'debug' @ [39:25] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'invoke' @ [39:31] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'ofDays' @ [46:41] ==> public open fun ofDays(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'toLong' @ [46:48] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ofHours' @ [52:42] ==> public open fun ofHours(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'toLong' @ [52:50] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ofMinutes' @ [58:44] ==> public open fun ofMinutes(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'toLong' @ [58:54] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ofSeconds' @ [64:44] ==> public open fun ofSeconds(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'toLong' @ [64:54] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ofMillis' @ [70:43] ==> public open fun ofMillis(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'toLong' @ [70:52] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [77:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'TransientProperty' @ [78:43] ==> public constructor TransientProperty<out T>(initialiser: () -> T) defined in net.corda.core.utilities.TransientProperty[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'initializer' @ [78:61] ==> value-parameter initializer: () -> T defined in net.corda.core.utilities.transient[ValueParameterDescriptorImpl]

'Deprecated' @ [80:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [81:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Transient' @ [83:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Transient' @ [84:5] ==> public constructor Transient() defined in kotlin.jvm.Transient[DeserializedClassConstructorDescriptor]

'Suppress' @ [86:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Synchronized' @ [87:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'!' @ [89:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initialised' @ [89:14] ==> @Transient private final var initialised: Boolean defined in net.corda.core.utilities.TransientProperty[PropertyDescriptorImpl]

'value' @ [90:13] ==> @Transient private/*private to this*/ final var value: T? defined in net.corda.core.utilities.TransientProperty[PropertyDescriptorImpl]

'invoke' @ [90:21] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'initialised' @ [91:13] ==> @Transient private final var initialised: Boolean defined in net.corda.core.utilities.TransientProperty[PropertyDescriptorImpl]

'value' @ [93:16] ==> @Transient private/*private to this*/ final var value: T? defined in net.corda.core.utilities.TransientProperty[PropertyDescriptorImpl]

'NonEmptySet' @ [98:57] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'copyOf' @ [98:69] ==> @JvmStatic public final fun <T> copyOf(elements: Collection<T>): NonEmptySet<T> defined in net.corda.core.utilities.NonEmptySet.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [98:76] ==> <this> defined in net.corda.core.utilities.toNonEmptySet[ReceiverParameterDescriptorImpl]

'get' @ [102:5] ==> internal fun <V> Future<V>.get(timeout: Duration? = ...): V defined in net.corda.core.internal.concurrent[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> V

'timeout' @ [102:9] ==> value-parameter timeout: Duration? = ... defined in net.corda.core.utilities.getOrThrow[ValueParameterDescriptorImpl]

'e' @ [104:11] ==> val e: ExecutionException defined in net.corda.core.utilities.getOrThrow[LocalVariableDescriptor]

'cause' @ [104:13] ==> public open val cause: Throwable? defined in java.util.concurrent.ExecutionException[DeserializedPropertyDescriptor]

