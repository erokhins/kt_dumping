'AbstractList<ReplHistoryRecord<Unit>>' @ [26:109] ==> protected constructor AbstractList<out E>() defined in kotlin.collections.AbstractList[DeserializedClassConstructorDescriptor]
Inferred types:
    <out E> -> ReplHistoryRecord<Unit>

'state' @ [28:17] ==> private final val state: RemoteReplCompilerState defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'replStateFacade' @ [28:23] ==> internal final val replStateFacade: ReplStateFacade defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'getHistorySize' @ [28:39] ==> public abstract fun getHistorySize(): Int defined in org.jetbrains.kotlin.daemon.common.ReplStateFacade[DeserializedSimpleFunctionDescriptor]

'ReplHistoryRecord' @ [30:61] ==> public constructor ReplHistoryRecord<out T>(id: ILineId, item: Unit) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'state' @ [30:79] ==> private final val state: RemoteReplCompilerState defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'replStateFacade' @ [30:85] ==> internal final val replStateFacade: ReplStateFacade defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'historyGet' @ [30:101] ==> public abstract fun historyGet(index: Int): ILineId defined in org.jetbrains.kotlin.daemon.common.ReplStateFacade[DeserializedSimpleFunctionDescriptor]

'index' @ [30:112] ==> value-parameter index: Int defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory.get[ValueParameterDescriptorImpl]

'Unit' @ [30:120] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'NotImplementedError' @ [33:15] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'NotImplementedError' @ [37:15] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'state' @ [40:47] ==> private final val state: RemoteReplCompilerState defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'replStateFacade' @ [40:53] ==> internal final val replStateFacade: ReplStateFacade defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'historyReset' @ [40:69] ==> public abstract fun historyReset(): List<ILineId> defined in org.jetbrains.kotlin.daemon.common.ReplStateFacade[DeserializedSimpleFunctionDescriptor]

'apply' @ [40:84] ==> @InlineOnly public inline fun <T> List<ILineId>.apply(block: List<ILineId>.() -> Unit): List<ILineId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<ILineId>

'currentGeneration' @ [41:9] ==> public final val currentGeneration: AtomicInteger defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'incrementAndGet' @ [41:27] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'state' @ [44:60] ==> private final val state: RemoteReplCompilerState defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'replStateFacade' @ [44:66] ==> internal final val replStateFacade: ReplStateFacade defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'historyResetTo' @ [44:82] ==> public abstract fun historyResetTo(id: ILineId): List<ILineId> defined in org.jetbrains.kotlin.daemon.common.ReplStateFacade[DeserializedSimpleFunctionDescriptor]

'id' @ [44:97] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory.resetTo[ValueParameterDescriptorImpl]

'apply' @ [44:101] ==> @InlineOnly public inline fun <T> List<ILineId>.apply(block: List<ILineId>.() -> Unit): List<ILineId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<ILineId>

'currentGeneration' @ [45:9] ==> public final val currentGeneration: AtomicInteger defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'incrementAndGet' @ [45:27] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'AtomicInteger' @ [48:29] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'REPL_CODE_LINE_FIRST_GEN' @ [48:43] ==> public const val REPL_CODE_LINE_FIRST_GEN: Int defined in org.jetbrains.kotlin.cli.common.repl[DeserializedPropertyDescriptor]

'state' @ [50:55] ==> private final val state: RemoteReplCompilerState defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'lock' @ [50:61] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'ReentrantReadWriteLock' @ [53:122] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'history' @ [55:50] ==> public open val history: IReplStageHistory<Unit> defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[PropertyDescriptorImpl]

'currentGeneration' @ [55:93] ==> public final val currentGeneration: AtomicInteger defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[PropertyDescriptorImpl]

'get' @ [55:111] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'RemoteReplCompilerStateHistory' @ [57:53] ==> public constructor RemoteReplCompilerStateHistory(state: RemoteReplCompilerState) defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerStateHistory[ClassConstructorDescriptorImpl]

'this' @ [57:84] ==> <this> defined in org.jetbrains.kotlin.daemon.client.RemoteReplCompilerState[LazyClassReceiverParameterDescriptor]

