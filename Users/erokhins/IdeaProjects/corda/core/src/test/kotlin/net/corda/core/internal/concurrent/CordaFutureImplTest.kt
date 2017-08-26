'Test' @ [17:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'newSingleThreadExecutor' @ [19:27] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'assertEquals' @ [21:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'e' @ [21:31] ==> val e: (ExecutorService..ExecutorService?) defined in net.corda.core.internal.concurrent.CordaFutureTest.`fork works`[LocalVariableDescriptor]

'fork' @ [21:33] ==> public fun <V> Executor.fork(block: () -> Int): CordaFuture<Int> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'getOrThrow' @ [21:46] ==> public fun <V> Future<Int>.getOrThrow(timeout: Duration? = ...): Int defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'Exception' @ [22:21] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'e' @ [23:21] ==> val e: (ExecutorService..ExecutorService?) defined in net.corda.core.internal.concurrent.CordaFutureTest.`fork works`[LocalVariableDescriptor]

'fork' @ [23:23] ==> public fun <V> Executor.fork(block: () -> Any?): CordaFuture<Any?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'x' @ [23:36] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`fork works`[LocalVariableDescriptor]

'assertThatThrownBy' @ [24:24] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'f' @ [24:45] ==> val f: CordaFuture<Any?> defined in net.corda.core.internal.concurrent.CordaFutureTest.`fork works`[LocalVariableDescriptor]

'getOrThrow' @ [24:47] ==> public fun <V> Future<Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'isSameAs' @ [24:62] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [24:71] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`fork works`[LocalVariableDescriptor]

'e' @ [26:13] ==> val e: (ExecutorService..ExecutorService?) defined in net.corda.core.internal.concurrent.CordaFutureTest.`fork works`[LocalVariableDescriptor]

'shutdown' @ [26:15] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'Test' @ [30:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'CordaFutureImpl' @ [32:17] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'Exception' @ [33:17] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'mock' @ [34:19] ==> public inline fun <reified T : Any> mock(): Logger defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Logger

'AtomicBoolean' @ [35:20] ==> public constructor AtomicBoolean() defined in java.util.concurrent.atomic.AtomicBoolean[JavaClassConstructorDescriptor]

'f' @ [36:9] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'thenImpl' @ [36:11] ==> internal final fun <W> thenImpl(log: Logger, callback: (CordaFuture<Int>) -> Any?): Unit defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <W> -> Any?

'log' @ [36:20] ==> val log: Logger defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'x' @ [36:33] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'f' @ [37:9] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'thenImpl' @ [37:11] ==> internal final fun <W> thenImpl(log: Logger, callback: (CordaFuture<Int>) -> Unit): Unit defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <W> -> Unit

'log' @ [37:20] ==> val log: Logger defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'flag' @ [37:27] ==> val flag: AtomicBoolean defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'set' @ [37:32] ==> public final fun set(p0: Boolean): Unit defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'f' @ [38:9] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'set' @ [38:11] ==> public open fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'verify' @ [39:9] ==> public fun <T> verify(mock: Logger): Logger defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [39:16] ==> val log: Logger defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'error' @ [39:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'eq' @ [39:27] ==> public fun <T> eq(value: String): String defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'CordaFutureImpl' @ [39:30] ==> public companion object defined in net.corda.core.internal.concurrent.CordaFutureImpl[FakeCallableDescriptorForObject]

'listenerFailedMessage' @ [39:46] ==> internal final val listenerFailedMessage: String defined in net.corda.core.internal.concurrent.CordaFutureImpl.Companion[DeserializedPropertyDescriptor]

'same' @ [39:70] ==> public fun <T> same(value: Exception /* = Exception */): Exception? /* = Exception? */ defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Exception

'x' @ [39:75] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'verifyNoMoreInteractions' @ [40:9] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: Logger): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [40:34] ==> val log: Logger defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'assertTrue' @ [41:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'flag' @ [41:20] ==> val flag: AtomicBoolean defined in net.corda.core.internal.concurrent.CordaFutureTest.`if a listener fails its throwable is logged`[LocalVariableDescriptor]

'get' @ [41:25] ==> public final fun get(): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'run' @ [46:9] ==> @InlineOnly public inline fun <T, R> CordaFutureTest.run(block: CordaFutureTest.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureTest
    <R> -> Unit

'CordaFutureImpl' @ [47:21] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'f' @ [48:21] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'map' @ [48:23] ==> public fun <V, W> CordaFuture<out Int>.map(transform: (Int) -> Int): CordaFuture<Int> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int
    <W> -> Int

'it' @ [48:29] ==> value-parameter it: Int defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'f' @ [49:13] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'set' @ [49:15] ==> public open fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [50:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'g' @ [50:31] ==> val g: CordaFuture<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [50:33] ==> public fun <V> Future<Int>.getOrThrow(timeout: Duration? = ...): Int defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'run' @ [52:9] ==> @InlineOnly public inline fun <T, R> CordaFutureTest.run(block: CordaFutureTest.() -> AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>): AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureTest
    <R> -> AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>

'CordaFutureImpl' @ [53:21] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'Exception' @ [54:21] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'f' @ [55:21] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'map' @ [55:23] ==> public fun <V, W> CordaFuture<out Int>.map(transform: (Int) -> Any?): CordaFuture<Any?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int
    <W> -> Any?

'x' @ [55:35] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'f' @ [56:13] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'set' @ [56:15] ==> public open fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'assertThatThrownBy' @ [57:24] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'g' @ [57:45] ==> val g: CordaFuture<Any?> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [57:47] ==> public fun <V> Future<Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'isSameAs' @ [57:62] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [57:71] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'run' @ [59:9] ==> @InlineOnly public inline fun <T, R> CordaFutureTest.run(block: CordaFutureTest.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureTest
    <R> -> Unit

'mock' @ [60:25] ==> public inline fun <reified T : Any> mock(): (Any?) -> Any? defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Function1<Any?, Any?>

'CordaFutureImpl' @ [61:21] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'f' @ [62:21] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'map' @ [62:23] ==> public fun <V, W> CordaFuture<out Int>.map(transform: (Int) -> Any?): CordaFuture<Any?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int
    <W> -> Any?

'block' @ [62:27] ==> val block: (Any?) -> Any? defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'Exception' @ [63:21] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'f' @ [64:13] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'setException' @ [64:15] ==> public open fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'x' @ [64:28] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'assertThatThrownBy' @ [65:24] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'g' @ [65:45] ==> val g: CordaFuture<Any?> defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [65:47] ==> public fun <V> Future<Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'isSameAs' @ [65:62] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [65:71] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'verifyNoMoreInteractions' @ [66:13] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: (Any?) -> Any?): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<Any?, Any?>

'block' @ [66:38] ==> val block: (Any?) -> Any? defined in net.corda.core.internal.concurrent.CordaFutureTest.`map works`.<anonymous>[LocalVariableDescriptor]

'Test' @ [70:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'run' @ [72:9] ==> @InlineOnly public inline fun <T, R> CordaFutureTest.run(block: CordaFutureTest.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureTest
    <R> -> Unit

'CordaFutureImpl' @ [73:21] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'f' @ [74:21] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [74:23] ==> public fun <V, W> CordaFuture<out Int>.flatMap(transform: (Int) -> CordaFuture<out Int>): CordaFuture<Int> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int
    <W> -> Int

'CordaFutureImpl' @ [74:33] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'apply' @ [74:56] ==> @InlineOnly public inline fun <T> CordaFutureImpl<Int>.apply(block: CordaFutureImpl<Int>.() -> Unit): CordaFutureImpl<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureImpl<Int>

'set' @ [74:64] ==> public open fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'it' @ [74:68] ==> value-parameter it: Int defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'f' @ [75:13] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'set' @ [75:15] ==> public open fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [76:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'g' @ [76:31] ==> val g: CordaFuture<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [76:33] ==> public fun <V> Future<Int>.getOrThrow(timeout: Duration? = ...): Int defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'run' @ [78:9] ==> @InlineOnly public inline fun <T, R> CordaFutureTest.run(block: CordaFutureTest.() -> AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>): AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureTest
    <R> -> AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>

'CordaFutureImpl' @ [79:21] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'Exception' @ [80:21] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'f' @ [81:21] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [81:23] ==> public fun <V, W> CordaFuture<out Int>.flatMap(transform: (Int) -> CordaFuture<out Void>): CordaFuture<Void> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int
    <W> -> Void

'CordaFutureImpl' @ [81:33] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Void> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Void

'apply' @ [81:57] ==> @InlineOnly public inline fun <T> CordaFutureImpl<Void>.apply(block: CordaFutureImpl<Void>.() -> Unit): CordaFutureImpl<Void> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureImpl<Void>

'setException' @ [81:65] ==> public open fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'x' @ [81:78] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'f' @ [82:13] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'set' @ [82:15] ==> public open fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'assertThatThrownBy' @ [83:24] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'g' @ [83:45] ==> val g: CordaFuture<Void> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [83:47] ==> public fun <V> Future<Void>.getOrThrow(timeout: Duration? = ...): Void defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Void

'isSameAs' @ [83:62] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [83:71] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'run' @ [85:9] ==> @InlineOnly public inline fun <T, R> CordaFutureTest.run(block: CordaFutureTest.() -> AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>): AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureTest
    <R> -> AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>..org.assertj.core.api.AbstractThrowableAssert<out (org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>..org.assertj.core.api.AbstractThrowableAssert<out kotlin.Any?, out kotlin.Any?>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>?), out (kotlin.Throwable..kotlin.Throwable?)>

'CordaFutureImpl' @ [86:21] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'Exception' @ [87:21] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'f' @ [88:40] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [88:42] ==> public fun <V, W> CordaFuture<out Int>.flatMap(transform: (Int) -> CordaFuture<out Void>): CordaFuture<Void> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int
    <W> -> Void

'x' @ [88:58] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'f' @ [89:13] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'set' @ [89:15] ==> public open fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'assertThatThrownBy' @ [90:24] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'g' @ [90:45] ==> val g: CordaFuture<Void> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [90:47] ==> public fun <V> Future<Void>.getOrThrow(timeout: Duration? = ...): Void defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Void

'isSameAs' @ [90:62] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [90:71] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'run' @ [92:9] ==> @InlineOnly public inline fun <T, R> CordaFutureTest.run(block: CordaFutureTest.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFutureTest
    <R> -> Unit

'mock' @ [93:25] ==> public inline fun <reified T : Any> mock(): (Any?) -> CordaFuture<*> defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Function1<Any?, CordaFuture<*>>

'CordaFutureImpl' @ [94:21] ==> public constructor CordaFutureImpl<V>(impl: CompletableFuture<Int> = ...) defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <V> -> Int

'f' @ [95:21] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'flatMap' @ [95:23] ==> public fun <V, W> CordaFuture<out Int>.flatMap(transform: (Int) -> CordaFuture<out Any?>): CordaFuture<Any?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int
    <W> -> Any?

'block' @ [95:31] ==> val block: (Any?) -> CordaFuture<*> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'Exception' @ [96:21] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'f' @ [97:13] ==> val f: CordaFutureImpl<Int> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'setException' @ [97:15] ==> public open fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.CordaFutureImpl[DeserializedSimpleFunctionDescriptor]

'x' @ [97:28] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'assertThatThrownBy' @ [98:24] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'g' @ [98:45] ==> val g: CordaFuture<Any?> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'getOrThrow' @ [98:47] ==> public fun <V> Future<Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'isSameAs' @ [98:62] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'x' @ [98:71] ==> val x: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'verifyNoMoreInteractions' @ [99:13] ==> public fun <T> verifyNoMoreInteractions(vararg mocks: (Any?) -> CordaFuture<*>): Unit defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function1<Any?, CordaFuture<*>>

'block' @ [99:38] ==> val block: (Any?) -> CordaFuture<*> defined in net.corda.core.internal.concurrent.CordaFutureTest.`flatMap works`.<anonymous>[LocalVariableDescriptor]

'Test' @ [103:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mock' @ [105:19] ==> public inline fun <reified T : Any> mock(): Logger defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Logger

'Exception' @ [106:25] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'newSingleThreadExecutor' @ [107:34] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'executor' @ [108:9] ==> val executor: (ExecutorService..ExecutorService?) defined in net.corda.core.internal.concurrent.CordaFutureTest.`andForget works`[LocalVariableDescriptor]

'fork' @ [108:18] ==> public fun <V> Executor.fork(block: () -> Any?): CordaFuture<Any?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'throwable' @ [108:31] ==> val throwable: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`andForget works`[LocalVariableDescriptor]

'andForget' @ [108:43] ==> public fun CordaFuture<*>.andForget(log: Logger): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]

'log' @ [108:53] ==> val log: Logger defined in net.corda.core.internal.concurrent.CordaFutureTest.`andForget works`[LocalVariableDescriptor]

'executor' @ [109:9] ==> val executor: (ExecutorService..ExecutorService?) defined in net.corda.core.internal.concurrent.CordaFutureTest.`andForget works`[LocalVariableDescriptor]

'shutdown' @ [109:18] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'!' @ [110:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'executor' @ [110:17] ==> val executor: (ExecutorService..ExecutorService?) defined in net.corda.core.internal.concurrent.CordaFutureTest.`andForget works`[LocalVariableDescriptor]

'awaitTermination' @ [110:26] ==> public abstract fun awaitTermination(p0: Long, p1: (TimeUnit..TimeUnit?)): Boolean defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'SECONDS' @ [110:55] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'verify' @ [113:9] ==> public fun <T> verify(mock: Logger): Logger defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Logger

'log' @ [113:16] ==> val log: Logger defined in net.corda.core.internal.concurrent.CordaFutureTest.`andForget works`[LocalVariableDescriptor]

'error' @ [113:21] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'any' @ [113:27] ==> public inline fun <reified T : Any> any(): String defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> String

'same' @ [113:34] ==> public fun <T> same(value: Exception /* = Exception */): Exception? /* = Exception? */ defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Exception

'throwable' @ [113:39] ==> val throwable: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.CordaFutureTest.`andForget works`[LocalVariableDescriptor]

'openFuture' @ [118:21] ==> public fun <V> openFuture(): OpenFuture<Int> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'openFuture' @ [119:21] ==> public fun <V> openFuture(): OpenFuture<Int> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'openFuture' @ [120:21] ==> public fun <V> openFuture(): OpenFuture<Int> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'listOf' @ [121:21] ==> public fun <T> listOf(vararg elements: OpenFuture<Int>): List<OpenFuture<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpenFuture<Int>

'a' @ [121:28] ==> private final val a: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'b' @ [121:31] ==> private final val b: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'c' @ [121:34] ==> private final val c: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'transpose' @ [121:37] ==> public fun <V> Collection<CordaFuture<out Int>>.transpose(): CordaFuture<List<Int>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Int

'Test' @ [122:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertEquals' @ [124:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Any?>, actual: List<Any?>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Any?>

'emptyList' @ [124:22] ==> public fun <T> emptyList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'emptyList' @ [124:35] ==> public fun <T> emptyList(): List<CordaFuture<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<*>

'transpose' @ [124:63] ==> public fun <V> Collection<CordaFuture<out Any?>>.transpose(): CordaFuture<List<Any?>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'getOrThrow' @ [124:75] ==> public fun <V> Future<List<Any?>>.getOrThrow(timeout: Duration? = ...): List<Any?> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Any?>

'Test' @ [127:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'b' @ [129:9] ==> private final val b: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'set' @ [129:11] ==> public abstract fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'c' @ [130:9] ==> private final val c: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'set' @ [130:11] ==> public abstract fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [131:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'f' @ [131:21] ==> private final val f: CordaFuture<List<Int>> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'isDone' @ [131:23] ==> public final val <V> CordaFuture<List<Int>>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> List<Int>

'a' @ [132:9] ==> private final val a: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'set' @ [132:11] ==> public abstract fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [133:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Int>, actual: List<Int>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Int>

'listOf' @ [133:22] ==> public fun <T> listOf(vararg elements: Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'f' @ [133:39] ==> private final val f: CordaFuture<List<Int>> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'getOrThrow' @ [133:41] ==> public fun <V> Future<List<Int>>.getOrThrow(timeout: Duration? = ...): List<Int> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Int>

'Test' @ [136:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Exception' @ [138:18] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'Exception' @ [139:18] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'Exception' @ [140:18] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'b' @ [141:9] ==> private final val b: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'setException' @ [141:11] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'bx' @ [141:24] ==> val bx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'c' @ [142:9] ==> private final val c: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'setException' @ [142:11] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'cx' @ [142:24] ==> val cx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'assertFalse' @ [143:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'f' @ [143:21] ==> private final val f: CordaFuture<List<Int>> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'isDone' @ [143:23] ==> public final val <V> CordaFuture<List<Int>>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> List<Int>

'a' @ [144:9] ==> private final val a: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'setException' @ [144:11] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'ax' @ [144:24] ==> val ax: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'assertThatThrownBy' @ [145:20] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'f' @ [145:41] ==> private final val f: CordaFuture<List<Int>> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'getOrThrow' @ [145:43] ==> public fun <V> Future<List<Int>>.getOrThrow(timeout: Duration? = ...): List<Int> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Int>

'isSameAs' @ [145:58] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'bx' @ [145:67] ==> val bx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'assertEquals' @ [146:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<(Throwable..Throwable?)>, actual: List<(Throwable..Throwable?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<(kotlin.Throwable..kotlin.Throwable?)>

'listOf' @ [146:22] ==> public fun <T> listOf(vararg elements: Exception /* = Exception */): List<Exception /* = Exception */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Exception

'cx' @ [146:29] ==> val cx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'ax' @ [146:33] ==> val ax: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'bx' @ [146:38] ==> val bx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'suppressed' @ [146:41] ==> public final val Exception.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'asList' @ [146:52] ==> public fun <T> Array<out (Throwable..Throwable?)>.asList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'assertEquals' @ [147:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<(Throwable..Throwable?)>, actual: List<(Throwable..Throwable?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<(kotlin.Throwable..kotlin.Throwable?)>

'emptyList' @ [147:22] ==> public fun <T> emptyList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'ax' @ [147:35] ==> val ax: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'suppressed' @ [147:38] ==> public final val Exception.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'asList' @ [147:49] ==> public fun <T> Array<out (Throwable..Throwable?)>.asList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'assertEquals' @ [148:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<(Throwable..Throwable?)>, actual: List<(Throwable..Throwable?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<(kotlin.Throwable..kotlin.Throwable?)>

'emptyList' @ [148:22] ==> public fun <T> emptyList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'cx' @ [148:35] ==> val cx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose throwables are reported in the order they were thrown`[LocalVariableDescriptor]

'suppressed' @ [148:38] ==> public final val Exception.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'asList' @ [148:49] ==> public fun <T> Array<out (Throwable..Throwable?)>.asList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'Test' @ [151:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Exception' @ [153:18] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'Exception' @ [154:18] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'b' @ [155:9] ==> private final val b: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'setException' @ [155:11] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'bx' @ [155:24] ==> val bx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose mixture of outcomes`[LocalVariableDescriptor]

'c' @ [156:9] ==> private final val c: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'setException' @ [156:11] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'cx' @ [156:24] ==> val cx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose mixture of outcomes`[LocalVariableDescriptor]

'assertFalse' @ [157:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'f' @ [157:21] ==> private final val f: CordaFuture<List<Int>> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'isDone' @ [157:23] ==> public final val <V> CordaFuture<List<Int>>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> List<Int>

'a' @ [158:9] ==> private final val a: OpenFuture<Int> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'set' @ [158:11] ==> public abstract fun set(value: Int): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'assertThatThrownBy' @ [159:20] ==> @CheckReturnValue public final fun assertThatThrownBy(p0: (() -> Unit..(() -> Unit)?)): (AbstractThrowableAssert<*, out (Throwable..Throwable?)>..AbstractThrowableAssert<*, out (Throwable..Throwable?)>?) defined in org.assertj.core.api.Assertions[SamAdapterFunctionDescriptor]

'f' @ [159:41] ==> private final val f: CordaFuture<List<Int>> defined in net.corda.core.internal.concurrent.TransposeTest[PropertyDescriptorImpl]

'getOrThrow' @ [159:43] ==> public fun <V> Future<List<Int>>.getOrThrow(timeout: Duration? = ...): List<Int> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Int>

'isSameAs' @ [159:58] ==> public open fun isSameAs(p0: (Any..Any?)): (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>..AbstractThrowableAssert<out (AbstractThrowableAssert<out Any?, out Any?>..AbstractThrowableAssert<out Any?, out Any?>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?), out (Throwable..Throwable?)>?) defined in org.assertj.core.api.AbstractThrowableAssert[JavaMethodDescriptor]

'bx' @ [159:67] ==> val bx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose mixture of outcomes`[LocalVariableDescriptor]

'assertEquals' @ [160:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<(Throwable..Throwable?)>, actual: List<(Throwable..Throwable?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<(kotlin.Throwable..kotlin.Throwable?)>

'listOf' @ [160:22] ==> public fun <T> listOf(element: Exception /* = Exception */): List<Exception /* = Exception */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Exception

'cx' @ [160:29] ==> val cx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose mixture of outcomes`[LocalVariableDescriptor]

'bx' @ [160:34] ==> val bx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose mixture of outcomes`[LocalVariableDescriptor]

'suppressed' @ [160:37] ==> public final val Exception.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'asList' @ [160:48] ==> public fun <T> Array<out (Throwable..Throwable?)>.asList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'assertEquals' @ [161:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<(Throwable..Throwable?)>, actual: List<(Throwable..Throwable?)>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<(kotlin.Throwable..kotlin.Throwable?)>

'emptyList' @ [161:22] ==> public fun <T> emptyList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'cx' @ [161:35] ==> val cx: Exception /* = Exception */ defined in net.corda.core.internal.concurrent.TransposeTest.`transpose mixture of outcomes`[LocalVariableDescriptor]

'suppressed' @ [161:38] ==> public final val Exception.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'asList' @ [161:49] ==> public fun <T> Array<out (Throwable..Throwable?)>.asList(): List<(Throwable..Throwable?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

