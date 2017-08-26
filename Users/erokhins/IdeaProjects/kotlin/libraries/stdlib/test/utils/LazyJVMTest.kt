'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [16:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'AtomicInteger' @ [17:23] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'lazy' @ [18:20] ==> public fun <T> lazy(initializer: () -> Int): Lazy<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'counter' @ [19:25] ==> val counter: AtomicInteger defined in test.utils.LazyJVMTest.synchronizedLazy[LocalVariableDescriptor]

'incrementAndGet' @ [19:33] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'sleep' @ [20:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'value' @ [21:13] ==> val value: Int defined in test.utils.LazyJVMTest.synchronizedLazy.<anonymous>[LocalVariableDescriptor]

'listOf' @ [24:29] ==> public fun <T> listOf(vararg elements: Lazy<Int>): List<Lazy<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Lazy<Int>

'lazy' @ [24:36] ==> val lazy: Lazy<Int> defined in test.utils.LazyJVMTest.synchronizedLazy[LocalVariableDescriptor]

'lazy' @ [24:42] ==> val lazy: Lazy<Int> defined in test.utils.LazyJVMTest.synchronizedLazy[LocalVariableDescriptor]

'map' @ [24:48] ==> public inline fun <T, R> Iterable<Lazy<Int>>.map(transform: (Lazy<Int>) -> Thread): List<Thread> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Lazy<Int>
    <R> -> Thread

'thread' @ [24:54] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'it' @ [24:63] ==> value-parameter it: Lazy<Int> defined in test.utils.LazyJVMTest.synchronizedLazy.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [24:66] ==> public abstract val value: Int defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'accessThreads' @ [25:9] ==> val accessThreads: List<Thread> defined in test.utils.LazyJVMTest.synchronizedLazy[LocalVariableDescriptor]

'forEach' @ [25:23] ==> @HidesMembers public inline fun <T> Iterable<Thread>.forEach(action: (Thread) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Thread

'it' @ [25:33] ==> value-parameter it: Thread defined in test.utils.LazyJVMTest.synchronizedLazy.<anonymous>[ValueParameterDescriptorImpl]

'join' @ [25:36] ==> public final fun join(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'assertEquals' @ [27:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'counter' @ [27:25] ==> val counter: AtomicInteger defined in test.utils.LazyJVMTest.synchronizedLazy[LocalVariableDescriptor]

'get' @ [27:33] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'Test' @ [30:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'AtomicInteger' @ [31:23] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'ConcurrentHashMap' @ [33:20] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Int
    <V : (Any..Any?)> -> Boolean

'Any' @ [34:20] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'counter' @ [37:25] ==> val counter: AtomicInteger defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'incrementAndGet' @ [37:33] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'runs' @ [38:13] ==> val runs: ConcurrentHashMap<Int, Boolean> defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'value' @ [38:22] ==> val value: Int defined in test.utils.LazyJVMTest.externallySynchronizedLazy.<anonymous>[LocalVariableDescriptor]

'initialized' @ [38:31] ==> var initialized: Boolean defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'sleep' @ [39:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'initialized' @ [40:13] ==> var initialized: Boolean defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'value' @ [41:13] ==> val value: Int defined in test.utils.LazyJVMTest.externallySynchronizedLazy.<anonymous>[LocalVariableDescriptor]

'lazy' @ [43:21] ==> public fun <T> lazy(lock: Any?, initializer: () -> Int): Lazy<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'lock' @ [43:26] ==> val lock: Any defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'initializer' @ [43:32] ==> val initializer: () -> Int defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'lazy' @ [44:21] ==> public fun <T> lazy(lock: Any?, initializer: () -> Int): Lazy<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'lock' @ [44:26] ==> val lock: Any defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'initializer' @ [44:32] ==> val initializer: () -> Int defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'listOf' @ [46:29] ==> public fun <T> listOf(vararg elements: Lazy<Int>): List<Lazy<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Lazy<Int>

'lazy1' @ [46:36] ==> val lazy1: Lazy<Int> defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'lazy2' @ [46:43] ==> val lazy2: Lazy<Int> defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'map' @ [46:50] ==> public inline fun <T, R> Iterable<Lazy<Int>>.map(transform: (Lazy<Int>) -> Thread): List<Thread> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Lazy<Int>
    <R> -> Thread

'thread' @ [46:56] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'it' @ [46:65] ==> value-parameter it: Lazy<Int> defined in test.utils.LazyJVMTest.externallySynchronizedLazy.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [46:68] ==> public abstract val value: Int defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'accessThreads' @ [47:9] ==> val accessThreads: List<Thread> defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'forEach' @ [47:23] ==> @HidesMembers public inline fun <T> Iterable<Thread>.forEach(action: (Thread) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Thread

'it' @ [47:33] ==> value-parameter it: Thread defined in test.utils.LazyJVMTest.externallySynchronizedLazy.<anonymous>[ValueParameterDescriptorImpl]

'join' @ [47:36] ==> public final fun join(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'assertEquals' @ [49:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'counter' @ [49:25] ==> val counter: AtomicInteger defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'get' @ [49:33] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'Suppress' @ [50:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'component1' @ [51:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, Boolean>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Boolean

'component2' @ [51:24] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, Boolean>.component2(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Boolean

'runs' @ [51:40] ==> val runs: ConcurrentHashMap<Int, Boolean> defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'assertEquals' @ [52:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Boolean, actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Boolean

'initialized' @ [52:26] ==> val initialized: Boolean defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'counter' @ [52:39] ==> val counter: Int defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'initialized' @ [52:128] ==> val initialized: Boolean defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'counter' @ [52:150] ==> val counter: Int defined in test.utils.LazyJVMTest.externallySynchronizedLazy[LocalVariableDescriptor]

'Test' @ [56:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'AtomicInteger' @ [57:23] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'ConcurrentHashMap' @ [59:20] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Int
    <V : (Any..Any?)> -> Boolean

'counter' @ [62:25] ==> val counter: AtomicInteger defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'incrementAndGet' @ [62:33] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'runs' @ [63:13] ==> val runs: ConcurrentHashMap<Int, Boolean> defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'value' @ [63:22] ==> val value: Int defined in test.utils.LazyJVMTest.publishOnceLazy.<anonymous>[LocalVariableDescriptor]

'initialized' @ [63:31] ==> var initialized: Boolean defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'sleep' @ [64:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'*' @ [64:26] ==> public final operator fun times(other: Long): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [64:27] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'value' @ [64:31] ==> val value: Int defined in test.utils.LazyJVMTest.publishOnceLazy.<anonymous>[LocalVariableDescriptor]

'initialized' @ [65:13] ==> var initialized: Boolean defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'value' @ [66:13] ==> val value: Int defined in test.utils.LazyJVMTest.publishOnceLazy.<anonymous>[LocalVariableDescriptor]

'lazy' @ [68:20] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Int): Lazy<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'PUBLICATION' @ [68:46] ==> enum entry PUBLICATION defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'initializer' @ [68:59] ==> val initializer: () -> Int defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'listOf' @ [70:29] ==> public fun <T> listOf(vararg elements: Lazy<Int>): List<Lazy<Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Lazy<Int>

'lazy' @ [70:36] ==> val lazy: Lazy<Int> defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'lazy' @ [70:42] ==> val lazy: Lazy<Int> defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'map' @ [70:48] ==> public inline fun <T, R> Iterable<Lazy<Int>>.map(transform: (Lazy<Int>) -> Thread): List<Thread> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Lazy<Int>
    <R> -> Thread

'thread' @ [70:54] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'it' @ [70:63] ==> value-parameter it: Lazy<Int> defined in test.utils.LazyJVMTest.publishOnceLazy.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [70:66] ==> public abstract val value: Int defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'accessThreads' @ [71:9] ==> val accessThreads: List<Thread> defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'forEach' @ [71:23] ==> @HidesMembers public inline fun <T> Iterable<Thread>.forEach(action: (Thread) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Thread

'it' @ [71:33] ==> value-parameter it: Thread defined in test.utils.LazyJVMTest.publishOnceLazy.<anonymous>[ValueParameterDescriptorImpl]

'join' @ [71:36] ==> public final fun join(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'assertEquals' @ [73:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'counter' @ [73:25] ==> val counter: AtomicInteger defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'get' @ [73:33] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'assertEquals' @ [74:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'lazy' @ [74:25] ==> val lazy: Lazy<Int> defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'value' @ [74:30] ==> public abstract val value: Int defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'Suppress' @ [75:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'component1' @ [76:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, Boolean>.component1(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Boolean

'component2' @ [76:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Int, Boolean>.component2(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Boolean

'runs' @ [76:34] ==> val runs: ConcurrentHashMap<Int, Boolean> defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'assertFalse' @ [77:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'initialized' @ [77:25] ==> val initialized: Boolean defined in test.utils.LazyJVMTest.publishOnceLazy[LocalVariableDescriptor]

'Test' @ [81:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [82:21] ==> public fun <T> listOf(vararg elements: LazyThreadSafetyMode): List<LazyThreadSafetyMode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LazyThreadSafetyMode

'SYNCHRONIZED' @ [82:49] ==> enum entry SYNCHRONIZED defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'PUBLICATION' @ [82:84] ==> enum entry PUBLICATION defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'NONE' @ [82:118] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'lazy' @ [83:24] ==> public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> String): Lazy<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mode' @ [83:29] ==> val mode: LazyThreadSafetyMode defined in test.utils.LazyJVMTest.lazyInitializationForcedOnSerialization[LocalVariableDescriptor]

'assertFalse' @ [84:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'lazy' @ [84:25] ==> val lazy: Lazy<String> defined in test.utils.LazyJVMTest.lazyInitializationForcedOnSerialization[LocalVariableDescriptor]

'isInitialized' @ [84:30] ==> public abstract fun isInitialized(): Boolean defined in kotlin.Lazy[DeserializedSimpleFunctionDescriptor]

'serializeAndDeserialize' @ [85:25] ==> public fun <T> serializeAndDeserialize(value: Lazy<String>): Lazy<String> defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Lazy<String>

'lazy' @ [85:49] ==> val lazy: Lazy<String> defined in test.utils.LazyJVMTest.lazyInitializationForcedOnSerialization[LocalVariableDescriptor]

'assertTrue' @ [86:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'lazy' @ [86:24] ==> val lazy: Lazy<String> defined in test.utils.LazyJVMTest.lazyInitializationForcedOnSerialization[LocalVariableDescriptor]

'isInitialized' @ [86:29] ==> public abstract fun isInitialized(): Boolean defined in kotlin.Lazy[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [87:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'lazy2' @ [87:24] ==> val lazy2: Lazy<String> defined in test.utils.LazyJVMTest.lazyInitializationForcedOnSerialization[LocalVariableDescriptor]

'isInitialized' @ [87:30] ==> public abstract fun isInitialized(): Boolean defined in kotlin.Lazy[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [88:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'lazy' @ [88:26] ==> val lazy: Lazy<String> defined in test.utils.LazyJVMTest.lazyInitializationForcedOnSerialization[LocalVariableDescriptor]

'value' @ [88:31] ==> public abstract val value: String defined in kotlin.Lazy[DeserializedPropertyDescriptor]

'lazy2' @ [88:38] ==> val lazy2: Lazy<String> defined in test.utils.LazyJVMTest.lazyInitializationForcedOnSerialization[LocalVariableDescriptor]

'value' @ [88:44] ==> public abstract val value: String defined in kotlin.Lazy[DeserializedPropertyDescriptor]

