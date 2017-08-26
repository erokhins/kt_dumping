'_executor' @ [12:68] ==> public final var _executor: AffinityExecutor.ServiceAffinityExecutor? defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'After' @ [14:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'_executor' @ [15:9] ==> public final var _executor: AffinityExecutor.ServiceAffinityExecutor? defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'shutdown' @ [15:20] ==> public open fun shutdown(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[JavaMethodDescriptor]

'_executor' @ [16:9] ==> public final var _executor: AffinityExecutor.ServiceAffinityExecutor? defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'Test' @ [19:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'_executor' @ [20:9] ==> public final var _executor: AffinityExecutor.ServiceAffinityExecutor? defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'ServiceAffinityExecutor' @ [20:38] ==> public constructor ServiceAffinityExecutor(threadName: String, numThreads: Int) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedClassConstructorDescriptor]

'CountDownLatch' @ [22:21] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'executor' @ [23:9] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'execute' @ [23:18] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'latch' @ [24:13] ==> val latch: CountDownLatch defined in net.corda.node.utilities.AffinityExecutorTests.`flush handles nested executes`[LocalVariableDescriptor]

'await' @ [24:19] ==> public open fun await(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'executor' @ [25:13] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'execute' @ [25:22] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'nestedRan' @ [25:32] ==> var nestedRan: Boolean defined in net.corda.node.utilities.AffinityExecutorTests.`flush handles nested executes`[LocalVariableDescriptor]

'latch' @ [27:9] ==> val latch: CountDownLatch defined in net.corda.node.utilities.AffinityExecutorTests.`flush handles nested executes`[LocalVariableDescriptor]

'countDown' @ [27:15] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'executor' @ [28:9] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'flush' @ [28:18] ==> public open fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [29:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'nestedRan' @ [29:20] ==> var nestedRan: Boolean defined in net.corda.node.utilities.AffinityExecutorTests.`flush handles nested executes`[LocalVariableDescriptor]

'Test' @ [32:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'currentThread' @ [33:33] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'_executor' @ [34:9] ==> public final var _executor: AffinityExecutor.ServiceAffinityExecutor? defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'ServiceAffinityExecutor' @ [34:38] ==> public constructor ServiceAffinityExecutor(threadName: String, numThreads: Int) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedClassConstructorDescriptor]

'assertTrue' @ [35:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'!' @ [35:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'executor' @ [35:21] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'isOnThread' @ [35:30] ==> public open val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedPropertyDescriptor]

'assertFails' @ [36:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'executor' @ [36:23] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'checkOnThread' @ [36:32] ==> public open fun checkOnThread(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedSimpleFunctionDescriptor]

'AtomicReference' @ [38:22] ==> public constructor AtomicReference<V : (Any..Any?)>() defined in java.util.concurrent.atomic.AtomicReference[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Thread

'executor' @ [39:9] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'execute' @ [39:18] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'assertNotEquals' @ [40:13] ==> public fun <@OnlyInputTypes T> assertNotEquals(illegal: (Thread..Thread?), actual: (Thread..Thread?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.lang.Thread..java.lang.Thread?)

'thisThread' @ [40:29] ==> val thisThread: (Thread..Thread?) defined in net.corda.node.utilities.AffinityExecutorTests.`single threaded affinity executor runs on correct thread`[LocalVariableDescriptor]

'currentThread' @ [40:48] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'executor' @ [41:13] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'checkOnThread' @ [41:22] ==> public open fun checkOnThread(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedSimpleFunctionDescriptor]

'thread' @ [42:13] ==> val thread: AtomicReference<Thread> defined in net.corda.node.utilities.AffinityExecutorTests.`single threaded affinity executor runs on correct thread`[LocalVariableDescriptor]

'set' @ [42:20] ==> public final fun set(p0: (Thread..Thread?)): Unit defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'currentThread' @ [42:31] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'AtomicReference' @ [44:23] ==> public constructor AtomicReference<V : (Any..Any?)>() defined in java.util.concurrent.atomic.AtomicReference[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Thread

'executor' @ [45:9] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'execute' @ [45:18] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'thread2' @ [46:13] ==> val thread2: AtomicReference<Thread> defined in net.corda.node.utilities.AffinityExecutorTests.`single threaded affinity executor runs on correct thread`[LocalVariableDescriptor]

'set' @ [46:21] ==> public final fun set(p0: (Thread..Thread?)): Unit defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'currentThread' @ [46:32] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'executor' @ [47:13] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'checkOnThread' @ [47:22] ==> public open fun checkOnThread(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedSimpleFunctionDescriptor]

'executor' @ [49:9] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'flush' @ [49:18] ==> public open fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [50:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (Thread..Thread?), actual: (Thread..Thread?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.lang.Thread..java.lang.Thread?)

'thread2' @ [50:22] ==> val thread2: AtomicReference<Thread> defined in net.corda.node.utilities.AffinityExecutorTests.`single threaded affinity executor runs on correct thread`[LocalVariableDescriptor]

'get' @ [50:30] ==> public final fun get(): (Thread..Thread?) defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'thread' @ [50:37] ==> val thread: AtomicReference<Thread> defined in net.corda.node.utilities.AffinityExecutorTests.`single threaded affinity executor runs on correct thread`[LocalVariableDescriptor]

'get' @ [50:44] ==> public final fun get(): (Thread..Thread?) defined in java.util.concurrent.atomic.AtomicReference[JavaMethodDescriptor]

'Test' @ [53:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'_executor' @ [54:9] ==> public final var _executor: AffinityExecutor.ServiceAffinityExecutor? defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'ServiceAffinityExecutor' @ [54:38] ==> public constructor ServiceAffinityExecutor(threadName: String, numThreads: Int) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedClassConstructorDescriptor]

'assertFalse' @ [55:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'executor' @ [55:21] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'isOnThread' @ [55:30] ==> public open val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedPropertyDescriptor]

'CountDownLatch' @ [57:21] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'CountDownLatch' @ [58:22] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'synchronizedList' @ [59:35] ==> public open fun <T : (Any..Any?)> synchronizedList(p0: (MutableList<(Thread..Thread?)>..List<(Thread..Thread?)>?)): (MutableList<(Thread..Thread?)>..List<(Thread..Thread?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Thread

'ArrayList' @ [59:52] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Thread

'executor' @ [62:13] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'execute' @ [62:22] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'assertTrue' @ [63:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'executor' @ [63:28] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'isOnThread' @ [63:37] ==> public open val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedPropertyDescriptor]

'threads' @ [64:17] ==> val threads: (MutableList<(Thread..Thread?)>..List<(Thread..Thread?)>?) defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'currentThread' @ [64:35] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'latch2' @ [65:17] ==> val latch2: CountDownLatch defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'countDown' @ [65:24] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'latch' @ [66:17] ==> val latch: CountDownLatch defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'await' @ [66:23] ==> public open fun await(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'blockAThread' @ [69:9] ==> local final fun blockAThread(): Unit defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[SimpleFunctionDescriptorImpl]

'blockAThread' @ [70:9] ==> local final fun blockAThread(): Unit defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[SimpleFunctionDescriptorImpl]

'latch2' @ [71:9] ==> val latch2: CountDownLatch defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'await' @ [71:16] ==> public open fun await(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'assertEquals' @ [72:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'threads' @ [72:25] ==> val threads: (MutableList<(Thread..Thread?)>..List<(Thread..Thread?)>?) defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'size' @ [72:33] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'executor' @ [73:26] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'fetchFrom' @ [73:35] ==> public open fun <T> fetchFrom(fetcher: () -> Int): Int defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'assertTrue' @ [74:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'executor' @ [74:24] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'isOnThread' @ [74:33] ==> public open val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedPropertyDescriptor]

'threads' @ [75:13] ==> val threads: (MutableList<(Thread..Thread?)>..List<(Thread..Thread?)>?) defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'currentThread' @ [75:31] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'threads' @ [76:13] ==> val threads: (MutableList<(Thread..Thread?)>..List<(Thread..Thread?)>?) defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'distinct' @ [76:21] ==> public fun <T> Iterable<(Thread..Thread?)>.distinct(): List<(Thread..Thread?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Thread..java.lang.Thread?)

'size' @ [76:32] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assertEquals' @ [78:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'numThreads' @ [78:25] ==> val numThreads: Int defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'latch' @ [79:9] ==> val latch: CountDownLatch defined in net.corda.node.utilities.AffinityExecutorTests.`pooled executor`[LocalVariableDescriptor]

'countDown' @ [79:15] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'executor' @ [80:9] ==> public final val executor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.utilities.AffinityExecutorTests[PropertyDescriptorImpl]

'flush' @ [80:18] ==> public open fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[DeserializedSimpleFunctionDescriptor]

