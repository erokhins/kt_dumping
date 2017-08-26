'Clock' @ [30:31] ==> protected/*protected and package*/ constructor Clock() defined in java.time.Clock[JavaClassConstructorDescriptor]

'AtomicLong' @ [32:28] ==> public constructor AtomicLong(p0: Long) defined in java.util.concurrent.atomic.AtomicLong[JavaClassConstructorDescriptor]

'lazy' @ [37:40] ==> public fun <T> lazy(initializer: () -> (Observable<Long>..Observable<Long>?)): Lazy<(Observable<Long>..Observable<Long>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (rx.Observable<kotlin.Long>..rx.Observable<kotlin.Long>?)

'create' @ [38:20] ==> public final fun <T : (Any..Any?)> create(p0: (((Subscriber<in (Long..Long?)>..Subscriber<in (Long..Long?)>?)) -> Unit..(((Subscriber<in (Long..Long?)>..Subscriber<in (Long..Long?)>?)) -> Unit)?)): (Observable<(Long..Long?)>..Observable<(Long..Long?)>?) defined in rx.Observable[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'!' @ [39:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'subscriber' @ [39:18] ==> value-parameter subscriber: Subscriber<in Long> defined in net.corda.node.utilities.MutableClock.mutations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isUnsubscribed' @ [39:29] ==> public final val <T : (Any..Any?)> Subscriber<in Long>.isUnsubscribed: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'mutationObservers' @ [40:17] ==> private final val mutationObservers: CopyOnWriteArraySet<Subscriber<in Long>> defined in net.corda.node.utilities.MutableClock[PropertyDescriptorImpl]

'add' @ [40:35] ==> public open fun add(element: (Subscriber<in Long>..Subscriber<in Long>?)): Boolean defined in java.util.concurrent.CopyOnWriteArraySet[JavaMethodDescriptor]

'subscriber' @ [40:39] ==> value-parameter subscriber: Subscriber<in Long> defined in net.corda.node.utilities.MutableClock.mutations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'subscriber' @ [42:17] ==> value-parameter subscriber: Subscriber<in Long> defined in net.corda.node.utilities.MutableClock.mutations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [42:28] ==> public final fun add(p0: (Subscription..Subscription?)): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'create' @ [42:46] ==> public final fun create(p0: (() -> Unit..(() -> Unit)?)): (Subscription..Subscription?) defined in rx.subscriptions.Subscriptions[SamAdapterFunctionDescriptor]

'mutationObservers' @ [42:55] ==> private final val mutationObservers: CopyOnWriteArraySet<Subscriber<in Long>> defined in net.corda.node.utilities.MutableClock[PropertyDescriptorImpl]

'remove' @ [42:73] ==> public open fun remove(element: (Subscriber<in Long>..Subscriber<in Long>?)): Boolean defined in java.util.concurrent.CopyOnWriteArraySet[JavaMethodDescriptor]

'subscriber' @ [42:80] ==> value-parameter subscriber: Subscriber<in Long> defined in net.corda.node.utilities.MutableClock.mutations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'CopyOnWriteArraySet' @ [47:37] ==> public constructor CopyOnWriteArraySet<E : (Any..Any?)>() defined in java.util.concurrent.CopyOnWriteArraySet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Subscriber<in Long>

'_version' @ [53:23] ==> private final val _version: AtomicLong defined in net.corda.node.utilities.MutableClock[PropertyDescriptorImpl]

'incrementAndGet' @ [53:32] ==> public final fun incrementAndGet(): Long defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'mutationObservers' @ [54:26] ==> private final val mutationObservers: CopyOnWriteArraySet<Subscriber<in Long>> defined in net.corda.node.utilities.MutableClock[PropertyDescriptorImpl]

'!' @ [55:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'observer' @ [55:18] ==> val observer: (Subscriber<in Long>..Subscriber<in Long>?) defined in net.corda.node.utilities.MutableClock.notifyMutationObservers[LocalVariableDescriptor]

'isUnsubscribed' @ [55:27] ==> public final val <T : (Any..Any?)> Subscriber<in Long>.isUnsubscribed: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'observer' @ [56:17] ==> val observer: (Subscriber<in Long>..Subscriber<in Long>?) defined in net.corda.node.utilities.MutableClock.notifyMutationObservers[LocalVariableDescriptor]

'onNext' @ [56:26] ==> public abstract fun onNext(p0: (Any..Any?)): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'version' @ [56:33] ==> val version: Long defined in net.corda.node.utilities.MutableClock.notifyMutationObservers[LocalVariableDescriptor]

'Suspendable' @ [69:1] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'create' @ [70:88] ==> public open fun <V : (Any..Any?)> create(): (SettableFuture<(Any..Any?)>..SettableFuture<(Any..Any?)>?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Any

'makeStrandFriendlySettableFuture' @ [73:39] ==> private fun <T : Any> makeStrandFriendlySettableFuture(future: Future<out (Any..Any?)>): SettableFuture<Boolean> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (kotlin.Any..kotlin.Any?)

'future' @ [73:72] ==> value-parameter future: Future<*> = ... defined in net.corda.node.utilities.awaitWithDeadline[ValueParameterDescriptorImpl]

'if (this is MutableClock) {
            mutations.first().subscribe {
                originalFutureCompleted.set(false)
            }
        } else {
            null
        }' @ [74:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Subscription?, elseBranch: Subscription?): Subscription?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Subscription?

'this' @ [74:32] ==> <this> defined in net.corda.node.utilities.awaitWithDeadline[ReceiverParameterDescriptorImpl]

'mutations' @ [75:13] ==> public final val mutations: Observable<Long> defined in net.corda.node.utilities.MutableClock[PropertyDescriptorImpl]

'first' @ [75:23] ==> public final fun first(): (Observable<(Long..Long?)>..Observable<(Long..Long?)>?) defined in rx.Observable[JavaMethodDescriptor]

'subscribe' @ [75:31] ==> public final fun subscribe(p0: (((Long..Long?)) -> Unit..(((Long..Long?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'originalFutureCompleted' @ [76:17] ==> val originalFutureCompleted: SettableFuture<Boolean> defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'set' @ [76:41] ==> public open fun set(p0: (Boolean..Boolean?)): Boolean defined in co.paralleluniverse.strands.SettableFuture[JavaMethodDescriptor]

'nanos' @ [81:9] ==> var nanos: Long defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'instant' @ [81:18] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'deadline' @ [81:34] ==> value-parameter deadline: Instant defined in net.corda.node.utilities.awaitWithDeadline[ValueParameterDescriptorImpl]

'toNanos' @ [81:44] ==> public open fun toNanos(): Long defined in java.time.Duration[JavaMethodDescriptor]

'nanos' @ [82:13] ==> var nanos: Long defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'originalFutureCompleted' @ [85:17] ==> val originalFutureCompleted: SettableFuture<Boolean> defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'get' @ [85:41] ==> @Suspendable @Instrumented public open fun get(p0: Long, p1: (TimeUnit..TimeUnit?)): (Boolean..Boolean?) defined in co.paralleluniverse.strands.SettableFuture[JavaMethodDescriptor]

'nanos' @ [85:45] ==> var nanos: Long defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'NANOSECONDS' @ [85:61] ==> enum entry NANOSECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'subscription' @ [94:9] ==> val subscription: Subscription? defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'unsubscribe' @ [94:23] ==> public abstract fun unsubscribe(): Unit defined in rx.Subscription[JavaMethodDescriptor]

'originalFutureCompleted' @ [95:9] ==> val originalFutureCompleted: SettableFuture<Boolean> defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'cancel' @ [95:33] ==> public open fun cancel(p0: Boolean): Boolean defined in co.paralleluniverse.strands.SettableFuture[JavaMethodDescriptor]

'nanos' @ [96:14] ==> var nanos: Long defined in net.corda.node.utilities.awaitWithDeadline[LocalVariableDescriptor]

'!' @ [96:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'future' @ [96:28] ==> value-parameter future: Future<*> = ... defined in net.corda.node.utilities.awaitWithDeadline[ValueParameterDescriptorImpl]

'isDone' @ [96:35] ==> public final val <V : (Any..Any?)> Future<out (Any..Any?)>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'future' @ [97:12] ==> value-parameter future: Future<*> = ... defined in net.corda.node.utilities.awaitWithDeadline[ValueParameterDescriptorImpl]

'isDone' @ [97:19] ==> public final val <V : (Any..Any?)> Future<out (Any..Any?)>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'SettableFuture' @ [107:77] ==> public constructor SettableFuture<V : (Any..Any?)>() defined in co.paralleluniverse.strands.SettableFuture[JavaClassConstructorDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Boolean

'also' @ [107:103] ==> @InlineOnly @SinceKotlin public inline fun <T> SettableFuture<Boolean>.also(block: (SettableFuture<Boolean>) -> Unit): SettableFuture<Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SettableFuture<Boolean>

'when (future) {
        is ListenableFuture -> future.addListener(Runnable { g.set(true) }, Executor { it.run() })
        is CompletionStage<*> -> future.whenComplete { _, _ -> g.set(true) }
        else -> throw IllegalArgumentException("Cannot make future $future Fiber friendly.")
    }' @ [108:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'future' @ [108:11] ==> value-parameter future: Future<T> defined in net.corda.node.utilities.makeStrandFriendlySettableFuture[ValueParameterDescriptorImpl]

'future' @ [109:32] ==> value-parameter future: Future<T> defined in net.corda.node.utilities.makeStrandFriendlySettableFuture[ValueParameterDescriptorImpl]

'addListener' @ [109:39] ==> public abstract fun addListener(p0: (Runnable..Runnable?), p1: (Executor..Executor?)): Unit defined in com.google.common.util.concurrent.ListenableFuture[JavaMethodDescriptor]

'Runnable' @ [109:51] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SimpleFunctionDescriptorImpl]

'g' @ [109:62] ==> value-parameter g: SettableFuture<Boolean> defined in net.corda.node.utilities.makeStrandFriendlySettableFuture.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [109:64] ==> public open fun set(p0: (Boolean..Boolean?)): Boolean defined in co.paralleluniverse.strands.SettableFuture[JavaMethodDescriptor]

'Executor' @ [109:77] ==> public fun Executor(function: ((Runnable..Runnable?)) -> Unit): Executor defined in java.util.concurrent[SimpleFunctionDescriptorImpl]

'it' @ [109:88] ==> value-parameter it: (Runnable..Runnable?) defined in net.corda.node.utilities.makeStrandFriendlySettableFuture.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'run' @ [109:91] ==> public abstract fun run(): Unit defined in java.lang.Runnable[JavaMethodDescriptor]

'future' @ [110:34] ==> value-parameter future: Future<T> defined in net.corda.node.utilities.makeStrandFriendlySettableFuture[ValueParameterDescriptorImpl]

'whenComplete' @ [110:41] ==> public final fun whenComplete(p0: (((Nothing..Nothing?), (Throwable..Throwable?)) -> Unit..(((Nothing..Nothing?), (Throwable..Throwable?)) -> Unit)?)): (CompletionStage<out (Any..Any?)>..CompletionStage<out (Any..Any?)>?) defined in java.util.concurrent.CompletionStage[MyFunctionDescriptor]

'g' @ [110:64] ==> value-parameter g: SettableFuture<Boolean> defined in net.corda.node.utilities.makeStrandFriendlySettableFuture.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [110:66] ==> public open fun set(p0: (Boolean..Boolean?)): Boolean defined in co.paralleluniverse.strands.SettableFuture[JavaMethodDescriptor]

'IllegalArgumentException' @ [111:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'future' @ [111:69] ==> value-parameter future: Future<T> defined in net.corda.node.utilities.makeStrandFriendlySettableFuture[ValueParameterDescriptorImpl]

