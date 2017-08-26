'openFuture' @ [16:22] ==> public fun <V> openFuture(): OpenFuture<Int> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'openFuture' @ [17:22] ==> public fun <V> openFuture(): OpenFuture<Double> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Double

'mock' @ [19:23] ==> public inline fun <reified T : Any> mock(): Logger defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Logger

'Test' @ [20:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'firstOf' @ [23:17] ==> internal fun <V, W> firstOf(futures: Array<out CordaFuture<out {Number & Comparable<{Double & Int}>}>>, log: Logger, handler: (CordaFuture<out {Number & Comparable<{Double & Int}>}>) -> {Any & Number & Comparable<{Double & Int}>}): CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Number & Comparable<{Double & Int}>}
    <W> -> {Any & Number & Comparable<{Double & Int}>}

'arrayOf' @ [23:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: OpenFuture<out {Number & Comparable<{Double & Int}>}>): Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> OpenFuture<out {Number & Comparable<{Double & Int}>}>

'f2' @ [23:33] ==> private final val f2: OpenFuture<Double> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'f1' @ [23:37] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'log' @ [23:42] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'++' @ [24:13] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invocations' @ [24:15] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'it' @ [25:13] ==> value-parameter it: CordaFuture<out {Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf short circuit`.<anonymous>[ValueParameterDescriptorImpl]

'getOrThrow' @ [25:16] ==> public fun <V> Future<out {Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'f1' @ [27:9] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'set' @ [27:12] ==> public abstract fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [28:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: {Any & Number & Comparable<{Double & Int}>}, actual: {Any & Number & Comparable<{Double & Int}>}, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> {Any & Number & Comparable<{Double & Int}>}

'g' @ [28:27] ==> val g: CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf short circuit`[LocalVariableDescriptor]

'getOrThrow' @ [28:29] ==> public fun <V> Future<{Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'assertEquals' @ [29:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'invocations' @ [29:25] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'verifyNoMoreInteractions' @ [30:9] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: Logger): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [30:34] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'EOFException' @ [31:25] ==> public constructor EOFException(p0: (String..String?)) defined in java.io.EOFException[JavaClassConstructorDescriptor]

'f2' @ [32:9] ==> private final val f2: OpenFuture<Double> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'setException' @ [32:12] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'throwable' @ [32:25] ==> val throwable: EOFException defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf short circuit`[LocalVariableDescriptor]

'assertEquals' @ [33:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'invocations' @ [33:25] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'verify' @ [34:9] ==> public fun <T> verify(mock: Logger): Logger defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [34:16] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'error' @ [34:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'eq' @ [34:27] ==> public fun <T> eq(value: String): String defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'shortCircuitedTaskFailedMessage' @ [34:30] ==> internal val shortCircuitedTaskFailedMessage: String defined in net.corda.core.concurrent[DeserializedPropertyDescriptor]

'same' @ [34:64] ==> public fun <T> same(value: EOFException): EOFException? defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EOFException

'throwable' @ [34:69] ==> val throwable: EOFException defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf short circuit`[LocalVariableDescriptor]

'verifyNoMoreInteractions' @ [35:9] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: Logger): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [35:34] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'Test' @ [38:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayOf' @ [40:23] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: OpenFuture<out {Number & Comparable<{Double & Int}>}>): Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> OpenFuture<out {Number & Comparable<{Double & Int}>}>

'f1' @ [40:31] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'f2' @ [40:35] ==> private final val f2: OpenFuture<Double> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'firstOf' @ [41:17] ==> internal fun <V, W> firstOf(futures: Array<out CordaFuture<out {Any & Number & Comparable<{Double & Int}>}>>, log: Logger, handler: (CordaFuture<out {Any & Number & Comparable<{Double & Int}>}>) -> {Any & Number & Comparable<{Double & Int}>}): CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}
    <W> -> {Any & Number & Comparable<{Double & Int}>}

'futures' @ [41:25] ==> val futures: Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt due to cancel`[LocalVariableDescriptor]

'log' @ [41:34] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'++' @ [42:13] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invocations' @ [42:15] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'futures' @ [43:13] ==> val futures: Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt due to cancel`[LocalVariableDescriptor]

'forEach' @ [43:21] ==> public inline fun <T> Array<out OpenFuture<out {Number & Comparable<{Double & Int}>}>>.forEach(action: (OpenFuture<out {Number & Comparable<{Double & Int}>}>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpenFuture<out {Number & Comparable<{Double & Int}>}>

'it' @ [43:31] ==> value-parameter it: OpenFuture<out {Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt due to cancel`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'cancel' @ [43:34] ==> public abstract fun cancel(p0: Boolean): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[JavaMethodDescriptor]

'it' @ [44:13] ==> value-parameter it: CordaFuture<out {Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt due to cancel`.<anonymous>[ValueParameterDescriptorImpl]

'getOrThrow' @ [44:16] ==> public fun <V> Future<out {Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'f1' @ [46:9] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'set' @ [46:12] ==> public abstract fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [47:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: {Any & Number & Comparable<{Double & Int}>}, actual: {Any & Number & Comparable<{Double & Int}>}, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> {Any & Number & Comparable<{Double & Int}>}

'g' @ [47:27] ==> val g: CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt due to cancel`[LocalVariableDescriptor]

'getOrThrow' @ [47:29] ==> public fun <V> Future<{Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'assertEquals' @ [48:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'invocations' @ [48:25] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'verifyNoMoreInteractions' @ [49:9] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: Logger): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [49:34] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'assertTrue' @ [50:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'f2' @ [50:20] ==> private final val f2: OpenFuture<Double> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'isCancelled' @ [50:23] ==> public final val <V> OpenFuture<Double>.isCancelled: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> Double

'Test' @ [56:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'arrayOf' @ [58:23] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: OpenFuture<out {Number & Comparable<{Double & Int}>}>): Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> OpenFuture<out {Number & Comparable<{Double & Int}>}>

'f1' @ [58:31] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'f2' @ [58:35] ==> private final val f2: OpenFuture<Double> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'IllegalStateException' @ [59:25] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'firstOf' @ [60:17] ==> internal fun <V, W> firstOf(futures: Array<out CordaFuture<out {Any & Number & Comparable<{Double & Int}>}>>, log: Logger, handler: (CordaFuture<out {Any & Number & Comparable<{Double & Int}>}>) -> {Any & Number & Comparable<{Double & Int}>}): CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}
    <W> -> {Any & Number & Comparable<{Double & Int}>}

'futures' @ [60:25] ==> val futures: Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`[LocalVariableDescriptor]

'log' @ [60:34] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'++' @ [61:13] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invocations' @ [61:15] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'futures' @ [62:13] ==> val futures: Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`[LocalVariableDescriptor]

'forEach' @ [62:21] ==> public inline fun <T> Array<out OpenFuture<out {Number & Comparable<{Double & Int}>}>>.forEach(action: (OpenFuture<out {Number & Comparable<{Double & Int}>}>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpenFuture<out {Number & Comparable<{Double & Int}>}>

'it' @ [62:31] ==> value-parameter it: OpenFuture<out {Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'setException' @ [62:34] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'nonCancel' @ [62:47] ==> val nonCancel: IllegalStateException /* = IllegalStateException */ defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`[LocalVariableDescriptor]

'it' @ [63:13] ==> value-parameter it: CordaFuture<out {Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`.<anonymous>[ValueParameterDescriptorImpl]

'getOrThrow' @ [63:16] ==> public fun <V> Future<out {Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'f1' @ [65:9] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'set' @ [65:12] ==> public abstract fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [66:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: {Any & Number & Comparable<{Double & Int}>}, actual: {Any & Number & Comparable<{Double & Int}>}, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> {Any & Number & Comparable<{Double & Int}>}

'g' @ [66:27] ==> val g: CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`[LocalVariableDescriptor]

'getOrThrow' @ [66:29] ==> public fun <V> Future<{Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'assertEquals' @ [67:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'invocations' @ [67:25] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'verify' @ [68:9] ==> public fun <T> verify(mock: Logger): Logger defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [68:16] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'error' @ [68:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'eq' @ [68:27] ==> public fun <T> eq(value: String): String defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'shortCircuitedTaskFailedMessage' @ [68:30] ==> internal val shortCircuitedTaskFailedMessage: String defined in net.corda.core.concurrent[DeserializedPropertyDescriptor]

'same' @ [68:64] ==> public fun <T> same(value: IllegalStateException /* = IllegalStateException */): IllegalStateException? /* = IllegalStateException? */ defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IllegalStateException

'nonCancel' @ [68:69] ==> val nonCancel: IllegalStateException /* = IllegalStateException */ defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`[LocalVariableDescriptor]

'verifyNoMoreInteractions' @ [69:9] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: Logger): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [69:34] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'assertThatThrownBy' @ [70:9] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'f2' @ [70:30] ==> private final val f2: OpenFuture<Double> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'getOrThrow' @ [70:33] ==> public fun <V> Future<Double>.getOrThrow(timeout: Duration? = ...): Double defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Double

'isSameAs' @ [70:48] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'nonCancel' @ [70:57] ==> val nonCancel: IllegalStateException /* = IllegalStateException */ defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf re-entrant handler attempt not due to cancel`[LocalVariableDescriptor]

'Test' @ [73:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'firstOf' @ [75:17] ==> internal fun <V, W> firstOf(futures: Array<out CordaFuture<out {Number & Comparable<{Double & Int}>}>>, log: Logger, handler: (CordaFuture<out {Number & Comparable<{Double & Int}>}>) -> {Any & Number & Comparable<{Double & Int}>}): CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Number & Comparable<{Double & Int}>}
    <W> -> {Any & Number & Comparable<{Double & Int}>}

'arrayOf' @ [75:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: OpenFuture<out {Number & Comparable<{Double & Int}>}>): Array<OpenFuture<out {Number & Comparable<{Double & Int}>}>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> OpenFuture<out {Number & Comparable<{Double & Int}>}>

'f2' @ [75:33] ==> private final val f2: OpenFuture<Double> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'f1' @ [75:37] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'log' @ [75:42] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'++' @ [76:13] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invocations' @ [76:15] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'it' @ [77:13] ==> value-parameter it: CordaFuture<out {Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf cancel is not special`.<anonymous>[ValueParameterDescriptorImpl]

'getOrThrow' @ [77:16] ==> public fun <V> Future<out {Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'f1' @ [79:9] ==> private final val f1: OpenFuture<Int> defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'cancel' @ [79:12] ==> public abstract fun cancel(p0: Boolean): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[JavaMethodDescriptor]

'assertThatThrownBy' @ [80:9] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'g' @ [80:30] ==> val g: CordaFuture<{Any & Number & Comparable<{Double & Int}>}> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`firstOf cancel is not special`[LocalVariableDescriptor]

'getOrThrow' @ [80:32] ==> public fun <V> Future<{Any & Number & Comparable<{Double & Int}>}>.getOrThrow(timeout: Duration? = ...): {Any & Number & Comparable<{Double & Int}>} defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> {Any & Number & Comparable<{Double & Int}>}

'isInstanceOf' @ [80:47] ==> public open fun isInstanceOf(p0: (Class<*>..Class<*>?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'CancellationException' @ [80:60] ==> public constructor CancellationException() defined in java.util.concurrent.CancellationException[JavaClassConstructorDescriptor]

'java' @ [80:89] ==> public val <T> KClass<CancellationException>.java: Class<CancellationException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CancellationException

'assertEquals' @ [81:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'invocations' @ [81:25] ==> private final var invocations: Int defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'verifyNoMoreInteractions' @ [82:9] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: Logger): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [82:34] ==> private final val log: Logger defined in net.corda.core.concurrent.ConcurrencyUtilsTest[PropertyDescriptorImpl]

'Test' @ [85:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'completedFuture' @ [87:35] ==> public open fun <U : (Any..Any?)> completedFuture(p0: (Int..Int?)): (CompletableFuture<(Int..Int?)>..CompletableFuture<(Int..Int?)>?) defined in java.util.concurrent.CompletableFuture[JavaMethodDescriptor]
Inferred types:
    <U : (Any..Any?)> -> Int

'mutableListOf' @ [88:25] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'mutableListOf' @ [89:24] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'Throwable' @ [90:17] ==> public constructor Throwable() defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'assertThatThrownBy' @ [91:9] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'f' @ [92:13] ==> val f: (CompletableFuture<(Int..Int?)>..CompletableFuture<(Int..Int?)>?) defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`[LocalVariableDescriptor]

'match' @ [92:15] ==> public fun <V, W> Future<(Int..Int?)>.match(success: ((Int..Int?)) -> Boolean, failure: (Throwable) -> Boolean): Boolean defined in net.corda.core.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.Int..kotlin.Int?)
    <W> -> Boolean

'successes' @ [93:17] ==> val successes: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`[LocalVariableDescriptor]

'add' @ [93:27] ==> public abstract fun add(element: Any?): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [93:31] ==> value-parameter it: (Int..Int?) defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [94:23] ==> val x: Throwable defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`[LocalVariableDescriptor]

'failures' @ [95:16] ==> val failures: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`[LocalVariableDescriptor]

'isSameAs' @ [96:11] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [96:20] ==> val x: Throwable defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`[LocalVariableDescriptor]

'assertEquals' @ [97:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any?>, actual: List<Any?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any?>

'listOf' @ [97:22] ==> public fun <T> listOf(element: Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'successes' @ [97:41] ==> val successes: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`[LocalVariableDescriptor]

'assertEquals' @ [98:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any?>, actual: List<Any?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any?>

'emptyList' @ [98:22] ==> public fun <T> emptyList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'failures' @ [98:41] ==> val failures: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass failure of success block into the failure block`[LocalVariableDescriptor]

'Test' @ [101:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Throwable' @ [103:17] ==> public constructor Throwable() defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'CompletableFuture' @ [104:17] ==> public constructor CompletableFuture<T : (Any..Any?)>() defined in java.util.concurrent.CompletableFuture[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Void

'apply' @ [104:43] ==> @InlineOnly public inline fun <T> CompletableFuture<Void>.apply(block: CompletableFuture<Void>.() -> Unit): CompletableFuture<Void> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompletableFuture<Void>

'completeExceptionally' @ [104:51] ==> public open fun completeExceptionally(p0: (Throwable..Throwable?)): Boolean defined in java.util.concurrent.CompletableFuture[JavaMethodDescriptor]

'e' @ [104:73] ==> val e: Throwable defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'mutableListOf' @ [105:25] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'mutableListOf' @ [106:24] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'Throwable' @ [107:17] ==> public constructor Throwable() defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'assertThatThrownBy' @ [108:9] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'f' @ [109:13] ==> val f: CompletableFuture<Void> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'match' @ [109:15] ==> public fun <V, W> Future<(Void..Void?)>.match(success: ((Void..Void?)) -> Boolean, failure: (Throwable) -> Boolean): Boolean defined in net.corda.core.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (java.lang.Void..java.lang.Void?)
    <W> -> Boolean

'successes' @ [109:21] ==> val successes: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'failures' @ [110:17] ==> val failures: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'add' @ [110:26] ==> public abstract fun add(element: Any?): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'it' @ [110:30] ==> value-parameter it: Throwable defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [111:23] ==> val x: Throwable defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'isSameAs' @ [113:11] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [113:20] ==> val x: Throwable defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'assertEquals' @ [114:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any?>, actual: List<Any?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any?>

'emptyList' @ [114:22] ==> public fun <T> emptyList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'successes' @ [114:41] ==> val successes: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'assertEquals' @ [115:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any?>, actual: List<Any?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any?>

'listOf' @ [115:22] ==> public fun <T> listOf(element: Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'e' @ [115:35] ==> val e: Throwable defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

'failures' @ [115:39] ==> val failures: MutableList<Any?> defined in net.corda.core.concurrent.ConcurrencyUtilsTest.`match does not pass ExecutionException to failure block`[LocalVariableDescriptor]

