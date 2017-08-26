'ReentrantReadWriteLock' @ [13:24] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'initial' @ [14:25] ==> value-parameter initial: S defined in net.corda.core.internal.LifeCycle.<init>[ValueParameterDescriptorImpl]

'requireState' @ [18:9] ==> public final fun requireState(errorMessage: (S) -> String = ..., predicate: (S) -> Boolean): Unit defined in net.corda.core.internal.LifeCycle[SimpleFunctionDescriptorImpl]

'requiredState' @ [18:47] ==> value-parameter requiredState: S defined in net.corda.core.internal.LifeCycle.requireState[ValueParameterDescriptorImpl]

'it' @ [18:67] ==> value-parameter it: S defined in net.corda.core.internal.LifeCycle.requireState.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [18:76] ==> value-parameter it: S defined in net.corda.core.internal.LifeCycle.requireState.<anonymous>[ValueParameterDescriptorImpl]

'requiredState' @ [18:82] ==> value-parameter requiredState: S defined in net.corda.core.internal.LifeCycle.requireState[ValueParameterDescriptorImpl]

'it' @ [23:73] ==> value-parameter it: S defined in net.corda.core.internal.LifeCycle.requireState.<anonymous>[ValueParameterDescriptorImpl]

'lock' @ [26:9] ==> private final val lock: ReentrantReadWriteLock defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'readLock' @ [26:14] ==> public open fun readLock(): (ReentrantReadWriteLock.ReadLock..ReentrantReadWriteLock.ReadLock?) defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaMethodDescriptor]

'withLock' @ [26:25] ==> @InlineOnly public inline fun <T> Lock.withLock(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'require' @ [27:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'invoke' @ [27:21] ==> public abstract operator fun invoke(p1: S): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'state' @ [27:31] ==> private final var state: S defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'invoke' @ [27:41] ==> public abstract operator fun invoke(p1: S): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'state' @ [27:54] ==> private final var state: S defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'lock' @ [33:9] ==> private final val lock: ReentrantReadWriteLock defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'writeLock' @ [33:14] ==> public open fun writeLock(): (ReentrantReadWriteLock.WriteLock..ReentrantReadWriteLock.WriteLock?) defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaMethodDescriptor]

'withLock' @ [33:26] ==> @InlineOnly public inline fun <T> Lock.withLock(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'require' @ [34:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'state' @ [34:21] ==> private final var state: S defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'from' @ [34:30] ==> value-parameter from: S defined in net.corda.core.internal.LifeCycle.transition[ValueParameterDescriptorImpl]

'from' @ [34:61] ==> value-parameter from: S defined in net.corda.core.internal.LifeCycle.transition[ValueParameterDescriptorImpl]

'to' @ [34:84] ==> value-parameter to: S defined in net.corda.core.internal.LifeCycle.transition[ValueParameterDescriptorImpl]

'state' @ [34:93] ==> private final var state: S defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'state' @ [35:13] ==> private final var state: S defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'to' @ [35:21] ==> value-parameter to: S defined in net.corda.core.internal.LifeCycle.transition[ValueParameterDescriptorImpl]

'lock' @ [41:9] ==> private final val lock: ReentrantReadWriteLock defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'writeLock' @ [41:14] ==> public open fun writeLock(): (ReentrantReadWriteLock.WriteLock..ReentrantReadWriteLock.WriteLock?) defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaMethodDescriptor]

'withLock' @ [41:26] ==> @InlineOnly public inline fun <T> Lock.withLock(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'state' @ [42:13] ==> private final var state: S defined in net.corda.core.internal.LifeCycle[PropertyDescriptorImpl]

'to' @ [42:21] ==> value-parameter to: S defined in net.corda.core.internal.LifeCycle.justTransition[ValueParameterDescriptorImpl]

