'ConcurrentLinkedQueue' @ [23:29] ==> public constructor ConcurrentLinkedQueue<E : (Any..Any?)>() defined in java.util.concurrent.ConcurrentLinkedQueue[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'Semaphore' @ [24:33] ==> public constructor Semaphore(p0: Int) defined in java.util.concurrent.Semaphore[JavaClassConstructorDescriptor]

'bound' @ [24:43] ==> private final val bound: Int? defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'MAX_VALUE' @ [24:56] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'LifeCycle' @ [30:29] ==> public constructor LifeCycle<S : Enum<LazyPool.State>>(initial: LazyPool.State) defined in net.corda.core.internal.LifeCycle[ClassConstructorDescriptorImpl]
Inferred types:
    <S : Enum<S>> -> State

'STARTED' @ [30:45] ==> enum entry STARTED defined in net.corda.core.internal.LazyPool.State[FakeCallableDescriptorForObject]

'clear' @ [33:9] ==> private final val clear: ((A) -> Unit)? defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'invoke' @ [33:16] ==> public abstract operator fun invoke(p1: A): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'instance' @ [33:23] ==> value-parameter instance: A defined in net.corda.core.internal.LazyPool.clearIfNeeded[ValueParameterDescriptorImpl]

'instance' @ [34:16] ==> value-parameter instance: A defined in net.corda.core.internal.LazyPool.clearIfNeeded[ValueParameterDescriptorImpl]

'lifeCycle' @ [38:9] ==> private final val lifeCycle: LifeCycle<LazyPool.State> defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'requireState' @ [38:19] ==> public final fun requireState(requiredState: LazyPool.State): Unit defined in net.corda.core.internal.LifeCycle[SimpleFunctionDescriptorImpl]

'STARTED' @ [38:38] ==> enum entry STARTED defined in net.corda.core.internal.LazyPool.State[FakeCallableDescriptorForObject]

'poolSemaphore' @ [39:9] ==> private final val poolSemaphore: Semaphore defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'acquire' @ [39:23] ==> public open fun acquire(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'poolQueue' @ [40:22] ==> private final val poolQueue: ConcurrentLinkedQueue<A> defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'poll' @ [40:32] ==> public open fun poll(): (A..A?) defined in java.util.concurrent.ConcurrentLinkedQueue[JavaMethodDescriptor]

'if (pooled == null) {
            return newInstance()
        } else {
            return clearIfNeeded(pooled)
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'pooled' @ [41:13] ==> val pooled: (A..A?) defined in net.corda.core.internal.LazyPool.borrow[LocalVariableDescriptor]

'invoke' @ [42:20] ==> public abstract operator fun invoke(): A defined in kotlin.Function0[FunctionInvokeDescriptor]

'clearIfNeeded' @ [44:20] ==> private final fun clearIfNeeded(instance: A): A defined in net.corda.core.internal.LazyPool[SimpleFunctionDescriptorImpl]

'pooled' @ [44:34] ==> val pooled: (A..A?) defined in net.corda.core.internal.LazyPool.borrow[LocalVariableDescriptor]

'lifeCycle' @ [49:9] ==> private final val lifeCycle: LifeCycle<LazyPool.State> defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'requireState' @ [49:19] ==> public final fun requireState(requiredState: LazyPool.State): Unit defined in net.corda.core.internal.LifeCycle[SimpleFunctionDescriptorImpl]

'STARTED' @ [49:38] ==> enum entry STARTED defined in net.corda.core.internal.LazyPool.State[FakeCallableDescriptorForObject]

'shouldReturnToPool' @ [50:13] ==> private final val shouldReturnToPool: ((A) -> Boolean)? defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'shouldReturnToPool' @ [50:43] ==> private final val shouldReturnToPool: ((A) -> Boolean)? defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'invoke' @ [50:62] ==> public abstract operator fun invoke(p1: A): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'instance' @ [50:69] ==> value-parameter instance: A defined in net.corda.core.internal.LazyPool.release[ValueParameterDescriptorImpl]

'poolQueue' @ [51:13] ==> private final val poolQueue: ConcurrentLinkedQueue<A> defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'add' @ [51:23] ==> public open fun add(element: (A..A?)): Boolean defined in java.util.concurrent.ConcurrentLinkedQueue[JavaMethodDescriptor]

'instance' @ [51:27] ==> value-parameter instance: A defined in net.corda.core.internal.LazyPool.release[ValueParameterDescriptorImpl]

'poolSemaphore' @ [53:9] ==> private final val poolSemaphore: Semaphore defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'release' @ [53:23] ==> public open fun release(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'lifeCycle' @ [61:9] ==> private final val lifeCycle: LifeCycle<LazyPool.State> defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'justTransition' @ [61:19] ==> public final fun justTransition(to: LazyPool.State): Unit defined in net.corda.core.internal.LifeCycle[SimpleFunctionDescriptorImpl]

'FINISHED' @ [61:40] ==> enum entry FINISHED defined in net.corda.core.internal.LazyPool.State[FakeCallableDescriptorForObject]

'poolQueue' @ [62:24] ==> private final val poolQueue: ConcurrentLinkedQueue<A> defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'toList' @ [62:34] ==> public fun <T> Iterable<(A..A?)>.toList(): List<(A..A?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)

'poolQueue' @ [63:9] ==> private final val poolQueue: ConcurrentLinkedQueue<A> defined in net.corda.core.internal.LazyPool[PropertyDescriptorImpl]

'clear' @ [63:19] ==> public open fun clear(): Unit defined in java.util.concurrent.ConcurrentLinkedQueue[JavaMethodDescriptor]

'elements' @ [64:16] ==> val elements: List<(A..A?)> defined in net.corda.core.internal.LazyPool.close[LocalVariableDescriptor]

'borrow' @ [68:24] ==> public final fun borrow(): A defined in net.corda.core.internal.LazyPool[SimpleFunctionDescriptorImpl]

'invoke' @ [70:20] ==> public abstract operator fun invoke(p1: A): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'instance' @ [70:33] ==> val instance: A defined in net.corda.core.internal.LazyPool.run[LocalVariableDescriptor]

'release' @ [72:13] ==> public final fun release(instance: A): Unit defined in net.corda.core.internal.LazyPool[SimpleFunctionDescriptorImpl]

'instance' @ [72:21] ==> val instance: A defined in net.corda.core.internal.LazyPool.run[LocalVariableDescriptor]

