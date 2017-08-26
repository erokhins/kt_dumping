'ShutdownManager' @ [24:5] ==> public companion object defined in net.corda.testing.driver.ShutdownManager[FakeCallableDescriptorForObject]

'run' @ [24:21] ==> public final inline fun <A> run(providedExecutorService: ExecutorService? = ..., block: ShutdownManager.() -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Unit

'newFixedThreadPool' @ [25:34] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'parallelism' @ [25:53] ==> value-parameter parallelism: Int defined in net.corda.testing.performance.startTightLoopInjector[ValueParameterDescriptorImpl]

'registerShutdown' @ [26:9] ==> public final fun registerShutdown(shutdown: () -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager[SimpleFunctionDescriptorImpl]

'executor' @ [26:28] ==> val executor: (ExecutorService..ExecutorService?) defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'shutdown' @ [26:37] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'CountDownLatch' @ [27:30] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'numberOfInjections' @ [27:45] ==> value-parameter numberOfInjections: Int defined in net.corda.testing.performance.startTightLoopInjector[ValueParameterDescriptorImpl]

'AtomicInteger' @ [28:27] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'ReentrantLock' @ [29:20] ==> public constructor ReentrantLock() defined in java.util.concurrent.locks.ReentrantLock[JavaClassConstructorDescriptor]

'lock' @ [30:29] ==> val lock: ReentrantLock defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'newCondition' @ [30:34] ==> public open fun newCondition(): (Condition..Condition?) defined in java.util.concurrent.locks.ReentrantLock[JavaMethodDescriptor]

'thread' @ [31:24] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'AtomicInteger' @ [32:32] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'numberOfInjections' @ [32:46] ==> value-parameter numberOfInjections: Int defined in net.corda.testing.performance.startTightLoopInjector[ValueParameterDescriptorImpl]

'leftToSubmit' @ [34:21] ==> val leftToSubmit: AtomicInteger defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getAndDecrement' @ [34:34] ==> public final fun getAndDecrement(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'executor' @ [35:17] ==> val executor: (ExecutorService..ExecutorService?) defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'submit' @ [35:26] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'invoke' @ [36:21] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'queuedCount' @ [37:25] ==> val queuedCount: AtomicInteger defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'decrementAndGet' @ [37:37] ==> public final fun decrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'queueBound' @ [37:57] ==> value-parameter queueBound: Int defined in net.corda.testing.performance.startTightLoopInjector[ValueParameterDescriptorImpl]

'lock' @ [38:25] ==> val lock: ReentrantLock defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'withLock' @ [38:30] ==> @InlineOnly public inline fun <T> Lock.withLock(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'canQueueAgain' @ [39:29] ==> val canQueueAgain: (Condition..Condition?) defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'signal' @ [39:43] ==> public abstract fun signal(): Unit defined in java.util.concurrent.locks.Condition[JavaMethodDescriptor]

'remainingLatch' @ [42:21] ==> val remainingLatch: CountDownLatch defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'countDown' @ [42:36] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'queuedCount' @ [44:21] ==> val queuedCount: AtomicInteger defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'incrementAndGet' @ [44:33] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'queueBound' @ [44:53] ==> value-parameter queueBound: Int defined in net.corda.testing.performance.startTightLoopInjector[ValueParameterDescriptorImpl]

'lock' @ [45:21] ==> val lock: ReentrantLock defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'withLock' @ [45:26] ==> @InlineOnly public inline fun <T> Lock.withLock(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'canQueueAgain' @ [46:25] ==> val canQueueAgain: (Condition..Condition?) defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'await' @ [46:39] ==> public abstract fun await(): Unit defined in java.util.concurrent.locks.Condition[JavaMethodDescriptor]

'registerShutdown' @ [51:9] ==> public final fun registerShutdown(shutdown: () -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager[SimpleFunctionDescriptorImpl]

'injector' @ [51:28] ==> val injector: Thread defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'interrupt' @ [51:37] ==> public open fun interrupt(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'remainingLatch' @ [52:9] ==> val remainingLatch: CountDownLatch defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'await' @ [52:24] ==> public open fun await(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'injector' @ [53:9] ==> val injector: Thread defined in net.corda.testing.performance.startTightLoopInjector.<anonymous>[LocalVariableDescriptor]

'join' @ [53:18] ==> public final fun join(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'Semaphore' @ [66:25] ==> public constructor Semaphore(p0: Int) defined in java.util.concurrent.Semaphore[JavaClassConstructorDescriptor]

'metricRegistry' @ [67:5] ==> value-parameter metricRegistry: MetricRegistry defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'register' @ [67:20] ==> public open fun <T : (Metric..Metric?)> register(p0: (String..String?), p1: (Gauge<(Int..Int?)>..Gauge<(Int..Int?)>?)): (Gauge<(Int..Int?)>..Gauge<(Int..Int?)>?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]
Inferred types:
    <T : (Metric..Metric?)> -> (com.codahale.metrics.Gauge<(kotlin.Int..kotlin.Int?)>..com.codahale.metrics.Gauge<(kotlin.Int..kotlin.Int?)>?)

'queueSizeMetricName' @ [67:29] ==> value-parameter queueSizeMetricName: String = ... defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'Gauge' @ [67:50] ==> public fun <T : (Any..Any?)> Gauge(function: () -> (Int..Int?)): Gauge<(Int..Int?)> defined in com.codahale.metrics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Int..kotlin.Int?)

'workSemaphore' @ [67:58] ==> val workSemaphore: Semaphore defined in net.corda.testing.performance.startPublishingFixedRateInjector[LocalVariableDescriptor]

'availablePermits' @ [67:72] ==> public open fun availablePermits(): Int defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'metricRegistry' @ [68:29] ==> value-parameter metricRegistry: MetricRegistry defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'timer' @ [68:44] ==> public open fun timer(p0: (String..String?)): (Timer..Timer?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'workDurationMetricName' @ [68:50] ==> value-parameter workDurationMetricName: String = ... defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'ShutdownManager' @ [69:5] ==> public companion object defined in net.corda.testing.driver.ShutdownManager[FakeCallableDescriptorForObject]

'run' @ [69:21] ==> public final inline fun <A> run(providedExecutorService: ExecutorService? = ..., block: ShutdownManager.() -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Unit

'newSingleThreadScheduledExecutor' @ [70:34] ==> public open fun newSingleThreadScheduledExecutor(): (ScheduledExecutorService..ScheduledExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'registerShutdown' @ [71:9] ==> public final fun registerShutdown(shutdown: () -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager[SimpleFunctionDescriptorImpl]

'executor' @ [71:28] ==> val executor: (ScheduledExecutorService..ScheduledExecutorService?) defined in net.corda.testing.performance.startPublishingFixedRateInjector.<anonymous>[LocalVariableDescriptor]

'shutdown' @ [71:37] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ScheduledExecutorService[JavaMethodDescriptor]

'newFixedThreadPool' @ [72:38] ==> public open fun newFixedThreadPool(p0: Int): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'parallelism' @ [72:57] ==> value-parameter parallelism: Int defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'registerShutdown' @ [73:9] ==> public final fun registerShutdown(shutdown: () -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager[SimpleFunctionDescriptorImpl]

'workExecutor' @ [73:28] ==> val workExecutor: (ExecutorService..ExecutorService?) defined in net.corda.testing.performance.startPublishingFixedRateInjector.<anonymous>[LocalVariableDescriptor]

'shutdown' @ [73:41] ==> public abstract fun shutdown(): Unit defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'synchronizedList' @ [74:35] ==> public open fun <T : (Any..Any?)> synchronizedList(p0: (MutableList<(Long..Long?)>..List<(Long..Long?)>?)): (MutableList<(Long..Long?)>..List<(Long..Long?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'ArrayList' @ [74:52] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Long

'..' @ [75:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'parallelism' @ [75:22] ==> value-parameter parallelism: Int defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'workExecutor' @ [76:13] ==> val workExecutor: (ExecutorService..ExecutorService?) defined in net.corda.testing.performance.startPublishingFixedRateInjector.<anonymous>[LocalVariableDescriptor]

'submit' @ [76:26] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'workSemaphore' @ [79:25] ==> val workSemaphore: Semaphore defined in net.corda.testing.performance.startPublishingFixedRateInjector[LocalVariableDescriptor]

'acquire' @ [79:39] ==> public open fun acquire(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'workDurationTimer' @ [80:25] ==> val workDurationTimer: (Timer..Timer?) defined in net.corda.testing.performance.startPublishingFixedRateInjector[LocalVariableDescriptor]

'time' @ [80:43] ==> public final fun <T : (Any..Any?)> time(p0: (() -> (Boolean..Boolean?)..(() -> (Boolean..Boolean?))?)): (Boolean..Boolean?) defined in com.codahale.metrics.Timer[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'timings' @ [81:29] ==> val timings: (MutableList<(Long..Long?)>..List<(Long..Long?)>?) defined in net.corda.testing.performance.startPublishingFixedRateInjector.<anonymous>[LocalVariableDescriptor]

'add' @ [81:37] ==> public abstract fun add(element: (Long..Long?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'createStarted' @ [82:47] ==> public open fun createStarted(): (Stopwatch..Stopwatch?) defined in com.google.common.base.Stopwatch[JavaMethodDescriptor]

'apply' @ [82:63] ==> @InlineOnly public inline fun <T> (Stopwatch..Stopwatch?).apply(block: (Stopwatch..Stopwatch?).() -> Unit): (Stopwatch..Stopwatch?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.common.base.Stopwatch..com.google.common.base.Stopwatch?)

'invoke' @ [83:41] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'stop' @ [84:39] ==> @CanIgnoreReturnValue public open fun stop(): (Stopwatch..Stopwatch?) defined in com.google.common.base.Stopwatch[JavaMethodDescriptor]

'elapsed' @ [84:46] ==> public open fun elapsed(p0: (TimeUnit..TimeUnit?)): Long defined in com.google.common.base.Stopwatch[JavaMethodDescriptor]

'MICROSECONDS' @ [84:63] ==> enum entry MICROSECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'throwable' @ [89:21] ==> val throwable: Throwable defined in net.corda.testing.performance.startPublishingFixedRateInjector.<anonymous>.<anonymous>[LocalVariableDescriptor]

'printStackTrace' @ [89:31] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'executor' @ [93:24] ==> val executor: (ScheduledExecutorService..ScheduledExecutorService?) defined in net.corda.testing.performance.startPublishingFixedRateInjector.<anonymous>[LocalVariableDescriptor]

'scheduleAtFixedRate' @ [93:33] ==> public final fun scheduleAtFixedRate(p0: (() -> Unit..(() -> Unit)?), p1: Long, p2: Long, p3: (TimeUnit..TimeUnit?)): (ScheduledFuture<*>..ScheduledFuture<*>?) defined in java.util.concurrent.ScheduledExecutorService[MyFunctionDescriptor]

'workSemaphore' @ [95:21] ==> val workSemaphore: Semaphore defined in net.corda.testing.performance.startPublishingFixedRateInjector[LocalVariableDescriptor]

'release' @ [95:35] ==> public open fun release(p0: Int): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'injectionRate' @ [95:44] ==> value-parameter injectionRate: Rate defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'SECONDS' @ [95:69] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'toInt' @ [95:78] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'SECONDS' @ [99:26] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'registerShutdown' @ [101:9] ==> public final fun registerShutdown(shutdown: () -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager[SimpleFunctionDescriptorImpl]

'injector' @ [102:13] ==> val injector: (ScheduledFuture<*>..ScheduledFuture<*>?) defined in net.corda.testing.performance.startPublishingFixedRateInjector.<anonymous>[LocalVariableDescriptor]

'cancel' @ [102:22] ==> public abstract fun cancel(p0: Boolean): Boolean defined in java.util.concurrent.ScheduledFuture[JavaMethodDescriptor]

'sleep' @ [104:16] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'overallDuration' @ [104:22] ==> value-parameter overallDuration: Duration defined in net.corda.testing.performance.startPublishingFixedRateInjector[ValueParameterDescriptorImpl]

'toMillis' @ [104:38] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

