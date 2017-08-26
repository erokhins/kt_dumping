'!' @ [23:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOnThread' @ [23:14] ==> public abstract val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor[PropertyDescriptorImpl]

'IllegalStateException' @ [24:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [24:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'currentThread' @ [24:70] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'if (isOnThread)
            runnable()
        else
            execute(runnable)' @ [29:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isOnThread' @ [29:13] ==> public abstract val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor[PropertyDescriptorImpl]

'invoke' @ [30:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'execute' @ [32:13] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor[MyFunctionDescriptor]

'runnable' @ [32:21] ==> value-parameter runnable: () -> Unit defined in net.corda.node.utilities.AffinityExecutor.executeASAP[ValueParameterDescriptorImpl]

'if (isOnThread)
            return fetcher()
        else
            return CompletableFuture.supplyAsync(Supplier { fetcher() }, this).get()' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'isOnThread' @ [41:13] ==> public abstract val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor[PropertyDescriptorImpl]

'invoke' @ [42:20] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'supplyAsync' @ [44:38] ==> public open fun <U : (Any..Any?)> supplyAsync(p0: (Supplier<(T..T?)>..Supplier<(T..T?)>?), p1: (Executor..Executor?)): (CompletableFuture<(T..T?)>..CompletableFuture<(T..T?)>?) defined in java.util.concurrent.CompletableFuture[JavaMethodDescriptor]
Inferred types:
    <U : (Any..Any?)> -> T

'Supplier' @ [44:50] ==> @FunctionalInterface public fun <T : (Any..Any?)> Supplier(function: () -> T): Supplier<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [44:61] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'this' @ [44:74] ==> <this> defined in net.corda.node.utilities.AffinityExecutor[LazyClassReceiverParameterDescriptor]

'get' @ [44:80] ==> public open fun get(): (T..T?) defined in java.util.concurrent.CompletableFuture[JavaMethodDescriptor]

'ScheduledThreadPoolExecutor' @ [57:13] ==> public constructor ScheduledThreadPoolExecutor(p0: Int) defined in java.util.concurrent.ScheduledThreadPoolExecutor[JavaClassConstructorDescriptor]

'numThreads' @ [57:41] ==> value-parameter numThreads: Int defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>[ValueParameterDescriptorImpl]

'loggerFor' @ [59:26] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ServiceAffinityExecutor

'synchronizedSet' @ [62:43] ==> public open fun <T : (Any..Any?)> synchronizedSet(p0: (MutableSet<(Thread..Thread?)>..Set<(Thread..Thread?)>?)): (MutableSet<(Thread..Thread?)>..Set<(Thread..Thread?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Thread

'HashSet' @ [62:59] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Thread

'setThreadFactory' @ [65:13] ==> public final fun setThreadFactory(p0: (((Runnable..Runnable?)) -> (Thread..Thread?)..(((Runnable..Runnable?)) -> (Thread..Thread?))?)): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'Thread' @ [66:39] ==> public constructor Thread() defined in java.lang.Thread[JavaClassConstructorDescriptor]

'runnable' @ [69:29] ==> value-parameter runnable: Runnable defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>.<no name provided>[ValueParameterDescriptorImpl]

'run' @ [69:38] ==> public abstract fun run(): Unit defined in java.lang.Runnable[JavaMethodDescriptor]

'threads' @ [71:29] ==> private final val threads: (MutableSet<(Thread..Thread?)>..Set<(Thread..Thread?)>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[PropertyDescriptorImpl]

'this' @ [71:40] ==> <this> defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>.<no name provided>.<no name provided>[LazyClassReceiverParameterDescriptor]

'thread' @ [75:17] ==> val thread: <no name provided> defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>.<no name provided>[LocalVariableDescriptor]

'isDaemon' @ [75:24] ==> public final var <no name provided>.isDaemon: Boolean[MyPropertyDescriptor]

'thread' @ [76:17] ==> val thread: <no name provided> defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>.<no name provided>[LocalVariableDescriptor]

'name' @ [76:24] ==> public final var <no name provided>.name: (String..String?)[MyPropertyDescriptor]

'threadName' @ [76:31] ==> value-parameter threadName: String defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>[ValueParameterDescriptorImpl]

'threads' @ [77:17] ==> private final val threads: (MutableSet<(Thread..Thread?)>..Set<(Thread..Thread?)>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[PropertyDescriptorImpl]

'thread' @ [77:28] ==> val thread: <no name provided> defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>.<no name provided>[LocalVariableDescriptor]

'thread' @ [78:24] ==> val thread: <no name provided> defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.<init>.<no name provided>[LocalVariableDescriptor]

'in' @ [82:50] ==> public abstract fun contains(element: (Thread..Thread?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'currentThread' @ [82:57] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'threads' @ [82:76] ==> private final val threads: (MutableSet<(Thread..Thread?)>..Set<(Thread..Thread?)>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[PropertyDescriptorImpl]

'create' @ [86:40] ==> public open fun <V : (Any..Any?)> create(): (SettableFuture<(Boolean..Boolean?)>..SettableFuture<(Boolean..Boolean?)>?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Boolean

'execute' @ [87:17] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'f' @ [87:27] ==> val f: (SettableFuture<(Boolean..Boolean?)>..SettableFuture<(Boolean..Boolean?)>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.flush[LocalVariableDescriptor]

'set' @ [87:29] ==> @CanIgnoreReturnValue public open fun set(@Nullable p0: Boolean?): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'queue' @ [87:33] ==> public final val AffinityExecutor.ServiceAffinityExecutor.queue: (BlockingQueue<(Runnable..Runnable?)>..BlockingQueue<(Runnable..Runnable?)>?)[MyPropertyDescriptor]

'isEmpty' @ [87:39] ==> public abstract fun isEmpty(): Boolean defined in java.util.concurrent.BlockingQueue[DeserializedSimpleFunctionDescriptor]

'activeCount' @ [87:52] ==> public final val AffinityExecutor.ServiceAffinityExecutor.activeCount: Int[MyPropertyDescriptor]

'!' @ [88:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'f' @ [88:23] ==> val f: (SettableFuture<(Boolean..Boolean?)>..SettableFuture<(Boolean..Boolean?)>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor.flush[LocalVariableDescriptor]

'get' @ [88:25] ==> @CanIgnoreReturnValue public final fun get(): (Boolean..Boolean?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'currentThread' @ [99:41] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'LinkedBlockingQueue' @ [100:32] ==> public constructor LinkedBlockingQueue<E : (Any..Any?)>() defined in java.util.concurrent.LinkedBlockingQueue[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Runnable

'!' @ [103:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'alwaysQueue' @ [103:22] ==> private final val alwaysQueue: Boolean defined in net.corda.node.utilities.AffinityExecutor.Gate[PropertyDescriptorImpl]

'currentThread' @ [103:44] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'thisThread' @ [103:64] ==> private final val thisThread: (Thread..Thread?) defined in net.corda.node.utilities.AffinityExecutor.Gate[PropertyDescriptorImpl]

'putUninterruptibly' @ [106:30] ==> @GwtIncompatible public open fun <E : (Any..Any?)> putUninterruptibly(p0: (BlockingQueue<(Runnable..Runnable?)>..BlockingQueue<(Runnable..Runnable?)>?), p1: (Runnable..Runnable?)): Unit defined in com.google.common.util.concurrent.Uninterruptibles[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Runnable

'commandQ' @ [106:49] ==> private final val commandQ: LinkedBlockingQueue<Runnable> defined in net.corda.node.utilities.AffinityExecutor.Gate[PropertyDescriptorImpl]

'command' @ [106:59] ==> value-parameter command: Runnable defined in net.corda.node.utilities.AffinityExecutor.Gate.execute[ValueParameterDescriptorImpl]

'takeUninterruptibly' @ [110:45] ==> @GwtIncompatible public open fun <E : (Any..Any?)> takeUninterruptibly(p0: (BlockingQueue<(Runnable..Runnable?)>..BlockingQueue<(Runnable..Runnable?)>?)): (Runnable..Runnable?) defined in com.google.common.util.concurrent.Uninterruptibles[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Runnable

'commandQ' @ [110:65] ==> private final val commandQ: LinkedBlockingQueue<Runnable> defined in net.corda.node.utilities.AffinityExecutor.Gate[PropertyDescriptorImpl]

'runnable' @ [111:13] ==> val runnable: (Runnable..Runnable?) defined in net.corda.node.utilities.AffinityExecutor.Gate.waitAndRun[LocalVariableDescriptor]

'run' @ [111:22] ==> public abstract fun run(): Unit defined in java.lang.Runnable[JavaMethodDescriptor]

'UnsupportedOperationException' @ [115:19] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

